.class public final synthetic LA0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x7

    iput v0, p0, LA0/d;->a:I

    sget-object v0, Lc0/J1;->a:Lc0/J1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LA0/d;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, LA0/d;->a:I

    iput-object p2, p0, LA0/d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget v3, p0, LA0/d;->a:I

    packed-switch v3, :pswitch_data_0

    iget-object v1, p0, LA0/d;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/fragment/app/a;

    iput-boolean v2, v1, Landroidx/fragment/app/a;->c:Z

    iget-object v2, v1, Landroidx/fragment/app/a;->e:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget-object v3, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:LL/e;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, LL/e;->f()Z

    move-result v3

    if-eqz v3, :cond_0

    iget v0, v1, Landroidx/fragment/app/a;->b:I

    invoke-virtual {v1, v0}, Landroidx/fragment/app/a;->c(I)V

    goto :goto_0

    :cond_0
    iget v3, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    if-ne v3, v0, :cond_1

    iget v0, v1, Landroidx/fragment/app/a;->b:I

    invoke-virtual {v2, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r(I)V

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, LA0/d;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->S()V

    return-void

    :pswitch_1
    const-string v0, "$scroll"

    iget-object v1, p0, LA0/d;->b:Ljava/lang/Object;

    check-cast v1, Landroid/widget/ScrollView;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v2}, Landroid/widget/ScrollView;->scrollTo(II)V

    return-void

    :pswitch_2
    iget-object v0, p0, LA0/d;->b:Ljava/lang/Object;

    check-cast v0, Lf0/e;

    const-string v1, "$progress"

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/i;->a:Lf0/i;

    :try_start_0
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    const-string v0, "progress shown async"

    invoke-static {v0}, Lf0/i;->g(Ljava/lang/String;)V

    sget-object v0, LD0/l;->a:LD0/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "progress show fail: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/i;->g(Ljava/lang/String;)V

    :cond_2
    return-void

    :pswitch_3
    iget-object v0, p0, LA0/d;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/timepicker/e;

    invoke-virtual {v0}, Lcom/google/android/material/timepicker/e;->f()V

    return-void

    :pswitch_4
    const-string v0, "$this_runCatching"

    iget-object v1, p0, LA0/d;->b:Ljava/lang/Object;

    check-cast v1, Lc0/J1;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {}, Lc0/G1;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/J1;->c(Ljava/lang/String;)V

    return-void

    :pswitch_5
    iget-object v0, p0, LA0/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/ClassLoader;

    const-string v3, "$classLoader"

    invoke-static {v0, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lc0/D0;->a:Lc0/D0;

    invoke-static {v0}, Lc0/D0;->p(Ljava/lang/ClassLoader;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v0, "prefetch: username empty"

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    sput-object v3, Lc0/D0;->n:Ljava/lang/String;

    invoke-static {v0, v3}, Lc0/D0;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    sput-object v0, Lc0/D0;->r:Landroid/graphics/Bitmap;

    sput-boolean v1, Lc0/D0;->s:Z

    :cond_5
    :goto_2
    if-eqz v0, :cond_6

    move v2, v1

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "prefetch: user="

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " bmp="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V

    sget-object v0, Lc0/D0;->h:Landroid/widget/ImageView;

    if-eqz v0, :cond_7

    sget-object v2, Lc0/D0;->c:Landroid/os/Handler;

    new-instance v3, Lc0/w0;

    invoke-direct {v3, v0, v1}, Lc0/w0;-><init>(Landroid/widget/ImageView;I)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_7
    :goto_3
    return-void

    :pswitch_6
    iget-object v0, p0, LA0/d;->b:Ljava/lang/Object;

    check-cast v0, Ld0/s;

    const-string v1, "$bar"

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Ld0/s;->f()V

    :cond_8
    return-void

    :pswitch_7
    iget-object v0, p0, LA0/d;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/A;

    const-string v2, "this$0"

    invoke-static {v0, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, v0, Landroidx/lifecycle/A;->b:I

    iget-object v3, v0, Landroidx/lifecycle/A;->f:Landroidx/lifecycle/t;

    if-nez v2, :cond_9

    iput-boolean v1, v0, Landroidx/lifecycle/A;->c:Z

    sget-object v2, Landroidx/lifecycle/l;->ON_PAUSE:Landroidx/lifecycle/l;

    invoke-virtual {v3, v2}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    :cond_9
    iget v2, v0, Landroidx/lifecycle/A;->a:I

    if-nez v2, :cond_a

    iget-boolean v2, v0, Landroidx/lifecycle/A;->c:Z

    if-eqz v2, :cond_a

    sget-object v2, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    invoke-virtual {v3, v2}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    iput-boolean v1, v0, Landroidx/lifecycle/A;->d:Z

    :cond_a
    return-void

    :pswitch_8
    iget-object v1, p0, LA0/d;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/emoji2/text/q;

    const-string v3, "fetchFonts result is not OK. ("

    iget-object v4, v1, Landroidx/emoji2/text/q;->d:Ljava/lang/Object;

    monitor-enter v4

    :try_start_1
    iget-object v5, v1, Landroidx/emoji2/text/q;->h:LU/S;

    if-nez v5, :cond_b

    monitor-exit v4

    goto/16 :goto_9

    :catchall_1
    move-exception v0

    goto/16 :goto_b

    :cond_b
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Landroidx/emoji2/text/q;->c()LA/l;

    move-result-object v4

    iget v5, v4, LA/l;->e:I

    if-ne v5, v0, :cond_c

    iget-object v0, v1, Landroidx/emoji2/text/q;->d:Ljava/lang/Object;

    monitor-enter v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    monitor-exit v0

    goto :goto_4

    :catchall_2
    move-exception v2

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :catchall_3
    move-exception v0

    goto/16 :goto_7

    :cond_c
    :goto_4
    if-nez v5, :cond_f

    :try_start_5
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    sget v3, Lz/a;->a:I

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    iget-object v0, v1, Landroidx/emoji2/text/q;->c:Lx0/e;

    iget-object v3, v1, Landroidx/emoji2/text/q;->a:Landroid/content/Context;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    filled-new-array {v4}, [LA/l;

    move-result-object v0

    sget-object v5, Lv/g;->a:Lf0/P;

    invoke-virtual {v5, v3, v0, v2}, Lf0/P;->k(Landroid/content/Context;[LA/l;I)Landroid/graphics/Typeface;

    move-result-object v0

    iget-object v2, v1, Landroidx/emoji2/text/q;->a:Landroid/content/Context;

    iget-object v3, v4, LA/l;->a:Landroid/net/Uri;

    invoke-static {v2, v3}, Lf0/P;->K(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    if-eqz v2, :cond_e

    if-eqz v0, :cond_e

    :try_start_6
    const-string v3, "EmojiCompat.MetadataRepo.create"

    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    new-instance v3, LY/v;

    invoke-static {v2}, LU/S;->b0(Ljava/nio/MappedByteBuffer;)LM/b;

    move-result-object v2

    invoke-direct {v3, v0, v2}, LY/v;-><init>(Landroid/graphics/Typeface;LM/b;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    :try_start_7
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    :try_start_8
    invoke-static {}, Landroid/os/Trace;->endSection()V

    iget-object v0, v1, Landroidx/emoji2/text/q;->d:Ljava/lang/Object;

    monitor-enter v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :try_start_9
    iget-object v2, v1, Landroidx/emoji2/text/q;->h:LU/S;

    if-eqz v2, :cond_d

    invoke-virtual {v2, v3}, LU/S;->V(LY/v;)V

    goto :goto_5

    :catchall_4
    move-exception v2

    goto :goto_6

    :cond_d
    :goto_5
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :try_start_a
    invoke-virtual {v1}, Landroidx/emoji2/text/q;->a()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_9

    :goto_6
    :try_start_b
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :try_start_c
    throw v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :catchall_5
    move-exception v0

    :try_start_d
    sget v2, Lz/a;->a:I

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_e
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "Unable to open file."

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    :catchall_6
    move-exception v0

    :try_start_e
    sget v2, Lz/a;->a:I

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_f
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    :goto_7
    iget-object v2, v1, Landroidx/emoji2/text/q;->d:Ljava/lang/Object;

    monitor-enter v2

    :try_start_f
    iget-object v3, v1, Landroidx/emoji2/text/q;->h:LU/S;

    if-eqz v3, :cond_10

    invoke-virtual {v3, v0}, LU/S;->U(Ljava/lang/Throwable;)V

    goto :goto_8

    :catchall_7
    move-exception v0

    goto :goto_a

    :cond_10
    :goto_8
    monitor-exit v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    invoke-virtual {v1}, Landroidx/emoji2/text/q;->a()V

    :goto_9
    return-void

    :goto_a
    :try_start_10
    monitor-exit v2
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    throw v0

    :goto_b
    :try_start_11
    monitor-exit v4
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    throw v0

    :pswitch_9
    iget-object v0, p0, LA0/d;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    return-void

    :pswitch_a
    iget-object v0, p0, LA0/d;->b:Ljava/lang/Object;

    check-cast v0, LA0/o;

    iget-object v1, v0, LA0/o;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    move-result v1

    invoke-virtual {v0, v1}, LA0/o;->t(Z)V

    iput-boolean v1, v0, LA0/o;->m:Z

    return-void

    :pswitch_b
    iget-object v0, p0, LA0/d;->b:Ljava/lang/Object;

    check-cast v0, LA0/f;

    invoke-virtual {v0, v1}, LA0/f;->t(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
