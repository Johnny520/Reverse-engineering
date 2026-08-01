package com.p001mr.elaris;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.ContentUris;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.UriPermission;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import com.p001mr.elaris.xposedcompat.XposedHelpers;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import p000.AbstractC0174d;
import p000.AbstractC0198e7;
import p000.AbstractC0260i5;
import p000.AbstractC0486u9;
import p000.AbstractC0497v4;
import p000.C0203ec;
import p000.C0269ie;
import p000.C0288je;
import p000.C0289k;
import p000.C0304ke;
import p000.C0315l9;
import p000.C0317lb;
import p000.C0320le;
import p000.C0331m9;
import p000.C0344n6;
import p000.C0347n9;
import p000.C0348na;
import p000.C0410pd;
import p000.C0411pe;
import p000.C0427qe;
import p000.C0461t0;
import p000.C0479u2;
import p000.C0491ue;
import p000.C0502v9;
import p000.C0507ve;
import p000.C0515w6;
import p000.C0527x2;
import p000.C0540y;
import p000.DialogInterfaceOnDismissListenerC0336me;
import p000.RunnableC0239h0;
import p000.RunnableC0258i3;
import p000.ViewOnClickListenerC0189de;
import p000.ViewOnClickListenerC0205ee;
import p000.ViewOnClickListenerC0237ge;
import p000.ViewOnClickListenerC0459se;
import p000.ViewOnClickListenerC0475te;
import p000.ViewOnLongClickListenerC0221fe;

