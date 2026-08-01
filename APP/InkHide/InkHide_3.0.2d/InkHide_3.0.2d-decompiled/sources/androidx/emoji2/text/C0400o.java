package androidx.emoji2.text;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import p012G.C0137a;

/* JADX INFO: renamed from: androidx.emoji2.text.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0400o {

    /* JADX INFO: renamed from: a */
    public int f1189a = 1;

    /* JADX INFO: renamed from: b */
    public final C0403r f1190b;

    /* JADX INFO: renamed from: c */
    public C0403r f1191c;

    /* JADX INFO: renamed from: d */
    public C0403r f1192d;

    /* JADX INFO: renamed from: e */
    public int f1193e;

    /* JADX INFO: renamed from: f */
    public int f1194f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0400o(C0403r c0403r) {
        this.f1190b = c0403r;
        this.f1191c = c0403r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m769a(int i2) {
        SparseArray sparseArray = this.f1191c.f1207a;
        C0403r c0403r = sparseArray == null ? null : (C0403r) sparseArray.get(i2);
        int i3 = 1;
        int i4 = 2;
        if (this.f1189a == 2) {
            if (c0403r != null) {
                this.f1191c = c0403r;
                this.f1194f++;
            } else if (i2 == 65038) {
                m770b();
            } else if (i2 != 65039) {
                C0403r c0403r2 = this.f1191c;
                if (c0403r2.f1208b != null) {
                    i4 = 3;
                    if (this.f1194f != 1) {
                        this.f1192d = c0403r2;
                        m770b();
                    } else if (m771c()) {
                        this.f1192d = this.f1191c;
                        m770b();
                    } else {
                        m770b();
                    }
                } else {
                    m770b();
                }
            }
            i3 = i4;
        } else if (c0403r == null) {
            m770b();
        } else {
            this.f1189a = 2;
            this.f1191c = c0403r;
            this.f1194f = 1;
            i3 = i4;
        }
        this.f1193e = i2;
        return i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m770b() {
        this.f1189a = 1;
        this.f1191c = this.f1190b;
        this.f1194f = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m771c() {
        C0137a c0137aM768b = this.f1191c.f1208b.m768b();
        int iM303a = c0137aM768b.m303a(6);
        return !(iM303a == 0 || ((ByteBuffer) c0137aM768b.f437d).get(iM303a + c0137aM768b.f434a) == 0) || this.f1193e == 65039;
    }
}
