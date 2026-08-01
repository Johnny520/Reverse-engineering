package p098g9;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX INFO: renamed from: g9.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2556j {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: g9.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: q */
        public static final a f6812q = new a("INSTANCE", 0);

        /* JADX INFO: renamed from: r */
        public static final a f6813r = new a("CONTEXT", 1);

        /* JADX INFO: renamed from: s */
        public static final a f6814s = new a("EXTENSION_RECEIVER", 2);

        /* JADX INFO: renamed from: t */
        public static final a f6815t = new a("VALUE", 3);

        /* JADX INFO: renamed from: u */
        public static final /* synthetic */ a[] f6816u;

        /* JADX INFO: renamed from: v */
        public static final /* synthetic */ InterfaceC7197a f6817v;

        static {
            a[] aVarArrM9079a = m9079a();
            f6816u = aVarArrM9079a;
            f6817v = AbstractC7198b.m28437a(aVarArrM9079a);
        }

        public a(String str, int i10) {
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a[] m9079a() {
            return new a[]{f6812q, f6813r, f6814s, f6815t};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f6816u.clone();
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo9076a();

    int getIndex();

    String getName();

    InterfaceC2560n getType();

    /* JADX INFO: renamed from: j */
    a mo9077j();

    /* JADX INFO: renamed from: k */
    boolean mo9078k();
}
