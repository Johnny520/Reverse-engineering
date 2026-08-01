package ec;

import p010a9.InterfaceC0188p;
import p161kc.AbstractC4243a;
import p161kc.AbstractC4244b;
import p215oc.C5729x;
import p228p8.AbstractC5978h;
import p228p8.InterfaceC5976f;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ec.q0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2173q0 {

    /* JADX INFO: renamed from: q */
    public static final EnumC2173q0 f5998q = new EnumC2173q0("DEFAULT", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC2173q0 f5999r = new EnumC2173q0("LAZY", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC2173q0 f6000s = new EnumC2173q0("ATOMIC", 2);

    /* JADX INFO: renamed from: t */
    public static final EnumC2173q0 f6001t = new EnumC2173q0("UNDISPATCHED", 3);

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ EnumC2173q0[] f6002u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ InterfaceC7197a f6003v;

    /* JADX INFO: renamed from: ec.q0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6004a;

        static {
            int[] iArr = new int[EnumC2173q0.values().length];
            try {
                iArr[EnumC2173q0.f5998q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2173q0.f6000s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2173q0.f6001t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2173q0.f5999r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6004a = iArr;
        }
    }

    static {
        EnumC2173q0[] enumC2173q0ArrM7890a = m7890a();
        f6002u = enumC2173q0ArrM7890a;
        f6003v = AbstractC7198b.m28437a(enumC2173q0ArrM7890a);
    }

    public EnumC2173q0(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC2173q0[] m7890a() {
        return new EnumC2173q0[]{f5998q, f5999r, f6000s, f6001t};
    }

    public static EnumC2173q0 valueOf(String str) {
        return (EnumC2173q0) Enum.valueOf(EnumC2173q0.class, str);
    }

    public static EnumC2173q0[] values() {
        return (EnumC2173q0[]) f6002u.clone();
    }

    /* JADX INFO: renamed from: c */
    public final void m7891c(InterfaceC0188p interfaceC0188p, Object obj, InterfaceC5976f interfaceC5976f) {
        int i10 = a.f6004a[ordinal()];
        if (i10 == 1) {
            AbstractC4243a.m16722c(interfaceC0188p, obj, interfaceC5976f);
            return;
        }
        if (i10 == 2) {
            AbstractC5978h.m23982b(interfaceC0188p, obj, interfaceC5976f);
        } else if (i10 == 3) {
            AbstractC4244b.m16726c(interfaceC0188p, obj, interfaceC5976f);
        } else {
            if (i10 == 4) {
                return;
            }
            C5729x.m23182a();
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m7892g() {
        return this == f5999r;
    }
}
