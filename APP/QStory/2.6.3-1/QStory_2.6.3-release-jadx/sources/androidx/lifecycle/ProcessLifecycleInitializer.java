package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import net.bytebuddy.description.method.MethodDescription;
import p149.C8336;
import p149.InterfaceC8335;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m151d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "L飘花落叶言子兰世苏楪哲/飘花落叶言子楪世苏兰哲;", "Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "lifecycle-process"}, m152k = 1, m153mv = {2, 0, 0}, m155xi = 48)
public final class ProcessLifecycleInitializer implements InterfaceC8335 {
    @Override // p149.InterfaceC8335
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo4884(Context context) {
        context.getClass();
        C8336 c8336M13284 = C8336.m13284(context);
        c8336M13284.getClass();
        if (!c8336M13284.f20718.contains(ProcessLifecycleInitializer.class)) {
            C6755.m11870("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!AbstractC3214.f7358.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C3215());
        }
        C3264 c3264 = C3264.f7432;
        c3264.getClass();
        c3264.f7433 = new Handler();
        c3264.f7436.m5059(Lifecycle$Event.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C3200(c3264));
        return c3264;
    }

    @Override // p149.InterfaceC8335
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo4885() {
        return EmptyList.INSTANCE;
    }
}
