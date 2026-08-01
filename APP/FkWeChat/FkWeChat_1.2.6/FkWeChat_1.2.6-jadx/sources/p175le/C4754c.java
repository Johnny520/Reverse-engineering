package p175le;

import be.AbstractC1113a;
import be.AbstractC1117e;
import java.util.Set;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5068b1;
import p215oc.C5725t;

/* JADX INFO: renamed from: le.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C4754c {

    /* JADX INFO: renamed from: j */
    public static final a f14073j = new a(null);

    /* JADX INFO: renamed from: k */
    public static final Set f14074k = AbstractC5068b1.m20487i(AbstractC1117e.f3392b, AbstractC1117e.f3390N, AbstractC1117e.f3393c, AbstractC1117e.f3408r, AbstractC1117e.f3385I, AbstractC1117e.f3378B, AbstractC1117e.f3386J, AbstractC1117e.f3387K, AbstractC1117e.f3389M);

    /* JADX INFO: renamed from: a */
    public final InterfaceC4753b f14075a;

    /* JADX INFO: renamed from: b */
    public AbstractC1113a f14076b;

    /* JADX INFO: renamed from: c */
    public AbstractC1113a f14077c;

    /* JADX INFO: renamed from: d */
    public CharSequence f14078d;

    /* JADX INFO: renamed from: e */
    public int f14079e;

    /* JADX INFO: renamed from: f */
    public int f14080f;

    /* JADX INFO: renamed from: g */
    public int f14081g;

    /* JADX INFO: renamed from: h */
    public int f14082h;

    /* JADX INFO: renamed from: i */
    public final int f14083i;

    public C4754c(InterfaceC4753b interfaceC4753b) {
        interfaceC4753b.getClass();
        this.f14075a = interfaceC4753b;
        this.f14078d = _UrlKt.FRAGMENT_ENCODE_SET;
        this.f14083i = interfaceC4753b.mo11123a();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m19008m(C4754c c4754c, CharSequence charSequence, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: start");
            return;
        }
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = charSequence.length();
        }
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        c4754c.m19020l(charSequence, i10, i11, i12);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19009a() {
        return m19018j();
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1113a m19010b() {
        return this.f14075a.mo11124b();
    }

    /* JADX INFO: renamed from: c */
    public final void m19011c() {
        AbstractC1113a abstractC1113a;
        do {
            this.f14082h = this.f14075a.mo11125c();
            AbstractC1113a abstractC1113aM19010b = m19010b();
            this.f14077c = abstractC1113aM19010b;
            abstractC1113a = this.f14076b;
            if (!AbstractC1061t.m3842c(abstractC1113aM19010b, abstractC1113a) || abstractC1113a == null) {
                return;
            }
        } while (f14074k.contains(abstractC1113a));
    }

    /* JADX INFO: renamed from: d */
    public final int m19012d() {
        return this.f14080f;
    }

    /* JADX INFO: renamed from: e */
    public final int m19013e() {
        return this.f14079e;
    }

    /* JADX INFO: renamed from: f */
    public final CharSequence m19014f() {
        return this.f14078d;
    }

    /* JADX INFO: renamed from: g */
    public final int m19015g() {
        return this.f14082h;
    }

    /* JADX INFO: renamed from: h */
    public final int m19016h() {
        return this.f14081g;
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC1113a m19017i() {
        return this.f14076b;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m19018j() {
        AbstractC1113a abstractC1113a = this.f14077c;
        this.f14076b = abstractC1113a;
        this.f14081g = this.f14082h;
        if (abstractC1113a == null) {
            return false;
        }
        m19011c();
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m19019k(CharSequence charSequence, int i10, int i11, int i12) {
        charSequence.getClass();
        this.f14078d = charSequence;
        this.f14079e = i10;
        this.f14080f = i11;
        this.f14075a.mo11126d(charSequence, i10, i11, i12);
        this.f14076b = m19010b();
        this.f14081g = this.f14075a.mo11127e();
    }

    /* JADX INFO: renamed from: l */
    public final void m19020l(CharSequence charSequence, int i10, int i11, int i12) {
        charSequence.getClass();
        m19019k(charSequence, i10, i11, i12);
        m19011c();
    }

    /* JADX INFO: renamed from: le.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
