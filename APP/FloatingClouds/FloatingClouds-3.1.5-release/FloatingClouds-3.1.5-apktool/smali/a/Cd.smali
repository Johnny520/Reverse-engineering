.class public final La/Cd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/Cd;

.field public static final b:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La/Cd;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/Cd;->a:La/Cd;

    const-string v0, "RuleSystem"

    const-string v1, "loaded"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, La/Cd;->b:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public static a(La/g3;La/fd;)La/gd;
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    sget-object v5, La/dd;->c:La/dd;

    const-string v2, "RuleSystem"

    const-string v3, "rule"

    invoke-static {v1, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "ctx"

    invoke-static {v0, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, La/g3;->a:Ljava/lang/String;

    const-string v4, "ruleId"

    invoke-static {v3, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, La/a5;->a:Ljava/lang/Object;

    const/4 v6, 0x0

    if-eqz v4, :cond_0

    const-string v7, "rule_class_"

    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v4, v6

    :goto_0
    const/16 v7, 0x1c

    iget-object v0, v0, La/fd;->b:Ljava/lang/ClassLoader;

    if-eqz v4, :cond_1

    invoke-static {v0, v4}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    if-eqz v4, :cond_1

    sget-object v0, La/cd;->c:La/cd;

    invoke-static {v4, v0, v6, v6, v7}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {}, La/w1;->H()Z

    move-result v4

    sget-object v12, La/cd;->b:La/cd;

    if-nez v4, :cond_2

    sget-object v13, La/dd;->b:La/dd;

    new-instance v0, La/j6;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-object v2, v1, La/g3;->a:Ljava/lang/String;

    const-string v3, "DkBridge not initialized"

    const-string v1, "DK_NOT_READY"

    const-string v4, ""

    invoke-direct/range {v0 .. v6}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v8, La/gd;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v11, v0

    invoke-direct/range {v8 .. v15}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    return-object v8

    :cond_2
    move-object v4, v12

    :try_start_0
    iget-object v8, v1, La/g3;->b:Ljava/lang/String;

    const-string v9, "."

    invoke-static {v8, v9}, La/Be;->S(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, La/w1;->p(Ljava/lang/String;)Ljava/util/List;

    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_3

    new-instance v3, La/j6;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v15

    iget-object v12, v1, La/g3;->a:Ljava/lang/String;

    const-string v13, "no class matched"

    const-string v11, "DEXKIT_NO_MATCH"

    const-string v14, ""

    move-object v10, v3

    invoke-direct/range {v10 .. v16}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v0, La/gd;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    return-object v0

    :cond_3
    iget-object v5, v1, La/g3;->c:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_9

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Ljava/lang/String;

    sget-object v12, La/Cd;->a:La/Cd;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v11}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    if-eqz v11, :cond_7

    invoke-virtual {v11}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v11

    const-string v12, "getInterfaces(...)"

    invoke-static {v11, v12}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v12, v11

    const/4 v13, 0x0

    move v14, v13

    :goto_2
    if-ge v14, v12, :cond_7

    aget-object v15, v11, v14

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v16

    if-eqz v16, :cond_4

    goto :goto_4

    :cond_4
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_6

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v6, v17

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v6, v13}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_5

    :cond_5
    const/4 v6, 0x0

    const/16 v7, 0x1c

    goto :goto_3

    :cond_6
    :goto_4
    add-int/lit8 v14, v14, 0x1

    const/4 v6, 0x0

    const/16 v7, 0x1c

    goto :goto_2

    :cond_7
    const/4 v6, 0x0

    const/16 v7, 0x1c

    goto :goto_1

    :cond_8
    const/4 v10, 0x0

    :goto_5
    check-cast v10, Ljava/lang/String;

    if-nez v10, :cond_a

    invoke-static {v8}, La/t3;->m0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Ljava/lang/String;

    goto :goto_6

    :cond_9
    invoke-static {v8}, La/t3;->m0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Ljava/lang/String;

    :cond_a
    :goto_6
    invoke-static {v0, v10}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_b

    sget-object v13, La/dd;->d:La/dd;

    new-instance v14, La/j6;

    const-string v0, "forName("

    const-string v2, ") failed"

    invoke-static {v0, v10, v2}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v19

    const-string v15, "CLASS_LOAD_FAILED"

    iget-object v0, v1, La/g3;->a:Ljava/lang/String;

    const-string v18, ""

    move-object/from16 v16, v0

    invoke-direct/range {v14 .. v20}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v8, La/gd;

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v11, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v12, v4

    invoke-direct/range {v8 .. v15}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    return-object v8

    :cond_b
    invoke-static {v3, v10}, La/a5;->h(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "DEXKIT_PRIMARY rule="

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " cls="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v1, La/cd;->a:La/cd;

    const/4 v2, 0x0

    const/16 v3, 0x1c

    invoke-static {v0, v1, v2, v2, v3}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    const-string v6, "DK_SEARCH_FAILED "

    invoke-virtual {v6, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3, v0}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, La/x1;->a([Ljava/lang/Object;)V

    new-instance v3, La/j6;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_c

    const-string v2, ""

    :cond_c
    move-object v9, v2

    new-instance v2, Ljava/io/StringWriter;

    invoke-direct {v2}, Ljava/io/StringWriter;-><init>()V

    new-instance v6, Ljava/io/PrintWriter;

    invoke-direct {v6, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {v0, v6}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    invoke-virtual {v6}, Ljava/io/PrintWriter;->flush()V

    invoke-virtual {v2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v10

    const-string v0, "toString(...)"

    invoke-static {v10, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    const-string v7, "DK_SEARCH_FAILED"

    iget-object v8, v1, La/g3;->a:Ljava/lang/String;

    move-object v6, v3

    invoke-direct/range {v6 .. v12}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v0, La/gd;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    return-object v0
.end method

.method public static d(Ljava/lang/Class;)Z
    .locals 6

    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object p0

    const-string v0, "getMethods(...)"

    invoke-static {p0, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "k"

    invoke-static {v4, v5}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    array-length v4, v4

    const/4 v5, 0x2

    if-ne v4, v5, :cond_0

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    aget-object v4, v4, v1

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v4, v5}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    const/4 v4, 0x1

    aget-object v3, v3, v4

    const-class v5, Ljava/lang/String;

    invoke-static {v3, v5}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return v4

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 2

    const/16 v0, 0x2f

    const/16 v1, 0x2e

    invoke-static {p0, v0, v1}, La/Ae;->F(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object p0

    const-string v0, "java.util.ArrayList"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "ArrayList;"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ".ArrayList"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static f(Ljava/lang/Class;)Z
    .locals 2

    const-class v0, Landroid/widget/ListAdapter;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-class v0, Landroid/widget/BaseAdapter;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    if-eqz p0, :cond_4

    const-class v0, Ljava/lang/Object;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.widget.BaseAdapter"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.widget.ListAdapter"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    goto :goto_0

    :cond_3
    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_4
    const/4 p0, 0x0

    return p0
.end method

.method public static g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p1, v0, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static h()Ljava/util/List;
    .locals 8

    const-string v0, "com.tencent.mm.plugin.mvvmlist.MvvmList"

    sget-object v1, La/Y5;->a:La/Y5;

    const-string v2, "RuleSystem"

    const/4 v3, 0x0

    const/16 v4, 0x8

    :try_start_0
    const-string v5, "void"

    const-string v6, "java.util.List"

    const-string v7, "boolean"

    filled-new-array {v6, v7}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-static {v0, v5, v6, v3, v4}, La/w1;->x(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v5

    const-string v6, "DK_SEARCH_FAILED F004_contact_list_fields submitReset(JVM)"

    filled-new-array {v2, v6, v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, La/x1;->a([Ljava/lang/Object;)V

    move-object v5, v1

    :goto_0
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_0

    return-object v5

    :cond_0
    :try_start_1
    const-string v5, "V"

    const-string v6, "Ljava/util/List;"

    const-string v7, "Z"

    filled-new-array {v6, v7}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-static {v0, v5, v6, v3, v4}, La/w1;->x(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    const-string v3, "DK_SEARCH_FAILED F004_contact_list_fields submitReset(desc)"

    filled-new-array {v2, v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :goto_1
    return-object v1
.end method

.method public static j(Ljava/lang/ClassLoader;Ljava/util/List;Ljava/util/List;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)La/Hf;
    .locals 10

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    sget-object v1, La/Cd;->a:La/Cd;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, v0}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, La/Cd;->f(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_0

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    if-nez v0, :cond_6

    if-eqz p3, :cond_5

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3}, La/Cd;->f(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_3

    move-object p1, p3

    goto :goto_2

    :cond_3
    move-object p1, v2

    :goto_2
    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    move-object p3, p1

    :cond_5
    :goto_3
    move-object v0, p3

    :cond_6
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, p2}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p2

    if-eqz p2, :cond_8

    invoke-static {p2}, La/Cd;->d(Ljava/lang/Class;)Z

    move-result p3

    if-eqz p3, :cond_8

    goto :goto_4

    :cond_8
    move-object p2, v2

    :goto_4
    if-eqz p2, :cond_7

    goto :goto_5

    :cond_9
    move-object p2, v2

    :goto_5
    if-nez p2, :cond_a

    if-eqz p4, :cond_a

    invoke-static {p4}, La/Cd;->d(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_a

    move-object p2, p4

    :cond_a
    if-nez p2, :cond_b

    goto :goto_6

    :cond_b
    move-object p4, p2

    :goto_6
    const/4 p1, 0x1

    const-class p2, Ljava/util/List;

    const/4 p3, 0x0

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v3}, La/Be;->U(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_c

    goto/16 :goto_a

    :cond_c
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    goto :goto_a

    :cond_d
    :try_start_0
    invoke-static {v1}, La/w1;->q(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_7

    :catch_0
    sget-object v1, La/Y5;->a:La/Y5;

    :goto_7
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {p0, v3}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    if-eqz v3, :cond_10

    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v4

    const-string v5, "getDeclaredMethods(...)"

    invoke-static {v4, v5}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v5, v4

    move v6, p3

    :goto_8
    if-ge v6, v5, :cond_10

    aget-object v7, v4, v6

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    array-length v8, v8

    if-ne v8, p1, :cond_f

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    aget-object v8, v8, p3

    invoke-virtual {v8}, Ljava/lang/Class;->isPrimitive()Z

    move-result v8

    if-nez v8, :cond_f

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    aget-object v8, v8, p3

    const-class v9, Ljava/lang/String;

    invoke-static {v8, v9}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    aget-object v7, v7, p3

    invoke-virtual {p2, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_f

    goto :goto_9

    :cond_f
    add-int/lit8 v6, v6, 0x1

    goto :goto_8

    :cond_10
    move-object v3, v2

    :goto_9
    if-eqz v3, :cond_e

    move-object v2, v3

    :cond_11
    :goto_a
    if-nez v2, :cond_13

    if-eqz p5, :cond_13

    invoke-virtual {p5}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object p0

    const-string v1, "getMethods(...)"

    invoke-static {p0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, p0

    move v3, p3

    :goto_b
    if-ge v3, v1, :cond_13

    aget-object v4, p0, v3

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "a"

    invoke-static {v5, v6}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_12

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v5

    array-length v5, v5

    if-ne v5, p1, :cond_12

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    aget-object v4, v4, p3

    invoke-virtual {p2, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_12

    move-object v2, p5

    goto :goto_c

    :cond_12
    add-int/lit8 v3, v3, 0x1

    goto :goto_b

    :cond_13
    :goto_c
    if-nez v2, :cond_14

    goto :goto_d

    :cond_14
    move-object p5, v2

    :goto_d
    new-instance p0, La/Hf;

    invoke-direct {p0, v0, p4, p5}, La/Hf;-><init>(Ljava/io/Serializable;Ljava/io/Serializable;Ljava/io/Serializable;)V

    return-object p0
.end method

.method public static k(Ljava/lang/Class;Ljava/lang/String;)Z
    .locals 11

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v0, "void"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {p0, p1}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_1
    new-instance v2, La/mc;

    const-string v0, "I"

    const-string v3, "int"

    invoke-direct {v2, v0, v3}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, La/mc;

    const-string v0, "Z"

    const-string v4, "boolean"

    invoke-direct {v3, v0, v4}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, La/mc;

    const-string v0, "J"

    const-string v5, "long"

    invoke-direct {v4, v0, v5}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, La/mc;

    const-string v0, "D"

    const-string v6, "double"

    invoke-direct {v5, v0, v6}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, La/mc;

    const-string v0, "F"

    const-string v7, "float"

    invoke-direct {v6, v0, v7}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, La/mc;

    const-string v0, "B"

    const-string v8, "byte"

    invoke-direct {v7, v0, v8}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, La/mc;

    const-string v0, "C"

    const-string v9, "char"

    invoke-direct {v8, v0, v9}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v9, La/mc;

    const-string v0, "S"

    const-string v10, "short"

    invoke-direct {v9, v0, v10}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v2 .. v9}, [La/mc;

    move-result-object v0

    invoke-static {v0}, La/ba;->E([La/mc;)Ljava/util/Map;

    move-result-object v0

    const-string v2, "["

    invoke-static {p1, v2}, La/Be;->S(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, ";"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v1

    invoke-virtual {v3, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const-string v4, "substring(...)"

    invoke-static {v3, v4}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    const/16 v4, 0x2f

    invoke-static {v3, v4}, La/Be;->T(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    move-object v3, v0

    :goto_0
    invoke-static {p1, v2, v5}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-ne p1, v0, :cond_4

    move p1, v1

    goto :goto_1

    :cond_4
    move p1, v5

    :goto_1
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    const/16 v2, 0x2e

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p0

    :cond_5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v2}, La/Be;->T(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p0

    if-eqz p1, :cond_6

    invoke-virtual {v3, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    :goto_2
    return v1

    :cond_6
    return v5
.end method


# virtual methods
.method public final b(La/qb;La/fd;)La/gd;
    .locals 22

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x1

    const-string v4, "ctx"

    invoke-static {v1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, La/qb;->e:Ljava/lang/String;

    move-object/from16 v5, p0

    invoke-virtual {v5, v4}, La/Cd;->c(Ljava/lang/String;)La/md;

    move-result-object v6

    instance-of v7, v6, La/g3;

    if-eqz v7, :cond_0

    check-cast v6, La/g3;

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    sget-object v13, La/cd;->b:La/cd;

    sget-object v14, La/dd;->c:La/dd;

    if-nez v6, :cond_1

    new-instance v15, La/j6;

    const-string v1, "declaredClassRuleId="

    const-string v2, " not registered"

    invoke-static {v1, v4, v2}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v20

    iget-object v0, v0, La/qb;->a:Ljava/lang/String;

    const-string v19, ""

    const-string v16, "NO_CLASS_RULE"

    move-object/from16 v17, v0

    invoke-direct/range {v15 .. v21}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v9, La/gd;

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v12, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v9 .. v16}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    return-object v9

    :cond_1
    invoke-static {v6, v1}, La/Cd;->a(La/g3;La/fd;)La/gd;

    move-result-object v1

    iget-boolean v4, v1, La/gd;->a:Z

    if-eqz v4, :cond_d

    iget-object v1, v1, La/gd;->b:Ljava/lang/Class;

    if-nez v1, :cond_2

    goto/16 :goto_7

    :cond_2
    iget-boolean v4, v0, La/qb;->g:Z

    if-eqz v4, :cond_3

    new-instance v4, La/kd;

    invoke-direct {v4, v3}, La/kd;-><init>(I)V

    new-instance v6, La/T7;

    new-instance v7, La/A3;

    const/4 v9, 0x6

    invoke-direct {v7, v9, v1}, La/A3;-><init>(ILjava/lang/Object;)V

    invoke-direct {v6, v7, v4}, La/T7;-><init>(La/A3;La/D7;)V

    new-instance v4, La/kd;

    const/4 v7, 0x2

    invoke-direct {v4, v7}, La/kd;-><init>(I)V

    new-instance v7, La/C6;

    sget-object v9, La/Td;->i:La/Td;

    invoke-direct {v7, v6, v4}, La/C6;-><init>(La/Pd;La/kd;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v4

    const-string v6, "getDeclaredMethods(...)"

    invoke-static {v4, v6}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v6, v4

    if-nez v6, :cond_4

    sget-object v4, La/a6;->a:La/a6;

    move-object v7, v4

    goto :goto_1

    :cond_4
    new-instance v6, La/M1;

    invoke-direct {v6, v2, v4}, La/M1;-><init>(ILjava/lang/Object;)V

    move-object v7, v6

    :goto_1
    invoke-interface {v7}, La/Pd;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const-string v7, "getParameterTypes(...)"

    iget-object v9, v0, La/qb;->c:Ljava/util/List;

    iget-object v10, v0, La/qb;->b:Ljava/lang/String;

    if-eqz v6, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v11, v6

    check-cast v11, Ljava/lang/reflect/Method;

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v12

    const-string v15, "getReturnType(...)"

    invoke-static {v12, v15}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v15, La/Cd;->a:La/Cd;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v12, v10}, La/Cd;->k(Ljava/lang/Class;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_a

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v12

    invoke-static {v12, v7}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v15

    array-length v8, v12

    if-eq v15, v8, :cond_5

    goto :goto_5

    :cond_5
    new-instance v8, La/f9;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v15

    sub-int/2addr v15, v3

    invoke-direct {v8, v2, v15, v3}, La/d9;-><init>(III)V

    instance-of v15, v8, Ljava/util/Collection;

    if-eqz v15, :cond_6

    move-object v15, v8

    check-cast v15, Ljava/util/Collection;

    invoke-interface {v15}, Ljava/util/Collection;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v8}, La/d9;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    move-object v15, v8

    check-cast v15, La/e9;

    iget-boolean v15, v15, La/e9;->c:Z

    if-eqz v15, :cond_8

    move-object v15, v8

    check-cast v15, La/c9;

    invoke-virtual {v15}, La/c9;->a()I

    move-result v15

    invoke-interface {v9, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v3, v17

    check-cast v3, Ljava/lang/String;

    aget-object v15, v12, v15

    invoke-static {v15, v3}, La/Cd;->k(Ljava/lang/Class;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_5

    :cond_7
    const/4 v3, 0x1

    goto :goto_3

    :cond_8
    :goto_4
    iget-object v3, v0, La/qb;->d:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_9

    goto :goto_6

    :cond_9
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v11, "getName(...)"

    invoke-static {v8, v11}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8, v3, v2}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_6

    :cond_a
    :goto_5
    const/4 v3, 0x1

    goto/16 :goto_2

    :cond_b
    const/4 v6, 0x0

    :goto_6
    check-cast v6, Ljava/lang/reflect/Method;

    if-eqz v6, :cond_c

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4, v7}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, La/kd;

    const/4 v8, 0x3

    invoke-direct {v7, v8}, La/kd;-><init>(I)V

    const/16 v8, 0x1f

    const/4 v9, 0x0

    invoke-static {v4, v9, v7, v8}, La/N1;->e0([Ljava/lang/Object;Ljava/lang/String;La/D7;I)Ljava/lang/String;

    move-result-object v4

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "METHOD_RESOLVED rule="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, La/qb;->a:Ljava/lang/String;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " class="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " method="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "("

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "RuleSystem"

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v0, La/cd;->a:La/cd;

    const/16 v2, 0x14

    const/4 v9, 0x0

    invoke-static {v1, v0, v6, v9, v2}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    return-object v0

    :cond_c
    new-instance v6, La/j6;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "no method in "

    const-string v3, " matches returnType="

    const-string v4, " params="

    invoke-static {v2, v1, v3, v10, v4}, La/z;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    iget-object v8, v0, La/qb;->a:Ljava/lang/String;

    const-string v10, ""

    const-string v7, "METHOD_NOT_FOUND"

    invoke-direct/range {v6 .. v12}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v9, La/gd;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v12, v6

    invoke-direct/range {v9 .. v16}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    return-object v9

    :cond_d
    :goto_7
    new-instance v15, La/j6;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "declared class "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v6, La/g3;->b:Ljava/lang/String;

    const-string v3, " unresolved"

    invoke-static {v1, v2, v3}, La/z;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v20

    iget-object v0, v0, La/qb;->a:Ljava/lang/String;

    const-string v19, ""

    const-string v16, "CLASS_UNRESOLVED"

    move-object/from16 v17, v0

    invoke-direct/range {v15 .. v21}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v9, La/gd;

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v12, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v9 .. v16}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    return-object v9
.end method

.method public final declared-synchronized c(Ljava/lang/String;)La/md;
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "ruleId"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La/Cd;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La/md;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized i(La/md;)V
    .locals 5

    const-string v0, "REGISTER ruleId="

    const-string v1, "register() called ruleId="

    monitor-enter p0

    :try_start_0
    const-string v2, "rule"

    invoke-static {p1, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "RuleSystem"

    invoke-interface {p1}, La/md;->a()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v1, La/Cd;->b:Ljava/util/LinkedHashMap;

    invoke-interface {p1}, La/md;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "RuleSystem"

    invoke-interface {p1}, La/md;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " type="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v1, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
