package kotlin.sequences;

import bsh.C2632;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.C4345;
import kotlin.io.C4379;
import kotlin.reflect.jvm.internal.C5029;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p054.InterfaceC6566;
import p122.C7395;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5122 implements Iterator, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f14658;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f14659;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f14660;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14661;

    public C5122(C4379 c4379) {
        this.f14661 = 2;
        this.f14658 = c4379;
        this.f14660 = new C5115((C5123) c4379.f12956);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14661) {
            case 0:
                if (this.f14659 < 0) {
                    m10115();
                }
                return this.f14659 == 1;
            case 1:
                if (this.f14659 == -1) {
                    m10114();
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
                    m10115();
                }
                if (this.f14659 == 0) {
                    C2632.m5291();
                    return null;
                }
                Object obj3 = this.f14660;
                obj3.getClass();
                this.f14659 = -1;
                return obj3;
            case 1:
                if (this.f14659 == -1) {
                    m10114();
                }
                if (this.f14659 == 0) {
                    C2632.m5291();
                    return null;
                }
                Object obj4 = this.f14660;
                this.f14660 = null;
                this.f14659 = -1;
                return obj4;
            case 2:
                C5029 c5029 = (C5029) ((C4379) obj).f12955;
                int i2 = this.f14659;
                this.f14659 = i2 + 1;
                if (i2 >= 0) {
                    return c5029.invoke(Integer.valueOf(i2), ((Iterator) this.f14660).next());
                }
                AbstractC8189.m13662();
                throw null;
            default:
                if (hasNext()) {
                    obj2 = this.f14660;
                    this.f14659++;
                    Object obj5 = ((Map) obj).get(obj2);
                    if (obj5 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
                    }
                    this.f14660 = ((C7395) obj5).f20056;
                } else {
                    C2632.m5291();
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
    public void m10114() {
        Iterator it = (Iterator) this.f14658;
        if (it.hasNext()) {
            Object next = it.next();
            InterfaceC4498 interfaceC4498 = (InterfaceC4498) next;
            interfaceC4498.getClass();
            if (interfaceC4498 instanceof InterfaceC4480) {
                this.f14659 = 1;
                this.f14660 = next;
                return;
            }
        }
        this.f14659 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m10115() {
        Object objInvoke;
        int i = this.f14659;
        C4379 c4379 = (C4379) this.f14658;
        if (i == -2) {
            objInvoke = ((InterfaceC6542) c4379.f12956).invoke();
        } else {
            InterfaceC6557 interfaceC6557 = (InterfaceC6557) c4379.f12955;
            Object obj = this.f14660;
            obj.getClass();
            objInvoke = interfaceC6557.invoke(obj);
        }
        this.f14660 = objInvoke;
        this.f14659 = objInvoke == null ? 0 : 1;
    }

    public C5122(Object obj, Map map) {
        this.f14661 = 3;
        this.f14660 = obj;
        this.f14658 = map;
    }

    public C5122(C4345 c4345) {
        this.f14661 = 1;
        this.f14658 = ((InterfaceC5126) c4345.f12924).iterator();
        this.f14659 = -1;
    }

    public C5122(C4379 c4379, byte b) {
        this.f14661 = 0;
        this.f14658 = c4379;
        this.f14659 = -2;
    }
}
