package p026N0;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import p009E0.AbstractC0187r;
import p031Q0.AbstractC0307g;
import p040V0.C0402e;
import p040V0.C0404g;
import p040V0.InterfaceC0405h;
import p042W0.C0420e;
import p042W0.C0421f;

/* JADX INFO: renamed from: N0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0268i implements InterfaceC0405h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f561a = 2;

    /* JADX INFO: renamed from: b */
    public final Object f562b;

    /* JADX INFO: renamed from: c */
    public final Object f563c;

    public C0268i(File file) {
        EnumC0269j enumC0269j = EnumC0269j.f564a;
        this.f562b = file;
        this.f563c = enumC0269j;
    }

    @Override // p040V0.InterfaceC0405h
    public final Iterator iterator() {
        switch (this.f561a) {
            case 0:
                return new C0266g(this);
            case 1:
                return new C0404g(this);
            default:
                InterfaceC0405h interfaceC0405h = (InterfaceC0405h) this.f562b;
                AbstractC0307g.m703e(interfaceC0405h, "<this>");
                ArrayList arrayList = new ArrayList();
                Iterator it = interfaceC0405h.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                AbstractC0187r.m560l0(arrayList, (Comparator) this.f563c);
                return arrayList.iterator();
        }
    }

    public C0268i(C0420e c0420e) {
        C0421f c0421f = C0421f.f938i;
        this.f562b = c0420e;
        this.f563c = c0421f;
    }

    public C0268i(C0402e c0402e, Comparator comparator) {
        this.f562b = c0402e;
        this.f563c = comparator;
    }
}
