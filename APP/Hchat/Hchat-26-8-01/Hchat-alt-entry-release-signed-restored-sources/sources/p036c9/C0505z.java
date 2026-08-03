package p036c9;

import java.util.Comparator;
import java.util.Map;
import p244qb.C3486g;
import p332wb.C5026jv;
import p332wb.C5292s0;

/* JADX INFO: renamed from: c9.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0505z implements Comparator {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1542g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Map f1543h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0505z(Map map, int i9) {
        this.f1542g = i9;
        this.f1543h = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1542g) {
            case 0:
                String str = ((C5026jv) obj).f18249a;
                Map map = this.f1543h;
                Integer num = (Integer) map.get(str);
                if (num == null) {
                    num = num;
                }
                Integer num2 = (Integer) map.get(((C5026jv) obj2).f18249a);
                return num.compareTo(num2 != null ? num2 : Integer.MAX_VALUE);
            case 1:
                String str2 = ((C5026jv) obj).f18249a;
                Map map2 = this.f1543h;
                Integer num3 = (Integer) map2.get(str2);
                if (num3 == null) {
                    num3 = num;
                }
                Integer num4 = (Integer) map2.get(((C5026jv) obj2).f18249a);
                return num3.compareTo(num4 != null ? num4 : Integer.MAX_VALUE);
            case 2:
                String str3 = ((C5026jv) obj).f18249a;
                Map map3 = this.f1543h;
                Integer num5 = (Integer) map3.get(str3);
                if (num5 == null) {
                    num5 = num;
                }
                Integer num6 = (Integer) map3.get(((C5026jv) obj2).f18249a);
                return num5.compareTo(num6 != null ? num6 : Integer.MAX_VALUE);
            case 3:
                String str4 = ((C3486g) obj).f11315a;
                Map map4 = this.f1543h;
                Integer num7 = (Integer) map4.get(str4);
                if (num7 == null) {
                    num7 = num;
                }
                Integer num8 = (Integer) map4.get(((C3486g) obj2).f11315a);
                return num7.compareTo(num8 != null ? num8 : Integer.MAX_VALUE);
            default:
                String str5 = ((C5292s0) obj).f20550a;
                Map map5 = this.f1543h;
                Integer num9 = (Integer) map5.get(str5);
                if (num9 == null) {
                    num9 = num;
                }
                Integer num10 = (Integer) map5.get(((C5292s0) obj2).f20550a);
                return num9.compareTo(num10 != null ? num10 : Integer.MAX_VALUE);
        }
    }
}
