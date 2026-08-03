package p002c;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p003d.C0016a;
import p006g.C0100k;

/* JADX INFO: renamed from: c.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0009f {

    /* JADX INFO: renamed from: a */
    private final LinkedHashMap f23a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    private C0100k f24b;

    /* JADX INFO: renamed from: a */
    public final C0004a m57a(C0012i c0012i, int i2) {
        LinkedHashMap linkedHashMap = this.f23a;
        C0013j c0013j = c0012i.f36a;
        C0008e c0008e = (C0008e) linkedHashMap.get(c0013j);
        if (c0008e == null) {
            c0008e = new C0008e(c0013j);
            linkedHashMap.put(c0013j, c0008e);
        }
        if (c0008e.f22i.containsKey(c0012i)) {
            throw new IllegalStateException("already declared: " + c0012i);
        }
        if ((i2 & (-5504)) != 0) {
            throw new IllegalArgumentException("Unexpected flag: " + Integer.toHexString(i2));
        }
        if ((i2 & 32) != 0) {
            i2 = (i2 & (-33)) | 131072;
        }
        String str = c0012i.f38c;
        if (str.equals("<init>") || str.equals("<clinit>")) {
            i2 |= 65536;
        }
        C0006c c0006c = new C0006c(c0012i, i2);
        c0008e.f22i.put(c0012i, c0006c);
        return c0006c.f13c;
    }

    /* JADX INFO: renamed from: b */
    public final void m58b(C0013j c0013j, C0013j c0013j2, C0013j... c0013jArr) {
        LinkedHashMap linkedHashMap = this.f23a;
        C0008e c0008e = (C0008e) linkedHashMap.get(c0013j);
        if (c0008e == null) {
            c0008e = new C0008e(c0013j);
            linkedHashMap.put(c0013j, c0008e);
        }
        if (c0008e.f15b) {
            throw new IllegalStateException("already declared: " + c0013j);
        }
        c0008e.f15b = true;
        c0008e.f16c = 1;
        c0008e.f17d = c0013j2;
        c0008e.f18e = "I";
        c0008e.f19f = new C0014k(c0013jArr);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m59c() {
        if (this.f24b == null) {
            C0016a c0016a = new C0016a();
            c0016a.f64a = 13;
            this.f24b = new C0100k(c0016a);
        }
        Iterator it = this.f23a.values().iterator();
        while (it.hasNext()) {
            this.f24b.m291a(((C0008e) it.next()).m56h());
        }
        try {
            return this.f24b.m311u();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
