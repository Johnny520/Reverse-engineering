package kevin.fun.hook.download;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DownloadManager$$ExternalSyntheticLambda14 implements java.lang.Runnable {
    public final kevin.fun.hook.download.DownloadManager f$0;
    public final java.lang.ref.WeakReference f$1;
    public final android.widget.TextView[] f$10;
    public final android.widget.ProgressBar[] f$11;
    public final android.widget.TextView[] f$12;
    public final android.app.Dialog[] f$2;
    public final java.lang.String f$3;
    public final java.lang.String f$4;
    public final boolean[] f$5;
    public final boolean[] f$6;
    public final okhttp3.Call[] f$7;
    public final android.net.Uri[] f$8;
    public final android.content.Context f$9;

    static {
            return
    }

    public /* synthetic */ DownloadManager$$ExternalSyntheticLambda14(kevin.fun.hook.download.DownloadManager r3, java.lang.ref.WeakReference r4, android.app.Dialog[] r5, java.lang.String r6, java.lang.String r7, boolean[] r8, boolean[] r9, okhttp3.Call[] r10, android.net.Uri[] r11, android.content.Context r12, android.widget.TextView[] r13, android.widget.ProgressBar[] r14, android.widget.TextView[] r15) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            r2.f$3 = r6
            r2.f$4 = r7
            r2.f$5 = r8
            r2.f$6 = r9
            r2.f$7 = r10
            r2.f$8 = r11
            r2.f$9 = r12
            r2.f$10 = r13
            r2.f$11 = r14
            r2.f$12 = r15
            int r1 = androidx.loader.C1096.m2651()
            r0 = 1616(0x650, float:2.264E-42)
        L23:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L29;
                case 49: goto L2c;
                case 204: goto L31;
                case 239: goto L40;
                default: goto L28;
            }
        L28:
            goto L23
        L29:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L23
        L2c:
            if (r1 < 0) goto L29
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L23
        L31:
            java.lang.String r0 = "tv"
            java.lang.String r0 = androidx.vectordrawable.C1105.m3273(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L40:
            return
    }

    /* JADX INFO: renamed from: ۢۦۤ۠, reason: not valid java name and contains not printable characters */
    public static void m8263(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22, java.lang.Object r23, java.lang.Object r24, java.lang.Object r25) {
            int r1 = androidx.core.C1072.m980()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L49;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            r0 = r13
            kevin.fun.hook.download.DownloadManager r0 = (kevin.fun.hook.download.DownloadManager) r0
            r1 = r14
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            r2 = r15
            android.app.Dialog[] r2 = (android.app.Dialog[]) r2
            r3 = r16
            java.lang.String r3 = (java.lang.String) r3
            r4 = r17
            java.lang.String r4 = (java.lang.String) r4
            r5 = r18
            boolean[] r5 = (boolean[]) r5
            r6 = r19
            boolean[] r6 = (boolean[]) r6
            r7 = r20
            okhttp3.Call[] r7 = (okhttp3.Call[]) r7
            r8 = r21
            android.net.Uri[] r8 = (android.net.Uri[]) r8
            r9 = r22
            android.content.Context r9 = (android.content.Context) r9
            r10 = r23
            android.widget.TextView[] r10 = (android.widget.TextView[]) r10
            r11 = r24
            android.widget.ProgressBar[] r11 = (android.widget.ProgressBar[]) r11
            r12 = r25
            android.widget.TextView[] r12 = (android.widget.TextView[]) r12
            r0.m8250lambda$2$kevinfunhookdownloadDownloadManager(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L48:
            return
        L49:
            r0 = 1740(0x6cc, float:2.438E-42)
        L4b:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L51;
                case 54: goto L48;
                default: goto L50;
            }
        L50:
            goto L4b
        L51:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L4b
    }

    @Override // java.lang.Runnable
    public final void run() {
            r13 = this;
            kevin.fun.hook.download.DownloadManager r0 = androidx.vectordrawable.animated.C1102.m3078(r13)
            java.lang.ref.WeakReference r1 = androidx.documentfile.C1076.m1252(r13)
            android.app.Dialog[] r2 = androidx.lifecycle.process.C1087.m1970(r13)
            java.lang.String r3 = androidx.loader.C1099.m2875(r13)
            java.lang.String r4 = androidx.appcompat.C1069.m740(r13)
            boolean[] r5 = kevin.fun.hook.webdav.C1118.m8537(r13)
            boolean[] r6 = androidx.interpolator.C1081.m1601(r13)
            okhttp3.Call[] r7 = androidx.core.ktx.C1071.m849(r13)
            android.net.Uri[] r8 = androidx.activity.C1064.m375(r13)
            android.content.Context r9 = androidx.viewpager.C1108.m3499(r13)
            android.widget.TextView[] r10 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3852(r13)
            android.widget.ProgressBar[] r11 = androidx.vectordrawable.C1105.m3312(r13)
            android.widget.TextView[] r12 = androidx.emoji2.viewsintegration.C1078.m1362(r13)
            m8263(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            int r1 = androidx.customview.C1075.m1139()
            r0 = 1616(0x650, float:2.264E-42)
        L3d:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L43;
                case 49: goto L46;
                case 204: goto L4b;
                case 239: goto L5a;
                default: goto L42;
            }
        L42:
            goto L3d
        L43:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L3d
        L46:
            if (r1 > 0) goto L43
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L3d
        L4b:
            java.lang.String r0 = "lgk4ywBJuYCjfTvjNrLZYo"
            java.lang.String r0 = androidx.lifecycle.viewmodel.C1093.m2376(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L5a:
            return
    }
}
