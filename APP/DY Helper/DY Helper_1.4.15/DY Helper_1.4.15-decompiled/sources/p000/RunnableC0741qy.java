package p000;

/* JADX INFO: renamed from: qy */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0741qy extends p000.AbstractC0339gy implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final java.lang.ref.WeakReference f9155;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.ref.WeakReference f9156;

    public RunnableC0741qy(android.widget.TextView r2, p000.C0778ry r3) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.f9155 = r0
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r3)
            r1.f9156 = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            java.lang.ref.WeakReference r0 = r5.f9155
            java.lang.Object r0 = r0.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.ref.WeakReference r5 = r5.f9156
            java.lang.Object r5 = r5.get()
            android.text.InputFilter r5 = (android.text.InputFilter) r5
            if (r5 == 0) goto L6d
            if (r0 != 0) goto L15
            goto L6d
        L15:
            android.text.InputFilter[] r1 = r0.getFilters()
            if (r1 != 0) goto L1c
            goto L6d
        L1c:
            r2 = 0
            r3 = r2
        L1e:
            int r4 = r1.length
            if (r3 >= r4) goto L6d
            r4 = r1[r3]
            if (r4 != r5) goto L6a
            boolean r5 = r0.isAttachedToWindow()
            if (r5 == 0) goto L6d
            java.lang.CharSequence r5 = r0.getText()
            jy r1 = p000.C0449jy.m3071()
            if (r5 != 0) goto L37
            r3 = r2
            goto L3e
        L37:
            r1.getClass()
            int r3 = r5.length()
        L3e:
            java.lang.CharSequence r1 = r1.m3076(r2, r3, r2, r5)
            if (r5 != r1) goto L45
            goto L6d
        L45:
            int r5 = android.text.Selection.getSelectionStart(r1)
            int r2 = android.text.Selection.getSelectionEnd(r1)
            r0.setText(r1)
            boolean r0 = r1 instanceof android.text.Spannable
            if (r0 == 0) goto L6d
            android.text.Spannable r1 = (android.text.Spannable) r1
            if (r5 < 0) goto L5e
            if (r2 < 0) goto L5e
            android.text.Selection.setSelection(r1, r5, r2)
            return
        L5e:
            if (r5 < 0) goto L64
            android.text.Selection.setSelection(r1, r5)
            return
        L64:
            if (r2 < 0) goto L6d
            android.text.Selection.setSelection(r1, r2)
            return
        L6a:
            int r3 = r3 + 1
            goto L1e
        L6d:
            return
    }

    @Override // p000.AbstractC0339gy
    /* JADX INFO: renamed from: β */
    public final void mo643() {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.f9155
            java.lang.Object r0 = r0.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 != 0) goto Lb
            goto L14
        Lb:
            android.os.Handler r0 = r0.getHandler()
            if (r0 == 0) goto L14
            r0.post(r1)
        L14:
            return
    }
}
