package p138b4;

import java.net.Proxy;

/* JADX INFO: renamed from: b4.b */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1857b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f6274a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int[] iArr = new int[Proxy.Type.values().length];
        try {
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f6274a = iArr;
    }
}
