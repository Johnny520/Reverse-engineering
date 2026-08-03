package p000a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import org.luckypray.dexkit.DexKitBridge;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: a.w1 */
/* JADX INFO: loaded from: classes.dex */
public class C0889w1 {

    /* JADX INFO: renamed from: g */
    public static volatile ClassLoader f3479g;

    /* JADX INFO: renamed from: l */
    public static volatile DexKitBridge f3484l;

    /* JADX INFO: renamed from: p */
    public static volatile Context f3488p;

    /* JADX INFO: renamed from: q */
    public static volatile boolean f3489q;

    /* JADX INFO: renamed from: r */
    public static volatile Object f3490r;

    /* JADX INFO: renamed from: s */
    public static volatile Method f3491s;

    /* JADX INFO: renamed from: t */
    public static File f3492t;

    /* JADX INFO: renamed from: a */
    public static final Object f3473a = new Object();

    /* JADX INFO: renamed from: b */
    public static final float[][] f3474b = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: c */
    public static final float[][] f3475c = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: d */
    public static final float[] f3476d = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: e */
    public static final float[][] f3477e = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ C0889w1 f3478f = new C0889w1();

    /* JADX INFO: renamed from: h */
    public static final Object[] f3480h = new Object[0];

    /* JADX INFO: renamed from: i */
    public static final int[] f3481i = new int[0];

    /* JADX INFO: renamed from: j */
    public static final Object[] f3482j = new Object[0];

    /* JADX INFO: renamed from: k */
    public static final C0889w1 f3483k = new C0889w1();

    /* JADX INFO: renamed from: m */
    public static final Object f3485m = new Object();

    /* JADX INFO: renamed from: n */
    public static final String[] f3486n = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: o */
    public static final C0889w1 f3487o = new C0889w1();

