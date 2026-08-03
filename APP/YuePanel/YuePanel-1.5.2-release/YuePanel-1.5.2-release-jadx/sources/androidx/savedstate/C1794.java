package androidx.savedstate;

import Yue.C4335;
import Yue.C5499;
import Yue.C6411;
import Yue.C6659;
import Yue.C7209;
import Yue.InterfaceC5922;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7235;
import Yue.InterfaceC7507;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Lifecycle;
import android.view.LifecycleEventObserver;
import android.view.LifecycleOwner;
import androidx.savedstate.C1794;
import androidx.savedstate.Recreator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.savedstate.ۥ */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nSavedStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistry.kt\nandroidx/savedstate/SavedStateRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
@SuppressLint({"RestrictedApi"})
public final class C1794 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C8999 f30376 = new C8999(null);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    @Deprecated
    public static final String f30377 = "androidx.lifecycle.BundlableSavedStateRegistry.key";

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean f4003;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public Bundle f30378;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f30379;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public Recreator.C1793 f30380;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final C7209<String, InterfaceC9000> f4002 = new C7209<>();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f30381 = true;

    /* JADX INFO: renamed from: androidx.savedstate.ۥ$ۥ, reason: contains not printable characters */
    public interface InterfaceC8998 {
        void onRecreated(@InterfaceC6399 InterfaceC7235 interfaceC7235);
    }

    /* JADX INFO: renamed from: androidx.savedstate.ۥ$ۥ۟, reason: contains not printable characters */
    public static final class C8999 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.savedstate.ۥ.ۥ۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C8999(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C8999() {
        }
    }

    /* JADX INFO: renamed from: androidx.savedstate.ۥ$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC9000 {
        @InterfaceC6399
        Bundle saveState();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m30799(C1794 c1794, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C5499.m17103(c1794, "this$0");
        C5499.m17103(lifecycleOwner, "<anonymous parameter 0>");
        C5499.m17103(event, C6411.f16276);
        if (event == Lifecycle.Event.ON_START) {
            c1794.f30381 = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            c1794.f30381 = false;
        }
    }

    @InterfaceC5922
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public final Bundle m5022(@InterfaceC6399 String str) {
        C5499.m17103(str, C6659.f17103);
        if (!this.f30379) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f30378;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f30378;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f30378;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f30378 = null;
        }
        return bundle2;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final InterfaceC9000 m30800(@InterfaceC6399 String str) {
        C5499.m17103(str, C6659.f17103);
        for (Map.Entry<String, InterfaceC9000> entry : this.f4002) {
            C5499.m17102(entry, "components");
            String key = entry.getKey();
            InterfaceC9000 value = entry.getValue();
            if (C5499.m17094(key, str)) {
                return value;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m30801() {
        return this.f30381;
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m30802() {
        return this.f30379;
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m30803(@InterfaceC6399 Lifecycle lifecycle) {
        C5499.m17103(lifecycle, "lifecycle");
        if (!(!this.f4003)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: Yue.ۥۡۧۤ۠
            @Override // android.view.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                C1794.m30799(this.f21840, lifecycleOwner, event);
            }
        });
        this.f4003 = true;
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m30804(@InterfaceC6489 Bundle bundle) {
        if (!this.f4003) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.f30379)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f30378 = bundle != null ? bundle.getBundle(f30377) : null;
        this.f30379 = true;
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m30805(@InterfaceC6399 Bundle bundle) {
        C5499.m17103(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f30378;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C7209<String, InterfaceC9000>.C7211 c7211M22586 = this.f4002.m22586();
        C5499.m17102(c7211M22586, "this.components.iteratorWithAdditions()");
        while (c7211M22586.hasNext()) {
            Map.Entry next = c7211M22586.next();
            bundle2.putBundle((String) next.getKey(), ((InterfaceC9000) next.getValue()).saveState());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle(f30377, bundle2);
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m30806(@InterfaceC6399 String str, @InterfaceC6399 InterfaceC9000 interfaceC9000) {
        C5499.m17103(str, C6659.f17103);
        C5499.m17103(interfaceC9000, "provider");
        if (this.f4002.mo14467(str, interfaceC9000) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m30807(@InterfaceC6399 Class<? extends InterfaceC8998> cls) {
        C5499.m17103(cls, "clazz");
        if (!this.f30381) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.C1793 c1793 = this.f30380;
        if (c1793 == null) {
            c1793 = new Recreator.C1793(this);
        }
        this.f30380 = c1793;
        try {
            cls.getDeclaredConstructor(null);
            Recreator.C1793 c17932 = this.f30380;
            if (c17932 != null) {
                String name = cls.getName();
                C5499.m17102(name, "clazz.name");
                c17932.m5020(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m30808(boolean z) {
        this.f30381 = z;
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m30809(@InterfaceC6399 String str) {
        C5499.m17103(str, C6659.f17103);
        this.f4002.mo14468(str);
    }
}
