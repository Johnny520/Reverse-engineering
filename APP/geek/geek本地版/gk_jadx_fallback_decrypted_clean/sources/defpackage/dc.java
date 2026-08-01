package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dc {
    public int a;
    public int b;
    public float c;
    public java.lang.String d;
    public boolean e;
    public int f;

    public dc(defpackage.dc r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r1.getClass()
            int r1 = r1.a
            r0.a = r1
            r0.b(r2)
            return
    }

    public static void a(android.content.Context r13, android.content.res.XmlResourceParser r14, java.util.HashMap r15) {
            android.util.AttributeSet r14 = android.util.Xml.asAttributeSet(r14)
            int[] r0 = defpackage.ry.c
            android.content.res.TypedArray r14 = r13.obtainStyledAttributes(r14, r0)
            int r0 = r14.getIndexCount()
            r1 = 0
            r2 = 0
            r4 = r1
            r5 = r4
            r3 = r2
        L13:
            if (r4 >= r0) goto Lbb
            int r6 = r14.getIndex(r4)
            r7 = 1
            if (r6 != 0) goto L45
            java.lang.String r2 = r14.getString(r6)
            if (r2 == 0) goto Lb7
            int r6 = r2.length()
            if (r6 <= 0) goto Lb7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            char r8 = r2.charAt(r1)
            char r8 = java.lang.Character.toUpperCase(r8)
            r6.append(r8)
            java.lang.String r2 = r2.substring(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            goto Lb7
        L45:
            r8 = 6
            if (r6 != r7) goto L53
            boolean r3 = r14.getBoolean(r6, r1)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r5 = r8
            goto Lb7
        L53:
            r9 = 3
            if (r6 != r9) goto L60
            int r3 = r14.getColor(r6, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L5e:
            r5 = r9
            goto Lb7
        L60:
            r9 = 4
            r10 = 2
            if (r6 != r10) goto L6d
            int r3 = r14.getColor(r6, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L5e
        L6d:
            r11 = 0
            r12 = 7
            if (r6 != r12) goto L87
            float r3 = r14.getDimension(r6, r11)
            android.content.res.Resources r5 = r13.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r3 = android.util.TypedValue.applyDimension(r7, r3, r5)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
        L85:
            r5 = r12
            goto Lb7
        L87:
            if (r6 != r9) goto L92
            float r3 = r14.getDimension(r6, r11)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L85
        L92:
            r9 = 5
            if (r6 != r9) goto La1
            r3 = 2143289344(0x7fc00000, float:NaN)
            float r3 = r14.getFloat(r6, r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r5 = r10
            goto Lb7
        La1:
            if (r6 != r8) goto Lae
            r3 = -1
            int r3 = r14.getInteger(r6, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = r7
            goto Lb7
        Lae:
            r7 = 8
            if (r6 != r7) goto Lb7
            java.lang.String r3 = r14.getString(r6)
            goto L5e
        Lb7:
            int r4 = r4 + 1
            goto L13
        Lbb:
            if (r2 == 0) goto Lcc
            if (r3 == 0) goto Lcc
            dc r13 = new dc
            r13.<init>()
            r13.a = r5
            r13.b(r3)
            r15.put(r2, r13)
        Lcc:
            r14.recycle()
            return
    }

    public final void b(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.a
            int r0 = defpackage.z30.t(r0)
            switch(r0) {
                case 0: goto L33;
                case 1: goto L2a;
                case 2: goto L21;
                case 3: goto L21;
                case 4: goto L1c;
                case 5: goto L13;
                case 6: goto La;
                default: goto L9;
            }
        L9:
            return
        La:
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.c = r2
            return
        L13:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r1.e = r2
            return
        L1c:
            java.lang.String r2 = (java.lang.String) r2
            r1.d = r2
            return
        L21:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.f = r2
            return
        L2a:
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.c = r2
            return
        L33:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.b = r2
            return
    }
}
