.class public final La/if;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/if$a;,
        La/if$b;
    }
.end annotation


# static fields
.field public static final a:La/if;

.field public static volatile b:Ljava/lang/String;

.field public static volatile c:I

.field public static volatile d:Z

.field public static volatile e:Z

.field public static volatile f:I

.field public static volatile g:Z

.field public static final h:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static volatile i:Z

.field public static volatile j:La/kf;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La/if;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/if;->a:La/if;

    const-string v0, "CACHE_MISS"

    sput-object v0, La/if;->b:Ljava/lang/String;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, La/if;->h:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static a()V
    .locals 13

    invoke-static {}, La/if;->g()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const-string v0, "[BlockHotUpdate] cleanupPatchFiles skipped (isActive=false)"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    const-string v0, "inactive"

    invoke-static {v2, v2, v2, v0}, La/n6;->f(ZIZLjava/lang/String;)V

    return-void

    :cond_0
    sget-object v0, La/gh;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, La/if;->b:Ljava/lang/String;

    const-string v3, "[BlockHotUpdate] cleanupPatchFiles FAILED: tinker path segments not ready (locateState="

    const-string v4, ")"

    invoke-static {v3, v0, v4}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    const-string v0, "PATH_SEGMENTS_NOT_READY"

    invoke-static {v2, v2, v1, v0}, La/n6;->f(ZIZLjava/lang/String;)V

    return-void

    :cond_1
    :try_start_0
    invoke-static {}, La/gh;->b()Ljava/io/File;

    move-result-object v0

    invoke-static {}, La/gh;->a()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    move v4, v2

    move v5, v4

    :cond_2
    :try_start_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v7, "getName(...)"

    if-eqz v6, :cond_9

    :try_start_2
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/io/File;

    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual {v6}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v6

    if-nez v6, :cond_3

    new-array v6, v2, [Ljava/io/File;

    goto :goto_0

    :catchall_0
    move-exception v0

    move v2, v4

    goto/16 :goto_8

    :cond_3
    :goto_0
    array-length v8, v6

    move v9, v2

    :goto_1
    if-ge v9, v8, :cond_2

    aget-object v10, v6, v9

    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v7}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11}, La/gh;->c(Ljava/lang/String;)Z

    move-result v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v11, :cond_8

    :try_start_3
    new-instance v4, La/v6;

    invoke-direct {v4, v10}, La/v6;-><init>(Ljava/io/File;)V

    new-instance v10, La/v6$b;

    invoke-direct {v10, v4}, La/v6$b;-><init>(La/v6;)V

    :goto_2
    move v4, v1

    :goto_3
    invoke-virtual {v10}, La/v;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-virtual {v10}, La/v;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/io/File;

    invoke-virtual {v11}, Ljava/io/File;->delete()Z

    move-result v12

    if-nez v12, :cond_4

    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v11
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-nez v11, :cond_5

    :cond_4
    if-eqz v4, :cond_5

    goto :goto_2

    :cond_5
    move v4, v2

    goto :goto_3

    :cond_6
    if-eqz v4, :cond_7

    add-int/lit8 v5, v5, 0x1

    :cond_7
    move v4, v1

    goto :goto_5

    :goto_4
    move v2, v1

    goto :goto_8

    :cond_8
    :goto_5
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_9
    :try_start_4
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_c

    array-length v3, v0

    :goto_6
    if-ge v2, v3, :cond_c

    aget-object v6, v0, v2

    invoke-virtual {v6}, Ljava/io/File;->isFile()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v7}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, La/gh;->c(Ljava/lang/String;)Z

    move-result v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v8, :cond_b

    :try_start_5
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    move-result v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-eqz v4, :cond_a

    add-int/lit8 v5, v5, 0x1

    :cond_a
    move v4, v1

    goto :goto_7

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_b
    :goto_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_c
    move v2, v4

    :try_start_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "[BlockHotUpdate] cleanupPatchFiles hadPatch="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, " deleted="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    const/4 v0, 0x0

    goto :goto_9

    :catchall_2
    move-exception v0

    goto :goto_8

    :catchall_3
    move-exception v0

    move v5, v2

    :goto_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    const-string v4, "[BlockHotUpdate] cleanupPatchFiles error"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v4, 0x2

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    move-object v0, v3

    :goto_9
    invoke-static {v2, v5, v1, v0}, La/n6;->f(ZIZLjava/lang/String;)V

    return-void
