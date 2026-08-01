package p153k4;

import androidx.lifecycle.AbstractC0671l0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import p154k5.C3991y;
import p181m4.C4965b;

/* JADX INFO: renamed from: k4.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3953c {

    /* JADX INFO: renamed from: a */
    public static final C3953c f11421a = new C3953c();

    /* JADX INFO: renamed from: a */
    public final AbstractC0671l0 m15663a(Class cls) throws InvocationTargetException {
        cls.getClass();
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                C3991y.m15914a("Cannot create an instance of ", cls);
                return null;
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (AbstractC0671l0) objNewInstance;
            } catch (IllegalAccessException e10) {
                C4965b.m20055a("Cannot create an instance of ", cls, e10);
                return null;
            } catch (InstantiationException e11) {
                C4965b.m20055a("Cannot create an instance of ", cls, e11);
                return null;
            }
        } catch (NoSuchMethodException e12) {
            C4965b.m20055a("Cannot create an instance of ", cls, e12);
            return null;
        }
    }
}
