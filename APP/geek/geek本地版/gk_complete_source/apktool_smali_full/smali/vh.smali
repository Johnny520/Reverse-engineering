.class public Lvh;
.super Ljava/lang/Object;

# interfaces
.implements Lfe;
.implements Lcv;


# static fields
.field public static final synthetic b:Lvh;

.field public static final synthetic c:Lvh;

.field public static d:F = -1.0f

.field public static e:F

.field public static f:F

.field public static g:F

.field public static final synthetic h:Lvh;

.field public static final i:Lvh;

.field public static final j:Lvh;

.field public static k:Landroid/hardware/SensorManager;

.field public static final l:Lm80;

.field public static final m:Lvh;

.field public static final n:Lvh;

.field public static final o:Lvh;

.field public static final p:Lvh;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lvh;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lvh;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lvh;->b:Lvh;

    .line 8
    .line 9
    new-instance v0, Lvh;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {v0, v1}, Lvh;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lvh;->c:Lvh;

    .line 16
    .line 17
    new-instance v0, Lvh;

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    invoke-direct {v0, v1}, Lvh;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lvh;->h:Lvh;

    .line 24
    .line 25
    new-instance v0, Lvh;

    .line 26
    .line 27
    const/4 v1, 0x5

    .line 28
    invoke-direct {v0, v1}, Lvh;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lvh;->i:Lvh;

    .line 32
    .line 33
    new-instance v0, Lvh;

    .line 34
    .line 35
    const/4 v1, 0x7

    .line 36
    invoke-direct {v0, v1}, Lvh;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lvh;->j:Lvh;

    .line 40
    .line 41
    new-instance v0, Lm80;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lvh;->l:Lm80;

    .line 47
    .line 48
    new-instance v0, Lvh;

    .line 49
    .line 50
    const/16 v1, 0x9

    .line 51
    .line 52
    invoke-direct {v0, v1}, Lvh;-><init>(I)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lvh;->m:Lvh;

    .line 56
    .line 57
    new-instance v0, Lvh;

    .line 58
    .line 59
    const/16 v1, 0xa

    .line 60
    .line 61
    invoke-direct {v0, v1}, Lvh;-><init>(I)V

    .line 62
    .line 63
    .line 64
    sput-object v0, Lvh;->n:Lvh;

    .line 65
    .line 66
    new-instance v0, Lvh;

    .line 67
    .line 68
    const/16 v1, 0xb

    .line 69
    .line 70
    invoke-direct {v0, v1}, Lvh;-><init>(I)V

    .line 71
    .line 72
    .line 73
    sput-object v0, Lvh;->o:Lvh;

    .line 74
    .line 75
    new-instance v0, Lvh;

    .line 76
    .line 77
    const/16 v1, 0xc

    .line 78
    .line 79
    invoke-direct {v0, v1}, Lvh;-><init>(I)V

    .line 80
    .line 81
    .line 82
    sput-object v0, Lvh;->p:Lvh;

    .line 83
    .line 84
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lvh;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lyl;)V
    .locals 0

    const/16 p1, 0x17

    iput p1, p0, Lvh;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final b(Landroid/view/ViewGroup;Le9;Lg9;Landroid/view/MotionEvent;Lf9;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Z)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v0, p4

    .line 1
    iget-object v3, v0, Lf9;->a:Ljava/lang/Object;

    const v4, 0x7e040005

    .line 2
    invoke-virtual {v1, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Landroid/view/VelocityTracker;

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    check-cast v5, Landroid/view/VelocityTracker;

    goto :goto_0

    :cond_0
    move-object v5, v7

    :goto_0
    move-object/from16 v6, p3

    if-eqz v5, :cond_1

    .line 3
    invoke-virtual {v5, v6}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    :cond_1
    if-eqz v5, :cond_2

    const/16 v8, 0x3e8

    invoke-virtual {v5, v8}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    :cond_2
    if-eqz v5, :cond_3

    .line 4
    invoke-virtual {v5}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v9

    goto :goto_1

    :cond_3
    const/4 v9, 0x0

    :goto_1
    const v10, 0x451c4000    # 2500.0f

    invoke-static {v10, v9}, Ljava/lang/Math;->min(FF)F

    move-result v9

    const v10, -0x3ae3c000    # -2500.0f

    invoke-static {v10, v9}, Ljava/lang/Math;->max(FF)F

    move-result v9

    if-eqz v5, :cond_4

    .line 5
    invoke-virtual {v5}, Landroid/view/VelocityTracker;->recycle()V

    :cond_4
    invoke-virtual {v1, v4, v7}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 6
    iget-boolean v4, v2, Lg9;->c:Z

    if-eqz v4, :cond_35

    .line 7
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getRawX()F

    move-result v4

    .line 8
    iget v6, v2, Lg9;->a:F

    sub-float/2addr v4, v6

    .line 9
    iget-boolean v6, v2, Lg9;->d:Z

    const/4 v13, 0x1

    if-nez v6, :cond_25

    if-nez p6, :cond_25

    .line 10
    sget v6, Lvh;->f:F

    neg-float v14, v6

    cmpg-float v14, v4, v14

    const-string v15, "Nwje\n"

    const-string v5, "Q2m5jaPP2Zc=\n"

    const-string v8, "Fg==\n"

    const/16 p3, 0x0

    const-string v12, "c8HJlSTQVfc=\n"

    if-gez v14, :cond_11

    .line 11
    iput-boolean v13, v2, Lg9;->d:Z

    .line 12
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v4

    .line 13
    const-string v6, "teC9MYNzUg==\n"

    const-string v14, "2JPaeO0VPTc=\n"

    invoke-static {v6, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    instance-of v6, v0, Landroid/app/Activity;

    if-eqz v6, :cond_5

    check-cast v0, Landroid/app/Activity;

    move-object v6, v0

    goto :goto_2

    :cond_5
    move-object v6, v7

    :goto_2
    if-nez v6, :cond_6

    goto/16 :goto_14

    :cond_6
    if-nez v4, :cond_7

    goto/16 :goto_14

    .line 15
    :cond_7
    sget-object v14, Lpb0;->j0:Ljava/lang/String;

    .line 16
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_14

    .line 17
    :cond_8
    :try_start_0
    new-instance v0, Li00;

    .line 18
    invoke-direct {v0}, Li00;-><init>()V

    .line 19
    invoke-static {v0, v4}, Lgt;->G(Li00;Landroid/view/View;)V

    .line 20
    iget-object v4, v0, Li00;->b:Ljava/lang/Object;

    if-nez v4, :cond_9

    sget-object v0, Lgn;->a:Lgn;

    const-string v3, "9MViuAr3BC2ipGLPV/9EQ7PK\n"

    const-string v4, "EkzcXLJ64aU=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v3}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_14

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    .line 21
    :cond_9
    :try_start_1
    sget-object v4, Lpb0;->o:Ljava/lang/String;

    .line 22
    sget-object v10, Ld9;->a:Ljava/lang/ClassLoader;

    .line 23
    invoke-static {v4, v10}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v4

    if-eqz v4, :cond_25

    .line 24
    iget-object v10, v0, Li00;->b:Ljava/lang/Object;

    invoke-static {v10}, Lip;->l(Ljava/lang/Object;)V

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v10

    const-string v7, "0EI0LiMiE0zTVGhNaHhS\n"

    const-string v11, "tydAY0ZWeyM=\n"

    invoke-static {v7, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v10}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    array-length v7, v10

    move/from16 v11, p3

    :goto_3
    if-ge v11, v7, :cond_d

    aget-object v17, v10, v11

    .line 26
    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v14}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v13

    move/from16 p4, v7

    const-string v7, "zeRpcYpEACfP9XhTv08RL9mpMw/FHw==\n"

    move-object/from16 p6, v10

    const-string v10, "qoEdIes2YUo=\n"

    invoke-static {v7, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v13}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v7, v13

    if-nez v7, :cond_a

    goto :goto_4

    :cond_a
    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    aget-object v7, v7, p3

    invoke-static {v7, v4}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    move-object/from16 v4, v17

    goto :goto_5

    :catchall_1
    move-exception v0

    goto/16 :goto_6

    :cond_b
    move/from16 p4, v7

    move-object/from16 p6, v10

    :cond_c
    :goto_4
    add-int/lit8 v11, v11, 0x1

    move/from16 v7, p4

    move-object/from16 v10, p6

    const/4 v13, 0x1

    goto :goto_3

    :cond_d
    const/4 v4, 0x0

    :goto_5
    if-eqz v4, :cond_10

    const/4 v7, 0x1

    .line 27
    invoke-virtual {v4, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 28
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v10

    array-length v10, v10

    if-ne v10, v7, :cond_e

    .line 29
    iget-object v0, v0, Li00;->b:Ljava/lang/Object;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v4, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_14

    .line 30
    :cond_e
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    array-length v7, v7

    const/4 v10, 0x2

    if-ne v7, v10, :cond_f

    .line 31
    iget-object v0, v0, Li00;->b:Ljava/lang/Object;

    const/4 v7, 0x0

    filled-new-array {v3, v7}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v4, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_14

    .line 32
    :cond_f
    sget-object v0, Lgn;->a:Lgn;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u5f15\u7528\u5f02\u5e38: \u65b9\u6cd5 ["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "] \u53c2\u6570\u6570\u91cf\u5f02\u5e38"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v3}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_14

    .line 33
    :cond_10
    sget-object v0, Lgn;->a:Lgn;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u5f15\u7528\u6267\u884c\u5931\u8d25: \u627e\u4e0d\u5230\u540d\u4e3a ["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "] \u4e14\u63a5\u6536\u6d88\u606f\u4f53\u7684\u65b9\u6cd5"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v3}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_14

    .line 34
    :goto_6
    :try_start_2
    sget-object v3, Lgn;->a:Lgn;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u5f15\u7528\u6267\u884c\u5d29\u6e83: "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v0}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "QuoteAction_Exec_Failed targetMethod: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 36
    invoke-static {v15, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v8, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_14

    .line 37
    :goto_7
    sget-object v3, Lgn;->a:Lgn;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "\u5bfb\u627e\u8f93\u5165\u6846\u5f02\u5e38: "

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v0}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V

    .line 38
    const-string v0, "ayoZI+6neLRTMBgIzY91pGUZFz7ng38=\n"

    const-string v3, "Ol92V4vmG8A=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 39
    :goto_8
    invoke-static {v15, v5, v0, v8, v12}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_14

    :cond_11
    cmpl-float v4, v4, v6

    if-lez v4, :cond_25

    const/4 v7, 0x1

    .line 40
    iput-boolean v7, v2, Lg9;->d:Z

    .line 41
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 42
    iget v6, v0, Lf9;->b:I

    .line 43
    iget-object v7, v0, Lf9;->c:Ljava/lang/String;

    .line 44
    const-string v0, "\u6587\u672c\u590d\u8bfb\u4e2d\u65ad: "

    const-string v10, "\u8bed\u97f3\u590d\u8bfb\u4e2d\u65ad: "

    const-string v11, "\u5361\u7247\u590d\u8bfb\u4e2d\u65ad: "

    const-string v13, "0MssZ47jRA==\n"

    const-string v14, "vbhLLuCFKyc=\n"

    invoke-static {v13, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v3}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v13, "y5AfGhZ6\n"

    const-string v14, "v/FzcXMI+WM=\n"

    invoke-static {v13, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v7}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    instance-of v13, v4, Landroid/app/Activity;

    if-eqz v13, :cond_12

    check-cast v4, Landroid/app/Activity;

    goto :goto_9

    :cond_12
    const/4 v4, 0x0

    :goto_9
    if-nez v4, :cond_13

    goto/16 :goto_14

    .line 46
    :cond_13
    const-string v13, ""

    const/4 v14, 0x1

    if-eq v6, v14, :cond_20

    const/4 v14, 0x3

    if-eq v6, v14, :cond_1f

    const/16 v0, 0x22

    if-eq v6, v0, :cond_1a

    const/16 v0, 0x2b

    if-eq v6, v0, :cond_1f

    const/16 v0, 0x2f

    if-eq v6, v0, :cond_19

    const/16 v0, 0x31

    if-eq v6, v0, :cond_14

    const v0, 0x31000031

    if-eq v6, v0, :cond_14

    .line 47
    :try_start_3
    sget-object v0, Lgn;->a:Lgn;

    const-string v3, "3Z5ZYKf6fAqU4lcF+tMXdpS/PSm7kCsl3ppQYqn/fB+U\n"

    const-string v10, "OwTbhB93mp4=\n"

    invoke-static {v3, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v3}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_14

    :catchall_2
    move-exception v0

    goto/16 :goto_13

    .line 48
    :cond_14
    sget-object v0, Lin;->h:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_15

    .line 49
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_a

    :cond_15
    const/4 v0, 0x0

    :goto_a
    instance-of v3, v0, Ljava/lang/String;

    if-eqz v3, :cond_16

    check-cast v0, Ljava/lang/String;

    goto :goto_b

    :cond_16
    const/4 v0, 0x0

    :goto_b
    if-nez v0, :cond_17

    goto :goto_c

    :cond_17
    move-object v13, v0

    .line 50
    :goto_c
    const-string v0, "sC73P+uCQmyd\n"

    const-string v3, "8E2fXp/wLQM=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lb50;->C(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_18

    const-string v0, "wIMvzPiA8A==\n"

    const-string v3, "+okToYvnzsA=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move/from16 v3, p3

    .line 51
    invoke-static {v13, v0, v3}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 52
    const-string v0, "Dck=\n"

    const-string v3, "N8Ngx0zRR6k=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v13, v0}, Lb50;->O(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lb50;->T(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    .line 53
    :cond_18
    sget-object v0, Luv;->a:Landroid/os/Handler;

    .line 54
    sget-object v0, Ld9;->a:Ljava/lang/ClassLoader;

    .line 55
    invoke-static {v0, v7, v13}, Luv;->c(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 56
    const-string v3, "t0cT4v8WqQ==\n"

    const-string v10, "5BJQobpF+uk=\n"

    invoke-static {v3, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_25

    sget-object v3, Lgn;->a:Lgn;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v0}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_14

    .line 57
    :cond_19
    invoke-static {v4, v3, v7}, Lgt;->w(Landroid/app/Activity;Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_14

    .line 58
    :cond_1a
    sget-object v0, Lin;->g:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_1b

    .line 59
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_d

    :cond_1b
    const/4 v0, 0x0

    :goto_d
    instance-of v3, v0, Ljava/lang/String;

    if-eqz v3, :cond_1c

    check-cast v0, Ljava/lang/String;

    goto :goto_e

    :cond_1c
    const/4 v0, 0x0

    :goto_e
    if-nez v0, :cond_1d

    goto :goto_f

    :cond_1d
    move-object v13, v0

    .line 60
    :goto_f
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1e

    .line 61
    sget-object v0, Luv;->a:Landroid/os/Handler;

    .line 62
    sget-object v0, Ld9;->a:Ljava/lang/ClassLoader;

    .line 63
    invoke-static {v0, v7, v13, v4}, Luv;->e(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 64
    const-string v3, "T14cfq7xrQ==\n"

    const-string v11, "HAtfPeui/m0=\n"

    invoke-static {v3, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_25

    sget-object v3, Lgn;->a:Lgn;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v0}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_14

    .line 65
    :cond_1e
    sget-object v0, Lgn;->a:Lgn;

    const-string v3, "ryjUChkzwZD7ZO1HjKjCo+pq6ndeBpPRxRqxTRthu4eiO/YHCAw=\n"

    const-string v10, "SoxZ4raIJDQ=\n"

    invoke-static {v3, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v3}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_14

    .line 66
    :cond_1f
    sget-object v0, Lgn;->a:Lgn;

    const-string v3, "KKTcJ4jj+e1quYtikIFyiCWQ2SW78TO0T9jTe+f+VONRlYRPkYFZkw==\n"

    const-string v10, "zT9iwAFk1gU=\n"

    invoke-static {v3, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v3}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_14

    .line 67
    :cond_20
    sget-object v10, Lin;->h:Ljava/lang/reflect/Field;

    if-eqz v10, :cond_21

    .line 68
    invoke-virtual {v10, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_10

    :cond_21
    const/4 v3, 0x0

    :goto_10
    instance-of v10, v3, Ljava/lang/String;

    if-eqz v10, :cond_22

    check-cast v3, Ljava/lang/String;

    goto :goto_11

    :cond_22
    const/4 v3, 0x0

    :goto_11
    if-nez v3, :cond_23

    goto :goto_12

    :cond_23
    move-object v13, v3

    .line 69
    :goto_12
    const-string v3, "n5826w2a2sSy\n"

    const-string v10, "3/xeinnotas=\n"

    invoke-static {v3, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v7, v3}, Lb50;->C(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_24

    const-string v3, "ERA=\n"

    const-string v10, "Kxq7Ss0V0Xw=\n"

    invoke-static {v3, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v10, 0x0

    .line 70
    invoke-static {v13, v3, v10}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_24

    .line 71
    const-string v3, "AOw=\n"

    const-string v10, "Oubo4euCjgA=\n"

    invoke-static {v3, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v13, v3}, Lb50;->O(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lb50;->T(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    .line 72
    :cond_24
    sget-object v3, Luv;->a:Landroid/os/Handler;

    .line 73
    sget-object v3, Ld9;->a:Ljava/lang/ClassLoader;

    .line 74
    invoke-static {v3, v7, v13}, Luv;->f(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 75
    const-string v10, "MUIip2JuaA==\n"

    const-string v11, "Yhdh5Cc9O/E=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v3, v10}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_25

    sget-object v10, Lgn;->a:Lgn;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v0}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_14

    .line 76
    :goto_13
    sget-object v3, Lgn;->a:Lgn;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "\u590d\u8bfb\u903b\u8f91\u5f02\u5e38: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v0}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "RepeatAction_Failed for type: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", talker: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_8

    .line 78
    :cond_25
    :goto_14
    sget v0, Lac;->m:I

    .line 79
    const-string v3, "d2ujObtTQWhqdqwosA==\n"

    const-string v4, "Iznid+gfADw=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const v3, 0x7e040001

    sget-object v4, Lh40;->l:Lqh;

    invoke-static {v1, v4, v3}, Lvh;->h(Landroid/view/ViewGroup;Lip;I)Lh40;

    move-result-object v3

    .line 80
    const-string v4, "Ao+wpnd0f6s=\n"

    const-string v5, "UMDk5yM9MOU=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const v4, 0x7e040002

    sget-object v5, Lh40;->p:Lqh;

    invoke-static {v1, v5, v4}, Lvh;->h(Landroid/view/ViewGroup;Lip;I)Lh40;

    move-result-object v4

    .line 81
    const-string v5, "5mn7OBhikQ==\n"

    const-string v6, "tSq6dF09yZs=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const v5, 0x7e040003

    sget-object v6, Lh40;->n:Lqh;

    invoke-static {v1, v6, v5}, Lvh;->h(Landroid/view/ViewGroup;Lip;I)Lh40;

    move-result-object v5

    .line 82
    const-string v6, "w2YvMncszQ==\n"

    const-string v7, "kCVufjJzlJA=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const v6, 0x7e040004

    sget-object v7, Lh40;->o:Lqh;

    invoke-static {v1, v7, v6}, Lvh;->h(Landroid/view/ViewGroup;Lip;I)Lh40;

    move-result-object v6

    .line 83
    const-string v7, "kCAq+l2PAs6NPSXrVw==\n"

    const-string v8, "xHJrtA7DQ5o=\n"

    invoke-static {v7, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const v7, 0x7e040006

    sget-object v8, Lh40;->m:Lqh;

    invoke-static {v1, v8, v7}, Lvh;->h(Landroid/view/ViewGroup;Lip;I)Lh40;

    move-result-object v7

    const/4 v8, 0x4

    if-ne v0, v8, :cond_26

    .line 84
    iget-boolean v10, v2, Lg9;->d:Z

    if-eqz v10, :cond_26

    .line 85
    invoke-virtual {v3}, Lh40;->c()V

    invoke-virtual {v4}, Lh40;->c()V

    invoke-virtual {v5}, Lh40;->c()V

    invoke-virtual {v6}, Lh40;->c()V

    invoke-virtual {v7}, Lh40;->c()V

    .line 86
    new-instance v0, Lzn;

    const/4 v10, 0x0

    invoke-direct {v0, v1, v5, v6, v10}, Lzn;-><init>(Landroid/view/ViewGroup;Lh40;Lh40;I)V

    .line 87
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    const/4 v7, 0x0

    invoke-virtual {v3, v7}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/view/ViewPropertyAnimator;->withStartAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 88
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/high16 v3, 0x3fc00000    # 1.5f

    invoke-virtual {v1, v3}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-wide/16 v3, 0x5a

    invoke-virtual {v1, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    new-instance v3, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v4, 0x40000000    # 2.0f

    invoke-direct {v3, v4}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    invoke-virtual {v1, v3}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    :goto_15
    const/4 v10, 0x0

    goto/16 :goto_18

    :cond_26
    if-eqz v0, :cond_29

    const/4 v10, 0x2

    if-eq v0, v10, :cond_28

    if-eq v0, v8, :cond_27

    const v10, 0x44bb8000    # 1500.0f

    goto :goto_16

    :cond_27
    const/high16 v10, 0x42480000    # 50.0f

    goto :goto_16

    :cond_28
    const/high16 v10, 0x43480000    # 200.0f

    goto :goto_16

    :cond_29
    const v10, 0x461c4000    # 10000.0f

    :goto_16
    if-eqz v0, :cond_2d

    const/4 v14, 0x1

    if-eq v0, v14, :cond_2c

    const/4 v11, 0x2

    if-eq v0, v11, :cond_2b

    const v11, 0x3f19999a    # 0.6f

    const/4 v14, 0x3

    if-eq v0, v14, :cond_2e

    if-eq v0, v8, :cond_2a

    goto :goto_17

    :cond_2a
    const/high16 v11, 0x3f000000    # 0.5f

    goto :goto_17

    :cond_2b
    const v11, 0x3ee66666    # 0.45f

    goto :goto_17

    :cond_2c
    const v11, 0x3eb33333    # 0.35f

    goto :goto_17

    :cond_2d
    const v11, 0x3f4ccccd    # 0.8f

    .line 89
    :cond_2e
    :goto_17
    iput v9, v3, Lh40;->a:F

    const/high16 v0, 0x42340000    # 45.0f

    div-float/2addr v9, v0

    iput v9, v4, Lh40;->a:F

    .line 90
    iget-object v0, v3, Lh40;->j:Li40;

    const/4 v8, 0x0

    if-eqz v0, :cond_2f

    float-to-double v12, v8

    .line 91
    iput-wide v12, v0, Li40;->i:D

    .line 92
    invoke-virtual {v0, v10}, Li40;->b(F)V

    invoke-virtual {v0, v11}, Li40;->a(F)V

    .line 93
    :cond_2f
    iget-object v0, v4, Lh40;->j:Li40;

    if-eqz v0, :cond_30

    float-to-double v12, v8

    .line 94
    iput-wide v12, v0, Li40;->i:D

    .line 95
    invoke-virtual {v0, v10}, Li40;->b(F)V

    invoke-virtual {v0, v11}, Li40;->a(F)V

    .line 96
    :cond_30
    iget-object v0, v5, Lh40;->j:Li40;

    const/high16 v8, 0x3f800000    # 1.0f

    if-eqz v0, :cond_31

    float-to-double v12, v8

    .line 97
    iput-wide v12, v0, Li40;->i:D

    .line 98
    invoke-virtual {v0, v10}, Li40;->b(F)V

    invoke-virtual {v0, v11}, Li40;->a(F)V

    .line 99
    :cond_31
    iget-object v0, v6, Lh40;->j:Li40;

    if-eqz v0, :cond_32

    float-to-double v12, v8

    .line 100
    iput-wide v12, v0, Li40;->i:D

    .line 101
    invoke-virtual {v0, v10}, Li40;->b(F)V

    invoke-virtual {v0, v11}, Li40;->a(F)V

    .line 102
    :cond_32
    iget-object v0, v7, Lh40;->j:Li40;

    if-eqz v0, :cond_33

    const/4 v8, 0x0

    float-to-double v12, v8

    .line 103
    iput-wide v12, v0, Li40;->i:D

    .line 104
    invoke-virtual {v0, v10}, Li40;->b(F)V

    invoke-virtual {v0, v11}, Li40;->a(F)V

    .line 105
    :cond_33
    new-instance v0, Lao;

    const/4 v10, 0x0

    invoke-direct {v0, v1, v3, v10}, Lao;-><init>(Ljava/lang/Object;Lh40;I)V

    invoke-virtual {v3, v0}, Lh40;->a(Lsh;)V

    .line 106
    invoke-virtual {v3}, Lh40;->h()V

    invoke-virtual {v4}, Lh40;->h()V

    invoke-virtual {v5}, Lh40;->h()V

    invoke-virtual {v6}, Lh40;->h()V

    invoke-virtual {v7}, Lh40;->h()V

    move-object/from16 v3, p1

    .line 107
    iget-object v0, v3, Le9;->e:Landroid/view/View;

    const-wide/16 v3, 0x12c

    if-eqz v0, :cond_34

    .line 108
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    if-eqz v0, :cond_34

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    if-eqz v0, :cond_34

    invoke-virtual {v0, v7}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    if-eqz v0, :cond_34

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-virtual {v0, v8}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    if-eqz v0, :cond_34

    invoke-virtual {v0, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    if-eqz v0, :cond_34

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 109
    :cond_34
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-virtual {v0, v8}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v8, 0x0

    invoke-virtual {v0, v8}, Landroid/view/ViewPropertyAnimator;->rotationX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/ViewPropertyAnimator;->rotationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-string v1, "yths/GxhTRrQ0naQNz0CRw==\n"

    const-string v3, "ub0YuBkTLG4=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    .line 110
    invoke-virtual {v0, v8}, Landroid/view/ViewPropertyAnimator;->translationZ(F)Landroid/view/ViewPropertyAnimator;

    .line 111
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    goto/16 :goto_15

    .line 112
    :goto_18
    iput-boolean v10, v2, Lg9;->c:Z

    .line 113
    iput-boolean v10, v2, Lg9;->e:Z

    .line 114
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v1, p5

    invoke-virtual {v1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    return-void

    :cond_35
    move-object/from16 v3, p1

    const/4 v8, 0x0

    .line 115
    invoke-virtual {v1}, Landroid/view/View;->getTranslationX()F

    move-result v0

    cmpg-float v0, v0, v8

    if-nez v0, :cond_36

    invoke-virtual {v1}, Landroid/view/View;->getScaleX()F

    move-result v0

    const/high16 v16, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v16

    if-nez v0, :cond_36

    invoke-virtual {v1}, Landroid/view/View;->getRotation()F

    move-result v0

    cmpg-float v0, v0, v8

    if-nez v0, :cond_36

    return-void

    :cond_36
    invoke-static/range {p0 .. p1}, Lvh;->j(Landroid/view/View;Le9;)V

    return-void
.end method

.method public static final c(Landroid/view/ViewGroup;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ILhm;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, Landroid/widget/TextView;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    const/high16 p1, 0x41c00000    # 24.0f

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 26
    .line 27
    .line 28
    const/16 p1, 0x11

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 31
    .line 32
    .line 33
    new-instance p1, Landroid/graphics/drawable/GradientDrawable;

    .line 34
    .line 35
    invoke-direct {p1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string p2, "3URGVaIG\n"

    .line 39
    .line 40
    const-string v1, "P97fuhqJSNY=\n"

    .line 41
    .line 42
    invoke-static {p2, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-static {p3, p2}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-eqz p2, :cond_1

    .line 51
    .line 52
    const-string p2, "PzbvSPR9x05a\n"

    .line 53
    .line 54
    const-string p3, "HHPZDrI7gQg=\n"

    .line 55
    .line 56
    :goto_0
    invoke-static {p2, p3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    const-string p2, "LA+jJvHIOZ0/\n"

    .line 66
    .line 67
    const-string p3, "DzaaFsH4Ca0=\n"

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :goto_1
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 71
    .line 72
    .line 73
    const/high16 p2, 0x42340000    # 45.0f

    .line 74
    .line 75
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 79
    .line 80
    .line 81
    const/16 p1, 0xf

    .line 82
    .line 83
    invoke-virtual {v0, p1, p1, p1, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 84
    .line 85
    .line 86
    const/high16 p1, 0x41200000    # 10.0f

    .line 87
    .line 88
    invoke-virtual {v0, p1}, Landroid/view/View;->setElevation(F)V

    .line 89
    .line 90
    .line 91
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 92
    .line 93
    const/16 p2, 0x78

    .line 94
    .line 95
    invoke-direct {p1, p2, p2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 96
    .line 97
    .line 98
    const p2, 0x800033

    .line 99
    .line 100
    .line 101
    iput p2, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 102
    .line 103
    const/16 p2, 0x32

    .line 104
    .line 105
    iput p2, p1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 106
    .line 107
    iput p4, p1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 108
    .line 109
    new-instance p2, Lf00;

    .line 110
    .line 111
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 112
    .line 113
    .line 114
    new-instance p3, Lf00;

    .line 115
    .line 116
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 117
    .line 118
    .line 119
    new-instance p4, Le00;

    .line 120
    .line 121
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 122
    .line 123
    .line 124
    new-instance v1, Lj80;

    .line 125
    .line 126
    invoke-direct {v1, p2, p3, p4, p5}, Lj80;-><init>(Lf00;Lf00;Le00;Lhm;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 130
    .line 131
    .line 132
    instance-of p2, p0, Landroid/widget/FrameLayout;

    .line 133
    .line 134
    if-eqz p2, :cond_2

    .line 135
    .line 136
    invoke-virtual {p0, v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 137
    .line 138
    .line 139
    :cond_2
    return-void
.end method

.method public static final d(Landroid/app/Activity;Landroid/view/ViewGroup;)V
    .locals 10

    .line 1
    new-instance v0, Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 28
    .line 29
    int-to-float p1, p1

    .line 30
    const v2, 0x3e19999a    # 0.15f

    .line 31
    .line 32
    .line 33
    mul-float/2addr p1, v2

    .line 34
    const/4 v2, 0x0

    .line 35
    move-object v3, v2

    .line 36
    :cond_0
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const/4 v5, 0x1

    .line 41
    if-nez v4, :cond_3

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Landroid/view/View;

    .line 48
    .line 49
    instance-of v6, v4, Landroid/widget/TextView;

    .line 50
    .line 51
    if-eqz v6, :cond_2

    .line 52
    .line 53
    move-object v6, v4

    .line 54
    check-cast v6, Landroid/widget/TextView;

    .line 55
    .line 56
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-nez v7, :cond_2

    .line 61
    .line 62
    invoke-virtual {v6}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    const-string v8, "uIdok0pzLo/xzDLu\n"

    .line 67
    .line 68
    const-string v9, "3+Icxy8LWqc=\n"

    .line 69
    .line 70
    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-static {v8, v7}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    if-lez v7, :cond_2

    .line 82
    .line 83
    const/4 v7, 0x2

    .line 84
    new-array v7, v7, [I

    .line 85
    .line 86
    invoke-virtual {v6, v7}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 87
    .line 88
    .line 89
    aget v5, v7, v5

    .line 90
    .line 91
    int-to-float v5, v5

    .line 92
    const/16 v7, 0xa

    .line 93
    .line 94
    int-to-float v7, v7

    .line 95
    mul-float/2addr v7, v1

    .line 96
    cmpl-float v7, v5, v7

    .line 97
    .line 98
    if-lez v7, :cond_2

    .line 99
    .line 100
    cmpg-float v5, v5, p1

    .line 101
    .line 102
    if-gez v5, :cond_2

    .line 103
    .line 104
    invoke-virtual {v6}, Landroid/widget/TextView;->getTextSize()F

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    const/high16 v7, 0x41600000    # 14.0f

    .line 109
    .line 110
    mul-float/2addr v7, v1

    .line 111
    cmpl-float v5, v5, v7

    .line 112
    .line 113
    if-lez v5, :cond_2

    .line 114
    .line 115
    if-eqz v3, :cond_1

    .line 116
    .line 117
    invoke-virtual {v6}, Landroid/widget/TextView;->getTextSize()F

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    invoke-virtual {v3}, Landroid/widget/TextView;->getTextSize()F

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    cmpl-float v5, v5, v7

    .line 126
    .line 127
    if-lez v5, :cond_2

    .line 128
    .line 129
    :cond_1
    move-object v3, v6

    .line 130
    :cond_2
    instance-of v5, v4, Landroid/view/ViewGroup;

    .line 131
    .line 132
    if-eqz v5, :cond_0

    .line 133
    .line 134
    check-cast v4, Landroid/view/ViewGroup;

    .line 135
    .line 136
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    const/4 v6, 0x0

    .line 141
    :goto_0
    if-ge v6, v5, :cond_0

    .line 142
    .line 143
    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    invoke-virtual {v0, v7}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    add-int/lit8 v6, v6, 0x1

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_3
    if-nez v3, :cond_4

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_4
    const p1, 0x7e120015

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 164
    .line 165
    invoke-static {v0, v1}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_5

    .line 170
    .line 171
    :goto_1
    return-void

    .line 172
    :cond_5
    invoke-virtual {v3, p1, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    const p1, 0x7e120007

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    instance-of v1, v0, Ljava/lang/Integer;

    .line 183
    .line 184
    if-eqz v1, :cond_6

    .line 185
    .line 186
    move-object v2, v0

    .line 187
    check-cast v2, Ljava/lang/Integer;

    .line 188
    .line 189
    :cond_6
    if-eqz v2, :cond_7

    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    goto :goto_2

    .line 196
    :cond_7
    invoke-virtual {v3}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-virtual {v3, p1, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    new-instance p1, Li00;

    .line 208
    .line 209
    invoke-direct {p1}, Li00;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    iput-object v1, p1, Li00;->b:Ljava/lang/Object;

    .line 221
    .line 222
    new-instance v1, Ll80;

    .line 223
    .line 224
    invoke-direct {v1, v3, p1, v0}, Ll80;-><init>(Landroid/widget/TextView;Li00;I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v3, v5}, Landroid/view/View;->setClickable(Z)V

    .line 231
    .line 232
    .line 233
    new-instance v0, Lv9;

    .line 234
    .line 235
    const/4 v1, 0x3

    .line 236
    invoke-direct {v0, p0, v3, p1, v1}, Lv9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    invoke-virtual {v3, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 247
    .line 248
    .line 249
    return-void
.end method

.method public static final e([BLjava/lang/ClassLoader;)[B
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    :try_start_0
    sget-object v0, Lpb0;->f1:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0, p1}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object v0, Lpb0;->h1:Ljava/lang/String;

    .line 16
    .line 17
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {p1, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    sget-object v0, Lpb0;->g1:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    instance-of v1, v0, Ljava/lang/String;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    move-object v1, v0

    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    sget-object v3, Lpb0;->e1:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v1, v3, v2}, Lb50;->N(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    sget-object v1, Lpb0;->g1:Ljava/lang/String;

    .line 47
    .line 48
    sget-object v3, Lpb0;->e1:Ljava/lang/String;

    .line 49
    .line 50
    new-instance v4, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {p1, v1, v0}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    sget-object v0, Lpb0;->i1:Ljava/lang/String;

    .line 69
    .line 70
    new-array v1, v2, [Ljava/lang/Object;

    .line 71
    .line 72
    invoke-static {p1, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const-string v0, "16WQemD+JwPXv4g2IvhmDtijiDY08mYD1r7ReDXxKk3NqYxzYPYpGdW5kjgC5DII+KKOdzk=\n"

    .line 77
    .line 78
    const-string v1, "udD8FkCdRm0=\n"

    .line 79
    .line 80
    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v0, p1}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    check-cast p1, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    return-object p1

    .line 90
    :catchall_0
    const-string p1, "YD7Lfxc0r9xdJOhOFy2t8Vw/0w==\n"

    .line 91
    .line 92
    const-string v0, "M1C4PHhZwrk=\n"

    .line 93
    .line 94
    invoke-static {p1, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    const-string v0, "Fg==\n"

    .line 99
    .line 100
    const-string v1, "c8HJlSTQVfc=\n"

    .line 101
    .line 102
    const-string v2, "Nwje\n"

    .line 103
    .line 104
    const-string v3, "Q2m5jaPP2Zc=\n"

    .line 105
    .line 106
    invoke-static {v2, v3, p1, v0, v1}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-object p0
.end method

.method public static f(Landroid/content/Context;I)Lvh;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move v2, v0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v2, v1

    .line 8
    :goto_0
    const-string v3, "Cannot create a CalendarItemStyle with a styleResId of 0"

    .line 9
    .line 10
    invoke-static {v3, v2}, Lzt;->d(Ljava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    sget-object v2, Lwy;->m:[I

    .line 14
    .line 15
    invoke-virtual {p0, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x2

    .line 24
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v4, 0x3

    .line 33
    invoke-virtual {p1, v4, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    new-instance v5, Landroid/graphics/Rect;

    .line 38
    .line 39
    invoke-direct {v5, v2, v3, v0, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x4

    .line 43
    invoke-static {p0, p1, v0}, Lct;->n(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 44
    .line 45
    .line 46
    const/16 v0, 0x9

    .line 47
    .line 48
    invoke-static {p0, p1, v0}, Lct;->n(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x7

    .line 52
    invoke-static {p0, p1, v0}, Lct;->n(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 53
    .line 54
    .line 55
    const/16 v0, 0x8

    .line 56
    .line 57
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x5

    .line 61
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/4 v2, 0x6

    .line 66
    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    new-instance v3, Le;

    .line 71
    .line 72
    int-to-float v1, v1

    .line 73
    invoke-direct {v3, v1}, Le;-><init>(F)V

    .line 74
    .line 75
    .line 76
    invoke-static {p0, v0, v2, v3}, Lf30;->a(Landroid/content/Context;IILe;)Le30;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Le30;->a()Lf30;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 84
    .line 85
    .line 86
    new-instance p0, Lvh;

    .line 87
    .line 88
    const/16 p1, 0xf

    .line 89
    .line 90
    invoke-direct {p0, p1}, Lvh;-><init>(I)V

    .line 91
    .line 92
    .line 93
    iget p1, v5, Landroid/graphics/Rect;->left:I

    .line 94
    .line 95
    invoke-static {p1}, Lzt;->e(I)V

    .line 96
    .line 97
    .line 98
    iget p1, v5, Landroid/graphics/Rect;->top:I

    .line 99
    .line 100
    invoke-static {p1}, Lzt;->e(I)V

    .line 101
    .line 102
    .line 103
    iget p1, v5, Landroid/graphics/Rect;->right:I

    .line 104
    .line 105
    invoke-static {p1}, Lzt;->e(I)V

    .line 106
    .line 107
    .line 108
    iget p1, v5, Landroid/graphics/Rect;->bottom:I

    .line 109
    .line 110
    invoke-static {p1}, Lzt;->e(I)V

    .line 111
    .line 112
    .line 113
    return-object p0
.end method

.method public static h(Landroid/view/ViewGroup;Lip;I)Lh40;
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lh40;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lh40;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_5

    .line 14
    .line 15
    new-instance v0, Lh40;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Li40;

    .line 21
    .line 22
    invoke-direct {v1}, Li40;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v1, v0, Lh40;->j:Li40;

    .line 26
    .line 27
    sget-object v1, Lh40;->n:Lqh;

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_4

    .line 34
    .line 35
    sget-object v1, Lh40;->o:Lqh;

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    sget-object v1, Lh40;->p:Lqh;

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_3

    .line 51
    .line 52
    sget-object v1, Lh40;->q:Lqh;

    .line 53
    .line 54
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_3

    .line 59
    .line 60
    sget-object v1, Lh40;->r:Lqh;

    .line 61
    .line 62
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 70
    .line 71
    invoke-virtual {v0, p1}, Lh40;->f(F)V

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_3
    :goto_1
    const p1, 0x3dcccccd    # 0.1f

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p1}, Lh40;->f(F)V

    .line 79
    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_4
    :goto_2
    const p1, 0x3b03126f    # 0.002f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p1}, Lh40;->f(F)V

    .line 86
    .line 87
    .line 88
    :goto_3
    invoke-virtual {p0, p2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_5
    return-object v0
.end method

.method public static i(Lji;Landroid/text/Editable;IIZ)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_19

    .line 3
    .line 4
    if-ltz p2, :cond_19

    .line 5
    .line 6
    if-gez p3, :cond_0

    .line 7
    .line 8
    goto/16 :goto_9

    .line 9
    .line 10
    :cond_0
    invoke-static {p1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {p1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, -0x1

    .line 19
    if-eq v1, v3, :cond_19

    .line 20
    .line 21
    if-eq v2, v3, :cond_19

    .line 22
    .line 23
    if-eq v1, v2, :cond_1

    .line 24
    .line 25
    goto/16 :goto_9

    .line 26
    .line 27
    :cond_1
    const/4 v4, 0x1

    .line 28
    if-eqz p4, :cond_16

    .line 29
    .line 30
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 35
    .line 36
    .line 37
    move-result p4

    .line 38
    if-ltz v1, :cond_3

    .line 39
    .line 40
    if-ge p4, v1, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    if-gez p2, :cond_4

    .line 44
    .line 45
    :cond_3
    :goto_0
    move v1, v3

    .line 46
    goto :goto_3

    .line 47
    :cond_4
    :goto_1
    move p4, v0

    .line 48
    :goto_2
    if-nez p2, :cond_5

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_5
    add-int/lit8 v1, v1, -0x1

    .line 52
    .line 53
    if-gez v1, :cond_7

    .line 54
    .line 55
    if-eqz p4, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    move v1, v0

    .line 59
    goto :goto_3

    .line 60
    :cond_7
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz p4, :cond_9

    .line 65
    .line 66
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 67
    .line 68
    .line 69
    move-result p4

    .line 70
    if-nez p4, :cond_8

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_8
    add-int/lit8 p2, p2, -0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_9
    invoke-static {v5}, Ljava/lang/Character;->isSurrogate(C)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-nez v6, :cond_a

    .line 81
    .line 82
    add-int/lit8 p2, p2, -0x1

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_a
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 86
    .line 87
    .line 88
    move-result p4

    .line 89
    if-eqz p4, :cond_b

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_b
    move p4, v4

    .line 93
    goto :goto_2

    .line 94
    :goto_3
    invoke-static {p3, v0}, Ljava/lang/Math;->max(II)I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 99
    .line 100
    .line 101
    move-result p3

    .line 102
    if-ltz v2, :cond_d

    .line 103
    .line 104
    if-ge p3, v2, :cond_c

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_c
    if-gez p2, :cond_e

    .line 108
    .line 109
    :cond_d
    :goto_4
    move p3, v3

    .line 110
    goto :goto_7

    .line 111
    :cond_e
    :goto_5
    move p4, v0

    .line 112
    :goto_6
    if-nez p2, :cond_f

    .line 113
    .line 114
    move p3, v2

    .line 115
    goto :goto_7

    .line 116
    :cond_f
    if-lt v2, p3, :cond_10

    .line 117
    .line 118
    if-eqz p4, :cond_15

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_10
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eqz p4, :cond_12

    .line 126
    .line 127
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 128
    .line 129
    .line 130
    move-result p4

    .line 131
    if-nez p4, :cond_11

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_11
    add-int/lit8 p2, p2, -0x1

    .line 135
    .line 136
    add-int/lit8 v2, v2, 0x1

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_12
    invoke-static {v5}, Ljava/lang/Character;->isSurrogate(C)Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-nez v6, :cond_13

    .line 144
    .line 145
    add-int/lit8 p2, p2, -0x1

    .line 146
    .line 147
    add-int/lit8 v2, v2, 0x1

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_13
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 151
    .line 152
    .line 153
    move-result p4

    .line 154
    if-eqz p4, :cond_14

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_14
    add-int/lit8 v2, v2, 0x1

    .line 158
    .line 159
    move p4, v4

    .line 160
    goto :goto_6

    .line 161
    :cond_15
    :goto_7
    if-eq v1, v3, :cond_19

    .line 162
    .line 163
    if-ne p3, v3, :cond_17

    .line 164
    .line 165
    goto :goto_9

    .line 166
    :cond_16
    sub-int/2addr v1, p2

    .line 167
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    add-int/2addr v2, p3

    .line 172
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    .line 177
    .line 178
    .line 179
    move-result p3

    .line 180
    :cond_17
    const-class p2, Lg80;

    .line 181
    .line 182
    invoke-interface {p1, v1, p3, p2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    check-cast p2, [Lg80;

    .line 187
    .line 188
    if-eqz p2, :cond_19

    .line 189
    .line 190
    array-length p4, p2

    .line 191
    if-lez p4, :cond_19

    .line 192
    .line 193
    array-length p4, p2

    .line 194
    move v2, v0

    .line 195
    :goto_8
    if-ge v2, p4, :cond_18

    .line 196
    .line 197
    aget-object v3, p2, v2

    .line 198
    .line 199
    invoke-interface {p1, v3}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    invoke-interface {p1, v3}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    invoke-static {v3, p3}, Ljava/lang/Math;->max(II)I

    .line 212
    .line 213
    .line 214
    move-result p3

    .line 215
    add-int/lit8 v2, v2, 0x1

    .line 216
    .line 217
    goto :goto_8

    .line 218
    :cond_18
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 219
    .line 220
    .line 221
    move-result p2

    .line 222
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 223
    .line 224
    .line 225
    move-result p4

    .line 226
    invoke-static {p3, p4}, Ljava/lang/Math;->min(II)I

    .line 227
    .line 228
    .line 229
    move-result p3

    .line 230
    invoke-virtual {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->beginBatchEdit()Z

    .line 231
    .line 232
    .line 233
    invoke-interface {p1, p2, p3}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->endBatchEdit()Z

    .line 237
    .line 238
    .line 239
    return v4

    .line 240
    :cond_19
    :goto_9
    return v0
.end method

.method public static j(Landroid/view/View;Le9;)V
    .locals 4

    .line 1
    const-string v0, "8Q==\n"

    .line 2
    .line 3
    const-string v1, "h/xAW8uC8O8=\n"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0, p0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withStartAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 30
    .line 31
    .line 32
    iget-object v0, p1, Le9;->e:Landroid/view/View;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withStartAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 61
    .line 62
    .line 63
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 68
    .line 69
    .line 70
    iget-object v0, p1, Le9;->e:Landroid/view/View;

    .line 71
    .line 72
    if-eqz v0, :cond_1

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-eqz v0, :cond_1

    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 81
    .line 82
    .line 83
    :cond_1
    const v0, 0x7e040007

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    instance-of v3, v2, Ljava/lang/Runnable;

    .line 91
    .line 92
    if-eqz v3, :cond_2

    .line 93
    .line 94
    check-cast v2, Ljava/lang/Runnable;

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    move-object v2, v1

    .line 98
    :goto_0
    if-eqz v2, :cond_3

    .line 99
    .line 100
    invoke-virtual {p0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_3
    const v0, 0x7e040001

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    instance-of v2, v0, Lh40;

    .line 114
    .line 115
    if-eqz v2, :cond_4

    .line 116
    .line 117
    check-cast v0, Lh40;

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    move-object v0, v1

    .line 121
    :goto_1
    if-eqz v0, :cond_5

    .line 122
    .line 123
    iget-boolean v2, v0, Lh40;->e:Z

    .line 124
    .line 125
    if-eqz v2, :cond_5

    .line 126
    .line 127
    invoke-virtual {v0}, Lh40;->c()V

    .line 128
    .line 129
    .line 130
    :cond_5
    const v0, 0x7e040002

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    instance-of v2, v0, Lh40;

    .line 138
    .line 139
    if-eqz v2, :cond_6

    .line 140
    .line 141
    check-cast v0, Lh40;

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_6
    move-object v0, v1

    .line 145
    :goto_2
    if-eqz v0, :cond_7

    .line 146
    .line 147
    iget-boolean v2, v0, Lh40;->e:Z

    .line 148
    .line 149
    if-eqz v2, :cond_7

    .line 150
    .line 151
    invoke-virtual {v0}, Lh40;->c()V

    .line 152
    .line 153
    .line 154
    :cond_7
    const v0, 0x7e040003

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    instance-of v2, v0, Lh40;

    .line 162
    .line 163
    if-eqz v2, :cond_8

    .line 164
    .line 165
    check-cast v0, Lh40;

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_8
    move-object v0, v1

    .line 169
    :goto_3
    if-eqz v0, :cond_9

    .line 170
    .line 171
    iget-boolean v2, v0, Lh40;->e:Z

    .line 172
    .line 173
    if-eqz v2, :cond_9

    .line 174
    .line 175
    invoke-virtual {v0}, Lh40;->c()V

    .line 176
    .line 177
    .line 178
    :cond_9
    const v0, 0x7e040004

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    instance-of v2, v0, Lh40;

    .line 186
    .line 187
    if-eqz v2, :cond_a

    .line 188
    .line 189
    check-cast v0, Lh40;

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_a
    move-object v0, v1

    .line 193
    :goto_4
    if-eqz v0, :cond_b

    .line 194
    .line 195
    iget-boolean v2, v0, Lh40;->e:Z

    .line 196
    .line 197
    if-eqz v2, :cond_b

    .line 198
    .line 199
    invoke-virtual {v0}, Lh40;->c()V

    .line 200
    .line 201
    .line 202
    :cond_b
    const v0, 0x7e040006

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    instance-of v2, v0, Lh40;

    .line 210
    .line 211
    if-eqz v2, :cond_c

    .line 212
    .line 213
    check-cast v0, Lh40;

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_c
    move-object v0, v1

    .line 217
    :goto_5
    if-eqz v0, :cond_d

    .line 218
    .line 219
    iget-boolean v2, v0, Lh40;->e:Z

    .line 220
    .line 221
    if-eqz v2, :cond_d

    .line 222
    .line 223
    invoke-virtual {v0}, Lh40;->c()V

    .line 224
    .line 225
    .line 226
    :cond_d
    const/4 v0, 0x0

    .line 227
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0, v0}, Landroid/view/View;->setRotation(F)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0, v0}, Landroid/view/View;->setRotationX(F)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p0, v0}, Landroid/view/View;->setRotationY(F)V

    .line 240
    .line 241
    .line 242
    const/high16 v2, 0x3f800000    # 1.0f

    .line 243
    .line 244
    invoke-virtual {p0, v2}, Landroid/view/View;->setScaleX(F)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0, v2}, Landroid/view/View;->setScaleY(F)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationZ(F)V

    .line 254
    .line 255
    .line 256
    iget-object v0, p1, Le9;->e:Landroid/view/View;

    .line 257
    .line 258
    if-eqz v0, :cond_e

    .line 259
    .line 260
    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 261
    .line 262
    .line 263
    :cond_e
    iget-object v0, p1, Le9;->e:Landroid/view/View;

    .line 264
    .line 265
    if-eqz v0, :cond_f

    .line 266
    .line 267
    invoke-virtual {v0, v2}, Landroid/view/View;->setScaleX(F)V

    .line 268
    .line 269
    .line 270
    :cond_f
    iget-object v0, p1, Le9;->e:Landroid/view/View;

    .line 271
    .line 272
    if-eqz v0, :cond_10

    .line 273
    .line 274
    invoke-virtual {v0, v2}, Landroid/view/View;->setScaleY(F)V

    .line 275
    .line 276
    .line 277
    :cond_10
    const/4 v0, 0x0

    .line 278
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 279
    .line 280
    .line 281
    iget-object p0, p1, Le9;->g:Lg9;

    .line 282
    .line 283
    if-eqz p0, :cond_11

    .line 284
    .line 285
    iput-boolean v0, p0, Lg9;->c:Z

    .line 286
    .line 287
    iput-boolean v0, p0, Lg9;->d:Z

    .line 288
    .line 289
    iput-boolean v0, p0, Lg9;->e:Z

    .line 290
    .line 291
    :cond_11
    return-void
.end method

.method public static k([BLjava/lang/ClassLoader;)[B
    .locals 5

    .line 1
    const-string v0, "8haBOE5T\n"

    .line 2
    .line 3
    const-string v1, "nnngXCshwt8=\n"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0

    .line 12
    :cond_0
    :try_start_0
    sget-object v0, Lpb0;->a1:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, p1}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object v0, Lpb0;->b1:Ljava/lang/String;

    .line 23
    .line 24
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {p1, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    sget-object v0, Lpb0;->d1:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    instance-of v1, v0, Ljava/lang/String;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    move-object v1, v0

    .line 43
    check-cast v1, Ljava/lang/String;

    .line 44
    .line 45
    sget-object v3, Lpb0;->e1:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v1, v3, v2}, Lb50;->N(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_1

    .line 52
    .line 53
    sget-object v1, Lpb0;->d1:Ljava/lang/String;

    .line 54
    .line 55
    sget-object v3, Lpb0;->e1:Ljava/lang/String;

    .line 56
    .line 57
    new-instance v4, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {p1, v1, v0}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    sget-object v0, Lpb0;->c1:Ljava/lang/String;

    .line 76
    .line 77
    new-array v1, v2, [Ljava/lang/Object;

    .line 78
    .line 79
    invoke-static {p1, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const-string v0, "JZdz+FwfjnUljWu0HhnPeCqRa7QIE891JIwy+gkQgzs/m2/xXBeAbyeLcbo+BZt+CpBt9QU=\n"

    .line 84
    .line 85
    const-string v1, "S+IflHx87xs=\n"

    .line 86
    .line 87
    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {v0, p1}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    check-cast p1, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    return-object p1

    .line 97
    :catchall_0
    const-string p1, "sHmS8O/L7fKreI7L\n"

    .line 98
    .line 99
    const-string v0, "4xfhoJ2kmZ0=\n"

    .line 100
    .line 101
    invoke-static {p1, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    const-string v0, "Fg==\n"

    .line 106
    .line 107
    const-string v1, "c8HJlSTQVfc=\n"

    .line 108
    .line 109
    const-string v2, "Nwje\n"

    .line 110
    .line 111
    const-string v3, "Q2m5jaPP2Zc=\n"

    .line 112
    .line 113
    invoke-static {v2, v3, p1, v0, v1}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-object p0
.end method

.method public static l(Landroid/app/Activity;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;
    .locals 8

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    const/high16 p3, 0x41700000    # 15.0f

    .line 10
    .line 11
    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 12
    .line 13
    .line 14
    const-string p3, "DH8GmhtHbw==\n"

    .line 15
    .line 16
    const-string v1, "L08x2SpxX98=\n"

    .line 17
    .line 18
    invoke-static {p3, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 27
    .line 28
    .line 29
    const/4 p3, 0x0

    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-virtual {v0, p3, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 32
    .line 33
    .line 34
    new-instance p3, Landroid/graphics/drawable/GradientDrawable;

    .line 35
    .line 36
    invoke-direct {p3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 37
    .line 38
    .line 39
    const/4 v1, -0x1

    .line 40
    invoke-virtual {p3, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 41
    .line 42
    .line 43
    const/high16 v1, 0x41c00000    # 24.0f

    .line 44
    .line 45
    invoke-virtual {p3, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 49
    .line 50
    .line 51
    const/4 p3, 0x0

    .line 52
    const/16 v1, 0x1e

    .line 53
    .line 54
    invoke-virtual {v0, p3, v1, p3, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 55
    .line 56
    .line 57
    const/16 v1, 0x11

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 60
    .line 61
    .line 62
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 63
    .line 64
    const/4 v2, -0x2

    .line 65
    const/high16 v3, 0x3f800000    # 1.0f

    .line 66
    .line 67
    invoke-direct {v1, p3, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 68
    .line 69
    .line 70
    const/16 p3, 0xa

    .line 71
    .line 72
    invoke-virtual {v1, p3, p3, p3, p3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 76
    .line 77
    .line 78
    new-instance v2, La6;

    .line 79
    .line 80
    move-object v3, p0

    .line 81
    move-object v6, p1

    .line 82
    move-object v7, p2

    .line 83
    move-object v4, p4

    .line 84
    move-object v5, p5

    .line 85
    invoke-direct/range {v2 .. v7}, La6;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 89
    .line 90
    .line 91
    return-object v0
.end method


# virtual methods
.method public a(Lku;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public g(Landroid/content/pm/PackageManager;Ljava/lang/String;)[Landroid/content/pm/Signature;
    .locals 1

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 8
    .line 9
    return-object p1
.end method

.method public q(Lku;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lvh;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    const-string v0, "kotlin.Unit"

    .line 12
    .line 13
    return-object v0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method
