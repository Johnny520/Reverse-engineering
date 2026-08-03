.class public final synthetic LN2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, LN2;->a:I

    iput-object p2, p0, LN2;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 40

    move-object/from16 v1, p0

    iget v0, v1, LN2;->a:I

    const/4 v2, 0x2

    const/high16 v3, 0x14000000

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    array-length v2, v0

    :goto_0
    if-ge v6, v2, :cond_2

    aget-object v3, v0, v6

    invoke-virtual {v3}, Ljava/io/File;->lastModified()J

    move-result-wide v4

    sget-wide v7, Lio/sentry/z1;->f:J

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v10, 0x5

    invoke-virtual {v9, v10, v11}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v9

    sub-long/2addr v7, v9

    cmp-long v4, v4, v7

    if-gez v4, :cond_1

    invoke-static {v3}, Lio/sentry/config/a;->f(Ljava/io/File;)Z

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void

    :pswitch_0
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v2, 0x96

    invoke-virtual {v0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void

    :pswitch_1
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, La9;

    invoke-virtual {v0}, La9;->a()Ljava/lang/Object;

    return-void

    :pswitch_2
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->e:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    return-void

    :pswitch_3
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, LhG;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v2, v0, Lqs;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/reflect/Member;

    iget-object v3, v0, Lqs;->b:Ljava/lang/Object;

    iget-object v0, v0, Lqs;->c:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    invoke-static {v2, v3, v0}, Lde/robv/android/xposed/XposedBridge;->invokeOriginalMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_4
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, Lb6;

    iput-boolean v6, v0, Lb6;->c:Z

    iget-object v3, v0, Lb6;->e:LQb;

    check-cast v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget-object v4, v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:LmE;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, LmE;->f()Z

    move-result v4

    if-eqz v4, :cond_3

    iget v2, v0, Lb6;->b:I

    invoke-virtual {v0, v2}, Lb6;->a(I)V

    goto :goto_2

    :cond_3
    iget v4, v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    if-ne v4, v2, :cond_4

    iget v0, v0, Lb6;->b:I

    invoke-virtual {v3, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r(I)V

    :cond_4
    :goto_2
    return-void

    :pswitch_5
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, Lio/github/cherrywechat/lua/loader/LoadedScript;

    invoke-static {v0}, Lio/github/cherrywechat/lua/loader/ScriptManager;->a(Lio/github/cherrywechat/lua/loader/LoadedScript;)V

    return-void

    :pswitch_6
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, LXu;

    invoke-virtual {v0}, LXu;->m()V

    return-void

    :pswitch_7
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/ProcessLifecycleOwner;

    iget-object v2, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->f:Lao;

    iget v3, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->b:I

    if-nez v3, :cond_5

    iput-boolean v5, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->c:Z

    sget-object v3, LOn;->ON_PAUSE:LOn;

    invoke-virtual {v2, v3}, Lao;->e(LOn;)V

    :cond_5
    iget v3, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->a:I

    if-nez v3, :cond_6

    iget-boolean v3, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->c:Z

    if-eqz v3, :cond_6

    sget-object v3, LOn;->ON_STOP:LOn;

    invoke-virtual {v2, v3}, Lao;->e(LOn;)V

    iput-boolean v5, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->d:Z

    :cond_6
    return-void

    :pswitch_8
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    invoke-static {v0}, Lcom/google/android/material/button/MaterialButton;->a(Lcom/google/android/material/button/MaterialButton;)V

    return-void

    :pswitch_9
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, Ljq;

    sget-object v2, Lhe;->a:Lhd;

    sget-object v2, LZp;->a:Lnk;

    invoke-static {v2}, LPj;->a(Lac;)LCb;

    move-result-object v2

    new-instance v3, Lfq;

    invoke-direct {v3, v0, v4, v6}, Lfq;-><init>(Ljq;LEb;I)V

    const/4 v0, 0x3

    invoke-static {v2, v3, v0}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    return-void

    :pswitch_a
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, LRp;

    invoke-virtual {v0}, LRp;->g()V

    return-void

    :pswitch_b
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, Landroid/widget/ScrollView;

    const/16 v2, 0x82

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->fullScroll(I)Z

    return-void

    :pswitch_c
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, LWo;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_7
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    return-void

    :pswitch_d
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, LKo;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_8
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    return-void

    :pswitch_e
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, Lhk;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_9
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    return-void

    :pswitch_f
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, Lhi;

    iget-object v2, v0, Lhi;->N:LLi;

    iget-object v3, v0, Lhi;->d:Landroid/os/Bundle;

    iget-object v2, v2, LLi;->e:Lwy;

    invoke-virtual {v2, v3}, Lwy;->d(Landroid/os/Bundle;)V

    iput-object v4, v0, Lhi;->d:Landroid/os/Bundle;

    return-void

    :pswitch_10
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, LOh;

    const-string v0, "fetchFonts result is not OK. ("

    iget-object v4, v3, LOh;->d:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    iget-object v5, v3, LOh;->h:Lcr;

    if-nez v5, :cond_a

    monitor-exit v4

    goto/16 :goto_9

    :catchall_0
    move-exception v0

    goto/16 :goto_b

    :cond_a
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v3}, LOh;->c()LZh;

    move-result-object v4

    iget v5, v4, LZh;->f:I

    if-ne v5, v2, :cond_b

    iget-object v2, v3, LOh;->d:Ljava/lang/Object;

    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    monitor-exit v2

    goto :goto_3

    :catchall_1
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v0

    goto/16 :goto_7

    :cond_b
    :goto_3
    if-nez v5, :cond_e

    :try_start_4
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    sget v2, LzB;->a:I

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    iget-object v0, v3, LOh;->c:LPg;

    iget-object v2, v3, LOh;->a:Landroid/content/Context;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    filled-new-array {v4}, [LZh;

    move-result-object v0

    sget-object v5, LUB;->a:Lcr;

    const-string v5, "TypefaceCompat.createFromFontInfo"

    invoke-static {v5}, LOj;->c(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    :try_start_5
    sget-object v5, LUB;->a:Lcr;

    invoke-virtual {v5, v2, v0, v6}, Lcr;->r(Landroid/content/Context;[LZh;I)Landroid/graphics/Typeface;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    iget-object v2, v3, LOh;->a:Landroid/content/Context;

    iget-object v4, v4, LZh;->a:Landroid/net/Uri;

    invoke-static {v2, v4}, LGu;->w(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    move-result-object v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    if-eqz v2, :cond_d

    if-eqz v0, :cond_d

    :try_start_7
    const-string v4, "EmojiCompat.MetadataRepo.create"

    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    new-instance v4, Lqs;

    invoke-static {v2}, LPj;->x(Ljava/nio/MappedByteBuffer;)LPr;

    move-result-object v2

    invoke-direct {v4, v0, v2}, Lqs;-><init>(Landroid/graphics/Typeface;LPr;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :try_start_8
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    :try_start_9
    invoke-static {}, Landroid/os/Trace;->endSection()V

    iget-object v2, v3, LOh;->d:Ljava/lang/Object;

    monitor-enter v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :try_start_a
    iget-object v0, v3, LOh;->h:Lcr;

    if-eqz v0, :cond_c

    invoke-virtual {v0, v4}, Lcr;->I(Lqs;)V

    goto :goto_4

    :catchall_3
    move-exception v0

    goto :goto_5

    :cond_c
    :goto_4
    monitor-exit v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :try_start_b
    invoke-virtual {v3}, LOh;->b()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    goto :goto_9

    :goto_5
    :try_start_c
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :try_start_d
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    :catchall_4
    move-exception v0

    :try_start_e
    sget v2, LzB;->a:I

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "Unable to open file."

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_5
    move-exception v0

    goto :goto_6

    :catchall_6
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    :goto_6
    :try_start_f
    sget v2, LzB;->a:I

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_e
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    :goto_7
    iget-object v2, v3, LOh;->d:Ljava/lang/Object;

    monitor-enter v2

    :try_start_10
    iget-object v4, v3, LOh;->h:Lcr;

    if-eqz v4, :cond_f

    invoke-virtual {v4, v0}, Lcr;->H(Ljava/lang/Throwable;)V

    goto :goto_8

    :catchall_7
    move-exception v0

    goto :goto_a

    :cond_f
    :goto_8
    monitor-exit v2
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    invoke-virtual {v3}, LOh;->b()V

    :goto_9
    return-void

    :goto_a
    :try_start_11
    monitor-exit v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    throw v0

    :goto_b
    :try_start_12
    monitor-exit v4
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    throw v0

    :pswitch_11
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, LOg;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    if-eqz v2, :cond_10

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_10
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    return-void

    :pswitch_12
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, LLe;

    iget-object v2, v0, LLe;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v2}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    move-result v2

    invoke-virtual {v0, v2}, LLe;->s(Z)V

    iput-boolean v2, v0, LLe;->m:Z

    return-void

    :pswitch_13
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, Lve;

    iget-boolean v2, v0, Lve;->d:Z

    if-nez v2, :cond_13

    iput-boolean v5, v0, Lve;->d:Z

    const/16 v2, 0x8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    int-to-float v2, v2

    iput v2, v0, Lve;->f:F

    invoke-virtual {v0, v6}, Landroid/view/View;->performHapticFeedback(I)Z

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const v3, 0x3f866666    # 1.05f

    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const-wide/16 v3, 0xc8

    invoke-virtual {v2, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    iget-object v2, v0, Lve;->k:Lfj;

    if-eqz v2, :cond_11

    invoke-interface {v2, v0}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_11
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eqz v2, :cond_12

    invoke-interface {v2, v5}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_12
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_13
    return-void

    :pswitch_14
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-static {v0}, Lgf;->o(Landroid/view/ViewGroup;)V

    sget-object v2, LXA;->a:Ljava/util/HashMap;

    const-wide v2, -0xcc8fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Lhw;->a(ILjava/lang/String;)I

    move-result v2

    const-wide v3, -0xce5fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Lhw;->a(ILjava/lang/String;)I

    move-result v3

    invoke-static {v0, v2, v3, v6}, Lgf;->M(Landroid/view/ViewGroup;IIZ)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const-wide v3, -0xc81fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3, v5}, Landroid/view/ViewGroup;->findViewsWithText(Ljava/util/ArrayList;Ljava/lang/CharSequence;I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_14

    sget-object v2, LKk;->a:Ljava/lang/Object;

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_14

    const-wide v3, -0xc89fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lgf;->v(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-wide v3, -0xcabfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    const-wide v3, -0xb67fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_14
    return-void

    :pswitch_15
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, LUa;

    invoke-static {v0}, LUa;->a(LUa;)V

    return-void

    :pswitch_16
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, LOa;

    iget-object v2, v0, LOa;->b:Ljava/lang/Runnable;

    if-eqz v2, :cond_15

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    iput-object v4, v0, LOa;->b:Ljava/lang/Runnable;

    :cond_15
    return-void

    :pswitch_17
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, LN9;

    invoke-virtual {v0, v5}, LN9;->s(Z)V

    return-void

    :pswitch_18
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lio/github/cherrywechat/lua/api/CherryThreadAPI;->o(Ljava/lang/String;)V

    return-void

    :pswitch_19
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/net/Socket;

    invoke-static {v0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->c(Ljava/net/Socket;)V

    return-void

    :pswitch_1a
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, [B

    invoke-static {v0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->a([B)V

    return-void

    :pswitch_1b
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/i;->requestLayout()V

    return-void

    :pswitch_1c
    iget-object v0, v1, LN2;->b:Ljava/lang/Object;

    check-cast v0, LQ2;

    iget-object v0, v0, LQ2;->c:LD2;

    iget-object v0, v0, LD2;->b:Ljava/lang/Object;

    check-cast v0, LQ2;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iget-object v7, v0, LQ2;->b:Ljava/util/ArrayList;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v8

    move v10, v6

    :goto_c
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v10, v11, :cond_24

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LOy;

    if-nez v11, :cond_17

    :cond_16
    :goto_d
    move-object/from16 v25, v7

    goto/16 :goto_17

    :cond_17
    iget-object v12, v0, LQ2;->a:Lsy;

    invoke-virtual {v12, v11}, Lsy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Long;

    if-nez v13, :cond_18

    goto :goto_e

    :cond_18
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    cmp-long v13, v13, v8

    if-gez v13, :cond_16

    invoke-virtual {v12, v11}, Lsy;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_e
    iget-wide v12, v11, LOy;->f:J

    const-wide/16 v14, 0x0

    cmp-long v16, v12, v14

    if-nez v16, :cond_19

    iput-wide v2, v11, LOy;->f:J

    iget v12, v11, LOy;->b:F

    invoke-virtual {v11, v12}, LOy;->c(F)V

    goto :goto_d

    :cond_19
    sub-long v12, v2, v12

    iput-wide v2, v11, LOy;->f:J

    invoke-static {}, LOy;->b()LQ2;

    move-result-object v14

    iget v14, v14, LQ2;->g:F

    const/4 v15, 0x0

    cmpl-float v17, v14, v15

    if-nez v17, :cond_1a

    const-wide/32 v12, 0x7fffffff

    :goto_f
    move-wide/from16 v22, v12

    goto :goto_10

    :cond_1a
    long-to-float v12, v12

    div-float/2addr v12, v14

    float-to-long v12, v12

    goto :goto_f

    :goto_10
    iget-boolean v12, v11, LOy;->l:Z

    const v13, -0x800001

    const v14, 0x7f7fffff    # Float.MAX_VALUE

    if-eqz v12, :cond_1c

    iget v12, v11, LOy;->k:F

    cmpl-float v17, v12, v14

    if-eqz v17, :cond_1b

    iget-object v5, v11, LOy;->j:LPy;

    move-object/from16 v25, v7

    float-to-double v6, v12

    iput-wide v6, v5, LPy;->i:D

    iput v14, v11, LOy;->k:F

    goto :goto_11

    :cond_1b
    move-object/from16 v25, v7

    :goto_11
    iget-object v5, v11, LOy;->j:LPy;

    iget-wide v5, v5, LPy;->i:D

    double-to-float v5, v5

    iput v5, v11, LOy;->b:F

    iput v15, v11, LOy;->a:F

    const/4 v5, 0x0

    iput-boolean v5, v11, LOy;->l:Z

    :goto_12
    const/4 v4, 0x1

    goto/16 :goto_14

    :cond_1c
    move-object/from16 v25, v7

    iget v5, v11, LOy;->k:F

    cmpl-float v5, v5, v14

    if-eqz v5, :cond_1d

    iget-object v5, v11, LOy;->j:LPy;

    iget v6, v11, LOy;->b:F

    float-to-double v6, v6

    iget v12, v11, LOy;->a:F

    move-object/from16 v26, v5

    float-to-double v4, v12

    const-wide/16 v17, 0x2

    div-long v31, v22, v17

    move-wide/from16 v29, v4

    move-wide/from16 v27, v6

    invoke-virtual/range {v26 .. v32}, LPy;->a(DDJ)LRe;

    move-result-object v4

    iget-object v5, v11, LOy;->j:LPy;

    iget v6, v11, LOy;->k:F

    float-to-double v6, v6

    iput-wide v6, v5, LPy;->i:D

    iput v14, v11, LOy;->k:F

    iget v6, v4, LRe;->a:F

    float-to-double v6, v6

    iget v4, v4, LRe;->b:F

    float-to-double v14, v4

    move-object/from16 v33, v5

    move-wide/from16 v34, v6

    move-wide/from16 v36, v14

    move-wide/from16 v38, v31

    invoke-virtual/range {v33 .. v39}, LPy;->a(DDJ)LRe;

    move-result-object v4

    iget v5, v4, LRe;->a:F

    iput v5, v11, LOy;->b:F

    iget v4, v4, LRe;->b:F

    iput v4, v11, LOy;->a:F

    goto :goto_13

    :cond_1d
    iget-object v4, v11, LOy;->j:LPy;

    iget v5, v11, LOy;->b:F

    float-to-double v5, v5

    iget v7, v11, LOy;->a:F

    float-to-double v14, v7

    move-object/from16 v17, v4

    move-wide/from16 v18, v5

    move-wide/from16 v20, v14

    invoke-virtual/range {v17 .. v23}, LPy;->a(DDJ)LRe;

    move-result-object v4

    iget v5, v4, LRe;->a:F

    iput v5, v11, LOy;->b:F

    iget v4, v4, LRe;->b:F

    iput v4, v11, LOy;->a:F

    :goto_13
    iget v4, v11, LOy;->b:F

    invoke-static {v4, v13}, Ljava/lang/Math;->max(FF)F

    move-result v4

    iput v4, v11, LOy;->b:F

    const v12, 0x7f7fffff    # Float.MAX_VALUE

    invoke-static {v4, v12}, Ljava/lang/Math;->min(FF)F

    move-result v4

    iput v4, v11, LOy;->b:F

    iget v5, v11, LOy;->a:F

    iget-object v6, v11, LOy;->j:LPy;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    float-to-double v14, v5

    iget-wide v12, v6, LPy;->e:D

    cmpg-double v12, v14, v12

    if-gez v12, :cond_1e

    iget-wide v12, v6, LPy;->i:D

    double-to-float v12, v12

    sub-float/2addr v4, v12

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    float-to-double v12, v4

    iget-wide v14, v6, LPy;->d:D

    cmpg-double v4, v12, v14

    if-gez v4, :cond_1e

    iget-object v4, v11, LOy;->j:LPy;

    iget-wide v12, v4, LPy;->i:D

    double-to-float v4, v12

    iput v4, v11, LOy;->b:F

    const/4 v4, 0x0

    iput v4, v11, LOy;->a:F

    goto/16 :goto_12

    :cond_1e
    const/4 v4, 0x0

    :goto_14
    iget v6, v11, LOy;->b:F

    const v12, 0x7f7fffff    # Float.MAX_VALUE

    invoke-static {v6, v12}, Ljava/lang/Math;->min(FF)F

    move-result v6

    iput v6, v11, LOy;->b:F

    const v5, -0x800001

    invoke-static {v6, v5}, Ljava/lang/Math;->max(FF)F

    move-result v5

    iput v5, v11, LOy;->b:F

    invoke-virtual {v11, v5}, LOy;->c(F)V

    if-eqz v4, :cond_23

    iget-object v4, v11, LOy;->h:Ljava/util/ArrayList;

    const/4 v5, 0x0

    iput-boolean v5, v11, LOy;->e:Z

    invoke-static {}, LOy;->b()LQ2;

    move-result-object v5

    iget-object v6, v5, LQ2;->a:Lsy;

    invoke-virtual {v6, v11}, Lsy;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v6, v5, LQ2;->b:Ljava/util/ArrayList;

    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v7

    if-ltz v7, :cond_1f

    const/4 v12, 0x0

    invoke-virtual {v6, v7, v12}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    const/4 v6, 0x1

    iput-boolean v6, v5, LQ2;->f:Z

    :cond_1f
    const-wide/16 v5, 0x0

    iput-wide v5, v11, LOy;->f:J

    const/4 v5, 0x0

    :goto_15
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_21

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_20

    add-int/lit8 v5, v5, 0x1

    goto :goto_15

    :cond_20
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_21
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/16 v24, 0x1

    add-int/lit8 v5, v5, -0x1

    :goto_16
    if-ltz v5, :cond_23

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_22

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_22
    add-int/lit8 v5, v5, -0x1

    goto :goto_16

    :cond_23
    :goto_17
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v7, v25

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    goto/16 :goto_c

    :cond_24
    move-object/from16 v25, v7

    iget-boolean v2, v0, LQ2;->f:Z

    if-eqz v2, :cond_28

    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/16 v24, 0x1

    add-int/lit8 v2, v2, -0x1

    :goto_18
    if-ltz v2, :cond_26

    move-object/from16 v3, v25

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_25

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_25
    add-int/lit8 v2, v2, -0x1

    move-object/from16 v25, v3

    goto :goto_18

    :cond_26
    move-object/from16 v3, v25

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-nez v2, :cond_27

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x21

    if-lt v2, v4, :cond_27

    iget-object v2, v0, LQ2;->h:LP3;

    iget-object v4, v2, LP3;->b:Ljava/lang/Object;

    check-cast v4, LO2;

    invoke-static {v4}, LU;->i(LO2;)Z

    const/4 v12, 0x0

    iput-object v12, v2, LP3;->b:Ljava/lang/Object;

    :cond_27
    const/4 v5, 0x0

    iput-boolean v5, v0, LQ2;->f:Z

    goto :goto_19

    :cond_28
    move-object/from16 v3, v25

    :goto_19
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_29

    iget-object v2, v0, LQ2;->e:LP3;

    iget-object v0, v0, LQ2;->d:LN2;

    iget-object v2, v2, LP3;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/Choreographer;

    new-instance v3, LP2;

    invoke-direct {v3, v0}, LP2;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2, v3}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    :cond_29
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
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
