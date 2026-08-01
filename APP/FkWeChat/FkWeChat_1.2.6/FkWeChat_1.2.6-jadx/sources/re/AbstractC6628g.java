package re;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import me.InterfaceC5162a;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: re.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6628g {
    /* JADX INFO: renamed from: a */
    public abstract List mo8786a();

    /* JADX INFO: renamed from: b */
    public final Collection m26260b(AbstractC6630i abstractC6630i, List list, InterfaceC5162a interfaceC5162a) {
        abstractC6630i.getClass();
        list.getClass();
        interfaceC5162a.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList<List> arrayList2 = new ArrayList();
        arrayList2.add(list);
        for (InterfaceC6627f interfaceC6627f : mo8786a()) {
            interfaceC5162a.mo21175a();
            ArrayList arrayList3 = new ArrayList();
            for (List list2 : arrayList2) {
                list2.getClass();
                InterfaceC6627f.b bVarMo26237a = interfaceC6627f.mo26237a(abstractC6630i, list2);
                arrayList.addAll(bVarMo26237a.mo26251b());
                arrayList3.addAll(bVarMo26237a.mo26250a());
            }
            arrayList2 = arrayList3;
        }
        return arrayList;
    }
}
