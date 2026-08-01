package me;

import be.AbstractC1113a;
import be.AbstractC1117e;
import be.C1115c;
import be.C1116d;
import ee.InterfaceC2215a;
import ge.C2790e;
import java.util.List;
import me.C5164c;
import me.C5168g;
import me.InterfaceC5162a;
import p024b9.AbstractC1061t;
import p038ce.C1520b;
import p038ce.C1523e;
import p038ce.C1524f;
import p038ce.InterfaceC1519a;
import p080f9.C2363j;
import p175le.C4754c;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;
import re.AbstractC6629h;
import re.C6624c;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: me.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5165d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2215a f15770a;

    /* JADX INFO: renamed from: b */
    public final boolean f15771b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5162a f15772c;

    /* JADX INFO: renamed from: me.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a extends C1520b {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C5165d f15773d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C5165d c5165d, CharSequence charSequence) {
            super(charSequence);
            charSequence.getClass();
            this.f15773d = c5165d;
        }

        @Override // p038ce.C1520b
        /* JADX INFO: renamed from: b */
        public List mo5942b(AbstractC1113a abstractC1113a, int i10, int i11) {
            abstractC1113a.getClass();
            return AbstractC1061t.m3842c(abstractC1113a, C1115c.f3361k) ? true : AbstractC1061t.m3842c(abstractC1113a, AbstractC1117e.f3410t) ? true : AbstractC1061t.m3842c(abstractC1113a, AbstractC1117e.f3413w) ? true : AbstractC1061t.m3842c(abstractC1113a, C2790e.f7274f) ? AbstractC5112w.m20789e(this.f15773d.m21202f(abstractC1113a, m5943c(), i10, i11)) : super.mo5942b(abstractC1113a, i10, i11);
        }
    }

    public C5165d(InterfaceC2215a interfaceC2215a, boolean z10, InterfaceC5162a interfaceC5162a) {
        interfaceC2215a.getClass();
        interfaceC5162a.getClass();
        this.f15770a = interfaceC2215a;
        this.f15771b = z10;
        this.f15772c = interfaceC5162a;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1519a m21197a(String str) {
        str.getClass();
        return m21201e(C1115c.f3352b, str, true);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC1519a m21198b(AbstractC1113a abstractC1113a, String str, boolean z10) {
        C5168g c5168g = new C5168g();
        AbstractC5166e abstractC5166eMo8793a = this.f15770a.mo7982c().mo8793a(c5168g);
        C5168g.a aVarM21225e = c5168g.m21225e();
        for (C5164c.a aVarM21182c = new C5164c(str).m21182c(); aVarM21182c != null; aVarM21182c = abstractC5166eMo8793a.m21214o(aVarM21182c)) {
            this.f15772c.mo21175a();
            c5168g.m21226f(aVarM21182c.m21191h());
        }
        c5168g.m21226f(str.length());
        abstractC5166eMo8793a.m21208f();
        aVarM21225e.m21227a(abstractC1113a);
        return new C5169h(z10 ? new a(this, str) : new C1520b(str)).m21229a(c5168g.m21224d());
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC1519a m21199c(AbstractC1113a abstractC1113a, CharSequence charSequence, int i10, int i11) {
        C4754c c4754cMo7980a = this.f15770a.mo7980a();
        C4754c.m19008m(c4754cMo7980a, charSequence, i10, i11, 0, 8, null);
        C6624c c6624c = new C6624c(c4754cMo7980a);
        C2363j c2363j = new C2363j(0, c6624c.mo26242b().size());
        return new C5163b(new C1520b(charSequence, this.f15772c), c6624c, this.f15772c).m21229a(AbstractC5081g0.m20533E0(this.f15770a.mo7981b().m26260b(c6624c, AbstractC6629h.f20760a.m26261a(c6624c, c2363j), this.f15772c), AbstractC5112w.m20789e(new InterfaceC6627f.a(c2363j, abstractC1113a))));
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC1519a m21200d(AbstractC1113a abstractC1113a, int i10, int i11) {
        return new C1523e(abstractC1113a, AbstractC5112w.m20789e(new C1524f(AbstractC1117e.f3392b, i10, i11)));
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC1519a m21201e(AbstractC1113a abstractC1113a, String str, boolean z10) {
        abstractC1113a.getClass();
        str.getClass();
        try {
            return m21198b(abstractC1113a, str, z10);
        } catch (C1116d e10) {
            if (this.f15771b) {
                throw e10;
            }
            return m21203g(abstractC1113a, str);
        }
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC1519a m21202f(AbstractC1113a abstractC1113a, CharSequence charSequence, int i10, int i11) {
        abstractC1113a.getClass();
        charSequence.getClass();
        try {
            return m21199c(abstractC1113a, charSequence, i10, i11);
        } catch (C1116d e10) {
            if (this.f15771b) {
                throw e10;
            }
            return m21200d(abstractC1113a, i10, i11);
        }
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC1519a m21203g(AbstractC1113a abstractC1113a, String str) {
        return new C1523e(abstractC1113a, AbstractC5112w.m20789e(m21200d(C1115c.f3361k, 0, str.length())));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5165d(InterfaceC2215a interfaceC2215a) {
        this(interfaceC2215a, true);
        interfaceC2215a.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5165d(InterfaceC2215a interfaceC2215a, boolean z10) {
        this(interfaceC2215a, z10, InterfaceC5162a.a.f15759a);
        interfaceC2215a.getClass();
    }
}
