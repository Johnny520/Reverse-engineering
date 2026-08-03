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
    public final /* synthetic */ int f13b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0096C9 f14c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ DexKitBridge f15d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f16e;

    public C0010A9(C0096C9 r2, DexKitBridge r3, int r4) {
        this.f13b = 1;
        this.f14c = r2;
        this.f15d = r3;
        this.f16e = r4;
        super(0);
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int r0 = this.f13b;
        int r2 = this.f16e;
        DexKitBridge r3 = this.f15d;
        C0096C9 r4 = this.f14c;
        int r5 = 0;
        switch(r0) {
            case 0: goto L23;
            default: goto L4;
        };
    L4:
        Integer r02 = r4.f218d;
        Object r42 = null;
        if (r02 == null) goto L22;
        ByteBuffer r03 = ByteBuffer.wrap(DexKitBridge.m4737f(DexKitBridge.m4736d(r3), new long[]{AbstractC2614v5.m5127b(r2, r02.intValue())}));
        C1117a r22 = new C1117a();
        r03.order(ByteOrder.LITTLE_ENDIAN);
        r22.m2034c(r03.position() + r03.getInt(r03.position()), r03);
        C0139D9 r04 = new C0139D9();
        int r1 = r22.m2033b(4);
        if (r1 == 0) goto L9;
        int r12 = r22.m2037f(r1);
    L10:
        int r6 = 0;
    L11:
        if (r6 >= r12) goto L14;
        r04.add(AbstractC1406fG.m2692R(r3, r22.m2038g(r6)));
        r6 = r6 + 1;
        goto L11
    L14:
        if (r04.isEmpty() == true) goto L43;
        if (r04.isEmpty() == true) goto L21;
        r42 = r04.get(0);
        goto L43
    L21:
        throw new IllegalStateException("list is empty");
    L43:
        return (C0096C9) r42;
    L9:
        r12 = 0;
        goto L10
    L22:
        return null;
    L23:
        ArrayList r05 = r4.f219e;
        ArrayList r43 = new ArrayList(AbstractC2539ta.m5019d0(r05, 10));
        Iterator r06 = r05.iterator();
    L25:
        if (r06.hasNext() == false) goto L27;
        r43.add(Long.valueOf(AbstractC2614v5.m5127b(r2, ((Number) r06.next()).intValue())));
        goto L25
    L27:
        long[] r07 = new long[r43.size()];
        Iterator r23 = r43.iterator();
        int r44 = 0;
    L29:
        if (r23.hasNext() == false) goto L31;
        r07[r44] = ((Number) r23.next()).longValue();
        r44 = r44 + 1;
        goto L29
    L31:
        ByteBuffer r08 = ByteBuffer.wrap(DexKitBridge.m4737f(DexKitBridge.m4736d(r3), r07));
        C1117a r24 = new C1117a();
        r08.order(ByteOrder.LITTLE_ENDIAN);
        r24.m2034c(r08.position() + r08.getInt(r08.position()), r08);
        C0139D9 r09 = new C0139D9();
        int r13 = r24.m2033b(4);
        if (r13 == 0) goto L34;
        int r14 = r24.m2037f(r13);
    L35:
        if (r5 >= r14) goto L37;
        r09.add(AbstractC1406fG.m2692R(r3, r24.m2038g(r5)));
        r5 = r5 + 1;
        goto L35
    L37:
        return r09;
    L34:
        r14 = 0;
        goto L35
    }

    public C0010A9(DexKitBridge r2, C0096C9 r3, int r4) {
        this.f13b = 0;
        this.f15d = r2;
        this.f14c = r3;
        this.f16e = r4;
        super(0);
    }
}
