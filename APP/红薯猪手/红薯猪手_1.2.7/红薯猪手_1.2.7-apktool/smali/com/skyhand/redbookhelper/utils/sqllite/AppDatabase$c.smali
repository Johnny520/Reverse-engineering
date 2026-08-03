.class public final Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/content/Context;)Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;
    .locals 16

    const-class v0, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;

    const/16 v1, 0xa

    new-array v2, v1, [B

    fill-array-data v2, :array_0

    const/4 v3, 0x6

    new-array v4, v3, [B

    fill-array-data v4, :array_1

    invoke-static {v2, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v7

    .line 1
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_16

    .line 2
    new-instance v9, L۟/a9$b;

    invoke-direct {v9}, L۟/a9$b;-><init>()V

    const/4 v2, 0x2

    new-array v4, v2, [L۟/t5;

    .line 3
    sget-object v5, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;->ۥ۠:Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase$a;

    const/4 v13, 0x0

    aput-object v5, v4, v13

    sget-object v5, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;->ۥ۠۟:Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase$b;

    const/4 v14, 0x1

    aput-object v5, v4, v14

    .line 4
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    move v6, v13

    :goto_0
    if-ge v6, v2, :cond_0

    aget-object v8, v4, v6

    iget v10, v8, L۟/t5;->ۥ:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget v8, v8, L۟/t5;->ۥ۟:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v9, v4}, L۟/a9$b;->ۥ([L۟/t5;)V

    const/4 v4, 0x3

    .line 5
    sget-object v12, L۟/s;->ۥ۟۟:L۟/s$a;

    new-instance v8, L۟/d3;

    invoke-direct {v8}, L۟/d3;-><init>()V

    new-instance v15, L۟/f1;

    const-string v5, "activity"

    move-object/from16 v6, p0

    .line 6
    invoke-virtual {v6, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/app/ActivityManager;

    if-eqz v5, :cond_1

    .line 7
    invoke-virtual {v5}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    move-result v5

    if-nez v5, :cond_1

    move v10, v4

    goto :goto_1

    :cond_1
    move v10, v2

    :goto_1
    move-object v5, v15

    move-object/from16 v6, p0

    move-object v11, v12

    .line 8
    invoke-direct/range {v5 .. v12}, L۟/f1;-><init>(Landroid/content/Context;Ljava/lang/String;L۟/d3;L۟/a9$b;ILjava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v6, v14

    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    :goto_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v7, 0x2e

    const/16 v8, 0x5f

    invoke-virtual {v5, v7, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "_Impl"

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :try_start_0
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_3

    move-object v2, v5

    goto :goto_3

    :cond_3
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_3
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    invoke-static {v2, v14, v6}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    check-cast v0, L۟/a9;

    .line 11
    invoke-virtual {v0, v15}, L۟/a9;->ۥ۟۠(L۟/f1;)L۟/bb;

    move-result-object v2

    .line 12
    iput-object v2, v0, L۟/a9;->ۥ۟۟:L۟/bb;

    invoke-virtual {v0}, L۟/a9;->ۥ۟ۢ()Ljava/util/Set;

    move-result-object v2

    new-instance v5, Ljava/util/BitSet;

    invoke-direct {v5}, Ljava/util/BitSet;-><init>()V

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, -0x1

    if-eqz v6, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Class;

    iget-object v8, v15, L۟/f1;->ۥ۟ۢ:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    sub-int/2addr v8, v14

    :goto_5
    if-ltz v8, :cond_5

    iget-object v9, v15, L۟/f1;->ۥ۟ۢ:Ljava/util/List;

    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual {v5, v8}, Ljava/util/BitSet;->set(I)V

    move v7, v8

    goto :goto_6

    :cond_4
    add-int/lit8 v8, v8, -0x1

    goto :goto_5

    :cond_5
    :goto_6
    if-ltz v7, :cond_6

    iget-object v8, v0, L۟/a9;->ۥۣ۟:Ljava/util/HashMap;

    iget-object v9, v15, L۟/f1;->ۥ۟ۢ:Ljava/util/List;

    invoke-interface {v9, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, L۟/z;

    invoke-virtual {v8, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "A required auto migration spec ("

    .line 13
    invoke-static {v1}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 14
    invoke-virtual {v6}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ") is missing in the database configuration."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    iget-object v2, v15, L۟/f1;->ۥ۟ۢ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v14

    :goto_7
    if-ltz v2, :cond_9

    invoke-virtual {v5, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v6

    if-eqz v6, :cond_8

    add-int/lit8 v2, v2, -0x1

    goto :goto_7

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    invoke-virtual {v0}, L۟/a9;->ۥ۟ۡ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_a
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, L۟/t5;

    iget-object v6, v15, L۟/f1;->ۥ۟۠:L۟/a9$b;

    .line 15
    iget-object v6, v6, L۟/a9$b;->ۥ:Ljava/util/HashMap;

    .line 16
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v6

    .line 17
    iget v8, v5, L۟/t5;->ۥ:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v6, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    iget-object v6, v15, L۟/f1;->ۥ۟۠:L۟/a9$b;

    new-array v8, v14, [L۟/t5;

    aput-object v5, v8, v13

    invoke-virtual {v6, v8}, L۟/a9$b;->ۥ([L۟/t5;)V

    goto :goto_8

    :cond_b
    const-class v2, L۟/d9;

    iget-object v5, v0, L۟/a9;->ۥ۟۟:L۟/bb;

    invoke-static {v2, v5}, L۟/a9;->ۥ۟ۦ(Ljava/lang/Class;L۟/bb;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, L۟/d9;

    if-eqz v2, :cond_c

    .line 18
    iput-object v15, v2, L۟/d9;->ۥ:L۟/f1;

    .line 19
    :cond_c
    const-class v2, L۟/x;

    iget-object v5, v0, L۟/a9;->ۥ۟۟:L۟/bb;

    invoke-static {v2, v5}, L۟/a9;->ۥ۟ۦ(Ljava/lang/Class;L۟/bb;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, L۟/x;

    const/4 v5, 0x0

    if-nez v2, :cond_15

    iget v2, v15, L۟/f1;->ۥۣ۟:I

    if-ne v2, v4, :cond_d

    move v2, v14

    goto :goto_9

    :cond_d
    move v2, v13

    :goto_9
    iget-object v4, v0, L۟/a9;->ۥ۟۟:L۟/bb;

    invoke-interface {v4, v2}, L۟/bb;->setWriteAheadLoggingEnabled(Z)V

    iput-object v5, v0, L۟/a9;->ۥ۟ۢ:Ljava/util/List;

    iget-object v2, v15, L۟/f1;->ۥ۟ۤ:Ljava/util/concurrent/Executor;

    iput-object v2, v0, L۟/a9;->ۥ۟:Ljava/util/concurrent/Executor;

    .line 20
    new-instance v2, Ljava/util/ArrayDeque;

    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 21
    iput-boolean v13, v0, L۟/a9;->ۥ۟ۡ:Z

    invoke-virtual {v0}, L۟/a9;->ۥۣ۟()Ljava/util/Map;

    move-result-object v2

    new-instance v4, Ljava/util/BitSet;

    invoke-direct {v4}, Ljava/util/BitSet;-><init>()V

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Class;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Class;

    iget-object v9, v15, L۟/f1;->ۥ۟ۡ:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    sub-int/2addr v9, v14

    :goto_b
    if-ltz v9, :cond_10

    iget-object v10, v15, L۟/f1;->ۥ۟ۡ:Ljava/util/List;

    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v10

    if-eqz v10, :cond_f

    invoke-virtual {v4, v9}, Ljava/util/BitSet;->set(I)V

    goto :goto_c

    :cond_f
    add-int/lit8 v9, v9, -0x1

    goto :goto_b

    :cond_10
    move v9, v7

    :goto_c
    if-ltz v9, :cond_11

    iget-object v10, v0, L۟/a9;->ۥ۟ۦ:Ljava/util/HashMap;

    iget-object v11, v15, L۟/f1;->ۥ۟ۡ:Ljava/util/List;

    invoke-interface {v11, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v10, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "A required type converter ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ") for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " is missing in the database configuration."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    iget-object v2, v15, L۟/f1;->ۥ۟ۡ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v14

    :goto_d
    if-ltz v2, :cond_14

    invoke-virtual {v4, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v5

    if-eqz v5, :cond_13

    add-int/lit8 v2, v2, -0x1

    goto :goto_d

    :cond_13
    iget-object v0, v15, L۟/f1;->ۥ۟ۡ:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected type converter "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_14
    new-array v1, v1, [B

    .line 22
    fill-array-data v1, :array_2

    new-array v2, v3, [B

    fill-array-data v2, :array_3

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    check-cast v0, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;

    return-object v0

    .line 23
    :cond_15
    iget-object v0, v0, L۟/a9;->ۥ۟۠:L۟/k4;

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    throw v5

    .line 26
    :catch_0
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Failed to create an instance of "

    .line 27
    invoke-static {v2}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 28
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :catch_1
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Cannot access the constructor"

    .line 29
    invoke-static {v2}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 30
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :catch_2
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "cannot find implementation for "

    .line 31
    invoke-static {v2}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 32
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " does not exist"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 33
    :cond_16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :array_0
    .array-data 1
        0x4bt
        -0x17t
        -0x2bt
        -0x35t
        0x4et
        -0x30t
        0x55t
        -0x4t
        -0x2ct
        -0x1at
    .end array-data

    nop

    :array_1
    .array-data 1
        0x39t
        -0x74t
        -0x4ft
        -0x6ct
        0x26t
        -0x4bt
    .end array-data

    nop

    :array_2
    .array-data 1
        0x2bt
        0x1bt
        -0x4dt
        -0x7ft
        0x9t
        -0x62t
        0x67t
        0x40t
        -0xct
        -0x3ct
    .end array-data

    nop

    :array_3
    .array-data 1
        0x49t
        0x6et
        -0x26t
        -0x13t
        0x6dt
        -0x4at
    .end array-data
.end method
