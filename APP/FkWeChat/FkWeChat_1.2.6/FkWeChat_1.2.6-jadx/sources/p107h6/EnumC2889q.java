package p107h6;

import p024b9.AbstractC1043k;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h6.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2889q {

    /* JADX INFO: renamed from: r */
    public static final a f7628r;

    /* JADX INFO: renamed from: s */
    public static final EnumC2889q f7629s = new EnumC2889q("PROTO_2", 0, "proto2");

    /* JADX INFO: renamed from: t */
    public static final EnumC2889q f7630t = new EnumC2889q("PROTO_3", 1, "proto3");

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ EnumC2889q[] f7631u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ InterfaceC7197a f7632v;

    /* JADX INFO: renamed from: q */
    public final String f7633q;

    static {
        EnumC2889q[] enumC2889qArrM10536a = m10536a();
        f7631u = enumC2889qArrM10536a;
        f7632v = AbstractC7198b.m28437a(enumC2889qArrM10536a);
        f7628r = new a(null);
    }

    public EnumC2889q(String str, int i10, String str2) {
        this.f7633q = str2;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC2889q[] m10536a() {
        return new EnumC2889q[]{f7629s, f7630t};
    }

    public static EnumC2889q valueOf(String str) {
        return (EnumC2889q) Enum.valueOf(EnumC2889q.class, str);
    }

    public static EnumC2889q[] values() {
        return (EnumC2889q[]) f7631u.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f7633q;
    }

    /* JADX INFO: renamed from: h6.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
