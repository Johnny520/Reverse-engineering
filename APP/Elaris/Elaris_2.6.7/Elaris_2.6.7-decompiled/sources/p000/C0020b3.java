package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.io.File;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: b3 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0020b3 extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        ThreadLocal threadLocal = AbstractC0242h3.f343c;
        C0226g3 c0226g3 = (C0226g3) threadLocal.get();
        threadLocal.remove();
        if (c0226g3 == null) {
            return;
        }
        Object obj = c0226g3.f300b;
        Object obj2 = c0226g3.f299a;
        File file = c0226g3.f302d;
        AbstractC0242h3.m489e(file.length(), file);
        Object objM485a = c0226g3.f301c;
        if (objM485a == null) {
            objM485a = AbstractC0242h3.m485a(obj2, obj);
        }
        if (objM485a == null) {
            HookEntry.logAlways("download redirect QQ state entity missing final=".concat(AbstractC0242h3.m479H(file.getAbsolutePath())));
            return;
        }
        String strM488d = AbstractC0242h3.m488d(file);
        String strM482K = AbstractC0242h3.m482K(objM485a, "getFilePath", "strFilePath");
        int iM504t = AbstractC0242h3.m504t(objM485a, "getStatus", "status");
        if (!strM482K.isEmpty() && strM488d.equalsIgnoreCase(AbstractC0242h3.m488d(new File(strM482K))) && iM504t == 1) {
            HookEntry.logAlways("download redirect QQ state confirmed final=".concat(AbstractC0242h3.m479H(strM488d)));
            return;
        }
        String strM488d2 = AbstractC0242h3.m488d(file);
        boolean zM481J = AbstractC0242h3.m481J(objM485a, "fileName", file.getName()) | AbstractC0242h3.m481J(objM485a, "filePath", strM488d2) | AbstractC0242h3.m481J(objM485a, "strFilePath", strM488d2) | AbstractC0242h3.m480I(objM485a, "status", 1);
        try {
            Method methodM497m = AbstractC0242h3.m497m(obj2.getClass(), obj.getClass(), objM485a.getClass());
            methodM497m.setAccessible(true);
            methodM497m.invoke(obj2, obj, objM485a, Boolean.FALSE);
            String strM482K2 = AbstractC0242h3.m482K(objM485a, "getFilePath", "strFilePath");
            int iM504t2 = AbstractC0242h3.m504t(objM485a, "getStatus", "status");
            StringBuilder sb = new StringBuilder("download redirect QQ state synchronized final=");
            sb.append(AbstractC0242h3.m479H(strM488d));
            sb.append(" status=");
            sb.append(iM504t2);
            sb.append(" path=");
            sb.append(AbstractC0242h3.m479H(strM482K2));
            sb.append(zM481J ? " entity=patched" : "");
            HookEntry.logAlways(sb.toString());
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("download redirect QQ state sync failed final=");
            sb2.append(AbstractC0242h3.m479H(strM488d));
            sb2.append(zM481J ? " entity=patched" : "");
            sb2.append(" reason=");
            sb2.append(th.getClass().getSimpleName());
            sb2.append(": ");
            sb2.append(String.valueOf(th.getMessage()));
            HookEntry.logAlways(sb2.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        File file;
        String str;
        Object obj = AbstractC0004a3.f11a;
        if (HookEntry.runtimeBool(Prefs.KEY_DOWNLOAD_DIRECT_WRITE)) {
            AbstractC0242h3.f343c.remove();
            Object obj2 = methodHookParam.args[0];
            Object objM485a = AbstractC0242h3.m485a(methodHookParam.thisObject, obj2);
            if (obj2 == null || AbstractC0242h3.m504t(obj2, "getTrasferStatus", "trasferStatus") != 4) {
                file = null;
            } else {
                String strM482K = AbstractC0242h3.m482K(obj2, "getFilePath", "filePath");
                if (strM482K.length() != 0) {
                    File file2 = new File(strM482K);
                    C0559z2 c0559z2M20m = AbstractC0004a3.m20m(file2);
                    if (c0559z2M20m == null) {
                        String lowerCase = strM482K.replace('\\', '/').toLowerCase();
                        if (lowerCase.contains("/data/data/com.tencent.mobileqq/qqfile_recv/") || lowerCase.contains("/data/user/0/com.tencent.mobileqq/qqfile_recv/") || (lowerCase.contains("/android/data/com.tencent.mobileqq/") && lowerCase.contains("/tencent/qqfile_recv/"))) {
                            HookEntry.logAlways("download redirect completion rejected reason=private-source source=".concat(AbstractC0242h3.m479H(strM482K)));
                        }
                    } else {
                        try {
                            if (!file2.isFile() || file2.length() <= 0) {
                                throw new IllegalStateException("redirect staging file missing");
                            }
                            long jM507w = AbstractC0242h3.m507w(obj2, "getTotalSize", "totalSize");
                            long j = c0559z2M20m.f1127c;
                            if (j > 0) {
                                jM507w = j;
                            }
                            if (jM507w > 0 && file2.length() != jM507w) {
                                throw new IllegalStateException("redirect staging size mismatch expected=" + jM507w + " actual=" + file2.length());
                            }
                            File fileM476E = AbstractC0242h3.m476E(file2, c0559z2M20m.f1126b);
                            if (fileM476E == null) {
                                throw new IllegalStateException("redirect final publication failed");
                            }
                            if (!AbstractC0242h3.m481J(obj2, "filePath", fileM476E.getAbsolutePath())) {
                                throw new IllegalStateException("notify filePath update failed");
                            }
                            Object objM472A = AbstractC0242h3.m472A(obj2, "getCommonFileInfo", "commonFileInfo");
                            if (objM472A != null) {
                                AbstractC0242h3.m481J(objM472A, "filePath", fileM476E.getAbsolutePath());
                            }
                            int iM473B = AbstractC0242h3.m473B(obj2, fileM476E, jM507w);
                            AbstractC0242h3.m478G(fileM476E, jM507w, file2);
                            if (!file2.delete() && file2.exists()) {
                                HookEntry.log("download redirect staging cleanup failed file=".concat(AbstractC0242h3.m479H(file2.getAbsolutePath())));
                            }
                            StringBuilder sb = new StringBuilder("download redirected completed write=");
                            sb.append(AbstractC0242h3.m479H(file2.getAbsolutePath()));
                            sb.append(" final=");
                            sb.append(AbstractC0242h3.m479H(fileM476E.getAbsolutePath()));
                            sb.append(" mode=target-staging-mediastore");
                            if (iM473B > 0) {
                                str = " msg_record=patched file_element_patched=" + iM473B;
                            } else {
                                str = " msg_record=unpatched";
                            }
                            sb.append(str);
                            HookEntry.logAlways(sb.toString());
                            AbstractC0004a3.m13f(c0559z2M20m);
                            file = fileM476E;
                        } catch (Throwable th) {
                            try {
                                HookEntry.logAlways("download redirect finalization failed write=" + AbstractC0242h3.m479H(file2.getAbsolutePath()) + " final=" + AbstractC0242h3.m479H(c0559z2M20m.f1126b.getAbsolutePath()) + " reason=" + th.getClass().getSimpleName() + ": " + String.valueOf(th.getMessage()));
                                file = null;
                            } finally {
                                AbstractC0004a3.m13f(c0559z2M20m);
                            }
                        }
                    }
                    file = null;
                }
            }
            if (file == null) {
                return;
            }
            if (objM485a == null) {
                objM485a = AbstractC0242h3.m485a(methodHookParam.thisObject, obj2);
            }
            AbstractC0242h3.f343c.set(new C0226g3(methodHookParam.thisObject, obj2, objM485a, file));
        }
    }
}
