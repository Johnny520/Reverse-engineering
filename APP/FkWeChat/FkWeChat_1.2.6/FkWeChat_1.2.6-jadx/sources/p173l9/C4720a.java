package p173l9;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p024b9.AbstractC1061t;
import p024b9.C1042j0;
import p111ha.InterfaceC2937x;
import p185m8.AbstractC5114x;
import p213oa.C5691b;
import p213oa.C5692c;
import p229p9.InterfaceC6003g1;
import p358y9.AbstractC9626i0;
import p358y9.C9624h0;

/* JADX INFO: renamed from: l9.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4720a {

    /* JADX INFO: renamed from: a */
    public static final C4720a f13947a = new C4720a();

    /* JADX INFO: renamed from: b */
    public static final Set f13948b;

    /* JADX INFO: renamed from: c */
    public static final C5691b f13949c;

    static {
        List listM20803r = AbstractC5114x.m20803r(AbstractC9626i0.f32762a, AbstractC9626i0.f32773l, AbstractC9626i0.f32774m, AbstractC9626i0.f32765d, AbstractC9626i0.f32767f, AbstractC9626i0.f32770i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C5691b.a aVar = C5691b.f17894d;
        Iterator it = listM20803r.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(aVar.m22993c((C5692c) it.next()));
        }
        f13948b = linkedHashSet;
        C5691b.a aVar2 = C5691b.f17894d;
        C5692c c5692c = AbstractC9626i0.f32771j;
        c5692c.getClass();
        f13949c = aVar2.m22993c(c5692c);
    }

    /* JADX INFO: renamed from: a */
    public final C5691b m18840a() {
        return f13949c;
    }

    /* JADX INFO: renamed from: b */
    public final Set m18841b() {
        return f13948b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m18842c(InterfaceC2937x interfaceC2937x) {
        interfaceC2937x.getClass();
        C1042j0 c1042j0 = new C1042j0();
        interfaceC2937x.mo10735d(new a(c1042j0), null);
        return c1042j0.f3202q;
    }

    /* JADX INFO: renamed from: l9.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC2937x.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1042j0 f13950a;

        public a(C1042j0 c1042j0) {
            this.f13950a = c1042j0;
        }

        @Override // p111ha.InterfaceC2937x.c
        /* JADX INFO: renamed from: c */
        public InterfaceC2937x.a mo10584c(C5691b c5691b, InterfaceC6003g1 interfaceC6003g1) {
            c5691b.getClass();
            interfaceC6003g1.getClass();
            if (!AbstractC1061t.m3842c(c5691b, C9624h0.f32756a.m37645a())) {
                return null;
            }
            this.f13950a.f3202q = true;
            return null;
        }

        @Override // p111ha.InterfaceC2937x.c
        /* JADX INFO: renamed from: a */
        public void mo10583a() {
        }
    }
}
