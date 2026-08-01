package androidx.compose.foundation.layout;

import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.C2964;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.platform.AbstractC2744;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1460 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C1464 f2066;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1464 f2067;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1437 f2068;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1437 f2070 = new C1437(Direction.Horizontal, 1.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1437 f2069 = new C1437(Direction.Vertical, 1.0f);

    static {
        Direction direction = Direction.Both;
        f2068 = new C1437(direction, 1.0f);
        C2964 c2964 = C2952.f6609;
        f2067 = new C1464(direction, new C1481(c2964, 1), c2964);
        C2964 c29642 = C2952.f6617;
        f2066 = new C1464(direction, new C1481(c29642, 1), c29642);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC2962 m1939(InterfaceC2962 interfaceC2962, float f) {
        int i = AbstractC2744.f5973;
        return interfaceC2962.mo4426(new C1456(f, f, f, f, true));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static InterfaceC2962 m1940(InterfaceC2962 interfaceC2962, float f, float f2, float f3, float f4, int i) {
        float f5 = (i & 2) != 0 ? Float.NaN : f2;
        float f6 = (i & 4) != 0 ? Float.NaN : f3;
        float f7 = (i & 8) != 0 ? Float.NaN : f4;
        int i2 = AbstractC2744.f5973;
        return interfaceC2962.mo4426(new C1456(f, f5, f6, f7, false));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC2962 m1941(InterfaceC2962 interfaceC2962, float f, float f2) {
        int i = AbstractC2744.f5973;
        return interfaceC2962.mo4426(new C1456(f, f2, f, f2, false));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static InterfaceC2962 m1942(InterfaceC2962 interfaceC2962, float f, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        float f2 = (i & 2) == 0 ? 300.0f : Float.NaN;
        int i2 = AbstractC2744.f5973;
        return interfaceC2962.mo4426(new C1456(f, f2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC2962 m1943(InterfaceC2962 interfaceC2962, float f) {
        int i = AbstractC2744.f5973;
        return interfaceC2962.mo4426(new C1456(f, f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC2962 m1944(InterfaceC2962 interfaceC2962, float f) {
        return interfaceC2962.mo4426(f == 1.0f ? f2070 : new C1437(Direction.Horizontal, f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final InterfaceC2962 m1945(InterfaceC2962 interfaceC2962) {
        int i = AbstractC2744.f5973;
        return interfaceC2962.mo4426(new C1456(112.0f, 48.0f, 280.0f, 48.0f, true));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final InterfaceC2962 m1946(InterfaceC2962 interfaceC2962, float f, float f2) {
        int i = AbstractC2744.f5973;
        return interfaceC2962.mo4426(new C1456(f, f2, f, f2, true));
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
    public static InterfaceC2962 m1947(InterfaceC2962 interfaceC2962) {
        C2964 c2964 = C2952.f6609;
        return interfaceC2962.mo4426(c2964.equals(c2964) ? f2067 : c2964.equals(C2952.f6617) ? f2066 : new C1464(Direction.Both, new C1481(c2964, 1), c2964));
    }
}
