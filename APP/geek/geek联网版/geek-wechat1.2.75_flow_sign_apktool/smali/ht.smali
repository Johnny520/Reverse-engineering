.class public final Lht;
.super Landroid/webkit/WebViewClient;


# instance fields
.field public final a:Landroid/app/Activity;

.field public final b:Landroid/app/Dialog;

.field public final c:Landroid/app/Dialog;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/app/Dialog;Landroid/app/Dialog;)V
    .locals 3

    iput-object p1, p0, Lht;->a:Landroid/app/Activity;

    iput-object p2, p0, Lht;->b:Landroid/app/Dialog;

    iput-object p3, p0, Lht;->c:Landroid/app/Dialog;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e1\u06e1\u06e2"

    invoke-static {v0}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    move-result v0

    if-ltz v0, :cond_1

    const-string v2, "\u06e1\u06e8\u06e7"

    move-object v0, v1

    :goto_1
    invoke-static {v2}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_1
    sget v0, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    add-int/lit16 v2, v2, 0x1f8c

    div-int/2addr v0, v2

    if-eqz v0, :cond_0

    const/16 v0, 0x4e

    sput v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    const-string v0, "\u06e3\u06e4"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e1\u06e1\u06e2"

    invoke-static {v0}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    add-int/lit16 v2, v2, 0x1529

    xor-int/2addr v0, v2

    if-gtz v0, :cond_2

    const/16 v0, 0x45

    sput v0, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    const-string v2, "\u06e1\u06e4\u06e2"

    move-object v0, v1

    goto :goto_1

    :cond_2
    const-string v0, "\u06e7\u06e0\u06e4"

    goto :goto_2

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sub-int/2addr v0, v2

    const v2, 0x1ac573

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    const-string v0, "MxFtE8fYDMclDL8o2q"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۥۦۦۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-result v1

    if-ltz v1, :cond_3

    const/16 v1, 0x5f

    sput v1, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    const-string v1, "\u06e6\u06e7\u06e4"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_3
    const-string v1, "\u06e6\u06e7\u06e4"

    move-object v2, v1

    goto :goto_1

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aaec2 -> :sswitch_0
        0x1aafa0 -> :sswitch_4
        0x1ac1c2 -> :sswitch_1
        0x1ac243 -> :sswitch_3
        0x1ac52b -> :sswitch_5
        0x1ac9c5 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 11

    const/4 v0, 0x0

    const-string v1, "\u06e7\u06e3\u06e6"

    invoke-static {v1}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v0

    move-object v6, v0

    move-object v5, v0

    move-object v1, v0

    move-object v2, v0

    move-object v8, v0

    move-object v9, v0

    move-object v7, v0

    move v10, v4

    :goto_0
    sparse-switch v10, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    :try_start_0
    const-string v0, "lAao\n"

    const-string v4, "+GjPVUZ6+kY=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    sget v0, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    or-int/lit16 v4, v4, -0x179

    sub-int/2addr v0, v4

    if-ltz v0, :cond_7

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    move-object v0, v7

    :cond_0
    const-string v4, "\u06e2\u06e2\u06e4"

    invoke-static {v4}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v4

    move-object v7, v0

    move v10, v4

    goto :goto_0

    :sswitch_1
    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    div-int/lit16 v4, v4, -0x19f8

    sub-int/2addr v0, v4

    if-gtz v0, :cond_1

    const/16 v0, 0xf

    sput v0, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    const-string v0, "\u06df\u06e4\u06e2"

    invoke-static {v0}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    or-int/2addr v0, v4

    const v4, 0x1ab4fd

    xor-int/2addr v0, v4

    move v10, v0

    goto :goto_0

    :sswitch_2
    :try_start_1
    iget-object v0, p0, Lht;->c:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    sget v0, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    div-int/2addr v0, v4

    const v4, 0x1ab6c0

    add-int/2addr v0, v4

    move v10, v0

    goto :goto_0

    :sswitch_3
    :try_start_2
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    sget v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    or-int/lit16 v4, v4, -0xf4

    add-int/2addr v0, v4

    if-ltz v0, :cond_2

    const-string v0, "\u06e1\u06e5\u06e7"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto :goto_0

    :cond_2
    sget v0, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    div-int/2addr v0, v4

    const v4, 0x1aa7be

    xor-int/2addr v0, v4

    move v10, v0

    goto :goto_0

    :sswitch_4
    :try_start_3
    const-string v0, "35GpsI01\n"

    const-string v4, "vvLd2eJbY+g=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "RErc5Px/\n"

    const-string v10, "Jyuyh5kTYBk=\n"

    invoke-static {v4, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move-result v0

    if-eqz v0, :cond_13

    sget v0, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    or-int/lit16 v4, v4, -0x21d6

    div-int/2addr v0, v4

    if-eqz v0, :cond_3

    const-string v0, "\u06e3\u06e1\u06e0"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_3
    sget v0, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    add-int/2addr v0, v4

    const v4, 0x1aa8d8

    add-int/2addr v0, v4

    move v10, v0

    goto/16 :goto_0

    :sswitch_5
    const/4 v0, 0x1

    :goto_1
    return v0

    :sswitch_6
    sget v0, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    if-ltz v0, :cond_4

    const-string v0, "\u06e2\u06e7\u06e1"

    :goto_2
    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v4, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sub-int/2addr v0, v4

    const v4, 0x1ac481

    xor-int/2addr v0, v4

    move v10, v0

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "oN6GkaTDIuatz5nP/Y1h7arLkYo=\n"

    const-string v4, "yKry4Z7sDYE=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Li50;->K(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_18

    sget v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    rem-int/lit16 v4, v4, 0x1bf1

    or-int/2addr v0, v4

    if-ltz v0, :cond_5

    const-string v0, "\u06e6\u06e3\u06e2"

    :goto_3
    invoke-static {v0}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e3\u06e5\u06e2"

    goto :goto_2

    :sswitch_8
    :try_start_4
    invoke-virtual {v3}, Landroid/app/Dialog;->dismiss()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    sget v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    mul-int/lit16 v4, v4, -0x23ac

    div-int/2addr v0, v4

    if-eqz v0, :cond_6

    const/16 v0, 0x33

    sput v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    const-string v0, "\u06e8\u06e3\u06e0"

    invoke-static {v0}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e4\u06e7\u06e1"

    invoke-static {v0}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u06df\u06e7\u06e7"

    goto :goto_3

    :sswitch_9
    :try_start_5
    sget-object v0, Lz20;->a:Lz20;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    const-string v0, "\u06e1\u06e6\u06e3"

    :goto_4
    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :sswitch_a
    :try_start_6
    const-string v0, "m5mDnmgxNN2vkJu1\n"

    const-string v4, "8Pz6wQVeV7Y=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    move-result-object v2

    sget v0, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v4, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    div-int/lit16 v4, v4, -0x260d

    sub-int/2addr v0, v4

    if-ltz v0, :cond_8

    const/16 v0, 0x5a

    sput v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    const-string v0, "\u06e3\u06e5\u06e5"

    goto :goto_4

    :cond_8
    sget v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    xor-int/2addr v0, v4

    const v4, -0x1abc26

    xor-int/2addr v0, v4

    move v10, v0

    goto/16 :goto_0

    :sswitch_b
    :try_start_7
    invoke-virtual {v3}, Landroid/app/Dialog;->dismiss()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    sget v0, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    if-ltz v0, :cond_9

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    const-string v0, "\u06e3\u06df\u06e3"

    invoke-static {v0}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_9
    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    xor-int/2addr v0, v4

    const v4, 0x1aa553

    xor-int/2addr v0, v4

    move v10, v0

    goto/16 :goto_0

    :sswitch_c
    if-eqz v1, :cond_f

    const-string v0, "\u06e4\u06e7\u06e4"

    :goto_5
    invoke-static {v0}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :sswitch_d
    :try_start_8
    const-string v0, "gWAA\n"

    const-string v4, "7QF0/d7TDHs=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    move-result-object v0

    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    move-result v4

    if-ltz v4, :cond_a

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    const-string v4, "\u06df\u06e5\u06e8"

    invoke-static {v4}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v4

    move-object v8, v0

    move v10, v4

    goto/16 :goto_0

    :cond_a
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v8, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    div-int/2addr v4, v8

    const v8, 0xdc04

    add-int/2addr v4, v8

    move-object v8, v0

    move v10, v4

    goto/16 :goto_0

    :sswitch_e
    :try_start_9
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    move-result-object v0

    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v9, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    add-int/lit8 v9, v9, 0x56

    or-int/2addr v4, v9

    if-ltz v4, :cond_b

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    const-string v4, "\u06e4\u06e0\u06df"

    invoke-static {v4}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v4

    move-object v9, v0

    move v10, v4

    goto/16 :goto_0

    :cond_b
    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v9, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    xor-int/2addr v4, v9

    const v9, 0x1aac41

    add-int/2addr v4, v9

    move-object v9, v0

    move v10, v4

    goto/16 :goto_0

    :sswitch_f
    iget-object v0, p0, Lht;->b:Landroid/app/Dialog;

    if-eqz v8, :cond_e

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    move-result v3

    if-ltz v3, :cond_c

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    const-string v3, "\u06e2\u06e0\u06e8"

    move-object v4, v3

    :goto_6
    invoke-static {v4}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v0

    move v10, v4

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e3\u06df\u06e3"

    move-object v3, v0

    :goto_7
    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :sswitch_10
    :try_start_a
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v4, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    or-int/lit16 v4, v4, -0x6fc

    mul-int/2addr v0, v4

    if-gtz v0, :cond_d

    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    const-string v0, "\u06e1\u06e6\u06e3"

    invoke-static {v0}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_d
    const-string v0, "\u06e3\u06e5\u06e5"

    move-object v4, v0

    goto :goto_7

    :cond_e
    move-object v3, v0

    :cond_f
    :sswitch_11
    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    move-result v0

    if-gtz v0, :cond_10

    const-string v0, "\u06e2\u06e6\u06e4"

    move-object v4, v5

    :goto_8
    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v0

    move-object v5, v4

    move v10, v0

    goto/16 :goto_0

    :cond_10
    sget v0, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    mul-int/2addr v0, v4

    const v4, 0x15b735

    add-int/2addr v0, v4

    move v10, v0

    goto/16 :goto_0

    :sswitch_12
    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    if-ltz v0, :cond_11

    const-string v0, "\u06e4\u06e1\u06e2"

    goto/16 :goto_5

    :cond_11
    sget v0, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    mul-int/2addr v0, v4

    const v4, 0x1e98d8

    xor-int/2addr v0, v4

    move v10, v0

    goto/16 :goto_0

    :sswitch_13
    :try_start_b
    const-string v0, ", "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    sget v0, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    if-gtz v0, :cond_12

    const/16 v0, 0x34

    sput v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    const-string v0, "\u06e5\u06e0\u06e4"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_12
    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sub-int/2addr v0, v4

    const v4, 0xdd9b

    xor-int/2addr v0, v4

    move v10, v0

    goto/16 :goto_0

    :cond_13
    :sswitch_14
    sget v0, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    if-ltz v0, :cond_14

    const/16 v0, 0x57

    sput v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    const-string v0, "\u06e4\u06e4\u06df"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_14
    const-string v0, "\u06e4\u06e7\u06e1"

    invoke-static {v0}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    const-string v4, "\u06e4\u06e5\u06e8"

    move-object v0, v3

    goto/16 :goto_6

    :sswitch_15
    :try_start_c
    sget-object v4, Lkn;->a:Lkn;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v5, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    or-int/lit16 v5, v5, -0x11f0

    xor-int/2addr v0, v5

    if-gtz v0, :cond_15

    const-string v0, "\u06e3\u06e5\u06e0"

    invoke-static {v0}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v0

    move-object v5, v4

    move v10, v0

    goto/16 :goto_0

    :cond_15
    const-string v0, "\u06e3\u06e5\u06e3"

    goto/16 :goto_8

    :sswitch_16
    :try_start_d
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lkn;->k(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    move-result v0

    if-gtz v0, :cond_16

    const/4 v0, 0x7

    sput v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    const-string v0, "\u06e1\u06e4\u06e4"

    move-object v4, v0

    goto/16 :goto_7

    :cond_16
    const-string v0, "\u06e4\u06e0\u06e0"

    :goto_9
    invoke-static {v0}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :sswitch_17
    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    if-gtz v0, :cond_17

    const/16 v0, 0x21

    sput v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    const-string v0, "\u06e0\u06e3\u06e5"

    goto :goto_9

    :cond_17
    sget v0, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    xor-int/2addr v0, v4

    const v4, 0x1aa4f6

    add-int/2addr v0, v4

    move v10, v0

    goto/16 :goto_0

    :cond_18
    :sswitch_18
    move-object v0, v6

    :cond_19
    sget v4, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v6, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    add-int/lit16 v6, v6, 0xe31

    div-int/2addr v4, v6

    if-eqz v4, :cond_1a

    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    const-string v4, "\u06e0\u06e3\u06e0"

    invoke-static {v4}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v4

    move-object v6, v0

    move v10, v4

    goto/16 :goto_0

    :cond_1a
    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v6, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    div-int/2addr v4, v6

    const v6, 0x1aaf21

    add-int/2addr v4, v6

    move-object v6, v0

    move v10, v4

    goto/16 :goto_0

    :sswitch_19
    :try_start_e
    invoke-static {v6}, Lz20;->a(Landroid/app/Activity;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0

    sget v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v4, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    mul-int/lit16 v4, v4, 0x258

    rem-int/2addr v0, v4

    if-gtz v0, :cond_1b

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    const-string v0, "\u06e4\u06df\u06e2"

    invoke-static {v0}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_1b
    const-string v0, "\u06e4\u06df\u06e2"

    goto/16 :goto_4

    :sswitch_1a
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result v0

    goto/16 :goto_1

    :sswitch_1b
    iget-object v0, p0, Lht;->a:Landroid/app/Activity;

    if-eqz p2, :cond_19

    sget v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    if-ltz v4, :cond_1c

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    const-string v4, "\u06e7\u06e3\u06e6"

    invoke-static {v4}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v4

    move-object v6, v0

    move v10, v4

    goto/16 :goto_0

    :cond_1c
    sget v4, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v6, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    xor-int/2addr v4, v6

    const v6, -0x1aa958

    xor-int/2addr v4, v6

    move-object v6, v0

    move v10, v4

    goto/16 :goto_0

    :sswitch_1c
    :try_start_f
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_0

    sget v0, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    or-int/lit16 v4, v4, -0x1a58

    or-int/2addr v0, v4

    if-ltz v0, :cond_1d

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    const-string v0, "\u06e4\u06e3\u06df"

    invoke-static {v0}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :cond_1d
    const-string v0, "\u06e3\u06e5\u06e7"

    invoke-static {v0}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v10, v0

    goto/16 :goto_0

    :sswitch_1d
    :try_start_10
    invoke-static {v2, v8}, Lkn;->h(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_0

    const-string v0, "\u06e6\u06e3\u06e2"

    goto/16 :goto_9

    :sswitch_1e
    const-string v0, "\u06e4\u06e7\u06e4"

    goto/16 :goto_5

    :sswitch_1f
    :try_start_11
    const-string v0, "dJxSzheFpQlAlUX2\n"

    const-string v4, "H/krkXrqxmI=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkn;->h(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "\u2705 \u5750\u6807\u5df2\u66f4\u65b0: "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_0

    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v7, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    mul-int/lit16 v7, v7, -0x22d3

    sub-int/2addr v4, v7

    if-gtz v4, :cond_0

    const/16 v4, 0xb

    sput v4, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    const-string v4, "\u06e3\u06e5\u06e2"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v4

    move-object v7, v0

    move v10, v4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc04 -> :sswitch_0
        0xdc7d -> :sswitch_10
        0x1aa79d -> :sswitch_12
        0x1aa7be -> :sswitch_13
        0x1aa7c2 -> :sswitch_2
        0x1aa7e0 -> :sswitch_8
        0x1aa7ff -> :sswitch_f
        0x1aaac1 -> :sswitch_d
        0x1aabb9 -> :sswitch_7
        0x1aaf21 -> :sswitch_1a
        0x1aaf43 -> :sswitch_17
        0x1aaf5e -> :sswitch_19
        0x1ab249 -> :sswitch_6
        0x1ab26a -> :sswitch_11
        0x1ab2a4 -> :sswitch_3
        0x1ab607 -> :sswitch_c
        0x1ab642 -> :sswitch_14
        0x1ab6be -> :sswitch_9
        0x1ab6c0 -> :sswitch_e
        0x1ab6c1 -> :sswitch_a
        0x1ab6c3 -> :sswitch_16
        0x1ab6c5 -> :sswitch_1d
        0x1ab71a -> :sswitch_18
        0x1ab9c7 -> :sswitch_1
        0x1ab9e3 -> :sswitch_1e
        0x1ab9e4 -> :sswitch_b
        0x1aba40 -> :sswitch_4
        0x1aba87 -> :sswitch_14
        0x1ababe -> :sswitch_5
        0x1abac1 -> :sswitch_15
        0x1abda9 -> :sswitch_1c
        0x1ac1c5 -> :sswitch_1f
        0x1ac58a -> :sswitch_1b
        0x1ac945 -> :sswitch_14
    .end sparse-switch
.end method
