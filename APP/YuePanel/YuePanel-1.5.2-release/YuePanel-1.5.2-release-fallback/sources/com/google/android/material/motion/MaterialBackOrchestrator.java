package com.google.android.material.motion;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public final class MaterialBackOrchestrator {

    @Yue.InterfaceC4544
    private final com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate backCallbackDelegate;

    @Yue.InterfaceC4410
    private final com.google.android.material.motion.MaterialBackHandler backHandler;

    @Yue.InterfaceC4410
    private final android.view.View view;

    /* JADX INFO: renamed from: com.google.android.material.motion.MaterialBackOrchestrator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @Yue.InterfaceC5336(33)
    public static class Api33BackCallbackDelegate implements com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate {

        @Yue.InterfaceC4544
        private android.window.OnBackInvokedCallback onBackInvokedCallback;

        private Api33BackCallbackDelegate() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Api33BackCallbackDelegate(com.google.android.material.motion.MaterialBackOrchestrator.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public android.window.OnBackInvokedCallback createOnBackInvokedCallback(@Yue.InterfaceC4410 com.google.android.material.motion.MaterialBackHandler r2) {
                r1 = this;
                java.util.Objects.requireNonNull(r2)
                Yue.ۥۡ۟۟ۡ r0 = new Yue.ۥۡ۟۟ۡ
                r0.<init>(r2)
                return r0
        }

        public boolean isListeningForBackCallbacks() {
                r1 = this;
                android.window.OnBackInvokedCallback r0 = r1.onBackInvokedCallback
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        @Yue.InterfaceC1947
        public void startListeningForBackCallbacks(@Yue.InterfaceC4410 com.google.android.material.motion.MaterialBackHandler r2, @Yue.InterfaceC4410 android.view.View r3, boolean r4) {
                r1 = this;
                android.window.OnBackInvokedCallback r0 = r1.onBackInvokedCallback
                if (r0 == 0) goto L5
                return
            L5:
                android.window.OnBackInvokedDispatcher r3 = Yue.C3923.m15898(r3)
                if (r3 != 0) goto Lc
                return
            Lc:
                android.window.OnBackInvokedCallback r2 = r1.createOnBackInvokedCallback(r2)
                r1.onBackInvokedCallback = r2
                if (r4 == 0) goto L18
                r4 = 1000000(0xf4240, float:1.401298E-39)
                goto L19
            L18:
                r4 = 0
            L19:
                Yue.C0451.m1664(r3, r4, r2)
                return
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        @Yue.InterfaceC1947
        public void stopListeningForBackCallbacks(@Yue.InterfaceC4410 android.view.View r2) {
                r1 = this;
                android.window.OnBackInvokedDispatcher r2 = Yue.C3923.m15898(r2)
                if (r2 != 0) goto L7
                return
            L7:
                android.window.OnBackInvokedCallback r0 = r1.onBackInvokedCallback
                Yue.C0449.m1662(r2, r0)
                r2 = 0
                r1.onBackInvokedCallback = r2
                return
        }
    }

    @Yue.InterfaceC5336(34)
    public static class Api34BackCallbackDelegate extends com.google.android.material.motion.MaterialBackOrchestrator.Api33BackCallbackDelegate {


        private Api34BackCallbackDelegate() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        public /* synthetic */ Api34BackCallbackDelegate(com.google.android.material.motion.MaterialBackOrchestrator.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.Api33BackCallbackDelegate
        public android.window.OnBackInvokedCallback createOnBackInvokedCallback(@Yue.InterfaceC4410 com.google.android.material.motion.MaterialBackHandler r2) {
                r1 = this;
                com.google.android.material.motion.MaterialBackOrchestrator$Api34BackCallbackDelegate$1 r0 = new com.google.android.material.motion.MaterialBackOrchestrator$Api34BackCallbackDelegate$1
                r0.<init>(r1, r2)
                return r0
        }
    }

    public interface BackCallbackDelegate {
        void startListeningForBackCallbacks(@Yue.InterfaceC4410 com.google.android.material.motion.MaterialBackHandler r1, @Yue.InterfaceC4410 android.view.View r2, boolean r3);

        void stopListeningForBackCallbacks(@Yue.InterfaceC4410 android.view.View r1);
    }

    public <T extends android.view.View & com.google.android.material.motion.MaterialBackHandler> MaterialBackOrchestrator(@Yue.InterfaceC4410 T r2) {
            r1 = this;
            r0 = r2
            com.google.android.material.motion.MaterialBackHandler r0 = (com.google.android.material.motion.MaterialBackHandler) r0
            r1.<init>(r0, r2)
            return
    }

    public MaterialBackOrchestrator(@Yue.InterfaceC4410 com.google.android.material.motion.MaterialBackHandler r2, @Yue.InterfaceC4410 android.view.View r3) {
            r1 = this;
            r1.<init>()
            com.google.android.material.motion.MaterialBackOrchestrator$BackCallbackDelegate r0 = createBackCallbackDelegate()
            r1.backCallbackDelegate = r0
            r1.backHandler = r2
            r1.view = r3
            return
    }

    @Yue.InterfaceC4544
    private static com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate createBackCallbackDelegate() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            r2 = 0
            if (r0 < r1) goto Ld
            com.google.android.material.motion.MaterialBackOrchestrator$Api34BackCallbackDelegate r0 = new com.google.android.material.motion.MaterialBackOrchestrator$Api34BackCallbackDelegate
            r0.<init>(r2)
            return r0
        Ld:
            r1 = 33
            if (r0 < r1) goto L17
            com.google.android.material.motion.MaterialBackOrchestrator$Api33BackCallbackDelegate r0 = new com.google.android.material.motion.MaterialBackOrchestrator$Api33BackCallbackDelegate
            r0.<init>(r2)
            return r0
        L17:
            return r2
    }

    private void startListeningForBackCallbacks(boolean r4) {
            r3 = this;
            com.google.android.material.motion.MaterialBackOrchestrator$BackCallbackDelegate r0 = r3.backCallbackDelegate
            if (r0 == 0) goto Lb
            com.google.android.material.motion.MaterialBackHandler r1 = r3.backHandler
            android.view.View r2 = r3.view
            r0.startListeningForBackCallbacks(r1, r2, r4)
        Lb:
            return
    }

    public boolean shouldListenForBackCallbacks() {
            r1 = this;
            com.google.android.material.motion.MaterialBackOrchestrator$BackCallbackDelegate r0 = r1.backCallbackDelegate
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public void startListeningForBackCallbacks() {
            r1 = this;
            r0 = 0
            r1.startListeningForBackCallbacks(r0)
            return
    }

    public void startListeningForBackCallbacksWithPriorityOverlay() {
            r1 = this;
            r0 = 1
            r1.startListeningForBackCallbacks(r0)
            return
    }

    public void stopListeningForBackCallbacks() {
            r2 = this;
            com.google.android.material.motion.MaterialBackOrchestrator$BackCallbackDelegate r0 = r2.backCallbackDelegate
            if (r0 == 0) goto L9
            android.view.View r1 = r2.view
            r0.stopListeningForBackCallbacks(r1)
        L9:
            return
    }
}
