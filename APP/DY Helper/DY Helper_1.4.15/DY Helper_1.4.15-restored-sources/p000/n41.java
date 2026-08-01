package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class n41 {

    /* JADX INFO: renamed from: α */
    public static final java.util.Set f7384 = null;

    static {
            r0 = 50
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 100
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 150(0x96, float:2.1E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r0, r1, r2, r3}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.n41.f7384 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static boolean m3951(android.view.View r5, int r6, boolean r7) {
            sv0 r0 = new sv0
            r1 = 26
            r0.<init>(r1)
            android.widget.TextView r0 = m3952(r5, r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L29
            r0.setSingleLine(r2)
            r3 = 2
            r0.setMaxLines(r3)
            java.lang.String r3 = " 条"
            if (r7 == 0) goto L21
            java.lang.String r7 = "缓存条数\n待应用 "
        L1c:
            java.lang.String r7 = p000.AbstractC0602nx.m4127(r7, r6, r3)
            goto L24
        L21:
            java.lang.String r7 = "缓存条数\n自定义 "
            goto L1c
        L24:
            r0.setText(r7)
            r7 = r1
            goto L2a
        L29:
            r7 = r2
        L2a:
            java.util.Set r0 = p000.n41.f7384
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L7d
            sv0 r0 = new sv0
            r3 = 25
            r0.<init>(r3)
            android.widget.TextView r5 = m3952(r5, r0)
            if (r5 == 0) goto L7d
            java.lang.CharSequence r0 = r5.getText()
            java.lang.String r0 = r0.toString()
            r3 = r2
        L4c:
            int r4 = r0.length()
            if (r3 >= r4) goto L62
            char r4 = r0.charAt(r3)
            boolean r4 = p000.jx0.m3020(r4)
            if (r4 == 0) goto L5f
            java.lang.String r0 = " "
            goto L64
        L5f:
            int r3 = r3 + 1
            goto L4c
        L62:
            java.lang.String r0 = ""
        L64:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = "条"
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r5.setText(r6)
            r5 = r1
            goto L7e
        L7d:
            r5 = r2
        L7e:
            if (r7 != 0) goto L84
            if (r5 == 0) goto L83
            goto L84
        L83:
            return r2
        L84:
            return r1
    }

    /* JADX INFO: renamed from: β */
    public static android.widget.TextView m3952(android.view.View r6, p000.a80 r7) {
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r0.add(r6)
            r6 = 0
            r1 = r6
        La:
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 != 0) goto L56
            r2 = 256(0x100, float:3.59E-43)
            if (r1 >= r2) goto L56
            java.lang.Object r2 = r0.removeFirst()
            android.view.View r2 = (android.view.View) r2
            int r1 = r1 + 1
            boolean r4 = r2 instanceof android.widget.TextView
            if (r4 == 0) goto L3f
            r4 = r2
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.CharSequence r5 = r4.getText()
            if (r5 == 0) goto L2e
            java.lang.String r3 = r5.toString()
        L2e:
            if (r3 != 0) goto L32
            java.lang.String r3 = ""
        L32:
            java.lang.Object r3 = r7.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L3f
            return r4
        L3f:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto La
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r3 = r2.getChildCount()
            r4 = r6
        L4a:
            if (r4 >= r3) goto La
            android.view.View r5 = r2.getChildAt(r4)
            r0.addLast(r5)
            int r4 = r4 + 1
            goto L4a
        L56:
            return r3
    }
}
