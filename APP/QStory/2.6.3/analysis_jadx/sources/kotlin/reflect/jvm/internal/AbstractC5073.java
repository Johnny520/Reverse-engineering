package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0053;
import kotlin.Result;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5073 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean f14620;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean f14621;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean f14622;

    static {
        Object objM163;
        Object objM1632;
        Object objM1633;
        try {
            objM163 = Result.m8745constructorimpl(System.getProperty("kotlin.reflect.jvm.useK1Implementation"));
        } catch (Throwable th) {
            objM163 = AbstractC0053.m163(th);
        }
        if (Result.m8751isFailureimpl(objM163)) {
            objM163 = null;
        }
        String str = (String) objM163;
        boolean z = false;
        f14622 = str != null && Boolean.parseBoolean(str);
        try {
            objM1632 = Result.m8745constructorimpl(System.getProperty("kotlin.reflect.jvm.newFakeOverridesImplementation"));
        } catch (Throwable th2) {
            objM1632 = AbstractC0053.m163(th2);
        }
        if (Result.m8751isFailureimpl(objM1632)) {
            objM1632 = null;
        }
        String str2 = (String) objM1632;
        f14621 = str2 != null && Boolean.parseBoolean(str2);
        try {
            objM1633 = Result.m8745constructorimpl(System.getProperty("kotlin.reflect.jvm.loadMetadataDirectly"));
        } catch (Throwable th3) {
            objM1633 = AbstractC0053.m163(th3);
        }
        String str3 = (String) (Result.m8751isFailureimpl(objM1633) ? null : objM1633);
        if (str3 != null && Boolean.parseBoolean(str3)) {
            z = true;
        }
        f14620 = z;
    }
}
