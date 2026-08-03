package p139jb;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ContextMenu;
import android.view.MenuItem;
import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p002a1.RunnableC0006d;
import p099h.Hchat.R;
import p099h.Hchat.utils.KavaReflector;
import p218og.AbstractC3149m;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p332wb.AbstractC4855en;
import tf.AbstractC4165l;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: jb.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2120d extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7076a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2121e f7077b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2120d(C2121e c2121e, int i9) {
        this.f7076a = i9;
        this.f7077b = c2121e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        Object objM5329b;
        C2119c c2119c;
        String strM8392A1;
        String strM8392A12;
        Object c3959f;
        Object obj2;
        int i9 = this.f7076a;
        int i10 = 0;
        ContextMenu contextMenu = null;
        C2121e c2121e = this.f7077b;
        methodHookParam.getClass();
        switch (i9) {
            case 0:
                c2121e.getClass();
                Object[] objArr = methodHookParam.args;
                if (objArr != null) {
                    int length = objArr.length;
                    for (int i11 = 0; i11 < length; i11++) {
                        obj = objArr[i11];
                        if (!(obj instanceof MenuItem)) {
                        }
                    }
                    obj = null;
                } else {
                    obj = null;
                }
                MenuItem menuItem = obj instanceof MenuItem ? (MenuItem) obj : null;
                if (menuItem != null) {
                    if (menuItem.getItemId() == 1212368385 || menuItem.getItemId() == 1212368386) {
                        Object[] objArr2 = methodHookParam.args;
                        if (objArr2 == null || (objM5329b = AbstractC4165l.m8366C0(0, objArr2)) == null) {
                            Object[] objArr3 = methodHookParam.args;
                            if (objArr3 != null) {
                                for (Object obj3 : objArr3) {
                                    Object objM5329b2 = C2121e.m5329b(obj3);
                                    if (objM5329b2 != null) {
                                        objM5329b = objM5329b2;
                                    }
                                }
                                objM5329b = C2121e.m5329b(methodHookParam.thisObject);
                            } else {
                                objM5329b = C2121e.m5329b(methodHookParam.thisObject);
                            }
                        } else {
                            if (!C2121e.m5331e(objM5329b)) {
                                objM5329b = null;
                            }
                            if (objM5329b == null) {
                            }
                        }
                        if (objM5329b != null) {
                            Object field = KavaReflector.readField(objM5329b, "feedObject");
                            if (field != null) {
                                Object objInvokeMethod = KavaReflector.invokeMethod(field, "getMediaType", new Object[0]);
                                Number number = objInvokeMethod instanceof Number ? (Number) objInvokeMethod : null;
                                if (number != null) {
                                    int iIntValue = number.intValue();
                                    Object objInvokeMethod2 = KavaReflector.invokeMethod(field, "getMediaList", new Object[0]);
                                    LinkedList linkedList = objInvokeMethod2 instanceof LinkedList ? (LinkedList) objInvokeMethod2 : null;
                                    if (linkedList != null) {
                                        ArrayList arrayList = new ArrayList();
                                        Iterator it = linkedList.iterator();
                                        while (it.hasNext()) {
                                            Object objInvokeMethod3 = KavaReflector.invokeMethod(it.next(), "toJSON", new Object[0]);
                                            JSONObject jSONObject = objInvokeMethod3 instanceof JSONObject ? (JSONObject) objInvokeMethod3 : null;
                                            if (jSONObject != null) {
                                                arrayList.add(jSONObject);
                                            }
                                        }
                                        c2119c = new C2119c(iIntValue, arrayList);
                                    } else {
                                        c2119c = null;
                                    }
                                }
                            }
                            if (c2119c == null) {
                                c2121e.m5339k("未解析到视频号媒体");
                                methodHookParam.setResult((Object) null);
                            } else {
                                ArrayList arrayList2 = c2119c.f7075b;
                                int itemId = menuItem.getItemId();
                                int i12 = c2119c.f7074a;
                                if (itemId == 1212368385) {
                                    if (i12 != 2) {
                                        strM8392A1 = HttpUrl.FRAGMENT_ENCODE_SET;
                                        if (i12 == 4) {
                                            JSONObject jSONObject2 = (JSONObject) AbstractC4166m.m8424v1(arrayList2);
                                            String strM5335i = C2121e.m5335i(jSONObject2);
                                            if (AbstractC3149m.m6721t0(strM5335i)) {
                                                String strM9263g = AbstractC4855en.m9263g("密链: ", C2121e.m5330d(jSONObject2));
                                                String strOptString = jSONObject2 != null ? jSONObject2.optString("decodeKey") : null;
                                                if (strOptString != null) {
                                                    strM8392A1 = strOptString;
                                                }
                                                strM8392A12 = AbstractC4166m.m8392A1(AbstractC0000a.m101y0(strM9263g, "密钥: ".concat(strM8392A1)), "\n", null, null, null, 62);
                                            } else {
                                                strM8392A12 = "链接: ".concat(strM5335i);
                                            }
                                            strM8392A1 = strM8392A12;
                                        }
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it2 = arrayList2.iterator();
                                        while (it2.hasNext()) {
                                            String strM5330d = C2121e.m5330d((JSONObject) it2.next());
                                            if (strM5330d != null) {
                                                arrayList3.add(strM5330d);
                                            }
                                        }
                                        strM8392A1 = AbstractC4166m.m8392A1(arrayList3, "\n", null, null, null, 62);
                                    }
                                    if (AbstractC3149m.m6721t0(strM8392A1)) {
                                        c2121e.m5339k("未知的媒体类型，无法复制");
                                    } else {
                                        Object systemService = c2121e.f7078a.f12143a.getSystemService("clipboard");
                                        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                                        if (clipboardManager != null) {
                                            clipboardManager.setPrimaryClip(ClipData.newPlainText("Hchat Finder Media", strM8392A1));
                                        }
                                        c2121e.m5339k("已复制");
                                    }
                                } else if (i12 == 2) {
                                    new Thread(new RunnableC0006d(arrayList2, 20, c2121e), "Hchat-FinderImageDownload").start();
                                } else if (i12 != 4) {
                                    c2121e.m5339k("未知的媒体类型，无法下载");
                                } else {
                                    JSONObject jSONObject3 = (JSONObject) AbstractC4166m.m8424v1(arrayList2);
                                    if (jSONObject3 == null) {
                                        c2121e.m5339k("未找到视频");
                                    } else {
                                        new Thread(new RunnableC0006d(c2121e, 19, jSONObject3), "Hchat-FinderVideoDownload").start();
                                    }
                                }
                                methodHookParam.setResult((Object) null);
                            }
                        } else {
                            c2121e.m5339k("未找到视频号媒体");
                            methodHookParam.setResult((Object) null);
                        }
                    }
                }
                break;
            default:
                Object[] objArr4 = methodHookParam.args;
                c2121e.getClass();
                if (objArr4 != null) {
                    int length2 = objArr4.length;
                    while (true) {
                        if (i10 < length2) {
                            obj2 = objArr4[i10];
                            if (!(obj2 instanceof ContextMenu)) {
                                i10++;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    if (obj2 instanceof ContextMenu) {
                        contextMenu = (ContextMenu) obj2;
                    }
                }
                if (contextMenu != null) {
                    try {
                        c2121e.m5336a(contextMenu, 1212368385, "复制链接", R.drawable.ic_hchat_copy_link);
                        c2121e.m5336a(contextMenu, 1212368386, "下载视频", R.drawable.ic_hchat_download_video);
                        c3959f = C3967n.f12976a;
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                        c2121e.f7079b.invoke("视频号菜单注入失败", thM8182b);
                    }
                }
                break;
        }
    }
}
