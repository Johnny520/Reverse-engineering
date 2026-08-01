.class public final synthetic Ly7;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final a:I

.field public final b:Landroid/widget/FrameLayout;

.field public final c:I


# direct methods
.method public synthetic constructor <init>(Landroid/widget/FrameLayout;II)V
    .locals 5

    iput p3, p0, Ly7;->a:I

    iput-object p1, p0, Ly7;->b:Landroid/widget/FrameLayout;

    iput p2, p0, Ly7;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    const-string v2, "\u06e7\u06e7\u06e2"

    invoke-static {v2}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move-wide v2, v0

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    invoke-static {}, Landroidx/activity/ۣ۟۠ۤۢ;->۟۠۠ۤۥ()I

    move-result v0

    if-ltz v0, :cond_2

    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v1, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    or-int/lit16 v1, v1, -0xf25

    sub-int/2addr v0, v1

    if-gtz v0, :cond_0

    const-string v0, "\u06e6\u06e2\u06e6"

    invoke-static {v0}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v1, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    or-int/2addr v0, v1

    const v1, 0x1ab522

    add-int/2addr v0, v1

    move v4, v0

    goto :goto_0

    :sswitch_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v2, v3}, Ljava/io/PrintStream;->println(J)V

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    move-result v0

    if-gtz v0, :cond_1

    const/16 v0, 0x8

    sput v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    const-string v0, "\u06df\u06e4\u06e3"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06df\u06e4\u06e3"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_2
    :sswitch_3
    sget v0, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v1, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    xor-int/lit16 v1, v1, -0x982

    div-int/2addr v0, v1

    if-eqz v0, :cond_3

    const-string v0, "\u06df\u06e1\u06df"

    goto :goto_1

    :cond_3
    sget v0, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v1, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sub-int/2addr v0, v1

    const v1, 0x1aa717

    add-int/2addr v0, v1

    move v4, v0

    goto :goto_0

    :sswitch_4
    sget v0, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v1, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    mul-int/2addr v0, v1

    const v1, 0x1cb352

    add-int/2addr v0, v1

    move v4, v0

    goto :goto_0

    :sswitch_5
    const-string v0, "fGgxnNPeBVupIgmM4PO"

    invoke-static {v0}, Landroidx/savedstate/۠ۡۢ۠;->۟۟۟ۦۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget v2, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v3, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    add-int/lit16 v3, v3, 0x789

    or-int/2addr v2, v3

    if-gtz v2, :cond_4

    const/16 v2, 0x1d

    sput v2, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    :cond_4
    const-string v2, "\u06e7\u06e4\u06e6"

    invoke-static {v2}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v4

    move-wide v2, v0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aa79e -> :sswitch_0
        0x1ab6e5 -> :sswitch_5
        0x1ac1aa -> :sswitch_4
        0x1ac1c7 -> :sswitch_3
        0x1ac5a9 -> :sswitch_2
        0x1ac602 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 12

    const/16 v11, 0x31

    const/high16 v10, 0x43480000    # 200.0f

    const v9, 0x3f333333    # 0.7f

    const/4 v1, 0x0

    const/4 v8, 0x0

    const-string v0, "\u06e5\u06e0\u06e4"

    invoke-static {v0}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v3

    move-object v4, v1

    move-object v0, v1

    move-object v5, v1

    move-object v6, v1

    move v7, v8

    move v2, v8

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v1, p0, Ly7;->b:Landroid/widget/FrameLayout;

    sget v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v5, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    div-int/lit16 v5, v5, 0x1345

    add-int/2addr v3, v5

    if-ltz v3, :cond_4

    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    const-string v3, "\u06e6\u06e1\u06e4"

    invoke-static {v3}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    move-object v5, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v8, v10, v9}, Lz30;->f(FFF)Li40;

    move-result-object v1

    iput-object v1, v4, Lh40;->j:Li40;

    sget v1, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    if-gtz v1, :cond_0

    const/16 v1, 0x5a

    sput v1, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    const-string v1, "\u06e5\u06e0\u06e4"

    invoke-static {v1}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_0
    sget v1, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v3, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    rem-int/2addr v1, v3

    const v3, -0x1aca3f

    xor-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_2
    iget v1, p0, Ly7;->c:I

    int-to-float v1, v1

    const-string v2, "\u06e4\u06e1\u06e3"

    move-object v3, v2

    :goto_1
    invoke-static {v3}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move v2, v1

    goto :goto_0

    :sswitch_3
    invoke-virtual {v0}, Lh40;->h()V

    sget v1, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v3, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    mul-int/2addr v1, v3

    const v3, 0x1b4411

    add-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :pswitch_0
    :sswitch_4
    sget v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    if-ltz v1, :cond_1

    const-string v1, "\u06df\u06e6\u06e8"

    :goto_2
    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_1
    sget v1, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sub-int/2addr v1, v3

    const v3, 0x1ab1eb

    add-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_5
    sget v1, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    if-ltz v1, :cond_2

    const/16 v1, 0x18

    sput v1, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    const-string v3, "\u06e1\u06e4\u06e6"

    move v1, v2

    goto :goto_1

    :cond_2
    sget v1, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v3, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sub-int/2addr v1, v3

    const v3, -0x1abc6b

    xor-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_6
    iget v1, p0, Ly7;->a:I

    packed-switch v1, :pswitch_data_0

    :sswitch_7
    sget v1, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    if-ltz v1, :cond_3

    const/16 v1, 0x1c

    sput v1, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    const-string v1, "\u06e0\u06e3\u06e3"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06e7\u06e1\u06e2"

    move v1, v2

    goto :goto_1

    :sswitch_8
    iget-object v1, p0, Ly7;->b:Landroid/widget/FrameLayout;

    sget v3, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v6, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    mul-int/2addr v3, v6

    const v6, 0x162f55

    add-int/2addr v3, v6

    move-object v6, v1

    goto/16 :goto_0

    :sswitch_9
    new-instance v1, Lh40;

    sget-object v3, Lh40;->m:Lqh;

    invoke-direct {v1, v6, v3}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    sget v3, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v4, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    div-int/2addr v3, v4

    const v4, 0x1ac929

    add-int/2addr v3, v4

    move-object v4, v1

    goto/16 :goto_0

    :cond_4
    sget v3, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v5, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sub-int/2addr v3, v5

    const v5, 0x1aa4a2

    add-int/2addr v3, v5

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_a
    invoke-virtual {v4}, Lh40;->h()V

    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    if-gtz v1, :cond_5

    sput v11, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    const-string v1, "\u06e6\u06e4\u06e3"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06df\u06e7\u06e2"

    invoke-static {v1}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :sswitch_b
    new-instance v0, Lh40;

    sget-object v1, Lh40;->m:Lqh;

    invoke-direct {v0, v5, v1}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    const-string v1, "\u06e6\u06e4\u06e3"

    goto/16 :goto_2

    :sswitch_c
    invoke-static {v8, v10, v9}, Lz30;->f(FFF)Li40;

    move-result-object v1

    iput-object v1, v0, Lh40;->j:Li40;

    sget v1, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v3, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    add-int/2addr v1, v3

    const v3, -0x1acfe9

    xor-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_d
    invoke-virtual {v5, v7}, Landroid/view/View;->setTranslationY(F)V

    sget v1, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v3, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    add-int/lit16 v3, v3, 0x225c

    add-int/2addr v1, v3

    if-gtz v1, :cond_6

    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    const-string v1, "\u06e8\u06e2\u06e4"

    invoke-static {v1}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_6
    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v3, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sub-int/2addr v1, v3

    const v3, -0x1ab581

    xor-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_e
    invoke-virtual {v6, v2}, Landroid/view/View;->setTranslationY(F)V

    sget v1, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    if-gtz v1, :cond_7

    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    const-string v1, "\u06df\u06e4\u06df"

    invoke-static {v1}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u06e2\u06e6\u06df"

    invoke-static {v1}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :sswitch_f
    iget v1, p0, Ly7;->c:I

    int-to-float v7, v1

    sget v1, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v3, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    add-int/lit16 v3, v3, -0xbcc

    add-int/2addr v1, v3

    if-ltz v1, :cond_8

    sput v11, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    const-string v1, "\u06e8\u06e2\u06e7"

    invoke-static {v1}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_8
    sget v1, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v3, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    or-int/2addr v1, v3

    const v3, 0xdd20

    add-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_10
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdcff -> :sswitch_0
        0x1aa79a -> :sswitch_d
        0x1aa7fa -> :sswitch_10
        0x1aaf00 -> :sswitch_f
        0x1ab31b -> :sswitch_9
        0x1ab6c1 -> :sswitch_b
        0x1aba06 -> :sswitch_8
        0x1aba83 -> :sswitch_e
        0x1abda9 -> :sswitch_6
        0x1ac16c -> :sswitch_7
        0x1ac189 -> :sswitch_5
        0x1ac1e5 -> :sswitch_c
        0x1ac548 -> :sswitch_2
        0x1ac90d -> :sswitch_3
        0x1ac92a -> :sswitch_1
        0x1ac92d -> :sswitch_10
        0x1ac964 -> :sswitch_4
        0x1ac9a2 -> :sswitch_a
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
