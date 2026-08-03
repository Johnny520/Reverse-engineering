package android.view;

import Yue.AbstractC5673;
import Yue.C5499;
import Yue.InterfaceC5124;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import android.view.viewmodel.CreationExtras;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6211(m2698d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m2699d2 = {"<anonymous>", "Landroidx/lifecycle/SavedStateHandlesVM;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke"}, m2700k = 3, m2701mv = {1, 8, 0}, m2703xi = 48)
public final class SavedStateHandleSupport$savedStateHandlesVM$1$1 extends AbstractC5673 implements InterfaceC5124<CreationExtras, SavedStateHandlesVM> {
    public static final SavedStateHandleSupport$savedStateHandlesVM$1$1 INSTANCE = new SavedStateHandleSupport$savedStateHandlesVM$1$1();

    public SavedStateHandleSupport$savedStateHandlesVM$1$1() {
        super(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // Yue.InterfaceC5124
    @InterfaceC6399
    public final SavedStateHandlesVM invoke(@InterfaceC6399 CreationExtras creationExtras) {
        C5499.m17103(creationExtras, "$this$initializer");
        return new SavedStateHandlesVM();
    }
}
