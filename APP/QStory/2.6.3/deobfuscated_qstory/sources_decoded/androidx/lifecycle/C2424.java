package androidx.lifecycle;

import android.app.Application;
import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.window.area.AbstractC2567;
import java.lang.reflect.InvocationTargetException;
import p160.C7635;
import p305.C8623;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2424 extends C2426 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8623 f7068 = new C8623(9);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C2424 f7069;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Application f7070;

    public C2424(Application application) {
        this.f7070 = application;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC2425 m4520(Class cls, Application application) {
        if (!AbstractC2396.class.isAssignableFrom(cls)) {
            return AbstractC2567.m5084(cls);
        }
        try {
            AbstractC2425 abstractC2425 = (AbstractC2425) cls.getConstructor(Application.class).newInstance(application);
            abstractC2425.getClass();
            return abstractC2425;
        } catch (IllegalAccessException e) {
            C0276.m848(AbstractC0053.m154(cls, "Cannot create an instance of "), e);
            return null;
        } catch (InstantiationException e2) {
            C0276.m848(AbstractC0053.m154(cls, "Cannot create an instance of "), e2);
            return null;
        } catch (NoSuchMethodException e3) {
            C0276.m848(AbstractC0053.m154(cls, "Cannot create an instance of "), e3);
            return null;
        } catch (InvocationTargetException e4) {
            C0276.m848(AbstractC0053.m154(cls, "Cannot create an instance of "), e4);
            return null;
        }
    }

    @Override // androidx.lifecycle.C2426, androidx.lifecycle.InterfaceC2427
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC2425 mo4521(Class cls, C7635 c7635) {
        if (this.f7070 != null) {
            return mo4357(cls);
        }
        Application application = (Application) c7635.f20724.get(f7068);
        if (application != null) {
            return m4520(cls, application);
        }
        if (!AbstractC2396.class.isAssignableFrom(cls)) {
            return AbstractC2567.m5084(cls);
        }
        C5925.m11310("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    @Override // androidx.lifecycle.C2426, androidx.lifecycle.InterfaceC2427
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC2425 mo4357(Class cls) {
        Application application = this.f7070;
        if (application != null) {
            return m4520(cls, application);
        }
        C5925.m11308("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }
}
