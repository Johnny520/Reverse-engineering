package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: nw */
/* JADX INFO: loaded from: classes.dex */
public final class C2295nw {
    private volatile AtomicReferenceArray<Object> array;

    public C2295nw(int r2) {
        this.array = new AtomicReferenceArray(r2);
    }

    /* JADX INFO: renamed from: a */
    public final int m4628a() {
        return this.array.length();
    }

    /* JADX INFO: renamed from: b */
    public final Object m4629b(int r3) {
        AtomicReferenceArray<Object> r0 = this.array;
        if (r3 < r0.length()) goto L5;
        return null;
    L5:
        return r0.get(r3);
    }

    /* JADX INFO: renamed from: c */
    public final void m4630c(int r6, C1322dc r7) {
        AtomicReferenceArray<Object> r0 = this.array;
        int r1 = r0.length();
        if (r6 >= r1) goto L6;
        r0.set(r6, r7);
        return;
    L6:
        int r3 = r6 + 1;
        int r4 = r1 * 2;
        if (r3 >= r4) goto L9;
        r3 = r4;
    L9:
        AtomicReferenceArray<Object> r2 = new AtomicReferenceArray(r3);
        int r32 = 0;
    L10:
        if (r32 >= r1) goto L12;
        r2.set(r32, r0.get(r32));
        r32 = r32 + 1;
        goto L10
    L12:
        r2.set(r6, r7);
        this.array = r2;
    }
}
