package androidx.compose.p001ui.input.pointer;

import androidx.collection.C1091;
import androidx.collection.C1101;
import androidx.collection.C1110;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.runtime.collection.C2059;
import java.util.List;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7372;
import p248.C8894;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2466 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f5112;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f5113;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f5114;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f5115;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2530 f5116;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1091 f5111 = new C1091();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C2486 f5118 = new C2486();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C1101 f5117 = new C1101(10);

    public C2466(InterfaceC2530 interfaceC2530) {
        this.f5116 = interfaceC2530;
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
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3572(AbstractC2961 abstractC2961) {
        if (this.f5115) {
            this.f5112 = true;
            this.f5111.m1335(abstractC2961);
            return;
        }
        C2486 c2486 = this.f5118;
        C1091 c1091 = c2486.f5190;
        c1091.m1339();
        c1091.m1335(c2486);
        while (c1091.m1438()) {
            C2486 c24862 = (C2486) c1091.m1337(c1091.f1349 - 1);
            int i = 0;
            while (true) {
                C2059 c2059 = c24862.f5191;
                if (i < c2059.f3865) {
                    C2482 c2482 = (C2482) c2059.f3866[i];
                    if (AbstractC5227.m9466(c2482.f5175, abstractC2961)) {
                        c24862.f5191.m2615(c2482);
                        c2482.m3598();
                    } else {
                        c1091.m1335(c2482);
                        i++;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3573() {
        if (this.f5115) {
            this.f5114 = true;
            return;
        }
        C2486 c2486 = this.f5118;
        C2059 c2059 = c2486.f5191;
        Object[] objArr = c2059.f3866;
        int i = c2059.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            ((C2482) objArr[i2]).m3598();
        }
        if (this.f5113) {
            this.f5113 = true;
        } else {
            c2486.f5191.m2612();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m3574(C8894 c8894, boolean z) {
        C1110 c1110 = (C1110) c8894.f22591;
        InterfaceC2530 interfaceC2530 = this.f5116;
        C2486 c2486 = this.f5118;
        boolean zMo3600 = c2486.mo3600(c1110, interfaceC2530, c8894, z);
        C2059 c2059 = c2486.f5191;
        if (!zMo3600) {
            return false;
        }
        boolean z2 = true;
        this.f5115 = true;
        Object[] objArr = c2059.f3866;
        int i = c2059.f3865;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((C2482) objArr[i2]).m3596(c8894, z) || z3;
        }
        Object[] objArr2 = c2059.f3866;
        int i3 = c2059.f3865;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((C2482) objArr2[i4]).m3597(c8894) || z4;
        }
        c2486.mo3599(c8894);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.f5115 = false;
        if (this.f5112) {
            this.f5112 = false;
            C1091 c1091 = this.f5111;
            int i5 = c1091.f1349;
            for (int i6 = 0; i6 < i5; i6++) {
                m3572((AbstractC2961) c1091.m1441(i6));
            }
            c1091.m1339();
        }
        if (this.f5114) {
            this.f5114 = false;
            m3573();
        }
        if (this.f5113) {
            this.f5113 = false;
            c2486.f5191.m2612();
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3575(long j, List list, boolean z) {
        C1101 c1101;
        long[] jArr;
        long[] jArr2;
        int i;
        C2482 c2482;
        Object obj;
        int size = list.size();
        C2486 c2486 = this.f5118;
        C2486 c24862 = c2486;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            c1101 = this.f5117;
            if (i2 >= size) {
                break;
            }
            final AbstractC2961 abstractC2961 = (AbstractC2961) list.get(i2);
            if (abstractC2961.f6624) {
                abstractC2961.f6625 = new InterfaceC7372() { // from class: androidx.compose.ui.input.pointer.HitPathTracker$addHitPath$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m3556invoke() {
                        this.this$0.m3572(abstractC2961);
                    }

                    @Override // p068.InterfaceC7372
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m3556invoke();
                        return C6008.f15084;
                    }
                };
                if (z2) {
                    C2059 c2059 = c24862.f5191;
                    Object[] objArr = c2059.f3866;
                    int i3 = c2059.f3865;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i4];
                        if (AbstractC5227.m9466(((C2482) obj).f5175, abstractC2961)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    c2482 = (C2482) obj;
                    if (c2482 != null) {
                        c2482.f5178 = true;
                        c2482.f5174.m902(j);
                        if (z) {
                            Object objM1374 = c1101.m1374(j);
                            if (objM1374 == null) {
                                objM1374 = new C1091();
                                c1101.m1378(objM1374, j);
                            }
                            ((C1091) objM1374).m1335(c2482);
                        }
                        c24862 = c2482;
                    } else {
                        z2 = false;
                        c2482 = new C2482(abstractC2961);
                        c2482.f5174.m902(j);
                        if (z) {
                            Object objM13742 = c1101.m1374(j);
                            if (objM13742 == null) {
                                objM13742 = new C1091();
                                c1101.m1378(objM13742, j);
                            }
                            ((C1091) objM13742).m1335(c2482);
                        }
                        c24862.f5191.m2607(c2482);
                        c24862 = c2482;
                    }
                } else {
                    c2482 = new C2482(abstractC2961);
                    c2482.f5174.m902(j);
                    if (z) {
                    }
                    c24862.f5191.m2607(c2482);
                    c24862 = c2482;
                }
            }
            i2++;
        }
        if (z) {
            long[] jArr3 = c1101.f1273;
            Object[] objArr2 = c1101.f1272;
            long[] jArr4 = c1101.f1274;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr4[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j2) < 128) {
                                int i9 = (i5 << 3) + i8;
                                long j3 = jArr3[i9];
                                C1091 c1091 = (C1091) objArr2[i9];
                                C2059 c20592 = c2486.f5191;
                                i = i6;
                                Object[] objArr3 = c20592.f3866;
                                int i10 = c20592.f3865;
                                jArr2 = jArr3;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((C2482) objArr3[i11]).m3595(j3, c1091);
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i6;
                            }
                            j2 >>= i;
                            i8++;
                            i6 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr3 = jArr;
                }
            }
        }
        c1101.m1377();
    }
}
