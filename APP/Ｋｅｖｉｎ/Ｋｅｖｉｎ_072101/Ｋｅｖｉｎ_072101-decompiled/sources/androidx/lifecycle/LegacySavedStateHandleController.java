package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
class LegacySavedStateHandleController {
    static final java.lang.String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";


    static final class OnRecreation implements androidx.savedstate.SavedStateRegistry.AutoRecreated {
        OnRecreation() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.savedstate.SavedStateRegistry.AutoRecreated
        public void onRecreated(androidx.savedstate.SavedStateRegistryOwner r7) {
                r6 = this;
                boolean r0 = r7 instanceof androidx.lifecycle.ViewModelStoreOwner
                if (r0 == 0) goto L3f
                r0 = r7
                androidx.lifecycle.ViewModelStoreOwner r0 = (androidx.lifecycle.ViewModelStoreOwner) r0
                androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore()
                androidx.savedstate.SavedStateRegistry r1 = r7.getSavedStateRegistry()
                java.util.Set r2 = r0.keys()
                java.util.Iterator r2 = r2.iterator()
            L17:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L2f
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                androidx.lifecycle.ViewModel r4 = r0.get(r3)
                androidx.lifecycle.Lifecycle r5 = r7.getLifecycle()
                androidx.lifecycle.LegacySavedStateHandleController.attachHandleIfNeeded(r4, r1, r5)
                goto L17
            L2f:
                java.util.Set r2 = r0.keys()
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L3e
                java.lang.Class<androidx.lifecycle.LegacySavedStateHandleController$OnRecreation> r2 = androidx.lifecycle.LegacySavedStateHandleController.OnRecreation.class
                r1.runOnNextRecreation(r2)
            L3e:
                return
            L3f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner"
                r0.<init>(r1)
                throw r0
        }
    }

    private LegacySavedStateHandleController() {
            r0 = this;
            r0.<init>()
            return
    }

    static void attachHandleIfNeeded(androidx.lifecycle.ViewModel r2, androidx.savedstate.SavedStateRegistry r3, androidx.lifecycle.Lifecycle r4) {
            java.lang.String r0 = "androidx.lifecycle.savedstate.vm.tag"
            java.lang.Object r0 = r2.getTag(r0)
            androidx.lifecycle.SavedStateHandleController r0 = (androidx.lifecycle.SavedStateHandleController) r0
            if (r0 == 0) goto L16
            boolean r1 = r0.isAttached()
            if (r1 != 0) goto L16
            r0.attachToLifecycle(r3, r4)
            tryToAddRecreator(r3, r4)
        L16:
            return
    }

    static androidx.lifecycle.SavedStateHandleController create(androidx.savedstate.SavedStateRegistry r3, androidx.lifecycle.Lifecycle r4, java.lang.String r5, android.os.Bundle r6) {
            android.os.Bundle r0 = r3.consumeRestoredStateForKey(r5)
            androidx.lifecycle.SavedStateHandle r1 = androidx.lifecycle.SavedStateHandle.createHandle(r0, r6)
            androidx.lifecycle.SavedStateHandleController r2 = new androidx.lifecycle.SavedStateHandleController
            r2.<init>(r5, r1)
            r2.attachToLifecycle(r3, r4)
            tryToAddRecreator(r3, r4)
            return r2
    }

    private static void tryToAddRecreator(androidx.savedstate.SavedStateRegistry r2, androidx.lifecycle.Lifecycle r3) {
            androidx.lifecycle.Lifecycle$State r0 = r3.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            if (r0 == r1) goto L1a
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r1 = r0.isAtLeast(r1)
            if (r1 == 0) goto L11
            goto L1a
        L11:
            androidx.lifecycle.LegacySavedStateHandleController$1 r1 = new androidx.lifecycle.LegacySavedStateHandleController$1
            r1.<init>(r3, r2)
            r3.addObserver(r1)
            goto L1f
        L1a:
            java.lang.Class<androidx.lifecycle.LegacySavedStateHandleController$OnRecreation> r1 = androidx.lifecycle.LegacySavedStateHandleController.OnRecreation.class
            r2.runOnNextRecreation(r1)
        L1f:
            return
    }
}
