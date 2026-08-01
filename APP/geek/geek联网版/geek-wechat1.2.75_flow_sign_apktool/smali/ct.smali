.class public final synthetic Lct;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:Landroid/widget/EditText;

.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/widget/LinearLayout;

.field public final d:Landroid/widget/ScrollView;

.field public final e:Landroid/app/Activity;

.field public final f:Lsn;

.field public final g:Landroid/webkit/WebView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ScrollView;Landroid/app/Activity;Lsn;Landroid/webkit/WebView;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e2\u06e0\u06e4"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "2NPXpoA0"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۟ۡ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget v1, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    add-int/lit16 v2, v2, -0x1feb

    xor-int/2addr v1, v2

    if-gtz v1, :cond_2

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    :goto_1
    const-string v1, "\u06e5\u06e3\u06e6"

    invoke-static {v1}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v2, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    xor-int/2addr v1, v2

    const v2, 0x1abd08

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    iput-object p5, p0, Lct;->e:Landroid/app/Activity;

    sget v1, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    xor-int/lit16 v2, v2, -0xaa0

    rem-int/2addr v1, v2

    if-ltz v1, :cond_1

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    const-string v1, "\u06e1\u06e8\u06e8"

    :goto_2
    invoke-static {v1}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    rem-int/2addr v1, v2

    const v2, 0x1aba5d

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    goto :goto_1

    :cond_2
    const-string v1, "\u06e7\u06e0\u06e0"

    :goto_3
    invoke-static {v1}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_4
    iput-object p1, p0, Lct;->a:Landroid/widget/EditText;

    sget v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    add-int/lit16 v2, v2, 0x1250

    add-int/2addr v1, v2

    if-gtz v1, :cond_3

    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    const-string v1, "\u06e5\u06df\u06e0"

    goto :goto_3

    :cond_3
    sget v1, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    xor-int/2addr v1, v2

    const v2, -0x1aafca

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    iput-object p4, p0, Lct;->d:Landroid/widget/ScrollView;

    const-string v1, "\u06e5\u06df\u06e0"

    goto :goto_2

    :sswitch_6
    iput-object p2, p0, Lct;->b:Landroid/widget/TextView;

    sget v1, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    rem-int/lit16 v2, v2, 0x799

    rem-int/2addr v1, v2

    if-ltz v1, :cond_4

    const/16 v1, 0x3f

    sput v1, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    const-string v1, "\u06e5\u06e4\u06e4"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_4
    const-string v1, "\u06e1\u06e8\u06e1"

    goto :goto_3

    :sswitch_7
    iput-object p3, p0, Lct;->c:Landroid/widget/LinearLayout;

    sget v1, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    xor-int/2addr v1, v2

    const v2, -0x1abe38

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_8
    iput-object p7, p0, Lct;->g:Landroid/webkit/WebView;

    const-string v1, "\u06e6\u06e8\u06e1"

    goto :goto_2

    :sswitch_9
    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sub-int/2addr v1, v2

    const v2, 0x1ab2e6

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_a
    iput-object p6, p0, Lct;->f:Lsn;

    const-string v1, "\u06e1\u06e4\u06e6"

    goto :goto_3

    :sswitch_b
    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    move-result v1

    if-ltz v1, :cond_0

    sget v1, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    if-ltz v1, :cond_5

    const/16 v1, 0x11

    sput v1, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    const-string v1, "\u06e5\u06e7\u06e5"

    invoke-static {v1}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e0\u06e2\u06e7"

    goto :goto_3

    :sswitch_c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab25 -> :sswitch_0
        0x1aaf23 -> :sswitch_8
        0x1aaf62 -> :sswitch_9
        0x1aaf9a -> :sswitch_7
        0x1aafa1 -> :sswitch_6
        0x1ab266 -> :sswitch_4
        0x1aba66 -> :sswitch_a
        0x1abd86 -> :sswitch_2
        0x1abe08 -> :sswitch_c
        0x1abe25 -> :sswitch_5
        0x1abe83 -> :sswitch_1
        0x1ac25f -> :sswitch_b
        0x1ac527 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 17

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v11, 0x0

    const-string v1, "\u06e3\u06e2\u06e5"

    invoke-static {v1}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    :goto_0
    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "Pi/6ZRvRtbIjKeV0\n"

    const-string v6, "V0GKEG+O2Nc=\n"

    invoke-static {v1, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget v6, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v7, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    add-int/lit16 v7, v7, 0xccc

    or-int/2addr v6, v7

    if-ltz v6, :cond_3

    const-string v6, "\u06e2\u06e5\u06e1"

    :goto_1
    invoke-static {v6}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v6

    move-object v12, v1

    goto :goto_0

    :sswitch_1
    const-string v1, "wrMVfOsCPzXCqQ0wqQR+OM21DTC/Dn41w6hUfr4NMnvYvwl16wAwP96pEHTlFzc+2+gQfrsUKjbJ\nshF/r08XNdyzDV2uFTY0yIsYfqoGOyk=\n"

    const-string v6, "rMZ5EMthXls=\n"

    invoke-static {v1, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v11}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    sget v1, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    if-ltz v1, :cond_0

    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    :cond_0
    const-string v1, "\u06e1\u06e7\u06e4"

    invoke-static {v1}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto :goto_0

    :sswitch_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_9

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v1

    if-ltz v1, :cond_2

    const/16 v1, 0x55

    sput v1, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    :cond_1
    const-string v1, "\u06e7\u06e2\u06e7"

    invoke-static {v1}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto :goto_0

    :cond_2
    sget v1, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v6, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    rem-int/2addr v1, v6

    const v6, 0x1ab6f3

    add-int/2addr v1, v6

    move v6, v1

    goto :goto_0

    :cond_3
    const-string v6, "\u06e4\u06e4"

    invoke-static {v6}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v6

    move-object v12, v1

    goto :goto_0

    :sswitch_3
    move-object/from16 v0, p0

    iget-object v4, v0, Lct;->c:Landroid/widget/LinearLayout;

    sget v1, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v6, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    add-int/lit16 v6, v6, -0x5c5

    mul-int/2addr v1, v6

    if-gtz v1, :cond_4

    const/16 v1, 0x30

    sput v1, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    const-string v1, "\u06e4\u06e4"

    invoke-static {v1}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto :goto_0

    :cond_4
    sget v1, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v6, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    mul-int/2addr v1, v6

    const v6, -0x1bf1e0

    xor-int/2addr v1, v6

    move v6, v1

    goto/16 :goto_0

    :sswitch_4
    const/4 v1, 0x0

    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V

    sget v1, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v6, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    or-int/lit16 v6, v6, -0x1ebb

    xor-int/2addr v1, v6

    if-ltz v1, :cond_5

    const-string v1, "\u06e6\u06e2\u06e8"

    :goto_2
    invoke-static {v1}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_5
    sget v1, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v6, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    div-int/2addr v1, v6

    const v6, 0x1ab683

    add-int/2addr v1, v6

    move v6, v1

    goto/16 :goto_0

    :sswitch_5
    invoke-virtual {v5, v12}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    sget v1, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    if-gtz v1, :cond_7

    invoke-static {}, Lcom/google/android/material/carousel/ۢۢۢۥ;->۟ۡ۟۠ۧ()I

    move v1, v13

    :cond_6
    const-string v6, "\u06e0\u06e0\u06e0"

    invoke-static {v6}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v6

    move v13, v1

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u06df\u06e6\u06e3"

    :goto_3
    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :sswitch_6
    sget-object v1, Lyg;->b:Lof;

    invoke-static {v1}, Lgf;->c(Lhe;)Lsd;

    move-result-object v15

    const/16 v16, 0x0

    new-instance v1, Lgt;

    move-object/from16 v0, p0

    iget-object v6, v0, Lct;->f:Lsn;

    move-object/from16 v0, p0

    iget-object v7, v0, Lct;->g:Landroid/webkit/WebView;

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v10}, Lgt;-><init>(Ljava/lang/String;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/app/Activity;Lsn;Landroid/webkit/WebView;Landroid/widget/ScrollView;Landroid/widget/EditText;Lvd;)V

    sget v6, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    xor-int/lit16 v6, v6, 0xb3

    move-object/from16 v0, v16

    invoke-static {v15, v0, v1, v6}, Lg80;->u(Lpe;Lhe;Lym;I)Lw40;

    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    move-result v1

    if-gtz v1, :cond_8

    const/16 v1, 0x10

    sput v1, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    const-string v1, "\u06df\u06e2"

    invoke-static {v1}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_8
    const-string v1, "\u06e6\u06e1\u06e7"

    :goto_4
    invoke-static {v1}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_9
    :sswitch_7
    sget v1, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v6, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    xor-int/lit16 v6, v6, -0x2478

    sub-int/2addr v1, v6

    if-ltz v1, :cond_a

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    const-string v1, "\u06e5\u06e2\u06e3"

    :goto_5
    invoke-static {v1}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_a
    const-string v1, "\u06e2\u06e5\u06e1"

    goto :goto_5

    :sswitch_8
    invoke-virtual {v3, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v1, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v6, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    add-int/lit16 v6, v6, 0xc6a

    xor-int/2addr v1, v6

    if-ltz v1, :cond_c

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    move-object v1, v14

    :cond_b
    const-string v6, "\u06e0\u06e1\u06e1"

    move-object v14, v1

    :goto_6
    invoke-static {v6}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_c
    sget v1, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v6, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    add-int/2addr v1, v6

    const v6, 0x1ab844

    add-int/2addr v1, v6

    move v6, v1

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v0, p0

    iget-object v8, v0, Lct;->d:Landroid/widget/ScrollView;

    sget v1, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v6, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    add-int/lit16 v6, v6, 0x144f

    xor-int/2addr v1, v6

    if-ltz v1, :cond_d

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟ۡۡۦ()I

    const-string v1, "\u06e3\u06e4\u06df"

    invoke-static {v1}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_d
    const-string v1, "\u06e1\u06df\u06e6"

    move-object v6, v1

    goto :goto_6

    :sswitch_a
    move-object/from16 v0, p0

    iget-object v3, v0, Lct;->b:Landroid/widget/TextView;

    sget v1, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    if-ltz v1, :cond_e

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    const-string v1, "\u06e6\u06e0\u06e7"

    goto/16 :goto_3

    :cond_e
    const-string v1, "\u06e6\u06e2\u06e8"

    goto/16 :goto_2

    :sswitch_b
    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-result v1

    if-ltz v1, :cond_11

    sget v1, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    if-gtz v1, :cond_f

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    const-string v1, "\u06e4\u06e8\u06e0"

    invoke-static {v1}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_f
    const-string v1, "\u06e6\u06e0\u06e7"

    goto/16 :goto_4

    :sswitch_c
    move-object/from16 v0, p0

    iget-object v9, v0, Lct;->a:Landroid/widget/EditText;

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    move-result v1

    if-ltz v1, :cond_1

    const-string v1, "\u06e6\u06e1\u06e0"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :sswitch_d
    const-string v1, "GXP9"

    invoke-static {v1}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟ۧ۠ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    sget v6, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v7, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    mul-int/lit16 v7, v7, -0xe7b

    or-int/2addr v6, v7

    if-ltz v6, :cond_6

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    const-string v6, "\u06e4\u06e6\u06e5"

    invoke-static {v6}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v6

    move v13, v1

    goto/16 :goto_0

    :sswitch_e
    move-object/from16 v0, p0

    iget-object v5, v0, Lct;->e:Landroid/app/Activity;

    sget v1, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    if-ltz v1, :cond_16

    const/16 v1, 0xb

    sput v1, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    const-string v1, "\u06e3\u06e3\u06e3"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :sswitch_f
    sget v1, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    if-gtz v1, :cond_10

    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    const-string v1, "\u06e2\u06e8\u06e5"

    invoke-static {v1}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_10
    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v6, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    add-int/2addr v1, v6

    const v6, 0x1ab9e7

    add-int/2addr v1, v6

    move v6, v1

    goto/16 :goto_0

    :cond_11
    :sswitch_10
    sget v1, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    if-gtz v1, :cond_12

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    const-string v1, "\u06e7\u06e3\u06e0"

    :goto_7
    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_12
    const-string v1, "\u06e4\u06e6\u06e5"

    goto :goto_7

    :sswitch_11
    invoke-virtual {v4}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    move-result v1

    if-gtz v1, :cond_13

    const/16 v1, 0x46

    sput v1, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    const-string v1, "\u06e6\u06e2\u06e6"

    invoke-static {v1}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_13
    sget v1, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v6, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sub-int/2addr v1, v6

    const v6, 0x1ac428

    add-int/2addr v1, v6

    move v6, v1

    goto/16 :goto_0

    :sswitch_12
    invoke-virtual {v9}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Li50;->Q(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    move-result v1

    if-ltz v1, :cond_14

    const-string v1, "\u06e3\u06e2\u06e5"

    goto/16 :goto_4

    :cond_14
    sget v1, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v6, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    mul-int/2addr v1, v6

    const v6, 0x18df45

    add-int/2addr v1, v6

    move v6, v1

    goto/16 :goto_0

    :sswitch_13
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v13}, Ljava/io/PrintStream;->println(F)V

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v1

    if-ltz v1, :cond_15

    const/16 v1, 0x29

    sput v1, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    const-string v1, "\u06e6\u06e1\u06e7"

    invoke-static {v1}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_15
    const-string v6, "\u06e4\u06e6\u06e5"

    move-object v1, v12

    goto/16 :goto_1

    :sswitch_14
    move-object v1, v11

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v9}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v1, v6, v7}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    sget v1, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v6, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    add-int/2addr v1, v6

    const v6, 0x1ab0ed

    add-int/2addr v1, v6

    move v6, v1

    goto/16 :goto_0

    :sswitch_15
    const/4 v1, 0x0

    invoke-virtual {v8, v1}, Landroid/view/View;->setVisibility(I)V

    sget v1, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    if-gtz v1, :cond_17

    :cond_16
    const-string v1, "\u06e2\u06e5\u06e2"

    invoke-static {v1}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_17
    const-string v1, "\u06df\u06e2"

    goto/16 :goto_2

    :sswitch_16
    const-string v1, "9gdlx419Be+9udcO\n"

    const-string v6, "EJf5IDnf4Vc=\n"

    invoke-static {v1, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget v6, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    if-ltz v6, :cond_b

    const/16 v6, 0x1e

    sput v6, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    const-string v6, "\u06e2\u06e7\u06e5"

    invoke-static {v6}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v6

    move-object v14, v1

    goto/16 :goto_0

    :sswitch_17
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbe3 -> :sswitch_0
        0xdc80 -> :sswitch_e
        0x1aa7dc -> :sswitch_1
        0x1aaae0 -> :sswitch_13
        0x1aab00 -> :sswitch_a
        0x1aae88 -> :sswitch_15
        0x1aaf7e -> :sswitch_14
        0x1ab2a2 -> :sswitch_6
        0x1ab2fe -> :sswitch_16
        0x1ab2ff -> :sswitch_5
        0x1ab340 -> :sswitch_11
        0x1ab666 -> :sswitch_c
        0x1ab683 -> :sswitch_9
        0x1ab688 -> :sswitch_b
        0x1ab69e -> :sswitch_10
        0x1ab9c8 -> :sswitch_f
        0x1abaa3 -> :sswitch_17
        0x1abadc -> :sswitch_3
        0x1ac16d -> :sswitch_d
        0x1ac185 -> :sswitch_2
        0x1ac18c -> :sswitch_17
        0x1ac1aa -> :sswitch_7
        0x1ac1ac -> :sswitch_8
        0x1ac56c -> :sswitch_12
        0x1ac58b -> :sswitch_4
    .end sparse-switch
.end method
