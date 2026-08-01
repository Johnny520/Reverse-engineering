package com.google.gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p259.C8244;
import p259.C8245;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3242 extends AbstractC3251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3251 f10912;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10913;

    public /* synthetic */ C3242(AbstractC3251 abstractC3251, int i) {
        this.f10913 = i;
        this.f10912 = abstractC3251;
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7322(C8244 c8244, Object obj) throws IOException {
        int i = this.f10913;
        AbstractC3251 abstractC3251 = this.f10912;
        switch (i) {
            case 0:
                abstractC3251.mo7322(c8244, Long.valueOf(((AtomicLong) obj).get()));
                break;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                c8244.m13773();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    abstractC3251.mo7322(c8244, Long.valueOf(atomicLongArray.get(i2)));
                }
                c8244.m13781();
                break;
        }
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) throws IOException {
        int i = this.f10913;
        AbstractC3251 abstractC3251 = this.f10912;
        switch (i) {
            case 0:
                return new AtomicLong(((Number) abstractC3251.mo7323(c8245)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                c8245.m13797();
                while (c8245.m13801()) {
                    arrayList.add(Long.valueOf(((Number) abstractC3251.mo7323(c8245)).longValue()));
                }
                c8245.m13804();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
        }
    }
}
