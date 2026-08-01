package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: renamed from: com.example.dyhelper.hook.comment.bookmark.β */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0144 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2279;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog f2280;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.app.Activity f2281;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ android.widget.TextView f2282;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ android.widget.TextView f2283;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ android.widget.TextView f2284;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ android.widget.ListView f2285;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter f2286;

    /* JADX INFO: renamed from: ν */
    public final /* synthetic */ android.widget.TextView f2287;

    /* JADX INFO: renamed from: ξ */
    public final /* synthetic */ android.widget.TextView f2288;

    /* JADX INFO: renamed from: ο */
    public final /* synthetic */ android.widget.TextView f2289;

    /* JADX INFO: renamed from: π */
    public final /* synthetic */ android.widget.TextView f2290;

    /* JADX INFO: renamed from: ρ */
    public final /* synthetic */ android.widget.TextView f2291;

    /* JADX INFO: renamed from: σ */
    public final /* synthetic */ com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter f2292;

    /* JADX INFO: renamed from: τ */
    public final /* synthetic */ com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter f2293;

    public /* synthetic */ ViewOnClickListenerC0144(int r1, android.app.Activity r2, android.widget.ListView r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.TextView r6, android.widget.TextView r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r13, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r14, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r15) {
            r0 = this;
            r0.f2279 = r1
            r0.f2280 = r15
            r0.f2281 = r2
            r0.f2282 = r4
            r0.f2283 = r5
            r0.f2284 = r6
            r0.f2285 = r3
            r0.f2286 = r12
            r0.f2287 = r7
            r0.f2288 = r8
            r0.f2289 = r9
            r0.f2290 = r10
            r0.f2291 = r11
            r0.f2292 = r13
            r0.f2293 = r14
            r0.<init>()
            return
    }

    public /* synthetic */ ViewOnClickListenerC0144(android.app.Activity r2, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.TextView r6, android.widget.ListView r7, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, android.widget.TextView r12, android.widget.TextView r13, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r14, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r15) {
            r1 = this;
            r0 = 3
            r1.f2279 = r0
            r1.<init>()
            r1.f2281 = r2
            r1.f2280 = r3
            r1.f2282 = r4
            r1.f2283 = r5
            r1.f2284 = r6
            r1.f2285 = r7
            r1.f2286 = r8
            r1.f2287 = r9
            r1.f2288 = r10
            r1.f2289 = r11
            r1.f2290 = r12
            r1.f2291 = r13
            r1.f2292 = r14
            r1.f2293 = r15
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r32) {
            r31 = this;
            r0 = r31
            int r1 = r0.f2279
            switch(r1) {
                case 0: goto La5;
                case 1: goto L67;
                case 2: goto L29;
                default: goto L7;
            }
        L7:
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$ProfileBookmarkAdapter r14 = r0.f2292
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$VideoBookmarkAdapter r15 = r0.f2293
            android.app.Activity r2 = r0.f2281
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r3 = r0.f2280
            android.widget.TextView r4 = r0.f2282
            android.widget.TextView r5 = r0.f2283
            android.widget.TextView r6 = r0.f2284
            android.widget.ListView r7 = r0.f2285
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$CommentBookmarkAdapter r8 = r0.f2286
            android.widget.TextView r9 = r0.f2287
            android.widget.TextView r10 = r0.f2288
            android.widget.TextView r11 = r0.f2289
            android.widget.TextView r12 = r0.f2290
            android.widget.TextView r13 = r0.f2291
            r16 = r32
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.m1373(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L29:
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$ProfileBookmarkAdapter r1 = r0.f2292
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$VideoBookmarkAdapter r2 = r0.f2293
            android.app.Activity r3 = r0.f2281
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r4 = r0.f2280
            android.widget.TextView r5 = r0.f2282
            android.widget.TextView r6 = r0.f2283
            android.widget.TextView r7 = r0.f2284
            android.widget.ListView r8 = r0.f2285
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$CommentBookmarkAdapter r9 = r0.f2286
            android.widget.TextView r10 = r0.f2287
            android.widget.TextView r11 = r0.f2288
            android.widget.TextView r12 = r0.f2289
            android.widget.TextView r13 = r0.f2290
            android.widget.TextView r0 = r0.f2291
            r30 = r32
            r27 = r0
            r28 = r1
            r29 = r2
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r13
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.m1371(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return
        L67:
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$ProfileBookmarkAdapter r1 = r0.f2292
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$VideoBookmarkAdapter r2 = r0.f2293
            android.app.Activity r3 = r0.f2281
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r4 = r0.f2280
            android.widget.TextView r5 = r0.f2282
            android.widget.TextView r6 = r0.f2283
            android.widget.TextView r7 = r0.f2284
            android.widget.ListView r8 = r0.f2285
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$CommentBookmarkAdapter r9 = r0.f2286
            android.widget.TextView r10 = r0.f2287
            android.widget.TextView r11 = r0.f2288
            android.widget.TextView r12 = r0.f2289
            android.widget.TextView r13 = r0.f2290
            android.widget.TextView r0 = r0.f2291
            r30 = r32
            r27 = r0
            r28 = r1
            r29 = r2
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r13
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.m1359(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return
        La5:
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$ProfileBookmarkAdapter r1 = r0.f2292
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$VideoBookmarkAdapter r2 = r0.f2293
            android.app.Activity r3 = r0.f2281
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r4 = r0.f2280
            android.widget.TextView r5 = r0.f2282
            android.widget.TextView r6 = r0.f2283
            android.widget.TextView r7 = r0.f2284
            android.widget.ListView r8 = r0.f2285
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$CommentBookmarkAdapter r9 = r0.f2286
            android.widget.TextView r10 = r0.f2287
            android.widget.TextView r11 = r0.f2288
            android.widget.TextView r12 = r0.f2289
            android.widget.TextView r13 = r0.f2290
            android.widget.TextView r0 = r0.f2291
            r30 = r32
            r27 = r0
            r28 = r1
            r29 = r2
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r13
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.m1355(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return
    }
}