    /* JADX INFO: renamed from: A */
    public static Drawable m2115A(Context context, int i) {
        return C0768pd.m1806b().m1809c(context, i);
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: B */
    public static Set m2116B() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m2117C(String str) {
        C0631i9.m1482e(str, "msg");
        C0908x1.m2194b("[ConvRV] ".concat(str));
    }

    /* JADX INFO: renamed from: D */
    public static void m2118D(Context context) {
        File file;
        C0631i9.m1482e(context, "ctx");
        if (f3492t != null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("top.mmjz.floatingclouds", 0);
            C0631i9.m1481d(applicationInfo, "getApplicationInfo(...)");
            file = new File(applicationInfo.dataDir, "files");
        } catch (Exception unused) {
            file = new File(Environment.getDataDirectory(), "data/top.mmjz.floatingclouds/files");
        }
        f3492t = file;
        file.mkdirs();
        Log.d("FileConfigStore", "init: rootDir=" + f3492t);
    }

    /* JADX INFO: renamed from: F */
    public static int m2119F(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f3476d;
        return C0872v3.m2083a(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: renamed from: G */
    public static boolean m2120G(EditText editText) {
        return editText.getInputType() != 0;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m2121H() {
        return f3484l != null;
    }

    /* JADX INFO: renamed from: I */
    public static final C0112G1 m2122I(Object[] objArr) {
        C0631i9.m1482e(objArr, "array");
        return new C0112G1(objArr);
    }

    /* JADX INFO: renamed from: J */
    public static float m2123J(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: K */
    public static List m2124K(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        C0631i9.m1481d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* JADX INFO: renamed from: L */
    public static void m2125L(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof InterfaceC0867uh) {
                editorInfo.hintText = ((InterfaceC0867uh) parent).m2080a();
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2126M(Context context, String str) {
        synchronized (f3473a) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "locales");
                        xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                        xmlSerializerNewSerializer.endTag(null, "locales");
                        xmlSerializerNewSerializer.endDocument();
                    } catch (Throwable th) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e);
                    if (fileOutputStreamOpenFileOutput != null) {
                    }
                }
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (FileNotFoundException unused3) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m2127N(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    /* JADX INFO: renamed from: O */
    public static Object m2128O(InterfaceC0819s7 interfaceC0819s7) {
        Object objMo31a;
        synchronized (f3485m) {
            objMo31a = interfaceC0819s7.mo31a();
        }
        return objMo31a;
    }

    /* JADX INFO: renamed from: P */
    public static byte[] m2129P(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new IllegalStateException(C0944z.m2225e("Not enough bytes to read: ", i));
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: Q */
    public static byte[] m2130Q(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: R */
    public static ArrayList m2131R(File file) throws IOException {
        Charset charset = C0382V2.f1441a;
        C0631i9.m1482e(charset, "charset");
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        try {
            for (String str : new C0204L3(new C0066D9(bufferedReader))) {
                C0631i9.m1482e(str, "it");
                arrayList.add(str);
                C0413Wf c0413Wf = C0413Wf.f1577a;
            }
            C0413Wf c0413Wf2 = C0413Wf.f1577a;
            bufferedReader.close();
            return arrayList;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0046 A[EXC_TOP_SPLITTER, PHI: r1
  0x0046: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:29:0x0053, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m2132S(Context context) {
        String attributeValue;
        synchronized (f3473a) {
            attributeValue = "";
            try {
                FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    try {
                        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                        xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                        int depth = xmlPullParserNewPullParser.getDepth();
                        while (true) {
                            int next = xmlPullParserNewPullParser.next();
                            if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } catch (IOException | XmlPullParserException unused) {
                        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        if (fileInputStreamOpenFileInput != null) {
                        }
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (attributeValue.isEmpty()) {
                        context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (Throwable th) {
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return attributeValue;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: T */
    public static String m2133T(File file) throws IOException {
        Charset charset = C0382V2.f1441a;
        C0631i9.m1482e(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strM1679v = C0726n9.m1679v(inputStreamReader);
            inputStreamReader.close();
            return strM1679v;
        } finally {
        }
    }

    /* JADX INFO: renamed from: U */
    public static long m2134U(InputStream inputStream, int i) throws IOException {
        byte[] bArrM2129P = m2129P(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM2129P[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* JADX DEBUG: Incorrect finally slice size: {[GOTO] complete}, expected: {[GOTO, SPUT, MOVE_EXCEPTION, INVOKE, CONSTRUCTOR, CONST_STR, INVOKE, INVOKE, INVOKE, INVOKE, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, INVOKE, FILLED_NEW_ARRAY, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: V */
    public static void m2135V(ClassLoader classLoader, List list) {
        C0631i9.m1482e(classLoader, "classLoader");
        if (list.isEmpty()) {
            return;
        }
        Object obj = f3490r;
        Method method = f3491s;
        if (obj == null || method == null) {
            String str = "sync: DataSource not captured yet, skip (wxids=" + list.size() + ")";
            C0631i9.m1482e(str, "msg");
            C0908x1.m2197e("[ConvSyncDriver] ".concat(str));
            return;
        }
        try {
            f3489q = true;
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                try {
                    method.invoke(obj, 3, str2);
                    i++;
                } catch (Throwable th) {
                    C0908x1.m2197e("ConvSyncDriver", "sync: k(3, " + str2 + ") failed: " + th.getMessage());
                }
            }
            String str3 = "sync: k(3, wxid) invoked for " + i + "/" + list.size();
            C0631i9.m1482e(str3, "msg");
            C0908x1.m2194b("[ConvSyncDriver] " + str3);
        } catch (Throwable th2) {
            try {
                String str4 = "sync failed: " + th2.getMessage();
                C0631i9.m1482e(str4, "msg");
                C0908x1.m2197e("[ConvSyncDriver] " + str4);
            } finally {
                f3489q = false;
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public static final Object[] m2136W(Collection collection) {
        int size = collection.size();
        Object[] objArr = f3480h;
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
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                        C0631i9.m1481d(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i = i2;
                }
            }
        }
        return objArr;
    }

    /* JADX INFO: renamed from: X */
    public static final Object[] m2137X(Collection collection, Object[] objArr) {
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
                    C0631i9.m1480c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
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
                        if (objArrCopyOf == objArr) {
                            objArr[i2] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                        C0631i9.m1481d(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
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

    /* JADX INFO: renamed from: Y */
    public static final void m2138Y(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        C0631i9.m1482e(str, "text");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            C0631i9.m1481d(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        C0631i9.m1479b(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        C0631i9.m1481d(byteBufferAllocate, "allocate(...)");
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            C0631i9.m1481d(cArrArray, "array(...)");
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }

    /* JADX INFO: renamed from: Z */
    public static void m2139Z(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static int m2140a(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX INFO: renamed from: a0 */
    public static void m2141a0(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        m2139Z(byteArrayOutputStream, i, 2);
    }

    /* JADX INFO: renamed from: b */
    public static int m2142b(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: b0 */
    public static float m2143b0() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    /* JADX INFO: renamed from: c */
    public static void m2144c(Object obj, Method method) {
        if (f3490r == null) {
            f3490r = obj;
            f3491s = method;
            String str = "captureFromHook: DataSource captured (" + obj.getClass().getName() + "), k=" + method.getName();
            C0631i9.m1482e(str, "msg");
            C0908x1.m2194b("[ConvSyncDriver] ".concat(str));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2145d(Context context) {
        File file;
        C0631i9.m1482e(context, "ctx");
        try {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("top.mmjz.floatingclouds", 0);
                C0631i9.m1481d(applicationInfo, "getApplicationInfo(...)");
                file = new File(applicationInfo.dataDir, "files");
            } catch (Exception unused) {
                file = new File(Environment.getDataDirectory(), "data/top.mmjz.floatingclouds/files");
            }
            new File(file, "floatingclouds_config.json").delete();
            new File(file, "floatingclouds_config.json.tmp").delete();
            Log.d("FileConfigStore", "clear: removed floatingclouds_config.json");
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m2146e(Closeable closeable, Throwable th) {
        try {
            closeable.close();
        } catch (Throwable th2) {
            C0631i9.m1482e(th, "<this>");
            C0631i9.m1482e(th2, "exception");
            if (th != th2) {
                C0900wc.f3501a.mo1550a(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m2147f(Comparable comparable, Comparable comparable2) {
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

    /* JADX INFO: renamed from: g */
    public static byte[] m2148g(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m2149h(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        C0631i9.m1482e(objArr, "<this>");
        C0631i9.m1482e(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m2150i(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        m2149h(objArr, objArr2, i, i2, i3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: a.H7 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static InterfaceC0474a4 m2151j(InterfaceC0474a4 interfaceC0474a4, InterfaceC0474a4 interfaceC0474a42, InterfaceC0136H7 interfaceC0136H7) {
        C0631i9.m1482e(interfaceC0136H7, "<this>");
        if (interfaceC0136H7 instanceof AbstractC0399W1) {
            return ((AbstractC0399W1) interfaceC0136H7).mo147g(interfaceC0474a4, interfaceC0474a42);
        }
        InterfaceC0911x4 interfaceC0911x4Mo846c = interfaceC0474a42.mo846c();
        return interfaceC0911x4Mo846c == C0403W5.f1543a ? new C0650j9(interfaceC0474a42, interfaceC0474a4, interfaceC0136H7) : new C0669k9(interfaceC0474a42, interfaceC0911x4Mo846c, interfaceC0136H7, interfaceC0474a4);
    }

    /* JADX INFO: renamed from: k */
    public static void m2152k(String str) {
        C0631i9.m1482e(str, "msg");
        C0908x1.m2193a("[ConvRV] ".concat(str));
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m2153l(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX INFO: renamed from: m */
    public static void m2154m(View view, C0909x2 c0909x2, ArrayList arrayList) {
        if (((Boolean) c0909x2.mo53f(view)).booleanValue()) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                C0631i9.m1481d(childAt, "getChildAt(...)");
                m2154m(childAt, c0909x2, arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static List m2155n(String str) {
        C0747ob c0747obM3325q;
        C0631i9.m1482e(str, "className");
        DexKitBridge dexKitBridge = f3484l;
        C0439Y5 c0439y5 = C0439Y5.f1645a;
        if (dexKitBridge != null) {
            try {
                synchronized (f3485m) {
                    C0951z6 c0951z6 = new C0951z6(1);
                    C0766pb c0766pb = new C0766pb();
                    C0766pb.m1803h(c0766pb, str);
                    c0951z6.f3564b = c0766pb;
                    c0747obM3325q = dexKitBridge.m3325q(c0951z6);
                }
                ArrayList arrayList = new ArrayList(C0758p3.m1800g0(c0747obM3325q, 10));
                for (C0690lb c0690lb : c0747obM3325q) {
                    arrayList.add(new C0144Hf(c0690lb.m1551b().f2126a, c0690lb.m1551b().f2127b, c0690lb.f2557d));
                }
                return arrayList;
            } catch (Exception e) {
                C0908x1.m2197e(C0944z.m2227g("DkBridge.findAllMethodsInClass(", str, ") err"), e);
            }
        }
        return c0439y5;
    }

    /* JADX INFO: renamed from: o */
    public static List m2156o(String str, String[] strArr) {
        C0631i9.m1482e(str, "namePattern");
        DexKitBridge dexKitBridge = f3484l;
        C0439Y5 c0439y5 = C0439Y5.f1645a;
        if (dexKitBridge != null) {
            try {
                C0530d3 c0530d3 = (C0530d3) m2128O(new C0741o5(dexKitBridge, strArr, str));
                ArrayList arrayList = new ArrayList(C0758p3.m1800g0(c0530d3, 10));
                Iterator<C0492b3> it = c0530d3.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().m1195b());
                }
                return arrayList;
            } catch (Exception e) {
                C0908x1.m2197e(C0944z.m2227g("DkBridge.findClasses(", str, ") fail"), e);
            }
        }
        return c0439y5;
    }

    /* JADX DEBUG: Class process forced to load method for inline: a.e3.i(a.e3, java.lang.String, int, int):void */
    /* JADX INFO: renamed from: p */
    public static List m2157p(String str) {
        C0530d3 c0530d3M3324p;
        DexKitBridge dexKitBridge = f3484l;
        C0439Y5 c0439y5 = C0439Y5.f1645a;
        if (dexKitBridge != null) {
            try {
                synchronized (f3485m) {
                    C0932y6 c0932y6 = new C0932y6();
                    C0549e3 c0549e3 = new C0549e3();
                    C0549e3.m1323i(c0549e3, str, 3, 4);
                    c0932y6.f3543b = c0549e3;
                    c0530d3M3324p = dexKitBridge.m3324p(c0932y6);
                }
                ArrayList arrayList = new ArrayList(C0758p3.m1800g0(c0530d3M3324p, 10));
                Iterator<C0492b3> it = c0530d3M3324p.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().m1195b());
                }
                return arrayList;
            } catch (Exception e) {
                C0908x1.m2197e(C0944z.m2227g("DkBridge.findClassesByNameEnd(", str, ") fail"), e);
            }
        }
        return c0439y5;
    }

    /* JADX INFO: renamed from: q */
    public static List m2158q(String str) {
        C0530d3 c0530d3M3324p;
        DexKitBridge dexKitBridge = f3484l;
        C0439Y5 c0439y5 = C0439Y5.f1645a;
        if (dexKitBridge != null) {
            try {
                synchronized (f3485m) {
                    C0932y6 c0932y6 = new C0932y6();
                    C0549e3 c0549e3 = new C0549e3();
                    C0549e3.m1323i(c0549e3, str, 1, 4);
                    c0932y6.f3543b = c0549e3;
                    c0530d3M3324p = dexKitBridge.m3324p(c0932y6);
                }
                ArrayList arrayList = new ArrayList(C0758p3.m1800g0(c0530d3M3324p, 10));
                Iterator<C0492b3> it = c0530d3M3324p.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().m1195b());
                }
                return arrayList;
            } catch (Exception e) {
                C0908x1.m2197e(C0944z.m2227g("DkBridge.findClassesInPackage(", str, ") fail"), e);
            }
        }
        return c0439y5;
    }

    /* JADX INFO: renamed from: r */
    public static List m2159r(String str, String[] strArr) {
        C0530d3 c0530d3M3324p;
        C0631i9.m1482e(str, "targetString");
        DexKitBridge dexKitBridge = f3484l;
        C0439Y5 c0439y5 = C0439Y5.f1645a;
        if (dexKitBridge != null) {
            try {
                synchronized (f3485m) {
                    C0932y6 c0932y6 = new C0932y6();
                    if (strArr != null) {
                        String[] strArr2 = (String[]) C0238N1.m633g0(strArr).toArray(new String[0]);
                        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
                        C0631i9.m1482e(strArr3, "searchPackages");
                        c0932y6.f3542a = C0238N1.m633g0(strArr3);
                    }
                    C0549e3 c0549e3 = new C0549e3();
                    C0549e3.m1322g(c0549e3, str);
                    c0932y6.f3543b = c0549e3;
                    c0530d3M3324p = dexKitBridge.m3324p(c0932y6);
                }
                ArrayList arrayList = new ArrayList(C0758p3.m1800g0(c0530d3M3324p, 10));
                Iterator<C0492b3> it = c0530d3M3324p.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().m1195b());
                }
                return arrayList;
            } catch (Exception e) {
                C0908x1.m2197e(C0944z.m2227g("DkBridge.findClassesUsingString(", str, ") fail"), e);
            }
        }
        return c0439y5;
    }

    /* JADX INFO: renamed from: s */
    public static List m2160s(String... strArr) {
        DexKitBridge dexKitBridge = f3484l;
        C0439Y5 c0439y5 = C0439Y5.f1645a;
        if (dexKitBridge != null) {
            try {
                C0530d3 c0530d3 = (C0530d3) m2128O(new C0722n5(dexKitBridge, 0, strArr));
                ArrayList arrayList = new ArrayList(C0758p3.m1800g0(c0530d3, 10));
                Iterator<C0492b3> it = c0530d3.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().m1195b());
                }
                return arrayList;
            } catch (Exception e) {
                C0908x1.m2197e(C0944z.m2227g("DkBridge.findClassesUsingStrings(", C0238N1.m631e0(strArr, ",", null, 62), ") fail"), e);
            }
        }
        return c0439y5;
    }

    /* JADX INFO: renamed from: t */
    public static List m2161t(String str, String str2, Boolean bool, Boolean bool2) {
        DexKitBridge dexKitBridge = f3484l;
        C0439Y5 c0439y5 = C0439Y5.f1645a;
        if (dexKitBridge != null) {
            try {
                C0818s6 c0818s6 = (C0818s6) m2128O(new C0741o5(dexKitBridge, str, str2));
                ArrayList arrayList = new ArrayList();
                for (C0799r6 c0799r6 : c0818s6) {
                    C0799r6 c0799r62 = c0799r6;
                    if (bool == null || Boolean.valueOf(Modifier.isStatic(c0799r62.f3140c)).equals(bool)) {
                        if (bool2 == null || Boolean.valueOf(Modifier.isFinal(c0799r62.f3140c)).equals(bool2)) {
                            arrayList.add(c0799r6);
                        }
                    }
                }
                return arrayList;
            } catch (Exception e) {
                C0908x1.m2197e("DkBridge.findFieldsByStructure fail", e);
            }
        }
        return c0439y5;
    }

    /* JADX INFO: renamed from: u */
    public static List m2162u(List list) {
        C0747ob c0747obM3325q;
        DexKitBridge dexKitBridge = f3484l;
        C0439Y5 c0439y5 = C0439Y5.f1645a;
        if (dexKitBridge != null) {
            try {
                synchronized (f3485m) {
                    C0951z6 c0951z6 = new C0951z6(1);
                    C0766pb c0766pb = new C0766pb();
                    C0766pb.m1804j(c0766pb, "V");
                    c0766pb.m1805i(list);
                    c0951z6.f3564b = c0766pb;
                    c0747obM3325q = dexKitBridge.m3325q(c0951z6);
                }
                ArrayList arrayList = new ArrayList(C0758p3.m1800g0(c0747obM3325q, 10));
                for (C0690lb c0690lb : c0747obM3325q) {
                    arrayList.add(new C0144Hf(c0690lb.m1551b().f2126a, c0690lb.m1551b().f2127b, c0690lb.f2557d));
                }
                return arrayList;
            } catch (Exception e) {
                C0908x1.m2197e("DkBridge.findMethodsByParamTypes err", e);
            }
        }
        return c0439y5;
    }

    /* JADX INFO: renamed from: v */
    public static List m2163v(List list) {
        C0747ob c0747obM3325q;
        C0631i9.m1482e(list, "paramTypes");
        DexKitBridge dexKitBridge = f3484l;
        C0439Y5 c0439y5 = C0439Y5.f1645a;
        if (dexKitBridge != null) {
            try {
                synchronized (f3485m) {
                    C0951z6 c0951z6 = new C0951z6(1);
                    C0766pb c0766pb = new C0766pb();
                    c0766pb.m1805i(list);
                    c0951z6.f3564b = c0766pb;
                    c0747obM3325q = dexKitBridge.m3325q(c0951z6);
                }
                ArrayList arrayList = new ArrayList(C0758p3.m1800g0(c0747obM3325q, 10));
                for (C0690lb c0690lb : c0747obM3325q) {
                    arrayList.add(new C0144Hf(c0690lb.m1551b().f2126a, c0690lb.m1551b().f2127b, c0690lb.f2557d));
                }
                return arrayList;
            } catch (Exception e) {
                C0908x1.m2197e("DkBridge.findMethodsByParamTypesRelaxed err", e);
            }
        }
        return c0439y5;
    }

    /* JADX INFO: renamed from: w */
    public static List m2164w(String str) {
        C0747ob c0747obM3325q;
        DexKitBridge dexKitBridge = f3484l;
        C0439Y5 c0439y5 = C0439Y5.f1645a;
        if (dexKitBridge != null) {
            try {
                synchronized (f3485m) {
                    C0951z6 c0951z6 = new C0951z6(1);
                    C0766pb c0766pb = new C0766pb();
                    C0766pb.m1802g(c0766pb, str);
                    c0951z6.f3564b = c0766pb;
                    c0747obM3325q = dexKitBridge.m3325q(c0951z6);
                }
                ArrayList arrayList = new ArrayList(C0758p3.m1800g0(c0747obM3325q, 10));
                for (C0690lb c0690lb : c0747obM3325q) {
                    arrayList.add(new C0144Hf(c0690lb.m1551b().f2126a, c0690lb.m1551b().f2127b, c0690lb.f2557d));
                }
                return arrayList;
            } catch (Exception e) {
                C0908x1.m2197e("DkBridge.findMethodsBySignature fail", e);
            }
        }
        return c0439y5;
    }

    /* JADX INFO: renamed from: x */
    public static List m2165x(String str, String str2, List list, String str3, int i) {
        final String str4 = (i & 1) != 0 ? null : str;
        final String str5 = (i & 2) != 0 ? null : str2;
        final List list2 = (i & 4) != 0 ? null : list;
        final String str6 = (i & 8) != 0 ? null : str3;
        final DexKitBridge dexKitBridge = f3484l;
        C0439Y5 c0439y5 = C0439Y5.f1645a;
        if (dexKitBridge != null) {
            try {
                return (List) m2128O(new InterfaceC0819s7() { // from class: a.p5
                    @Override // p000a.InterfaceC0819s7
                    /* JADX INFO: renamed from: a */
                    public final Object mo31a() {
                        C0951z6 c0951z6 = new C0951z6(1);
                        C0766pb c0766pb = new C0766pb();
                        String str7 = str4;
                        if (str7 != null) {
                            C0766pb.m1803h(c0766pb, str7);
                        }
                        String str8 = str5;
                        if (str8 != null) {
                            C0766pb.m1804j(c0766pb, str8);
                        }
                        List list3 = list2;
                        if (list3 != null) {
                            c0766pb.m1805i(list3);
                        }
                        String str9 = str6;
                        if (str9 != null) {
                            C0766pb.m1802g(c0766pb, str9);
                        }
                        c0951z6.f3564b = c0766pb;
                        return dexKitBridge.m3325q(c0951z6);
                    }
                });
            } catch (Exception e) {
                C0908x1.m2197e("DkBridge.findMethodsByStructure fail", e);
            }
        }
        return c0439y5;
    }

    /* JADX INFO: renamed from: y */
    public static List m2166y(String str) {
        C0747ob c0747obM3325q;
        DexKitBridge dexKitBridge = f3484l;
        C0439Y5 c0439y5 = C0439Y5.f1645a;
        if (dexKitBridge != null) {
            try {
                synchronized (f3485m) {
                    C0951z6 c0951z6 = new C0951z6(1);
                    C0766pb c0766pb = new C0766pb();
                    C0766pb.m1803h(c0766pb, str);
                    C0766pb.m1802g(c0766pb, "updateUnreadByTalker");
                    c0951z6.f3564b = c0766pb;
                    c0747obM3325q = dexKitBridge.m3325q(c0951z6);
                }
                return c0747obM3325q;
            } catch (Exception e) {
                C0908x1.m2197e(C0944z.m2227g("DkBridge.findMethodsInClassByString(", str, ") fail"), e);
            }
        }
        return c0439y5;
    }

    /* JADX INFO: renamed from: E */
    public synchronized boolean m2167E(String str) {
        C0631i9.m1482e(str, "apkPath");
        if (f3484l != null) {
            return true;
        }
        boolean z = false;
        try {
            System.loadLibrary("dexkit");
            f3484l = new DexKitBridge(str);
            Log.i("[MyPlugin-DexKit]", "DkBridge.init OK, apkPath=".concat(str));
            z = f3484l != null;
        } catch (Exception e) {
            Log.w("[MyPlugin-DexKit]", "DkBridge.init FAILED: " + e.getMessage());
        }
        return z;
    }

    /* JADX INFO: renamed from: z */
    public void mo44z(C0447Yd c0447Yd, float f, float f2) {
        throw null;
    }
}
