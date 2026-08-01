package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import net.bytebuddy.description.method.MethodDescription;
import p133.C7507;
import p133.InterfaceC7506;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "L飘花落叶言子兰世苏楪哲/飘花落叶言子楪世苏兰哲;", "Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements InterfaceC7506 {
    @Override // p133.InterfaceC7506
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo4324(Context context) {
        context.getClass();
        C7507 c7507M12725 = C7507.m12725(context);
        c7507M12725.getClass();
        if (!c7507M12725.f20373.contains(ProcessLifecycleInitializer.class)) {
            C5925.m11311("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!AbstractC2381.f7013.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C2382());
        }
        C2431 c2431 = C2431.f7087;
        c2431.getClass();
        c2431.f7088 = new Handler();
        c2431.f7091.m4499(Lifecycle$Event.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C2367(c2431));
        return c2431;
    }

    @Override // p133.InterfaceC7506
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo4325() {
        return EmptyList.INSTANCE;
    }
}
