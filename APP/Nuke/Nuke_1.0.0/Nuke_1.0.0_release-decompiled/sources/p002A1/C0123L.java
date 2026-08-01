package p002A1;

import android.app.Application;
import com.bumptech.glide.AbstractC1924f;
import java.lang.reflect.InvocationTargetException;
import p019D1.C0262c;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: A1.L */
/* JADX INFO: loaded from: classes.dex */
public final class C0123L extends C0125N {

    /* JADX INFO: renamed from: c */
    public static C0123L f514c;

    /* JADX INFO: renamed from: d */
    public static final C0115D f515d = new C0115D(3);

    /* JADX INFO: renamed from: b */
    public final Application f516b;

    public C0123L(Application application) {
        this.f516b = application;
    }

    @Override // p002A1.C0125N, p002A1.InterfaceC0124M
    /* JADX INFO: renamed from: a */
    public final AbstractC0122K mo168a(Class cls) {
        Application application = this.f516b;
        if (application != null) {
            return m175d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // p002A1.C0125N, p002A1.InterfaceC0124M
    /* JADX INFO: renamed from: c */
    public final AbstractC0122K mo169c(Class cls, C0262c c0262c) {
        if (this.f516b != null) {
            return mo168a(cls);
        }
        Application application = (Application) c0262c.f854a.get(f515d);
        if (application != null) {
            return m175d(cls, application);
        }
        if (AbstractC0128a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return AbstractC1924f.m3498j(cls);
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC0122K m175d(Class cls, Application application) {
        if (!AbstractC0128a.class.isAssignableFrom(cls)) {
            return AbstractC1924f.m3498j(cls);
        }
        try {
            AbstractC0122K abstractC0122K = (AbstractC0122K) cls.getConstructor(Application.class).newInstance(application);
            AbstractC1665j.m2982b(abstractC0122K);
            return abstractC0122K;
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        }
    }
}
