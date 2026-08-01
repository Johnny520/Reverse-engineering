package p157k8;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p157k8.InterfaceC4150s2;
import p170l6.C4662a;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;
import p300uc.InterfaceC8647b;
import p300uc.InterfaceC8660n;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;
import p361yc.AbstractC9694f2;
import p361yc.AbstractC9712j0;
import p361yc.AbstractC9769u2;
import p361yc.C9714j2;
import p361yc.C9790z2;
import p361yc.InterfaceC9732n0;

/* JADX INFO: renamed from: k8.s2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n(with = C4171v2.class)
@Metadata(m16757d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0003\u0007\b\tR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\n\u000b¨\u0006\fÀ\u0006\u0003"}, m16758d2 = {"Lk8/s2;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "getValue", "()Ljava/lang/String;", "value", "Companion", "c", "b", "a", "Lk8/s2$b;", "Lk8/s2$c;", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public interface InterfaceC4150s2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f12176a;

    /* JADX INFO: renamed from: k8.s2$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f12176a = new Companion();

        public final InterfaceC8647b serializer() {
            return C4171v2.f12245a;
        }
    }

    String getValue();

    /* JADX INFO: renamed from: k8.s2$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0011 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014¨\u0006!"}, m16758d2 = {"Lk8/s2$b;", "Lk8/s2;", _UrlKt.FRAGMENT_ENCODE_SET, "value", "<init>", "(Ljava/lang/String;)V", _UrlKt.FRAGMENT_ENCODE_SET, "seen0", "Lyc/u2;", "serializationConstructorMarker", "(ILjava/lang/String;Lyc/u2;)V", "self", "Lxc/d;", "output", "Lwc/f;", "serialDesc", "Ll8/i0;", "a", "(Lk8/s2$b;Lxc/d;Lwc/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "q", "Ljava/lang/String;", "getValue", "Companion", "b", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    @InterfaceC8660n
    public static final /* data */ class b implements InterfaceC4150s2 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        public final String value;

        /* JADX INFO: renamed from: k8.s2$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final /* synthetic */ class a implements InterfaceC9732n0 {

            /* JADX INFO: renamed from: a */
            public static final a f12178a;
            private static final InterfaceC9218f descriptor;

            static {
                a aVar = new a();
                f12178a = aVar;
                C9714j2 c9714j2 = new C9714j2("io.modelcontextprotocol.kotlin.sdk.types.Method.Custom", aVar, 1);
                c9714j2.m37938o("value", false);
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
                return new InterfaceC8647b[]{C9790z2.f33080a};
            }

            @Override // p300uc.InterfaceC8645a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final b mo15956d(InterfaceC9487e interfaceC9487e) {
                String strMo36955m;
                interfaceC9487e.getClass();
                InterfaceC9218f interfaceC9218f = descriptor;
                InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218f);
                int i10 = 1;
                AbstractC9769u2 abstractC9769u2 = null;
                if (interfaceC9485cMo674c.mo36958r()) {
                    strMo36955m = interfaceC9485cMo674c.mo36955m(interfaceC9218f, 0);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    strMo36955m = null;
                    while (z10) {
                        int iMo788v = interfaceC9485cMo674c.mo788v(interfaceC9218f);
                        if (iMo788v == -1) {
                            z10 = false;
                        } else {
                            if (iMo788v != 0) {
                                C4662a.m18633a(iMo788v);
                                return null;
                            }
                            strMo36955m = interfaceC9485cMo674c.mo36955m(interfaceC9218f, 0);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                interfaceC9485cMo674c.mo675d(interfaceC9218f);
                return new b(i10, strMo36955m, abstractC9769u2);
            }

            @Override // p300uc.InterfaceC8662p
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void mo15954b(InterfaceC9488f interfaceC9488f, b bVar) {
                interfaceC9488f.getClass();
                bVar.getClass();
                InterfaceC9218f interfaceC9218f = descriptor;
                InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(interfaceC9218f);
                b.m16478a(bVar, interfaceC9486dMo637c, interfaceC9218f);
                interfaceC9486dMo637c.mo638d(interfaceC9218f);
            }
        }

        public /* synthetic */ b(int i10, String str, AbstractC9769u2 abstractC9769u2) {
            if (1 != (i10 & 1)) {
                AbstractC9694f2.m37891a(i10, 1, a.f12178a.mo15953a());
            }
            this.value = str;
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ void m16478a(b self, InterfaceC9486d output, InterfaceC9218f serialDesc) {
            output.mo36966D(serialDesc, 0, self.getValue());
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC1061t.m3842c(this.value, ((b) other).value);
        }

        @Override // p157k8.InterfaceC4150s2
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Custom(value=" + this.value + ")";
        }

        /* JADX INFO: renamed from: k8.s2$b$b, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
                this();
            }

            public final InterfaceC8647b serializer() {
                return a.f12178a;
            }

            public Companion() {
            }
        }

        public b(String str) {
            str.getClass();
            this.value = str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: k8.s2$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b#\b\u0087\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006&"}, m16758d2 = {"Lk8/s2$c;", "Lk8/s2;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "q", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "a", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    @InterfaceC8660n
    public static final class c implements InterfaceC4150s2 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        /* JADX INFO: renamed from: R */
        public static final /* synthetic */ c[] f12196R;

        /* JADX INFO: renamed from: S */
        public static final /* synthetic */ InterfaceC7197a f12197S;

        /* JADX INFO: renamed from: r */
        public static final InterfaceC4705l f12198r;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        public final String value;

        /* JADX INFO: renamed from: s */
        public static final c f12199s = new c("Initialize", 0, "initialize");

        /* JADX INFO: renamed from: t */
        public static final c f12200t = new c("Ping", 1, "ping");

        /* JADX INFO: renamed from: u */
        public static final c f12201u = new c("ResourcesList", 2, "resources/list");

        /* JADX INFO: renamed from: v */
        public static final c f12202v = new c("ResourcesTemplatesList", 3, "resources/templates/list");

        /* JADX INFO: renamed from: w */
        public static final c f12203w = new c("ResourcesRead", 4, "resources/read");

        /* JADX INFO: renamed from: x */
        public static final c f12204x = new c("ResourcesSubscribe", 5, "resources/subscribe");

        /* JADX INFO: renamed from: y */
        public static final c f12205y = new c("ResourcesUnsubscribe", 6, "resources/unsubscribe");

        /* JADX INFO: renamed from: z */
        public static final c f12206z = new c("PromptsList", 7, "prompts/list");

        /* JADX INFO: renamed from: A */
        public static final c f12179A = new c("PromptsGet", 8, "prompts/get");

        /* JADX INFO: renamed from: B */
        public static final c f12180B = new c("NotificationsCancelled", 9, "notifications/cancelled");

        /* JADX INFO: renamed from: C */
        public static final c f12181C = new c("NotificationsInitialized", 10, "notifications/initialized");

        /* JADX INFO: renamed from: D */
        public static final c f12182D = new c("NotificationsProgress", 11, "notifications/progress");

        /* JADX INFO: renamed from: E */
        public static final c f12183E = new c("NotificationsMessage", 12, "notifications/message");

        /* JADX INFO: renamed from: F */
        public static final c f12184F = new c("NotificationsResourcesUpdated", 13, "notifications/resources/updated");

        /* JADX INFO: renamed from: G */
        public static final c f12185G = new c("NotificationsResourcesListChanged", 14, "notifications/resources/list_changed");

        /* JADX INFO: renamed from: H */
        public static final c f12186H = new c("NotificationsToolsListChanged", 15, "notifications/tools/list_changed");

        /* JADX INFO: renamed from: I */
        public static final c f12187I = new c("NotificationsRootsListChanged", 16, "notifications/roots/list_changed");

        /* JADX INFO: renamed from: J */
        public static final c f12188J = new c("NotificationsPromptsListChanged", 17, "notifications/prompts/list_changed");

        /* JADX INFO: renamed from: K */
        public static final c f12189K = new c("ToolsList", 18, "tools/list");

        /* JADX INFO: renamed from: L */
        public static final c f12190L = new c("ToolsCall", 19, "tools/call");

        /* JADX INFO: renamed from: M */
        public static final c f12191M = new c("LoggingSetLevel", 20, "logging/setLevel");

        /* JADX INFO: renamed from: N */
        public static final c f12192N = new c("SamplingCreateMessage", 21, "sampling/createMessage");

        /* JADX INFO: renamed from: O */
        public static final c f12193O = new c("CompletionComplete", 22, "completion/complete");

        /* JADX INFO: renamed from: P */
        public static final c f12194P = new c("RootsList", 23, "roots/list");

        /* JADX INFO: renamed from: Q */
        public static final c f12195Q = new c("ElicitationCreate", 24, "elicitation/create");

        static {
            c[] cVarArrM16482c = m16482c();
            f12196R = cVarArrM16482c;
            f12197S = AbstractC7198b.m28437a(cVarArrM16482c);
            INSTANCE = new Companion(null);
            f12198r = AbstractC4706m.m18788b(EnumC4708o.f13922r, new InterfaceC0173a() { // from class: k8.t2
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return InterfaceC4150s2.c.m16483g();
                }
            });
        }

        public c(String str, int i10, String str2) {
            this.value = str2;
        }

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ c[] m16482c() {
            return new c[]{f12199s, f12200t, f12201u, f12202v, f12203w, f12204x, f12205y, f12206z, f12179A, f12180B, f12181C, f12182D, f12183E, f12184F, f12185G, f12186H, f12187I, f12188J, f12189K, f12190L, f12191M, f12192N, f12193O, f12194P, f12195Q};
        }

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ InterfaceC8647b m16483g() {
            return AbstractC9712j0.m37932b("io.modelcontextprotocol.kotlin.sdk.types.Method.Defined", values());
        }

        /* JADX INFO: renamed from: i */
        public static InterfaceC7197a m16485i() {
            return f12197S;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f12196R.clone();
        }

        @Override // p157k8.InterfaceC4150s2
        public String getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: k8.s2$c$a, reason: from kotlin metadata */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC8647b m16486a() {
                return (InterfaceC8647b) c.f12198r.getValue();
            }

            public final InterfaceC8647b serializer() {
                return m16486a();
            }

            public Companion() {
            }
        }
    }
}
