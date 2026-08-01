package p035;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.compose.p001ui.platform.RunnableC2733;
import bsh.C3466;
import com.alibaba.fastjson2.AbstractC3738;
import com.alibaba.fastjson2.JSONObject;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3887;
import com.davemorrissey.labs.subscaleview.C0328R;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import lin.xposed.hook.util.p011qq.QQMessageUtils;
import p026.C7018;
import p026.InterfaceC7019;
import p042.InterfaceC7141;
import p049.AbstractC7162;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p052.AbstractC7187;
import p052.RunnableC7186;
import p054.C7206;
import p054.C7214;
import p055.CallableC7249;
import p055.ViewOnClickListenerC7232;
import p055.ViewOnLongClickListenerC7245;
import p056.CallableC7270;
import p144.AbstractC8312;
import p144.InterfaceC8311;
import p144.InterfaceC8314;
import p332.C9496;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7092 implements InterfaceC7019, InterfaceC7141, InterfaceC8311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17589;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m12334(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m12335(Object obj, String str, Object obj2) {
        throw new AssertionError(str + obj + obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m12336(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m12337(Object obj, Object obj2) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IOException(sb.toString());
    }

    @Override // p144.InterfaceC8311
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo12338(InterfaceC8314 interfaceC8314, AbstractC8312 abstractC8312) {
        switch (this.f17589) {
            case 25:
                interfaceC8314.mo13262(abstractC8312);
                break;
            case 26:
                interfaceC8314.mo13225(abstractC8312);
                break;
            case 27:
                interfaceC8314.mo13226(abstractC8312);
                break;
            case 28:
                interfaceC8314.mo13227();
                break;
            default:
                interfaceC8314.mo13224();
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a2  */
    @Override // p026.InterfaceC7019
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo9180(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f17589;
        int i2 = 9;
        Class cls = Integer.TYPE;
        Button button = null;
        Object obj = null;
        int i3 = 1;
        int i4 = 0;
        switch (i) {
            case 1:
                while (QQEnvTool.getCurrentUin() == null) {
                    try {
                        Thread.sleep(50L);
                    } catch (InterruptedException unused) {
                    }
                }
                new Thread(new RunnableC2733(i2)).start();
                break;
            case 2:
                while (QQEnvTool.getCurrentUin() == null) {
                    try {
                        Thread.sleep(50L);
                    } catch (InterruptedException unused2) {
                    }
                }
                new Thread(new RunnableC2733(i2)).start();
                break;
            case 3:
            default:
                List list = (List) AbstractC7165.m12417(List.class, methodHookParam.args[0]);
                Object objM12417 = AbstractC7165.m12417(AbstractC7166.m12425("com.tencent.mobileqq.aio.msg.AIOMsgItem"), list.get(0));
                list.add(0, C7206.m12520(objM12417, "输出消息字段", C0328R.mipmap.ic_launcher_round, new CallableC7270(XposedHelpers.callMethod(objM12417, "getMsgRecord", new Object[0]), i4)));
                break;
            case 4:
                Object objM12418 = AbstractC7165.m12418(AbstractC7166.m12425("com.tencent.qphone.base.remote.FromServiceMsg"), "fromServiceMsg", methodHookParam.args[1]);
                if ("OidbSvcTrpcTcp.0x9067_202".equals((String) AbstractC7165.m12418(String.class, "serviceCmd", objM12418))) {
                    C7018 c7018 = new C7018();
                    c7018.m12172(C7018.m12167((byte[]) AbstractC7165.m12418(byte[].class, "wupBuffer", objM12418)));
                    JSONObject jSONObjectM12173 = c7018.m12173();
                    C7214.f17894 = jSONObjectM12173.getJSONObject("4").getJSONObject("4").getJSONArray("1").getJSONObject(0).getString("1");
                    C7214.f17893 = jSONObjectM12173.getJSONObject("4").getJSONObject("4").getJSONArray("1").getJSONObject(1).getString("1");
                }
                break;
            case 5:
                Object obj2 = methodHookParam.args[0];
                String str = (String) AbstractC7165.m12418(String.class, "msg", obj2);
                if (((Integer) AbstractC7165.m12418(cls, "bizType", obj2)).intValue() == 14 && str.contains("@全体成员")) {
                    methodHookParam.setResult((Object) null);
                    break;
                }
                break;
            case 6:
                AbstractC7165.m12424(AbstractC7165.m12423(methodHookParam.thisObject, (AbstractC7187.f17853 >= 6372 ? "dragLayout" : "mDragLayout")), (AbstractC7187.f17853 >= 12670 ? "windowBgDrawable" : "mWindowBgDrawable"), new ColorDrawable(0));
                break;
            case 7:
                methodHookParam.args[0] = 0;
                break;
            case 8:
                if (((Method) methodHookParam.method).getReturnType().equals(Void.TYPE)) {
                    methodHookParam.setResult((Object) null);
                }
                break;
            case 9:
                methodHookParam.setResult(Boolean.FALSE);
                break;
            case 10:
                ((ImageButton) AbstractC7165.m12418(ImageButton.class, "m", methodHookParam.thisObject)).setOnLongClickListener(new ViewOnLongClickListenerC7245());
                break;
            case 11:
                List list2 = (List) AbstractC7165.m12417(List.class, methodHookParam.args[0]);
                Object objM124172 = AbstractC7165.m12417(AbstractC7166.m12425("com.tencent.mobileqq.aio.msg.AIOMsgItem"), list2.get(0));
                Object objCallMethod = XposedHelpers.callMethod(objM124172, "getMsgRecord", new Object[0]);
                ArrayList arrayList = (ArrayList) AbstractC7165.m12418(ArrayList.class, "elements", objCallMethod);
                int iIntValue = ((Integer) AbstractC7165.m12418(cls, "chatType", objCallMethod)).intValue();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList) {
                    C7164 c7164M12413 = C7164.m12413(obj3.getClass());
                    c7164M12413.f17803.f3963 = "getPicElement";
                    c7164M12413.f17803.f3962 = AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.PicElement");
                    Object objM12415 = c7164M12413.m12415(obj3, new Object[0]);
                    if (objM12415 != null) {
                        arrayList3.add(((String) AbstractC7165.m12418(String.class, "md5HexStr", objM12415)).toUpperCase());
                        arrayList2.add(QQMessageUtils.getPicElementUrl(iIntValue, objM12415));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    list2.add(0, C7206.m12520(objM124172, "保存到QS", C0328R.mipmap.ic_launcher_round, new CallableC7249(arrayList2, arrayList3, i4)));
                    break;
                }
                break;
            case 12:
                for (View view : AbstractC3887.m7210(((Activity) AbstractC7162.m12403(methodHookParam.thisObject, "getActivity")).getWindow().getDecorView())) {
                    if (view.getClass() == View.class) {
                        view.setBackground(null);
                        break;
                    }
                }
                break;
            case 13:
                methodHookParam.setResult((Object) null);
                break;
            case 14:
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC7186(methodHookParam, i3), 200L);
                break;
            case 15:
                Object obj4 = methodHookParam.thisObject;
                Activity activity = (Activity) obj4;
                String str2 = null;
                for (Field field : obj4.getClass().getDeclaredFields()) {
                    field.setAccessible(true);
                    if (field.getType() == Button.class) {
                        Button button2 = (Button) field.get(methodHookParam.thisObject);
                        if (button2 != null) {
                            if (button2.getVisibility() != 8 && button2.getText().toString().contains("加为QQ好友")) {
                                button = button2;
                            }
                            if (field.getType() != String.class) {
                            }
                        }
                    } else if (field.getType() != String.class) {
                        String str3 = (String) field.get(methodHookParam.thisObject);
                        if (QQEnvTool.checkQQ(str3)) {
                            str2 = str3;
                        }
                    }
                }
                if (button != null && str2 != null) {
                    button.setText("[原]加为QQ好友");
                    Button button3 = new Button(activity);
                    button3.setText("[QS]跳转主页");
                    button3.setBackground(button.getBackground());
                    button3.setTextSize(0, button.getTextSize());
                    button3.setTextColor(button.getTextColors());
                    button3.setOnClickListener(new ViewOnClickListenerC7232(str2, activity, 0));
                    LinearLayout linearLayout = (LinearLayout) button.getParent();
                    linearLayout.addView(button3, linearLayout.getChildCount() - 2, button.getLayoutParams());
                    break;
                }
                break;
            case 16:
                if (((Boolean) methodHookParam.args[0]).booleanValue()) {
                    methodHookParam.args[0] = Boolean.FALSE;
                }
                break;
            case 17:
                Object result = methodHookParam.getResult();
                Object objNewInstance = Array.newInstance(result.getClass().getComponentType(), Array.getLength(result) + 1);
                System.arraycopy(result, 0, objNewInstance, 1, Array.getLength(result));
                Object objM6846 = AbstractC3738.m6846(result.getClass().getComponentType(), 4192, "保存到QS");
                AbstractC7165.m12424(objM6846, "c", 2147483645);
                Array.set(objNewInstance, 0, objM6846);
                methodHookParam.setResult(objNewInstance);
                break;
            case 18:
                int iIntValue2 = ((Integer) methodHookParam.args[0]).intValue();
                Object[] objArr = methodHookParam.args;
                Context context = (Context) objArr[1];
                Object obj5 = objArr[2];
                if (iIntValue2 == 4192) {
                    C9496.m14943(context, (String) AbstractC7162.m12405(String.class, "getLocalFilePath", obj5));
                }
                break;
            case 19:
                Object obj6 = methodHookParam.args[1];
                XposedHelpers.callMethod(obj6, "a", new Object[0]);
                XposedHelpers.callMethod(obj6, "b", new Object[0]);
                break;
            case 20:
                AbstractC7165.m12422(methodHookParam.thisObject, "k", Boolean.TYPE, Boolean.TRUE);
                break;
            case 21:
                List list3 = (List) AbstractC7165.m12417(List.class, methodHookParam.thisObject);
                Class<?> clsM12425 = AbstractC7166.m12425("com.tencent.mobileqq.troop.troopsetting.part.TroopSettingAppPart");
                Class<?> clsM124252 = AbstractC7166.m12425("com.tencent.mobileqq.troop.troopsetting.part.TroopSettingMemberInfoPart");
                ListIterator listIterator = list3.listIterator();
                int i5 = 0;
                while (true) {
                    if (listIterator.hasNext()) {
                        if (i4 == 0) {
                            i5++;
                        }
                        Object next = listIterator.next();
                        if (next.getClass() == clsM124252) {
                            i4 = 1;
                        }
                        if (next.getClass() == clsM12425) {
                            listIterator.remove();
                            obj = next;
                        }
                    }
                }
                if (obj != null) {
                    list3.add(i5, obj);
                } else {
                    C3466.m5899("troop  app list is null");
                }
                break;
        }
    }

    public /* synthetic */ C7092(int i) {
        this.f17589 = i;
    }
}
