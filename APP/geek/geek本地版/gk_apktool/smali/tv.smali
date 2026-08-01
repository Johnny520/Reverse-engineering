.class public final Ltv;
.super Lm50;

# interfaces
.implements Lwm;


# instance fields
.field public e:I

.field public final f:Landroid/app/Dialog;

.field public final g:Landroid/content/Context;

.field public final h:Ljava/util/LinkedHashSet;

.field public final i:Ljava/lang/ClassLoader;

.field public final j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Dialog;Landroid/content/Context;Ljava/util/LinkedHashSet;Ljava/lang/ClassLoader;Ljava/lang/String;Lld;)V
    .locals 3

    iput-object p1, p0, Ltv;->f:Landroid/app/Dialog;

    iput-object p2, p0, Ltv;->g:Landroid/content/Context;

    iput-object p3, p0, Ltv;->h:Ljava/util/LinkedHashSet;

    iput-object p4, p0, Ltv;->i:Ljava/lang/ClassLoader;

    iput-object p5, p0, Ltv;->j:Ljava/lang/String;

    invoke-direct {p0, p6}, Lm50;-><init>(Lld;)V

    const/4 v1, 0x0

    const-string v0, "\u06e0\u06e2\u06e0"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u06e2\u06e1\u06e4"

    :goto_1
    invoke-static {v0}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    :sswitch_1
    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    move-result v0

    if-ltz v0, :cond_1

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    const-string v0, "\u06e3\u06e8\u06e7"

    goto :goto_1

    :cond_1
    const-string v0, "\u06e7\u06e3\u06e6"

    goto :goto_1

    :sswitch_2
    const-string v0, "Sd6B9FAhJhJSduoAbrSfk2Tz2"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۣۡۡۦ;->ۣ۟ۢۨ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    sget v0, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v2, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    mul-int/2addr v0, v2

    const v2, 0x1c3d44

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v0, "\u06e7\u06e3\u06e6"

    goto :goto_1

    :sswitch_4
    const-string v0, "\u06e0\u06e2\u06e0"

    invoke-static {v0}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aab1e -> :sswitch_0
        0x1ab285 -> :sswitch_2
        0x1ab665 -> :sswitch_1
        0x1aba45 -> :sswitch_4
        0x1ac58a -> :sswitch_5
        0x1ac94a -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final a(Lld;)Lld;
    .locals 7

    const/4 v0, 0x0

    const-string v1, "\u06e7\u06e0\u06e6"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v1

    move-object v4, v0

    move-object v5, v0

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v5, p0, Ltv;->j:Ljava/lang/String;

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    move-result v0

    if-ltz v0, :cond_1

    const-string v0, "\u06e1\u06e7\u06e8"

    invoke-static {v0}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :sswitch_1
    sget v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v1, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    mul-int/lit16 v1, v1, -0x1abf

    div-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/16 v0, 0x2f

    sput v0, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    const-string v0, "\u06e2\u06e3\u06e1"

    :goto_1
    invoke-static {v0}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v1, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    rem-int/2addr v0, v1

    const v1, 0x1ac5ad

    add-int/2addr v0, v1

    move v1, v0

    goto :goto_0

    :sswitch_2
    iget-object v4, p0, Ltv;->i:Ljava/lang/ClassLoader;

    const-string v0, "\u06e1\u06e7\u06e8"

    goto :goto_1

    :sswitch_3
    new-instance v0, Ltv;

    iget-object v1, p0, Ltv;->f:Landroid/app/Dialog;

    iget-object v2, p0, Ltv;->g:Landroid/content/Context;

    iget-object v3, p0, Ltv;->h:Ljava/util/LinkedHashSet;

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Ltv;-><init>(Landroid/app/Dialog;Landroid/content/Context;Ljava/util/LinkedHashSet;Ljava/lang/ClassLoader;Ljava/lang/String;Lld;)V

    return-object v0

    :cond_1
    sget v0, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    or-int/2addr v0, v1

    const v1, 0x1ab11e

    add-int/2addr v0, v1

    move v1, v0

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aaf82 -> :sswitch_0
        0x1ab289 -> :sswitch_3
        0x1abe62 -> :sswitch_1
        0x1ac52d -> :sswitch_2
    .end sparse-switch
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "\u06e7\u06e1\u06e3"

    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    check-cast p2, Lld;

    invoke-virtual {p0, p2}, Ltv;->a(Lld;)Lld;

    move-result-object v0

    check-cast v0, Ltv;

    sget-object v1, Lvh;->n:Lvh;

    invoke-virtual {v0, v1}, Ltv;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :sswitch_1
    move-object v0, p1

    check-cast v0, Loe;

    sget v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    if-gtz v0, :cond_0

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    const-string v0, "\u06e6\u06e7\u06e0"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v1, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    or-int/2addr v0, v1

    const v1, -0x1ab920

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    move-result v0

    if-ltz v0, :cond_1

    const/16 v0, 0x42

    sput v0, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    const-string v0, "\u06e2\u06e3\u06e6"

    invoke-static {v0}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v1, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    mul-int/2addr v0, v1

    const v1, 0x1cc0f1

    add-int/2addr v0, v1

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aba08 -> :sswitch_0
        0x1ac23f -> :sswitch_2
        0x1ac549 -> :sswitch_1
    .end sparse-switch
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v2, 0x0

    const/4 v15, 0x0

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const-string v6, "\u06e8\u06e3\u06df"

    invoke-static {v6}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v16, v1

    move-object/from16 v17, v2

    move/from16 v18, v3

    :goto_0
    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v1, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    mul-int/lit16 v2, v2, 0x452

    add-int/2addr v1, v2

    if-gtz v1, :cond_c

    const/16 v1, 0x17

    sput v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    const-string v1, "\u06e0\u06e8\u06e3"

    invoke-static {v1}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto :goto_0

    :sswitch_1
    if-lez v18, :cond_17

    sget-object v1, Lgn;->a:Lgn;

    sget v2, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v3, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    add-int/lit16 v3, v3, 0xb85

    sub-int/2addr v2, v3

    if-ltz v2, :cond_0

    const-string v2, "\u06e8\u06e4\u06e7"

    invoke-static {v2}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v2

    move-object v13, v1

    move v6, v2

    goto :goto_0

    :cond_0
    move-object v2, v14

    :goto_1
    const-string v3, "\u06e7\u06e3\u06e5"

    :goto_2
    invoke-static {v3}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v3

    move-object v13, v1

    move-object v14, v2

    move v6, v3

    goto :goto_0

    :sswitch_2
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v14}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V

    sget v1, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    if-gtz v1, :cond_1

    const/16 v1, 0xd

    sput v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    const-string v1, "\u06e8\u06e7\u06e6"

    invoke-static {v1}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e4\u06e7"

    move-object v3, v1

    :goto_3
    invoke-static {v3}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto :goto_0

    :sswitch_3
    sget v1, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    add-int/lit16 v2, v2, 0x26aa

    xor-int/2addr v1, v2

    if-gtz v1, :cond_2

    const-string v1, "\u06e2\u06df\u06e3"

    :goto_4
    invoke-static {v1}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06df\u06e6\u06e8"

    goto :goto_4

    :sswitch_4
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "c/5n+vb7D2037W7lo+IFajD9bvC5/QVtN/Zl4LnkBWow6GLivq8DImLwfuK/4QU=\n"

    const-string v3, "EJ8LltaPYE0=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :sswitch_5
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v1, "\u2705 \u6210\u529f\u6781\u901f\u5206\u53d1\u7ed9 "

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v0, v18

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v1, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v3, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    rem-int/lit8 v3, v3, -0x32

    add-int/2addr v1, v3

    if-ltz v1, :cond_3

    const-string v1, "\u06e8\u06e0\u06df"

    invoke-static {v1}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v1

    move-object v12, v2

    move v6, v1

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06e2\u06e7"

    move-object v1, v4

    :goto_5
    invoke-static {v3}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v3

    move-object v4, v1

    move-object v12, v2

    move v6, v3

    goto/16 :goto_0

    :sswitch_6
    sget v1, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    if-ltz v1, :cond_4

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    move-object v1, v10

    move v2, v11

    :goto_6
    const-string v3, "\u06e1\u06df\u06e8"

    move-object v10, v1

    move v11, v2

    goto :goto_3

    :cond_4
    const-string v1, "\u06e1\u06e6\u06df"

    :goto_7
    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :sswitch_7
    invoke-static {v5, v8}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V

    sget v1, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    or-int/lit16 v2, v2, -0x5d7

    rem-int/2addr v1, v2

    if-ltz v1, :cond_a

    const-string v1, "\u06e7\u06e0\u06e7"

    invoke-static {v1}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :sswitch_8
    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    rem-int/2addr v1, v2

    const v2, 0x1ac958

    add-int/2addr v1, v2

    move v6, v1

    goto/16 :goto_0

    :sswitch_9
    sget-object v1, Lvh;->n:Lvh;

    :goto_8
    return-object v1

    :cond_5
    :sswitch_a
    sget v1, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    add-int/lit16 v2, v2, -0xa33

    xor-int/2addr v1, v2

    if-gtz v1, :cond_6

    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    const-string v3, "\u06e8\u06e6\u06e6"

    move-object v1, v4

    move-object v2, v12

    goto :goto_5

    :cond_6
    sget v1, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    mul-int/2addr v1, v2

    const v2, 0x206195

    add-int/2addr v1, v2

    move v6, v1

    goto/16 :goto_0

    :cond_7
    :sswitch_b
    sget v1, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    mul-int/lit16 v2, v2, 0x26a6

    sub-int/2addr v1, v2

    if-gtz v1, :cond_8

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    const-string v1, "\u06e6\u06e2\u06df"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06df\u06e7\u06e0"

    move-object v1, v4

    move-object v2, v12

    goto :goto_5

    :sswitch_c
    const-string v1, " \u4e2a\u5bf9\u8c61\uff01"

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget v1, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v3, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    xor-int/lit16 v3, v3, 0x247a

    add-int/2addr v1, v3

    if-ltz v1, :cond_9

    const/16 v1, 0x19

    sput v1, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    move-object v1, v13

    goto/16 :goto_1

    :cond_9
    sget v1, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sub-int/2addr v1, v3

    const v3, 0x1ac1ac

    xor-int/2addr v1, v3

    move-object v14, v2

    move v6, v1

    goto/16 :goto_0

    :sswitch_d
    :try_start_0
    move-object/from16 v0, p0

    iget-object v1, v0, Ltv;->f:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v1, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v2, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    mul-int/lit16 v2, v2, 0x9fd

    mul-int/2addr v1, v2

    if-gtz v1, :cond_b

    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    :cond_a
    const-string v1, "\u06df\u06e6\u06e8"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_b
    sget v1, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v2, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    div-int/2addr v1, v2

    const v2, 0x1ac96b

    add-int/2addr v1, v2

    move v6, v1

    goto/16 :goto_0

    :sswitch_e
    sget-object v1, Lgn;->a:Lgn;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v1, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    add-int/lit16 v2, v2, 0x1592

    sub-int/2addr v1, v2

    if-ltz v1, :cond_19

    invoke-static {}, Landroidx/recyclerview/widget/ۧۧۦۢ;->ۣۢۦۨ()I

    const-string v1, "\u06e8\u06e3\u06e4"

    invoke-static {v1}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_c
    const-string v1, "\u06e3\u06e6\u06e5"

    invoke-static {v1}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :sswitch_f
    move-object/from16 v0, p0

    iget v2, v0, Ltv;->e:I

    sget v1, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v3, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    add-int/lit16 v3, v3, 0x870

    rem-int/2addr v1, v3

    if-gtz v1, :cond_d

    const-string v1, "\u06e0\u06e5"

    move-object/from16 v10, p1

    :goto_9
    invoke-static {v1}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    move v11, v2

    move v6, v1

    goto/16 :goto_0

    :cond_d
    move-object/from16 v1, p1

    goto/16 :goto_6

    :sswitch_10
    move-object/from16 v0, v16

    iget-object v1, v0, Lkx;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    if-gtz v2, :cond_e

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    move-object v2, v9

    :goto_a
    const-string v3, "\u06e0\u06e4\u06e6"

    :goto_b
    invoke-static {v3}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v3

    move-object v8, v1

    move-object v9, v2

    move v6, v3

    goto/16 :goto_0

    :cond_e
    const-string v3, "\u06e3\u06e6\u06e5"

    move-object v2, v9

    goto :goto_b

    :sswitch_11
    const/4 v1, 0x1

    if-ne v11, v1, :cond_5

    invoke-static {v10}, Lct;->y(Ljava/lang/Object;)V

    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    div-int/lit16 v2, v2, -0x4b5

    or-int/2addr v1, v2

    if-gtz v1, :cond_f

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    const-string v1, "\u06e1\u06e1\u06df"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_f
    const-string v1, "\u06e7\u06e0\u06e7"

    move v2, v11

    goto :goto_9

    :catchall_0
    move-exception v1

    sget v1, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    mul-int/lit16 v2, v2, -0x204f

    add-int/2addr v1, v2

    if-gtz v1, :cond_10

    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    const-string v1, "\u06e8\u06e3\u06df"

    invoke-static {v1}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_10
    sget v1, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    add-int/2addr v1, v2

    const v2, 0x1ac751

    xor-int/2addr v1, v2

    move v6, v1

    goto/16 :goto_0

    :sswitch_12
    move-object/from16 v0, v17

    if-ne v0, v15, :cond_12

    sget v1, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    if-gtz v1, :cond_11

    const/16 v1, 0x1a

    sput v1, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    const-string v1, "\u06df\u06e4\u06df"

    invoke-static {v1}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_11
    sget v1, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    rem-int/2addr v1, v2

    const v2, 0x1aab30

    add-int/2addr v1, v2

    move v6, v1

    goto/16 :goto_0

    :cond_12
    :sswitch_13
    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    if-gtz v1, :cond_13

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    const-string v1, "\u06e6\u06e3\u06e7"

    invoke-static {v1}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_13
    sget v1, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v2, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    or-int/2addr v1, v2

    const v2, 0x1ac41c

    xor-int/2addr v1, v2

    move v6, v1

    goto/16 :goto_0

    :sswitch_14
    move-object/from16 v0, p0

    iget-object v4, v0, Ltv;->j:Ljava/lang/String;

    new-instance v1, Lq9;

    move-object/from16 v0, p0

    iget-object v2, v0, Ltv;->h:Ljava/util/LinkedHashSet;

    move-object/from16 v0, p0

    iget-object v3, v0, Ltv;->i:Ljava/lang/ClassLoader;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Lq9;-><init>(Ljava/util/LinkedHashSet;Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Context;Lld;)V

    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v3, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    mul-int/lit16 v3, v3, -0x21f5

    or-int/2addr v2, v3

    if-ltz v2, :cond_14

    const-string v2, "\u06e7\u06e6\u06e1"

    invoke-static {v2}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v4, v1

    move v6, v2

    goto/16 :goto_0

    :cond_14
    const-string v3, "\u06e8\u06e0\u06df"

    move-object v2, v12

    goto/16 :goto_5

    :sswitch_15
    sget v1, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    add-int/lit8 v2, v2, 0x74

    rem-int/2addr v1, v2

    if-gtz v1, :cond_15

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    const-string v1, "\u06e2\u06e7"

    goto/16 :goto_7

    :cond_15
    sget v1, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    xor-int/2addr v1, v2

    const v2, 0x1acd3a

    add-int/2addr v1, v2

    move v6, v1

    goto/16 :goto_0

    :sswitch_16
    move-object v1, v15

    goto/16 :goto_8

    :sswitch_17
    move-object v1, v7

    check-cast v1, Lkx;

    iget-object v2, v1, Lkx;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    sget v3, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v6, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    or-int/lit16 v6, v6, -0x19f5

    div-int/2addr v3, v6

    if-ltz v3, :cond_16

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    const-string v3, "\u06e3\u06e8\u06e4"

    invoke-static {v3}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v16, v1

    move/from16 v18, v2

    move v6, v3

    goto/16 :goto_0

    :cond_16
    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v6, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    xor-int/2addr v3, v6

    const v6, 0x1ab342

    xor-int/2addr v3, v6

    move-object/from16 v16, v1

    move/from16 v18, v2

    move v6, v3

    goto/16 :goto_0

    :cond_17
    :sswitch_18
    const-string v1, "\u06e8\u06e6\u06e1"

    :goto_c
    invoke-static {v1}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :sswitch_19
    sget v1, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    if-ltz v1, :cond_18

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    const-string v1, "\u06e6\u06df\u06e6"

    goto :goto_c

    :cond_18
    const-string v1, "\u06e8\u06e3\u06df"

    goto :goto_c

    :sswitch_1a
    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    move-result v1

    if-gtz v1, :cond_1a

    const/4 v1, 0x4

    sput v1, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    move-object v7, v10

    :cond_19
    const-string v1, "\u06df\u06e2\u06df"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_1a
    const-string v3, "\u06e3\u06e8\u06e4"

    move-object v1, v13

    move-object v2, v14

    move-object v7, v10

    goto/16 :goto_2

    :sswitch_1b
    move-object/from16 v0, p0

    iget-object v5, v0, Ltv;->g:Landroid/content/Context;

    if-eqz v11, :cond_7

    sget v1, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    rem-int/lit16 v2, v2, -0x11b0

    mul-int/2addr v1, v2

    if-ltz v1, :cond_1b

    const-string v1, "\u06e8\u06e4\u06e1"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_1b
    sget v1, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sub-int/2addr v1, v2

    const v2, 0x1abebd

    add-int/2addr v1, v2

    move v6, v1

    goto/16 :goto_0

    :sswitch_1c
    sget-object v15, Lpe;->a:Lpe;

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    move-result v1

    if-gtz v1, :cond_1c

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    const-string v1, "\u06df\u06e7\u06e0"

    invoke-static {v1}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v1

    move-object/from16 v7, v17

    move v6, v1

    goto/16 :goto_0

    :cond_1c
    sget v1, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    or-int/2addr v1, v2

    const v2, 0x1accc8

    add-int/2addr v1, v2

    move-object/from16 v7, v17

    move v6, v1

    goto/16 :goto_0

    :sswitch_1d
    const/4 v1, 0x1

    move-object/from16 v0, p0

    iput v1, v0, Ltv;->e:I

    move-object/from16 v0, p0

    invoke-static {v9, v4, v0}, La80;->I(Lge;Lwm;Lm50;)Ljava/lang/Object;

    move-result-object v1

    sget v2, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    if-ltz v2, :cond_1d

    const-string v2, "\u06df\u06e1\u06e3"

    invoke-static {v2}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v17, v1

    move v6, v2

    goto/16 :goto_0

    :cond_1d
    const-string v2, "\u06e2\u06df\u06e8"

    invoke-static {v2}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v17, v1

    move v6, v2

    goto/16 :goto_0

    :sswitch_1e
    invoke-static {v10}, Lct;->y(Ljava/lang/Object;)V

    sget-object v2, Lwg;->b:Lnf;

    move-object v1, v8

    goto/16 :goto_a

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc05 -> :sswitch_0
        0xdc45 -> :sswitch_c
        0xdc83 -> :sswitch_6
        0x1aa725 -> :sswitch_4
        0x1aa741 -> :sswitch_13
        0x1aa75c -> :sswitch_7
        0x1aa79a -> :sswitch_18
        0x1aa7d8 -> :sswitch_16
        0x1aa7e1 -> :sswitch_9
        0x1aa7f8 -> :sswitch_1e
        0x1aaac9 -> :sswitch_b
        0x1aab62 -> :sswitch_14
        0x1aae8a -> :sswitch_1b
        0x1aaebf -> :sswitch_19
        0x1aaf5a -> :sswitch_3
        0x1ab248 -> :sswitch_8
        0x1ab24b -> :sswitch_1c
        0x1ab31c -> :sswitch_10
        0x1ab6e2 -> :sswitch_d
        0x1ab71f -> :sswitch_15
        0x1aba06 -> :sswitch_3
        0x1abda9 -> :sswitch_11
        0x1ac1ac -> :sswitch_2
        0x1ac52e -> :sswitch_1a
        0x1ac589 -> :sswitch_5
        0x1ac5e2 -> :sswitch_17
        0x1ac605 -> :sswitch_8
        0x1ac8e7 -> :sswitch_1d
        0x1ac944 -> :sswitch_f
        0x1ac949 -> :sswitch_a
        0x1ac965 -> :sswitch_13
        0x1ac96b -> :sswitch_1
        0x1ac9a3 -> :sswitch_e
        0x1ac9c7 -> :sswitch_12
    .end sparse-switch
.end method
