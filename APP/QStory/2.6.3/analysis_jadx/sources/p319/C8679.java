package p319;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import androidx.appcompat.app.C0081;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import java.util.Calendar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p036.AbstractC6358;
import p162.AbstractC7653;
import p287.AbstractC8405;
import p332.C8785;
import p337.AbstractC8803;
import p391.C9095;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C8679 extends AbstractC8803 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ int f24483 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ExecutorService f24484 = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C9095 f24485 = new C9095(AbstractC8405.m13972(1205), 0);

    static {
        AbstractC8405.m13972(1205);
        AbstractC8405.m13972(1207);
        AbstractC8405.m13972(1212);
        AbstractC8405.m13972(1211);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m14400(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵喵喵"));
        Intent intent = new Intent(AbstractC8405.m13972(1211));
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

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        Context context = AbstractC6358.f17507;
        AbstractC7653.m12921(context, new C0081(this, 1), new IntentFilter(AbstractC8405.m13972(1211)), null, null, 4);
        m14400(context);
        this.f24484.execute(new RunnableC8680(this, 0));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1206);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11247() {
        return new ViewOnClickListenerC3183(this, 19);
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11251(C8785 c8785) {
        return true;
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11252(C8785 c8785) {
        return c8785.f24740.intValue() >= 1;
    }
}
