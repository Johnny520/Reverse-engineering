package p157k8;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;
import p300uc.InterfaceC8647b;
import p300uc.InterfaceC8660n;
import p361yc.AbstractC9712j0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: k8.l2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n
@Metadata(m16757d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m16758d2 = {"Lk8/l2;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "r", "s", "t", "u", "v", "w", "x", "y", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class EnumC4101l2 {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ InterfaceC7197a f12022A;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: q */
    public static final InterfaceC4705l f12023q;

    /* JADX INFO: renamed from: r */
    public static final EnumC4101l2 f12024r = new EnumC4101l2("Debug", 0);

    /* JADX INFO: renamed from: s */
    public static final EnumC4101l2 f12025s = new EnumC4101l2("Info", 1);

    /* JADX INFO: renamed from: t */
    public static final EnumC4101l2 f12026t = new EnumC4101l2("Notice", 2);

    /* JADX INFO: renamed from: u */
    public static final EnumC4101l2 f12027u = new EnumC4101l2("Warning", 3);

    /* JADX INFO: renamed from: v */
    public static final EnumC4101l2 f12028v = new EnumC4101l2("Error", 4);

    /* JADX INFO: renamed from: w */
    public static final EnumC4101l2 f12029w = new EnumC4101l2("Critical", 5);

    /* JADX INFO: renamed from: x */
    public static final EnumC4101l2 f12030x = new EnumC4101l2("Alert", 6);

    /* JADX INFO: renamed from: y */
    public static final EnumC4101l2 f12031y = new EnumC4101l2("Emergency", 7);

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC4101l2[] f12032z;

    static {
        EnumC4101l2[] enumC4101l2ArrM16298c = m16298c();
        f12032z = enumC4101l2ArrM16298c;
        f12022A = AbstractC7198b.m28437a(enumC4101l2ArrM16298c);
        INSTANCE = new Companion(null);
        f12023q = AbstractC4706m.m18788b(EnumC4708o.f13922r, new InterfaceC0173a() { // from class: k8.k2
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return EnumC4101l2.m16299g();
            }
        });
    }

    public EnumC4101l2(String str, int i10) {
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumC4101l2[] m16298c() {
        return new EnumC4101l2[]{f12024r, f12025s, f12026t, f12027u, f12028v, f12029w, f12030x, f12031y};
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ InterfaceC8647b m16299g() {
        return AbstractC9712j0.m37931a("io.modelcontextprotocol.kotlin.sdk.types.LoggingLevel", values(), new String[]{"debug", "info", "notice", "warning", "error", "critical", "alert", "emergency"}, new Annotation[][]{null, null, null, null, null, null, null, null}, null);
    }

    public static EnumC4101l2 valueOf(String str) {
        return (EnumC4101l2) Enum.valueOf(EnumC4101l2.class, str);
    }

    public static EnumC4101l2[] values() {
        return (EnumC4101l2[]) f12032z.clone();
    }

    /* JADX INFO: renamed from: k8.l2$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC8647b m16301a() {
            return (InterfaceC8647b) EnumC4101l2.f12023q.getValue();
        }

        public final InterfaceC8647b serializer() {
            return m16301a();
        }

        public Companion() {
        }
    }
}
