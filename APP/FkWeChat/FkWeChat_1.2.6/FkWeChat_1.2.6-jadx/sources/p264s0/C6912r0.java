package p264s0;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0473c5;
import androidx.compose.runtime.InterfaceC0564p5;
import androidx.compose.runtime.InterfaceC0572r;
import p024b9.AbstractC1043k;
import p148k.AbstractC3877g0;
import p163l.InterfaceC4303h0;
import p163l.InterfaceC4317k;
import p215oc.C5729x;
import p265s1.C7128q1;
import p306v2.EnumC8807a;
import p317w0.EnumC9032w;

/* JADX INFO: renamed from: s0.r0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6912r0 {

    /* JADX INFO: renamed from: a */
    public final long f22623a;

    /* JADX INFO: renamed from: b */
    public final long f22624b;

    /* JADX INFO: renamed from: c */
    public final long f22625c;

    /* JADX INFO: renamed from: d */
    public final long f22626d;

    /* JADX INFO: renamed from: e */
    public final long f22627e;

    /* JADX INFO: renamed from: f */
    public final long f22628f;

    /* JADX INFO: renamed from: g */
    public final long f22629g;

    /* JADX INFO: renamed from: h */
    public final long f22630h;

    /* JADX INFO: renamed from: i */
    public final long f22631i;

    /* JADX INFO: renamed from: j */
    public final long f22632j;

    /* JADX INFO: renamed from: k */
    public final long f22633k;

    /* JADX INFO: renamed from: l */
    public final long f22634l;

    /* JADX INFO: renamed from: s0.r0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22635a;

        static {
            int[] iArr = new int[EnumC8807a.values().length];
            try {
                iArr[EnumC8807a.f29314q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8807a.f29316s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8807a.f29315r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22635a = iArr;
        }
    }

    public C6912r0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        this.f22623a = j10;
        this.f22624b = j11;
        this.f22625c = j12;
        this.f22626d = j13;
        this.f22627e = j14;
        this.f22628f = j15;
        this.f22629g = j16;
        this.f22630h = j17;
        this.f22631i = j18;
        this.f22632j = j19;
        this.f22633k = j20;
        this.f22634l = j21;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0564p5 m27436a(boolean z10, EnumC8807a enumC8807a, InterfaceC0572r interfaceC0572r, int i10) {
        long j10;
        InterfaceC0564p5 interfaceC0564p5M1577p;
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(1009643462, i10, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:657)");
        }
        if (z10) {
            int i11 = a.f22635a[enumC8807a.ordinal()];
            if (i11 == 1 || i11 == 2) {
                j10 = this.f22630h;
            } else {
                if (i11 != 3) {
                    C5729x.m23182a();
                    return null;
                }
                j10 = this.f22631i;
            }
        } else {
            int i12 = a.f22635a[enumC8807a.ordinal()];
            if (i12 == 1) {
                j10 = this.f22632j;
            } else if (i12 == 2) {
                j10 = this.f22634l;
            } else {
                if (i12 != 3) {
                    C5729x.m23182a();
                    return null;
                }
                j10 = this.f22633k;
            }
        }
        long j11 = j10;
        if (z10) {
            interfaceC0572r.mo2163V(633231558);
            interfaceC0564p5M1577p = AbstractC3877g0.m15379a(j11, m27439d(enumC8807a, interfaceC0572r, (i10 >> 3) & 126), null, null, interfaceC0572r, 0, 12);
            interfaceC0572r.mo2152K();
        } else {
            interfaceC0572r.mo2163V(633321768);
            interfaceC0564p5M1577p = AbstractC0473c5.m1577p(C7128q1.m28125k(j11), interfaceC0572r, 0);
            interfaceC0572r.mo2152K();
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC0564p5M1577p;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0564p5 m27437b(boolean z10, EnumC8807a enumC8807a, InterfaceC0572r interfaceC0572r, int i10) {
        long j10;
        InterfaceC0564p5 interfaceC0564p5M1577p;
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(360729865, i10, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:625)");
        }
        if (z10) {
            int i11 = a.f22635a[enumC8807a.ordinal()];
            if (i11 == 1 || i11 == 2) {
                j10 = this.f22625c;
            } else {
                if (i11 != 3) {
                    C5729x.m23182a();
                    return null;
                }
                j10 = this.f22626d;
            }
        } else {
            int i12 = a.f22635a[enumC8807a.ordinal()];
            if (i12 == 1) {
                j10 = this.f22627e;
            } else if (i12 == 2) {
                j10 = this.f22629g;
            } else {
                if (i12 != 3) {
                    C5729x.m23182a();
                    return null;
                }
                j10 = this.f22628f;
            }
        }
        long j11 = j10;
        if (z10) {
            interfaceC0572r.mo2163V(496051715);
            interfaceC0564p5M1577p = AbstractC3877g0.m15379a(j11, m27439d(enumC8807a, interfaceC0572r, (i10 >> 3) & 126), null, null, interfaceC0572r, 0, 12);
            interfaceC0572r.mo2152K();
        } else {
            interfaceC0572r.mo2163V(496141925);
            interfaceC0564p5M1577p = AbstractC0473c5.m1577p(C7128q1.m28125k(j11), interfaceC0572r, 0);
            interfaceC0572r.mo2152K();
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC0564p5M1577p;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0564p5 m27438c(EnumC8807a enumC8807a, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-507585681, i10, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:606)");
        }
        InterfaceC0564p5 interfaceC0564p5M15379a = AbstractC3877g0.m15379a(enumC8807a == EnumC8807a.f29315r ? this.f22624b : this.f22623a, m27439d(enumC8807a, interfaceC0572r, i10 & 126), null, null, interfaceC0572r, 0, 12);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC0564p5M15379a;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC4317k m27439d(EnumC8807a enumC8807a, InterfaceC0572r interfaceC0572r, int i10) {
        InterfaceC4303h0 interfaceC4303h0M27054b;
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1075456245, i10, -1, "androidx.compose.material3.CheckboxColors.colorAnimationSpecForState (Checkbox.kt:684)");
        }
        if (enumC8807a == EnumC8807a.f29315r) {
            interfaceC0572r.mo2163V(1539262271);
            interfaceC4303h0M27054b = AbstractC6822l6.m27054b(EnumC9032w.f30868u, interfaceC0572r, 6);
            interfaceC0572r.mo2152K();
        } else {
            interfaceC0572r.mo2163V(1539355581);
            interfaceC4303h0M27054b = AbstractC6822l6.m27054b(EnumC9032w.f30867t, interfaceC0572r, 6);
            interfaceC0572r.mo2152K();
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC4303h0M27054b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6912r0)) {
            return false;
        }
        C6912r0 c6912r0 = (C6912r0) obj;
        return C7128q1.m28131q(this.f22623a, c6912r0.f22623a) && C7128q1.m28131q(this.f22624b, c6912r0.f22624b) && C7128q1.m28131q(this.f22625c, c6912r0.f22625c) && C7128q1.m28131q(this.f22626d, c6912r0.f22626d) && C7128q1.m28131q(this.f22627e, c6912r0.f22627e) && C7128q1.m28131q(this.f22628f, c6912r0.f22628f) && C7128q1.m28131q(this.f22629g, c6912r0.f22629g) && C7128q1.m28131q(this.f22630h, c6912r0.f22630h) && C7128q1.m28131q(this.f22631i, c6912r0.f22631i) && C7128q1.m28131q(this.f22632j, c6912r0.f22632j) && C7128q1.m28131q(this.f22633k, c6912r0.f22633k) && C7128q1.m28131q(this.f22634l, c6912r0.f22634l);
    }

    public int hashCode() {
        return (((((((((((((((((((((C7128q1.m28137w(this.f22623a) * 31) + C7128q1.m28137w(this.f22624b)) * 31) + C7128q1.m28137w(this.f22625c)) * 31) + C7128q1.m28137w(this.f22626d)) * 31) + C7128q1.m28137w(this.f22627e)) * 31) + C7128q1.m28137w(this.f22628f)) * 31) + C7128q1.m28137w(this.f22629g)) * 31) + C7128q1.m28137w(this.f22630h)) * 31) + C7128q1.m28137w(this.f22631i)) * 31) + C7128q1.m28137w(this.f22632j)) * 31) + C7128q1.m28137w(this.f22633k)) * 31) + C7128q1.m28137w(this.f22634l);
    }

    public /* synthetic */ C6912r0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, AbstractC1043k abstractC1043k) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21);
    }
}
