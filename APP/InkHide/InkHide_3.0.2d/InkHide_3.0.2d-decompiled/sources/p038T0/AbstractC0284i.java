package p038T0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p006D.AbstractC0079h;
import p011F0.C0122j;
import p011F0.C0131s;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: T0.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0284i extends AbstractC0285j {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static String m497Y(C0122j c0122j) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : c0122j) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) ",");
            }
            AbstractC0079h.m180d(sb, obj, null);
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        AbstractC0223g.m417d(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static List m498Z(InterfaceC0283h interfaceC0283h) {
        Iterator it = interfaceC0283h.iterator();
        if (!it.hasNext()) {
            return C0131s.f426a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0079h.m167E(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
