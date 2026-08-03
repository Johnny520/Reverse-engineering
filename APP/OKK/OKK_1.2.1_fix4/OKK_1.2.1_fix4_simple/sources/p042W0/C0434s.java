package p042W0;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p007D0.C0139e;
import p029P0.InterfaceC0290p;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0308h;
import p036T0.C0340c;

/* JADX INFO: renamed from: W0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0434s extends AbstractC0308h implements InterfaceC0290p {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f945a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f946b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f947c;

    public /* synthetic */ C0434s(Object r1, boolean r2, int r3) {
        this.f945a = r3;
        this.f947c = r1;
        this.f946b = r2;
        super(2);
    }

    @Override // p029P0.InterfaceC0290p
    /* JADX INFO: renamed from: b */
    public final Object mo518b(Object r13, Object r14) {
        switch(this.f945a) {
            case 0: goto L56;
            default: goto L4;
        };
    L4:
        CharSequence r132 = (CharSequence) r13;
        int r142 = ((Number) r14).intValue();
        AbstractC0307g.m703e(r132, "$this$$receiver");
        List r8 = (List) this.f947c;
        boolean r9 = this.f946b;
        if (r9 == true) goto L20;
        if (r8.size() != 1) goto L20;
        int r2 = r8.size();
        if (r2 == 0) goto L18;
        if (r2 != 1) goto L16;
        String r1 = (String) r8.get(0);
        int r133 = AbstractC0425j.m1011P0(r132, r1, r142, false, 4);
        if (r133 < 0) goto L52;
        C0139e r143 = new C0139e(Integer.valueOf(r133), r1);
    L53:
        if (r143 != null) goto L55;
        return null;
    L55:
        return new C0139e(r143.f328a, Integer.valueOf(((String) r143.f329b).length()));
    L52:
        r143 = null;
        goto L53
    L16:
        throw new IllegalArgumentException("List has more than one element.");
    L18:
        throw new NoSuchElementException("List is empty.");
    L20:
        if (r142 >= 0) goto L22;
        r142 = 0;
    L22:
        boolean r02 = r132 instanceof String;
        int r10 = new C0340c(r142, r132.length(), 1).f658b;
        if (r02 == false) goto L38;
        if (r142 > r10) goto L52;
    L26:
        Iterator r03 = r8.iterator();
    L28:
        if (r03.hasNext() == false) goto L32;
        Object r11 = r03.next();
        String r4 = (String) r11;
        if (AbstractC0433r.m1030E0(0, r142, r4.length(), r4, (String) r132, r9) == false) goto L28;
    L33:
        String r112 = (String) r11;
        if (r112 != null) goto L35;
        if (r142 == r10) goto L52;
        r142 = r142 + 1;
        goto L26
    L35:
        r143 = new C0139e(Integer.valueOf(r142), r112);
        goto L53
    L32:
        r11 = null;
        goto L33
    L38:
        if (r142 > r10) goto L52;
    L40:
        Iterator r04 = r8.iterator();
    L42:
        if (r04.hasNext() == false) goto L46;
        Object r113 = r04.next();
        String r12 = (String) r113;
        if (AbstractC0425j.m1015T0(r12, 0, r132, r142, r12.length(), r9) == false) goto L42;
    L47:
        String r114 = (String) r113;
        if (r114 != null) goto L49;
        if (r142 == r10) goto L52;
        r142 = r142 + 1;
        goto L40
    L49:
        r143 = new C0139e(Integer.valueOf(r142), r114);
        goto L53
    L46:
        r113 = null;
        goto L47
    L56:
        CharSequence r134 = (CharSequence) r13;
        int r144 = ((Number) r14).intValue();
        AbstractC0307g.m703e(r134, "$this$$receiver");
        int r135 = AbstractC0425j.m1012Q0(r134, (char[]) this.f947c, r144, this.f946b);
        if (r135 >= 0) goto L60;
        return null;
    L60:
        return new C0139e(Integer.valueOf(r135), 1);
    }
}
