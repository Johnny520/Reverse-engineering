package Yue;

import Yue.AbstractC5748;
import Yue.C5746;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.LifecycleOwner;
import android.view.MutableLiveData;
import android.view.Observer;
import android.view.ViewModel;
import android.view.ViewModelProvider;
import android.view.ViewModelStore;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5749 extends AbstractC5748 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f14256 = "LoaderManager";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean f14257;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public final LifecycleOwner f1650;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6391
    public final C5750 f1651;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۧ$ۥ */
    public static class C0860<D> extends MutableLiveData<D> implements C5746.InterfaceC5747<D> {

        /* JADX INFO: renamed from: ۥ */
        public final int f1652;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6490
        public final Bundle f1653;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6391
        public final C5746<D> f14258;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public LifecycleOwner f14259;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public C0861<D> f14260;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public C5746<D> f14261;

        public C0860(int i, @InterfaceC6490 Bundle bundle, @InterfaceC6391 C5746<D> c5746, @InterfaceC6490 C5746<D> c57462) {
            this.f1652 = i;
            this.f1653 = bundle;
            this.f14258 = c5746;
            this.f14261 = c57462;
            c5746.m17820(i, this);
        }

        @Override // android.view.LiveData
        public void onActive() {
            if (C5749.f14257) {
                Log.v(C5749.f14256, "  Starting: " + this);
            }
            this.f14258.m17824();
        }

        @Override // android.view.LiveData
        public void onInactive() {
            if (C5749.f14257) {
                Log.v(C5749.f14256, "  Stopping: " + this);
            }
            this.f14258.m17825();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.lifecycle.Observer<? super D> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.LiveData
        public void removeObserver(@InterfaceC6391 Observer<? super D> observer) {
            super.removeObserver(observer);
            this.f14259 = null;
            this.f14260 = null;
        }

        @Override // android.view.MutableLiveData, android.view.LiveData
        public void setValue(D d) {
            super.setValue(d);
            C5746<D> c5746 = this.f14261;
            if (c5746 != null) {
                c5746.m17822();
                this.f14261 = null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f1652);
            sb.append(" : ");
            C4326.m1290(this.f14258, sb);
            sb.append("}}");
            return sb.toString();
        }

        @Override // Yue.C5746.InterfaceC5747
        /* JADX INFO: renamed from: ۥ */
        public void mo2424(@InterfaceC6391 C5746<D> c5746, @InterfaceC6490 D d) {
            if (C5749.f14257) {
                Log.v(C5749.f14256, "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(d);
                return;
            }
            if (C5749.f14257) {
                Log.w(C5749.f14256, "onLoadComplete was incorrectly called on a background thread");
            }
            postValue(d);
        }

        @InterfaceC5922
        /* JADX INFO: renamed from: ۥ۟ */
        public C5746<D> m2429(boolean z) {
            if (C5749.f14257) {
                Log.v(C5749.f14256, "  Destroying: " + this);
            }
            this.f14258.m2422();
            this.f14258.m2421();
            C0861<D> c0861 = this.f14260;
            if (c0861 != null) {
                removeObserver(c0861);
                if (z) {
                    c0861.m17843();
                }
            }
            this.f14258.m17827(this);
            if ((c0861 == null || c0861.m2431()) && !z) {
                return this.f14258;
            }
            this.f14258.m17822();
            return this.f14261;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m17838(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f1652);
            printWriter.print(" mArgs=");
            printWriter.println(this.f1653);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f14258);
            this.f14258.mo9059(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f14260 != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f14260);
                this.f14260.m2430(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m17839().m17810(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C5746<D> m17839() {
            return this.f14258;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean m17840() {
            C0861<D> c0861;
            return (!hasActiveObservers() || (c0861 = this.f14260) == null || c0861.m2431()) ? false : true;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void m17841() {
            LifecycleOwner lifecycleOwner = this.f14259;
            C0861<D> c0861 = this.f14260;
            if (lifecycleOwner == null || c0861 == null) {
                return;
            }
            super.removeObserver(c0861);
            observe(lifecycleOwner, c0861);
        }

        @InterfaceC6391
        @InterfaceC5922
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C5746<D> m17842(@InterfaceC6391 LifecycleOwner lifecycleOwner, @InterfaceC6391 AbstractC5748.InterfaceC0859<D> interfaceC0859) {
            C0861<D> c0861 = new C0861<>(this.f14258, interfaceC0859);
            observe(lifecycleOwner, c0861);
            C0861<D> c08612 = this.f14260;
            if (c08612 != null) {
                removeObserver(c08612);
            }
            this.f14259 = lifecycleOwner;
            this.f14260 = c0861;
            return this.f14258;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۧ$ۥ۟ */
    public static class C0861<D> implements Observer<D> {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6391
        public final C5746<D> f1654;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6391
        public final AbstractC5748.InterfaceC0859<D> f1655;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f14262 = false;

        public C0861(@InterfaceC6391 C5746<D> c5746, @InterfaceC6391 AbstractC5748.InterfaceC0859<D> interfaceC0859) {
            this.f1654 = c5746;
            this.f1655 = interfaceC0859;
        }

        @Override // android.view.Observer
        public void onChanged(@InterfaceC6490 D d) {
            if (C5749.f14257) {
                Log.v(C5749.f14256, "  onLoadFinished in " + this.f1654 + ": " + this.f1654.m17810(d));
            }
            this.f1655.m17836(this.f1654, d);
            this.f14262 = true;
        }

        public String toString() {
            return this.f1655.toString();
        }

        /* JADX INFO: renamed from: ۥ */
        public void m2430(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f14262);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m2431() {
            return this.f14262;
        }

        @InterfaceC5922
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m17843() {
            if (this.f14262) {
                if (C5749.f14257) {
                    Log.v(C5749.f14256, "  Resetting: " + this.f1654);
                }
                this.f1655.m2427(this.f1654);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۧ$ۥ۟۟, reason: contains not printable characters */
    public static class C5750 extends ViewModel {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final ViewModelProvider.Factory f14263 = new C0862();

        /* JADX INFO: renamed from: ۥ */
        public C7533<C0860> f1656 = new C7533<>();

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean f1657 = false;

        /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۧ$ۥ۟۟$ۥ */
        public static class C0862 implements ViewModelProvider.Factory {
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            @InterfaceC6391
            public <T extends ViewModel> T create(@InterfaceC6391 Class<T> cls) {
                return new C5750();
            }
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static C5750 m17844(ViewModelStore viewModelStore) {
            return (C5750) new ViewModelProvider(viewModelStore, f14263).get(C5750.class);
        }

        @Override // android.view.ViewModel
        public void onCleared() {
            super.onCleared();
            int iM23579 = this.f1656.m23579();
            for (int i = 0; i < iM23579; i++) {
                this.f1656.m23580(i).m2429(true);
            }
            this.f1656.m23557();
        }

        /* JADX INFO: renamed from: ۥ */
        public void m2432(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f1656.m23579() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f1656.m23579(); i++) {
                    C0860 c0860M23580 = this.f1656.m23580(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f1656.m23568(i));
                    printWriter.print(": ");
                    printWriter.println(c0860M23580.toString());
                    c0860M23580.m17838(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m2433() {
            this.f1657 = false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public <D> C0860<D> m17845(int i) {
            return this.f1656.m23563(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean m17846() {
            int iM23579 = this.f1656.m23579();
            for (int i = 0; i < iM23579; i++) {
                if (this.f1656.m23580(i).m17840()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean m17847() {
            return this.f1657;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m17848() {
            int iM23579 = this.f1656.m23579();
            for (int i = 0; i < iM23579; i++) {
                this.f1656.m23580(i).m17841();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m17849(int i, @InterfaceC6391 C0860 c0860) {
            this.f1656.m23569(i, c0860);
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m17850(int i) {
            this.f1656.m23572(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m17851() {
            this.f1657 = true;
        }
    }

    public C5749(@InterfaceC6391 LifecycleOwner lifecycleOwner, @InterfaceC6391 ViewModelStore viewModelStore) {
        this.f1650 = lifecycleOwner;
        this.f1651 = C5750.m17844(viewModelStore);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C4326.m1290(this.f1650, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // Yue.AbstractC5748
    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ */
    public void mo2425(int i) {
        if (this.f1651.m17847()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (f14257) {
            Log.v(f14256, "destroyLoader in " + this + " of " + i);
        }
        C0860 c0860M17845 = this.f1651.m17845(i);
        if (c0860M17845 != null) {
            c0860M17845.m2429(true);
            this.f1651.m17850(i);
        }
    }

    @Override // Yue.AbstractC5748
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo2426(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f1651.m2432(str, fileDescriptor, printWriter, strArr);
    }

    @Override // Yue.AbstractC5748
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public <D> C5746<D> mo17831(int i) {
        if (this.f1651.m17847()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        C0860<D> c0860M17845 = this.f1651.m17845(i);
        if (c0860M17845 != null) {
            return c0860M17845.m17839();
        }
        return null;
    }

    @Override // Yue.AbstractC5748
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo17832() {
        return this.f1651.m17846();
    }

    @Override // Yue.AbstractC5748
    @InterfaceC6391
    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public <D> C5746<D> mo17833(int i, @InterfaceC6490 Bundle bundle, @InterfaceC6391 AbstractC5748.InterfaceC0859<D> interfaceC0859) {
        if (this.f1651.m17847()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        C0860<D> c0860M17845 = this.f1651.m17845(i);
        if (f14257) {
            Log.v(f14256, "initLoader in " + this + ": args=" + bundle);
        }
        if (c0860M17845 == null) {
            return m17837(i, bundle, interfaceC0859, null);
        }
        if (f14257) {
            Log.v(f14256, "  Re-using existing loader " + c0860M17845);
        }
        return c0860M17845.m17842(this.f1650, interfaceC0859);
    }

    @Override // Yue.AbstractC5748
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo17834() {
        this.f1651.m17848();
    }

    @Override // Yue.AbstractC5748
    @InterfaceC6391
    @InterfaceC5922
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public <D> C5746<D> mo17835(int i, @InterfaceC6490 Bundle bundle, @InterfaceC6391 AbstractC5748.InterfaceC0859<D> interfaceC0859) {
        if (this.f1651.m17847()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        if (f14257) {
            Log.v(f14256, "restartLoader in " + this + ": args=" + bundle);
        }
        C0860<D> c0860M17845 = this.f1651.m17845(i);
        return m17837(i, bundle, interfaceC0859, c0860M17845 != null ? c0860M17845.m2429(false) : null);
    }

    @InterfaceC6391
    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final <D> C5746<D> m17837(int i, @InterfaceC6490 Bundle bundle, @InterfaceC6391 AbstractC5748.InterfaceC0859<D> interfaceC0859, @InterfaceC6490 C5746<D> c5746) {
        try {
            this.f1651.m17851();
            C5746<D> c5746M2428 = interfaceC0859.m2428(i, bundle);
            if (c5746M2428 == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (c5746M2428.getClass().isMemberClass() && !Modifier.isStatic(c5746M2428.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c5746M2428);
            }
            C0860 c0860 = new C0860(i, bundle, c5746M2428, c5746);
            if (f14257) {
                Log.v(f14256, "  Created new loader " + c0860);
            }
            this.f1651.m17849(i, c0860);
            this.f1651.m2433();
            return c0860.m17842(this.f1650, interfaceC0859);
        } catch (Throwable th) {
            this.f1651.m2433();
            throw th;
        }
    }
}
