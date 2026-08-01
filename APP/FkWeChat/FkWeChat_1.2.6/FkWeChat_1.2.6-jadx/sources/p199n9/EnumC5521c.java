package p199n9;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p199n9.AbstractC5524f;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: n9.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC5521c {

    /* JADX INFO: renamed from: q */
    public static final a f17260q;

    /* JADX INFO: renamed from: r */
    public static final EnumC5521c f17261r = new EnumC5521c("Function", 0);

    /* JADX INFO: renamed from: s */
    public static final EnumC5521c f17262s = new EnumC5521c("SuspendFunction", 1);

    /* JADX INFO: renamed from: t */
    public static final EnumC5521c f17263t = new EnumC5521c("KFunction", 2);

    /* JADX INFO: renamed from: u */
    public static final EnumC5521c f17264u = new EnumC5521c("KSuspendFunction", 3);

    /* JADX INFO: renamed from: v */
    public static final EnumC5521c f17265v = new EnumC5521c("UNKNOWN", 4);

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC5521c[] f17266w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ InterfaceC7197a f17267x;

    static {
        EnumC5521c[] enumC5521cArrM22507a = m22507a();
        f17266w = enumC5521cArrM22507a;
        f17267x = AbstractC7198b.m28437a(enumC5521cArrM22507a);
        f17260q = new a(null);
    }

    public EnumC5521c(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC5521c[] m22507a() {
        return new EnumC5521c[]{f17261r, f17262s, f17263t, f17264u, f17265v};
    }

    public static EnumC5521c valueOf(String str) {
        return (EnumC5521c) Enum.valueOf(EnumC5521c.class, str);
    }

    public static EnumC5521c[] values() {
        return (EnumC5521c[]) f17266w.clone();
    }

    /* JADX INFO: renamed from: n9.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC5521c m22508a(AbstractC5524f abstractC5524f) {
            abstractC5524f.getClass();
            return AbstractC1061t.m3842c(abstractC5524f, AbstractC5524f.a.f17274f) ? EnumC5521c.f17261r : AbstractC1061t.m3842c(abstractC5524f, AbstractC5524f.d.f17277f) ? EnumC5521c.f17262s : AbstractC1061t.m3842c(abstractC5524f, AbstractC5524f.b.f17275f) ? EnumC5521c.f17263t : AbstractC1061t.m3842c(abstractC5524f, AbstractC5524f.c.f17276f) ? EnumC5521c.f17264u : EnumC5521c.f17265v;
        }

        public a() {
        }
    }
}
