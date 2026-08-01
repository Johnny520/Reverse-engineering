.class public final synthetic Lsc;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:I

.field public final b:Le00;

.field public final c:Landroid/widget/TextView;

.field public final d:Lon;

.field public final e:Landroid/widget/TextView;

.field public final f:Ljava/util/ArrayList;

.field public final g:I

.field public final h:Ljava/util/ArrayList;

.field public final i:Li00;

.field public final j:Lwc;


# direct methods
.method public synthetic constructor <init>(Le00;Landroid/widget/TextView;Lon;Landroid/widget/TextView;Ljava/util/ArrayList;ILjava/util/ArrayList;Li00;Lwc;I)V
    .locals 3

    iput p10, p0, Lsc;->a:I

    iput-object p1, p0, Lsc;->b:Le00;

    iput-object p2, p0, Lsc;->c:Landroid/widget/TextView;

    iput-object p3, p0, Lsc;->d:Lon;

    iput-object p4, p0, Lsc;->e:Landroid/widget/TextView;

    iput-object p5, p0, Lsc;->f:Ljava/util/ArrayList;

    iput p6, p0, Lsc;->g:I

    iput-object p7, p0, Lsc;->h:Ljava/util/ArrayList;

    iput-object p8, p0, Lsc;->i:Li00;

    iput-object p9, p0, Lsc;->j:Lwc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e0\u06df\u06e5"

    invoke-static {v1}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    const-string v0, "lPBciHIDGAiG54kJjy19B3JYnoeH"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۣ۟ۤ۟ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget v1, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    if-ltz v1, :cond_0

    const/16 v1, 0x24

    sput v1, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    const-string v1, "\u06e5\u06e6\u06e6"

    invoke-static {v1}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    goto :goto_0

    :cond_0
    sget v1, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    add-int/2addr v1, v2

    const v2, -0x1ab0b3

    xor-int/2addr v2, v1

    move v1, v0

    goto :goto_0

    :sswitch_2
    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    if-ltz v0, :cond_1

    const/16 v0, 0x38

    sput v0, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    const-string v0, "\u06e7\u06e6\u06e3"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    div-int/2addr v0, v2

    const v2, 0x1aaac6

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(I)V

    sget v0, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    add-int/lit16 v2, v2, -0x257b

    sub-int/2addr v0, v2

    if-gtz v0, :cond_2

    const/16 v0, 0xc

    sput v0, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    const-string v0, "\u06df\u06e0\u06e7"

    invoke-static {v0}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06df\u06e0\u06e7"

    goto :goto_1

    :cond_3
    :sswitch_4
    sget v0, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    mul-int/lit16 v2, v2, 0x129a

    or-int/2addr v0, v2

    if-ltz v0, :cond_4

    const/16 v0, 0x4d

    sput v0, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    const-string v0, "\u06e0\u06e0\u06e8"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    sget v0, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v2, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    div-int/2addr v0, v2

    const v2, 0x1aa726

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_5
    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    move-result v0

    if-gtz v0, :cond_3

    invoke-static {}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۥۧۧ()I

    move-result v0

    if-gtz v0, :cond_5

    :cond_5
    const-string v0, "\u06e3\u06e1\u06e5"

    invoke-static {v0}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa726 -> :sswitch_0
        0x1aaac6 -> :sswitch_5
        0x1ab2a5 -> :sswitch_3
        0x1ab647 -> :sswitch_1
        0x1ab9c8 -> :sswitch_2
        0x1abe65 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 14

    const/4 v13, 0x0

    const/4 v12, 0x1

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06e7\u06e6"

    invoke-static {v1}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v1

    move-object v11, v0

    move-object v9, v0

    move-object v2, v0

    move-object v10, v0

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {p1}, Lip;->l(Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    move-result v0

    if-gtz v0, :cond_2

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    const-string v0, "\u06e4\u06e4\u06df"

    invoke-static {v0}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :sswitch_1
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v1, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    xor-int/lit16 v1, v1, -0x14de

    xor-int/2addr v0, v1

    if-ltz v0, :cond_0

    const-string v0, "\u06e0\u06e1\u06e4"

    invoke-static {v0}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v1, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    xor-int/2addr v0, v1

    const v1, 0x1ab8fa

    add-int/2addr v0, v1

    move v1, v0

    goto :goto_0

    :sswitch_2
    iget v0, p0, Lsc;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_3
    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    move-result v0

    if-gtz v0, :cond_1

    const-string v0, "\u06e5\u06e6\u06e0"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v1, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    add-int/2addr v0, v1

    const v1, -0x1ac0bf

    xor-int/2addr v0, v1

    move v1, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e4\u06e8\u06df"

    goto :goto_1

    :sswitch_4
    iget-object v0, p0, Lsc;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lsc;->d:Lon;

    iget-object v3, p0, Lsc;->e:Landroid/widget/TextView;

    invoke-static {v0, v10, v1, v3}, Lxc;->b(Landroid/widget/TextView;Le00;Lon;Landroid/widget/TextView;)V

    sget v0, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v1, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    xor-int/2addr v0, v1

    const v1, -0x1ac75a

    xor-int/2addr v0, v1

    move v1, v0

    goto :goto_0

    :sswitch_5
    invoke-static {p1}, Lip;->l(Ljava/lang/Object;)V

    sget v0, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v1, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    div-int/lit16 v1, v1, 0x260d

    mul-int/2addr v0, v1

    if-eqz v0, :cond_3

    invoke-static {}, Lۣ۟ۢ۠۠;->۠۟ۥ۠()I

    move-object v0, v10

    :goto_2
    const-string v1, "\u06df\u06e7\u06df"

    invoke-static {v1}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v1

    move-object v10, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e3\u06e1\u06e5"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto/16 :goto_0

    :sswitch_6
    iget-object v2, p0, Lsc;->b:Le00;

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    move-result v0

    if-gtz v0, :cond_4

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    const-string v0, "\u06df\u06e1\u06df"

    :goto_3
    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v1, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    mul-int/2addr v0, v1

    const v1, -0x137075

    xor-int/2addr v0, v1

    move v1, v0

    goto/16 :goto_0

    :pswitch_0
    :sswitch_7
    sget v0, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v1, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    or-int/lit16 v1, v1, -0x1404

    or-int/2addr v0, v1

    if-ltz v0, :cond_5

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    const-string v0, "\u06e1\u06e6\u06e6"

    invoke-static {v0}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v1, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    rem-int/2addr v0, v1

    const v1, 0x1aa5db

    add-int/2addr v0, v1

    move v1, v0

    goto/16 :goto_0

    :sswitch_8
    sget-object v0, Lgn;->a:Lgn;

    sget v1, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    div-int/2addr v1, v3

    const v3, 0xdc7e

    add-int/2addr v1, v3

    move-object v11, v0

    goto/16 :goto_0

    :sswitch_9
    invoke-static {p1, v12}, Lgn;->i(Landroid/view/View;I)V

    sget v0, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    if-ltz v0, :cond_6

    invoke-static {}, Lۣ۟ۢ۠۠;->۠۟ۥ۠()I

    const-string v0, "\u06e6\u06df\u06df"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v1, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    xor-int/2addr v0, v1

    const v1, 0x1abf62

    add-int/2addr v0, v1

    move v1, v0

    goto/16 :goto_0

    :sswitch_a
    iput-boolean v12, v2, Le00;->a:Z

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    move-result v0

    if-gtz v0, :cond_7

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    const-string v0, "\u06df\u06e2\u06e5"

    invoke-static {v0}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto/16 :goto_0

    :cond_7
    sget v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v1, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    xor-int/2addr v0, v1

    const v1, 0xdd4d

    add-int/2addr v0, v1

    move v1, v0

    goto/16 :goto_0

    :sswitch_b
    iget-object v0, p0, Lsc;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lsc;->d:Lon;

    iget-object v3, p0, Lsc;->e:Landroid/widget/TextView;

    invoke-static {v0, v2, v1, v3}, Lxc;->b(Landroid/widget/TextView;Le00;Lon;Landroid/widget/TextView;)V

    const-string v0, "\u06df\u06e1\u06df"

    :goto_4
    invoke-static {v0}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto/16 :goto_0

    :sswitch_c
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    move-result v0

    if-gtz v0, :cond_8

    const-string v0, "\u06e3\u06e1\u06e5"

    invoke-static {v0}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06e6\u06df\u06df"

    goto/16 :goto_3

    :sswitch_d
    invoke-static {}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۡۢۡۥ()I

    move-result v0

    if-gtz v0, :cond_9

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    const-string v0, "\u06e7\u06e1"

    goto :goto_4

    :cond_9
    sget v0, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v1, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    rem-int/2addr v0, v1

    const v1, -0x1ab809

    xor-int/2addr v0, v1

    move v1, v0

    goto/16 :goto_0

    :sswitch_e
    invoke-static {p1, v12}, Lgn;->i(Landroid/view/View;I)V

    sget v0, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v1, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    div-int/lit16 v1, v1, -0x2429

    xor-int/2addr v0, v1

    if-gtz v0, :cond_a

    sput v13, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    const-string v0, "\u06e4\u06e3"

    :goto_5
    invoke-static {v0}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto/16 :goto_0

    :cond_a
    const-string v0, "\u06e3\u06e2\u06e3"

    goto :goto_5

    :sswitch_f
    iget-object v0, p0, Lsc;->b:Le00;

    goto/16 :goto_2

    :sswitch_10
    iget v0, p0, Lsc;->g:I

    iget-object v1, p0, Lsc;->j:Lwc;

    iget-object v3, p0, Lsc;->i:Li00;

    iget-object v4, p0, Lsc;->f:Ljava/util/ArrayList;

    iget-object v5, p0, Lsc;->h:Ljava/util/ArrayList;

    invoke-static/range {v0 .. v5}, Lxc;->c(ILwc;Le00;Li00;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    const-string v0, "\u06e3\u06e3\u06e6"

    goto/16 :goto_1

    :sswitch_11
    iget v3, p0, Lsc;->g:I

    iget-object v4, p0, Lsc;->j:Lwc;

    iget-object v6, p0, Lsc;->i:Li00;

    iget-object v7, p0, Lsc;->f:Ljava/util/ArrayList;

    iget-object v8, p0, Lsc;->h:Ljava/util/ArrayList;

    move-object v5, v10

    invoke-static/range {v3 .. v8}, Lxc;->c(ILwc;Le00;Li00;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    sget v0, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v1, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    xor-int/2addr v0, v1

    const v1, 0x1abf6b

    add-int/2addr v0, v1

    move v1, v0

    goto/16 :goto_0

    :sswitch_12
    iput-boolean v13, v10, Le00;->a:Z

    move-object v0, v9

    :cond_b
    const-string v1, "\u06e0\u06e2\u06e4"

    invoke-static {v1}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v1

    move-object v9, v0

    goto/16 :goto_0

    :sswitch_13
    sget-object v0, Lgn;->a:Lgn;

    sget v1, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    if-gez v1, :cond_b

    sget v1, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v3, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sub-int/2addr v1, v3

    const v3, 0x1ab488

    add-int/2addr v1, v3

    move-object v9, v0

    goto/16 :goto_0

    :sswitch_14
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc7f -> :sswitch_0
        0xdc9a -> :sswitch_b
        0x1aa73d -> :sswitch_10
        0x1aa762 -> :sswitch_8
        0x1aa7f7 -> :sswitch_12
        0x1aab03 -> :sswitch_7
        0x1aab22 -> :sswitch_4
        0x1aaf63 -> :sswitch_5
        0x1ab2df -> :sswitch_3
        0x1ab647 -> :sswitch_1
        0x1ab664 -> :sswitch_f
        0x1ab686 -> :sswitch_14
        0x1aba5f -> :sswitch_a
        0x1abaa3 -> :sswitch_9
        0x1abac3 -> :sswitch_2
        0x1abadb -> :sswitch_c
        0x1abda7 -> :sswitch_14
        0x1ac146 -> :sswitch_e
        0x1ac201 -> :sswitch_6
        0x1ac247 -> :sswitch_13
        0x1ac547 -> :sswitch_d
        0x1ac627 -> :sswitch_11
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
