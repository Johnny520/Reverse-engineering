package p118i0;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.AbstractC0541m3;
import androidx.compose.runtime.InterfaceC0512i2;
import androidx.compose.runtime.InterfaceC0514i4;
import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0191s;
import p056e0.InterfaceC1968g;
import p099gc.AbstractC2741j;
import p099gc.InterfaceC2738g;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p189n.C5200c2;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: i0.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3101c implements InterfaceC3108j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0191s f8262a;

    /* JADX INFO: renamed from: b */
    public final C5200c2 f8263b = new C5200c2();

    /* JADX INFO: renamed from: c */
    public final InterfaceC0512i2 f8264c = AbstractC0522j5.m1773e(null, null, 2, null);

    /* JADX INFO: renamed from: i0.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a implements InterfaceC1968g {

        /* JADX INFO: renamed from: a */
        public final InterfaceC3107i f8265a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2738g f8266b = AbstractC2741j.m9834b(0, null, null, 7, null);

        public a(InterfaceC3107i interfaceC3107i) {
            this.f8265a = interfaceC3107i;
        }

        /* JADX INFO: renamed from: a */
        public final Object m11627a(InterfaceC5976f interfaceC5976f) {
            Object objMo9757b = this.f8266b.mo9757b(interfaceC5976f);
            return objMo9757b == AbstractC6325c.m24992g() ? objMo9757b : C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC3107i m11628b() {
            return this.f8265a;
        }

        @Override // p056e0.InterfaceC1968g
        public void close() {
            this.f8266b.mo9781s(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: i0.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6544m implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public int f8268q;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ a f8270s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, InterfaceC5976f interfaceC5976f) {
            super(1, interfaceC5976f);
            this.f8270s = aVar;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(InterfaceC5976f interfaceC5976f) {
            return C3101c.this.new b(this.f8270s, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f8268q;
            try {
                if (i10 == 0) {
                    AbstractC4713t.m18808b(obj);
                    C3101c.this.m11626h(this.f8270s);
                    a aVar = this.f8270s;
                    this.f8268q = 1;
                    if (aVar.m11627a(this) == objM24992g) {
                        return objM24992g;
                    }
                } else {
                    if (i10 != 1) {
                        C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC4713t.m18808b(obj);
                }
                C3101c.this.m11626h(null);
                return C4700i0.f13910a;
            } catch (Throwable th) {
                C3101c.this.m11626h(null);
                throw th;
            }
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo27m(InterfaceC5976f interfaceC5976f) {
            return ((b) create(interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    public C3101c(InterfaceC0191s interfaceC0191s) {
        this.f8262a = interfaceC0191s;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m11620b(C3101c c3101c, InterfaceC0173a interfaceC0173a, int i10, InterfaceC0572r interfaceC0572r, int i11) {
        c3101c.m11623d(interfaceC0173a, interfaceC0572r, AbstractC0541m3.m1929a(i10 | 1));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static C4700i0 m11621c(C3101c c3101c, InterfaceC0173a interfaceC0173a, int i10, InterfaceC0572r interfaceC0572r, int i11) {
        c3101c.m11623d(interfaceC0173a, interfaceC0572r, AbstractC0541m3.m1929a(i10 | 1));
        return C4700i0.f13910a;
    }

    @Override // p118i0.InterfaceC3108j
    /* JADX INFO: renamed from: a */
    public Object mo8918a(InterfaceC3107i interfaceC3107i, InterfaceC5976f interfaceC5976f) {
        Object objM21331e = C5200c2.m21331e(this.f8263b, null, new b(new a(interfaceC3107i), null), interfaceC5976f, 1, null);
        return objM21331e == AbstractC6325c.m24992g() ? objM21331e : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: d */
    public final void m11623d(final InterfaceC0173a interfaceC0173a, InterfaceC0572r interfaceC0572r, final int i10) {
        int i11;
        final InterfaceC0173a interfaceC0173a2;
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(723898654);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC0572rMo2181q.mo2175k(interfaceC0173a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC0572rMo2181q.mo2162U(this) ? 32 : 16;
        }
        if (interfaceC0572rMo2181q.mo2144C((i11 & 19) != 18, i11 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(723898654, i11, -1, "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.ContextMenu (BasicTextContextMenuProvider.kt:137)");
            }
            a aVarM11625g = m11625g();
            if (aVarM11625g == null) {
                if (AbstractC0468c0.m1556j()) {
                    AbstractC0468c0.m1558l();
                }
                InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
                if (interfaceC0514i4Mo2188x != null) {
                    interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: i0.a
                        @Override // p010a9.InterfaceC0188p
                        public final Object invoke(Object obj, Object obj2) {
                            return C3101c.m11621c(this.f8256q, interfaceC0173a, i10, (InterfaceC0572r) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            interfaceC0173a2 = interfaceC0173a;
            this.f8262a.mo231t(aVarM11625g, aVarM11625g.m11628b(), interfaceC0173a2, interfaceC0572rMo2181q, Integer.valueOf((i11 << 6) & 896));
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0173a2 = interfaceC0173a;
            interfaceC0572rMo2181q.mo2190z();
        }
        InterfaceC0514i4 interfaceC0514i4Mo2188x2 = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x2 != null) {
            interfaceC0514i4Mo2188x2.mo1756a(new InterfaceC0188p() { // from class: i0.b
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return C3101c.m11620b(this.f8259q, interfaceC0173a2, i10, (InterfaceC0572r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11624f() {
        a aVarM11625g = m11625g();
        if (aVarM11625g != null) {
            aVarM11625g.close();
        }
    }

    /* JADX INFO: renamed from: g */
    public final a m11625g() {
        return (a) this.f8264c.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final void m11626h(a aVar) {
        this.f8264c.setValue(aVar);
    }
}
