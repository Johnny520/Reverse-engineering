package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.C0202d;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: g.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0110u extends AbstractC0080C {

    /* JADX INFO: renamed from: e */
    private final EnumC0109t f426e;

    /* JADX INFO: renamed from: f */
    private final AbstractC0082E f427f;

    /* JADX INFO: renamed from: g */
    private final AbstractC0108s f428g;

    /* JADX INFO: renamed from: h */
    private final int f429h;

    private C0110u(EnumC0109t r3, AbstractC0082E r4, AbstractC0108s r5, AbstractC0108s r6, int r7) {
        super(4, 12);
        if (r3 == null) goto L16;
        if (r5 == null) goto L14;
        if (r6 == null) goto L12;
        if (r7 <= 0) goto L10;
        this.f426e = r3;
        this.f427f = r4;
        this.f428g = r5;
        this.f429h = r7;
        return;
    L10:
        throw new IllegalArgumentException("itemCount <= 0");
    L12:
        throw new NullPointerException("lastItem == null");
    L14:
        throw new NullPointerException("firstItem == null");
    L16:
        throw new NullPointerException("type == null");
    }

    /* JADX INFO: renamed from: m */
    public static void m323m(AbstractC0082E[] r16, C0079B r17) {
        if (r16 == null) goto L28;
        if (((ArrayList) r17.mo225f()).size() != 0) goto L26;
        ArrayList r2 = new ArrayList(50);
        int r3 = r16.length;
        int r5 = 0;
    L7:
        if (r5 >= r3) goto L23;
        AbstractC0082E r12 = r16[r5];
        Iterator r13 = r12.mo225f().iterator();
        EnumC0109t r7 = null;
        AbstractC0108s r9 = null;
        AbstractC0108s r10 = null;
        int r11 = 0;
    L10:
        if (r13.hasNext() == false) goto L17;
        AbstractC0108s r14 = (AbstractC0108s) r13.next();
        EnumC0109t r15 = r14.mo243b();
        if (r15 == r7) goto L16;
        if (r11 == 0) goto L15;
        r2.add(new C0110u(r7, r12, r9, r10, r11));
    L15:
        r9 = r14;
        r7 = r15;
        r11 = 0;
    L16:
        r11 = r11 + 1;
        r10 = r14;
        goto L10
    L17:
        if (r11 == 0) goto L19;
        C0110u r4 = new C0110u(r7, r12, r9, r10, r11);
    L21:
        r2.add(r4);
    L22:
        r5 = r5 + 1;
        goto L7
    L19:
        if (r12 != r17) goto L22;
        r4 = new C0110u(r17);
        goto L21
    L23:
        r17.m229o(new C0088K(EnumC0109t.f414j, r2));
        return;
    L26:
        throw new IllegalArgumentException("mapSection.items().size() != 0");
    L28:
        throw new NullPointerException("sections == null");
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k r1) {
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f422r;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: l */
    protected final void mo241l(C0100k r7, C0202d r8) {
        EnumC0109t r72 = this.f426e;
        int r0 = r72.m321b();
        AbstractC0082E r1 = this.f427f;
        AbstractC0108s r2 = this.f428g;
        if (r2 != null) goto L5;
        int r12 = r1.m247e();
    L6:
        boolean r22 = r8.m486d();
        int r3 = this.f429h;
        if (r22 == false) goto L9;
        r8.m484b(0, m237h() + ' ' + r72.m322e() + " map");
        StringBuilder r23 = new StringBuilder("  type:   ");
        r23.append(RuntimeDexGenerator.m11q(r0));
        r23.append(" // ");
        r23.append(r72.toString());
        r8.m484b(2, r23.toString());
        r8.m484b(2, "  unused: 0");
        r8.m484b(4, "  size:   ".concat(RuntimeDexGenerator.m13s(r3)));
        r8.m484b(4, "  offset: ".concat(RuntimeDexGenerator.m13s(r12)));
    L9:
        r8.m498r(r0);
        r8.m498r(0);
        r8.m497q(r3);
        r8.m497q(r12);
        return;
    L5:
        r12 = r1.mo224a(r2);
        goto L6
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder(100);
        r0.append(C0110u.class.getName());
        r0.append('{');
        r0.append(this.f427f.toString());
        r0.append(' ');
        r0.append(this.f426e.mo107a());
        r0.append('}');
        return r0.toString();
    }

    private C0110u(AbstractC0082E r3) {
        super(4, 12);
        if (r3 == null) goto L7;
        this.f426e = EnumC0109t.f414j;
        this.f427f = r3;
        this.f428g = null;
        this.f429h = 1;
        return;
    L7:
        throw new NullPointerException("section == null");
    }
}
