package androidx.emoji2.text;

import java.nio.ByteBuffer;
import p023M.C0247a;
import p023M.C0248b;
import p043Y.C0463v;

/* JADX INFO: renamed from: androidx.emoji2.text.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0497v {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f1397d = null;

    /* JADX INFO: renamed from: a */
    public final int f1398a;

    /* JADX INFO: renamed from: b */
    public final C0463v f1399b;

    /* JADX INFO: renamed from: c */
    public volatile int f1400c;

    static {
        f1397d = new ThreadLocal();
    }

    public C0497v(C0463v r2, int r3) {
        this.f1400c = 0;
        this.f1399b = r2;
        this.f1398a = r3;
    }

    /* JADX INFO: renamed from: a */
    public final int m1218a(int r4) {
        C0247a r02 = m1220c();
        int r1 = r02.m205a(16);
        if (r1 == 0) goto L5;
        ByteBuffer r2 = (ByteBuffer) r02.f214d;
        int r12 = r1 + r02.f211a;
        int r42 = r4 * 4;
        return r2.getInt(r42 + ((r2.getInt(r12) + r12) + 4));
    L5:
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m1219b() {
        C0247a r02 = m1220c();
        int r1 = r02.m205a(16);
        if (r1 == 0) goto L5;
        int r12 = r1 + r02.f211a;
        int r2 = ((ByteBuffer) r02.f214d).getInt(r12) + r12;
        return ((ByteBuffer) r02.f214d).getInt(r2);
    L5:
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final C0247a m1220c() {
        ThreadLocal r02 = f1397d;
        C0247a r1 = (C0247a) r02.get();
        if (r1 != null) goto L5;
        r1 = new C0247a();
        r02.set(r1);
    L5:
        C0248b r03 = (C0248b) this.f1399b.f1044a;
        int r2 = r03.m205a(6);
        if (r2 == 0) goto L11;
        int r22 = r2 + r03.f211a;
        int r3 = (((ByteBuffer) r03.f214d).getInt(r22) + r22) + 4;
        int r23 = (this.f1398a * 4) + r3;
        int r32 = ((ByteBuffer) r03.f214d).getInt(r23) + r23;
        ByteBuffer r04 = (ByteBuffer) r03.f214d;
        r1.f214d = r04;
        if (r04 == null) goto L10;
        r1.f211a = r32;
        int r33 = r32 - r04.getInt(r32);
        r1.f212b = r33;
        r1.f213c = ((ByteBuffer) r1.f214d).getShort(r33);
        goto L11
    L10:
        r1.f211a = 0;
        r1.f212b = 0;
        r1.f213c = 0;
    L11:
        return r1;
    }

    public final String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append(super.toString());
        r02.append(", id:");
        C0247a r1 = m1220c();
        int r2 = r1.m205a(4);
        int r3 = 0;
        if (r2 == 0) goto L5;
        int r12 = ((ByteBuffer) r1.f214d).getInt(r2 + r1.f211a);
    L6:
        r02.append(Integer.toHexString(r12));
        r02.append(", codepoints:");
        int r13 = m1219b();
    L7:
        if (r3 >= r13) goto L10;
        r02.append(Integer.toHexString(m1218a(r3)));
        r02.append(" ");
        r3 = r3 + 1;
        goto L7
    L10:
        return r02.toString();
    L5:
        r12 = 0;
        goto L6
    }
}
