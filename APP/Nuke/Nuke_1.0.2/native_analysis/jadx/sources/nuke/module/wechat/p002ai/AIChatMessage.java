package nuke.module.wechat.p002ai;

import p000.EnumC0224g1;
import p000.t11;
import p000.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
public final class AIChatMessage {
    public static final int $stable = 0;
    private final String content;
    private final EnumC0224g1 role;

    public AIChatMessage(EnumC0224g1 enumC0224g1, String str) {
        enumC0224g1.getClass();
        str.getClass();
        this.role = enumC0224g1;
        this.content = str;
    }

    public static /* synthetic */ AIChatMessage copy$default(AIChatMessage aIChatMessage, EnumC0224g1 enumC0224g1, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC0224g1 = aIChatMessage.role;
        }
        if ((i & 2) != 0) {
            str = aIChatMessage.content;
        }
        return aIChatMessage.copy(enumC0224g1, str);
    }

    public final EnumC0224g1 component1() {
        return this.role;
    }

    public final String component2() {
        return this.content;
    }

    public final AIChatMessage copy(EnumC0224g1 enumC0224g1, String str) {
        enumC0224g1.getClass();
        str.getClass();
        return new AIChatMessage(enumC0224g1, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatMessage)) {
            return false;
        }
        AIChatMessage aIChatMessage = (AIChatMessage) obj;
        return this.role == aIChatMessage.role && t11.m5086l(this.content, aIChatMessage.content);
    }

    public final String getContent() {
        return this.content;
    }

    public final EnumC0224g1 getRole() {
        return this.role;
    }

    public int hashCode() {
        return this.content.hashCode() + (this.role.hashCode() * 31);
    }

    public String toString() {
        return "AIChatMessage(role=" + this.role + ", content=" + this.content + ")";
    }
}
