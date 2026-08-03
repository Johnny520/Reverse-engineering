package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.github.cherrywechat.network.model.FAQItem;
import java.util.Comparator;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Wb */
/* JADX INFO: loaded from: classes.dex */
public final class C0963Wb implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3002a;

    public /* synthetic */ C0963Wb(int r1) {
        this.f3002a = r1;
    }

    @Override // java.util.Comparator
    public final int compare(Object r7, Object r8) {
        boolean r2 = false;
        switch(this.f3002a) {
            case 0: goto L70;
            case 1: goto L69;
            case 2: goto L67;
            case 3: goto L65;
            case 4: goto L40;
            case 5: goto L39;
            case 6: goto L37;
            case 7: goto L35;
            case 8: goto L33;
            case 9: goto L14;
            case 10: goto L13;
            case 11: goto L10;
            case 12: goto L8;
            case 13: goto L7;
            default: goto L5;
        };
    L8:
        String r82 = ((C0185EC) r8).f551c;
        Locale r0 = Locale.ROOT;
        String r83 = r82.toLowerCase(r0);
        AbstractC0295Gu.m625r(-487899694889013L);
        String r72 = ((C0185EC) r7).f551c.toLowerCase(r0);
        AbstractC0295Gu.m625r(-486323441891381L);
        return AbstractC0671Pj.m1346d(r83, r72);
    L10:
        String r73 = ((C0185EC) r7).f551c;
        Locale r02 = Locale.ROOT;
        String r74 = r73.toLowerCase(r02);
        AbstractC0295Gu.m625r(-487753666000949L);
        String r84 = ((C0185EC) r8).f551c.toLowerCase(r02);
        AbstractC0295Gu.m625r(-487826680444981L);
        return AbstractC0671Pj.m1346d(r74, r84);
    L14:
        C0185EC r85 = (C0185EC) r8;
        if (AbstractC0585Nj.m1134a(r85.f549a, AbstractC0295Gu.m625r(-792395696306229L)) == true) goto L22;
        EnumC0099CC r86 = r85.f567s;
        if (r86 == EnumC0099CC.f236d) goto L22;
        if (r86 == EnumC0099CC.f237e) goto L22;
        boolean r87 = false;
    L23:
        Boolean r88 = Boolean.valueOf(r87);
        C0185EC r75 = (C0185EC) r7;
        if (AbstractC0585Nj.m1134a(r75.f549a, AbstractC0295Gu.m625r(-792404286240821L)) == true) goto L29;
        EnumC0099CC r76 = r75.f567s;
        if (r76 == EnumC0099CC.f236d) goto L29;
        if (r76 == EnumC0099CC.f237e) goto L29;
    L31:
        return AbstractC0671Pj.m1346d(r88, Boolean.valueOf(r2));
    L29:
        r2 = true;
    L22:
        r87 = true;
        goto L23
    L40:
        C2419qj r77 = (C2419qj) r7;
        C2419qj r89 = (C2419qj) r8;
        RecyclerView r03 = r77.f8481d;
        if (r03 != null) goto L43;
        boolean r4 = true;
    L45:
        if (r89.f8481d != null) goto L47;
        boolean r5 = true;
    L48:
        if (r4 == r5) goto L51;
        if (r03 == null) goto L79;
        return -1;
    L79:
        return 1;
    L51:
        boolean r04 = r77.f8478a;
        if (r04 == r89.f8478a) goto L56;
        if (r04 == false) goto L79;
        return -1;
    L56:
        int r1 = r89.f8479b - r77.f8479b;
        if (r1 != 0) goto L81;
        int r12 = r77.f8480c - r89.f8480c;
        if (r12 == 0) goto L63;
        return r12;
    L63:
        return 0;
    L81:
        return r1;
    L47:
        r5 = false;
        goto L48
    L43:
        r4 = false;
        goto L45
    L70:
        WeakHashMap r05 = AbstractC2185lE.f7617a;
        float r78 = AbstractC1360eE.m2635g((View) r7);
        float r810 = AbstractC1360eE.m2635g((View) r8);
        if (r78 <= r810) goto L74;
        return -1;
    L74:
        if (r78 >= r810) goto L77;
        return 1;
    L77:
        return 0;
    L5:
        return ((C0058BE) r7).f134b - ((C0058BE) r8).f134b;
    L7:
        return AbstractC0671Pj.m1346d(Integer.valueOf(((C0185EC) r8).f561m), Integer.valueOf(((C0185EC) r7).f561m));
    L13:
        return AbstractC0671Pj.m1346d(Boolean.valueOf(AbstractC0585Nj.m1134a(((C0185EC) r8).f549a, AbstractC0295Gu.m625r(-808265600464949L))), Boolean.valueOf(AbstractC0585Nj.m1134a(((C0185EC) r7).f549a, AbstractC0295Gu.m625r(-808274190399541L))));
    L33:
        return AbstractC0671Pj.m1346d(Integer.valueOf(((C0185EC) r7).f570v), Integer.valueOf(((C0185EC) r8).f570v));
    L35:
        return ((View) r7).getTop() - ((View) r8).getTop();
    L37:
        return ((C0256Fy) r7).f830b - ((C0256Fy) r8).f830b;
    L39:
        return AbstractC0671Pj.m1346d(Integer.valueOf(((C1304d1) r7).f4748d), Integer.valueOf(((C1304d1) r8).f4748d));
    L65:
        return AbstractC0671Pj.m1346d(Integer.valueOf(((FAQItem) r7).getItemOrder()), Integer.valueOf(((FAQItem) r8).getItemOrder()));
    L67:
        return AbstractC0671Pj.m1346d(((C0764Rr) r7).f2432c, ((C0764Rr) r8).f2432c);
    L69:
        return AbstractC0671Pj.m1346d(((C0096C9) r7).f217c, ((C0096C9) r8).f217c);
    }
}
