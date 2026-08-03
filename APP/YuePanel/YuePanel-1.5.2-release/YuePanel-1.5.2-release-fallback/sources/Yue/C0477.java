package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0477 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f1210 = "ReceiveContent";

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡ۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static final class C0478 {
        public C0478() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m1734(@Yue.InterfaceC4410 android.view.DragEvent r1, @Yue.InterfaceC4410 android.widget.TextView r2, @Yue.InterfaceC4410 android.app.Activity r3) {
                r3.requestDragAndDropPermissions(r1)
                float r3 = r1.getX()
                float r0 = r1.getY()
                int r3 = r2.getOffsetForPosition(r3, r0)
                r2.beginBatchEdit()
                java.lang.CharSequence r0 = r2.getText()     // Catch: java.lang.Throwable -> L31
                android.text.Spannable r0 = (android.text.Spannable) r0     // Catch: java.lang.Throwable -> L31
                android.text.Selection.setSelection(r0, r3)     // Catch: java.lang.Throwable -> L31
                Yue.ۥۣ۟ۧۡ$ۥ۟ r3 = new Yue.ۥۣ۟ۧۡ$ۥ۟     // Catch: java.lang.Throwable -> L31
                android.content.ClipData r1 = r1.getClipData()     // Catch: java.lang.Throwable -> L31
                r0 = 3
                r3.<init>(r1, r0)     // Catch: java.lang.Throwable -> L31
                Yue.ۥۣ۟ۧۡ r1 = r3.m7702()     // Catch: java.lang.Throwable -> L31
                Yue.C6794.m26208(r2, r1)     // Catch: java.lang.Throwable -> L31
                r2.endBatchEdit()
                r1 = 1
                return r1
            L31:
                r1 = move-exception
                r2.endBatchEdit()
                throw r1
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static boolean m1735(@Yue.InterfaceC4410 android.view.DragEvent r1, @Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 android.app.Activity r3) {
                r3.requestDragAndDropPermissions(r1)
                Yue.ۥۣ۟ۧۡ$ۥ۟ r3 = new Yue.ۥۣ۟ۧۡ$ۥ۟
                android.content.ClipData r1 = r1.getClipData()
                r0 = 3
                r3.<init>(r1, r0)
                Yue.ۥۣ۟ۧۡ r1 = r3.m7702()
                Yue.C6794.m26208(r2, r1)
                r1 = 1
                return r1
        }
    }

    public C0477() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m1731(@Yue.InterfaceC4410 android.view.View r4, @Yue.InterfaceC4410 android.view.DragEvent r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 >= r1) goto L53
            java.lang.Object r0 = r5.getLocalState()
            if (r0 != 0) goto L53
            java.lang.String[] r0 = Yue.C6794.m26148(r4)
            if (r0 != 0) goto L14
            goto L53
        L14:
            android.app.Activity r0 = m1733(r4)
            if (r0 != 0) goto L31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Can't handle drop: no activity: view="
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "ReceiveContent"
            android.util.Log.i(r5, r4)
            return r2
        L31:
            int r1 = r5.getAction()
            r3 = 1
            if (r1 != r3) goto L3c
            boolean r4 = r4 instanceof android.widget.TextView
            r4 = r4 ^ r3
            return r4
        L3c:
            int r1 = r5.getAction()
            r3 = 3
            if (r1 != r3) goto L53
            boolean r1 = r4 instanceof android.widget.TextView
            if (r1 == 0) goto L4e
            android.widget.TextView r4 = (android.widget.TextView) r4
            boolean r4 = Yue.C0477.C0478.m1734(r5, r4, r0)
            goto L52
        L4e:
            boolean r4 = Yue.C0477.C0478.m1735(r5, r4, r0)
        L52:
            return r4
        L53:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static boolean m1732(@Yue.InterfaceC4410 android.widget.TextView r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 >= r1) goto L4a
            java.lang.String[] r0 = Yue.C6794.m26148(r5)
            if (r0 == 0) goto L4a
            r0 = 16908322(0x1020022, float:2.3877324E-38)
            if (r6 == r0) goto L18
            r1 = 16908337(0x1020031, float:2.3877366E-38)
            if (r6 == r1) goto L18
            goto L4a
        L18:
            android.content.Context r1 = r5.getContext()
            java.lang.String r3 = "clipboard"
            java.lang.Object r1 = r1.getSystemService(r3)
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
            if (r1 != 0) goto L28
            r1 = 0
            goto L2c
        L28:
            android.content.ClipData r1 = r1.getPrimaryClip()
        L2c:
            r3 = 1
            if (r1 == 0) goto L49
            int r4 = r1.getItemCount()
            if (r4 <= 0) goto L49
            Yue.ۥۣ۟ۧۡ$ۥ۟ r4 = new Yue.ۥۣ۟ۧۡ$ۥ۟
            r4.<init>(r1, r3)
            if (r6 != r0) goto L3d
            goto L3e
        L3d:
            r2 = r3
        L3e:
            Yue.ۥۣ۟ۧۡ$ۥ۟ r6 = r4.m7705(r2)
            Yue.ۥۣ۟ۧۡ r6 = r6.m7702()
            Yue.C6794.m26208(r5, r6)
        L49:
            return r3
        L4a:
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static android.app.Activity m1733(@Yue.InterfaceC4410 android.view.View r1) {
            android.content.Context r1 = r1.getContext()
        L4:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L16
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto Lf
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
        Lf:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L4
        L16:
            r1 = 0
            return r1
    }
}
