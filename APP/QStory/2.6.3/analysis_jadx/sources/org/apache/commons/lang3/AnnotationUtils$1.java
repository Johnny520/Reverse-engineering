package org.apache.commons.lang3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.apache.commons.lang3.builder.C5636;
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
            ToStringStyle toStringStyle = AbstractC5688.f15620;
            C5636 c5636 = new C5636(annotation, AbstractC5688.f15620);
            for (Method method : annotation.annotationType().getDeclaredMethods()) {
                if (method.getParameterTypes().length <= 0) {
                    try {
                        c5636.f15518.append(c5636.f15520, method.getName(), method.invoke(annotation, null), (Boolean) null);
                    } catch (ReflectiveOperationException e) {
                        throw new UncheckedException(e);
                    }
                }
            }
            obj = c5636.toString();
        }
        super.appendDetail(stringBuffer, str, obj);
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public String getShortClassName(Class<?> cls) {
        ArrayList arrayList;
        HashMap map = AbstractC5701.f15639;
        if (cls == null) {
            arrayList = null;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC5701.m11061(cls, linkedHashSet);
            arrayList = new ArrayList(linkedHashSet);
        }
        int i = 0;
        return (String) arrayList.stream().filter(new C5690(i)).findFirst().map(new C5689(i)).orElse("");
    }
}
