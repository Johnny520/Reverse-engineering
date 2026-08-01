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
import kotlin.C5176;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.InterfaceC5088;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.C5453;
import kotlinx.coroutines.InterfaceC5452;
import kotlinx.coroutines.internal.C5351;
import p052.InterfaceC6543;
import p106.InterfaceC7307;
import p110.C7321;
import p110.InterfaceC7320;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1054 extends AbstractC1788 implements InterfaceC1796, InterfaceC7307, InterfaceC1761, InterfaceC1764, InterfaceC1783, InterfaceC1791, InterfaceC7320, InterfaceC1026 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static final C1086 f3112 = new C1086();

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public long f3113;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public C0575 f3114;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public C0575 f3115;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public InterfaceC1787 f3116;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final C0254 f3117;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public C0577 f3118;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C1627 f3119;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public C1025 f3120;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public InterfaceC6543 f3121;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f3122;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public InterfaceC1095 f3123;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C1024 f3124;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C1954 f3125;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public String f3126;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f3127;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public InterfaceC1095 f3128;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC0580 f3129;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public boolean f3130;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public InterfaceC0580 f3131;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public C5417 f3132;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final C1086 f3133;

    public AbstractC1054(InterfaceC0580 interfaceC0580, InterfaceC1095 interfaceC1095, boolean z, boolean z2, String str, C1954 c1954, InterfaceC6543 interfaceC6543) {
        this.f3129 = interfaceC0580;
        this.f3128 = interfaceC1095;
        this.f3127 = z;
        this.f3126 = str;
        this.f3125 = c1954;
        this.f3122 = z2;
        this.f3121 = interfaceC6543;
        this.f3124 = new C1024(interfaceC0580, 0, new AbstractClickableNode$focusableNode$1(this));
        int i = AbstractC0272.f977;
        this.f3117 = new C0254(6);
        this.f3113 = 0L;
        InterfaceC0580 interfaceC05802 = this.f3129;
        this.f3131 = interfaceC05802;
        this.f3130 = interfaceC05802 == null;
        this.f3133 = f3112;
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
    @Override // p106.InterfaceC7307
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo1290(android.view.KeyEvent r11) {
        /*
            r10 = this;
            r10.m1967()
            long r0 = p106.AbstractC7308.m12504(r11)
            boolean r2 = r10.f3122
            r3 = 3
            r4 = 0
            androidx.collection.飘花落叶言子世苏哲楪兰 r5 = r10.f3117
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4a
            int r2 = p106.AbstractC7308.m12503(r11)
            r8 = 2
            if (r2 != r8) goto L4a
            boolean r2 = androidx.compose.foundation.AbstractC1072.m1992(r11)
            if (r2 == 0) goto L4a
            boolean r2 = r5.m816(r0)
            if (r2 != 0) goto L40
            androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰 r2 = new androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰
            long r8 = r10.f3113
            r2.<init>(r8)
            r5.m818(r2, r0)
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r0 = r10.f3129
            if (r0 == 0) goto L3e
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r0 = r10.m3867()
            androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1 r1 = new androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1
            r1.<init>(r10, r2, r4)
            kotlinx.coroutines.AbstractC5399.m10477(r0, r4, r4, r1, r3)
        L3e:
            r0 = r6
            goto L41
        L40:
            r0 = r7
        L41:
            boolean r10 = r10.mo1929(r11)
            if (r10 != 0) goto L77
            if (r0 == 0) goto L78
            goto L77
        L4a:
            boolean r2 = r10.f3122
            if (r2 == 0) goto L78
            int r2 = p106.AbstractC7308.m12503(r11)
            if (r2 != r6) goto L78
            boolean r2 = androidx.compose.foundation.AbstractC1072.m1992(r11)
            if (r2 == 0) goto L78
            java.lang.Object r0 = r5.m812(r0)
            androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰 r0 = (androidx.compose.foundation.interaction.C0575) r0
            if (r0 == 0) goto L75
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r1 = r10.f3129
            if (r1 == 0) goto L72
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r1 = r10.m3867()
            androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2 r2 = new androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2
            r2.<init>(r10, r0, r4)
            kotlinx.coroutines.AbstractC5399.m10477(r1, r4, r4, r2, r3)
        L72:
            r10.mo1935(r11)
        L75:
            if (r0 == 0) goto L78
        L77:
            return r6
        L78:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractC1054.mo1290(android.view.KeyEvent):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public void mo1224() {
        C0577 c0577;
        InterfaceC0580 interfaceC0580 = this.f3129;
        if (interfaceC0580 != null && (c0577 = this.f3118) != null) {
            ((C0573) interfaceC0580).m1353(new C0581(c0577));
        }
        this.f3118 = null;
        C1627 c1627 = this.f3119;
        if (c1627 != null) {
            c1627.mo1224();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public void mo1291(C1652 c1652, PointerEventPass pointerEventPass, long j) {
        C1627 c1627Mo1930;
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.f3113 = (((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L);
        m1967();
        if (this.f3122) {
            if (this.f3120 == null) {
                C1025 c1025 = new C1025(this);
                m3364(c1025);
                this.f3120 = c1025;
            }
            if (pointerEventPass == PointerEventPass.Main) {
                int i = c1652.f4847;
                if (i == 4) {
                    AbstractC5399.m10477(m3867(), null, null, new AbstractClickableNode$onPointerEvent$1(this, null), 3);
                } else if (i == 5) {
                    AbstractC5399.m10477(m3867(), null, null, new AbstractClickableNode$onPointerEvent$2(this, null), 3);
                }
            }
        }
        if (this.f3119 == null && (c1627Mo1930 = mo1930()) != null) {
            m3364(c1627Mo1930);
            this.f3119 = c1627Mo1930;
        }
        C1627 c1627 = this.f3119;
        if (c1627 != null) {
            c1627.mo1291(c1652, pointerEventPass, j);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪 */
    public abstract boolean mo1929(KeyEvent keyEvent);

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public final void m1965(C1643 c1643) {
        InterfaceC0580 interfaceC0580 = this.f3129;
        if (interfaceC0580 != null) {
            C0575 c0575 = new C0575(c1643.f4807);
            if (m1971(c1643)) {
                this.f3132 = AbstractC5399.m10477(m3867(), null, null, new AbstractClickableNode$handlePressInteractionStart$2$1(interfaceC0580, c0575, this, null), 3);
            } else {
                this.f3115 = c0575;
                AbstractC5399.m10477(m3867(), null, null, new AbstractClickableNode$handlePressInteractionStart$2$2(interfaceC0580, c0575, null), 3);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public final void m1966(long j, boolean z) {
        InterfaceC0580 interfaceC0580 = this.f3129;
        if (interfaceC0580 != null) {
            C5417 c5417 = this.f3132;
            if (c5417 == null || !c5417.mo10562()) {
                C0575 c0575 = z ? this.f3114 : this.f3115;
                if (c0575 != null) {
                    AbstractC5399.m10477(m3867(), null, null, new AbstractClickableNode$handlePressInteractionRelease$1$2$1(c0575, interfaceC0580, null), 3);
                }
            } else {
                c5417.mo10256(null);
                AbstractC5399.m10477(m3867(), null, null, new AbstractClickableNode$handlePressInteractionRelease$1$1(c5417, j, interfaceC0580, null), 3);
            }
            if (z) {
                this.f3114 = null;
            } else {
                this.f3115 = null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public final void m1967() {
        if (this.f3116 != null) {
            return;
        }
        InterfaceC1095 interfaceC1095 = this.f3127 ? this.f3123 : this.f3128;
        if (interfaceC1095 != null) {
            if (this.f3129 == null) {
                this.f3129 = new C0573();
            }
            this.f3124.m1926(this.f3129);
            InterfaceC0580 interfaceC0580 = this.f3129;
            interfaceC0580.getClass();
            InterfaceC1787 interfaceC1787Mo1944 = interfaceC1095.mo1944(interfaceC0580);
            m3364(interfaceC1787Mo1944);
            this.f3116 = interfaceC1787Mo1944;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public final void m1968(C7321 c7321) {
        InterfaceC0580 interfaceC0580 = this.f3129;
        if (interfaceC0580 != null) {
            C0575 c0575 = new C0575(c7321.f19518);
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            AbstractC1785.m3336(this, C1025.f3002, new C1021(new C0002(c7321, 5, ref$BooleanRef), 0));
            if (ref$BooleanRef.element || AbstractC1032.m1936(this)) {
                this.f3132 = AbstractC5399.m10477(m3867(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$1(interfaceC0580, c0575, this, null), 3);
            } else {
                this.f3114 = c0575;
                AbstractC5399.m10477(m3867(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$2(interfaceC0580, c0575, null), 3);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏 */
    public C1627 mo1930() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final long m1969(long j) {
        long jMo1342 = AbstractC1785.m3346(this).f5099.mo1342(((InterfaceC1863) AbstractC1785.m3356(this, AbstractC1902.f5576)).mo3279());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jMo1342 >> 32)) - ((int) (j >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo1342 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final void m1970(boolean z) {
        InterfaceC0580 interfaceC0580 = this.f3129;
        if (interfaceC0580 != null) {
            C5417 c5417 = this.f3132;
            int i = 1;
            if (c5417 == null || !c5417.mo10562()) {
                C0575 c0575 = z ? this.f3114 : this.f3115;
                if (c0575 != null) {
                    C0572 c0572 = new C0572(c0575);
                    InterfaceC5452 interfaceC5452 = (InterfaceC5452) ((C5351) m3867()).f14921.get(C5453.f15105);
                    AbstractC5399.m10477(m3867(), null, null, new AbstractClickableNode$handlePressInteractionCancel$1$1$1(interfaceC0580, c0572, interfaceC5452 != null ? interfaceC5452.mo10559(new C0002(interfaceC0580, i, c0572)) : null, null), 3);
                }
            } else {
                C5417 c54172 = this.f3132;
                if (c54172 != null) {
                    c54172.mo10256(null);
                }
            }
            if (z) {
                this.f3114 = null;
            } else {
                this.f3115 = null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final boolean m1971(C1643 c1643) {
        boolean z;
        C1086 c1086 = C1025.f3002;
        int i = 0;
        if (c1643 == null) {
            InterfaceC1764 interfaceC1764M3361 = AbstractC1785.m3361(this, c1086);
            C1025 c1025 = interfaceC1764M3361 instanceof C1025 ? (C1025) interfaceC1764M3361 : null;
            z = (c1025 != null ? c1025.f3003 : null) != null;
        } else {
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            AbstractC1785.m3336(this, c1086, new C1021(new C0002(c1643, 4, ref$BooleanRef), i));
            z = ref$BooleanRef.element;
        }
        return z || AbstractC1032.m1936(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1972() {
        /*
            r17 = this;
            r0 = r17
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r1 = r0.f3129
            androidx.collection.飘花落叶言子世苏哲楪兰 r2 = r0.f3117
            if (r1 == 0) goto L82
            androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰 r3 = r0.f3115
            if (r3 == 0) goto L17
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世兰苏 r4 = new androidx.compose.foundation.interaction.飘花落叶言子楪哲世兰苏
            r4.<init>(r3)
            r3 = r1
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰 r3 = (androidx.compose.foundation.interaction.C0573) r3
            r3.m1353(r4)
        L17:
            androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰 r3 = r0.f3114
            if (r3 == 0) goto L26
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世兰苏 r4 = new androidx.compose.foundation.interaction.飘花落叶言子楪哲世兰苏
            r4.<init>(r3)
            r3 = r1
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰 r3 = (androidx.compose.foundation.interaction.C0573) r3
            r3.m1353(r4)
        L26:
            androidx.compose.foundation.interaction.飘花落叶言子楪苏世兰哲 r3 = r0.f3118
            if (r3 == 0) goto L35
            androidx.compose.foundation.interaction.飘花落叶言子楪苏哲世兰 r4 = new androidx.compose.foundation.interaction.飘花落叶言子楪苏哲世兰
            r4.<init>(r3)
            r3 = r1
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰 r3 = (androidx.compose.foundation.interaction.C0573) r3
            r3.m1353(r4)
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
            r13.m1353(r14)
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
            r0.f3115 = r1
            r0.f3114 = r1
            r0.f3118 = r1
            r2.m817()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractC1054.m1972():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲 */
    public abstract void mo1935(KeyEvent keyEvent);

    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1973(androidx.compose.foundation.interaction.InterfaceC0580 r4, androidx.compose.foundation.InterfaceC1095 r5, boolean r6, boolean r7, java.lang.String r8, androidx.compose.ui.semantics.C1954 r9, p052.InterfaceC6543 r10) {
        /*
            r3 = this;
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r0 = r3.f3131
            boolean r0 = kotlin.jvm.internal.AbstractC4395.m8907(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.m1972()
            r3.f3131 = r4
            r3.f3129 = r4
            r4 = r1
            goto L14
        L13:
            r4 = r2
        L14:
            androidx.compose.foundation.飘花落叶言子苏楪兰哲世 r0 = r3.f3128
            boolean r0 = kotlin.jvm.internal.AbstractC4395.m8907(r0, r5)
            if (r0 != 0) goto L1f
            r3.f3128 = r5
            r4 = r1
        L1f:
            boolean r5 = r3.f3127
            if (r5 == r6) goto L2b
            r3.f3127 = r6
            if (r6 == 0) goto L2a
            r3.mo1127()
        L2a:
            r4 = r1
        L2b:
            boolean r5 = r3.f3122
            androidx.compose.foundation.飘花落叶言子世哲楪苏兰 r6 = r3.f3124
            if (r5 == r7) goto L42
            if (r7 == 0) goto L37
            r3.m3364(r6)
            goto L3d
        L37:
            r3.m3368(r6)
            r3.m1972()
        L3d:
            androidx.compose.ui.node.AbstractC1785.m3354(r3)
            r3.f3122 = r7
        L42:
            java.lang.String r5 = r3.f3126
            boolean r5 = kotlin.jvm.internal.AbstractC4395.m8907(r5, r8)
            if (r5 != 0) goto L4f
            r3.f3126 = r8
            androidx.compose.ui.node.AbstractC1785.m3354(r3)
        L4f:
            androidx.compose.ui.semantics.飘花落叶言子楪苏世兰哲 r5 = r3.f3125
            boolean r5 = kotlin.jvm.internal.AbstractC4395.m8907(r5, r9)
            if (r5 != 0) goto L5c
            r3.f3125 = r9
            androidx.compose.ui.node.AbstractC1785.m3354(r3)
        L5c:
            r3.f3121 = r10
            boolean r5 = r3.f3130
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r7 = r3.f3131
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
            r3.f3130 = r2
            if (r2 != 0) goto L75
            androidx.compose.ui.node.飘花落叶言子楪苏哲世兰 r5 = r3.f3116
            if (r5 != 0) goto L75
            goto L76
        L75:
            r1 = r4
        L76:
            if (r1 == 0) goto L8b
            androidx.compose.ui.node.飘花落叶言子楪苏哲世兰 r4 = r3.f3116
            if (r4 != 0) goto L80
            boolean r5 = r3.f3130
            if (r5 != 0) goto L8b
        L80:
            if (r4 == 0) goto L85
            r3.m3368(r4)
        L85:
            r4 = 0
            r3.f3116 = r4
            r3.m1967()
        L8b:
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r3 = r3.f3129
            r6.m1926(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractC1054.m1973(androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世, androidx.compose.foundation.飘花落叶言子苏楪兰哲世, boolean, boolean, java.lang.String, androidx.compose.ui.semantics.飘花落叶言子楪苏世兰哲, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰):void");
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1293() {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public final boolean mo1696() {
        return true;
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1294(InterfaceC1944 interfaceC1944) {
        C1954 c1954 = this.f3125;
        if (c1954 != null) {
            AbstractC1946.m3645(interfaceC1944, c1954.f5773);
        }
        String str = this.f3126;
        C1055 c1055 = new C1055(this, 1);
        InterfaceC5088[] interfaceC5088Arr = AbstractC1946.f5755;
        interfaceC1944.mo3590(AbstractC1959.f5792, new C1941(str, c1055));
        if (this.f3122) {
            this.f3124.mo1294(interfaceC1944);
        } else {
            interfaceC1944.mo3590(AbstractC1943.f5752, C5176.f14739);
        }
        mo1579(interfaceC1944);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1126() {
        m1972();
        if (this.f3131 == null) {
            this.f3129 = null;
        }
        InterfaceC1787 interfaceC1787 = this.f3116;
        if (interfaceC1787 != null) {
            m3368(interfaceC1787);
        }
        this.f3116 = null;
        C1025 c1025 = this.f3120;
        if (c1025 != null) {
            m3368(c1025);
        }
        this.f3120 = null;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        mo1127();
        if (!this.f3130) {
            m1967();
        }
        if (this.f3122) {
            m3364(this.f3124);
        }
    }

    @Override // p106.InterfaceC7307
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo1295(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1764
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Object mo1359() {
        return this.f3133;
    }

    @Override // androidx.compose.ui.node.InterfaceC1791
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1127() {
        if (this.f3127) {
            AbstractC1785.m3344(this, new C1055(this, 0));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏 */
    public void mo1928() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public void mo1579(InterfaceC1944 interfaceC1944) {
    }
}
