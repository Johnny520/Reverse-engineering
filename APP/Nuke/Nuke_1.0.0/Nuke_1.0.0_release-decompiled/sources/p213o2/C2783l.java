package p213o2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: o2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2783l extends AbstractC2770B {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8788a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC2770B f8789b;

    public /* synthetic */ C2783l(AbstractC2770B abstractC2770B, int i5) {
        this.f8788a = i5;
        this.f8789b = abstractC2770B;
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) {
        switch (this.f8788a) {
            case 0:
                return new AtomicLong(((Number) this.f8789b.mo4964b(c3390a)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                c3390a.m5639b();
                while (c3390a.m5647n()) {
                    arrayList.add(Long.valueOf(((Number) this.f8789b.mo4964b(c3390a)).longValue()));
                }
                c3390a.m5643h();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i5 = 0; i5 < size; i5++) {
                    atomicLongArray.set(i5, ((Long) arrayList.get(i5)).longValue());
                }
                return atomicLongArray;
        }
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        switch (this.f8788a) {
            case 0:
                this.f8789b.mo4965c(c3391b, Long.valueOf(((AtomicLong) obj).get()));
                break;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                c3391b.m5659c();
                int length = atomicLongArray.length();
                for (int i5 = 0; i5 < length; i5++) {
                    this.f8789b.mo4965c(c3391b, Long.valueOf(atomicLongArray.get(i5)));
                }
                c3391b.m5662h();
                break;
        }
    }
}
