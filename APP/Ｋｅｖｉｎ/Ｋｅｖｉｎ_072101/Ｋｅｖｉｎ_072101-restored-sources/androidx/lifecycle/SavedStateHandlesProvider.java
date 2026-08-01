package androidx.lifecycle;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, m115d2 = {"Landroidx/lifecycle/SavedStateHandlesProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/ViewModelStoreOwner;)V", "restored", "", "restoredState", "Landroid/os/Bundle;", "viewModel", "Landroidx/lifecycle/SavedStateHandlesVM;", "getViewModel", "()Landroidx/lifecycle/SavedStateHandlesVM;", "viewModel$delegate", "Lkotlin/Lazy;", "consumeRestoredStateForKey", "key", "", "performRestore", "", "saveState", "lifecycle-viewmodel-savedstate_release"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public final class SavedStateHandlesProvider implements androidx.savedstate.SavedStateRegistry.SavedStateProvider {
    private boolean restored;
    private android.os.Bundle restoredState;
    private final androidx.savedstate.SavedStateRegistry savedStateRegistry;
    private final kotlin.Lazy viewModel$delegate;

    public SavedStateHandlesProvider(androidx.savedstate.SavedStateRegistry r2, androidx.lifecycle.ViewModelStoreOwner r3) {
            r1 = this;
            java.lang.String r0 = "savedStateRegistry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "viewModelStoreOwner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.savedStateRegistry = r2
            androidx.lifecycle.SavedStateHandlesProvider$viewModel$2 r0 = new androidx.lifecycle.SavedStateHandlesProvider$viewModel$2
            r0.<init>(r3)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r1.viewModel$delegate = r0
            return
    }

    private final androidx.lifecycle.SavedStateHandlesVM getViewModel() {
            r1 = this;
            kotlin.Lazy r0 = r1.viewModel$delegate
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.SavedStateHandlesVM r0 = (androidx.lifecycle.SavedStateHandlesVM) r0
            return r0
    }

    public final android.os.Bundle consumeRestoredStateForKey(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r7.performRestore()
            android.os.Bundle r0 = r7.restoredState
            r1 = 0
            if (r0 == 0) goto L12
            android.os.Bundle r0 = r0.getBundle(r8)
            goto L13
        L12:
            r0 = r1
        L13:
            r2 = r0
            r3 = 0
            android.os.Bundle r4 = r7.restoredState
            if (r4 == 0) goto L1c
            r4.remove(r8)
        L1c:
            android.os.Bundle r4 = r7.restoredState
            r5 = 0
            if (r4 == 0) goto L29
            boolean r4 = r4.isEmpty()
            r6 = 1
            if (r4 != r6) goto L29
            r5 = r6
        L29:
            if (r5 == 0) goto L2d
            r7.restoredState = r1
        L2d:
            return r0
    }

    public final void performRestore() {
            r2 = this;
            boolean r0 = r2.restored
            if (r0 != 0) goto L14
            androidx.savedstate.SavedStateRegistry r0 = r2.savedStateRegistry
            java.lang.String r1 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            android.os.Bundle r0 = r0.consumeRestoredStateForKey(r1)
            r2.restoredState = r0
            r0 = 1
            r2.restored = r0
            r2.getViewModel()
        L14:
            return
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public android.os.Bundle saveState() {
            r12 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1 = r0
            r2 = 0
            android.os.Bundle r3 = r12.restoredState
            if (r3 == 0) goto L10
            android.os.Bundle r3 = r12.restoredState
            r1.putAll(r3)
        L10:
            androidx.lifecycle.SavedStateHandlesVM r3 = r12.getViewModel()
            java.util.Map r3 = r3.getHandles()
            r4 = 0
            java.util.Set r5 = r3.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L21:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4f
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            r7 = 0
            java.lang.Object r8 = r6.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r6.getValue()
            androidx.lifecycle.SavedStateHandle r9 = (androidx.lifecycle.SavedStateHandle) r9
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r10 = r9.savedStateProvider()
            android.os.Bundle r10 = r10.saveState()
            android.os.Bundle r11 = android.os.Bundle.EMPTY
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r11)
            if (r11 != 0) goto L4d
            r1.putBundle(r8, r10)
        L4d:
            goto L21
        L4f:
            r1 = r0
            r2 = 0
            r3 = 0
            r12.restored = r3
            return r0
    }
}
