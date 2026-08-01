package kotlin.sequences;

import bsh.C2633;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.C4346;
import kotlin.io.C4380;
import kotlin.reflect.jvm.internal.C5030;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import p034.AbstractC6347;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p054.InterfaceC6567;
import p122.C7396;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5123 implements Iterator, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f14658;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f14659;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f14660;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14661;

    public C5123(C4380 c4380) {
        this.f14661 = 2;
        this.f14658 = c4380;
        this.f14660 = new C5116((C5124) c4380.f12960);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14661) {
            case 0:
                if (this.f14659 < 0) {
                    m10119();
                }
                return this.f14659 == 1;
            case 1:
                if (this.f14659 == -1) {
                    m10118();
                }
                return this.f14659 == 1;
            case 2:
                return ((Iterator) this.f14660).hasNext();
            default:
                return this.f14659 < ((Map) this.f14658).size();
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.f14661;
        Object obj = this.f14658;
        Object obj2 = null;
        switch (i) {
            case 0:
                if (this.f14659 < 0) {
                    m10119();
                }
                if (this.f14659 == 0) {
                    C2633.m5336();
                    return null;
                }
                Object obj3 = this.f14660;
                obj3.getClass();
                this.f14659 = -1;
                return obj3;
            case 1:
                if (this.f14659 == -1) {
                    m10118();
                }
                if (this.f14659 == 0) {
                    C2633.m5336();
                    return null;
                }
                Object obj4 = this.f14660;
                this.f14660 = null;
                this.f14659 = -1;
                return obj4;
            case 2:
                C5030 c5030 = (C5030) ((C4380) obj).f12959;
                int i2 = this.f14659;
                this.f14659 = i2 + 1;
                if (i2 >= 0) {
                    return c5030.invoke(Integer.valueOf(i2), ((Iterator) this.f14660).next());
                }
                AbstractC6347.m11920();
                throw null;
            default:
                if (hasNext()) {
                    obj2 = this.f14660;
                    this.f14659++;
                    Object obj5 = ((Map) obj).get(obj2);
                    if (obj5 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
                    }
                    this.f14660 = ((C7396) obj5).f20051;
                } else {
                    C2633.m5336();
                }
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.f14661) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m10118() {
        Iterator it = (Iterator) this.f14658;
        if (it.hasNext()) {
            Object next = it.next();
            InterfaceC4499 interfaceC4499 = (InterfaceC4499) next;
            interfaceC4499.getClass();
            if (interfaceC4499 instanceof InterfaceC4481) {
                this.f14659 = 1;
                this.f14660 = next;
                return;
            }
        }
        this.f14659 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m10119() {
        Object objInvoke;
        int i = this.f14659;
        C4380 c4380 = (C4380) this.f14658;
        if (i == -2) {
            objInvoke = ((InterfaceC6543) c4380.f12960).invoke();
        } else {
            InterfaceC6558 interfaceC6558 = (InterfaceC6558) c4380.f12959;
            Object obj = this.f14660;
            obj.getClass();
            objInvoke = interfaceC6558.invoke(obj);
        }
        this.f14660 = objInvoke;
        this.f14659 = objInvoke == null ? 0 : 1;
    }

    public C5123(Object obj, Map map) {
        this.f14661 = 3;
        this.f14660 = obj;
        this.f14658 = map;
    }

    public C5123(C4346 c4346) {
        this.f14661 = 1;
        this.f14658 = ((InterfaceC5127) c4346.f12928).iterator();
        this.f14659 = -1;
    }

    public C5123(C4380 c4380, byte b) {
        this.f14661 = 0;
        this.f14658 = c4380;
        this.f14659 = -2;
    }
}
