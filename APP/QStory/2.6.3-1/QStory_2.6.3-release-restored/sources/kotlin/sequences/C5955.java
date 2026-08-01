package kotlin.sequences;

import bsh.C3466;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.C5178;
import kotlin.p008io.C5212;
import kotlin.reflect.jvm.internal.C5862;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import p050.AbstractC7176;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p070.InterfaceC7396;
import p138.C8225;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5955 implements Iterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f15003;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f15004;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f15005;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15006;

    public C5955(C5212 c5212) {
        this.f15006 = 2;
        this.f15003 = c5212;
        this.f15005 = new C5948((C5956) c5212.f13305);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f15006) {
            case 0:
                if (this.f15004 < 0) {
                    m10678();
                }
                return this.f15004 == 1;
            case 1:
                if (this.f15004 == -1) {
                    m10677();
                }
                return this.f15004 == 1;
            case 2:
                return ((Iterator) this.f15005).hasNext();
            default:
                return this.f15004 < ((Map) this.f15003).size();
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.f15006;
        Object obj = this.f15003;
        Object obj2 = null;
        switch (i) {
            case 0:
                if (this.f15004 < 0) {
                    m10678();
                }
                if (this.f15004 == 0) {
                    C3466.m5896();
                    return null;
                }
                Object obj3 = this.f15005;
                obj3.getClass();
                this.f15004 = -1;
                return obj3;
            case 1:
                if (this.f15004 == -1) {
                    m10677();
                }
                if (this.f15004 == 0) {
                    C3466.m5896();
                    return null;
                }
                Object obj4 = this.f15005;
                this.f15005 = null;
                this.f15004 = -1;
                return obj4;
            case 2:
                C5862 c5862 = (C5862) ((C5212) obj).f13304;
                int i2 = this.f15004;
                this.f15004 = i2 + 1;
                if (i2 >= 0) {
                    return c5862.invoke(Integer.valueOf(i2), ((Iterator) this.f15005).next());
                }
                AbstractC7176.m12479();
                throw null;
            default:
                if (hasNext()) {
                    obj2 = this.f15005;
                    this.f15004++;
                    Object obj5 = ((Map) obj).get(obj2);
                    if (obj5 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
                    }
                    this.f15005 = ((C8225) obj5).f20396;
                } else {
                    C3466.m5896();
                }
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.f15006) {
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
    public void m10677() {
        Iterator it = (Iterator) this.f15003;
        if (it.hasNext()) {
            Object next = it.next();
            InterfaceC5331 interfaceC5331 = (InterfaceC5331) next;
            interfaceC5331.getClass();
            if (interfaceC5331 instanceof InterfaceC5313) {
                this.f15004 = 1;
                this.f15005 = next;
                return;
            }
        }
        this.f15004 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m10678() {
        Object objInvoke;
        int i = this.f15004;
        C5212 c5212 = (C5212) this.f15003;
        if (i == -2) {
            objInvoke = ((InterfaceC7372) c5212.f13305).invoke();
        } else {
            InterfaceC7387 interfaceC7387 = (InterfaceC7387) c5212.f13304;
            Object obj = this.f15005;
            obj.getClass();
            objInvoke = interfaceC7387.invoke(obj);
        }
        this.f15005 = objInvoke;
        this.f15004 = objInvoke == null ? 0 : 1;
    }

    public C5955(Object obj, Map map) {
        this.f15006 = 3;
        this.f15005 = obj;
        this.f15003 = map;
    }

    public C5955(C5178 c5178) {
        this.f15006 = 1;
        this.f15003 = ((InterfaceC5959) c5178.f13273).iterator();
        this.f15004 = -1;
    }

    public C5955(C5212 c5212, byte b) {
        this.f15006 = 0;
        this.f15003 = c5212;
        this.f15004 = -2;
    }
}
