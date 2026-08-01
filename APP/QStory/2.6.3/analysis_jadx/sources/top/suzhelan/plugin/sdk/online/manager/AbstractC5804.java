package top.suzhelan.plugin.sdk.online.manager;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.LinkedHashSet;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5399;
import p095.C7207;
import p095.ExecutorC7208;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;

/* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.manager.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5804 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int f15915;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final LinkedHashSet f15914 = new LinkedHashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Handler f15913 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m11214() {
        if (PluginSdkConfig.getUSER_UIN().length() == 0) {
            Log.w("MessageBadgeManager", "Cannot refresh unread count: USER_UIN is empty");
        } else {
            C7207 c7207 = AbstractC5395.f15030;
            AbstractC5399.m10477(AbstractC5399.m10489(ExecutorC7208.f19225), null, null, new MessageBadgeManager$refreshUnreadCount$1(null), 3);
        }
    }
}
