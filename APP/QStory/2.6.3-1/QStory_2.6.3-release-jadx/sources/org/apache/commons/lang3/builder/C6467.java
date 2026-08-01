package org.apache.commons.lang3.builder;

import bsh.C3466;
import com.alibaba.fastjson2.reader.C3533;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;
import org.apache.commons.lang3.AbstractC6516;
import org.apache.commons.lang3.C6520;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: org.apache.commons.lang3.builder.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6467 extends C6466 {
    @Override // org.apache.commons.lang3.builder.C6466
    public final String toString() {
        boolean zAnyMatch = Stream.empty().anyMatch(new C6520(1));
        Object obj = this.f15864;
        if (zAnyMatch) {
            ToStringStyle.unregister(obj);
            C6755.m11870("includeFieldNames and excludeFieldNames must not intersect");
            return null;
        }
        Class<?> superclass = obj.getClass();
        m11585(superclass);
        while (superclass.getSuperclass() != null) {
            superclass = superclass.getSuperclass();
            m11585(superclass);
        }
        return super.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m11585(Class cls) {
        boolean z;
        boolean zIsArray = cls.isArray();
        StringBuffer stringBuffer = this.f15865;
        ToStringStyle toStringStyle = this.f15863;
        Object obj = this.f15864;
        if (zIsArray) {
            toStringStyle.reflectionAppendArrayDetail(stringBuffer, null, obj);
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        Comparator comparatorComparing = Comparator.comparing(new C3533(19));
        if (declaredFields != null) {
            Arrays.sort(declaredFields, comparatorComparing);
        }
        AccessibleObject.setAccessible(declaredFields, true);
        for (Field field : declaredFields) {
            String name = field.getName();
            if (field.getName().indexOf(36) == -1 && !Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                z = !AbstractC6516.m11611(null) ? Arrays.binarySearch((Object[]) null, field.getName()) >= 0 : !field.isAnnotationPresent(InterfaceC6465.class);
            }
            if (z) {
                try {
                    toStringStyle.append(stringBuffer, name, field.get(obj), Boolean.valueOf(!field.isAnnotationPresent(InterfaceC6464.class)));
                } catch (IllegalAccessException e) {
                    C3466.m5897(e);
                    return;
                }
            }
        }
    }
}
