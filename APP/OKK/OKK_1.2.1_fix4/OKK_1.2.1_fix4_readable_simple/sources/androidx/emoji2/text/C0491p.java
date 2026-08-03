package androidx.emoji2.text;

import java.nio.ByteBuffer;
import java.util.Arrays;
import p023M.C0247a;

/* JADX INFO: renamed from: androidx.emoji2.text.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0491p {

    /* JADX INFO: renamed from: a */
    public int f1371a;

    /* JADX INFO: renamed from: b */
    public final C0494s f1372b;

    /* JADX INFO: renamed from: c */
    public C0494s f1373c;

    /* JADX INFO: renamed from: d */
    public C0494s f1374d;

    /* JADX INFO: renamed from: e */
    public int f1375e;

    /* JADX INFO: renamed from: f */
    public int f1376f;

    /* JADX INFO: renamed from: g */
    public final boolean f1377g;

    /* JADX INFO: renamed from: h */
    public final int[] f1378h;

    public C0491p(C0494s r2, boolean r3, int[] r4) {
        this.f1371a = 1;
        this.f1372b = r2;
        this.f1373c = r2;
        this.f1377g = r3;
        this.f1378h = r4;
    }

    /* JADX INFO: renamed from: a */
    public final void m1207a() {
        this.f1371a = 1;
        this.f1373c = this.f1372b;
        this.f1376f = 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1208b() {
        C0247a r02 = this.f1373c.f1392b.m1220c();
        int r1 = r02.m205a(6);
        if (r1 == 0) goto L8;
        if (((ByteBuffer) r02.f214d).get(r1 + r02.f211a) == 0) goto L8;
        return true;
    L8:
        if (this.f1375e != 65039) goto L11;
        return true;
    L11:
        if (this.f1377g == false) goto L18;
        int[] r03 = this.f1378h;
        if (r03 != null) goto L16;
        return true;
    L16:
        if (Arrays.binarySearch(r03, this.f1373c.f1392b.m1218a(0)) >= 0) goto L18;
        return true;
    L18:
        return false;
    }
}
