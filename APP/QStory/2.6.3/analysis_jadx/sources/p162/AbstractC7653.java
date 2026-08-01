package p162;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import bsh.C2633;

/* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7653 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object f20771 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:42:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m12915(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Object r0 = p162.AbstractC7653.f20771
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.lang.String r6 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r5.deleteFile(r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r5 = move-exception
            goto L60
        L14:
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r2 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r1, r2)     // Catch: java.lang.Throwable -> L12 java.io.FileNotFoundException -> L57
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r1.setOutput(r5, r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.startDocument(r3, r4)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "locales"
            r1.startTag(r2, r3)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "application_locales"
            r1.attribute(r2, r3, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r6 = "locales"
            r1.endTag(r2, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.endDocument()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r5 == 0) goto L4f
        L3e:
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L4f
            goto L4f
        L42:
            r6 = move-exception
            goto L51
        L44:
            r6 = move-exception
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = "Storing App Locales : Failed to persist app-locales in storage "
            android.util.Log.w(r1, r2, r6)     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L4f
            goto L3e
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L5f
        L51:
            if (r5 == 0) goto L56
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L56
        L56:
            throw r6     // Catch: java.lang.Throwable -> L12
        L57:
            java.lang.String r5 = "AppLocalesStorageHelper"
            java.lang.String r6 = "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing "
            android.util.Log.w(r5, r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
        L5f:
            return
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p162.AbstractC7653.m12915(android.content.Context, java.lang.String):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m12916(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Intent m12917(AppCompatActivity appCompatActivity, ComponentName componentName) {
        String strM12916 = m12916(appCompatActivity, componentName);
        if (strM12916 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM12916);
        return m12916(appCompatActivity, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Intent m12918(AppCompatActivity appCompatActivity) {
        Intent parentActivityIntent = appCompatActivity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strM12916 = m12916(appCompatActivity, appCompatActivity.getComponentName());
            if (strM12916 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(appCompatActivity, strM12916);
            try {
                return m12916(appCompatActivity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM12916 + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r5.f20747 == r8.hashCode()) goto L21;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList m12919(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            飘花落叶言子哲楪世兰苏.飘花落叶言子楪苏哲世兰 r1 = new 飘花落叶言子哲楪世兰苏.飘花落叶言子楪苏哲世兰
            r1.<init>(r0, r8)
            java.lang.Object r2 = p161.AbstractC7646.f20754
            monitor-enter(r2)
            java.util.WeakHashMap r3 = p161.AbstractC7646.f20755     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            飘花落叶言子哲楪世兰苏.飘花落叶言子楪苏世兰哲 r5 = (p161.C7644) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.f20748     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.f20747     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb8
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.f20747     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.f20749     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = p161.AbstractC7646.f20756
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = p161.AbstractC7641.m12897(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb3
            java.lang.Object r2 = p161.AbstractC7646.f20754
            monitor-enter(r2)
            java.util.WeakHashMap r0 = p161.AbstractC7646.f20755     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb1
        La1:
            飘花落叶言子哲楪世兰苏.飘花落叶言子楪苏世兰哲 r0 = new 飘花落叶言子哲楪世兰苏.飘花落叶言子楪苏世兰哲     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.f20769     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            goto Lb7
        Lb1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb3:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r9, r8)
        Lb7:
            return r4
        Lb8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p162.AbstractC7653.m12919(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m12920(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new C7657(context).f20786.areNotificationsEnabled() ? 0 : -1;
        }
        C2633.m5343("permission must be non-null");
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if (androidx.core.content.AbstractC2167.m3948(r8, r8) == 0) goto L40;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent m12921(android.content.Context r8, android.content.BroadcastReceiver r9, android.content.IntentFilter r10, java.lang.String r11, android.os.Handler r12, int r13) {
        /*
            r0 = r13 & 1
            r1 = 0
            if (r0 == 0) goto L10
            r2 = r13 & 4
            if (r2 != 0) goto La
            goto L10
        La:
            java.lang.String r8 = "Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED"
            top.suzhelan.qstory.hook.item.C5925.m11310(r8)
            return r1
        L10:
            if (r0 == 0) goto L14
            r13 = r13 | 2
        L14:
            r7 = r13
            r13 = r7 & 2
            if (r13 != 0) goto L24
            r0 = r7 & 4
            if (r0 == 0) goto L1e
            goto L24
        L1e:
            java.lang.String r8 = "One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required"
            top.suzhelan.qstory.hook.item.C5925.m11310(r8)
            return r1
        L24:
            if (r13 == 0) goto L31
            r13 = r7 & 4
            if (r13 != 0) goto L2b
            goto L31
        L2b:
            java.lang.String r8 = "Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED"
            top.suzhelan.qstory.hook.item.C5925.m11310(r8)
            return r1
        L31:
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r13 < r0) goto L41
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            android.content.Intent r8 = r2.registerReceiver(r3, r4, r5, r6, r7)
            return r8
        L41:
            r0 = r8
            r3 = r9
            r2 = r10
            r5 = r11
            r4 = r12
            r8 = r7 & 4
            if (r8 == 0) goto L9a
            if (r5 != 0) goto L9a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.content.Context r9 = r0.getApplicationContext()
            java.lang.String r9 = r9.getPackageName()
            r8.append(r9)
            java.lang.String r9 = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            int r10 = androidx.core.content.AbstractC2167.m3948(r0, r8)
            if (r10 == 0) goto L95
            r10 = 29
            if (r13 < r10) goto L89
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = androidx.compose.ui.graphics.layer.AbstractC1512.m2765(r0)
            r8.append(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            int r9 = androidx.core.content.AbstractC2167.m3948(r0, r8)
            if (r9 != 0) goto L89
            goto L95
        L89:
            java.lang.String r9 = "Permission "
            java.lang.String r10 = " is required by your application to receive broadcasts, please add it to your manifest"
            java.lang.String r8 = androidx.activity.AbstractC0053.m158(r9, r8, r10)
            bsh.C2633.m5339(r8)
            return r1
        L95:
            android.content.Intent r8 = r0.registerReceiver(r3, r2, r8, r4)
            return r8
        L9a:
            r8 = r7 & 1
            r1 = r3
            r3 = r5
            r5 = r8
            android.content.Intent r8 = r0.registerReceiver(r1, r2, r3, r4, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p162.AbstractC7653.m12921(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter, java.lang.String, android.os.Handler, int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0046 A[EXC_TOP_SPLITTER, PHI: r1
  0x0046: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:29:0x0053, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m12922(android.content.Context r8) {
        /*
            java.lang.Object r0 = p162.AbstractC7653.f20771
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L6a
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            r6 = 1
            if (r5 == r6) goto L44
            r6 = 3
            if (r5 != r6) goto L2b
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r7 <= r4) goto L44
            goto L2b
        L29:
            r8 = move-exception
            goto L64
        L2b:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 != r6) goto L31
            goto L18
        L31:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L44:
            if (r2 == 0) goto L56
        L46:
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L56
            goto L56
        L4a:
            r8 = move-exception
            goto L6c
        L4c:
            java.lang.String r3 = "AppLocalesStorageHelper"
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L56
            goto L46
        L56:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L5d
            goto L62
        L5d:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L4a
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L64:
            if (r2 == 0) goto L69
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L69
        L69:
            throw r8     // Catch: java.lang.Throwable -> L4a
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L6c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p162.AbstractC7653.m12922(android.content.Context):java.lang.String");
    }
}
