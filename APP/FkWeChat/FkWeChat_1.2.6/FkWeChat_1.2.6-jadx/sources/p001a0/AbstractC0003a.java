package p001a0;

import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p215oc.C5725t;
import p250r1.C6461k;
import p263s.AbstractC6635e;
import p265s1.AbstractC7124p2;
import p265s1.InterfaceC7090i3;

/* JADX INFO: renamed from: a0.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0003a implements InterfaceC7090i3 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0004b f1a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0004b f2b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0004b f3c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0004b f4d;

    public AbstractC0003a(InterfaceC0004b interfaceC0004b, InterfaceC0004b interfaceC0004b2, InterfaceC0004b interfaceC0004b3, InterfaceC0004b interfaceC0004b4) {
        this.f1a = interfaceC0004b;
        this.f2b = interfaceC0004b2;
        this.f3c = interfaceC0004b3;
        this.f4d = interfaceC0004b4;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ AbstractC0003a m3c(AbstractC0003a abstractC0003a, InterfaceC0004b interfaceC0004b, InterfaceC0004b interfaceC0004b2, InterfaceC0004b interfaceC0004b3, InterfaceC0004b interfaceC0004b4, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: copy");
            return null;
        }
        if ((i10 & 1) != 0) {
            interfaceC0004b = abstractC0003a.f1a;
        }
        if ((i10 & 2) != 0) {
            interfaceC0004b2 = abstractC0003a.f2b;
        }
        if ((i10 & 4) != 0) {
            interfaceC0004b3 = abstractC0003a.f3c;
        }
        if ((i10 & 8) != 0) {
            interfaceC0004b4 = abstractC0003a.f4d;
        }
        return abstractC0003a.mo5b(interfaceC0004b, interfaceC0004b2, interfaceC0004b3, interfaceC0004b4);
    }

    @Override // p265s1.InterfaceC7090i3
    /* JADX INFO: renamed from: a */
    public final AbstractC7124p2 mo4a(long j10, EnumC3191u enumC3191u, InterfaceC3175e interfaceC3175e) {
        float fMo11a = this.f1a.mo11a(j10, interfaceC3175e);
        float fMo11a2 = this.f2b.mo11a(j10, interfaceC3175e);
        float fMo11a3 = this.f3c.mo11a(j10, interfaceC3175e);
        float fMo11a4 = this.f4d.mo11a(j10, interfaceC3175e);
        float fM25620h = C6461k.m25620h(j10);
        float f10 = fMo11a + fMo11a4;
        if (f10 > fM25620h) {
            float f11 = fM25620h / f10;
            fMo11a *= f11;
            fMo11a4 *= f11;
        }
        float f12 = fMo11a2 + fMo11a3;
        if (f12 > fM25620h) {
            float f13 = fM25620h / f12;
            fMo11a2 *= f13;
            fMo11a3 *= f13;
        }
        if (!(fMo11a >= 0.0f && fMo11a2 >= 0.0f && fMo11a3 >= 0.0f && fMo11a4 >= 0.0f)) {
            AbstractC6635e.m26318a("Corner size in Px can't be negative(topStart = " + fMo11a + ", topEnd = " + fMo11a2 + ", bottomEnd = " + fMo11a3 + ", bottomStart = " + fMo11a4 + ")!");
        }
        return mo6d(j10, fMo11a, fMo11a2, fMo11a3, fMo11a4, enumC3191u);
    }

    /* JADX INFO: renamed from: b */
    public abstract AbstractC0003a mo5b(InterfaceC0004b interfaceC0004b, InterfaceC0004b interfaceC0004b2, InterfaceC0004b interfaceC0004b3, InterfaceC0004b interfaceC0004b4);

    /* JADX INFO: renamed from: d */
    public abstract AbstractC7124p2 mo6d(long j10, float f10, float f11, float f12, float f13, EnumC3191u enumC3191u);

    /* JADX INFO: renamed from: e */
    public final InterfaceC0004b m7e() {
        return this.f3c;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC0004b m8f() {
        return this.f4d;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC0004b m9g() {
        return this.f2b;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC0004b m10h() {
        return this.f1a;
    }
}
