package yyds;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: renamed from: yyds.ᛵᲇᲀᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1233 extends AbstractC2720 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5652;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2720 f5653;

    public /* synthetic */ C1233(AbstractC2720 abstractC2720, int i) {
        this.f5652 = i;
        this.f5653 = abstractC2720;
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) {
        int i = this.f5652;
        AbstractC2720 abstractC2720 = this.f5653;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                c1942.m3746();
                while (c1942.m3753()) {
                    arrayList.add(Long.valueOf(((Number) abstractC2720.mo484(c1942)).longValue()));
                }
                c1942.m3750();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            default:
                return new AtomicLong(((Number) abstractC2720.mo484(c1942)).longValue());
        }
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) {
        int i = this.f5652;
        AbstractC2720 abstractC2720 = this.f5653;
        switch (i) {
            case 0:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                c1405.m2866();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    abstractC2720.mo485(c1405, Long.valueOf(atomicLongArray.get(i2)));
                }
                c1405.m2855();
                break;
            default:
                abstractC2720.mo485(c1405, Long.valueOf(((AtomicLong) obj).get()));
                break;
        }
    }
}
