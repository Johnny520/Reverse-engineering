package p352;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.bumptech.glide.AbstractC3887;
import com.davemorrissey.labs.subscaleview.C0328R;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import lin.xposed.hook.javaplugin.bean.GroupMemberInfo;
import lin.xposed.hook.javaplugin.util.PluginSendMsgTool;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC6375;
import lin.xposed.hook.util.p011qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.p011qq.QQSessionUtils;
import p042.InterfaceC7141;
import p044.DialogC7148;
import p049.AbstractC7165;
import p303.AbstractC9234;
import p362.C9665;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9623 implements InterfaceC7141 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9622 f25105;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25106;

    public /* synthetic */ C9623(C9622 c9622, int i) {
        this.f25106 = i;
        this.f25105 = c9622;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    @Override // p042.InterfaceC7141
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        int i = this.f25106;
        C9622 c9622 = this.f25105;
        int i2 = 1;
        switch (i) {
            case 0:
                Object obj = methodHookParam.thisObject;
                c9622.f25104 = (EditText) AbstractC7165.m12417(EditText.class, obj);
                View view = (View) AbstractC7165.m12420(obj.getClass(), Button.class).get(obj);
                Method declaredMethod = View.class.getDeclaredMethod(AbstractC9234.m14531(538), null);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(view, null);
                Field declaredField = objInvoke.getClass().getDeclaredField(AbstractC9234.m14531(539));
                declaredField.setAccessible(true);
                View.OnClickListener onClickListener = (View.OnClickListener) declaredField.get(objInvoke);
                if (onClickListener != null) {
                    c9622.m12390(onClickListener.getClass().getMethod(AbstractC9234.m14532("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵呜呜呜喵喵呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜呜呜呜~喵喵喵喵呜喵呜喵"), View.class), new C9623(c9622, i2));
                }
                break;
            default:
                if (c9622.f25104.getText().toString().equals(AbstractC9234.m14531(128))) {
                    Iterator it = C9665.m15054(PluginSendMsgTool.getCurrentGroupUin()).iterator();
                    while (it.hasNext()) {
                        String str = ((GroupMemberInfo) it.next()).UserUin;
                        if (str.equals(AbstractC9234.m14531(1130)) || str.equals(AbstractC9234.m14531(509))) {
                            i2 = 0;
                            c9622.f25104.setText("");
                            if (i2 == 0) {
                                Activity activityM7213 = AbstractC3887.m7213();
                                DialogC7148 dialogC7148 = new DialogC7148(activityM7213);
                                View viewInflate = LayoutInflater.from(activityM7213).inflate(C0328R.layout.at_troop_all_user, (ViewGroup) null, false);
                                ((Button) viewInflate.findViewById(C0328R.id.send_at_all_message)).setOnClickListener(new ViewOnClickListenerC6375(c9622, (EditText) viewInflate.findViewById(C0328R.id.at_summary), (EditText) viewInflate.findViewById(C0328R.id.at_message), dialogC7148));
                                dialogC7148.setContentView(viewInflate);
                                dialogC7148.show();
                            } else {
                                QQNTSendMsgUtils.sendText(QQSessionUtils.getCurrentContact(), AbstractC9234.m14531(1131));
                            }
                            methodHookParam.setResult((Object) null);
                            break;
                        }
                    }
                    c9622.f25104.setText("");
                    if (i2 == 0) {
                    }
                    methodHookParam.setResult((Object) null);
                }
                break;
        }
    }
}
