.class public final synthetic Lkn;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final a:Landroid/app/Dialog;

.field public final b:Landroid/widget/LinearLayout;

.field public final c:Landroid/widget/EditText;

.field public final d:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Dialog;Landroid/widget/LinearLayout;Landroid/widget/EditText;Landroid/app/Activity;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e4\u06e6\u06e6"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p4, p0, Lkn;->d:Landroid/app/Activity;

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    move-result v0

    if-ltz v0, :cond_6

    :cond_0
    const-string v0, "\u06e5\u06e5\u06df"

    invoke-static {v0}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    move-result v0

    if-gtz v0, :cond_3

    sget v0, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    if-gtz v0, :cond_1

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    const-string v0, "\u06e3\u06e6\u06e1"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e3\u06e6\u06e1"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(F)V

    sget v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v2, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    div-int/lit16 v2, v2, 0x405

    mul-int/2addr v0, v2

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    const-string v0, "\u06e0\u06e4"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_3
    const-string v0, "GadyFN"

    invoke-static {v0}, Landroidx/legacy/content/۠ۥۣۥ;->ۦۢۦۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    if-gtz v0, :cond_2

    const/16 v0, 0xb

    sput v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    const-string v0, "\u06e6\u06e7\u06e3"

    invoke-static {v0}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e6\u06e7\u06e3"

    :goto_2
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    :sswitch_4
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    if-ltz v0, :cond_4

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    const-string v0, "\u06e0\u06e3\u06e2"

    invoke-static {v0}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_4
    sget v0, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    rem-int/2addr v0, v2

    const v2, 0x1abced

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_5
    iput-object p2, p0, Lkn;->b:Landroid/widget/LinearLayout;

    sget v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    div-int/lit16 v2, v2, 0x1e18

    xor-int/2addr v0, v2

    if-ltz v0, :cond_5

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    const-string v0, "\u06e4\u06e6\u06e6"

    goto :goto_2

    :cond_5
    sget v0, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    rem-int/2addr v0, v2

    const v2, 0x1aba49

    xor-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_6
    iput-object p1, p0, Lkn;->a:Landroid/app/Dialog;

    sget v0, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    div-int/lit16 v2, v2, -0x1342

    xor-int/2addr v0, v2

    if-ltz v0, :cond_7

    const/16 v0, 0x50

    sput v0, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    :cond_6
    const-string v0, "\u06e7\u06e1\u06e0"

    goto/16 :goto_1

    :cond_7
    sget v0, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v2, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    rem-int/2addr v0, v2

    const v2, -0xdc51

    xor-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    move-result v0

    if-ltz v0, :cond_8

    const-string v0, "\u06e5\u06e6\u06e8"

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06e4\u06e6\u06e6"

    goto :goto_3

    :sswitch_8
    iput-object p3, p0, Lkn;->c:Landroid/widget/EditText;

    sget v0, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    div-int/2addr v0, v2

    const v2, 0xdc03

    xor-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc02 -> :sswitch_0
        0xdc04 -> :sswitch_4
        0xdcbb -> :sswitch_5
        0x1ab285 -> :sswitch_7
        0x1ab6de -> :sswitch_3
        0x1aba7e -> :sswitch_8
        0x1abaa4 -> :sswitch_6
        0x1abe3f -> :sswitch_9
        0x1ac242 -> :sswitch_2
        0x1ac546 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 14

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v0, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06df\u06df\u06e7"

    invoke-static {v7}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v9

    move-object v7, v0

    move-object v8, v4

    :goto_0
    sparse-switch v9, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v4, 0x43480000    # 200.0f

    const v9, 0x3f19999a    # 0.6f

    invoke-static {v0, v4, v9}, Lz30;->f(FFF)Li40;

    move-result-object v0

    iput-object v0, v6, Lh40;->j:Li40;

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    move-result v0

    if-ltz v0, :cond_6

    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    const-string v0, "\u06e5\u06e8\u06e0"

    invoke-static {v0}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lkn;->b:Landroid/widget/LinearLayout;

    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    if-ltz v2, :cond_0

    :goto_1
    const-string v2, "\u06e7\u06e5\u06e8"

    invoke-static {v2}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v4

    move-object v2, v0

    move v9, v4

    goto :goto_0

    :cond_0
    sget v2, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v4, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sub-int/2addr v2, v4

    const v4, 0x1aba1e

    add-int/2addr v4, v2

    move-object v2, v0

    move v9, v4

    goto :goto_0

    :sswitch_2
    sget v0, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v4, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    xor-int/lit16 v5, v5, -0xec9

    or-int/2addr v4, v5

    if-ltz v4, :cond_a

    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    const-string v4, "\u06e8\u06df\u06e4"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v4

    move v5, v0

    move v9, v4

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v0, v5, 0x1dc

    const/4 v4, 0x0

    invoke-virtual {v2, v0, v4}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    sget v0, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v4, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    div-int/lit16 v4, v4, 0x2296

    xor-int/2addr v0, v4

    if-gtz v0, :cond_2

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    :cond_1
    const-string v0, "\u06df\u06e5\u06e3"

    :goto_2
    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v4, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    mul-int/2addr v0, v4

    const v4, 0x1c6d9a

    add-int/2addr v0, v4

    move v9, v0

    goto :goto_0

    :sswitch_4
    const-string v0, "a2y9wo4cX6R2aqLT\n"

    const-string v4, "AgLNt/pDMsE=\n"

    invoke-static {v0, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v4, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v8, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sub-int/2addr v4, v8

    const v8, 0x1aad23

    add-int/2addr v4, v8

    move-object v8, v0

    move v9, v4

    goto/16 :goto_0

    :sswitch_5
    sget v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v4, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    xor-int/lit16 v4, v4, -0x202a

    rem-int/2addr v0, v4

    if-gtz v0, :cond_3

    invoke-static {}, Landroidx/activity/ۣ۟۠ۤۢ;->۟۠۠ۤۥ()I

    const-string v0, "\u06e1\u06df\u06e2"

    :goto_3
    invoke-static {v0}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06df\u06df\u06e7"

    goto :goto_3

    :sswitch_6
    invoke-virtual {v6}, Lh40;->h()V

    sget v0, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v4, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    mul-int/lit16 v4, v4, -0x2509

    sub-int/2addr v0, v4

    if-ltz v0, :cond_4

    const/16 v0, 0x43

    sput v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    const-string v0, "\u06e4\u06e2\u06e2"

    :goto_4
    invoke-static {v0}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06e0\u06e7\u06e7"

    goto :goto_2

    :sswitch_7
    const-string v0, "D82BLowgqGsP15lizibpZgDLmWLYLOlrDtbALNkvpSUVwZ0njCKnYRPXhCaCNaBgFpaELNw2vWgE\nzIUtyG2AaxHNmQ/JN6FqBfWMLM0krHc=\n"

    const-string v4, "YbjtQqxDyQU=\n"

    invoke-static {v0, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    move-result v0

    if-ltz v0, :cond_5

    const/16 v0, 0x1f

    sput v0, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    :goto_5
    const-string v0, "\u06e1\u06e1\u06e4"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_5
    move-object v0, v2

    goto/16 :goto_1

    :sswitch_8
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/view/View;->setAlpha(F)V

    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    if-gtz v0, :cond_1

    const/16 v0, 0x53

    sput v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    const-string v0, "\u06e7\u06e7\u06e2"

    :goto_6
    invoke-static {v0}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :sswitch_9
    invoke-virtual {v3}, Lh40;->h()V

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    move-result v0

    if-gtz v0, :cond_7

    const/16 v0, 0x12

    sput v0, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    :cond_6
    const-string v0, "\u06e6\u06e3\u06e3"

    :goto_7
    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_7
    sget v0, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v4, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    xor-int/2addr v0, v4

    const v4, -0x1ac16e

    xor-int/2addr v0, v4

    move v9, v0

    goto/16 :goto_0

    :sswitch_a
    const v0, 0x3f19999a    # 0.6f

    invoke-virtual {v2, v0}, Landroid/view/View;->setScaleX(F)V

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    move-result v0

    if-ltz v0, :cond_8

    const-string v0, "\u06e4\u06e1\u06e6"

    invoke-static {v0}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_8
    sget v0, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v4, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sub-int/2addr v0, v4

    const v4, 0x1ac241

    add-int/2addr v0, v4

    move v9, v0

    goto/16 :goto_0

    :sswitch_b
    new-instance v0, Lh40;

    sget-object v3, Lh40;->n:Lqh;

    invoke-direct {v0, v2, v3}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    sget v3, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    rem-int/lit16 v4, v4, 0x21b9

    rem-int/2addr v3, v4

    if-gtz v3, :cond_9

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    const-string v3, "\u06e7\u06e0\u06e1"

    move-object v4, v3

    :goto_8
    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v0

    move v9, v4

    goto/16 :goto_0

    :cond_9
    sget v3, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v4, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    add-int/2addr v3, v4

    const v4, 0x1ab97d

    add-int/2addr v4, v3

    move-object v3, v0

    move v9, v4

    goto/16 :goto_0

    :sswitch_c
    move-object v0, v1

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    const/4 v4, 0x1

    invoke-virtual {v0, v7, v4}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    sget v0, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v4, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    div-int/lit16 v4, v4, 0x25b7

    add-int/2addr v0, v4

    if-gtz v0, :cond_b

    const/16 v0, 0x51

    sput v0, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    move v0, v5

    :cond_a
    const-string v4, "\u06e3\u06e7"

    invoke-static {v4}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v4

    move v5, v0

    move v9, v4

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06e5\u06e8\u06e0"

    move-object v0, v3

    goto :goto_8

    :sswitch_d
    new-instance v0, Lln;

    const/4 v4, 0x1

    invoke-direct {v0, v2, v4}, Lln;-><init>(Landroid/widget/LinearLayout;I)V

    invoke-virtual {v6, v0}, Lh40;->a(Lsh;)V

    sget v0, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v4, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    xor-int/lit16 v4, v4, -0x12f3

    rem-int/2addr v0, v4

    if-gtz v0, :cond_c

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    move-object v0, v6

    :goto_9
    const-string v4, "\u06e0\u06e5"

    invoke-static {v4}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move-object v6, v0

    move v9, v4

    goto/16 :goto_0

    :cond_c
    const-string v0, "\u06e3\u06e6\u06e0"

    goto/16 :goto_6

    :sswitch_e
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v0, v4}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v10, -0xf4

    sget v4, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    int-to-long v12, v4

    xor-long/2addr v10, v12

    invoke-virtual {v0, v10, v11}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    const-string v0, "\u06e8\u06df\u06e4"

    goto/16 :goto_7

    :sswitch_f
    new-instance v0, Lh40;

    sget-object v4, Lh40;->o:Lqh;

    invoke-direct {v0, v2, v4}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    goto :goto_9

    :sswitch_10
    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v4, 0x43480000    # 200.0f

    const v9, 0x3f19999a    # 0.6f

    invoke-static {v0, v4, v9}, Lz30;->f(FFF)Li40;

    move-result-object v0

    iput-object v0, v3, Lh40;->j:Li40;

    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v4, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    add-int/lit16 v4, v4, 0xff9

    or-int/2addr v0, v4

    if-gtz v0, :cond_d

    const/16 v0, 0xf

    sput v0, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    const-string v0, "\u06e0\u06e7\u06e7"

    invoke-static {v0}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_d
    const-string v0, "\u06e7\u06e2\u06e5"

    goto/16 :goto_2

    :sswitch_11
    const v0, 0x3f19999a    # 0.6f

    invoke-virtual {v2, v0}, Landroid/view/View;->setScaleY(F)V

    goto/16 :goto_5

    :sswitch_12
    iget-object v0, p0, Lkn;->d:Landroid/app/Activity;

    invoke-virtual {v0, v8}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e4\u06e2\u06e2"

    goto/16 :goto_6

    :sswitch_13
    invoke-virtual {v7}, Landroid/view/View;->requestFocus()Z

    const-string v0, "\u06e0\u06df\u06e5"

    invoke-static {v0}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :sswitch_14
    iget-object v0, p0, Lkn;->c:Landroid/widget/EditText;

    sget v4, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    if-ltz v4, :cond_e

    const-string v4, "\u06e3\u06e6\u06e0"

    invoke-static {v4}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v4

    move-object v7, v0

    move v9, v4

    goto/16 :goto_0

    :cond_e
    const-string v4, "\u06e1\u06e8\u06e8"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v4

    move-object v7, v0

    move v9, v4

    goto/16 :goto_0

    :sswitch_15
    iget-object v0, p0, Lkn;->a:Landroid/app/Dialog;

    invoke-static {v0}, Lmn;->a(Landroid/app/Dialog;)V

    const-string v0, "\u06e7\u06e7\u06e2"

    goto/16 :goto_4

    :sswitch_16
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc05 -> :sswitch_0
        0xdc64 -> :sswitch_1
        0x1aa707 -> :sswitch_15
        0x1aa7bd -> :sswitch_e
        0x1aaac6 -> :sswitch_4
        0x1aab05 -> :sswitch_5
        0x1aabbc -> :sswitch_12
        0x1aabc0 -> :sswitch_14
        0x1aaec4 -> :sswitch_8
        0x1aafa1 -> :sswitch_13
        0x1ab6dd -> :sswitch_6
        0x1ab722 -> :sswitch_10
        0x1aba09 -> :sswitch_3
        0x1aba24 -> :sswitch_7
        0x1abe9d -> :sswitch_16
        0x1ac1c6 -> :sswitch_d
        0x1ac21f -> :sswitch_f
        0x1ac528 -> :sswitch_a
        0x1ac56a -> :sswitch_9
        0x1ac58b -> :sswitch_11
        0x1ac5ca -> :sswitch_c
        0x1ac602 -> :sswitch_2
        0x1ac8cd -> :sswitch_b
    .end sparse-switch
.end method
