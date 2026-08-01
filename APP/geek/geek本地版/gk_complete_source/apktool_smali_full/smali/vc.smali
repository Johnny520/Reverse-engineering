.class public final Lvc;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final a:Li00;

.field public final b:Ljava/util/ArrayList;

.field public final c:I

.field public final d:Ljava/util/ArrayList;

.field public final e:Lwc;

.field public final f:Le00;


# direct methods
.method public constructor <init>(ILwc;Le00;Li00;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06e4\u06e7"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    iput-object p2, p0, Lvc;->e:Lwc;

    sget v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    if-ltz v0, :cond_5

    const-string v0, "\u06df\u06e6\u06e1"

    invoke-static {v0}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    iput-object p6, p0, Lvc;->d:Ljava/util/ArrayList;

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    move-result v0

    if-gtz v0, :cond_0

    :cond_0
    const-string v0, "\u06df\u06e3\u06e8"

    :goto_1
    invoke-static {v0}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_3
    const-string v0, "oAW"

    invoke-static {v0}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۥ۠۠۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    const-string v1, "\u06e3\u06e1\u06e4"

    invoke-static {v1}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_1
    :sswitch_4
    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    if-gtz v0, :cond_2

    const/16 v0, 0x1c

    sput v0, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    const-string v0, "\u06e8\u06e2\u06e5"

    invoke-static {v0}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v2, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    div-int/2addr v0, v2

    const v2, 0xdc22

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    iput-object p4, p0, Lvc;->a:Li00;

    const-string v0, "\u06e3\u06e5\u06df"

    goto :goto_1

    :sswitch_6
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    add-int/lit16 v2, v2, -0x308

    xor-int/2addr v0, v2

    if-gtz v0, :cond_3

    const/16 v0, 0x26

    sput v0, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    const-string v0, "\u06df\u06e4\u06e8"

    invoke-static {v0}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e1\u06e4"

    :goto_2
    invoke-static {v0}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_7
    iput-object p3, p0, Lvc;->f:Le00;

    sget v0, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    if-gtz v0, :cond_4

    :goto_3
    const-string v0, "\u06e6\u06e0"

    goto :goto_2

    :cond_4
    const-string v0, "\u06e8\u06e6\u06e6"

    goto :goto_1

    :sswitch_8
    iput-object p5, p0, Lvc;->b:Ljava/util/ArrayList;

    goto :goto_3

    :sswitch_9
    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    move-result v0

    if-gtz v0, :cond_1

    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    move-result v0

    if-gtz v0, :cond_6

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    :cond_5
    const-string v0, "\u06e3\u06e8\u06e8"

    :goto_4
    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e7\u06e6\u06e5"

    goto :goto_4

    :sswitch_a
    iput p1, p0, Lvc;->c:I

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    move-result v0

    if-gtz v0, :cond_7

    const/16 v0, 0x61

    sput v0, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    const-string v0, "\u06e1\u06e4\u06e7"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u06df\u06e6\u06e1"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_b
    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    or-int/2addr v0, v2

    const v2, -0x1aaff6

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc23 -> :sswitch_0
        0xdcba -> :sswitch_a
        0x1aa784 -> :sswitch_1
        0x1aa7a3 -> :sswitch_b
        0x1aa7da -> :sswitch_2
        0x1aaf20 -> :sswitch_4
        0x1aaf24 -> :sswitch_5
        0x1ab646 -> :sswitch_6
        0x1ab6bd -> :sswitch_8
        0x1ab723 -> :sswitch_7
        0x1ac5e6 -> :sswitch_3
        0x1ac9a8 -> :sswitch_9
    .end sparse-switch
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 10

    const/4 v0, 0x0

    const-string v1, "\u06e0\u06e6\u06e4"

    invoke-static {v1}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v4

    move-object v2, v0

    move-object v1, v0

    move-object v3, v0

    move-object v9, v0

    move-object v6, v0

    move-object v8, v0

    move-object v7, v0

    move v5, v4

    :goto_0
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    if-eqz v9, :cond_c

    const-string v0, "\u06e5\u06e6\u06e2"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :sswitch_1
    iput-object v7, v3, Li00;->b:Ljava/lang/Object;

    sget v0, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    if-gtz v0, :cond_0

    const/16 v0, 0x5d

    sput v0, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    const-string v0, "\u06e0\u06e6\u06e7"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e7\u06e5"

    :goto_2
    invoke-static {v0}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :sswitch_2
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v9, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    move-result v4

    if-ltz v4, :cond_1

    move-object v4, v7

    :goto_3
    const-string v5, "\u06e3\u06e0\u06df"

    invoke-static {v5}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v5

    move-object v6, v0

    move-object v7, v4

    goto :goto_0

    :cond_1
    const-string v4, "\u06e0\u06e6\u06e7"

    move-object v6, v0

    :goto_4
    invoke-static {v4}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :sswitch_3
    if-eqz p1, :cond_c

    sget v0, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    if-ltz v0, :cond_2

    :goto_5
    const-string v0, "\u06e4\u06df\u06e8"

    invoke-static {v0}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :sswitch_4
    move-object v0, v6

    move-object v4, v8

    goto :goto_3

    :sswitch_5
    sget v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v4, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    xor-int/lit16 v4, v4, 0xfe

    div-int/2addr v0, v4

    if-eqz v0, :cond_3

    const/16 v0, 0x4c

    sput v0, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    move-object v7, v6

    :cond_2
    const-string v0, "\u06e3\u06e4\u06e0"

    move-object v4, v0

    goto :goto_4

    :cond_3
    sget v0, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    xor-int/2addr v0, v4

    const v4, 0x1aae2d

    add-int/2addr v0, v4

    move-object v7, v6

    move v5, v0

    goto :goto_0

    :sswitch_6
    iget-object v1, p0, Lvc;->e:Lwc;

    sget v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    xor-int/lit16 v4, v4, -0x75e

    mul-int/2addr v0, v4

    if-ltz v0, :cond_4

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    :cond_4
    const-string v0, "\u06e7\u06e1\u06e0"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :sswitch_7
    const-string v8, ""

    sget v0, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    if-ltz v0, :cond_6

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    :cond_5
    const-string v0, "\u06df\u06e7\u06e3"

    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v4, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    div-int/2addr v0, v4

    const v4, 0x1ac8fe

    add-int/2addr v0, v4

    move v5, v0

    goto/16 :goto_0

    :sswitch_8
    sget v0, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v4, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    or-int/lit16 v4, v4, -0x126c

    xor-int/2addr v0, v4

    if-ltz v0, :cond_7

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    const-string v0, "\u06e5\u06e3\u06e8"

    goto/16 :goto_1

    :cond_7
    sget v0, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v4, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    mul-int/2addr v0, v4

    const v4, 0x26ea72

    add-int/2addr v0, v4

    move v5, v0

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "\u06e6\u06e5\u06e4"

    invoke-static {v0}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :sswitch_a
    sget v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v4, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    div-int/lit16 v4, v4, 0x691

    sub-int/2addr v0, v4

    if-ltz v0, :cond_8

    const/16 v0, 0x1d

    sput v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    const-string v0, "\u06df\u06e8\u06e4"

    :goto_6
    invoke-static {v0}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06e0\u06e6\u06e4"

    goto :goto_6

    :sswitch_b
    iget-object v2, p0, Lvc;->f:Le00;

    goto/16 :goto_5

    :sswitch_c
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    div-int/lit16 v5, v5, 0x1554

    or-int/2addr v4, v5

    if-gtz v4, :cond_9

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    const-string v4, "\u06e0\u06e6\u06e4"

    invoke-static {v4}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v4

    move-object v9, v0

    move v5, v4

    goto/16 :goto_0

    :cond_9
    sget v4, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v5, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    div-int/2addr v4, v5

    const v5, 0xdc61

    add-int/2addr v4, v5

    move-object v9, v0

    move v5, v4

    goto/16 :goto_0

    :sswitch_d
    const-string v0, "rxGh7yrenty6DYioc5XCtg==\n"

    const-string v4, "237tgF277J8=\n"

    invoke-static {v0, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/appcompat/app/ۥۦۣ۠;->ۨۤ۠ۨ()I

    move-result v0

    if-gtz v0, :cond_a

    const-string v0, "\u06e7\u06e5"

    goto/16 :goto_2

    :cond_a
    const-string v0, "\u06df\u06e0\u06e4"

    goto :goto_6

    :sswitch_e
    iget v0, p0, Lvc;->c:I

    iget-object v4, p0, Lvc;->b:Ljava/util/ArrayList;

    iget-object v5, p0, Lvc;->d:Ljava/util/ArrayList;

    invoke-static/range {v0 .. v5}, Lxc;->c(ILwc;Le00;Li00;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    sget v0, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    if-gtz v0, :cond_b

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    const-string v0, "\u06e0\u06e2\u06e2"

    invoke-static {v0}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_b
    sget v0, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sub-int/2addr v0, v4

    const v4, 0x1ab88c

    add-int/2addr v0, v4

    move v5, v0

    goto/16 :goto_0

    :sswitch_f
    iget-object v3, p0, Lvc;->a:Li00;

    invoke-static {}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۦ۟ۥۣ()I

    move-result v0

    if-gtz v0, :cond_5

    const-string v0, "\u06e1\u06e3\u06df"

    invoke-static {v0}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_c
    :sswitch_10
    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    move-result v0

    if-ltz v0, :cond_d

    const/16 v0, 0x62

    sput v0, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    const-string v0, "\u06e5\u06e6\u06e5"

    invoke-static {v0}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_d
    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v4, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    div-int/2addr v0, v4

    const v4, 0x1aa733

    add-int/2addr v0, v4

    move v5, v0

    goto/16 :goto_0

    :sswitch_11
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc5d -> :sswitch_0
        0xdcde -> :sswitch_6
        0x1aa723 -> :sswitch_5
        0x1aa761 -> :sswitch_7
        0x1aa7fb -> :sswitch_1
        0x1aab20 -> :sswitch_9
        0x1aab9e -> :sswitch_3
        0x1aaba1 -> :sswitch_d
        0x1aaefd -> :sswitch_a
        0x1ab622 -> :sswitch_f
        0x1ab69f -> :sswitch_c
        0x1ab9cd -> :sswitch_e
        0x1ab9e5 -> :sswitch_11
        0x1aba04 -> :sswitch_10
        0x1abe61 -> :sswitch_2
        0x1ac205 -> :sswitch_8
        0x1ac546 -> :sswitch_b
        0x1ac547 -> :sswitch_8
        0x1ac906 -> :sswitch_4
    .end sparse-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    const-string v0, "\u06e8\u06e0\u06e6"

    invoke-static {v0}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v1, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    div-int/2addr v0, v1

    const v1, 0x1ac8ee

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aba47 -> :sswitch_0
        0x1ac8ee -> :sswitch_1
    .end sparse-switch
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    const-string v0, "\u06e6\u06e4\u06e0"

    invoke-static {v0}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v1, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    rem-int/lit16 v1, v1, 0x1f00

    div-int/2addr v0, v1

    if-ltz v0, :cond_0

    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    const-string v0, "\u06e3\u06e7\u06df"

    invoke-static {v0}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v1, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    mul-int/2addr v0, v1

    const v1, 0x18bf4a

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aab05 -> :sswitch_0
        0x1ac1e2 -> :sswitch_1
    .end sparse-switch
.end method
