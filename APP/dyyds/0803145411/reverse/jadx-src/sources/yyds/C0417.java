package yyds;

/* JADX INFO: renamed from: yyds.ᛲᛸᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C0417 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final /* synthetic */ long f2151 = AbstractC2112.f10448.objectFieldOffset(C0417.class.getDeclaredField("_handled$volatile"));
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Throwable f2152;

    public C0417(Throwable th, boolean z) {
        this.f2152 = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f2152 + ']';
    }
}
