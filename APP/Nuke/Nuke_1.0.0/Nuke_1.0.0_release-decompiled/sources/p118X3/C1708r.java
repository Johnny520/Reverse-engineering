package p118X3;

import java.util.ArrayList;
import java.util.Iterator;
import p061L2.AbstractC0974n;
import p117X2.AbstractC1665j;
import p149d3.AbstractC1976d;
import p179i4.AbstractC2352g;
import p202m4.AbstractC2617a;

/* JADX INFO: renamed from: X3.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1708r {

    /* JADX INFO: renamed from: a */
    public String f5860a;

    /* JADX INFO: renamed from: d */
    public String f5863d;

    /* JADX INFO: renamed from: g */
    public ArrayList f5866g;

    /* JADX INFO: renamed from: h */
    public String f5867h;

    /* JADX INFO: renamed from: b */
    public String f5861b = "";

    /* JADX INFO: renamed from: c */
    public String f5862c = "";

    /* JADX INFO: renamed from: e */
    public int f5864e = -1;

    /* JADX INFO: renamed from: f */
    public final ArrayList f5865f = AbstractC2352g.m4178A("");

    /* JADX INFO: renamed from: d */
    public static ArrayList m3042d(String str) {
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (i5 <= str.length()) {
            int iM3634b0 = AbstractC1976d.m3634b0(str, '&', i5, 4);
            if (iM3634b0 == -1) {
                iM3634b0 = str.length();
            }
            int iM3634b02 = AbstractC1976d.m3634b0(str, '=', i5, 4);
            if (iM3634b02 == -1 || iM3634b02 > iM3634b0) {
                String strSubstring = str.substring(i5, iM3634b0);
                AbstractC1665j.m2984d(strSubstring, "substring(...)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i5, iM3634b02);
                AbstractC1665j.m2984d(strSubstring2, "substring(...)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iM3634b02 + 1, iM3634b0);
                AbstractC1665j.m2984d(strSubstring3, "substring(...)");
                arrayList.add(strSubstring3);
            }
            i5 = iM3634b0 + 1;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final C1709s m3043a() {
        ArrayList arrayList;
        String str = this.f5860a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strM4570d = AbstractC2617a.m4570d(this.f5861b, 0, 0, 7);
        String strM4570d2 = AbstractC2617a.m4570d(this.f5862c, 0, 0, 7);
        String str2 = this.f5863d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iM3044b = m3044b();
        ArrayList arrayList2 = this.f5865f;
        ArrayList arrayList3 = new ArrayList(AbstractC0974n.m2029K(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(AbstractC2617a.m4570d((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = this.f5866g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(AbstractC0974n.m2029K(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? AbstractC2617a.m4570d(str3, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f5867h;
        return new C1709s(str, strM4570d, strM4570d2, str2, iM3044b, arrayList3, arrayList, str4 != null ? AbstractC2617a.m4570d(str4, 0, 0, 7) : null, toString());
    }

    /* JADX INFO: renamed from: b */
    public final int m3044b() {
        int i5 = this.f5864e;
        if (i5 != -1) {
            return i5;
        }
        String str = this.f5860a;
        AbstractC1665j.m2982b(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002a  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3045c(p118X3.C1709s r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p118X3.C1708r.m3045c(X3.s, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p118X3.C1708r.toString():java.lang.String");
    }
}
