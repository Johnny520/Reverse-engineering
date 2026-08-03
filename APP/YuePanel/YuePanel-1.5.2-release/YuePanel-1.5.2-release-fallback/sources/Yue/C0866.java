package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0866 {

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۤ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(33)
    public static class C0867 {
        public C0867() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static <T> T m4993(@Yue.InterfaceC4410 android.os.Bundle r0, @Yue.InterfaceC4544 java.lang.String r1, @Yue.InterfaceC4410 java.lang.Class<T> r2) {
                java.lang.Object r0 = r0.getParcelable(r1, r2)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static <T> T[] m4994(@Yue.InterfaceC4410 android.os.Bundle r0, @Yue.InterfaceC4544 java.lang.String r1, @Yue.InterfaceC4410 java.lang.Class<T> r2) {
                java.lang.Object[] r0 = r0.getParcelableArray(r1, r2)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static <T> java.util.ArrayList<T> m4995(@Yue.InterfaceC4410 android.os.Bundle r0, @Yue.InterfaceC4544 java.lang.String r1, @Yue.InterfaceC4410 java.lang.Class<? extends T> r2) {
                java.util.ArrayList r0 = r0.getParcelableArrayList(r1, r2)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static <T extends java.io.Serializable> T m4996(@Yue.InterfaceC4410 android.os.Bundle r0, @Yue.InterfaceC4544 java.lang.String r1, @Yue.InterfaceC4410 java.lang.Class<T> r2) {
                java.io.Serializable r0 = r0.getSerializable(r1, r2)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static <T> android.util.SparseArray<T> m4997(@Yue.InterfaceC4410 android.os.Bundle r0, @Yue.InterfaceC4544 java.lang.String r1, @Yue.InterfaceC4410 java.lang.Class<? extends T> r2) {
                android.util.SparseArray r0 = r0.getSparseParcelableArray(r1, r2)
                return r0
        }
    }

    public C0866() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4544
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.os.IBinder m4986(@Yue.InterfaceC4410 android.os.Bundle r0, @Yue.InterfaceC4544 java.lang.String r1) {
            android.os.IBinder r0 = r0.getBinder(r1)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static <T> T m4987(@Yue.InterfaceC4410 android.os.Bundle r2, @Yue.InterfaceC4544 java.lang.String r3, @Yue.InterfaceC4410 java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.lang.Object r2 = Yue.C0866.C0867.m4993(r2, r3, r4)
            return r2
        Lb:
            android.os.Parcelable r2 = r2.getParcelable(r3)
            boolean r3 = r4.isInstance(r2)
            if (r3 == 0) goto L16
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    @Yue.InterfaceC4544
    @android.annotation.SuppressLint({"ArrayReturn", "NullableCollection"})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static android.os.Parcelable[] m4988(@Yue.InterfaceC4410 android.os.Bundle r2, @Yue.InterfaceC4544 java.lang.String r3, @Yue.InterfaceC4410 java.lang.Class<? extends android.os.Parcelable> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Ld
            java.lang.Object[] r2 = Yue.C0866.C0867.m4994(r2, r3, r4)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            return r2
        Ld:
            android.os.Parcelable[] r2 = r2.getParcelableArray(r3)
            return r2
    }

    @Yue.InterfaceC4544
    @android.annotation.SuppressLint({"ConcreteCollection", "NullableCollection"})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static <T> java.util.ArrayList<T> m4989(@Yue.InterfaceC4410 android.os.Bundle r2, @Yue.InterfaceC4544 java.lang.String r3, @Yue.InterfaceC4410 java.lang.Class<? extends T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.util.ArrayList r2 = Yue.C0866.C0867.m4995(r2, r3, r4)
            return r2
        Lb:
            java.util.ArrayList r2 = r2.getParcelableArrayList(r3)
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static <T extends java.io.Serializable> T m4990(@Yue.InterfaceC4410 android.os.Bundle r2, @Yue.InterfaceC4544 java.lang.String r3, @Yue.InterfaceC4410 java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.io.Serializable r2 = Yue.C0866.C0867.m4996(r2, r3, r4)
            return r2
        Lb:
            java.io.Serializable r2 = r2.getSerializable(r3)
            boolean r3 = r4.isInstance(r2)
            if (r3 == 0) goto L16
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static <T> android.util.SparseArray<T> m4991(@Yue.InterfaceC4410 android.os.Bundle r2, @Yue.InterfaceC4544 java.lang.String r3, @Yue.InterfaceC4410 java.lang.Class<? extends T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            android.util.SparseArray r2 = Yue.C0866.C0867.m4997(r2, r3, r4)
            return r2
        Lb:
            android.util.SparseArray r2 = r2.getSparseParcelableArray(r3)
            return r2
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m4992(@Yue.InterfaceC4410 android.os.Bundle r0, @Yue.InterfaceC4544 java.lang.String r1, @Yue.InterfaceC4544 android.os.IBinder r2) {
            r0.putBinder(r1, r2)
            return
    }
}
