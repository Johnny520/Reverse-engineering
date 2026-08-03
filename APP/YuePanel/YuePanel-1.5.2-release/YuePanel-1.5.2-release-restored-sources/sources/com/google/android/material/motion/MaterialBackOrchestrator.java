package com.google.android.material.motion;

import Yue.C3505;
import Yue.InterfaceC4482;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public final class MaterialBackOrchestrator {

    @InterfaceC6490
    private final BackCallbackDelegate backCallbackDelegate;

    @InterfaceC6391
    private final MaterialBackHandler backHandler;

    @InterfaceC6391
    private final View view;

    @InterfaceC7113(33)
    public static class Api33BackCallbackDelegate implements BackCallbackDelegate {

        @InterfaceC6490
        private OnBackInvokedCallback onBackInvokedCallback;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private Api33BackCallbackDelegate() {
        }

        public OnBackInvokedCallback createOnBackInvokedCallback(@InterfaceC6391 final MaterialBackHandler materialBackHandler) {
            Objects.requireNonNull(materialBackHandler);
            return new OnBackInvokedCallback() { // from class: Yue.ۥۡ۟۟ۡ
                public final void onBackInvoked() {
                    materialBackHandler.handleBackInvoked();
                }
            };
        }

        public boolean isListeningForBackCallbacks() {
            return this.onBackInvokedCallback != null;
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        @InterfaceC4482
        public void startListeningForBackCallbacks(@InterfaceC6391 MaterialBackHandler materialBackHandler, @InterfaceC6391 View view, boolean z) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.onBackInvokedCallback == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackCreateOnBackInvokedCallback = createOnBackInvokedCallback(materialBackHandler);
                this.onBackInvokedCallback = onBackInvokedCallbackCreateOnBackInvokedCallback;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z ? 1000000 : 0, onBackInvokedCallbackCreateOnBackInvokedCallback);
            }
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        @InterfaceC4482
        public void stopListeningForBackCallbacks(@InterfaceC6391 View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.onBackInvokedCallback);
            this.onBackInvokedCallback = null;
        }
    }

    @InterfaceC7113(34)
    public static class Api34BackCallbackDelegate extends Api33BackCallbackDelegate {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private Api34BackCallbackDelegate() {
            super();
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.Api33BackCallbackDelegate
        public OnBackInvokedCallback createOnBackInvokedCallback(@InterfaceC6391 final MaterialBackHandler materialBackHandler) {
            return new OnBackAnimationCallback() { // from class: com.google.android.material.motion.MaterialBackOrchestrator.Api34BackCallbackDelegate.1
                public void onBackCancelled() {
                    if (Api34BackCallbackDelegate.this.isListeningForBackCallbacks()) {
                        materialBackHandler.cancelBackProgress();
                    }
                }

                public void onBackInvoked() {
                    materialBackHandler.handleBackInvoked();
                }

                public void onBackProgressed(@InterfaceC6391 BackEvent backEvent) {
                    if (Api34BackCallbackDelegate.this.isListeningForBackCallbacks()) {
                        materialBackHandler.updateBackProgress(new C3505(backEvent));
                    }
                }

                public void onBackStarted(@InterfaceC6391 BackEvent backEvent) {
                    if (Api34BackCallbackDelegate.this.isListeningForBackCallbacks()) {
                        materialBackHandler.startBackProgress(new C3505(backEvent));
                    }
                }
            };
        }
    }

    public interface BackCallbackDelegate {
        void startListeningForBackCallbacks(@InterfaceC6391 MaterialBackHandler materialBackHandler, @InterfaceC6391 View view, boolean z);

        void stopListeningForBackCallbacks(@InterfaceC6391 View view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public <T extends View & MaterialBackHandler> MaterialBackOrchestrator(@InterfaceC6391 T t) {
        this(t, t);
    }

    @InterfaceC6490
    private static BackCallbackDelegate createBackCallbackDelegate() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return new Api34BackCallbackDelegate();
        }
        if (i >= 33) {
            return new Api33BackCallbackDelegate();
        }
        return null;
    }

    public boolean shouldListenForBackCallbacks() {
        return this.backCallbackDelegate != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void startListeningForBackCallbacks() {
        startListeningForBackCallbacks(false);
    }

    public void startListeningForBackCallbacksWithPriorityOverlay() {
        startListeningForBackCallbacks(true);
    }

    public void stopListeningForBackCallbacks() {
        BackCallbackDelegate backCallbackDelegate = this.backCallbackDelegate;
        if (backCallbackDelegate != null) {
            backCallbackDelegate.stopListeningForBackCallbacks(this.view);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MaterialBackOrchestrator(@InterfaceC6391 MaterialBackHandler materialBackHandler, @InterfaceC6391 View view) {
        this.backCallbackDelegate = createBackCallbackDelegate();
        this.backHandler = materialBackHandler;
        this.view = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private void startListeningForBackCallbacks(boolean z) {
        BackCallbackDelegate backCallbackDelegate = this.backCallbackDelegate;
        if (backCallbackDelegate != null) {
            backCallbackDelegate.startListeningForBackCallbacks(this.backHandler, this.view, z);
        }
    }
}
