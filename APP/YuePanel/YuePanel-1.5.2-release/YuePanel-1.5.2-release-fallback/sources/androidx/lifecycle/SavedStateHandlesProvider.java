package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n215#2,2:226\n1#3:228\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n*L\n146#1:226,2\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/lifecycle/SavedStateHandlesProvider;", "Landroidx/savedstate/ۥ$ۥ۟۟;", "Landroidx/savedstate/ۥ;", "savedStateRegistry", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "<init>", "(Landroidx/savedstate/ۥ;Landroidx/lifecycle/ViewModelStoreOwner;)V", "Landroid/os/Bundle;", "saveState", "()Landroid/os/Bundle;", "LYue/ۥۣۢ۠ۤ;", "performRestore", "()V", "", "key", "consumeRestoredStateForKey", "(Ljava/lang/String;)Landroid/os/Bundle;", "Landroidx/savedstate/ۥ;", "", "restored", "Z", "restoredState", "Landroid/os/Bundle;", "Landroidx/lifecycle/SavedStateHandlesVM;", "viewModel$delegate", "LYue/ۥ۠ۦۨۨ;", "getViewModel", "()Landroidx/lifecycle/SavedStateHandlesVM;", "viewModel", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
public final class SavedStateHandlesProvider implements androidx.savedstate.C7816.InterfaceC7819 {
    private boolean restored;

    @Yue.InterfaceC4543
    private android.os.Bundle restoredState;

    @Yue.InterfaceC4418
    private final androidx.savedstate.C7816 savedStateRegistry;

    @Yue.InterfaceC4418
    private final Yue.InterfaceC3574 viewModel$delegate;

    public SavedStateHandlesProvider(@Yue.InterfaceC4418 androidx.savedstate.C7816 r2, @Yue.InterfaceC4418 androidx.lifecycle.ViewModelStoreOwner r3) {
            r1 = this;
            java.lang.String r0 = "savedStateRegistry"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "viewModelStoreOwner"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.savedStateRegistry = r2
            androidx.lifecycle.SavedStateHandlesProvider$viewModel$2 r2 = new androidx.lifecycle.SavedStateHandlesProvider$viewModel$2
            r2.<init>(r3)
            Yue.ۥ۠ۦۨۨ r2 = Yue.C3579.m14505(r2)
            r1.viewModel$delegate = r2
            return
    }

    private final androidx.lifecycle.SavedStateHandlesVM getViewModel() {
            r1 = this;
            Yue.ۥ۠ۦۨۨ r0 = r1.viewModel$delegate
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.SavedStateHandlesVM r0 = (androidx.lifecycle.SavedStateHandlesVM) r0
            return r0
    }

    @Yue.InterfaceC4543
    public final android.os.Bundle consumeRestoredStateForKey(@Yue.InterfaceC4418 java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r4, r0)
            r3.performRestore()
            android.os.Bundle r0 = r3.restoredState
            r1 = 0
            if (r0 == 0) goto L12
            android.os.Bundle r0 = r0.getBundle(r4)
            goto L13
        L12:
            r0 = r1
        L13:
            android.os.Bundle r2 = r3.restoredState
            if (r2 == 0) goto L1a
            r2.remove(r4)
        L1a:
            android.os.Bundle r4 = r3.restoredState
            if (r4 == 0) goto L27
            boolean r4 = r4.isEmpty()
            r2 = 1
            if (r4 != r2) goto L27
            r3.restoredState = r1
        L27:
            return r0
    }

    public final void performRestore() {
            r3 = this;
            boolean r0 = r3.restored
            if (r0 != 0) goto L25
            androidx.savedstate.ۥ r0 = r3.savedStateRegistry
            java.lang.String r1 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            android.os.Bundle r0 = r0.m30359(r1)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            android.os.Bundle r2 = r3.restoredState
            if (r2 == 0) goto L18
            r1.putAll(r2)
        L18:
            if (r0 == 0) goto L1d
            r1.putAll(r0)
        L1d:
            r3.restoredState = r1
            r0 = 1
            r3.restored = r0
            r3.getViewModel()
        L25:
            return
    }

    @Override // androidx.savedstate.C7816.InterfaceC7819
    @Yue.InterfaceC4418
    public android.os.Bundle saveState() {
            r5 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.os.Bundle r1 = r5.restoredState
            if (r1 == 0) goto Lc
            r0.putAll(r1)
        Lc:
            androidx.lifecycle.SavedStateHandlesVM r1 = r5.getViewModel()
            java.util.Map r1 = r1.getHandles()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            androidx.lifecycle.SavedStateHandle r2 = (androidx.lifecycle.SavedStateHandle) r2
            androidx.savedstate.ۥ$ۥ۟۟ r2 = r2.savedStateProvider()
            android.os.Bundle r2 = r2.saveState()
            android.os.Bundle r4 = android.os.Bundle.EMPTY
            boolean r4 = Yue.C3329.m13897(r2, r4)
            if (r4 != 0) goto L1c
            r0.putBundle(r3, r2)
            goto L1c
        L48:
            r1 = 0
            r5.restored = r1
            return r0
    }
}
