package p000a;

import android.content.Intent;
import android.database.Cursor;
import android.util.Log;
import io.github.libxposed.api.XposedInterface;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import p000a.C0186K3;
import p000a.C0582fh;
import p000a.C0924xh;

/* JADX INFO: renamed from: a.v8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0877v8 implements XposedInterface.Hooker {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3442a;

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00fb A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object intercept(XposedInterface.Chain chain) {
        Object next;
        String string;
        int i = 0;
        switch (this.f3442a) {
            case 0:
                C0631i9.m1482e(chain, "chain");
                if (!C0896w8.m2182c()) {
                    return chain.proceed();
                }
                HashSet hashSetM2184e = C0896w8.m2184e();
                int size = chain.getArgs().size();
                while (i < size) {
                    Object obj = chain.getArgs().get(i);
                    List list = C0198Kf.m549b(obj) ? (List) obj : null;
                    if (list != null) {
                        C0896w8.m2181b(list, hashSetM2184e);
                    }
                    i++;
                }
                return chain.proceed();
            case 1:
                C0631i9.m1482e(chain, "chain");
                if (!C0316R8.m868k()) {
                    return chain.proceed();
                }
                List args = chain.getArgs();
                C0631i9.m1481d(args, "getArgs(...)");
                Object objM1951o0 = C0834t3.m1951o0(args, 0);
                if (objM1951o0 == null) {
                    return chain.proceed();
                }
                String strM1180a = C0487ah.m1180a(objM1951o0);
                if (strM1180a != null) {
                    ExecutorService executorService = C0582fh.f2149G;
                    if (C0582fh.a.m1423a(strM1180a)) {
                        C0316R8.m873r("intercept incoming call handler for wxid=".concat(strM1180a));
                        C0506bh.m1256g(strM1180a);
                        return null;
                    }
                }
                return chain.proceed();
            case 2:
                C0631i9.m1482e(chain, "chain");
                if (!C0316R8.m868k()) {
                    return chain.proceed();
                }
                List args2 = chain.getArgs();
                C0631i9.m1481d(args2, "getArgs(...)");
                Object objM1951o02 = C0834t3.m1951o0(args2, 0);
                String str = objM1951o02 instanceof String ? (String) objM1951o02 : null;
                if (str != null) {
                    ExecutorService executorService2 = C0582fh.f2149G;
                    if (C0582fh.a.m1423a(str)) {
                        C0316R8.m873r("intercept voip bind for user=".concat(str));
                        C0506bh.m1256g(str);
                        return null;
                    }
                }
                return chain.proceed();
            case 3:
                C0631i9.m1482e(chain, "chain");
                if (!C0316R8.m868k()) {
                    return chain.proceed();
                }
                List args3 = chain.getArgs();
                C0631i9.m1481d(args3, "getArgs(...)");
                Object objM1951o03 = C0834t3.m1951o0(args3, 1);
                String str2 = objM1951o03 instanceof String ? (String) objM1951o03 : null;
                if (str2 != null) {
                    ExecutorService executorService3 = C0582fh.f2149G;
                    if (C0582fh.a.m1423a(str2)) {
                        C0316R8.m873r("intercept incoming call UI for wxid=".concat(str2));
                        C0506bh.m1256g(str2);
                        return null;
                    }
                }
                return chain.proceed();
            case 4:
                C0631i9.m1482e(chain, "chain");
                if (!C0316R8.m868k()) {
                    return chain.proceed();
                }
                List args4 = chain.getArgs();
                C0631i9.m1481d(args4, "getArgs(...)");
                Iterator it = args4.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (next instanceof Intent) {
                        }
                    } else {
                        next = null;
                    }
                }
                Intent intent = next instanceof Intent ? (Intent) next : null;
                if (intent == null || !C0316R8.m875t(intent)) {
                    return chain.proceed();
                }
                C0316R8.m873r("intercept Flutter global for VOIP intent");
                return null;
            case 5:
                C0631i9.m1482e(chain, "chain");
                if (!C0316R8.m868k()) {
                    return chain.proceed();
                }
                List args5 = chain.getArgs();
                C0631i9.m1481d(args5, "getArgs(...)");
                Object objM1951o04 = C0834t3.m1951o0(args5, 0);
                if (objM1951o04 == null) {
                    return chain.proceed();
                }
                String strM1180a2 = C0487ah.m1180a(objM1951o04);
                if (strM1180a2 != null) {
                    ExecutorService executorService4 = C0582fh.f2149G;
                    if (C0582fh.a.m1423a(strM1180a2)) {
                        C0316R8.m873r("intercept incoming call manager for wxid=".concat(strM1180a2));
                        C0506bh.m1256g(strM1180a2);
                        return Boolean.FALSE;
                    }
                }
                return chain.proceed();
            default:
                C0631i9.m1482e(chain, "chain");
                Object objProceed = chain.proceed();
                C0186K3.f638a.getClass();
                boolean z = C0186K3.a.m508i().f2433c;
                if (z) {
                    Object obj2 = chain.getArgs().get(1);
                    byte[] bArr = obj2 instanceof byte[] ? (byte[]) obj2 : null;
                    if (bArr != null) {
                        new String(bArr, C0382V2.f1441a);
                    }
                }
                Object obj3 = chain.getArgs().get(0);
                String str3 = obj3 instanceof String ? (String) obj3 : null;
                if (str3 == null) {
                    str3 = "";
                }
                C0726n9.m1670m("hook db", str3, "opened=" + (objProceed != null));
                if (str3.length() > 0) {
                    ConcurrentHashMap<String, C0115G4> concurrentHashMap = C0924xh.f3533a;
                    C0115G4 c0115g4 = new C0115G4();
                    c0115g4.f382a = objProceed;
                    concurrentHashMap.put(str3, c0115g4);
                    if (z && C0034Be.m94I(str3, "EnMicroMsg", false) && C0034Be.m94I(str3, "EnMicroMsg", false)) {
                        C0115G4 c0115g42 = concurrentHashMap.get(str3);
                        Object obj4 = c0115g42 != null ? c0115g42.f382a : null;
                        if (obj4 == null) {
                            Log.e("FCloud_DB", "Store has no DB instance for ".concat(str3));
                        } else {
                            try {
                                Cursor cursorM2211a = C0924xh.a.m2211a(obj4, "SELECT username, conRemark, nickname, alias FROM rcontact", null);
                                if (cursorM2211a == null) {
                                    Log.e("FCloud_DB", "rawQuery returned null cursor");
                                } else {
                                    try {
                                        int columnIndex = cursorM2211a.getColumnIndex("username");
                                        int columnIndex2 = cursorM2211a.getColumnIndex("conRemark");
                                        int columnIndex3 = cursorM2211a.getColumnIndex("nickname");
                                        int columnIndex4 = cursorM2211a.getColumnIndex("alias");
                                        Log.e("FCloud_DB", "columns user=" + columnIndex + " remark=" + columnIndex2 + " nick=" + columnIndex3 + " alias=" + columnIndex4);
                                        while (cursorM2211a.moveToNext()) {
                                            if (columnIndex >= 0) {
                                                try {
                                                    string = cursorM2211a.getString(columnIndex);
                                                } catch (Throwable unused) {
                                                }
                                            } else {
                                                string = null;
                                            }
                                            if (string != null && !C0034Be.m101P(string)) {
                                                String string2 = columnIndex2 >= 0 ? cursorM2211a.getString(columnIndex2) : null;
                                                String string3 = columnIndex3 >= 0 ? cursorM2211a.getString(columnIndex3) : null;
                                                String string4 = columnIndex4 >= 0 ? cursorM2211a.getString(columnIndex4) : null;
                                                if (string2 == null) {
                                                    if (string3 != null || C0034Be.m101P(string3)) {
                                                        string3 = null;
                                                    }
                                                    if (string3 == null) {
                                                        string4 = string3;
                                                    } else if (string4 == null || C0034Be.m101P(string4)) {
                                                        string4 = null;
                                                    }
                                                    if (string4 == null && !C0034Be.m101P(string4)) {
                                                        C0924xh.f3534b.put(string, string4);
                                                        i++;
                                                    }
                                                } else {
                                                    if (C0034Be.m101P(string2)) {
                                                        string2 = null;
                                                    }
                                                    if (string2 != null) {
                                                        string4 = string2;
                                                        if (string4 == null) {
                                                        }
                                                    } else if (string3 != null) {
                                                        string3 = null;
                                                        if (string3 == null) {
                                                        }
                                                        if (string4 == null) {
                                                            C0924xh.f3534b.put(string, string4);
                                                            i++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        C0413Wf c0413Wf = C0413Wf.f1577a;
                                        cursorM2211a.close();
                                        Log.e("FCloud_DB", "loaded " + i + " contacts into cache");
                                    } finally {
                                    }
                                }
                            } catch (Throwable th) {
                                Log.e("FCloud_DB", "loadAllContacts failed: " + th.getMessage());
                            }
                        }
                    }
                }
                return objProceed;
        }
    }
}
