package com.tendcloud.tenddata;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tendcloud.tenddata.y */
/* JADX INFO: loaded from: classes.dex */
public class C0131y {

    /* JADX INFO: renamed from: a */
    public static final boolean f629a = false;

    /* JADX INFO: renamed from: b */
    public static String f630b = "TDLog";

    /* JADX INFO: renamed from: c */
    public static boolean f631c = false;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ boolean f632d = true;

    /* JADX INFO: renamed from: e */
    private static volatile int f633e = -1;

    /* JADX INFO: renamed from: f */
    private static final String f634f = "UTF-8";

    /* JADX INFO: renamed from: g */
    private static final String f635g = "ge";

    /* JADX INFO: renamed from: h */
    private static final String f636h = "tp";

    /* JADX INFO: renamed from: i */
    private static final String f637i = "rop";

    /* JADX INFO: renamed from: l */
    private static final byte f640l = 61;

    /* JADX INFO: renamed from: m */
    private static final String f641m = "US-ASCII";

    /* JADX INFO: renamed from: q */
    private static final String f645q = "00:00:00:00:00:00";

    /* JADX INFO: renamed from: r */
    private static final String f646r = "02:00:00:00:00:00";

    /* JADX INFO: renamed from: j */
    private static final ExecutorService f638j = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: k */
    private static final HashMap<String, Boolean> f639k = new HashMap<>();

    /* JADX INFO: renamed from: n */
    private static final byte[] f642n = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: o */
    private static byte[] f643o = {1, 2, 3, 4, 5, 6, 7, 8};

    /* JADX INFO: renamed from: p */
    private static final SecureRandom f644p = new SecureRandom();

    /* JADX INFO: renamed from: s */
    private static final Pattern f647s = Pattern.compile("^([0-9A-F]{2}:){5}([0-9A-F]{2})$");

