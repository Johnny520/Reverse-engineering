package p135b;

import com.bumptech.glide.AbstractC1923e;
import com.bumptech.glide.C1920b;
import com.bumptech.glide.ComponentCallbacks2C1921c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import p061L2.AbstractC0974n;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p158f0.AbstractC2082n;
import p195l2.InterfaceC2504h;
import p224q2.AbstractC2929t;
import p224q2.InterfaceC2924o;
import p241t2.AbstractC3211c;

/* JADX INFO: renamed from: b.x */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1836x implements InterfaceC2504h, InterfaceC2924o {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6235d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f6236e;

    public /* synthetic */ C1836x(int i5, Object obj) {
        this.f6235d = i5;
        this.f6236e = obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public void m3299a() {
        InterfaceC1603e interfaceC1603e = (InterfaceC1603e) this.f6236e;
        synchronized (AbstractC2082n.f6972c) {
            ?? r22 = AbstractC2082n.f6977h;
            AbstractC1665j.m2985e(r22, "<this>");
            ArrayList arrayList = new ArrayList(AbstractC0974n.m2029K(r22, 10));
            boolean z5 = false;
            for (Object obj : r22) {
                boolean z6 = true;
                if (!z5 && AbstractC1665j.m2981a(obj, interfaceC1603e)) {
                    z5 = true;
                    z6 = false;
                }
                if (z6) {
                    arrayList.add(obj);
                }
            }
            AbstractC2082n.f6977h = arrayList;
        }
    }

    @Override // p224q2.InterfaceC2924o
    /* JADX INFO: renamed from: c */
    public Object mo602c() {
        int i5 = this.f6235d;
        Object obj = this.f6236e;
        switch (i5) {
            case 3:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e5) {
                    AbstractC1923e abstractC1923e = AbstractC3211c.f9992a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e5);
                } catch (InstantiationException e6) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC3211c.m5488b(constructor) + "' with no args", e6);
                } catch (InvocationTargetException e7) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC3211c.m5488b(constructor) + "' with no args", e7.getCause());
                }
            default:
                Class cls = (Class) obj;
                try {
                    return AbstractC2929t.f9249a.mo5129a(cls);
                } catch (Exception e8) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e8);
                }
        }
    }

    @Override // p195l2.InterfaceC2504h
    public Object get() {
        return new C1920b((ComponentCallbacks2C1921c) this.f6236e);
    }
}
