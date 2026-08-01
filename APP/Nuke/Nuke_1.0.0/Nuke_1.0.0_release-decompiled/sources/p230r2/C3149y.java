package p230r2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p213o2.AbstractC2770B;
import p213o2.C2789r;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.y */
/* JADX INFO: loaded from: classes.dex */
public class C3149y extends AbstractC2770B {
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) {
        ArrayList arrayList = new ArrayList();
        c3390a.m5639b();
        while (c3390a.m5647n()) {
            try {
                arrayList.add(Integer.valueOf(c3390a.m5622A()));
            } catch (NumberFormatException e5) {
                throw new C2789r(e5);
            }
        }
        c3390a.m5643h();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i5 = 0; i5 < size; i5++) {
            atomicIntegerArray.set(i5, ((Integer) arrayList.get(i5)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        c3391b.m5659c();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i5 = 0; i5 < length; i5++) {
            c3391b.m5653C(r6.get(i5));
        }
        c3391b.m5662h();
    }
}
