package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.activity.C0867;
import androidx.window.area.AbstractC3400;
import com.bumptech.glide.AbstractC3889;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import kotlin.reflect.InterfaceC5925;
import p155.C8361;
import p158.C8368;
import p158.InterfaceC8366;
import p176.C8464;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3261 implements InterfaceC3260 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8368 f7418;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC3235 f7419;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Bundle f7420;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3257 f7421;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Application f7422;

    public C3261(Application application, InterfaceC8366 interfaceC8366, Bundle bundle) {
        C3257 c3257;
        interfaceC8366.getClass();
        this.f7418 = interfaceC8366.getSavedStateRegistry();
        this.f7419 = interfaceC8366.getLifecycle();
        this.f7420 = bundle;
        this.f7422 = application;
        if (application != null) {
            if (C3257.f7414 == null) {
                C3257.f7414 = new C3257(application);
            }
            c3257 = C3257.f7414;
            c3257.getClass();
        } else {
            c3257 = new C3257(null);
        }
        this.f7421 = c3257;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC3258 m5083(Class cls, String str) {
        AutoCloseable autoCloseable;
        Application application;
        AbstractC3235 abstractC3235 = this.f7419;
        if (abstractC3235 == null) {
            C6755.m11867("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = AbstractC3229.class.isAssignableFrom(cls);
        Constructor constructorM5085 = (!zIsAssignableFrom || this.f7422 == null) ? AbstractC3262.m5085(cls, AbstractC3262.f7423) : AbstractC3262.m5085(cls, AbstractC3262.f7424);
        if (constructorM5085 == null) {
            if (this.f7422 != null) {
                return this.f7421.mo4917(cls);
            }
            if (C3259.f7417 == null) {
                C3259.f7417 = new C3259();
            }
            C3259.f7417.getClass();
            return AbstractC3400.m5644(cls);
        }
        C8368 c8368 = this.f7418;
        c8368.getClass();
        C3253 c3253M5092 = AbstractC3268.m5092(c8368.m13322(str), this.f7420);
        C3252 c3252 = new C3252(str, c3253M5092);
        c3252.m5078(abstractC3235, c8368);
        Lifecycle$State lifecycle$State = ((C3219) abstractC3235).f7364;
        if (lifecycle$State == Lifecycle$State.INITIALIZED || lifecycle$State.isAtLeast(Lifecycle$State.STARTED)) {
            c8368.m13319();
        } else {
            abstractC3235.mo5063(new C0867(abstractC3235, c8368));
        }
        AbstractC3258 abstractC3258M5084 = (!zIsAssignableFrom || (application = this.f7422) == null) ? AbstractC3262.m5084(cls, constructorM5085, c3253M5092) : AbstractC3262.m5084(cls, constructorM5085, application, c3253M5092);
        abstractC3258M5084.getClass();
        C8361 c8361 = abstractC3258M5084.f7416;
        if (c8361 == null) {
            return abstractC3258M5084;
        }
        if (c8361.f20756) {
            C8361.m13315(c3252);
            return abstractC3258M5084;
        }
        synchronized (c8361.f20759) {
            autoCloseable = (AutoCloseable) c8361.f20758.put("androidx.lifecycle.savedstate.vm.tag", c3252);
        }
        C8361.m13315(autoCloseable);
        return abstractC3258M5084;
    }

    @Override // androidx.lifecycle.InterfaceC3260
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC3258 mo5081(Class cls, C8464 c8464) {
        LinkedHashMap linkedHashMap = c8464.f21069;
        String str = (String) linkedHashMap.get(C3255.f7410);
        if (str == null) {
            C6755.m11870("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(AbstractC3268.f7445) == null || linkedHashMap.get(AbstractC3268.f7444) == null) {
            if (this.f7419 != null) {
                return m5083(cls, str);
            }
            C6755.m11870("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(C3257.f7413);
        boolean zIsAssignableFrom = AbstractC3229.class.isAssignableFrom(cls);
        Constructor constructorM5085 = (!zIsAssignableFrom || application == null) ? AbstractC3262.m5085(cls, AbstractC3262.f7423) : AbstractC3262.m5085(cls, AbstractC3262.f7424);
        return constructorM5085 == null ? this.f7421.mo5081(cls, c8464) : (!zIsAssignableFrom || application == null) ? AbstractC3262.m5084(cls, constructorM5085, AbstractC3268.m5091(c8464)) : AbstractC3262.m5084(cls, constructorM5085, application, AbstractC3268.m5091(c8464));
    }

    @Override // androidx.lifecycle.InterfaceC3260
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC3258 mo5077(InterfaceC5925 interfaceC5925, C8464 c8464) {
        interfaceC5925.getClass();
        return mo5081(AbstractC3889.m7316(interfaceC5925), c8464);
    }

    @Override // androidx.lifecycle.InterfaceC3260
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3258 mo4917(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m5083(cls, canonicalName);
        }
        C6755.m11869("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
