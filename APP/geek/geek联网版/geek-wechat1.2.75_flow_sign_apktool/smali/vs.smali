.class public final synthetic Lvs;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final a:Lo00;

.field public final b:Ll00;

.field public final c:Ll00;

.field public final d:Ln00;

.field public final e:Landroid/app/Activity;

.field public final f:Ln00;

.field public final g:Lp00;

.field public final h:Landroid/view/ViewGroup;

.field public final i:Landroid/widget/FrameLayout;

.field public final j:Landroid/widget/FrameLayout;

.field public final k:Landroid/view/ViewGroup;

.field public final l:I

.field public final m:Landroid/view/ViewGroup$LayoutParams;

.field public final n:Landroid/graphics/drawable/Drawable;

.field public final o:Landroid/graphics/drawable/Drawable;

.field public final p:Ll00;

.field public final q:Landroid/graphics/drawable/Drawable;

.field public final r:Lp00;

.field public final s:Landroid/view/ViewGroup;

.field public final t:F

.field public final u:Landroid/graphics/drawable/ColorDrawable;

.field public final v:Landroid/view/View;

.field public final w:Lo40;


# direct methods
.method public synthetic constructor <init>(Lo00;Ll00;Ll00;Ln00;Landroid/app/Activity;Ln00;Lp00;Landroid/view/ViewGroup;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/view/ViewGroup;ILandroid/view/ViewGroup$LayoutParams;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ll00;Landroid/graphics/drawable/Drawable;Lp00;Landroid/view/ViewGroup;FLandroid/graphics/drawable/ColorDrawable;Landroid/view/View;Lv9;Lo40;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v2, "\u06e2\u06e6\u06df"

    invoke-static {v2}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    move-object/from16 v0, p15

    iput-object v0, p0, Lvs;->o:Landroid/graphics/drawable/Drawable;

    move-object/from16 v0, p16

    iput-object v0, p0, Lvs;->p:Ll00;

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v3, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    mul-int/lit16 v3, v3, -0x1a2e

    sub-int/2addr v2, v3

    if-gtz v2, :cond_0

    const/16 v2, 0x5c

    sput v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    :goto_1
    const-string v2, "\u06df\u06e0\u06e5"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_0
    const-string v2, "\u06df\u06e4\u06e0"

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_2
    iput-object p1, p0, Lvs;->a:Lo00;

    iput-object p2, p0, Lvs;->b:Ll00;

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    move-result v2

    if-gtz v2, :cond_1

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    const-string v2, "\u06df\u06e4\u06e0"

    invoke-static {v2}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_1
    const-string v2, "\u06e2\u06e6\u06e7"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_3
    iput-object p7, p0, Lvs;->g:Lp00;

    iput-object p8, p0, Lvs;->h:Landroid/view/ViewGroup;

    const-string v2, "\u06e5\u06e2\u06e1"

    :goto_3
    invoke-static {v2}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_4
    move-object/from16 v0, p19

    iput-object v0, p0, Lvs;->s:Landroid/view/ViewGroup;

    move/from16 v0, p20

    iput v0, p0, Lvs;->t:F

    goto :goto_1

    :sswitch_5
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v2, "\u06e3\u06e2"

    :goto_4
    invoke-static {v2}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_6
    move-object/from16 v0, p24

    iput-object v0, p0, Lvs;->w:Lo40;

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    move-result v2

    if-ltz v2, :cond_5

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v2

    if-ltz v2, :cond_2

    const-string v2, "\u06e3\u06e5\u06e6"

    goto :goto_3

    :cond_2
    const-string v2, "\u06e8\u06e4\u06df"

    :goto_5
    invoke-static {v2}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_7
    const-string v1, "vVlk7iNH3O48Cr1FETdYiEWd"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۡۧ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    xor-int/lit16 v3, v3, 0x2392

    or-int/2addr v2, v3

    if-ltz v2, :cond_4

    const/16 v2, 0x48

    sput v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    :cond_3
    const-string v2, "\u06e5\u06e6"

    goto :goto_4

    :cond_4
    const-string v2, "\u06e8\u06df\u06df"

    goto :goto_5

    :sswitch_8
    iput-object p9, p0, Lvs;->i:Landroid/widget/FrameLayout;

    iput-object p10, p0, Lvs;->j:Landroid/widget/FrameLayout;

    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    move-result v2

    if-ltz v2, :cond_3

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    const-string v2, "\u06e2\u06e5\u06e6"

    invoke-static {v2}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :cond_5
    :sswitch_9
    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    move-result v2

    if-gtz v2, :cond_6

    const/16 v2, 0x10

    sput v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    const-string v2, "\u06e7\u06df\u06e8"

    goto :goto_5

    :cond_6
    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v3, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    div-int/2addr v2, v3

    const v3, 0xdc5f

    add-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_a
    iput-object p11, p0, Lvs;->k:Landroid/view/ViewGroup;

    move/from16 v0, p12

    iput v0, p0, Lvs;->l:I

    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    if-gtz v2, :cond_7

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    const-string v2, "\u06e4\u06e0\u06e1"

    goto/16 :goto_2

    :cond_7
    const-string v2, "\u06e3\u06e5\u06e6"

    goto :goto_4

    :sswitch_b
    move-object/from16 v0, p17

    iput-object v0, p0, Lvs;->q:Landroid/graphics/drawable/Drawable;

    move-object/from16 v0, p18

    iput-object v0, p0, Lvs;->r:Lp00;

    const-string v2, "\u06e3\u06e1\u06e0"

    invoke-static {v2}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v0, p21

    iput-object v0, p0, Lvs;->u:Landroid/graphics/drawable/ColorDrawable;

    move-object/from16 v0, p22

    iput-object v0, p0, Lvs;->v:Landroid/view/View;

    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    if-ltz v2, :cond_a

    const/16 v2, 0x2b

    sput v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    const-string v2, "\u06e3\u06e7\u06e7"

    invoke-static {v2}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v0, p13

    iput-object v0, p0, Lvs;->m:Landroid/view/ViewGroup$LayoutParams;

    move-object/from16 v0, p14

    iput-object v0, p0, Lvs;->n:Landroid/graphics/drawable/Drawable;

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    move-result v2

    if-gtz v2, :cond_8

    const-string v2, "\u06e2\u06e6\u06e7"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :cond_8
    const-string v2, "\u06e3\u06e7\u06e7"

    invoke-static {v2}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :sswitch_e
    iput-object p5, p0, Lvs;->e:Landroid/app/Activity;

    iput-object p6, p0, Lvs;->f:Ln00;

    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v3, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    xor-int/lit16 v3, v3, 0x10b8

    or-int/2addr v2, v3

    if-ltz v2, :cond_9

    const-string v2, "\u06e8\u06e4\u06df"

    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :cond_9
    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v3, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    or-int/2addr v2, v3

    const v3, -0x1aa5f1

    xor-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_f
    iput-object p3, p0, Lvs;->c:Ll00;

    iput-object p4, p0, Lvs;->d:Ln00;

    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    div-int/lit16 v3, v3, -0x9c6

    xor-int/2addr v2, v3

    if-ltz v2, :cond_b

    :cond_a
    const-string v2, "\u06df\u06e7\u06e3"

    invoke-static {v2}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :cond_b
    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v3, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    xor-int/2addr v2, v3

    const v3, 0x1aae25

    add-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    move-result v2

    if-ltz v2, :cond_c

    const/16 v2, 0x49

    sput v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    const-string v2, "\u06e6\u06e7\u06e3"

    invoke-static {v2}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u06e2\u06e6\u06df"

    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc5f -> :sswitch_0
        0xdca1 -> :sswitch_a
        0x1aa724 -> :sswitch_c
        0x1aa79b -> :sswitch_b
        0x1aa7e0 -> :sswitch_3
        0x1aa7fb -> :sswitch_6
        0x1aabd8 -> :sswitch_e
        0x1ab303 -> :sswitch_10
        0x1ab31b -> :sswitch_2
        0x1ab323 -> :sswitch_f
        0x1ab642 -> :sswitch_4
        0x1ab6c4 -> :sswitch_d
        0x1ab703 -> :sswitch_1
        0x1ab9e5 -> :sswitch_9
        0x1abde4 -> :sswitch_8
        0x1ac8c8 -> :sswitch_5
        0x1ac963 -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 21

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lvs;->a:Lo00;

    iget-wide v6, v4, Lo00;->a:J

    move-object/from16 v0, p0

    iget-object v5, v0, Lvs;->b:Ll00;

    move-object/from16 v0, p0

    iget-object v10, v0, Lvs;->c:Ll00;

    move-object/from16 v0, p0

    iget-object v11, v0, Lvs;->d:Ln00;

    move-object/from16 v0, p0

    iget-object v9, v0, Lvs;->e:Landroid/app/Activity;

    move-object/from16 v0, p0

    iget-object v12, v0, Lvs;->f:Ln00;

    const-wide/16 v14, 0x11

    add-long/2addr v14, v2

    sub-long v6, v14, v6

    const-wide/16 v14, 0x11

    sub-long/2addr v6, v14

    const-wide/16 v14, 0x1f4

    cmp-long v6, v6, v14

    if-lez v6, :cond_0

    iput-wide v2, v4, Lo00;->a:J

    sget-object v2, Lkn;->a:Lkn;

    const-string v3, "VdRZ0lnOuJNS1H/vU9StnlPuQuxO/7SeWg==\n"

    const-string v4, "PrEgjTyg2fE=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x1

    invoke-static {v3, v2}, Lkn;->a(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, v5, Ll00;->a:Z

    const-string v2, "d9n+51kZTyZo1enfYBdPM2jT6uddFFI=\n"

    const-string v3, "HLyHuD91IEc=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, Lkn;->a(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, v10, Ll00;->a:Z

    const-string v2, "gyvc\n"

    const-string v3, "4kioxfidp3I=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v2, "uqtEKymdKFqjkVQaLpsnVKWhTw==\n"

    const-string v3, "0c49dEryRDU=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    invoke-static {v2, v3}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_4

    :try_start_0
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    :goto_0
    iput v2, v11, Ln00;->a:I

    sget-object v2, Lkn;->a:Lkn;

    const-string v3, "zeq0Y187R8nF7rlTRApQ1N/jqA==\n"

    const-string v4, "po/NPDZVI6A=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-static {v3, v2}, Lkn;->b(Ljava/lang/String;I)I

    move-result v2

    iput v2, v12, Ln00;->a:I

    :cond_0
    iget-boolean v2, v5, Ll00;->a:Z

    move-object/from16 v0, p0

    iget-object v3, v0, Lvs;->g:Lp00;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-object v4, v3, Lp00;->b:Ljava/lang/Object;

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    move-object/from16 v0, p0

    iget-object v13, v0, Lvs;->h:Landroid/view/ViewGroup;

    move-object/from16 v0, p0

    iget-object v14, v0, Lvs;->i:Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    iget-object v15, v0, Lvs;->k:Landroid/view/ViewGroup;

    move-object/from16 v0, p0

    iget-object v0, v0, Lvs;->p:Ll00;

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget-object v4, v0, Lvs;->r:Lp00;

    if-nez v2, :cond_8

    iget-boolean v2, v5, Ll00;->a:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v3, Lp00;->b:Ljava/lang/Object;

    iget-boolean v2, v5, Ll00;->a:Z

    move-object/from16 v0, p0

    iget-object v3, v0, Lvs;->j:Landroid/widget/FrameLayout;

    if-nez v2, :cond_6

    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    invoke-static {v2, v14}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v14, v13}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    invoke-virtual {v3, v14}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    move-object/from16 v0, p0

    iget v2, v0, Lvs;->l:I

    move-object/from16 v0, p0

    iget-object v3, v0, Lvs;->m:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v15, v13, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lvs;->n:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v13, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lvs;->o:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v15, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    move-object/from16 v0, v16

    iget-boolean v2, v0, Ll00;->a:Z

    if-eqz v2, :cond_2

    invoke-virtual {v15}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v3, v2, Landroid/view/View;

    if-eqz v3, :cond_5

    check-cast v2, Landroid/view/View;

    :goto_1
    if-eqz v2, :cond_2

    move-object/from16 v0, p0

    iget-object v3, v0, Lvs;->q:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    const/4 v2, 0x0

    iput-object v2, v4, Lp00;->b:Ljava/lang/Object;

    :cond_3
    :goto_2
    const/4 v2, 0x1

    return v2

    :catch_0
    move-exception v2

    :cond_4
    invoke-static {v9}, Lg80;->p(Landroid/app/Activity;)I

    move-result v2

    goto/16 :goto_0

    :cond_5
    const/4 v2, 0x0

    goto :goto_1

    :cond_6
    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    invoke-static {v2, v14}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v6, v2, Landroid/view/ViewGroup;

    if-eqz v6, :cond_15

    check-cast v2, Landroid/view/ViewGroup;

    :goto_3
    if-eqz v2, :cond_7

    invoke-virtual {v2, v13}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_7
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v6, -0x1

    const/4 v7, -0x2

    invoke-direct {v2, v6, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v14, v13, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v14}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_8

    invoke-virtual {v3, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_8
    iget-boolean v2, v5, Ll00;->a:Z

    if-eqz v2, :cond_3

    iget-boolean v2, v10, Ll00;->a:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-object v3, v4, Lp00;->b:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    iget-boolean v2, v10, Ll00;->a:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v4, Lp00;->b:Ljava/lang/Object;

    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    const-string v3, "awNQd2sUu6BrGUg7KRL6rWQFSDs/GPqgahgRdT4btu5xD0x+axa0qncZVX9lALOqYhNINQ0Fu6Ng\nOl1iJAKu4EkXRXQ+A4qvdxdRaA==\n"

    const-string v4, "BXY8G0t32s4=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v2, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v3, 0x20

    invoke-static {v3}, Lmp;->q(I)I

    move-result v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lvs;->s:Landroid/view/ViewGroup;

    invoke-virtual {v4}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-virtual {v4}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v3

    if-lez v3, :cond_16

    const/16 v4, 0xc

    invoke-static {v4}, Lmp;->q(I)I

    move-result v4

    add-int/lit8 v4, v4, -0x19

    add-int/2addr v3, v4

    add-int/lit8 v3, v3, 0x19

    :cond_9
    :goto_4
    const/16 v4, 0x10

    invoke-static {v4}, Lmp;->q(I)I

    move-result v4

    const/4 v5, 0x0

    const/16 v6, 0x10

    invoke-static {v6}, Lmp;->q(I)I

    move-result v6

    invoke-virtual {v2, v4, v5, v6, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    iget-boolean v3, v10, Ll00;->a:Z

    if-eqz v3, :cond_17

    const/4 v3, 0x2

    new-array v3, v3, [F

    fill-array-data v3, :array_0

    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v3

    new-instance v4, Lnh;

    const/4 v5, 0x2

    invoke-direct {v4, v5, v14}, Lnh;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v3, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide/16 v4, 0x15e

    invoke-virtual {v3, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v4, Landroid/view/animation/PathInterpolator;

    const/high16 v5, 0x3e800000    # 0.25f

    const v6, 0x3dcccccd    # 0.1f

    const/high16 v7, 0x3e800000    # 0.25f

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct {v4, v5, v6, v7, v8}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    invoke-virtual {v3, v4}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v4, Ly0;

    const/4 v5, 0x4

    invoke-direct {v4, v5, v14}, Ly0;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v3, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->start()V

    :goto_5
    invoke-virtual {v14, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v14}, Landroid/view/View;->invalidateOutline()V

    :cond_a
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    move-object/from16 v0, p0

    iget v0, v0, Lvs;->t:F

    move/from16 v17, v0

    const/16 v2, 0x1c

    if-lt v6, v2, :cond_1f

    iget-boolean v2, v10, Ll00;->a:Z

    if-eqz v2, :cond_18

    const/high16 v2, 0x41a00000    # 20.0f

    mul-float v2, v2, v17

    :goto_6
    invoke-virtual {v14, v2}, Landroid/view/View;->setElevation(F)V

    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget v2, v2, Landroid/content/res/Configuration;->uiMode:I

    xor-int/lit8 v3, v2, -0x31

    and-int/2addr v2, v3

    const/16 v3, 0x20

    if-ne v2, v3, :cond_19

    const/4 v2, 0x1

    move v5, v2

    :goto_7
    if-eqz v5, :cond_1a

    const-string v2, "X3FyFARGjGFM\n"

    const-string v3, "fEhLJDR2vFE=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_8
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-static {v14, v2}, Lc0;->C(Landroid/widget/FrameLayout;I)V

    if-eqz v5, :cond_1b

    const-string v3, "EUq7m0UgZxgC\n"

    const-string v2, "Mg+Nq3UQVyg=\n"

    :goto_9
    invoke-static {v3, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-static {v14, v2}, Lc0;->D(Landroid/widget/FrameLayout;I)V

    invoke-virtual {v14}, Landroid/view/View;->getForeground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    instance-of v3, v2, Landroid/graphics/drawable/GradientDrawable;

    if-eqz v3, :cond_1c

    check-cast v2, Landroid/graphics/drawable/GradientDrawable;

    :goto_a
    if-nez v2, :cond_b

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    if-eqz v5, :cond_1d

    const-string v3, "bGDNpzkbmhoJ\n"

    const-string v2, "T1GM4X9d3Fw=\n"

    :goto_b
    invoke-static {v3, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    invoke-static {v3}, Lmp;->q(I)I

    move-result v3

    invoke-virtual {v4, v3, v2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v14, v4}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    move-object v2, v4

    :cond_b
    iget-boolean v3, v10, Ll00;->a:Z

    if-eqz v3, :cond_1e

    const/high16 v3, 0x42c80000    # 100.0f

    mul-float v3, v3, v17

    :goto_c
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    :goto_d
    iget-boolean v4, v10, Ll00;->a:Z

    const-string v2, "N5cL\n"

    const-string v3, "VvR/txNkltw=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v2, "nbIHPPEJEQyN\n"

    const-string v3, "/91zSJ5kU20=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget v2, v2, Landroid/content/res/Configuration;->uiMode:I

    xor-int/lit8 v3, v2, -0x31

    and-int/2addr v2, v3

    const/16 v3, 0x20

    if-ne v2, v3, :cond_21

    const/4 v2, 0x1

    move v8, v2

    :goto_e
    sget-object v2, Lkn;->a:Lkn;

    const-string v3, "krOTT83H1YuNv4R39MnbmKa3hmDDyg==\n"

    const-string v5, "+dbqEKuruuo=\n"

    invoke-static {v3, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v2, 0x4b

    invoke-static {v3, v2}, Lkn;->b(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v7, v2, Landroid/util/DisplayMetrics;->density:F

    xor-int/lit8 v2, v4, -0x1

    and-int/lit8 v2, v2, 0x1

    and-int/lit8 v3, v4, -0x2

    or-int/2addr v2, v3

    add-int/lit8 v2, v2, 0x3

    add-int/lit16 v3, v8, 0x20f

    mul-int/lit8 v3, v3, 0x1f

    rsub-int/lit8 v3, v3, 0x0

    sub-int v3, v5, v3

    mul-int/lit8 v3, v3, 0x1f

    add-int/2addr v2, v3

    add-int/lit8 v18, v2, -0x3

    if-eqz v4, :cond_d

    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    instance-of v2, v3, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v2, :cond_c

    move-object v2, v3

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    const/16 v19, 0x20

    invoke-static/range {v19 .. v19}, Lmp;->q(I)I

    move-result v19

    move/from16 v0, v19

    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    const/16 v19, 0x20

    invoke-static/range {v19 .. v19}, Lmp;->q(I)I

    move-result v19

    move/from16 v0, v19

    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    const/16 v19, 0x6

    invoke-static/range {v19 .. v19}, Lmp;->q(I)I

    move-result v19

    move/from16 v0, v19

    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {v14, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_c
    const/high16 v2, 0x41b00000    # 22.0f

    mul-float/2addr v2, v7

    invoke-virtual {v14, v2}, Landroid/view/View;->setElevation(F)V

    const/16 v2, 0x1c

    if-lt v6, v2, :cond_d

    invoke-static {v9}, Lg80;->p(Landroid/app/Activity;)I

    move-result v2

    if-eqz v8, :cond_22

    const-string v2, "2yE5XPTvndrI\n"

    const-string v3, "+BIKbMTfreo=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    :goto_f
    invoke-static {v14, v2}, Lc0;->q(Landroid/widget/FrameLayout;I)V

    invoke-static {v14, v2}, Lc0;->z(Landroid/widget/FrameLayout;I)V

    :cond_d
    sget-object v2, Lg80;->r:Landroid/graphics/drawable/RippleDrawable;

    if-eqz v2, :cond_23

    sget v2, Lg80;->s:I

    move/from16 v0, v18

    if-ne v0, v2, :cond_23

    invoke-virtual {v14}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    sget-object v3, Lg80;->r:Landroid/graphics/drawable/RippleDrawable;

    if-eq v2, v3, :cond_e

    invoke-virtual {v14, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_e
    :goto_10
    invoke-virtual {v13}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lvs;->u:Landroid/graphics/drawable/ColorDrawable;

    if-eq v2, v3, :cond_f

    invoke-virtual {v13, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_f
    invoke-virtual {v15}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_10

    invoke-virtual {v15}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eq v2, v3, :cond_10

    invoke-virtual {v15, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_10
    move-object/from16 v0, v16

    iget-boolean v2, v0, Ll00;->a:Z

    if-nez v2, :cond_12

    invoke-virtual {v15}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v4, v2, Landroid/view/View;

    if-eqz v4, :cond_29

    check-cast v2, Landroid/view/View;

    :goto_11
    if-eqz v2, :cond_11

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v4

    const v5, 0x1020002

    if-eq v4, v5, :cond_11

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    if-eqz v4, :cond_11

    invoke-virtual {v2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    if-eqz v4, :cond_11

    invoke-virtual {v2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    if-eq v4, v3, :cond_11

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_11
    const/4 v2, 0x1

    move-object/from16 v0, v16

    iput-boolean v2, v0, Ll00;->a:Z

    :cond_12
    invoke-virtual {v13}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-lez v2, :cond_3

    iget-boolean v2, v10, Ll00;->a:Z

    move-object/from16 v0, p0

    iget-object v3, v0, Lvs;->v:Landroid/view/View;

    if-eqz v2, :cond_2e

    const/4 v2, 0x0

    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v3}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_2a

    instance-of v4, v2, Landroid/graphics/drawable/GradientDrawable;

    if-eqz v4, :cond_13

    check-cast v2, Landroid/graphics/drawable/GradientDrawable;

    iget v4, v11, Ln00;->a:I

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    :cond_13
    :goto_12
    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    iget v4, v12, Ln00;->a:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    iget v2, v12, Ln00;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-virtual {v13, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    iget v4, v12, Ln00;->a:I

    const/4 v5, 0x1

    if-eq v4, v5, :cond_2c

    const/4 v5, 0x2

    if-eq v4, v5, :cond_2b

    const/high16 v4, 0x3e800000    # 0.25f

    invoke-virtual {v3, v4}, Landroid/view/View;->setAlpha(F)V

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    const v6, 0x3f19999a    # 0.6f

    mul-float/2addr v5, v6

    float-to-int v5, v5

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const v6, 0x3f333333    # 0.7f

    mul-float/2addr v2, v6

    float-to-int v2, v2

    invoke-direct {v4, v5, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v2, 0x10

    iput v2, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_14
    :goto_13
    invoke-virtual {v13}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    const/4 v2, 0x0

    :goto_14
    if-ge v2, v4, :cond_3

    invoke-virtual {v13, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->isSelected()Z

    move-result v6

    if-eqz v6, :cond_2d

    invoke-virtual {v5}, Landroid/view/View;->getX()F

    move-result v2

    const/4 v4, 0x0

    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    move-result v5

    add-int/lit8 v5, v5, 0x9

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    sub-int v3, v5, v3

    add-int/lit8 v3, v3, -0x9

    int-to-float v3, v3

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v3, v5

    sub-float v3, v4, v3

    sub-float/2addr v2, v3

    move-object/from16 v0, p0

    iget-object v3, v0, Lvs;->w:Lo40;

    iget-object v4, v3, Lo40;->k:Lp40;

    iget-wide v4, v4, Lp40;->i:D

    double-to-float v4, v4

    const/high16 v5, 0x41b80000    # 23.0f

    sub-float/2addr v4, v5

    sub-float/2addr v4, v2

    const/high16 v5, 0x41b80000    # 23.0f

    add-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    const/high16 v5, 0x3f800000    # 1.0f

    cmpl-float v4, v4, v5

    if-lez v4, :cond_3

    invoke-virtual {v3, v2}, Lo40;->b(F)V

    goto/16 :goto_2

    :cond_15
    const/4 v2, 0x0

    goto/16 :goto_3

    :cond_16
    const/16 v3, 0x20

    invoke-static {v3}, Lmp;->q(I)I

    move-result v3

    goto/16 :goto_4

    :cond_17
    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v14, v3}, Landroid/view/View;->setAlpha(F)V

    const/4 v3, 0x0

    invoke-virtual {v14, v3}, Landroid/view/View;->setTranslationY(F)V

    goto/16 :goto_5

    :cond_18
    const/4 v2, 0x0

    goto/16 :goto_6

    :cond_19
    const/4 v2, 0x0

    move v5, v2

    goto/16 :goto_7

    :cond_1a
    const-string v2, "7R7L6yTM63D+\n"

    const-string v3, "zi6K2xT820A=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_8

    :cond_1b
    const-string v3, "EENHpautGjcD\n"

    const-string v2, "M3FxlZudKgc=\n"

    goto/16 :goto_9

    :cond_1c
    const/4 v2, 0x0

    goto/16 :goto_a

    :cond_1d
    const-string v3, "F+pV+mdThtJy\n"

    const-string v2, "NNlmvCEVwJQ=\n"

    goto/16 :goto_b

    :cond_1e
    const/4 v3, 0x0

    goto/16 :goto_c

    :cond_1f
    iget-boolean v2, v10, Ll00;->a:Z

    if-eqz v2, :cond_20

    const/high16 v2, 0x41800000    # 16.0f

    mul-float v2, v2, v17

    :goto_15
    invoke-virtual {v14, v2}, Landroid/view/View;->setElevation(F)V

    goto/16 :goto_d

    :cond_20
    const/4 v2, 0x0

    goto :goto_15

    :cond_21
    const/4 v2, 0x0

    move v8, v2

    goto/16 :goto_e

    :cond_22
    const/high16 v3, 0x3f000000    # 0.5f

    const/16 v6, 0x28

    invoke-static {v3, v2, v6}, Lg80;->y(FII)I

    move-result v2

    goto/16 :goto_f

    :cond_23
    mul-int/lit16 v2, v5, 0xff

    div-int/lit8 v5, v2, 0x64

    if-eqz v8, :cond_24

    const-string v2, "Scf+rRD0jg==\n"

    const-string v3, "ava9nFPFy8Q=\n"

    :goto_16
    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    if-nez v4, :cond_25

    const/4 v2, 0x0

    move v9, v2

    :goto_17
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    sget-object v2, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    const/4 v6, 0x2

    new-array v6, v6, [I

    const/4 v7, 0x0

    const/high16 v19, 0x3f800000    # 1.0f

    move/from16 v0, v19

    invoke-static {v0, v3, v5}, Lg80;->y(FII)I

    move-result v19

    aput v19, v6, v7

    const/4 v7, 0x1

    const v19, 0x3f75c28f    # 0.96f

    move/from16 v0, v19

    invoke-static {v0, v3, v5}, Lg80;->y(FII)I

    move-result v3

    aput v3, v6, v7

    invoke-direct {v4, v2, v6}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    invoke-virtual {v4, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v5, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    const/4 v2, 0x1

    invoke-static {v2}, Lmp;->q(I)I

    move-result v6

    if-eqz v8, :cond_26

    const-string v3, "6zREJzUfNUeO\n"

    const-string v2, "yAUFYXNZcwE=\n"

    :goto_18
    invoke-static {v3, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v5, v6, v2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    sget-object v6, Landroid/graphics/drawable/GradientDrawable$Orientation;->TL_BR:Landroid/graphics/drawable/GradientDrawable$Orientation;

    if-eqz v8, :cond_27

    const-string v3, "TDRuHsuk8/8p\n"

    const-string v2, "bwAqWI3itbk=\n"

    :goto_19
    invoke-static {v3, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    const/4 v7, 0x4

    new-array v7, v7, [I

    const/16 v19, 0x0

    aput v2, v7, v19

    const/4 v2, 0x1

    const/16 v19, 0x0

    aput v19, v7, v2

    const/4 v2, 0x2

    const/16 v19, 0x0

    aput v19, v7, v2

    const/4 v2, 0x3

    const-string v19, "Qvc5U+r5065R\n"

    const-string v20, "YccMY9rJ454=\n"

    invoke-static/range {v19 .. v20}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v19

    aput v19, v7, v2

    invoke-direct {v3, v6, v7}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    invoke-virtual {v3, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    const/4 v2, 0x1

    invoke-static {v2}, Lmp;->q(I)I

    move-result v2

    const/4 v6, 0x1

    invoke-static {v6}, Lmp;->q(I)I

    move-result v6

    const/4 v7, 0x1

    invoke-static {v7}, Lmp;->q(I)I

    move-result v7

    const/16 v19, 0x1

    invoke-static/range {v19 .. v19}, Lmp;->q(I)I

    move-result v19

    move/from16 v0, v19

    invoke-static {v3, v2, v6, v7, v0}, Lf0;->j(Landroid/graphics/drawable/GradientDrawable;IIII)V

    new-instance v2, Landroid/graphics/drawable/LayerDrawable;

    const/4 v6, 0x3

    new-array v6, v6, [Landroid/graphics/drawable/GradientDrawable;

    const/4 v7, 0x0

    aput-object v4, v6, v7

    const/4 v4, 0x1

    aput-object v5, v6, v4

    const/4 v4, 0x2

    aput-object v3, v6, v4

    invoke-direct {v2, v6}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v3, -0x1

    invoke-virtual {v5, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v5, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    if-eqz v8, :cond_28

    const-string v4, "NbMssxMhJdlQ\n"

    const-string v3, "FoIe9VVnY58=\n"

    :goto_1a
    invoke-static {v4, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    new-instance v4, Landroid/graphics/drawable/RippleDrawable;

    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    invoke-direct {v4, v3, v2, v5}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    sput-object v4, Lg80;->r:Landroid/graphics/drawable/RippleDrawable;

    sput v18, Lg80;->s:I

    invoke-virtual {v14, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v2, 0x1

    invoke-virtual {v14, v2}, Landroid/view/View;->setClipToOutline(Z)V

    goto/16 :goto_10

    :cond_24
    const-string v2, "5SCE6yEDHw==\n"

    const-string v3, "xmbHrWJFW8E=\n"

    goto/16 :goto_16

    :cond_25
    const/high16 v2, 0x42c80000    # 100.0f

    mul-float/2addr v2, v7

    move v9, v2

    goto/16 :goto_17

    :cond_26
    const-string v3, "gIT4eDMblF/l\n"

    const-string v2, "o7fLPnVd0hk=\n"

    goto/16 :goto_18

    :cond_27
    const-string v3, "BidRbfej9lpj\n"

    const-string v2, "JWViK7HlsBw=\n"

    goto/16 :goto_19

    :cond_28
    const-string v4, "0puIUgwxoYDB\n"

    const-string v3, "8auwYjwBkbA=\n"

    goto :goto_1a

    :cond_29
    const/4 v2, 0x0

    goto/16 :goto_11

    :cond_2a
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget v4, v11, Ln00;->a:I

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v4, 0x42c80000    # 100.0f

    mul-float v4, v4, v17

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v3, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_12

    :cond_2b
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    const v5, 0x3eb33333    # 0.35f

    mul-float/2addr v2, v5

    float-to-int v2, v2

    const/4 v5, 0x4

    invoke-static {v5}, Lmp;->q(I)I

    move-result v5

    invoke-direct {v4, v2, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v2, 0x50

    iput v2, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    const/4 v2, 0x6

    invoke-static {v2}, Lmp;->q(I)I

    move-result v2

    iput v2, v4, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_13

    :cond_2c
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v4, 0x6

    invoke-static {v4}, Lmp;->q(I)I

    move-result v4

    const/4 v5, 0x6

    invoke-static {v5}, Lmp;->q(I)I

    move-result v5

    invoke-direct {v2, v4, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v4, 0x50

    iput v4, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    const/16 v4, 0x8

    invoke-static {v4}, Lmp;->q(I)I

    move-result v4

    iput v4, v2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v3, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_13

    :cond_2d
    add-int/lit8 v2, v2, 0x11

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v2, v2, -0x11

    goto/16 :goto_14

    :cond_2e
    const/16 v2, 0x8

    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_2

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
