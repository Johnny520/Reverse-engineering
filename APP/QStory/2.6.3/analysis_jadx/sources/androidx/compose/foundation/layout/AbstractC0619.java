package androidx.compose.foundation.layout;

import androidx.compose.ui.C2119;
import androidx.compose.ui.C2131;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.platform.AbstractC1909;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0619 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C0623 f1721;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C0623 f1722;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0596 f1723;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0596 f1725 = new C0596(Direction.Horizontal, 1.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0596 f1724 = new C0596(Direction.Vertical, 1.0f);

    static {
        Direction direction = Direction.Both;
        f1723 = new C0596(direction, 1.0f);
        C2131 c2131 = C2119.f6264;
        f1722 = new C0623(direction, new C0640(c2131, 1), c2131);
        C2131 c21312 = C2119.f6272;
        f1721 = new C0623(direction, new C0640(c21312, 1), c21312);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC2129 m1379(InterfaceC2129 interfaceC2129, float f) {
        int i = AbstractC1909.f5628;
        return interfaceC2129.mo3866(new C0615(f, f, f, f, true));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static InterfaceC2129 m1380(InterfaceC2129 interfaceC2129, float f, float f2, float f3, float f4, int i) {
        float f5 = (i & 2) != 0 ? Float.NaN : f2;
        float f6 = (i & 4) != 0 ? Float.NaN : f3;
        float f7 = (i & 8) != 0 ? Float.NaN : f4;
        int i2 = AbstractC1909.f5628;
        return interfaceC2129.mo3866(new C0615(f, f5, f6, f7, false));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC2129 m1381(InterfaceC2129 interfaceC2129, float f, float f2) {
        int i = AbstractC1909.f5628;
        return interfaceC2129.mo3866(new C0615(f, f2, f, f2, false));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static InterfaceC2129 m1382(InterfaceC2129 interfaceC2129, float f, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        float f2 = (i & 2) == 0 ? 300.0f : Float.NaN;
        int i2 = AbstractC1909.f5628;
        return interfaceC2129.mo3866(new C0615(f, f2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC2129 m1383(InterfaceC2129 interfaceC2129, float f) {
        int i = AbstractC1909.f5628;
        return interfaceC2129.mo3866(new C0615(f, f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC2129 m1384(InterfaceC2129 interfaceC2129, float f) {
        return interfaceC2129.mo3866(f == 1.0f ? f1725 : new C0596(Direction.Horizontal, f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final InterfaceC2129 m1385(InterfaceC2129 interfaceC2129) {
        int i = AbstractC1909.f5628;
        return interfaceC2129.mo3866(new C0615(112.0f, 48.0f, 280.0f, 48.0f, true));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final InterfaceC2129 m1386(InterfaceC2129 interfaceC2129, float f, float f2) {
        int i = AbstractC1909.f5628;
        return interfaceC2129.mo3866(new C0615(f, f2, f, f2, true));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static InterfaceC2129 m1387(InterfaceC2129 interfaceC2129) {
        C2131 c2131 = C2119.f6264;
        return interfaceC2129.mo3866(c2131.equals(c2131) ? f1722 : c2131.equals(C2119.f6272) ? f1721 : new C0623(Direction.Both, new C0640(c2131, 1), c2131));
    }
}
