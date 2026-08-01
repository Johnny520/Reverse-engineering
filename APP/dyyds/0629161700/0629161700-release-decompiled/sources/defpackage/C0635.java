package defpackage;

/* JADX INFO: renamed from: ᛴᛳᛴᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0635 extends android.view.MenuInflater {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final java.lang.Class[] f3142 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final java.lang.Class[] f3143 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.lang.Object f3144;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.content.Context f3145;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Object[] f3146;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object[] f3147;

    static {
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            defpackage.C0635.f3142 = r0
            defpackage.C0635.f3143 = r0
            return
    }

    public C0635(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.f3145 = r1
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0.f3146 = r1
            r0.f3147 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.lang.Object m1472(java.lang.Object r1) {
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L5
            return r1
        L5:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L13
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            java.lang.Object r1 = m1472(r1)
        L13:
            return r1
    }

    @Override // android.view.MenuInflater
    public final void inflate(int r4, android.view.Menu r5) {
            r3 = this;
            java.lang.String r0 = "Error inflating menu XML"
            boolean r1 = r5 instanceof defpackage.MenuC1701
            if (r1 != 0) goto La
            super.inflate(r4, r5)
            return
        La:
            r1 = 0
            android.content.Context r2 = r3.f3145     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            android.content.res.XmlResourceParser r1 = r2.getLayout(r4)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r1)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            r3.m1473(r1, r4, r5)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            r1.close()
            return
        L20:
            r3 = move-exception
            goto L32
        L22:
            r3 = move-exception
            goto L26
        L24:
            r3 = move-exception
            goto L2c
        L26:
            android.view.InflateException r4 = new android.view.InflateException     // Catch: java.lang.Throwable -> L20
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L20
            throw r4     // Catch: java.lang.Throwable -> L20
        L2c:
            android.view.InflateException r4 = new android.view.InflateException     // Catch: java.lang.Throwable -> L20
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L20
            throw r4     // Catch: java.lang.Throwable -> L20
        L32:
            if (r1 == 0) goto L37
            r1.close()
        L37:
            throw r3
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m1473(org.xmlpull.v1.XmlPullParser r17, android.util.AttributeSet r18, android.view.Menu r19) {
            r16 = this;
            r0 = r16
            r1 = r18
            ᛱᲁᛲᛵ r2 = new ᛱᲁᛲᛵ
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
            if (r3 != r5) goto L274
        L36:
            r7 = 0
            r9 = r7
            r10 = r9
            r11 = 0
        L3a:
            if (r9 != 0) goto L273
            if (r3 == r5) goto L26b
            r12 = 3
            java.lang.String r13 = "item"
            java.lang.String r14 = "group"
            android.view.Menu r15 = r2.f1193
            if (r3 == r4) goto Lbd
            if (r3 == r12) goto L4d
        L49:
            r8 = r17
            goto Lba
        L4d:
            java.lang.String r3 = r17.getName()
            if (r10 == 0) goto L60
            boolean r12 = r3.equals(r11)
            if (r12 == 0) goto L60
            r8 = r17
            r10 = r7
            r4 = 0
            r11 = 0
            goto L264
        L60:
            boolean r12 = r3.equals(r14)
            if (r12 == 0) goto L73
            r2.f1203 = r7
            r2.f1192 = r7
            r2.f1190 = r7
            r2.f1187 = r7
            r2.f1204 = r5
            r2.f1207 = r5
            goto L49
        L73:
            boolean r12 = r3.equals(r13)
            if (r12 == 0) goto Lb1
            boolean r3 = r2.f1177
            if (r3 != 0) goto L49
            ᛴᲈᲇᲀ r3 = r2.f1202
            if (r3 == 0) goto L9f
            android.view.ActionProvider r3 = r3.f3711
            boolean r3 = r3.hasSubMenu()
            if (r3 == 0) goto L9f
            r2.f1177 = r5
            int r3 = r2.f1203
            int r12 = r2.f1181
            int r13 = r2.f1194
            java.lang.CharSequence r14 = r2.f1178
            android.view.SubMenu r3 = r15.addSubMenu(r3, r12, r13, r14)
            android.view.MenuItem r3 = r3.getItem()
            r2.m709(r3)
            goto L49
        L9f:
            r2.f1177 = r5
            int r3 = r2.f1203
            int r12 = r2.f1181
            int r13 = r2.f1194
            java.lang.CharSequence r14 = r2.f1178
            android.view.MenuItem r3 = r15.add(r3, r12, r13, r14)
            r2.m709(r3)
            goto L49
        Lb1:
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L49
            r8 = r17
            r9 = r5
        Lba:
            r4 = 0
            goto L264
        Lbd:
            if (r10 == 0) goto Lc0
            goto L49
        Lc0:
            java.lang.String r3 = r17.getName()
            boolean r14 = r3.equals(r14)
            android.content.Context r8 = r0.f3145
            r4 = 4
            if (r14 == 0) goto Lfe
            int[] r3 = defpackage.AbstractC1070.f4803
            android.content.res.TypedArray r3 = r8.obtainStyledAttributes(r1, r3)
            int r8 = r3.getResourceId(r5, r7)
            r2.f1203 = r8
            int r8 = r3.getInt(r12, r7)
            r2.f1192 = r8
            int r4 = r3.getInt(r4, r7)
            r2.f1190 = r4
            r4 = 5
            int r4 = r3.getInt(r4, r7)
            r2.f1187 = r4
            r14 = 2
            boolean r4 = r3.getBoolean(r14, r5)
            r2.f1204 = r4
            boolean r4 = r3.getBoolean(r7, r5)
            r2.f1207 = r4
            r3.recycle()
            goto L49
        Lfe:
            r14 = 2
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L23e
            int[] r3 = defpackage.AbstractC1070.f4798
            android.content.res.TypedArray r3 = r8.obtainStyledAttributes(r1, r3)
            int r13 = r3.getResourceId(r14, r7)
            r2.f1181 = r13
            int r13 = r2.f1192
            r15 = 5
            int r13 = r3.getInt(r15, r13)
            r15 = 6
            int r14 = r2.f1190
            int r14 = r3.getInt(r15, r14)
            r15 = -65536(0xffffffffffff0000, float:NaN)
            r13 = r13 & r15
            r15 = 65535(0xffff, float:9.1834E-41)
            r14 = r14 & r15
            r13 = r13 | r14
            r2.f1194 = r13
            r13 = 7
            java.lang.CharSequence r13 = r3.getText(r13)
            r2.f1178 = r13
            r13 = 8
            java.lang.CharSequence r13 = r3.getText(r13)
            r2.f1180 = r13
            int r13 = r3.getResourceId(r7, r7)
            r2.f1189 = r13
            r13 = 9
            java.lang.String r13 = r3.getString(r13)
            if (r13 != 0) goto L148
            r13 = r7
            goto L14c
        L148:
            char r13 = r13.charAt(r7)
        L14c:
            r2.f1195 = r13
            r13 = 16
            r14 = 4096(0x1000, float:5.74E-42)
            int r13 = r3.getInt(r13, r14)
            r2.f1184 = r13
            r13 = 10
            java.lang.String r13 = r3.getString(r13)
            if (r13 != 0) goto L162
            r13 = r7
            goto L166
        L162:
            char r13 = r13.charAt(r7)
        L166:
            r2.f1205 = r13
            r13 = 20
            int r13 = r3.getInt(r13, r14)
            r2.f1200 = r13
            r13 = 11
            boolean r14 = r3.hasValue(r13)
            if (r14 == 0) goto L17f
            boolean r13 = r3.getBoolean(r13, r7)
            r2.f1201 = r13
            goto L183
        L17f:
            int r13 = r2.f1187
            r2.f1201 = r13
        L183:
            boolean r12 = r3.getBoolean(r12, r7)
            r2.f1185 = r12
            boolean r12 = r2.f1204
            boolean r4 = r3.getBoolean(r4, r12)
            r2.f1183 = r4
            boolean r4 = r2.f1207
            boolean r4 = r3.getBoolean(r5, r4)
            r2.f1182 = r4
            r4 = 21
            r12 = -1
            int r4 = r3.getInt(r4, r12)
            r2.f1191 = r4
            r4 = 12
            java.lang.String r4 = r3.getString(r4)
            r2.f1206 = r4
            r4 = 13
            int r4 = r3.getResourceId(r4, r7)
            r2.f1196 = r4
            r4 = 15
            java.lang.String r4 = r3.getString(r4)
            r2.f1198 = r4
            r4 = 14
            java.lang.String r4 = r3.getString(r4)
            if (r4 == 0) goto L1c4
            r13 = r5
            goto L1c5
        L1c4:
            r13 = r7
        L1c5:
            if (r13 == 0) goto L1dc
            int r14 = r2.f1196
            if (r14 != 0) goto L1dc
            java.lang.String r14 = r2.f1198
            if (r14 != 0) goto L1dc
            java.lang.Class[] r13 = defpackage.C0635.f3143
            java.lang.Object[] r14 = r0.f3147
            java.lang.Object r4 = r2.m708(r4, r13, r14)
            ᛴᲈᲇᲀ r4 = (defpackage.ActionProviderVisibilityListenerC0803) r4
            r2.f1202 = r4
            goto L1e8
        L1dc:
            if (r13 == 0) goto L1e5
            java.lang.String r4 = "SupportMenuInflater"
            java.lang.String r13 = "Ignoring attribute 'actionProviderClass'. Action view already specified."
            android.util.Log.w(r4, r13)
        L1e5:
            r4 = 0
            r2.f1202 = r4
        L1e8:
            r4 = 17
            java.lang.CharSequence r4 = r3.getText(r4)
            r2.f1199 = r4
            r4 = 22
            java.lang.CharSequence r4 = r3.getText(r4)
            r2.f1186 = r4
            r4 = 19
            boolean r13 = r3.hasValue(r4)
            if (r13 == 0) goto L20d
            int r4 = r3.getInt(r4, r12)
            android.graphics.PorterDuff$Mode r12 = r2.f1197
            android.graphics.PorterDuff$Mode r4 = defpackage.AbstractC1660.m3053(r4, r12)
            r2.f1197 = r4
            goto L210
        L20d:
            r4 = 0
            r2.f1197 = r4
        L210:
            r4 = 18
            boolean r12 = r3.hasValue(r4)
            if (r12 == 0) goto L233
            boolean r12 = r3.hasValue(r4)
            if (r12 == 0) goto L22b
            int r12 = r3.getResourceId(r4, r7)
            if (r12 == 0) goto L22b
            android.content.res.ColorStateList r8 = defpackage.AbstractC2279.m3698(r8, r12)
            if (r8 == 0) goto L22b
            goto L22f
        L22b:
            android.content.res.ColorStateList r8 = r3.getColorStateList(r4)
        L22f:
            r2.f1188 = r8
            r4 = 0
            goto L236
        L233:
            r4 = 0
            r2.f1188 = r4
        L236:
            r3.recycle()
            r2.f1177 = r7
            r8 = r17
            goto L264
        L23e:
            r4 = 0
            boolean r8 = r3.equals(r6)
            if (r8 == 0) goto L260
            r2.f1177 = r5
            int r3 = r2.f1203
            int r8 = r2.f1181
            int r12 = r2.f1194
            java.lang.CharSequence r13 = r2.f1178
            android.view.SubMenu r3 = r15.addSubMenu(r3, r8, r12, r13)
            android.view.MenuItem r8 = r3.getItem()
            r2.m709(r8)
            r8 = r17
            r0.m1473(r8, r1, r3)
            goto L264
        L260:
            r8 = r17
            r11 = r3
            r10 = r5
        L264:
            int r3 = r8.next()
            r4 = 2
            goto L3a
        L26b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unexpected end of document"
            r0.<init>(r1)
            throw r0
        L273:
            return
        L274:
            r8 = r17
            goto Lf
    }
}
