.class public final Lg6;
.super Landroid/view/ViewOutlineProvider;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 3

    iput p1, p0, Lg6;->a:I

    iput-object p2, p0, Lg6;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e0\u06df"

    invoke-static {v1}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const-string v1, "\u06df\u06e8\u06e3"

    :goto_1
    invoke-static {v1}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    sget v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    add-int/lit16 v2, v2, -0x3e9

    div-int/2addr v1, v2

    if-eqz v1, :cond_1

    const-string v1, "\u06e2\u06e2\u06df"

    goto :goto_1

    :cond_1
    sget v1, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v2, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    mul-int/2addr v1, v2

    const v2, 0x1bbf26

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    move-result v1

    if-gtz v1, :cond_0

    sget v1, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    div-int/2addr v1, v2

    const v2, 0x1aa721

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    const-string v0, "1pz"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۤ۟ۤۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    const-string v1, "\u06df\u06e4\u06e4"

    goto :goto_1

    :sswitch_4
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    move-result v1

    if-ltz v1, :cond_2

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    const-string v1, "\u06e8\u06e0\u06df"

    invoke-static {v1}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06df\u06e8\u06e3"

    goto :goto_1

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcfd -> :sswitch_0
        0x1aa721 -> :sswitch_3
        0x1aa79f -> :sswitch_4
        0x1aa81a -> :sswitch_5
        0x1aaf3f -> :sswitch_1
        0x1ac8e7 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-string v2, "\u06e4\u06df\u06e5"

    invoke-static {v2}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v7, v0

    move-object v6, v0

    move v8, v1

    move v9, v1

    move v3, v2

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :pswitch_0
    :sswitch_1
    invoke-static {}, Landroidx/recyclerview/widget/ۧۧۦۢ;->ۣۢۦۨ()I

    move-result v0

    if-ltz v0, :cond_0

    const/16 v0, 0x13

    sput v0, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    const-string v0, "\u06e2\u06e2\u06e5"

    invoke-static {v0}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v2, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    xor-int/2addr v0, v2

    const v2, 0x1aac7e

    add-int/2addr v0, v2

    move v3, v0

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v0, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    rem-int/2addr v0, v2

    const v2, 0x1ac200

    add-int/2addr v0, v2

    move v3, v0

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v7}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    add-int/lit16 v2, v2, -0x22ef

    rem-int/2addr v0, v2

    if-ltz v0, :cond_3

    :cond_2
    const-string v0, "\u06e0\u06e6\u06e1"

    invoke-static {v0}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_3
    sget v0, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v2, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    xor-int/2addr v0, v2

    const v2, 0x1ac1ea

    xor-int/2addr v0, v2

    move v3, v0

    goto :goto_0

    :pswitch_1
    :sswitch_4
    const-string v0, "\u06e4\u06e3\u06e2"

    invoke-static {v0}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :pswitch_2
    :sswitch_5
    sget v0, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    add-int/lit16 v2, v2, -0x23cc

    sub-int/2addr v0, v2

    if-gtz v0, :cond_4

    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    const-string v0, "\u06e7\u06e8\u06e6"

    :goto_1
    invoke-static {v0}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_4
    const-string v0, "\u06e3\u06e3\u06e3"

    move-object v2, v0

    :goto_2
    invoke-static {v2}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :sswitch_6
    iget v0, p0, Lg6;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_7
    sget v0, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    if-gtz v0, :cond_d

    const-string v0, "\u06df\u06e6\u06df"

    move-object v2, v0

    :goto_3
    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :sswitch_8
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/graphics/Outline;->setAlpha(F)V

    sget v0, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    or-int/2addr v0, v2

    const v2, 0x1aac2c

    add-int/2addr v0, v2

    move v3, v0

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "UuPdYg==\n"

    const-string v2, "JIq4FQ3nVDw=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "5fAADYmzcA==\n"

    const-string v2, "ioV0YeDdFX0=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "\u06e2\u06e7\u06e2"

    move-object v2, v0

    goto :goto_2

    :sswitch_a
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    iget-object v0, p0, Lg6;->b:Ljava/lang/Object;

    check-cast v0, Lon;

    iget v5, v0, Lon;->j:F

    move-object v0, p2

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    move-result v0

    if-ltz v0, :cond_5

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    const-string v0, "\u06e1\u06df\u06e1"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e3\u06e4\u06e2"

    move-object v2, v0

    goto :goto_3

    :sswitch_b
    sget v0, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    add-int/lit16 v2, v2, -0xc7f

    div-int/2addr v0, v2

    if-eqz v0, :cond_6

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    const-string v0, "\u06e4\u06df\u06e5"

    invoke-static {v0}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_6
    sget v0, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v2, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    mul-int/2addr v0, v2

    const v2, -0x1ae850

    xor-int/2addr v0, v2

    move v3, v0

    goto/16 :goto_0

    :sswitch_c
    iget-object v0, p0, Lg6;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/chip/Chip;

    iget-object v0, v0, Lcom/google/android/material/chip/Chip;->e:Lka;

    if-eqz v0, :cond_9

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    move-result v2

    if-ltz v2, :cond_7

    const/16 v2, 0x15

    sput v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    const-string v2, "\u06e3\u06e1\u06e5"

    :goto_4
    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v6, v0

    move v3, v2

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06e4\u06e2\u06e3"

    move-object v6, v0

    goto/16 :goto_2

    :sswitch_d
    sget v0, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    mul-int/lit16 v2, v2, 0x1dea

    rem-int/2addr v0, v2

    if-ltz v0, :cond_8

    const/16 v0, 0x3d

    sput v0, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    const-string v0, "\u06e6\u06e0\u06e7"

    move-object v2, v0

    goto/16 :goto_2

    :cond_8
    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    mul-int/2addr v0, v2

    const v2, 0x1ab0f9

    add-int/2addr v0, v2

    move v3, v0

    goto/16 :goto_0

    :sswitch_e
    move-object v0, v6

    :cond_9
    sget v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    if-ltz v2, :cond_a

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    const-string v2, "\u06e0\u06e3\u06e5"

    :goto_5
    invoke-static {v2}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v6, v0

    move v3, v2

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06e8\u06e1\u06e7"

    move-object v6, v0

    goto/16 :goto_3

    :sswitch_f
    const-string v0, "l5whMA==\n"

    const-string v2, "4fVERwUj4Jk=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "5hW1ESlOIw==\n"

    const-string v2, "iWDBfUAgRrg=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    div-int/lit16 v2, v2, -0x1407

    xor-int/2addr v0, v2

    if-gtz v0, :cond_b

    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    const-string v0, "\u06e1\u06e8\u06e7"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_b
    const-string v2, "\u06e6\u06e1\u06df"

    move-object v0, v6

    goto :goto_4

    :sswitch_10
    const-string v0, "6vbUjm9mjNUEIS5a5"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۣۧۡۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v3, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    xor-int/lit16 v3, v3, 0x264b

    sub-int/2addr v2, v3

    if-ltz v2, :cond_13

    const/16 v2, 0x23

    sput v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    const-string v2, "\u06e4\u06e1\u06e1"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v7, v0

    move v3, v2

    goto/16 :goto_0

    :pswitch_3
    :sswitch_11
    sget v0, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    if-ltz v0, :cond_c

    const-string v0, "\u06e2\u06e1\u06e4"

    :goto_6
    invoke-static {v0}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_c
    sget v0, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    rem-int/2addr v0, v2

    const v2, 0x1aa722

    add-int/2addr v0, v2

    move v3, v0

    goto/16 :goto_0

    :cond_d
    const-string v0, "\u06e4\u06e2\u06e1"

    move-object v2, v0

    goto/16 :goto_3

    :sswitch_12
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    sget v2, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    xor-int/lit16 v2, v2, -0x29f

    invoke-static {v2}, Lff;->q(I)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x0

    sub-int v4, v0, v2

    iget-object v0, p0, Lg6;->b:Ljava/lang/Object;

    check-cast v0, Lon;

    iget v5, v0, Lon;->j:F

    move-object v0, p2

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    sget v0, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    if-gtz v0, :cond_e

    const/16 v0, 0xa

    sput v0, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    const-string v0, "\u06df\u06e0\u06e0"

    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_e
    const-string v2, "\u06e1\u06df\u06df"

    move-object v0, v6

    goto/16 :goto_5

    :pswitch_4
    :sswitch_13
    const-string v0, "\u06e5\u06e4\u06e1"

    invoke-static {v0}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :sswitch_14
    invoke-virtual {v6, p2}, Lka;->getOutline(Landroid/graphics/Outline;)V

    const-string v0, "\u06e4\u06e1\u06e1"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :sswitch_15
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    iget-object v0, p0, Lg6;->b:Ljava/lang/Object;

    check-cast v0, Lon;

    iget v5, v0, Lon;->j:F

    move-object v0, p2

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    sget v0, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    if-gtz v0, :cond_f

    const/16 v0, 0x63

    sput v0, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    const-string v0, "\u06df\u06e7\u06e0"

    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_f
    sget v0, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    mul-int/2addr v0, v2

    const v2, 0x735f3

    sub-int/2addr v0, v2

    move v3, v0

    goto/16 :goto_0

    :sswitch_16
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v2

    sget v3, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    add-int/lit16 v4, v4, -0xfb5

    or-int/2addr v3, v4

    if-ltz v3, :cond_10

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    const-string v3, "\u06e8\u06e3\u06e0"

    invoke-static {v3}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move v8, v0

    move v9, v2

    goto/16 :goto_0

    :cond_10
    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v4, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    add-int/2addr v3, v4

    const v4, -0x1aadbd

    xor-int/2addr v3, v4

    move v8, v0

    move v9, v2

    goto/16 :goto_0

    :pswitch_5
    :sswitch_17
    sget v0, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    if-ltz v0, :cond_11

    const-string v0, "\u06df\u06e1\u06e0"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_11
    sget v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v2, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    add-int/2addr v0, v2

    const v2, 0x1ac4dd

    add-int/2addr v0, v2

    move v3, v0

    goto/16 :goto_0

    :sswitch_18
    const-string v0, "pUvojQ==\n"

    const-string v2, "0yKN+qq4UK0=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "iq8GLPT1zQ==\n"

    const-string v2, "5dpyQJ2bqE4=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    move-result v0

    if-ltz v0, :cond_12

    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    const-string v0, "\u06e3\u06e3\u06e3"

    invoke-static {v0}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_12
    const-string v0, "\u06e4\u06e7\u06e2"

    goto/16 :goto_1

    :sswitch_19
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    iget-object v0, p0, Lg6;->b:Ljava/lang/Object;

    check-cast v0, Lon;

    iget v5, v0, Lon;->j:F

    move-object v0, p2

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    move-result v0

    if-ltz v0, :cond_1

    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    if-gtz v0, :cond_14

    move-object v0, v7

    :cond_13
    const-string v2, "\u06e2\u06e0\u06e2"

    invoke-static {v2}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v7, v0

    move v3, v2

    goto/16 :goto_0

    :cond_14
    const-string v0, "\u06e4\u06e1\u06e5"

    goto/16 :goto_6

    :sswitch_1a
    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    xor-int/lit8 v0, v0, 0x53

    invoke-static {v0}, Lff;->q(I)I

    move-result v0

    rsub-int/lit8 v2, v9, 0x0

    sub-int v4, v0, v2

    iget-object v0, p0, Lg6;->b:Ljava/lang/Object;

    check-cast v0, Lon;

    iget v5, v0, Lon;->j:F

    move-object v0, p2

    move v2, v1

    move v3, v8

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    sget v0, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    div-int/lit16 v2, v2, 0x18ad

    add-int/2addr v0, v2

    if-ltz v0, :cond_15

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    const-string v0, "\u06e1\u06df\u06df"

    invoke-static {v0}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_15
    sget v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v2, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    add-int/2addr v0, v2

    const v2, 0x1abf72

    add-int/2addr v0, v2

    move v3, v0

    goto/16 :goto_0

    :sswitch_1b
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    iget-object v0, p0, Lg6;->b:Ljava/lang/Object;

    check-cast v0, Lon;

    iget v5, v0, Lon;->j:F

    move-object v0, p2

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    move-result v0

    if-ltz v0, :cond_16

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    const-string v0, "\u06e2\u06e7\u06e0"

    invoke-static {v0}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_16
    sget v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    or-int/2addr v0, v2

    const v2, 0x1aba87

    add-int/2addr v0, v2

    move v3, v0

    goto/16 :goto_0

    :sswitch_1c
    const-string v0, "Dj84lg==\n"

    const-string v2, "eFZd4VI/qpc=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "EzH2Gf1vnw==\n"

    const-string v2, "fESCdZQB+qI=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v2, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    mul-int/lit16 v2, v2, -0x71a

    or-int/2addr v0, v2

    if-gtz v0, :cond_2

    const-string v0, "\u06df\u06e0\u06e6"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :sswitch_1d
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    iget-object v0, p0, Lg6;->b:Ljava/lang/Object;

    check-cast v0, Lon;

    iget v5, v0, Lon;->j:F

    move-object v0, p2

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    sget v0, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    xor-int/lit16 v2, v2, -0xd12

    sub-int/2addr v0, v2

    if-gtz v0, :cond_17

    const-string v0, "\u06e0\u06df\u06e6"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_17
    sget v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    rem-int/2addr v0, v2

    const v2, 0xdcd6

    xor-int/2addr v0, v2

    move v3, v0

    goto/16 :goto_0

    :sswitch_1e
    const-string v0, "PYTyjQ==\n"

    const-string v2, "S+2X+ggmCKM=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "848eZeY4rQ==\n"

    const-string v2, "nPpqCY9WyAQ=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v2, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    xor-int/2addr v0, v2

    const v2, 0x1ab022

    add-int/2addr v0, v2

    move v3, v0

    goto/16 :goto_0

    :sswitch_1f
    sget v0, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sub-int/2addr v0, v2

    const v2, 0x1ab7fb

    add-int/2addr v0, v2

    move v3, v0

    goto/16 :goto_0

    :sswitch_20
    const-string v0, "bGHdgg==\n"

    const-string v2, "Ggi49W79aaA=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "ExGJlTuaMQ==\n"

    const-string v2, "fGT9+VL0VKE=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    xor-int/lit16 v2, v2, -0x1d0e

    sub-int/2addr v0, v2

    if-ltz v0, :cond_18

    const/16 v0, 0xe

    sput v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    const-string v0, "\u06e6\u06e1\u06df"

    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_18
    sget v0, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    or-int/2addr v0, v2

    const v2, 0x1aa4af

    add-int/2addr v0, v2

    move v3, v0

    goto/16 :goto_0

    :sswitch_21
    const-string v0, "hUuHmA==\n"

    const-string v2, "8yLi758/+4s=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "vSDK+x2cdg==\n"

    const-string v2, "0lW+l3TyE1w=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    div-int/2addr v0, v2

    const v2, 0x1aa720

    add-int/2addr v0, v2

    move v3, v0

    goto/16 :goto_0

    :pswitch_6
    :sswitch_22
    sget v0, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sub-int/2addr v0, v2

    const v2, 0x1abb56

    add-int/2addr v0, v2

    move v3, v0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc46 -> :sswitch_0
        0xdcd9 -> :sswitch_0
        0x1aa71f -> :sswitch_a
        0x1aa725 -> :sswitch_7
        0x1aa7f8 -> :sswitch_f
        0x1aa7fe -> :sswitch_1b
        0x1aaac7 -> :sswitch_11
        0x1aab03 -> :sswitch_17
        0x1aab83 -> :sswitch_0
        0x1aab9b -> :sswitch_19
        0x1aabd8 -> :sswitch_13
        0x1aae81 -> :sswitch_0
        0x1aae83 -> :sswitch_15
        0x1aaf5f -> :sswitch_1a
        0x1aafa0 -> :sswitch_1c
        0x1ab264 -> :sswitch_3
        0x1ab33b -> :sswitch_1
        0x1ab33d -> :sswitch_12
        0x1ab647 -> :sswitch_22
        0x1ab67f -> :sswitch_e
        0x1ab683 -> :sswitch_21
        0x1ab6a1 -> :sswitch_0
        0x1ab722 -> :sswitch_d
        0x1ab9ca -> :sswitch_6
        0x1ab9cb -> :sswitch_9
        0x1aba04 -> :sswitch_b
        0x1aba08 -> :sswitch_10
        0x1aba23 -> :sswitch_c
        0x1aba25 -> :sswitch_14
        0x1aba43 -> :sswitch_18
        0x1aba84 -> :sswitch_0
        0x1ababf -> :sswitch_16
        0x1abd85 -> :sswitch_0
        0x1abe22 -> :sswitch_1e
        0x1ac184 -> :sswitch_1d
        0x1ac208 -> :sswitch_2
        0x1ac209 -> :sswitch_0
        0x1ac50a -> :sswitch_4
        0x1ac602 -> :sswitch_20
        0x1ac607 -> :sswitch_1f
        0x1ac90e -> :sswitch_8
        0x1ac945 -> :sswitch_5
        0x1ac9a8 -> :sswitch_d
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_2
        :pswitch_5
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_6
    .end packed-switch
.end method
