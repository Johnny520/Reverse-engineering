package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(28)
public class AppComponentFactoryC0524 extends android.app.AppComponentFactory {
    public AppComponentFactoryC0524() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    public final android.app.Activity instantiateActivity(@Yue.InterfaceC4410 java.lang.ClassLoader r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4544 android.content.Intent r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            android.app.Activity r1 = r0.m1858(r1, r2, r3)
            java.lang.Object r1 = androidx.core.app.CoreComponentFactory.m28810(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
    }

    @Yue.InterfaceC4410
    public final android.app.Application instantiateApplication(@Yue.InterfaceC4410 java.lang.ClassLoader r1, @Yue.InterfaceC4410 java.lang.String r2) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            android.app.Application r1 = r0.m1859(r1, r2)
            java.lang.Object r1 = androidx.core.app.CoreComponentFactory.m28810(r1)
            android.app.Application r1 = (android.app.Application) r1
            return r1
    }

    @Yue.InterfaceC4410
    public final android.content.ContentProvider instantiateProvider(@Yue.InterfaceC4410 java.lang.ClassLoader r1, @Yue.InterfaceC4410 java.lang.String r2) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            android.content.ContentProvider r1 = r0.m1860(r1, r2)
            java.lang.Object r1 = androidx.core.app.CoreComponentFactory.m28810(r1)
            android.content.ContentProvider r1 = (android.content.ContentProvider) r1
            return r1
    }

    @Yue.InterfaceC4410
    public final android.content.BroadcastReceiver instantiateReceiver(@Yue.InterfaceC4410 java.lang.ClassLoader r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4544 android.content.Intent r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            android.content.BroadcastReceiver r1 = r0.m1861(r1, r2, r3)
            java.lang.Object r1 = androidx.core.app.CoreComponentFactory.m28810(r1)
            android.content.BroadcastReceiver r1 = (android.content.BroadcastReceiver) r1
            return r1
    }

    @Yue.InterfaceC4410
    public final android.app.Service instantiateService(@Yue.InterfaceC4410 java.lang.ClassLoader r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4544 android.content.Intent r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            android.app.Service r1 = r0.m1862(r1, r2, r3)
            java.lang.Object r1 = androidx.core.app.CoreComponentFactory.m28810(r1)
            android.app.Service r1 = (android.app.Service) r1
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.app.Activity m1858(@Yue.InterfaceC4410 java.lang.ClassLoader r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4544 android.content.Intent r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            r3 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r3, r1)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            r2 = 0
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            android.app.Activity r1 = (android.app.Activity) r1     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            return r1
        L17:
            r1 = move-exception
            goto L1a
        L19:
            r1 = move-exception
        L1a:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Couldn't call constructor"
            r2.<init>(r3, r1)
            throw r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.app.Application m1859(@Yue.InterfaceC4410 java.lang.ClassLoader r2, @Yue.InterfaceC4410 java.lang.String r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r1 = this;
            r0 = 0
            java.lang.Class r2 = java.lang.Class.forName(r3, r0, r2)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            java.lang.Class<android.app.Application> r3 = android.app.Application.class
            java.lang.Class r2 = r2.asSubclass(r3)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            r3 = 0
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            android.app.Application r2 = (android.app.Application) r2     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            return r2
        L17:
            r2 = move-exception
            goto L1a
        L19:
            r2 = move-exception
        L1a:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "Couldn't call constructor"
            r3.<init>(r0, r2)
            throw r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.content.ContentProvider m1860(@Yue.InterfaceC4410 java.lang.ClassLoader r2, @Yue.InterfaceC4410 java.lang.String r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r1 = this;
            r0 = 0
            java.lang.Class r2 = java.lang.Class.forName(r3, r0, r2)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            java.lang.Class<android.content.ContentProvider> r3 = android.content.ContentProvider.class
            java.lang.Class r2 = r2.asSubclass(r3)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            r3 = 0
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            android.content.ContentProvider r2 = (android.content.ContentProvider) r2     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            return r2
        L17:
            r2 = move-exception
            goto L1a
        L19:
            r2 = move-exception
        L1a:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "Couldn't call constructor"
            r3.<init>(r0, r2)
            throw r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.content.BroadcastReceiver m1861(@Yue.InterfaceC4410 java.lang.ClassLoader r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4544 android.content.Intent r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            r3 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r3, r1)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            java.lang.Class<android.content.BroadcastReceiver> r2 = android.content.BroadcastReceiver.class
            java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            r2 = 0
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            android.content.BroadcastReceiver r1 = (android.content.BroadcastReceiver) r1     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            return r1
        L17:
            r1 = move-exception
            goto L1a
        L19:
            r1 = move-exception
        L1a:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Couldn't call constructor"
            r2.<init>(r3, r1)
            throw r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.app.Service m1862(@Yue.InterfaceC4410 java.lang.ClassLoader r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4544 android.content.Intent r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            r3 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r3, r1)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            java.lang.Class<android.app.Service> r2 = android.app.Service.class
            java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            r2 = 0
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            android.app.Service r1 = (android.app.Service) r1     // Catch: java.lang.NoSuchMethodException -> L17 java.lang.reflect.InvocationTargetException -> L19
            return r1
        L17:
            r1 = move-exception
            goto L1a
        L19:
            r1 = move-exception
        L1a:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Couldn't call constructor"
            r2.<init>(r3, r1)
            throw r2
    }
}
