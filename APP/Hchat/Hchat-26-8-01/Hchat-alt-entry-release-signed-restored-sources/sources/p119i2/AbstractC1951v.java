package p119i2;

import p280t2.C4093i;
import p280t2.C4101q;
import p280t2.C4103s;
import p293u2.C4245o;
import p293u2.C4246p;

/* JADX INFO: renamed from: i2.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1951v {

    /* JADX INFO: renamed from: a */
    public static final long f6615a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f6616b = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C4246p[] c4246pArr = C4245o.f13923b;
        f6615a = C4245o.f13924c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final C1950u m4840a(C1950u c1950u, int i9, int i10, long j3, C4101q c4101q, C1952w c1952w, C4093i c4093i, int i11, int i12, C4103s c4103s) {
        long j4;
        int i13 = i9;
        int i14 = i10;
        long j5 = j3;
        C4101q c4101q2 = c4101q;
        C1952w c1952w2 = c1952w;
        C4093i c4093i2 = c4093i;
        int i15 = i11;
        int i16 = i12;
        C4103s c4103s2 = c4103s;
        if (i13 == 0 || i13 == c1950u.f6606a) {
            C4246p[] c4246pArr = C4245o.f13923b;
            if ((j5 & 1095216660480L) == 0) {
                j4 = 0;
            } else {
                j4 = 0;
                if (C4245o.m8538a(j5, c1950u.f6608c)) {
                }
            }
            if ((c4101q2 == null || c4101q2.equals(c1950u.f6609d)) && ((i14 == 0 || i14 == c1950u.f6607b) && ((c1952w2 == null || c1952w2.equals(c1950u.f6610e)) && ((c4093i2 == null || c4093i2.equals(c1950u.f6611f)) && ((i15 == 0 || i15 == c1950u.f6612g) && ((i16 == 0 || i16 == c1950u.f6613h) && (c4103s2 == null || c4103s2.equals(c1950u.f6614i)))))))) {
                return c1950u;
            }
        } else {
            j4 = 0;
        }
        C4246p[] c4246pArr2 = C4245o.f13923b;
        if ((j5 & 1095216660480L) == j4) {
            j5 = c1950u.f6608c;
        }
        if (c4101q2 == null) {
            c4101q2 = c1950u.f6609d;
        }
        if (i13 == 0) {
            i13 = c1950u.f6606a;
        }
        if (i14 == 0) {
            i14 = c1950u.f6607b;
        }
        C1952w c1952w3 = c1950u.f6610e;
        if (c1952w3 != null && c1952w2 == null) {
            c1952w2 = c1952w3;
        }
        if (c4093i2 == null) {
            c4093i2 = c1950u.f6611f;
        }
        if (i15 == 0) {
            i15 = c1950u.f6612g;
        }
        if (i16 == 0) {
            i16 = c1950u.f6613h;
        }
        if (c4103s2 == null) {
            c4103s2 = c1950u.f6614i;
        }
        return new C1950u(i13, i14, j5, c4101q2, c1952w2, c4093i2, i15, i16, c4103s2);
    }
}
