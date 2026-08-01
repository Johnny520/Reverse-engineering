package com.alibaba.fastjson2;

import androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy;
import com.alibaba.fastjson2.reader.C2802;
import com.alibaba.fastjson2.reader.InterfaceC2788;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Type;
import java.time.ZoneId;
import p107.C7312;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2943 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f9318;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object f9319;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long f9320;

    public C2943() {
        VelocityTracker1D$Strategy velocityTracker1D$Strategy = VelocityTracker1D$Strategy.Lsq2;
        this.f9319 = new C7312(false, velocityTracker1D$Strategy);
        this.f9318 = new C7312(false, velocityTracker1D$Strategy);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public ZoneId m6409() {
        if (((ZoneId) this.f9319) == null) {
            this.f9319 = AbstractC2866.f9027;
        }
        return (ZoneId) this.f9319;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC2788 m6410(Class cls, String str) {
        return ((C2802) this.f9318).m5629(str, cls, this.f9320);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC2788 m6411(Type type) {
        return ((C2802) this.f9318).m5633(type, (this.f9320 & JSONReader$Feature.FieldBased.mask) != 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m6412(JSONReader$Feature... jSONReader$FeatureArr) {
        for (JSONReader$Feature jSONReader$Feature : jSONReader$FeatureArr) {
            this.f9320 |= jSONReader$Feature.mask;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m6413(long j, long j2) {
        ((C7312) this.f9319).m12508(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((C7312) this.f9318).m12508(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    public C2943(C2802 c2802) {
        String str = AbstractC2933.f9289;
        this.f9320 = 0L;
        this.f9318 = c2802;
        this.f9319 = null;
    }

    public C2943(C2802 c2802, long j) {
        this.f9320 = j;
        this.f9318 = c2802;
        String str = AbstractC2933.f9289;
        this.f9319 = null;
    }
}
