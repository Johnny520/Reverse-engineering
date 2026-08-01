package com.p001mr.elaris;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import com.p001mr.elaris.xposedcompat.XposedHelpers;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import p000.AbstractC0000a;
import p000.AbstractC0198e7;
import p000.AbstractC0219fc;
import p000.AbstractC0260i5;
import p000.AbstractC0302kc;
import p000.AbstractC0463t2;
import p000.AbstractC0486u9;
import p000.AbstractC0497v4;
import p000.AbstractC0552yb;
import p000.C0018b1;
import p000.C0518w9;
import p000.C0520wb;
import p000.C0527x2;
import p000.C0534x9;
import p000.C0550y9;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class MessageRepeater {
    private static final String AIO_MSG_ITEM_CLASS = "com.tencent.mobileqq.aio.msg.AIOMsgItem";
    private static final String AIO_PARAM_CLASS = "com.tencent.aio.data.AIOParam";
    private static final int DEFAULT_REPEATER_ICON_COLOR = -15554315;
    private static final String FOLLOW_COMPONENT_CLASS = "com.tencent.mobileqq.aio.msglist.holder.component.msgfollow.AIOMsgFollowComponent";
    private static final int MAX_MSG_RECORD_ID_CACHE_SIZE = 768;
    private static final long PLAIN_TEXT_CALLBACK_WAIT_MS = 5000;
    static final String REPEATER_ICON_TAG = "ELARIS_REPEATER_ICON";
    private static volatile Object sAioParam;
    private static volatile boolean sAioParamCaptureInstalled;
    private static volatile int sBindSuccessLogCount;
    private static volatile long sBindSuccessLogWindowAt;
    private static volatile Bitmap sCustomIconBitmap;
    private static volatile String sCustomIconPath;
    private static volatile boolean sDefaultIconLogged;
    private static volatile boolean sFollowHookInstalled;
    private static volatile boolean sInstalled;
    private static volatile Object sLastSendContact;
    private static volatile long sLastSendContactLogAt;
    private static volatile boolean sSendContactCaptureInstalled;
    private static final Map<Object, Object> AIO_MSG_RECORDS = Collections.synchronizedMap(new WeakHashMap());
    private static final Map<String, Object> AIO_MSG_RECORD_BY_ID = Collections.synchronizedMap(new C0018b1());
    private static final Map<Object, WeakReference<ImageView>> REPEATER_ICON_CACHE = Collections.synchronizedMap(new WeakHashMap());
    private static final Map<String, Long> FOLLOW_PROBE_LOGS = Collections.synchronizedMap(new HashMap());
    private static final List<XC_MethodHook.Unhook> FOLLOW_UNHOOKS = Collections.synchronizedList(new ArrayList());
    private static final String[] AIO_PARAM_HOST_CLASSES = {"com.tencent.mobileqq.aio.core.BaseChatPie", "com.tencent.mobileqq.activity.aio.core.BaseChatPie", "com.tencent.mobileqq.aio.core.BaseAIOContext"};
    private static final String[] KERNEL_MSG_SERVICE_CLASSES = {"com.tencent.qqnt.kernel.nativeinterface.IKernelMsgService$CppProxy", "com.tencent.qqnt.kernelpublic.nativeinterface.IKernelMsgService$CppProxy"};
    private static final Set<String> SEND_CONTACT_HOOKED = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private MessageRepeater() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object appRuntime(ClassLoader classLoader) {
        Object objCall;
        try {
            Object objCall2 = call(call(XposedHelpers.findClass("com.tencent.common.app.BaseApplicationImpl", classLoader), null, "getApplication"), "getRuntime");
            if (objCall2 != null) {
                return objCall2;
            }
        } catch (Throwable unused) {
        }
        try {
            objCall = call(call(XposedHelpers.findClass("mqq.app.MobileQQ", classLoader), null, "getContext"), "getRuntime");
        } catch (Throwable unused2) {
        }
        if (objCall != null) {
            return objCall;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void applyDefaultRepeaterIconStyle(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        try {
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        } catch (Throwable unused) {
        }
        try {
            int iM174dp = m174dp(imageView, 0.0f);
            imageView.setPadding(iM174dp, iM174dp, iM174dp, iM174dp);
        } catch (Throwable unused2) {
        }
        try {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            int iM174dp2 = m174dp(imageView, 24.0f);
            if (layoutParams.width != iM174dp2) {
                layoutParams.width = iM174dp2;
            }
            if (layoutParams.height != iM174dp2) {
                layoutParams.height = iM174dp2;
            }
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 16;
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = 0;
            } else if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams3.gravity = 16;
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
            }
            imageView.setLayoutParams(layoutParams);
        } catch (Throwable unused3) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void applyRepeaterPositionAndHitArea(ImageView imageView, boolean z) {
        if (imageView != null && z) {
            try {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams == null) {
                    return;
                }
                int iM174dp = m174dp(imageView, 72.0f);
                if (layoutParams.width < iM174dp) {
                    layoutParams.width = iM174dp;
                }
                if (layoutParams.height < iM174dp) {
                    layoutParams.height = iM174dp;
                }
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) layoutParams).gravity = 16;
                } else if (layoutParams instanceof LinearLayout.LayoutParams) {
                    ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
                }
                imageView.setLayoutParams(layoutParams);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static ArrayList arrayList(List list) {
        return list == null ? new ArrayList() : new ArrayList(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Map attrsFromMsg(Object obj) {
        Object objCall = call(obj, "getMsgAttrs");
        if (objCall instanceof Map) {
            return (Map) objCall;
        }
        Object objCall2 = call(obj, "getAttrs");
        if (objCall2 instanceof Map) {
            return (Map) objCall2;
        }
        Object objFirstObject = firstObject(obj, "msgAttrs", "attrs", "messageAttrs", "mMsgAttrs");
        if (objFirstObject instanceof Map) {
            return (Map) objFirstObject;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Map attrsMap(Map map) {
        return map == null ? new HashMap() : new HashMap(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean bindIcon(ClassLoader classLoader, ImageView imageView, Object obj) {
        if (imageView == null) {
            WeakHashMap weakHashMap = AbstractC0552yb.f1106a;
        } else {
            WeakHashMap weakHashMap2 = AbstractC0552yb.f1106a;
            synchronized (weakHashMap2) {
                weakHashMap2.put(imageView, obj);
            }
        }
        try {
            imageView.setTag("ELARIS_REPEATER_ICON");
        } catch (Throwable unused) {
        }
        boolean zRuntimeBool = HookEntry.runtimeBool(Prefs.KEY_MESSAGE_REPEATER_HIDE_BUTTON);
        String strCurrentCustomIconPath = currentCustomIconPath();
        boolean z = strCurrentCustomIconPath.length() > 0;
        String strRepeaterVisualState = repeaterVisualState(zRuntimeBool, strCurrentCustomIconPath);
        boolean zIsIconVisualReady = isIconVisualReady(imageView, strRepeaterVisualState, zRuntimeBool);
        if (zIsIconVisualReady || !zRuntimeBool) {
            try {
                if (!zIsIconVisualReady && z) {
                    try {
                        imageView.setVisibility(0);
                    } catch (Throwable unused2) {
                    }
                    try {
                        imageView.setAlpha(1.0f);
                    } catch (Throwable unused3) {
                    }
                    try {
                        imageView.setTranslationX(0.0f);
                    } catch (Throwable unused4) {
                    }
                    try {
                        imageView.setTranslationY(0.0f);
                    } catch (Throwable unused5) {
                    }
                    try {
                        imageView.setColorFilter((ColorFilter) null);
                    } catch (Throwable unused6) {
                    }
                    try {
                        imageView.setImageTintList(null);
                    } catch (Throwable unused7) {
                    }
                    try {
                        imageView.setBackgroundTintList(null);
                    } catch (Throwable unused8) {
                    }
                    applyDefaultRepeaterIconStyle(imageView);
                    Drawable drawableResolveCustomIcon = resolveCustomIcon(imageView, strCurrentCustomIconPath);
                    if (drawableResolveCustomIcon != null) {
                        try {
                            imageView.setImageDrawable(drawableResolveCustomIcon);
                        } catch (Throwable unused9) {
                        }
                    }
                    try {
                        imageView.setMinimumWidth(1);
                    } catch (Throwable unused10) {
                    }
                    imageView.setMinimumHeight(1);
                } else if (!zIsIconVisualReady) {
                    try {
                        imageView.setVisibility(0);
                    } catch (Throwable unused11) {
                    }
                    try {
                        imageView.setAlpha(1.0f);
                    } catch (Throwable unused12) {
                    }
                    try {
                        imageView.setTranslationX(0.0f);
                    } catch (Throwable unused13) {
                    }
                    try {
                        imageView.setTranslationY(0.0f);
                    } catch (Throwable unused14) {
                    }
                    try {
                        imageView.setColorFilter((ColorFilter) null);
                    } catch (Throwable unused15) {
                    }
                    try {
                        imageView.setImageTintList(null);
                    } catch (Throwable unused16) {
                    }
                    try {
                        imageView.setBackgroundTintList(null);
                    } catch (Throwable unused17) {
                    }
                    applyDefaultRepeaterIconStyle(imageView);
                    Drawable drawableResolveDefaultIcon = resolveDefaultIcon(imageView);
                    if (drawableResolveDefaultIcon != null) {
                        try {
                            imageView.setImageDrawable(drawableResolveDefaultIcon);
                        } catch (Throwable unused18) {
                        }
                    }
                    try {
                        imageView.setMinimumWidth(1);
                    } catch (Throwable unused19) {
                    }
                    imageView.setMinimumHeight(1);
                }
            } catch (Throwable unused20) {
            }
        } else {
            try {
                imageView.setVisibility(0);
            } catch (Throwable unused21) {
            }
            try {
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            } catch (Throwable unused22) {
            }
            try {
                imageView.setImageDrawable(null);
            } catch (Throwable unused23) {
            }
            try {
                imageView.setAlpha(0.0f);
            } catch (Throwable unused24) {
            }
            try {
                imageView.setMinimumWidth(m174dp(imageView, 72.0f));
            } catch (Throwable unused25) {
            }
            try {
                imageView.setMinimumHeight(m174dp(imageView, 72.0f));
            } catch (Throwable unused26) {
            }
            applyRepeaterPositionAndHitArea(imageView, true);
        }
        rememberIconVisualState(imageView, strRepeaterVisualState, zRuntimeBool);
        try {
            imageView.setClickable(true);
        } catch (Throwable unused27) {
        }
        if (imageView == null) {
            WeakHashMap weakHashMap3 = AbstractC0552yb.f1106a;
        } else {
            WeakHashMap weakHashMap4 = AbstractC0552yb.f1107b;
            synchronized (weakHashMap4) {
                try {
                    if (!weakHashMap4.containsKey(imageView)) {
                        weakHashMap4.put(imageView, Boolean.TRUE);
                        try {
                            imageView.setOnClickListener(new ViewOnClickListenerC0159m(imageView, classLoader));
                            return true;
                        } catch (Throwable th) {
                            WeakHashMap weakHashMap5 = AbstractC0552yb.f1107b;
                            synchronized (weakHashMap5) {
                                weakHashMap5.remove(imageView);
                                AbstractC0000a.m3d(th, new StringBuilder("repeater icon skipped reason=click listener "), ": ");
                                return false;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void cacheClassList(String str, Class<?> cls) {
        if (str == null || cls == null) {
            return;
        }
        String name = cls.getName();
        String strM1004e = AbstractC0463t2.m1004e(str);
        if (strM1004e.length() == 0) {
            AbstractC0463t2.m1015p(str, name);
            return;
        }
        String[] strArrSplit = strM1004e.split("\\|");
        int length = strArrSplit.length;
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            if (name.equals(str2 == null ? "" : str2.trim())) {
                return;
            }
        }
        AbstractC0463t2.m1015p(str, strM1004e + "|" + name);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void cacheRepeaterImageView(Object obj, ImageView imageView) {
        if (obj == null || imageView == null) {
            return;
        }
        Map<Object, WeakReference<ImageView>> map = REPEATER_ICON_CACHE;
        synchronized (map) {
            map.put(obj, new WeakReference<>(imageView));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object cachedMsgRecordById(String str) {
        Object obj;
        if (str == null || str.length() == 0) {
            return null;
        }
        Map<String, Object> map = AIO_MSG_RECORD_BY_ID;
        synchronized (map) {
            obj = map.get(str);
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object cachedMsgRecordFromAny(Object obj) {
        Map<Object, Object> map = AIO_MSG_RECORDS;
        synchronized (map) {
            try {
                Object obj2 = map.get(obj);
                if (obj2 != null) {
                    return obj2;
                }
                if (obj == null) {
                    return null;
                }
                Object objFindMsgRecordByText = findMsgRecordByText(String.valueOf(obj));
                if (objFindMsgRecordByText != null) {
                    return objFindMsgRecordByText;
                }
                Object objM1097p = AbstractC0497v4.m1097p(obj);
                if (objM1097p != null) {
                    rememberAioMsgRecord(obj, objM1097p);
                }
                return objM1097p;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static ImageView cachedRepeaterImageView(Object obj) {
        ImageView imageView;
        Map<Object, WeakReference<ImageView>> map = REPEATER_ICON_CACHE;
        synchronized (map) {
            WeakReference<ImageView> weakReference = map.get(obj);
            imageView = weakReference == null ? null : weakReference.get();
        }
        return imageView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object call(Class<?> cls, Object obj, String str) {
        try {
            try {
                Method method = cls.getMethod(str, null);
                method.setAccessible(true);
                return method.invoke(obj, null);
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable unused2) {
            Method declaredMethod = cls.getDeclaredMethod(str, null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(obj, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object callbackArg(ClassLoader classLoader, Class<?> cls, C0550y9 c0550y9) {
        if (cls != null) {
            if (cls.isPrimitive()) {
                return defaultArg(cls);
            }
            if (cls.isInterface()) {
                try {
                    ClassLoader classLoader2 = cls.getClassLoader();
                    if (classLoader2 == null) {
                        if (classLoader == null) {
                            classLoader = MessageRepeater.class.getClassLoader();
                        }
                        classLoader2 = classLoader;
                    }
                    return Proxy.newProxyInstance(classLoader2, new Class[]{cls}, new C0153g(c0550y9));
                } catch (Throwable th) {
                    AbstractC0198e7.m343a("repeater", "callback-proxy", th);
                    HookEntry.log("repeater send failed reason=callback proxy " + cls.getName() + " " + th.getClass().getSimpleName() + ": " + th.getMessage());
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean canReuseRepeaterBinding(ImageView imageView, Object obj) {
        if (!isCachedRepeaterIconCandidate(imageView) || AbstractC0552yb.m1170a(imageView) != obj) {
            return false;
        }
        boolean zRuntimeBool = HookEntry.runtimeBool(Prefs.KEY_MESSAGE_REPEATER_HIDE_BUTTON);
        return isIconVisualReady(imageView, repeaterVisualState(zRuntimeBool, currentCustomIconPath()), zRuntimeBool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void collectImageViews(Object obj, List<ImageView> list, Set<Object> set, int i) {
        Field[] declaredFields;
        int iMin;
        if (obj == null || list == null || set == null || i < 0 || set.contains(obj)) {
            return;
        }
        set.add(obj);
        if (obj instanceof ImageView) {
            ImageView imageView = (ImageView) obj;
            if (list.contains(imageView)) {
                return;
            }
            list.add(imageView);
            return;
        }
        if ((obj instanceof CharSequence) || (obj instanceof Number) || (obj instanceof Boolean)) {
            return;
        }
        if (obj instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) obj;
            try {
                iMin = Math.min(viewGroup.getChildCount(), 12);
            } catch (Throwable unused) {
                iMin = 0;
            }
            for (int i2 = 0; i2 < iMin; i2++) {
                try {
                    collectImageViews(viewGroup.getChildAt(i2), list, set, i - 1);
                } catch (Throwable unused2) {
                }
            }
            if (i <= 1) {
                return;
            }
        } else if (obj instanceof View) {
            return;
        }
        if (obj.getClass().getName().startsWith("java.")) {
            return;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                declaredFields = superclass.getDeclaredFields();
            } catch (Throwable unused3) {
                declaredFields = null;
            }
            if (declaredFields != null) {
                for (Field field : declaredFields) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        try {
                            field.setAccessible(true);
                            Object obj2 = field.get(obj);
                            int i3 = i - 1;
                            collectImageViews(obj2, list, set, i3);
                            if (obj2 != null && obj2.getClass().getName().contains("Lazy")) {
                                collectImageViews(call(obj2, "getValue"), list, set, i3);
                            }
                        } catch (Throwable unused4) {
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int contactChatType(Object obj) {
        int iIntField = intField(obj, "chatType", intField(obj, "type", 0));
        if (iIntField > 0) {
            return iIntField;
        }
        Object objCall = call(obj, "getChatType");
        if (objCall instanceof Number) {
            return ((Number) objCall).intValue();
        }
        Object objCall2 = call(obj, "getType");
        if (objCall2 instanceof Number) {
            return ((Number) objCall2).intValue();
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object contactForParam(ClassLoader classLoader, Object obj, Class<?> cls) {
        if (obj == null || cls == null || cls.isInstance(obj) || !isContactType(cls)) {
            return obj;
        }
        int iIntField = intField(obj, "chatType", intField(obj, "type", 0));
        if (iIntField <= 0) {
            iIntField = 1;
        }
        String strFirstString = firstString(obj, "peerUid", "peerUin", "uin", "uid", "troopUin", "friendUin");
        if (strFirstString.length() == 0) {
            strFirstString = stringOf(call(obj, "getPeerUid"));
        }
        if (strFirstString.length() == 0) {
            strFirstString = stringOf(call(obj, "getPeerUin"));
        }
        String strFirstString2 = firstString(obj, "guildId", "guildID");
        try {
            Object objNewContact = newContact(cls, iIntField, strFirstString, strFirstString2);
            if (objNewContact != null) {
                return objNewContact;
            }
            Object objNewInstance = cls.newInstance();
            setAny(objNewInstance, strFirstString, "peerUid", "uin", "uid", "peerUin");
            setAny(objNewInstance, strFirstString2, "guildId", "guildID");
            setAny(objNewInstance, Integer.valueOf(iIntField), "chatType", "type");
            return objNewInstance;
        } catch (Throwable th) {
            HookEntry.log("repeater send failed reason=contact convert " + cls.getName() + " " + th.getClass().getSimpleName() + ": " + th.getMessage());
            return obj;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object contactFromAioParam(ClassLoader classLoader, Object obj) {
        if (obj == null) {
            return null;
        }
        Object objCall = call(obj, "getContact");
        if (objCall != null) {
            return objCall;
        }
        Object objFirstObject = firstObject(obj, "contact", "aioContact", "mContact", "mAioContact", "peer", "aioPeer");
        if (objFirstObject == null) {
            objFirstObject = call(obj, "getAioContact");
        }
        if (objFirstObject == null) {
            objFirstObject = call(obj, "getContactInfo");
        }
        Object objCall2 = call(objFirstObject, "getContact");
        if (objCall2 != null) {
            return objCall2;
        }
        String strFirstString = firstString(objFirstObject, "peerUid", "peerUin", "uin", "uid", "troopUin", "friendUin");
        if (strFirstString.length() == 0) {
            strFirstString = stringOf(call(objFirstObject, "getPeerUid"));
        }
        if (strFirstString.length() == 0) {
            strFirstString = stringOf(call(objFirstObject, "getPeerUin"));
        }
        if (strFirstString.length() == 0) {
            strFirstString = firstString(obj, "peerUid", "peerUin", "uin", "uid", "troopUin", "friendUin");
        }
        String strFirstString2 = firstString(objFirstObject, "guildId", "guildID");
        if (strFirstString2.length() == 0) {
            strFirstString2 = firstString(obj, "guildId", "guildID");
        }
        int iIntField = intField(objFirstObject, "chatType", intField(obj, "chatType", intField(objFirstObject, "type", 0)));
        if (iIntField <= 0) {
            iIntField = 1;
        }
        return newContactFromData(classLoader, iIntField, strFirstString, strFirstString2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object contactFromMsg(ClassLoader classLoader, Object obj) {
        String strFirstString;
        Object objFirstObject = firstObject(obj, "contact", "mContact", "peer", "mPeer", "conversationContact");
        if (isLikelyContact(objFirstObject)) {
            return objFirstObject;
        }
        int iContactTypeFromMessage = contactTypeFromMessage(obj);
        if (iContactTypeFromMessage == 2) {
            strFirstString = firstString(obj, "peerUid", "peerUin", "troopUin", "groupUin");
            if (strFirstString.length() == 0) {
                strFirstString = firstString(obj, "frienduin", "friendUin");
            }
        } else {
            strFirstString = firstString(obj, "peerUid", "peerUin", "frienduin", "friendUin", "troopUin", "groupUin");
        }
        return newContactFromData(classLoader, iContactTypeFromMessage, strFirstString, firstString(obj, "guildId", "guildID"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String contactGuild(Object obj) {
        return firstString(obj, "guildId", "guildID");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String contactPeer(Object obj) {
        String strFirstString = firstString(obj, "peerUid", "peerUin", "uin", "uid", "troopUin", "friendUin");
        if (strFirstString.length() == 0) {
            strFirstString = stringOf(call(obj, "getPeerUid"));
        }
        return strFirstString.length() == 0 ? stringOf(call(obj, "getPeerUin")) : strFirstString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int contactTypeFromMessage(Object obj) {
        int iIntField = intField(obj, "chatType", 0);
        return iIntField > 0 ? iIntField : intField(obj, "istroop", -1) == 1 ? 2 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String currentCustomIconPath() {
        String strRuntimeString = HookEntry.runtimeString(Prefs.KEY_MESSAGE_REPEATER_ICON_PATH, "");
        return strRuntimeString == null ? "" : strRuntimeString.trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static Object defaultArg(Class<?> cls) {
        if (cls != null && cls.isPrimitive()) {
            if (cls == Boolean.TYPE) {
                return Boolean.FALSE;
            }
            if (cls == Integer.TYPE) {
                return 0;
            }
            if (cls == Long.TYPE) {
                return 0L;
            }
            if (cls == Float.TYPE) {
                return Float.valueOf(0.0f);
            }
            if (cls == Double.TYPE) {
                return Double.valueOf(0.0d);
            }
            if (cls == Short.TYPE) {
                return (short) 0;
            }
            if (cls == Byte.TYPE) {
                return (byte) 0;
            }
            if (cls == Character.TYPE) {
                return (char) 0;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static String describeArgs(Object[] objArr) {
        if (objArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("len=");
        sb.append(objArr.length);
        int iMin = Math.min(objArr.length, 5);
        for (int i = 0; i < iMin; i++) {
            sb.append(" arg");
            sb.append(i);
            sb.append('=');
            sb.append(describeObject(objArr[i]));
            if (objArr[i] instanceof List) {
                sb.append('[');
                sb.append(describeList((List) objArr[i]));
                sb.append(']');
            }
        }
        return safeProbe(sb.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String describeIconCandidate(ImageView imageView, int i) {
        String name = "null";
        if (imageView == null) {
            return "null";
        }
        try {
            if (imageView.getDrawable() != null) {
                name = imageView.getDrawable().getClass().getName();
            }
        } catch (Throwable unused) {
            name = "unknown";
        }
        return safeProbe("score=" + i + " class=" + imageView.getClass().getName() + " size=" + viewSize(imageView, true) + "x" + viewSize(imageView, false) + " visibility=" + imageView.getVisibility() + " alpha=" + imageView.getAlpha() + " drawable=" + name + " chain=" + viewChainText(imageView, 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String describeInterestingFields(Object obj) {
        Field[] declaredFields;
        if (obj == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class && i < 10; superclass = superclass.getSuperclass()) {
            try {
                declaredFields = superclass.getDeclaredFields();
            } catch (Throwable unused) {
                declaredFields = null;
            }
            if (declaredFields != null) {
                for (int i2 = 0; i2 < declaredFields.length && i < 10; i2++) {
                    Field field = declaredFields[i2];
                    if (!Modifier.isStatic(field.getModifiers())) {
                        String lowerCase = field.getName().toLowerCase(Locale.US);
                        Class<?> type = field.getType();
                        if (View.class.isAssignableFrom(type) || List.class.isAssignableFrom(type) || lowerCase.contains("msg") || lowerCase.contains("menu") || lowerCase.contains("item") || lowerCase.contains("view")) {
                            try {
                                field.setAccessible(true);
                                Object obj2 = field.get(obj);
                                if (sb.length() > 0) {
                                    sb.append(' ');
                                }
                                sb.append(field.getName());
                                sb.append('=');
                                sb.append(describeObject(obj2));
                                i++;
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
            }
        }
        return safeProbe(sb.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String describeList(List list) {
        if (list == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("size=");
        sb.append(list.size());
        int iMin = Math.min(list.size(), 6);
        for (int i = 0; i < iMin; i++) {
            sb.append(" item");
            sb.append(i);
            sb.append('=');
            sb.append(describeObject(list.get(i)));
        }
        return safeProbe(sb.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String describeObject(Object obj) {
        String str;
        if (obj == null) {
            return "null";
        }
        String name = obj.getClass().getName();
        if (obj instanceof View) {
            View view = (View) obj;
            return name + "#" + Integer.toHexString(System.identityHashCode(obj)) + "(w=" + view.getWidth() + ",h=" + view.getHeight() + ",tag=" + safeProbe(view.getTag()) + ")";
        }
        if (obj instanceof List) {
            return name + "#" + Integer.toHexString(System.identityHashCode(obj));
        }
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("#");
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        if (strValueOf.length() == 0) {
            str = "";
        } else {
            str = "(" + safeProbe(strValueOf) + ")";
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: dp */
    private static int m174dp(View view, float f) {
        return (int) ((f * view.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static List elementsFromMsg(Object obj) {
        Object objCall = call(obj, "getElements");
        if (objCall instanceof List) {
            return (List) objCall;
        }
        Object objFirstObject = firstObject(obj, "elements", "msgElements", "msgElementList", "elementList");
        if (objFirstObject instanceof List) {
            return (List) objFirstObject;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object field(Object obj, String str) {
        if (obj != null && str != null) {
            for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                try {
                    Field declaredField = superclass.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    return declaredField.get(obj);
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Class<?> findAnyClass(ClassLoader classLoader, String... strArr) throws ClassNotFoundException {
        for (String str : strArr) {
            Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists(str, classLoader);
            if (clsFindClassIfExists != null) {
                return clsFindClassIfExists;
            }
        }
        throw new ClassNotFoundException(strArr.length == 0 ? "" : strArr[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Field findField(Class<?> cls, String str) {
        while (cls != null && cls != Object.class) {
            try {
                return cls.getDeclaredField(str);
            } catch (Throwable unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Method findMethod(Class<?> cls, String str, int i) {
        while (cls != null && cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (!Modifier.isAbstract(method.getModifiers()) && str.equals(method.getName()) && method.getParameterTypes().length == i) {
                    return method;
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object findMsgRecordByText(String str) {
        Object obj;
        String strMessageIdFromText = messageIdFromText(str);
        if (strMessageIdFromText.length() == 0) {
            return null;
        }
        Map<String, Object> map = AIO_MSG_RECORD_BY_ID;
        synchronized (map) {
            obj = map.get(strMessageIdFromText);
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object findMsgRecordLike(Object obj, int i) {
        if (obj == null || i > 3) {
            return null;
        }
        String lowerCase = obj.getClass().getName().toLowerCase();
        if (lowerCase.contains("msgrecord") || lowerCase.endsWith(".messagerecord") || lowerCase.endsWith(".chatmessage")) {
            return obj;
        }
        if (!(obj instanceof CharSequence) && !(obj instanceof Number) && !(obj instanceof Boolean)) {
            for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                for (Field field : superclass.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive()) {
                        try {
                            field.setAccessible(true);
                            Object objFindMsgRecordLike = findMsgRecordLike(field.get(obj), 1 + i);
                            if (objFindMsgRecordLike != null) {
                                return objFindMsgRecordLike;
                            }
                        } catch (Throwable unused) {
                            continue;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object findObjectByType(Object obj, Class<?> cls, int i) {
        Field[] declaredFields;
        Object objFindObjectByType;
        if (obj != null && cls != null && i >= 0) {
            if (cls.isInstance(obj)) {
                return obj;
            }
            if (!(obj instanceof CharSequence) && !(obj instanceof Number) && !(obj instanceof Boolean)) {
                String name = obj.getClass().getName();
                if (!name.startsWith("java.") && !name.startsWith("android.")) {
                    for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                        try {
                            declaredFields = superclass.getDeclaredFields();
                        } catch (Throwable unused) {
                            declaredFields = null;
                        }
                        if (declaredFields != null) {
                            for (Field field : declaredFields) {
                                if (!Modifier.isStatic(field.getModifiers())) {
                                    try {
                                        field.setAccessible(true);
                                        Object obj2 = field.get(obj);
                                        if (cls.isInstance(obj2)) {
                                            return obj2;
                                        }
                                        Object objCall = (obj2 == null || !obj2.getClass().getName().contains("Lazy")) ? null : call(obj2, "getValue");
                                        if (cls.isInstance(objCall)) {
                                            return objCall;
                                        }
                                        if (obj2 != null) {
                                            String name2 = obj2.getClass().getName();
                                            if (!name2.startsWith("java.") && !name2.startsWith("android.") && (objFindObjectByType = findObjectByType(obj2, cls, i - 1)) != null) {
                                                return objFindObjectByType;
                                            }
                                        }
                                    } catch (Throwable unused2) {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static ImageView findRepeaterImageView(Object obj) {
        if (obj != null) {
            ImageView imageViewCachedRepeaterImageView = cachedRepeaterImageView(obj);
            if (isCachedRepeaterIconCandidate(imageViewCachedRepeaterImageView)) {
                return imageViewCachedRepeaterImageView;
            }
            removeCachedRepeaterImageView(obj);
        }
        ArrayList arrayList = new ArrayList();
        collectImageViews(obj, arrayList, Collections.newSetFromMap(new IdentityHashMap()), 4);
        int i = Integer.MIN_VALUE;
        ImageView imageView = null;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ImageView imageView2 = (ImageView) arrayList.get(i2);
            int iRepeaterIconScore = repeaterIconScore(imageView2);
            if (iRepeaterIconScore > i) {
                imageView = imageView2;
                i = iRepeaterIconScore;
            }
        }
        if (imageView != null && isSafeRepeaterIconCandidate(imageView, i)) {
            cacheRepeaterImageView(obj, imageView);
            return imageView;
        }
        if (shouldLogFollowProbe("icon-candidate|".concat(obj == null ? "null" : obj.getClass().getName()))) {
            HookEntry.log("repeater icon skipped reason=no safe icon candidate count=" + arrayList.size() + " best=" + describeIconCandidate(imageView, i));
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object findReturnByName(Object obj, String str) {
        Class<?> returnType;
        if (obj != null && str != null) {
            for (Method method : obj.getClass().getMethods()) {
                if (method.getParameterTypes().length == 0 && !Modifier.isAbstract(method.getModifiers()) && (returnType = method.getReturnType()) != null && returnType.getName().contains(str)) {
                    try {
                        method.setAccessible(true);
                        Object objInvoke = method.invoke(obj, null);
                        if (objInvoke != null) {
                            return objInvoke;
                        }
                    } catch (Throwable unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static Object firstContactArg(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        for (Object obj : objArr) {
            if (isLikelyContact(obj)) {
                return obj;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static Integer firstIntArg(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        for (Object obj : objArr) {
            if (obj instanceof Number) {
                return Integer.valueOf(((Number) obj).intValue());
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static List firstListArg(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        for (Object obj : objArr) {
            if (obj instanceof List) {
                return (List) obj;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static Object firstMsgRecordArg(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        for (Object obj : objArr) {
            if (obj != null && isMsgRecordClass(obj.getClass())) {
                return obj;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object firstObject(Object obj, String... strArr) {
        for (String str : strArr) {
            Object objField = field(obj, str);
            if (objField != null) {
                return objField;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String firstString(Object obj, String... strArr) {
        Object objFirstObject = firstObject(obj, strArr);
        return objFirstObject == null ? "" : String.valueOf(objFirstObject).trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static ArrayList freshTextElements(ClassLoader classLoader, Object obj) {
        if (!isPlainTextMessage(obj)) {
            return null;
        }
        String strMsgText = msgText(obj);
        if (strMsgText.length() == 0) {
            return null;
        }
        return textElementsFromText(classLoader, strMsgText, "repeater");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Long generateMsgUniqueId(Object obj, Object obj2) {
        if (obj == null) {
            return null;
        }
        int iContactChatType = contactChatType(obj2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<Method> listMethodsNamed = methodsNamed(obj.getClass(), "generateMsgUniqueId");
        for (int i = 0; i < listMethodsNamed.size(); i++) {
            Method method = listMethodsNamed.get(i);
            Class<?>[] parameterTypes = method.getParameterTypes();
            try {
                method.setAccessible(true);
                Object objInvoke = (parameterTypes.length == 2 && isIntType(parameterTypes[0]) && isLongType(parameterTypes[1])) ? method.invoke(obj, Integer.valueOf(iContactChatType), Long.valueOf(jCurrentTimeMillis)) : (parameterTypes.length == 2 && isLongType(parameterTypes[0]) && isIntType(parameterTypes[1])) ? method.invoke(obj, Long.valueOf(jCurrentTimeMillis), Integer.valueOf(iContactChatType)) : (parameterTypes.length == 1 && isLongType(parameterTypes[0])) ? method.invoke(obj, Long.valueOf(jCurrentTimeMillis)) : parameterTypes.length == 0 ? method.invoke(obj, null) : null;
                if (objInvoke instanceof Number) {
                    long jLongValue = ((Number) objInvoke).longValue();
                    if (jLongValue != 0) {
                        return Long.valueOf(jLongValue);
                    }
                    continue;
                } else {
                    continue;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean hasContactParam(Method method) {
        if (method == null) {
            return false;
        }
        for (Class<?> cls : method.getParameterTypes()) {
            if (isContactType(cls)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean hasNonTextElement(Object obj) {
        String[] strArr = {"getPicElement", "getMarketFaceElement", "getStructMsgElement", "getArkElement", "getFileElement", "getPttElement", "getVideoElement", "getVoiceElement", "getAudioElement", "getFaceElement", "getEmojiElement", "getSysFaceElement", "getSmallYellowFaceElement", "getFaceBubbleElement", "getAniStickerElement", "getReplyElement", "getMultiForwardMsgElement"};
        for (int i = 0; i < 17; i++) {
            if (call(obj, strArr[i]) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean hasParam(Method method, Class<?> cls) {
        for (Class<?> cls2 : method.getParameterTypes()) {
            if (cls.isAssignableFrom(cls2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean hasRepeaterCue(ImageView imageView) {
        String strViewCueText = viewCueText(imageView);
        return strViewCueText.contains("+1") || strViewCueText.contains("plus") || strViewCueText.contains("repeat") || strViewCueText.contains("repeater") || strViewCueText.contains("复读");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean hasReplyElementInElements(List list) {
        if (list != null && !list.isEmpty()) {
            int iMin = Math.min(list.size(), 12);
            for (int i = 0; i < iMin; i++) {
                Object obj = list.get(i);
                if (obj != null) {
                    if (call(obj, "getReplyElement") != null) {
                        return true;
                    }
                    String lowerCase = obj.getClass().getName().toLowerCase(Locale.US);
                    if (lowerCase.contains("reply") || lowerCase.contains("quote")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean hasReplyMetadata(Object obj, int i) {
        String lowerCase;
        Field[] declaredFields;
        if (obj == null || i > 3 || (obj instanceof CharSequence) || (obj instanceof Number) || (obj instanceof Boolean)) {
            return false;
        }
        try {
            lowerCase = obj.getClass().getName().toLowerCase(Locale.US);
        } catch (Throwable unused) {
            lowerCase = "";
        }
        if (lowerCase.contains("reply") || lowerCase.contains("quote") || hasReplyElementInElements(elementsFromMsg(obj)) || hasReplyMetadataInMap(attrsFromMsg(obj))) {
            return true;
        }
        String[] strArr = {"getReplyElement", "getReplyMsg", "getReplyMsgInfo", "getReplyMsgMainInfo", "getSourceMsg", "getSourceMsgInfo", "getSrcMsg", "getSrcMsgInfo", "getQuote", "getQuoteInfo", "getQuotedMsg", "getRefMsg", "getRefMsgInfo"};
        for (int i2 = 0; i2 < 13; i2++) {
            if (call(obj, strArr[i2]) != null) {
                return true;
            }
        }
        String[] strArr2 = {"replyElement", "replyInfo", "replyMsg", "replyMsgInfo", "replyMsgMainInfo", "sourceMsg", "sourceMsgInfo", "srcMsg", "srcMsgInfo", "quote", "quoteInfo", "quotedMsg", "refMsg", "refMsgInfo", "mReplyMsg", "mSourceMsg"};
        for (int i3 = 0; i3 < 16; i3++) {
            if (field(obj, strArr2[i3]) != null) {
                return true;
            }
        }
        if (i >= 2) {
            return false;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                declaredFields = superclass.getDeclaredFields();
            } catch (Throwable unused2) {
                declaredFields = null;
            }
            if (declaredFields != null) {
                for (Field field : declaredFields) {
                    if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive()) {
                        String lowerCase2 = field.getName().toLowerCase(Locale.US);
                        if (lowerCase2.contains("reply") || lowerCase2.contains("quote")) {
                            try {
                                field.setAccessible(true);
                                Object obj2 = field.get(obj);
                                if (obj2 != null && (isMeaningfulReplyValue(obj2) || hasReplyMetadata(obj2, i + 1))) {
                                    return true;
                                }
                            } catch (Throwable unused3) {
                                continue;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean hasReplyMetadataInMap(Map map) {
        Object next;
        if (map != null && !map.isEmpty()) {
            try {
                Iterator it = map.entrySet().iterator();
                int i = 0;
                while (it.hasNext() && (next = it.next()) != null) {
                    int i2 = i + 1;
                    if (i > 24) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (isReplyKey(String.valueOf(entry.getKey()).toLowerCase(Locale.US)) && isMeaningfulReplyValue(entry.getValue())) {
                        return true;
                    }
                    i = i2;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean hasSendableReplyStructure(List list, Map map) {
        if (hasReplyElementInElements(list) || hasReplyMetadataInMap(map)) {
            return true;
        }
        if (list != null && !list.isEmpty()) {
            int iMin = Math.min(list.size(), 12);
            for (int i = 0; i < iMin; i++) {
                if (hasReplyMetadata(list.get(i), 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean hasTextElement(Object obj) {
        return (call(obj, "getTextElement") == null && call(obj, "getTextMsgElement") == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int hookAioMsgRecordMap(ClassLoader classLoader) {
        int i;
        try {
            Class clsM1008i = AbstractC0463t2.m1008i(classLoader, "target.repeater_menu.msg_class", AIO_MSG_ITEM_CLASS);
            if (clsM1008i == null) {
                throw new ClassNotFoundException(AIO_MSG_ITEM_CLASS);
            }
            try {
                if (XposedBridge.hookAllConstructors(clsM1008i, new C0154h(16)).isEmpty()) {
                    return 0;
                }
                i = 1;
                try {
                    AbstractC0463t2.m1015p("target.repeater_menu.msg_class", clsM1008i.getName());
                    HookEntry.log("repeater hook installed class=" + clsM1008i.getName() + " method=<init>/MsgRecord");
                    return 1;
                } catch (Throwable th) {
                    th = th;
                    HookEntry.log("repeater hook install failed reason=AIOMsgItem ctor " + th.getClass().getSimpleName() + ": " + th.getMessage());
                    return i;
                }
            } catch (Throwable th2) {
                th = th2;
                i = 0;
            }
        } catch (Throwable th3) {
            AbstractC0000a.m3d(th3, new StringBuilder("repeater hook install failed reason=AIOMsgItem "), ": ");
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int hookAioParam(ClassLoader classLoader) {
        ClassLoader classLoader2 = classLoader;
        Class clsM1008i = AbstractC0463t2.m1008i(classLoader2, "target.repeater.aio_param_class", AIO_PARAM_CLASS);
        int i = 0;
        if (clsM1008i == null) {
            HookEntry.log("repeater hook install failed reason=AIOParam missing");
            return 0;
        }
        String[] strArrM1005f = AbstractC0463t2.m1005f("target.repeater.aio_param_host_classes", AIO_PARAM_HOST_CLASSES, classLoader2);
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrM1005f.length) {
            Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists(strArrM1005f[i2], classLoader2);
            if (clsFindClassIfExists != null) {
                try {
                    if (!XposedBridge.hookAllConstructors(clsFindClassIfExists, new C0156j(clsM1008i)).isEmpty()) {
                        i3++;
                        AbstractC0463t2.m1015p("target.repeater.aio_param_class", clsM1008i.getName());
                        cacheClassList("target.repeater.aio_param_host_classes", clsFindClassIfExists);
                        HookEntry.log("repeater hook installed class=" + clsFindClassIfExists.getName() + " method=<init>");
                    }
                } catch (Throwable th) {
                    HookEntry.log("repeater hook install failed reason=AIOParam ctor " + clsFindClassIfExists.getName() + " " + th.getClass().getSimpleName() + ": " + th.getMessage());
                }
                Method[] declaredMethods = clsFindClassIfExists.getDeclaredMethods();
                for (int i4 = i; i4 < declaredMethods.length; i4++) {
                    Method method = declaredMethods[i4];
                    if (!Modifier.isAbstract(method.getModifiers()) && (clsM1008i.isAssignableFrom(method.getReturnType()) || hasParam(method, clsM1008i))) {
                        try {
                            method.setAccessible(true);
                            XposedBridge.hookMethod(method, new C0157k(clsM1008i));
                            i3++;
                            AbstractC0463t2.m1015p("target.repeater.aio_param_class", clsM1008i.getName());
                            cacheClassList("target.repeater.aio_param_host_classes", clsFindClassIfExists);
                            HookEntry.log("repeater hook installed class=" + clsFindClassIfExists.getName() + " method=" + method.getName());
                        } catch (Throwable th2) {
                            StringBuilder sb = new StringBuilder("repeater hook install failed reason=AIOParam method ");
                            sb.append(clsFindClassIfExists.getName());
                            sb.append("#");
                            sb.append(method.getName());
                            sb.append(" ");
                            AbstractC0000a.m3d(th2, sb, ": ");
                        }
                    }
                }
            }
            i2++;
            classLoader2 = classLoader;
            i = 0;
        }
        return i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int hookMessageFollowRepeater(ClassLoader classLoader) {
        if (sFollowHookInstalled) {
            return 0;
        }
        try {
            Class clsM1008i = AbstractC0463t2.m1008i(classLoader, "target.repeater.follow_component_class", FOLLOW_COMPONENT_CLASS);
            if (clsM1008i == null) {
                throw new ClassNotFoundException(FOLLOW_COMPONENT_CLASS);
            }
            int i = 0;
            for (Method method : clsM1008i.getDeclaredMethods()) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (!Modifier.isAbstract(method.getModifiers()) && parameterTypes.length == 3 && parameterTypes[0] == Integer.TYPE && List.class.isAssignableFrom(parameterTypes[2])) {
                    method.setAccessible(true);
                    FOLLOW_UNHOOKS.add(XposedBridge.hookMethod(method, new C0155i(classLoader)));
                    i++;
                    AbstractC0463t2.m1015p("target.repeater.follow_component_class", clsM1008i.getName());
                    HookEntry.log("repeater hook installed class=" + clsM1008i.getName() + " method=" + method.getName());
                }
            }
            if (i > 0) {
                sFollowHookInstalled = true;
                HookEntry.log("repeater menu hook installed class=com.tencent.mobileqq.aio.msglist.holder.component.msgfollow.AIOMsgFollowComponent method=K1");
            }
            return i;
        } catch (Throwable th) {
            AbstractC0000a.m3d(th, new StringBuilder("repeater hook install failed reason=AIOMsgFollowComponent "), ": ");
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int hookRepeaterMenuFallback(ClassLoader classLoader) {
        String[] strArr = AbstractC0219fc.f259a;
        synchronized (AbstractC0219fc.class) {
            try {
                if (!AbstractC0219fc.f267i && classLoader != null) {
                    int iM373M = AbstractC0219fc.m373M(classLoader) + AbstractC0219fc.m371K(classLoader);
                    if (iM373M > 0) {
                        AbstractC0219fc.f267i = true;
                        HookEntry.log("repeater long press menu hook installed count=" + iM373M);
                    } else {
                        HookEntry.log("repeater long press menu hook failed reason=no compatible menu target");
                    }
                    return iM373M;
                }
                return 0;
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int hookSendContactCapture(ClassLoader classLoader) {
        int i = 0;
        for (String str : AbstractC0463t2.m1005f("target.kernel.msg_service_classes", KERNEL_MSG_SERVICE_CLASSES, classLoader)) {
            Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists(str, classLoader);
            if (clsFindClassIfExists != null) {
                for (Method method : clsFindClassIfExists.getDeclaredMethods()) {
                    if ("sendMsg".equals(method.getName()) && !Modifier.isAbstract(method.getModifiers()) && hasContactParam(method)) {
                        if (SEND_CONTACT_HOOKED.add(methodSig(method))) {
                            try {
                                method.setAccessible(true);
                                XposedBridge.hookMethod(method, new C0158l(8));
                                i++;
                                AbstractC0463t2.m1015p("target.kernel.msg_service_classes", clsFindClassIfExists.getName());
                                HookEntry.log("send contact capture hooked class=" + clsFindClassIfExists.getName() + " method=" + method.getName());
                            } catch (Throwable th) {
                                StringBuilder sb = new StringBuilder("send contact capture failed class=");
                                sb.append(clsFindClassIfExists.getName());
                                sb.append(" method=");
                                sb.append(method.getName());
                                sb.append(" error=");
                                AbstractC0000a.m3d(th, sb, ": ");
                            }
                        }
                    }
                }
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static synchronized void install(ClassLoader classLoader) {
        try {
            if (sInstalled) {
                return;
            }
            sInstalled = true;
            HookEntry.log("repeater hook install start");
            int iHookAioMsgRecordMap = hookAioMsgRecordMap(classLoader);
            if (!sAioParamCaptureInstalled) {
                int iHookAioParam = hookAioParam(classLoader);
                iHookAioMsgRecordMap += iHookAioParam;
                if (iHookAioParam > 0) {
                    sAioParamCaptureInstalled = true;
                }
            }
            if (!sSendContactCaptureInstalled) {
                int iHookSendContactCapture = hookSendContactCapture(classLoader);
                iHookAioMsgRecordMap += iHookSendContactCapture;
                if (iHookSendContactCapture > 0) {
                    sSendContactCaptureInstalled = true;
                }
            }
            int iHookRepeaterMenuFallback = iHookAioMsgRecordMap + hookRepeaterMenuFallback(classLoader);
            if (HookEntry.runtimeBool(Prefs.KEY_MESSAGE_REPEATER)) {
                iHookRepeaterMenuFallback += hookMessageFollowRepeater(classLoader);
            }
            HookEntry.log("repeater hook installed count=" + iHookRepeaterMenuFallback);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int intField(Object obj, String str, int i) {
        Object objField = field(obj, str);
        return objField instanceof Number ? ((Number) objField).intValue() : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean invokeGetMsgsByMsgId(ClassLoader classLoader, Object obj, Object obj2, Object obj3, long j, Object obj4, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j));
        Object objNewGetMsgsCallback = newGetMsgsCallback(classLoader, obj, obj2, obj3, obj4, z);
        if (objNewGetMsgsCallback == null) {
            return false;
        }
        List<Method> listMethodsNamed = methodsNamed(obj.getClass(), "getMsgsByMsgId");
        for (int i = 0; i < listMethodsNamed.size(); i++) {
            Method method = listMethodsNamed.get(i);
            if ("getMsgsByMsgId".equals(method.getName()) && !Modifier.isAbstract(method.getModifiers())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 3 && List.class.isAssignableFrom(parameterTypes[1])) {
                    try {
                        method.setAccessible(true);
                        method.invoke(obj, obj3, arrayList, objNewGetMsgsCallback);
                        return true;
                    } catch (Throwable th) {
                        Throwable thUnwrap = unwrap(th);
                        AbstractC0198e7.m343a("repeater", "get-messages-by-id", thUnwrap);
                        HookEntry.log("repeater send failed reason=getMsgsByMsgId invoke class=" + obj.getClass().getName() + " method=" + methodSig(method) + " error=" + thUnwrap.getClass().getSimpleName() + ": " + thUnwrap.getMessage());
                    }
                }
            }
        }
        HookEntry.log("repeater send failed reason=getMsgsByMsgId method unresolved");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean invokeSend(ClassLoader classLoader, Object obj, Object obj2, Object obj3, List list, Map map, C0550y9 c0550y9) {
        List<Method> listMethodsNamed = methodsNamed(obj.getClass(), "sendMsg");
        return invokeSendPass(classLoader, obj, obj2, obj3, list, map, listMethodsNamed, 2, c0550y9) || invokeSendPass(classLoader, obj, obj2, obj3, list, map, listMethodsNamed, 1, c0550y9) || invokeSendPass(classLoader, obj, obj2, obj3, list, map, listMethodsNamed, 0, c0550y9) || invokeSendPass(classLoader, obj, obj2, obj3, list, map, listMethodsNamed, 3, c0550y9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    private static boolean invokeSendPass(ClassLoader classLoader, Object obj, Object obj2, Object obj3, List list, Map map, List<Method> list2, int i, C0550y9 c0550y9) {
        int i2;
        ?? r18;
        for (int i3 = 0; i3 < list2.size(); i3++) {
            Method method = list2.get(i3);
            if ("sendMsg".equals(method.getName()) && !Modifier.isAbstract(method.getModifiers())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                try {
                    method.setAccessible(true);
                    int i4 = 3;
                    if (i == 0) {
                        i2 = 2;
                        try {
                            if (parameterTypes.length == 3 && isContactType(parameterTypes[0]) && List.class.isAssignableFrom(parameterTypes[1])) {
                                method.invoke(obj, contactForParam(classLoader, obj3, parameterTypes[0]), arrayList(list), callbackArg(classLoader, parameterTypes[2], c0550y9));
                                HookEntry.log("repeater send invoked class=" + obj.getClass().getName() + " method=" + methodSig(method));
                                return true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            Throwable thUnwrap = unwrap(th);
                            HookEntry.log("repeater send failed reason=sendMsg invoke class=" + obj.getClass().getName() + " method=" + methodSig(method) + " error=" + thUnwrap.getClass().getSimpleName() + ": " + thUnwrap.getMessage());
                        }
                    } else {
                        i2 = 2;
                    }
                    if (i == 1) {
                        boolean z = true;
                        r18 = z;
                        if (parameterTypes.length == 4) {
                            r18 = z;
                            if (isContactType(parameterTypes[0])) {
                                r18 = z;
                                if (isLongType(parameterTypes[1])) {
                                    r18 = z;
                                    if (List.class.isAssignableFrom(parameterTypes[i2])) {
                                        Object objContactForParam = contactForParam(classLoader, obj3, parameterTypes[0]);
                                        method.invoke(obj, objContactForParam, uniqueIdArg(parameterTypes[1], obj2, obj, objContactForParam), arrayList(list), callbackArg(classLoader, parameterTypes[3], c0550y9));
                                        HookEntry.log("repeater send invoked class=" + obj.getClass().getName() + " method=" + methodSig(method));
                                        return true;
                                    }
                                }
                            }
                        }
                    } else {
                        r18 = 1;
                    }
                    if (i == i2) {
                        if (parameterTypes.length == 5 && isLongType(parameterTypes[0]) && isContactType(parameterTypes[r18]) && List.class.isAssignableFrom(parameterTypes[2])) {
                            Object objContactForParam2 = contactForParam(classLoader, obj3, parameterTypes[r18]);
                            method.invoke(obj, uniqueIdArg(parameterTypes[0], obj2, obj, objContactForParam2), objContactForParam2, arrayList(list), Map.class.isAssignableFrom(parameterTypes[3]) ? attrsMap(map) : defaultArg(parameterTypes[3]), callbackArg(classLoader, parameterTypes[4], c0550y9));
                            HookEntry.log("repeater send invoked class=" + obj.getClass().getName() + " method=" + methodSig(method));
                            return r18;
                        }
                        i4 = 3;
                    }
                    if (i == i4) {
                        if (parameterTypes.length == 2 && isContactType(parameterTypes[0]) && List.class.isAssignableFrom(parameterTypes[r18])) {
                            method.invoke(obj, contactForParam(classLoader, obj3, parameterTypes[0]), arrayList(list));
                            HookEntry.log("repeater send invoked class=" + obj.getClass().getName() + " method=" + methodSig(method));
                            return r18;
                        }
                        i4 = 3;
                    }
                    if (i == i4 && parameterTypes.length == 4 && isLongType(parameterTypes[0]) && isContactType(parameterTypes[r18]) && List.class.isAssignableFrom(parameterTypes[2])) {
                        Object objContactForParam3 = contactForParam(classLoader, obj3, parameterTypes[r18]);
                        method.invoke(obj, uniqueIdArg(parameterTypes[0], obj2, obj, objContactForParam3), objContactForParam3, arrayList(list), Map.class.isAssignableFrom(parameterTypes[3]) ? attrsMap(map) : callbackArg(classLoader, parameterTypes[3], c0550y9));
                        HookEntry.log("repeater send invoked class=" + obj.getClass().getName() + " method=" + methodSig(method));
                        return r18;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isCachedRepeaterIconCandidate(ImageView imageView) {
        if (imageView == null) {
            return false;
        }
        try {
            if (imageView.getParent() != null) {
                if (isReasonableRepeaterSize(imageView)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isContactType(Class<?> cls) {
        return cls != null && cls.getName().endsWith(".Contact");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isIconVisualReady(ImageView imageView, String str, boolean z) {
        boolean zEquals;
        if (imageView == null || str == null) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC0552yb.f1108c;
        synchronized (weakHashMap) {
            zEquals = str.equals(weakHashMap.get(imageView));
        }
        if (!zEquals) {
            return false;
        }
        if (imageView.getVisibility() != 0) {
            return false;
        }
        return z ? imageView.getAlpha() <= 0.05f : imageView.getAlpha() >= 0.45f && imageView.getDrawable() != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isIntType(Class<?> cls) {
        return cls == Integer.TYPE || cls == Integer.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isLikelyContact(Object obj) {
        if (obj != null && !(obj instanceof CharSequence) && !(obj instanceof Number) && !(obj instanceof Boolean)) {
            if (obj.getClass().getName().endsWith(".Contact")) {
                return true;
            }
            if (intField(obj, "chatType", intField(obj, "type", 0)) > 0 && firstString(obj, "peerUid", "peerUin", "uin", "uid", "troopUin", "friendUin").length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isLongType(Class<?> cls) {
        return cls == Long.TYPE || cls == Long.class || cls == Integer.TYPE || cls == Integer.class || cls == String.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isMeaningfulReplyValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : obj instanceof Number ? ((Number) obj).longValue() != 0 : !(obj instanceof CharSequence) || obj.toString().trim().length() > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isMsgRecordClass(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        try {
            String name = cls.getName();
            return "com.tencent.qqnt.kernel.nativeinterface.MsgRecord".equals(name) || "com.tencent.qqnt.kernelpublic.nativeinterface.MsgRecord".equals(name) || name.endsWith(".MsgRecord");
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isObjectMethod(Method method) {
        String name = method == null ? "" : method.getName();
        return "toString".equals(name) || "hashCode".equals(name) || "equals".equals(name);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isPlainTextMessage(Object obj) {
        List listElementsFromMsg = elementsFromMsg(obj);
        if (listElementsFromMsg == null || listElementsFromMsg.isEmpty()) {
            return msgText(obj).length() > 0;
        }
        boolean z = false;
        for (int i = 0; i < listElementsFromMsg.size(); i++) {
            Object obj2 = listElementsFromMsg.get(i);
            if (obj2 != null) {
                if (hasNonTextElement(obj2) || !hasTextElement(obj2)) {
                    return false;
                }
                z = true;
            }
        }
        return z && msgText(obj).length() > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isReasonableRepeaterSize(ImageView imageView) {
        int iViewSize = viewSize(imageView, true);
        int iViewSize2 = viewSize(imageView, false);
        int iM174dp = m174dp(imageView, 12.0f);
        int iM174dp2 = m174dp(imageView, 80.0f);
        if (iViewSize <= 0 || iViewSize2 <= 0) {
            return true;
        }
        return iViewSize >= iM174dp && iViewSize2 >= iM174dp && iViewSize <= iM174dp2 && iViewSize2 <= iM174dp2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isRefreshBindingCurrent(View view, Object obj) {
        return obj != null && refreshBindingKey(view) == obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isRepeaterCaptureEnabled() {
        return HookEntry.runtimeBool(Prefs.KEY_MESSAGE_REPEATER) || HookEntry.runtimeBool(Prefs.KEY_MESSAGE_REPEATER_LONG_PRESS_MENU);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isReplyKey(String str) {
        if (str != null) {
            return str.contains("reply") || str.contains("quote");
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isReplyLikeMessage(Object obj, Object obj2, boolean z) {
        if (z || hasReplyMetadata(obj2, 0)) {
            return true;
        }
        return obj != obj2 && hasReplyMetadata(obj, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isSafeRepeaterIconCandidate(ImageView imageView, int i) {
        if (imageView != null && isReasonableRepeaterSize(imageView)) {
            String lowerCase = viewChainText(imageView, 6).toLowerCase(Locale.US);
            if (!lowerCase.contains("bubble") && !lowerCase.contains("content") && !lowerCase.contains("text") && !lowerCase.contains("pic") && !lowerCase.contains("file") && !lowerCase.contains("avatar") && hasRepeaterCue(imageView) && i >= 40) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object kernelMsgService(ClassLoader classLoader, Object obj) {
        Method methodFindMethod;
        if (obj == null) {
            return null;
        }
        try {
            Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.qqnt.kernel.api.IKernelService", classLoader);
            if (clsFindClassIfExists != null && (methodFindMethod = findMethod(obj.getClass(), "getRuntimeService", 2)) != null) {
                methodFindMethod.setAccessible(true);
                Object objCall = call(methodFindMethod.invoke(obj, clsFindClassIfExists, ""), "getMsgService");
                Object objFindReturnByName = findReturnByName(objCall, "IKernelMsgService");
                if (objFindReturnByName != null) {
                    return objFindReturnByName;
                }
                Object objCall2 = call(objCall, "getService");
                if (objCall2 != null) {
                    return objCall2;
                }
                if (objCall != null) {
                    return objCall;
                }
            }
        } catch (Throwable th) {
            AbstractC0000a.m3d(unwrap(th), new StringBuilder("repeater send failed reason=kernel service "), ": ");
        }
        return kernelMsgService(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void logContactDetails(Object obj) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            try {
                name = obj.getClass().getName();
            } catch (Throwable th) {
                AbstractC0000a.m3d(th, new StringBuilder("repeater contact probe failed reason="), ": ");
                return;
            }
        }
        HookEntry.log("repeater contact found class=" + name + " chatType=" + contactChatType(obj) + " peerUid=" + safeProbe(contactPeer(obj)) + " guildId=" + safeProbe(contactGuild(obj)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void logFail(String str) {
        HookEntry.log("repeater send failed reason=" + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void logFollowProbe(Object obj, Object[] objArr, Object obj2) {
        String name;
        String name2 = "null";
        if (obj == null) {
            name = "null";
        } else {
            try {
                name = obj.getClass().getName();
            } catch (Throwable th) {
                AbstractC0000a.m3d(th, new StringBuilder("repeater follow probe failed reason="), ": ");
                return;
            }
        }
        if (obj2 != null) {
            name2 = obj2.getClass().getName();
        }
        if (shouldLogFollowProbe(name + "|" + name2)) {
            HookEntry.log("repeater follow probe ownerClass=" + name + " msgItemClass=" + name2 + " args=" + describeArgs(objArr) + " ownerFields=" + describeInterestingFields(obj) + " msgFields=" + describeInterestingFields(obj2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void logMsgDetails(Object obj) {
        HookEntry.log("repeater msg found msgId=" + msgId(obj));
        HookEntry.log("repeater msg text=" + safeProbe(msgText(obj)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void logSendCallback(Method method, Object[] objArr) {
        Integer numFirstIntArg = firstIntArg(objArr);
        if (numFirstIntArg == null || numFirstIntArg.intValue() == 0) {
            HookEntry.log("repeater send success");
            return;
        }
        HookEntry.log("repeater send failed reason=callback " + method.getName() + " code=" + numFirstIntArg + " args=" + describeArgs(objArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static long longValue(Object obj, long j) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj != null) {
            String strTrim = String.valueOf(obj).trim();
            if (strTrim.length() != 0) {
                try {
                    return Long.parseLong(strTrim);
                } catch (Throwable unused) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < strTrim.length(); i++) {
                        char cCharAt = strTrim.charAt(i);
                        if (cCharAt >= '0' && cCharAt <= '9') {
                            sb.append(cCharAt);
                        }
                    }
                    if (sb.length() != 0) {
                        try {
                            return Long.parseLong(sb.toString());
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String messageIdFromText(String str) {
        if (str != null && str.length() != 0) {
            String[] strArr = {"msgId", "msgUid", "msgSeq", "shmsgseq", "uniseq", "msgseq"};
            for (int i = 0; i < 6; i++) {
                String strValueAfterKey = valueAfterKey(str, strArr[i]);
                if (strValueAfterKey.length() > 0) {
                    return strValueAfterKey;
                }
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String methodSig(Method method) {
        if (method == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        sb.append('(');
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(parameterTypes[i].getName());
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static List<Method> methodsNamed(Class<?> cls, String str) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (!Modifier.isAbstract(method.getModifiers()) && str.equals(method.getName())) {
                    arrayList.add(method);
                }
            }
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String msgId(Object obj) {
        String strFirstString = firstString(obj, "msgId", "msgUid", "uniseq", "msgseq", "msgSeq", "msgRandom", "shmsgseq");
        if (strFirstString.length() > 0) {
            return strFirstString;
        }
        if (obj == null) {
            return "";
        }
        return obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static long msgIdLong(Object obj, Object obj2) {
        long jLongValue = longValue(call(obj, "getMsgId"), 0L);
        if (jLongValue > 0) {
            return jLongValue;
        }
        long jLongValue2 = longValue(firstObject(obj2, "msgId", "msgUid", "msgSeq", "shmsgseq"), 0L);
        return jLongValue2 > 0 ? jLongValue2 : longValue(firstObject(obj, "msgId", "msgUid", "msgSeq", "shmsgseq"), 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static Object msgRecordFromAny(Object obj) {
        Object objFindMsgRecordByText;
        Map<Object, Object> map = AIO_MSG_RECORDS;
        synchronized (map) {
            try {
                Object obj2 = map.get(obj);
                if (obj2 != null) {
                    return obj2;
                }
                if ((obj instanceof CharSequence) && (objFindMsgRecordByText = findMsgRecordByText(String.valueOf(obj))) != null) {
                    return objFindMsgRecordByText;
                }
                Object objM1097p = AbstractC0497v4.m1097p(obj);
                return objM1097p != null ? objM1097p : findMsgRecordLike(obj, 0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String msgText(Object obj) {
        String strFirstString = firstString(obj, "msg", "msgText", "message", "content", "summary", "msgContent", "text");
        if (strFirstString.length() > 0) {
            return normalizeExtractedText(strFirstString);
        }
        Object objCall = call(obj, "getMsg");
        if (objCall == null) {
            objCall = call(obj, "getMsgText");
        }
        if (objCall == null) {
            objCall = call(obj, "getSummary");
        }
        String strStringOf = stringOf(objCall);
        if (strStringOf.length() > 0) {
            return normalizeExtractedText(strStringOf);
        }
        List listElementsFromMsg = elementsFromMsg(obj);
        if (listElementsFromMsg == null || listElementsFromMsg.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int iMin = Math.min(listElementsFromMsg.size(), 12);
        for (int i = 0; i < iMin; i++) {
            String strTextFromElement = textFromElement(listElementsFromMsg.get(i), 0);
            if (strTextFromElement.length() != 0) {
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append(strTextFromElement);
                if (sb.length() > 240) {
                    break;
                }
            }
        }
        return normalizeExtractedText(sb.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object newContact(Class<?> cls, int i, String str, String str2) {
        try {
            for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                constructor.setAccessible(true);
                int length = parameterTypes.length;
                Class<?> cls2 = Integer.TYPE;
                if (length == 3 && parameterTypes[0] == cls2 && parameterTypes[1] == String.class && parameterTypes[2] == String.class) {
                    Integer numValueOf = Integer.valueOf(i);
                    if (str2 == null) {
                        str2 = "";
                    }
                    return constructor.newInstance(numValueOf, str, str2);
                }
                if (parameterTypes.length == 3 && parameterTypes[0] == String.class && parameterTypes[1] == String.class && parameterTypes[2] == cls2) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    return constructor.newInstance(str, str2, Integer.valueOf(i));
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object newContactFromData(ClassLoader classLoader, int i, String str, String str2) {
        if (str != null && str.length() != 0) {
            String[] strArr = {"com.tencent.qqnt.kernel.nativeinterface.Contact", "com.tencent.qqnt.kernelpublic.nativeinterface.Contact"};
            for (int i2 = 0; i2 < 2; i2++) {
                try {
                    Class<?> clsFindClass = XposedHelpers.findClass(strArr[i2], classLoader);
                    Object objNewContact = newContact(clsFindClass, i, str, str2);
                    if (objNewContact != null) {
                        return objNewContact;
                    }
                    Object objNewInstance = clsFindClass.newInstance();
                    setAny(objNewInstance, str, "peerUid", "uin", "uid", "peerUin");
                    setAny(objNewInstance, str2, "guildId", "guildID");
                    setAny(objNewInstance, Integer.valueOf(i), "chatType", "type");
                    return objNewInstance;
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object newGetMsgsCallback(ClassLoader classLoader, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        try {
            return Proxy.newProxyInstance(classLoader == null ? MessageRepeater.class.getClassLoader() : classLoader, new Class[]{findAnyClass(classLoader, "com.tencent.qqnt.kernelpublic.nativeinterface.IMsgOperateCallback", "com.tencent.qqnt.kernel.nativeinterface.IMsgOperateCallback")}, new C0162p(classLoader, obj4, obj, obj2, obj3, z));
        } catch (Throwable th) {
            AbstractC0000a.m3d(th, new StringBuilder("repeater send failed reason=getMsgs callback "), ": ");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String normalizeExtractedText(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        int iM616g1 = AbstractC0260i5.m616g1(str);
        if (iM616g1 >= 3) {
            try {
                String str2 = new String(str.getBytes(Charset.forName("GBK")), StandardCharsets.UTF_8);
                if (str2.length() != 0 && str2.indexOf(65533) < 0 && AbstractC0260i5.m616g1(str2) < iM616g1) {
                    HookEntry.log("repeater msg text normalized");
                    return str2;
                }
            } catch (Throwable th) {
                AbstractC0198e7.m343a("message-repeater", "text-normalize", th);
                return str;
            }
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static synchronized void onRuntimeSettingsChanged(ClassLoader classLoader) {
        try {
            if (!HookEntry.runtimeBool(Prefs.KEY_MESSAGE_REPEATER)) {
                unhookMessageFollowRepeater();
            } else if (sInstalled && !sFollowHookInstalled && classLoader != null) {
                hookMessageFollowRepeater(classLoader);
            }
            if (isRepeaterCaptureEnabled()) {
                return;
            }
            Map<Object, Object> map = AIO_MSG_RECORDS;
            synchronized (map) {
                map.clear();
            }
            Map<String, Object> map2 = AIO_MSG_RECORD_BY_ID;
            synchronized (map2) {
                map2.clear();
            }
            Map<Object, WeakReference<ImageView>> map3 = REPEATER_ICON_CACHE;
            synchronized (map3) {
                map3.clear();
            }
            Map<String, Long> map4 = FOLLOW_PROBE_LOGS;
            synchronized (map4) {
                map4.clear();
            }
            sAioParam = null;
            sLastSendContact = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object qRouteApi(ClassLoader classLoader, String str) {
        try {
            Class<?> clsFindClass = XposedHelpers.findClass("com.tencent.mobileqq.qroute.QRoute", classLoader);
            Class<?> clsFindClass2 = XposedHelpers.findClass(str, classLoader);
            Method declaredMethod = clsFindClass.getDeclaredMethod("api", Class.class);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, clsFindClass2);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object qRouteMsgService(ClassLoader classLoader) {
        return qRouteApi(classLoader, "com.tencent.qqnt.msg.api.IMsgService");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object refreshBindingKey(View view) {
        return AbstractC0552yb.m1170a(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void rememberAioMsgRecord(Object obj, Object obj2) {
        boolean z;
        if (obj == null || obj2 == null) {
            return;
        }
        Map<Object, Object> map = AIO_MSG_RECORDS;
        synchronized (map) {
            try {
                z = map.get(obj) != obj2;
                if (z) {
                    map.put(obj, obj2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            rememberMsgRecordId(obj2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void rememberAioParam(Object obj, Class<?> cls) {
        if (obj == null || cls == null) {
            return;
        }
        try {
            if (cls.isInstance(obj)) {
                sAioParam = obj;
                return;
            }
            Object objM1093l = AbstractC0497v4.m1093l(obj, AIO_PARAM_CLASS, 2);
            if (objM1093l == null || !cls.isInstance(objM1093l)) {
                return;
            }
            sAioParam = objM1093l;
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void rememberAioParamFromArgs(Object[] objArr, Class<?> cls) {
        if (objArr == null) {
            return;
        }
        for (Object obj : objArr) {
            rememberAioParam(obj, cls);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void rememberIconVisualState(ImageView imageView, String str, boolean z) {
        if (imageView == null || str == null) {
            return;
        }
        boolean z2 = false;
        try {
            boolean z3 = imageView.getVisibility() == 0;
            if (z3 && z) {
                if (imageView.getAlpha() <= 0.05f) {
                }
            } else if (!z3) {
                z2 = z3;
            } else if (imageView.getAlpha() >= 0.45f && imageView.getDrawable() != null) {
                z2 = true;
            }
        } catch (Throwable unused) {
        }
        WeakHashMap weakHashMap = AbstractC0552yb.f1108c;
        synchronized (weakHashMap) {
            try {
                if (z2) {
                    weakHashMap.put(imageView, str);
                } else {
                    weakHashMap.remove(imageView);
                }
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void rememberMsgRecordId(Object obj) {
        if (obj == null) {
            return;
        }
        String strMsgId = msgId(obj);
        if (strMsgId.length() == 0 || strMsgId.indexOf(64) >= 0) {
            return;
        }
        Map<String, Object> map = AIO_MSG_RECORD_BY_ID;
        synchronized (map) {
            map.put(strMsgId, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void rememberSendContact(Object obj) {
        if (isLikelyContact(obj)) {
            sLastSendContact = obj;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - sLastSendContactLogAt > 60000) {
                sLastSendContactLogAt = jCurrentTimeMillis;
                HookEntry.log("send contact captured class=" + obj.getClass().getName() + " chatType=" + contactChatType(obj));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void removeCachedRepeaterImageView(Object obj) {
        if (obj == null) {
            return;
        }
        Map<Object, WeakReference<ImageView>> map = REPEATER_ICON_CACHE;
        synchronized (map) {
            map.remove(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void repeat(ClassLoader classLoader, Context context, Object obj, boolean z) {
        ClassLoader classLoader2;
        HookEntry.log("repeater send start");
        try {
            Object objMsgRecordFromAny = msgRecordFromAny(obj);
            if (objMsgRecordFromAny == null) {
                logFail("message record null");
                return;
            }
            logMsgDetails(objMsgRecordFromAny);
            Object objContactFromMsg = contactFromMsg(classLoader, objMsgRecordFromAny);
            if (objContactFromMsg == null) {
                objContactFromMsg = contactFromAioParam(classLoader, sAioParam);
            }
            Object obj2 = objContactFromMsg;
            if (obj2 == null) {
                logFail("contact unresolved");
                return;
            }
            logContactDetails(obj2);
            Object objAppRuntime = appRuntime(classLoader);
            Object objKernelMsgService = kernelMsgService(classLoader, objAppRuntime);
            if (objKernelMsgService == null) {
                objKernelMsgService = kernelMsgService(objAppRuntime);
            }
            if (objKernelMsgService == null) {
                objKernelMsgService = qRouteMsgService(classLoader);
            }
            Object obj3 = objKernelMsgService;
            if (obj3 == null) {
                logFail("kernel message service unresolved");
                return;
            }
            boolean zIsReplyLikeMessage = isReplyLikeMessage(obj, objMsgRecordFromAny, z);
            if (zIsReplyLikeMessage) {
                HookEntry.log("repeater reply message detected, structured resend");
            }
            boolean zIsPlainTextMessage = isPlainTextMessage(objMsgRecordFromAny);
            if (!zIsReplyLikeMessage && zIsPlainTextMessage && sendResolvedMessage(classLoader, obj3, objAppRuntime, obj2, objMsgRecordFromAny)) {
                return;
            }
            long jMsgIdLong = msgIdLong(obj, objMsgRecordFromAny);
            if (jMsgIdLong > 0) {
                classLoader2 = classLoader;
                boolean zInvokeGetMsgsByMsgId = invokeGetMsgsByMsgId(classLoader2, obj3, objAppRuntime, obj2, jMsgIdLong, objMsgRecordFromAny, zIsReplyLikeMessage);
                objMsgRecordFromAny = objMsgRecordFromAny;
                if (zInvokeGetMsgsByMsgId) {
                    return;
                }
            } else {
                classLoader2 = classLoader;
            }
            if (zIsReplyLikeMessage) {
                sendResolvedMessage(classLoader2, obj3, objAppRuntime, obj2, objMsgRecordFromAny, true);
            } else if (zIsPlainTextMessage) {
                sendResolvedMessage(classLoader2, obj3, objAppRuntime, obj2, objMsgRecordFromAny);
            } else {
                logFail("non-text message refresh unresolved");
            }
        } catch (Throwable th) {
            logFail(th.getClass().getSimpleName() + ": " + th.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void repeatAsync(ClassLoader classLoader, Context context, Object obj, boolean z) {
        Thread thread = new Thread(new RunnableC0160n(classLoader, context, obj, z), "Elaris-repeater-send");
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void repeatAsyncSmart(ClassLoader classLoader, Context context, Object obj, boolean z) {
        int iContactChatType;
        Object obj2 = sAioParam;
        C0534x9 c0534x9 = null;
        try {
            Object objMsgRecordFromAny = msgRecordFromAny(obj);
            if (objMsgRecordFromAny != null && !isReplyLikeMessage(obj, objMsgRecordFromAny, z) && isPlainTextMessage(objMsgRecordFromAny)) {
                String strMsgText = msgText(objMsgRecordFromAny);
                if (strMsgText.length() != 0) {
                    Object objContactFromMsg = contactFromMsg(classLoader, objMsgRecordFromAny);
                    if (objContactFromMsg == null) {
                        objContactFromMsg = contactFromAioParam(classLoader, obj2);
                    }
                    if (objContactFromMsg != null && ((iContactChatType = contactChatType(objContactFromMsg)) == 1 || iContactChatType == 2)) {
                        String strContactPeer = contactPeer(objContactFromMsg);
                        if (strContactPeer.length() != 0) {
                            c0534x9 = new C0534x9(iContactChatType, strContactPeer, contactGuild(objContactFromMsg), strMsgText, msgId(objMsgRecordFromAny));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            AbstractC0000a.m3d(th, new StringBuilder("repeater text snapshot skipped reason="), ": ");
        }
        if (c0534x9 != null) {
            repeatTextAsync(classLoader, c0534x9);
        } else {
            repeatAsync(classLoader, context, obj, z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void repeatFromLongPressMenu(ClassLoader classLoader, Context context, Object obj) {
        repeatFromLongPressMenu(classLoader, context, obj, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void repeatTextAsync(ClassLoader classLoader, C0534x9 c0534x9) {
        Thread thread = new Thread(new RunnableC0161o(classLoader, c0534x9), "Elaris-repeater-send");
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int repeaterIconScore(ImageView imageView) {
        int i;
        if (imageView == null) {
            return Integer.MIN_VALUE;
        }
        try {
            i = imageView.getVisibility() == 0 ? 24 : -24;
        } catch (Throwable unused) {
            i = 0;
        }
        try {
            i += imageView.getAlpha() >= 0.45f ? 12 : -12;
        } catch (Throwable unused2) {
        }
        try {
            i += imageView.getDrawable() != null ? 26 : -20;
        } catch (Throwable unused3) {
        }
        int iViewSize = viewSize(imageView, true);
        int iViewSize2 = viewSize(imageView, false);
        int iM174dp = m174dp(imageView, 14.0f);
        int iM174dp2 = m174dp(imageView, 60.0f);
        if (iViewSize >= iM174dp && iViewSize2 >= iM174dp && iViewSize <= iM174dp2 && iViewSize2 <= iM174dp2) {
            i += 14;
        } else if (iViewSize > iM174dp2 || iViewSize2 > iM174dp2) {
            i -= 80;
        }
        String lowerCase = viewChainText(imageView, 5).toLowerCase(Locale.US);
        String strViewCueText = viewCueText(imageView);
        if (hasRepeaterCue(imageView)) {
            i += 80;
        }
        if (lowerCase.contains("follow") || lowerCase.contains("plus") || lowerCase.contains("repeat")) {
            i += 18;
        }
        if (lowerCase.contains("bubble") || lowerCase.contains("content") || lowerCase.contains("text") || lowerCase.contains("pic") || lowerCase.contains("file") || lowerCase.contains("avatar")) {
            i -= 60;
        }
        return (strViewCueText.contains("avatar") || strViewCueText.contains("head")) ? i - 30 : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String repeaterVisualState(boolean z, String str) {
        return z ? "hidden" : (str == null || str.length() <= 0) ? "default" : "custom:".concat(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Drawable resolveCustomIcon(ImageView imageView, String str) {
        if (str == null || str.length() <= 0) {
            sCustomIconPath = null;
            sCustomIconBitmap = null;
        } else {
            Bitmap bitmap = sCustomIconBitmap;
            if (bitmap != null && str.equals(sCustomIconPath)) {
                return new BitmapDrawable(imageView.getResources(), bitmap);
            }
            try {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
                if (bitmapDecodeFile != null) {
                    sCustomIconPath = str;
                    sCustomIconBitmap = bitmapDecodeFile;
                    HookEntry.log("repeater icon loaded resource=custom-local");
                    return new BitmapDrawable(imageView.getResources(), bitmapDecodeFile);
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Drawable resolveDefaultIcon(ImageView imageView) {
        float f;
        if (imageView != null) {
            try {
                f = imageView.getResources() != null ? imageView.getResources().getDisplayMetrics().density : 1.0f;
            } catch (Throwable th) {
                AbstractC0000a.m3d(th, new StringBuilder("repeater icon default failed reason="), ": ");
                return null;
            }
        }
        if (!sDefaultIconLogged) {
            synchronized (MessageRepeater.class) {
                try {
                    if (!sDefaultIconLogged) {
                        sDefaultIconLogged = true;
                        HookEntry.log("repeater icon loaded resource=elaris-default-plus-one");
                    }
                } finally {
                }
            }
        }
        return new C0518w9(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String safeProbe(Object obj) {
        String strReplace = (obj == null ? "" : String.valueOf(obj)).replace('\r', ' ').replace('\n', ' ').replace('\t', ' ');
        return strReplace.length() > 240 ? strReplace.substring(0, 240).concat("...") : strReplace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void scheduleAioMessageRefresh(View view) {
        Object objRefreshBindingKey;
        View view2;
        long jCurrentTimeMillis;
        if (view == null || (objRefreshBindingKey = refreshBindingKey(view)) == null) {
            return;
        }
        View view3 = view;
        int i = 0;
        while (i < 14 && view3 != null) {
            try {
                Object parent = view3.getParent();
                boolean z = parent instanceof View;
                if ((z && AbstractC0486u9.m1064q((View) parent)) || !z) {
                    break;
                }
                View view4 = (View) parent;
                if (AbstractC0486u9.m1064q(view4)) {
                    break;
                }
                i++;
                view3 = view4;
            } catch (Throwable unused) {
            }
        }
        if (view3 == null) {
            view3 = view;
        }
        view2 = view;
        int i2 = 0;
        while (true) {
            if (i2 >= 16 || view2 == null) {
                break;
            }
            if (AbstractC0486u9.m1064q(view2)) {
                break;
            }
            try {
                Object parent2 = view2.getParent();
                if (!(parent2 instanceof View)) {
                    break;
                }
                view2 = (View) parent2;
                i2++;
            } catch (Throwable unused2) {
            }
        }
        C0527x2 c0527x2 = new C0527x2();
        c0527x2.m1130b(view3, 0, Collections.newSetFromMap(new IdentityHashMap()));
        AbstractC0302kc.m744b(view, "aio-refresh", new long[]{80, 220, 520, 1100, 1800, 2600, 3600}, new C0165s(view, objRefreshBindingKey), new C0520wb(((ArrayList) c0527x2.f1027a).isEmpty() ? null : c0527x2, view3, view2));
        jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - AbstractC0486u9.f950a >= 3000) {
            return;
        }
        AbstractC0486u9.f950a = jCurrentTimeMillis;
        HookEntry.log("repeater aio row refresh scheduled");
        return;
        view2 = null;
        C0527x2 c0527x22 = new C0527x2();
        c0527x22.m1130b(view3, 0, Collections.newSetFromMap(new IdentityHashMap()));
        AbstractC0302kc.m744b(view, "aio-refresh", new long[]{80, 220, 520, 1100, 1800, 2600, 3600}, new C0165s(view, objRefreshBindingKey), new C0520wb(((ArrayList) c0527x22.f1027a).isEmpty() ? null : c0527x22, view3, view2));
        jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - AbstractC0486u9.f950a >= 3000) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean sendGeneratedElements(ClassLoader classLoader, int i, String str, String str2, ArrayList arrayList, String str3, String str4) {
        String strTrim;
        boolean zAwait;
        if (str == null) {
            strTrim = "";
        } else {
            try {
                strTrim = str.trim();
            } catch (Throwable th) {
                Throwable thUnwrap = unwrap(th);
                StringBuilder sb = new StringBuilder();
                sb.append(str4);
                sb.append(" send failed reason=");
                AbstractC0000a.m3d(thUnwrap, sb, ": ");
            }
        }
        if (i != 1 && i != 2) {
            HookEntry.log(str4 + " send skipped reason=unsupported chatType=" + i);
            return false;
        }
        if (strTrim.length() == 0) {
            HookEntry.log(str4 + " send skipped reason=empty target");
            return false;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            String strTrim2 = "";
            Object objAppRuntime = appRuntime(classLoader);
            if (objAppRuntime == null) {
                HookEntry.log(str4 + " send failed reason=runtime null");
                return false;
            }
            Object objKernelMsgService = kernelMsgService(classLoader, objAppRuntime);
            if (objKernelMsgService == null) {
                objKernelMsgService = kernelMsgService(objAppRuntime);
            }
            if (objKernelMsgService == null) {
                objKernelMsgService = qRouteMsgService(classLoader);
            }
            if (objKernelMsgService == null) {
                HookEntry.log(str4 + " send failed reason=msg service null");
                return false;
            }
            if (str2 != null) {
                strTrim2 = str2.trim();
            }
            Object objNewContactFromData = newContactFromData(classLoader, i, strTrim, strTrim2);
            if (objNewContactFromData == null) {
                HookEntry.log(str4 + " send failed reason=contact null chatType=" + i);
                return false;
            }
            HookEntry.log(str4 + " send start chatType=" + i + " peer=" + safeProbe(strTrim));
            C0550y9 c0550y9 = new C0550y9(str4);
            if (!invokeSend(classLoader, objKernelMsgService, objAppRuntime, objNewContactFromData, arrayList, new HashMap(), c0550y9)) {
                HookEntry.log(str4 + " send failed reason=sendMsg method unresolved");
                return false;
            }
            try {
                zAwait = c0550y9.f1102b.await(Math.max(1L, PLAIN_TEXT_CALLBACK_WAIT_MS), TimeUnit.MILLISECONDS);
            } catch (Throwable th2) {
                c0550y9.f1105e = "callback wait interrupted";
                AbstractC0198e7.m343a("repeater", "callback-wait", th2);
                Thread.currentThread().interrupt();
                zAwait = false;
            }
            if (zAwait && c0550y9.f1103c && c0550y9.f1104d) {
                return true;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            sb2.append(" send failed reason=");
            sb2.append(zAwait ? (c0550y9.f1105e == null || c0550y9.f1105e.length() <= 0) ? c0550y9.f1103c ? "callback failed" : "callback missing" : c0550y9.f1105e : "callback timeout");
            HookEntry.logAlways(sb2.toString());
            return false;
        }
        HookEntry.log(str4 + " send failed reason=" + str3);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean sendPlainText(ClassLoader classLoader, int i, String str, String str2, String str3, String str4) {
        if (str4 == null || str4.length() == 0) {
            str4 = "plain-text";
        }
        String str5 = str4;
        if (str3 == null) {
            str3 = "";
        }
        if (str3.trim().length() != 0) {
            return sendGeneratedElements(classLoader, i, str, str2, textElementsFromText(classLoader, str3, str5), "text element empty", str5);
        }
        HookEntry.log(str5.concat(" send skipped reason=empty text"));
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean sendResolvedMessage(ClassLoader classLoader, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        ClassLoader classLoader2;
        Object obj5;
        Object obj6;
        Object obj7;
        ArrayList arrayListFreshTextElements = z ? null : freshTextElements(classLoader, obj4);
        if (arrayListFreshTextElements == null || arrayListFreshTextElements.isEmpty()) {
            classLoader2 = classLoader;
            obj5 = obj;
            obj6 = obj2;
            obj7 = obj3;
        } else {
            classLoader2 = classLoader;
            obj5 = obj;
            obj6 = obj2;
            obj7 = obj3;
            if (invokeSend(classLoader2, obj5, obj6, obj7, arrayListFreshTextElements, null)) {
                return true;
            }
        }
        if (!z && isPlainTextMessage(obj4)) {
            logFail("text element unresolved");
            return false;
        }
        Map mapAttrsFromMsg = attrsFromMsg(obj4);
        List listElementsFromMsg = elementsFromMsg(obj4);
        if (listElementsFromMsg == null || listElementsFromMsg.isEmpty()) {
            logFail("message elements empty");
            return false;
        }
        if (z && !hasSendableReplyStructure(listElementsFromMsg, mapAttrsFromMsg)) {
            logFail("reply structure unresolved");
            return false;
        }
        if (invokeSend(classLoader2, obj5, obj6, obj7, !(listElementsFromMsg instanceof ArrayList) ? new ArrayList(listElementsFromMsg) : listElementsFromMsg, mapAttrsFromMsg)) {
            return true;
        }
        logFail("sendMsg method unresolved");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void setAny(Object obj, Object obj2, String... strArr) {
        if (obj == null) {
            return;
        }
        for (String str : strArr) {
            Field fieldFindField = findField(obj.getClass(), str);
            if (fieldFindField != null) {
                try {
                    fieldFindField.setAccessible(true);
                    if (fieldFindField.getType() == Integer.TYPE && (obj2 instanceof Number)) {
                        fieldFindField.setInt(obj, ((Number) obj2).intValue());
                    } else {
                        fieldFindField.set(obj, obj2);
                    }
                    return;
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldLogBindSuccess() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (MessageRepeater.class) {
            try {
                if (jCurrentTimeMillis - sBindSuccessLogWindowAt > 15000) {
                    sBindSuccessLogWindowAt = jCurrentTimeMillis;
                    sBindSuccessLogCount = 0;
                }
                if (sBindSuccessLogCount >= 1) {
                    return false;
                }
                sBindSuccessLogCount++;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean shouldLogFollowProbe(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, Long> map = FOLLOW_PROBE_LOGS;
        synchronized (map) {
            try {
                Long l = map.get(str);
                if (l != null && jCurrentTimeMillis - l.longValue() < PLAIN_TEXT_CALLBACK_WAIT_MS) {
                    return false;
                }
                map.put(str, Long.valueOf(jCurrentTimeMillis));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldTriggerRepeat(ImageView imageView, View view) {
        if (!Prefs.REPEATER_MODE_DOUBLE.equals(HookEntry.runtimeString(Prefs.KEY_MESSAGE_REPEATER_MODE, Prefs.REPEATER_MODE_SINGLE))) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        WeakHashMap weakHashMap = AbstractC0552yb.f1109d;
        synchronized (weakHashMap) {
            Long l = (Long) weakHashMap.get(imageView);
            if (l == null || jCurrentTimeMillis - l.longValue() > 450) {
                weakHashMap.put(imageView, Long.valueOf(jCurrentTimeMillis));
                HookEntry.log("repeater double click armed");
                return false;
            }
            weakHashMap.remove(imageView);
            HookEntry.log("repeater double click trigger");
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String stringOf(Object obj) {
        if (obj == null) {
            return "";
        }
        String strTrim = String.valueOf(obj).trim();
        return (strTrim.length() == 0 || "null".equalsIgnoreCase(strTrim)) ? "" : strTrim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static ArrayList textElementsFromText(ClassLoader classLoader, String str, String str2) {
        Object objQRouteApi;
        if (str != null && str.length() != 0 && (objQRouteApi = qRouteApi(classLoader, "com.tencent.qqnt.msg.api.IMsgUtilApi")) != null) {
            try {
                Method method = objQRouteApi.getClass().getMethod("createTextElement", String.class);
                method.setAccessible(true);
                Object objInvoke = method.invoke(objQRouteApi, str);
                if (objInvoke != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(objInvoke);
                    HookEntry.log((str2 == null ? "text" : str2).concat(" text element created via IMsgUtilApi"));
                    return arrayList;
                }
            } catch (Throwable th) {
                Throwable thUnwrap = unwrap(th);
                StringBuilder sb = new StringBuilder();
                if (str2 == null) {
                    str2 = "text";
                }
                sb.append(str2);
                sb.append(" send failed reason=createTextElement ");
                sb.append(thUnwrap.getClass().getSimpleName());
                sb.append(": ");
                sb.append(thUnwrap.getMessage());
                HookEntry.log(sb.toString());
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String textFromElement(Object obj, int i) {
        if (obj != null && i <= 4) {
            if (obj instanceof CharSequence) {
                return String.valueOf(obj);
            }
            if (!(obj instanceof Number) && !(obj instanceof Boolean)) {
                String strStringOf = stringOf(call(obj, "getContent"));
                if (strStringOf.length() > 0) {
                    return strStringOf;
                }
                String strStringOf2 = stringOf(call(obj, "getText"));
                if (strStringOf2.length() > 0) {
                    return strStringOf2;
                }
                int i2 = i + 1;
                String strTextFromElement = textFromElement(call(obj, "getTextElement"), i2);
                if (strTextFromElement.length() > 0) {
                    return strTextFromElement;
                }
                String strTextFromElement2 = textFromElement(firstObject(obj, "textElement", "text", "content", "msg", "summary", "arkElement", "structMsgElement"), i2);
                if (strTextFromElement2.length() > 0) {
                    return strTextFromElement2;
                }
                for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    for (Field field : superclass.getDeclaredFields()) {
                        if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive()) {
                            String lowerCase = field.getName().toLowerCase();
                            if (lowerCase.contains("text") || lowerCase.contains("content") || lowerCase.contains("summary")) {
                                try {
                                    field.setAccessible(true);
                                    String strTextFromElement3 = textFromElement(field.get(obj), i2);
                                    if (strTextFromElement3.length() > 0) {
                                        return strTextFromElement3;
                                    }
                                } catch (Throwable unused) {
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void unhookMessageFollowRepeater() {
        int i;
        if (sFollowHookInstalled || !FOLLOW_UNHOOKS.isEmpty()) {
            List<XC_MethodHook.Unhook> list = FOLLOW_UNHOOKS;
            synchronized (list) {
                try {
                    Iterator<XC_MethodHook.Unhook> it = list.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        try {
                            it.next().unhook();
                            i++;
                        } catch (Throwable th) {
                            AbstractC0198e7.m343a("message-repeater", "unhook-follow", th);
                        }
                    }
                    FOLLOW_UNHOOKS.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            sFollowHookInstalled = false;
            Map<Object, WeakReference<ImageView>> map = REPEATER_ICON_CACHE;
            synchronized (map) {
                map.clear();
            }
            if (i > 0) {
                HookEntry.log("repeater follow hooks uninstalled count=" + i);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object uniqueIdArg(Class<?> cls, Object obj, Object obj2, Object obj3) {
        long jUniqueLong = uniqueLong(obj, obj2, obj3);
        return (cls == Long.TYPE || cls == Long.class) ? Long.valueOf(jUniqueLong) : (cls == Integer.TYPE || cls == Integer.class) ? Integer.valueOf((int) (jUniqueLong & 2147483647L)) : cls == String.class ? String.valueOf(jUniqueLong) : String.valueOf(jUniqueLong);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static long uniqueLong(Object obj, Object obj2, Object obj3) {
        Long lGenerateMsgUniqueId = generateMsgUniqueId(obj2, obj3);
        if (lGenerateMsgUniqueId != null && lGenerateMsgUniqueId.longValue() != 0) {
            return lGenerateMsgUniqueId.longValue();
        }
        Object objCall = call(obj, "getCurrentAccountUin");
        if (objCall == null) {
            objCall = call(obj, "getCurrentAccountUid");
        }
        return (System.currentTimeMillis() << 20) ^ ((objCall != null ? String.valueOf(objCall).hashCode() : 0L) & 1048575);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static Throwable unwrap(Throwable th) {
        if (th instanceof InvocationTargetException) {
            InvocationTargetException invocationTargetException = (InvocationTargetException) th;
            if (invocationTargetException.getTargetException() != null) {
                return invocationTargetException.getTargetException();
            }
        }
        return th == null ? new IllegalStateException("unknown") : th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String valueAfterKey(String str, String str2) {
        int iIndexOf;
        if (str == null || str2 == null || str2.length() == 0 || (iIndexOf = str.indexOf(str2)) < 0) {
            return "";
        }
        int length = str2.length() + iIndexOf;
        int length2 = str.length();
        while (length < length2) {
            char cCharAt = str.charAt(length);
            if (cCharAt != ':' && cCharAt != '=' && !Character.isWhitespace(cCharAt)) {
                break;
            }
            length++;
        }
        int i = length;
        while (i < length2) {
            char cCharAt2 = str.charAt(i);
            if (!Character.isLetterOrDigit(cCharAt2) && cCharAt2 != '_' && cCharAt2 != '-') {
                break;
            }
            i++;
        }
        if (i > length) {
            return str.substring(length, i).trim();
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String viewChainText(View view, int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        Object parent = view;
        while (parent instanceof View) {
            int i3 = i2 + 1;
            if (i2 >= i) {
                break;
            }
            View view2 = (View) parent;
            if (sb.length() > 0) {
                sb.append(" <- ");
            }
            sb.append(view2.getClass().getName());
            try {
                Object tag = view2.getTag();
                if (tag != null) {
                    sb.append(" tag=");
                    sb.append(safeProbe(tag));
                }
            } catch (Throwable unused) {
            }
            try {
                CharSequence contentDescription = view2.getContentDescription();
                if (contentDescription != null) {
                    sb.append(" desc=");
                    sb.append(safeProbe(contentDescription));
                }
            } catch (Throwable unused2) {
            }
            try {
                i2 = i3;
                parent = view2.getParent();
            } catch (Throwable unused3) {
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String viewCueText(View view) {
        if (view == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            Object tag = view.getTag();
            if (tag != null) {
                sb.append(tag);
                sb.append(' ');
            }
        } catch (Throwable unused) {
        }
        try {
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                sb.append(contentDescription);
                sb.append(' ');
            }
        } catch (Throwable unused2) {
        }
        return sb.toString().toLowerCase(Locale.US);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int viewSize(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null) {
            return 0;
        }
        int width = z ? view.getWidth() : view.getHeight();
        if (width <= 0) {
            width = z ? view.getMeasuredWidth() : view.getMeasuredHeight();
        }
        if (width <= 0 && (layoutParams = view.getLayoutParams()) != null) {
            width = z ? layoutParams.width : layoutParams.height;
        }
        return Math.max(0, width);
    }

    public static void repeatFromLongPressMenu(ClassLoader classLoader, Context context, Object obj, boolean z) {
        repeatAsyncSmart(classLoader, context, obj, z);
    }

    private static void repeatAsync(ClassLoader classLoader, Context context, Object obj) {
        repeatAsync(classLoader, context, obj, false);
    }

    private static void repeatAsync(ClassLoader classLoader, Object obj) {
        repeatAsync(classLoader, null, obj);
    }

    private static Object call(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        return call(obj.getClass(), obj, str);
    }

    private static Drawable resolveCustomIcon(ImageView imageView) {
        return resolveCustomIcon(imageView, currentCustomIconPath());
    }

    private static boolean invokeSend(ClassLoader classLoader, Object obj, Object obj2, Object obj3, List list, Map map) {
        return invokeSend(classLoader, obj, obj2, obj3, list, map, null);
    }

    private static Object kernelMsgService(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objCall = call(obj, "getKernelMsgService");
        if (objCall != null) {
            return objCall;
        }
        for (Method method : obj.getClass().getMethods()) {
            if (method.getParameterTypes().length == 0 && method.getName().toLowerCase().contains("msgservice")) {
                try {
                    Object objInvoke = method.invoke(obj, null);
                    if (objInvoke != null) {
                        return objInvoke;
                    }
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void repeatAsyncSmart(ClassLoader classLoader, Context context, Object obj) {
        repeatAsyncSmart(classLoader, context, obj, false);
    }

    private static Object callbackArg(ClassLoader classLoader, Class<?> cls) {
        return callbackArg(classLoader, cls, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean sendResolvedMessage(ClassLoader classLoader, Object obj, Object obj2, Object obj3, Object obj4) {
        return sendResolvedMessage(classLoader, obj, obj2, obj3, obj4, false);
    }

    private static void repeat(ClassLoader classLoader, Context context, Object obj) {
        repeat(classLoader, context, obj, false);
    }

    private static void repeat(ClassLoader classLoader, Object obj) {
        repeat(classLoader, null, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void repeat(ClassLoader classLoader, C0534x9 c0534x9) {
        if (c0534x9 == null) {
            logFail("text snapshot null");
            return;
        }
        String str = c0534x9.f1044b;
        String str2 = c0534x9.f1046d;
        HookEntry.log("repeater send start");
        HookEntry.log("repeater msg found msgId=" + safeProbe(c0534x9.f1047e));
        HookEntry.log("repeater msg text=" + safeProbe(str2));
        HookEntry.log("repeater contact found class=snapshot chatType=" + c0534x9.f1043a + " peerUid=" + safeProbe(str) + " guildId=" + safeProbe(c0534x9.f1045c));
        sendPlainText(classLoader, c0534x9.f1043a, str, c0534x9.f1045c, str2, "repeater");
    }
}
