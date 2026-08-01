package p335;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import androidx.appcompat.app.C0928;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import java.util.Calendar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p052.AbstractC7187;
import p178.AbstractC8482;
import p348.C9614;
import p353.AbstractC9632;
import p407.C9924;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C9508 extends AbstractC9632 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ int f24828 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ExecutorService f24829 = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C9924 f24830 = new C9924("AutoGroupCheckIn", 0);

    static {
        "AutoGroupCheckIn";
        "TroopUinList";
        "CheckedTroopsToday";
        "DAILY_CHECK_ACTION";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m14959(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent intent = new Intent("DAILY_CHECK_ACTION");
        intent.setPackage(context.getPackageName());
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
        alarmManager.cancel(broadcast);
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        alarmManager.setExactAndAllowWhileIdle(0, calendar.getTimeInMillis(), broadcast);
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Context context = AbstractC7187.f17852;
        AbstractC8482.m13480(context, new C0928(this, 1), new IntentFilter("DAILY_CHECK_ACTION"), null, null, 4);
        m14959(context);
        this.f24829.execute(new RunnableC9509(this, 0));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "点击可以配置开启的群聊,定时广播实现,与另一个打卡不冲突";
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11806() {
        return new ViewOnClickListenerC4015(this, 19);
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11810(C9614 c9614) {
        return true;
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11811(C9614 c9614) {
        return c9614.f25085.intValue() >= 1;
    }
}
