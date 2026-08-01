package androidx.compose.ui.layout;

import android.os.Handler;
import androidx.activity.AbstractC0053;
import androidx.collection.AbstractC0285;
import androidx.collection.AbstractC0290;
import androidx.collection.C0235;
import androidx.collection.C0236;
import androidx.collection.C0242;
import androidx.collection.C0276;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.AbstractC1372;
import androidx.compose.runtime.C1363;
import androidx.compose.runtime.C1391;
import androidx.compose.runtime.InterfaceC1370;
import androidx.compose.runtime.PausedCompositionState;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.runtime.internal.C1251;
import androidx.compose.runtime.snapshots.AbstractC1274;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.ui.node.AbstractC1757;
import androidx.compose.ui.node.C1738;
import androidx.compose.ui.node.C1747;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1756;
import androidx.compose.ui.node.InterfaceC1805;
import androidx.compose.ui.node.LayoutNode$UsageByParent;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import java.util.List;
import kotlin.C5175;
import kotlin.collections.C4350;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p210.AbstractC7935;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1661 implements InterfaceC1370 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f4858;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f4859;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C1224 f4860;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C0236 f4861;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C1714 f4862;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C0236 f4863;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final String f4864;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f4865;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f4866;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C1675 f4867;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C1666 f4868;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C0236 f4869;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C0236 f4870;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public AbstractC1372 f4871;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public InterfaceC1717 f4872;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1748 f4873;

    public C1661(C1748 c1748, InterfaceC1717 interfaceC1717) {
        this.f4873 = c1748;
        this.f4872 = interfaceC1717;
        long[] jArr = AbstractC0290.f1007;
        this.f4869 = new C0236();
        this.f4870 = new C0236();
        this.f4867 = new C1675(this);
        this.f4868 = new C1666(this);
        this.f4863 = new C0236();
        this.f4862 = new C1714();
        this.f4861 = new C0236();
        this.f4860 = new C1224(0, new Object[16]);
        this.f4864 = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m3051(C1665 c1665) {
        C0235 c0235;
        C1391 c1391 = c1665.f4880;
        if (c1391 != null) {
            c1391.f4045.set(PausedCompositionState.Cancelled);
            C1251 c1251 = c1391.f4047;
            if (((C0235) c1251.f3633).m871()) {
                c0235 = (C0235) c1251.f3633;
                C0235 c02352 = AbstractC0285.f997;
                c1251.f3633 = new C0235();
                ((C1224) c1251.f3629).m2042();
            } else {
                c0235 = null;
            }
            c1251.m2171();
            C1363 c1363 = c1391.f4044;
            c1363.f3955 = null;
            if (c0235 != null) {
                c1363.f3951.f3634 = c0235;
                c1363.f3943 = 2;
            }
            c1665.f4880 = null;
            C1363 c13632 = c1665.f4883;
            if (c13632 != null) {
                c13632.dispose();
            }
            c1665.f4883 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m3052(C1661 c1661, Object obj) {
        C1748 c1748 = c1661.f4873;
        c1661.m3057();
        C1748 c17482 = (C1748) c1661.f4863.m757(obj);
        if (c17482 != null) {
            if (c1661.f4858 <= 0) {
                AbstractC7935.m13395("No pre-composed items to dispose");
            }
            int iM2044 = ((C1224) ((C0242) c1748.m3251()).f894).m2044(c17482);
            if (iM2044 < ((C1224) ((C0242) c1748.m3251()).f894).f3519 - c1661.f4858) {
                AbstractC7935.m13395("Item is not in pre-composed item range");
            }
            c1661.f4859++;
            c1661.f4858--;
            C1665 c1665 = (C1665) c1661.f4869.m756(c17482);
            if (c1665 != null) {
                m3051(c1665);
            }
            int i = (((C1224) ((C0242) c1748.m3251()).f894).f3519 - c1661.f4858) - c1661.f4859;
            c1661.m3062(iM2044, i);
            c1661.m3058(i);
        }
        if (c1661.f4860.m2041(obj)) {
            C1748.m3214(c1748, true, 6);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC1718 m3053(Object obj) {
        return !this.f4873.m3233() ? new C1672() : new C1671(this, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3054(C1665 c1665, boolean z) {
        C1391 c1391 = c1665.f4880;
        if (c1391 != null) {
            AbstractC1286 abstractC1286M2221 = AbstractC1274.m2221();
            InterfaceC6557 interfaceC6557Mo2193 = abstractC1286M2221 != null ? abstractC1286M2221.mo2193() : null;
            AbstractC1286 abstractC1286M2233 = AbstractC1274.m2233(abstractC1286M2221);
            try {
                C1748 c1748 = this.f4873;
                c1748.f5113 = true;
                if (z) {
                    while (!c1391.m2524()) {
                        try {
                            c1391.m2522(new C0276(16));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                c1391.m2526();
                c1665.f4880 = null;
                c1748.f5113 = false;
            } finally {
                AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1370
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo2494() {
        m3061(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // androidx.compose.runtime.InterfaceC1370
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo2495() {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r2 = r0.f4873
            r2.f5113 = r1
            androidx.collection.飘花落叶言子世兰楪苏哲 r1 = r0.f4869
            java.lang.Object[] r3 = r1.f879
            long[] r4 = r1.f881
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2e:
            if (r12 >= r10) goto L4b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L47
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            androidx.compose.ui.layout.飘花落叶言子世楪兰哲苏 r13 = (androidx.compose.ui.layout.C1665) r13
            androidx.compose.runtime.飘花落叶言子楪哲世兰苏 r13 = r13.f4883
            if (r13 == 0) goto L47
            r13.dispose()
        L47:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4b:
            if (r10 != r11) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r2.m3217()
            r2.f5113 = r6
            r1.m753()
            androidx.collection.飘花落叶言子世兰楪苏哲 r1 = r0.f4870
            r1.m753()
            r0.f4858 = r6
            r0.f4859 = r6
            androidx.collection.飘花落叶言子世兰楪苏哲 r1 = r0.f4863
            r1.m753()
            r0.m3057()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.C1661.mo2495():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C1748 m3055(Object obj) {
        C0236 c0236;
        int i;
        if (this.f4859 == 0) {
            return null;
        }
        C0242 c0242 = (C0242) this.f4873.m3251();
        int i2 = ((C1224) c0242.f894).f3519 - this.f4858;
        int i3 = i2 - this.f4859;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            c0236 = this.f4869;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objM756 = c0236.m756((C1748) c0242.get(i5));
            objM756.getClass();
            if (AbstractC4394.m8917(((C1665) objM756).f4885, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                Object objM7562 = c0236.m756((C1748) c0242.get(i4));
                objM7562.getClass();
                C1665 c1665 = (C1665) objM7562;
                Object obj2 = c1665.f4885;
                if (obj2 == AbstractC1670.f4893 || this.f4872.mo279(obj, obj2)) {
                    c1665.f4885 = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            m3062(i5, i3);
        }
        this.f4859--;
        C1748 c1748 = (C1748) c0242.get(i3);
        Object objM7563 = c0236.m756(c1748);
        objM7563.getClass();
        C1665 c16652 = (C1665) objM7563;
        c16652.f4887 = AbstractC1367.m2465(Boolean.TRUE);
        c16652.f4881 = true;
        c16652.f4882 = true;
        return c1748;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
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
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3056(androidx.compose.ui.node.C1748 r10, java.lang.Object r11, boolean r12, p052.InterfaceC6553 r13) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.C1661.m3056(androidx.compose.ui.node.飘花落叶言子世楪兰哲苏, java.lang.Object, boolean, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m3057() {
        int i = ((C1224) ((C0242) this.f4873.m3251()).f894).f3519;
        C0236 c0236 = this.f4869;
        if (c0236.f877 != i) {
            AbstractC7935.m13397("Inconsistency between the count of nodes tracked by the state (" + c0236.f877 + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.f4859) - this.f4858 < 0) {
            StringBuilder sbM148 = AbstractC0053.m148(i, "Incorrect state. Total children ", ". Reusable children ");
            sbM148.append(this.f4859);
            sbM148.append(". Precomposed children ");
            sbM148.append(this.f4858);
            AbstractC7935.m13397(sbM148.toString());
        }
        C0236 c02362 = this.f4863;
        if (c02362.f877 == this.f4858) {
            return;
        }
        AbstractC7935.m13397("Incorrect state. Precomposed children " + this.f4858 + ". Map size " + c02362.f877);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3058(int i) {
        boolean z;
        boolean z2 = false;
        this.f4859 = 0;
        List listM3251 = this.f4873.m3251();
        C0242 c0242 = (C0242) listM3251;
        int i2 = (((C1224) c0242.f894).f3519 - this.f4858) - 1;
        if (i <= i2) {
            this.f4862.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objM756 = this.f4869.m756((C1748) c0242.get(i3));
                    objM756.getClass();
                    this.f4862.f4984.m765(((C1665) objM756).f4885);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f4872.mo281(this.f4862);
            AbstractC1286 abstractC1286M2221 = AbstractC1274.m2221();
            InterfaceC6557 interfaceC6557Mo2193 = abstractC1286M2221 != null ? abstractC1286M2221.mo2193() : null;
            AbstractC1286 abstractC1286M2233 = AbstractC1274.m2233(abstractC1286M2221);
            z = false;
            while (i2 >= i) {
                try {
                    C1748 c1748 = (C1748) ((C0242) listM3251).get(i2);
                    Object objM7562 = this.f4869.m756(c1748);
                    objM7562.getClass();
                    C1665 c1665 = (C1665) objM7562;
                    Object obj = c1665.f4885;
                    if (this.f4862.f4984.m886(obj)) {
                        this.f4859++;
                        if (((Boolean) ((AbstractC1347) c1665.f4887).getValue()).booleanValue()) {
                            C1756 c1756 = c1748.f5131;
                            C1738 c1738 = c1756.f5166;
                            LayoutNode$UsageByParent layoutNode$UsageByParent = LayoutNode$UsageByParent.NotUsed;
                            c1738.f5026 = layoutNode$UsageByParent;
                            C1747 c1747 = c1756.f5164;
                            if (c1747 != null) {
                                c1747.f5077 = layoutNode$UsageByParent;
                            }
                            m3060(c1665, false);
                            if (c1665.f4886) {
                                z = true;
                            }
                        }
                    } else {
                        C1748 c17482 = this.f4873;
                        c17482.f5113 = true;
                        this.f4869.m757(c1748);
                        C1363 c1363 = c1665.f4883;
                        if (c1363 != null) {
                            c1363.dispose();
                        }
                        this.f4873.m3216(i2, 1);
                        c17482.f5113 = false;
                    }
                    this.f4870.m757(obj);
                    i2--;
                } catch (Throwable th) {
                    AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
                    throw th;
                }
            }
            AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
        } else {
            z = false;
        }
        if (z) {
            synchronized (AbstractC1280.f3744) {
                C0235 c0235 = AbstractC1280.f3751.f3696;
                if (c0235 != null) {
                    if (c0235.m871()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                AbstractC1280.m2253();
            }
        }
        m3057();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m3059(Object obj, InterfaceC6553 interfaceC6553, boolean z) {
        C1748 c1748 = this.f4873;
        if (c1748.m3233()) {
            m3057();
            if (this.f4870.m751(obj)) {
                return;
            }
            this.f4861.m757(obj);
            C0236 c0236 = this.f4863;
            Object objM756 = c0236.m756(obj);
            if (objM756 == null) {
                objM756 = m3055(obj);
                if (objM756 != null) {
                    m3062(((C1224) ((C0242) c1748.m3251()).f894).m2044(objM756), ((C1224) ((C0242) c1748.m3251()).f894).f3519);
                    this.f4858++;
                } else {
                    int i = ((C1224) ((C0242) c1748.m3251()).f894).f3519;
                    C1748 c17482 = new C1748(2);
                    c1748.f5113 = true;
                    c1748.m3227(i, c17482);
                    c1748.f5113 = false;
                    this.f4858++;
                    objM756 = c17482;
                }
                c0236.m754(obj, objM756);
            }
            m3056((C1748) objM756, obj, z, interfaceC6553);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m3060(final C1665 c1665, boolean z) {
        C1363 c1363;
        if (z || !c1665.f4886) {
            c1665.f4887 = AbstractC1367.m2465(Boolean.FALSE);
        } else {
            ((AbstractC1347) c1665.f4887).setValue(Boolean.FALSE);
        }
        if (c1665.f4880 != null) {
            m3051(c1665);
            return;
        }
        if (z) {
            C1363 c13632 = c1665.f4883;
            if (c13632 != null) {
                c13632.m2456();
                return;
            }
            return;
        }
        InterfaceC1805 outOfFrameExecutor = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(this.f4873)).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (c1665.f4886 || (c1363 = c1665.f4883) == null) {
                return;
            }
            c1363.m2456();
            return;
        }
        InterfaceC6542 interfaceC6542 = new InterfaceC6542() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$deactivateOutOfFrame$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3039invoke() {
                C1363 c13633;
                if (((Boolean) ((AbstractC1347) c1665.f4887).getValue()).booleanValue() || (c13633 = c1665.f4883) == null) {
                    return;
                }
                c13633.m2456();
            }

            @Override // p052.InterfaceC6542
            public /* bridge */ /* synthetic */ Object invoke() {
                m3039invoke();
                return C5175.f14739;
            }
        };
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = (ViewTreeObserverOnGlobalLayoutListenerC1884) outOfFrameExecutor;
        C4350 c4350 = viewTreeObserverOnGlobalLayoutListenerC1884.f5475;
        boolean zIsEmpty = c4350.isEmpty();
        c4350.addLast(interfaceC6542);
        if (zIsEmpty) {
            Handler handler = viewTreeObserverOnGlobalLayoutListenerC1884.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(viewTreeObserverOnGlobalLayoutListenerC1884.f5434);
            } else {
                C5919.m11249("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m3061(boolean z) {
        this.f4858 = 0;
        this.f4863.m753();
        List listM3251 = this.f4873.m3251();
        int i = ((C1224) ((C0242) listM3251).f894).f3519;
        if (this.f4859 != i) {
            this.f4859 = i;
            AbstractC1286 abstractC1286M2221 = AbstractC1274.m2221();
            InterfaceC6557 interfaceC6557Mo2193 = abstractC1286M2221 != null ? abstractC1286M2221.mo2193() : null;
            AbstractC1286 abstractC1286M2233 = AbstractC1274.m2233(abstractC1286M2221);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    C1748 c1748 = (C1748) ((C0242) listM3251).get(i2);
                    C1665 c1665 = (C1665) this.f4869.m756(c1748);
                    if (c1665 != null && ((Boolean) ((AbstractC1347) c1665.f4887).getValue()).booleanValue()) {
                        C1756 c1756 = c1748.f5131;
                        C1738 c1738 = c1756.f5166;
                        LayoutNode$UsageByParent layoutNode$UsageByParent = LayoutNode$UsageByParent.NotUsed;
                        c1738.f5026 = layoutNode$UsageByParent;
                        C1747 c1747 = c1756.f5164;
                        if (c1747 != null) {
                            c1747.f5077 = layoutNode$UsageByParent;
                        }
                        m3060(c1665, z);
                        c1665.f4885 = AbstractC1670.f4893;
                    }
                } catch (Throwable th) {
                    AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
                    throw th;
                }
            }
            AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
            this.f4870.m753();
        }
        m3057();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m3062(int i, int i2) {
        C1748 c1748 = this.f4873;
        c1748.f5113 = true;
        c1748.m3221(i, i2, 1);
        c1748.f5113 = false;
    }
}
