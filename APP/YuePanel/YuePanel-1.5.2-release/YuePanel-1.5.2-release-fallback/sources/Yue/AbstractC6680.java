package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public abstract class AbstractC6680 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f23342 = "VersionedParcel";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f23343 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f23344 = -2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f23345 = -3;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f23346 = -4;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f23347 = -5;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f23348 = -6;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f23349 = -7;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f23350 = -9;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f23351 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f23352 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f23353 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f23354 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f23355 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f23356 = 7;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f23357 = 8;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.C0573<java.lang.String, java.lang.reflect.Method> f23358;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.C0573<java.lang.String, java.lang.reflect.Method> f23359;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.C0573<java.lang.String, java.lang.Class> f23360;

    /* JADX INFO: renamed from: Yue.ۥۣۢۦۡ$ۥ, reason: contains not printable characters */
    public class C6681 extends java.io.ObjectInputStream {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC6680 f23361;

        public C6681(Yue.AbstractC6680 r1, java.io.InputStream r2) {
                r0 = this;
                r0.f23361 = r1
                r0.<init>(r2)
                return
        }

        @Override // java.io.ObjectInputStream
        public java.lang.Class<?> resolveClass(java.io.ObjectStreamClass r4) throws java.io.IOException, java.lang.ClassNotFoundException {
                r3 = this;
                java.lang.String r0 = r4.getName()
                java.lang.Class r1 = r3.getClass()
                java.lang.ClassLoader r1 = r1.getClassLoader()
                r2 = 0
                java.lang.Class r0 = java.lang.Class.forName(r0, r2, r1)
                if (r0 == 0) goto L14
                return r0
            L14:
                java.lang.Class r4 = super.resolveClass(r4)
                return r4
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۦۡ$ۥ۟, reason: contains not printable characters */
    public static class C6682 extends java.lang.RuntimeException {
        public C6682(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public AbstractC6680(Yue.C0573<java.lang.String, java.lang.reflect.Method> r1, Yue.C0573<java.lang.String, java.lang.reflect.Method> r2, Yue.C0573<java.lang.String, java.lang.Class> r3) {
            r0 = this;
            r0.<init>()
            r0.f23358 = r1
            r0.f23359 = r2
            r0.f23360 = r3
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static java.lang.Throwable m25723(@Yue.InterfaceC4410 java.lang.Throwable r1) {
        L0:
            java.lang.Throwable r0 = r1.getCause()
            if (r0 == 0) goto Lb
            java.lang.Throwable r1 = r1.getCause()
            goto L0
        Lb:
            return r1
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public abstract void mo25724();

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.Exception m25725(int r4, java.lang.String r5) {
            r3 = this;
            switch(r4) {
                case -9: goto L4c;
                case -8: goto L3;
                case -7: goto L46;
                case -6: goto L40;
                case -5: goto L3a;
                case -4: goto L34;
                case -3: goto L2e;
                case -2: goto L28;
                case -1: goto L22;
                default: goto L3;
            }
        L3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown exception code: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " msg "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            return r0
        L22:
            java.lang.SecurityException r4 = new java.lang.SecurityException
            r4.<init>(r5)
            return r4
        L28:
            android.os.BadParcelableException r4 = new android.os.BadParcelableException
            r4.<init>(r5)
            return r4
        L2e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r5)
            return r4
        L34:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            r4.<init>(r5)
            return r4
        L3a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r5)
            return r4
        L40:
            android.os.NetworkOnMainThreadException r4 = new android.os.NetworkOnMainThreadException
            r4.<init>()
            return r4
        L46:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>(r5)
            return r4
        L4c:
            android.os.Parcelable r4 = r3.mo25770()
            java.lang.Exception r4 = (java.lang.Exception) r4
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public abstract Yue.AbstractC6680 mo25726();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final java.lang.Class m25727(java.lang.Class<? extends Yue.InterfaceC6687> r4) throws java.lang.ClassNotFoundException {
            r3 = this;
            Yue.ۥ۟ۡۨۡ<java.lang.String, java.lang.Class> r0 = r3.f23360
            java.lang.String r1 = r4.getName()
            java.lang.Object r0 = r0.get(r1)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L36
            java.lang.Package r0 = r4.getPackage()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r4.getSimpleName()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "%s.%sParcelizer"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r1 = 0
            java.lang.ClassLoader r2 = r4.getClassLoader()
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r2)
            Yue.ۥ۟ۡۨۡ<java.lang.String, java.lang.Class> r1 = r3.f23360
            java.lang.String r4 = r4.getName()
            r1.put(r4, r0)
        L36:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.lang.reflect.Method m25728(java.lang.String r4) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
            r3 = this;
            Yue.ۥ۟ۡۨۡ<java.lang.String, java.lang.reflect.Method> r0 = r3.f23358
            java.lang.Object r0 = r0.get(r4)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L27
            java.lang.System.currentTimeMillis()
            r0 = 1
            java.lang.Class<Yue.ۥۣۢۦۡ> r1 = Yue.AbstractC6680.class
            java.lang.ClassLoader r2 = r1.getClassLoader()
            java.lang.Class r0 = java.lang.Class.forName(r4, r0, r2)
            java.lang.String r2 = "read"
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)
            Yue.ۥ۟ۡۨۡ<java.lang.String, java.lang.reflect.Method> r1 = r3.f23358
            r1.put(r4, r0)
        L27:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final <T> int m25729(T r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L6
            r3 = 4
            return r3
        L6:
            boolean r0 = r3 instanceof android.os.Parcelable
            if (r0 == 0) goto Lc
            r3 = 2
            return r3
        Lc:
            boolean r0 = r3 instanceof Yue.InterfaceC6687
            if (r0 == 0) goto L12
            r3 = 1
            return r3
        L12:
            boolean r0 = r3 instanceof java.io.Serializable
            if (r0 == 0) goto L18
            r3 = 3
            return r3
        L18:
            boolean r0 = r3 instanceof android.os.IBinder
            if (r0 == 0) goto L1e
            r3 = 5
            return r3
        L1e:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L24
            r3 = 7
            return r3
        L24:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L2b
            r3 = 8
            return r3
        L2b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = " cannot be VersionedParcelled"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final java.lang.reflect.Method m25730(java.lang.Class r4) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
            r3 = this;
            Yue.ۥ۟ۡۨۡ<java.lang.String, java.lang.reflect.Method> r0 = r3.f23359
            java.lang.String r1 = r4.getName()
            java.lang.Object r0 = r0.get(r1)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L2a
            java.lang.Class r0 = r3.m25727(r4)
            java.lang.System.currentTimeMillis()
            java.lang.Class<Yue.ۥۣۢۦۡ> r1 = Yue.AbstractC6680.class
            java.lang.Class[] r1 = new java.lang.Class[]{r4, r1}
            java.lang.String r2 = "write"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)
            Yue.ۥ۟ۡۨۡ<java.lang.String, java.lang.reflect.Method> r1 = r3.f23359
            java.lang.String r4 = r4.getName()
            r1.put(r4, r0)
        L2a:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean mo25731() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public <T> T[] m25732(T[] r5) {
            r4 = this;
            int r0 = r4.mo25760()
            r1 = 0
            if (r0 >= 0) goto L8
            return r1
        L8:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            if (r0 == 0) goto L62
            int r3 = r4.mo25760()
            if (r0 >= 0) goto L16
            return r1
        L16:
            r1 = 1
            if (r3 == r1) goto L56
            r1 = 2
            if (r3 == r1) goto L4a
            r1 = 3
            if (r3 == r1) goto L3e
            r1 = 4
            if (r3 == r1) goto L32
            r1 = 5
            if (r3 == r1) goto L26
            goto L62
        L26:
            if (r0 <= 0) goto L62
            android.os.IBinder r1 = r4.mo25779()
            r2.add(r1)
            int r0 = r0 + (-1)
            goto L26
        L32:
            if (r0 <= 0) goto L62
            java.lang.String r1 = r4.mo25777()
            r2.add(r1)
            int r0 = r0 + (-1)
            goto L32
        L3e:
            if (r0 <= 0) goto L62
            java.io.Serializable r1 = r4.m25772()
            r2.add(r1)
            int r0 = r0 + (-1)
            goto L3e
        L4a:
            if (r0 <= 0) goto L62
            android.os.Parcelable r1 = r4.mo25770()
            r2.add(r1)
            int r0 = r0 + (-1)
            goto L4a
        L56:
            if (r0 <= 0) goto L62
            Yue.ۥۣۢۦۤ r1 = r4.m25781()
            r2.add(r1)
            int r0 = r0 + (-1)
            goto L56
        L62:
            java.lang.Object[] r5 = r2.toArray(r5)
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public <T> T[] m25733(T[] r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo25754(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            java.lang.Object[] r1 = r0.m25732(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public abstract boolean mo25734();

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m25735(boolean r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo25754(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            boolean r1 = r0.mo25734()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean[] m25736() {
            r5 = this;
            int r0 = r5.mo25760()
            if (r0 >= 0) goto L8
            r0 = 0
            return r0
        L8:
            boolean[] r1 = new boolean[r0]
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r0) goto L1c
            int r4 = r5.mo25760()
            if (r4 == 0) goto L16
            r4 = 1
            goto L17
        L16:
            r4 = r2
        L17:
            r1[r3] = r4
            int r3 = r3 + 1
            goto Lc
        L1c:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean[] m25737(boolean[] r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo25754(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            boolean[] r1 = r0.m25736()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public abstract android.os.Bundle mo25738();

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public android.os.Bundle m25739(android.os.Bundle r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo25754(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            android.os.Bundle r1 = r0.mo25738()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public byte m25740(byte r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo25754(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            int r1 = r0.mo25760()
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public abstract byte[] mo25741();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public byte[] m25742(byte[] r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo25754(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            byte[] r1 = r0.mo25741()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public char[] m25743(char[] r3, int r4) {
            r2 = this;
            boolean r4 = r2.mo25754(r4)
            if (r4 != 0) goto L7
            return r3
        L7:
            int r3 = r2.mo25760()
            if (r3 >= 0) goto Lf
            r3 = 0
            return r3
        Lf:
            char[] r4 = new char[r3]
            r0 = 0
        L12:
            if (r0 >= r3) goto L1e
            int r1 = r2.mo25760()
            char r1 = (char) r1
            r4[r0] = r1
            int r0 = r0 + 1
            goto L12
        L1e:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public abstract java.lang.CharSequence mo25744();

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public java.lang.CharSequence m25745(java.lang.CharSequence r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo25754(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            java.lang.CharSequence r1 = r0.mo25744()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final <T, S extends java.util.Collection<T>> S m25746(S r4) {
            r3 = this;
            int r0 = r3.mo25760()
            r1 = 0
            if (r0 >= 0) goto L8
            return r1
        L8:
            if (r0 == 0) goto L5d
            int r2 = r3.mo25760()
            if (r0 >= 0) goto L11
            return r1
        L11:
            r1 = 1
            if (r2 == r1) goto L51
            r1 = 2
            if (r2 == r1) goto L45
            r1 = 3
            if (r2 == r1) goto L39
            r1 = 4
            if (r2 == r1) goto L2d
            r1 = 5
            if (r2 == r1) goto L21
            goto L5d
        L21:
            if (r0 <= 0) goto L5d
            android.os.IBinder r1 = r3.mo25779()
            r4.add(r1)
            int r0 = r0 + (-1)
            goto L21
        L2d:
            if (r0 <= 0) goto L5d
            java.lang.String r1 = r3.mo25777()
            r4.add(r1)
            int r0 = r0 + (-1)
            goto L2d
        L39:
            if (r0 <= 0) goto L5d
            java.io.Serializable r1 = r3.m25772()
            r4.add(r1)
            int r0 = r0 + (-1)
            goto L39
        L45:
            if (r0 <= 0) goto L5d
            android.os.Parcelable r1 = r3.mo25770()
            r4.add(r1)
            int r0 = r0 + (-1)
            goto L45
        L51:
            if (r0 <= 0) goto L5d
            Yue.ۥۣۢۦۤ r1 = r3.m25781()
            r4.add(r1)
            int r0 = r0 + (-1)
            goto L51
        L5d:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public abstract double mo25747();

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public double m25748(double r1, int r3) {
            r0 = this;
            boolean r3 = r0.mo25754(r3)
            if (r3 != 0) goto L7
            return r1
        L7:
            double r1 = r0.mo25747()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public double[] m25749() {
            r5 = this;
            int r0 = r5.mo25760()
            if (r0 >= 0) goto L8
            r0 = 0
            return r0
        L8:
            double[] r1 = new double[r0]
            r2 = 0
        Lb:
            if (r2 >= r0) goto L16
            double r3 = r5.mo25747()
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L16:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public double[] m25750(double[] r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo25754(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            double[] r1 = r0.m25749()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final java.lang.Exception m25751(int r1, java.lang.String r2) {
            r0 = this;
            java.lang.Exception r1 = r0.m25725(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public java.lang.Exception m25752(java.lang.Exception r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo25754(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            int r2 = r0.m25753()
            if (r2 == 0) goto L15
            java.lang.String r1 = r0.mo25777()
            java.lang.Exception r1 = r0.m25751(r2, r1)
        L15:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final int m25753() {
            r1 = this;
            int r0 = r1.mo25760()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public abstract boolean mo25754(int r1);

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public abstract float mo25755();

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public float m25756(float r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo25754(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            float r1 = r0.mo25755()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public float[] m25757() {
            r4 = this;
            int r0 = r4.mo25760()
            if (r0 >= 0) goto L8
            r0 = 0
            return r0
        L8:
            float[] r1 = new float[r0]
            r2 = 0
        Lb:
            if (r2 >= r0) goto L16
            float r3 = r4.mo25755()
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L16:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public float[] m25758(float[] r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo25754(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            float[] r1 = r0.m25757()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public <T extends Yue.InterfaceC6687> T m25759(java.lang.String r2, Yue.AbstractC6680 r3) {
            r1 = this;
            java.lang.reflect.Method r2 = r1.m25728(r2)     // Catch: java.lang.ClassNotFoundException -> L10 java.lang.NoSuchMethodException -> L12 java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L16
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.ClassNotFoundException -> L10 java.lang.NoSuchMethodException -> L12 java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L16
            r0 = 0
            java.lang.Object r2 = r2.invoke(r0, r3)     // Catch: java.lang.ClassNotFoundException -> L10 java.lang.NoSuchMethodException -> L12 java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L16
            Yue.ۥۣۢۦۤ r2 = (Yue.InterfaceC6687) r2     // Catch: java.lang.ClassNotFoundException -> L10 java.lang.NoSuchMethodException -> L12 java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L16
            return r2
        L10:
            r2 = move-exception
            goto L18
        L12:
            r2 = move-exception
            goto L20
        L14:
            r2 = move-exception
            goto L28
        L16:
            r2 = move-exception
            goto L3f
        L18:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered ClassNotFoundException"
            r3.<init>(r0, r2)
            throw r3
        L20:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered NoSuchMethodException"
            r3.<init>(r0, r2)
            throw r3
        L28:
            java.lang.Throwable r3 = r2.getCause()
            boolean r3 = r3 instanceof java.lang.RuntimeException
            if (r3 == 0) goto L37
            java.lang.Throwable r2 = r2.getCause()
            java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2
            throw r2
        L37:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered InvocationTargetException"
            r3.<init>(r0, r2)
            throw r3
        L3f:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered IllegalAccessException"
            r3.<init>(r0, r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public abstract int mo25760();

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public int m25761(int r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo25754(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            int r1 = r0.mo25760()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public int[] m25762() {
            r4 = this;
            int r0 = r4.mo25760()
            if (r0 >= 0) goto L8
            r0 = 0
            return r0
        L8:
            int[] r1 = new int[r0]
            r2 = 0
        Lb:
            if (r2 >= r0) goto L16
            int r3 = r4.mo25760()
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L16:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public int[] m25763(int[] r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo25754(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            int[] r1 = r0.m25762()
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public <T> java.util.List<T> m25764(java.util.List<T> r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo25754(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = r0.m25746(r1)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public abstract long mo25765();

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public long m25766(long r1, int r3) {
            r0 = this;
            boolean r3 = r0.mo25754(r3)
            if (r3 != 0) goto L7
            return r1
        L7:
            long r1 = r0.mo25765()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public long[] m25767() {
            r5 = this;
            int r0 = r5.mo25760()
            if (r0 >= 0) goto L8
            r0 = 0
            return r0
        L8:
            long[] r1 = new long[r0]
            r2 = 0
        Lb:
            if (r2 >= r0) goto L16
            long r3 = r5.mo25765()
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L16:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public long[] m25768(long[] r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo25754(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            long[] r1 = r0.m25767()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public <K, V> java.util.Map<K, V> m25769(java.util.Map<K, V> r6, int r7) {
            r5 = this;
            boolean r7 = r5.mo25754(r7)
            if (r7 != 0) goto L7
            return r6
        L7:
            int r6 = r5.mo25760()
            if (r6 >= 0) goto Lf
            r6 = 0
            return r6
        Lf:
            Yue.ۥ۟ۡۨۡ r7 = new Yue.ۥ۟ۡۨۡ
            r7.<init>()
            if (r6 != 0) goto L17
            return r7
        L17:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.m25746(r0)
            r5.m25746(r1)
            r2 = 0
        L28:
            if (r2 >= r6) goto L38
            java.lang.Object r3 = r0.get(r2)
            java.lang.Object r4 = r1.get(r2)
            r7.put(r3, r4)
            int r2 = r2 + 1
            goto L28
        L38:
            return r7
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public abstract <T extends android.os.Parcelable> T mo25770();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public <T extends android.os.Parcelable> T m25771(T r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo25754(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            android.os.Parcelable r1 = r0.mo25770()
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public java.io.Serializable m25772() {
            r6 = this;
            java.lang.String r0 = ")"
            java.lang.String r1 = r6.mo25777()
            if (r1 != 0) goto La
            r0 = 0
            return r0
        La:
            byte[] r2 = r6.mo25741()
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            r3.<init>(r2)
            Yue.ۥۣۢۦۡ$ۥ r2 = new Yue.ۥۣۢۦۡ$ۥ     // Catch: java.lang.ClassNotFoundException -> L1f java.io.IOException -> L21
            r2.<init>(r6, r3)     // Catch: java.lang.ClassNotFoundException -> L1f java.io.IOException -> L21
            java.lang.Object r2 = r2.readObject()     // Catch: java.lang.ClassNotFoundException -> L1f java.io.IOException -> L21
            java.io.Serializable r2 = (java.io.Serializable) r2     // Catch: java.lang.ClassNotFoundException -> L1f java.io.IOException -> L21
            return r2
        L1f:
            r2 = move-exception
            goto L23
        L21:
            r2 = move-exception
            goto L3d
        L23:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = "
            r4.append(r5)
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0, r2)
            throw r3
        L3d:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "VersionedParcelable encountered IOException reading a Serializable object (name = "
            r4.append(r5)
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0, r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public <T> java.util.Set<T> m25773(java.util.Set<T> r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo25754(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            Yue.ۥ۟ۡۨۦ r1 = new Yue.ۥ۟ۡۨۦ
            r1.<init>()
            java.util.Collection r1 = r0.m25746(r1)
            java.util.Set r1 = (java.util.Set) r1
            return r1
    }

    @Yue.InterfaceC5336(api = 21)
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public android.util.Size m25774(android.util.Size r2, int r3) {
            r1 = this;
            boolean r3 = r1.mo25754(r3)
            if (r3 != 0) goto L7
            return r2
        L7:
            boolean r2 = r1.mo25734()
            if (r2 == 0) goto L1b
            int r2 = r1.mo25760()
            int r3 = r1.mo25760()
            android.util.Size r0 = new android.util.Size
            r0.<init>(r2, r3)
            return r0
        L1b:
            r2 = 0
            return r2
    }

    @Yue.InterfaceC5336(api = 21)
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public android.util.SizeF m25775(android.util.SizeF r2, int r3) {
            r1 = this;
            boolean r3 = r1.mo25754(r3)
            if (r3 != 0) goto L7
            return r2
        L7:
            boolean r2 = r1.mo25734()
            if (r2 == 0) goto L1b
            float r2 = r1.mo25755()
            float r3 = r1.mo25755()
            android.util.SizeF r0 = new android.util.SizeF
            r0.<init>(r2, r3)
            return r0
        L1b:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public android.util.SparseBooleanArray m25776(android.util.SparseBooleanArray r4, int r5) {
            r3 = this;
            boolean r5 = r3.mo25754(r5)
            if (r5 != 0) goto L7
            return r4
        L7:
            int r4 = r3.mo25760()
            if (r4 >= 0) goto Lf
            r4 = 0
            return r4
        Lf:
            android.util.SparseBooleanArray r5 = new android.util.SparseBooleanArray
            r5.<init>(r4)
            r0 = 0
        L15:
            if (r0 >= r4) goto L25
            int r1 = r3.mo25760()
            boolean r2 = r3.mo25734()
            r5.put(r1, r2)
            int r0 = r0 + 1
            goto L15
        L25:
            return r5
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public abstract java.lang.String mo25777();

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public java.lang.String m25778(java.lang.String r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo25754(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            java.lang.String r1 = r0.mo25777()
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public abstract android.os.IBinder mo25779();

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public android.os.IBinder m25780(android.os.IBinder r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo25754(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            android.os.IBinder r1 = r0.mo25779()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public <T extends Yue.InterfaceC6687> T m25781() {
            r2 = this;
            java.lang.String r0 = r2.mo25777()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            Yue.ۥۣۢۦۡ r1 = r2.mo25726()
            Yue.ۥۣۢۦۤ r0 = r2.m25759(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public <T extends Yue.InterfaceC6687> T m25782(T r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo25754(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            Yue.ۥۣۢۦۤ r1 = r0.m25781()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public abstract void mo25783(int r1);

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public void mo25784(boolean r1, boolean r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public <T> void m25785(T[] r5) {
            r4 = this;
            if (r5 != 0) goto L7
            r5 = -1
            r4.mo25812(r5)
            return
        L7:
            int r0 = r5.length
            r4.mo25812(r0)
            if (r0 <= 0) goto L63
            r1 = 0
            r2 = r5[r1]
            int r2 = r4.m25729(r2)
            r4.mo25812(r2)
            r3 = 1
            if (r2 == r3) goto L57
            r3 = 2
            if (r2 == r3) goto L4b
            r3 = 3
            if (r2 == r3) goto L3f
            r3 = 4
            if (r2 == r3) goto L33
            r3 = 5
            if (r2 == r3) goto L27
            goto L63
        L27:
            if (r1 >= r0) goto L63
            r2 = r5[r1]
            android.os.IBinder r2 = (android.os.IBinder) r2
            r4.mo25833(r2)
            int r1 = r1 + 1
            goto L27
        L33:
            if (r1 >= r0) goto L63
            r2 = r5[r1]
            java.lang.String r2 = (java.lang.String) r2
            r4.mo25831(r2)
            int r1 = r1 + 1
            goto L33
        L3f:
            if (r1 >= r0) goto L63
            r2 = r5[r1]
            java.io.Serializable r2 = (java.io.Serializable) r2
            r4.m25825(r2)
            int r1 = r1 + 1
            goto L3f
        L4b:
            if (r1 >= r0) goto L63
            r2 = r5[r1]
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            r4.mo25823(r2)
            int r1 = r1 + 1
            goto L4b
        L57:
            if (r1 >= r0) goto L63
            r2 = r5[r1]
            Yue.ۥۣۢۦۤ r2 = (Yue.InterfaceC6687) r2
            r4.m25838(r2)
            int r1 = r1 + 1
            goto L57
        L63:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public <T> void m25786(T[] r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            r0.m25785(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public abstract void mo25787(boolean r1);

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public void m25788(boolean r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            r0.mo25787(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public void m25789(boolean[] r4) {
            r3 = this;
            if (r4 == 0) goto L11
            int r0 = r4.length
            r3.mo25812(r0)
            r1 = 0
        L7:
            if (r1 >= r0) goto L15
            boolean r2 = r4[r1]
            r3.mo25812(r2)
            int r1 = r1 + 1
            goto L7
        L11:
            r4 = -1
            r3.mo25812(r4)
        L15:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public void m25790(boolean[] r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            r0.m25789(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public abstract void mo25791(android.os.Bundle r1);

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public void m25792(android.os.Bundle r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            r0.mo25791(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public void m25793(byte r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            r0.mo25812(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public abstract void mo25794(byte[] r1);

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public void m25795(byte[] r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            r0.mo25794(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public abstract void mo25796(byte[] r1, int r2, int r3);

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public void m25797(byte[] r1, int r2, int r3, int r4) {
            r0 = this;
            r0.mo25783(r4)
            r0.mo25796(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public void m25798(char[] r3, int r4) {
            r2 = this;
            r2.mo25783(r4)
            if (r3 == 0) goto L14
            int r4 = r3.length
            r2.mo25812(r4)
            r0 = 0
        La:
            if (r0 >= r4) goto L18
            char r1 = r3[r0]
            r2.mo25812(r1)
            int r0 = r0 + 1
            goto La
        L14:
            r3 = -1
            r2.mo25812(r3)
        L18:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public abstract void mo25799(java.lang.CharSequence r1);

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public void m25800(java.lang.CharSequence r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            r0.mo25799(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public final <T> void m25801(java.util.Collection<T> r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r2 = -1
            r1.mo25812(r2)
            return
        L7:
            int r0 = r2.size()
            r1.mo25812(r0)
            if (r0 <= 0) goto Lb8
            java.util.Iterator r0 = r2.iterator()
            java.lang.Object r0 = r0.next()
            int r0 = r1.m25729(r0)
            r1.mo25812(r0)
            switch(r0) {
                case 1: goto La4;
                case 2: goto L90;
                case 3: goto L7c;
                case 4: goto L68;
                case 5: goto L54;
                case 6: goto L22;
                case 7: goto L3c;
                case 8: goto L24;
                default: goto L22;
            }
        L22:
            goto Lb8
        L24:
            java.util.Iterator r2 = r2.iterator()
        L28:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r0 = r2.next()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r1.mo25808(r0)
            goto L28
        L3c:
            java.util.Iterator r2 = r2.iterator()
        L40:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.mo25812(r0)
            goto L40
        L54:
            java.util.Iterator r2 = r2.iterator()
        L58:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r0 = r2.next()
            android.os.IBinder r0 = (android.os.IBinder) r0
            r1.mo25833(r0)
            goto L58
        L68:
            java.util.Iterator r2 = r2.iterator()
        L6c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            r1.mo25831(r0)
            goto L6c
        L7c:
            java.util.Iterator r2 = r2.iterator()
        L80:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r0 = r2.next()
            java.io.Serializable r0 = (java.io.Serializable) r0
            r1.m25825(r0)
            goto L80
        L90:
            java.util.Iterator r2 = r2.iterator()
        L94:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r0 = r2.next()
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r1.mo25823(r0)
            goto L94
        La4:
            java.util.Iterator r2 = r2.iterator()
        La8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r0 = r2.next()
            Yue.ۥۣۢۦۤ r0 = (Yue.InterfaceC6687) r0
            r1.m25838(r0)
            goto La8
        Lb8:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public final <T> void m25802(java.util.Collection<T> r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            r0.m25801(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public abstract void mo25803(double r1);

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public void m25804(double r1, int r3) {
            r0 = this;
            r0.mo25783(r3)
            r0.mo25803(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public void m25805(double[] r5) {
            r4 = this;
            if (r5 == 0) goto L11
            int r0 = r5.length
            r4.mo25812(r0)
            r1 = 0
        L7:
            if (r1 >= r0) goto L15
            r2 = r5[r1]
            r4.mo25803(r2)
            int r1 = r1 + 1
            goto L7
        L11:
            r5 = -1
            r4.mo25812(r5)
        L15:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public void m25806(double[] r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            r0.m25805(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public void m25807(java.lang.Exception r3, int r4) {
            r2 = this;
            r2.mo25783(r4)
            if (r3 != 0) goto L9
            r2.m25822()
            return
        L9:
            boolean r4 = r3 instanceof android.os.Parcelable
            r0 = -9
            if (r4 == 0) goto L21
            java.lang.Class r4 = r3.getClass()
            java.lang.ClassLoader r4 = r4.getClassLoader()
            java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            if (r4 != r1) goto L21
            r4 = r0
            goto L4c
        L21:
            boolean r4 = r3 instanceof java.lang.SecurityException
            if (r4 == 0) goto L27
            r4 = -1
            goto L4c
        L27:
            boolean r4 = r3 instanceof android.os.BadParcelableException
            if (r4 == 0) goto L2d
            r4 = -2
            goto L4c
        L2d:
            boolean r4 = r3 instanceof java.lang.IllegalArgumentException
            if (r4 == 0) goto L33
            r4 = -3
            goto L4c
        L33:
            boolean r4 = r3 instanceof java.lang.NullPointerException
            if (r4 == 0) goto L39
            r4 = -4
            goto L4c
        L39:
            boolean r4 = r3 instanceof java.lang.IllegalStateException
            if (r4 == 0) goto L3f
            r4 = -5
            goto L4c
        L3f:
            boolean r4 = r3 instanceof android.os.NetworkOnMainThreadException
            if (r4 == 0) goto L45
            r4 = -6
            goto L4c
        L45:
            boolean r4 = r3 instanceof java.lang.UnsupportedOperationException
            if (r4 == 0) goto L4b
            r4 = -7
            goto L4c
        L4b:
            r4 = 0
        L4c:
            r2.mo25812(r4)
            if (r4 != 0) goto L5e
            boolean r4 = r3 instanceof java.lang.RuntimeException
            if (r4 == 0) goto L58
            java.lang.RuntimeException r3 = (java.lang.RuntimeException) r3
            throw r3
        L58:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
        L5e:
            java.lang.String r1 = r3.getMessage()
            r2.mo25831(r1)
            if (r4 == r0) goto L68
            goto L6d
        L68:
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            r2.mo25823(r3)
        L6d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public abstract void mo25808(float r1);

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public void m25809(float r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            r0.mo25808(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public void m25810(float[] r4) {
            r3 = this;
            if (r4 == 0) goto L11
            int r0 = r4.length
            r3.mo25812(r0)
            r1 = 0
        L7:
            if (r1 >= r0) goto L15
            r2 = r4[r1]
            r3.mo25808(r2)
            int r1 = r1 + 1
            goto L7
        L11:
            r4 = -1
            r3.mo25812(r4)
        L15:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public void m25811(float[] r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            r0.m25810(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public abstract void mo25812(int r1);

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public void m25813(int r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            r0.mo25812(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public void m25814(int[] r4) {
            r3 = this;
            if (r4 == 0) goto L11
            int r0 = r4.length
            r3.mo25812(r0)
            r1 = 0
        L7:
            if (r1 >= r0) goto L15
            r2 = r4[r1]
            r3.mo25812(r2)
            int r1 = r1 + 1
            goto L7
        L11:
            r4 = -1
            r3.mo25812(r4)
        L15:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public void m25815(int[] r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            r0.m25814(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public <T> void m25816(java.util.List<T> r1, int r2) {
            r0 = this;
            r0.m25802(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public abstract void mo25817(long r1);

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public void m25818(long r1, int r3) {
            r0 = this;
            r0.mo25783(r3)
            r0.mo25817(r1)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public void m25819(long[] r5) {
            r4 = this;
            if (r5 == 0) goto L11
            int r0 = r5.length
            r4.mo25812(r0)
            r1 = 0
        L7:
            if (r1 >= r0) goto L15
            r2 = r5[r1]
            r4.mo25817(r2)
            int r1 = r1 + 1
            goto L7
        L11:
            r5 = -1
            r4.mo25812(r5)
        L15:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public void m25820(long[] r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            r0.m25819(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public <K, V> void m25821(java.util.Map<K, V> r4, int r5) {
            r3 = this;
            r3.mo25783(r5)
            if (r4 != 0) goto La
            r4 = -1
            r3.mo25812(r4)
            return
        La:
            int r5 = r4.size()
            r3.mo25812(r5)
            if (r5 != 0) goto L14
            return
        L14:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L26:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            r5.add(r2)
            java.lang.Object r1 = r1.getValue()
            r0.add(r1)
            goto L26
        L41:
            r3.m25801(r5)
            r3.m25801(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public void m25822() {
            r1 = this;
            r0 = 0
            r1.mo25812(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public abstract void mo25823(android.os.Parcelable r1);

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public void m25824(android.os.Parcelable r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            r0.mo25823(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public final void m25825(java.io.Serializable r5) {
            r4 = this;
            if (r5 != 0) goto L7
            r5 = 0
            r4.mo25831(r5)
            return
        L7:
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getName()
            r4.mo25831(r0)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.io.IOException -> L2a
            r2.<init>(r1)     // Catch: java.io.IOException -> L2a
            r2.writeObject(r5)     // Catch: java.io.IOException -> L2a
            r2.close()     // Catch: java.io.IOException -> L2a
            byte[] r5 = r1.toByteArray()     // Catch: java.io.IOException -> L2a
            r4.mo25794(r5)     // Catch: java.io.IOException -> L2a
            return
        L2a:
            r5 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "VersionedParcelable encountered IOException writing serializable object (name = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r5)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public void m25826(java.io.Serializable r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            r0.m25825(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public <T> void m25827(java.util.Set<T> r1, int r2) {
            r0 = this;
            r0.m25802(r1, r2)
            return
    }

    @Yue.InterfaceC5336(api = 21)
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public void m25828(android.util.Size r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            if (r1 == 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            r0.mo25787(r2)
            if (r1 == 0) goto L1b
            int r2 = r1.getWidth()
            r0.mo25812(r2)
            int r1 = r1.getHeight()
            r0.mo25812(r1)
        L1b:
            return
    }

    @Yue.InterfaceC5336(api = 21)
    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public void m25829(android.util.SizeF r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            if (r1 == 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            r0.mo25787(r2)
            if (r1 == 0) goto L1b
            float r2 = r1.getWidth()
            r0.mo25808(r2)
            float r1 = r1.getHeight()
            r0.mo25808(r1)
        L1b:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public void m25830(android.util.SparseBooleanArray r3, int r4) {
            r2 = this;
            r2.mo25783(r4)
            if (r3 != 0) goto La
            r3 = -1
            r2.mo25812(r3)
            return
        La:
            int r4 = r3.size()
            r2.mo25812(r4)
            r0 = 0
        L12:
            if (r0 >= r4) goto L25
            int r1 = r3.keyAt(r0)
            r2.mo25812(r1)
            boolean r1 = r3.valueAt(r0)
            r2.mo25787(r1)
            int r0 = r0 + 1
            goto L12
        L25:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public abstract void mo25831(java.lang.String r1);

    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public void m25832(java.lang.String r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            r0.mo25831(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public abstract void mo25833(android.os.IBinder r1);

    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public void m25834(android.os.IBinder r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            r0.mo25833(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public abstract void mo25835(android.os.IInterface r1);

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public void m25836(android.os.IInterface r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            r0.mo25835(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public <T extends Yue.InterfaceC6687> void m25837(T r2, Yue.AbstractC6680 r3) {
            r1 = this;
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.ClassNotFoundException -> L11 java.lang.NoSuchMethodException -> L13 java.lang.reflect.InvocationTargetException -> L15 java.lang.IllegalAccessException -> L17
            java.lang.reflect.Method r0 = r1.m25730(r0)     // Catch: java.lang.ClassNotFoundException -> L11 java.lang.NoSuchMethodException -> L13 java.lang.reflect.InvocationTargetException -> L15 java.lang.IllegalAccessException -> L17
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}     // Catch: java.lang.ClassNotFoundException -> L11 java.lang.NoSuchMethodException -> L13 java.lang.reflect.InvocationTargetException -> L15 java.lang.IllegalAccessException -> L17
            r3 = 0
            r0.invoke(r3, r2)     // Catch: java.lang.ClassNotFoundException -> L11 java.lang.NoSuchMethodException -> L13 java.lang.reflect.InvocationTargetException -> L15 java.lang.IllegalAccessException -> L17
            return
        L11:
            r2 = move-exception
            goto L19
        L13:
            r2 = move-exception
            goto L21
        L15:
            r2 = move-exception
            goto L29
        L17:
            r2 = move-exception
            goto L40
        L19:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered ClassNotFoundException"
            r3.<init>(r0, r2)
            throw r3
        L21:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered NoSuchMethodException"
            r3.<init>(r0, r2)
            throw r3
        L29:
            java.lang.Throwable r3 = r2.getCause()
            boolean r3 = r3 instanceof java.lang.RuntimeException
            if (r3 == 0) goto L38
            java.lang.Throwable r2 = r2.getCause()
            java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2
            throw r2
        L38:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered InvocationTargetException"
            r3.<init>(r0, r2)
            throw r3
        L40:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered IllegalAccessException"
            r3.<init>(r0, r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public void m25838(Yue.InterfaceC6687 r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r2 = 0
            r1.mo25831(r2)
            return
        L7:
            r1.m25840(r2)
            Yue.ۥۣۢۦۡ r0 = r1.mo25726()
            r1.m25837(r2, r0)
            r0.mo25724()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public void m25839(Yue.InterfaceC6687 r1, int r2) {
            r0 = this;
            r0.mo25783(r2)
            r0.m25838(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public final void m25840(Yue.InterfaceC6687 r4) {
            r3 = this;
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.ClassNotFoundException -> L10
            java.lang.Class r4 = r3.m25727(r0)     // Catch: java.lang.ClassNotFoundException -> L10
            java.lang.String r4 = r4.getName()
            r3.mo25831(r4)
            return
        L10:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r2.append(r4)
            java.lang.String r4 = " does not have a Parcelizer"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
    }
}
