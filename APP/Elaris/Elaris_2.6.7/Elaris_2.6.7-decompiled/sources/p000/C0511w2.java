package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: w2 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0511w2 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f993a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0511w2(String str) {
        super(35);
        this.f993a = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        AbstractC0004a3.f14d.remove();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        boolean zContainsKey;
        boolean z;
        String string;
        Object obj;
        Object obj2;
        Object objInvoke;
        if (HookEntry.runtimeBool(Prefs.KEY_DOWNLOAD_DIRECT_WRITE)) {
            Object obj3 = methodHookParam.args[0];
            String strM27t = "";
            if (obj3 instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj3;
                if (!arrayList.isEmpty() && (obj2 = arrayList.get(0)) != null) {
                    try {
                        objInvoke = obj2.getClass().getMethod("getFileName", null).invoke(obj2, null);
                    } catch (Throwable unused) {
                    }
                    if (objInvoke instanceof String) {
                        strM27t = AbstractC0004a3.m27t((String) objInvoke);
                    } else {
                        try {
                            Object obj4 = obj2.getClass().getField("fileName").get(obj2);
                            if (obj4 instanceof String) {
                                strM27t = AbstractC0004a3.m27t((String) obj4);
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
            Object obj5 = methodHookParam.args[0];
            long jLongValue = 0;
            if (obj5 instanceof ArrayList) {
                ArrayList arrayList2 = (ArrayList) obj5;
                if (!arrayList2.isEmpty() && (obj = arrayList2.get(0)) != null) {
                    String[] strArr = {"getFileSize", "getSize"};
                    int i = 0;
                    while (true) {
                        if (i < 2) {
                            try {
                                Object objInvoke2 = obj.getClass().getMethod(strArr[i], null).invoke(obj, null);
                                if (objInvoke2 instanceof Number) {
                                    jLongValue = ((Number) objInvoke2).longValue();
                                    break;
                                }
                                continue;
                            } catch (Throwable unused3) {
                            }
                            i++;
                        } else {
                            String[] strArr2 = {"fileSize", "size"};
                            for (int i2 = 0; i2 < 2; i2++) {
                                try {
                                    Object obj6 = obj.getClass().getField(strArr2[i2]).get(obj);
                                    if (obj6 instanceof Number) {
                                        jLongValue = ((Number) obj6).longValue();
                                        break;
                                    }
                                    continue;
                                } catch (Throwable unused4) {
                                }
                            }
                        }
                    }
                }
            }
            boolean z2 = System.currentTimeMillis() <= AbstractC0299k9.f501c;
            if (z2 && !"kernel_cpp_proxy".equals(this.f993a)) {
                HookEntry.logAlways("download redirect deferred route=" + this.f993a + " reason=legacy-group-file-page");
                return;
            }
            Object obj7 = methodHookParam.args[1];
            String strTrim = obj7 instanceof String ? ((String) obj7).trim() : "";
            File fileM11d = AbstractC0004a3.m11d();
            if (fileM11d == null) {
                return;
            }
            if (strM27t.length() == 0) {
                HookEntry.log("download direct write skipped reason=file name missing");
                return;
            }
            if (z2) {
                C0527x2 c0527x2M9b = AbstractC0004a3.m9b(fileM11d, strM27t, jLongValue);
                if (c0527x2M9b == null) {
                    HookEntry.log("download direct write skipped reason=legacy target allocation failed");
                    return;
                }
                String strM10c = AbstractC0004a3.m10c(fileM11d);
                String strM10c2 = AbstractC0004a3.m10c((File) c0527x2M9b.f1027a);
                methodHookParam.args[1] = strM10c2;
                AbstractC0004a3.f14d.set(strM10c2);
                C0543y2 c0543y2M8a = AbstractC0004a3.m8a(methodHookParam.args[0], strM10c2, strM10c, true);
                C0559z2 c0559z2M20m = AbstractC0004a3.m20m(new File(strM10c2));
                StringBuilder sb = new StringBuilder("download redirect selected route=");
                sb.append(this.f993a);
                sb.append(" write=");
                sb.append(strM10c2);
                sb.append(" target=");
                sb.append(strM10c2);
                sb.append(c0559z2M20m == null ? "" : " final=" + AbstractC0004a3.m10c(c0559z2M20m.f1126b) + " staging=true");
                sb.append(strTrim.length() == 0 ? " save_path=filled" : " save_path=overwrite");
                sb.append(" legacy_page=true");
                if (c0543y2M8a.f1085b > 0) {
                    StringBuilder sb2 = new StringBuilder(" file_path=patched fields=");
                    sb2.append(((String) c0543y2M8a.f1084a).length() == 0 ? String.valueOf(c0543y2M8a.f1085b) : ((String) c0543y2M8a.f1084a) + ":" + c0543y2M8a.f1085b);
                    string = sb2.toString();
                } else {
                    string = " file_path=unpatched";
                }
                sb.append(string);
                HookEntry.logAlways(sb.toString());
                return;
            }
            String strM10c3 = "";
            Object obj8 = AbstractC0004a3.f14d.get();
            String strM10c4 = "";
            if (obj8 instanceof String) {
                String strTrim2 = ((String) obj8).trim();
                if (strTrim2.length() != 0 && !strTrim2.startsWith("content://")) {
                    if (strTrim2.startsWith("file://")) {
                        strTrim2 = strTrim2.substring(7);
                    }
                    File file = new File(strTrim2);
                    File parentFile = file.getParentFile();
                    if (parentFile != null && AbstractC0004a3.m10c(parentFile).equalsIgnoreCase(AbstractC0004a3.m10c(fileM11d))) {
                        String strM27t2 = AbstractC0004a3.m27t(file.getName());
                        if (strM27t2.length() != 0) {
                            strM10c4 = AbstractC0004a3.m10c(new File(fileM11d, strM27t2));
                        }
                    }
                }
            }
            if (strM10c4.length() == 0) {
                strM10c4 = "";
            } else {
                try {
                    File file2 = new File(strM10c4);
                    synchronized (AbstractC0004a3.f11a) {
                        AbstractC0004a3.m21n(System.currentTimeMillis());
                        zContainsKey = AbstractC0004a3.f12b.containsKey(AbstractC0004a3.m30w(file2));
                    }
                    if (!zContainsKey) {
                        strM10c4 = "";
                    }
                } catch (Throwable unused5) {
                    strM10c4 = "";
                }
            }
            if (strM10c4.length() > 0) {
                z = true;
                strM10c3 = strM10c4;
            } else {
                z = false;
            }
            if (!z) {
                C0527x2 c0527x2M9b2 = AbstractC0004a3.m9b(fileM11d, strM27t, jLongValue);
                if (c0527x2M9b2 == null) {
                    HookEntry.log("download direct write skipped reason=target allocation failed");
                    return;
                }
                strM10c3 = AbstractC0004a3.m10c((File) c0527x2M9b2.f1027a);
            }
            methodHookParam.args[1] = strM10c3;
            AbstractC0004a3.f14d.set(strM10c3);
            C0543y2 c0543y2M8a2 = AbstractC0004a3.m8a(methodHookParam.args[0], strM10c3, "", false);
            C0559z2 c0559z2M20m2 = AbstractC0004a3.m20m(new File(strM10c3));
            StringBuilder sb3 = new StringBuilder("download redirect selected route=");
            sb3.append(this.f993a);
            sb3.append(" write=");
            sb3.append(strM10c3);
            sb3.append(c0559z2M20m2 == null ? "" : " final=" + AbstractC0004a3.m10c(c0559z2M20m2.f1126b) + " staging=true");
            sb3.append(strTrim.length() == 0 ? " save_path=filled" : "");
            sb3.append(z ? " save_path=reused" : "");
            sb3.append(c0543y2M8a2.f1085b > 0 ? " file_path=patched" : "");
            HookEntry.logAlways(sb3.toString());
        }
    }
}
