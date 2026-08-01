.class public final synthetic Lxs;
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

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06e5\u06e6"

    invoke-static {v1}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p2, p0, Lxs;->b:Landroid/webkit/WebView;

    sget v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    or-int/lit16 v2, v2, -0x1778

    or-int/2addr v1, v2

    if-ltz v1, :cond_0

    const/16 v1, 0x61

    sput v1, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    const-string v1, "\u06e0\u06df\u06df"

    :goto_1
    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    move-result v1

    if-ltz v1, :cond_3

    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    move-result v1

    if-gtz v1, :cond_1

    :cond_0
    const-string v1, "\u06e7\u06e6\u06e0"

    invoke-static {v1}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    xor-int/2addr v1, v2

    const v2, -0x1aaa9c

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    const-string v0, "iOJRYpXx7TpiCItXMbBvmdp"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۧ۠;->۟ۦۦۣۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget v1, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    if-ltz v1, :cond_2

    const-string v1, "\u06e3\u06e7\u06e3"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e1\u06e7\u06df"

    :goto_2
    invoke-static {v1}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    iput-object p1, p0, Lxs;->a:Landroid/widget/LinearLayout;

    sget v1, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v2, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    add-int/2addr v1, v2

    const v2, 0x1aa3ec

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v1, "\u06e6\u06e5\u06df"

    goto :goto_1

    :cond_3
    :sswitch_5
    sget v1, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v2, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    div-int/lit16 v2, v2, 0x76b

    sub-int/2addr v1, v2

    if-gtz v1, :cond_4

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    const-string v1, "\u06e7\u06e3\u06e2"

    goto :goto_2

    :cond_4
    const-string v1, "\u06e6\u06e5\u06df"

    :goto_3
    invoke-static {v1}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_6
    sget v1, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    div-int/lit16 v2, v2, -0x174a

    xor-int/2addr v1, v2

    if-ltz v1, :cond_5

    const/16 v1, 0x42

    sput v1, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    const-string v1, "\u06df\u06e1\u06e2"

    goto :goto_3

    :cond_5
    const-string v1, "\u06e4\u06e5\u06e6"

    goto :goto_3

    :sswitch_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa721 -> :sswitch_0
        0x1aaac0 -> :sswitch_2
        0x1aab9d -> :sswitch_5
        0x1aaf79 -> :sswitch_4
        0x1ab6ff -> :sswitch_6
        0x1aba85 -> :sswitch_3
        0x1ac200 -> :sswitch_7
        0x1ac5e1 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 4

    const/4 v1, 0x0

    const-string v0, "\u06e5\u06e2\u06e0"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v3

    move-object v0, v1

    move-object v2, v1

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v0, p0, Lxs;->b:Landroid/webkit/WebView;

    sget v1, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    if-ltz v1, :cond_4

    invoke-static {}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۡۢۡۥ()I

    const-string v1, "\u06e5\u06e2\u06e0"

    invoke-static {v1}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :sswitch_1
    invoke-virtual {v0}, Landroid/webkit/WebView;->clearHistory()V

    sget v1, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    if-ltz v1, :cond_0

    const-string v1, "\u06e0\u06e8\u06e1"

    :goto_1
    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_0
    sget v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v3, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    xor-int/2addr v1, v3

    const v3, 0x1acd63

    add-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_2
    iget-object v1, p0, Lxs;->a:Landroid/widget/LinearLayout;

    const-string v2, "\u06e0\u06e8\u06e1"

    move-object v3, v2

    :goto_2
    invoke-static {v3}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v1

    goto :goto_0

    :sswitch_3
    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    sget v1, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    if-ltz v1, :cond_1

    const-string v3, "\u06e8\u06e5\u06e7"

    move-object v1, v2

    goto :goto_2

    :cond_1
    const-string v1, "\u06e3\u06e0\u06e5"

    goto :goto_1

    :sswitch_4
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    sget v1, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v3, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sub-int/2addr v1, v3

    const v3, 0x1ab768

    add-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_5
    sget v1, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    if-gtz v1, :cond_2

    const-string v1, "\u06e0\u06e6\u06e2"

    :goto_3
    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e5\u06e2\u06e0"

    goto :goto_3

    :sswitch_6
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    sget v1, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    or-int/lit16 v3, v3, -0x1f9e

    or-int/2addr v1, v3

    if-ltz v1, :cond_3

    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    const-string v1, "\u06e3\u06e2\u06e2"

    :goto_4
    invoke-static {v1}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e6\u06e5\u06e3"

    goto :goto_4

    :cond_4
    const-string v1, "\u06e6\u06e7\u06df"

    goto :goto_1

    :sswitch_7
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aabd9 -> :sswitch_0
        0x1ab628 -> :sswitch_7
        0x1ab663 -> :sswitch_5
        0x1abda4 -> :sswitch_3
        0x1abde3 -> :sswitch_2
        0x1ac204 -> :sswitch_1
        0x1ac23e -> :sswitch_6
        0x1ac98a -> :sswitch_4
    .end sparse-switch
.end method
