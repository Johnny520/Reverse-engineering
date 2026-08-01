.class public final Lv7;
.super Ljava/util/LinkedHashMap;


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 3

    sget v0, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    xor-int/lit16 v0, v0, 0x1f9

    const/high16 v1, 0x3f400000    # 0.75f

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e2\u06e3"

    invoke-static {v1}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v2, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    xor-int/lit16 v2, v2, -0x193c

    sub-int/2addr v0, v2

    if-ltz v0, :cond_4

    const/16 v0, 0x9

    sput v0, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    const-string v0, "\u06e2\u06e2\u06e6"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "vyx705n4DPuRY"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۢ۟۠ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    move-result v1

    if-gtz v1, :cond_0

    const-string v1, "\u06e7\u06e0\u06e0"

    invoke-static {v1}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_0
    sget v1, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v2, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    or-int/2addr v1, v2

    const v2, 0x1ac445

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v0, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    add-int/2addr v0, v2

    const v2, 0x1ab0d8

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    mul-int/lit16 v2, v2, 0x23b0

    mul-int/2addr v0, v2

    if-ltz v0, :cond_2

    :cond_2
    const-string v0, "\u06e2\u06e7\u06e1"

    invoke-static {v0}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_4
    iput p1, p0, Lv7;->a:I

    sget v0, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    add-int/lit16 v2, v2, 0xfcb

    div-int/2addr v0, v2

    if-eqz v0, :cond_3

    const-string v0, "\u06df\u06e6"

    :goto_2
    invoke-static {v0}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e4\u06e5\u06e6"

    goto :goto_2

    :cond_4
    sget v0, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    xor-int/2addr v0, v2

    const v2, 0x1acbef

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    move-result v0

    if-gtz v0, :cond_1

    sget v0, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    add-int/lit16 v2, v2, -0x679

    rem-int/2addr v0, v2

    if-ltz v0, :cond_5

    const/16 v0, 0x61

    sput v0, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    const-string v0, "\u06e4\u06e5\u06e6"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e0\u06e3\u06e1"

    goto/16 :goto_1

    :sswitch_6
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe7 -> :sswitch_0
        0x1aab3e -> :sswitch_1
        0x1ab33c -> :sswitch_6
        0x1aba85 -> :sswitch_5
        0x1ac223 -> :sswitch_3
        0x1ac527 -> :sswitch_2
        0x1ac929 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final removeEldestEntry(Ljava/util/Map$Entry;)Z
    .locals 2

    const-string v0, "\u06e0\u06e7\u06e1"

    invoke-static {v0}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const/4 v0, 0x0

    :goto_1
    return v0

    :cond_0
    :sswitch_1
    sget v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v1, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    xor-int/lit16 v1, v1, 0x2204

    sub-int/2addr v0, v1

    if-gtz v0, :cond_1

    const-string v0, "\u06e6\u06e7\u06df"

    invoke-static {v0}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v1, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    div-int/2addr v0, v1

    const v1, 0x1aa71e

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    invoke-super {p0}, Ljava/util/AbstractMap;->size()I

    move-result v0

    iget v1, p0, Lv7;->a:I

    if-le v0, v1, :cond_0

    sget v0, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v1, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    add-int/2addr v0, v1

    const v1, 0x1abc25

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_3
    const/4 v0, 0x1

    goto :goto_1

    :sswitch_4
    sget v0, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v1, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    rem-int/lit16 v1, v1, 0x1df1

    add-int/2addr v0, v1

    if-gtz v0, :cond_2

    const-string v0, "\u06e3\u06df\u06e0"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v1, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    or-int/2addr v0, v1

    const v1, 0x1aabdb

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aa71e -> :sswitch_0
        0x1aabba -> :sswitch_2
        0x1aaf3c -> :sswitch_1
        0x1ab2fe -> :sswitch_4
        0x1abac2 -> :sswitch_3
    .end sparse-switch
.end method
