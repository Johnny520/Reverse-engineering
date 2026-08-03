package androidx.activity.result;

import Yue.AbstractC3115;
import Yue.AbstractC3138;
import Yue.AbstractC7000;
import Yue.C3105;
import Yue.C3112;
import Yue.InterfaceC3113;
import Yue.InterfaceC5922;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Lifecycle;
import android.view.LifecycleEventObserver;
import android.view.LifecycleOwner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f25599 = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String f25600 = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final String f25601 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final String f25602 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final String f25603 = "ActivityResultRegistry";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f25604 = 65536;

    /* JADX INFO: renamed from: ۥ */
    public final Map<Integer, String> f3594 = new HashMap();

    /* JADX INFO: renamed from: ۥ۟ */
    public final Map<String, Integer> f3595 = new HashMap();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Map<String, C8628> f25605 = new HashMap();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public ArrayList<String> f25606 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final transient Map<String, C8627<?>> f25607 = new HashMap();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Map<String, Object> f25608 = new HashMap();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final Bundle f25609 = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: androidx.activity.result.ActivityResultRegistry$ۥ */
    public class C1575<I> extends AbstractC3138<I> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ String f3596;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ AbstractC3115 f3597;

        public C1575(String str, AbstractC3115 abstractC3115) {
            this.f3596 = str;
            this.f3597 = abstractC3115;
        }

        @Override // Yue.AbstractC3138
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public AbstractC3115<I, ?> mo227() {
            return this.f3597;
        }

        @Override // Yue.AbstractC3138
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo6415(I i, @InterfaceC6490 C3105 c3105) throws Exception {
            Integer num = ActivityResultRegistry.this.f3595.get(this.f3596);
            if (num != null) {
                ActivityResultRegistry.this.f25606.add(this.f3596);
                try {
                    ActivityResultRegistry.this.mo28624(num.intValue(), this.f3597, i, c3105);
                    return;
                } catch (Exception e) {
                    ActivityResultRegistry.this.f25606.remove(this.f3596);
                    throw e;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f3597 + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // Yue.AbstractC3138
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo6416() {
            ActivityResultRegistry.this.m28659(this.f3596);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: androidx.activity.result.ActivityResultRegistry$ۥ۟ */
    public class C1576<I> extends AbstractC3138<I> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ String f3598;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ AbstractC3115 f3599;

        public C1576(String str, AbstractC3115 abstractC3115) {
            this.f3598 = str;
            this.f3599 = abstractC3115;
        }

        @Override // Yue.AbstractC3138
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public AbstractC3115<I, ?> mo227() {
            return this.f3599;
        }

        @Override // Yue.AbstractC3138
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo6415(I i, @InterfaceC6490 C3105 c3105) throws Exception {
            Integer num = ActivityResultRegistry.this.f3595.get(this.f3598);
            if (num != null) {
                ActivityResultRegistry.this.f25606.add(this.f3598);
                try {
                    ActivityResultRegistry.this.mo28624(num.intValue(), this.f3599, i, c3105);
                    return;
                } catch (Exception e) {
                    ActivityResultRegistry.this.f25606.remove(this.f3598);
                    throw e;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f3599 + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // Yue.AbstractC3138
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo6416() {
            ActivityResultRegistry.this.m28659(this.f3598);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.ActivityResultRegistry$ۥ۟۟, reason: contains not printable characters */
    public static class C8627<O> {

        /* JADX INFO: renamed from: ۥ */
        public final InterfaceC3113<O> f3600;

        /* JADX INFO: renamed from: ۥ۟ */
        public final AbstractC3115<?, O> f3601;

        public C8627(InterfaceC3113<O> interfaceC3113, AbstractC3115<?, O> abstractC3115) {
            this.f3600 = interfaceC3113;
            this.f3601 = abstractC3115;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.ActivityResultRegistry$ۥ۟۟۟, reason: contains not printable characters */
    public static class C8628 {

        /* JADX INFO: renamed from: ۥ */
        public final Lifecycle f3602;

        /* JADX INFO: renamed from: ۥ۟ */
        public final ArrayList<LifecycleEventObserver> f3603 = new ArrayList<>();

        public C8628(@InterfaceC6391 Lifecycle lifecycle) {
            this.f3602 = lifecycle;
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4588(@InterfaceC6391 LifecycleEventObserver lifecycleEventObserver) {
            this.f3602.addObserver(lifecycleEventObserver);
            this.f3603.add(lifecycleEventObserver);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4589() {
            Iterator<LifecycleEventObserver> it = this.f3603.iterator();
            while (it.hasNext()) {
                this.f3602.removeObserver(it.next());
            }
            this.f3603.clear();
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m4586(int i, String str) {
        this.f3594.put(Integer.valueOf(i), str);
        this.f3595.put(str, Integer.valueOf(i));
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m4587(int i, int i2, @InterfaceC6490 Intent intent) {
        String str = this.f3594.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        m28652(str, i2, intent, this.f25607.get(str));
        return true;
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final <O> boolean m28651(int i, @SuppressLint({"UnknownNullness"}) O o) {
        InterfaceC3113<?> interfaceC3113;
        String str = this.f3594.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C8627<?> c8627 = this.f25607.get(str);
        if (c8627 == null || (interfaceC3113 = c8627.f3600) == null) {
            this.f25609.remove(str);
            this.f25608.put(str, o);
            return true;
        }
        if (!this.f25606.remove(str)) {
            return true;
        }
        interfaceC3113.mo215(o);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final <O> void m28652(String str, int i, @InterfaceC6490 Intent intent, @InterfaceC6490 C8627<O> c8627) {
        if (c8627 == null || c8627.f3600 == null || !this.f25606.contains(str)) {
            this.f25608.remove(str);
            this.f25609.putParcelable(str, new C3112(i, intent));
        } else {
            c8627.f3600.mo215(c8627.f3601.mo6351(i, intent));
            this.f25606.remove(str);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m28653() {
        int iMo5817 = AbstractC7000.f21141.mo5817(2147418112);
        while (true) {
            int i = iMo5817 + 65536;
            if (!this.f3594.containsKey(Integer.valueOf(i))) {
                return i;
            }
            iMo5817 = AbstractC7000.f21141.mo5817(2147418112);
        }
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public abstract <I, O> void mo28624(int i, @InterfaceC6391 AbstractC3115<I, O> abstractC3115, @SuppressLint({"UnknownNullness"}) I i2, @InterfaceC6490 C3105 c3105);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m28654(@InterfaceC6490 Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f25599);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f25600);
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f25606 = bundle.getStringArrayList(f25601);
        this.f25609.putAll(bundle.getBundle(f25602));
        for (int i = 0; i < stringArrayList.size(); i++) {
            String str = stringArrayList.get(i);
            if (this.f3595.containsKey(str)) {
                Integer numRemove = this.f3595.remove(str);
                if (!this.f25609.containsKey(str)) {
                    this.f3594.remove(numRemove);
                }
            }
            m4586(integerArrayList.get(i).intValue(), stringArrayList.get(i));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m28655(@InterfaceC6391 Bundle bundle) {
        bundle.putIntegerArrayList(f25599, new ArrayList<>(this.f3595.values()));
        bundle.putStringArrayList(f25600, new ArrayList<>(this.f3595.keySet()));
        bundle.putStringArrayList(f25601, new ArrayList<>(this.f25606));
        bundle.putBundle(f25602, (Bundle) this.f25609.clone());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: Yue.ۥ۟۟ۨ۠<O> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final <I, O> AbstractC3138<I> m28656(@InterfaceC6391 String str, @InterfaceC6391 AbstractC3115<I, O> abstractC3115, @InterfaceC6391 InterfaceC3113<O> interfaceC3113) {
        m28658(str);
        this.f25607.put(str, new C8627<>(interfaceC3113, abstractC3115));
        if (this.f25608.containsKey(str)) {
            Object obj = this.f25608.get(str);
            this.f25608.remove(str);
            interfaceC3113.mo215(obj);
        }
        C3112 c3112 = (C3112) this.f25609.getParcelable(str);
        if (c3112 != null) {
            this.f25609.remove(str);
            interfaceC3113.mo215(abstractC3115.mo6351(c3112.m212(), c3112.m211()));
        }
        return new C1576(str, abstractC3115);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final <I, O> AbstractC3138<I> m28657(@InterfaceC6391 final String str, @InterfaceC6391 LifecycleOwner lifecycleOwner, @InterfaceC6391 final AbstractC3115<I, O> abstractC3115, @InterfaceC6391 final InterfaceC3113<O> interfaceC3113) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.");
        }
        m28658(str);
        C8628 c8628 = this.f25605.get(str);
        if (c8628 == null) {
            c8628 = new C8628(lifecycle);
        }
        c8628.m4588(new LifecycleEventObserver() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // android.view.LifecycleEventObserver
            public void onStateChanged(@InterfaceC6391 LifecycleOwner lifecycleOwner2, @InterfaceC6391 Lifecycle.Event event) {
                if (!Lifecycle.Event.ON_START.equals(event)) {
                    if (Lifecycle.Event.ON_STOP.equals(event)) {
                        ActivityResultRegistry.this.f25607.remove(str);
                        return;
                    } else {
                        if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                            ActivityResultRegistry.this.m28659(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f25607.put(str, new C8627<>(interfaceC3113, abstractC3115));
                if (ActivityResultRegistry.this.f25608.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f25608.get(str);
                    ActivityResultRegistry.this.f25608.remove(str);
                    interfaceC3113.mo215(obj);
                }
                C3112 c3112 = (C3112) ActivityResultRegistry.this.f25609.getParcelable(str);
                if (c3112 != null) {
                    ActivityResultRegistry.this.f25609.remove(str);
                    interfaceC3113.mo215(abstractC3115.mo6351(c3112.m212(), c3112.m211()));
                }
            }
        });
        this.f25605.put(str, c8628);
        return new C1575(str, abstractC3115);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m28658(String str) {
        if (this.f3595.get(str) != null) {
            return;
        }
        m4586(m28653(), str);
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m28659(@InterfaceC6391 String str) {
        Integer numRemove;
        if (!this.f25606.contains(str) && (numRemove = this.f3595.remove(str)) != null) {
            this.f3594.remove(numRemove);
        }
        this.f25607.remove(str);
        if (this.f25608.containsKey(str)) {
            Log.w(f25603, "Dropping pending result for request " + str + ": " + this.f25608.get(str));
            this.f25608.remove(str);
        }
        if (this.f25609.containsKey(str)) {
            Log.w(f25603, "Dropping pending result for request " + str + ": " + this.f25609.getParcelable(str));
            this.f25609.remove(str);
        }
        C8628 c8628 = this.f25605.get(str);
        if (c8628 != null) {
            c8628.m4589();
            this.f25605.remove(str);
        }
    }
}
