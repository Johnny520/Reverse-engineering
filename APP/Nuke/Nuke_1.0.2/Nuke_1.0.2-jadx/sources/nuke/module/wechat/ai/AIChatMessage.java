package nuke.module.wechat.ai;

import defpackage.g1;
import defpackage.t11;
import defpackage.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
public final class AIChatMessage {
    public static final int $stable = 0;
    private final String content;
    private final g1 role;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AIChatMessage(g1 g1Var, String str) {
        g1Var.getClass();
        str.getClass();
        this.role = g1Var;
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ AIChatMessage copy$default(AIChatMessage aIChatMessage, g1 g1Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            g1Var = aIChatMessage.role;
        }
        if ((i & 2) != 0) {
            str = aIChatMessage.content;
        }
        return aIChatMessage.copy(g1Var, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final g1 component1() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AIChatMessage copy(g1 g1Var, String str) {
        g1Var.getClass();
        str.getClass();
        return new AIChatMessage(g1Var, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatMessage)) {
            return false;
        }
        AIChatMessage aIChatMessage = (AIChatMessage) obj;
        return this.role == aIChatMessage.role && t11.l(this.content, aIChatMessage.content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final g1 getRole() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.content.hashCode() + (this.role.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "AIChatMessage(role=" + this.role + ", content=" + this.content + ")";
    }
}
