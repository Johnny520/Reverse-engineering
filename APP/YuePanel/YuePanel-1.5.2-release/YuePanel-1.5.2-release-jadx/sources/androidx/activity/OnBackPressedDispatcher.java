package androidx.activity;

import Yue.AbstractC5673;
import Yue.AbstractC6546;
import Yue.C3383;
import Yue.C3505;
import Yue.C4335;
import Yue.C5153;
import Yue.C5499;
import Yue.C6411;
import Yue.C8107;
import Yue.InterfaceC3664;
import Yue.InterfaceC4144;
import Yue.InterfaceC4482;
import Yue.InterfaceC5122;
import Yue.InterfaceC5124;
import Yue.InterfaceC5573;
import Yue.InterfaceC5922;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7113;
import Yue.InterfaceC7507;
import Yue.InterfaceC8392;
import android.os.Build;
import android.view.Lifecycle;
import android.view.LifecycleEventObserver;
import android.view.LifecycleOwner;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nOnBackPressedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,430:1\n1747#2,3:431\n533#2,6:434\n533#2,6:440\n533#2,6:446\n533#2,6:452\n*S KotlinDebug\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n*L\n114#1:431,3\n233#1:434,6\n251#1:440,6\n271#1:446,6\n290#1:452,6\n*E\n"})
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6489
    public final Runnable f3588;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6489
    public final InterfaceC4144<Boolean> f3589;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C3383<AbstractC6546> f25580;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public AbstractC6546 f25581;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public OnBackInvokedCallback f25582;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public OnBackInvokedDispatcher f25583;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f25584;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f25585;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/LifecycleEventObserver;", "LYue/ۥۣ۟ۨ;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "LYue/ۥۣۡۡۢ;", "onBackPressedCallback", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/Lifecycle;LYue/ۥۣۡۡۢ;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", C6411.f16276, "LYue/ۥۣۢ۠ۤ;", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "cancel", "()V", "ۥۣ۟۟۠", "Landroidx/lifecycle/Lifecycle;", "ۥ۟۟۠ۤ", "LYue/ۥۣۡۡۢ;", "ۥ۟۟۠ۥ", "LYue/ۥۣ۟ۨ;", "currentCancellable", "activity_release"}, k = 1, mv = {1, 8, 0})
    public final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, InterfaceC3664 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters and from kotlin metadata */
        @InterfaceC6399
        public final Lifecycle lifecycle;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters and from kotlin metadata */
        @InterfaceC6399
        public final AbstractC6546 onBackPressedCallback;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters and from kotlin metadata */
        @InterfaceC6489
        public InterfaceC3664 currentCancellable;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ OnBackPressedDispatcher f25589;

        public LifecycleOnBackPressedCancellable(@InterfaceC6399 OnBackPressedDispatcher onBackPressedDispatcher, @InterfaceC6399 Lifecycle lifecycle, AbstractC6546 abstractC6546) {
            C5499.m17103(lifecycle, "lifecycle");
            C5499.m17103(abstractC6546, "onBackPressedCallback");
            this.f25589 = onBackPressedDispatcher;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = abstractC6546;
            lifecycle.addObserver(this);
        }

        @Override // Yue.InterfaceC3664
        public void cancel() {
            this.lifecycle.removeObserver(this);
            this.onBackPressedCallback.removeCancellable(this);
            InterfaceC3664 interfaceC3664 = this.currentCancellable;
            if (interfaceC3664 != null) {
                interfaceC3664.cancel();
            }
            this.currentCancellable = null;
        }

        @Override // android.view.LifecycleEventObserver
        public void onStateChanged(@InterfaceC6399 LifecycleOwner source, @InterfaceC6399 Lifecycle.Event event) {
            C5499.m17103(source, "source");
            C5499.m17103(event, C6411.f16276);
            if (event == Lifecycle.Event.ON_START) {
                this.currentCancellable = this.f25589.m28634(this.onBackPressedCallback);
                return;
            }
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC3664 interfaceC3664 = this.currentCancellable;
                if (interfaceC3664 != null) {
                    interfaceC3664.cancel();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥ */
    public static final class C1571 extends AbstractC5673 implements InterfaceC5124<C3505, C8107> {
        public C1571() {
            super(1);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(C3505 c3505) {
            m28646(c3505);
            return C8107.f3222;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m28646(@InterfaceC6399 C3505 c3505) {
            C5499.m17103(c3505, "backEvent");
            OnBackPressedDispatcher.this.m28642(c3505);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥ۟ */
    public static final class C1572 extends AbstractC5673 implements InterfaceC5124<C3505, C8107> {
        public C1572() {
            super(1);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(C3505 c3505) {
            m28647(c3505);
            return C8107.f3222;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m28647(@InterfaceC6399 C3505 c3505) {
            C5499.m17103(c3505, "backEvent");
            OnBackPressedDispatcher.this.m28641(c3505);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥ۟۟, reason: contains not printable characters */
    public static final class C8619 extends AbstractC5673 implements InterfaceC5122<C8107> {
        public C8619() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5122
        public /* bridge */ /* synthetic */ C8107 invoke() {
            invoke2();
            return C8107.f3222;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method Yue.ۥۣ۠۠ۨ.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBackPressedDispatcher.this.m28640();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C8620 extends AbstractC5673 implements InterfaceC5122<C8107> {
        public C8620() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5122
        public /* bridge */ /* synthetic */ C8107 invoke() {
            invoke2();
            return C8107.f3222;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method Yue.ۥۣ۠۠ۨ.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBackPressedDispatcher.this.m28639();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C8621 extends AbstractC5673 implements InterfaceC5122<C8107> {
        public C8621() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5122
        public /* bridge */ /* synthetic */ C8107 invoke() {
            invoke2();
            return C8107.f3222;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method Yue.ۥۣ۠۠ۨ.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBackPressedDispatcher.this.m28640();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7113(33)
    public static final class C8622 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public static final C8622 f3590 = new C8622();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final void m28648(InterfaceC5122 interfaceC5122) {
            C5499.m17103(interfaceC5122, "$onBackInvoked");
            interfaceC5122.invoke();
        }

        @InterfaceC6399
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public final OnBackInvokedCallback m4584(@InterfaceC6399 final InterfaceC5122<C8107> interfaceC5122) {
            C5499.m17103(interfaceC5122, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: Yue.ۥۣۣۡۡ
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.C8622.m28648(interfaceC5122);
                }
            };
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m28649(@InterfaceC6399 Object obj, int i, @InterfaceC6399 Object obj2) {
            C5499.m17103(obj, "dispatcher");
            C5499.m17103(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m28650(@InterfaceC6399 Object obj, @InterfaceC6399 Object obj2) {
            C5499.m17103(obj, "dispatcher");
            C5499.m17103(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7113(34)
    public static final class C8623 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public static final C8623 f3591 = new C8623();

        /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟ۡ$ۥ */
        public static final class C1573 implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: ۥ */
            public final /* synthetic */ InterfaceC5124<C3505, C8107> f3592;

            /* JADX INFO: renamed from: ۥ۟ */
            public final /* synthetic */ InterfaceC5124<C3505, C8107> f3593;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC5122<C8107> f25595;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC5122<C8107> f25596;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۡ۟<? super Yue.ۥ۟ۢۤۥ, Yue.ۥۣۢ۠ۤ> */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۡ۟<? super Yue.ۥ۟ۢۤۥ, Yue.ۥۣۢ۠ۤ> */
            /* JADX WARN: Multi-variable type inference failed */
            public C1573(InterfaceC5124<? super C3505, C8107> interfaceC5124, InterfaceC5124<? super C3505, C8107> interfaceC51242, InterfaceC5122<C8107> interfaceC5122, InterfaceC5122<C8107> interfaceC51222) {
                this.f3592 = interfaceC5124;
                this.f3593 = interfaceC51242;
                this.f25595 = interfaceC5122;
                this.f25596 = interfaceC51222;
            }

            public void onBackCancelled() {
                this.f25596.invoke();
            }

            public void onBackInvoked() {
                this.f25595.invoke();
            }

            public void onBackProgressed(@InterfaceC6399 BackEvent backEvent) {
                C5499.m17103(backEvent, "backEvent");
                this.f3593.invoke(new C3505(backEvent));
            }

            public void onBackStarted(@InterfaceC6399 BackEvent backEvent) {
                C5499.m17103(backEvent, "backEvent");
                this.f3592.invoke(new C3505(backEvent));
            }
        }

        @InterfaceC6399
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public final OnBackInvokedCallback m4585(@InterfaceC6399 InterfaceC5124<? super C3505, C8107> interfaceC5124, @InterfaceC6399 InterfaceC5124<? super C3505, C8107> interfaceC51242, @InterfaceC6399 InterfaceC5122<C8107> interfaceC5122, @InterfaceC6399 InterfaceC5122<C8107> interfaceC51222) {
            C5499.m17103(interfaceC5124, "onBackStarted");
            C5499.m17103(interfaceC51242, "onBackProgressed");
            C5499.m17103(interfaceC5122, "onBackInvoked");
            C5499.m17103(interfaceC51222, "onBackCancelled");
            return new C1573(interfaceC5124, interfaceC51242, interfaceC5122, interfaceC51222);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final class C8624 implements InterfaceC3664 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final AbstractC6546 f25597;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ OnBackPressedDispatcher f25598;

        public C8624(@InterfaceC6399 OnBackPressedDispatcher onBackPressedDispatcher, AbstractC6546 abstractC6546) {
            C5499.m17103(abstractC6546, "onBackPressedCallback");
            this.f25598 = onBackPressedDispatcher;
            this.f25597 = abstractC6546;
        }

        @Override // Yue.InterfaceC3664
        public void cancel() {
            this.f25598.f25580.remove(this.f25597);
            if (C5499.m17094(this.f25598.f25581, this.f25597)) {
                this.f25597.handleOnBackCancelled();
                this.f25598.f25581 = null;
            }
            this.f25597.removeCancellable(this);
            InterfaceC5122<C8107> enabledChangedCallback$activity_release = this.f25597.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.f25597.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥۣ۟۟۟, reason: contains not printable characters */
    public /* synthetic */ class C8625 extends C5153 implements InterfaceC5122<C8107> {
        public C8625(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5122
        public /* bridge */ /* synthetic */ C8107 invoke() {
            invoke2();
            return C8107.f3222;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method Yue.ۥۣ۠۠ۨ.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((OnBackPressedDispatcher) this.receiver).m28645();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public /* synthetic */ class C8626 extends C5153 implements InterfaceC5122<C8107> {
        public C8626(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5122
        public /* bridge */ /* synthetic */ C8107 invoke() {
            invoke2();
            return C8107.f3222;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method Yue.ۥۣ۠۠ۨ.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((OnBackPressedDispatcher) this.receiver).m28645();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5573
    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m28632(@InterfaceC6399 AbstractC6546 abstractC6546) {
        C5499.m17103(abstractC6546, "onBackPressedCallback");
        m28634(abstractC6546);
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m28633(@InterfaceC6399 LifecycleOwner lifecycleOwner, @InterfaceC6399 AbstractC6546 abstractC6546) {
        C5499.m17103(lifecycleOwner, "owner");
        C5499.m17103(abstractC6546, "onBackPressedCallback");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            return;
        }
        abstractC6546.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, abstractC6546));
        m28645();
        abstractC6546.setEnabledChangedCallback$activity_release(new C8625(this));
    }

    @InterfaceC6399
    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final InterfaceC3664 m28634(@InterfaceC6399 AbstractC6546 abstractC6546) {
        C5499.m17103(abstractC6546, "onBackPressedCallback");
        this.f25580.add(abstractC6546);
        C8624 c8624 = new C8624(this, abstractC6546);
        abstractC6546.addCancellable(c8624);
        m28645();
        abstractC6546.setEnabledChangedCallback$activity_release(new C8626(this));
        return c8624;
    }

    @InterfaceC8392
    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m28635() {
        m28639();
    }

    @InterfaceC8392
    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m28636(@InterfaceC6399 C3505 c3505) {
        C5499.m17103(c3505, "backEvent");
        m28641(c3505);
    }

    @InterfaceC8392
    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m28637(@InterfaceC6399 C3505 c3505) {
        C5499.m17103(c3505, "backEvent");
        m28642(c3505);
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final boolean m28638() {
        return this.f25585;
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m28639() {
        AbstractC6546 abstractC6546Previous;
        C3383<AbstractC6546> c3383 = this.f25580;
        ListIterator<AbstractC6546> listIterator = c3383.listIterator(c3383.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                abstractC6546Previous = null;
                break;
            } else {
                abstractC6546Previous = listIterator.previous();
                if (abstractC6546Previous.isEnabled()) {
                    break;
                }
            }
        }
        AbstractC6546 abstractC6546 = abstractC6546Previous;
        this.f25581 = null;
        if (abstractC6546 != null) {
            abstractC6546.handleOnBackCancelled();
        }
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m28640() {
        AbstractC6546 abstractC6546Previous;
        C3383<AbstractC6546> c3383 = this.f25580;
        ListIterator<AbstractC6546> listIterator = c3383.listIterator(c3383.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                abstractC6546Previous = null;
                break;
            } else {
                abstractC6546Previous = listIterator.previous();
                if (abstractC6546Previous.isEnabled()) {
                    break;
                }
            }
        }
        AbstractC6546 abstractC6546 = abstractC6546Previous;
        this.f25581 = null;
        if (abstractC6546 != null) {
            abstractC6546.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f3588;
        if (runnable != null) {
            runnable.run();
        }
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m28641(C3505 c3505) {
        AbstractC6546 abstractC6546Previous;
        C3383<AbstractC6546> c3383 = this.f25580;
        ListIterator<AbstractC6546> listIterator = c3383.listIterator(c3383.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                abstractC6546Previous = null;
                break;
            } else {
                abstractC6546Previous = listIterator.previous();
                if (abstractC6546Previous.isEnabled()) {
                    break;
                }
            }
        }
        AbstractC6546 abstractC6546 = abstractC6546Previous;
        if (abstractC6546 != null) {
            abstractC6546.handleOnBackProgressed(c3505);
        }
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m28642(C3505 c3505) {
        AbstractC6546 abstractC6546Previous;
        C3383<AbstractC6546> c3383 = this.f25580;
        ListIterator<AbstractC6546> listIterator = c3383.listIterator(c3383.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                abstractC6546Previous = null;
                break;
            } else {
                abstractC6546Previous = listIterator.previous();
                if (abstractC6546Previous.isEnabled()) {
                    break;
                }
            }
        }
        AbstractC6546 abstractC6546 = abstractC6546Previous;
        this.f25581 = abstractC6546;
        if (abstractC6546 != null) {
            abstractC6546.handleOnBackStarted(c3505);
        }
    }

    @InterfaceC7113(33)
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m28643(@InterfaceC6399 OnBackInvokedDispatcher onBackInvokedDispatcher) {
        C5499.m17103(onBackInvokedDispatcher, "invoker");
        this.f25583 = onBackInvokedDispatcher;
        m28644(this.f25585);
    }

    @InterfaceC7113(33)
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m28644(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f25583;
        OnBackInvokedCallback onBackInvokedCallback = this.f25582;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z && !this.f25584) {
            C8622.f3590.m28649(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f25584 = true;
        } else {
            if (z || !this.f25584) {
                return;
            }
            C8622.f3590.m28650(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f25584 = false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m28645() {
        boolean z = this.f25585;
        C3383<AbstractC6546> c3383 = this.f25580;
        boolean z2 = false;
        if (!(c3383 instanceof Collection) || !c3383.isEmpty()) {
            Iterator<AbstractC6546> it = c3383.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().isEnabled()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f25585 = z2;
        if (z2 != z) {
            InterfaceC4144<Boolean> interfaceC4144 = this.f3589;
            if (interfaceC4144 != null) {
                interfaceC4144.accept(Boolean.valueOf(z2));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                m28644(z2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public OnBackPressedDispatcher(@InterfaceC6489 Runnable runnable, @InterfaceC6489 InterfaceC4144<Boolean> interfaceC4144) {
        this.f3588 = runnable;
        this.f3589 = interfaceC4144;
        this.f25580 = new C3383<>();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f25582 = i >= 34 ? C8623.f3591.m4585(new C1571(), new C1572(), new C8619(), new C8620()) : C8622.f3590.m4584(new C8621());
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Runnable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Runnable) : (r1v0 java.lang.Runnable))
 A[MD:(java.lang.Runnable):void (m)] (LINE:10) call: androidx.activity.OnBackPressedDispatcher.<init>(java.lang.Runnable):void type: THIS */
    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i, C4335 c4335) {
        this((i & 1) != 0 ? null : runnable);
    }

    @InterfaceC5573
    public OnBackPressedDispatcher(@InterfaceC6489 Runnable runnable) {
        this(runnable, null);
    }
}
