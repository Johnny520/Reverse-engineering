package com.google.gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p259.C8243;
import p259.C8244;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3241 extends AbstractC3250 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3250 f10907;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10908;

    public /* synthetic */ C3241(AbstractC3250 abstractC3250, int i) {
        this.f10908 = i;
        this.f10907 = abstractC3250;
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7335(C8243 c8243, Object obj) throws IOException {
        int i = this.f10908;
        AbstractC3250 abstractC3250 = this.f10907;
        switch (i) {
            case 0:
                abstractC3250.mo7335(c8243, Long.valueOf(((AtomicLong) obj).get()));
                break;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                c8243.m13756();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    abstractC3250.mo7335(c8243, Long.valueOf(atomicLongArray.get(i2)));
                }
                c8243.m13764();
                break;
        }
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7336(C8244 c8244) throws IOException {
        int i = this.f10908;
        AbstractC3250 abstractC3250 = this.f10907;
        switch (i) {
            case 0:
                return new AtomicLong(((Number) abstractC3250.mo7336(c8244)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                c8244.m13779();
                while (c8244.m13784()) {
                    arrayList.add(Long.valueOf(((Number) abstractC3250.mo7336(c8244)).longValue()));
                }
                c8244.m13786();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
        }
    }
}
