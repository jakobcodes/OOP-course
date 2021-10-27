package agh.ics.oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OptionsParserTest {

    private OptionsParser parser;
    private String[] args1;
    private String[] args2;
    private String[] args3;
    private String[] args4;
    private List<MoveDirection> res1;
    private List<MoveDirection> res2;
    private List<MoveDirection> res3and4;

    @Test
    void parse() {
        assertEquals(res1,parser.parse(args1));
        assertEquals(res2,parser.parse(args2));
        assertEquals(res3and4,parser.parse(args3));
        assertEquals(res3and4,parser.parse(args4));
    }

    @BeforeEach
    void setUp() {
        parser = new OptionsParser();
        args1 = new String[]{"f", "r", "r", "l", "l", "b", "c"};
        args2 = new String[]{"f", "f", "b", "q", "w", "b", "a"};
        args3 = new String[]{"f", "b", "r", "l"};
        args4 = new String[]{"forward", "backward", "right", "left"};

        res1 = List.of(MoveDirection.FORWARD, MoveDirection.RIGHT, MoveDirection.RIGHT, MoveDirection.LEFT, MoveDirection.LEFT, MoveDirection.BACKWARD);
        res2 = List.of(MoveDirection.FORWARD, MoveDirection.FORWARD, MoveDirection.BACKWARD, MoveDirection.BACKWARD);
        res3and4 = List.of(MoveDirection.FORWARD, MoveDirection.BACKWARD, MoveDirection.RIGHT, MoveDirection.LEFT);

    }
}