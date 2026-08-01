package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.activity.compose.C0849;
import androidx.collection.AbstractC1119;
import androidx.collection.C1101;
import androidx.compose.foundation.interaction.C1413;
import androidx.compose.foundation.interaction.C1414;
import androidx.compose.foundation.interaction.C1416;
import androidx.compose.foundation.interaction.C1418;
import androidx.compose.foundation.interaction.C1422;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.p001ui.input.pointer.C2462;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.InterfaceC2596;
import androidx.compose.p001ui.node.InterfaceC2599;
import androidx.compose.p001ui.node.InterfaceC2618;
import androidx.compose.p001ui.node.InterfaceC2622;
import androidx.compose.p001ui.node.InterfaceC2626;
import androidx.compose.p001ui.node.InterfaceC2631;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.platform.InterfaceC2698;
import androidx.compose.p001ui.semantics.AbstractC2778;
import androidx.compose.p001ui.semantics.AbstractC2781;
import androidx.compose.p001ui.semantics.AbstractC2794;
import androidx.compose.p001ui.semantics.C2776;
import androidx.compose.p001ui.semantics.C2789;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.InterfaceC5920;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.internal.C6183;
import p068.InterfaceC7372;
import p122.AbstractC8137;
import p122.InterfaceC8136;
import p126.C8150;
import p126.InterfaceC8149;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1892 extends AbstractC2623 implements InterfaceC2631, InterfaceC8136, InterfaceC2596, InterfaceC2599, InterfaceC2618, InterfaceC2626, InterfaceC8149, InterfaceC1864 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static final C1924 f3457 = new C1924();

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public long f3458;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public C1416 f3459;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public C1416 f3460;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public InterfaceC2622 f3461;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final C1101 f3462;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public C1418 f3463;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C2462 f3464;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public C1863 f3465;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public InterfaceC7372 f3466;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f3467;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public InterfaceC1933 f3468;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C1862 f3469;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C2789 f3470;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public String f3471;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f3472;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public InterfaceC1933 f3473;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC1421 f3474;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public boolean f3475;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public InterfaceC1421 f3476;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public C6249 f3477;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final C1924 f3478;

    public AbstractC1892(InterfaceC1421 interfaceC1421, InterfaceC1933 interfaceC1933, boolean z, boolean z2, String str, C2789 c2789, InterfaceC7372 interfaceC7372) {
        this.f3474 = interfaceC1421;
        this.f3473 = interfaceC1933;
        this.f3472 = z;
        this.f3471 = str;
        this.f3470 = c2789;
        this.f3467 = z2;
        this.f3466 = interfaceC7372;
        this.f3469 = new C1862(interfaceC1421, 0, new AbstractClickableNode$focusableNode$1(this));
        int i = AbstractC1119.f1322;
        this.f3462 = new C1101(6);
        this.f3458 = 0L;
        InterfaceC1421 interfaceC14212 = this.f3474;
        this.f3476 = interfaceC14212;
        this.f3475 = interfaceC14212 == null;
        this.f3478 = f3457;
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
    @Override // p122.InterfaceC8136
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1850(KeyEvent keyEvent) {
        boolean z;
        m2527();
        long jM13063 = AbstractC8137.m13063(keyEvent);
        boolean z2 = this.f3467;
        C1101 c1101 = this.f3462;
        if (!z2 || AbstractC8137.m13062(keyEvent) != 2 || !AbstractC1910.m2552(keyEvent)) {
            if (this.f3467 && AbstractC8137.m13062(keyEvent) == 1 && AbstractC1910.m2552(keyEvent)) {
                C1416 c1416 = (C1416) c1101.m1372(jM13063);
                if (c1416 != null) {
                    if (this.f3474 != null) {
                        AbstractC6231.m11036(m4427(), null, null, new AbstractClickableNode$onKeyEvent$2(this, c1416, null), 3);
                    }
                    mo2495(keyEvent);
                }
                if (c1416 != null) {
                    return true;
                }
            }
            return false;
        }
        if (c1101.m1376(jM13063)) {
            z = false;
        } else {
            C1416 c14162 = new C1416(this.f3458);
            c1101.m1378(c14162, jM13063);
            if (this.f3474 != null) {
                AbstractC6231.m11036(m4427(), null, null, new AbstractClickableNode$onKeyEvent$1(this, c14162, null), 3);
            }
            z = true;
        }
        if (!mo2489(keyEvent) && !z) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public void mo1784() {
        C1418 c1418;
        InterfaceC1421 interfaceC1421 = this.f3474;
        if (interfaceC1421 != null && (c1418 = this.f3463) != null) {
            ((C1414) interfaceC1421).m1913(new C1422(c1418));
        }
        this.f3463 = null;
        C2462 c2462 = this.f3464;
        if (c2462 != null) {
            c2462.mo1784();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public void mo1851(C2487 c2487, PointerEventPass pointerEventPass, long j) {
        C2462 c2462Mo2490;
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.f3458 = (((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L);
        m2527();
        if (this.f3467) {
            if (this.f3465 == null) {
                C1863 c1863 = new C1863(this);
                m3924(c1863);
                this.f3465 = c1863;
            }
            if (pointerEventPass == PointerEventPass.Main) {
                int i = c2487.f5192;
                if (i == 4) {
                    AbstractC6231.m11036(m4427(), null, null, new AbstractClickableNode$onPointerEvent$1(this, null), 3);
                } else if (i == 5) {
                    AbstractC6231.m11036(m4427(), null, null, new AbstractClickableNode$onPointerEvent$2(this, null), 3);
                }
            }
        }
        if (this.f3464 == null && (c2462Mo2490 = mo2490()) != null) {
            m3924(c2462Mo2490);
            this.f3464 = c2462Mo2490;
        }
        C2462 c2462 = this.f3464;
        if (c2462 != null) {
            c2462.mo1851(c2487, pointerEventPass, j);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪 */
    public abstract boolean mo2489(KeyEvent keyEvent);

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public final void m2525(C2478 c2478) {
        InterfaceC1421 interfaceC1421 = this.f3474;
        if (interfaceC1421 != null) {
            C1416 c1416 = new C1416(c2478.f5152);
            if (m2531(c2478)) {
                this.f3477 = AbstractC6231.m11036(m4427(), null, null, new AbstractClickableNode$handlePressInteractionStart$2$1(interfaceC1421, c1416, this, null), 3);
            } else {
                this.f3460 = c1416;
                AbstractC6231.m11036(m4427(), null, null, new AbstractClickableNode$handlePressInteractionStart$2$2(interfaceC1421, c1416, null), 3);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public final void m2526(long j, boolean z) {
        InterfaceC1421 interfaceC1421 = this.f3474;
        if (interfaceC1421 != null) {
            C6249 c6249 = this.f3477;
            if (c6249 == null || !c6249.mo11121()) {
                C1416 c1416 = z ? this.f3459 : this.f3460;
                if (c1416 != null) {
                    AbstractC6231.m11036(m4427(), null, null, new AbstractClickableNode$handlePressInteractionRelease$1$2$1(c1416, interfaceC1421, null), 3);
                }
            } else {
                c6249.mo10815(null);
                AbstractC6231.m11036(m4427(), null, null, new AbstractClickableNode$handlePressInteractionRelease$1$1(c6249, j, interfaceC1421, null), 3);
            }
            if (z) {
                this.f3459 = null;
            } else {
                this.f3460 = null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public final void m2527() {
        if (this.f3461 != null) {
            return;
        }
        InterfaceC1933 interfaceC1933 = this.f3472 ? this.f3468 : this.f3473;
        if (interfaceC1933 != null) {
            if (this.f3474 == null) {
                this.f3474 = new C1414();
            }
            this.f3469.m2486(this.f3474);
            InterfaceC1421 interfaceC1421 = this.f3474;
            interfaceC1421.getClass();
            InterfaceC2622 interfaceC2622Mo2504 = interfaceC1933.mo2504(interfaceC1421);
            m3924(interfaceC2622Mo2504);
            this.f3461 = interfaceC2622Mo2504;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public final void m2528(C8150 c8150) {
        InterfaceC1421 interfaceC1421 = this.f3474;
        if (interfaceC1421 != null) {
            C1416 c1416 = new C1416(c8150.f19863);
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            AbstractC2620.m3896(this, C1863.f3347, new C1859(new C0849(c8150, 5, ref$BooleanRef), 0));
            if (ref$BooleanRef.element || AbstractC1870.m2496(this)) {
                this.f3477 = AbstractC6231.m11036(m4427(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$1(interfaceC1421, c1416, this, null), 3);
            } else {
                this.f3459 = c1416;
                AbstractC6231.m11036(m4427(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$2(interfaceC1421, c1416, null), 3);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏 */
    public C2462 mo2490() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final long m2529(long j) {
        long jMo1902 = AbstractC2620.m3906(this).f5444.mo1902(((InterfaceC2698) AbstractC2620.m3916(this, AbstractC2737.f5921)).mo3839());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jMo1902 >> 32)) - ((int) (j >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo1902 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final void m2530(boolean z) {
        InterfaceC1421 interfaceC1421 = this.f3474;
        if (interfaceC1421 != null) {
            C6249 c6249 = this.f3477;
            int i = 1;
            if (c6249 == null || !c6249.mo11121()) {
                C1416 c1416 = z ? this.f3459 : this.f3460;
                if (c1416 != null) {
                    C1413 c1413 = new C1413(c1416);
                    InterfaceC6284 interfaceC6284 = (InterfaceC6284) ((C6183) m4427()).f15266.get(C6285.f15450);
                    AbstractC6231.m11036(m4427(), null, null, new AbstractClickableNode$handlePressInteractionCancel$1$1$1(interfaceC1421, c1413, interfaceC6284 != null ? interfaceC6284.mo11118(new C0849(interfaceC1421, i, c1413)) : null, null), 3);
                }
            } else {
                C6249 c62492 = this.f3477;
                if (c62492 != null) {
                    c62492.mo10815(null);
                }
            }
            if (z) {
                this.f3459 = null;
            } else {
                this.f3460 = null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final boolean m2531(C2478 c2478) {
        boolean z;
        C1924 c1924 = C1863.f3347;
        int i = 0;
        if (c2478 == null) {
            InterfaceC2599 interfaceC2599M3921 = AbstractC2620.m3921(this, c1924);
            C1863 c1863 = interfaceC2599M3921 instanceof C1863 ? (C1863) interfaceC2599M3921 : null;
            z = (c1863 != null ? c1863.f3348 : null) != null;
        } else {
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            AbstractC2620.m3896(this, c1924, new C1859(new C0849(c2478, 4, ref$BooleanRef), i));
            z = ref$BooleanRef.element;
        }
        return z || AbstractC1870.m2496(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2532() {
        InterfaceC1421 interfaceC1421 = this.f3474;
        C1101 c1101 = this.f3462;
        if (interfaceC1421 != null) {
            C1416 c1416 = this.f3460;
            if (c1416 != null) {
                ((C1414) interfaceC1421).m1913(new C1413(c1416));
            }
            C1416 c14162 = this.f3459;
            if (c14162 != null) {
                ((C1414) interfaceC1421).m1913(new C1413(c14162));
            }
            C1418 c1418 = this.f3463;
            if (c1418 != null) {
                ((C1414) interfaceC1421).m1913(new C1422(c1418));
            }
            Object[] objArr = c1101.f1272;
            long[] jArr = c1101.f1274;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ((C1414) interfaceC1421).m1913(new C1413((C1416) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.f3460 = null;
        this.f3459 = null;
        this.f3463 = null;
        c1101.m1377();
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲 */
    public abstract void mo2495(KeyEvent keyEvent);

    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2533(InterfaceC1421 interfaceC1421, InterfaceC1933 interfaceC1933, boolean z, boolean z2, String str, C2789 c2789, InterfaceC7372 interfaceC7372) {
        boolean z3;
        InterfaceC2622 interfaceC2622;
        boolean z4 = true;
        if (AbstractC5227.m9466(this.f3476, interfaceC1421)) {
            z3 = false;
        } else {
            m2532();
            this.f3476 = interfaceC1421;
            this.f3474 = interfaceC1421;
            z3 = true;
        }
        if (!AbstractC5227.m9466(this.f3473, interfaceC1933)) {
            this.f3473 = interfaceC1933;
            z3 = true;
        }
        if (this.f3472 != z) {
            this.f3472 = z;
            if (z) {
                mo1687();
            }
            z3 = true;
        }
        boolean z5 = this.f3467;
        C1862 c1862 = this.f3469;
        if (z5 != z2) {
            if (z2) {
                m3924(c1862);
            } else {
                m3928(c1862);
                m2532();
            }
            AbstractC2620.m3914(this);
            this.f3467 = z2;
        }
        if (!AbstractC5227.m9466(this.f3471, str)) {
            this.f3471 = str;
            AbstractC2620.m3914(this);
        }
        if (!AbstractC5227.m9466(this.f3470, c2789)) {
            this.f3470 = c2789;
            AbstractC2620.m3914(this);
        }
        this.f3466 = interfaceC7372;
        boolean z6 = this.f3475;
        InterfaceC1421 interfaceC14212 = this.f3476;
        if (z6 == (interfaceC14212 == null)) {
            z4 = z3;
        } else {
            boolean z7 = interfaceC14212 == null;
            this.f3475 = z7;
            if (z7 || this.f3461 != null) {
            }
        }
        if (z4 && ((interfaceC2622 = this.f3461) != null || !this.f3475)) {
            if (interfaceC2622 != null) {
                m3928(interfaceC2622);
            }
            this.f3461 = null;
            m2527();
        }
        c1862.m2486(this.f3474);
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1853() {
        return false;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2596
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public final boolean mo2256() {
        return true;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2596
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1854(InterfaceC2779 interfaceC2779) {
        C2789 c2789 = this.f3470;
        if (c2789 != null) {
            AbstractC2781.m4205(interfaceC2779, c2789.f6118);
        }
        String str = this.f3471;
        C1893 c1893 = new C1893(this, 1);
        InterfaceC5920[] interfaceC5920Arr = AbstractC2781.f6100;
        interfaceC2779.mo4150(AbstractC2794.f6137, new C2776(str, c1893));
        if (this.f3467) {
            this.f3469.mo1854(interfaceC2779);
        } else {
            interfaceC2779.mo4150(AbstractC2778.f6097, C6008.f15084);
        }
        mo2139(interfaceC2779);
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        m2532();
        if (this.f3476 == null) {
            this.f3474 = null;
        }
        InterfaceC2622 interfaceC2622 = this.f3461;
        if (interfaceC2622 != null) {
            m3928(interfaceC2622);
        }
        this.f3461 = null;
        C1863 c1863 = this.f3465;
        if (c1863 != null) {
            m3928(c1863);
        }
        this.f3465 = null;
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        mo1687();
        if (!this.f3475) {
            m2527();
        }
        if (this.f3467) {
            m3924(this.f3469);
        }
    }

    @Override // p122.InterfaceC8136
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo1855(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2599
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Object mo1919() {
        return this.f3478;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2626
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1687() {
        if (this.f3472) {
            AbstractC2620.m3904(this, new C1893(this, 0));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏 */
    public void mo2488() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public void mo2139(InterfaceC2779 interfaceC2779) {
    }
}
