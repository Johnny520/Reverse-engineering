package yyds;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: yyds.ᛷᛸᲇᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1620 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f8246;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int f8247 = 1;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C1660 f8248;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C1660 f8249;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f8250;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public C1660 f8251;

    public C1620(C1660 c1660) {
        this.f8248 = c1660;
        this.f8249 = c1660;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int m3315(int i) {
        C1660 c1660 = (C1660) this.f8249.f8461.get(i);
        int i2 = 1;
        int i3 = 2;
        if (this.f8247 == 2) {
            if (c1660 != null) {
                this.f8249 = c1660;
                this.f8250++;
            } else if (i == 65038) {
                m3316();
            } else if (i != 65039) {
                C1660 c16602 = this.f8249;
                if (c16602.f8462 != null) {
                    i3 = 3;
                    if (this.f8250 != 1) {
                        this.f8251 = c16602;
                        m3316();
                    } else if (m3317()) {
                        this.f8251 = this.f8249;
                        m3316();
                    } else {
                        m3316();
                    }
                } else {
                    m3316();
                }
            }
            i2 = i3;
        } else if (c1660 == null) {
            m3316();
        } else {
            this.f8247 = 2;
            this.f8249 = c1660;
            this.f8250 = 1;
            i2 = i3;
        }
        this.f8246 = i;
        return i2;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m3316() {
        this.f8247 = 1;
        this.f8249 = this.f8248;
        this.f8250 = 0;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean m3317() {
        C0960 c0960M1706 = this.f8249.f8462.m1706();
        int iM3645 = c0960M1706.m3645(6);
        return !(iM3645 == 0 || ((ByteBuffer) c0960M1706.f9366).get(iM3645 + c0960M1706.f9365) == 0) || this.f8246 == 65039;
    }
}
