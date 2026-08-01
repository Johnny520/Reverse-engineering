package p302ue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.luckypray.dexkit.C5823a;
import p010a9.InterfaceC0173a;
import p069ef.InterfaceC2219d;
import p172l8.AbstractC4713t;
import p172l8.C4712s;
import p185m8.AbstractC5116y;

/* JADX INFO: renamed from: ue.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8681e {

    /* JADX INFO: renamed from: a */
    public static final C8681e f28797a = new C8681e();

    /* JADX INFO: renamed from: ue.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C5823a.f f28798a;

        /* JADX INFO: renamed from: b */
        public final Object f28799b;

        public a(C5823a.f fVar, Object obj) {
            fVar.getClass();
            this.f28798a = fVar;
            this.f28799b = obj;
        }

        /* JADX INFO: renamed from: a */
        public final Object m33358a() {
            return this.f28799b;
        }

        /* JADX INFO: renamed from: b */
        public final C5823a.f m33359b() {
            return this.f28798a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f28798a == aVar.f28798a && C4712s.m18800d(this.f28799b, aVar.f28799b);
        }

        public int hashCode() {
            return (this.f28798a.hashCode() * 31) + C4712s.m18802f(this.f28799b);
        }

        public String toString() {
            return "LoadResult(source=" + this.f28798a + ", result=" + C4712s.m18805i(this.f28799b) + ")";
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C4712s m33356b(C5823a.a aVar, String str, boolean z10) {
        List listMo5936a = aVar.mo5936a(str, null);
        if (listMo5936a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listMo5936a, 10));
        Iterator it = listMo5936a.iterator();
        while (it.hasNext()) {
            arrayList.add(InterfaceC2219d.f6058a.m8011b((String) it.next()));
        }
        if (!arrayList.isEmpty() || z10) {
            return C4712s.m18797a(C4712s.m18798b(arrayList));
        }
        C4712s.a aVar2 = C4712s.f13928r;
        return C4712s.m18797a(C4712s.m18798b(AbstractC4713t.m18807a(new IllegalStateException("cached empty for key: " + str + " but empty not allowed"))));
    }

    /* JADX INFO: renamed from: a */
    public final a m33357a(C5823a.a aVar, ReentrantReadWriteLock reentrantReadWriteLock, C5823a.c cVar, String str, boolean z10, InterfaceC0173a interfaceC0173a, InterfaceC0173a interfaceC0173a2) {
        Object objM18798b;
        Object objM18798b2;
        aVar.getClass();
        reentrantReadWriteLock.getClass();
        cVar.getClass();
        str.getClass();
        interfaceC0173a.getClass();
        interfaceC0173a.invoke();
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            C4712s c4712sM33356b = m33356b(aVar, str, z10);
            if (c4712sM33356b != null) {
                return new a(C5823a.f.CACHE, c4712sM33356b.m18806j());
            }
            if (interfaceC0173a2 == null) {
                C5823a.f fVar = C5823a.f.CACHE;
                C4712s.a aVar2 = C4712s.f13928r;
                return new a(fVar, C4712s.m18798b(AbstractC4713t.m18807a(new NoSuchElementException("no found cache for key: " + str))));
            }
            try {
                C4712s.a aVar3 = C4712s.f13928r;
                objM18798b = C4712s.m18798b((List) interfaceC0173a2.invoke());
            } catch (Throwable th) {
                C4712s.a aVar4 = C4712s.f13928r;
                objM18798b = C4712s.m18798b(AbstractC4713t.m18807a(th));
            }
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i10 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i11 = 0; i11 < readHoldCount; i11++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                C4712s c4712sM33356b2 = m33356b(aVar, str, z10);
                if (c4712sM33356b2 != null) {
                    return new a(C5823a.f.CACHE, c4712sM33356b2.m18806j());
                }
                C5823a.f fVar2 = C5823a.f.QUERY;
                Throwable thM18801e = C4712s.m18801e(objM18798b);
                if (thM18801e == null) {
                    List list = (List) objM18798b;
                    if (!list.isEmpty() || z10) {
                        if (cVar.m23438a()) {
                            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((InterfaceC2219d) it.next()).serialize());
                            }
                            aVar.mo5937b(str, arrayList);
                        }
                        objM18798b2 = C4712s.m18798b(list);
                    } else {
                        objM18798b2 = C4712s.m18798b(AbstractC4713t.m18807a(new IllegalStateException("query returned empty for key: " + str + " but empty not allowed")));
                    }
                } else {
                    objM18798b2 = C4712s.m18798b(AbstractC4713t.m18807a(thM18801e));
                }
                a aVar5 = new a(fVar2, objM18798b2);
                while (i10 < readHoldCount) {
                    lock2.lock();
                    i10++;
                }
                writeLock.unlock();
                return aVar5;
            } finally {
                while (i10 < readHoldCount) {
                    lock2.lock();
                    i10++;
                }
                writeLock.unlock();
            }
        } finally {
            lock.unlock();
        }
    }
}
