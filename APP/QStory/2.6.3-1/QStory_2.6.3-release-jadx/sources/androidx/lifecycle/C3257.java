package androidx.lifecycle;

import android.app.Application;
import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.window.area.AbstractC3400;
import java.lang.reflect.InvocationTargetException;
import p176.C8464;
import p321.C9452;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3257 extends C3259 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C9452 f7413 = new C9452(9);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C3257 f7414;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Application f7415;

    public C3257(Application application) {
        this.f7415 = application;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC3258 m5080(Class cls, Application application) {
        if (!AbstractC3229.class.isAssignableFrom(cls)) {
            return AbstractC3400.m5644(cls);
        }
        try {
            AbstractC3258 abstractC3258 = (AbstractC3258) cls.getConstructor(Application.class).newInstance(application);
            abstractC3258.getClass();
            return abstractC3258;
        } catch (IllegalAccessException e) {
            C1123.m1408(AbstractC0900.m714(cls, "Cannot create an instance of "), e);
            return null;
        } catch (InstantiationException e2) {
            C1123.m1408(AbstractC0900.m714(cls, "Cannot create an instance of "), e2);
            return null;
        } catch (NoSuchMethodException e3) {
            C1123.m1408(AbstractC0900.m714(cls, "Cannot create an instance of "), e3);
            return null;
        } catch (InvocationTargetException e4) {
            C1123.m1408(AbstractC0900.m714(cls, "Cannot create an instance of "), e4);
            return null;
        }
    }

    @Override // androidx.lifecycle.C3259, androidx.lifecycle.InterfaceC3260
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC3258 mo5081(Class cls, C8464 c8464) {
        if (this.f7415 != null) {
            return mo4917(cls);
        }
        Application application = (Application) c8464.f21069.get(f7413);
        if (application != null) {
            return m5080(cls, application);
        }
        if (!AbstractC3229.class.isAssignableFrom(cls)) {
            return AbstractC3400.m5644(cls);
        }
        C6755.m11869("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    @Override // androidx.lifecycle.C3259, androidx.lifecycle.InterfaceC3260
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3258 mo4917(Class cls) {
        Application application = this.f7415;
        if (application != null) {
            return m5080(cls, application);
        }
        C6755.m11867("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }
}
