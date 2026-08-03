package p115hh;

import ac.AbstractC0063p;
import bh.C0312a;
import gg.AbstractC1417m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;
import p071f1.AbstractC1018n0;
import p085fg.InterfaceC1220a;
import p092g4.AbstractC1341a;
import p129ig.AbstractC2043a;
import p136j8.AbstractC2091b;
import p143jh.C2137a;
import p143jh.C2139c;
import p143jh.C2152p;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: hh.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1721f extends AbstractC1417m implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5713g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ DexKitBridge f5714h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f5715i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5716j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1721f(DexKitBridge dexKitBridge, AbstractC1018n0 abstractC1018n0, int i9, int i10, int i11) {
        super(0);
        this.f5713g = i11;
        this.f5714h = dexKitBridge;
        this.f5715i = i9;
        this.f5716j = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f5713g) {
            case 0:
                long jM2613k = AbstractC1018n0.m2613k(this.f5715i, this.f5716j);
                C0312a c0312a = DexKitBridge.Companion;
                DexKitBridge dexKitBridge = this.f5714h;
                long safeToken = dexKitBridge.getSafeToken();
                c0312a.getClass();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(DexKitBridge.nativeGetClassAnnotations(safeToken, jM2613k));
                byteBufferWrap.getClass();
                C2137a c2137a = new C2137a();
                c2137a.m3646c(byteBufferWrap.position() + AbstractC2091b.m5157d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN), byteBufferWrap);
                ArrayList arrayList = new ArrayList();
                int iM5367k = c2137a.m5367k();
                for (int i9 = 0; i9 < iM5367k; i9++) {
                    C2139c c2139cM5363g = c2137a.m5363g(i9);
                    c2139cM5363g.getClass();
                    arrayList.add(AbstractC0063p.m426s(dexKitBridge, c2139cM5363g));
                }
                return arrayList;
            case 1:
                long jM2613k2 = AbstractC1018n0.m2613k(this.f5715i, this.f5716j);
                C0312a c0312a2 = DexKitBridge.Companion;
                DexKitBridge dexKitBridge2 = this.f5714h;
                long safeToken2 = dexKitBridge2.getSafeToken();
                c0312a2.getClass();
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(DexKitBridge.nativeGetFieldAnnotations(safeToken2, jM2613k2));
                byteBufferWrap2.getClass();
                C2137a c2137a2 = new C2137a();
                c2137a2.m3646c(byteBufferWrap2.position() + AbstractC2091b.m5157d(byteBufferWrap2, ByteOrder.LITTLE_ENDIAN), byteBufferWrap2);
                ArrayList arrayList2 = new ArrayList();
                int iM5367k2 = c2137a2.m5367k();
                for (int i10 = 0; i10 < iM5367k2; i10++) {
                    C2139c c2139cM5363g2 = c2137a2.m5363g(i10);
                    c2139cM5363g2.getClass();
                    arrayList2.add(AbstractC0063p.m426s(dexKitBridge2, c2139cM5363g2));
                }
                return arrayList2;
            case 2:
                long jM2613k3 = AbstractC1018n0.m2613k(this.f5715i, this.f5716j);
                C0312a c0312a3 = DexKitBridge.Companion;
                DexKitBridge dexKitBridge3 = this.f5714h;
                long safeToken3 = dexKitBridge3.getSafeToken();
                c0312a3.getClass();
                ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(DexKitBridge.nativeFieldGetMethods(safeToken3, jM2613k3));
                byteBufferWrap3.getClass();
                C2137a c2137a3 = new C2137a();
                c2137a3.m3646c(byteBufferWrap3.position() + AbstractC2091b.m5157d(byteBufferWrap3, ByteOrder.LITTLE_ENDIAN), byteBufferWrap3);
                C1731p c1731p = new C1731p();
                int iM5369m = c2137a3.m5369m();
                for (int i11 = 0; i11 < iM5369m; i11++) {
                    C2152p c2152pM5371o = c2137a3.m5371o(i11);
                    c2152pM5371o.getClass();
                    c1731p.add(AbstractC1341a.m3600p(dexKitBridge3, c2152pM5371o));
                }
                return c1731p;
            case 3:
                long jM2613k4 = AbstractC1018n0.m2613k(this.f5715i, this.f5716j);
                C0312a c0312a4 = DexKitBridge.Companion;
                DexKitBridge dexKitBridge4 = this.f5714h;
                long safeToken4 = dexKitBridge4.getSafeToken();
                c0312a4.getClass();
                ByteBuffer byteBufferWrap4 = ByteBuffer.wrap(DexKitBridge.nativeFieldPutMethods(safeToken4, jM2613k4));
                byteBufferWrap4.getClass();
                C2137a c2137a4 = new C2137a();
                c2137a4.m3646c(byteBufferWrap4.position() + AbstractC2091b.m5157d(byteBufferWrap4, ByteOrder.LITTLE_ENDIAN), byteBufferWrap4);
                C1731p c1731p2 = new C1731p();
                int iM5369m2 = c2137a4.m5369m();
                for (int i12 = 0; i12 < iM5369m2; i12++) {
                    C2152p c2152pM5371o2 = c2137a4.m5371o(i12);
                    c2152pM5371o2.getClass();
                    c1731p2.add(AbstractC1341a.m3600p(dexKitBridge4, c2152pM5371o2));
                }
                return c1731p2;
            case 4:
                long jM2613k5 = AbstractC1018n0.m2613k(this.f5715i, this.f5716j);
                C0312a c0312a5 = DexKitBridge.Companion;
                DexKitBridge dexKitBridge5 = this.f5714h;
                long safeToken5 = dexKitBridge5.getSafeToken();
                c0312a5.getClass();
                ByteBuffer byteBufferWrap5 = ByteBuffer.wrap(DexKitBridge.nativeGetMethodAnnotations(safeToken5, jM2613k5));
                byteBufferWrap5.getClass();
                C2137a c2137a5 = new C2137a();
                c2137a5.m3646c(byteBufferWrap5.position() + AbstractC2091b.m5157d(byteBufferWrap5, ByteOrder.LITTLE_ENDIAN), byteBufferWrap5);
                ArrayList arrayList3 = new ArrayList();
                int iM5367k3 = c2137a5.m5367k();
                for (int i13 = 0; i13 < iM5367k3; i13++) {
                    C2139c c2139cM5363g3 = c2137a5.m5363g(i13);
                    c2139cM5363g3.getClass();
                    arrayList3.add(AbstractC0063p.m426s(dexKitBridge5, c2139cM5363g3));
                }
                return arrayList3;
            case 5:
                long jM2613k6 = AbstractC1018n0.m2613k(this.f5715i, this.f5716j);
                C0312a c0312a6 = DexKitBridge.Companion;
                DexKitBridge dexKitBridge6 = this.f5714h;
                long safeToken6 = dexKitBridge6.getSafeToken();
                c0312a6.getClass();
                ByteBuffer byteBufferWrap6 = ByteBuffer.wrap(DexKitBridge.nativeGetCallMethods(safeToken6, jM2613k6));
                byteBufferWrap6.getClass();
                C2137a c2137a6 = new C2137a();
                c2137a6.m3646c(byteBufferWrap6.position() + AbstractC2091b.m5157d(byteBufferWrap6, ByteOrder.LITTLE_ENDIAN), byteBufferWrap6);
                C1731p c1731p3 = new C1731p();
                int iM5369m3 = c2137a6.m5369m();
                for (int i14 = 0; i14 < iM5369m3; i14++) {
                    C2152p c2152pM5371o3 = c2137a6.m5371o(i14);
                    c2152pM5371o3.getClass();
                    c1731p3.add(AbstractC1341a.m3600p(dexKitBridge6, c2152pM5371o3));
                }
                return c1731p3;
            case 6:
                long jM2613k7 = AbstractC1018n0.m2613k(this.f5715i, this.f5716j);
                C0312a c0312a7 = DexKitBridge.Companion;
                DexKitBridge dexKitBridge7 = this.f5714h;
                long safeToken7 = dexKitBridge7.getSafeToken();
                c0312a7.getClass();
                ByteBuffer byteBufferWrap7 = ByteBuffer.wrap(DexKitBridge.nativeGetInvokeMethods(safeToken7, jM2613k7));
                byteBufferWrap7.getClass();
                C2137a c2137a7 = new C2137a();
                c2137a7.m3646c(byteBufferWrap7.position() + AbstractC2091b.m5157d(byteBufferWrap7, ByteOrder.LITTLE_ENDIAN), byteBufferWrap7);
                C1731p c1731p4 = new C1731p();
                int iM5369m4 = c2137a7.m5369m();
                for (int i15 = 0; i15 < iM5369m4; i15++) {
                    C2152p c2152pM5371o4 = c2137a7.m5371o(i15);
                    c2152pM5371o4.getClass();
                    c1731p4.add(AbstractC1341a.m3600p(dexKitBridge7, c2152pM5371o4));
                }
                return c1731p4;
            case 7:
                long jM2613k8 = AbstractC1018n0.m2613k(this.f5715i, this.f5716j);
                C0312a c0312a8 = DexKitBridge.Companion;
                long safeToken8 = this.f5714h.getSafeToken();
                c0312a8.getClass();
                return AbstractC4165l.m8374K0(DexKitBridge.nativeGetMethodOpCodes(safeToken8, jM2613k8));
            case 8:
                long jM2613k9 = AbstractC1018n0.m2613k(this.f5715i, this.f5716j);
                C0312a c0312a9 = DexKitBridge.Companion;
                DexKitBridge dexKitBridge8 = this.f5714h;
                long safeToken9 = dexKitBridge8.getSafeToken();
                c0312a9.getClass();
                ByteBuffer byteBufferWrap8 = ByteBuffer.wrap(DexKitBridge.nativeGetParameterAnnotations(safeToken9, jM2613k9));
                byteBufferWrap8.getClass();
                C2137a c2137a8 = new C2137a();
                c2137a8.m3646c(byteBufferWrap8.position() + AbstractC2091b.m5157d(byteBufferWrap8, ByteOrder.LITTLE_ENDIAN), byteBufferWrap8);
                ArrayList arrayList4 = new ArrayList();
                int iM3645b = c2137a8.m3645b(4);
                int iM3649f = iM3645b != 0 ? c2137a8.m3649f(iM3645b) : 0;
                for (int i16 = 0; i16 < iM3649f; i16++) {
                    C2137a c2137aM5364h = c2137a8.m5364h(i16);
                    c2137aM5364h.getClass();
                    ArrayList arrayList5 = new ArrayList();
                    int iM5367k4 = c2137aM5364h.m5367k();
                    for (int i17 = 0; i17 < iM5367k4; i17++) {
                        C2139c c2139cM5363g4 = c2137aM5364h.m5363g(i17);
                        c2139cM5363g4.getClass();
                        arrayList5.add(AbstractC0063p.m426s(dexKitBridge8, c2139cM5363g4));
                    }
                    arrayList4.add(arrayList5);
                }
                return arrayList4;
            case 9:
                long jM2613k10 = AbstractC1018n0.m2613k(this.f5715i, this.f5716j);
                C0312a c0312a10 = DexKitBridge.Companion;
                long safeToken10 = this.f5714h.getSafeToken();
                c0312a10.getClass();
                String[] strArrNativeGetParameterNames = DexKitBridge.nativeGetParameterNames(safeToken10, jM2613k10);
                if (strArrNativeGetParameterNames == null) {
                    return null;
                }
                ArrayList arrayList6 = new ArrayList(strArrNativeGetParameterNames.length);
                for (String str : strArrNativeGetParameterNames) {
                    arrayList6.add(str);
                }
                return arrayList6;
            case 10:
                long jM2613k11 = AbstractC1018n0.m2613k(this.f5715i, this.f5716j);
                C0312a c0312a11 = DexKitBridge.Companion;
                DexKitBridge dexKitBridge9 = this.f5714h;
                long safeToken11 = dexKitBridge9.getSafeToken();
                c0312a11.getClass();
                ByteBuffer byteBufferWrap9 = ByteBuffer.wrap(DexKitBridge.nativeGetMethodUsingFields(safeToken11, jM2613k11));
                byteBufferWrap9.getClass();
                C2137a c2137a9 = new C2137a();
                c2137a9.m3646c(byteBufferWrap9.position() + AbstractC2091b.m5157d(byteBufferWrap9, ByteOrder.LITTLE_ENDIAN), byteBufferWrap9);
                ArrayList arrayList7 = new ArrayList();
                int iM3645b2 = c2137a9.m3645b(4);
                int iM3649f2 = iM3645b2 != 0 ? c2137a9.m3649f(iM3645b2) : 0;
                for (int i18 = 0; i18 < iM3649f2; i18++) {
                    C2137a c2137aM5370n = c2137a9.m5370n(i18);
                    c2137aM5370n.getClass();
                    arrayList7.add(AbstractC2043a.m5042p(dexKitBridge9, c2137aM5370n));
                }
                return arrayList7;
            default:
                long jM2613k12 = AbstractC1018n0.m2613k(this.f5715i, this.f5716j);
                C0312a c0312a12 = DexKitBridge.Companion;
                long safeToken12 = this.f5714h.getSafeToken();
                c0312a12.getClass();
                return AbstractC4165l.m8375L0(DexKitBridge.nativeGetMethodUsingStrings(safeToken12, jM2613k12));
        }
    }
}
