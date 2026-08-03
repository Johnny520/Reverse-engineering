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
    public final /* synthetic */ int f561a;

    /* JADX INFO: renamed from: b */
    public final Object f562b;

    /* JADX INFO: renamed from: c */
    public final Object f563c;

    public C0268i(File r2) {
        this.f561a = 0;
        EnumC0269j r02 = EnumC0269j.f564a;
        this.f562b = r2;
        this.f563c = r02;
    }

    @Override // p040V0.InterfaceC0405h
    public final Iterator iterator() {
        switch(this.f561a) {
            case 0: goto L13;
            case 1: goto L11;
            default: goto L4;
        };
    L4:
        InterfaceC0405h r1 = (InterfaceC0405h) this.f562b;
        AbstractC0307g.m703e(r1, "<this>");
        ArrayList r02 = new ArrayList();
        Iterator r12 = r1.iterator();
    L6:
        if (r12.hasNext() == false) goto L8;
        r02.add(r12.next());
        goto L6
    L8:
        AbstractC0187r.m560l0(r02, (Comparator) this.f563c);
        return r02.iterator();
    L11:
        return new C0404g(this);
    L13:
        return new C0266g(this);
    }

    public C0268i(C0420e r2) {
        this.f561a = 1;
        C0421f r02 = C0421f.f938i;
        this.f562b = r2;
        this.f563c = r02;
    }

    public C0268i(C0402e r2, Comparator r3) {
        this.f561a = 2;
        this.f562b = r2;
        this.f563c = r3;
    }
}
