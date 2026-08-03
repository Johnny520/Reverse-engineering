package p040V0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p031Q0.AbstractC0307g;
import p033R0.InterfaceC0319a;

/* JADX INFO: renamed from: V0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0401d implements Iterator, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f891a;

    /* JADX INFO: renamed from: b */
    public final Iterator f892b;

    /* JADX INFO: renamed from: c */
    public int f893c;

    /* JADX INFO: renamed from: d */
    public Object f894d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0405h f895e;

    public C0401d(C0402e r2) {
        this.f891a = 0;
        this.f895e = r2;
        this.f892b = r2.f896a.iterator();
        this.f893c = -1;
    }

    /* JADX INFO: renamed from: a */
    public void m987a() {
    L2:
        Iterator r02 = this.f892b;
        if (r02.hasNext() == false) goto L8;
        Object r03 = r02.next();
        C0402e r1 = (C0402e) this.f895e;
        if (((Boolean) r1.f898c.invoke(r03)).booleanValue() != r1.f897b) goto L2;
        this.f894d = r03;
        this.f893c = 1;
        return;
    L8:
        this.f893c = 0;
    }

    /* JADX INFO: renamed from: b */
    public boolean m988b() {
        Iterator r02 = (Iterator) this.f894d;
        if (r02 == null) goto L8;
        if (r02.hasNext() == false) goto L8;
        this.f893c = 1;
        return true;
    L8:
        Iterator r03 = this.f892b;
        if (r03.hasNext() == false) goto L14;
        Object r04 = r03.next();
        C0403f r2 = (C0403f) this.f895e;
        r2.getClass();
        Iterator r05 = (Iterator) C0411n.f911i.invoke(r2.f901c.invoke(r04));
        if (r05.hasNext() == false) goto L8;
        this.f894d = r05;
        this.f893c = 1;
        return true;
    L14:
        this.f893c = 2;
        this.f894d = null;
        return false;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch(this.f891a) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        int r02 = this.f893c;
        if (r02 != 1) goto L8;
        return true;
    L8:
        if (r02 != 2) goto L11;
        return false;
    L11:
        return m988b();
    L13:
        if (this.f893c != (-1)) goto L16;
        m987a();
    L16:
        if (this.f893c == 1) goto L22;
        return false;
    L22:
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch(this.f891a) {
            case 0: goto L17;
            default: goto L4;
        };
    L4:
        int r02 = this.f893c;
        if (r02 == 2) goto L15;
        if (r02 == 0) goto L8;
    L12:
        this.f893c = 0;
        Iterator r03 = (Iterator) this.f894d;
        AbstractC0307g.m700b(r03);
        return r03.next();
    L8:
        if (m988b() == true) goto L12;
        throw new NoSuchElementException();
    L15:
        throw new NoSuchElementException();
    L17:
        if (this.f893c != (-1)) goto L20;
        m987a();
    L20:
        if (this.f893c == 0) goto L24;
        Object r04 = this.f894d;
        this.f894d = null;
        this.f893c = -1;
        return r04;
    L24:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch(this.f891a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L7:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C0401d(C0403f r2) {
        this.f891a = 1;
        this.f895e = r2;
        this.f892b = r2.f900b.iterator();
    }
}
