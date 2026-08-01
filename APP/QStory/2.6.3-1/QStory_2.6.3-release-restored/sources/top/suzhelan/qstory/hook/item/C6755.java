package top.suzhelan.qstory.hook.item;

import android.graphics.Bitmap;
import android.os.Environment;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import bsh.C3466;
import com.alibaba.fastjson2.AbstractC3738;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3897;
import de.robv.android.xposed.XC_MethodHook;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC5179;
import kotlin.text.AbstractC5971;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import p026.AbstractC7016;
import p042.InterfaceC7141;
import p049.AbstractC7162;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p052.AbstractC7187;
import p233.InterfaceC8796;
import p405.AbstractC9919;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6755 implements InterfaceC7141, InterfaceC8796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16459;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m11862(Object obj, String str, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m11863(Object obj) {
        throw new AssertionError(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m11864(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m11865() {
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m11866(String str) throws IOException {
        throw new IOException(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m11867(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m11868(StringBuilder sb, int i) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m11869(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* synthetic */ void m11870(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static /* synthetic */ void m11871(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* synthetic */ void m11872(Throwable th) {
        throw new RuntimeException(th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static /* synthetic */ void m11873(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    @Override // p233.InterfaceC8796
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int mo11874(int i, List list) {
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

    @Override // p042.InterfaceC7141
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo2039(XC_MethodHook.MethodHookParam methodHookParam) throws IOException {
        String string;
        int i = 0;
        switch (this.f16459) {
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
                if (str.startsWith(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + AbstractC7187.f17857 + "/Tencent/QQfile_recv/")) {
                    methodHookParam.setResult(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download/QQ", file.getName()).getAbsolutePath());
                    return;
                }
                return;
            case 1:
                String str2 = AbstractC7016.f17360;
                if (Modifier.toString(methodHookParam.method.getModifiers()).contains("static")) {
                    StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                    StringBuilder sb = new StringBuilder(AbstractC7016.m12155());
                    sb.append("\n-------------------------------------------------------------------");
                    sb.append("\n属性 : \n\n");
                    Class<?> declaringClass = methodHookParam.method.getDeclaringClass();
                    Field[] declaredFields = declaringClass.getDeclaredFields();
                    int length = declaredFields.length;
                    while (i < length) {
                        Field field = declaredFields[i];
                        AbstractC7016.m12157(sb, field);
                        try {
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
                                    sb.append("{静态方法无运行时对象}");
                                    sb.append("\"");
                                } else {
                                    sb.append("静态方法无运行时对象");
                                }
                            } catch (Exception e) {
                                e = e;
                                sb.append("动态反射字段异常 ");
                                sb.append(e);
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                        sb.append(";");
                        sb.append("\n");
                        i++;
                    }
                    AbstractC7016.m12156(methodHookParam, sb);
                    sb.append("调用栈(从上往下调用) : \n");
                    AbstractC7016.m12158(methodHookParam, stackTrace, sb, declaringClass);
                } else {
                    StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                    StringBuilder sb2 = new StringBuilder(AbstractC7016.m12155());
                    sb2.append("\n-------------------------------------------------------------------");
                    sb2.append("\n属性 : \n\n");
                    Class<?> cls = methodHookParam.thisObject.getClass();
                    Field[] declaredFields2 = cls.getDeclaredFields();
                    int length2 = declaredFields2.length;
                    while (i < length2) {
                        Field field2 = declaredFields2[i];
                        AbstractC7016.m12157(sb2, field2);
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
                            sb2.append("动态反射属性异常 : ");
                            sb2.append(e3);
                        }
                        sb2.append(";");
                        sb2.append("\n");
                        i++;
                    }
                    AbstractC7016.m12156(methodHookParam, sb2);
                    sb2.append("调用栈 : \n");
                    AbstractC7016.m12158(methodHookParam, stackTrace2, sb2, cls);
                }
                Object obj4 = methodHookParam.thisObject;
                "thisObject";
                obj4.getClass();
                Class clsM15228 = AbstractC9919.m15228("Lcom/qqfav/data/FavoriteData");
                clsM15228.getClass();
                AbstractC7016.m12159(AbstractC3897.m7385(clsM15228, null, obj4));
                return;
            case 2:
                Object obj5 = methodHookParam.args[0];
                String str3 = (String) AbstractC7165.m12418(String.class, "fileName", obj5);
                String str4 = (String) AbstractC7165.m12418(String.class, "strFilePath", obj5);
                if (str3 == null || str4 == null || !C6712.m11843(str3, str4)) {
                    return;
                }
                AbstractC7165.m12422(obj5, "fileName", String.class, C6712.m11844(str4));
                return;
            case 3:
                Object obj6 = methodHookParam.args[1];
                String str5 = (String) AbstractC7165.m12418(String.class, "FileName", obj6);
                String str6 = (String) AbstractC7165.m12418(String.class, "LocalFile", obj6);
                if (str5 == null || str6 == null || !C6712.m11843(str5, str6)) {
                    return;
                }
                AbstractC7165.m12422(obj6, "FileName", String.class, C6712.m11844(str6));
                return;
            case 4:
                Object obj7 = methodHookParam.args[0];
                String str7 = (String) AbstractC7165.m12418(String.class, "fileName", obj7);
                if (str7 == null || !str7.endsWith(".apk")) {
                    return;
                }
                AbstractC7165.m12422(obj7, "fileName", String.class, AbstractC5971.m10696(str7, ".apk", ".APK"));
                return;
            case 5:
                Object obj8 = methodHookParam.args[1];
                String str8 = (String) AbstractC7165.m12418(String.class, "FileName", obj8);
                if (str8 == null || !str8.endsWith(".apk")) {
                    return;
                }
                AbstractC7165.m12422(obj8, "FileName", String.class, AbstractC5971.m10696(str8, ".apk", ".APK"));
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
                JSONObject jSONObjectM6934 = InterfaceC3749.m6934(methodHookParam.args[1].toString());
                JSONArray jSONArray = jSONObjectM6934.getJSONArray("items");
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
                methodHookParam.args[1] = jSONObjectM6934.toString();
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
                Object objM12417 = AbstractC7165.m12417(AbstractC7166.m12425("com.tencent.biz.richframework.widget.listview.card.RFWCardListView"), methodHookParam.thisObject);
                if (objM12417 == null) {
                    return;
                }
                Object objM12405 = AbstractC7162.m12405(ViewParent.class, "getParent", objM12417);
                LinearLayout linearLayout = objM12405 instanceof LinearLayout ? (LinearLayout) objM12405 : null;
                if (linearLayout == null) {
                    C3466.m5899("ParentLayout == null");
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
                String str10 = (String) AbstractC3897.m7385(null, "e", obj13);
                if (iIntValue == 9) {
                    Object obj14 = methodHookParam.thisObject;
                    "thisObject";
                    obj14.getClass();
                    AbstractC3897.m7365(obj14, "e", "(下载: " + obj12 + ") " + str10);
                    return;
                }
                return;
            case 14:
                Object[] objArr = methodHookParam.args;
                "args";
                objArr.getClass();
                Object objM9387 = AbstractC5179.m9387(objArr);
                String str11 = objM9387 instanceof String ? (String) objM9387 : null;
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
                Object objM9383 = AbstractC5179.m9383(0, objArr2);
                String str12 = objM9383 instanceof String ? (String) objM9383 : null;
                if (str12 == null) {
                    return;
                }
                Object[] objArr3 = methodHookParam.args;
                "args";
                objArr3.getClass();
                Object objM93832 = AbstractC5179.m9383(1, objArr3);
                Bitmap bitmap = objM93832 instanceof Bitmap ? (Bitmap) objM93832 : null;
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
                        AbstractC3738.m6868(fileOutputStream2, th);
                        throw th2;
                    }
                }
        }
    }
}
