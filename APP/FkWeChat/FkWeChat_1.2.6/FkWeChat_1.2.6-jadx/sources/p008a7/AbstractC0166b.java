package p008a7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p300uc.InterfaceC8659m;

/* JADX INFO: renamed from: a7.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0166b {
    /* JADX INFO: renamed from: a */
    public static final List m395a(InterfaceC8659m interfaceC8659m) {
        interfaceC8659m.getClass();
        List listM394a = AbstractC0165a.m394a();
        ArrayList arrayList = new ArrayList();
        Iterator it = listM394a.iterator();
        while (it.hasNext()) {
            InterfaceC0169e interfaceC0169eMo406a = ((InterfaceC0170f) it.next()).mo406a(interfaceC8659m);
            if (interfaceC0169eMo406a != null) {
                arrayList.add(interfaceC0169eMo406a);
            }
        }
        return arrayList;
    }
}
