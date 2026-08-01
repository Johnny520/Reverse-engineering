package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class CoreComponentFactory extends AppComponentFactory {
    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) m2482a(super.instantiateActivity(classLoader, str, intent));
    }

    public Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) m2482a(super.instantiateApplication(classLoader, str));
    }

    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) m2482a(super.instantiateProvider(classLoader, str));
    }

    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) m2482a(super.instantiateReceiver(classLoader, str, intent));
    }

    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return (Service) m2482a(super.instantiateService(classLoader, str, intent));
    }

    /* JADX INFO: renamed from: a */
    public static Object m2482a(Object obj) {
        return obj;
    }
}
