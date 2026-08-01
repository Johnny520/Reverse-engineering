.class public abstract Li6;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Li6;->a:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static a(Landroid/app/Dialog;Landroid/widget/LinearLayout;)V
    .locals 8

    const/4 v0, 0x0

    const-string v1, "\u06e5\u06e5\u06e6"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v0

    move-object v1, v0

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v4, -0x286

    sget v3, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    int-to-long v6, v3

    xor-long/2addr v4, v6

    invoke-virtual {v0, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    move-result v0

    if-ltz v0, :cond_4

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    const-string v0, "\u06e6\u06e2"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :sswitch_1
    new-instance v0, Lc6;

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3}, Lc6;-><init>(Landroid/view/KeyEvent$Callback;I)V

    invoke-virtual {v1, v0}, Lo40;->a(Luh;)V

    sget v0, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v3, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    rem-int/lit16 v3, v3, -0x1abd

    div-int/2addr v0, v3

    if-gtz v0, :cond_0

    const/16 v0, 0xe

    sput v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    const-string v0, "\u06e5\u06e5\u06e6"

    :goto_1
    invoke-static {v0}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v3, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    or-int/2addr v0, v3

    const v3, 0x1aa680

    xor-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_2
    new-instance v0, Lo40;

    sget-object v1, Lo40;->n:Lsh;

    invoke-direct {v0, p1, v1}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    move-result v1

    if-ltz v1, :cond_1

    const/16 v1, 0x28

    sput v1, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    const-string v1, "\u06e6\u06e1\u06e0"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v0

    goto :goto_0

    :sswitch_3
    const/high16 v0, 0x43480000    # 200.0f

    invoke-virtual {v2, v0}, Lp40;->b(F)V

    sget v0, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v3, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    div-int/lit16 v3, v3, -0x11c2

    or-int/2addr v0, v3

    if-gtz v0, :cond_2

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-object v0, v1

    :cond_1
    const-string v1, "\u06df\u06e3\u06df"

    invoke-static {v1}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v0

    goto/16 :goto_0

    :cond_2
    const-string v0, "\u06e7\u06e0\u06e0"

    goto :goto_1

    :sswitch_4
    invoke-virtual {v1}, Lo40;->h()V

    sget v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v3, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    add-int/2addr v0, v3

    const v3, 0xde37

    xor-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :sswitch_5
    new-instance v0, Lp40;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v2, v2

    invoke-direct {v0, v2}, Lp40;-><init>(F)V

    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v3, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    add-int/lit16 v3, v3, -0x232b

    or-int/2addr v2, v3

    if-ltz v2, :cond_3

    const/16 v2, 0x56

    sput v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    const-string v2, "\u06df\u06e0\u06e0"

    invoke-static {v2}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v0

    goto/16 :goto_0

    :cond_3
    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v3, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    div-int/2addr v2, v3

    const v3, 0xdcbc

    add-int/2addr v3, v2

    move-object v2, v0

    goto/16 :goto_0

    :sswitch_6
    sget v0, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v3, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    or-int/2addr v0, v3

    const v3, 0x1abdbb

    xor-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :sswitch_7
    iput-object v2, v1, Lo40;->k:Lp40;

    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    move-result v0

    if-gtz v0, :cond_5

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    :cond_4
    const-string v0, "\u06e6\u06e6\u06e7"

    :goto_2
    invoke-static {v0}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e6\u06e1\u06e0"

    goto :goto_2

    :sswitch_8
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc1f -> :sswitch_0
        0xdca3 -> :sswitch_6
        0xdcbc -> :sswitch_3
        0x1aa71f -> :sswitch_4
        0x1aa77b -> :sswitch_5
        0x1abe46 -> :sswitch_2
        0x1ac185 -> :sswitch_1
        0x1ac227 -> :sswitch_8
        0x1ac527 -> :sswitch_7
    .end sparse-switch
.end method

