package androidx.compose.foundation.lazy;

import androidx.collection.AbstractC1120;
import androidx.collection.C1093;
import androidx.compose.foundation.lazy.layout.C1532;
import androidx.compose.p001ui.C2949;
import androidx.compose.p001ui.layout.InterfaceC2490;
import java.util.ArrayList;
import java.util.List;
import p221.AbstractC8726;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1595 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ int f2525;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C1532 f2526;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f2527;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1532 f2528;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1603 f2529;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1093 f2530;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ C2949 f2531;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f2532;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final /* synthetic */ long f2533;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final /* synthetic */ C1582 f2534;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ int f2535;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2536;

    public C1595(long j, C1603 c1603, C1532 c1532, int i, int i2, C2949 c2949, int i3, int i4, long j2, C1582 c1582) {
        this.f2526 = c1532;
        this.f2525 = i;
        this.f2532 = i2;
        this.f2531 = c2949;
        this.f2535 = i3;
        this.f2536 = i4;
        this.f2533 = j2;
        this.f2534 = c1582;
        C1093 c1093 = AbstractC1120.f1323;
        this.f2530 = new C1093();
        this.f2529 = c1603;
        this.f2528 = c1532;
        this.f2527 = AbstractC8726.m13883(0, C8727.m13896(j), 0, Integer.MAX_VALUE, 5);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1590 m2124(int i, long j) {
        long j2;
        List list;
        C1603 c1603 = this.f2529;
        Object objM2130 = c1603.m2130(i);
        Object objM2132 = c1603.m2132(i);
        C1093 c1093 = this.f2530;
        List list2 = (List) c1093.m1393(i);
        if (list2 != null) {
            j2 = j;
            list = list2;
        } else {
            C1532 c1532 = this.f2528;
            C1603 c16032 = c1532.f2282;
            C1093 c10932 = c1532.f2280;
            List listMo3654 = (List) c10932.m1393(i);
            if (listMo3654 == null) {
                Object objM21302 = c16032.m2130(i);
                listMo3654 = c1532.f2281.mo3654(objM21302, c1532.f2283.m2067(objM21302, i, c16032.m2132(i)));
                c10932.m1350(i, listMo3654);
            }
            int size = listMo3654.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((InterfaceC2490) listMo3654.get(i2)).mo3615(j));
            }
            j2 = j;
            c1093.m1350(i, arrayList);
            list = arrayList;
        }
        return new C1590(i, list, this.f2531, this.f2526.f2281.getLayoutDirection(), this.f2535, this.f2536, i != this.f2525 + (-1) ? this.f2532 : 0, this.f2533, objM2130, objM2132, this.f2534.f2465, j2);
    }
}
