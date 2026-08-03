package android.view;

import Yue.C3362;
import Yue.C3880;
import Yue.C5499;
import Yue.InterfaceC5435;
import Yue.InterfaceC6399;
import android.content.Context;
import android.view.ProcessLifecycleOwner;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "LYue/ۥ۠ۥۢ۠;", "Landroidx/lifecycle/LifecycleOwner;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)Landroidx/lifecycle/LifecycleOwner;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
public final class ProcessLifecycleInitializer implements InterfaceC5435<LifecycleOwner> {
    @Override // Yue.InterfaceC5435
    @InterfaceC6399
    public List<Class<? extends InterfaceC5435<?>>> dependencies() {
        return C3880.m10735();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: create(Landroid/content/Context;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // Yue.InterfaceC5435
    @InterfaceC6399
    public LifecycleOwner create(@InterfaceC6399 Context context) {
        C5499.m17103(context, "context");
        C3362 c3362M6886 = C3362.m6886(context);
        C5499.m17102(c3362M6886, "getInstance(context)");
        if (!c3362M6886.m6891(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        LifecycleDispatcher.init(context);
        ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.INSTANCE;
        companion.init$lifecycle_process_release(context);
        return companion.get();
    }
}
