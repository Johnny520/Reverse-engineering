package p170l6;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p170l6.C4676o;
import p300uc.InterfaceC8647b;
import p300uc.InterfaceC8660n;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;
import p361yc.AbstractC9694f2;
import p361yc.AbstractC9769u2;
import p361yc.C9714j2;
import p361yc.C9780x0;
import p361yc.InterfaceC9732n0;

/* JADX INFO: renamed from: l6.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n
@Metadata(m16757d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0018¨\u0006'"}, m16758d2 = {"Ll6/n;", "Ll6/d;", "Ll6/o;", "location", _UrlKt.FRAGMENT_ENCODE_SET, "rgb", "<init>", "(Ll6/o;I)V", "seen0", "Lyc/u2;", "serializationConstructorMarker", "(ILl6/o;ILyc/u2;)V", "self", "Lxc/d;", "output", "Lwc/f;", "serialDesc", "Ll8/i0;", "g", "(Ll6/n;Lxc/d;Lwc/f;)V", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "b", "Ll6/o;", "d", "()Ll6/o;", "c", "I", "f", "Companion", "a", "highlights"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final /* data */ class C4675n extends AbstractC4665d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final C4676o location;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int rgb;

    /* JADX INFO: renamed from: l6.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a implements InterfaceC9732n0 {

        /* JADX INFO: renamed from: a */
        public static final a f13847a;
        private static final InterfaceC9218f descriptor;

        static {
            a aVar = new a();
            f13847a = aVar;
            C9714j2 c9714j2 = new C9714j2("dev.snipme.highlights.model.ColorHighlight", aVar, 2);
            c9714j2.m37938o("location", false);
            c9714j2.m37938o("rgb", false);
            descriptor = c9714j2;
        }

        @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
        /* JADX INFO: renamed from: a */
        public final InterfaceC9218f mo15953a() {
            return descriptor;
        }

        @Override // p361yc.InterfaceC9732n0
        /* JADX INFO: renamed from: c */
        public InterfaceC8647b[] mo15955c() {
            return InterfaceC9732n0.a.m37980a(this);
        }

        @Override // p361yc.InterfaceC9732n0
        /* JADX INFO: renamed from: e */
        public final InterfaceC8647b[] mo15957e() {
            return new InterfaceC8647b[]{C4676o.a.f13850a, C9780x0.f33064a};
        }

        @Override // p300uc.InterfaceC8645a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final C4675n mo15956d(InterfaceC9487e interfaceC9487e) {
            C4676o c4676o;
            int iMo36954l;
            int i10;
            interfaceC9487e.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218f);
            AbstractC9769u2 abstractC9769u2 = null;
            if (interfaceC9485cMo674c.mo36958r()) {
                c4676o = (C4676o) interfaceC9485cMo674c.mo895x(interfaceC9218f, 0, C4676o.a.f13850a, null);
                iMo36954l = interfaceC9485cMo674c.mo36954l(interfaceC9218f, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                int iMo36954l2 = 0;
                int i11 = 0;
                c4676o = null;
                while (z10) {
                    int iMo788v = interfaceC9485cMo674c.mo788v(interfaceC9218f);
                    if (iMo788v == -1) {
                        z10 = false;
                    } else if (iMo788v == 0) {
                        c4676o = (C4676o) interfaceC9485cMo674c.mo895x(interfaceC9218f, 0, C4676o.a.f13850a, c4676o);
                        i11 |= 1;
                    } else {
                        if (iMo788v != 1) {
                            C4662a.m18633a(iMo788v);
                            return null;
                        }
                        iMo36954l2 = interfaceC9485cMo674c.mo36954l(interfaceC9218f, 1);
                        i11 |= 2;
                    }
                }
                iMo36954l = iMo36954l2;
                i10 = i11;
            }
            interfaceC9485cMo674c.mo675d(interfaceC9218f);
            return new C4675n(i10, c4676o, iMo36954l, abstractC9769u2);
        }

        @Override // p300uc.InterfaceC8662p
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void mo15954b(InterfaceC9488f interfaceC9488f, C4675n c4675n) {
            interfaceC9488f.getClass();
            c4675n.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(interfaceC9218f);
            C4675n.m18674g(c4675n, interfaceC9486dMo637c, interfaceC9218f);
            interfaceC9486dMo637c.mo638d(interfaceC9218f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4675n(int i10, C4676o c4676o, int i11, AbstractC9769u2 abstractC9769u2) {
        super(i10, abstractC9769u2);
        if (3 != (i10 & 3)) {
            AbstractC9694f2.m37891a(i10, 3, a.f13847a.mo15953a());
        }
        this.location = c4676o;
        this.rgb = i11;
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ void m18674g(C4675n self, InterfaceC9486d output, InterfaceC9218f serialDesc) {
        AbstractC4665d.m18641e(self, output, serialDesc);
        output.mo36969g(serialDesc, 0, C4676o.a.f13850a, self.getLocation());
        output.mo36964B(serialDesc, 1, self.rgb);
    }

    @Override // p170l6.AbstractC4665d
    /* JADX INFO: renamed from: d, reason: from getter */
    public C4676o getLocation() {
        return this.location;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4675n)) {
            return false;
        }
        C4675n c4675n = (C4675n) other;
        return AbstractC1061t.m3842c(this.location, c4675n.location) && this.rgb == c4675n.rgb;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getRgb() {
        return this.rgb;
    }

    public int hashCode() {
        return (this.location.hashCode() * 31) + Integer.hashCode(this.rgb);
    }

    public String toString() {
        return "ColorHighlight(location=" + this.location + ", rgb=" + this.rgb + ")";
    }

    /* JADX INFO: renamed from: l6.n$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public Companion() {
        }

        public final InterfaceC8647b serializer() {
            return a.f13847a;
        }

        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4675n(C4676o c4676o, int i10) {
        super(null);
        c4676o.getClass();
        this.location = c4676o;
        this.rgb = i10;
    }
}
