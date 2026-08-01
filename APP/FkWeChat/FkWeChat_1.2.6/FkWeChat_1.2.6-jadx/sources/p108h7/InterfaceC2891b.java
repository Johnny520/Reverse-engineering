package p108h7;

import java.util.List;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX INFO: renamed from: h7.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2891b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: h7.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: q */
        public static final a f7634q = new a("NULL", 0);

        /* JADX INFO: renamed from: r */
        public static final a f7635r = new a("SINGLE", 1);

        /* JADX INFO: renamed from: s */
        public static final a f7636s = new a("LIST", 2);

        /* JADX INFO: renamed from: t */
        public static final a f7637t = new a("OBJECT", 3);

        /* JADX INFO: renamed from: u */
        public static final /* synthetic */ a[] f7638u;

        /* JADX INFO: renamed from: v */
        public static final /* synthetic */ InterfaceC7197a f7639v;

        static {
            a[] aVarArrM10539a = m10539a();
            f7638u = aVarArrM10539a;
            f7639v = AbstractC7198b.m28437a(aVarArrM10539a);
        }

        public a(String str, int i10) {
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a[] m10539a() {
            return new a[]{f7634q, f7635r, f7636s, f7637t};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f7638u.clone();
        }
    }

    /* JADX INFO: renamed from: b */
    List mo10538b();

    String getString();
}
