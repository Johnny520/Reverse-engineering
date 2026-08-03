.class public final synthetic La/p4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/github/libxposed/api/XposedInterface$Hooker;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/s4;


# direct methods
.method public synthetic constructor <init>(La/s4;I)V
    .locals 0

    .line 1
    iput p2, p0, La/p4;->a:I

    iput-object p1, p0, La/p4;->b:La/s4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/s4;La/J8;)V
    .locals 0

    .line 2
    const/4 p2, 0x2

    iput p2, p0, La/p4;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/p4;->b:La/s4;

    return-void
.end method


# virtual methods
.method public final intercept(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v3, "1"

    const-string v4, "field_msgType"

    const-string v5, ""

    const-string v6, "field_digest"

    const-string v7, "field_content"

    const-class v10, Ljava/lang/Object;

    const-string v0, "c"

    iget-object v11, v1, La/p4;->b:La/s4;

    const/4 v12, 0x1

    iget v13, v1, La/p4;->a:I

    packed-switch v13, :pswitch_data_0

    invoke-static {v2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v11, v2}, La/s4;->b(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-string v13, "\""

    invoke-static {v2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v14

    sget-object v0, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    iget-boolean v0, v0, La/jc;->n:Z

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    move-object/from16 v19, v14

    goto/16 :goto_1c

    :cond_1
    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v0

    const-string v15, "getArgs(...)"

    invoke-static {v0, v15}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v12}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    instance-of v15, v0, Ljava/lang/Integer;

    if-eqz v15, :cond_2

    check-cast v0, Ljava/lang/Integer;

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v15

    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v9

    :try_start_0
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/16 v17, 0x0

    :try_start_1
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v8

    const-string v12, "getMethods(...)"

    invoke-static {v8, v12}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v12, v8

    move-object/from16 v18, v0

    move/from16 v0, v17

    :goto_2
    if-ge v0, v12, :cond_5

    aget-object v19, v8, v0

    move/from16 v20, v0

    invoke-virtual/range {v19 .. v19}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getItem"

    invoke-static {v0, v1}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual/range {v19 .. v19}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    invoke-virtual/range {v19 .. v19}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    aget-object v0, v0, v17

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    move-object/from16 v0, v19

    goto :goto_4

    :cond_3
    const/16 v16, 0x1

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_a

    :cond_4
    move/from16 v16, v1

    :goto_3
    add-int/lit8 v0, v20, 0x1

    move-object/from16 v1, p0

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_4
    if-eqz v0, :cond_6

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    filled-new-array/range {v18 .. v18}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v9, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_6

    instance-of v1, v0, Landroid/view/View;

    if-nez v1, :cond_6

    goto/16 :goto_b

    :cond_6
    const-string v0, "data"

    invoke-static {v9, v0}, La/A1;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_7

    check-cast v0, Ljava/util/List;

    goto :goto_5

    :cond_7
    const/4 v0, 0x0

    :goto_5
    if-eqz v0, :cond_8

    if-ltz v15, :cond_8

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v15, v1, :cond_8

    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_8

    instance-of v1, v0, Landroid/view/View;

    if-nez v1, :cond_8

    goto/16 :goto_b

    :cond_8
    const-string v0, "e"

    invoke-static {v9, v0}, La/A1;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_9

    check-cast v0, Ljava/util/List;

    goto :goto_6

    :cond_9
    const/4 v0, 0x0

    :goto_6
    if-eqz v0, :cond_a

    if-ltz v15, :cond_a

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v15, v1, :cond_a

    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_a

    instance-of v1, v0, Landroid/view/View;

    if-nez v1, :cond_a

    goto/16 :goto_b

    :cond_a
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    move-object v1, v0

    move/from16 v8, v17

    :goto_7
    if-eqz v1, :cond_10

    invoke-virtual {v1, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    const/4 v0, 0x5

    if-ge v8, v0, :cond_10

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-static {v0}, La/w1;->I([Ljava/lang/Object;)La/G1;

    move-result-object v12

    :cond_b
    :goto_8
    invoke-virtual {v12}, La/G1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {v12}, La/G1;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v18

    if-nez v18, :cond_b

    move-object/from16 v18, v1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v0, v9}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_9

    :catchall_1
    move-exception v0

    :try_start_3
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_9
    instance-of v1, v0, La/wd$a;

    if-eqz v1, :cond_c

    const/4 v0, 0x0

    :cond_c
    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_e

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v15, v1, :cond_e

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_e

    instance-of v1, v0, Landroid/view/View;

    if-nez v1, :cond_e

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v19, v0

    const-string v0, "ViewHolder"

    move/from16 v20, v8

    const/4 v8, 0x1

    invoke-static {v1, v0, v8}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_d

    move-object/from16 v0, v19

    goto :goto_b

    :cond_d
    move-object/from16 v1, v18

    move/from16 v8, v20

    goto :goto_8

    :cond_e
    move-object/from16 v1, v18

    goto :goto_8

    :cond_f
    move-object/from16 v18, v1

    move/from16 v20, v8

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/16 v16, 0x1

    add-int/lit8 v8, v20, 0x1

    goto/16 :goto_7

    :cond_10
    const/4 v0, 0x0

    goto :goto_b

    :catchall_2
    move-exception v0

    const/16 v17, 0x0

    :goto_a
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_b
    instance-of v1, v0, La/wd$a;

    if-eqz v1, :cond_11

    const/4 v1, 0x0

    goto :goto_c

    :cond_11
    move-object v1, v0

    :goto_c
    if-nez v1, :cond_12

    goto/16 :goto_0

    :cond_12
    invoke-virtual {v11, v1}, La/s4;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    iget-object v12, v11, La/s4;->z:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v9

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v9}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    goto :goto_d

    :cond_13
    move-object/from16 v19, v14

    goto/16 :goto_15

    :cond_14
    move-object/from16 v18, v9

    :goto_d
    :try_start_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    move-object/from16 v19, v14

    move/from16 v2, v17

    move-object v14, v0

    :goto_e
    if-eqz v14, :cond_1a

    :try_start_5
    invoke-virtual {v14, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    const/4 v0, 0x3

    if-ge v2, v0, :cond_1a

    invoke-virtual {v14}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-static {v0}, La/w1;->I([Ljava/lang/Object;)La/G1;

    move-result-object v20

    :goto_f
    invoke-virtual/range {v20 .. v20}, La/G1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-virtual/range {v20 .. v20}, La/G1;->next()Ljava/lang/Object;

    move-result-object v0

    move/from16 v21, v2

    move-object v2, v0

    check-cast v2, Ljava/lang/reflect/Field;

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-nez v0, :cond_18

    move-object/from16 v22, v14

    const/4 v14, 0x1

    invoke-virtual {v2, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :try_start_6
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_10

    :catchall_3
    move-exception v0

    :try_start_7
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_10
    instance-of v14, v0, La/wd$a;

    if-eqz v14, :cond_15

    const/4 v0, 0x0

    :cond_15
    if-nez v0, :cond_16

    const-string v0, "null"

    :goto_11
    move-object/from16 v23, v2

    goto :goto_12

    :catchall_4
    move-exception v0

    goto/16 :goto_13

    :cond_16
    instance-of v14, v0, Ljava/lang/String;

    if-eqz v14, :cond_17

    check-cast v0, Ljava/lang/String;

    const/16 v14, 0x1e

    invoke-static {v0, v14}, La/Ce;->X(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_11

    :cond_17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v14

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    move-object/from16 v23, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, "@"

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_12
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {v23 .. v23}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v23, v13

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v24, v10

    const-string v10, " "

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v2, v21

    move-object/from16 v14, v22

    move-object/from16 v13, v23

    move-object/from16 v10, v24

    goto/16 :goto_f

    :cond_18
    move/from16 v2, v21

    goto/16 :goto_f

    :cond_19
    move/from16 v21, v2

    move-object/from16 v24, v10

    move-object/from16 v23, v13

    move-object/from16 v22, v14

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v14

    const/16 v16, 0x1

    add-int/lit8 v2, v21, 0x1

    move-object/from16 v13, v23

    move-object/from16 v10, v24

    goto/16 :goto_e

    :cond_1a
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_14

    :catchall_5
    move-exception v0

    move-object/from16 v19, v14

    :goto_13
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_14
    instance-of v2, v0, La/wd$a;

    if-eqz v2, :cond_1b

    const-string v0, "DUMP_FAIL"

    :cond_1b
    const-string v2, "getOrDefault(...)"

    invoke-static {v0, v2}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v13, "onBindVH adapter="

    invoke-direct {v10, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " pos="

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " item="

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " chatUser="

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " fields=["

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "msg"

    invoke-static {v0, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "[ConvRV] "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    :goto_15
    if-eqz v8, :cond_20

    sget-object v0, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v8}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v12, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface/range {p1 .. p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v0

    move/from16 v2, v17

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1c

    goto :goto_1c

    :cond_1c
    :try_start_8
    const-string v2, "itemView"

    invoke-static {v0, v2}, La/A1;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Landroid/view/View;

    if-eqz v2, :cond_1d

    check-cast v0, Landroid/view/View;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    goto :goto_17

    :catchall_6
    move-exception v0

    goto :goto_16

    :cond_1d
    const/4 v0, 0x0

    goto :goto_17

    :goto_16
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_17
    instance-of v2, v0, La/wd$a;

    if-eqz v2, :cond_1e

    const/4 v9, 0x0

    goto :goto_18

    :cond_1e
    move-object v9, v0

    :goto_18
    check-cast v9, Landroid/view/View;

    if-eqz v9, :cond_20

    const-string v0, "field_msgContent"

    const-string v2, "field_summary"

    filled-new-array {v7, v6, v0, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :try_start_9
    invoke-static {v1, v0, v5}, La/A1;->i(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    goto :goto_19

    :catchall_7
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    goto :goto_19

    :cond_1f
    :try_start_a
    invoke-static {v1, v4, v3}, La/A1;->i(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    goto :goto_1a

    :catchall_8
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_1a
    :try_start_b
    const-string v0, "setDigest"

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v0, v2}, La/A1;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    goto :goto_1b

    :catchall_9
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_1b
    invoke-virtual {v11, v9}, La/s4;->l(Landroid/view/View;)V

    invoke-virtual {v11, v9}, La/s4;->m(Landroid/view/View;)V

    :cond_20
    :goto_1c
    return-object v19

    :pswitch_1
    move-object/from16 v24, v10

    const-string v0, "chain"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v1

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    iget-boolean v0, v0, La/jc;->n:Z

    if-eqz v0, :cond_30

    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_21

    goto/16 :goto_2b

    :cond_21
    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v0

    instance-of v8, v0, Landroid/widget/ListAdapter;

    if-eqz v8, :cond_22

    check-cast v0, Landroid/widget/ListAdapter;

    goto :goto_1d

    :cond_22
    const/4 v0, 0x0

    :goto_1d
    if-nez v0, :cond_23

    goto/16 :goto_2b

    :cond_23
    invoke-interface {v2}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v2

    const/4 v8, 0x0

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v8, v2, Ljava/lang/Integer;

    if-eqz v8, :cond_24

    check-cast v2, Ljava/lang/Integer;

    goto :goto_1e

    :cond_24
    const/4 v2, 0x0

    :goto_1e
    if-eqz v2, :cond_30

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v0, v2}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_25

    goto/16 :goto_2b

    :cond_25
    instance-of v0, v1, Landroid/view/View;

    if-eqz v0, :cond_26

    move-object v0, v1

    check-cast v0, Landroid/view/View;

    move-object v8, v0

    goto :goto_1f

    :cond_26
    const/4 v8, 0x0

    :goto_1f
    if-nez v8, :cond_27

    goto/16 :goto_2b

    :cond_27
    invoke-static {v2}, La/A1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v9, v0, Ljava/lang/String;

    if-eqz v9, :cond_28

    check-cast v0, Ljava/lang/String;

    goto :goto_20

    :cond_28
    const/4 v0, 0x0

    :goto_20
    if-nez v0, :cond_2b

    const-string v0, "field_username"

    invoke-static {v2, v0}, La/A1;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v9, v0, Ljava/lang/String;

    if-eqz v9, :cond_29

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    goto :goto_21

    :cond_29
    const/4 v9, 0x0

    :goto_21
    if-nez v9, :cond_2a

    goto/16 :goto_2b

    :cond_2a
    move-object v0, v9

    :cond_2b
    sget-object v9, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_30

    filled-new-array {v7, v6}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_22
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2e

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :try_start_c
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_b

    :goto_23
    if-eqz v7, :cond_2c

    move-object/from16 v9, v24

    :try_start_d
    invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    if-nez v10, :cond_2d

    :try_start_e
    invoke-virtual {v7, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v10

    const/4 v14, 0x1

    invoke-virtual {v10, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v10, v2, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_e
    .catch Ljava/lang/NoSuchFieldException; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_a

    goto :goto_24

    :catchall_a
    move-exception v0

    goto :goto_25

    :catch_0
    :try_start_f
    invoke-virtual {v7}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v7

    move-object/from16 v24, v9

    goto :goto_23

    :cond_2c
    move-object/from16 v9, v24

    :cond_2d
    :goto_24
    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    goto :goto_26

    :catchall_b
    move-exception v0

    move-object/from16 v9, v24

    :goto_25
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_26
    move-object/from16 v24, v9

    goto :goto_22

    :cond_2e
    move-object/from16 v9, v24

    :try_start_10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    :goto_27
    if-eqz v0, :cond_2f

    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_c

    if-nez v5, :cond_2f

    :try_start_11
    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v5
    :try_end_11
    .catch Ljava/lang/NoSuchFieldException; {:try_start_11 .. :try_end_11} :catch_1
    .catchall {:try_start_11 .. :try_end_11} :catchall_c

    const/4 v14, 0x1

    :try_start_12
    invoke-virtual {v5, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v5, v2, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_12
    .catch Ljava/lang/NoSuchFieldException; {:try_start_12 .. :try_end_12} :catch_2
    .catchall {:try_start_12 .. :try_end_12} :catchall_c

    goto :goto_28

    :catchall_c
    move-exception v0

    goto :goto_29

    :catch_1
    const/4 v14, 0x1

    :catch_2
    :try_start_13
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_27

    :cond_2f
    :goto_28
    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_c

    goto :goto_2a

    :goto_29
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_2a
    invoke-virtual {v11, v8}, La/s4;->m(Landroid/view/View;)V

    invoke-virtual {v11, v8}, La/s4;->l(Landroid/view/View;)V

    :cond_30
    :goto_2b
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
