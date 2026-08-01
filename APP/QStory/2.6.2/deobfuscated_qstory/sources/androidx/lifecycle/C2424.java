package androidx.lifecycle;

import android.app.Application;
import androidx.collection.C0276;
import java.lang.reflect.InvocationTargetException;
import p160.C7634;
import p251.AbstractC8174;
import p305.C8631;
import p383.AbstractC9032;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2424 extends C2426 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8631 f7067 = new C8631(9);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C2424 f7068;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Application f7069;

    public C2424(Application application) {
        this.f7069 = application;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC2425 m4510(Class cls, Application application) {
        if (!AbstractC2396.class.isAssignableFrom(cls)) {
            return AbstractC8174.m13621(cls);
        }
        try {
            AbstractC2425 abstractC2425 = (AbstractC2425) cls.getConstructor(Application.class).newInstance(application);
            abstractC2425.getClass();
            return abstractC2425;
        } catch (IllegalAccessException e) {
            C0276.m847(AbstractC9032.m14590(cls, "Cannot create an instance of "), e);
            return null;
        } catch (InstantiationException e2) {
            C0276.m847(AbstractC9032.m14590(cls, "Cannot create an instance of "), e2);
            return null;
        } catch (NoSuchMethodException e3) {
            C0276.m847(AbstractC9032.m14590(cls, "Cannot create an instance of "), e3);
            return null;
        } catch (InvocationTargetException e4) {
            C0276.m847(AbstractC9032.m14590(cls, "Cannot create an instance of "), e4);
            return null;
        }
    }

    @Override // androidx.lifecycle.C2426, androidx.lifecycle.InterfaceC2427
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC2425 mo4511(Class cls, C7634 c7634) {
        if (this.f7069 != null) {
            return mo4347(cls);
        }
        Application application = (Application) c7634.f20729.get(f7067);
        if (application != null) {
            return m4510(cls, application);
        }
        if (!AbstractC2396.class.isAssignableFrom(cls)) {
            return AbstractC8174.m13621(cls);
        }
        C5919.m11249("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    @Override // androidx.lifecycle.C2426, androidx.lifecycle.InterfaceC2427
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC2425 mo4347(Class cls) {
        Application application = this.f7069;
        if (application != null) {
            return m4510(cls, application);
        }
        C5919.m11247("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }
}
