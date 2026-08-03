package android.view;

import Yue.C3411;
import Yue.C3879;
import Yue.C3880;
import Yue.C4750;
import Yue.C5499;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7144;
import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import net.bytebuddy.implementation.auxiliary.TypeProxy;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6211(m2698d1 = {"\u0000*\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a6\u0010\u0004\u001a\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00022\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001H\u0000\u001aI\u0010\t\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00052\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0000¢\u0006\u0002\u0010\u000f\"\u0018\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m2699d2 = {"ANDROID_VIEWMODEL_SIGNATURE", "", "Ljava/lang/Class;", "VIEWMODEL_SIGNATURE", "findMatchingConstructor", "Ljava/lang/reflect/Constructor;", C4750.f10502, "modelClass", "signature", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Landroidx/lifecycle/ViewModel;", "constructor", "params", "", "", "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel-savedstate_release"}, m2700k = 2, m2701mv = {1, 8, 0}, m2703xi = 48)
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public final class SavedStateViewModelFactoryKt {

    @InterfaceC6399
    private static final List<Class<?>> ANDROID_VIEWMODEL_SIGNATURE = C3880.m10742(Application.class, SavedStateHandle.class);

    @InterfaceC6399
    private static final List<Class<?>> VIEWMODEL_SIGNATURE = C3879.m10715(SavedStateHandle.class);

    @InterfaceC6489
    public static final <T> Constructor<T> findMatchingConstructor(@InterfaceC6399 Class<T> cls, @InterfaceC6399 List<? extends Class<?>> list) {
        C5499.m17103(cls, "modelClass");
        C5499.m17103(list, "signature");
        Object[] constructors = cls.getConstructors();
        C5499.m17102(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            C5499.m17102(parameterTypes, "constructor.parameterTypes");
            List listM8926 = C3411.m8926(parameterTypes);
            if (C5499.m17094(list, listM8926)) {
                C5499.m17101(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (list.size() == listM8926.size() && listM8926.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends ViewModel> T newInstance(@InterfaceC6399 Class<T> cls, @InterfaceC6399 Constructor<T> constructor, @InterfaceC6399 Object... objArr) {
        C5499.m17103(cls, "modelClass");
        C5499.m17103(constructor, "constructor");
        C5499.m17103(objArr, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
