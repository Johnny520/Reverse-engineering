package org.apache.commons.lang3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.apache.commons.lang3.builder.C6466;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.commons.lang3.exception.UncheckedException;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
class AnnotationUtils$1 extends ToStringStyle {
    private static final long serialVersionUID = 1;

    public AnnotationUtils$1() {
        setDefaultFullDetail(true);
        setArrayContentDetail(true);
        setUseClassName(true);
        setUseShortClassName(true);
        setUseIdentityHashCode(false);
        setContentStart("(");
        setContentEnd(")");
        setFieldSeparator(", ");
        setArrayStart("[");
        setArrayEnd("]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getShortClassName$0(Class cls) {
        return "@".concat(cls.getName());
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, Object obj) {
        if (obj instanceof Annotation) {
            Annotation annotation = (Annotation) obj;
            ToStringStyle toStringStyle = AbstractC6518.f15965;
            C6466 c6466 = new C6466(annotation, AbstractC6518.f15965);
            for (Method method : annotation.annotationType().getDeclaredMethods()) {
                if (method.getParameterTypes().length <= 0) {
                    try {
                        c6466.f15863.append(c6466.f15865, method.getName(), method.invoke(annotation, null), (Boolean) null);
                    } catch (ReflectiveOperationException e) {
                        throw new UncheckedException(e);
                    }
                }
            }
            obj = c6466.toString();
        }
        super.appendDetail(stringBuffer, str, obj);
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public String getShortClassName(Class<?> cls) {
        ArrayList arrayList;
        HashMap map = AbstractC6531.f15984;
        if (cls == null) {
            arrayList = null;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC6531.m11620(cls, linkedHashSet);
            arrayList = new ArrayList(linkedHashSet);
        }
        int i = 0;
        return (String) arrayList.stream().filter(new C6520(i)).findFirst().map(new C6519(i)).orElse("");
    }
}
