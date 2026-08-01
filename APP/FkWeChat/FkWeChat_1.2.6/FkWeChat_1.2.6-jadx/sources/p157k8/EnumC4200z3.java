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
/* JADX INFO: renamed from: k8.z3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n
@Metadata(m16757d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m16758d2 = {"Lk8/z3;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "q", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "Companion", "a", "s", "t", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class EnumC4200z3 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: r */
    public static final InterfaceC4705l f12321r;

    /* JADX INFO: renamed from: s */
    public static final EnumC4200z3 f12322s = new EnumC4200z3("Prompt", 0, "ref/prompt");

    /* JADX INFO: renamed from: t */
    public static final EnumC4200z3 f12323t = new EnumC4200z3("ResourceTemplate", 1, "ref/resource");

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ EnumC4200z3[] f12324u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ InterfaceC7197a f12325v;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final String value;

    static {
        EnumC4200z3[] enumC4200z3ArrM16622c = m16622c();
        f12324u = enumC4200z3ArrM16622c;
        f12325v = AbstractC7198b.m28437a(enumC4200z3ArrM16622c);
        INSTANCE = new Companion(null);
        f12321r = AbstractC4706m.m18788b(EnumC4708o.f13922r, new InterfaceC0173a() { // from class: k8.y3
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return EnumC4200z3.m16623g();
            }
        });
    }

    public EnumC4200z3(String str, int i10, String str2) {
        this.value = str2;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumC4200z3[] m16622c() {
        return new EnumC4200z3[]{f12322s, f12323t};
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ InterfaceC8647b m16623g() {
        return AbstractC9712j0.m37931a("io.modelcontextprotocol.kotlin.sdk.types.ReferenceType", values(), new String[]{"ref/prompt", "ref/resource"}, new Annotation[][]{null, null}, null);
    }

    public static EnumC4200z3 valueOf(String str) {
        return (EnumC4200z3) Enum.valueOf(EnumC4200z3.class, str);
    }

    public static EnumC4200z3[] values() {
        return (EnumC4200z3[]) f12324u.clone();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: k8.z3$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC8647b m16626a() {
            return (InterfaceC8647b) EnumC4200z3.f12321r.getValue();
        }

        public final InterfaceC8647b serializer() {
            return m16626a();
        }

        public Companion() {
        }
    }
}
