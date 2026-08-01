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
import com.bumptech.glide.AbstractC3056;
import io.ktor.client.plugins.AbstractC3932;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.AbstractC5061;
import lin.xposed.hook.javaplugin.bean.GroupMemberInfo;
import lin.xposed.hook.util.qq.QQEnvTool;
import p035.AbstractC6340;
import p087.C7076;
import p087.C7134;
import p175.AbstractC7738;
import p316.C8675;
import p346.AbstractC8851;
import p346.C8849;
import p349.C8865;
import p391.C9114;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6155 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f16776;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16777;

    public /* synthetic */ RunnableC6155(String str, int i) {
        this.f16777 = i;
        this.f16776 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zCanDrawOverlays;
        int i = this.f16777;
        String str = this.f16776;
        switch (i) {
            case 0:
                Context context = AbstractC6340.f17460;
                try {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                    if (AbstractC7738.m13031() != null) {
                        try {
                            Toast toast = AbstractC6154.f16772;
                            if (toast != null) {
                                toast.cancel();
                            }
                            Context contextM13031 = AbstractC7738.m13031();
                            if (contextM13031 == null) {
                                contextM13031 = context;
                            }
                            Toast toast2 = new Toast(contextM13031);
                            AbstractC6154.f16772 = toast2;
                            toast2.setGravity(48, 0, AbstractC6154.m11562(contextM13031, 80.0f));
                            AbstractC6154.f16772.setDuration(0);
                            AbstractC6154.f16772.setView(AbstractC6154.m11563(contextM13031, str));
                            AbstractC6154.f16772.show();
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
                    Handler handler = AbstractC6154.f16775;
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            Toast.makeText(context, str, 0).show();
                            return;
                        }
                        WeakReference weakReference = AbstractC6154.f16774;
                        if (weakReference != null && weakReference.get() != null) {
                            try {
                                windowManager.removeView((View) AbstractC6154.f16774.get());
                                break;
                            } catch (Exception unused4) {
                            }
                        }
                        RunnableC1107 runnableC1107 = AbstractC6154.f16773;
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
                        layoutParams.y = AbstractC6154.m11562(context, 80.0f);
                        layoutParams.windowAnimations = R.style.Animation.Toast;
                        LinearLayout linearLayoutM11563 = AbstractC6154.m11563(context, str);
                        windowManager.addView(linearLayoutM11563, layoutParams);
                        AbstractC6154.f16774 = new WeakReference(linearLayoutM11563);
                        RunnableC1107 runnableC11072 = new RunnableC1107(windowManager, 16);
                        AbstractC6154.f16773 = runnableC11072;
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
                C8849.m14480(str);
                return;
            case 2:
                ArrayList arrayList = new ArrayList();
                for (GroupMemberInfo groupMemberInfo : C8849.m14480(str)) {
                    if (groupMemberInfo.IsAdmin) {
                        arrayList.add(groupMemberInfo.UserUin);
                    }
                }
                AbstractC8851.m14489(str, arrayList);
                AbstractC8851.m14490(str);
                return;
            case 3:
                C9114 c9114 = C8849.f24954;
                Set set = C8849.f24953;
                try {
                    try {
                        C8849.f24955.getClass();
                        String strM14484 = C8849.m14484(str);
                        C7134 c7134 = C7134.f19094;
                        Map linkedHashMap = (Map) c9114.m14642(strM14484, C8675.m14355(new C7076(c7134, c7134, 1)));
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        Iterator it = C8849.m14480(str).iterator();
                        "iterator(...)";
                        it.getClass();
                        while (it.hasNext()) {
                            Object next = it.next();
                            "next(...)";
                            next.getClass();
                            GroupMemberInfo groupMemberInfo2 = (GroupMemberInfo) next;
                            String str2 = groupMemberInfo2.NickName;
                            String str3 = groupMemberInfo2.UserUin;
                            "UserUin";
                            str3.getClass();
                            if (C8849.m14485(str2, str3)) {
                                linkedHashMap.put(groupMemberInfo2.UserUin, groupMemberInfo2.NickName);
                            }
                        }
                        c9114.m14640(linkedHashMap, C8849.m14484(str));
                        String strConcat = C8849.m14484(str).concat("_time");
                        String str4 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
                        "getTodayDate(...)";
                        str4.getClass();
                        c9114.m14640(str4, strConcat);
                        break;
                    } catch (Exception e) {
                        String strM6668 = "TroopMemberUtils";
                        String str5 = AbstractC6157.f16779;
                        AbstractC6157.m11574(strM6668, e.toString(), e, true);
                        break;
                    }
                    set.remove(str);
                    return;
                } catch (Throwable th) {
                    set.remove(str);
                    throw th;
                }
            default:
                try {
                    JSONObject jSONObjectM10039 = AbstractC5061.m10039();
                    jSONObjectM10039.put("Uin", QQEnvTool.getCurrentUin());
                    jSONObjectM10039.put("Nickname", QQEnvTool.getCurrentAccountNickName());
                    Pair pairM8323 = AbstractC3932.m8323();
                    if (pairM8323 != null) {
                        jSONObjectM10039.put("Ip", pairM8323.first);
                        jSONObjectM10039.put("ClientCity", pairM8323.second);
                    }
                    if (str.length() > 0) {
                        jSONObjectM10039.put("Location", str);
                        jSONObjectM10039.put("Lt", "regularly");
                    }
                    C8865.m14507().m14496(jSONObjectM10039).execute();
                    return;
                } catch (Exception e2) {
                    AbstractC6157.m11574("commitInfo", e2.toString(), e2, true);
                    return;
                }
        }
    }
}
