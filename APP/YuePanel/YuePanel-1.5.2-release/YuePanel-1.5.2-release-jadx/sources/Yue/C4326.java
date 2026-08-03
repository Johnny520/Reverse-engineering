package Yue;

import Yue.InterfaceC7144;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C4326 {
    /* JADX INFO: renamed from: ۥ */
    public static void m1290(Object obj, StringBuilder sb) {
        int iLastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append(C6193.f1884);
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
