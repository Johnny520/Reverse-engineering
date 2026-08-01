package p054;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson2.AbstractC3738;
import com.davemorrissey.labs.subscaleview.C0328R;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.client.plugins.AbstractC4765;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import lin.xposed.hook.javaplugin.JavaPluginLoad;
import lin.xposed.hook.javaplugin.PluginCallback;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p026.AbstractC7017;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p052.AbstractC7187;
import p055.ViewOnLongClickListenerC7235;
import top.suzhelan.qstory.p015ui.activity.SettingActivity;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7202 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17873;

    public /* synthetic */ C7202(int i) {
        this.f17873 = i;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = 2;
        Field field = null;
        switch (this.f17873) {
            case 1:
                Iterator it = C7210.f17887.iterator();
                while (it.hasNext()) {
                    ((InterfaceC7201) it.next()).show();
                }
                break;
            case 2:
                Iterator it2 = C7210.f17887.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC7201) it2.next()).hide();
                }
                break;
            case 3:
            case 7:
            default:
                super.afterHookedMethod(methodHookParam);
                break;
            case 4:
                Object objM12417 = AbstractC7165.m12417(AbstractC7166.m12425("com.tencent.aio.data.AIOContact"), AbstractC7165.m12417(AbstractC7166.m12425("com.tencent.aio.data.AIOSession"), AbstractC7165.m12417(AbstractC7166.m12425("com.tencent.aio.data.AIOParam"), methodHookParam.thisObject)));
                C7208.f17883.push(objM12417);
                C7208.f17882 = objM12417;
                break;
            case 5:
                Stack stack = C7208.f17883;
                if (!stack.empty()) {
                    stack.pop();
                }
                if (!stack.empty()) {
                    C7208.f17882 = stack.peek();
                }
                break;
            case 6:
                Object obj = methodHookParam.thisObject;
                C7208.f17880 = AbstractC7165.m12417(AbstractC7166.m12425("com.tencent.mobileqq.app.QQAppInterface"), obj);
                C7208.f17881 = AbstractC7165.m12420(obj.getClass(), AbstractC7166.m12425("com.tencent.mobileqq.activity.aio.SessionInfo")).get(obj);
                break;
            case 8:
                Object objM12418 = AbstractC7165.m12418(null, "e", methodHookParam.thisObject);
                ((View) AbstractC7165.m12418(null, "l", objM12418)).setOnLongClickListener(new ViewOnLongClickListenerC7235(this, (EditText) AbstractC7165.m12418(null, "e", objM12418), i));
                break;
            case 9:
                Object result = methodHookParam.getResult();
                Field[] declaredFields = result.getClass().getSuperclass().getSuperclass().getDeclaredFields();
                int length = declaredFields.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Field field2 = declaredFields[i2];
                        field2.setAccessible(true);
                        if (field2.getType() == ViewGroup.class) {
                            field = field2;
                        } else {
                            i2++;
                        }
                    }
                }
                ViewGroup viewGroup = (ViewGroup) field.get(result);
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    if (childAt instanceof FrameLayout) {
                        FrameLayout frameLayout = (FrameLayout) childAt;
                        if (frameLayout.getChildCount() == 1 && (frameLayout.getChildAt(0) instanceof ImageView)) {
                            viewGroup.removeView(frameLayout);
                            break;
                        }
                    }
                }
                break;
            case 10:
                Object result2 = methodHookParam.getResult();
                Field[] declaredFields2 = result2.getClass().getSuperclass().getSuperclass().getDeclaredFields();
                int length2 = declaredFields2.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length2) {
                        Field field3 = declaredFields2[i4];
                        field3.setAccessible(true);
                        if (field3.getType() == ViewGroup.class) {
                            field = field3;
                        } else {
                            i4++;
                        }
                    }
                }
                ViewGroup viewGroup2 = (ViewGroup) field.get(result2);
                for (int i5 = 0; i5 < viewGroup2.getChildCount(); i5++) {
                    View childAt2 = viewGroup2.getChildAt(i5);
                    if (childAt2 instanceof FrameLayout) {
                        FrameLayout frameLayout2 = (FrameLayout) childAt2;
                        if (frameLayout2.getChildCount() == 1) {
                            View childAt3 = frameLayout2.getChildAt(0);
                            if (childAt3 instanceof FrameLayout) {
                                FrameLayout frameLayout3 = (FrameLayout) childAt3;
                                if (frameLayout3.getChildCount() == 2 && (frameLayout3.getChildAt(0) instanceof ImageView)) {
                                    viewGroup2.removeView(frameLayout2);
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                break;
        }
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f17873;
        Class cls = Integer.TYPE;
        switch (i) {
            case 0:
                Iterator it = C7210.f17887.iterator();
                while (it.hasNext()) {
                    ((InterfaceC7201) it.next()).hide();
                }
                break;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
            case 3:
                ArrayList arrayList = (ArrayList) methodHookParam.args[2];
                if (arrayList.size() == 1) {
                    Object obj = methodHookParam.args[1];
                    String uinFromUid = (String) AbstractC7165.m12418(String.class, "peerUid", obj);
                    int iIntValue = ((Integer) AbstractC7165.m12418(cls, "chatType", obj)).intValue();
                    if (iIntValue == 1 || iIntValue == 100) {
                        uinFromUid = QQEnvTool.getUinFromUid(uinFromUid);
                    }
                    Object obj2 = arrayList.get(0);
                    if (((Integer) AbstractC7165.m12418(cls, "elementType", obj2)).intValue() == 1) {
                        Object objCallMethod = XposedHelpers.callMethod(obj2, "getTextElement", new Object[0]);
                        String strOnSendMsg = PluginCallback.onSendMsg((String) XposedHelpers.callMethod(objCallMethod, "getContent", new Object[0]), uinFromUid, iIntValue);
                        if (!strOnSendMsg.isEmpty()) {
                            XposedHelpers.callMethod(objCallMethod, "setContent", new Object[]{strOnSendMsg});
                        }
                    }
                }
                break;
            case 7:
                super.beforeHookedMethod(methodHookParam);
                String strValueOf = String.valueOf(methodHookParam.args[0]);
                String strValueOf2 = String.valueOf(methodHookParam.args[1]);
                if (!C7207.f17877.equals(strValueOf2) || !C7207.f17878.equals(strValueOf)) {
                    PluginCallback.onTroopQuit(strValueOf, strValueOf2);
                    C7207.f17879 = Long.valueOf(System.currentTimeMillis());
                    C7207.f17877 = strValueOf2;
                    C7207.f17878 = strValueOf;
                } else if (System.currentTimeMillis() - C7207.f17879.longValue() >= 1000) {
                    PluginCallback.onTroopQuit(strValueOf, strValueOf2);
                    C7207.f17879 = Long.valueOf(System.currentTimeMillis());
                    C7207.f17877 = strValueOf2;
                    C7207.f17878 = strValueOf;
                }
                break;
            case 11:
                for (Object obj3 : (ArrayList) methodHookParam.args[2]) {
                    Object objM12418 = AbstractC7165.m12418(AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.PicElement"), "picElement", obj3);
                    if (objM12418 != null) {
                        boolean zBooleanValue = ((Boolean) AbstractC7165.m12418(Boolean.TYPE, "original", objM12418)).booleanValue();
                        String str = (String) AbstractC7165.m12418(String.class, "sourcePath", objM12418);
                        if (zBooleanValue && str != null) {
                            String strM14532 = "0";
                            String strM145322 = "0";
                            try {
                                ExifInterface exifInterface = new ExifInterface(str);
                                exifInterface.setAttribute("GPSLongitude", strM14532);
                                exifInterface.setAttribute("GPSLatitude", strM145322);
                                exifInterface.setAttribute("Make", strM14532);
                                exifInterface.setAttribute("Model", strM145322);
                                exifInterface.saveAttributes();
                            } catch (IOException e) {
                                AbstractC7017.m12165(e);
                                Log.e("Mine", "cannot save exif", e);
                            }
                        }
                    }
                }
                break;
            case 12:
                "param";
                methodHookParam.getClass();
                Object obj4 = methodHookParam.args[1];
                "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>";
                obj4.getClass();
                ArrayList arrayList2 = (ArrayList) obj4;
                Class<?> cls2 = arrayList2.get(0).getClass();
                Object objM6845 = AbstractC3738.m6845(new Object[]{10100995, "QStory", "打开QStory", 3}, new Class[]{cls, String.class, String.class, cls}, cls2);
                Drawable drawableM8871 = AbstractC4765.m8871(AbstractC7187.f17852, C0328R.mipmap.ic_launcher_round);
                drawableM8871.getClass();
                AbstractC7165.m12422(objM6845, "drawable", Drawable.class, drawableM8871);
                arrayList2.add(0, objM6845);
                break;
            case 13:
                "param";
                methodHookParam.getClass();
                Object obj5 = methodHookParam.args[0];
                "null cannot be cast to non-null type android.view.View";
                obj5.getClass();
                View view = (View) obj5;
                Context context = view.getContext();
                if (view.getId() == 10100995) {
                    context.startActivity(new Intent(context, (Class<?>) SettingActivity.class));
                }
                break;
            case 14:
                "param";
                methodHookParam.getClass();
                Object obj6 = methodHookParam.args[1];
                "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>";
                obj6.getClass();
                ArrayList arrayList3 = (ArrayList) obj6;
                Class<?> cls3 = arrayList3.get(0).getClass();
                Object objM68452 = AbstractC3738.m6845(new Object[]{10100994, "Java脚本", "打开QStoryJava脚本", 3}, new Class[]{cls, String.class, String.class, cls}, cls3);
                Drawable drawableM88712 = AbstractC4765.m8871(AbstractC7187.f17852, C0328R.drawable.plugin_icon);
                drawableM88712.getClass();
                AbstractC7165.m12422(objM68452, "drawable", Drawable.class, drawableM88712);
                arrayList3.add(1, objM68452);
                break;
            case 15:
                "param";
                methodHookParam.getClass();
                Object obj7 = methodHookParam.args[0];
                "null cannot be cast to non-null type android.view.View";
                obj7.getClass();
                View view2 = (View) obj7;
                Context context2 = view2.getContext();
                if (view2.getId() == 10100994) {
                    JavaPluginLoad.showPluginDialog(context2);
                }
                break;
            case 16:
                methodHookParam.setResult((Object) null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7202(int i, int i2) {
        super(i);
        this.f17873 = i2;
    }
}
