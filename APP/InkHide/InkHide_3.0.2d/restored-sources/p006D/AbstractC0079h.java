package p006D;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Paint;
import android.os.Build;
import android.os.Trace;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.emoji2.text.C0389d;
import androidx.emoji2.text.C0401p;
import androidx.emoji2.text.C0402q;
import androidx.emoji2.text.C0404s;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.luckypray.dexkit.DexKitBridge;
import p001A0.RunnableC0040m;
import p001A0.RunnableC0045r;
import p007D0.AbstractC0096d;
import p012G.C0138b;
import p012G.C0140d;
import p015H0.AbstractC0153a;
import p017I0.AbstractC0155a;
import p022L.AbstractC0174d;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p027N0.InterfaceC0219c;
import p034R0.C0244c;
import p036S0.InterfaceC0249b;
import p040U0.AbstractC0291a;
import p052b1.AbstractC0503h;
import p052b1.C0499d;
import p052b1.C0501f;
import p060d1.C0519a;
import p069i.C0669d0;
import p093v.C1018c;
import p095w.C1030a;

/* JADX INFO: renamed from: D.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0079h {

    /* JADX INFO: renamed from: b */
    public static long f338b;

    /* JADX INFO: renamed from: c */
    public static Method f339c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static boolean m164A() {
        try {
            if (f339c == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f339c == null) {
                f338b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f339c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f339c.invoke(null, Long.valueOf(f338b))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static boolean m165B(byte b) {
        return b > -65;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static final boolean m166D(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static List m167E(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC0223g.m417d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static float m168J(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0078g.m163c(edgeEffect, f, f2);
        }
        AbstractC0077f.m160a(edgeEffect, f, f2);
        return f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static void m169L(String str, String str2, InterfaceC0204l interfaceC0204l) {
        AbstractC0223g.m418e(str, "url");
        AbstractC0096d.f381a.submit(new RunnableC0045r(str, str2, interfaceC0204l, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static C0138b m170M(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j2;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j2 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j4 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j4 + j2));
                    C0138b c0138b = new C0138b();
                    int iPosition = byteBufferDuplicate.position() + AbstractC0174d.m348d(byteBufferDuplicate, ByteOrder.LITTLE_ENDIAN);
                    c0138b.f437d = byteBufferDuplicate;
                    c0138b.f434a = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c0138b.f435b = i7;
                    c0138b.f436c = ((ByteBuffer) c0138b.f437d).getShort(i7);
                    return c0138b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static final byte[] m171N(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m185i(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        AbstractC0223g.m417d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: O */
    public static String m172O(File file, Charset charset) throws IOException {
        AbstractC0223g.m418e(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int i2 = inputStreamReader.read(cArr); i2 >= 0; i2 = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, i2);
            }
            String string = stringWriter.toString();
            AbstractC0223g.m417d(string, "toString(...)");
            inputStreamReader.close();
            return string;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static void m173R(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC0090s.m240d(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static void m174S(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static Set m175T(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        AbstractC0223g.m417d(setSingleton, "singleton(...)");
        return setSingleton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static C0244c m176U(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new C0244c(i2, i3 - 1, 1);
        }
        C0244c c0244c = C0244c.f590d;
        return C0244c.f590d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static ActionMode.Callback m177V(ActionMode.Callback callback) {
        return (!(callback instanceof ActionModeCallbackC0091t) || Build.VERSION.SDK_INT < 26) ? callback : ((ActionModeCallbackC0091t) callback).f360a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static ActionMode.Callback m178W(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof ActionModeCallbackC0091t) || callback == null) ? callback : new ActionModeCallbackC0091t(callback, textView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: X */
    public static void m179X(File file, String str) throws IOException {
        Charset charset = AbstractC0291a.f663a;
        AbstractC0223g.m418e(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        AbstractC0223g.m417d(bytes, "getBytes(...)");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m180d(StringBuilder sb, Object obj, InterfaceC0204l interfaceC0204l) {
        if (interfaceC0204l != null) {
            sb.append((CharSequence) interfaceC0204l.mo8c(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m181e(int i2) {
        if (new C0244c(2, 36, 1).m459a(i2)) {
            return;
        }
        throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new C0244c(2, 36, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m182f(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th != th2) {
                    Integer num = AbstractC0155a.f468a;
                    if (num == null || num.intValue() >= 19) {
                        th.addSuppressed(th2);
                        return;
                    }
                    Method method = AbstractC0153a.f465a;
                    if (method != null) {
                        method.invoke(th, th2);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static int m183g(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static int m184h(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m185i(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i2 = inputStream.read(bArr);
        while (i2 >= 0) {
            outputStream.write(bArr, 0, i2);
            i2 = inputStream.read(bArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static C0402q m186j(Context context) {
        ProviderInfo providerInfo;
        C1018c c1018c;
        ApplicationInfo applicationInfo;
        C0140d c0389d = Build.VERSION.SDK_INT >= 28 ? new C0389d(17) : new C0140d(17);
        PackageManager packageManager = context.getPackageManager();
        AbstractC0503h.m979g(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c1018c = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrMo312c = c0389d.mo312c(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo312c) {
                    arrayList.add(signature.toByteArray());
                }
                c1018c = new C1018c(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
                c1018c = null;
            }
        }
        if (c1018c == null) {
            return null;
        }
        return new C0402q(new C0401p(context, c1018c));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final boolean m187k(char c2, char c3, boolean z2) {
        if (c2 == c3) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static View m188l(View view, int i2) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View viewFindViewById = viewGroup.getChildAt(i3).findViewById(i2);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static C0499d m189m(DexKitBridge dexKitBridge, C0519a c0519a) {
        AbstractC0223g.m418e(dexKitBridge, "bridge");
        int iM1039b = c0519a.m1039b(4);
        int i2 = iM1039b != 0 ? c0519a.f1664b.getInt(iM1039b + c0519a.f1663a) : 0;
        int iM1039b2 = c0519a.m1039b(6);
        int i3 = iM1039b2 != 0 ? c0519a.f1664b.getInt(iM1039b2 + c0519a.f1663a) : 0;
        int iM1039b3 = c0519a.m1039b(8);
        if (iM1039b3 != 0) {
            c0519a.m1041d(iM1039b3 + c0519a.f1663a);
        }
        int iM1039b4 = c0519a.m1039b(10);
        int i4 = iM1039b4 != 0 ? c0519a.f1664b.getInt(iM1039b4 + c0519a.f1663a) : 0;
        int iM1039b5 = c0519a.m1039b(12);
        String strM1041d = iM1039b5 != 0 ? c0519a.m1041d(iM1039b5 + c0519a.f1663a) : null;
        if (strM1041d == null) {
            strM1041d = "";
        }
        int iM1039b6 = c0519a.m1039b(14);
        int i5 = iM1039b6 != 0 ? c0519a.f1664b.getInt(iM1039b6 + c0519a.f1663a) : 0;
        Integer numValueOf = i5 != -1 ? Integer.valueOf(i5) : null;
        ArrayList arrayList = new ArrayList();
        int iM1039b7 = c0519a.m1039b(16);
        int iM1043f = iM1039b7 != 0 ? c0519a.m1043f(iM1039b7) : 0;
        for (int i6 = 0; i6 < iM1043f; i6++) {
            int iM1039b8 = c0519a.m1039b(16);
            arrayList.add(Integer.valueOf(iM1039b8 != 0 ? c0519a.f1664b.getInt((i6 * 4) + c0519a.m1042e(iM1039b8)) : 0));
        }
        ArrayList arrayList2 = new ArrayList();
        int iM1039b9 = c0519a.m1039b(18);
        int iM1043f2 = iM1039b9 != 0 ? c0519a.m1043f(iM1039b9) : 0;
        for (int i7 = 0; i7 < iM1043f2; i7++) {
            int iM1039b10 = c0519a.m1039b(18);
            arrayList2.add(Integer.valueOf(iM1039b10 != 0 ? c0519a.f1664b.getInt((i7 * 4) + c0519a.m1042e(iM1039b10)) : 0));
        }
        ArrayList arrayList3 = new ArrayList();
        int iM1039b11 = c0519a.m1039b(20);
        int iM1043f3 = iM1039b11 != 0 ? c0519a.m1043f(iM1039b11) : 0;
        for (int i8 = 0; i8 < iM1043f3; i8++) {
            int iM1039b12 = c0519a.m1039b(20);
            arrayList3.add(Integer.valueOf(iM1039b12 != 0 ? c0519a.f1664b.getInt((i8 * 4) + c0519a.m1042e(iM1039b12)) : 0));
        }
        return new C0499d(dexKitBridge, i2, i3, i4, strM1041d, numValueOf, arrayList, arrayList2, arrayList3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static C0501f m190n(DexKitBridge dexKitBridge, C0519a c0519a) {
        AbstractC0223g.m418e(dexKitBridge, "bridge");
        int iM1039b = c0519a.m1039b(4);
        int i2 = iM1039b != 0 ? c0519a.f1664b.getInt(iM1039b + c0519a.f1663a) : 0;
        int iM1039b2 = c0519a.m1039b(6);
        int i3 = iM1039b2 != 0 ? c0519a.f1664b.getInt(iM1039b2 + c0519a.f1663a) : 0;
        int iM1039b3 = c0519a.m1039b(8);
        int i4 = iM1039b3 != 0 ? c0519a.f1664b.getInt(iM1039b3 + c0519a.f1663a) : 0;
        int iM1039b4 = c0519a.m1039b(10);
        int i5 = iM1039b4 != 0 ? c0519a.f1664b.getInt(iM1039b4 + c0519a.f1663a) : 0;
        int iM1039b5 = c0519a.m1039b(12);
        String strM1041d = iM1039b5 != 0 ? c0519a.m1041d(iM1039b5 + c0519a.f1663a) : null;
        AbstractC0223g.m415b(strM1041d);
        int iM1039b6 = c0519a.m1039b(14);
        return new C0501f(dexKitBridge, i2, i3, i4, i5, strM1041d, iM1039b6 != 0 ? c0519a.f1664b.getInt(iM1039b6 + c0519a.f1663a) : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static void m191o(String str, InterfaceC0204l interfaceC0204l) {
        AbstractC0223g.m418e(str, "url");
        AbstractC0096d.f381a.submit(new RunnableC0040m(str, interfaceC0204l, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m192p(String str, Map map, InterfaceC0204l interfaceC0204l) {
        AbstractC0223g.m418e(str, "url");
        AbstractC0223g.m418e(map, "header");
        AbstractC0096d.f381a.submit(new RunnableC0045r(str, map, interfaceC0204l, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static float m193s(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0078g.m162b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: u */
    public static final Class m194u(InterfaceC0249b interfaceC0249b) {
        AbstractC0223g.m418e(interfaceC0249b, "<this>");
        Class clsMo413a = ((InterfaceC0219c) interfaceC0249b).mo413a();
        if (clsMo413a.isPrimitive()) {
            String name = clsMo413a.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
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
        return clsMo413a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static C1030a m195w(C0669d0 c0669d0) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new C1030a(AbstractC0090s.m239c(c0669d0));
        }
        TextPaint textPaint = new TextPaint(c0669d0.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int iM228a = AbstractC0088q.m228a(c0669d0);
        int iM231d = AbstractC0088q.m231d(c0669d0);
        if (c0669d0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i2 < 28 || (c0669d0.getInputType() & 15) != 3) {
            boolean z2 = c0669d0.getLayoutDirection() == 1;
            switch (c0669d0.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z2) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(AbstractC0090s.m238b(AbstractC0089r.m236a(c0669d0.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new C1030a(textPaint, textDirectionHeuristic, iM228a, iM231d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static void m196x(byte b, byte b2, byte b3, byte b4, char[] cArr, int i2) {
        if (!m165B(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m165B(b3) && !m165B(b4)) {
                int i3 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i2] = (char) ((i3 >>> 10) + 55232);
                cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
                return;
            }
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static void m197y(byte b, byte b2, byte b3, char[] cArr, int i2) {
        if (m165B(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m165B(b3)))) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        cArr[i2] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static void m198z(byte b, byte b2, char[] cArr, int i2) {
        if (b < -62) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }
        if (m165B(b2)) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        }
        cArr[i2] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* JADX INFO: renamed from: C */
    public abstract boolean mo199C(Class cls);

    /* JADX INFO: renamed from: F */
    public abstract void mo200F(Throwable th);

    /* JADX INFO: renamed from: G */
    public abstract View mo201G(int i2);

    /* JADX INFO: renamed from: H */
    public abstract boolean mo202H();

    /* JADX INFO: renamed from: I */
    public abstract void mo203I(C0404s c0404s);

    /* JADX INFO: renamed from: K */
    public abstract Object mo204K(int i2, Intent intent);

    /* JADX INFO: renamed from: P */
    public abstract void mo205P(boolean z2);

    /* JADX INFO: renamed from: Q */
    public abstract void mo206Q(boolean z2);

    /* JADX INFO: renamed from: q */
    public abstract Method mo207q(Class cls, Field field);

    /* JADX INFO: renamed from: r */
    public abstract Constructor mo208r(Class cls);

    /* JADX INFO: renamed from: t */
    public abstract InputFilter[] mo209t(InputFilter[] inputFilterArr);

    /* JADX INFO: renamed from: v */
    public abstract String[] mo210v(Class cls);
}
