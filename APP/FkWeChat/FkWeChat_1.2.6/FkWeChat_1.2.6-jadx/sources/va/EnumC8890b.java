package va;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: va.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC8890b {

    /* JADX INFO: renamed from: q */
    public static final EnumC8890b f29469q = new EnumC8890b("WARNING", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC8890b f29470r = new EnumC8890b("ERROR", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC8890b f29471s = new EnumC8890b("HIDDEN", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC8890b[] f29472t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f29473u;

    static {
        EnumC8890b[] enumC8890bArrM34076a = m34076a();
        f29472t = enumC8890bArrM34076a;
        f29473u = AbstractC7198b.m28437a(enumC8890bArrM34076a);
    }

    public EnumC8890b(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC8890b[] m34076a() {
        return new EnumC8890b[]{f29469q, f29470r, f29471s};
    }

    public static EnumC8890b valueOf(String str) {
        return (EnumC8890b) Enum.valueOf(EnumC8890b.class, str);
    }

    public static EnumC8890b[] values() {
        return (EnumC8890b[]) f29472t.clone();
    }
}
