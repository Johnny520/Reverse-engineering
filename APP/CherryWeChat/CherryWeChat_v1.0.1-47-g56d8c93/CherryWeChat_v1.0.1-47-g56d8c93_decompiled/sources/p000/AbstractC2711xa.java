package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: xa */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2711xa extends AbstractC2668wa {
    /* JADX INFO: renamed from: e0 */
    public static void m5283e0(ArrayList arrayList, InterfaceC1416fj interfaceC1416fj) {
        int iM4976a0;
        if (arrayList == null) {
            if ((arrayList instanceof InterfaceC0545Mm) && !(arrayList instanceof InterfaceC0588Nm)) {
                AbstractC0828TB.m1631I("kotlin.collections.MutableIterable", arrayList);
                throw null;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Boolean) interfaceC1416fj.mo90g(it.next())).booleanValue()) {
                    it.remove();
                }
            }
            return;
        }
        int iM4976a02 = AbstractC2496sa.m4976a0(arrayList);
        int i = 0;
        if (iM4976a02 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = arrayList.get(i);
                if (!((Boolean) interfaceC1416fj.mo90g(obj)).booleanValue()) {
                    if (i2 != i) {
                        arrayList.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iM4976a02) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= arrayList.size() || i > (iM4976a0 = AbstractC2496sa.m4976a0(arrayList))) {
            return;
        }
        while (true) {
            arrayList.remove(iM4976a0);
            if (iM4976a0 == i) {
                return;
            } else {
                iM4976a0--;
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m5284f0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        arrayList.remove(AbstractC2496sa.m4976a0(arrayList));
    }
}
