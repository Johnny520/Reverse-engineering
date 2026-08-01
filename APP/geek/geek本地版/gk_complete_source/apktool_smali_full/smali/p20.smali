.class public final synthetic Lp20;
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

.field public final k:Lon;

.field public final l:Landroid/view/View;

.field public final m:Lh40;

.field public final n:Lh40;


# direct methods
.method public synthetic constructor <init>(ILandroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lon;Landroid/view/View;Lh40;Lh40;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    const-string v1, "\u06e5\u06e2\u06e4"

    invoke-static {v1}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    move-result v1

    if-ltz v1, :cond_5

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    const-string v1, "\u06df\u06e4\u06e8"

    :goto_1
    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    iput-object p5, p0, Lp20;->e:Landroid/widget/ScrollView;

    iput-object p6, p0, Lp20;->f:Landroid/widget/LinearLayout;

    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    move-result v1

    if-ltz v1, :cond_1

    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    :cond_1
    const-string v1, "\u06e2\u06df\u06e1"

    invoke-static {v1}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    iput-object p9, p0, Lp20;->i:Landroid/widget/LinearLayout;

    iput-object p10, p0, Lp20;->j:Landroid/widget/LinearLayout;

    sget v1, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    if-gtz v1, :cond_2

    const/16 v1, 0x19

    sput v1, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    const-string v1, "\u06e7\u06e4\u06e8"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v3, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sub-int/2addr v1, v3

    const v3, 0x1ac5f0

    add-int/2addr v1, v3

    goto :goto_0

    :sswitch_3
    iput-object p11, p0, Lp20;->k:Lon;

    move-object/from16 v0, p12

    iput-object v0, p0, Lp20;->l:Landroid/view/View;

    const-string v1, "\u06e6\u06e8\u06e1"

    goto :goto_1

    :sswitch_4
    sget v1, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    if-ltz v1, :cond_3

    const-string v1, "\u06e2\u06e2\u06e7"

    :goto_2
    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    sget v1, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    rem-int/2addr v1, v3

    const v3, 0x1abdfd

    add-int/2addr v1, v3

    goto :goto_0

    :sswitch_5
    iput p1, p0, Lp20;->a:I

    iput-object p2, p0, Lp20;->b:Landroid/widget/ScrollView;

    sget v1, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v3, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    add-int/lit16 v3, v3, 0x1097

    div-int/2addr v1, v3

    if-eqz v1, :cond_4

    const-string v1, "\u06e5\u06e2\u06e4"

    invoke-static {v1}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_4
    const-string v1, "\u06e2\u06e7\u06df"

    goto :goto_2

    :cond_5
    sget v1, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v3, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sub-int/2addr v1, v3

    const v3, 0x1aad9d    # 2.450004E-39f

    add-int/2addr v1, v3

    goto/16 :goto_0

    :sswitch_6
    iput-object p7, p0, Lp20;->g:Landroid/widget/LinearLayout;

    iput-object p8, p0, Lp20;->h:Landroid/widget/LinearLayout;

    sget v1, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sub-int/2addr v1, v3

    const v3, -0x1ac3ab

    xor-int/2addr v1, v3

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v0, p13

    iput-object v0, p0, Lp20;->m:Lh40;

    move-object/from16 v0, p14

    iput-object v0, p0, Lp20;->n:Lh40;

    sget v1, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v3, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    rem-int/2addr v1, v3

    const v3, -0x1ab2c5

    xor-int/2addr v1, v3

    goto/16 :goto_0

    :sswitch_8
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(F)V

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    move-result v1

    if-ltz v1, :cond_6

    :cond_6
    const-string v1, "\u06e1\u06e4\u06e3"

    invoke-static {v1}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_9
    iput-object p3, p0, Lp20;->c:Landroid/widget/ScrollView;

    iput-object p4, p0, Lp20;->d:Landroid/widget/ScrollView;

    const-string v1, "\u06e8\u06e1\u06e2"

    goto/16 :goto_1

    :sswitch_a
    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    move-result v1

    if-ltz v1, :cond_0

    const-string v1, "Y2r0yfRdI"

    invoke-static {v1}, Lۣ۟ۢ۠۠;->ۦۣۢۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    sget v1, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v3, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    rem-int/2addr v1, v3

    const v3, 0x1ac586

    add-int/2addr v1, v3

    goto/16 :goto_0

    :sswitch_b
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa81d -> :sswitch_0
        0x1aab20 -> :sswitch_4
        0x1aaf20 -> :sswitch_b
        0x1ab244 -> :sswitch_6
        0x1ab288 -> :sswitch_a
        0x1ab33a -> :sswitch_9
        0x1abde7 -> :sswitch_5
        0x1ac226 -> :sswitch_2
        0x1ac25f -> :sswitch_7
        0x1ac5ab -> :sswitch_8
        0x1ac909 -> :sswitch_1
        0x1ac968 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 15

    const/4 v12, 0x0

    const-string v0, "\u06df\u06df\u06e6"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v12, p0, Lp20;->n:Lh40;

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    const-string v0, "\u06df\u06df\u06e6"

    invoke-static {v0}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e1\u06df\u06e3"

    invoke-static {v0}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    sget v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v1, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    rem-int/lit16 v1, v1, -0x8a6

    div-int/2addr v0, v1

    if-eqz v0, :cond_1

    const-string v0, "\u06e8\u06e8\u06e1"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v1, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    xor-int/2addr v0, v1

    const v1, 0x1aa7a7

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lp20;->b:Landroid/widget/ScrollView;

    iget-object v1, p0, Lp20;->c:Landroid/widget/ScrollView;

    iget-object v2, p0, Lp20;->d:Landroid/widget/ScrollView;

    iget-object v3, p0, Lp20;->e:Landroid/widget/ScrollView;

    iget-object v4, p0, Lp20;->f:Landroid/widget/LinearLayout;

    iget-object v5, p0, Lp20;->g:Landroid/widget/LinearLayout;

    iget-object v6, p0, Lp20;->h:Landroid/widget/LinearLayout;

    iget-object v7, p0, Lp20;->i:Landroid/widget/LinearLayout;

    iget-object v8, p0, Lp20;->j:Landroid/widget/LinearLayout;

    iget-object v9, p0, Lp20;->k:Lon;

    iget-object v10, p0, Lp20;->l:Landroid/view/View;

    iget-object v11, p0, Lp20;->m:Lh40;

    iget v13, p0, Lp20;->a:I

    const/4 v14, 0x1

    invoke-static/range {v0 .. v14}, Ls20;->d(Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lon;Landroid/view/View;Lh40;Lh40;IZ)V

    const-string v0, "\u06e1\u06e1\u06e5"

    goto :goto_1

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa706 -> :sswitch_0
        0x1aa7a3 -> :sswitch_1
        0x1aae85 -> :sswitch_2
        0x1aaec5 -> :sswitch_3
    .end sparse-switch
.end method
