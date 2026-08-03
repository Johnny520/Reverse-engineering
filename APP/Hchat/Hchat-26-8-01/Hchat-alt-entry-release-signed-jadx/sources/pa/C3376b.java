package pa;

import android.text.TextUtils;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import p099h.Hchat.utils.KavaReflector;
import p162l3.C2458l;

/* JADX INFO: renamed from: pa.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3376b extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10903a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3377c f10904b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3376b(C3377c c3377c, int i9) {
        this.f10903a = i9;
        this.f10904b = c3377c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object field;
        Object field2;
        switch (this.f10903a) {
            case 1:
                Object obj = methodHookParam.thisObject;
                C3377c c3377c = this.f10904b;
                C2458l c2458l = (C2458l) c3377c.f10909e;
                c2458l.getClass();
                boolean z9 = false;
                try {
                    z9 = c2458l.m5853b().getBoolean("hb_fake_packet_enable", false);
                    break;
                } catch (Throwable unused) {
                }
                if (z9 && !AbstractC3375a.f10902a.isEmpty() && obj != null) {
                    try {
                        field = KavaReflector.readField(obj, "m");
                    } catch (Throwable unused2) {
                        field = null;
                    }
                    try {
                        if (field != null) {
                            String strValueOf = String.valueOf(field);
                            String strM7156c = AbstractC3375a.m7156c(strValueOf);
                            if (!strM7156c.equals(strValueOf)) {
                                KavaReflector.writeField(obj, "m", strM7156c);
                                c3377c.m7164d("假红包群ID已修正，避免分裂群");
                            }
                        } else {
                            for (Field field3 : KavaReflector.declaredFields(obj.getClass())) {
                                try {
                                    if (field3.getType() == String.class && (field2 = KavaReflector.readField(field3, obj)) != null && String.valueOf(field2).contains("<wcpayinfo>")) {
                                        String strM7156c2 = AbstractC3375a.m7156c(String.valueOf(field2));
                                        if (!strM7156c2.equals(String.valueOf(field2))) {
                                            KavaReflector.writeField(field3, obj, strM7156c2);
                                            c3377c.m7164d("假红包群ID已修正，避免分裂群");
                                        }
                                    }
                                } catch (Throwable unused3) {
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        c3377c.m7164d("ERROR 假红包响应修正失败: " + th2.getMessage());
                        return;
                    }
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        boolean z9;
        Object[] objArr;
        Object obj;
        switch (this.f10903a) {
            case 0:
                C3377c c3377c = this.f10904b;
                c3377c.getClass();
                try {
                    C2458l c2458l = (C2458l) c3377c.f10909e;
                    c2458l.getClass();
                    int i9 = 0;
                    try {
                        z9 = c2458l.m5853b().getBoolean("hb_fake_packet_enable", false);
                    } catch (Throwable unused) {
                        z9 = false;
                    }
                    if (z9 && methodHookParam != null && (objArr = methodHookParam.args) != null && objArr.length >= 2 && (obj = objArr[1]) != null) {
                        int iIntValue = ((Number) KavaReflector.invoke(KavaReflector.findMethod(obj.getClass(), "getType", new Class[0]), obj, new Object[0])).intValue();
                        String strValueOf = String.valueOf(KavaReflector.invoke(KavaReflector.findMethod(obj.getClass(), "getUri", new Class[0]), obj, new Object[0]));
                        if (iIntValue != 1575 && !strValueOf.contains("requestwxhb")) {
                        }
                        Object objM7157c = C3377c.m7157c(KavaReflector.invoke(KavaReflector.findMethod(obj.getClass(), "getReqObj", new Class[0]), obj, new Object[0]));
                        if (objM7157c != null) {
                            Object objInvoke = KavaReflector.invoke(KavaReflector.findMethod(objM7157c.getClass(), "toByteArray", new Class[0]), objM7157c, new Object[0]);
                            byte[] bArr = null;
                            if (objInvoke != null) {
                                try {
                                    if (objInvoke.getClass().isArray()) {
                                        int length = Array.getLength(objInvoke);
                                        byte[] bArr2 = new byte[length];
                                        while (true) {
                                            if (i9 < length) {
                                                Object obj2 = Array.get(objInvoke, i9);
                                                if (obj2 instanceof Number) {
                                                    bArr2[i9] = ((Number) obj2).byteValue();
                                                    i9++;
                                                }
                                            } else {
                                                bArr = bArr2;
                                            }
                                        }
                                    }
                                } catch (Throwable unused2) {
                                }
                            }
                            if (bArr != null && bArr.length != 0) {
                                String str = iIntValue + "|" + strValueOf + "|" + objM7157c.getClass().getName() + "|" + Arrays.hashCode(bArr);
                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c3377c.f10911g;
                                if (!TextUtils.isEmpty(str)) {
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    Long l10 = (Long) concurrentHashMap.put(str, Long.valueOf(jCurrentTimeMillis));
                                    if (concurrentHashMap.size() > 20) {
                                        try {
                                            concurrentHashMap.remove((String) concurrentHashMap.keySet().iterator().next());
                                            break;
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                    if (l10 != null && jCurrentTimeMillis - l10.longValue() < 500) {
                                    }
                                    break;
                                }
                                byte[] bArrM7165f = c3377c.m7165f(bArr);
                                if (bArrM7165f != null) {
                                    KavaReflector.invoke(KavaReflector.findMethod(objM7157c.getClass(), "parseFrom", byte[].class), objM7157c, bArrM7165f);
                                    c3377c.m7164d("发包请求已篡改: uri=" + strValueOf + ", cgi=" + iIntValue + ", len=" + bArr.length + "->" + bArrM7165f.length);
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    c3377c.m7164d("ERROR 发包请求Hook处理失败: " + th2.getMessage());
                    return;
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
