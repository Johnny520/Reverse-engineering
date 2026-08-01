.class public final Lqv;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final a:Li00;

.field public final b:Ljava/util/ArrayList;

.field public final c:Lg00;

.field public final d:Li00;


# direct methods
.method public constructor <init>(Lg00;Li00;Li00;Ljava/util/ArrayList;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e5\u06e2"

    invoke-static {v1}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    move-result v0

    if-ltz v0, :cond_7

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    const-string v0, "\u06e0\u06df\u06e5"

    invoke-static {v0}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v2, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    div-int/lit16 v2, v2, -0x1eb

    add-int/2addr v0, v2

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    const-string v0, "\u06e1\u06e1\u06e0"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    iput-object p4, p0, Lqv;->b:Ljava/util/ArrayList;

    sget v0, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    div-int/lit16 v2, v2, 0x1152

    add-int/2addr v0, v2

    if-ltz v0, :cond_1

    :cond_0
    const-string v0, "\u06e7\u06e3\u06e8"

    invoke-static {v0}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    div-int/2addr v0, v2

    const v2, 0x1ac1ca

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    move-result v0

    if-gtz v0, :cond_3

    sget v0, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v2, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    xor-int/lit16 v2, v2, -0x1ff

    sub-int/2addr v0, v2

    if-gtz v0, :cond_2

    const/16 v0, 0xa

    sput v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    const-string v0, "\u06df\u06e6"

    :goto_1
    invoke-static {v0}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06df\u06e3\u06e1"

    goto :goto_1

    :cond_3
    :sswitch_4
    sget v0, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    if-gtz v0, :cond_4

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    const-string v0, "\u06e1\u06e1\u06e5"

    :goto_2
    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    const-string v0, "\u06e7\u06e3\u06e8"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_5
    iput-object p1, p0, Lqv;->c:Lg00;

    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    or-int/lit16 v2, v2, -0x148e

    sub-int/2addr v0, v2

    if-ltz v0, :cond_5

    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    const-string v0, "\u06e2\u06e6\u06e8"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    or-int/2addr v0, v2

    const v2, -0x1aacc9

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    iput-object p3, p0, Lqv;->d:Li00;

    const-string v0, "\u06e2\u06e2\u06e7"

    goto :goto_2

    :sswitch_7
    const-string v0, "VbNvQBKku52qlgUej6BGyxaHZc73"

    invoke-static {v0}, L۠ۡۢۨ;->۠ۨۡ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget v1, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v2, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    div-int/lit16 v2, v2, -0x14a1

    add-int/2addr v1, v2

    if-ltz v1, :cond_6

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    const-string v1, "\u06e8\u06e5\u06e2"

    invoke-static {v1}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06e7\u06e6\u06e7"

    invoke-static {v1}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_8
    iput-object p2, p0, Lqv;->a:Li00;

    const-string v0, "\u06e2\u06e6\u06e8"

    goto :goto_1

    :cond_7
    const-string v0, "\u06e8\u06e5\u06e2"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe7 -> :sswitch_0
        0x1aa77d -> :sswitch_7
        0x1aaec0 -> :sswitch_6
        0x1ab2a7 -> :sswitch_3
        0x1ab324 -> :sswitch_2
        0x1abadc -> :sswitch_4
        0x1ac1ca -> :sswitch_5
        0x1ac58c -> :sswitch_9
        0x1ac5e8 -> :sswitch_1
        0x1ac985 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 5

    const/4 v1, 0x0

    const-string v0, "\u06e3\u06e7\u06e6"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v1

    move-object v0, v1

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v1, p0, Lqv;->c:Lg00;

    iget-object v3, p0, Lqv;->d:Li00;

    iget-object v4, p0, Lqv;->b:Ljava/util/ArrayList;

    invoke-static {v1, v0, v3, v4}, Luv;->g(Lg00;Li00;Li00;Ljava/util/ArrayList;)V

    sget v1, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v3, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    div-int/lit16 v3, v3, 0x15ad

    xor-int/2addr v1, v3

    if-gtz v1, :cond_0

    invoke-static {}, Landroidx/recyclerview/widget/ۧۧۦۢ;->ۣۢۦۨ()I

    const-string v1, "\u06e1\u06e8"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_0
    sget v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v3, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    rem-int/2addr v1, v3

    const v3, 0x1aab7e

    xor-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_1
    iput-object v2, v0, Li00;->b:Ljava/lang/Object;

    const-string v1, "\u06e1\u06e8"

    :goto_2
    invoke-static {v1}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    move-result v1

    if-gtz v1, :cond_1

    const-string v1, "\u06e2\u06e2"

    :goto_3
    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e3\u06e7\u06e6"

    goto :goto_3

    :sswitch_3
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    if-gtz v2, :cond_2

    const-string v2, "\u06e0\u06e5\u06e3"

    invoke-static {v2}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v1

    goto :goto_0

    :cond_2
    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    rem-int/2addr v2, v3

    const v3, 0x1ab2db

    add-int/2addr v3, v2

    move-object v2, v1

    goto :goto_0

    :sswitch_4
    iget-object v0, p0, Lqv;->a:Li00;

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    move-result v1

    if-ltz v1, :cond_3

    const-string v1, "\u06e3\u06e7\u06e6"

    goto :goto_2

    :cond_3
    const-string v1, "\u06e4\u06df"

    goto :goto_1

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc27 -> :sswitch_0
        0xdc7b -> :sswitch_1
        0x1aab7e -> :sswitch_5
        0x1aae89 -> :sswitch_2
        0x1ab2e2 -> :sswitch_4
        0x1ab702 -> :sswitch_3
    .end sparse-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e5\u06e6\u06e5"

    invoke-static {v1}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    move-result v0

    if-gtz v0, :cond_1

    sget v0, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    add-int/lit16 v2, v2, -0x526

    or-int/2addr v0, v2

    if-ltz v0, :cond_0

    const/16 v0, 0x17

    sput v0, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    const-string v0, "\u06e5\u06e6\u06e5"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    sget v0, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sub-int/2addr v0, v2

    const v2, 0x1ab4d4

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_1
    :sswitch_2
    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    move-result v0

    if-gtz v0, :cond_2

    const/16 v0, 0x54

    sput v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    const-string v0, "\u06e6\u06e0\u06e8"

    :goto_1
    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    xor-int/2addr v0, v2

    const v2, 0xdec0

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    sget v0, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v2, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    or-int/lit16 v2, v2, 0x1e17

    or-int/2addr v0, v2

    if-ltz v0, :cond_3

    const-string v0, "\u06e7\u06e5\u06e3"

    invoke-static {v0}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    sget v0, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v2, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    add-int/2addr v0, v2

    const v2, 0x1abf0a

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    const-string v0, "BjZiBXXMISGnPJy4vJl9PHLL2VX0U"

    invoke-static {v0}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۟ۥۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget v0, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v2, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    add-int/lit16 v2, v2, -0x339

    xor-int/2addr v0, v2

    if-gtz v0, :cond_4

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    const-string v0, "\u06e8\u06e5\u06df"

    :goto_2
    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    const-string v0, "\u06e6\u06e5\u06e3"

    goto :goto_2

    :sswitch_5
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget v0, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    if-gtz v0, :cond_5

    const-string v0, "\u06e0\u06e6"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e0\u06e6"

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xdc06 -> :sswitch_0
        0x1ab663 -> :sswitch_4
        0x1abd86 -> :sswitch_2
        0x1abe64 -> :sswitch_1
        0x1ac204 -> :sswitch_5
        0x1ac982 -> :sswitch_3
    .end sparse-switch
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06e2\u06e0"

    invoke-static {v1}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v1, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    if-ltz v1, :cond_0

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    const-string v1, "\u06e6\u06e5\u06e8"

    :goto_1
    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    const-string v1, "\u06e1\u06e2\u06e0"

    goto :goto_1

    :sswitch_1
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡ۠ۦ()I

    move-result v1

    if-ltz v1, :cond_1

    const/16 v1, 0x49

    sput v1, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    :goto_2
    const-string v1, "\u06e3\u06e7\u06e0"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    add-int/2addr v1, v2

    const v2, 0x1ab5db

    add-int/2addr v1, v2

    goto :goto_0

    :cond_2
    :sswitch_2
    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    rem-int/lit16 v2, v2, 0xcfa

    add-int/2addr v1, v2

    if-gtz v1, :cond_3

    const/16 v1, 0x1a

    sput v1, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    const-string v1, "\u06e4\u06e7\u06e4"

    :goto_3
    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    sget v1, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    or-int/2addr v1, v2

    const v2, -0x1abbbd

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    const-string v0, "eoStiZvq7hitXPzwLWzVyOC"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۦ۟ۧۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_2

    :sswitch_4
    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    move-result v1

    if-ltz v1, :cond_2

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    move-result v1

    if-gtz v1, :cond_4

    const/16 v1, 0x26

    sput v1, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    const-string v1, "\u06e4\u06e4"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_4
    const-string v1, "\u06e6\u06e7\u06e0"

    goto :goto_3

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc80 -> :sswitch_0
        0x1aaedf -> :sswitch_4
        0x1ab60a -> :sswitch_2
        0x1ab6fc -> :sswitch_1
        0x1ababc -> :sswitch_5
        0x1ac23f -> :sswitch_3
    .end sparse-switch
.end method
