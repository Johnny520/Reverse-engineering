.class public final LRp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LWk;
.implements Lio/github/cherrywechat/lua/loader/ScriptStateListener;


# instance fields
.field public a:Landroid/widget/LinearLayout;

.field public b:Landroid/widget/EditText;

.field public c:Landroid/widget/TextView;

.field public d:Landroid/widget/TextView;

.field public e:Landroid/widget/LinearLayout;

.field public f:Landroid/widget/TextView;

.field public g:Landroid/app/Activity;

.field public final h:Landroid/os/Handler;

.field public i:Landroid/widget/TextView;

.field public j:Landroid/widget/TextView;

.field public k:Landroid/widget/TextView;

.field public l:Landroid/widget/TextView;

.field public m:Landroid/widget/LinearLayout;

.field public n:Landroid/os/Handler;

.field public o:Z

.field public final p:LCb;

.field public final q:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 17

    move-object/from16 v0, p0

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, v0, LRp;->h:Landroid/os/Handler;

    sget-object v1, Lhe;->a:Lhd;

    sget-object v1, LZp;->a:Lnk;

    new-instance v2, LHz;

    invoke-direct {v2}, Lfm;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2}, LfG;->Z(Lac;Lac;)Lac;

    move-result-object v1

    invoke-static {v1}, LPj;->a(Lac;)LCb;

    move-result-object v1

    iput-object v1, v0, LRp;->p:LCb;

    new-instance v2, LOp;

    const-wide v3, -0x757dfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v3, -0x7509fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x750efffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v1, v3, v4}, LOp;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, LOp;

    const-wide v4, -0x75a1fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v4, -0x75aafffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0x75b7fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v1, v4, v5}, LOp;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, LOp;

    const-wide v5, -0x73ecfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v5, -0x73f1fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0x7386fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v1, v5, v6}, LOp;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, LOp;

    const-wide v6, -0x71eefffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v6, -0x71f5fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const-wide v7, -0x718afffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v1, v6, v7}, LOp;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v6, LOp;

    const-wide v7, -0x7f3ffffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v7, -0x7fc7fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    const-wide v8, -0x7fddfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v6, v1, v7, v8}, LOp;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v7, LOp;

    const-wide v8, -0x7d2efffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v8, -0x7d33fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    const-wide v9, -0x7dc6fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v7, v1, v8, v9}, LOp;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v8, LOp;

    const-wide v9, -0x7bedfffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v9, -0x7bf9fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    const-wide v10, -0x7b8efffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v8, v1, v9, v10}, LOp;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v9, LOp;

    const-wide v10, -0x78dafffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v10, -0x78e0fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    const-wide v11, -0x78f3fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v9, v1, v10, v11}, LOp;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v10, LOp;

    const-wide v11, -0x6243fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v11, -0x624afffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    const-wide v12, -0x625ffffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-direct {v10, v1, v11, v12}, LOp;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v11, LOp;

    const-wide v12, -0x6e2dfffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v12, -0x6e37fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    const-wide v13, -0x6ecbfffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    invoke-direct {v11, v1, v12, v13}, LOp;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v12, LOp;

    const-wide v13, -0x1935efffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v13, -0x19366fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    const-wide v14, -0x19371fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v12, v1, v13, v14}, LOp;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v13, LOp;

    const-wide v14, -0x19cf4fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v14, -0x19cfbfffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v14

    const-wide v15, -0x19c86fffff835L

    invoke-static/range {v15 .. v16}, LGu;->r(J)Ljava/lang/String;

    move-result-object v15

    invoke-direct {v13, v1, v14, v15}, LOp;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array/range {v2 .. v13}, [LOp;

    move-result-object v1

    invoke-static {v1}, Lsa;->b0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, LRp;->q:Ljava/util/List;

    return-void
.end method

.method public static e(Landroid/app/Activity;Ljava/lang/String;ILUi;)Landroid/widget/TextView;
    .locals 2

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 p0, 0x41500000    # 13.0f

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 p0, -0x1

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object p0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/16 p0, 0x11

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setGravity(I)V

    new-instance p0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {p0, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 p1, 0x8

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, LGu;->i(Ljava/lang/Number;)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p0, p2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 p0, 0xe

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0}, LGu;->i(Ljava/lang/Number;)I

    move-result p2

    invoke-static {p1}, LGu;->i(Ljava/lang/Number;)I

    move-result v1

    invoke-static {p0}, LGu;->i(Ljava/lang/Number;)I

    move-result p0

    invoke-static {p1}, LGu;->i(Ljava/lang/Number;)I

    move-result p1

    invoke-virtual {v0, p2, v1, p0, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    const/4 p0, 0x1

    invoke-virtual {v0, p0}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v0, p0}, Landroid/view/View;->setFocusable(Z)V

    new-instance p0, LKp;

    const/4 p1, 0x0

    invoke-direct {p0, p1, p3}, LKp;-><init>(ILUi;)V

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object v0
.end method

.method public static f(Landroid/app/Activity;)Landroid/view/View;
    .locals 3

    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v1

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LRp;->c:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LRp;->c:Landroid/widget/TextView;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-wide v1, -0x1889cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-object p1, v0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of v1, p1, Landroid/widget/ScrollView;

    if-eqz v1, :cond_1

    move-object v0, p1

    check-cast v0, Landroid/widget/ScrollView;

    :cond_1
    if-eqz v0, :cond_2

    new-instance p1, LN2;

    const/16 v1, 0x11

    invoke-direct {p1, v1, v0}, LN2;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_2
    return-void
.end method

.method public final b()V
    .locals 4

    const-wide v0, -0x1b748fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, p0, LRp;->p:LCb;

    iget-object v1, v0, LCb;->a:Lac;

    sget-object v2, Lgf;->f:Lgf;

    invoke-interface {v1, v2}, Lac;->m(LZb;)LYb;

    move-result-object v1

    check-cast v1, Ldm;

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ldm;->r(Ljava/util/concurrent/CancellationException;)V

    sget-object v1, Lio/github/cherrywechat/lua/loader/ScriptManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

    invoke-virtual {v1, p0}, Lio/github/cherrywechat/lua/loader/ScriptManager;->removeStateListener(Lio/github/cherrywechat/lua/loader/ScriptStateListener;)V

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v1, v0}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->setPrintListener(Lfj;)V

    iget-object v1, p0, LRp;->n:Landroid/os/Handler;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_0
    iput-object v0, p0, LRp;->n:Landroid/os/Handler;

    return-void

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Scope cannot be cancelled because it does not have a job: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final c(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 6

    const-wide v0, -0x1b751fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/16 p1, 0x3e9

    if-ne p2, p1, :cond_c

    const/4 p1, -0x1

    if-ne p3, p1, :cond_c

    if-eqz p4, :cond_c

    invoke-virtual {p4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_c

    const-wide p1, -0x18932fffff835L

    const/16 p3, 0xa

    :try_start_0
    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, LRp;->g:Landroid/app/Activity;

    const/4 p4, 0x0

    if-nez p2, :cond_0

    const-wide v2, -0x1893dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-object p2, p4

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_8

    :cond_0
    :goto_0
    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p2, :cond_2

    :try_start_1
    invoke-interface {p2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide v2, -0x189cdfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_1

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-wide v2, -0x189dbfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_1
    :goto_1
    :try_start_2
    invoke-interface {p2}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :goto_2
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    move-object p4, v0

    :try_start_4
    invoke-static {p2, p1}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p4

    :cond_2
    :goto_3
    const-wide v2, -0x189eafffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p1, v0, p2}, LBz;->J(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_4

    const-wide p1, -0x189effffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LRp;->a(Ljava/lang/String;)V

    iget-object p1, p0, LRp;->g:Landroid/app/Activity;

    if-nez p1, :cond_3

    const-wide p1, -0x18981fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    goto :goto_4

    :cond_3
    move-object p4, p1

    :goto_4
    const-wide p1, -0x18991fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {p4, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    :cond_4
    new-instance p2, Ljava/io/File;

    iget-object v2, p0, LRp;->g:Landroid/app/Activity;

    if-nez v2, :cond_5

    const-wide v2, -0x1899dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-object v2, p4

    :cond_5
    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    const-wide v3, -0x189adfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p2, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {p2}, Ljava/io/File;->mkdirs()Z

    :cond_6
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iget-object p1, p0, LRp;->g:Landroid/app/Activity;

    if-nez p1, :cond_7

    const-wide p1, -0x189b9fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-object p1, p4

    :cond_7
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    if-eqz p1, :cond_8

    :try_start_5
    new-instance p2, Ljava/io/FileOutputStream;

    invoke-direct {p2, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    invoke-static {p1, p2}, Lcr;->p(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :try_start_7
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    goto :goto_6

    :catchall_2
    move-exception v0

    move-object p2, v0

    goto :goto_5

    :catchall_3
    move-exception v0

    move-object p4, v0

    :try_start_9
    throw p4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :catchall_4
    move-exception v0

    :try_start_a
    invoke-static {p2, p4}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :goto_5
    :try_start_b
    throw p2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    :catchall_5
    move-exception v0

    move-object p4, v0

    :try_start_c
    invoke-static {p1, p2}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p4

    :cond_8
    :goto_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x18849fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LRp;->a(Ljava/lang/String;)V

    sget-object p1, Lio/github/cherrywechat/lua/loader/ScriptManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

    iget-object p2, p0, LRp;->g:Landroid/app/Activity;

    if-nez p2, :cond_9

    const-wide v3, -0x18856fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    goto :goto_7

    :cond_9
    move-object p4, p2

    :goto_7
    invoke-virtual {p1, p4, v2, v0}, Lio/github/cherrywechat/lua/loader/ScriptManager;->loadScript(Landroid/content/Context;Ljava/io/File;Z)Lio/github/cherrywechat/lua/loader/LoadedScript;

    move-result-object p1

    if-eqz p1, :cond_b

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v0, -0x18866fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v0, -0x18873fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getVersion()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, LRp;->a(Ljava/lang/String;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v0, -0x18876fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getAuthor()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, LRp;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getDescription()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    if-lez p2, :cond_a

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v0, -0x18803fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getDescription()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LRp;->a(Ljava/lang/String;)V

    :cond_a
    invoke-virtual {p0}, LRp;->g()V

    return-void

    :cond_b
    const-wide p1, -0x18810fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LRp;->a(Ljava/lang/String;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    return-void

    :goto_8
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v0, -0x1881dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LRp;->a(Ljava/lang/String;)V

    :cond_c
    return-void
.end method

.method public final d(Landroid/app/Activity;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-wide v4, -0x18f74fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    iput-object v1, v0, LRp;->g:Landroid/app/Activity;

    sget-object v4, Lio/github/cherrywechat/lua/loader/ScriptManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

    invoke-virtual {v4, v0}, Lio/github/cherrywechat/lua/loader/ScriptManager;->addStateListener(Lio/github/cherrywechat/lua/loader/ScriptStateListener;)V

    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, -0x1

    invoke-direct {v6, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v6, 0x55060040

    invoke-virtual {v1, v6}, Landroid/content/Context;->getColor(I)I

    move-result v6

    invoke-virtual {v4, v6}, Landroid/view/View;->setBackgroundColor(I)V

    iput-object v4, v0, LRp;->a:Landroid/widget/LinearLayout;

    new-instance v4, Landroid/widget/ScrollView;

    invoke-direct {v4, v1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v6, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v4, v5}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    new-instance v6, Landroid/widget/LinearLayout;

    invoke-direct {v6, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v6, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v9, -0x2

    invoke-direct {v8, v7, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v8, Landroid/widget/LinearLayout;

    invoke-direct {v8, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v10, 0x0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v8, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v12, v7, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v8, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v12, 0x10

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    const/16 v15, 0xc

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-virtual {v8, v14, v7, v9, v5}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {v8, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    const-wide v16, -0x18e5afffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const v7, 0x55060049

    invoke-virtual {v1, v7}, Landroid/content/Context;->getColor(I)I

    move-result v7

    new-instance v9, LHp;

    const/4 v14, 0x1

    invoke-direct {v9, v0, v14}, LHp;-><init>(LRp;I)V

    invoke-static {v1, v5, v7, v9}, LRp;->e(Landroid/app/Activity;Ljava/lang/String;ILUi;)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v8, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v5, 0x8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v1}, LRp;->f(Landroid/app/Activity;)Landroid/view/View;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-wide v16, -0x18e5ffffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    const v14, 0x5506004b

    invoke-virtual {v1, v14}, Landroid/content/Context;->getColor(I)I

    move-result v14

    new-instance v5, LHp;

    const/4 v12, 0x2

    invoke-direct {v5, v0, v12}, LHp;-><init>(LRp;I)V

    invoke-static {v1, v9, v14, v5}, LRp;->e(Landroid/app/Activity;Ljava/lang/String;ILUi;)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v8, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-static {v1}, LRp;->f(Landroid/app/Activity;)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v8, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-wide v18, -0x18e65fffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const v9, 0x55060047

    invoke-virtual {v1, v9}, Landroid/content/Context;->getColor(I)I

    move-result v9

    new-instance v12, Lf;

    const/4 v14, 0x6

    invoke-direct {v12, v14, v0, v1}, Lf;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v5, v9, v12}, LRp;->e(Landroid/app/Activity;Ljava/lang/String;ILUi;)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v8, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-static {v1}, LRp;->f(Landroid/app/Activity;)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v8, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-wide v18, -0x18e68fffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const v9, 0x55060050

    invoke-virtual {v1, v9}, Landroid/content/Context;->getColor(I)I

    move-result v12

    new-instance v14, LHp;

    const/4 v9, 0x0

    invoke-direct {v14, v0, v9}, LHp;-><init>(LRp;I)V

    invoke-static {v1, v5, v12, v14}, LRp;->e(Landroid/app/Activity;Ljava/lang/String;ILUi;)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v8, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Landroid/view/View;

    invoke-direct {v5, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-direct {v9, v10, v10, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v5, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v8, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object v9, v13

    const-wide v12, -0x18e6bfffff835L

    const/high16 v14, 0x41400000    # 12.0f

    invoke-static {v12, v13, v5, v14}, LEy;->l(JLandroid/widget/TextView;F)V

    const v12, 0x55060050

    invoke-virtual {v1, v12}, Landroid/content/Context;->getColor(I)I

    move-result v12

    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setTextColor(I)V

    iput-object v5, v0, LRp;->d:Landroid/widget/TextView;

    invoke-virtual {v8, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v5, 0xa

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-instance v8, Landroid/widget/LinearLayout;

    invoke-direct {v8, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v12, 0x1

    invoke-virtual {v8, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v13, -0x1

    const/4 v14, -0x2

    invoke-direct {v12, v13, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    move-object/from16 v20, v2

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    invoke-virtual {v12, v13, v14, v2, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v8, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v12, 0x55060043

    invoke-virtual {v1, v12}, Landroid/content/Context;->getColor(I)I

    move-result v13

    invoke-virtual {v2, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    int-to-float v13, v13

    invoke-virtual {v2, v13}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v8, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v12, -0x2

    const/4 v14, -0x1

    invoke-direct {v13, v14, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v12, 0x10

    invoke-virtual {v2, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    invoke-virtual {v2, v12, v13, v14, v10}, Landroid/view/View;->setPadding(IIII)V

    const/4 v12, 0x1

    invoke-virtual {v2, v12}, Landroid/view/View;->setClickable(Z)V

    new-instance v10, Landroid/widget/TextView;

    invoke-direct {v10, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v12, -0x18e05fffff835L

    const/high16 v14, 0x41400000    # 12.0f

    invoke-static {v12, v13, v10, v14}, LEy;->l(JLandroid/widget/TextView;F)V

    const v12, 0x550603f7

    invoke-virtual {v1, v12}, Landroid/content/Context;->getColor(I)I

    move-result v13

    invoke-virtual {v10, v13}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    const/4 v14, 0x0

    invoke-virtual {v10, v14, v14, v13, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v13, Landroid/widget/TextView;

    invoke-direct {v13, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v21, v15

    const-wide v14, -0x18e07fffff835L

    const/high16 v12, 0x41600000    # 14.0f

    invoke-static {v14, v15, v13, v12}, LEy;->l(JLandroid/widget/TextView;F)V

    const v14, 0x550603f9

    invoke-virtual {v1, v14}, Landroid/content/Context;->getColor(I)I

    move-result v15

    invoke-virtual {v13, v15}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v15, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v13, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    move-object/from16 v19, v3

    move-object/from16 v22, v5

    const/4 v3, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v14, -0x2

    invoke-direct {v12, v3, v14, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v13, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object v5, v15

    const-wide v14, -0x18e10fffff835L

    const/high16 v12, 0x41400000    # 12.0f

    invoke-static {v14, v15, v3, v12}, LEy;->l(JLandroid/widget/TextView;F)V

    const-wide v14, -0x18e14fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v3, v12}, Landroid/widget/TextView;->setTextColor(I)V

    iput-object v3, v0, LRp;->i:Landroid/widget/TextView;

    invoke-virtual {v2, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v2, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v3, v0, LRp;->i:Landroid/widget/TextView;

    if-nez v3, :cond_0

    const-wide v13, -0x18e1cfffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    const/4 v3, 0x0

    :cond_0
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Ll5;

    const/16 v13, 0xf

    invoke-direct {v3, v13, v0, v10}, Ll5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v8, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v10, -0x2

    const/4 v14, -0x1

    invoke-direct {v3, v14, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    invoke-static/range {v21 .. v21}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    const/4 v15, 0x0

    invoke-virtual {v2, v3, v15, v10, v13}, Landroid/view/View;->setPadding(IIII)V

    new-instance v3, Landroid/view/View;

    invoke-direct {v3, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v13, 0x1

    invoke-direct {v10, v14, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static/range {v21 .. v21}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-virtual {v10, v15, v15, v15, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v3, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const-wide v13, -0x18e30fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v3, v10}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v13, -0x2

    const/4 v14, -0x1

    invoke-direct {v10, v14, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v10, 0x10

    invoke-virtual {v3, v10}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v10, Landroid/widget/TextView;

    invoke-direct {v10, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v14, -0x18e38fffff835L

    const/high16 v12, 0x41500000    # 13.0f

    invoke-static {v14, v15, v10, v12}, LEy;->l(JLandroid/widget/TextView;F)V

    const v14, 0x550603f7

    invoke-virtual {v1, v14}, Landroid/content/Context;->getColor(I)I

    move-result v15

    invoke-virtual {v10, v15}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v14, v13, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    const/4 v15, 0x0

    invoke-virtual {v14, v15, v15, v13, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v10, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v3, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v10, Landroid/widget/TextView;

    invoke-direct {v10, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v13, -0x18e3cfffff835L

    invoke-static {v13, v14, v10, v12}, LEy;->l(JLandroid/widget/TextView;F)V

    const v13, 0x550603f9

    invoke-virtual {v1, v13}, Landroid/content/Context;->getColor(I)I

    move-result v14

    invoke-virtual {v10, v14}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v12, 0x3f800000    # 1.0f

    const/4 v14, -0x2

    invoke-direct {v13, v15, v14, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v10, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iput-object v10, v0, LRp;->j:Landroid/widget/TextView;

    invoke-virtual {v3, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v13, -0x1

    invoke-direct {v10, v13, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static/range {v19 .. v19}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-virtual {v10, v15, v13, v15, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v3, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v10, 0x10

    invoke-virtual {v3, v10}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v10, Landroid/widget/TextView;

    invoke-direct {v10, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v13, -0x18ed1fffff835L

    const/high16 v15, 0x41500000    # 13.0f

    invoke-static {v13, v14, v10, v15}, LEy;->l(JLandroid/widget/TextView;F)V

    const v14, 0x550603f7

    invoke-virtual {v1, v14}, Landroid/content/Context;->getColor(I)I

    move-result v13

    invoke-virtual {v10, v13}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v14, -0x2

    invoke-direct {v13, v14, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    const/4 v15, 0x0

    invoke-virtual {v13, v15, v15, v14, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v10, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v3, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v10, Landroid/widget/TextView;

    invoke-direct {v10, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v13, -0x18ed5fffff835L

    const/high16 v12, 0x41500000    # 13.0f

    invoke-static {v13, v14, v10, v12}, LEy;->l(JLandroid/widget/TextView;F)V

    const v13, 0x550603f9

    invoke-virtual {v1, v13}, Landroid/content/Context;->getColor(I)I

    move-result v12

    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v13, 0x3f800000    # 1.0f

    const/4 v14, -0x2

    invoke-direct {v12, v15, v14, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v10, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iput-object v10, v0, LRp;->k:Landroid/widget/TextView;

    invoke-virtual {v3, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v12, -0x1

    invoke-direct {v10, v12, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static/range {v21 .. v21}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-virtual {v10, v15, v12, v15, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v3, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v10, 0x11

    invoke-virtual {v3, v10}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v12, Landroid/widget/TextView;

    invoke-direct {v12, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v14, -0x18ef2fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v14, 0x41600000    # 14.0f

    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v14, -0x1

    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v12, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-virtual {v12, v10}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v14, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v14}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-wide v23, -0x18ef9fffff835L

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v15

    invoke-virtual {v14, v15}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    int-to-float v15, v15

    invoke-virtual {v14, v15}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v12, v14}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v13, -0x2

    const/4 v15, 0x0

    invoke-direct {v14, v15, v13, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    invoke-virtual {v14, v15, v15, v10, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v12, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    invoke-static/range {v22 .. v22}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-static/range {v22 .. v22}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-virtual {v12, v10, v14, v15, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    const/4 v13, 0x1

    invoke-virtual {v12, v13}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v12, v13}, Landroid/view/View;->setFocusable(Z)V

    new-instance v10, LJp;

    const/4 v13, 0x1

    invoke-direct {v10, v0, v13}, LJp;-><init>(LRp;I)V

    invoke-virtual {v12, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iput-object v12, v0, LRp;->l:Landroid/widget/TextView;

    invoke-virtual {v3, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v10, Landroid/widget/TextView;

    invoke-direct {v10, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v12, -0x18e94fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v14, 0x41600000    # 14.0f

    invoke-virtual {v10, v14}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v14, -0x1

    invoke-virtual {v10, v14}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v10, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/16 v12, 0x11

    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v12, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v12}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-wide v13, -0x18e9afffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    invoke-virtual {v12, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    int-to-float v13, v13

    invoke-virtual {v12, v13}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v10, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v14, -0x2

    invoke-direct {v12, v14, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v10, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static/range {v22 .. v22}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-static/range {v22 .. v22}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-virtual {v10, v12, v13, v14, v15}, Landroid/widget/TextView;->setPadding(IIII)V

    const/4 v12, 0x1

    invoke-virtual {v10, v12}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v10, v12}, Landroid/view/View;->setFocusable(Z)V

    new-instance v12, LJp;

    const/4 v13, 0x2

    invoke-direct {v12, v0, v13}, LJp;-><init>(LRp;I)V

    invoke-virtual {v10, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v3, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v12, -0x18ea2fffff835L

    const/high16 v10, 0x41300000    # 11.0f

    invoke-static {v12, v13, v3, v10}, LEy;->l(JLandroid/widget/TextView;F)V

    const v12, 0x5506004e

    invoke-virtual {v1, v12}, Landroid/content/Context;->getColor(I)I

    move-result v12

    invoke-virtual {v3, v12}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v13, -0x2

    const/4 v14, -0x1

    invoke-direct {v12, v14, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    const/4 v15, 0x0

    invoke-virtual {v12, v15, v13, v15, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v3, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object v2, v0, LRp;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v8, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v12, 0x1

    invoke-virtual {v2, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v13, -0x2

    const/4 v14, -0x1

    invoke-direct {v3, v14, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-virtual {v3, v8, v12, v13, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v8, 0x55060043

    invoke-virtual {v1, v8}, Landroid/content/Context;->getColor(I)I

    move-result v12

    invoke-virtual {v3, v12}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static/range {v21 .. v21}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    int-to-float v8, v8

    invoke-virtual {v3, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v15, 0x0

    invoke-virtual {v3, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v13, -0x2

    const/4 v14, -0x1

    invoke-direct {v8, v14, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v12, 0x10

    invoke-virtual {v3, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-static/range {v21 .. v21}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-virtual {v3, v8, v12, v13, v14}, Landroid/view/View;->setPadding(IIII)V

    new-instance v8, Landroid/widget/TextView;

    invoke-direct {v8, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v12, -0x18b6efffff835L

    const/high16 v14, 0x41600000    # 14.0f

    invoke-static {v12, v13, v8, v14}, LEy;->l(JLandroid/widget/TextView;F)V

    const v13, 0x550603f9

    invoke-virtual {v1, v13}, Landroid/content/Context;->getColor(I)I

    move-result v12

    invoke-virtual {v8, v12}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v13, 0x3f800000    # 1.0f

    const/4 v14, -0x2

    const/4 v15, 0x0

    invoke-direct {v12, v15, v14, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v8, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v3, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v8, Landroid/widget/TextView;

    invoke-direct {v8, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v14, -0x18b77fffff835L

    const/high16 v12, 0x41400000    # 12.0f

    invoke-static {v14, v15, v8, v12}, LEy;->l(JLandroid/widget/TextView;F)V

    const-wide v14, -0x18b7cfffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v8, v12}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static/range {v21 .. v21}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static/range {v20 .. v20}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-static/range {v21 .. v21}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-static/range {v20 .. v20}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-virtual {v8, v12, v14, v15, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    const/4 v12, 0x1

    invoke-virtual {v8, v12}, Landroid/view/View;->setClickable(Z)V

    new-instance v13, Ll5;

    const/16 v14, 0xe

    invoke-direct {v13, v14, v1, v0}, Ll5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v3, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v13, -0x2

    const/4 v14, -0x1

    invoke-direct {v8, v14, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static/range {v21 .. v21}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    const/4 v15, 0x0

    invoke-virtual {v3, v8, v15, v12, v13}, Landroid/view/View;->setPadding(IIII)V

    iput-object v3, v0, LRp;->e:Landroid/widget/LinearLayout;

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v12, -0x18b04fffff835L

    const/high16 v15, 0x41500000    # 13.0f

    invoke-static {v12, v13, v3, v15}, LEy;->l(JLandroid/widget/TextView;F)V

    const v14, 0x550603f7

    invoke-virtual {v1, v14}, Landroid/content/Context;->getColor(I)I

    move-result v8

    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v12, 0x11

    invoke-virtual {v3, v12}, Landroid/widget/TextView;->setGravity(I)V

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-virtual {v3, v8, v12, v13, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    iput-object v3, v0, LRp;->f:Landroid/widget/TextView;

    iget-object v3, v0, LRp;->e:Landroid/widget/LinearLayout;

    if-nez v3, :cond_1

    const-wide v12, -0x18b20fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    const/4 v3, 0x0

    :cond_1
    iget-object v8, v0, LRp;->f:Landroid/widget/TextView;

    if-nez v8, :cond_2

    const-wide v12, -0x18b37fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    const/4 v8, 0x0

    :cond_2
    invoke-virtual {v3, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v3, v0, LRp;->e:Landroid/widget/LinearLayout;

    if-nez v3, :cond_3

    const-wide v12, -0x18bc5fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    const/4 v3, 0x0

    :cond_3
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v12, 0x1

    invoke-virtual {v2, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v8, 0x118

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    const/4 v14, -0x1

    invoke-direct {v3, v14, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-static {v11}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-virtual {v3, v8, v12, v13, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v8, 0x55060043

    invoke-virtual {v1, v8}, Landroid/content/Context;->getColor(I)I

    move-result v8

    invoke-virtual {v3, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static/range {v21 .. v21}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    int-to-float v8, v8

    invoke-virtual {v3, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v12, -0x18a2dfffff835L

    const/high16 v14, 0x41600000    # 14.0f

    invoke-static {v12, v13, v3, v14}, LEy;->l(JLandroid/widget/TextView;F)V

    const v13, 0x550603f9

    invoke-virtual {v1, v13}, Landroid/content/Context;->getColor(I)I

    move-result v8

    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-static/range {v21 .. v21}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-virtual {v3, v8, v12, v13, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/EditText;

    invoke-direct {v3, v1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v14, -0x1

    invoke-direct {v8, v14, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v8, 0x800033

    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setGravity(I)V

    sget-object v8, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/high16 v12, 0x41400000    # 12.0f

    invoke-virtual {v3, v12}, Landroid/widget/TextView;->setTextSize(F)V

    const v13, 0x550603f9

    invoke-virtual {v1, v13}, Landroid/content/Context;->getColor(I)I

    move-result v12

    invoke-virtual {v3, v12}, Landroid/widget/TextView;->setTextColor(I)V

    const v14, 0x550603f7

    invoke-virtual {v1, v14}, Landroid/content/Context;->getColor(I)I

    move-result v12

    invoke-virtual {v3, v12}, Landroid/widget/TextView;->setHintTextColor(I)V

    const-wide v12, -0x18a34fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    const/4 v12, 0x0

    invoke-virtual {v3, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-virtual {v3, v13, v7, v14, v15}, Landroid/view/View;->setPadding(IIII)V

    const/4 v13, 0x1

    invoke-virtual {v3, v13}, Landroid/widget/TextView;->setHorizontallyScrolling(Z)V

    iget-object v7, v0, LRp;->q:Ljava/util/List;

    const/4 v15, 0x0

    invoke-interface {v7, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LOp;

    iget-object v7, v7, LOp;->c:Ljava/lang/String;

    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iput-object v3, v0, LRp;->b:Landroid/widget/EditText;

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v7, 0xc8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    const/4 v14, -0x1

    invoke-direct {v3, v14, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static {v11}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-virtual {v3, v7, v11, v13, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-wide v13, -0x18ae4fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v3, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static/range {v21 .. v21}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v3, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v15, 0x0

    invoke-virtual {v3, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v13, -0x2

    const/4 v14, -0x1

    invoke-direct {v7, v14, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v7, 0x10

    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static/range {v22 .. v22}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static/range {v19 .. v19}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-virtual {v3, v7, v11, v13, v14}, Landroid/view/View;->setPadding(IIII)V

    new-instance v7, Landroid/widget/TextView;

    invoke-direct {v7, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v13, -0x18aecfffff835L

    const/high16 v15, 0x41500000    # 13.0f

    invoke-static {v13, v14, v7, v15}, LEy;->l(JLandroid/widget/TextView;F)V

    const-wide v13, -0x18aeffffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v7, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v13, 0x3f800000    # 1.0f

    const/4 v14, -0x2

    const/4 v15, 0x0

    invoke-direct {v5, v15, v14, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v7, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v13, -0x18af7fffff835L

    const/high16 v7, 0x41400000    # 12.0f

    invoke-static {v13, v14, v5, v7}, LEy;->l(JLandroid/widget/TextView;F)V

    const-wide v13, -0x18afafffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static/range {v21 .. v21}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static/range {v20 .. v20}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    invoke-static/range {v21 .. v21}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static/range {v20 .. v20}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-virtual {v5, v7, v11, v13, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    const/4 v13, 0x1

    invoke-virtual {v5, v13}, Landroid/view/View;->setClickable(Z)V

    new-instance v7, LJp;

    const/4 v11, 0x0

    invoke-direct {v7, v0, v11}, LJp;-><init>(LRp;I)V

    invoke-virtual {v5, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/ScrollView;

    invoke-direct {v3, v1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v14, -0x1

    invoke-direct {v5, v14, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v13, 0x1

    invoke-virtual {v3, v13}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v13, -0x2

    invoke-direct {v7, v14, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v5, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-virtual {v5, v10}, Landroid/widget/TextView;->setTextSize(F)V

    const-wide v7, -0x18a82fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static/range {v20 .. v20}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-virtual {v5, v7, v8, v10, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    const/4 v13, 0x1

    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    iput-object v5, v0, LRp;->c:Landroid/widget/TextView;

    invoke-virtual {v3, v5}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v4, v6}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    iget-object v2, v0, LRp;->a:Landroid/widget/LinearLayout;

    if-nez v2, :cond_4

    const-wide v2, -0x18f7dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    goto :goto_0

    :cond_4
    move-object v12, v2

    :goto_0
    invoke-virtual {v12, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Ln3;

    const/16 v3, 0xb

    invoke-direct {v2, v3, v0, v1}, Ln3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, v0, LRp;->h:Landroid/os/Handler;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final g()V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, LRp;->e:Landroid/widget/LinearLayout;

    if-nez v1, :cond_0

    const-wide v3, -0x18a4afffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    sget-object v1, Lio/github/cherrywechat/lua/loader/ScriptManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

    invoke-virtual {v1}, Lio/github/cherrywechat/lua/loader/ScriptManager;->getLoadedScripts()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v1, v0, LRp;->e:Landroid/widget/LinearLayout;

    if-nez v1, :cond_1

    const-wide v3, -0x18a61fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const/4 v1, 0x0

    :cond_1
    iget-object v3, v0, LRp;->f:Landroid/widget/TextView;

    if-nez v3, :cond_2

    const-wide v3, -0x18a78fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const/4 v2, 0x0

    goto :goto_0

    :cond_2
    move-object v2, v3

    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    :cond_3
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/github/cherrywechat/lua/loader/LoadedScript;

    iget-object v4, v0, LRp;->e:Landroid/widget/LinearLayout;

    if-nez v4, :cond_4

    const-wide v4, -0x18a06fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const/4 v4, 0x0

    :cond_4
    iget-object v5, v0, LRp;->g:Landroid/app/Activity;

    if-nez v5, :cond_5

    const-wide v5, -0x18a1dfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    const/4 v5, 0x0

    :cond_5
    new-instance v6, Landroid/widget/LinearLayout;

    invoke-direct {v6, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v9, -0x1

    const/4 v10, -0x2

    invoke-direct {v8, v9, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v11, 0x8

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v11}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-virtual {v8, v7, v12, v7, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v6, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-wide v12, -0x18bdcfffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v8, v12}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v11}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    int-to-float v12, v12

    invoke-virtual {v8, v12}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v6, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 v8, 0xc

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    const/16 v13, 0xa

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    invoke-virtual {v6, v12, v14, v15, v2}, Landroid/view/View;->setPadding(IIII)V

    const/16 v2, 0x10

    invoke-virtual {v6, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-virtual {v3}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getState()Lio/github/cherrywechat/lua/loader/ScriptState;

    move-result-object v2

    sget-object v12, LPp;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v12, v2

    const/4 v14, 0x5

    const/4 v15, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x4

    const/4 v7, 0x1

    if-eq v2, v7, :cond_a

    if-eq v2, v9, :cond_9

    if-eq v2, v15, :cond_8

    if-eq v2, v10, :cond_7

    if-ne v2, v14, :cond_6

    const-wide v16, -0x18b84fffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_6
    new-instance v1, LFa;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :cond_7
    const-wide v16, -0x18bfcfffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_8
    const-wide v16, -0x18bf4fffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_9
    const-wide v16, -0x18becfffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_a
    const-wide v16, -0x18be4fffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    :goto_2
    new-instance v14, Landroid/view/View;

    invoke-direct {v14, v5}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v11}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-static {v11}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-direct {v10, v15, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    const/4 v13, 0x0

    invoke-virtual {v10, v13, v13, v9, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v14, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v9, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v9}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v9, v7}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v9, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v14, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v6, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v13, 0x0

    const/4 v14, -0x2

    invoke-direct {v9, v13, v14, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v2, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v9, Landroid/widget/TextView;

    invoke-direct {v9, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v13, -0x18b8cfffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getVersion()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v10, 0x41500000    # 13.0f

    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v10, -0x1

    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v10, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-virtual {v2, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v9, Landroid/widget/TextView;

    invoke-direct {v9, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v13, -0x18b8ffffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getAuthor()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v13, -0x18b94fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getState()Lio/github/cherrywechat/lua/loader/ScriptState;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    aget v12, v12, v13

    if-eq v12, v7, :cond_f

    const/4 v13, 0x2

    if-eq v12, v13, :cond_e

    const/4 v13, 0x3

    if-eq v12, v13, :cond_d

    const/4 v13, 0x4

    if-eq v12, v13, :cond_c

    const/4 v13, 0x5

    if-ne v12, v13, :cond_b

    const-wide v12, -0x18a46fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    goto :goto_3

    :cond_b
    new-instance v1, LFa;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :cond_c
    const-wide v12, -0x18a43fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    goto :goto_3

    :cond_d
    const-wide v12, -0x18bbffffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    goto :goto_3

    :cond_e
    const-wide v12, -0x18bb8fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    goto :goto_3

    :cond_f
    const-wide v12, -0x18bb4fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    :goto_3
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v10, 0x41300000    # 11.0f

    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setTextSize(F)V

    const-wide v12, -0x18b98fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v2, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v3}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getState()Lio/github/cherrywechat/lua/loader/ScriptState;

    move-result-object v2

    sget-object v9, Lio/github/cherrywechat/lua/loader/ScriptState;->LOADED:Lio/github/cherrywechat/lua/loader/ScriptState;

    const/high16 v10, 0x41800000    # 16.0f

    if-eq v2, v9, :cond_10

    invoke-virtual {v3}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getState()Lio/github/cherrywechat/lua/loader/ScriptState;

    move-result-object v2

    sget-object v9, Lio/github/cherrywechat/lua/loader/ScriptState;->COMPLETED:Lio/github/cherrywechat/lua/loader/ScriptState;

    if-ne v2, v9, :cond_11

    :cond_10
    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v12, -0x18ba0fffff835L

    invoke-static {v12, v13, v2, v10}, LEy;->l(JLandroid/widget/TextView;F)V

    const-wide v12, -0x18ba2fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static {v11}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static {v11}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-virtual {v2, v9, v12, v13, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v2, v7}, Landroid/view/View;->setClickable(Z)V

    new-instance v9, LNp;

    invoke-direct {v9, v0, v3}, LNp;-><init>(LRp;Lio/github/cherrywechat/lua/loader/LoadedScript;)V

    invoke-virtual {v2, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_11
    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v12, -0x18baafffff835L

    invoke-static {v12, v13, v2, v10}, LEy;->l(JLandroid/widget/TextView;F)V

    const-wide v9, -0x18bacfffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-static {v11}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    const/16 v17, 0x4

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static {v11}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    invoke-virtual {v2, v5, v8, v9, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v2, v7}, Landroid/view/View;->setClickable(Z)V

    new-instance v5, LNp;

    invoke-direct {v5, v3, v0}, LNp;-><init>(Lio/github/cherrywechat/lua/loader/LoadedScript;LRp;)V

    invoke-virtual {v2, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto/16 :goto_1

    :cond_12
    return-void
.end method

.method public final getContentView()Landroid/view/View;
    .locals 2

    iget-object v0, p0, LRp;->a:Landroid/widget/LinearLayout;

    if-nez v0, :cond_0

    const-wide v0, -0x1b75afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 2

    const-wide v0, -0x1b762fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h(Z)V
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_8

    iget-object p1, p0, LRp;->i:Landroid/widget/TextView;

    if-nez p1, :cond_0

    const-wide v1, -0x18d1bfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-object p1, v0

    :cond_0
    const-wide v1, -0x18d2ffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LRp;->i:Landroid/widget/TextView;

    if-nez p1, :cond_1

    const-wide v1, -0x18d33fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-object p1, v0

    :cond_1
    const-wide v1, -0x18dc7fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, p0, LRp;->j:Landroid/widget/TextView;

    if-nez p1, :cond_2

    const-wide v1, -0x18dcffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-object p1, v0

    :cond_2
    sget-object v1, Lio/github/cherrywechat/lua/dev/CherryDevServer;->INSTANCE:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    invoke-virtual {v1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->getServerUrl()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    const-wide v2, -0x18de0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LRp;->k:Landroid/widget/TextView;

    if-nez p1, :cond_4

    const-wide v2, -0x18de7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-object p1, v0

    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->getConnectionCount()I

    move-result v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-wide v3, -0x18df9fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LRp;->l:Landroid/widget/TextView;

    if-nez p1, :cond_5

    const-wide v1, -0x18d83fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-object p1, v0

    :cond_5
    const-wide v1, -0x18d96fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LRp;->l:Landroid/widget/TextView;

    if-nez p1, :cond_6

    const-wide v1, -0x18d9dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-object p1, v0

    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    instance-of v1, p1, Landroid/graphics/drawable/GradientDrawable;

    if-eqz v1, :cond_7

    move-object v0, p1

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    :cond_7
    if-eqz v0, :cond_10

    const-wide v1, -0x18db0fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    return-void

    :cond_8
    iget-object p1, p0, LRp;->i:Landroid/widget/TextView;

    if-nez p1, :cond_9

    const-wide v1, -0x18db8fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-object p1, v0

    :cond_9
    const-wide v1, -0x18c4cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LRp;->i:Landroid/widget/TextView;

    if-nez p1, :cond_a

    const-wide v1, -0x18c50fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-object p1, v0

    :cond_a
    const-wide v1, -0x18c64fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, p0, LRp;->j:Landroid/widget/TextView;

    if-nez p1, :cond_b

    const-wide v1, -0x18c6cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-object p1, v0

    :cond_b
    const-wide v1, -0x18c7dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LRp;->k:Landroid/widget/TextView;

    if-nez p1, :cond_c

    const-wide v1, -0x18c01fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-object p1, v0

    :cond_c
    const-wide v1, -0x18c13fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LRp;->l:Landroid/widget/TextView;

    if-nez p1, :cond_d

    const-wide v1, -0x18c1efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-object p1, v0

    :cond_d
    const-wide v1, -0x18c31fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LRp;->l:Landroid/widget/TextView;

    if-nez p1, :cond_e

    const-wide v1, -0x18c38fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-object p1, v0

    :cond_e
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    instance-of v1, p1, Landroid/graphics/drawable/GradientDrawable;

    if-eqz v1, :cond_f

    move-object v0, p1

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    :cond_f
    if-eqz v0, :cond_10

    const-wide v1, -0x18ccbfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    :cond_10
    return-void
.end method

.method public final onScriptStateChanged(Lio/github/cherrywechat/lua/loader/LoadedScript;)V
    .locals 2

    const-wide v0, -0x1b741fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance p1, LN2;

    const/16 v0, 0x12

    invoke-direct {p1, v0, p0}, LN2;-><init>(ILjava/lang/Object;)V

    iget-object v0, p0, LRp;->h:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
