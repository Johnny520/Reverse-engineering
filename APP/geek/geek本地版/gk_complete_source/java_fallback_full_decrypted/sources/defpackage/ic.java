package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ic {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;

    public ic(android.content.Context r7, android.content.res.XmlResourceParser r8) {
            r6 = this;
            r6.<init>()
            r0 = 2143289344(0x7fc00000, float:NaN)
            r6.a = r0
            r6.b = r0
            r6.c = r0
            r6.d = r0
            r0 = -1
            r6.e = r0
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r8)
            int[] r0 = defpackage.ry.i
            android.content.res.TypedArray r8 = r7.obtainStyledAttributes(r8, r0)
            int r0 = r8.getIndexCount()
            r1 = 0
        L1f:
            if (r1 >= r0) goto L94
            int r2 = r8.getIndex(r1)
            if (r2 != 0) goto L5a
            int r3 = r6.e
            int r2 = r8.getResourceId(r2, r3)
            r6.e = r2
            android.content.res.Resources r3 = r7.getResources()
            java.lang.String r3 = r3.getResourceTypeName(r2)
            android.content.res.Resources r4 = r7.getResources()
            r4.getResourceName(r2)
            java.lang.String r4 = "layout"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L91
            oc r3 = new oc
            r3.<init>()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r7)
            r5 = 0
            android.view.View r2 = r4.inflate(r2, r5)
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            r3.b(r2)
            goto L91
        L5a:
            r3 = 1
            if (r2 != r3) goto L66
            float r3 = r6.d
            float r2 = r8.getDimension(r2, r3)
            r6.d = r2
            goto L91
        L66:
            r3 = 2
            if (r2 != r3) goto L72
            float r3 = r6.b
            float r2 = r8.getDimension(r2, r3)
            r6.b = r2
            goto L91
        L72:
            r3 = 3
            if (r2 != r3) goto L7e
            float r3 = r6.c
            float r2 = r8.getDimension(r2, r3)
            r6.c = r2
            goto L91
        L7e:
            r3 = 4
            if (r2 != r3) goto L8a
            float r3 = r6.a
            float r2 = r8.getDimension(r2, r3)
            r6.a = r2
            goto L91
        L8a:
            java.lang.String r2 = "ConstraintLayoutStates"
            java.lang.String r3 = "Unknown tag"
            android.util.Log.v(r2, r3)
        L91:
            int r1 = r1 + 1
            goto L1f
        L94:
            r8.recycle()
            return
    }
}
