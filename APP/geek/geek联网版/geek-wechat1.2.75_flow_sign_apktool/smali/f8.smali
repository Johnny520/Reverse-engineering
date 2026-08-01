.class public final Lf8;
.super Ljava/util/LinkedHashMap;


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 4

    const/4 v3, 0x1

    sget v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    xor-int/lit16 v0, v0, -0x21b

    const/high16 v1, 0x3f400000    # 0.75f

    invoke-direct {p0, v0, v1, v3}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06e1\u06e7"

    invoke-static {v1}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :cond_0
    :sswitch_1
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    if-ltz v0, :cond_1

    const/16 v0, 0x37

    sput v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    const-string v0, "\u06df\u06e8"

    invoke-static {v0}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    mul-int/2addr v0, v2

    const v2, 0x19b8e3

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    sget v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    div-int/lit16 v2, v2, -0xde4

    xor-int/2addr v0, v2

    if-ltz v0, :cond_2

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    const-string v0, "\u06e8\u06e1"

    invoke-static {v0}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e4\u06e1\u06e7"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_3
    const-string v0, "uycIGl"

    invoke-static {v0}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۥۣۧۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget v1, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    rem-int/2addr v1, v2

    const v2, 0x1ac2e4

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    move-result v0

    if-ltz v0, :cond_3

    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    const-string v0, "\u06e8\u06e6\u06e0"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    sget v0, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    add-int/2addr v0, v2

    const v2, 0x1ab6b8

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    if-ltz v0, :cond_4

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    const-string v0, "\u06e6\u06e5\u06e2"

    :goto_1
    invoke-static {v0}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    or-int/2addr v0, v2

    const v2, 0x1aabe5

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    iput p1, p0, Lf8;->a:I

    sget v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    rem-int/lit16 v2, v2, -0x1822

    add-int/2addr v0, v2

    if-gtz v0, :cond_5

    sput v3, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    const-string v0, "\u06e6\u06e6\u06e4"

    invoke-static {v0}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e1\u06e2\u06e4"

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaae1 -> :sswitch_0
        0x1aaee3 -> :sswitch_4
        0x1ab704 -> :sswitch_3
        0x1aba0a -> :sswitch_6
        0x1ac203 -> :sswitch_1
        0x1ac224 -> :sswitch_5
        0x1ac9a2 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final removeEldestEntry(Ljava/util/Map$Entry;)Z
    .locals 2

    const-string v0, "\u06df\u06e7\u06df"

    invoke-static {v0}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v0, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v1, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    div-int/2addr v0, v1

    const v1, 0x1ac5c6

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v1, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    div-int/2addr v0, v1

    const v1, 0x1aa7f7

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    const/4 v0, 0x0

    :goto_1
    return v0

    :sswitch_3
    const/4 v0, 0x1

    goto :goto_1

    :sswitch_4
    invoke-super {p0}, Ljava/util/AbstractMap;->size()I

    move-result v0

    iget v1, p0, Lf8;->a:I

    if-le v0, v1, :cond_0

    sget v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v1, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    mul-int/2addr v0, v1

    const v1, 0x1a79ca

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aa745 -> :sswitch_0
        0x1aa782 -> :sswitch_3
        0x1aa7f7 -> :sswitch_4
        0x1ab288 -> :sswitch_1
        0x1ac5c2 -> :sswitch_2
    .end sparse-switch
.end method
