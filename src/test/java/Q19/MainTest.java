package Q19;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    class Course {
        Course c1;
        Course c2;

        public Course(String introduction_to_javascript) {
        }


        @BeforeEach
        void setUp() {
            c1=new Course("Introduction to Javascript");
            c2=new Course("Introduction to Javascript");
        }
        @Test
        void test1() {
            assertEquals(c1,c2);
        }


        @Test
        void test3() {
            Course c3=c1;
            assertEquals(c1,c3);
        }

        @Test
        void test2() {
            c1.setName("xxx");
            assertNotEquals(c1,c2);
        }

        private void setName(String xxx) {
        }


    }
}