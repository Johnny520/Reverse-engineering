package p229p9;

import p024b9.AbstractC1043k;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p9.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC5996e0 {

    /* JADX INFO: renamed from: q */
    public static final a f18935q;

    /* JADX INFO: renamed from: r */
    public static final EnumC5996e0 f18936r = new EnumC5996e0("FINAL", 0);

    /* JADX INFO: renamed from: s */
    public static final EnumC5996e0 f18937s = new EnumC5996e0("SEALED", 1);

    /* JADX INFO: renamed from: t */
    public static final EnumC5996e0 f18938t = new EnumC5996e0("OPEN", 2);

    /* JADX INFO: renamed from: u */
    public static final EnumC5996e0 f18939u = new EnumC5996e0("ABSTRACT", 3);

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ EnumC5996e0[] f18940v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ InterfaceC7197a f18941w;

    static {
        EnumC5996e0[] enumC5996e0ArrM24000a = m24000a();
        f18940v = enumC5996e0ArrM24000a;
        f18941w = AbstractC7198b.m28437a(enumC5996e0ArrM24000a);
        f18935q = new a(null);
    }

    public EnumC5996e0(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC5996e0[] m24000a() {
        return new EnumC5996e0[]{f18936r, f18937s, f18938t, f18939u};
    }

    public static EnumC5996e0 valueOf(String str) {
        return (EnumC5996e0) Enum.valueOf(EnumC5996e0.class, str);
    }

    public static EnumC5996e0[] values() {
        return (EnumC5996e0[]) f18940v.clone();
    }

    /* JADX INFO: renamed from: p9.e0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC5996e0 m24001a(boolean z10, boolean z11, boolean z12) {
            return z10 ? EnumC5996e0.f18937s : z11 ? EnumC5996e0.f18939u : z12 ? EnumC5996e0.f18938t : EnumC5996e0.f18936r;
        }

        public a() {
        }
    }
}
