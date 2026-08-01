.class public final Lud;
.super Lde/robv/android/xposed/XC_MethodHook;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 3

    iput-object p1, p0, Lud;->a:Ljava/lang/String;

    iput p2, p0, Lud;->b:I

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06df\u06e5"

    invoke-static {v1}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "EklV5IMjL4TkEQ5NRgtYB1"

    invoke-static {v0}, Landroidx/legacy/content/۠ۥۣۥ;->ۦۢۦۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget v1, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v2, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    xor-int/2addr v1, v2

    const v2, 0x1aa989

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/recyclerview/widget/ۧۧۦۢ;->ۣۢۦۨ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    const-string v0, "\u06e4\u06df\u06e5"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    div-int/2addr v0, v2

    const v2, 0x1aab3e

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    move-result v0

    if-gtz v0, :cond_3

    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    move-result v0

    if-gtz v0, :cond_1

    const/16 v0, 0x32

    sput v0, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    const-string v0, "\u06df\u06df\u06e8"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e7\u06e7"

    :goto_1
    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_3
    sget v0, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    if-ltz v0, :cond_2

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v0, "\u06e6\u06e1\u06e8"

    goto :goto_1

    :cond_2
    const-string v0, "\u06e4\u06df\u06e5"

    goto :goto_1

    :cond_3
    :sswitch_4
    sget v0, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    div-int/lit16 v2, v2, -0xa77

    sub-int/2addr v0, v2

    if-ltz v0, :cond_4

    const/16 v0, 0x1d

    sput v0, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    const-string v0, "\u06e1\u06e4\u06e3"

    invoke-static {v0}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    const-string v0, "\u06e0\u06e3\u06e1"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdce0 -> :sswitch_0
        0x1aa708 -> :sswitch_4
        0x1aab00 -> :sswitch_1
        0x1aab3e -> :sswitch_5
        0x1ab9ca -> :sswitch_2
        0x1ac603 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 68

    const/16 v28, 0x0

    const/4 v7, 0x0

    const/16 v37, 0x0

    const/16 v54, 0x0

    const/16 v63, 0x0

    const/16 v29, 0x0

    const/16 v34, 0x0

    const/4 v6, 0x0

    const/16 v40, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v16, 0x0

    const/16 v25, 0x0

    const/16 v65, 0x0

    const/4 v5, 0x0

    const/16 v22, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v56, 0x0

    const/16 v55, 0x0

    const/16 v51, 0x0

    const/16 v30, 0x0

    const/16 v53, 0x0

    const/16 v66, 0x0

    const/16 v52, 0x0

    const/16 v24, 0x0

    const/16 v20, 0x0

    const/16 v36, 0x0

    const/16 v50, 0x0

    const/16 v46, 0x0

    const/16 v49, 0x0

    const/16 v47, 0x0

    const/16 v64, 0x0

    const/16 v62, 0x0

    const/16 v48, 0x0

    const/16 v27, 0x0

    const/16 v26, 0x0

    const/16 v61, 0x0

    const/16 v23, 0x0

    const/16 v35, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v21, 0x0

    const/16 v33, 0x0

    const-string v57, "\u06e7\u06df\u06e6"

    invoke-static/range {v57 .. v57}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v67

    move-object/from16 v57, v5

    move-object/from16 v58, v20

    move-object/from16 v59, v24

    move-object/from16 v60, v25

    :goto_0
    sparse-switch v67, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v5, Lff;->y:I

    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->size()I

    move-result v20

    move/from16 v0, v20

    if-lt v5, v0, :cond_47

    const-string v5, "\u06e6\u06e5\u06e2"

    :goto_1
    invoke-static {v5}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto :goto_0

    :sswitch_1
    sget v5, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v20, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sub-int v5, v5, v20

    const v20, 0x1aae63

    xor-int v5, v5, v20

    move/from16 v67, v5

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    move-result v5

    if-gtz v5, :cond_0

    const/16 v5, 0x1d

    sput v5, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    const-string v5, "\u06e2\u06e1\u06df"

    invoke-static {v5}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto :goto_0

    :cond_0
    sget v5, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v20, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    or-int v5, v5, v20

    const v20, 0x1ac15c

    add-int v5, v5, v20

    move/from16 v67, v5

    goto :goto_0

    :sswitch_3
    sget v5, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v9, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    rem-int/lit16 v9, v9, -0xbf3

    or-int/2addr v5, v9

    if-ltz v5, :cond_1

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    move-object v5, v8

    move v10, v11

    move v12, v13

    move v14, v15

    :goto_2
    const-string v9, "\u06e1\u06e6"

    move-object/from16 v20, v9

    move-object/from16 v24, v5

    :goto_3
    invoke-static/range {v20 .. v20}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v9, v24

    move/from16 v67, v5

    goto :goto_0

    :cond_1
    sget v5, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v9, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/2addr v5, v9

    const v9, 0x1acbe4

    xor-int/2addr v5, v9

    move-object v9, v8

    move/from16 v67, v5

    move v10, v11

    move v12, v13

    move v14, v15

    goto :goto_0

    :sswitch_4
    if-nez v37, :cond_1f

    :goto_4
    const-string v5, "\u06e5\u06e0\u06e6"

    invoke-static {v5}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto :goto_0

    :sswitch_5
    invoke-static/range {v51 .. v51}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v24

    sget v5, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v20, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, 0x124a

    move/from16 v20, v0

    sub-int v5, v5, v20

    if-ltz v5, :cond_2

    const-string v5, "\u06e4\u06e4"

    invoke-static {v5}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v55, v24

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_2
    const-string v5, "\u06e8\u06e1"

    move-object/from16 v20, v5

    move/from16 v55, v24

    :goto_5
    invoke-static/range {v20 .. v20}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_6
    sget v5, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v20, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    move/from16 v0, v20

    mul-int/lit16 v0, v0, -0xb28

    move/from16 v20, v0

    sub-int v5, v5, v20

    if-gtz v5, :cond_4

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    move-object/from16 v5, v16

    :cond_3
    const-string v16, "\u06e4\u06e4\u06df"

    invoke-static/range {v16 .. v16}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v16, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :cond_4
    sget v5, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v20, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    or-int v5, v5, v20

    const v20, 0x1aafc5

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_7
    const/4 v5, 0x1

    sput-boolean v5, Lvd;->f:Z

    const-string v5, "\u06e3\u06df\u06e3"

    invoke-static {v5}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_5
    :sswitch_8
    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    move-result v5

    if-ltz v5, :cond_6

    const-string v20, "\u06e6\u06e6\u06e1"

    move-object/from16 v5, v17

    move/from16 v24, v10

    move/from16 v25, v12

    :goto_6
    invoke-static/range {v20 .. v20}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v17, v5

    move/from16 v67, v20

    move/from16 v10, v24

    move/from16 v12, v25

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06e1\u06e0\u06e7"

    move-object/from16 v24, v5

    move-object/from16 v25, v56

    :goto_7
    invoke-static/range {v24 .. v24}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v56, v25

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_7
    :sswitch_9
    sget v5, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v20, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    xor-int v5, v5, v20

    const v20, 0x1aa88c

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_a
    const-string v5, "\u06e2\u06e6\u06e1"

    invoke-static {v5}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v51, v56

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_b
    move-object/from16 v0, v19

    move/from16 v1, v55

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const v5, 0x4479c000    # 999.0f

    move-object/from16 v0, v19

    invoke-virtual {v0, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-static/range {v45 .. v45}, Lff;->q(I)I

    move-result v5

    sget-boolean v20, Lvd;->e:Z

    if-eqz v20, :cond_d

    const-string v20, "TQj9+s3uS68o\n"

    const-string v24, "bjvOvIuoDek=\n"

    move-object/from16 v0, v20

    move-object/from16 v1, v24

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v53

    sget v20, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v24, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    move/from16 v0, v24

    or-int/lit16 v0, v0, 0x210e

    move/from16 v24, v0

    rem-int v20, v20, v24

    if-gtz v20, :cond_48

    const-string v20, "\u06e8\u06e6\u06e3"

    invoke-static/range {v20 .. v20}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v20

    move/from16 v30, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :sswitch_c
    sget-object v5, Lvd;->a:Ljava/util/ArrayList;

    invoke-virtual/range {v37 .. v37}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v5

    sput-object v5, Lvd;->d:Landroid/widget/ListAdapter;

    const/16 v20, 0x1

    if-eqz v5, :cond_4e

    sget-boolean v5, Lvd;->f:Z

    if-nez v5, :cond_4e

    sget v5, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v24, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sub-int v5, v5, v24

    const v24, 0x1acfb1

    add-int v5, v5, v24

    move/from16 v34, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_d
    sget v5, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v20, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    move/from16 v0, v20

    div-int/lit16 v0, v0, -0x1563

    move/from16 v20, v0

    xor-int v5, v5, v20

    if-ltz v5, :cond_8

    const-string v20, "\u06e8\u06e3\u06e1"

    move-object/from16 v5, v28

    :goto_8
    invoke-static/range {v20 .. v20}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v28, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :cond_8
    sget v5, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v20, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    div-int v5, v5, v20

    const v20, 0x1ac50e

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    move-result v5

    if-gtz v5, :cond_9

    const-string v5, "\u06e5\u06e1"

    :goto_9
    invoke-static {v5}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_9
    sget v5, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v20, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    rem-int v5, v5, v20

    const v20, 0x1aba0c

    xor-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_f
    invoke-static/range {v52 .. v52}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    sget v20, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v24, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    move/from16 v0, v24

    add-int/lit16 v0, v0, 0x162e

    move/from16 v24, v0

    xor-int v20, v20, v24

    if-ltz v20, :cond_a

    const/16 v20, 0x3c

    sput v20, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    const-string v20, "\u06e5\u06e2\u06e0"

    invoke-static/range {v20 .. v20}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v20

    move/from16 v66, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :cond_a
    sget v20, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v24, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    rem-int v20, v20, v24

    const v24, 0x1aaed7

    add-int v20, v20, v24

    move/from16 v66, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :sswitch_10
    move-object/from16 v5, v17

    :cond_b
    sget v17, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    if-gtz v17, :cond_c

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    const-string v20, "\u06e6\u06e0\u06e7"

    move-object/from16 v17, v5

    move-object/from16 v24, v29

    :goto_a
    invoke-static/range {v20 .. v20}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v29, v24

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_c
    const-string v17, "\u06e5\u06e7\u06e2"

    move-object/from16 v20, v17

    move/from16 v24, v10

    move/from16 v25, v12

    goto/16 :goto_6

    :sswitch_11
    sget v5, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v14, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sub-int/2addr v5, v14

    const v14, 0x1ac7d4

    xor-int/2addr v5, v14

    move/from16 v67, v5

    move/from16 v14, v23

    goto/16 :goto_0

    :sswitch_12
    move/from16 v5, v30

    :cond_d
    sget v20, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    if-ltz v20, :cond_e

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    const-string v20, "\u06e1\u06e6\u06e1"

    move/from16 v30, v5

    :goto_b
    invoke-static/range {v20 .. v20}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_e
    sget v20, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v24, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    mul-int v20, v20, v24

    const v24, 0x2437d5

    add-int v20, v20, v24

    move/from16 v30, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :sswitch_13
    :try_start_0
    const-string v5, "WtECzTg0FA==\n"

    const-string v20, "PbR2m1FRYxg=\n"

    move-object/from16 v0, v20

    invoke-static {v5, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    new-instance v24, Ltd;

    const/4 v5, 0x0

    move-object/from16 v0, v24

    move-object/from16 v1, v29

    invoke-direct {v0, v5, v1}, Ltd;-><init>(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, "\u06e6\u06e6\u06e5"

    :goto_c
    invoke-static {v5}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v38, v20

    move-object/from16 v39, v24

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_14
    const-string v5, "wvkhzrHB34jR\n"

    const-string v20, "4chg/oHx77g=\n"

    move-object/from16 v0, v20

    invoke-static {v5, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v52

    const-string v5, "\u06e6\u06e3"

    invoke-static {v5}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_15
    sget v5, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v20, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    move/from16 v0, v20

    rem-int/lit16 v0, v0, -0x8e3

    move/from16 v20, v0

    sub-int v5, v5, v20

    if-gtz v5, :cond_f

    const/16 v5, 0x52

    sput v5, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    const-string v5, "\u06e8\u06df\u06e2"

    invoke-static {v5}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v32, v31

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_f
    move/from16 v5, v31

    :goto_d
    const-string v20, "\u06e5\u06e3\u06e5"

    invoke-static/range {v20 .. v20}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v20

    move/from16 v32, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :cond_10
    :sswitch_16
    sget v5, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v20, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    move/from16 v0, v20

    mul-int/lit16 v0, v0, 0x1a2b

    move/from16 v20, v0

    mul-int v5, v5, v20

    if-gtz v5, :cond_11

    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    const-string v5, "\u06e3\u06e2\u06e7"

    invoke-static {v5}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_11
    const-string v5, "\u06e4\u06e7"

    :goto_e
    invoke-static {v5}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_17
    if-nez v63, :cond_1d

    const-string v20, "\u06e0\u06e3\u06e4"

    move-object/from16 v5, v35

    move-object/from16 v24, v20

    :goto_f
    invoke-static/range {v24 .. v24}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v35, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :sswitch_18
    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    move-result v5

    if-ltz v5, :cond_12

    const/4 v5, 0x4

    sput v5, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    const-string v5, "\u06e3\u06e0\u06e4"

    invoke-static {v5}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v37, v7

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_12
    const-string v5, "\u06e4\u06e3\u06e3"

    move-object/from16 v20, v36

    move-object/from16 v24, v7

    :goto_10
    invoke-static {v5}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v36, v20

    move-object/from16 v37, v24

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_19
    sget v5, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v9, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    div-int/lit16 v9, v9, 0x1d32

    add-int/2addr v5, v9

    if-ltz v5, :cond_13

    const/16 v5, 0x10

    sput v5, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    const-string v5, "\u06e4\u06e2\u06e2"

    invoke-static {v5}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v9, v29

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_13
    const-string v5, "\u06e1\u06e5\u06e6"

    move-object/from16 v9, v29

    goto/16 :goto_1

    :sswitch_1a
    const-string v5, "+VCkWpk=\n"

    const-string v20, "iTHWO/Q6Gko=\n"

    move-object/from16 v0, v20

    invoke-static {v5, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, p1

    invoke-static {v5, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p1

    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    move-object/from16 v28, v0

    move-object/from16 v0, p0

    iget-object v5, v0, Lud;->a:Ljava/lang/String;

    move-object/from16 v0, v28

    invoke-static {v0, v5}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    instance-of v0, v5, Landroid/widget/ListView;

    move/from16 v20, v0

    if-eqz v20, :cond_42

    check-cast v5, Landroid/widget/ListView;

    sget v20, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v24, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    move/from16 v0, v24

    div-int/lit16 v0, v0, -0x1dda

    move/from16 v24, v0

    add-int v20, v20, v24

    if-gtz v20, :cond_14

    const/16 v20, 0x5d

    sput v20, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    const-string v20, "\u06e2\u06e2\u06df"

    invoke-static/range {v20 .. v20}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v37, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :cond_14
    const-string v20, "\u06e0\u06e6\u06e3"

    invoke-static/range {v20 .. v20}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v37, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :sswitch_1b
    invoke-virtual/range {v37 .. v37}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v24

    if-nez v24, :cond_1a

    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    move-result v5

    if-gtz v5, :cond_15

    const/16 v5, 0x27

    sput v5, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    const-string v5, "\u06e2\u06e8\u06e7"

    invoke-static {v5}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v29, v24

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_15
    const-string v5, "\u06df\u06e3\u06e2"

    move-object/from16 v20, v5

    goto/16 :goto_a

    :sswitch_1c
    const/high16 v5, 0x41200000    # 10.0f

    invoke-static {v5}, Lff;->p(F)F

    move-result v5

    move-object/from16 v0, v61

    invoke-virtual {v0, v5}, Landroid/view/View;->setElevation(F)V

    invoke-virtual/range {v57 .. v57}, Ljava/util/ArrayList;->clear()V

    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->size()I

    move-result v12

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-string v10, "\u06e3\u06e1\u06e4"

    move-object/from16 v5, v17

    move-object/from16 v20, v10

    move-object/from16 v21, v22

    move/from16 v23, v12

    goto/16 :goto_6

    :sswitch_1d
    const/high16 v5, 0x40c00000    # 6.0f

    invoke-static {v5}, Lff;->p(F)F

    move-result v27

    sget v5, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    if-ltz v5, :cond_16

    const-string v5, "\u06e5\u06e1\u06e7"

    invoke-static {v5}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_16
    sget v5, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v20, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    div-int v5, v5, v20

    const v20, 0x1aa81c

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_1e
    sget v5, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v20, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    move/from16 v0, v20

    add-int/lit16 v0, v0, 0xf5f

    move/from16 v20, v0

    rem-int v5, v5, v20

    if-gtz v5, :cond_17

    const/16 v5, 0x8

    sput v5, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    move/from16 v5, v32

    move/from16 v26, v27

    goto/16 :goto_d

    :cond_17
    const-string v20, "\u06e1\u06e6\u06e8"

    move-object/from16 v5, v17

    move/from16 v24, v10

    move/from16 v25, v12

    move/from16 v26, v27

    goto/16 :goto_6

    :sswitch_1f
    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    move-result v5

    if-gtz v5, :cond_18

    const-string v5, "\u06e5\u06df\u06df"

    :goto_11
    invoke-static {v5}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_18
    const-string v5, "\u06e1\u06e7\u06e7"

    :goto_12
    invoke-static {v5}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_20
    invoke-virtual/range {v37 .. v37}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    instance-of v0, v5, Landroid/view/ViewGroup;

    move/from16 v20, v0

    if-eqz v20, :cond_22

    check-cast v5, Landroid/view/ViewGroup;

    invoke-static {}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۦ۟ۥۣ()I

    move-result v20

    if-gtz v20, :cond_19

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    const-string v20, "\u06e4\u06e3\u06e3"

    invoke-static/range {v20 .. v20}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v63, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :cond_19
    sget v20, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v24, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    or-int v20, v20, v24

    const v24, 0x1ac169

    add-int v20, v20, v24

    move-object/from16 v63, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :sswitch_21
    sget v5, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v20, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    add-int v5, v5, v20

    const v20, 0x1abd52

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_22
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-object/from16 v0, v16

    invoke-virtual {v5, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v5, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v20, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    or-int v5, v5, v20

    const v20, 0x1aafdd

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_23
    move-object/from16 v24, v29

    :cond_1a
    const-string v5, "\u06e0\u06e1\u06e7"

    move-object/from16 v20, v5

    move-object/from16 v29, v24

    :goto_13
    invoke-static/range {v20 .. v20}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_24
    sget v5, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    if-ltz v5, :cond_1b

    const/16 v5, 0x15

    sput v5, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    const-string v20, "\u06e4\u06e5\u06e4"

    move-object/from16 v5, v33

    :goto_14
    invoke-static/range {v20 .. v20}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v33, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :cond_1b
    const-string v5, "\u06e7\u06df\u06e2"

    move-object/from16 v20, v5

    move-object/from16 v24, v29

    goto/16 :goto_a

    :sswitch_25
    sget v5, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    if-gtz v5, :cond_1c

    const/16 v5, 0x60

    sput v5, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    const-string v5, "\u06e1\u06e5\u06e5"

    invoke-static {v5}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_1c
    const-string v5, "\u06e4\u06e6\u06e2"

    :goto_15
    invoke-static {v5}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_1d
    :sswitch_26
    sget v5, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    if-gtz v5, :cond_1e

    const-string v5, "\u06e6\u06e6\u06e4"

    move/from16 v20, v34

    :goto_16
    invoke-static {v5}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v34, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_1e
    const-string v5, "\u06e3\u06df\u06e6"

    move/from16 v20, v34

    goto :goto_16

    :cond_1f
    :sswitch_27
    invoke-static {}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۥۧۧ()I

    move-result v5

    if-gtz v5, :cond_20

    const/4 v5, 0x2

    sput v5, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    const-string v5, "\u06e3\u06e6\u06e4"

    invoke-static {v5}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_20
    const-string v20, "\u06df\u06e1\u06e0"

    move-object/from16 v5, v28

    goto/16 :goto_8

    :sswitch_28
    if-ge v12, v14, :cond_50

    move-object/from16 v0, v21

    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    if-ltz v10, :cond_28

    check-cast v5, Ljava/lang/String;

    new-instance v20, Landroid/widget/TextView;

    move-object/from16 v0, v20

    invoke-direct {v0, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v5, 0x41600000    # 14.0f

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextSize(F)V

    const/16 v5, 0x11

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setGravity(I)V

    sget v5, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    if-ltz v5, :cond_21

    const/16 v5, 0x3e

    sput v5, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    const-string v24, "\u06e6\u06e4\u06e2"

    move-object/from16 v5, v20

    goto/16 :goto_f

    :cond_21
    sget v5, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v24, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    rem-int v5, v5, v24

    const v24, 0x1ab35b

    add-int v5, v5, v24

    move-object/from16 v35, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_22
    :sswitch_29
    const-string v5, "\u06e5\u06e8\u06e8"

    move-object/from16 v20, v5

    goto/16 :goto_13

    :sswitch_2a
    sget v5, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v20, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    xor-int v5, v5, v20

    const v20, -0x1ab448

    xor-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_2b
    const/4 v5, 0x2

    new-array v0, v5, [I

    move-object/from16 v20, v0

    const/4 v5, 0x0

    const-string v24, "OKBPU7GkqQ==\n"

    const-string v25, "G+YJFffi79c=\n"

    invoke-static/range {v24 .. v25}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v24

    aput v24, v20, v5

    const-string v5, "3DmXfqz6xA==\n"

    const-string v24, "/3+lOJ68828=\n"

    move-object/from16 v0, v24

    invoke-static {v5, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    aput v5, v20, v45

    sget v5, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    if-ltz v5, :cond_23

    const-string v5, "\u06df\u06e3\u06e2"

    move-object/from16 v24, v37

    goto/16 :goto_10

    :cond_23
    sget v5, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v24, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    or-int v5, v5, v24

    const v24, 0x1aa9bc

    add-int v5, v5, v24

    move-object/from16 v36, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_2c
    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    move-result v5

    if-ltz v5, :cond_24

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    const-string v5, "\u06e1\u06e4\u06df"

    move-object/from16 v20, v38

    move-object/from16 v24, v39

    goto/16 :goto_c

    :cond_24
    const-string v5, "\u06df\u06e1\u06e5"

    move-object/from16 v20, v5

    goto/16 :goto_13

    :sswitch_2d
    const-string v5, "XWMG6B1n6/M4\n"

    const-string v20, "fiE1rlshrbU=\n"

    move-object/from16 v0, v20

    invoke-static {v5, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget v20, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    if-gtz v20, :cond_25

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    const-string v20, "\u06e8\u06e7\u06e7"

    invoke-static/range {v20 .. v20}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v51, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :cond_25
    move-object/from16 v20, v52

    :goto_17
    const-string v24, "\u06e8\u06e8\u06e0"

    invoke-static/range {v24 .. v24}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v24

    move-object/from16 v51, v5

    move-object/from16 v52, v20

    move/from16 v67, v24

    goto/16 :goto_0

    :sswitch_2e
    sget v5, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v20, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    move/from16 v0, v20

    div-int/lit16 v0, v0, -0x1e44

    move/from16 v20, v0

    mul-int v5, v5, v20

    if-eqz v5, :cond_26

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    const-string v5, "\u06e0\u06e6\u06e7"

    invoke-static {v5}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v50, v36

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_26
    sget v5, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v20, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    add-int v5, v5, v20

    const v20, 0x1aad5c

    xor-int v5, v5, v20

    move-object/from16 v50, v36

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_2f
    sget v5, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v20, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    move/from16 v0, v20

    div-int/lit16 v0, v0, 0xc9b

    move/from16 v20, v0

    xor-int v5, v5, v20

    if-gtz v5, :cond_27

    const-string v5, "\u06e4\u06e8\u06e1"

    move-object/from16 v20, v40

    :goto_18
    invoke-static {v5}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v40, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_27
    const-string v5, "\u06e6\u06e2\u06e6"

    :goto_19
    invoke-static {v5}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_28
    :sswitch_30
    const-string v5, "\u06df\u06e2\u06df"

    move-object/from16 v20, v5

    goto/16 :goto_b

    :sswitch_31
    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    move-object/from16 v0, v58

    move-object/from16 v1, v50

    invoke-direct {v5, v0, v1}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    const v20, 0x4479c000    # 999.0f

    move/from16 v0, v20

    invoke-virtual {v5, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-static/range {v45 .. v45}, Lff;->q(I)I

    move-result v49

    sget-boolean v20, Lvd;->e:Z

    if-eqz v20, :cond_3d

    const-string v25, "eo6OXIRCPD0f\n"

    const-string v48, "WbrKGsIEens=\n"

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    move-result v20

    if-gtz v20, :cond_29

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    const-string v20, "\u06e3\u06df\u06e6"

    invoke-static/range {v20 .. v20}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v46, v5

    move-object/from16 v47, v25

    move/from16 v67, v20

    goto/16 :goto_0

    :cond_29
    const-string v20, "\u06e7\u06e7\u06e8"

    move-object/from16 v24, v20

    :goto_1a
    invoke-static/range {v24 .. v24}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v46, v5

    move-object/from16 v47, v25

    move/from16 v67, v20

    goto/16 :goto_0

    :sswitch_32
    sget v5, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v20, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    move/from16 v0, v20

    div-int/lit16 v0, v0, -0xb53

    move/from16 v20, v0

    or-int v5, v5, v20

    if-ltz v5, :cond_2a

    const/16 v5, 0x5f

    sput v5, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    const-string v5, "\u06e6\u06e1\u06e6"

    invoke-static {v5}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_2a
    sget v5, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v20, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sub-int v5, v5, v20

    const v20, 0x1ab0a6

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_33
    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    move-result v5

    if-gtz v5, :cond_2b

    const-string v5, "\u06e5\u06e7\u06e8"

    invoke-static {v5}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_2b
    sget v5, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v20, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    xor-int v5, v5, v20

    const v20, 0x1ac5ca

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_34
    new-instance v5, Landroid/widget/FrameLayout;

    move-object/from16 v0, v29

    invoke-direct {v5, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v17, Landroid/view/ViewGroup$LayoutParams;

    const/16 v18, -0x1

    const/16 v19, 0x36

    invoke-static/range {v19 .. v19}, Lff;->q(I)I

    move-result v19

    invoke-direct/range {v17 .. v19}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    move-object/from16 v0, v17

    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v17, 0x0

    move/from16 v0, v17

    invoke-virtual {v5, v0}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v18, Landroid/widget/FrameLayout;

    move-object/from16 v0, v18

    move-object/from16 v1, v29

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v19, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct/range {v19 .. v19}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    sget-boolean v17, Lvd;->e:Z

    if-eqz v17, :cond_b

    const-string v17, "Z7U6Aloe6EwB\n"

    const-string v20, "RIwDMxkvq30=\n"

    move-object/from16 v0, v17

    move-object/from16 v1, v20

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    sget v17, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    if-gtz v17, :cond_2c

    const/16 v17, 0x61

    sput v17, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    const-string v17, "\u06e0\u06e1\u06e7"

    invoke-static/range {v17 .. v17}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v17, v5

    move-object/from16 v56, v25

    move/from16 v67, v20

    goto/16 :goto_0

    :cond_2c
    const-string v20, "\u06e7\u06e4\u06e8"

    move-object/from16 v17, v5

    move-object/from16 v24, v20

    goto/16 :goto_7

    :sswitch_35
    sget-object v22, Lvd;->a:Ljava/util/ArrayList;

    invoke-virtual/range {v29 .. v29}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v5

    iget v5, v5, Landroid/content/res/Configuration;->uiMode:I

    xor-int/lit8 v20, v5, -0x31

    and-int v5, v5, v20

    const/16 v20, 0x20

    move/from16 v0, v20

    if-ne v5, v0, :cond_4c

    const/16 v32, 0x1

    sget v5, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v20, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    move/from16 v0, v20

    rem-int/lit16 v0, v0, -0x1836

    move/from16 v20, v0

    sub-int v5, v5, v20

    if-gtz v5, :cond_2d

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    goto/16 :goto_4

    :cond_2d
    sget v5, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v20, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sub-int v5, v5, v20

    const v20, 0x1aa7c8

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_36
    move-object/from16 v0, v59

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/view/View;->setElevation(F)V

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v20, 0x64

    invoke-static/range {v20 .. v20}, Lff;->q(I)I

    move-result v20

    const/16 v24, -0x1

    move/from16 v0, v20

    move/from16 v1, v24

    invoke-direct {v5, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    move-object/from16 v0, v59

    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sput-object v59, Lvd;->c:Landroid/view/View;

    move-object/from16 v0, v18

    move-object/from16 v1, v59

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Landroid/widget/LinearLayout;

    move-object/from16 v0, v29

    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/16 v20, 0x0

    move/from16 v0, v20

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v20, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v24, -0x1

    const/16 v25, -0x1

    move-object/from16 v0, v20

    move/from16 v1, v24

    move/from16 v2, v25

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->size()I

    move-result v20

    move/from16 v0, v20

    int-to-float v0, v0

    move/from16 v20, v0

    move/from16 v0, v20

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setWeightSum(F)V

    sget v20, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v24, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    move/from16 v0, v24

    div-int/lit16 v0, v0, -0xe7a

    move/from16 v24, v0

    sub-int v20, v20, v24

    if-gtz v20, :cond_2e

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    const-string v20, "\u06e1\u06e5\u06e6"

    invoke-static/range {v20 .. v20}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v61, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :cond_2e
    sget v20, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v24, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    add-int v20, v20, v24

    const v24, 0x1aae4b

    add-int v20, v20, v24

    move-object/from16 v61, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :sswitch_37
    move-object/from16 v0, v62

    move-object/from16 v1, v48

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    sget v20, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v24, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    move/from16 v0, v24

    xor-int/lit16 v0, v0, -0xc2f

    move/from16 v24, v0

    div-int v20, v20, v24

    if-eqz v20, :cond_2f

    invoke-static {}, Landroidx/activity/ۣ۟۠ۤۢ;->۟۠۠ۤۥ()I

    const-string v20, "\u06e7\u06e0\u06e8"

    invoke-static/range {v20 .. v20}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v20

    move/from16 v64, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :cond_2f
    sget v20, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v24, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sub-int v20, v20, v24

    const v24, 0x1aaf1f

    add-int v20, v20, v24

    move/from16 v64, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :sswitch_38
    sget v5, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v20, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    xor-int v5, v5, v20

    const v20, 0xdd4a

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_39
    sget v5, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v20, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    or-int v5, v5, v20

    const v20, -0x1ac7a1

    xor-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_3a
    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v20, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, 0xf09

    move/from16 v20, v0

    or-int v5, v5, v20

    if-gtz v5, :cond_30

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    const-string v5, "\u06e1\u06e1\u06e6"

    invoke-static {v5}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_30
    const-string v5, "\u06e7\u06e3\u06e1"

    :goto_1b
    invoke-static {v5}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_3b
    invoke-static {}, Lbb;->g0()V

    sget v5, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v20, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    xor-int v5, v5, v20

    const v20, 0xdef1

    xor-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_3c
    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    if-gtz v5, :cond_31

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    const-string v5, "\u06e6\u06e7\u06e5"

    invoke-static {v5}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_31
    const-string v5, "\u06e3\u06df\u06e3"

    move/from16 v20, v34

    goto/16 :goto_16

    :sswitch_3d
    sget v5, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v20, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    move/from16 v0, v20

    mul-int/lit16 v0, v0, 0x1652

    move/from16 v20, v0

    rem-int v5, v5, v20

    if-gtz v5, :cond_32

    const-string v20, "\u06e0\u06e4\u06e3"

    move-object/from16 v5, v41

    move/from16 v24, v42

    move/from16 v25, v43

    move/from16 v44, v43

    :goto_1c
    invoke-static/range {v20 .. v20}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v41, v5

    move/from16 v42, v24

    move/from16 v43, v25

    move/from16 v67, v20

    goto/16 :goto_0

    :cond_32
    const-string v5, "\u06e5\u06e2\u06e0"

    move-object/from16 v24, v5

    move-object/from16 v25, v56

    move/from16 v44, v43

    goto/16 :goto_7

    :sswitch_3e
    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    move-result v5

    if-gtz v5, :cond_33

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    const-string v5, "\u06e7\u06e0\u06e6"

    invoke-static {v5}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_33
    sget v5, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v20, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    xor-int v5, v5, v20

    const v20, 0x1aac01

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_3f
    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v20, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    move/from16 v0, v20

    mul-int/lit16 v0, v0, 0x4f0

    move/from16 v20, v0

    sub-int v5, v5, v20

    if-gtz v5, :cond_34

    const/16 v5, 0x39

    sput v5, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    const-string v5, "\u06e1\u06e7\u06e7"

    goto/16 :goto_15

    :cond_34
    const-string v5, "\u06e4\u06e2\u06e0"

    invoke-static {v5}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_40
    invoke-virtual/range {v17 .. v17}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v5

    new-instance v20, Lrd;

    move-object/from16 v0, v20

    move-object/from16 v1, v37

    move-object/from16 v2, v60

    move-object/from16 v3, v33

    move-object/from16 v4, v17

    invoke-direct {v0, v1, v2, v3, v4}, Lrd;-><init>(Landroid/widget/ListView;Landroid/view/View;Lf00;Landroid/widget/FrameLayout;)V

    move-object/from16 v0, v20

    invoke-virtual {v5, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    invoke-virtual/range {v17 .. v17}, Landroid/view/View;->bringToFront()V

    sget v5, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v20, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    move/from16 v0, v20

    or-int/lit16 v0, v0, 0x1241

    move/from16 v20, v0

    xor-int v5, v5, v20

    if-gtz v5, :cond_35

    const-string v5, "\u06e4\u06e5\u06e2"

    invoke-static {v5}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_35
    move-object v5, v9

    goto/16 :goto_2

    :sswitch_41
    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    move-result v5

    if-gtz v5, :cond_36

    const-string v5, "\u06e1\u06e6\u06e8"

    goto/16 :goto_1

    :cond_36
    const-string v20, "\u06df\u06e4\u06e5"

    move-object/from16 v5, v28

    goto/16 :goto_8

    :sswitch_42
    sget v5, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v20, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    add-int v5, v5, v20

    const v20, 0x1ab66e

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_43
    const/4 v5, 0x0

    sput v5, Lff;->y:I

    sget v5, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v20, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    or-int v5, v5, v20

    const v20, 0x1ac531

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_44
    :try_start_1
    invoke-static {v6}, Lip;->l(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v20

    sget v5, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v24, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    move/from16 v0, v24

    or-int/lit16 v0, v0, -0xfe1

    move/from16 v24, v0

    mul-int v5, v5, v24

    if-ltz v5, :cond_37

    const-string v24, "\u06e3\u06e2"

    move-object/from16 v5, v46

    move-object/from16 v40, v20

    move-object/from16 v25, v47

    goto/16 :goto_1a

    :cond_37
    const-string v5, "\u06e5\u06e4"

    goto/16 :goto_18

    :sswitch_45
    move-object/from16 v0, v19

    move/from16 v1, v30

    move/from16 v2, v66

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual/range {v18 .. v19}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v5, 0x3

    invoke-static {v5}, Lff;->q(I)I

    move-result v5

    const/16 v20, 0x3

    invoke-static/range {v20 .. v20}, Lff;->q(I)I

    move-result v20

    const/16 v24, 0x3

    invoke-static/range {v24 .. v24}, Lff;->q(I)I

    move-result v24

    const/16 v25, 0x3

    invoke-static/range {v25 .. v25}, Lff;->q(I)I

    move-result v25

    move-object/from16 v0, v18

    move/from16 v1, v20

    move/from16 v2, v24

    move/from16 v3, v25

    invoke-virtual {v0, v5, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v20, -0x1

    const/16 v24, 0x24

    invoke-static/range {v24 .. v24}, Lff;->q(I)I

    move-result v24

    move/from16 v0, v20

    move/from16 v1, v24

    invoke-direct {v5, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v20, 0x10

    invoke-static/range {v20 .. v20}, Lff;->q(I)I

    move-result v20

    const/16 v24, 0xa

    invoke-static/range {v24 .. v24}, Lff;->q(I)I

    move-result v24

    const/16 v25, 0x10

    invoke-static/range {v25 .. v25}, Lff;->q(I)I

    move-result v25

    const/16 v58, 0x8

    invoke-static/range {v58 .. v58}, Lff;->q(I)I

    move-result v58

    move/from16 v0, v20

    move/from16 v1, v24

    move/from16 v2, v25

    move/from16 v3, v58

    invoke-virtual {v5, v0, v1, v2, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    move-object/from16 v0, v18

    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v20, Landroid/view/View;

    move-object/from16 v0, v20

    move-object/from16 v1, v29

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    sget-object v5, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    sget v24, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    if-ltz v24, :cond_38

    :cond_38
    const-string v24, "\u06e1\u06e2\u06e8"

    invoke-static/range {v24 .. v24}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v24

    move-object/from16 v58, v5

    move-object/from16 v59, v20

    move/from16 v67, v24

    goto/16 :goto_0

    :sswitch_46
    sget v5, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v20, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    move/from16 v0, v20

    add-int/lit16 v0, v0, -0x1a6d

    move/from16 v20, v0

    mul-int v5, v5, v20

    if-gtz v5, :cond_39

    const/16 v5, 0x60

    sput v5, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    const-string v5, "\u06df\u06e0"

    move-object/from16 v20, v50

    :goto_1d
    invoke-static {v5}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v50, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_39
    sget v5, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v20, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    mul-int v5, v5, v20

    const v20, 0x196a67

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_47
    sget-boolean v5, Lvd;->e:Z

    if-eqz v5, :cond_7

    const/4 v5, 0x2

    new-array v0, v5, [I

    move-object/from16 v20, v0

    const/4 v5, 0x0

    const-string v24, "juUkuYlIaw==\n"

    const-string v25, "rdJnjspwW5c=\n"

    invoke-static/range {v24 .. v25}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v24

    aput v24, v20, v5

    const-string v5, "IP2oOuuF7w==\n"

    const-string v24, "A8ubDNiz2WQ=\n"

    move-object/from16 v0, v24

    invoke-static {v5, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    aput v5, v20, v45

    const-string v5, "\u06e3\u06e1\u06e3"

    goto :goto_1d

    :sswitch_48
    sget v5, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v20, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    add-int v5, v5, v20

    const v20, 0x1aac83

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_49
    sget v5, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    if-gtz v5, :cond_3a

    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    move-object/from16 v5, v51

    move-object/from16 v20, v53

    goto/16 :goto_17

    :cond_3a
    const-string v5, "\u06e4\u06e8"

    move-object/from16 v52, v53

    goto/16 :goto_12

    :sswitch_4a
    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    move-result v5

    if-gtz v5, :cond_3b

    const/16 v5, 0x21

    sput v5, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    const-string v5, "\u06e2\u06df\u06e1"

    goto/16 :goto_e

    :cond_3b
    const-string v5, "\u06e5\u06e1\u06e3"

    invoke-static {v5}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_4b
    const/4 v5, 0x0

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    move-result v20

    if-ltz v20, :cond_3c

    const/16 v20, 0x34

    sput v20, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    move-object/from16 v20, v5

    :goto_1e
    const-string v5, "\u06e6\u06e7\u06e4"

    invoke-static {v5}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v54, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_3c
    sget v20, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v24, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sub-int v20, v20, v24

    const v24, 0x1aaff7

    xor-int v20, v20, v24

    move-object/from16 v54, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :sswitch_4c
    move-object/from16 v5, v46

    :cond_3d
    sget v20, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    if-gtz v20, :cond_3e

    const/16 v20, 0x56

    sput v20, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    const-string v20, "\u06e5\u06df\u06e1"

    invoke-static/range {v20 .. v20}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v46, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :cond_3e
    sget v20, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v24, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    or-int v20, v20, v24

    const v24, -0x1aab40

    xor-int v20, v20, v24

    move-object/from16 v46, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :sswitch_4d
    const/4 v7, 0x0

    sget v5, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    if-ltz v5, :cond_3f

    const-string v5, "\u06e7\u06df\u06e0"

    invoke-static {v5}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_3f
    move-object v5, v6

    :goto_1f
    const-string v6, "\u06e2\u06e2\u06e3"

    invoke-static {v6}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v20

    move-object v6, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :sswitch_4e
    sget v5, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v20, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    move/from16 v0, v20

    rem-int/lit16 v0, v0, 0x1751

    move/from16 v20, v0

    xor-int v5, v5, v20

    if-gtz v5, :cond_40

    const-string v5, "\u06e2\u06e8\u06e6"

    invoke-static {v5}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_40
    sget v5, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v20, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    div-int v5, v5, v20

    const v20, 0x1ab32a

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_4f
    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    move-result v5

    if-ltz v5, :cond_5

    const-string v5, "SZSlqDVVyrYNNe6WpxEFwQPZb"

    invoke-static {v5}, Landroidx/appcompat/widget/۟ۢۨۦ;->ۥۦۤۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v5

    sget v16, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    if-gtz v16, :cond_3

    const-string v16, "\u06e8\u06e0\u06e2"

    invoke-static/range {v16 .. v16}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v16, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :sswitch_50
    const/4 v5, 0x0

    throw v5

    :sswitch_51
    sput-boolean v32, Lvd;->e:Z

    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->clear()V

    invoke-static {}, Lzt;->K()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v24

    const/16 v25, 0x0

    sget v20, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v41, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    move/from16 v0, v41

    mul-int/lit16 v0, v0, -0xa4f

    move/from16 v41, v0

    rem-int v20, v20, v41

    if-ltz v20, :cond_41

    const/16 v20, 0x53

    sput v20, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    const-string v20, "\u06e5\u06e8\u06e8"

    move-object/from16 v41, v5

    move/from16 v42, v24

    move/from16 v43, v25

    move/from16 v45, v34

    goto/16 :goto_5

    :cond_41
    const-string v20, "\u06df\u06e7\u06e6"

    move/from16 v45, v34

    goto/16 :goto_1c

    :cond_42
    :sswitch_52
    move-object/from16 v5, v28

    sget v20, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v24, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    move/from16 v0, v24

    add-int/lit16 v0, v0, -0x1176

    move/from16 v24, v0

    mul-int v20, v20, v24

    if-ltz v20, :cond_43

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    const-string v20, "\u06e7\u06e2\u06df"

    move-object/from16 v28, v5

    goto/16 :goto_13

    :cond_43
    const-string v20, "\u06e7\u06e0\u06df"

    goto/16 :goto_8

    :cond_44
    :sswitch_53
    sget v5, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v20, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    rem-int v5, v5, v20

    const v20, 0x1ac939

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_54
    sget v5, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v20, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    move/from16 v0, v20

    add-int/lit16 v0, v0, 0x2229

    move/from16 v20, v0

    div-int v5, v5, v20

    if-eqz v5, :cond_45

    const/4 v5, 0x7

    sput v5, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    const-string v5, "\u06df\u06e8\u06e1"

    invoke-static {v5}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v63, v54

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_45
    sget v5, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v20, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    or-int v5, v5, v20

    const v20, 0x1aba21

    add-int v5, v5, v20

    move-object/from16 v63, v54

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_55
    sget v5, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v20, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    move/from16 v0, v20

    mul-int/lit16 v0, v0, 0x1edd

    move/from16 v20, v0

    div-int v5, v5, v20

    if-eqz v5, :cond_46

    const-string v5, "\u06e1\u06df"

    goto/16 :goto_12

    :cond_46
    sget v5, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v20, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    add-int v5, v5, v20

    const v20, 0x1abad4

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_47
    :sswitch_56
    sget v5, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v20, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    mul-int v5, v5, v20

    const v20, 0x21bd23

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_57
    sget v5, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v20, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    move/from16 v0, v20

    or-int/lit16 v0, v0, 0x6b1

    move/from16 v20, v0

    xor-int v5, v5, v20

    if-ltz v5, :cond_49

    move/from16 v5, v30

    :cond_48
    const-string v20, "\u06e2\u06e2"

    invoke-static/range {v20 .. v20}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v20

    move/from16 v30, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :cond_49
    const-string v5, "\u06e2\u06e1\u06e4"

    move-object/from16 v20, v40

    goto/16 :goto_18

    :sswitch_58
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v8, 0x0

    const/4 v11, -0x1

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-direct {v5, v8, v11, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    move-object/from16 v0, v35

    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Lnd;

    move-object/from16 v0, v37

    move-object/from16 v1, v28

    invoke-direct {v5, v10, v0, v1}, Lnd;-><init>(ILandroid/widget/ListView;Ljava/lang/Object;)V

    move-object/from16 v0, v35

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    move-object/from16 v0, v61

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v57

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v10, -0x16

    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v11, v5, 0x16

    rsub-int/lit8 v5, v12, 0x0

    rsub-int/lit8 v13, v5, 0x1

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    move-result v5

    if-gtz v5, :cond_4a

    const-string v5, "\u06e2\u06e8\u06e4"

    invoke-static {v5}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v5

    move-object v8, v9

    move v15, v14

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_4a
    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v8, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    mul-int/2addr v5, v8

    const v8, 0x1abe29

    add-int/2addr v5, v8

    move-object v8, v9

    move v15, v14

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_59
    move-object/from16 v0, v46

    move/from16 v1, v49

    move/from16 v2, v64

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    move-object/from16 v0, v59

    move-object/from16 v1, v46

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget-boolean v5, Lvd;->e:Z

    if-eqz v5, :cond_44

    const/16 v26, 0x0

    sget v5, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v20, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sub-int v5, v5, v20

    const v20, -0x1ac7cd

    xor-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_5a
    sget v5, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    if-gtz v5, :cond_4b

    const-string v5, "\u06e1\u06e8\u06e5"

    invoke-static {v5}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_4b
    const-string v5, "\u06e5\u06e2\u06e0"

    move-object/from16 v20, v5

    goto/16 :goto_13

    :cond_4c
    :sswitch_5b
    const-string v5, "\u06e4\u06e2\u06e2"

    invoke-static {v5}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_5c
    const/16 v31, 0x0

    sget v5, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v20, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    xor-int v5, v5, v20

    const v20, 0x1aad00

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_5d
    const-string v5, "\u06e2\u06e6\u06e1"

    goto/16 :goto_9

    :sswitch_5e
    sget v5, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v20, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    xor-int v5, v5, v20

    const v20, -0x1acbec

    xor-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_5f
    const v5, 0x7e090009

    move-object/from16 v0, v63

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_10

    sget v5, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v20, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, 0xb53

    move/from16 v20, v0

    sub-int v5, v5, v20

    if-gtz v5, :cond_4d

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    const-string v5, "\u06e2\u06e6\u06e5"

    goto/16 :goto_19

    :cond_4d
    const-string v5, "\u06e5\u06e1\u06e3"

    invoke-static {v5}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_60
    const-string v5, "aLQpAc17tP57\n"

    const-string v48, "S4RtMf1LhM4=\n"

    sget v20, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v24, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    rem-int v20, v20, v24

    const v24, -0x1ac802

    xor-int v20, v20, v24

    move-object/from16 v62, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :sswitch_61
    :try_start_2
    move-object/from16 v0, v40

    move-object/from16 v1, v38

    move-object/from16 v2, v39

    invoke-static {v0, v1, v2}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v5, "\u06e4\u06e8\u06e1"

    goto/16 :goto_11

    :sswitch_62
    move/from16 v20, v34

    :cond_4e
    sget v5, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    if-gtz v5, :cond_4f

    const/16 v5, 0x63

    sput v5, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    const-string v5, "\u06e2\u06e3\u06df"

    move-object/from16 v24, v5

    move-object/from16 v25, v56

    move/from16 v34, v20

    goto/16 :goto_7

    :cond_4f
    const-string v5, "\u06e4\u06e8\u06e1"

    goto/16 :goto_16

    :cond_50
    :sswitch_63
    const-string v5, "\u06df\u06e8\u06e1"

    goto/16 :goto_e

    :sswitch_64
    new-instance v20, Landroid/view/View;

    move-object/from16 v0, v20

    move-object/from16 v1, v29

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, p0

    iget v0, v0, Lud;->b:I

    move/from16 v24, v0

    new-instance v5, Landroid/widget/AbsListView$LayoutParams;

    const/16 v25, -0x1

    move/from16 v0, v25

    move/from16 v1, v24

    invoke-direct {v5, v0, v1}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v5, 0x0

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Landroid/view/View;->setBackgroundColor(I)V

    const/4 v5, 0x0

    const/16 v25, 0x0

    move-object/from16 v0, v37

    move-object/from16 v1, v20

    move/from16 v2, v25

    invoke-virtual {v0, v1, v5, v2}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    sget-object v5, Lvd;->a:Ljava/util/ArrayList;

    invoke-static/range {v28 .. v28}, Lip;->l(Ljava/lang/Object;)V

    sget-object v5, Lvd;->b:Ljava/util/ArrayList;

    sget v25, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v57, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    move/from16 v0, v57

    or-int/lit16 v0, v0, -0x2645

    move/from16 v57, v0

    rem-int v25, v25, v57

    if-gtz v25, :cond_51

    const/16 v25, 0x4f

    sput v25, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    const-string v25, "\u06e0\u06e2\u06e6"

    invoke-static/range {v25 .. v25}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v25

    move-object/from16 v57, v5

    move-object/from16 v60, v20

    move/from16 v65, v24

    move/from16 v67, v25

    goto/16 :goto_0

    :cond_51
    sget v25, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v57, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    add-int v25, v25, v57

    const v57, 0x1abca0

    add-int v25, v25, v57

    move-object/from16 v57, v5

    move-object/from16 v60, v20

    move/from16 v65, v24

    move/from16 v67, v25

    goto/16 :goto_0

    :sswitch_65
    move/from16 v0, v44

    move/from16 v1, v42

    if-ge v0, v1, :cond_53

    move-object/from16 v0, v41

    move/from16 v1, v44

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v20, v44, -0x3

    add-int/lit8 v20, v20, 0x1

    add-int/lit8 v44, v20, 0x3

    check-cast v5, Ls50;

    iget-object v5, v5, Ls50;->a:Ljava/lang/String;

    move-object/from16 v0, v22

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget v5, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    if-gtz v5, :cond_52

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    const-string v5, "\u06df\u06e2\u06df"

    goto/16 :goto_1b

    :cond_52
    sget v5, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v20, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    rem-int v5, v5, v20

    const v20, 0x1abf2a

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_53
    :sswitch_66
    const-string v5, "\u06e1\u06e2"

    invoke-static {v5}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_67
    sget v5, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v20, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    div-int v5, v5, v20

    const v20, 0x1aaf80

    add-int v5, v5, v20

    move-object/from16 v62, v47

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_68
    move-object/from16 v0, v18

    move-object/from16 v1, v61

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual/range {v61 .. v61}, Landroid/view/View;->bringToFront()V

    invoke-virtual/range {v17 .. v18}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Lod;

    const/16 v20, 0x0

    move/from16 v0, v20

    invoke-direct {v5, v0}, Lod;-><init>(I)V

    move-object/from16 v0, v17

    invoke-virtual {v0, v5}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    const v5, 0x7e090009

    move-object/from16 v0, v17

    invoke-virtual {v0, v5}, Landroid/view/View;->setId(I)V

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v20, -0x1

    move/from16 v0, v20

    move/from16 v1, v65

    invoke-direct {v5, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    move-object/from16 v0, v63

    move-object/from16 v1, v17

    invoke-virtual {v0, v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Lf00;

    invoke-direct {v5}, Lf00;-><init>()V

    const/high16 v20, -0x40800000    # -1.0f

    move/from16 v0, v20

    iput v0, v5, Lf00;->a:F

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    move-result v20

    if-gtz v20, :cond_54

    const-string v20, "\u06e5\u06e4"

    invoke-static/range {v20 .. v20}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v33, v5

    move/from16 v67, v20

    goto/16 :goto_0

    :cond_54
    const-string v20, "\u06e1\u06e4\u06e0"

    goto/16 :goto_14

    :sswitch_69
    :try_start_3
    sget-object v5, Lvd;->d:Landroid/widget/ListAdapter;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    move-result v6

    if-gtz v6, :cond_55

    invoke-static {}, Lۣ۟ۢ۠۠;->۠۟ۥ۠()I

    goto/16 :goto_1f

    :cond_55
    move-object/from16 v20, v54

    move-object v6, v5

    goto/16 :goto_1e

    :catchall_0
    move-exception v5

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    move-result v5

    if-gtz v5, :cond_56

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    const-string v5, "\u06e0\u06e5\u06e3"

    invoke-static {v5}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_56
    sget v5, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v20, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    add-int v5, v5, v20

    const v20, 0x1ab588

    add-int v5, v5, v20

    move/from16 v67, v5

    goto/16 :goto_0

    :sswitch_6a
    sget v5, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v20, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    move/from16 v0, v20

    add-int/lit16 v0, v0, 0x16b2

    move/from16 v20, v0

    sub-int v5, v5, v20

    if-ltz v5, :cond_57

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    const-string v5, "\u06e4\u06e7"

    invoke-static {v5}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v67, v5

    goto/16 :goto_0

    :cond_57
    const-string v5, "\u06e7\u06df\u06e7"

    move-object/from16 v20, v5

    move-object/from16 v24, v9

    goto/16 :goto_3

    :sswitch_6b
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc21 -> :sswitch_0
        0xdc25 -> :sswitch_6b
        0xdc40 -> :sswitch_49
        0xdc41 -> :sswitch_38
        0xdc5f -> :sswitch_2c
        0xdc62 -> :sswitch_50
        0xdc80 -> :sswitch_46
        0xdc81 -> :sswitch_4c
        0xdc83 -> :sswitch_64
        0xdc84 -> :sswitch_f
        0xdc9f -> :sswitch_13
        0xdcba -> :sswitch_1
        0xdcbd -> :sswitch_21
        0xdcd8 -> :sswitch_d
        0xdcf9 -> :sswitch_41
        0xdd00 -> :sswitch_32
        0x1aa73e -> :sswitch_20
        0x1aa743 -> :sswitch_59
        0x1aa75c -> :sswitch_3b
        0x1aa77e -> :sswitch_3f
        0x1aa79b -> :sswitch_5e
        0x1aa7a0 -> :sswitch_39
        0x1aa7fe -> :sswitch_3d
        0x1aa818 -> :sswitch_68
        0x1aa81c -> :sswitch_1e
        0x1aaac7 -> :sswitch_15
        0x1aab06 -> :sswitch_c
        0x1aab1f -> :sswitch_5a
        0x1aab24 -> :sswitch_54
        0x1aab41 -> :sswitch_48
        0x1aab43 -> :sswitch_1f
        0x1aab5f -> :sswitch_e
        0x1aab7e -> :sswitch_2b
        0x1aab9d -> :sswitch_2a
        0x1aaba1 -> :sswitch_14
        0x1aabbb -> :sswitch_2e
        0x1aabbc -> :sswitch_60
        0x1aae83 -> :sswitch_23
        0x1aaea8 -> :sswitch_6b
        0x1aaebf -> :sswitch_5b
        0x1aaec2 -> :sswitch_31
        0x1aaec6 -> :sswitch_30
        0x1aaee7 -> :sswitch_47
        0x1aaf1d -> :sswitch_40
        0x1aaf1f -> :sswitch_25
        0x1aaf41 -> :sswitch_33
        0x1aaf42 -> :sswitch_28
        0x1aaf62 -> :sswitch_4a
        0x1aaf63 -> :sswitch_36
        0x1aaf81 -> :sswitch_37
        0x1aaf9d -> :sswitch_32
        0x1ab245 -> :sswitch_1c
        0x1ab280 -> :sswitch_24
        0x1ab285 -> :sswitch_4a
        0x1ab29f -> :sswitch_55
        0x1ab2a2 -> :sswitch_58
        0x1ab2a3 -> :sswitch_18
        0x1ab31d -> :sswitch_5
        0x1ab321 -> :sswitch_4a
        0x1ab324 -> :sswitch_16
        0x1ab35e -> :sswitch_3e
        0x1ab360 -> :sswitch_5d
        0x1ab361 -> :sswitch_66
        0x1ab607 -> :sswitch_69
        0x1ab60a -> :sswitch_1b
        0x1ab627 -> :sswitch_3
        0x1ab645 -> :sswitch_6
        0x1ab646 -> :sswitch_11
        0x1ab6c0 -> :sswitch_e
        0x1ab71a -> :sswitch_63
        0x1aba06 -> :sswitch_38
        0x1aba0a -> :sswitch_5a
        0x1aba22 -> :sswitch_4a
        0x1aba24 -> :sswitch_5c
        0x1aba41 -> :sswitch_62
        0x1aba44 -> :sswitch_4
        0x1aba5f -> :sswitch_22
        0x1aba81 -> :sswitch_9
        0x1aba86 -> :sswitch_35
        0x1aba9e -> :sswitch_62
        0x1abaa0 -> :sswitch_2c
        0x1abadd -> :sswitch_5f
        0x1abd88 -> :sswitch_17
        0x1abdab -> :sswitch_57
        0x1abdc7 -> :sswitch_4f
        0x1abdcb -> :sswitch_1f
        0x1abde3 -> :sswitch_65
        0x1abe07 -> :sswitch_51
        0x1abe22 -> :sswitch_56
        0x1abe60 -> :sswitch_3a
        0x1abe80 -> :sswitch_2d
        0x1abe86 -> :sswitch_26
        0x1abea5 -> :sswitch_4b
        0x1ac16b -> :sswitch_39
        0x1ac1a3 -> :sswitch_42
        0x1ac1aa -> :sswitch_5d
        0x1ac1e4 -> :sswitch_53
        0x1ac1ea -> :sswitch_27
        0x1ac203 -> :sswitch_43
        0x1ac220 -> :sswitch_52
        0x1ac225 -> :sswitch_61
        0x1ac243 -> :sswitch_44
        0x1ac247 -> :sswitch_24
        0x1ac508 -> :sswitch_19
        0x1ac50a -> :sswitch_45
        0x1ac50e -> :sswitch_1a
        0x1ac50f -> :sswitch_1
        0x1ac526 -> :sswitch_4d
        0x1ac52f -> :sswitch_34
        0x1ac54c -> :sswitch_4e
        0x1ac585 -> :sswitch_55
        0x1ac5a2 -> :sswitch_b
        0x1ac5ab -> :sswitch_a
        0x1ac5e8 -> :sswitch_10
        0x1ac608 -> :sswitch_67
        0x1ac8cb -> :sswitch_3c
        0x1ac8ea -> :sswitch_2
        0x1ac8ee -> :sswitch_7
        0x1ac907 -> :sswitch_6a
        0x1ac926 -> :sswitch_12
        0x1ac965 -> :sswitch_29
        0x1ac96a -> :sswitch_1d
        0x1ac9a3 -> :sswitch_8
        0x1ac9a5 -> :sswitch_46
        0x1ac9c8 -> :sswitch_3e
        0x1ac9e0 -> :sswitch_2f
    .end sparse-switch
.end method
