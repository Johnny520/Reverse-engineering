package lin.xposed.hook.javaplugin.controller;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p392.AbstractC9121;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0017j\b\u0012\u0004\u0012\u00020\u0001`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Llin/xposed/hook/javaplugin/controller/FixClassLoader;", "Ljava/lang/ClassLoader;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "name", "Ljava/lang/Class;", "findClass", "(Ljava/lang/String;)Ljava/lang/Class;", "Ljava/net/URL;", "getResource", "(Ljava/lang/String;)Ljava/net/URL;", "Ljava/util/Enumeration;", "getResources", "(Ljava/lang/String;)Ljava/util/Enumeration;", "", "resolve", "loadClass", "(Ljava/lang/String;Z)Ljava/lang/Class;", "classLoader", "Lkotlin/飘花落叶言子楪兰苏哲世;", "addClassLoader", "(Ljava/lang/ClassLoader;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "loaders", "Ljava/util/ArrayList;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class FixClassLoader extends ClassLoader {
    public static final int $stable = 8;
    private final ArrayList<ClassLoader> loaders;

    public FixClassLoader() {
        super(ClassLoader.getSystemClassLoader());
        ArrayList<ClassLoader> arrayList = new ArrayList<>();
        this.loaders = arrayList;
        arrayList.add(ClassLoader.getSystemClassLoader());
        Object[][] objArr = AbstractC9121.f25498;
        arrayList.add(AbstractC9121.class.getClassLoader());
        arrayList.add(AbstractC9121.f25497);
        ClassLoader classLoader = XposedBridge.class.getClassLoader();
        classLoader.getClass();
        arrayList.add(classLoader);
    }

    public final void addClassLoader(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        this.loaders.add(classLoader);
    }

    @Override // java.lang.ClassLoader
    public Class<?> findClass(String name) {
        AbstractC3056.m6668(-3937597717518484903L);
        name.getClass();
        Iterator<ClassLoader> it = this.loaders.iterator();
        AbstractC3056.m6668(-3937693916195980711L);
        it.getClass();
        while (it.hasNext()) {
            ClassLoader next = it.next();
            AbstractC3056.m6668(-3937693873246307751L);
            next.getClass();
            try {
                return next.loadClass(name);
            } catch (Exception unused) {
            }
        }
        return super.findClass(name);
    }

    @Override // java.lang.ClassLoader
    public URL getResource(String name) {
        AbstractC3056.m6668(-3937597717518484903L);
        name.getClass();
        Iterator<ClassLoader> it = this.loaders.iterator();
        AbstractC3056.m6668(-3937693916195980711L);
        it.getClass();
        while (it.hasNext()) {
            ClassLoader next = it.next();
            AbstractC3056.m6668(-3937693873246307751L);
            next.getClass();
            URL resource = next.getResource(name);
            if (resource != null) {
                return resource;
            }
        }
        return super.getResource(name);
    }

    @Override // java.lang.ClassLoader
    public Enumeration<URL> getResources(String name) {
        AbstractC3056.m6668(-3937597717518484903L);
        name.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<ClassLoader> it = this.loaders.iterator();
        AbstractC3056.m6668(-3937693916195980711L);
        it.getClass();
        while (it.hasNext()) {
            ClassLoader next = it.next();
            AbstractC3056.m6668(-3937693873246307751L);
            next.getClass();
            try {
                Enumeration<URL> resources = next.getResources(name);
                while (resources.hasMoreElements()) {
                    arrayList.add(resources.nextElement());
                }
            } catch (Exception unused) {
            }
        }
        Enumeration<URL> enumeration = Collections.enumeration(arrayList);
        AbstractC3056.m6668(-3937693881836242343L);
        enumeration.getClass();
        return enumeration;
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        AbstractC3056.m6668(-3937597717518484903L);
        name.getClass();
        Iterator<ClassLoader> it = this.loaders.iterator();
        AbstractC3056.m6668(-3937693916195980711L);
        it.getClass();
        while (it.hasNext()) {
            ClassLoader next = it.next();
            AbstractC3056.m6668(-3937693873246307751L);
            next.getClass();
            try {
                Class<?> clsLoadClass = next.loadClass(name);
                AbstractC3056.m6668(-3937693817411732903L);
                clsLoadClass.getClass();
                return clsLoadClass;
            } catch (Exception unused) {
            }
        }
        throw new ClassNotFoundException(name);
    }
}
