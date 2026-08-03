package p000a;

import android.content.ContentValues;
import android.os.Handler;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: a.f4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0569f4 {
    /* JADX INFO: renamed from: a */
    public static int m1412a(ArrayList arrayList, boolean z, C0004A3 c0004a3) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (c0004a3 != null && !((Boolean) c0004a3.mo31a()).booleanValue()) {
                String str2 = "setHiddenBatch: state changed, abort batch (done=" + i + "/" + arrayList.size() + ", hide=" + z + ")";
                C0631i9.m1482e(str2, "msg");
                C0908x1.m2194b("[ConvHideRepo] ".concat(str2));
                return i;
            }
            if (m1413b(str, z)) {
                i++;
            }
            C0122Gb.f389a.getClass();
            C0631i9.m1482e(str, "wxid");
            ((Handler) C0122Gb.f400l.m625a()).post(new RunnableC0104Fb(str, z));
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1413b(String str, boolean z) {
        Object next;
        C0115G4 c0115g4;
        Object obj;
        Method method;
        Throwable th = null;
        int i = 0;
        while (true) {
            if (i < 2) {
                try {
                    Set<Map.Entry<String, C0115G4>> setEntrySet = C0924xh.f3533a.entrySet();
                    C0631i9.m1481d(setEntrySet, "<get-entries>(...)");
                    Iterator<T> it = setEntrySet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        Object key = ((Map.Entry) next).getKey();
                        C0631i9.m1481d(key, "<get-key>(...)");
                        if (C0034Be.m94I((CharSequence) key, "EnMicroMsg", false)) {
                            break;
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry == null || (c0115g4 = (C0115G4) entry.getValue()) == null || (obj = c0115g4.f382a) == null) {
                        throw new IllegalStateException("EnMicroMsg db not found");
                    }
                    String str2 = z ? "hidden_conv_parent" : "";
                    try {
                        method = obj.getClass().getMethod("update", String.class, ContentValues.class, String.class, Array.newInstance((Class<?>) String.class, 0).getClass());
                    } catch (NoSuchMethodException unused) {
                        method = null;
                    }
                    if (method == null) {
                        obj.getClass().getMethod("execSQL", String.class, Object[].class).invoke(obj, "UPDATE rconversation SET parentRef = ? WHERE username = ?", new String[]{str2, str});
                        return true;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("parentRef", str2);
                    Object objInvoke = method.invoke(obj, "rconversation", contentValues, "username=?", new String[]{str});
                    Integer num = objInvoke instanceof Integer ? (Integer) objInvoke : null;
                    if ((num != null ? num.intValue() : -1) > 0) {
                        return true;
                    }
                    String str3 = "setHideViaDb: rconversation row not found for " + str + " (0 rows updated)";
                    C0631i9.m1482e(str3, "msg");
                    C0908x1.m2197e("[ConvHideRepo] " + str3);
                } catch (Throwable th2) {
                    th = th2;
                    i++;
                }
            } else {
                String str4 = "🚨 LEAK-RISK: setHideViaDb FAILED after 2 retries: wxid=" + str + " hide=" + z + " err=" + (th != null ? th.getMessage() : null);
                C0631i9.m1482e(str4, "msg");
                C0908x1.m2193a("[ConvHideRepo] ".concat(str4));
            }
        }
        return false;
    }
}
