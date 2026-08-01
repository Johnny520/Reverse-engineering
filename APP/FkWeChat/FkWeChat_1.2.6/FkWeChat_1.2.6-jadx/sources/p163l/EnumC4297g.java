package p163l;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4297g {

    /* JADX INFO: renamed from: q */
    public static final EnumC4297g f12613q = new EnumC4297g("BoundReached", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC4297g f12614r = new EnumC4297g("Finished", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC4297g[] f12615s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f12616t;

    static {
        EnumC4297g[] enumC4297gArrM16925a = m16925a();
        f12615s = enumC4297gArrM16925a;
        f12616t = AbstractC7198b.m28437a(enumC4297gArrM16925a);
    }

    public EnumC4297g(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC4297g[] m16925a() {
        return new EnumC4297g[]{f12613q, f12614r};
    }

    public static EnumC4297g valueOf(String str) {
        return (EnumC4297g) Enum.valueOf(EnumC4297g.class, str);
    }

    public static EnumC4297g[] values() {
        return (EnumC4297g[]) f12615s.clone();
    }
}
