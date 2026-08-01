package com.p001mr.elaris;

import java.util.Iterator;
import java.util.List;
import p000.AbstractC0008a7;
import p000.C0244h5;
import p000.C0298k8;
import p000.C0563z6;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsTargetSummary {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsTargetSummary() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String keepFireTargetsCompactPreview(InAppSettings inAppSettings) {
        return selectedTargetsCompactPreview(AbstractC0152f.m217n(inAppSettings.getKeepFireTargets()), AbstractC0008a7.m56m(), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String selectedGroupsPreview(List<String> list, List<C0563z6> list2) {
        String str;
        if (list.isEmpty()) {
            return "未选择群";
        }
        StringBuilder sb = new StringBuilder("已选择 ");
        sb.append(list.size());
        sb.append(" 个群");
        String strTrim = "";
        String strTrim2 = list.get(0) == null ? "" : list.get(0).trim();
        if (list2 != null) {
            Iterator<C0563z6> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0563z6 next = it.next();
                if (next != null && strTrim2.equals(next.f1138a) && (str = next.f1139b) != null) {
                    strTrim = str.trim();
                    break;
                }
            }
        }
        if (strTrim.length() > 0 && !strTrim2.equals(strTrim)) {
            sb.append(" · ");
            sb.append(strTrim);
            if (list.size() > 1) {
                sb.append(" 等");
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String selectedTargetsCompactPreview(List<C0298k8> list, List<C0563z6> list2, List<C0244h5> list3) {
        if (list == null || list.isEmpty()) {
            return "未选择续火对象";
        }
        int i = 0;
        int i2 = 0;
        for (C0298k8 c0298k8 : list) {
            if (c0298k8 != null) {
                if (c0298k8.f497a == 1) {
                    i2++;
                } else {
                    i++;
                }
            }
        }
        String strTargetDisplayLine = targetDisplayLine(list.get(0), list2, list3);
        if (list.size() == 1) {
            return "已选 1 个：" + strTargetDisplayLine;
        }
        StringBuilder sb = new StringBuilder("已选 ");
        if (i > 0) {
            sb.append(i);
            sb.append("群");
        }
        if (i2 > 0) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(i2);
            sb.append("友");
        }
        sb.append("：");
        sb.append(strTargetDisplayLine);
        sb.append(" 等");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String targetDisplayLine(C0298k8 c0298k8, List<C0563z6> list, List<C0244h5> list2) {
        if (c0298k8 == null) {
            return "";
        }
        int i = c0298k8.f497a;
        String str = c0298k8.f498b;
        if (i != 1) {
            return troopDisplayLine(str, list);
        }
        String strTrim = str != null ? str.trim() : "";
        if (list2 != null) {
            for (C0244h5 c0244h5 : list2) {
                if (c0244h5 != null && strTrim.equals(c0244h5.f348a)) {
                    String strM511a = c0244h5.f349b;
                    if (strM511a.length() <= 0) {
                        strM511a = c0244h5.m511a();
                    }
                    String strM511a2 = c0244h5.m511a();
                    if (strM511a2.length() == 0 || strM511a2.equals(strM511a)) {
                        return strM511a;
                    }
                    return strM511a + "（" + strM511a2 + "）";
                }
            }
        }
        return strTrim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String troopDisplayLine(String str, List<C0563z6> list) {
        String strTrim = str == null ? "" : str.trim();
        if (list == null) {
            return strTrim;
        }
        for (C0563z6 c0563z6 : list) {
            if (c0563z6 != null && strTrim.equals(c0563z6.f1138a)) {
                String str2 = c0563z6.f1139b;
                String strTrim2 = str2 != null ? str2.trim() : "";
                if (strTrim2.length() > 0 && !strTrim.equals(strTrim2)) {
                    return strTrim2 + "（" + strTrim + "）";
                }
            }
        }
        return strTrim;
    }

    public static String selectedGroupsPreview(InAppSettings inAppSettings) {
        return selectedGroupsPreview(AbstractC0008a7.m64u(inAppSettings.getGroups()), AbstractC0008a7.m56m());
    }
}
