package androidx.emoji2.text;

import java.nio.ByteBuffer;
import java.util.Arrays;
import p023M.C0247a;

/* JADX INFO: renamed from: androidx.emoji2.text.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0491p {

    /* JADX INFO: renamed from: a */
    public int f1371a = 1;

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

    public C0491p(C0494s c0494s, boolean z2, int[] iArr) {
        this.f1372b = c0494s;
        this.f1373c = c0494s;
        this.f1377g = z2;
        this.f1378h = iArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m1207a() {
        this.f1371a = 1;
        this.f1373c = this.f1372b;
        this.f1376f = 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1208b() {
        int[] iArr;
        C0247a c0247aM1220c = this.f1373c.f1392b.m1220c();
        int iM205a = c0247aM1220c.m205a(6);
        if ((iM205a == 0 || ((ByteBuffer) c0247aM1220c.f214d).get(iM205a + c0247aM1220c.f211a) == 0) && this.f1375e != 65039) {
            return this.f1377g && ((iArr = this.f1378h) == null || Arrays.binarySearch(iArr, this.f1373c.f1392b.m1218a(0)) < 0);
        }
        return true;
    }
}
