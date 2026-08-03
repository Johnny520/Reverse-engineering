package p151k6;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import p105h6.AbstractC1622n;
import p123i6.InterfaceC1990b;
import p136j8.C2104o;
import p208o6.C3066a;

/* JADX INFO: renamed from: k6.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2297j extends AbstractC1622n {

    /* JADX INFO: renamed from: d */
    public static final C2295i f7618d = new C2295i();

    /* JADX INFO: renamed from: a */
    public final HashMap f7619a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f7620b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f7621c = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2297j(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i9 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i9] = field;
                    i9++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i9);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String strName = r42.name();
                String string = r42.toString();
                InterfaceC1990b interfaceC1990b = (InterfaceC1990b) field2.getAnnotation(InterfaceC1990b.class);
                if (interfaceC1990b != null) {
                    strName = interfaceC1990b.value();
                    for (String str : interfaceC1990b.alternate()) {
                        this.f7619a.put(str, r42);
                    }
                }
                this.f7619a.put(strName, r42);
                this.f7620b.put(string, r42);
                this.f7621c.put(r42, strName);
            }
        } catch (IllegalAccessException e6) {
            C2104o.m5281f(e6);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.AbstractC1622n
    /* JADX INFO: renamed from: b */
    public final void mo4127b(C3066a c3066a, Object obj) throws IOException {
        Enum r32 = (Enum) obj;
        c3066a.m6516x(r32 == null ? null : (String) this.f7621c.get(r32));
    }
}
