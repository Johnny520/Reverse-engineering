package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.github.cherrywechat.network.model.FAQItem;
import java.util.Comparator;
import java.util.Locale;
import java.util.WeakHashMap;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: Wb */
/* JADX INFO: loaded from: classes.dex */
public final class C0963Wb implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3002a;

    public /* synthetic */ C0963Wb(int i) {
        this.f3002a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        EnumC0099CC enumC0099CC;
        EnumC0099CC enumC0099CC2;
        switch (this.f3002a) {
            case 0:
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                float fM2635g = AbstractC1360eE.m2635g((View) obj);
                float fM2635g2 = AbstractC1360eE.m2635g((View) obj2);
                if (fM2635g > fM2635g2) {
                    return -1;
                }
                return fM2635g < fM2635g2 ? 1 : 0;
            case 1:
                return AbstractC0671Pj.m1346d(((C0096C9) obj).f217c, ((C0096C9) obj2).f217c);
            case 2:
                return AbstractC0671Pj.m1346d(((C0764Rr) obj).f2432c, ((C0764Rr) obj2).f2432c);
            case 3:
                return AbstractC0671Pj.m1346d(Integer.valueOf(((FAQItem) obj).getItemOrder()), Integer.valueOf(((FAQItem) obj2).getItemOrder()));
            case 4:
                C2419qj c2419qj = (C2419qj) obj;
                C2419qj c2419qj2 = (C2419qj) obj2;
                RecyclerView recyclerView = c2419qj.f8481d;
                if ((recyclerView == null) == (c2419qj2.f8481d == null)) {
                    boolean z = c2419qj.f8478a;
                    if (z == c2419qj2.f8478a) {
                        int i = c2419qj2.f8479b - c2419qj.f8479b;
                        if (i != 0) {
                            return i;
                        }
                        int i2 = c2419qj.f8480c - c2419qj2.f8480c;
                        if (i2 != 0) {
                            return i2;
                        }
                        return 0;
                    }
                    if (z) {
                        return -1;
                    }
                } else if (recyclerView != null) {
                    return -1;
                }
                return 1;
            case 5:
                return AbstractC0671Pj.m1346d(Integer.valueOf(((C1304d1) obj).f4748d), Integer.valueOf(((C1304d1) obj2).f4748d));
            case 6:
                return ((C0256Fy) obj).f830b - ((C0256Fy) obj2).f830b;
            case 7:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return AbstractC0671Pj.m1346d(Integer.valueOf(((C0185EC) obj).f570v), Integer.valueOf(((C0185EC) obj2).f570v));
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                C0185EC c0185ec = (C0185EC) obj2;
                C0185EC c0185ec2 = (C0185EC) obj;
                return AbstractC0671Pj.m1346d(Boolean.valueOf(AbstractC0585Nj.m1134a(c0185ec.f549a, AbstractC0295Gu.m625r(-792395696306229L)) || (enumC0099CC2 = c0185ec.f567s) == EnumC0099CC.f236d || enumC0099CC2 == EnumC0099CC.f237e), Boolean.valueOf(AbstractC0585Nj.m1134a(c0185ec2.f549a, AbstractC0295Gu.m625r(-792404286240821L)) || (enumC0099CC = c0185ec2.f567s) == EnumC0099CC.f236d || enumC0099CC == EnumC0099CC.f237e));
            case 10:
                return AbstractC0671Pj.m1346d(Boolean.valueOf(AbstractC0585Nj.m1134a(((C0185EC) obj2).f549a, AbstractC0295Gu.m625r(-808265600464949L))), Boolean.valueOf(AbstractC0585Nj.m1134a(((C0185EC) obj).f549a, AbstractC0295Gu.m625r(-808274190399541L))));
            case 11:
                String str = ((C0185EC) obj).f551c;
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                AbstractC0295Gu.m625r(-487753666000949L);
                String lowerCase2 = ((C0185EC) obj2).f551c.toLowerCase(locale);
                AbstractC0295Gu.m625r(-487826680444981L);
                return AbstractC0671Pj.m1346d(lowerCase, lowerCase2);
            case 12:
                String str2 = ((C0185EC) obj2).f551c;
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = str2.toLowerCase(locale2);
                AbstractC0295Gu.m625r(-487899694889013L);
                String lowerCase4 = ((C0185EC) obj).f551c.toLowerCase(locale2);
                AbstractC0295Gu.m625r(-486323441891381L);
                return AbstractC0671Pj.m1346d(lowerCase3, lowerCase4);
            case 13:
                return AbstractC0671Pj.m1346d(Integer.valueOf(((C0185EC) obj2).f561m), Integer.valueOf(((C0185EC) obj).f561m));
            default:
                return ((C0058BE) obj).f134b - ((C0058BE) obj2).f134b;
        }
    }
}
