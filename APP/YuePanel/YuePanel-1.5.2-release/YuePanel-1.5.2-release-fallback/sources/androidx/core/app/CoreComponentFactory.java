package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
@Yue.InterfaceC5336(api = 28)
public class CoreComponentFactory extends android.app.AppComponentFactory {

    /* JADX INFO: renamed from: androidx.core.app.CoreComponentFactory$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public interface InterfaceC7503 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        java.lang.Object m28811();
    }

    public CoreComponentFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static <T> T m28810(T r1) {
            boolean r0 = r1 instanceof androidx.core.app.CoreComponentFactory.InterfaceC7503
            if (r0 == 0) goto Le
            r0 = r1
            androidx.core.app.CoreComponentFactory$ۥ r0 = (androidx.core.app.CoreComponentFactory.InterfaceC7503) r0
            java.lang.Object r0 = r0.m28811()
            if (r0 == 0) goto Le
            return r0
        Le:
            return r1
    }

    @Yue.InterfaceC4410
    public android.app.Activity instantiateActivity(@Yue.InterfaceC4410 java.lang.ClassLoader r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4544 android.content.Intent r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            android.app.Activity r1 = super.instantiateActivity(r1, r2, r3)
            java.lang.Object r1 = m28810(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
    }

    @Yue.InterfaceC4410
    public android.app.Application instantiateApplication(@Yue.InterfaceC4410 java.lang.ClassLoader r1, @Yue.InterfaceC4410 java.lang.String r2) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            android.app.Application r1 = super.instantiateApplication(r1, r2)
            java.lang.Object r1 = m28810(r1)
            android.app.Application r1 = (android.app.Application) r1
            return r1
    }

    @Yue.InterfaceC4410
    public android.content.ContentProvider instantiateProvider(@Yue.InterfaceC4410 java.lang.ClassLoader r1, @Yue.InterfaceC4410 java.lang.String r2) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            android.content.ContentProvider r1 = super.instantiateProvider(r1, r2)
            java.lang.Object r1 = m28810(r1)
            android.content.ContentProvider r1 = (android.content.ContentProvider) r1
            return r1
    }

    @Yue.InterfaceC4410
    public android.content.BroadcastReceiver instantiateReceiver(@Yue.InterfaceC4410 java.lang.ClassLoader r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4544 android.content.Intent r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            android.content.BroadcastReceiver r1 = super.instantiateReceiver(r1, r2, r3)
            java.lang.Object r1 = m28810(r1)
            android.content.BroadcastReceiver r1 = (android.content.BroadcastReceiver) r1
            return r1
    }

    @Yue.InterfaceC4410
    public android.app.Service instantiateService(@Yue.InterfaceC4410 java.lang.ClassLoader r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4544 android.content.Intent r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            android.app.Service r1 = super.instantiateService(r1, r2, r3)
            java.lang.Object r1 = m28810(r1)
            android.app.Service r1 = (android.app.Service) r1
            return r1
    }
}
