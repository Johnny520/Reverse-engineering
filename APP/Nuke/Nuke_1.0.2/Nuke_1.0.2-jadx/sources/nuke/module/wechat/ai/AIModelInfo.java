package nuke.module.wechat.ai;

import defpackage.t11;
import defpackage.vi0;
import defpackage.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
public final class AIModelInfo {
    public static final int $stable = 0;
    private final String id;
    private final String ownedBy;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AIModelInfo(String str, String str2) {
        str.getClass();
        this.id = str;
        this.ownedBy = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ AIModelInfo copy$default(AIModelInfo aIModelInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aIModelInfo.id;
        }
        if ((i & 2) != 0) {
            str2 = aIModelInfo.ownedBy;
        }
        return aIModelInfo.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component2() {
        return this.ownedBy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AIModelInfo copy(String str, String str2) {
        str.getClass();
        return new AIModelInfo(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIModelInfo)) {
            return false;
        }
        AIModelInfo aIModelInfo = (AIModelInfo) obj;
        return t11.l(this.id, aIModelInfo.id) && t11.l(this.ownedBy, aIModelInfo.ownedBy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getOwnedBy() {
        return this.ownedBy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.ownedBy;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return vi0.k("AIModelInfo(id=", this.id, ", ownedBy=", this.ownedBy, ")");
    }
}
