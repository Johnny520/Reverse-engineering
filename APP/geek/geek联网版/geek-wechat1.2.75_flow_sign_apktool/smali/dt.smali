.class public final synthetic Ldt;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final a:Landroid/widget/LinearLayout;

.field public final b:Landroid/webkit/WebView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/LinearLayout;Landroid/webkit/WebView;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e4\u06e3\u06e3"

    invoke-static {v0}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p2, p0, Ldt;->b:Landroid/webkit/WebView;

    sget v0, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    div-int/lit16 v2, v2, -0xcb7

    add-int/2addr v0, v2

    if-ltz v0, :cond_2

    const/16 v0, 0x27

    sput v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    const-string v0, "\u06e7\u06e1\u06df"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "RSanCbodq8PX2NptjFlpB7E20ml"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦ۠۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v1

    if-ltz v1, :cond_0

    const-string v1, "\u06e8\u06e1\u06e3"

    invoke-static {v1}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_0
    const-string v1, "\u06e2\u06e5\u06e6"

    move-object v2, v1

    :goto_1
    invoke-static {v2}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sub-int/2addr v0, v2

    const v2, 0x1ac90a

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    sget v0, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    add-int/lit16 v2, v2, -0x8fb

    add-int/2addr v0, v2

    if-ltz v0, :cond_1

    const-string v0, "\u06df\u06e4\u06e8"

    :goto_2
    invoke-static {v0}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    xor-int/2addr v0, v2

    const v2, 0x1abce4

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    rem-int/2addr v0, v2

    const v2, 0x1ac240

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_3
    :sswitch_4
    sget v0, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    mul-int/lit16 v2, v2, 0x2320

    sub-int/2addr v0, v2

    if-gtz v0, :cond_4

    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    const-string v0, "\u06e1\u06e8\u06df"

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06e8\u06e1\u06e3"

    goto :goto_3

    :sswitch_5
    iput-object p1, p0, Ldt;->a:Landroid/widget/LinearLayout;

    sget v0, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    xor-int/lit16 v2, v2, -0xfe8

    rem-int/2addr v0, v2

    if-gtz v0, :cond_5

    const-string v2, "\u06e4\u06e3\u06e3"

    move-object v0, v1

    goto :goto_1

    :cond_5
    const-string v0, "\u06e0\u06e6\u06e8"

    goto :goto_2

    :sswitch_6
    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    move-result v0

    if-gtz v0, :cond_3

    sget v0, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v2, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    mul-int/lit16 v2, v2, 0x1a50

    div-int/2addr v0, v2

    if-eqz v0, :cond_6

    const/16 v0, 0x54

    sput v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    :cond_6
    const-string v0, "\u06e5\u06e3\u06e7"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaba2 -> :sswitch_0
        0x1aaf62 -> :sswitch_3
        0x1ab303 -> :sswitch_2
        0x1aba44 -> :sswitch_5
        0x1abe09 -> :sswitch_1
        0x1ac240 -> :sswitch_6
        0x1ac545 -> :sswitch_4
        0x1ac90a -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 4

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e5\u06e6"

    invoke-static {v1}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v2

    move-object v3, v0

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    iget-object v0, p0, Ldt;->b:Landroid/webkit/WebView;

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    move-result v2

    if-ltz v2, :cond_0

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    const-string v2, "\u06e5\u06df\u06e8"

    invoke-static {v2}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v3, v0

    goto :goto_0

    :cond_0
    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v3, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    mul-int/2addr v2, v3

    const v3, 0x1e308d

    add-int/2addr v2, v3

    move-object v3, v0

    goto :goto_0

    :sswitch_2
    invoke-virtual {v3}, Landroid/view/ViewGroup;->removeAllViews()V

    sget v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    add-int/lit16 v2, v2, 0x246e

    add-int/2addr v0, v2

    if-gtz v0, :cond_1

    const/16 v0, 0x5e

    sput v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    const-string v0, "\u06df\u06e0\u06e2"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06df\u06e5\u06e8"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_3
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    sget v0, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    if-gtz v0, :cond_2

    const-string v2, "\u06df\u06e5\u06e8"

    move-object v0, v1

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    add-int/2addr v0, v2

    const v2, 0x1aa995

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    sget v0, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    add-int/lit16 v2, v2, 0xf58

    mul-int/2addr v0, v2

    if-gtz v0, :cond_3

    const/16 v0, 0x12

    sput v0, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    const-string v0, "\u06e1\u06df\u06e4"

    :goto_3
    invoke-static {v0}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e3\u06e5\u06e6"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_5
    invoke-virtual {v3}, Landroid/webkit/WebView;->destroy()V

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    move-result v0

    if-ltz v0, :cond_4

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    const-string v0, "\u06e0\u06e3\u06e4"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06df\u06e0\u06e2"

    goto :goto_3

    :sswitch_6
    invoke-virtual {v3}, Landroid/webkit/WebView;->clearHistory()V

    sget v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    add-int/lit16 v2, v2, 0xe0

    sub-int/2addr v0, v2

    if-ltz v0, :cond_5

    const-string v0, "\u06e0\u06e4\u06e7"

    goto :goto_1

    :cond_5
    const-string v0, "\u06e4\u06df\u06e6"

    goto :goto_3

    :sswitch_7
    iget-object v0, p0, Ldt;->a:Landroid/widget/LinearLayout;

    sget v1, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    div-int/lit16 v2, v2, 0xdae

    xor-int/2addr v1, v2

    if-gtz v1, :cond_6

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    const-string v1, "\u06e3\u06e5\u06e6"

    invoke-static {v1}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06e0\u06e4\u06e7"

    move-object v2, v1

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa721 -> :sswitch_0
        0x1aa7c2 -> :sswitch_5
        0x1aab41 -> :sswitch_6
        0x1aab63 -> :sswitch_1
        0x1ab6c4 -> :sswitch_7
        0x1ab6dd -> :sswitch_3
        0x1ab9cb -> :sswitch_2
        0x1abd8e -> :sswitch_4
    .end sparse-switch
.end method
