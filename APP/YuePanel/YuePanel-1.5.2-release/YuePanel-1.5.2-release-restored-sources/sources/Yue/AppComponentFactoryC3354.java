package Yue;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.core.app.CoreComponentFactory;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(28)
public class AppComponentFactoryC3354 extends AppComponentFactory {
    @InterfaceC6391
    public final Activity instantiateActivity(@InterfaceC6391 ClassLoader classLoader, @InterfaceC6391 String str, @InterfaceC6490 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Activity) CoreComponentFactory.m4746(m432(classLoader, str, intent));
    }

    @InterfaceC6391
    public final Application instantiateApplication(@InterfaceC6391 ClassLoader classLoader, @InterfaceC6391 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Application) CoreComponentFactory.m4746(m433(classLoader, str));
    }

    @InterfaceC6391
    public final ContentProvider instantiateProvider(@InterfaceC6391 ClassLoader classLoader, @InterfaceC6391 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (ContentProvider) CoreComponentFactory.m4746(m6870(classLoader, str));
    }

    @InterfaceC6391
    public final BroadcastReceiver instantiateReceiver(@InterfaceC6391 ClassLoader classLoader, @InterfaceC6391 String str, @InterfaceC6490 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (BroadcastReceiver) CoreComponentFactory.m4746(m6871(classLoader, str, intent));
    }

    @InterfaceC6391
    public final Service instantiateService(@InterfaceC6391 ClassLoader classLoader, @InterfaceC6391 String str, @InterfaceC6490 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Service) CoreComponentFactory.m4746(m6872(classLoader, str, intent));
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public Activity m432(@InterfaceC6391 ClassLoader classLoader, @InterfaceC6391 String str, @InterfaceC6490 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (Activity) Class.forName(str, false, classLoader).asSubclass(Activity.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public Application m433(@InterfaceC6391 ClassLoader classLoader, @InterfaceC6391 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (Application) Class.forName(str, false, classLoader).asSubclass(Application.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public ContentProvider m6870(@InterfaceC6391 ClassLoader classLoader, @InterfaceC6391 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (ContentProvider) Class.forName(str, false, classLoader).asSubclass(ContentProvider.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public BroadcastReceiver m6871(@InterfaceC6391 ClassLoader classLoader, @InterfaceC6391 String str, @InterfaceC6490 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (BroadcastReceiver) Class.forName(str, false, classLoader).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Service m6872(@InterfaceC6391 ClassLoader classLoader, @InterfaceC6391 String str, @InterfaceC6490 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (Service) Class.forName(str, false, classLoader).asSubclass(Service.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }
}
