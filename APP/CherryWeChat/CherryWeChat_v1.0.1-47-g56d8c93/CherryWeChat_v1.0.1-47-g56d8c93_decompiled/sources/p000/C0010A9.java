package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: A9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0010A9 extends AbstractC0073Bn implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f13b = 1;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0096C9 f14c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ DexKitBridge f15d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f16e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0010A9(C0096C9 c0096c9, DexKitBridge dexKitBridge, int i) {
        super(0);
        this.f14c = c0096c9;
        this.f15d = dexKitBridge;
        this.f16e = i;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f13b;
        int i2 = this.f16e;
        DexKitBridge dexKitBridge = this.f15d;
        C0096C9 c0096c9 = this.f14c;
        switch (i) {
            case 0:
                ArrayList arrayList = c0096c9.f219e;
                ArrayList arrayList2 = new ArrayList(AbstractC2539ta.m5019d0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(AbstractC2614v5.m5127b(i2, ((Number) it.next()).intValue())));
                }
                long[] jArr = new long[arrayList2.size()];
                Iterator it2 = arrayList2.iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    jArr[i3] = ((Number) it2.next()).longValue();
                    i3++;
                }
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(DexKitBridge.nativeGetClassByIds(DexKitBridge.m4736d(dexKitBridge), jArr));
                C1117a c1117a = new C1117a();
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                c1117a.m2034c(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
                C0139D9 c0139d9 = new C0139D9();
                int iM2033b = c1117a.m2033b(4);
                int iM2037f = iM2033b != 0 ? c1117a.m2037f(iM2033b) : 0;
                for (int i4 = 0; i4 < iM2037f; i4++) {
                    c0139d9.add(AbstractC1406fG.m2692R(dexKitBridge, c1117a.m2038g(i4)));
                }
                return c0139d9;
            default:
                Integer num = c0096c9.f218d;
                Object obj = null;
                if (num == null) {
                    return null;
                }
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(DexKitBridge.nativeGetClassByIds(DexKitBridge.m4736d(dexKitBridge), new long[]{AbstractC2614v5.m5127b(i2, num.intValue())}));
                C1117a c1117a2 = new C1117a();
                byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                c1117a2.m2034c(byteBufferWrap2.position() + byteBufferWrap2.getInt(byteBufferWrap2.position()), byteBufferWrap2);
                C0139D9 c0139d92 = new C0139D9();
                int iM2033b2 = c1117a2.m2033b(4);
                int iM2037f2 = iM2033b2 != 0 ? c1117a2.m2037f(iM2033b2) : 0;
                for (int i5 = 0; i5 < iM2037f2; i5++) {
                    c0139d92.add(AbstractC1406fG.m2692R(dexKitBridge, c1117a2.m2038g(i5)));
                }
                if (!c0139d92.isEmpty()) {
                    if (c0139d92.isEmpty()) {
                        throw new IllegalStateException("list is empty");
                    }
                    obj = c0139d92.get(0);
                }
                return (C0096C9) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0010A9(DexKitBridge dexKitBridge, C0096C9 c0096c9, int i) {
        super(0);
        this.f15d = dexKitBridge;
        this.f14c = c0096c9;
        this.f16e = i;
    }
}
