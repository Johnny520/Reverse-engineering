package top.suzhelan.qstory.hook.item;

import android.graphics.Bitmap;
import android.os.Environment;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import bsh.C2632;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import de.robv.android.xposed.XC_MethodHook;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC4346;
import kotlin.reflect.jvm.internal.AbstractC5061;
import kotlin.text.AbstractC5138;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import p007.AbstractC6136;
import p010.AbstractC6156;
import p026.InterfaceC6294;
import p032.AbstractC6314;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p035.AbstractC6340;
import p217.InterfaceC7966;
import p392.AbstractC9121;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5919 implements InterfaceC6294, InterfaceC7966 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16105;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m11242(Object obj, String str, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m11243(Object obj) {
        throw new AssertionError(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m11244(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m11245() {
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m11246(String str) throws IOException {
        throw new IOException(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m11247(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m11248(StringBuilder sb, int i) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m11249(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* synthetic */ void m11250(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static /* synthetic */ void m11251(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* synthetic */ void m11252(Throwable th) {
        throw new RuntimeException(th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static /* synthetic */ void m11253(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    @Override // p217.InterfaceC7966
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int mo11254(int i, List list) {
        "list";
        list.getClass();
        Object obj = list.get(i);
        if (obj instanceof ItemUiInfoGroupWrapper) {
            return 3;
        }
        if (obj instanceof DirectoryUiInfo) {
            return 2;
        }
        return obj instanceof ItemUiInfo ? 1 : 4;
    }

    @Override // p026.InterfaceC6294
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo1469(XC_MethodHook.MethodHookParam methodHookParam) throws IOException {
        long j;
        String string;
        int i = 0;
        switch (this.f16105) {
            case 0:
                Object result = methodHookParam.getResult();
                if (result == null) {
                    return;
                }
                String str = (String) result;
                File file = new File(str);
                if (file.exists() && file.isFile()) {
                    return;
                }
                if (str.startsWith(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + AbstractC6340.f17465 + "/Tencent/QQfile_recv/")) {
                    methodHookParam.setResult(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download/QQ", file.getName()).getAbsolutePath());
                    return;
                }
                return;
            case 1:
                String str2 = AbstractC6156.f16778;
                if (Modifier.toString(methodHookParam.method.getModifiers()).contains("static")) {
                    StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                    StringBuilder sb = new StringBuilder(AbstractC6156.m11565());
                    AbstractC6136.m11547(-3937632773041554855L, sb, -3937650077464790439L);
                    Class<?> declaringClass = methodHookParam.method.getDeclaringClass();
                    for (Field field : declaringClass.getDeclaredFields()) {
                        AbstractC6156.m11567(sb, field);
                        try {
                            j = -3937560690605426087L;
                            try {
                                if (Modifier.toString(field.getModifiers()).contains("static")) {
                                    Object obj = field.get(null);
                                    if (obj == null || !obj.getClass().getSimpleName().matches("String|CharSequence")) {
                                        sb.append(obj);
                                    } else {
                                        sb.append("\"");
                                        sb.append(obj);
                                        sb.append("\"");
                                    }
                                } else if (field.getType().getSimpleName().matches("String|CharSequence")) {
                                    sb.append("\"");
                                    sb.append("{\u9759\u6001\u65b9\u6cd5\u65e0\u8fd0\u884c\u65f6\u5bf9\u8c61}");
                                    sb.append("\"");
                                } else {
                                    sb.append("\u9759\u6001\u65b9\u6cd5\u65e0\u8fd0\u884c\u65f6\u5bf9\u8c61");
                                }
                            } catch (Exception e) {
                                e = e;
                                sb.append("\u52a8\u6001\u53cd\u5c04\u5b57\u6bb5\u5f02\u5e38 ");
                                sb.append(e);
                            }
                        } catch (Exception e2) {
                            e = e2;
                            j = -3937560690605426087L;
                        }
                        sb.append(";");
                        sb.append(AbstractC3056.m6668(j));
                    }
                    AbstractC6156.m11566(methodHookParam, sb);
                    sb.append("\u8c03\u7528\u6808(\u4ece\u4e0a\u5f80\u4e0b\u8c03\u7528) : \n");
                    AbstractC6156.m11568(methodHookParam, stackTrace, sb, declaringClass);
                } else {
                    StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                    StringBuilder sb2 = new StringBuilder(AbstractC6156.m11565());
                    AbstractC6136.m11547(-3937632773041554855L, sb2, -3937650077464790439L);
                    Class<?> cls = methodHookParam.thisObject.getClass();
                    for (Field field2 : cls.getDeclaredFields()) {
                        AbstractC6156.m11567(sb2, field2);
                        try {
                            if (Modifier.toString(field2.getModifiers()).contains("static")) {
                                Object obj2 = field2.get(null);
                                if (obj2 == null || !obj2.getClass().getSimpleName().matches("String|CharSequence")) {
                                    sb2.append(obj2);
                                } else {
                                    sb2.append("\"");
                                    sb2.append(obj2);
                                    sb2.append("\"");
                                }
                            } else {
                                Object obj3 = field2.get(methodHookParam.thisObject);
                                if (obj3 == null || !obj3.getClass().getSimpleName().matches("String|CharSequence")) {
                                    sb2.append(obj3);
                                } else {
                                    sb2.append("\"");
                                    sb2.append(obj3);
                                    sb2.append("\"");
                                }
                            }
                        } catch (Exception e3) {
                            sb2.append("\u52a8\u6001\u53cd\u5c04\u5c5e\u6027\u5f02\u5e38 : ");
                            sb2.append(e3);
                        }
                        sb2.append(";");
                        sb2.append("\n");
                    }
                    AbstractC6156.m11566(methodHookParam, sb2);
                    sb2.append("\u8c03\u7528\u6808 : \n");
                    AbstractC6156.m11568(methodHookParam, stackTrace2, sb2, cls);
                }
                Object obj4 = methodHookParam.thisObject;
                "thisObject";
                obj4.getClass();
                Class clsM14657 = AbstractC9121.m14657("Lcom/qqfav/data/FavoriteData");
                clsM14657.getClass();
                AbstractC6156.m11569(AbstractC5061.m10024(clsM14657, null, obj4));
                return;
            case 2:
                Object obj5 = methodHookParam.args[0];
                String str3 = (String) AbstractC6317.m11831(String.class, "fileName", obj5);
                String str4 = (String) AbstractC6317.m11831(String.class, "strFilePath", obj5);
                if (str3 == null || str4 == null || !C5877.m11223(str3, str4)) {
                    return;
                }
                AbstractC6317.m11835(obj5, "fileName", String.class, C5877.m11224(str4));
                return;
            case 3:
                Object obj6 = methodHookParam.args[1];
                String str5 = (String) AbstractC6317.m11831(String.class, "FileName", obj6);
                String str6 = (String) AbstractC6317.m11831(String.class, "LocalFile", obj6);
                if (str5 == null || str6 == null || !C5877.m11223(str5, str6)) {
                    return;
                }
                AbstractC6317.m11835(obj6, "FileName", String.class, C5877.m11224(str6));
                return;
            case 4:
                Object obj7 = methodHookParam.args[0];
                String str7 = (String) AbstractC6317.m11831(String.class, "fileName", obj7);
                if (str7 == null || !str7.endsWith(".apk")) {
                    return;
                }
                AbstractC6317.m11835(obj7, "fileName", String.class, AbstractC5138.m10128(str7, ".apk", ".APK"));
                return;
            case 5:
                Object obj8 = methodHookParam.args[1];
                String str8 = (String) AbstractC6317.m11831(String.class, "FileName", obj8);
                if (str8 == null || !str8.endsWith(".apk")) {
                    return;
                }
                AbstractC6317.m11835(obj8, "FileName", String.class, AbstractC5138.m10128(str8, ".apk", ".APK"));
                return;
            case 6:
                Object result2 = methodHookParam.getResult();
                HashMap map = result2 instanceof HashMap ? (HashMap) result2 : null;
                if (map == null) {
                    return;
                }
                HashMap map2 = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    String str9 = (String) entry.getKey();
                    map2.put(str9, ((String) entry.getValue()) + '(' + QQEnvTool.getUinFromUid(str9) + ')');
                }
                methodHookParam.setResult(map2);
                return;
            case 7:
                JSONObject jSONObjectM6316 = InterfaceC2915.m6316(methodHookParam.args[1].toString());
                JSONArray jSONArray = jSONObjectM6316.getJSONArray("items");
                if (jSONArray == null) {
                    return;
                }
                int size = jSONArray.size();
                while (i < size) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject == null || (string = jSONObject.getString("type")) == null) {
                        return;
                    }
                    if (string.equals("qq")) {
                        String string2 = jSONObject.getString("uin");
                        if (string2 == null || string2.length() == 0) {
                            string2 = QQEnvTool.getUinFromUid(jSONObject.getString("uid"));
                        }
                        String string3 = jSONObject.getString("nm");
                        jSONObject.remove("nm");
                        jSONObject.put("nm", string3 + '(' + string2 + ')');
                    }
                    i++;
                }
                methodHookParam.args[1] = jSONObjectM6316.toString();
                return;
            case 8:
                Object result3 = methodHookParam.getResult();
                View view = result3 instanceof View ? (View) result3 : null;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                }
                return;
            case 9:
                Object objM11830 = AbstractC6317.m11830(AbstractC6318.m11838("com.tencent.biz.richframework.widget.listview.card.RFWCardListView"), methodHookParam.thisObject);
                if (objM11830 == null) {
                    return;
                }
                Object objM11818 = AbstractC6314.m11818(ViewParent.class, "getParent", objM11830);
                LinearLayout linearLayout = objM11818 instanceof LinearLayout ? (LinearLayout) objM11818 : null;
                if (linearLayout == null) {
                    C2632.m5294("ParentLayout == null");
                    return;
                }
                int childCount = linearLayout.getChildCount();
                while (i < childCount) {
                    if (linearLayout.getChildAt(i).getVisibility() != 8) {
                        linearLayout.getChildAt(i).setVisibility(8);
                    }
                    i++;
                }
                if (linearLayout.getVisibility() != 8) {
                    linearLayout.setVisibility(8);
                    return;
                }
                return;
            case 10:
                Object obj9 = methodHookParam.args[0];
                Boolean bool = obj9 instanceof Boolean ? (Boolean) obj9 : null;
                if (bool == null || !bool.booleanValue()) {
                    return;
                }
                methodHookParam.args[0] = Boolean.FALSE;
                return;
            case 11:
                Object obj10 = methodHookParam.args[1];
                "null cannot be cast to non-null type kotlin.Long";
                obj10.getClass();
                long jLongValue = ((Long) obj10).longValue();
                if ((jLongValue & 512) == 0) {
                    methodHookParam.args[1] = Long.valueOf(jLongValue | 512);
                    return;
                }
                return;
            case 12:
                methodHookParam.setResult((Object) null);
                return;
            case 13:
                Object obj11 = methodHookParam.args[0];
                "null cannot be cast to non-null type kotlin.Int";
                obj11.getClass();
                int iIntValue = ((Integer) obj11).intValue();
                Object obj12 = methodHookParam.args[1];
                Object obj13 = methodHookParam.thisObject;
                "thisObject";
                obj13.getClass();
                String str10 = (String) AbstractC5061.m10024(null, "e", obj13);
                if (iIntValue == 9) {
                    Object obj14 = methodHookParam.thisObject;
                    "thisObject";
                    obj14.getClass();
                    String strM6668 = "e";
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("(\u4e0b\u8f7d: ");
                    sb3.append(obj12);
                    AbstractC5061.m10018(obj14, strM6668, AbstractC6136.m11557(-3937779862786540967L, sb3, str10));
                    return;
                }
                return;
            case 14:
                Object[] objArr = methodHookParam.args;
                "args";
                objArr.getClass();
                Object objM8848 = AbstractC4346.m8848(objArr);
                String str11 = objM8848 instanceof String ? (String) objM8848 : null;
                if (str11 == null) {
                    return;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(64, 64, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.eraseColor(0);
                "apply(...)";
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str11));
                    try {
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                        return;
                    } finally {
                    }
                } finally {
                    bitmapCreateBitmap.recycle();
                }
            default:
                Object[] objArr2 = methodHookParam.args;
                "args";
                objArr2.getClass();
                Object objM8845 = AbstractC4346.m8845(0, objArr2);
                String str12 = objM8845 instanceof String ? (String) objM8845 : null;
                if (str12 == null) {
                    return;
                }
                Object[] objArr3 = methodHookParam.args;
                "args";
                objArr3.getClass();
                Object objM88452 = AbstractC4346.m8845(1, objArr3);
                Bitmap bitmap = objM88452 instanceof Bitmap ? (Bitmap) objM88452 : null;
                if (bitmap == null) {
                    return;
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(str12);
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                    fileOutputStream2.close();
                    methodHookParam.setResult(Boolean.TRUE);
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3065.m6841(fileOutputStream2, th);
                        throw th2;
                    }
                }
        }
    }
}
