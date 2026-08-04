package yyds;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.C0038;
import androidx.savedstate.Recreator;
import com.bumptech.glide.ComponentCallbacks2C0040;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛶᲁᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1424 implements InterfaceC1564 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static volatile C1424 f6731;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Object f6732;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f6733;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final Object f6734;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f6735;

    public C1424(Context context) {
        this.f6733 = 0;
        this.f6734 = new HashSet();
        this.f6732 = new C2115(new C0716(new C1483(context, 10)), new C2487(this));
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static C1424 m2889(String str) {
        if (str != null) {
            int length = str.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            str = AbstractC2328.m4341(-1737721865995118L);
        } else {
            str = AbstractC2328.m4341(-1737721865995118L);
        }
        return new C1424((Object) null, str, false);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static C1424 m2890(Context context) {
        if (f6731 == null) {
            synchronized (C1424.class) {
                try {
                    if (f6731 == null) {
                        f6731 = new C1424(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f6731;
    }

    @Override // yyds.InterfaceC1564
    public Object get() {
        if (this.f6735) {
            C0188.m800("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            return null;
        }
        AbstractC0879.m1969("Glide registry");
        this.f6735 = true;
        try {
            return AbstractC2408.m4461((ComponentCallbacks2C0040) this.f6732, (ArrayList) this.f6734);
        } finally {
            this.f6735 = false;
            Trace.endSection();
        }
    }

    public String toString() {
        switch (this.f6733) {
            case 3:
                return super.toString() + "{numRequests=" + ((Set) this.f6732).size() + ", isPaused=" + this.f6735 + "}";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public void m2891() {
        InterfaceC2164 interfaceC2164 = (InterfaceC2164) this.f6732;
        C0038 c0038Mo14 = interfaceC2164.mo14();
        if (c0038Mo14.f313 != EnumC1464.f6971) {
            C0188.m800("Restarter must be created only during owner's initialization stage");
            return;
        }
        c0038Mo14.m122(new Recreator(interfaceC2164));
        final C0328 c0328 = (C0328) this.f6734;
        if (c0328.f1720) {
            C0188.m800("SavedStateRegistry was already attached.");
            return;
        }
        c0038Mo14.m122(new InterfaceC0657() { // from class: yyds.ᛴᛳᲁᛱ
            @Override // yyds.InterfaceC0657
            /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
            public final void mo20(InterfaceC2345 interfaceC2345, EnumC0637 enumC0637) {
                EnumC0637 enumC06372 = EnumC0637.ON_START;
                C0328 c03282 = c0328;
                if (enumC0637 == enumC06372) {
                    c03282.f1717 = true;
                } else if (enumC0637 == EnumC0637.ON_STOP) {
                    c03282.f1717 = false;
                }
            }
        });
        c0328.f1720 = true;
        this.f6735 = true;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public boolean m2892(InterfaceC1823 interfaceC1823) {
        boolean z = true;
        if (interfaceC1823 == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f6732).remove(interfaceC1823);
        if (!((HashSet) this.f6734).remove(interfaceC1823) && !zRemove) {
            z = false;
        }
        if (z) {
            interfaceC1823.clear();
        }
        return z;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public void m2893(Bundle bundle) {
        if (!this.f6735) {
            m2891();
        }
        C0038 c0038Mo14 = ((InterfaceC2164) this.f6732).mo14();
        if (c0038Mo14.f313.m2970(EnumC1464.f6970)) {
            C0188.m802(c0038Mo14.f313, "performRestore cannot be called when owner is ");
            return;
        }
        C0328 c0328 = (C0328) this.f6734;
        if (!c0328.f1720) {
            C0188.m800("You must call performAttach() before calling performRestore(Bundle).");
        } else if (c0328.f1722) {
            C0188.m800("SavedStateRegistry was already restored.");
        } else {
            c0328.f1718 = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            c0328.f1722 = true;
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public void m2894() {
        if (this.f6735 || ((HashSet) this.f6734).isEmpty()) {
            return;
        }
        C2115 c2115 = (C2115) this.f6732;
        C0716 c0716 = (C0716) c2115.f10456;
        boolean z = false;
        c2115.f10454 = ((ConnectivityManager) c0716.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) c0716.get()).registerDefaultNetworkCallback((C0750) c2115.f10457);
            z = true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
        }
        this.f6735 = z;
    }

    public C1424() {
        this.f6733 = 3;
        this.f6732 = Collections.newSetFromMap(new WeakHashMap());
        this.f6734 = new HashSet();
    }

    public C1424(InterfaceC2164 interfaceC2164) {
        this.f6733 = 4;
        this.f6732 = interfaceC2164;
        this.f6734 = new C0328();
    }

    public C1424(Object obj, String str, boolean z) {
        this.f6733 = 1;
        this.f6735 = z;
        this.f6732 = str;
        this.f6734 = obj;
    }

    public C1424(ComponentCallbacks2C0040 componentCallbacks2C0040, ArrayList arrayList, AbstractC0024 abstractC0024) {
        this.f6733 = 2;
        this.f6732 = componentCallbacks2C0040;
        this.f6734 = arrayList;
    }
}
