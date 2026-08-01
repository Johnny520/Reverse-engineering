package com.alibaba.fastjson2;

import androidx.compose.p001ui.input.pointer.util.VelocityTracker1D$Strategy;
import com.alibaba.fastjson2.reader.C3635;
import com.alibaba.fastjson2.reader.InterfaceC3621;
import com.alibaba.fastjson2.util.AbstractC3699;
import java.lang.reflect.Type;
import java.time.ZoneId;
import p123.C8141;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3776 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f9663;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object f9664;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long f9665;

    public C3776() {
        VelocityTracker1D$Strategy velocityTracker1D$Strategy = VelocityTracker1D$Strategy.Lsq2;
        this.f9664 = new C8141(false, velocityTracker1D$Strategy);
        this.f9663 = new C8141(false, velocityTracker1D$Strategy);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public ZoneId m6969() {
        if (((ZoneId) this.f9664) == null) {
            this.f9664 = AbstractC3699.f9372;
        }
        return (ZoneId) this.f9664;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC3621 m6970(Class cls, String str) {
        return ((C3635) this.f9663).m6189(str, cls, this.f9665);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC3621 m6971(Type type) {
        return ((C3635) this.f9663).m6193(type, (this.f9665 & JSONReader$Feature.FieldBased.mask) != 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m6972(JSONReader$Feature... jSONReader$FeatureArr) {
        for (JSONReader$Feature jSONReader$Feature : jSONReader$FeatureArr) {
            this.f9665 |= jSONReader$Feature.mask;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m6973(long j, long j2) {
        ((C8141) this.f9664).m13067(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((C8141) this.f9663).m13067(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    public C3776(C3635 c3635) {
        String str = AbstractC3766.f9634;
        this.f9665 = 0L;
        this.f9663 = c3635;
        this.f9664 = null;
    }

    public C3776(C3635 c3635, long j) {
        this.f9665 = j;
        this.f9663 = c3635;
        String str = AbstractC3766.f9634;
        this.f9664 = null;
    }
}
