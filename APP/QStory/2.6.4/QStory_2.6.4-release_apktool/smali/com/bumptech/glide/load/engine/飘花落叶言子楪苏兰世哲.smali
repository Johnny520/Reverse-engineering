.class public final Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世兰苏哲:Ljava/lang/String;

.field public final 飘花落叶言子楪世哲兰苏:Landroidx/core/util/飘花落叶言子楪世哲苏兰;

.field public final 飘花落叶言子楪世哲苏兰:L飘花落叶言楪世哲苏子兰/飘花落叶言子楪世苏兰哲;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/List;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;L飘花落叶言楪世哲苏子兰/飘花落叶言子楪世苏兰哲;Landroidx/core/util/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p4, p0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 7
    .line 8
    iput-object p5, p0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪世哲苏子兰/飘花落叶言子楪世苏兰哲;

    .line 9
    .line 10
    iput-object p6, p0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:Landroidx/core/util/飘花落叶言子楪世哲苏兰;

    .line 11
    .line 12
    new-instance p4, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string p5, "Failed DecodePath{"

    .line 15
    .line 16
    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p1, "->"

    .line 27
    .line 28
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string p1, "}"

    .line 49
    .line 50
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "DecodePath{ dataClass="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", decoders="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", transcoder="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪世哲苏子兰/飘花落叶言子楪世苏兰哲;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 p0, 0x7d

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Lcom/bumptech/glide/load/data/飘花落叶言子楪世兰哲苏;IIL飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏世兰哲;Ljava/util/List;)Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v3, v1, :cond_3

    .line 10
    .line 11
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏哲世兰;

    .line 16
    .line 17
    :try_start_0
    invoke-interface {p1}, Lcom/bumptech/glide/load/data/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-interface {v4, v5, p4}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏世兰哲;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_1

    .line 26
    .line 27
    invoke-interface {p1}, Lcom/bumptech/glide/load/data/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-interface {v4, v5, p2, p3, p4}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;IIL飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏世兰哲;)Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;

    .line 32
    .line 33
    .line 34
    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    goto :goto_2

    .line 36
    :catch_0
    move-exception v5

    .line 37
    goto :goto_1

    .line 38
    :catch_1
    move-exception v5

    .line 39
    goto :goto_1

    .line 40
    :catch_2
    move-exception v5

    .line 41
    :goto_1
    const/4 v6, 0x2

    .line 42
    const-string v7, "DecodePath"

    .line 43
    .line 44
    invoke-static {v7, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_0

    .line 49
    .line 50
    new-instance v6, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v8, "Failed to decode data for "

    .line 53
    .line 54
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {v7, v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 65
    .line 66
    .line 67
    :cond_0
    invoke-interface {p5, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    :cond_1
    :goto_2
    if-eqz v2, :cond_2

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    :goto_3
    if-eqz v2, :cond_4

    .line 77
    .line 78
    return-object v2

    .line 79
    :cond_4
    new-instance p1, Lcom/bumptech/glide/load/engine/GlideException;

    .line 80
    .line 81
    new-instance p2, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-direct {p2, p5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 87
    .line 88
    invoke-direct {p1, p0, p2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 89
    .line 90
    .line 91
    throw p1
.end method

.method public final 飘花落叶言子楪世苏哲兰(IILcom/bumptech/glide/load/data/飘花落叶言子楪世兰哲苏;Lcom/bumptech/glide/load/engine/飘花落叶言子世楪兰哲苏;L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏世兰哲;)Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p4

    .line 4
    .line 5
    iget-object v7, v0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:Landroidx/core/util/飘花落叶言子楪世哲苏兰;

    .line 6
    .line 7
    invoke-interface {v7}, Landroidx/core/util/飘花落叶言子楪世哲苏兰;->acquire()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    move-object v5, v1

    .line 12
    check-cast v5, Ljava/util/List;

    .line 13
    .line 14
    const-string v1, "Argument must not be null"

    .line 15
    .line 16
    invoke-static {v5, v1}, L飘花落叶言楪世兰苏哲子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    move/from16 v2, p1

    .line 20
    .line 21
    move/from16 v3, p2

    .line 22
    .line 23
    move-object/from16 v1, p3

    .line 24
    .line 25
    move-object/from16 v4, p5

    .line 26
    .line 27
    :try_start_0
    invoke-virtual/range {v0 .. v5}, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Lcom/bumptech/glide/load/data/飘花落叶言子楪世兰哲苏;IIL飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏世兰哲;Ljava/util/List;)Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;

    .line 28
    .line 29
    .line 30
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    invoke-interface {v7, v5}, Landroidx/core/util/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    iget-object v2, v6, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:Lcom/bumptech/glide/load/engine/飘花落叶言子楪世兰苏哲;

    .line 35
    .line 36
    check-cast v2, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏哲兰世;

    .line 37
    .line 38
    iget-object v3, v6, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, Lcom/bumptech/glide/load/DataSource;

    .line 41
    .line 42
    iget-object v4, v2, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏世哲兰;

    .line 43
    .line 44
    invoke-interface {v1}, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v13

    .line 52
    sget-object v5, Lcom/bumptech/glide/load/DataSource;->RESOURCE_DISK_CACHE:Lcom/bumptech/glide/load/DataSource;

    .line 53
    .line 54
    if-eq v3, v5, :cond_0

    .line 55
    .line 56
    invoke-virtual {v4, v13}, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;)L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏兰世哲;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    iget-object v7, v2, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰哲世苏:Lcom/bumptech/glide/飘花落叶言子楪苏哲世兰;

    .line 61
    .line 62
    iget v8, v2, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪哲苏兰:I

    .line 63
    .line 64
    iget v9, v2, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪哲兰苏:I

    .line 65
    .line 66
    invoke-interface {v5, v7, v1, v8, v9}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;II)Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    move-object v12, v5

    .line 71
    move-object v5, v7

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    move-object v5, v1

    .line 74
    const/4 v12, 0x0

    .line 75
    :goto_0
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-nez v7, :cond_1

    .line 80
    .line 81
    invoke-interface {v1}, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;->recycle()V

    .line 82
    .line 83
    .line 84
    :cond_1
    iget-object v1, v4, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Lcom/bumptech/glide/飘花落叶言子楪苏哲世兰;

    .line 85
    .line 86
    invoke-virtual {v1}, Lcom/bumptech/glide/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()Lcom/bumptech/glide/飘花落叶言子楪苏兰世哲;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    iget-object v1, v1, Lcom/bumptech/glide/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;

    .line 91
    .line 92
    invoke-interface {v5}, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-virtual {v1, v7}, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Class;)L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏哲兰世;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    if-eqz v1, :cond_3

    .line 101
    .line 102
    iget-object v1, v4, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Lcom/bumptech/glide/飘花落叶言子楪苏哲世兰;

    .line 103
    .line 104
    invoke-virtual {v1}, Lcom/bumptech/glide/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()Lcom/bumptech/glide/飘花落叶言子楪苏兰世哲;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    iget-object v1, v1, Lcom/bumptech/glide/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;

    .line 109
    .line 110
    invoke-interface {v5}, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    invoke-virtual {v1, v7}, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Class;)L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏哲兰世;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    if-eqz v1, :cond_2

    .line 119
    .line 120
    iget-object v7, v2, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪兰哲苏:L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏世兰哲;

    .line 121
    .line 122
    invoke-interface {v1, v7}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲(L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏世兰哲;)Lcom/bumptech/glide/load/EncodeStrategy;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    goto :goto_1

    .line 127
    :cond_2
    new-instance v0, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;

    .line 128
    .line 129
    invoke-interface {v5}, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-direct {v0, v1}, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;-><init>(Ljava/lang/Class;)V

    .line 134
    .line 135
    .line 136
    throw v0

    .line 137
    :cond_3
    sget-object v7, Lcom/bumptech/glide/load/EncodeStrategy;->NONE:Lcom/bumptech/glide/load/EncodeStrategy;

    .line 138
    .line 139
    const/4 v1, 0x0

    .line 140
    :goto_1
    iget-object v8, v2, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲苏兰楪:L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;

    .line 141
    .line 142
    invoke-virtual {v4}, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲()Ljava/util/ArrayList;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    const/4 v15, 0x0

    .line 151
    move v11, v15

    .line 152
    :goto_2
    const/4 v14, 0x1

    .line 153
    if-ge v11, v10, :cond_5

    .line 154
    .line 155
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v16

    .line 159
    const/16 p1, 0x0

    .line 160
    .line 161
    move-object/from16 v6, v16

    .line 162
    .line 163
    check-cast v6, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪哲苏世兰;

    .line 164
    .line 165
    iget-object v6, v6, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;

    .line 166
    .line 167
    invoke-interface {v6, v8}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-eqz v6, :cond_4

    .line 172
    .line 173
    move v6, v14

    .line 174
    goto :goto_3

    .line 175
    :cond_4
    add-int/lit8 v11, v11, 0x1

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_5
    const/16 p1, 0x0

    .line 179
    .line 180
    move v6, v15

    .line 181
    :goto_3
    iget-object v8, v2, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪兰苏哲:Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰哲世;

    .line 182
    .line 183
    iget v8, v8, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:I

    .line 184
    .line 185
    packed-switch v8, :pswitch_data_0

    .line 186
    .line 187
    .line 188
    if-nez v6, :cond_6

    .line 189
    .line 190
    sget-object v6, Lcom/bumptech/glide/load/DataSource;->DATA_DISK_CACHE:Lcom/bumptech/glide/load/DataSource;

    .line 191
    .line 192
    if-eq v3, v6, :cond_7

    .line 193
    .line 194
    :cond_6
    sget-object v6, Lcom/bumptech/glide/load/DataSource;->LOCAL:Lcom/bumptech/glide/load/DataSource;

    .line 195
    .line 196
    if-ne v3, v6, :cond_8

    .line 197
    .line 198
    :cond_7
    sget-object v3, Lcom/bumptech/glide/load/EncodeStrategy;->TRANSFORMED:Lcom/bumptech/glide/load/EncodeStrategy;

    .line 199
    .line 200
    if-ne v7, v3, :cond_8

    .line 201
    .line 202
    move v3, v14

    .line 203
    goto :goto_4

    .line 204
    :cond_8
    :pswitch_0
    move v3, v15

    .line 205
    :goto_4
    if-eqz v3, :cond_c

    .line 206
    .line 207
    if-eqz v1, :cond_b

    .line 208
    .line 209
    sget-object v3, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:[I

    .line 210
    .line 211
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    aget v3, v3, v6

    .line 216
    .line 217
    if-eq v3, v14, :cond_a

    .line 218
    .line 219
    const/4 v6, 0x2

    .line 220
    if-ne v3, v6, :cond_9

    .line 221
    .line 222
    new-instance v6, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪哲兰苏;

    .line 223
    .line 224
    iget-object v3, v4, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Lcom/bumptech/glide/飘花落叶言子楪苏哲世兰;

    .line 225
    .line 226
    iget-object v7, v3, Lcom/bumptech/glide/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世兰哲苏;

    .line 227
    .line 228
    iget-object v8, v2, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲苏兰楪:L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;

    .line 229
    .line 230
    iget-object v9, v2, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰哲苏世:L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;

    .line 231
    .line 232
    iget v10, v2, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪哲苏兰:I

    .line 233
    .line 234
    iget v11, v2, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪哲兰苏:I

    .line 235
    .line 236
    move v3, v14

    .line 237
    iget-object v14, v2, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪兰哲苏:L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏世兰哲;

    .line 238
    .line 239
    invoke-direct/range {v6 .. v14}, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪哲兰苏;-><init>(Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世兰哲苏;L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;IIL飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏兰世哲;Ljava/lang/Class;L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏世兰哲;)V

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_9
    const-string v0, "Unknown strategy: "

    .line 244
    .line 245
    invoke-static {v7, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    return-object p1

    .line 249
    :cond_a
    move v3, v14

    .line 250
    new-instance v6, Lcom/bumptech/glide/load/engine/飘花落叶言子楪世哲兰苏;

    .line 251
    .line 252
    iget-object v4, v2, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲苏兰楪:L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;

    .line 253
    .line 254
    iget-object v7, v2, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰哲苏世:L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;

    .line 255
    .line 256
    invoke-direct {v6, v4, v7}, Lcom/bumptech/glide/load/engine/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;)V

    .line 257
    .line 258
    .line 259
    :goto_5
    sget-object v4, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪兰世哲苏:L飘花落叶言子苏世兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 260
    .line 261
    invoke-virtual {v4}, L飘花落叶言子苏世兰楪哲/飘花落叶言子楪苏兰世哲;->acquire()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    check-cast v4, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏哲兰;

    .line 266
    .line 267
    iput-boolean v15, v4, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 268
    .line 269
    iput-boolean v3, v4, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲兰苏世:Z

    .line 270
    .line 271
    iput-object v5, v4, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲兰世苏:Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;

    .line 272
    .line 273
    iget-object v2, v2, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 274
    .line 275
    iput-object v6, v2, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 276
    .line 277
    iput-object v1, v2, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 278
    .line 279
    iput-object v4, v2, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 280
    .line 281
    move-object v5, v4

    .line 282
    goto :goto_6

    .line 283
    :cond_b
    new-instance v0, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;

    .line 284
    .line 285
    invoke-interface {v5}, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;->get()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-direct {v0, v1}, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;-><init>(Ljava/lang/Class;)V

    .line 294
    .line 295
    .line 296
    throw v0

    .line 297
    :cond_c
    :goto_6
    iget-object v0, v0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪世哲苏子兰/飘花落叶言子楪世苏兰哲;

    .line 298
    .line 299
    move-object/from16 v4, p5

    .line 300
    .line 301
    invoke-interface {v0, v5, v4}, L飘花落叶言楪世哲苏子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏世兰哲;)Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    return-object v0

    .line 306
    :catchall_0
    move-exception v0

    .line 307
    invoke-interface {v7, v5}, Landroidx/core/util/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    throw v0

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
