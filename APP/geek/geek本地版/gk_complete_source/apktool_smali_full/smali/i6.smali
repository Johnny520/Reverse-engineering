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

    const-string v1, "\u06e3\u06e2\u06e1"

    invoke-static {v1}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    move-object v3, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v4, -0x2b7

    sget v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    int-to-long v6, v2

    xor-long/2addr v4, v6

    invoke-virtual {v0, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    sget v0, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    if-gtz v0, :cond_4

    const/16 v0, 0x25

    sput v0, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    move-object v0, v1

    :cond_0
    const-string v2, "\u06e1\u06e2"

    move-object v1, v0

    :goto_1
    invoke-static {v2}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    iput-object v3, v1, Lh40;->j:Li40;

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    move-result v0

    if-gtz v0, :cond_1

    const-string v0, "\u06e6\u06e2\u06e6"

    invoke-static {v0}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e4\u06e4\u06e3"

    move-object v2, v0

    goto :goto_1

    :sswitch_2
    const/high16 v0, 0x43480000    # 200.0f

    invoke-virtual {v3, v0}, Li40;->b(F)V

    sget v0, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    if-ltz v0, :cond_2

    const/16 v0, 0x20

    sput v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    const-string v0, "\u06e3\u06e2\u06e1"

    :goto_2
    invoke-static {v0}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e6\u06e2\u06e6"

    goto :goto_2

    :sswitch_3
    new-instance v0, Lh40;

    sget-object v1, Lh40;->m:Lqh;

    invoke-direct {v0, p1, v1}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    sget v1, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    or-int/lit16 v2, v2, 0x1399

    div-int/2addr v1, v2

    if-eqz v1, :cond_0

    const-string v1, "\u06e4\u06e4\u06e3"

    invoke-static {v1}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_4
    sget v0, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v2, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    rem-int/2addr v0, v2

    const v2, -0x1ab66f

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    invoke-virtual {v1}, Lh40;->h()V

    sget v0, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v2, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    add-int/lit16 v2, v2, -0x13cd

    sub-int/2addr v0, v2

    if-gtz v0, :cond_3

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    const-string v0, "\u06e7\u06e6\u06df"

    :goto_3
    invoke-static {v0}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e0\u06e7"

    goto :goto_3

    :sswitch_6
    new-instance v0, Li40;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v2, v2

    invoke-direct {v0, v2}, Li40;-><init>(F)V

    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v3, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    rem-int/2addr v2, v3

    const v3, 0x1ac6cc

    add-int/2addr v2, v3

    move-object v3, v0

    goto/16 :goto_0

    :sswitch_7
    new-instance v0, Lc6;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lc6;-><init>(Landroid/view/KeyEvent$Callback;I)V

    invoke-virtual {v1, v0}, Lh40;->a(Lsh;)V

    sget v0, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    mul-int/2addr v0, v2

    const v2, 0x1d6f81

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06e5\u06e6\u06e8"

    move-object v2, v0

    goto/16 :goto_1

    :sswitch_8
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc07 -> :sswitch_0
        0xdc21 -> :sswitch_6
        0x1ab662 -> :sswitch_3
        0x1aba63 -> :sswitch_7
        0x1abe67 -> :sswitch_8
        0x1ac1aa -> :sswitch_1
        0x1ac23f -> :sswitch_5
        0x1ac507 -> :sswitch_4
        0x1ac5e0 -> :sswitch_2
    .end sparse-switch
.end method

.method public static final b(Lon;Ljava/lang/String;)I
    .locals 146

    const/16 v40, 0x0

    const/16 v37, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v108, 0x0

    const/16 v45, 0x0

    const/16 v36, 0x0

    const-wide/16 v136, 0x0

    const-wide/16 v62, 0x0

    const-wide/16 v74, 0x0

    const-wide/16 v98, 0x0

    const-wide/16 v104, 0x0

    const-wide/16 v24, 0x0

    const/4 v8, 0x0

    const/16 v44, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v78, 0x0

    const-wide/16 v60, 0x0

    const/16 v59, 0x0

    const-wide/16 v28, 0x0

    const-wide/16 v88, 0x0

    const-wide/16 v122, 0x0

    const/16 v27, 0x0

    const-wide/16 v42, 0x0

    const-wide/16 v120, 0x0

    const-wide/16 v48, 0x0

    const/16 v41, 0x0

    const-wide/16 v100, 0x0

    const-wide/16 v106, 0x0

    const-wide/16 v46, 0x0

    const-wide/16 v116, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v114, 0x0

    const-wide/16 v126, 0x0

    const-wide/16 v96, 0x0

    const-wide/16 v38, 0x0

    const-wide/16 v66, 0x0

    const-wide/16 v128, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v70, 0x0

    const-wide/16 v94, 0x0

    const-wide/16 v32, 0x0

    const-wide/16 v118, 0x0

    const-wide/16 v124, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v56, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v84, 0x0

    const-wide/16 v54, 0x0

    const-wide/16 v134, 0x0

    const-wide/16 v138, 0x0

    const-wide/16 v140, 0x0

    const-wide/16 v52, 0x0

    const-wide/16 v50, 0x0

    const-wide/16 v92, 0x0

    const-wide/16 v130, 0x0

    const-wide/16 v64, 0x0

    const-wide/16 v132, 0x0

    const-wide/16 v76, 0x0

    const-wide/16 v82, 0x0

    const-wide/16 v102, 0x0

    const/16 v69, 0x0

    const-wide/16 v72, 0x0

    const/16 v81, 0x0

    const-wide/16 v34, 0x0

    const-wide/16 v90, 0x0

    const/16 v31, 0x0

    const-wide/16 v86, 0x0

    const/16 v30, 0x0

    const/16 v80, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x0

    const/16 v68, 0x0

    const/16 v58, 0x0

    const/4 v4, 0x0

    const-string v9, "\u06e4\u06e3\u06e3"

    invoke-static {v9}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v109, v8

    move/from16 v110, v9

    move-wide/from16 v112, v28

    :goto_0
    sparse-switch v110, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v8, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v9, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    add-int/lit16 v9, v9, -0x6c2

    div-int/2addr v8, v9

    if-eqz v8, :cond_23

    const/16 v8, 0x30

    sput v8, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    const-string v8, "\u06e3\u06e5\u06e5"

    invoke-static {v8}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v50, v140

    goto :goto_0

    :sswitch_1
    :try_start_0
    move-object/from16 v0, v45

    iget-wide v0, v0, Lfb0;->h:D

    move-wide/from16 v28, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v8, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v9, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    xor-int/2addr v8, v9

    const v9, 0x1aad1b

    add-int/2addr v8, v9

    move/from16 v110, v8

    move-wide/from16 v126, v28

    goto :goto_0

    :sswitch_2
    const/4 v8, 0x2

    :try_start_1
    aget-wide v8, v44, v8
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-wide/from16 v28, v62

    :goto_1
    const-string v26, "\u06e6\u06e4\u06e6"

    invoke-static/range {v26 .. v26}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v26

    move/from16 v110, v26

    move-wide/from16 v60, v8

    move-wide/from16 v62, v28

    goto :goto_0

    :sswitch_3
    :try_start_2
    invoke-static/range {v116 .. v117}, Ljava/lang/Math;->signum(D)D
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-result-wide v8

    const-wide/high16 v28, 0x4079000000000000L    # 400.0

    mul-double v8, v8, v28

    mul-double v8, v8, v96

    const-wide/high16 v28, 0x4033000000000000L    # 19.0

    add-double v28, v28, v96

    const-wide v110, 0x403b2147ae147ae1L    # 27.13

    add-double v28, v28, v110

    const-wide/high16 v110, 0x4033000000000000L    # 19.0

    sub-double v28, v28, v110

    div-double v28, v8, v28

    const-string v8, "\u06e1\u06e0\u06e7"

    invoke-static {v8}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v128, v28

    goto :goto_0

    :sswitch_4
    :try_start_3
    invoke-static/range {v138 .. v139}, Ljava/lang/Math;->sqrt(D)D
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    invoke-static {}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->۟ۡۨۢ()I

    move-result v8

    if-gtz v8, :cond_0

    const/4 v8, 0x2

    sput v8, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    const-string v8, "\u06e2\u06e3\u06e5"

    invoke-static {v8}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto :goto_0

    :cond_0
    move-wide/from16 v8, v96

    :goto_2
    const-string v26, "\u06e2\u06e2\u06e0"

    invoke-static/range {v26 .. v26}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v26

    move/from16 v110, v26

    move-wide/from16 v96, v8

    goto/16 :goto_0

    :sswitch_5
    :try_start_4
    invoke-static/range {v114 .. v115}, Ljava/lang/Math;->abs(D)D

    move-result-wide v8

    mul-double v8, v8, v126

    const-wide/high16 v28, 0x4059000000000000L    # 100.0

    div-double v8, v8, v28

    const-wide v28, 0x3fdae147ae147ae1L    # 0.42

    move-wide/from16 v0, v28

    invoke-static {v8, v9, v0, v1}, Ljava/lang/Math;->pow(DD)D
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    move-result-wide v8

    sget v26, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v28, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    move/from16 v0, v28

    mul-int/lit16 v0, v0, 0x228c

    move/from16 v28, v0

    xor-int v26, v26, v28

    if-ltz v26, :cond_19

    const-string v26, "\u06e7\u06e4\u06e6"

    invoke-static/range {v26 .. v26}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v26

    move/from16 v110, v26

    move-wide/from16 v66, v8

    goto/16 :goto_0

    :cond_1
    :sswitch_6
    sget v8, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    if-gtz v8, :cond_2

    const/16 v8, 0x4a

    sput v8, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    const-string v8, "\u06e8\u06e1\u06e8"

    invoke-static {v8}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :cond_2
    sget v8, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v9, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sub-int/2addr v8, v9

    const v9, 0x1aa2ad

    add-int/2addr v8, v9

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_7
    const/4 v8, 0x1

    :try_start_5
    aget-wide v8, v41, v8
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    mul-double v14, v122, v24

    const-wide/high16 v28, 0x4022000000000000L    # 9.0

    sub-double v14, v14, v28

    mul-double v28, v88, v104

    const-wide/16 v110, 0x0

    mul-double v142, v112, v98

    sub-double v110, v110, v142

    sub-double v28, v28, v110

    add-double v14, v14, v28

    const-wide/high16 v28, 0x4022000000000000L    # 9.0

    add-double v14, v14, v28

    mul-double/2addr v8, v14

    sget v14, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v15, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    add-int/lit16 v15, v15, -0x178c

    mul-int/2addr v14, v15

    if-gtz v14, :cond_3

    const/16 v14, 0x5e

    sput v14, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    :goto_3
    const-string v14, "\u06df\u06e4\u06e8"

    invoke-static {v14}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v26

    move/from16 v110, v26

    move-wide v14, v8

    goto/16 :goto_0

    :cond_3
    const-string v14, "\u06e3\u06e7\u06e1"

    move-object/from16 v26, v14

    move-wide/from16 v28, v8

    :goto_4
    invoke-static/range {v26 .. v26}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v14, v28

    goto/16 :goto_0

    :sswitch_8
    const-string v8, "\u06e7\u06e4"

    invoke-static {v8}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v54, v18

    goto/16 :goto_0

    :sswitch_9
    :try_start_6
    move-wide/from16 v0, v94

    move-wide/from16 v2, v32

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->hypot(DD)D
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    move-result-wide v8

    const-wide/high16 v28, 0x4030000000000000L    # 16.0

    sub-double v28, v92, v28

    const-wide v110, 0x400e666666666666L    # 3.8

    add-double v28, v28, v110

    const-wide/high16 v110, 0x4030000000000000L    # 16.0

    add-double v28, v28, v110

    const-wide/high16 v110, 0x3fd0000000000000L    # 0.25

    mul-double v28, v28, v110

    const-wide v110, 0x40ae0c4ec4ec4ec5L    # 3846.153846153846

    mul-double v28, v28, v110

    mul-double v28, v28, v130

    mul-double v28, v28, v64

    mul-double v8, v8, v28

    const-wide v28, 0x3fd3851eb851eb85L    # 0.305

    const-wide/16 v110, 0x0

    sub-double v110, v110, v124

    sub-double v28, v28, v110

    div-double v28, v8, v28

    const-string v8, "\u06e4\u06e7\u06e0"

    invoke-static {v8}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v132, v28

    goto/16 :goto_0

    :sswitch_a
    sget v8, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v9, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    div-int/lit16 v9, v9, 0x1034

    mul-int/2addr v8, v9

    if-eqz v8, :cond_4

    const/16 v8, 0x16

    sput v8, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    move/from16 v8, v16

    :goto_5
    const-string v9, "\u06e4\u06e7\u06e5"

    invoke-static {v9}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v110, v9

    move/from16 v17, v8

    goto/16 :goto_0

    :cond_4
    sget v8, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v9, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    mul-int/2addr v8, v9

    const v9, -0x1b8909

    xor-int/2addr v8, v9

    move/from16 v110, v8

    move/from16 v17, v16

    goto/16 :goto_0

    :sswitch_b
    const/4 v8, 0x0

    :try_start_7
    aget-wide v20, v44, v8
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    sget v8, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v9, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    add-int/lit8 v9, v9, 0x2c

    add-int/2addr v8, v9

    if-ltz v8, :cond_5

    const/16 v8, 0xa

    sput v8, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    const-string v8, "\u06e3\u06e0\u06e6"

    :goto_6
    invoke-static {v8}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :cond_5
    const-string v8, "\u06e6\u06e2\u06e2"

    :goto_7
    invoke-static {v8}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_c
    const-wide v8, 0x3fd5555555555555L    # 0.3333333333333333

    :try_start_8
    move-wide/from16 v0, v86

    invoke-static {v0, v1, v8, v9}, Ljava/lang/Math;->pow(DD)D
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    sget v8, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    if-ltz v8, :cond_6

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    move-wide/from16 v8, v24

    :goto_8
    const-string v24, "\u06e7\u06e7\u06e0"

    move-object/from16 v26, v24

    move-wide/from16 v28, v8

    :goto_9
    invoke-static/range {v26 .. v26}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v24, v28

    goto/16 :goto_0

    :cond_6
    sget v8, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v9, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sub-int/2addr v8, v9

    const v9, 0x1ab715

    add-int/2addr v8, v9

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_d
    const-wide/high16 v8, 0x4049000000000000L    # 50.0

    :try_start_9
    move-wide/from16 v0, v102

    invoke-static {v0, v1, v8, v9}, Ljava/lang/Math;->max(DD)D

    move-result-wide v8

    move-wide/from16 v0, v54

    invoke-static {v0, v1, v8, v9}, Lb70;->a(DD)Lb70;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    move-result-object v8

    sget v9, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v26, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    move/from16 v0, v26

    or-int/lit16 v0, v0, 0x20d

    move/from16 v26, v0

    or-int v9, v9, v26

    if-ltz v9, :cond_7

    const/16 v9, 0x1d

    sput v9, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    const-string v9, "\u06df\u06e3\u06e0"

    invoke-static {v9}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v30, v8

    move/from16 v110, v9

    goto/16 :goto_0

    :sswitch_e
    mul-double v8, v82, v106

    const-wide/high16 v28, 0x403d000000000000L    # 29.0

    add-double v28, v28, v46

    const-wide/high16 v110, 0x4010000000000000L    # 4.0

    add-double v28, v28, v110

    const-wide/high16 v110, 0x403d000000000000L    # 29.0

    sub-double v28, v28, v110

    div-double v8, v8, v28

    :try_start_a
    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    sget v8, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v9, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    xor-int/lit16 v9, v9, 0x1a38

    or-int/2addr v8, v9

    if-ltz v8, :cond_2e

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    move-object/from16 v8, v30

    :cond_7
    const-string v9, "\u06e8\u06e6\u06e4"

    invoke-static {v9}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v30, v8

    move/from16 v110, v9

    goto/16 :goto_0

    :sswitch_f
    const/4 v8, 0x0

    :try_start_b
    aget-wide v28, v59, v8
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    move-result v8

    if-gtz v8, :cond_8

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    const-string v8, "\u06df\u06e7\u06e4"

    invoke-static {v8}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v112, v28

    goto/16 :goto_0

    :cond_8
    const-string v8, "\u06e1\u06e5\u06e3"

    invoke-static {v8}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v112, v28

    goto/16 :goto_0

    :sswitch_10
    const-wide/16 v8, 0x0

    const-wide/16 v28, 0x0

    const-wide/high16 v94, -0x3fd8000000000000L    # -12.0

    mul-double v94, v94, v22

    const-wide/16 v110, 0x0

    const-wide/high16 v142, 0x4026000000000000L    # 11.0

    mul-double v142, v142, v128

    sub-double v110, v110, v142

    sub-double v94, v94, v110

    sub-double v28, v28, v94

    sub-double v28, v28, v70

    sub-double v8, v8, v28

    const-wide/high16 v28, 0x4026000000000000L    # 11.0

    div-double v28, v8, v28

    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    move-result v8

    if-gtz v8, :cond_9

    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    const-string v8, "\u06e5\u06e1\u06e7"

    invoke-static {v8}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v94, v28

    goto/16 :goto_0

    :cond_9
    const-string v8, "\u06df\u06e8\u06e8"

    move-wide/from16 v94, v28

    :goto_a
    invoke-static {v8}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_11
    :try_start_c
    move-object/from16 v0, v45

    iget-wide v0, v0, Lfb0;->d:D

    move-wide/from16 v106, v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    const-string v8, "\u06e0\u06e4\u06e3"

    move-wide/from16 v28, v104

    :goto_b
    invoke-static {v8}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v104, v28

    goto/16 :goto_0

    :sswitch_12
    :try_start_d
    move-object/from16 v0, v45

    iget-wide v0, v0, Lfb0;->c:D

    move-wide/from16 v28, v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0

    const-string v8, "\u06e4\u06e8"

    move-object/from16 v9, v59

    :goto_c
    invoke-static {v8}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v59, v9

    move/from16 v110, v8

    move-wide/from16 v64, v28

    goto/16 :goto_0

    :sswitch_13
    move/from16 v0, v81

    xor-int/lit16 v8, v0, -0x100

    and-int v8, v8, v81

    :try_start_e
    invoke-static {v8}, La80;->s(I)D
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0

    move-result-wide v28

    sget v8, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    if-gtz v8, :cond_a

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    move-wide/from16 v8, v32

    :goto_d
    const-string v26, "\u06df\u06e5\u06e5"

    invoke-static/range {v26 .. v26}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v26

    move/from16 v110, v26

    move-wide/from16 v32, v8

    move-wide/from16 v34, v28

    goto/16 :goto_0

    :cond_a
    const-string v8, "\u06e8\u06df\u06e3"

    invoke-static {v8}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v34, v28

    goto/16 :goto_0

    :sswitch_14
    mul-double v8, v102, v100

    const-wide v28, 0x3f9758e219652bd4L    # 0.0228

    mul-double v8, v8, v28

    :try_start_f
    invoke-static {v8, v9}, Ljava/lang/Math;->log1p(D)D
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_0

    sget v8, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v9, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    add-int/lit16 v9, v9, 0x1026

    add-int/2addr v8, v9

    if-gtz v8, :cond_13

    const/16 v8, 0x15

    sput v8, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    const-string v8, "\u06e5\u06e2\u06df"

    invoke-static {v8}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_15
    :try_start_10
    sget-object v8, La80;->b:[[D
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_0

    sget v9, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v26, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, -0x1065

    move/from16 v26, v0

    div-int v9, v9, v26

    if-eqz v9, :cond_b

    :goto_e
    const-string v9, "\u06df\u06df\u06df"

    invoke-static {v9}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v31, v8

    move/from16 v110, v9

    goto/16 :goto_0

    :cond_b
    const-string v9, "\u06e3\u06df\u06e3"

    move-object/from16 v31, v8

    move-wide/from16 v28, v102

    :goto_f
    invoke-static {v9}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v102, v28

    goto/16 :goto_0

    :sswitch_16
    move/from16 v0, v108

    xor-int/lit16 v8, v0, -0x100

    and-int v9, v108, v8

    sget v8, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v26, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    move/from16 v0, v26

    add-int/lit16 v0, v0, -0x1125

    move/from16 v26, v0

    rem-int v8, v8, v26

    if-ltz v8, :cond_35

    const-string v8, "\u06e3\u06e8\u06e8"

    move-wide/from16 v28, v38

    :goto_10
    invoke-static {v8}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v36, v9

    move/from16 v110, v8

    move-wide/from16 v38, v28

    goto/16 :goto_0

    :sswitch_17
    move-object/from16 v0, p0

    iget-boolean v9, v0, Lon;->p:Z

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p1

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v26, "_"

    move-object/from16 v0, v26

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    sget v26, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    if-ltz v26, :cond_c

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    move-wide/from16 v28, v42

    :goto_11
    const-string v26, "\u06e3\u06e7\u06e7"

    invoke-static/range {v26 .. v26}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v26

    move-object/from16 v37, v8

    move/from16 v40, v9

    move/from16 v110, v26

    move-wide/from16 v42, v28

    goto/16 :goto_0

    :cond_c
    const-string v26, "\u06e5\u06e6\u06e0"

    move/from16 v40, v9

    :goto_12
    invoke-static/range {v26 .. v26}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v37, v8

    move/from16 v110, v9

    goto/16 :goto_0

    :sswitch_18
    const/16 v16, 0x2d

    sget v8, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v9, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    mul-int/lit16 v9, v9, -0x697

    mul-int/2addr v8, v9

    if-ltz v8, :cond_41

    const/16 v8, 0x42

    sput v8, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    move-object/from16 v8, v41

    :cond_d
    const-string v9, "\u06e6\u06e6\u06e5"

    invoke-static {v9}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v41, v8

    move/from16 v110, v9

    goto/16 :goto_0

    :sswitch_19
    shr-int/lit8 v26, v108, 0x8

    sget v8, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v9, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    rem-int/lit16 v9, v9, 0x14d2

    xor-int/2addr v8, v9

    if-gtz v8, :cond_e

    const/16 v8, 0x3e

    sput v8, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    const-string v8, "\u06e2\u06e5\u06e5"

    invoke-static {v8}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v81, v26

    move/from16 v110, v8

    goto/16 :goto_0

    :cond_e
    const-string v8, "\u06df\u06e8\u06e1"

    move-object v9, v8

    :goto_13
    invoke-static {v9}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v8

    move/from16 v81, v26

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_1a
    :try_start_11
    invoke-static/range {v138 .. v139}, Ljava/lang/Math;->sqrt(D)D
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_0

    move-result-wide v8

    mul-double v28, v8, v82

    sget v8, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    if-ltz v8, :cond_f

    const-string v8, "\u06e4\u06e3\u06e3"

    invoke-static {v8}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v102, v28

    goto/16 :goto_0

    :cond_f
    const-string v8, "\u06e7\u06e6\u06e5"

    move-object v9, v8

    goto/16 :goto_f

    :cond_10
    :sswitch_1b
    sget v8, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v9, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    div-int/2addr v8, v9

    const v9, 0x1ab303

    add-int/2addr v8, v9

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_1c
    const-wide v8, 0x3ffa3d70a3d70a3dL    # 1.64

    const-wide/high16 v28, 0x403a000000000000L    # 26.0

    sub-double v8, v8, v28

    const-wide v28, 0x3fd28f5c28f5c28fL    # 0.29

    :try_start_12
    move-object/from16 v0, v45

    iget-wide v0, v0, Lfb0;->f:D

    move-wide/from16 v110, v0

    move-wide/from16 v0, v28

    move-wide/from16 v2, v110

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v28

    sub-double v8, v8, v28

    const-wide/high16 v28, 0x403a000000000000L    # 26.0

    add-double v8, v8, v28

    const-wide v28, 0x3fe75c28f5c28f5cL    # 0.73

    move-wide/from16 v0, v28

    invoke-static {v8, v9, v0, v1}, Ljava/lang/Math;->pow(DD)D
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_0

    move-result-wide v28

    const-string v8, "\u06e5\u06e8\u06e4"

    move-object v9, v8

    move-wide/from16 v76, v28

    :goto_14
    invoke-static {v9}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_1d
    const/4 v8, 0x2

    :try_start_13
    aget-wide v28, v59, v8
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_0

    sget v8, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v9, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    xor-int/lit16 v9, v9, 0x50b

    div-int/2addr v8, v9

    if-eqz v8, :cond_11

    const/16 v8, 0x31

    sput v8, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    const-string v8, "\u06e1\u06e5\u06e1"

    invoke-static {v8}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v122, v28

    goto/16 :goto_0

    :cond_11
    sget v8, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v9, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    div-int/2addr v8, v9

    const v9, 0x1aa763

    xor-int/2addr v8, v9

    move/from16 v110, v8

    move-wide/from16 v122, v28

    goto/16 :goto_0

    :sswitch_1e
    const/4 v8, 0x0

    :try_start_14
    aget-object v8, v109, v8
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_0

    sget v9, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v26, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    move/from16 v0, v26

    add-int/lit16 v0, v0, -0x1e27

    move/from16 v26, v0

    or-int v9, v9, v26

    if-ltz v9, :cond_12

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    move-wide/from16 v28, v46

    :goto_15
    const-string v9, "\u06e6\u06e4\u06e5"

    move-object/from16 v44, v8

    move-wide/from16 v46, v28

    :goto_16
    invoke-static {v9}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :cond_12
    sget v9, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v26, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    add-int v9, v9, v26

    const v26, 0x1ac2b5

    xor-int v9, v9, v26

    move-object/from16 v44, v8

    move/from16 v110, v9

    goto/16 :goto_0

    :sswitch_1f
    const-wide/16 v8, 0x0

    const-wide/high16 v12, 0x4044000000000000L    # 40.0

    mul-double v12, v12, v128

    const-wide/high16 v28, 0x4031000000000000L    # 17.0

    sub-double v12, v12, v28

    add-double v12, v12, v118

    const-wide/high16 v28, 0x4031000000000000L    # 17.0

    add-double v12, v12, v28

    sub-double/2addr v8, v12

    sub-double v8, v70, v8

    const-wide/high16 v12, 0x4034000000000000L    # 20.0

    div-double v12, v8, v12

    sget v8, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v9, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    xor-int/lit16 v9, v9, 0xdcf

    sub-int/2addr v8, v9

    if-ltz v8, :cond_14

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    :cond_13
    const-string v8, "\u06e2\u06e1\u06e6"

    invoke-static {v8}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :cond_14
    const-string v8, "\u06df\u06e1\u06e3"

    move-object v9, v4

    :goto_17
    invoke-static {v8}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v8

    move-object v4, v9

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_20
    sget v8, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v9, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    xor-int/2addr v8, v9

    const v9, 0x1abe78

    add-int/2addr v8, v9

    move-object/from16 v58, v68

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_21
    const-string v8, "\u06e2\u06df\u06e2"

    invoke-static {v8}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_22
    :try_start_15
    move-wide/from16 v0, v32

    move-wide/from16 v2, v94

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Math;->toDegrees(D)D
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_0

    move-result-wide v8

    sget v26, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    if-gtz v26, :cond_15

    const/16 v26, 0x5b

    sput v26, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    :goto_18
    const-string v26, "\u06e4\u06df\u06e2"

    move-object/from16 v28, v45

    move-wide/from16 v56, v8

    :goto_19
    invoke-static/range {v26 .. v26}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v45, v28

    move/from16 v110, v8

    goto/16 :goto_0

    :cond_15
    sget v26, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v28, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    div-int v26, v26, v28

    const v28, 0x1ac223

    add-int v26, v26, v28

    move/from16 v110, v26

    move-wide/from16 v56, v8

    goto/16 :goto_0

    :sswitch_23
    const-wide v8, 0x3fee693974c0c730L    # 0.95034478

    mul-double v8, v8, v74

    const-wide/high16 v24, 0x4000000000000000L    # 2.0

    sub-double v8, v8, v24

    const-wide v24, 0x3fbe818525c434ceL    # 0.11916382

    mul-double v24, v24, v62

    const-wide/high16 v28, 0x4010000000000000L    # 4.0

    sub-double v24, v24, v28

    const-wide v28, 0x3f93c8fde0401c25L    # 0.01932141

    mul-double v28, v28, v136

    add-double v24, v24, v28

    const-wide/high16 v28, 0x4010000000000000L    # 4.0

    add-double v24, v24, v28

    add-double v8, v8, v24

    const-wide/high16 v24, 0x4000000000000000L    # 2.0

    add-double v8, v8, v24

    goto/16 :goto_8

    :sswitch_24
    sget v8, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v9, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sub-int/2addr v8, v9

    const v9, -0x1abb98

    xor-int/2addr v8, v9

    move/from16 v110, v8

    move-wide/from16 v54, v56

    goto/16 :goto_0

    :sswitch_25
    :try_start_16
    move-object/from16 v0, v45

    iget-wide v0, v0, Lfb0;->a:D

    move-wide/from16 v28, v0
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_0

    sget v8, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v9, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    add-int/lit16 v9, v9, -0x9d3

    or-int/2addr v8, v9

    if-ltz v8, :cond_16

    const/16 v8, 0x38

    sput v8, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    const-string v8, "\u06df\u06e2\u06e0"

    move-object v9, v4

    :goto_1a
    invoke-static {v8}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v8

    move-object v4, v9

    move/from16 v110, v8

    move-wide/from16 v46, v28

    goto/16 :goto_0

    :cond_16
    move-object/from16 v8, v44

    goto/16 :goto_15

    :sswitch_26
    const v8, 0xff00

    xor-int/lit8 v9, v108, -0x1

    const v26, 0xff00

    xor-int v9, v9, v26

    and-int/2addr v8, v9

    shr-int/lit8 v8, v8, 0x8

    :try_start_17
    invoke-static {v8}, La80;->s(I)D
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_0

    move-result-wide v28

    sget v8, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v9, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    rem-int/lit16 v9, v9, -0x1842

    mul-int/2addr v8, v9

    if-gtz v8, :cond_17

    move-wide/from16 v8, v60

    goto/16 :goto_1

    :cond_17
    sget v8, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v9, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    xor-int/2addr v8, v9

    const v9, 0x1aa7a3

    add-int/2addr v8, v9

    move/from16 v110, v8

    move-wide/from16 v62, v28

    goto/16 :goto_0

    :sswitch_27
    const/4 v8, 0x1

    :try_start_18
    aget-object v9, v109, v8
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_0

    sget v8, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    if-gtz v8, :cond_18

    const-string v8, "\u06e0\u06e3\u06e8"

    move-wide/from16 v28, v64

    goto/16 :goto_c

    :cond_18
    sget v8, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v26, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sub-int v8, v8, v26

    const v26, 0x1aaf7c

    add-int v8, v8, v26

    move-object/from16 v59, v9

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_28
    :try_start_19
    sget-object v8, La80;->a:[[D
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_0

    sget v9, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v26, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    or-int v9, v9, v26

    const v26, -0x1ab234

    xor-int v9, v9, v26

    move-object/from16 v109, v8

    move/from16 v110, v9

    goto/16 :goto_0

    :sswitch_29
    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    move-result v8

    if-gtz v8, :cond_1a

    const/16 v8, 0x47

    sput v8, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    move-wide/from16 v8, v66

    :cond_19
    const-string v26, "\u06e5\u06e6\u06e1"

    move-wide/from16 v66, v8

    :goto_1b
    invoke-static/range {v26 .. v26}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :cond_1a
    const-string v8, "\u06e1\u06e2\u06e8"

    :goto_1c
    invoke-static {v8}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_2a
    const-wide v8, 0x403423d70a3d70a4L    # 20.14

    cmpg-double v8, v54, v8

    if-gez v8, :cond_4f

    const-wide v8, 0x4076800000000000L    # 360.0

    const-wide/16 v28, 0x0

    sub-double v28, v28, v54

    sub-double v140, v8, v28

    sget v8, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    if-ltz v8, :cond_1b

    const/16 v8, 0x5d

    sput v8, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    const-string v8, "\u06e3\u06e3\u06e4"

    invoke-static {v8}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :cond_1b
    sget v8, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v9, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    mul-int/2addr v8, v9

    const v9, 0x6d92d

    add-int/2addr v8, v9

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_2b
    move-object/from16 v8, v68

    :cond_1c
    const-string v9, "\u06e1\u06e6\u06e4"

    move-object/from16 v68, v8

    move-wide/from16 v28, v86

    :goto_1d
    invoke-static {v9}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v86, v28

    goto/16 :goto_0

    :cond_1d
    :sswitch_2c
    const-string v8, "\u06e6\u06e2\u06e4"

    :goto_1e
    invoke-static {v8}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_2d
    :try_start_1a
    invoke-static/range {v114 .. v115}, Ljava/lang/Math;->signum(D)D
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_0

    move-result-wide v8

    const-wide/high16 v28, 0x4079000000000000L    # 400.0

    mul-double v8, v8, v28

    mul-double v8, v8, v66

    const-wide v28, 0x403b2147ae147ae1L    # 27.13

    const-wide/16 v70, 0x0

    sub-double v70, v70, v66

    sub-double v28, v28, v70

    div-double v8, v8, v28

    sget v26, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    if-gtz v26, :cond_1e

    move-wide/from16 v28, v72

    :goto_1f
    const-string v26, "\u06df\u06e1\u06e1"

    invoke-static/range {v26 .. v26}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v26

    move/from16 v110, v26

    move-wide/from16 v70, v8

    move-wide/from16 v72, v28

    goto/16 :goto_0

    :cond_1e
    const-string v26, "\u06e4\u06e8\u06e4"

    move-wide/from16 v70, v8

    :goto_20
    invoke-static/range {v26 .. v26}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_2e
    sget v4, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    if-gtz v4, :cond_1f

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    const-string v4, "\u06e4\u06e2\u06e7"

    invoke-static {v4}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v4, v58

    move/from16 v110, v8

    goto/16 :goto_0

    :cond_1f
    const-string v4, "\u06df\u06e3\u06e0"

    move-object v8, v4

    move-object/from16 v9, v58

    move-wide/from16 v28, v46

    goto/16 :goto_1a

    :sswitch_2f
    if-nez v7, :cond_1

    sget v8, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v9, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    or-int/lit16 v9, v9, -0x207d

    div-int/2addr v8, v9

    if-eqz v8, :cond_20

    const-string v8, "\u06e6\u06df\u06e3"

    invoke-static {v8}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :cond_20
    move-wide v8, v14

    goto/16 :goto_3

    :sswitch_30
    const-string v8, "\u06e6\u06e5\u06e2"

    :goto_21
    invoke-static {v8}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_31
    :try_start_1b
    invoke-static/range {v36 .. v36}, La80;->s(I)D
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_0

    move-result-wide v28

    sget v8, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v9, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    add-int/lit16 v9, v9, -0xbc8

    or-int/2addr v8, v9

    if-ltz v8, :cond_21

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    move/from16 v8, v69

    :goto_22
    const-string v9, "\u06e8\u06e3\u06e8"

    move/from16 v69, v8

    move-wide/from16 v74, v28

    goto/16 :goto_14

    :cond_21
    const-string v8, "\u06e5\u06e1\u06e7"

    :goto_23
    invoke-static {v8}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v74, v28

    goto/16 :goto_0

    :sswitch_32
    sget v8, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v9, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    add-int/lit16 v9, v9, -0x18a

    rem-int/2addr v8, v9

    if-ltz v8, :cond_22

    const/16 v8, 0x32

    sput v8, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    const-string v8, "\u06e7\u06e5\u06e6"

    invoke-static {v8}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :cond_22
    const-string v8, "\u06e2\u06e2\u06e8"

    move-wide/from16 v28, v88

    :goto_24
    invoke-static {v8}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v88, v28

    goto/16 :goto_0

    :sswitch_33
    const/4 v8, 0x2

    :try_start_1c
    aget-wide v28, v27, v8
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_0

    const-string v8, "\u06e6\u06e8\u06e5"

    move-object v9, v8

    move-wide/from16 v48, v28

    goto/16 :goto_16

    :cond_23
    const-string v8, "\u06e2\u06df\u06e5"

    invoke-static {v8}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v50, v140

    goto/16 :goto_0

    :sswitch_34
    const-wide v8, 0x4076800000000000L    # 360.0

    cmpl-double v8, v56, v8

    if-ltz v8, :cond_1d

    const-wide/high16 v8, 0x401c000000000000L    # 7.0

    sub-double v8, v56, v8

    const-wide v28, 0x4076800000000000L    # 360.0

    sub-double v8, v8, v28

    const-wide/high16 v28, 0x401c000000000000L    # 7.0

    add-double v84, v8, v28

    const-string v8, "\u06e4\u06e2\u06e7"

    move-object/from16 v26, v8

    move-wide/from16 v28, v14

    goto/16 :goto_4

    :sswitch_35
    :try_start_1d
    invoke-static/range {v50 .. v51}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v8

    const-wide/high16 v28, 0x4014000000000000L    # 5.0

    add-double v8, v8, v28

    const-wide/high16 v28, 0x4000000000000000L    # 2.0

    add-double v8, v8, v28

    const-wide/high16 v28, 0x4014000000000000L    # 5.0

    sub-double v8, v8, v28

    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_0

    move-result-wide v8

    sget v26, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    if-gtz v26, :cond_24

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    const-string v26, "\u06e3\u06e3"

    invoke-static/range {v26 .. v26}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v26

    move/from16 v110, v26

    move-wide/from16 v92, v8

    goto/16 :goto_0

    :cond_24
    move-wide/from16 v28, v8

    :goto_25
    const-string v8, "\u06e7\u06e2\u06e4"

    move-wide/from16 v92, v28

    goto/16 :goto_a

    :catch_0
    move-exception v8

    const-string v8, "98LSC6R1PA==\n"

    const-string v9, "1PLiSpAzev4=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    sget v8, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v9, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    rem-int/lit16 v9, v9, 0x619

    rem-int/2addr v8, v9

    if-ltz v8, :cond_25

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    const-string v8, "\u06e2\u06e5\u06e0"

    invoke-static {v8}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :cond_25
    move-object/from16 v8, v31

    goto/16 :goto_e

    :sswitch_36
    :try_start_1e
    invoke-static/range {v54 .. v55}, Ljava/lang/Math;->toRadians(D)D
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_0

    move-result-wide v28

    sget v8, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v9, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    xor-int/2addr v8, v9

    const v9, 0x1ac0df

    add-int/2addr v8, v9

    move/from16 v110, v8

    move-wide/from16 v134, v28

    goto/16 :goto_0

    :sswitch_37
    :try_start_1f
    move-object/from16 v0, v30

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Lb70;->b(I)I
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_0

    move-result v11

    sget v8, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v9, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    div-int/lit16 v9, v9, 0x2223

    sub-int/2addr v8, v9

    if-gtz v8, :cond_27

    move-wide/from16 v8, v78

    :cond_26
    const-string v26, "\u06df\u06e3\u06e6"

    invoke-static/range {v26 .. v26}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v26

    move/from16 v110, v26

    move-wide/from16 v78, v8

    goto/16 :goto_0

    :cond_27
    const-string v8, "\u06e5\u06e7\u06e6"

    move-object/from16 v26, v8

    goto/16 :goto_1b

    :sswitch_38
    sget v8, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v9, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    xor-int/lit16 v9, v9, 0x12dd

    add-int/2addr v8, v9

    if-gtz v8, :cond_28

    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    const-string v8, "\u06e5\u06e3\u06e8"

    invoke-static {v8}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :cond_28
    sget v8, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v9, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    xor-int/2addr v8, v9

    const v9, 0x1ac189

    add-int/2addr v8, v9

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_39
    sget v8, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v9, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    rem-int/lit16 v9, v9, -0x119f

    add-int/2addr v8, v9

    if-gtz v8, :cond_29

    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    const-string v8, "\u06e2\u06e8\u06e4"

    move/from16 v17, v80

    move-wide/from16 v28, v82

    :goto_26
    invoke-static {v8}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v82, v28

    goto/16 :goto_0

    :cond_29
    sget v8, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v9, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    xor-int/2addr v8, v9

    const v9, 0x1ac68d

    add-int/2addr v8, v9

    move/from16 v110, v8

    move/from16 v17, v80

    goto/16 :goto_0

    :sswitch_3a
    const/4 v8, 0x0

    :try_start_20
    aget-wide v28, v27, v8
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_0

    sget v8, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v9, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    add-int/lit16 v9, v9, 0x570

    add-int/2addr v8, v9

    if-gtz v8, :cond_2a

    const/16 v8, 0x26

    sput v8, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    const-string v8, "\u06e5\u06e8\u06e4"

    invoke-static {v8}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v42, v28

    goto/16 :goto_0

    :cond_2a
    move-object/from16 v8, v37

    move/from16 v9, v40

    goto/16 :goto_11

    :sswitch_3b
    :try_start_21
    invoke-static/range {v134 .. v135}, Ljava/lang/Math;->cos(D)D
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_0

    sget v8, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v9, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    add-int/lit16 v9, v9, 0x1208

    div-int/2addr v8, v9

    if-eqz v8, :cond_2b

    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    const-string v8, "\u06e3\u06df\u06e3"

    invoke-static {v8}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :cond_2b
    sget v8, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v9, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    or-int/2addr v8, v9

    const v9, 0x1aca3b

    add-int/2addr v8, v9

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_3c
    const/4 v8, 0x0

    :try_start_22
    aget-wide v8, v41, v8
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_0

    mul-double v28, v60, v24

    const-wide/high16 v110, 0x4040000000000000L    # 32.0

    sub-double v28, v28, v110

    mul-double v110, v78, v104

    const-wide/high16 v116, 0x4035000000000000L    # 21.0

    sub-double v110, v110, v116

    mul-double v116, v20, v98

    add-double v110, v110, v116

    const-wide/high16 v116, 0x4035000000000000L    # 21.0

    add-double v110, v110, v116

    add-double v28, v28, v110

    const-wide/high16 v110, 0x4040000000000000L    # 32.0

    add-double v28, v28, v110

    mul-double v28, v28, v8

    sget v8, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    if-gtz v8, :cond_2c

    const-string v8, "\u06e5\u06e0\u06e0"

    invoke-static {v8}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v116, v28

    goto/16 :goto_0

    :cond_2c
    sget v8, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v9, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    mul-int/2addr v8, v9

    const v9, 0x1b6802

    xor-int/2addr v8, v9

    move/from16 v110, v8

    move-wide/from16 v116, v28

    goto/16 :goto_0

    :sswitch_3d
    const-wide/high16 v8, 0x4034000000000000L    # 20.0

    mul-double v28, v22, v8

    sget v8, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v9, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    rem-int/2addr v8, v9

    const v9, 0xdcf9

    add-int/2addr v8, v9

    move/from16 v110, v8

    move-wide/from16 v118, v28

    goto/16 :goto_0

    :sswitch_3e
    const/4 v8, 0x2

    :try_start_23
    aget-object v9, v109, v8
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_0

    sget v8, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v26, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    move/from16 v0, v26

    rem-int/lit16 v0, v0, -0x1a8c

    move/from16 v26, v0

    div-int v8, v8, v26

    if-eqz v8, :cond_2d

    const/16 v8, 0x63

    sput v8, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    const-string v8, "\u06e8\u06e0"

    move-object/from16 v27, v9

    goto/16 :goto_1c

    :cond_2d
    const-string v8, "\u06e3\u06e8\u06e8"

    move-object/from16 v26, v8

    move-object/from16 v27, v9

    move-wide/from16 v28, v24

    goto/16 :goto_9

    :sswitch_3f
    sget v8, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v9, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    add-int/lit16 v9, v9, -0x1651

    or-int/2addr v8, v9

    if-ltz v8, :cond_2f

    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    move-wide/from16 v54, v84

    :cond_2e
    const-string v8, "\u06e1\u06e4\u06e3"

    invoke-static {v8}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :cond_2f
    sget v8, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v9, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    rem-int/2addr v8, v9

    const v9, 0x1ac0db

    add-int/2addr v8, v9

    move/from16 v110, v8

    move-wide/from16 v54, v84

    goto/16 :goto_0

    :sswitch_40
    sget v8, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    if-ltz v8, :cond_30

    const/16 v8, 0x44

    sput v8, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    const-string v8, "\u06df\u06e7\u06e3"

    move-object v9, v8

    move-wide/from16 v28, v86

    goto/16 :goto_1d

    :cond_30
    sget v8, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v9, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sub-int/2addr v8, v9

    const v9, 0x1ab862

    add-int/2addr v8, v9

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_41
    :try_start_24
    invoke-static/range {v134 .. v135}, Ljava/lang/Math;->sin(D)D
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_0

    shr-int/lit8 v8, v108, 0x10

    sget v9, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v26, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    move/from16 v0, v26

    rem-int/lit16 v0, v0, 0x1247

    move/from16 v26, v0

    add-int v9, v9, v26

    if-gtz v9, :cond_31

    const/16 v9, 0x53

    sput v9, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    const-string v9, "\u06e6\u06e2\u06e2"

    invoke-static {v9}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v9

    move/from16 v69, v8

    move/from16 v110, v9

    goto/16 :goto_0

    :cond_31
    move-wide/from16 v28, v74

    goto/16 :goto_22

    :sswitch_42
    sget v8, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v9, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    div-int/lit16 v9, v9, -0x1ed5

    xor-int/2addr v8, v9

    if-ltz v8, :cond_32

    const/16 v8, 0x40

    sput v8, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    const-string v8, "\u06df\u06e1\u06df"

    invoke-static {v8}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :cond_32
    sget v8, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v9, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    mul-int/2addr v8, v9

    const v9, 0x1a0c22

    xor-int/2addr v8, v9

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_43
    const-wide v8, 0x3feccccccccccccdL    # 0.9

    :try_start_25
    move-wide/from16 v0, v132

    invoke-static {v0, v1, v8, v9}, Ljava/lang/Math;->pow(DD)D
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_0

    move-result-wide v8

    mul-double v28, v8, v76

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    move-result v8

    if-ltz v8, :cond_33

    const-string v8, "\u06e0\u06e2\u06e0"

    invoke-static {v8}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v82, v28

    goto/16 :goto_0

    :cond_33
    const-string v8, "\u06e1\u06e5\u06e1"

    goto/16 :goto_26

    :sswitch_44
    :try_start_26
    invoke-static/range {v36 .. v36}, La80;->s(I)D
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_26} :catch_0

    move-result-wide v28

    const-string v8, "\u06df\u06e2\u06e0"

    :goto_27
    invoke-static {v8}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v90, v28

    goto/16 :goto_0

    :sswitch_45
    const/4 v8, 0x1

    :try_start_27
    aget-wide v28, v59, v8
    :try_end_27
    .catch Ljava/lang/Exception; {:try_start_27 .. :try_end_27} :catch_0

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    move-result v8

    if-ltz v8, :cond_34

    const-string v8, "\u06e4\u06e7\u06df"

    goto/16 :goto_24

    :cond_34
    const-string v8, "\u06e0\u06e3\u06e8"

    move-wide/from16 v88, v28

    goto/16 :goto_21

    :sswitch_46
    const-wide/16 v8, 0x0

    cmpg-double v8, v56, v8

    if-gez v8, :cond_49

    const-wide/16 v8, 0x0

    const-wide/16 v18, 0x0

    sub-double v18, v18, v56

    const-wide v28, 0x4076800000000000L    # 360.0

    sub-double v18, v18, v28

    sub-double v18, v8, v18

    move/from16 v8, v17

    goto/16 :goto_5

    :sswitch_47
    if-eqz v40, :cond_4d

    const/16 v80, 0x50

    sget v8, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v9, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    xor-int/lit16 v9, v9, -0xeae

    add-int/2addr v8, v9

    if-ltz v8, :cond_36

    move/from16 v9, v36

    :cond_35
    const-string v8, "\u06df\u06df\u06e3"

    move/from16 v36, v9

    move-wide/from16 v28, v90

    goto :goto_27

    :cond_36
    const-string v8, "\u06e8\u06e0"

    invoke-static {v8}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_48
    move/from16 v0, v69

    xor-int/lit16 v8, v0, -0x100

    and-int v8, v8, v69

    :try_start_28
    invoke-static {v8}, La80;->s(I)D
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_28} :catch_0

    move-result-wide v28

    sget v8, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    if-gtz v8, :cond_37

    const-string v8, "\u06e5\u06e6\u06e0"

    invoke-static {v8}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v72, v28

    goto/16 :goto_0

    :cond_37
    move-wide/from16 v8, v70

    goto/16 :goto_1f

    :sswitch_49
    const-string v8, "R1ORdM70JzkIGMsVlQ==\n"

    const-string v9, "IDblO7ykUk0=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    move-result v8

    if-gtz v8, :cond_38

    const-string v8, "\u06e1\u06e2\u06e8"

    invoke-static {v8}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :cond_38
    sget v8, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v9, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sub-int/2addr v8, v9

    const v9, -0x1ab5b8

    xor-int/2addr v8, v9

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_4a
    sget v8, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v9, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    add-int/lit16 v9, v9, -0x78a

    or-int/2addr v8, v9

    if-ltz v8, :cond_39

    const-string v8, "\u06e5\u06e5\u06e8"

    invoke-static {v8}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v52, v54

    goto/16 :goto_0

    :cond_39
    move-wide/from16 v52, v54

    move-wide/from16 v8, v56

    goto/16 :goto_18

    :sswitch_4b
    const/4 v8, 0x2

    :try_start_29
    aget-wide v8, v41, v8
    :try_end_29
    .catch Ljava/lang/Exception; {:try_start_29 .. :try_end_29} :catch_0

    const-wide/16 v28, 0x0

    const-wide/16 v110, 0x0

    mul-double v114, v24, v48

    sub-double v110, v110, v114

    const-wide/16 v114, 0x0

    const-wide/16 v142, 0x0

    mul-double v144, v104, v120

    sub-double v142, v142, v144

    mul-double v144, v98, v42

    sub-double v142, v142, v144

    sub-double v114, v114, v142

    sub-double v110, v110, v114

    sub-double v28, v28, v110

    mul-double v28, v28, v8

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    move-result v8

    if-gtz v8, :cond_3a

    const-string v8, "\u06e5\u06e7\u06e6"

    invoke-static {v8}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v114, v28

    goto/16 :goto_0

    :cond_3a
    const-string v8, "\u06e0\u06e2\u06e0"

    invoke-static {v8}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v114, v28

    goto/16 :goto_0

    :sswitch_4c
    const-wide v8, 0x3fb27bb2fec56d5dL    # 0.0722

    mul-double v8, v8, v74

    const-wide/16 v28, 0x0

    const-wide v104, 0x3fe6e2eb1c432ca5L    # 0.7152

    mul-double v104, v104, v62

    const-wide/16 v110, 0x0

    const-wide v142, 0x3fcb367a0f9096bcL    # 0.2126

    mul-double v142, v142, v136

    sub-double v110, v110, v142

    sub-double v104, v104, v110

    sub-double v28, v28, v104

    sub-double v28, v8, v28

    const-string v8, "\u06e8\u06e7\u06df"

    goto/16 :goto_b

    :sswitch_4d
    const-wide/16 v8, 0x0

    sub-double v8, v8, v22

    sub-double v8, v128, v8

    const-wide/high16 v28, 0x401c000000000000L    # 7.0

    add-double v8, v8, v28

    const-wide/high16 v28, 0x4000000000000000L    # 2.0

    mul-double v28, v28, v70

    sub-double v8, v8, v28

    const-wide/high16 v28, 0x401c000000000000L    # 7.0

    sub-double v8, v8, v28

    const-wide/high16 v28, 0x4022000000000000L    # 9.0

    div-double v8, v8, v28

    sget v26, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    if-gtz v26, :cond_3b

    const/16 v26, 0x31

    sput v26, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    move-wide/from16 v32, v8

    move-wide/from16 v28, v92

    goto/16 :goto_25

    :cond_3b
    move-wide/from16 v28, v34

    goto/16 :goto_d

    :sswitch_4e
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    move-result v8

    if-gtz v8, :cond_3c

    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    const-string v8, "\u06e3\u06df\u06df"

    move-object/from16 v26, v8

    goto/16 :goto_20

    :cond_3c
    sget v8, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v9, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    mul-int/2addr v8, v9

    const v9, 0x1c11a2

    add-int/2addr v8, v9

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_4f
    :try_start_2a
    move-object/from16 v0, v45

    iget-wide v0, v0, Lfb0;->i:D

    move-wide/from16 v100, v0
    :try_end_2a
    .catch Ljava/lang/Exception; {:try_start_2a .. :try_end_2a} :catch_0

    sget v8, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v9, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    rem-int/lit16 v9, v9, -0x16f2

    sub-int/2addr v8, v9

    if-gtz v8, :cond_3d

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    const-string v8, "\u06e8\u06df\u06e4"

    invoke-static {v8}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :cond_3d
    const-string v8, "\u06e3\u06e6\u06e4"

    move-wide/from16 v28, v98

    :goto_28
    invoke-static {v8}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v98, v28

    goto/16 :goto_0

    :sswitch_50
    :try_start_2b
    move-object/from16 v0, v45

    iget-wide v8, v0, Lfb0;->b:D

    mul-double/2addr v8, v12

    div-double v8, v8, v46

    move-object/from16 v0, v45

    iget-wide v0, v0, Lfb0;->j:D

    move-wide/from16 v28, v0

    mul-double v28, v28, v106

    move-wide/from16 v0, v28

    invoke-static {v8, v9, v0, v1}, Ljava/lang/Math;->pow(DD)D
    :try_end_2b
    .catch Ljava/lang/Exception; {:try_start_2b .. :try_end_2b} :catch_0

    move-result-wide v8

    const-wide/high16 v28, 0x4059000000000000L    # 100.0

    mul-double v8, v8, v28

    const-wide/high16 v28, 0x4059000000000000L    # 100.0

    div-double v28, v8, v28

    sget v8, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v9, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    div-int/2addr v8, v9

    const v9, 0x1ac206

    add-int/2addr v8, v9

    move/from16 v110, v8

    move-wide/from16 v138, v28

    goto/16 :goto_0

    :sswitch_51
    :try_start_2c
    sget-object v9, Lfb0;->k:Lfb0;
    :try_end_2c
    .catch Ljava/lang/Exception; {:try_start_2c .. :try_end_2c} :catch_0

    sget v8, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v26, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    move/from16 v0, v26

    div-int/lit16 v0, v0, 0x132d

    move/from16 v26, v0

    xor-int v8, v8, v26

    if-gtz v8, :cond_3e

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    const-string v8, "\u06e4\u06e6\u06e6"

    invoke-static {v8}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v45, v9

    move/from16 v110, v8

    goto/16 :goto_0

    :cond_3e
    const-string v8, "\u06e3\u06e3"

    move-object/from16 v26, v8

    move-object/from16 v28, v9

    goto/16 :goto_19

    :sswitch_52
    :try_start_2d
    invoke-static/range {v116 .. v117}, Ljava/lang/Math;->abs(D)D

    move-result-wide v8

    mul-double v8, v8, v126

    const-wide/high16 v28, 0x4059000000000000L    # 100.0

    div-double v8, v8, v28

    const-wide v28, 0x3fdae147ae147ae1L    # 0.42

    move-wide/from16 v0, v28

    invoke-static {v8, v9, v0, v1}, Ljava/lang/Math;->pow(DD)D
    :try_end_2d
    .catch Ljava/lang/Exception; {:try_start_2d .. :try_end_2d} :catch_0

    move-result-wide v8

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    move-result v26

    if-gtz v26, :cond_3f

    const/16 v26, 0x26

    sput v26, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    goto/16 :goto_2

    :cond_3f
    sget v26, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v28, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    rem-int v26, v26, v28

    const v28, -0x1aba9c

    xor-int v26, v26, v28

    move/from16 v110, v26

    move-wide/from16 v96, v8

    goto/16 :goto_0

    :sswitch_53
    const-wide/high16 v8, 0x4035000000000000L    # 21.0

    mul-double v8, v8, v70

    const-wide/16 v28, 0x0

    add-double v8, v8, v28

    const-wide/16 v28, 0x0

    const-wide/16 v110, 0x0

    const-wide/high16 v124, 0x4034000000000000L    # 20.0

    mul-double v124, v124, v128

    sub-double v110, v110, v124

    sub-double v110, v110, v118

    sub-double v28, v28, v110

    add-double v8, v8, v28

    const-wide/16 v28, 0x0

    sub-double v8, v8, v28

    const-wide/high16 v28, 0x4034000000000000L    # 20.0

    div-double v28, v8, v28

    const-string v8, "\u06e6\u06e4\u06e4"

    invoke-static {v8}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v124, v28

    goto/16 :goto_0

    :sswitch_54
    const-wide v8, 0x3f822354d28f7cd6L    # 0.008856451679035631

    cmpl-double v8, v86, v8

    if-lez v8, :cond_10

    sget v8, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    if-gtz v8, :cond_40

    const/16 v8, 0x3c

    sput v8, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    const-string v8, "\u06e1\u06e6\u06e4"

    invoke-static {v8}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    goto/16 :goto_0

    :cond_40
    const-string v8, "\u06e0\u06df\u06e4"

    move-object v9, v8

    move-wide/from16 v28, v86

    goto/16 :goto_1d

    :sswitch_55
    const/4 v8, 0x3

    :try_start_2e
    new-array v8, v8, [D

    const/4 v9, 0x0

    aput-wide v72, v8, v9

    const/4 v9, 0x1

    aput-wide v34, v8, v9

    const/4 v9, 0x2

    aput-wide v90, v8, v9

    move-object/from16 v0, v31

    invoke-static {v8, v0}, Lzt;->F([D[[D)[D

    move-result-object v8

    const/4 v9, 0x1

    aget-wide v8, v8, v9
    :try_end_2e
    .catch Ljava/lang/Exception; {:try_start_2e .. :try_end_2e} :catch_0

    const-wide/high16 v28, 0x4059000000000000L    # 100.0

    div-double v28, v8, v28

    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    move-result v8

    if-gtz v8, :cond_42

    const/16 v8, 0x10

    sput v8, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    move-wide/from16 v86, v28

    :cond_41
    const-string v8, "\u06e7\u06e1\u06e1"

    goto/16 :goto_7

    :cond_42
    const-string v8, "\u06e5\u06e4"

    move-object v9, v8

    goto/16 :goto_1d

    :sswitch_56
    const-wide v8, 0x3fc71af7273e5d5eL    # 0.18051042

    mul-double v8, v8, v74

    const-wide/16 v28, 0x0

    const-wide v98, 0x3fda63c2e8477c96L    # 0.41233895

    mul-double v98, v98, v136

    const-wide/16 v110, 0x0

    const-wide v142, 0x3fd6e341ae4b2c79L    # 0.35762064

    mul-double v142, v142, v62

    sub-double v110, v110, v142

    sub-double v98, v98, v110

    sub-double v28, v28, v98

    sub-double v28, v8, v28

    sget v8, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v9, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    add-int/lit16 v9, v9, 0x248f

    rem-int/2addr v8, v9

    if-ltz v8, :cond_43

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    const-string v8, "\u06e1\u06e0\u06df"

    goto/16 :goto_28

    :cond_43
    const-string v8, "\u06e4\u06e3\u06e1"

    invoke-static {v8}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v98, v28

    goto/16 :goto_0

    :sswitch_57
    :try_start_2f
    invoke-static {v14, v15}, Ljava/lang/Math;->abs(D)D

    move-result-wide v8

    mul-double v8, v8, v126

    const-wide/high16 v28, 0x4059000000000000L    # 100.0

    div-double v8, v8, v28

    const-wide v28, 0x3fdae147ae147ae1L    # 0.42

    move-wide/from16 v0, v28

    invoke-static {v8, v9, v0, v1}, Ljava/lang/Math;->pow(DD)D
    :try_end_2f
    .catch Ljava/lang/Exception; {:try_start_2f .. :try_end_2f} :catch_0

    move-result-wide v28

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    move-result v8

    if-ltz v8, :cond_44

    invoke-static {}, Landroidx/recyclerview/widget/ۧۧۦۢ;->ۣۢۦۨ()I

    const-string v9, "\u06e1\u06e0\u06e7"

    move-object/from16 v8, v37

    move-object/from16 v26, v9

    move-wide/from16 v38, v28

    goto/16 :goto_12

    :cond_44
    const-string v8, "\u06e0\u06e5\u06e0"

    move/from16 v9, v36

    goto/16 :goto_10

    :sswitch_58
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v6, v5, v9}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_1c

    move-object v4, v9

    :goto_29
    const-string v9, "\u06e7\u06e6\u06e4"

    move-object/from16 v68, v8

    move/from16 v26, v81

    goto/16 :goto_13

    :sswitch_59
    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    return v4

    :sswitch_5a
    const/4 v8, 0x1

    :try_start_30
    aget-wide v8, v44, v8
    :try_end_30
    .catch Ljava/lang/Exception; {:try_start_30 .. :try_end_30} :catch_0

    invoke-static {}, Lۣ۟ۢ۠۠;->۠۟ۥ۠()I

    move-result v26

    if-gtz v26, :cond_26

    const/16 v26, 0x31

    sput v26, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    const-string v26, "\u06e6\u06e4\u06e4"

    invoke-static/range {v26 .. v26}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v26

    move/from16 v110, v26

    move-wide/from16 v78, v8

    goto/16 :goto_0

    :sswitch_5b
    sget v8, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v9, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    or-int/lit16 v9, v9, -0x18e3

    div-int/2addr v8, v9

    if-eqz v8, :cond_45

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    const-string v8, "\u06e1\u06e6\u06e6"

    goto/16 :goto_21

    :cond_45
    sget v8, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v9, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    rem-int/2addr v8, v9

    const v9, -0x1aba70

    xor-int/2addr v8, v9

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_5c
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    move-result v8

    if-gtz v8, :cond_46

    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    const-string v8, "\u06e1\u06e1\u06e3"

    invoke-static {v8}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v50, v52

    goto/16 :goto_0

    :cond_46
    const-string v8, "\u06e6\u06e5\u06e2"

    move-object v9, v8

    move-wide/from16 v50, v52

    goto/16 :goto_16

    :sswitch_5d
    :try_start_31
    invoke-static {v14, v15}, Ljava/lang/Math;->signum(D)D
    :try_end_31
    .catch Ljava/lang/Exception; {:try_start_31 .. :try_end_31} :catch_0

    move-result-wide v8

    const-wide/high16 v22, 0x4079000000000000L    # 400.0

    mul-double v8, v8, v22

    mul-double v8, v8, v38

    const-wide/high16 v22, 0x4014000000000000L    # 5.0

    add-double v22, v22, v38

    const-wide v28, 0x403b2147ae147ae1L    # 27.13

    add-double v22, v22, v28

    const-wide/high16 v28, 0x4014000000000000L    # 5.0

    sub-double v22, v22, v28

    div-double v22, v8, v22

    sget v8, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    if-gtz v8, :cond_47

    move-object/from16 v8, v68

    goto/16 :goto_29

    :cond_47
    const-string v8, "\u06e6\u06df\u06e3"

    goto/16 :goto_6

    :sswitch_5e
    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    move-result v8

    if-ltz v8, :cond_48

    const/16 v8, 0x52

    sput v8, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    const-string v8, "\u06e3\u06e3\u06e0"

    move-object/from16 v26, v8

    move-wide/from16 v28, v14

    goto/16 :goto_4

    :cond_48
    sget v8, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v9, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    div-int/2addr v8, v9

    const v9, 0x1ab2c5

    add-int/2addr v8, v9

    move/from16 v110, v8

    goto/16 :goto_0

    :cond_49
    :sswitch_5f
    sget v8, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v9, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    div-int/lit16 v9, v9, -0x233e

    xor-int/2addr v8, v9

    if-ltz v8, :cond_4a

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    const-string v8, "\u06e2\u06e3\u06e0"

    move-wide/from16 v28, v74

    goto/16 :goto_23

    :cond_4a
    sget v8, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v9, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    xor-int/2addr v8, v9

    const v9, -0x1aaf8a

    xor-int/2addr v8, v9

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_60
    const/4 v8, 0x1

    :try_start_32
    aget-wide v28, v27, v8
    :try_end_32
    .catch Ljava/lang/Exception; {:try_start_32 .. :try_end_32} :catch_0

    sget v8, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v9, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    div-int/lit16 v9, v9, -0x158d

    add-int/2addr v8, v9

    if-ltz v8, :cond_4b

    const/16 v8, 0x41

    sput v8, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    const-string v8, "\u06df\u06e8\u06e1"

    invoke-static {v8}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v110, v8

    move-wide/from16 v120, v28

    goto/16 :goto_0

    :cond_4b
    sget v8, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v9, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    xor-int/2addr v8, v9

    const v9, 0x1abc33

    add-int/2addr v8, v9

    move/from16 v110, v8

    move-wide/from16 v120, v28

    goto/16 :goto_0

    :sswitch_61
    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    move-result v8

    if-ltz v8, :cond_4c

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    move-object v9, v4

    move v10, v11

    :goto_2a
    const-string v4, "\u06e4\u06e4\u06e3"

    move-object v8, v4

    goto/16 :goto_17

    :cond_4c
    move/from16 v8, v108

    move v10, v11

    :goto_2b
    const-string v9, "\u06e8\u06e1\u06e2"

    invoke-static {v9}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v9

    move/from16 v108, v8

    move/from16 v110, v9

    goto/16 :goto_0

    :sswitch_62
    :try_start_33
    move-object/from16 v0, v45

    iget-object v8, v0, Lfb0;->g:[D
    :try_end_33
    .catch Ljava/lang/Exception; {:try_start_33 .. :try_end_33} :catch_0

    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    move-result v9

    if-ltz v9, :cond_d

    const-string v9, "\u06e2\u06e0\u06e4"

    invoke-static {v9}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v41, v8

    move/from16 v110, v9

    goto/16 :goto_0

    :sswitch_63
    const/high16 v8, 0xff0000

    xor-int/lit8 v9, v108, -0x1

    const/high16 v26, 0xff0000

    xor-int v9, v9, v26

    and-int/2addr v8, v9

    shr-int/lit8 v8, v8, 0x10

    :try_start_34
    invoke-static {v8}, La80;->s(I)D
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_34 .. :try_end_34} :catch_0

    move-result-wide v28

    sget v8, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v9, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sub-int/2addr v8, v9

    const v9, 0x1ab940

    add-int/2addr v8, v9

    move/from16 v110, v8

    move-wide/from16 v136, v28

    goto/16 :goto_0

    :sswitch_64
    invoke-virtual/range {v37 .. v37}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    sget-object v6, Li6;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v6, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v5, v4

    move-object v7, v8

    move-object v9, v8

    goto :goto_2a

    :cond_4d
    :sswitch_65
    sget v8, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    if-ltz v8, :cond_4e

    const-string v8, "\u06e4\u06e8\u06e3"

    move-object v9, v8

    move-wide/from16 v28, v102

    goto/16 :goto_f

    :cond_4e
    const-string v8, "\u06e3\u06e5\u06e3"

    goto/16 :goto_21

    :cond_4f
    :sswitch_66
    sget v8, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v9, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    add-int/lit16 v9, v9, 0x130

    sub-int/2addr v8, v9

    if-gtz v8, :cond_50

    const-string v8, "\u06df\u06e3\u06e3"

    move-wide/from16 v28, v104

    goto/16 :goto_b

    :cond_50
    sget v8, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v9, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    add-int/2addr v8, v9

    const v9, 0x1ab55b

    add-int/2addr v8, v9

    move/from16 v110, v8

    goto/16 :goto_0

    :sswitch_67
    :try_start_35
    move-object/from16 v0, v45

    iget-wide v0, v0, Lfb0;->e:D

    move-wide/from16 v28, v0
    :try_end_35
    .catch Ljava/lang/Exception; {:try_start_35 .. :try_end_35} :catch_0

    sget v8, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v9, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sub-int/2addr v8, v9

    const v9, 0x1aafb8

    xor-int/2addr v8, v9

    move/from16 v110, v8

    move-wide/from16 v130, v28

    goto/16 :goto_0

    :sswitch_68
    sget v8, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    if-ltz v8, :cond_51

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    const-string v8, "\u06e6\u06e0\u06e4"

    goto/16 :goto_1e

    :cond_51
    const-string v8, "\u06df\u06e4\u06e8"

    goto/16 :goto_21

    :sswitch_69
    :try_start_36
    invoke-static/range {p1 .. p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
    :try_end_36
    .catch Ljava/lang/Exception; {:try_start_36 .. :try_end_36} :catch_0

    move-result v8

    sget v9, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v26, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    move/from16 v0, v26

    or-int/lit16 v0, v0, -0xd79

    move/from16 v26, v0

    div-int v9, v9, v26

    if-ltz v9, :cond_52

    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    goto/16 :goto_2b

    :cond_52
    sget v9, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v26, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    xor-int v9, v9, v26

    const v26, 0x1aa8b1

    add-int v9, v9, v26

    move/from16 v108, v8

    move/from16 v110, v9

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc21 -> :sswitch_0
        0xdc60 -> :sswitch_16
        0xdc84 -> :sswitch_9
        0xdc9f -> :sswitch_54
        0xdcdd -> :sswitch_38
        0xdcdf -> :sswitch_53
        0xdcf8 -> :sswitch_39
        0x1aa6ff -> :sswitch_40
        0x1aa703 -> :sswitch_63
        0x1aa706 -> :sswitch_2c
        0x1aa73d -> :sswitch_6
        0x1aa73f -> :sswitch_19
        0x1aa741 -> :sswitch_22
        0x1aa742 -> :sswitch_51
        0x1aa75d -> :sswitch_15
        0x1aa763 -> :sswitch_3e
        0x1aa77c -> :sswitch_49
        0x1aa782 -> :sswitch_2
        0x1aa7a3 -> :sswitch_69
        0x1aa7bf -> :sswitch_3d
        0x1aa7fc -> :sswitch_4e
        0x1aa818 -> :sswitch_13
        0x1aa81f -> :sswitch_4d
        0x1aaac1 -> :sswitch_30
        0x1aaac4 -> :sswitch_f
        0x1aaac5 -> :sswitch_c
        0x1aaae6 -> :sswitch_52
        0x1aab1e -> :sswitch_1
        0x1aab45 -> :sswitch_1d
        0x1aab5f -> :sswitch_25
        0x1aab7b -> :sswitch_5
        0x1aaba0 -> :sswitch_31
        0x1aaea0 -> :sswitch_24
        0x1aaea8 -> :sswitch_5d
        0x1aaec3 -> :sswitch_68
        0x1aaee7 -> :sswitch_5e
        0x1aaf20 -> :sswitch_14
        0x1aaf3d -> :sswitch_1a
        0x1aaf3f -> :sswitch_45
        0x1aaf5f -> :sswitch_20
        0x1aaf9f -> :sswitch_12
        0x1ab245 -> :sswitch_40
        0x1ab248 -> :sswitch_42
        0x1ab266 -> :sswitch_1e
        0x1ab287 -> :sswitch_3b
        0x1ab2a0 -> :sswitch_2a
        0x1ab2a8 -> :sswitch_6
        0x1ab2c4 -> :sswitch_37
        0x1ab2fd -> :sswitch_5b
        0x1ab302 -> :sswitch_d
        0x1ab35e -> :sswitch_2b
        0x1ab607 -> :sswitch_55
        0x1ab629 -> :sswitch_59
        0x1ab684 -> :sswitch_65
        0x1ab6a3 -> :sswitch_7
        0x1ab6c1 -> :sswitch_18
        0x1ab6c3 -> :sswitch_4a
        0x1ab6e1 -> :sswitch_11
        0x1ab6e2 -> :sswitch_58
        0x1ab6fd -> :sswitch_4b
        0x1ab703 -> :sswitch_60
        0x1ab723 -> :sswitch_3a
        0x1ab9c7 -> :sswitch_5c
        0x1aba25 -> :sswitch_26
        0x1aba29 -> :sswitch_3f
        0x1aba42 -> :sswitch_4c
        0x1aba44 -> :sswitch_17
        0x1aba63 -> :sswitch_2f
        0x1abaa4 -> :sswitch_57
        0x1ababc -> :sswitch_34
        0x1ababd -> :sswitch_1c
        0x1abac2 -> :sswitch_8
        0x1abae0 -> :sswitch_10
        0x1abda5 -> :sswitch_2e
        0x1abdcb -> :sswitch_56
        0x1abde2 -> :sswitch_2c
        0x1abe0a -> :sswitch_33
        0x1abe48 -> :sswitch_50
        0x1abe5f -> :sswitch_64
        0x1abe60 -> :sswitch_3
        0x1abe84 -> :sswitch_61
        0x1abea1 -> :sswitch_43
        0x1ac14a -> :sswitch_2d
        0x1ac1a3 -> :sswitch_1b
        0x1ac1a6 -> :sswitch_5a
        0x1ac1a8 -> :sswitch_36
        0x1ac1e6 -> :sswitch_1f
        0x1ac1e7 -> :sswitch_3c
        0x1ac1e8 -> :sswitch_27
        0x1ac203 -> :sswitch_35
        0x1ac205 -> :sswitch_4
        0x1ac221 -> :sswitch_5e
        0x1ac223 -> :sswitch_46
        0x1ac225 -> :sswitch_4f
        0x1ac263 -> :sswitch_62
        0x1ac547 -> :sswitch_a
        0x1ac569 -> :sswitch_67
        0x1ac5a9 -> :sswitch_5f
        0x1ac5c2 -> :sswitch_30
        0x1ac5c8 -> :sswitch_29
        0x1ac5e5 -> :sswitch_32
        0x1ac5e6 -> :sswitch_e
        0x1ac600 -> :sswitch_28
        0x1ac626 -> :sswitch_b
        0x1ac8cc -> :sswitch_44
        0x1ac8cd -> :sswitch_66
        0x1ac909 -> :sswitch_21
        0x1ac94d -> :sswitch_48
        0x1ac9a6 -> :sswitch_47
        0x1ac9aa -> :sswitch_41
        0x1ac9c0 -> :sswitch_23
    .end sparse-switch
.end method

.method public static final c(Landroid/widget/LinearLayout;Landroid/app/Activity;[Lkx;Li00;Lon;Lg00;Landroid/graphics/drawable/GradientDrawable;Landroid/graphics/drawable/GradientDrawable;Landroid/graphics/drawable/GradientDrawable;Landroid/widget/LinearLayout;)V
    .locals 53

    const/16 v27, 0x0

    const/4 v10, 0x0

    const/16 v22, 0x0

    const/4 v6, 0x0

    const/16 v24, 0x0

    const/4 v5, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/16 v39, 0x0

    const/4 v12, 0x0

    const/16 v31, 0x0

    const/16 v42, 0x0

    const/16 v28, 0x0

    const/16 v38, 0x0

    const/16 v37, 0x0

    const/4 v3, 0x0

    const/16 v41, 0x0

    const/16 v40, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x0

    const/16 v32, 0x0

    const/16 v30, 0x0

    const/16 v29, 0x0

    const/4 v11, 0x0

    const/16 v33, 0x0

    const/16 v25, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/4 v14, 0x0

    const/16 v23, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v26, 0x0

    const/16 v34, 0x0

    const-string v13, "\u06e8\u06e0\u06e7"

    invoke-static {v13}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v43, v3

    move-object/from16 v44, v4

    move-object/from16 v45, v6

    move-object/from16 v46, v7

    move-object/from16 v47, v8

    move-object/from16 v48, v9

    move-object/from16 v49, v10

    move-object/from16 v50, v11

    move/from16 v51, v12

    move/from16 v52, v14

    :goto_0
    sparse-switch v13, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "\u06e7\u06e2\u06e0"

    invoke-static {v3}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v33, v50

    move v13, v3

    goto :goto_0

    :sswitch_1
    const/4 v3, 0x4

    move/from16 v0, v34

    if-ge v0, v3, :cond_17

    const/4 v3, 0x0

    move-object/from16 v0, p1

    invoke-static {v0, v3}, Lz30;->g(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v4

    sget v6, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v3, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    xor-int/lit16 v0, v3, 0x3b1

    move/from16 v22, v0

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    xor-int/lit16 v6, v6, 0x346

    move/from16 v0, v22

    invoke-direct {v3, v6, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    sget v6, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    if-ltz v6, :cond_0

    const/16 v6, 0x53

    sput v6, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    const-string v6, "\u06e7\u06e7\u06e6"

    invoke-static {v6}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v45, v3

    move-object/from16 v49, v4

    move v13, v6

    goto :goto_0

    :cond_0
    sget v6, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v7, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    xor-int/2addr v6, v7

    const v7, 0x1ab546

    add-int/2addr v6, v7

    move-object/from16 v45, v3

    move-object/from16 v49, v4

    move v13, v6

    goto :goto_0

    :cond_1
    :sswitch_2
    const-string v3, "\u06e6\u06e3\u06e2"

    :goto_1
    invoke-static {v3}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    goto :goto_0

    :sswitch_3
    move-object/from16 v0, v39

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    if-eqz v36, :cond_20

    move-object/from16 v0, p4

    iget-boolean v3, v0, Lon;->p:Z

    if-eqz v3, :cond_1

    const-string v6, "bW+Mjv3WmrwI\n"

    const-string v4, "Tl7NyLuQ3Po=\n"

    sget v3, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v7, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    xor-int/lit16 v7, v7, -0x138d

    sub-int/2addr v3, v7

    if-gtz v3, :cond_2

    const-string v3, "\u06e6\u06e3\u06e2"

    invoke-static {v3}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v37, v4

    move-object/from16 v38, v6

    move v13, v3

    goto :goto_0

    :cond_2
    const-string v3, "\u06e0\u06df\u06e7"

    move-object v7, v3

    move-object v8, v4

    move-object v9, v6

    :goto_2
    invoke-static {v7}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v37, v8

    move-object/from16 v38, v9

    move v13, v3

    goto/16 :goto_0

    :sswitch_4
    sget v3, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v4, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    mul-int/lit16 v4, v4, -0x648

    xor-int/2addr v3, v4

    if-ltz v3, :cond_3

    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    const-string v3, "\u06e7\u06e0\u06df"

    move-object v4, v15

    move/from16 v6, v17

    move/from16 v7, v19

    move/from16 v8, v20

    move/from16 v9, v22

    move/from16 v10, v24

    :goto_3
    invoke-static {v3}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v3

    move-object v15, v4

    move/from16 v17, v6

    move/from16 v19, v7

    move/from16 v20, v8

    move v13, v3

    move/from16 v23, v9

    move/from16 v52, v10

    goto/16 :goto_0

    :cond_3
    sget v3, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v4, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    add-int/2addr v3, v4

    const v4, 0x1aaced

    add-int/2addr v3, v4

    move v13, v3

    move/from16 v23, v22

    move/from16 v52, v24

    goto/16 :goto_0

    :sswitch_5
    sget v3, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v4, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    add-int/lit16 v4, v4, 0xc9

    sub-int/2addr v3, v4

    if-gtz v3, :cond_4

    const/4 v3, 0x2

    sput v3, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    const-string v3, "\u06e3\u06e1\u06df"

    invoke-static {v3}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06df\u06e5\u06e3"

    invoke-static {v3}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    goto/16 :goto_0

    :sswitch_6
    move-object/from16 v0, v39

    move/from16 v1, v31

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    const/4 v3, 0x1

    move/from16 v0, v18

    if-ne v0, v3, :cond_26

    const/4 v6, 0x0

    const-string v3, "\u06e2\u06e8\u06df"

    move-object v4, v3

    :goto_4
    invoke-static {v4}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    move/from16 v28, v6

    goto/16 :goto_0

    :sswitch_7
    sget v3, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    if-ltz v3, :cond_5

    move/from16 v3, v26

    :goto_5
    const-string v4, "\u06e1\u06e8\u06e8"

    move/from16 v26, v3

    move/from16 v6, v28

    goto :goto_4

    :cond_5
    sget v3, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v4, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    add-int/2addr v3, v4

    const v4, 0x1ab97c

    add-int/2addr v3, v4

    move v13, v3

    goto/16 :goto_0

    :sswitch_8
    sget v3, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    if-gtz v3, :cond_6

    const-string v3, "\u06e3\u06e5\u06e7"

    move/from16 v4, v29

    move/from16 v26, v27

    :goto_6
    invoke-static {v3}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    move/from16 v29, v4

    goto/16 :goto_0

    :cond_6
    move/from16 v3, v27

    goto :goto_5

    :cond_7
    :sswitch_9
    sget v3, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v4, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sub-int/2addr v3, v4

    const v4, -0x1abb09

    xor-int/2addr v3, v4

    move v13, v3

    goto/16 :goto_0

    :sswitch_a
    const/4 v7, -0x2

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    move-result v3

    if-gtz v3, :cond_8

    const-string v3, "\u06e1\u06e5\u06e8"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v15, v16

    move/from16 v17, v18

    move/from16 v19, v7

    move/from16 v20, v21

    move v13, v3

    move/from16 v52, v25

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06df\u06e3\u06e7"

    move-object/from16 v4, v16

    move/from16 v6, v18

    move/from16 v8, v21

    move/from16 v9, v23

    move/from16 v10, v25

    goto/16 :goto_3

    :sswitch_b
    sget v3, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    if-gtz v3, :cond_9

    invoke-static {}, Landroidx/appcompat/app/ۥۦۣ۠;->ۨۤ۠ۨ()I

    const-string v3, "\u06e3\u06e5\u06e3"

    invoke-static {v3}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    goto/16 :goto_0

    :cond_9
    sget v3, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v4, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    add-int/2addr v3, v4

    const v4, 0x1abb6d

    xor-int/2addr v3, v4

    move v13, v3

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v0, v41

    move-object/from16 v1, v40

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    move-result v4

    if-ltz v4, :cond_a

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    const-string v4, "\u06e6\u06e6\u06e3"

    invoke-static {v4}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v43, v3

    move v13, v4

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e8\u06e6\u06e0"

    invoke-static {v4}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v43, v3

    move v13, v4

    goto/16 :goto_0

    :sswitch_d
    const-string v3, "\u06e4\u06e6\u06e8"

    move-object v4, v3

    :goto_7
    invoke-static {v4}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    goto/16 :goto_0

    :sswitch_e
    move-object/from16 v0, p4

    iget v0, v0, Lon;->f:I

    move/from16 v30, v0

    sget v3, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v4, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    mul-int/lit16 v4, v4, -0x21a3

    sub-int/2addr v3, v4

    if-ltz v3, :cond_b

    const/16 v3, 0x38

    sput v3, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    const-string v3, "\u06e4\u06e4\u06df"

    invoke-static {v3}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    goto/16 :goto_0

    :cond_b
    sget v3, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v4, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    mul-int/2addr v3, v4

    const v4, 0x206a2e

    add-int/2addr v3, v4

    move v13, v3

    goto/16 :goto_0

    :sswitch_f
    sget v3, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v4, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    div-int/2addr v3, v4

    const v4, 0x1aabc1

    xor-int/2addr v3, v4

    move v13, v3

    goto/16 :goto_0

    :sswitch_10
    sget v3, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    if-gtz v3, :cond_d

    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    move/from16 v3, v31

    :cond_c
    const-string v4, "\u06e8\u06e5\u06e3"

    invoke-static {v4}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move v13, v4

    move/from16 v31, v3

    goto/16 :goto_0

    :cond_d
    sget v3, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    add-int/2addr v3, v4

    const v4, 0x1aa643

    add-int/2addr v3, v4

    move v13, v3

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    move-result v3

    if-gtz v3, :cond_e

    const/16 v3, 0x54

    sput v3, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    const-string v3, "\u06e6\u06e6\u06e7"

    invoke-static {v3}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    goto/16 :goto_0

    :cond_e
    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v4, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    rem-int/2addr v3, v4

    const v4, -0x1abf15

    xor-int/2addr v3, v4

    move v13, v3

    goto/16 :goto_0

    :sswitch_12
    sget v3, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v4, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    div-int/lit16 v4, v4, -0xf16

    xor-int/2addr v3, v4

    if-ltz v3, :cond_f

    const/16 v3, 0x9

    sput v3, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    const-string v3, "\u06e7\u06e2\u06e0"

    invoke-static {v3}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    goto/16 :goto_0

    :cond_f
    const-string v3, "\u06e6\u06df\u06e2"

    invoke-static {v3}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    goto/16 :goto_0

    :sswitch_13
    move-object/from16 v0, v32

    move/from16 v1, v29

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    if-eqz v36, :cond_29

    sget-object v3, Lmn;->a:Landroid/graphics/Typeface;

    move/from16 v4, v34

    :goto_8
    const-string v6, "\u06e8\u06e8\u06e1"

    invoke-static {v6}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v33, v3

    move v13, v6

    move/from16 v34, v4

    goto/16 :goto_0

    :sswitch_14
    sget v3, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    if-gtz v3, :cond_10

    const-string v3, "\u06e7\u06e0\u06e6"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    goto/16 :goto_0

    :cond_10
    const-string v3, "\u06e7\u06e2\u06e0"

    :goto_9
    invoke-static {v3}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    goto/16 :goto_0

    :sswitch_15
    move-object/from16 v0, v48

    move-object/from16 v1, v44

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/TextView;

    move-object/from16 v0, p1

    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, v35

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v4, 0x41300000    # 11.0f

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    if-eqz v36, :cond_11

    const-string v4, "\u06e1\u06e7\u06e6"

    move-object/from16 v32, v3

    :goto_a
    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v3, v32

    :cond_11
    sget v4, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v6, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    add-int/lit16 v6, v6, -0x1fdc

    add-int/2addr v4, v6

    if-ltz v4, :cond_12

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    const-string v4, "\u06e5\u06e6\u06e2"

    move-object/from16 v32, v3

    goto/16 :goto_7

    :cond_12
    const-string v4, "\u06e4\u06e7\u06e3"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v32, v3

    move v13, v4

    goto/16 :goto_0

    :sswitch_17
    sget v3, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    xor-int/lit16 v4, v4, -0x24f0

    div-int/2addr v3, v4

    if-eqz v3, :cond_13

    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    const-string v3, "\u06e0\u06e4\u06e6"

    invoke-static {v3}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    move/from16 v28, v42

    goto/16 :goto_0

    :cond_13
    sget v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v4, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    add-int/2addr v3, v4

    const v4, 0x1abca8

    add-int/2addr v3, v4

    move v13, v3

    move/from16 v28, v42

    goto/16 :goto_0

    :sswitch_18
    move-object/from16 v0, p4

    iget v0, v0, Lon;->a:I

    move/from16 v27, v0

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->removeAllViews()V

    const/4 v4, 0x0

    sget v3, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v6, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    xor-int/lit16 v6, v6, -0x24c3

    xor-int/2addr v3, v6

    if-ltz v3, :cond_14

    const/16 v3, 0x28

    sput v3, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    move-object/from16 v3, v33

    goto/16 :goto_8

    :cond_14
    const-string v3, "\u06e4\u06e0"

    :goto_b
    invoke-static {v3}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    move/from16 v34, v4

    goto/16 :goto_0

    :sswitch_19
    const/4 v3, 0x4

    move/from16 v0, v52

    if-ge v0, v3, :cond_2e

    sget v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    xor-int/lit16 v3, v3, -0xf6

    mul-int v3, v3, v21

    add-int/lit8 v3, v3, -0x3

    add-int v3, v3, v52

    add-int/lit8 v3, v3, 0x3

    aget-object v4, p2, v3

    iget-object v3, v4, Lkx;->a:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v4, Lkx;->b:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    move-object/from16 v0, p3

    iget-object v5, v0, Li00;->b:Ljava/lang/Object;

    invoke-static {v5, v3}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    sget v5, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v7, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    div-int/lit16 v7, v7, -0x206a

    or-int/2addr v5, v7

    if-gtz v5, :cond_15

    const/16 v5, 0x5f

    sput v5, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    :goto_c
    const-string v7, "\u06e3\u06e7\u06e8"

    move-object/from16 v35, v4

    move-object v5, v3

    move-object/from16 v8, v37

    move-object/from16 v9, v38

    move/from16 v36, v6

    goto/16 :goto_2

    :cond_15
    sget v5, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v7, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    xor-int/2addr v5, v7

    const v7, 0xd953

    add-int/2addr v7, v5

    move-object/from16 v35, v4

    move-object v5, v3

    move/from16 v36, v6

    move v13, v7

    goto/16 :goto_0

    :sswitch_1a
    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v4, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    add-int/lit16 v4, v4, 0x166a

    div-int/2addr v3, v4

    if-eqz v3, :cond_16

    const/16 v3, 0x25

    sput v3, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    const-string v3, "\u06e8\u06df\u06e6"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    move/from16 v23, v19

    move/from16 v21, v20

    move/from16 v18, v17

    goto/16 :goto_0

    :cond_16
    const-string v3, "\u06e4\u06e5\u06e8"

    invoke-static {v3}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    move/from16 v23, v19

    move/from16 v21, v20

    move/from16 v18, v17

    goto/16 :goto_0

    :cond_17
    :sswitch_1b
    sget v3, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v4, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    xor-int/2addr v3, v4

    const v4, 0xde77

    xor-int/2addr v3, v4

    move v13, v3

    goto/16 :goto_0

    :sswitch_1c
    const/4 v3, 0x1

    move/from16 v0, v18

    if-ne v0, v3, :cond_7

    const/4 v3, 0x1

    sget v4, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v6, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    div-int/lit16 v6, v6, -0x10d0

    xor-int/2addr v4, v6

    if-gtz v4, :cond_c

    const/4 v4, 0x7

    sput v4, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    const-string v4, "\u06e3\u06e4"

    invoke-static {v4}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v4

    move v13, v4

    move/from16 v31, v3

    goto/16 :goto_0

    :sswitch_1d
    move-object/from16 v0, p5

    iget v0, v0, Lg00;->a:I

    move/from16 v29, v0

    sget v3, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    if-ltz v3, :cond_18

    const/16 v3, 0x48

    sput v3, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    const-string v4, "\u06e1\u06e3\u06e1"

    move-object/from16 v3, v39

    :goto_d
    invoke-static {v4}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v39, v3

    move v13, v4

    goto/16 :goto_0

    :cond_18
    sget v3, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v4, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    div-int/2addr v3, v4

    const v4, 0x1abadc

    add-int/2addr v3, v4

    move v13, v3

    goto/16 :goto_0

    :sswitch_1e
    const-string v3, "\u06df\u06e5\u06e3"

    invoke-static {v3}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v41, v38

    move v13, v3

    goto/16 :goto_0

    :sswitch_1f
    sget v3, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v4, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    mul-int/lit16 v4, v4, 0x1b39

    mul-int/2addr v3, v4

    if-ltz v3, :cond_19

    const/16 v3, 0x43

    sput v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    const-string v3, "\u06e8\u06e2\u06df"

    invoke-static {v3}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    goto/16 :goto_0

    :cond_19
    sget v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v4, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    rem-int/2addr v3, v4

    const v4, 0x1aafab

    add-int/2addr v3, v4

    move v13, v3

    goto/16 :goto_0

    :sswitch_20
    sget v3, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v4, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    or-int/lit16 v4, v4, -0x11a6

    div-int/2addr v3, v4

    if-ltz v3, :cond_1a

    const-string v3, "\u06df\u06e2\u06df"

    move-object/from16 v4, v40

    move-object/from16 v6, v41

    :goto_e
    invoke-static {v3}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v40, v4

    move-object/from16 v41, v6

    move v13, v3

    goto/16 :goto_0

    :cond_1a
    const-string v3, "\u06e5\u06e7\u06e2"

    move-object v4, v3

    goto/16 :goto_a

    :sswitch_21
    sget v3, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v4, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    rem-int/lit16 v4, v4, -0x1931

    sub-int/2addr v3, v4

    if-gtz v3, :cond_1b

    const/16 v3, 0x44

    sput v3, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    const-string v3, "\u06e4\u06e1\u06e3"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    move/from16 v31, v51

    goto/16 :goto_0

    :cond_1b
    const-string v3, "\u06df\u06e6\u06e4"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    move/from16 v31, v51

    goto/16 :goto_0

    :sswitch_22
    sget v3, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v4, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    div-int/2addr v3, v4

    const v4, -0x1ab6c2

    xor-int/2addr v3, v4

    move v13, v3

    goto/16 :goto_0

    :sswitch_23
    move-object/from16 v0, p0

    invoke-virtual {v0, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v3, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    xor-int/lit16 v3, v3, -0x31e

    add-int v34, v21, v3

    const-string v3, "\u06e8\u06df\u06e2"

    move/from16 v26, v18

    move/from16 v4, v42

    :goto_f
    invoke-static {v3}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    move/from16 v42, v4

    goto/16 :goto_0

    :sswitch_24
    sget v3, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v4, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    or-int/2addr v3, v4

    const v4, -0x1aba85

    xor-int/2addr v3, v4

    move v13, v3

    goto/16 :goto_0

    :sswitch_25
    sget v3, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    xor-int/lit16 v3, v3, 0x25b

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v3}, Lff;->q(I)I

    move-result v6

    invoke-static {v3}, Lff;->q(I)I

    move-result v3

    invoke-direct {v4, v6, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    xor-int/lit8 v3, v3, 0xb

    invoke-static {v3}, Lff;->q(I)I

    move-result v3

    iput v3, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    move-object/from16 v0, v44

    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    sget v4, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    if-gtz v4, :cond_1c

    invoke-static {}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۡۢۡۥ()I

    const-string v4, "\u06e2\u06e0\u06e5"

    invoke-static {v4}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v39, v3

    move v13, v4

    goto/16 :goto_0

    :cond_1c
    const-string v4, "\u06e1\u06e5\u06e8"

    goto/16 :goto_d

    :sswitch_26
    const/4 v3, 0x0

    sget v4, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v6, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    mul-int/2addr v4, v6

    const v6, -0x117976

    xor-int/2addr v4, v6

    move/from16 v51, v3

    move v13, v4

    goto/16 :goto_0

    :sswitch_27
    new-instance v4, Landroid/widget/LinearLayout;

    move-object/from16 v0, p1

    invoke-direct {v4, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x1

    invoke-virtual {v4, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget v3, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    xor-int/lit16 v3, v3, -0x374

    invoke-virtual {v4, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    move/from16 v0, v23

    invoke-direct {v3, v6, v0, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v4, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v3, Landroid/widget/FrameLayout;

    move-object/from16 v0, p1

    invoke-direct {v3, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    sget v6, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v7, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    xor-int/2addr v6, v7

    const v7, 0x1ab343

    add-int/2addr v6, v7

    move-object/from16 v44, v3

    move-object/from16 v48, v4

    move v13, v6

    goto/16 :goto_0

    :sswitch_28
    sget v3, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    xor-int/lit8 v3, v3, 0x27

    invoke-static {v3}, Lff;->q(I)I

    move-result v3

    move-object/from16 v0, v45

    iput v3, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    move-object/from16 v0, v49

    move-object/from16 v1, v45

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v24, 0x0

    sget v3, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v4, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    xor-int/2addr v3, v4

    const v4, 0x1abcf5

    add-int/2addr v3, v4

    move v13, v3

    move/from16 v21, v34

    move/from16 v18, v26

    goto/16 :goto_0

    :sswitch_29
    sget v3, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v4, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    xor-int/lit16 v4, v4, 0x2ea

    div-int/2addr v3, v4

    if-eqz v3, :cond_1d

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    const-string v3, "\u06e7\u06e8\u06e3"

    move-object v4, v3

    goto/16 :goto_a

    :cond_1d
    sget v3, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    or-int/2addr v3, v4

    const v4, 0x1acaf4

    add-int/2addr v3, v4

    move v13, v3

    goto/16 :goto_0

    :sswitch_2a
    sget v3, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v4, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    mul-int/lit16 v4, v4, 0x1946

    xor-int/2addr v3, v4

    if-ltz v3, :cond_1e

    const/4 v3, 0x3

    sput v3, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    const-string v3, "\u06e5\u06e5\u06e2"

    move/from16 v4, v34

    goto/16 :goto_b

    :cond_1e
    sget v3, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v4, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    mul-int/2addr v3, v4

    add-int/lit16 v3, v3, -0xfc6

    move v13, v3

    goto/16 :goto_0

    :sswitch_2b
    const-string v6, "LK/wjNvJ4M0/\n"

    const-string v4, "D5+xvOv50P0=\n"

    sget v3, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v7, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    add-int/lit16 v7, v7, -0x14c5

    mul-int/2addr v3, v7

    if-ltz v3, :cond_1f

    const/16 v3, 0x33

    sput v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    :goto_10
    const-string v3, "\u06e8\u06e2"

    invoke-static {v3}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v40, v4

    move-object/from16 v41, v6

    move v13, v3

    goto/16 :goto_0

    :cond_1f
    const-string v3, "\u06e1\u06e6\u06df"

    goto/16 :goto_e

    :cond_20
    :sswitch_2c
    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    move-result v3

    if-gtz v3, :cond_21

    const/16 v3, 0x2c

    sput v3, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    const-string v3, "\u06e3\u06df\u06e3"

    goto/16 :goto_9

    :cond_21
    const-string v3, "\u06e5\u06e6\u06e5"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    goto/16 :goto_0

    :sswitch_2d
    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v4, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    add-int/lit16 v4, v4, 0x18dc

    mul-int/2addr v3, v4

    if-gtz v3, :cond_22

    const/4 v3, 0x0

    sput v3, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    const-string v3, "\u06e2\u06e1\u06e0"

    invoke-static {v3}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v15, v49

    move v13, v3

    goto/16 :goto_0

    :cond_22
    sget v3, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v4, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    xor-int/2addr v3, v4

    const v4, 0xdc94

    xor-int/2addr v3, v4

    move-object/from16 v15, v49

    move v13, v3

    goto/16 :goto_0

    :sswitch_2e
    sget v3, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v4, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    xor-int/lit16 v4, v4, 0xf08

    add-int/2addr v3, v4

    if-gtz v3, :cond_23

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    const-string v3, "\u06e7\u06e4\u06e8"

    move-object/from16 v40, v37

    move/from16 v4, v42

    goto/16 :goto_f

    :cond_23
    const-string v3, "\u06e8\u06df\u06e6"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v40, v37

    move v13, v3

    goto/16 :goto_0

    :sswitch_2f
    sget v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v4, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    add-int/lit16 v4, v4, -0x1ae

    div-int/2addr v3, v4

    if-eqz v3, :cond_24

    const/16 v3, 0x1a

    sput v3, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    const-string v3, "\u06e8\u06e3\u06e5"

    invoke-static {v3}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    goto/16 :goto_0

    :cond_24
    sget v3, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v4, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    mul-int/2addr v3, v4

    const v4, 0x1682ef

    add-int/2addr v3, v4

    move v13, v3

    goto/16 :goto_0

    :sswitch_30
    sget v3, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    or-int/lit16 v4, v4, 0x1c85

    xor-int/2addr v3, v4

    if-ltz v3, :cond_25

    const/16 v3, 0x9

    sput v3, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    const-string v3, "\u06e7\u06e6\u06e5"

    invoke-static {v3}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    goto/16 :goto_0

    :cond_25
    sget v3, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v4, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    or-int/2addr v3, v4

    const v4, 0x1ac20a

    add-int/2addr v3, v4

    move v13, v3

    goto/16 :goto_0

    :cond_26
    :sswitch_31
    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v4, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    add-int/lit16 v4, v4, -0x1a0e

    mul-int/2addr v3, v4

    if-ltz v3, :cond_27

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    const-string v3, "\u06e0\u06e8\u06e2"

    goto/16 :goto_1

    :cond_27
    sget v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v4, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sub-int/2addr v3, v4

    const v4, 0xdbe1

    add-int/2addr v3, v4

    move v13, v3

    goto/16 :goto_0

    :sswitch_32
    invoke-static/range {v43 .. v43}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    move-object/from16 v0, v39

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    sget v3, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v4, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    xor-int/lit16 v4, v4, -0x1f69

    xor-int/2addr v3, v4

    if-gtz v3, :cond_28

    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    const-string v3, "\u06e5\u06e5\u06df"

    invoke-static {v3}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    goto/16 :goto_0

    :cond_28
    move-object/from16 v4, v40

    move-object/from16 v6, v41

    goto/16 :goto_10

    :cond_29
    :sswitch_33
    const-string v3, "\u06e7\u06e4\u06e8"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    goto/16 :goto_0

    :sswitch_34
    const-string v3, "\u06df\u06e6\u06e4"

    move-object v4, v3

    goto/16 :goto_a

    :sswitch_35
    invoke-virtual/range {v32 .. v33}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    move-object/from16 v0, v48

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v48

    invoke-virtual {v15, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v3, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    xor-int/lit16 v3, v3, 0x1e8

    add-int v25, v52, v3

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    move-result v3

    if-gtz v3, :cond_2a

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    const-string v3, "\u06e1\u06e5"

    invoke-static {v3}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v16, v15

    move v13, v3

    goto/16 :goto_0

    :cond_2a
    move-object/from16 v4, v35

    move-object v3, v5

    move-object/from16 v16, v15

    move/from16 v6, v36

    goto/16 :goto_c

    :sswitch_36
    const-string v3, "\u06e4\u06e6\u06e8"

    move/from16 v4, v30

    goto/16 :goto_6

    :sswitch_37
    const/4 v3, 0x0

    move-object/from16 v0, v39

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const-string v3, "\u06e5\u06df\u06e1"

    move-object v4, v3

    goto/16 :goto_7

    :sswitch_38
    const/high16 v3, 0x41800000    # 16.0f

    invoke-static {v3}, Lff;->p(F)F

    move-result v4

    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v6, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    rem-int/lit16 v6, v6, -0x12e5

    rem-int/2addr v3, v6

    if-ltz v3, :cond_2b

    const-string v3, "\u06e0\u06df\u06e1"

    invoke-static {v3}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    move/from16 v42, v4

    goto/16 :goto_0

    :cond_2b
    const-string v3, "\u06e7\u06e6\u06e1"

    goto/16 :goto_f

    :sswitch_39
    move-object/from16 v0, v44

    move-object/from16 v1, v39

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v4, Lf6;

    move-object/from16 v0, p4

    move-object/from16 v1, p1

    move/from16 v2, v36

    invoke-direct {v4, v0, v1, v5, v2}, Lf6;-><init>(Lon;Landroid/app/Activity;Ljava/lang/String;Z)V

    sget v3, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    xor-int/lit16 v6, v3, -0xda

    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-static {v6}, Lff;->q(I)I

    move-result v7

    invoke-static {v6}, Lff;->q(I)I

    move-result v6

    invoke-direct {v3, v7, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v6, 0x11

    iput v6, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    sget v6, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v7, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    add-int/lit16 v7, v7, 0x173d

    xor-int/2addr v6, v7

    if-gtz v6, :cond_2c

    const/16 v6, 0x3e

    sput v6, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    const-string v6, "\u06e5\u06df\u06e1"

    invoke-static {v6}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v46, v3

    move-object/from16 v47, v4

    move v13, v6

    goto/16 :goto_0

    :cond_2c
    sget v6, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v7, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    div-int/2addr v6, v7

    const v7, 0x1aaac2

    xor-int/2addr v6, v7

    move-object/from16 v46, v3

    move-object/from16 v47, v4

    move v13, v6

    goto/16 :goto_0

    :sswitch_3a
    sget-object v3, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    sget v4, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v6, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    or-int/lit16 v6, v6, 0xb36

    div-int/2addr v4, v6

    if-eqz v4, :cond_2d

    const/16 v4, 0x3b

    sput v4, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    const-string v4, "\u06e1\u06e7\u06e6"

    invoke-static {v4}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v50, v3

    move v13, v4

    goto/16 :goto_0

    :cond_2d
    sget v4, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v6, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    rem-int/2addr v4, v6

    const v6, 0xdb88

    xor-int/2addr v4, v6

    move-object/from16 v50, v3

    move v13, v4

    goto/16 :goto_0

    :cond_2e
    :sswitch_3b
    sget v3, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    add-int/lit16 v4, v4, -0xbad

    xor-int/2addr v3, v4

    if-ltz v3, :cond_2f

    const/4 v3, 0x0

    sput v3, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    const-string v3, "\u06e2\u06e6\u06e6"

    invoke-static {v3}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    goto/16 :goto_0

    :cond_2f
    sget v3, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v4, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    rem-int/2addr v3, v4

    const v4, 0x1ac3dd

    add-int/2addr v3, v4

    move v13, v3

    goto/16 :goto_0

    :sswitch_3c
    sget v3, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    if-ltz v3, :cond_30

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    const-string v3, "\u06df\u06e4"

    invoke-static {v3}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    goto/16 :goto_0

    :cond_30
    sget v3, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v4, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    div-int/2addr v3, v4

    const v4, 0x1ab62f

    add-int/2addr v3, v4

    move v13, v3

    goto/16 :goto_0

    :sswitch_3d
    move-object/from16 v0, v47

    move-object/from16 v1, v46

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    move-object/from16 v0, v44

    move-object/from16 v1, v47

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v3, Lxn;->a:Landroid/graphics/Typeface;

    move-object/from16 v0, v44

    move-object/from16 v1, p4

    invoke-static {v0, v1}, Lxn;->c(Landroid/view/View;Lon;)V

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

    invoke-direct/range {v3 .. v14}, Le6;-><init>(Li00;Ljava/lang/String;Lg00;Landroid/graphics/drawable/GradientDrawable;Landroid/graphics/drawable/GradientDrawable;Landroid/graphics/drawable/GradientDrawable;Lon;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;[Lkx;)V

    move-object/from16 v0, v44

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    move-result v3

    if-gtz v3, :cond_31

    const/16 v3, 0xa

    sput v3, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    const-string v3, "\u06e5\u06e7\u06e2"

    invoke-static {v3}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    move v13, v3

    goto/16 :goto_0

    :cond_31
    sget v3, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v4, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    or-int/2addr v3, v4

    const v4, 0x1ab8e7

    add-int/2addr v3, v4

    move v13, v3

    goto/16 :goto_0

    :sswitch_3e
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbe5 -> :sswitch_0
        0xdc06 -> :sswitch_27
        0xdc24 -> :sswitch_2a
        0xdc5f -> :sswitch_3e
        0xdc61 -> :sswitch_38
        0xdc63 -> :sswitch_1f
        0xdc7c -> :sswitch_8
        0xdcf7 -> :sswitch_19
        0xdcfa -> :sswitch_3c
        0x1aa783 -> :sswitch_1a
        0x1aa7a2 -> :sswitch_14
        0x1aa7ba -> :sswitch_36
        0x1aa7bd -> :sswitch_c
        0x1aa7dd -> :sswitch_6
        0x1aaac0 -> :sswitch_31
        0x1aaac2 -> :sswitch_3d
        0x1aaac8 -> :sswitch_2e
        0x1aab06 -> :sswitch_2
        0x1aab62 -> :sswitch_2d
        0x1aab7c -> :sswitch_34
        0x1aabc1 -> :sswitch_d
        0x1aaeff -> :sswitch_21
        0x1aaf44 -> :sswitch_1c
        0x1aaf5a -> :sswitch_12
        0x1aaf80 -> :sswitch_1d
        0x1aafa1 -> :sswitch_1
        0x1ab242 -> :sswitch_5
        0x1ab263 -> :sswitch_25
        0x1ab267 -> :sswitch_29
        0x1ab269 -> :sswitch_d
        0x1ab281 -> :sswitch_33
        0x1ab320 -> :sswitch_2f
        0x1ab359 -> :sswitch_24
        0x1ab604 -> :sswitch_11
        0x1ab6c1 -> :sswitch_14
        0x1ab6c5 -> :sswitch_15
        0x1ab6fb -> :sswitch_11
        0x1ab704 -> :sswitch_a
        0x1ab71e -> :sswitch_28
        0x1aba06 -> :sswitch_4
        0x1aba07 -> :sswitch_2c
        0x1aba24 -> :sswitch_1f
        0x1aba5f -> :sswitch_32
        0x1aba84 -> :sswitch_20
        0x1aba87 -> :sswitch_30
        0x1abaa6 -> :sswitch_13
        0x1abac0 -> :sswitch_e
        0x1abadb -> :sswitch_f
        0x1abd87 -> :sswitch_39
        0x1abdab -> :sswitch_3b
        0x1abde8 -> :sswitch_16
        0x1abe3f -> :sswitch_26
        0x1abe5e -> :sswitch_9
        0x1abe64 -> :sswitch_37
        0x1abe80 -> :sswitch_3
        0x1ac149 -> :sswitch_5
        0x1ac1c5 -> :sswitch_2b
        0x1ac223 -> :sswitch_1b
        0x1ac526 -> :sswitch_2f
        0x1ac565 -> :sswitch_35
        0x1ac5ab -> :sswitch_3a
        0x1ac5e0 -> :sswitch_2a
        0x1ac5e2 -> :sswitch_17
        0x1ac5e6 -> :sswitch_23
        0x1ac606 -> :sswitch_20
        0x1ac8cb -> :sswitch_b
        0x1ac8cf -> :sswitch_1e
        0x1ac8ef -> :sswitch_18
        0x1ac984 -> :sswitch_34
        0x1ac986 -> :sswitch_10
        0x1ac9a2 -> :sswitch_7
        0x1ac9e1 -> :sswitch_22
    .end sparse-switch
.end method

.method public static final d(Landroid/widget/LinearLayout;Lg00;)V
    .locals 10

    const/high16 v9, 0x40800000    # 4.0f

    const/4 v4, 0x0

    const/high16 v8, 0x41800000    # 16.0f

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e0\u06e7"

    invoke-static {v1}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v1

    move v2, v4

    move v3, v4

    move v5, v4

    move v6, v1

    :goto_0
    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v1, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    xor-int/lit16 v1, v1, -0x39d

    invoke-static {v1, v2, v3, v5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    :goto_1
    const-string v1, "\u06e3\u06e0\u06e3"

    invoke-static {v1}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto :goto_0

    :sswitch_1
    sget v1, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v6, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    add-int/2addr v1, v6

    const v6, 0x1aa8dd

    add-int/2addr v1, v6

    move v6, v1

    goto :goto_0

    :sswitch_2
    iget v1, p1, Lg00;->a:I

    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    move-result v1

    sget v5, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v6, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    add-int/lit16 v6, v6, -0xb3e

    mul-int/2addr v5, v6

    if-gtz v5, :cond_0

    const/16 v5, 0x1b

    sput v5, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    const-string v5, "\u06e8\u06e6\u06e3"

    invoke-static {v5}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v6

    move v5, v1

    goto :goto_0

    :cond_0
    sget v5, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v6, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    or-int/2addr v5, v6

    const v6, -0xdae4

    xor-int/2addr v6, v5

    move v5, v1

    goto :goto_0

    :sswitch_3
    const/16 v1, 0x8

    new-array v1, v1, [F

    invoke-static {v8}, Lff;->p(F)F

    move-result v6

    aput v6, v1, v4

    const/4 v6, 0x1

    invoke-static {v8}, Lff;->p(F)F

    move-result v7

    aput v7, v1, v6

    const/4 v6, 0x2

    invoke-static {v8}, Lff;->p(F)F

    move-result v7

    aput v7, v1, v6

    const/4 v6, 0x3

    invoke-static {v8}, Lff;->p(F)F

    move-result v7

    aput v7, v1, v6

    const/4 v6, 0x4

    invoke-static {v9}, Lff;->p(F)F

    move-result v7

    aput v7, v1, v6

    const/4 v6, 0x5

    invoke-static {v9}, Lff;->p(F)F

    move-result v7

    aput v7, v1, v6

    const/4 v6, 0x6

    invoke-static {v8}, Lff;->p(F)F

    move-result v7

    aput v7, v1, v6

    const/4 v6, 0x7

    invoke-static {v8}, Lff;->p(F)F

    move-result v7

    aput v7, v1, v6

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    sget v1, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v6, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    xor-int/lit16 v6, v6, 0x217f

    or-int/2addr v1, v6

    if-ltz v1, :cond_1

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    goto/16 :goto_1

    :cond_1
    sget v1, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v6, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    xor-int/2addr v1, v6

    const v6, 0xd9b3

    add-int/2addr v1, v6

    move v6, v1

    goto/16 :goto_0

    :sswitch_4
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۦ۟ۥۣ()I

    move-result v1

    if-gtz v1, :cond_2

    const-string v1, "\u06e0\u06e1\u06e3"

    :goto_2
    invoke-static {v1}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_2
    const-string v1, "\u06e1\u06e8\u06e4"

    goto :goto_2

    :sswitch_5
    iget v1, p1, Lg00;->a:I

    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    move-result v3

    sget v1, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    if-gtz v1, :cond_3

    move v1, v2

    :goto_3
    const-string v2, "\u06e0\u06e7\u06e8"

    invoke-static {v2}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v6

    move v2, v1

    goto/16 :goto_0

    :cond_3
    sget v1, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v6, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    or-int/2addr v1, v6

    const v6, 0x1ac5eb

    add-int/2addr v1, v6

    move v6, v1

    goto/16 :goto_0

    :sswitch_6
    iget v1, p1, Lg00;->a:I

    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    move-result v1

    goto :goto_3

    :sswitch_7
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v1, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    if-ltz v1, :cond_4

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    const-string v1, "\u06df\u06e0\u06e7"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_4
    const-string v1, "\u06e0\u06e1\u06e3"

    goto :goto_2

    :sswitch_8
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe8 -> :sswitch_0
        0xdc64 -> :sswitch_1
        0xdcdc -> :sswitch_7
        0x1aa726 -> :sswitch_4
        0x1aab02 -> :sswitch_8
        0x1aabc1 -> :sswitch_5
        0x1aaf9d -> :sswitch_6
        0x1ab626 -> :sswitch_3
        0x1ac9a5 -> :sswitch_2
    .end sparse-switch
.end method