/* JADX INFO: renamed from: com.mr.elaris.w */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0169w {

    /* JADX INFO: renamed from: a */
    public static final String[] f161a = {"com.tencent.qqnt.aio.menu.ui.QQCustomMenuExpandableLayout", "com.tencent.qqnt.aio.menu.ui.QQCustomMenuNoIconLayout", "com.tencent.mobileqq.utils.dialogutils.QQCustomMenuNoIconLayout"};

    /* JADX INFO: renamed from: b */
    public static final Map f162b = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: c */
    public static final Set f163c = Collections.synchronizedSet(Collections.newSetFromMap(new IdentityHashMap()));

    /* JADX INFO: renamed from: d */
    public static final Set f164d = Collections.synchronizedSet(Collections.newSetFromMap(new HashMap()));

    /* JADX INFO: renamed from: e */
    public static final Set f165e = Collections.synchronizedSet(Collections.newSetFromMap(new HashMap()));

    /* JADX INFO: renamed from: f */
    public static final Set f166f = Collections.synchronizedSet(Collections.newSetFromMap(new HashMap()));

    /* JADX INFO: renamed from: g */
    public static volatile boolean f167g;

    /* JADX INFO: renamed from: h */
    public static volatile boolean f168h;

    /* JADX INFO: renamed from: i */
    public static volatile boolean f169i;

    /* JADX INFO: renamed from: j */
    public static volatile boolean f170j;

    /* JADX INFO: renamed from: k */
    public static volatile boolean f171k;

    /* JADX INFO: renamed from: l */
    public static volatile boolean f172l;

    /* JADX INFO: renamed from: m */
    public static volatile boolean f173m;

    /* JADX INFO: renamed from: n */
    public static volatile long f174n;

    /* JADX INFO: renamed from: o */
    public static volatile long f175o;

    /* JADX INFO: renamed from: p */
    public static volatile C0410pd f176p;

    /* JADX INFO: renamed from: q */
    public static volatile long f177q;

    /* JADX INFO: renamed from: r */
    public static volatile C0540y f178r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static Method m231A(Class cls, Class cls2) throws NoSuchMethodException {
        Class<?> cls3;
        for (Method method : cls.getDeclaredMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (View.class.isAssignableFrom(method.getReturnType()) && parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && !parameterTypes[1].isPrimitive() && ((parameterTypes[1].isAssignableFrom(cls2) || Object.class == (cls3 = parameterTypes[1]) || cls3.getName().toLowerCase(Locale.US).contains("menu")) && parameterTypes[2] == Boolean.TYPE && parameterTypes[3] == float[].class)) {
                return method;
            }
        }
        throw new NoSuchMethodException("menu item view builder");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A0 */
    public static Object m232A0(Object obj) {
        if (obj != null) {
            if (m287b0(obj.getClass())) {
                return obj;
            }
            Object objM245H = m245H(obj, "pttElement", "mPttElement");
            if (objM245H != null && m287b0(objM245H.getClass())) {
                return objM245H;
            }
            try {
                for (Method method : obj.getClass().getDeclaredMethods()) {
                    if (method.getParameterTypes().length == 0 && !Modifier.isAbstract(method.getModifiers()) && m287b0(method.getReturnType())) {
                        try {
                            method.setAccessible(true);
                            Object objInvoke = method.invoke(obj, null);
                            if (objInvoke != null && m287b0(objInvoke.getClass())) {
                                return objInvoke;
                            }
                        } catch (Throwable unused) {
                            continue;
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static Method m233B(Class cls, String str) throws NoSuchMethodException {
        while (cls != null && cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.getName().equals(str) && method.getParameterTypes().length == 0 && List.class.isAssignableFrom(method.getReturnType())) {
                    return method;
                }
            }
            cls = cls.getSuperclass();
        }
        throw new NoSuchMethodException("component menu method");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B0 */
    public static C0317lb m234B0(Object obj) {
        byte[] bArr;
        List list;
        Object objM232A0 = m232A0(obj);
        if (objM232A0 == null) {
            Object objM1097p = AbstractC0497v4.m1097p(obj);
            if (objM1097p == null) {
                objM1097p = MessageRepeater.cachedMsgRecordFromAny(obj);
            }
            Object objM232A02 = m232A0(objM1097p);
            if (objM232A02 != null) {
                objM232A0 = objM232A02;
            } else {
                Object objM298h = m298h(objM1097p, "getElements");
                if (objM298h instanceof List) {
                    list = (List) objM298h;
                } else {
                    Object objM245H = m245H(objM1097p, "elements", "msgElements", "msgElementList", "elementList");
                    list = objM245H instanceof List ? (List) objM245H : null;
                }
                if (list != null) {
                    for (int i = 0; i < list.size(); i++) {
                        Object objM232A03 = m232A0(list.get(i));
                        if (objM232A03 != null) {
                            objM232A0 = objM232A03;
                            break;
                        }
                    }
                    objM232A0 = null;
                } else {
                    objM232A0 = null;
                }
            }
        }
        if (objM232A0 == null) {
            return null;
        }
        String strM247I = m247I(objM232A0, "filePath", "path", "localPath");
        if (strM247I.length() == 0) {
            strM247I = m247I(obj, "filePath", "path", "localPath");
        }
        File file = strM247I.length() != 0 ? new File(strM247I) : null;
        String strM247I2 = m247I(objM232A0, "fileName", "name");
        int iM275W = m275W(0, m245H(objM232A0, "duration"));
        Object objM245H2 = m245H(objM232A0, "waveAmplitudes", "waves", "wave");
        if (objM245H2 instanceof byte[]) {
            bArr = (byte[]) objM245H2;
        } else if (objM245H2 instanceof List) {
            List list2 = (List) objM245H2;
            byte[] bArr2 = new byte[list2.size()];
            for (int i2 = 0; i2 < list2.size(); i2++) {
                Object obj2 = list2.get(i2);
                bArr2[i2] = obj2 instanceof Number ? ((Number) obj2).byteValue() : (byte) 0;
            }
            bArr = bArr2;
        } else {
            bArr = new byte[0];
        }
        return new C0317lb(file, strM247I2, iM275W, bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static String m235C(Class cls) throws NoSuchMethodException {
        for (Method method : cls.getDeclaredMethods()) {
            if (Modifier.isAbstract(method.getModifiers()) && method.getParameterTypes().length == 0 && List.class.isAssignableFrom(method.getReturnType())) {
                return method.getName();
            }
        }
        throw new NoSuchMethodException("menu list method");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C0 */
    public static Object m236C0(ClassLoader classLoader, String str) {
        try {
            Class<?> clsFindClass = XposedHelpers.findClass("com.tencent.mobileqq.qroute.QRoute", classLoader);
            Class<?> clsFindClass2 = XposedHelpers.findClass(str, classLoader);
            Method method = clsFindClass.getMethod("api", Class.class);
            method.setAccessible(true);
            return method.invoke(null, clsFindClass2);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static C0203ec m237D(Class cls, Class cls2) throws NoSuchMethodException {
        C0203ec c0203ec = null;
        C0203ec c0203ec2 = null;
        C0203ec c0203ec3 = null;
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 2 && Context.class.isAssignableFrom(parameterTypes[0]) && parameterTypes[1].isAssignableFrom(cls2)) {
                constructor.setAccessible(true);
                return new C0203ec(constructor, 0);
            }
            if (parameterTypes.length == 1 && parameterTypes[0].isAssignableFrom(cls2)) {
                constructor.setAccessible(true);
                c0203ec = new C0203ec(constructor, 1);
            } else if (parameterTypes.length == 1 && Context.class.isAssignableFrom(parameterTypes[0])) {
                constructor.setAccessible(true);
                c0203ec2 = new C0203ec(constructor, 2);
            } else if (parameterTypes.length == 0) {
                constructor.setAccessible(true);
                c0203ec3 = new C0203ec(constructor, 3);
            }
        }
        if (c0203ec != null) {
            return c0203ec;
        }
        if (c0203ec2 != null) {
            return c0203ec2;
        }
        if (c0203ec3 != null) {
            return c0203ec3;
        }
        throw new NoSuchMethodException("menu item constructor");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D0 */
    public static void m238D0(Activity activity, File file, ArrayList arrayList, HashSet hashSet, Uri uri) {
        Cursor cursor;
        Cursor cursor2;
        int i;
        String string;
        Uri uri2;
        long j;
        Uri uri3;
        File file2;
        try {
            Cursor cursorQuery = activity.getContentResolver().query(uri, new String[]{"_id", "_display_name", "_size", "date_modified", "_data", "relative_path", "mime_type"}, null, null, "date_modified DESC");
            if (cursorQuery == null) {
                m306l(cursorQuery);
                return;
            }
            try {
                int columnIndex = cursorQuery.getColumnIndex("_id");
                int columnIndex2 = cursorQuery.getColumnIndex("_display_name");
                int columnIndex3 = cursorQuery.getColumnIndex("_size");
                int columnIndex4 = cursorQuery.getColumnIndex("date_modified");
                int columnIndex5 = cursorQuery.getColumnIndex("_data");
                int columnIndex6 = cursorQuery.getColumnIndex("relative_path");
                int columnIndex7 = cursorQuery.getColumnIndex("mime_type");
                int i2 = 0;
                while (cursorQuery.moveToNext() && i2 < 240) {
                    String string2 = columnIndex2 >= 0 ? cursorQuery.getString(columnIndex2) : "";
                    String string3 = columnIndex7 >= 0 ? cursorQuery.getString(columnIndex7) : "";
                    if (m291d0(string2, string3)) {
                        String string4 = columnIndex5 >= 0 ? cursorQuery.getString(columnIndex5) : "";
                        String string5 = columnIndex6 >= 0 ? cursorQuery.getString(columnIndex6) : "";
                        if (m313o0(file, string4, string5)) {
                            cursor2 = cursorQuery;
                            long j2 = columnIndex >= 0 ? cursorQuery.getLong(columnIndex) : -1L;
                            if (j2 < 0) {
                                i = columnIndex;
                            } else {
                                try {
                                    Uri uriWithAppendedId = ContentUris.withAppendedId(uri, j2);
                                    if (string4 == null || string4.length() <= 0) {
                                        i = columnIndex;
                                        string = "uri:" + uriWithAppendedId;
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        i = columnIndex;
                                        sb.append("path:");
                                        sb.append(m325u0(string4));
                                        string = sb.toString();
                                    }
                                    if (hashSet.add(string)) {
                                        if (columnIndex3 >= 0) {
                                            uri2 = uriWithAppendedId;
                                            cursor = cursor2;
                                            try {
                                                j = cursor.getLong(columnIndex3);
                                            } catch (Throwable th) {
                                                th = th;
                                                try {
                                                    HookEntry.log("local voice mediastore query failed: " + th.getClass().getSimpleName() + ": " + m242F0(th.getMessage()));
                                                    return;
                                                } finally {
                                                    m306l(cursor);
                                                }
                                            }
                                        } else {
                                            uri2 = uriWithAppendedId;
                                            cursor = cursor2;
                                            j = 0;
                                        }
                                        long j3 = columnIndex4 >= 0 ? cursor.getLong(columnIndex4) * 1000 : 0L;
                                        if (string4 == null || string4.length() == 0) {
                                            uri3 = uri2;
                                            file2 = null;
                                        } else {
                                            uri3 = uri2;
                                            file2 = new File(string4);
                                        }
                                        arrayList.add(new C0347n9(file2, uri3, string2, string5, string3, j, j3, false));
                                        i2++;
                                        cursorQuery = cursor;
                                    }
                                    columnIndex = i;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor = cursor2;
                                }
                            }
                            cursorQuery = cursor2;
                            columnIndex = i;
                        }
                    }
                    i = columnIndex;
                    cursor2 = cursorQuery;
                    cursorQuery = cursor2;
                    columnIndex = i;
                }
                m306l(cursorQuery);
            } catch (Throwable th3) {
                th = th3;
                cursor = cursorQuery;
            }
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static ArrayList m239E(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (Method method : cls.getDeclaredMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (method.getReturnType() == Void.TYPE && parameterTypes.length == 3 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == String.class && !parameterTypes[2].isPrimitive()) {
                arrayList.add(method);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02fb  */
    /* JADX INFO: renamed from: E0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m240E0(C0410pd c0410pd, Activity activity, Dialog dialog, LinearLayout linearLayout, TextView textView, ClassLoader classLoader, int[] iArr, C0515w6[] c0515w6Arr) {
        Activity activity2;
        File[] fileArrListFiles;
        Activity activity3;
        int i;
        int length;
        int size;
        C0515w6 c0515w6M246H0;
        C0515w6 c0515w6;
        File externalStorageDirectory;
        String documentId;
        String strConcat;
        C0515w6 c0515w62;
        if (activity != null) {
            Object tag = linearLayout.getTag();
            if (tag instanceof ScrollView) {
                ((ScrollView) tag).scrollTo(0, 0);
            }
            linearLayout.removeAllViews();
            C0515w6 c0515w6M259O = c0515w6Arr[0];
            if (c0515w6M259O == null || !c0515w6M259O.m1124d()) {
                c0515w6M259O = m259O(activity);
                c0515w6Arr[0] = c0515w6M259O;
            }
            C0515w6 c0515w63 = c0515w6M259O;
            textView.setText(c0515w63.m1123c());
            C0515w6 c0515w6M1126f = c0515w63.m1126f();
            if (c0515w6M1126f == null || !c0515w6M1126f.m1124d()) {
                activity2 = activity;
            } else {
                activity2 = activity;
                m294f(activity2, linearLayout, "..", c0515w6M1126f.m1123c(), new ViewOnClickListenerC0237ge(c0410pd, activity, dialog, linearLayout, textView, classLoader, iArr, c0515w6Arr), null);
            }
            ArrayList arrayList = new ArrayList();
            if (c0515w63.m1125e()) {
                length = m296g(activity2, c0515w63, arrayList);
                if (length < 0) {
                    m294f(activity2, linearLayout, "无法读取授权目录", "请点右上角授权重新选择目录", null, null);
                    return;
                } else {
                    activity3 = activity;
                    size = 0;
                }
            } else {
                try {
                    File file = (File) c0515w63.f997a;
                    fileArrListFiles = file == null ? null : file.listFiles();
                } catch (Throwable unused) {
                    fileArrListFiles = null;
                }
                if (fileArrListFiles == null) {
                    m294f(activity, linearLayout, "无法读取此目录", "请点右上角授权目录", null, null);
                    return;
                }
                activity3 = activity;
                HashSet hashSet = new HashSet();
                int i2 = 0;
                while (true) {
                    if (i2 >= fileArrListFiles.length) {
                        break;
                    }
                    File file2 = fileArrListFiles[i2];
                    if (file2 != null) {
                        boolean z = file2.isFile() && m284a0(m328w(file2.getName()));
                        if ((!file2.isHidden() || z) && (file2.isDirectory() || file2.isFile())) {
                            String name = file2.getName();
                            file2.getAbsolutePath();
                            arrayList.add(new C0347n9(file2, null, name, "", "", file2.isDirectory() ? 0L : file2.length(), file2.lastModified(), file2.isDirectory()));
                            try {
                                strConcat = "path:".concat(m325u0(file2.getCanonicalPath()));
                            } catch (Throwable unused2) {
                                strConcat = "path:".concat(m325u0(file2.getAbsolutePath()));
                            }
                            hashSet.add(strConcat);
                            StringBuilder sb = new StringBuilder();
                            sb.append(file2.isDirectory() ? "name-dir:" : "name-file:");
                            sb.append(file2.getName().toLowerCase(Locale.US));
                            hashSet.add(sb.toString());
                        }
                    }
                    i2++;
                }
                int size2 = arrayList.size();
                File file3 = (File) c0515w63.f997a;
                if (file3 != null) {
                    m238D0(activity3, file3, arrayList, hashSet, MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
                    m238D0(activity3, file3, arrayList, hashSet, MediaStore.Downloads.EXTERNAL_CONTENT_URI);
                }
                File file4 = (File) c0515w63.f997a;
                if (file4 == null || (c0515w6M246H0 = m246H0(activity3)) == null || !c0515w6M246H0.m1125e()) {
                    i = 0;
                    length = fileArrListFiles.length;
                    size = arrayList.size() - size2;
                    if (i > 0) {
                        HookEntry.log("local voice granted tree supplemented dir=" + m242F0(m320s((File) c0515w63.f997a)) + " count=" + i);
                    }
                } else {
                    Uri uri = (Uri) c0515w6M246H0.f998b;
                    if (c0515w6M246H0.m1125e()) {
                        Uri uri2 = (Uri) c0515w6M246H0.f999c;
                        if (uri2 == null) {
                            externalStorageDirectory = null;
                        } else {
                            try {
                                documentId = DocumentsContract.getDocumentId(uri2);
                            } catch (Throwable unused3) {
                            }
                            if (documentId != null && documentId.length() != 0) {
                                int iIndexOf = documentId.indexOf(58);
                                String strSubstring = iIndexOf >= 0 ? documentId.substring(0, iIndexOf) : "";
                                if (strSubstring.length() > 0) {
                                    try {
                                        if (!"primary".equalsIgnoreCase(strSubstring)) {
                                        }
                                    } catch (Throwable unused4) {
                                    }
                                }
                                if (iIndexOf >= 0) {
                                    documentId = documentId.substring(iIndexOf + 1);
                                }
                                externalStorageDirectory = Environment.getExternalStorageDirectory();
                                if (externalStorageDirectory != null) {
                                    if (documentId.length() != 0) {
                                        externalStorageDirectory = new File(externalStorageDirectory, documentId);
                                    }
                                }
                            }
                            externalStorageDirectory = null;
                        }
                        if (externalStorageDirectory != null) {
                            String strM325u0 = m325u0(m320s(externalStorageDirectory));
                            String strM325u02 = m325u0(m320s(file4));
                            if (strM325u02.equals(strM325u0) || strM325u02.startsWith(strM325u0.concat("/"))) {
                                try {
                                    String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
                                    if (treeDocumentId != null && treeDocumentId.length() != 0) {
                                        if (!strM325u02.equals(strM325u0)) {
                                            String strSubstring2 = strM325u02.substring(strM325u0.length() + 1);
                                            if (!treeDocumentId.endsWith(":")) {
                                                strSubstring2 = "/".concat(strSubstring2);
                                            }
                                            treeDocumentId = treeDocumentId.concat(strSubstring2);
                                        }
                                        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, treeDocumentId);
                                        Uri uri3 = (Uri) c0515w6M246H0.f998b;
                                        String strM299h0 = m299h0(file4);
                                        ArrayList arrayList2 = new ArrayList();
                                        if (strM299h0.length() == 0) {
                                            strM299h0 = "授权目录";
                                        }
                                        arrayList2.add(strM299h0);
                                        c0515w6 = new C0515w6((File) null, uri3, uriBuildDocumentUriUsingTree, new ArrayList(), arrayList2);
                                    }
                                } catch (Throwable th) {
                                    HookEntry.log("local voice granted tree mapping failed: " + th.getClass().getSimpleName() + ": " + m242F0(th.getMessage()));
                                }
                                if (c0515w6 == null) {
                                }
                            }
                        }
                    } else {
                        c0515w6 = null;
                        if (c0515w6 == null) {
                            ArrayList arrayList3 = new ArrayList();
                            if (m296g(activity3, c0515w6, arrayList3) >= 0) {
                                i = 0;
                                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                                    C0347n9 c0347n9 = (C0347n9) arrayList3.get(i3);
                                    if (c0347n9 != null) {
                                        boolean z2 = c0347n9.f599h;
                                        String str = c0347n9.f594c;
                                        if (hashSet.add(z2 ? "name-dir:" + str.toLowerCase(Locale.US) : "name-file:" + str.toLowerCase(Locale.US))) {
                                            arrayList.add(c0347n9);
                                            i++;
                                        }
                                    }
                                }
                            }
                            length = fileArrListFiles.length;
                            size = arrayList.size() - size2;
                            if (i > 0) {
                            }
                        }
                    }
                }
            }
            int size3 = arrayList.size();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - f175o >= 5000) {
                f175o = jCurrentTimeMillis;
                StringBuilder sb2 = new StringBuilder("local voice entry browser dir=");
                sb2.append(m242F0(c0515w63.m1125e() ? "tree:".concat(c0515w63.m1123c()) : m320s((File) c0515w63.f997a)));
                sb2.append(" files=");
                sb2.append(length);
                sb2.append(" shown=");
                sb2.append(size3);
                sb2.append(" media=");
                sb2.append(size);
                sb2.append(" mode=");
                sb2.append(c0515w63.m1125e() ? "tree" : "file");
                HookEntry.logAlways(sb2.toString());
            }
            Collections.sort(arrayList, new C0491ue());
            int size4 = arrayList.size();
            int iMax = Math.max(0, iArr[0]);
            int i4 = size4 <= 0 ? 0 : (size4 - 1) / 80;
            if (iMax > i4) {
                iMax = i4;
            }
            iArr[0] = iMax;
            int i5 = iMax * 80;
            int iMin = Math.min(size4, i5 + 80);
            if (iMax > 0) {
                m294f(activity, linearLayout, "上一页", (i5 + 1) + " / " + size4, new ViewOnClickListenerC0237ge(iArr, activity3, classLoader, c0410pd, dialog, textView, linearLayout, c0515w6Arr, 2), null);
            }
            while (i5 < iMin) {
                C0347n9 c0347n92 = (C0347n9) arrayList.get(i5);
                if (c0347n92 == null) {
                    c0515w62 = c0515w63;
                } else if (c0347n92.f599h) {
                    C0515w6 c0515w64 = c0515w63;
                    m294f(activity, linearLayout, c0347n92.f594c, "文件夹", new ViewOnClickListenerC0189de(c0515w6Arr, c0515w64, c0347n92, activity, iArr, classLoader, c0410pd, dialog, textView, linearLayout), null);
                    c0515w62 = c0515w64;
                } else {
                    C0515w6 c0515w65 = c0515w63;
                    boolean zM768a = c0347n92.m768a();
                    String str2 = c0347n92.f594c;
                    if (zM768a) {
                        c0515w62 = c0515w65;
                        m294f(activity, linearLayout, str2, m330x(c0347n92), new ViewOnClickListenerC0205ee(dialog, activity, c0515w65, classLoader, c0410pd, c0347n92), new ViewOnLongClickListenerC0221fe(activity, classLoader, c0410pd, dialog, textView, linearLayout, c0515w6Arr, iArr, c0347n92));
                    } else {
                        c0515w62 = c0515w65;
                        m294f(activity, linearLayout, str2, m330x(c0347n92).concat("  不支持"), null, null);
                    }
                }
                i5++;
                c0515w63 = c0515w62;
            }
            if (iMin < size4) {
                m294f(activity, linearLayout, "下一页", iMin + " / " + size4, new ViewOnClickListenerC0237ge(iArr, activity, classLoader, c0410pd, dialog, textView, linearLayout, c0515w6Arr, 0), null);
            }
            if (size4 == 0) {
                m294f(activity, linearLayout, "此目录没有可显示的文件", "可进入其他目录或点右上角授权", null, null);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static ImageView m241F(View view) {
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int iMin = Math.min(viewGroup.getChildCount(), 20);
        for (int i = 0; i < iMin; i++) {
            ImageView imageViewM241F = m241F(viewGroup.getChildAt(i));
            if (imageViewM241F != null) {
                return imageViewM241F;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F0 */
    public static String m242F0(String str) {
        return str == null ? "" : str.length() > 160 ? str.substring(0, 160) : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static String m243G(String... strArr) {
        for (String str : strArr) {
            if (str != null && str.length() > 0) {
                return str;
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G0 */
    public static File m244G0(Context context) {
        if (context == null) {
            return null;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            String string = context.getSharedPreferences("elaris_local_voice_state", 0).getString("last_dir", "");
            if (string != null && string.length() != 0) {
                File file = new File(string);
                if (file.exists() && file.isDirectory()) {
                    if (file.canRead()) {
                        return file;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static Object m245H(Object obj, String... strArr) {
        if (obj == null) {
            return null;
        }
        for (int i = 0; i < strArr.length; i++) {
            Object objM251K = m251K(obj, strArr[i]);
            if (objM251K != null) {
                return objM251K;
            }
            Object objM298h = m298h(obj, "get".concat(m282Z0(strArr[i])));
            if (objM298h != null) {
                return objM298h;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H0 */
    public static C0515w6 m246H0(Context context) {
        String strDecode;
        if (context == null) {
            return null;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            String string = context.getSharedPreferences("elaris_local_voice_state", 0).getString("tree_uri", "");
            if (string != null && string.length() != 0) {
                Uri uri = Uri.parse(string);
                if (!m253L(context, uri)) {
                    m304k(context);
                    HookEntry.logAlways("local voice saved tree permission expired uri=".concat(m242F0(string)));
                    return null;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("elaris_local_voice_state", 0);
                String string2 = sharedPreferences.getString("tree_doc_uri", "");
                Uri uriBuildDocumentUriUsingTree = (string2 == null || string2.length() <= 0) ? DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)) : Uri.parse(string2);
                String string3 = sharedPreferences.getString("tree_parent_docs", "");
                ArrayList arrayList = new ArrayList();
                if (string3 != null && string3.length() != 0) {
                    for (String str : string3.split("\\n")) {
                        if (str != null && str.length() != 0) {
                            try {
                                arrayList.add(Uri.parse(str));
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
                String string4 = sharedPreferences.getString("tree_segments", "");
                ArrayList arrayList2 = new ArrayList();
                if (string4 != null && string4.length() != 0) {
                    for (String str2 : string4.split("\\n")) {
                        if (str2 != null && str2.length() != 0 && (strDecode = Uri.decode(str2)) != null && strDecode.length() > 0) {
                            arrayList2.add(strDecode);
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    String strM311n0 = m311n0(context, uriBuildDocumentUriUsingTree);
                    if (strM311n0.length() == 0) {
                        strM311n0 = "授权目录";
                    }
                    arrayList2.add(strM311n0);
                } else {
                    for (int i = 0; i < arrayList2.size(); i++) {
                        String strM323t0 = m323t0((String) arrayList2.get(i));
                        if (strM323t0.length() > 0) {
                            arrayList2.set(i, strM323t0);
                        }
                    }
                }
                return new C0515w6((File) null, uri, uriBuildDocumentUriUsingTree, arrayList, arrayList2);
            }
            return null;
        } catch (Throwable th) {
            HookEntry.log("local voice saved tree unavailable: " + th.getClass().getSimpleName() + ": " + m242F0(th.getMessage()));
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static String m247I(Object obj, String... strArr) {
        Object objM245H = m245H(obj, strArr);
        return objM245H instanceof String ? (String) objM245H : "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I0 */
    public static int m248I0(ClassLoader classLoader, String str) {
        Object objM236C0 = m236C0(classLoader, "com.tencent.qqnt.aio.adapter.api.IAIOPttApi");
        if (objM236C0 == null) {
            return 0;
        }
        try {
            for (Method method : objM236C0.getClass().getMethods()) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if ("getPttFileDuration".equals(method.getName()) && parameterTypes.length == 1 && parameterTypes[0] == String.class) {
                    try {
                        method.setAccessible(true);
                        Object objInvoke = method.invoke(objM236C0, str);
                        return Math.max(0, objInvoke instanceof Number ? ((Number) objInvoke).intValue() : 0);
                    } catch (Throwable th) {
                        AbstractC0198e7.m343a("kk-tts", "script-duration", th);
                        return 0;
                    }
                }
            }
            return 0;
        } catch (Throwable th2) {
            AbstractC0198e7.m343a("kk-tts", "script-duration-methods", th2);
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static int m249J(View view) {
        if (view instanceof TextView) {
            try {
                return ((TextView) view).getCurrentTextColor();
            } catch (Throwable unused) {
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int iMin = Math.min(viewGroup.getChildCount(), 20);
            for (int i = 0; i < iMin; i++) {
                int iM249J = m249J(viewGroup.getChildAt(i));
                if (iM249J != -1) {
                    return iM249J;
                }
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public static boolean m250J0(ClassLoader classLoader, String str, int i, byte[] bArr, C0410pd c0410pd, C0527x2 c0527x2) {
        Object objM312o;
        try {
            Object objM236C0 = m236C0(classLoader, "com.tencent.qqnt.msg.api.IMsgUtilApi");
            Object objM236C02 = m236C0(classLoader, "com.tencent.qqnt.msg.api.IMsgService");
            if (objM236C0 != null && objM236C02 != null && (objM312o = m312o(objM236C0, str, i, bArr)) != null) {
                Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.qqnt.kernel.nativeinterface.Contact", classLoader);
                if (clsFindClassIfExists == null) {
                    clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.qqnt.kernelpublic.nativeinterface.Contact", classLoader);
                }
                if (clsFindClassIfExists != null) {
                    String str2 = c0410pd.f722a;
                    int i2 = c0410pd.f723b;
                    if ((i2 == 1 || i2 == 100) && m281Z(str2)) {
                        String strM280Y0 = m280Y0(classLoader, str2);
                        if (strM280Y0.length() > 0) {
                            str2 = strM280Y0;
                        }
                    }
                    Object objM319r0 = m319r0(clsFindClassIfExists, str2, i2);
                    if (objM319r0 != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(objM312o);
                        return m277X(objM236C02, objM319r0, arrayList, classLoader, c0527x2);
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            HookEntry.log("voice forward send failed reason=" + th.getClass().getSimpleName() + ": " + m242F0(th.getMessage()));
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static Object m251K(Object obj, String str) {
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
    /* JADX WARN: Can't wrap try/catch for region: R(14:6|(1:8)(2:10|(1:12)(12:13|14|(1:16)(1:17)|(1:19)(2:20|(1:22)(1:23))|24|25|64|26|30|(1:32)|(1:37)|(3:40|(1:42)(1:43)|(1:45)(4:46|(2:52|(1:54))|55|(3:58|(1:60)|61)))(1:39)))|9|14|(0)(0)|(0)(0)|24|25|64|26|30|(0)|(1:37)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        p000.AbstractC0198e7.m343a("kk-tts", "script-msg-util", r9);
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[Catch: all -> 0x007e, TryCatch #1 {all -> 0x007e, blocks: (B:3:0x0005, B:6:0x000f, B:8:0x0017, B:9:0x001c, B:24:0x0046, B:30:0x0069, B:32:0x0071, B:37:0x0085, B:40:0x0091, B:46:0x00a3, B:55:0x00be, B:58:0x00c7, B:60:0x00d5, B:50:0x00ad, B:52:0x00b3, B:43:0x009a, B:29:0x0063, B:20:0x003b, B:17:0x0035, B:10:0x001e, B:12:0x0024, B:13:0x0026, B:26:0x0050), top: B:66:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b A[Catch: all -> 0x007e, TryCatch #1 {all -> 0x007e, blocks: (B:3:0x0005, B:6:0x000f, B:8:0x0017, B:9:0x001c, B:24:0x0046, B:30:0x0069, B:32:0x0071, B:37:0x0085, B:40:0x0091, B:46:0x00a3, B:55:0x00be, B:58:0x00c7, B:60:0x00d5, B:50:0x00ad, B:52:0x00b3, B:43:0x009a, B:29:0x0063, B:20:0x003b, B:17:0x0035, B:10:0x001e, B:12:0x0024, B:13:0x0026, B:26:0x0050), top: B:66:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071 A[Catch: all -> 0x007e, TryCatch #1 {all -> 0x007e, blocks: (B:3:0x0005, B:6:0x000f, B:8:0x0017, B:9:0x001c, B:24:0x0046, B:30:0x0069, B:32:0x0071, B:37:0x0085, B:40:0x0091, B:46:0x00a3, B:55:0x00be, B:58:0x00c7, B:60:0x00d5, B:50:0x00ad, B:52:0x00b3, B:43:0x009a, B:29:0x0063, B:20:0x003b, B:17:0x0035, B:10:0x001e, B:12:0x0024, B:13:0x0026, B:26:0x0050), top: B:66:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091 A[Catch: all -> 0x007e, TryCatch #1 {all -> 0x007e, blocks: (B:3:0x0005, B:6:0x000f, B:8:0x0017, B:9:0x001c, B:24:0x0046, B:30:0x0069, B:32:0x0071, B:37:0x0085, B:40:0x0091, B:46:0x00a3, B:55:0x00be, B:58:0x00c7, B:60:0x00d5, B:50:0x00ad, B:52:0x00b3, B:43:0x009a, B:29:0x0063, B:20:0x003b, B:17:0x0035, B:10:0x001e, B:12:0x0024, B:13:0x0026, B:26:0x0050), top: B:66:0x0005, inners: #0 }] */
    /* JADX INFO: renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m252K0(ClassLoader classLoader, String str, int i, C0410pd c0410pd) {
        long j;
        long jMax;
        int i2;
        byte[] bArr;
        Object objM236C0;
        Object objM314p;
        String str2;
        try {
            Object objM236C02 = m236C0(classLoader, "com.tencent.qqnt.msg.api.IMsgService");
            if (objM236C02 != null) {
                int iM248I0 = m248I0(classLoader, str);
                if (iM248I0 <= 0) {
                    jMax = Math.max(0, i);
                } else if (AbstractC0260i5.m603d0(iM248I0, i)) {
                    jMax = iM248I0;
                } else {
                    j = 20 * ((long) iM248I0);
                    i2 = j <= 2147483647L ? Integer.MAX_VALUE : (int) j;
                    String str3 = iM248I0 > 0 ? "silk-fallback" : AbstractC0260i5.m603d0(iM248I0, i) ? "seconds" : "frames20ms";
                    bArr = (byte[]) AbstractC0260i5.f388i.clone();
                    Constructor<?> declaredConstructor = Class.forName("com.tencent.qqnt.msg.api.impl.MsgUtilApiImpl", false, classLoader).getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    objM236C0 = declaredConstructor.newInstance(null);
                    objM314p = m314p(objM236C0, str, i2, bArr);
                    str2 = "impl-2arg";
                    if (objM314p == null) {
                        objM236C0 = m236C0(classLoader, "com.tencent.qqnt.msg.api.IMsgUtilApi");
                        objM314p = m314p(objM236C0, str, i2, bArr);
                        str2 = "qroute-2arg";
                    }
                    if (objM314p == null && objM236C0 != null) {
                        objM314p = m312o(objM236C0, str, i2, bArr);
                        m329w0(objM314p, bArr);
                        str2 = "qroute-3arg-fallback";
                    }
                    if (objM314p != null) {
                        Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.qqnt.kernel.nativeinterface.Contact", classLoader);
                        if (clsFindClassIfExists == null) {
                            clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.qqnt.kernelpublic.nativeinterface.Contact", classLoader);
                        }
                        if (clsFindClassIfExists != null) {
                            String str4 = c0410pd.f722a;
                            int i3 = c0410pd.f723b;
                            if ((i3 == 1 || i3 == 100) && m281Z(str4)) {
                                String strM280Y0 = m280Y0(classLoader, str4);
                                if (strM280Y0.length() > 0) {
                                    str4 = strM280Y0;
                                }
                            }
                            Object objM319r0 = m319r0(clsFindClassIfExists, str4, c0410pd.f723b);
                            if (objM319r0 != null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(objM314p);
                                boolean zM277X = m277X(objM236C02, objM319r0, arrayList, classLoader, null);
                                if (zM277X) {
                                    HookEntry.log("kk tts script ptt prepared duration_units=" + iM248I0 + " duration_ms=" + i2 + " duration_mode=" + str3 + " factory=" + str2);
                                }
                                return zM277X;
                            }
                        }
                    }
                }
                j = jMax * 1000;
                if (j <= 2147483647L) {
                }
                if (iM248I0 > 0) {
                }
                bArr = (byte[]) AbstractC0260i5.f388i.clone();
                Constructor<?> declaredConstructor2 = Class.forName("com.tencent.qqnt.msg.api.impl.MsgUtilApiImpl", false, classLoader).getDeclaredConstructor(null);
                declaredConstructor2.setAccessible(true);
                objM236C0 = declaredConstructor2.newInstance(null);
                objM314p = m314p(objM236C0, str, i2, bArr);
                str2 = "impl-2arg";
                if (objM314p == null) {
                }
                if (objM314p == null) {
                    objM314p = m312o(objM236C0, str, i2, bArr);
                    m329w0(objM314p, bArr);
                    str2 = "qroute-3arg-fallback";
                }
                if (objM314p != null) {
                }
            }
            return false;
        } catch (Throwable th) {
            AbstractC0198e7.m343a("kk-tts", "script-ptt-send", th);
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static boolean m253L(Context context, Uri uri) {
        if (context != null && uri != null) {
            try {
                List<UriPermission> persistedUriPermissions = context.getContentResolver().getPersistedUriPermissions();
                int i = 0;
                while (persistedUriPermissions != null) {
                    if (i >= persistedUriPermissions.size()) {
                        break;
                    }
                    UriPermission uriPermission = persistedUriPermissions.get(i);
                    if (uriPermission != null && uri.equals(uriPermission.getUri()) && uriPermission.isReadPermission()) {
                        return true;
                    }
                    i++;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L0 */
    public static void m254L0(Object obj, Serializable serializable, String... strArr) {
        Field declaredField;
        if (obj != null) {
            for (String str : strArr) {
                for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    try {
                        declaredField = superclass.getDeclaredField(str);
                        break;
                    } catch (Throwable unused) {
                    }
                }
                declaredField = null;
                if (declaredField != null) {
                    try {
                        declaredField.setAccessible(true);
                        Class<?> type = declaredField.getType();
                        if (type == Integer.TYPE && (serializable instanceof Number)) {
                            declaredField.setInt(obj, ((Number) serializable).intValue());
                        } else if (type == Long.TYPE && (serializable instanceof Number)) {
                            declaredField.setLong(obj, ((Number) serializable).longValue());
                        } else if (type == Boolean.TYPE && (serializable instanceof Boolean)) {
                            declaredField.setBoolean(obj, ((Boolean) serializable).booleanValue());
                        } else if (!type.isPrimitive()) {
                            declaredField.set(obj, serializable);
                        }
                        return;
                    } catch (Throwable unused2) {
                        continue;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static int m255M(ClassLoader classLoader, Method method) {
        String strM317q0 = m317q0(method);
        Set set = f165e;
        synchronized (set) {
            try {
                if (set.contains(strM317q0)) {
                    return 0;
                }
                set.add(strM317q0);
                try {
                    method.setAccessible(true);
                    XposedBridge.hookMethod(method, new C0320le(classLoader));
                    return 1;
                } catch (Throwable th) {
                    Set set2 = f165e;
                    synchronized (set2) {
                        set2.remove(strM317q0);
                        HookEntry.log("voice forward method hook failed method=" + method.getName() + " reason=" + th.getClass().getSimpleName() + ": " + m242F0(th.getMessage()));
                        return 0;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M0 */
    public static void m256M0(Object obj, Serializable serializable, String... strArr) {
        for (String strSubstring : strArr) {
            m254L0(obj, serializable, strSubstring);
            StringBuilder sb = new StringBuilder("set");
            if (strSubstring.startsWith("m") && strSubstring.length() > 1) {
                strSubstring = strSubstring.substring(1);
            }
            sb.append(m282Z0(strSubstring));
            String string = sb.toString();
            try {
                Method[] methods = obj.getClass().getMethods();
                int i = 0;
                while (true) {
                    if (i < methods.length) {
                        Method method = methods[i];
                        if (string.equals(method.getName()) && method.getParameterTypes().length == 1) {
                            try {
                                Class<?> cls = method.getParameterTypes()[0];
                                if (cls != Integer.TYPE || !(serializable instanceof Number)) {
                                    if (cls != Boolean.TYPE || !(serializable instanceof Boolean)) {
                                        if (!cls.isPrimitive() && cls.isInstance(serializable)) {
                                            method.invoke(obj, serializable);
                                            break;
                                        }
                                    } else {
                                        method.invoke(obj, serializable);
                                        break;
                                    }
                                } else {
                                    method.invoke(obj, Integer.valueOf(((Number) serializable).intValue()));
                                    break;
                                }
                            } catch (Throwable unused) {
                                continue;
                            }
                        }
                        i++;
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static boolean m257N(ClassLoader classLoader, Class cls) {
        try {
            Method methodM334z = m334z(cls);
            String strM317q0 = m317q0(methodM334z);
            Set set = f164d;
            synchronized (set) {
                try {
                    if (set.contains(strM317q0)) {
                        return true;
                    }
                    set.add(strM317q0);
                    try {
                        methodM334z.setAccessible(true);
                        XposedBridge.hookMethod(methodM334z, new C0427qe(classLoader, methodM334z));
                        return true;
                    } catch (Throwable unused) {
                        Set set2 = f164d;
                        synchronized (set2) {
                            set2.remove(strM317q0);
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N0 */
    public static boolean m258N0(String str, String str2) {
        if (!AbstractC0486u9.m1067t(str)) {
            return AbstractC0486u9.m1066s(str) || m279Y(str2);
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        return (!m279Y(lowerCase) || !".bin".equalsIgnoreCase(str) || lowerCase.contains("amr") || lowerCase.contains("silk") || lowerCase.contains("ptt")) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static C0515w6 m259O(Activity activity) {
        File file;
        C0515w6 c0515w6M246H0 = m246H0(activity);
        if (c0515w6M246H0 != null) {
            return c0515w6M246H0;
        }
        File fileM244G0 = m244G0(activity);
        if (fileM244G0 != null) {
            return new C0515w6(fileM244G0, (Uri) null, (Uri) null, (ArrayList) null, (ArrayList) null);
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null && externalStorageDirectory.exists() && externalStorageDirectory.isDirectory() && externalStorageDirectory.canRead()) {
            return new C0515w6(externalStorageDirectory, (Uri) null, (Uri) null, (ArrayList) null, (ArrayList) null);
        }
        File fileM244G02 = m244G0(activity);
        if (fileM244G02 != null) {
            file = fileM244G02;
        } else {
            fileM244G02 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            File file2 = new File(fileM244G02, "Elaris/Voice");
            if (file2.exists() && file2.isDirectory()) {
                file = file2;
            } else {
                if ((!fileM244G02.exists() || !fileM244G02.isDirectory()) && (fileM244G02 = Environment.getExternalStorageDirectory()) == null) {
                    fileM244G02 = new File("/");
                }
                file = fileM244G02;
            }
        }
        return new C0515w6(file, (Uri) null, (Uri) null, (ArrayList) null, (ArrayList) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O0 */
    public static void m260O0(Activity activity, ClassLoader classLoader, C0410pd c0410pd) {
        if (activity != null) {
            C0515w6[] c0515w6Arr = {m259O(activity)};
            int[] iArr = {0};
            Dialog dialog = new Dialog(activity);
            AbstractC0486u9.m1051d(dialog);
            try {
                dialog.requestWindowFeature(1);
            } catch (Throwable unused) {
            }
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(true);
            linearLayout.setClipToPadding(true);
            linearLayout.setPadding(m322t(activity, 12.0f), m322t(activity, 12.0f), m322t(activity, 12.0f), m322t(activity, 10.0f));
            linearLayout.setBackground(m307l0(activity));
            ViewOnClickListenerC0459se viewOnClickListenerC0459se = new ViewOnClickListenerC0459se(dialog, activity, classLoader, c0410pd, 0);
            ViewOnClickListenerC0459se viewOnClickListenerC0459se2 = new ViewOnClickListenerC0459se(dialog, activity, classLoader, c0410pd, 1);
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            linearLayout2.setPadding(0, 0, 0, 0);
            ImageView imageView = new ImageView(activity);
            try {
                imageView.setImageDrawable(new C0331m9(1.68f));
            } catch (Throwable unused2) {
            }
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setPadding(0, 0, 0, 0);
            imageView.setBackground(m305k0(activity));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m322t(activity, 36.0f), m322t(activity, 36.0f));
            layoutParams.rightMargin = m322t(activity, 10.0f);
            linearLayout2.addView(imageView, layoutParams);
            LinearLayout linearLayout3 = new LinearLayout(activity);
            linearLayout3.setOrientation(1);
            linearLayout3.setGravity(16);
            TextView textView = new TextView(activity);
            textView.setText("文件选择");
            textView.setTextColor(AbstractC0486u9.m1045G(activity));
            textView.setTextSize(17.0f);
            Typeface typeface = Typeface.DEFAULT_BOLD;
            textView.setTypeface(typeface);
            textView.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            linearLayout3.addView(textView, new LinearLayout.LayoutParams(-1, -2));
            TextView textView2 = new TextView(activity);
            textView2.setText("发送为 QQ 语音会压缩，原音质请发文件");
            textView2.setTextColor(AbstractC0486u9.m1043E(activity));
            textView2.setTextSize(11.0f);
            textView2.setSingleLine(true);
            textView2.setEllipsize(truncateAt);
            textView2.setPadding(0, m322t(activity, 3.0f), 0, 0);
            linearLayout3.addView(textView2, new LinearLayout.LayoutParams(-1, -2));
            linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(0, -2, 1.0f));
            TextView textView3 = new TextView(activity);
            textView3.setText("文字转语音");
            textView3.setTextColor(AbstractC0486u9.m1050c(activity));
            textView3.setTextSize(11.0f);
            textView3.setTypeface(typeface);
            textView3.setGravity(17);
            textView3.setSingleLine(true);
            textView3.setBackground(m301i0(activity));
            textView3.setOnClickListener(viewOnClickListenerC0459se);
            textView3.setContentDescription("文字转语音");
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(m322t(activity, 72.0f), m322t(activity, 30.0f));
            layoutParams2.leftMargin = m322t(activity, 6.0f);
            linearLayout2.addView(textView3, layoutParams2);
            TextView textView4 = new TextView(activity);
            textView4.setText("授权");
            textView4.setTextColor(AbstractC0486u9.m1050c(activity));
            textView4.setTextSize(11.0f);
            textView4.setTypeface(typeface);
            textView4.setGravity(17);
            textView4.setSingleLine(true);
            textView4.setBackground(m301i0(activity));
            textView4.setOnClickListener(viewOnClickListenerC0459se2);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(m322t(activity, 48.0f), m322t(activity, 30.0f));
            layoutParams3.leftMargin = m322t(activity, 8.0f);
            linearLayout2.addView(textView4, layoutParams3);
            linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
            ScrollView scrollView = new ScrollView(activity);
            scrollView.setOverScrollMode(2);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setClipChildren(true);
            scrollView.setClipToPadding(true);
            LinearLayout linearLayout4 = new LinearLayout(activity);
            linearLayout4.setOrientation(1);
            linearLayout4.setClipChildren(true);
            linearLayout4.setClipToPadding(true);
            TextView textView5 = new TextView(activity);
            textView5.setTextColor(AbstractC0486u9.m1043E(activity));
            textView5.setTextSize(11.0f);
            textView5.setSingleLine(true);
            textView5.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            textView5.setGravity(16);
            textView5.setPadding(m322t(activity, 10.0f), 0, m322t(activity, 10.0f), 0);
            textView5.setBackground(m309m0(AbstractC0486u9.m1072y(activity), m322t(activity, 12.0f), AbstractC0486u9.m1062o(activity) ? -11775650 : -1512206, m322t(activity, 1.0f)));
            linearLayout4.addView(textView5, new LinearLayout.LayoutParams(-1, m322t(activity, 30.0f)));
            LinearLayout linearLayout5 = new LinearLayout(activity);
            linearLayout5.setOrientation(1);
            linearLayout5.setClipChildren(true);
            linearLayout5.setClipToPadding(true);
            linearLayout5.setPadding(m322t(activity, 5.0f), m322t(activity, 5.0f), m322t(activity, 5.0f), m322t(activity, 5.0f));
            linearLayout5.setBackground(m309m0(AbstractC0486u9.m1072y(activity), m322t(activity, 16.0f), AbstractC0486u9.m1062o(activity) ? -11775650 : -1512206, m322t(activity, 1.0f)));
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams4.topMargin = m322t(activity, 9.0f);
            linearLayout4.addView(linearLayout5, layoutParams4);
            scrollView.addView(linearLayout4, new FrameLayout.LayoutParams(-1, -2));
            linearLayout5.setTag(scrollView);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, m322t(activity, 9.0f) + m322t(activity, 30.0f) + AbstractC0486u9.m1073z(activity));
            layoutParams5.topMargin = m322t(activity, 10.0f);
            linearLayout.addView(scrollView, layoutParams5);
            TextView textView6 = new TextView(activity);
            textView6.setText("取消");
            textView6.setTextColor(AbstractC0486u9.m1050c(activity));
            textView6.setTextSize(13.0f);
            textView6.setGravity(17);
            textView6.setTypeface(typeface);
            textView6.setBackground(m301i0(activity));
            textView6.setOnClickListener(new ViewOnClickListenerC0475te(activity, c0515w6Arr, dialog));
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, m322t(activity, 34.0f));
            layoutParams6.topMargin = m322t(activity, 9.0f);
            linearLayout.addView(textView6, layoutParams6);
            dialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC0336me(activity, c0515w6Arr, 1));
            dialog.setContentView(linearLayout);
            m240E0(c0410pd, activity, dialog, linearLayout5, textView5, classLoader, iArr, c0515w6Arr);
            dialog.show();
            try {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setBackgroundDrawableResource(R.color.transparent);
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.width = AbstractC0486u9.m1039A(activity);
                    attributes.height = -2;
                    attributes.dimAmount = 0.4f;
                    window.setAttributes(attributes);
                }
            } catch (Throwable unused3) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static synchronized void m261P(ClassLoader classLoader) {
        int iM267S;
        if (classLoader == null) {
            return;
        }
        if (f167g && f168h && f169i && f170j && f171k) {
            return;
        }
        if (f167g) {
            iM267S = 0;
        } else {
            iM267S = m271U(classLoader);
            if (iM267S > 0) {
                f167g = true;
            }
        }
        if (!f170j) {
            iM267S += m273V(classLoader);
        }
        if (!f168h) {
            iM267S += m265R(classLoader);
        }
        if (!f169i) {
            iM267S += m263Q(classLoader);
        }
        if (!f171k) {
            iM267S += m267S();
        }
        if (iM267S > 0) {
            HookEntry.log("voice message action hooks installed count=" + iM267S);
        } else {
            HookEntry.log("voice message action hooks unavailable");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P0 */
    public static String m262P0(Object obj) {
        if (obj == null) {
            return "";
        }
        String strTrim = String.valueOf(obj).trim();
        return "null".equalsIgnoreCase(strTrim) ? "" : strTrim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static int m263Q(ClassLoader classLoader) {
        int i;
        if (f169i) {
            return 0;
        }
        try {
            Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.qqnt.aio.activity.AIODelegate", classLoader);
            if (clsFindClassIfExists == null) {
                HookEntry.log("local voice entry target hook skipped reason=AIODelegate missing");
                return 0;
            }
            try {
                Method declaredMethod = clsFindClassIfExists.getDeclaredMethod("show", null);
                declaredMethod.setAccessible(true);
                XposedBridge.hookMethod(declaredMethod, new C0304ke(40));
                i = 1;
            } catch (Throwable th) {
                HookEntry.log("local voice entry target show hook failed: " + th.getClass().getSimpleName() + ": " + m242F0(th.getMessage()));
                i = 0;
            }
            if (i > 0) {
                f169i = true;
                HookEntry.log("local voice entry target hook installed class=" + clsFindClassIfExists.getName() + " count=" + i);
            }
            return i;
        } catch (Throwable th2) {
            HookEntry.log("local voice entry target hook failed reason=" + th2.getClass().getSimpleName() + ": " + m242F0(th2.getMessage()));
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q0 */
    public static C0410pd m264Q0(Object obj) {
        if (obj == null) {
            return null;
        }
        String strM247I = m247I(obj, "uin", "uid", "peerUin", "peerUid", "a");
        if (strM247I.length() == 0) {
            return null;
        }
        return new C0410pd(strM247I, m300i(m275W(-1, m245H(obj, "uinType", "uintype", "type", "b"))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static int m265R(ClassLoader classLoader) {
        Class<?> clsFindClassIfExists;
        Class<?> cls;
        int iM255M;
        Method declaredMethod;
        if (f168h) {
            return 0;
        }
        try {
            Class<?> clsFindClassIfExists2 = XposedHelpers.findClassIfExists("com.tencent.mobileqq.forward.ForwardBaseOption", classLoader);
            Method method = null;
            if (clsFindClassIfExists2 == null) {
                try {
                    clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.mobileqq.activity.DirectForwardActivity", classLoader);
                } catch (Throwable unused) {
                }
                if (clsFindClassIfExists == null) {
                    clsFindClassIfExists2 = null;
                } else {
                    for (Field field : clsFindClassIfExists.getDeclaredFields()) {
                        Class<?> type = field.getType();
                        if (type != null && Modifier.isAbstract(type.getModifiers()) && !type.getName().startsWith("android.")) {
                            clsFindClassIfExists2 = type;
                            break;
                        }
                    }
                    clsFindClassIfExists2 = null;
                }
            }
            if (clsFindClassIfExists2 == null) {
                HookEntry.log("voice forward hook skipped reason=ForwardBaseOption missing");
                return 0;
            }
            Class<?> superclass = clsFindClassIfExists2;
            while (true) {
                cls = Void.TYPE;
                if (superclass == null || superclass == Object.class) {
                    break;
                }
                try {
                    declaredMethod = superclass.getDeclaredMethod("buildConfirmDialog", null);
                } catch (Throwable unused2) {
                }
                if (declaredMethod.getParameterTypes().length == 0 && declaredMethod.getReturnType() == cls) {
                    method = declaredMethod;
                    break;
                }
                superclass = superclass.getSuperclass();
            }
            if (method != null) {
                iM255M = m255M(classLoader, method);
            } else {
                int iM255M2 = 0;
                for (Method method2 : clsFindClassIfExists2.getDeclaredMethods()) {
                    if (method2.getParameterTypes().length == 0 && method2.getReturnType() == cls && !Modifier.isAbstract(method2.getModifiers()) && ((Modifier.isFinal(method2.getModifiers()) || iM255M2 <= 0) && (iM255M2 = iM255M2 + m255M(classLoader, method2)) >= 2)) {
                        break;
                    }
                }
                iM255M = iM255M2;
            }
            if (iM255M > 0) {
                f168h = true;
                HookEntry.log("voice forward confirm hooked class=" + clsFindClassIfExists2.getName() + " count=" + iM255M);
            }
            return iM255M;
        } catch (Throwable th) {
            HookEntry.log("voice forward hook failed reason=" + th.getClass().getSimpleName() + ": " + m242F0(th.getMessage()));
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R0 */
    public static C0410pd m266R0(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return null;
        }
        String strM243G = m243G(intent.getStringExtra("peerUid"), intent.getStringExtra("peerUin"), intent.getStringExtra("uin"), intent.getStringExtra("uid"), intent.getStringExtra("troopUin"), intent.getStringExtra("friendUin"), intent.getStringExtra("key_peerUin"));
        if (strM243G.length() == 0) {
            return null;
        }
        int intExtra = intent.getIntExtra("chatType", Integer.MIN_VALUE);
        if (intExtra == Integer.MIN_VALUE) {
            intExtra = intent.getIntExtra("type", Integer.MIN_VALUE);
        }
        if (intExtra == Integer.MIN_VALUE) {
            intExtra = m300i(intent.getIntExtra("uintype", -1));
        }
        if (intExtra == Integer.MIN_VALUE) {
            intExtra = 1;
        }
        return new C0410pd(strM243G, intExtra > 0 ? intExtra : 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static synchronized int m267S() {
        if (f171k) {
            return 0;
        }
        f171k = true;
        if (AbstractC0174d.m337a(8216, new C0289k(2)) >= 0) {
            return 1;
        }
        f171k = false;
        HookEntry.log("local voice picker result hook failed reason=shared router unavailable");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S0 */
    public static C0410pd m268S0(Object obj) {
        C0410pd c0410pd;
        int iM275W;
        int iM275W2;
        String str;
        String str2;
        if (obj == null) {
            return null;
        }
        try {
            Object objM251K = m251K(obj, "d");
            Object objM251K2 = m251K(obj, "e");
            Object objM251K3 = m251K(obj, "f");
            iM275W = m275W(Integer.MIN_VALUE, objM251K);
            iM275W2 = m275W(Integer.MIN_VALUE, objM251K2);
            str = objM251K2 instanceof String ? (String) objM251K2 : "";
            str2 = objM251K3 instanceof String ? (String) objM251K3 : "";
        } catch (Throwable unused) {
        }
        if (iM275W > 0 && str.length() > 0) {
            if (iM275W <= 0) {
                iM275W = 1;
            }
            c0410pd = new C0410pd(str, iM275W);
        } else if (iM275W2 <= 0 || str2.length() <= 0) {
            c0410pd = null;
        } else {
            if (iM275W2 <= 0) {
                iM275W2 = 1;
            }
            c0410pd = new C0410pd(str2, iM275W2);
        }
        if (c0410pd != null) {
            return c0410pd;
        }
        String strM243G = m243G(m247I(obj, "peerUid", "peerUin", "uin", "uid", "troopUin", "friendUin"), m262P0(m298h(obj, "getPeerUid")), m262P0(m298h(obj, "getPeerUin")));
        if (strM243G.length() == 0) {
            return null;
        }
        int iM275W3 = m275W(m275W(1, m298h(obj, "getChatType")), m245H(obj, "chatType", "type"));
        return new C0410pd(strM243G, iM275W3 > 0 ? iM275W3 : 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static void m269T(ClassLoader classLoader, Class cls) {
        int i = 0;
        while (true) {
            String[] strArr = f161a;
            if (i >= 3) {
                return;
            }
            try {
                Method methodM231A = m231A(XposedHelpers.findClass(strArr[i], classLoader), cls);
                methodM231A.setAccessible(true);
                XposedBridge.hookMethod(methodM231A, new C0411pe(classLoader));
                HookEntry.log("voice menu view hook installed layout=" + strArr[i]);
                return;
            } catch (Throwable unused) {
                i++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T0 */
    public static C0410pd m270T0(Object obj) {
        int i;
        if (obj == null) {
            return null;
        }
        C0410pd c0410pdM274V0 = m274V0(obj);
        if (c0410pdM274V0 != null) {
            return c0410pdM274V0;
        }
        Object objM245H = m245H(obj, "aioContact", "mAioContact", "contact", "mContact", "peer", "aioPeer");
        if (objM245H == null) {
            objM245H = m298h(obj, "getAIOContact");
        }
        C0410pd c0410pdM274V02 = m274V0(objM245H);
        if (c0410pdM274V02 != null) {
            return c0410pdM274V02;
        }
        C0410pd c0410pdM268S0 = m268S0(objM245H);
        if (c0410pdM268S0 != null) {
            return c0410pdM268S0;
        }
        C0410pd c0410pdM272U0 = m272U0(m245H(obj, "aioParam", "mAioParam", "param", "mParam"));
        if (c0410pdM272U0 != null) {
            return c0410pdM272U0;
        }
        C0410pd c0410pdM268S02 = m268S0(obj);
        if (c0410pdM268S02 != null) {
            return c0410pdM268S02;
        }
        if (objM245H != null) {
            obj = objM245H;
        }
        String strValueOf = String.valueOf(obj);
        if (strValueOf.length() == 0 || "null".equalsIgnoreCase(strValueOf)) {
            return null;
        }
        String strM243G = m243G(m285a1(strValueOf, "peerUid"), m285a1(strValueOf, "peerUin"), m285a1(strValueOf, "uin"), m285a1(strValueOf, "uid"));
        if (strM243G.length() == 0) {
            return null;
        }
        String strM285a1 = m285a1(strValueOf, "chatType");
        String strM285a12 = m285a1(strValueOf, "type");
        if (strM285a12 != null) {
            try {
                if (strM285a12.length() != 0) {
                    i = Integer.parseInt(strM285a12);
                }
            } catch (Throwable unused) {
            }
            i = 1;
        } else {
            i = 1;
        }
        if (strM285a1 != null) {
            try {
                if (strM285a1.length() != 0) {
                    i = Integer.parseInt(strM285a1);
                }
            } catch (Throwable unused2) {
            }
        }
        return new C0410pd(strM243G, i > 0 ? i : 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static int m271U(ClassLoader classLoader) {
        Field field;
        try {
            Class<?> clsFindClass = XposedHelpers.findClass("com.tencent.mobileqq.aio.msglist.holder.component.BaseContentComponent", classLoader);
            Class<?> clsFindClass2 = XposedHelpers.findClass("com.tencent.mobileqq.aio.msg.AIOMsgItem", classLoader);
            Class<?> clsFindClass3 = XposedHelpers.findClass("com.tencent.mobileqq.aio.msglist.holder.component.ptt.AIOPttContentComponent", classLoader);
            Class<?> clsFindClass4 = XposedHelpers.findClass("com.tencent.qqnt.aio.menu.c", classLoader);
            for (Method method : clsFindClass.getDeclaredMethods()) {
                if (method.getParameterTypes().length == 0 && clsFindClass2.isAssignableFrom(method.getReturnType())) {
                    Method methodM233B = m233B(clsFindClass3, m235C(clsFindClass));
                    C0203ec c0203ecM237D = m237D(clsFindClass4, clsFindClass2);
                    loop1: for (Class<?> superclass = clsFindClass4; superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                        Field[] declaredFields = superclass.getDeclaredFields();
                        for (int i = 0; i < declaredFields.length; i++) {
                            field = declaredFields[i];
                            if (!Modifier.isStatic(field.getModifiers()) && field.getType() == String.class) {
                                break loop1;
                            }
                        }
                    }
                    field = null;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                    method.setAccessible(true);
                    methodM233B.setAccessible(true);
                    m257N(classLoader, clsFindClass4);
                    m269T(classLoader, clsFindClass4);
                    Set set = f163c;
                    synchronized (set) {
                        try {
                            if (set.contains(clsFindClass3)) {
                                return 0;
                            }
                            set.add(clsFindClass3);
                            XposedBridge.hookMethod(methodM233B, new C0269ie(method, c0203ecM237D, field, classLoader));
                            HookEntry.log("voice menu hooked component=" + clsFindClass3.getName() + " method=" + methodM233B.getName());
                            return 2;
                        } finally {
                        }
                    }
                }
            }
            throw new NoSuchMethodException("AIOMsgItem getter");
        } catch (Throwable th) {
            HookEntry.log("voice menu hook failed reason=" + th.getClass().getSimpleName() + ": " + m242F0(th.getMessage()));
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U0 */
    public static C0410pd m272U0(Object obj) {
        if (obj == null) {
            return null;
        }
        C0410pd c0410pdM274V0 = m274V0(m298h(obj, "getContact"));
        if (c0410pdM274V0 != null) {
            return c0410pdM274V0;
        }
        Object objM245H = m245H(obj, "aioSession", "mAioSession", "session", "mSession");
        if (objM245H == null) {
            try {
                objM245H = AbstractC0497v4.m1093l(obj, "com.tencent.aio.data.AIOSession", 1);
            } catch (Throwable unused) {
            }
        }
        Object objM245H2 = m245H(obj, "contact", "aioContact", "mContact", "mAioContact", "peer", "aioPeer");
        if (objM245H2 == null) {
            objM245H2 = m298h(obj, "getAIOContact");
        }
        if (objM245H2 == null && objM245H != null) {
            objM245H2 = m245H(objM245H, "contact", "aioContact", "mContact", "mAioContact", "peer", "aioPeer");
        }
        if (objM245H2 == null && objM245H != null) {
            try {
                objM245H2 = AbstractC0497v4.m1093l(objM245H, "com.tencent.aio.data.AIOContact", 1);
            } catch (Throwable unused2) {
            }
        }
        if (objM245H2 == null) {
            objM245H2 = m298h(obj, "getAioContact");
        }
        if (objM245H2 == null) {
            objM245H2 = m298h(obj, "getContactInfo");
        }
        C0410pd c0410pdM274V02 = m274V0(m298h(objM245H2, "getContact"));
        if (c0410pdM274V02 != null) {
            return c0410pdM274V02;
        }
        C0410pd c0410pdM274V03 = m274V0(objM245H2);
        if (c0410pdM274V03 != null) {
            return c0410pdM274V03;
        }
        C0410pd c0410pdM268S0 = m268S0(objM245H2);
        if (c0410pdM268S0 != null) {
            return c0410pdM268S0;
        }
        String strM243G = m243G(m247I(objM245H2, "peerUid", "peerUin", "uin", "uid", "troopUin", "friendUin"), m262P0(m298h(objM245H2, "getPeerUid")), m262P0(m298h(objM245H2, "getPeerUin")), m247I(obj, "peerUid", "peerUin", "uin", "uid", "troopUin", "friendUin"));
        int iM275W = m275W(m275W(1, m245H(obj, "chatType", "type")), m245H(objM245H2, "chatType", "type"));
        if (strM243G.length() == 0) {
            return null;
        }
        return new C0410pd(strM243G, iM275W > 0 ? iM275W : 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static int m273V(ClassLoader classLoader) {
        f170j = true;
        try {
            Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.qqnt.aio.shortcutbar.PanelIconLinearLayout", classLoader);
            if (clsFindClassIfExists == null) {
                HookEntry.log("local voice shortcut bar hook skipped reason=PanelIconLinearLayout missing");
                return 0;
            }
            ArrayList arrayListM239E = m239E(clsFindClassIfExists);
            if (arrayListM239E.isEmpty()) {
                HookEntry.log("local voice shortcut bar hook skipped reason=bind method missing");
                return 0;
            }
            int i = 0;
            for (int i2 = 0; i2 < arrayListM239E.size(); i2++) {
                Method method = (Method) arrayListM239E.get(i2);
                String strM317q0 = m317q0(method);
                Set set = f166f;
                synchronized (set) {
                    try {
                        if (!set.contains(strM317q0)) {
                            set.add(strM317q0);
                            try {
                                method.setAccessible(true);
                                XposedBridge.hookMethod(method, new C0288je(36));
                                i++;
                            } finally {
                            }
                        }
                    } finally {
                    }
                }
            }
            if (i > 0) {
                HookEntry.logAlways("local voice shortcut bar hook installed class=" + clsFindClassIfExists.getName() + " count=" + i);
            }
            return i;
        } catch (Throwable th) {
            HookEntry.log("local voice shortcut bar hook failed reason=" + th.getClass().getSimpleName() + ": " + m242F0(th.getMessage()));
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V0 */
    public static C0410pd m274V0(Object obj) {
        C0410pd c0410pd = null;
        if (obj != null && !(obj instanceof CharSequence) && !(obj instanceof Number) && !(obj instanceof Boolean)) {
            String name = obj.getClass().getName();
            if (name.endsWith(".Contact") || name.contains("nativeinterface.Contact") || (m275W(0, m245H(obj, "chatType", "type")) > 0 && m247I(obj, "peerUid", "peerUin", "uin", "uid", "troopUin", "friendUin").length() > 0)) {
                String strM243G = m243G(m247I(obj, "peerUid", "peerUin", "uin", "uid", "troopUin", "friendUin"), m262P0(m298h(obj, "getPeerUid")), m262P0(m298h(obj, "getPeerUin")), m262P0(m298h(obj, "getUin")));
                if (strM243G.length() == 0) {
                    return null;
                }
                int iM275W = m275W(m275W(1, m298h(obj, "getChatType")), m245H(obj, "chatType", "type"));
                c0410pd = new C0410pd(strM243G, iM275W > 0 ? iM275W : 1);
            }
        }
        return c0410pd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static int m275W(int i, Object obj) {
        return obj instanceof Number ? ((Number) obj).intValue() : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W0 */
    public static void m276W0(Context context, String str) {
        if (context == null || str.length() == 0) {
            return;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        RunnableC0258i3 runnableC0258i3 = new RunnableC0258i3(context, str, 3);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnableC0258i3.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnableC0258i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static boolean m277X(Object obj, Object obj2, ArrayList arrayList, ClassLoader classLoader, C0527x2 c0527x2) {
        for (Method method : obj.getClass().getMethods()) {
            if ("sendMsg".equals(method.getName())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int i = 1;
                try {
                    method.setAccessible(true);
                    if (parameterTypes.length == 3 && parameterTypes[0].isInstance(obj2) && List.class.isAssignableFrom(parameterTypes[1])) {
                        Class<?> cls = parameterTypes[2];
                        Object objNewProxyInstance = null;
                        if (cls != null && cls.isInterface()) {
                            try {
                                objNewProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{cls}, new C0344n6(i, c0527x2));
                            } catch (Throwable th) {
                                AbstractC0198e7.m343a("voice-message", "callback-proxy", th);
                            }
                        }
                        method.invoke(obj, obj2, arrayList, objNewProxyInstance);
                    } else if (parameterTypes.length == 2 && parameterTypes[0].isInstance(obj2) && List.class.isAssignableFrom(parameterTypes[1])) {
                        method.invoke(obj, obj2, arrayList);
                    }
                    return true;
                } catch (Throwable th2) {
                    AbstractC0198e7.m343a("voice-message", "invoke-send-msg", th2);
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: X0 */
    public static C0348na m278X0(Context context, File file, C0507ve c0507ve) throws Throwable {
        C0461t0 c0461t0M566S;
        File file2;
        String str;
        String str2;
        String str3;
        String str4;
        C0507ve c0507ve2;
        long j;
        C0461t0 c0461t0M566S2;
        File file3;
        C0461t0 c0461t0M566S3;
        C0461t0 c0461t0M566S4;
        C0348na c0348na;
        File fileM627j1;
        File fileM627j12;
        if (context == null || file == null || !file.exists() || !file.isFile()) {
            C0479u2.m1038c("audio source missing");
            return null;
        }
        if (file.length() <= 0) {
            C0479u2.m1038c("audio source empty");
            return null;
        }
        long length = file.length();
        long jLastModified = file.lastModified();
        AbstractC0260i5.m670y(c0507ve);
        File fileM658u = AbstractC0260i5.m658u(context);
        try {
            c0461t0M566S = AbstractC0260i5.m566S(context, file, 48000, 64000, c0507ve);
            try {
                File file4 = (File) c0461t0M566S.f873c;
                int i = c0461t0M566S.f872b;
                if (c0461t0M566S.f871a < 2) {
                    throw new IOException("audio decode empty");
                }
                AbstractC0260i5.m605d2(file, length, jLastModified);
                try {
                    fileM627j12 = AbstractC0260i5.m627j1(fileM658u, "Elaris-local-audio-silk-hq-", ".silk");
                    file2 = fileM658u;
                    str = "audio decode empty";
                    str2 = ".amr";
                    str3 = "local voice audio amr-wb fallback reason=";
                    str4 = "local voice audio silk-compat fallback reason=";
                    j = jLastModified;
                    c0507ve2 = c0507ve;
                } catch (IOException e) {
                    e = e;
                    file2 = fileM658u;
                    str = "audio decode empty";
                    str2 = ".amr";
                    str3 = "local voice audio amr-wb fallback reason=";
                    str4 = "local voice audio silk-compat fallback reason=";
                    c0507ve2 = c0507ve;
                    j = jLastModified;
                }
                try {
                    AbstractC0260i5.m615g0(context, file4, fileM627j12, 48000, 64000, c0507ve2);
                    AbstractC0260i5.m585Y0("silk-hq", 48000, 64000, i, fileM627j12);
                    C0348na c0348na2 = new C0348na(fileM627j12, i);
                    AbstractC0260i5.m572U(file4);
                    return c0348na2;
                } catch (IOException e2) {
                    e = e2;
                    AbstractC0260i5.m670y(c0507ve2);
                    if (!AbstractC0260i5.m543K0(e)) {
                        throw e;
                    }
                    HookEntry.log("local voice audio silk-hq fallback reason=" + AbstractC0260i5.m526E1(e.getMessage()));
                    AbstractC0260i5.m572U((File) c0461t0M566S.f873c);
                    try {
                        c0461t0M566S2 = AbstractC0260i5.m566S(context, file, 24000, Math.max(32000, 23850), c0507ve2);
                        try {
                            if (c0461t0M566S2.f871a < 2) {
                                throw new IOException(str);
                            }
                            AbstractC0260i5.m605d2(file, length, j);
                            File file5 = file2;
                            try {
                                fileM627j1 = AbstractC0260i5.m627j1(file5, "Elaris-local-audio-silk-compat-", ".silk");
                                file3 = file5;
                            } catch (IOException e3) {
                                e = e3;
                                file3 = file5;
                            }
                            try {
                                AbstractC0260i5.m615g0(context, (File) c0461t0M566S2.f873c, fileM627j1, 24000, 32000, c0507ve2);
                                AbstractC0260i5.m585Y0("silk-compat", 24000, 32000, c0461t0M566S2.f872b, fileM627j1);
                                c0348na = new C0348na(fileM627j1, c0461t0M566S2.f872b);
                                AbstractC0260i5.m572U((File) c0461t0M566S2.f873c);
                            } catch (IOException e4) {
                                e = e4;
                                AbstractC0260i5.m670y(c0507ve2);
                                if (!AbstractC0260i5.m543K0(e)) {
                                    throw e;
                                }
                                HookEntry.log(str4 + AbstractC0260i5.m526E1(e.getMessage()));
                                AbstractC0260i5.m572U((File) c0461t0M566S2.f873c);
                                try {
                                    c0461t0M566S3 = AbstractC0260i5.m566S(context, file, 16000, 23850, c0507ve2);
                                } catch (Throwable th) {
                                    th = th;
                                    c0461t0M566S3 = null;
                                }
                                try {
                                    if (c0461t0M566S3.f871a < 2) {
                                        throw new IOException(str);
                                    }
                                    AbstractC0260i5.m605d2(file, length, j);
                                    String str5 = str2;
                                    try {
                                        File fileM627j13 = AbstractC0260i5.m627j1(file3, "Elaris-local-audio-amr-wb-", str5);
                                        AbstractC0260i5.m611f0((File) c0461t0M566S3.f873c, fileM627j13, true, c0507ve2);
                                        AbstractC0260i5.m585Y0("amr-wb", 16000, 23850, c0461t0M566S3.f872b, fileM627j13);
                                        c0348na = new C0348na(fileM627j13, c0461t0M566S3.f872b);
                                        AbstractC0260i5.m572U((File) c0461t0M566S3.f873c);
                                    } catch (IOException e5) {
                                        AbstractC0260i5.m670y(c0507ve2);
                                        if (!AbstractC0260i5.m543K0(e5)) {
                                            throw e5;
                                        }
                                        HookEntry.log(str3 + AbstractC0260i5.m526E1(e5.getMessage()));
                                        AbstractC0260i5.m572U((File) c0461t0M566S3.f873c);
                                        try {
                                            c0461t0M566S4 = AbstractC0260i5.m566S(context, file, 8000, 12200, c0507ve2);
                                            try {
                                                if (c0461t0M566S4.f871a < 2) {
                                                    throw new IOException(str);
                                                }
                                                AbstractC0260i5.m605d2(file, length, j);
                                                File fileM627j14 = AbstractC0260i5.m627j1(file3, "Elaris-local-audio-amr-nb-", str5);
                                                AbstractC0260i5.m611f0((File) c0461t0M566S4.f873c, fileM627j14, false, c0507ve2);
                                                AbstractC0260i5.m585Y0("amr-nb", 8000, 12200, c0461t0M566S4.f872b, fileM627j14);
                                                c0348na = new C0348na(fileM627j14, c0461t0M566S4.f872b);
                                                AbstractC0260i5.m572U((File) c0461t0M566S4.f873c);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                AbstractC0260i5.m572U(c0461t0M566S4 == null ? null : (File) c0461t0M566S4.f873c);
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            c0461t0M566S4 = null;
                                        }
                                    }
                                    return c0348na;
                                } catch (Throwable th4) {
                                    th = th4;
                                    AbstractC0260i5.m572U(c0461t0M566S3 == null ? null : (File) c0461t0M566S3.f873c);
                                    throw th;
                                }
                            }
                            return c0348na;
                        } catch (Throwable th5) {
                            th = th5;
                            AbstractC0260i5.m572U(c0461t0M566S2 == null ? null : (File) c0461t0M566S2.f873c);
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        c0461t0M566S2 = null;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                AbstractC0260i5.m572U(c0461t0M566S == null ? null : (File) c0461t0M566S.f873c);
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            c0461t0M566S = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static boolean m279Y(String str) {
        String strTrim = (str == null ? "" : str.toLowerCase(Locale.US)).trim();
        return strTrim.startsWith("audio/") || "application/ogg".equals(strTrim);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y0 */
    public static String m280Y0(ClassLoader classLoader, String str) {
        Object objM236C0 = m236C0(classLoader, "com.tencent.relation.common.api.IRelationNTUinAndUidApi");
        if (objM236C0 == null) {
            return "";
        }
        String[] strArr = {"getUidFromUin", "getFriendUidFromUin"};
        for (int i = 0; i < 2; i++) {
            try {
                Method method = objM236C0.getClass().getMethod(strArr[i], String.class);
                method.setAccessible(true);
                Object objInvoke = method.invoke(objM236C0, str);
                if ((objInvoke instanceof String) && ((String) objInvoke).length() > 0) {
                    return (String) objInvoke;
                }
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static boolean m281Z(String str) {
        if (str.length() != 0) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z0 */
    public static String m282Z0(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Object m283a(C0203ec c0203ec, Context context, Object obj, List list, Field field, String str) throws Exception {
        Object objNewInstance;
        Object obj2 = null;
        try {
            Constructor constructor = c0203ec.f227a;
            int i = c0203ec.f228b;
            Object objNewInstance2 = i == 0 ? constructor.newInstance(context, obj) : i == 1 ? constructor.newInstance(obj) : i == 2 ? constructor.newInstance(context) : constructor.newInstance(null);
            m295f0(objNewInstance2, str, field);
            return objNewInstance2;
        } catch (Throwable th) {
            loop0: for (int i2 = 0; i2 < list.size(); i2++) {
                Object obj3 = list.get(i2);
                if (obj3 != null && m315p0(obj3) == null) {
                    String strM331x0 = m331x0(0, obj3);
                    if (!strM331x0.contains("保存语音") && !strM331x0.contains("转发语音")) {
                        try {
                            Class<?> cls = obj3.getClass();
                            try {
                                Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= declaredConstructors.length) {
                                        objNewInstance = cls.newInstance();
                                        break;
                                    }
                                    Constructor<?> constructor2 = declaredConstructors[i3];
                                    Class<?>[] parameterTypes = constructor2.getParameterTypes();
                                    if (parameterTypes.length > 4) {
                                        i3++;
                                    } else {
                                        Object[] objArr = new Object[parameterTypes.length];
                                        for (int i4 = 0; i4 < parameterTypes.length; i4++) {
                                            objArr[i4] = m318r(parameterTypes[i4]);
                                        }
                                        constructor2.setAccessible(true);
                                        objNewInstance = constructor2.newInstance(objArr);
                                    }
                                }
                            } catch (Throwable unused) {
                                objNewInstance = null;
                            }
                            if (objNewInstance != null) {
                                for (Class<?> superclass = obj3.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                                    for (Field field2 : superclass.getDeclaredFields()) {
                                        int modifiers = field2.getModifiers();
                                        if (!Modifier.isStatic(modifiers) && !Modifier.isFinal(modifiers)) {
                                            try {
                                                field2.setAccessible(true);
                                                field2.set(objNewInstance, field2.get(obj3));
                                            } catch (Throwable unused2) {
                                            }
                                        }
                                    }
                                }
                                obj2 = objNewInstance;
                                break loop0;
                            }
                            continue;
                        } catch (Throwable unused3) {
                            continue;
                        }
                    }
                }
            }
            if (obj2 == null) {
                throw new Exception(th);
            }
            m295f0(obj2, str, field);
            return obj2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static boolean m284a0(String str) {
        return AbstractC0486u9.m1067t(str) || AbstractC0486u9.m1066s(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a1 */
    public static String m285a1(String str, String str2) {
        String strConcat;
        int iIndexOf;
        char cCharAt;
        if (str2.length() == 0 || (iIndexOf = str.indexOf((strConcat = str2.concat("=")))) < 0) {
            return "";
        }
        int length = strConcat.length() + iIndexOf;
        int i = length;
        while (i < str.length() && (cCharAt = str.charAt(i)) != ',' && cCharAt != ')' && cCharAt != '}') {
            i++;
        }
        String strTrim = str.substring(length, i).trim();
        if (strTrim.length() >= 2) {
            char cCharAt2 = strTrim.charAt(0);
            char cCharAt3 = strTrim.charAt(strTrim.length() - 1);
            if ((cCharAt2 == '\'' && cCharAt3 == '\'') || (cCharAt2 == '\"' && cCharAt3 == '\"')) {
                strTrim = strTrim.substring(1, strTrim.length() - 1);
            }
        }
        return strTrim.trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m286b(ClassLoader classLoader, C0502v9 c0502v9) {
        File file;
        if (HookEntry.runtimeBool(Prefs.KEY_VOICE_MESSAGE_ACTIONS)) {
            C0317lb c0317lbM234B0 = m234B0(c0502v9.f969b);
            if (c0317lbM234B0 == null || (file = c0317lbM234B0.f536a) == null || !file.exists()) {
                m276W0(HookEntry.topActivity(), "语音未下载，先播放一次再试");
                return;
            }
            int i = c0502v9.f968a;
            if (i == 1) {
                new Thread(new RunnableC0239h0(9, c0317lbM234B0), "Elaris-VoiceSave").start();
                return;
            }
            if (i == 2) {
                Context contextHostContext = HookEntry.topActivity();
                if (contextHostContext == null) {
                    contextHostContext = HookEntry.hostContext();
                }
                if (contextHostContext == null) {
                    HookEntry.log("voice forward failed reason=context missing");
                    return;
                }
                try {
                    Intent intent = new Intent(contextHostContext, XposedHelpers.findClass("com.tencent.mobileqq.activity.ForwardRecentActivity", classLoader));
                    intent.putExtra("selection_mode", 2);
                    intent.putExtra("direct_send_if_dataline_forward", false);
                    intent.putExtra("forward_text", file.getAbsolutePath());
                    intent.putExtra("ptt_forward_path", file.getAbsolutePath());
                    intent.putExtra("elaris_ptt_forward_path", file.getAbsolutePath());
                    intent.putExtra("elaris_ptt_forward_duration", c0317lbM234B0.f538c);
                    intent.putExtra("elaris_ptt_forward_waves", c0317lbM234B0.f539d);
                    intent.putExtra("forward_type", -1);
                    intent.putExtra("caller_name", "ChatActivity");
                    intent.putExtra("k_smartdevice", false);
                    intent.putExtra("k_dataline", false);
                    intent.putExtra("is_need_show_toast", true);
                    intent.putExtra("k_forward_title", "转发语音");
                    if (!(contextHostContext instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    contextHostContext.startActivity(intent);
                } catch (Throwable th) {
                    HookEntry.log("voice forward start failed reason=" + th.getClass().getSimpleName() + ": " + m242F0(th.getMessage()));
                    m276W0(contextHostContext, "未找到 QQ 语音转发入口");
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static boolean m287b0(Class cls) {
        if (cls == null) {
            return false;
        }
        String name = cls.getName();
        return "com.tencent.qqnt.kernel.nativeinterface.PttElement".equals(name) || "com.tencent.qqnt.kernelpublic.nativeinterface.PttElement".equals(name) || name.endsWith(".PttElement");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C0348na m288c(Context context, C0347n9 c0347n9, C0507ve c0507ve) throws Throwable {
        FileOutputStream fileOutputStream;
        String str = c0347n9.f596e;
        String str2 = c0347n9.f594c;
        File file = c0347n9.f592a;
        if (file != null && file.exists() && file.isFile()) {
            return m258N0(m328w(str2), str) ? m278X0(context, file, c0507ve) : m335z0(context, file, c0507ve);
        }
        Uri uri = c0347n9.f593b;
        File file2 = null;
        inputStream = null;
        InputStream inputStream = null;
        if (uri == null) {
            C0479u2.m1038c("voice source missing");
            return null;
        }
        long j = c0347n9.f597f;
        if (context != null) {
            String strM328w = m328w(str2);
            if (strM328w.length() == 0) {
                String lowerCase = str.toLowerCase(Locale.US);
                strM328w = (lowerCase.contains("mpeg") || lowerCase.contains("mp3")) ? ".mp3" : (lowerCase.contains("mp4") || lowerCase.contains("m4a")) ? ".m4a" : lowerCase.contains("aac") ? ".aac" : lowerCase.contains("wav") ? ".wav" : lowerCase.contains("flac") ? ".flac" : lowerCase.contains("opus") ? ".opus" : lowerCase.contains("ogg") ? ".ogg" : lowerCase.contains("amr") ? ".amr" : "";
            }
            if (strM328w.length() == 0) {
                strM328w = ".audio";
            }
            if (!m291d0(str2, str)) {
                C0479u2.m1038c("unsupported voice extension: ".concat(strM328w));
                return null;
            }
            File file3 = new File(context.getCacheDir(), "elaris_local_voice");
            if (!file3.exists() && !file3.mkdirs()) {
                C0479u2.m1038c("voice cache mkdir failed");
                return null;
            }
            m302j(file3);
            File fileCreateTempFile = File.createTempFile("Elaris-local-media-", strM328w.toLowerCase(Locale.US), file3);
            try {
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    if (inputStreamOpenInputStream == null) {
                        throw new IOException("voice uri open failed");
                    }
                    fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    try {
                        m324u(j, file3);
                        long jM310n = m310n(inputStreamOpenInputStream, fileOutputStream, fileCreateTempFile, c0507ve);
                        if (j > 0 && jM310n != j) {
                            throw new IOException("voice source changed or incomplete");
                        }
                        m306l(inputStreamOpenInputStream);
                        m306l(fileOutputStream);
                        file2 = fileCreateTempFile;
                    } catch (IOException e) {
                        e = e;
                        inputStream = inputStreamOpenInputStream;
                        try {
                            if (fileCreateTempFile.exists()) {
                                fileCreateTempFile.delete();
                            }
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            m306l(inputStream);
                            m306l(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStreamOpenInputStream;
                        m306l(inputStream);
                        m306l(fileOutputStream);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (IOException e3) {
                e = e3;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        }
        if (!m258N0(m328w(str2), str)) {
            return m335z0(context, file2, c0507ve);
        }
        try {
            C0348na c0348naM278X0 = m278X0(context, file2, c0507ve);
            if (file2.exists()) {
                file2.delete();
            }
            return c0348naM278X0;
        } catch (Throwable th5) {
            if (file2 != null && file2.exists()) {
                file2.delete();
            }
            throw th5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static boolean m289c0(View view, int i) {
        if (view == null || i > 3) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        try {
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                sb.append(contentDescription);
            }
        } catch (Throwable unused) {
        }
        if (view instanceof TextView) {
            try {
                CharSequence text = ((TextView) view).getText();
                if (text != null) {
                    sb.append(' ');
                    sb.append(text);
                }
                CharSequence hint = ((TextView) view).getHint();
                if (hint != null) {
                    sb.append(' ');
                    sb.append(hint);
                }
            } catch (Throwable unused2) {
            }
        }
        if (!m308m(sb.toString())) {
            StringBuilder sb2 = new StringBuilder();
            try {
                int id = view.getId();
                if (id != -1) {
                    sb2.append(view.getResources().getResourceEntryName(id));
                }
            } catch (Throwable unused3) {
            }
            try {
                sb2.append(' ');
                sb2.append(view.getClass().getName());
            } catch (Throwable unused4) {
            }
            if (!m308m(sb2.toString())) {
                if (!(view instanceof ViewGroup)) {
                    return false;
                }
                ViewGroup viewGroup = (ViewGroup) view;
                int iMin = Math.min(viewGroup.getChildCount(), 12);
                for (int i2 = 0; i2 < iMin; i2++) {
                    if (m289c0(viewGroup.getChildAt(i2), i + 1)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m290d(Context context, C0515w6 c0515w6) {
        String string;
        if (context == null || c0515w6 == null) {
            return;
        }
        Uri uri = (Uri) c0515w6.f999c;
        Uri uri2 = (Uri) c0515w6.f998b;
        try {
            if (!c0515w6.m1125e()) {
                File parentFile = (File) c0515w6.f997a;
                if (parentFile == null) {
                    return;
                }
                if (parentFile.isFile()) {
                    parentFile = parentFile.getParentFile();
                }
                if (parentFile != null && parentFile.exists() && parentFile.isDirectory() && parentFile.canRead()) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    context.getSharedPreferences("elaris_local_voice_state", 0).edit().putString("last_dir", m320s(parentFile)).apply();
                    return;
                }
                return;
            }
            if (uri2 == null || uri == null) {
                return;
            }
            if (!m253L(context, uri2)) {
                m304k(context);
                return;
            }
            Context applicationContext2 = context.getApplicationContext();
            if (applicationContext2 != null) {
                context = applicationContext2;
            }
            SharedPreferences.Editor editorPutString = context.getSharedPreferences("elaris_local_voice_state", 0).edit().putString("tree_uri", uri2.toString()).putString("tree_doc_uri", uri.toString());
            ArrayList arrayList = (ArrayList) c0515w6.f1000d;
            if (arrayList == null || arrayList.isEmpty()) {
                string = "";
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < arrayList.size(); i++) {
                    Uri uri3 = (Uri) arrayList.get(i);
                    if (uri3 != null) {
                        if (sb.length() > 0) {
                            sb.append('\n');
                        }
                        sb.append(uri3.toString());
                    }
                }
                string = sb.toString();
            }
            editorPutString.putString("tree_parent_docs", string).putString("tree_segments", m293e0((ArrayList) c0515w6.f1001e)).apply();
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static boolean m291d0(String str, String str2) {
        return m284a0(m328w(str)) || m279Y(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static Activity m292e(View view) {
        Context context = view == null ? null : view.getContext();
        for (int i = 0; context != null && i < 8; i++) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static String m293e0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            if (str != null && str.length() != 0) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(Uri.encode(str));
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m294f(Activity activity, LinearLayout linearLayout, String str, String str2, View.OnClickListener onClickListener, ViewOnLongClickListenerC0221fe viewOnLongClickListenerC0221fe) {
        int i;
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setMinimumHeight(m322t(activity, 46.0f));
        linearLayout2.setPadding(m322t(activity, 7.0f), m322t(activity, 4.0f), m322t(activity, 7.0f), m322t(activity, 4.0f));
        StateListDrawable stateListDrawable = new StateListDrawable();
        int iM322t = m322t(activity, 14.0f);
        int[] iArr = {R.attr.state_pressed};
        int i2 = AbstractC0486u9.m1062o(activity) ? -13947080 : -1052171;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i2);
        float f = iM322t;
        gradientDrawable.setCornerRadius(f);
        stateListDrawable.addState(iArr, gradientDrawable);
        int[] iArr2 = {R.attr.state_selected};
        int i3 = AbstractC0486u9.m1062o(activity) ? -13618114 : -854793;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(i3);
        gradientDrawable2.setCornerRadius(f);
        stateListDrawable.addState(iArr2, gradientDrawable2);
        stateListDrawable.addState(new int[0], new ColorDrawable(0));
        linearLayout2.setBackground(stateListDrawable);
        linearLayout2.setClickable(onClickListener != null);
        linearLayout2.setFocusable(false);
        linearLayout2.setOnClickListener(onClickListener);
        if (viewOnLongClickListenerC0221fe != null) {
            linearLayout2.setLongClickable(true);
            linearLayout2.setOnLongClickListener(viewOnLongClickListenerC0221fe);
        }
        int iRgb = ("..".equals(str) || "上一级".equals(str) || "上一页".equals(str) || "下一页".equals(str)) ? Color.rgb(82, 96, 118) : str2.startsWith("文件夹") ? Color.rgb(34, 190, 143) : m284a0(m328w(str)) ? Color.rgb(52, 132, 255) : Color.rgb(118, 126, 140);
        int i4 = ("..".equals(str) || "上一级".equals(str)) ? 4 : ("上一页".equals(str) || "下一页".equals(str)) ? 5 : str2.startsWith("文件夹") ? 1 : m284a0(m328w(str)) ? 2 : 3;
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(new C0315l9(i4, iRgb));
        imageView.setAlpha((onClickListener == null && i4 == 3) ? 0.48f : 1.0f);
        linearLayout2.addView(imageView, new LinearLayout.LayoutParams(m322t(activity, 28.0f), m322t(activity, 28.0f)));
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(1);
        linearLayout3.setGravity(16);
        linearLayout3.setPadding(m322t(activity, 10.0f), 0, m322t(activity, 7.0f), 0);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor((onClickListener == null && i4 == 3) ? AbstractC0486u9.m1043E(activity) : AbstractC0486u9.m1045G(activity));
        textView.setTextSize(14.0f);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(16);
        textView.setTypeface((i4 == 2 || i4 == 1) ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        linearLayout3.addView(textView, new LinearLayout.LayoutParams(-1, -2));
        if (str2.length() <= 0 || "文件夹".equals(str2)) {
            i = 0;
        } else {
            TextView textView2 = new TextView(activity);
            textView2.setText(str2);
            textView2.setTextColor(AbstractC0486u9.m1043E(activity));
            textView2.setTextSize(11.0f);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            i = 0;
            textView2.setPadding(0, m322t(activity, 3.0f), 0, 0);
            linearLayout3.addView(textView2, new LinearLayout.LayoutParams(-1, -2));
        }
        linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(i, -2, 1.0f));
        String strM328w = m328w(str);
        String upperCase = m284a0(strM328w) ? strM328w.substring(1).toUpperCase(Locale.US) : "";
        if (upperCase.length() > 0 && i4 == 2) {
            TextView textView3 = new TextView(activity);
            textView3.setText(upperCase);
            textView3.setTextColor(iRgb);
            textView3.setTextSize(9.5f);
            textView3.setGravity(17);
            textView3.setSingleLine(true);
            textView3.setPadding(m322t(activity, 7.0f), 0, m322t(activity, 7.0f), 0);
            textView3.setBackground(m309m0(AbstractC0486u9.m1069v(activity, iRgb, 0.92f), m322t(activity, 12.0f), AbstractC0486u9.m1069v(activity, iRgb, 0.78f), m322t(activity, 1.0f)));
            linearLayout2.addView(textView3, new LinearLayout.LayoutParams(-2, m322t(activity, 22.0f)));
        }
        if (onClickListener != null && (i4 == 1 || i4 == 4 || i4 == 5)) {
            TextView textView4 = new TextView(activity);
            textView4.setText("›");
            textView4.setTextColor(AbstractC0486u9.m1043E(activity));
            textView4.setTextSize(22.0f);
            textView4.setGravity(17);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m322t(activity, 20.0f), -1);
            layoutParams.leftMargin = m322t(activity, 2.0f);
            linearLayout2.addView(textView4, layoutParams);
        }
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public static void m295f0(Object obj, String str, Field field) {
        if (obj == null) {
            return;
        }
        if (field != null && field.getDeclaringClass().isAssignableFrom(obj.getClass())) {
            try {
                field.set(obj, str);
            } catch (Throwable unused) {
            }
        }
        m254L0(obj, str, "title", "text", "label", "name", "a");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static int m296g(Activity activity, C0515w6 c0515w6, ArrayList arrayList) {
        if (activity != null) {
            Uri uri = (Uri) c0515w6.f998b;
            if (c0515w6.m1125e()) {
                try {
                    Cursor cursorQuery = activity.getContentResolver().query(DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId((Uri) c0515w6.f999c)), new String[]{"document_id", "_display_name", "mime_type", "_size", "last_modified"}, null, null, null);
                    if (cursorQuery == null) {
                        m306l(cursorQuery);
                        return -1;
                    }
                    int columnIndex = cursorQuery.getColumnIndex("document_id");
                    int columnIndex2 = cursorQuery.getColumnIndex("_display_name");
                    int columnIndex3 = cursorQuery.getColumnIndex("mime_type");
                    int columnIndex4 = cursorQuery.getColumnIndex("_size");
                    int columnIndex5 = cursorQuery.getColumnIndex("last_modified");
                    int i = 0;
                    while (cursorQuery.moveToNext()) {
                        i++;
                        String string = columnIndex2 >= 0 ? cursorQuery.getString(columnIndex2) : "";
                        if (string != null && string.length() != 0) {
                            String string2 = columnIndex3 >= 0 ? cursorQuery.getString(columnIndex3) : "";
                            boolean zEquals = "vnd.android.document/directory".equals(string2);
                            boolean zM291d0 = m291d0(string, string2);
                            if (zEquals || !string.startsWith(".") || zM291d0) {
                                String string3 = columnIndex >= 0 ? cursorQuery.getString(columnIndex) : "";
                                if (string3 != null && string3.length() != 0) {
                                    Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, string3);
                                    long j = 0;
                                    long j2 = (columnIndex4 < 0 || cursorQuery.isNull(columnIndex4)) ? 0L : cursorQuery.getLong(columnIndex4);
                                    if (columnIndex5 >= 0 && !cursorQuery.isNull(columnIndex5)) {
                                        j = cursorQuery.getLong(columnIndex5);
                                    }
                                    arrayList.add(new C0347n9(null, uriBuildDocumentUriUsingTree, string, "", string2, j2, j, zEquals));
                                }
                            }
                        }
                    }
                    m306l(cursorQuery);
                    return i;
                } catch (Throwable th) {
                    try {
                        if (th instanceof SecurityException) {
                            m304k(activity);
                            HookEntry.logAlways("local voice tree permission invalidated uri=" + m242F0(String.valueOf(uri)));
                        }
                        HookEntry.log("local voice tree query failed: " + th.getClass().getSimpleName() + ": " + m242F0(th.getMessage()));
                        m306l(null);
                        return -1;
                    } catch (Throwable th2) {
                        m306l(null);
                        throw th2;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public static void m297g0(View view, String str) {
        if (view instanceof TextView) {
            try {
                ((TextView) view).setText(str);
            } catch (Throwable unused) {
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int iMin = Math.min(viewGroup.getChildCount(), 20);
            for (int i = 0; i < iMin; i++) {
                m297g0(viewGroup.getChildAt(i), str);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static Object m298h(Object obj, String str) {
        if (obj != null) {
            for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                try {
                    Method declaredMethod = superclass.getDeclaredMethod(str, null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod.invoke(obj, null);
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public static String m299h0(File file) {
        String strM325u0 = "";
        if (file == null) {
            return "";
        }
        String strM325u02 = m325u0(m320s(file));
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                strM325u0 = m325u0(m320s(externalStorageDirectory));
            }
            if (strM325u0.length() > 0 && strM325u02.equals(strM325u0)) {
                return "内部存储";
            }
            if (strM325u0.length() <= 0 || !strM325u02.startsWith(strM325u0.concat("/"))) {
                return strM325u02;
            }
            return "内部存储 > " + strM325u02.substring(strM325u0.length() + 1).replace("/", " > ");
        } catch (Throwable unused) {
            return strM325u02;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static int m300i(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 1000) {
            return 100;
        }
        if (i == 2 || i == 4 || i == 100) {
            return i;
        }
        if (i > 0) {
            return i + 1;
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public static StateListDrawable m301i0(Context context) {
        int iM322t = m322t(context, 20.0f);
        int iM322t2 = m322t(context, 1.0f);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, m309m0(AbstractC0486u9.m1062o(context) ? -13945790 : -1510401, iM322t, AbstractC0486u9.m1062o(context) ? -11964769 : -6832393, iM322t2));
        stateListDrawable.addState(new int[]{R.attr.state_focused}, m309m0(AbstractC0486u9.m1062o(context) ? -13617082 : -1050625, iM322t, AbstractC0486u9.m1062o(context) ? -11765846 : -5452551, iM322t2));
        stateListDrawable.addState(new int[0], m309m0(AbstractC0486u9.m1062o(context) ? -14472133 : -591105, iM322t, AbstractC0486u9.m1062o(context) ? -13282697 : -3876617, iM322t2));
        return stateListDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m302j(File file) {
        try {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 32) {
                long jCurrentTimeMillis = System.currentTimeMillis() - 172800000;
                for (File file2 : fileArrListFiles) {
                    if (file2 != null && file2.isFile() && file2.lastModified() < jCurrentTimeMillis) {
                        file2.delete();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public static TextView m303j0(Context context, String str) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(AbstractC0486u9.m1050c(context));
        textView.setTextSize(13.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setBackground(m301i0(context));
        return textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m304k(Context context) {
        if (context == null) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            context.getSharedPreferences("elaris_local_voice_state", 0).edit().remove("tree_uri").remove("tree_doc_uri").remove("tree_parent_docs").remove("tree_segments").apply();
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public static GradientDrawable m305k0(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.argb(236, 255, 255, 255));
        gradientDrawable.setStroke(m322t(context, 1.0f), Color.argb(56, 198, 205, 216));
        return gradientDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m306l(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public static GradientDrawable m307l0(Context context) {
        return m309m0(AbstractC0486u9.m1072y(context), m322t(context, 24.0f), AbstractC0486u9.m1062o(context) ? -11775650 : -1512206, m322t(context, 1.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static boolean m308m(String str) {
        if (str.length() == 0) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        return str.contains("表情") || str.contains("琛ㄦ儏") || lowerCase.contains("emoji") || lowerCase.contains("emoticon") || lowerCase.contains("emotion") || lowerCase.contains("smile");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public static GradientDrawable m309m0(int i, int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(i2);
        gradientDrawable.setStroke(i4, i3);
        return gradientDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static long m310n(InputStream inputStream, FileOutputStream fileOutputStream, File file, C0507ve c0507ve) throws IOException {
        byte[] bArr = new byte[65536];
        long j = 0;
        long j2 = 4194304;
        while (true) {
            if (c0507ve.f978b == null) {
                c0507ve.f978b = Thread.currentThread();
            }
            if (c0507ve.f977a) {
                C0479u2.m1038c("voice conversion cancelled");
                return 0L;
            }
            if (Thread.currentThread().isInterrupted()) {
                C0479u2.m1038c("voice conversion cancelled");
                return 0L;
            }
            int i = inputStream.read(bArr);
            if (i < 0) {
                break;
            }
            if (i == 0) {
                int i2 = inputStream.read();
                if (i2 < 0) {
                    break;
                }
                long j3 = 1 + j;
                fileOutputStream.write(i2);
                if (j3 >= j2) {
                    m324u(0L, file != null ? file.getParentFile() : null);
                    j2 = 4194305 + j;
                }
                j = j3;
            } else {
                j += (long) i;
                fileOutputStream.write(bArr, 0, i);
                if (j >= j2) {
                    m324u(0L, file != null ? file.getParentFile() : null);
                    j2 = j + 4194304;
                }
            }
        }
        fileOutputStream.flush();
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public static String m311n0(Context context, Uri uri) {
        Uri uri2;
        String strTrim;
        String documentId;
        String strSubstring;
        int columnIndex;
        Cursor cursorQuery = null;
        if (uri == null) {
            uri2 = uri;
        } else {
            try {
                uri2 = uri;
                try {
                    cursorQuery = context.getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                uri2 = uri;
            }
        }
        if (cursorQuery == null || !cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("_display_name")) < 0) {
            m306l(cursorQuery);
            strTrim = "";
        } else {
            String string = cursorQuery.getString(columnIndex);
            strTrim = string == null ? "" : string.trim();
            m306l(cursorQuery);
        }
        String strM323t0 = m323t0(strTrim);
        if (strM323t0.length() > 0) {
            return strM323t0;
        }
        if (uri2 == null) {
            documentId = "";
        } else {
            try {
                documentId = DocumentsContract.getDocumentId(uri2);
            } catch (Throwable unused3) {
            }
        }
        if (documentId == null || documentId.length() == 0) {
            strSubstring = "";
        } else {
            int iLastIndexOf = documentId.lastIndexOf(58);
            strSubstring = iLastIndexOf >= 0 ? documentId.substring(iLastIndexOf + 1) : documentId;
            if (strSubstring.length() == 0 && iLastIndexOf >= 0) {
                strSubstring = documentId.substring(0, iLastIndexOf + 1);
            }
            int iLastIndexOf2 = strSubstring.lastIndexOf(47);
            if (iLastIndexOf2 >= 0) {
                strSubstring = strSubstring.substring(iLastIndexOf2 + 1);
            }
        }
        String strM323t02 = m323t0(strSubstring);
        return strM323t02.length() > 0 ? strM323t02 : "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static Object m312o(Object obj, String str, int i, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        if (bArr != null) {
            for (byte b : bArr) {
                arrayList.add(Byte.valueOf(b));
            }
        }
        for (Method method : obj.getClass().getMethods()) {
            if ("createPttElement".equals(method.getName())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 3 && parameterTypes[0] == String.class && parameterTypes[1] == Integer.TYPE && List.class.isAssignableFrom(parameterTypes[2])) {
                    try {
                        method.setAccessible(true);
                        Object objInvoke = method.invoke(obj, str, Integer.valueOf(Math.max(0, i)), arrayList);
                        m321s0(objInvoke);
                        return objInvoke;
                    } catch (Throwable th) {
                        AbstractC0198e7.m343a("voice-message", "create-ptt-element", th);
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o0 */
    public static boolean m313o0(File file, String str, String str2) {
        String strM325u0 = m325u0(m320s(file));
        if (str != null && str.length() > 0) {
            try {
                File parentFile = new File(str).getParentFile();
                if (parentFile != null) {
                    if (m325u0(m320s(parentFile)).equals(strM325u0)) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        String strM327v0 = "";
        if (file != null) {
            try {
                String strM325u02 = m325u0(Environment.getExternalStorageDirectory().getAbsolutePath());
                String strM325u03 = m325u0(m320s(file));
                if (!strM325u03.equals(strM325u02) && strM325u03.startsWith(strM325u02.concat("/"))) {
                    strM327v0 = m327v0(strM325u03.substring(strM325u02.length() + 1));
                }
            } catch (Throwable unused2) {
            }
        }
        return strM327v0.length() > 0 && str2 != null && m327v0(str2).equals(strM327v0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static Object m314p(Object obj, String str, int i, byte[] bArr) {
        if (obj != null) {
            try {
                for (Method method : obj.getClass().getMethods()) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if ("createPttElement".equals(method.getName()) && parameterTypes.length == 2 && parameterTypes[0] == String.class && parameterTypes[1] == Integer.TYPE) {
                        try {
                            method.setAccessible(true);
                            Object objInvoke = method.invoke(obj, str, Integer.valueOf(Math.max(0, i)));
                            m329w0(objInvoke, bArr);
                            return objInvoke;
                        } catch (Throwable th) {
                            AbstractC0198e7.m343a("kk-tts", "script-create-ptt", th);
                        }
                    }
                }
            } catch (Throwable th2) {
                AbstractC0198e7.m343a("kk-tts", "script-ptt-methods", th2);
                return null;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p0 */
    public static C0502v9 m315p0(Object obj) {
        C0502v9 c0502v9;
        Map map = f162b;
        synchronized (map) {
            c0502v9 = (C0502v9) map.get(obj);
        }
        return c0502v9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static C0410pd m316q(Activity activity, View view) {
        C0410pd c0410pdM270T0;
        C0410pd c0410pdM266R0;
        C0410pd c0410pd;
        Object parent;
        for (int i = 0; view != null && i < 8; i++) {
            try {
                c0410pdM270T0 = m270T0(view);
                if (c0410pdM270T0 != null) {
                    break;
                }
                try {
                    c0410pdM270T0 = m272U0(AbstractC0497v4.m1093l(view, "com.tencent.aio.data.AIOParam", 2));
                    if (c0410pdM270T0 != null) {
                        break;
                    }
                } catch (Throwable unused) {
                }
                try {
                    parent = view.getParent();
                } catch (Throwable unused2) {
                    parent = null;
                }
                view = parent instanceof View ? (View) parent : null;
            } catch (Throwable unused3) {
            }
        }
        c0410pdM270T0 = null;
        if (c0410pdM270T0 != null) {
            return c0410pdM270T0;
        }
        C0410pd c0410pd2 = f176p;
        if (c0410pd2 != null && c0410pd2.f722a.length() > 0 && (c0410pd = f176p) != null && c0410pd.f722a.length() > 0 && System.currentTimeMillis() - f177q < 600000) {
            return c0410pd2;
        }
        try {
            c0410pdM266R0 = m266R0(activity);
        } catch (Throwable unused4) {
        }
        if (c0410pdM266R0 != null) {
            return c0410pdM266R0;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q0 */
    public static String m317q0(Method method) {
        if (method == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(method.getDeclaringClass().getName());
        sb.append('#');
        sb.append(method.getName());
        sb.append('(');
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(parameterTypes[i].getName());
        }
        sb.append("):");
        sb.append(method.getReturnType().getName());
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static Object m318r(Class cls) {
        if (cls != null && cls != Void.TYPE) {
            if (cls == Boolean.TYPE) {
                return Boolean.FALSE;
            }
            if (cls == Integer.TYPE) {
                return 0;
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
            if (cls == Long.TYPE) {
                return 0L;
            }
            if (cls == Float.TYPE) {
                return Float.valueOf(0.0f);
            }
            if (cls == Double.TYPE) {
                return Double.valueOf(0.0d);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    public static Object m319r0(Class cls, String str, int i) {
        try {
            for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                constructor.setAccessible(true);
                if (parameterTypes.length == 3 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == String.class && parameterTypes[2] == String.class) {
                    return constructor.newInstance(Integer.valueOf(i), str, "");
                }
            }
            Object objNewInstance = cls.newInstance();
            m254L0(objNewInstance, Integer.valueOf(i), "chatType", "type");
            m254L0(objNewInstance, str, "peerUid", "peerUin", "uin", "uid");
            m254L0(objNewInstance, "", "guildId", "guildID");
            return objNewInstance;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static String m320s(File file) {
        if (file == null) {
            return "";
        }
        try {
            return file.getCanonicalPath();
        } catch (Throwable unused) {
            return file.getAbsolutePath();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s0 */
    public static void m321s0(Object obj) {
        Object objM232A0 = m232A0(obj);
        if (objM232A0 == null) {
            return;
        }
        m256M0(objM232A0, 2, "voiceType", "mVoiceType");
        m256M0(objM232A0, 0, "voiceChangeType", "mVoiceChangeType");
        m256M0(objM232A0, Boolean.FALSE, "canConvert2Text", "mCanConvert2Text");
        m256M0(objM232A0, "", "text", "mText");
        Object objM245H = m245H(objM232A0, "otherBusinessInfo", "mOtherBusinessInfo");
        if (objM245H != null) {
            m256M0(objM245H, 0, "aiVoiceType", "mAiVoiceType");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static int m322t(Context context, float f) {
        float f2;
        try {
            f2 = context.getResources().getDisplayMetrics().density;
        } catch (Throwable unused) {
            f2 = 1.0f;
        }
        return (int) ((f * f2) + 0.5f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t0 */
    public static String m323t0(String str) {
        if (str == null) {
            return "";
        }
        String strTrim = str.trim();
        return strTrim.length() == 0 ? "" : ("0".equals(strTrim) || "primary".equalsIgnoreCase(strTrim) || "primary:".equalsIgnoreCase(strTrim)) ? "内部存储" : strTrim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static void m324u(long j, File file) throws IOException {
        long jMax = Math.max(0L, j);
        long usableSpace = file != null ? file.getUsableSpace() : 0L;
        if (usableSpace < 33554432 || jMax > usableSpace - 33554432) {
            C0479u2.m1038c("not enough storage for voice copy");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u0 */
    public static String m325u0(String str) {
        if (str == null) {
            return "";
        }
        String strReplace = str.replace('\\', '/');
        while (strReplace.endsWith("/") && strReplace.length() > 1) {
            strReplace = strReplace.substring(0, strReplace.length() - 1);
        }
        return strReplace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0085 A[ADDED_TO_REGION, EDGE_INSN: B:130:0x0085->B:54:0x0085 BREAK  A[LOOP:2: B:48:0x0076->B:75:0x00b9], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005f A[Catch: all -> 0x002d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x002d, blocks: (B:14:0x0021, B:30:0x004a, B:32:0x004f, B:39:0x005f), top: B:114:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0071 A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:10:0x001a, B:27:0x0040, B:51:0x007d, B:50:0x0079, B:43:0x006d, B:45:0x0071), top: B:108:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0079 A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:10:0x001a, B:27:0x0040, B:51:0x007d, B:50:0x0079, B:43:0x006d, B:45:0x0071), top: B:108:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00fe  */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m326v(File file) {
        File file2;
        long j;
        FileInputStream fileInputStream;
        Throwable th;
        byte[] bArr;
        int i;
        int i2;
        int i3;
        long j2;
        int i4;
        long j3;
        int i5 = 0;
        if (file.exists()) {
            try {
                file2 = file;
                try {
                    fileInputStream = new FileInputStream(file2);
                } catch (Throwable th2) {
                    th = th2;
                    j = 2147483647L;
                    AbstractC0198e7.m343a("voice-audio-metadata", "silk-duration", th);
                    if (i5 <= 0) {
                    }
                }
                try {
                    try {
                        bArr = new byte[10];
                        i = 0;
                        while (i < 10) {
                            try {
                                int i6 = fileInputStream.read(bArr, i, 10 - i);
                                if (i6 < 0) {
                                    break;
                                }
                                if (i6 != 0) {
                                    i += i6;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                j = 2147483647L;
                                try {
                                    fileInputStream.close();
                                    throw th;
                                } catch (Throwable th4) {
                                    th.addSuppressed(th4);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        j = 2147483647L;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    AbstractC0198e7.m343a("voice-audio-metadata", "silk-duration", th);
                    if (i5 <= 0) {
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                file2 = file;
            }
            if (i == 10) {
                if ((bArr[0] & 255) <= 6) {
                    byte[] bArr2 = AbstractC0260i5.f398s;
                    int i7 = 0;
                    while (i7 < 9) {
                        int i8 = 1 + i7;
                        if (bArr[i8] != bArr2[i7]) {
                            for (i2 = 0; i2 < 9; i2++) {
                                if ((bArr[i2] & 255) == "#!SILK_V3".charAt(i2)) {
                                }
                            }
                            byte b = bArr[9];
                            i3 = b == 10 ? b & 255 : -1;
                            j2 = 0;
                            while (true) {
                                if (i3 < 0) {
                                    i3 = fileInputStream.read();
                                }
                                int i9 = fileInputStream.read();
                                if (i3 >= 0 || i9 < 0 || (i4 = i3 | (i9 << 8)) <= 0 || i4 > 8192) {
                                    break;
                                }
                                long j4 = 0;
                                j = 2147483647L;
                                while (true) {
                                    j3 = i4;
                                    long j5 = 1;
                                    if (j4 >= j3) {
                                        break;
                                    }
                                    try {
                                        long jSkip = fileInputStream.skip(j3 - j4);
                                        if (jSkip <= 0) {
                                            if (fileInputStream.read() < 0) {
                                                break;
                                            }
                                        } else {
                                            j5 = jSkip;
                                        }
                                        j4 += j5;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        th = th;
                                        fileInputStream.close();
                                        throw th;
                                    }
                                }
                                if (j4 < j3) {
                                    break;
                                }
                                j2++;
                                i3 = -1;
                            }
                            j = 2147483647L;
                            long j6 = ((20 * j2) + 999) / 1000;
                            int iMax = j2 <= 0 ? 0 : j6 > j ? Integer.MAX_VALUE : Math.max(1, (int) j6);
                            fileInputStream.close();
                            i5 = iMax;
                            if (i5 <= 0) {
                                return i5;
                            }
                            long length = file2.length();
                            if (length <= 0) {
                                return 1;
                            }
                            long jCeil = (long) Math.ceil(length / 1200.0d);
                            return jCeil > j ? Integer.MAX_VALUE : Math.max(1, (int) jCeil);
                        }
                        i7 = i8;
                    }
                    j2 = 0;
                    while (true) {
                        if (i3 < 0) {
                        }
                        int i92 = fileInputStream.read();
                        if (i3 >= 0) {
                            break;
                        }
                        break;
                        j2++;
                        i3 = -1;
                    }
                    j = 2147483647L;
                    long j62 = ((20 * j2) + 999) / 1000;
                    if (j2 <= 0) {
                    }
                    fileInputStream.close();
                    i5 = iMax;
                    if (i5 <= 0) {
                    }
                } else {
                    while (i2 < 9) {
                    }
                    byte b2 = bArr[9];
                    if (b2 == 10) {
                    }
                    j2 = 0;
                    while (true) {
                        if (i3 < 0) {
                        }
                        int i922 = fileInputStream.read();
                        if (i3 >= 0) {
                        }
                        j2++;
                        i3 = -1;
                    }
                    j = 2147483647L;
                    long j622 = ((20 * j2) + 999) / 1000;
                    if (j2 <= 0) {
                    }
                    fileInputStream.close();
                    i5 = iMax;
                    if (i5 <= 0) {
                    }
                }
                fileInputStream.close();
                throw th;
            }
            fileInputStream.close();
        } else {
            file2 = file;
        }
        j = 2147483647L;
        if (i5 <= 0) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v0 */
    public static String m327v0(String str) {
        if (str == null) {
            return "";
        }
        String strReplace = str.replace('\\', '/');
        while (strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        while (strReplace.endsWith("/") && strReplace.length() > 0) {
            strReplace = strReplace.substring(0, strReplace.length() - 1);
        }
        return strReplace.length() == 0 ? "" : strReplace.concat("/");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static String m328w(String str) {
        int iLastIndexOf;
        if (str == null || (iLastIndexOf = str.lastIndexOf(46)) < 0 || iLastIndexOf >= str.length() - 1 || str.length() - iLastIndexOf > 8) {
            return "";
        }
        String strReplaceAll = str.substring(iLastIndexOf).replaceAll("[^A-Za-z0-9.]", "");
        return strReplaceAll.length() <= 1 ? "" : strReplaceAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public static void m329w0(Object obj, byte[] bArr) {
        Object objM232A0 = m232A0(obj);
        if (objM232A0 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        m256M0(objM232A0, 0, "autoConvertText", "mAutoConvertText");
        m256M0(objM232A0, 0, "voiceChangeType", "mVoiceChangeType");
        m256M0(objM232A0, arrayList, "waveAmplitudes", "mWaveAmplitudes");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m330x(C0347n9 c0347n9) {
        String str;
        String str2;
        String name;
        long j = c0347n9.f597f;
        if (j < 1024) {
            str = j + " B";
        } else {
            double d = j / 1024.0d;
            str = d < 1024.0d ? String.format(Locale.US, "%.1f KB", Double.valueOf(d)) : String.format(Locale.US, "%.2f MB", Double.valueOf(d / 1024.0d));
        }
        try {
            str2 = new SimpleDateFormat("MM-dd HH:mm", Locale.US).format(new Date(c0347n9.f598g));
        } catch (Throwable unused) {
            str2 = "";
        }
        File file = c0347n9.f592a;
        if (file != null) {
            if (file.getParentFile() != null) {
                name = file.getParentFile().getName();
            } else {
                String str3 = c0347n9.f595d;
                if (str3.length() == 0) {
                    name = "";
                } else {
                    name = m327v0(str3);
                    if (name.endsWith("/")) {
                        name = name.substring(0, name.length() - 1);
                    }
                    int iLastIndexOf = name.lastIndexOf(47);
                    if (iLastIndexOf >= 0) {
                        name = name.substring(iLastIndexOf + 1);
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m243G(str2, ""));
        sb.append("  ");
        sb.append(str);
        sb.append(name.length() != 0 ? "  ".concat(name) : "");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public static String m331x0(int i, Object obj) {
        if (obj != null && i <= 2) {
            if (obj instanceof CharSequence) {
                return obj.toString();
            }
            if (!(obj instanceof Number) && !(obj instanceof Boolean)) {
                StringBuilder sb = new StringBuilder();
                for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    for (Field field : superclass.getDeclaredFields()) {
                        if (!Modifier.isStatic(field.getModifiers())) {
                            try {
                                field.setAccessible(true);
                                Object obj2 = field.get(obj);
                                if (obj2 instanceof CharSequence) {
                                    sb.append(obj2);
                                } else if (!field.getType().isPrimitive()) {
                                    sb.append(m331x0(1 + i, obj2));
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
                return sb.toString();
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static Object m332y(int i, Object obj) {
        if (obj == null || i > 2) {
            return null;
        }
        if (Activity.class.isInstance(obj)) {
            return obj;
        }
        if ((obj instanceof CharSequence) || (obj instanceof Number) || (obj instanceof Boolean)) {
            return null;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive()) {
                    try {
                        field.setAccessible(true);
                        Object objM332y = m332y(1 + i, field.get(obj));
                        if (objM332y != null) {
                            return objM332y;
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
    /* JADX INFO: renamed from: y0 */
    public static void m333y0(ViewGroup viewGroup, ImageView imageView) {
        FrameLayout frameLayout;
        try {
            Object parent = imageView.getParent();
            if ((parent instanceof FrameLayout) && "ELARIS_LOCAL_VOICE_BAR_CELL".equals(((View) parent).getTag())) {
                frameLayout = (FrameLayout) parent;
                int iM322t = m322t(viewGroup.getContext(), 34.0f);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM322t, iM322t);
                layoutParams.gravity = 17;
                imageView.setLayoutParams(layoutParams);
            } else {
                frameLayout = null;
            }
            if (frameLayout == null) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(imageView);
                }
                frameLayout = new FrameLayout(viewGroup.getContext());
                frameLayout.setTag("ELARIS_LOCAL_VOICE_BAR_CELL");
                int iM322t2 = m322t(viewGroup.getContext(), 34.0f);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iM322t2, iM322t2);
                layoutParams2.gravity = 17;
                frameLayout.addView(imageView, layoutParams2);
            }
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null && childAt != frameLayout && m289c0(childAt, 0)) {
                    childCount = i;
                    break;
                }
                i++;
            }
            int iIndexOfChild = viewGroup.indexOfChild(frameLayout);
            if (iIndexOfChild >= 0) {
                viewGroup.removeView(frameLayout);
                if (iIndexOfChild < childCount) {
                    childCount--;
                }
            }
            if (childCount < 0 || childCount > viewGroup.getChildCount()) {
                childCount = viewGroup.getChildCount();
            }
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, m322t(viewGroup.getContext(), 34.0f), 1.0f);
            layoutParams3.gravity = 16;
            viewGroup.addView(frameLayout, childCount, layoutParams3);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static Method m334z(Class cls) throws NoSuchMethodException {
        while (cls != null && cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (!Modifier.isAbstract(method.getModifiers()) && method.getReturnType() == Void.TYPE && method.getParameterTypes().length == 0) {
                    return method;
                }
            }
            cls = cls.getSuperclass();
        }
        throw new NoSuchMethodException("menu click");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    public static C0348na m335z0(Context context, File file, C0507ve c0507ve) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        if (context == null || file == null || !file.exists() || !file.isFile()) {
            C0479u2.m1038c("voice source missing");
            return null;
        }
        if (file.length() <= 0) {
            C0479u2.m1038c("voice source empty");
            return null;
        }
        String strM328w = m328w(file.getName());
        if (!AbstractC0486u9.m1067t(strM328w)) {
            if (AbstractC0486u9.m1066s(strM328w)) {
                return m278X0(context, file, c0507ve);
            }
            C0479u2.m1038c("unsupported voice extension: ".concat(strM328w));
            return null;
        }
        String strM328w2 = m328w(file.getName());
        if (strM328w2.length() == 0) {
            strM328w2 = ".slk";
        }
        if (!AbstractC0486u9.m1067t(strM328w2)) {
            C0479u2.m1038c("unsupported voice extension: ".concat(strM328w2));
            return null;
        }
        File file2 = new File(context.getCacheDir(), "elaris_local_voice");
        if (!file2.exists() && !file2.mkdirs()) {
            C0479u2.m1038c("voice cache mkdir failed");
            return null;
        }
        m302j(file2);
        File fileCreateTempFile = File.createTempFile("Elaris-local-voice-", strM328w2.toLowerCase(Locale.US), file2);
        try {
            m324u(file.length(), file2);
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    if (m310n(fileInputStream2, fileOutputStream, fileCreateTempFile, c0507ve) != file.length()) {
                        throw new IOException("voice source changed or incomplete");
                    }
                    m306l(fileInputStream2);
                    m306l(fileOutputStream);
                    if (fileCreateTempFile != null && fileCreateTempFile.exists()) {
                        return new C0348na(fileCreateTempFile, m326v(fileCreateTempFile));
                    }
                    C0479u2.m1038c("voice cache missing");
                    return null;
                } catch (IOException e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    try {
                        if (fileCreateTempFile.exists()) {
                            fileCreateTempFile.delete();
                        }
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        m306l(fileInputStream);
                        m306l(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    m306l(fileInputStream);
                    m306l(fileOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }
}
