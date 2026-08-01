.class public final synthetic Lw20;
.super Ljava/lang/Object;

# interfaces
.implements Lhm;


# instance fields
.field public final a:I

.field public final b:Landroid/app/Activity;

.field public final c:[Ljava/lang/String;

.field public final d:I

.field public final e:Lon;

.field public final f:Landroid/app/Dialog;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;[Ljava/lang/String;ILon;Landroid/app/Dialog;I)V
    .locals 3

    iput p6, p0, Lw20;->a:I

    iput-object p1, p0, Lw20;->b:Landroid/app/Activity;

    iput-object p2, p0, Lw20;->c:[Ljava/lang/String;

    iput p3, p0, Lw20;->d:I

    iput-object p4, p0, Lw20;->e:Lon;

    iput-object p5, p0, Lw20;->f:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06df\u06e6\u06e7"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    if-gtz v0, :cond_2

    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    const-string v0, "\u06e0\u06e8\u06e2"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    const-string v0, "c11BjcLcJmeKyZJ9dKZouVH77a2"

    invoke-static {v0}, Lio/fastkv/ۦۣ۠ۨ;->ۧۢ۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    :cond_0
    const-string v0, "\u06df\u06df\u06e4"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v0, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    rem-int/2addr v0, v2

    const v2, 0x1ab154

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_3
    sget v0, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v2, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    mul-int/2addr v0, v2

    const v2, 0x1950b9

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    move-result v0

    if-ltz v0, :cond_1

    sget v0, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    rem-int/lit16 v2, v2, 0x1bdd

    div-int/2addr v0, v2

    if-eqz v0, :cond_3

    :cond_2
    const-string v0, "\u06e2\u06e3\u06df"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    sget v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    or-int/2addr v0, v2

    const v2, 0x1aca69

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa704 -> :sswitch_0
        0x1aa7e0 -> :sswitch_4
        0x1aabda -> :sswitch_2
        0x1ab2be -> :sswitch_5
        0x1ac58c -> :sswitch_3
        0x1ac946 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 28

    const/16 v20, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v3, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-string v5, "\u06e2\u06e4\u06e2"

    invoke-static {v5}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v26, v2

    move/from16 v27, v4

    move v8, v5

    :goto_0
    sparse-switch v8, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v2, Lmn;->a:Landroid/graphics/Typeface;

    const-string v2, "8bqmhrSGAYqC8pnlwqtTy6ib\n"

    const-string v4, "FBQ4YyQL5C4=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v2, v0, Lw20;->b:Landroid/app/Activity;

    :goto_1
    const-string v5, "\u06e6\u06e3\u06e2"

    invoke-static {v5}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v5

    move-object v10, v2

    move-object v11, v4

    move v8, v5

    goto :goto_0

    :sswitch_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lw20;->b:Landroid/app/Activity;

    new-instance v7, Lc30;

    move/from16 v0, v23

    xor-int/lit16 v4, v0, 0x205

    move-object/from16 v0, v19

    invoke-direct {v7, v0, v2, v4}, Lc30;-><init>(Landroid/app/Dialog;Landroid/app/Activity;I)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lw20;->c:[Ljava/lang/String;

    move-object/from16 v0, p0

    iget v5, v0, Lw20;->d:I

    move-object/from16 v0, p0

    iget-object v6, v0, Lw20;->e:Lon;

    invoke-static/range {v2 .. v7}, Lmn;->c(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILon;Lsm;)V

    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    if-gtz v2, :cond_0

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    move-object v2, v12

    :goto_2
    const-string v4, "\u06e3\u06e7\u06e2"

    invoke-static {v4}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v4

    move-object v12, v2

    move v8, v4

    goto :goto_0

    :cond_0
    const-string v2, "\u06e7\u06df\u06e5"

    move-object v5, v15

    move-object v6, v2

    move/from16 v7, v16

    :goto_3
    invoke-static {v6}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v15, v5

    move/from16 v16, v7

    move v8, v2

    goto :goto_0

    :sswitch_2
    move-object/from16 v0, p0

    iget-object v4, v0, Lw20;->b:Landroid/app/Activity;

    new-instance v9, Lc30;

    move/from16 v0, v16

    xor-int/lit16 v2, v0, -0x332

    move-object/from16 v0, v19

    invoke-direct {v9, v0, v4, v2}, Lc30;-><init>(Landroid/app/Dialog;Landroid/app/Activity;I)V

    move-object/from16 v0, p0

    iget-object v6, v0, Lw20;->c:[Ljava/lang/String;

    move-object/from16 v0, p0

    iget v7, v0, Lw20;->d:I

    move-object/from16 v0, p0

    iget-object v8, v0, Lw20;->e:Lon;

    move-object v5, v15

    invoke-static/range {v4 .. v9}, Lmn;->c(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILon;Lsm;)V

    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    move-result v2

    if-ltz v2, :cond_1

    const-string v2, "\u06e5\u06e8\u06e5"

    invoke-static {v2}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v2

    move v8, v2

    goto/16 :goto_0

    :cond_1
    const-string v2, "\u06e5\u06e7\u06df"

    :goto_4
    invoke-static {v2}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v2

    move v8, v2

    goto/16 :goto_0

    :pswitch_0
    :sswitch_3
    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v4, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    xor-int/lit16 v4, v4, -0x96b

    mul-int/2addr v2, v4

    if-gtz v2, :cond_2

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    const-string v2, "\u06e4\u06e1\u06e3"

    invoke-static {v2}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v2

    move v8, v2

    goto/16 :goto_0

    :cond_2
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v4, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    xor-int/2addr v2, v4

    const v4, 0x1acb89

    add-int/2addr v2, v4

    move v8, v2

    goto/16 :goto_0

    :sswitch_4
    new-instance v2, Lc30;

    const/4 v4, 0x1

    move-object/from16 v0, v19

    move-object/from16 v1, v22

    invoke-direct {v2, v0, v1, v4}, Lc30;-><init>(Landroid/app/Dialog;Landroid/app/Activity;I)V

    goto :goto_2

    :sswitch_5
    sget v2, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    if-gtz v2, :cond_4

    const/16 v2, 0x5c

    sput v2, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    move-object v2, v13

    move v4, v14

    :cond_3
    const-string v6, "\u06e6\u06e8\u06e8"

    move-object v5, v15

    move-object v13, v2

    move v14, v4

    move/from16 v7, v16

    goto :goto_3

    :cond_4
    const-string v2, "\u06e7\u06e5\u06e5"

    :goto_5
    invoke-static {v2}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v2

    move v8, v2

    goto/16 :goto_0

    :sswitch_6
    sget v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v4, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    div-int/lit16 v4, v4, 0x9fb

    or-int/2addr v2, v4

    if-gtz v2, :cond_5

    const-string v2, "\u06e8\u06e8\u06e6"

    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    move v8, v2

    goto/16 :goto_0

    :cond_5
    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v4, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sub-int/2addr v2, v4

    const v4, 0x1acb5f

    add-int/2addr v2, v4

    move v8, v2

    goto/16 :goto_0

    :sswitch_7
    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v4, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    div-int/lit16 v4, v4, -0x14b4

    xor-int/2addr v2, v4

    if-ltz v2, :cond_6

    const-string v2, "\u06e5\u06e5\u06e3"

    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v2

    move v8, v2

    goto/16 :goto_0

    :cond_6
    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v4, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    or-int/2addr v2, v4

    const v4, 0x1ab690

    add-int/2addr v2, v4

    move v8, v2

    goto/16 :goto_0

    :sswitch_8
    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v4, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    add-int/2addr v2, v4

    const v4, 0x1ac83f

    add-int/2addr v2, v4

    move v8, v2

    goto/16 :goto_0

    :sswitch_9
    sget v2, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v4, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    mul-int/2addr v2, v4

    const v4, 0x1f4e93

    xor-int/2addr v2, v4

    move v8, v2

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    move-result v2

    if-ltz v2, :cond_7

    const-string v2, "\u06e0\u06df\u06e1"

    invoke-static {v2}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v2

    move v8, v2

    goto/16 :goto_0

    :cond_7
    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v4, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    add-int/2addr v2, v4

    const v4, 0x1ab74d

    add-int/2addr v2, v4

    move v8, v2

    goto/16 :goto_0

    :sswitch_b
    packed-switch v20, :pswitch_data_0

    :sswitch_c
    sget v2, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v4, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    add-int/lit16 v4, v4, -0x449

    or-int/2addr v2, v4

    if-ltz v2, :cond_8

    const-string v2, "\u06e5\u06e4\u06e7"

    :goto_6
    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v2

    move v8, v2

    goto/16 :goto_0

    :cond_8
    const-string v2, "\u06e8\u06e8\u06e6"

    invoke-static {v2}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v2

    move v8, v2

    goto/16 :goto_0

    :pswitch_1
    :sswitch_d
    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    move-result v2

    if-gtz v2, :cond_9

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    const-string v2, "\u06e2\u06e7\u06e2"

    invoke-static {v2}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move v8, v2

    goto/16 :goto_0

    :cond_9
    sget v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v4, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    or-int/2addr v2, v4

    const v4, 0x1ab07f

    add-int/2addr v2, v4

    move v8, v2

    goto/16 :goto_0

    :sswitch_e
    sget-object v2, Lmn;->a:Landroid/graphics/Typeface;

    const-string v2, "AjeRDUmRPVoEZJIOSJA7DwRlllpOwzoJAjKQDEzBPV8DMpAO\n"

    const-string v4, "YFT0PCrzXzw=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, La80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v5, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v6, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    mul-int/2addr v5, v6

    const v6, 0x20d592

    add-int/2addr v5, v6

    move-object/from16 v26, v2

    move/from16 v27, v4

    move v8, v5

    goto/16 :goto_0

    :sswitch_f
    sget-object v2, Lmn;->a:Landroid/graphics/Typeface;

    const-string v2, "tfYybONHvuv1hxkmjXvlie3M\n"

    const-string v4, "UGKWhWXVW24=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget v4, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v5, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v6, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    div-int/lit16 v6, v6, -0x1c9b

    add-int/2addr v5, v6

    if-ltz v5, :cond_3

    const-string v5, "\u06e0\u06e5\u06e5"

    invoke-static {v5}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v5

    move-object v13, v2

    move v14, v4

    move v8, v5

    goto/16 :goto_0

    :sswitch_10
    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v4, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    div-int/lit16 v4, v4, 0x14a4

    add-int/2addr v2, v4

    if-gtz v2, :cond_a

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    const-string v2, "\u06e1\u06e2\u06e5"

    :goto_7
    invoke-static {v2}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v2

    move v8, v2

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06e2\u06e4\u06e2"

    goto :goto_7

    :sswitch_11
    move-object/from16 v0, p0

    iget-object v4, v0, Lw20;->b:Landroid/app/Activity;

    new-instance v9, Lc30;

    xor-int/lit8 v2, v18, 0x26

    move-object/from16 v0, v19

    invoke-direct {v9, v0, v4, v2}, Lc30;-><init>(Landroid/app/Dialog;Landroid/app/Activity;I)V

    move-object/from16 v0, p0

    iget-object v6, v0, Lw20;->c:[Ljava/lang/String;

    move-object/from16 v0, p0

    iget v7, v0, Lw20;->d:I

    move-object/from16 v0, p0

    iget-object v8, v0, Lw20;->e:Lon;

    move-object/from16 v5, v17

    invoke-static/range {v4 .. v9}, Lmn;->c(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILon;Lsm;)V

    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v4, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    add-int/lit16 v4, v4, 0x2518

    or-int/2addr v2, v4

    if-ltz v2, :cond_b

    const-string v2, "\u06e1\u06e6\u06df"

    invoke-static {v2}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move v8, v2

    goto/16 :goto_0

    :sswitch_12
    move-object/from16 v0, p0

    iget-object v4, v0, Lw20;->b:Landroid/app/Activity;

    new-instance v9, Lc30;

    move/from16 v0, v25

    xor-int/lit16 v2, v0, -0x1ad

    move-object/from16 v0, v19

    invoke-direct {v9, v0, v4, v2}, Lc30;-><init>(Landroid/app/Dialog;Landroid/app/Activity;I)V

    move-object/from16 v0, p0

    iget-object v6, v0, Lw20;->c:[Ljava/lang/String;

    move-object/from16 v0, p0

    iget v7, v0, Lw20;->d:I

    move-object/from16 v0, p0

    iget-object v8, v0, Lw20;->e:Lon;

    move-object/from16 v5, v24

    invoke-static/range {v4 .. v9}, Lmn;->c(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILon;Lsm;)V

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    move-result v2

    if-ltz v2, :cond_c

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    :cond_b
    const-string v4, "\u06e3\u06e6\u06e4"

    move-object/from16 v2, v17

    move/from16 v5, v18

    :goto_8
    invoke-static {v4}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v17, v2

    move/from16 v18, v5

    move v8, v4

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e8\u06e5\u06e0"

    move-object/from16 v2, v19

    move/from16 v5, v20

    :goto_9
    invoke-static {v4}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v19, v2

    move/from16 v20, v5

    move v8, v4

    goto/16 :goto_0

    :sswitch_13
    sget-object v2, Lmn;->a:Landroid/graphics/Typeface;

    const-string v2, "jNKS94lLPsGNjZP1iB44w4qHlaKOHDqR\n"

    const-string v3, "7rT3weotXKI=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, La80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget v6, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    invoke-static {}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۥۧۧ()I

    move-result v2

    if-gtz v2, :cond_d

    const/16 v2, 0x41

    sput v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    const-string v2, "\u06e3\u06e3\u06e7"

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v23, v6

    move v8, v2

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06e4\u06e0\u06e5"

    move-object/from16 v2, v21

    move-object/from16 v4, v22

    :goto_a
    invoke-static {v5}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v21, v2

    move-object/from16 v22, v4

    move/from16 v23, v6

    move v8, v5

    goto/16 :goto_0

    :sswitch_14
    move-object/from16 v0, p0

    iget-object v6, v0, Lw20;->c:[Ljava/lang/String;

    move-object/from16 v0, p0

    iget v7, v0, Lw20;->d:I

    move-object/from16 v0, p0

    iget-object v8, v0, Lw20;->e:Lon;

    move-object/from16 v4, v22

    move-object/from16 v5, v21

    move-object v9, v12

    invoke-static/range {v4 .. v9}, Lmn;->c(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILon;Lsm;)V

    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    if-ltz v2, :cond_e

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    const-string v2, "\u06e6\u06e8\u06e0"

    invoke-static {v2}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v2

    move v8, v2

    goto/16 :goto_0

    :cond_e
    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v4, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    or-int/2addr v2, v4

    const v4, -0x1ab608

    xor-int/2addr v2, v4

    move v8, v2

    goto/16 :goto_0

    :sswitch_15
    sget-object v2, Lvh;->n:Lvh;

    return-object v2

    :sswitch_16
    sget-object v2, Lmn;->a:Landroid/graphics/Typeface;

    const-string v2, "DZept0PGjtkKk6vmR5GJjAnBr+ZGlI+L\n"

    const-string v4, "b6TN1SXy7L0=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, La80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget v5, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v4, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v6, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    mul-int/lit16 v6, v6, -0x1fa

    mul-int/2addr v4, v6

    if-ltz v4, :cond_f

    const-string v4, "\u06e2\u06e1\u06e0"

    invoke-static {v4}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v17, v2

    move/from16 v18, v5

    move v8, v4

    goto/16 :goto_0

    :cond_f
    const-string v4, "\u06e0\u06e1\u06e6"

    goto/16 :goto_8

    :sswitch_17
    sget v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    if-ltz v2, :cond_10

    const-string v2, "\u06e3\u06e6\u06e1"

    invoke-static {v2}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v2

    move v8, v2

    goto/16 :goto_0

    :cond_10
    const-string v4, "\u06e0\u06e2\u06e0"

    move-object/from16 v2, v19

    move/from16 v5, v20

    goto/16 :goto_9

    :sswitch_18
    move-object/from16 v0, p0

    iget v5, v0, Lw20;->a:I

    move-object/from16 v0, p0

    iget-object v2, v0, Lw20;->f:Landroid/app/Dialog;

    sget v4, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v6, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    add-int/lit16 v6, v6, -0x1e03

    add-int/2addr v4, v6

    if-ltz v4, :cond_11

    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    const-string v4, "\u06e5\u06e5\u06e2"

    goto/16 :goto_9

    :cond_11
    const-string v4, "\u06e1\u06e6\u06e0"

    move-object/from16 v19, v2

    move/from16 v20, v5

    :goto_b
    invoke-static {v4}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v2

    move v8, v2

    goto/16 :goto_0

    :sswitch_19
    sget-object v2, Lmn;->a:Landroid/graphics/Typeface;

    const-string v2, "3FJ5YWgV68jdUnljbBTvktoAfzJoRuyd\n"

    const-string v4, "vjQdUQ4nias=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, La80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget v7, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    move-result v4

    if-gtz v4, :cond_12

    const-string v4, "\u06e7\u06df\u06e5"

    invoke-static {v4}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v4

    move-object v15, v2

    move/from16 v16, v7

    move v8, v4

    goto/16 :goto_0

    :cond_12
    const-string v4, "\u06df\u06e6\u06e2"

    move-object v5, v2

    move-object v6, v4

    goto/16 :goto_3

    :sswitch_1a
    move-object/from16 v0, p0

    iget-object v4, v0, Lw20;->b:Landroid/app/Activity;

    new-instance v9, Lc30;

    xor-int/lit16 v2, v14, 0x1fa

    move-object/from16 v0, v19

    invoke-direct {v9, v0, v4, v2}, Lc30;-><init>(Landroid/app/Dialog;Landroid/app/Activity;I)V

    move-object/from16 v0, p0

    iget-object v6, v0, Lw20;->c:[Ljava/lang/String;

    move-object/from16 v0, p0

    iget v7, v0, Lw20;->d:I

    move-object/from16 v0, p0

    iget-object v8, v0, Lw20;->e:Lon;

    move-object v5, v13

    invoke-static/range {v4 .. v9}, Lmn;->c(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILon;Lsm;)V

    const-string v2, "\u06e0\u06e6\u06e5"

    invoke-static {v2}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v2

    move v8, v2

    goto/16 :goto_0

    :sswitch_1b
    sget-object v2, Lmn;->a:Landroid/graphics/Typeface;

    const-string v2, "0rIPy8awB9zVtw7JwbEDjdazCMnG5AGK\n"

    const-string v4, "sNFqr6PSZb8=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, La80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget v5, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v4, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v6, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    rem-int/lit16 v6, v6, -0x92c

    or-int/2addr v4, v6

    if-gtz v4, :cond_13

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    const-string v4, "\u06e0\u06e1\u06e6"

    invoke-static {v4}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v24, v2

    move/from16 v25, v5

    move v8, v4

    goto/16 :goto_0

    :cond_13
    const-string v4, "\u06e5\u06e5\u06e2"

    :goto_c
    invoke-static {v4}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v24, v2

    move/from16 v25, v5

    move v8, v4

    goto/16 :goto_0

    :sswitch_1c
    sget-object v2, Lmn;->a:Landroid/graphics/Typeface;

    const-string v2, "q1hP/7UZ+82sDUn3sR/6y6wOSKm2Sv2d\n"

    const-string v4, "yT0qz9N8mag=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, La80;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lw20;->b:Landroid/app/Activity;

    sget v5, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v6, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    rem-int/lit16 v6, v6, 0x1b11

    add-int/2addr v5, v6

    if-gtz v5, :cond_14

    const/16 v5, 0x22

    sput v5, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    const-string v5, "\u06e1\u06e4\u06e7"

    move/from16 v6, v23

    goto/16 :goto_a

    :cond_14
    const-string v5, "\u06e8\u06e6\u06e2"

    :goto_d
    invoke-static {v5}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v21, v2

    move-object/from16 v22, v4

    move v8, v5

    goto/16 :goto_0

    :pswitch_2
    :sswitch_1d
    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v4, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    rem-int/lit16 v4, v4, -0x141e

    div-int/2addr v2, v4

    if-eqz v2, :cond_15

    const/4 v2, 0x3

    sput v2, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    const-string v2, "\u06e1\u06e6\u06e7"

    move-object v4, v2

    goto/16 :goto_b

    :cond_15
    const-string v4, "\u06e3\u06e4"

    move-object/from16 v2, v24

    move/from16 v5, v25

    goto :goto_c

    :sswitch_1e
    move-object/from16 v0, p0

    iget-object v4, v0, Lw20;->b:Landroid/app/Activity;

    new-instance v9, Lc30;

    xor-int/lit8 v2, v27, 0x67

    move-object/from16 v0, v19

    invoke-direct {v9, v0, v4, v2}, Lc30;-><init>(Landroid/app/Dialog;Landroid/app/Activity;I)V

    move-object/from16 v0, p0

    iget-object v6, v0, Lw20;->c:[Ljava/lang/String;

    move-object/from16 v0, p0

    iget v7, v0, Lw20;->d:I

    move-object/from16 v0, p0

    iget-object v8, v0, Lw20;->e:Lon;

    move-object/from16 v5, v26

    invoke-static/range {v4 .. v9}, Lmn;->c(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILon;Lsm;)V

    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    if-ltz v2, :cond_16

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    const-string v2, "\u06e3\u06e1\u06df"

    goto/16 :goto_5

    :cond_16
    sget v2, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v4, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    mul-int/2addr v2, v4

    const v4, 0x191d1b

    xor-int/2addr v2, v4

    move v8, v2

    goto/16 :goto_0

    :pswitch_3
    :sswitch_1f
    sget v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    if-ltz v2, :cond_17

    const-string v2, "\u06e1\u06df\u06e7"

    goto/16 :goto_4

    :cond_17
    const-string v2, "\u06e6\u06e8\u06e0"

    move-object v4, v2

    goto/16 :goto_b

    :pswitch_4
    :sswitch_20
    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v4, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    add-int/lit16 v4, v4, 0x245b

    sub-int/2addr v2, v4

    if-ltz v2, :cond_18

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    const-string v4, "\u06e4\u06e8\u06e2"

    move-object/from16 v2, v24

    move/from16 v5, v25

    goto/16 :goto_c

    :cond_18
    const-string v2, "\u06e8\u06e5\u06df"

    goto/16 :goto_6

    :sswitch_21
    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v4, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sub-int/2addr v2, v4

    const v4, 0x1aad43

    add-int/2addr v2, v4

    move v8, v2

    goto/16 :goto_0

    :pswitch_5
    :sswitch_22
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v4, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    rem-int/lit16 v4, v4, 0x2024

    or-int/2addr v2, v4

    if-ltz v2, :cond_19

    const/16 v2, 0x62

    sput v2, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    const-string v2, "\u06e6\u06e6\u06df"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v2

    move v8, v2

    goto/16 :goto_0

    :cond_19
    const-string v2, "\u06e3\u06e1\u06df"

    invoke-static {v2}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v2

    move v8, v2

    goto/16 :goto_0

    :sswitch_23
    new-instance v9, Lc30;

    const/4 v2, 0x0

    move-object/from16 v0, v19

    invoke-direct {v9, v0, v10, v2}, Lc30;-><init>(Landroid/app/Dialog;Landroid/app/Activity;I)V

    move-object/from16 v0, p0

    iget-object v6, v0, Lw20;->c:[Ljava/lang/String;

    move-object/from16 v0, p0

    iget v7, v0, Lw20;->d:I

    move-object/from16 v0, p0

    iget-object v8, v0, Lw20;->e:Lon;

    move-object v4, v10

    move-object v5, v11

    invoke-static/range {v4 .. v9}, Lmn;->c(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILon;Lsm;)V

    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v4, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    add-int/lit16 v4, v4, 0x6f2

    or-int/2addr v2, v4

    if-gtz v2, :cond_1a

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    move-object v2, v10

    move-object v4, v11

    goto/16 :goto_1

    :cond_1a
    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v4, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    mul-int/2addr v2, v4

    const v4, -0x1ada8b

    xor-int/2addr v2, v4

    move v8, v2

    goto/16 :goto_0

    :pswitch_6
    :sswitch_24
    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    if-ltz v2, :cond_1b

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    const-string v5, "\u06e2\u06e2\u06e5"

    move-object/from16 v2, v21

    move-object/from16 v4, v22

    goto/16 :goto_d

    :cond_1b
    const-string v2, "\u06e3\u06e6\u06e1"

    invoke-static {v2}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v2

    move v8, v2

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc61 -> :sswitch_0
        0x1aa71e -> :sswitch_7
        0x1aa7db -> :sswitch_2
        0x1aaac2 -> :sswitch_7
        0x1aab05 -> :sswitch_11
        0x1aab1e -> :sswitch_7
        0x1aab62 -> :sswitch_1e
        0x1aab80 -> :sswitch_7
        0x1aab9f -> :sswitch_21
        0x1aaf24 -> :sswitch_10
        0x1aaf3b -> :sswitch_22
        0x1aaf5a -> :sswitch_13
        0x1aaf5b -> :sswitch_b
        0x1ab26a -> :sswitch_1f
        0x1ab281 -> :sswitch_17
        0x1ab286 -> :sswitch_7
        0x1ab2c5 -> :sswitch_3
        0x1ab2e0 -> :sswitch_18
        0x1ab641 -> :sswitch_f
        0x1ab687 -> :sswitch_15
        0x1ab6de -> :sswitch_19
        0x1ab6e1 -> :sswitch_5
        0x1ab6fe -> :sswitch_14
        0x1ab9e9 -> :sswitch_1
        0x1aba09 -> :sswitch_c
        0x1aba83 -> :sswitch_20
        0x1abe42 -> :sswitch_12
        0x1abe7d -> :sswitch_a
        0x1abea2 -> :sswitch_9
        0x1ac1c5 -> :sswitch_23
        0x1ac25e -> :sswitch_e
        0x1ac261 -> :sswitch_d
        0x1ac266 -> :sswitch_1a
        0x1ac50d -> :sswitch_6
        0x1ac5c7 -> :sswitch_7
        0x1ac600 -> :sswitch_7
        0x1ac8ce -> :sswitch_7
        0x1ac8ec -> :sswitch_1d
        0x1ac909 -> :sswitch_16
        0x1ac982 -> :sswitch_1b
        0x1ac983 -> :sswitch_8
        0x1ac989 -> :sswitch_24
        0x1ac9a4 -> :sswitch_4
        0x1ac9e6 -> :sswitch_1c
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_6
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_5
    .end packed-switch
.end method
