.class public abstract Lmj;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lh22;

.field public static final β:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final δ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ε:Ljava/util/Set;

.field public static volatile ζ:Landroid/content/SharedPreferences;

.field public static final η:Lhj;

.field public static volatile θ:Llj;

.field public static final ι:Ljava/lang/Object;

.field public static volatile κ:Lij;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lo7;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lo7;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lh22;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lh22;-><init>(Lp70;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lmj;->α:Lh22;

    .line 14
    .line 15
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lmj;->β:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 20
    .line 21
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lmj;->γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 26
    .line 27
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lmj;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 34
    .line 35
    new-instance v0, Ljava/util/WeakHashMap;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    sput-object v0, Lmj;->ε:Ljava/util/Set;

    .line 52
    .line 53
    const-string v6, "comment_bg_image_blur_enabled"

    .line 54
    .line 55
    const-string v7, "comment_bg_image_blur_radius"

    .line 56
    .line 57
    const-string v1, "comment_bg_mode"

    .line 58
    .line 59
    const-string v2, "comment_bg_color"

    .line 60
    .line 61
    const-string v3, "comment_bg_image_uri"

    .line 62
    .line 63
    const-string v4, "comment_bg_cropped_uri"

    .line 64
    .line 65
    const-string v5, "comment_bg_image_alpha"

    .line 66
    .line 67
    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 72
    .line 73
    .line 74
    new-instance v0, Lhj;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lmj;->η:Lhj;

    .line 80
    .line 81
    new-instance v0, Ljava/lang/Object;

    .line 82
    .line 83
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 84
    .line 85
    .line 86
    sput-object v0, Lmj;->ι:Ljava/lang/Object;

    .line 87
    .line 88
    return-void
.end method

.method public static α(Landroid/view/ViewGroup;Z)V
    .locals 40

    move-object/from16 v1, p0

    .line 1
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    :try_start_0
    invoke-static {}, Lui1;->Α()Z

    move-result v2

    if-nez v2, :cond_2

    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    invoke-static {v0}, Lui1;->π(Landroid/content/Context;)V

    .line 4
    :cond_2
    invoke-static {}, Lmj;->η()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :catchall_0
    :goto_1
    sget-object v0, Lmj;->ε:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 6
    const-string v0, ""

    const-string v2, "#FF1A1A2E"

    const-string v3, "comment_bg_mode"

    const/4 v4, 0x0

    .line 7
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    move-result-object v5

    invoke-interface {v5, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move v3, v4

    :goto_2
    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eq v3, v6, :cond_3

    if-eq v3, v5, :cond_3

    move v3, v4

    .line 8
    :cond_3
    const-string v7, "comment_bg_color"

    .line 9
    invoke-static {v7, v2}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 10
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_4

    goto :goto_3

    :cond_4
    move-object v2, v7

    .line 11
    :goto_3
    const-string v7, "comment_bg_cropped_uri"

    .line 12
    invoke-static {v7, v0}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 13
    const-string v8, "comment_bg_image_uri"

    .line 14
    invoke-static {v8, v0}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 15
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_5

    move-object v7, v0

    .line 16
    :cond_5
    const-string v0, "comment_bg_image_alpha"

    const/16 v8, 0x64

    .line 17
    :try_start_2
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    move-result-object v9

    invoke-interface {v9, v0, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_4

    :catchall_2
    move v0, v8

    .line 18
    :goto_4
    invoke-static {v0, v4, v8}, Lj81;->μ(III)I

    move-result v9

    .line 19
    const-string v0, "comment_bg_image_blur_enabled"

    .line 20
    invoke-static {v0, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    move-result v10

    .line 21
    const-string v0, "comment_bg_image_blur_radius"

    const/16 v11, 0x17

    .line 22
    :try_start_3
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    move-result-object v12

    invoke-interface {v12, v0, v11}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v11
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :catchall_3
    const/16 v12, 0x19

    .line 23
    invoke-static {v11, v6, v12}, Lj81;->μ(III)I

    move-result v11

    .line 24
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v13

    invoke-static {v0, v13}, Lmj;->υ(II)I

    move-result v0

    .line 25
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v13

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v14

    invoke-static {v13, v14}, Lmj;->υ(II)I

    move-result v13

    const/16 v14, 0x8

    const/16 v17, 0x0

    if-lez v0, :cond_6

    if-gtz v13, :cond_7

    :cond_6
    move/from16 v16, v12

    const-wide/16 v18, 0x0

    goto/16 :goto_a

    :cond_7
    const-wide/16 v18, 0x0

    .line 26
    new-instance v15, Landroid/graphics/Rect;

    invoke-direct {v15, v4, v4, v0, v13}, Landroid/graphics/Rect;-><init>(IIII)V

    move/from16 v16, v12

    .line 27
    invoke-static {v1}, Lmj;->λ(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v12

    .line 28
    instance-of v5, v1, Landroid/widget/LinearLayout;

    if-eqz v5, :cond_8

    move-object v5, v1

    check-cast v5, Landroid/widget/LinearLayout;

    goto :goto_5

    :cond_8
    move-object/from16 v5, v17

    :goto_5
    if-eqz v5, :cond_9

    invoke-virtual {v5}, Landroid/widget/LinearLayout;->getOrientation()I

    move-result v5

    goto :goto_6

    :cond_9
    move v5, v6

    :goto_6
    if-eqz v12, :cond_d

    .line 29
    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    move-result v6

    if-eq v6, v14, :cond_d

    .line 30
    invoke-static {v12, v1}, Lmj;->γ(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/graphics/Rect;

    move-result-object v6

    .line 31
    invoke-static {v6}, Lmj;->π(Landroid/graphics/Rect;)Z

    move-result v12

    if-nez v12, :cond_d

    if-nez v5, :cond_b

    .line 32
    iget v5, v6, Landroid/graphics/Rect;->left:I

    div-int/lit8 v12, v0, 0x2

    if-gt v5, v12, :cond_a

    .line 33
    new-instance v5, Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->right:I

    invoke-direct {v5, v6, v4, v0, v13}, Landroid/graphics/Rect;-><init>(IIII)V

    goto :goto_7

    .line 34
    :cond_a
    new-instance v5, Landroid/graphics/Rect;

    iget v0, v6, Landroid/graphics/Rect;->left:I

    invoke-direct {v5, v4, v4, v0, v13}, Landroid/graphics/Rect;-><init>(IIII)V

    goto :goto_7

    .line 35
    :cond_b
    iget v5, v6, Landroid/graphics/Rect;->top:I

    div-int/lit8 v12, v13, 0x2

    if-gt v5, v12, :cond_c

    .line 36
    new-instance v5, Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    invoke-direct {v5, v4, v6, v0, v13}, Landroid/graphics/Rect;-><init>(IIII)V

    goto :goto_7

    .line 37
    :cond_c
    new-instance v5, Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->top:I

    invoke-direct {v5, v4, v4, v0, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 38
    :goto_7
    invoke-static {v5}, Lmj;->π(Landroid/graphics/Rect;)Z

    move-result v0

    if-nez v0, :cond_d

    move-object v15, v5

    goto/16 :goto_b

    .line 39
    :cond_d
    invoke-static {v1}, Lmj;->λ(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 40
    invoke-virtual {v15}, Landroid/graphics/Rect;->width()I

    move-result v5

    int-to-long v5, v5

    invoke-virtual {v15}, Landroid/graphics/Rect;->height()I

    move-result v12

    int-to-long v12, v12

    mul-long/2addr v5, v12

    .line 41
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v12

    const-wide/high16 v22, -0x8000000000000000L

    move v13, v4

    move-object/from16 v24, v17

    :goto_8
    if-ge v13, v12, :cond_14

    .line 42
    invoke-virtual {v1, v13}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    if-nez v4, :cond_f

    :cond_e
    move-wide/from16 v29, v5

    move-object/from16 v28, v15

    goto/16 :goto_9

    :cond_f
    if-eq v4, v0, :cond_e

    .line 43
    invoke-static {v13, v4, v1}, Lmj;->ρ(ILandroid/view/View;Landroid/view/ViewGroup;)Z

    move-result v26

    if-nez v26, :cond_e

    .line 44
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v8

    if-eq v8, v14, :cond_e

    .line 45
    invoke-static {v4, v1}, Lmj;->γ(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/graphics/Rect;

    move-result-object v4

    .line 46
    invoke-static {v4}, Lmj;->π(Landroid/graphics/Rect;)Z

    move-result v8

    if-nez v8, :cond_e

    .line 47
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v8

    move-object/from16 v28, v15

    int-to-long v14, v8

    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v8

    move-wide/from16 v29, v5

    move-object v6, v4

    int-to-long v4, v8

    mul-long/2addr v14, v4

    cmp-long v4, v14, v18

    if-lez v4, :cond_13

    cmp-long v4, v29, v18

    if-lez v4, :cond_10

    const/16 v4, 0x5f

    int-to-long v4, v4

    mul-long v4, v4, v29

    move-wide/from16 v31, v4

    const/16 v8, 0x64

    int-to-long v4, v8

    .line 48
    div-long v4, v31, v4

    cmp-long v4, v14, v4

    if-gez v4, :cond_10

    add-long v14, v14, v29

    .line 49
    :cond_10
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    move-result v4

    invoke-virtual/range {v28 .. v28}, Landroid/graphics/Rect;->width()I

    move-result v5

    mul-int/lit8 v5, v5, 0x46

    const/16 v26, 0x64

    div-int/lit8 v5, v5, 0x64

    const/4 v8, 0x4

    if-lt v4, v5, :cond_11

    int-to-long v4, v8

    .line 50
    div-long v4, v29, v4

    add-long/2addr v14, v4

    .line 51
    :cond_11
    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    move-result v4

    invoke-virtual/range {v28 .. v28}, Landroid/graphics/Rect;->height()I

    move-result v5

    mul-int/lit8 v5, v5, 0x19

    div-int/lit8 v5, v5, 0x64

    if-lt v4, v5, :cond_12

    int-to-long v4, v8

    .line 52
    div-long v4, v29, v4

    add-long/2addr v14, v4

    :cond_12
    cmp-long v4, v14, v22

    if-lez v4, :cond_13

    move-object/from16 v24, v6

    move-wide/from16 v22, v14

    :cond_13
    :goto_9
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v15, v28

    move-wide/from16 v5, v29

    const/4 v4, 0x0

    const/16 v8, 0x64

    const/16 v14, 0x8

    goto/16 :goto_8

    :cond_14
    move-object/from16 v28, v15

    if-eqz v24, :cond_15

    .line 53
    invoke-static/range {v24 .. v24}, Lmj;->π(Landroid/graphics/Rect;)Z

    move-result v0

    if-nez v0, :cond_15

    move-object/from16 v15, v24

    goto :goto_b

    :cond_15
    move-object/from16 v15, v28

    goto :goto_b

    .line 54
    :goto_a
    new-instance v15, Landroid/graphics/Rect;

    invoke-direct {v15}, Landroid/graphics/Rect;-><init>()V

    .line 55
    :goto_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "|"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 56
    iget v4, v15, Landroid/graphics/Rect;->left:I

    iget v5, v15, Landroid/graphics/Rect;->top:I

    iget v6, v15, Landroid/graphics/Rect;->right:I

    iget v8, v15, Landroid/graphics/Rect;->bottom:I

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "|"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ","

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ","

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ","

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const v5, 0x7e0d0b02

    .line 57
    invoke-virtual {v1, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v6, v0, Ljava/lang/String;

    if-eqz v6, :cond_16

    check-cast v0, Ljava/lang/String;

    goto :goto_c

    :cond_16
    move-object/from16 v0, v17

    :goto_c
    if-nez p1, :cond_17

    .line 58
    invoke-static {v0, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    goto :goto_e

    :cond_17
    const/4 v6, 0x1

    if-eq v3, v6, :cond_19

    const/4 v6, 0x2

    if-ne v3, v6, :cond_18

    goto :goto_d

    .line 59
    :cond_18
    invoke-static {v1}, Lmj;->χ(Landroid/view/View;)V

    .line 60
    invoke-virtual {v1, v5, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void

    :cond_19
    const/4 v6, 0x2

    :goto_d
    if-ne v3, v6, :cond_1a

    .line 61
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 62
    invoke-static {v1}, Lmj;->χ(Landroid/view/View;)V

    .line 63
    invoke-virtual {v1, v5, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void

    .line 64
    :cond_1a
    invoke-static {v15}, Lmj;->π(Landroid/graphics/Rect;)Z

    move-result v0

    if-eqz v0, :cond_1c

    const v0, 0x7e0d0b03

    .line 65
    invoke-virtual {v1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1b

    goto :goto_e

    .line 66
    :cond_1b
    invoke-virtual {v1, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 67
    new-instance v0, Lgj;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lgj;-><init>(Landroid/view/ViewGroup;I)V

    const-wide/16 v2, 0x50

    invoke-virtual {v1, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_e
    return-void

    .line 68
    :cond_1c
    invoke-virtual {v15}, Landroid/graphics/Rect;->width()I

    move-result v6

    .line 69
    invoke-virtual {v15}, Landroid/graphics/Rect;->height()I

    move-result v8

    .line 70
    const-string v0, "comment_panel_height_px"

    const-string v12, "comment_panel_width_px"

    const/16 v13, 0x64

    if-lt v6, v13, :cond_20

    if-ge v8, v13, :cond_1d

    goto :goto_11

    :cond_1d
    const/16 v13, 0x2710

    if-gt v6, v13, :cond_20

    const/16 v13, 0x4e20

    if-le v8, v13, :cond_1e

    goto :goto_11

    .line 71
    :cond_1e
    :try_start_4
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    move-result-object v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    const/4 v14, 0x0

    :try_start_5
    invoke-interface {v13, v12, v14}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v25
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    move/from16 v13, v25

    goto :goto_f

    :catchall_4
    const/4 v14, 0x0

    :catchall_5
    move v13, v14

    .line 72
    :goto_f
    :try_start_6
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    move-result-object v5

    invoke-interface {v5, v0, v14}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto :goto_10

    :catchall_6
    const/4 v5, 0x0

    :goto_10
    sub-int/2addr v13, v6

    .line 73
    invoke-static {v13}, Ljava/lang/Math;->abs(I)I

    move-result v13

    const/4 v14, 0x2

    if-gt v13, v14, :cond_1f

    sub-int/2addr v5, v8

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v5

    if-gt v5, v14, :cond_1f

    goto :goto_11

    .line 74
    :cond_1f
    invoke-static {v12, v6}, Lui1;->Η(Ljava/lang/String;I)V

    .line 75
    invoke-static {v0, v8}, Lui1;->Η(Ljava/lang/String;I)V

    .line 76
    :cond_20
    :goto_11
    invoke-static {v1}, Lmj;->λ(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 77
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 78
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v12

    const/4 v13, 0x0

    :goto_12
    if-ge v13, v12, :cond_2a

    .line 79
    invoke-virtual {v1, v13}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v14

    if-nez v14, :cond_23

    :cond_21
    move-object/from16 p1, v0

    move-object/from16 v23, v2

    :cond_22
    :goto_13
    move/from16 v28, v12

    move/from16 v29, v13

    goto/16 :goto_14

    :cond_23
    if-eq v14, v0, :cond_21

    .line 80
    invoke-static {v13, v14, v1}, Lmj;->ρ(ILandroid/view/View;Landroid/view/ViewGroup;)Z

    move-result v23

    if-nez v23, :cond_21

    move-object/from16 p1, v0

    .line 81
    invoke-virtual {v14}, Landroid/view/View;->getVisibility()I

    move-result v0

    move-object/from16 v23, v2

    const/16 v2, 0x8

    if-eq v0, v2, :cond_22

    .line 82
    invoke-static {v14, v1}, Lmj;->γ(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/graphics/Rect;

    move-result-object v0

    .line 83
    invoke-static {v0}, Lmj;->π(Landroid/graphics/Rect;)Z

    move-result v24

    if-eqz v24, :cond_24

    goto :goto_13

    .line 84
    :cond_24
    invoke-static {v15}, Lmj;->π(Landroid/graphics/Rect;)Z

    move-result v24

    if-eqz v24, :cond_25

    goto :goto_13

    .line 85
    :cond_25
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2, v0}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 86
    invoke-virtual {v2, v15}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z

    move-result v24

    if-nez v24, :cond_26

    goto :goto_13

    :cond_26
    move-object/from16 v24, v0

    .line 87
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v0

    move/from16 v28, v12

    move/from16 v29, v13

    int-to-long v12, v0

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v0

    move-wide/from16 v30, v12

    int-to-long v12, v0

    mul-long v12, v12, v30

    .line 88
    invoke-virtual/range {v24 .. v24}, Landroid/graphics/Rect;->width()I

    move-result v0

    move-wide/from16 v30, v12

    int-to-long v12, v0

    invoke-virtual/range {v24 .. v24}, Landroid/graphics/Rect;->height()I

    move-result v0

    move-wide/from16 v32, v12

    int-to-long v12, v0

    mul-long v12, v12, v32

    .line 89
    invoke-virtual {v15}, Landroid/graphics/Rect;->width()I

    move-result v0

    move-wide/from16 v32, v12

    int-to-long v12, v0

    invoke-virtual {v15}, Landroid/graphics/Rect;->height()I

    move-result v0

    move-wide/from16 v34, v12

    int-to-long v12, v0

    mul-long v12, v12, v34

    cmp-long v0, v30, v18

    if-gtz v0, :cond_27

    goto :goto_14

    :cond_27
    const/16 v0, 0xf

    move-wide/from16 v34, v12

    int-to-long v12, v0

    mul-long v32, v32, v12

    move-wide/from16 v36, v12

    const/16 v2, 0x64

    int-to-long v12, v2

    .line 90
    div-long v32, v32, v12

    cmp-long v0, v30, v32

    if-gez v0, :cond_28

    mul-long v32, v34, v36

    .line 91
    div-long v32, v32, v12

    cmp-long v0, v30, v32

    if-ltz v0, :cond_29

    .line 92
    :cond_28
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_29
    :goto_14
    add-int/lit8 v13, v29, 0x1

    move-object/from16 v0, p1

    move-object/from16 v2, v23

    move/from16 v12, v28

    goto/16 :goto_12

    :cond_2a
    move-object/from16 v23, v2

    .line 93
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2b

    .line 94
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    :cond_2b
    invoke-static {v5}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 96
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2c

    .line 97
    invoke-static {v1}, Lmj;->χ(Landroid/view/View;)V

    const v2, 0x7e0d0b02

    .line 98
    invoke-virtual {v1, v2, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void

    .line 99
    :cond_2c
    invoke-static {v1}, Lmj;->χ(Landroid/view/View;)V

    .line 100
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v5, 0x0

    :goto_15
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/view/View;

    .line 101
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v14, 0x1

    if-eq v3, v14, :cond_46

    const/4 v14, 0x2

    if-eq v3, v14, :cond_2d

    move-object/from16 v24, v2

    move/from16 v16, v3

    move-object/from16 v31, v4

    move/from16 v27, v5

    move/from16 v28, v6

    move/from16 v29, v8

    move v1, v9

    move v2, v11

    move-object/from16 v32, v12

    move-object/from16 v33, v15

    move-object/from16 v4, v17

    :goto_16
    const/16 v8, 0x64

    goto/16 :goto_33

    .line 102
    :cond_2d
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2e

    move-object/from16 v24, v2

    move/from16 v16, v3

    move-object/from16 v31, v4

    move/from16 v27, v5

    move/from16 v28, v6

    move/from16 v29, v8

    move/from16 v34, v9

    move v2, v11

    move-object/from16 v32, v12

    move-object/from16 v33, v15

    :goto_17
    move-object/from16 v0, v17

    goto/16 :goto_2b

    .line 103
    :cond_2e
    :try_start_7
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 104
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_2f

    move-object/from16 v24, v0

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v14, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_18

    :cond_2f
    move-object/from16 v24, v0

    move-object/from16 v0, v17

    .line 105
    :goto_18
    const-string v14, "file"

    invoke-static {v0, v14}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_32

    .line 106
    invoke-virtual/range {v24 .. v24}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_31

    :catchall_7
    :cond_30
    move-object/from16 v24, v2

    move v14, v3

    move-wide/from16 v2, v18

    goto :goto_1a

    .line 107
    :cond_31
    new-instance v14, Ljava/io/File;

    invoke-direct {v14, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14}, Ljava/io/File;->lastModified()J

    move-result-wide v27

    :goto_19
    move-object/from16 v24, v2

    move v14, v3

    move-wide/from16 v2, v27

    goto :goto_1a

    :cond_32
    if-eqz v0, :cond_33

    .line 108
    const-string v14, ""

    .line 109
    invoke-virtual {v0, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_30

    .line 110
    :cond_33
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v27
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    goto :goto_19

    .line 111
    :goto_1a
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-lez v6, :cond_34

    goto :goto_1b

    :cond_34
    move-object/from16 v0, v17

    :goto_1b
    if-eqz v0, :cond_35

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_1c
    move/from16 v27, v5

    move v5, v0

    goto :goto_1d

    .line 112
    :cond_35
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    goto :goto_1c

    .line 113
    :goto_1d
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-lez v8, :cond_36

    goto :goto_1e

    :cond_36
    move-object/from16 v0, v17

    :goto_1e
    if-eqz v0, :cond_37

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_1f
    move/from16 v28, v6

    move v6, v0

    goto :goto_20

    .line 114
    :cond_37
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    goto :goto_1f

    :goto_20
    if-eqz v10, :cond_41

    .line 115
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_38

    move-object/from16 v31, v4

    move/from16 v29, v8

    move/from16 v34, v9

    move/from16 v37, v11

    move-object/from16 v32, v12

    move/from16 v16, v14

    move-object/from16 v33, v15

    :catchall_8
    :goto_21
    move-object/from16 v0, v17

    goto/16 :goto_28

    :cond_38
    move/from16 v29, v16

    move/from16 v16, v14

    move/from16 v14, v29

    move/from16 v29, v8

    const/4 v8, 0x1

    .line 116
    invoke-static {v11, v8, v14}, Lj81;->μ(III)I

    move-result v0

    if-ge v5, v8, :cond_39

    move v14, v8

    goto :goto_22

    :cond_39
    move v14, v5

    :goto_22
    if-ge v6, v8, :cond_3a

    const/4 v8, 0x1

    :goto_23
    move-object/from16 v31, v4

    goto :goto_24

    :cond_3a
    move v8, v6

    goto :goto_23

    .line 117
    :goto_24
    new-instance v4, Ljava/io/File;

    invoke-virtual {v13}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    move-object/from16 v32, v12

    const-string v12, "comment_bg_blur_cache"

    invoke-direct {v4, v1, v12}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    .line 118
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "|"

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 119
    const-string v12, "SHA-256"

    invoke-static {v12}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v12

    move-object/from16 v33, v15

    .line 120
    sget-object v15, Lmf;->α:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v15}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v12, v1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v1

    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v12, ""

    .line 122
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move/from16 v34, v9

    .line 124
    array-length v9, v1

    move-object/from16 v35, v1

    const/4 v1, 0x0

    const/16 v36, 0x0

    :goto_25
    if-ge v1, v9, :cond_3c

    aget-byte v37, v35, v1

    move/from16 v38, v1

    move/from16 v39, v9

    const/4 v1, 0x1

    add-int/lit8 v9, v36, 0x1

    if-le v9, v1, :cond_3b

    .line 125
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 126
    :cond_3b
    invoke-static/range {v37 .. v37}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v21

    move/from16 v36, v9

    .line 127
    const-string v9, "%02x"

    move/from16 v37, v11

    filled-new-array/range {v21 .. v21}, [Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 128
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    add-int/lit8 v1, v38, 0x1

    move/from16 v11, v37

    move/from16 v9, v39

    goto :goto_25

    :cond_3c
    move/from16 v37, v11

    .line 129
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 130
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v9, 0x20

    .line 131
    invoke-static {v1, v9}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    const-string v9, ".png"

    invoke-virtual {v1, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 132
    new-instance v9, Ljava/io/File;

    invoke-direct {v9, v4, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 133
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_3d

    invoke-virtual {v9}, Ljava/io/File;->length()J

    move-result-wide v11

    cmp-long v1, v11, v18

    if-lez v1, :cond_3d

    .line 134
    invoke-static {v9}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_28

    .line 135
    :cond_3d
    :try_start_8
    invoke-static {v13, v7, v14, v8}, Lmj;->ζ(Landroid/content/Context;Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v1

    if-nez v1, :cond_3e

    goto/16 :goto_21

    .line 136
    :cond_3e
    invoke-static {v0, v1}, Lmj;->β(ILandroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eq v0, v1, :cond_3f

    .line 137
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v4

    if-nez v4, :cond_3f

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_26

    :catchall_9
    move-exception v0

    goto :goto_27

    .line 138
    :cond_3f
    :goto_26
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v9}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_9

    .line 139
    :try_start_9
    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v8, 0x64

    invoke-virtual {v0, v4, v8, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 140
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_a

    .line 141
    :try_start_a
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 142
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_40

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 143
    :cond_40
    invoke-static {v9}, Lmj;->δ(Ljava/io/File;)V

    .line 144
    invoke-static {v9}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    goto :goto_28

    :catchall_a
    move-exception v0

    move-object v4, v0

    .line 145
    :try_start_b
    throw v4
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    :catchall_b
    move-exception v0

    :try_start_c
    invoke-static {v1, v4}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    .line 146
    :goto_27
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "create blurred cache failed: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lmj;->σ(Ljava/lang/String;)V

    .line 147
    :try_start_d
    invoke-virtual {v9}, Ljava/io/File;->delete()Z
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    goto/16 :goto_21

    :goto_28
    if-nez v0, :cond_42

    :goto_29
    move-object v0, v7

    goto :goto_2a

    :cond_41
    move-object/from16 v31, v4

    move/from16 v29, v8

    move/from16 v34, v9

    move/from16 v37, v11

    move-object/from16 v32, v12

    move/from16 v16, v14

    move-object/from16 v33, v15

    goto :goto_29

    .line 148
    :cond_42
    :goto_2a
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "|"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "|"

    const-string v3, "|"

    .line 149
    invoke-static {v1, v5, v2, v6, v3}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 150
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v2, v37

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 151
    sget-object v3, Lmj;->ι:Ljava/lang/Object;

    monitor-enter v3

    .line 152
    :try_start_e
    sget-object v4, Lmj;->κ:Lij;

    if-eqz v4, :cond_43

    .line 153
    iget-object v8, v4, Lij;->α:Ljava/lang/String;

    .line 154
    invoke-virtual {v8, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_43

    .line 155
    iget-object v8, v4, Lij;->β:Landroid/graphics/Bitmap;

    .line 156
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v8

    if-nez v8, :cond_43

    .line 157
    iget-object v0, v4, Lij;->β:Landroid/graphics/Bitmap;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_c

    .line 158
    monitor-exit v3

    goto :goto_2b

    :catchall_c
    move-exception v0

    goto :goto_2c

    .line 159
    :cond_43
    :try_start_f
    invoke-static {v13, v0, v5, v6}, Lmj;->ζ(Landroid/content/Context;Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_c

    if-nez v0, :cond_44

    .line 160
    monitor-exit v3

    goto/16 :goto_17

    .line 161
    :cond_44
    :try_start_10
    new-instance v4, Lij;

    invoke-direct {v4, v1, v0}, Lij;-><init>(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    sput-object v4, Lmj;->κ:Lij;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_c

    .line 162
    monitor-exit v3

    :goto_2b
    if-nez v0, :cond_45

    move-object/from16 v4, v17

    move/from16 v1, v34

    goto/16 :goto_16

    :cond_45
    move/from16 v1, v34

    const/16 v8, 0x64

    const/4 v14, 0x0

    .line 163
    invoke-static {v1, v14, v8}, Lj81;->μ(III)I

    move-result v3

    const/16 v4, 0xff

    mul-int/2addr v3, v4

    div-int/2addr v3, v8

    .line 164
    invoke-static {v3, v14, v4}, Lj81;->μ(III)I

    move-result v3

    .line 165
    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-direct {v4, v5, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    const/16 v5, 0x77

    .line 166
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/BitmapDrawable;->setGravity(I)V

    .line 167
    invoke-virtual {v4, v3}, Landroid/graphics/drawable/BitmapDrawable;->setAlpha(I)V

    goto/16 :goto_33

    .line 168
    :goto_2c
    monitor-exit v3

    throw v0

    :cond_46
    move-object/from16 v24, v2

    move/from16 v16, v3

    move-object/from16 v31, v4

    move/from16 v27, v5

    move/from16 v28, v6

    move/from16 v29, v8

    move v1, v9

    move v2, v11

    move-object/from16 v32, v12

    move-object/from16 v33, v15

    const/16 v8, 0x64

    .line 169
    const-string v0, "#FF1A1A2E"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    .line 170
    :try_start_11
    invoke-static/range {v23 .. v23}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_d

    .line 171
    :catchall_d
    const-string v3, "create solid color bitmap failed: "

    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    if-lez v28, :cond_47

    goto :goto_2d

    :cond_47
    move-object/from16 v4, v17

    :goto_2d
    if-eqz v4, :cond_48

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_2e

    .line 172
    :cond_48
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 173
    :goto_2e
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    if-lez v29, :cond_49

    goto :goto_2f

    :cond_49
    move-object/from16 v5, v17

    :goto_2f
    if-eqz v5, :cond_4a

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    :goto_30
    move v6, v5

    const/4 v14, 0x1

    goto :goto_31

    .line 174
    :cond_4a
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    goto :goto_30

    :goto_31
    if-ge v4, v14, :cond_4b

    move v4, v14

    :cond_4b
    if-ge v6, v14, :cond_4c

    const/4 v6, 0x1

    .line 175
    :cond_4c
    const-string v5, "solidColor|"

    const-string v9, "|"

    const-string v11, "|"

    .line 176
    invoke-static {v5, v0, v9, v4, v11}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 177
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 178
    sget-object v9, Lmj;->ι:Ljava/lang/Object;

    monitor-enter v9

    .line 179
    :try_start_12
    sget-object v11, Lmj;->θ:Llj;

    if-eqz v11, :cond_4d

    .line 180
    iget-object v12, v11, Llj;->α:Ljava/lang/String;

    .line 181
    invoke-virtual {v12, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4d

    .line 182
    iget-object v12, v11, Llj;->β:Landroid/graphics/Bitmap;

    .line 183
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v12

    if-nez v12, :cond_4d

    .line 184
    iget-object v0, v11, Llj;->β:Landroid/graphics/Bitmap;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_e

    .line 185
    monitor-exit v9

    goto :goto_32

    :catchall_e
    move-exception v0

    goto/16 :goto_3d

    .line 186
    :cond_4d
    :try_start_13
    sget-object v11, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 187
    invoke-static {v4, v6, v11}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 188
    invoke-virtual {v4, v0}, Landroid/graphics/Bitmap;->eraseColor(I)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_f

    .line 189
    :try_start_14
    new-instance v0, Llj;

    invoke-direct {v0, v5, v4}, Llj;-><init>(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    sput-object v0, Lmj;->θ:Llj;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_e

    .line 190
    monitor-exit v9

    move-object v0, v4

    goto :goto_32

    :catchall_f
    move-exception v0

    .line 191
    :try_start_15
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lmj;->σ(Ljava/lang/String;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_e

    .line 192
    monitor-exit v9

    move-object/from16 v0, v17

    :goto_32
    if-nez v0, :cond_4e

    move-object/from16 v4, v17

    goto :goto_33

    .line 193
    :cond_4e
    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v4, v3, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    const/16 v5, 0x77

    .line 194
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/BitmapDrawable;->setGravity(I)V

    :goto_33
    if-nez v4, :cond_4f

    const/16 v21, 0x1

    move-object/from16 v11, p0

    move-object/from16 v15, v33

    goto/16 :goto_39

    .line 195
    :cond_4f
    invoke-virtual/range {v32 .. v32}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual/range {v32 .. v32}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    invoke-static {v0, v3}, Lmj;->υ(II)I

    move-result v0

    .line 196
    invoke-virtual/range {v32 .. v32}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual/range {v32 .. v32}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    invoke-static {v3, v5}, Lmj;->υ(II)I

    move-result v3

    if-lez v0, :cond_50

    if-gtz v3, :cond_51

    :cond_50
    move-object/from16 v11, p0

    move-object/from16 v12, v32

    move-object/from16 v15, v33

    const/16 v21, 0x1

    goto/16 :goto_37

    .line 197
    :cond_51
    invoke-static/range {v33 .. v33}, Lmj;->π(Landroid/graphics/Rect;)Z

    move-result v5

    if-eqz v5, :cond_52

    move-object/from16 v11, p0

    move-object/from16 v4, v17

    move-object/from16 v12, v32

    move-object/from16 v15, v33

    const/16 v21, 0x1

    goto/16 :goto_38

    .line 198
    :cond_52
    invoke-virtual/range {v32 .. v32}, Landroid/view/View;->getWidth()I

    move-result v5

    invoke-virtual/range {v32 .. v32}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    invoke-static {v5, v6}, Lmj;->υ(II)I

    move-result v5

    .line 199
    invoke-virtual/range {v32 .. v32}, Landroid/view/View;->getHeight()I

    move-result v6

    invoke-virtual/range {v32 .. v32}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    invoke-static {v6, v9}, Lmj;->υ(II)I

    move-result v6

    if-lez v5, :cond_53

    if-gtz v6, :cond_54

    :cond_53
    move-object/from16 v11, p0

    move-object/from16 v12, v32

    move-object/from16 v15, v33

    const/16 v21, 0x1

    goto :goto_35

    .line 200
    :cond_54
    invoke-static/range {v33 .. v33}, Lmj;->π(Landroid/graphics/Rect;)Z

    move-result v9

    if-eqz v9, :cond_55

    .line 201
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    move-object/from16 v11, p0

    move-object/from16 v12, v32

    move-object/from16 v15, v33

    const/16 v21, 0x1

    goto :goto_36

    .line 202
    :cond_55
    new-instance v9, Landroid/graphics/Rect;

    move-object/from16 v15, v33

    invoke-direct {v9, v15}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    move-object/from16 v11, p0

    move-object/from16 v12, v32

    if-eq v12, v11, :cond_56

    const/4 v14, 0x2

    .line 203
    :try_start_16
    new-array v13, v14, [I

    .line 204
    new-array v8, v14, [I

    .line 205
    invoke-virtual {v11, v13}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 206
    invoke-virtual {v12, v8}, Landroid/view/View;->getLocationOnScreen([I)V

    const/16 v25, 0x0

    .line 207
    aget v20, v13, v25

    aget v32, v8, v25
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_10

    sub-int v14, v20, v32

    const/16 v21, 0x1

    .line 208
    :try_start_17
    aget v13, v13, v21

    aget v8, v8, v21

    sub-int/2addr v13, v8

    .line 209
    invoke-virtual {v9, v14, v13}, Landroid/graphics/Rect;->offset(II)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_11

    goto :goto_34

    :catchall_10
    const/16 v21, 0x1

    .line 210
    :catchall_11
    invoke-static {v12, v11}, Lmj;->γ(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/graphics/Rect;

    move-result-object v8

    .line 211
    iget v13, v8, Landroid/graphics/Rect;->left:I

    neg-int v13, v13

    iget v8, v8, Landroid/graphics/Rect;->top:I

    neg-int v8, v8

    invoke-virtual {v9, v13, v8}, Landroid/graphics/Rect;->offset(II)V

    goto :goto_34

    :cond_56
    const/16 v21, 0x1

    .line 212
    :goto_34
    new-instance v8, Landroid/graphics/Rect;

    invoke-direct {v8, v9}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    const/4 v14, 0x0

    .line 213
    invoke-virtual {v8, v14, v14, v5, v6}, Landroid/graphics/Rect;->intersect(IIII)Z

    move-result v5

    if-nez v5, :cond_57

    .line 214
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    goto :goto_36

    :cond_57
    move-object v5, v8

    goto :goto_36

    .line 215
    :goto_35
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 216
    :goto_36
    invoke-static {v5}, Lmj;->π(Landroid/graphics/Rect;)Z

    move-result v6

    if-eqz v6, :cond_58

    :goto_37
    move-object/from16 v4, v17

    goto :goto_38

    .line 217
    :cond_58
    iget v6, v5, Landroid/graphics/Rect;->left:I

    if-gtz v6, :cond_59

    .line 218
    iget v6, v5, Landroid/graphics/Rect;->top:I

    if-gtz v6, :cond_59

    .line 219
    iget v6, v5, Landroid/graphics/Rect;->right:I

    if-lt v6, v0, :cond_59

    .line 220
    iget v0, v5, Landroid/graphics/Rect;->bottom:I

    if-lt v0, v3, :cond_59

    goto :goto_38

    .line 221
    :cond_59
    new-instance v0, Ljj;

    invoke-direct {v0, v4, v5}, Ljj;-><init>(Landroid/graphics/drawable/BitmapDrawable;Landroid/graphics/Rect;)V

    move-object v4, v0

    :goto_38
    if-nez v4, :cond_5a

    :goto_39
    move/from16 v5, v27

    const/4 v14, 0x0

    goto :goto_3c

    :cond_5a
    const v0, 0x7e0d0b01

    .line 222
    invoke-virtual {v12, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_5b

    goto :goto_3a

    .line 223
    :cond_5b
    invoke-virtual {v12}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-nez v3, :cond_5c

    .line 224
    sget-object v3, Lx;->χ:Lx;

    invoke-virtual {v12, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    goto :goto_3a

    .line 225
    :cond_5c
    invoke-virtual {v12, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 226
    :goto_3a
    invoke-virtual {v12, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 227
    invoke-virtual {v12}, Landroid/view/View;->invalidate()V

    .line 228
    instance-of v0, v12, Landroid/view/ViewGroup;

    if-eqz v0, :cond_5d

    .line 229
    check-cast v12, Landroid/view/ViewGroup;

    const/4 v14, 0x0

    invoke-static {v12, v14}, Lmj;->ε(Landroid/view/ViewGroup;I)V

    goto :goto_3b

    :cond_5d
    const/4 v14, 0x0

    :goto_3b
    move/from16 v5, v21

    :goto_3c
    move v9, v1

    move-object v1, v11

    move/from16 v3, v16

    move/from16 v6, v28

    move/from16 v8, v29

    move-object/from16 v4, v31

    const/16 v16, 0x19

    move v11, v2

    move-object/from16 v2, v24

    goto/16 :goto_15

    .line 230
    :goto_3d
    monitor-exit v9

    throw v0

    :cond_5e
    move-object v11, v1

    move-object/from16 v31, v4

    move/from16 v27, v5

    if-nez v27, :cond_5f

    .line 231
    invoke-static {v11}, Lmj;->χ(Landroid/view/View;)V

    :cond_5f
    move-object/from16 v1, v31

    const v2, 0x7e0d0b02

    .line 232
    invoke-virtual {v11, v2, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public static β(ILandroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 26

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    int-to-float v1, v0

    .line 4
    const/high16 v2, 0x40c00000    # 6.0f

    .line 5
    .line 6
    div-float/2addr v1, v2

    .line 7
    const/high16 v2, 0x3f800000    # 1.0f

    .line 8
    .line 9
    add-float/2addr v1, v2

    .line 10
    div-float/2addr v2, v1

    .line 11
    const v1, 0x3df5c28f    # 0.12f

    .line 12
    .line 13
    .line 14
    const/high16 v3, 0x3f000000    # 0.5f

    .line 15
    .line 16
    invoke-static {v2, v1, v3}, Lj81;->λ(FFF)F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    int-to-float v2, v2

    .line 25
    mul-float/2addr v2, v1

    .line 26
    invoke-static {v2}, Ljx0;->в(F)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    int-to-float v4, v4

    .line 40
    mul-float/2addr v4, v1

    .line 41
    invoke-static {v4}, Ljx0;->в(F)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    move-object/from16 v4, p1

    .line 50
    .line 51
    invoke-static {v4, v2, v1, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    div-int/lit8 v2, v0, 0x8

    .line 59
    .line 60
    const/4 v5, 0x4

    .line 61
    invoke-static {v2, v3, v5}, Lj81;->μ(III)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    const/4 v5, 0x0

    .line 66
    move-object v7, v1

    .line 67
    move v6, v5

    .line 68
    :goto_0
    if-ge v6, v2, :cond_9

    .line 69
    .line 70
    const/16 v8, 0x19

    .line 71
    .line 72
    invoke-static {v0, v3, v8}, Lj81;->μ(III)I

    .line 73
    .line 74
    .line 75
    move-result v15

    .line 76
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    .line 81
    .line 82
    .line 83
    move-result v14

    .line 84
    mul-int v8, v10, v14

    .line 85
    .line 86
    new-array v9, v8, [I

    .line 87
    .line 88
    new-array v11, v8, [I

    .line 89
    .line 90
    new-array v8, v8, [I

    .line 91
    .line 92
    move-object v12, v11

    .line 93
    const/4 v11, 0x0

    .line 94
    move-object v13, v12

    .line 95
    const/4 v12, 0x0

    .line 96
    move-object/from16 v16, v8

    .line 97
    .line 98
    move-object v8, v9

    .line 99
    const/4 v9, 0x0

    .line 100
    move-object/from16 v17, v13

    .line 101
    .line 102
    move v13, v10

    .line 103
    move-object/from16 v25, v16

    .line 104
    .line 105
    move/from16 v16, v3

    .line 106
    .line 107
    move-object/from16 v3, v25

    .line 108
    .line 109
    invoke-virtual/range {v7 .. v14}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 110
    .line 111
    .line 112
    mul-int/lit8 v9, v15, 0x2

    .line 113
    .line 114
    add-int/lit8 v9, v9, 0x1

    .line 115
    .line 116
    move v11, v5

    .line 117
    :goto_1
    if-ge v11, v14, :cond_3

    .line 118
    .line 119
    mul-int v12, v11, v10

    .line 120
    .line 121
    neg-int v13, v15

    .line 122
    if-gt v13, v15, :cond_0

    .line 123
    .line 124
    move/from16 v18, v5

    .line 125
    .line 126
    move/from16 v19, v18

    .line 127
    .line 128
    move/from16 v20, v19

    .line 129
    .line 130
    move/from16 v21, v20

    .line 131
    .line 132
    :goto_2
    add-int/lit8 v0, v10, -0x1

    .line 133
    .line 134
    invoke-static {v13, v5, v0}, Lj81;->μ(III)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    add-int/2addr v0, v12

    .line 139
    aget v0, v8, v0

    .line 140
    .line 141
    ushr-int/lit8 v22, v0, 0x18

    .line 142
    .line 143
    add-int v18, v18, v22

    .line 144
    .line 145
    shr-int/lit8 v5, v0, 0x10

    .line 146
    .line 147
    and-int/lit16 v5, v5, 0xff

    .line 148
    .line 149
    add-int v19, v19, v5

    .line 150
    .line 151
    shr-int/lit8 v5, v0, 0x8

    .line 152
    .line 153
    and-int/lit16 v5, v5, 0xff

    .line 154
    .line 155
    add-int v20, v20, v5

    .line 156
    .line 157
    and-int/lit16 v0, v0, 0xff

    .line 158
    .line 159
    add-int v21, v21, v0

    .line 160
    .line 161
    if-eq v13, v15, :cond_1

    .line 162
    .line 163
    add-int/lit8 v13, v13, 0x1

    .line 164
    .line 165
    move/from16 v0, p0

    .line 166
    .line 167
    const/4 v5, 0x0

    .line 168
    goto :goto_2

    .line 169
    :cond_0
    const/16 v18, 0x0

    .line 170
    .line 171
    const/16 v19, 0x0

    .line 172
    .line 173
    const/16 v20, 0x0

    .line 174
    .line 175
    const/16 v21, 0x0

    .line 176
    .line 177
    :cond_1
    const/4 v0, 0x0

    .line 178
    :goto_3
    if-ge v0, v10, :cond_2

    .line 179
    .line 180
    add-int v5, v12, v0

    .line 181
    .line 182
    div-int v13, v18, v9

    .line 183
    .line 184
    shl-int/lit8 v13, v13, 0x18

    .line 185
    .line 186
    div-int v23, v19, v9

    .line 187
    .line 188
    shl-int/lit8 v23, v23, 0x10

    .line 189
    .line 190
    or-int v13, v13, v23

    .line 191
    .line 192
    div-int v23, v20, v9

    .line 193
    .line 194
    shl-int/lit8 v23, v23, 0x8

    .line 195
    .line 196
    or-int v13, v13, v23

    .line 197
    .line 198
    div-int v23, v21, v9

    .line 199
    .line 200
    or-int v13, v13, v23

    .line 201
    .line 202
    aput v13, v17, v5

    .line 203
    .line 204
    sub-int v5, v0, v15

    .line 205
    .line 206
    add-int/lit8 v13, v10, -0x1

    .line 207
    .line 208
    move/from16 v23, v0

    .line 209
    .line 210
    const/4 v0, 0x0

    .line 211
    invoke-static {v5, v0, v13}, Lj81;->μ(III)I

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    add-int/2addr v5, v12

    .line 216
    aget v5, v8, v5

    .line 217
    .line 218
    add-int v22, v23, v15

    .line 219
    .line 220
    move/from16 v24, v2

    .line 221
    .line 222
    add-int/lit8 v2, v22, 0x1

    .line 223
    .line 224
    invoke-static {v2, v0, v13}, Lj81;->μ(III)I

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    add-int/2addr v2, v12

    .line 229
    aget v0, v8, v2

    .line 230
    .line 231
    ushr-int/lit8 v2, v0, 0x18

    .line 232
    .line 233
    ushr-int/lit8 v13, v5, 0x18

    .line 234
    .line 235
    sub-int/2addr v2, v13

    .line 236
    add-int v18, v2, v18

    .line 237
    .line 238
    shr-int/lit8 v2, v0, 0x10

    .line 239
    .line 240
    and-int/lit16 v2, v2, 0xff

    .line 241
    .line 242
    shr-int/lit8 v13, v5, 0x10

    .line 243
    .line 244
    and-int/lit16 v13, v13, 0xff

    .line 245
    .line 246
    sub-int/2addr v2, v13

    .line 247
    add-int v19, v2, v19

    .line 248
    .line 249
    shr-int/lit8 v2, v0, 0x8

    .line 250
    .line 251
    and-int/lit16 v2, v2, 0xff

    .line 252
    .line 253
    shr-int/lit8 v13, v5, 0x8

    .line 254
    .line 255
    and-int/lit16 v13, v13, 0xff

    .line 256
    .line 257
    sub-int/2addr v2, v13

    .line 258
    add-int v20, v2, v20

    .line 259
    .line 260
    and-int/lit16 v0, v0, 0xff

    .line 261
    .line 262
    and-int/lit16 v2, v5, 0xff

    .line 263
    .line 264
    sub-int/2addr v0, v2

    .line 265
    add-int v21, v0, v21

    .line 266
    .line 267
    add-int/lit8 v0, v23, 0x1

    .line 268
    .line 269
    move/from16 v2, v24

    .line 270
    .line 271
    goto :goto_3

    .line 272
    :cond_2
    move/from16 v24, v2

    .line 273
    .line 274
    add-int/lit8 v11, v11, 0x1

    .line 275
    .line 276
    move/from16 v0, p0

    .line 277
    .line 278
    const/4 v5, 0x0

    .line 279
    goto/16 :goto_1

    .line 280
    .line 281
    :cond_3
    move/from16 v24, v2

    .line 282
    .line 283
    const/4 v0, 0x0

    .line 284
    :goto_4
    if-ge v0, v10, :cond_7

    .line 285
    .line 286
    neg-int v2, v15

    .line 287
    if-gt v2, v15, :cond_4

    .line 288
    .line 289
    const/4 v5, 0x0

    .line 290
    const/4 v8, 0x0

    .line 291
    const/4 v11, 0x0

    .line 292
    const/4 v12, 0x0

    .line 293
    :goto_5
    add-int/lit8 v13, v14, -0x1

    .line 294
    .line 295
    move/from16 v18, v0

    .line 296
    .line 297
    const/4 v0, 0x0

    .line 298
    invoke-static {v2, v0, v13}, Lj81;->μ(III)I

    .line 299
    .line 300
    .line 301
    move-result v13

    .line 302
    mul-int/2addr v13, v10

    .line 303
    add-int v13, v13, v18

    .line 304
    .line 305
    aget v0, v17, v13

    .line 306
    .line 307
    ushr-int/lit8 v13, v0, 0x18

    .line 308
    .line 309
    add-int/2addr v5, v13

    .line 310
    shr-int/lit8 v13, v0, 0x10

    .line 311
    .line 312
    and-int/lit16 v13, v13, 0xff

    .line 313
    .line 314
    add-int/2addr v8, v13

    .line 315
    shr-int/lit8 v13, v0, 0x8

    .line 316
    .line 317
    and-int/lit16 v13, v13, 0xff

    .line 318
    .line 319
    add-int/2addr v11, v13

    .line 320
    and-int/lit16 v0, v0, 0xff

    .line 321
    .line 322
    add-int/2addr v12, v0

    .line 323
    if-eq v2, v15, :cond_5

    .line 324
    .line 325
    add-int/lit8 v2, v2, 0x1

    .line 326
    .line 327
    move/from16 v0, v18

    .line 328
    .line 329
    goto :goto_5

    .line 330
    :cond_4
    move/from16 v18, v0

    .line 331
    .line 332
    const/4 v5, 0x0

    .line 333
    const/4 v8, 0x0

    .line 334
    const/4 v11, 0x0

    .line 335
    const/4 v12, 0x0

    .line 336
    :cond_5
    const/4 v0, 0x0

    .line 337
    :goto_6
    if-ge v0, v14, :cond_6

    .line 338
    .line 339
    mul-int v2, v0, v10

    .line 340
    .line 341
    add-int v2, v2, v18

    .line 342
    .line 343
    div-int v13, v5, v9

    .line 344
    .line 345
    shl-int/lit8 v13, v13, 0x18

    .line 346
    .line 347
    div-int v19, v8, v9

    .line 348
    .line 349
    shl-int/lit8 v19, v19, 0x10

    .line 350
    .line 351
    or-int v13, v13, v19

    .line 352
    .line 353
    div-int v19, v11, v9

    .line 354
    .line 355
    shl-int/lit8 v19, v19, 0x8

    .line 356
    .line 357
    or-int v13, v13, v19

    .line 358
    .line 359
    div-int v19, v12, v9

    .line 360
    .line 361
    or-int v13, v13, v19

    .line 362
    .line 363
    aput v13, v3, v2

    .line 364
    .line 365
    sub-int v2, v0, v15

    .line 366
    .line 367
    add-int/lit8 v13, v14, -0x1

    .line 368
    .line 369
    move/from16 v19, v0

    .line 370
    .line 371
    const/4 v0, 0x0

    .line 372
    invoke-static {v2, v0, v13}, Lj81;->μ(III)I

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    mul-int/2addr v2, v10

    .line 377
    add-int v2, v2, v18

    .line 378
    .line 379
    aget v2, v17, v2

    .line 380
    .line 381
    add-int v20, v19, v15

    .line 382
    .line 383
    add-int/lit8 v4, v20, 0x1

    .line 384
    .line 385
    invoke-static {v4, v0, v13}, Lj81;->μ(III)I

    .line 386
    .line 387
    .line 388
    move-result v4

    .line 389
    mul-int/2addr v4, v10

    .line 390
    add-int v4, v4, v18

    .line 391
    .line 392
    aget v0, v17, v4

    .line 393
    .line 394
    ushr-int/lit8 v4, v0, 0x18

    .line 395
    .line 396
    ushr-int/lit8 v13, v2, 0x18

    .line 397
    .line 398
    sub-int/2addr v4, v13

    .line 399
    add-int/2addr v5, v4

    .line 400
    shr-int/lit8 v4, v0, 0x10

    .line 401
    .line 402
    and-int/lit16 v4, v4, 0xff

    .line 403
    .line 404
    shr-int/lit8 v13, v2, 0x10

    .line 405
    .line 406
    and-int/lit16 v13, v13, 0xff

    .line 407
    .line 408
    sub-int/2addr v4, v13

    .line 409
    add-int/2addr v8, v4

    .line 410
    shr-int/lit8 v4, v0, 0x8

    .line 411
    .line 412
    and-int/lit16 v4, v4, 0xff

    .line 413
    .line 414
    shr-int/lit8 v13, v2, 0x8

    .line 415
    .line 416
    and-int/lit16 v13, v13, 0xff

    .line 417
    .line 418
    sub-int/2addr v4, v13

    .line 419
    add-int/2addr v11, v4

    .line 420
    and-int/lit16 v0, v0, 0xff

    .line 421
    .line 422
    and-int/lit16 v2, v2, 0xff

    .line 423
    .line 424
    sub-int/2addr v0, v2

    .line 425
    add-int/2addr v12, v0

    .line 426
    add-int/lit8 v0, v19, 0x1

    .line 427
    .line 428
    move-object/from16 v4, p1

    .line 429
    .line 430
    goto :goto_6

    .line 431
    :cond_6
    add-int/lit8 v0, v18, 0x1

    .line 432
    .line 433
    move-object/from16 v4, p1

    .line 434
    .line 435
    goto/16 :goto_4

    .line 436
    .line 437
    :cond_7
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 438
    .line 439
    invoke-static {v3, v10, v14, v0}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    if-eq v7, v1, :cond_8

    .line 447
    .line 448
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 449
    .line 450
    .line 451
    move-result v2

    .line 452
    if-nez v2, :cond_8

    .line 453
    .line 454
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->recycle()V

    .line 455
    .line 456
    .line 457
    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 458
    .line 459
    move-object/from16 v4, p1

    .line 460
    .line 461
    move-object v7, v0

    .line 462
    move/from16 v3, v16

    .line 463
    .line 464
    move/from16 v2, v24

    .line 465
    .line 466
    const/4 v5, 0x0

    .line 467
    move/from16 v0, p0

    .line 468
    .line 469
    goto/16 :goto_0

    .line 470
    .line 471
    :cond_9
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 472
    .line 473
    .line 474
    move-result v0

    .line 475
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 476
    .line 477
    .line 478
    move-result v1

    .line 479
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 480
    .line 481
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    new-instance v1, Landroid/graphics/Canvas;

    .line 489
    .line 490
    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 491
    .line 492
    .line 493
    new-instance v2, Landroid/graphics/Rect;

    .line 494
    .line 495
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 496
    .line 497
    .line 498
    move-result v3

    .line 499
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 500
    .line 501
    .line 502
    move-result v4

    .line 503
    const/4 v5, 0x0

    .line 504
    invoke-direct {v2, v5, v5, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 505
    .line 506
    .line 507
    new-instance v3, Landroid/graphics/Paint;

    .line 508
    .line 509
    const/4 v4, 0x6

    .line 510
    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 511
    .line 512
    .line 513
    const/4 v4, 0x0

    .line 514
    invoke-virtual {v1, v7, v4, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 518
    .line 519
    .line 520
    move-result v1

    .line 521
    if-nez v1, :cond_a

    .line 522
    .line 523
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->recycle()V

    .line 524
    .line 525
    .line 526
    :cond_a
    return-object v0
.end method

.method public static γ(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/graphics/Rect;
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, Lmj;->υ(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-static {v1, v2}, Lmj;->υ(II)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-lez v0, :cond_1

    .line 26
    .line 27
    if-gtz v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v2, 0x2

    .line 31
    :try_start_0
    new-array v3, v2, [I

    .line 32
    .line 33
    new-array v2, v2, [I

    .line 34
    .line 35
    invoke-virtual {p1, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    aget v4, v2, p1

    .line 43
    .line 44
    aget p1, v3, p1

    .line 45
    .line 46
    sub-int/2addr v4, p1

    .line 47
    const/4 p1, 0x1

    .line 48
    aget v2, v2, p1

    .line 49
    .line 50
    aget p1, v3, p1

    .line 51
    .line 52
    sub-int/2addr v2, p1

    .line 53
    new-instance p1, Landroid/graphics/Rect;

    .line 54
    .line 55
    add-int v3, v4, v0

    .line 56
    .line 57
    add-int v5, v2, v1

    .line 58
    .line 59
    invoke-direct {p1, v4, v2, v3, v5}, Landroid/graphics/Rect;-><init>(IIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    return-object p1

    .line 63
    :catchall_0
    new-instance p1, Landroid/graphics/Rect;

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    add-int/2addr v4, v0

    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    add-int/2addr p0, v1

    .line 83
    invoke-direct {p1, v2, v3, v4, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 84
    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_1
    :goto_0
    new-instance p0, Landroid/graphics/Rect;

    .line 88
    .line 89
    invoke-direct {p0}, Landroid/graphics/Rect;-><init>()V

    .line 90
    .line 91
    .line 92
    return-object p0
.end method

.method public static δ(Ljava/io/File;)V
    .locals 7

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    array-length v2, v0

    .line 19
    const/4 v3, 0x0

    .line 20
    :goto_0
    if-ge v3, v2, :cond_1

    .line 21
    .line 22
    aget-object v4, v0, v3

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-static {v5, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-nez v5, :cond_0

    .line 43
    .line 44
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    new-instance p0, Ltf;

    .line 51
    .line 52
    const/4 v0, 0x7

    .line 53
    invoke-direct {p0, v0}, Ltf;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-static {v1, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const/4 v0, 0x3

    .line 61
    invoke-static {p0, v0}, Lxh;->Г(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Ljava/io/File;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catchall_0
    :cond_2
    return-void
.end method

.method public static ε(Landroid/view/ViewGroup;I)V
    .locals 16

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_9

    .line 8
    .line 9
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v3, 0x0

    .line 14
    :goto_0
    if-ge v3, v1, :cond_10

    .line 15
    .line 16
    move-object/from16 v4, p0

    .line 17
    .line 18
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    if-nez v5, :cond_2

    .line 23
    .line 24
    :cond_1
    move v15, v3

    .line 25
    goto/16 :goto_8

    .line 26
    .line 27
    :cond_2
    instance-of v6, v5, Landroid/view/ViewGroup;

    .line 28
    .line 29
    if-eqz v6, :cond_1

    .line 30
    .line 31
    invoke-virtual {v5}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    const/4 v7, 0x1

    .line 36
    if-nez v6, :cond_3

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    const/16 v8, 0x8

    .line 44
    .line 45
    if-ne v6, v8, :cond_4

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_4
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    const-string v8, "RecyclerView"

    .line 57
    .line 58
    invoke-static {v6, v8, v7}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    if-nez v8, :cond_5

    .line 63
    .line 64
    const-string v8, "ViewPager"

    .line 65
    .line 66
    invoke-static {v6, v8, v7}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    if-nez v8, :cond_5

    .line 71
    .line 72
    const-string v8, "NestedScroll"

    .line 73
    .line 74
    invoke-static {v6, v8, v7}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_6

    .line 79
    .line 80
    :cond_5
    move v15, v3

    .line 81
    move v3, v7

    .line 82
    goto/16 :goto_5

    .line 83
    .line 84
    :cond_6
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    invoke-static {v6, v8}, Lmj;->υ(II)I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    .line 101
    .line 102
    .line 103
    move-result v9

    .line 104
    invoke-static {v8, v9}, Lmj;->υ(II)I

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 109
    .line 110
    .line 111
    move-result v9

    .line 112
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    invoke-static {v9, v10}, Lmj;->υ(II)I

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 121
    .line 122
    .line 123
    move-result v10

    .line 124
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 125
    .line 126
    .line 127
    move-result v11

    .line 128
    invoke-static {v10, v11}, Lmj;->υ(II)I

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    if-lez v6, :cond_7

    .line 133
    .line 134
    if-lez v8, :cond_7

    .line 135
    .line 136
    if-lez v9, :cond_7

    .line 137
    .line 138
    if-gtz v10, :cond_8

    .line 139
    .line 140
    :cond_7
    :goto_1
    move v15, v3

    .line 141
    :goto_2
    move v3, v7

    .line 142
    goto/16 :goto_7

    .line 143
    .line 144
    :cond_8
    int-to-long v11, v6

    .line 145
    int-to-long v13, v8

    .line 146
    mul-long/2addr v11, v13

    .line 147
    int-to-long v13, v9

    .line 148
    move v15, v3

    .line 149
    int-to-long v2, v10

    .line 150
    mul-long/2addr v13, v2

    .line 151
    const-wide/16 v2, 0x0

    .line 152
    .line 153
    cmp-long v2, v13, v2

    .line 154
    .line 155
    if-gtz v2, :cond_9

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_9
    const/16 v2, 0x23

    .line 159
    .line 160
    int-to-long v2, v2

    .line 161
    mul-long/2addr v13, v2

    .line 162
    const/16 v2, 0x64

    .line 163
    .line 164
    move v3, v7

    .line 165
    move v10, v8

    .line 166
    int-to-long v7, v2

    .line 167
    div-long/2addr v13, v7

    .line 168
    cmp-long v7, v11, v13

    .line 169
    .line 170
    if-ltz v7, :cond_a

    .line 171
    .line 172
    move v7, v3

    .line 173
    goto :goto_3

    .line 174
    :cond_a
    const/4 v7, 0x0

    .line 175
    :goto_3
    mul-int/lit8 v9, v9, 0x55

    .line 176
    .line 177
    div-int/2addr v9, v2

    .line 178
    if-lt v6, v9, :cond_b

    .line 179
    .line 180
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 196
    .line 197
    const/16 v6, 0x60

    .line 198
    .line 199
    int-to-float v6, v6

    .line 200
    mul-float/2addr v2, v6

    .line 201
    const/high16 v6, 0x3f000000    # 0.5f

    .line 202
    .line 203
    add-float/2addr v2, v6

    .line 204
    float-to-int v2, v2

    .line 205
    if-lt v10, v2, :cond_b

    .line 206
    .line 207
    move v2, v3

    .line 208
    goto :goto_4

    .line 209
    :cond_b
    const/4 v2, 0x0

    .line 210
    :goto_4
    if-nez v7, :cond_c

    .line 211
    .line 212
    if-eqz v2, :cond_f

    .line 213
    .line 214
    :cond_c
    :goto_5
    const v2, 0x7e0d0b01

    .line 215
    .line 216
    .line 217
    invoke-virtual {v5, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    if-eqz v6, :cond_d

    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_d
    invoke-virtual {v5}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    if-nez v6, :cond_e

    .line 229
    .line 230
    sget-object v6, Lx;->χ:Lx;

    .line 231
    .line 232
    invoke-virtual {v5, v2, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    goto :goto_6

    .line 236
    :cond_e
    invoke-virtual {v5, v2, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    :goto_6
    move-object v2, v5

    .line 240
    check-cast v2, Landroid/view/ViewGroup;

    .line 241
    .line 242
    const/4 v6, 0x0

    .line 243
    invoke-virtual {v2, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v5}, Landroid/view/View;->invalidate()V

    .line 247
    .line 248
    .line 249
    :cond_f
    :goto_7
    check-cast v5, Landroid/view/ViewGroup;

    .line 250
    .line 251
    add-int/lit8 v2, v0, 0x1

    .line 252
    .line 253
    invoke-static {v5, v2}, Lmj;->ε(Landroid/view/ViewGroup;I)V

    .line 254
    .line 255
    .line 256
    :goto_8
    add-int/lit8 v3, v15, 0x1

    .line 257
    .line 258
    goto/16 :goto_0

    .line 259
    .line 260
    :cond_10
    :goto_9
    return-void
.end method

.method public static ζ(Landroid/content/Context;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    .line 3
    .line 4
    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 9
    .line 10
    invoke-static {p0, p1}, Lmj;->τ(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    .line 11
    .line 12
    .line 13
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    :try_start_1
    invoke-static {v3, v0, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 17
    .line 18
    .line 19
    :try_start_2
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_3

    .line 25
    :catchall_1
    move-exception p0

    .line 26
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 27
    :catchall_2
    move-exception p1

    .line 28
    :try_start_4
    invoke-static {v3, p0}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_0
    :goto_0
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    .line 33
    .line 34
    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 35
    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    iput-boolean v4, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 39
    .line 40
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 41
    .line 42
    iput-object v4, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 43
    .line 44
    iget v4, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 45
    .line 46
    iget v1, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 47
    .line 48
    if-lez v4, :cond_3

    .line 49
    .line 50
    if-lez v1, :cond_3

    .line 51
    .line 52
    if-lez p2, :cond_3

    .line 53
    .line 54
    if-gtz p3, :cond_1

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_1
    div-int/lit8 v4, v4, 0x2

    .line 58
    .line 59
    div-int/lit8 v1, v1, 0x2

    .line 60
    .line 61
    move v5, v2

    .line 62
    :goto_1
    div-int v6, v4, v5

    .line 63
    .line 64
    if-lt v6, p2, :cond_2

    .line 65
    .line 66
    div-int v6, v1, v5

    .line 67
    .line 68
    if-lt v6, p3, :cond_2

    .line 69
    .line 70
    mul-int/lit8 v5, v5, 0x2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    :cond_3
    :goto_2
    iput v2, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 78
    .line 79
    invoke-static {p0, p1}, Lmj;->τ(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    .line 80
    .line 81
    .line 82
    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 83
    if-eqz p0, :cond_4

    .line 84
    .line 85
    :try_start_5
    invoke-static {p0, v0, v3}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 86
    .line 87
    .line 88
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 89
    :try_start_6
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 90
    .line 91
    .line 92
    return-object p1

    .line 93
    :catchall_3
    move-exception p1

    .line 94
    :try_start_7
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 95
    :catchall_4
    move-exception p2

    .line 96
    :try_start_8
    invoke-static {p0, p1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 100
    :cond_4
    return-object v0

    .line 101
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    new-instance p1, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string p2, "decode bitmap failed: "

    .line 108
    .line 109
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-static {p0}, Lmj;->σ(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-object v0
.end method

.method public static η()V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lmj;->ζ:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    if-ne v1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v1, Lmj;->ζ:Landroid/content/SharedPreferences;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    sget-object v2, Lmj;->η:Lhj;

    .line 15
    .line 16
    invoke-interface {v1, v2}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    sget-object v1, Lmj;->η:Lhj;

    .line 20
    .line 21
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lmj;->ζ:Landroid/content/SharedPreferences;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    :catchall_0
    :goto_0
    return-void
.end method

.method public static θ(Landroid/view/View;)Landroid/view/ViewGroup;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-static {p0}, Lmj;->ο(Landroid/view/View;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    check-cast p0, Landroid/view/ViewGroup;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    if-eqz v0, :cond_4

    .line 18
    .line 19
    check-cast p0, Landroid/view/ViewGroup;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    :goto_0
    if-ge v1, v0, :cond_4

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-static {v2}, Lmj;->θ(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    return-object v2

    .line 42
    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_4
    :goto_2
    const/4 p0, 0x0

    .line 46
    return-object p0
.end method

.method public static ι(Ljava/lang/Object;)Landroid/view/ViewGroup;
    .locals 9

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto/16 :goto_2

    .line 4
    .line 5
    :cond_0
    sget-object v0, Lkj;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lkj;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-static {v0}, Lkj;->α(Ljava/lang/Class;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/lang/reflect/Field;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    move-object v1, v0

    .line 34
    check-cast v1, Landroid/view/View;

    .line 35
    .line 36
    invoke-static {v1}, Lmj;->ο(Landroid/view/View;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    check-cast v0, Landroid/view/ViewGroup;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    return-object v0

    .line 45
    :catchall_0
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :goto_0
    if-eqz v0, :cond_6

    .line 50
    .line 51
    const-class v1, Ljava/lang/Object;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_6

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    array-length v2, v1

    .line 67
    const/4 v3, 0x0

    .line 68
    move v4, v3

    .line 69
    :goto_1
    if-ge v4, v2, :cond_5

    .line 70
    .line 71
    aget-object v5, v1, v4

    .line 72
    .line 73
    const/4 v6, 0x1

    .line 74
    :try_start_1
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    const-string v8, "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620EDA9BFCFAA4095AC4A030EF56F70E6FEEB90FFE1280654D00E21B04C378E1FA69488"

    .line 86
    .line 87
    invoke-static {v8}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-nez v8, :cond_2

    .line 96
    .line 97
    const-string v8, ".CommentNestedLayout"

    .line 98
    .line 99
    invoke-static {v7, v8, v3}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-eqz v7, :cond_3

    .line 104
    .line 105
    :cond_2
    sget-object v7, Lkj;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 106
    .line 107
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 112
    .line 113
    .line 114
    sget-object v8, Lkj;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 115
    .line 116
    invoke-static {v7}, Lkj;->α(Ljava/lang/Class;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    invoke-virtual {v8, v7, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    instance-of v8, v7, Landroid/view/ViewGroup;

    .line 128
    .line 129
    if-eqz v8, :cond_3

    .line 130
    .line 131
    check-cast v7, Landroid/view/ViewGroup;

    .line 132
    .line 133
    return-object v7

    .line 134
    :cond_3
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    instance-of v8, v7, Landroid/view/ViewGroup;

    .line 139
    .line 140
    if-eqz v8, :cond_4

    .line 141
    .line 142
    move-object v8, v7

    .line 143
    check-cast v8, Landroid/view/View;

    .line 144
    .line 145
    invoke-static {v8}, Lmj;->ο(Landroid/view/View;)Z

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    if-eqz v8, :cond_4

    .line 150
    .line 151
    sget-object v8, Lkj;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 152
    .line 153
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 158
    .line 159
    .line 160
    sget-object v6, Lkj;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 161
    .line 162
    invoke-static {v8}, Lkj;->α(Ljava/lang/Class;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    invoke-virtual {v6, v8, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    check-cast v7, Landroid/view/ViewGroup;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 170
    .line 171
    return-object v7

    .line 172
    :catchall_1
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :cond_6
    :goto_2
    const/4 p0, 0x0

    .line 182
    return-object p0
.end method

.method public static κ(Ljava/lang/Object;)Landroid/view/ViewGroup;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    :try_start_0
    sget-object v1, Lkj;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "getView"

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    new-array v3, v3, [Ljava/lang/Class;

    .line 15
    .line 16
    invoke-static {v1, v2, v3}, Lkj;->γ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    invoke-virtual {v1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    instance-of v1, p0, Landroid/view/View;

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    check-cast p0, Landroid/view/View;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    move-object p0, v0

    .line 35
    :goto_0
    invoke-static {p0}, Lmj;->θ(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 36
    .line 37
    .line 38
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    return-object p0

    .line 40
    :catchall_0
    :goto_1
    return-object v0
.end method

.method public static λ(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    sget-object v2, Lkj;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, "getPlaceHolderView"

    .line 10
    .line 11
    new-array v4, v0, [Ljava/lang/Class;

    .line 12
    .line 13
    invoke-static {v2, v3, v4}, Lkj;->γ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    :catchall_0
    :cond_0
    move-object v2, v1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {v2, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    instance-of v3, v2, Landroid/view/View;

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    check-cast v2, Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    :goto_0
    if-eqz v2, :cond_2

    .line 32
    .line 33
    return-object v2

    .line 34
    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    :goto_1
    if-ge v0, v2, :cond_5

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    if-nez v3, :cond_3

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_3
    invoke-static {v0, v3, p0}, Lmj;->ρ(ILandroid/view/View;Landroid/view/ViewGroup;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_4

    .line 52
    .line 53
    return-object v3

    .line 54
    :cond_4
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_5
    return-object v1
.end method

.method public static μ(Ljava/lang/ClassLoader;)V
    .locals 7

    .line 1
    const-string v0, "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620EDA9BFCFAA4095AC480344D16569A5D8EA89DEED35064AD41A30935A1A880BAC8F88"

    .line 2
    .line 3
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "~789B0C8A27824271C64AC17B4A4EFA968DD58C04A0DDDC0007CDD8DCD02E7A0727E48DD1CCDC2C529195B1582DE4BA5395A48AA678AE38B45D36CFCF4F401CFDBF8AB2"

    .line 8
    .line 9
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {p0, v2}, Lkj;->β(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-static {v1}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    const-string p0, "comment fragment class not found"

    .line 67
    .line 68
    invoke-static {p0}, Lmj;->σ(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_2
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Ljava/lang/Class;

    .line 87
    .line 88
    const-class v1, Landroid/view/LayoutInflater;

    .line 89
    .line 90
    const-class v2, Landroid/view/ViewGroup;

    .line 91
    .line 92
    const-class v3, Landroid/os/Bundle;

    .line 93
    .line 94
    filled-new-array {v1, v2, v3}, [Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    new-instance v5, Lgh;

    .line 99
    .line 100
    const/16 v6, 0x11

    .line 101
    .line 102
    invoke-direct {v5, v6}, Lgh;-><init>(I)V

    .line 103
    .line 104
    .line 105
    const-string v6, "o40"

    .line 106
    .line 107
    invoke-static {v0, v6, v4, v5}, Lmj;->ξ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;La80;)V

    .line 108
    .line 109
    .line 110
    filled-new-array {v1, v2, v3}, [Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    new-instance v2, Lgh;

    .line 115
    .line 116
    const/16 v4, 0x12

    .line 117
    .line 118
    invoke-direct {v2, v4}, Lgh;-><init>(I)V

    .line 119
    .line 120
    .line 121
    const-string v4, "onCreateView"

    .line 122
    .line 123
    invoke-static {v0, v4, v1, v2}, Lmj;->ξ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;La80;)V

    .line 124
    .line 125
    .line 126
    const-class v1, Landroid/view/View;

    .line 127
    .line 128
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    new-instance v4, Lgh;

    .line 133
    .line 134
    const/16 v5, 0x13

    .line 135
    .line 136
    invoke-direct {v4, v5}, Lgh;-><init>(I)V

    .line 137
    .line 138
    .line 139
    const-string v5, "p40"

    .line 140
    .line 141
    invoke-static {v0, v5, v2, v4}, Lmj;->ξ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;La80;)V

    .line 142
    .line 143
    .line 144
    filled-new-array {v1, v3}, [Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    new-instance v2, Lgh;

    .line 149
    .line 150
    const/16 v3, 0x14

    .line 151
    .line 152
    invoke-direct {v2, v3}, Lgh;-><init>(I)V

    .line 153
    .line 154
    .line 155
    const-string v3, "onViewCreated"

    .line 156
    .line 157
    invoke-static {v0, v3, v1, v2}, Lmj;->ξ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;La80;)V

    .line 158
    .line 159
    .line 160
    const/4 v1, 0x0

    .line 161
    new-array v1, v1, [Ljava/lang/Class;

    .line 162
    .line 163
    new-instance v2, Lgh;

    .line 164
    .line 165
    const/16 v3, 0x15

    .line 166
    .line 167
    invoke-direct {v2, v3}, Lgh;-><init>(I)V

    .line 168
    .line 169
    .line 170
    const-string v3, "show"

    .line 171
    .line 172
    invoke-static {v0, v3, v1, v2}, Lmj;->ξ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;La80;)V

    .line 173
    .line 174
    .line 175
    const-class v1, Landroid/content/res/Configuration;

    .line 176
    .line 177
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    new-instance v2, Lgh;

    .line 182
    .line 183
    const/16 v3, 0x16

    .line 184
    .line 185
    invoke-direct {v2, v3}, Lgh;-><init>(I)V

    .line 186
    .line 187
    .line 188
    const-string v3, "onConfigurationChanged"

    .line 189
    .line 190
    invoke-static {v0, v3, v1, v2}, Lmj;->ξ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;La80;)V

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_3
    return-void
.end method

.method public static ν(Ljava/lang/ClassLoader;)V
    .locals 5

    .line 1
    sget-object v0, Lkj;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    const-string v0, "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620EDA9BFCFAA4095AC4A030EF56F70E6FEEB90FFE1280654D00E21B04C378E1FA69488"

    .line 4
    .line 5
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0, v0}, Lkj;->β(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const-string p0, "CommentNestedLayout class not found"

    .line 16
    .line 17
    invoke-static {p0}, Lmj;->σ(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance v0, Lgh;

    .line 22
    .line 23
    const/16 v1, 0xf

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lgh;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v1, 0x0

    .line 40
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v4, "ctor:"

    .line 47
    .line 48
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ":"

    .line 55
    .line 56
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    sget-object v2, Lmj;->γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 67
    .line 68
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    sget-object v1, Lxq0;->α:Lxq0;

    .line 76
    .line 77
    new-instance v2, Lnh;

    .line 78
    .line 79
    const/4 v3, 0x1

    .line 80
    invoke-direct {v2, v3, v0}, Lnh;-><init>(ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, p0, v2}, Lxq0;->β(Ljava/lang/Class;Lm01;)Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const-string v1, "hooked constructors "

    .line 91
    .line 92
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0}, Lmj;->σ(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :goto_1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    filled-new-array {v0, v0}, [Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    new-instance v1, Lgh;

    .line 109
    .line 110
    const/16 v2, 0x10

    .line 111
    .line 112
    invoke-direct {v1, v2}, Lgh;-><init>(I)V

    .line 113
    .line 114
    .line 115
    const-string v2, "onMeasure"

    .line 116
    .line 117
    invoke-static {p0, v2, v0, v1}, Lmj;->ξ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;La80;)V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public static ξ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;La80;)V
    .locals 5

    .line 1
    sget-object v0, Lkj;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    array-length v0, p2

    .line 4
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    check-cast p2, [Ljava/lang/Class;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v0, "D"

    .line 14
    .line 15
    invoke-static {v0, p0, p1, p2}, Lkj;->δ(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v1, Lkj;->β:Ljava/util/concurrent/ConcurrentHashMap;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const/4 v3, 0x0

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    instance-of p0, v2, Ljava/lang/reflect/Method;

    .line 29
    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    check-cast v2, Ljava/lang/reflect/Method;

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    move-object v2, v3

    .line 36
    goto :goto_2

    .line 37
    :cond_1
    :try_start_0
    array-length v2, p2

    .line 38
    invoke-static {p2, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    check-cast p2, [Ljava/lang/Class;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const/4 p2, 0x1

    .line 49
    invoke-virtual {p0, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    move-object v2, p0

    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-object v2, v3

    .line 55
    :goto_0
    if-nez v2, :cond_2

    .line 56
    .line 57
    sget-object p0, Lx;->ψ:Lx;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move-object p0, v2

    .line 61
    :goto_1
    invoke-virtual {v1, v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :goto_2
    if-nez v2, :cond_3

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    if-eqz p2, :cond_4

    .line 84
    .line 85
    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    goto :goto_3

    .line 90
    :cond_4
    const/4 p2, 0x0

    .line 91
    :goto_3
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const/16 p2, 0x3a

    .line 95
    .line 96
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const/16 p2, 0x23

    .line 111
    .line 112
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const/16 p2, 0x28

    .line 123
    .line 124
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    new-instance v0, Lgh;

    .line 135
    .line 136
    const/16 v1, 0xe

    .line 137
    .line 138
    invoke-direct {v0, v1}, Lgh;-><init>(I)V

    .line 139
    .line 140
    .line 141
    const/16 v1, 0x1e

    .line 142
    .line 143
    const-string v4, ","

    .line 144
    .line 145
    invoke-static {p2, v4, v3, v0, v1}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    const/16 v0, 0x29

    .line 150
    .line 151
    invoke-static {p0, p2, v0}, Lnx;->λ(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    sget-object p2, Lmj;->γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 156
    .line 157
    invoke-virtual {p2, p0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    if-nez p0, :cond_5

    .line 162
    .line 163
    :goto_4
    return-void

    .line 164
    :cond_5
    sget-object p0, Lxq0;->α:Lxq0;

    .line 165
    .line 166
    new-instance p2, Lqg;

    .line 167
    .line 168
    const/4 v0, 0x3

    .line 169
    invoke-direct {p2, p3, v0, p1}, Lqg;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, v2, p2}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    new-instance p2, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    const-string p3, "hooked "

    .line 186
    .line 187
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string p0, "#"

    .line 194
    .line 195
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-static {p0}, Lmj;->σ(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    return-void
.end method

.method public static ο(Landroid/view/View;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620EDA9BFCFAA4095AC4A030EF56F70E6FEEB90FFE1280654D00E21B04C378E1FA69488"

    .line 10
    .line 11
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x1

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string v0, "comment"

    .line 24
    .line 25
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const-string v0, "NestedLayout"

    .line 32
    .line 33
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    :goto_0
    return v1

    .line 40
    :cond_1
    const/4 p0, 0x0

    .line 41
    return p0
.end method

.method public static π(Landroid/graphics/Rect;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-gtz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static ρ(ILandroid/view/View;Landroid/view/ViewGroup;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    instance-of p0, p2, Landroid/widget/LinearLayout;

    .line 5
    .line 6
    if-nez p0, :cond_1

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    instance-of p1, p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 14
    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    check-cast p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    const/4 p0, 0x0

    .line 21
    :goto_0
    if-nez p0, :cond_3

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_3
    iget p1, p0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    cmpg-float p1, p1, v0

    .line 28
    .line 29
    if-gtz p1, :cond_4

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_4
    check-cast p2, Landroid/widget/LinearLayout;

    .line 33
    .line 34
    invoke-virtual {p2}, Landroid/widget/LinearLayout;->getOrientation()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_5

    .line 39
    .line 40
    iget p0, p0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 41
    .line 42
    if-nez p0, :cond_6

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_5
    iget p0, p0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 46
    .line 47
    if-nez p0, :cond_6

    .line 48
    .line 49
    :goto_1
    const/4 p0, 0x1

    .line 50
    return p0

    .line 51
    :cond_6
    :goto_2
    const/4 p0, 0x0

    .line 52
    return p0
.end method

.method public static σ(Ljava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x4

    .line 3
    const-string v2, "r31ea4ef8bcca40f9"

    .line 4
    .line 5
    invoke-static {v2, p0, v0, v1, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static τ(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 5

    .line 1
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    :cond_0
    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object v2, v1

    .line 31
    :goto_0
    if-eqz v2, :cond_9

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_6

    .line 38
    .line 39
    const v4, 0x2ff57c

    .line 40
    .line 41
    .line 42
    if-eq v3, v4, :cond_3

    .line 43
    .line 44
    const v4, 0x38b73479

    .line 45
    .line 46
    .line 47
    if-eq v3, v4, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    const-string v3, "content"

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_7

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :cond_3
    const-string v3, "file"

    .line 68
    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-nez v2, :cond_4

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-nez p0, :cond_5

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    new-instance p1, Ljava/io/FileInputStream;

    .line 84
    .line 85
    new-instance v0, Ljava/io/File;

    .line 86
    .line 87
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 91
    .line 92
    .line 93
    return-object p1

    .line 94
    :cond_6
    const-string v3, ""

    .line 95
    .line 96
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-nez v2, :cond_9

    .line 101
    .line 102
    :cond_7
    :goto_1
    const-string v2, "/"

    .line 103
    .line 104
    const/4 v3, 0x0

    .line 105
    invoke-static {p1, v2, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_8

    .line 110
    .line 111
    new-instance p0, Ljava/io/FileInputStream;

    .line 112
    .line 113
    new-instance v0, Ljava/io/File;

    .line 114
    .line 115
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-direct {p0, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 119
    .line 120
    .line 121
    return-object p0

    .line 122
    :cond_8
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-virtual {p0, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    return-object p0

    .line 131
    :cond_9
    new-instance p0, Ljava/io/FileInputStream;

    .line 132
    .line 133
    new-instance v0, Ljava/io/File;

    .line 134
    .line 135
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-direct {p0, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    .line 140
    .line 141
    return-object p0

    .line 142
    :catchall_0
    :goto_2
    return-object v1
.end method

.method public static υ(II)I
    .locals 0

    .line 1
    if-lez p0, :cond_0

    .line 2
    .line 3
    return p0

    .line 4
    :cond_0
    if-lez p1, :cond_1

    .line 5
    .line 6
    return p1

    .line 7
    :cond_1
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static φ()V
    .locals 4

    .line 1
    sget-object v0, Lmj;->ε:Ljava/util/Set;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    move-object v1, v0

    .line 5
    check-cast v1, Ljava/lang/Iterable;

    .line 6
    .line 7
    invoke-static {v1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    monitor-exit v0

    .line 12
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Landroid/view/ViewGroup;

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    :try_start_1
    invoke-static {v1, v2}, Lmj;->α(Landroid/view/ViewGroup;Z)V

    .line 30
    .line 31
    .line 32
    sget-object v1, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    new-instance v2, Leo1;

    .line 37
    .line 38
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    move-object v1, v2

    .line 42
    :goto_1
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    new-instance v2, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v3, "refresh layout failed: "

    .line 55
    .line 56
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {v1}, Lmj;->σ(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    return-void

    .line 71
    :catchall_1
    move-exception v1

    .line 72
    monitor-exit v0

    .line 73
    throw v1
.end method

.method public static χ(Landroid/view/View;)V
    .locals 4

    .line 1
    const v0, 0x7e0d0b01

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    sget-object v2, Lx;->χ:Lx;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    instance-of v2, v1, Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    :goto_0
    invoke-virtual {p0, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 37
    .line 38
    .line 39
    :goto_1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 40
    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    check-cast p0, Landroid/view/ViewGroup;

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v1, 0x0

    .line 50
    :goto_2
    if-ge v1, v0, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-nez v2, :cond_3

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_3
    invoke-static {v2}, Lmj;->χ(Landroid/view/View;)V

    .line 60
    .line 61
    .line 62
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    return-void
.end method

.method public static ψ(Landroid/view/ViewGroup;ZZ)V
    .locals 1

    .line 1
    sget-object v0, Lmj;->ε:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    new-instance v0, Laf0;

    .line 7
    .line 8
    invoke-direct {v0, p0, p2, p1}, Laf0;-><init>(Landroid/view/ViewGroup;ZZ)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Laf0;->invoke()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    sget-object p0, Lmj;->α:Lh22;

    .line 30
    .line 31
    invoke-virtual {p0}, Lh22;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Landroid/os/Handler;

    .line 36
    .line 37
    new-instance p1, Lν;

    .line 38
    .line 39
    const/4 p2, 0x7

    .line 40
    invoke-direct {p1, p2, v0}, Lν;-><init>(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static ω(Landroid/view/View;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-static {p0}, Lmj;->θ(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lmj;->ι(Ljava/lang/Object;)Landroid/view/ViewGroup;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lmj;->κ(Ljava/lang/Object;)Landroid/view/ViewGroup;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    invoke-static {v0, p0, p0}, Lmj;->ψ(Landroid/view/ViewGroup;ZZ)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    if-eqz p0, :cond_2

    .line 25
    .line 26
    new-instance v0, Lw1;

    .line 27
    .line 28
    const/4 v1, 0x7

    .line 29
    invoke-direct {v0, p0, v1, p1}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const-wide/16 v1, 0x78

    .line 33
    .line 34
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 35
    .line 36
    .line 37
    :cond_2
    return-void
.end method
