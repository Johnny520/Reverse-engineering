package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.app.C0955;
import androidx.appcompat.app.C0960;
import androidx.collection.C1091;
import androidx.collection.C1123;
import androidx.compose.foundation.C1868;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.foundation.interaction.C1413;
import androidx.compose.foundation.interaction.C1416;
import androidx.compose.foundation.interaction.C1417;
import androidx.compose.foundation.interaction.InterfaceC1415;
import androidx.compose.foundation.interaction.InterfaceC1420;
import androidx.compose.material3.C2025;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.graphics.AbstractC2429;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2341;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.C2593;
import androidx.compose.p001ui.node.InterfaceC2611;
import androidx.compose.p001ui.node.InterfaceC2616;
import androidx.compose.p001ui.node.InterfaceC2618;
import androidx.compose.p001ui.platform.AbstractC2670;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.coroutines.AbstractC6231;
import p050.AbstractC7176;
import p069.AbstractC7390;
import p128.C8158;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.material.ripple.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1943 extends AbstractC2961 implements InterfaceC2618, InterfaceC2616, InterfaceC2611 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f3584;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public long f3585 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C1091 f3586 = new C1091();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final InterfaceC1420 f3587;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public float f3588;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C1942 f3589;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C2025 f3590;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C0960 f3591;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final float f3592;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean f3593;

    public AbstractC1943(InterfaceC1420 interfaceC1420, boolean z, float f, C0960 c0960, C2025 c2025) {
        this.f3587 = interfaceC1420;
        this.f3593 = z;
        this.f3592 = f;
        this.f3591 = c0960;
        this.f3590 = c2025;
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1853() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m2565(InterfaceC1415 interfaceC1415) {
        C1949 c1949;
        if (!(interfaceC1415 instanceof C1416)) {
            if (interfaceC1415 instanceof C1417) {
                C1949 c19492 = ((C1941) this).f3577;
                if (c19492 != null) {
                    c19492.m2568();
                    return;
                }
                return;
            }
            if (!(interfaceC1415 instanceof C1413) || (c1949 = ((C1941) this).f3577) == null) {
                return;
            }
            c1949.m2568();
            return;
        }
        C1416 c1416 = (C1416) interfaceC1415;
        long j = this.f3585;
        float f = this.f3588;
        C1941 c1941 = (C1941) this;
        C1936 c1936 = c1941.f3578;
        if (c1936 == null) {
            Object obj = (View) AbstractC2620.m3916(c1941, AbstractC2670.f5677);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    C1123.m1409(obj, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    C1936 c19362 = new C1936(viewGroup.getContext());
                    viewGroup.addView(c19362);
                    c1936 = c19362;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof C1936) {
                        c1936 = (C1936) childAt;
                        break;
                    }
                    i++;
                }
            }
            c1941.f3578 = c1936;
        }
        ArrayList arrayList = c1936.f3574;
        C1946 c1946 = c1936.f3573;
        LinkedHashMap linkedHashMap = c1946.f3600;
        LinkedHashMap linkedHashMap2 = c1946.f3600;
        LinkedHashMap linkedHashMap3 = c1946.f3599;
        C1949 c19493 = (C1949) linkedHashMap.get(c1941);
        if (c19493 == null) {
            ArrayList arrayList2 = c1936.f3575;
            arrayList2.getClass();
            c19493 = (C1949) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (c19493 == null) {
                if (c1936.f3572 > AbstractC7176.m12460(arrayList)) {
                    c19493 = new C1949(c1936.getContext());
                    c1936.addView(c19493);
                    arrayList.add(c19493);
                } else {
                    c19493 = (C1949) arrayList.get(c1936.f3572);
                    C1941 c19412 = (C1941) linkedHashMap3.get(c19493);
                    if (c19412 != null) {
                        c19412.f3577 = null;
                        AbstractC2620.m3911(c19412);
                        C1949 c19494 = (C1949) linkedHashMap2.get(c19412);
                        if (c19494 != null) {
                        }
                        linkedHashMap2.remove(c19412);
                        c19493.m2569();
                    }
                }
                int i2 = c1936.f3572;
                if (i2 < c1936.f3576 - 1) {
                    c1936.f3572 = i2 + 1;
                } else {
                    c1936.f3572 = 0;
                }
            }
            linkedHashMap2.put(c1941, c19493);
            linkedHashMap3.put(c19493, c1941);
        }
        C1949 c19495 = c19493;
        int iM12617 = AbstractC7390.m12617(f);
        long jM988 = c1941.f3591.m988();
        c1941.f3590.invoke();
        c19495.m2570(c1416, c1941.f3593, j, iM12617, jM988, new C1868(c1941, 5));
        c1941.f3577 = c19495;
        AbstractC2620.m3911(c1941);
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        AbstractC6231.m11036(m4427(), null, null, new RippleNode$onAttach$1(this, null), 3);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2611, androidx.compose.p001ui.node.InterfaceC2575
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1881(long j) {
        float fMo1904;
        this.f3584 = true;
        InterfaceC8725 interfaceC8725 = AbstractC2620.m3906(this).f5444;
        this.f3585 = AbstractC1298.m1700(j);
        float f = this.f3592;
        if (Float.isNaN(f)) {
            long j2 = this.f3585;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            fMo1904 = C8158.m13086((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)) / 2.0f;
            if (this.f3593) {
                fMo1904 += interfaceC8725.mo1904(10.0f);
            }
        } else {
            fMo1904 = interfaceC8725.mo1904(f);
        }
        this.f3588 = fMo1904;
        C1091 c1091 = this.f3586;
        Object[] objArr = c1091.f1350;
        int i = c1091.f1349;
        for (int i2 = 0; i2 < i; i2++) {
            m2565((InterfaceC1415) objArr[i2]);
        }
        c1091.m1339();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2616
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1688(InterfaceC2341 interfaceC2341) throws Throwable {
        long j;
        C2593 c2593 = (C2593) interfaceC2341;
        C2342 c2342 = c2593.f5521;
        c2593.m3871();
        C1942 c1942 = this.f3589;
        if (c1942 != null) {
            float f = this.f3588;
            long jM988 = this.f3591.m988();
            float fFloatValue = ((Number) c1942.f3581.m1593()).floatValue();
            if (fFloatValue > 0.0f) {
                long jM3510 = C2434.m3510(fFloatValue, jM988);
                if (c1942.f3583) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (c2342.mo3265() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c2342.mo3265() & 4294967295L));
                    C0955 c0955 = c2342.f4629;
                    long jM928 = c0955.m928();
                    c0955.m946().mo3237();
                    try {
                        ((C0955) ((C0960) c0955.f664).f702).m946().mo3246(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                        j = jM928;
                    } catch (Throwable th) {
                        th = th;
                        j = jM928;
                    }
                    try {
                        InterfaceC2339.m3262(c2593, jM3510, f, 0L, 124);
                        c0955.m946().mo3249();
                        c0955.m921(j);
                    } catch (Throwable th2) {
                        th = th2;
                        c0955.m946().mo3249();
                        c0955.m921(j);
                        throw th;
                    }
                } else {
                    InterfaceC2339.m3262(c2593, jM3510, f, 0L, 124);
                }
            }
        }
        C1941 c1941 = (C1941) this;
        InterfaceC2436 interfaceC2436M946 = c2342.f4629.m946();
        C1949 c1949 = c1941.f3577;
        if (c1949 != null) {
            long j2 = c1941.f3585;
            int iM12617 = AbstractC7390.m12617(c1941.f3588);
            long jM9882 = c1941.f3591.m988();
            c1941.f3590.invoke();
            c1949.m2567(j2, jM9882, iM12617);
            c1949.draw(AbstractC2429.m3475(interfaceC2436M946));
        }
    }
}
