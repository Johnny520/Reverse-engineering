package p000;

import android.util.SparseArray;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: oi */
/* JADX INFO: loaded from: classes.dex */
public final class C0560oi {

    /* JADX INFO: renamed from: a */
    public int f3536a = 1;

    /* JADX INFO: renamed from: b */
    public final C0907xv f3537b;

    /* JADX INFO: renamed from: c */
    public C0907xv f3538c;

    /* JADX INFO: renamed from: d */
    public C0907xv f3539d;

    /* JADX INFO: renamed from: e */
    public int f3540e;

    /* JADX INFO: renamed from: f */
    public int f3541f;

    public C0560oi(C0907xv c0907xv) {
        this.f3537b = c0907xv;
        this.f3538c = c0907xv;
    }

    /* JADX INFO: renamed from: a */
    public final int m2017a(int i) {
        SparseArray sparseArray = this.f3538c.f5212a;
        C0907xv c0907xv = sparseArray == null ? null : (C0907xv) sparseArray.get(i);
        int i2 = 1;
        int i3 = 2;
        if (this.f3536a == 2) {
            if (c0907xv != null) {
                this.f3538c = c0907xv;
                this.f3541f++;
            } else if (i == 65038) {
                m2018b();
            } else if (i != 65039) {
                C0907xv c0907xv2 = this.f3538c;
                if (c0907xv2.f5213b != null) {
                    i3 = 3;
                    if (this.f3541f != 1) {
                        this.f3539d = c0907xv2;
                        m2018b();
                    } else if (m2019c()) {
                        this.f3539d = this.f3538c;
                        m2018b();
                    } else {
                        m2018b();
                    }
                } else {
                    m2018b();
                }
            }
            i2 = i3;
        } else if (c0907xv == null) {
            m2018b();
        } else {
            this.f3536a = 2;
            this.f3538c = c0907xv;
            this.f3541f = 1;
            i2 = i3;
        }
        this.f3540e = i;
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m2018b() {
        this.f3536a = 1;
        this.f3538c = this.f3537b;
        this.f3541f = 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2019c() {
        C0833vv c0833vvM1946b = this.f3538c.f5213b.m1946b();
        int iM2359a = c0833vvM1946b.m2359a(6);
        return !(iM2359a == 0 || ((ByteBuffer) c0833vvM1946b.f4513d).get(iM2359a + c0833vvM1946b.f4510a) == 0) || this.f3540e == 65039;
    }
}
