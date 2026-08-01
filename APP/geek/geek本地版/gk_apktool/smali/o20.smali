.class public final synthetic Lo20;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final a:Landroid/app/Dialog;

.field public final b:Landroid/widget/LinearLayout;

.field public final c:I


# direct methods
.method public synthetic constructor <init>(ILandroid/app/Dialog;Landroid/widget/LinearLayout;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e8\u06e1\u06e5"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(I)V

    sget v0, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    mul-int/lit16 v2, v2, 0xd9d

    rem-int/2addr v0, v2

    if-gtz v0, :cond_0

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    const-string v0, "\u06e3\u06e8\u06e2"

    invoke-static {v0}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    mul-int/2addr v0, v2

    const v2, 0x73515

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    iput-object p3, p0, Lo20;->b:Landroid/widget/LinearLayout;

    sget v0, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v2, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    div-int/lit16 v2, v2, 0x19ff

    xor-int/2addr v0, v2

    if-ltz v0, :cond_1

    const-string v0, "\u06e3\u06e8\u06e8"

    invoke-static {v0}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e3\u06e8\u06e2"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_3
    iput-object p2, p0, Lo20;->a:Landroid/app/Dialog;

    const-string v0, "\u06df\u06e2\u06e1"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    :sswitch_4
    sget v0, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    xor-int/lit16 v2, v2, -0x2440

    sub-int/2addr v0, v2

    if-ltz v0, :cond_3

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    const-string v0, "\u06e1\u06e7\u06e0"

    move-object v2, v0

    move v3, v1

    :goto_2
    invoke-static {v2}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    move v1, v3

    move v2, v0

    goto :goto_0

    :cond_3
    sget v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v2, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    xor-int/2addr v0, v2

    const v2, 0xd919

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    move-result v0

    if-ltz v0, :cond_2

    sget v0, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v2, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    div-int/2addr v0, v2

    const v2, 0x1aab61

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_6
    iput p1, p0, Lo20;->c:I

    move v0, v1

    :cond_4
    const-string v1, "\u06e6\u06e6\u06e8"

    invoke-static {v1}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    goto/16 :goto_0

    :sswitch_7
    sget v0, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    div-int/lit16 v2, v2, -0x1e28

    sub-int/2addr v0, v2

    if-gtz v0, :cond_5

    const/16 v0, 0x35

    sput v0, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    const-string v0, "\u06e4\u06e2\u06e2"

    goto :goto_1

    :cond_5
    const-string v0, "\u06e8\u06e1\u06e5"

    goto :goto_1

    :sswitch_8
    const-string v0, "vizdhe3"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۣۣۣۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    move-result v1

    if-lez v1, :cond_4

    const-string v1, "\u06e8\u06e1"

    move-object v2, v1

    move v3, v0

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0xdbe1 -> :sswitch_0
        0xdcf9 -> :sswitch_1
        0x1aa75e -> :sswitch_2
        0x1aab61 -> :sswitch_8
        0x1ab71d -> :sswitch_6
        0x1ab723 -> :sswitch_4
        0x1abd8c -> :sswitch_7
        0x1ac228 -> :sswitch_5
        0x1ac90c -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 7

    const/4 v0, 0x0

    const/4 v6, 0x0

    const-string v1, "\u06e7\u06e1\u06e2"

    invoke-static {v1}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v2

    move-object v3, v0

    move-object v4, v0

    move v5, v2

    move v1, v6

    :goto_0
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sub-int/2addr v0, v2

    const v2, -0x1ac555

    xor-int/2addr v0, v2

    move v5, v0

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lo20;->b:Landroid/widget/LinearLayout;

    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v4, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    xor-int/lit16 v4, v4, -0xa83

    rem-int/2addr v2, v4

    if-ltz v2, :cond_0

    const/16 v2, 0x9

    sput v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    const-string v2, "\u06e0\u06e2\u06e8"

    invoke-static {v2}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v2

    move-object v4, v0

    move v5, v2

    goto :goto_0

    :cond_0
    const-string v2, "\u06e0\u06e5\u06e5"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v4, v0

    move v5, v2

    goto :goto_0

    :sswitch_2
    invoke-virtual {v3}, Lh40;->h()V

    sget v0, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    if-ltz v0, :cond_1

    const-string v0, "\u06e7\u06e1\u06e2"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    div-int/2addr v0, v2

    const v2, 0x1ac5e9

    xor-int/2addr v0, v2

    move v5, v0

    goto :goto_0

    :sswitch_3
    invoke-virtual {v4, v1}, Landroid/view/View;->setTranslationY(F)V

    sget v0, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    if-gtz v0, :cond_2

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    const-string v0, "\u06df\u06e1\u06e1"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_2
    const-string v2, "\u06e0\u06e2\u06e8"

    move v0, v1

    :goto_1
    invoke-static {v2}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    move v1, v0

    goto :goto_0

    :sswitch_4
    const v0, -0x7e0502b1

    sget v2, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    xor-int/2addr v0, v2

    invoke-virtual {v4, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const-string v0, "\u06df\u06e2\u06e1"

    :goto_2
    invoke-static {v0}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :sswitch_5
    iget v0, p0, Lo20;->c:I

    int-to-float v0, v0

    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v2, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    or-int/lit16 v2, v2, 0x1cfa

    xor-int/2addr v1, v2

    if-ltz v1, :cond_3

    const-string v1, "\u06e8\u06e2\u06e3"

    move-object v2, v1

    goto :goto_1

    :cond_3
    const-string v1, "\u06e8\u06e2\u06e3"

    move-object v2, v1

    goto :goto_1

    :sswitch_6
    iget-object v0, p0, Lo20;->a:Landroid/app/Dialog;

    invoke-static {v0}, Lmn;->a(Landroid/app/Dialog;)V

    sget v0, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    or-int/lit16 v2, v2, -0x204d

    add-int/2addr v0, v2

    if-ltz v0, :cond_4

    :cond_4
    const-string v0, "\u06e2\u06e8\u06e8"

    goto :goto_2

    :sswitch_7
    new-instance v2, Lh40;

    sget-object v0, Lh40;->m:Lqh;

    invoke-direct {v2, v4, v0}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    sget v0, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v3, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    mul-int/lit16 v3, v3, 0x266d

    rem-int/2addr v0, v3

    if-gtz v0, :cond_5

    const/16 v0, 0x3a

    sput v0, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    const-string v0, "\u06e3\u06e4\u06e6"

    :goto_3
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move-object v3, v2

    move v5, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e3\u06e4\u06e6"

    goto :goto_3

    :sswitch_8
    const/high16 v0, 0x43480000    # 200.0f

    const v2, 0x3f333333    # 0.7f

    invoke-static {v6, v0, v2}, Lz30;->f(FFF)Li40;

    move-result-object v0

    iput-object v0, v3, Lh40;->j:Li40;

    sget v0, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v2, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    div-int/2addr v0, v2

    const v2, -0x1ac226

    xor-int/2addr v0, v2

    move v5, v0

    goto/16 :goto_0

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa73f -> :sswitch_0
        0x1aa75e -> :sswitch_2
        0x1aab26 -> :sswitch_7
        0x1aab80 -> :sswitch_3
        0x1ab362 -> :sswitch_5
        0x1ab6a5 -> :sswitch_8
        0x1ac224 -> :sswitch_4
        0x1ac548 -> :sswitch_6
        0x1ac5e8 -> :sswitch_9
        0x1ac929 -> :sswitch_1
    .end sparse-switch
.end method
