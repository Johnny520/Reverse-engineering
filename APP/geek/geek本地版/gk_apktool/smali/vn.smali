.class public final Lvn;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final a:Landroid/widget/TextView;

.field public final b:Ljava/lang/String;

.field public final c:Lsm;

.field public final d:Landroid/widget/SeekBar;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Ljava/lang/String;Lsm;Landroid/widget/SeekBar;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    const-string v2, "\u06e0\u06df\u06e0"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p3, p0, Lvn;->c:Lsm;

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    move-result v2

    if-gtz v2, :cond_6

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    const-string v2, "\u06e4\u06e5\u06e0"

    :goto_1
    invoke-static {v2}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_1
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

    const-string v2, "\u06e4\u06e5\u06e0"

    invoke-static {v2}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/activity/ۣ۟۠ۤۢ;->۟۠۠ۤۥ()I

    move-result v2

    if-ltz v2, :cond_4

    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    if-ltz v2, :cond_1

    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    :cond_0
    const-string v2, "\u06df\u06e1"

    invoke-static {v2}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_1
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v3, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    mul-int/2addr v2, v3

    const v3, 0x1a5a13

    add-int/2addr v2, v3

    goto :goto_0

    :sswitch_3
    iput-object p2, p0, Lvn;->b:Ljava/lang/String;

    sget v2, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    if-ltz v2, :cond_0

    const-string v2, "\u06df\u06df\u06df"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_4
    const-string v0, "xWy2t2y4BoXV7Bb2fSDpY"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۥۣۧۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v3, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    mul-int/lit16 v3, v3, -0x1ad5

    div-int/2addr v2, v3

    if-eqz v2, :cond_3

    const/16 v2, 0x4d

    sput v2, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    :cond_2
    const-string v2, "\u06e0\u06e2\u06e4"

    invoke-static {v2}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_3
    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    xor-int/2addr v2, v3

    const v3, 0x1aa374

    add-int/2addr v2, v3

    goto :goto_0

    :cond_4
    :sswitch_5
    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v3, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    xor-int/2addr v2, v3

    const v3, 0x1abb30

    add-int/2addr v2, v3

    goto :goto_0

    :sswitch_6
    iput-object p1, p0, Lvn;->a:Landroid/widget/TextView;

    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v3, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    rem-int/lit16 v3, v3, 0x122e

    xor-int/2addr v2, v3

    if-gtz v2, :cond_5

    const-string v2, "\u06e0\u06e4\u06e7"

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :cond_5
    const-string v2, "\u06e0\u06e4\u06e7"

    goto :goto_2

    :cond_6
    const-string v2, "\u06e6\u06e1\u06e3"

    goto/16 :goto_1

    :sswitch_7
    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    if-ltz v2, :cond_7

    const/16 v2, 0x13

    sput v2, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    const-string v2, "\u06e8\u06df\u06e8"

    :goto_3
    invoke-static {v2}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06e0\u06df\u06e0"

    goto :goto_3

    :sswitch_8
    iput-object p4, p0, Lvn;->d:Landroid/widget/SeekBar;

    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v3, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    mul-int/lit16 v3, v3, 0xd7a

    xor-int/2addr v2, v3

    if-gtz v2, :cond_2

    const-string v2, "\u06e6\u06e1\u06e3"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe2 -> :sswitch_0
        0x1aa6ff -> :sswitch_1
        0x1aa79b -> :sswitch_7
        0x1aaac1 -> :sswitch_6
        0x1aab22 -> :sswitch_2
        0x1aab63 -> :sswitch_3
        0x1ab665 -> :sswitch_5
        0x1aba7f -> :sswitch_9
        0x1abdeb -> :sswitch_4
        0x1ac188 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 5

    const/4 v1, 0x0

    const/16 v4, 0x48

    const-string v0, "\u06e7\u06e1\u06e0"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v3

    move-object v0, v1

    move-object v2, v1

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    move-result v1

    if-ltz v1, :cond_8

    :cond_0
    const-string v1, "\u06e3\u06e2\u06e0"

    invoke-static {v1}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :sswitch_1
    if-eqz p3, :cond_4

    const-string v1, "\u06e3\u06e2\u06e8"

    :goto_1
    invoke-static {v1}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :sswitch_2
    sget-object v1, Lgn;->a:Lgn;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v1, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    if-ltz v1, :cond_1

    const/16 v1, 0x39

    sput v1, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    const-string v1, "\u06e7\u06e1\u06e7"

    invoke-static {v1}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_1
    const-string v3, "\u06e3\u06e0\u06e0"

    move-object v1, v2

    :goto_2
    invoke-static {v3}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v1}, Lsm;->f(Ljava/lang/Object;)Ljava/lang/Object;

    sget v1, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    if-gtz v1, :cond_2

    sput v4, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    const-string v1, "\u06e8\u06e5\u06e1"

    invoke-static {v1}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_2
    sget v1, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    xor-int/2addr v1, v3

    const v3, 0x1aab54

    add-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_4
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    if-ltz v1, :cond_3

    const/16 v1, 0x40

    sput v1, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    const-string v1, "\u06e1\u06e8\u06e4"

    invoke-static {v1}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e1\u06e2\u06e2"

    invoke-static {v1}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_4
    :sswitch_5
    sget v1, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    if-gtz v1, :cond_5

    const-string v1, "\u06e5\u06e8\u06e0"

    goto :goto_1

    :cond_5
    const-string v1, "\u06e0\u06e2\u06e5"

    goto :goto_1

    :sswitch_6
    iget-object v1, p0, Lvn;->b:Ljava/lang/String;

    invoke-static {v1, p2}, Lgn;->g(Ljava/lang/String;I)V

    sget v1, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    if-ltz v1, :cond_6

    const-string v1, "\u06e3\u06e2\u06e8"

    :goto_3
    invoke-static {v1}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06e7\u06e1\u06e7"

    goto :goto_1

    :sswitch_7
    sget v1, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v3, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sub-int/2addr v1, v3

    const v3, 0x1ac806

    add-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_8
    if-eqz v2, :cond_4

    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    move-result v1

    if-ltz v1, :cond_7

    sput v4, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    const-string v1, "\u06e3\u06e0\u06e0"

    invoke-static {v1}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u06e7\u06e3\u06e4"

    goto :goto_3

    :cond_8
    :sswitch_9
    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v3, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    or-int/2addr v1, v3

    const v3, -0x1aacf6

    xor-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_a
    iget-object v1, p0, Lvn;->c:Lsm;

    sget v2, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v3, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    div-int/lit16 v3, v3, 0xbde

    xor-int/2addr v2, v3

    if-ltz v2, :cond_9

    const/4 v2, 0x4

    sput v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    :cond_9
    const-string v2, "\u06e3\u06e8\u06e7"

    move-object v3, v2

    goto/16 :goto_2

    :sswitch_b
    iget-object v1, p0, Lvn;->a:Landroid/widget/TextView;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v1, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v3, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sub-int/2addr v1, v3

    const v3, 0x1abe8a

    xor-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_c
    const-string v0, "ZRSklD3hEHjgK9s"

    invoke-static {v0}, Landroidx/savedstate/ۡۤۨۡ;->ۣۦۢۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget v1, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    or-int/lit16 v3, v3, -0x24fc

    rem-int/2addr v1, v3

    if-gez v1, :cond_0

    const-string v1, "\u06e1\u06e8\u06e4"

    goto :goto_3

    :sswitch_d
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aab23 -> :sswitch_0
        0x1aaee1 -> :sswitch_d
        0x1aaf9d -> :sswitch_4
        0x1ab623 -> :sswitch_6
        0x1ab661 -> :sswitch_c
        0x1ab669 -> :sswitch_2
        0x1ab722 -> :sswitch_8
        0x1abe06 -> :sswitch_1
        0x1ac546 -> :sswitch_b
        0x1ac54d -> :sswitch_a
        0x1ac588 -> :sswitch_3
        0x1ac5c9 -> :sswitch_7
        0x1ac90d -> :sswitch_5
        0x1ac984 -> :sswitch_9
    .end sparse-switch
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 1

    const-string v0, "\u06e3\u06e5\u06e7"

    invoke-static {v0}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    const-string v0, "\u06e6\u06e5\u06e8"

    invoke-static {v0}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e3\u06e5\u06e7"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1ab6c5 -> :sswitch_0
        0x1ac241 -> :sswitch_1
    .end sparse-switch
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e5\u06e7\u06df"

    invoke-static {v1}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v1, p0, Lvn;->d:Landroid/widget/SeekBar;

    sget v2, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    xor-int/lit16 v2, v2, 0xd4

    invoke-static {v1, v2}, Lgn;->i(Landroid/view/View;I)V

    sget v1, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    if-ltz v1, :cond_2

    const/16 v1, 0x37

    sput v1, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    :goto_1
    const-string v1, "\u06e5\u06e0"

    invoke-static {v1}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    move-result v1

    if-gtz v1, :cond_3

    sget v1, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    if-gtz v1, :cond_0

    const/16 v1, 0x41

    sput v1, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    const-string v1, "\u06e5\u06e7\u06df"

    invoke-static {v1}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    const-string v1, "\u06e4\u06e5\u06e4"

    :goto_2
    invoke-static {v1}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    sget-object v1, Lgn;->a:Lgn;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    :sswitch_3
    const-string v0, "fp8LpRFx7CNgaIWDdw8JpLF0W"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۦۦۣۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    move-result v1

    if-gtz v1, :cond_1

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    const-string v1, "\u06e4\u06e5\u06e4"

    :goto_3
    invoke-static {v1}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e3\u06e7\u06e1"

    invoke-static {v1}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e4\u06e2\u06e0"

    goto :goto_3

    :cond_3
    :sswitch_4
    sget v1, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    if-ltz v1, :cond_4

    const/16 v1, 0x27

    sput v1, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    const-string v1, "\u06e2\u06e7"

    goto :goto_2

    :cond_4
    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v2, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    xor-int/2addr v1, v2

    const v2, 0x1ab401

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    sget v1, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    div-int/2addr v1, v2

    const v2, 0x1abe7d

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_6
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    move-result v1

    if-ltz v1, :cond_5

    const-string v1, "\u06e0\u06e6\u06e5"

    invoke-static {v1}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_5
    sget v1, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    mul-int/2addr v1, v2

    const v2, 0x19b992

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc9b -> :sswitch_0
        0x1aab9f -> :sswitch_4
        0x1ab62a -> :sswitch_7
        0x1ab6fd -> :sswitch_6
        0x1aba22 -> :sswitch_1
        0x1aba83 -> :sswitch_3
        0x1abe7d -> :sswitch_2
        0x1ac526 -> :sswitch_5
    .end sparse-switch
.end method
