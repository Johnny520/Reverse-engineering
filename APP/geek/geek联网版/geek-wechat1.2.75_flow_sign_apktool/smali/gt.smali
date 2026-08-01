.class public final Lgt;
.super Lt50;

# interfaces
.implements Lym;


# instance fields
.field public e:I

.field public final f:Ljava/lang/String;

.field public final g:Landroid/widget/TextView;

.field public final h:Landroid/widget/LinearLayout;

.field public final i:Landroid/app/Activity;

.field public final j:Lsn;

.field public final k:Landroid/webkit/WebView;

.field public final l:Landroid/widget/ScrollView;

.field public final m:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/app/Activity;Lsn;Landroid/webkit/WebView;Landroid/widget/ScrollView;Landroid/widget/EditText;Lvd;)V
    .locals 3

    iput-object p1, p0, Lgt;->f:Ljava/lang/String;

    iput-object p2, p0, Lgt;->g:Landroid/widget/TextView;

    iput-object p3, p0, Lgt;->h:Landroid/widget/LinearLayout;

    iput-object p4, p0, Lgt;->i:Landroid/app/Activity;

    iput-object p5, p0, Lgt;->j:Lsn;

    iput-object p6, p0, Lgt;->k:Landroid/webkit/WebView;

    iput-object p7, p0, Lgt;->l:Landroid/widget/ScrollView;

    iput-object p8, p0, Lgt;->m:Landroid/widget/EditText;

    invoke-direct {p0, p9}, Lt50;-><init>(Lvd;)V

    const/4 v1, 0x0

    const-string v0, "\u06df\u06e1\u06e8"

    invoke-static {v0}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    move-result v0

    if-gtz v0, :cond_1

    sget v0, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    if-gtz v0, :cond_2

    const-string v0, "\u06e4\u06e6\u06e6"

    invoke-static {v0}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    const-string v0, "AcPml8r"

    invoke-static {v0}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟ۡۧ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    if-ltz v0, :cond_0

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    const-string v0, "\u06e0\u06e6\u06e5"

    :goto_1
    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e0\u06e6\u06e5"

    goto :goto_1

    :sswitch_2
    sget v0, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    div-int/2addr v0, v2

    const v2, 0x1aa746

    xor-int/2addr v0, v2

    goto :goto_0

    :cond_1
    :sswitch_3
    sget v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sub-int/2addr v0, v2

    const v2, -0x1aaa2c

    xor-int/2addr v0, v2

    goto :goto_0

    :cond_2
    const-string v0, "\u06df\u06e4\u06e5"

    :goto_2
    invoke-static {v0}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_4
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    mul-int/lit16 v2, v2, -0x2537

    add-int/2addr v0, v2

    if-gtz v0, :cond_3

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    :cond_3
    const-string v0, "\u06e1\u06e2\u06e2"

    goto :goto_2

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa746 -> :sswitch_0
        0x1aa7a0 -> :sswitch_1
        0x1aab9f -> :sswitch_4
        0x1aaee1 -> :sswitch_5
        0x1abaa4 -> :sswitch_3
        0x1abea4 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final a(Lvd;)Lvd;
    .locals 10

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06e1\u06e6"

    invoke-static {v1}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v1

    move-object v8, v0

    move-object v7, v0

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v0, Lgt;

    iget-object v1, p0, Lgt;->f:Ljava/lang/String;

    iget-object v2, p0, Lgt;->g:Landroid/widget/TextView;

    iget-object v3, p0, Lgt;->h:Landroid/widget/LinearLayout;

    iget-object v4, p0, Lgt;->i:Landroid/app/Activity;

    iget-object v5, p0, Lgt;->j:Lsn;

    iget-object v6, p0, Lgt;->k:Landroid/webkit/WebView;

    move-object v9, p1

    invoke-direct/range {v0 .. v9}, Lgt;-><init>(Ljava/lang/String;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/app/Activity;Lsn;Landroid/webkit/WebView;Landroid/widget/ScrollView;Landroid/widget/EditText;Lvd;)V

    return-object v0

    :sswitch_1
    iget-object v8, p0, Lgt;->m:Landroid/widget/EditText;

    sget v0, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    if-ltz v0, :cond_0

    const/16 v0, 0x32

    sput v0, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    const-string v0, "\u06e4\u06e7\u06e5"

    invoke-static {v0}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e2\u06e3\u06e3"

    :goto_1
    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :sswitch_2
    iget-object v7, p0, Lgt;->l:Landroid/widget/ScrollView;

    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v1, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    div-int/lit16 v1, v1, 0x1563

    add-int/2addr v0, v1

    if-ltz v0, :cond_1

    const/16 v0, 0x10

    sput v0, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    const-string v0, "\u06e4\u06e1\u06e6"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v1, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    add-int/2addr v0, v1

    const v1, 0x1ac3f1

    xor-int/2addr v0, v1

    move v1, v0

    goto :goto_0

    :sswitch_3
    sget v0, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v1, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    mul-int/lit16 v1, v1, -0x256

    xor-int/2addr v0, v1

    if-ltz v0, :cond_2

    const-string v0, "\u06e6\u06e5"

    goto :goto_1

    :cond_2
    sget v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v1, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    mul-int/2addr v0, v1

    const v1, 0x18c6c9

    xor-int/2addr v0, v1

    move v1, v0

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab2c2 -> :sswitch_0
        0x1aba09 -> :sswitch_2
        0x1abac2 -> :sswitch_3
        0x1ac16e -> :sswitch_1
    .end sparse-switch
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "\u06e0\u06e6\u06e0"

    invoke-static {v0}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    check-cast p2, Lvd;

    invoke-virtual {p0, p2}, Lgt;->a(Lvd;)Lvd;

    move-result-object v0

    check-cast v0, Lgt;

    sget-object v1, Lxh;->n:Lxh;

    invoke-virtual {v0, v1}, Lgt;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :sswitch_1
    move-object v0, p1

    check-cast v0, Lpe;

    sget v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v1, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    add-int/lit16 v1, v1, -0x33f

    add-int/2addr v0, v1

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    const-string v0, "\u06e2\u06e1\u06e0"

    invoke-static {v0}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v1, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    mul-int/2addr v0, v1

    const v1, 0x17b950

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v1, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    xor-int/2addr v0, v1

    const v1, 0x1aacd5

    add-int/2addr v0, v1

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa726 -> :sswitch_0
        0x1aab9a -> :sswitch_1
        0x1ab281 -> :sswitch_2
    .end sparse-switch
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 49

    const/4 v6, 0x0

    const/4 v5, 0x0

    const/4 v11, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/4 v2, 0x0

    const/16 v26, 0x0

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/16 v32, 0x0

    const/4 v12, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    const/4 v14, 0x0

    const/16 v47, 0x0

    const/16 v24, 0x0

    const/16 v46, 0x0

    const/16 v45, 0x0

    const/16 v31, 0x0

    const/16 v30, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v20, 0x0

    const/4 v3, 0x0

    const/4 v10, 0x0

    const/4 v9, 0x0

    const/16 v23, 0x0

    const-string v35, "\u06e4\u06e5\u06e3"

    invoke-static/range {v35 .. v35}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v48

    move-object/from16 v35, v2

    move-object/from16 v36, v3

    move-object/from16 v37, v5

    move-object/from16 v38, v6

    move-object/from16 v39, v8

    move-object/from16 v40, v11

    move-object/from16 v41, v12

    move-object/from16 v42, v26

    :goto_0
    sparse-switch v48, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    :try_start_0
    invoke-static/range {v31 .. v31}, Lmu;->D(Ljava/io/BufferedReader;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    sget v3, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    if-gtz v3, :cond_15

    const/16 v3, 0x25

    sput v3, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    const-string v3, "\u06e1\u06e7\u06e1"

    invoke-static {v3}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v30, v2

    move/from16 v48, v3

    goto :goto_0

    :sswitch_1
    move-object/from16 v0, p0

    iget v2, v0, Lgt;->e:I

    if-eqz v2, :cond_1d

    const/4 v3, 0x1

    if-ne v2, v3, :cond_8

    invoke-static/range {p1 .. p1}, Lgu;->M(Ljava/lang/Object;)V

    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v3, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    div-int/lit16 v3, v3, 0x1e6b

    xor-int/2addr v2, v3

    if-ltz v2, :cond_0

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    const-string v2, "\u06e4\u06e5\u06e1"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto :goto_0

    :cond_0
    const-string v2, "\u06e4\u06df\u06e3"

    move-object/from16 v3, v25

    :goto_1
    invoke-static {v2}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v25, v3

    move/from16 v48, v2

    goto :goto_0

    :sswitch_2
    const-string v2, "6gWasUo5xj7pUZqwGmjHOeYByOoWbcA87FzOuh44xW0=\n"

    const-string v3, "32SsiS4J8gw=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v2, "+Q4Aocj5O9yoCQb1y/k6jasLXPGe+DvRq1kBoZP7O40=\n"

    const-string v3, "nDxkx6qdCeg=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "FqtBy1BSPmZAp0TNBVVpbkXwRs4HUDllRaMXmVFQY2M=\n"

    const-string v5, "JpIn+2Y2Wlc=\n"

    invoke-static {v3, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/16 v5, 0xa

    new-array v8, v5, [Ljava/lang/String;

    sget v5, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v11, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    mul-int/lit16 v11, v11, -0x9ab

    or-int/2addr v5, v11

    if-ltz v5, :cond_1

    const/16 v5, 0x1c

    sput v5, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    move-object/from16 v5, v20

    :goto_2
    const-string v11, "\u06e4\u06e7\u06e4"

    invoke-static {v11}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v11

    move-object/from16 v18, v2

    move-object/from16 v19, v3

    move-object/from16 v20, v5

    move-object/from16 v21, v6

    move-object/from16 v22, v8

    move/from16 v48, v11

    goto/16 :goto_0

    :cond_1
    const-string v5, "\u06e1\u06e8"

    move-object/from16 v18, v2

    move-object/from16 v19, v3

    move-object/from16 v21, v6

    move-object/from16 v22, v8

    :goto_3
    invoke-static {v5}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_2
    :sswitch_3
    sget v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v3, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    or-int/lit16 v3, v3, -0x2287

    xor-int/2addr v2, v3

    if-ltz v2, :cond_3

    const/16 v2, 0x20

    sput v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    const-string v2, "\u06e3\u06e6\u06e6"

    :goto_4
    invoke-static {v2}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_3
    const-string v2, "\u06e5\u06e6\u06e6"

    :goto_5
    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_4
    sget-object v23, Lxh;->n:Lxh;

    :sswitch_5
    return-object v23

    :sswitch_6
    move-object/from16 v0, p0

    iget-object v2, v0, Lgt;->f:Ljava/lang/String;

    move-object/from16 v0, v34

    invoke-static {v2, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lp00;

    invoke-direct {v4}, Lp00;-><init>()V

    new-instance v7, Lp00;

    invoke-direct {v7}, Lp00;-><init>()V

    const-string v3, "DC53IeWFxZtpdl5+uJG2z0QkAHfc8ZaiDQRQ\n"

    const-string v5, "65Pmxl4ZICc=\n"

    invoke-static {v3, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v7, Lp00;->b:Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    move-result v3

    if-ltz v3, :cond_4

    const-string v3, "\u06e4\u06e5\u06df"

    invoke-static {v3}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v39, v2

    move/from16 v48, v3

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e2\u06e6\u06e5"

    invoke-static {v3}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v39, v2

    move/from16 v48, v3

    goto/16 :goto_0

    :sswitch_7
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput v2, v0, Lgt;->e:I

    move-object/from16 v0, p0

    invoke-static {v10, v9, v0}, Lg80;->M(Lhe;Lym;Lt50;)Ljava/lang/Object;

    move-result-object v3

    sget-object v2, Lqe;->a:Lqe;

    if-ne v3, v2, :cond_7

    sget v3, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v5, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    mul-int/lit16 v5, v5, 0x1ddf

    or-int/2addr v3, v5

    if-ltz v3, :cond_5

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    move/from16 v3, v24

    :goto_6
    const-string v5, "\u06df\u06e3\u06e6"

    invoke-static {v5}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v23, v2

    move/from16 v24, v3

    move/from16 v48, v5

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e7\u06e3\u06e8"

    move-object/from16 v23, v2

    :goto_7
    invoke-static {v3}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_8
    :try_start_1
    invoke-interface/range {v31 .. v31}, Ljava/io/Closeable;->close()V

    new-instance v2, Lorg/json/JSONObject;

    move-object/from16 v0, v30

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    sget v3, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v5, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    rem-int/lit16 v5, v5, -0x94e

    mul-int/2addr v3, v5

    if-gtz v3, :cond_13

    const-string v3, "\u06e7\u06e8\u06e4"

    invoke-static {v3}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v27, v2

    move/from16 v48, v3

    goto/16 :goto_0

    :sswitch_9
    sget v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    xor-int/lit16 v2, v2, -0xbf

    aput-object v18, v22, v2

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    xor-int/lit16 v2, v2, -0x124

    aput-object v19, v22, v2

    invoke-static/range {v22 .. v22}, Ljb;->a0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v3, "aNEoOpE=\n"

    const-string v5, "PYVuF6mwTbY=\n"

    invoke-static {v3, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :goto_8
    const-string v5, "\u06e1\u06df\u06e6"

    invoke-static {v5}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v33, v2

    move-object/from16 v34, v3

    move/from16 v48, v5

    goto/16 :goto_0

    :sswitch_a
    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v3, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    add-int/lit16 v3, v3, 0xf9a

    or-int/2addr v2, v3

    if-ltz v2, :cond_6

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    const-string v2, "\u06e4\u06e8\u06e1"

    :goto_9
    invoke-static {v2}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_6
    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v3, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    add-int/2addr v2, v3

    const v3, -0xda97

    xor-int/2addr v2, v3

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_b
    move-object/from16 v2, v23

    :cond_7
    sget v3, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v5, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    div-int/2addr v3, v5

    const v5, 0x1ac54d

    add-int/2addr v3, v5

    move-object/from16 v23, v2

    move/from16 v48, v3

    goto/16 :goto_0

    :cond_8
    :sswitch_c
    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    if-ltz v2, :cond_9

    const-string v2, "\u06df\u06e8"

    :goto_a
    invoke-static {v2}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_9
    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v3, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sub-int/2addr v2, v3

    const v3, -0x1aa3b6

    xor-int/2addr v2, v3

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_d
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "PjT77sDJoa96J/LxldCrqH038uSPz6uvejz59I/Wq6h9Iv72iJ2t4C864vaJ06s=\n"

    const-string v4, "XVWXguC9zo8=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_e
    :try_start_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    move-result v2

    if-ltz v2, :cond_a

    const/16 v2, 0x4b

    sput v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    const-string v2, "\u06e8\u06e8\u06e2"

    invoke-static {v2}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v28, v3

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06e6\u06e3\u06e7"

    move/from16 v5, v29

    :goto_b
    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v28, v3

    move/from16 v48, v2

    move/from16 v29, v5

    goto/16 :goto_0

    :sswitch_f
    :try_start_3
    const-string v2, "tSFt\n"

    const-string v3, "8mQ599ogtzE=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v47

    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    sget v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    xor-int/lit16 v3, v2, 0x927

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v5, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    add-int/lit16 v5, v5, -0x1062

    xor-int/2addr v2, v5

    if-gtz v2, :cond_b

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣۣ۟ۡ()I

    const-string v2, "\u06e1\u06e1\u06e5"

    invoke-static {v2}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v24, v3

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_b
    move-object/from16 v2, v23

    goto/16 :goto_6

    :cond_c
    :sswitch_10
    sget v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v3, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    xor-int/lit16 v3, v3, 0x165

    div-int/2addr v2, v3

    if-ltz v2, :cond_d

    const-string v2, "\u06e6\u06e2\u06e7"

    move-object/from16 v3, v25

    goto/16 :goto_1

    :cond_d
    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v3, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    div-int/2addr v2, v3

    const v3, -0x1abdc9

    xor-int/2addr v2, v3

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_11
    :try_start_4
    const-string v2, "&extensions=all"

    move-object/from16 v0, v28

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Ljava/net/URL;

    invoke-virtual/range {v28 .. v28}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    move-result v2

    if-ltz v2, :cond_f

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-object/from16 v25, v3

    :cond_e
    const-string v5, "\u06e6\u06e1\u06e5"

    move-object v2, v9

    move-object v3, v10

    :goto_c
    invoke-static {v5}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v5

    move-object v9, v2

    move-object v10, v3

    move/from16 v48, v5

    goto/16 :goto_0

    :cond_f
    const-string v2, "\u06e3\u06e0\u06e0"

    goto/16 :goto_1

    :sswitch_12
    :try_start_5
    invoke-virtual/range {v25 .. v25}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    move-result-object v14

    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    if-ltz v2, :cond_10

    const-string v2, "\u06e3\u06e8\u06e5"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_10
    const-string v2, "\u06e6\u06e2\u06e5"

    goto/16 :goto_a

    :sswitch_13
    :try_start_6
    const-string v2, "https://restapi.amap.com/v3/place/text?keywords="

    move-object/from16 v0, v28

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v3, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    or-int/lit16 v3, v3, -0x5cf

    xor-int/2addr v2, v3

    if-gtz v2, :cond_11

    const/16 v2, 0x41

    sput v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    const-string v2, "\u06df\u06e3"

    :goto_d
    invoke-static {v2}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_11
    const-string v2, "\u06e3\u06e8\u06e5"

    goto/16 :goto_5

    :sswitch_14
    invoke-static/range {p1 .. p1}, Lgu;->M(Ljava/lang/Object;)V

    const-string v2, "DB2mqMynqdkPGaD/nqGl2Vscpv2Zp/XdChX1+Zrzptk=\n"

    const-string v3, "OiyQzanDkLw=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v2, "ToOpQjJfCbIZjKoWYAVet0uK+BVtBV+wSYL/QzYPXrU=\n"

    const-string v5, "KLqeJ1Q8Ooc=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "Q7UkxbZv73RGvSbMt2vpI0fnJZiwP7skFOEky+A47iY=\n"

    const-string v6, "doUX/dVcixY=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget v6, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v8, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    rem-int/lit16 v8, v8, 0x14ad

    sub-int/2addr v6, v8

    if-ltz v6, :cond_12

    const-string v6, "\u06e3\u06e3"

    invoke-static {v6}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v37, v2

    move-object/from16 v38, v3

    move-object/from16 v40, v5

    move/from16 v48, v6

    goto/16 :goto_0

    :cond_12
    sget v6, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v8, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    or-int/2addr v6, v8

    const v8, 0x1ac3e9

    add-int/2addr v6, v8

    move-object/from16 v37, v2

    move-object/from16 v38, v3

    move-object/from16 v40, v5

    move/from16 v48, v6

    goto/16 :goto_0

    :sswitch_15
    :try_start_7
    move-object/from16 v0, v28

    move-object/from16 v1, v39

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v3, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    mul-int/lit16 v3, v3, 0xb3e

    or-int/2addr v2, v3

    if-ltz v2, :cond_14

    move-object/from16 v2, v27

    :cond_13
    const-string v3, "\u06e7\u06e4\u06df"

    invoke-static {v3}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v27, v2

    move/from16 v48, v3

    goto/16 :goto_0

    :cond_14
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v3, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    or-int/2addr v2, v3

    const v3, -0x1aba67

    xor-int/2addr v2, v3

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_15
    move-object/from16 v3, v31

    :goto_e
    const-string v5, "\u06e3\u06e1\u06df"

    invoke-static {v5}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v30, v2

    move-object/from16 v31, v3

    move/from16 v48, v5

    goto/16 :goto_0

    :sswitch_16
    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    move-result v2

    if-gtz v2, :cond_16

    const/16 v2, 0x3b

    sput v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    const-string v2, "\u06e7\u06e3\u06e3"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_16
    sget v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v3, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    xor-int/2addr v2, v3

    const v3, 0x1ac58e

    xor-int/2addr v2, v3

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_17
    move-object v2, v13

    check-cast v2, Ljava/lang/String;

    sget v3, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v5, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    add-int/lit16 v5, v5, -0x81

    or-int/2addr v3, v5

    if-gtz v3, :cond_17

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    const-string v3, "\u06e2\u06e6\u06e7"

    invoke-static {v3}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v41, v2

    move/from16 v48, v3

    goto/16 :goto_0

    :cond_17
    sget v3, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v5, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    rem-int/2addr v3, v5

    const v5, 0x1ab7d0

    add-int/2addr v3, v5

    move-object/from16 v41, v2

    move/from16 v48, v3

    goto/16 :goto_0

    :sswitch_18
    :try_start_8
    move-object/from16 v0, v47

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    invoke-virtual/range {v47 .. v47}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    move-result-object v2

    sget v3, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    if-gtz v3, :cond_18

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    const-string v3, "\u06e8\u06e7\u06e1"

    invoke-static {v3}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v46, v2

    move/from16 v48, v3

    goto/16 :goto_0

    :cond_18
    sget v3, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v5, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    add-int/2addr v3, v5

    const v5, 0x1abb35

    add-int/2addr v3, v5

    move-object/from16 v46, v2

    move/from16 v48, v3

    goto/16 :goto_0

    :catchall_0
    move-exception v5

    move-object/from16 v2, v18

    move-object/from16 v3, v19

    move-object/from16 v6, v21

    move-object/from16 v8, v22

    goto/16 :goto_2

    :sswitch_19
    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v3, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    div-int/2addr v2, v3

    const v3, 0x1ab641

    add-int/2addr v2, v3

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_1a
    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    xor-int/lit8 v2, v2, -0x6d

    aput-object v44, v22, v2

    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    xor-int/lit16 v2, v2, -0x288

    aput-object v35, v22, v2

    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    xor-int/lit16 v2, v2, -0x16b

    aput-object v42, v22, v2

    sget v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    xor-int/lit16 v2, v2, -0x315

    aput-object v21, v22, v2

    sget v2, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    if-gtz v2, :cond_19

    const-string v2, "\u06e0\u06e8\u06e8"

    invoke-static {v2}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_19
    const-string v3, "\u06e7\u06e0\u06df"

    move-object v2, v15

    move/from16 v5, v16

    move/from16 v6, v17

    :goto_f
    invoke-static {v3}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v3

    move-object v15, v2

    move/from16 v16, v5

    move/from16 v17, v6

    move/from16 v48, v3

    goto/16 :goto_0

    :sswitch_1b
    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    if-gtz v2, :cond_1a

    const-string v2, "\u06e6\u06e4"

    invoke-static {v2}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_1a
    const-string v2, "\u06e8\u06e7\u06e1"

    goto/16 :goto_4

    :sswitch_1c
    :try_start_9
    move-object/from16 v0, v47

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setConnectTimeout(I)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    const-string v2, "\u06e0\u06e5\u06e7"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_1d
    :try_start_a
    const-string v2, "Yua0eA==\n"

    const-string v3, "EondC/I+vxE=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v27

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    iput-object v2, v4, Lp00;->b:Ljava/lang/Object;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v3, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    xor-int/lit16 v3, v3, -0x1b5d

    sub-int/2addr v2, v3

    if-ltz v2, :cond_1b

    const-string v2, "\u06e2\u06e5\u06e8"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_1b
    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v3, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    div-int/2addr v2, v3

    const v3, 0x1ab269

    add-int/2addr v2, v3

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_1e
    sget v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v3, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    xor-int/lit16 v3, v3, 0x16aa

    mul-int/2addr v2, v3

    if-gtz v2, :cond_1c

    const-string v2, "\u06e6\u06e2\u06e5"

    move-object/from16 v3, v28

    move/from16 v5, v17

    goto/16 :goto_b

    :cond_1c
    const-string v2, "\u06e7\u06e8\u06e4"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    move/from16 v29, v17

    goto/16 :goto_0

    :catch_0
    move-exception v2

    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v3, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    div-int/2addr v2, v3

    const v3, 0x1ac9a3

    add-int/2addr v2, v3

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_1d
    :sswitch_1f
    const-string v2, "\u06e6\u06e3\u06e4"

    goto/16 :goto_a

    :sswitch_20
    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v3, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    add-int/lit16 v3, v3, -0x1942

    xor-int/2addr v2, v3

    if-gtz v2, :cond_1e

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    const-string v2, "\u06e4\u06e0\u06e0"

    move-object v3, v2

    goto/16 :goto_7

    :cond_1e
    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v3, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    div-int/2addr v2, v3

    const v3, 0x1aaf7b

    add-int/2addr v2, v3

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_21
    :try_start_b
    move-object/from16 v0, v31

    move-object/from16 v1, v20

    invoke-static {v0, v1}, Lgf;->r(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    move-result v2

    if-ltz v2, :cond_1f

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    const-string v2, "\u06df\u06df\u06e8"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_1f
    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v3, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    rem-int/2addr v2, v3

    const v3, -0x1abd32

    xor-int/2addr v2, v3

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_22
    :try_start_c
    move-object/from16 v0, v28

    move-object/from16 v1, v41

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v3, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    mul-int/lit16 v3, v3, -0xe7d

    or-int/2addr v2, v3

    if-ltz v2, :cond_20

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    const-string v2, "\u06e7\u06e2\u06e8"

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_20
    const-string v2, "\u06e6\u06e5\u06e3"

    invoke-static {v2}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_23
    :try_start_d
    const-string v2, "c+JZOA==\n"

    const-string v3, "Gow/VyVl9Xs=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v27

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v7, Lp00;->b:Ljava/lang/Object;
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v3, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    xor-int/lit16 v3, v3, -0x1308

    or-int/2addr v2, v3

    if-ltz v2, :cond_21

    const/16 v2, 0x8

    sput v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    const-string v2, "\u06e4\u06e0\u06e2"

    invoke-static {v2}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_21
    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sub-int/2addr v2, v3

    const v3, 0x1ac958

    add-int/2addr v2, v3

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_24
    :try_start_e
    new-instance v3, Ljava/io/BufferedReader;

    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    xor-int/lit16 v2, v2, -0x23c1

    move-object/from16 v0, v45

    invoke-direct {v3, v0, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0

    sget v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v5, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    xor-int/lit16 v5, v5, -0x2022

    or-int/2addr v2, v5

    if-ltz v2, :cond_22

    move-object/from16 v2, v30

    goto/16 :goto_e

    :cond_22
    const-string v2, "\u06df\u06e3"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v31, v3

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_25
    sget-object v2, Lyg;->a:Lyf;

    sget-object v26, Lps;->a:Lno;

    move-object/from16 v0, p0

    iget-object v11, v0, Lgt;->m:Landroid/widget/EditText;

    new-instance v2, Lft;

    move-object/from16 v0, p0

    iget-object v3, v0, Lgt;->g:Landroid/widget/TextView;

    move-object/from16 v0, p0

    iget-object v5, v0, Lgt;->h:Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    iget-object v6, v0, Lgt;->i:Landroid/app/Activity;

    move-object/from16 v0, p0

    iget-object v8, v0, Lgt;->j:Lsn;

    move-object/from16 v0, p0

    iget-object v9, v0, Lgt;->k:Landroid/webkit/WebView;

    move-object/from16 v0, p0

    iget-object v10, v0, Lgt;->l:Landroid/widget/ScrollView;

    const/4 v12, 0x0

    invoke-direct/range {v2 .. v12}, Lft;-><init>(Landroid/widget/TextView;Lp00;Landroid/widget/LinearLayout;Landroid/app/Activity;Lp00;Lsn;Landroid/webkit/WebView;Landroid/widget/ScrollView;Landroid/widget/EditText;Lvd;)V

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    move-result v3

    if-gtz v3, :cond_23

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    const-string v3, "\u06e0\u06e2\u06df"

    invoke-static {v3}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v3

    move-object v9, v2

    move-object/from16 v10, v26

    move/from16 v48, v3

    goto/16 :goto_0

    :cond_23
    const-string v5, "\u06e8\u06e2\u06e7"

    move-object/from16 v3, v26

    goto/16 :goto_c

    :sswitch_26
    const-string v2, "\u06e4\u06e8\u06e6"

    move-object v5, v2

    goto/16 :goto_3

    :sswitch_27
    move/from16 v0, v32

    xor-int/lit16 v2, v0, 0x1e3

    add-int v29, v29, v2

    sget v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v3, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    div-int/2addr v2, v3

    const v3, 0x1ab262

    xor-int/2addr v2, v3

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_28
    sget v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    xor-int/lit16 v2, v2, -0xb7

    aput-object v38, v22, v2

    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    xor-int/lit16 v2, v2, 0x2c9

    aput-object v37, v22, v2

    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    xor-int/lit16 v2, v2, 0xb4

    aput-object v40, v22, v2

    sget v2, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    xor-int/lit16 v2, v2, 0x28e

    aput-object v43, v22, v2

    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v3, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    xor-int/lit16 v3, v3, 0x857

    sub-int/2addr v2, v3

    if-ltz v2, :cond_24

    move/from16 v2, v32

    :goto_10
    const-string v3, "\u06e4\u06e0\u06e3"

    invoke-static {v3}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v32, v2

    move/from16 v48, v3

    goto/16 :goto_0

    :cond_24
    const-string v2, "\u06e7\u06e2\u06e8"

    move-object v3, v2

    goto/16 :goto_7

    :sswitch_29
    move/from16 v0, v29

    move/from16 v1, v16

    if-ge v0, v1, :cond_c

    move/from16 v0, v29

    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    goto :goto_10

    :sswitch_2a
    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    if-gtz v2, :cond_25

    const/16 v2, 0xf

    sput v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    move-object/from16 v2, v33

    move-object/from16 v3, v34

    goto/16 :goto_8

    :cond_25
    const-string v2, "\u06e0\u06df\u06e3"

    goto/16 :goto_d

    :sswitch_2b
    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    if-ltz v2, :cond_26

    const-string v2, "\u06e8\u06e3\u06e7"

    goto/16 :goto_5

    :cond_26
    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v3, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    or-int/2addr v2, v3

    const v3, 0x1aba97

    add-int/2addr v2, v3

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_2c
    const-string v2, "60F96i2ED+GwGXmyLN4MtOBEd+Ir1Fu0sUF24XrfC7U=\n"

    const-string v3, "0yBP0xvmPtY=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v2, "5ZbBxXR3zZaywJOXJiqXnLTHlsBxd83G55PBlHcjxcA=\n"

    const-string v3, "1qSjphUT9aQ=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v2, "Kqd9A97UN8ktpylUitY8zXagLATb0zaVfvUvUI2BbJ8=\n"

    const-string v3, "T5cZZb3nDqw=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "TvO5sK7nkVhJrrWxruPJBkmo7uD75JZSH/u44P/hlAI=\n"

    const-string v8, "LcqM08/V8GA=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/google/android/material/carousel/ۢۢۢۥ;->۟ۡ۟۠ۧ()I

    move-result v8

    if-gtz v8, :cond_27

    const/16 v8, 0xe

    sput v8, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    const-string v8, "\u06e6\u06e3\u06e7"

    invoke-static {v8}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v35, v2

    move-object/from16 v42, v3

    move-object/from16 v43, v5

    move-object/from16 v44, v6

    move/from16 v48, v8

    goto/16 :goto_0

    :cond_27
    sget v8, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v11, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sub-int/2addr v8, v11

    const v11, 0x1aab10

    add-int/2addr v8, v11

    move-object/from16 v35, v2

    move-object/from16 v42, v3

    move-object/from16 v43, v5

    move-object/from16 v44, v6

    move/from16 v48, v8

    goto/16 :goto_0

    :catchall_1
    move-exception v2

    sget v3, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v5, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    or-int/lit16 v5, v5, -0xfe1

    div-int/2addr v3, v5

    if-ltz v3, :cond_28

    const/16 v3, 0x3d

    sput v3, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    const-string v3, "\u06e0\u06e8\u06e3"

    invoke-static {v3}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v36, v2

    move/from16 v48, v3

    goto/16 :goto_0

    :cond_28
    sget v3, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v5, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sub-int/2addr v3, v5

    const v5, 0x1ac39e

    xor-int/2addr v3, v5

    move-object/from16 v36, v2

    move/from16 v48, v3

    goto/16 :goto_0

    :sswitch_2d
    :try_start_f
    throw v36
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_0

    :sswitch_2e
    :try_start_10
    throw v20
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    :sswitch_2f
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v3, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    or-int/lit16 v3, v3, 0x2030

    or-int/2addr v2, v3

    if-ltz v2, :cond_29

    const-string v2, "\u06e5\u06e7\u06e5"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_29
    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v3, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    xor-int/2addr v2, v3

    const v3, 0x1ab68c

    add-int/2addr v2, v3

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_30
    :try_start_11
    const-string v2, "aHGDpg1VAhdcYIWKAkhfTSE63g==\n"

    const-string v3, "DxT372Mld2M=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v46

    invoke-static {v2, v0}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v3, Ln9;->a:Ljava/nio/charset/Charset;

    new-instance v2, Ljava/io/InputStreamReader;

    move-object/from16 v0, v46

    invoke-direct {v2, v0, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_0

    sget v3, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v5, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    mul-int/2addr v3, v5

    const v5, 0x1bac02

    add-int/2addr v3, v5

    move-object/from16 v45, v2

    move/from16 v48, v3

    goto/16 :goto_0

    :sswitch_31
    :try_start_12
    const-string v2, "BCAH6UW2ifMEOh+lB7DI/gsmH6URusjzBTtG6xC5hL0eLBvgRb+J6wt7BeAR+6DpHiU+1ymWh/ME\nMAjxDLqG\n"

    const-string v3, "alVrhWXV6J0=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v14}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v0, v14

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v2, v0
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_0

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    move-result v3

    if-gtz v3, :cond_2a

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    const-string v3, "\u06e4\u06df\u06e3"

    invoke-static {v3}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v47, v2

    move/from16 v48, v3

    goto/16 :goto_0

    :cond_2a
    sget v3, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v5, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    rem-int/2addr v3, v5

    const v5, -0x1ab9d5

    xor-int/2addr v3, v5

    move-object/from16 v47, v2

    move/from16 v48, v3

    goto/16 :goto_0

    :sswitch_32
    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v3, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    xor-int/2addr v2, v3

    const v3, 0xdb9f

    add-int/2addr v2, v3

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_33
    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    move-result v2

    if-gtz v2, :cond_2b

    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    const-string v2, "\u06e6\u06e2\u06e3"

    move-object v5, v2

    goto/16 :goto_3

    :cond_2b
    const-string v2, "\u06e4\u06e5\u06df"

    goto/16 :goto_9

    :sswitch_34
    new-instance v2, Ljava/util/ArrayList;

    move-object/from16 v0, v33

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v2}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v8, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    add-int/lit16 v8, v8, 0x12cb

    or-int/2addr v3, v8

    if-ltz v3, :cond_2c

    const-string v3, "\u06e1\u06e0\u06e2"

    goto/16 :goto_f

    :cond_2c
    sget v3, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v8, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    mul-int/2addr v3, v8

    const v8, -0x1d39d6

    xor-int/2addr v3, v8

    move-object v15, v2

    move/from16 v16, v5

    move/from16 v17, v6

    move/from16 v48, v3

    goto/16 :goto_0

    :sswitch_35
    :try_start_13
    const-string v2, "&offset=15&page=1&key="

    move-object/from16 v0, v28

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_0

    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    if-gtz v2, :cond_e

    const-string v2, "\u06e8\u06e5\u06e3"

    invoke-static {v2}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_36
    :try_start_14
    const-string v2, "pN0/MEqq\n"

    const-string v3, "16leRD/ZPHw=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v27

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "gg==\n"

    const-string v5, "s7sGiZ+e0Gk=\n"

    invoke-static {v3, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_0

    move-result v2

    if-eqz v2, :cond_2

    const-string v3, "\u06e0\u06e8\u06e3"

    move-object v2, v15

    move/from16 v5, v16

    move/from16 v6, v17

    goto/16 :goto_f

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe4 -> :sswitch_0
        0xdc27 -> :sswitch_28
        0xdc60 -> :sswitch_10
        0xdcbb -> :sswitch_16
        0x1aa708 -> :sswitch_d
        0x1aa740 -> :sswitch_2
        0x1aa782 -> :sswitch_1c
        0x1aaac4 -> :sswitch_b
        0x1aab1d -> :sswitch_16
        0x1aab82 -> :sswitch_18
        0x1aabdb -> :sswitch_1d
        0x1aabe0 -> :sswitch_3
        0x1aae88 -> :sswitch_6
        0x1aaea3 -> :sswitch_c
        0x1aaec5 -> :sswitch_1e
        0x1aaf7b -> :sswitch_2e
        0x1ab262 -> :sswitch_32
        0x1ab269 -> :sswitch_26
        0x1ab305 -> :sswitch_19
        0x1ab321 -> :sswitch_34
        0x1ab323 -> :sswitch_2f
        0x1ab623 -> :sswitch_12
        0x1ab641 -> :sswitch_8
        0x1ab663 -> :sswitch_b
        0x1ab666 -> :sswitch_e
        0x1ab69e -> :sswitch_a
        0x1ab6fb -> :sswitch_30
        0x1ab720 -> :sswitch_15
        0x1ab9c8 -> :sswitch_2a
        0x1ab9e6 -> :sswitch_f
        0x1ab9e7 -> :sswitch_17
        0x1aba06 -> :sswitch_35
        0x1aba7e -> :sswitch_21
        0x1aba80 -> :sswitch_1f
        0x1aba82 -> :sswitch_1
        0x1abac1 -> :sswitch_20
        0x1abae2 -> :sswitch_10
        0x1abd8e -> :sswitch_2d
        0x1abdc8 -> :sswitch_25
        0x1abe08 -> :sswitch_1b
        0x1abe65 -> :sswitch_23
        0x1ac166 -> :sswitch_2c
        0x1ac189 -> :sswitch_33
        0x1ac18a -> :sswitch_22
        0x1ac1a9 -> :sswitch_31
        0x1ac1c7 -> :sswitch_14
        0x1ac1ca -> :sswitch_13
        0x1ac204 -> :sswitch_11
        0x1ac526 -> :sswitch_9
        0x1ac54c -> :sswitch_4
        0x1ac56d -> :sswitch_1a
        0x1ac58c -> :sswitch_5
        0x1ac5a2 -> :sswitch_36
        0x1ac623 -> :sswitch_29
        0x1ac92d -> :sswitch_7
        0x1ac986 -> :sswitch_2b
        0x1ac9a3 -> :sswitch_1b
        0x1ac9c2 -> :sswitch_27
        0x1ac9e2 -> :sswitch_24
    .end sparse-switch
.end method
