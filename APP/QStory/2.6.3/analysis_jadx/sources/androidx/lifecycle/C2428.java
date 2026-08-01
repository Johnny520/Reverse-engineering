package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.activity.C0020;
import androidx.window.area.AbstractC2567;
import com.bumptech.glide.AbstractC3057;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import kotlin.reflect.InterfaceC5093;
import p139.C7532;
import p142.C7539;
import p142.InterfaceC7537;
import p160.C7635;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2428 implements InterfaceC2427 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7539 f7073;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC2402 f7074;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Bundle f7075;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2424 f7076;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Application f7077;

    public C2428(Application application, InterfaceC7537 interfaceC7537, Bundle bundle) {
        C2424 c2424;
        interfaceC7537.getClass();
        this.f7073 = interfaceC7537.getSavedStateRegistry();
        this.f7074 = interfaceC7537.getLifecycle();
        this.f7075 = bundle;
        this.f7077 = application;
        if (application != null) {
            if (C2424.f7069 == null) {
                C2424.f7069 = new C2424(application);
            }
            c2424 = C2424.f7069;
            c2424.getClass();
        } else {
            c2424 = new C2424(null);
        }
        this.f7076 = c2424;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC2425 m4523(Class cls, String str) {
        AutoCloseable autoCloseable;
        Application application;
        AbstractC2402 abstractC2402 = this.f7074;
        if (abstractC2402 == null) {
            C5925.m11308("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = AbstractC2396.class.isAssignableFrom(cls);
        Constructor constructorM4525 = (!zIsAssignableFrom || this.f7077 == null) ? AbstractC2429.m4525(cls, AbstractC2429.f7078) : AbstractC2429.m4525(cls, AbstractC2429.f7079);
        if (constructorM4525 == null) {
            if (this.f7077 != null) {
                return this.f7076.mo4357(cls);
            }
            if (C2426.f7072 == null) {
                C2426.f7072 = new C2426();
            }
            C2426.f7072.getClass();
            return AbstractC2567.m5084(cls);
        }
        C7539 c7539 = this.f7073;
        c7539.getClass();
        C2420 c2420M4532 = AbstractC2435.m4532(c7539.m12763(str), this.f7075);
        C2419 c2419 = new C2419(str, c2420M4532);
        c2419.m4518(abstractC2402, c7539);
        Lifecycle$State lifecycle$State = ((C2386) abstractC2402).f7019;
        if (lifecycle$State == Lifecycle$State.INITIALIZED || lifecycle$State.isAtLeast(Lifecycle$State.STARTED)) {
            c7539.m12760();
        } else {
            abstractC2402.mo4503(new C0020(abstractC2402, c7539));
        }
        AbstractC2425 abstractC2425M4524 = (!zIsAssignableFrom || (application = this.f7077) == null) ? AbstractC2429.m4524(cls, constructorM4525, c2420M4532) : AbstractC2429.m4524(cls, constructorM4525, application, c2420M4532);
        abstractC2425M4524.getClass();
        C7532 c7532 = abstractC2425M4524.f7071;
        if (c7532 == null) {
            return abstractC2425M4524;
        }
        if (c7532.f20411) {
            C7532.m12756(c2419);
            return abstractC2425M4524;
        }
        synchronized (c7532.f20414) {
            autoCloseable = (AutoCloseable) c7532.f20413.put("androidx.lifecycle.savedstate.vm.tag", c2419);
        }
        C7532.m12756(autoCloseable);
        return abstractC2425M4524;
    }

    @Override // androidx.lifecycle.InterfaceC2427
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC2425 mo4521(Class cls, C7635 c7635) {
        LinkedHashMap linkedHashMap = c7635.f20724;
        String str = (String) linkedHashMap.get(C2422.f7065);
        if (str == null) {
            C5925.m11311("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(AbstractC2435.f7100) == null || linkedHashMap.get(AbstractC2435.f7099) == null) {
            if (this.f7074 != null) {
                return m4523(cls, str);
            }
            C5925.m11311("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(C2424.f7068);
        boolean zIsAssignableFrom = AbstractC2396.class.isAssignableFrom(cls);
        Constructor constructorM4525 = (!zIsAssignableFrom || application == null) ? AbstractC2429.m4525(cls, AbstractC2429.f7078) : AbstractC2429.m4525(cls, AbstractC2429.f7079);
        return constructorM4525 == null ? this.f7076.mo4521(cls, c7635) : (!zIsAssignableFrom || application == null) ? AbstractC2429.m4524(cls, constructorM4525, AbstractC2435.m4531(c7635)) : AbstractC2429.m4524(cls, constructorM4525, application, AbstractC2435.m4531(c7635));
    }

    @Override // androidx.lifecycle.InterfaceC2427
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2425 mo4517(InterfaceC5093 interfaceC5093, C7635 c7635) {
        interfaceC5093.getClass();
        return mo4521(AbstractC3057.m6756(interfaceC5093), c7635);
    }

    @Override // androidx.lifecycle.InterfaceC2427
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC2425 mo4357(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m4523(cls, canonicalName);
        }
        C5925.m11310("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
