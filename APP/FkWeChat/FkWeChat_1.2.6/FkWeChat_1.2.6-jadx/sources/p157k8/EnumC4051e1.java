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
/* JADX INFO: renamed from: k8.e1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n
@Metadata(m16757d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m16758d2 = {"Lk8/e1;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "r", "s", "t", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class EnumC4051e1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: q */
    public static final InterfaceC4705l f11861q;

    /* JADX INFO: renamed from: r */
    public static final EnumC4051e1 f11862r = new EnumC4051e1("None", 0);

    /* JADX INFO: renamed from: s */
    public static final EnumC4051e1 f11863s = new EnumC4051e1("ThisServer", 1);

    /* JADX INFO: renamed from: t */
    public static final EnumC4051e1 f11864t = new EnumC4051e1("AllServers", 2);

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ EnumC4051e1[] f11865u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ InterfaceC7197a f11866v;

    static {
        EnumC4051e1[] enumC4051e1ArrM16085c = m16085c();
        f11865u = enumC4051e1ArrM16085c;
        f11866v = AbstractC7198b.m28437a(enumC4051e1ArrM16085c);
        INSTANCE = new Companion(null);
        f11861q = AbstractC4706m.m18788b(EnumC4708o.f13922r, new InterfaceC0173a() { // from class: k8.d1
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return EnumC4051e1.m16086g();
            }
        });
    }

    public EnumC4051e1(String str, int i10) {
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumC4051e1[] m16085c() {
        return new EnumC4051e1[]{f11862r, f11863s, f11864t};
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ InterfaceC8647b m16086g() {
        return AbstractC9712j0.m37931a("io.modelcontextprotocol.kotlin.sdk.types.IncludeContext", values(), new String[]{"none", "thisServer", "allServers"}, new Annotation[][]{null, null, null}, null);
    }

    public static EnumC4051e1 valueOf(String str) {
        return (EnumC4051e1) Enum.valueOf(EnumC4051e1.class, str);
    }

    public static EnumC4051e1[] values() {
        return (EnumC4051e1[]) f11865u.clone();
    }

    /* JADX INFO: renamed from: k8.e1$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC8647b m16088a() {
            return (InterfaceC8647b) EnumC4051e1.f11861q.getValue();
        }

        public final InterfaceC8647b serializer() {
            return m16088a();
        }

        public Companion() {
        }
    }
}
