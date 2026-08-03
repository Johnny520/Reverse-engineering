package id;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import p023b8.C0205c;
import p046d6.C0712i;
import p046d6.C0714k;
import p046d6.C0715l;
import p136j8.C2104o;
import p176m1.C2740k;
import p176m1.C2743m;

/* JADX INFO: renamed from: id.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2041a {

    /* JADX INFO: renamed from: a */
    public ArrayList f6881a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2041a(int i9) {
        switch (i9) {
            case 2:
                this.f6881a = new ArrayList(32);
                break;
            default:
                this.f6881a = new ArrayList();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0715l m4991a() {
        C0712i c0712i;
        C0712i c0712i2;
        C0712i c0712i3;
        ArrayList arrayList = this.f6881a;
        Collections.sort(arrayList, new C0205c(1));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            C0712i c0712i4 = (C0712i) ((Map.Entry) arrayList.get(i9)).getKey();
            if (i9 > 0) {
                C0712i c0712i5 = (C0712i) ((Map.Entry) arrayList.get(i9 - 1)).getKey();
                if (c0712i4.m1888e(c0712i5)) {
                    Comparable comparable = c0712i4.f2144b;
                    Comparable comparable2 = c0712i4.f2143a;
                    if (!c0712i4.m1888e(c0712i5)) {
                        c0712i3 = null;
                    } else if (c0712i4.m1886c()) {
                        boolean zM1886c = c0712i5.m1886c();
                        Comparable comparable3 = c0712i5.f2143a;
                        if (!zM1886c) {
                            c0712i = c0712i4.m1886c() ? c0712i4 : c0712i5;
                        } else if (!Objects.equals(comparable2, comparable3) ? comparable2.compareTo(comparable3) <= 0 : !c0712i4.f2145c) {
                        }
                        if (c0712i4.m1887d()) {
                            boolean zM1887d = c0712i5.m1887d();
                            Comparable comparable4 = c0712i5.f2144b;
                            if (!zM1887d) {
                                c0712i2 = c0712i4.m1887d() ? c0712i4 : c0712i5;
                            } else if (!Objects.equals(comparable, comparable4) && comparable.compareTo(comparable4) < 0) {
                            }
                            c0712i3 = new C0712i(c0712i.f2143a, c0712i2.f2144b, c0712i.f2145c);
                        }
                    }
                    if (!c0712i3.m1889f()) {
                        C2104o.m5288m("Overlapping ranges: range ", c0712i5, " overlaps with entry ", c0712i4);
                        return null;
                    }
                } else {
                    continue;
                }
            }
            arrayList2.add(c0712i4);
            arrayList3.add(((Map.Entry) arrayList.get(i9)).getValue());
        }
        return new C0715l(arrayList2, arrayList3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m4992b(float f3, float f10, float f11, float f12, float f13, float f14) {
        this.f6881a.add(new C2740k(f3, f10, f11, f12, f13, f14));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m4993c(float f3, float f10) {
        this.f6881a.add(new C2743m(f3, f10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m4994d(C0712i c0712i, Short sh2) {
        if (c0712i.m1889f()) {
            C2104o.m5294t("Ranges cannot be empty");
        } else {
            this.f6881a.add(new C0714k(c0712i, sh2));
        }
    }
}
