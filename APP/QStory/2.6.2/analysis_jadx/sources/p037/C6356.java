package p037;

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
import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import lin.xposed.hook.javaplugin.JavaPluginLoad;
import lin.xposed.hook.javaplugin.PluginCallback;
import lin.xposed.hook.util.qq.QQEnvTool;
import p000.AbstractC6087;
import p010.AbstractC6157;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p035.AbstractC6340;
import p038.ViewOnLongClickListenerC6380;
import top.suzhelan.qstory.ui.activity.SettingActivity;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6356 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17482;

    public /* synthetic */ C6356(int i) {
        this.f17482 = i;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = 2;
        Field field = null;
        switch (this.f17482) {
            case 1:
                Iterator it = C6364.f17496.iterator();
                while (it.hasNext()) {
                    ((InterfaceC6355) it.next()).show();
                }
                break;
            case 2:
                Iterator it2 = C6364.f17496.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC6355) it2.next()).hide();
                }
                break;
            case 3:
            case 7:
            default:
                super.afterHookedMethod(methodHookParam);
                break;
            case 4:
                Object objM11830 = AbstractC6317.m11830(AbstractC6318.m11838(AbstractC3056.m6668(-3937591446866232743L)), AbstractC6317.m11830(AbstractC6318.m11838(AbstractC3056.m6668(-3937591584305186215L)), AbstractC6317.m11830(AbstractC6318.m11838(AbstractC3056.m6668(-3937591695974335911L)), methodHookParam.thisObject)));
                C6362.f17492.push(objM11830);
                C6362.f17491 = objM11830;
                break;
            case 5:
                Stack stack = C6362.f17492;
                if (!stack.empty()) {
                    stack.pop();
                }
                if (!stack.empty()) {
                    C6362.f17491 = stack.peek();
                }
                break;
            case 6:
                Object obj = methodHookParam.thisObject;
                C6362.f17489 = AbstractC6317.m11830(AbstractC6318.m11838(AbstractC3056.m6668(-3937566175278663079L)), obj);
                C6362.f17490 = AbstractC6317.m11833(obj.getClass(), AbstractC6318.m11838(AbstractC3056.m6668(-3937591309427279271L))).get(obj);
                break;
            case 8:
                Object objM11831 = AbstractC6317.m11831(null, AbstractC3056.m6668(-3937586589258220967L), methodHookParam.thisObject);
                ((View) AbstractC6317.m11831(null, AbstractC3056.m6668(-3937586597848155559L), objM11831)).setOnLongClickListener(new ViewOnLongClickListenerC6380(this, (EditText) AbstractC6317.m11831(null, AbstractC3056.m6668(-3937586589258220967L), objM11831), i));
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
        int i = this.f17482;
        Class cls = Integer.TYPE;
        switch (i) {
            case 0:
                Iterator it = C6364.f17496.iterator();
                while (it.hasNext()) {
                    ((InterfaceC6355) it.next()).hide();
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
                    String uinFromUid = (String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937592177010673063L), obj);
                    int iIntValue = ((Integer) AbstractC6317.m11831(cls, AbstractC3056.m6668(-3937565801616508327L), obj)).intValue();
                    if (iIntValue == 1 || iIntValue == 100) {
                        uinFromUid = QQEnvTool.getUinFromUid(uinFromUid);
                    }
                    Object obj2 = arrayList.get(0);
                    if (((Integer) AbstractC6317.m11831(cls, AbstractC3056.m6668(-3937563452269397415L), obj2)).intValue() == 1) {
                        Object objCallMethod = XposedHelpers.callMethod(obj2, AbstractC3056.m6668(-3937563400729789863L), new Object[0]);
                        String strOnSendMsg = PluginCallback.onSendMsg((String) XposedHelpers.callMethod(objCallMethod, AbstractC3056.m6668(-3937563327715345831L), new Object[0]), uinFromUid, iIntValue);
                        if (!strOnSendMsg.isEmpty()) {
                            XposedHelpers.callMethod(objCallMethod, AbstractC3056.m6668(-3937592073931457959L), new Object[]{strOnSendMsg});
                        }
                    }
                }
                break;
            case 7:
                super.beforeHookedMethod(methodHookParam);
                String strValueOf = String.valueOf(methodHookParam.args[0]);
                String strValueOf2 = String.valueOf(methodHookParam.args[1]);
                if (!C6361.f17486.equals(strValueOf2) || !C6361.f17487.equals(strValueOf)) {
                    PluginCallback.onTroopQuit(strValueOf, strValueOf2);
                    C6361.f17488 = Long.valueOf(System.currentTimeMillis());
                    C6361.f17486 = strValueOf2;
                    C6361.f17487 = strValueOf;
                } else if (System.currentTimeMillis() - C6361.f17488.longValue() >= 1000) {
                    PluginCallback.onTroopQuit(strValueOf, strValueOf2);
                    C6361.f17488 = Long.valueOf(System.currentTimeMillis());
                    C6361.f17486 = strValueOf2;
                    C6361.f17487 = strValueOf;
                }
                break;
            case 11:
                for (Object obj3 : (ArrayList) methodHookParam.args[2]) {
                    Object objM11831 = AbstractC6317.m11831(AbstractC6318.m11838(AbstractC3056.m6668(-3937575778825536935L)), AbstractC3056.m6668(-3937581143239689639L), obj3);
                    if (objM11831 != null) {
                        boolean zBooleanValue = ((Boolean) AbstractC6317.m11831(Boolean.TYPE, AbstractC3056.m6668(-3937581190484329895L), objM11831)).booleanValue();
                        String str = (String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937581126059820455L), objM11831);
                        if (zBooleanValue && str != null) {
                            String strM6668 = AbstractC3056.m6668(-3937561652678100391L);
                            String strM66682 = AbstractC3056.m6668(-3937561652678100391L);
                            try {
                                ExifInterface exifInterface = new ExifInterface(str);
                                exifInterface.setAttribute(AbstractC3056.m6668(-3937580984325899687L), strM6668);
                                exifInterface.setAttribute(AbstractC3056.m6668(-3937580902721521063L), strM66682);
                                exifInterface.setAttribute(AbstractC3056.m6668(-3937580851181913511L), strM6668);
                                exifInterface.setAttribute(AbstractC3056.m6668(-3937580838297011623L), strM66682);
                                exifInterface.saveAttributes();
                            } catch (IOException e) {
                                AbstractC6157.m11575(e);
                                Log.e(AbstractC3056.m6668(-3937580760987600295L), AbstractC3056.m6668(-3937580782462436775L), e);
                            }
                        }
                    }
                }
                break;
            case 12:
                methodHookParam.setResult((Object) null);
                break;
            case 13:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                Object obj4 = methodHookParam.args[1];
                AbstractC3056.m6668(-3937715979442980263L);
                obj4.getClass();
                ArrayList arrayList2 = (ArrayList) obj4;
                Class<?> cls2 = arrayList2.get(0).getClass();
                Object objM11389 = AbstractC6087.m11389(new Object[]{10100995, AbstractC3056.m6668(-3937577501107422631L), AbstractC3056.m6668(-3937715760399648167L), 3}, new Class[]{cls, String.class, String.class, cls}, cls2);
                Drawable drawableM6607 = AbstractC3054.m6607(AbstractC6340.f17460, R.mipmap.ic_launcher_round);
                drawableM6607.getClass();
                AbstractC6317.m11835(objM11389, AbstractC3056.m6668(-3937715627255661991L), Drawable.class, drawableM6607);
                arrayList2.add(0, objM11389);
                break;
            case 14:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                Object obj5 = methodHookParam.args[0];
                AbstractC3056.m6668(-3937715665910367655L);
                obj5.getClass();
                View view = (View) obj5;
                Context context = view.getContext();
                if (view.getId() == 10100995) {
                    context.startActivity(new Intent(context, (Class<?>) SettingActivity.class));
                }
                break;
            case 15:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                Object obj6 = methodHookParam.args[1];
                AbstractC3056.m6668(-3937715979442980263L);
                obj6.getClass();
                ArrayList arrayList3 = (ArrayList) obj6;
                Class<?> cls3 = arrayList3.get(0).getClass();
                Object objM113892 = AbstractC6087.m11389(new Object[]{10100994, AbstractC3056.m6668(-3937569452338709927L), AbstractC3056.m6668(-3937715352377755047L), 3}, new Class[]{cls, String.class, String.class, cls}, cls3);
                Drawable drawableM66072 = AbstractC3054.m6607(AbstractC6340.f17460, R.drawable.plugin_icon);
                drawableM66072.getClass();
                AbstractC6317.m11835(objM113892, AbstractC3056.m6668(-3937715627255661991L), Drawable.class, drawableM66072);
                arrayList3.add(1, objM113892);
                break;
            case 16:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                Object obj7 = methodHookParam.args[0];
                AbstractC3056.m6668(-3937715665910367655L);
                obj7.getClass();
                View view2 = (View) obj7;
                Context context2 = view2.getContext();
                if (view2.getId() == 10100994) {
                    JavaPluginLoad.showPluginDialog(context2);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6356(int i, int i2) {
        super(i);
        this.f17482 = i2;
    }
}
