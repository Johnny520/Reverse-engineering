package p157k8;

import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p157k8.C4181w5;
import p157k8.C4183x0;
import p157k8.C4202z5;
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
import p361yc.C9714j2;
import p361yc.C9790z2;
import p361yc.InterfaceC9732n0;
import p375zc.C9950h0;
import p375zc.C9954j0;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: k8.v5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n
@Metadata(m16757d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002'*Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bq\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b2\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u00103\u001a\u0004\b4\u00105R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b=\u0010>\u001a\u0004\b0\u0010<¨\u0006@"}, m16758d2 = {"Lk8/v5;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "name", "Lk8/z5;", "inputSchema", "description", "outputSchema", "title", "Lk8/w5;", "annotations", _UrlKt.FRAGMENT_ENCODE_SET, "Lk8/x0;", "icons", "Lzc/h0;", "meta", "<init>", "(Ljava/lang/String;Lk8/z5;Ljava/lang/String;Lk8/z5;Ljava/lang/String;Lk8/w5;Ljava/util/List;Lzc/h0;)V", _UrlKt.FRAGMENT_ENCODE_SET, "seen0", "Lyc/u2;", "serializationConstructorMarker", "(ILjava/lang/String;Lk8/z5;Ljava/lang/String;Lk8/z5;Ljava/lang/String;Lk8/w5;Ljava/util/List;Lzc/h0;Lyc/u2;)V", "self", "Lxc/d;", "output", "Lwc/f;", "serialDesc", "Ll8/i0;", "f", "(Lk8/v5;Lxc/d;Lwc/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Lk8/z5;", "getInputSchema", "()Lk8/z5;", "c", "getDescription", "d", "getOutputSchema", "getTitle", "Lk8/w5;", "getAnnotations", "()Lk8/w5;", "g", "Ljava/util/List;", "getIcons", "()Ljava/util/List;", "h", "Lzc/h0;", "()Lzc/h0;", "getMeta$annotations", "()V", "Companion", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final /* data */ class C4174v5 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i */
    public static final InterfaceC4705l[] f12252i = {null, null, null, null, null, null, AbstractC4706m.m18788b(EnumC4708o.f13922r, new InterfaceC0173a() { // from class: k8.u5
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return C4174v5.m16551b();
        }
    }), null};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final C4202z5 inputSchema;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final C4202z5 outputSchema;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final C4181w5 annotations;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final List icons;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final C9950h0 meta;

    /* JADX INFO: renamed from: k8.v5$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a implements InterfaceC9732n0 {

        /* JADX INFO: renamed from: a */
        public static final a f12261a;
        private static final InterfaceC9218f descriptor;

        static {
            a aVar = new a();
            f12261a = aVar;
            C9714j2 c9714j2 = new C9714j2("io.modelcontextprotocol.kotlin.sdk.types.Tool", aVar, 8);
            c9714j2.m37938o("name", false);
            c9714j2.m37938o("inputSchema", false);
            c9714j2.m37938o("description", true);
            c9714j2.m37938o("outputSchema", true);
            c9714j2.m37938o("title", true);
            c9714j2.m37938o("annotations", true);
            c9714j2.m37938o("icons", true);
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

        @Override // p361yc.InterfaceC9732n0
        /* JADX INFO: renamed from: e */
        public final InterfaceC8647b[] mo15957e() {
            InterfaceC4705l[] interfaceC4705lArr = C4174v5.f12252i;
            C9790z2 c9790z2 = C9790z2.f33080a;
            C4202z5.a aVar = C4202z5.a.f12335a;
            return new InterfaceC8647b[]{c9790z2, aVar, AbstractC8920a.m34253u(c9790z2), AbstractC8920a.m34253u(aVar), AbstractC8920a.m34253u(c9790z2), AbstractC8920a.m34253u(C4181w5.a.f12269a), AbstractC8920a.m34253u((InterfaceC8647b) interfaceC4705lArr[6].getValue()), AbstractC8920a.m34253u(C9954j0.f33538a)};
        }

        @Override // p300uc.InterfaceC8645a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final C4174v5 mo15956d(InterfaceC9487e interfaceC9487e) {
            int i10;
            C9950h0 c9950h0;
            List list;
            C4181w5 c4181w5;
            String str;
            String str2;
            C4202z5 c4202z5;
            String str3;
            C4202z5 c4202z52;
            interfaceC9487e.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218f);
            InterfaceC4705l[] interfaceC4705lArr = C4174v5.f12252i;
            int i11 = 7;
            char c10 = 4;
            String strMo36955m = null;
            if (interfaceC9485cMo674c.mo36958r()) {
                String strMo36955m2 = interfaceC9485cMo674c.mo36955m(interfaceC9218f, 0);
                C4202z5.a aVar = C4202z5.a.f12335a;
                C4202z5 c4202z53 = (C4202z5) interfaceC9485cMo674c.mo895x(interfaceC9218f, 1, aVar, null);
                C9790z2 c9790z2 = C9790z2.f33080a;
                String str4 = (String) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 2, c9790z2, null);
                C4202z5 c4202z54 = (C4202z5) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 3, aVar, null);
                String str5 = (String) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 4, c9790z2, null);
                C4181w5 c4181w52 = (C4181w5) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 5, C4181w5.a.f12269a, null);
                list = (List) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 6, (InterfaceC8645a) interfaceC4705lArr[6].getValue(), null);
                str2 = strMo36955m2;
                c9950h0 = (C9950h0) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 7, C9954j0.f33538a, null);
                c4181w5 = c4181w52;
                c4202z52 = c4202z54;
                str = str5;
                str3 = str4;
                i10 = 255;
                c4202z5 = c4202z53;
            } else {
                boolean z10 = true;
                int i12 = 0;
                C9950h0 c9950h02 = null;
                List list2 = null;
                C4181w5 c4181w53 = null;
                String str6 = null;
                C4202z5 c4202z55 = null;
                String str7 = null;
                C4202z5 c4202z56 = null;
                while (z10) {
                    int iMo788v = interfaceC9485cMo674c.mo788v(interfaceC9218f);
                    switch (iMo788v) {
                        case -1:
                            z10 = false;
                            c10 = 4;
                            break;
                        case 0:
                            strMo36955m = interfaceC9485cMo674c.mo36955m(interfaceC9218f, 0);
                            i12 |= 1;
                            i11 = 7;
                            c10 = 4;
                            break;
                        case 1:
                            c4202z55 = (C4202z5) interfaceC9485cMo674c.mo895x(interfaceC9218f, 1, C4202z5.a.f12335a, c4202z55);
                            i12 |= 2;
                            i11 = 7;
                            c10 = 4;
                            break;
                        case 2:
                            str7 = (String) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 2, C9790z2.f33080a, str7);
                            i12 |= 4;
                            i11 = 7;
                            c10 = 4;
                            break;
                        case 3:
                            c4202z56 = (C4202z5) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 3, C4202z5.a.f12335a, c4202z56);
                            i12 |= 8;
                            i11 = 7;
                            c10 = 4;
                            break;
                        case 4:
                            str6 = (String) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 4, C9790z2.f33080a, str6);
                            i12 |= 16;
                            c10 = 4;
                            i11 = 7;
                            break;
                        case 5:
                            c4181w53 = (C4181w5) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 5, C4181w5.a.f12269a, c4181w53);
                            i12 |= 32;
                            c10 = 4;
                            break;
                        case 6:
                            list2 = (List) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 6, (InterfaceC8645a) interfaceC4705lArr[6].getValue(), list2);
                            i12 |= 64;
                            c10 = 4;
                            break;
                        case 7:
                            c9950h02 = (C9950h0) interfaceC9485cMo674c.mo36949C(interfaceC9218f, i11, C9954j0.f33538a, c9950h02);
                            i12 |= 128;
                            c10 = 4;
                            break;
                        default:
                            C4662a.m18633a(iMo788v);
                            return null;
                    }
                }
                i10 = i12;
                c9950h0 = c9950h02;
                list = list2;
                c4181w5 = c4181w53;
                str = str6;
                str2 = strMo36955m;
                c4202z5 = c4202z55;
                str3 = str7;
                c4202z52 = c4202z56;
            }
            interfaceC9485cMo674c.mo675d(interfaceC9218f);
            return new C4174v5(i10, str2, c4202z5, str3, c4202z52, str, c4181w5, list, c9950h0, (AbstractC9769u2) null);
        }

        @Override // p300uc.InterfaceC8662p
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void mo15954b(InterfaceC9488f interfaceC9488f, C4174v5 c4174v5) {
            interfaceC9488f.getClass();
            c4174v5.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(interfaceC9218f);
            C4174v5.m16553f(c4174v5, interfaceC9486dMo637c, interfaceC9218f);
            interfaceC9486dMo637c.mo638d(interfaceC9218f);
        }
    }

    public /* synthetic */ C4174v5(int i10, String str, C4202z5 c4202z5, String str2, C4202z5 c4202z52, String str3, C4181w5 c4181w5, List list, C9950h0 c9950h0, AbstractC9769u2 abstractC9769u2) {
        if (3 != (i10 & 3)) {
            AbstractC9694f2.m37891a(i10, 3, a.f12261a.mo15953a());
        }
        this.name = str;
        this.inputSchema = c4202z5;
        if ((i10 & 4) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        if ((i10 & 8) == 0) {
            this.outputSchema = null;
        } else {
            this.outputSchema = c4202z52;
        }
        if ((i10 & 16) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i10 & 32) == 0) {
            this.annotations = null;
        } else {
            this.annotations = c4181w5;
        }
        if ((i10 & 64) == 0) {
            this.icons = null;
        } else {
            this.icons = list;
        }
        if ((i10 & 128) == 0) {
            this.meta = null;
        } else {
            this.meta = c9950h0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC8647b m16551b() {
        return new C9691f(C4183x0.a.f12284a);
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ void m16553f(C4174v5 self, InterfaceC9486d output, InterfaceC9218f serialDesc) {
        InterfaceC4705l[] interfaceC4705lArr = f12252i;
        output.mo36966D(serialDesc, 0, self.name);
        C4202z5.a aVar = C4202z5.a.f12335a;
        output.mo36969g(serialDesc, 1, aVar, self.inputSchema);
        if (output.mo639e(serialDesc, 2) || self.description != null) {
            output.mo646o(serialDesc, 2, C9790z2.f33080a, self.description);
        }
        if (output.mo639e(serialDesc, 3) || self.outputSchema != null) {
            output.mo646o(serialDesc, 3, aVar, self.outputSchema);
        }
        if (output.mo639e(serialDesc, 4) || self.title != null) {
            output.mo646o(serialDesc, 4, C9790z2.f33080a, self.title);
        }
        if (output.mo639e(serialDesc, 5) || self.annotations != null) {
            output.mo646o(serialDesc, 5, C4181w5.a.f12269a, self.annotations);
        }
        if (output.mo639e(serialDesc, 6) || self.icons != null) {
            output.mo646o(serialDesc, 6, (InterfaceC8662p) interfaceC4705lArr[6].getValue(), self.icons);
        }
        if (!output.mo639e(serialDesc, 7) && self.getMeta() == null) {
            return;
        }
        output.mo646o(serialDesc, 7, C9954j0.f33538a, self.getMeta());
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public C9950h0 getMeta() {
        return this.meta;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4174v5)) {
            return false;
        }
        C4174v5 c4174v5 = (C4174v5) other;
        return AbstractC1061t.m3842c(this.name, c4174v5.name) && AbstractC1061t.m3842c(this.inputSchema, c4174v5.inputSchema) && AbstractC1061t.m3842c(this.description, c4174v5.description) && AbstractC1061t.m3842c(this.outputSchema, c4174v5.outputSchema) && AbstractC1061t.m3842c(this.title, c4174v5.title) && AbstractC1061t.m3842c(this.annotations, c4174v5.annotations) && AbstractC1061t.m3842c(this.icons, c4174v5.icons) && AbstractC1061t.m3842c(this.meta, c4174v5.meta);
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.inputSchema.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C4202z5 c4202z5 = this.outputSchema;
        int iHashCode3 = (iHashCode2 + (c4202z5 == null ? 0 : c4202z5.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C4181w5 c4181w5 = this.annotations;
        int iHashCode5 = (iHashCode4 + (c4181w5 == null ? 0 : c4181w5.hashCode())) * 31;
        List list = this.icons;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        C9950h0 c9950h0 = this.meta;
        return iHashCode6 + (c9950h0 != null ? c9950h0.hashCode() : 0);
    }

    public String toString() {
        return "Tool(name=" + this.name + ", inputSchema=" + this.inputSchema + ", description=" + this.description + ", outputSchema=" + this.outputSchema + ", title=" + this.title + ", annotations=" + this.annotations + ", icons=" + this.icons + ", meta=" + this.meta + ")";
    }

    /* JADX INFO: renamed from: k8.v5$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public final InterfaceC8647b serializer() {
            return a.f12261a;
        }

        public Companion() {
        }
    }

    public C4174v5(String str, C4202z5 c4202z5, String str2, C4202z5 c4202z52, String str3, C4181w5 c4181w5, List list, C9950h0 c9950h0) {
        str.getClass();
        c4202z5.getClass();
        this.name = str;
        this.inputSchema = c4202z5;
        this.description = str2;
        this.outputSchema = c4202z52;
        this.title = str3;
        this.annotations = c4181w5;
        this.icons = list;
        this.meta = c9950h0;
    }

    public /* synthetic */ C4174v5(String str, C4202z5 c4202z5, String str2, C4202z5 c4202z52, String str3, C4181w5 c4181w5, List list, C9950h0 c9950h0, int i10, AbstractC1043k abstractC1043k) {
        this(str, c4202z5, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : c4202z52, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : c4181w5, (i10 & 64) != 0 ? null : list, (i10 & 128) != 0 ? null : c9950h0);
    }
}
