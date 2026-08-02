package nuke.module.wechat.p002ai;

import p000.t11;
import p000.vi0;
import p000.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
public final class AIModelInfo {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: id */
    private final String f7332id;
    private final String ownedBy;

    public AIModelInfo(String str, String str2) {
        str.getClass();
        this.f7332id = str;
        this.ownedBy = str2;
    }

    public static /* synthetic */ AIModelInfo copy$default(AIModelInfo aIModelInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aIModelInfo.f7332id;
        }
        if ((i & 2) != 0) {
            str2 = aIModelInfo.ownedBy;
        }
        return aIModelInfo.copy(str, str2);
    }

    public final String component1() {
        return this.f7332id;
    }

    public final String component2() {
        return this.ownedBy;
    }

    public final AIModelInfo copy(String str, String str2) {
        str.getClass();
        return new AIModelInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIModelInfo)) {
            return false;
        }
        AIModelInfo aIModelInfo = (AIModelInfo) obj;
        return t11.m5086l(this.f7332id, aIModelInfo.f7332id) && t11.m5086l(this.ownedBy, aIModelInfo.ownedBy);
    }

    public final String getId() {
        return this.f7332id;
    }

    public final String getOwnedBy() {
        return this.ownedBy;
    }

    public int hashCode() {
        int iHashCode = this.f7332id.hashCode() * 31;
        String str = this.ownedBy;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return vi0.m5692k("AIModelInfo(id=", this.f7332id, ", ownedBy=", this.ownedBy, ")");
    }
}
