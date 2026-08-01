package p244qb;

import bsh.C1189h4;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p024b9.AbstractC1027c;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1064u0;
import p036c9.InterfaceC1400a;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5090l;
import p185m8.AbstractC5106t;

/* JADX INFO: renamed from: qb.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6380k extends AbstractC5090l {

    /* JADX INFO: renamed from: s */
    public static final b f20125s = new b(null);

    /* JADX INFO: renamed from: q */
    public Object f20126q;

    /* JADX INFO: renamed from: r */
    public int f20127r;

    /* JADX INFO: renamed from: qb.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final Iterator f20128q;

        public a(Object[] objArr) {
            objArr.getClass();
            this.f20128q = AbstractC1027c.m3774a(objArr);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20128q.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f20128q.next();
        }
    }

    /* JADX INFO: renamed from: qb.k$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final Object f20129q;

        /* JADX INFO: renamed from: r */
        public boolean f20130r = true;

        public c(Object obj) {
            this.f20129q = obj;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20130r;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f20130r) {
                this.f20130r = false;
                return this.f20129q;
            }
            C1189h4.m4429a();
            return null;
        }
    }

    public /* synthetic */ C6380k(AbstractC1043k abstractC1043k) {
        this();
    }

    /* JADX INFO: renamed from: c */
    public static final C6380k m25378c() {
        return f20125s.m25381a();
    }

    @Override // p185m8.AbstractC5090l
    /* JADX INFO: renamed from: a */
    public int mo500a() {
        return this.f20127r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        Object obj2;
        if (size() == 0) {
            this.f20126q = obj;
        } else if (size() != 1) {
            int size = size();
            Object obj3 = this.f20126q;
            if (size < 5) {
                obj3.getClass();
                Object[] objArr = (Object[]) obj3;
                if (AbstractC5106t.m20704R(objArr, obj)) {
                    return false;
                }
                if (size() == 4) {
                    LinkedHashSet linkedHashSetM20484f = AbstractC5068b1.m20484f(Arrays.copyOf(objArr, objArr.length));
                    linkedHashSetM20484f.add(obj);
                    obj2 = linkedHashSetM20484f;
                } else {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
                    objArrCopyOf[objArrCopyOf.length - 1] = obj;
                    obj2 = objArrCopyOf;
                }
                this.f20126q = obj2;
            } else {
                obj3.getClass();
                if (!AbstractC1064u0.m3857e(obj3).add(obj)) {
                    return false;
                }
            }
        } else {
            if (AbstractC1061t.m3842c(this.f20126q, obj)) {
                return false;
            }
            this.f20126q = new Object[]{this.f20126q, obj};
        }
        m25379e(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f20126q = null;
        m25379e(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return AbstractC1061t.m3842c(this.f20126q, obj);
        }
        int size = size();
        Object obj2 = this.f20126q;
        if (size < 5) {
            obj2.getClass();
            return AbstractC5106t.m20704R((Object[]) obj2, obj);
        }
        obj2.getClass();
        return ((Set) obj2).contains(obj);
    }

    /* JADX INFO: renamed from: e */
    public void m25379e(int i10) {
        this.f20127r = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new c(this.f20126q);
        }
        int size = size();
        Object obj = this.f20126q;
        if (size < 5) {
            obj.getClass();
            return new a((Object[]) obj);
        }
        obj.getClass();
        return AbstractC1064u0.m3857e(obj).iterator();
    }

    /* JADX INFO: renamed from: qb.k$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C6380k m25381a() {
            return new C6380k(null);
        }

        /* JADX INFO: renamed from: b */
        public final C6380k m25382b(Collection collection) {
            collection.getClass();
            C6380k c6380k = new C6380k(null);
            c6380k.addAll(collection);
            return c6380k;
        }

        public b() {
        }
    }

    public C6380k() {
    }
}
