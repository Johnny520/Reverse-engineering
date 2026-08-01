.class public final Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;
.super Lcom/google/protobuf/飘花落叶言世苏子哲楪兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言世哲子苏楪兰;


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:Lcom/google/protobuf/飘花落叶言世楪哲兰苏子;

.field public 飘花落叶言子楪兰世苏哲:Ljava/util/ArrayList;

.field public volatile 飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/MapField$StorageMode;

.field public 飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;

.field public volatile 飘花落叶言子楪哲苏兰世:Z


# direct methods
.method public constructor <init>(Lcom/google/protobuf/飘花落叶言世楪哲兰苏子;Lcom/google/protobuf/MapField$StorageMode;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪兰世哲苏:Lcom/google/protobuf/飘花落叶言世楪哲兰苏子;

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲苏兰世:Z

    .line 8
    .line 9
    iput-object p2, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/MapField$StorageMode;

    .line 10
    .line 11
    new-instance p1, Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;

    .line 12
    .line 13
    invoke-direct {p1, p0, p3}, Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;-><init>(Lcom/google/protobuf/飘花落叶言世哲子苏楪兰;Ljava/util/Map;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪兰世苏哲:Ljava/util/ArrayList;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;Lcom/google/protobuf/MapField$StorageMode;Ljava/util/Map;)V
    .locals 1

    .line 22
    new-instance v0, Lcom/google/protobuf/飘花落叶言世楪兰子苏哲;

    invoke-direct {v0, p1}, Lcom/google/protobuf/飘花落叶言世楪兰子苏哲;-><init>(Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;)V

    invoke-direct {p0, v0, p2, p3}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;-><init>(Lcom/google/protobuf/飘花落叶言世楪哲兰苏子;Lcom/google/protobuf/MapField$StorageMode;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世哲兰()Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世哲兰()Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p0, p1}, Lcom/google/protobuf/MapFieldLite;->equals(Ljava/util/Map;Ljava/util/Map;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪苏世哲兰()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/google/protobuf/MapFieldLite;->calculateHashCodeForMap(Ljava/util/Map;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final 飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p1, Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;->飘花落叶言子楪哲兰世苏:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;->entrySet()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lcom/google/protobuf/飘花落叶言世楪兰苏哲子;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言世楪兰苏哲子;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :goto_0
    move-object v1, p1

    .line 23
    check-cast v1, Lcom/google/protobuf/飘花落叶言世楪兰苏子哲;

    .line 24
    .line 25
    iget-object v1, v1, Lcom/google/protobuf/飘花落叶言世楪兰苏子哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Ljava/util/Iterator;

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ljava/util/Map$Entry;

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-object v3, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪兰世哲苏:Lcom/google/protobuf/飘花落叶言世楪哲兰苏子;

    .line 50
    .line 51
    check-cast v3, Lcom/google/protobuf/飘花落叶言世楪兰子苏哲;

    .line 52
    .line 53
    iget-object v3, v3, Lcom/google/protobuf/飘花落叶言世楪兰子苏哲;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 54
    .line 55
    invoke-virtual {v3}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->newBuilderForType()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3, v2}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;->setKey(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v2, v1}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;->setValue(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    return-object v0
.end method

.method public final 飘花落叶言子楪世兰苏哲(Ljava/util/ArrayList;)Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-double v0, v0

    .line 6
    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    .line 7
    .line 8
    div-double/2addr v0, v2

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    double-to-int v0, v0

    .line 14
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 34
    .line 35
    iget-object v2, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪兰世哲苏:Lcom/google/protobuf/飘花落叶言世楪哲兰苏子;

    .line 36
    .line 37
    check-cast v2, Lcom/google/protobuf/飘花落叶言世楪兰子苏哲;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    check-cast v0, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->getKey()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    new-instance p1, Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;

    .line 57
    .line 58
    invoke-direct {p1, p0, v1}, Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;-><init>(Lcom/google/protobuf/飘花落叶言世哲子苏楪兰;Ljava/util/Map;)V

    .line 59
    .line 60
    .line 61
    return-object p1
.end method

.method public final 飘花落叶言子楪世哲兰苏()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/MapField$StorageMode;

    .line 2
    .line 3
    sget-object v1, Lcom/google/protobuf/MapField$StorageMode;->LIST:Lcom/google/protobuf/MapField$StorageMode;

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/MapField$StorageMode;

    .line 8
    .line 9
    sget-object v2, Lcom/google/protobuf/MapField$StorageMode;->MAP:Lcom/google/protobuf/MapField$StorageMode;

    .line 10
    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪兰世苏哲:Ljava/util/ArrayList;

    .line 20
    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;

    .line 23
    .line 24
    iput-object v1, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/MapField$StorageMode;

    .line 25
    .line 26
    :cond_1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪兰世苏哲:Ljava/util/ArrayList;

    .line 27
    .line 28
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰()V
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲苏兰世:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪兰世哲苏:Lcom/google/protobuf/飘花落叶言世楪哲兰苏子;

    .line 2
    .line 3
    check-cast p0, Lcom/google/protobuf/飘花落叶言世楪兰子苏哲;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪兰子苏哲;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 6
    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/MapField$StorageMode;

    .line 2
    .line 3
    sget-object v1, Lcom/google/protobuf/MapField$StorageMode;->MAP:Lcom/google/protobuf/MapField$StorageMode;

    .line 4
    .line 5
    if-ne v0, v1, :cond_1

    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/MapField$StorageMode;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;)Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪兰世苏哲:Ljava/util/ArrayList;

    .line 19
    .line 20
    sget-object v0, Lcom/google/protobuf/MapField$StorageMode;->BOTH:Lcom/google/protobuf/MapField$StorageMode;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/MapField$StorageMode;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    monitor-exit p0

    .line 28
    goto :goto_2

    .line 29
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw v0

    .line 31
    :cond_1
    :goto_2
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪兰世苏哲:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世兰哲()Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/MapField$StorageMode;

    .line 2
    .line 3
    sget-object v1, Lcom/google/protobuf/MapField$StorageMode;->MAP:Lcom/google/protobuf/MapField$StorageMode;

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/MapField$StorageMode;

    .line 8
    .line 9
    sget-object v2, Lcom/google/protobuf/MapField$StorageMode;->LIST:Lcom/google/protobuf/MapField$StorageMode;

    .line 10
    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪兰世苏哲:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪世兰苏哲(Ljava/util/ArrayList;)Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;

    .line 20
    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪兰世苏哲:Ljava/util/ArrayList;

    .line 23
    .line 24
    iput-object v1, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/MapField$StorageMode;

    .line 25
    .line 26
    :cond_1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;

    .line 27
    .line 28
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰()Ljava/util/Map;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/MapField$StorageMode;

    .line 2
    .line 3
    sget-object v1, Lcom/google/protobuf/MapField$StorageMode;->LIST:Lcom/google/protobuf/MapField$StorageMode;

    .line 4
    .line 5
    if-ne v0, v1, :cond_1

    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/MapField$StorageMode;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪兰世苏哲:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪世兰苏哲(Ljava/util/ArrayList;)Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;

    .line 19
    .line 20
    sget-object v0, Lcom/google/protobuf/MapField$StorageMode;->BOTH:Lcom/google/protobuf/MapField$StorageMode;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/MapField$StorageMode;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    monitor-exit p0

    .line 28
    goto :goto_2

    .line 29
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw v0

    .line 31
    :cond_1
    :goto_2
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世楪兰哲苏子;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/飘花落叶言世楪兰哲子苏;

    .line 32
    .line 33
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method
