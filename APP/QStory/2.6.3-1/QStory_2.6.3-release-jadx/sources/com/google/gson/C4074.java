package com.google.gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p275.C9073;
import p275.C9074;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4074 extends AbstractC4083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4083 f11257;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f11258;

    public /* synthetic */ C4074(AbstractC4083 abstractC4083, int i) {
        this.f11258 = i;
        this.f11257 = abstractC4083;
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7881(C9073 c9073, Object obj) throws IOException {
        int i = this.f11258;
        AbstractC4083 abstractC4083 = this.f11257;
        switch (i) {
            case 0:
                abstractC4083.mo7881(c9073, Long.valueOf(((AtomicLong) obj).get()));
                break;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                c9073.m14332();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    abstractC4083.mo7881(c9073, Long.valueOf(atomicLongArray.get(i2)));
                }
                c9073.m14340();
                break;
        }
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7882(C9074 c9074) throws IOException {
        int i = this.f11258;
        AbstractC4083 abstractC4083 = this.f11257;
        switch (i) {
            case 0:
                return new AtomicLong(((Number) abstractC4083.mo7882(c9074)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                c9074.m14356();
                while (c9074.m14360()) {
                    arrayList.add(Long.valueOf(((Number) abstractC4083.mo7882(c9074)).longValue()));
                }
                c9074.m14363();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
        }
    }
}
