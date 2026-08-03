package androidx.lifecycle;

import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/ViewModelLazy;", "Landroidx/lifecycle/ViewModel;", "VM", "LYue/ۥ۠ۦۨۨ;", "LYue/ۥ۠ۦۢۢ;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStore;", "storeProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "<init>", "(LYue/ۥ۠ۦۢۢ;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;)V", "", "isInitialized", "()Z", "LYue/ۥ۠ۦۢۢ;", "LYue/ۥۣ۠۠ۨ;", "cached", "Landroidx/lifecycle/ViewModel;", "getValue", "()Landroidx/lifecycle/ViewModel;", "value", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
public final class ViewModelLazy<VM extends androidx.lifecycle.ViewModel> implements Yue.InterfaceC3574<VM> {

    @Yue.InterfaceC4543
    private VM cached;

    @Yue.InterfaceC4418
    private final Yue.InterfaceC2823<androidx.lifecycle.viewmodel.CreationExtras> extrasProducer;

    @Yue.InterfaceC4418
    private final Yue.InterfaceC2823<androidx.lifecycle.ViewModelProvider.Factory> factoryProducer;

    @Yue.InterfaceC4418
    private final Yue.InterfaceC2823<androidx.lifecycle.ViewModelStore> storeProducer;

    @Yue.InterfaceC4418
    private final Yue.InterfaceC3435<VM> viewModelClass;

    /* JADX INFO: renamed from: androidx.lifecycle.ViewModelLazy$1, reason: invalid class name */
    @Yue.InterfaceC4201(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras$Empty;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends Yue.AbstractC3560 implements Yue.InterfaceC2823<androidx.lifecycle.viewmodel.CreationExtras.Empty> {
        public static final androidx.lifecycle.ViewModelLazy.AnonymousClass1 INSTANCE = null;

        static {
                androidx.lifecycle.ViewModelLazy$1 r0 = new androidx.lifecycle.ViewModelLazy$1
                r0.<init>()
                androidx.lifecycle.ViewModelLazy.AnonymousClass1.INSTANCE = r0
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // Yue.InterfaceC2823
        @Yue.InterfaceC4418
        public final androidx.lifecycle.viewmodel.CreationExtras.Empty invoke() {
                r1 = this;
                androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
                return r0
        }

        @Override // Yue.InterfaceC2823
        public /* bridge */ /* synthetic */ androidx.lifecycle.viewmodel.CreationExtras.Empty invoke() {
                r1 = this;
                androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = r1.invoke()
                return r0
        }
    }

    @Yue.InterfaceC3422
    public ViewModelLazy(@Yue.InterfaceC4418 Yue.InterfaceC3435<VM> r9, @Yue.InterfaceC4418 Yue.InterfaceC2823<? extends androidx.lifecycle.ViewModelStore> r10, @Yue.InterfaceC4418 Yue.InterfaceC2823<? extends androidx.lifecycle.ViewModelProvider.Factory> r11) {
            r8 = this;
            java.lang.String r0 = "viewModelClass"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "storeProducer"
            Yue.C3329.m13906(r10, r0)
            java.lang.String r0 = "factoryProducer"
            Yue.C3329.m13906(r11, r0)
            r6 = 8
            r7 = 0
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
    }

    @Yue.InterfaceC3422
    public ViewModelLazy(@Yue.InterfaceC4418 Yue.InterfaceC3435<VM> r2, @Yue.InterfaceC4418 Yue.InterfaceC2823<? extends androidx.lifecycle.ViewModelStore> r3, @Yue.InterfaceC4418 Yue.InterfaceC2823<? extends androidx.lifecycle.ViewModelProvider.Factory> r4, @Yue.InterfaceC4418 Yue.InterfaceC2823<? extends androidx.lifecycle.viewmodel.CreationExtras> r5) {
            r1 = this;
            java.lang.String r0 = "viewModelClass"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "storeProducer"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "factoryProducer"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "extrasProducer"
            Yue.C3329.m13906(r5, r0)
            r1.<init>()
            r1.viewModelClass = r2
            r1.storeProducer = r3
            r1.factoryProducer = r4
            r1.extrasProducer = r5
            return
    }

    public /* synthetic */ ViewModelLazy(Yue.InterfaceC3435 r1, Yue.InterfaceC2823 r2, Yue.InterfaceC2823 r3, Yue.InterfaceC2823 r4, int r5, Yue.C1769 r6) {
            r0 = this;
            r5 = r5 & 8
            if (r5 == 0) goto L6
            androidx.lifecycle.ViewModelLazy$1 r4 = androidx.lifecycle.ViewModelLazy.AnonymousClass1.INSTANCE
        L6:
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // Yue.InterfaceC3574
    @Yue.InterfaceC4418
    public VM getValue() {
            r4 = this;
            VM extends androidx.lifecycle.ViewModel r0 = r4.cached
            if (r0 != 0) goto L2d
            Yue.ۥۣ۠۠ۨ<androidx.lifecycle.ViewModelProvider$Factory> r0 = r4.factoryProducer
            java.lang.Object r0 = r0.invoke()
            androidx.lifecycle.ViewModelProvider$Factory r0 = (androidx.lifecycle.ViewModelProvider.Factory) r0
            Yue.ۥۣ۠۠ۨ<androidx.lifecycle.ViewModelStore> r1 = r4.storeProducer
            java.lang.Object r1 = r1.invoke()
            androidx.lifecycle.ViewModelStore r1 = (androidx.lifecycle.ViewModelStore) r1
            androidx.lifecycle.ViewModelProvider r2 = new androidx.lifecycle.ViewModelProvider
            Yue.ۥۣ۠۠ۨ<androidx.lifecycle.viewmodel.CreationExtras> r3 = r4.extrasProducer
            java.lang.Object r3 = r3.invoke()
            androidx.lifecycle.viewmodel.CreationExtras r3 = (androidx.lifecycle.viewmodel.CreationExtras) r3
            r2.<init>(r1, r0, r3)
            Yue.ۥ۠ۦۢۢ<VM extends androidx.lifecycle.ViewModel> r0 = r4.viewModelClass
            java.lang.Class r0 = Yue.C3413.m14192(r0)
            androidx.lifecycle.ViewModel r0 = r2.get(r0)
            r4.cached = r0
        L2d:
            return r0
    }

    @Override // Yue.InterfaceC3574
    public /* bridge */ /* synthetic */ java.lang.Object getValue() {
            r1 = this;
            androidx.lifecycle.ViewModel r0 = r1.getValue()
            return r0
    }

    @Override // Yue.InterfaceC3574
    public boolean isInitialized() {
            r1 = this;
            VM extends androidx.lifecycle.ViewModel r0 = r1.cached
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
