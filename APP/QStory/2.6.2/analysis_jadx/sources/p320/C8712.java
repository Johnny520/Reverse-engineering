package p320;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import androidx.appcompat.app.C0081;
import com.bumptech.glide.AbstractC3056;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import java.util.Calendar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p035.AbstractC6340;
import p162.AbstractC7652;
import p331.C8799;
import p336.AbstractC8805;
import p391.C9114;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C8712 extends AbstractC8805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ int f24573 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ExecutorService f24574 = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C9114 f24575 = new C9114(AbstractC3056.m6668(-3937679931782464935L), 0);

    static {
        AbstractC3056.m6668(-3937679931782464935L);
        AbstractC3056.m6668(-3937679751393838503L);
        AbstractC3056.m6668(-3937679442156193191L);
        AbstractC3056.m6668(-3937679497990768039L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m14389(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(AbstractC3056.m6668(-3937679609659917735L));
        Intent intent = new Intent(AbstractC3056.m6668(-3937679497990768039L));
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

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Context context = AbstractC6340.f17460;
        AbstractC7652.m12892(context, new C0081(this, 1), new IntentFilter(AbstractC3056.m6668(-3937679497990768039L)), null, null, 4);
        m14389(context);
        this.f24574.execute(new RunnableC8713(this, 0));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937679867357955495L);
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11193() {
        return new ViewOnClickListenerC3182(this, 20);
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11255(C8799 c8799) {
        return true;
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11257(C8799 c8799) {
        return c8799.f24759.intValue() >= 1;
    }
}