.end method

.method public static b(Ljava/lang/ClassLoader;La/J8;)V
    .locals 11

    const/4 v0, 0x1

    const-string v1, "cl"

    invoke-static {p0, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, La/J8;->b:Ljava/lang/String;

    const-string v1, ":patch"

    invoke-static {p1, v1}, La/Ae;->D(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    sget-object v1, La/if;->b:Ljava/lang/String;

    sget-object v2, La/gh;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v0

    sget-object v3, La/gh;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[BlockHotUpdate] diagnose locateState="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " pathReady="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " segments="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v1, La/if;->j:La/kf;

    const/4 v2, 0x0

    if-eqz p1, :cond_2

    if-eqz v1, :cond_0

    iget-object v1, v1, La/kf;->h:Ljava/lang/String;

    if-eqz v1, :cond_0

    sget-object v3, La/if;->a:La/if;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    if-eqz p0, :cond_0

    move p0, v0

    goto :goto_0

    :cond_0
    move p0, v2

    :goto_0
    sget-object v1, La/if;->h:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v3, "L4"

    invoke-virtual {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    sget-boolean v4, La/if;->g:Z

    new-instance v5, La/if$b;

    invoke-direct {v5, v3, p0, v1, v4}, La/if$b;-><init>(Ljava/lang/String;ZZZ)V

    invoke-static {v5}, La/w1;->K(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto/16 :goto_b

    :cond_2
    new-instance v3, La/if$b;

    sget-object v4, La/if;->h:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v5, "L0"

    invoke-virtual {v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto :goto_2

    :cond_3
    move v6, v2

    :goto_2
    sget v7, La/if;->c:I

    if-lez v7, :cond_4

    move v7, v0

    goto :goto_3

    :cond_4
    move v7, v2

    :goto_3
    invoke-direct {v3, v5, v0, v6, v7}, La/if$b;-><init>(Ljava/lang/String;ZZZ)V

    if-eqz v1, :cond_5

    iget-object v5, v1, La/kf;->f:Ljava/lang/String;

    if-eqz v5, :cond_5

    sget-object v6, La/if;->a:La/if;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, v5}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    if-eqz v5, :cond_5

    move v5, v0

    goto :goto_4

    :cond_5
    move v5, v2

    :goto_4
    const-string v6, "L1"

    invoke-virtual {v4, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    if-eqz v7, :cond_6

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    goto :goto_5

    :cond_6
    move v7, v2

    :goto_5
    sget-boolean v8, La/if;->d:Z

    new-instance v9, La/if$b;

    invoke-direct {v9, v6, v5, v7, v8}, La/if$b;-><init>(Ljava/lang/String;ZZZ)V

    if-eqz v1, :cond_7

    iget-object v5, v1, La/kf;->a:Ljava/lang/String;

    if-eqz v5, :cond_7

    sget-object v6, La/if;->a:La/if;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, v5}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    if-eqz v5, :cond_7

    move v5, v0

    goto :goto_6

    :cond_7
    move v5, v2

    :goto_6
    const-string v6, "L2"

    invoke-virtual {v4, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    if-eqz v7, :cond_8

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    goto :goto_7

    :cond_8
    move v7, v2

    :goto_7
    sget-boolean v8, La/if;->e:Z

    new-instance v10, La/if$b;

    invoke-direct {v10, v6, v5, v7, v8}, La/if$b;-><init>(Ljava/lang/String;ZZZ)V

    if-eqz v1, :cond_9

    iget-object v1, v1, La/kf;->d:Ljava/lang/String;

    if-eqz v1, :cond_9

    sget-object v5, La/if;->a:La/if;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    if-eqz p0, :cond_9

    move p0, v0

    goto :goto_8

    :cond_9
    move p0, v2

    :goto_8
    const-string v1, "L3"

    invoke-virtual {v4, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    goto :goto_9

    :cond_a
    move v4, v2

    :goto_9
    sget v5, La/if;->f:I

    if-lez v5, :cond_b

    move v5, v0

    goto :goto_a

    :cond_b
    move v5, v2

    :goto_a
    new-instance v6, La/if$b;

    invoke-direct {v6, v1, p0, v4, v5}, La/if$b;-><init>(Ljava/lang/String;ZZZ)V

    filled-new-array {v3, v9, v10, v6}, [La/if$b;

    move-result-object p0

    invoke-static {p0}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    :goto_b
    if-eqz p1, :cond_c

    const-string p1, "patch"

    goto :goto_c

    :cond_c
    const-string p1, "main"

    :goto_c
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[BlockHotUpdate] diagnose ("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " process) layers="

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V

    sget-boolean p1, La/n6;->a:Z

    new-instance p1, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_d
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/if$b;

    new-instance v3, La/n6$a;

    iget-object v4, v1, La/if$b;->a:Ljava/lang/String;

    iget-boolean v5, v1, La/if$b;->b:Z

    iget-boolean v6, v1, La/if$b;->c:Z

    iget-boolean v1, v1, La/if$b;->d:Z

    invoke-direct {v3, v4, v5, v6, v1}, La/n6$a;-><init>(Ljava/lang/String;ZZZ)V

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_d
    sput-object p1, La/n6;->e:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    const/4 v1, 0x0

    if-eqz p0, :cond_e

    move v3, v2

    goto :goto_f

    :cond_e
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    move v3, v2

    :cond_f
    :goto_e
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/n6$a;

    iget-boolean v4, v4, La/n6$a;->c:Z

    if-eqz v4, :cond_f

    add-int/2addr v3, v0

    if-ltz v3, :cond_10

    goto :goto_e

    :cond_10
    invoke-static {}, La/o3;->f0()V

    throw v1

    :cond_11
    :goto_f
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_12

    goto :goto_11

    :cond_12
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_13
    :goto_10
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/n6$a;

    iget-boolean v5, v4, La/n6$a;->b:Z

    if-eqz v5, :cond_13

    iget-boolean v4, v4, La/n6$a;->c:Z

    if-nez v4, :cond_13

    add-int/2addr v2, v0

    if-ltz v2, :cond_14

    goto :goto_10

    :cond_14
    invoke-static {}, La/o3;->f0()V

    throw v1

    :cond_15
    :goto_11
    const-string p0, "OK"

    const-string v0, "FAIL"

    if-lez v2, :cond_16

    const-string v1, "WARN"

    goto :goto_12

    :cond_16
    if-nez v3, :cond_17

    move-object v1, v0

    goto :goto_12

    :cond_17
    move-object v1, p0

    :goto_12
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[DIAG-HEALTH] module=TinkerFixLayers status="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ok="

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " fail="

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " total="

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_13
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/n6$a;

    iget-boolean v2, v1, La/n6$a;->b:Z

    if-nez v2, :cond_18

    const-string v3, "CLASS_MISSING"

    goto :goto_14

    :cond_18
    iget-boolean v3, v1, La/n6$a;->c:Z

    if-nez v3, :cond_19

    const-string v3, "NOT_HOOKED"

    goto :goto_14

    :cond_19
    iget-boolean v3, v1, La/n6$a;->d:Z

    if-eqz v3, :cond_1a

    const-string v3, "BLOCKED"

    goto :goto_14

    :cond_1a
    const-string v3, "HOOKED_IDLE"

    :goto_14
    iget-object v4, v1, La/n6$a;->a:Ljava/lang/String;

    iget-boolean v5, v1, La/n6$a;->c:Z

    iget-boolean v1, v1, La/n6$a;->d:Z

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "[DIAG-HEALTH]   layer="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " classExists="

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " hooked="

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " blocked="

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " state="

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    goto :goto_13

    :cond_1b
    const-string p1, "[DIAG-HEALTH]   note=nonTinkerChannel(NOT_COVERED) reason=\u4ec5\u8986\u76d6 Tinker / LegacyTinkerCore \u70ed\u66f4\u65b0\u901a\u9053"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V

    sget-boolean p1, La/n6;->a:Z

    sget-boolean p1, La/if;->i:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    sput-object v1, La/n6;->f:Ljava/lang/Boolean;

    if-eqz p1, :cond_1c

    goto :goto_15

    :cond_1c
    move-object p0, v0

    :goto_15
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[DIAG-HEALTH] module=TinkerFixTiming status="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " registeredBeforeTryLoad="

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, " note=\u62e6\u622a\u5c42\u5df2\u5728\u9996\u6b21 tryLoad \u524d\u540c\u6b65\u6ce8\u518c\uff08onPackageReady\uff09"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->b([Ljava/lang/Object;)V

    return-void
.end method

.method public static c()V
    .locals 3

    invoke-static {}, La/if;->g()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, La/if;->j:La/kf;

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    sget-object v0, La/w1;->l:Lorg/luckypray/dexkit/DexKitBridge;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, La/l0;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, La/l0;-><init>(I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    const-string v1, "TinkerSymbolLocate"

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_2
    return-void
.end method

.method public static d(La/J8;)V
    .locals 13

    const/4 v0, 0x2

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x1

    sput-boolean v3, La/if;->i:Z

    invoke-static {}, La/if;->g()Z

    move-result v4

    if-nez v4, :cond_0

    const-string p0, "[BlockHotUpdate] install skipped (isActive=false)"

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->b([Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-object v4, La/jf;->a:La/jf;

    sget-object v5, La/jf;->c:La/kf;

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "CACHE"

    sput-object v4, La/jf;->e:Ljava/lang/String;

    goto/16 :goto_b

    :cond_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La/w1;->p:Landroid/content/Context;

    const/4 v5, 0x0

    if-eqz v4, :cond_a

    sget-object v4, La/a5;->a:Ljava/lang/Object;

    if-eqz v4, :cond_3

    const-string v6, "tinker_symbols_v1"

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :cond_3
    :goto_0
    move-object v6, v5

    :goto_1
    if-nez v6, :cond_4

    :catch_1
    move-object v4, v5

    goto :goto_2

    :cond_4
    :try_start_1
    sget-object v4, La/kf;->m:La/kf$a;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6}, La/kf$a;->a(Lorg/json/JSONObject;)La/kf;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :goto_2
    if-eqz v4, :cond_a

    invoke-virtual {v4}, La/kf;->a()Z

    move-result v6

    if-eqz v6, :cond_a

    sget-object v6, La/jf;->a:La/jf;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-boolean v6, La/gh;->a:Z

    sget-object v6, La/w1;->p:Landroid/content/Context;

    const-wide/16 v7, 0x0

    if-nez v6, :cond_5

    :catchall_0
    move-wide v9, v7

    goto :goto_3

    :cond_5
    :try_start_2
    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v9

    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9, v6, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v6

    iget v6, v6, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    int-to-long v9, v6

    :goto_3
    cmp-long v6, v9, v7

    if-gtz v6, :cond_6

    :goto_4
    move v6, v3

    goto :goto_6

    :cond_6
    iget-wide v11, v4, La/kf;->l:J

    cmp-long v6, v11, v7

    if-gtz v6, :cond_7

    goto :goto_4

    :cond_7
    cmp-long v6, v9, v11

    if-nez v6, :cond_8

    move v6, v3

    goto :goto_5

    :cond_8
    move v6, v2

    :goto_5
    if-nez v6, :cond_9

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "[TinkerLocator] cache version mismatch: cached="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, " current="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, La/x1;->e([Ljava/lang/Object;)V

    :cond_9
    :goto_6
    if-eqz v6, :cond_a

    sput-object v4, La/jf;->c:La/kf;

    const-string v5, "SP"

    sput-object v5, La/jf;->e:Ljava/lang/String;

    move-object v5, v4

    goto/16 :goto_b

    :cond_a
    const-string v4, "[TinkerLocator] file cache hit: "

    :try_start_3
    invoke-static {}, La/jf;->a()Ljava/io/File;

    move-result-object v6

    invoke-virtual {v6}, Ljava/io/File;->isFile()Z

    move-result v7

    if-nez v7, :cond_b

    :goto_7
    move-object v6, v5

    goto :goto_9

    :cond_b
    new-instance v7, Lorg/json/JSONObject;

    invoke-static {v6}, La/w1;->T(Ljava/io/File;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v7, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    sget-object v6, La/kf;->m:La/kf$a;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7}, La/kf$a;->a(Lorg/json/JSONObject;)La/kf;

    move-result-object v6

    invoke-virtual {v6}, La/kf;->a()Z

    move-result v7

    if-nez v7, :cond_c

    const-string v4, "[TinkerLocator] file cache incomplete, ignore"

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, La/x1;->e([Ljava/lang/Object;)V

    goto :goto_7

    :catchall_1
    move-exception v4

    goto :goto_8

    :cond_c
    iget-object v7, v6, La/kf;->a:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, La/x1;->b([Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_9

    :goto_8
    const-string v6, "[TinkerLocator] loadFromFile failed"

    filled-new-array {v6, v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, La/x1;->e([Ljava/lang/Object;)V

    goto :goto_7

    :goto_9
    if-eqz v6, :cond_d

    invoke-virtual {v6}, La/kf;->a()Z

    move-result v4

    if-eqz v4, :cond_d

    sput-object v6, La/jf;->c:La/kf;

    const-string v4, "FILE"

    sput-object v4, La/jf;->e:Ljava/lang/String;

    move-object v5, v6

    goto :goto_b

    :cond_d
    sget-object v4, La/w1;->l:Lorg/luckypray/dexkit/DexKitBridge;

    if-eqz v4, :cond_e

    move v4, v3

    goto :goto_a

    :cond_e
    move v4, v2

    :goto_a
    if-nez v4, :cond_f

    const-string v4, "NONE"

    sput-object v4, La/jf;->e:Ljava/lang/String;

    goto :goto_b

    :cond_f
    invoke-static {}, La/jf;->b()La/kf;

    move-result-object v5

    :goto_b
    if-nez v5, :cond_11

    sget-object p0, La/jf;->a:La/jf;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-boolean p0, La/jf;->d:Z

    if-eqz p0, :cond_10

    const-string p0, "LOCATE_FAILED"

    sput-object p0, La/if;->b:Ljava/lang/String;

    goto :goto_c

    :cond_10
    const-string p0, "CACHE_MISS"

    sput-object p0, La/if;->b:Ljava/lang/String;

    :goto_c
    sget-object p0, La/if;->b:Ljava/lang/String;

    const-string v0, "[BlockHotUpdate] install FAILED: symbols not located (state="

    const-string v1, ") \u2014 \u672c\u6b21\u4f1a\u8bdd\u4e0d\u62e6\u622a\uff0cDkBridge \u5c31\u7eea\u540e\u7531 ensureAsyncLocate \u8865\u4f4d\uff0c\u4e0b\u6b21\u542f\u52a8\u751f\u6548"

    invoke-static {v0, p0, v1}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->a([Ljava/lang/Object;)V

    goto/16 :goto_13

    :cond_11
    sget-object v4, La/jf;->a:La/jf;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La/jf;->e:Ljava/lang/String;

    const-string v6, "DEXKIT"

    invoke-static {v4, v6}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_12

    const-string v4, "LOCATE_OK"

    goto :goto_d

    :cond_12
    const-string v4, "CACHE_HIT"

    :goto_d
    sput-object v4, La/if;->b:Ljava/lang/String;

    sput-object v5, La/if;->j:La/kf;

    iget-object v4, v5, La/kf;->j:Ljava/util/List;

    sget-boolean v6, La/gh;->a:Z

    sget-object v6, La/gh;->b:Ljava/util/List;

    invoke-static {v6, v4}, La/t3;->q0(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v4

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v4, v7}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_13

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "toLowerCase(...)"

    invoke-static {v7, v8}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_13
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_14
    :goto_f
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_15

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_14

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_15
    new-instance v6, Ljava/util/LinkedHashSet;

    invoke-direct {v6, v4}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v6}, La/t3;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    sput-object v4, La/gh;->b:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const-string v6, "WechatPaths: tinker path segments injected (count="

    const-string v7, ")"

    invoke-static {v4, v6, v7}, La/z;->c(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, La/x1;->b([Ljava/lang/Object;)V

    iget-object v4, p0, La/J8;->b:Ljava/lang/String;

    const-string v6, ":patch"

    invoke-static {v4, v6}, La/Ae;->D(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_18

    sget-object v0, La/if;->b:Ljava/lang/String;

    const-string v2, "[BlockHotUpdate] install (patch process) -> L4 only, locateState="

    invoke-static {v2, v0}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    iget-object v0, v5, La/kf;->h:Ljava/lang/String;

    const-string v2, "L4"

    if-eqz v0, :cond_17

    iget-object v4, v5, La/kf;->i:Ljava/lang/String;

    if-nez v4, :cond_16

    goto :goto_10

    :cond_16
    const-class v3, Landroid/content/Intent;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    new-instance v5, La/hf;

    invoke-direct {v5, v1, v0, v4}, La/hf;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, v0, v4, v3, v5}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object p0

    invoke-static {p0}, La/w1;->K(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {v2, p0}, La/if;->i(Ljava/lang/String;Ljava/util/List;)V

    goto/16 :goto_13

    :cond_17
    :goto_10
    const-string p0, "[BlockHotUpdate] L4 skipped (patch service not located \u2014 wx<8.0.71 or structure changed)"

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->b([Ljava/lang/Object;)V

    sget-object p0, La/if;->h:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_13

    :cond_18
    sget-object v4, La/if;->b:Ljava/lang/String;

    const-string v6, "[BlockHotUpdate] install (main process) -> L0..L3, locateState="

    invoke-static {v6, v4}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, La/x1;->b([Ljava/lang/Object;)V

    new-array v4, v2, [Ljava/lang/Class;

    new-instance v6, La/kd;

    const/16 v7, 0x16

    invoke-direct {v6, v7}, La/kd;-><init>(I)V

    const-string v7, "mkdirs"

    const-string v8, "java.io.File"

    invoke-static {p0, v8, v7, v4, v6}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v4

    new-array v6, v2, [Ljava/lang/Class;

    new-instance v7, La/kd;

    const/16 v9, 0x17

    invoke-direct {v7, v9}, La/kd;-><init>(I)V

    const-string v9, "mkdir"

    invoke-static {p0, v8, v9, v6, v7}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v6

    new-array v7, v2, [Ljava/lang/Class;

    new-instance v9, La/kd;

    const/16 v10, 0x18

    invoke-direct {v9, v10}, La/kd;-><init>(I)V

    const-string v10, "createNewFile"

    invoke-static {p0, v8, v10, v7, v9}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v7

    const-class v8, Ljava/io/File;

    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v8, v9}, [Ljava/lang/Class;

    move-result-object v10

    new-instance v11, La/kd;

    const/16 v12, 0x19

    invoke-direct {v11, v12}, La/kd;-><init>(I)V

    invoke-static {p0, v10, v11}, La/J8;->c(La/J8;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v10

    const-class v11, Ljava/lang/String;

    filled-new-array {v11, v9}, [Ljava/lang/Class;

    move-result-object v9

    new-instance v11, La/kd;

    const/16 v12, 0x1a

    invoke-direct {v11, v12}, La/kd;-><init>(I)V

    invoke-static {p0, v9, v11}, La/J8;->c(La/J8;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v9

    const/4 v11, 0x5

    new-array v11, v11, [Lio/github/libxposed/api/XposedInterface$HookHandle;

    aput-object v4, v11, v2

    aput-object v6, v11, v3

    aput-object v7, v11, v0

    aput-object v10, v11, v1

    const/4 v1, 0x4

    aput-object v9, v11, v1

    invoke-static {v11}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v4, "L0"

    invoke-static {v4, v1}, La/if;->i(Ljava/lang/String;Ljava/util/List;)V

    iget-object v1, v5, La/kf;->f:Ljava/lang/String;

    const-string v4, "L1"

    if-nez v1, :cond_19

    const-string v1, "security class not located"

    invoke-static {v4, v1}, La/if;->j(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_11

    :cond_19
    iget-object v6, v5, La/kf;->g:Ljava/lang/String;

    if-nez v6, :cond_1a

    const-string v1, "security method not located"

    invoke-static {v4, v1}, La/if;->j(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_11

    :cond_1a
    filled-new-array {v8}, [Ljava/lang/Class;

    move-result-object v7

    new-instance v8, La/hf;

    invoke-direct {v8, v2, v1, v6}, La/hf;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, v1, v6, v7, v8}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v1

    invoke-static {v1}, La/w1;->K(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v4, v1}, La/if;->i(Ljava/lang/String;Ljava/util/List;)V

    :goto_11
    iget-object v1, v5, La/kf;->a:Ljava/lang/String;

    const-string v2, "L2"

    if-nez v1, :cond_1b

    const-string v0, "loader class not located"

    invoke-static {v2, v0}, La/if;->j(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_12

    :cond_1b
    iget-object v4, v5, La/kf;->b:Ljava/lang/String;

    if-nez v4, :cond_1c

    const-string v0, "loader method not located"

    invoke-static {v2, v0}, La/if;->j(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_12

    :cond_1c
    iget-object v6, v5, La/kf;->c:Ljava/lang/String;

    if-nez v6, :cond_1d

    const-string v0, "loader param type not located"

    invoke-static {v2, v0}, La/if;->j(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_12

    :cond_1d
    iget-object v7, p0, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-static {v7, v6}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    if-nez v7, :cond_1e

    const-string v0, "param class load failed: "

    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, La/if;->j(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_12

    :cond_1e
    filled-new-array {v7}, [Ljava/lang/Class;

    move-result-object v6

    new-instance v7, La/hf;

    invoke-direct {v7, v0, v1, v4}, La/hf;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, v1, v4, v6, v7}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v0

    invoke-static {v0}, La/w1;->K(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, La/if;->i(Ljava/lang/String;Ljava/util/List;)V

    :goto_12
    iget-object v0, v5, La/kf;->d:Ljava/lang/String;

    const-string v1, "L3"

    if-nez v0, :cond_1f

    const-string p0, "app class not located"

    invoke-static {v1, p0}, La/if;->j(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_13

    :cond_1f
    iget-object v2, v5, La/kf;->e:Ljava/lang/String;

    if-nez v2, :cond_20

    const-string p0, "app entry method not located"

    invoke-static {v1, p0}, La/if;->j(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_13

    :cond_20
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v4}, La/i9;->b(Ljava/lang/Object;)V

    const-class v5, Landroid/content/Context;

    filled-new-array {v5, v4, v4}, [Ljava/lang/Class;

    move-result-object v4

    new-instance v5, La/hf;

    invoke-direct {v5, v3, v0, v2}, La/hf;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, v0, v2, v4, v5}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object p0

    invoke-static {p0}, La/w1;->K(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {v1, p0}, La/if;->i(Ljava/lang/String;Ljava/util/List;)V

    :goto_13
    return-void
.end method

.method public static e(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, La/if;->g()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/io/File;

    if-eqz v1, :cond_1

    check-cast v0, Ljava/io/File;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    :cond_2
    const-string v0, ""

    :cond_3
    invoke-static {v0}, La/gh;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    sget p0, La/if;->c:I

    const/4 v1, 0x1

    add-int/2addr p0, v1

    sput p0, La/if;->c:I

    const-string p0, "L0"

    invoke-static {p0, v0, v1}, La/if;->h(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string p0, "[BlockHotUpdate] L0 blocked file create: "

    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->b([Ljava/lang/Object;)V

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    :cond_4
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, La/if;->g()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v0

    const-string v1, "getArgs(...)"

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-static {v0, v2}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Ljava/io/File;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    check-cast v0, Ljava/io/File;

    goto :goto_0

    :cond_1
    move-object v0, v4

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    :cond_2
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_3

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    :cond_3
    if-nez v4, :cond_4

    const-string v0, ""

    goto :goto_1

    :cond_4
    move-object v0, v4

    :cond_5
    :goto_1
    invoke-static {v0}, La/gh;->c(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_6
    sget p0, La/if;->c:I

    const/4 v1, 0x1

    add-int/2addr p0, v1

    sput p0, La/if;->c:I

    const-string p0, "L0"

    invoke-static {p0, v0, v1}, La/if;->h(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string p0, "[BlockHotUpdate] L0 blocked FileOutputStream: "

    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->b([Ljava/lang/Object;)V

    new-instance p0, Ljava/io/FileNotFoundException;

    const-string v1, "blocked by FloatingClouds: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static g()Z
    .locals 5

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, La/w1;->p:Landroid/content/Context;

    if-eqz v0, :cond_0

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    iget-boolean v0, v0, La/jc;->M:Z

    return v0

    :cond_0
    const/4 v0, 0x1

    :try_start_0
    invoke-static {}, La/gh;->b()Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    const-string v3, "shared_prefs"

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v1, Ljava/io/File;

    const-string v3, "fc_options.xml"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v4

    :goto_0
    if-nez v1, :cond_4

    new-instance v1, Ljava/io/File;

    const-string v3, "fc_config.xml"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    move-object v1, v4

    :goto_1
    if-nez v1, :cond_4

    new-instance v1, Ljava/io/File;

    const-string v3, "mask_wechat_options.xml"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    move-object v1, v4

    :goto_2
    if-nez v1, :cond_4

    new-instance v1, Ljava/io/File;

    const-string v3, "mask_wechat_config.xml"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_3

    :catchall_0
    move-exception v1

    goto :goto_5

    :cond_4
    :goto_3
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_6

    :cond_5
    invoke-static {v1}, La/w1;->T(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "<boolean\\s+name=\"blockHotUpdate\"\\s+value=\"(true|false)\"\\s*/>"

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    const-string v3, "compile(...)"

    invoke-static {v2, v3}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    const-string v3, "matcher(...)"

    invoke-static {v2, v3}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/regex/Matcher;->find(I)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    new-instance v4, La/Z7;

    invoke-direct {v4, v2, v1}, La/Z7;-><init>(Ljava/util/regex/Matcher;Ljava/lang/String;)V

    :goto_4
    if-eqz v4, :cond_8

    iget-object v1, v4, La/Z7;->b:Ljava/lang/Object;

    check-cast v1, La/xa;

    if-nez v1, :cond_7

    new-instance v1, La/xa;

    invoke-direct {v1, v4}, La/xa;-><init>(La/Z7;)V

    iput-object v1, v4, La/Z7;->b:Ljava/lang/Object;

    :cond_7
    iget-object v1, v4, La/Z7;->b:Ljava/lang/Object;

    check-cast v1, La/xa;

    invoke-static {v1}, La/i9;->b(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, La/xa;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "true"

    invoke-static {v1, v2}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :goto_5
    const-string v2, "ConfigUtil: readBooleanOptionFromDisk fail for blockHotUpdate"

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->e([Ljava/lang/Object;)V

    :cond_8
    :goto_6
    return v0
.end method

.method public static h(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 6

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "|"

    const-string v3, "detail"

    invoke-static {p1, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v3, Ljava/io/File;

    invoke-static {}, La/gh;->b()Ljava/io/File;

    move-result-object v4

    const-string v5, "hotupdate_intercept_events.log"

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\n"

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object p1, La/V2;->a:Ljava/nio/charset/Charset;

    const-string p2, "text"

    invoke-static {p0, p2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "charset"

    invoke-static {p1, p2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Ljava/io/FileOutputStream;

    const/4 v0, 0x1

    invoke-direct {p2, v3, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    invoke-static {p2, p0, p1}, La/w1;->Y(Ljava/io/FileOutputStream;Ljava/lang/String;Ljava/nio/charset/Charset;)V

    sget-object p0, La/Wf;->a:La/Wf;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    return-void

    :catchall_0
    move-exception p0

    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-static {p2, p0}, La/w1;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/util/List;)V
    .locals 3

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/github/libxposed/api/XposedInterface$HookHandle;

    if-eqz v0, :cond_1

    move v2, v1

    :cond_2
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    sget-object v0, La/if;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "[BlockHotUpdate] "

    if-eqz v2, :cond_3

    const-string v0, " OK (hooked)"

    invoke-static {p1, p0, v0}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->b([Ljava/lang/Object;)V

    return-void

    :cond_3
    const-string v0, " FAILED (method not found)"

    invoke-static {p1, p0, v0}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->a([Ljava/lang/Object;)V

    return-void
.end method

.method public static j(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, La/if;->h:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[BlockHotUpdate] "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " FAILED (reason="

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x1

    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->a([Ljava/lang/Object;)V

    return-void
.end method
