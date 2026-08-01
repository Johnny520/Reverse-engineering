package p342x9;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x9.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC9470d implements InterfaceC9468b {

    /* JADX INFO: renamed from: N */
    public static final /* synthetic */ EnumC9470d[] f32171N;

    /* JADX INFO: renamed from: O */
    public static final /* synthetic */ InterfaceC7197a f32172O;

    /* JADX INFO: renamed from: q */
    public static final EnumC9470d f32173q = new EnumC9470d("FROM_IDE", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC9470d f32174r = new EnumC9470d("FROM_BACKEND", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC9470d f32175s = new EnumC9470d("FROM_TEST", 2);

    /* JADX INFO: renamed from: t */
    public static final EnumC9470d f32176t = new EnumC9470d("FROM_BUILTINS", 3);

    /* JADX INFO: renamed from: u */
    public static final EnumC9470d f32177u = new EnumC9470d("WHEN_CHECK_DECLARATION_CONFLICTS", 4);

    /* JADX INFO: renamed from: v */
    public static final EnumC9470d f32178v = new EnumC9470d("WHEN_CHECK_OVERRIDES", 5);

    /* JADX INFO: renamed from: w */
    public static final EnumC9470d f32179w = new EnumC9470d("FOR_SCRIPT", 6);

    /* JADX INFO: renamed from: x */
    public static final EnumC9470d f32180x = new EnumC9470d("FROM_REFLECTION", 7);

    /* JADX INFO: renamed from: y */
    public static final EnumC9470d f32181y = new EnumC9470d("WHEN_RESOLVE_DECLARATION", 8);

    /* JADX INFO: renamed from: z */
    public static final EnumC9470d f32182z = new EnumC9470d("WHEN_GET_DECLARATION_SCOPE", 9);

    /* JADX INFO: renamed from: A */
    public static final EnumC9470d f32158A = new EnumC9470d("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);

    /* JADX INFO: renamed from: B */
    public static final EnumC9470d f32159B = new EnumC9470d("FOR_ALREADY_TRACKED", 11);

    /* JADX INFO: renamed from: C */
    public static final EnumC9470d f32160C = new EnumC9470d("WHEN_GET_ALL_DESCRIPTORS", 12);

    /* JADX INFO: renamed from: D */
    public static final EnumC9470d f32161D = new EnumC9470d("WHEN_TYPING", 13);

    /* JADX INFO: renamed from: E */
    public static final EnumC9470d f32162E = new EnumC9470d("WHEN_GET_SUPER_MEMBERS", 14);

    /* JADX INFO: renamed from: F */
    public static final EnumC9470d f32163F = new EnumC9470d("FOR_NON_TRACKED_SCOPE", 15);

    /* JADX INFO: renamed from: G */
    public static final EnumC9470d f32164G = new EnumC9470d("FROM_SYNTHETIC_SCOPE", 16);

    /* JADX INFO: renamed from: H */
    public static final EnumC9470d f32165H = new EnumC9470d("FROM_DESERIALIZATION", 17);

    /* JADX INFO: renamed from: I */
    public static final EnumC9470d f32166I = new EnumC9470d("FROM_JAVA_LOADER", 18);

    /* JADX INFO: renamed from: J */
    public static final EnumC9470d f32167J = new EnumC9470d("WHEN_GET_LOCAL_VARIABLE", 19);

    /* JADX INFO: renamed from: K */
    public static final EnumC9470d f32168K = new EnumC9470d("WHEN_FIND_BY_FQNAME", 20);

    /* JADX INFO: renamed from: L */
    public static final EnumC9470d f32169L = new EnumC9470d("WHEN_GET_COMPANION_OBJECT", 21);

    /* JADX INFO: renamed from: M */
    public static final EnumC9470d f32170M = new EnumC9470d("FOR_DEFAULT_IMPORTS", 22);

    static {
        EnumC9470d[] enumC9470dArrM36885c = m36885c();
        f32171N = enumC9470dArrM36885c;
        f32172O = AbstractC7198b.m28437a(enumC9470dArrM36885c);
    }

    public EnumC9470d(String str, int i10) {
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumC9470d[] m36885c() {
        return new EnumC9470d[]{f32173q, f32174r, f32175s, f32176t, f32177u, f32178v, f32179w, f32180x, f32181y, f32182z, f32158A, f32159B, f32160C, f32161D, f32162E, f32163F, f32164G, f32165H, f32166I, f32167J, f32168K, f32169L, f32170M};
    }

    public static EnumC9470d valueOf(String str) {
        return (EnumC9470d) Enum.valueOf(EnumC9470d.class, str);
    }

    public static EnumC9470d[] values() {
        return (EnumC9470d[]) f32171N.clone();
    }

    @Override // p342x9.InterfaceC9468b
    /* JADX INFO: renamed from: a */
    public InterfaceC9467a mo36884a() {
        return null;
    }
}
