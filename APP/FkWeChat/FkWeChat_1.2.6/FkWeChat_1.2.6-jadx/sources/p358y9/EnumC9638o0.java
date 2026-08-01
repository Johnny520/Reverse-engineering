package p358y9;

import p024b9.AbstractC1043k;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: y9.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC9638o0 {

    /* JADX INFO: renamed from: r */
    public static final a f32826r;

    /* JADX INFO: renamed from: s */
    public static final EnumC9638o0 f32827s = new EnumC9638o0("IGNORE", 0, "ignore");

    /* JADX INFO: renamed from: t */
    public static final EnumC9638o0 f32828t = new EnumC9638o0("WARN", 1, "warn");

    /* JADX INFO: renamed from: u */
    public static final EnumC9638o0 f32829u = new EnumC9638o0("STRICT", 2, "strict");

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ EnumC9638o0[] f32830v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ InterfaceC7197a f32831w;

    /* JADX INFO: renamed from: q */
    public final String f32832q;

    static {
        EnumC9638o0[] enumC9638o0ArrM37698a = m37698a();
        f32830v = enumC9638o0ArrM37698a;
        f32831w = AbstractC7198b.m28437a(enumC9638o0ArrM37698a);
        f32826r = new a(null);
    }

    public EnumC9638o0(String str, int i10, String str2) {
        this.f32832q = str2;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC9638o0[] m37698a() {
        return new EnumC9638o0[]{f32827s, f32828t, f32829u};
    }

    public static EnumC9638o0 valueOf(String str) {
        return (EnumC9638o0) Enum.valueOf(EnumC9638o0.class, str);
    }

    public static EnumC9638o0[] values() {
        return (EnumC9638o0[]) f32830v.clone();
    }

    /* JADX INFO: renamed from: c */
    public final String m37699c() {
        return this.f32832q;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m37700g() {
        return this == f32827s;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m37701h() {
        return this == f32828t;
    }

    /* JADX INFO: renamed from: y9.o0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
