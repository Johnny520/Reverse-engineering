package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class CommentRouterTraceHook {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.CommentRouterTraceHook INSTANCE = null;
    private static final java.lang.String TAG = "rfd109da2e72860ec";





    static {
            com.example.dyhelper.hook.comment.bookmark.CommentRouterTraceHook r0 = new com.example.dyhelper.hook.comment.bookmark.CommentRouterTraceHook
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentRouterTraceHook.INSTANCE = r0
            return
    }

    private CommentRouterTraceHook() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ void access$dumpIntent(com.example.dyhelper.hook.comment.bookmark.CommentRouterTraceHook r0, java.lang.String r1, java.lang.Object r2, java.lang.Object r3) {
            r0.dumpIntent(r1, r2, r3)
            return
    }

    public static final /* synthetic */ boolean access$isInteresting(com.example.dyhelper.hook.comment.bookmark.CommentRouterTraceHook r0, java.lang.String r1) {
            boolean r0 = r0.isInteresting(r1)
            return r0
    }

    private final java.lang.String dumpBundle(android.os.Bundle r4) {
            r3 = this;
            if (r4 != 0) goto L5
            java.lang.String r3 = "null"
            return r3
        L5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = "{"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L64
            java.util.Set r0 = r4.keySet()     // Catch: java.lang.Throwable -> L64
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L64
        L14:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L64
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L64
            java.lang.Object r2 = r4.get(r1)     // Catch: java.lang.Throwable -> L64
            r3.append(r1)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "="
            r3.append(r1)     // Catch: java.lang.Throwable -> L64
            boolean r1 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L64
            if (r1 != 0) goto L51
            boolean r1 = r2 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L64
            if (r1 != 0) goto L51
            boolean r1 = r2 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L64
            if (r1 == 0) goto L39
            goto L51
        L39:
            if (r2 == 0) goto L44
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L64
            goto L45
        L44:
            r1 = 0
        L45:
            r3.append(r1)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = ":"
            r3.append(r1)     // Catch: java.lang.Throwable -> L64
            r3.append(r2)     // Catch: java.lang.Throwable -> L64
            goto L54
        L51:
            r3.append(r2)     // Catch: java.lang.Throwable -> L64
        L54:
            java.lang.String r1 = ", "
            r3.append(r1)     // Catch: java.lang.Throwable -> L64
            goto L14
        L5a:
            java.lang.String r4 = "}"
            r3.append(r4)     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L64
            goto L6b
        L64:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L6b:
            boolean r4 = r3 instanceof p000.eo1
            if (r4 == 0) goto L71
            java.lang.String r3 = "bundle dump failed"
        L71:
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    private final void dumpIntent(java.lang.String r7, java.lang.Object r8, java.lang.Object r9) {
            r6 = this;
            boolean r0 = r9 instanceof android.content.Intent
            r1 = 0
            if (r0 == 0) goto L8
            android.content.Intent r9 = (android.content.Intent) r9
            goto L9
        L8:
            r9 = r1
        L9:
            if (r9 != 0) goto Lc
            goto L48
        Lc:
            java.lang.String r0 = r9.getDataString()
            android.content.ComponentName r2 = r9.getComponent()
            if (r2 == 0) goto L1b
            java.lang.String r2 = r2.flattenToString()
            goto L1c
        L1b:
            r2 = r1
        L1c:
            java.lang.String r3 = r9.getAction()
            android.os.Bundle r9 = r9.getExtras()
            java.lang.String r9 = r6.dumpBundle(r9)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r5 = " "
            r4.append(r5)
            r4.append(r2)
            r4.append(r5)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            boolean r6 = r6.isInteresting(r4)
            if (r6 != 0) goto L49
        L48:
            return
        L49:
            if (r8 == 0) goto L54
            java.lang.Class r6 = r8.getClass()
            java.lang.String r6 = r6.getName()
            goto L55
        L54:
            r6 = r1
        L55:
            java.lang.String r8 = " caller="
            java.lang.String r4 = ", action="
            java.lang.StringBuilder r6 = p000.AbstractC0602nx.m4138(r7, r8, r6, r4, r3)
            java.lang.String r7 = ", data="
            java.lang.String r8 = ", component="
            p000.AbstractC0602nx.m4119(r6, r7, r0, r8, r2)
            java.lang.String r7 = ", extras="
            java.lang.String r6 = p000.lz1.m3691(r6, r7, r9)
            java.lang.String r7 = "rfd109da2e72860ec"
            r8 = 4
            p000.C0888ux.m5988(r7, r6, r1, r8, r1)
            java.lang.Throwable r6 = new java.lang.Throwable
            r6.<init>()
            java.lang.String r6 = p000.ln0.m3649(r6)
            r9 = 5000(0x1388, float:7.006E-42)
            java.lang.String r6 = p000.q02.m4693(r6, r9)
            java.lang.String r9 = "stack="
            java.lang.String r6 = r9.concat(r6)
            p000.C0888ux.m5988(r7, r6, r1, r8, r1)
            return
    }

    private final void hookIntentSetData() {
            r3 = this;
            java.lang.Object r3 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L15
            java.lang.Class<android.content.Intent> r3 = android.content.Intent.class
            java.lang.String r0 = "setData"
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            com.example.dyhelper.hook.comment.bookmark.CommentRouterTraceHook$hookIntentSetData$1 r2 = new com.example.dyhelper.hook.comment.bookmark.CommentRouterTraceHook$hookIntentSetData$1     // Catch: java.lang.Throwable -> L15
            r2.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}     // Catch: java.lang.Throwable -> L15
            p000.qe0.m4873(r3, r0, r1)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r3 = move-exception
            java.lang.String r0 = "rfd109da2e72860ec"
            java.lang.String r1 = "hook Intent.setData failed"
            p000.C0888ux.m5977(r0, r1, r3)
            return
    }

    private final void hookStartActivity() {
            r3 = this;
            java.lang.Object r3 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L15
            java.lang.Class<android.app.Activity> r3 = android.app.Activity.class
            java.lang.String r0 = "startActivity"
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            com.example.dyhelper.hook.comment.bookmark.CommentRouterTraceHook$hookStartActivity$1 r2 = new com.example.dyhelper.hook.comment.bookmark.CommentRouterTraceHook$hookStartActivity$1     // Catch: java.lang.Throwable -> L15
            r2.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}     // Catch: java.lang.Throwable -> L15
            p000.qe0.m4873(r3, r0, r1)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r3 = move-exception
            java.lang.String r0 = "rfd109da2e72860ec"
            java.lang.String r1 = "hook startActivity failed"
            p000.C0888ux.m5977(r0, r1, r3)
            return
    }

    private final void hookStartActivityForResult() {
            r4 = this;
            java.lang.Object r4 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L17
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            java.lang.String r0 = "startActivityForResult"
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L17
            com.example.dyhelper.hook.comment.bookmark.CommentRouterTraceHook$hookStartActivityForResult$1 r3 = new com.example.dyhelper.hook.comment.bookmark.CommentRouterTraceHook$hookStartActivityForResult$1     // Catch: java.lang.Throwable -> L17
            r3.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}     // Catch: java.lang.Throwable -> L17
            p000.qe0.m4873(r4, r0, r1)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r4 = move-exception
            java.lang.String r0 = "rfd109da2e72860ec"
            java.lang.String r1 = "hook startActivityForResult failed"
            p000.C0888ux.m5977(r0, r1, r4)
            return
    }

    private final void hookUriParse() {
            r3 = this;
            java.lang.Object r3 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L15
            java.lang.Class<android.net.Uri> r3 = android.net.Uri.class
            java.lang.String r0 = "parse"
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            com.example.dyhelper.hook.comment.bookmark.CommentRouterTraceHook$hookUriParse$1 r2 = new com.example.dyhelper.hook.comment.bookmark.CommentRouterTraceHook$hookUriParse$1     // Catch: java.lang.Throwable -> L15
            r2.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}     // Catch: java.lang.Throwable -> L15
            p000.qe0.m4873(r3, r0, r1)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r3 = move-exception
            java.lang.String r0 = "rfd109da2e72860ec"
            java.lang.String r1 = "hook Uri.parse failed"
            p000.C0888ux.m5977(r0, r1, r3)
            return
    }

    private final boolean isInteresting(java.lang.String r3) {
            r2 = this;
            r2 = 0
            if (r3 == 0) goto L3e
            boolean r0 = p000.q02.m4671(r3)
            if (r0 == 0) goto La
            goto L3e
        La:
            java.lang.String r0 = "comment"
            r1 = 1
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto L3d
            java.lang.String r0 = "aweme/detail"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto L3d
            java.lang.String r0 = "itemId"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto L3d
            java.lang.String r0 = "comment_id"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto L3d
            java.lang.String r0 = "click_share_comment"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto L3d
            java.lang.String r0 = "10500"
            boolean r3 = p000.q02.m4654(r3, r0, r1)
            if (r3 == 0) goto L3c
            goto L3d
        L3c:
            return r2
        L3d:
            return r1
        L3e:
            return r2
    }

    public final void init(java.lang.ClassLoader r1) {
            r0 = this;
            r1.getClass()
            r0.hookStartActivity()
            r0.hookStartActivityForResult()
            return
    }
}
