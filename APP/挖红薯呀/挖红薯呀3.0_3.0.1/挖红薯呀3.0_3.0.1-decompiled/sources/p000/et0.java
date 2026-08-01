package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class et0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f1526a = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public et0(Object obj) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m966a(int i, AbstractC0189ey abstractC0189ey, Object obj) {
        ArrayList arrayList = abstractC0189ey.f1545a;
        if (arrayList == null) {
            m967b(i, abstractC0189ey, null);
            return true;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof C0788u2)) {
                if (!(obj2 instanceof AbstractC0189ey)) {
                    C0921xc.m5130k(obj2, "Unexpected child source info ");
                    break;
                }
                if (m966a(i, (AbstractC0189ey) obj2, obj)) {
                    m967b(0, abstractC0189ey, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                m967b(0, abstractC0189ey, obj2);
                return true;
            }
            i2++;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m967b(int i, AbstractC0189ey abstractC0189ey, Object obj) {
        this.f1526a.add(new C0130di(i, null, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m968c(int i, Object obj, AbstractC0189ey abstractC0189ey, Object obj2) {
        if (p30.m3002l(obj, C0320ii.f2572a)) {
            m967b(i, abstractC0189ey, null);
        }
    }
}
