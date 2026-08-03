package bsh.security;

import bsh.Interpreter;
import bsh.Primitive;
import bsh.Reflect;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class MainSecurityGuard {
    private final Set<SecurityGuard> securityGuards;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MainSecurityGuard() {
        HashSet hashSet = new HashSet();
        this.securityGuards = hashSet;
        hashSet.add(new BasicSecurityGuard(this, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void canInvokeMethodImpl(Object obj, String str, Object[] objArr) throws SecurityError {
        Iterator<SecurityGuard> it = this.securityGuards.iterator();
        while (it.hasNext()) {
            if (!it.next().canInvokeMethod(obj, str, objArr)) {
                throw SecurityError.cantInvokeMethod(obj, str, objArr);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void canInvokeMethodImplToReflectionCanConstruct(Object obj, String str, Object[] objArr) throws SecurityError {
        if ((obj instanceof Class) && str.equals("newInstance")) {
            Class<?> cls = (Class) obj;
            Object[] objArr2 = new Object[0];
            try {
                canConstruct(cls, objArr2);
                return;
            } catch (SecurityError unused) {
                throw SecurityError.reflectCantConstruct(cls, objArr2);
            }
        }
        if ((obj instanceof Constructor) && str.equals("newInstance")) {
            Class<?> declaringClass = ((Constructor) obj).getDeclaringClass();
            if (objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof Object[]) {
                    objArr = (Object[]) obj2;
                }
            }
            try {
                canConstruct(declaringClass, objArr);
            } catch (SecurityError unused2) {
                throw SecurityError.reflectCantConstruct(declaringClass, objArr);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void canInvokeMethodImplToReflectionCanGetField(Object obj, String str, Object[] objArr) throws SecurityError {
        if (str.equals("get") && objArr.length == 1 && (obj instanceof Field)) {
            Field field = (Field) obj;
            String name = field.getName();
            if (Reflect.isStatic(field)) {
                Class<?> declaringClass = field.getDeclaringClass();
                try {
                    canGetStaticField(declaringClass, name);
                } catch (SecurityError unused) {
                    throw SecurityError.reflectCantGetStaticField(declaringClass, name);
                }
            } else {
                Object obj2 = objArr[0];
                try {
                    canGetField(obj2, name);
                } catch (SecurityError unused2) {
                    throw SecurityError.reflectCantGetField(obj2, name);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void canInvokeMethodImplToReflectionCanInvokeMethod(Object obj, String str, Object[] objArr) throws SecurityError {
        Object[] objArrCopyOfRange;
        if (str.equals("invoke") && objArr.length != 0 && (obj instanceof Method)) {
            Method method = (Method) obj;
            String name = method.getName();
            if (objArr.length == 2) {
                Object obj2 = objArr[1];
                objArrCopyOfRange = obj2 instanceof Object[] ? (Object[]) obj2 : Arrays.copyOfRange(objArr, 1, objArr.length);
            }
            if (Reflect.isStatic(method)) {
                Class<?> declaringClass = method.getDeclaringClass();
                try {
                    canInvokeStaticMethod(declaringClass, name, objArrCopyOfRange);
                } catch (SecurityError unused) {
                    throw SecurityError.reflectCantInvokeStaticMethod(declaringClass, name, objArrCopyOfRange);
                }
            } else {
                Object obj3 = objArr[0];
                try {
                    canInvokeMethod(obj3, name, objArrCopyOfRange);
                } catch (SecurityError unused2) {
                    throw SecurityError.reflectCantInvokeMethod(obj3, name, objArrCopyOfRange);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void canInvokeMethodImplToReflectionCanSetField(Object obj, String str, Object[] objArr) throws SecurityError {
        if (str.equals("set") && objArr.length == 2 && (obj instanceof Field)) {
            Field field = (Field) obj;
            String name = field.getName();
            Object obj2 = objArr[1];
            if (Reflect.isStatic(field)) {
                Class<?> declaringClass = field.getDeclaringClass();
                try {
                    canSetStaticField(declaringClass, name, obj2);
                } catch (SecurityError unused) {
                    throw SecurityError.reflectCantSetStaticField(declaringClass, name, obj2);
                }
            } else {
                Object obj3 = objArr[0];
                try {
                    canSetField(obj3, name, obj2);
                } catch (SecurityError unused2) {
                    throw SecurityError.reflectCantSetField(obj3, name, obj2);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void canInvokeStaticMethodImpl(Class<?> cls, String str, Object[] objArr) throws SecurityError {
        Iterator<SecurityGuard> it = this.securityGuards.iterator();
        while (it.hasNext()) {
            if (!it.next().canInvokeStaticMethod(cls, str, objArr)) {
                throw SecurityError.cantInvokeStaticMethod(cls, str, objArr);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void canInvokeStaticMethodImplToReflectionCanGetArrayLength(Class<?> cls, String str, Object[] objArr) throws SecurityError {
        if (str.equals("getLength") && objArr.length == 1 && cls.isAssignableFrom(Array.class)) {
            Object obj = objArr[0];
            try {
                canGetField(obj, "length");
            } catch (SecurityError unused) {
                throw SecurityError.reflectCantGetField(obj, "length");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void add(SecurityGuard securityGuard) {
        this.securityGuards.add(securityGuard);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void canConstruct(Class<?> cls, Object[] objArr) throws SecurityError {
        Object[] objArrUnwrap = Primitive.unwrap(objArr);
        Iterator<SecurityGuard> it = this.securityGuards.iterator();
        while (it.hasNext()) {
            if (!it.next().canConstruct(cls, objArrUnwrap)) {
                throw SecurityError.cantConstruct(cls, objArrUnwrap);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void canExtends(Class<?> cls) {
        Iterator<SecurityGuard> it = this.securityGuards.iterator();
        while (it.hasNext()) {
            if (!it.next().canExtends(cls)) {
                throw SecurityError.cantExtends(cls);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void canGetField(Object obj, String str) {
        Iterator<SecurityGuard> it = this.securityGuards.iterator();
        while (it.hasNext()) {
            if (!it.next().canGetField(obj, str)) {
                throw SecurityError.cantGetField(obj, str);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void canGetStaticField(Class<?> cls, String str) {
        Iterator<SecurityGuard> it = this.securityGuards.iterator();
        while (it.hasNext()) {
            if (!it.next().canGetStaticField(cls, str)) {
                throw SecurityError.cantGetStaticField(cls, str);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void canImplements(Class<?> cls) {
        Iterator<SecurityGuard> it = this.securityGuards.iterator();
        while (it.hasNext()) {
            if (!it.next().canImplements(cls)) {
                throw SecurityError.cantImplements(cls);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void canInvokeLocalMethod(String str, Object[] objArr) {
        Object[] objArrUnwrap = Primitive.unwrap(objArr);
        Iterator<SecurityGuard> it = this.securityGuards.iterator();
        while (it.hasNext()) {
            if (!it.next().canInvokeLocalMethod(str, objArrUnwrap)) {
                throw SecurityError.cantInvokeLocalMethod(str, objArrUnwrap);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void canInvokeMethod(Object obj, String str, Object[] objArr) {
        Object[] objArrUnwrap = Primitive.unwrap(objArr);
        canInvokeMethodImpl(obj, str, objArrUnwrap);
        canInvokeMethodImplToReflectionCanSetField(obj, str, objArrUnwrap);
        canInvokeMethodImplToReflectionCanGetField(obj, str, objArrUnwrap);
        canInvokeMethodImplToReflectionCanConstruct(obj, str, objArrUnwrap);
        canInvokeMethodImplToReflectionCanInvokeMethod(obj, str, objArrUnwrap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void canInvokeStaticMethod(Class<?> cls, String str, Object[] objArr) {
        Object[] objArrUnwrap = Primitive.unwrap(objArr);
        canInvokeStaticMethodImpl(cls, str, objArrUnwrap);
        canInvokeStaticMethodImplToReflectionCanGetArrayLength(cls, str, objArrUnwrap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void canSetField(Object obj, String str, Object obj2) throws SecurityError {
        Object objUnwrap = Primitive.unwrap(obj2);
        Iterator<SecurityGuard> it = this.securityGuards.iterator();
        while (it.hasNext()) {
            if (!it.next().canSetField(obj, str, objUnwrap)) {
                throw SecurityError.cantSetField(obj, str, objUnwrap);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void canSetStaticField(Class<?> cls, String str, Object obj) throws SecurityError {
        Object objUnwrap = Primitive.unwrap(obj);
        Iterator<SecurityGuard> it = this.securityGuards.iterator();
        while (it.hasNext()) {
            if (!it.next().canSetStaticField(cls, str, objUnwrap)) {
                throw SecurityError.cantSetStaticField(cls, str, objUnwrap);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void remove(SecurityGuard securityGuard) {
        this.securityGuards.remove(securityGuard);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public class BasicSecurityGuard implements SecurityGuard {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private BasicSecurityGuard() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.security.SecurityGuard
        public boolean canConstruct(Class<?> cls, Object[] objArr) {
            return (MainSecurityGuard.class.isAssignableFrom(cls) || SecurityGuard.class.isAssignableFrom(cls)) ? false : true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.security.SecurityGuard
        public boolean canGetStaticField(Class<?> cls, String str) {
            return (cls == Interpreter.class && str.equals("mainSecurityGuard")) ? false : true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.security.SecurityGuard
        public boolean canImplements(Class<?> cls) {
            return cls != SecurityGuard.class;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.security.SecurityGuard
        public boolean canInvokeMethod(Object obj, String str, Object[] objArr) {
            return !(obj instanceof MainSecurityGuard);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.security.SecurityGuard
        public boolean canSetField(Object obj, String str, Object obj2) {
            return !(obj instanceof MainSecurityGuard);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.security.SecurityGuard
        public boolean canSetStaticField(Class<?> cls, String str, Object obj) {
            return (cls == Interpreter.class && str.equals("mainSecurityGuard")) ? false : true;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 bsh.security.MainSecurityGuard) A[MD:(bsh.security.MainSecurityGuard):void (m)] (LINE:7) call: bsh.security.MainSecurityGuard.BasicSecurityGuard.<init>(bsh.security.MainSecurityGuard):void type: THIS */
        public /* synthetic */ BasicSecurityGuard(MainSecurityGuard mainSecurityGuard, int i9) {
            this();
        }
    }
}
