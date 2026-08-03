package Yue;

import android.annotation.SuppressLint;
import android.view.Lifecycle;
import android.view.LifecycleEventObserver;
import android.view.LifecycleOwner;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6154 {

    /* JADX INFO: renamed from: ۥ */
    public final Runnable f1859;

    /* JADX INFO: renamed from: ۥ۟ */
    public final CopyOnWriteArrayList<InterfaceC6165> f1860 = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Map<InterfaceC6165, C0918> f15057 = new HashMap();

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۢ$ۥ */
    public static class C0918 {

        /* JADX INFO: renamed from: ۥ */
        public final Lifecycle f1861;

        /* JADX INFO: renamed from: ۥ۟ */
        public LifecycleEventObserver f1862;

        public C0918(@InterfaceC6391 Lifecycle lifecycle, @InterfaceC6391 LifecycleEventObserver lifecycleEventObserver) {
            this.f1861 = lifecycle;
            this.f1862 = lifecycleEventObserver;
            lifecycle.addObserver(lifecycleEventObserver);
        }

        /* JADX INFO: renamed from: ۥ */
        public void m2656() {
            this.f1861.removeObserver(this.f1862);
            this.f1862 = null;
        }
    }

    public C6154(@InterfaceC6391 Runnable runnable) {
        this.f1859 = runnable;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m18957(@InterfaceC6391 InterfaceC6165 interfaceC6165) {
        this.f1860.add(interfaceC6165);
        this.f1859.run();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m18958(@InterfaceC6391 final InterfaceC6165 interfaceC6165, @InterfaceC6391 LifecycleOwner lifecycleOwner) {
        m18957(interfaceC6165);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C0918 c0918Remove = this.f15057.remove(interfaceC6165);
        if (c0918Remove != null) {
            c0918Remove.m2656();
        }
        this.f15057.put(interfaceC6165, new C0918(lifecycle, new LifecycleEventObserver() { // from class: Yue.ۥۡ۠ۦۡ
            @Override // android.view.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                this.f15055.m18960(interfaceC6165, lifecycleOwner2, event);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m18959(@InterfaceC6391 final InterfaceC6165 interfaceC6165, @InterfaceC6391 LifecycleOwner lifecycleOwner, @InterfaceC6391 final Lifecycle.State state) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C0918 c0918Remove = this.f15057.remove(interfaceC6165);
        if (c0918Remove != null) {
            c0918Remove.m2656();
        }
        this.f15057.put(interfaceC6165, new C0918(lifecycle, new LifecycleEventObserver() { // from class: Yue.ۥۡ۠ۦ۠
            @Override // android.view.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                this.f15052.m18961(state, interfaceC6165, lifecycleOwner2, event);
            }
        }));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ void m18960(InterfaceC6165 interfaceC6165, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            m18966(interfaceC6165);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final /* synthetic */ void m18961(Lifecycle.State state, InterfaceC6165 interfaceC6165, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.upTo(state)) {
            m18957(interfaceC6165);
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            m18966(interfaceC6165);
        } else if (event == Lifecycle.Event.downFrom(state)) {
            this.f1860.remove(interfaceC6165);
            this.f1859.run();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m18962(@InterfaceC6391 Menu menu, @InterfaceC6391 MenuInflater menuInflater) {
        Iterator<InterfaceC6165> it = this.f1860.iterator();
        while (it.hasNext()) {
            it.next().mo19030(menu, menuInflater);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m18963(@InterfaceC6391 Menu menu) {
        Iterator<InterfaceC6165> it = this.f1860.iterator();
        while (it.hasNext()) {
            it.next().mo2670(menu);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m18964(@InterfaceC6391 MenuItem menuItem) {
        Iterator<InterfaceC6165> it = this.f1860.iterator();
        while (it.hasNext()) {
            if (it.next().mo2669(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m18965(@InterfaceC6391 Menu menu) {
        Iterator<InterfaceC6165> it = this.f1860.iterator();
        while (it.hasNext()) {
            it.next().mo19031(menu);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m18966(@InterfaceC6391 InterfaceC6165 interfaceC6165) {
        this.f1860.remove(interfaceC6165);
        C0918 c0918Remove = this.f15057.remove(interfaceC6165);
        if (c0918Remove != null) {
            c0918Remove.m2656();
        }
        this.f1859.run();
    }
}
