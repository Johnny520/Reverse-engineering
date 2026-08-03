package p115hh;

import bh.C0312a;
import gg.AbstractC1417m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import org.luckypray.dexkit.DexKitBridge;
import p071f1.AbstractC1018n0;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p092g4.AbstractC1341a;
import p136j8.AbstractC2091b;
import p143jh.C2137a;
import p143jh.C2140d;
import p143jh.C2151o;
import p143jh.C2152p;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: hh.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1722g extends AbstractC1417m implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5717g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ DexKitBridge f5718h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1724i f5719i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5720j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1722g(C1724i c1724i, DexKitBridge dexKitBridge, int i9) {
        super(0);
        this.f5717g = 3;
        this.f5719i = c1724i;
        this.f5718h = dexKitBridge;
        this.f5720j = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        int i9 = this.f5717g;
        int i10 = this.f5720j;
        DexKitBridge dexKitBridge = this.f5718h;
        C1724i c1724i = this.f5719i;
        int i11 = 0;
        switch (i9) {
            case 0:
                ArrayList arrayList = c1724i.f5728n;
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(AbstractC1018n0.m2613k(i10, ((Number) it.next()).intValue())));
                }
                long[] jArrM8408Q1 = AbstractC4166m.m8408Q1(arrayList2);
                C0312a c0312a = DexKitBridge.Companion;
                long safeToken = dexKitBridge.getSafeToken();
                c0312a.getClass();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(DexKitBridge.nativeGetFieldByIds(safeToken, jArrM8408Q1));
                byteBufferWrap.getClass();
                C2137a c2137a = new C2137a();
                c2137a.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
                C1728m c1728m = new C1728m();
                int iM3645b = c2137a.m3645b(4);
                int iM3649f = iM3645b != 0 ? c2137a.m3649f(iM3645b) : 0;
                while (i11 < iM3649f) {
                    C2151o c2151oM5366j = c2137a.m5366j(i11);
                    c2151oM5366j.getClass();
                    c1728m.add(AbstractC1184v0.m3208r(dexKitBridge, c2151oM5366j));
                    i11++;
                }
                return c1728m;
            case 1:
                ArrayList arrayList3 = c1724i.f5726l;
                ArrayList arrayList4 = new ArrayList(AbstractC4167n.m8429e1(arrayList3));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Long.valueOf(AbstractC1018n0.m2613k(i10, ((Number) it2.next()).intValue())));
                }
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(C0312a.m1230a(DexKitBridge.Companion, dexKitBridge.getSafeToken(), AbstractC4166m.m8408Q1(arrayList4)));
                byteBufferWrap2.getClass();
                C2137a c2137a2 = new C2137a();
                c2137a2.m3646c(byteBufferWrap2.position() + AbstractC2091b.m5157d(byteBufferWrap2, ByteOrder.LITTLE_ENDIAN), byteBufferWrap2);
                C1725j c1725j = new C1725j();
                int iM5368l = c2137a2.m5368l();
                while (i11 < iM5368l) {
                    C2140d c2140dM5365i = c2137a2.m5365i(i11);
                    c2140dM5365i.getClass();
                    c1725j.add(AbstractC1089i.m2795v(dexKitBridge, c2140dM5365i));
                    i11++;
                }
                return c1725j;
            case 2:
                ArrayList arrayList5 = c1724i.f5727m;
                ArrayList arrayList6 = new ArrayList(AbstractC4167n.m8429e1(arrayList5));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(Long.valueOf(AbstractC1018n0.m2613k(i10, ((Number) it3.next()).intValue())));
                }
                long[] jArrM8408Q12 = AbstractC4166m.m8408Q1(arrayList6);
                C0312a c0312a2 = DexKitBridge.Companion;
                long safeToken2 = dexKitBridge.getSafeToken();
                c0312a2.getClass();
                ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(DexKitBridge.nativeGetMethodByIds(safeToken2, jArrM8408Q12));
                byteBufferWrap3.getClass();
                C2137a c2137a3 = new C2137a();
                c2137a3.m3646c(byteBufferWrap3.position() + AbstractC2091b.m5157d(byteBufferWrap3, ByteOrder.LITTLE_ENDIAN), byteBufferWrap3);
                C1731p c1731p = new C1731p();
                int iM5369m = c2137a3.m5369m();
                while (i11 < iM5369m) {
                    C2152p c2152pM5371o = c2137a3.m5371o(i11);
                    c2152pM5371o.getClass();
                    c1731p.add(AbstractC1341a.m3600p(dexKitBridge, c2152pM5371o));
                    i11++;
                }
                return c1731p;
            default:
                Integer num = c1724i.f5725k;
                if (num == null) {
                    return null;
                }
                ByteBuffer byteBufferWrap4 = ByteBuffer.wrap(C0312a.m1230a(DexKitBridge.Companion, dexKitBridge.getSafeToken(), new long[]{AbstractC1018n0.m2613k(i10, num.intValue())}));
                byteBufferWrap4.getClass();
                C2137a c2137a4 = new C2137a();
                c2137a4.m3646c(byteBufferWrap4.position() + AbstractC2091b.m5157d(byteBufferWrap4, ByteOrder.LITTLE_ENDIAN), byteBufferWrap4);
                C1725j c1725j2 = new C1725j();
                int iM5368l2 = c2137a4.m5368l();
                while (i11 < iM5368l2) {
                    C2140d c2140dM5365i2 = c2137a4.m5365i(i11);
                    c2140dM5365i2.getClass();
                    c1725j2.add(AbstractC1089i.m2795v(dexKitBridge, c2140dM5365i2));
                    i11++;
                }
                return (C1724i) c1725j2.m4344a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1722g(DexKitBridge dexKitBridge, C1724i c1724i, int i9, int i10) {
        super(0);
        this.f5717g = i10;
        this.f5718h = dexKitBridge;
        this.f5719i = c1724i;
        this.f5720j = i9;
    }
}
