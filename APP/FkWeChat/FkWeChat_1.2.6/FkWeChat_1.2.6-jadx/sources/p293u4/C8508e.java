package p293u4;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: u4.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8508e implements InterfaceC8505b {

    /* JADX INFO: renamed from: b */
    public static final C8508e f28403b = new C8508e();

    @Override // p293u4.InterfaceC8505b
    /* JADX INFO: renamed from: a */
    public Rect mo32753a(Activity activity) throws Exception {
        activity.getClass();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            objInvoke.getClass();
            return new Rect((Rect) objInvoke);
        } catch (Exception e10) {
            if (!(e10 instanceof NoSuchFieldException) && !(e10 instanceof NoSuchMethodException) && !(e10 instanceof IllegalAccessException) && !(e10 instanceof InvocationTargetException)) {
                throw e10;
            }
            Log.w(InterfaceC8505b.f28398a.m32755b(), e10);
            return C8507d.f28402b.mo32753a(activity);
        }
    }
}
