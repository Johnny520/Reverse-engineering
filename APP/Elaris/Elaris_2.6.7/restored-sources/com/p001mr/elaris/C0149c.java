package com.p001mr.elaris;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.ImageView;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import p000.AbstractC0451s6;
import p000.C0024b7;
import p000.C0419q6;
import p000.RunnableC0353o;

/* JADX INFO: renamed from: com.mr.elaris.c */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0149c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:403:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m199a(View view) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Activity activity;
        boolean zDefaultBoolean;
        C0024b7 c0024b7M914D;
        String strTrim;
        Object tag;
        Object tag2;
        Object parent;
        String str;
        Object tag3;
        Object tag4;
        Object tag5;
        Context context;
        boolean z = false;
        if (view == null) {
            return false;
        }
        try {
        } catch (Throwable unused) {
        }
        for (context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            }
            activity = HookEntry.topActivity();
        }
        activity = HookEntry.topActivity();
        if (activity == null) {
            return false;
        }
        String lowerCase = activity.getClass().getName().toLowerCase(Locale.US);
        if (lowerCase.contains("elaris") || lowerCase.contains("setting") || lowerCase.contains("mini") || lowerCase.contains("activity.home") || lowerCase.contains("mainactivity")) {
            return false;
        }
        if (!lowerCase.contains("aio") && !lowerCase.contains("chat") && !lowerCase.contains("splashactivity") && !lowerCase.contains("conversation")) {
            return false;
        }
        Context applicationContext = activity.getApplicationContext();
        if (!AbstractC0451s6.f855j) {
            try {
                zDefaultBoolean = HookEntry.runtimeBool(Prefs.KEY_GROUP_ADMIN_AVATAR_MENU);
            } catch (Throwable unused2) {
                if (applicationContext != null) {
                    try {
                        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(Prefs.PREFS_NAME, 0);
                        zDefaultBoolean = !sharedPreferences.contains(Prefs.KEY_GROUP_ADMIN_AVATAR_MENU) ? Prefs.defaultBoolean(Prefs.KEY_GROUP_ADMIN_AVATAR_MENU) : Prefs.readBoolean(sharedPreferences, Prefs.KEY_GROUP_ADMIN_AVATAR_MENU, Prefs.defaultBoolean(Prefs.KEY_GROUP_ADMIN_AVATAR_MENU));
                    } catch (Throwable unused3) {
                        zDefaultBoolean = false;
                    }
                } else {
                    zDefaultBoolean = false;
                }
                if (AbstractC0451s6.f854i) {
                }
            }
            AbstractC0451s6.m915D0(zDefaultBoolean);
        }
        if (AbstractC0451s6.f854i) {
            return false;
        }
        String strM967m0 = AbstractC0451s6.m967m0(view.getContentDescription());
        Locale locale = Locale.US;
        String lowerCase2 = strM967m0.toLowerCase(locale);
        if (!lowerCase2.contains("账户") && !lowerCase2.contains("设置") && !lowerCase2.contains("account")) {
            String lowerCase3 = AbstractC0451s6.m939X(view).toLowerCase(locale);
            if (!lowerCase3.contains("activity.home.view.titleareaheadlayout") && !lowerCase3.contains("activity.recent") && !lowerCase3.contains("drawerframe") && !lowerCase3.contains("tabframelayout")) {
                String lowerCase4 = activity.getClass().getName().toLowerCase(locale);
                if (!lowerCase4.contains("activity.home") && !lowerCase4.contains("mainactivity")) {
                    String lowerCase5 = (view.getClass().getName() + " " + AbstractC0451s6.m967m0(view.getTag()) + " " + AbstractC0451s6.m967m0(view.getContentDescription())).toLowerCase(locale);
                    if (!lowerCase5.contains("avatar") && !lowerCase5.contains("face") && !lowerCase5.contains("head")) {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        int iAbs = Math.abs(width - height);
                        if (!(view instanceof ImageView) || width < 24 || height < 24 || width > 128 || height > 128 || iAbs > Math.max(8, Math.min(width, height) / 5)) {
                            String lowerCase6 = AbstractC0451s6.m939X(view).toLowerCase(locale);
                            if (!lowerCase6.contains("avatar") && !lowerCase6.contains("face") && !lowerCase6.contains("head")) {
                                return false;
                            }
                        }
                    }
                    try {
                        HookEntry.log("group avatar long click probe className=" + view.getClass().getName() + " tag=" + AbstractC0451s6.m967m0(view.getTag()) + " contentDescription=" + AbstractC0451s6.m967m0(view.getContentDescription()) + " activity=" + activity.getClass().getName() + " parentChain=" + AbstractC0451s6.m939X(view));
                    } catch (Throwable unused4) {
                    }
                    String str2 = "";
                    View view2 = view;
                    int i = 0;
                    while (view2 != null) {
                        int i2 = i + 1;
                        if (i >= 8) {
                            break;
                        }
                        c0024b7M914D = AbstractC0451s6.m914D(view2);
                        if (c0024b7M914D != null) {
                            break;
                        }
                        try {
                            tag5 = view2.getTag();
                        } catch (Throwable unused5) {
                            tag5 = null;
                        }
                        c0024b7M914D = AbstractC0451s6.m914D(tag5);
                        if (c0024b7M914D != null) {
                            break;
                        }
                        try {
                            Object parent2 = view2.getParent();
                            view2 = parent2 instanceof View ? (View) parent2 : null;
                            i = i2;
                        } catch (Throwable unused6) {
                        }
                    }
                    c0024b7M914D = null;
                    String strM916E = AbstractC0451s6.m916E(c0024b7M914D);
                    boolean zM926K = AbstractC0451s6.m926K(c0024b7M914D);
                    if (strM916E.length() == 0) {
                        Object parent3 = view;
                        int i3 = 0;
                        while (parent3 instanceof View) {
                            int i4 = i3 + 1;
                            if (i3 >= 8) {
                                break;
                            }
                            String strM918F = AbstractC0451s6.m918F(parent3);
                            if (strM918F.length() < 5) {
                                try {
                                    tag4 = ((View) parent3).getTag();
                                } catch (Throwable unused7) {
                                    tag4 = null;
                                }
                                strM918F = AbstractC0451s6.m918F(tag4);
                                if (strM918F.length() < 5) {
                                    try {
                                        parent3 = ((View) parent3).getParent();
                                        i3 = i4;
                                    } catch (Throwable unused8) {
                                    }
                                }
                            }
                            strM916E = strM918F;
                            break;
                        }
                        strM916E = "";
                    }
                    CharSequence contentDescription = view.getContentDescription();
                    if (contentDescription == null) {
                        strTrim = "";
                    } else {
                        String strTrim2 = String.valueOf(contentDescription).trim();
                        if (strTrim2.length() != 0 && !strTrim2.contains("msgId") && !strTrim2.contains("peerId") && !strTrim2.contains("chatType") && AbstractC0451s6.m941Z(strTrim2)) {
                            strTrim = strTrim2.trim();
                        }
                    }
                    if (strTrim.length() < 5) {
                        try {
                            tag3 = view.getTag();
                        } catch (Throwable unused9) {
                            tag3 = null;
                        }
                        strTrim = AbstractC0451s6.m987w0(tag3, 0, AbstractC0451s6.m937V());
                        if (strTrim.length() < 5) {
                            strTrim = AbstractC0451s6.m987w0(view, 0, AbstractC0451s6.m937V());
                            if (strTrim.length() < 5) {
                                Object parent4 = view.getParent();
                                int i5 = 0;
                                while (parent4 != null) {
                                    int i6 = i5 + 1;
                                    if (i5 >= 4) {
                                        break;
                                    }
                                    String strM987w0 = AbstractC0451s6.m987w0(parent4, 0, AbstractC0451s6.m937V());
                                    if (strM987w0.length() < 5) {
                                        if (!(parent4 instanceof View)) {
                                            break;
                                        }
                                        try {
                                            strM987w0 = AbstractC0451s6.m987w0(((View) parent4).getTag(), 0, AbstractC0451s6.m937V());
                                            if (strM987w0.length() < 5) {
                                                parent4 = ((View) parent4).getParent();
                                                i5 = i6;
                                            }
                                        } catch (Throwable unused10) {
                                            strTrim = "";
                                        }
                                    }
                                    strTrim = strM987w0;
                                    break;
                                }
                                strTrim = "";
                            }
                        }
                    }
                    try {
                        tag = view.getTag();
                    } catch (Throwable unused11) {
                        tag = null;
                    }
                    String strM912C = AbstractC0451s6.m912C(tag, "nick", "nickname", "senderName", "name", "remark");
                    if (strM912C.length() == 0) {
                        strM912C = strTrim;
                    }
                    String strM932Q = AbstractC0451s6.m932Q(view);
                    if (strM932Q.length() == 0) {
                        try {
                            strM932Q = AbstractC0451s6.m932Q(view.getTag());
                        } catch (Throwable unused12) {
                        }
                    }
                    if (strTrim.length() == 0 || strM912C.length() == 0 || strM916E.length() == 0) {
                        Object objCachedMsgRecordById = MessageRepeater.cachedMsgRecordById(strM932Q);
                        if (objCachedMsgRecordById == null) {
                            try {
                                tag2 = view.getTag();
                            } catch (Throwable unused13) {
                                tag2 = null;
                            }
                            objCachedMsgRecordById = MessageRepeater.cachedMsgRecordFromAny(tag2);
                            if (objCachedMsgRecordById == null && (objCachedMsgRecordById = MessageRepeater.cachedMsgRecordFromAny(view)) == null) {
                                try {
                                    parent = view.getParent();
                                } catch (Throwable unused14) {
                                    parent = null;
                                }
                                int i7 = 0;
                                while (parent != null) {
                                    int i8 = i7 + 1;
                                    if (i7 < 5) {
                                        Object objCachedMsgRecordFromAny = MessageRepeater.cachedMsgRecordFromAny(parent);
                                        if (objCachedMsgRecordFromAny == null) {
                                            if (!(parent instanceof View)) {
                                                break;
                                            }
                                            try {
                                                objCachedMsgRecordFromAny = MessageRepeater.cachedMsgRecordFromAny(((View) parent).getTag());
                                                if (objCachedMsgRecordFromAny == null) {
                                                    parent = ((View) parent).getParent();
                                                    i7 = i8;
                                                }
                                            } catch (Throwable unused15) {
                                                objCachedMsgRecordById = null;
                                            }
                                        }
                                        objCachedMsgRecordById = objCachedMsgRecordFromAny;
                                        break;
                                    }
                                    break;
                                }
                                objCachedMsgRecordById = null;
                            }
                        }
                        if (objCachedMsgRecordById != null) {
                            String strM987w02 = AbstractC0451s6.m987w0(objCachedMsgRecordById, 0, AbstractC0451s6.m937V());
                            if (strTrim.length() == 0 && strM987w02.length() >= 5) {
                                strTrim = strM987w02;
                            }
                            if (strM912C.length() == 0) {
                                String strM912C2 = AbstractC0451s6.m912C(objCachedMsgRecordById, "sendNickName", "sendMemberName", "senderName", "senderNick", "nick", "nickname", "memberName", "remark");
                                strM912C = strM912C2.length() == 0 ? strTrim : strM912C2;
                            }
                            if (strM916E.length() == 0) {
                                C0024b7 c0024b7M914D2 = AbstractC0451s6.m914D(objCachedMsgRecordById);
                                zM926K = AbstractC0451s6.m926K(c0024b7M914D2);
                                strM916E = AbstractC0451s6.m916E(c0024b7M914D2);
                            } else if (!zM926K) {
                                zM926K = AbstractC0451s6.m926K(AbstractC0451s6.m914D(objCachedMsgRecordById));
                            }
                            String strM932Q2 = AbstractC0451s6.m932Q(objCachedMsgRecordById);
                            if (strM932Q.length() == 0) {
                                strM932Q = strM932Q2;
                            }
                            HookEntry.log("group avatar msg cache hit msgId=" + strM932Q + " targetUin=" + strTrim);
                        } else if (strM932Q.length() > 0) {
                            HookEntry.log("group avatar msg cache miss msgId=".concat(strM932Q));
                        }
                    }
                    String str3 = strM916E;
                    String str4 = strM932Q;
                    if (!zM926K) {
                        C0024b7 c0024b7M914D3 = AbstractC0451s6.m914D(activity);
                        if (c0024b7M914D3 == null && (c0024b7M914D3 = AbstractC0451s6.m969n0(activity, 0, AbstractC0451s6.m937V())) == null) {
                            String strM988x = AbstractC0451s6.m988x(activity.findViewById(R.id.content), 0, new HashSet());
                            c0024b7M914D3 = strM988x.length() == 0 ? null : new C0024b7(strM988x, 2);
                        }
                        zM926K = AbstractC0451s6.m926K(c0024b7M914D3);
                    }
                    boolean z2 = zM926K;
                    String strM959i0 = AbstractC0451s6.m959i0(activity, strTrim);
                    if (strM959i0.length() > 0 && !strM959i0.startsWith("u_")) {
                        if (strTrim.startsWith("u_")) {
                            strTrim = strM959i0;
                        }
                        if (!AbstractC0451s6.m927L(strM912C, strTrim)) {
                            str2 = strM959i0;
                            str = strTrim;
                        }
                        str = strTrim;
                        str2 = strM912C;
                    } else if (strM912C.startsWith("u_")) {
                        str = strTrim;
                    } else {
                        str = strTrim;
                        str2 = strM912C;
                    }
                    C0419q6 c0419q6 = new C0419q6(str3, str, str2.length() == 0 ? str : str2, str4, z2);
                    String strM974q = AbstractC0451s6.m974q(activity);
                    HookEntry.log("group avatar long click triggered");
                    HookEntry.log("group avatar target found groupUin=" + c0419q6.f739a + " targetUin=" + c0419q6.f740b + " nick=" + c0419q6.f741c + " currentUin=" + strM974q);
                    if (c0419q6.f739a.length() == 0 || c0419q6.f740b.length() == 0 || strM974q.length() == 0) {
                        StringBuilder sb = new StringBuilder("group avatar target missing ");
                        sb.append(c0419q6.f739a.length() == 0 ? "groupUin " : "");
                        sb.append(c0419q6.f740b.length() == 0 ? "targetUin " : "");
                        sb.append(strM974q.length() == 0 ? "currentUin" : "");
                        HookEntry.log(sb.toString());
                    }
                    if (c0419q6.f739a.length() == 0 || c0419q6.f740b.length() == 0) {
                        HookEntry.log("group avatar long click ignored reason=missing-chat-target");
                        return false;
                    }
                    if (AbstractC0451s6.m931P(c0419q6.f739a)) {
                        HookEntry.log("group avatar long click ignored reason=group-id-is-user-uid groupUin=" + c0419q6.f739a);
                        return false;
                    }
                    if (!c0419q6.f743e) {
                        HookEntry.log("group avatar long click ignored reason=not-confirmed-group-aio");
                        return false;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Map map = AbstractC0451s6.f853h;
                    synchronized (map) {
                        try {
                            Long l = (Long) map.get(view);
                            map.put(view, Long.valueOf(jCurrentTimeMillis));
                            if (l != null && jCurrentTimeMillis - l.longValue() < 650) {
                                z = true;
                            }
                        } finally {
                        }
                    }
                    if (!z) {
                        view.post(new RunnableC0353o(applicationContext, activity, view, c0419q6));
                        HookEntry.log("group avatar long click consumed");
                    }
                    return true;
                }
            }
        }
        HookEntry.log("group avatar long click ignored reason=home-account-avatar");
        return false;
    }
}
