package androidx.core.app;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
@InterfaceC7113(api = 28)
public class CoreComponentFactory extends AppComponentFactory {

    /* JADX INFO: renamed from: androidx.core.app.CoreComponentFactory$ۥ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC1657 {
        /* JADX INFO: renamed from: ۥ */
        Object m4747();
    }

    /* JADX INFO: renamed from: ۥ */
    public static <T> T m4746(T t) {
        T t2;
        return (!(t instanceof InterfaceC1657) || (t2 = (T) ((InterfaceC1657) t).m4747()) == null) ? t : t2;
    }

    @InterfaceC6391
    public Activity instantiateActivity(@InterfaceC6391 ClassLoader classLoader, @InterfaceC6391 String str, @InterfaceC6490 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Activity) m4746(super.instantiateActivity(classLoader, str, intent));
    }

    @InterfaceC6391
    public Application instantiateApplication(@InterfaceC6391 ClassLoader classLoader, @InterfaceC6391 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Application) m4746(super.instantiateApplication(classLoader, str));
    }

    @InterfaceC6391
    public ContentProvider instantiateProvider(@InterfaceC6391 ClassLoader classLoader, @InterfaceC6391 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (ContentProvider) m4746(super.instantiateProvider(classLoader, str));
    }

    @InterfaceC6391
    public BroadcastReceiver instantiateReceiver(@InterfaceC6391 ClassLoader classLoader, @InterfaceC6391 String str, @InterfaceC6490 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (BroadcastReceiver) m4746(super.instantiateReceiver(classLoader, str, intent));
    }

    @InterfaceC6391
    public Service instantiateService(@InterfaceC6391 ClassLoader classLoader, @InterfaceC6391 String str, @InterfaceC6490 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Service) m4746(super.instantiateService(classLoader, str, intent));
    }
}
