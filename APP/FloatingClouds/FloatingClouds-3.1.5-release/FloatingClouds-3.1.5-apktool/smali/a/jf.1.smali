.class public final La/jf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/jf;

.field public static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static volatile c:La/kf;

.field public static volatile d:Z

.field public static volatile e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, La/jf;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/jf;->a:La/jf;

    const-string v7, "tinker_patch"

    const-string v8, "hotpatch"

    const-string v1, "tinker"

    const-string v2, "tinker_temp"

    const-string v3, "tinker_server"

    const-string v4, "patch-"

    const-string v5, "wc_tinker_dir"

    const-string v6, "app_tinker"

    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, La/jf;->b:Ljava/util/List;

    const-string v0, "NONE"

    sput-object v0, La/jf;->e:Ljava/lang/String;

    return-void
.end method

.method public static a()Ljava/io/File;
    .locals 4

    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/io/File;

    invoke-static {}, La/gh;->b()Ljava/io/File;

    move-result-object v2

    const-string v3, "shared_prefs"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const-string v2, "tinker_symbols_v1.json"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static b()La/kf;
    .locals 5

    sget-boolean v0, La/jf;->d:Z

    if-eqz v0, :cond_0

    sget-object v0, La/jf;->c:La/kf;

    return-object v0

    :cond_0
    :try_start_0
    invoke-static {}, La/jf;->c()La/kf;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_0
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "[TinkerLocator] locateNow failed"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    move-object v0, v2

    :goto_1
    check-cast v0, La/kf;

    if-nez v0, :cond_2

    const/4 v0, 0x1

    sput-boolean v0, La/jf;->d:Z

    return-object v2

    :cond_2
    sput-object v0, La/jf;->c:La/kf;

    const-string v1, "DEXKIT"

    sput-object v1, La/jf;->e:Ljava/lang/String;

    :try_start_1
    invoke-static {}, La/jf;->a()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_3

    :catchall_1
    move-exception v1

    goto :goto_2

    :cond_4
    invoke-static {}, La/jf;->a()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0}, La/kf;->b()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "toString(...)"

    invoke-static {v2, v3}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, La/V2;->a:Ljava/nio/charset/Charset;

    const-string v4, "charset"

    invoke-static {v3, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v4, v2, v3}, La/w1;->Y(Ljava/io/FileOutputStream;Ljava/lang/String;Ljava/nio/charset/Charset;)V

    sget-object v1, La/Wf;->a:La/Wf;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_2
    move-exception v1

    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :catchall_3
    move-exception v2

    :try_start_5
    invoke-static {v4, v1}, La/w1;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_2
    const-string v2, "[TinkerLocator] saveToFile failed"

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->e([Ljava/lang/Object;)V

    :goto_3
    sget-object v1, La/w1;->p:Landroid/content/Context;

    if-eqz v1, :cond_5

    :try_start_6
    invoke-static {v0}, La/a5;->i(La/kf;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_4

    :catchall_4
    move-exception v1

    const-string v2, "[TinkerLocator] saveToSp failed"

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->e([Ljava/lang/Object;)V

    :cond_5
    :goto_4
    return-object v0
.end method

.method public static c()La/kf;
    .locals 24

    const/4 v0, 0x1

    const-string v1, "tryLoad test test"

    const/4 v2, 0x0

    const-string v3, "android.content.Intent"

    const/4 v4, 0x5

    invoke-static {v2, v3, v2, v1, v4}, La/w1;->x(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, La/lb;

    iget-object v6, v6, La/lb;->f:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ne v6, v0, :cond_0

    goto :goto_0

    :cond_1
    move-object v5, v2

    :goto_0
    check-cast v5, La/lb;

    const/16 v1, 0x9

    if-eqz v5, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v5, "tryLoad"

    invoke-static {v2, v3, v2, v5, v4}, La/w1;->x(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, La/lb;

    iget-object v7, v7, La/lb;->f:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ne v7, v0, :cond_3

    goto :goto_1

    :cond_4
    move-object v6, v2

    :goto_1
    move-object v5, v6

    check-cast v5, La/lb;

    if-eqz v5, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {v2}, La/w1;->K(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v2, v3, v5, v2, v1}, La/w1;->x(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, La/lb;

    invoke-virtual {v7}, La/lb;->b()La/f5;

    move-result-object v8

    iget-object v8, v8, La/f5;->a:Ljava/lang/String;

    const-string v9, "Tinker"

    invoke-static {v8, v9, v0}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-virtual {v7}, La/lb;->b()La/f5;

    move-result-object v7

    iget-object v7, v7, La/f5;->a:Ljava/lang/String;

    const-string v8, "Loader"

    invoke-static {v7, v8, v0}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v7

    if-eqz v7, :cond_6

    goto :goto_2

    :cond_7
    move-object v6, v2

    :goto_2
    move-object v5, v6

    check-cast v5, La/lb;

    if-eqz v5, :cond_8

    goto :goto_3

    :cond_8
    const-string v5, "[TinkerLocator] R1 FAILED: tryLoad not located (no fallback)"

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, La/x1;->e([Ljava/lang/Object;)V

    move-object v5, v2

    :goto_3
    if-nez v5, :cond_9

    return-object v2

    :cond_9
    invoke-virtual {v5}, La/lb;->b()La/f5;

    move-result-object v6

    iget-object v8, v6, La/f5;->a:Ljava/lang/String;

    invoke-virtual {v5}, La/lb;->b()La/f5;

    move-result-object v6

    iget-object v9, v6, La/f5;->b:Ljava/lang/String;

    invoke-virtual {v5}, La/lb;->b()La/f5;

    move-result-object v6

    iget-object v6, v6, La/f5;->c:Ljava/util/ArrayList;

    invoke-static {v6}, La/t3;->n0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Ljava/lang/String;

    const-string v6, "."

    if-nez v10, :cond_a

    invoke-virtual {v5}, La/lb;->b()La/f5;

    move-result-object v0

    iget-object v0, v0, La/f5;->a:Ljava/lang/String;

    invoke-virtual {v5}, La/lb;->b()La/f5;

    move-result-object v1

    iget-object v1, v1, La/f5;->b:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[TinkerLocator] R2 failed: tryLoad("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ") has no param type"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    return-object v2

    :cond_a
    const-string v7, "long"

    const-string v11, "android.content.Context"

    filled-new-array {v11, v7, v7}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const/16 v12, 0x8

    const-string v13, "void"

    invoke-static {v10, v13, v7, v2, v12}, La/w1;->x(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, La/t3;->n0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La/lb;

    const/16 v12, 0xe

    const/4 v14, 0x3

    if-eqz v7, :cond_b

    :goto_4
    move-object v1, v7

    goto :goto_7

    :cond_b
    invoke-static {v10, v2, v2, v2, v12}, La/w1;->x(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_d

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    move-object v12, v15

    check-cast v12, La/lb;

    iget v1, v12, La/lb;->c:I

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {v12}, La/lb;->b()La/f5;

    move-result-object v1

    iget-object v1, v1, La/f5;->d:Ljava/lang/String;

    invoke-static {v1, v13}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    iget-object v1, v12, La/lb;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v1, v14, :cond_c

    invoke-virtual {v12}, La/lb;->b()La/f5;

    move-result-object v1

    iget-object v1, v1, La/f5;->c:Ljava/util/ArrayList;

    invoke-static {v1}, La/t3;->n0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v11}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    const/16 v1, 0x9

    const/16 v12, 0xe

    goto :goto_5

    :cond_d
    move-object v15, v2

    :goto_6
    move-object v7, v15

    check-cast v7, La/lb;

    if-eqz v7, :cond_e

    goto :goto_4

    :cond_e
    const-string v1, "[TinkerLocator] R3 FAILED: onBaseContextAttached not located in "

    invoke-virtual {v1, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->e([Ljava/lang/Object;)V

    move-object v1, v2

    :goto_7
    const-string v7, "Tinker.SecurityCheck"

    const-string v11, "boolean"

    invoke-static {v2, v11, v2, v7, v4}, La/w1;->x(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const-string v12, "java.io.File"

    if-eqz v7, :cond_10

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v15, v7

    check-cast v15, La/lb;

    iget-object v14, v15, La/lb;->f:Ljava/util/ArrayList;

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v14

    if-ne v14, v0, :cond_f

    invoke-virtual {v15}, La/lb;->b()La/f5;

    move-result-object v14

    iget-object v14, v14, La/f5;->c:Ljava/util/ArrayList;

    invoke-static {v14}, La/t3;->n0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v14

    invoke-static {v14, v12}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_f

    goto :goto_9

    :cond_f
    const/4 v14, 0x3

    goto :goto_8

    :cond_10
    move-object v7, v2

    :goto_9
    check-cast v7, La/lb;

    if-eqz v7, :cond_11

    :goto_a
    move-object v4, v7

    goto :goto_b

    :cond_11
    invoke-static {v12}, La/w1;->K(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/16 v7, 0x9

    invoke-static {v2, v11, v4, v2, v7}, La/w1;->x(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, La/t3;->n0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, La/lb;

    if-eqz v7, :cond_12

    goto :goto_a

    :cond_12
    const-string v4, "[TinkerLocator] R4 FAILED: verifyPatchMetaSignature not located"

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, La/x1;->e([Ljava/lang/Object;)V

    move-object v4, v2

    :goto_b
    new-instance v7, Ljava/util/LinkedHashSet;

    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    const-string v11, "patch-"

    const-string v12, "LegacyTinkerCore"

    filled-new-array {v11, v12}, [Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, La/w1;->s([Ljava/lang/String;)Ljava/util/List;

    move-result-object v14

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_c
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    const-string v0, "$PatchService"

    if-eqz v17, :cond_14

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v23, v1

    move-object v1, v2

    check-cast v1, Ljava/lang/String;

    invoke-static {v1, v0}, La/Ae;->D(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    move-object/from16 v1, v23

    const/4 v0, 0x1

    const/4 v2, 0x0

    goto :goto_c

    :cond_14
    move-object/from16 v23, v1

    invoke-virtual {v7, v15}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v7}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_17

    filled-new-array {v11}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, La/w1;->s([Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_15
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_16

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v14, v11

    check-cast v14, Ljava/lang/String;

    invoke-static {v14, v0}, La/Ae;->D(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_15

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_16
    invoke-virtual {v7, v2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    :cond_17
    invoke-virtual {v7}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1a

    filled-new-array {v12}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, La/w1;->s([Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_18
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_19

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Ljava/lang/String;

    invoke-static {v12, v0}, La/Ae;->D(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_18

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_19
    invoke-virtual {v7, v2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    :cond_1a
    invoke-virtual {v7}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "iterator(...)"

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_23

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    const/16 v11, 0xe

    invoke-static {v1, v2, v2, v2, v11}, La/w1;->x(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_1d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, La/lb;

    iget v11, v15, La/lb;->c:I

    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v11

    if-eqz v11, :cond_1b

    invoke-virtual {v15}, La/lb;->b()La/f5;

    move-result-object v11

    iget-object v11, v11, La/f5;->d:Ljava/lang/String;

    invoke-static {v11, v13}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1b

    iget-object v11, v15, La/lb;->f:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    move-object/from16 v17, v0

    const/4 v0, 0x1

    if-ne v11, v0, :cond_1c

    invoke-virtual {v15}, La/lb;->b()La/f5;

    move-result-object v0

    iget-object v0, v0, La/f5;->c:Ljava/util/ArrayList;

    invoke-static {v0}, La/t3;->n0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v3}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    move-object v2, v14

    goto :goto_11

    :cond_1b
    move-object/from16 v17, v0

    :cond_1c
    move-object/from16 v0, v17

    const/16 v11, 0xe

    goto :goto_10

    :cond_1d
    move-object/from16 v17, v0

    const/4 v2, 0x0

    :goto_11
    check-cast v2, La/lb;

    if-eqz v2, :cond_1e

    invoke-virtual {v2}, La/lb;->b()La/f5;

    move-result-object v0

    iget-object v2, v0, La/f5;->b:Ljava/lang/String;

    goto :goto_13

    :cond_1e
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_20

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, La/lb;

    iget v12, v11, La/lb;->c:I

    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v12

    if-eqz v12, :cond_1f

    iget-object v12, v11, La/lb;->f:Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v12

    const/4 v14, 0x3

    if-ne v12, v14, :cond_1f

    invoke-virtual {v11}, La/lb;->b()La/f5;

    move-result-object v11

    iget-object v11, v11, La/f5;->c:Ljava/util/ArrayList;

    invoke-static {v11}, La/t3;->n0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11, v3}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1f

    goto :goto_12

    :cond_20
    const/4 v2, 0x0

    :goto_12
    check-cast v2, La/lb;

    if-eqz v2, :cond_21

    invoke-virtual {v2}, La/lb;->b()La/f5;

    move-result-object v0

    iget-object v2, v0, La/f5;->b:Ljava/lang/String;

    goto :goto_13

    :cond_21
    const/4 v2, 0x0

    :goto_13
    if-nez v2, :cond_22

    move-object/from16 v0, v17

    goto/16 :goto_f

    :cond_22
    new-instance v0, La/mc;

    invoke-direct {v0, v1, v2}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v2, v0

    goto :goto_14

    :cond_23
    const/4 v14, 0x3

    invoke-static {v14, v7}, La/t3;->s0(ILjava/util/Collection;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "[TinkerLocator] R5: patch service not located (wx<8.0.71 or structure changed) candidates="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    const/4 v2, 0x0

    :goto_14
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v1, La/jf;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_24
    :goto_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_25

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/4 v7, 0x0

    invoke-static {v3, v7}, La/w1;->r(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_24

    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_15

    :cond_25
    const/4 v7, 0x0

    iget-object v1, v5, La/lb;->h:La/Me;

    invoke-virtual {v1}, La/Me;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_26

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_16

    :cond_26
    if-eqz v4, :cond_27

    iget-object v1, v4, La/lb;->h:La/Me;

    invoke-virtual {v1}, La/Me;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_27

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_27

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_17

    :cond_27
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_18
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v11, 0x0

    if-eqz v5, :cond_2d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v12, v5

    check-cast v12, Ljava/lang/String;

    const-string v13, "s"

    invoke-static {v12, v13}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v13

    const/4 v14, 0x3

    if-gt v14, v13, :cond_2c

    const/16 v15, 0x29

    if-ge v13, v15, :cond_2c

    move v13, v11

    :goto_19
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v15

    if-ge v13, v15, :cond_29

    invoke-virtual {v12, v13}, Ljava/lang/String;->charAt(I)C

    move-result v15

    invoke-static {v15}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v16

    if-nez v16, :cond_2c

    invoke-static {v15}, Ljava/lang/Character;->isSpaceChar(C)Z

    move-result v15

    if-eqz v15, :cond_28

    goto :goto_1b

    :cond_28
    const/16 v19, 0x1

    add-int/lit8 v13, v13, 0x1

    goto :goto_19

    :cond_29
    const/16 v13, 0x2f

    invoke-static {v12, v13}, La/Be;->J(Ljava/lang/String;C)Z

    move-result v13

    if-nez v13, :cond_2a

    const/16 v13, 0x5c

    invoke-static {v12, v13}, La/Be;->J(Ljava/lang/String;C)Z

    move-result v13

    if-nez v13, :cond_2a

    const/16 v13, 0x5f

    invoke-static {v12, v13}, La/Be;->J(Ljava/lang/String;C)Z

    move-result v13

    if-nez v13, :cond_2a

    const/16 v13, 0x2d

    invoke-static {v12, v13}, La/Be;->J(Ljava/lang/String;C)Z

    move-result v13

    if-eqz v13, :cond_2c

    :cond_2a
    :goto_1a
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v13

    if-ge v11, v13, :cond_2c

    invoke-virtual {v12, v11}, Ljava/lang/String;->charAt(I)C

    move-result v13

    invoke-static {v13}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    move-result v13

    if-nez v13, :cond_2b

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_18

    :cond_2b
    const/16 v19, 0x1

    add-int/lit8 v11, v11, 0x1

    goto :goto_1a

    :cond_2c
    :goto_1b
    const/16 v19, 0x1

    goto :goto_18

    :cond_2d
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v3}, La/t3;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v12, "[TinkerLocator] R7: raw="

    invoke-direct {v5, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " pathSegments="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " segments="

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, La/x1;->b([Ljava/lang/Object;)V

    move-object/from16 v22, v7

    new-instance v7, La/kf;

    if-eqz v23, :cond_2e

    invoke-virtual/range {v23 .. v23}, La/lb;->b()La/f5;

    move-result-object v3

    iget-object v3, v3, La/f5;->b:Ljava/lang/String;

    move-object v12, v3

    goto :goto_1c

    :cond_2e
    move-object/from16 v12, v22

    :goto_1c
    if-eqz v4, :cond_2f

    invoke-virtual {v4}, La/lb;->b()La/f5;

    move-result-object v3

    iget-object v3, v3, La/f5;->a:Ljava/lang/String;

    move-object v13, v3

    goto :goto_1d

    :cond_2f
    move-object/from16 v13, v22

    :goto_1d
    if-eqz v4, :cond_30

    invoke-virtual {v4}, La/lb;->b()La/f5;

    move-result-object v3

    iget-object v3, v3, La/f5;->b:Ljava/lang/String;

    move-object v14, v3

    goto :goto_1e

    :cond_30
    move-object/from16 v14, v22

    :goto_1e
    if-eqz v2, :cond_31

    iget-object v3, v2, La/mc;->a:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    move-object v15, v3

    goto :goto_1f

    :cond_31
    move-object/from16 v15, v22

    :goto_1f
    if-eqz v2, :cond_32

    iget-object v3, v2, La/mc;->b:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    move-object/from16 v16, v3

    goto :goto_20

    :cond_32
    move-object/from16 v16, v22

    :goto_20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v18

    sget-boolean v3, La/gh;->a:Z

    sget-object v3, La/w1;->p:Landroid/content/Context;

    const-wide/16 v20, 0x0

    if-nez v3, :cond_33

    :catchall_0
    move-object v5, v4

    goto :goto_21

    :cond_33
    :try_start_0
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3, v11}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    iget v3, v3, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v5, v4

    int-to-long v3, v3

    move-wide/from16 v20, v3

    :goto_21
    move-object v11, v10

    move-object/from16 v17, v1

    invoke-direct/range {v7 .. v21}, La/kf;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JJ)V

    if-eqz v23, :cond_34

    invoke-virtual/range {v23 .. v23}, La/lb;->b()La/f5;

    move-result-object v1

    iget-object v1, v1, La/f5;->b:Ljava/lang/String;

    goto :goto_22

    :cond_34
    move-object/from16 v1, v22

    :goto_22
    if-eqz v5, :cond_35

    invoke-virtual {v5}, La/lb;->b()La/f5;

    move-result-object v3

    iget-object v3, v3, La/f5;->a:Ljava/lang/String;

    goto :goto_23

    :cond_35
    move-object/from16 v3, v22

    :goto_23
    if-eqz v5, :cond_36

    invoke-virtual {v5}, La/lb;->b()La/f5;

    move-result-object v4

    iget-object v4, v4, La/f5;->b:Ljava/lang/String;

    goto :goto_24

    :cond_36
    move-object/from16 v4, v22

    :goto_24
    if-eqz v2, :cond_37

    iget-object v5, v2, La/mc;->a:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    goto :goto_25

    :cond_37
    move-object/from16 v5, v22

    :goto_25
    if-eqz v2, :cond_38

    iget-object v2, v2, La/mc;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    goto :goto_26

    :cond_38
    move-object/from16 v2, v22

    :goto_26
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v11

    const-string v12, "[TinkerLocator] located: loader="

    const-string v13, " app="

    invoke-static {v12, v8, v6, v9, v13}, La/z;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " appEntry="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " security="

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " patchSvc="

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    return-object v7
.end method
