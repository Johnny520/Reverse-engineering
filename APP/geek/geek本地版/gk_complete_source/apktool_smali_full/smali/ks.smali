.class public final synthetic Lks;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 3

    iput p3, p0, Lks;->a:I

    iput-object p1, p0, Lks;->c:Ljava/lang/Object;

    iput p2, p0, Lks;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e5\u06e8\u06df"

    invoke-static {v1}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v2, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    add-int/2addr v1, v2

    const v2, 0x1acad3

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_1
    const-string v0, "kcf4OhTMshCg6O4J9Z"

    invoke-static {v0}, Lio/fastkv/ۦۣ۠ۨ;->ۧۢ۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    add-int/2addr v1, v2

    const v2, 0x1aa9a3

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    move-result v1

    if-gtz v1, :cond_2

    sget v1, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    or-int/lit16 v2, v2, -0x10bd

    rem-int/2addr v1, v2

    if-ltz v1, :cond_0

    const/16 v1, 0x11

    sput v1, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    const-string v1, "\u06e1\u06e5\u06e7"

    invoke-static {v1}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    sget v1, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v2, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    or-int/2addr v1, v2

    const v2, 0x1ab03b

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    sget v1, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    add-int/lit16 v2, v2, -0x1d7d

    div-int/2addr v1, v2

    if-eqz v1, :cond_1

    const-string v1, "\u06e2\u06e0\u06e4"

    invoke-static {v1}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    div-int/2addr v1, v2

    const v2, -0x1abe9d

    xor-int/2addr v1, v2

    goto :goto_0

    :cond_2
    :sswitch_4
    const-string v1, "\u06e8\u06e1\u06e7"

    invoke-static {v1}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aabc1 -> :sswitch_0
        0x1aaf43 -> :sswitch_3
        0x1ab2c4 -> :sswitch_1
        0x1ab62a -> :sswitch_4
        0x1abe9c -> :sswitch_2
        0x1ac90e -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 13

    const/4 v0, 0x0

    const-wide/16 v4, 0x0

    const-string v1, "\u06e6\u06df\u06e8"

    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move-object v9, v0

    move-object v10, v0

    move-object v1, v0

    move-object v11, v0

    move-object v6, v0

    move-object v7, v0

    move-object v12, v0

    move v8, v2

    :goto_0
    sparse-switch v8, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v0, p0, Lks;->c:Ljava/lang/Object;

    check-cast v0, Landroid/widget/TextView;

    iget v2, p0, Lks;->b:I

    invoke-static {v0, v2}, Lcom/ljx/wechatmod/ui/MainActivity;->a(Landroid/widget/TextView;I)V

    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    move-result v0

    if-ltz v0, :cond_c

    const/16 v0, 0x49

    sput v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    const-string v0, "\u06e3\u06e4\u06df"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto :goto_0

    :sswitch_1
    sget v0, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    div-int/lit16 v2, v2, 0x265a

    or-int/2addr v0, v2

    if-gtz v0, :cond_0

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    const-string v0, "\u06e7\u06e2"

    :goto_1
    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e6\u06df\u06e8"

    goto :goto_1

    :sswitch_2
    invoke-static {v7, v9}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V

    sget v0, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    add-int/lit16 v2, v2, -0x5e2

    xor-int/2addr v0, v2

    if-ltz v0, :cond_1

    const-string v0, "\u06e1\u06e3\u06e6"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e4\u06e1\u06e6"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Lks;->c:Ljava/lang/Object;

    check-cast v0, Lzt;

    iget v2, p0, Lks;->b:I

    invoke-virtual {v0, v2}, Lzt;->I(I)V

    sget v0, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v2, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    rem-int/2addr v0, v2

    const v2, 0x1ab2c9

    add-int/2addr v0, v2

    move v8, v0

    goto :goto_0

    :pswitch_0
    :sswitch_4
    sget v0, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    add-int/lit16 v2, v2, 0x18f7

    rem-int/2addr v0, v2

    if-gtz v0, :cond_2

    const/16 v0, 0x3b

    sput v0, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    const-string v2, "\u06e6\u06e2\u06e2"

    move-object v0, v1

    :goto_2
    invoke-static {v2}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    move v8, v2

    goto :goto_0

    :cond_2
    const-string v0, "\u06e6\u06e5\u06e3"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :sswitch_5
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v11}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v2, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sub-int/2addr v0, v2

    const v2, 0x1abaa8

    add-int/2addr v0, v2

    move v8, v0

    goto/16 :goto_0

    :sswitch_6
    iget v0, p0, Lks;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_7
    sget v0, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v2, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    rem-int/2addr v0, v2

    const v2, 0x1ab156

    add-int/2addr v0, v2

    move v8, v0

    goto/16 :goto_0

    :cond_3
    :sswitch_8
    sget v0, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v2, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    div-int/lit16 v2, v2, -0x1bc8

    add-int/2addr v0, v2

    if-ltz v0, :cond_4

    const-string v0, "\u06e4\u06e7\u06e7"

    move-wide v2, v4

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    move-wide v4, v2

    goto/16 :goto_0

    :cond_4
    sget v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sub-int/2addr v0, v2

    const v2, 0x1ab9c9

    add-int/2addr v0, v2

    move v8, v0

    goto/16 :goto_0

    :pswitch_1
    :sswitch_9
    const-string v0, "\u06df\u06df\u06e3"

    :goto_4
    invoke-static {v0}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :sswitch_a
    iget-object v0, p0, Lks;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    sget v2, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v3, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    div-int/lit16 v3, v3, -0xdd6

    sub-int/2addr v2, v3

    if-gtz v2, :cond_5

    const-string v6, "\u06e8\u06e1\u06e5"

    move-object v2, v0

    move-object v3, v7

    move-object v8, v6

    :goto_5
    invoke-static {v8}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    move-object v6, v2

    move-object v7, v3

    move v8, v0

    goto/16 :goto_0

    :cond_5
    sget v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v3, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    xor-int/2addr v2, v3

    const v3, 0x1aad81

    add-int/2addr v2, v3

    move-object v6, v0

    move v8, v2

    goto/16 :goto_0

    :sswitch_b
    iget v0, p0, Lks;->b:I

    int-to-double v2, v0

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    div-double/2addr v2, v4

    sget v0, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v4, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    add-int/lit16 v4, v4, -0x26b8

    or-int/2addr v0, v4

    if-ltz v0, :cond_6

    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    move-object v0, v9

    :goto_6
    const-string v4, "\u06e0\u06e5\u06e5"

    invoke-static {v4}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v8

    move-object v9, v0

    move-wide v4, v2

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e8\u06e1\u06e5"

    goto :goto_3

    :sswitch_c
    iget-object v0, p0, Lks;->c:Ljava/lang/Object;

    check-cast v0, Landroid/app/Application;

    const-string v7, "\u06e7\u06e4\u06e1"

    move-object v2, v6

    move-object v3, v0

    move-object v8, v7

    goto :goto_5

    :sswitch_d
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v3, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    add-int/lit16 v3, v3, 0xe80

    add-int/2addr v2, v3

    if-gtz v2, :cond_7

    const-string v2, "\u06e0\u06e7\u06df"

    invoke-static {v2}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v9, v0

    move v8, v2

    goto/16 :goto_0

    :cond_7
    move-wide v2, v4

    goto :goto_6

    :sswitch_e
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    move-result v0

    if-ltz v0, :cond_8

    const/16 v0, 0x4a

    sput v0, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    const-string v0, "\u06e2\u06df\u06e4"

    invoke-static {v0}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :cond_8
    sget v0, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v2, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    or-int/2addr v0, v2

    const v2, 0x1aa9e9

    add-int/2addr v0, v2

    move v8, v0

    goto/16 :goto_0

    :sswitch_f
    if-eqz v1, :cond_3

    const-string v0, "\u06e3\u06e5\u06df"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :sswitch_10
    sget-object v0, Lgn;->a:Lgn;

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    move-result v2

    if-gtz v2, :cond_9

    const-string v2, "\u06e1\u06e2\u06e4"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v10, v0

    move v8, v2

    goto/16 :goto_0

    :cond_9
    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v3, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    add-int/2addr v2, v3

    const v3, 0x1aa4a5

    add-int/2addr v2, v3

    move-object v10, v0

    move v8, v2

    goto/16 :goto_0

    :sswitch_11
    iget v0, p0, Lks;->b:I

    const/4 v2, 0x0

    invoke-virtual {v6, v1, v0, v2}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->t(Landroid/view/View;IZ)V

    invoke-static {}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۡۢۡۥ()I

    move-result v0

    if-gtz v0, :cond_a

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    const-string v0, "\u06e0\u06e0\u06e4"

    invoke-static {v0}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :cond_a
    const-string v0, "\u06e3\u06e6\u06e2"

    invoke-static {v0}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :sswitch_12
    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    move-result v0

    if-ltz v0, :cond_f

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    move-result v0

    if-ltz v0, :cond_b

    const/16 v0, 0x1d

    sput v0, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    const-string v0, "\u06e7\u06e4\u06e1"

    invoke-static {v0}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :cond_b
    sget v0, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    xor-int/2addr v0, v2

    const v2, 0x1aae7d

    add-int/2addr v0, v2

    move v8, v0

    goto/16 :goto_0

    :pswitch_2
    :sswitch_13
    sget v0, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    xor-int/2addr v0, v2

    const v2, 0x1aa3c8

    add-int/2addr v0, v2

    move v8, v0

    goto/16 :goto_0

    :cond_c
    const-string v0, "\u06e1\u06e8\u06e8"

    invoke-static {v0}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :sswitch_14
    invoke-virtual {v12, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, "\u06e7\u06e1\u06e0"

    move-object v0, v1

    goto/16 :goto_2

    :sswitch_15
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "\ud83d\udcb8 \u81ea\u52a8\u6536\u6b3e\u6210\u529f: \uffe5"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v2, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v3, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    or-int/lit16 v3, v3, -0x228c

    sub-int/2addr v2, v3

    if-gtz v2, :cond_d

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    const-string v2, "\u06e2\u06e5\u06e3"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v12, v0

    move v8, v2

    goto/16 :goto_0

    :cond_d
    sget v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sub-int/2addr v2, v3

    const v3, 0x1aa61c

    add-int/2addr v2, v3

    move-object v12, v0

    move v8, v2

    goto/16 :goto_0

    :sswitch_16
    const-string v0, "XsmTu"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۤ۟ۥۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v2, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    rem-int/2addr v2, v3

    const v3, 0x1ac496

    add-int/2addr v2, v3

    move-object v11, v0

    move v8, v2

    goto/16 :goto_0

    :sswitch_17
    iget-object v0, v6, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v2, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    add-int/lit16 v2, v2, 0x1361

    rem-int/2addr v1, v2

    if-ltz v1, :cond_e

    const-string v1, "\u06e7\u06e7\u06e8"

    invoke-static {v1}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    move v8, v2

    goto/16 :goto_0

    :cond_e
    const-string v1, "\u06e0\u06e0\u06e4"

    move-object v2, v1

    goto/16 :goto_2

    :cond_f
    :sswitch_18
    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v2, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    div-int/lit16 v2, v2, 0x1433

    or-int/2addr v0, v2

    if-gtz v0, :cond_10

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    const-string v0, "\u06e1\u06e1\u06df"

    goto/16 :goto_4

    :cond_10
    sget v0, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    xor-int/2addr v0, v2

    const v2, 0x1ab4d5

    xor-int/2addr v0, v2

    move v8, v0

    goto/16 :goto_0

    :sswitch_19
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa703 -> :sswitch_0
        0x1aa762 -> :sswitch_2
        0x1aa79e -> :sswitch_14
        0x1aa7a2 -> :sswitch_a
        0x1aaae4 -> :sswitch_f
        0x1aab3e -> :sswitch_17
        0x1aab7c -> :sswitch_b
        0x1aab80 -> :sswitch_e
        0x1aabb8 -> :sswitch_4
        0x1aaee3 -> :sswitch_7
        0x1aaf04 -> :sswitch_9
        0x1aafa1 -> :sswitch_19
        0x1ab247 -> :sswitch_16
        0x1ab283 -> :sswitch_13
        0x1ab300 -> :sswitch_19
        0x1ab35f -> :sswitch_c
        0x1ab69e -> :sswitch_19
        0x1ab6bd -> :sswitch_11
        0x1ab6df -> :sswitch_19
        0x1aba09 -> :sswitch_12
        0x1abdc6 -> :sswitch_18
        0x1ac14f -> :sswitch_6
        0x1ac204 -> :sswitch_3
        0x1ac546 -> :sswitch_d
        0x1ac56c -> :sswitch_5
        0x1ac5a4 -> :sswitch_10
        0x1ac608 -> :sswitch_1
        0x1ac90a -> :sswitch_8
        0x1ac90c -> :sswitch_15
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
