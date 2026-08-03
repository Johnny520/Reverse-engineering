package fun.box001.internal.dexformat;

import fun.box001.internal.dexformat.output.AbstractC0203e;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.output.C0210l;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.AbstractC0174d;
import fun.box001.internal.error.DexGenerationException;
import java.util.ArrayList;

/* JADX INFO: renamed from: e.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0034k extends AbstractC0203e {

    /* JADX INFO: renamed from: c */
    private final int f107c;

    public C0034k(int r1, int r2) {
        super(r1);
        this.f107c = r2;
    }

    /* JADX INFO: renamed from: I */
    public static C0034k m146I(int r3, ArrayList r4) {
        int r0 = r4.size();
        C0034k r1 = new C0034k(r0, r3);
        int r32 = 0;
    L3:
        if (r32 >= r0) goto L5;
        r1.m503A(r32, (AbstractC0033j) r4.get(r32));
        r32 = r32 + 1;
        goto L3
    L5:
        r1.m536g();
        return r1;
    }

    /* JADX INFO: renamed from: F */
    public final int m147F() {
        int r0 = m504B();
        if (r0 != 0) goto L6;
        return 0;
    L6:
        AbstractC0033j r02 = m509l(r0 - 1);
        return r02.mo91b() + r02.m135h();
    }

    /* JADX INFO: renamed from: G */
    public final int m148G() {
        int r0 = m504B();
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r0) goto L17;
        AbstractC0033j r4 = (AbstractC0033j) m516s(r2);
        if ((r4 instanceof C0030g) == false) goto L16;
        AbstractC0171a r5 = ((C0030g) r4).m117y();
        if ((r5 instanceof AbstractC0174d) == false) goto L13;
        AbstractC0174d r52 = (AbstractC0174d) r5;
        if (r4.m138k().m151a() != 113) goto L11;
        boolean r42 = true;
    L12:
        int r43 = r52.m430i(r42);
    L14:
        if (r43 <= r3) goto L16;
        r3 = r43;
        goto L16
    L11:
        r42 = false;
        goto L12
    L13:
        r43 = 0;
    L16:
        r2 = r2 + 1;
        goto L3
    L17:
        return r3;
    }

    /* JADX INFO: renamed from: H */
    public final int m149H() {
        return this.f107c;
    }

    /* JADX INFO: renamed from: J */
    public final void m150J(C0202d r12) {
        int r0 = r12.m491j();
        int r1 = m504B();
        int r3 = 0;
        if (r12.m486d() == false) goto L22;
        boolean r2 = r12.m492k();
        int r4 = 0;
    L5:
        if (r4 >= r1) goto L22;
        AbstractC0033j r5 = (AbstractC0033j) m516s(r4);
        int r6 = r5.mo91b() * 2;
        if (r6 != 0) goto L9;
        if (r2 == true) goto L9;
    L11:
        String r52 = null;
    L17:
        if (r52 == null) goto L19;
    L18:
        r12.m484b(r6, r52);
    L21:
        r4 = r4 + 1;
        goto L5
    L19:
        if (r6 == 0) goto L21;
        r52 = "";
    L9:
        int r7 = r12.m489h();
        String r8 = r5.mo112q();
        if (r8 == null) goto L11;
        String r53 = "  " + r5.m143p() + ": ";
        int r9 = r53.length();
        if (r7 != 0) goto L15;
        int r72 = r8.length();
    L16:
        r52 = C0210l.m541d(r53, r9, r8, r72);
        goto L17
    L15:
        r72 = r7 - r9;
    L22:
        if (r3 >= r1) goto L29;
        AbstractC0033j r22 = (AbstractC0033j) m516s(r3);
        r22.mo93x(r12);     // Catch: RuntimeException -> L26
        r3 = r3 + 1;
    L26:
        e = move-exception;
        throw DexGenerationException.m22b("...while writing " + r22, e);
    L29:
        int r122 = (r12.m491j() - r0) / 2;
        if (r122 != m147F()) goto L33;
        return;
    L33:
        throw new RuntimeException("write length mismatch; expected " + m147F() + " but actually wrote " + r122);
    }
}
