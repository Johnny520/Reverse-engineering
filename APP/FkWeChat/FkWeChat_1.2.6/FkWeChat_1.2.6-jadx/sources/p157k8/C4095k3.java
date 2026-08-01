package p157k8;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p170l6.C4662a;
import p300uc.InterfaceC8647b;
import p300uc.InterfaceC8660n;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;
import p361yc.AbstractC9694f2;
import p361yc.AbstractC9769u2;
import p361yc.C9706i;
import p361yc.C9714j2;
import p361yc.C9790z2;
import p361yc.InterfaceC9732n0;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: k8.k3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n
@Metadata(m16757d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002\u0014\u001fBC\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u0017¨\u0006("}, m16758d2 = {"Lk8/k3;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "seen0", _UrlKt.FRAGMENT_ENCODE_SET, "name", "description", _UrlKt.FRAGMENT_ENCODE_SET, "required", "title", "Lyc/u2;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lyc/u2;)V", "self", "Lxc/d;", "output", "Lwc/f;", "serialDesc", "Ll8/i0;", "a", "(Lk8/k3;Lxc/d;Lwc/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "b", "getDescription", "c", "Ljava/lang/Boolean;", "getRequired", "()Ljava/lang/Boolean;", "d", "getTitle", "Companion", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final /* data */ class C4095k3 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String description;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Boolean required;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String title;

    /* JADX INFO: renamed from: k8.k3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a implements InterfaceC9732n0 {

        /* JADX INFO: renamed from: a */
        public static final a f12001a;
        private static final InterfaceC9218f descriptor;

        static {
            a aVar = new a();
            f12001a = aVar;
            C9714j2 c9714j2 = new C9714j2("io.modelcontextprotocol.kotlin.sdk.types.PromptArgument", aVar, 4);
            c9714j2.m37938o("name", false);
            c9714j2.m37938o("description", true);
            c9714j2.m37938o("required", true);
            c9714j2.m37938o("title", true);
            descriptor = c9714j2;
        }

        @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
        /* JADX INFO: renamed from: a */
        public final InterfaceC9218f mo15953a() {
            return descriptor;
        }

        @Override // p361yc.InterfaceC9732n0
        /* JADX INFO: renamed from: c */
        public /* bridge */ InterfaceC8647b[] mo15955c() {
            return super.mo15955c();
        }

        @Override // p361yc.InterfaceC9732n0
        /* JADX INFO: renamed from: e */
        public final InterfaceC8647b[] mo15957e() {
            C9790z2 c9790z2 = C9790z2.f33080a;
            return new InterfaceC8647b[]{c9790z2, AbstractC8920a.m34253u(c9790z2), AbstractC8920a.m34253u(C9706i.f32952a), AbstractC8920a.m34253u(c9790z2)};
        }

        @Override // p300uc.InterfaceC8645a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final C4095k3 mo15956d(InterfaceC9487e interfaceC9487e) {
            int i10;
            String str;
            String str2;
            Boolean bool;
            String str3;
            interfaceC9487e.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218f);
            String strMo36955m = null;
            if (interfaceC9485cMo674c.mo36958r()) {
                String strMo36955m2 = interfaceC9485cMo674c.mo36955m(interfaceC9218f, 0);
                C9790z2 c9790z2 = C9790z2.f33080a;
                String str4 = (String) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 1, c9790z2, null);
                Boolean bool2 = (Boolean) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 2, C9706i.f32952a, null);
                str = strMo36955m2;
                str3 = (String) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 3, c9790z2, null);
                bool = bool2;
                str2 = str4;
                i10 = 15;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String str5 = null;
                Boolean bool3 = null;
                String str6 = null;
                while (z10) {
                    int iMo788v = interfaceC9485cMo674c.mo788v(interfaceC9218f);
                    if (iMo788v == -1) {
                        z10 = false;
                    } else if (iMo788v == 0) {
                        strMo36955m = interfaceC9485cMo674c.mo36955m(interfaceC9218f, 0);
                        i11 |= 1;
                    } else if (iMo788v == 1) {
                        str5 = (String) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 1, C9790z2.f33080a, str5);
                        i11 |= 2;
                    } else if (iMo788v == 2) {
                        bool3 = (Boolean) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 2, C9706i.f32952a, bool3);
                        i11 |= 4;
                    } else {
                        if (iMo788v != 3) {
                            C4662a.m18633a(iMo788v);
                            return null;
                        }
                        str6 = (String) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 3, C9790z2.f33080a, str6);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                str = strMo36955m;
                str2 = str5;
                bool = bool3;
                str3 = str6;
            }
            interfaceC9485cMo674c.mo675d(interfaceC9218f);
            return new C4095k3(i10, str, str2, bool, str3, null);
        }

        @Override // p300uc.InterfaceC8662p
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void mo15954b(InterfaceC9488f interfaceC9488f, C4095k3 c4095k3) {
            interfaceC9488f.getClass();
            c4095k3.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(interfaceC9218f);
            C4095k3.m16272a(c4095k3, interfaceC9486dMo637c, interfaceC9218f);
            interfaceC9486dMo637c.mo638d(interfaceC9218f);
        }
    }

    public /* synthetic */ C4095k3(int i10, String str, String str2, Boolean bool, String str3, AbstractC9769u2 abstractC9769u2) {
        if (1 != (i10 & 1)) {
            AbstractC9694f2.m37891a(i10, 1, a.f12001a.mo15953a());
        }
        this.name = str;
        if ((i10 & 2) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        if ((i10 & 4) == 0) {
            this.required = null;
        } else {
            this.required = bool;
        }
        if ((i10 & 8) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ void m16272a(C4095k3 self, InterfaceC9486d output, InterfaceC9218f serialDesc) {
        output.mo36966D(serialDesc, 0, self.name);
        if (output.mo639e(serialDesc, 1) || self.description != null) {
            output.mo646o(serialDesc, 1, C9790z2.f33080a, self.description);
        }
        if (output.mo639e(serialDesc, 2) || self.required != null) {
            output.mo646o(serialDesc, 2, C9706i.f32952a, self.required);
        }
        if (!output.mo639e(serialDesc, 3) && self.title == null) {
            return;
        }
        output.mo646o(serialDesc, 3, C9790z2.f33080a, self.title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4095k3)) {
            return false;
        }
        C4095k3 c4095k3 = (C4095k3) other;
        return AbstractC1061t.m3842c(this.name, c4095k3.name) && AbstractC1061t.m3842c(this.description, c4095k3.description) && AbstractC1061t.m3842c(this.required, c4095k3.required) && AbstractC1061t.m3842c(this.title, c4095k3.title);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.required;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.title;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PromptArgument(name=" + this.name + ", description=" + this.description + ", required=" + this.required + ", title=" + this.title + ")";
    }

    /* JADX INFO: renamed from: k8.k3$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public final InterfaceC8647b serializer() {
            return a.f12001a;
        }

        public Companion() {
        }
    }
}
