package org.apache.commons.lang3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.apache.commons.lang3.builder.C5635;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.commons.lang3.exception.UncheckedException;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
            ToStringStyle toStringStyle = AbstractC5687.f15620;
            C5635 c5635 = new C5635(annotation, AbstractC5687.f15620);
            for (Method method : annotation.annotationType().getDeclaredMethods()) {
                if (method.getParameterTypes().length <= 0) {
                    try {
                        c5635.f15518.append(c5635.f15520, method.getName(), method.invoke(annotation, null), (Boolean) null);
                    } catch (ReflectiveOperationException e) {
                        throw new UncheckedException(e);
                    }
                }
            }
            obj = c5635.toString();
        }
        super.appendDetail(stringBuffer, str, obj);
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public String getShortClassName(Class<?> cls) {
        ArrayList arrayList;
        HashMap map = AbstractC5700.f15639;
        if (cls == null) {
            arrayList = null;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC5700.m11004(cls, linkedHashSet);
            arrayList = new ArrayList(linkedHashSet);
        }
        int i = 0;
        return (String) arrayList.stream().filter(new C5689(i)).findFirst().map(new C5688(i)).orElse("");
    }
}
