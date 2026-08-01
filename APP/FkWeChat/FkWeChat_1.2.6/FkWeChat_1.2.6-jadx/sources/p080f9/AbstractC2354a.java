package p080f9;

import p024b9.AbstractC1043k;
import p036c9.InterfaceC1400a;
import p185m8.AbstractC5110v;
import p283t8.AbstractC8205c;
import p376zd.C9987e;

/* JADX INFO: renamed from: f9.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2354a implements Iterable, InterfaceC1400a {

    /* JADX INFO: renamed from: t */
    public static final a f6475t = new a(null);

    /* JADX INFO: renamed from: q */
    public final char f6476q;

    /* JADX INFO: renamed from: r */
    public final char f6477r;

    /* JADX INFO: renamed from: s */
    public final int f6478s;

    public AbstractC2354a(char c10, char c11, int i10) {
        if (i10 == 0) {
            C9987e.m38645a("Step must be non-zero.");
            throw null;
        }
        if (i10 == Integer.MIN_VALUE) {
            C9987e.m38645a("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f6476q = c10;
        this.f6477r = (char) AbstractC8205c.m31894c(c10, c11, i10);
        this.f6478s = i10;
    }

    /* JADX INFO: renamed from: o */
    public final char m8548o() {
        return this.f6476q;
    }

    /* JADX INFO: renamed from: p */
    public final char m8549p() {
        return this.f6477r;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC5110v iterator() {
        return new C2355b(this.f6476q, this.f6477r, this.f6478s);
    }

    /* JADX INFO: renamed from: f9.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
