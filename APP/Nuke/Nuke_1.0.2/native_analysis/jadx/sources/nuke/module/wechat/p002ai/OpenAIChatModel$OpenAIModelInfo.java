package nuke.module.wechat.p002ai;

import p000.c50;
import p000.fp2;
import p000.t11;
import p000.vi0;
import p000.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
final class OpenAIChatModel$OpenAIModelInfo {

    /* JADX INFO: renamed from: id */
    private final String f7333id;

    @fp2("owned_by")
    private final String ownedBy;

    public /* synthetic */ OpenAIChatModel$OpenAIModelInfo(String str, String str2, int i, c50 c50Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ OpenAIChatModel$OpenAIModelInfo copy$default(OpenAIChatModel$OpenAIModelInfo openAIChatModel$OpenAIModelInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openAIChatModel$OpenAIModelInfo.f7333id;
        }
        if ((i & 2) != 0) {
            str2 = openAIChatModel$OpenAIModelInfo.ownedBy;
        }
        return openAIChatModel$OpenAIModelInfo.copy(str, str2);
    }

    public final String component1() {
        return this.f7333id;
    }

    public final String component2() {
        return this.ownedBy;
    }

    public final OpenAIChatModel$OpenAIModelInfo copy(String str, String str2) {
        return new OpenAIChatModel$OpenAIModelInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenAIChatModel$OpenAIModelInfo)) {
            return false;
        }
        OpenAIChatModel$OpenAIModelInfo openAIChatModel$OpenAIModelInfo = (OpenAIChatModel$OpenAIModelInfo) obj;
        return t11.m5086l(this.f7333id, openAIChatModel$OpenAIModelInfo.f7333id) && t11.m5086l(this.ownedBy, openAIChatModel$OpenAIModelInfo.ownedBy);
    }

    public final String getId() {
        return this.f7333id;
    }

    public final String getOwnedBy() {
        return this.ownedBy;
    }

    public int hashCode() {
        String str = this.f7333id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ownedBy;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return vi0.m5692k("OpenAIModelInfo(id=", this.f7333id, ", ownedBy=", this.ownedBy, ")");
    }

    public OpenAIChatModel$OpenAIModelInfo(String str, String str2) {
        this.f7333id = str;
        this.ownedBy = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OpenAIChatModel$OpenAIModelInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
