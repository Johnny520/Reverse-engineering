.class public final synthetic Ln20;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Landroid/widget/ScrollView;

.field public final b:Landroid/widget/ScrollView;

.field public final c:Landroid/widget/ScrollView;

.field public final d:Landroid/widget/ScrollView;

.field public final e:Landroid/widget/LinearLayout;

.field public final f:Landroid/widget/LinearLayout;

.field public final g:Landroid/widget/LinearLayout;

.field public final h:Landroid/widget/LinearLayout;

.field public final i:Landroid/widget/LinearLayout;

.field public final j:Lon;

.field public final k:Landroid/view/View;

.field public final l:Lh40;

.field public final m:Lh40;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lon;Landroid/view/View;Lh40;Lh40;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v2, "\u06e6\u06e8\u06e8"

    invoke-static {v2}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p5, p0, Ln20;->e:Landroid/widget/LinearLayout;

    iput-object p6, p0, Ln20;->f:Landroid/widget/LinearLayout;

    :cond_0
    const-string v2, "\u06e2\u06e8\u06e5"

    invoke-static {v2}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_1
    iput-object p7, p0, Ln20;->g:Landroid/widget/LinearLayout;

    iput-object p8, p0, Ln20;->h:Landroid/widget/LinearLayout;

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    move-result v2

    if-ltz v2, :cond_1

    const-string v2, "\u06e1\u06e8\u06e3"

    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_1
    const-string v2, "\u06e5\u06e6\u06e3"

    :goto_1
    invoke-static {v2}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_2
    iput-object p9, p0, Ln20;->i:Landroid/widget/LinearLayout;

    iput-object p10, p0, Ln20;->j:Lon;

    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v3, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    add-int/lit16 v3, v3, 0xf8a

    xor-int/2addr v2, v3

    if-ltz v2, :cond_2

    const-string v2, "\u06e1\u06e0\u06e0"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_2
    sget v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v3, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    xor-int/2addr v2, v3

    const v3, -0x1abe00

    xor-int/2addr v2, v3

    goto :goto_0

    :cond_3
    :sswitch_3
    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v3, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    or-int/2addr v2, v3

    const v3, 0x1ab009

    add-int/2addr v2, v3

    goto :goto_0

    :sswitch_4
    iput-object p3, p0, Ln20;->c:Landroid/widget/ScrollView;

    iput-object p4, p0, Ln20;->d:Landroid/widget/ScrollView;

    const-string v2, "\u06df\u06e1\u06e5"

    goto :goto_1

    :sswitch_5
    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    if-ltz v2, :cond_4

    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    const-string v2, "\u06e7\u06e5"

    goto :goto_1

    :cond_4
    const-string v2, "\u06e6\u06e8\u06e8"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_6
    const-string v1, "rNH6WAqaGr"

    invoke-static {v1}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡۥۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    invoke-static {}, Landroidx/recyclerview/widget/ۧۧۦۢ;->ۣۢۦۨ()I

    move-result v2

    if-gez v2, :cond_0

    sget v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v3, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    mul-int/2addr v2, v3

    const v3, 0x228f57

    add-int/2addr v2, v3

    goto :goto_0

    :sswitch_7
    iput-object p1, p0, Ln20;->a:Landroid/widget/ScrollView;

    iput-object p2, p0, Ln20;->b:Landroid/widget/ScrollView;

    sget v2, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v3, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    add-int/lit16 v3, v3, 0x1b58

    xor-int/2addr v2, v3

    if-ltz v2, :cond_5

    const-string v2, "\u06e6\u06e8\u06e8"

    invoke-static {v2}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :cond_5
    const-string v2, "\u06e3\u06e0\u06e5"

    goto :goto_1

    :sswitch_8
    move-object/from16 v0, p13

    iput-object v0, p0, Ln20;->m:Lh40;

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    move-result v2

    if-gtz v2, :cond_3

    const-string v2, "\u06e1\u06e0\u06e0"

    goto/16 :goto_1

    :sswitch_9
    iput-object p11, p0, Ln20;->k:Landroid/view/View;

    move-object/from16 v0, p12

    iput-object v0, p0, Ln20;->l:Lh40;

    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    div-int/lit16 v3, v3, 0xdf2

    mul-int/2addr v2, v3

    if-eqz v2, :cond_6

    const/16 v2, 0x52

    sput v2, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    const-string v2, "\u06df\u06e1\u06e5"

    :goto_2
    invoke-static {v2}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :cond_6
    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v3, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    rem-int/2addr v2, v3

    const v3, -0x1acb51

    xor-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_a
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v2, "\u06e1\u06e2\u06df"

    goto :goto_2

    :sswitch_b
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa743 -> :sswitch_0
        0x1aaea1 -> :sswitch_6
        0x1aaede -> :sswitch_b
        0x1aaf9c -> :sswitch_3
        0x1ab35f -> :sswitch_1
        0x1ab628 -> :sswitch_4
        0x1abde6 -> :sswitch_9
        0x1abe06 -> :sswitch_5
        0x1abe62 -> :sswitch_2
        0x1ac266 -> :sswitch_7
        0x1ac925 -> :sswitch_a
        0x1ac9c3 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 15

    const/4 v13, 0x0

    const-string v0, "\u06e0\u06e5\u06e2"

    invoke-static {v0}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v1, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sub-int/2addr v0, v1

    const v1, 0x1ab04b

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Ln20;->a:Landroid/widget/ScrollView;

    iget-object v1, p0, Ln20;->b:Landroid/widget/ScrollView;

    iget-object v2, p0, Ln20;->c:Landroid/widget/ScrollView;

    iget-object v3, p0, Ln20;->d:Landroid/widget/ScrollView;

    iget-object v4, p0, Ln20;->e:Landroid/widget/LinearLayout;

    iget-object v5, p0, Ln20;->f:Landroid/widget/LinearLayout;

    iget-object v6, p0, Ln20;->g:Landroid/widget/LinearLayout;

    iget-object v7, p0, Ln20;->h:Landroid/widget/LinearLayout;

    iget-object v8, p0, Ln20;->i:Landroid/widget/LinearLayout;

    iget-object v9, p0, Ln20;->j:Lon;

    iget-object v10, p0, Ln20;->k:Landroid/view/View;

    iget-object v11, p0, Ln20;->l:Lh40;

    iget-object v12, p0, Ln20;->m:Lh40;

    move v14, v13

    invoke-static/range {v0 .. v14}, Ls20;->d(Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lon;Landroid/view/View;Lh40;Lh40;IZ)V

    sget v0, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v1, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sub-int/2addr v0, v1

    const v1, -0x1aca0e

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa817 -> :sswitch_0
        0x1aab7d -> :sswitch_1
        0x1ac8ec -> :sswitch_2
    .end sparse-switch
.end method
