package androidx.compose.foundation.lazy;

import androidx.collection.AbstractC0273;
import androidx.collection.C0246;
import androidx.compose.foundation.lazy.layout.C0691;
import androidx.compose.ui.C2116;
import androidx.compose.ui.layout.InterfaceC1655;
import java.util.ArrayList;
import java.util.List;
import p205.AbstractC7897;
import p205.C7898;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0754 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ int f2180;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C0691 f2181;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f2182;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0691 f2183;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0762 f2184;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0246 f2185;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ C2116 f2186;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f2187;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final /* synthetic */ long f2188;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final /* synthetic */ C0741 f2189;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ int f2190;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2191;

    public C0754(long j, C0762 c0762, C0691 c0691, int i, int i2, C2116 c2116, int i3, int i4, long j2, C0741 c0741) {
        this.f2181 = c0691;
        this.f2180 = i;
        this.f2187 = i2;
        this.f2186 = c2116;
        this.f2190 = i3;
        this.f2191 = i4;
        this.f2188 = j2;
        this.f2189 = c0741;
        C0246 c0246 = AbstractC0273.f978;
        this.f2185 = new C0246();
        this.f2184 = c0762;
        this.f2183 = c0691;
        this.f2182 = AbstractC7897.m13324(0, C7898.m13337(j), 0, Integer.MAX_VALUE, 5);
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
    public final C0749 m1564(int i, long j) {
        long j2;
        List list;
        C0762 c0762 = this.f2184;
        Object objM1570 = c0762.m1570(i);
        Object objM1572 = c0762.m1572(i);
        C0246 c0246 = this.f2185;
        List list2 = (List) c0246.m833(i);
        if (list2 != null) {
            j2 = j;
            list = list2;
        } else {
            C0691 c0691 = this.f2183;
            C0762 c07622 = c0691.f1937;
            C0246 c02462 = c0691.f1935;
            List listMo3094 = (List) c02462.m833(i);
            if (listMo3094 == null) {
                Object objM15702 = c07622.m1570(i);
                listMo3094 = c0691.f1936.mo3094(objM15702, c0691.f1938.m1507(objM15702, i, c07622.m1572(i)));
                c02462.m790(i, listMo3094);
            }
            int size = listMo3094.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((InterfaceC1655) listMo3094.get(i2)).mo3055(j));
            }
            j2 = j;
            c0246.m790(i, arrayList);
            list = arrayList;
        }
        return new C0749(i, list, this.f2186, this.f2181.f1936.getLayoutDirection(), this.f2190, this.f2191, i != this.f2180 + (-1) ? this.f2187 : 0, this.f2188, objM1570, objM1572, this.f2189.f2120, j2);
    }
}
