package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.activity.C0020;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import kotlin.reflect.InterfaceC5092;
import p053.AbstractC6560;
import p139.C7531;
import p142.C7538;
import p142.InterfaceC7536;
import p160.C7634;
import p251.AbstractC8174;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2428 implements InterfaceC2427 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7538 f7072;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC2402 f7073;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Bundle f7074;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2424 f7075;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Application f7076;

    public C2428(Application application, InterfaceC7536 interfaceC7536, Bundle bundle) {
        C2424 c2424;
        interfaceC7536.getClass();
        this.f7072 = interfaceC7536.getSavedStateRegistry();
        this.f7073 = interfaceC7536.getLifecycle();
        this.f7074 = bundle;
        this.f7076 = application;
        if (application != null) {
            if (C2424.f7068 == null) {
                C2424.f7068 = new C2424(application);
            }
            c2424 = C2424.f7068;
            c2424.getClass();
        } else {
            c2424 = new C2424(null);
        }
        this.f7075 = c2424;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC2425 m4513(Class cls, String str) {
        AutoCloseable autoCloseable;
        Application application;
        AbstractC2402 abstractC2402 = this.f7073;
        if (abstractC2402 == null) {
            C5919.m11247("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = AbstractC2396.class.isAssignableFrom(cls);
        Constructor constructorM4515 = (!zIsAssignableFrom || this.f7076 == null) ? AbstractC2429.m4515(cls, AbstractC2429.f7077) : AbstractC2429.m4515(cls, AbstractC2429.f7078);
        if (constructorM4515 == null) {
            if (this.f7076 != null) {
                return this.f7075.mo4347(cls);
            }
            if (C2426.f7071 == null) {
                C2426.f7071 = new C2426();
            }
            C2426.f7071.getClass();
            return AbstractC8174.m13621(cls);
        }
        C7538 c7538 = this.f7072;
        c7538.getClass();
        C2420 c2420M4522 = AbstractC2435.m4522(c7538.m12734(str), this.f7074);
        C2419 c2419 = new C2419(str, c2420M4522);
        c2419.m4508(abstractC2402, c7538);
        Lifecycle$State lifecycle$State = ((C2386) abstractC2402).f7018;
        if (lifecycle$State == Lifecycle$State.INITIALIZED || lifecycle$State.isAtLeast(Lifecycle$State.STARTED)) {
            c7538.m12731();
        } else {
            abstractC2402.mo4493(new C0020(abstractC2402, c7538));
        }
        AbstractC2425 abstractC2425M4514 = (!zIsAssignableFrom || (application = this.f7076) == null) ? AbstractC2429.m4514(cls, constructorM4515, c2420M4522) : AbstractC2429.m4514(cls, constructorM4515, application, c2420M4522);
        abstractC2425M4514.getClass();
        C7531 c7531 = abstractC2425M4514.f7070;
        if (c7531 == null) {
            return abstractC2425M4514;
        }
        if (c7531.f20416) {
            C7531.m12727(c2419);
            return abstractC2425M4514;
        }
        synchronized (c7531.f20419) {
            autoCloseable = (AutoCloseable) c7531.f20418.put("androidx.lifecycle.savedstate.vm.tag", c2419);
        }
        C7531.m12727(autoCloseable);
        return abstractC2425M4514;
    }

    @Override // androidx.lifecycle.InterfaceC2427
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC2425 mo4511(Class cls, C7634 c7634) {
        LinkedHashMap linkedHashMap = c7634.f20729;
        String str = (String) linkedHashMap.get(C2422.f7064);
        if (str == null) {
            C5919.m11250("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(AbstractC2435.f7099) == null || linkedHashMap.get(AbstractC2435.f7098) == null) {
            if (this.f7073 != null) {
                return m4513(cls, str);
            }
            C5919.m11250("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(C2424.f7067);
        boolean zIsAssignableFrom = AbstractC2396.class.isAssignableFrom(cls);
        Constructor constructorM4515 = (!zIsAssignableFrom || application == null) ? AbstractC2429.m4515(cls, AbstractC2429.f7077) : AbstractC2429.m4515(cls, AbstractC2429.f7078);
        return constructorM4515 == null ? this.f7075.mo4511(cls, c7634) : (!zIsAssignableFrom || application == null) ? AbstractC2429.m4514(cls, constructorM4515, AbstractC2435.m4521(c7634)) : AbstractC2429.m4514(cls, constructorM4515, application, AbstractC2435.m4521(c7634));
    }

    @Override // androidx.lifecycle.InterfaceC2427
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2425 mo4507(InterfaceC5092 interfaceC5092, C7634 c7634) {
        interfaceC5092.getClass();
        return mo4511(AbstractC6560.m12029(interfaceC5092), c7634);
    }

    @Override // androidx.lifecycle.InterfaceC2427
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC2425 mo4347(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m4513(cls, canonicalName);
        }
        C5919.m11249("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
