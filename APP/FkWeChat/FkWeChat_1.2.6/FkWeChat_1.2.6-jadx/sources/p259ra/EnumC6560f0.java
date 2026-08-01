package p259ra;

import p024b9.AbstractC1043k;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;
import p299ub.AbstractC8611a0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ra.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC6560f0 {

    /* JADX INFO: renamed from: q */
    public static final EnumC6560f0 f20534q = new EnumC6560f0("PLAIN", 0) { // from class: ra.f0.b
        {
            AbstractC1043k abstractC1043k = null;
        }

        @Override // p259ra.EnumC6560f0
        /* JADX INFO: renamed from: c */
        public String mo25876c(String str) {
            str.getClass();
            return str;
        }
    };

    /* JADX INFO: renamed from: r */
    public static final EnumC6560f0 f20535r = new EnumC6560f0("HTML", 1) { // from class: ra.f0.a
        {
            AbstractC1043k abstractC1043k = null;
        }

        @Override // p259ra.EnumC6560f0
        /* JADX INFO: renamed from: c */
        public String mo25876c(String str) {
            str.getClass();
            return AbstractC8611a0.m33069N(AbstractC8611a0.m33069N(str, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    };

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC6560f0[] f20536s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f20537t;

    static {
        EnumC6560f0[] enumC6560f0ArrM25875a = m25875a();
        f20536s = enumC6560f0ArrM25875a;
        f20537t = AbstractC7198b.m28437a(enumC6560f0ArrM25875a);
    }

    public /* synthetic */ EnumC6560f0(String str, int i10, AbstractC1043k abstractC1043k) {
        this(str, i10);
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC6560f0[] m25875a() {
        return new EnumC6560f0[]{f20534q, f20535r};
    }

    public static EnumC6560f0 valueOf(String str) {
        return (EnumC6560f0) Enum.valueOf(EnumC6560f0.class, str);
    }

    public static EnumC6560f0[] values() {
        return (EnumC6560f0[]) f20536s.clone();
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo25876c(String str);

    public EnumC6560f0(String str, int i10) {
    }
}
