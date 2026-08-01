package p135j2;

import androidx.compose.runtime.AbstractC0471c3;
import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.AbstractC0595t4;
import androidx.compose.runtime.InterfaceC0491f2;
import androidx.compose.runtime.InterfaceC0505h2;
import androidx.compose.runtime.InterfaceC0512i2;

/* JADX INFO: renamed from: j2.m2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3550m2 {

    /* JADX INFO: renamed from: f */
    public final InterfaceC3553n1 f9877f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC3553n1 f9878g;

    /* JADX INFO: renamed from: a */
    public final InterfaceC0512i2 f9872a = AbstractC0522j5.m1773e(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: b */
    public final InterfaceC0512i2 f9873b = AbstractC0522j5.m1773e(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: c */
    public final InterfaceC0491f2 f9874c = AbstractC0471c3.m1561a(0.0f);

    /* JADX INFO: renamed from: d */
    public final InterfaceC0505h2 f9875d = AbstractC0595t4.m2225a(0);

    /* JADX INFO: renamed from: e */
    public final InterfaceC0491f2 f9876e = AbstractC0471c3.m1561a(1.0f);

    /* JADX INFO: renamed from: h */
    public long f9879h = AbstractC3522f2.m13119a();

    /* JADX INFO: renamed from: i */
    public long f9880i = AbstractC3522f2.m13119a();

    /* JADX INFO: renamed from: j */
    public long f9881j = AbstractC3522f2.m13119a();

    /* JADX INFO: renamed from: k */
    public long f9882k = AbstractC3522f2.m13119a();

    public C3550m2(String str) {
        this.f9877f = AbstractC3559p1.m13330a(str + " source");
        this.f9878g = AbstractC3559p1.m13330a(str + " target");
    }

    /* JADX INFO: renamed from: a */
    public final long m13303a() {
        return this.f9879h;
    }

    /* JADX INFO: renamed from: b */
    public final long m13304b() {
        return this.f9880i;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC3553n1 m13305c() {
        return this.f9877f;
    }

    /* JADX INFO: renamed from: d */
    public final long m13306d() {
        return this.f9881j;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC3553n1 m13307e() {
        return this.f9878g;
    }

    /* JADX INFO: renamed from: f */
    public final long m13308f() {
        return this.f9882k;
    }

    /* JADX INFO: renamed from: g */
    public boolean m13309g() {
        return ((Boolean) this.f9873b.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public void m13310h(float f10) {
        this.f9876e.mo1664h(f10);
    }

    /* JADX INFO: renamed from: i */
    public void m13311i(boolean z10) {
        this.f9873b.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: j */
    public final void m13312j(long j10) {
        this.f9879h = j10;
    }

    /* JADX INFO: renamed from: k */
    public void m13313k(long j10) {
        this.f9875d.mo1693n(j10);
    }

    /* JADX INFO: renamed from: l */
    public void m13314l(float f10) {
        this.f9874c.mo1664h(f10);
    }

    /* JADX INFO: renamed from: m */
    public final void m13315m(long j10) {
        this.f9880i = j10;
    }

    /* JADX INFO: renamed from: n */
    public final void m13316n(long j10) {
        this.f9881j = j10;
    }

    /* JADX INFO: renamed from: o */
    public final void m13317o(long j10) {
        this.f9882k = j10;
    }

    /* JADX INFO: renamed from: p */
    public void m13318p(boolean z10) {
        this.f9872a.setValue(Boolean.valueOf(z10));
    }
}
