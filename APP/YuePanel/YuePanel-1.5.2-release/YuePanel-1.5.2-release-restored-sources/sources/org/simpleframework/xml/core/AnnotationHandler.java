package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes2.dex */
class AnnotationHandler implements InvocationHandler {
    private static final String ATTRIBUTE = "attribute";
    private static final String CLASS = "annotationType";
    private static final String EQUAL = "equals";
    private static final String REQUIRED = "required";
    private static final String STRING = "toString";
    private final boolean attribute;
    private final Comparer comparer;
    private final boolean required;
    private final Class type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AnnotationHandler(Class cls) {
        this(cls, true);
    }

    private void attributes(StringBuilder sb) {
        Method[] declaredMethods = this.type.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            String name = declaredMethods[i].getName();
            Object objValue = value(declaredMethods[i]);
            if (i > 0) {
                sb.append(',');
                sb.append(' ');
            }
            sb.append(name);
            sb.append(SignatureVisitor.INSTANCEOF);
            sb.append(objValue);
        }
        sb.append(')');
    }

    private boolean equals(Object obj, Object[] objArr) throws Throwable {
        Annotation annotation = (Annotation) obj;
        Annotation annotation2 = (Annotation) objArr[0];
        if (annotation.annotationType() == annotation2.annotationType()) {
            return this.comparer.equals(annotation, annotation2);
        }
        throw new PersistenceException("Annotation %s is not the same as %s", annotation, annotation2);
    }

    private void name(StringBuilder sb) {
        String name = this.type.getName();
        sb.append('@');
        sb.append(name);
        sb.append('(');
    }

    private Object value(Method method) {
        String name = method.getName();
        return name.equals(REQUIRED) ? Boolean.valueOf(this.required) : name.equals(ATTRIBUTE) ? Boolean.valueOf(this.attribute) : method.getDefaultValue();
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String name = method.getName();
        return name.equals(STRING) ? toString() : name.equals(EQUAL) ? Boolean.valueOf(equals(obj, objArr)) : name.equals(CLASS) ? this.type : name.equals(REQUIRED) ? Boolean.valueOf(this.required) : name.equals(ATTRIBUTE) ? Boolean.valueOf(this.attribute) : method.getDefaultValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            name(sb);
            attributes(sb);
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AnnotationHandler(Class cls, boolean z) {
        this(cls, z, false);
    }

    public AnnotationHandler(Class cls, boolean z, boolean z2) {
        this.comparer = new Comparer();
        this.attribute = z2;
        this.required = z;
        this.type = cls;
    }
}
