package fun.box001.internal.dexmaker;

import fun.box001.internal.collections.C0016a;
import fun.box001.internal.dexformat.instructions.C0100k;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: c.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0009f {

    /* JADX INFO: renamed from: a */
    private final LinkedHashMap f23a;

    /* JADX INFO: renamed from: b */
    private C0100k f24b;

    public C0009f() {
        this.f23a = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final C0004a m57a(C0012i r4, int r5) {
        LinkedHashMap r0 = this.f23a;
        C0013j r1 = r4.f36a;
        C0008e r2 = (C0008e) r0.get(r1);
        if (r2 != null) goto L6;
        r2 = new C0008e(r1);
        r0.put(r1, r2);
    L6:
        if (C0008e.m50b(r2).containsKey(r4) == true) goto L22;
        if ((r5 & (-5504)) != 0) goto L20;
        if ((r5 & 32) == 0) goto L12;
        r5 = (r5 & (-33)) | 131072;
    L12:
        String r02 = r4.f38c;
        if (r02.equals("<init>") == false) goto L15;
    L16:
        r5 = r5 | 65536;
    L17:
        C0006c r03 = new C0006c(r4, r5);
        C0008e.m50b(r2).put(r4, r03);
        return C0006c.m43a(r03);
    L15:
        if (r02.equals("<clinit>") == false) goto L17;
    L20:
        throw new IllegalArgumentException("Unexpected flag: " + Integer.toHexString(r5));
    L22:
        throw new IllegalStateException("already declared: " + r4);
    }

    /* JADX INFO: renamed from: b */
    public final void m58b(C0013j r3, C0013j r4, C0013j... r5) {
        LinkedHashMap r0 = this.f23a;
        C0008e r1 = (C0008e) r0.get(r3);
        if (r1 != null) goto L6;
        r1 = new C0008e(r3);
        r0.put(r3, r1);
    L6:
        if (C0008e.m49a(r1) == true) goto L10;
        C0008e.m51c(r1);
        C0008e.m52d(r1);
        C0008e.m55g(r1, r4);
        C0008e.m54f(r1);
        C0008e.m53e(r1, new C0014k(r5));
        return;
    L10:
        throw new IllegalStateException("already declared: " + r3);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m59c() {
        if (this.f24b != null) goto L5;
        C0016a r0 = new C0016a();
        r0.f64a = 13;
        this.f24b = new C0100k(r0);
    L5:
        Iterator r02 = this.f23a.values().iterator();
    L7:
        if (r02.hasNext() == false) goto L14;
        C0008e r1 = (C0008e) r02.next();
        this.f24b.m291a(r1.m56h());
        goto L7
    L14:
        return this.f24b.m311u();
    L11:
        e = move-exception;
        throw new RuntimeException(e);
    }
}
