package ae;

import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.url._UrlKt;
import okio.C5799e;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: ae.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0318q {

    /* JADX INFO: renamed from: a */
    public final C5799e f793a;

    /* JADX INFO: renamed from: b */
    public final boolean f794b;

    /* JADX INFO: renamed from: c */
    public final String f795c;

    /* JADX INFO: renamed from: d */
    public final long f796d;

    /* JADX INFO: renamed from: e */
    public final long f797e;

    /* JADX INFO: renamed from: f */
    public final long f798f;

    /* JADX INFO: renamed from: g */
    public final int f799g;

    /* JADX INFO: renamed from: h */
    public final long f800h;

    /* JADX INFO: renamed from: i */
    public final int f801i;

    /* JADX INFO: renamed from: j */
    public final int f802j;

    /* JADX INFO: renamed from: k */
    public final Long f803k;

    /* JADX INFO: renamed from: l */
    public final Long f804l;

    /* JADX INFO: renamed from: m */
    public final Long f805m;

    /* JADX INFO: renamed from: n */
    public final Integer f806n;

    /* JADX INFO: renamed from: o */
    public final Integer f807o;

    /* JADX INFO: renamed from: p */
    public final Integer f808p;

    /* JADX INFO: renamed from: q */
    public final List f809q;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0318q(C5799e c5799e, boolean z10, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3, int i13, AbstractC1043k abstractC1043k) {
        Integer num4;
        boolean z11;
        Integer num5;
        boolean z12 = (i13 & 2) != 0 ? false : z10;
        String str2 = (i13 & 4) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str;
        long j14 = (i13 & 8) != 0 ? -1L : j10;
        long j15 = (i13 & 16) != 0 ? -1L : j11;
        long j16 = (i13 & 32) != 0 ? -1L : j12;
        int i14 = (i13 & 64) != 0 ? -1 : i10;
        long j17 = (i13 & 128) == 0 ? j13 : -1L;
        int i15 = (i13 & 256) != 0 ? -1 : i11;
        int i16 = (i13 & 512) == 0 ? i12 : -1;
        Long l13 = (i13 & 1024) != 0 ? null : l10;
        Long l14 = (i13 & 2048) != 0 ? null : l11;
        boolean z13 = z12;
        Long l15 = (i13 & 4096) != 0 ? null : l12;
        Integer num6 = (i13 & 8192) != 0 ? null : num;
        Integer num7 = (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : num2;
        if ((i13 & 32768) != 0) {
            num4 = num6;
            z11 = z13;
            num5 = null;
        } else {
            num4 = num6;
            z11 = z13;
            num5 = num3;
        }
        this(c5799e, z11, str2, j14, j15, j16, i14, j17, i15, i16, l13, l14, l15, num4, num7, num5);
    }

    /* JADX INFO: renamed from: a */
    public final C0318q m969a(Integer num, Integer num2, Integer num3) {
        return new C0318q(this.f793a, this.f794b, this.f795c, this.f796d, this.f797e, this.f798f, this.f799g, this.f800h, this.f801i, this.f802j, this.f803k, this.f804l, this.f805m, num, num2, num3);
    }

    /* JADX INFO: renamed from: b */
    public final C5799e m970b() {
        return this.f793a;
    }

    /* JADX INFO: renamed from: c */
    public final List m971c() {
        return this.f809q;
    }

    /* JADX INFO: renamed from: d */
    public final long m972d() {
        return this.f797e;
    }

    /* JADX INFO: renamed from: e */
    public final int m973e() {
        return this.f799g;
    }

    /* JADX INFO: renamed from: f */
    public final Long m974f() {
        Long l10 = this.f805m;
        if (l10 != null) {
            return Long.valueOf(AbstractC0324w.m987f(l10.longValue()));
        }
        Integer num = this.f808p;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final Long m975g() {
        Long l10 = this.f804l;
        if (l10 != null) {
            return Long.valueOf(AbstractC0324w.m987f(l10.longValue()));
        }
        Integer num = this.f807o;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final Long m976h() {
        Long l10 = this.f803k;
        if (l10 != null) {
            return Long.valueOf(AbstractC0324w.m987f(l10.longValue()));
        }
        Integer num = this.f806n;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        int i10 = this.f802j;
        if (i10 != -1) {
            return AbstractC0324w.m986e(this.f801i, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final long m977i() {
        return this.f800h;
    }

    /* JADX INFO: renamed from: j */
    public final long m978j() {
        return this.f798f;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m979k() {
        return this.f794b;
    }

    public C0318q(C5799e c5799e, boolean z10, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        c5799e.getClass();
        str.getClass();
        this.f793a = c5799e;
        this.f794b = z10;
        this.f795c = str;
        this.f796d = j10;
        this.f797e = j11;
        this.f798f = j12;
        this.f799g = i10;
        this.f800h = j13;
        this.f801i = i11;
        this.f802j = i12;
        this.f803k = l10;
        this.f804l = l11;
        this.f805m = l12;
        this.f806n = num;
        this.f807o = num2;
        this.f808p = num3;
        this.f809q = new ArrayList();
    }
}
