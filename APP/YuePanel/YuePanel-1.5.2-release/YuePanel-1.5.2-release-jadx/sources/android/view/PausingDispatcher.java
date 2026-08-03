package android.view;

import Yue.AbstractC4232;
import Yue.C4423;
import Yue.C5499;
import Yue.InterfaceC4225;
import Yue.InterfaceC5568;
import Yue.InterfaceC6399;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/PausingDispatcher;", "LYue/ۥ۟ۧۦۨ;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥ۟ۧۦۥ;", "context", "", "isDispatchNeeded", "(LYue/ۥ۟ۧۦۥ;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "LYue/ۥۣۢ۠ۤ;", "dispatch", "(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V", "Landroidx/lifecycle/DispatchQueue;", "dispatchQueue", "Landroidx/lifecycle/DispatchQueue;", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
public final class PausingDispatcher extends AbstractC4232 {

    @InterfaceC6399
    @InterfaceC5568
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // Yue.AbstractC4232
    public void dispatch(@InterfaceC6399 InterfaceC4225 context, @InterfaceC6399 Runnable block) {
        C5499.m17103(context, "context");
        C5499.m17103(block, "block");
        this.dispatchQueue.dispatchAndEnqueue(context, block);
    }

    @Override // Yue.AbstractC4232
    public boolean isDispatchNeeded(@InterfaceC6399 InterfaceC4225 context) {
        C5499.m17103(context, "context");
        if (C4423.m12872().mo16040().isDispatchNeeded(context)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
