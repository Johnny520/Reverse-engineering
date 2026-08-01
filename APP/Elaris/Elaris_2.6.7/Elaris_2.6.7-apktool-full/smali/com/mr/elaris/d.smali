.class public final Lcom/mr/elaris/d;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mr/elaris/d;->a:I

    .line 2
    .line 3
    const/16 p1, 0x46

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
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    iget-object v2, v1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2
    sget-object v3, Ls4;->b:Ljava/lang/Object;

    monitor-enter v3

    .line 3
    :try_start_0
    sget-object v4, Ls4;->o:Lf2;

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    const/4 v3, 0x1

    .line 4
    invoke-static {v4, v3}, Ls4;->n(Lf2;Z)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    if-eqz v2, :cond_1

    array-length v5, v2

    if-nez v5, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    iget-object v5, v4, Lf2;->b:Ljava/lang/Object;

    check-cast v5, Lia;

    .line 6
    iget v5, v5, Lia;->d:I

    .line 7
    new-instance v7, Lp4;

    .line 8
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v8, Ljava/util/IdentityHashMap;

    invoke-direct {v8}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {v8}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v8

    move v9, v6

    .line 10
    :goto_0
    array-length v10, v2

    if-ge v9, v10, :cond_3

    .line 11
    aget-object v10, v2, v9

    invoke-static {v10, v6, v8, v7}, Ls4;->y(Ljava/lang/Object;ILjava/util/Set;Lp4;)V

    .line 12
    iget-boolean v10, v7, Lp4;->c:Z

    if-eqz v10, :cond_2

    :cond_1
    :goto_1
    move v4, v6

    goto :goto_2

    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 13
    :cond_3
    iget v8, v7, Lp4;->a:I

    if-lt v8, v5, :cond_1

    iget v8, v7, Lp4;->b:I

    if-gtz v8, :cond_4

    goto :goto_1

    .line 14
    :cond_4
    const-string v8, "consumed"

    invoke-static {v4, v8}, Ls4;->f(Lf2;Ljava/lang/String;)V

    .line 15
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v8, "official mixed send bypassed image hooks pic="

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v8, v7, Lp4;->a:I

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, " text="

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v7, v7, Lp4;->b:I

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " expected="

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ls4;->p(Ljava/lang/String;)V

    move v4, v3

    :goto_2
    if-nez v4, :cond_29

    .line 16
    sget-object v7, Lqa;->i:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v9, Lqa;->l:Ljava/lang/ThreadLocal;

    invoke-virtual {v9}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    goto/16 :goto_18

    .line 17
    :cond_5
    const-string v8, "original_image_default"

    invoke-static {v8}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_29

    .line 18
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->findContactArg([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    const/high16 v9, -0x80000000

    if-nez v8, :cond_6

    goto :goto_3

    .line 19
    :cond_6
    const-string v11, "chatType"

    invoke-static {v8, v11}, Lqa;->o(Ljava/lang/Object;Ljava/lang/String;)I

    move-result v11

    if-eq v11, v9, :cond_7

    goto :goto_4

    .line 20
    :cond_7
    const-string v11, "type"

    invoke-static {v8, v11}, Lqa;->o(Ljava/lang/Object;Ljava/lang/String;)I

    move-result v11

    if-ne v11, v9, :cond_8

    :goto_3
    const/4 v11, -0x1

    :cond_8
    :goto_4
    const/4 v8, -0x2

    if-eq v11, v8, :cond_29

    if-eqz v2, :cond_29

    .line 21
    array-length v8, v2

    if-eqz v8, :cond_29

    .line 22
    invoke-static {v2}, Lqa;->l([Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    goto/16 :goto_18

    .line 23
    :cond_9
    array-length v8, v2

    move v11, v6

    move v12, v11

    :goto_5
    if-ge v11, v8, :cond_f

    aget-object v13, v2, v11

    .line 24
    instance-of v14, v13, Ljava/util/ArrayList;

    if-nez v14, :cond_a

    goto :goto_8

    .line 25
    :cond_a
    check-cast v13, Ljava/util/ArrayList;

    .line 26
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v14

    const/4 v15, 0x2

    if-ge v14, v15, :cond_b

    goto :goto_8

    .line 27
    :cond_b
    new-instance v14, Ljava/util/HashSet;

    invoke-direct {v14}, Ljava/util/HashSet;-><init>()V

    .line 28
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v15

    sub-int/2addr v15, v3

    :goto_6
    if-ltz v15, :cond_e

    .line 29
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    new-instance v16, Ljava/util/IdentityHashMap;

    invoke-direct/range {v16 .. v16}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static/range {v16 .. v16}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v10

    invoke-static {v5, v6, v10}, Lqa;->A(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/Object;

    move-result-object v5

    .line 30
    invoke-static {v5}, Lqa;->f(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 31
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v10

    if-nez v10, :cond_c

    goto :goto_7

    .line 32
    :cond_c
    invoke-virtual {v14, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    .line 33
    :try_start_1
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v12, v12, 0x1

    :catchall_0
    :cond_d
    :goto_7
    add-int/lit8 v15, v15, -0x1

    goto :goto_6

    :cond_e
    :goto_8
    add-int/lit8 v11, v11, 0x1

    goto :goto_5

    :cond_f
    if-lez v12, :cond_10

    .line 34
    const-string v5, "list"

    invoke-static {v5, v12}, Lqa;->v(Ljava/lang/String;I)V

    .line 35
    :cond_10
    const-string v5, ""

    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->findContactArg([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    .line 36
    const-string v10, ":"

    if-nez v8, :cond_11

    const-string v8, "contact:null"

    goto/16 :goto_10

    .line 37
    :cond_11
    const-string v11, "chatType"

    invoke-static {v8, v11}, Lqa;->o(Ljava/lang/Object;Ljava/lang/String;)I

    move-result v11

    if-eq v11, v9, :cond_12

    goto :goto_9

    .line 38
    :cond_12
    const-string v11, "type"

    invoke-static {v8, v11}, Lqa;->o(Ljava/lang/Object;Ljava/lang/String;)I

    move-result v11

    if-ne v11, v9, :cond_13

    const/4 v11, -0x1

    .line 39
    :cond_13
    :goto_9
    const-string v9, "peerUid"

    const-string v12, "peerUin"

    const-string v13, "peer"

    const-string v14, "uid"

    const-string v15, "uin"

    filled-new-array {v9, v12, v13, v14, v15}, [Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lqa;->i(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 40
    const-string v12, "guildId"

    const-string v13, "guild"

    const-string v14, "guildCode"

    filled-new-array {v12, v13, v14}, [Ljava/lang/String;

    move-result-object v12

    invoke-static {v8, v12}, Lqa;->i(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 41
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v13

    if-nez v13, :cond_19

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v13

    if-nez v13, :cond_19

    .line 42
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    move v13, v6

    :goto_a
    if-eqz v9, :cond_18

    .line 43
    const-class v14, Ljava/lang/Object;

    if-eq v9, v14, :cond_18

    const/16 v14, 0x18

    if-ge v13, v14, :cond_18

    .line 44
    :try_start_2
    invoke-virtual {v9}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v15
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_b

    :catchall_1
    const/4 v15, 0x0

    :goto_b
    if-eqz v15, :cond_17

    .line 45
    array-length v6, v15

    const/4 v3, 0x0

    :goto_c
    if-ge v3, v6, :cond_17

    aget-object v14, v15, v3

    add-int/lit8 v18, v13, 0x1

    move/from16 v19, v3

    const/16 v3, 0x18

    if-lt v13, v3, :cond_14

    move/from16 v13, v18

    goto :goto_e

    .line 46
    :cond_14
    :try_start_3
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v13

    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v13

    if-nez v13, :cond_16

    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v13

    const-class v3, Ljava/lang/String;

    if-eq v13, v3, :cond_15

    goto :goto_d

    :cond_15
    const/4 v3, 0x1

    .line 47
    invoke-virtual {v14, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 48
    invoke-virtual {v14, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 49
    instance-of v13, v3, Ljava/lang/String;

    if-eqz v13, :cond_16

    move-object v13, v3

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v13

    if-lez v13, :cond_16

    .line 50
    check-cast v3, Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-object v9, v3

    goto :goto_f

    :catchall_2
    :cond_16
    :goto_d
    add-int/lit8 v3, v19, 0x1

    move/from16 v13, v18

    const/16 v14, 0x18

    goto :goto_c

    .line 51
    :cond_17
    :goto_e
    invoke-virtual {v9}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v9

    const/4 v3, 0x1

    const/4 v6, 0x0

    goto :goto_a

    :cond_18
    move-object v9, v5

    .line 52
    :cond_19
    :goto_f
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "contact:"

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9}, Lqa;->x(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v12}, Lqa;->x(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 53
    :goto_10
    array-length v3, v2

    move-object v10, v5

    const/4 v6, 0x0

    const/4 v9, 0x0

    :goto_11
    if-ge v6, v3, :cond_20

    aget-object v11, v2, v6

    .line 54
    instance-of v12, v11, Ljava/util/Collection;

    if-nez v12, :cond_1a

    goto :goto_13

    .line 55
    :cond_1a
    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v11

    const/4 v12, 0x0

    :cond_1b
    :goto_12
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_1f

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    const/16 v17, 0x1

    add-int/lit8 v12, v12, 0x1

    const/16 v14, 0x8

    if-le v12, v14, :cond_1c

    goto :goto_13

    .line 56
    :cond_1c
    new-instance v14, Ljava/util/IdentityHashMap;

    invoke-direct {v14}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {v14}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v14

    const/4 v15, 0x0

    invoke-static {v13, v15, v14}, Lqa;->A(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/Object;

    move-result-object v13

    .line 57
    invoke-static {v13}, Lqa;->f(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 58
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v14

    if-nez v14, :cond_1d

    goto :goto_12

    :cond_1d
    add-int/lit8 v9, v9, 0x1

    .line 59
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v14

    if-nez v14, :cond_1e

    move-object v10, v13

    goto :goto_12

    .line 60
    :cond_1e
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_1b

    goto :goto_14

    :cond_1f
    :goto_13
    add-int/lit8 v6, v6, 0x1

    goto :goto_11

    :cond_20
    const/4 v6, 0x1

    if-ne v9, v6, :cond_22

    .line 61
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_21

    goto :goto_14

    .line 62
    :cond_21
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "|"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 63
    :cond_22
    :goto_14
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_23

    goto/16 :goto_18

    .line 64
    :cond_23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 65
    invoke-virtual {v7}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v3

    const/16 v6, 0x50

    if-gt v3, v6, :cond_24

    goto :goto_16

    .line 66
    :cond_24
    invoke-virtual {v7}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_25
    :goto_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_27

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 67
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Long;

    if-eqz v10, :cond_26

    .line 68
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    sub-long v11, v8, v11

    const-wide/16 v13, 0x1f40

    cmp-long v11, v11, v13

    if-lez v11, :cond_25

    .line 69
    :cond_26
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v7, v6, v10}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_15

    .line 70
    :cond_27
    :goto_16
    invoke-virtual {v7, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    .line 71
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v7, v5, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v3, :cond_29

    .line 72
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    sub-long v5, v8, v5

    const-wide/16 v10, 0x0

    cmp-long v5, v5, v10

    if-ltz v5, :cond_29

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    sub-long/2addr v8, v5

    const-wide/16 v5, 0xa28

    cmp-long v3, v8, v5

    if-gtz v3, :cond_29

    .line 73
    const-string v0, "call"

    const/4 v3, 0x1

    invoke-static {v0, v3}, Lqa;->v(Ljava/lang/String;I)V

    .line 74
    iget-object v0, v1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    instance-of v2, v0, Ljava/lang/reflect/Method;

    if-eqz v2, :cond_28

    .line 75
    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    goto :goto_17

    .line 76
    :cond_28
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 77
    :goto_17
    invoke-static {v1, v0}, Lv4;->G(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;Ljava/lang/Class;)V

    return-void

    .line 78
    :cond_29
    :goto_18
    invoke-static {v2}, Lqa;->l([Ljava/lang/Object;)Z

    move-result v3

    if-nez v4, :cond_2a

    .line 79
    const-string v5, "original_image_default"

    .line 80
    invoke-static {v5}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2a

    if-eqz v3, :cond_2a

    .line 81
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->c([Ljava/lang/Object;)V

    .line 82
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->f([Ljava/lang/Object;)V

    :cond_2a
    if-eqz v2, :cond_2f

    .line 83
    iget v3, v0, Lcom/mr/elaris/d;->a:I

    if-ltz v3, :cond_2f

    array-length v5, v2

    if-ge v3, v5, :cond_2f

    .line 84
    aget-object v2, v2, v3

    .line 85
    instance-of v3, v2, Ljava/util/ArrayList;

    if-eqz v3, :cond_2f

    if-nez v4, :cond_2f

    .line 86
    check-cast v2, Ljava/util/ArrayList;

    .line 87
    sget-object v3, Ly4;->a:Ljava/lang/ThreadLocal;

    .line 88
    const-string v5, "rename_apk_file"

    invoke-static {v5}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2e

    .line 89
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_2b

    goto :goto_1b

    .line 90
    :cond_2b
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 91
    :try_start_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_19
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 92
    const-string v7, "rename_apk_file"

    invoke-static {v7}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_2c

    goto :goto_19

    .line 93
    :cond_2c
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    const/4 v15, 0x0

    invoke-static {v6, v15, v7}, Ly4;->i(Ljava/lang/Object;ILjava/util/HashSet;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_19

    :catchall_3
    move-exception v0

    goto :goto_1a

    .line 94
    :cond_2d
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->remove()V

    goto :goto_1b

    :goto_1a
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->remove()V

    .line 95
    throw v0

    .line 96
    :cond_2e
    :goto_1b
    invoke-static {}, Lcom/mr/elaris/HookEntry;->b()Z

    move-result v3

    if-eqz v3, :cond_2f

    .line 97
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->h(Ljava/util/ArrayList;)V

    .line 98
    :cond_2f
    invoke-static {}, Lcom/mr/elaris/HookEntry;->a()Lcom/mr/elaris/HookConfig;

    move-result-object v2

    const-string v3, "pic_summary_enabled"

    invoke-virtual {v2, v3}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_34

    .line 99
    iget-object v2, v1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    if-eqz v2, :cond_31

    iget v0, v0, Lcom/mr/elaris/d;->a:I

    if-ltz v0, :cond_31

    array-length v3, v2

    if-lt v0, v3, :cond_30

    goto :goto_1c

    :cond_30
    aget-object v5, v2, v0

    goto :goto_1d

    :cond_31
    :goto_1c
    const/4 v5, 0x0

    :goto_1d
    if-nez v4, :cond_33

    .line 100
    instance-of v0, v5, Ljava/util/ArrayList;

    if-eqz v0, :cond_33

    .line 101
    move-object v0, v5

    check-cast v0, Ljava/util/ArrayList;

    .line 102
    new-instance v2, Ljava/util/IdentityHashMap;

    invoke-direct {v2}, Ljava/util/IdentityHashMap;-><init>()V

    .line 103
    invoke-static {v2}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v15, 0x0

    .line 104
    invoke-static {v0, v3, v15, v2}, Lqa;->m(Ljava/lang/Object;ZILjava/util/Set;)Z

    move-result v2

    if-eqz v2, :cond_33

    .line 105
    sget-object v2, Lj4;->a:[Ljava/lang/String;

    .line 106
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 107
    sget-object v2, Lj4;->d:Ljava/util/Map;

    monitor-enter v2

    .line 108
    :try_start_5
    invoke-interface {v2, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    .line 109
    invoke-static {v6, v7}, Lj4;->c(J)V

    if-eqz v4, :cond_32

    .line 110
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v4, v4, v6

    if-ltz v4, :cond_32

    goto :goto_1e

    :catchall_4
    move-exception v0

    goto :goto_1f

    :cond_32
    move v3, v15

    :goto_1e
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    if-nez v3, :cond_34

    .line 111
    iget-object v1, v1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->findContactArg([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mr/elaris/HookEntry;->rewriteOutgoingPicSummary(Ljava/util/ArrayList;Ljava/lang/Object;)V

    goto :goto_20

    .line 112
    :goto_1f
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    throw v0

    :cond_33
    if-nez v4, :cond_34

    .line 113
    invoke-static {v5}, Lcom/mr/elaris/HookEntry;->d(Ljava/lang/Object;)V

    :cond_34
    :goto_20
    return-void

    :catchall_5
    move-exception v0

    .line 114
    :try_start_7
    monitor-exit v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    throw v0
.end method
