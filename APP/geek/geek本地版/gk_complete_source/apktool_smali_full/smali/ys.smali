.class public final synthetic Lys;
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
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v2, 0x0

    const-string v0, "\u06e3\u06e5\u06e2"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-wide p4, p0, Lys;->c:D

    sget v0, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v1, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    xor-int/lit16 v1, v1, 0x2137

    mul-int/2addr v0, v1

    if-gtz v0, :cond_4

    move-wide v0, v2

    :goto_1
    const-string v2, "\u06e1\u06e0"

    invoke-static {v2}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v4

    move-wide v2, v0

    goto :goto_0

    :sswitch_1
    iput-object p6, p0, Lys;->d:Landroid/widget/ScrollView;

    const-string v0, "\u06e2\u06e6\u06e0"

    :goto_2
    invoke-static {v0}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_2
    iput-wide p2, p0, Lys;->b:D

    sget v0, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v1, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    rem-int/2addr v0, v1

    const v1, 0xd9e8

    add-int/2addr v0, v1

    move v4, v0

    goto :goto_0

    :sswitch_3
    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    move-result v0

    if-gtz v0, :cond_2

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u06e7\u06e7\u06e3"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v1, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    add-int/2addr v0, v1

    const v1, 0x1ac0b1

    add-int/2addr v0, v1

    move v4, v0

    goto :goto_0

    :sswitch_4
    iput-object p1, p0, Lys;->a:Landroid/webkit/WebView;

    sget v0, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v1, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sub-int/2addr v0, v1

    const v1, 0x1aaa26

    add-int/2addr v0, v1

    move v4, v0

    goto :goto_0

    :sswitch_5
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v2, v3}, Ljava/io/PrintStream;->println(D)V

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    move-result v0

    if-gtz v0, :cond_1

    invoke-static {}, Landroidx/activity/ۣ۟۠ۤۢ;->۟۠۠ۤۥ()I

    const-string v0, "\u06e2\u06e6\u06e0"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    mul-int/2addr v0, v1

    const v1, 0x1c5081

    add-int/2addr v0, v1

    move v4, v0

    goto :goto_0

    :cond_2
    :sswitch_6
    invoke-static {}, Landroidx/appcompat/app/ۥۦۣ۠;->ۨۤ۠ۨ()I

    move-result v0

    if-gtz v0, :cond_3

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    const-string v0, "\u06e5\u06e6\u06e8"

    goto :goto_2

    :cond_3
    sget v0, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v1, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    add-int/2addr v0, v1

    const v1, 0x1ab924

    add-int/2addr v0, v1

    move v4, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v1, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    div-int/2addr v0, v1

    const v1, 0x1ab9c3

    add-int/2addr v0, v1

    move v4, v0

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "49iO5RF1dJu6raSm"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۤ۟ۤۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    goto/16 :goto_1

    :sswitch_8
    sget v0, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    add-int/lit16 v1, v1, -0x221a

    div-int/2addr v0, v1

    if-eqz v0, :cond_5

    const-string v0, "\u06df\u06e2\u06e1"

    :goto_3
    invoke-static {v0}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e3\u06e5\u06e2"

    goto :goto_3

    :sswitch_9
    iput-object p7, p0, Lys;->e:Landroid/widget/EditText;

    sget v0, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v1, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    div-int/lit16 v1, v1, -0x26ff

    add-int/2addr v0, v1

    if-ltz v0, :cond_6

    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    const-string v0, "\u06df\u06df\u06e6"

    invoke-static {v0}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v1, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    add-int/2addr v0, v1

    const v1, -0x1abf3b

    xor-int/2addr v0, v1

    move v4, v0

    goto/16 :goto_0

    :sswitch_a
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc02 -> :sswitch_0
        0xdc1f -> :sswitch_5
        0x1aa706 -> :sswitch_2
        0x1ab2c2 -> :sswitch_8
        0x1ab31c -> :sswitch_9
        0x1ab609 -> :sswitch_a
        0x1ab6c0 -> :sswitch_4
        0x1ab9c7 -> :sswitch_1
        0x1abae1 -> :sswitch_3
        0x1ac220 -> :sswitch_7
        0x1ac603 -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 12

    const-wide/16 v10, 0x0

    const/4 v6, 0x0

    const/4 v1, 0x0

    const-string v0, "\u06e7\u06e8\u06e0"

    invoke-static {v0}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move-object v3, v6

    move-object v7, v6

    move v2, v0

    move-wide v8, v10

    move-wide v4, v10

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v2, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    rem-int/lit16 v2, v2, -0x1349

    mul-int/2addr v0, v2

    if-ltz v0, :cond_0

    const-string v0, "\u06e3\u06e0"

    :goto_1
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, "\u06e0\u06e3\u06e1"

    :goto_2
    invoke-static {v0}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    const-string v0, ", "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\u06df\u06e5\u06e3"

    move-object v2, v0

    :goto_3
    invoke-static {v2}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e1\u06e2\u06e6"

    goto :goto_1

    :sswitch_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "map.setView(["

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v7, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    div-int/2addr v2, v7

    const v7, 0xdc5f

    xor-int/2addr v2, v7

    move-object v7, v0

    goto :goto_0

    :sswitch_4
    invoke-virtual {v7, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    move-result v0

    if-ltz v0, :cond_2

    :cond_1
    const-string v0, "\u06e4\u06e3\u06e0"

    invoke-static {v0}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    or-int/2addr v0, v2

    const v2, 0x1aa77e

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    iget-object v0, p0, Lys;->a:Landroid/webkit/WebView;

    invoke-virtual {v0, v3, v6}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    sget v0, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    rem-int/lit16 v2, v2, 0x1f9a

    or-int/2addr v0, v2

    if-ltz v0, :cond_4

    :cond_3
    const-string v0, "\u06e2\u06df\u06e7"

    invoke-static {v0}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    const-string v0, "\u06df\u06e5\u06e2"

    move-object v2, v0

    :goto_4
    invoke-static {v2}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_6
    invoke-virtual {v7, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    move-result v0

    if-ltz v0, :cond_6

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    move v0, v1

    :cond_5
    const-string v2, "\u06e0\u06e2\u06df"

    move v1, v0

    goto :goto_4

    :cond_6
    sget v0, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    add-int/2addr v0, v2

    const v2, -0x1ab087

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "\';"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    or-int/lit16 v2, v2, 0xda3

    mul-int/2addr v0, v2

    if-ltz v0, :cond_7

    const-string v0, "\u06e7\u06e8\u06e0"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_7
    sget v0, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    div-int/2addr v0, v2

    const v2, 0x1ab701

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    add-int/lit16 v3, v3, 0x1576

    div-int/2addr v2, v3

    if-eqz v2, :cond_9

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v2, "\u06df\u06e5\u06e3"

    invoke-static {v2}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v3, v0

    goto/16 :goto_0

    :sswitch_9
    iget-object v0, p0, Lys;->d:Landroid/widget/ScrollView;

    xor-int/lit16 v2, v1, -0xb9

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    sget v0, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    rem-int/2addr v0, v2

    const v2, 0x1aab09

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_a
    iget-wide v8, p0, Lys;->c:D

    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    or-int/2addr v0, v2

    const v2, 0xdb90

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_b
    const-string v0, "], 16); hud.innerText = \'"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    move-result v0

    if-gtz v0, :cond_3

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    const-string v0, "\u06e5\u06e8\u06e0"

    invoke-static {v0}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    move-result v0

    if-gtz v0, :cond_8

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    const-string v0, "\u06df\u06e6\u06e5"

    :goto_5
    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06e7\u06e8\u06e0"

    goto :goto_5

    :sswitch_d
    iget-object v0, p0, Lys;->e:Landroid/widget/EditText;

    const-string v2, ""

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    move-result v0

    if-ltz v0, :cond_1

    const-string v0, "\u06e0\u06e5\u06e2"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_e
    const-string v0, ", "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    add-int/lit16 v2, v2, 0x22ea

    mul-int/2addr v0, v2

    if-gtz v0, :cond_a

    move-object v0, v3

    :cond_9
    const-string v2, "\u06e8\u06e1"

    move-object v3, v0

    goto/16 :goto_3

    :cond_a
    sget v0, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    rem-int/2addr v0, v2

    const v2, 0x1abe64

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_f
    iget-wide v4, p0, Lys;->b:D

    sget v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    if-gtz v0, :cond_b

    const-string v0, "\u06e0\u06e3\u06e1"

    goto/16 :goto_2

    :cond_b
    sget v0, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v2, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    div-int/2addr v0, v2

    const v2, -0x1abe67

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_10
    sget v0, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v1, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    if-ltz v1, :cond_5

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    const-string v1, "\u06df\u06e5\u06e2"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    goto/16 :goto_0

    :sswitch_11
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc5d -> :sswitch_0
        0xdc5f -> :sswitch_f
        0xdcf9 -> :sswitch_5
        0x1aa7bc -> :sswitch_10
        0x1aa7bd -> :sswitch_4
        0x1aab1d -> :sswitch_9
        0x1aab3e -> :sswitch_2
        0x1aab42 -> :sswitch_d
        0x1aab7d -> :sswitch_7
        0x1aaee5 -> :sswitch_b
        0x1ab24a -> :sswitch_1
        0x1ab2e3 -> :sswitch_e
        0x1ab6fc -> :sswitch_8
        0x1aba41 -> :sswitch_11
        0x1abe66 -> :sswitch_6
        0x1abe9d -> :sswitch_a
        0x1ac61f -> :sswitch_3
        0x1ac908 -> :sswitch_c
    .end sparse-switch
.end method
