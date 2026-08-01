.class public final synthetic Let;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:Landroid/webkit/WebView;

.field public final b:D

.field public final c:D

.field public final d:Landroid/widget/ScrollView;

.field public final e:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Landroid/webkit/WebView;DDLandroid/widget/ScrollView;Landroid/widget/EditText;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e4\u06e0"

    invoke-static {v1}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "O23svOFz"

    invoke-static {v0}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠۟ۡۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v1, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    if-gtz v1, :cond_0

    const-string v1, "\u06e0\u06e6\u06e5"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_0
    sget v1, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    rem-int/2addr v1, v2

    const v2, 0x1ac2ae

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_1
    iput-object p7, p0, Let;->e:Landroid/widget/EditText;

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    move-result v0

    if-ltz v0, :cond_1

    const/16 v0, 0x4c

    sput v0, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    const-string v0, "\u06e1\u06e3\u06df"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e5\u06e1\u06e7"

    invoke-static {v0}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    add-int/lit16 v2, v2, -0xdf7

    div-int/2addr v0, v2

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    const-string v0, "\u06e3\u06e3\u06e2"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    rem-int/2addr v0, v2

    const v2, 0x1aad83

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    iput-wide p2, p0, Let;->b:D

    sget v0, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    div-int/lit16 v2, v2, -0x25b7

    add-int/2addr v0, v2

    if-ltz v0, :cond_3

    const/16 v0, 0x10

    sput v0, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    const-string v0, "\u06df\u06e2\u06e2"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_4
    iput-object p6, p0, Let;->d:Landroid/widget/ScrollView;

    sget v0, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    if-gtz v0, :cond_4

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    :cond_3
    const-string v0, "\u06e1\u06e0\u06e8"

    invoke-static {v0}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    xor-int/2addr v0, v2

    const v2, 0x1ac50a

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_5
    sget v0, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    if-gtz v0, :cond_5

    const-string v0, "\u06df\u06e4\u06e6"

    :goto_1
    invoke-static {v0}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v2, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    add-int/2addr v0, v2

    const v2, 0x1aa441

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    iput-wide p4, p0, Let;->c:D

    sget v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    add-int/lit16 v2, v2, -0xe07

    rem-int/2addr v0, v2

    if-ltz v0, :cond_6

    const/16 v0, 0xc

    sput v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    const-string v0, "\u06e7\u06e1\u06e7"

    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    rem-int/2addr v0, v2

    const v2, -0x1ab8f6

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    iput-object p1, p0, Let;->a:Landroid/webkit/WebView;

    sget v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sub-int/2addr v0, v2

    const v2, -0x1aa9fd

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    move-result v0

    if-ltz v0, :cond_7

    const-string v0, "\u06df\u06e2\u06e2"

    goto :goto_1

    :cond_7
    :sswitch_9
    sget v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    mul-int/2addr v0, v2

    const v2, -0x1a942c

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_a
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa75f -> :sswitch_0
        0x1aa79b -> :sswitch_7
        0x1aab5f -> :sswitch_a
        0x1aab9f -> :sswitch_3
        0x1aaea9 -> :sswitch_6
        0x1aaefd -> :sswitch_5
        0x1ab682 -> :sswitch_9
        0x1abac0 -> :sswitch_4
        0x1abdcb -> :sswitch_8
        0x1ac54d -> :sswitch_2
        0x1ac5e7 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 14

    const-wide/16 v10, 0x0

    const/4 v7, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06e5\u06df"

    invoke-static {v1}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v7

    move-object v6, v7

    move v8, v0

    move v9, v2

    move-wide v4, v10

    move-wide v12, v10

    :goto_0
    sparse-switch v9, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {v1, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    add-int/lit16 v2, v2, 0x18da

    div-int/2addr v0, v2

    if-eqz v0, :cond_e

    const/16 v0, 0x39

    sput v0, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    const-string v0, "\u06df\u06e1\u06e3"

    :goto_1
    invoke-static {v0}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto :goto_0

    :sswitch_1
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    sget v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    add-int/lit16 v2, v2, 0x16d1

    or-int/2addr v0, v2

    if-ltz v0, :cond_1

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    :cond_0
    const-string v0, "\u06e4\u06e8\u06e1"

    :goto_2
    invoke-static {v0}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e4\u06e6\u06df"

    :goto_3
    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Let;->d:Landroid/widget/ScrollView;

    xor-int/lit16 v2, v8, 0x27f

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    if-ltz v0, :cond_2

    const/16 v0, 0x30

    sput v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    const-string v0, "\u06e1\u06e5\u06df"

    invoke-static {v0}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e6\u06e0\u06e7"

    goto :goto_1

    :sswitch_3
    const-string v0, "\';"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    if-gtz v0, :cond_7

    const/16 v0, 0xe

    sput v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    const-string v0, "\u06e7\u06e7\u06e3"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto :goto_0

    :sswitch_4
    invoke-virtual {v1, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    move-result v0

    if-ltz v0, :cond_0

    const/16 v0, 0x54

    sput v0, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    const-string v0, "\u06e4\u06e6\u06df"

    invoke-static {v0}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto :goto_0

    :sswitch_5
    const-string v0, "], 16); hud.innerText = \'"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    rem-int/lit16 v2, v2, 0xe56

    mul-int/2addr v0, v2

    if-ltz v0, :cond_3

    const-string v0, "\u06e3\u06e7\u06e0"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06df\u06e4"

    move-wide v2, v4

    :goto_4
    invoke-static {v0}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    move-wide v4, v2

    goto/16 :goto_0

    :sswitch_6
    sget v0, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    move-result v2

    if-ltz v2, :cond_4

    const-string v2, "\u06e0\u06e4\u06e8"

    invoke-static {v2}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move v8, v0

    move v9, v2

    goto/16 :goto_0

    :cond_4
    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v3, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    xor-int/2addr v2, v3

    const v3, 0x1abb96

    add-int/2addr v2, v3

    move v8, v0

    move v9, v2

    goto/16 :goto_0

    :sswitch_7
    iget-wide v2, p0, Let;->b:D

    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    move-result v0

    if-gtz v0, :cond_5

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    const-string v0, "\u06e6\u06e0\u06e7"

    invoke-static {v0}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    move-wide v4, v2

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e4\u06e0\u06e3"

    goto :goto_4

    :sswitch_8
    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    move-result v0

    if-ltz v0, :cond_6

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    const-string v2, "\u06df\u06e1"

    move-object v0, v1

    :goto_5
    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    move v9, v2

    goto/16 :goto_0

    :cond_6
    sget v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    or-int/2addr v0, v2

    const v2, 0x1ab144

    add-int/2addr v0, v2

    move v9, v0

    goto/16 :goto_0

    :sswitch_9
    iget-object v0, p0, Let;->a:Landroid/webkit/WebView;

    invoke-virtual {v0, v6, v7}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    sget v0, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    if-gtz v0, :cond_b

    :cond_7
    const-string v0, "\u06e3\u06e5\u06e1"

    invoke-static {v0}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :sswitch_a
    iget-wide v10, p0, Let;->c:D

    sget v0, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    if-gtz v0, :cond_8

    const-string v0, "\u06df\u06e4"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    move-wide v12, v10

    goto/16 :goto_0

    :cond_8
    sget v0, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    mul-int/2addr v0, v2

    const v2, 0x1846f2

    xor-int/2addr v0, v2

    move v9, v0

    move-wide v12, v10

    goto/16 :goto_0

    :sswitch_b
    const-string v0, ", "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    add-int/lit16 v2, v2, 0xe04

    div-int/2addr v0, v2

    if-eqz v0, :cond_9

    const/16 v0, 0x20

    sput v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    const-string v0, "\u06e0\u06e8\u06e7"

    goto/16 :goto_3

    :cond_9
    const-string v0, "\u06e3\u06e7\u06e0"

    goto/16 :goto_1

    :sswitch_c
    iget-object v0, p0, Let;->e:Landroid/widget/EditText;

    const-string v2, ""

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v2, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    mul-int/lit16 v2, v2, 0x7dd

    rem-int/2addr v0, v2

    if-ltz v0, :cond_a

    const-string v2, "\u06e6\u06e3\u06e7"

    move-object v0, v6

    :goto_6
    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v6, v0

    move v9, v2

    goto/16 :goto_0

    :cond_a
    sget v0, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    add-int/2addr v0, v2

    const v2, 0x1ac296

    xor-int/2addr v0, v2

    move v9, v0

    goto/16 :goto_0

    :sswitch_d
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "map.setView(["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v1, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    mul-int/lit16 v2, v2, -0x1d1a

    rem-int/2addr v1, v2

    if-gtz v1, :cond_c

    move-object v1, v0

    :cond_b
    const-string v0, "\u06e6\u06e3\u06e0"

    move-wide v2, v4

    goto/16 :goto_4

    :cond_c
    const-string v1, "\u06e0\u06e4\u06e8"

    move-object v2, v1

    goto/16 :goto_5

    :sswitch_e
    const-string v0, ", "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    div-int/lit16 v2, v2, -0x1bbf

    sub-int/2addr v0, v2

    if-gtz v0, :cond_d

    const-string v0, "\u06e6\u06df\u06e2"

    invoke-static {v0}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_d
    const-string v0, "\u06df\u06e1\u06e3"

    goto/16 :goto_2

    :cond_e
    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    mul-int/2addr v0, v2

    const v2, 0x1ab85f

    add-int/2addr v0, v2

    move v9, v0

    goto/16 :goto_0

    :sswitch_f
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v0

    if-ltz v0, :cond_f

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    const-string v0, "\u06e6\u06e5\u06e0"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_f
    sget v0, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    div-int/2addr v0, v2

    const v2, 0x1ac602

    add-int/2addr v0, v2

    move v9, v0

    goto/16 :goto_0

    :sswitch_10
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v3, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    mul-int/lit16 v3, v3, 0x21f9

    or-int/2addr v2, v3

    if-ltz v2, :cond_10

    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    const-string v2, "\u06e4\u06e0\u06e3"

    invoke-static {v2}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v2

    move-object v6, v0

    move v9, v2

    goto/16 :goto_0

    :cond_10
    const-string v2, "\u06e6\u06df\u06e2"

    goto/16 :goto_6

    :sswitch_11
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbe5 -> :sswitch_0
        0x1aa741 -> :sswitch_a
        0x1aab64 -> :sswitch_7
        0x1aabdf -> :sswitch_b
        0x1aaf3b -> :sswitch_d
        0x1ab6bf -> :sswitch_10
        0x1ab6fc -> :sswitch_1
        0x1ab9e7 -> :sswitch_f
        0x1aba9d -> :sswitch_3
        0x1abadd -> :sswitch_5
        0x1abdea -> :sswitch_2
        0x1ac149 -> :sswitch_9
        0x1ac16d -> :sswitch_c
        0x1ac1c3 -> :sswitch_6
        0x1ac1ca -> :sswitch_8
        0x1ac201 -> :sswitch_11
        0x1ac603 -> :sswitch_e
        0x1ac9e0 -> :sswitch_4
    .end sparse-switch
.end method
