package p297;

import bsh.AbstractC3500;
import bsh.Interpreter;
import bsh.Primitive;
import bsh.security.SecurityError;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import net.bytebuddy.implementation.auxiliary.TypeProxy;

/* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9201 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashSet f23462;

    public C9201() {
        HashSet hashSet = new HashSet();
        this.f23462 = hashSet;
        hashSet.add(new C9202());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14430(Object obj, String str, Object obj2) throws SecurityError {
        Object objUnwrap = Primitive.unwrap(obj2);
        Iterator it = this.f23462.iterator();
        while (it.hasNext()) {
            ((C9202) it.next()).getClass();
            if (obj instanceof C9201) {
                throw SecurityError.cantSetField(obj, str, objUnwrap);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m14431(Class cls, String str, Object[] objArr) {
        Object[] objArrUnwrap = Primitive.unwrap(objArr);
        Iterator it = this.f23462.iterator();
        while (it.hasNext()) {
            ((C9202) it.next()).getClass();
        }
        if (str.equals("getLength") && objArrUnwrap.length == 1 && cls.isAssignableFrom(Array.class)) {
            Object obj = objArrUnwrap[0];
            try {
                m14434();
            } catch (SecurityError unused) {
                throw SecurityError.reflectCantGetField(obj, "length");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0101  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m14432(Object obj, String str, Object[] objArr) {
        Object[] objArrCopyOfRange;
        Object[] objArrUnwrap = Primitive.unwrap(objArr);
        Iterator it = this.f23462.iterator();
        while (it.hasNext()) {
            ((C9202) it.next()).getClass();
            if (obj instanceof C9201) {
                throw SecurityError.cantInvokeMethod(obj, str, objArrUnwrap);
            }
        }
        if (str.equals("set") && objArrUnwrap.length == 2 && (obj instanceof Field)) {
            Field field = (Field) obj;
            String name = field.getName();
            Object obj2 = objArrUnwrap[1];
            Object[] objArr2 = AbstractC3500.f8347;
            if (Modifier.isStatic(field.getModifiers())) {
                Class<?> declaringClass = field.getDeclaringClass();
                try {
                    m14436(declaringClass, name, obj2);
                } catch (SecurityError unused) {
                    throw SecurityError.reflectCantSetStaticField(declaringClass, name, obj2);
                }
            } else {
                Object obj3 = objArrUnwrap[0];
                try {
                    m14430(obj3, name, obj2);
                } catch (SecurityError unused2) {
                    throw SecurityError.reflectCantSetField(obj3, name, obj2);
                }
            }
        }
        if (str.equals("get") && objArrUnwrap.length == 1 && (obj instanceof Field)) {
            Field field2 = (Field) obj;
            String name2 = field2.getName();
            Object[] objArr3 = AbstractC3500.f8347;
            if (Modifier.isStatic(field2.getModifiers())) {
                Class<?> declaringClass2 = field2.getDeclaringClass();
                try {
                    m14433(declaringClass2, name2);
                } catch (SecurityError unused3) {
                    throw SecurityError.reflectCantGetStaticField(declaringClass2, name2);
                }
            } else {
                Object obj4 = objArrUnwrap[0];
                try {
                    m14434();
                } catch (SecurityError unused4) {
                    throw SecurityError.reflectCantGetField(obj4, name2);
                }
            }
        }
        if ((obj instanceof Class) && str.equals(TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME)) {
            Class cls = (Class) obj;
            Object[] objArr4 = new Object[0];
            try {
                m14435(cls, objArr4);
            } catch (SecurityError unused5) {
                throw SecurityError.reflectCantConstruct(cls, objArr4);
            }
        } else if ((obj instanceof Constructor) && str.equals(TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME)) {
            Class declaringClass3 = ((Constructor) obj).getDeclaringClass();
            if (objArrUnwrap.length == 1) {
                Object obj5 = objArrUnwrap[0];
                Object[] objArr5 = obj5 instanceof Object[] ? (Object[]) obj5 : objArrUnwrap;
                try {
                    m14435(declaringClass3, objArr5);
                } catch (SecurityError unused6) {
                    throw SecurityError.reflectCantConstruct(declaringClass3, objArr5);
                }
            }
        }
        if (str.equals("invoke") && objArrUnwrap.length != 0 && (obj instanceof Method)) {
            Method method = (Method) obj;
            String name3 = method.getName();
            if (objArrUnwrap.length == 2) {
                Object obj6 = objArrUnwrap[1];
                objArrCopyOfRange = obj6 instanceof Object[] ? (Object[]) obj6 : Arrays.copyOfRange(objArrUnwrap, 1, objArrUnwrap.length);
            }
            Object[] objArr6 = AbstractC3500.f8347;
            if (Modifier.isStatic(method.getModifiers())) {
                Class<?> declaringClass4 = method.getDeclaringClass();
                try {
                    m14431(declaringClass4, name3, objArrCopyOfRange);
                } catch (SecurityError unused7) {
                    throw SecurityError.reflectCantInvokeStaticMethod(declaringClass4, name3, objArrCopyOfRange);
                }
            } else {
                Object obj7 = objArrUnwrap[0];
                try {
                    m14432(obj7, name3, objArrCopyOfRange);
                } catch (SecurityError unused8) {
                    throw SecurityError.reflectCantInvokeMethod(obj7, name3, objArrCopyOfRange);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14433(Class cls, String str) {
        Iterator it = this.f23462.iterator();
        while (it.hasNext()) {
            ((C9202) it.next()).getClass();
            if (cls == Interpreter.class && str.equals("mainSecurityGuard")) {
                throw SecurityError.cantGetStaticField(cls, str);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14434() {
        Iterator it = this.f23462.iterator();
        while (it.hasNext()) {
            ((C9202) it.next()).getClass();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14435(Class cls, Object[] objArr) throws SecurityError {
        Object[] objArrUnwrap = Primitive.unwrap(objArr);
        Iterator it = this.f23462.iterator();
        while (it.hasNext()) {
            ((C9202) it.next()).getClass();
            if (C9201.class.isAssignableFrom(cls) || C9202.class.isAssignableFrom(cls)) {
                throw SecurityError.cantConstruct(cls, objArrUnwrap);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14436(Class cls, String str, Object obj) throws SecurityError {
        Object objUnwrap = Primitive.unwrap(obj);
        Iterator it = this.f23462.iterator();
        while (it.hasNext()) {
            ((C9202) it.next()).getClass();
            if (cls == Interpreter.class && str.equals("mainSecurityGuard")) {
                throw SecurityError.cantSetStaticField(cls, str, objUnwrap);
            }
        }
    }
}
