package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oh implements a0, wm {
    public final /* synthetic */ Object a;

    public /* synthetic */ oh(Object r1) {
        this.a = r1;
    }

    @Override // defpackage.wm
    public Object e(Object r12, Object r13) {
        List r0 = (List) this.a;
        CharSequence r122 = (CharSequence) r12;
        int r132 = ((Integer) r13).intValue();
        ip.o("$this$DelimitedRangesSequence", r122);
        if (r0.size() != 1) goto L16;
        int r1 = r0.size();
        if (r1 == 0) goto L14;
        if (r1 != 1) goto L12;
        String r02 = (String) r0.get(0);
        int r123 = b50.G(r122, r02, r132, false, 4);
        if (r123 >= 0) goto L10;
    L9:
        kx r133 = null;
    L49:
        if (r133 != null) goto L51;
        return null;
    L51:
        return new kx(r133.a, Integer.valueOf(((String) r133.b).length()));
    L10:
        r133 = new kx(Integer.valueOf(r123), r02);
        goto L49
    L12:
        throw new IllegalArgumentException("List has more than one element.");
    L14:
        throw new NoSuchElementException("List is empty.");
    L16:
        if (r132 >= 0) goto L18;
        r132 = 0;
    L18:
        boolean r2 = r122 instanceof String;
        int r14 = new hp(r132, r122.length(), 1).b;
        if (r2 == false) goto L35;
        if (r132 > r14) goto L9;
        int r6 = r132;
    L23:
        Iterator r134 = r0.iterator();
    L25:
        if (r134.hasNext() == false) goto L29;
        Object r22 = r134.next();
        String r8 = (String) r22;
        if (b50.J(0, r6, r8.length(), r8, (String) r122, false) == false) goto L25;
    L30:
        String r23 = (String) r22;
        if (r23 != null) goto L32;
        if (r6 == r14) goto L9;
        r6 = r6 + 1;
        goto L23
    L32:
        r133 = new kx(Integer.valueOf(r6), r23);
        goto L49
    L29:
        r22 = null;
        goto L30
    L35:
        if (r132 > r14) goto L9;
    L37:
        Iterator r24 = r0.iterator();
    L39:
        if (r24.hasNext() == false) goto L43;
        Object r3 = r24.next();
        String r5 = (String) r3;
        if (b50.K(r5, r122, r132, r5.length(), false) == false) goto L39;
    L44:
        String r32 = (String) r3;
        if (r32 != null) goto L46;
        if (r132 == r14) goto L9;
        r132 = r132 + 1;
        goto L37
    L46:
        r133 = new kx(Integer.valueOf(r132), r32);
        goto L49
    L43:
        r3 = null;
        goto L44
    }
}
