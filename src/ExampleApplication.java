

import com.bala.conditional.ConditionalStatements;
import com.bala.loops.Loops;
import com.bala.math.Add2Numbers;

public class ExampleApplication {

    public static void main(String[] args) {
        Add2Numbers add2Numbers = new Add2Numbers();
        add2Numbers.Add2Numbers();

        Loops loops = new Loops();
        loops.forLoop();
        loops.whileLoop();
        loops.doWhileLoop();
        loops.foreachLoop();

        ConditionalStatements conditionalStatements = new ConditionalStatements();
        conditionalStatements.elseIf();
        conditionalStatements.ifElse();

 //       InfiniteLoops infiniteLoops = new InfiniteLoops();
 //       infiniteLoops.ForLoopInfinite();
 //       infiniteLoops.WhileLoopInfinite();

    }
}
