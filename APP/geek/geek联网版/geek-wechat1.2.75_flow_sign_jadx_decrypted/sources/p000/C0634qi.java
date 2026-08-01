package p000;

import android.util.SparseArray;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: qi */
/* JADX INFO: loaded from: classes.dex */
public final class C0634qi {

    /* JADX INFO: renamed from: a */
    public int f3908a = 1;

    /* JADX INFO: renamed from: b */
    public final C0202ew f3909b;

    /* JADX INFO: renamed from: c */
    public C0202ew f3910c;

    /* JADX INFO: renamed from: d */
    public C0202ew f3911d;

    /* JADX INFO: renamed from: e */
    public int f3912e;

    /* JADX INFO: renamed from: f */
    public int f3913f;

    public C0634qi(C0202ew c0202ew) {
        this.f3909b = c0202ew;
        this.f3910c = c0202ew;
    }

    /* JADX INFO: renamed from: a */
    public final int m2150a(int i) {
        SparseArray sparseArray = this.f3910c.f1672a;
        C0202ew c0202ew = sparseArray == null ? null : (C0202ew) sparseArray.get(i);
        int i2 = 1;
        int i3 = 2;
        if (this.f3908a == 2) {
            if (c0202ew != null) {
                this.f3910c = c0202ew;
                this.f3913f++;
            } else if (i == 65038) {
                m2151b();
            } else if (i != 65039) {
                C0202ew c0202ew2 = this.f3910c;
                if (c0202ew2.f1673b != null) {
                    i3 = 3;
                    if (this.f3913f != 1) {
                        this.f3911d = c0202ew2;
                        m2151b();
                    } else if (m2152c()) {
                        this.f3911d = this.f3910c;
                        m2151b();
                    } else {
                        m2151b();
                    }
                } else {
                    m2151b();
                }
            }
            i2 = i3;
        } else if (c0202ew == null) {
            m2151b();
        } else {
            this.f3908a = 2;
            this.f3910c = c0202ew;
            this.f3913f = 1;
            i2 = i3;
        }
        this.f3912e = i;
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m2151b() {
        this.f3908a = 1;
        this.f3910c = this.f3909b;
        this.f3913f = 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2152c() {
        C0129cw c0129cwM2091b = this.f3910c.f1673b.m2091b();
        int iM2795a = c0129cwM2091b.m2795a(6);
        return !(iM2795a == 0 || ((ByteBuffer) c0129cwM2091b.f5550d).get(iM2795a + c0129cwM2091b.f5547a) == 0) || this.f3912e == 65039;
    }
}
