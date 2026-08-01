package p236s3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p117X2.AbstractC1665j;
import p214o3.InterfaceC2798a;
import p225q3.InterfaceC2933d;
import p227r.C2981c0;
import p231r3.InterfaceC3151a;
import p231r3.InterfaceC3152b;
import p231r3.InterfaceC3153c;
import p248u3.C3343g;

/* JADX INFO: renamed from: s3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3186b implements InterfaceC2798a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2798a f9937a;

    /* JADX INFO: renamed from: b */
    public final C3185a f9938b;

    public C3186b(InterfaceC2798a interfaceC2798a) {
        AbstractC1665j.m2985e(interfaceC2798a, "element");
        this.f9937a = interfaceC2798a;
        InterfaceC2933d interfaceC2933dMo1486e = interfaceC2798a.mo1486e();
        AbstractC1665j.m2985e(interfaceC2933dMo1486e, "elementDesc");
        this.f9938b = new C3185a(interfaceC2933dMo1486e);
    }

    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: b */
    public Object mo1483b(InterfaceC3152b interfaceC3152b) {
        AbstractC1665j.m2985e(interfaceC3152b, "decoder");
        AbstractC1665j.m2985e(interfaceC3152b, "decoder");
        ArrayList arrayList = new ArrayList();
        AbstractC1665j.m2985e(arrayList, "<this>");
        int size = arrayList.size();
        C3343g c3343gMo5422a = interfaceC3152b.mo5422a(mo1486e());
        while (true) {
            int iM5590i = c3343gMo5422a.m5590i(mo1486e());
            if (iM5590i == -1) {
                c3343gMo5422a.m5596o(mo1486e());
                AbstractC1665j.m2985e(arrayList, "<this>");
                return arrayList;
            }
            int i5 = iM5590i + size;
            Object objM5594m = c3343gMo5422a.m5594m(mo1486e(), i5, this.f9937a, null);
            AbstractC1665j.m2985e(arrayList, "<this>");
            arrayList.add(i5, objM5594m);
        }
    }

    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: c */
    public void mo1484c(InterfaceC3153c interfaceC3153c, Object obj) {
        Collection collection = (Collection) obj;
        AbstractC1665j.m2985e(collection, "<this>");
        int size = collection.size();
        InterfaceC2933d interfaceC2933dMo1486e = mo1486e();
        AbstractC1665j.m2985e(interfaceC2933dMo1486e, "descriptor");
        InterfaceC3151a interfaceC3151aMo5177a = interfaceC3153c.mo5177a(interfaceC2933dMo1486e);
        Collection collection2 = (Collection) obj;
        AbstractC1665j.m2985e(collection2, "<this>");
        Iterator it = collection2.iterator();
        for (int i5 = 0; i5 < size; i5++) {
            ((C2981c0) interfaceC3151aMo5177a).m5192r(mo1486e(), i5, this.f9937a, it.next());
        }
        interfaceC3151aMo5177a.mo5185i(interfaceC2933dMo1486e);
    }

    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: e */
    public final InterfaceC2933d mo1486e() {
        return this.f9938b;
    }
}
