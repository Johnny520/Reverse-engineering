package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/lifecycle/SavedStateHandlesVM;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class SavedStateHandleSupport$savedStateHandlesVM$1$1 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<androidx.lifecycle.viewmodel.CreationExtras, androidx.lifecycle.SavedStateHandlesVM> {
    public static final androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1$1 INSTANCE = null;

    static {
            androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1$1 r0 = new androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1$1
            r0.<init>()
            androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1$1.INSTANCE = r0
            return
    }

    public SavedStateHandleSupport$savedStateHandlesVM$1$1() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final androidx.lifecycle.SavedStateHandlesVM invoke2(@Yue.InterfaceC4418 androidx.lifecycle.viewmodel.CreationExtras r2) {
            r1 = this;
            java.lang.String r0 = "$this$initializer"
            Yue.C3329.m13906(r2, r0)
            androidx.lifecycle.SavedStateHandlesVM r2 = new androidx.lifecycle.SavedStateHandlesVM
            r2.<init>()
            return r2
    }

    @Override // Yue.InterfaceC2825
    public /* bridge */ /* synthetic */ androidx.lifecycle.SavedStateHandlesVM invoke(androidx.lifecycle.viewmodel.CreationExtras r1) {
            r0 = this;
            androidx.lifecycle.viewmodel.CreationExtras r1 = (androidx.lifecycle.viewmodel.CreationExtras) r1
            androidx.lifecycle.SavedStateHandlesVM r1 = r0.invoke2(r1)
            return r1
    }
}
