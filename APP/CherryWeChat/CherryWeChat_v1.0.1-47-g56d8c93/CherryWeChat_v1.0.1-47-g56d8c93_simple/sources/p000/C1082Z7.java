package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Z7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1082Z7 implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3450a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3451b;

    public /* synthetic */ C1082Z7(int r1, Object r2) {
        this.f3450a = r1;
        this.f3451b = r2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r10, Object r11) {
        switch(this.f3450a) {
            case 0: goto L59;
            case 1: goto L9;
            default: goto L4;
        };
    L4:
        int r102 = AbstractC2564tz.m5058S((CharSequence) r10, (char[]) this.f3451b, ((Integer) r11).intValue(), false);
        if (r102 >= 0) goto L8;
        return null;
    L8:
        return new C0208Et(Integer.valueOf(r102), 1);
    L9:
        List r0 = (List) this.f3451b;
        CharSequence r3 = (CharSequence) r10;
        int r103 = ((Integer) r11).intValue();
        if (r0.size() != 1) goto L23;
        int r112 = r0.size();
        if (r112 == 0) goto L21;
        if (r112 != 1) goto L19;
        String r113 = (String) r0.get(0);
        int r104 = AbstractC2564tz.m5057R(r3, r113, r103, false, 4);
        if (r104 >= 0) goto L17;
    L16:
        C0208Et r02 = null;
    L56:
        if (r02 != null) goto L58;
        return null;
    L58:
        return new C0208Et(r02.f613a, Integer.valueOf(((String) r02.f614b).length()));
    L17:
        r02 = new C0208Et(Integer.valueOf(r104), r113);
        goto L56
    L19:
        throw new IllegalArgumentException("List has more than one element.");
    L21:
        throw new NoSuchElementException("List is empty.");
    L23:
        if (r103 >= 0) goto L25;
        r103 = 0;
    L25:
        boolean r2 = r3 instanceof String;
        int r114 = new C0286Gl(r103, r3.length(), 1).f433b;
        if (r2 == false) goto L41;
        if (r103 > r114) goto L16;
    L29:
        Iterator r22 = r0.iterator();
    L31:
        if (r22.hasNext() == false) goto L35;
        Object r4 = r22.next();
        String r5 = (String) r4;
        if (r5.regionMatches(0, (String) r3, r103, r5.length()) == false) goto L31;
    L36:
        String r42 = (String) r4;
        if (r42 != null) goto L38;
        if (r103 == r114) goto L16;
        r103 = r103 + 1;
        goto L29
    L38:
        r02 = new C0208Et(Integer.valueOf(r103), r42);
        goto L56
    L35:
        r4 = null;
        goto L36
    L41:
        if (r103 > r114) goto L16;
        int r43 = r103;
    L44:
        Iterator r105 = r0.iterator();
    L46:
        if (r105.hasNext() == false) goto L50;
        Object r8 = r105.next();
        String r1 = (String) r8;
        if (AbstractC2564tz.m5062W(r1, 0, r3, r43, r1.length(), false) == false) goto L46;
    L51:
        String r82 = (String) r8;
        if (r82 != null) goto L53;
        if (r43 == r114) goto L16;
        r43 = r43 + 1;
        goto L44
    L53:
        r02 = new C0208Et(Integer.valueOf(r43), r82);
        goto L56
    L50:
        r8 = null;
        goto L51
    L59:
        C1206b8 r03 = (C1206b8) this.f3451b;
        float r115 = ((Float) r11).floatValue();
        AbstractC0295Gu.m625r(-89794881255477L);
        ArrayList r12 = r03.f4133c;
        int r106 = r12.indexOf((C2629ve) r10);
        int r116 = AbstractC0828TB.m1639f(((int) (r115 / AbstractC0295Gu.m616i(50))) + r106, r12.size() - 1);
        r03.f4136f = r116;
        if (r106 == r116) goto L84;
        float r04 = AbstractC0295Gu.m616i(50);
        Iterator r13 = r12.iterator();
        int r23 = 0;
    L64:
        if (r13.hasNext() == false) goto L84;
        Object r32 = r13.next();
        int r44 = r23 + 1;
        if (r23 < 0) goto L81;
        C2629ve r33 = (C2629ve) r32;
        if (r23 == r106) goto L80;
        if (r106 < r116) goto L71;
    L74:
        if (r106 <= r116) goto L78;
        if (r116 > r23) goto L78;
        if (r23 >= r106) goto L78;
        float r24 = r04;
    L79:
        r33.animate().translationY(r24).setDuration(180).start();
    L78:
        r24 = 0.0f;
        goto L79
    L71:
        if ((r106 + 1) > r23) goto L74;
        if (r23 > r116) goto L74;
        r24 = -r04;
    L80:
        r23 = r44;
        goto L64
    L81:
        AbstractC2496sa.m4978c0();
        throw null;
    L84:
        return C0829TC.f2620a;
    }
}
