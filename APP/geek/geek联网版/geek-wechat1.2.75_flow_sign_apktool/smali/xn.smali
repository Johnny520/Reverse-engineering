.class public final synthetic Lxn;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:Ll00;

.field public final b:Lo00;

.field public final c:Landroid/widget/FrameLayout;

.field public final d:Ll00;

.field public final e:Ld6;

.field public final f:Lp00;

.field public final g:I

.field public final h:Lsn;

.field public final i:Landroid/view/View;

.field public final j:I

.field public final k:Z

.field public final l:F


# direct methods
.method public synthetic constructor <init>(FIILd6;Lsn;Ll00;Ll00;Lo00;Lp00;Landroid/view/View;Landroid/widget/FrameLayout;Z)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e1\u06e4"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p11, p0, Lxn;->c:Landroid/widget/FrameLayout;

    iput-object p7, p0, Lxn;->d:Ll00;

    sget v1, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    mul-int/2addr v1, v2

    const v2, 0x1c6d08

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_1
    iput p2, p0, Lxn;->g:I

    iput-object p5, p0, Lxn;->h:Lsn;

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    move-result v1

    if-gtz v1, :cond_0

    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    const-string v1, "\u06e3\u06e8\u06e6"

    invoke-static {v1}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    const-string v1, "\u06e4\u06e7\u06e8"

    invoke-static {v1}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    iput-boolean p12, p0, Lxn;->k:Z

    iput p1, p0, Lxn;->l:F

    sget v1, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    mul-int/lit16 v2, v2, 0x159e

    or-int/2addr v1, v2

    if-ltz v1, :cond_1

    const-string v1, "\u06e5\u06e1\u06e7"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e5\u06e1\u06e7"

    :goto_1
    invoke-static {v1}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    mul-int/2addr v1, v2

    const v2, 0x16a751

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    iput-object p10, p0, Lxn;->i:Landroid/view/View;

    iput p3, p0, Lxn;->j:I

    const-string v1, "\u06e4\u06e8\u06e2"

    :goto_2
    invoke-static {v1}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_5
    iput-object p4, p0, Lxn;->e:Ld6;

    iput-object p9, p0, Lxn;->f:Lp00;

    sget v1, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    if-gtz v1, :cond_2

    const-string v1, "\u06e2\u06e8\u06e7"

    :goto_3
    invoke-static {v1}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e3\u06e2\u06e1"

    goto :goto_3

    :cond_3
    :sswitch_6
    sget v1, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    if-ltz v1, :cond_4

    const-string v1, "\u06df\u06e8"

    goto :goto_1

    :cond_4
    sget v1, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    div-int/2addr v1, v2

    const v2, 0x1ab361

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_7
    sget v1, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    rem-int/2addr v1, v2

    const v2, 0x1aa726

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_8
    iput-object p6, p0, Lxn;->a:Ll00;

    iput-object p8, p0, Lxn;->b:Lo00;

    sget v1, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    add-int/lit16 v2, v2, -0x5cb

    div-int/2addr v1, v2

    if-eqz v1, :cond_5

    const/16 v1, 0xb

    sput v1, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    const-string v1, "\u06e3\u06e2\u06e1"

    invoke-static {v1}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_5
    sget v1, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sub-int/2addr v1, v2

    const v2, 0xdcce

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    move-result v1

    if-gtz v1, :cond_3

    const-string v0, "m544t9tRgISCNHX"

    invoke-static {v0}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۦۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget v1, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    add-int/lit16 v2, v2, 0xa32

    div-int/2addr v1, v2

    if-eqz v1, :cond_6

    const/16 v1, 0x33

    sput v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    const-string v1, "\u06e1\u06e3"

    goto :goto_2

    :cond_6
    sget v1, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    mul-int/2addr v1, v2

    const v2, 0x19bd67

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_a
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc22 -> :sswitch_0
        0x1aa742 -> :sswitch_8
        0x1ab361 -> :sswitch_a
        0x1ab662 -> :sswitch_1
        0x1ab721 -> :sswitch_7
        0x1abac5 -> :sswitch_4
        0x1abade -> :sswitch_2
        0x1abda8 -> :sswitch_5
        0x1abdcb -> :sswitch_9
        0x1abe28 -> :sswitch_3
        0x1ac58a -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 11

    const-string v0, "\u06e7\u06e2\u06e7"

    invoke-static {v0}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v1, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    xor-int/2addr v0, v1

    const v1, -0x1ab405

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lxn;->b:Lo00;

    iget-object v1, p0, Lxn;->c:Landroid/widget/FrameLayout;

    iget-object v2, p0, Lxn;->d:Ll00;

    iget-object v3, p0, Lxn;->e:Ld6;

    iget-object v4, p0, Lxn;->f:Lp00;

    iget v5, p0, Lxn;->g:I

    iget-object v6, p0, Lxn;->h:Lsn;

    iget-object v7, p0, Lxn;->i:Landroid/view/View;

    iget v8, p0, Lxn;->j:I

    iget-boolean v9, p0, Lxn;->k:Z

    iget v10, p0, Lxn;->l:F

    invoke-static/range {v0 .. v10}, Lbo;->d(Lo00;Landroid/widget/FrameLayout;Ll00;Ld6;Lp00;ILsn;Landroid/view/View;IZF)V

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    move-result v0

    if-ltz v0, :cond_1

    const-string v0, "\u06e7\u06e2\u06e7"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e3\u06e2\u06e3"

    :goto_1
    invoke-static {v0}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    add-int/lit16 v1, v1, 0x96c

    sub-int/2addr v0, v1

    if-ltz v0, :cond_2

    const/16 v0, 0x4b

    sput v0, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    const-string v0, "\u06e0\u06e0\u06e4"

    goto :goto_1

    :cond_2
    sget v0, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v1, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    add-int/2addr v0, v1

    const v1, 0x1ac39c

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Lxn;->a:Ll00;

    iget-boolean v0, v0, Ll00;->a:Z

    if-nez v0, :cond_0

    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v1, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    or-int/2addr v0, v1

    const v1, 0x1abfe6

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_4
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1ab323 -> :sswitch_0
        0x1ab664 -> :sswitch_4
        0x1ac1c3 -> :sswitch_1
        0x1ac54d -> :sswitch_2
        0x1ac56c -> :sswitch_3
    .end sparse-switch
.end method
