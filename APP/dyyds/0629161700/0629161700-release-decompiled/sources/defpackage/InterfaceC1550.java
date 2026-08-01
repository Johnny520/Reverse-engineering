package defpackage;

/* JADX INFO: renamed from: ᛸᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1550 {
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    static android.widget.TextView m2826(android.view.View r4) {
            boolean r0 = r4 instanceof android.widget.TextView
            r1 = 0
            r2 = 16908299(0x102000b, float:2.387726E-38)
            if (r0 == 0) goto L22
            int r0 = r4.getId()
            r3 = -1
            if (r0 != r3) goto L13
            r4.setId(r2)
            goto L19
        L13:
            int r0 = r4.getId()
            if (r0 != r2) goto L1c
        L19:
            android.widget.TextView r4 = (android.widget.TextView) r4
            return r4
        L1c:
            java.lang.String r4 = "You must set the ID value of TextView to android.R.id.message"
            defpackage.C2264.m3684(r4)
            return r1
        L22:
            android.view.View r4 = r4.findViewById(r2)
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L2d
            android.widget.TextView r4 = (android.widget.TextView) r4
            return r4
        L2d:
            java.lang.String r4 = "You must include a TextView with an ID value of message (xml code: android:id=\"@android:id/message\", java code: view.setId(android.R.id.message))"
            defpackage.C2264.m3684(r4)
            return r1
    }

    void cancel();

    void setDuration(int r1);

    void setGravity(int r1, int r2, int r3);

    void setMargin(float r1, float r2);

    void setText(java.lang.CharSequence r1);

    void setView(android.view.View r1);

    void show();
}
