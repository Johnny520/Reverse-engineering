package top.suzhelan.qstory.hook.item;

import android.graphics.Bitmap;
import android.os.Environment;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import bsh.C2633;
import com.alibaba.fastjson2.AbstractC2905;
import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
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
import kotlin.collections.AbstractC4347;
import kotlin.text.AbstractC5139;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import p010.AbstractC6187;
import p026.InterfaceC6312;
import p033.AbstractC6333;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p036.AbstractC6358;
import p217.InterfaceC7967;
import p287.AbstractC8405;
import p389.AbstractC9090;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5925 implements InterfaceC6312, InterfaceC7967 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16114;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m11303(Object obj, String str, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m11304(Object obj) {
        throw new AssertionError(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m11305(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m11306() {
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m11307(String str) throws IOException {
        throw new IOException(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m11308(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m11309(StringBuilder sb, int i) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m11310(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* synthetic */ void m11311(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static /* synthetic */ void m11312(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* synthetic */ void m11313(Throwable th) {
        throw new RuntimeException(th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static /* synthetic */ void m11314(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    @Override // p217.InterfaceC7967
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int mo11315(int i, List list) {
        AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵");
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

    @Override // p026.InterfaceC6312
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo1479(XC_MethodHook.MethodHookParam methodHookParam) throws IOException {
        String string;
        int i = 0;
        switch (this.f16114) {
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
                if (str.startsWith(Environment.getExternalStorageDirectory().getAbsolutePath() + AbstractC8405.m13972(858) + AbstractC6358.f17512 + AbstractC8405.m13972(1083))) {
                    methodHookParam.setResult(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + AbstractC8405.m13972(1082), file.getName()).getAbsolutePath());
                    return;
                }
                return;
            case 1:
                String str2 = AbstractC6187.f17015;
                if (Modifier.toString(methodHookParam.method.getModifiers()).contains(AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜呜呜呜"))) {
                    StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                    StringBuilder sb = new StringBuilder(AbstractC6187.m11596());
                    sb.append(AbstractC8405.m13972(839));
                    sb.append(AbstractC8405.m13972(840));
                    Class<?> declaringClass = methodHookParam.method.getDeclaringClass();
                    Field[] declaredFields = declaringClass.getDeclaredFields();
                    int length = declaredFields.length;
                    while (i < length) {
                        Field field = declaredFields[i];
                        AbstractC6187.m11598(sb, field);
                        try {
                            try {
                                if (Modifier.toString(field.getModifiers()).contains(AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜呜呜呜"))) {
                                    Object obj = field.get(null);
                                    if (obj == null || !obj.getClass().getSimpleName().matches(AbstractC8405.m13972(841))) {
                                        sb.append(obj);
                                    } else {
                                        sb.append(AbstractC8405.m13973("喵呜喵呜喵喵喵呜"));
                                        sb.append(obj);
                                        sb.append(AbstractC8405.m13973("喵呜喵呜喵喵喵呜"));
                                    }
                                } else if (field.getType().getSimpleName().matches(AbstractC8405.m13972(841))) {
                                    sb.append(AbstractC8405.m13973("喵呜喵呜喵喵喵呜"));
                                    sb.append(AbstractC8405.m13972(845));
                                    sb.append(AbstractC8405.m13973("喵呜喵呜喵喵喵呜"));
                                } else {
                                    sb.append(AbstractC8405.m13972(846));
                                }
                            } catch (Exception e) {
                                e = e;
                                sb.append(AbstractC8405.m13972(847));
                                sb.append(e);
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                        sb.append(AbstractC8405.m13973("喵呜喵喵呜喵喵喵"));
                        sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
                        i++;
                    }
                    AbstractC6187.m11597(methodHookParam, sb);
                    sb.append(AbstractC8405.m13972(848));
                    AbstractC6187.m11599(methodHookParam, stackTrace, sb, declaringClass);
                } else {
                    StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                    StringBuilder sb2 = new StringBuilder(AbstractC6187.m11596());
                    sb2.append(AbstractC8405.m13972(839));
                    sb2.append(AbstractC8405.m13972(840));
                    Class<?> cls = methodHookParam.thisObject.getClass();
                    Field[] declaredFields2 = cls.getDeclaredFields();
                    int length2 = declaredFields2.length;
                    while (i < length2) {
                        Field field2 = declaredFields2[i];
                        AbstractC6187.m11598(sb2, field2);
                        try {
                            if (Modifier.toString(field2.getModifiers()).contains(AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜呜呜呜"))) {
                                Object obj2 = field2.get(null);
                                if (obj2 == null || !obj2.getClass().getSimpleName().matches(AbstractC8405.m13972(841))) {
                                    sb2.append(obj2);
                                } else {
                                    sb2.append(AbstractC8405.m13973("喵呜喵呜喵喵喵呜"));
                                    sb2.append(obj2);
                                    sb2.append(AbstractC8405.m13973("喵呜喵呜喵喵喵呜"));
                                }
                            } else {
                                Object obj3 = field2.get(methodHookParam.thisObject);
                                if (obj3 == null || !obj3.getClass().getSimpleName().matches(AbstractC8405.m13972(841))) {
                                    sb2.append(obj3);
                                } else {
                                    sb2.append(AbstractC8405.m13973("喵呜喵呜喵喵喵呜"));
                                    sb2.append(obj3);
                                    sb2.append(AbstractC8405.m13973("喵呜喵呜喵喵喵呜"));
                                }
                            }
                        } catch (Exception e3) {
                            sb2.append(AbstractC8405.m13972(842));
                            sb2.append(e3);
                        }
                        sb2.append(AbstractC8405.m13973("喵呜喵喵呜喵喵喵"));
                        sb2.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
                        i++;
                    }
                    AbstractC6187.m11597(methodHookParam, sb2);
                    sb2.append(AbstractC8405.m13972(853));
                    AbstractC6187.m11599(methodHookParam, stackTrace2, sb2, cls);
                }
                Object obj4 = methodHookParam.thisObject;
                AbstractC8405.m13972(1891);
                obj4.getClass();
                Class clsM14669 = AbstractC9090.m14669(AbstractC8405.m13972(1892));
                clsM14669.getClass();
                AbstractC6187.m11600(AbstractC3065.m6825(clsM14669, null, obj4));
                return;
            case 2:
                Object obj5 = methodHookParam.args[0];
                String str3 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(587), obj5);
                String str4 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(1905), obj5);
                if (str3 == null || str4 == null || !C5882.m11284(str3, str4)) {
                    return;
                }
                AbstractC6336.m11863(obj5, AbstractC8405.m13972(587), String.class, C5882.m11285(str4));
                return;
            case 3:
                Object obj6 = methodHookParam.args[1];
                String str5 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(1906), obj6);
                String str6 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(1907), obj6);
                if (str5 == null || str6 == null || !C5882.m11284(str5, str6)) {
                    return;
                }
                AbstractC6336.m11863(obj6, AbstractC8405.m13972(1906), String.class, C5882.m11285(str6));
                return;
            case 4:
                Object obj7 = methodHookParam.args[0];
                String str7 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(587), obj7);
                if (str7 == null || !str7.endsWith(AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵呜呜"))) {
                    return;
                }
                AbstractC6336.m11863(obj7, AbstractC8405.m13972(587), String.class, AbstractC5139.m10137(str7, AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵呜呜"), AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵呜呜喵呜喵喵~喵喵呜喵呜喵呜喵~喵喵呜喵喵喵呜呜")));
                return;
            case 5:
                Object obj8 = methodHookParam.args[1];
                String str8 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(1906), obj8);
                if (str8 == null || !str8.endsWith(AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵呜呜"))) {
                    return;
                }
                AbstractC6336.m11863(obj8, AbstractC8405.m13972(1906), String.class, AbstractC5139.m10137(str8, AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵呜呜"), AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵呜呜喵呜喵喵~喵喵呜喵呜喵呜喵~喵喵呜喵喵喵呜呜")));
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
                JSONObject jSONObjectM6374 = InterfaceC2916.m6374(methodHookParam.args[1].toString());
                JSONArray jSONArray = jSONObjectM6374.getJSONArray(AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵呜喵呜呜喵"));
                if (jSONArray == null) {
                    return;
                }
                int size = jSONArray.size();
                while (i < size) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject == null || (string = jSONObject.getString(AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜"))) == null) {
                        return;
                    }
                    if (string.equals(AbstractC8405.m13973("喵喵喵喵喵喵呜喵~喵喵喵喵喵呜喵喵"))) {
                        String string2 = jSONObject.getString(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"));
                        if (string2 == null || string2.length() == 0) {
                            string2 = QQEnvTool.getUinFromUid(jSONObject.getString(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜喵")));
                        }
                        String string3 = jSONObject.getString(AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜呜喵喵喵"));
                        jSONObject.remove(AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜呜喵喵喵"));
                        jSONObject.put(AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜呜喵喵喵"), string3 + '(' + string2 + ')');
                    }
                    i++;
                }
                methodHookParam.args[1] = jSONObjectM6374.toString();
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
                Object objM11858 = AbstractC6336.m11858(AbstractC6337.m11866(AbstractC8405.m13972(1979)), methodHookParam.thisObject);
                if (objM11858 == null) {
                    return;
                }
                Object objM11846 = AbstractC6333.m11846(ViewParent.class, AbstractC8405.m13972(1980), objM11858);
                LinearLayout linearLayout = objM11846 instanceof LinearLayout ? (LinearLayout) objM11846 : null;
                if (linearLayout == null) {
                    C2633.m5339(AbstractC8405.m13972(1981));
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
                AbstractC8405.m13972(1954);
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
                AbstractC8405.m13972(1866);
                obj11.getClass();
                int iIntValue = ((Integer) obj11).intValue();
                Object obj12 = methodHookParam.args[1];
                Object obj13 = methodHookParam.thisObject;
                AbstractC8405.m13972(1891);
                obj13.getClass();
                String str10 = (String) AbstractC3065.m6825(null, AbstractC8405.m13973("喵喵喵呜喵呜呜喵"), obj13);
                if (iIntValue == 9) {
                    Object obj14 = methodHookParam.thisObject;
                    AbstractC8405.m13972(1891);
                    obj14.getClass();
                    AbstractC3065.m6805(obj14, AbstractC8405.m13973("喵喵喵呜喵呜呜喵"), AbstractC8405.m13972(2085) + obj12 + AbstractC8405.m13973("喵呜喵呜呜喵呜喵~喵呜喵呜喵呜喵呜") + str10);
                    return;
                }
                return;
            case 14:
                Object[] objArr = methodHookParam.args;
                AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜");
                objArr.getClass();
                Object objM8828 = AbstractC4347.m8828(objArr);
                String str11 = objM8828 instanceof String ? (String) objM8828 : null;
                if (str11 == null) {
                    return;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(64, 64, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.eraseColor(0);
                AbstractC8405.m13972(2102);
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
                AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜");
                objArr2.getClass();
                Object objM8824 = AbstractC4347.m8824(0, objArr2);
                String str12 = objM8824 instanceof String ? (String) objM8824 : null;
                if (str12 == null) {
                    return;
                }
                Object[] objArr3 = methodHookParam.args;
                AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜");
                objArr3.getClass();
                Object objM88242 = AbstractC4347.m8824(1, objArr3);
                Bitmap bitmap = objM88242 instanceof Bitmap ? (Bitmap) objM88242 : null;
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
                        AbstractC2905.m6308(fileOutputStream2, th);
                        throw th2;
                    }
                }
        }
    }
}
