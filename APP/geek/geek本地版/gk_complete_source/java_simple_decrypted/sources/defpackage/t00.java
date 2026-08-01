package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class t00 {
    private volatile AtomicReferenceArray<Object> array;

    public t00(int r2) {
        this.array = new AtomicReferenceArray(r2);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int r3) {
        AtomicReferenceArray<Object> r0 = this.array;
        if (r3 < r0.length()) goto L5;
        return null;
    L5:
        return r0.get(r3);
    }

    public final void c(int r6, me r7) {
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
