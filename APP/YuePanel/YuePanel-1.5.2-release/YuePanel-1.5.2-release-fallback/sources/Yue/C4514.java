package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4514 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f14396 = "NotificationCompat";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f14397 = "android.support.dataRemoteInputs";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f14398 = "android.support.allowGeneratedReplies";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f14399 = "icon";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f14400 = "title";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f14401 = "actionIntent";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f14402 = "extras";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f14403 = "remoteInputs";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f14404 = "dataOnlyRemoteInputs";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.lang.String f14405 = "resultKey";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final java.lang.String f14406 = "label";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final java.lang.String f14407 = "choices";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final java.lang.String f14408 = "allowFreeFormInput";

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final java.lang.String f14409 = "allowedDataTypes";

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f14410 = "semanticAction";

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final java.lang.String f14411 = "showsUserInterface";

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final java.lang.Object f14412 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static java.lang.reflect.Field f14413;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static boolean f14414;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final java.lang.Object f14415 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static java.lang.reflect.Field f14416;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static java.lang.reflect.Field f14417;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static java.lang.reflect.Field f14418;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static java.lang.reflect.Field f14419;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static boolean f14420;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            Yue.C4514.f14412 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            Yue.C4514.f14415 = r0
            return
    }

    public C4514() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.util.SparseArray<android.os.Bundle> m17913(java.util.List<android.os.Bundle> r4) {
            int r0 = r4.size()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L1d
            java.lang.Object r3 = r4.get(r2)
            android.os.Bundle r3 = (android.os.Bundle) r3
            if (r3 == 0) goto L1a
            if (r1 != 0) goto L17
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
        L17:
            r1.put(r2, r3)
        L1a:
            int r2 = r2 + 1
            goto L6
        L1d:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static boolean m17914() {
            java.lang.String r0 = "Unable to access notification actions"
            java.lang.String r1 = "NotificationCompat"
            boolean r2 = Yue.C4514.f14420
            if (r2 == 0) goto La
            r0 = 0
            return r0
        La:
            r2 = 1
            java.lang.reflect.Field r3 = Yue.C4514.f14416     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3d
            if (r3 != 0) goto L4a
            java.lang.String r3 = "android.app.Notification$Action"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3d
            java.lang.String r4 = "icon"
            java.lang.reflect.Field r4 = r3.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3d
            Yue.C4514.f14417 = r4     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3d
            java.lang.String r4 = "title"
            java.lang.reflect.Field r4 = r3.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3d
            Yue.C4514.f14418 = r4     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3d
            java.lang.String r4 = "actionIntent"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3d
            Yue.C4514.f14419 = r3     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3d
            java.lang.Class<android.app.Notification> r3 = android.app.Notification.class
            java.lang.String r4 = "actions"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3d
            Yue.C4514.f14416 = r3     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3d
            r3.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3d
            goto L4a
        L3b:
            r3 = move-exception
            goto L3f
        L3d:
            r3 = move-exception
            goto L45
        L3f:
            android.util.Log.e(r1, r0, r3)
            Yue.C4514.f14420 = r2
            goto L4a
        L45:
            android.util.Log.e(r1, r0, r3)
            Yue.C4514.f14420 = r2
        L4a:
            boolean r0 = Yue.C4514.f14420
            r0 = r0 ^ r2
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.C5300 m17915(android.os.Bundle r9) {
            java.lang.String r0 = "allowedDataTypes"
            java.util.ArrayList r0 = r9.getStringArrayList(r0)
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            if (r0 == 0) goto L21
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r8.add(r1)
            goto L11
        L21:
            Yue.ۥۡۦۣۨ r0 = new Yue.ۥۡۦۣۨ
            java.lang.String r1 = "resultKey"
            java.lang.String r2 = r9.getString(r1)
            java.lang.String r1 = "label"
            java.lang.CharSequence r3 = r9.getCharSequence(r1)
            java.lang.String r1 = "choices"
            java.lang.CharSequence[] r4 = r9.getCharSequenceArray(r1)
            java.lang.String r1 = "allowFreeFormInput"
            boolean r5 = r9.getBoolean(r1)
            java.lang.String r1 = "extras"
            android.os.Bundle r7 = r9.getBundle(r1)
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.C5300[] m17916(android.os.Bundle[] r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            Yue.ۥۡۦۣۨ[] r0 = new Yue.C5300[r0]
            r1 = 0
        L8:
            int r2 = r3.length
            if (r1 >= r2) goto L16
            r2 = r3[r1]
            Yue.ۥۡۦۣۨ r2 = m17915(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L16:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Yue.C4434.C4436 m17917(android.app.Notification r5, int r6) {
            java.lang.Object r0 = Yue.C4514.f14415
            monitor-enter(r0)
            r1 = 0
            java.lang.Object[] r2 = m17920(r5)     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L23
            if (r2 == 0) goto L4c
            r2 = r2[r6]     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L23
            android.os.Bundle r5 = m17923(r5)     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L23
            if (r5 == 0) goto L25
            java.lang.String r3 = "android.support.actionExtras"
            android.util.SparseArray r5 = r5.getSparseParcelableArray(r3)     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L23
            if (r5 == 0) goto L25
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L23
            android.os.Bundle r5 = (android.os.Bundle) r5     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L23
            goto L26
        L21:
            r5 = move-exception
            goto L4e
        L23:
            r5 = move-exception
            goto L42
        L25:
            r5 = r1
        L26:
            java.lang.reflect.Field r6 = Yue.C4514.f14417     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L23
            int r6 = r6.getInt(r2)     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L23
            java.lang.reflect.Field r3 = Yue.C4514.f14418     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L23
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L23
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L23
            java.lang.reflect.Field r4 = Yue.C4514.f14419     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L23
            java.lang.Object r2 = r4.get(r2)     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L23
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L23
            Yue.ۥۡۢۦ$ۥ۟ r5 = m17924(r6, r3, r2, r5)     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return r5
        L42:
            java.lang.String r6 = "NotificationCompat"
            java.lang.String r2 = "Unable to access notification actions"
            android.util.Log.e(r6, r2, r5)     // Catch: java.lang.Throwable -> L21
            r5 = 1
            Yue.C4514.f14420 = r5     // Catch: java.lang.Throwable -> L21
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return r1
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int m17918(android.app.Notification r1) {
            java.lang.Object r0 = Yue.C4514.f14415
            monitor-enter(r0)
            java.lang.Object[] r1 = m17920(r1)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            int r1 = r1.length     // Catch: java.lang.Throwable -> Lb
            goto Le
        Lb:
            r1 = move-exception
            goto L10
        Ld:
            r1 = 0
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Yue.C4434.C4436 m17919(android.os.Bundle r15) {
            java.lang.String r0 = "extras"
            android.os.Bundle r1 = r15.getBundle(r0)
            r2 = 0
            if (r1 == 0) goto Lf
            java.lang.String r3 = "android.support.allowGeneratedReplies"
            boolean r2 = r1.getBoolean(r3, r2)
        Lf:
            r10 = r2
            Yue.ۥۡۢۦ$ۥ۟ r1 = new Yue.ۥۡۢۦ$ۥ۟
            java.lang.String r2 = "icon"
            int r4 = r15.getInt(r2)
            java.lang.String r2 = "title"
            java.lang.CharSequence r5 = r15.getCharSequence(r2)
            java.lang.String r2 = "actionIntent"
            android.os.Parcelable r2 = r15.getParcelable(r2)
            r6 = r2
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            android.os.Bundle r7 = r15.getBundle(r0)
            java.lang.String r0 = "remoteInputs"
            android.os.Bundle[] r0 = m17921(r15, r0)
            Yue.ۥۡۦۣۨ[] r8 = m17916(r0)
            java.lang.String r0 = "dataOnlyRemoteInputs"
            android.os.Bundle[] r0 = m17921(r15, r0)
            Yue.ۥۡۦۣۨ[] r9 = m17916(r0)
            java.lang.String r0 = "semanticAction"
            int r11 = r15.getInt(r0)
            java.lang.String r0 = "showsUserInterface"
            boolean r12 = r15.getBoolean(r0)
            r13 = 0
            r14 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static java.lang.Object[] m17920(android.app.Notification r4) {
            java.lang.Object r0 = Yue.C4514.f14415
            monitor-enter(r0)
            boolean r1 = m17914()     // Catch: java.lang.Throwable -> Lc
            r2 = 0
            if (r1 != 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r2
        Lc:
            r4 = move-exception
            goto L25
        Le:
            java.lang.reflect.Field r1 = Yue.C4514.f14416     // Catch: java.lang.Throwable -> Lc java.lang.IllegalAccessException -> L18
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> Lc java.lang.IllegalAccessException -> L18
            java.lang.Object[] r4 = (java.lang.Object[]) r4     // Catch: java.lang.Throwable -> Lc java.lang.IllegalAccessException -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r4
        L18:
            r4 = move-exception
            java.lang.String r1 = "NotificationCompat"
            java.lang.String r3 = "Unable to access notification actions"
            android.util.Log.e(r1, r3, r4)     // Catch: java.lang.Throwable -> Lc
            r4 = 1
            Yue.C4514.f14420 = r4     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r2
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r4
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static android.os.Bundle[] m17921(android.os.Bundle r3, java.lang.String r4) {
            android.os.Parcelable[] r0 = r3.getParcelableArray(r4)
            boolean r1 = r0 instanceof android.os.Bundle[]
            if (r1 != 0) goto L18
            if (r0 != 0) goto Lb
            goto L18
        Lb:
            int r1 = r0.length
            java.lang.Class<android.os.Bundle[]> r2 = android.os.Bundle[].class
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1, r2)
            android.os.Bundle[] r0 = (android.os.Bundle[]) r0
            r3.putParcelableArray(r4, r0)
            return r0
        L18:
            android.os.Bundle[] r0 = (android.os.Bundle[]) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static android.os.Bundle m17922(Yue.C4434.C4436 r4) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.core.graphics.drawable.IconCompat r1 = r4.m17454()
            if (r1 == 0) goto L10
            int r1 = r1.m28852()
            goto L11
        L10:
            r1 = 0
        L11:
            java.lang.String r2 = "icon"
            r0.putInt(r2, r1)
            java.lang.String r1 = "title"
            java.lang.CharSequence r2 = r4.m17458()
            r0.putCharSequence(r1, r2)
            java.lang.String r1 = "actionIntent"
            android.app.PendingIntent r2 = r4.m17449()
            r0.putParcelable(r1, r2)
            android.os.Bundle r1 = r4.m17452()
            if (r1 == 0) goto L38
            android.os.Bundle r1 = new android.os.Bundle
            android.os.Bundle r2 = r4.m17452()
            r1.<init>(r2)
            goto L3d
        L38:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
        L3d:
            java.lang.String r2 = "android.support.allowGeneratedReplies"
            boolean r3 = r4.m17450()
            r1.putBoolean(r2, r3)
            java.lang.String r2 = "extras"
            r0.putBundle(r2, r1)
            Yue.ۥۡۦۣۨ[] r1 = r4.m17455()
            android.os.Bundle[] r1 = m17926(r1)
            java.lang.String r2 = "remoteInputs"
            r0.putParcelableArray(r2, r1)
            java.lang.String r1 = "showsUserInterface"
            boolean r2 = r4.m17457()
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "semanticAction"
            int r4 = r4.m17456()
            r0.putInt(r1, r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static android.os.Bundle m17923(android.app.Notification r6) {
            java.lang.Object r0 = Yue.C4514.f14412
            monitor-enter(r0)
            boolean r1 = Yue.C4514.f14414     // Catch: java.lang.Throwable -> La
            r2 = 0
            if (r1 == 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        La:
            r6 = move-exception
            goto L62
        Lc:
            r1 = 1
            java.lang.reflect.Field r3 = Yue.C4514.f14413     // Catch: java.lang.Throwable -> La java.lang.NoSuchFieldException -> L30 java.lang.IllegalAccessException -> L32
            if (r3 != 0) goto L39
            java.lang.Class<android.app.Notification> r3 = android.app.Notification.class
            java.lang.String r4 = "extras"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> La java.lang.NoSuchFieldException -> L30 java.lang.IllegalAccessException -> L32
            java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
            java.lang.Class r5 = r3.getType()     // Catch: java.lang.Throwable -> La java.lang.NoSuchFieldException -> L30 java.lang.IllegalAccessException -> L32
            boolean r4 = r4.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> La java.lang.NoSuchFieldException -> L30 java.lang.IllegalAccessException -> L32
            if (r4 != 0) goto L34
            java.lang.String r6 = "NotificationCompat"
            java.lang.String r3 = "Notification.extras field is not of type Bundle"
            android.util.Log.e(r6, r3)     // Catch: java.lang.Throwable -> La java.lang.NoSuchFieldException -> L30 java.lang.IllegalAccessException -> L32
            Yue.C4514.f14414 = r1     // Catch: java.lang.Throwable -> La java.lang.NoSuchFieldException -> L30 java.lang.IllegalAccessException -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        L30:
            r6 = move-exception
            goto L4f
        L32:
            r6 = move-exception
            goto L57
        L34:
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> La java.lang.NoSuchFieldException -> L30 java.lang.IllegalAccessException -> L32
            Yue.C4514.f14413 = r3     // Catch: java.lang.Throwable -> La java.lang.NoSuchFieldException -> L30 java.lang.IllegalAccessException -> L32
        L39:
            java.lang.reflect.Field r3 = Yue.C4514.f14413     // Catch: java.lang.Throwable -> La java.lang.NoSuchFieldException -> L30 java.lang.IllegalAccessException -> L32
            java.lang.Object r3 = r3.get(r6)     // Catch: java.lang.Throwable -> La java.lang.NoSuchFieldException -> L30 java.lang.IllegalAccessException -> L32
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Throwable -> La java.lang.NoSuchFieldException -> L30 java.lang.IllegalAccessException -> L32
            if (r3 != 0) goto L4d
            android.os.Bundle r3 = new android.os.Bundle     // Catch: java.lang.Throwable -> La java.lang.NoSuchFieldException -> L30 java.lang.IllegalAccessException -> L32
            r3.<init>()     // Catch: java.lang.Throwable -> La java.lang.NoSuchFieldException -> L30 java.lang.IllegalAccessException -> L32
            java.lang.reflect.Field r4 = Yue.C4514.f14413     // Catch: java.lang.Throwable -> La java.lang.NoSuchFieldException -> L30 java.lang.IllegalAccessException -> L32
            r4.set(r6, r3)     // Catch: java.lang.Throwable -> La java.lang.NoSuchFieldException -> L30 java.lang.IllegalAccessException -> L32
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r3
        L4f:
            java.lang.String r3 = "NotificationCompat"
            java.lang.String r4 = "Unable to access notification extras"
            android.util.Log.e(r3, r4, r6)     // Catch: java.lang.Throwable -> La
            goto L5e
        L57:
            java.lang.String r3 = "NotificationCompat"
            java.lang.String r4 = "Unable to access notification extras"
            android.util.Log.e(r3, r4, r6)     // Catch: java.lang.Throwable -> La
        L5e:
            Yue.C4514.f14414 = r1     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static Yue.C4434.C4436 m17924(int r13, java.lang.CharSequence r14, android.app.PendingIntent r15, android.os.Bundle r16) {
            r4 = r16
            if (r4 == 0) goto L22
            java.lang.String r0 = "android.support.remoteInputs"
            android.os.Bundle[] r0 = m17921(r4, r0)
            Yue.ۥۡۦۣۨ[] r0 = m17916(r0)
            java.lang.String r1 = "android.support.dataRemoteInputs"
            android.os.Bundle[] r1 = m17921(r4, r1)
            Yue.ۥۡۦۣۨ[] r1 = m17916(r1)
            java.lang.String r2 = "android.support.allowGeneratedReplies"
            boolean r2 = r4.getBoolean(r2)
            r5 = r0
            r6 = r1
            r7 = r2
            goto L27
        L22:
            r0 = 0
            r1 = 0
            r5 = r0
            r6 = r5
            r7 = r1
        L27:
            Yue.ۥۡۢۦ$ۥ۟ r12 = new Yue.ۥۡۢۦ$ۥ۟
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 1
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static android.os.Bundle m17925(Yue.C5300 r3) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = r3.m20046()
            java.lang.String r2 = "resultKey"
            r0.putString(r2, r1)
            java.lang.String r1 = "label"
            java.lang.CharSequence r2 = r3.m20045()
            r0.putCharSequence(r1, r2)
            java.lang.String r1 = "choices"
            java.lang.CharSequence[] r2 = r3.m20042()
            r0.putCharSequenceArray(r1, r2)
            java.lang.String r1 = "allowFreeFormInput"
            boolean r2 = r3.m20040()
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "extras"
            android.os.Bundle r2 = r3.m20044()
            r0.putBundle(r1, r2)
            java.util.Set r3 = r3.m20041()
            if (r3 == 0) goto L60
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L60
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r3.size()
            r1.<init>(r2)
            java.util.Iterator r3 = r3.iterator()
        L4b:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            r1.add(r2)
            goto L4b
        L5b:
            java.lang.String r3 = "allowedDataTypes"
            r0.putStringArrayList(r3, r1)
        L60:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static android.os.Bundle[] m17926(Yue.C5300[] r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            android.os.Bundle[] r0 = new android.os.Bundle[r0]
            r1 = 0
        L8:
            int r2 = r3.length
            if (r1 >= r2) goto L16
            r2 = r3[r1]
            android.os.Bundle r2 = m17925(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L16:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static android.os.Bundle m17927(android.app.Notification.Builder r3, Yue.C4434.C4436 r4) {
            androidx.core.graphics.drawable.IconCompat r0 = r4.m17454()
            if (r0 == 0) goto Lb
            int r0 = r0.m28852()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.CharSequence r1 = r4.m17458()
            android.app.PendingIntent r2 = r4.m17449()
            r3.addAction(r0, r1, r2)
            android.os.Bundle r3 = new android.os.Bundle
            android.os.Bundle r0 = r4.m17452()
            r3.<init>(r0)
            Yue.ۥۡۦۣۨ[] r0 = r4.m17455()
            if (r0 == 0) goto L33
            Yue.ۥۡۦۣۨ[] r0 = r4.m17455()
            android.os.Bundle[] r0 = m17926(r0)
            java.lang.String r1 = "android.support.remoteInputs"
            r3.putParcelableArray(r1, r0)
        L33:
            Yue.ۥۡۦۣۨ[] r0 = r4.m17451()
            if (r0 == 0) goto L46
            Yue.ۥۡۦۣۨ[] r0 = r4.m17451()
            android.os.Bundle[] r0 = m17926(r0)
            java.lang.String r1 = "android.support.dataRemoteInputs"
            r3.putParcelableArray(r1, r0)
        L46:
            java.lang.String r0 = "android.support.allowGeneratedReplies"
            boolean r4 = r4.m17450()
            r3.putBoolean(r0, r4)
            return r3
    }
}
