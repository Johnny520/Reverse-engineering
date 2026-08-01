package p052b1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import org.luckypray.dexkit.DexKitBridge;
import p006D.AbstractC0079h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0125m;
import p018J.AbstractC0157b;
import p022L.AbstractC0174d;
import p025M0.InterfaceC0193a;
import p027N0.AbstractC0223g;
import p027N0.AbstractC0224h;
import p035S.C0245a;
import p060d1.C0519a;

/* JADX INFO: renamed from: b1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0497b extends AbstractC0224h implements InterfaceC0193a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1573a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DexKitBridge f1574b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0157b f1575c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1576d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0497b(DexKitBridge dexKitBridge, AbstractC0157b abstractC0157b, int i2, int i3) {
        this.f1573a = i3;
        this.f1574b = dexKitBridge;
        this.f1575c = abstractC0157b;
        this.f1576d = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0193a
    /* JADX INFO: renamed from: b */
    public final Object mo7b() {
        int i2;
        DexKitBridge dexKitBridge = this.f1574b;
        int i3 = this.f1576d;
        AbstractC0157b abstractC0157b = this.f1575c;
        int i4 = 0;
        switch (this.f1573a) {
            case 0:
                ArrayList arrayList = ((C0499d) abstractC0157b).f1582f;
                ArrayList arrayList2 = new ArrayList(AbstractC0125m.m289c0(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(AbstractC0157b.m338a(i3, ((Number) it.next()).intValue())));
                }
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(DexKitBridge.nativeGetFieldByIds(dexKitBridge.m1444g(), AbstractC0123k.m282x0(arrayList2)));
                AbstractC0223g.m417d(byteBufferWrap, "wrap(res)");
                C0245a.m460a();
                int iPosition = byteBufferWrap.position() + AbstractC0174d.m348d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN);
                int i5 = iPosition - byteBufferWrap.getInt(iPosition);
                short s2 = byteBufferWrap.getShort(i5);
                C0502g c0502g = new C0502g();
                short s3 = 4 < s2 ? byteBufferWrap.getShort(i5 + 4) : (short) 0;
                if (s3 != 0) {
                    int i6 = s3 + iPosition;
                    i2 = byteBufferWrap.getInt(byteBufferWrap.getInt(i6) + i6);
                } else {
                    i2 = 0;
                }
                for (int i7 = 0; i7 < i2; i7++) {
                    C0519a c0519a = new C0519a();
                    short s4 = 4 < s2 ? byteBufferWrap.getShort(i5 + 4) : (short) 0;
                    if (s4 != 0) {
                        int i8 = s4 + iPosition;
                        int i9 = (i7 * 4) + byteBufferWrap.getInt(i8) + i8 + 4;
                        c0519a.m1040c(byteBufferWrap.getInt(i9) + i9, byteBufferWrap);
                    } else {
                        c0519a = null;
                    }
                    AbstractC0223g.m415b(c0519a);
                    c0502g.add(AbstractC0079h.m190n(dexKitBridge, c0519a));
                }
                return c0502g;
            case 1:
                ArrayList arrayList3 = ((C0499d) abstractC0157b).f1581e;
                ArrayList arrayList4 = new ArrayList(AbstractC0125m.m289c0(arrayList3));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Long.valueOf(AbstractC0157b.m338a(i3, ((Number) it2.next()).intValue())));
                }
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(DexKitBridge.nativeGetClassByIds(dexKitBridge.m1444g(), AbstractC0123k.m282x0(arrayList4)));
                AbstractC0223g.m417d(byteBufferWrap2, "wrap(res)");
                C0519a c0519a2 = new C0519a();
                c0519a2.m1040c(byteBufferWrap2.position() + AbstractC0174d.m348d(byteBufferWrap2, ByteOrder.LITTLE_ENDIAN), byteBufferWrap2);
                C0500e c0500e = new C0500e();
                int iM1045h = c0519a2.m1045h();
                while (i4 < iM1045h) {
                    C0519a c0519aM1044g = c0519a2.m1044g(i4);
                    AbstractC0223g.m415b(c0519aM1044g);
                    c0500e.add(AbstractC0079h.m189m(dexKitBridge, c0519aM1044g));
                    i4++;
                }
                return c0500e;
            case 2:
                Integer num = ((C0499d) abstractC0157b).f1580d;
                if (num == null) {
                    return null;
                }
                ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(DexKitBridge.nativeGetClassByIds(dexKitBridge.m1444g(), new long[]{AbstractC0157b.m338a(i3, num.intValue())}));
                AbstractC0223g.m417d(byteBufferWrap3, "wrap(res)");
                C0519a c0519a3 = new C0519a();
                c0519a3.m1040c(byteBufferWrap3.position() + AbstractC0174d.m348d(byteBufferWrap3, ByteOrder.LITTLE_ENDIAN), byteBufferWrap3);
                C0500e c0500e2 = new C0500e();
                int iM1045h2 = c0519a3.m1045h();
                while (i4 < iM1045h2) {
                    C0519a c0519aM1044g2 = c0519a3.m1044g(i4);
                    AbstractC0223g.m415b(c0519aM1044g2);
                    c0500e2.add(AbstractC0079h.m189m(dexKitBridge, c0519aM1044g2));
                    i4++;
                }
                return (C0499d) (c0500e2.isEmpty() ? null : c0500e2.m961a());
            default:
                ByteBuffer byteBufferWrap4 = ByteBuffer.wrap(DexKitBridge.nativeGetClassByIds(dexKitBridge.m1444g(), new long[]{AbstractC0157b.m338a(i3, ((C0501f) abstractC0157b).f1589d)}));
                AbstractC0223g.m417d(byteBufferWrap4, "wrap(res)");
                C0519a c0519a4 = new C0519a();
                c0519a4.m1040c(byteBufferWrap4.position() + AbstractC0174d.m348d(byteBufferWrap4, ByteOrder.LITTLE_ENDIAN), byteBufferWrap4);
                C0500e c0500e3 = new C0500e();
                int iM1045h3 = c0519a4.m1045h();
                while (i4 < iM1045h3) {
                    C0519a c0519aM1044g3 = c0519a4.m1044g(i4);
                    AbstractC0223g.m415b(c0519aM1044g3);
                    c0500e3.add(AbstractC0079h.m189m(dexKitBridge, c0519aM1044g3));
                    i4++;
                }
                return (C0499d) c0500e3.m961a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0497b(C0499d c0499d, DexKitBridge dexKitBridge, int i2) {
        this.f1573a = 2;
        this.f1575c = c0499d;
        this.f1574b = dexKitBridge;
        this.f1576d = i2;
    }
}
