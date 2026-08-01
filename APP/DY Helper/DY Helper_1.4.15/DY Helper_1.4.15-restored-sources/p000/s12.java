package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class s12 extends android.view.MenuInflater {

    /* JADX INFO: renamed from: ε */
    public static final java.lang.Class[] f9675 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.lang.Class[] f9676 = null;

    /* JADX INFO: renamed from: α */
    public final java.lang.Object[] f9677;

    /* JADX INFO: renamed from: β */
    public final java.lang.Object[] f9678;

    /* JADX INFO: renamed from: γ */
    public final android.content.Context f9679;

    /* JADX INFO: renamed from: δ */
    public java.lang.Object f9680;

    static {
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            p000.s12.f9675 = r0
            p000.s12.f9676 = r0
            return
    }

    public s12(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.f9679 = r1
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0.f9677 = r1
            r0.f9678 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.Object m5350(java.lang.Object r1) {
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L5
            return r1
        L5:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L13
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            java.lang.Object r1 = m5350(r1)
        L13:
            return r1
    }

    @Override // android.view.MenuInflater
    public final void inflate(int r6, android.view.Menu r7) {
            r5 = this;
            java.lang.String r0 = "Error inflating menu XML"
            boolean r1 = r7 instanceof p000.iz0
            if (r1 != 0) goto La
            super.inflate(r6, r7)
            return
        La:
            r1 = 0
            r2 = 0
            android.content.Context r3 = r5.f9679     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            android.content.res.XmlResourceParser r1 = r3.getLayout(r6)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r1)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            boolean r3 = r7 instanceof p000.iz0     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            if (r3 == 0) goto L30
            r3 = r7
            iz0 r3 = (p000.iz0) r3     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            boolean r4 = r3.f5266     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            if (r4 != 0) goto L30
            r3.m2843()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            r2 = 1
            goto L30
        L2a:
            r5 = move-exception
            goto L4a
        L2c:
            r5 = move-exception
            goto L3e
        L2e:
            r5 = move-exception
            goto L44
        L30:
            r5.m5351(r1, r6, r7)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            if (r2 == 0) goto L3a
            iz0 r7 = (p000.iz0) r7
            r7.m2842()
        L3a:
            r1.close()
            return
        L3e:
            android.view.InflateException r6 = new android.view.InflateException     // Catch: java.lang.Throwable -> L2a
            r6.<init>(r0, r5)     // Catch: java.lang.Throwable -> L2a
            throw r6     // Catch: java.lang.Throwable -> L2a
        L44:
            android.view.InflateException r6 = new android.view.InflateException     // Catch: java.lang.Throwable -> L2a
            r6.<init>(r0, r5)     // Catch: java.lang.Throwable -> L2a
            throw r6     // Catch: java.lang.Throwable -> L2a
        L4a:
            if (r2 == 0) goto L51
            iz0 r7 = (p000.iz0) r7
            r7.m2842()
        L51:
            if (r1 == 0) goto L56
            r1.close()
        L56:
            throw r5
    }

    /* JADX INFO: renamed from: β */
    public final void m5351(org.xmlpull.v1.XmlPullParser r17, android.util.AttributeSet r18, android.view.Menu r19) {
            r16 = this;
            r0 = r16
            r1 = r18
            r12 r2 = new r12
            r3 = r19
            r2.<init>(r0, r3)
            int r3 = r17.getEventType()
        Lf:
            r4 = 2
            r5 = 1
            java.lang.String r6 = "menu"
            if (r3 != r4) goto L30
            java.lang.String r3 = r17.getName()
            boolean r7 = r3.equals(r6)
            if (r7 == 0) goto L24
            int r3 = r17.next()
            goto L36
        L24:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Expecting menu, got "
            java.lang.String r1 = r1.concat(r3)
            r0.<init>(r1)
            throw r0
        L30:
            int r3 = r17.next()
            if (r3 != r5) goto L276
        L36:
            r7 = 0
            r9 = r7
            r10 = r9
            r11 = 0
        L3a:
            if (r9 != 0) goto L275
            if (r3 == r5) goto L26d
            r12 = 3
            java.lang.String r13 = "item"
            java.lang.String r14 = "group"
            android.view.Menu r15 = r2.f9209
            if (r3 == r4) goto Lbf
            if (r3 == r12) goto L4d
        L49:
            r8 = r17
            goto Lbc
        L4d:
            java.lang.String r3 = r17.getName()
            if (r10 == 0) goto L60
            boolean r12 = r3.equals(r11)
            if (r12 == 0) goto L60
            r8 = r17
            r10 = r7
            r4 = 0
            r11 = 0
            goto L266
        L60:
            boolean r12 = r3.equals(r14)
            if (r12 == 0) goto L73
            r2.f9210 = r7
            r2.f9211 = r7
            r2.f9212 = r7
            r2.f9213 = r7
            r2.f9214 = r5
            r2.f9215 = r5
            goto L49
        L73:
            boolean r12 = r3.equals(r13)
            if (r12 == 0) goto Lb3
            boolean r3 = r2.f9216
            if (r3 != 0) goto L49
            ｘ r3 = r2.f9203
            if (r3 == 0) goto La1
            mz0 r3 = (p000.mz0) r3
            android.view.ActionProvider r3 = r3.f7333
            boolean r3 = r3.hasSubMenu()
            if (r3 == 0) goto La1
            r2.f9216 = r5
            int r3 = r2.f9210
            int r12 = r2.f9217
            int r13 = r2.f9218
            java.lang.CharSequence r14 = r2.f9219
            android.view.SubMenu r3 = r15.addSubMenu(r3, r12, r13, r14)
            android.view.MenuItem r3 = r3.getItem()
            r2.m5050(r3)
            goto L49
        La1:
            r2.f9216 = r5
            int r3 = r2.f9210
            int r12 = r2.f9217
            int r13 = r2.f9218
            java.lang.CharSequence r14 = r2.f9219
            android.view.MenuItem r3 = r15.add(r3, r12, r13, r14)
            r2.m5050(r3)
            goto L49
        Lb3:
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L49
            r8 = r17
            r9 = r5
        Lbc:
            r4 = 0
            goto L266
        Lbf:
            if (r10 == 0) goto Lc2
            goto L49
        Lc2:
            java.lang.String r3 = r17.getName()
            boolean r14 = r3.equals(r14)
            android.content.Context r8 = r0.f9679
            r4 = 4
            if (r14 == 0) goto L100
            int[] r3 = p000.kk1.f5983
            android.content.res.TypedArray r3 = r8.obtainStyledAttributes(r1, r3)
            int r8 = r3.getResourceId(r5, r7)
            r2.f9210 = r8
            int r8 = r3.getInt(r12, r7)
            r2.f9211 = r8
            int r4 = r3.getInt(r4, r7)
            r2.f9212 = r4
            r4 = 5
            int r4 = r3.getInt(r4, r7)
            r2.f9213 = r4
            r14 = 2
            boolean r4 = r3.getBoolean(r14, r5)
            r2.f9214 = r4
            boolean r4 = r3.getBoolean(r7, r5)
            r2.f9215 = r4
            r3.recycle()
            goto L49
        L100:
            r14 = 2
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L240
            int[] r3 = p000.kk1.f5984
            android.content.res.TypedArray r3 = r8.obtainStyledAttributes(r1, r3)
            int r13 = r3.getResourceId(r14, r7)
            r2.f9217 = r13
            int r13 = r2.f9211
            r15 = 5
            int r13 = r3.getInt(r15, r13)
            r15 = 6
            int r14 = r2.f9212
            int r14 = r3.getInt(r15, r14)
            r15 = -65536(0xffffffffffff0000, float:NaN)
            r13 = r13 & r15
            r15 = 65535(0xffff, float:9.1834E-41)
            r14 = r14 & r15
            r13 = r13 | r14
            r2.f9218 = r13
            r13 = 7
            java.lang.CharSequence r13 = r3.getText(r13)
            r2.f9219 = r13
            r13 = 8
            java.lang.CharSequence r13 = r3.getText(r13)
            r2.f9220 = r13
            int r13 = r3.getResourceId(r7, r7)
            r2.f9221 = r13
            r13 = 9
            java.lang.String r13 = r3.getString(r13)
            if (r13 != 0) goto L14a
            r13 = r7
            goto L14e
        L14a:
            char r13 = r13.charAt(r7)
        L14e:
            r2.f9222 = r13
            r13 = 16
            r14 = 4096(0x1000, float:5.74E-42)
            int r13 = r3.getInt(r13, r14)
            r2.f9223 = r13
            r13 = 10
            java.lang.String r13 = r3.getString(r13)
            if (r13 != 0) goto L164
            r13 = r7
            goto L168
        L164:
            char r13 = r13.charAt(r7)
        L168:
            r2.f9224 = r13
            r13 = 20
            int r13 = r3.getInt(r13, r14)
            r2.f9225 = r13
            r13 = 11
            boolean r14 = r3.hasValue(r13)
            if (r14 == 0) goto L181
            boolean r13 = r3.getBoolean(r13, r7)
            r2.f9226 = r13
            goto L185
        L181:
            int r13 = r2.f9213
            r2.f9226 = r13
        L185:
            boolean r12 = r3.getBoolean(r12, r7)
            r2.f9227 = r12
            boolean r12 = r2.f9214
            boolean r4 = r3.getBoolean(r4, r12)
            r2.f9228 = r4
            boolean r4 = r2.f9215
            boolean r4 = r3.getBoolean(r5, r4)
            r2.f9229 = r4
            r4 = 21
            r12 = -1
            int r4 = r3.getInt(r4, r12)
            r2.f9230 = r4
            r4 = 12
            java.lang.String r4 = r3.getString(r4)
            r2.f9202 = r4
            r4 = 13
            int r4 = r3.getResourceId(r4, r7)
            r2.f9231 = r4
            r4 = 15
            java.lang.String r4 = r3.getString(r4)
            r2.f9232 = r4
            r4 = 14
            java.lang.String r4 = r3.getString(r4)
            if (r4 == 0) goto L1c6
            r13 = r5
            goto L1c7
        L1c6:
            r13 = r7
        L1c7:
            if (r13 == 0) goto L1de
            int r14 = r2.f9231
            if (r14 != 0) goto L1de
            java.lang.String r14 = r2.f9232
            if (r14 != 0) goto L1de
            java.lang.Class[] r13 = p000.s12.f9676
            java.lang.Object[] r14 = r0.f9678
            java.lang.Object r4 = r2.m5049(r4, r13, r14)
            ｘ r4 = (p000.AbstractC1154) r4
            r2.f9203 = r4
            goto L1ea
        L1de:
            if (r13 == 0) goto L1e7
            java.lang.String r4 = "SupportMenuInflater"
            java.lang.String r13 = "Ignoring attribute 'actionProviderClass'. Action view already specified."
            android.util.Log.w(r4, r13)
        L1e7:
            r4 = 0
            r2.f9203 = r4
        L1ea:
            r4 = 17
            java.lang.CharSequence r4 = r3.getText(r4)
            r2.f9204 = r4
            r4 = 22
            java.lang.CharSequence r4 = r3.getText(r4)
            r2.f9205 = r4
            r4 = 19
            boolean r13 = r3.hasValue(r4)
            if (r13 == 0) goto L20f
            int r4 = r3.getInt(r4, r12)
            android.graphics.PorterDuff$Mode r12 = r2.f9207
            android.graphics.PorterDuff$Mode r4 = p000.AbstractC0300fw.m2207(r4, r12)
            r2.f9207 = r4
            goto L212
        L20f:
            r4 = 0
            r2.f9207 = r4
        L212:
            r4 = 18
            boolean r12 = r3.hasValue(r4)
            if (r12 == 0) goto L235
            boolean r12 = r3.hasValue(r4)
            if (r12 == 0) goto L22d
            int r12 = r3.getResourceId(r4, r7)
            if (r12 == 0) goto L22d
            android.content.res.ColorStateList r8 = p000.ln0.m3600(r8, r12)
            if (r8 == 0) goto L22d
            goto L231
        L22d:
            android.content.res.ColorStateList r8 = r3.getColorStateList(r4)
        L231:
            r2.f9206 = r8
            r4 = 0
            goto L238
        L235:
            r4 = 0
            r2.f9206 = r4
        L238:
            r3.recycle()
            r2.f9216 = r7
            r8 = r17
            goto L266
        L240:
            r4 = 0
            boolean r8 = r3.equals(r6)
            if (r8 == 0) goto L262
            r2.f9216 = r5
            int r3 = r2.f9210
            int r8 = r2.f9217
            int r12 = r2.f9218
            java.lang.CharSequence r13 = r2.f9219
            android.view.SubMenu r3 = r15.addSubMenu(r3, r8, r12, r13)
            android.view.MenuItem r8 = r3.getItem()
            r2.m5050(r8)
            r8 = r17
            r0.m5351(r8, r1, r3)
            goto L266
        L262:
            r8 = r17
            r11 = r3
            r10 = r5
        L266:
            int r3 = r8.next()
            r4 = 2
            goto L3a
        L26d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unexpected end of document"
            r0.<init>(r1)
            throw r0
        L275:
            return
        L276:
            r8 = r17
            goto Lf
    }
}
