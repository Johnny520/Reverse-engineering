package p038;

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
import com.alibaba.fastjson2.AbstractC2905;
import com.davemorrissey.labs.subscaleview.R;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.client.plugins.AbstractC3933;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import lin.xposed.hook.javaplugin.JavaPluginLoad;
import lin.xposed.hook.javaplugin.PluginCallback;
import lin.xposed.hook.util.qq.QQEnvTool;
import p010.AbstractC6188;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p036.AbstractC6358;
import p039.ViewOnLongClickListenerC6406;
import p287.AbstractC8405;
import top.suzhelan.qstory.ui.activity.SettingActivity;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6373 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17528;

    public /* synthetic */ C6373(int i) {
        this.f17528 = i;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = 2;
        Field field = null;
        switch (this.f17528) {
            case 1:
                Iterator it = C6381.f17542.iterator();
                while (it.hasNext()) {
                    ((InterfaceC6372) it.next()).show();
                }
                break;
            case 2:
                Iterator it2 = C6381.f17542.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC6372) it2.next()).hide();
                }
                break;
            case 3:
            case 7:
            default:
                super.afterHookedMethod(methodHookParam);
                break;
            case 4:
                Object objM11858 = AbstractC6336.m11858(AbstractC6337.m11866(AbstractC8405.m13972(345)), AbstractC6336.m11858(AbstractC6337.m11866(AbstractC8405.m13972(344)), AbstractC6336.m11858(AbstractC6337.m11866(AbstractC8405.m13972(343)), methodHookParam.thisObject)));
                C6379.f17538.push(objM11858);
                C6379.f17537 = objM11858;
                break;
            case 5:
                Stack stack = C6379.f17538;
                if (!stack.empty()) {
                    stack.pop();
                }
                if (!stack.empty()) {
                    C6379.f17537 = stack.peek();
                }
                break;
            case 6:
                Object obj = methodHookParam.thisObject;
                C6379.f17535 = AbstractC6336.m11858(AbstractC6337.m11866(AbstractC8405.m13972(122)), obj);
                C6379.f17536 = AbstractC6336.m11861(obj.getClass(), AbstractC6337.m11866(AbstractC8405.m13972(346))).get(obj);
                break;
            case 8:
                Object objM11859 = AbstractC6336.m11859(null, AbstractC8405.m13973("喵喵喵呜喵呜呜喵"), methodHookParam.thisObject);
                ((View) AbstractC6336.m11859(null, AbstractC8405.m13973("喵喵喵呜呜呜呜呜"), objM11859)).setOnLongClickListener(new ViewOnLongClickListenerC6406(this, (EditText) AbstractC6336.m11859(null, AbstractC8405.m13973("喵喵喵呜喵呜呜喵"), objM11859), i));
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
        int i = this.f17528;
        Class cls = Integer.TYPE;
        switch (i) {
            case 0:
                Iterator it = C6381.f17542.iterator();
                while (it.hasNext()) {
                    ((InterfaceC6372) it.next()).hide();
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
                    String uinFromUid = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), obj);
                    int iIntValue = ((Integer) AbstractC6336.m11859(cls, AbstractC8405.m13972(125), obj)).intValue();
                    if (iIntValue == 1 || iIntValue == 100) {
                        uinFromUid = QQEnvTool.getUinFromUid(uinFromUid);
                    }
                    Object obj2 = arrayList.get(0);
                    if (((Integer) AbstractC6336.m11859(cls, AbstractC8405.m13972(338), obj2)).intValue() == 1) {
                        Object objCallMethod = XposedHelpers.callMethod(obj2, AbstractC8405.m13972(247), new Object[0]);
                        String strOnSendMsg = PluginCallback.onSendMsg((String) XposedHelpers.callMethod(objCallMethod, AbstractC8405.m13972(339), new Object[0]), uinFromUid, iIntValue);
                        if (!strOnSendMsg.isEmpty()) {
                            XposedHelpers.callMethod(objCallMethod, AbstractC8405.m13972(340), new Object[]{strOnSendMsg});
                        }
                    }
                }
                break;
            case 7:
                super.beforeHookedMethod(methodHookParam);
                String strValueOf = String.valueOf(methodHookParam.args[0]);
                String strValueOf2 = String.valueOf(methodHookParam.args[1]);
                if (!C6378.f17532.equals(strValueOf2) || !C6378.f17533.equals(strValueOf)) {
                    PluginCallback.onTroopQuit(strValueOf, strValueOf2);
                    C6378.f17534 = Long.valueOf(System.currentTimeMillis());
                    C6378.f17532 = strValueOf2;
                    C6378.f17533 = strValueOf;
                } else if (System.currentTimeMillis() - C6378.f17534.longValue() >= 1000) {
                    PluginCallback.onTroopQuit(strValueOf, strValueOf2);
                    C6378.f17534 = Long.valueOf(System.currentTimeMillis());
                    C6378.f17532 = strValueOf2;
                    C6378.f17533 = strValueOf;
                }
                break;
            case 11:
                for (Object obj3 : (ArrayList) methodHookParam.args[2]) {
                    Object objM11859 = AbstractC6336.m11859(AbstractC6337.m11866(AbstractC8405.m13972(178)), AbstractC8405.m13972(282), obj3);
                    if (objM11859 != null) {
                        boolean zBooleanValue = ((Boolean) AbstractC6336.m11859(Boolean.TYPE, AbstractC8405.m13972(283), objM11859)).booleanValue();
                        String str = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(284), objM11859);
                        if (zBooleanValue && str != null) {
                            String strM13973 = AbstractC8405.m13973("喵呜喵喵喵喵呜呜");
                            String strM139732 = AbstractC8405.m13973("喵呜喵喵喵喵呜呜");
                            try {
                                ExifInterface exifInterface = new ExifInterface(str);
                                exifInterface.setAttribute(AbstractC8405.m13972(286), strM13973);
                                exifInterface.setAttribute(AbstractC8405.m13972(287), strM139732);
                                exifInterface.setAttribute(AbstractC8405.m13973("喵喵呜呜呜呜呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜"), strM13973);
                                exifInterface.setAttribute(AbstractC8405.m13973("喵喵呜呜呜呜呜喵~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵喵呜"), strM139732);
                                exifInterface.saveAttributes();
                            } catch (IOException e) {
                                AbstractC6188.m11606(e);
                                Log.e(AbstractC8405.m13973("喵喵呜呜呜呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵呜"), AbstractC8405.m13972(288), e);
                            }
                        }
                    }
                }
                break;
            case 12:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object obj4 = methodHookParam.args[1];
                AbstractC8405.m13972(1540);
                obj4.getClass();
                ArrayList arrayList2 = (ArrayList) obj4;
                Class<?> cls2 = arrayList2.get(0).getClass();
                Object objM6285 = AbstractC2905.m6285(new Object[]{10100995, AbstractC8405.m13973("喵喵呜喵喵喵呜喵~喵喵呜喵喵呜呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵呜"), AbstractC8405.m13972(1541), 3}, new Class[]{cls, String.class, String.class, cls}, cls2);
                Drawable drawableM8312 = AbstractC3933.m8312(AbstractC6358.f17507, R.mipmap.ic_launcher_round);
                drawableM8312.getClass();
                AbstractC6336.m11863(objM6285, AbstractC8405.m13972(1542), Drawable.class, drawableM8312);
                arrayList2.add(0, objM6285);
                break;
            case 13:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object obj5 = methodHookParam.args[0];
                AbstractC8405.m13972(1543);
                obj5.getClass();
                View view = (View) obj5;
                Context context = view.getContext();
                if (view.getId() == 10100995) {
                    context.startActivity(new Intent(context, (Class<?>) SettingActivity.class));
                }
                break;
            case 14:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object obj6 = methodHookParam.args[1];
                AbstractC8405.m13972(1540);
                obj6.getClass();
                ArrayList arrayList3 = (ArrayList) obj6;
                Class<?> cls3 = arrayList3.get(0).getClass();
                Object objM62852 = AbstractC2905.m6285(new Object[]{10100994, AbstractC8405.m13972(95), AbstractC8405.m13972(1544), 3}, new Class[]{cls, String.class, String.class, cls}, cls3);
                Drawable drawableM83122 = AbstractC3933.m8312(AbstractC6358.f17507, R.drawable.plugin_icon);
                drawableM83122.getClass();
                AbstractC6336.m11863(objM62852, AbstractC8405.m13972(1542), Drawable.class, drawableM83122);
                arrayList3.add(1, objM62852);
                break;
            case 15:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object obj7 = methodHookParam.args[0];
                AbstractC8405.m13972(1543);
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
    public /* synthetic */ C6373(int i, int i2) {
        super(i);
        this.f17528 = i2;
    }
}
