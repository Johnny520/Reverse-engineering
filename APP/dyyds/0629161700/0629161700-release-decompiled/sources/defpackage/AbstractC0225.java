package defpackage;

/* JADX INFO: renamed from: 釠贬矆岵佱洿, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0225 {

    /* JADX INFO: renamed from: 釠丰瞾釠翅洺, reason: contains not printable characters */
    public static final /* synthetic */ int[] f1384 = null;

    static {
            r0 = 14
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14} // fill-array
            defpackage.AbstractC0225.f1384 = r0
            return
    }

    /* JADX INFO: renamed from: 釠贬洺釠册浉, reason: contains not printable characters */
    public static java.lang.Float m808(java.lang.Float r0, com.tencent.mmkv.MMKV r1, java.lang.String r2) {
            float r0 = r0.floatValue()
            float r0 = r1.getFloat(r2, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    /* JADX INFO: renamed from: 釠册洸釠? reason: contains not printable characters */
    public static java.lang.String m809(android.widget.EditText r0) {
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = defpackage.AbstractC1347.m2521(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: 釠册洿釠贬浂, reason: contains not printable characters */
    public static java.lang.String m810(java.lang.Class r0, java.lang.StringBuilder r1) {
            釠册瞼岵堘洺 r0 = defpackage.AbstractC1168.m2249(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    /* JADX INFO: renamed from: 釠册洿岵囜洺, reason: contains not printable characters */
    public static java.lang.Integer m811(java.lang.Integer r0, com.tencent.mmkv.MMKV r1, java.lang.String r2) {
            int r0 = r0.intValue()
            int r0 = r1.getInt(r2, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    /* JADX INFO: renamed from: 釠册矆釠丰浀, reason: contains not printable characters */
    public static /* synthetic */ int m812(int r0) {
            if (r0 == 0) goto L5
            int r0 = r0 + (-1)
            return r0
        L5:
            r0 = 0
            throw r0
    }

    /* JADX INFO: renamed from: 釠夺浄釠贬瞼, reason: contains not printable characters */
    public static java.lang.String m817(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: 釠丰洸岵囜矆, reason: contains not printable characters */
    public static int m818(long r0, java.lang.String r2, long r3) {
            int r0 = r2.length()
            return r0
    }

    /* JADX INFO: renamed from: 釠丰浄岵€釠? reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m819(int r0) {
            switch(r0) {
                case 1: goto L15;
                case 2: goto L12;
                case 3: goto Lf;
                case 4: goto Lc;
                case 5: goto L9;
                case 6: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "null"
            return r0
        L6:
            java.lang.String r0 = "FINISHED"
            return r0
        L9:
            java.lang.String r0 = "ENCODE"
            return r0
        Lc:
            java.lang.String r0 = "SOURCE"
            return r0
        Lf:
            java.lang.String r0 = "DATA_CACHE"
            return r0
        L12:
            java.lang.String r0 = "RESOURCE_CACHE"
            return r0
        L15:
            java.lang.String r0 = "INITIALIZE"
            return r0
    }

    /* JADX INFO: renamed from: 釠丰浉釠滇矅, reason: contains not printable characters */
    public static int m820(int r0, int r1, int r2) {
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * r2
            return r0
    }

    /* JADX INFO: renamed from: 釠丰瞾釠翅洺, reason: contains not printable characters */
    public static java.lang.String m821(java.lang.String r5, char r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.length()
            r2 = 0
        La:
            if (r2 >= r1) goto L25
            char r3 = r5.charAt(r2)
            boolean r4 = java.lang.Character.isUpperCase(r3)
            if (r4 == 0) goto L1f
            int r4 = r0.length()
            if (r4 == 0) goto L1f
            r0.append(r6)
        L1f:
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L25:
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: 釠羔浀釠羔浄, reason: contains not printable characters */
    public static java.lang.Long m822(java.lang.Long r2, com.tencent.mmkv.MMKV r3, java.lang.String r4) {
            long r0 = r2.longValue()
            long r2 = r3.getLong(r4, r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            return r2
    }

    /* JADX INFO: renamed from: 岵€釠翅瞼釠? reason: contains not printable characters */
    public static java.lang.String m823(java.lang.StringBuilder r0, java.lang.String r1, char r2) {
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: 岵€岵€釠瘁洺, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m824(int r0) {
            switch(r0) {
                case 1: goto L21;
                case 2: goto L1e;
                case 3: goto L1b;
                case 4: goto L18;
                case 5: goto L15;
                case 6: goto L12;
                case 7: goto Lf;
                case 8: goto Lc;
                case 9: goto L9;
                case 10: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "null"
            return r0
        L6:
            java.lang.String r0 = "END_DOCUMENT"
            return r0
        L9:
            java.lang.String r0 = "NULL"
            return r0
        Lc:
            java.lang.String r0 = "BOOLEAN"
            return r0
        Lf:
            java.lang.String r0 = "NUMBER"
            return r0
        L12:
            java.lang.String r0 = "STRING"
            return r0
        L15:
            java.lang.String r0 = "NAME"
            return r0
        L18:
            java.lang.String r0 = "END_OBJECT"
            return r0
        L1b:
            java.lang.String r0 = "BEGIN_OBJECT"
            return r0
        L1e:
            java.lang.String r0 = "END_ARRAY"
            return r0
        L21:
            java.lang.String r0 = "BEGIN_ARRAY"
            return r0
    }

    /* JADX INFO: renamed from: 岵佱洿釠滇洸, reason: contains not printable characters */
    public static /* synthetic */ int[] m825(int r3) {
            int[] r0 = new int[r3]
            int[] r1 = defpackage.AbstractC0225.f1384
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r0, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: 岵佱矆岵囜瞾, reason: contains not printable characters */
    public static /* synthetic */ void m826(defpackage.InterfaceC0270 r5) {
            boolean r0 = r5 instanceof java.lang.AutoCloseable
            if (r0 == 0) goto L8
            r5.close()
            return
        L8:
            boolean r0 = r5 instanceof java.util.concurrent.ExecutorService
            if (r0 == 0) goto L3b
            java.util.concurrent.ExecutorService r5 = (java.util.concurrent.ExecutorService) r5
            java.util.concurrent.ForkJoinPool r0 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r5 != r0) goto L15
            goto L3a
        L15:
            boolean r0 = r5.isTerminated()
            if (r0 != 0) goto L3a
            r5.shutdown()
            r1 = 0
        L1f:
            if (r0 != 0) goto L31
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L2a
            r3 = 1
            boolean r0 = r5.awaitTermination(r3, r2)     // Catch: java.lang.InterruptedException -> L2a
            goto L1f
        L2a:
            if (r1 != 0) goto L1f
            r5.shutdownNow()
            r1 = 1
            goto L1f
        L31:
            if (r1 == 0) goto L3a
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L3a:
            return
        L3b:
            boolean r0 = r5 instanceof android.content.res.TypedArray
            if (r0 == 0) goto L45
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r5.recycle()
            return
        L45:
            defpackage.C0086.m557()
            return
    }

    /* JADX INFO: renamed from: 岵囜洷釠羔矅, reason: contains not printable characters */
    public static void m827(java.lang.String r1, java.lang.String r2, java.util.LinkedHashSet r3) {
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r2)
            r3.add(r0)
            return
    }

    /* JADX INFO: renamed from: 岵囜浂釠滇矅, reason: contains not printable characters */
    public static java.lang.String m828(java.lang.String r5) {
            int r0 = r5.length()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L50
            char r3 = r5.charAt(r2)
            boolean r4 = java.lang.Character.isLetter(r3)
            if (r4 == 0) goto L4d
            boolean r0 = java.lang.Character.isUpperCase(r3)
            if (r0 == 0) goto L19
            goto L50
        L19:
            char r0 = java.lang.Character.toUpperCase(r3)
            r3 = 1
            if (r2 != 0) goto L34
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r5 = r5.substring(r3)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        L34:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = r5.substring(r1, r2)
            r4.<init>(r1)
            r4.append(r0)
            int r2 = r2 + r3
            java.lang.String r5 = r5.substring(r2)
            r4.append(r5)
            java.lang.String r5 = r4.toString()
            return r5
        L4d:
            int r2 = r2 + 1
            goto L6
        L50:
            return r5
    }

    /* JADX INFO: renamed from: 岵囜浉岵佱洷, reason: contains not printable characters */
    public static com.tencent.mmkv.MMKV m829(long r0, long r2) {
            com.tencent.mmkv.MMKV r0 = defpackage.AbstractC0902.m1871()
            return r0
    }

    /* JADX INFO: renamed from: 岵囜瞼釠册洷, reason: contains not printable characters */
    public static java.lang.String m830(java.lang.Object[] r0, int r1, java.lang.String r2, long r3) {
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = java.lang.String.format(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: 岵堘矆釠羔瞾, reason: contains not printable characters */
    public static java.lang.Boolean m831(java.lang.Boolean r0, com.tencent.mmkv.MMKV r1, java.lang.String r2) {
            boolean r0 = r0.booleanValue()
            boolean r0 = r1.getBoolean(r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }
}
