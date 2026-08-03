package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.AbstractC0184n;
import fun.box001.internal.dexformat.writer.code.C0172b;
import fun.box001.internal.dexformat.writer.code.C0173c;
import fun.box001.internal.dexformat.writer.code.C0191u;
import fun.box001.internal.dexmaker.AbstractC0007d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: g.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0093d extends AbstractC0080C {

    /* JADX INFO: renamed from: e */
    private final C0191u f340e;

    /* JADX INFO: renamed from: f */
    private final ArrayList f341f;

    /* JADX INFO: renamed from: g */
    private final HashMap f342g;

    /* JADX INFO: renamed from: h */
    private final ArrayList f343h;

    /* JADX INFO: renamed from: i */
    private final ArrayList f344i;

    /* JADX INFO: renamed from: j */
    private final ArrayList f345j;

    /* JADX INFO: renamed from: k */
    private C0173c f346k;

    /* JADX INFO: renamed from: l */
    private byte[] f347l;

    public C0093d(C0191u r3) {
        super(1, -1);
        if (r3 == null) goto L7;
        this.f340e = r3;
        this.f341f = new ArrayList(20);
        this.f342g = new HashMap(40);
        this.f343h = new ArrayList(20);
        this.f344i = new ArrayList(20);
        this.f345j = new ArrayList(20);
        this.f346k = null;
        return;
    L7:
        throw new NullPointerException("thisClass == null");
    }

    /* JADX INFO: renamed from: o */
    private static void m268o(C0100k r4, C0202d r5, String r6, ArrayList r7) {
        int r0 = r7.size();
        if (r0 != 0) goto L5;
        return;
    L5:
        int r2 = 0;
        if (r5.m486d() == false) goto L8;
        r5.m484b(0, "  " + r6 + ":");
    L8:
        int r62 = 0;
    L9:
        if (r2 >= r0) goto L11;
        r62 = ((AbstractC0102m) r7.get(r2)).mo312b(r4, r5, r62, r2);
        r2 = r2 + 1;
        goto L9
    }

    /* JADX INFO: renamed from: p */
    private void m269p(C0100k r11, C0202d r12) {
        boolean r0 = r12.m486d();
        if (r0 == false) goto L5;
        r12.m484b(0, m237h() + " class data for " + this.f340e.mo107a());
    L5:
        ArrayList r1 = this.f341f;
        m270q(r12, "static_fields", r1.size());
        ArrayList r2 = this.f343h;
        m270q(r12, "instance_fields", r2.size());
        ArrayList r4 = this.f344i;
        m270q(r12, "direct_methods", r4.size());
        ArrayList r6 = this.f345j;
        m270q(r12, "virtual_methods", r6.size());
        m268o(r11, r12, "static_fields", r1);
        m268o(r11, r12, "instance_fields", r2);
        m268o(r11, r12, "direct_methods", r4);
        m268o(r11, r12, "virtual_methods", r6);
        if (r0 == false) goto L9;
        r12.m488f();
        return;
    }

    /* JADX INFO: renamed from: q */
    private static void m270q(C0202d r1, String r2, int r3) {
        if (r1.m486d() == false) goto L5;
        r1.m485c(String.format("  %-21s %08x", new Object[]{r2.concat("_size:"), Integer.valueOf(r3)}));
    L5:
        r1.m500t(r3);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k r4) {
        ArrayList r0 = this.f341f;
        if (r0.isEmpty() == true) goto L9;
        m273r();
        Iterator r02 = r0.iterator();
        if (r02.hasNext() == false) goto L9;
        AbstractC0007d.m47a(r02.next());
        throw null;
    L9:
        ArrayList r03 = this.f343h;
        if (r03.isEmpty() == true) goto L16;
        Collections.sort(r03);
        Iterator r04 = r03.iterator();
        if (r04.hasNext() == false) goto L16;
        AbstractC0007d.m47a(r04.next());
        throw null;
    L16:
        ArrayList r05 = this.f344i;
        if (r05.isEmpty() == true) goto L22;
        Collections.sort(r05);
        Iterator r06 = r05.iterator();
    L20:
        if (r06.hasNext() == false) goto L22;
        ((C0103n) r06.next()).m314f(r4);
    L22:
        ArrayList r07 = this.f345j;
        if (r07.isEmpty() == true) goto L28;
        Collections.sort(r07);
        Iterator r08 = r07.iterator();
    L26:
        if (r08.hasNext() == false) goto L31;
        ((C0103n) r08.next()).m314f(r4);
        goto L26
    L31:
        return;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f416l;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: j */
    protected final void mo239j(AbstractC0082E r1, int r2) {
        C0202d r22 = new C0202d();
        m269p(r1.m246d(), r22);
        byte[] r12 = r22.m493m();
        this.f347l = r12;
        m240k(r12.length);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: l */
    public final void mo241l(C0100k r2, C0202d r3) {
        if (r3.m486d() == false) goto L5;
        m269p(r2, r3);
        return;
    L5:
        r3.m495o(this.f347l);
    }

    /* JADX INFO: renamed from: m */
    public final void m271m(C0103n r2) {
        this.f344i.add(r2);
    }

    /* JADX INFO: renamed from: n */
    public final void m272n(C0103n r2) {
        this.f345j.add(r2);
    }

    /* JADX INFO: renamed from: r */
    public final C0173c m273r() {
        if (this.f346k != null) goto L25;
        ArrayList r0 = this.f341f;
        if (r0.size() == 0) goto L25;
        Collections.sort(r0);
        int r1 = r0.size();
    L7:
        HashMap r2 = this.f342g;
        C0173c r3 = null;
        if (r1 <= 0) goto L17;
        int r4 = r1 - 1;
        AbstractC0007d.m47a(r0.get(r4));
        AbstractC0171a r5 = (AbstractC0171a) r2.get(null);
        if ((r5 instanceof AbstractC0184n) == true) goto L12;
        if (r5 != null) goto L17;
    L16:
        r1 = r4;
        goto L7
    L12:
        if (((AbstractC0184n) r5).mo439i() == 0) goto L16;
    L17:
        if (r1 == 0) goto L23;
        C0172b r42 = new C0172b(r1);
        int r52 = 0;
    L20:
        if (r52 >= r1) goto L22;
        AbstractC0007d.m47a(r0.get(r52));
        AbstractC0171a r6 = (AbstractC0171a) r2.get(null);
        r6.getClass();
        r42.m522y(r52, r6);
        r52 = r52 + 1;
        goto L20
    L22:
        r42.m536g();
        r3 = new C0173c(r42);
    L23:
        this.f346k = r3;
    L25:
        return this.f346k;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m274s() {
        if (this.f341f.isEmpty() == true) goto L5;
    L11:
        return false;
    L5:
        if (this.f343h.isEmpty() == false) goto L11;
        if (this.f344i.isEmpty() == false) goto L11;
        if (this.f345j.isEmpty() == false) goto L11;
        return true;
    }
}