.method public static final b(Lsn;Ljava/lang/String;)I
    .locals 148

    const/16 v104, 0x0

    const/4 v5, 0x0

    const/16 v29, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v86, 0x0

    const/16 v103, 0x0

    const/16 v105, 0x0

    const-wide/16 v68, 0x0

    const-wide/16 v138, 0x0

    const-wide/16 v52, 0x0

    const-wide/16 v42, 0x0

    const-wide/16 v112, 0x0

    const-wide/16 v110, 0x0

    const/16 v33, 0x0

    const/16 v18, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v50, 0x0

    const-wide/16 v114, 0x0

    const/16 v20, 0x0

    const-wide/16 v82, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v92, 0x0

    const/16 v31, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v62, 0x0

    const-wide/16 v108, 0x0

    const/16 v32, 0x0

    const-wide/16 v134, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v124, 0x0

    const-wide/16 v90, 0x0

    const-wide/16 v118, 0x0

    const-wide/16 v116, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v122, 0x0

    const-wide/16 v74, 0x0

    const-wide/16 v140, 0x0

    const-wide/16 v70, 0x0

    const-wide/16 v96, 0x0

    const-wide/16 v78, 0x0

    const-wide/16 v44, 0x0

    const-wide/16 v54, 0x0

    const-wide/16 v24, 0x0

    const-wide/16 v76, 0x0

    const-wide/16 v26, 0x0

    const-wide/16 v36, 0x0

    const-wide/16 v56, 0x0

    const-wide/16 v48, 0x0

    const-wide/16 v34, 0x0

    const-wide/16 v38, 0x0

    const-wide/16 v58, 0x0

    const-wide/16 v66, 0x0

    const-wide/16 v80, 0x0

    const-wide/16 v64, 0x0

    const-wide/16 v88, 0x0

    const-wide/16 v46, 0x0

    const-wide/16 v132, 0x0

    const-wide/16 v130, 0x0

    const-wide/16 v136, 0x0

    const-wide/16 v128, 0x0

    const-wide/16 v72, 0x0

    const/16 v61, 0x0

    const-wide/16 v84, 0x0

    const/16 v17, 0x0

    const-wide/16 v120, 0x0

    const-wide/16 v126, 0x0

    const/16 v94, 0x0

    const-wide/16 v40, 0x0

    const/16 v21, 0x0

    const/16 v60, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x0

    const/16 v107, 0x0

    const/16 v87, 0x0

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/4 v4, 0x0

    const-string v95, "\u06e1\u06df\u06e3"

    invoke-static/range {v95 .. v95}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v106

    move-object/from16 v95, v5

    move-object/from16 v98, v18

    move-object/from16 v99, v20

    move-object/from16 v100, v31

    move-object/from16 v101, v32

    move-object/from16 v102, v33

    :goto_0
    sparse-switch v106, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v5, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    if-gtz v5, :cond_2

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    const-string v5, "\u06e8\u06e3\u06e3"

    invoke-static {v5}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto :goto_0

    :sswitch_1
    sget v5, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v18, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    move/from16 v0, v18

    add-int/lit16 v0, v0, 0x1d7a

    move/from16 v18, v0

    mul-int v5, v5, v18

    if-gtz v5, :cond_0

    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    const-string v5, "\u06e7\u06e2\u06e2"

    invoke-static {v5}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v64, v80

    goto :goto_0

    :cond_0
    move-wide/from16 v32, v78

    move-wide/from16 v64, v80

    :goto_1
    const-string v5, "\u06e8\u06e0\u06e5"

    invoke-static {v5}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v78, v32

    goto :goto_0

    :sswitch_2
    const-string v5, "VN95kJw98pUblCPxxw==\n"

    const-string v18, "M7oN3+5th+E=\n"

    move-object/from16 v0, v18

    invoke-static {v5, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    move-result v5

    if-gtz v5, :cond_1

    const/16 v5, 0x10

    sput v5, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    :goto_2
    const-string v5, "\u06e4\u06e2\u06e1"

    :goto_3
    invoke-static {v5}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto :goto_0

    :cond_1
    const-string v5, "\u06e5\u06e6\u06e7"

    :goto_4
    invoke-static {v5}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto :goto_0

    :cond_2
    const-string v5, "\u06e7\u06e3\u06e5"

    :goto_5
    invoke-static {v5}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto :goto_0

    :sswitch_3
    :try_start_0
    invoke-static/range {v116 .. v117}, Ljava/lang/Math;->abs(D)D

    move-result-wide v32

    mul-double v32, v32, v8

    const-wide/high16 v142, 0x4059000000000000L    # 100.0

    div-double v32, v32, v142

    const-wide v142, 0x3fdae147ae147ae1L    # 0.42

    move-wide/from16 v0, v32

    move-wide/from16 v2, v142

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v32

    sget v5, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    if-ltz v5, :cond_3

    const-string v5, "\u06e5\u06e2\u06e3"

    invoke-static {v5}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v140, v32

    goto/16 :goto_0

    :cond_3
    sget v5, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v18, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    rem-int v5, v5, v18

    const v18, 0x1abd30

    add-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v140, v32

    goto/16 :goto_0

    :sswitch_4
    move/from16 v0, v61

    xor-int/lit16 v5, v0, -0x100

    and-int v5, v5, v61

    :try_start_1
    invoke-static {v5}, Lg80;->w(I)D
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-wide v84

    sget v5, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v18, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    move/from16 v0, v18

    add-int/lit16 v0, v0, 0x1c52

    move/from16 v18, v0

    div-int v5, v5, v18

    if-eqz v5, :cond_4

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    const-string v5, "\u06e7\u06e6\u06e6"

    invoke-static {v5}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_4
    move-wide/from16 v32, v82

    :cond_5
    const-string v5, "\u06e6\u06e5\u06df"

    move/from16 v18, v86

    move/from16 v20, v87

    move-wide/from16 v82, v32

    :goto_6
    invoke-static {v5}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v86, v18

    move/from16 v106, v5

    move/from16 v87, v20

    goto/16 :goto_0

    :sswitch_5
    move/from16 v0, v17

    xor-int/lit16 v5, v0, -0x100

    and-int v5, v5, v17

    :try_start_2
    invoke-static {v5}, Lg80;->w(I)D
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-result-wide v32

    sget v5, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v18, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    xor-int v5, v5, v18

    const v18, 0x1aa7a2

    add-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v120, v32

    goto/16 :goto_0

    :sswitch_6
    const-string v5, "\u06e4\u06e8\u06e1"

    invoke-static {v5}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v80, v34

    goto/16 :goto_0

    :sswitch_7
    mul-double v32, v72, v134

    const-wide v142, 0x3f9758e219652bd4L    # 0.0228

    mul-double v32, v32, v142

    :try_start_3
    invoke-static/range {v32 .. v33}, Ljava/lang/Math;->log1p(D)D
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    sget v5, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    if-gtz v5, :cond_6

    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    move v5, v10

    :goto_7
    const-string v10, "\u06e5\u06e7\u06e3"

    invoke-static {v10}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v18

    move/from16 v106, v18

    move v10, v5

    goto/16 :goto_0

    :cond_6
    sget v5, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v18, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    div-int v5, v5, v18

    const v18, 0x1ac1e6

    add-int v5, v5, v18

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_8
    sget v5, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v18, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    move/from16 v0, v18

    mul-int/lit16 v0, v0, -0x2118

    move/from16 v18, v0

    sub-int v5, v5, v18

    if-ltz v5, :cond_7

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    const-string v5, "\u06e3\u06e4\u06e4"

    invoke-static {v5}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u06e7\u06e6\u06e6"

    invoke-static {v5}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_9
    const-wide v32, 0x3fd5555555555555L    # 0.3333333333333333

    :try_start_4
    move-wide/from16 v0, v40

    move-wide/from16 v2, v32

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v18, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    move/from16 v0, v18

    mul-int/lit16 v0, v0, 0x843

    move/from16 v18, v0

    add-int v5, v5, v18

    if-ltz v5, :cond_8

    const-string v5, "\u06e2\u06e0\u06e0"

    invoke-static {v5}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_8
    move-wide/from16 v32, v62

    :goto_8
    const-string v5, "\u06e5\u06e1\u06e6"

    invoke-static {v5}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v62, v32

    goto/16 :goto_0

    :sswitch_a
    sget v5, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v18, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    mul-int/lit8 v18, v18, 0x14

    mul-int v5, v5, v18

    if-ltz v5, :cond_a

    :cond_9
    const-string v5, "\u06e6\u06e4\u06e3"

    :goto_9
    invoke-static {v5}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_a
    sget v5, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v18, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    mul-int v5, v5, v18

    const v18, 0x194944

    add-int v5, v5, v18

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_b
    const-wide v32, 0x3feccccccccccccdL    # 0.9

    :try_start_5
    move-wide/from16 v0, v130

    move-wide/from16 v2, v32

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    move-result-wide v32

    mul-double v32, v32, v136

    sget v5, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v18, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    move/from16 v0, v18

    mul-int/lit16 v0, v0, 0x13ec

    move/from16 v18, v0

    mul-int v5, v5, v18

    if-gtz v5, :cond_b

    const/16 v5, 0x4f

    sput v5, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    const-string v5, "\u06df\u06e0\u06e5"

    invoke-static {v5}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v128, v32

    goto/16 :goto_0

    :cond_b
    sget v5, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v18, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    mul-int v5, v5, v18

    const v18, 0x1c451f

    add-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v128, v32

    goto/16 :goto_0

    :sswitch_c
    :try_start_6
    move-wide/from16 v0, v54

    move-wide/from16 v2, v44

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v32

    invoke-static/range {v32 .. v33}, Ljava/lang/Math;->toDegrees(D)D
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    move-result-wide v36

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v18, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    move/from16 v0, v18

    xor-int/lit16 v0, v0, -0xb13

    move/from16 v18, v0

    rem-int v5, v5, v18

    if-ltz v5, :cond_c

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    const-string v5, "\u06e1\u06e7\u06e2"

    invoke-static {v5}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_c
    sget v5, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v18, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sub-int v5, v5, v18

    const v18, 0x1ac131

    xor-int v5, v5, v18

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_d
    sget v4, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    if-ltz v4, :cond_e

    move-object/from16 v4, v16

    move/from16 v5, v17

    :cond_d
    const-string v17, "\u06e5\u06e1\u06e5"

    move-object/from16 v18, v17

    move/from16 v20, v5

    :goto_a
    invoke-static/range {v18 .. v18}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v20

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_e
    sget v4, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v5, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sub-int/2addr v4, v5

    const v5, 0x1ac770

    xor-int/2addr v5, v4

    move-object/from16 v4, v16

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_e
    :try_start_7
    move-object/from16 v0, v103

    iget-wide v12, v0, Lkb0;->d:D
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    sget v5, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v18, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    move/from16 v0, v18

    add-int/lit16 v0, v0, 0x3d9

    move/from16 v18, v0

    add-int v5, v5, v18

    if-gtz v5, :cond_9

    const-string v5, "\u06e8\u06e8\u06df"

    invoke-static {v5}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_f
    const-wide/high16 v32, 0x4049000000000000L    # 50.0

    :try_start_8
    move-wide/from16 v0, v72

    move-wide/from16 v2, v32

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v32

    move-wide/from16 v0, v34

    move-wide/from16 v2, v32

    invoke-static {v0, v1, v2, v3}, Lh70;->a(DD)Lh70;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    move-result-object v18

    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    move-result v5

    if-ltz v5, :cond_f

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    const-string v5, "\u06e8\u06e8\u06e2"

    :goto_b
    invoke-static {v5}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v21, v18

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_f
    const-string v5, "\u06e5\u06e8\u06e2"

    invoke-static {v5}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v21, v18

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_10
    const-wide v32, 0x3fc71af7273e5d5eL    # 0.18051042

    mul-double v32, v32, v52

    const-wide/16 v42, 0x0

    const-wide v142, 0x3fd6e341ae4b2c79L    # 0.35762064

    mul-double v142, v142, v138

    const-wide/16 v144, 0x0

    const-wide v146, 0x3fda63c2e8477c96L    # 0.41233895

    mul-double v146, v146, v68

    sub-double v144, v144, v146

    sub-double v142, v142, v144

    sub-double v42, v42, v142

    sub-double v32, v32, v42

    sget v5, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    if-gtz v5, :cond_10

    const-string v5, "\u06e5\u06e0\u06e4"

    invoke-static {v5}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v42, v32

    goto/16 :goto_0

    :cond_10
    const-string v5, "\u06df\u06e5\u06df"

    :goto_c
    invoke-static {v5}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v42, v32

    goto/16 :goto_0

    :sswitch_11
    :try_start_9
    invoke-static/range {v90 .. v91}, Ljava/lang/Math;->abs(D)D

    move-result-wide v32

    mul-double v32, v32, v8

    const-wide/high16 v142, 0x4059000000000000L    # 100.0

    div-double v32, v32, v142

    const-wide v142, 0x3fdae147ae147ae1L    # 0.42

    move-wide/from16 v0, v32

    move-wide/from16 v2, v142

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    move-result-wide v32

    sget v5, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v18, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    mul-int v5, v5, v18

    const v18, -0x1abba2

    xor-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v122, v32

    goto/16 :goto_0

    :sswitch_12
    const/4 v5, 0x2

    :try_start_a
    aget-wide v32, v98, v5
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    move-result v5

    if-gtz v5, :cond_11

    invoke-static {}, Lcom/google/android/material/button/ۥۤ۠;->۠۠ۨۢ()I

    const-string v5, "\u06df\u06e7\u06e4"

    invoke-static {v5}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v114, v32

    goto/16 :goto_0

    :cond_11
    sget v5, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v18, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    or-int v5, v5, v18

    const v18, -0x1abe0c

    xor-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v114, v32

    goto/16 :goto_0

    :sswitch_13
    const/4 v5, 0x2

    :try_start_b
    aget-wide v32, v99, v5
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    move-result v5

    if-ltz v5, :cond_12

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    const-string v5, "\u06e7\u06e6\u06e0"

    invoke-static {v5}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v92, v32

    goto/16 :goto_0

    :cond_12
    const-string v5, "\u06df\u06df\u06e4"

    :goto_d
    invoke-static {v5}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v92, v32

    goto/16 :goto_0

    :cond_13
    :sswitch_14
    const-string v5, "\u06e3\u06e4\u06e4"

    invoke-static {v5}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_15
    shr-int/lit8 v5, v86, 0x8

    sget v17, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    if-ltz v17, :cond_d

    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    const-string v17, "\u06e5\u06e8\u06e0"

    invoke-static/range {v17 .. v17}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v18

    move/from16 v17, v5

    move/from16 v106, v18

    goto/16 :goto_0

    :cond_14
    :sswitch_16
    const-string v5, "\u06e5\u06e1\u06e6"

    invoke-static {v5}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_15
    :sswitch_17
    sget v5, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v18, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    move/from16 v0, v18

    add-int/lit16 v0, v0, 0x2653

    move/from16 v18, v0

    xor-int v5, v5, v18

    if-ltz v5, :cond_16

    const/16 v5, 0x57

    sput v5, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    const-string v5, "\u06df\u06e6\u06e8"

    :goto_e
    invoke-static {v5}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_16
    sget v5, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v18, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    or-int v5, v5, v18

    const v18, -0x1aae02

    xor-int v5, v5, v18

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_18
    sget v5, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    if-ltz v5, :cond_17

    const-string v20, "\u06e8\u06e1\u06e0"

    move-object/from16 v5, v28

    move-object/from16 v18, v29

    move-object/from16 v32, v4

    :goto_f
    invoke-static/range {v20 .. v20}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v28, v5

    move-object/from16 v29, v18

    move-object/from16 v4, v32

    move/from16 v106, v20

    goto/16 :goto_0

    :cond_17
    sget v5, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v18, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    or-int v5, v5, v18

    const v18, 0x1ab754

    xor-int v5, v5, v18

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_19
    if-nez v30, :cond_25

    sget v5, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v18, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    move/from16 v0, v18

    xor-int/lit16 v0, v0, -0xb4

    move/from16 v18, v0

    div-int v5, v5, v18

    if-eqz v5, :cond_18

    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    const-string v5, "\u06e7\u06df\u06e1"

    invoke-static {v5}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_18
    const-string v5, "\u06e1\u06e0\u06e3"

    invoke-static {v5}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_1a
    const/4 v5, 0x0

    :try_start_c
    aget-wide v6, v100, v5
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    goto/16 :goto_2

    :sswitch_1b
    const-string v5, "\u06e2\u06e4\u06e0"

    invoke-static {v5}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move/from16 v87, v107

    goto/16 :goto_0

    :sswitch_1c
    const-wide v32, 0x3f822354d28f7cd6L    # 0.008856451679035631

    cmpl-double v5, v40, v32

    if-lez v5, :cond_14

    sget v5, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    if-gtz v5, :cond_1a

    const/16 v5, 0x4b

    sput v5, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    move-wide/from16 v32, v38

    :cond_19
    const-string v5, "\u06e8\u06e5\u06e5"

    move-wide/from16 v38, v32

    :goto_10
    invoke-static {v5}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_1a
    const-string v5, "\u06e7\u06e2\u06df"

    invoke-static {v5}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_1d
    :try_start_d
    invoke-static/range {v34 .. v35}, Ljava/lang/Math;->toRadians(D)D
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0

    move-result-wide v32

    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    move-result v5

    if-ltz v5, :cond_19

    const/16 v5, 0x58

    sput v5, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    const-string v5, "\u06e1\u06e5\u06e6"

    invoke-static {v5}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v38, v32

    goto/16 :goto_0

    :sswitch_1e
    const/4 v5, 0x1

    :try_start_e
    aget-object v5, v102, v5
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0

    sget v18, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v20, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    rem-int v18, v18, v20

    const v20, 0x1aae57

    add-int v18, v18, v20

    move-object/from16 v99, v5

    move/from16 v106, v18

    goto/16 :goto_0

    :sswitch_1f
    :try_start_f
    move-object/from16 v0, v103

    iget-wide v0, v0, Lkb0;->i:D

    move-wide/from16 v32, v0
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_0

    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    move-result v5

    if-ltz v5, :cond_1b

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟ۡۡۦ()I

    const-string v5, "\u06e0\u06e3\u06e4"

    invoke-static {v5}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v134, v32

    goto/16 :goto_0

    :cond_1b
    sget v5, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v18, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    div-int v5, v5, v18

    const v18, 0xdcfd

    add-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v134, v32

    goto/16 :goto_0

    :sswitch_20
    sget v5, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v18, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    move/from16 v0, v18

    add-int/lit16 v0, v0, -0xe4e

    move/from16 v18, v0

    or-int v5, v5, v18

    if-ltz v5, :cond_1c

    const/16 v5, 0x5c

    sput v5, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    const-string v5, "\u06e3\u06e0"

    move-wide/from16 v32, v42

    goto/16 :goto_c

    :cond_1c
    sget v5, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v18, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    xor-int v5, v5, v18

    const v18, 0x1abe3c

    add-int v5, v5, v18

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_21
    const-wide v32, 0x3ffa3d70a3d70a3dL    # 1.64

    const-wide/high16 v142, 0x4000000000000000L    # 2.0

    sub-double v32, v32, v142

    const-wide v142, 0x3fd28f5c28f5c28fL    # 0.29

    :try_start_10
    move-object/from16 v0, v103

    iget-wide v0, v0, Lkb0;->f:D

    move-wide/from16 v144, v0

    invoke-static/range {v142 .. v145}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v142

    sub-double v32, v32, v142

    const-wide/high16 v142, 0x4000000000000000L    # 2.0

    add-double v32, v32, v142

    const-wide v142, 0x3fe75c28f5c28f5cL    # 0.73

    move-wide/from16 v0, v32

    move-wide/from16 v2, v142

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_0

    move-result-wide v32

    sget v5, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v18, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    move/from16 v0, v18

    or-int/lit16 v0, v0, -0x181d

    move/from16 v18, v0

    or-int v5, v5, v18

    if-ltz v5, :cond_1d

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    const-string v5, "\u06e7\u06e3\u06e3"

    invoke-static {v5}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v136, v32

    goto/16 :goto_0

    :cond_1d
    sget v5, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v18, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    add-int v5, v5, v18

    const v18, 0x1aba56

    add-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v136, v32

    goto/16 :goto_0

    :sswitch_22
    const/4 v5, 0x3

    :try_start_11
    new-array v5, v5, [D

    const/16 v18, 0x0

    aput-wide v84, v5, v18

    const/16 v18, 0x1

    aput-wide v120, v5, v18

    const/16 v18, 0x2

    aput-wide v126, v5, v18

    move-object/from16 v0, v94

    invoke-static {v5, v0}, Lmu;->u([D[[D)[D

    move-result-object v5

    const/16 v18, 0x1

    aget-wide v32, v5, v18
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_0

    const-wide/high16 v40, 0x4059000000000000L    # 100.0

    div-double v32, v32, v40

    const-string v5, "\u06e0\u06e7\u06e8"

    move-wide/from16 v40, v32

    goto/16 :goto_10

    :sswitch_23
    const-wide v32, 0x403423d70a3d70a4L    # 20.14

    cmpg-double v5, v34, v32

    if-gez v5, :cond_13

    const-wide/16 v32, 0x0

    const-wide v66, 0x4076800000000000L    # 360.0

    sub-double v32, v32, v66

    sub-double v66, v34, v32

    sget v5, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v18, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    move/from16 v0, v18

    xor-int/lit16 v0, v0, -0x641

    move/from16 v18, v0

    or-int v5, v5, v18

    if-ltz v5, :cond_1e

    const-string v5, "\u06e5\u06df\u06e5"

    invoke-static {v5}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_1e
    const-string v5, "\u06df\u06e7\u06e4"

    move-wide/from16 v32, v72

    :goto_11
    invoke-static {v5}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v72, v32

    goto/16 :goto_0

    :sswitch_24
    :try_start_12
    sget-object v5, Lg80;->b:[[D
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_0

    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    move-result v18

    if-gtz v18, :cond_1f

    const/16 v18, 0x36

    sput v18, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    const-string v18, "\u06e2\u06e6\u06e5"

    invoke-static/range {v18 .. v18}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v18

    move-object/from16 v94, v5

    move/from16 v106, v18

    goto/16 :goto_0

    :cond_1f
    move-wide/from16 v32, v96

    :goto_12
    const-string v18, "\u06e8\u06e5\u06e0"

    invoke-static/range {v18 .. v18}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v18

    move-object/from16 v94, v5

    move/from16 v106, v18

    move-wide/from16 v96, v32

    goto/16 :goto_0

    :sswitch_25
    sget v5, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v18, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    move/from16 v0, v18

    add-int/lit16 v0, v0, -0x265b

    move/from16 v18, v0

    sub-int v5, v5, v18

    if-gtz v5, :cond_20

    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    const-string v5, "\u06df\u06e7\u06e0"

    invoke-static {v5}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_20
    const-string v5, "\u06e5\u06e7\u06e3"

    move-wide/from16 v32, v74

    :goto_13
    invoke-static {v5}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v74, v32

    goto/16 :goto_0

    :sswitch_26
    mul-double v32, v128, v12

    const-wide/16 v142, 0x0

    const-wide/high16 v144, 0x4010000000000000L    # 4.0

    sub-double v142, v142, v144

    sub-double v142, v124, v142

    div-double v32, v32, v142

    :try_start_13
    invoke-static/range {v32 .. v33}, Ljava/lang/Math;->sqrt(D)D
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_0

    sget v5, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    if-gtz v5, :cond_21

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    const-string v5, "\u06e2\u06e4\u06e0"

    invoke-static {v5}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_21
    sget v5, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v18, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    div-int v5, v5, v18

    const v18, 0xdca0

    add-int v5, v5, v18

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_27
    :try_start_14
    invoke-static/range {v64 .. v65}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v32

    const-wide/high16 v142, 0x4035000000000000L    # 21.0

    add-double v32, v32, v142

    const-wide/high16 v142, 0x4000000000000000L    # 2.0

    add-double v32, v32, v142

    const-wide/high16 v142, 0x4035000000000000L    # 21.0

    sub-double v32, v32, v142

    invoke-static/range {v32 .. v33}, Ljava/lang/Math;->cos(D)D
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_0

    move-result-wide v32

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v5

    if-ltz v5, :cond_22

    const-string v5, "\u06e4\u06e3\u06e0"

    invoke-static {v5}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v88, v32

    goto/16 :goto_0

    :cond_22
    const-string v5, "\u06e2\u06e4\u06e5"

    move/from16 v18, v86

    move/from16 v20, v87

    move-wide/from16 v88, v32

    goto/16 :goto_6

    :sswitch_28
    invoke-virtual/range {v95 .. v95}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    sget-object v5, Li6;->a:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v0, v18

    invoke-virtual {v5, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v31

    sget v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    if-ltz v4, :cond_23

    const-string v4, "\u06e4\u06e0"

    invoke-static {v4}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v28, v5

    move-object/from16 v29, v18

    move-object/from16 v30, v31

    move-object/from16 v4, v31

    move/from16 v106, v20

    goto/16 :goto_0

    :cond_23
    const-string v4, "\u06e6\u06e1"

    move-object/from16 v20, v4

    move-object/from16 v30, v31

    move-object/from16 v32, v31

    goto/16 :goto_f

    :sswitch_29
    :try_start_15
    sget-object v5, Lkb0;->k:Lkb0;
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_0

    sget v18, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v20, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    add-int v18, v18, v20

    const v20, 0x1ab5a2

    add-int v18, v18, v20

    move-object/from16 v103, v5

    move/from16 v106, v18

    goto/16 :goto_0

    :sswitch_2a
    :try_start_16
    move-object/from16 v0, v103

    iget-wide v8, v0, Lkb0;->h:D
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_0

    sget v5, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v18, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    move/from16 v0, v18

    rem-int/lit16 v0, v0, -0xf79

    move/from16 v18, v0

    div-int v5, v5, v18

    if-eqz v5, :cond_24

    const-string v5, "\u06e5\u06e8\u06e1"

    invoke-static {v5}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_24
    const-string v5, "\u06e3\u06e5\u06e5"

    goto/16 :goto_3

    :cond_25
    :sswitch_2b
    sget v5, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v18, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    move/from16 v0, v18

    xor-int/lit16 v0, v0, -0x346

    move/from16 v18, v0

    xor-int v5, v5, v18

    if-ltz v5, :cond_26

    const-string v5, "\u06e1\u06e3\u06e7"

    move-wide/from16 v32, v44

    :goto_14
    invoke-static {v5}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v44, v32

    goto/16 :goto_0

    :cond_26
    const-string v5, "\u06e7\u06e0\u06e2"

    goto/16 :goto_e

    :sswitch_2c
    sget v5, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v18, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    move/from16 v0, v18

    div-int/lit16 v0, v0, -0x1b9f

    move/from16 v18, v0

    or-int v5, v5, v18

    if-gtz v5, :cond_27

    move-wide/from16 v32, v46

    move-wide/from16 v34, v48

    :goto_15
    const-string v5, "\u06e1\u06e4\u06e6"

    invoke-static {v5}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v46, v32

    goto/16 :goto_0

    :cond_27
    const-string v5, "\u06df\u06e0\u06e5"

    invoke-static {v5}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v34, v48

    goto/16 :goto_0

    :sswitch_2d
    const/4 v5, 0x1

    :try_start_17
    aget-wide v32, v101, v5
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_0

    mul-double v118, v14, v112

    const-wide/16 v142, 0x0

    mul-double v144, v82, v42

    sub-double v142, v142, v144

    sub-double v118, v118, v142

    const-wide/16 v142, 0x0

    mul-double v144, v92, v110

    sub-double v142, v142, v144

    sub-double v118, v118, v142

    mul-double v32, v32, v118

    sget v5, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v18, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    xor-int v5, v5, v18

    const v18, 0x1ab061

    xor-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v118, v32

    goto/16 :goto_0

    :sswitch_2e
    :try_start_18
    invoke-static/range {v105 .. v105}, Lg80;->w(I)D
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_0

    move-result-wide v52

    sget v5, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v18, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    move/from16 v0, v18

    add-int/lit16 v0, v0, -0x806

    move/from16 v18, v0

    add-int v5, v5, v18

    if-ltz v5, :cond_28

    const/16 v5, 0x1c

    sput v5, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    const-string v5, "\u06e0\u06e5\u06e7"

    move-wide/from16 v32, v50

    :goto_16
    invoke-static {v5}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v50, v32

    goto/16 :goto_0

    :cond_28
    const-string v5, "\u06e5\u06e4\u06e3"

    move-wide/from16 v32, v68

    :goto_17
    invoke-static {v5}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v68, v32

    goto/16 :goto_0

    :sswitch_2f
    const-wide/high16 v32, 0x4030000000000000L    # 16.0

    sub-double v32, v70, v32

    add-double v32, v32, v96

    const-wide/high16 v54, 0x4030000000000000L    # 16.0

    add-double v32, v32, v54

    const-wide/high16 v54, 0x4031000000000000L    # 17.0

    sub-double v32, v32, v54

    const-wide/high16 v54, 0x4000000000000000L    # 2.0

    mul-double v54, v54, v78

    sub-double v32, v32, v54

    const-wide/high16 v54, 0x4031000000000000L    # 17.0

    add-double v32, v32, v54

    const-wide/high16 v54, 0x4022000000000000L    # 9.0

    div-double v32, v32, v54

    sget v5, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v18, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    move/from16 v0, v18

    add-int/lit16 v0, v0, 0x1905

    move/from16 v18, v0

    or-int v5, v5, v18

    if-gtz v5, :cond_29

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    :goto_18
    const-string v5, "\u06e1\u06e2\u06df"

    invoke-static {v5}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v54, v32

    goto/16 :goto_0

    :cond_29
    sget v5, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v18, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    div-int v5, v5, v18

    const v18, 0x1ac90b

    add-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v54, v32

    goto/16 :goto_0

    :cond_2a
    :sswitch_30
    sget v5, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v18, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    move/from16 v0, v18

    add-int/lit16 v0, v0, 0x1cda

    move/from16 v18, v0

    div-int v5, v5, v18

    if-eqz v5, :cond_2b

    const/16 v5, 0x46

    sput v5, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    const-string v5, "\u06e4\u06e1\u06e2"

    move-wide/from16 v32, v58

    :goto_19
    invoke-static {v5}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v58, v32

    goto/16 :goto_0

    :cond_2b
    const-string v5, "\u06df\u06e0\u06e5"

    invoke-static {v5}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_31
    const/4 v5, 0x2

    :try_start_19
    aget-wide v32, v101, v5
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_0

    mul-double v116, v112, v62

    const-wide/high16 v142, 0x4032000000000000L    # 18.0

    add-double v116, v116, v142

    mul-double v142, v42, v6

    add-double v116, v116, v142

    const-wide/high16 v142, 0x4032000000000000L    # 18.0

    sub-double v116, v116, v142

    const-wide/16 v142, 0x0

    mul-double v144, v110, v108

    sub-double v142, v142, v144

    sub-double v116, v116, v142

    mul-double v32, v32, v116

    sget v5, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v18, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    add-int v5, v5, v18

    const v18, 0x1ab3be

    add-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v116, v32

    goto/16 :goto_0

    :sswitch_32
    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    move-result v5

    if-gtz v5, :cond_2c

    const/16 v5, 0x49

    sput v5, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    const-string v5, "\u06e7\u06e0\u06e2"

    move/from16 v10, v60

    move/from16 v18, v60

    :goto_1a
    invoke-static {v5}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move/from16 v60, v18

    goto/16 :goto_0

    :cond_2c
    sget v5, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v10, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    mul-int/2addr v5, v10

    const v10, 0x223c8

    sub-int/2addr v5, v10

    move/from16 v106, v5

    move/from16 v10, v60

    goto/16 :goto_0

    :cond_2d
    :sswitch_33
    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    move-result v5

    if-ltz v5, :cond_2e

    const/16 v5, 0x4b

    sput v5, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    const-string v5, "\u06e2\u06e0\u06e2"

    invoke-static {v5}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_2e
    const-string v5, "\u06e8\u06e8\u06df"

    :goto_1b
    invoke-static {v5}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_34
    const/4 v5, 0x1

    :try_start_1a
    aget-wide v32, v98, v5
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_0

    sget v5, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v18, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    move/from16 v0, v18

    rem-int/lit16 v0, v0, -0xb69

    move/from16 v18, v0

    sub-int v5, v5, v18

    if-gtz v5, :cond_2f

    const/16 v5, 0x47

    sput v5, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    move/from16 v5, v61

    :goto_1c
    const-string v18, "\u06df\u06e4\u06e5"

    invoke-static/range {v18 .. v18}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v18

    move/from16 v61, v5

    move/from16 v106, v18

    move-wide/from16 v50, v32

    goto/16 :goto_0

    :cond_2f
    const-string v5, "\u06e6\u06e7\u06e6"

    goto/16 :goto_16

    :sswitch_35
    const/4 v5, 0x1

    :try_start_1b
    aget-wide v32, v100, v5
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_0

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    move-result v5

    if-ltz v5, :cond_30

    const/4 v5, 0x4

    sput v5, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    goto/16 :goto_8

    :cond_30
    sget v5, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v18, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    xor-int v5, v5, v18

    const v18, 0x1ac811

    add-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v62, v32

    goto/16 :goto_0

    :sswitch_36
    if-eqz v104, :cond_2d

    const/16 v60, 0x50

    const-string v5, "\u06e6\u06e5\u06e1"

    move/from16 v18, v60

    goto/16 :goto_1a

    :catch_0
    move-exception v5

    const-string v5, "N20EEFJYkg==\n"

    const-string v18, "FF00UWYe1Ek=\n"

    move-object/from16 v0, v18

    invoke-static {v5, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v20

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v18, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    move/from16 v0, v18

    mul-int/lit16 v0, v0, -0x615

    move/from16 v18, v0

    add-int v5, v5, v18

    if-ltz v5, :cond_31

    const-string v5, "\u06e5\u06e0\u06e2"

    invoke-static {v5}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move/from16 v87, v20

    goto/16 :goto_0

    :cond_31
    const-string v5, "\u06e0\u06e5\u06e6"

    move/from16 v18, v86

    goto/16 :goto_6

    :sswitch_37
    const-wide v32, 0x4076800000000000L    # 360.0

    cmpl-double v5, v36, v32

    if-ltz v5, :cond_2a

    const-wide/high16 v32, 0x402a000000000000L    # 13.0

    add-double v32, v32, v36

    const-wide v48, 0x4076800000000000L    # 360.0

    sub-double v32, v32, v48

    const-wide/high16 v48, 0x402a000000000000L    # 13.0

    sub-double v48, v32, v48

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-result v5

    if-ltz v5, :cond_32

    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    const-string v5, "\u06e8\u06e3\u06e2"

    invoke-static {v5}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_32
    sget v5, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v18, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    xor-int v5, v5, v18

    const v18, 0x1acbbf

    add-int v5, v5, v18

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_38
    const/4 v5, 0x2

    :try_start_1c
    aget-object v5, v102, v5
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_0

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    move-result v18

    if-ltz v18, :cond_33

    const/16 v18, 0x15

    sput v18, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    const-string v18, "\u06e1\u06e7\u06e8"

    invoke-static/range {v18 .. v18}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v18

    move-object/from16 v100, v5

    move/from16 v106, v18

    goto/16 :goto_0

    :cond_33
    const-string v18, "\u06e3\u06e5\u06df"

    invoke-static/range {v18 .. v18}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v18

    move-object/from16 v100, v5

    move/from16 v106, v18

    goto/16 :goto_0

    :sswitch_39
    const-wide/high16 v24, 0x4034000000000000L    # 20.0

    mul-double v24, v24, v96

    const-string v5, "\u06e4\u06e3\u06e0"

    move-object/from16 v18, v21

    goto/16 :goto_b

    :sswitch_3a
    :try_start_1d
    sget-object v5, Lg80;->a:[[D
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_0

    sget v18, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    if-ltz v18, :cond_34

    const-string v18, "\u06e6\u06e1"

    invoke-static/range {v18 .. v18}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v18

    move-object/from16 v102, v5

    move/from16 v106, v18

    goto/16 :goto_0

    :cond_34
    sget v18, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v20, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    xor-int v18, v18, v20

    const v20, 0x1aad22

    add-int v18, v18, v20

    move-object/from16 v102, v5

    move/from16 v106, v18

    goto/16 :goto_0

    :sswitch_3b
    :try_start_1e
    move-object/from16 v0, v103

    iget-wide v0, v0, Lkb0;->b:D

    move-wide/from16 v32, v0

    mul-double v32, v32, v26

    div-double v32, v32, v124

    move-object/from16 v0, v103

    iget-wide v0, v0, Lkb0;->j:D

    move-wide/from16 v142, v0

    mul-double v142, v142, v12

    move-wide/from16 v0, v32

    move-wide/from16 v2, v142

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_0

    move-result-wide v32

    const-wide/high16 v58, 0x4059000000000000L    # 100.0

    mul-double v32, v32, v58

    const-wide/high16 v58, 0x4059000000000000L    # 100.0

    div-double v32, v32, v58

    const-string v5, "\u06e0\u06e5\u06e7"

    goto/16 :goto_19

    :sswitch_3c
    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    return v4

    :sswitch_3d
    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    move-result v5

    if-gtz v5, :cond_35

    const-string v5, "\u06e5\u06e6\u06df"

    goto/16 :goto_4

    :cond_35
    sget v5, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v18, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    div-int v5, v5, v18

    const v18, 0x1aae85

    add-int v5, v5, v18

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_3e
    :try_start_1f
    invoke-static/range {v38 .. v39}, Ljava/lang/Math;->cos(D)D
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_0

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    move-result v5

    if-ltz v5, :cond_36

    const-string v5, "\u06e3\u06e2\u06e5"

    invoke-static {v5}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_36
    const-string v5, "\u06e7\u06df\u06e1"

    move-wide/from16 v32, v90

    :goto_1d
    invoke-static {v5}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v90, v32

    goto/16 :goto_0

    :sswitch_3f
    :try_start_20
    invoke-static/range {v38 .. v39}, Ljava/lang/Math;->sin(D)D
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_0

    shr-int/lit8 v5, v86, 0x10

    move-wide/from16 v32, v50

    goto/16 :goto_1c

    :sswitch_40
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lsn;->p:Z

    move/from16 v18, v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p1

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v20, "_"

    move-object/from16 v0, v20

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v0, v18

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    sget v20, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v31, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    move/from16 v0, v31

    mul-int/lit16 v0, v0, -0x2584

    move/from16 v31, v0

    sub-int v20, v20, v31

    if-gtz v20, :cond_37

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    const-string v20, "\u06e1\u06df\u06e3"

    invoke-static/range {v20 .. v20}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v95, v5

    move/from16 v104, v18

    move/from16 v106, v20

    goto/16 :goto_0

    :cond_37
    sget v20, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v31, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    add-int v20, v20, v31

    const v31, 0xde13

    add-int v20, v20, v31

    move-object/from16 v95, v5

    move/from16 v104, v18

    move/from16 v106, v20

    goto/16 :goto_0

    :sswitch_41
    const/16 v11, 0x2d

    sget v5, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    if-gtz v5, :cond_38

    :cond_38
    const-string v5, "\u06e7\u06e0\u06e5"

    invoke-static {v5}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_42
    const-wide/high16 v32, -0x3fd8000000000000L    # -12.0

    mul-double v32, v32, v96

    const-wide/high16 v44, 0x3ff0000000000000L    # 1.0

    add-double v32, v32, v44

    const-wide/high16 v44, 0x4026000000000000L    # 11.0

    mul-double v44, v44, v70

    add-double v32, v32, v44

    const-wide/high16 v44, 0x3ff0000000000000L    # 1.0

    sub-double v32, v32, v44

    const-wide/high16 v44, 0x4018000000000000L    # 6.0

    sub-double v32, v32, v44

    add-double v32, v32, v78

    const-wide/high16 v44, 0x4018000000000000L    # 6.0

    add-double v32, v32, v44

    const-wide/high16 v44, 0x4026000000000000L    # 11.0

    div-double v32, v32, v44

    const-string v5, "\u06e4\u06e8\u06df"

    goto/16 :goto_14

    :sswitch_43
    const/4 v5, 0x2

    :try_start_21
    aget-wide v32, v100, v5
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_0

    sget v5, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v18, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    move/from16 v0, v18

    rem-int/lit16 v0, v0, 0x1ecd

    move/from16 v18, v0

    sub-int v5, v5, v18

    if-ltz v5, :cond_39

    const/16 v5, 0x44

    sput v5, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    const-string v5, "\u06e7\u06df\u06e8"

    invoke-static {v5}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v108, v32

    goto/16 :goto_0

    :cond_39
    sget v5, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v18, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    div-int v5, v5, v18

    const v18, 0x1aba49

    add-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v108, v32

    goto/16 :goto_0

    :sswitch_44
    sget v5, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    if-gtz v5, :cond_3a

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    const-string v5, "\u06e6\u06df\u06e0"

    goto/16 :goto_1b

    :cond_3a
    const-string v5, "\u06e1\u06e0\u06e3"

    goto/16 :goto_4

    :sswitch_45
    :try_start_22
    invoke-static/range {v90 .. v91}, Ljava/lang/Math;->signum(D)D
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_0

    move-result-wide v32

    const-wide/high16 v70, 0x4079000000000000L    # 400.0

    mul-double v32, v32, v70

    mul-double v32, v32, v122

    const-wide/high16 v70, 0x4014000000000000L    # 5.0

    sub-double v70, v122, v70

    const-wide v142, 0x403b2147ae147ae1L    # 27.13

    add-double v70, v70, v142

    const-wide/high16 v142, 0x4014000000000000L    # 5.0

    add-double v70, v70, v142

    div-double v32, v32, v70

    :goto_1e
    const-string v5, "\u06e8\u06e6\u06e3"

    invoke-static {v5}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v70, v32

    goto/16 :goto_0

    :sswitch_46
    const-wide/high16 v26, 0x4044000000000000L    # 40.0

    mul-double v26, v26, v70

    const-wide/high16 v32, 0x402a000000000000L    # 13.0

    sub-double v26, v26, v32

    add-double v26, v26, v24

    const-wide/high16 v32, 0x402a000000000000L    # 13.0

    add-double v26, v26, v32

    const-wide/high16 v32, 0x4000000000000000L    # 2.0

    sub-double v26, v26, v32

    add-double v26, v26, v78

    const-wide/high16 v32, 0x4000000000000000L    # 2.0

    add-double v26, v26, v32

    const-wide/high16 v32, 0x4034000000000000L    # 20.0

    div-double v26, v26, v32

    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    move-result v5

    if-ltz v5, :cond_3b

    move-wide/from16 v32, v64

    :goto_1f
    const-string v5, "\u06e5\u06e3"

    invoke-static {v5}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v64, v32

    goto/16 :goto_0

    :cond_3b
    const-string v5, "\u06e0\u06e3\u06e4"

    goto/16 :goto_e

    :sswitch_47
    :try_start_23
    invoke-static/range {v58 .. v59}, Ljava/lang/Math;->sqrt(D)D
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_0

    const-string v5, "\u06e0\u06e2\u06e5"

    :goto_20
    invoke-static {v5}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_48
    const/high16 v5, 0xff0000

    xor-int/lit8 v18, v86, -0x1

    const/high16 v20, 0xff0000

    xor-int v18, v18, v20

    and-int v5, v5, v18

    shr-int/lit8 v5, v5, 0x10

    :try_start_24
    invoke-static {v5}, Lg80;->w(I)D
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_0

    move-result-wide v32

    sget v5, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v18, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    move/from16 v0, v18

    rem-int/lit16 v0, v0, -0x1c9b

    move/from16 v18, v0

    add-int v5, v5, v18

    if-gtz v5, :cond_3c

    const-string v5, "\u06e0\u06e2\u06e5"

    goto/16 :goto_17

    :cond_3c
    sget v5, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v18, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    xor-int v5, v5, v18

    const v18, 0x1ac197

    add-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v68, v32

    goto/16 :goto_0

    :sswitch_49
    const-wide/16 v32, 0x0

    cmpg-double v5, v36, v32

    if-gez v5, :cond_15

    const-wide/16 v32, 0x0

    const-wide v56, 0x4076800000000000L    # 360.0

    sub-double v32, v32, v56

    sub-double v56, v36, v32

    sget v5, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    if-gtz v5, :cond_3d

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    const-string v5, "\u06e3\u06e2\u06df"

    goto/16 :goto_5

    :cond_3d
    move-wide/from16 v32, v54

    goto/16 :goto_18

    :sswitch_4a
    const/4 v5, 0x0

    :try_start_25
    aget-wide v22, v98, v5
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_0

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    move-result v5

    if-ltz v5, :cond_3e

    const-string v5, "\u06e6\u06e5\u06e1"

    invoke-static {v5}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_3e
    const-string v5, "\u06df\u06e8\u06e8"

    move-object/from16 v18, v5

    move/from16 v20, v17

    goto/16 :goto_a

    :sswitch_4b
    sget v5, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v18, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    move/from16 v0, v18

    or-int/lit16 v0, v0, -0x192b

    move/from16 v18, v0

    rem-int v5, v5, v18

    if-gtz v5, :cond_3f

    const/16 v5, 0x4d

    sput v5, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    move-wide/from16 v32, v70

    move-wide/from16 v34, v36

    goto/16 :goto_1e

    :cond_3f
    const-string v20, "\u06e1\u06e7\u06e2"

    move-object/from16 v5, v28

    move-object/from16 v18, v29

    move-object/from16 v32, v4

    move-wide/from16 v34, v36

    goto/16 :goto_f

    :sswitch_4c
    :try_start_26
    move-object/from16 v0, v103

    iget-wide v0, v0, Lkb0;->e:D

    move-wide/from16 v32, v0

    goto/16 :goto_15

    :sswitch_4d
    invoke-static/range {v58 .. v59}, Ljava/lang/Math;->sqrt(D)D
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_26} :catch_0

    move-result-wide v32

    mul-double v32, v32, v128

    sget v5, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v18, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    move/from16 v0, v18

    mul-int/lit16 v0, v0, 0xb11

    move/from16 v18, v0

    sub-int v5, v5, v18

    if-ltz v5, :cond_40

    const/16 v5, 0x28

    sput v5, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    const-string v5, "\u06e0\u06e2\u06e6"

    goto/16 :goto_11

    :cond_40
    const-string v5, "\u06e7\u06e6\u06e0"

    invoke-static {v5}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v72, v32

    goto/16 :goto_0

    :sswitch_4e
    const/4 v5, 0x0

    :try_start_27
    aget-object v5, v102, v5
    :try_end_27
    .catch Ljava/lang/Exception; {:try_start_27 .. :try_end_27} :catch_0

    sget v18, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    if-gtz v18, :cond_41

    const-string v18, "\u06e3\u06e1\u06e8"

    invoke-static/range {v18 .. v18}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v18

    move-object/from16 v98, v5

    move/from16 v106, v18

    goto/16 :goto_0

    :cond_41
    const-string v18, "\u06e8\u06e5\u06e6"

    invoke-static/range {v18 .. v18}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v18

    move-object/from16 v98, v5

    move/from16 v106, v18

    goto/16 :goto_0

    :sswitch_4f
    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    move-result v5

    if-ltz v5, :cond_42

    const-string v5, "\u06e1\u06df\u06e8"

    move-wide/from16 v32, v74

    goto/16 :goto_13

    :cond_42
    const-string v5, "\u06e8\u06e0\u06e5"

    goto/16 :goto_e

    :sswitch_50
    :try_start_28
    move-object/from16 v0, v103

    iget-wide v0, v0, Lkb0;->c:D

    move-wide/from16 v32, v0
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_28} :catch_0

    sget v5, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v18, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    move/from16 v0, v18

    div-int/lit16 v0, v0, -0xe35

    move/from16 v18, v0

    mul-int v5, v5, v18

    if-eqz v5, :cond_43

    const/16 v5, 0x3c

    sput v5, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    const-string v5, "\u06df\u06df\u06e4"

    invoke-static {v5}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v132, v32

    goto/16 :goto_0

    :cond_43
    sget v5, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v18, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    mul-int v5, v5, v18

    const v18, 0x167679

    add-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v132, v32

    goto/16 :goto_0

    :sswitch_51
    sget v5, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v16, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    move/from16 v0, v16

    mul-int/lit16 v0, v0, 0x228c

    move/from16 v16, v0

    add-int v5, v5, v16

    if-ltz v5, :cond_44

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    const-string v5, "\u06e6\u06e4\u06e4"

    invoke-static {v5}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v16, v19

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_44
    const-string v5, "\u06e8\u06e3\u06e0"

    move-object/from16 v18, v5

    move-object/from16 v16, v19

    move/from16 v20, v17

    goto/16 :goto_a

    :sswitch_52
    const-wide/high16 v32, 0x4034000000000000L    # 20.0

    mul-double v32, v32, v70

    const-wide/16 v76, 0x0

    sub-double v76, v76, v24

    sub-double v32, v32, v76

    const-wide/16 v76, 0x0

    const-wide/high16 v142, 0x4035000000000000L    # 21.0

    mul-double v142, v142, v78

    sub-double v76, v76, v142

    sub-double v32, v32, v76

    const-wide/high16 v76, 0x4034000000000000L    # 20.0

    div-double v32, v32, v76

    sget v5, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v18, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    move/from16 v0, v18

    add-int/lit16 v0, v0, 0x23ee

    move/from16 v18, v0

    add-int v5, v5, v18

    if-gtz v5, :cond_45

    :goto_21
    const-string v5, "\u06e6\u06e6"

    move-wide/from16 v76, v32

    goto/16 :goto_20

    :cond_45
    sget v5, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v18, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    mul-int v5, v5, v18

    const v18, 0x1af2bf

    xor-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v76, v32

    goto/16 :goto_0

    :sswitch_53
    :try_start_29
    move-object/from16 v0, v21

    invoke-virtual {v0, v10}, Lh70;->b(I)I
    :try_end_29
    .catch Ljava/lang/Exception; {:try_start_29 .. :try_end_29} :catch_0

    move-result v107

    sget v5, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    if-gtz v5, :cond_46

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    const-string v5, "\u06e5\u06e2\u06e4"

    invoke-static {v5}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_46
    sget v5, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v18, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    xor-int v5, v5, v18

    const v18, 0x1ab447

    add-int v5, v5, v18

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_54
    :try_start_2a
    invoke-static/range {v116 .. v117}, Ljava/lang/Math;->signum(D)D
    :try_end_2a
    .catch Ljava/lang/Exception; {:try_start_2a .. :try_end_2a} :catch_0

    move-result-wide v32

    const-wide/high16 v78, 0x4079000000000000L    # 400.0

    mul-double v32, v32, v78

    mul-double v32, v32, v140

    const-wide/high16 v78, 0x4000000000000000L    # 2.0

    sub-double v78, v140, v78

    const-wide v142, 0x403b2147ae147ae1L    # 27.13

    add-double v78, v78, v142

    const-wide/high16 v142, 0x4000000000000000L    # 2.0

    add-double v78, v78, v142

    div-double v32, v32, v78

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    move-result v5

    if-gtz v5, :cond_47

    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    goto/16 :goto_1

    :cond_47
    sget v5, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v18, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    rem-int v5, v5, v18

    const v18, 0x1abdf0

    add-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v78, v32

    goto/16 :goto_0

    :sswitch_55
    const-wide/16 v32, 0x0

    const-wide/16 v110, 0x0

    const-wide v142, 0x3fbe818525c434ceL    # 0.11916382

    mul-double v142, v142, v138

    sub-double v110, v110, v142

    const-wide v142, 0x3f93c8fde0401c25L    # 0.01932141

    mul-double v142, v142, v68

    sub-double v110, v110, v142

    sub-double v32, v32, v110

    const-wide/16 v110, 0x0

    const-wide v142, 0x3fee693974c0c730L    # 0.95034478

    mul-double v142, v142, v52

    sub-double v110, v110, v142

    sub-double v32, v32, v110

    sget v5, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v18, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    move/from16 v0, v18

    add-int/lit16 v0, v0, 0x89b

    move/from16 v18, v0

    mul-int v5, v5, v18

    if-gtz v5, :cond_48

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    const-string v5, "\u06e5\u06e5"

    invoke-static {v5}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v110, v32

    goto/16 :goto_0

    :cond_48
    sget v5, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v18, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    div-int v5, v5, v18

    const v18, 0x1ac14b

    add-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v110, v32

    goto/16 :goto_0

    :sswitch_56
    :try_start_2b
    invoke-static/range {v105 .. v105}, Lg80;->w(I)D
    :try_end_2b
    .catch Ljava/lang/Exception; {:try_start_2b .. :try_end_2b} :catch_0

    move-result-wide v32

    sget v5, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v18, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sub-int v5, v5, v18

    const v18, 0x1ac952

    add-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v126, v32

    goto/16 :goto_0

    :sswitch_57
    const/4 v5, 0x0

    :try_start_2c
    aget-wide v32, v99, v5
    :try_end_2c
    .catch Ljava/lang/Exception; {:try_start_2c .. :try_end_2c} :catch_0

    sget v5, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v18, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    move/from16 v0, v18

    rem-int/lit16 v0, v0, 0xbe5

    move/from16 v18, v0

    add-int v5, v5, v18

    if-gez v5, :cond_5

    const-string v5, "\u06df\u06e0\u06e4"

    invoke-static {v5}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v82, v32

    goto/16 :goto_0

    :sswitch_58
    :try_start_2d
    invoke-static/range {v118 .. v119}, Ljava/lang/Math;->abs(D)D

    move-result-wide v32

    mul-double v32, v32, v8

    const-wide/high16 v142, 0x4059000000000000L    # 100.0

    div-double v32, v32, v142

    const-wide v142, 0x3fdae147ae147ae1L    # 0.42

    move-wide/from16 v0, v32

    move-wide/from16 v2, v142

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D
    :try_end_2d
    .catch Ljava/lang/Exception; {:try_start_2d .. :try_end_2d} :catch_0

    move-result-wide v32

    sget v5, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v18, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    move/from16 v0, v18

    xor-int/lit16 v0, v0, -0x1bbf

    move/from16 v18, v0

    div-int v5, v5, v18

    if-eqz v5, :cond_49

    const-string v5, "\u06df\u06e6\u06e4"

    invoke-static {v5}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v74, v32

    goto/16 :goto_0

    :cond_49
    const-string v5, "\u06e8\u06e0\u06e4"

    goto/16 :goto_13

    :sswitch_59
    const/4 v5, 0x0

    :try_start_2e
    aget-wide v32, v101, v5
    :try_end_2e
    .catch Ljava/lang/Exception; {:try_start_2e .. :try_end_2e} :catch_0

    mul-double v90, v114, v110

    const-wide/high16 v142, 0x4000000000000000L    # 2.0

    sub-double v90, v90, v142

    mul-double v142, v50, v112

    const-wide/high16 v144, 0x403e000000000000L    # 30.0

    add-double v142, v142, v144

    mul-double v144, v22, v42

    add-double v142, v142, v144

    const-wide/high16 v144, 0x403e000000000000L    # 30.0

    sub-double v142, v142, v144

    add-double v90, v90, v142

    const-wide/high16 v142, 0x4000000000000000L    # 2.0

    add-double v90, v90, v142

    mul-double v32, v32, v90

    sget v5, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    if-ltz v5, :cond_4a

    const/16 v5, 0x42

    sput v5, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    const-string v5, "\u06e8\u06e3\u06e0"

    goto/16 :goto_1d

    :cond_4a
    sget v5, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v18, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    xor-int v5, v5, v18

    const v18, 0x1abdd0

    add-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v90, v32

    goto/16 :goto_0

    :sswitch_5a
    sget v5, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v18, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    move/from16 v0, v18

    add-int/lit16 v0, v0, 0x22bb

    move/from16 v18, v0

    add-int v5, v5, v18

    if-gtz v5, :cond_4b

    const/4 v5, 0x6

    sput v5, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    const-string v5, "\u06e7\u06e3\u06e0"

    move-wide/from16 v34, v56

    :goto_22
    invoke-static {v5}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_4b
    move-wide/from16 v32, v76

    move-wide/from16 v34, v56

    goto/16 :goto_21

    :sswitch_5b
    sget v5, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v18, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    move/from16 v0, v18

    div-int/lit16 v0, v0, -0xd98

    move/from16 v18, v0

    xor-int v5, v5, v18

    if-ltz v5, :cond_4c

    const-string v5, "\u06e1\u06e1"

    invoke-static {v5}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_4c
    sget v5, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v18, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    div-int v5, v5, v18

    const v18, 0x1ac948

    add-int v5, v5, v18

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_5c
    sget v5, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v10, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    add-int/lit16 v10, v10, 0x786

    or-int/2addr v5, v10

    if-ltz v5, :cond_4d

    const/16 v5, 0x22

    sput v5, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    const-string v5, "\u06df\u06e5\u06df"

    invoke-static {v5}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move v10, v11

    goto/16 :goto_0

    :cond_4d
    move v5, v11

    goto/16 :goto_7

    :sswitch_5d
    const/4 v5, 0x1

    :try_start_2f
    aget-wide v14, v99, v5
    :try_end_2f
    .catch Ljava/lang/Exception; {:try_start_2f .. :try_end_2f} :catch_0

    sget v5, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v18, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    move/from16 v0, v18

    add-int/lit16 v0, v0, -0x15b7

    move/from16 v18, v0

    mul-int v5, v5, v18

    if-gtz v5, :cond_4e

    const-string v5, "\u06e5\u06e0\u06e0"

    invoke-static {v5}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_4e
    const-string v5, "\u06e4\u06e0"

    goto/16 :goto_9

    :sswitch_5e
    :try_start_30
    move-object/from16 v0, v103

    iget-wide v0, v0, Lkb0;->a:D

    move-wide/from16 v32, v0
    :try_end_30
    .catch Ljava/lang/Exception; {:try_start_30 .. :try_end_30} :catch_0

    sget v5, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    if-ltz v5, :cond_4f

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    const-string v5, "\u06e1\u06e7\u06e5"

    invoke-static {v5}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v124, v32

    goto/16 :goto_0

    :cond_4f
    sget v5, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v18, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    add-int v5, v5, v18

    const v18, -0x1aaca0

    xor-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v124, v32

    goto/16 :goto_0

    :sswitch_5f
    :try_start_31
    move-wide/from16 v0, v44

    move-wide/from16 v2, v54

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->hypot(DD)D
    :try_end_31
    .catch Ljava/lang/Exception; {:try_start_31 .. :try_end_31} :catch_0

    move-result-wide v32

    const-wide/high16 v130, 0x403e000000000000L    # 30.0

    add-double v130, v130, v88

    const-wide v142, 0x400e666666666666L    # 3.8

    add-double v130, v130, v142

    const-wide/high16 v142, 0x403e000000000000L    # 30.0

    sub-double v130, v130, v142

    const-wide/high16 v142, 0x3fd0000000000000L    # 0.25

    mul-double v130, v130, v142

    const-wide v142, 0x40ae0c4ec4ec4ec5L    # 3846.153846153846

    mul-double v130, v130, v142

    mul-double v130, v130, v46

    mul-double v130, v130, v132

    mul-double v32, v32, v130

    const-wide/high16 v130, 0x401c000000000000L    # 7.0

    add-double v130, v130, v76

    const-wide v142, 0x3fd3851eb851eb85L    # 0.305

    add-double v130, v130, v142

    const-wide/high16 v142, 0x401c000000000000L    # 7.0

    sub-double v130, v130, v142

    div-double v32, v32, v130

    const-string v5, "\u06e1\u06e1\u06e8"

    invoke-static {v5}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    move-wide/from16 v130, v32

    goto/16 :goto_0

    :sswitch_60
    sget v5, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v18, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    move/from16 v0, v18

    add-int/lit16 v0, v0, 0x1b1b

    move/from16 v18, v0

    xor-int v5, v5, v18

    if-ltz v5, :cond_50

    const/16 v5, 0x44

    sput v5, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    const-string v5, "\u06e8\u06e1\u06e4"

    move-wide/from16 v32, v92

    move-wide/from16 v64, v66

    goto/16 :goto_d

    :cond_50
    move-wide/from16 v32, v66

    goto/16 :goto_1f

    :sswitch_61
    :try_start_32
    move-object/from16 v0, v103

    iget-object v5, v0, Lkb0;->g:[D
    :try_end_32
    .catch Ljava/lang/Exception; {:try_start_32 .. :try_end_32} :catch_0

    sget v18, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v20, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    rem-int v18, v18, v20

    const v20, 0x1aba87

    add-int v18, v18, v20

    move-object/from16 v101, v5

    move/from16 v106, v18

    goto/16 :goto_0

    :sswitch_62
    sget v5, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v18, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    move/from16 v0, v18

    rem-int/lit16 v0, v0, 0x266

    move/from16 v18, v0

    mul-int v5, v5, v18

    if-ltz v5, :cond_51

    const-string v5, "\u06e1\u06e0\u06df"

    invoke-static {v5}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_51
    const-string v5, "\u06e5\u06e1"

    goto/16 :goto_22

    :sswitch_63
    move/from16 v0, v86

    xor-int/lit16 v5, v0, -0x100

    and-int v5, v5, v86

    sget v18, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v20, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    rem-int v18, v18, v20

    const v20, 0x1abff1

    add-int v18, v18, v20

    move/from16 v105, v5

    move/from16 v106, v18

    goto/16 :goto_0

    :sswitch_64
    invoke-static/range {v87 .. v87}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v32

    move-object/from16 v0, v28

    move-object/from16 v1, v29

    move-object/from16 v2, v32

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v19

    if-nez v19, :cond_53

    sget v4, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v5, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    or-int/2addr v4, v5

    const v5, 0x1ac56a

    add-int/2addr v5, v4

    move-object/from16 v4, v32

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_65
    const v5, 0xff00

    xor-int/lit8 v18, v86, -0x1

    const v20, 0xff00

    xor-int v18, v18, v20

    and-int v5, v5, v18

    shr-int/lit8 v5, v5, 0x8

    :try_start_33
    invoke-static {v5}, Lg80;->w(I)D
    :try_end_33
    .catch Ljava/lang/Exception; {:try_start_33 .. :try_end_33} :catch_0

    move-result-wide v32

    sget v5, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v18, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    mul-int v5, v5, v18

    const v18, -0xdfc7

    xor-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v138, v32

    goto/16 :goto_0

    :sswitch_66
    const-wide/16 v32, 0x0

    const-wide/16 v112, 0x0

    const-wide v142, 0x3fb27bb2fec56d5dL    # 0.0722

    mul-double v142, v142, v52

    sub-double v112, v112, v142

    const-wide v142, 0x3fe6e2eb1c432ca5L    # 0.7152

    mul-double v142, v142, v138

    const-wide/high16 v144, 0x402a000000000000L    # 13.0

    add-double v142, v142, v144

    const-wide v144, 0x3fcb367a0f9096bcL    # 0.2126

    mul-double v144, v144, v68

    add-double v142, v142, v144

    const-wide/high16 v144, 0x402a000000000000L    # 13.0

    sub-double v142, v142, v144

    sub-double v112, v112, v142

    sub-double v32, v32, v112

    sget v5, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v18, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    div-int v5, v5, v18

    const v18, 0x1ab321

    add-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v112, v32

    goto/16 :goto_0

    :sswitch_67
    :try_start_34
    invoke-static/range {v118 .. v119}, Ljava/lang/Math;->signum(D)D
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_34 .. :try_end_34} :catch_0

    move-result-wide v32

    const-wide/high16 v96, 0x4079000000000000L    # 400.0

    mul-double v32, v32, v96

    mul-double v32, v32, v74

    const-wide/high16 v96, 0x403e000000000000L    # 30.0

    add-double v96, v96, v74

    const-wide v142, 0x403b2147ae147ae1L    # 27.13

    add-double v96, v96, v142

    const-wide/high16 v142, 0x403e000000000000L    # 30.0

    sub-double v96, v96, v142

    div-double v32, v32, v96

    sget v5, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v18, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    xor-int/lit8 v18, v18, -0x77

    rem-int v5, v5, v18

    if-gtz v5, :cond_52

    const/16 v5, 0x62

    sput v5, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    move-object/from16 v5, v94

    goto/16 :goto_12

    :cond_52
    sget v5, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v18, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    add-int v5, v5, v18

    const v18, 0x1abe42

    add-int v5, v5, v18

    move/from16 v106, v5

    move-wide/from16 v96, v32

    goto/16 :goto_0

    :cond_53
    :sswitch_68
    sget v5, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v18, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    add-int v5, v5, v18

    const v18, 0x1aa5d3

    add-int v5, v5, v18

    move/from16 v106, v5

    goto/16 :goto_0

    :sswitch_69
    :try_start_35
    invoke-static/range {p1 .. p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
    :try_end_35
    .catch Ljava/lang/Exception; {:try_start_35 .. :try_end_35} :catch_0

    move-result v18

    invoke-static {}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۢۢۧۨ()I

    move-result v5

    if-gtz v5, :cond_54

    const/16 v5, 0x61

    sput v5, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    const-string v5, "\u06e1\u06e5"

    invoke-static {v5}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v86, v18

    move/from16 v106, v5

    goto/16 :goto_0

    :cond_54
    const-string v5, "\u06e8\u06e8\u06e2"

    move/from16 v20, v87

    goto/16 :goto_6

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc24 -> :sswitch_0
        0xdc5d -> :sswitch_2e
        0xdc7c -> :sswitch_13
        0xdc9c -> :sswitch_4f
        0xdc9e -> :sswitch_62
        0xdca0 -> :sswitch_7
        0xdcbb -> :sswitch_19
        0xdcc0 -> :sswitch_8
        0xdcdd -> :sswitch_28
        0xdcfd -> :sswitch_e
        0x1aa704 -> :sswitch_38
        0x1aa706 -> :sswitch_2b
        0x1aa723 -> :sswitch_5d
        0x1aa724 -> :sswitch_1d
        0x1aa73d -> :sswitch_56
        0x1aa7a0 -> :sswitch_4
        0x1aa7b9 -> :sswitch_66
        0x1aa7dd -> :sswitch_51
        0x1aa7fc -> :sswitch_60
        0x1aa81f -> :sswitch_34
        0x1aab22 -> :sswitch_17
        0x1aab23 -> :sswitch_23
        0x1aab24 -> :sswitch_25
        0x1aab41 -> :sswitch_c
        0x1aab81 -> :sswitch_5b
        0x1aab82 -> :sswitch_47
        0x1aabc1 -> :sswitch_1c
        0x1aae85 -> :sswitch_40
        0x1aae86 -> :sswitch_59
        0x1aaea0 -> :sswitch_33
        0x1aaea4 -> :sswitch_69
        0x1aaea5 -> :sswitch_44
        0x1aaec8 -> :sswitch_21
        0x1aaede -> :sswitch_5a
        0x1aaf23 -> :sswitch_50
        0x1aaf3e -> :sswitch_58
        0x1aaf42 -> :sswitch_4e
        0x1aaf7c -> :sswitch_37
        0x1aaf7d -> :sswitch_5f
        0x1aaf7e -> :sswitch_3d
        0x1aaf7f -> :sswitch_4d
        0x1aaf82 -> :sswitch_4b
        0x1aaf9a -> :sswitch_57
        0x1ab247 -> :sswitch_31
        0x1ab262 -> :sswitch_2a
        0x1ab263 -> :sswitch_4f
        0x1ab2de -> :sswitch_20
        0x1ab2e3 -> :sswitch_4c
        0x1ab321 -> :sswitch_55
        0x1ab33a -> :sswitch_14
        0x1ab64a -> :sswitch_63
        0x1ab660 -> :sswitch_30
        0x1ab666 -> :sswitch_b
        0x1ab6a3 -> :sswitch_6
        0x1ab6a7 -> :sswitch_1b
        0x1ab6bd -> :sswitch_1a
        0x1ab6c3 -> :sswitch_11
        0x1ab9e5 -> :sswitch_46
        0x1aba23 -> :sswitch_35
        0x1aba41 -> :sswitch_52
        0x1aba48 -> :sswitch_61
        0x1aba68 -> :sswitch_2b
        0x1aba87 -> :sswitch_1f
        0x1abadb -> :sswitch_2f
        0x1abadd -> :sswitch_1
        0x1abd8b -> :sswitch_1e
        0x1abda5 -> :sswitch_2d
        0x1abda7 -> :sswitch_45
        0x1abda9 -> :sswitch_54
        0x1abdc9 -> :sswitch_5
        0x1abdca -> :sswitch_f
        0x1abde6 -> :sswitch_48
        0x1abde7 -> :sswitch_68
        0x1abe24 -> :sswitch_10
        0x1abe26 -> :sswitch_42
        0x1abe66 -> :sswitch_3c
        0x1abe81 -> :sswitch_53
        0x1abe9d -> :sswitch_5b
        0x1abe9e -> :sswitch_18
        0x1abe9f -> :sswitch_36
        0x1ac14c -> :sswitch_3a
        0x1ac1e5 -> :sswitch_5e
        0x1ac1e6 -> :sswitch_3e
        0x1ac200 -> :sswitch_15
        0x1ac202 -> :sswitch_32
        0x1ac245 -> :sswitch_12
        0x1ac509 -> :sswitch_3f
        0x1ac510 -> :sswitch_43
        0x1ac529 -> :sswitch_2
        0x1ac52c -> :sswitch_5c
        0x1ac564 -> :sswitch_9
        0x1ac567 -> :sswitch_a
        0x1ac584 -> :sswitch_65
        0x1ac587 -> :sswitch_49
        0x1ac589 -> :sswitch_25
        0x1ac5e1 -> :sswitch_26
        0x1ac5e7 -> :sswitch_30
        0x1ac8ec -> :sswitch_3
        0x1ac8ed -> :sswitch_27
        0x1ac90b -> :sswitch_39
        0x1ac92e -> :sswitch_2c
        0x1ac945 -> :sswitch_d
        0x1ac947 -> :sswitch_24
        0x1ac948 -> :sswitch_64
        0x1ac969 -> :sswitch_16
        0x1ac983 -> :sswitch_22
        0x1ac988 -> :sswitch_3b
        0x1ac989 -> :sswitch_4a
        0x1ac9a5 -> :sswitch_67
        0x1ac9df -> :sswitch_41
        0x1ac9e2 -> :sswitch_29
    .end sparse-switch
.end method

.method public static final c(Landroid/widget/LinearLayout;Landroid/app/Activity;[Lsx;Lp00;Lsn;Ln00;Landroid/graphics/drawable/GradientDrawable;Landroid/graphics/drawable/GradientDrawable;Landroid/graphics/drawable/GradientDrawable;Landroid/widget/LinearLayout;)V
    .locals 53

    const/16 v43, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v40, 0x0

    const/16 v35, 0x0

    const/4 v5, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v27, 0x0

    const/16 v26, 0x0

    const/4 v3, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v21, 0x0

    const/4 v4, 0x0

    const/16 v39, 0x0

    const/16 v38, 0x0

    const/16 v24, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v47, 0x0

    const/16 v28, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v46, 0x0

    const/16 v44, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v30, 0x0

    const/16 v45, 0x0

    const/16 v50, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const-string v6, "\u06e6\u06e7"

    invoke-static {v6}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v51, v3

    move-object/from16 v52, v4

    move v9, v6

    :goto_0
    sparse-switch v9, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v7, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    sget v3, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v4, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    rem-int/lit16 v4, v4, -0x63c

    mul-int/2addr v3, v4

    if-gtz v3, :cond_1c

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    const-string v3, "\u06e6\u06df\u06e4"

    invoke-static {v3}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v16, v7

    move v9, v3

    goto :goto_0

    :sswitch_1
    sget v3, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    add-int/lit16 v4, v4, -0x21c9

    sub-int/2addr v3, v4

    if-gtz v3, :cond_0

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-object/from16 v3, v16

    move/from16 v4, v19

    :goto_1
    const-string v6, "\u06e7\u06e8\u06df"

    invoke-static {v6}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v18, v3

    move v9, v6

    move/from16 v19, v4

    goto :goto_0

    :cond_0
    const-string v3, "\u06e1\u06e3\u06e0"

    move-object/from16 v18, v16

    :goto_2
    invoke-static {v3}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto :goto_0

    :sswitch_2
    sget v3, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    if-ltz v3, :cond_1

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    const-string v3, "\u06e5\u06e0\u06df"

    invoke-static {v3}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto :goto_0

    :cond_1
    const-string v3, "\u06e1\u06e7\u06e1"

    invoke-static {v3}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto :goto_0

    :sswitch_3
    move-object/from16 v0, v39

    move-object/from16 v1, v38

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget v4, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v6, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    xor-int/2addr v4, v6

    const v6, 0x1ac749

    add-int/2addr v4, v6

    move-object/from16 v52, v3

    move v9, v4

    goto :goto_0

    :sswitch_4
    move-object/from16 v0, v24

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    move-object/from16 v0, v26

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v3, Lbo;->a:Landroid/graphics/Typeface;

    move-object/from16 v0, v26

    move-object/from16 v1, p4

    invoke-static {v0, v1}, Lbo;->c(Landroid/view/View;Lsn;)V

    new-instance v3, Le6;

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p4

    move-object/from16 v11, p9

    move-object/from16 v12, p0

    move-object/from16 v13, p1

    move-object/from16 v14, p2

    invoke-direct/range {v3 .. v14}, Le6;-><init>(Lp00;Ljava/lang/String;Ln00;Landroid/graphics/drawable/GradientDrawable;Landroid/graphics/drawable/GradientDrawable;Landroid/graphics/drawable/GradientDrawable;Lsn;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;[Lsx;)V

    move-object/from16 v0, v26

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    or-int/lit16 v4, v4, -0x714

    or-int/2addr v3, v4

    if-ltz v3, :cond_2

    const-string v3, "\u06e6\u06e0\u06e0"

    invoke-static {v3}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u06e0\u06e8\u06e7"

    move/from16 v4, v20

    :goto_3
    invoke-static {v3}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_5
    const-string v3, "\u06e8\u06e3\u06e5"

    :goto_4
    invoke-static {v3}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto/16 :goto_0

    :sswitch_6
    sget v3, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    or-int/lit16 v4, v4, -0x6ad

    xor-int/2addr v3, v4

    if-ltz v3, :cond_3

    const-string v3, "\u06e5\u06e0\u06e0"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v45, v41

    move v9, v3

    goto/16 :goto_0

    :cond_3
    sget v3, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    xor-int/2addr v3, v4

    const v4, 0x1aaac8

    add-int/2addr v3, v4

    move-object/from16 v45, v41

    move v9, v3

    goto/16 :goto_0

    :sswitch_7
    sget v3, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    if-ltz v3, :cond_4

    const-string v3, "\u06df\u06e5\u06e0"

    goto :goto_4

    :cond_4
    sget v3, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v4, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    rem-int/2addr v3, v4

    const v4, 0xdd44

    add-int/2addr v3, v4

    move v9, v3

    goto/16 :goto_0

    :sswitch_8
    sget v3, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v4, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    add-int/lit16 v4, v4, -0x873

    xor-int/2addr v3, v4

    if-gtz v3, :cond_5

    const/16 v3, 0x2d

    sput v3, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    const-string v3, "\u06df\u06e6\u06e2"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto/16 :goto_0

    :cond_5
    sget v3, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    xor-int/2addr v3, v4

    const v4, 0x1aab88

    add-int/2addr v3, v4

    move v9, v3

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v0, v51

    move/from16 v1, v49

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    const/4 v3, 0x1

    move/from16 v0, v31

    if-ne v0, v3, :cond_2d

    const/4 v4, 0x0

    sget v3, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    if-ltz v3, :cond_6

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    const-string v3, "\u06e5\u06e2\u06e7"

    goto :goto_3

    :cond_6
    sget v3, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v6, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    or-int/2addr v3, v6

    const v6, 0x1ab262

    add-int/2addr v3, v6

    move v9, v3

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_7
    :sswitch_a
    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    move-result v3

    if-gtz v3, :cond_8

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    const-string v3, "\u06e2\u06e2\u06e6"

    invoke-static {v3}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto/16 :goto_0

    :cond_8
    sget v3, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v4, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sub-int/2addr v3, v4

    const v4, 0xe037

    add-int/2addr v3, v4

    move v9, v3

    goto/16 :goto_0

    :sswitch_b
    sget v3, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v4, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sub-int/2addr v3, v4

    const v4, 0x1aae1c

    add-int/2addr v3, v4

    move v9, v3

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    move-result v3

    if-ltz v3, :cond_9

    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    const-string v3, "\u06df\u06e5\u06e8"

    :goto_5
    invoke-static {v3}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e6\u06e7"

    goto :goto_5

    :sswitch_d
    const/4 v3, 0x4

    move/from16 v0, v37

    if-ge v0, v3, :cond_c

    const/4 v3, 0x0

    move-object/from16 v0, p1

    invoke-static {v0, v3}, Lg40;->g(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v6

    sget v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v3, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    xor-int/lit16 v7, v3, -0x27b

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    xor-int/lit16 v4, v4, 0xc7

    invoke-direct {v3, v4, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const-string v4, "\u06e1\u06e8\u06e5"

    :goto_6
    invoke-static {v4}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v40, v3

    move-object/from16 v41, v6

    move/from16 v42, v7

    move v9, v4

    goto/16 :goto_0

    :sswitch_e
    sget v3, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    add-int/lit16 v4, v4, 0xa9d

    mul-int/2addr v3, v4

    if-ltz v3, :cond_a

    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    const-string v3, "\u06e5\u06e3"

    invoke-static {v3}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto/16 :goto_0

    :cond_a
    sget v3, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v4, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    rem-int/2addr v3, v4

    const v4, -0x1ab379

    xor-int/2addr v3, v4

    move v9, v3

    goto/16 :goto_0

    :sswitch_f
    sget v3, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v4, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    div-int/2addr v3, v4

    const v4, 0x1ac580

    add-int/2addr v3, v4

    move v9, v3

    move/from16 v29, v42

    move/from16 v50, v35

    goto/16 :goto_0

    :sswitch_10
    sget v3, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    xor-int/lit16 v4, v4, -0x8ad

    xor-int/2addr v3, v4

    if-gtz v3, :cond_b

    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    const-string v3, "\u06e5\u06e1\u06e4"

    move-object/from16 v4, v21

    move-object/from16 v6, v22

    :goto_7
    invoke-static {v3}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v21, v4

    move-object/from16 v22, v6

    move v9, v3

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06df\u06df\u06e2"

    move-object/from16 v3, v40

    move-object/from16 v6, v41

    move/from16 v7, v42

    goto :goto_6

    :sswitch_11
    const-string v3, "\u06df\u06df\u06e3"

    move-object v4, v3

    :goto_8
    invoke-static {v4}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto/16 :goto_0

    :sswitch_12
    sget v3, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    xor-int/lit16 v3, v3, -0x304

    invoke-static {v3}, Lmp;->q(I)I

    move-result v3

    move-object/from16 v0, v40

    iput v3, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    move-object/from16 v0, v41

    move-object/from16 v1, v40

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v3, 0x0

    move/from16 v4, v36

    move/from16 v6, v36

    move/from16 v33, v37

    move/from16 v7, v37

    :goto_9
    const-string v8, "\u06e4\u06e8\u06e8"

    invoke-static {v8}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v35, v3

    move v9, v8

    move/from16 v36, v4

    move/from16 v31, v6

    move/from16 v37, v7

    goto/16 :goto_0

    :cond_c
    :sswitch_13
    sget v3, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    div-int/lit16 v4, v4, -0x20e8

    xor-int/2addr v3, v4

    if-gtz v3, :cond_d

    const-string v3, "\u06e1\u06e4\u06e8"

    invoke-static {v3}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06e3\u06df"

    move-object/from16 v4, v21

    move-object/from16 v6, v22

    goto :goto_7

    :sswitch_14
    sget v3, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    if-ltz v3, :cond_e

    const-string v3, "\u06e1\u06e3\u06e0"

    invoke-static {v3}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    move/from16 v36, v43

    goto/16 :goto_0

    :cond_e
    sget v3, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v4, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    add-int/2addr v3, v4

    const v4, 0x1abca9

    add-int/2addr v3, v4

    move v9, v3

    move/from16 v36, v43

    goto/16 :goto_0

    :sswitch_15
    move-object/from16 v0, v25

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    if-eqz v17, :cond_7

    sget-object v18, Lqn;->a:Landroid/graphics/Typeface;

    sget v3, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v4, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sub-int/2addr v3, v4

    const v4, 0x1ac5a6

    add-int/2addr v3, v4

    move v9, v3

    goto/16 :goto_0

    :sswitch_16
    const-string v4, "p315L9hu2TS0\n"

    const-string v3, "hE04H+he6QQ=\n"

    :goto_a
    const-string v6, "\u06e1\u06e4"

    invoke-static {v6}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v38, v3

    move-object/from16 v39, v4

    move v9, v6

    goto/16 :goto_0

    :sswitch_17
    const-string v3, "\u06e5\u06e4\u06e3"

    move/from16 v4, v48

    :goto_b
    invoke-static {v3}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    move/from16 v49, v4

    goto/16 :goto_0

    :sswitch_18
    const/4 v3, 0x0

    move-object/from16 v0, v51

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const-string v6, "\u06df\u06df\u06e2"

    move-object/from16 v3, v26

    move-object/from16 v4, v27

    :goto_c
    invoke-static {v6}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v26, v3

    move-object/from16 v27, v4

    move v9, v6

    goto/16 :goto_0

    :sswitch_19
    sget v3, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    add-int/2addr v3, v4

    const v4, -0xd832

    xor-int/2addr v3, v4

    move v9, v3

    goto/16 :goto_0

    :sswitch_1a
    sget v3, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    mul-int/lit16 v4, v4, -0x1c51

    sub-int/2addr v3, v4

    if-gtz v3, :cond_f

    const/16 v3, 0x35

    sput v3, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    const-string v3, "\u06e0\u06e2\u06df"

    invoke-static {v3}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    move/from16 v28, v47

    goto/16 :goto_0

    :cond_f
    const-string v3, "\u06e8\u06e3\u06e5"

    move/from16 v28, v47

    :goto_d
    invoke-static {v3}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto/16 :goto_0

    :sswitch_1b
    invoke-static {}, Lcom/google/android/material/carousel/ۢۢۢۥ;->۟ۡ۟۠ۧ()I

    move-result v3

    if-gtz v3, :cond_10

    const-string v6, "\u06df\u06df\u06e2"

    move-object/from16 v3, v23

    move-object/from16 v4, v24

    :goto_e
    invoke-static {v6}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v23, v3

    move-object/from16 v24, v4

    move v9, v6

    goto/16 :goto_0

    :cond_10
    sget v3, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    div-int/2addr v3, v4

    const v4, 0x1ac14c

    add-int/2addr v3, v4

    move v9, v3

    goto/16 :goto_0

    :sswitch_1c
    move-object/from16 v3, v25

    :cond_11
    sget v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v6, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    xor-int/2addr v4, v6

    const v6, 0x1ab5fd

    add-int/2addr v4, v6

    move-object/from16 v25, v3

    move v9, v4

    goto/16 :goto_0

    :sswitch_1d
    sget v3, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v4, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    or-int/lit16 v4, v4, 0x1f4e

    add-int/2addr v3, v4

    if-gtz v3, :cond_12

    const/16 v3, 0x42

    sput v3, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    const-string v6, "\u06e8\u06e3\u06e8"

    move-object/from16 v3, v26

    move-object/from16 v4, v27

    goto :goto_c

    :cond_12
    const-string v6, "\u06e5\u06e8\u06e8"

    move-object/from16 v3, v26

    move-object/from16 v4, v27

    goto/16 :goto_c

    :sswitch_1e
    const/16 v48, 0x0

    sget v3, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v4, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sub-int/2addr v3, v4

    const v4, 0x1ac808

    add-int/2addr v3, v4

    move v9, v3

    goto/16 :goto_0

    :sswitch_1f
    sget v3, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    xor-int/lit8 v3, v3, -0x55

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v3}, Lmp;->q(I)I

    move-result v6

    invoke-static {v3}, Lmp;->q(I)I

    move-result v3

    invoke-direct {v4, v6, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    sget v3, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    xor-int/lit16 v3, v3, -0x309

    invoke-static {v3}, Lmp;->q(I)I

    move-result v3

    iput v3, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    move-object/from16 v0, v26

    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    sget v4, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v6, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    mul-int/2addr v4, v6

    const v6, 0x203c63

    add-int/2addr v4, v6

    move-object/from16 v51, v3

    move v9, v4

    goto/16 :goto_0

    :sswitch_20
    move-object/from16 v0, p5

    iget v4, v0, Ln00;->a:I

    sget v3, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    if-ltz v3, :cond_13

    const/4 v3, 0x5

    sput v3, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    const-string v3, "\u06e5\u06e4\u06e3"

    :goto_f
    invoke-static {v3}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    move/from16 v28, v4

    goto/16 :goto_0

    :cond_13
    const-string v3, "\u06e5\u06e7\u06e7"

    move/from16 v28, v4

    move/from16 v6, v29

    move/from16 v7, v31

    move/from16 v8, v33

    :goto_10
    invoke-static {v3}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    move/from16 v29, v6

    move/from16 v31, v7

    move/from16 v33, v8

    goto/16 :goto_0

    :sswitch_21
    sget v3, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v4, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    add-int/lit16 v4, v4, 0x1a88

    xor-int/2addr v3, v4

    if-ltz v3, :cond_14

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟ۡۡۦ()I

    const-string v3, "\u06e3\u06e8\u06e4"

    move/from16 v6, v29

    move/from16 v7, v31

    move/from16 v8, v33

    goto :goto_10

    :cond_14
    sget v3, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    xor-int/2addr v3, v4

    const v4, -0xdf89

    xor-int/2addr v3, v4

    move v9, v3

    goto/16 :goto_0

    :sswitch_22
    move-object/from16 v0, p0

    move-object/from16 v1, v45

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v3, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    xor-int/lit16 v3, v3, 0x2c9

    add-int v37, v33, v3

    sget v3, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v4, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    xor-int/lit16 v4, v4, -0x640

    xor-int/2addr v3, v4

    if-gtz v3, :cond_15

    const/16 v3, 0x31

    sput v3, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    move/from16 v3, v35

    move/from16 v4, v31

    move/from16 v6, v31

    move/from16 v7, v37

    goto/16 :goto_9

    :cond_15
    sget v3, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    add-int/2addr v3, v4

    const v4, -0x1aa52e

    xor-int/2addr v3, v4

    move v9, v3

    move/from16 v36, v31

    goto/16 :goto_0

    :sswitch_23
    sget v3, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    if-ltz v3, :cond_16

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    const-string v3, "\u06e6\u06e8\u06e0"

    invoke-static {v3}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v38, v21

    move v9, v3

    goto/16 :goto_0

    :cond_16
    const-string v3, "\u06e0\u06e2\u06df"

    invoke-static {v3}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v38, v21

    move v9, v3

    goto/16 :goto_0

    :sswitch_24
    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    move-result v3

    if-gtz v3, :cond_17

    const-string v3, "\u06e8\u06e2"

    invoke-static {v3}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto/16 :goto_0

    :cond_17
    const-string v3, "\u06e4\u06e6\u06e7"

    :goto_11
    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto/16 :goto_0

    :sswitch_25
    sget v3, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v4, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    xor-int/lit16 v4, v4, 0x1eaf

    div-int/2addr v3, v4

    if-eqz v3, :cond_18

    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    move-object/from16 v3, v38

    move-object/from16 v4, v39

    move/from16 v20, v19

    goto/16 :goto_a

    :cond_18
    sget v3, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v4, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    xor-int/2addr v3, v4

    const v4, 0x1abe62

    add-int/2addr v3, v4

    move v9, v3

    move/from16 v20, v19

    goto/16 :goto_0

    :cond_19
    :sswitch_26
    const-string v3, "\u06e5\u06e4\u06e0"

    move/from16 v6, v29

    move/from16 v7, v31

    move/from16 v8, v33

    goto/16 :goto_10

    :cond_1a
    :sswitch_27
    sget v3, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v4, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    mul-int/lit16 v4, v4, -0x1c3c

    mul-int/2addr v3, v4

    if-gtz v3, :cond_1b

    const/16 v3, 0x17

    sput v3, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    const-string v4, "\u06e2\u06e3"

    move-object/from16 v3, v40

    move-object/from16 v6, v41

    move/from16 v7, v42

    goto/16 :goto_6

    :cond_1b
    const-string v4, "\u06e5\u06e0\u06e0"

    move-object/from16 v3, v40

    move-object/from16 v6, v41

    move/from16 v7, v42

    goto/16 :goto_6

    :sswitch_28
    new-instance v4, Landroid/widget/LinearLayout;

    move-object/from16 v0, p1

    invoke-direct {v4, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x1

    invoke-virtual {v4, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget v3, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    xor-int/lit8 v3, v3, -0x7a

    invoke-virtual {v4, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    move/from16 v0, v29

    invoke-direct {v3, v6, v0, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v4, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v3, Landroid/widget/FrameLayout;

    move-object/from16 v0, p1

    invoke-direct {v3, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const-string v6, "\u06e6\u06e0\u06e0"

    goto/16 :goto_c

    :cond_1c
    const-string v3, "\u06e6\u06e1\u06e4"

    move-object v4, v15

    move-object v6, v3

    move/from16 v8, v17

    :goto_12
    invoke-static {v6}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v3

    move-object v15, v4

    move-object/from16 v16, v7

    move/from16 v17, v8

    move v9, v3

    goto/16 :goto_0

    :sswitch_29
    sget v3, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    rem-int/lit16 v4, v4, -0x206f

    div-int/2addr v3, v4

    if-eqz v3, :cond_1d

    const/16 v3, 0x29

    sput v3, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    const-string v3, "\u06df\u06e1\u06e6"

    goto/16 :goto_2

    :cond_1d
    sget v3, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    mul-int/2addr v3, v4

    const v4, 0x1a874e

    add-int/2addr v3, v4

    move v9, v3

    goto/16 :goto_0

    :sswitch_2a
    move-object/from16 v0, p4

    iget v0, v0, Lsn;->f:I

    move/from16 v47, v0

    sget v3, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    or-int/2addr v3, v4

    const v4, 0x1aa85f

    add-int/2addr v3, v4

    move v9, v3

    goto/16 :goto_0

    :sswitch_2b
    move-object/from16 v0, p4

    iget v3, v0, Lsn;->a:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->removeAllViews()V

    const/16 v37, 0x0

    :goto_13
    const-string v4, "\u06e7\u06e1\u06e5"

    move/from16 v43, v3

    goto/16 :goto_8

    :sswitch_2c
    const-string v3, "\u06df\u06e2\u06e3"

    goto/16 :goto_5

    :cond_1e
    :sswitch_2d
    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    move-result v3

    if-ltz v3, :cond_1f

    const/16 v3, 0x45

    sput v3, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    const-string v3, "\u06e1\u06e2\u06df"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto/16 :goto_0

    :cond_1f
    sget v3, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    div-int/2addr v3, v4

    const v4, 0x1abe02

    add-int/2addr v3, v4

    move v9, v3

    goto/16 :goto_0

    :sswitch_2e
    sget v3, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    add-int/lit16 v4, v4, 0x2301

    add-int/2addr v3, v4

    if-gtz v3, :cond_20

    const/16 v3, 0x5f

    sput v3, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    move/from16 v3, v43

    move/from16 v29, v30

    move/from16 v31, v32

    move/from16 v33, v34

    goto :goto_13

    :cond_20
    const-string v3, "\u06e4\u06e6\u06e5"

    move/from16 v6, v30

    move/from16 v7, v32

    move/from16 v8, v34

    goto/16 :goto_10

    :sswitch_2f
    move-object/from16 v0, v27

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/TextView;

    move-object/from16 v0, p1

    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v4, 0x41300000    # 11.0f

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    if-eqz v17, :cond_11

    sget v4, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v6, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    add-int/lit16 v6, v6, 0x151f

    sub-int/2addr v4, v6

    if-ltz v4, :cond_21

    const-string v4, "\u06e4\u06e6\u06e5"

    invoke-static {v4}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v25, v3

    move v9, v4

    goto/16 :goto_0

    :cond_21
    sget v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v6, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    xor-int/2addr v4, v6

    const v6, 0x1abd84

    add-int/2addr v4, v6

    move-object/from16 v25, v3

    move v9, v4

    goto/16 :goto_0

    :sswitch_30
    sget v3, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    div-int/lit16 v4, v4, -0x1249

    xor-int/2addr v3, v4

    if-ltz v3, :cond_22

    const-string v3, "\u06e4\u06e6\u06e7"

    invoke-static {v3}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto/16 :goto_0

    :cond_22
    const-string v3, "\u06df\u06e2\u06e6"

    move/from16 v4, v28

    goto/16 :goto_f

    :sswitch_31
    move-object/from16 v0, v26

    move-object/from16 v1, v51

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v4, Lf6;

    move-object/from16 v0, p4

    move-object/from16 v1, p1

    move/from16 v2, v17

    invoke-direct {v4, v0, v1, v5, v2}, Lf6;-><init>(Lsn;Landroid/app/Activity;Ljava/lang/String;Z)V

    sget v3, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    xor-int/lit16 v6, v3, -0x34a

    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-static {v6}, Lmp;->q(I)I

    move-result v7

    invoke-static {v6}, Lmp;->q(I)I

    move-result v6

    invoke-direct {v3, v7, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v6, 0x11

    iput v6, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    sget v6, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v7, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    xor-int/lit16 v7, v7, -0x131a

    xor-int/2addr v6, v7

    if-ltz v6, :cond_23

    const-string v6, "\u06e3\u06e0\u06e1"

    invoke-static {v6}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v23, v3

    move-object/from16 v24, v4

    move v9, v6

    goto/16 :goto_0

    :cond_23
    const-string v6, "\u06e6\u06e7\u06e5"

    goto/16 :goto_e

    :sswitch_32
    sget v3, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    xor-int/lit16 v4, v4, -0x15a1

    add-int/2addr v3, v4

    if-ltz v3, :cond_24

    const-string v3, "\u06e0\u06e4\u06df"

    goto/16 :goto_11

    :cond_24
    sget v3, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sub-int/2addr v3, v4

    const v4, 0x1abf12

    add-int/2addr v3, v4

    move v9, v3

    goto/16 :goto_0

    :cond_25
    :sswitch_33
    sget v3, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v4, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    mul-int/2addr v3, v4

    const v4, 0x1bd25d

    xor-int/2addr v3, v4

    move v9, v3

    goto/16 :goto_0

    :sswitch_34
    sget v3, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v4, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    or-int/2addr v3, v4

    const v4, 0xdd65

    xor-int/2addr v3, v4

    move-object/from16 v39, v22

    move v9, v3

    goto/16 :goto_0

    :sswitch_35
    move-object/from16 v0, v51

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    if-eqz v17, :cond_25

    move-object/from16 v0, p4

    iget-boolean v3, v0, Lsn;->p:Z

    if-eqz v3, :cond_19

    const-string v6, "dw/qZhs+WmoS\n"

    const-string v4, "VD6rIF14HCw=\n"

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    move-result v3

    if-ltz v3, :cond_26

    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    move-object/from16 v3, v44

    move/from16 v7, v46

    :goto_14
    const-string v8, "\u06e8\u06e3\u06e7"

    invoke-static {v8}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v44, v3

    move-object/from16 v21, v4

    move-object/from16 v22, v6

    move/from16 v46, v7

    move v9, v8

    goto/16 :goto_0

    :cond_26
    const-string v3, "\u06e3\u06df\u06e1"

    goto/16 :goto_7

    :sswitch_36
    move-object/from16 v0, v25

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    move-object/from16 v0, v27

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v45

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    xor-int/lit16 v3, v3, -0x281

    add-int v7, v50, v3

    sget v3, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    xor-int/lit16 v4, v4, -0x1959

    sub-int/2addr v3, v4

    if-gtz v3, :cond_27

    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    const-string v3, "\u06e2\u06df\u06e5"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v44, v45

    move/from16 v46, v7

    move v9, v3

    goto/16 :goto_0

    :cond_27
    move-object/from16 v3, v45

    move-object/from16 v4, v21

    move-object/from16 v6, v22

    goto :goto_14

    :sswitch_37
    const/high16 v3, 0x41800000    # 16.0f

    invoke-static {v3}, Lmp;->p(F)F

    move-result v4

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v3

    if-gtz v3, :cond_28

    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    const-string v3, "\u06e0\u06e7\u06df"

    move/from16 v19, v4

    goto/16 :goto_d

    :cond_28
    move-object/from16 v3, v18

    goto/16 :goto_1

    :sswitch_38
    const/4 v3, 0x1

    move/from16 v0, v31

    if-ne v0, v3, :cond_1a

    const/4 v4, 0x1

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    move-result v3

    if-gtz v3, :cond_29

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟ۡۡۦ()I

    const-string v3, "\u06e5\u06e3\u06e0"

    goto/16 :goto_b

    :cond_29
    move/from16 v3, v50

    :goto_15
    const-string v6, "\u06e1\u06e6"

    invoke-static {v6}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v6

    move v9, v6

    move/from16 v49, v4

    move/from16 v50, v3

    goto/16 :goto_0

    :sswitch_39
    const/4 v3, 0x4

    move/from16 v0, v50

    if-ge v0, v3, :cond_1e

    sget v3, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    xor-int/lit16 v3, v3, -0x309

    mul-int v3, v3, v33

    rsub-int/lit8 v4, v50, 0x0

    sub-int/2addr v3, v4

    aget-object v4, p2, v3

    iget-object v3, v4, Lsx;->a:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v4, Lsx;->b:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    move-object/from16 v0, p3

    iget-object v5, v0, Lp00;->b:Ljava/lang/Object;

    invoke-static {v5, v3}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v5

    if-ltz v5, :cond_2a

    const-string v6, "\u06e5\u06e7\u06e7"

    move-object v5, v3

    move-object/from16 v7, v16

    goto/16 :goto_12

    :cond_2a
    sget v5, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v6, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    rem-int/2addr v5, v6

    const v6, 0x1aa586

    add-int/2addr v6, v5

    move-object v15, v4

    move-object v5, v3

    move/from16 v17, v8

    move v9, v6

    goto/16 :goto_0

    :sswitch_3a
    sget v3, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v4, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    add-int/2addr v3, v4

    const v4, -0x1ac267

    xor-int/2addr v3, v4

    move v9, v3

    goto/16 :goto_0

    :sswitch_3b
    invoke-static/range {v52 .. v52}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    move-object/from16 v0, v51

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    sget v3, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    or-int/lit16 v4, v4, 0x1d46

    mul-int/2addr v3, v4

    if-gtz v3, :cond_2b

    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    const-string v3, "\u06e8\u06e3\u06e5"

    invoke-static {v3}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto/16 :goto_0

    :cond_2b
    sget v3, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sub-int/2addr v3, v4

    const v4, 0x1aaca6

    add-int/2addr v3, v4

    move v9, v3

    goto/16 :goto_0

    :sswitch_3c
    const/16 v30, -0x2

    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    move-result v3

    if-ltz v3, :cond_2c

    move-object/from16 v45, v44

    move/from16 v34, v33

    move/from16 v32, v31

    move/from16 v4, v49

    move/from16 v3, v46

    goto/16 :goto_15

    :cond_2c
    const-string v3, "\u06e3\u06e0\u06e1"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v45, v44

    move/from16 v34, v33

    move/from16 v32, v31

    move v9, v3

    move/from16 v50, v46

    goto/16 :goto_0

    :cond_2d
    :sswitch_3d
    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    move-result v3

    if-ltz v3, :cond_2e

    const/4 v3, 0x6

    sput v3, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    const-string v3, "\u06e1\u06e8\u06e0"

    invoke-static {v3}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto/16 :goto_0

    :cond_2e
    sget v3, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    div-int/2addr v3, v4

    const v4, 0x1aa73e

    xor-int/2addr v3, v4

    move v9, v3

    goto/16 :goto_0

    :sswitch_3e
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe4 -> :sswitch_0
        0xdbe9 -> :sswitch_10
        0xdc23 -> :sswitch_2
        0xdc25 -> :sswitch_b
        0xdc5c -> :sswitch_3e
        0xdc5f -> :sswitch_3b
        0xdc9e -> :sswitch_32
        0xdcb9 -> :sswitch_13
        0xdcc1 -> :sswitch_2b
        0xdcfa -> :sswitch_3
        0x1aa702 -> :sswitch_31
        0x1aa703 -> :sswitch_5
        0x1aa73e -> :sswitch_37
        0x1aa760 -> :sswitch_39
        0x1aa761 -> :sswitch_2c
        0x1aa763 -> :sswitch_1d
        0x1aa784 -> :sswitch_33
        0x1aa7db -> :sswitch_30
        0x1aa7fb -> :sswitch_7
        0x1aa7fd -> :sswitch_28
        0x1aaaff -> :sswitch_2c
        0x1aab1d -> :sswitch_34
        0x1aab1e -> :sswitch_1a
        0x1aab26 -> :sswitch_27
        0x1aabb8 -> :sswitch_19
        0x1aabda -> :sswitch_21
        0x1aabdf -> :sswitch_2f
        0x1aaefe -> :sswitch_36
        0x1aaf5c -> :sswitch_32
        0x1aaf7b -> :sswitch_21
        0x1aaf81 -> :sswitch_29
        0x1aaf9e -> :sswitch_12
        0x1ab248 -> :sswitch_2a
        0x1ab261 -> :sswitch_1b
        0x1ab2fe -> :sswitch_7
        0x1ab605 -> :sswitch_23
        0x1ab624 -> :sswitch_2e
        0x1ab6fc -> :sswitch_3a
        0x1aba84 -> :sswitch_20
        0x1abaa3 -> :sswitch_8
        0x1abaa5 -> :sswitch_29
        0x1abae4 -> :sswitch_f
        0x1abda4 -> :sswitch_1d
        0x1abda5 -> :sswitch_1e
        0x1abda9 -> :sswitch_26
        0x1abde8 -> :sswitch_a
        0x1abdea -> :sswitch_10
        0x1abe02 -> :sswitch_22
        0x1abe21 -> :sswitch_16
        0x1abe24 -> :sswitch_9
        0x1abe85 -> :sswitch_11
        0x1abea5 -> :sswitch_d
        0x1ac14b -> :sswitch_3a
        0x1ac166 -> :sswitch_1f
        0x1ac189 -> :sswitch_1
        0x1ac18a -> :sswitch_35
        0x1ac18d -> :sswitch_c
        0x1ac1ca -> :sswitch_18
        0x1ac225 -> :sswitch_24
        0x1ac244 -> :sswitch_4
        0x1ac246 -> :sswitch_1c
        0x1ac25e -> :sswitch_3d
        0x1ac260 -> :sswitch_5
        0x1ac54b -> :sswitch_14
        0x1ac56b -> :sswitch_6
        0x1ac5aa -> :sswitch_e
        0x1ac61e -> :sswitch_25
        0x1ac623 -> :sswitch_17
        0x1ac8cf -> :sswitch_2d
        0x1ac949 -> :sswitch_38
        0x1ac94a -> :sswitch_15
        0x1ac94c -> :sswitch_3c
    .end sparse-switch
.end method

.method public static final d(Landroid/widget/LinearLayout;Ln00;)V
    .locals 10

    const/high16 v9, 0x40800000    # 4.0f

    const/4 v4, 0x0

    const/high16 v8, 0x41800000    # 16.0f

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e5\u06e7"

    invoke-static {v1}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v1

    move v3, v4

    move v2, v4

    move v5, v4

    move v6, v1

    :goto_0
    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v1, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v6, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    rem-int/lit16 v6, v6, 0x1a4

    div-int/2addr v1, v6

    if-ltz v1, :cond_0

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    const-string v1, "\u06df\u06e8\u06e6"

    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto :goto_0

    :sswitch_1
    iget v1, p1, Ln00;->a:I

    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    move-result v1

    sget v5, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v6, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    or-int/2addr v5, v6

    const v6, -0x1ac9e7

    xor-int/2addr v6, v5

    move v5, v1

    goto :goto_0

    :cond_0
    sget v1, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v6, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    div-int/2addr v1, v6

    const v6, 0x1ac147

    add-int/2addr v1, v6

    move v6, v1

    goto :goto_0

    :sswitch_2
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    sget v1, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    if-ltz v1, :cond_1

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    const-string v1, "\u06e6\u06df\u06e0"

    invoke-static {v1}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e0\u06df\u06e5"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto :goto_0

    :sswitch_3
    iget v1, p1, Ln00;->a:I

    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    move-result v2

    const-string v1, "\u06df\u06e8\u06e6"

    goto :goto_1

    :sswitch_4
    const/16 v1, 0x8

    new-array v1, v1, [F

    invoke-static {v8}, Lmp;->p(F)F

    move-result v6

    aput v6, v1, v4

    const/4 v6, 0x1

    invoke-static {v8}, Lmp;->p(F)F

    move-result v7

    aput v7, v1, v6

    const/4 v6, 0x2

    invoke-static {v8}, Lmp;->p(F)F

    move-result v7

    aput v7, v1, v6

    const/4 v6, 0x3

    invoke-static {v8}, Lmp;->p(F)F

    move-result v7

    aput v7, v1, v6

    const/4 v6, 0x4

    invoke-static {v9}, Lmp;->p(F)F

    move-result v7

    aput v7, v1, v6

    const/4 v6, 0x5

    invoke-static {v9}, Lmp;->p(F)F

    move-result v7

    aput v7, v1, v6

    const/4 v6, 0x6

    invoke-static {v8}, Lmp;->p(F)F

    move-result v7

    aput v7, v1, v6

    const/4 v6, 0x7

    invoke-static {v8}, Lmp;->p(F)F

    move-result v7

    aput v7, v1, v6

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    sget v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v6, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    or-int/lit16 v6, v6, -0x23ef

    div-int/2addr v1, v6

    if-eqz v1, :cond_2

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    const-string v1, "\u06df\u06e2\u06e2"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_2
    const-string v1, "\u06df\u06e2\u06e2"

    goto :goto_1

    :sswitch_5
    sget v1, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    xor-int/lit16 v1, v1, 0x265

    invoke-static {v1, v2, v5, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    sget v1, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v6, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    div-int/2addr v1, v6

    const v6, 0x1ac1e4

    xor-int/2addr v1, v6

    move v6, v1

    goto/16 :goto_0

    :sswitch_6
    iget v1, p1, Ln00;->a:I

    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    move-result v1

    sget v3, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v6, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    or-int/lit16 v6, v6, 0x18b2

    or-int/2addr v3, v6

    if-ltz v3, :cond_3

    const-string v3, "\u06e8\u06e3\u06e7"

    invoke-static {v3}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v6

    move v3, v1

    goto/16 :goto_0

    :cond_3
    sget v3, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v6, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    or-int/2addr v3, v6

    const v6, 0x1abe53

    add-int/2addr v6, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_7
    sget v1, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v6, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    or-int/lit16 v6, v6, 0x1969

    rem-int/2addr v1, v6

    if-eqz v1, :cond_4

    const/16 v1, 0x16

    sput v1, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    const-string v1, "\u06e0\u06e8\u06e4"

    goto/16 :goto_1

    :cond_4
    sget v1, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v6, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    mul-int/2addr v1, v6

    const v6, 0x1b69d6

    add-int/2addr v1, v6

    move v6, v1

    goto/16 :goto_0

    :sswitch_8
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa75f -> :sswitch_0
        0x1aa7c1 -> :sswitch_2
        0x1aa81d -> :sswitch_1
        0x1aaac6 -> :sswitch_3
        0x1abde2 -> :sswitch_5
        0x1ac147 -> :sswitch_8
        0x1ac1e4 -> :sswitch_4
        0x1ac94c -> :sswitch_7
        0x1ac9e4 -> :sswitch_6
    .end sparse-switch
.end method
