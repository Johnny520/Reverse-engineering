package qa;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: qa.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C6357n extends AbstractList implements RandomAccess, InterfaceC6358o {

    /* JADX INFO: renamed from: r */
    public static final InterfaceC6358o f20025r = new C6357n().mo25272n();

    /* JADX INFO: renamed from: q */
    public final List f20026q;

    public C6357n(InterfaceC6358o interfaceC6358o) {
        this.f20026q = new ArrayList(interfaceC6358o.size());
        addAll(interfaceC6358o);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC6348e m25263c(Object obj) {
        return obj instanceof AbstractC6348e ? (AbstractC6348e) obj : obj instanceof String ? AbstractC6348e.m25039l((String) obj) : AbstractC6348e.m25037e((byte[]) obj);
    }

    /* JADX INFO: renamed from: d */
    public static String m25264d(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC6348e ? ((AbstractC6348e) obj).m25053z() : AbstractC6354k.m25250b((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        this.f20026q.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        if (collection instanceof InterfaceC6358o) {
            collection = ((InterfaceC6358o) collection).mo25267g();
        }
        boolean zAddAll = this.f20026q.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f20026q.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f20026q.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC6348e) {
            AbstractC6348e abstractC6348e = (AbstractC6348e) obj;
            String strM25053z = abstractC6348e.m25053z();
            if (abstractC6348e.mo25047s()) {
                this.f20026q.set(i10, strM25053z);
            }
            return strM25053z;
        }
        byte[] bArr = (byte[]) obj;
        String strM25250b = AbstractC6354k.m25250b(bArr);
        if (AbstractC6354k.m25249a(bArr)) {
            this.f20026q.set(i10, strM25250b);
        }
        return strM25250b;
    }

    @Override // qa.InterfaceC6358o
    /* JADX INFO: renamed from: g */
    public List mo25267g() {
        return Collections.unmodifiableList(this.f20026q);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        Object objRemove = this.f20026q.remove(i10);
        ((AbstractList) this).modCount++;
        return m25264d(objRemove);
    }

    @Override // qa.InterfaceC6358o
    /* JADX INFO: renamed from: j */
    public void mo25269j(AbstractC6348e abstractC6348e) {
        this.f20026q.add(abstractC6348e);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        return m25264d(this.f20026q.set(i10, str));
    }

    @Override // qa.InterfaceC6358o
    /* JADX INFO: renamed from: m */
    public AbstractC6348e mo25271m(int i10) {
        Object obj = this.f20026q.get(i10);
        AbstractC6348e abstractC6348eM25263c = m25263c(obj);
        if (abstractC6348eM25263c != obj) {
            this.f20026q.set(i10, abstractC6348eM25263c);
        }
        return abstractC6348eM25263c;
    }

    @Override // qa.InterfaceC6358o
    /* JADX INFO: renamed from: n */
    public InterfaceC6358o mo25272n() {
        return new C6367x(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f20026q.size();
    }

    public C6357n() {
        this.f20026q = new ArrayList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
