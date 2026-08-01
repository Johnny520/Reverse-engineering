package p259ra;

import java.util.ArrayList;
import java.util.Set;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5106t;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ra.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC6577v {

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ EnumC6577v[] f20579I;

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ InterfaceC7197a f20580J;

    /* JADX INFO: renamed from: r */
    public static final a f20581r;

    /* JADX INFO: renamed from: s */
    public static final Set f20582s;

    /* JADX INFO: renamed from: t */
    public static final Set f20583t;

    /* JADX INFO: renamed from: q */
    public final boolean f20590q;

    /* JADX INFO: renamed from: u */
    public static final EnumC6577v f20584u = new EnumC6577v("VISIBILITY", 0, true);

    /* JADX INFO: renamed from: v */
    public static final EnumC6577v f20585v = new EnumC6577v("MODALITY", 1, true);

    /* JADX INFO: renamed from: w */
    public static final EnumC6577v f20586w = new EnumC6577v("OVERRIDE", 2, true);

    /* JADX INFO: renamed from: x */
    public static final EnumC6577v f20587x = new EnumC6577v("ANNOTATIONS", 3, false);

    /* JADX INFO: renamed from: y */
    public static final EnumC6577v f20588y = new EnumC6577v("INNER", 4, true);

    /* JADX INFO: renamed from: z */
    public static final EnumC6577v f20589z = new EnumC6577v("MEMBER_KIND", 5, true);

    /* JADX INFO: renamed from: A */
    public static final EnumC6577v f20571A = new EnumC6577v("DATA", 6, true);

    /* JADX INFO: renamed from: B */
    public static final EnumC6577v f20572B = new EnumC6577v("INLINE", 7, true);

    /* JADX INFO: renamed from: C */
    public static final EnumC6577v f20573C = new EnumC6577v("EXPECT", 8, true);

    /* JADX INFO: renamed from: D */
    public static final EnumC6577v f20574D = new EnumC6577v("ACTUAL", 9, true);

    /* JADX INFO: renamed from: E */
    public static final EnumC6577v f20575E = new EnumC6577v("CONST", 10, true);

    /* JADX INFO: renamed from: F */
    public static final EnumC6577v f20576F = new EnumC6577v("LATEINIT", 11, true);

    /* JADX INFO: renamed from: G */
    public static final EnumC6577v f20577G = new EnumC6577v("FUN", 12, true);

    /* JADX INFO: renamed from: H */
    public static final EnumC6577v f20578H = new EnumC6577v("VALUE", 13, true);

    static {
        EnumC6577v[] enumC6577vArrM26093a = m26093a();
        f20579I = enumC6577vArrM26093a;
        f20580J = AbstractC7198b.m28437a(enumC6577vArrM26093a);
        f20581r = new a(null);
        EnumC6577v[] enumC6577vArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC6577v enumC6577v : enumC6577vArrValues) {
            if (enumC6577v.f20590q) {
                arrayList.add(enumC6577v);
            }
        }
        f20582s = AbstractC5081g0.m20564c1(arrayList);
        f20583t = AbstractC5106t.m20737h1(values());
    }

    public EnumC6577v(String str, int i10, boolean z10) {
        this.f20590q = z10;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC6577v[] m26093a() {
        return new EnumC6577v[]{f20584u, f20585v, f20586w, f20587x, f20588y, f20589z, f20571A, f20572B, f20573C, f20574D, f20575E, f20576F, f20577G, f20578H};
    }

    public static EnumC6577v valueOf(String str) {
        return (EnumC6577v) Enum.valueOf(EnumC6577v.class, str);
    }

    public static EnumC6577v[] values() {
        return (EnumC6577v[]) f20579I.clone();
    }

    /* JADX INFO: renamed from: ra.v$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
