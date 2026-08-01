.class public final synthetic Lzr;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:I

.field public final b:Landroid/widget/ScrollView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/ScrollView;I)V
    .locals 5

    iput p2, p0, Lzr;->a:I

    iput-object p1, p0, Lzr;->b:Landroid/widget/ScrollView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    const-string v2, "\u06e0\u06df"

    invoke-static {v2}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v4

    move-wide v2, v0

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    move-result v0

    if-gtz v0, :cond_1

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u06e0\u06df\u06e8"

    invoke-static {v0}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "jUVoeWS1wAmj5qfeeTiBw4xQnn"

    invoke-static {v0}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۦۡۨۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget v2, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v3, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    div-int/2addr v2, v3

    const v3, -0x1ac5a6

    xor-int v4, v2, v3

    move-wide v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e0\u06e8\u06e0"

    invoke-static {v0}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    if-gtz v0, :cond_2

    invoke-static {}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۦ۟ۥۣ()I

    const-string v0, "\u06e4\u06e4\u06e8"

    :goto_1
    invoke-static {v0}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e2\u06e8\u06e0"

    goto :goto_1

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v2, v3}, Ljava/io/PrintStream;->println(J)V

    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    mul-int/lit16 v1, v1, 0x211a

    or-int/2addr v0, v1

    if-ltz v0, :cond_3

    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    :cond_3
    const-string v0, "\u06e2\u06e8\u06e0"

    invoke-static {v0}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_4
    const-string v0, "\u06e0\u06df"

    invoke-static {v0}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbff -> :sswitch_0
        0x1aaac9 -> :sswitch_4
        0x1aab7e -> :sswitch_2
        0x1aabd8 -> :sswitch_1
        0x1ab35a -> :sswitch_5
        0x1ac5a5 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 2

    const-string v0, "\u06e6\u06e2\u06e1"

    invoke-static {v0}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e6\u06e2\u06e1"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :pswitch_0
    :sswitch_1
    sget v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    xor-int/lit16 v1, v1, 0x110f

    xor-int/2addr v0, v1

    if-gtz v0, :cond_0

    const-string v0, "\u06e0\u06e1\u06e5"

    invoke-static {v0}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v1, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    rem-int/2addr v0, v1

    const v1, 0x1ab74c

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    iget v0, p0, Lzr;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_3
    sget v0, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v1, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sub-int/2addr v0, v1

    const v1, 0x1ab067

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_4
    iget-object v0, p0, Lzr;->b:Landroid/widget/ScrollView;

    sget v1, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    xor-int/lit16 v1, v1, 0x3a8

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->fullScroll(I)Z

    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    if-gtz v0, :cond_2

    const/16 v0, 0x29

    sput v0, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    :cond_1
    const-string v0, "\u06e5\u06e3\u06e6"

    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v1, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    xor-int/2addr v0, v1

    const v1, 0x1ab2b8

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_5
    iget-object v0, p0, Lzr;->b:Landroid/widget/ScrollView;

    sget v1, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    xor-int/lit16 v1, v1, -0x23d

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->fullScroll(I)Z

    sget v0, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v1, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    div-int/lit16 v1, v1, 0x252b

    add-int/2addr v0, v1

    if-ltz v0, :cond_1

    const/16 v0, 0x27

    sput v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    const-string v0, "\u06e6\u06e2\u06e1"

    invoke-static {v0}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_6
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aaec3 -> :sswitch_0
        0x1ab269 -> :sswitch_5
        0x1ab287 -> :sswitch_6
        0x1ab720 -> :sswitch_4
        0x1abe08 -> :sswitch_6
        0x1abe66 -> :sswitch_3
        0x1ac1a5 -> :sswitch_2
        0x1ac9c1 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
