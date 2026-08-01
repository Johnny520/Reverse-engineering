package androidx.compose.animation.core;

import androidx.compose.foundation.layout.C0621;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.window.area.AbstractC2567;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0331 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0304 f1124;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC1395 f1125;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC1395 f1126;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0350 f1127;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f1128;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0358 f1129;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractC0343 f1130;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0299 f1131;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public AbstractC0343 f1132;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractC0343 f1133;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public AbstractC0343 f1134;

    public C0331(InterfaceC0358 interfaceC0358, Object obj, Object obj2) {
        this.f1129 = interfaceC0358;
        this.f1128 = obj2;
        C0350 c0350 = new C0350(interfaceC0358, obj, null, 60);
        this.f1127 = c0350;
        this.f1126 = AbstractC1367.m2474(Boolean.FALSE);
        this.f1125 = AbstractC1367.m2474(obj);
        this.f1124 = new C0304();
        this.f1131 = new C0299(obj2);
        AbstractC0343 abstractC0343 = c0350.f1200;
        boolean z = abstractC0343 instanceof C0347;
        AbstractC0343 abstractC03432 = z ? AbstractC0330.f1107 : abstractC0343 instanceof C0348 ? AbstractC0330.f1106 : abstractC0343 instanceof C0340 ? AbstractC0330.f1119 : AbstractC0330.f1118;
        this.f1130 = abstractC03432;
        AbstractC0343 abstractC03433 = z ? AbstractC0330.f1111 : abstractC0343 instanceof C0348 ? AbstractC0330.f1110 : abstractC0343 instanceof C0340 ? AbstractC0330.f1109 : AbstractC0330.f1108;
        this.f1133 = abstractC03433;
        this.f1134 = abstractC03432;
        this.f1132 = abstractC03433;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m1029(C0331 c0331, Object obj, InterfaceC0349 interfaceC0349, Object obj2, C0621 c0621, InterfaceC4357 interfaceC4357, int i) {
        if ((i & 2) != 0) {
            interfaceC0349 = c0331.f1131;
        }
        InterfaceC0349 interfaceC03492 = interfaceC0349;
        if ((i & 4) != 0) {
            obj2 = c0331.f1129.mo1061().invoke(c0331.f1127.f1200);
        }
        if ((i & 8) != 0) {
            c0621 = null;
        }
        Object objM1033 = c0331.m1033();
        InterfaceC0358 interfaceC0358 = c0331.f1129;
        return c0331.m1032(new C0374(interfaceC03492, interfaceC0358, objM1033, obj, (AbstractC0343) interfaceC0358.mo1062().invoke(obj2)), obj2, c0621, interfaceC4357);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1030(C0331 c0331) {
        C0350 c0350 = c0331.f1127;
        c0350.f1200.mo1038();
        c0350.f1197 = Long.MIN_VALUE;
        ((AbstractC1347) c0331.f1126).setValue(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m1031(Object obj, InterfaceC4357 interfaceC4357) {
        Object objM932 = C0304.m932(this.f1124, new Animatable$snapTo$2(this, obj, null), interfaceC4357);
        return objM932 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM932 : C5176.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m1032(InterfaceC0327 interfaceC0327, Object obj, InterfaceC6558 interfaceC6558, InterfaceC4357 interfaceC4357) {
        return C0304.m932(this.f1124, new Animatable$runAnimation$2(this, obj, interfaceC0327, this.f1127.f1197, interfaceC6558, null), interfaceC4357);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m1033() {
        return ((AbstractC1347) this.f1127.f1199).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m1034(Object obj) {
        if (!AbstractC4395.m8907(this.f1134, this.f1130) || !AbstractC4395.m8907(this.f1132, this.f1133)) {
            InterfaceC0358 interfaceC0358 = this.f1129;
            AbstractC0343 abstractC0343 = (AbstractC0343) interfaceC0358.mo1062().invoke(obj);
            int iMo1040 = abstractC0343.mo1040();
            boolean z = false;
            for (int i = 0; i < iMo1040; i++) {
                if (abstractC0343.mo1041(i) < this.f1134.mo1041(i) || abstractC0343.mo1041(i) > this.f1132.mo1041(i)) {
                    abstractC0343.mo1037(AbstractC2567.m5071(abstractC0343.mo1041(i), this.f1134.mo1041(i), this.f1132.mo1041(i)), i);
                    z = true;
                }
            }
            if (z) {
                return interfaceC0358.mo1061().invoke(abstractC0343);
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m1035(Float f, Float f2) {
        InterfaceC0358 interfaceC0358 = this.f1129;
        AbstractC0343 abstractC0343 = (AbstractC0343) interfaceC0358.mo1062().invoke(f);
        if (abstractC0343 == null) {
            abstractC0343 = this.f1130;
        }
        AbstractC0343 abstractC03432 = (AbstractC0343) interfaceC0358.mo1062().invoke(f2);
        if (abstractC03432 == null) {
            abstractC03432 = this.f1133;
        }
        int iMo1040 = abstractC0343.mo1040();
        for (int i = 0; i < iMo1040; i++) {
            if (abstractC0343.mo1041(i) > abstractC03432.mo1041(i)) {
                AbstractC0300.m928("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + abstractC0343 + " is greater than upper bound " + abstractC03432 + " on index " + i);
            }
        }
        this.f1134 = abstractC0343;
        this.f1132 = abstractC03432;
        if (((Boolean) ((AbstractC1347) this.f1126).getValue()).booleanValue()) {
            return;
        }
        Object objM1034 = m1034(m1033());
        if (AbstractC4395.m8907(objM1034, m1033())) {
            return;
        }
        ((AbstractC1347) this.f1127.f1199).setValue(objM1034);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object m1036(SuspendLambda suspendLambda) {
        Object objM932 = C0304.m932(this.f1124, new Animatable$stop$2(this, null), suspendLambda);
        return objM932 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM932 : C5176.f14739;
    }

    public /* synthetic */ C0331(Object obj, C0357 c0357, Object obj2, int i) {
        this(c0357, obj, (i & 4) != 0 ? null : obj2);
    }
}
