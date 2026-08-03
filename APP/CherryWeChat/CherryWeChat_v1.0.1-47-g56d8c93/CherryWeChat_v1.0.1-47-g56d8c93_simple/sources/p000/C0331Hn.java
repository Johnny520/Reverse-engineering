package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: Hn */
/* JADX INFO: loaded from: classes.dex */
public final class C0331Hn extends AbstractC0172E implements InterfaceC0374In, RandomAccess {

    /* JADX INFO: renamed from: b */
    public final ArrayList f1133b;

    static {
        new C0331Hn(10).f453a = false;
    }

    public C0331Hn(int r2) {
        this(new ArrayList(r2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r2, Object r3) {
        m325a();
        this.f1133b.add(r2, (String) r3);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC0172E, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection r2) {
        return addAll(this.f1133b.size(), r2);
    }

    @Override // p000.AbstractC0172E, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m325a();
        this.f1133b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.InterfaceC0374In
    /* JADX INFO: renamed from: d */
    public final void mo715d(AbstractC2744y6 r2) {
        m325a();
        this.f1133b.add(r2);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.InterfaceC0458Kl
    /* JADX INFO: renamed from: f */
    public final InterfaceC0458Kl mo716f(int r3) {
        ArrayList r0 = this.f1133b;
        if (r3 < r0.size()) goto L7;
        ArrayList r1 = new ArrayList(r3);
        r1.addAll(r0);
        return new C0331Hn(r1);
    L7:
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r8) {
        ArrayList r0 = this.f1133b;
        Object r1 = r0.get(r8);
        if ((r1 instanceof String) == false) goto L7;
        return (String) r1;
    L7:
        if ((r1 instanceof AbstractC2744y6) == false) goto L16;
        AbstractC2744y6 r12 = (AbstractC2744y6) r1;
        Charset r2 = AbstractC0501Ll.f1637a;
        if (r12.size() != 0) goto L11;
        String r22 = "";
    L12:
        C2701x6 r13 = (C2701x6) r12;
        int r3 = r13.mo5222h();
        byte[] r4 = r13.f9275d;
        int r14 = r13.size() + r3;
        if (AbstractC2536tD.f8842a.m1362s(r4, r3, r14) == false) goto L15;
        r0.set(r8, r22);
    L15:
        return r22;
    L11:
        C2701x6 r32 = (C2701x6) r12;
        r22 = new String(r32.f9275d, r32.mo5222h(), r32.size(), r2);
        goto L12
    L16:
        byte[] r15 = (byte[]) r1;
        String r23 = new String(r15, AbstractC0501Ll.f1637a);
        if (AbstractC2536tD.f8842a.m1362s(r15, 0, r15.length) == false) goto L19;
        r0.set(r8, r23);
    L19:
        return r23;
    }

    @Override // p000.InterfaceC0374In
    /* JADX INFO: renamed from: l */
    public final InterfaceC0374In mo717l() {
        if (this.f453a == true) goto L5;
        return this;
    L5:
        return new C1254cD(this);
    }

    @Override // p000.InterfaceC0374In
    /* JADX INFO: renamed from: m */
    public final Object mo718m(int r2) {
        return this.f1133b.get(r2);
    }

    @Override // p000.InterfaceC0374In
    /* JADX INFO: renamed from: o */
    public final List mo719o() {
        return Collections.unmodifiableList(this.f1133b);
    }

    @Override // p000.AbstractC0172E, java.util.AbstractList, java.util.List
    public final Object remove(int r5) {
        m325a();
        Object r52 = this.f1133b.remove(r5);
        ((AbstractList) this).modCount++;
        if ((r52 instanceof String) == false) goto L7;
        return (String) r52;
    L7:
        if ((r52 instanceof AbstractC2744y6) == false) goto L15;
        AbstractC2744y6 r53 = (AbstractC2744y6) r52;
        Charset r0 = AbstractC0501Ll.f1637a;
        if (r53.size() != 0) goto L12;
        return "";
    L12:
        C2701x6 r54 = (C2701x6) r53;
        return new String(r54.f9275d, r54.mo5222h(), r54.size(), r0);
    L15:
        return new String((byte[]) r52, AbstractC0501Ll.f1637a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int r4, Object r5) {
        m325a();
        ArrayList r0 = this.f1133b;
        Object r42 = r0.set(r4, (String) r5);
        if ((r42 instanceof String) == false) goto L7;
        return (String) r42;
    L7:
        if ((r42 instanceof AbstractC2744y6) == false) goto L15;
        AbstractC2744y6 r43 = (AbstractC2744y6) r42;
        Charset r52 = AbstractC0501Ll.f1637a;
        if (r43.size() != 0) goto L12;
        return "";
    L12:
        C2701x6 r44 = (C2701x6) r43;
        return new String(r44.f9275d, r44.mo5222h(), r44.size(), r52);
    L15:
        return new String((byte[]) r42, AbstractC0501Ll.f1637a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1133b.size();
    }

    public C0331Hn(ArrayList r1) {
        this.f1133b = r1;
    }

    @Override // p000.AbstractC0172E, java.util.AbstractList, java.util.List
    public final boolean addAll(int r2, Collection r3) {
        m325a();
        if ((r3 instanceof InterfaceC0374In) == false) goto L5;
        r3 = ((InterfaceC0374In) r3).mo719o();
    L5:
        boolean r22 = this.f1133b.addAll(r2, r3);
        ((AbstractList) this).modCount++;
        return r22;
    }
}
