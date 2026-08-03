package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3510 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f11056 = -1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends Yue.AbstractC3483>> f11057 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f11058 = "KeyFrames";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.util.HashMap<java.lang.Integer, java.util.ArrayList<Yue.AbstractC3483>> f11059;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            Yue.C3510.f11057 = r0
            java.lang.String r1 = "KeyAttribute"
            java.lang.Class<Yue.ۥ۠ۦۥ۠> r2 = Yue.C3484.class
            r3 = 0
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L48
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L48
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends Yue.ۥ۠ۦۥ۟>> r0 = Yue.C3510.f11057     // Catch: java.lang.NoSuchMethodException -> L48
            java.lang.String r1 = "KeyPosition"
            java.lang.Class<Yue.ۥ۠ۦۥۦ> r2 = Yue.C3511.class
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L48
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L48
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends Yue.ۥ۠ۦۥ۟>> r0 = Yue.C3510.f11057     // Catch: java.lang.NoSuchMethodException -> L48
            java.lang.String r1 = "KeyCycle"
            java.lang.Class<Yue.ۥ۠ۦۥۢ> r2 = Yue.C3487.class
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L48
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L48
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends Yue.ۥ۠ۦۥ۟>> r0 = Yue.C3510.f11057     // Catch: java.lang.NoSuchMethodException -> L48
            java.lang.String r1 = "KeyTimeCycle"
            java.lang.Class<Yue.ۥ۠ۦۥۨ> r2 = Yue.C3514.class
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L48
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L48
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends Yue.ۥ۠ۦۥ۟>> r0 = Yue.C3510.f11057     // Catch: java.lang.NoSuchMethodException -> L48
            java.lang.String r1 = "KeyTrigger"
            java.lang.Class<Yue.ۥ۠ۦۦ> r2 = Yue.C3516.class
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L48
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L48
            goto L50
        L48:
            r0 = move-exception
            java.lang.String r1 = "KeyFrames"
            java.lang.String r2 = "unable to load"
            android.util.Log.e(r1, r2, r0)
        L50:
            return
    }

    public C3510(android.content.Context r7, org.xmlpull.v1.XmlPullParser r8) {
            r6 = this;
            r6.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.f11059 = r0
            int r0 = r8.getEventType()     // Catch: java.io.IOException -> L27 org.xmlpull.v1.XmlPullParserException -> L29
            r1 = 0
            r2 = r1
        L10:
            r3 = 1
            if (r0 == r3) goto L7c
            r3 = 2
            if (r0 == r3) goto L2b
            r3 = 3
            if (r0 == r3) goto L1a
            goto L70
        L1a:
            java.lang.String r0 = "KeyFrameSet"
            java.lang.String r3 = r8.getName()     // Catch: java.io.IOException -> L27 org.xmlpull.v1.XmlPullParserException -> L29
            boolean r0 = r0.equals(r3)     // Catch: java.io.IOException -> L27 org.xmlpull.v1.XmlPullParserException -> L29
            if (r0 == 0) goto L70
            return
        L27:
            r7 = move-exception
            goto L75
        L29:
            r7 = move-exception
            goto L79
        L2b:
            java.lang.String r0 = r8.getName()     // Catch: java.io.IOException -> L27 org.xmlpull.v1.XmlPullParserException -> L29
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends Yue.ۥ۠ۦۥ۟>> r3 = Yue.C3510.f11057     // Catch: java.io.IOException -> L27 org.xmlpull.v1.XmlPullParserException -> L29
            boolean r3 = r3.containsKey(r0)     // Catch: java.io.IOException -> L27 org.xmlpull.v1.XmlPullParserException -> L29
            if (r3 == 0) goto L5f
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends Yue.ۥ۠ۦۥ۟>> r3 = Yue.C3510.f11057     // Catch: java.lang.Exception -> L53
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.Exception -> L53
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0     // Catch: java.lang.Exception -> L53
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L53
            Yue.ۥ۠ۦۥ۟ r0 = (Yue.AbstractC3483) r0     // Catch: java.lang.Exception -> L53
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r8)     // Catch: java.lang.Exception -> L51
            r0.mo14279(r7, r2)     // Catch: java.lang.Exception -> L51
            r6.m14391(r0)     // Catch: java.lang.Exception -> L51
        L4f:
            r2 = r0
            goto L70
        L51:
            r2 = move-exception
            goto L57
        L53:
            r0 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
        L57:
            java.lang.String r3 = "KeyFrames"
            java.lang.String r4 = "unable to create "
            android.util.Log.e(r3, r4, r2)     // Catch: java.io.IOException -> L27 org.xmlpull.v1.XmlPullParserException -> L29
            goto L4f
        L5f:
            java.lang.String r3 = "CustomAttribute"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.io.IOException -> L27 org.xmlpull.v1.XmlPullParserException -> L29
            if (r0 == 0) goto L70
            if (r2 == 0) goto L70
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ۥ۟> r0 = r2.f10939     // Catch: java.io.IOException -> L27 org.xmlpull.v1.XmlPullParserException -> L29
            if (r0 == 0) goto L70
            androidx.constraintlayout.widget.C7454.m28513(r7, r8, r0)     // Catch: java.io.IOException -> L27 org.xmlpull.v1.XmlPullParserException -> L29
        L70:
            int r0 = r8.next()     // Catch: java.io.IOException -> L27 org.xmlpull.v1.XmlPullParserException -> L29
            goto L10
        L75:
            r7.printStackTrace()
            goto L7c
        L79:
            r7.printStackTrace()
        L7c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.lang.String m14389(int r0, android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r0 = r1.getResourceEntryName(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m14390(Yue.C4269 r4) {
            r3 = this;
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<Yue.ۥ۠ۦۥ۟>> r0 = r3.f11059
            int r1 = r4.f13237
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L13
            r4.m16584(r0)
        L13:
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<Yue.ۥ۠ۦۥ۟>> r0 = r3.f11059
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L46
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠ۦۥ۟ r1 = (Yue.AbstractC3483) r1
            android.view.View r2 = r4.f13236
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r2 = (androidx.constraintlayout.widget.ConstraintLayout.C7450) r2
            java.lang.String r2 = r2.f25970
            boolean r2 = r1.m14280(r2)
            if (r2 == 0) goto L26
            r4.m16583(r1)
            goto L26
        L46:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m14391(Yue.AbstractC3483 r4) {
            r3 = this;
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<Yue.ۥ۠ۦۥ۟>> r0 = r3.f11059
            int r1 = r4.f10936
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L1e
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<Yue.ۥ۠ۦۥ۟>> r0 = r3.f11059
            int r1 = r4.f10936
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.put(r1, r2)
        L1e:
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<Yue.ۥ۠ۦۥ۟>> r0 = r3.f11059
            int r1 = r4.f10936
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.util.ArrayList<Yue.AbstractC3483> m14392(int r2) {
            r1 = this;
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<Yue.ۥ۠ۦۥ۟>> r0 = r1.f11059
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.util.Set<java.lang.Integer> m14393() {
            r1 = this;
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<Yue.ۥ۠ۦۥ۟>> r0 = r1.f11059
            java.util.Set r0 = r0.keySet()
            return r0
    }
}
