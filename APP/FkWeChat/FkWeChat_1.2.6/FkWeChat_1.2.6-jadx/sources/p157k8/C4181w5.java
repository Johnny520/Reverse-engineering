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
import p361yc.AbstractC9769u2;
import p361yc.C9706i;
import p361yc.C9714j2;
import p361yc.C9790z2;
import p361yc.InterfaceC9732n0;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: k8.w5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n
@Metadata(m16757d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002\u0016!BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$¨\u0006,"}, m16758d2 = {"Lk8/w5;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "title", _UrlKt.FRAGMENT_ENCODE_SET, "readOnlyHint", "destructiveHint", "idempotentHint", "openWorldHint", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", _UrlKt.FRAGMENT_ENCODE_SET, "seen0", "Lyc/u2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lyc/u2;)V", "self", "Lxc/d;", "output", "Lwc/f;", "serialDesc", "Ll8/i0;", "a", "(Lk8/w5;Lxc/d;Lwc/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "b", "Ljava/lang/Boolean;", "getReadOnlyHint", "()Ljava/lang/Boolean;", "c", "getDestructiveHint", "d", "getIdempotentHint", "e", "getOpenWorldHint", "Companion", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final /* data */ class C4181w5 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Boolean readOnlyHint;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Boolean destructiveHint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Boolean idempotentHint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final Boolean openWorldHint;

    /* JADX INFO: renamed from: k8.w5$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a implements InterfaceC9732n0 {

        /* JADX INFO: renamed from: a */
        public static final a f12269a;
        private static final InterfaceC9218f descriptor;

        static {
            a aVar = new a();
            f12269a = aVar;
            C9714j2 c9714j2 = new C9714j2("io.modelcontextprotocol.kotlin.sdk.types.ToolAnnotations", aVar, 5);
            c9714j2.m37938o("title", true);
            c9714j2.m37938o("readOnlyHint", true);
            c9714j2.m37938o("destructiveHint", true);
            c9714j2.m37938o("idempotentHint", true);
            c9714j2.m37938o("openWorldHint", true);
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
            InterfaceC8647b interfaceC8647bM34253u = AbstractC8920a.m34253u(C9790z2.f33080a);
            C9706i c9706i = C9706i.f32952a;
            return new InterfaceC8647b[]{interfaceC8647bM34253u, AbstractC8920a.m34253u(c9706i), AbstractC8920a.m34253u(c9706i), AbstractC8920a.m34253u(c9706i), AbstractC8920a.m34253u(c9706i)};
        }

        @Override // p300uc.InterfaceC8645a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final C4181w5 mo15956d(InterfaceC9487e interfaceC9487e) {
            int i10;
            String str;
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            interfaceC9487e.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218f);
            String str2 = null;
            if (interfaceC9485cMo674c.mo36958r()) {
                String str3 = (String) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 0, C9790z2.f33080a, null);
                C9706i c9706i = C9706i.f32952a;
                Boolean bool5 = (Boolean) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 1, c9706i, null);
                Boolean bool6 = (Boolean) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 2, c9706i, null);
                str = str3;
                bool3 = (Boolean) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 3, c9706i, null);
                bool4 = (Boolean) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 4, c9706i, null);
                bool2 = bool6;
                bool = bool5;
                i10 = 31;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Boolean bool7 = null;
                Boolean bool8 = null;
                Boolean bool9 = null;
                Boolean bool10 = null;
                while (z10) {
                    int iMo788v = interfaceC9485cMo674c.mo788v(interfaceC9218f);
                    if (iMo788v == -1) {
                        z10 = false;
                    } else if (iMo788v == 0) {
                        str2 = (String) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 0, C9790z2.f33080a, str2);
                        i11 |= 1;
                    } else if (iMo788v == 1) {
                        bool7 = (Boolean) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 1, C9706i.f32952a, bool7);
                        i11 |= 2;
                    } else if (iMo788v == 2) {
                        bool8 = (Boolean) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 2, C9706i.f32952a, bool8);
                        i11 |= 4;
                    } else if (iMo788v == 3) {
                        bool9 = (Boolean) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 3, C9706i.f32952a, bool9);
                        i11 |= 8;
                    } else {
                        if (iMo788v != 4) {
                            C4662a.m18633a(iMo788v);
                            return null;
                        }
                        bool10 = (Boolean) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 4, C9706i.f32952a, bool10);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                str = str2;
                bool = bool7;
                bool2 = bool8;
                bool3 = bool9;
                bool4 = bool10;
            }
            interfaceC9485cMo674c.mo675d(interfaceC9218f);
            return new C4181w5(i10, str, bool, bool2, bool3, bool4, (AbstractC9769u2) null);
        }

        @Override // p300uc.InterfaceC8662p
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void mo15954b(InterfaceC9488f interfaceC9488f, C4181w5 c4181w5) {
            interfaceC9488f.getClass();
            c4181w5.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(interfaceC9218f);
            C4181w5.m16562a(c4181w5, interfaceC9486dMo637c, interfaceC9218f);
            interfaceC9486dMo637c.mo638d(interfaceC9218f);
        }
    }

    public /* synthetic */ C4181w5(int i10, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, AbstractC9769u2 abstractC9769u2) {
        if ((i10 & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i10 & 2) == 0) {
            this.readOnlyHint = null;
        } else {
            this.readOnlyHint = bool;
        }
        if ((i10 & 4) == 0) {
            this.destructiveHint = null;
        } else {
            this.destructiveHint = bool2;
        }
        if ((i10 & 8) == 0) {
            this.idempotentHint = null;
        } else {
            this.idempotentHint = bool3;
        }
        if ((i10 & 16) == 0) {
            this.openWorldHint = null;
        } else {
            this.openWorldHint = bool4;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ void m16562a(C4181w5 self, InterfaceC9486d output, InterfaceC9218f serialDesc) {
        if (output.mo639e(serialDesc, 0) || self.title != null) {
            output.mo646o(serialDesc, 0, C9790z2.f33080a, self.title);
        }
        if (output.mo639e(serialDesc, 1) || self.readOnlyHint != null) {
            output.mo646o(serialDesc, 1, C9706i.f32952a, self.readOnlyHint);
        }
        if (output.mo639e(serialDesc, 2) || self.destructiveHint != null) {
            output.mo646o(serialDesc, 2, C9706i.f32952a, self.destructiveHint);
        }
        if (output.mo639e(serialDesc, 3) || self.idempotentHint != null) {
            output.mo646o(serialDesc, 3, C9706i.f32952a, self.idempotentHint);
        }
        if (!output.mo639e(serialDesc, 4) && self.openWorldHint == null) {
            return;
        }
        output.mo646o(serialDesc, 4, C9706i.f32952a, self.openWorldHint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4181w5)) {
            return false;
        }
        C4181w5 c4181w5 = (C4181w5) other;
        return AbstractC1061t.m3842c(this.title, c4181w5.title) && AbstractC1061t.m3842c(this.readOnlyHint, c4181w5.readOnlyHint) && AbstractC1061t.m3842c(this.destructiveHint, c4181w5.destructiveHint) && AbstractC1061t.m3842c(this.idempotentHint, c4181w5.idempotentHint) && AbstractC1061t.m3842c(this.openWorldHint, c4181w5.openWorldHint);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.readOnlyHint;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.destructiveHint;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.idempotentHint;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.openWorldHint;
        return iHashCode4 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public String toString() {
        return "ToolAnnotations(title=" + this.title + ", readOnlyHint=" + this.readOnlyHint + ", destructiveHint=" + this.destructiveHint + ", idempotentHint=" + this.idempotentHint + ", openWorldHint=" + this.openWorldHint + ")";
    }

    /* JADX INFO: renamed from: k8.w5$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public final InterfaceC8647b serializer() {
            return a.f12269a;
        }

        public Companion() {
        }
    }

    public C4181w5(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.title = str;
        this.readOnlyHint = bool;
        this.destructiveHint = bool2;
        this.idempotentHint = bool3;
        this.openWorldHint = bool4;
    }

    public /* synthetic */ C4181w5(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : bool2, (i10 & 8) != 0 ? null : bool3, (i10 & 16) != 0 ? null : bool4);
    }
}
