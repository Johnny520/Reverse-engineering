package ie;

import be.AbstractC1113a;
import ge.C2787b;
import ge.C2790e;
import java.util.ArrayList;
import java.util.List;
import me.C5164c;
import me.C5168g;
import ne.AbstractC5591c;
import ne.InterfaceC5590b;
import p024b9.AbstractC1043k;
import p080f9.AbstractC2368o;
import p080f9.C2363j;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p217oe.AbstractC5741c;
import p217oe.InterfaceC5740b;
import p299ub.AbstractC8621f0;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: ie.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3417a extends AbstractC5741c {

    /* JADX INFO: renamed from: h */
    public static final a f9416h = new a(null);

    /* JADX INFO: renamed from: e */
    public final C5168g f9417e;

    /* JADX INFO: renamed from: f */
    public final int f9418f;

    /* JADX INFO: renamed from: g */
    public int f9419g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3417a(C5164c.a aVar, InterfaceC5590b interfaceC5590b, C5168g c5168g, int i10) {
        super(interfaceC5590b, c5168g.m21225e());
        aVar.getClass();
        interfaceC5590b.getClass();
        c5168g.getClass();
        this.f9417e = c5168g;
        this.f9418f = i10;
        c5168g.m21222b(AbstractC5112w.m20789e(new InterfaceC6627f.a(new C2363j(aVar.m21191h(), aVar.m21190g()), C2787b.f7260d)));
        c5168g.m21222b(m12781m(aVar));
    }

    @Override // p217oe.InterfaceC5740b
    /* JADX INFO: renamed from: b */
    public boolean mo12775b() {
        return false;
    }

    @Override // p217oe.InterfaceC5740b
    /* JADX INFO: renamed from: c */
    public boolean mo12776c(C5164c.a aVar) {
        aVar.getClass();
        return aVar.m21192i() == -1;
    }

    @Override // p217oe.AbstractC5741c
    /* JADX INFO: renamed from: g */
    public int mo12777g(C5164c.a aVar) {
        aVar.getClass();
        return aVar.m21190g();
    }

    @Override // p217oe.AbstractC5741c
    /* JADX INFO: renamed from: h */
    public InterfaceC5740b.c mo12778h(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
        aVar.getClass();
        interfaceC5590b.getClass();
        int i10 = this.f9419g + 1;
        this.f9419g = i10;
        if (i10 == 1) {
            this.f9417e.m21222b(AbstractC5112w.m20789e(new InterfaceC6627f.a(new C2363j(aVar.m21191h() + 1, aVar.m21190g()), C2790e.f7271c)));
            return InterfaceC5740b.c.f18100d.m23235a();
        }
        if (!m12782n(aVar.m21186c())) {
            return InterfaceC5740b.c.f18100d.m23236b();
        }
        List listM12781m = m12781m(aVar);
        if (listM12781m.isEmpty()) {
            return InterfaceC5740b.c.f18100d.m23236b();
        }
        this.f9417e.m21222b(AbstractC5081g0.m20533E0(AbstractC5112w.m20789e(new InterfaceC6627f.a(new C2363j(((InterfaceC6627f.a) AbstractC5081g0.m20576j0(listM12781m)).m26255a().m8560o(), ((InterfaceC6627f.a) AbstractC5081g0.m20587u0(listM12781m)).m26255a().m8561p()), C2787b.f7261e)), listM12781m));
        return InterfaceC5740b.c.f18100d.m23235a();
    }

    @Override // p217oe.AbstractC5741c
    /* JADX INFO: renamed from: j */
    public InterfaceC5740b.a mo12779j() {
        return InterfaceC5740b.a.f18092q;
    }

    @Override // p217oe.AbstractC5741c
    /* JADX INFO: renamed from: k */
    public AbstractC1113a mo12780k() {
        return C2787b.f7259c;
    }

    /* JADX INFO: renamed from: m */
    public final List m12781m(C5164c.a aVar) {
        ArrayList arrayList = new ArrayList();
        int iM21191h = aVar.m21191h();
        if (aVar.m21192i() == -1) {
            iM21191h += AbstractC5591c.m22694f(m23238i(), aVar.m21186c()) + 1;
        }
        List listM12783a = f9416h.m12783a(AbstractC5591c.m22691c(m23238i(), aVar.m21186c()));
        int size = listM12783a.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            String str = (String) listM12783a.get(i10);
            if (!AbstractC8621f0.m33156p0(str) || (1 <= i10 && i10 <= AbstractC5114x.m20802q(listM12783a) - 1)) {
                arrayList.add(new InterfaceC6627f.a(new C2363j(iM21191h, str.length() + iM21191h), C2790e.f7274f));
                i11++;
            }
            int length = iM21191h + str.length();
            if (i10 < AbstractC5114x.m20802q(listM12783a)) {
                arrayList.add(new InterfaceC6627f.a(new C2363j(length, length + 1), C2790e.f7271c));
            }
            iM21191h = length + 1;
            if (i11 < this.f9418f) {
                i10++;
            } else if (iM21191h < aVar.m21190g()) {
                arrayList.add(new InterfaceC6627f.a(new C2363j(iM21191h, aVar.m21190g()), C2790e.f7271c));
                return arrayList;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m12782n(CharSequence charSequence) {
        return AbstractC8621f0.m33124Z(charSequence, '|', false, 2, null);
    }

    /* JADX INFO: renamed from: ie.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final List m12783a(CharSequence charSequence) {
            charSequence.getClass();
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (charSequence.charAt(i11) == '|' && charSequence.charAt(AbstractC2368o.m8578e(i11 - 1, 0)) != '\\') {
                    arrayList.add(charSequence.subSequence(i10, i11).toString());
                    i10 = i11 + 1;
                }
            }
            arrayList.add(charSequence.subSequence(i10, charSequence.length()).toString());
            return arrayList;
        }

        public a() {
        }
    }
}
