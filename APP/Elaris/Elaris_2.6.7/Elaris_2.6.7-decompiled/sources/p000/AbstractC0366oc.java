package p000;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: oc */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0366oc {

    /* JADX INFO: renamed from: f */
    public static Handler f657f;

    /* JADX INFO: renamed from: g */
    public static RunnableC0334mc f658g;

    /* JADX INFO: renamed from: h */
    public static long f659h;

    /* JADX INFO: renamed from: a */
    public static final Object f652a = new Object();

    /* JADX INFO: renamed from: b */
    public static final long[] f653b = {60, 220, 520};

    /* JADX INFO: renamed from: c */
    public static volatile boolean f654c = false;

    /* JADX INFO: renamed from: d */
    public static volatile long f655d = 0;

    /* JADX INFO: renamed from: e */
    public static volatile long f656e = 0;

    /* JADX INFO: renamed from: i */
    public static final String[] f660i = {"senderUid", "senderUin", "senderuin", "fromUid", "fromUin", "fromuin", "authorUid", "authorUin", "memberUid", "memberUin"};

    /* JADX INFO: renamed from: j */
    public static final ThreadLocal f661j = new ThreadLocal();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int[] m770a(Spanned spanned) {
        int length = spanned == null ? 0 : spanned.length();
        if (length == 0 || spanned == null) {
            return null;
        }
        int iMin = Math.min(length, 160);
        int i = -1;
        int i2 = -1;
        for (Object obj : spanned.getSpans(0, iMin, Object.class)) {
            if (obj != null) {
                int spanStart = spanned.getSpanStart(obj);
                int spanEnd = spanned.getSpanEnd(obj);
                if (spanStart >= 0 && spanEnd > spanStart + 1 && spanEnd <= iMin && spanStart < length && spanned.charAt(spanStart) == '@') {
                    String lowerCase = obj.getClass().getName().toLowerCase(Locale.US);
                    if ((lowerCase.contains("at") || lowerCase.contains("mention") || lowerCase.contains("uin")) && (i < 0 || spanStart < i)) {
                        i = spanStart;
                        i2 = spanEnd;
                    }
                }
            }
        }
        if (i < 0) {
            return null;
        }
        if (i2 >= 0) {
            int length2 = spanned.length();
            while (i2 < length2) {
                char cCharAt = spanned.charAt(i2);
                if (!Character.isWhitespace(cCharAt) && cCharAt != 8197 && cCharAt != 160) {
                    break;
                }
                i2++;
            }
        }
        return new int[]{i, i2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m771b(Object obj) {
        if (obj != null && !(obj instanceof CharSequence) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof View)) {
            try {
                String lowerCase = obj.getClass().getName().toLowerCase(Locale.US);
                return lowerCase.contains("aio") || lowerCase.contains("msg") || lowerCase.contains("reply") || lowerCase.contains("intent") || lowerCase.contains("record") || lowerCase.contains("item") || lowerCase.contains("contact") || lowerCase.contains("member") || lowerCase.contains("user");
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m772c(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0350nc c0350nc = (C0350nc) arrayList.get(size);
            if (c0350nc != null) {
                AbstractC0513w4.m1121d(c0350nc.f603b, c0350nc.f602a, c0350nc.f604c);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m773d(int i, Object obj) {
        if (!HookEntry.runtimeBool(Prefs.KEY_DISABLE_REPLY_AUTO_AT) || System.currentTimeMillis() <= f656e || !HookEntry.runtimeBool(Prefs.KEY_DISABLE_REPLY_AUTO_AT) || System.currentTimeMillis() <= f656e || System.currentTimeMillis() > f655d || obj == null || i < 0) {
            return;
        }
        if (!(obj instanceof EditText)) {
            if (obj instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) obj;
                int iMin = Math.min(viewGroup.getChildCount(), 80);
                for (int i2 = 0; i2 < iMin; i2++) {
                    m773d(i - 1, viewGroup.getChildAt(i2));
                }
                return;
            }
            if ((obj instanceof CharSequence) || (obj instanceof Number) || (obj instanceof Boolean)) {
                return;
            }
            for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                for (Field field : superclass.getDeclaredFields()) {
                    try {
                        if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive()) {
                            field.setAccessible(true);
                            m773d(i - 1, field.get(obj));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            return;
        }
        EditText editText = (EditText) obj;
        if (System.currentTimeMillis() <= f656e) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        ThreadLocal threadLocal = f661j;
        if (bool.equals(threadLocal.get())) {
            return;
        }
        try {
            Editable text = editText.getText();
            if (text == null || text.length() == 0) {
                return;
            }
            int length = text.length();
            int[] iArr = null;
            if (length != 0) {
                Math.min(length, 160);
                int[] iArrM770a = m770a(text);
                if (iArrM770a != null) {
                    iArr = iArrM770a;
                }
            }
            if (iArr == null) {
                return;
            }
            int i3 = iArr[0];
            int i4 = iArr[1];
            if (i4 <= i3) {
                return;
            }
            threadLocal.set(bool);
            try {
                text.delete(i3, Math.min(i4, text.length()));
                try {
                    editText.setSelection(Math.min(i3, editText.length()));
                } catch (Throwable unused2) {
                }
                if (HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG)) {
                    AbstractC0497v4.m1076C("reply auto-at stripped, start=" + i3 + ", len=" + (i4 - i3));
                }
            } finally {
                threadLocal.remove();
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m774e(Object obj, Object obj2) {
        m773d(5, obj);
        m773d(5, obj2);
        try {
            synchronized (f652a) {
                try {
                    if (f657f == null) {
                        f657f = new Handler(Looper.getMainLooper());
                    }
                    Handler handler = f657f;
                    RunnableC0334mc runnableC0334mc = f658g;
                    if (runnableC0334mc != null) {
                        handler.removeCallbacks(runnableC0334mc);
                    }
                    long j = f659h + 1;
                    f659h = j;
                    RunnableC0334mc runnableC0334mc2 = new RunnableC0334mc(j, obj, obj2);
                    f658g = runnableC0334mc2;
                    handler.postDelayed(runnableC0334mc2, f653b[0]);
                } finally {
                }
            }
        } catch (Throwable th) {
            AbstractC0198e7.m343a("reply-no-at", "delayed-scrub", th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4 A[Catch: all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:23:0x0033, B:26:0x003f, B:29:0x0052, B:36:0x0064, B:47:0x0089, B:55:0x00a4, B:57:0x00ae, B:59:0x00b4, B:61:0x00ba, B:63:0x00c4, B:64:0x00cc, B:50:0x0094, B:52:0x0098, B:38:0x006f, B:39:0x0078), top: B:88:0x0033 }] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m775f(Object obj, ArrayList arrayList, int i, Set set) {
        if (obj == null || i < 0 || (obj instanceof CharSequence) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof View)) {
            return;
        }
        if (set == null || set.add(obj)) {
            for (int i2 = 0; i2 < 10; i2++) {
                String str = f660i[i2];
                try {
                    Field fieldM1118a = AbstractC0513w4.m1118a(obj.getClass(), str);
                    if (fieldM1118a != null) {
                        fieldM1118a.setAccessible(true);
                        Class<?> type = fieldM1118a.getType();
                        Class<?> cls = Integer.TYPE;
                        Class<?> cls2 = Long.TYPE;
                        if (type == String.class || CharSequence.class.isAssignableFrom(type) || type == cls || type == Integer.class || type == cls2 || type == Long.class) {
                            Object objValueOf = type == cls ? Integer.valueOf(fieldM1118a.getInt(obj)) : type == cls2 ? Long.valueOf(fieldM1118a.getLong(obj)) : fieldM1118a.get(obj);
                            if (type == cls || type == Integer.class || type == cls2 || type == Long.class) {
                                if ((objValueOf instanceof Number) && ((Number) objValueOf).longValue() != 0) {
                                    arrayList.add(new C0350nc(obj, str, objValueOf));
                                    if (type == cls) {
                                        fieldM1118a.setInt(obj, 0);
                                    } else if (type == cls2) {
                                        fieldM1118a.setLong(obj, 0L);
                                    } else if (type == Integer.class) {
                                        fieldM1118a.set(obj, 0);
                                    } else if (type == Long.class) {
                                        fieldM1118a.set(obj, 0L);
                                    } else {
                                        fieldM1118a.set(obj, "");
                                    }
                                }
                            } else if (objValueOf != null && String.valueOf(objValueOf).length() != 0) {
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            if (i == 0) {
                return;
            }
            for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                for (Field field : superclass.getDeclaredFields()) {
                    try {
                        if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive()) {
                            field.setAccessible(true);
                            Object obj2 = field.get(obj);
                            if (m771b(obj2)) {
                                m775f(obj2, arrayList, i - 1, set);
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }
}
