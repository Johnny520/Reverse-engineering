.class public final synthetic Lw20;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:I

.field public final b:Landroid/widget/ScrollView;

.field public final c:Landroid/widget/ScrollView;

.field public final d:Landroid/widget/ScrollView;

.field public final e:Landroid/widget/ScrollView;

.field public final f:Landroid/widget/LinearLayout;

.field public final g:Landroid/widget/LinearLayout;

.field public final h:Landroid/widget/LinearLayout;

.field public final i:Landroid/widget/LinearLayout;

.field public final j:Landroid/widget/LinearLayout;

.field public final k:Lsn;

.field public final l:Landroid/view/View;

.field public final m:Lo40;

.field public final n:Lo40;


# direct methods
.method public synthetic constructor <init>(ILandroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lsn;Landroid/view/View;Lo40;Lo40;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    const-string v1, "\u06e3\u06e8\u06e6"

    invoke-static {v1}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    if-gtz v1, :cond_7

    const-string v1, "\u06e0\u06e3\u06e7"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v1, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v3, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    rem-int/lit16 v3, v3, -0x1480

    rem-int/2addr v1, v3

    if-gtz v1, :cond_1

    const-string v3, "\u06e6\u06e2\u06e2"

    move-object v1, v2

    :goto_2
    invoke-static {v3}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v1

    goto :goto_0

    :cond_1
    const-string v3, "\u06e6\u06e8\u06e3"

    move-object v1, v2

    goto :goto_2

    :sswitch_2
    iput-object p5, p0, Lw20;->e:Landroid/widget/ScrollView;

    iput-object p6, p0, Lw20;->f:Landroid/widget/LinearLayout;

    sget v1, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    if-gtz v1, :cond_3

    invoke-static {}, Lcom/google/android/material/carousel/ۢۢۢۥ;->۟ۡ۟۠ۧ()I

    :cond_2
    const-string v1, "\u06e4\u06e2\u06e5"

    invoke-static {v1}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e4\u06e4\u06e4"

    :goto_3
    invoke-static {v1}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :sswitch_3
    iput-object p3, p0, Lw20;->c:Landroid/widget/ScrollView;

    iput-object p4, p0, Lw20;->d:Landroid/widget/ScrollView;

    sget v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    if-gtz v1, :cond_4

    const/16 v1, 0x33

    sput v1, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    :goto_4
    const-string v1, "\u06e4\u06e2\u06e0"

    :goto_5
    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_4
    const-string v1, "\u06e8\u06e4\u06e3"

    goto :goto_5

    :sswitch_4
    iput p1, p0, Lw20;->a:I

    iput-object p2, p0, Lw20;->b:Landroid/widget/ScrollView;

    sget v1, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v3, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    rem-int/lit16 v3, v3, -0x1ffb

    add-int/2addr v1, v3

    if-ltz v1, :cond_2

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    const-string v1, "\u06e3\u06e8\u06e6"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :sswitch_5
    iput-object p9, p0, Lw20;->i:Landroid/widget/LinearLayout;

    iput-object p10, p0, Lw20;->j:Landroid/widget/LinearLayout;

    sget v1, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v3, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    or-int/lit16 v3, v3, 0x1dc8

    sub-int/2addr v1, v3

    if-ltz v1, :cond_5

    const/16 v1, 0x53

    sput v1, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    const-string v1, "\u06e6\u06e8\u06e3"

    invoke-static {v1}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e5\u06df\u06e2"

    invoke-static {v1}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :sswitch_6
    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    move-result v1

    if-gtz v1, :cond_0

    const-string v1, "46tXsm"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۥۣۤۡ;->۟ۡۨۡۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v2

    if-gtz v2, :cond_6

    const/16 v2, 0x58

    sput v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    const-string v2, "\u06e6\u06e4\u06e5"

    invoke-static {v2}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v1

    goto/16 :goto_0

    :cond_6
    const-string v2, "\u06e6\u06e4\u06e5"

    move-object v3, v2

    goto/16 :goto_2

    :sswitch_7
    iput-object p11, p0, Lw20;->k:Lsn;

    move-object/from16 v0, p12

    iput-object v0, p0, Lw20;->l:Landroid/view/View;

    goto :goto_4

    :cond_7
    const-string v1, "\u06e3\u06e8\u06e6"

    goto/16 :goto_1

    :sswitch_8
    move-object/from16 v0, p13

    iput-object v0, p0, Lw20;->m:Lo40;

    move-object/from16 v0, p14

    iput-object v0, p0, Lw20;->n:Lo40;

    sget v1, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v3, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    mul-int/lit16 v3, v3, 0x21dc

    mul-int/2addr v1, v3

    if-ltz v1, :cond_8

    const/16 v1, 0x1c

    sput v1, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    :cond_8
    const-string v1, "\u06e3\u06e1\u06e7"

    goto/16 :goto_3

    :sswitch_9
    iput-object p7, p0, Lw20;->g:Landroid/widget/LinearLayout;

    iput-object p8, p0, Lw20;->h:Landroid/widget/LinearLayout;

    sget v1, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    if-ltz v1, :cond_9

    const/16 v1, 0x57

    sput v1, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    :cond_9
    const-string v1, "\u06e7\u06df\u06e6"

    invoke-static {v1}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :sswitch_a
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v3, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    add-int/2addr v1, v3

    const v3, 0x1abd1a

    add-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_b
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc7b -> :sswitch_0
        0x1ab649 -> :sswitch_6
        0x1ab721 -> :sswitch_4
        0x1aba22 -> :sswitch_8
        0x1aba27 -> :sswitch_3
        0x1aba64 -> :sswitch_9
        0x1aba67 -> :sswitch_1
        0x1abd88 -> :sswitch_7
        0x1ac1e7 -> :sswitch_a
        0x1ac261 -> :sswitch_b
        0x1ac50e -> :sswitch_5
        0x1ac967 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 15

    const/4 v12, 0x0

    const-string v0, "\u06e2\u06e1\u06e0"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    iget-object v0, p0, Lw20;->b:Landroid/widget/ScrollView;

    iget-object v1, p0, Lw20;->c:Landroid/widget/ScrollView;

    iget-object v2, p0, Lw20;->d:Landroid/widget/ScrollView;

    iget-object v3, p0, Lw20;->e:Landroid/widget/ScrollView;

    iget-object v4, p0, Lw20;->f:Landroid/widget/LinearLayout;

    iget-object v5, p0, Lw20;->g:Landroid/widget/LinearLayout;

    iget-object v6, p0, Lw20;->h:Landroid/widget/LinearLayout;

    iget-object v7, p0, Lw20;->i:Landroid/widget/LinearLayout;

    iget-object v8, p0, Lw20;->j:Landroid/widget/LinearLayout;

    iget-object v9, p0, Lw20;->k:Lsn;

    iget-object v10, p0, Lw20;->l:Landroid/view/View;

    iget-object v11, p0, Lw20;->m:Lo40;

    iget v13, p0, Lw20;->a:I

    const/4 v14, 0x1

    invoke-static/range {v0 .. v14}, Lz20;->d(Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lsn;Landroid/view/View;Lo40;Lo40;IZ)V

    const-string v0, "\u06e1\u06e2"

    :goto_1
    invoke-static {v0}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    sget v0, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    div-int/lit16 v1, v1, 0x75d

    xor-int/2addr v0, v1

    if-ltz v0, :cond_0

    const/16 v0, 0x43

    sput v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    const-string v0, "\u06e1\u06df\u06df"

    goto :goto_1

    :cond_0
    const-string v0, "\u06e2\u06e1\u06e0"

    goto :goto_1

    :sswitch_3
    iget-object v12, p0, Lw20;->n:Lo40;

    sget v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v1, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    div-int/lit16 v1, v1, 0x1743

    xor-int/2addr v0, v1

    if-gtz v0, :cond_1

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    const-string v0, "\u06e2\u06e1\u06e0"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v1, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sub-int/2addr v0, v1

    const v1, -0x1ac49f

    xor-int/2addr v0, v1

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc21 -> :sswitch_0
        0x1ab281 -> :sswitch_3
        0x1ab2c7 -> :sswitch_2
        0x1ac18c -> :sswitch_1
    .end sparse-switch
.end method
