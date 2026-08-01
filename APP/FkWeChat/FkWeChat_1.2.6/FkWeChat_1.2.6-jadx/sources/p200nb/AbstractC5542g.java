package p200nb;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: nb.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5542g {

    /* JADX INFO: renamed from: a */
    public final boolean f17319a;

    /* JADX INFO: renamed from: nb.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC5542g {

        /* JADX INFO: renamed from: b */
        public static final a f17320b = new a();

        public a() {
            super(false, null);
        }
    }

    /* JADX INFO: renamed from: nb.g$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC5542g {

        /* JADX INFO: renamed from: b */
        public final String f17321b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(false, null);
            str.getClass();
            this.f17321b = str;
        }
    }

    /* JADX INFO: renamed from: nb.g$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC5542g {

        /* JADX INFO: renamed from: b */
        public static final c f17322b = new c();

        public c() {
            super(true, null);
        }
    }

    public AbstractC5542g(boolean z10) {
        this.f17319a = z10;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m22572a() {
        return this.f17319a;
    }

    public /* synthetic */ AbstractC5542g(boolean z10, AbstractC1043k abstractC1043k) {
        this(z10);
    }
}
