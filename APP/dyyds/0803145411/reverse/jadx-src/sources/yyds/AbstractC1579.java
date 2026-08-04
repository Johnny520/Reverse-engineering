package yyds;

import android.view.View;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: yyds.ᛷᛶᛷᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1579 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0415 f8015 = new C0415("REMOVED_TASK", 1);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C0415 f8016 = new C0415("CLOSED_EMPTY", 1);

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static InterfaceC2213 m3232(InterfaceC2247 interfaceC2247, InterfaceC2289 interfaceC2289) {
        return AbstractC1544.m3188(interfaceC2247.getKey(), interfaceC2289) ? C2586.f12764 : interfaceC2247;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final List m3233(InterfaceC1212 interfaceC1212) {
        int iM1197 = AbstractC0427.m1197(interfaceC1212, Name.MARK);
        int iM11972 = AbstractC0427.m1197(interfaceC1212, "seq");
        int iM11973 = AbstractC0427.m1197(interfaceC1212, "from");
        int iM11974 = AbstractC0427.m1197(interfaceC1212, "to");
        C2578 c2578M3296 = AbstractC0024.m3296();
        while (interfaceC1212.mo433()) {
            c2578M3296.add(new C2712((int) interfaceC1212.getLong(iM1197), (int) interfaceC1212.getLong(iM11972), interfaceC1212.mo430(iM11973), interfaceC1212.mo430(iM11974)));
        }
        return AbstractC1595.m3265(AbstractC0024.m3305(c2578M3296));
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final Object m3234(InterfaceC2349 interfaceC2349, String str, AbstractC1320 abstractC1320) {
        Object objMo886 = interfaceC2349.mo886(str, new C1844(4), abstractC1320);
        return objMo886 == EnumC1765.f8858 ? objMo886 : C2746.f13459;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m3235(Throwable th, Throwable th2) {
        if (th != th2) {
            Integer num = AbstractC1236.f5659;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC1667.f8520;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final void m3236(View view) {
        C1728 c1728 = new C1728();
        C2245 c2245 = new C2245(view, c1728);
        c2245.f11084 = c1728;
        c1728.f8730 = c2245;
        while (c1728.hasNext()) {
            View view2 = (View) c1728.next();
            C0026 c0026 = (C0026) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (c0026 == null) {
                c0026 = new C0026();
                view2.setTag(R.id.pooling_container_listener_holder_tag, c0026);
            }
            ArrayList arrayList = c0026.f9667;
            int iM4850 = AbstractC2725.m4850(arrayList);
            if (-1 < iM4850) {
                arrayList.get(iM4850).getClass();
                C0188.m794();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static InterfaceC0826 m3237(int i, InterfaceC2266 interfaceC2266) {
        C1586 c1586 = C1586.f8039;
        int iM4012 = AbstractC2104.m4012(i);
        if (iM4012 == 0) {
            return new C0078(interfaceC2266);
        }
        if (iM4012 == 1) {
            C1855 c1855 = new C1855();
            c1855.f9332 = interfaceC2266;
            c1855.f9333 = c1586;
            return c1855;
        }
        if (iM4012 != 2) {
            C0188.m801();
            return null;
        }
        C1682 c1682 = new C1682();
        c1682.f8572 = interfaceC2266;
        c1682.f8573 = c1586;
        return c1682;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final C0900 m3238(InterfaceC0124 interfaceC0124, String str, boolean z) throws Exception {
        InterfaceC1212 interfaceC1212Mo575 = interfaceC0124.mo575("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iM1197 = AbstractC0427.m1197(interfaceC1212Mo575, "seqno");
            int iM11972 = AbstractC0427.m1197(interfaceC1212Mo575, "cid");
            int iM11973 = AbstractC0427.m1197(interfaceC1212Mo575, "name");
            int iM11974 = AbstractC0427.m1197(interfaceC1212Mo575, "desc");
            if (iM1197 != -1 && iM11972 != -1 && iM11973 != -1 && iM11974 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (interfaceC1212Mo575.mo433()) {
                    if (((int) interfaceC1212Mo575.getLong(iM11972)) >= 0) {
                        int i = (int) interfaceC1212Mo575.getLong(iM1197);
                        String strMo430 = interfaceC1212Mo575.mo430(iM11973);
                        String str2 = interfaceC1212Mo575.getLong(iM11974) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strMo430);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listM3272 = AbstractC1595.m3272(linkedHashMap.entrySet(), new C1300(18));
                ArrayList arrayList = new ArrayList(AbstractC0055.m419(listM3272, 10));
                Iterator it = listM3272.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listM3269 = AbstractC1595.m3269(arrayList);
                List listM32722 = AbstractC1595.m3272(linkedHashMap2.entrySet(), new C1300(19));
                ArrayList arrayList2 = new ArrayList(AbstractC0055.m419(listM32722, 10));
                Iterator it2 = listM32722.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                C0900 c0900 = new C0900(str, z, listM3269, AbstractC1595.m3269(arrayList2));
                AbstractC0797.m1819(interfaceC1212Mo575, null);
                return c0900;
            }
            AbstractC0797.m1819(interfaceC1212Mo575, null);
            return null;
        } finally {
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final int m3239(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static InterfaceC2247 m3240(InterfaceC2247 interfaceC2247, InterfaceC2289 interfaceC2289) {
        if (AbstractC1544.m3188(interfaceC2247.getKey(), interfaceC2289)) {
            return interfaceC2247;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static boolean m3241(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m3241(file2) && z;
        }
        return z;
    }
}
