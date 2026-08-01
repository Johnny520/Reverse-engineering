package androidx.fragment.app;

import androidx.lifecycle.Lifecycle$State;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3136 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f7096;

    static {
        int[] iArr = new int[Lifecycle$State.values().length];
        f7096 = iArr;
        try {
            iArr[Lifecycle$State.RESUMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f7096[Lifecycle$State.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f7096[Lifecycle$State.CREATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f7096[Lifecycle$State.INITIALIZED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
