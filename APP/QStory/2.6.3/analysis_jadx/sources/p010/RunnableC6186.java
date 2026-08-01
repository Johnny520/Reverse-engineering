package p010;

import android.R;
import android.content.Context;
import android.os.Handler;
import android.provider.Settings;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.compose.material.ripple.RunnableC1107;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3055;
import io.ktor.client.plugins.AbstractC3933;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import lin.xposed.hook.javaplugin.bean.GroupMemberInfo;
import lin.xposed.hook.util.qq.QQEnvTool;
import p036.AbstractC6358;
import p087.C7077;
import p087.C7135;
import p253.AbstractC8190;
import p287.AbstractC8405;
import p316.C8667;
import p345.C8834;
import p346.AbstractC8838;
import p346.C8836;
import p391.C9095;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏楪哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6186 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f17013;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17014;

    public /* synthetic */ RunnableC6186(String str, int i) {
        this.f17014 = i;
        this.f17013 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zCanDrawOverlays;
        int i = this.f17014;
        String str = this.f17013;
        switch (i) {
            case 0:
                Context context = AbstractC6358.f17507;
                try {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                    if (AbstractC3055.m6653() != null) {
                        try {
                            Toast toast = AbstractC6185.f17009;
                            if (toast != null) {
                                toast.cancel();
                            }
                            Context contextM6653 = AbstractC3055.m6653();
                            if (contextM6653 == null) {
                                contextM6653 = context;
                            }
                            Toast toast2 = new Toast(contextM6653);
                            AbstractC6185.f17009 = toast2;
                            toast2.setGravity(48, 0, AbstractC6185.m11593(contextM6653, 80.0f));
                            AbstractC6185.f17009.setDuration(0);
                            AbstractC6185.f17009.setView(AbstractC6185.m11594(contextM6653, str));
                            AbstractC6185.f17009.show();
                            return;
                        } catch (Exception unused2) {
                            Toast.makeText(context, str, 0).show();
                            return;
                        }
                    }
                    try {
                        zCanDrawOverlays = Settings.canDrawOverlays(context);
                    } catch (Exception unused3) {
                        zCanDrawOverlays = false;
                    }
                    if (!zCanDrawOverlays) {
                        Toast.makeText(context, str, 0).show();
                        return;
                    }
                    Handler handler = AbstractC6185.f17012;
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService(AbstractC8405.m13973("喵喵喵喵喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵呜呜喵呜呜"));
                        if (windowManager == null) {
                            Toast.makeText(context, str, 0).show();
                            return;
                        }
                        WeakReference weakReference = AbstractC6185.f17011;
                        if (weakReference != null && weakReference.get() != null) {
                            try {
                                windowManager.removeView((View) AbstractC6185.f17011.get());
                                break;
                            } catch (Exception unused4) {
                            }
                        }
                        RunnableC1107 runnableC1107 = AbstractC6185.f17010;
                        if (runnableC1107 != null) {
                            handler.removeCallbacks(runnableC1107);
                        }
                        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                        layoutParams.type = 2038;
                        layoutParams.flags = 168;
                        layoutParams.format = -3;
                        layoutParams.width = -2;
                        layoutParams.height = -2;
                        layoutParams.gravity = 49;
                        layoutParams.y = AbstractC6185.m11593(context, 80.0f);
                        layoutParams.windowAnimations = R.style.Animation.Toast;
                        LinearLayout linearLayoutM11594 = AbstractC6185.m11594(context, str);
                        windowManager.addView(linearLayoutM11594, layoutParams);
                        AbstractC6185.f17011 = new WeakReference(linearLayoutM11594);
                        RunnableC1107 runnableC11072 = new RunnableC1107(windowManager, 16);
                        AbstractC6185.f17010 = runnableC11072;
                        handler.postDelayed(runnableC11072, 3000L);
                        return;
                    } catch (Exception unused5) {
                        Toast.makeText(context, str, 0).show();
                        return;
                    }
                    break;
                } catch (Exception unused6) {
                    return;
                }
                return;
            case 1:
                try {
                    JSONObject jSONObjectM14376 = C8667.m14376();
                    jSONObjectM14376.put(AbstractC8405.m13973("喵喵呜喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"), QQEnvTool.getCurrentUin());
                    jSONObjectM14376.put(AbstractC8405.m13972(2862), QQEnvTool.getCurrentAccountNickName());
                    Pair pairM13706 = AbstractC8190.m13706();
                    if (pairM13706 != null) {
                        jSONObjectM14376.put(AbstractC8405.m13973("喵喵呜呜呜喵呜喵~喵喵喵喵喵呜喵呜"), pairM13706.first);
                        jSONObjectM14376.put(AbstractC8405.m13972(2863), pairM13706.second);
                    }
                    if (str.length() > 0) {
                        jSONObjectM14376.put(AbstractC8405.m13972(2864), str);
                        jSONObjectM14376.put(AbstractC8405.m13973("喵喵呜呜呜呜呜呜~喵喵喵喵喵喵喵呜"), AbstractC8405.m13972(2865));
                    }
                    C8834.m14488().m14511(jSONObjectM14376).execute();
                    return;
                } catch (Exception e) {
                    AbstractC6188.m11605(AbstractC8405.m13972(2866), e.toString(), e, true);
                    return;
                }
            case 2:
                C8836.m14495(str);
                return;
            case 3:
                ArrayList arrayList = new ArrayList();
                for (GroupMemberInfo groupMemberInfo : C8836.m14495(str)) {
                    if (groupMemberInfo.IsAdmin) {
                        arrayList.add(groupMemberInfo.UserUin);
                    }
                }
                AbstractC8838.m14504(str, arrayList);
                AbstractC8838.m14505(str);
                return;
            default:
                C9095 c9095 = C8836.f24939;
                Set set = C8836.f24938;
                try {
                    try {
                        C8836.f24940.getClass();
                        String strM14499 = C8836.m14499(str);
                        C7135 c7135 = C7135.f19089;
                        Map linkedHashMap = (Map) c9095.m14679(strM14499, AbstractC3933.m8313(new C7077(c7135, c7135, 1)));
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        Iterator it = C8836.m14495(str).iterator();
                        AbstractC8405.m13972(1253);
                        it.getClass();
                        while (it.hasNext()) {
                            Object next = it.next();
                            AbstractC8405.m13972(1254);
                            next.getClass();
                            GroupMemberInfo groupMemberInfo2 = (GroupMemberInfo) next;
                            String str2 = groupMemberInfo2.NickName;
                            String str3 = groupMemberInfo2.UserUin;
                            AbstractC8405.m13973("喵喵呜喵喵呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜");
                            str3.getClass();
                            if (C8836.m14500(str2, str3)) {
                                linkedHashMap.put(groupMemberInfo2.UserUin, groupMemberInfo2.NickName);
                            }
                        }
                        c9095.m14677(linkedHashMap, C8836.m14499(str));
                        String strConcat = C8836.m14499(str).concat(AbstractC8405.m13973("喵喵呜喵呜呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵"));
                        String str4 = new SimpleDateFormat(AbstractC8405.m13972(1168), Locale.getDefault()).format(new Date());
                        AbstractC8405.m13972(2849);
                        str4.getClass();
                        c9095.m14677(str4, strConcat);
                        break;
                    } catch (Exception e2) {
                        String strM13972 = AbstractC8405.m13972(2833);
                        String str5 = AbstractC6188.f17016;
                        AbstractC6188.m11605(strM13972, e2.toString(), e2, true);
                    }
                    set.remove(str);
                    return;
                } catch (Throwable th) {
                    set.remove(str);
                    throw th;
                }
        }
    }
}
