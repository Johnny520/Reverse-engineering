package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2398 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f7037;

    static {
        int[] iArr = new int[Lifecycle$State.values().length];
        try {
            iArr[Lifecycle$State.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Lifecycle$State.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Lifecycle$State.RESUMED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Lifecycle$State.DESTROYED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Lifecycle$State.INITIALIZED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f7037 = iArr;
    }
}
