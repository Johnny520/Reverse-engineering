package p034c7;

import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0188p;
import p125i7.AbstractC3229o0;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;
import p228p8.C5981k;
import p228p8.InterfaceC5980j;
import p282t7.C8195s;

/* JADX INFO: renamed from: c7.s0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1390s0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1359d f4141a;

    /* JADX INFO: renamed from: b */
    public final List f4142b;

    /* JADX INFO: renamed from: c */
    public List f4143c;

    /* JADX INFO: renamed from: d */
    public String f4144d;

    /* JADX INFO: renamed from: e */
    public boolean f4145e;

    /* JADX INFO: renamed from: f */
    public InterfaceC5980j f4146f;

    public C1390s0(InterfaceC1359d interfaceC1359d) {
        interfaceC1359d.getClass();
        this.f4141a = interfaceC1359d;
        this.f4142b = new ArrayList();
        this.f4143c = AbstractC5112w.m20789e(AbstractC3229o0.m12278a());
        this.f4144d = _UrlKt.FRAGMENT_ENCODE_SET;
        this.f4145e = C8195s.f27498a.m31871a();
        this.f4146f = C5981k.f18917q;
    }

    /* JADX INFO: renamed from: a */
    public final C1388r0 m5458a() {
        return new C1388r0(this.f4141a, AbstractC5081g0.m20554X0(this.f4142b), this.f4143c, this.f4144d, this.f4145e, this.f4146f);
    }

    /* JADX INFO: renamed from: b */
    public final void m5459b(InterfaceC0188p interfaceC0188p) {
        interfaceC0188p.getClass();
        this.f4142b.add(interfaceC0188p);
    }

    /* JADX INFO: renamed from: c */
    public final void m5460c(InterfaceC5980j interfaceC5980j) {
        interfaceC5980j.getClass();
        this.f4146f = interfaceC5980j;
    }

    /* JADX INFO: renamed from: d */
    public final void m5461d(List list) {
        list.getClass();
        this.f4143c = list;
    }
}
