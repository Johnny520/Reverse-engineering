package p000;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: i5 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0260i5 {

    /* JADX INFO: renamed from: a */
    public static volatile long f380a;

    /* JADX INFO: renamed from: b */
    public static volatile long f381b;

    /* JADX INFO: renamed from: c */
    public static volatile ArrayList f382c;

    /* JADX INFO: renamed from: g */
    public static volatile List f386g;

    /* JADX INFO: renamed from: h */
    public static volatile long f387h;

    /* JADX INFO: renamed from: o */
    public static volatile boolean f394o;

    /* JADX INFO: renamed from: t */
    public static volatile long f399t;

    /* JADX INFO: renamed from: u */
    public static volatile ClassLoader f400u;

    /* JADX INFO: renamed from: v */
    public static volatile ClassLoader f401v;

    /* JADX INFO: renamed from: d */
    public static final int[] f383d = {1000, 1003, 1005, 1016, 1001, 1006};

    /* JADX INFO: renamed from: e */
    public static final Object[] f384e = new Object[0];

    /* JADX INFO: renamed from: f */
    public static final byte[] f385f = {2, 35, 33, 83, 73, 76, 75, 95, 86, 51};

    /* JADX INFO: renamed from: i */
    public static final byte[] f388i = {28, 26, 43, 29, 31, 61, 34, 49, 51, 56, 52, 74, 41, 62, 66, 46, 25, 57, 51, 70, 33, 45, 39, 27, 68, 58, 46, 59, 59, 63};

    /* JADX INFO: renamed from: j */
    public static final int[] f389j = {8000, 12000, 16000, 24000, 36000, 44100, 48000};

    /* JADX INFO: renamed from: k */
    public static final byte[] f390k = {35, 33, 83, 73, 76, 75, 95, 86, 51};

    /* JADX INFO: renamed from: l */
    public static final String[] f391l = {"initMiniAppEntryLayout.", "initMicroAppEntryLayout.", "init Mini App, cost="};

    /* JADX INFO: renamed from: m */
    public static final String[] f392m = {"summary", "name", "desc", "title", "text", "content"};

    /* JADX INFO: renamed from: n */
    public static final String[] f393n = {"summary", "pic", "image"};

    /* JADX INFO: renamed from: p */
    public static final String[] f395p = {"com.tencent.mobileqq.aio.msglist.holder.component.text.AIOTextContentComponent", "com.tencent.mobileqq.aio.msglist.holder.component.pic.AIOPicContentComponent", "com.tencent.mobileqq.aio.msglist.holder.component.file.AIOFileContentComponent", "com.tencent.mobileqq.aio.msglist.holder.component.ptt.AIOPttContentComponent", "com.tencent.mobileqq.aio.msglist.holder.component.reply.AIOReplyComponent", "com.tencent.mobileqq.aio.msglist.holder.component.ark.AIOArkContentComponent", "com.tencent.mobileqq.aio.msglist.holder.component.flashpic.AIOFlashPicContentComponent", "com.tencent.mobileqq.aio.msglist.holder.component.video.AIOVideoContentComponent", "com.tencent.mobileqq.aio.msglist.holder.component.markdown.AIORichContentComponent", "com.tencent.mobileqq.aio.msglist.holder.component.template.AIOTemplateMsgComponent", "com.tencent.mobileqq.aio.msglist.holder.component.marketface.AIOMarketFaceComponent", "com.tencent.mobileqq.aio.msglist.holder.component.facebubble.AIOFaceBubbleContentComponent", "com.tencent.mobileqq.aio.msglist.holder.component.filtervideo.AIOLiveVideoContentComponent", "com.tencent.mobileqq.aio.msglist.holder.component.videochat.AIOVideoResultContentComponent", "com.tencent.mobileqq.aio.msglist.holder.component.anisticker.AIOAniStickerContentComponent", "com.tencent.mobileqq.aio.msglist.holder.component.sysface.AIOSingleSysFaceContentComponent", "com.tencent.mobileqq.aio.msglist.holder.component.mix.AIOMixContentComponent"};

    /* JADX INFO: renamed from: q */
    public static final int[] f396q = {28052, 23338, 22688, 29831, 23384, 25985, 37714, 25292, 32342, 38322, 23684, 28528, 28610, 34249, 24743, 38341, 40515, 20158, 37828, 22428, 29825, 20276, 25930, 21997, 32053, 37721, 37722, 28051, 23943, 27537, 37812, 25116, 32152, 28000, 26664, 28225, 37833, 12517, 22476, 26473, 27411, 22135, 38344, 28848, 31497, 32475, 22794, 32223, 37733, 28854, 30367, 23480, 21449, 24385, 27996};

    /* JADX INFO: renamed from: r */
    public static final int[] f397r = {38171, 37510, 8364, 28052, 23339, 29831, 38341, 21997, 32053, 37721, 37722, 37812, 26473, 28003, 32475, 23480};

    /* JADX INFO: renamed from: s */
    public static final byte[] f398s = {35, 33, 83, 73, 76, 75, 95, 86, 51};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static String m512A(String str) {
        if (str == null) {
            return "";
        }
        String lowerCase = str.trim().toLowerCase(Locale.ROOT);
        if (lowerCase.length() == 0 || lowerCase.length() > 8) {
            return "";
        }
        for (int i = 0; i < lowerCase.length(); i++) {
            char cCharAt = lowerCase.charAt(i);
            if ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < '0' || cCharAt > '9')) {
                return "";
            }
        }
        return lowerCase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A0 */
    public static boolean m513A0(String str) {
        String host;
        if (str != null && str.length() != 0) {
            try {
                URI uri = new URI(str);
                if ("https".equalsIgnoreCase(uri.getScheme()) && uri.getUserInfo() == null) {
                    int port = uri.getPort();
                    if ((port != -1 && port != 443) || (host = uri.getHost()) == null) {
                        return false;
                    }
                    String lowerCase = host.toLowerCase(Locale.US);
                    if ("weshineapp.com".equals(lowerCase)) {
                        return true;
                    }
                    return lowerCase.endsWith(".weshineapp.com");
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A1 */
    public static ArrayList m514A1(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0026b9 c0026b9 = (C0026b9) it.next();
            if (c0026b9 != null && m555O0(c0026b9.f65a) && c0026b9.f66b.trim().length() > 0) {
                arrayList2.add(c0026b9);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new C0026b9("94b8f3ec59b18723224b7ac5e3fa3a07", "苹果香-女生", "推荐"));
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static String m515B(Object obj) {
        if (obj == null) {
            return "";
        }
        String strTrim = obj.toString().trim();
        int i = 0;
        while (true) {
            if (i >= strTrim.length()) {
                i = -1;
                break;
            }
            char cCharAt = strTrim.charAt(i);
            if (Character.isWhitespace(cCharAt) || cCharAt == ',' || cCharAt == ';' || cCharAt == 65292 || cCharAt == 65307) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            strTrim = strTrim.substring(0, i).trim();
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < strTrim.length(); i2++) {
            char cCharAt2 = strTrim.charAt(i2);
            if ((cCharAt2 >= '0' && cCharAt2 <= '9') || ((cCharAt2 >= 'a' && cCharAt2 <= 'z') || ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || cCharAt2 == '_' || cCharAt2 == '-'))) {
                sb.append(cCharAt2);
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B0 */
    public static boolean m516B0(String str) {
        int port;
        String host;
        if (str != null && str.length() != 0) {
            try {
                URI uri = new URI(str);
                if ("https".equalsIgnoreCase(uri.getScheme()) && uri.getUserInfo() == null && (((port = uri.getPort()) == -1 || port == 443) && (host = uri.getHost()) != null)) {
                    if ("oiapi.net".equals(host.toLowerCase(Locale.US))) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B1 */
    public static boolean m517B1(Class cls) {
        if (cls == null) {
            return false;
        }
        if (!cls.isArray() && !Iterable.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls) && !Collection.class.isAssignableFrom(cls)) {
            String lowerCase = cls.getName().toLowerCase(Locale.ROOT);
            if (!lowerCase.contains("list") && !lowerCase.contains("map") && !lowerCase.contains("cache") && !lowerCase.contains("repo")) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static String m518C(Object obj) {
        String strM515B = m515B(obj);
        if (strM515B.length() < 5 || strM515B.length() > 12) {
            return "";
        }
        for (int i = 0; i < strM515B.length(); i++) {
            if (!Character.isDigit(strM515B.charAt(i))) {
                return "";
            }
        }
        return strM515B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C0 */
    public static boolean m519C0(View view) {
        String lowerCase = view.getClass().getName().toLowerCase();
        return lowerCase.contains("quibadge") || lowerCase.contains("badge") || lowerCase.contains("unread");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't wrap try/catch for region: R(8:(4:63|64|73|93)|67|68|88|69|70|73|93) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0139, code lost:
    
        r0 = th;
     */
    /* JADX INFO: renamed from: C1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m520C1(ArrayList arrayList, Object obj, boolean z) {
        String[] strArr;
        Object objM1119b;
        String[] strArr2 = f393n;
        String[] strArr3 = f392m;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        String str = Prefs.DEFAULT_PIC_SUMMARY;
        String strRuntimeString = HookEntry.runtimeString(Prefs.KEY_PIC_SUMMARY_TEXT, Prefs.DEFAULT_PIC_SUMMARY);
        if (strRuntimeString != null && strRuntimeString.length() != 0) {
            str = strRuntimeString;
        }
        int iM1120c = AbstractC0513w4.m1120c(obj, "chatType", -1);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        for (Object obj2 : arrayList) {
            if (obj2 != null) {
                try {
                    Object objM1119b2 = AbstractC0513w4.m1119b(obj2, "picElement");
                    if (objM1119b2 != null) {
                        if (z && z2) {
                            AbstractC0513w4.m1121d(objM1119b2, "summary", "\u200b");
                            AbstractC0513w4.m1121d(objM1119b2, "originImageSummary", "\u200b");
                            AbstractC0513w4.m1121d(objM1119b2, "picSummary", "\u200b");
                            AbstractC0513w4.m1121d(objM1119b2, "fileName", "\u200b");
                            m553N1(objM1119b2, "\u200b", true, strArr3);
                            m553N1(obj2, "\u200b", true, strArr2);
                        } else {
                            AbstractC0513w4.m1121d(objM1119b2, "summary", str);
                            AbstractC0513w4.m1121d(objM1119b2, "originImageSummary", str);
                            AbstractC0513w4.m1121d(objM1119b2, "picSummary", str);
                            AbstractC0513w4.m1121d(objM1119b2, "fileName", str);
                            if (AbstractC0513w4.m1120c(objM1119b2, "picSubType", 0) != 0 && iM1120c != 4) {
                                AbstractC0513w4.m1121d(objM1119b2, "picSubType", 7);
                            }
                            m553N1(objM1119b2, str, false, strArr3);
                            m553N1(obj2, str, false, strArr2);
                            i++;
                            z2 = true;
                        }
                    }
                    Object objM1119b3 = AbstractC0513w4.m1119b(obj2, "marketFaceElement");
                    if (objM1119b3 != null) {
                        if (z && z2) {
                            AbstractC0513w4.m1121d(objM1119b3, "faceName", "\u200b");
                            AbstractC0513w4.m1121d(objM1119b3, "summary", "\u200b");
                            AbstractC0513w4.m1121d(objM1119b3, "faceSummary", "\u200b");
                            m553N1(objM1119b3, "\u200b", true, strArr3);
                        } else {
                            AbstractC0513w4.m1121d(objM1119b3, "faceName", str);
                            AbstractC0513w4.m1121d(objM1119b3, "summary", str);
                            AbstractC0513w4.m1121d(objM1119b3, "faceSummary", str);
                            m553N1(objM1119b3, str, false, strArr3);
                            i2++;
                            z2 = true;
                        }
                    }
                    Object objM1119b4 = AbstractC0513w4.m1119b(obj2, "faceBubbleElement");
                    if (objM1119b4 == null) {
                        objM1119b4 = AbstractC0513w4.m1119b(obj2, "faceElement");
                    }
                    if (objM1119b4 == null) {
                        strArr = strArr2;
                    } else if (z && z2) {
                        try {
                            AbstractC0513w4.m1121d(objM1119b4, "content", "\u200b");
                            AbstractC0513w4.m1121d(objM1119b4, "faceSummary", "\u200b");
                            AbstractC0513w4.m1121d(objM1119b4, "summary", "\u200b");
                            strArr = strArr2;
                        } catch (Throwable th) {
                            th = th;
                            strArr = strArr2;
                            HookEntry.log("rewriteOutgoingPicSummary failed: " + th);
                            strArr2 = strArr;
                        }
                        try {
                            m553N1(objM1119b4, "\u200b", true, strArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            HookEntry.log("rewriteOutgoingPicSummary failed: " + th);
                            strArr2 = strArr;
                        }
                    } else {
                        strArr = strArr2;
                        AbstractC0513w4.m1121d(objM1119b4, "content", str);
                        AbstractC0513w4.m1121d(objM1119b4, "faceSummary", str);
                        AbstractC0513w4.m1121d(objM1119b4, "summary", str);
                        m553N1(objM1119b4, str, false, strArr3);
                        i3++;
                        z2 = true;
                    }
                    objM1119b = AbstractC0513w4.m1119b(obj2, "giphyElement");
                } catch (Throwable th3) {
                    th = th3;
                }
                if (objM1119b == null) {
                    strArr2 = strArr;
                } else {
                    if (z && z2) {
                        m521D(objM1119b);
                        strArr2 = strArr;
                    }
                    AbstractC0513w4.m1121d(objM1119b, "content", str);
                    AbstractC0513w4.m1121d(objM1119b, "text", str);
                    AbstractC0513w4.m1121d(objM1119b, "name", str);
                    AbstractC0513w4.m1121d(objM1119b, "summary", str);
                    AbstractC0513w4.m1121d(objM1119b, "faceName", str);
                    AbstractC0513w4.m1121d(objM1119b, "faceSummary", str);
                    m553N1(objM1119b, str, false, strArr3);
                    i3++;
                    z2 = true;
                    strArr2 = strArr;
                }
            }
        }
        if (f394o) {
            return;
        }
        if (i > 0 || i2 > 0 || i3 > 0) {
            f394o = true;
            HookEntry.log("pic summary rewritten: pic=" + i + ", marketFace=" + i2 + ", faceBubble=" + i3 + ", chatType=" + iM1120c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static void m521D(Object obj) {
        AbstractC0513w4.m1121d(obj, "content", "\u200b");
        AbstractC0513w4.m1121d(obj, "text", "\u200b");
        AbstractC0513w4.m1121d(obj, "name", "\u200b");
        AbstractC0513w4.m1121d(obj, "summary", "\u200b");
        AbstractC0513w4.m1121d(obj, "faceName", "\u200b");
        AbstractC0513w4.m1121d(obj, "faceSummary", "\u200b");
        m553N1(obj, "\u200b", true, f392m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D0 */
    public static boolean m522D0(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return lowerCase.contains("friend") || lowerCase.contains("buddy") || lowerCase.contains("contact") || lowerCase.contains("relation") || lowerCase.contains("c2c") || lowerCase.contains("uin") || lowerCase.contains("uid");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D1 */
    public static GradientDrawable m523D1(Context context, int i, int i2, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(m591a0(context, f));
        gradientDrawable.setStroke(m591a0(context, 1.0f), i2);
        return gradientDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static void m524E(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E0 */
    public static boolean m525E0(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        String strTrim = charSequence.toString().trim();
        return "99+".equals(strTrim) || "99＋".equals(strTrim) || "99".equals(strTrim);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E1 */
    public static String m526E1(String str) {
        return str == null ? "" : str.replace('\n', ' ').replace('\r', ' ');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static void m527F(HttpURLConnection httpURLConnection, C0314l8 c0314l8) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
            if (c0314l8.f530c == httpURLConnection) {
                c0314l8.f530c = null;
            }
        } catch (Throwable unused) {
            if (c0314l8.f530c == httpURLConnection) {
                c0314l8.f530c = null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F0 */
    public static boolean m528F0(String str, boolean z, boolean z2, boolean z3) {
        return z2 ? z : z || z3 || !m639n1(str, false).isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F1 */
    public static String m529F1(String str, int i) {
        if (str == null) {
            return "";
        }
        String strReplace = str.trim().replace('\n', ' ').replace('\r', ' ');
        return strReplace.length() > i ? strReplace.substring(0, i) : strReplace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static void m530G(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G0 */
    public static boolean m531G0(Object obj) {
        if (obj == null) {
            return false;
        }
        String lowerCase = obj.getClass().getName().toLowerCase(Locale.ROOT);
        if (lowerCase.contains("troop") || lowerCase.contains("group") || lowerCase.contains("guild") || lowerCase.contains("discuss") || AbstractC0008a7.m60q(m601c2(obj, "troopuin", "troopUin", "troopCode", "groupUin", "guildId"))) {
            return true;
        }
        String strM601c2 = m601c2(obj, "chatType", "uinType", "contactType", "type", "mUinType");
        int i = Integer.MIN_VALUE;
        if (strM601c2.length() != 0) {
            try {
                i = Integer.parseInt(strM601c2);
            } catch (Throwable unused) {
            }
        }
        return i == 2 || i == 4 || i == 10014;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G1 */
    public static String m532G1(String str) {
        if (str == null) {
            return "";
        }
        String strTrim = str.trim();
        return (strTrim.length() == 0 || "other".equalsIgnoreCase(strTrim) || "__uncategorized__".equals(strTrim)) ? "" : strTrim.length() <= 20 ? strTrim : strTrim.substring(0, 20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static void m533H(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H0 */
    public static boolean m534H0(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        if (strTrim.length() >= 3 && strTrim.length() <= 64) {
            if (strTrim.startsWith("u_") && strTrim.length() > 4) {
                return true;
            }
            for (int i = 0; i < strTrim.length(); i++) {
                char cCharAt = strTrim.charAt(i);
                if (cCharAt < '0' || cCharAt > '9') {
                    return false;
                }
            }
            if (strTrim.length() >= 5) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H1 */
    public static String m535H1(CharSequence charSequence, int i) {
        String strValueOf;
        try {
            strValueOf = String.valueOf(charSequence);
        } catch (Throwable th) {
            strValueOf = "<error " + th + ">";
        }
        String strReplace = strValueOf.replace('\r', ' ').replace('\n', ' ');
        return (i <= 0 || strReplace.length() <= i) ? strReplace : strReplace.substring(0, i).concat("...");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static void m536I(Object obj, LinkedHashMap linkedHashMap, boolean z) {
        m602d(obj, linkedHashMap, z, 0, Collections.newSetFromMap(new IdentityHashMap()), new C0415q2());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I0 */
    public static boolean m537I0(Bitmap bitmap) {
        boolean z = true;
        if (bitmap == null || bitmap.isRecycled()) {
            return true;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0) {
            return true;
        }
        int iMax = Math.max(1, width / 12);
        int iMax2 = Math.max(1, height / 12);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = iMax2 / 2; i4 < height; i4 += iMax2) {
            int i5 = iMax / 2;
            while (i5 < width) {
                int pixel = bitmap.getPixel(i5, i4);
                int i6 = (pixel >>> 24) & 255;
                int i7 = (pixel >>> 16) & 255;
                int i8 = (pixel >>> 8) & 255;
                int i9 = pixel & 255;
                i++;
                boolean z2 = z;
                int iMax3 = Math.max(i7, Math.max(i8, i9));
                int iMin = Math.min(i7, Math.min(i8, i9));
                if (i6 < 32 || (iMax3 - iMin <= 22 && iMin >= 180 && iMax3 <= 248)) {
                    i2++;
                }
                if (i6 > 64 && (iMin < 120 || iMax3 - iMin > 48)) {
                    i3++;
                }
                i5 += iMax;
                z = z2;
            }
        }
        boolean z3 = z;
        if (i <= 0 || (i2 * 100) / i < 80 || (i3 * 100) / i > 8) {
            return false;
        }
        return z3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I1 */
    public static Bitmap m538I1(Bitmap bitmap, int i, boolean z) {
        if (bitmap == null || bitmap.isRecycled() || i <= 0) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > 0 && height > 0) {
            float f = i;
            float f2 = width;
            float f3 = height;
            float fMin = Math.min(f / f2, f / f3);
            if (fMin > 0.0f) {
                int iMax = Math.max(1, Math.round(f2 * fMin));
                int iMax2 = Math.max(1, Math.round(f3 * fMin));
                if (iMax != width || iMax2 != height) {
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iMax, iMax2, true);
                    if (z && bitmapCreateScaledBitmap != bitmap) {
                        bitmap.recycle();
                    }
                    return bitmapCreateScaledBitmap;
                }
            }
        }
        return bitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static void m539J(Object obj, ArrayList arrayList, LinkedHashMap linkedHashMap, String str, int i, Set set) {
        if (obj == null || i > 5) {
            return;
        }
        if (m549M0(obj.getClass())) {
            m614g(arrayList, m515B(obj), str);
            return;
        }
        try {
            if (!set.add(obj)) {
                return;
            }
        } catch (Throwable unused) {
        }
        String strM515B = m515B(m656t0(obj));
        if (m614g(arrayList, strM515B, str)) {
            m654s1(linkedHashMap, strM515B, m620h1(obj), m659u0(obj));
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object value = entry.getValue();
            String strM515B2 = m515B(entry.getKey());
            String strM620h1 = m620h1(value);
            String strM659u0 = m659u0(value);
            if ((strM620h1.length() > 0 || strM659u0.length() > 0) && m614g(arrayList, strM515B2, str)) {
                m654s1(linkedHashMap, strM515B2, strM620h1, strM659u0);
            }
            m539J(value, arrayList, linkedHashMap, str, i + 1, set);
            return;
        }
        int i2 = 0;
        if (obj instanceof Map) {
            for (Object obj2 : ((Map) obj).entrySet()) {
                int i3 = i2 + 1;
                if (i3 > 1000) {
                    return;
                }
                m539J(obj2, arrayList, linkedHashMap, str, i + 1, set);
                i2 = i3;
            }
            return;
        }
        if (obj instanceof Iterable) {
            for (Object obj3 : (Iterable) obj) {
                int i4 = i2 + 1;
                if (i4 > 1000) {
                    return;
                }
                m539J(obj3, arrayList, linkedHashMap, str, i + 1, set);
                i2 = i4;
            }
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            int iMin = Math.min(Array.getLength(obj), 1000);
            for (int i5 = 0; i5 < iMin; i5++) {
                m539J(Array.get(obj, i5), arrayList, linkedHashMap, str, i + 1, set);
            }
            return;
        }
        if (i >= 3) {
            return;
        }
        for (Field field : m625j(cls)) {
            if (m556O1(field, i)) {
                try {
                    m539J(field.get(obj), arrayList, linkedHashMap, str, i + 1, set);
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public static boolean m540J0(View view, int i) {
        if (view == null || i <= 0) {
            return false;
        }
        try {
            if (view.getVisibility() != 0) {
                return false;
            }
        } catch (Throwable unused) {
        }
        int iM609e2 = m609e2(view, true);
        int iM609e22 = m609e2(view, false);
        if (iM609e2 <= 0 || iM609e22 <= 0) {
            return true;
        }
        int iMax = Math.max(i * 6, 1);
        return iM609e2 <= iMax && iM609e22 <= iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J1 */
    public static long m541J1(long j, long j2) {
        if (j <= 0) {
            return -1L;
        }
        try {
            return Math.multiplyExact(j, j2);
        } catch (ArithmeticException unused) {
            return -1L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0162 A[Catch: all -> 0x0167, TRY_LEAVE, TryCatch #0 {all -> 0x0167, blocks: (B:86:0x0133, B:89:0x0140, B:91:0x014a, B:94:0x0151, B:101:0x0162), top: B:106:0x0133 }] */
    /* JADX INFO: renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m542K(int i, Object obj, ArrayList arrayList, Set set, int[] iArr) {
        if (obj == null || set == null || i > 4 || arrayList.size() >= 48) {
            return;
        }
        int i2 = 0;
        if (iArr[0] <= 180 && set.add(obj)) {
            iArr[0] = iArr[0] + 1;
            if (obj instanceof CharSequence) {
                String string = obj.toString();
                if (string == null) {
                    return;
                }
                String strTrim = string.trim();
                if (strTrim.length() == 0 || strTrim.length() > 320) {
                    return;
                }
                if (strTrim.startsWith("file://")) {
                    strTrim = strTrim.substring(7);
                }
                int iIndexOf = strTrim.indexOf("/storage/");
                if (iIndexOf > 0) {
                    strTrim = strTrim.substring(iIndexOf);
                }
                if ((strTrim.contains("/") || strTrim.contains("\\")) && !arrayList.contains(strTrim)) {
                    arrayList.add(strTrim);
                    return;
                }
                return;
            }
            if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Class)) {
                return;
            }
            Class<?> superclass = obj.getClass();
            if (superclass.isArray()) {
                int iMin = Math.min(Array.getLength(obj), 40);
                while (i2 < iMin) {
                    m542K(i + 1, Array.get(obj, i2), arrayList, set, iArr);
                    i2++;
                }
                return;
            }
            if (obj instanceof Iterable) {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext() && i2 < 40) {
                    m542K(i + 1, it.next(), arrayList, set, iArr);
                    i2++;
                }
                return;
            }
            if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext() && i2 < 40) {
                    Object next = it2.next();
                    if (next instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) next;
                        int i3 = i + 1;
                        m542K(i3, entry.getKey(), arrayList, set, iArr);
                        m542K(i3, entry.getValue(), arrayList, set, iArr);
                    }
                    i2++;
                }
                return;
            }
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("android.")) {
                return;
            }
            int i4 = 0;
            while (superclass != null && superclass != Object.class && i4 < 52) {
                Field[] declaredFields = superclass.getDeclaredFields();
                for (int i5 = 0; i5 < declaredFields.length && i4 < 52; i5++) {
                    Field field = declaredFields[i5];
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i4++;
                        try {
                            field.setAccessible(true);
                            Object obj2 = field.get(obj);
                            if (obj2 instanceof CharSequence) {
                                m542K(i + 1, obj2, arrayList, set, iArr);
                            } else if (obj2 != null) {
                                Class<?> cls = obj2.getClass();
                                if (!cls.isPrimitive() && !cls.isEnum() && !Number.class.isAssignableFrom(cls) && Boolean.class != cls && Character.class != cls) {
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
                superclass = superclass.getSuperclass();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K0 */
    public static boolean m543K0(IOException iOException) {
        String lowerCase = m526E1(iOException.getMessage()).toLowerCase(Locale.US);
        return (lowerCase.contains("too large") || lowerCase.contains("storage") || lowerCase.contains("space") || lowerCase.contains("cancel") || lowerCase.contains("changed") || lowerCase.contains("incomplete")) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K1 */
    public static String m544K1(LinkedHashSet linkedHashSet) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int i2 = f383d[i];
            if (linkedHashSet.contains(Integer.valueOf(i2))) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(i2);
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static String m545L(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 18) {
            return str;
        }
        return str.substring(0, 9) + "..." + str.substring(str.length() - 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L0 */
    public static boolean m546L0(IOException iOException) {
        int i = 0;
        for (Throwable cause = iOException; cause != null && i < 8; cause = cause.getCause()) {
            if ((cause instanceof SocketTimeoutException) || (cause instanceof ConnectException) || (cause instanceof NoRouteToHostException) || (cause instanceof UnknownHostException) || (cause instanceof EOFException)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L1 */
    public static String m547L1(String str) {
        return "duplicate".equals(str) ? "这个表情已经上传过" : "rate_limited".equals(str) ? "上传过于频繁，请稍后再试" : "too_many_pending".equals(str) ? "待审核表情过多，请等待审核" : "invalid_image".equals(str) ? "所选文件不是支持的表情图片" : "body_too_large".equals(str) ? "表情文件过大" : "云端表情服务暂时不可用";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static int m548M(String str, String str2) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M0 */
    public static boolean m549M0(Class cls) {
        return cls == null || cls.isPrimitive() || cls == String.class || Number.class.isAssignableFrom(cls) || Boolean.class == cls || Character.class == cls || cls.isEnum() || cls.getName().startsWith("android.view.") || cls.getName().startsWith("android.widget.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M1 */
    public static void m550M1(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, String str) throws IOException {
        int i;
        int i2 = bufferInfo.offset;
        if (i2 < 0 || (i = bufferInfo.size) < 0) {
            C0479u2.m1038c(str);
            return;
        }
        long j = ((long) i2) + ((long) i);
        if (j > byteBuffer.capacity()) {
            C0479u2.m1038c(str);
        } else {
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit((int) j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static void m551N(Dialog dialog, AtomicBoolean atomicBoolean) {
        AbstractC0010a9.m73b();
        atomicBoolean.set(true);
        if (dialog == null) {
            return;
        }
        try {
            dialog.dismiss();
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N0 */
    public static boolean m552N0(String str) {
        String lowerCase = str.trim().toLowerCase(Locale.US);
        return "image/jpeg".equals(lowerCase) || "image/png".equals(lowerCase) || "image/gif".equals(lowerCase) || "image/webp".equals(lowerCase);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f A[Catch: all -> 0x0096, TRY_LEAVE, TryCatch #1 {all -> 0x0096, blocks: (B:9:0x0015, B:11:0x001f, B:13:0x0027, B:15:0x002d, B:17:0x0035, B:19:0x0039, B:21:0x003f, B:23:0x0049, B:26:0x0057, B:28:0x005d, B:30:0x0067, B:32:0x006f, B:34:0x0077, B:36:0x007f, B:38:0x0087, B:40:0x008f), top: B:51:0x0015 }] */
    /* JADX INFO: renamed from: N1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m553N1(Object obj, String str, boolean z, String... strArr) {
        String name;
        try {
            for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                for (Field field : superclass.getDeclaredFields()) {
                    try {
                        if (!Modifier.isStatic(field.getModifiers()) && field.getType() == String.class && (name = field.getName()) != null) {
                            String lowerCase = name.toLowerCase();
                            int length = strArr.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                String str2 = strArr[i];
                                if (str2 == null || str2.length() <= 0 || !lowerCase.contains(str2.toLowerCase())) {
                                    i++;
                                } else {
                                    field.setAccessible(true);
                                    String str3 = (String) field.get(obj);
                                    if (z || str3 == null || str3.length() == 0) {
                                        field.set(obj, str);
                                    } else {
                                        String strTrim = str3.trim();
                                        if (strTrim.length() == 0 || Prefs.DEFAULT_PIC_SUMMARY.equals(strTrim) || "[图]".equals(strTrim) || "图片".equals(strTrim) || "[pic]".equalsIgnoreCase(strTrim) || "[image]".equalsIgnoreCase(strTrim)) {
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static boolean m554O(View view, int i) {
        CharSequence text;
        if (view != null && i <= 5) {
            if (!(view instanceof TextView) || (text = ((TextView) view).getText()) == null || !"通知".contentEquals(text)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int iMin = Math.min(viewGroup.getChildCount(), 40);
                    for (int i2 = 0; i2 < iMin; i2++) {
                        if (!m554O(viewGroup.getChildAt(i2), i + 1)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O0 */
    public static boolean m555O0(String str) {
        if (str.length() != 0 && str.length() <= 128) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '-' || cCharAt == '_'))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O1 */
    public static boolean m556O1(Field field, int i) {
        if (field == null || Modifier.isStatic(field.getModifiers())) {
            return false;
        }
        Class<?> type = field.getType();
        if (m549M0(type)) {
            return false;
        }
        String lowerCase = field.getName().toLowerCase(Locale.ROOT);
        if ((i > 1 || !m522D0(lowerCase)) && !m517B1(type)) {
            if (!m522D0(type == null ? "" : type.getName())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d A[Catch: all -> 0x00a9, TryCatch #0 {all -> 0x00a9, blocks: (B:13:0x001b, B:16:0x0023, B:38:0x006d, B:40:0x0098, B:43:0x009c, B:45:0x00a2, B:19:0x002b, B:21:0x0039, B:24:0x0042, B:26:0x004a, B:28:0x0052, B:31:0x005b, B:35:0x0069, B:34:0x0063), top: B:58:0x001b }] */
    /* JADX INFO: renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m557P(View view, EditText editText, int i, int[] iArr) {
        int i2;
        boolean z;
        if (view != null && i <= 2 && (i2 = iArr[0]) <= 32) {
            iArr[0] = i2 + 1;
            if ((view instanceof TextView) && view != editText) {
                TextView textView = (TextView) view;
                if (textView.isShown()) {
                    CharSequence text = textView.getText();
                    if (text != null) {
                        String strTrim = text.toString().trim();
                        if (strTrim.length() != 0 && strTrim.length() <= 140 && !"发送".equals(strTrim) && !"输入消息".equals(strTrim) && !"按住 说话".equals(strTrim)) {
                            z = !(strTrim.length() == 0 ? false : strTrim.contains("[ELARIS_FAV:"));
                        }
                        if (!z) {
                            int[] iArr2 = new int[2];
                            int[] iArr3 = new int[2];
                            editText.getLocationOnScreen(iArr2);
                            textView.getLocationOnScreen(iArr3);
                            int i3 = iArr2[1];
                            int i4 = iArr3[1];
                            int height = textView.getHeight() + i4;
                            int iM595b0 = m595b0(editText.getContext(), 160);
                            int iM595b02 = m595b0(editText.getContext(), 24);
                            if (height >= i3 - iM595b0 && i4 <= i3 + iM595b02) {
                                if (!m600c1(text)) {
                                    if (!m596b1(text)) {
                                    }
                                }
                                return true;
                            }
                        }
                    }
                    z = false;
                    if (!z) {
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int iMin = Math.min(viewGroup.getChildCount(), 32);
                for (int i5 = 0; i5 < iMin; i5++) {
                    if (m557P(viewGroup.getChildAt(i5), editText, i + 1, iArr)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P0 */
    public static String m558P0(ClassLoader classLoader) {
        String strSubstring;
        String str = "";
        if (classLoader == null) {
            return "null";
        }
        try {
            strSubstring = String.valueOf(classLoader);
        } catch (Throwable unused) {
            strSubstring = "";
        }
        if (strSubstring.length() > 120) {
            strSubstring = strSubstring.substring(0, 120);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(classLoader.getClass().getName());
        sb.append("@");
        sb.append(Integer.toHexString(System.identityHashCode(classLoader)));
        if (strSubstring.length() != 0) {
            str = "[" + strSubstring + "]";
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P1 */
    public static void m559P1(Activity activity, ClassLoader classLoader, C0410pd c0410pd) {
        if (!m674z0(activity) || classLoader == null || c0410pd == null) {
            return;
        }
        Dialog dialog = new Dialog(activity);
        AbstractC0486u9.m1051d(dialog);
        C0533x8 c0533x8 = new C0533x8();
        LinearLayout linearLayoutM636m1 = m636m1(activity);
        TextView textViewM574U1 = m574U1(activity, "文字转语音", 17.0f, AbstractC0486u9.m1045G(activity), true);
        TextView textViewM655t = m655t(activity, "关闭", false);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setGravity(16);
        linearLayout.addView(textViewM574U1, new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout.addView(textViewM655t, new LinearLayout.LayoutParams(m591a0(activity, 58.0f), m591a0(activity, 32.0f)));
        linearLayoutM636m1.addView(linearLayout, m604d1());
        TextView textViewM574U12 = m574U1(activity, "正在加载音色", 12.0f, AbstractC0486u9.m1043E(activity), false);
        LinearLayout.LayoutParams layoutParamsM604d1 = m604d1();
        layoutParamsM604d1.topMargin = m591a0(activity, 6.0f);
        linearLayoutM636m1.addView(textViewM574U12, layoutParamsM604d1);
        ListView listView = new ListView(activity);
        listView.setDivider(new ColorDrawable(0));
        listView.setDividerHeight(m591a0(activity, 8.0f));
        listView.setOverScrollMode(2);
        listView.setClipToPadding(true);
        listView.setVisibility(0);
        C0565z8 c0565z8 = new C0565z8(activity, new C0362o8(dialog, new AtomicBoolean(false), activity, classLoader, c0410pd));
        listView.setAdapter((ListAdapter) c0565z8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, AbstractC0486u9.m1073z(activity));
        layoutParams.topMargin = m591a0(activity, 8.0f);
        linearLayoutM636m1.addView(listView, layoutParams);
        textViewM655t.setOnClickListener(new ViewOnClickListenerC0280j6(dialog, 2));
        dialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC0469t8(c0533x8));
        dialog.setContentView(linearLayoutM636m1);
        m640o(dialog, AbstractC0486u9.m1039A(activity));
        dialog.show();
        m640o(dialog, AbstractC0486u9.m1039A(activity));
        m570T0(activity, dialog, textViewM574U12, listView, c0565z8, c0533x8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static boolean m560Q(View view, String str, int i) {
        CharSequence contentDescription;
        if (view != null && str != null && i <= 5) {
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                CharSequence text = textView.getText();
                CharSequence hint = textView.getHint();
                if ((text != null && text.toString().contains(str)) || (hint != null && hint.toString().contains(str))) {
                    return true;
                }
            }
            try {
                contentDescription = view.getContentDescription();
            } catch (Throwable unused) {
                contentDescription = null;
            }
            if (contentDescription != null && contentDescription.toString().contains(str)) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int iMin = Math.min(viewGroup.getChildCount(), 40);
                for (int i2 = 0; i2 < iMin; i2++) {
                    if (m560Q(viewGroup.getChildAt(i2), str, i + 1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q0 */
    public static C0335md m561Q0(InterfaceC0279j5 interfaceC0279j5) {
        interfaceC0279j5.getClass();
        return new C0335md(interfaceC0279j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q1 */
    public static void m562Q1(final Activity activity, final ClassLoader classLoader, final C0410pd c0410pd, final C0026b9 c0026b9, String str) {
        if (!m674z0(activity) || c0026b9 == null) {
            return;
        }
        final Dialog dialog = new Dialog(activity);
        AbstractC0486u9.m1051d(dialog);
        LinearLayout linearLayoutM636m1 = m636m1(activity);
        linearLayoutM636m1.addView(m574U1(activity, c0026b9.f66b, 17.0f, AbstractC0486u9.m1045G(activity), true), m604d1());
        final EditText editText = new EditText(activity);
        editText.setHint("输入要转换的文字（最多 200 字）");
        editText.setTextColor(AbstractC0486u9.m1045G(activity));
        editText.setHintTextColor(AbstractC0486u9.m1062o(activity) ? -7367005 : -6511697);
        editText.setTextSize(15.0f);
        editText.setGravity(8388659);
        editText.setSingleLine(false);
        editText.setMinLines(3);
        editText.setMaxLines(6);
        editText.setPadding(m591a0(activity, 12.0f), m591a0(activity, 10.0f), m591a0(activity, 12.0f), m591a0(activity, 10.0f));
        editText.setInputType(147457);
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(400)});
        if (str != null && str.length() > 0) {
            editText.setText(str);
            editText.setSelection(editText.length());
        }
        editText.setBackground(m523D1(activity, AbstractC0486u9.m1072y(activity), AbstractC0486u9.m1062o(activity) ? -11775650 : -1841171, 12.0f));
        LinearLayout.LayoutParams layoutParamsM604d1 = m604d1();
        layoutParamsM604d1.topMargin = m591a0(activity, 14.0f);
        linearLayoutM636m1.addView(editText, layoutParamsM604d1);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setGravity(16);
        TextView textViewM655t = m655t(activity, "返回", false);
        textViewM655t.setOnClickListener(new View.OnClickListener() { // from class: q8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialog.dismiss();
                AbstractC0260i5.m559P1(activity, classLoader, c0410pd);
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams.leftMargin = 0;
        linearLayout.addView(textViewM655t, layoutParams);
        final TextView textViewM655t2 = m655t(activity, "生成并发送", true);
        textViewM655t2.setOnClickListener(new View.OnClickListener() { // from class: r8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0527x2 c0527x2;
                EditText editText2 = editText;
                String string = editText2.getText() == null ? "" : editText2.getText().toString();
                String strTrim = string != null ? string.trim() : "";
                int iCodePointCount = (strTrim == null || strTrim.length() == 0) ? 0 : strTrim.codePointCount(0, strTrim.length());
                Activity activity2 = activity;
                if (iCodePointCount <= 0) {
                    AbstractC0260i5.m583X1(activity2, "请输入要转换的文字");
                    return;
                }
                if (iCodePointCount > 200) {
                    AbstractC0260i5.m583X1(activity2, "文字不能超过 200 字");
                    return;
                }
                if (!AbstractC0010a9.f40b.compareAndSet(false, true)) {
                    AbstractC0260i5.m583X1(activity2, "已有语音正在生成，请稍候");
                    return;
                }
                textViewM655t2.setEnabled(false);
                dialog.dismiss();
                if (!AbstractC0260i5.m674z0(activity2)) {
                    AbstractC0010a9.m73b();
                    return;
                }
                Activity applicationContext = activity2.getApplicationContext() == null ? activity2 : activity2.getApplicationContext();
                Handler handler = new Handler(Looper.getMainLooper());
                final C0314l8 c0314l8 = new C0314l8();
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                int iHotReloadGeneration = HookEntry.hotReloadGeneration();
                C0026b9 c0026b92 = c0026b9;
                String str2 = c0026b92.f66b;
                RunnableC0239h0 runnableC0239h0 = new RunnableC0239h0(5, c0314l8);
                if (AbstractC0260i5.m674z0(activity2)) {
                    Dialog dialog2 = new Dialog(activity2);
                    AbstractC0486u9.m1051d(dialog2);
                    LinearLayout linearLayoutM636m12 = AbstractC0260i5.m636m1(activity2);
                    linearLayoutM636m12.addView(AbstractC0260i5.m574U1(activity2, str2, 16.0f, AbstractC0486u9.m1045G(activity2), true), AbstractC0260i5.m604d1());
                    TextView textViewM574U1 = AbstractC0260i5.m574U1(activity2, "正在生成语音", 13.0f, AbstractC0486u9.m1043E(activity2), false);
                    LinearLayout.LayoutParams layoutParamsM604d12 = AbstractC0260i5.m604d1();
                    layoutParamsM604d12.topMargin = AbstractC0260i5.m591a0(activity2, 8.0f);
                    layoutParamsM604d12.bottomMargin = AbstractC0260i5.m591a0(activity2, 13.0f);
                    linearLayoutM636m12.addView(textViewM574U1, layoutParamsM604d12);
                    TextView textViewM655t3 = AbstractC0260i5.m655t(activity2, "取消", false);
                    textViewM655t3.setOnClickListener(new ViewOnClickListenerC0478u1(runnableC0239h0, dialog2, 1));
                    linearLayoutM636m12.addView(textViewM655t3, new LinearLayout.LayoutParams(-1, AbstractC0260i5.m591a0(activity2, 38.0f)));
                    dialog2.setContentView(linearLayoutM636m12);
                    AbstractC0260i5.m637n(activity2, dialog2, 390.0f);
                    dialog2.show();
                    AbstractC0260i5.m637n(activity2, dialog2, 390.0f);
                    c0527x2 = new C0527x2(dialog2);
                } else {
                    c0527x2 = null;
                }
                C0527x2 c0527x22 = c0527x2;
                if (c0527x22 == null) {
                    AbstractC0010a9.m73b();
                    return;
                }
                Dialog dialog3 = (Dialog) c0527x22.f1027a;
                dialog3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: s8
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        if (atomicBoolean.get()) {
                            return;
                        }
                        c0314l8.m752a();
                    }
                });
                ClassLoader classLoader2 = classLoader;
                C0410pd c0410pd2 = c0410pd;
                RunnableC0517w8 runnableC0517w8 = new RunnableC0517w8(applicationContext, strTrim, c0026b92, c0314l8, handler, iHotReloadGeneration, activity2, classLoader2, c0410pd2, c0527x22, atomicBoolean);
                ThreadPoolExecutor threadPoolExecutor = AbstractC0010a9.f42d;
                if (threadPoolExecutor != null) {
                    try {
                        threadPoolExecutor.execute(runnableC0517w8);
                        return;
                    } catch (RejectedExecutionException unused) {
                    }
                }
                c0314l8.m752a();
                c0314l8.m754c();
                HookEntry.log("kk tts generation task rejected");
                AbstractC0260i5.m551N(dialog3, atomicBoolean);
                AbstractC0260i5.m583X1(activity2, "语音生成失败");
                AbstractC0260i5.m562Q1(activity2, classLoader2, c0410pd2, c0026b92, strTrim);
            }
        });
        int iM591a0 = m591a0(activity, 8.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams2.leftMargin = iM591a0;
        linearLayout.addView(textViewM655t2, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, m591a0(activity, 40.0f));
        layoutParams3.topMargin = m591a0(activity, 14.0f);
        linearLayoutM636m1.addView(linearLayout, layoutParams3);
        dialog.setContentView(linearLayoutM636m1);
        m637n(activity, dialog, 420.0f);
        dialog.show();
        m637n(activity, dialog, 420.0f);
        editText.requestFocus();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static Bitmap m563R(String str, int i) {
        int i2;
        if (str != null && str.length() != 0) {
            try {
                File file = new File(str);
                if (file.isFile() && file.length() > 0) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                    int i3 = options.outWidth;
                    if (i3 > 0 && (i2 = options.outHeight) > 0) {
                        int iMax = Math.max(i3, i2);
                        int iMax2 = Math.max(1, i * 2);
                        int i4 = 1;
                        while (iMax / i4 > iMax2 && i4 < 64) {
                            i4 *= 2;
                        }
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inSampleSize = i4;
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options2);
                        if (bitmapDecodeFile == null) {
                            return null;
                        }
                        int width = bitmapDecodeFile.getWidth();
                        int height = bitmapDecodeFile.getHeight();
                        if (width > 0 && height > 0) {
                            float f = i;
                            float f2 = width;
                            float f3 = height;
                            float fMin = Math.min(f / f2, f / f3);
                            if (fMin > 0.0f) {
                                int iMax3 = Math.max(1, Math.round(f2 * fMin));
                                int iMax4 = Math.max(1, Math.round(f3 * fMin));
                                if (iMax3 != width || iMax4 != height) {
                                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeFile, iMax3, iMax4, true);
                                    if (bitmapCreateScaledBitmap != bitmapDecodeFile) {
                                        bitmapDecodeFile.recycle();
                                    }
                                    return bitmapCreateScaledBitmap;
                                }
                            }
                        }
                        return bitmapDecodeFile;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R0 */
    public static C0540y m564R0(String str, String str2) throws C0323m1, IOException {
        String strTrim = str.trim();
        if (strTrim.length() > 40) {
            strTrim = strTrim.substring(0, 40);
        }
        String strM532G1 = m532G1(str2);
        if ("__uncategorized__".equals(str2)) {
            strM532G1 = "__uncategorized__";
        }
        String str3 = strTrim.length() > 0 ? "https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com/api/stickers/list?limit=60&q=" + URLEncoder.encode(strTrim, "UTF-8") : "https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com/api/stickers/list?limit=60";
        if (strM532G1.length() > 0) {
            str3 = str3 + "&folder=" + URLEncoder.encode(strM532G1, "UTF-8");
        }
        JSONObject jSONObjectM672y1 = m672y1("GET", str3, null, null);
        JSONArray jSONArrayOptJSONArray = jSONObjectM672y1.optJSONArray("items");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            int iMin = Math.min(jSONArrayOptJSONArray.length(), 60);
            for (int i = 0; i < iMin; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strTrim2 = jSONObjectOptJSONObject.optString("id", "").trim();
                    String strOptString = jSONObjectOptJSONObject.optString("contentUrl", "");
                    if (strOptString == null || strOptString.length() == 0) {
                        strOptString = "";
                    } else if (!strOptString.startsWith("https://") && !strOptString.startsWith("http://")) {
                        strOptString = strOptString.startsWith("/") ? "https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com".concat(strOptString) : "https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com/api/stickers/".concat(strOptString);
                    }
                    if (strTrim2.length() != 0 && strOptString.length() != 0) {
                        arrayList.add(new C0307l1(strTrim2, m578W(jSONObjectOptJSONObject.optString("title", "")), jSONObjectOptJSONObject.optString("mime", "image/png"), strOptString));
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray2 = jSONObjectM672y1.optJSONArray("folders");
        if (jSONArrayOptJSONArray2 != null) {
            int iMin2 = Math.min(jSONArrayOptJSONArray2.length(), 30);
            for (int i2 = 0; i2 < iMin2; i2++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i2);
                if (jSONObjectOptJSONObject2 != null) {
                    String strTrim3 = jSONObjectOptJSONObject2.optString("id", "").trim();
                    String strTrim4 = jSONObjectOptJSONObject2.optString("name", "").trim();
                    if (strTrim3.length() > 0 && strTrim4.length() > 0) {
                        jSONObjectOptJSONObject2.optInt("count", 0);
                        arrayList2.add(new C0291k1(strTrim3, strTrim4));
                    }
                }
            }
        }
        return new C0540y(arrayList, arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R1 */
    public static String m565R1(Object obj) {
        if (obj == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(obj.getClass().getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        if (obj instanceof View) {
            View view = (View) obj;
            try {
                sb.append("[id=");
                sb.append(view.getId());
                sb.append(",size=");
                sb.append(view.getWidth());
                sb.append('x');
                sb.append(view.getHeight());
                sb.append(']');
            } catch (Throwable unused) {
            }
        }
        return m535H1(sb.toString(), 240);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO] complete}, expected: {[GOTO, THROW, INVOKE, THROW, IF, IF, INVOKE, INVOKE, INVOKE, IF, INVOKE] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Not initialized variable reg: 32, insn: 0x0379: INVOKE (r32 I:java.io.Closeable) STATIC call: i5.H(java.io.Closeable):void A[MD:(java.io.Closeable):void (m)] (LINE:890), block:B:216:0x0379 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x037c: IF  (r9 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:252:0x0384 (LINE:893), block:B:217:0x037c */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x022b A[Catch: all -> 0x0210, IOException -> 0x0217, TryCatch #32 {IOException -> 0x0217, all -> 0x0210, blocks: (B:144:0x0224, B:145:0x022b, B:148:0x0246, B:149:0x024d, B:136:0x020b, B:141:0x021e, B:142:0x0221), top: B:272:0x0224 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0347 A[Catch: all -> 0x0072, IOException -> 0x0079, TryCatch #41 {IOException -> 0x0079, all -> 0x0072, blocks: (B:5:0x0026, B:6:0x0031, B:22:0x0065, B:51:0x00cc, B:56:0x00e8, B:205:0x0341, B:206:0x0346, B:50:0x00c1, B:207:0x0347, B:208:0x034e, B:34:0x008a, B:36:0x0096, B:31:0x0080, B:209:0x034f, B:210:0x0356), top: B:239:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0224 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x01c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0063 A[EDGE_INSN: B:284:0x0063->B:21:0x0063 BREAK  A[LOOP:0: B:6:0x0031->B:19:0x005f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX INFO: renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0461t0 m566S(Context context, File file, int i, int i2, C0507ve c0507ve) throws IOException {
        Closeable closeableM533H;
        MediaCodec mediaCodec;
        int i3;
        boolean z;
        long j;
        int iMax;
        boolean z2;
        boolean z3;
        C0471ta c0471ta;
        MediaCodec mediaCodec2;
        FileOutputStream fileOutputStream;
        boolean z4;
        boolean z5;
        int iDequeueOutputBuffer;
        String string;
        boolean z6;
        File fileM658u = m658u(context);
        long usableSpace = fileM658u.getUsableSpace();
        if (usableSpace < 69206016) {
            C0479u2.m1038c("not enough storage for decoded audio");
            return null;
        }
        File fileM627j1 = m627j1(fileM658u, "Elaris-local-audio-pcm-", ".pcm");
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            try {
                m670y(c0507ve);
                mediaExtractor.setDataSource(file.getAbsolutePath());
                i3 = 0;
            } catch (Throwable th) {
                m533H(closeableM533H);
                if (mediaCodec != null) {
                    try {
                        mediaCodec.stop();
                    } catch (Throwable unused) {
                    }
                    try {
                        mediaCodec.release();
                    } catch (Throwable unused2) {
                    }
                }
                try {
                    mediaExtractor.release();
                } catch (Throwable unused3) {
                }
                if ("Elaris-local-audio-pcm-" != 0) {
                    throw th;
                }
                m572U(fileM627j1);
                throw th;
            }
        } catch (IOException e) {
            e = e;
        } catch (Throwable th2) {
            th = th2;
        }
        while (true) {
            if (i3 >= mediaExtractor.getTrackCount()) {
                i3 = -1;
                break;
            }
            try {
                string = mediaExtractor.getTrackFormat(i3).getString("mime");
            } catch (Throwable unused4) {
            }
            if (string == null) {
                z6 = false;
                if (!z6) {
                    break;
                }
                i3++;
            } else {
                String lowerCase = string.toLowerCase(Locale.US);
                if (lowerCase.startsWith("audio/") || "application/ogg".equals(lowerCase)) {
                    z6 = true;
                }
                if (!z6) {
                }
            }
            throw new IOException("audio decode failed: " + th.getClass().getSimpleName());
        }
        if (i3 < 0) {
            throw new IOException("audio track missing");
        }
        MediaFormat trackFormat = mediaExtractor.getTrackFormat(i3);
        String string2 = trackFormat.getString("mime");
        String lowerCase2 = string2 == null ? "" : string2.toLowerCase(Locale.US);
        if (lowerCase2 == null) {
            z = false;
            if (z) {
                throw new IOException("audio mime missing");
            }
            long j2 = trackFormat.containsKey("durationUs") ? trackFormat.getLong("durationUs") : -1L;
            long jMax = (usableSpace - 33554432) - Math.max(33554432L, (j2 <= 0 ? 0L : (Math.max(1L, i2) * j2) / 8000000) + 8388608);
            if (jMax < 2097152) {
                throw new IOException("not enough storage for decoded audio");
            }
            try {
                trackFormat.setInteger("pcm-encoding", 2);
            } catch (Throwable unused5) {
            }
            mediaExtractor.selectTrack(i3);
            MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string2);
            try {
                mediaCodecCreateDecoderByType.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
                mediaCodecCreateDecoderByType.start();
                int iM608e1 = m608e1(trackFormat, "sample-rate", 44100);
                int iM608e12 = m608e1(trackFormat, "channel-count", 1);
                int iM608e13 = m608e1(trackFormat, "pcm-encoding", 2);
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileM627j1);
                try {
                    C0471ta c0471ta2 = new C0471ta(i, fileOutputStream2, jMax);
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    int iM608e14 = iM608e12;
                    long jNanoTime = System.nanoTime();
                    boolean z7 = false;
                    for (boolean z8 = false; !z8; z8 = z3) {
                        try {
                            m670y(c0507ve);
                            File file2 = fileM627j1;
                            boolean z9 = z7;
                            try {
                                if (z9) {
                                    z3 = z8;
                                } else {
                                    z3 = z8;
                                    try {
                                        int iDequeueInputBuffer = mediaCodecCreateDecoderByType.dequeueInputBuffer(10000L);
                                        if (iDequeueInputBuffer >= 0) {
                                            ByteBuffer inputBuffer = mediaCodecCreateDecoderByType.getInputBuffer(iDequeueInputBuffer);
                                            if (inputBuffer == null) {
                                                mediaCodec2 = mediaCodecCreateDecoderByType;
                                                throw new IOException("audio decoder input missing");
                                            }
                                            inputBuffer.clear();
                                            fileOutputStream = fileOutputStream2;
                                            try {
                                                long sampleTime = mediaExtractor.getSampleTime();
                                                int sampleData = mediaExtractor.readSampleData(inputBuffer, 0);
                                                if (sampleData < 0) {
                                                    MediaCodec mediaCodec3 = mediaCodecCreateDecoderByType;
                                                    try {
                                                        mediaCodec3.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                                                        c0471ta = c0471ta2;
                                                        mediaCodec2 = mediaCodec3;
                                                        z9 = true;
                                                    } catch (IOException e2) {
                                                        e = e2;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                    }
                                                } else {
                                                    c0471ta = c0471ta2;
                                                    MediaCodec mediaCodec4 = mediaCodecCreateDecoderByType;
                                                    try {
                                                        mediaCodec4.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, Math.max(0L, sampleTime), 0);
                                                        mediaCodec2 = mediaCodec4;
                                                        mediaExtractor.advance();
                                                    } catch (IOException e3) {
                                                        e = e3;
                                                        mediaCodec2 = mediaCodec4;
                                                        throw e;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        mediaCodec2 = mediaCodec4;
                                                    }
                                                }
                                                z4 = true;
                                            } catch (IOException e4) {
                                                e = e4;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                throw new IOException("audio decode failed: " + th.getClass().getSimpleName());
                                            }
                                        }
                                        iDequeueOutputBuffer = mediaCodec2.dequeueOutputBuffer(bufferInfo, 10000L);
                                        if (iDequeueOutputBuffer != -2) {
                                            try {
                                                MediaFormat outputFormat = mediaCodec2.getOutputFormat();
                                                iM608e1 = m608e1(outputFormat, "sample-rate", iM608e1);
                                                iM608e14 = m608e1(outputFormat, "channel-count", iM608e14);
                                                iM608e13 = m608e1(outputFormat, "pcm-encoding", iM608e13);
                                                z4 = true;
                                            } catch (IOException e5) {
                                                e = e5;
                                                throw e;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                throw new IOException("audio decode failed: " + th.getClass().getSimpleName());
                                            }
                                        } else {
                                            if (iDequeueOutputBuffer >= 0) {
                                                try {
                                                    if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                                        ByteBuffer outputBuffer = mediaCodec2.getOutputBuffer(iDequeueOutputBuffer);
                                                        if (outputBuffer == null) {
                                                            throw new IOException("audio decoder output missing");
                                                        }
                                                        m550M1(outputBuffer, bufferInfo, "audio decoder output invalid");
                                                        c0471ta.m1035g(outputBuffer, iM608e1, iM608e14, iM608e13);
                                                    }
                                                    if ((bufferInfo.flags & 4) != 0) {
                                                        z3 = true;
                                                    }
                                                    z5 = false;
                                                    mediaCodec2.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                                    z4 = true;
                                                } catch (Throwable th7) {
                                                    mediaCodec2.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                                    throw th7;
                                                }
                                            }
                                            if (z4) {
                                                try {
                                                    jNanoTime = System.nanoTime();
                                                } catch (IOException e6) {
                                                    e = e6;
                                                    throw e;
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    throw new IOException("audio decode failed: " + th.getClass().getSimpleName());
                                                }
                                            } else if (System.nanoTime() - jNanoTime > 30000000000L) {
                                                throw new IOException("audio decoder stalled");
                                            }
                                            z7 = z9;
                                            mediaCodecCreateDecoderByType = mediaCodec2;
                                            fileM627j1 = file2;
                                            fileOutputStream2 = fileOutputStream;
                                            c0471ta2 = c0471ta;
                                        }
                                        z5 = false;
                                        if (z4) {
                                        }
                                        z7 = z9;
                                        mediaCodecCreateDecoderByType = mediaCodec2;
                                        fileM627j1 = file2;
                                        fileOutputStream2 = fileOutputStream;
                                        c0471ta2 = c0471ta;
                                    } catch (IOException e7) {
                                        e = e7;
                                    } catch (Throwable th9) {
                                        th = th9;
                                    }
                                }
                                iDequeueOutputBuffer = mediaCodec2.dequeueOutputBuffer(bufferInfo, 10000L);
                                if (iDequeueOutputBuffer != -2) {
                                }
                                z5 = false;
                                if (z4) {
                                }
                                z7 = z9;
                                mediaCodecCreateDecoderByType = mediaCodec2;
                                fileM627j1 = file2;
                                fileOutputStream2 = fileOutputStream;
                                c0471ta2 = c0471ta;
                            } catch (IOException e8) {
                                e = e8;
                                z5 = false;
                            } catch (Throwable th10) {
                                th = th10;
                                z5 = false;
                            }
                            c0471ta = c0471ta2;
                            mediaCodec2 = mediaCodecCreateDecoderByType;
                            fileOutputStream = fileOutputStream2;
                            z4 = false;
                        } catch (IOException e9) {
                            throw e9;
                        } catch (Throwable th11) {
                            th = th11;
                        }
                    }
                    C0471ta c0471ta3 = c0471ta2;
                    MediaCodec mediaCodec5 = mediaCodecCreateDecoderByType;
                    File file3 = fileM627j1;
                    FileOutputStream fileOutputStream3 = fileOutputStream2;
                    try {
                        c0471ta3.m1033e();
                        fileOutputStream3.flush();
                        long length = file3.length();
                        long j3 = c0471ta3.f916l;
                        if (length < 2 || j3 <= 0) {
                            try {
                                throw new IOException("audio decode empty");
                            } catch (IOException e10) {
                                e = e10;
                            } catch (Throwable th12) {
                                th = th12;
                                throw new IOException("audio decode failed: " + th.getClass().getSimpleName());
                            }
                        } else {
                            long j4 = i;
                            long j5 = ((j3 + j4) - 1) / j4;
                            if (j5 > 2147483647L) {
                                iMax = Integer.MAX_VALUE;
                                j = j3;
                            } else {
                                j = j3;
                                iMax = (int) Math.max(1L, j5);
                            }
                            HookEntry.log("local voice audio decoded mime=" + m526E1(lowerCase2) + " source_rate=" + iM608e1 + " source_channels=" + iM608e14 + " pcm_encoding=" + iM608e13 + " output_rate=" + i + " seconds=" + iMax);
                            try {
                                z2 = true;
                                try {
                                    C0461t0 c0461t0 = new C0461t0(file3, length, j, iMax);
                                    m533H(fileOutputStream3);
                                    try {
                                        mediaCodec5.stop();
                                    } catch (Throwable unused6) {
                                    }
                                    try {
                                        mediaCodec5.release();
                                    } catch (Throwable unused7) {
                                    }
                                    try {
                                        mediaExtractor.release();
                                    } catch (Throwable unused8) {
                                    }
                                    return c0461t0;
                                } catch (IOException e11) {
                                    e = e11;
                                    throw e;
                                } catch (Throwable th13) {
                                    th = th13;
                                    throw new IOException("audio decode failed: " + th.getClass().getSimpleName());
                                }
                            } catch (IOException e12) {
                                e = e12;
                                z2 = true;
                            } catch (Throwable th14) {
                                th = th14;
                                z2 = true;
                            }
                        }
                    } catch (IOException e13) {
                        e = e13;
                    } catch (Throwable th15) {
                        th = th15;
                    }
                } catch (IOException e14) {
                    e = e14;
                } catch (Throwable th16) {
                    th = th16;
                }
                throw e;
            } catch (IOException e15) {
                e = e15;
                throw e;
            } catch (Throwable th17) {
                th = th17;
            }
        } else {
            String lowerCase3 = lowerCase2.toLowerCase(Locale.US);
            if (lowerCase3.startsWith("audio/") || "application/ogg".equals(lowerCase3)) {
                z = true;
            }
            if (z) {
            }
        }
        throw new IOException("audio decode failed: " + th.getClass().getSimpleName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S0 */
    public static List m567S0(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S1 */
    public static String m568S1(Object obj) {
        String string;
        return (obj == null || (string = obj.toString()) == null) ? "" : string.trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static Object m569T(Class cls) {
        if (cls != null && cls.isPrimitive()) {
            if (cls == Boolean.TYPE) {
                return Boolean.FALSE;
            }
            if (cls == Byte.TYPE) {
                return (byte) 0;
            }
            if (cls == Short.TYPE) {
                return (short) 0;
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
            if (cls == Character.TYPE) {
                return (char) 0;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T0 */
    public static void m570T0(Activity activity, Dialog dialog, TextView textView, ListView listView, C0565z8 c0565z8, C0533x8 c0533x8) {
        C0314l8 c0314l8 = c0533x8.f1042a;
        if (c0314l8 != null) {
            c0314l8.m752a();
        }
        c0533x8.f1042a = null;
        C0314l8 c0314l82 = new C0314l8();
        C0314l8 c0314l83 = (C0314l8) AbstractC0010a9.f39a.getAndSet(c0314l82);
        if (c0314l83 != null && c0314l83 != c0314l82) {
            c0314l83.m752a();
        }
        c0533x8.f1042a = c0314l82;
        textView.setText("正在加载音色");
        textView.setTextColor(AbstractC0486u9.m1043E(activity));
        textView.setClickable(false);
        textView.setOnClickListener(null);
        RunnableC0485u8 runnableC0485u8 = new RunnableC0485u8(c0314l82, new Handler(Looper.getMainLooper()), c0533x8, dialog, c0565z8, textView, listView, activity);
        ThreadPoolExecutor threadPoolExecutor = AbstractC0010a9.f41c;
        if (threadPoolExecutor != null) {
            try {
                threadPoolExecutor.execute(runnableC0485u8);
                return;
            } catch (RejectedExecutionException unused) {
            }
        }
        AbstractC0010a9.m72a(c0314l82);
        c0314l82.m752a();
        HookEntry.log("kk tts catalog task rejected");
        textView.setText("音色加载失败，点击重试");
        textView.setTextColor(AbstractC0486u9.m1050c(activity));
        textView.setClickable(true);
        textView.setOnClickListener(new ViewOnClickListenerC0405p8(activity, dialog, textView, listView, c0565z8, c0533x8, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T1 */
    public static byte[] m571T1(int i) throws IOException {
        int i2 = 0;
        while (true) {
            if (i2 >= 7) {
                i2 = -1;
                break;
            }
            if (f389j[i2] == i) {
                break;
            }
            i2++;
        }
        if (i2 < 0) {
            C0479u2.m1038c("silk sample rate unsupported");
            return null;
        }
        byte[] bArr = new byte[10];
        bArr[0] = (byte) i2;
        System.arraycopy(f390k, 0, bArr, 1, 9);
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static void m572U(File file) {
        if (file == null) {
            return;
        }
        try {
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0081 A[SYNTHETIC] */
    /* JADX INFO: renamed from: U0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m573U0(Context context, Object obj, int i, String str) {
        Method[] declaredMethods;
        Class<?> returnType;
        Bitmap bitmapM599c0;
        Object[] objArrM623i0;
        if (i > 0) {
            for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                try {
                    declaredMethods = superclass.getDeclaredMethods();
                } catch (Throwable unused) {
                    declaredMethods = null;
                }
                if (declaredMethods != null) {
                    for (Method method : declaredMethods) {
                        if (method != null && str.equals(method.getName()) && !Modifier.isStatic(method.getModifiers()) && (returnType = method.getReturnType()) != null && returnType != Void.TYPE && !returnType.isPrimitive() && ((Drawable.class.isAssignableFrom(returnType) || returnType == Object.class) && method.getParameterTypes().length <= 6)) {
                            try {
                                objArrM623i0 = m623i0(context, method.getParameterTypes(), i);
                            } catch (Throwable unused2) {
                            }
                            if (objArrM623i0 == null) {
                                bitmapM599c0 = null;
                                if (bitmapM599c0 == null) {
                                    return bitmapM599c0;
                                }
                            } else {
                                method.setAccessible(true);
                                Object objInvoke = method.invoke(obj, objArrM623i0);
                                if (!(objInvoke instanceof Drawable) || (bitmapM599c0 = m599c0((Drawable) objInvoke, i)) == null || m537I0(bitmapM599c0)) {
                                }
                                if (bitmapM599c0 == null) {
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
    /* JADX INFO: renamed from: U1 */
    public static TextView m574U1(Context context, String str, float f, int i, boolean z) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(f);
        textView.setTextColor(i);
        if (z) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        return textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static String m575V(Object obj, int i, Set set) {
        if (obj == null) {
            return "null";
        }
        if (i > 3) {
            return m535H1(String.valueOf(obj), 240);
        }
        if ((obj instanceof CharSequence) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Enum)) {
            return m535H1(String.valueOf(obj), 500);
        }
        if (obj instanceof View) {
            return m565R1(obj);
        }
        if (set != null && !set.add(obj)) {
            return "<seen " + obj.getClass().getName() + ">";
        }
        int i2 = 0;
        if (obj instanceof Bundle) {
            Bundle bundle = (Bundle) obj;
            StringBuilder sb = new StringBuilder("Bundle{");
            try {
                for (String str : bundle.keySet()) {
                    int i3 = i2 + 1;
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(str);
                    sb.append('=');
                    sb.append(m575V(bundle.get(str), i + 1, set));
                    if (i3 >= 20) {
                        break;
                    }
                    i2 = i3;
                }
            } catch (Throwable th) {
                sb.append("error=");
                sb.append(th);
            }
            sb.append('}');
            return m535H1(sb.toString(), 900);
        }
        if (obj instanceof Map) {
            StringBuilder sb2 = new StringBuilder("Map{");
            Iterator it = ((Map) obj).entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                int i4 = i2 + 1;
                if (i2 > 0) {
                    sb2.append(", ");
                }
                int i5 = i + 1;
                sb2.append(m575V(entry.getKey(), i5, set));
                sb2.append('=');
                sb2.append(m575V(entry.getValue(), i5, set));
                if (i4 >= 20) {
                    sb2.append(", ...");
                    break;
                }
                i2 = i4;
            }
            sb2.append('}');
            return m535H1(sb2.toString(), 900);
        }
        if (obj instanceof Iterable) {
            StringBuilder sb3 = new StringBuilder("Iterable[");
            Iterator it2 = ((Iterable) obj).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                int i6 = i2 + 1;
                if (i2 > 0) {
                    sb3.append(", ");
                }
                sb3.append(m575V(next, i + 1, set));
                if (i6 >= 20) {
                    sb3.append(", ...");
                    break;
                }
                i2 = i6;
            }
            sb3.append(']');
            return m535H1(sb3.toString(), 900);
        }
        Class<?> cls = obj.getClass();
        if (!cls.isArray()) {
            return m535H1(cls.getName() + "{" + String.valueOf(obj) + "}", 700);
        }
        StringBuilder sb4 = new StringBuilder("Array[");
        int iMin = Math.min(Array.getLength(obj), 20);
        while (i2 < iMin) {
            if (i2 > 0) {
                sb4.append(", ");
            }
            sb4.append(m575V(Array.get(obj, i2), i + 1, set));
            i2++;
        }
        if (Array.getLength(obj) > iMin) {
            sb4.append(", ...");
        }
        sb4.append(']');
        return m535H1(sb4.toString(), 900);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V0 */
    public static ArrayList m576V0(C0314l8 c0314l8) throws IOException {
        List list = f386g;
        if (list != null && System.currentTimeMillis() - f387h < 600000) {
            return new ArrayList(list);
        }
        try {
            ArrayList arrayListM629k0 = m629k0(c0314l8);
            f386g = Collections.unmodifiableList(new ArrayList(arrayListM629k0));
            f387h = System.currentTimeMillis();
            return new ArrayList(arrayListM629k0);
        } catch (IOException e) {
            if (list == null || list.isEmpty()) {
                throw e;
            }
            HookEntry.log("kk tts catalog stale fallback count=" + list.size());
            return new ArrayList(list);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V1 */
    public static final Object[] m577V1(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        return Arrays.copyOf(objArrCopyOf, i2);
                    }
                    i = i2;
                }
            }
        }
        return f384e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static String m578W(String str) {
        String strTrim = str == null ? "" : str.trim();
        return ("用户上传".equals(strTrim) || "User upload".equalsIgnoreCase(strTrim)) ? "" : strTrim.length() <= 30 ? strTrim : strTrim.substring(0, 30);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W0 */
    public static void m579W0(String str, String str2, String str3, String str4) {
        HookEntry.log("group admin: group=" + str + ", sender=" + str2 + ", event=" + str3 + ", detail=" + str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W1 */
    public static final Object[] m580W1(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static File m581X(Context context, C0307l1 c0307l1) throws IOException {
        FileOutputStream fileOutputStream;
        Throwable th;
        InputStream inputStream;
        File file = new File(context.getCacheDir(), "elaris_cloud_stickers");
        if (!file.exists() && !file.mkdirs()) {
            C0479u2.m1037b("cache_unavailable");
            return null;
        }
        String str = c0307l1.f509c;
        File file2 = new File(file, c0307l1.f507a + "." + ("image/jpeg".equalsIgnoreCase(str) ? "jpg" : "image/gif".equalsIgnoreCase(str) ? "gif" : "image/webp".equalsIgnoreCase(str) ? "webp" : "png"));
        long j = 0;
        if (file2.isFile() && file2.length() > 0) {
            return file2;
        }
        HttpURLConnection httpURLConnectionM630k1 = m630k1("GET", c0307l1.f510d);
        int responseCode = httpURLConnectionM630k1.getResponseCode();
        if (responseCode < 200 || responseCode >= 300) {
            httpURLConnectionM630k1.disconnect();
            throw new IllegalStateException("download_http_" + responseCode);
        }
        try {
            inputStream = httpURLConnectionM630k1.getInputStream();
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i < 0) {
                            fileOutputStream.flush();
                            return file2;
                        }
                        j += (long) i;
                        if (j > 5242880) {
                            throw new IllegalStateException("download_too_large");
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        file2.delete();
                        throw th;
                    } finally {
                        m524E(inputStream);
                        m524E(fileOutputStream);
                        httpURLConnectionM630k1.disconnect();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Throwable th4) {
            fileOutputStream = null;
            th = th4;
            inputStream = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X0 */
    public static void m582X0(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f380a < 5000) {
            return;
        }
        f380a = jCurrentTimeMillis;
        HookEntry.log("friend-list empty reason=".concat(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X1 */
    public static void m583X1(Context context, String str) {
        if (context == null || str.length() == 0) {
            return;
        }
        try {
            Toast.makeText(context, str, 0).show();
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static byte[] m584Y(C0307l1 c0307l1) throws IOException {
        HttpURLConnection httpURLConnectionM630k1 = m630k1("GET", c0307l1.f510d);
        int responseCode = httpURLConnectionM630k1.getResponseCode();
        if (responseCode >= 200 && responseCode < 300) {
            try {
                return m663v1(httpURLConnectionM630k1.getInputStream(), 5242880L);
            } finally {
                httpURLConnectionM630k1.disconnect();
            }
        }
        httpURLConnectionM630k1.disconnect();
        throw new IllegalStateException("preview_http_" + responseCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y0 */
    public static void m585Y0(String str, int i, int i2, int i3, File file) {
        long length = file.length();
        HookEntry.log("local voice audio transcode codec=" + m526E1(str) + " sample_rate=" + i + " target_bps=" + i2 + " actual_bps=" + (i3 <= 0 ? 0L : (8 * length) / ((long) Math.max(1, i3))) + " seconds=" + i3 + " bytes=" + length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016f  */
    /* JADX INFO: renamed from: Y1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CharSequence m586Y1(EditText editText, String str, Object obj, boolean z, C0465t4 c0465t4) {
        String str2;
        int iIndexOf;
        int iIndexOf2;
        if (!z) {
            return str;
        }
        if (c0465t4 == null) {
            Context context = editText.getContext();
            int iM595b0 = m595b0(context, 2);
            if (context == null || !z) {
                c0465t4 = null;
            } else {
                int iM595b02 = m595b0(context, 34);
                Bitmap bitmapM573U0 = m573U0(context, obj, iM595b02, "getZoomDrawable");
                if (bitmapM573U0 == null) {
                    bitmapM573U0 = m573U0(context, obj, iM595b02, "getDrawable");
                }
                if (bitmapM573U0 == null) {
                    ArrayList arrayList = new ArrayList();
                    Object objM632l0 = m632l0(obj, "path");
                    String strValueOf = objM632l0 == null ? null : String.valueOf(objM632l0);
                    Object objM632l02 = m632l0(obj, "resID");
                    String strValueOf2 = objM632l02 == null ? null : String.valueOf(objM632l02);
                    m622i(strValueOf, arrayList);
                    m622i(strValueOf2, arrayList);
                    if (strValueOf != null && strValueOf.length() > 0) {
                        File file = new File(strValueOf);
                        File parentFile = file.getParentFile();
                        if (strValueOf2 == null) {
                            str2 = null;
                            if (strValueOf2 != null && strValueOf2.length() > 0) {
                                m622i(new File(file, strValueOf2).getAbsolutePath(), arrayList);
                                iIndexOf2 = strValueOf2.indexOf(95);
                                if (iIndexOf2 >= 0 && iIndexOf2 + 1 < strValueOf2.length()) {
                                    m622i(new File(file, file.getName() + strValueOf2.substring(iIndexOf2)).getAbsolutePath(), arrayList);
                                }
                                m606e(file, str2, arrayList);
                                m618h(file, str2, arrayList);
                            }
                            if (parentFile != null && strValueOf2 != null && strValueOf2.length() > 0) {
                                m622i(new File(parentFile, strValueOf2).getAbsolutePath(), arrayList);
                                iIndexOf = strValueOf2.indexOf(95);
                                if (iIndexOf >= 0 && iIndexOf + 1 < strValueOf2.length()) {
                                    m622i(new File(parentFile, file.getName() + strValueOf2.substring(iIndexOf)).getAbsolutePath(), arrayList);
                                }
                                m606e(parentFile, str2, arrayList);
                                m618h(parentFile, str2, arrayList);
                            }
                        } else {
                            String[] strArrSplit = strValueOf2.split("_");
                            loop0: for (int i = 0; i < strArrSplit.length; i++) {
                                str2 = strArrSplit[i];
                                if (str2 != null && str2.length() >= 16 && str2.length() != 0) {
                                    for (int i2 = 0; i2 < str2.length(); i2++) {
                                        char cCharAt = str2.charAt(i2);
                                        if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'f') && (cCharAt < 'A' || cCharAt > 'F'))) {
                                            break;
                                        }
                                    }
                                    break loop0;
                                }
                            }
                            str2 = null;
                            if (strValueOf2 != null) {
                                m622i(new File(file, strValueOf2).getAbsolutePath(), arrayList);
                                iIndexOf2 = strValueOf2.indexOf(95);
                                if (iIndexOf2 >= 0) {
                                    m622i(new File(file, file.getName() + strValueOf2.substring(iIndexOf2)).getAbsolutePath(), arrayList);
                                }
                                m606e(file, str2, arrayList);
                                m618h(file, str2, arrayList);
                            }
                            if (parentFile != null) {
                                m622i(new File(parentFile, strValueOf2).getAbsolutePath(), arrayList);
                                iIndexOf = strValueOf2.indexOf(95);
                                if (iIndexOf >= 0) {
                                    m622i(new File(parentFile, file.getName() + strValueOf2.substring(iIndexOf)).getAbsolutePath(), arrayList);
                                }
                                m606e(parentFile, str2, arrayList);
                                m618h(parentFile, str2, arrayList);
                            }
                        }
                    }
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            m592a1(obj, "favorite", arrayList.size());
                            bitmapM573U0 = null;
                            break;
                        }
                        Bitmap bitmapM563R = m563R((String) arrayList.get(i3), iM595b02);
                        if (bitmapM563R != null) {
                            bitmapM573U0 = bitmapM563R;
                            break;
                        }
                        i3++;
                    }
                }
                if (bitmapM573U0 != null) {
                    c0465t4 = new C0465t4(bitmapM573U0, iM595b0, iM595b02);
                }
            }
        }
        if (c0465t4 == null) {
            m592a1(obj, "token", -2);
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(c0465t4, 0, str.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static File m587Z(Context context, String str, C0314l8 c0314l8) throws IOException {
        URL url = new URL(str);
        boolean z = false;
        int i = 0;
        while (i <= 2) {
            if (!m516B0(url.toString())) {
                C0479u2.m1038c("script silk url rejected");
                return null;
            }
            try {
                HttpURLConnection httpURLConnectionM633l1 = m633l1(url, c0314l8);
                httpURLConnectionM633l1.setInstanceFollowRedirects(false);
                httpURLConnectionM633l1.setRequestProperty("Accept", "audio/*,application/octet-stream");
                int responseCode = httpURLConnectionM633l1.getResponseCode();
                if (responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                    if (responseCode == 200) {
                        if (httpURLConnectionM633l1.getContentLengthLong() > 12582912) {
                            throw new IOException("script silk file too large");
                        }
                        String contentType = httpURLConnectionM633l1.getContentType();
                        if (contentType != null) {
                            String lowerCase = contentType.toLowerCase(Locale.US);
                            if (lowerCase.startsWith("text/") || lowerCase.contains("json")) {
                                throw new IOException("script silk content invalid");
                            }
                        }
                        File fileM621h2 = m621h2(context, httpURLConnectionM633l1.getInputStream(), c0314l8);
                        m527F(httpURLConnectionM633l1, c0314l8);
                        return fileM621h2;
                    }
                    if (responseCode == 429 || (responseCode >= 500 && responseCode <= 599)) {
                        z = true;
                    }
                    if (z) {
                        throw new C0346n8("script silk download http " + responseCode);
                    }
                    throw new IOException("script silk download http " + responseCode);
                }
                String headerField = httpURLConnectionM633l1.getHeaderField("Location");
                if (headerField == null || i >= 2) {
                    throw new IOException("script silk redirect rejected");
                }
                URL url2 = new URL(url, headerField);
                m527F(httpURLConnectionM633l1, c0314l8);
                i++;
                url = url2;
            } catch (Throwable th) {
                m527F(null, c0314l8);
                throw th;
            }
        }
        C0479u2.m1038c("script silk redirect rejected");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z0 */
    public static void m588Z0(String str, String str2, Throwable th) {
        HookEntry.log("group admin error: group=" + str + ", event=" + str2 + ", " + th);
        AbstractC0198e7.m343a("group-admin", str2, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z1 */
    public static void m589Z1(Context context, Uri uri, String str, String str2) throws ProtocolException, C0323m1 {
        long j;
        OutputStream outputStream;
        ContentResolver contentResolver = context.getContentResolver();
        String type = contentResolver.getType(uri);
        byte[] bArrM663v1 = m663v1(contentResolver.openInputStream(uri), 5242880L);
        byte b = 255;
        if (type == null || !m552N0(type)) {
            if (bArrM663v1 == null) {
                j = 5242880;
            } else {
                if (bArrM663v1.length >= 3 && (bArrM663v1[0] & 255) == 255 && (bArrM663v1[1] & 255) == 216 && (bArrM663v1[2] & 255) == 255) {
                    type = "image/jpeg";
                } else if (bArrM663v1.length >= 8 && (bArrM663v1[0] & 255) == 137 && bArrM663v1[1] == 80 && bArrM663v1[2] == 78 && bArrM663v1[3] == 71) {
                    type = "image/png";
                } else {
                    if (bArrM663v1.length >= 6) {
                        j = 5242880;
                        String str3 = new String(bArrM663v1, 0, 6, StandardCharsets.US_ASCII);
                        if ("GIF87a".equals(str3) || "GIF89a".equals(str3)) {
                            type = "image/gif";
                        }
                    } else {
                        j = 5242880;
                    }
                    if (bArrM663v1.length >= 12 && bArrM663v1[0] == 82 && bArrM663v1[1] == 73 && bArrM663v1[2] == 70 && bArrM663v1[3] == 70 && bArrM663v1[8] == 87 && bArrM663v1[9] == 69 && bArrM663v1[10] == 66 && bArrM663v1[11] == 80) {
                        type = "image/webp";
                    }
                }
                j = 5242880;
            }
            type = "";
        } else {
            j = 5242880;
        }
        long length = bArrM663v1.length;
        String str4 = !m552N0(type) ? "仅支持 JPG、PNG、GIF 和 WebP 表情" : length <= 0 ? "无法读取所选表情" : length > j ? "表情不能超过 5 MB" : "";
        if (str4.length() > 0) {
            throw new C0323m1(str4);
        }
        String strM578W = m578W(str);
        String strM532G1 = m532G1(str2);
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArrM663v1);
        StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
        int i = 0;
        while (i < bArrDigest.length) {
            sb.append(String.format(Locale.US, "%02x", Integer.valueOf(bArrDigest[i] & b)));
            i++;
            b = 255;
        }
        String string = sb.toString();
        HttpURLConnection httpURLConnectionM630k1 = m630k1("POST", "https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com/api/stickers/upload");
        try {
            httpURLConnectionM630k1.setDoOutput(true);
            httpURLConnectionM630k1.setRequestProperty("Content-Type", type);
            httpURLConnectionM630k1.setRequestProperty("X-Elaris-Upload-Key", m593a2(context));
            httpURLConnectionM630k1.setRequestProperty("X-Elaris-Upload-Title", URLEncoder.encode(strM578W, "UTF-8").replace("+", "%20"));
            if (strM532G1.length() == 0) {
                strM532G1 = "other";
            }
            httpURLConnectionM630k1.setRequestProperty("X-Elaris-Upload-Category", URLEncoder.encode(strM532G1, "UTF-8").replace("+", "%20"));
            httpURLConnectionM630k1.setRequestProperty("X-Elaris-Upload-Sha256", string);
            httpURLConnectionM630k1.setFixedLengthStreamingMode(bArrM663v1.length);
            try {
                outputStream = httpURLConnectionM630k1.getOutputStream();
                try {
                    outputStream.write(bArrM663v1);
                    outputStream.flush();
                    m524E(outputStream);
                    int responseCode = httpURLConnectionM630k1.getResponseCode();
                    String str5 = new String(m663v1((responseCode < 200 || responseCode >= 300) ? httpURLConnectionM630k1.getErrorStream() : httpURLConnectionM630k1.getInputStream(), 524288L), StandardCharsets.UTF_8);
                    JSONObject jSONObject = str5.length() == 0 ? new JSONObject() : new JSONObject(str5);
                    if (responseCode >= 200 && responseCode < 300) {
                        if (jSONObject.optBoolean("ok", responseCode < 300)) {
                            httpURLConnectionM630k1.disconnect();
                            jSONObject.optString("id", "");
                            return;
                        }
                    }
                    throw new C0323m1(m547L1(jSONObject.optString("message", "http_" + responseCode)));
                } catch (Throwable th) {
                    th = th;
                    m524E(outputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
            }
        } catch (Throwable th3) {
            httpURLConnectionM630k1.disconnect();
            throw th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m590a(File file) {
        if (file == null) {
            return;
        }
        try {
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static int m591a0(Context context, float f) {
        return Math.max(1, (int) ((f * (context == null ? 1.0f : context.getResources().getDisplayMetrics().density)) + 0.5f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a1 */
    public static void m592a1(Object obj, String str, int i) {
        if (HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - f399t < 3000) {
                return;
            }
            f399t = jCurrentTimeMillis;
            HookEntry.log("favorite emoticon preview miss source=" + str + " candidates=" + i + " object=" + m626j0(obj));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a2 */
    public static String m593a2(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("elaris_cloud_stickers", 0);
        String string = sharedPreferences.getString("upload_token", "");
        if (string != null && string.length() >= 32) {
            return string;
        }
        String str = UUID.randomUUID().toString() + UUID.randomUUID().toString();
        sharedPreferences.edit().putString("upload_token", str).apply();
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static Activity m594b(Context context) {
        for (int i = 0; i < 8 && context != null; i++) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static int m595b0(Context context, int i) {
        if (context != null) {
            try {
                return Math.max(1, Math.round(i * context.getResources().getDisplayMetrics().density));
            } catch (Throwable unused) {
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b1 */
    public static boolean m596b1(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        String strTrim = charSequence.toString().trim();
        if (strTrim.length() == 0 || strTrim.length() > 140 || "发送".equals(strTrim) || "输入消息".equals(strTrim)) {
            return false;
        }
        return strTrim.contains("[动画表情]") || strTrim.contains("[表情]") || strTrim.contains(Prefs.DEFAULT_PIC_SUMMARY) || strTrim.contains(":[") || strTrim.contains("：[");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b2 */
    public static String m597b2(long j, long j2) {
        return j <= 0 ? "视频文件为空" : j > 209715200 ? "视频超过 200 MB" : j2 <= 0 ? "无法读取视频时长" : j2 > 60000 ? "视频泡泡暂支持 60 秒以内的视频" : "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m598c(Object obj, LinkedHashMap linkedHashMap, boolean z) {
        if (obj == null || m549M0(obj.getClass())) {
            return;
        }
        String strM515B = m515B(m656t0(obj));
        if (m534H0(strM515B)) {
            if (z) {
                if (m531G0(obj)) {
                    return;
                }
                String lowerCase = obj.getClass().getName().toLowerCase(Locale.ROOT);
                if (!lowerCase.contains("friend") && !lowerCase.contains("buddy") && !lowerCase.contains("c2c") && !lowerCase.contains("contact") && (!strM515B.startsWith("u_") || m620h1(obj).length() <= 0)) {
                    String strM601c2 = m601c2(obj, "chatType", "uinType", "contactType", "type", "mUinType");
                    int i = Integer.MIN_VALUE;
                    if (strM601c2.length() != 0) {
                        try {
                            i = Integer.parseInt(strM601c2);
                        } catch (Throwable unused) {
                        }
                    }
                    if (i != 0 && i != 1) {
                        return;
                    }
                }
            }
            linkedHashMap.size();
            m654s1(linkedHashMap, strM515B, m620h1(obj), m659u0(obj));
            linkedHashMap.size();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static Bitmap m599c0(Drawable drawable, int i) {
        Bitmap bitmap;
        if (drawable != null && i > 0) {
            try {
                if ((drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && !bitmap.isRecycled()) {
                    return m538I1(bitmap, i, false);
                }
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth <= 0) {
                    intrinsicWidth = i;
                }
                if (intrinsicHeight <= 0) {
                    intrinsicHeight = i;
                }
                int i2 = i * 3;
                int iMin = Math.min(Math.max(1, intrinsicWidth), i2);
                int iMin2 = Math.min(Math.max(1, intrinsicHeight), i2);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Rect rectCopyBounds = drawable.copyBounds();
                drawable.setBounds(0, 0, iMin, iMin2);
                drawable.draw(canvas);
                drawable.setBounds(rectCopyBounds);
                Bitmap bitmapM538I1 = m538I1(bitmapCreateBitmap, i, true);
                if (m537I0(bitmapM538I1)) {
                    return null;
                }
                return bitmapM538I1;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c1 */
    public static boolean m600c1(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        String strTrim = charSequence.toString().trim();
        if (strTrim.length() == 0 || strTrim.length() > 140) {
            return false;
        }
        String lowerCase = strTrim.toLowerCase(Locale.ROOT);
        return lowerCase.contains("reply") || lowerCase.contains("quote") || strTrim.contains("回复") || strTrim.contains("引用");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c2 */
    public static String m601c2(Object obj, String... strArr) {
        if (obj == null) {
            return "";
        }
        for (String str : strArr) {
            try {
                Field fieldM641o0 = m641o0(obj.getClass(), str);
                String strM568S1 = m568S1(fieldM641o0 == null ? null : fieldM641o0.get(obj));
                if (strM568S1.length() > 0) {
                    return strM568S1;
                }
            } catch (Throwable unused) {
            }
            String strM664w = m664w(obj, str);
            if (strM664w.length() > 0) {
                return strM664w;
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b2  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m602d(Object obj, LinkedHashMap linkedHashMap, boolean z, int i, Set set, C0415q2 c0415q2) {
        if (obj == null || i > 4) {
            return;
        }
        int i2 = c0415q2.f732a + 1;
        c0415q2.f732a = i2;
        if (i2 > 1800 || m549M0(obj.getClass())) {
            return;
        }
        try {
            if (!set.add(obj)) {
                return;
            }
        } catch (Throwable unused) {
        }
        m598c(obj, linkedHashMap, z);
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            String strM515B = m515B(key);
            String strM568S1 = value instanceof CharSequence ? m568S1(value) : m620h1(value);
            String strM659u0 = m659u0(value);
            if (m534H0(strM515B) && strM568S1.length() > 0 && (!z || !m531G0(value))) {
                m654s1(linkedHashMap, strM515B, strM568S1, strM659u0);
            }
            m598c(value, linkedHashMap, z);
            int i3 = i + 1;
            m602d(entry.getKey(), linkedHashMap, z, i3, set, c0415q2);
            m602d(entry.getValue(), linkedHashMap, z, i3, set, c0415q2);
            return;
        }
        int i4 = 0;
        if (obj instanceof Map) {
            for (Object obj2 : ((Map) obj).entrySet()) {
                int i5 = i4 + 1;
                if (i5 > 600) {
                    return;
                }
                m602d(obj2, linkedHashMap, z, i + 1, set, c0415q2);
                i4 = i5;
            }
            return;
        }
        if (obj instanceof Iterable) {
            for (Object obj3 : (Iterable) obj) {
                int i6 = i4 + 1;
                if (i6 > 600) {
                    return;
                }
                m602d(obj3, linkedHashMap, z, i + 1, set, c0415q2);
                i4 = i6;
            }
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            int iMin = Math.min(Array.getLength(obj), 600);
            for (int i7 = 0; i7 < iMin; i7++) {
                m602d(Array.get(obj, i7), linkedHashMap, z, i + 1, set, c0415q2);
            }
            return;
        }
        if (i >= 4) {
            return;
        }
        for (Field field : m625j(cls)) {
            if (m556O1(field, i)) {
                try {
                    try {
                        m602d(field.get(obj), linkedHashMap, z, i + 1, set, c0415q2);
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                }
            }
        }
        C0415q2 c0415q22 = c0415q2;
        for (Method method : m628k(cls)) {
            int i8 = c0415q22.f733b + 1;
            c0415q22.f733b = i8;
            if (i8 <= 160 && method != null && !Modifier.isStatic(method.getModifiers()) && method.getParameterTypes().length == 0 && method.getReturnType() != Void.TYPE && !m549M0(method.getReturnType())) {
                String name = method.getName();
                if (!"getClass".equals(name) && !"clone".equals(name) && !"hashCode".equals(name) && !"toString".equals(name)) {
                    if (m517B1(method.getReturnType()) || m522D0(name)) {
                        try {
                            m602d(method.invoke(obj, null), linkedHashMap, z, i + 1, set, c0415q22);
                        } catch (Throwable unused4) {
                        }
                    } else {
                        Class<?> returnType = method.getReturnType();
                        if (m522D0(returnType == null ? "" : returnType.getName())) {
                        }
                    }
                }
            }
            c0415q22 = c0415q2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static boolean m603d0(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return false;
        }
        long j = ((long) i2) * 1000;
        long j2 = i;
        long j3 = 1000 * j2;
        long j4 = j2 * 20;
        return ((j3 > j ? 1 : (j3 == j ? 0 : -1)) >= 0 ? j3 - j : j - j3) <= ((j4 > j ? 1 : (j4 == j ? 0 : -1)) >= 0 ? j4 - j : j - j4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d1 */
    public static LinearLayout.LayoutParams m604d1() {
        return new LinearLayout.LayoutParams(-1, -2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d2 */
    public static void m605d2(File file, long j, long j2) throws IOException {
        if (file == null || file.length() != j || (j2 > 0 && file.lastModified() != j2)) {
            C0479u2.m1038c("audio source changed or incomplete");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m606e(File file, String str, ArrayList arrayList) {
        if (str == null || str.length() == 0) {
            return;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        String upperCase = str.toUpperCase(locale);
        m610f(file, str, arrayList);
        if (!lowerCase.equals(str)) {
            m610f(file, lowerCase, arrayList);
        }
        if (upperCase.equals(str)) {
            return;
        }
        m610f(file, upperCase, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static LinkedHashSet m607e0(String str, boolean z) {
        LinkedHashSet linkedHashSetM639n1 = m639n1(str, true);
        if (linkedHashSetM639n1.isEmpty() && ((str == null || str.trim().length() == 0) && z)) {
            linkedHashSetM639n1.add(1005);
            linkedHashSetM639n1.add(1016);
        }
        return linkedHashSetM639n1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e1 */
    public static int m608e1(MediaFormat mediaFormat, String str, int i) {
        if (mediaFormat != null) {
            try {
                if (mediaFormat.containsKey(str)) {
                    return mediaFormat.getInteger(str);
                }
            } catch (Throwable unused) {
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e2 */
    public static int m609e2(View view, boolean z) {
        int measuredWidth;
        if (view == null) {
            return 0;
        }
        try {
            measuredWidth = z ? view.getWidth() : view.getHeight();
        } catch (Throwable unused) {
            measuredWidth = 0;
        }
        if (measuredWidth <= 0) {
            try {
                measuredWidth = z ? view.getMeasuredWidth() : view.getMeasuredHeight();
            } catch (Throwable unused2) {
            }
        }
        if (measuredWidth <= 0) {
            try {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    measuredWidth = z ? layoutParams.width : layoutParams.height;
                }
            } catch (Throwable unused3) {
            }
        }
        return Math.max(0, measuredWidth);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m610f(File file, String str, ArrayList arrayList) {
        if (str == null || str.length() == 0) {
            return;
        }
        m622i(new File(file, str).getAbsolutePath(), arrayList);
        m622i(new File(file, str.concat(".png")).getAbsolutePath(), arrayList);
        m622i(new File(file, str.concat(".jpg")).getAbsolutePath(), arrayList);
        m622i(new File(file, str.concat(".jpeg")).getAbsolutePath(), arrayList);
        m622i(new File(file, str.concat(".gif")).getAbsolutePath(), arrayList);
        m622i(new File(file, str.concat(".webp")).getAbsolutePath(), arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x01d8: INVOKE (r3 I:java.io.Closeable) STATIC call: i5.H(java.io.Closeable):void A[MD:(java.io.Closeable):void (m)] (LINE:473), block:B:115:0x01d5 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x01d5: INVOKE (r7 I:java.io.Closeable) STATIC call: i5.H(java.io.Closeable):void A[MD:(java.io.Closeable):void (m)] (LINE:470), block:B:115:0x01d5 */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0163 A[Catch: all -> 0x00ab, IOException -> 0x00ad, TryCatch #11 {IOException -> 0x00ad, all -> 0x00ab, blocks: (B:31:0x006a, B:33:0x0080, B:35:0x0087, B:37:0x008e, B:39:0x0094, B:41:0x009f, B:43:0x00a7, B:51:0x00b1, B:53:0x00bc, B:70:0x011f, B:87:0x0157, B:91:0x0163, B:92:0x016a, B:95:0x017f, B:96:0x0186, B:88:0x015d, B:89:0x0160, B:54:0x00d1, B:56:0x00e0, B:59:0x00e8, B:60:0x00ef, B:62:0x00f2, B:63:0x00f5, B:50:0x00af, B:65:0x010b, B:66:0x0112, B:67:0x0113, B:68:0x011a, B:97:0x0187, B:104:0x01a1, B:105:0x01a8, B:72:0x0125, B:74:0x0129, B:76:0x012f, B:78:0x0135, B:81:0x0147, B:82:0x014e, B:83:0x014f), top: B:142:0x006a, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016a A[Catch: all -> 0x00ab, IOException -> 0x00ad, TryCatch #11 {IOException -> 0x00ad, all -> 0x00ab, blocks: (B:31:0x006a, B:33:0x0080, B:35:0x0087, B:37:0x008e, B:39:0x0094, B:41:0x009f, B:43:0x00a7, B:51:0x00b1, B:53:0x00bc, B:70:0x011f, B:87:0x0157, B:91:0x0163, B:92:0x016a, B:95:0x017f, B:96:0x0186, B:88:0x015d, B:89:0x0160, B:54:0x00d1, B:56:0x00e0, B:59:0x00e8, B:60:0x00ef, B:62:0x00f2, B:63:0x00f5, B:50:0x00af, B:65:0x010b, B:66:0x0112, B:67:0x0113, B:68:0x011a, B:97:0x0187, B:104:0x01a1, B:105:0x01a8, B:72:0x0125, B:74:0x0129, B:76:0x012f, B:78:0x0135, B:81:0x0147, B:82:0x014e, B:83:0x014f), top: B:142:0x006a, inners: #3 }] */
    /* JADX INFO: renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m611f0(File file, File file2, boolean z, C0507ve c0507ve) {
        Closeable closeableM533H;
        Closeable closeableM533H2;
        boolean z2;
        MediaCodec mediaCodecCreateEncoderByType;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        boolean z3;
        boolean z4;
        long j;
        int iDequeueOutputBuffer;
        int iDequeueInputBuffer;
        MediaCodec mediaCodec = null;
        byte[] bArr = null;
        Object[] objArr = 0;
        try {
            String str = z ? "audio/amr-wb" : "audio/3gpp";
            int i = z ? 16000 : 8000;
            int i2 = z ? 23850 : 12200;
            int i3 = z ? 640 : 320;
            try {
                z2 = true;
                MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(str, i, 1);
                mediaFormatCreateAudioFormat.setInteger("bitrate", i2);
                mediaFormatCreateAudioFormat.setInteger("max-input-size", i3 * 8);
                mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
                try {
                    mediaCodecCreateEncoderByType.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
                    mediaCodecCreateEncoderByType.start();
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        fileOutputStream.write((z ? "#!AMR-WB\n" : "#!AMR\n").getBytes("US-ASCII"));
                        fileInputStream = new FileInputStream(file);
                    } catch (IOException e) {
                        e = e;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e3) {
                throw e3;
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                long jNanoTime = System.nanoTime();
                long j2 = 0;
                boolean z5 = false;
                boolean z6 = false;
                while (!z5) {
                    m670y(c0507ve);
                    if (z6 || (iDequeueInputBuffer = mediaCodecCreateEncoderByType.dequeueInputBuffer(10000L)) < 0) {
                        z3 = z2;
                        z4 = false;
                    } else {
                        ByteBuffer inputBuffer = mediaCodecCreateEncoderByType.getInputBuffer(iDequeueInputBuffer);
                        if (inputBuffer == null) {
                            throw new IOException("audio encoder input missing");
                        }
                        inputBuffer.clear();
                        int iCapacity = (inputBuffer.capacity() / i3) * i3;
                        if (iCapacity < i3) {
                            throw new IOException("audio encoder input buffer too small");
                        }
                        int iMin = Math.min(iCapacity, 65536);
                        if (bArr == null || bArr.length < iMin) {
                            bArr = new byte[iMin];
                        }
                        int iM660u1 = m660u1(fileInputStream, bArr, iMin);
                        if (iM660u1 <= 0) {
                            z3 = z2;
                            mediaCodecCreateEncoderByType.queueInputBuffer(iDequeueInputBuffer, 0, 0, ((j2 / 2) * 1000000) / ((long) i), 4);
                            j = 10000;
                            z4 = z3;
                            z6 = z4;
                            iDequeueOutputBuffer = mediaCodecCreateEncoderByType.dequeueOutputBuffer(bufferInfo, j);
                            if (iDequeueOutputBuffer >= 0) {
                                try {
                                    if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                        ByteBuffer outputBuffer = mediaCodecCreateEncoderByType.getOutputBuffer(iDequeueOutputBuffer);
                                        if (outputBuffer == null) {
                                            throw new IOException("audio encoder output missing");
                                        }
                                        m550M1(outputBuffer, bufferInfo, "audio encoder output invalid");
                                        byte[] bArr2 = new byte[bufferInfo.size];
                                        outputBuffer.get(bArr2);
                                        fileOutputStream.write(bArr2);
                                    }
                                    if ((bufferInfo.flags & 4) != 0) {
                                        z5 = z3;
                                    }
                                    mediaCodecCreateEncoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                    z4 = z3;
                                } finally {
                                    mediaCodecCreateEncoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                }
                            }
                            if (!z4) {
                                jNanoTime = System.nanoTime();
                            } else if (System.nanoTime() - jNanoTime > 30000000000L) {
                                throw new IOException("audio encoder stalled");
                            }
                            z2 = z3;
                        } else {
                            z3 = z2;
                            int i4 = (((iM660u1 + i3) - 1) / i3) * i3;
                            if (i4 > inputBuffer.capacity() && (i4 = iM660u1 - (iM660u1 % i3)) <= 0) {
                                throw new IOException("audio encoder frame size");
                            }
                            int i5 = i4;
                            if (i5 > iM660u1) {
                                Arrays.fill(bArr, iM660u1, i5, (byte) 0);
                            }
                            inputBuffer.put(bArr, 0, i5);
                            mediaCodecCreateEncoderByType.queueInputBuffer(iDequeueInputBuffer, 0, i5, ((j2 / 2) * 1000000) / ((long) i), 0);
                            j2 += (long) i5;
                            z4 = z3;
                        }
                    }
                    j = 10000;
                    iDequeueOutputBuffer = mediaCodecCreateEncoderByType.dequeueOutputBuffer(bufferInfo, j);
                    if (iDequeueOutputBuffer >= 0) {
                    }
                    if (!z4) {
                    }
                    z2 = z3;
                }
                fileOutputStream.flush();
                if (file2.length() <= 8) {
                    throw new IOException("audio encode empty");
                }
                m533H(fileInputStream);
                m533H(fileOutputStream);
                try {
                    mediaCodecCreateEncoderByType.stop();
                } catch (Throwable unused) {
                }
                try {
                    mediaCodecCreateEncoderByType.release();
                } catch (Throwable unused2) {
                }
            } catch (IOException e4) {
                e = e4;
                throw e;
            } catch (Throwable th4) {
                th = th4;
                throw new IOException("audio encode failed: " + th.getClass().getSimpleName());
            }
        } finally {
            m533H(closeableM533H);
            m533H(closeableM533H2);
            if (0 != 0) {
                try {
                    (objArr == true ? 1 : 0).stop();
                } catch (Throwable unused3) {
                }
                try {
                    mediaCodec.release();
                } catch (Throwable unused4) {
                }
            }
            m572U(file2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f1 */
    public static String m612f1(long j, String str) {
        StringBuilder sb = new StringBuilder(Math.min(str.length(), 80));
        for (int i = 0; i < str.length() && sb.length() < 80; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '_' || cCharAt == '-'))) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        if (string.length() == 0) {
            string = "elaris_video";
        }
        StringBuilder sbM1b = AbstractC0000a.m1b("{\"mission_id\":\"", string, "\",\"filter_id\":\"\",\"caption_json\":\"\",\"change_voice_style_id\":\"\",\"key_audio_chunked_encode_session_id\":\"\",\"bgm_path\":\"\",\"duration_ms\":");
        sbM1b.append(Math.max(0L, j));
        sbM1b.append(",\"is_composed_in_page\":true}");
        return sbM1b.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f2 */
    public static void m613f2(int i, C0314l8 c0314l8) throws IOException {
        long jMin = Math.min(1000L, 250 << Math.max(0, i - 1));
        while (jMin > 0) {
            c0314l8.m753b();
            long jMin2 = Math.min(jMin, 100L);
            try {
                Thread.sleep(jMin2);
                jMin -= jMin2;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IOException("tts cancelled", e);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m614g(ArrayList arrayList, String str, String str2) {
        String strM515B = m515B(str);
        if (!m534H0(strM515B) || strM515B.equals(str2)) {
            return false;
        }
        if (arrayList.contains(strM515B)) {
            return true;
        }
        arrayList.add(strM515B);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015e, code lost:
    
        throw new java.io.IOException("silk encode empty");
     */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x01b2: INVOKE (r16 I:java.io.Closeable) STATIC call: i5.H(java.io.Closeable):void A[MD:(java.io.Closeable):void (m)] (LINE:435), block:B:106:0x01af */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x01b5: INVOKE (r3 I:java.lang.Object) STATIC call: i5.x1(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:438), block:B:106:0x01af */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x01af: INVOKE (r5 I:java.io.Closeable) STATIC call: i5.H(java.io.Closeable):void A[MD:(java.io.Closeable):void (m)] (LINE:432), block:B:106:0x01af */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x01b8: INVOKE (r8 I:java.io.File) STATIC call: i5.U(java.io.File):void A[MD:(java.io.File):void (m)] (LINE:441), block:B:106:0x01af */
    /* JADX INFO: renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m615g0(Context context, File file, File file2, int i, int i2, C0507ve c0507ve) {
        Closeable closeableM533H;
        Closeable closeableM533H2;
        Object objM669x1;
        File fileM572U;
        byte b;
        Class<?> cls;
        Object objNewInstance;
        Class cls2;
        int i3;
        Object objM665w0;
        String str = "a";
        String str2 = "b";
        try {
            try {
                b = 0;
                cls = Class.forName("com.tencent.mobileqq.utils.SilkCodecWrapper", false, context.getClassLoader());
                try {
                    Constructor<?> constructor = cls.getConstructor(Context.class);
                    constructor.setAccessible(true);
                    objNewInstance = constructor.newInstance(context);
                } catch (NoSuchMethodException unused) {
                    Constructor<?> constructor2 = cls.getConstructor(Context.class, Boolean.TYPE);
                    constructor2.setAccessible(true);
                    objNewInstance = constructor2.newInstance(context, Boolean.FALSE);
                }
                try {
                    cls2 = Integer.TYPE;
                    Method method = cls.getMethod("b", cls2, cls2, cls2);
                    method.setAccessible(true);
                    method.invoke(objNewInstance, Integer.valueOf(i), Integer.valueOf(i2), 1);
                    i3 = (i / 50) * 2;
                    objM665w0 = m665w0(objNewInstance, "p");
                } catch (IOException e) {
                    e = e;
                } catch (Throwable th) {
                    th = th;
                }
            } finally {
                m533H(closeableM533H);
                m533H(closeableM533H2);
                m669x1(objM669x1);
                m572U(fileM572U);
            }
        } catch (IOException e2) {
            e = e2;
        } catch (Throwable th2) {
            th = th2;
            throw new IOException("silk encode failed: " + th.getClass().getSimpleName());
        }
        try {
            int iIntValue = objM665w0 instanceof Number ? ((Number) objM665w0).intValue() : i3;
            if (iIntValue == i3) {
                Method method2 = cls.getMethod("a", byte[].class, cls2, cls2);
                method2.setAccessible(true);
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                } catch (IOException e3) {
                    e = e3;
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        fileOutputStream.write(m571T1(i));
                        byte[] bArr = new byte[iIntValue];
                        int i4 = 0;
                        while (true) {
                            m670y(c0507ve);
                            int iM660u1 = m660u1(fileInputStream, bArr, iIntValue);
                            if (iM660u1 <= 0) {
                                break;
                            }
                            if (iM660u1 < iIntValue) {
                                Arrays.fill(bArr, iM660u1, iIntValue, b);
                            }
                            Object objInvoke = method2.invoke(objNewInstance, bArr, Integer.valueOf(b), Integer.valueOf(iIntValue));
                            byte[] bArr2 = objInvoke == null ? null : (byte[]) m665w0(objInvoke, "c");
                            Object objM665w02 = objInvoke == null ? null : m665w0(objInvoke, str2);
                            int iIntValue2 = objM665w02 instanceof Number ? ((Number) objM665w02).intValue() : 0;
                            Object objM665w03 = objInvoke == null ? null : m665w0(objInvoke, str);
                            int iIntValue3 = objM665w03 instanceof Number ? ((Number) objM665w03).intValue() : 0;
                            if (bArr2 != null && iIntValue2 >= 0 && iIntValue3 > 2) {
                                int i5 = iIntValue;
                                String str3 = str;
                                String str4 = str2;
                                if (((long) iIntValue2) + ((long) iIntValue3) > bArr2.length) {
                                    break;
                                }
                                fileOutputStream.write(bArr2, iIntValue2, iIntValue3);
                                i4++;
                                iIntValue = i5;
                                if (iM660u1 < iIntValue) {
                                    break;
                                }
                                str = str3;
                                str2 = str4;
                                b = 0;
                            } else {
                                break;
                            }
                        }
                        fileOutputStream.flush();
                        if (i4 <= 0 || file2.length() <= 12) {
                            throw new IOException("silk encode empty");
                        }
                        m533H(fileInputStream);
                        m533H(fileOutputStream);
                        m669x1(objNewInstance);
                        return;
                    } catch (IOException e4) {
                        throw e4;
                    } catch (Throwable th4) {
                        th = th4;
                        throw new IOException("silk encode failed: " + th.getClass().getSimpleName());
                    }
                } catch (IOException e5) {
                    e = e5;
                    throw e;
                } catch (Throwable th5) {
                    th = th5;
                    throw new IOException("silk encode failed: " + th.getClass().getSimpleName());
                }
            }
            try {
                throw new IOException("silk frame size mismatch");
            } catch (IOException e6) {
                e = e6;
            } catch (Throwable th6) {
                th = th6;
                throw new IOException("silk encode failed: " + th.getClass().getSimpleName());
            }
        } catch (IOException e7) {
            e = e7;
        } catch (Throwable th7) {
            th = th7;
            throw new IOException("silk encode failed: " + th.getClass().getSimpleName());
        }
        throw e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g1 */
    public static int m616g1(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == 65533 || cCharAt == 195 || cCharAt == 194) {
                i += 4;
            } else {
                int i3 = 0;
                while (true) {
                    if (i3 >= 55) {
                        break;
                    }
                    if (f396q[i3] == cCharAt) {
                        i++;
                        break;
                    }
                    i3++;
                }
            }
        }
        for (int i4 = 0; i4 < 16; i4++) {
            int i5 = f397r[i4];
            int i6 = 0;
            while (true) {
                if (i6 >= str.length()) {
                    i6 = -1;
                    break;
                }
                if (str.charAt(i6) == i5) {
                    break;
                }
                i6++;
            }
            if (i6 >= 0) {
                i += 2;
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g2 */
    public static Object m617g2(Object obj) {
        Object[] objArr = {m661v(obj, "getWrapperSession"), m661v(obj, "getQQNTWrapperSession"), m661v(obj, "getKernelSession"), m661v(obj, "getSession")};
        for (int i = 0; i < 4; i++) {
            Object obj2 = objArr[i];
            if (obj2 != null) {
                return obj2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m618h(File file, String str, ArrayList arrayList) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            int i = 0;
            for (int i2 = 0; i2 < fileArrListFiles.length && i < 160; i2++) {
                File file2 = fileArrListFiles[i2];
                if (file2 != null) {
                    i++;
                    String name = file2.getName();
                    if (name != null) {
                        Locale locale = Locale.ROOT;
                        if (name.toLowerCase(locale).contains(str.toLowerCase(locale))) {
                            m622i(file2.getAbsolutePath(), arrayList);
                        }
                    }
                    if (file2.isDirectory() && str.length() != 0) {
                        try {
                            File[] fileArrListFiles2 = file2.listFiles();
                            if (fileArrListFiles2 != null) {
                                int i3 = 0;
                                for (int i4 = 0; i4 < fileArrListFiles2.length && i3 < 80; i4++) {
                                    File file3 = fileArrListFiles2[i4];
                                    if (file3 != null && !file3.isDirectory()) {
                                        i3++;
                                        String name2 = file3.getName();
                                        if (name2 != null) {
                                            Locale locale2 = Locale.ROOT;
                                            if (name2.toLowerCase(locale2).contains(str.toLowerCase(locale2))) {
                                                m622i(file3.getAbsolutePath(), arrayList);
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public static String m619h0(Object obj) {
        return m653s0(m620h1(obj), m568S1(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h1 */
    public static String m620h1(Object obj) {
        return m653s0(m601c2(obj, "remark", "remarkName", "name", "nick", "nickname", "displayName", "uinName", "contactName", "friendName", "friendNick", "buddyName", "mName", "mNick"), m664w(obj, "getRemark"), m664w(obj, "getRemarkName"), m664w(obj, "getName"), m664w(obj, "getNick"), m664w(obj, "getNickname"), m664w(obj, "getDisplayName"), m664w(obj, "getContactName"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h2 */
    public static File m621h2(Context context, InputStream inputStream, C0314l8 c0314l8) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        File cacheDir = context.getCacheDir();
        FileOutputStream fileOutputStream = null;
        if (cacheDir == null) {
            C0479u2.m1038c("tts cache unavailable");
            return null;
        }
        File file = new File(cacheDir, "elaris_tts_voice");
        if (!file.exists() && !file.mkdirs()) {
            C0479u2.m1038c("tts cache unavailable");
            return null;
        }
        if (!file.isDirectory() || !file.canWrite()) {
            C0479u2.m1038c("tts cache unavailable");
            return null;
        }
        m651r1(file, null);
        File fileCreateTempFile = File.createTempFile("Elaris-kk-tts-script-", ".silk", file);
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileCreateTempFile);
            try {
                byte[] bArr = new byte[8192];
                long j = 0;
                while (true) {
                    c0314l8.m753b();
                    int i = inputStream.read(bArr);
                    if (i < 0) {
                        fileOutputStream2.flush();
                        if (j < 128) {
                            throw new C0346n8("script silk file empty");
                        }
                        try {
                            fileInputStream = new FileInputStream(fileCreateTempFile);
                            try {
                                byte[] bArr2 = new byte[10];
                                int i2 = 0;
                                while (i2 < 10) {
                                    int i3 = fileInputStream.read(bArr2, i2, 10 - i2);
                                    if (i3 < 0) {
                                        break;
                                    }
                                    if (i3 != 0) {
                                        i2 += i3;
                                    }
                                }
                                if (i2 >= 10) {
                                    int i4 = 0;
                                    while (true) {
                                        byte[] bArr3 = f385f;
                                        if (i4 >= 10) {
                                            m530G(fileInputStream);
                                            m651r1(file, fileCreateTempFile);
                                            if (!fileCreateTempFile.isFile() || fileCreateTempFile.length() != j) {
                                                throw new IOException("script silk cache unavailable");
                                            }
                                            HookEntry.log("kk tts script silk downloaded bytes=" + j);
                                            m530G(fileOutputStream2);
                                            m530G(inputStream);
                                            return fileCreateTempFile;
                                        }
                                        if (bArr2[i4] != bArr3[i4]) {
                                            break;
                                        }
                                        i4++;
                                    }
                                }
                                throw new IOException("script silk header invalid");
                            } catch (Throwable th2) {
                                th = th2;
                                m530G(fileInputStream);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream = null;
                        }
                    } else if (i != 0) {
                        j += (long) i;
                        if (j > 12582912) {
                            throw new IOException("script silk file too large");
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = fileOutputStream2;
                m530G(fileOutputStream);
                m530G(inputStream);
                if (0 == 0 && fileCreateTempFile.exists()) {
                    fileCreateTempFile.delete();
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m622i(String str, ArrayList arrayList) {
        if (str == null || str.length() == 0 || arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public static Object[] m623i0(Context context, Class[] clsArr, int i) {
        if (clsArr == null) {
            return new Object[0];
        }
        Object[] objArr = new Object[clsArr.length];
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            Class cls = clsArr[i2];
            if (cls != null) {
                if (Context.class.isAssignableFrom(cls)) {
                    objArr[i2] = context;
                } else if ("android.content.res.Resources".equals(cls.getName())) {
                    objArr[i2] = context.getResources();
                } else if (cls == Integer.TYPE || cls == Integer.class) {
                    objArr[i2] = Integer.valueOf(i);
                } else if (cls == Boolean.TYPE || cls == Boolean.class) {
                    objArr[i2] = Boolean.TRUE;
                } else if (cls == Float.TYPE || cls == Float.class) {
                    objArr[i2] = Float.valueOf(i);
                } else if (cls == Long.TYPE || cls == Long.class) {
                    objArr[i2] = Long.valueOf(i);
                } else if (!cls.isPrimitive()) {
                    objArr[i2] = null;
                }
            }
            return null;
        }
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i1 */
    public static Set m624i1() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static ArrayList m625j(Class cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && cls != Object.class) {
            try {
                for (Field field : cls.getDeclaredFields()) {
                    try {
                        field.setAccessible(true);
                    } catch (Throwable unused) {
                    }
                    arrayList.add(field);
                }
            } catch (Throwable unused2) {
            }
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public static String m626j0(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj.getClass().getName());
        m634m(sb, obj, "emoId");
        m634m(sb, obj, "path");
        m634m(sb, obj, "resID");
        m634m(sb, obj, "md5");
        m634m(sb, obj, "epId");
        String string = sb.toString();
        return string.length() > 260 ? string.substring(0, 260) : string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j1 */
    public static File m627j1(File file, String str, String str2) throws IOException {
        File file2 = new File(file, str + new SimpleDateFormat("yyyyMMdd-HHmmss", Locale.US).format(new Date()) + "-" + UUID.randomUUID().toString() + str2);
        if (!file2.exists() && file2.createNewFile()) {
            return file2;
        }
        C0479u2.m1038c("voice cache file failed");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static ArrayList m628k(Class cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && cls != Object.class) {
            try {
                for (Method method : cls.getDeclaredMethods()) {
                    try {
                        method.setAccessible(true);
                    } catch (Throwable unused) {
                    }
                    arrayList.add(method);
                }
            } catch (Throwable unused2) {
            }
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public static ArrayList m629k0(C0314l8 c0314l8) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject(m675z1(new URL("https://api-v2.yuafeng.cn/API/kktts.php?action=list"), 2097152, c0314l8, "catalog"));
            if (jSONObject.optInt("code", -1) != 0) {
                throw new IOException("tts catalog rejected");
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("list");
            if (jSONArrayOptJSONArray == null) {
                throw new IOException("tts catalog missing");
            }
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            for (int i = 0; i < jSONArrayOptJSONArray.length() && arrayList.size() < 500; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strM529F1 = m529F1(jSONObjectOptJSONObject.optString("id", ""), 128);
                    String strM529F12 = m529F1(jSONObjectOptJSONObject.optString("name", ""), 160);
                    if (m555O0(strM529F1) && strM529F12.length() != 0 && hashSet.add(strM529F1)) {
                        arrayList.add(new C0026b9(strM529F1, strM529F12, m529F1(jSONObjectOptJSONObject.optString("category", "其他"), 80)));
                    }
                }
            }
            ArrayList arrayListM514A1 = m514A1(arrayList);
            if (arrayListM514A1.isEmpty()) {
                throw new IOException("tts catalog empty");
            }
            return arrayListM514A1;
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            throw new IOException("tts catalog invalid", th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public static HttpURLConnection m630k1(String str, String str2) throws ProtocolException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
        httpURLConnection.setRequestMethod(str);
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(12000);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestProperty("Accept", "application/json,image/*;q=0.9,*/*;q=0.1");
        return httpURLConnection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static Object m631l(ClassLoader classLoader) throws IllegalAccessException, InvocationTargetException {
        Field fieldM641o0;
        try {
            Class<?> cls = Class.forName("mqq.app.MobileQQ", false, classLoader);
            try {
                fieldM641o0 = m641o0(cls, "sMobileQQ");
            } catch (Throwable unused) {
            }
            Object objInvoke = fieldM641o0 == null ? null : fieldM641o0.get(null);
            if (objInvoke == null) {
                if (cls != null) {
                    try {
                        Method methodM647q0 = m647q0(cls, "getMobileQQ");
                        if (methodM647q0 != null) {
                            objInvoke = methodM647q0.invoke(null, null);
                        }
                    } catch (Throwable unused2) {
                    }
                    objInvoke = null;
                } else {
                    objInvoke = null;
                }
            }
            if (objInvoke == null) {
                if (cls != null) {
                    try {
                        Method methodM647q02 = m647q0(cls, "getContext");
                        if (methodM647q02 != null) {
                            objInvoke = methodM647q02.invoke(null, null);
                        }
                    } catch (Throwable unused3) {
                    }
                    objInvoke = null;
                } else {
                    objInvoke = null;
                }
            }
            if (objInvoke == null) {
                return null;
            }
            Object objM661v = m661v(objInvoke, new String[]{"peekAppRuntime"}[0]);
            if (objM661v != null) {
                return objM661v;
            }
            Field fieldM641o02 = m641o0(objInvoke.getClass(), "mAppRuntime");
            if (fieldM641o02 == null) {
                return null;
            }
            return fieldM641o02.get(objInvoke);
        } catch (Throwable unused4) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public static Object m632l0(Object obj, String str) {
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l1 */
    public static HttpURLConnection m633l1(URL url, C0314l8 c0314l8) throws IOException {
        c0314l8.m753b();
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty("User-Agent", "Elaris-TTS");
        c0314l8.f529b = Thread.currentThread();
        c0314l8.f530c = httpURLConnection;
        c0314l8.m753b();
        return httpURLConnection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static void m634m(StringBuilder sb, Object obj, String str) {
        Object objM632l0 = m632l0(obj, str);
        if (objM632l0 == null) {
            return;
        }
        sb.append(' ');
        sb.append(str);
        sb.append('=');
        String strValueOf = String.valueOf(objM632l0);
        if (strValueOf.length() > 80) {
            strValueOf = strValueOf.substring(0, 80);
        }
        sb.append(strValueOf);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO] complete}, expected: {[GOTO, INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d8, code lost:
    
        r1.close();
     */
    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0358o4 m635m0(String str) {
        String str2;
        C0358o4 c0358o4 = new C0358o4();
        if (str != null && str.length() != 0) {
            try {
                ZipFile zipFile = new ZipFile(str);
                int i = 1;
                while (true) {
                    if (i >= 64) {
                        break;
                    }
                    if (i == 1) {
                        str2 = "classes.dex";
                    } else {
                        try {
                            str2 = "classes" + i + ".dex";
                        } catch (Throwable th) {
                            try {
                                zipFile.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    ZipEntry entry = zipFile.getEntry(str2);
                    if (entry != null) {
                        try {
                            InputStream inputStream = zipFile.getInputStream(entry);
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[16384];
                                while (true) {
                                    int i2 = inputStream.read(bArr);
                                    if (i2 <= 0) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i2);
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                if (byteArray.length >= 112 && byteArray[0] == 100 && byteArray[1] == 101 && byteArray[2] == 120) {
                                    try {
                                        C0566z9 c0566z9 = new C0566z9(byteArray);
                                        int iM1206m = c0566z9.m1206m("Lcom/tencent/qqnt/chats/view/MiniOldStyleHeaderNew;");
                                        if (iM1206m >= 0 && c0358o4.f631a == null) {
                                            c0566z9.m1198e(iM1206m, new C0540y(c0566z9, c0358o4));
                                        }
                                        int iM1206m2 = c0566z9.m1206m("Lcom/tencent/mobileqq/activity/home/Conversation;");
                                        if (iM1206m2 >= 0) {
                                            c0566z9.m1203j(iM1206m2, c0358o4);
                                        }
                                        int iM1206m3 = c0566z9.m1206m("Lcom/tencent/mobileqq/activity/Conversation;");
                                        if (iM1206m3 >= 0) {
                                            c0566z9.m1203j(iM1206m3, c0358o4);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                    if (c0358o4.f631a != null && !((HashSet) c0358o4.f633c).isEmpty()) {
                                        inputStream.close();
                                        break;
                                    }
                                }
                                inputStream.close();
                            } finally {
                                if (inputStream == null) {
                                    break;
                                }
                                try {
                                    break;
                                } catch (Throwable th3) {
                                }
                            }
                        } catch (Throwable unused2) {
                            continue;
                        }
                        i++;
                    } else {
                        if (i > 8) {
                            break;
                        }
                        i++;
                    }
                }
            } catch (Throwable unused3) {
            }
        }
        return c0358o4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m1 */
    public static LinearLayout m636m1(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(m591a0(context, 18.0f), m591a0(context, 16.0f), m591a0(context, 18.0f), m591a0(context, 14.0f));
        linearLayout.setBackground(m523D1(context, AbstractC0486u9.m1072y(context), AbstractC0486u9.m1062o(context) ? -11775650 : -1512206, 24.0f));
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static void m637n(Activity activity, Dialog dialog, float f) {
        m640o(dialog, Math.max(m591a0(activity, 270.0f), Math.min(m591a0(activity, f), activity.getResources().getDisplayMetrics().widthPixels - m591a0(activity, 40.0f))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public static void m638n0(View view, C0243h4 c0243h4, int i) {
        ImageView imageView;
        Drawable drawable;
        if (view == null || i > 5) {
            return;
        }
        try {
            if (view.getVisibility() != 0) {
                return;
            }
        } catch (Throwable unused) {
        }
        if ((view instanceof ImageView) && (drawable = (imageView = (ImageView) view).getDrawable()) != null) {
            int iMax = Math.max(m609e2(imageView, true), drawable.getIntrinsicWidth());
            int iMax2 = Math.max(1, Math.max(m609e2(imageView, false), drawable.getIntrinsicHeight())) * Math.max(1, iMax);
            if (iMax2 > c0243h4.f346a) {
                c0243h4.f347b = imageView;
                c0243h4.f346a = iMax2;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int iMin = Math.min(viewGroup.getChildCount(), 24);
            for (int i2 = 0; i2 < iMin; i2++) {
                m638n0(viewGroup.getChildAt(i2), c0243h4, i + 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n1 */
    public static LinkedHashSet m639n1(String str, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int[] iArr = f383d;
        if (str != null && str.trim().length() != 0) {
            for (String str2 : str.trim().split("[^0-9]+")) {
                if (str2 != null && str2.length() != 0) {
                    try {
                        int i = Integer.parseInt(str2);
                        int i2 = 0;
                        while (true) {
                            if (i2 >= 6) {
                                break;
                            }
                            if (iArr[i2] == i) {
                                linkedHashSet.add(Integer.valueOf(i));
                                break;
                            }
                            i2++;
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        if (!z || linkedHashSet.isEmpty()) {
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (int i3 = 0; i3 < 6; i3++) {
            Integer numValueOf = Integer.valueOf(iArr[i3]);
            if (linkedHashSet.contains(numValueOf)) {
                linkedHashSet2.add(numValueOf);
            }
        }
        return linkedHashSet2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static void m640o(Dialog dialog, int i) {
        try {
            Window window = dialog.getWindow();
            if (window == null) {
                return;
            }
            window.setBackgroundDrawableResource(R.color.transparent);
            window.setGravity(17);
            window.setSoftInputMode(16);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = i;
            attributes.height = -2;
            attributes.gravity = 17;
            attributes.windowAnimations = 0;
            attributes.dimAmount = 0.4f;
            window.setAttributes(attributes);
            window.setLayout(attributes.width, -2);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o0 */
    public static Field m641o0(Class cls, String str) {
        if (cls != null && str != null) {
            while (cls != null) {
                try {
                    Field declaredField = cls.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    return declaredField;
                } catch (Throwable unused) {
                    cls = cls.getSuperclass();
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o1 */
    public static void m642o1(Object obj, LinkedHashMap linkedHashMap) {
        if (obj instanceof Map) {
            for (Object obj2 : ((Map) obj).entrySet()) {
                if (obj2 instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj2;
                    String strM515B = m515B(entry.getKey());
                    String strM619h0 = m619h0(entry.getValue());
                    if (m534H0(strM515B) && strM619h0.length() > 0) {
                        linkedHashMap.put(strM515B, strM619h0);
                    }
                }
            }
            return;
        }
        if (obj instanceof Iterable) {
            for (Object obj3 : (Iterable) obj) {
                String strM515B2 = m515B(m656t0(obj3));
                String strM619h02 = m619h0(obj3);
                if (m534H0(strM515B2) && strM619h02.length() > 0) {
                    linkedHashMap.put(strM515B2, strM619h02);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static boolean m643p(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:105:0x00ba */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:76:0x00bf */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:77:0x00d1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:78:0x00be */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:83:0x0054 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO] complete}, expected: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX INFO: renamed from: p0 */
    public static HashSet m644p0(String str, String str2, String... strArr) {
        String str3;
        ?? r2;
        int iM1208o;
        HashSet hashSet = new HashSet();
        if (str != null && str.length() != 0 && strArr.length != 0) {
            try {
                ZipFile zipFile = new ZipFile(str);
                try {
                    HashSet hashSet2 = new HashSet();
                    int i = 1;
                    ?? r13 = strArr;
                    while (i < 64) {
                        if (i == 1) {
                            str3 = "classes.dex";
                        } else {
                            str3 = "classes" + i + ".dex";
                        }
                        ZipEntry entry = zipFile.getEntry(str3);
                        if (entry != null) {
                            try {
                                InputStream inputStream = zipFile.getInputStream(entry);
                                try {
                                    ?? byteArrayOutputStream = new ByteArrayOutputStream();
                                    byte[] bArr = new byte[16384];
                                    while (true) {
                                        r2 = inputStream.read(bArr);
                                        if (r2 <= 0) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr, 0, r2);
                                    }
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    if (byteArray.length >= 112 && byteArray[0] == 100 && byteArray[1] == 101 && byteArray[2] == 120) {
                                        try {
                                            C0566z9 c0566z9 = new C0566z9(byteArray);
                                            if (r13.length != 0) {
                                                int i2 = 0;
                                                r13 = r13;
                                                while (i2 < c0566z9.f1151i) {
                                                    int i3 = (i2 * 32) + c0566z9.f1152j;
                                                    String strM1205l = c0566z9.m1205l(c0566z9.m1208o(i3));
                                                    if (strM1205l.startsWith(str2) && (iM1208o = c0566z9.m1208o(i3 + 24)) > 0) {
                                                        r2 = r13;
                                                        try {
                                                            c0566z9.m1200g(iM1208o, new C0515w6(c0566z9, (String[]) r2, strM1205l, hashSet2, hashSet));
                                                        } catch (Throwable unused) {
                                                        }
                                                    } else {
                                                        r2 = r13;
                                                    }
                                                    i2++;
                                                    r13 = r2;
                                                }
                                            }
                                        } catch (Throwable unused2) {
                                        }
                                        r2 = r13;
                                        inputStream.close();
                                    } else {
                                        r2 = r13;
                                        try {
                                            inputStream.close();
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                } catch (Throwable th) {
                                    r2 = r13;
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable unused4) {
                                r2 = r13;
                            }
                            i++;
                            r13 = r2;
                        } else if (i > 8) {
                            break;
                        }
                        r2 = r13;
                        i++;
                        r13 = r2;
                    }
                    zipFile.close();
                } catch (Throwable th3) {
                    try {
                        zipFile.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (Throwable unused5) {
            }
        }
        return hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p1 */
    public static long m645p1(String str) {
        if (str.length() == 0) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            if (str.length() == 0) {
                return -1L;
            }
            String strReplace = str.replace("零", "").replace("〇", "");
            int iIndexOf = strReplace.indexOf(21313);
            if (iIndexOf < 0) {
                return m673z(strReplace);
            }
            long jM673z = iIndexOf == 0 ? 1L : m673z(strReplace.substring(0, iIndexOf));
            long jM673z2 = iIndexOf == strReplace.length() + (-1) ? 0L : m673z(strReplace.substring(iIndexOf + 1));
            if (jM673z < 0 || jM673z2 < 0) {
                return -1L;
            }
            return (jM673z * 10) + jM673z2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static LinkedHashMap m646q(Object obj, String str, ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!arrayList.isEmpty()) {
            for (Method method : m628k(obj.getClass())) {
                if (str.equals(method.getName())) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    try {
                        method.setAccessible(true);
                        if (parameterTypes.length == 1 && parameterTypes[0] == String.class) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                String str2 = (String) it.next();
                                String strM619h0 = m619h0(method.invoke(obj, str2));
                                if (strM619h0.length() > 0) {
                                    linkedHashMap.put(str2, strM619h0);
                                }
                            }
                            if (!linkedHashMap.isEmpty()) {
                                break;
                            }
                        } else if (parameterTypes.length == 1 && (Collection.class.isAssignableFrom(parameterTypes[0]) || Iterable.class.isAssignableFrom(parameterTypes[0]) || List.class.isAssignableFrom(parameterTypes[0]))) {
                            m642o1(method.invoke(obj, arrayList), linkedHashMap);
                            if (!linkedHashMap.isEmpty()) {
                                break;
                            }
                        } else if (parameterTypes.length == 2 && parameterTypes[0] == String.class) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                String str3 = (String) it2.next();
                                Class<?> cls = parameterTypes[1];
                                String strM619h02 = m619h0(method.invoke(obj, str3, cls == String.class ? "" : m569T(cls)));
                                if (strM619h02.length() > 0) {
                                    linkedHashMap.put(str3, strM619h02);
                                }
                            }
                            if (!linkedHashMap.isEmpty()) {
                                break;
                            }
                        }
                    } catch (Throwable unused) {
                        continue;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q0 */
    public static Method m647q0(Class cls, String str) {
        if (cls == null || str == null) {
            return null;
        }
        for (Method method : m628k(cls)) {
            if (str.equals(method.getName()) && method.getParameterTypes().length == 0) {
                return method;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q1 */
    public static Bitmap m648q1(View view, int i) {
        Bitmap bitmapM599c0;
        if (view != null && i > 0 && m540J0(view, i)) {
            C0243h4 c0243h4 = new C0243h4();
            m638n0(view, c0243h4, 0);
            ImageView imageView = (ImageView) c0243h4.f347b;
            if (imageView != null && (bitmapM599c0 = m599c0(imageView.getDrawable(), i)) != null && !m537I0(bitmapM599c0)) {
                return bitmapM599c0;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static String m649r(String str, String str2) throws IOException {
        String strTrim = str == null ? "" : str.trim();
        String strTrim2 = strTrim != null ? strTrim.trim() : "";
        int iCodePointCount = 0;
        if (strTrim2 != null && strTrim2.length() != 0) {
            iCodePointCount = strTrim2.codePointCount(0, strTrim2.length());
        }
        if (iCodePointCount <= 0 || iCodePointCount > 200) {
            C0479u2.m1038c("tts text invalid");
            return null;
        }
        if (!m555O0(str2)) {
            C0479u2.m1038c("tts voice invalid");
            return null;
        }
        try {
            return "https://api-v2.yuafeng.cn/API/kktts.php?action=voice&content=" + URLEncoder.encode(strTrim, "UTF-8") + "&voice_id=" + URLEncoder.encode(str2, "UTF-8");
        } catch (Throwable th) {
            throw new IOException("tts request encoding failed", th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1 A[SYNTHETIC] */
    /* JADX INFO: renamed from: r0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m650r0(ClassLoader classLoader, String str, LinkedHashMap linkedHashMap) {
        Object objInvoke;
        if (!linkedHashMap.isEmpty()) {
            for (C0244h5 c0244h5 : new ArrayList(linkedHashMap.values())) {
                if (c0244h5 != null) {
                    String str2 = c0244h5.f348a;
                    if (c0244h5.f350c.length() <= 0) {
                        if (str2.startsWith("u_")) {
                            String str3 = "";
                            if (str2.length() != 0) {
                                String[] strArr = {"com.tencent.relation.common.api.IRelationNTUinAndUidApi", "com.tencent.qqnt.ntrelation.friendsinfo.api.IFriendsInfoService", "com.tencent.qqnt.ntrelation.friendsinfo.api.IQQFriendsInfoApi"};
                                String[] strArr2 = {"getUinFromUid", "getUinByUid", "getUin", "getFriendUinFromUid"};
                                for (int i = 0; i < 3; i++) {
                                    Object objM657t1 = m657t1(classLoader, strArr[i]);
                                    if (objM657t1 != null) {
                                        for (int i2 = 0; i2 < 4; i2++) {
                                            String str4 = strArr2[i2];
                                            if (str4 != null) {
                                                Iterator it = m628k(objM657t1.getClass()).iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        objInvoke = null;
                                                        break;
                                                    }
                                                    Method method = (Method) it.next();
                                                    Class<?>[] parameterTypes = method.getParameterTypes();
                                                    if (str4.equals(method.getName()) && parameterTypes.length == 1 && parameterTypes[0] == String.class) {
                                                        try {
                                                            method.setAccessible(true);
                                                            objInvoke = method.invoke(objM657t1, str2);
                                                            break;
                                                        } catch (Throwable unused) {
                                                            continue;
                                                        }
                                                    }
                                                }
                                            } else {
                                                objInvoke = null;
                                            }
                                            String strM518C = m518C(objInvoke);
                                            if (strM518C.length() > 0) {
                                                str3 = strM518C;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (str3.length() <= 0) {
                                }
                            } else if (str3.length() <= 0) {
                                m654s1(linkedHashMap, str2, c0244h5.f349b, str3);
                            }
                        }
                    }
                }
            }
        }
        if (HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG)) {
            StringBuilder sbM1b = AbstractC0000a.m1b("friend-list loaded source=", str, ", count=");
            sbM1b.append(linkedHashMap.size());
            HookEntry.log(sbM1b.toString());
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.values());
        f382c = arrayList;
        f381b = System.currentTimeMillis();
        return new ArrayList(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r1 */
    public static void m651r1(File file, File file2) {
        try {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
                for (File file3 : fileArrListFiles) {
                    if (file3 != null && file3.isFile() && file3.lastModified() < jCurrentTimeMillis) {
                        file3.delete();
                    }
                }
                File[] fileArrListFiles2 = file.listFiles();
                if (fileArrListFiles2 != null && fileArrListFiles2.length != 0) {
                    Arrays.sort(fileArrListFiles2, new C0330m8(file2));
                    long j = 0;
                    int i = 0;
                    for (File file4 : fileArrListFiles2) {
                        if (file4 != null && file4.isFile()) {
                            long jMax = Math.max(0L, file4.length());
                            if (i < 24) {
                                long j2 = jMax + j;
                                if (j2 > 50331648) {
                                    file4.delete();
                                } else {
                                    i++;
                                    j = j2;
                                }
                            } else {
                                file4.delete();
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            AbstractC0198e7.m343a("kk-tts", "cache-prune", th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static String m652s(String str) throws IOException {
        if (!m513A0(str)) {
            C0479u2.m1038c("tts audio url rejected");
            return null;
        }
        try {
            return "https://oiapi.net/API/Mp32Silk?url=" + URLEncoder.encode(str, "UTF-8");
        } catch (Throwable th) {
            throw new IOException("script silk request encoding failed", th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s0 */
    public static String m653s0(String... strArr) {
        for (String str : strArr) {
            if (str != null && str.trim().length() > 0) {
                return str.trim();
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s1 */
    public static void m654s1(LinkedHashMap linkedHashMap, String str, String str2, String str3) {
        String strM515B = m515B(str);
        if (m534H0(strM515B)) {
            String str4 = "";
            String strTrim = str2 == null ? "" : str2.trim();
            if (strTrim.length() != 0) {
                String strM515B2 = m515B(strTrim);
                if (!strTrim.equals(strM515B) && !strM515B2.equals(strM515B) && (!strTrim.startsWith("UID ") || !strTrim.contains(m545L(strM515B)))) {
                    str4 = strTrim;
                }
            }
            String strM518C = m518C(str3);
            C0244h5 c0244h5 = (C0244h5) linkedHashMap.get(strM515B);
            if (c0244h5 == null) {
                if (str4.length() == 0) {
                    return;
                }
                linkedHashMap.put(strM515B, new C0244h5(strM515B, str4, strM518C));
                return;
            }
            String str5 = c0244h5.f350c;
            String str6 = c0244h5.f349b;
            if ((str6.length() != 0 || str4.length() <= 0) && (str5.length() != 0 || strM518C.length() <= 0)) {
                return;
            }
            if (str6.length() > 0) {
                str4 = str6;
            }
            if (str5.length() > 0) {
                strM518C = str5;
            }
            linkedHashMap.put(strM515B, new C0244h5(strM515B, str4, strM518C));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static TextView m655t(Context context, String str, boolean z) {
        TextView textViewM574U1 = m574U1(context, str, 14.0f, z ? -1 : AbstractC0486u9.m1050c(context), true);
        textViewM574U1.setGravity(17);
        textViewM574U1.setSingleLine(true);
        textViewM574U1.setBackground(m523D1(context, z ? AbstractC0486u9.m1050c(context) : AbstractC0486u9.m1062o(context) ? -14472133 : -591105, z ? AbstractC0486u9.m1050c(context) : AbstractC0486u9.m1062o(context) ? -13282697 : -3876617, 20.0f));
        return textViewM574U1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t0 */
    public static String m656t0(Object obj) {
        String strM601c2 = m601c2(obj, "uid", "peerUid", "friendUid", "buddyUid", "uin", "friendUin", "frienduin", "uinStr", "uinCode", "uinNum", "contactId", "uinId");
        return strM601c2.length() == 0 ? m653s0(m664w(obj, "getUid"), m664w(obj, "getUin"), m664w(obj, "getPeerUid"), m664w(obj, "getPeerUin"), m664w(obj, "getFriendUid"), m664w(obj, "getFriendUin"), m664w(obj, "getBuddyUid"), m664w(obj, "getBuddyUin"), m664w(obj, "getContactId")) : strM601c2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t1 */
    public static Object m657t1(ClassLoader classLoader, String str) {
        try {
            return Class.forName("com.tencent.mobileqq.qroute.QRoute", false, classLoader).getMethod("api", Class.class).invoke(null, Class.forName(str, false, classLoader));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static File m658u(Context context) throws IOException {
        File cacheDir = context == null ? null : context.getCacheDir();
        if (cacheDir == null) {
            C0479u2.m1038c("voice cache unavailable");
            return null;
        }
        File file = new File(cacheDir, "elaris_local_voice");
        if (!file.exists() && !file.mkdirs()) {
            C0479u2.m1038c("voice cache mkdir failed");
            return null;
        }
        if (!file.isDirectory() || !file.canWrite()) {
            C0479u2.m1038c("voice cache unavailable");
            return null;
        }
        try {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
                for (File file2 : fileArrListFiles) {
                    if (file2 != null && file2.isFile() && file2.lastModified() < jCurrentTimeMillis && file2.getName().startsWith("Elaris-local-audio-pcm-")) {
                        file2.delete();
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u0 */
    public static String m659u0(Object obj) {
        return m518C(m653s0(m601c2(obj, "uin", "friendUin", "frienduin", "uinStr", "uinCode", "uinNum"), m664w(obj, "getUin"), m664w(obj, "getFriendUin"), m664w(obj, "getBuddyUin")));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u1 */
    public static int m660u1(FileInputStream fileInputStream, byte[] bArr, int i) throws IOException {
        if (i <= 0) {
            return -1;
        }
        int i2 = 0;
        while (i2 < i) {
            int i3 = fileInputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                break;
            }
            if (i3 != 0) {
                i2 += i3;
            }
        }
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static Object m661v(Object obj, String str) {
        if (obj != null && str != null) {
            try {
                Method methodM647q0 = m647q0(obj.getClass(), str);
                if (methodM647q0 == null) {
                    return null;
                }
                return methodM647q0.invoke(obj, null);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v0 */
    public static File m662v0(Context context, String str, String str2, C0314l8 c0314l8) throws IOException {
        String strTrim = str == null ? "" : str.trim();
        String strTrim2 = strTrim == null ? "" : strTrim.trim();
        int iCodePointCount = 0;
        if (strTrim2 != null && strTrim2.length() != 0) {
            iCodePointCount = strTrim2.codePointCount(0, strTrim2.length());
        }
        if (iCodePointCount <= 0 || iCodePointCount > 200) {
            C0479u2.m1038c("tts text invalid");
            return null;
        }
        if (!m555O0(str2)) {
            C0479u2.m1038c("tts voice invalid");
            return null;
        }
        if (context == null) {
            C0479u2.m1038c("tts cache unavailable");
            return null;
        }
        c0314l8.m753b();
        try {
            JSONObject jSONObject = new JSONObject(m675z1(new URL(m649r(strTrim, str2)), 65536, c0314l8, "voice-api"));
            if (jSONObject.optInt("code", -1) != 0) {
                throw new IOException("tts api rejected");
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            String strOptString = jSONObjectOptJSONObject == null ? "" : jSONObjectOptJSONObject.optString("url", "");
            if (!m513A0(strOptString)) {
                throw new IOException("tts audio url rejected");
            }
            c0314l8.m753b();
            try {
                JSONObject jSONObject2 = new JSONObject(m675z1(new URL(m652s(strOptString)), 65536, c0314l8, "script-silk-api"));
                if (jSONObject2.optInt("code", -1) != 1) {
                    throw new IOException("script silk api rejected");
                }
                String strM529F1 = m529F1(jSONObject2.optString("message", ""), 1024);
                if (!m516B0(strM529F1)) {
                    throw new IOException("script silk url rejected");
                }
                c0314l8.m753b();
                for (int i = 1; i <= 3; i++) {
                    try {
                        return m587Z(context, strM529F1, c0314l8);
                    } catch (IOException e) {
                        if (c0314l8.f528a || i >= 3 || !((e instanceof C0346n8) || m546L0(e))) {
                            throw e;
                        }
                        HookEntry.log("kk tts retry stage=script-silk-download error=" + e.getClass().getSimpleName() + " attempt=" + i);
                        m613f2(i, c0314l8);
                    }
                }
                C0479u2.m1038c("script silk download retry exhausted");
                return null;
            } catch (IOException e2) {
                throw e2;
            } catch (Throwable th) {
                throw new IOException("script silk response invalid", th);
            }
        } catch (IOException e3) {
            throw e3;
        } catch (Throwable th2) {
            throw new IOException("tts response invalid", th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v1 */
    public static byte[] m663v1(InputStream inputStream, long j) {
        if (inputStream == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[16384];
            long j2 = 0;
            while (true) {
                int i = inputStream.read(bArr);
                if (i < 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    m524E(inputStream);
                    m524E(byteArrayOutputStream);
                    return byteArray;
                }
                j2 += (long) i;
                if (j2 > j) {
                    throw new C0323m1("文件超过大小限制");
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            m524E(inputStream);
            m524E(byteArrayOutputStream);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static String m664w(Object obj, String str) {
        return m568S1(m661v(obj, str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public static Object m665w0(Object obj, String str) {
        for (Class<?> superclass = obj == null ? null : obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (NoSuchFieldException unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w1 */
    public static String m666w1(InputStream inputStream, int i, C0314l8 c0314l8) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[4096];
            int i2 = 0;
            while (true) {
                c0314l8.m753b();
                int i3 = inputStream.read(bArr);
                if (i3 < 0) {
                    return new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                }
                if (i3 != 0) {
                    i2 += i3;
                    if (i2 > i) {
                        throw new IOException("tts response too large");
                    }
                    byteArrayOutputStream.write(bArr, 0, i3);
                }
            }
        } finally {
            m530G(inputStream);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static void m667x(ClassLoader classLoader, String str, String str2) {
        if (classLoader == null || f400u != null) {
            return;
        }
        f400u = classLoader;
        HookEntry.logAlways("host runtime classloader captured source=" + str2 + ", process=" + str + ", loader=" + m558P0(classLoader));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: x0 */
    public static final Class m668x0(C0275j1 c0275j1) {
        c0275j1.getClass();
        Class cls = c0275j1.f452a;
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals(Prefs.REPEATER_MODE_DOUBLE)) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x1 */
    public static void m669x1(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            try {
                Method method = obj.getClass().getMethod("release", null);
                method.setAccessible(true);
                method.invoke(obj, null);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            Method method2 = obj.getClass().getMethod("close", null);
            method2.setAccessible(true);
            method2.invoke(obj, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static void m670y(C0507ve c0507ve) throws IOException {
        if (c0507ve.f978b == null) {
            c0507ve.f978b = Thread.currentThread();
        }
        if (c0507ve.f977a) {
            C0479u2.m1038c("voice conversion cancelled");
        } else if (Thread.currentThread().isInterrupted()) {
            C0479u2.m1038c("voice conversion cancelled");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y0 */
    public static boolean m671y0(View view) {
        for (int i = 0; view != null && i < 6; i++) {
            if (m519C0(view)) {
                return true;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y1 */
    public static JSONObject m672y1(String str, String str2, JSONObject jSONObject, String str3) throws C0323m1, IOException {
        HttpURLConnection httpURLConnectionM630k1 = m630k1(str, str2);
        if (str3 != null && str3.length() > 0) {
            httpURLConnectionM630k1.setRequestProperty("X-Elaris-Upload-Key", str3);
        }
        if (jSONObject != null) {
            byte[] bytes = jSONObject.toString().getBytes(StandardCharsets.UTF_8);
            httpURLConnectionM630k1.setDoOutput(true);
            httpURLConnectionM630k1.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnectionM630k1.setFixedLengthStreamingMode(bytes.length);
            OutputStream outputStream = httpURLConnectionM630k1.getOutputStream();
            outputStream.write(bytes);
            outputStream.close();
        }
        int responseCode = httpURLConnectionM630k1.getResponseCode();
        try {
            String str4 = new String(m663v1((responseCode < 200 || responseCode >= 300) ? httpURLConnectionM630k1.getErrorStream() : httpURLConnectionM630k1.getInputStream(), 524288L), StandardCharsets.UTF_8);
            httpURLConnectionM630k1.disconnect();
            JSONObject jSONObject2 = str4.length() == 0 ? new JSONObject() : new JSONObject(str4);
            if (responseCode >= 200 && responseCode < 300) {
                if (jSONObject2.optBoolean("ok", responseCode < 300)) {
                    return jSONObject2;
                }
            }
            throw new C0323m1(m547L1(jSONObject2.optString("message", "http_" + responseCode)));
        } catch (Throwable th) {
            httpURLConnectionM630k1.disconnect();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static long m673z(String str) {
        if (str.length() == 0) {
            return 0L;
        }
        if (str.length() != 1) {
            return -1L;
        }
        switch (str.charAt(0)) {
            case 19968:
            case 22777:
                return 1L;
            case 19971:
            case 26578:
                return 7L;
            case 19977:
            case 21441:
                return 3L;
            case 20004:
            case 20108:
            case 36144:
                return 2L;
            case 20061:
            case 29590:
                return 9L;
            case 20116:
            case 20237:
                return 5L;
            case 20843:
            case 25420:
                return 8L;
            case 20845:
            case 38470:
                return 6L;
            case 22235:
            case 32902:
                return 4L;
            default:
                return -1L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    public static boolean m674z0(Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        throw new java.io.IOException(r14 + " http " + r7);
     */
    /* JADX INFO: renamed from: z1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m675z1(URL url, int i, C0314l8 c0314l8, String str) throws IOException {
        int responseCode;
        int i2 = 1;
        while (true) {
            HttpURLConnection httpURLConnectionM633l1 = null;
            if (i2 > 3) {
                C0479u2.m1038c(str.concat(" retry exhausted"));
                return null;
            }
            try {
                try {
                    httpURLConnectionM633l1 = m633l1(url, c0314l8);
                    httpURLConnectionM633l1.setRequestProperty("Accept", "application/json");
                    responseCode = httpURLConnectionM633l1.getResponseCode();
                } catch (IOException e) {
                    if (c0314l8.f528a || i2 >= 3 || !m546L0(e)) {
                        throw e;
                    }
                    HookEntry.log("kk tts retry stage=" + str + " error=" + e.getClass().getSimpleName() + " attempt=" + i2);
                }
                if (responseCode == 200) {
                    return m666w1(httpURLConnectionM633l1.getInputStream(), i, c0314l8);
                }
                if (!(responseCode == 429 || (responseCode >= 500 && responseCode <= 599)) || i2 >= 3) {
                    break;
                }
                HookEntry.log("kk tts retry stage=" + str + " status=" + responseCode + " attempt=" + i2);
                m613f2(i2, c0314l8);
                i2++;
            } finally {
                m527F(null, c0314l8);
            }
        }
        throw e;
    }
}
