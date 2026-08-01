.class public final Lws;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public a:I

.field public final b:Landroid/view/ViewGroup;

.field public final c:Lv9;

.field public final d:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Lv9;Landroid/app/Activity;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e0\u06e5\u06e8"

    invoke-static {v0}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p2, p0, Lws;->c:Lv9;

    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    xor-int/lit16 v2, v2, -0x717

    div-int/2addr v0, v2

    if-eqz v0, :cond_5

    const/16 v0, 0x4a

    sput v0, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    const-string v0, "\u06df\u06e0\u06e6"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    :sswitch_1
    const-string v0, "\u06e7\u06e3\u06e8"

    invoke-static {v0}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    if-gtz v0, :cond_1

    const/16 v0, 0x19

    sput v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    const-string v0, "\u06e0\u06e2\u06e0"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e7\u06e3\u06e8"

    goto :goto_1

    :sswitch_3
    const-string v0, "ir9r0G"

    invoke-static {v0}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۦۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget v1, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    add-int/lit8 v2, v2, -0x75

    mul-int/2addr v1, v2

    if-ltz v1, :cond_2

    const-string v1, "\u06e6\u06e7\u06e5"

    invoke-static {v1}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_2
    const-string v1, "\u06e6\u06e7\u06e5"

    move-object v2, v1

    :goto_2
    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_4
    sget v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    xor-int/2addr v0, v2

    const v2, 0x1aa831

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    iput-object p3, p0, Lws;->d:Landroid/app/Activity;

    sget v0, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    rem-int/lit16 v2, v2, 0x20d0

    div-int/2addr v0, v2

    if-eqz v0, :cond_3

    const/16 v0, 0x48

    sput v0, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    const-string v2, "\u06e4\u06e7\u06e8"

    move-object v0, v1

    goto :goto_2

    :cond_3
    sget v0, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    div-int/2addr v0, v2

    const v2, 0x1abd8c

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    iput-object p1, p0, Lws;->b:Landroid/view/ViewGroup;

    sget v0, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    div-int/lit16 v2, v2, -0xc68

    sub-int/2addr v0, v2

    if-gtz v0, :cond_4

    const-string v0, "\u06e7\u06e3\u06e8"

    :goto_3
    invoke-static {v0}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06df\u06e0\u06e6"

    goto :goto_3

    :cond_5
    const-string v0, "\u06e8\u06e6\u06e8"

    invoke-static {v0}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    move-result v0

    if-ltz v0, :cond_0

    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    add-int/2addr v0, v2

    const v2, -0x1aa8dd

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_8
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa725 -> :sswitch_0
        0x1aab1e -> :sswitch_1
        0x1aab3d -> :sswitch_3
        0x1aab83 -> :sswitch_6
        0x1abac5 -> :sswitch_4
        0x1abd8c -> :sswitch_7
        0x1ac244 -> :sswitch_2
        0x1ac58c -> :sswitch_8
        0x1ac9aa -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 33

    const/16 v22, 0x0

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v30, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v10, 0x0

    const/16 v27, 0x0

    const/4 v5, 0x0

    const/4 v3, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/16 v20, 0x0

    const/4 v13, 0x0

    const/16 v26, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v7, 0x0

    const/16 v17, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-string v8, "\u06e2\u06e0\u06e4"

    invoke-static {v8}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v31, v2

    move/from16 v32, v8

    :goto_0
    sparse-switch v32, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v2, v2, Landroid/view/View;

    if-eqz v2, :cond_23

    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    const-string v2, "dEuQae2iTf10UYglr6QM8HtNiCW5rgz9dVDRa7itQLNuR4xg7aBC92hRlWHjt0X2bRCqbKi2\n"

    const-string v8, "Gj78Bc3BLJM=\n"

    invoke-static {v2, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    const-string v2, "\u06e0\u06e6"

    invoke-static {v2}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto :goto_0

    :sswitch_1
    const v2, 0x1422dc09

    if-eq v10, v2, :cond_2d

    const-string v2, "\u06e5\u06e5"

    invoke-static {v2}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v2

    if-ltz v2, :cond_0

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    move v2, v6

    :goto_2
    const-string v7, "\u06e1\u06e5\u06e8"

    move v8, v2

    :goto_3
    invoke-static {v7}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    move v7, v8

    goto :goto_0

    :cond_0
    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v7, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    mul-int/2addr v2, v7

    const v7, -0x1194bb

    xor-int/2addr v2, v7

    move/from16 v32, v2

    move v7, v6

    goto :goto_0

    :sswitch_3
    invoke-virtual/range {v21 .. v21}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    move-result v2

    if-ltz v2, :cond_d

    const/16 v2, 0x62

    sput v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    const-string v2, "\u06e1\u06e6\u06e4"

    invoke-static {v2}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto :goto_0

    :cond_1
    :sswitch_4
    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v8, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    or-int/lit16 v8, v8, 0x2389

    rem-int/2addr v2, v8

    if-ltz v2, :cond_2

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    const-string v2, "\u06e7\u06e6\u06e4"

    :goto_4
    invoke-static {v2}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_2
    const-string v2, "\u06e7\u06e4\u06e6"

    goto :goto_4

    :sswitch_5
    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    move-result v2

    if-ltz v2, :cond_3

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    const-string v2, "\u06e1\u06e7\u06e5"

    invoke-static {v2}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_3
    const-string v2, "\u06e0\u06e7\u06e1"

    :goto_5
    invoke-static {v2}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_6
    move v2, v10

    :cond_4
    sget v8, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v10, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    xor-int/lit16 v10, v10, 0x19b9

    or-int/2addr v8, v10

    if-ltz v8, :cond_5

    const/16 v8, 0x44

    sput v8, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    const-string v8, "\u06e8\u06e1\u06e2"

    invoke-static {v8}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v8

    move v10, v2

    move/from16 v32, v8

    goto/16 :goto_0

    :cond_5
    sget v8, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v10, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    mul-int/2addr v8, v10

    const v10, 0x34d38

    xor-int/2addr v8, v10

    move v10, v2

    move/from16 v32, v8

    goto/16 :goto_0

    :cond_6
    move-object v8, v11

    move-object v12, v3

    move-object v13, v3

    :goto_6
    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    if-gtz v2, :cond_7

    const-string v2, "\u06e4\u06df\u06e4"

    :goto_7
    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v11, v8

    move-object v3, v12

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06df\u06e4"

    goto :goto_7

    :sswitch_7
    invoke-virtual/range {v21 .. v21}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v8, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    add-int/2addr v2, v8

    const v8, -0x1ab389

    xor-int/2addr v2, v8

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_8
    sget v2, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v8, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    add-int/lit16 v8, v8, 0xdda

    or-int/2addr v2, v8

    if-ltz v2, :cond_8

    const-string v2, "\u06e4\u06e4\u06df"

    invoke-static {v2}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_8
    const-string v2, "\u06e4\u06e6\u06e7"

    invoke-static {v2}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_9
    const/16 v28, 0x0

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v8, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    rem-int/2addr v2, v8

    const v8, 0x1aa6b2

    add-int/2addr v2, v8

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_a
    sget v2, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    xor-int/lit16 v2, v2, -0xc7

    add-int v17, v17, v2

    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v8, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    add-int/lit16 v8, v8, 0xb6b

    rem-int/2addr v2, v8

    if-gtz v2, :cond_13

    const/16 v2, 0x1b

    sput v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    const-string v2, "\u06e1\u06e0\u06e5"

    invoke-static {v2}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_b
    const/4 v2, 0x1

    return v2

    :sswitch_c
    if-eqz v29, :cond_1b

    invoke-virtual/range {v29 .. v29}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    const-string v8, "+cFt6grd7Vv0\n"

    const-string v12, "kLIygmWyhj4=\n"

    invoke-static {v8, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v2, v8}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    const-string v2, "FoCZtwUwhQwb\n"

    const-string v8, "f/PG32pf7mk=\n"

    invoke-static {v2, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v29

    invoke-virtual {v0, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v8, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    or-int/2addr v2, v8

    const v8, 0xdc86

    add-int/2addr v2, v8

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_d
    move/from16 v0, v17

    if-ge v0, v15, :cond_12

    move-object/from16 v0, v26

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    move-result v2

    if-gtz v2, :cond_9

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    move v7, v9

    goto/16 :goto_1

    :cond_9
    const-string v2, "\u06e5\u06e3\u06e8"

    move-object v7, v2

    move v8, v9

    goto/16 :goto_3

    :sswitch_e
    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    move-result v2

    if-ltz v2, :cond_a

    const-string v2, "\u06e4\u06e8\u06e1"

    invoke-static {v2}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v29, v28

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06e5\u06e2\u06e8"

    move-object/from16 v8, v28

    move/from16 v12, v30

    :goto_8
    invoke-static {v2}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v29, v8

    move/from16 v32, v2

    move/from16 v30, v12

    goto/16 :goto_0

    :sswitch_f
    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    if-ltz v2, :cond_c

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣۣ۟ۡ()I

    :cond_b
    const-string v2, "\u06e4\u06e1\u06e8"

    invoke-static {v2}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u06e1\u06e6\u06e0"

    invoke-static {v2}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_10
    sget v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    if-ltz v2, :cond_e

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    :cond_d
    const-string v2, "\u06e5\u06e4\u06e2"

    move v8, v15

    move/from16 v12, v16

    :goto_9
    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v2

    move v15, v8

    move/from16 v16, v12

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_e
    const-string v2, "\u06e0\u06e8\u06df"

    invoke-static {v2}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    move-result v2

    if-ltz v2, :cond_f

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    move/from16 v8, v16

    :goto_a
    const-string v2, "\u06e3\u06e3\u06df"

    invoke-static {v2}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    move/from16 v17, v8

    goto/16 :goto_0

    :cond_f
    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v8, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    div-int/2addr v2, v8

    const v8, 0xdc82

    add-int/2addr v2, v8

    move/from16 v32, v2

    move/from16 v17, v16

    goto/16 :goto_0

    :sswitch_12
    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    move-result v2

    if-ltz v2, :cond_10

    const/16 v2, 0x20

    sput v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    const-string v2, "\u06e0\u06e3\u06e0"

    invoke-static {v2}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_10
    const-string v2, "\u06e4\u06e8"

    move-object/from16 v8, v20

    move-object/from16 v12, v21

    move-object/from16 v23, v2

    move-object/from16 v24, v13

    move/from16 v25, v10

    :goto_b
    invoke-static/range {v23 .. v23}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v20, v8

    move-object/from16 v21, v12

    move-object/from16 v13, v24

    move/from16 v10, v25

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_13
    move-object v2, v3

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v8

    int-to-float v8, v8

    move/from16 v0, v18

    int-to-float v11, v0

    const v12, 0x3f666666    # 0.9f

    mul-float/2addr v11, v12

    cmpl-float v8, v8, v11

    if-ltz v8, :cond_31

    const-string v8, "\u06df\u06e1\u06df"

    invoke-static {v8}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v8

    move-object v11, v2

    move-object v13, v3

    move/from16 v32, v8

    goto/16 :goto_0

    :sswitch_14
    invoke-virtual/range {v26 .. v26}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v8

    const/4 v12, 0x0

    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    move-result v2

    if-gtz v2, :cond_11

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    const-string v2, "\u06e5\u06e3\u06e8"

    move v15, v8

    move/from16 v16, v12

    :goto_c
    invoke-static {v2}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_11
    const-string v2, "\u06e5\u06e8\u06e1"

    goto/16 :goto_9

    :cond_12
    move v7, v9

    :sswitch_15
    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v8, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    add-int/2addr v2, v8

    const v8, 0x1ab1f2

    xor-int/2addr v2, v8

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_16
    const-string v2, "1+iDNXX0\n"

    const-string v8, "MmcS0vtEBNY=\n"

    invoke-static {v2, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v31

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v8, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    add-int/lit16 v8, v8, 0x262

    or-int/2addr v2, v8

    if-gtz v2, :cond_14

    const/16 v2, 0x4e

    sput v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    :cond_13
    const-string v2, "\u06e1\u06e1"

    invoke-static {v2}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_14
    const-string v2, "\u06e8\u06e4\u06e7"

    move-object v8, v11

    move-object v12, v3

    goto/16 :goto_7

    :sswitch_17
    invoke-virtual/range {v31 .. v31}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v8, 0xa99ff

    if-eq v2, v8, :cond_19

    const v8, 0xecd02

    if-eq v2, v8, :cond_4

    const-string v8, "\u06e5\u06e0"

    move v10, v2

    :goto_d
    invoke-static {v8}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_15
    :sswitch_18
    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v8, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    or-int/lit16 v8, v8, 0x2062

    rem-int/2addr v2, v8

    if-ltz v2, :cond_16

    const-string v2, "\u06e5\u06e4\u06e6"

    move-object v8, v2

    goto :goto_d

    :cond_16
    const-string v2, "\u06e2\u06e5\u06e1"

    invoke-static {v2}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_19
    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v8, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    or-int/lit16 v8, v8, 0xc23

    div-int/2addr v2, v8

    if-eqz v2, :cond_17

    const/16 v2, 0x30

    sput v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    const-string v2, "\u06e1\u06e4\u06df"

    invoke-static {v2}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v13, v27

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_17
    const-string v2, "\u06df\u06e4"

    move-object v8, v2

    move-object v12, v3

    move-object/from16 v13, v27

    :goto_e
    invoke-static {v8}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v3, v12

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_1a
    const-string v2, "6UuGDIT3wWM=\n"

    const-string v8, "rSL1b+uBpBE=\n"

    invoke-static {v2, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v31

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "\u06e0\u06e0\u06e1"

    goto/16 :goto_4

    :sswitch_1b
    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    move-result v2

    if-ltz v2, :cond_18

    const/16 v2, 0x2f

    sput v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    const-string v2, "\u06df\u06e1\u06e3"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v27, v4

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_18
    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v8, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    add-int/2addr v2, v8

    const v8, 0x1aaee7

    add-int/2addr v2, v8

    move-object/from16 v27, v4

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_1c
    move v2, v10

    :cond_19
    sget v8, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v10, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    or-int/lit16 v10, v10, -0x5cf

    div-int/2addr v8, v10

    if-eqz v8, :cond_1a

    const/4 v8, 0x3

    sput v8, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    const-string v10, "\u06e0\u06e3\u06e8"

    move-object/from16 v8, v20

    move-object/from16 v12, v21

    move-object/from16 v23, v10

    move-object/from16 v24, v13

    move/from16 v25, v2

    goto/16 :goto_b

    :cond_1a
    const-string v10, "\u06e1\u06e0\u06e2"

    move-object/from16 v8, v20

    move-object/from16 v12, v21

    move-object/from16 v23, v10

    move-object/from16 v24, v13

    move/from16 v25, v2

    goto/16 :goto_b

    :cond_1b
    :sswitch_1d
    const-string v2, "\u06e4\u06e4"

    :goto_f
    invoke-static {v2}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_1e
    invoke-virtual {v11}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float v2, v2, v30

    const/high16 v8, 0x42340000    # 45.0f

    cmpg-float v8, v8, v2

    if-gtz v8, :cond_30

    sget v8, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v12, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    rem-int/lit16 v12, v12, -0x1709

    add-int/2addr v8, v12

    if-ltz v8, :cond_1c

    const/16 v8, 0x4d

    sput v8, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    const-string v8, "\u06e3\u06e0"

    invoke-static {v8}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v8

    move-object v13, v3

    move/from16 v32, v8

    move v14, v2

    goto/16 :goto_0

    :cond_1c
    move-object v13, v3

    move/from16 v8, v17

    move v14, v2

    goto/16 :goto_a

    :sswitch_1f
    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v8, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    xor-int/2addr v2, v8

    const v8, 0x1ab58e

    add-int/2addr v2, v8

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_20
    const-string v2, "nu0tCb2z\n"

    const-string v8, "eXSR7jINaso=\n"

    invoke-static {v2, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v31

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_23

    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    if-gtz v2, :cond_1d

    const-string v2, "\u06e0\u06e0\u06e1"

    invoke-static {v2}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_1d
    sget v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v8, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    mul-int/2addr v2, v8

    const v8, 0x1135ef

    add-int/2addr v2, v8

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_21
    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    move-result v2

    if-ltz v2, :cond_1e

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    const-string v2, "\u06e0\u06e8\u06e5"

    invoke-static {v2}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_1e
    const-string v2, "\u06e5\u06e4\u06e2"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_22
    instance-of v2, v4, Landroid/view/ViewGroup;

    if-eqz v2, :cond_12

    move-object v2, v4

    check-cast v2, Landroid/view/ViewGroup;

    sget v7, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v8, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    add-int/lit16 v8, v8, -0x14a1

    xor-int/2addr v7, v8

    if-gtz v7, :cond_1f

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    const-string v7, "\u06e7\u06e0\u06df"

    invoke-static {v7}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v26, v2

    move/from16 v32, v8

    move v7, v9

    goto/16 :goto_0

    :cond_1f
    const-string v7, "\u06e3\u06df"

    move-object v8, v2

    move-object v12, v7

    move-object/from16 v23, v4

    move/from16 v24, v9

    :goto_10
    invoke-static {v12}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v26, v8

    move-object/from16 v4, v23

    move/from16 v32, v2

    move/from16 v7, v24

    goto/16 :goto_0

    :sswitch_23
    move-object/from16 v0, p0

    iget v2, v0, Lws;->a:I

    rsub-int/lit8 v2, v2, 0x0

    add-int/lit8 v2, v2, -0x1

    rsub-int/lit8 v2, v2, 0x0

    move-object/from16 v0, p0

    iput v2, v0, Lws;->a:I

    new-instance v22, Ljava/util/LinkedList;

    invoke-direct/range {v22 .. v22}, Ljava/util/LinkedList;-><init>()V

    move-object/from16 v0, p0

    iget-object v2, v0, Lws;->b:Landroid/view/ViewGroup;

    sget v8, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v12, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    mul-int/lit16 v12, v12, -0x1ceb

    sub-int/2addr v8, v12

    if-gtz v8, :cond_20

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    const-string v8, "\u06e3\u06e5\u06e8"

    invoke-static {v8}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v21, v2

    move/from16 v32, v8

    goto/16 :goto_0

    :cond_20
    const-string v21, "\u06e1\u06e2"

    move-object/from16 v8, v20

    move-object v12, v2

    move-object/from16 v23, v21

    move-object/from16 v24, v13

    move/from16 v25, v10

    goto/16 :goto_b

    :cond_21
    :sswitch_24
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    if-gtz v2, :cond_22

    const-string v2, "\u06e3\u06e8\u06e6"

    goto/16 :goto_f

    :cond_22
    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v8, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    or-int/2addr v2, v8

    const v8, 0x1aa7aa

    add-int/2addr v2, v8

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_23
    :sswitch_25
    const-string v2, "\u06e1\u06e0\u06e5"

    move-object/from16 v8, v20

    move-object/from16 v12, v21

    move-object/from16 v23, v2

    move-object/from16 v24, v13

    move/from16 v25, v10

    goto/16 :goto_b

    :sswitch_26
    move-object/from16 v0, p0

    iget v2, v0, Lws;->a:I

    const/16 v8, 0x50

    if-le v2, v8, :cond_15

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    move-result v2

    if-ltz v2, :cond_b

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    const-string v2, "\u06e5\u06e2\u06e8"

    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_27
    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v8, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    add-int/lit16 v8, v8, -0x1783

    or-int/2addr v2, v8

    if-ltz v2, :cond_24

    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    const-string v2, "\u06e1\u06e4\u06e7"

    invoke-static {v2}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_24
    const-string v2, "\u06e3\u06e0"

    invoke-static {v2}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_28
    invoke-interface/range {v22 .. v22}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_21

    const/16 v2, 0x4b0

    if-ge v7, v2, :cond_21

    invoke-virtual/range {v22 .. v22}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v8, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    div-int/lit16 v8, v8, -0xca0

    sub-int/2addr v4, v8

    if-ltz v4, :cond_25

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    const-string v4, "\u06e5\u06e0"

    move-object/from16 v8, v26

    move-object v12, v4

    move-object/from16 v23, v2

    move/from16 v24, v7

    goto/16 :goto_10

    :cond_25
    sget v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v8, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    add-int/2addr v4, v8

    const v8, 0xde96

    add-int/2addr v8, v4

    move-object v4, v2

    move/from16 v32, v8

    goto/16 :goto_0

    :sswitch_29
    move-object v2, v5

    check-cast v2, Landroid/view/View;

    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_2f

    sget v3, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v8, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    or-int/lit16 v8, v8, -0x1773

    sub-int/2addr v3, v8

    if-gtz v3, :cond_26

    const-string v3, "\u06e5\u06e0\u06e7"

    move-object v8, v3

    move-object v12, v2

    move-object v13, v2

    goto/16 :goto_e

    :cond_26
    sget v3, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v8, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    xor-int/2addr v3, v8

    const v8, 0x1ab01b

    add-int/2addr v8, v3

    move-object v3, v2

    move-object v13, v2

    move/from16 v32, v8

    goto/16 :goto_0

    :sswitch_2a
    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v8, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    or-int/lit16 v8, v8, -0x15a2

    xor-int/2addr v2, v8

    if-gtz v2, :cond_27

    const/16 v2, 0x55

    sput v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    const-string v2, "\u06e1\u06e8\u06df"

    goto/16 :goto_5

    :cond_27
    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v8, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    rem-int/2addr v2, v8

    const v8, 0x1aaf43

    add-int/2addr v2, v8

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_2b
    const/high16 v2, 0x42f00000    # 120.0f

    cmpg-float v2, v14, v2

    if-gtz v2, :cond_6

    const/4 v2, 0x2

    new-array v2, v2, [I

    const-string v13, "\u06e3\u06e5\u06e8"

    move-object v8, v2

    move-object/from16 v12, v21

    move-object/from16 v23, v13

    move-object/from16 v24, v3

    move/from16 v25, v10

    goto/16 :goto_b

    :sswitch_2c
    invoke-virtual/range {v21 .. v21}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v12, v2, Landroid/util/DisplayMetrics;->density:F

    const/4 v6, 0x0

    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v8, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    rem-int/lit16 v8, v8, -0x1b1a

    or-int/2addr v2, v8

    if-ltz v2, :cond_28

    const-string v2, "\u06e7\u06e0\u06e5"

    move-object/from16 v8, v29

    goto/16 :goto_8

    :cond_28
    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v8, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    or-int/2addr v2, v8

    const v8, 0x1abc4e

    add-int/2addr v2, v8

    move/from16 v32, v2

    move/from16 v30, v12

    goto/16 :goto_0

    :sswitch_2d
    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v8, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    mul-int/2addr v2, v8

    const v8, -0x1ae38c

    xor-int/2addr v2, v8

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_2e
    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v8, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    or-int/lit16 v8, v8, 0x186

    mul-int/2addr v2, v8

    if-gtz v2, :cond_29

    const-string v2, "\u06e5\u06e8\u06e1"

    invoke-static {v2}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_29
    const-string v2, "\u06e6\u06e5\u06e4"

    invoke-static {v2}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_2f
    :try_start_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lws;->c:Lv9;

    move-object/from16 v0, p0

    iget-object v8, v0, Lws;->d:Landroid/app/Activity;

    move-object/from16 v0, v21

    move-object/from16 v1, v29

    invoke-static {v2, v8, v0, v1}, Lv9;->a(Lv9;Landroid/app/Activity;Landroid/view/ViewGroup;Landroid/view/ViewGroup;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v2, v7

    goto/16 :goto_2

    :sswitch_30
    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v8, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sub-int/2addr v2, v8

    const v8, 0x1ac9e8

    add-int/2addr v2, v8

    move/from16 v32, v2

    goto/16 :goto_0

    :catchall_0
    move-exception v2

    const-string v2, "06ke\n"

    const-string v8, "p8h5VTpLcuY=\n"

    const-string v12, "w3rI+d3opIjhcP7S5saFies=\n"

    const-string v23, "jhuhl4ih7Oc=\n"

    move-object/from16 v0, v23

    invoke-static {v12, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v23, "tw==\n"

    const-string v24, "0vI8ySRxU5w=\n"

    move-object/from16 v0, v23

    move-object/from16 v1, v24

    invoke-static {v2, v8, v12, v0, v1}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    if-ltz v2, :cond_2a

    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    const-string v2, "\u06e4\u06e4"

    invoke-static {v2}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_2a
    sget v2, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v8, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    add-int/2addr v2, v8

    const v8, 0x1aaf29

    add-int/2addr v2, v8

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_31
    move-object/from16 v0, v22

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {v21 .. v21}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v8, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-virtual/range {v21 .. v21}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v12, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    if-gtz v2, :cond_2b

    const/16 v2, 0xd

    sput v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    const-string v2, "\u06e6\u06e4\u06e0"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v8

    move/from16 v19, v12

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_2b
    const-string v2, "\u06e3\u06e6\u06e1"

    move/from16 v18, v8

    move/from16 v19, v12

    goto/16 :goto_c

    :sswitch_32
    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    xor-int/lit8 v2, v2, 0x5c

    add-int v9, v7, v2

    instance-of v2, v4, Landroid/widget/TextView;

    if-eqz v2, :cond_23

    move-object v2, v4

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Li50;->Q(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    move-result v8

    if-ltz v8, :cond_2c

    const/16 v8, 0x44

    sput v8, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    const-string v8, "\u06e2\u06df\u06e7"

    invoke-static {v8}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v31, v2

    move/from16 v32, v8

    goto/16 :goto_0

    :cond_2c
    const-string v8, "\u06df\u06e4\u06e6"

    invoke-static {v8}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v31, v2

    move/from16 v32, v8

    goto/16 :goto_0

    :cond_2d
    :sswitch_33
    const-string v2, "\u06e4\u06e2\u06e1"

    invoke-static {v2}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_34
    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v8, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    add-int/2addr v2, v8

    const v8, 0x1aacb6

    add-int/2addr v2, v8

    move-object/from16 v29, v11

    move/from16 v32, v2

    goto/16 :goto_0

    :sswitch_35
    move-object/from16 v0, v20

    invoke-virtual {v11, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v2, 0x1

    aget v2, v20, v2

    sget v8, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    xor-int/lit16 v8, v8, 0x386

    div-int v8, v19, v8

    if-le v2, v8, :cond_6

    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v8, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    div-int/lit16 v8, v8, 0x8d3

    or-int/2addr v2, v8

    if-gtz v2, :cond_2e

    const/16 v2, 0x25

    sput v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    const-string v2, "\u06e8\u06e4\u06e7"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v13, v3

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_2e
    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v8, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    div-int/2addr v2, v8

    const v8, 0x1abdac

    add-int/2addr v2, v8

    move-object v13, v3

    move/from16 v32, v2

    goto/16 :goto_0

    :cond_2f
    move-object v8, v11

    move-object v12, v2

    move-object v13, v2

    goto/16 :goto_6

    :cond_30
    move-object v8, v11

    move-object v12, v3

    move-object v13, v3

    move v14, v2

    goto/16 :goto_6

    :cond_31
    move-object v8, v2

    move-object v12, v3

    move-object v13, v3

    goto/16 :goto_6

    :sswitch_36
    move-object v8, v11

    move-object v12, v3

    goto/16 :goto_6

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe5 -> :sswitch_0
        0xdc06 -> :sswitch_29
        0xdc1e -> :sswitch_20
        0xdc1f -> :sswitch_32
        0xdc20 -> :sswitch_5
        0xdc21 -> :sswitch_31
        0xdc27 -> :sswitch_1f
        0xdc5c -> :sswitch_14
        0xdc5d -> :sswitch_25
        0xdc80 -> :sswitch_26
        0xdc83 -> :sswitch_3
        0xdc84 -> :sswitch_d
        0xdc9b -> :sswitch_1
        0xdca0 -> :sswitch_f
        0x1aa6ff -> :sswitch_e
        0x1aa727 -> :sswitch_9
        0x1aa73d -> :sswitch_1e
        0x1aa741 -> :sswitch_21
        0x1aa7a1 -> :sswitch_17
        0x1aaae1 -> :sswitch_30
        0x1aab01 -> :sswitch_36
        0x1aabba -> :sswitch_12
        0x1aabd7 -> :sswitch_2d
        0x1aaea3 -> :sswitch_16
        0x1aaea6 -> :sswitch_22
        0x1aaf1c -> :sswitch_19
        0x1aaf24 -> :sswitch_18
        0x1aaf44 -> :sswitch_8
        0x1aaf5b -> :sswitch_25
        0x1aaf5f -> :sswitch_10
        0x1aaf7a -> :sswitch_15
        0x1aaf7f -> :sswitch_2e
        0x1ab24a -> :sswitch_13
        0x1ab266 -> :sswitch_23
        0x1ab2e6 -> :sswitch_1d
        0x1ab2fe -> :sswitch_b
        0x1ab323 -> :sswitch_33
        0x1ab33d -> :sswitch_28
        0x1ab67f -> :sswitch_2b
        0x1ab6c6 -> :sswitch_35
        0x1ab6de -> :sswitch_2c
        0x1aba0b -> :sswitch_7
        0x1aba23 -> :sswitch_1a
        0x1aba5f -> :sswitch_1c
        0x1abaa5 -> :sswitch_1d
        0x1ababd -> :sswitch_6
        0x1abadd -> :sswitch_2
        0x1abdac -> :sswitch_34
        0x1abdeb -> :sswitch_c
        0x1abe0a -> :sswitch_a
        0x1abe23 -> :sswitch_2f
        0x1abe9e -> :sswitch_11
        0x1ac18d -> :sswitch_2d
        0x1ac1e2 -> :sswitch_12
        0x1ac205 -> :sswitch_4
        0x1ac226 -> :sswitch_4
        0x1ac526 -> :sswitch_2a
        0x1ac52c -> :sswitch_24
        0x1ac5a9 -> :sswitch_1b
        0x1ac96b -> :sswitch_27
        0x1ac9df -> :sswitch_25
        0x1ac9e8 -> :sswitch_25
    .end sparse-switch
.end method
