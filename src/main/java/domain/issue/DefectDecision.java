package domain.issue;

import domain.Decision;

/**
 * User: oleg
 * Date: 12.01.14
 * Time: 13:32
 */
public enum DefectDecision implements Decision {

    UNRESOLVED, ASSIGNED, FIXED, REJECTED, CLOSED

}
