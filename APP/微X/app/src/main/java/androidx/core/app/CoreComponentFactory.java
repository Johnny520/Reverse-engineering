// Decompiled by JEB v5.42.0.202606242140

package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

public class CoreComponentFactory extends AppComponentFactory {
    public interface CLS2 {
        Object MTH660();
    }

    @Override  // android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader classLoader0, String s, Intent intent0) {
        return (Activity)CoreComponentFactory.MTH667(super.instantiateActivity(classLoader0, s, intent0));
    }

    @Override  // android.app.AppComponentFactory
    public Application instantiateApplication(ClassLoader classLoader0, String s) {
        return (Application)CoreComponentFactory.MTH667(super.instantiateApplication(classLoader0, s));
    }

    @Override  // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader classLoader0, String s) {
        return (ContentProvider)CoreComponentFactory.MTH667(super.instantiateProvider(classLoader0, s));
    }

    @Override  // android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader0, String s, Intent intent0) {
        return (BroadcastReceiver)CoreComponentFactory.MTH667(super.instantiateReceiver(classLoader0, s, intent0));
    }

    @Override  // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader classLoader0, String s, Intent intent0) {
        return (Service)CoreComponentFactory.MTH667(super.instantiateService(classLoader0, s, intent0));
    }

    public static Object MTH667(Object object0) {
        if(object0 instanceof CLS2) {
            Object object1 = ((CLS2)object0).MTH660();
            return object1 == null ? object0 : object1;
        }
        return object0;
    }
}

