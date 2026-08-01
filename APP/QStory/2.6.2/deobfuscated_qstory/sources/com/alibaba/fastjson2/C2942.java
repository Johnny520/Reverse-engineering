package com.alibaba.fastjson2;

import androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy;
import com.alibaba.fastjson2.reader.C2801;
import com.alibaba.fastjson2.reader.InterfaceC2787;
import com.alibaba.fastjson2.util.AbstractC2865;
import java.lang.reflect.Type;
import java.time.ZoneId;
import p107.C7311;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2942 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f9316;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object f9317;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long f9318;

    public C2942() {
        VelocityTracker1D$Strategy velocityTracker1D$Strategy = VelocityTracker1D$Strategy.Lsq2;
        this.f9317 = new C7311(false, velocityTracker1D$Strategy);
        this.f9316 = new C7311(false, velocityTracker1D$Strategy);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public ZoneId m6351() {
        if (((ZoneId) this.f9317) == null) {
            this.f9317 = AbstractC2865.f9025;
        }
        return (ZoneId) this.f9317;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC2787 m6352(Class cls, String str) {
        return ((C2801) this.f9316).m5584(str, cls, this.f9318);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC2787 m6353(Type type) {
        return ((C2801) this.f9316).m5588(type, (this.f9318 & JSONReader$Feature.FieldBased.mask) != 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m6354(JSONReader$Feature... jSONReader$FeatureArr) {
        for (JSONReader$Feature jSONReader$Feature : jSONReader$FeatureArr) {
            this.f9318 |= jSONReader$Feature.mask;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m6355(long j, long j2) {
        ((C7311) this.f9317).m12481(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((C7311) this.f9316).m12481(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    public C2942(C2801 c2801) {
        String str = AbstractC2932.f9287;
        this.f9318 = 0L;
        this.f9316 = c2801;
        this.f9317 = null;
    }

    public C2942(C2801 c2801, long j) {
        this.f9318 = j;
        this.f9316 = c2801;
        String str = AbstractC2932.f9287;
        this.f9317 = null;
    }
}
