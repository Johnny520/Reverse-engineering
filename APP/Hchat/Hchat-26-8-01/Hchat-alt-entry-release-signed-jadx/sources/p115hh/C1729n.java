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
import p085fg.InterfaceC1220a;
import p136j8.AbstractC2091b;
import p143jh.C2137a;
import p143jh.C2140d;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: hh.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1729n extends AbstractC1417m implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5744g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ DexKitBridge f5745h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1730o f5746i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5747j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1729n(DexKitBridge dexKitBridge, C1730o c1730o, int i9, int i10) {
        super(0);
        this.f5744g = i10;
        this.f5745h = dexKitBridge;
        this.f5746i = c1730o;
        this.f5747j = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        int i9 = this.f5744g;
        int i10 = this.f5747j;
        C1730o c1730o = this.f5746i;
        DexKitBridge dexKitBridge = this.f5745h;
        int i11 = 0;
        switch (i9) {
            case 0:
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(C0312a.m1230a(DexKitBridge.Companion, dexKitBridge.getSafeToken(), new long[]{AbstractC1018n0.m2613k(i10, c1730o.f5748h)}));
                byteBufferWrap.getClass();
                C2137a c2137a = new C2137a();
                c2137a.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
                C1725j c1725j = new C1725j();
                int iM5368l = c2137a.m5368l();
                while (i11 < iM5368l) {
                    C2140d c2140dM5365i = c2137a.m5365i(i11);
                    c2140dM5365i.getClass();
                    c1725j.add(AbstractC1089i.m2795v(dexKitBridge, c2140dM5365i));
                    i11++;
                }
                return (C1724i) c1725j.m4344a();
            case 1:
                ArrayList arrayList = c1730o.f5752l;
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(AbstractC1018n0.m2613k(i10, ((Number) it.next()).intValue())));
                }
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(C0312a.m1230a(DexKitBridge.Companion, dexKitBridge.getSafeToken(), AbstractC4166m.m8408Q1(arrayList2)));
                byteBufferWrap2.getClass();
                C2137a c2137a2 = new C2137a();
                c2137a2.m3646c(byteBufferWrap2.position() + AbstractC2091b.m5157d(byteBufferWrap2, ByteOrder.LITTLE_ENDIAN), byteBufferWrap2);
                C1725j c1725j2 = new C1725j();
                int iM5368l2 = c2137a2.m5368l();
                while (i11 < iM5368l2) {
                    C2140d c2140dM5365i2 = c2137a2.m5365i(i11);
                    c2140dM5365i2.getClass();
                    c1725j2.add(AbstractC1089i.m2795v(dexKitBridge, c2140dM5365i2));
                    i11++;
                }
                return c1725j2;
            default:
                ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(C0312a.m1230a(DexKitBridge.Companion, dexKitBridge.getSafeToken(), new long[]{AbstractC1018n0.m2613k(i10, c1730o.f5751k)}));
                byteBufferWrap3.getClass();
                C2137a c2137a3 = new C2137a();
                c2137a3.m3646c(byteBufferWrap3.position() + AbstractC2091b.m5157d(byteBufferWrap3, ByteOrder.LITTLE_ENDIAN), byteBufferWrap3);
                C1725j c1725j3 = new C1725j();
                int iM5368l3 = c2137a3.m5368l();
                while (i11 < iM5368l3) {
                    C2140d c2140dM5365i3 = c2137a3.m5365i(i11);
                    c2140dM5365i3.getClass();
                    c1725j3.add(AbstractC1089i.m2795v(dexKitBridge, c2140dM5365i3));
                    i11++;
                }
                return (C1724i) c1725j3.m4344a();
        }
    }
}
