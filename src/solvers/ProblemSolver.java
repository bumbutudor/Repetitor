package solvers;

import models.Problem;
import models.Solution;

public interface ProblemSolver {
    Solution solve(Problem problem);
}
