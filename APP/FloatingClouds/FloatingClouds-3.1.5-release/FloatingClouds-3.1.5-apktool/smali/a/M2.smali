.class public final synthetic La/M2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, La/M2;->a:I

    iput-object p2, p0, La/M2;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    iget v4, p0, La/M2;->a:I

    packed-switch v4, :pswitch_data_0

    iget-object v0, p0, La/M2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/ClassLoader;

    const-string v1, "WXMaskPlugin: NativeHideService early init done (methodsReady="

    :try_start_0
    sget-object v4, La/Gb;->a:La/Gb;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/Gb;->b(Ljava/lang/ClassLoader;)V

    sget-object v0, La/Gb;->d:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    sget-object v0, La/Gb;->c:Ljava/lang/Object;

    if-eqz v0, :cond_0

    move v2, v3

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void

    :pswitch_0
    iget-object v0, p0, La/M2;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    return-void

    :pswitch_1
    iget-object v0, p0, La/M2;->b:Ljava/lang/Object;

    check-cast v0, La/Ue;

    iget-boolean v1, v0, La/Ue;->h:Z

    if-eqz v1, :cond_6

    iput-boolean v2, v0, La/Ue;->h:Z

    iput-boolean v3, v0, La/Ue;->i:Z

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    iget v0, v0, La/jc;->y:I

    const-string v1, "TempUnhideTrigger: long-press triggered (threshold="

    const-string v4, "ms)"

    invoke-static {v0, v1, v4}, La/z;->c(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    invoke-static {}, La/K3$a;->l()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    iget-boolean v0, v0, La/jc;->x:Z

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    sget-object v0, La/x8;->a:La/x8;

    sget-object v1, La/ca$c;->b:La/ca$c;

    sget-object v4, La/ca$b;->b:La/ca$b;

    sget-object v5, La/ca$b;->a:La/ca$b;

    invoke-static {v5}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    const-string v6, "singleton(...)"

    invoke-static {v5, v6}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v4, v1, v5}, La/x8;->c(La/ca$b;La/ca$c;Ljava/util/Set;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, La/x8;->b:La/ca$b;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "TempUnhideTrigger: long-press unhide BLOCKED (state="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    const-string v0, "TempUnhideTrigger: long-press unhide triggered"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v0, La/w1;->p:Landroid/content/Context;

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v1

    iget-boolean v3, v1, La/jc;->R:Z

    if-eqz v3, :cond_5

    iget-object v1, v1, La/jc;->S:Ljava/lang/String;

    invoke-static {v1}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_4

    const-string v1, "\u523b\u821f\u6c42\u5251"

    :cond_4
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_5
    :goto_0
    invoke-static {}, La/s4$a;->a()V

    :cond_6
    :goto_1
    return-void

    :pswitch_2
    iget-object v1, p0, La/M2;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/material/sidesheet/SideSheetBehavior$c;

    iput-boolean v2, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior$c;->b:Z

    iget-object v2, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior$c;->d:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget-object v3, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:La/zg;

    if-eqz v3, :cond_7

    invoke-virtual {v3}, La/zg;->f()Z

    move-result v3

    if-eqz v3, :cond_7

    iget v0, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior$c;->a:I

    invoke-virtual {v1, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior$c;->a(I)V

    goto :goto_2

    :cond_7
    iget v3, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    if-ne v3, v0, :cond_8

    iget v0, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior$c;->a:I

    invoke-virtual {v2, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->s(I)V

    :cond_8
    :goto_2
    return-void

    :pswitch_3
    iget-object v0, p0, La/M2;->b:Ljava/lang/Object;

    check-cast v0, La/Mc;

    invoke-virtual {v0}, La/Mc;->f()V

    return-void

    :pswitch_4
    iget-object v0, p0, La/M2;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/j;

    const-string v1, "this$0"

    invoke-static {v0, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v1, v0, Landroidx/lifecycle/j;->b:I

    iget-object v2, v0, Landroidx/lifecycle/j;->f:Landroidx/lifecycle/h;

    if-nez v1, :cond_9

    iput-boolean v3, v0, Landroidx/lifecycle/j;->c:Z

    sget-object v1, Landroidx/lifecycle/e$a;->ON_PAUSE:Landroidx/lifecycle/e$a;

    invoke-virtual {v2, v1}, Landroidx/lifecycle/h;->f(Landroidx/lifecycle/e$a;)V

    :cond_9
    iget v1, v0, Landroidx/lifecycle/j;->a:I

    if-nez v1, :cond_a

    iget-boolean v1, v0, Landroidx/lifecycle/j;->c:Z

    if-eqz v1, :cond_a

    sget-object v1, Landroidx/lifecycle/e$a;->ON_STOP:Landroidx/lifecycle/e$a;

    invoke-virtual {v2, v1}, Landroidx/lifecycle/h;->f(Landroidx/lifecycle/e$a;)V

    iput-boolean v3, v0, Landroidx/lifecycle/j;->d:Z

    :cond_a
    return-void

    :pswitch_5
    const-string v0, "\u4fdd\u5b58"

    iget-object v1, p0, La/M2;->b:Ljava/lang/Object;

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_6
    iget-object v0, p0, La/M2;->b:Ljava/lang/Object;

    check-cast v0, La/h8;

    :try_start_1
    invoke-virtual {v0}, La/h8;->j()V

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_3
    return-void

    :pswitch_7
    iget-object v0, p0, La/M2;->b:Ljava/lang/Object;

    check-cast v0, La/e7;

    iget-object v0, v0, La/e7;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/e7$h;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_4

    :cond_b
    return-void

    :pswitch_8
    iget-object v0, p0, La/M2;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/b;

    iget-object v2, v0, Landroidx/fragment/app/b;->P:La/q7;

    iget-object v3, v0, Landroidx/fragment/app/b;->d:Landroid/os/Bundle;

    iget-object v2, v2, La/q7;->e:La/Kd;

    invoke-virtual {v2, v3}, La/Kd;->b(Landroid/os/Bundle;)V

    iput-object v1, v0, Landroidx/fragment/app/b;->d:Landroid/os/Bundle;

    return-void

    :pswitch_9
    iget-object v1, p0, La/M2;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/emoji2/text/e$b;

    const-string v3, "fetchFonts result is not OK. ("

    iget-object v4, v1, Landroidx/emoji2/text/e$b;->d:Ljava/lang/Object;

    monitor-enter v4

    :try_start_2
    iget-object v5, v1, Landroidx/emoji2/text/e$b;->h:Landroidx/emoji2/text/c$h;

    if-nez v5, :cond_c

    monitor-exit v4

    goto/16 :goto_a

    :catchall_2
    move-exception v0

    goto/16 :goto_c

    :cond_c
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v1}, Landroidx/emoji2/text/e$b;->c()La/T6;

    move-result-object v4

    iget v5, v4, La/T6;->e:I

    if-ne v5, v0, :cond_d

    iget-object v0, v1, Landroidx/emoji2/text/e$b;->d:Ljava/lang/Object;

    monitor-enter v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    :try_start_4
    monitor-exit v0

    goto :goto_5

    :catchall_3
    move-exception v2

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :catchall_4
    move-exception v0

    goto/16 :goto_8

    :cond_d
    :goto_5
    if-nez v5, :cond_10

    :try_start_6
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    sget v3, La/Af;->a:I

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    iget-object v0, v1, Landroidx/emoji2/text/e$b;->c:Landroidx/emoji2/text/e$a;

    iget-object v3, v1, Landroidx/emoji2/text/e$b;->a:Landroid/content/Context;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    filled-new-array {v4}, [La/T6;

    move-result-object v0

    sget-object v5, La/Mf;->a:La/Rf;

    invoke-virtual {v5, v3, v0, v2}, La/Rf;->b(Landroid/content/Context;[La/T6;I)Landroid/graphics/Typeface;

    move-result-object v0

    iget-object v2, v1, Landroidx/emoji2/text/e$b;->a:Landroid/content/Context;

    iget-object v3, v4, La/T6;->a:Landroid/net/Uri;

    invoke-static {v2, v3}, La/Sf;->e(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    move-result-object v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    if-eqz v2, :cond_f

    if-eqz v0, :cond_f

    :try_start_7
    const-string v3, "EmojiCompat.MetadataRepo.create"

    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    new-instance v3, La/kb;

    invoke-static {v2}, La/n9;->u(Ljava/nio/MappedByteBuffer;)La/jb;

    move-result-object v2

    invoke-direct {v3, v0, v2}, La/kb;-><init>(Landroid/graphics/Typeface;La/jb;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    :try_start_8
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    :try_start_9
    invoke-static {}, Landroid/os/Trace;->endSection()V

    iget-object v0, v1, Landroidx/emoji2/text/e$b;->d:Ljava/lang/Object;

    monitor-enter v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :try_start_a
    iget-object v2, v1, Landroidx/emoji2/text/e$b;->h:Landroidx/emoji2/text/c$h;

    if-eqz v2, :cond_e

    invoke-virtual {v2, v3}, Landroidx/emoji2/text/c$h;->b(La/kb;)V

    goto :goto_6

    :catchall_5
    move-exception v2

    goto :goto_7

    :cond_e
    :goto_6
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    :try_start_b
    invoke-virtual {v1}, Landroidx/emoji2/text/e$b;->b()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    goto :goto_a

    :goto_7
    :try_start_c
    monitor-exit v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    :try_start_d
    throw v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    :catchall_6
    move-exception v0

    :try_start_e
    sget v2, La/Af;->a:I

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_f
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "Unable to open file."

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    :catchall_7
    move-exception v0

    :try_start_f
    sget v2, La/Af;->a:I

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_10
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
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    :goto_8
    iget-object v2, v1, Landroidx/emoji2/text/e$b;->d:Ljava/lang/Object;

    monitor-enter v2

    :try_start_10
    iget-object v3, v1, Landroidx/emoji2/text/e$b;->h:Landroidx/emoji2/text/c$h;

    if-eqz v3, :cond_11

    invoke-virtual {v3, v0}, Landroidx/emoji2/text/c$h;->a(Ljava/lang/Throwable;)V

    goto :goto_9

    :catchall_8
    move-exception v0

    goto :goto_b

    :cond_11
    :goto_9
    monitor-exit v2
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    invoke-virtual {v1}, Landroidx/emoji2/text/e$b;->b()V

    :goto_a
    return-void

    :goto_b
    :try_start_11
    monitor-exit v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    throw v0

    :goto_c
    :try_start_12
    monitor-exit v4
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    throw v0

    :pswitch_a
    iget-object v0, p0, La/M2;->b:Ljava/lang/Object;

    check-cast v0, La/F5;

    iget-object v1, v0, La/F5;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    move-result v1

    invoke-virtual {v0, v1}, La/F5;->t(Z)V

    iput-boolean v1, v0, La/F5;->m:Z

    return-void

    :pswitch_b
    iget-object v0, p0, La/M2;->b:Ljava/lang/Object;

    check-cast v0, La/s7;

    invoke-interface {v0}, La/s7;->a()Ljava/lang/Object;

    return-void

    :pswitch_c
    iget-object v0, p0, La/M2;->b:Ljava/lang/Object;

    check-cast v0, La/e4;

    iput-object v1, v0, La/e4;->a:Ljava/lang/String;

    return-void

    :pswitch_d
    iget-object v0, p0, La/M2;->b:Ljava/lang/Object;

    check-cast v0, La/E3;

    invoke-static {v0}, La/E3;->a(La/E3;)V

    return-void

    :pswitch_e
    iget-object v0, p0, La/M2;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/ComponentActivity$f;

    iget-object v2, v0, Landroidx/activity/ComponentActivity$f;->b:Ljava/lang/Runnable;

    if-eqz v2, :cond_12

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    iput-object v1, v0, Landroidx/activity/ComponentActivity$f;->b:Ljava/lang/Runnable;

    :cond_12
    return-void

    :pswitch_f
    iget-object v0, p0, La/M2;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/ComponentActivity;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->invalidateMenu()V

    return-void

    :pswitch_10
    iget-object v0, p0, La/M2;->b:Ljava/lang/Object;

    check-cast v0, La/l3;

    invoke-virtual {v0, v3}, La/l3;->t(Z)V

    return-void

    :pswitch_11
    iget-object v0, p0, La/M2;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->W0()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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
