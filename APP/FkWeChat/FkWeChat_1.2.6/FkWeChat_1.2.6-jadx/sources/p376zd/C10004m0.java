package p376zd;

import p024b9.AbstractC1061t;
import p185m8.AbstractC5102r;

/* JADX INFO: renamed from: zd.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10004m0 {

    /* JADX INFO: renamed from: a */
    public int f33587a;

    /* JADX INFO: renamed from: b */
    public C9981c[] f33588b = new C9981c[8];

    /* JADX INFO: renamed from: a */
    public final void m38798a(C9981c c9981c) {
        c9981c.getClass();
        int i10 = this.f33587a + 1;
        this.f33587a = i10;
        C9981c[] c9981cArr = this.f33588b;
        if (i10 == c9981cArr.length) {
            C9981c[] c9981cArr2 = new C9981c[i10 * 2];
            AbstractC5102r.m20665q(c9981cArr, c9981cArr2, 0, 0, 0, 14, null);
            this.f33588b = c9981cArr2;
        }
        m38801d(i10, c9981c);
    }

    /* JADX INFO: renamed from: b */
    public final C9981c m38799b() {
        return this.f33588b[1];
    }

    /* JADX INFO: renamed from: c */
    public final void m38800c(int i10, C9981c c9981c) {
        C9981c c9981c2;
        while (true) {
            int i11 = i10 << 1;
            int i12 = i11 + 1;
            int i13 = this.f33587a;
            if (i12 > i13) {
                if (i11 > i13) {
                    break;
                }
                c9981c2 = this.f33588b[i11];
                c9981c2.getClass();
            } else {
                c9981c2 = this.f33588b[i11];
                c9981c2.getClass();
                C9981c c9981c3 = this.f33588b[i12];
                c9981c3.getClass();
                if (AbstractC1061t.m3844e(0L, c9981c3.getTimeoutAt$okio() - c9981c2.getTimeoutAt$okio()) >= 0) {
                    c9981c2 = c9981c3;
                }
            }
            if (AbstractC1061t.m3844e(0L, c9981c2.getTimeoutAt$okio() - c9981c.getTimeoutAt$okio()) <= 0) {
                break;
            }
            int i14 = c9981c2.index;
            c9981c2.index = i10;
            this.f33588b[i10] = c9981c2;
            i10 = i14;
        }
        this.f33588b[i10] = c9981c;
        c9981c.index = i10;
    }

    /* JADX INFO: renamed from: d */
    public final void m38801d(int i10, C9981c c9981c) {
        while (true) {
            int i11 = i10 >> 1;
            if (i11 == 0) {
                break;
            }
            C9981c c9981c2 = this.f33588b[i11];
            c9981c2.getClass();
            if (AbstractC1061t.m3844e(0L, c9981c.getTimeoutAt$okio() - c9981c2.getTimeoutAt$okio()) <= 0) {
                break;
            }
            c9981c2.index = i10;
            this.f33588b[i10] = c9981c2;
            i10 = i11;
        }
        this.f33588b[i10] = c9981c;
        c9981c.index = i10;
    }

    /* JADX INFO: renamed from: e */
    public final void m38802e(C9981c c9981c) {
        c9981c.getClass();
        int i10 = c9981c.index;
        if (i10 == -1) {
            C9987e.m38645a("Failed requirement.");
            return;
        }
        int i11 = this.f33587a;
        C9981c c9981c2 = this.f33588b[i11];
        c9981c2.getClass();
        c9981c.index = -1;
        this.f33588b[i11] = null;
        this.f33587a = i11 - 1;
        if (c9981c == c9981c2) {
            return;
        }
        int iM3844e = AbstractC1061t.m3844e(0L, c9981c2.getTimeoutAt$okio() - c9981c.getTimeoutAt$okio());
        if (iM3844e == 0) {
            this.f33588b[i10] = c9981c2;
            c9981c2.index = i10;
        } else if (iM3844e < 0) {
            m38800c(i10, c9981c2);
        } else {
            m38801d(i10, c9981c2);
        }
    }
}
