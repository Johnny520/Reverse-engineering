package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: j1 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0275j1 implements InterfaceC0199e8, InterfaceC0041c8 {

    /* JADX INFO: renamed from: a */
    public final Class f452a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        List listAsList = Arrays.asList(InterfaceC0279j5.class, InterfaceC0482u5.class, InterfaceC0546y5.class, InterfaceC0562z5.class, InterfaceC0007a6.class, InterfaceC0023b6.class, InterfaceC0039c6.class, InterfaceC0181d6.class, InterfaceC0197e6.class, InterfaceC0213f6.class, InterfaceC0295k5.class, InterfaceC0311l5.class, InterfaceC0327m5.class, InterfaceC0343n5.class, InterfaceC0359o5.class, InterfaceC0402p5.class, InterfaceC0418q5.class, InterfaceC0434r5.class, InterfaceC0450s5.class, InterfaceC0466t5.class, InterfaceC0498v5.class, InterfaceC0514w5.class, InterfaceC0530x5.class);
        listAsList.getClass();
        ArrayList<C0455sa> arrayList = new ArrayList(AbstractC0276j2.m703i2(listAsList));
        int i = 0;
        for (Object obj : listAsList) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new C0455sa((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        int size = arrayList.size();
        if (size != 0) {
            if (size == 1) {
                C0455sa c0455sa = (C0455sa) arrayList.get(0);
                c0455sa.getClass();
                Collections.singletonMap(c0455sa.f859a, c0455sa.f860b).getClass();
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0486u9.m1068u(arrayList.size()));
                for (C0455sa c0455sa2 : arrayList) {
                    linkedHashMap.put(c0455sa2.f859a, c0455sa2.f860b);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0275j1(Class cls) {
        cls.getClass();
        this.f452a = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C0275j1) && AbstractC0260i5.m668x0(this).equals(AbstractC0260i5.m668x0((C0275j1) obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return AbstractC0260i5.m668x0(this).hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f452a + " (Kotlin reflection is not available)";
    }
}
