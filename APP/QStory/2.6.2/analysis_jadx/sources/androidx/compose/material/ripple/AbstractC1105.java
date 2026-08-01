package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.app.C0108;
import androidx.appcompat.app.C0113;
import androidx.collection.C0244;
import androidx.collection.C0276;
import androidx.compose.foundation.C1030;
import androidx.compose.foundation.interaction.C0572;
import androidx.compose.foundation.interaction.C0575;
import androidx.compose.foundation.interaction.C0576;
import androidx.compose.foundation.interaction.InterfaceC0574;
import androidx.compose.foundation.interaction.InterfaceC0579;
import androidx.compose.material3.C1190;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.graphics.AbstractC1594;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.C1507;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1758;
import androidx.compose.ui.node.InterfaceC1776;
import androidx.compose.ui.node.InterfaceC1781;
import androidx.compose.ui.node.InterfaceC1783;
import androidx.compose.ui.platform.AbstractC1835;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.coroutines.AbstractC5398;
import p053.AbstractC6560;
import p112.C7328;
import p205.InterfaceC7895;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.material.ripple.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1105 extends AbstractC2128 implements InterfaceC1783, InterfaceC1781, InterfaceC1776 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f3238;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public long f3239 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C0244 f3240 = new C0244();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final InterfaceC0579 f3241;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public float f3242;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C1104 f3243;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C1190 f3244;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C0113 f3245;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final float f3246;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean f3247;

    public AbstractC1105(InterfaceC0579 interfaceC0579, boolean z, float f, C0113 c0113, C1190 c1190) {
        this.f3241 = interfaceC0579;
        this.f3247 = z;
        this.f3246 = f;
        this.f3245 = c0113;
        this.f3244 = c1190;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1283() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m1995(InterfaceC0574 interfaceC0574) {
        C1111 c1111;
        if (!(interfaceC0574 instanceof C0575)) {
            if (interfaceC0574 instanceof C0576) {
                C1111 c11112 = ((C1103) this).f3231;
                if (c11112 != null) {
                    c11112.m1998();
                    return;
                }
                return;
            }
            if (!(interfaceC0574 instanceof C0572) || (c1111 = ((C1103) this).f3231) == null) {
                return;
            }
            c1111.m1998();
            return;
        }
        C0575 c0575 = (C0575) interfaceC0574;
        long j = this.f3239;
        float f = this.f3242;
        C1103 c1103 = (C1103) this;
        C1098 c1098 = c1103.f3232;
        if (c1098 == null) {
            Object obj = (View) AbstractC1785.m3346(c1103, AbstractC1835.f5331);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    C0276.m848(obj, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    C1098 c10982 = new C1098(viewGroup.getContext());
                    viewGroup.addView(c10982);
                    c1098 = c10982;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof C1098) {
                        c1098 = (C1098) childAt;
                        break;
                    }
                    i++;
                }
            }
            c1103.f3232 = c1098;
        }
        ArrayList arrayList = c1098.f3228;
        C1108 c1108 = c1098.f3227;
        LinkedHashMap linkedHashMap = c1108.f3254;
        LinkedHashMap linkedHashMap2 = c1108.f3254;
        LinkedHashMap linkedHashMap3 = c1108.f3253;
        C1111 c11113 = (C1111) linkedHashMap.get(c1103);
        if (c11113 == null) {
            ArrayList arrayList2 = c1098.f3229;
            arrayList2.getClass();
            c11113 = (C1111) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (c11113 == null) {
                if (c1098.f3226 > AbstractC8189.m13673(arrayList)) {
                    c11113 = new C1111(c1098.getContext());
                    c1098.addView(c11113);
                    arrayList.add(c11113);
                } else {
                    c11113 = (C1111) arrayList.get(c1098.f3226);
                    C1103 c11032 = (C1103) linkedHashMap3.get(c11113);
                    if (c11032 != null) {
                        c11032.f3231 = null;
                        AbstractC1785.m3341(c11032);
                        C1111 c11114 = (C1111) linkedHashMap2.get(c11032);
                        if (c11114 != null) {
                        }
                        linkedHashMap2.remove(c11032);
                        c11113.m1999();
                    }
                }
                int i2 = c1098.f3226;
                if (i2 < c1098.f3230 - 1) {
                    c1098.f3226 = i2 + 1;
                } else {
                    c1098.f3226 = 0;
                }
            }
            linkedHashMap2.put(c1103, c11113);
            linkedHashMap3.put(c11113, c1103);
        }
        C1111 c11115 = c11113;
        int iM12006 = AbstractC6560.m12006(f);
        long jM427 = c1103.f3245.m427();
        c1103.f3244.invoke();
        c11115.m2000(c0575, c1103.f3247, j, iM12006, jM427, new C1030(c1103, 5));
        c1103.f3231 = c11115;
        AbstractC1785.m3341(c1103);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        AbstractC5398.m10473(m3857(), null, null, new RippleNode$onAttach$1(this, null), 3);
    }

    @Override // androidx.compose.ui.node.InterfaceC1776, androidx.compose.ui.node.InterfaceC1740
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1311(long j) {
        float fMo1334;
        this.f3238 = true;
        InterfaceC7895 interfaceC7895 = AbstractC1785.m3336(this).f5098;
        this.f3239 = AbstractC8189.m13654(j);
        float f = this.f3246;
        if (Float.isNaN(f)) {
            long j2 = this.f3239;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            fMo1334 = C7328.m12500((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)) / 2.0f;
            if (this.f3247) {
                fMo1334 += interfaceC7895.mo1334(10.0f);
            }
        } else {
            fMo1334 = interfaceC7895.mo1334(f);
        }
        this.f3242 = fMo1334;
        C0244 c0244 = this.f3240;
        Object[] objArr = c0244.f1005;
        int i = c0244.f1004;
        for (int i2 = 0; i2 < i; i2++) {
            m1995((InterfaceC0574) objArr[i2]);
        }
        c0244.m778();
    }

    @Override // androidx.compose.ui.node.InterfaceC1781
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1127(InterfaceC1506 interfaceC1506) throws Throwable {
        long j;
        C1758 c1758 = (C1758) interfaceC1506;
        C1507 c1507 = c1758.f5175;
        c1758.m3301();
        C1104 c1104 = this.f3243;
        if (c1104 != null) {
            float f = this.f3242;
            long jM427 = this.f3245.m427();
            float fFloatValue = ((Number) c1104.f3235.m1032()).floatValue();
            if (fFloatValue > 0.0f) {
                long jM2940 = C1599.m2940(fFloatValue, jM427);
                if (c1104.f3237) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (c1507.mo2695() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c1507.mo2695() & 4294967295L));
                    C0108 c0108 = c1507.f4283;
                    long jM367 = c0108.m367();
                    c0108.m385().mo2667();
                    try {
                        ((C0108) ((C0113) c0108.f319).f357).m385().mo2676(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                        j = jM367;
                    } catch (Throwable th) {
                        th = th;
                        j = jM367;
                    }
                    try {
                        InterfaceC1504.m2692(c1758, jM2940, f, 0L, 124);
                        c0108.m385().mo2679();
                        c0108.m360(j);
                    } catch (Throwable th2) {
                        th = th2;
                        c0108.m385().mo2679();
                        c0108.m360(j);
                        throw th;
                    }
                } else {
                    InterfaceC1504.m2692(c1758, jM2940, f, 0L, 124);
                }
            }
        }
        C1103 c1103 = (C1103) this;
        InterfaceC1601 interfaceC1601M385 = c1507.f4283.m385();
        C1111 c1111 = c1103.f3231;
        if (c1111 != null) {
            long j2 = c1103.f3239;
            int iM12006 = AbstractC6560.m12006(c1103.f3242);
            long jM4272 = c1103.f3245.m427();
            c1103.f3244.invoke();
            c1111.m1997(j2, jM4272, iM12006);
            c1111.draw(AbstractC1594.m2905(interfaceC1601M385));
        }
    }
}
