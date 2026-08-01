.class public final synthetic Lpk;
.super Ljava/lang/Object;

# interfaces
.implements Lum;


# instance fields
.field public final a:Lp00;

.field public final b:Ljava/util/ArrayList;

.field public final c:Landroid/widget/TextView;

.field public final d:Lsn;

.field public final e:Ljava/lang/String;

.field public final f:Landroid/view/View;

.field public final g:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Lsn;Lp00;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 4

    const/16 v3, 0x40

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e1\u06e3"

    invoke-static {v1}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "9sy6slU9Y8pHX"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۥۦۦۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    const-string v1, "\u06e1\u06e0\u06e1"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    iput-object p5, p0, Lpk;->g:Landroid/widget/TextView;

    sget v1, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    add-int/lit16 v2, v2, -0x22bf

    add-int/2addr v1, v2

    if-ltz v1, :cond_0

    const/16 v1, 0x57

    sput v1, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    const-string v1, "\u06e6\u06df\u06e4"

    :goto_2
    invoke-static {v1}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    const-string v1, "\u06e5\u06e8\u06e8"

    goto :goto_2

    :sswitch_2
    iput-object p1, p0, Lpk;->d:Lsn;

    sget v1, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    if-gtz v1, :cond_1

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    const-string v1, "\u06e3\u06e7\u06e0"

    :goto_3
    invoke-static {v1}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e5\u06e5\u06e8"

    :goto_4
    invoke-static {v1}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    move-result v1

    if-ltz v1, :cond_2

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    const-string v1, "\u06e0\u06e0\u06e0"

    invoke-static {v1}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v2, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    or-int/2addr v1, v2

    const v2, 0x1ab695

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    iput-object p7, p0, Lpk;->b:Ljava/util/ArrayList;

    sget v1, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    mul-int/2addr v1, v2

    const v2, -0x1cb5b0

    xor-int/2addr v1, v2

    goto :goto_0

    :cond_3
    :sswitch_5
    sget v1, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    add-int/lit16 v2, v2, -0x864

    div-int/2addr v1, v2

    if-eqz v1, :cond_4

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    const-string v1, "\u06e8\u06e5\u06df"

    goto :goto_4

    :cond_4
    const-string v1, "\u06e3\u06e2\u06e1"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_6
    iput-object p6, p0, Lpk;->e:Ljava/lang/String;

    const-string v1, "\u06e6\u06df\u06e4"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_7
    iput-object p4, p0, Lpk;->c:Landroid/widget/TextView;

    sget v1, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    add-int/lit16 v2, v2, 0x1e1

    or-int/2addr v1, v2

    if-ltz v1, :cond_5

    const/16 v1, 0x2e

    sput v1, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    const-string v1, "\u06e5\u06e8\u06e8"

    :goto_5
    invoke-static {v1}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e7\u06e1"

    goto :goto_3

    :sswitch_8
    iput-object p2, p0, Lpk;->a:Lp00;

    sget v1, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    mul-int/lit16 v2, v2, -0xa7c

    add-int/2addr v1, v2

    if-gtz v1, :cond_6

    sput v3, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    const-string v1, "\u06e3\u06e2\u06e1"

    invoke-static {v1}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06e1\u06e3\u06e0"

    goto :goto_5

    :sswitch_9
    const-string v1, "\u06e8\u06e1\u06e3"

    invoke-static {v1}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_a
    iput-object p3, p0, Lpk;->f:Landroid/view/View;

    sget v1, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    if-ltz v1, :cond_7

    sput v3, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    :cond_7
    const-string v1, "\u06e3\u06e8\u06e2"

    goto/16 :goto_1

    :sswitch_b
    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    move-result v1

    if-ltz v1, :cond_3

    sget v1, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    mul-int/lit16 v2, v2, -0x1508

    sub-int/2addr v1, v2

    if-ltz v1, :cond_8

    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    const-string v1, "\u06e7\u06e1"

    invoke-static {v1}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_8
    sget v1, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    xor-int/2addr v1, v2

    const v2, 0xda49

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe9 -> :sswitch_0
        0xdcda -> :sswitch_2
        0x1aaae0 -> :sswitch_7
        0x1aaea2 -> :sswitch_3
        0x1aaefe -> :sswitch_4
        0x1ab2fd -> :sswitch_5
        0x1ab662 -> :sswitch_c
        0x1ab6fc -> :sswitch_9
        0x1ab71d -> :sswitch_1
        0x1abe48 -> :sswitch_6
        0x1abea5 -> :sswitch_b
        0x1ac14b -> :sswitch_a
        0x1ac90a -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    const/4 v0, 0x0

    const-string v1, "\u06e0\u06df"

    invoke-static {v1}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v2

    move-object v7, v0

    move-object v1, v0

    move-object v8, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v3, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    div-int/lit16 v3, v3, -0x1208

    mul-int/2addr v2, v3

    if-eqz v2, :cond_0

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    const-string v2, "\u06df\u06e8\u06e8"

    invoke-static {v2}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v7, v0

    goto :goto_0

    :cond_0
    const-string v2, "\u06e7\u06e5\u06e1"

    :goto_1
    invoke-static {v2}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v7, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "cNpf1POf\n"

    const-string v2, "Hr8onJbna9c=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    or-int/2addr v0, v2

    const v2, 0x1ab6c2

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v0, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    if-ltz v0, :cond_2

    const/16 v0, 0x1e

    sput v0, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    const-string v0, "\u06e1\u06e0\u06e1"

    :goto_2
    invoke-static {v0}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06df\u06e8\u06e8"

    goto :goto_2

    :sswitch_3
    iget-object v0, p0, Lpk;->d:Lsn;

    iget-object v2, p0, Lpk;->f:Landroid/view/View;

    iget-object v3, p0, Lpk;->c:Landroid/widget/TextView;

    iget-object v4, p0, Lpk;->g:Landroid/widget/TextView;

    iget-object v5, p0, Lpk;->e:Ljava/lang/String;

    iget-object v6, p0, Lpk;->b:Ljava/util/ArrayList;

    invoke-static/range {v0 .. v6}, Lg80;->K(Lsn;Lp00;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/String;Ljava/util/ArrayList;)V

    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    rem-int/lit16 v2, v2, -0x8a6

    div-int/2addr v0, v2

    if-ltz v0, :cond_3

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    const-string v2, "\u06e7\u06e5\u06e1"

    move-object v0, v7

    goto :goto_1

    :cond_3
    sget v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    div-int/2addr v0, v2

    const v2, 0x1aa81e

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    sget-object v0, Lxh;->n:Lxh;

    return-object v0

    :sswitch_5
    const-string v0, "YSFJVDh86p10PXkMZje29w==\n"

    const-string v2, "FU4cJEgZmN4=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v8}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    add-int/2addr v0, v2

    const v2, 0x1abc15

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    sget v0, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    add-int/2addr v0, v2

    const v2, 0x1ac6b1    # 2.459E-39f

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    sget v0, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    mul-int/lit16 v2, v2, 0x968

    mul-int/2addr v0, v2

    if-gtz v0, :cond_4

    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    const-string v0, "\u06e8\u06e8"

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06e0\u06df"

    goto :goto_3

    :sswitch_8
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    move-result v2

    if-gtz v2, :cond_5

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    const-string v2, "\u06e0\u06df"

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v8, v0

    goto/16 :goto_0

    :sswitch_9
    iget-object v1, p0, Lpk;->a:Lp00;

    const-string v2, "\u06e7\u06e2\u06e0"

    move-object v0, v7

    goto/16 :goto_1

    :sswitch_a
    iput-object v8, v1, Lp00;->b:Ljava/lang/Object;

    sget v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    rem-int/lit16 v2, v2, 0x734

    mul-int/2addr v0, v2

    if-ltz v0, :cond_6

    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    move-object v0, v8

    :cond_5
    const-string v2, "\u06e4\u06e6"

    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v8, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sub-int/2addr v0, v2

    const v2, 0x1ab35e

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbff -> :sswitch_0
        0xdc82 -> :sswitch_5
        0x1aa7f8 -> :sswitch_7
        0x1aa81f -> :sswitch_4
        0x1aaf9e -> :sswitch_2
        0x1ab6a5 -> :sswitch_6
        0x1ab721 -> :sswitch_3
        0x1abe80 -> :sswitch_9
        0x1ac509 -> :sswitch_8
        0x1ac565 -> :sswitch_a
        0x1ac5c3 -> :sswitch_1
    .end sparse-switch
.end method
