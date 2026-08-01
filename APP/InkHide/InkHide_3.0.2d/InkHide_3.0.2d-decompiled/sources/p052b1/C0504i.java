package p052b1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;
import p006D.AbstractC0079h;
import p018J.AbstractC0157b;
import p022L.AbstractC0174d;
import p025M0.InterfaceC0193a;
import p027N0.AbstractC0223g;
import p027N0.AbstractC0224h;
import p035S.C0245a;
import p060d1.C0519a;

/* JADX INFO: renamed from: b1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0504i extends AbstractC0224h implements InterfaceC0193a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DexKitBridge f1607a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0505j f1608b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f1609c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1610d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0504i(DexKitBridge dexKitBridge, C0505j c0505j, int i2, int i3) {
        this.f1607a = dexKitBridge;
        this.f1608b = c0505j;
        this.f1609c = i2;
        this.f1610d = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0193a
    /* JADX INFO: renamed from: b */
    public final Object mo7b() {
        int i2;
        this.f1608b.getClass();
        long jM338a = AbstractC0157b.m338a(this.f1609c, this.f1610d);
        DexKitBridge dexKitBridge = this.f1607a;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(DexKitBridge.nativeGetMethodUsingFields(dexKitBridge.m1444g(), jM338a));
        AbstractC0223g.m417d(byteBufferWrap, "wrap(res)");
        C0245a.m460a();
        int iPosition = byteBufferWrap.position() + AbstractC0174d.m348d(byteBufferWrap, ByteOrder.LITTLE_ENDIAN);
        int i3 = iPosition - byteBufferWrap.getInt(iPosition);
        short s2 = byteBufferWrap.getShort(i3);
        ArrayList arrayList = new ArrayList();
        short s3 = 4 < s2 ? byteBufferWrap.getShort(i3 + 4) : (short) 0;
        if (s3 != 0) {
            int i4 = s3 + iPosition;
            i2 = byteBufferWrap.getInt(byteBufferWrap.getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            C0519a c0519a = new C0519a();
            short s4 = 4 < s2 ? byteBufferWrap.getShort(i3 + 4) : (short) 0;
            C0519a c0519a2 = null;
            if (s4 != 0) {
                int i6 = s4 + iPosition;
                int i7 = (i5 * 4) + byteBufferWrap.getInt(i6) + i6 + 4;
                c0519a.m1040c(byteBufferWrap.getInt(i7) + i7, byteBufferWrap);
            } else {
                c0519a = null;
            }
            AbstractC0223g.m415b(c0519a);
            C0519a c0519a3 = new C0519a();
            int iM1039b = c0519a.m1039b(4);
            if (iM1039b != 0) {
                int iM1038a = c0519a.m1038a(iM1039b + c0519a.f1663a);
                ByteBuffer byteBuffer = c0519a.f1664b;
                AbstractC0223g.m417d(byteBuffer, "bb");
                c0519a3.m1040c(iM1038a, byteBuffer);
                c0519a2 = c0519a3;
            }
            AbstractC0223g.m415b(c0519a2);
            C0501f c0501fM190n = AbstractC0079h.m190n(dexKitBridge, c0519a2);
            int iM1039b2 = c0519a.m1039b(6);
            byte b = iM1039b2 != 0 ? c0519a.f1664b.get(iM1039b2 + c0519a.f1663a) : (byte) 0;
            int i8 = 1;
            if (b != 1) {
                i8 = 2;
                if (b != 2) {
                    int iM1039b3 = c0519a.m1039b(6);
                    throw new IllegalArgumentException(AbstractC0174d.m351g(iM1039b3 != 0 ? c0519a.f1664b.get(iM1039b3 + c0519a.f1663a) : (byte) 0, "Unknown using type: "));
                }
            }
            arrayList.add(new C0507l(c0501fM190n, i8));
        }
        return arrayList;
    }
}
