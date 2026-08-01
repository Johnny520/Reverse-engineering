package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.activity.compose.C0002;
import androidx.collection.AbstractC0272;
import androidx.collection.C0254;
import androidx.compose.foundation.interaction.C0572;
import androidx.compose.foundation.interaction.C0573;
import androidx.compose.foundation.interaction.C0575;
import androidx.compose.foundation.interaction.C0577;
import androidx.compose.foundation.interaction.C0581;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.ui.input.pointer.C1627;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.C1652;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.InterfaceC1761;
import androidx.compose.ui.node.InterfaceC1764;
import androidx.compose.ui.node.InterfaceC1783;
import androidx.compose.ui.node.InterfaceC1787;
import androidx.compose.ui.node.InterfaceC1791;
import androidx.compose.ui.node.InterfaceC1796;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.platform.InterfaceC1863;
import androidx.compose.ui.semantics.AbstractC1943;
import androidx.compose.ui.semantics.AbstractC1946;
import androidx.compose.ui.semantics.AbstractC1959;
import androidx.compose.ui.semantics.C1941;
import androidx.compose.ui.semantics.C1954;
import androidx.compose.ui.semantics.InterfaceC1944;
import kotlin.C5175;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.InterfaceC5087;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.C5452;
import kotlinx.coroutines.InterfaceC5451;
import kotlinx.coroutines.internal.C5350;
import p052.InterfaceC6542;
import p106.InterfaceC7306;
import p110.C7320;
import p110.InterfaceC7319;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1054 extends AbstractC1788 implements InterfaceC1796, InterfaceC7306, InterfaceC1761, InterfaceC1764, InterfaceC1783, InterfaceC1791, InterfaceC7319, InterfaceC1026 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static final C1086 f3111 = new C1086();

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public long f3112;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public C0575 f3113;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public C0575 f3114;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public InterfaceC1787 f3115;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final C0254 f3116;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public C0577 f3117;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C1627 f3118;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public C1025 f3119;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public InterfaceC6542 f3120;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f3121;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public InterfaceC1095 f3122;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C1024 f3123;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C1954 f3124;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public String f3125;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f3126;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public InterfaceC1095 f3127;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC0580 f3128;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public boolean f3129;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public InterfaceC0580 f3130;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public C5416 f3131;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final C1086 f3132;

    public AbstractC1054(InterfaceC0580 interfaceC0580, InterfaceC1095 interfaceC1095, boolean z, boolean z2, String str, C1954 c1954, InterfaceC6542 interfaceC6542) {
        this.f3128 = interfaceC0580;
        this.f3127 = interfaceC1095;
        this.f3126 = z;
        this.f3125 = str;
        this.f3124 = c1954;
        this.f3121 = z2;
        this.f3120 = interfaceC6542;
        this.f3123 = new C1024(interfaceC0580, 0, new AbstractClickableNode$focusableNode$1(this));
        int i = AbstractC0272.f977;
        this.f3116 = new C0254(6);
        this.f3112 = 0L;
        InterfaceC0580 interfaceC05802 = this.f3128;
        this.f3130 = interfaceC05802;
        this.f3129 = interfaceC05802 == null;
        this.f3132 = f3111;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077 A[RETURN] */
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
    @Override // p106.InterfaceC7306
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo1280(android.view.KeyEvent r11) {
        /*
            r10 = this;
            r10.m1957()
            long r0 = p106.AbstractC7307.m12477(r11)
            boolean r2 = r10.f3121
            r3 = 3
            r4 = 0
            androidx.collection.飘花落叶言子世苏哲楪兰 r5 = r10.f3116
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4a
            int r2 = p106.AbstractC7307.m12476(r11)
            r8 = 2
            if (r2 != r8) goto L4a
            boolean r2 = androidx.compose.foundation.AbstractC1072.m1982(r11)
            if (r2 == 0) goto L4a
            boolean r2 = r5.m815(r0)
            if (r2 != 0) goto L40
            androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰 r2 = new androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰
            long r8 = r10.f3112
            r2.<init>(r8)
            r5.m817(r2, r0)
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r0 = r10.f3128
            if (r0 == 0) goto L3e
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r0 = r10.m3857()
            androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1 r1 = new androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1
            r1.<init>(r10, r2, r4)
            kotlinx.coroutines.AbstractC5398.m10473(r0, r4, r4, r1, r3)
        L3e:
            r0 = r6
            goto L41
        L40:
            r0 = r7
        L41:
            boolean r10 = r10.mo1919(r11)
            if (r10 != 0) goto L77
            if (r0 == 0) goto L78
            goto L77
        L4a:
            boolean r2 = r10.f3121
            if (r2 == 0) goto L78
            int r2 = p106.AbstractC7307.m12476(r11)
            if (r2 != r6) goto L78
            boolean r2 = androidx.compose.foundation.AbstractC1072.m1982(r11)
            if (r2 == 0) goto L78
            java.lang.Object r0 = r5.m811(r0)
            androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰 r0 = (androidx.compose.foundation.interaction.C0575) r0
            if (r0 == 0) goto L75
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r1 = r10.f3128
            if (r1 == 0) goto L72
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r1 = r10.m3857()
            androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2 r2 = new androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2
            r2.<init>(r10, r0, r4)
            kotlinx.coroutines.AbstractC5398.m10473(r1, r4, r4, r2, r3)
        L72:
            r10.mo1925(r11)
        L75:
            if (r0 == 0) goto L78
        L77:
            return r6
        L78:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractC1054.mo1280(android.view.KeyEvent):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public void mo1214() {
        C0577 c0577;
        InterfaceC0580 interfaceC0580 = this.f3128;
        if (interfaceC0580 != null && (c0577 = this.f3117) != null) {
            ((C0573) interfaceC0580).m1343(new C0581(c0577));
        }
        this.f3117 = null;
        C1627 c1627 = this.f3118;
        if (c1627 != null) {
            c1627.mo1214();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public void mo1281(C1652 c1652, PointerEventPass pointerEventPass, long j) {
        C1627 c1627Mo1920;
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.f3112 = (((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L);
        m1957();
        if (this.f3121) {
            if (this.f3119 == null) {
                C1025 c1025 = new C1025(this);
                m3354(c1025);
                this.f3119 = c1025;
            }
            if (pointerEventPass == PointerEventPass.Main) {
                int i = c1652.f4846;
                if (i == 4) {
                    AbstractC5398.m10473(m3857(), null, null, new AbstractClickableNode$onPointerEvent$1(this, null), 3);
                } else if (i == 5) {
                    AbstractC5398.m10473(m3857(), null, null, new AbstractClickableNode$onPointerEvent$2(this, null), 3);
                }
            }
        }
        if (this.f3118 == null && (c1627Mo1920 = mo1920()) != null) {
            m3354(c1627Mo1920);
            this.f3118 = c1627Mo1920;
        }
        C1627 c1627 = this.f3118;
        if (c1627 != null) {
            c1627.mo1281(c1652, pointerEventPass, j);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪 */
    public abstract boolean mo1919(KeyEvent keyEvent);

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public final void m1955(C1643 c1643) {
        InterfaceC0580 interfaceC0580 = this.f3128;
        if (interfaceC0580 != null) {
            C0575 c0575 = new C0575(c1643.f4806);
            if (m1961(c1643)) {
                this.f3131 = AbstractC5398.m10473(m3857(), null, null, new AbstractClickableNode$handlePressInteractionStart$2$1(interfaceC0580, c0575, this, null), 3);
            } else {
                this.f3114 = c0575;
                AbstractC5398.m10473(m3857(), null, null, new AbstractClickableNode$handlePressInteractionStart$2$2(interfaceC0580, c0575, null), 3);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public final void m1956(long j, boolean z) {
        InterfaceC0580 interfaceC0580 = this.f3128;
        if (interfaceC0580 != null) {
            C5416 c5416 = this.f3131;
            if (c5416 == null || !c5416.mo10557()) {
                C0575 c0575 = z ? this.f3113 : this.f3114;
                if (c0575 != null) {
                    AbstractC5398.m10473(m3857(), null, null, new AbstractClickableNode$handlePressInteractionRelease$1$2$1(c0575, interfaceC0580, null), 3);
                }
            } else {
                c5416.mo10252(null);
                AbstractC5398.m10473(m3857(), null, null, new AbstractClickableNode$handlePressInteractionRelease$1$1(c5416, j, interfaceC0580, null), 3);
            }
            if (z) {
                this.f3113 = null;
            } else {
                this.f3114 = null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public final void m1957() {
        if (this.f3115 != null) {
            return;
        }
        InterfaceC1095 interfaceC1095 = this.f3126 ? this.f3122 : this.f3127;
        if (interfaceC1095 != null) {
            if (this.f3128 == null) {
                this.f3128 = new C0573();
            }
            this.f3123.m1916(this.f3128);
            InterfaceC0580 interfaceC0580 = this.f3128;
            interfaceC0580.getClass();
            InterfaceC1787 interfaceC1787Mo1934 = interfaceC1095.mo1934(interfaceC0580);
            m3354(interfaceC1787Mo1934);
            this.f3115 = interfaceC1787Mo1934;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public final void m1958(C7320 c7320) {
        InterfaceC0580 interfaceC0580 = this.f3128;
        if (interfaceC0580 != null) {
            C0575 c0575 = new C0575(c7320.f19523);
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            AbstractC1785.m3326(this, C1025.f3001, new C1021(new C0002(c7320, 5, ref$BooleanRef), 0));
            if (ref$BooleanRef.element || AbstractC1032.m1926(this)) {
                this.f3131 = AbstractC5398.m10473(m3857(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$1(interfaceC0580, c0575, this, null), 3);
            } else {
                this.f3113 = c0575;
                AbstractC5398.m10473(m3857(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$2(interfaceC0580, c0575, null), 3);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏 */
    public C1627 mo1920() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final long m1959(long j) {
        long jMo1332 = AbstractC1785.m3336(this).f5098.mo1332(((InterfaceC1863) AbstractC1785.m3346(this, AbstractC1902.f5575)).mo3269());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jMo1332 >> 32)) - ((int) (j >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo1332 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final void m1960(boolean z) {
        InterfaceC0580 interfaceC0580 = this.f3128;
        if (interfaceC0580 != null) {
            C5416 c5416 = this.f3131;
            int i = 1;
            if (c5416 == null || !c5416.mo10557()) {
                C0575 c0575 = z ? this.f3113 : this.f3114;
                if (c0575 != null) {
                    C0572 c0572 = new C0572(c0575);
                    InterfaceC5451 interfaceC5451 = (InterfaceC5451) ((C5350) m3857()).f14921.get(C5452.f15105);
                    AbstractC5398.m10473(m3857(), null, null, new AbstractClickableNode$handlePressInteractionCancel$1$1$1(interfaceC0580, c0572, interfaceC5451 != null ? interfaceC5451.mo10554(new C0002(interfaceC0580, i, c0572)) : null, null), 3);
                }
            } else {
                C5416 c54162 = this.f3131;
                if (c54162 != null) {
                    c54162.mo10252(null);
                }
            }
            if (z) {
                this.f3113 = null;
            } else {
                this.f3114 = null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final boolean m1961(C1643 c1643) {
        boolean z;
        C1086 c1086 = C1025.f3001;
        int i = 0;
        if (c1643 == null) {
            InterfaceC1764 interfaceC1764M3351 = AbstractC1785.m3351(this, c1086);
            C1025 c1025 = interfaceC1764M3351 instanceof C1025 ? (C1025) interfaceC1764M3351 : null;
            z = (c1025 != null ? c1025.f3002 : null) != null;
        } else {
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            AbstractC1785.m3326(this, c1086, new C1021(new C0002(c1643, 4, ref$BooleanRef), i));
            z = ref$BooleanRef.element;
        }
        return z || AbstractC1032.m1926(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1962() {
        /*
            r17 = this;
            r0 = r17
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r1 = r0.f3128
            androidx.collection.飘花落叶言子世苏哲楪兰 r2 = r0.f3116
            if (r1 == 0) goto L82
            androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰 r3 = r0.f3114
            if (r3 == 0) goto L17
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世兰苏 r4 = new androidx.compose.foundation.interaction.飘花落叶言子楪哲世兰苏
            r4.<init>(r3)
            r3 = r1
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰 r3 = (androidx.compose.foundation.interaction.C0573) r3
            r3.m1343(r4)
        L17:
            androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰 r3 = r0.f3113
            if (r3 == 0) goto L26
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世兰苏 r4 = new androidx.compose.foundation.interaction.飘花落叶言子楪哲世兰苏
            r4.<init>(r3)
            r3 = r1
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰 r3 = (androidx.compose.foundation.interaction.C0573) r3
            r3.m1343(r4)
        L26:
            androidx.compose.foundation.interaction.飘花落叶言子楪苏世兰哲 r3 = r0.f3117
            if (r3 == 0) goto L35
            androidx.compose.foundation.interaction.飘花落叶言子楪苏哲世兰 r4 = new androidx.compose.foundation.interaction.飘花落叶言子楪苏哲世兰
            r4.<init>(r3)
            r3 = r1
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰 r3 = (androidx.compose.foundation.interaction.C0573) r3
            r3.m1343(r4)
        L35:
            java.lang.Object[] r3 = r2.f927
            long[] r4 = r2.f929
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L82
            r6 = 0
            r7 = r6
        L40:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L7d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L5a:
            if (r12 >= r10) goto L7b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L77
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰 r13 = (androidx.compose.foundation.interaction.C0575) r13
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世兰苏 r14 = new androidx.compose.foundation.interaction.飘花落叶言子楪哲世兰苏
            r14.<init>(r13)
            r13 = r1
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰 r13 = (androidx.compose.foundation.interaction.C0573) r13
            r13.m1343(r14)
        L77:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L5a
        L7b:
            if (r10 != r11) goto L82
        L7d:
            if (r7 == r5) goto L82
            int r7 = r7 + 1
            goto L40
        L82:
            r1 = 0
            r0.f3114 = r1
            r0.f3113 = r1
            r0.f3117 = r1
            r2.m816()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractC1054.m1962():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲 */
    public abstract void mo1925(KeyEvent keyEvent);

    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1963(androidx.compose.foundation.interaction.InterfaceC0580 r4, androidx.compose.foundation.InterfaceC1095 r5, boolean r6, boolean r7, java.lang.String r8, androidx.compose.ui.semantics.C1954 r9, p052.InterfaceC6542 r10) {
        /*
            r3 = this;
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r0 = r3.f3130
            boolean r0 = kotlin.jvm.internal.AbstractC4394.m8917(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.m1962()
            r3.f3130 = r4
            r3.f3128 = r4
            r4 = r1
            goto L14
        L13:
            r4 = r2
        L14:
            androidx.compose.foundation.飘花落叶言子苏楪兰哲世 r0 = r3.f3127
            boolean r0 = kotlin.jvm.internal.AbstractC4394.m8917(r0, r5)
            if (r0 != 0) goto L1f
            r3.f3127 = r5
            r4 = r1
        L1f:
            boolean r5 = r3.f3126
            if (r5 == r6) goto L2b
            r3.f3126 = r6
            if (r6 == 0) goto L2a
            r3.mo1126()
        L2a:
            r4 = r1
        L2b:
            boolean r5 = r3.f3121
            androidx.compose.foundation.飘花落叶言子世哲楪苏兰 r6 = r3.f3123
            if (r5 == r7) goto L42
            if (r7 == 0) goto L37
            r3.m3354(r6)
            goto L3d
        L37:
            r3.m3358(r6)
            r3.m1962()
        L3d:
            androidx.compose.ui.node.AbstractC1785.m3344(r3)
            r3.f3121 = r7
        L42:
            java.lang.String r5 = r3.f3125
            boolean r5 = kotlin.jvm.internal.AbstractC4394.m8917(r5, r8)
            if (r5 != 0) goto L4f
            r3.f3125 = r8
            androidx.compose.ui.node.AbstractC1785.m3344(r3)
        L4f:
            androidx.compose.ui.semantics.飘花落叶言子楪苏世兰哲 r5 = r3.f3124
            boolean r5 = kotlin.jvm.internal.AbstractC4394.m8917(r5, r9)
            if (r5 != 0) goto L5c
            r3.f3124 = r9
            androidx.compose.ui.node.AbstractC1785.m3344(r3)
        L5c:
            r3.f3120 = r10
            boolean r5 = r3.f3129
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r7 = r3.f3130
            if (r7 != 0) goto L66
            r8 = r1
            goto L67
        L66:
            r8 = r2
        L67:
            if (r5 == r8) goto L75
            if (r7 != 0) goto L6c
            r2 = r1
        L6c:
            r3.f3129 = r2
            if (r2 != 0) goto L75
            androidx.compose.ui.node.飘花落叶言子楪苏哲世兰 r5 = r3.f3115
            if (r5 != 0) goto L75
            goto L76
        L75:
            r1 = r4
        L76:
            if (r1 == 0) goto L8b
            androidx.compose.ui.node.飘花落叶言子楪苏哲世兰 r4 = r3.f3115
            if (r4 != 0) goto L80
            boolean r5 = r3.f3129
            if (r5 != 0) goto L8b
        L80:
            if (r4 == 0) goto L85
            r3.m3358(r4)
        L85:
            r4 = 0
            r3.f3115 = r4
            r3.m1957()
        L8b:
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r3 = r3.f3128
            r6.m1916(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractC1054.m1963(androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世, androidx.compose.foundation.飘花落叶言子苏楪兰哲世, boolean, boolean, java.lang.String, androidx.compose.ui.semantics.飘花落叶言子楪苏世兰哲, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰):void");
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1283() {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public final boolean mo1686() {
        return true;
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1284(InterfaceC1944 interfaceC1944) {
        C1954 c1954 = this.f3124;
        if (c1954 != null) {
            AbstractC1946.m3635(interfaceC1944, c1954.f5772);
        }
        String str = this.f3125;
        C1055 c1055 = new C1055(this, 1);
        InterfaceC5087[] interfaceC5087Arr = AbstractC1946.f5754;
        interfaceC1944.mo3580(AbstractC1959.f5791, new C1941(str, c1055));
        if (this.f3121) {
            this.f3123.mo1284(interfaceC1944);
        } else {
            interfaceC1944.mo3580(AbstractC1943.f5751, C5175.f14739);
        }
        mo1569(interfaceC1944);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        m1962();
        if (this.f3130 == null) {
            this.f3128 = null;
        }
        InterfaceC1787 interfaceC1787 = this.f3115;
        if (interfaceC1787 != null) {
            m3358(interfaceC1787);
        }
        this.f3115 = null;
        C1025 c1025 = this.f3119;
        if (c1025 != null) {
            m3358(c1025);
        }
        this.f3119 = null;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        mo1126();
        if (!this.f3129) {
            m1957();
        }
        if (this.f3121) {
            m3354(this.f3123);
        }
    }

    @Override // p106.InterfaceC7306
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo1285(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1764
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Object mo1349() {
        return this.f3132;
    }

    @Override // androidx.compose.ui.node.InterfaceC1791
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1126() {
        if (this.f3126) {
            AbstractC1785.m3334(this, new C1055(this, 0));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏 */
    public void mo1918() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public void mo1569(InterfaceC1944 interfaceC1944) {
    }
}
