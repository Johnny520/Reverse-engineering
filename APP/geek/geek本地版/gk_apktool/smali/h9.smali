.class public final Lh9;
.super Ljava/lang/ThreadLocal;


# instance fields
.field public final a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 3

    iput p1, p0, Lh9;->a:I

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e7\u06df\u06e2"

    invoke-static {v1}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u06e0\u06e3\u06e4"

    :goto_1
    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06df\u06e3"

    goto :goto_1

    :sswitch_2
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    if-gtz v0, :cond_1

    const-string v0, "\u06e0\u06df"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    or-int/2addr v0, v2

    const v2, 0x1ac631

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    const-string v0, "MNpbvepmspXqYzuYsMIZ7cO049"

    invoke-static {v0}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۧۢ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget v1, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    mul-int/2addr v1, v2

    const v2, 0x20a9e0    # 2.999676E-39f

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :cond_2
    :sswitch_4
    sget v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    mul-int/lit16 v2, v2, -0x17c9

    mul-int/2addr v0, v2

    if-gtz v0, :cond_3

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    const-string v0, "\u06e1\u06e7"

    invoke-static {v0}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    sget v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    rem-int/2addr v0, v2

    const v2, 0xdabe

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    move-result v0

    if-gtz v0, :cond_2

    sget v0, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    xor-int/lit16 v2, v2, -0xfb8

    add-int/2addr v0, v2

    if-gtz v0, :cond_4

    const/16 v0, 0x2a

    sput v0, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    const-string v0, "\u06df\u06e0\u06e8"

    invoke-static {v0}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    sget v0, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v2, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    or-int/2addr v0, v2

    const v2, -0x1ab3be

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdbe4 -> :sswitch_0
        0x1aa727 -> :sswitch_4
        0x1aab41 -> :sswitch_2
        0x1ab2a2 -> :sswitch_1
        0x1ab31d -> :sswitch_3
        0x1ac50a -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final initialValue()Ljava/lang/Object;
    .locals 3

    const-string v0, "\u06e6\u06e1\u06e4"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    :goto_1
    return-object v0

    :sswitch_1
    sget v0, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v1, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    mul-int/2addr v0, v1

    const v1, 0x16a150

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    iget v0, p0, Lh9;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_3
    sget v0, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v1, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    or-int/2addr v0, v1

    const v1, -0x1aa800

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_4
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "PK9V5pbxePM=\n"

    const-string v2, "dOdvi/vLC4A=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    goto :goto_1

    :pswitch_0
    :sswitch_5
    invoke-static {}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->۟ۡۨۢ()I

    move-result v0

    if-gtz v0, :cond_0

    const/16 v0, 0x53

    sput v0, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    const-string v0, "\u06e4\u06e4\u06df"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v1, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    rem-int/2addr v0, v1

    const v1, -0x1aab6e

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aa7fd -> :sswitch_0
        0x1aab3d -> :sswitch_4
        0x1abd8e -> :sswitch_1
        0x1abe82 -> :sswitch_3
        0x1ac189 -> :sswitch_2
        0x1ac583 -> :sswitch_5
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
