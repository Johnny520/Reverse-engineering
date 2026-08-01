package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0900;
import kotlin.Result;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5905 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean f14965;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean f14966;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean f14967;

    static {
        Object objM723;
        Object objM7232;
        Object objM7233;
        try {
            objM723 = Result.m9304constructorimpl(System.getProperty("kotlin.reflect.jvm.useK1Implementation"));
        } catch (Throwable th) {
            objM723 = AbstractC0900.m723(th);
        }
        if (Result.m9310isFailureimpl(objM723)) {
            objM723 = null;
        }
        String str = (String) objM723;
        boolean z = false;
        f14967 = str != null && Boolean.parseBoolean(str);
        try {
            objM7232 = Result.m9304constructorimpl(System.getProperty("kotlin.reflect.jvm.newFakeOverridesImplementation"));
        } catch (Throwable th2) {
            objM7232 = AbstractC0900.m723(th2);
        }
        if (Result.m9310isFailureimpl(objM7232)) {
            objM7232 = null;
        }
        String str2 = (String) objM7232;
        f14966 = str2 != null && Boolean.parseBoolean(str2);
        try {
            objM7233 = Result.m9304constructorimpl(System.getProperty("kotlin.reflect.jvm.loadMetadataDirectly"));
        } catch (Throwable th3) {
            objM7233 = AbstractC0900.m723(th3);
        }
        String str3 = (String) (Result.m9310isFailureimpl(objM7233) ? null : objM7233);
        if (str3 != null && Boolean.parseBoolean(str3)) {
            z = true;
        }
        f14965 = z;
    }
}
