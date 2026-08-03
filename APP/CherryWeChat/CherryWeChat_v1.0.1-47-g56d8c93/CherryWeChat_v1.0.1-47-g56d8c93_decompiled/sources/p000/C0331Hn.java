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

    public C0331Hn(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m325a();
        this.f1133b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC0172E, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f1133b.size(), collection);
    }

    @Override // p000.AbstractC0172E, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m325a();
        this.f1133b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.InterfaceC0374In
    /* JADX INFO: renamed from: d */
    public final void mo715d(AbstractC2744y6 abstractC2744y6) {
        m325a();
        this.f1133b.add(abstractC2744y6);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.InterfaceC0458Kl
    /* JADX INFO: renamed from: f */
    public final InterfaceC0458Kl mo716f(int i) {
        ArrayList arrayList = this.f1133b;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new C0331Hn(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.f1133b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof AbstractC2744y6)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, AbstractC0501Ll.f1637a);
            if (AbstractC2536tD.f8842a.m1362s(bArr, 0, bArr.length)) {
                arrayList.set(i, str2);
            }
            return str2;
        }
        AbstractC2744y6 abstractC2744y6 = (AbstractC2744y6) obj;
        Charset charset = AbstractC0501Ll.f1637a;
        if (abstractC2744y6.size() == 0) {
            str = "";
        } else {
            C2701x6 c2701x6 = (C2701x6) abstractC2744y6;
            str = new String(c2701x6.f9275d, c2701x6.mo5222h(), c2701x6.size(), charset);
        }
        C2701x6 c2701x62 = (C2701x6) abstractC2744y6;
        int iMo5222h = c2701x62.mo5222h();
        if (AbstractC2536tD.f8842a.m1362s(c2701x62.f9275d, iMo5222h, c2701x62.size() + iMo5222h)) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // p000.InterfaceC0374In
    /* JADX INFO: renamed from: l */
    public final InterfaceC0374In mo717l() {
        return this.f453a ? new C1254cD(this) : this;
    }

    @Override // p000.InterfaceC0374In
    /* JADX INFO: renamed from: m */
    public final Object mo718m(int i) {
        return this.f1133b.get(i);
    }

    @Override // p000.InterfaceC0374In
    /* JADX INFO: renamed from: o */
    public final List mo719o() {
        return Collections.unmodifiableList(this.f1133b);
    }

    @Override // p000.AbstractC0172E, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m325a();
        Object objRemove = this.f1133b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof AbstractC2744y6)) {
            return new String((byte[]) objRemove, AbstractC0501Ll.f1637a);
        }
        AbstractC2744y6 abstractC2744y6 = (AbstractC2744y6) objRemove;
        Charset charset = AbstractC0501Ll.f1637a;
        if (abstractC2744y6.size() == 0) {
            return "";
        }
        C2701x6 c2701x6 = (C2701x6) abstractC2744y6;
        return new String(c2701x6.f9275d, c2701x6.mo5222h(), c2701x6.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m325a();
        Object obj2 = this.f1133b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof AbstractC2744y6)) {
            return new String((byte[]) obj2, AbstractC0501Ll.f1637a);
        }
        AbstractC2744y6 abstractC2744y6 = (AbstractC2744y6) obj2;
        Charset charset = AbstractC0501Ll.f1637a;
        if (abstractC2744y6.size() == 0) {
            return "";
        }
        C2701x6 c2701x6 = (C2701x6) abstractC2744y6;
        return new String(c2701x6.f9275d, c2701x6.mo5222h(), c2701x6.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1133b.size();
    }

    public C0331Hn(ArrayList arrayList) {
        this.f1133b = arrayList;
    }

    @Override // p000.AbstractC0172E, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m325a();
        if (collection instanceof InterfaceC0374In) {
            collection = ((InterfaceC0374In) collection).mo719o();
        }
        boolean zAddAll = this.f1133b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
