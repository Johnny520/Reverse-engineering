.class public final Lbt;
.super Landroid/webkit/WebViewClient;


# instance fields
.field public final a:Landroid/app/Activity;

.field public final b:Landroid/app/Dialog;

.field public final c:Landroid/app/Dialog;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/app/Dialog;Landroid/app/Dialog;)V
    .locals 3

    iput-object p1, p0, Lbt;->a:Landroid/app/Activity;

    iput-object p2, p0, Lbt;->b:Landroid/app/Dialog;

    iput-object p3, p0, Lbt;->c:Landroid/app/Dialog;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e7\u06e8\u06e5"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    mul-int/lit16 v2, v2, 0x1142

    mul-int/2addr v0, v2

    if-ltz v0, :cond_3

    const/16 v0, 0x19

    sput v0, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    const-string v0, "\u06e2\u06e2\u06e5"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    sget v0, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v2, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    div-int/lit16 v2, v2, -0x723

    mul-int/2addr v0, v2

    if-eqz v0, :cond_1

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    const-string v0, "\u06e7\u06df\u06df"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sub-int/2addr v0, v2

    const v2, -0x1ac722

    xor-int/2addr v0, v2

    goto :goto_0

    :sswitch_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    xor-int/lit16 v2, v2, -0x6d5

    xor-int/2addr v0, v2

    if-ltz v0, :cond_2

    const/16 v0, 0x3d

    sput v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    const-string v0, "\u06e7\u06e8\u06e5"

    invoke-static {v0}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    add-int/2addr v0, v2

    const v2, 0x1ab9f8

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_3
    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    move-result v0

    if-gtz v0, :cond_0

    sget v0, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    rem-int/2addr v0, v2

    const v2, 0x1aa96d

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_4
    const-string v0, "IJ8f5RwwIut"

    invoke-static {v0}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۧۦۦۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    sget v0, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    rem-int/2addr v0, v2

    const v2, -0x1ab011

    xor-int/2addr v0, v2

    goto :goto_0

    :cond_3
    sget v0, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v2, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    mul-int/2addr v0, v2

    const v2, 0x181859

    xor-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa761 -> :sswitch_0
        0x1aa800 -> :sswitch_4
        0x1aaac8 -> :sswitch_1
        0x1ab322 -> :sswitch_2
        0x1ab6c1 -> :sswitch_5
        0x1ac624 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 11

    const/4 v1, 0x0

    const-string v0, "\u06e8\u06e8\u06e2"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v4

    move-object v7, v1

    move-object v3, v1

    move-object v5, v1

    move-object v8, v1

    move-object v2, v1

    move-object v9, v1

    move-object v0, v1

    move-object v6, v1

    move v10, v4

    :goto_0
    sparse-switch v10, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    :try_start_0
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    const-string v4, "\u06e1\u06e3\u06e4"

    move-object v1, v3

    :goto_1
    invoke-static {v4}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v1

    move v10, v4

    goto :goto_0

    :sswitch_1
    :try_start_1
    sget-object v1, Ls20;->a:Ls20;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    sget v1, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    if-gtz v1, :cond_0

    const-string v1, "\u06e2\u06e8\u06e5"

    :goto_2
    invoke-static {v1}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto :goto_0

    :cond_0
    sget v1, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v4, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    div-int/2addr v1, v4

    const v4, 0x1aaf9a

    add-int/2addr v1, v4

    move v10, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    move-result v1

    if-ltz v1, :cond_1

    const/16 v1, 0x1f

    sput v1, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    const-string v1, "\u06e8\u06e6\u06e5"

    :goto_3
    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e8\u06e8\u06e2"

    goto :goto_3

    :sswitch_3
    :try_start_2
    invoke-virtual {v7}, Landroid/app/Dialog;->dismiss()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    invoke-static {}, Landroidx/recyclerview/widget/ۧۧۦۢ;->ۣۢۦۨ()I

    move-result v1

    if-ltz v1, :cond_2

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    const-string v1, "\u06e3\u06e0\u06e8"

    :goto_4
    invoke-static {v1}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06df\u06e5\u06e6"

    goto :goto_3

    :cond_3
    :sswitch_4
    move-object v1, v3

    :cond_4
    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    move-result v3

    if-ltz v3, :cond_5

    const-string v3, "\u06e6\u06e6\u06e0"

    move-object v4, v3

    goto :goto_1

    :cond_5
    const-string v3, "\u06e1\u06e0\u06e1"

    move-object v4, v3

    goto :goto_1

    :cond_6
    :sswitch_5
    move-object v1, v7

    :cond_7
    sget v4, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v7, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    add-int/lit16 v7, v7, -0xadc

    or-int/2addr v4, v7

    if-ltz v4, :cond_8

    const-string v4, "\u06e1\u06e4\u06e0"

    invoke-static {v4}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v4

    move-object v7, v1

    move v10, v4

    goto :goto_0

    :cond_8
    sget v4, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v7, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    mul-int/2addr v4, v7

    const v7, 0x1a71c3

    xor-int/2addr v4, v7

    move-object v7, v1

    move v10, v4

    goto/16 :goto_0

    :sswitch_6
    sget v1, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v4, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    div-int/2addr v1, v4

    const v4, 0x1abe7f

    xor-int/2addr v1, v4

    move v10, v1

    goto/16 :goto_0

    :sswitch_7
    sget v1, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    if-ltz v1, :cond_9

    const/16 v1, 0x5b

    sput v1, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    const-string v1, "\u06df\u06e2\u06e8"

    :goto_5
    invoke-static {v1}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto/16 :goto_0

    :cond_9
    const-string v1, "\u06e0\u06e4"

    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto/16 :goto_0

    :sswitch_8
    :try_start_3
    sget-object v1, Lgn;->a:Lgn;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    sget v4, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    if-ltz v4, :cond_a

    const-string v4, "\u06df\u06e7\u06e3"

    invoke-static {v4}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v4

    move-object v8, v1

    move v10, v4

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e2\u06e0\u06e1"

    invoke-static {v4}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v4

    move-object v8, v1

    move v10, v4

    goto/16 :goto_0

    :sswitch_9
    sget v1, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    if-gtz v1, :cond_b

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    const-string v1, "\u06e8\u06e3\u06e7"

    invoke-static {v1}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto/16 :goto_0

    :cond_b
    const-string v1, "\u06e3\u06e4"

    invoke-static {v1}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto/16 :goto_0

    :sswitch_a
    :try_start_4
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    const-string v1, "\u06e5\u06e5\u06e3"

    :goto_6
    invoke-static {v1}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto/16 :goto_0

    :catch_0
    move-exception v1

    sget v1, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v4, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    xor-int/2addr v1, v4

    const v4, 0x1aa82d

    add-int/2addr v1, v4

    move v10, v1

    goto/16 :goto_0

    :cond_c
    :sswitch_b
    const-string v1, "\u06df\u06e5\u06e6"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto/16 :goto_0

    :sswitch_c
    :try_start_5
    const-string v1, "NrL/ZKa8wLoCu+hc\n"

    const-string v4, "XdeGO8vTo9E=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lgn;->h(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v1, "\u2705 \u5750\u6807\u5df2\u66f4\u65b0: "

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    sget v1, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v9, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    div-int/lit16 v9, v9, -0xb6d

    xor-int/2addr v1, v9

    if-gtz v1, :cond_d

    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    const-string v1, "\u06e8\u06e8\u06e2"

    :goto_7
    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v1

    move-object v9, v4

    move v10, v1

    goto/16 :goto_0

    :cond_d
    const-string v1, "\u06e5\u06e7\u06e8"

    goto :goto_7

    :sswitch_d
    :try_start_6
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    move-result v1

    if-ltz v1, :cond_e

    const-string v1, "\u06e5\u06e5\u06e3"

    invoke-static {v1}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto/16 :goto_0

    :cond_e
    const-string v1, "\u06df\u06e1\u06e7"

    :goto_8
    invoke-static {v1}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto/16 :goto_0

    :sswitch_e
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result v0

    :goto_9
    return v0

    :sswitch_f
    :try_start_7
    invoke-virtual {v7}, Landroid/app/Dialog;->dismiss()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    sget v1, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v4, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    mul-int/lit16 v4, v4, 0x1133

    sub-int/2addr v1, v4

    if-gtz v1, :cond_f

    const/16 v1, 0x10

    sput v1, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    const-string v1, "\u06e1\u06e0\u06e1"

    goto :goto_8

    :cond_f
    const-string v1, "\u06e2\u06e2\u06e4"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto/16 :goto_0

    :sswitch_10
    :try_start_8
    const-string v1, "f0vd\n"

    const-string v4, "EyqpylhAgXQ=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    move-result-object v2

    sget v1, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v4, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    mul-int/lit16 v4, v4, -0x1fff

    xor-int/2addr v1, v4

    if-gtz v1, :cond_10

    const/16 v1, 0x16

    sput v1, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    const-string v1, "\u06df\u06e1\u06e7"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto/16 :goto_0

    :cond_10
    const-string v1, "\u06df\u06e7\u06e3"

    goto/16 :goto_4

    :sswitch_11
    :try_start_9
    const-string v1, "M26zz+sheFgHZ6vk\n"

    const-string v4, "WAvKkIZOGzM=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    move-result-object v5

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    move-result v1

    if-ltz v1, :cond_11

    const-string v1, "\u06e0\u06e2\u06e1"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto/16 :goto_0

    :cond_11
    const-string v4, "\u06e1\u06e8\u06e1"

    move-object v1, v3

    goto/16 :goto_1

    :sswitch_12
    :try_start_a
    iget-object v1, p0, Lbt;->c:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    sget v1, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v4, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    div-int/lit16 v4, v4, -0x19f0

    xor-int/2addr v1, v4

    if-ltz v1, :cond_12

    const-string v1, "\u06e8\u06e6\u06df"

    :goto_a
    invoke-static {v1}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto/16 :goto_0

    :cond_12
    sget v1, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v4, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    xor-int/2addr v1, v4

    const v4, 0x1abb1a

    add-int/2addr v1, v4

    move v10, v1

    goto/16 :goto_0

    :sswitch_13
    :try_start_b
    const-string v1, "JQHiueCa\n"

    const-string v4, "RGKW0I/0u54=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "j9Y0PEUM\n"

    const-string v10, "7LdaXyBg374=\n"

    invoke-static {v4, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    move-result v1

    if-eqz v1, :cond_c

    sget v1, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v4, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    div-int/lit16 v4, v4, -0x1db5

    mul-int/2addr v1, v4

    if-eqz v1, :cond_13

    const/16 v1, 0x5f

    sput v1, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    const-string v1, "\u06e5\u06e7\u06e1"

    goto/16 :goto_6

    :cond_13
    sget v1, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v4, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sub-int/2addr v1, v4

    const v4, -0x1ac744

    xor-int/2addr v1, v4

    move v10, v1

    goto/16 :goto_0

    :sswitch_14
    :try_start_c
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    sget v1, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v4, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    mul-int/2addr v1, v4

    const v4, 0x134cbc

    xor-int/2addr v1, v4

    move v10, v1

    goto/16 :goto_0

    :sswitch_15
    :try_start_d
    const-string v1, ", "

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0

    sget v1, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    if-gtz v1, :cond_14

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    const-string v1, "\u06df\u06e2\u06e4"

    invoke-static {v1}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto/16 :goto_0

    :cond_14
    const-string v1, "\u06df\u06e2\u06e4"

    goto :goto_a

    :sswitch_16
    iget-object v1, p0, Lbt;->a:Landroid/app/Activity;

    if-eqz p2, :cond_4

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v4, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    or-int/lit16 v4, v4, -0x1d1d

    xor-int/2addr v3, v4

    if-ltz v3, :cond_15

    invoke-static {}, Landroidx/activity/ۣ۟۠ۤۢ;->۟۠۠ۤۥ()I

    const-string v3, "\u06df\u06df\u06e3"

    invoke-static {v3}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v1

    move v10, v4

    goto/16 :goto_0

    :cond_15
    sget v3, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v4, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    add-int/2addr v3, v4

    const v4, 0x1ac807

    add-int/2addr v4, v3

    move-object v3, v1

    move v10, v4

    goto/16 :goto_0

    :sswitch_17
    :try_start_e
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    move-result v1

    if-ltz v1, :cond_18

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    const-string v1, "\u06e6\u06e2\u06e1"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto/16 :goto_0

    :sswitch_18
    :try_start_f
    invoke-static {v3}, Ls20;->a(Landroid/app/Activity;)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_0

    sget v1, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v4, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    xor-int/lit16 v4, v4, -0x170c

    div-int/2addr v1, v4

    if-eqz v1, :cond_16

    const/16 v1, 0x3a

    sput v1, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    const-string v1, "\u06e3\u06e4"

    invoke-static {v1}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto/16 :goto_0

    :cond_16
    sget v1, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v4, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    or-int/2addr v1, v4

    const v4, 0x1ac22c

    add-int/2addr v1, v4

    move v10, v1

    goto/16 :goto_0

    :sswitch_19
    iget-object v1, p0, Lbt;->b:Landroid/app/Dialog;

    if-eqz v2, :cond_7

    sget v4, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v7, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    or-int/2addr v4, v7

    const v7, 0x1ac191

    add-int/2addr v4, v7

    move-object v7, v1

    move v10, v4

    goto/16 :goto_0

    :sswitch_1a
    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    move-result v1

    if-gtz v1, :cond_17

    const/16 v1, 0x8

    sput v1, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    const-string v1, "\u06e3\u06e8\u06e5"

    invoke-static {v1}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto/16 :goto_0

    :cond_17
    sget v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v4, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    div-int/2addr v1, v4

    const v4, 0x1aab49

    add-int/2addr v1, v4

    move v10, v1

    goto/16 :goto_0

    :sswitch_1b
    :try_start_10
    const-string v1, "FOxA\n"

    const-string v4, "eIIncQUbiPo=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_0

    move-result-object v0

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    move-result v1

    if-gtz v1, :cond_19

    :cond_18
    const-string v1, "\u06e8\u06e0"

    invoke-static {v1}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto/16 :goto_0

    :cond_19
    const-string v1, "\u06e3\u06e4"

    goto/16 :goto_8

    :sswitch_1c
    const-string v1, "5UC++OmHXlboUaGmsMkdXe9VqeM=\n"

    const-string v4, "jTTKiNOocTE=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {p2, v1, v4}, Lb50;->N(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_3

    sget v1, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    if-ltz v1, :cond_1a

    const-string v1, "\u06e1\u06e8\u06e1"

    invoke-static {v1}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto/16 :goto_0

    :cond_1a
    sget v1, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v4, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    add-int/2addr v1, v4

    const v4, 0xdb0d

    add-int/2addr v1, v4

    move v10, v1

    goto/16 :goto_0

    :sswitch_1d
    if-eqz v0, :cond_6

    sget v1, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v4, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    or-int/lit16 v4, v4, 0x1399

    xor-int/2addr v1, v4

    if-ltz v1, :cond_1b

    const/16 v1, 0x18

    sput v1, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    const-string v1, "\u06e5\u06e7\u06e8"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto/16 :goto_0

    :cond_1b
    const-string v1, "\u06e0\u06e3\u06e8"

    goto/16 :goto_5

    :sswitch_1e
    const/4 v0, 0x1

    goto/16 :goto_9

    :sswitch_1f
    :try_start_11
    invoke-static {v5, v2}, Lgn;->h(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_0

    sget v1, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v4, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    mul-int/lit16 v4, v4, -0x306

    rem-int/2addr v1, v4

    if-ltz v1, :cond_1c

    const/16 v1, 0x52

    sput v1, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    const-string v1, "\u06e1\u06e8\u06df"

    invoke-static {v1}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v1

    move v10, v1

    goto/16 :goto_0

    :cond_1c
    const-string v1, "\u06e3\u06e0\u06e8"

    goto/16 :goto_2

    :sswitch_data_0
    .sparse-switch
        0xdc04 -> :sswitch_0
        0xdc61 -> :sswitch_19
        0xdce0 -> :sswitch_1a
        0xdcf8 -> :sswitch_f
        0x1aa703 -> :sswitch_7
        0x1aa723 -> :sswitch_13
        0x1aa745 -> :sswitch_17
        0x1aa761 -> :sswitch_d
        0x1aa7c0 -> :sswitch_1e
        0x1aa7fb -> :sswitch_1b
        0x1aab1f -> :sswitch_2
        0x1aab3d -> :sswitch_b
        0x1aab45 -> :sswitch_8
        0x1aaea2 -> :sswitch_e
        0x1aaf02 -> :sswitch_10
        0x1aaf98 -> :sswitch_18
        0x1aaf9a -> :sswitch_a
        0x1ab263 -> :sswitch_11
        0x1ab2a4 -> :sswitch_12
        0x1ab343 -> :sswitch_b
        0x1ab35f -> :sswitch_9
        0x1ab62b -> :sswitch_c
        0x1abae3 -> :sswitch_1
        0x1abdc4 -> :sswitch_5
        0x1abe43 -> :sswitch_1f
        0x1abe7f -> :sswitch_b
        0x1abe86 -> :sswitch_14
        0x1ac16d -> :sswitch_1d
        0x1ac1a5 -> :sswitch_6
        0x1ac205 -> :sswitch_3
        0x1ac5e6 -> :sswitch_1c
        0x1ac8e8 -> :sswitch_15
        0x1ac9a1 -> :sswitch_4
        0x1ac9e2 -> :sswitch_16
    .end sparse-switch
.end method
