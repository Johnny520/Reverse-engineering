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
/* JADX INFO: renamed from: k8.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n
@Metadata(m16757d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m16758d2 = {"Lk8/x;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "q", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "Companion", "a", "s", "t", "u", "v", "w", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class EnumC4182x {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: r */
    public static final InterfaceC4705l f12270r;

    /* JADX INFO: renamed from: s */
    public static final EnumC4182x f12271s = new EnumC4182x("TEXT", 0, "text");

    /* JADX INFO: renamed from: t */
    public static final EnumC4182x f12272t = new EnumC4182x("IMAGE", 1, "image");

    /* JADX INFO: renamed from: u */
    public static final EnumC4182x f12273u = new EnumC4182x("AUDIO", 2, "audio");

    /* JADX INFO: renamed from: v */
    public static final EnumC4182x f12274v = new EnumC4182x("RESOURCE_LINK", 3, "resource_link");

    /* JADX INFO: renamed from: w */
    public static final EnumC4182x f12275w = new EnumC4182x("EMBEDDED_RESOURCE", 4, "resource");

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC4182x[] f12276x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ InterfaceC7197a f12277y;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final String value;

    static {
        EnumC4182x[] enumC4182xArrM16566c = m16566c();
        f12276x = enumC4182xArrM16566c;
        f12277y = AbstractC7198b.m28437a(enumC4182xArrM16566c);
        INSTANCE = new Companion(null);
        f12270r = AbstractC4706m.m18788b(EnumC4708o.f13922r, new InterfaceC0173a() { // from class: k8.w
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return EnumC4182x.m16567g();
            }
        });
    }

    public EnumC4182x(String str, int i10, String str2) {
        this.value = str2;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumC4182x[] m16566c() {
        return new EnumC4182x[]{f12271s, f12272t, f12273u, f12274v, f12275w};
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ InterfaceC8647b m16567g() {
        return AbstractC9712j0.m37931a("io.modelcontextprotocol.kotlin.sdk.types.ContentTypes", values(), new String[]{"text", "image", "audio", "resource_link", "resource"}, new Annotation[][]{null, null, null, null, null}, null);
    }

    public static EnumC4182x valueOf(String str) {
        return (EnumC4182x) Enum.valueOf(EnumC4182x.class, str);
    }

    public static EnumC4182x[] values() {
        return (EnumC4182x[]) f12276x.clone();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: k8.x$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC8647b m16570a() {
            return (InterfaceC8647b) EnumC4182x.f12270r.getValue();
        }

        public final InterfaceC8647b serializer() {
            return m16570a();
        }

        public Companion() {
        }
    }
}
