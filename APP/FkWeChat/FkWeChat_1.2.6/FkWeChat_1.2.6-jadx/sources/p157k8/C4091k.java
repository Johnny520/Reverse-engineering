package p157k8;

import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p170l6.C4662a;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p300uc.InterfaceC8645a;
import p300uc.InterfaceC8647b;
import p300uc.InterfaceC8660n;
import p300uc.InterfaceC8662p;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;
import p361yc.AbstractC9694f2;
import p361yc.AbstractC9769u2;
import p361yc.C9691f;
import p361yc.C9706i;
import p361yc.C9714j2;
import p361yc.InterfaceC9732n0;
import p375zc.C9950h0;
import p375zc.C9954j0;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: k8.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n
@Metadata(m16757d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002!%B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0006\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b,\u0010)\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010+¨\u00060"}, m16758d2 = {"Lk8/k;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "Lk8/u;", "content", _UrlKt.FRAGMENT_ENCODE_SET, "isError", "Lzc/h0;", "structuredContent", "meta", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Lzc/h0;Lzc/h0;)V", _UrlKt.FRAGMENT_ENCODE_SET, "seen0", "Lyc/u2;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/Boolean;Lzc/h0;Lzc/h0;Lyc/u2;)V", "self", "Lxc/d;", "output", "Lwc/f;", "serialDesc", "Ll8/i0;", "e", "(Lk8/k;Lxc/d;Lwc/f;)V", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getContent", "()Ljava/util/List;", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "c", "Lzc/h0;", "getStructuredContent", "()Lzc/h0;", "d", "getMeta$annotations", "()V", "Companion", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final /* data */ class C4091k implements InterfaceC4068g4 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static final InterfaceC4705l[] f11989e = {AbstractC4706m.m18788b(EnumC4708o.f13922r, new InterfaceC0173a() { // from class: k8.j
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return C4091k.m16263b();
        }
    }), null, null, null};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final List content;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final C9950h0 structuredContent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final C9950h0 meta;

    /* JADX INFO: renamed from: k8.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a implements InterfaceC9732n0 {

        /* JADX INFO: renamed from: a */
        public static final a f11994a;
        private static final InterfaceC9218f descriptor;

        static {
            a aVar = new a();
            f11994a = aVar;
            C9714j2 c9714j2 = new C9714j2("io.modelcontextprotocol.kotlin.sdk.types.CallToolResult", aVar, 4);
            c9714j2.m37938o("content", false);
            c9714j2.m37938o("isError", true);
            c9714j2.m37938o("structuredContent", true);
            c9714j2.m37938o("_meta", true);
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p361yc.InterfaceC9732n0
        /* JADX INFO: renamed from: e */
        public final InterfaceC8647b[] mo15957e() {
            C9954j0 c9954j0 = C9954j0.f33538a;
            return new InterfaceC8647b[]{C4091k.f11989e[0].getValue(), AbstractC8920a.m34253u(C9706i.f32952a), AbstractC8920a.m34253u(c9954j0), AbstractC8920a.m34253u(c9954j0)};
        }

        @Override // p300uc.InterfaceC8645a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final C4091k mo15956d(InterfaceC9487e interfaceC9487e) {
            int i10;
            List list;
            Boolean bool;
            C9950h0 c9950h0;
            C9950h0 c9950h02;
            interfaceC9487e.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218f);
            InterfaceC4705l[] interfaceC4705lArr = C4091k.f11989e;
            List list2 = null;
            if (interfaceC9485cMo674c.mo36958r()) {
                List list3 = (List) interfaceC9485cMo674c.mo895x(interfaceC9218f, 0, (InterfaceC8645a) interfaceC4705lArr[0].getValue(), null);
                Boolean bool2 = (Boolean) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 1, C9706i.f32952a, null);
                C9954j0 c9954j0 = C9954j0.f33538a;
                C9950h0 c9950h03 = (C9950h0) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 2, c9954j0, null);
                list = list3;
                bool = bool2;
                c9950h02 = (C9950h0) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 3, c9954j0, null);
                c9950h0 = c9950h03;
                i10 = 15;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Boolean bool3 = null;
                C9950h0 c9950h04 = null;
                C9950h0 c9950h05 = null;
                while (z10) {
                    int iMo788v = interfaceC9485cMo674c.mo788v(interfaceC9218f);
                    if (iMo788v == -1) {
                        z10 = false;
                    } else if (iMo788v == 0) {
                        list2 = (List) interfaceC9485cMo674c.mo895x(interfaceC9218f, 0, (InterfaceC8645a) interfaceC4705lArr[0].getValue(), list2);
                        i11 |= 1;
                    } else if (iMo788v == 1) {
                        bool3 = (Boolean) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 1, C9706i.f32952a, bool3);
                        i11 |= 2;
                    } else if (iMo788v == 2) {
                        c9950h04 = (C9950h0) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 2, C9954j0.f33538a, c9950h04);
                        i11 |= 4;
                    } else {
                        if (iMo788v != 3) {
                            C4662a.m18633a(iMo788v);
                            return null;
                        }
                        c9950h05 = (C9950h0) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 3, C9954j0.f33538a, c9950h05);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                list = list2;
                bool = bool3;
                c9950h0 = c9950h04;
                c9950h02 = c9950h05;
            }
            interfaceC9485cMo674c.mo675d(interfaceC9218f);
            return new C4091k(i10, list, bool, c9950h0, c9950h02, (AbstractC9769u2) null);
        }

        @Override // p300uc.InterfaceC8662p
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void mo15954b(InterfaceC9488f interfaceC9488f, C4091k c4091k) {
            interfaceC9488f.getClass();
            c4091k.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(interfaceC9218f);
            C4091k.m16265e(c4091k, interfaceC9486dMo637c, interfaceC9218f);
            interfaceC9486dMo637c.mo638d(interfaceC9218f);
        }
    }

    public /* synthetic */ C4091k(int i10, List list, Boolean bool, C9950h0 c9950h0, C9950h0 c9950h02, AbstractC9769u2 abstractC9769u2) {
        if (1 != (i10 & 1)) {
            AbstractC9694f2.m37891a(i10, 1, a.f11994a.mo15953a());
        }
        this.content = list;
        if ((i10 & 2) == 0) {
            this.isError = null;
        } else {
            this.isError = bool;
        }
        if ((i10 & 4) == 0) {
            this.structuredContent = null;
        } else {
            this.structuredContent = c9950h0;
        }
        if ((i10 & 8) == 0) {
            this.meta = null;
        } else {
            this.meta = c9950h02;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC8647b m16263b() {
        return new C9691f(C4168v.f12241c);
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ void m16265e(C4091k self, InterfaceC9486d output, InterfaceC9218f serialDesc) {
        output.mo36969g(serialDesc, 0, (InterfaceC8662p) f11989e[0].getValue(), self.content);
        if (output.mo639e(serialDesc, 1) || self.isError != null) {
            output.mo646o(serialDesc, 1, C9706i.f32952a, self.isError);
        }
        if (output.mo639e(serialDesc, 2) || self.structuredContent != null) {
            output.mo646o(serialDesc, 2, C9954j0.f33538a, self.structuredContent);
        }
        if (!output.mo639e(serialDesc, 3) && self.getMeta() == null) {
            return;
        }
        output.mo646o(serialDesc, 3, C9954j0.f33538a, self.getMeta());
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public C9950h0 getMeta() {
        return this.meta;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4091k)) {
            return false;
        }
        C4091k c4091k = (C4091k) other;
        return AbstractC1061t.m3842c(this.content, c4091k.content) && AbstractC1061t.m3842c(this.isError, c4091k.isError) && AbstractC1061t.m3842c(this.structuredContent, c4091k.structuredContent) && AbstractC1061t.m3842c(this.meta, c4091k.meta);
    }

    public int hashCode() {
        int iHashCode = this.content.hashCode() * 31;
        Boolean bool = this.isError;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        C9950h0 c9950h0 = this.structuredContent;
        int iHashCode3 = (iHashCode2 + (c9950h0 == null ? 0 : c9950h0.hashCode())) * 31;
        C9950h0 c9950h02 = this.meta;
        return iHashCode3 + (c9950h02 != null ? c9950h02.hashCode() : 0);
    }

    public String toString() {
        return "CallToolResult(content=" + this.content + ", isError=" + this.isError + ", structuredContent=" + this.structuredContent + ", meta=" + this.meta + ")";
    }

    /* JADX INFO: renamed from: k8.k$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public final InterfaceC8647b serializer() {
            return a.f11994a;
        }

        public Companion() {
        }
    }

    public C4091k(List list, Boolean bool, C9950h0 c9950h0, C9950h0 c9950h02) {
        list.getClass();
        this.content = list;
        this.isError = bool;
        this.structuredContent = c9950h0;
        this.meta = c9950h02;
    }

    public /* synthetic */ C4091k(List list, Boolean bool, C9950h0 c9950h0, C9950h0 c9950h02, int i10, AbstractC1043k abstractC1043k) {
        this(list, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : c9950h0, (i10 & 8) != 0 ? null : c9950h02);
    }
}
