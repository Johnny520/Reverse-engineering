.class public final Lda;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lda;->a:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    const/16 p1, 0x5a

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 13

    .line 1
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 2
    const-string v0, "eq_home_pull_guard"

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1f

    .line 3
    :cond_0
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    iget-object v1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    move v3, v2

    .line 4
    :goto_0
    array-length v4, v1

    if-ge v3, v4, :cond_3

    .line 5
    aget-object v4, v1, v3

    invoke-static {v4}, Lga;->q(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 6
    invoke-static {v0}, Lga;->y(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    if-eqz v1, :cond_7

    move v3, v2

    .line 7
    :goto_2
    array-length v4, v1

    if-ge v3, v4, :cond_7

    .line 8
    aget-object v4, v1, v3

    if-nez v4, :cond_4

    goto :goto_3

    .line 9
    :cond_4
    invoke-static {v4}, Lga;->q(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 10
    invoke-static {v0}, Lga;->y(Ljava/lang/Object;)V

    goto :goto_3

    .line 11
    :cond_5
    invoke-static {v4}, Lga;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 12
    invoke-static {v0}, Lga;->y(Ljava/lang/Object;)V

    :cond_6
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 13
    :cond_7
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    invoke-static {v0}, Lga;->n(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 14
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    if-eqz v0, :cond_b

    .line 15
    invoke-static {v0}, Lga;->w(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    .line 16
    :cond_8
    invoke-static {v0}, Lga;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 17
    invoke-static {v0}, Lga;->w(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    invoke-static {v0}, Lga;->t(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_4

    .line 18
    :cond_9
    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lga;->e(Ljava/lang/Object;ILjava/util/Set;)Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_4

    .line 19
    :cond_a
    invoke-static {v0}, Lga;->y(Ljava/lang/Object;)V

    .line 20
    :cond_b
    :goto_4
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    invoke-static {v0}, Lga;->n(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_1f

    .line 21
    :cond_c
    iget-object p0, p0, Lda;->a:Ljava/lang/reflect/Method;

    .line 22
    const-string v0, "eq_home_pull_guard"

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_1f

    :cond_d
    if-eqz p0, :cond_3b

    .line 23
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    invoke-static {v0}, Lga;->n(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_1f

    .line 24
    :cond_e
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 25
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_f

    const-string v1, ""

    goto :goto_5

    :cond_f
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 26
    :goto_5
    invoke-static {p0}, Lga;->p(Ljava/lang/reflect/Method;)Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_31

    invoke-static {p0}, Lga;->v(Ljava/lang/reflect/Method;)Z

    move-result v3

    if-eqz v3, :cond_10

    goto/16 :goto_19

    .line 27
    :cond_10
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    move v5, v2

    .line 28
    :goto_6
    array-length v6, v3

    const/4 v7, 0x3

    if-ge v5, v6, :cond_20

    .line 29
    const-class v6, Landroid/view/MotionEvent;

    aget-object v8, v3, v5

    invoke-virtual {v6, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_1f

    .line 30
    invoke-static {v0}, Lga;->m(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    invoke-static {v0}, Lga;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_20

    :cond_11
    iget-object v3, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 31
    instance-of v5, v0, Landroid/view/View;

    if-eqz v5, :cond_20

    if-nez v3, :cond_12

    goto/16 :goto_11

    :cond_12
    move v5, v2

    .line 32
    :goto_7
    array-length v6, v3

    if-ge v5, v6, :cond_14

    .line 33
    aget-object v6, v3, v5

    instance-of v8, v6, Landroid/view/MotionEvent;

    if-eqz v8, :cond_13

    .line 34
    check-cast v6, Landroid/view/MotionEvent;

    goto :goto_8

    :cond_13
    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    :cond_14
    const/4 v6, 0x0

    :goto_8
    if-nez v6, :cond_15

    goto/16 :goto_11

    .line 35
    :cond_15
    move-object v3, v0

    check-cast v3, Landroid/view/View;

    .line 36
    :try_start_0
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_9

    :catchall_0
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getAction()I

    move-result v5

    :goto_9
    if-nez v5, :cond_16

    .line 37
    sget-object v8, Lga;->g:Ljava/util/WeakHashMap;

    monitor-enter v8

    .line 38
    :try_start_1
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v8, v3, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 40
    sget-object v1, Lga;->h:Ljava/util/WeakHashMap;

    monitor-enter v1

    .line 41
    :try_start_2
    invoke-virtual {v1, v3}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    monitor-exit v1

    goto/16 :goto_11

    :catchall_1
    move-exception p0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p0

    :catchall_2
    move-exception p0

    .line 43
    :try_start_3
    monitor-exit v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p0

    .line 44
    :cond_16
    sget-object v8, Lga;->g:Ljava/util/WeakHashMap;

    monitor-enter v8

    .line 45
    :try_start_4
    invoke-virtual {v8, v3}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Float;

    if-eqz v9, :cond_17

    .line 46
    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    move-result v9

    goto :goto_a

    :catchall_3
    move-exception p0

    goto/16 :goto_10

    :cond_17
    const/high16 v9, 0x7fc00000    # Float.NaN

    .line 47
    :goto_a
    monitor-exit v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 48
    sget-object v10, Lga;->h:Ljava/util/WeakHashMap;

    monitor-enter v10

    .line 49
    :try_start_5
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v10, v3}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v11

    .line 50
    monitor-exit v10
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_8

    .line 51
    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    move-result v12

    if-eqz v12, :cond_18

    invoke-virtual {v6}, Landroid/view/MotionEvent;->getY()F

    move-result v9

    :cond_18
    if-eqz v1, :cond_1a

    .line 52
    const-string v12, "touch"

    .line 53
    invoke-virtual {v1, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_19

    const-string v12, "intercept"

    invoke-virtual {v1, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_19

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v1, v7, :cond_1a

    :cond_19
    move v1, v4

    goto :goto_b

    :cond_1a
    move v1, v2

    :goto_b
    if-eq v5, v4, :cond_1e

    if-ne v5, v7, :cond_1b

    goto :goto_e

    .line 54
    :cond_1b
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    sub-float/2addr v5, v9

    .line 55
    :try_start_6
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    if-nez v6, :cond_1c

    const/high16 v6, 0x3f800000    # 1.0f

    goto :goto_c

    .line 56
    :cond_1c
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    :goto_c
    const/high16 v8, 0x40000000    # 2.0f

    mul-float/2addr v8, v6

    const/high16 v6, 0x3f000000    # 0.5f

    add-float/2addr v8, v6

    float-to-int v6, v8

    .line 57
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    move-result v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_d

    :catchall_4
    const/4 v6, 0x2

    :goto_d
    int-to-float v6, v6

    cmpl-float v5, v5, v6

    if-lez v5, :cond_1d

    if-eqz v1, :cond_1d

    .line 58
    sget-object v5, Lga;->h:Ljava/util/WeakHashMap;

    monitor-enter v5

    .line 59
    :try_start_7
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v5, v3, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    monitor-exit v5

    goto :goto_f

    :catchall_5
    move-exception p0

    monitor-exit v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    throw p0

    :cond_1d
    if-eqz v11, :cond_20

    if-eqz v1, :cond_20

    goto :goto_f

    .line 61
    :cond_1e
    :goto_e
    monitor-enter v8

    .line 62
    :try_start_8
    invoke-virtual {v8, v3}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    monitor-exit v8
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 64
    monitor-enter v10

    .line 65
    :try_start_9
    invoke-virtual {v10, v3}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    monitor-exit v10
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    if-eqz v11, :cond_20

    if-eqz v1, :cond_20

    .line 67
    :goto_f
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p0

    invoke-static {v0, p0}, Lga;->f(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto/16 :goto_1f

    :catchall_6
    move-exception p0

    .line 68
    :try_start_a
    monitor-exit v10
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    throw p0

    :catchall_7
    move-exception p0

    .line 69
    :try_start_b
    monitor-exit v8
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    throw p0

    :catchall_8
    move-exception p0

    .line 70
    :try_start_c
    monitor-exit v10
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    throw p0

    .line 71
    :goto_10
    :try_start_d
    monitor-exit v8
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    throw p0

    :cond_1f
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_6

    .line 72
    :cond_20
    :goto_11
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3b

    .line 73
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v7, :cond_21

    goto/16 :goto_1f

    .line 74
    :cond_21
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v1

    .line 75
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq v1, v3, :cond_22

    const-class v3, Ljava/lang/Boolean;

    if-eq v1, v3, :cond_22

    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-eq v1, v3, :cond_22

    const-class v3, Ljava/lang/Void;

    if-eq v1, v3, :cond_22

    goto/16 :goto_1f

    .line 76
    :cond_22
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    .line 77
    array-length v1, v1

    if-gt v1, v7, :cond_3b

    .line 78
    iget-object v1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 79
    invoke-static {v0}, Lga;->m(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_23

    goto/16 :goto_1f

    .line 80
    :cond_23
    invoke-static {p0}, Lga;->z(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v3

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 81
    const-string v5, "refreshstate"

    invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_24

    goto/16 :goto_1f

    .line 82
    :cond_24
    const-string v5, "minioldstyleheader"

    invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_25

    const-string v5, "simplecomponent"

    invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_25

    goto :goto_13

    .line 83
    :cond_25
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    move v5, v2

    .line 84
    :goto_12
    array-length v6, v3

    if-ge v5, v6, :cond_27

    .line 85
    aget-object v6, v3, v5

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    .line 86
    const-string v7, "refresh"

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_3b

    const-string v7, "m6."

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_26

    goto/16 :goto_1f

    :cond_26
    add-int/lit8 v5, v5, 0x1

    goto :goto_12

    .line 87
    :cond_27
    :goto_13
    invoke-static {v0}, Lga;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lga;->o(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3b

    if-nez v1, :cond_28

    goto :goto_16

    :cond_28
    move v3, v2

    .line 88
    :goto_14
    array-length v5, v1

    if-ge v3, v5, :cond_2b

    .line 89
    aget-object v5, v1, v3

    if-nez v5, :cond_29

    goto :goto_15

    .line 90
    :cond_29
    invoke-static {v5}, Lga;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lga;->o(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2a

    goto/16 :goto_1f

    :cond_2a
    :goto_15
    add-int/lit8 v3, v3, 0x1

    goto :goto_14

    .line 91
    :cond_2b
    :goto_16
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lga;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lga;->o(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2c

    goto :goto_17

    .line 92
    :cond_2c
    invoke-static {p0}, Lga;->z(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lga;->o(Ljava/lang/String;)Z

    move-result v4

    :goto_17
    if-eqz v4, :cond_2d

    goto/16 :goto_1f

    .line 93
    :cond_2d
    invoke-static {v0}, Lga;->r(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2e

    goto :goto_18

    .line 94
    :cond_2e
    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_2f

    move-object v1, v0

    check-cast v1, Landroid/view/View;

    filled-new-array {v2}, [I

    move-result-object v3

    invoke-static {v1, v2, v3}, Lga;->g(Landroid/view/View;I[I)Z

    move-result v1

    if-eqz v1, :cond_2f

    goto :goto_18

    .line 95
    :cond_2f
    invoke-static {p0}, Lga;->z(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 96
    const-string v2, "mini"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_30

    const-string v2, "wxa"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_30

    const-string v2, "microapp"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3b

    .line 97
    :cond_30
    :goto_18
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p0

    invoke-static {v0, p0}, Lga;->f(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto/16 :goto_1f

    .line 98
    :cond_31
    :goto_19
    iget-object v1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 99
    invoke-static {v0}, Lga;->m(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_32

    goto/16 :goto_1f

    .line 100
    :cond_32
    invoke-static {v0}, Lga;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lga;->o(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3b

    if-nez v1, :cond_33

    goto :goto_1c

    .line 101
    :cond_33
    :goto_1a
    array-length v3, v1

    if-ge v2, v3, :cond_36

    .line 102
    aget-object v3, v1, v2

    if-nez v3, :cond_34

    goto :goto_1b

    .line 103
    :cond_34
    invoke-static {v3}, Lga;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lga;->o(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_35

    goto :goto_1f

    :cond_35
    :goto_1b
    add-int/lit8 v2, v2, 0x1

    goto :goto_1a

    .line 104
    :cond_36
    :goto_1c
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lga;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lga;->o(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_37

    goto :goto_1d

    .line 105
    :cond_37
    invoke-static {p0}, Lga;->z(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lga;->o(Ljava/lang/String;)Z

    move-result v4

    :goto_1d
    if-eqz v4, :cond_38

    goto :goto_1f

    .line 106
    :cond_38
    invoke-static {v0}, Lga;->r(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_39

    goto :goto_1e

    .line 107
    :cond_39
    invoke-static {p0}, Lga;->z(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 108
    const-string v2, "mini"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3a

    const-string v2, "wxa"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3a

    const-string v2, "microapp"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3b

    .line 109
    :cond_3a
    :goto_1e
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p0

    invoke-static {v0, p0}, Lga;->f(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    :cond_3b
    :goto_1f
    return-void
.end method
