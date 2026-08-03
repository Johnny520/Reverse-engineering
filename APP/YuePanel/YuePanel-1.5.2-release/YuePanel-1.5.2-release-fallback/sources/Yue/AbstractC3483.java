package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3483 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int f10916 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f10917 = "alpha";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f10918 = "elevation";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f10919 = "rotation";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.lang.String f10920 = "rotationX";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final java.lang.String f10921 = "rotationY";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final java.lang.String f10922 = "transformPivotX";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final java.lang.String f10923 = "transformPivotY";

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final java.lang.String f10924 = "transitionPathRotate";

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f10925 = "scaleX";

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final java.lang.String f10926 = "scaleY";

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final java.lang.String f10927 = "wavePeriod";

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final java.lang.String f10928 = "waveOffset";

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final java.lang.String f10929 = "waveVariesBy";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f10930 = "translationX";

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final java.lang.String f10931 = "translationY";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final java.lang.String f10932 = "translationZ";

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final java.lang.String f10933 = "progress";

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final java.lang.String f10934 = "CUSTOM";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int f10935;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f10936;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.String f10937;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f10938;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.C7454> f10939;

    static {
            return
    }

    public AbstractC3483() {
            r1 = this;
            r1.<init>()
            int r0 = Yue.AbstractC3483.f10916
            r1.f10935 = r0
            r1.f10936 = r0
            r0 = 0
            r1.f10937 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public abstract void mo14277(java.util.HashMap<java.lang.String, Yue.AbstractC5889> r1);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public abstract void mo14278(java.util.HashSet<java.lang.String> r1);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public abstract void mo14279(android.content.Context r1, android.util.AttributeSet r2);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m14280(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.f10937
            if (r0 == 0) goto Lc
            if (r2 != 0) goto L7
            goto Lc
        L7:
            boolean r2 = r2.matches(r0)
            return r2
        Lc:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void mo14281(java.util.HashMap<java.lang.String, java.lang.Integer> r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public abstract void mo14282(java.lang.String r1, java.lang.Object r2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m14283(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto Lb
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L13
        Lb:
            java.lang.String r2 = r2.toString()
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
        L13:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public float m14284(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 == 0) goto Lb
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            goto L13
        Lb:
            java.lang.String r2 = r2.toString()
            float r2 = java.lang.Float.parseFloat(r2)
        L13:
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m14285(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto Lb
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L13
        Lb:
            java.lang.String r2 = r2.toString()
            int r2 = java.lang.Integer.parseInt(r2)
        L13:
            return r2
    }
}
