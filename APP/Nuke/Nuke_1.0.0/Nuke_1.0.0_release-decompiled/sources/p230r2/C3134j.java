package p230r2;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import p213o2.AbstractC2770B;
import p219p2.InterfaceC2891b;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C3134j extends AbstractC2770B {

    /* JADX INFO: renamed from: d */
    public static final C3133i f9869d = new C3133i();

    /* JADX INFO: renamed from: a */
    public final HashMap f9870a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f9871b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f9872c = new HashMap();

    public C3134j(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i5 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i5] = field;
                    i5++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i5);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r4 = (Enum) field2.get(null);
                String strName = r4.name();
                String string = r4.toString();
                InterfaceC2891b interfaceC2891b = (InterfaceC2891b) field2.getAnnotation(InterfaceC2891b.class);
                if (interfaceC2891b != null) {
                    strName = interfaceC2891b.value();
                    for (String str : interfaceC2891b.alternate()) {
                        this.f9870a.put(str, r4);
                    }
                }
                this.f9870a.put(strName, r4);
                this.f9871b.put(string, r4);
                this.f9872c.put(r4, strName);
            }
        } catch (IllegalAccessException e5) {
            throw new AssertionError(e5);
        }
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) throws IOException {
        if (c3390a.m5630J() == 9) {
            c3390a.m5626F();
            return null;
        }
        String strM5628H = c3390a.m5628H();
        Enum r02 = (Enum) this.f9870a.get(strM5628H);
        return r02 == null ? (Enum) this.f9871b.get(strM5628H) : r02;
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        Enum r32 = (Enum) obj;
        c3391b.m5655E(r32 == null ? null : (String) this.f9872c.get(r32));
    }
}
