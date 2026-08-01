package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0053;
import kotlin.Result;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5072 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean f14620;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean f14621;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean f14622;

    static {
        Object objM162;
        Object objM1622;
        Object objM1623;
        try {
            objM162 = Result.m8755constructorimpl(System.getProperty("kotlin.reflect.jvm.useK1Implementation"));
        } catch (Throwable th) {
            objM162 = AbstractC0053.m162(th);
        }
        if (Result.m8761isFailureimpl(objM162)) {
            objM162 = null;
        }
        String str = (String) objM162;
        boolean z = false;
        f14622 = str != null && Boolean.parseBoolean(str);
        try {
            objM1622 = Result.m8755constructorimpl(System.getProperty("kotlin.reflect.jvm.newFakeOverridesImplementation"));
        } catch (Throwable th2) {
            objM1622 = AbstractC0053.m162(th2);
        }
        if (Result.m8761isFailureimpl(objM1622)) {
            objM1622 = null;
        }
        String str2 = (String) objM1622;
        f14621 = str2 != null && Boolean.parseBoolean(str2);
        try {
            objM1623 = Result.m8755constructorimpl(System.getProperty("kotlin.reflect.jvm.loadMetadataDirectly"));
        } catch (Throwable th3) {
            objM1623 = AbstractC0053.m162(th3);
        }
        String str3 = (String) (Result.m8761isFailureimpl(objM1623) ? null : objM1623);
        if (str3 != null && Boolean.parseBoolean(str3)) {
            z = true;
        }
        f14620 = z;
    }
}
