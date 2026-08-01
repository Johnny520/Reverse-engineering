package p107h6;

import p024b9.AbstractC1043k;
import p215oc.C5729x;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h6.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2875c {

    /* JADX INFO: renamed from: r */
    public static final a f7535r;

    /* JADX INFO: renamed from: s */
    public static final EnumC2875c f7536s = new EnumC2875c("VARINT", 0, 0);

    /* JADX INFO: renamed from: t */
    public static final EnumC2875c f7537t = new EnumC2875c("FIXED64", 1, 1);

    /* JADX INFO: renamed from: u */
    public static final EnumC2875c f7538u = new EnumC2875c("LENGTH_DELIMITED", 2, 2);

    /* JADX INFO: renamed from: v */
    public static final EnumC2875c f7539v = new EnumC2875c("FIXED32", 3, 5);

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC2875c[] f7540w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ InterfaceC7197a f7541x;

    /* JADX INFO: renamed from: q */
    public final int f7542q;

    /* JADX INFO: renamed from: h6.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7543a;

        static {
            int[] iArr = new int[EnumC2875c.values().length];
            try {
                iArr[EnumC2875c.f7536s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2875c.f7539v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2875c.f7537t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2875c.f7538u.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7543a = iArr;
        }
    }

    static {
        EnumC2875c[] enumC2875cArrM10332a = m10332a();
        f7540w = enumC2875cArrM10332a;
        f7541x = AbstractC7198b.m28437a(enumC2875cArrM10332a);
        f7535r = new a(null);
    }

    public EnumC2875c(String str, int i10, int i11) {
        this.f7542q = i11;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC2875c[] m10332a() {
        return new EnumC2875c[]{f7536s, f7537t, f7538u, f7539v};
    }

    public static EnumC2875c valueOf(String str) {
        return (EnumC2875c) Enum.valueOf(EnumC2875c.class, str);
    }

    public static EnumC2875c[] values() {
        return (EnumC2875c[]) f7540w.clone();
    }

    /* JADX INFO: renamed from: c */
    public final int m10333c() {
        return this.f7542q;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC2882j m10334g() {
        int i10 = b.f7543a[ordinal()];
        if (i10 == 1) {
            return AbstractC2882j.f7591w;
        }
        if (i10 == 2) {
            return AbstractC2882j.f7585q;
        }
        if (i10 == 3) {
            return AbstractC2882j.f7551A;
        }
        if (i10 == 4) {
            return AbstractC2882j.f7559I;
        }
        C5729x.m23182a();
        return null;
    }

    /* JADX INFO: renamed from: h6.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
