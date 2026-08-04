package yyds;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: renamed from: yyds.ᛵᛲᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1045 extends AbstractC2720 {
    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) {
        ArrayList arrayList = new ArrayList();
        c1942.m3746();
        while (c1942.m3753()) {
            try {
                arrayList.add(Integer.valueOf(c1942.m3771()));
            } catch (NumberFormatException e) {
                throw new C1600(e);
            }
        }
        c1942.m3750();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) throws IOException {
        c1405.m2866();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i = 0; i < length; i++) {
            c1405.m2861(r5.get(i));
        }
        c1405.m2855();
    }
}
