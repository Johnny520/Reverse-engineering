package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends android.view.ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final java.lang.String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final java.lang.String VERSION = "ConstraintLayout-2.0.4";
    android.util.SparseArray<android.view.View> mChildrenByIds;
    private java.util.ArrayList<androidx.constraintlayout.widget.AbstractC7457> mConstraintHelpers;
    protected androidx.constraintlayout.widget.C7458 mConstraintLayoutSpec;
    private androidx.constraintlayout.widget.C7462 mConstraintSet;
    private int mConstraintSetId;
    private Yue.AbstractC1521 mConstraintsChangedListener;
    private java.util.HashMap<java.lang.String, java.lang.Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected Yue.C1520 mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    androidx.constraintlayout.widget.ConstraintLayout.C7452 mMeasurer;
    private Yue.C4223 mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private android.util.SparseArray<Yue.C1517> mTempMapIdToWidget;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$ۥ, reason: contains not printable characters */
    public static /* synthetic */ class C7449 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f25904 = null;

        static {
                Yue.ۥ۟ۧ۟ۢ$ۥ۟[] r0 = Yue.C1517.EnumC1519.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.widget.ConstraintLayout.C7449.f25904 = r0
                Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4911     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.C7449.f25904     // Catch: java.lang.NoSuchFieldError -> L1d
                Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4912     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.C7449.f25904     // Catch: java.lang.NoSuchFieldError -> L28
                Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4914     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.C7449.f25904     // Catch: java.lang.NoSuchFieldError -> L33
                Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4913     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$ۥ۟, reason: contains not printable characters */
    public static class C7450 extends android.view.ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
        public static final int f25905 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
        public static final int f25906 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
        public static final int f25907 = -1;

        /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
        public static final int f25908 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
        public static final int f25909 = 1;

        /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
        public static final int f25910 = 1;

        /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
        public static final int f25911 = 2;

        /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
        public static final int f25912 = 3;

        /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
        public static final int f25913 = 4;

        /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
        public static final int f25914 = 5;

        /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
        public static final int f25915 = 6;

        /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
        public static final int f25916 = 7;

        /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
        public static final int f25917 = 1;

        /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
        public static final int f25918 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
        public static final int f25919 = 2;

        /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
        public static final int f25920 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
        public static final int f25921 = 1;

        /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
        public static final int f25922 = 2;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f25923;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f25924;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float f25925;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f25926;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f25927;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f25928;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f25929;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int f25930;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public int f25931;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public int f25932;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public int f25933;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public int f25934;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public int f25935;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public int f25936;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public float f25937;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public int f25938;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public int f25939;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public int f25940;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public int f25941;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f25942;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f25943;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f25944;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f25945;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f25946;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public int f25947;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public float f25948;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public float f25949;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public java.lang.String f25950;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public float f25951;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public int f25952;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public float f25953;

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public float f25954;

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public int f25955;

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public int f25956;

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public int f25957;

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public int f25958;

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public int f25959;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public int f25960;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public int f25961;

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public int f25962;

        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public float f25963;

        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public float f25964;

        /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
        public int f25965;

        /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
        public int f25966;

        /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
        public int f25967;

        /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
        public boolean f25968;

        /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
        public boolean f25969;

        /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
        public java.lang.String f25970;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean f25971;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean f25972;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public boolean f25973;

        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public boolean f25974;

        /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
        public boolean f25975;

        /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
        public boolean f25976;

        /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
        public boolean f25977;

        /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
        public int f25978;

        /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
        public int f25979;

        /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
        public int f25980;

        /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
        public int f25981;

        /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
        public int f25982;

        /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
        public int f25983;

        /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
        public float f25984;

        /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
        public int f25985;

        /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
        public int f25986;

        /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
        public float f25987;

        /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
        public Yue.C1517 f25988;

        /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
        public boolean f25989;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$ۥ۟$ۥ, reason: contains not printable characters */
        public static class C7451 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public static final int f25990 = 0;

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public static final int f25991 = 1;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public static final int f25992 = 2;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public static final int f25993 = 3;

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public static final int f25994 = 4;

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public static final int f25995 = 5;

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public static final int f25996 = 6;

            /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
            public static final int f25997 = 7;

            /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
            public static final int f25998 = 8;

            /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
            public static final int f25999 = 9;

            /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
            public static final int f26000 = 10;

            /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
            public static final int f26001 = 11;

            /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
            public static final int f26002 = 12;

            /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
            public static final int f26003 = 13;

            /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
            public static final int f26004 = 14;

            /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
            public static final int f26005 = 15;

            /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
            public static final int f26006 = 16;

            /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
            public static final int f26007 = 17;

            /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
            public static final int f26008 = 18;

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public static final int f26009 = 19;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public static final int f26010 = 20;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public static final int f26011 = 21;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public static final int f26012 = 22;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public static final int f26013 = 23;

            /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
            public static final int f26014 = 24;

            /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
            public static final int f26015 = 25;

            /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
            public static final int f26016 = 26;

            /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
            public static final int f26017 = 27;

            /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
            public static final int f26018 = 28;

            /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
            public static final int f26019 = 29;

            /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
            public static final int f26020 = 30;

            /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
            public static final int f26021 = 31;

            /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
            public static final int f26022 = 32;

            /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
            public static final int f26023 = 33;

            /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
            public static final int f26024 = 34;

            /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
            public static final int f26025 = 35;

            /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
            public static final int f26026 = 36;

            /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
            public static final int f26027 = 37;

            /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
            public static final int f26028 = 38;

            /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
            public static final int f26029 = 39;

            /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
            public static final int f26030 = 40;

            /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
            public static final int f26031 = 41;

            /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
            public static final int f26032 = 42;

            /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
            public static final int f26033 = 43;

            /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
            public static final int f26034 = 44;

            /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
            public static final int f26035 = 45;

            /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
            public static final int f26036 = 46;

            /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
            public static final int f26037 = 47;

            /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
            public static final int f26038 = 48;

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public static final int f26039 = 49;

            /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
            public static final int f26040 = 50;

            /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
            public static final int f26041 = 51;

            /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
            public static final android.util.SparseIntArray f26042 = null;

            static {
                    android.util.SparseIntArray r0 = new android.util.SparseIntArray
                    r0.<init>()
                    androidx.constraintlayout.widget.ConstraintLayout.C7450.C7451.f26042 = r0
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28281
                    r2 = 8
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28282
                    r2 = 9
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28284
                    r2 = 10
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28285
                    r2 = 11
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28291
                    r2 = 12
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28290
                    r2 = 13
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28263
                    r2 = 14
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28262
                    r2 = 15
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28260
                    r2 = 16
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28264
                    r2 = 2
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28266
                    r2 = 3
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28265
                    r2 = 4
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28299
                    r2 = 49
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28300
                    r2 = 50
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28270
                    r2 = 5
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28271
                    r2 = 6
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28272
                    r2 = 7
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28217
                    r2 = 1
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28286
                    r2 = 17
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28287
                    r2 = 18
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28269
                    r2 = 19
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28268
                    r2 = 20
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28303
                    r2 = 21
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28306
                    r2 = 22
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28304
                    r2 = 23
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28301
                    r2 = 24
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28305
                    r2 = 25
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28302
                    r2 = 26
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28277
                    r2 = 29
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28292
                    r2 = 30
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28267
                    r2 = 44
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28279
                    r2 = 45
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28294
                    r2 = 46
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28278
                    r2 = 47
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28293
                    r2 = 48
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28258
                    r2 = 27
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28257
                    r2 = 28
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28295
                    r2 = 31
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28273
                    r2 = 32
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28297
                    r2 = 33
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28296
                    r2 = 34
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28298
                    r2 = 35
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28275
                    r2 = 36
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28274
                    r2 = 37
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28276
                    r2 = 38
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28280
                    r2 = 39
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28289
                    r2 = 40
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28283
                    r2 = 41
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28261
                    r2 = 42
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28259
                    r2 = 43
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C7473.C7486.f28288
                    r2 = 51
                    r0.append(r1, r2)
                    return
            }

            public C7451() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        public C7450(int r5, int r6) {
                r4 = this;
                r4.<init>(r5, r6)
                r5 = -1
                r4.f25923 = r5
                r4.f25924 = r5
                r6 = -1082130432(0xffffffffbf800000, float:-1.0)
                r4.f25925 = r6
                r4.f25926 = r5
                r4.f25927 = r5
                r4.f25928 = r5
                r4.f25929 = r5
                r4.f25930 = r5
                r4.f25931 = r5
                r4.f25932 = r5
                r4.f25933 = r5
                r4.f25934 = r5
                r4.f25935 = r5
                r0 = 0
                r4.f25936 = r0
                r1 = 0
                r4.f25937 = r1
                r4.f25938 = r5
                r4.f25939 = r5
                r4.f25940 = r5
                r4.f25941 = r5
                r4.f25942 = r5
                r4.f25943 = r5
                r4.f25944 = r5
                r4.f25945 = r5
                r4.f25946 = r5
                r4.f25947 = r5
                r2 = 1056964608(0x3f000000, float:0.5)
                r4.f25948 = r2
                r4.f25949 = r2
                r3 = 0
                r4.f25950 = r3
                r4.f25951 = r1
                r1 = 1
                r4.f25952 = r1
                r4.f25953 = r6
                r4.f25954 = r6
                r4.f25955 = r0
                r4.f25956 = r0
                r4.f25957 = r0
                r4.f25958 = r0
                r4.f25959 = r0
                r4.f25960 = r0
                r4.f25961 = r0
                r4.f25962 = r0
                r6 = 1065353216(0x3f800000, float:1.0)
                r4.f25963 = r6
                r4.f25964 = r6
                r4.f25965 = r5
                r4.f25966 = r5
                r4.f25967 = r5
                r4.f25968 = r0
                r4.f25969 = r0
                r4.f25970 = r3
                r4.f25971 = r1
                r4.f25972 = r1
                r4.f25973 = r0
                r4.f25974 = r0
                r4.f25975 = r0
                r4.f25976 = r0
                r4.f25977 = r0
                r4.f25978 = r5
                r4.f25979 = r5
                r4.f25980 = r5
                r4.f25981 = r5
                r4.f25982 = r5
                r4.f25983 = r5
                r4.f25984 = r2
                Yue.ۥ۟ۧ۟ۢ r5 = new Yue.ۥ۟ۧ۟ۢ
                r5.<init>()
                r4.f25988 = r5
                r4.f25989 = r0
                return
        }

        public C7450(android.content.Context r11, android.util.AttributeSet r12) {
                r10 = this;
                r10.<init>(r11, r12)
                r0 = -1
                r10.f25923 = r0
                r10.f25924 = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r10.f25925 = r1
                r10.f25926 = r0
                r10.f25927 = r0
                r10.f25928 = r0
                r10.f25929 = r0
                r10.f25930 = r0
                r10.f25931 = r0
                r10.f25932 = r0
                r10.f25933 = r0
                r10.f25934 = r0
                r10.f25935 = r0
                r2 = 0
                r10.f25936 = r2
                r3 = 0
                r10.f25937 = r3
                r10.f25938 = r0
                r10.f25939 = r0
                r10.f25940 = r0
                r10.f25941 = r0
                r10.f25942 = r0
                r10.f25943 = r0
                r10.f25944 = r0
                r10.f25945 = r0
                r10.f25946 = r0
                r10.f25947 = r0
                r4 = 1056964608(0x3f000000, float:0.5)
                r10.f25948 = r4
                r10.f25949 = r4
                r5 = 0
                r10.f25950 = r5
                r10.f25951 = r3
                r6 = 1
                r10.f25952 = r6
                r10.f25953 = r1
                r10.f25954 = r1
                r10.f25955 = r2
                r10.f25956 = r2
                r10.f25957 = r2
                r10.f25958 = r2
                r10.f25959 = r2
                r10.f25960 = r2
                r10.f25961 = r2
                r10.f25962 = r2
                r1 = 1065353216(0x3f800000, float:1.0)
                r10.f25963 = r1
                r10.f25964 = r1
                r10.f25965 = r0
                r10.f25966 = r0
                r10.f25967 = r0
                r10.f25968 = r2
                r10.f25969 = r2
                r10.f25970 = r5
                r10.f25971 = r6
                r10.f25972 = r6
                r10.f25973 = r2
                r10.f25974 = r2
                r10.f25975 = r2
                r10.f25976 = r2
                r10.f25977 = r2
                r10.f25978 = r0
                r10.f25979 = r0
                r10.f25980 = r0
                r10.f25981 = r0
                r10.f25982 = r0
                r10.f25983 = r0
                r10.f25984 = r4
                Yue.ۥ۟ۧ۟ۢ r1 = new Yue.ۥ۟ۧ۟ۢ
                r1.<init>()
                r10.f25988 = r1
                r10.f25989 = r2
                int[] r1 = androidx.constraintlayout.widget.C7473.C7486.f28216
                android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r1)
                int r12 = r11.getIndexCount()
                r1 = r2
            L9e:
                if (r1 >= r12) goto L3cf
                int r4 = r11.getIndex(r1)
                android.util.SparseIntArray r5 = androidx.constraintlayout.widget.ConstraintLayout.C7450.C7451.f26042
                int r5 = r5.get(r4)
                java.lang.String r7 = "ConstraintLayout"
                r8 = 2
                r9 = -2
                switch(r5) {
                    case 1: goto L3c3;
                    case 2: goto L3b2;
                    case 3: goto L3a9;
                    case 4: goto L394;
                    case 5: goto L38b;
                    case 6: goto L382;
                    case 7: goto L379;
                    case 8: goto L368;
                    case 9: goto L357;
                    case 10: goto L345;
                    case 11: goto L333;
                    case 12: goto L321;
                    case 13: goto L30f;
                    case 14: goto L2fd;
                    case 15: goto L2eb;
                    case 16: goto L2d9;
                    case 17: goto L2c7;
                    case 18: goto L2b5;
                    case 19: goto L2a3;
                    case 20: goto L291;
                    case 21: goto L287;
                    case 22: goto L27d;
                    case 23: goto L273;
                    case 24: goto L269;
                    case 25: goto L25f;
                    case 26: goto L255;
                    case 27: goto L24b;
                    case 28: goto L241;
                    case 29: goto L237;
                    case 30: goto L22d;
                    case 31: goto L21e;
                    case 32: goto L20f;
                    case 33: goto L1f9;
                    case 34: goto L1e3;
                    case 35: goto L1d3;
                    case 36: goto L1bd;
                    case 37: goto L1a7;
                    case 38: goto L197;
                    default: goto Lb1;
                }
            Lb1:
                switch(r5) {
                    case 44: goto Lf6;
                    case 45: goto Lec;
                    case 46: goto Le2;
                    case 47: goto Lda;
                    case 48: goto Ld2;
                    case 49: goto Lc8;
                    case 50: goto Lbe;
                    case 51: goto Lb6;
                    default: goto Lb4;
                }
            Lb4:
                goto L3cb
            Lb6:
                java.lang.String r4 = r11.getString(r4)
                r10.f25970 = r4
                goto L3cb
            Lbe:
                int r5 = r10.f25966
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.f25966 = r4
                goto L3cb
            Lc8:
                int r5 = r10.f25965
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.f25965 = r4
                goto L3cb
            Ld2:
                int r4 = r11.getInt(r4, r2)
                r10.f25956 = r4
                goto L3cb
            Lda:
                int r4 = r11.getInt(r4, r2)
                r10.f25955 = r4
                goto L3cb
            Le2:
                float r5 = r10.f25954
                float r4 = r11.getFloat(r4, r5)
                r10.f25954 = r4
                goto L3cb
            Lec:
                float r5 = r10.f25953
                float r4 = r11.getFloat(r4, r5)
                r10.f25953 = r4
                goto L3cb
            Lf6:
                java.lang.String r4 = r11.getString(r4)
                r10.f25950 = r4
                r5 = 2143289344(0x7fc00000, float:NaN)
                r10.f25951 = r5
                r10.f25952 = r0
                if (r4 == 0) goto L3cb
                int r4 = r4.length()
                java.lang.String r5 = r10.f25950
                r7 = 44
                int r5 = r5.indexOf(r7)
                if (r5 <= 0) goto L134
                int r7 = r4 + (-1)
                if (r5 >= r7) goto L134
                java.lang.String r7 = r10.f25950
                java.lang.String r7 = r7.substring(r2, r5)
                java.lang.String r8 = "W"
                boolean r8 = r7.equalsIgnoreCase(r8)
                if (r8 == 0) goto L127
                r10.f25952 = r2
                goto L131
            L127:
                java.lang.String r8 = "H"
                boolean r7 = r7.equalsIgnoreCase(r8)
                if (r7 == 0) goto L131
                r10.f25952 = r6
            L131:
                int r5 = r5 + 1
                goto L135
            L134:
                r5 = r2
            L135:
                java.lang.String r7 = r10.f25950
                r8 = 58
                int r7 = r7.indexOf(r8)
                if (r7 < 0) goto L183
                int r4 = r4 + (-1)
                if (r7 >= r4) goto L183
                java.lang.String r4 = r10.f25950
                java.lang.String r4 = r4.substring(r5, r7)
                java.lang.String r5 = r10.f25950
                int r7 = r7 + 1
                java.lang.String r5 = r5.substring(r7)
                int r7 = r4.length()
                if (r7 <= 0) goto L3cb
                int r7 = r5.length()
                if (r7 <= 0) goto L3cb
                float r4 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.NumberFormatException -> L3cb
                float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.NumberFormatException -> L3cb
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 <= 0) goto L3cb
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 <= 0) goto L3cb
                int r7 = r10.f25952     // Catch: java.lang.NumberFormatException -> L3cb
                if (r7 != r6) goto L17a
                float r5 = r5 / r4
                float r4 = java.lang.Math.abs(r5)     // Catch: java.lang.NumberFormatException -> L3cb
                r10.f25951 = r4     // Catch: java.lang.NumberFormatException -> L3cb
                goto L3cb
            L17a:
                float r4 = r4 / r5
                float r4 = java.lang.Math.abs(r4)     // Catch: java.lang.NumberFormatException -> L3cb
                r10.f25951 = r4     // Catch: java.lang.NumberFormatException -> L3cb
                goto L3cb
            L183:
                java.lang.String r4 = r10.f25950
                java.lang.String r4 = r4.substring(r5)
                int r5 = r4.length()
                if (r5 <= 0) goto L3cb
                float r4 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.NumberFormatException -> L3cb
                r10.f25951 = r4     // Catch: java.lang.NumberFormatException -> L3cb
                goto L3cb
            L197:
                float r5 = r10.f25964
                float r4 = r11.getFloat(r4, r5)
                float r4 = java.lang.Math.max(r3, r4)
                r10.f25964 = r4
                r10.f25958 = r8
                goto L3cb
            L1a7:
                int r5 = r10.f25962     // Catch: java.lang.Exception -> L1b1
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch: java.lang.Exception -> L1b1
                r10.f25962 = r5     // Catch: java.lang.Exception -> L1b1
                goto L3cb
            L1b1:
                int r5 = r10.f25962
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L3cb
                r10.f25962 = r9
                goto L3cb
            L1bd:
                int r5 = r10.f25960     // Catch: java.lang.Exception -> L1c7
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch: java.lang.Exception -> L1c7
                r10.f25960 = r5     // Catch: java.lang.Exception -> L1c7
                goto L3cb
            L1c7:
                int r5 = r10.f25960
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L3cb
                r10.f25960 = r9
                goto L3cb
            L1d3:
                float r5 = r10.f25963
                float r4 = r11.getFloat(r4, r5)
                float r4 = java.lang.Math.max(r3, r4)
                r10.f25963 = r4
                r10.f25957 = r8
                goto L3cb
            L1e3:
                int r5 = r10.f25961     // Catch: java.lang.Exception -> L1ed
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch: java.lang.Exception -> L1ed
                r10.f25961 = r5     // Catch: java.lang.Exception -> L1ed
                goto L3cb
            L1ed:
                int r5 = r10.f25961
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L3cb
                r10.f25961 = r9
                goto L3cb
            L1f9:
                int r5 = r10.f25959     // Catch: java.lang.Exception -> L203
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch: java.lang.Exception -> L203
                r10.f25959 = r5     // Catch: java.lang.Exception -> L203
                goto L3cb
            L203:
                int r5 = r10.f25959
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L3cb
                r10.f25959 = r9
                goto L3cb
            L20f:
                int r4 = r11.getInt(r4, r2)
                r10.f25958 = r4
                if (r4 != r6) goto L3cb
                java.lang.String r4 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
                android.util.Log.e(r7, r4)
                goto L3cb
            L21e:
                int r4 = r11.getInt(r4, r2)
                r10.f25957 = r4
                if (r4 != r6) goto L3cb
                java.lang.String r4 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
                android.util.Log.e(r7, r4)
                goto L3cb
            L22d:
                float r5 = r10.f25949
                float r4 = r11.getFloat(r4, r5)
                r10.f25949 = r4
                goto L3cb
            L237:
                float r5 = r10.f25948
                float r4 = r11.getFloat(r4, r5)
                r10.f25948 = r4
                goto L3cb
            L241:
                boolean r5 = r10.f25969
                boolean r4 = r11.getBoolean(r4, r5)
                r10.f25969 = r4
                goto L3cb
            L24b:
                boolean r5 = r10.f25968
                boolean r4 = r11.getBoolean(r4, r5)
                r10.f25968 = r4
                goto L3cb
            L255:
                int r5 = r10.f25947
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f25947 = r4
                goto L3cb
            L25f:
                int r5 = r10.f25946
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f25946 = r4
                goto L3cb
            L269:
                int r5 = r10.f25945
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f25945 = r4
                goto L3cb
            L273:
                int r5 = r10.f25944
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f25944 = r4
                goto L3cb
            L27d:
                int r5 = r10.f25943
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f25943 = r4
                goto L3cb
            L287:
                int r5 = r10.f25942
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f25942 = r4
                goto L3cb
            L291:
                int r5 = r10.f25941
                int r5 = r11.getResourceId(r4, r5)
                r10.f25941 = r5
                if (r5 != r0) goto L3cb
                int r4 = r11.getInt(r4, r0)
                r10.f25941 = r4
                goto L3cb
            L2a3:
                int r5 = r10.f25940
                int r5 = r11.getResourceId(r4, r5)
                r10.f25940 = r5
                if (r5 != r0) goto L3cb
                int r4 = r11.getInt(r4, r0)
                r10.f25940 = r4
                goto L3cb
            L2b5:
                int r5 = r10.f25939
                int r5 = r11.getResourceId(r4, r5)
                r10.f25939 = r5
                if (r5 != r0) goto L3cb
                int r4 = r11.getInt(r4, r0)
                r10.f25939 = r4
                goto L3cb
            L2c7:
                int r5 = r10.f25938
                int r5 = r11.getResourceId(r4, r5)
                r10.f25938 = r5
                if (r5 != r0) goto L3cb
                int r4 = r11.getInt(r4, r0)
                r10.f25938 = r4
                goto L3cb
            L2d9:
                int r5 = r10.f25934
                int r5 = r11.getResourceId(r4, r5)
                r10.f25934 = r5
                if (r5 != r0) goto L3cb
                int r4 = r11.getInt(r4, r0)
                r10.f25934 = r4
                goto L3cb
            L2eb:
                int r5 = r10.f25933
                int r5 = r11.getResourceId(r4, r5)
                r10.f25933 = r5
                if (r5 != r0) goto L3cb
                int r4 = r11.getInt(r4, r0)
                r10.f25933 = r4
                goto L3cb
            L2fd:
                int r5 = r10.f25932
                int r5 = r11.getResourceId(r4, r5)
                r10.f25932 = r5
                if (r5 != r0) goto L3cb
                int r4 = r11.getInt(r4, r0)
                r10.f25932 = r4
                goto L3cb
            L30f:
                int r5 = r10.f25931
                int r5 = r11.getResourceId(r4, r5)
                r10.f25931 = r5
                if (r5 != r0) goto L3cb
                int r4 = r11.getInt(r4, r0)
                r10.f25931 = r4
                goto L3cb
            L321:
                int r5 = r10.f25930
                int r5 = r11.getResourceId(r4, r5)
                r10.f25930 = r5
                if (r5 != r0) goto L3cb
                int r4 = r11.getInt(r4, r0)
                r10.f25930 = r4
                goto L3cb
            L333:
                int r5 = r10.f25929
                int r5 = r11.getResourceId(r4, r5)
                r10.f25929 = r5
                if (r5 != r0) goto L3cb
                int r4 = r11.getInt(r4, r0)
                r10.f25929 = r4
                goto L3cb
            L345:
                int r5 = r10.f25928
                int r5 = r11.getResourceId(r4, r5)
                r10.f25928 = r5
                if (r5 != r0) goto L3cb
                int r4 = r11.getInt(r4, r0)
                r10.f25928 = r4
                goto L3cb
            L357:
                int r5 = r10.f25927
                int r5 = r11.getResourceId(r4, r5)
                r10.f25927 = r5
                if (r5 != r0) goto L3cb
                int r4 = r11.getInt(r4, r0)
                r10.f25927 = r4
                goto L3cb
            L368:
                int r5 = r10.f25926
                int r5 = r11.getResourceId(r4, r5)
                r10.f25926 = r5
                if (r5 != r0) goto L3cb
                int r4 = r11.getInt(r4, r0)
                r10.f25926 = r4
                goto L3cb
            L379:
                float r5 = r10.f25925
                float r4 = r11.getFloat(r4, r5)
                r10.f25925 = r4
                goto L3cb
            L382:
                int r5 = r10.f25924
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.f25924 = r4
                goto L3cb
            L38b:
                int r5 = r10.f25923
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.f25923 = r4
                goto L3cb
            L394:
                float r5 = r10.f25937
                float r4 = r11.getFloat(r4, r5)
                r5 = 1135869952(0x43b40000, float:360.0)
                float r4 = r4 % r5
                r10.f25937 = r4
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 >= 0) goto L3cb
                float r4 = r5 - r4
                float r4 = r4 % r5
                r10.f25937 = r4
                goto L3cb
            L3a9:
                int r5 = r10.f25936
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f25936 = r4
                goto L3cb
            L3b2:
                int r5 = r10.f25935
                int r5 = r11.getResourceId(r4, r5)
                r10.f25935 = r5
                if (r5 != r0) goto L3cb
                int r4 = r11.getInt(r4, r0)
                r10.f25935 = r4
                goto L3cb
            L3c3:
                int r5 = r10.f25967
                int r4 = r11.getInt(r4, r5)
                r10.f25967 = r4
            L3cb:
                int r1 = r1 + 1
                goto L9e
            L3cf:
                r11.recycle()
                r10.m28506()
                return
        }

        public C7450(android.view.ViewGroup.LayoutParams r6) {
                r5 = this;
                r5.<init>(r6)
                r6 = -1
                r5.f25923 = r6
                r5.f25924 = r6
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r5.f25925 = r0
                r5.f25926 = r6
                r5.f25927 = r6
                r5.f25928 = r6
                r5.f25929 = r6
                r5.f25930 = r6
                r5.f25931 = r6
                r5.f25932 = r6
                r5.f25933 = r6
                r5.f25934 = r6
                r5.f25935 = r6
                r1 = 0
                r5.f25936 = r1
                r2 = 0
                r5.f25937 = r2
                r5.f25938 = r6
                r5.f25939 = r6
                r5.f25940 = r6
                r5.f25941 = r6
                r5.f25942 = r6
                r5.f25943 = r6
                r5.f25944 = r6
                r5.f25945 = r6
                r5.f25946 = r6
                r5.f25947 = r6
                r3 = 1056964608(0x3f000000, float:0.5)
                r5.f25948 = r3
                r5.f25949 = r3
                r4 = 0
                r5.f25950 = r4
                r5.f25951 = r2
                r2 = 1
                r5.f25952 = r2
                r5.f25953 = r0
                r5.f25954 = r0
                r5.f25955 = r1
                r5.f25956 = r1
                r5.f25957 = r1
                r5.f25958 = r1
                r5.f25959 = r1
                r5.f25960 = r1
                r5.f25961 = r1
                r5.f25962 = r1
                r0 = 1065353216(0x3f800000, float:1.0)
                r5.f25963 = r0
                r5.f25964 = r0
                r5.f25965 = r6
                r5.f25966 = r6
                r5.f25967 = r6
                r5.f25968 = r1
                r5.f25969 = r1
                r5.f25970 = r4
                r5.f25971 = r2
                r5.f25972 = r2
                r5.f25973 = r1
                r5.f25974 = r1
                r5.f25975 = r1
                r5.f25976 = r1
                r5.f25977 = r1
                r5.f25978 = r6
                r5.f25979 = r6
                r5.f25980 = r6
                r5.f25981 = r6
                r5.f25982 = r6
                r5.f25983 = r6
                r5.f25984 = r3
                Yue.ۥ۟ۧ۟ۢ r6 = new Yue.ۥ۟ۧ۟ۢ
                r6.<init>()
                r5.f25988 = r6
                r5.f25989 = r1
                return
        }

        public C7450(androidx.constraintlayout.widget.ConstraintLayout.C7450 r7) {
                r6 = this;
                r6.<init>(r7)
                r0 = -1
                r6.f25923 = r0
                r6.f25924 = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r6.f25925 = r1
                r6.f25926 = r0
                r6.f25927 = r0
                r6.f25928 = r0
                r6.f25929 = r0
                r6.f25930 = r0
                r6.f25931 = r0
                r6.f25932 = r0
                r6.f25933 = r0
                r6.f25934 = r0
                r6.f25935 = r0
                r2 = 0
                r6.f25936 = r2
                r3 = 0
                r6.f25937 = r3
                r6.f25938 = r0
                r6.f25939 = r0
                r6.f25940 = r0
                r6.f25941 = r0
                r6.f25942 = r0
                r6.f25943 = r0
                r6.f25944 = r0
                r6.f25945 = r0
                r6.f25946 = r0
                r6.f25947 = r0
                r4 = 1056964608(0x3f000000, float:0.5)
                r6.f25948 = r4
                r6.f25949 = r4
                r5 = 0
                r6.f25950 = r5
                r6.f25951 = r3
                r3 = 1
                r6.f25952 = r3
                r6.f25953 = r1
                r6.f25954 = r1
                r6.f25955 = r2
                r6.f25956 = r2
                r6.f25957 = r2
                r6.f25958 = r2
                r6.f25959 = r2
                r6.f25960 = r2
                r6.f25961 = r2
                r6.f25962 = r2
                r1 = 1065353216(0x3f800000, float:1.0)
                r6.f25963 = r1
                r6.f25964 = r1
                r6.f25965 = r0
                r6.f25966 = r0
                r6.f25967 = r0
                r6.f25968 = r2
                r6.f25969 = r2
                r6.f25970 = r5
                r6.f25971 = r3
                r6.f25972 = r3
                r6.f25973 = r2
                r6.f25974 = r2
                r6.f25975 = r2
                r6.f25976 = r2
                r6.f25977 = r2
                r6.f25978 = r0
                r6.f25979 = r0
                r6.f25980 = r0
                r6.f25981 = r0
                r6.f25982 = r0
                r6.f25983 = r0
                r6.f25984 = r4
                Yue.ۥ۟ۧ۟ۢ r0 = new Yue.ۥ۟ۧ۟ۢ
                r0.<init>()
                r6.f25988 = r0
                r6.f25989 = r2
                int r0 = r7.f25923
                r6.f25923 = r0
                int r0 = r7.f25924
                r6.f25924 = r0
                float r0 = r7.f25925
                r6.f25925 = r0
                int r0 = r7.f25926
                r6.f25926 = r0
                int r0 = r7.f25927
                r6.f25927 = r0
                int r0 = r7.f25928
                r6.f25928 = r0
                int r0 = r7.f25929
                r6.f25929 = r0
                int r0 = r7.f25930
                r6.f25930 = r0
                int r0 = r7.f25931
                r6.f25931 = r0
                int r0 = r7.f25932
                r6.f25932 = r0
                int r0 = r7.f25933
                r6.f25933 = r0
                int r0 = r7.f25934
                r6.f25934 = r0
                int r0 = r7.f25935
                r6.f25935 = r0
                int r0 = r7.f25936
                r6.f25936 = r0
                float r0 = r7.f25937
                r6.f25937 = r0
                int r0 = r7.f25938
                r6.f25938 = r0
                int r0 = r7.f25939
                r6.f25939 = r0
                int r0 = r7.f25940
                r6.f25940 = r0
                int r0 = r7.f25941
                r6.f25941 = r0
                int r0 = r7.f25942
                r6.f25942 = r0
                int r0 = r7.f25943
                r6.f25943 = r0
                int r0 = r7.f25944
                r6.f25944 = r0
                int r0 = r7.f25945
                r6.f25945 = r0
                int r0 = r7.f25946
                r6.f25946 = r0
                int r0 = r7.f25947
                r6.f25947 = r0
                float r0 = r7.f25948
                r6.f25948 = r0
                float r0 = r7.f25949
                r6.f25949 = r0
                java.lang.String r0 = r7.f25950
                r6.f25950 = r0
                float r0 = r7.f25951
                r6.f25951 = r0
                int r0 = r7.f25952
                r6.f25952 = r0
                float r0 = r7.f25953
                r6.f25953 = r0
                float r0 = r7.f25954
                r6.f25954 = r0
                int r0 = r7.f25955
                r6.f25955 = r0
                int r0 = r7.f25956
                r6.f25956 = r0
                boolean r0 = r7.f25968
                r6.f25968 = r0
                boolean r0 = r7.f25969
                r6.f25969 = r0
                int r0 = r7.f25957
                r6.f25957 = r0
                int r0 = r7.f25958
                r6.f25958 = r0
                int r0 = r7.f25959
                r6.f25959 = r0
                int r0 = r7.f25961
                r6.f25961 = r0
                int r0 = r7.f25960
                r6.f25960 = r0
                int r0 = r7.f25962
                r6.f25962 = r0
                float r0 = r7.f25963
                r6.f25963 = r0
                float r0 = r7.f25964
                r6.f25964 = r0
                int r0 = r7.f25965
                r6.f25965 = r0
                int r0 = r7.f25966
                r6.f25966 = r0
                int r0 = r7.f25967
                r6.f25967 = r0
                boolean r0 = r7.f25971
                r6.f25971 = r0
                boolean r0 = r7.f25972
                r6.f25972 = r0
                boolean r0 = r7.f25973
                r6.f25973 = r0
                boolean r0 = r7.f25974
                r6.f25974 = r0
                int r0 = r7.f25978
                r6.f25978 = r0
                int r0 = r7.f25979
                r6.f25979 = r0
                int r0 = r7.f25980
                r6.f25980 = r0
                int r0 = r7.f25981
                r6.f25981 = r0
                int r0 = r7.f25982
                r6.f25982 = r0
                int r0 = r7.f25983
                r6.f25983 = r0
                float r0 = r7.f25984
                r6.f25984 = r0
                java.lang.String r0 = r7.f25970
                r6.f25970 = r0
                Yue.ۥ۟ۧ۟ۢ r7 = r7.f25988
                r6.f25988 = r7
                return
        }

        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        public void resolveLayoutDirection(int r10) {
                r9 = this;
                int r0 = r9.leftMargin
                int r1 = r9.rightMargin
                super.resolveLayoutDirection(r10)
                int r10 = r9.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r10) goto L11
                r10 = r3
                goto L12
            L11:
                r10 = r2
            L12:
                r4 = -1
                r9.f25980 = r4
                r9.f25981 = r4
                r9.f25978 = r4
                r9.f25979 = r4
                int r5 = r9.f25942
                r9.f25982 = r5
                int r5 = r9.f25944
                r9.f25983 = r5
                float r5 = r9.f25948
                r9.f25984 = r5
                int r6 = r9.f25923
                r9.f25985 = r6
                int r7 = r9.f25924
                r9.f25986 = r7
                float r8 = r9.f25925
                r9.f25987 = r8
                if (r10 == 0) goto L8e
                int r10 = r9.f25938
                if (r10 == r4) goto L3d
                r9.f25980 = r10
            L3b:
                r2 = r3
                goto L44
            L3d:
                int r10 = r9.f25939
                if (r10 == r4) goto L44
                r9.f25981 = r10
                goto L3b
            L44:
                int r10 = r9.f25940
                if (r10 == r4) goto L4b
                r9.f25979 = r10
                r2 = r3
            L4b:
                int r10 = r9.f25941
                if (r10 == r4) goto L52
                r9.f25978 = r10
                r2 = r3
            L52:
                int r10 = r9.f25946
                if (r10 == r4) goto L58
                r9.f25983 = r10
            L58:
                int r10 = r9.f25947
                if (r10 == r4) goto L5e
                r9.f25982 = r10
            L5e:
                r10 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L66
                float r2 = r10 - r5
                r9.f25984 = r2
            L66:
                boolean r2 = r9.f25974
                if (r2 == 0) goto Lb2
                int r2 = r9.f25967
                if (r2 != r3) goto Lb2
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L7c
                float r10 = r10 - r8
                r9.f25987 = r10
                r9.f25985 = r4
                r9.f25986 = r4
                goto Lb2
            L7c:
                if (r6 == r4) goto L85
                r9.f25986 = r6
                r9.f25985 = r4
                r9.f25987 = r2
                goto Lb2
            L85:
                if (r7 == r4) goto Lb2
                r9.f25985 = r7
                r9.f25986 = r4
                r9.f25987 = r2
                goto Lb2
            L8e:
                int r10 = r9.f25938
                if (r10 == r4) goto L94
                r9.f25979 = r10
            L94:
                int r10 = r9.f25939
                if (r10 == r4) goto L9a
                r9.f25978 = r10
            L9a:
                int r10 = r9.f25940
                if (r10 == r4) goto La0
                r9.f25980 = r10
            La0:
                int r10 = r9.f25941
                if (r10 == r4) goto La6
                r9.f25981 = r10
            La6:
                int r10 = r9.f25946
                if (r10 == r4) goto Lac
                r9.f25982 = r10
            Lac:
                int r10 = r9.f25947
                if (r10 == r4) goto Lb2
                r9.f25983 = r10
            Lb2:
                int r10 = r9.f25940
                if (r10 != r4) goto Lfc
                int r10 = r9.f25941
                if (r10 != r4) goto Lfc
                int r10 = r9.f25939
                if (r10 != r4) goto Lfc
                int r10 = r9.f25938
                if (r10 != r4) goto Lfc
                int r10 = r9.f25928
                if (r10 == r4) goto Ld1
                r9.f25980 = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto Ldf
                if (r1 <= 0) goto Ldf
                r9.rightMargin = r1
                goto Ldf
            Ld1:
                int r10 = r9.f25929
                if (r10 == r4) goto Ldf
                r9.f25981 = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto Ldf
                if (r1 <= 0) goto Ldf
                r9.rightMargin = r1
            Ldf:
                int r10 = r9.f25926
                if (r10 == r4) goto Lee
                r9.f25978 = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto Lfc
                if (r0 <= 0) goto Lfc
                r9.leftMargin = r0
                goto Lfc
            Lee:
                int r10 = r9.f25927
                if (r10 == r4) goto Lfc
                r9.f25979 = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto Lfc
                if (r0 <= 0) goto Lfc
                r9.leftMargin = r0
            Lfc:
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.lang.String m28502() {
                r1 = this;
                java.lang.String r0 = r1.f25970
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C1517 m28503() {
                r1 = this;
                Yue.ۥ۟ۧ۟ۢ r0 = r1.f25988
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m28504() {
                r1 = this;
                Yue.ۥ۟ۧ۟ۢ r0 = r1.f25988
                if (r0 == 0) goto L7
                r0.mo7564()
            L7:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m28505(java.lang.String r2) {
                r1 = this;
                Yue.ۥ۟ۧ۟ۢ r0 = r1.f25988
                r0.m7573(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m28506() {
                r6 = this;
                r0 = 0
                r6.f25974 = r0
                r1 = 1
                r6.f25971 = r1
                r6.f25972 = r1
                int r2 = r6.width
                r3 = -2
                if (r2 != r3) goto L19
                boolean r4 = r6.f25968
                if (r4 == 0) goto L19
                r6.f25971 = r0
                int r4 = r6.f25957
                if (r4 != 0) goto L19
                r6.f25957 = r1
            L19:
                int r4 = r6.height
                if (r4 != r3) goto L29
                boolean r5 = r6.f25969
                if (r5 == 0) goto L29
                r6.f25972 = r0
                int r5 = r6.f25958
                if (r5 != 0) goto L29
                r6.f25958 = r1
            L29:
                r5 = -1
                if (r2 == 0) goto L2e
                if (r2 != r5) goto L3a
            L2e:
                r6.f25971 = r0
                if (r2 != 0) goto L3a
                int r2 = r6.f25957
                if (r2 != r1) goto L3a
                r6.width = r3
                r6.f25968 = r1
            L3a:
                if (r4 == 0) goto L3e
                if (r4 != r5) goto L4a
            L3e:
                r6.f25972 = r0
                if (r4 != 0) goto L4a
                int r0 = r6.f25958
                if (r0 != r1) goto L4a
                r6.height = r3
                r6.f25969 = r1
            L4a:
                float r0 = r6.f25925
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L5a
                int r0 = r6.f25923
                if (r0 != r5) goto L5a
                int r0 = r6.f25924
                if (r0 == r5) goto L76
            L5a:
                r6.f25974 = r1
                r6.f25971 = r1
                r6.f25972 = r1
                Yue.ۥ۟ۧ۟ۢ r0 = r6.f25988
                boolean r0 = r0 instanceof Yue.C2948
                if (r0 != 0) goto L6d
                Yue.ۥ۠ۤ۟ۧ r0 = new Yue.ۥ۠ۤ۟ۧ
                r0.<init>()
                r6.f25988 = r0
            L6d:
                Yue.ۥ۟ۧ۟ۢ r0 = r6.f25988
                Yue.ۥ۠ۤ۟ۧ r0 = (Yue.C2948) r0
                int r1 = r6.f25967
                r0.m12558(r1)
            L76:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$ۥ۟۟, reason: contains not printable characters */
    public class C7452 implements Yue.C0746.InterfaceC0748 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public androidx.constraintlayout.widget.ConstraintLayout f26043;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f26044;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f26045;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f26046;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f26047;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f26048;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f26049;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final /* synthetic */ androidx.constraintlayout.widget.ConstraintLayout f26050;

        public C7452(androidx.constraintlayout.widget.ConstraintLayout r1, androidx.constraintlayout.widget.ConstraintLayout r2) {
                r0 = this;
                r0.f26050 = r1
                r0.<init>()
                r0.f26043 = r2
                return
        }

        @Override // Yue.C0746.InterfaceC0748
        /* JADX INFO: renamed from: ۥ */
        public final void mo4603() {
                r5 = this;
                androidx.constraintlayout.widget.ConstraintLayout r0 = r5.f26043
                int r0 = r0.getChildCount()
                r1 = 0
                r2 = r1
            L8:
                if (r2 >= r0) goto L1e
                androidx.constraintlayout.widget.ConstraintLayout r3 = r5.f26043
                android.view.View r3 = r3.getChildAt(r2)
                boolean r4 = r3 instanceof androidx.constraintlayout.widget.C7472
                if (r4 == 0) goto L1b
                androidx.constraintlayout.widget.ۥ۟۟۟ۤ r3 = (androidx.constraintlayout.widget.C7472) r3
                androidx.constraintlayout.widget.ConstraintLayout r4 = r5.f26043
                r3.m28748(r4)
            L1b:
                int r2 = r2 + 1
                goto L8
            L1e:
                androidx.constraintlayout.widget.ConstraintLayout r0 = r5.f26043
                java.util.ArrayList r0 = androidx.constraintlayout.widget.ConstraintLayout.access$100(r0)
                int r0 = r0.size()
                if (r0 <= 0) goto L40
            L2a:
                if (r1 >= r0) goto L40
                androidx.constraintlayout.widget.ConstraintLayout r2 = r5.f26043
                java.util.ArrayList r2 = androidx.constraintlayout.widget.ConstraintLayout.access$100(r2)
                java.lang.Object r2 = r2.get(r1)
                androidx.constraintlayout.widget.ۥ۟۟ r2 = (androidx.constraintlayout.widget.AbstractC7457) r2
                androidx.constraintlayout.widget.ConstraintLayout r3 = r5.f26043
                r2.m28539(r3)
                int r1 = r1 + 1
                goto L2a
            L40:
                return
        }

        @Override // Yue.C0746.InterfaceC0748
        @android.annotation.SuppressLint({"WrongCall"})
        /* JADX INFO: renamed from: ۥ۟ */
        public final void mo4604(Yue.C1517 r18, Yue.C0746.C0747 r19) {
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                if (r1 != 0) goto L9
                return
            L9:
                int r3 = r18.m7543()
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L1f
                boolean r3 = r18.m7554()
                if (r3 != 0) goto L1f
                r2.f2099 = r5
                r2.f2100 = r5
                r2.f2101 = r5
                return
            L1f:
                Yue.ۥ۟ۧ۟ۢ r3 = r18.m7529()
                if (r3 != 0) goto L26
                return
            L26:
                Yue.ۥ۟ۧ۟ۢ$ۥ۟ r3 = r2.f2095
                Yue.ۥ۟ۧ۟ۢ$ۥ۟ r4 = r2.f2096
                int r6 = r2.f2097
                int r7 = r2.f2098
                int r8 = r0.f26044
                int r9 = r0.f26045
                int r8 = r8 + r9
                int r9 = r0.f26046
                java.lang.Object r10 = r18.m7505()
                android.view.View r10 = (android.view.View) r10
                int[] r11 = androidx.constraintlayout.widget.ConstraintLayout.C7449.f25904
                int r12 = r3.ordinal()
                r12 = r11[r12]
                r13 = 4
                r14 = 3
                r15 = 2
                r5 = 1
                if (r12 == r5) goto Lb1
                if (r12 == r15) goto La7
                if (r12 == r14) goto L98
                if (r12 == r13) goto L52
                r6 = 0
                goto Lb7
            L52:
                int r6 = r0.f26048
                r12 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                int r9 = r1.f4834
                if (r9 != r5) goto L5f
                r9 = r5
                goto L60
            L5f:
                r9 = 0
            L60:
                int r12 = r2.f2104
                int r13 = Yue.C0746.C0747.f2093
                if (r12 == r13) goto L6a
                int r13 = Yue.C0746.C0747.f2094
                if (r12 != r13) goto Lb7
            L6a:
                int r12 = r10.getMeasuredHeight()
                int r13 = r18.m7512()
                if (r12 != r13) goto L76
                r12 = r5
                goto L77
            L76:
                r12 = 0
            L77:
                int r13 = r2.f2104
                int r14 = Yue.C0746.C0747.f2094
                if (r13 == r14) goto L8d
                if (r9 == 0) goto L8d
                if (r9 == 0) goto L83
                if (r12 != 0) goto L8d
            L83:
                boolean r9 = r10 instanceof androidx.constraintlayout.widget.C7472
                if (r9 != 0) goto L8d
                boolean r9 = r18.mo4467()
                if (r9 == 0) goto Lb7
            L8d:
                int r6 = r18.m7544()
                r12 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r12)
                goto Lb7
            L98:
                r12 = 1073741824(0x40000000, float:2.0)
                int r6 = r0.f26048
                int r13 = r18.m7517()
                int r9 = r9 + r13
                r13 = -1
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r13)
                goto Lb7
            La7:
                r12 = 1073741824(0x40000000, float:2.0)
                int r6 = r0.f26048
                r13 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r13)
                goto Lb7
            Lb1:
                r12 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r12)
            Lb7:
                int r9 = r4.ordinal()
                r9 = r11[r9]
                if (r9 == r5) goto L129
                if (r9 == r15) goto L11f
                r7 = 3
                if (r9 == r7) goto L110
                r7 = 4
                if (r9 == r7) goto Lca
                r7 = 0
                goto L12f
            Lca:
                int r7 = r0.f26049
                r9 = -2
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r9)
                int r8 = r1.f4835
                if (r8 != r5) goto Ld7
                r8 = r5
                goto Ld8
            Ld7:
                r8 = 0
            Ld8:
                int r9 = r2.f2104
                int r11 = Yue.C0746.C0747.f2093
                if (r9 == r11) goto Le2
                int r11 = Yue.C0746.C0747.f2094
                if (r9 != r11) goto L12f
            Le2:
                int r9 = r10.getMeasuredWidth()
                int r11 = r18.m7544()
                if (r9 != r11) goto Lee
                r9 = r5
                goto Lef
            Lee:
                r9 = 0
            Lef:
                int r11 = r2.f2104
                int r12 = Yue.C0746.C0747.f2094
                if (r11 == r12) goto L105
                if (r8 == 0) goto L105
                if (r8 == 0) goto Lfb
                if (r9 != 0) goto L105
            Lfb:
                boolean r8 = r10 instanceof androidx.constraintlayout.widget.C7472
                if (r8 != 0) goto L105
                boolean r8 = r18.mo4468()
                if (r8 == 0) goto L12f
            L105:
                int r7 = r18.m7512()
                r9 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
                goto L12f
            L110:
                r9 = 1073741824(0x40000000, float:2.0)
                int r7 = r0.f26049
                int r11 = r18.m7542()
                int r8 = r8 + r11
                r11 = -1
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r11)
                goto L12f
            L11f:
                r9 = 1073741824(0x40000000, float:2.0)
                int r7 = r0.f26049
                r11 = -2
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r11)
                goto L12f
            L129:
                r9 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            L12f:
                Yue.ۥ۟ۧ۟ۢ r8 = r18.m7529()
                Yue.ۥۣ۟ۧ۟ r8 = (Yue.C1520) r8
                if (r8 == 0) goto L1ac
                androidx.constraintlayout.widget.ConstraintLayout r9 = r0.f26050
                int r9 = androidx.constraintlayout.widget.ConstraintLayout.access$000(r9)
                r11 = 256(0x100, float:3.59E-43)
                boolean r9 = Yue.C4647.m18468(r9, r11)
                if (r9 == 0) goto L1ac
                int r9 = r10.getMeasuredWidth()
                int r11 = r18.m7544()
                if (r9 != r11) goto L1ac
                int r9 = r10.getMeasuredWidth()
                int r11 = r8.m7544()
                if (r9 >= r11) goto L1ac
                int r9 = r10.getMeasuredHeight()
                int r11 = r18.m7512()
                if (r9 != r11) goto L1ac
                int r9 = r10.getMeasuredHeight()
                int r8 = r8.m7512()
                if (r9 >= r8) goto L1ac
                int r8 = r10.getBaseline()
                int r9 = r18.m7502()
                if (r8 != r9) goto L1ac
                boolean r8 = r18.m7557()
                if (r8 != 0) goto L1ac
                int r8 = r18.m7518()
                int r9 = r18.m7544()
                boolean r8 = r0.m28508(r8, r6, r9)
                if (r8 == 0) goto L1ac
                int r8 = r18.m7519()
                int r9 = r18.m7512()
                boolean r8 = r0.m28508(r8, r7, r9)
                if (r8 == 0) goto L1ac
                int r3 = r18.m7544()
                r2.f2099 = r3
                int r3 = r18.m7512()
                r2.f2100 = r3
                int r1 = r18.m7502()
                r2.f2101 = r1
                return
            L1ac:
                Yue.ۥ۟ۧ۟ۢ$ۥ۟ r8 = Yue.C1517.EnumC1519.f4913
                if (r3 != r8) goto L1b2
                r9 = r5
                goto L1b3
            L1b2:
                r9 = 0
            L1b3:
                if (r4 != r8) goto L1b7
                r8 = r5
                goto L1b8
            L1b7:
                r8 = 0
            L1b8:
                Yue.ۥ۟ۧ۟ۢ$ۥ۟ r11 = Yue.C1517.EnumC1519.f4914
                if (r4 == r11) goto L1c3
                Yue.ۥ۟ۧ۟ۢ$ۥ۟ r12 = Yue.C1517.EnumC1519.f4911
                if (r4 != r12) goto L1c1
                goto L1c3
            L1c1:
                r4 = 0
                goto L1c4
            L1c3:
                r4 = r5
            L1c4:
                if (r3 == r11) goto L1cd
                Yue.ۥ۟ۧ۟ۢ$ۥ۟ r11 = Yue.C1517.EnumC1519.f4911
                if (r3 != r11) goto L1cb
                goto L1cd
            L1cb:
                r3 = 0
                goto L1ce
            L1cd:
                r3 = r5
            L1ce:
                r11 = 0
                if (r9 == 0) goto L1d9
                float r12 = r1.f4869
                int r12 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
                if (r12 <= 0) goto L1d9
                r12 = r5
                goto L1da
            L1d9:
                r12 = 0
            L1da:
                if (r8 == 0) goto L1e4
                float r13 = r1.f4869
                int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r11 <= 0) goto L1e4
                r11 = r5
                goto L1e5
            L1e4:
                r11 = 0
            L1e5:
                if (r10 != 0) goto L1e8
                return
            L1e8:
                android.view.ViewGroup$LayoutParams r13 = r10.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r13 = (androidx.constraintlayout.widget.ConstraintLayout.C7450) r13
                int r14 = r2.f2104
                int r15 = Yue.C0746.C0747.f2093
                if (r14 == r15) goto L20b
                int r15 = Yue.C0746.C0747.f2094
                if (r14 == r15) goto L20b
                if (r9 == 0) goto L20b
                int r9 = r1.f4834
                if (r9 != 0) goto L20b
                if (r8 == 0) goto L20b
                int r8 = r1.f4835
                if (r8 == 0) goto L205
                goto L20b
            L205:
                r0 = -1
                r5 = 0
                r14 = 0
                r15 = 0
                goto L2a6
            L20b:
                boolean r8 = r10 instanceof androidx.constraintlayout.widget.AbstractC7490
                if (r8 == 0) goto L21d
                boolean r8 = r1 instanceof Yue.C6952
                if (r8 == 0) goto L21d
                r8 = r1
                Yue.ۥۢۥ۟ۢ r8 = (Yue.C6952) r8
                r9 = r10
                androidx.constraintlayout.widget.ۥ۟۟۟ۧ r9 = (androidx.constraintlayout.widget.AbstractC7490) r9
                r9.mo28496(r8, r6, r7)
                goto L220
            L21d:
                r10.measure(r6, r7)
            L220:
                r1.m7599(r6, r7)
                int r8 = r10.getMeasuredWidth()
                int r9 = r10.getMeasuredHeight()
                int r14 = r10.getBaseline()
                int r15 = r1.f4837
                if (r15 <= 0) goto L238
                int r15 = java.lang.Math.max(r15, r8)
                goto L239
            L238:
                r15 = r8
            L239:
                int r5 = r1.f4838
                if (r5 <= 0) goto L241
                int r15 = java.lang.Math.min(r5, r15)
            L241:
                int r5 = r1.f4840
                if (r5 <= 0) goto L24c
                int r5 = java.lang.Math.max(r5, r9)
                r16 = r6
                goto L24f
            L24c:
                r16 = r6
                r5 = r9
            L24f:
                int r6 = r1.f4841
                if (r6 <= 0) goto L257
                int r5 = java.lang.Math.min(r6, r5)
            L257:
                androidx.constraintlayout.widget.ConstraintLayout r6 = r0.f26050
                int r6 = androidx.constraintlayout.widget.ConstraintLayout.access$000(r6)
                r0 = 1
                boolean r6 = Yue.C4647.m18468(r6, r0)
                if (r6 != 0) goto L27b
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r12 == 0) goto L271
                if (r4 == 0) goto L271
                float r3 = r1.f4869
                float r4 = (float) r5
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r15 = (int) r4
                goto L27b
            L271:
                if (r11 == 0) goto L27b
                if (r3 == 0) goto L27b
                float r3 = r1.f4869
                float r4 = (float) r15
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r5 = (int) r4
            L27b:
                if (r8 != r15) goto L282
                if (r9 == r5) goto L280
                goto L282
            L280:
                r0 = -1
                goto L2a6
            L282:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r8 == r15) goto L28b
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
                goto L28d
            L28b:
                r6 = r16
            L28d:
                if (r9 == r5) goto L293
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            L293:
                r10.measure(r6, r7)
                r1.m7599(r6, r7)
                int r15 = r10.getMeasuredWidth()
                int r5 = r10.getMeasuredHeight()
                int r14 = r10.getBaseline()
                goto L280
            L2a6:
                if (r14 == r0) goto L2aa
                r0 = 1
                goto L2ab
            L2aa:
                r0 = 0
            L2ab:
                int r3 = r2.f2097
                if (r15 != r3) goto L2b6
                int r3 = r2.f2098
                if (r5 == r3) goto L2b4
                goto L2b6
            L2b4:
                r3 = 0
                goto L2b7
            L2b6:
                r3 = 1
            L2b7:
                r2.f2103 = r3
                boolean r3 = r13.f25973
                if (r3 == 0) goto L2be
                r0 = 1
            L2be:
                if (r0 == 0) goto L2cc
                r3 = -1
                if (r14 == r3) goto L2cc
                int r1 = r18.m7502()
                if (r1 == r14) goto L2cc
                r1 = 1
                r2.f2103 = r1
            L2cc:
                r2.f2099 = r15
                r2.f2100 = r5
                r2.f2102 = r0
                r2.f2101 = r14
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m28507(int r1, int r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                r0.f26044 = r3
                r0.f26045 = r4
                r0.f26046 = r5
                r0.f26047 = r6
                r0.f26048 = r1
                r0.f26049 = r2
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m28508(int r4, int r5, int r6) {
                r3 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                int r1 = android.view.View.MeasureSpec.getMode(r4)
                android.view.View.MeasureSpec.getSize(r4)
                int r4 = android.view.View.MeasureSpec.getMode(r5)
                int r5 = android.view.View.MeasureSpec.getSize(r5)
                r2 = 1073741824(0x40000000, float:2.0)
                if (r4 != r2) goto L20
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r1 == r4) goto L1d
                if (r1 != 0) goto L20
            L1d:
                if (r6 != r5) goto L20
                return r0
            L20:
                r4 = 0
                return r4
        }
    }

    public ConstraintLayout(@Yue.InterfaceC4410 android.content.Context r4) {
            r3 = this;
            r3.<init>(r4)
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            r3.mChildrenByIds = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 4
            r4.<init>(r0)
            r3.mConstraintHelpers = r4
            Yue.ۥۣ۟ۧ۟ r4 = new Yue.ۥۣ۟ۧ۟
            r4.<init>()
            r3.mLayoutWidget = r4
            r4 = 0
            r3.mMinWidth = r4
            r3.mMinHeight = r4
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3.mMaxWidth = r0
            r3.mMaxHeight = r0
            r0 = 1
            r3.mDirtyHierarchy = r0
            r0 = 257(0x101, float:3.6E-43)
            r3.mOptimizationLevel = r0
            r0 = 0
            r3.mConstraintSet = r0
            r3.mConstraintLayoutSpec = r0
            r1 = -1
            r3.mConstraintSetId = r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3.mDesignIds = r2
            r3.mLastMeasureWidth = r1
            r3.mLastMeasureHeight = r1
            r3.mLastMeasureWidthSize = r1
            r3.mLastMeasureHeightSize = r1
            r3.mLastMeasureWidthMode = r4
            r3.mLastMeasureHeightMode = r4
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r3.mTempMapIdToWidget = r1
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟۟ r1 = new androidx.constraintlayout.widget.ConstraintLayout$ۥ۟۟
            r1.<init>(r3, r3)
            r3.mMeasurer = r1
            r3.mOnMeasureWidthMeasureSpec = r4
            r3.mOnMeasureHeightMeasureSpec = r4
            r3.m28498(r0, r4, r4)
            return
    }

    public ConstraintLayout(@Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4544 android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r2.mChildrenByIds = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 4
            r3.<init>(r0)
            r2.mConstraintHelpers = r3
            Yue.ۥۣ۟ۧ۟ r3 = new Yue.ۥۣ۟ۧ۟
            r3.<init>()
            r2.mLayoutWidget = r3
            r3 = 0
            r2.mMinWidth = r3
            r2.mMinHeight = r3
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.mMaxWidth = r0
            r2.mMaxHeight = r0
            r0 = 1
            r2.mDirtyHierarchy = r0
            r0 = 257(0x101, float:3.6E-43)
            r2.mOptimizationLevel = r0
            r0 = 0
            r2.mConstraintSet = r0
            r2.mConstraintLayoutSpec = r0
            r0 = -1
            r2.mConstraintSetId = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.mDesignIds = r1
            r2.mLastMeasureWidth = r0
            r2.mLastMeasureHeight = r0
            r2.mLastMeasureWidthSize = r0
            r2.mLastMeasureHeightSize = r0
            r2.mLastMeasureWidthMode = r3
            r2.mLastMeasureHeightMode = r3
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.mTempMapIdToWidget = r0
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟۟ r0 = new androidx.constraintlayout.widget.ConstraintLayout$ۥ۟۟
            r0.<init>(r2, r2)
            r2.mMeasurer = r0
            r2.mOnMeasureWidthMeasureSpec = r3
            r2.mOnMeasureHeightMeasureSpec = r3
            r2.m28498(r4, r3, r3)
            return
    }

    public ConstraintLayout(@Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4544 android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r2.mChildrenByIds = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 4
            r3.<init>(r0)
            r2.mConstraintHelpers = r3
            Yue.ۥۣ۟ۧ۟ r3 = new Yue.ۥۣ۟ۧ۟
            r3.<init>()
            r2.mLayoutWidget = r3
            r3 = 0
            r2.mMinWidth = r3
            r2.mMinHeight = r3
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.mMaxWidth = r0
            r2.mMaxHeight = r0
            r0 = 1
            r2.mDirtyHierarchy = r0
            r0 = 257(0x101, float:3.6E-43)
            r2.mOptimizationLevel = r0
            r0 = 0
            r2.mConstraintSet = r0
            r2.mConstraintLayoutSpec = r0
            r0 = -1
            r2.mConstraintSetId = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.mDesignIds = r1
            r2.mLastMeasureWidth = r0
            r2.mLastMeasureHeight = r0
            r2.mLastMeasureWidthSize = r0
            r2.mLastMeasureHeightSize = r0
            r2.mLastMeasureWidthMode = r3
            r2.mLastMeasureHeightMode = r3
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.mTempMapIdToWidget = r0
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟۟ r0 = new androidx.constraintlayout.widget.ConstraintLayout$ۥ۟۟
            r0.<init>(r2, r2)
            r2.mMeasurer = r0
            r2.mOnMeasureWidthMeasureSpec = r3
            r2.mOnMeasureHeightMeasureSpec = r3
            r2.m28498(r4, r5, r3)
            return
    }

    @android.annotation.TargetApi(21)
    public ConstraintLayout(@Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4544 android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>(r3, r4, r5, r6)
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r2.mChildrenByIds = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 4
            r3.<init>(r0)
            r2.mConstraintHelpers = r3
            Yue.ۥۣ۟ۧ۟ r3 = new Yue.ۥۣ۟ۧ۟
            r3.<init>()
            r2.mLayoutWidget = r3
            r3 = 0
            r2.mMinWidth = r3
            r2.mMinHeight = r3
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.mMaxWidth = r0
            r2.mMaxHeight = r0
            r0 = 1
            r2.mDirtyHierarchy = r0
            r0 = 257(0x101, float:3.6E-43)
            r2.mOptimizationLevel = r0
            r0 = 0
            r2.mConstraintSet = r0
            r2.mConstraintLayoutSpec = r0
            r0 = -1
            r2.mConstraintSetId = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.mDesignIds = r1
            r2.mLastMeasureWidth = r0
            r2.mLastMeasureHeight = r0
            r2.mLastMeasureWidthSize = r0
            r2.mLastMeasureHeightSize = r0
            r2.mLastMeasureWidthMode = r3
            r2.mLastMeasureHeightMode = r3
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.mTempMapIdToWidget = r0
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟۟ r0 = new androidx.constraintlayout.widget.ConstraintLayout$ۥ۟۟
            r0.<init>(r2, r2)
            r2.mMeasurer = r0
            r2.mOnMeasureWidthMeasureSpec = r3
            r2.mOnMeasureHeightMeasureSpec = r3
            r2.m28498(r4, r5, r6)
            return
    }

    public static /* synthetic */ int access$000(androidx.constraintlayout.widget.ConstraintLayout r0) {
            int r0 = r0.mOptimizationLevel
            return r0
    }

    public static /* synthetic */ java.util.ArrayList access$100(androidx.constraintlayout.widget.ConstraintLayout r0) {
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟> r0 = r0.mConstraintHelpers
            return r0
    }

    private int getPaddingWidth() {
            r4 = this;
            int r0 = r4.getPaddingLeft()
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r4.getPaddingRight()
            int r2 = java.lang.Math.max(r1, r2)
            int r0 = r0 + r2
            int r2 = r4.getPaddingStart()
            int r2 = java.lang.Math.max(r1, r2)
            int r3 = r4.getPaddingEnd()
            int r1 = java.lang.Math.max(r1, r3)
            int r2 = r2 + r1
            if (r2 <= 0) goto L26
            r0 = r2
        L26:
            return r0
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            super.addView(r1, r2, r3)
            return
    }

    public void applyConstraintsFromLayoutParams(boolean r19, android.view.View r20, Yue.C1517 r21, androidx.constraintlayout.widget.ConstraintLayout.C7450 r22, android.util.SparseArray<Yue.C1517> r23) {
            r18 = this;
            r0 = r18
            r1 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r22.m28506()
            r10 = 0
            r8.f25989 = r10
            int r2 = r20.getVisibility()
            r7.m7617(r2)
            boolean r2 = r8.f25976
            r11 = 1
            if (r2 == 0) goto L24
            r7.m7597(r11)
            r2 = 8
            r7.m7617(r2)
        L24:
            r7.m7571(r1)
            boolean r2 = r1 instanceof androidx.constraintlayout.widget.AbstractC7457
            if (r2 == 0) goto L36
            androidx.constraintlayout.widget.ۥ۟۟ r1 = (androidx.constraintlayout.widget.AbstractC7457) r1
            Yue.ۥۣ۟ۧ۟ r2 = r0.mLayoutWidget
            boolean r2 = r2.m7651()
            r1.mo28495(r7, r2)
        L36:
            boolean r1 = r8.f25974
            r12 = -1
            if (r1 == 0) goto L5d
            r1 = r7
            Yue.ۥ۠ۤ۟ۧ r1 = (Yue.C2948) r1
            int r2 = r8.f25985
            int r3 = r8.f25986
            float r4 = r8.f25987
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L4f
            r1.m12555(r4)
            goto L280
        L4f:
            if (r2 == r12) goto L56
            r1.m12553(r2)
            goto L280
        L56:
            if (r3 == r12) goto L280
            r1.m12554(r3)
            goto L280
        L5d:
            int r1 = r8.f25978
            int r2 = r8.f25979
            int r13 = r8.f25980
            int r14 = r8.f25981
            int r6 = r8.f25982
            int r15 = r8.f25983
            float r5 = r8.f25984
            int r3 = r8.f25935
            if (r3 == r12) goto L80
            java.lang.Object r1 = r9.get(r3)
            Yue.ۥ۟ۧ۟ۢ r1 = (Yue.C1517) r1
            if (r1 == 0) goto L1b1
            float r2 = r8.f25937
            int r3 = r8.f25936
            r7.m7496(r1, r2, r3)
            goto L1b1
        L80:
            if (r1 == r12) goto L9f
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            Yue.ۥ۟ۧ۟ۢ r3 = (Yue.C1517) r3
            if (r3 == 0) goto L9c
            Yue.ۥ۟ۧ۟۠$ۥ۟ r4 = Yue.C1510.EnumC1512.f4743
            int r2 = r8.leftMargin
            r1 = r21
            r16 = r2
            r2 = r4
            r17 = r5
            r5 = r16
            r1.m7550(r2, r3, r4, r5, r6)
            goto Lb7
        L9c:
            r17 = r5
            goto Lb7
        L9f:
            r17 = r5
            if (r2 == r12) goto Lb7
            java.lang.Object r1 = r9.get(r2)
            r3 = r1
            Yue.ۥ۟ۧ۟ۢ r3 = (Yue.C1517) r3
            if (r3 == 0) goto Lb7
            Yue.ۥ۟ۧ۟۠$ۥ۟ r2 = Yue.C1510.EnumC1512.f4743
            Yue.ۥ۟ۧ۟۠$ۥ۟ r4 = Yue.C1510.EnumC1512.f4745
            int r5 = r8.leftMargin
            r1 = r21
            r1.m7550(r2, r3, r4, r5, r6)
        Lb7:
            if (r13 == r12) goto Lcf
            java.lang.Object r1 = r9.get(r13)
            r3 = r1
            Yue.ۥ۟ۧ۟ۢ r3 = (Yue.C1517) r3
            if (r3 == 0) goto Le5
            Yue.ۥ۟ۧ۟۠$ۥ۟ r2 = Yue.C1510.EnumC1512.f4745
            Yue.ۥ۟ۧ۟۠$ۥ۟ r4 = Yue.C1510.EnumC1512.f4743
            int r5 = r8.rightMargin
            r1 = r21
            r6 = r15
            r1.m7550(r2, r3, r4, r5, r6)
            goto Le5
        Lcf:
            if (r14 == r12) goto Le5
            java.lang.Object r1 = r9.get(r14)
            r3 = r1
            Yue.ۥ۟ۧ۟ۢ r3 = (Yue.C1517) r3
            if (r3 == 0) goto Le5
            Yue.ۥ۟ۧ۟۠$ۥ۟ r4 = Yue.C1510.EnumC1512.f4745
            int r5 = r8.rightMargin
            r1 = r21
            r2 = r4
            r6 = r15
            r1.m7550(r2, r3, r4, r5, r6)
        Le5:
            int r1 = r8.f25930
            if (r1 == r12) goto Lff
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            Yue.ۥ۟ۧ۟ۢ r3 = (Yue.C1517) r3
            if (r3 == 0) goto L119
            Yue.ۥ۟ۧ۟۠$ۥ۟ r4 = Yue.C1510.EnumC1512.f4744
            int r5 = r8.topMargin
            int r6 = r8.f25943
            r1 = r21
            r2 = r4
            r1.m7550(r2, r3, r4, r5, r6)
            goto L119
        Lff:
            int r1 = r8.f25931
            if (r1 == r12) goto L119
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            Yue.ۥ۟ۧ۟ۢ r3 = (Yue.C1517) r3
            if (r3 == 0) goto L119
            Yue.ۥ۟ۧ۟۠$ۥ۟ r2 = Yue.C1510.EnumC1512.f4744
            Yue.ۥ۟ۧ۟۠$ۥ۟ r4 = Yue.C1510.EnumC1512.f4746
            int r5 = r8.topMargin
            int r6 = r8.f25943
            r1 = r21
            r1.m7550(r2, r3, r4, r5, r6)
        L119:
            int r1 = r8.f25932
            if (r1 == r12) goto L134
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            Yue.ۥ۟ۧ۟ۢ r3 = (Yue.C1517) r3
            if (r3 == 0) goto L14d
            Yue.ۥ۟ۧ۟۠$ۥ۟ r2 = Yue.C1510.EnumC1512.f4746
            Yue.ۥ۟ۧ۟۠$ۥ۟ r4 = Yue.C1510.EnumC1512.f4744
            int r5 = r8.bottomMargin
            int r6 = r8.f25945
            r1 = r21
            r1.m7550(r2, r3, r4, r5, r6)
            goto L14d
        L134:
            int r1 = r8.f25933
            if (r1 == r12) goto L14d
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            Yue.ۥ۟ۧ۟ۢ r3 = (Yue.C1517) r3
            if (r3 == 0) goto L14d
            Yue.ۥ۟ۧ۟۠$ۥ۟ r4 = Yue.C1510.EnumC1512.f4746
            int r5 = r8.bottomMargin
            int r6 = r8.f25945
            r1 = r21
            r2 = r4
            r1.m7550(r2, r3, r4, r5, r6)
        L14d:
            int r1 = r8.f25934
            if (r1 == r12) goto L19e
            android.util.SparseArray<android.view.View> r2 = r0.mChildrenByIds
            java.lang.Object r1 = r2.get(r1)
            android.view.View r1 = (android.view.View) r1
            int r2 = r8.f25934
            java.lang.Object r2 = r9.get(r2)
            Yue.ۥ۟ۧ۟ۢ r2 = (Yue.C1517) r2
            if (r2 == 0) goto L19e
            if (r1 == 0) goto L19e
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r3 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.C7450
            if (r3 == 0) goto L19e
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r1 = (androidx.constraintlayout.widget.ConstraintLayout.C7450) r1
            r8.f25973 = r11
            r1.f25973 = r11
            Yue.ۥ۟ۧ۟۠$ۥ۟ r3 = Yue.C1510.EnumC1512.f4747
            Yue.ۥ۟ۧ۟۠ r4 = r7.mo7500(r3)
            Yue.ۥ۟ۧ۟۠ r2 = r2.mo7500(r3)
            r4.m7407(r2, r10, r12, r11)
            r7.m7587(r11)
            Yue.ۥ۟ۧ۟ۢ r1 = r1.f25988
            r1.m7587(r11)
            Yue.ۥ۟ۧ۟۠$ۥ۟ r1 = Yue.C1510.EnumC1512.f4744
            Yue.ۥ۟ۧ۟۠ r1 = r7.mo7500(r1)
            r1.m7429()
            Yue.ۥ۟ۧ۟۠$ۥ۟ r1 = Yue.C1510.EnumC1512.f4746
            Yue.ۥ۟ۧ۟۠ r1 = r7.mo7500(r1)
            r1.m7429()
        L19e:
            r1 = 0
            r2 = r17
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 < 0) goto L1a8
            r7.m7590(r2)
        L1a8:
            float r2 = r8.f25949
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L1b1
            r7.m7611(r2)
        L1b1:
            if (r19 == 0) goto L1c0
            int r1 = r8.f25965
            if (r1 != r12) goto L1bb
            int r2 = r8.f25966
            if (r2 == r12) goto L1c0
        L1bb:
            int r2 = r8.f25966
            r7.m7607(r1, r2)
        L1c0:
            boolean r1 = r8.f25971
            r2 = -2
            if (r1 != 0) goto L1f6
            int r1 = r8.width
            if (r1 != r12) goto L1ed
            boolean r1 = r8.f25968
            if (r1 == 0) goto L1d3
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4913
            r7.m7593(r1)
            goto L1d8
        L1d3:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4914
            r7.m7593(r1)
        L1d8:
            Yue.ۥ۟ۧ۟۠$ۥ۟ r1 = Yue.C1510.EnumC1512.f4743
            Yue.ۥ۟ۧ۟۠ r1 = r7.mo7500(r1)
            int r3 = r8.leftMargin
            r1.f4738 = r3
            Yue.ۥ۟ۧ۟۠$ۥ۟ r1 = Yue.C1510.EnumC1512.f4745
            Yue.ۥ۟ۧ۟۠ r1 = r7.mo7500(r1)
            int r3 = r8.rightMargin
            r1.f4738 = r3
            goto L209
        L1ed:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4913
            r7.m7593(r1)
            r7.m7618(r10)
            goto L209
        L1f6:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4911
            r7.m7593(r1)
            int r1 = r8.width
            r7.m7618(r1)
            int r1 = r8.width
            if (r1 != r2) goto L209
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4912
            r7.m7593(r1)
        L209:
            boolean r1 = r8.f25972
            if (r1 != 0) goto L23e
            int r1 = r8.height
            if (r1 != r12) goto L235
            boolean r1 = r8.f25969
            if (r1 == 0) goto L21b
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4913
            r7.m7614(r1)
            goto L220
        L21b:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4914
            r7.m7614(r1)
        L220:
            Yue.ۥ۟ۧ۟۠$ۥ۟ r1 = Yue.C1510.EnumC1512.f4744
            Yue.ۥ۟ۧ۟۠ r1 = r7.mo7500(r1)
            int r2 = r8.topMargin
            r1.f4738 = r2
            Yue.ۥ۟ۧ۟۠$ۥ۟ r1 = Yue.C1510.EnumC1512.f4746
            Yue.ۥ۟ۧ۟۠ r1 = r7.mo7500(r1)
            int r2 = r8.bottomMargin
            r1.f4738 = r2
            goto L251
        L235:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4913
            r7.m7614(r1)
            r7.m7588(r10)
            goto L251
        L23e:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4911
            r7.m7614(r1)
            int r1 = r8.height
            r7.m7588(r1)
            int r1 = r8.height
            if (r1 != r2) goto L251
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4912
            r7.m7614(r1)
        L251:
            java.lang.String r1 = r8.f25950
            r7.m7577(r1)
            float r1 = r8.f25953
            r7.m7595(r1)
            float r1 = r8.f25954
            r7.m7616(r1)
            int r1 = r8.f25955
            r7.m7591(r1)
            int r1 = r8.f25956
            r7.m7612(r1)
            int r1 = r8.f25957
            int r2 = r8.f25959
            int r3 = r8.f25961
            float r4 = r8.f25963
            r7.m7594(r1, r2, r3, r4)
            int r1 = r8.f25958
            int r2 = r8.f25960
            int r3 = r8.f25962
            float r4 = r8.f25964
            r7.m7615(r1, r2, r3, r4)
        L280:
            return
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout.C7450
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas r19) {
            r18 = this;
            r0 = r18
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟> r1 = r0.mConstraintHelpers
            r2 = 0
            if (r1 == 0) goto L1e
            int r1 = r1.size()
            if (r1 <= 0) goto L1e
            r3 = r2
        Le:
            if (r3 >= r1) goto L1e
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟> r4 = r0.mConstraintHelpers
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.widget.ۥ۟۟ r4 = (androidx.constraintlayout.widget.AbstractC7457) r4
            r4.mo14493(r0)
            int r3 = r3 + 1
            goto Le
        L1e:
            super.dispatchDraw(r19)
            boolean r1 = r18.isInEditMode()
            if (r1 == 0) goto Ld1
            int r1 = r18.getChildCount()
            int r3 = r18.getWidth()
            float r3 = (float) r3
            int r4 = r18.getHeight()
            float r4 = (float) r4
            r5 = r2
        L36:
            if (r5 >= r1) goto Ld1
            android.view.View r6 = r0.getChildAt(r5)
            int r7 = r6.getVisibility()
            r8 = 8
            if (r7 != r8) goto L46
            goto Lcd
        L46:
            java.lang.Object r6 = r6.getTag()
            if (r6 == 0) goto Lcd
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto Lcd
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = ","
            java.lang.String[] r6 = r6.split(r7)
            int r7 = r6.length
            r8 = 4
            if (r7 != r8) goto Lcd
            r7 = r6[r2]
            int r7 = java.lang.Integer.parseInt(r7)
            r8 = 1
            r8 = r6[r8]
            int r8 = java.lang.Integer.parseInt(r8)
            r9 = 2
            r9 = r6[r9]
            int r9 = java.lang.Integer.parseInt(r9)
            r10 = 3
            r6 = r6[r10]
            int r6 = java.lang.Integer.parseInt(r6)
            float r7 = (float) r7
            r10 = 1149698048(0x44870000, float:1080.0)
            float r7 = r7 / r10
            float r7 = r7 * r3
            int r7 = (int) r7
            float r8 = (float) r8
            r11 = 1156579328(0x44f00000, float:1920.0)
            float r8 = r8 / r11
            float r8 = r8 * r4
            int r8 = (int) r8
            float r9 = (float) r9
            float r9 = r9 / r10
            float r9 = r9 * r3
            int r9 = (int) r9
            float r6 = (float) r6
            float r6 = r6 / r11
            float r6 = r6 * r4
            int r6 = (int) r6
            android.graphics.Paint r15 = new android.graphics.Paint
            r15.<init>()
            r10 = -65536(0xffffffffffff0000, float:NaN)
            r15.setColor(r10)
            float r14 = (float) r7
            float r13 = (float) r8
            int r7 = r7 + r9
            float r7 = (float) r7
            r10 = r19
            r11 = r14
            r12 = r13
            r9 = r13
            r13 = r7
            r16 = r14
            r14 = r9
            r17 = r15
            r10.drawLine(r11, r12, r13, r14, r15)
            int r8 = r8 + r6
            float r6 = (float) r8
            r11 = r7
            r12 = r9
            r14 = r6
            r10.drawLine(r11, r12, r13, r14, r15)
            r12 = r6
            r13 = r16
            r10.drawLine(r11, r12, r13, r14, r15)
            r11 = r16
            r14 = r9
            r10.drawLine(r11, r12, r13, r14, r15)
            r8 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r15.setColor(r8)
            r12 = r9
            r13 = r7
            r14 = r6
            r8 = r15
            r10.drawLine(r11, r12, r13, r14, r15)
            r12 = r6
            r14 = r9
            r10.drawLine(r11, r12, r13, r14, r15)
        Lcd:
            int r5 = r5 + 1
            goto L36
        Ld1:
            return
    }

    public void fillMetrics(Yue.C4223 r2) {
            r1 = this;
            r1.mMetrics = r2
            Yue.ۥۣ۟ۧ۟ r0 = r1.mLayoutWidget
            r0.m7641(r2)
            return
    }

    @Override // android.view.View
    public void forceLayout() {
            r0 = this;
            r0.m28499()
            super.forceLayout()
            return
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    public androidx.constraintlayout.widget.ConstraintLayout.C7450 generateDefaultLayoutParams() {
            r2 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = new androidx.constraintlayout.widget.ConstraintLayout$ۥ۟
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = new androidx.constraintlayout.widget.ConstraintLayout$ۥ۟
            r0.<init>(r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public androidx.constraintlayout.widget.ConstraintLayout.C7450 generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = new androidx.constraintlayout.widget.ConstraintLayout$ۥ۟
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    public java.lang.Object getDesignInformation(int r1, java.lang.Object r2) {
            r0 = this;
            if (r1 != 0) goto L19
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L19
            java.lang.String r2 = (java.lang.String) r2
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.mDesignIds
            if (r1 == 0) goto L19
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L19
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.mDesignIds
            java.lang.Object r1 = r1.get(r2)
            return r1
        L19:
            r1 = 0
            return r1
    }

    public int getMaxHeight() {
            r1 = this;
            int r0 = r1.mMaxHeight
            return r0
    }

    public int getMaxWidth() {
            r1 = this;
            int r0 = r1.mMaxWidth
            return r0
    }

    public int getMinHeight() {
            r1 = this;
            int r0 = r1.mMinHeight
            return r0
    }

    public int getMinWidth() {
            r1 = this;
            int r0 = r1.mMinWidth
            return r0
    }

    public int getOptimizationLevel() {
            r1 = this;
            Yue.ۥۣ۟ۧ۟ r0 = r1.mLayoutWidget
            int r0 = r0.m7644()
            return r0
    }

    public android.view.View getViewById(int r2) {
            r1 = this;
            android.util.SparseArray<android.view.View> r0 = r1.mChildrenByIds
            java.lang.Object r2 = r0.get(r2)
            android.view.View r2 = (android.view.View) r2
            return r2
    }

    public final Yue.C1517 getViewWidget(android.view.View r1) {
            r0 = this;
            if (r1 != r0) goto L5
            Yue.ۥۣ۟ۧ۟ r1 = r0.mLayoutWidget
            return r1
        L5:
            if (r1 != 0) goto L9
            r1 = 0
            goto L11
        L9:
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r1 = (androidx.constraintlayout.widget.ConstraintLayout.C7450) r1
            Yue.ۥ۟ۧ۟ۢ r1 = r1.f25988
        L11:
            return r1
    }

    public boolean isRtl() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.flags
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L17
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r1 != r0) goto L17
            goto L18
        L17:
            r1 = 0
        L18:
            return r1
    }

    public void loadLayoutDescription(int r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L12
            androidx.constraintlayout.widget.ۥ۟۟۟ r1 = new androidx.constraintlayout.widget.ۥ۟۟۟     // Catch: android.content.res.Resources.NotFoundException -> Lf
            android.content.Context r2 = r3.getContext()     // Catch: android.content.res.Resources.NotFoundException -> Lf
            r1.<init>(r2, r3, r4)     // Catch: android.content.res.Resources.NotFoundException -> Lf
            r3.mConstraintLayoutSpec = r1     // Catch: android.content.res.Resources.NotFoundException -> Lf
            goto L14
        Lf:
            r3.mConstraintLayoutSpec = r0
            goto L14
        L12:
            r3.mConstraintLayoutSpec = r0
        L14:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
            r5 = this;
            int r6 = r5.getChildCount()
            boolean r7 = r5.isInEditMode()
            r8 = 0
            r9 = r8
        La:
            if (r9 >= r6) goto L5e
            android.view.View r10 = r5.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = (androidx.constraintlayout.widget.ConstraintLayout.C7450) r0
            Yue.ۥ۟ۧ۟ۢ r1 = r0.f25988
            int r2 = r10.getVisibility()
            r3 = 8
            if (r2 != r3) goto L2f
            boolean r2 = r0.f25974
            if (r2 != 0) goto L2f
            boolean r2 = r0.f25975
            if (r2 != 0) goto L2f
            boolean r2 = r0.f25977
            if (r2 != 0) goto L2f
            if (r7 != 0) goto L2f
            goto L5b
        L2f:
            boolean r0 = r0.f25976
            if (r0 == 0) goto L34
            goto L5b
        L34:
            int r0 = r1.m7545()
            int r2 = r1.m7546()
            int r3 = r1.m7544()
            int r3 = r3 + r0
            int r1 = r1.m7512()
            int r1 = r1 + r2
            r10.layout(r0, r2, r3, r1)
            boolean r4 = r10 instanceof androidx.constraintlayout.widget.C7472
            if (r4 == 0) goto L5b
            androidx.constraintlayout.widget.ۥ۟۟۟ۤ r10 = (androidx.constraintlayout.widget.C7472) r10
            android.view.View r10 = r10.getContent()
            if (r10 == 0) goto L5b
            r10.setVisibility(r8)
            r10.layout(r0, r2, r3, r1)
        L5b:
            int r9 = r9 + 1
            goto La
        L5e:
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟> r6 = r5.mConstraintHelpers
            int r6 = r6.size()
            if (r6 <= 0) goto L76
        L66:
            if (r8 >= r6) goto L76
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟> r7 = r5.mConstraintHelpers
            java.lang.Object r7 = r7.get(r8)
            androidx.constraintlayout.widget.ۥ۟۟ r7 = (androidx.constraintlayout.widget.AbstractC7457) r7
            r7.mo14492(r5)
            int r8 = r8 + 1
            goto L66
        L76:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r9, int r10) {
            r8 = this;
            boolean r0 = r8.mDirtyHierarchy
            r1 = 0
            if (r0 != 0) goto L1d
            int r0 = r8.getChildCount()
            r2 = r1
        La:
            if (r2 >= r0) goto L1d
            android.view.View r3 = r8.getChildAt(r2)
            boolean r3 = r3.isLayoutRequested()
            if (r3 == 0) goto L1a
            r0 = 1
            r8.mDirtyHierarchy = r0
            goto L1d
        L1a:
            int r2 = r2 + 1
            goto La
        L1d:
            boolean r0 = r8.mDirtyHierarchy
            if (r0 != 0) goto L91
            int r0 = r8.mOnMeasureWidthMeasureSpec
            if (r0 != r9) goto L48
            int r2 = r8.mOnMeasureHeightMeasureSpec
            if (r2 != r10) goto L48
            Yue.ۥۣ۟ۧ۟ r0 = r8.mLayoutWidget
            int r4 = r0.m7544()
            Yue.ۥۣ۟ۧ۟ r0 = r8.mLayoutWidget
            int r5 = r0.m7512()
            Yue.ۥۣ۟ۧ۟ r0 = r8.mLayoutWidget
            boolean r6 = r0.m7652()
            Yue.ۥۣ۟ۧ۟ r0 = r8.mLayoutWidget
            boolean r7 = r0.m7650()
            r1 = r8
            r2 = r9
            r3 = r10
            r1.resolveMeasuredDimension(r2, r3, r4, r5, r6, r7)
            return
        L48:
            if (r0 != r9) goto L91
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L91
            int r0 = android.view.View.MeasureSpec.getMode(r10)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L91
            int r0 = r8.mOnMeasureHeightMeasureSpec
            int r0 = android.view.View.MeasureSpec.getMode(r0)
            if (r0 != r2) goto L91
            int r0 = android.view.View.MeasureSpec.getSize(r10)
            Yue.ۥۣ۟ۧ۟ r2 = r8.mLayoutWidget
            int r2 = r2.m7512()
            if (r0 < r2) goto L91
            r8.mOnMeasureWidthMeasureSpec = r9
            r8.mOnMeasureHeightMeasureSpec = r10
            Yue.ۥۣ۟ۧ۟ r0 = r8.mLayoutWidget
            int r4 = r0.m7544()
            Yue.ۥۣ۟ۧ۟ r0 = r8.mLayoutWidget
            int r5 = r0.m7512()
            Yue.ۥۣ۟ۧ۟ r0 = r8.mLayoutWidget
            boolean r6 = r0.m7652()
            Yue.ۥۣ۟ۧ۟ r0 = r8.mLayoutWidget
            boolean r7 = r0.m7650()
            r1 = r8
            r2 = r9
            r3 = r10
            r1.resolveMeasuredDimension(r2, r3, r4, r5, r6, r7)
            return
        L91:
            r8.mOnMeasureWidthMeasureSpec = r9
            r8.mOnMeasureHeightMeasureSpec = r10
            Yue.ۥۣ۟ۧ۟ r0 = r8.mLayoutWidget
            boolean r2 = r8.isRtl()
            r0.m7659(r2)
            boolean r0 = r8.mDirtyHierarchy
            if (r0 == 0) goto Laf
            r8.mDirtyHierarchy = r1
            boolean r0 = r8.m28501()
            if (r0 == 0) goto Laf
            Yue.ۥۣ۟ۧ۟ r0 = r8.mLayoutWidget
            r0.m7661()
        Laf:
            Yue.ۥۣ۟ۧ۟ r0 = r8.mLayoutWidget
            int r1 = r8.mOptimizationLevel
            r8.resolveSystem(r0, r1, r9, r10)
            Yue.ۥۣ۟ۧ۟ r0 = r8.mLayoutWidget
            int r4 = r0.m7544()
            Yue.ۥۣ۟ۧ۟ r0 = r8.mLayoutWidget
            int r5 = r0.m7512()
            Yue.ۥۣ۟ۧ۟ r0 = r8.mLayoutWidget
            boolean r6 = r0.m7652()
            Yue.ۥۣ۟ۧ۟ r0 = r8.mLayoutWidget
            boolean r7 = r0.m7650()
            r1 = r8
            r2 = r9
            r3 = r10
            r1.resolveMeasuredDimension(r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View r4) {
            r3 = this;
            super.onViewAdded(r4)
            Yue.ۥ۟ۧ۟ۢ r0 = r3.getViewWidget(r4)
            boolean r1 = r4 instanceof androidx.constraintlayout.widget.C7471
            r2 = 1
            if (r1 == 0) goto L24
            boolean r0 = r0 instanceof Yue.C2948
            if (r0 != 0) goto L24
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = (androidx.constraintlayout.widget.ConstraintLayout.C7450) r0
            Yue.ۥ۠ۤ۟ۧ r1 = new Yue.ۥ۠ۤ۟ۧ
            r1.<init>()
            r0.f25988 = r1
            r0.f25974 = r2
            int r0 = r0.f25967
            r1.m12558(r0)
        L24:
            boolean r0 = r4 instanceof androidx.constraintlayout.widget.AbstractC7457
            if (r0 == 0) goto L43
            r0 = r4
            androidx.constraintlayout.widget.ۥ۟۟ r0 = (androidx.constraintlayout.widget.AbstractC7457) r0
            r0.m28542()
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r1 = (androidx.constraintlayout.widget.ConstraintLayout.C7450) r1
            r1.f25975 = r2
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟> r1 = r3.mConstraintHelpers
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L43
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟> r1 = r3.mConstraintHelpers
            r1.add(r0)
        L43:
            android.util.SparseArray<android.view.View> r0 = r3.mChildrenByIds
            int r1 = r4.getId()
            r0.put(r1, r4)
            r3.mDirtyHierarchy = r2
            return
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View r3) {
            r2 = this;
            super.onViewRemoved(r3)
            android.util.SparseArray<android.view.View> r0 = r2.mChildrenByIds
            int r1 = r3.getId()
            r0.remove(r1)
            Yue.ۥ۟ۧ۟ۢ r0 = r2.getViewWidget(r3)
            Yue.ۥۣ۟ۧ۟ r1 = r2.mLayoutWidget
            r1.m27142(r0)
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟> r0 = r2.mConstraintHelpers
            r0.remove(r3)
            r3 = 1
            r2.mDirtyHierarchy = r3
            return
    }

    public void parseLayoutDescription(int r3) {
            r2 = this;
            androidx.constraintlayout.widget.ۥ۟۟۟ r0 = new androidx.constraintlayout.widget.ۥ۟۟۟
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r2, r3)
            r2.mConstraintLayoutSpec = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View r1) {
            r0 = this;
            super.removeView(r1)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r0 = this;
            r0.m28499()
            super.requestLayout()
            return
    }

    public void resolveMeasuredDimension(int r3, int r4, int r5, int r6, boolean r7, boolean r8) {
            r2 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟۟ r0 = r2.mMeasurer
            int r1 = r0.f26047
            int r0 = r0.f26046
            int r5 = r5 + r0
            int r6 = r6 + r1
            r0 = 0
            int r3 = android.view.View.resolveSizeAndState(r5, r3, r0)
            int r4 = android.view.View.resolveSizeAndState(r6, r4, r0)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r5
            r4 = r4 & r5
            int r5 = r2.mMaxWidth
            int r3 = java.lang.Math.min(r5, r3)
            int r5 = r2.mMaxHeight
            int r4 = java.lang.Math.min(r5, r4)
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            if (r7 == 0) goto L27
            r3 = r3 | r5
        L27:
            if (r8 == 0) goto L2a
            r4 = r4 | r5
        L2a:
            r2.setMeasuredDimension(r3, r4)
            r2.mLastMeasureWidth = r3
            r2.mLastMeasureHeight = r4
            return
    }

    public void resolveSystem(Yue.C1520 r21, int r22, int r23, int r24) {
            r20 = this;
            r6 = r20
            int r9 = android.view.View.MeasureSpec.getMode(r23)
            int r0 = android.view.View.MeasureSpec.getSize(r23)
            int r11 = android.view.View.MeasureSpec.getMode(r24)
            int r1 = android.view.View.MeasureSpec.getSize(r24)
            int r2 = r20.getPaddingTop()
            r3 = 0
            int r19 = java.lang.Math.max(r3, r2)
            int r2 = r20.getPaddingBottom()
            int r16 = java.lang.Math.max(r3, r2)
            int r2 = r19 + r16
            int r4 = r20.getPaddingWidth()
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟۟ r12 = r6.mMeasurer
            r13 = r23
            r14 = r24
            r15 = r19
            r17 = r4
            r18 = r2
            r12.m28507(r13, r14, r15, r16, r17, r18)
            int r5 = r20.getPaddingStart()
            int r5 = java.lang.Math.max(r3, r5)
            int r7 = r20.getPaddingEnd()
            int r7 = java.lang.Math.max(r3, r7)
            if (r5 > 0) goto L57
            if (r7 <= 0) goto L4d
            goto L57
        L4d:
            int r5 = r20.getPaddingLeft()
            int r3 = java.lang.Math.max(r3, r5)
            r15 = r3
            goto L60
        L57:
            boolean r3 = r20.isRtl()
            if (r3 == 0) goto L5f
            r15 = r7
            goto L60
        L5f:
            r15 = r5
        L60:
            int r10 = r0 - r4
            int r12 = r1 - r2
            r0 = r20
            r1 = r21
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.setSelfDimensionBehaviour(r1, r2, r3, r4, r5)
            int r13 = r6.mLastMeasureWidth
            int r14 = r6.mLastMeasureHeight
            r7 = r21
            r8 = r22
            r16 = r19
            r7.m7653(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
    }

    public void setConstraintSet(androidx.constraintlayout.widget.C7462 r1) {
            r0 = this;
            r0.mConstraintSet = r1
            return
    }

    public void setDesignInformation(int r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            if (r2 != 0) goto L30
            boolean r2 = r3 instanceof java.lang.String
            if (r2 == 0) goto L30
            boolean r2 = r4 instanceof java.lang.Integer
            if (r2 == 0) goto L30
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r1.mDesignIds
            if (r2 != 0) goto L15
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.mDesignIds = r2
        L15:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = "/"
            int r2 = r3.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto L26
            int r2 = r2 + 1
            java.lang.String r3 = r3.substring(r2)
        L26:
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.intValue()
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r1.mDesignIds
            r2.put(r3, r4)
        L30:
            return
    }

    @Override // android.view.View
    public void setId(int r3) {
            r2 = this;
            android.util.SparseArray<android.view.View> r0 = r2.mChildrenByIds
            int r1 = r2.getId()
            r0.remove(r1)
            super.setId(r3)
            android.util.SparseArray<android.view.View> r3 = r2.mChildrenByIds
            int r0 = r2.getId()
            r3.put(r0, r2)
            return
    }

    public void setMaxHeight(int r2) {
            r1 = this;
            int r0 = r1.mMaxHeight
            if (r2 != r0) goto L5
            return
        L5:
            r1.mMaxHeight = r2
            r1.requestLayout()
            return
    }

    public void setMaxWidth(int r2) {
            r1 = this;
            int r0 = r1.mMaxWidth
            if (r2 != r0) goto L5
            return
        L5:
            r1.mMaxWidth = r2
            r1.requestLayout()
            return
    }

    public void setMinHeight(int r2) {
            r1 = this;
            int r0 = r1.mMinHeight
            if (r2 != r0) goto L5
            return
        L5:
            r1.mMinHeight = r2
            r1.requestLayout()
            return
    }

    public void setMinWidth(int r2) {
            r1 = this;
            int r0 = r1.mMinWidth
            if (r2 != r0) goto L5
            return
        L5:
            r1.mMinWidth = r2
            r1.requestLayout()
            return
    }

    public void setOnConstraintsChanged(Yue.AbstractC1521 r2) {
            r1 = this;
            r1.mConstraintsChangedListener = r2
            androidx.constraintlayout.widget.ۥ۟۟۟ r0 = r1.mConstraintLayoutSpec
            if (r0 == 0) goto L9
            r0.m28546(r2)
        L9:
            return
    }

    public void setOptimizationLevel(int r2) {
            r1 = this;
            r1.mOptimizationLevel = r2
            Yue.ۥۣ۟ۧ۟ r0 = r1.mLayoutWidget
            r0.m7657(r2)
            return
    }

    public void setSelfDimensionBehaviour(Yue.C1520 r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟۟ r0 = r7.mMeasurer
            int r1 = r0.f26047
            int r0 = r0.f26046
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r2 = Yue.C1517.EnumC1519.f4911
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = r6
            goto L38
        L1a:
            int r9 = r7.mMaxWidth
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L38
        L23:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r9 = Yue.C1517.EnumC1519.f4912
            if (r3 != 0) goto L18
            int r10 = r7.mMinWidth
            int r10 = java.lang.Math.max(r6, r10)
            goto L38
        L2e:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r9 = Yue.C1517.EnumC1519.f4912
            if (r3 != 0) goto L38
            int r10 = r7.mMinWidth
            int r10 = java.lang.Math.max(r6, r10)
        L38:
            if (r11 == r5) goto L53
            if (r11 == 0) goto L48
            if (r11 == r4) goto L40
        L3e:
            r12 = r6
            goto L5d
        L40:
            int r11 = r7.mMaxHeight
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L5d
        L48:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r2 = Yue.C1517.EnumC1519.f4912
            if (r3 != 0) goto L3e
            int r11 = r7.mMinHeight
            int r12 = java.lang.Math.max(r6, r11)
            goto L5d
        L53:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r2 = Yue.C1517.EnumC1519.f4912
            if (r3 != 0) goto L5d
            int r11 = r7.mMinHeight
            int r12 = java.lang.Math.max(r6, r11)
        L5d:
            int r11 = r8.m7544()
            if (r10 != r11) goto L69
            int r11 = r8.m7512()
            if (r12 == r11) goto L6c
        L69:
            r8.m7649()
        L6c:
            r8.m7620(r6)
            r8.m7621(r6)
            int r11 = r7.mMaxWidth
            int r11 = r11 - r0
            r8.m7602(r11)
            int r11 = r7.mMaxHeight
            int r11 = r11 - r1
            r8.m7601(r11)
            r8.m7605(r6)
            r8.m7604(r6)
            r8.m7593(r9)
            r8.m7618(r10)
            r8.m7614(r2)
            r8.m7588(r12)
            int r9 = r7.mMinWidth
            int r9 = r9 - r0
            r8.m7605(r9)
            int r9 = r7.mMinHeight
            int r9 = r9 - r1
            r8.m7604(r9)
            return
    }

    public void setState(int r2, int r3, int r4) {
            r1 = this;
            androidx.constraintlayout.widget.ۥ۟۟۟ r0 = r1.mConstraintLayoutSpec
            if (r0 == 0) goto L9
            float r3 = (float) r3
            float r4 = (float) r4
            r0.m28547(r2, r3, r4)
        L9:
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.C1517 m28497(int r2) {
            r1 = this;
            if (r2 != 0) goto L5
            Yue.ۥۣ۟ۧ۟ r2 = r1.mLayoutWidget
            return r2
        L5:
            android.util.SparseArray<android.view.View> r0 = r1.mChildrenByIds
            java.lang.Object r0 = r0.get(r2)
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L20
            android.view.View r0 = r1.findViewById(r2)
            if (r0 == 0) goto L20
            if (r0 == r1) goto L20
            android.view.ViewParent r2 = r0.getParent()
            if (r2 != r1) goto L20
            r1.onViewAdded(r0)
        L20:
            if (r0 != r1) goto L25
            Yue.ۥۣ۟ۧ۟ r2 = r1.mLayoutWidget
            return r2
        L25:
            if (r0 != 0) goto L29
            r2 = 0
            goto L31
        L29:
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r2 = (androidx.constraintlayout.widget.ConstraintLayout.C7450) r2
            Yue.ۥ۟ۧ۟ۢ r2 = r2.f25988
        L31:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m28498(android.util.AttributeSet r6, int r7, int r8) {
            r5 = this;
            Yue.ۥۣ۟ۧ۟ r0 = r5.mLayoutWidget
            r0.m7571(r5)
            Yue.ۥۣ۟ۧ۟ r0 = r5.mLayoutWidget
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟۟ r1 = r5.mMeasurer
            r0.m7656(r1)
            android.util.SparseArray<android.view.View> r0 = r5.mChildrenByIds
            int r1 = r5.getId()
            r0.put(r1, r5)
            r0 = 0
            r5.mConstraintSet = r0
            if (r6 == 0) goto La3
            android.content.Context r1 = r5.getContext()
            int[] r2 = androidx.constraintlayout.widget.C7473.C7486.f28216
            android.content.res.TypedArray r6 = r1.obtainStyledAttributes(r6, r2, r7, r8)
            int r7 = r6.getIndexCount()
            r8 = 0
            r1 = r8
        L2a:
            if (r1 >= r7) goto La0
            int r2 = r6.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.C7473.C7486.f28226
            if (r2 != r3) goto L3d
            int r3 = r5.mMinWidth
            int r2 = r6.getDimensionPixelOffset(r2, r3)
            r5.mMinWidth = r2
            goto L9d
        L3d:
            int r3 = androidx.constraintlayout.widget.C7473.C7486.f28227
            if (r2 != r3) goto L4a
            int r3 = r5.mMinHeight
            int r2 = r6.getDimensionPixelOffset(r2, r3)
            r5.mMinHeight = r2
            goto L9d
        L4a:
            int r3 = androidx.constraintlayout.widget.C7473.C7486.f28224
            if (r2 != r3) goto L57
            int r3 = r5.mMaxWidth
            int r2 = r6.getDimensionPixelOffset(r2, r3)
            r5.mMaxWidth = r2
            goto L9d
        L57:
            int r3 = androidx.constraintlayout.widget.C7473.C7486.f28225
            if (r2 != r3) goto L64
            int r3 = r5.mMaxHeight
            int r2 = r6.getDimensionPixelOffset(r2, r3)
            r5.mMaxHeight = r2
            goto L9d
        L64:
            int r3 = androidx.constraintlayout.widget.C7473.C7486.f28307
            if (r2 != r3) goto L71
            int r3 = r5.mOptimizationLevel
            int r2 = r6.getInt(r2, r3)
            r5.mOptimizationLevel = r2
            goto L9d
        L71:
            int r3 = androidx.constraintlayout.widget.C7473.C7486.f28256
            if (r2 != r3) goto L82
            int r2 = r6.getResourceId(r2, r8)
            if (r2 == 0) goto L9d
            r5.parseLayoutDescription(r2)     // Catch: android.content.res.Resources.NotFoundException -> L7f
            goto L9d
        L7f:
            r5.mConstraintLayoutSpec = r0
            goto L9d
        L82:
            int r3 = androidx.constraintlayout.widget.C7473.C7486.f28235
            if (r2 != r3) goto L9d
            int r2 = r6.getResourceId(r2, r8)
            androidx.constraintlayout.widget.ۥ۟۟۟۠ r3 = new androidx.constraintlayout.widget.ۥ۟۟۟۠     // Catch: android.content.res.Resources.NotFoundException -> L99
            r3.<init>()     // Catch: android.content.res.Resources.NotFoundException -> L99
            r5.mConstraintSet = r3     // Catch: android.content.res.Resources.NotFoundException -> L99
            android.content.Context r4 = r5.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L99
            r3.m28666(r4, r2)     // Catch: android.content.res.Resources.NotFoundException -> L99
            goto L9b
        L99:
            r5.mConstraintSet = r0
        L9b:
            r5.mConstraintSetId = r2
        L9d:
            int r1 = r1 + 1
            goto L2a
        La0:
            r6.recycle()
        La3:
            Yue.ۥۣ۟ۧ۟ r6 = r5.mLayoutWidget
            int r7 = r5.mOptimizationLevel
            r6.m7657(r7)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m28499() {
            r1 = this;
            r0 = 1
            r1.mDirtyHierarchy = r0
            r0 = -1
            r1.mLastMeasureWidth = r0
            r1.mLastMeasureHeight = r0
            r1.mLastMeasureWidthSize = r0
            r1.mLastMeasureHeightSize = r0
            r0 = 0
            r1.mLastMeasureWidthMode = r0
            r1.mLastMeasureHeightMode = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m28500() {
            r9 = this;
            boolean r6 = r9.isInEditMode()
            int r7 = r9.getChildCount()
            r0 = 0
            r1 = r0
        La:
            if (r1 >= r7) goto L1d
            android.view.View r2 = r9.getChildAt(r1)
            Yue.ۥ۟ۧ۟ۢ r2 = r9.getViewWidget(r2)
            if (r2 != 0) goto L17
            goto L1a
        L17:
            r2.mo7564()
        L1a:
            int r1 = r1 + 1
            goto La
        L1d:
            r1 = -1
            if (r6 == 0) goto L5a
            r2 = r0
        L21:
            if (r2 >= r7) goto L5a
            android.view.View r3 = r9.getChildAt(r2)
            android.content.res.Resources r4 = r9.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L57
            int r5 = r3.getId()     // Catch: android.content.res.Resources.NotFoundException -> L57
            java.lang.String r4 = r4.getResourceName(r5)     // Catch: android.content.res.Resources.NotFoundException -> L57
            int r5 = r3.getId()     // Catch: android.content.res.Resources.NotFoundException -> L57
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: android.content.res.Resources.NotFoundException -> L57
            r9.setDesignInformation(r0, r4, r5)     // Catch: android.content.res.Resources.NotFoundException -> L57
            r5 = 47
            int r5 = r4.indexOf(r5)     // Catch: android.content.res.Resources.NotFoundException -> L57
            if (r5 == r1) goto L4c
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5)     // Catch: android.content.res.Resources.NotFoundException -> L57
        L4c:
            int r3 = r3.getId()     // Catch: android.content.res.Resources.NotFoundException -> L57
            Yue.ۥ۟ۧ۟ۢ r3 = r9.m28497(r3)     // Catch: android.content.res.Resources.NotFoundException -> L57
            r3.m7573(r4)     // Catch: android.content.res.Resources.NotFoundException -> L57
        L57:
            int r2 = r2 + 1
            goto L21
        L5a:
            int r2 = r9.mConstraintSetId
            if (r2 == r1) goto L7c
            r1 = r0
        L5f:
            if (r1 >= r7) goto L7c
            android.view.View r2 = r9.getChildAt(r1)
            int r3 = r2.getId()
            int r4 = r9.mConstraintSetId
            if (r3 != r4) goto L79
            boolean r3 = r2 instanceof androidx.constraintlayout.widget.C7468
            if (r3 == 0) goto L79
            androidx.constraintlayout.widget.ۥ۟۟۟ۡ r2 = (androidx.constraintlayout.widget.C7468) r2
            androidx.constraintlayout.widget.ۥ۟۟۟۠ r2 = r2.getConstraintSet()
            r9.mConstraintSet = r2
        L79:
            int r1 = r1 + 1
            goto L5f
        L7c:
            androidx.constraintlayout.widget.ۥ۟۟۟۠ r1 = r9.mConstraintSet
            if (r1 == 0) goto L84
            r2 = 1
            r1.m28614(r9, r2)
        L84:
            Yue.ۥۣ۟ۧ۟ r1 = r9.mLayoutWidget
            r1.m27143()
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟> r1 = r9.mConstraintHelpers
            int r1 = r1.size()
            if (r1 <= 0) goto La2
            r2 = r0
        L92:
            if (r2 >= r1) goto La2
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟> r3 = r9.mConstraintHelpers
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.widget.ۥ۟۟ r3 = (androidx.constraintlayout.widget.AbstractC7457) r3
            r3.m28541(r9)
            int r2 = r2 + 1
            goto L92
        La2:
            r1 = r0
        La3:
            if (r1 >= r7) goto Lb5
            android.view.View r2 = r9.getChildAt(r1)
            boolean r3 = r2 instanceof androidx.constraintlayout.widget.C7472
            if (r3 == 0) goto Lb2
            androidx.constraintlayout.widget.ۥ۟۟۟ۤ r2 = (androidx.constraintlayout.widget.C7472) r2
            r2.m28749(r9)
        Lb2:
            int r1 = r1 + 1
            goto La3
        Lb5:
            android.util.SparseArray<Yue.ۥ۟ۧ۟ۢ> r1 = r9.mTempMapIdToWidget
            r1.clear()
            android.util.SparseArray<Yue.ۥ۟ۧ۟ۢ> r1 = r9.mTempMapIdToWidget
            Yue.ۥۣ۟ۧ۟ r2 = r9.mLayoutWidget
            r1.put(r0, r2)
            android.util.SparseArray<Yue.ۥ۟ۧ۟ۢ> r1 = r9.mTempMapIdToWidget
            int r2 = r9.getId()
            Yue.ۥۣ۟ۧ۟ r3 = r9.mLayoutWidget
            r1.put(r2, r3)
            r1 = r0
        Lcd:
            if (r1 >= r7) goto Le3
            android.view.View r2 = r9.getChildAt(r1)
            Yue.ۥ۟ۧ۟ۢ r3 = r9.getViewWidget(r2)
            android.util.SparseArray<Yue.ۥ۟ۧ۟ۢ> r4 = r9.mTempMapIdToWidget
            int r2 = r2.getId()
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto Lcd
        Le3:
            r8 = r0
        Le4:
            if (r8 >= r7) goto L107
            android.view.View r2 = r9.getChildAt(r8)
            Yue.ۥ۟ۧ۟ۢ r3 = r9.getViewWidget(r2)
            if (r3 != 0) goto Lf1
            goto L104
        Lf1:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r4 = (androidx.constraintlayout.widget.ConstraintLayout.C7450) r4
            Yue.ۥۣ۟ۧ۟ r0 = r9.mLayoutWidget
            r0.m27138(r3)
            android.util.SparseArray<Yue.ۥ۟ۧ۟ۢ> r5 = r9.mTempMapIdToWidget
            r0 = r9
            r1 = r6
            r0.applyConstraintsFromLayoutParams(r1, r2, r3, r4, r5)
        L104:
            int r8 = r8 + 1
            goto Le4
        L107:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m28501() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L17
            android.view.View r3 = r4.getChildAt(r2)
            boolean r3 = r3.isLayoutRequested()
            if (r3 == 0) goto L14
            r1 = 1
            goto L17
        L14:
            int r2 = r2 + 1
            goto L6
        L17:
            if (r1 == 0) goto L1c
            r4.m28500()
        L1c:
            return r1
    }
}
