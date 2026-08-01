.class public final synthetic Lps;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final a:Lh00;

.field public final b:Le00;

.field public final c:Le00;

.field public final d:Lg00;

.field public final e:Landroid/app/Activity;

.field public final f:Lg00;

.field public final g:Li00;

.field public final h:Landroid/view/ViewGroup;

.field public final i:Landroid/widget/FrameLayout;

.field public final j:Landroid/widget/FrameLayout;

.field public final k:Landroid/view/ViewGroup;

.field public final l:I

.field public final m:Landroid/view/ViewGroup$LayoutParams;

.field public final n:Landroid/graphics/drawable/Drawable;

.field public final o:Landroid/graphics/drawable/Drawable;

.field public final p:Le00;

.field public final q:Landroid/graphics/drawable/Drawable;

.field public final r:Li00;

.field public final s:Landroid/view/ViewGroup;

.field public final t:F

.field public final u:Landroid/graphics/drawable/ColorDrawable;

.field public final v:Landroid/view/View;

.field public final w:Lh40;


# direct methods
.method public synthetic constructor <init>(Lh00;Le00;Le00;Lg00;Landroid/app/Activity;Lg00;Li00;Landroid/view/ViewGroup;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/view/ViewGroup;ILandroid/view/ViewGroup$LayoutParams;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Le00;Landroid/graphics/drawable/Drawable;Li00;Landroid/view/ViewGroup;FLandroid/graphics/drawable/ColorDrawable;Landroid/view/View;Lk9;Lh40;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    const-string v1, "\u06e4\u06e4\u06df"

    invoke-static {v1}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move-object/from16 v0, p17

    iput-object v0, p0, Lps;->q:Landroid/graphics/drawable/Drawable;

    move-object/from16 v0, p18

    iput-object v0, p0, Lps;->r:Li00;

    sget v1, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    if-ltz v1, :cond_6

    const-string v1, "\u06e6\u06e8"

    invoke-static {v1}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    move-object/from16 v0, p13

    iput-object v0, p0, Lps;->m:Landroid/view/ViewGroup$LayoutParams;

    move-object/from16 v0, p14

    iput-object v0, p0, Lps;->n:Landroid/graphics/drawable/Drawable;

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    move-result v1

    if-gtz v1, :cond_0

    const/16 v1, 0x53

    sput v1, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    const-string v1, "\u06e8\u06e6\u06e8"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    sget v1, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v3, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    xor-int/2addr v1, v3

    const v3, 0x1ab3aa

    add-int/2addr v1, v3

    goto :goto_0

    :sswitch_2
    iput-object p11, p0, Lps;->k:Landroid/view/ViewGroup;

    move/from16 v0, p12

    iput v0, p0, Lps;->l:I

    sget v1, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v3, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    add-int/lit16 v3, v3, -0x12b7

    div-int/2addr v1, v3

    if-eqz v1, :cond_1

    const-string v1, "\u06e2\u06e7\u06e0"

    invoke-static {v1}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e2\u06e0\u06e6"

    goto :goto_1

    :sswitch_3
    iput-object p5, p0, Lps;->e:Landroid/app/Activity;

    iput-object p6, p0, Lps;->f:Lg00;

    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v3, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    div-int/lit16 v3, v3, 0x2434

    add-int/2addr v1, v3

    if-ltz v1, :cond_2

    const/16 v1, 0x49

    sput v1, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    const-string v1, "\u06e4\u06e4\u06df"

    :goto_2
    invoke-static {v1}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v3, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    xor-int/2addr v1, v3

    const v3, -0x1ac7ae

    xor-int/2addr v1, v3

    goto :goto_0

    :sswitch_4
    iput-object p9, p0, Lps;->i:Landroid/widget/FrameLayout;

    iput-object p10, p0, Lps;->j:Landroid/widget/FrameLayout;

    const-string v1, "\u06e6\u06e8"

    :goto_3
    invoke-static {v1}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_5
    const-string v1, "8zkG1ZNXExgCzcIsfADBnTxxW"

    invoke-static {v1}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟۠۠ۦۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    sget v1, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    if-gtz v1, :cond_3

    const-string v1, "\u06e6\u06e1\u06e5"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_3
    sget v1, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v3, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    xor-int/2addr v1, v3

    const v3, -0x1ab266

    xor-int/2addr v1, v3

    goto/16 :goto_0

    :sswitch_6
    move-object/from16 v0, p24

    iput-object v0, p0, Lps;->w:Lh40;

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    move-result v1

    if-gtz v1, :cond_a

    sget v1, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    add-int/lit16 v3, v3, -0x134b

    mul-int/2addr v1, v3

    if-gtz v1, :cond_4

    const/4 v1, 0x2

    sput v1, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    const-string v1, "\u06e0\u06e2\u06e5"

    invoke-static {v1}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_4
    const-string v1, "\u06e0\u06e2\u06e5"

    goto :goto_3

    :sswitch_7
    move-object/from16 v0, p15

    iput-object v0, p0, Lps;->o:Landroid/graphics/drawable/Drawable;

    move-object/from16 v0, p16

    iput-object v0, p0, Lps;->p:Le00;

    sget v1, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v3, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    rem-int/lit16 v3, v3, 0x226d

    xor-int/2addr v1, v3

    if-gtz v1, :cond_5

    const/16 v1, 0x29

    sput v1, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    :cond_5
    const-string v1, "\u06e0\u06e7"

    :goto_4
    invoke-static {v1}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_8
    iput-object p7, p0, Lps;->g:Li00;

    iput-object p8, p0, Lps;->h:Landroid/view/ViewGroup;

    sget v1, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v3, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    or-int/2addr v1, v3

    const v3, 0x1aab8d

    add-int/2addr v1, v3

    goto/16 :goto_0

    :sswitch_9
    iput-object p3, p0, Lps;->c:Le00;

    iput-object p4, p0, Lps;->d:Lg00;

    sget v1, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v3, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    or-int/2addr v1, v3

    const v3, 0x1aa951

    xor-int/2addr v1, v3

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06e4\u06e8\u06e2"

    invoke-static {v1}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_a
    iput-object p1, p0, Lps;->a:Lh00;

    iput-object p2, p0, Lps;->b:Le00;

    sget v1, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v3, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    or-int/lit16 v3, v3, 0xef9

    div-int/2addr v1, v3

    if-eqz v1, :cond_7

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    const-string v1, "\u06e7\u06e1\u06e6"

    invoke-static {v1}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u06e2\u06e1\u06e4"

    goto/16 :goto_2

    :sswitch_b
    move-object/from16 v0, p21

    iput-object v0, p0, Lps;->u:Landroid/graphics/drawable/ColorDrawable;

    move-object/from16 v0, p22

    iput-object v0, p0, Lps;->v:Landroid/view/View;

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    move-result v1

    if-gtz v1, :cond_8

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    const-string v1, "\u06e2\u06e1\u06e4"

    invoke-static {v1}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_8
    sget v1, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v3, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sub-int/2addr v1, v3

    const v3, 0x1ac2c1

    add-int/2addr v1, v3

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v0, p19

    iput-object v0, p0, Lps;->s:Landroid/view/ViewGroup;

    move/from16 v0, p20

    iput v0, p0, Lps;->t:F

    sget v1, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v3, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    xor-int/lit16 v3, v3, 0x1e75

    sub-int/2addr v1, v3

    if-gtz v1, :cond_9

    const/16 v1, 0xd

    sput v1, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    const-string v1, "\u06e2\u06e0\u06e6"

    :goto_5
    invoke-static {v1}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_9
    const-string v1, "\u06e5\u06e0\u06e4"

    goto/16 :goto_4

    :cond_a
    :sswitch_d
    sget v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    if-gtz v1, :cond_b

    invoke-static {}, Landroidx/appcompat/app/ۥۦۣ۠;->ۨۤ۠ۨ()I

    const-string v1, "\u06e6\u06e5\u06e4"

    goto/16 :goto_3

    :cond_b
    sget v1, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v3, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    rem-int/2addr v1, v3

    const v3, 0x1ab246

    xor-int/2addr v1, v3

    goto/16 :goto_0

    :sswitch_e
    sget v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v3, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    div-int/2addr v1, v3

    const v3, 0x1aba5b

    xor-int/2addr v1, v3

    goto/16 :goto_0

    :sswitch_f
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(F)V

    sget v1, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v3, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    or-int/lit16 v3, v3, 0x2489

    add-int/2addr v1, v3

    if-gtz v1, :cond_c

    const/4 v1, 0x7

    sput v1, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    const-string v1, "\u06e0\u06e7\u06e3"

    invoke-static {v1}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_c
    const-string v1, "\u06e2\u06e7\u06df"

    goto :goto_5

    :sswitch_10
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc07 -> :sswitch_0
        0xdcc2 -> :sswitch_2
        0x1aab23 -> :sswitch_5
        0x1aab64 -> :sswitch_4
        0x1aabbc -> :sswitch_3
        0x1ab245 -> :sswitch_f
        0x1ab268 -> :sswitch_1
        0x1ab285 -> :sswitch_9
        0x1ab33a -> :sswitch_10
        0x1ab33b -> :sswitch_7
        0x1aba5f -> :sswitch_a
        0x1abade -> :sswitch_c
        0x1abda9 -> :sswitch_b
        0x1ac18a -> :sswitch_6
        0x1ac54c -> :sswitch_e
        0x1ac56a -> :sswitch_8
        0x1ac9aa -> :sswitch_d
    .end sparse-switch
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 21

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lps;->a:Lh00;

    iget-wide v6, v4, Lh00;->a:J

    move-object/from16 v0, p0

    iget-object v5, v0, Lps;->b:Le00;

    move-object/from16 v0, p0

    iget-object v10, v0, Lps;->c:Le00;

    move-object/from16 v0, p0

    iget-object v11, v0, Lps;->d:Lg00;

    move-object/from16 v0, p0

    iget-object v9, v0, Lps;->e:Landroid/app/Activity;

    move-object/from16 v0, p0

    iget-object v12, v0, Lps;->f:Lg00;

    const-wide/16 v14, 0x9

    sub-long v14, v2, v14

    sub-long v6, v14, v6

    const-wide/16 v14, 0x9

    add-long/2addr v6, v14

    const-wide/16 v14, 0x1f4

    cmp-long v6, v6, v14

    if-lez v6, :cond_0

    iput-wide v2, v4, Lh00;->a:J

    sget-object v2, Lgn;->a:Lgn;

    const-string v3, "iFSXjKqQlluPVLGxoIqDVo5ujLK9oZpWhw==\n"

    const-string v4, "4zHu08/+9zk=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x1

    invoke-static {v3, v2}, Lgn;->a(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, v5, Le00;->a:Z

    const-string v2, "CNkzyqkHYAgX1STykAlgHRfTJ8qtCn0=\n"

    const-string v3, "Y7xKlc9rD2k=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, Lgn;->a(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, v10, Le00;->a:Z

    const-string v2, "Qpul\n"

    const-string v3, "I/jR4AxJDmc=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v2, "JOrNZ+Wfc2U90N1W4pl8azvgxg==\n"

    const-string v3, "T4+0OIbwHwo=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    invoke-static {v2, v3}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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
    iput v2, v11, Lg00;->a:I

    sget-object v2, Lgn;->a:Lgn;

    const-string v3, "8Kn1BKQet+H4rfg0vy+g/OKg6Q==\n"

    const-string v4, "m8yMW81w04g=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-static {v3, v2}, Lgn;->b(Ljava/lang/String;I)I

    move-result v2

    iput v2, v12, Lg00;->a:I

    :cond_0
    iget-boolean v2, v5, Le00;->a:Z

    move-object/from16 v0, p0

    iget-object v3, v0, Lps;->g:Li00;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-object v4, v3, Li00;->b:Ljava/lang/Object;

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    move-object/from16 v0, p0

    iget-object v13, v0, Lps;->h:Landroid/view/ViewGroup;

    move-object/from16 v0, p0

    iget-object v14, v0, Lps;->i:Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    iget-object v15, v0, Lps;->k:Landroid/view/ViewGroup;

    move-object/from16 v0, p0

    iget-object v0, v0, Lps;->p:Le00;

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget-object v4, v0, Lps;->r:Li00;

    if-nez v2, :cond_8

    iget-boolean v2, v5, Le00;->a:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v3, Li00;->b:Ljava/lang/Object;

    iget-boolean v2, v5, Le00;->a:Z

    move-object/from16 v0, p0

    iget-object v3, v0, Lps;->j:Landroid/widget/FrameLayout;

    if-nez v2, :cond_6

    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    invoke-static {v2, v14}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v14, v13}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    invoke-virtual {v3, v14}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    move-object/from16 v0, p0

    iget v2, v0, Lps;->l:I

    move-object/from16 v0, p0

    iget-object v3, v0, Lps;->m:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v15, v13, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lps;->n:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v13, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lps;->o:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v15, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    move-object/from16 v0, v16

    iget-boolean v2, v0, Le00;->a:Z

    if-eqz v2, :cond_2

    invoke-virtual {v15}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v3, v2, Landroid/view/View;

    if-eqz v3, :cond_5

    check-cast v2, Landroid/view/View;

    :goto_1
    if-eqz v2, :cond_2

    move-object/from16 v0, p0

    iget-object v3, v0, Lps;->q:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    const/4 v2, 0x0

    iput-object v2, v4, Li00;->b:Ljava/lang/Object;

    :cond_3
    :goto_2
    const/4 v2, 0x1

    return v2

    :catch_0
    move-exception v2

    :cond_4
    invoke-static {v9}, La80;->n(Landroid/app/Activity;)I

    move-result v2

    goto/16 :goto_0

    :cond_5
    const/4 v2, 0x0

    goto :goto_1

    :cond_6
    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    invoke-static {v2, v14}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-boolean v2, v5, Le00;->a:Z

    if-eqz v2, :cond_3

    iget-boolean v2, v10, Le00;->a:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-object v3, v4, Li00;->b:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    iget-boolean v2, v10, Le00;->a:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v4, Li00;->b:Ljava/lang/Object;

    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    const-string v3, "pqsJ3KcCMg6msRGQ5QRzA6mtEZDzDnMOp7BI3vINP0C8pxXVpwA9BLqxDNSpFjoEr7sRnsETMg2t\nkgTJ6BQnToS/HN/yFQMBur8Iww==\n"

    const-string v4, "yN5lsIdhU2A=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v2, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v3, 0x20

    invoke-static {v3}, Lff;->q(I)I

    move-result v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lps;->s:Landroid/view/ViewGroup;

    invoke-virtual {v4}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-virtual {v4}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v3

    if-lez v3, :cond_16

    const/16 v4, 0xc

    invoke-static {v4}, Lff;->q(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x1d

    add-int/2addr v3, v4

    add-int/lit8 v3, v3, -0x1d

    :cond_9
    :goto_4
    const/16 v4, 0x10

    invoke-static {v4}, Lff;->q(I)I

    move-result v4

    const/4 v5, 0x0

    const/16 v6, 0x10

    invoke-static {v6}, Lff;->q(I)I

    move-result v6

    invoke-virtual {v2, v4, v5, v6, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    iget-boolean v3, v10, Le00;->a:Z

    if-eqz v3, :cond_17

    const/4 v3, 0x2

    new-array v3, v3, [F

    fill-array-data v3, :array_0

    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v3

    new-instance v4, Llh;

    const/4 v5, 0x2

    invoke-direct {v4, v5, v14}, Llh;-><init>(ILjava/lang/Object;)V

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

    iget v0, v0, Lps;->t:F

    move/from16 v17, v0

    const/16 v2, 0x1c

    if-lt v6, v2, :cond_1f

    iget-boolean v2, v10, Le00;->a:Z

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

    const-string v2, "0yyR1D2Y2d7A\n"

    const-string v3, "8BWo5A2o6e4=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_8
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-static {v14, v2}, Lc0;->C(Landroid/widget/FrameLayout;I)V

    if-eqz v5, :cond_1b

    const-string v3, "pOUUqrKfelC3\n"

    const-string v2, "h6AimoKvSmA=\n"

    :goto_9
    invoke-static {v3, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    const-string v3, "SV4A0RJ6lDAs\n"

    const-string v2, "am9Bl1Q80nY=\n"

    :goto_b
    invoke-static {v3, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    invoke-static {v3}, Lff;->q(I)I

    move-result v3

    invoke-virtual {v4, v3, v2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {v14, v4}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    move-object v2, v4

    :cond_b
    iget-boolean v3, v10, Le00;->a:Z

    if-eqz v3, :cond_1e

    const/high16 v3, 0x42c80000    # 100.0f

    mul-float v3, v3, v17

    :goto_c
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    :goto_d
    iget-boolean v4, v10, Le00;->a:Z

    const-string v2, "HPYJ\n"

    const-string v3, "fZV92gblFdk=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v2, "jd5lEGZC9iKd\n"

    const-string v3, "77ERZAkvtEM=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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
    sget-object v2, Lgn;->a:Lgn;

    const-string v3, "+d7EEYnOXB7m0tMpsMBSDc3a0T6Hww==\n"

    const-string v5, "kru9Tu+iM38=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v2, 0x4b

    invoke-static {v3, v2}, Lgn;->b(Ljava/lang/String;I)I

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

    add-int/lit8 v2, v2, 0x15

    rsub-int/lit8 v3, v8, 0x0

    rsub-int v3, v3, 0x20f

    mul-int/lit8 v3, v3, 0x1f

    rsub-int/lit8 v3, v3, 0x0

    sub-int v3, v5, v3

    mul-int/lit8 v3, v3, 0x1f

    add-int/2addr v2, v3

    add-int/lit8 v18, v2, -0x15

    if-eqz v4, :cond_d

    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    instance-of v2, v3, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v2, :cond_c

    move-object v2, v3

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    const/16 v19, 0x20

    invoke-static/range {v19 .. v19}, Lff;->q(I)I

    move-result v19

    move/from16 v0, v19

    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    const/16 v19, 0x20

    invoke-static/range {v19 .. v19}, Lff;->q(I)I

    move-result v19

    move/from16 v0, v19

    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    const/16 v19, 0x6

    invoke-static/range {v19 .. v19}, Lff;->q(I)I

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

    invoke-static {v9}, La80;->n(Landroid/app/Activity;)I

    move-result v2

    if-eqz v8, :cond_22

    const-string v2, "nSQxKo2JeGqO\n"

    const-string v3, "vhcCGr25SFo=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    :goto_f
    invoke-static {v14, v2}, Lc0;->q(Landroid/widget/FrameLayout;I)V

    invoke-static {v14, v2}, Lc0;->z(Landroid/widget/FrameLayout;I)V

    :cond_d
    sget-object v2, La80;->r:Landroid/graphics/drawable/RippleDrawable;

    if-eqz v2, :cond_23

    sget v2, La80;->s:I

    move/from16 v0, v18

    if-ne v0, v2, :cond_23

    invoke-virtual {v14}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    sget-object v3, La80;->r:Landroid/graphics/drawable/RippleDrawable;

    if-eq v2, v3, :cond_e

    invoke-virtual {v14, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_e
    :goto_10
    invoke-virtual {v13}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lps;->u:Landroid/graphics/drawable/ColorDrawable;

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

    iget-boolean v2, v0, Le00;->a:Z

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

    iput-boolean v2, v0, Le00;->a:Z

    :cond_12
    invoke-virtual {v13}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-lez v2, :cond_3

    iget-boolean v2, v10, Le00;->a:Z

    move-object/from16 v0, p0

    iget-object v3, v0, Lps;->v:Landroid/view/View;

    if-eqz v2, :cond_2e

    const/4 v2, 0x0

    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v3}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_2a

    instance-of v4, v2, Landroid/graphics/drawable/GradientDrawable;

    if-eqz v4, :cond_13

    check-cast v2, Landroid/graphics/drawable/GradientDrawable;

    iget v4, v11, Lg00;->a:I

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    :cond_13
    :goto_12
    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    iget v4, v12, Lg00;->a:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    iget v2, v12, Lg00;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-virtual {v13, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    iget v4, v12, Lg00;->a:I

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

    add-int/lit8 v5, v5, 0x1b

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    sub-int v3, v5, v3

    add-int/lit8 v3, v3, -0x1b

    int-to-float v3, v3

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v3, v5

    sub-float v3, v4, v3

    sub-float/2addr v2, v3

    move-object/from16 v0, p0

    iget-object v3, v0, Lps;->w:Lh40;

    iget-object v4, v3, Lh40;->j:Li40;

    iget-wide v4, v4, Li40;->i:D

    double-to-float v4, v4

    const/high16 v5, 0x42000000    # 32.0f

    add-float/2addr v4, v5

    sub-float/2addr v4, v2

    const/high16 v5, 0x42000000    # 32.0f

    sub-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    const/high16 v5, 0x3f800000    # 1.0f

    cmpl-float v4, v4, v5

    if-lez v4, :cond_3

    invoke-virtual {v3, v2}, Lh40;->b(F)V

    goto/16 :goto_2

    :cond_15
    const/4 v2, 0x0

    goto/16 :goto_3

    :cond_16
    const/16 v3, 0x20

    invoke-static {v3}, Lff;->q(I)I

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
    const-string v2, "GHs1FAGABf8L\n"

    const-string v3, "O0t0JDGwNc8=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_8

    :cond_1b
    const-string v3, "QkB6UHs5MydR\n"

    const-string v2, "YXJMYEsJAxc=\n"

    goto/16 :goto_9

    :cond_1c
    const/4 v2, 0x0

    goto/16 :goto_a

    :cond_1d
    const-string v3, "uHPhuoyH0urd\n"

    const-string v2, "m0DS/MrBlKw=\n"

    goto/16 :goto_b

    :cond_1e
    const/4 v3, 0x0

    goto/16 :goto_c

    :cond_1f
    iget-boolean v2, v10, Le00;->a:Z

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

    invoke-static {v3, v2, v6}, La80;->t(FII)I

    move-result v2

    goto/16 :goto_f

    :cond_23
    mul-int/lit16 v2, v5, 0xff

    div-int/lit8 v5, v2, 0x64

    if-eqz v8, :cond_24

    const-string v2, "eRjj0kHl/w==\n"

    const-string v3, "Wimg4wLUunE=\n"

    :goto_16
    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    invoke-static {v0, v3, v5}, La80;->t(FII)I

    move-result v19

    aput v19, v6, v7

    const/4 v7, 0x1

    const v19, 0x3f75c28f    # 0.96f

    move/from16 v0, v19

    invoke-static {v0, v3, v5}, La80;->t(FII)I

    move-result v3

    aput v3, v6, v7

    invoke-direct {v4, v2, v6}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    invoke-virtual {v4, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v5, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    const/4 v2, 0x1

    invoke-static {v2}, Lff;->q(I)I

    move-result v6

    if-eqz v8, :cond_26

    const-string v2, "M/fH8BBG1mdW\n"

    const-string v3, "EMaGtlYAkCE=\n"

    :goto_18
    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v5, v6, v2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    sget-object v6, Landroid/graphics/drawable/GradientDrawable$Orientation;->TL_BR:Landroid/graphics/drawable/GradientDrawable$Orientation;

    if-eqz v8, :cond_27

    const-string v2, "BD8Y7tWIdtxh\n"

    const-string v3, "JwtcqJPOMJo=\n"

    :goto_19
    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    const-string v19, "op7l0bLXDhux\n"

    const-string v20, "ga7Q4YLnPis=\n"

    invoke-static/range {v19 .. v20}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v19

    aput v19, v7, v2

    invoke-direct {v3, v6, v7}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    invoke-virtual {v3, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    const/4 v2, 0x1

    invoke-static {v2}, Lff;->q(I)I

    move-result v2

    const/4 v6, 0x1

    invoke-static {v6}, Lff;->q(I)I

    move-result v6

    const/4 v7, 0x1

    invoke-static {v7}, Lff;->q(I)I

    move-result v7

    const/16 v19, 0x1

    invoke-static/range {v19 .. v19}, Lff;->q(I)I

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

    const-string v4, "4SgwxvsWa2+E\n"

    const-string v3, "whkCgL1QLSk=\n"

    :goto_1a
    invoke-static {v4, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    new-instance v4, Landroid/graphics/drawable/RippleDrawable;

    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    invoke-direct {v4, v3, v2, v5}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    sput-object v4, La80;->r:Landroid/graphics/drawable/RippleDrawable;

    sput v18, La80;->s:I

    invoke-virtual {v14, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v2, 0x1

    invoke-virtual {v14, v2}, Landroid/view/View;->setClipToOutline(Z)V

    goto/16 :goto_10

    :cond_24
    const-string v2, "W5h3bYpsAg==\n"

    const-string v3, "eN40K8kqRvo=\n"

    goto/16 :goto_16

    :cond_25
    const/high16 v2, 0x42c80000    # 100.0f

    mul-float/2addr v2, v7

    move v9, v2

    goto/16 :goto_17

    :cond_26
    const-string v2, "KmVBPcV1zjhP\n"

    const-string v3, "CVZye4MziH4=\n"

    goto/16 :goto_18

    :cond_27
    const-string v2, "o5MRXwAO7nzG\n"

    const-string v3, "gNEiGUZIqDo=\n"

    goto/16 :goto_19

    :cond_28
    const-string v4, "Lu0FSZK8E/o9\n"

    const-string v3, "Dd09eaKMI8o=\n"

    goto :goto_1a

    :cond_29
    const/4 v2, 0x0

    goto/16 :goto_11

    :cond_2a
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget v4, v11, Lg00;->a:I

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

    invoke-static {v5}, Lff;->q(I)I

    move-result v5

    invoke-direct {v4, v2, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v2, 0x50

    iput v2, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    const/4 v2, 0x6

    invoke-static {v2}, Lff;->q(I)I

    move-result v2

    iput v2, v4, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_13

    :cond_2c
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v4, 0x6

    invoke-static {v4}, Lff;->q(I)I

    move-result v4

    const/4 v5, 0x6

    invoke-static {v5}, Lff;->q(I)I

    move-result v5

    invoke-direct {v2, v4, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v4, 0x50

    iput v4, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    const/16 v4, 0x8

    invoke-static {v4}, Lff;->q(I)I

    move-result v4

    iput v4, v2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v3, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_13

    :cond_2d
    add-int/lit8 v2, v2, -0x1a

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v2, v2, 0x1a

    goto/16 :goto_14

    :cond_2e
    const/16 v2, 0x8

    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_2

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
