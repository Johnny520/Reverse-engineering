package p170l6;

import java.util.Iterator;
import p024b9.AbstractC1043k;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;
import p299ub.AbstractC8611a0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l6.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4677p {

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ EnumC4677p[] f13860J;

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ InterfaceC7197a f13861K;

    /* JADX INFO: renamed from: q */
    public static final a f13862q;

    /* JADX INFO: renamed from: r */
    public static final EnumC4677p f13863r = new EnumC4677p("DEFAULT", 0);

    /* JADX INFO: renamed from: s */
    public static final EnumC4677p f13864s = new EnumC4677p("C", 1);

    /* JADX INFO: renamed from: t */
    public static final EnumC4677p f13865t = new EnumC4677p("CPP", 2);

    /* JADX INFO: renamed from: u */
    public static final EnumC4677p f13866u = new EnumC4677p("DART", 3);

    /* JADX INFO: renamed from: v */
    public static final EnumC4677p f13867v = new EnumC4677p("JAVA", 4);

    /* JADX INFO: renamed from: w */
    public static final EnumC4677p f13868w = new EnumC4677p("KOTLIN", 5);

    /* JADX INFO: renamed from: x */
    public static final EnumC4677p f13869x = new EnumC4677p("RUST", 6);

    /* JADX INFO: renamed from: y */
    public static final EnumC4677p f13870y = new EnumC4677p("CSHARP", 7);

    /* JADX INFO: renamed from: z */
    public static final EnumC4677p f13871z = new EnumC4677p("COFFEESCRIPT", 8);

    /* JADX INFO: renamed from: A */
    public static final EnumC4677p f13851A = new EnumC4677p("JAVASCRIPT", 9);

    /* JADX INFO: renamed from: B */
    public static final EnumC4677p f13852B = new EnumC4677p("PERL", 10);

    /* JADX INFO: renamed from: C */
    public static final EnumC4677p f13853C = new EnumC4677p("PYTHON", 11);

    /* JADX INFO: renamed from: D */
    public static final EnumC4677p f13854D = new EnumC4677p("RUBY", 12);

    /* JADX INFO: renamed from: E */
    public static final EnumC4677p f13855E = new EnumC4677p("SHELL", 13);

    /* JADX INFO: renamed from: F */
    public static final EnumC4677p f13856F = new EnumC4677p("SWIFT", 14);

    /* JADX INFO: renamed from: G */
    public static final EnumC4677p f13857G = new EnumC4677p("TYPESCRIPT", 15);

    /* JADX INFO: renamed from: H */
    public static final EnumC4677p f13858H = new EnumC4677p("GO", 16);

    /* JADX INFO: renamed from: I */
    public static final EnumC4677p f13859I = new EnumC4677p("PHP", 17);

    static {
        EnumC4677p[] enumC4677pArrM18684a = m18684a();
        f13860J = enumC4677pArrM18684a;
        f13861K = AbstractC7198b.m28437a(enumC4677pArrM18684a);
        f13862q = new a(null);
    }

    public EnumC4677p(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC4677p[] m18684a() {
        return new EnumC4677p[]{f13863r, f13864s, f13865t, f13866u, f13867v, f13868w, f13869x, f13870y, f13871z, f13851A, f13852B, f13853C, f13854D, f13855E, f13856F, f13857G, f13858H, f13859I};
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC7197a m18685c() {
        return f13861K;
    }

    public static EnumC4677p valueOf(String str) {
        return (EnumC4677p) Enum.valueOf(EnumC4677p.class, str);
    }

    public static EnumC4677p[] values() {
        return (EnumC4677p[]) f13860J.clone();
    }

    /* JADX INFO: renamed from: l6.p$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC4677p m18686a(String str) {
            Object next;
            str.getClass();
            Iterator<E> it = EnumC4677p.m18685c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC8611a0.m33061F(((EnumC4677p) next).name(), str, true)) {
                    break;
                }
            }
            return (EnumC4677p) next;
        }

        public a() {
        }
    }
}
