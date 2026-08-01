package p235q1;

import p215oc.C5729x;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: q1.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6200e0 implements InterfaceC6198d0 {

    /* JADX INFO: renamed from: q */
    public static final EnumC6200e0 f19245q = new EnumC6200e0("Active", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC6200e0 f19246r = new EnumC6200e0("ActiveParent", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC6200e0 f19247s = new EnumC6200e0("Captured", 2);

    /* JADX INFO: renamed from: t */
    public static final EnumC6200e0 f19248t = new EnumC6200e0("Inactive", 3);

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ EnumC6200e0[] f19249u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ InterfaceC7197a f19250v;

    /* JADX INFO: renamed from: q1.e0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19251a;

        static {
            int[] iArr = new int[EnumC6200e0.values().length];
            try {
                iArr[EnumC6200e0.f19247s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6200e0.f19245q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6200e0.f19246r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6200e0.f19248t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f19251a = iArr;
        }
    }

    static {
        EnumC6200e0[] enumC6200e0ArrM24358g = m24358g();
        f19249u = enumC6200e0ArrM24358g;
        f19250v = AbstractC7198b.m28437a(enumC6200e0ArrM24358g);
    }

    public EnumC6200e0(String str, int i10) {
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC6200e0[] m24358g() {
        return new EnumC6200e0[]{f19245q, f19246r, f19247s, f19248t};
    }

    public static EnumC6200e0 valueOf(String str) {
        return (EnumC6200e0) Enum.valueOf(EnumC6200e0.class, str);
    }

    public static EnumC6200e0[] values() {
        return (EnumC6200e0[]) f19249u.clone();
    }

    @Override // p235q1.InterfaceC6198d0
    /* JADX INFO: renamed from: a */
    public boolean mo24355a() {
        int i10 = a.f19251a[ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        C5729x.m23182a();
        return false;
    }

    @Override // p235q1.InterfaceC6198d0
    /* JADX INFO: renamed from: c */
    public boolean mo24356c() {
        int i10 = a.f19251a[ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        C5729x.m23182a();
        return false;
    }
}
