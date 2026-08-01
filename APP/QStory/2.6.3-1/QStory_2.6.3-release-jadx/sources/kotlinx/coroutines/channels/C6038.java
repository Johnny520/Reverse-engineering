package kotlinx.coroutines.channels;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.jvm.internal.AbstractC5228;
import kotlinx.coroutines.InterfaceC6244;
import kotlinx.coroutines.selects.InterfaceC6200;
import p183.InterfaceC8536;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6038 extends C6022 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final BufferOverflow f15138;

    public C6038(int i, BufferOverflow bufferOverflow) {
        super(i);
        this.f15138 = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            C1123.m1409(AbstractC5228.f13320.mo9476(C6022.class).getSimpleName(), "This implementation does not support suspension for senders, use ", " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        C6755.m11873(AbstractC0900.m722(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        return r8;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10843(Object obj, boolean z) {
        BufferOverflow bufferOverflow = this.f15138;
        BufferOverflow bufferOverflow2 = BufferOverflow.DROP_LATEST;
        C6008 c6008 = C6008.f15084;
        if (bufferOverflow == bufferOverflow2) {
            Object objMo8995 = super.mo8995(obj);
            return (!(objMo8995 instanceof C6042) || (objMo8995 instanceof C6041)) ? objMo8995 : c6008;
        }
        InterfaceC8536 interfaceC8536 = AbstractC6021.f15094;
        C6033 c6033 = (C6033) C6022.f15121.get(this);
        while (true) {
            long andIncrement = C6022.f15123.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean zM10794 = m10794(andIncrement, false);
            int i = AbstractC6021.f15096;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (c6033.f15289 != j3) {
                C6033 c6033M10813 = m10813(j3, c6033);
                if (c6033M10813 != null) {
                    c6033 = c6033M10813;
                } else if (zM10794) {
                    return new C6041(m10805());
                }
            }
            int iM10782 = C6022.m10782(this, c6033, i2, obj, j, interfaceC8536, zM10794);
            if (iM10782 == 0) {
                c6033.m10916();
                return c6008;
            }
            if (iM10782 == 1) {
                break;
            }
            if (iM10782 != 2) {
                if (iM10782 == 3) {
                    C6755.m11870("unexpected");
                    return null;
                }
                if (iM10782 == 4) {
                    if (j < C6022.f15124.get(this)) {
                        c6033.m10916();
                    }
                    return new C6041(m10805());
                }
                if (iM10782 == 5) {
                    c6033.m10916();
                }
            } else {
                if (zM10794) {
                    c6033.m10946();
                    return new C6041(m10805());
                }
                InterfaceC6244 interfaceC6244 = interfaceC8536 instanceof InterfaceC6244 ? (InterfaceC6244) interfaceC8536 : null;
                if (interfaceC6244 != null) {
                    interfaceC6244.mo10822(c6033, i2 + i);
                }
                m10820((c6033.f15289 * j2) + ((long) i2));
            }
        }
    }

    @Override // kotlinx.coroutines.channels.C6022
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final void mo10791(InterfaceC6200 interfaceC6200, Object obj) {
        Object objM10843 = m10843(obj, false);
        if (!(objM10843 instanceof C6042)) {
            interfaceC6200.mo10970(C6008.f15084);
        } else if (objM10843 instanceof C6041) {
            interfaceC6200.mo10970(AbstractC6021.f15108);
        } else {
            C6755.m11870("unreachable");
        }
    }

    @Override // kotlinx.coroutines.channels.C6022, kotlinx.coroutines.channels.InterfaceC6032
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final Object mo8992(Object obj, InterfaceC5189 interfaceC5189) throws Throwable {
        if (m10843(obj, true) instanceof C6041) {
            throw m10805();
        }
        return C6008.f15084;
    }

    @Override // kotlinx.coroutines.channels.C6022
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final boolean mo10799() {
        return this.f15138 == BufferOverflow.DROP_OLDEST;
    }

    @Override // kotlinx.coroutines.channels.C6022, kotlinx.coroutines.channels.InterfaceC6032
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final Object mo8995(Object obj) {
        return m10843(obj, false);
    }
}