    /* JADX INFO: renamed from: a */
    public static String m744a() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop").getInputStream(), f634f));
        } catch (Throwable unused) {
            bufferedReader = null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            do {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb.append(line);
                        sb.append("\n");
                    }
                } catch (Throwable unused2) {
                }
                String string = sb.toString();
                try {
                    bufferedReader.close();
                } catch (Throwable unused3) {
                }
                return string;
            } while (sb.length() <= 104857600);
            throw new RuntimeException("Input stream more than 100 MB size limit");
        } catch (Throwable unused4) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused5) {
                }
            }
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:22|3)|(3:24|4|(4:6|20|7|8))|18|9|14|(1:(0))) */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m745a(Context context, String str) {
        InputStream inputStreamOpen;
        try {
            inputStreamOpen = context.getAssets().open(str);
        } catch (Throwable unused) {
            inputStreamOpen = null;
        }
        try {
            byte[] bArr = new byte[inputStreamOpen.available()];
            if (inputStreamOpen.read(bArr) > 0) {
                String string = new JSONObject(new String(bArr)).getString("td_channel_id");
                try {
                    inputStreamOpen.close();
                } catch (Throwable unused2) {
                }
                return string;
            }
        } catch (Throwable unused3) {
            if (inputStreamOpen != null) {
            }
            return null;
        }
        inputStreamOpen.close();
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m746a(Bundle bundle, String str) {
        Iterator<String> it;
        if (bundle == null) {
            return null;
        }
        try {
            it = bundle.keySet().iterator();
        } catch (Throwable unused) {
        }
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(str)) {
                return String.valueOf(bundle.get(str));
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static final String m747a(String str) {
        if (str == null) {
            return null;
        }
        return str.length() > 256 ? str.substring(0, 256) : str;
    }

    /* JADX INFO: renamed from: a */
    public static String m748a(byte[] bArr) {
        try {
            StringBuilder sb = new StringBuilder();
            for (byte b : bArr) {
                int i = b & 255;
                if (i < 16) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m749a(byte[] bArr, int i, int i2) {
        byte[] bArrM768b = m768b(bArr, i, i2);
        try {
            return new String(bArrM768b, f641m);
        } catch (Throwable unused) {
            return new String(bArrM768b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m750a(JSONObject jSONObject) {
        TreeMap treeMap = new TreeMap();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                treeMap.put(next, jSONObject.get(next));
            }
        } catch (Throwable unused) {
        }
        return treeMap;
    }

    /* JADX INFO: renamed from: a */
    public static void m751a(File file, byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr2 = new byte[4096];
                while (true) {
                    int i = byteArrayInputStream.read(bArr2);
                    if (i == -1) {
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr2, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                byteArrayInputStream.close();
                throw th;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m752a(Class<?> cls, final InterfaceC0128v interfaceC0128v, String str, String str2) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        final Object obj = declaredField.get(null);
        Class<?> cls2 = Class.forName(str2);
        declaredField.set(null, Proxy.newProxyInstance(cls.getClass().getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.tendcloud.tenddata.y.2
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj2, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
                interfaceC0128v.beforeMethodInvoke(obj2, method, objArr);
                Object objInvoke = method.invoke(obj, objArr);
                interfaceC0128v.afterMethodInvoked(obj2, method, objArr, objInvoke);
                return objInvoke;
            }
        }));
    }

    /* JADX INFO: renamed from: a */
    public static void m753a(Object obj, final InterfaceC0128v interfaceC0128v, String str, String str2) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            final Object obj2 = declaredField.get(obj);
            Class<?> cls = Class.forName(str2);
            declaredField.set(obj, Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.tendcloud.tenddata.y.1
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj3, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
                    interfaceC0128v.beforeMethodInvoke(obj3, method, objArr);
                    Object objInvoke = method.invoke(obj2, objArr);
                    interfaceC0128v.afterMethodInvoked(obj3, method, objArr, objInvoke);
                    return objInvoke;
                }
            }));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m754a(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m755a(Context context) {
        if (f633e != -1) {
            if (f633e == 0) {
                return true;
            }
            f633e = -1;
            return false;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            String str = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).processName;
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (Process.myPid() == runningAppProcessInfo.pid && runningAppProcessInfo.processName.equals(str)) {
                        f633e = 0;
                        return true;
                    }
                }
            } else {
                f633e = 1;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m756a(Context context, int i) {
        try {
            return m770c(context) >= i;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m757a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        try {
            byte[] bArr3 = f642n;
            int i4 = (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 2 ? (bArr[i + 2] << 24) >>> 24 : 0);
            if (i2 == 1) {
                bArr2[i3] = bArr3[i4 >>> 18];
                bArr2[i3 + 1] = bArr3[(i4 >>> 12) & 63];
                bArr2[i3 + 2] = f640l;
                bArr2[i3 + 3] = f640l;
                return bArr2;
            }
            if (i2 == 2) {
                bArr2[i3] = bArr3[i4 >>> 18];
                bArr2[i3 + 1] = bArr3[(i4 >>> 12) & 63];
                bArr2[i3 + 2] = bArr3[(i4 >>> 6) & 63];
                bArr2[i3 + 3] = f640l;
                return bArr2;
            }
            if (i2 != 3) {
                return bArr2;
            }
            bArr2[i3] = bArr3[i4 >>> 18];
            bArr2[i3 + 1] = bArr3[(i4 >>> 12) & 63];
            bArr2[i3 + 2] = bArr3[(i4 >>> 6) & 63];
            bArr2[i3 + 3] = bArr3[i4 & 63];
            return bArr2;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m758a(byte[] bArr, byte[] bArr2) {
        try {
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(bArr2));
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            cipher.init(1, secretKeyGenerateSecret, new IvParameterSpec(f643o));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m759b(Context context, int i) {
        try {
            return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m760b(File file, byte[] bArr) {
        FileOutputStream fileOutputStream;
        ByteArrayInputStream byteArrayInputStream;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr2 = new byte[4096];
                        while (true) {
                            int i = byteArrayInputStream.read(bArr2);
                            if (i != -1) {
                                fileOutputStream.write(bArr2, 0, i);
                                messageDigest.update(bArr2, 0, i);
                            } else {
                                try {
                                    break;
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        fileOutputStream.close();
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable unused2) {
                        }
                        return m748a(messageDigest.digest());
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable unused3) {
                            }
                        }
                        if (byteArrayInputStream == null) {
                            throw th;
                        }
                        try {
                            byteArrayInputStream.close();
                            throw th;
                        } catch (Throwable unused4) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                byteArrayInputStream = null;
            }
        } catch (Throwable unused5) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m761b(byte[] bArr) {
        String strM749a;
        try {
            strM749a = m749a(bArr, 0, bArr.length);
        } catch (Throwable th) {
            if (!f632d) {
                throw new AssertionError(th.getMessage());
            }
            strM749a = null;
        }
        if (f632d || strM749a != null) {
            return strM749a;
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: b */
    public static SecureRandom m762b() {
        return f644p;
    }

    /* JADX INFO: renamed from: b */
    public static Map<String, Object> m763b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            HashMap map = new HashMap();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.get(next));
            }
            return map;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m764b(int i) {
        return Build.VERSION.SDK_INT < i;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m765b(Context context) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m766b(Context context, String str) {
        boolean z;
        try {
            HashMap<String, Boolean> map = f639k;
            if (map.containsKey(str)) {
                return map.get(str).booleanValue();
            }
            if (m754a(23)) {
                if (context.checkSelfPermission(str) == 0) {
                }
            } else {
                z = context.checkCallingOrSelfPermission(str) == 0;
            }
            map.put(str, Boolean.valueOf(z));
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m767b(String str) {
        return str == null || str.trim().length() == 0;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m768b(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i);
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + i2);
        }
        if (i + i2 > bArr.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length)));
        }
        int i3 = ((i2 / 3) * 4) + (i2 % 3 <= 0 ? 0 : 4);
        byte[] bArr2 = new byte[i3];
        int i4 = i2 - 2;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            m757a(bArr, i5 + i, 3, bArr2, i6);
            i5 += 3;
            i6 += 4;
        }
        if (i5 < i2) {
            m757a(bArr, i + i5, i2 - i5, bArr2, i6);
            i6 += 4;
        }
        if (i6 > i3 - 1) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i6];
        System.arraycopy(bArr2, 0, bArr3, 0, i6);
        return bArr3;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m769b(byte[] bArr, byte[] bArr2) {
        try {
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(bArr2));
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            cipher.init(2, secretKeyGenerateSecret, new IvParameterSpec(f643o));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m770c(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            if (applicationInfo != null) {
                return applicationInfo.targetSdkVersion;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m771c(String str) {
        try {
            return m748a(MessageDigest.getInstance("MD5").digest(str.getBytes(f634f)));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(5:36|3|4|34|5)|(8:6|30|7|(1:9)(1:42)|16|(2:38|20)|(2:28|13)|23)|10|32|11|40|12|28|13|23|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:0|2|36|3|4|34|5|(8:6|30|7|(1:9)(1:42)|16|(2:38|20)|(2:28|13)|23)|10|32|11|40|12|28|13|23|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m772c(byte[] bArr) {
        GZIPInputStream gZIPInputStream;
        String str;
        byte[] bArr2;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                bArr2 = new byte[1024];
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable unused) {
                str = null;
            }
        } catch (Throwable unused2) {
            gZIPInputStream = null;
            str = null;
        }
        while (true) {
            try {
                int i = gZIPInputStream.read(bArr2, 0, 1024);
                if (i == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, i);
            } catch (Throwable unused3) {
                str = null;
            }
            byteArrayOutputStream2 = byteArrayOutputStream;
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Throwable unused4) {
                }
            }
            if (gZIPInputStream != null) {
                gZIPInputStream.close();
            }
            return str;
        }
        str = new String(byteArrayOutputStream.toByteArray());
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        gZIPInputStream.close();
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m773c(Context context, String str) {
        boolean z = false;
        try {
            if (m754a(23)) {
                if (context.checkSelfPermission(str) == 0) {
                    z = true;
                }
            } else if (context.checkCallingOrSelfPermission(str) == 0) {
                z = true;
            }
        } catch (Throwable unused) {
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public static String m774d(Context context, String str) {
        try {
            return m746a(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData, str);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m775d(String str) {
        try {
            int length = str.length();
            byte[] bArr = new byte[length / 2];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
            }
            return bArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|25|3|4|(2:35|5)|(7:6|27|7|(1:9)(1:37)|31|12|20)|10|33|11|31|12|20|(1:(0))) */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m776d(byte[] bArr) {
        GZIPInputStream gZIPInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr2;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        byte[] byteArray = null;
        try {
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                bArr2 = new byte[1024];
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable unused) {
                byteArrayOutputStream = null;
            }
        } catch (Throwable unused2) {
            gZIPInputStream = null;
            byteArrayOutputStream = null;
        }
        while (true) {
            try {
                int i = gZIPInputStream.read(bArr2, 0, 1024);
                if (i == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, i);
            } catch (Throwable unused3) {
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                if (gZIPInputStream != null) {
                }
                return byteArray;
            }
            gZIPInputStream.close();
            return byteArray;
        }
        byteArrayOutputStream.flush();
        byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        gZIPInputStream.close();
        return byteArray;
    }

    /* JADX INFO: renamed from: e */
    public static String m777e(String str) {
        if (str == null) {
            return null;
        }
        try {
            return m748a(MessageDigest.getInstance("SHA-256").digest(str.getBytes(f634f)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static FileChannel m778e(Context context, String str) {
        RandomAccessFile randomAccessFile;
        try {
            File file = new File(context.getFilesDir(), str + "td.lock");
            if (!file.exists()) {
                file.createNewFile();
            }
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (Throwable unused) {
            randomAccessFile = null;
        }
        try {
            return randomAccessFile.getChannel();
        } catch (Throwable unused2) {
            if (randomAccessFile == null) {
                return null;
            }
            try {
                randomAccessFile.close();
                return null;
            } catch (Throwable unused3) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m779e(byte[] bArr) {
        Inflater inflater = new Inflater();
        inflater.reset();
        inflater.setInput(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        try {
            byte[] bArr2 = new byte[1024];
            while (!inflater.finished()) {
                byteArrayOutputStream.write(bArr2, 0, inflater.inflate(bArr2));
            }
            bArr = byteArrayOutputStream.toByteArray();
        } catch (Throwable unused) {
        }
        try {
            byteArrayOutputStream.close();
        } catch (Throwable unused2) {
        }
        inflater.end();
        return bArr;
    }

    public static void execute(Runnable runnable) {
        ExecutorService executorService = f638j;
        if (executorService != null) {
            executorService.execute(runnable);
        }
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m780f(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Deflater deflater = new Deflater(9, true);
        DeflaterOutputStream deflaterOutputStream = null;
        try {
            try {
                DeflaterOutputStream deflaterOutputStream2 = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                try {
                    deflaterOutputStream2.write(str.getBytes(f634f));
                    deflaterOutputStream2.close();
                } catch (Throwable unused) {
                    deflaterOutputStream = deflaterOutputStream2;
                    if (deflaterOutputStream != null) {
                        deflaterOutputStream.close();
                    }
                    deflater.end();
                    return byteArrayOutputStream.toByteArray();
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
        }
        deflater.end();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: g */
    public static Long m781g(String str) {
        long j = -1L;
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (Throwable unused) {
            return j;
        }
    }

    /* JADX INFO: renamed from: h */
    public static Integer m782h(String str) {
        int i = -1;
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (Throwable unused) {
            return i;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m783i(String str) {
        return !m767b(str) && C0124q.f597h.matcher(str).matches();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m784j(String str) {
        try {
            if (m767b(str) || !f647s.matcher(str).matches() || f646r.equals(str)) {
                return true;
            }
            return f645q.equals(str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
