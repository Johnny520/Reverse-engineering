package p319w2;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: w2.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9064f0 {

    /* JADX INFO: renamed from: c */
    public static final a f31091c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final C9064f0 f31092d = new C9064f0();

    /* JADX INFO: renamed from: a */
    public final boolean f31093a;

    /* JADX INFO: renamed from: b */
    public final int f31094b;

    public C9064f0(boolean z10) {
        this.f31093a = z10;
        this.f31094b = C9078i.f31130b.m35294b();
    }

    /* JADX INFO: renamed from: b */
    public final int m35229b() {
        return this.f31094b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m35230c() {
        return this.f31093a;
    }

    /* JADX INFO: renamed from: d */
    public final C9064f0 m35231d(C9064f0 c9064f0) {
        return c9064f0 == null ? this : c9064f0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9064f0)) {
            return false;
        }
        C9064f0 c9064f0 = (C9064f0) obj;
        return this.f31093a == c9064f0.f31093a && C9078i.m35289g(this.f31094b, c9064f0.f31094b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f31093a) * 31) + C9078i.m35290h(this.f31094b);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f31093a + ", emojiSupportMatch=" + ((Object) C9078i.m35291i(this.f31094b)) + ')';
    }

    /* JADX INFO: renamed from: w2.f0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C9064f0 m35232a() {
            return C9064f0.f31092d;
        }

        public a() {
        }
    }

    public /* synthetic */ C9064f0(int i10, boolean z10, AbstractC1043k abstractC1043k) {
        this(i10, z10);
    }

    public C9064f0(int i10, boolean z10) {
        this.f31093a = z10;
        this.f31094b = i10;
    }

    public C9064f0() {
        this(C9078i.f31130b.m35294b(), false, null);
    }
}
