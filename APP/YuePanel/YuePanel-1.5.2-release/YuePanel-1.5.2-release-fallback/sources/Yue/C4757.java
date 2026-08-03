package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nPersistableBundle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,155:1\n13579#2,2:156\n*S KotlinDebug\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n*L\n35#1:156,2\n*E\n"})
public final class C4757 {
    @Yue.InterfaceC4418
    @Yue.InterfaceC5336(21)
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final android.os.PersistableBundle m18952() {
            r0 = 0
            android.os.PersistableBundle r0 = Yue.C4755.m18948(r0)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5336(21)
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final android.os.PersistableBundle m18953(@Yue.InterfaceC4418 Yue.C4677<java.lang.String, ? extends java.lang.Object>... r5) {
            int r0 = r5.length
            android.os.PersistableBundle r0 = Yue.C4755.m18948(r0)
            int r1 = r5.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L1b
            r3 = r5[r2]
            java.lang.Object r4 = r3.m18537()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.m18538()
            Yue.C4755.m18949(r0, r4, r3)
            int r2 = r2 + 1
            goto L7
        L1b:
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5336(21)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final android.os.PersistableBundle m18954(@Yue.InterfaceC4418 java.util.Map<java.lang.String, ? extends java.lang.Object> r3) {
            int r0 = r3.size()
            android.os.PersistableBundle r0 = Yue.C4755.m18948(r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            Yue.C4755.m18949(r0, r2, r1)
            goto L10
        L2a:
            return r0
    }
}
