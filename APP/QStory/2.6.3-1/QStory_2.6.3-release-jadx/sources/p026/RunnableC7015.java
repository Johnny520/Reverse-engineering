package p026;

import android.R;
import android.content.Context;
import android.os.Handler;
import android.provider.Settings;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.compose.material.ripple.RunnableC1945;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3887;
import io.ktor.client.plugins.AbstractC4765;
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
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p052.AbstractC7187;
import p103.C7906;
import p103.C7964;
import p269.AbstractC9019;
import p303.AbstractC9234;
import p332.C9496;
import p361.C9663;
import p362.AbstractC9667;
import p362.C9665;
import p407.C9924;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏楪哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC7015 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f17358;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17359;

    public /* synthetic */ RunnableC7015(String str, int i) {
        this.f17359 = i;
        this.f17358 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zCanDrawOverlays;
        int i = this.f17359;
        String str = this.f17358;
        switch (i) {
            case 0:
                Context context = AbstractC7187.f17852;
                try {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                    if (AbstractC3887.m7213() != null) {
                        try {
                            Toast toast = AbstractC7014.f17354;
                            if (toast != null) {
                                toast.cancel();
                            }
                            Context contextM7213 = AbstractC3887.m7213();
                            if (contextM7213 == null) {
                                contextM7213 = context;
                            }
                            Toast toast2 = new Toast(contextM7213);
                            AbstractC7014.f17354 = toast2;
                            toast2.setGravity(48, 0, AbstractC7014.m12152(contextM7213, 80.0f));
                            AbstractC7014.f17354.setDuration(0);
                            AbstractC7014.f17354.setView(AbstractC7014.m12153(contextM7213, str));
                            AbstractC7014.f17354.show();
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
                    Handler handler = AbstractC7014.f17357;
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService(AbstractC9234.m14532("喵喵喵喵喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵呜呜喵呜呜"));
                        if (windowManager == null) {
                            Toast.makeText(context, str, 0).show();
                            return;
                        }
                        WeakReference weakReference = AbstractC7014.f17356;
                        if (weakReference != null && weakReference.get() != null) {
                            try {
                                windowManager.removeView((View) AbstractC7014.f17356.get());
                                break;
                            } catch (Exception unused4) {
                            }
                        }
                        RunnableC1945 runnableC1945 = AbstractC7014.f17355;
                        if (runnableC1945 != null) {
                            handler.removeCallbacks(runnableC1945);
                        }
                        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                        layoutParams.type = 2038;
                        layoutParams.flags = 168;
                        layoutParams.format = -3;
                        layoutParams.width = -2;
                        layoutParams.height = -2;
                        layoutParams.gravity = 49;
                        layoutParams.y = AbstractC7014.m12152(context, 80.0f);
                        layoutParams.windowAnimations = R.style.Animation.Toast;
                        LinearLayout linearLayoutM12153 = AbstractC7014.m12153(context, str);
                        windowManager.addView(linearLayoutM12153, layoutParams);
                        AbstractC7014.f17356 = new WeakReference(linearLayoutM12153);
                        RunnableC1945 runnableC19452 = new RunnableC1945(windowManager, 16);
                        AbstractC7014.f17355 = runnableC19452;
                        handler.postDelayed(runnableC19452, 3000L);
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
                    JSONObject jSONObjectM14935 = C9496.m14935();
                    jSONObjectM14935.put(AbstractC9234.m14532("喵喵呜喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"), QQEnvTool.getCurrentUin());
                    jSONObjectM14935.put(AbstractC9234.m14531(2862), QQEnvTool.getCurrentAccountNickName());
                    Pair pairM14265 = AbstractC9019.m14265();
                    if (pairM14265 != null) {
                        jSONObjectM14935.put(AbstractC9234.m14532("喵喵呜呜呜喵呜喵~喵喵喵喵喵呜喵呜"), pairM14265.first);
                        jSONObjectM14935.put(AbstractC9234.m14531(2863), pairM14265.second);
                    }
                    if (str.length() > 0) {
                        jSONObjectM14935.put(AbstractC9234.m14531(2864), str);
                        jSONObjectM14935.put(AbstractC9234.m14532("喵喵呜呜呜呜呜呜~喵喵喵喵喵喵喵呜"), AbstractC9234.m14531(2865));
                    }
                    C9663.m15047().m15070(jSONObjectM14935).execute();
                    return;
                } catch (Exception e) {
                    AbstractC7017.m12164(AbstractC9234.m14531(2866), e.toString(), e, true);
                    return;
                }
            case 2:
                C9665.m15054(str);
                return;
            case 3:
                ArrayList arrayList = new ArrayList();
                for (GroupMemberInfo groupMemberInfo : C9665.m15054(str)) {
                    if (groupMemberInfo.IsAdmin) {
                        arrayList.add(groupMemberInfo.UserUin);
                    }
                }
                AbstractC9667.m15063(str, arrayList);
                AbstractC9667.m15064(str);
                return;
            default:
                C9924 c9924 = C9665.f25284;
                Set set = C9665.f25283;
                try {
                    try {
                        C9665.f25285.getClass();
                        String strM15058 = C9665.m15058(str);
                        C7964 c7964 = C7964.f19434;
                        Map linkedHashMap = (Map) c9924.m15238(strM15058, AbstractC4765.m8872(new C7906(c7964, c7964, 1)));
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        Iterator it = C9665.m15054(str).iterator();
                        AbstractC9234.m14531(1253);
                        it.getClass();
                        while (it.hasNext()) {
                            Object next = it.next();
                            AbstractC9234.m14531(1254);
                            next.getClass();
                            GroupMemberInfo groupMemberInfo2 = (GroupMemberInfo) next;
                            String str2 = groupMemberInfo2.NickName;
                            String str3 = groupMemberInfo2.UserUin;
                            AbstractC9234.m14532("喵喵呜喵喵呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜");
                            str3.getClass();
                            if (C9665.m15059(str2, str3)) {
                                linkedHashMap.put(groupMemberInfo2.UserUin, groupMemberInfo2.NickName);
                            }
                        }
                        c9924.m15236(linkedHashMap, C9665.m15058(str));
                        String strConcat = C9665.m15058(str).concat(AbstractC9234.m14532("喵喵呜喵呜呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵"));
                        String str4 = new SimpleDateFormat(AbstractC9234.m14531(1168), Locale.getDefault()).format(new Date());
                        AbstractC9234.m14531(2849);
                        str4.getClass();
                        c9924.m15236(str4, strConcat);
                        break;
                    } catch (Exception e2) {
                        String strM14531 = AbstractC9234.m14531(2833);
                        String str5 = AbstractC7017.f17361;
                        AbstractC7017.m12164(strM14531, e2.toString(), e2, true);
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
