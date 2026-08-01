.class public final synthetic Liv;
.super Ljava/lang/Object;

# interfaces
.implements Lhm;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 5

    iput p4, p0, Liv;->a:I

    iput-object p1, p0, Liv;->b:Ljava/lang/Object;

    iput-object p2, p0, Liv;->c:Ljava/lang/Object;

    iput-object p3, p0, Liv;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    const-string v2, "\u06e4\u06e5\u06e0"

    invoke-static {v2}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v4

    move-wide v2, v0

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :cond_0
    :sswitch_1
    sget v0, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v1, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    div-int/lit16 v1, v1, -0xc15

    sub-int/2addr v0, v1

    if-ltz v0, :cond_1

    const/16 v0, 0x3b

    sput v0, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    const-string v0, "\u06e6\u06e6\u06e8"

    :goto_1
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06df\u06e2\u06e2"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_2
    sget v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v1, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    div-int/lit16 v1, v1, -0x119b

    xor-int/2addr v0, v1

    if-ltz v0, :cond_2

    const-string v0, "\u06df\u06e6"

    invoke-static {v0}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e4\u06e5\u06e0"

    invoke-static {v0}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_3
    const-string v0, "dJExMFunmGCaOnXNd9"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۧۥ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget v2, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v3, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    or-int/2addr v2, v3

    const v3, 0x1aafb1

    add-int v4, v2, v3

    move-wide v2, v0

    goto :goto_0

    :sswitch_4
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v2, v3}, Ljava/io/PrintStream;->println(J)V

    const-string v0, "\u06df\u06e2\u06e2"

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    move-result v0

    if-ltz v0, :cond_3

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    const-string v0, "\u06e1\u06e3\u06e3"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e3\u06e4\u06e3"

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa75f -> :sswitch_0
        0x1aaf01 -> :sswitch_1
        0x1aaf1c -> :sswitch_4
        0x1ab6a2 -> :sswitch_3
        0x1aba7f -> :sswitch_5
        0x1aba84 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 15

    iget v4, p0, Liv;->a:I

    const-string v3, ""

    iget-object v2, p0, Liv;->d:Ljava/lang/Object;

    iget-object v1, p0, Liv;->c:Ljava/lang/Object;

    iget-object v0, p0, Liv;->b:Ljava/lang/Object;

    packed-switch v4, :pswitch_data_0

    check-cast v0, Landroid/widget/TextView;

    check-cast v1, Ljava/util/LinkedHashSet;

    check-cast v2, Lkv;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    const-string v4, "mHqUvPsc\n"

    const-string v5, "ffUFVXudxQ0=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    sget-object v5, Lh40;->m:Lqh;

    if-eqz v4, :cond_1

    const-string v1, "BXsRYv7v\n"

    const-string v3, "4PSAi35uQhc=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-virtual {v1, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-wide/16 v6, 0xc8

    invoke-virtual {v1, v6, v7}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    new-instance v1, Lh40;

    invoke-direct {v1, v0, v5}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    new-instance v3, Li40;

    const/high16 v0, 0x41700000    # 15.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v2, v0}, Lkv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-direct {v3, v0}, Li40;-><init>(F)V

    const/high16 v0, 0x43480000    # 200.0f

    invoke-virtual {v3, v0}, Li40;->b(F)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v3, v0}, Li40;->a(F)V

    iput-object v3, v1, Lh40;->j:Li40;

    invoke-virtual {v1}, Lh40;->h()V

    :cond_0
    :goto_0
    sget-object v0, Lvh;->n:Lvh;

    :goto_1
    return-object v0

    :cond_1
    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "\u53d1\u9001 ("

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-wide/16 v2, 0xc8

    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    new-instance v1, Lh40;

    invoke-direct {v1, v0, v5}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    const/4 v0, 0x0

    const/high16 v2, 0x43480000    # 200.0f

    const v3, 0x3f19999a    # 0.6f

    invoke-static {v0, v2, v3}, Lz30;->f(FFF)Li40;

    move-result-object v0

    iput-object v0, v1, Lh40;->j:Li40;

    invoke-virtual {v1}, Lh40;->h()V

    goto :goto_0

    :pswitch_0
    check-cast v0, Ljava/lang/String;

    check-cast v1, Landroid/content/ContentValues;

    check-cast v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    const-string v4, "k1KBG+7CvKCK\n"

    const-string v5, "5T3oeIur0sY=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "a3wMJ9L0fD5y\n"

    const-string v5, "HRNlRLedElg=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "FxRZVmAF7A==\n"

    const-string v5, "enEqJQFiiZQ=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_2
    invoke-static {v1}, Ljv;->a(Landroid/content/ContentValues;)V

    :cond_3
    const-string v4, "dNo07rw54Q==\n"

    const-string v5, "Gb9Hnd1ehF0=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    const-string v0, "psSRFg==\n"

    const-string v4, "0r3hc5OOurQ=\n"

    invoke-static {v0, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_2
    const-string v4, "VM5I0Th3oIlTxw==\n"

    const-string v5, "P6sxjkoSw+g=\n"

    sget-object v6, Lgn;->a:Lgn;

    invoke-static {v4, v5, v6}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x2710

    if-lt v0, v4, :cond_5

    const-string v0, "nC/PdYsowg==\n"

    const-string v4, "/0ChAe5Gtk8=\n"

    invoke-static {v0, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    move-object v0, v3

    :cond_4
    const-string v3, "ErapFcpV\n"

    const-string v4, "9CQN8FHLHKU=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v0, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_5

    const-string v3, "7DbFZh1AbNqWb98G\n"

    const-string v4, "CItlgI/kiUE=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v0, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_5

    const-string v3, "FB57eOsFL2QBHWs8\n"

    const-string v4, "bXEOWJlgTAU=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v0, v3, v4}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_5
    :goto_3
    sget-object v0, Lvh;->n:Lvh;

    goto/16 :goto_1

    :cond_6
    const/4 v0, 0x0

    goto :goto_2

    :cond_7
    const-string v0, "mn2sR5Y=\n"

    const-string v3, "9w7LDvLCon8=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_4
    const-wide/16 v4, 0x0

    cmp-long v3, v0, v4

    if-nez v3, :cond_8

    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    instance-of v1, v0, [Ljava/lang/Object;

    if-eqz v1, :cond_b

    check-cast v0, [Ljava/lang/Object;

    :goto_5
    if-eqz v0, :cond_c

    const/4 v1, 0x0

    aget-object v0, v0, v1

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-static {v0}, Lb50;->S(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :cond_8
    :goto_6
    const-wide/16 v4, 0x0

    cmp-long v3, v0, v4

    if-eqz v3, :cond_9

    sget-object v3, Li9;->b:Ljava/util/Map;

    const-string v4, "WVcPEliFB9QKWw8COIQF0VsYREhb3g==\n"

    const-string v5, "ZTBqZnX3YqI=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lgn;->f(Ljava/lang/String;Z)V

    :cond_9
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto :goto_3

    :cond_a
    const-wide/16 v0, 0x0

    goto :goto_4

    :cond_b
    const/4 v0, 0x0

    goto :goto_5

    :cond_c
    const-wide/16 v0, 0x0

    goto :goto_6

    :cond_d
    const-string v2, "zENE0VBNvELUX1nXTU0=\n"

    const-string v3, "uiwtsjU5ziM=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "C/6CGzGz\n"

    const-string v2, "aJPxfHjXGkM=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_f

    :cond_e
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_7
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_5

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "voice_trans_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgn;->a:Lgn;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lgn;->f(Ljava/lang/String;Z)V

    sget-object v0, Ld9;->b:Landroid/os/Handler;

    new-instance v1, Lod;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lod;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_3

    :cond_f
    const-string v0, "ArjI1ks=\n"

    const-string v2, "b8uvny/J3kU=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_e

    const-wide/16 v0, 0x0

    goto :goto_7

    :pswitch_1
    check-cast v0, Ljava/lang/String;

    check-cast v1, Landroid/content/ContentValues;

    check-cast v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    const-string v3, "X5Z4i30hsMNG\n"

    const-string v4, "KfkR6BhI3qU=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    const-string v3, "B+C54LKNP1Ae\n"

    const-string v4, "cY/Qg9fkUTY=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    const-string v3, "RT1r2B9lKg==\n"

    const-string v4, "KFgYq34CT1g=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_11

    :cond_10
    invoke-static {v1}, Ljv;->a(Landroid/content/ContentValues;)V

    :cond_11
    const-string v3, "Kwa2sSxQog==\n"

    const-string v4, "RmPFwk03x/A=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3a

    const-string v0, "T7l24g==\n"

    const-string v3, "O8AGh8ywFWo=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_21

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move v4, v0

    :goto_8
    const-string v0, "BkAq3Lwx\n"

    const-string v3, "bzN5udJVreg=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_22

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move v5, v0

    :goto_9
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    invoke-interface {v0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v3, "+EWedZg3N7/lQ6J+qSwOsP1CjmQ=\n"

    const-string v6, "kSvtEOpDYNY=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    invoke-interface {v0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v3, "k07OlC/Z\n"

    const-string v6, "+iC98V2tSjk=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    :cond_12
    sget-object v0, Ljv;->a:Ljava/util/ArrayList;

    const-string v0, "nM7kHNxMxg==\n"

    const-string v3, "/6GKaLkisjA=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_43

    const-string v0, ""

    move-object v6, v0

    :goto_a
    const v0, 0x1a000031

    if-eq v4, v0, :cond_13

    const v0, 0x1c000031

    if-eq v4, v0, :cond_13

    const/16 v0, 0x31

    if-ne v4, v0, :cond_14

    const-string v0, "Y7f0YGLkMJt3/edjcqRy0We85WZ+tn7acKPhczS2cNpzreVuNKx613Gm8mRzsXHTdq7r\n"

    const-string v3, "FM+EARveH7Q=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v6, v0, v3}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_14

    :cond_13
    const-string v0, "jmBNJDhb1X6c\n"

    const-string v3, "5QU0e1QuthU=\n"

    sget-object v7, Lgn;->a:Lgn;

    invoke-static {v0, v3, v7}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v0

    if-eqz v0, :cond_14

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0, v1}, Landroid/content/ContentValues;-><init>(Landroid/content/ContentValues;)V

    sget-object v3, Lhs;->a:Lhs;

    invoke-static {v0}, Lhs;->b(Landroid/content/ContentValues;)V

    :cond_14
    const v0, 0x19000031

    if-eq v4, v0, :cond_15

    const v0, 0x1a000031

    if-eq v4, v0, :cond_15

    const/16 v0, 0x31

    if-ne v4, v0, :cond_19

    const-string v0, "p9UcAIM7B+zpyApf\n"

    const-string v3, "m6FuYe1IYYk=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v6, v0, v3}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_19

    :cond_15
    if-nez v5, :cond_19

    const-string v0, "lXmx9KNOQl6haLrKrEhQVIxDp8U=\n"

    const-string v3, "/hzIq8I7NjE=\n"

    sget-object v7, Lgn;->a:Lgn;

    invoke-static {v0, v3, v7}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v0

    if-eqz v0, :cond_19

    const-string v0, "erhpp/MF\n"

    const-string v3, "DtkFzJZ3Jdw=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_16

    const-string v0, ""

    :cond_16
    sget-object v10, Ld9;->a:Ljava/lang/ClassLoader;

    if-eqz v10, :cond_19

    const-string v3, "6O0tMy1I3W/F\n"

    const-string v7, "qI5FUlk6sgA=\n"

    invoke-static {v3, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lb50;->C(Ljava/lang/String;Ljava/lang/String;)Z

    const-string v3, "U2qqnf0TNQ==\n"

    const-string v7, "MAXE6Zh9QVs=\n"

    invoke-static {v3, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v3, "fcle/CySeJpgzA==\n"

    const-string v7, "Cagyl0ngL+I=\n"

    invoke-static {v3, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v3, "bFHpaiNW\n"

    const-string v7, "AD6IDkYks+U=\n"

    invoke-static {v3, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :try_start_0
    const-string v3, "ION9T1euBwpu/msQBfw6LFjWW29i\n"

    const-string v7, "HJcPLjndYW8=\n"

    invoke-static {v3, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Lb50;->O(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "JJIi\n"

    const-string v8, "ec8crK6sUzM=\n"

    invoke-static {v7, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Lb50;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_42

    const-string v3, "8HvucW/+mSq+Zvgu\n"

    const-string v7, "zA+cEAGN/08=\n"

    invoke-static {v3, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Lb50;->O(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "h04yfMhdvJ7eEy9qlw==\n"

    const-string v8, "u2FGDqkzz/g=\n"

    invoke-static {v7, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Lb50;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object v9, v3

    :goto_b
    const-string v3, "oOKLFGb6is/o/5YbYe3Xkr3NujFJ3aj1\n"

    const-string v7, "nJb5dQiJ6a4=\n"

    invoke-static {v3, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Lb50;->O(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "2+Yh\n"

    const-string v8, "hrsfc8I1ES4=\n"

    invoke-static {v7, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Lb50;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_17

    const-string v3, "nM0AoKQ6FfLU0B2voy1I\n"

    const-string v7, "oLlywcpJdpM=\n"

    invoke-static {v3, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Lb50;->O(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "rE/UlS4Z9PHxFMmIIR7jrA==\n"

    const-string v8, "kGCg5093h5I=\n"

    invoke-static {v7, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Lb50;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_17
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_41

    const-string v3, "eu6k7qBDsZQy87nhp1Tuy2fBlcuPZJGs\n"

    const-string v7, "RprWj84w0Pc=\n"

    invoke-static {v3, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Lb50;->O(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "5qcV\n"

    const-string v8, "u/orrZiGkek=\n"

    invoke-static {v7, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Lb50;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object v8, v3

    :goto_c
    const-string v3, "nPEys3nKEK3j0xaCBq0=\n"

    const-string v7, "oJdX1kf2MfY=\n"

    invoke-static {v3, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Lb50;->O(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "Jt8S\n"

    const-string v11, "e4IsTFoOw9s=\n"

    invoke-static {v7, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Lb50;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_18

    const-string v3, "R6SuFOw=\n"

    const-string v7, "e8LLcdIgkrY=\n"

    invoke-static {v3, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Lb50;->O(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "sPS8FHFE\n"

    const-string v7, "jNvacRR6nNw=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lb50;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_18
    invoke-virtual {v9}, Ljava/lang/String;->length()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v6

    if-nez v6, :cond_23

    :cond_19
    :goto_d
    const/16 v0, 0x31

    if-eq v4, v0, :cond_1a

    const/16 v0, 0x39

    if-ne v4, v0, :cond_1c

    :cond_1a
    const/4 v0, 0x1

    if-ne v5, v0, :cond_1c

    const-string v0, "rytyMUFF\n"

    const-string v3, "20oeWiQ301I=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1b

    const-string v0, ""

    :cond_1b
    sget-object v3, Li9;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    if-eqz v0, :cond_1c

    :try_start_1
    const-string v3, "HCZyFJOo7Lg=\n"

    const-string v6, "cFAQYfXOico=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :cond_1c
    :goto_e
    const/4 v0, 0x1

    if-ne v4, v0, :cond_1d

    const/4 v0, 0x1

    if-ne v5, v0, :cond_1d

    const-string v0, "T9vxEOR5/Bp73/wQ434=\n"

    const-string v3, "JL6IT4wQmH8=\n"

    sget-object v6, Lgn;->a:Lgn;

    invoke-static {v0, v3, v6}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v0

    if-eqz v0, :cond_1d

    const-string v0, "DGve5+/B2g==\n"

    const-string v3, "bwSwk4qvris=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_40

    const-string v0, ""

    move-object v6, v0

    :goto_f
    const-string v0, "Cg==\n"

    const-string v3, "SjqBHA2hMlk=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v6, v0, v3}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_29

    :cond_1d
    :goto_10
    if-nez v5, :cond_20

    const/4 v0, 0x1

    if-ne v4, v0, :cond_20

    sget-object v0, Li9;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    const/16 v3, 0x3e8

    if-le v2, v3, :cond_1e

    :try_start_2
    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :cond_1e
    :goto_11
    const-string v0, "B/xvXXymufI=\n"

    const-string v2, "ao8IDgrU8JY=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_2d

    :cond_1f
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    :goto_12
    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_2e

    sget-object v0, Li9;->e:Ljava/util/Map;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2e

    :cond_20
    :goto_13
    sget-object v0, Lvh;->n:Lvh;

    goto/16 :goto_1

    :cond_21
    const/4 v0, 0x0

    move v4, v0

    goto/16 :goto_8

    :cond_22
    const/4 v0, 0x0

    move v5, v0

    goto/16 :goto_9

    :cond_23
    :try_start_3
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_19

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_19

    invoke-static {v3}, Lb50;->R(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_24

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    move v7, v3

    :goto_14
    sget-object v3, Lpb0;->l:Ljava/lang/String;

    invoke-static {v3, v10}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    if-eqz v3, :cond_19

    sget v11, Lpb0;->P:I

    invoke-virtual {v3}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v12

    const-string v3, "eD9BNH9EAdttL1YDf1gBhzF0G14=\n"

    const-string v6, "H1o1dxAqcq8=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v12}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v13, v12

    const/4 v3, 0x0

    move v6, v3

    :goto_15
    if-ge v6, v13, :cond_26

    aget-object v3, v12, v6

    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v14

    array-length v14, v14

    if-ne v14, v11, :cond_25

    :goto_16
    if-nez v3, :cond_27

    const-string v0, "wrlRPI/UIhI=\n"

    const-string v3, "lsswUvyyR2A=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u274c \u672a\u627e\u5230\u53c2\u6570\u4e2a\u6570\u4e3a "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " \u7684\u8f6c\u8d26\u6784\u9020\u5668\uff01"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v6, "xwGO\n"

    const-string v7, "s2Dpd1+FjZU=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "53vj\n"

    const-string v6, "igiEy7e+YPk=\n"

    invoke-static {v0, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_d

    :catchall_0
    move-exception v0

    :goto_17
    const-string v0, "Nwje\n"

    const-string v3, "Q2m5jaPP2Zc=\n"

    const-string v6, "joxZEJrdGJafjEoRmw==\n"

    const-string v7, "2v44fum7feQ=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "Fg==\n"

    const-string v8, "c8HJlSTQVfc=\n"

    invoke-static {v0, v3, v6, v7, v8}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_d

    :cond_24
    const/4 v3, 0x0

    move v7, v3

    goto :goto_14

    :cond_25
    add-int/lit8 v3, v6, -0x9

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v3, v3, 0x9

    move v6, v3

    goto :goto_15

    :cond_26
    const/4 v3, 0x0

    goto :goto_16

    :cond_27
    :try_start_4
    sget-object v6, Lpb0;->Y0:Ljb;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v6, v8, v9, v11, v0}, Ljb;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    array-length v6, v0

    if-eqz v6, :cond_19

    array-length v6, v0

    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_28

    invoke-static {v10, v0}, Luv;->d(Ljava/lang/ClassLoader;Ljava/lang/Object;)V

    const-string v0, "EebDrB7Jtis=\n"

    const-string v3, "RZSiwm2v01k=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    int-to-double v8, v7

    const-wide/high16 v10, 0x4059000000000000L    # 100.0

    div-double/2addr v8, v10

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u2705 \u6210\u529f\u53d1\u9001\u6536\u6b3e\u8bf7\u6c42: \uffe5"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v6, "xwGO\n"

    const-string v8, "s2Dpd1+FjZU=\n"

    invoke-static {v6, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "53vj\n"

    const-string v6, "igiEy7e+YPk=\n"

    invoke-static {v0, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, Lgn;->a:Lgn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lgn;->b:Landroid/app/Application;

    if-eqz v0, :cond_19

    new-instance v3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v6

    invoke-direct {v3, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v6, Lks;

    const/4 v8, 0x3

    invoke-direct {v6, v0, v7, v8}, Lks;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v3, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_d

    :catchall_1
    move-exception v0

    goto/16 :goto_17

    :cond_28
    const-string v0, "v17D4H2dFhauXtDhfA==\n"

    const-string v3, "6yyijg77c2Q=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "TsRRWJG0qH8s+Tj35s+gE0n2ZJDGi8kyHbFp3ZiWoH4TzTjj6c+sKkjhZ5/ekA==\n"

    const-string v6, "rFndeHcqLJY=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "xwGO\n"

    const-string v7, "s2Dpd1+FjZU=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "53vj\n"

    const-string v6, "igiEy7e+YPk=\n"

    invoke-static {v0, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto/16 :goto_d

    :cond_29
    const-string v0, "uOf2nxcPtYs=\n"

    const-string v3, "1JGU6nFp0Pk=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsByteArray(Ljava/lang/String;)[B

    move-result-object v0

    if-eqz v0, :cond_1d

    sget-object v8, Lc9;->a:Ljava/nio/charset/Charset;

    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v0, v8}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    new-instance v0, Li00;

    const-string v7, "h4sVSpA+JR7SmRUBy3V9TZLWTl6XLiQXyYYITJdl\n"

    const-string v9, "u+phP+NbV3I=\n"

    invoke-static {v7, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v0, v7}, Li00;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v3}, Li00;->a(Li00;Ljava/lang/String;)Ld4;

    move-result-object v0

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Ld4;->t()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lft;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lft;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v3, "m+0ODkZJ\n"

    const-string v7, "74xiZSM71gA=\n"

    invoke-static {v3, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3f

    const-string v3, ""

    move-object v7, v3

    :goto_18
    sget-object v3, Li9;->j:Li00;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v3, Li00;->b:Ljava/lang/Object;

    check-cast v3, Ljava/util/regex/Pattern;

    invoke-virtual {v3, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    const-string v6, ""

    invoke-virtual {v3, v6}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "replaceAll(...)"

    invoke-static {v6, v3}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v3}, Lb50;->T(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_2a

    const-string v3, " "

    :cond_2a
    const-string v6, "<msg><appmsg><title><![CDATA["

    const-string v9, "]]></title><type><![CDATA[57]]></type></appmsg></msg>"

    invoke-static {v6, v3, v9}, Lz30;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "<msgsource><atuserlist>"

    const-string v9, "</atuserlist></msgsource>"

    invoke-static {v6, v0, v9}, Lz30;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v6, Li9;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v8

    const-string v0, "v50ddISDioLw1kcY1A==\n"

    const-string v9, "2PhpNv337/E=\n"

    invoke-static {v0, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v8}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v9, v8

    rsub-int/lit8 v0, v9, 0x0

    rsub-int/lit8 v0, v0, 0x4a

    new-array v10, v0, [B

    const/4 v0, 0x0

    const/16 v11, 0x7b

    aput-byte v11, v10, v0

    const/4 v0, 0x1

    :goto_19
    const/16 v11, 0x8

    if-ge v0, v11, :cond_2b

    const/4 v11, 0x0

    aput-byte v11, v10, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_19

    :cond_2b
    const/16 v0, 0x8

    const/16 v11, 0x7a

    aput-byte v11, v10, v0

    const/4 v0, 0x0

    const/16 v11, 0x9

    array-length v12, v8

    invoke-static {v8, v0, v10, v11, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v0, v8

    rsub-int/lit8 v0, v0, 0x0

    rsub-int/lit8 v0, v0, 0x9

    array-length v8, v8

    :goto_1a
    add-int/lit8 v11, v8, 0x3

    add-int/lit8 v11, v11, 0x49

    add-int/lit8 v11, v11, -0x3

    if-ge v0, v11, :cond_2c

    const/4 v11, 0x0

    aput-byte v11, v10, v0

    rsub-int/lit8 v0, v0, 0x0

    add-int/lit8 v0, v0, -0x1

    rsub-int/lit8 v0, v0, 0x0

    goto :goto_1a

    :cond_2c
    add-int/lit8 v0, v9, -0xd

    add-int/lit8 v0, v0, 0x49

    add-int/lit8 v0, v0, 0xd

    const/16 v8, 0x7d

    aput-byte v8, v10, v0

    invoke-virtual {v6, v7, v10}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ld9;->b:Landroid/os/Handler;

    new-instance v6, Lt5;

    const/4 v8, 0x5

    invoke-direct {v6, v7, v8, v3}, Lt5;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v0, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const-wide/16 v6, 0x1

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto/16 :goto_10

    :cond_2d
    const-string v0, "uxRI6f9C1L+1Aw==\n"

    const-string v2, "2GYtiIsngNY=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_1f

    const-wide/16 v2, 0x0

    goto/16 :goto_12

    :cond_2e
    const-string v0, "LrVYiRWS4Q==\n"

    const-string v2, "Tdo2/XD8lfc=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3e

    const-string v0, ""

    move-object v2, v0

    :goto_1b
    new-instance v4, Li00;

    invoke-direct {v4}, Li00;-><init>()V

    const-string v0, ""

    iput-object v0, v4, Li00;->b:Ljava/lang/Object;

    const-string v0, "GXdLCG/i\n"

    const-string v3, "bRYnYwqQIRg=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3d

    const-string v0, ""

    move-object v3, v0

    :goto_1c
    const-string v0, "ZYvRTuiksF9I\n"

    const-string v1, "Jei5L5zW3zA=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lb50;->C(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    const-string v0, "J7hvx67wXuITr3Poo/x15imkYfe94XXiIg==\n"

    const-string v1, "TN0WmM+FKo0=\n"

    sget-object v6, Lgn;->a:Lgn;

    invoke-static {v0, v1, v6}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v0

    if-eqz v0, :cond_33

    const-string v0, "Op1XnmcHLFEOikuxagsHVTSBWa50Fg==\n"

    const-string v1, "UfguwQZyWD4=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1FVo0Ul6Zj6MaSWRZA==\n"

    const-string v6, "McnANNntSto=\n"

    invoke-static {v1, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_33

    const-string v0, "+Xv32l5Mch0jCg==\n"

    const-string v1, "olcYZtIwkZ0=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "pattern"

    invoke-static {v1, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v1, "compile(...)"

    invoke-static {v1, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-nez v0, :cond_30

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lip;->C(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :goto_1d
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_2f
    :goto_1e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_32

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lb50;->H(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2f

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1e

    :cond_30
    new-instance v1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v0, 0x0

    :cond_31
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->start()I

    move-result v8

    invoke-virtual {v6, v0, v8}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7}, Ljava/util/regex/Matcher;->end()I

    move-result v0

    invoke-virtual {v7}, Ljava/util/regex/Matcher;->find()Z

    move-result v8

    if-nez v8, :cond_31

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v6, v0, v7}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v0, v1

    goto :goto_1d

    :cond_32
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_37

    :cond_33
    const/4 v0, 0x0

    :goto_1f
    if-nez v0, :cond_35

    if-eqz v5, :cond_35

    const-string v1, "W7sK48EuM4xvrBbMzCIYgkQ=\n"

    const-string v6, "MN5zvKBbR+M=\n"

    sget-object v7, Lgn;->a:Lgn;

    invoke-static {v1, v6, v7}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v1

    if-eqz v1, :cond_35

    const-string v1, "pzbQkGKgA560Os0=\n"

    const-string v6, "zFOpzw/ZXOk=\n"

    invoke-static {v1, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v6, ""

    invoke-static {v1, v6}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "nup522eds4Rktg==\n"

    const-string v7, "3gzwW4EBOmA=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v2, v6, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-nez v6, :cond_34

    const-string v6, "TeZDFg==\n"

    const-string v7, "DacveupTWx4=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    invoke-static {v2, v6, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-nez v6, :cond_34

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_35

    const/4 v6, 0x0

    invoke-static {v2, v1, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_35

    :cond_34
    const-string v0, "GbtUv0vH2zMtrEiQRsvwKBemWQ==\n"

    const-string v1, "ct4t4Cqyr1w=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "VNF0bmtK\n"

    const-string v2, "skXCi+P6SwE=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Li00;->b:Ljava/lang/Object;

    const/4 v0, 0x1

    :cond_35
    if-nez v0, :cond_36

    if-nez v5, :cond_36

    const-string v1, "2sl+YFVd1j3u3mJPWFH9NdTCYk1VRA==\n"

    const-string v2, "sawHPzQoolI=\n"

    sget-object v5, Lgn;->a:Lgn;

    invoke-static {v1, v2, v5}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v1

    if-eqz v1, :cond_36

    const-string v0, "cr7NkgrcE85GqdG9B9A4xny10b8KxTjVfKPA\n"

    const-string v1, "Gdu0zWupZ6E=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "01RzDVSdnuadOFpnP7HTlYlQBUJXyOv00Ed8D36gmPq3\n"

    const-string v2, "Ndzi6tote3o=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Li00;->b:Ljava/lang/Object;

    const/4 v0, 0x1

    :cond_36
    if-eqz v0, :cond_20

    iget-object v0, v4, Li00;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_39

    const/4 v0, 0x1

    :goto_20
    if-eqz v0, :cond_20

    sget-object v0, Ld9;->b:Landroid/os/Handler;

    new-instance v1, Lt5;

    const/4 v2, 0x6

    invoke-direct {v1, v3, v2, v4}, Lt5;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_13

    :cond_37
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v0, 0x0

    move v1, v0

    :cond_38
    if-ge v1, v7, :cond_33

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    check-cast v0, Ljava/lang/String;

    const/4 v8, 0x1

    invoke-static {v2, v0, v8}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_38

    sget-object v0, Lgn;->a:Lgn;

    const-string v1, "PHFgmu2GHjMIZny14Io1NzJtbqr+lzUoMmxt\n"

    const-string v6, "VxQZxYzzalw=\n"

    invoke-static {v1, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "TkFvOroidDEVD11x3RwcXCFMLFWdVgoqQ0JE\n"

    const-string v7, "pubJ3zWzkbQ=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v6}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Li00;->b:Ljava/lang/Object;

    const/4 v0, 0x1

    goto/16 :goto_1f

    :cond_39
    const/4 v0, 0x0

    goto :goto_20

    :cond_3a
    const-string v2, "JfTq1Fhv3/U96PfSRW8=\n"

    const-string v3, "U5uDtz0brZQ=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    const-string v0, "nrgiPRmA\n"

    const-string v2, "/dVRWlDkn8A=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_3c

    :cond_3b
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_21
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_20

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "voice_trans_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgn;->a:Lgn;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lgn;->f(Ljava/lang/String;Z)V

    sget-object v0, Ld9;->b:Landroid/os/Handler;

    new-instance v1, Lod;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lod;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_13

    :cond_3c
    const-string v0, "pVYpWII=\n"

    const-string v2, "yCVOEeaPu+w=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_3b

    const-wide/16 v0, 0x0

    goto :goto_21

    :catchall_2
    move-exception v0

    goto/16 :goto_11

    :catchall_3
    move-exception v0

    goto/16 :goto_e

    :cond_3d
    move-object v3, v0

    goto/16 :goto_1c

    :cond_3e
    move-object v2, v0

    goto/16 :goto_1b

    :cond_3f
    move-object v7, v3

    goto/16 :goto_18

    :cond_40
    move-object v6, v0

    goto/16 :goto_f

    :cond_41
    move-object v8, v3

    goto/16 :goto_c

    :cond_42
    move-object v9, v3

    goto/16 :goto_b

    :cond_43
    move-object v6, v0

    goto/16 :goto_a

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
