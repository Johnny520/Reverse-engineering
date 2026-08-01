.class public final Le4;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Le4;->a:I

    .line 2
    .line 3
    const/16 p1, 0x60

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 0

    .line 1
    sget-object p0, Lqa;->l:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->remove()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    iget v2, v0, Le4;->a:I

    .line 2
    const-string v0, "favorite_emoticon_batch_send"

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_38

    if-eqz v1, :cond_38

    .line 3
    iget-object v0, v1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    if-eqz v0, :cond_38

    if-ltz v2, :cond_38

    array-length v3, v0

    if-lt v2, v3, :cond_0

    goto/16 :goto_19

    .line 4
    :cond_0
    aget-object v0, v0, v2

    .line 5
    instance-of v3, v0, Ljava/util/ArrayList;

    if-nez v3, :cond_1

    goto/16 :goto_19

    .line 6
    :cond_1
    check-cast v0, Ljava/util/ArrayList;

    .line 7
    iget-object v3, v1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    instance-of v4, v3, Ljava/lang/reflect/Method;

    if-eqz v4, :cond_2

    .line 8
    check-cast v3, Ljava/lang/reflect/Method;

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v3

    :goto_0
    move-object v7, v3

    goto :goto_1

    .line 9
    :cond_2
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    goto :goto_0

    .line 10
    :goto_1
    sget-object v3, Lj4;->e:Lg4;

    const/4 v4, 0x4

    const-wide/16 v8, 0x708

    const/4 v6, 0x0

    const/4 v10, 0x1

    if-eqz v3, :cond_10

    .line 11
    iget-object v11, v1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    instance-of v11, v11, Ljava/lang/reflect/Method;

    if-nez v11, :cond_3

    goto/16 :goto_7

    .line 12
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    iget-wide v13, v3, Lg4;->c:J

    sub-long/2addr v11, v13

    const-wide/16 v13, 0x0

    cmp-long v13, v11, v13

    if-ltz v13, :cond_f

    cmp-long v11, v11, v8

    if-lez v11, :cond_4

    goto/16 :goto_6

    .line 13
    :cond_4
    invoke-static {v0}, Lj4;->b(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_5

    goto/16 :goto_7

    .line 14
    :cond_5
    sget-object v11, Lj4;->c:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v12, v3, Lg4;->a:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Li4;

    if-eqz v11, :cond_10

    .line 15
    iget-object v12, v3, Lg4;->b:Li4;

    if-ne v11, v12, :cond_10

    iget-object v12, v11, Li4;->f:Lh4;

    if-eqz v12, :cond_6

    goto/16 :goto_7

    .line 16
    :cond_6
    sget-object v12, Lqa;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    new-instance v12, Ljava/util/IdentityHashMap;

    invoke-direct {v12}, Ljava/util/IdentityHashMap;-><init>()V

    .line 18
    invoke-static {v12}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v12

    .line 19
    invoke-static {v0, v10, v6, v12}, Lqa;->m(Ljava/lang/Object;ZILjava/util/Set;)Z

    move-result v12

    if-nez v12, :cond_7

    goto/16 :goto_7

    .line 20
    :cond_7
    iget-object v8, v1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    if-nez v8, :cond_8

    .line 21
    new-array v8, v6, [Ljava/lang/Object;

    goto :goto_2

    .line 22
    :cond_8
    invoke-virtual {v8}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Ljava/lang/Object;

    if-ltz v2, :cond_9

    .line 23
    array-length v9, v8

    if-ge v2, v9, :cond_9

    aget-object v9, v8, v2

    instance-of v9, v9, Ljava/util/ArrayList;

    if-eqz v9, :cond_9

    .line 24
    new-instance v9, Ljava/util/ArrayList;

    aget-object v10, v8, v2

    check-cast v10, Ljava/util/ArrayList;

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    aput-object v9, v8, v2

    .line 25
    :cond_9
    :goto_2
    new-instance v9, Lh4;

    .line 26
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object v8, v9, Lh4;->b:Ljava/lang/Object;

    .line 28
    iput v2, v9, Lh4;->a:I

    .line 29
    iput-object v9, v11, Li4;->f:Lh4;

    .line 30
    iget-object v2, v11, Li4;->c:Landroid/widget/EditText;

    iget-boolean v8, v11, Li4;->d:Z

    if-eqz v8, :cond_e

    .line 31
    iget-object v8, v11, Li4;->b:Ljava/lang/Object;

    .line 32
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    if-eqz v9, :cond_c

    const/16 v10, 0x22

    .line 33
    invoke-static {v9, v10}, Li5;->b0(Landroid/content/Context;I)I

    move-result v10

    .line 34
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 35
    new-instance v13, Ljava/util/IdentityHashMap;

    invoke-direct {v13}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {v13}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v13

    .line 36
    filled-new-array {v6}, [I

    move-result-object v14

    invoke-static {v6, v0, v12, v13, v14}, Li5;->K(ILjava/lang/Object;Ljava/util/ArrayList;Ljava/util/Set;[I)V

    .line 37
    :goto_3
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v13

    if-ge v6, v13, :cond_b

    .line 38
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-static {v13, v10}, Li5;->R(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    move-result-object v13

    if-eqz v13, :cond_a

    .line 39
    new-instance v5, Lt4;

    const/4 v6, 0x2

    invoke-static {v9, v6}, Li5;->b0(Landroid/content/Context;I)I

    move-result v6

    invoke-direct {v5, v13, v6, v10}, Lt4;-><init>(Landroid/graphics/Bitmap;II)V

    goto :goto_4

    :cond_a
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 40
    :cond_b
    const-string v6, "captured"

    const/4 v9, -0x1

    invoke-static {v8, v6, v9}, Li5;->a1(Ljava/lang/Object;Ljava/lang/String;I)V

    :cond_c
    const/4 v5, 0x0

    :goto_4
    if-nez v5, :cond_d

    goto :goto_5

    .line 41
    :cond_d
    new-instance v6, Lq;

    invoke-direct {v6, v11, v5, v4}, Lq;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v2, v6}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 42
    :cond_e
    :goto_5
    invoke-static {v3}, Lj4;->d(Lg4;)V

    .line 43
    invoke-static {v1, v7}, Lv4;->G(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;Ljava/lang/Class;)V

    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "favorite emoticon batch captured official send token="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v3, Lg4;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " elements="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " object="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v11, Li4;->b:Ljava/lang/Object;

    .line 46
    invoke-static {v0}, Lj4;->j(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 47
    invoke-static {v0}, Lj4;->u(Ljava/lang/String;)V

    return-void

    .line 48
    :cond_f
    :goto_6
    invoke-static {v3}, Lj4;->d(Lg4;)V

    .line 49
    :cond_10
    :goto_7
    sget-object v3, Lj4;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_11

    goto/16 :goto_19

    .line 50
    :cond_11
    invoke-static {v0}, Lj4;->b(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_38

    .line 51
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v11

    if-nez v11, :cond_12

    goto/16 :goto_19

    .line 52
    :cond_12
    invoke-static {v3}, Lj4;->i(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v11

    .line 53
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_13

    goto/16 :goto_19

    .line 54
    :cond_13
    invoke-static {v11}, Lj4;->t(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v12

    .line 55
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_14

    goto/16 :goto_19

    .line 56
    :cond_14
    iget-object v13, v1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    if-nez v13, :cond_16

    :cond_15
    move v5, v6

    goto :goto_b

    :cond_16
    move v14, v6

    .line 57
    :goto_8
    array-length v15, v13

    if-ge v14, v15, :cond_15

    .line 58
    aget-object v15, v13, v14

    if-nez v15, :cond_17

    goto :goto_a

    .line 59
    :cond_17
    const-string v5, ""

    if-ne v14, v2, :cond_18

    .line 60
    invoke-static {}, Lj4;->v()Ljava/util/Set;

    move-result-object v8

    filled-new-array {v6}, [I

    move-result-object v9

    invoke-static {v15, v6, v8, v9, v5}, Lj4;->n(Ljava/lang/Object;ILjava/util/Set;[ILjava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1a

    :goto_9
    move v5, v10

    goto :goto_b

    .line 61
    :cond_18
    instance-of v8, v15, Ljava/util/Map;

    if-nez v8, :cond_19

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-static {v8}, Lj4;->r(Ljava/lang/Class;)Z

    move-result v8

    if-nez v8, :cond_1a

    .line 62
    :cond_19
    invoke-static {}, Lj4;->v()Ljava/util/Set;

    move-result-object v8

    filled-new-array {v6}, [I

    move-result-object v9

    invoke-static {v15, v6, v8, v9, v5}, Lj4;->n(Ljava/lang/Object;ILjava/util/Set;[ILjava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1a

    goto :goto_9

    :cond_1a
    :goto_a
    add-int/lit8 v14, v14, 0x1

    const-wide/16 v8, 0x708

    goto :goto_8

    .line 63
    :goto_b
    invoke-static {v3, v11}, Lj4;->g(Ljava/lang/String;Ljava/util/ArrayList;)Z

    move-result v8

    const-string v9, " tokens="

    if-nez v8, :cond_2e

    .line 64
    invoke-static {v1, v7}, Lv4;->G(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;Ljava/lang/Class;)V

    .line 65
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_38

    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1b

    goto/16 :goto_19

    :cond_1b
    move v0, v6

    .line 66
    :goto_c
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v0, v5, :cond_1d

    .line 67
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li4;

    if-eqz v5, :cond_1c

    goto :goto_d

    :cond_1c
    add-int/lit8 v0, v0, 0x1

    goto :goto_c

    :cond_1d
    const/4 v5, 0x0

    :goto_d
    if-nez v5, :cond_1e

    const/4 v0, 0x0

    goto :goto_e

    .line 68
    :cond_1e
    iget-object v0, v5, Li4;->c:Landroid/widget/EditText;

    .line 69
    :goto_e
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/16 v7, 0x10

    if-le v5, v7, :cond_1f

    .line 70
    const-string v1, "\u6df7\u5408\u53d1\u9001\u6536\u85cf\u8868\u60c5\u6570\u91cf\u8fc7\u591a\uff0c\u5df2\u62e6\u622a"

    invoke-static {v0, v1}, Ls4;->z(Landroid/widget/EditText;Ljava/lang/String;)V

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "blocked reason=too_many_tokens count="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " limit=16"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ls4;->p(Ljava/lang/String;)V

    return-void

    :cond_1f
    if-nez v0, :cond_22

    .line 72
    :goto_f
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_21

    .line 73
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li4;

    if-eqz v0, :cond_20

    .line 74
    iget-object v0, v0, Li4;->c:Landroid/widget/EditText;

    .line 75
    const-string v3, "\u672a\u627e\u5230\u8f93\u5165\u6846\uff0c\u5df2\u62e6\u622a\u6df7\u5408\u53d1\u9001"

    invoke-static {v0, v3}, Ls4;->z(Landroid/widget/EditText;Ljava/lang/String;)V

    goto :goto_10

    :cond_20
    add-int/lit8 v6, v6, 0x1

    goto :goto_f

    .line 76
    :cond_21
    :goto_10
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "blocked reason=input_missing method="

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ls4;->r(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " listIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 78
    invoke-static {v0}, Ls4;->p(Ljava/lang/String;)V

    return-void

    .line 79
    :cond_22
    :try_start_0
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_11

    :catchall_0
    const/4 v5, 0x0

    :goto_11
    if-nez v5, :cond_23

    .line 80
    const-string v2, "\u8f93\u5165\u6846\u5185\u5bb9\u672a\u5c31\u7eea\uff0c\u5df2\u62e6\u622a\u6df7\u5408\u53d1\u9001"

    invoke-static {v0, v2}, Ls4;->z(Landroid/widget/EditText;Ljava/lang/String;)V

    .line 81
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "blocked reason=editable_missing input="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 83
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " method="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    invoke-static {v1}, Ls4;->r(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 85
    invoke-static {v0}, Ls4;->p(Ljava/lang/String;)V

    return-void

    .line 86
    :cond_23
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    .line 87
    invoke-static {v7, v11}, Ls4;->t(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v8

    .line 88
    invoke-static {v8}, Ls4;->m(Ljava/util/ArrayList;)Z

    move-result v9

    if-eqz v9, :cond_24

    invoke-static {v8}, Ls4;->h(Ljava/util/ArrayList;)I

    move-result v9

    if-gtz v9, :cond_25

    .line 89
    :cond_24
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v9

    if-lez v9, :cond_25

    .line 90
    invoke-static {v3, v11}, Ls4;->t(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v9

    .line 91
    invoke-static {v9}, Ls4;->m(Ljava/util/ArrayList;)Z

    move-result v13

    if-eqz v13, :cond_25

    invoke-static {v9}, Ls4;->h(Ljava/util/ArrayList;)I

    move-result v13

    if-lez v13, :cond_25

    .line 92
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v13, "using outgoing text snapshot current="

    invoke-direct {v8, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v7}, Ls4;->A(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, " outgoing="

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    invoke-static {v3}, Ls4;->A(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 94
    invoke-static {v8}, Ls4;->p(Ljava/lang/String;)V

    move-object v8, v9

    move-object v9, v3

    goto :goto_12

    :cond_25
    move-object v9, v7

    .line 95
    :goto_12
    invoke-static {v8}, Ls4;->m(Ljava/util/ArrayList;)Z

    move-result v13

    if-eqz v13, :cond_26

    invoke-static {v8}, Ls4;->h(Ljava/util/ArrayList;)I

    move-result v13

    if-gtz v13, :cond_27

    :cond_26
    move-object v4, v5

    goto/16 :goto_17

    .line 96
    :cond_27
    invoke-static {v0}, Ls4;->s(Landroid/widget/EditText;)Ly;

    move-result-object v3

    if-nez v3, :cond_28

    .line 97
    invoke-static {v0, v5, v9}, Ls4;->x(Landroid/widget/EditText;Landroid/text/Editable;Ljava/lang/String;)V

    .line 98
    const-string v3, "\u672a\u627e\u5230QQ\u5b98\u65b9\u56fe\u6587\u8f93\u5165\u94fe\u8def\uff0c\u5df2\u62e6\u622a"

    invoke-static {v0, v3}, Ls4;->z(Landroid/widget/EditText;Ljava/lang/String;)V

    move-object v3, v0

    .line 99
    const-string v0, "blocked reason=official_span_missing"

    move-object v4, v5

    move-object v5, v8

    invoke-static/range {v0 .. v5}, Ls4;->q(Ljava/lang/String;Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;ILandroid/widget/EditText;Landroid/text/Editable;Ljava/util/ArrayList;)V

    return-void

    :cond_28
    move v1, v4

    move-object v4, v5

    move-object v5, v8

    .line 100
    invoke-static {v9, v5, v12, v3}, Ls4;->c(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ly;)Ljava/util/ArrayList;

    move-result-object v3

    .line 101
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-static {v5}, Ls4;->h(Ljava/util/ArrayList;)I

    move-result v8

    if-eq v7, v8, :cond_29

    .line 102
    invoke-static {v0, v4, v9}, Ls4;->x(Landroid/widget/EditText;Landroid/text/Editable;Ljava/lang/String;)V

    .line 103
    const-string v1, "\u90e8\u5206\u6536\u85cf\u8868\u60c5\u4e0d\u652f\u6301\u6df7\u5408\u53d1\u9001\uff0c\u5df2\u62e6\u622a"

    invoke-static {v0, v1}, Ls4;->z(Landroid/widget/EditText;Ljava/lang/String;)V

    .line 104
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "blocked reason=unsupported_favorite replacement="

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Ls4;->h(Ljava/util/ArrayList;)I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v3, v0

    move-object v0, v1

    move-object/from16 v1, p1

    .line 106
    invoke-static/range {v0 .. v5}, Ls4;->q(Ljava/lang/String;Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;ILandroid/widget/EditText;Landroid/text/Editable;Ljava/util/ArrayList;)V

    return-void

    .line 107
    :cond_29
    invoke-static {v0, v4, v9, v3}, Ls4;->a(Landroid/widget/EditText;Landroid/text/Editable;Ljava/lang/String;Ljava/util/ArrayList;)Z

    move-result v7

    if-nez v7, :cond_2a

    .line 108
    invoke-static {v0, v4, v9}, Ls4;->x(Landroid/widget/EditText;Landroid/text/Editable;Ljava/lang/String;)V

    .line 109
    const-string v1, "\u8f93\u5165\u6846\u5b98\u65b9\u56fe\u6587\u5185\u5bb9\u5199\u5165\u5931\u8d25\uff0c\u5df2\u62e6\u622a"

    invoke-static {v0, v1}, Ls4;->z(Landroid/widget/EditText;Ljava/lang/String;)V

    move-object v3, v0

    .line 110
    const-string v0, "blocked reason=span_apply_failed"

    move-object/from16 v1, p1

    invoke-static/range {v0 .. v5}, Ls4;->q(Ljava/lang/String;Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;ILandroid/widget/EditText;Landroid/text/Editable;Ljava/util/ArrayList;)V

    return-void

    .line 111
    :cond_2a
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 112
    invoke-static {v0, v7, v3, v6}, Ls4;->b(Landroid/widget/EditText;Ljava/lang/String;IZ)Lf2;

    move-result-object v18

    .line 113
    invoke-static/range {p1 .. p1}, Ls4;->r(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)Ljava/lang/String;

    move-result-object v20

    if-nez v18, :cond_2b

    :goto_13
    move-object v3, v0

    goto :goto_16

    .line 114
    :cond_2b
    new-array v3, v10, [Z

    aput-boolean v6, v3, v6

    .line 115
    new-array v7, v10, [Z

    aput-boolean v6, v7, v6

    .line 116
    new-array v8, v10, [Z

    aput-boolean v6, v8, v6

    const/4 v9, 0x5

    .line 117
    new-array v12, v9, [J

    fill-array-data v12, :array_0

    move v13, v6

    :goto_14
    if-ge v13, v9, :cond_2d

    add-int/lit8 v19, v13, 0x1

    if-ne v13, v1, :cond_2c

    move/from16 v22, v10

    goto :goto_15

    :cond_2c
    move/from16 v22, v6

    .line 118
    :goto_15
    new-instance v16, Ll4;

    move-object/from16 v17, v3

    move-object/from16 v21, v7

    move-object/from16 v23, v8

    invoke-direct/range {v16 .. v23}, Ll4;-><init>([ZLf2;ILjava/lang/String;[ZZ[Z)V

    move-object/from16 v7, v16

    move-object/from16 v3, v18

    aget-wide v13, v12, v13

    invoke-static {v3, v7, v13, v14}, Ls4;->u(Lf2;Ljava/lang/Runnable;J)V

    move-object/from16 v3, v17

    move/from16 v13, v19

    move-object/from16 v7, v21

    goto :goto_14

    :cond_2d
    move-object/from16 v3, v18

    .line 119
    new-instance v1, Lh0;

    const/4 v6, 0x3

    invoke-direct {v1, v6, v3}, Lh0;-><init>(ILjava/lang/Object;)V

    const-wide/16 v6, 0x708

    invoke-static {v3, v1, v6, v7}, Ls4;->u(Lf2;Ljava/lang/Runnable;J)V

    goto :goto_13

    .line 120
    :goto_16
    const-string v0, "converted scheduled_auto_send"

    move-object/from16 v1, p1

    invoke-static/range {v0 .. v5}, Ls4;->q(Ljava/lang/String;Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;ILandroid/widget/EditText;Landroid/text/Editable;Ljava/util/ArrayList;)V

    .line 121
    invoke-static {v11}, Lj4;->y(Ljava/util/ArrayList;)V

    return-void

    .line 122
    :goto_17
    invoke-static {v0, v4, v3}, Ls4;->x(Landroid/widget/EditText;Landroid/text/Editable;Ljava/lang/String;)V

    .line 123
    const-string v1, "\u6df7\u5408\u5185\u5bb9\u89e3\u6790\u5931\u8d25\uff0c\u5df2\u62e6\u622a\u5e76\u4fdd\u7559\u8f93\u5165"

    invoke-static {v0, v1}, Ls4;->z(Landroid/widget/EditText;Ljava/lang/String;)V

    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "blocked reason=parse_not_mixed tokens="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " editable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    invoke-static {v7}, Ls4;->A(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " text="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    invoke-static {v3}, Ls4;->A(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 127
    invoke-static {v0}, Ls4;->p(Ljava/lang/String;)V

    return-void

    .line 128
    :cond_2e
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 129
    :goto_18
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v6, v3, :cond_30

    .line 130
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li4;

    if-eqz v3, :cond_2f

    .line 131
    iget-object v8, v3, Li4;->f:Lh4;

    if-eqz v8, :cond_2f

    .line 132
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2f
    add-int/lit8 v6, v6, 0x1

    goto :goto_18

    .line 133
    :cond_30
    const-string v3, "\u90e8\u5206\u6536\u85cf\u8868\u60c5\u672a\u6355\u6349\u5230\u53d1\u9001\u6570\u636e\uff0c\u672c\u6b21\u5df2\u62e6\u622a"

    const-string v6, "\u672a\u6355\u6349\u5230\u6536\u85cf\u8868\u60c5\u53d1\u9001\u6570\u636e\uff0c\u8bf7\u91cd\u65b0\u70b9\u4e00\u6b21\u8868\u60c5"

    if-eqz v5, :cond_34

    .line 134
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_31

    .line 135
    invoke-static {v1, v7}, Lv4;->G(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;Ljava/lang/Class;)V

    .line 136
    invoke-static {v11}, Lj4;->y(Ljava/util/ArrayList;)V

    .line 137
    invoke-static {v12}, Lj4;->e(Ljava/util/ArrayList;)V

    .line 138
    invoke-static {v6, v12}, Lj4;->C(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 139
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "favorite emoticon batch reply blocked without captured data tokens="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 141
    invoke-static {v0}, Lj4;->u(Ljava/lang/String;)V

    return-void

    .line 142
    :cond_31
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_32

    .line 143
    invoke-static {v1, v7}, Lv4;->G(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;Ljava/lang/Class;)V

    .line 144
    invoke-static {v11}, Lj4;->y(Ljava/util/ArrayList;)V

    .line 145
    invoke-static {v12}, Lj4;->e(Ljava/util/ArrayList;)V

    .line 146
    invoke-static {v3, v12}, Lj4;->C(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 147
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "favorite emoticon batch reply blocked partial captured count="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 148
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 149
    invoke-static {v0}, Lj4;->u(Ljava/lang/String;)V

    return-void

    :cond_32
    const/4 v5, 0x1

    .line 150
    const-string v6, "reply"

    move v3, v2

    move-object v2, v0

    move-object v0, v1

    move v1, v3

    move-object v3, v11

    invoke-static/range {v0 .. v6}, Lj4;->z(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;ZLjava/lang/String;)Z

    move-result v1

    move-object v2, v3

    if-eqz v1, :cond_33

    .line 151
    invoke-static {v2}, Lj4;->y(Ljava/util/ArrayList;)V

    .line 152
    invoke-static {v12}, Lj4;->e(Ljava/util/ArrayList;)V

    return-void

    .line 153
    :cond_33
    invoke-static {v0, v7}, Lv4;->G(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;Ljava/lang/Class;)V

    .line 154
    invoke-static {v2}, Lj4;->y(Ljava/util/ArrayList;)V

    .line 155
    invoke-static {v12}, Lj4;->e(Ljava/util/ArrayList;)V

    .line 156
    const-string v0, "\u56de\u590d\u8868\u60c5\u53d1\u9001\u6570\u636e\u5408\u5e76\u5931\u8d25"

    invoke-static {v0, v12}, Lj4;->C(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 157
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "favorite emoticon batch reply merge failed tokens="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj4;->u(Ljava/lang/String;)V

    return-void

    :cond_34
    move v5, v2

    move-object v2, v0

    move-object v0, v1

    move v1, v5

    move-object v5, v4

    move-object v4, v11

    .line 158
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_35

    .line 159
    invoke-static {v0, v7}, Lv4;->G(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;Ljava/lang/Class;)V

    .line 160
    invoke-static {v4}, Lj4;->y(Ljava/util/ArrayList;)V

    .line 161
    invoke-static {v12}, Lj4;->e(Ljava/util/ArrayList;)V

    .line 162
    invoke-static {v6, v12}, Lj4;->C(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 163
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "favorite emoticon batch send blocked without captured data tokens="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 165
    invoke-static {v0}, Lj4;->u(Ljava/lang/String;)V

    return-void

    .line 166
    :cond_35
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v6, v8, :cond_36

    .line 167
    invoke-static {v0, v7}, Lv4;->G(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;Ljava/lang/Class;)V

    .line 168
    invoke-static {v4}, Lj4;->y(Ljava/util/ArrayList;)V

    .line 169
    invoke-static {v12}, Lj4;->e(Ljava/util/ArrayList;)V

    .line 170
    invoke-static {v3, v12}, Lj4;->C(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 171
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "favorite emoticon batch normal blocked partial captured count="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 172
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 173
    invoke-static {v0}, Lj4;->u(Ljava/lang/String;)V

    return-void

    :cond_36
    move-object v3, v4

    move-object v4, v5

    const/4 v5, 0x0

    .line 174
    const-string v6, "normal"

    invoke-static/range {v0 .. v6}, Lj4;->z(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;ZLjava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_37

    .line 175
    invoke-static {v3}, Lj4;->y(Ljava/util/ArrayList;)V

    .line 176
    invoke-static {v12}, Lj4;->e(Ljava/util/ArrayList;)V

    return-void

    .line 177
    :cond_37
    invoke-static {v0, v7}, Lv4;->G(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;Ljava/lang/Class;)V

    .line 178
    invoke-static {v3}, Lj4;->y(Ljava/util/ArrayList;)V

    .line 179
    invoke-static {v12}, Lj4;->e(Ljava/util/ArrayList;)V

    .line 180
    const-string v0, "\u6536\u85cf\u8868\u60c5\u53d1\u9001\u6570\u636e\u5408\u5e76\u5931\u8d25"

    invoke-static {v0, v12}, Lj4;->C(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 181
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "favorite emoticon batch normal merge failed tokens="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj4;->u(Ljava/lang/String;)V

    :cond_38
    :goto_19
    return-void

    nop

    :array_0
    .array-data 8
        0x0
        0x50
        0xb4
        0x168
        0x2bc
    .end array-data
.end method
