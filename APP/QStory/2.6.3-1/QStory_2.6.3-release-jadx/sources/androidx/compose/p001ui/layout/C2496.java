package androidx.compose.p001ui.layout;

import android.os.Handler;
import android.view.ViewGroup;
import androidx.activity.AbstractC0900;
import androidx.collection.AbstractC1132;
import androidx.collection.AbstractC1137;
import androidx.collection.C1082;
import androidx.collection.C1083;
import androidx.collection.C1089;
import androidx.collection.C1123;
import androidx.compose.p001ui.node.AbstractC2592;
import androidx.compose.p001ui.node.C2573;
import androidx.compose.p001ui.node.C2582;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2591;
import androidx.compose.p001ui.node.C2613;
import androidx.compose.p001ui.node.InterfaceC2640;
import androidx.compose.p001ui.node.LayoutNode$UsageByParent;
import androidx.compose.p001ui.platform.AbstractC2685;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.AbstractC2207;
import androidx.compose.runtime.AbstractC2209;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2198;
import androidx.compose.runtime.C2226;
import androidx.compose.runtime.InterfaceC2205;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.PausedCompositionState;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.composer.gapbuffer.C2069;
import androidx.compose.runtime.internal.C2077;
import androidx.compose.runtime.internal.C2086;
import androidx.compose.runtime.snapshots.AbstractC2109;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.snapshots.AbstractC2121;
import java.util.List;
import kotlin.C6008;
import kotlin.KotlinNothingValueException;
import kotlin.collections.C5183;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p142.C8269;
import p142.C8287;
import p226.AbstractC8765;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2496 implements InterfaceC2205 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f5204;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f5205;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C2059 f5206;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C1083 f5207;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C2549 f5208;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C1083 f5209;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final String f5210;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f5211;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f5212;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C2510 f5213;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C2501 f5214;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C1083 f5215;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C1083 f5216;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public AbstractC2207 f5217;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public InterfaceC2552 f5218;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2583 f5219;

    public C2496(C2583 c2583, InterfaceC2552 interfaceC2552) {
        this.f5219 = c2583;
        this.f5218 = interfaceC2552;
        long[] jArr = AbstractC1137.f1352;
        this.f5215 = new C1083();
        this.f5216 = new C1083();
        this.f5213 = new C2510(this);
        this.f5214 = new C2501(this);
        this.f5209 = new C1083();
        this.f5208 = new C2549();
        this.f5207 = new C1083();
        this.f5206 = new C2059(0, new Object[16]);
        this.f5210 = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m3621(C2500 c2500) {
        C1082 c1082;
        C2226 c2226 = c2500.f5226;
        if (c2226 != null) {
            c2226.f4391.set(PausedCompositionState.Cancelled);
            C2086 c2086 = c2226.f4393;
            if (((C1082) c2086.f3979).m1432()) {
                c1082 = (C1082) c2086.f3979;
                C1082 c10822 = AbstractC1132.f1342;
                c2086.f3979 = new C1082();
                ((C2059) c2086.f3975).m2612();
            } else {
                c1082 = null;
            }
            c2086.m2741();
            C2198 c2198 = c2226.f4390;
            c2198.f4301 = null;
            if (c1082 != null) {
                c2198.f4297.f3980 = c1082;
                c2198.f4289 = 2;
            }
            c2500.f5226 = null;
            C2198 c21982 = c2500.f5229;
            if (c21982 != null) {
                c21982.dispose();
            }
            c2500.f5229 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m3622(C2496 c2496, Object obj) {
        C2583 c2583 = c2496.f5219;
        c2496.m3627();
        C2583 c25832 = (C2583) c2496.f5209.m1318(obj);
        if (c25832 != null) {
            if (c2496.f5204 <= 0) {
                AbstractC8765.m13982("No pre-composed items to dispose");
            }
            int iM2614 = ((C2059) ((C1089) c2583.m3821()).f1239).m2614(c25832);
            if (iM2614 < ((C2059) ((C1089) c2583.m3821()).f1239).f3865 - c2496.f5204) {
                AbstractC8765.m13982("Item is not in pre-composed item range");
            }
            c2496.f5205++;
            c2496.f5204--;
            C2500 c2500 = (C2500) c2496.f5215.m1317(c25832);
            if (c2500 != null) {
                m3621(c2500);
            }
            int i = (((C2059) ((C1089) c2583.m3821()).f1239).f3865 - c2496.f5204) - c2496.f5205;
            c2496.m3632(iM2614, i);
            c2496.m3628(i);
        }
        if (c2496.f5206.m2611(obj)) {
            C2583.m3784(c2583, true, 6);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC2553 m3623(Object obj) {
        return !this.f5219.m3803() ? new C2507() : new C2506(this, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3624(C2500 c2500, boolean z) {
        C2226 c2226 = c2500.f5226;
        if (c2226 != null) {
            AbstractC2121 abstractC2121M2791 = AbstractC2109.m2791();
            InterfaceC7387 interfaceC7387Mo2763 = abstractC2121M2791 != null ? abstractC2121M2791.mo2763() : null;
            AbstractC2121 abstractC2121M2803 = AbstractC2109.m2803(abstractC2121M2791);
            try {
                C2583 c2583 = this.f5219;
                c2583.f5459 = true;
                if (z) {
                    while (!c2226.m3094()) {
                        try {
                            c2226.m3092(new C1123(16));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                c2226.m3096();
                c2500.f5226 = null;
                c2583.f5459 = false;
            } finally {
                AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo3064() {
        m3631(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // androidx.compose.runtime.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3065() {
        C2198 c2198;
        C2583 c2583 = this.f5219;
        c2583.f5459 = true;
        C1083 c1083 = this.f5215;
        Object[] objArr = c1083.f1224;
        long[] jArr = c1083.f1226;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (c2198 = ((C2500) objArr[(i << 3) + i3]).f5229) != null) {
                            c2198.dispose();
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
        c2583.m3787();
        c2583.f5459 = false;
        c1083.m1314();
        this.f5216.m1314();
        this.f5204 = 0;
        this.f5205 = 0;
        this.f5209.m1314();
        m3627();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C2583 m3625(Object obj) {
        C1083 c1083;
        int i;
        if (this.f5205 == 0) {
            return null;
        }
        C1089 c1089 = (C1089) this.f5219.m3821();
        int i2 = ((C2059) c1089.f1239).f3865 - this.f5204;
        int i3 = i2 - this.f5205;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            c1083 = this.f5215;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objM1317 = c1083.m1317((C2583) c1089.get(i5));
            objM1317.getClass();
            if (AbstractC5227.m9466(((C2500) objM1317).f5231, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                Object objM13172 = c1083.m1317((C2583) c1089.get(i4));
                objM13172.getClass();
                C2500 c2500 = (C2500) objM13172;
                Object obj2 = c2500.f5231;
                if (obj2 == AbstractC2505.f5239 || this.f5218.mo840(obj, obj2)) {
                    c2500.f5231 = obj;
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
            m3632(i5, i3);
        }
        this.f5205--;
        C2583 c2583 = (C2583) c1089.get(i3);
        Object objM13173 = c1083.m1317(c2583);
        objM13173.getClass();
        C2500 c25002 = (C2500) objM13173;
        c25002.f5233 = AbstractC2202.m3034(Boolean.TRUE);
        c25002.f5227 = true;
        c25002.f5228 = true;
        return c2583;
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
    */
    public final void m3626(C2583 c2583, Object obj, boolean z, InterfaceC7383 interfaceC7383) {
        boolean z2;
        C2198 c2198;
        C1083 c1083 = this.f5215;
        Object objM1317 = c1083.m1317(c2583);
        Object obj2 = objM1317;
        if (objM1317 == null) {
            C2077 c2077 = AbstractC2542.f5324;
            C2500 c2500 = new C2500();
            c2500.f5231 = obj;
            c2500.f5230 = c2077;
            c2500.f5229 = null;
            c2500.f5233 = AbstractC2202.m3034(Boolean.TRUE);
            c1083.m1315(c2583, c2500);
            obj2 = c2500;
        }
        final C2500 c25002 = (C2500) obj2;
        boolean z3 = c25002.f5230 != interfaceC7383;
        if (c25002.f5226 != null) {
            if (z3) {
                m3621(c25002);
            } else if (z) {
                return;
            } else {
                m3624(c25002, true);
            }
        }
        C2198 c21982 = c25002.f5229;
        if (c21982 != null) {
            synchronized (c21982.f4304) {
                z2 = c21982.f4292.f1222 > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || c25002.f5228) {
            c25002.f5230 = interfaceC7383;
            if (c25002.f5226 != null) {
                AbstractC8765.m13984("new subcompose call while paused composition is still active");
            }
            AbstractC2121 abstractC2121M2791 = AbstractC2109.m2791();
            InterfaceC7387 interfaceC7387Mo2763 = abstractC2121M2791 != null ? abstractC2121M2791.mo2763() : null;
            AbstractC2121 abstractC2121M2803 = AbstractC2109.m2803(abstractC2121M2791);
            try {
                C2583 c25832 = this.f5219;
                c25832.f5459 = true;
                C2198 c21983 = c25002.f5229;
                AbstractC2207 abstractC2207 = this.f5217;
                if (abstractC2207 == null) {
                    AbstractC8765.m13981("parent composition reference not set");
                    throw new KotlinNothingValueException();
                }
                if (c21983 == null) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = AbstractC2685.f5700;
                        c2198 = new C2198(abstractC2207, new C2613(c2583));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = AbstractC2685.f5700;
                        c2198 = new C2198(abstractC2207, new C2613(c2583));
                    }
                    c21983 = c2198;
                } else {
                    if (c21983.f4289 == 3) {
                        if (z) {
                        }
                        c21983 = c2198;
                    }
                }
                c25002.f5229 = c21983;
                final InterfaceC7383 c20772 = c25002.f5230;
                if (((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(this.f5219)).getOutOfFrameExecutor() != null) {
                    c25002.f5232 = false;
                } else {
                    c25002.f5232 = true;
                    c20772 = new C2077(1524156494, true, new InterfaceC7383() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$subcompose$4$1$composable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
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
                        public final void invoke(InterfaceC2208 interfaceC2208, int i) {
                            C2159 c2159 = (C2159) interfaceC2208;
                            if (!c2159.m2903(i & 1, (i & 3) != 2)) {
                                c2159.m2899();
                                return;
                            }
                            Boolean bool = (Boolean) ((AbstractC2182) c25002.f5233).getValue();
                            boolean zBooleanValue = bool.booleanValue();
                            InterfaceC7383 interfaceC73832 = c20772;
                            c2159.m2955(bool);
                            boolean zM2939 = c2159.m2939(zBooleanValue);
                            if (zBooleanValue) {
                                interfaceC73832.invoke(c2159, 0);
                            } else {
                                if (c2159.f4223 != 0) {
                                    AbstractC2209.m3067("No nodes can be emitted before calling deactivateToEndGroup");
                                }
                                if (!c2159.f4183) {
                                    if (zM2939) {
                                        C2069 c2069 = c2159.f4199;
                                        int i2 = c2069.f3904;
                                        int i3 = c2069.f3903;
                                        C8269 c8269 = c2159.f4189;
                                        c8269.getClass();
                                        c8269.m13214(false);
                                        c8269.f20489.f20497.m13211(C8287.f20518);
                                        AbstractC2202.m3063(c2159.f4209, i2, i3);
                                        c2159.f4199.m2634();
                                    } else {
                                        c2159.m2900();
                                    }
                                }
                            }
                            if (c2159.f4195 && c2159.f4199.f3907 == c2159.f4194) {
                                c2159.f4194 = -1;
                                c2159.f4195 = false;
                            }
                            c2159.m2937(false);
                        }

                        @Override // p068.InterfaceC7383
                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                            invoke((InterfaceC2208) obj3, ((Number) obj4).intValue());
                            return C6008.f15084;
                        }
                    });
                }
                if (z) {
                    if (c25002.f5227) {
                        c21983.m3027();
                        c21983.m3022();
                        c25002.f5226 = c21983.m3025(true, c20772);
                    } else {
                        c25002.f5226 = c21983.m3025(c21983.m3027(), c20772);
                    }
                } else if (c25002.f5227) {
                    c21983.m3027();
                    c21983.m3022();
                    C2159 c2159 = c21983.f4290;
                    c2159.f4194 = 0;
                    c2159.f4195 = true;
                    c21983.f4311.mo2877(c21983, c20772);
                    c2159.m2927();
                } else {
                    c21983.m3003(c20772);
                }
                c25002.f5227 = false;
                c25832.f5459 = false;
                AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
                c25002.f5228 = false;
            } catch (Throwable th) {
                AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m3627() {
        int i = ((C2059) ((C1089) this.f5219.m3821()).f1239).f3865;
        C1083 c1083 = this.f5215;
        if (c1083.f1222 != i) {
            AbstractC8765.m13984("Inconsistency between the count of nodes tracked by the state (" + c1083.f1222 + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.f5205) - this.f5204 < 0) {
            StringBuilder sbM710 = AbstractC0900.m710(i, "Incorrect state. Total children ", ". Reusable children ");
            sbM710.append(this.f5205);
            sbM710.append(". Precomposed children ");
            sbM710.append(this.f5204);
            AbstractC8765.m13984(sbM710.toString());
        }
        C1083 c10832 = this.f5209;
        if (c10832.f1222 == this.f5204) {
            return;
        }
        AbstractC8765.m13984("Incorrect state. Precomposed children " + this.f5204 + ". Map size " + c10832.f1222);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3628(int i) {
        boolean z;
        boolean z2 = false;
        this.f5205 = 0;
        List listM3821 = this.f5219.m3821();
        C1089 c1089 = (C1089) listM3821;
        int i2 = (((C2059) c1089.f1239).f3865 - this.f5204) - 1;
        if (i <= i2) {
            this.f5208.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objM1317 = this.f5215.m1317((C2583) c1089.get(i3));
                    objM1317.getClass();
                    this.f5208.f5330.m1326(((C2500) objM1317).f5231);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f5218.mo843(this.f5208);
            AbstractC2121 abstractC2121M2791 = AbstractC2109.m2791();
            InterfaceC7387 interfaceC7387Mo2763 = abstractC2121M2791 != null ? abstractC2121M2791.mo2763() : null;
            AbstractC2121 abstractC2121M2803 = AbstractC2109.m2803(abstractC2121M2791);
            z = false;
            while (i2 >= i) {
                try {
                    C2583 c2583 = (C2583) ((C1089) listM3821).get(i2);
                    Object objM13172 = this.f5215.m1317(c2583);
                    objM13172.getClass();
                    C2500 c2500 = (C2500) objM13172;
                    Object obj = c2500.f5231;
                    if (this.f5208.f5330.m1447(obj)) {
                        this.f5205++;
                        if (((Boolean) ((AbstractC2182) c2500.f5233).getValue()).booleanValue()) {
                            C2591 c2591 = c2583.f5477;
                            C2573 c2573 = c2591.f5512;
                            LayoutNode$UsageByParent layoutNode$UsageByParent = LayoutNode$UsageByParent.NotUsed;
                            c2573.f5372 = layoutNode$UsageByParent;
                            C2582 c2582 = c2591.f5510;
                            if (c2582 != null) {
                                c2582.f5423 = layoutNode$UsageByParent;
                            }
                            m3630(c2500, false);
                            if (c2500.f5232) {
                                z = true;
                            }
                        }
                    } else {
                        C2583 c25832 = this.f5219;
                        c25832.f5459 = true;
                        this.f5215.m1318(c2583);
                        C2198 c2198 = c2500.f5229;
                        if (c2198 != null) {
                            c2198.dispose();
                        }
                        this.f5219.m3786(i2, 1);
                        c25832.f5459 = false;
                    }
                    this.f5216.m1318(obj);
                    i2--;
                } catch (Throwable th) {
                    AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
                    throw th;
                }
            }
            AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
        } else {
            z = false;
        }
        if (z) {
            synchronized (AbstractC2115.f4090) {
                C1082 c1082 = AbstractC2115.f4097.f4042;
                if (c1082 != null) {
                    if (c1082.m1432()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                AbstractC2115.m2823();
            }
        }
        m3627();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m3629(Object obj, InterfaceC7383 interfaceC7383, boolean z) {
        C2583 c2583 = this.f5219;
        if (c2583.m3803()) {
            m3627();
            if (this.f5216.m1312(obj)) {
                return;
            }
            this.f5207.m1318(obj);
            C1083 c1083 = this.f5209;
            Object objM1317 = c1083.m1317(obj);
            if (objM1317 == null) {
                objM1317 = m3625(obj);
                if (objM1317 != null) {
                    m3632(((C2059) ((C1089) c2583.m3821()).f1239).m2614(objM1317), ((C2059) ((C1089) c2583.m3821()).f1239).f3865);
                    this.f5204++;
                } else {
                    int i = ((C2059) ((C1089) c2583.m3821()).f1239).f3865;
                    C2583 c25832 = new C2583(2);
                    c2583.f5459 = true;
                    c2583.m3797(i, c25832);
                    c2583.f5459 = false;
                    this.f5204++;
                    objM1317 = c25832;
                }
                c1083.m1315(obj, objM1317);
            }
            m3626((C2583) objM1317, obj, z, interfaceC7383);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m3630(final C2500 c2500, boolean z) {
        C2198 c2198;
        if (z || !c2500.f5232) {
            c2500.f5233 = AbstractC2202.m3034(Boolean.FALSE);
        } else {
            ((AbstractC2182) c2500.f5233).setValue(Boolean.FALSE);
        }
        if (c2500.f5226 != null) {
            m3621(c2500);
            return;
        }
        if (z) {
            C2198 c21982 = c2500.f5229;
            if (c21982 != null) {
                c21982.m3026();
                return;
            }
            return;
        }
        InterfaceC2640 outOfFrameExecutor = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(this.f5219)).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (c2500.f5232 || (c2198 = c2500.f5229) == null) {
                return;
            }
            c2198.m3026();
            return;
        }
        InterfaceC7372 interfaceC7372 = new InterfaceC7372() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$deactivateOutOfFrame$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3609invoke() {
                C2198 c21983;
                if (((Boolean) ((AbstractC2182) c2500.f5233).getValue()).booleanValue() || (c21983 = c2500.f5229) == null) {
                    return;
                }
                c21983.m3026();
            }

            @Override // p068.InterfaceC7372
            public /* bridge */ /* synthetic */ Object invoke() {
                m3609invoke();
                return C6008.f15084;
            }
        };
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = (ViewTreeObserverOnGlobalLayoutListenerC2719) outOfFrameExecutor;
        C5183 c5183 = viewTreeObserverOnGlobalLayoutListenerC2719.f5821;
        boolean zIsEmpty = c5183.isEmpty();
        c5183.addLast(interfaceC7372);
        if (zIsEmpty) {
            Handler handler = viewTreeObserverOnGlobalLayoutListenerC2719.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(viewTreeObserverOnGlobalLayoutListenerC2719.f5780);
            } else {
                C6755.m11869("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m3631(boolean z) {
        this.f5204 = 0;
        this.f5209.m1314();
        List listM3821 = this.f5219.m3821();
        int i = ((C2059) ((C1089) listM3821).f1239).f3865;
        if (this.f5205 != i) {
            this.f5205 = i;
            AbstractC2121 abstractC2121M2791 = AbstractC2109.m2791();
            InterfaceC7387 interfaceC7387Mo2763 = abstractC2121M2791 != null ? abstractC2121M2791.mo2763() : null;
            AbstractC2121 abstractC2121M2803 = AbstractC2109.m2803(abstractC2121M2791);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    C2583 c2583 = (C2583) ((C1089) listM3821).get(i2);
                    C2500 c2500 = (C2500) this.f5215.m1317(c2583);
                    if (c2500 != null && ((Boolean) ((AbstractC2182) c2500.f5233).getValue()).booleanValue()) {
                        C2591 c2591 = c2583.f5477;
                        C2573 c2573 = c2591.f5512;
                        LayoutNode$UsageByParent layoutNode$UsageByParent = LayoutNode$UsageByParent.NotUsed;
                        c2573.f5372 = layoutNode$UsageByParent;
                        C2582 c2582 = c2591.f5510;
                        if (c2582 != null) {
                            c2582.f5423 = layoutNode$UsageByParent;
                        }
                        m3630(c2500, z);
                        c2500.f5231 = AbstractC2505.f5239;
                    }
                } catch (Throwable th) {
                    AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
                    throw th;
                }
            }
            AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
            this.f5216.m1314();
        }
        m3627();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m3632(int i, int i2) {
        C2583 c2583 = this.f5219;
        c2583.f5459 = true;
        c2583.m3791(i, i2, 1);
        c2583.f5459 = false;
    }
}
