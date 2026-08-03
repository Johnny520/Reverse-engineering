package ba;

import p003a2.C0014a;
import p136j8.AbstractC2091b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'm' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ba.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0234n {

    /* JADX INFO: renamed from: l */
    public static final C0014a f608l;

    /* JADX INFO: renamed from: m */
    public static final EnumC0234n f609m;

    /* JADX INFO: renamed from: n */
    public static final EnumC0234n f610n;

    /* JADX INFO: renamed from: o */
    public static final EnumC0234n f611o;

    /* JADX INFO: renamed from: p */
    public static final EnumC0234n f612p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ EnumC0234n[] f613q;

    /* JADX INFO: renamed from: g */
    public final String f614g;

    /* JADX INFO: renamed from: h */
    public final String f615h;

    /* JADX INFO: renamed from: i */
    public final EnumC0221a f616i;

    /* JADX INFO: renamed from: j */
    public final boolean f617j;

    /* JADX INFO: renamed from: k */
    public final boolean f618k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0221a enumC0221a = EnumC0221a.GENERAL;
        EnumC0234n enumC0234n = new EnumC0234n("LEFT_LIGHT", 0, "left_light.image", "左侧浅色气泡", enumC0221a, false, false);
        f609m = enumC0234n;
        EnumC0234n enumC0234n2 = new EnumC0234n("RIGHT_LIGHT", 1, "right_light.image", "右侧浅色气泡", enumC0221a, true, false);
        f610n = enumC0234n2;
        EnumC0234n enumC0234n3 = new EnumC0234n("LEFT_DARK", 2, "left_dark.image", "左侧深色气泡", enumC0221a, false, true);
        f611o = enumC0234n3;
        EnumC0234n enumC0234n4 = new EnumC0234n("RIGHT_DARK", 3, "right_dark.image", "右侧深色气泡", enumC0221a, true, true);
        f612p = enumC0234n4;
        EnumC0221a enumC0221a2 = EnumC0221a.RED_PACKET;
        EnumC0234n enumC0234n5 = new EnumC0234n("RED_PACKET_LEFT_LIGHT", 4, "red_packet_left_light.image", "红包左侧浅色气泡", enumC0221a2, false, false);
        EnumC0234n enumC0234n6 = new EnumC0234n("RED_PACKET_RIGHT_LIGHT", 5, "red_packet_right_light.image", "红包右侧浅色气泡", enumC0221a2, true, false);
        EnumC0234n enumC0234n7 = new EnumC0234n("RED_PACKET_LEFT_DARK", 6, "red_packet_left_dark.image", "红包左侧深色气泡", enumC0221a2, false, true);
        EnumC0234n enumC0234n8 = new EnumC0234n("RED_PACKET_RIGHT_DARK", 7, "red_packet_right_dark.image", "红包右侧深色气泡", enumC0221a2, true, true);
        EnumC0221a enumC0221a3 = EnumC0221a.TRANSFER;
        EnumC0234n enumC0234n9 = new EnumC0234n("TRANSFER_LEFT_LIGHT", 8, "transfer_left_light.image", "转账左侧浅色气泡", enumC0221a3, false, false);
        EnumC0234n enumC0234n10 = new EnumC0234n("TRANSFER_RIGHT_LIGHT", 9, "transfer_right_light.image", "转账右侧浅色气泡", enumC0221a3, true, false);
        EnumC0234n enumC0234n11 = new EnumC0234n("TRANSFER_LEFT_DARK", 10, "transfer_left_dark.image", "转账左侧深色气泡", enumC0221a3, false, true);
        EnumC0234n enumC0234n12 = new EnumC0234n("TRANSFER_RIGHT_DARK", 11, "transfer_right_dark.image", "转账右侧深色气泡", enumC0221a3, true, true);
        EnumC0221a enumC0221a4 = EnumC0221a.SYSTEM;
        f613q = new EnumC0234n[]{enumC0234n, enumC0234n2, enumC0234n3, enumC0234n4, enumC0234n5, enumC0234n6, enumC0234n7, enumC0234n8, enumC0234n9, enumC0234n10, enumC0234n11, enumC0234n12, new EnumC0234n("SYSTEM_LIGHT", 12, "system_light.image", "系统消息浅色气泡", enumC0221a4, false, false), new EnumC0234n("SYSTEM_DARK", 13, "system_dark.image", "系统消息深色气泡", enumC0221a4, false, true)};
        f608l = new C0014a(5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EnumC0234n(String str, int i9, String str2, String str3, EnumC0221a enumC0221a, boolean z9, boolean z10) {
        this.f614g = str2;
        this.f615h = str3;
        this.f616i = enumC0221a;
        this.f617j = z9;
        this.f618k = z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0234n valueOf(String str) {
        return (EnumC0234n) AbstractC2091b.m5160g(EnumC0234n.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0234n[] values() {
        return (EnumC0234n[]) f613q.clone();
    }
}
