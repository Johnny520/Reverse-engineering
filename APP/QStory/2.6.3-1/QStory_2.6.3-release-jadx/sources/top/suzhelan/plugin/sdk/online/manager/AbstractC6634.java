package top.suzhelan.plugin.sdk.online.manager;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.LinkedHashSet;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import p111.C8036;
import p111.ExecutorC8037;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;

/* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.manager.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6634 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int f16260;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final LinkedHashSet f16259 = new LinkedHashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Handler f16258 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m11773() {
        if (PluginSdkConfig.getUSER_UIN().length() == 0) {
            Log.w("MessageBadgeManager", "Cannot refresh unread count: USER_UIN is empty");
        } else {
            C8036 c8036 = AbstractC6227.f15375;
            AbstractC6231.m11036(AbstractC6231.m11048(ExecutorC8037.f19570), null, null, new MessageBadgeManager$refreshUnreadCount$1(null), 3);
        }
    }
}
