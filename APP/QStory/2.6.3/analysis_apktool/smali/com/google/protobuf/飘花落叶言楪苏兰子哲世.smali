.class public final Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪世哲兰苏:Z

.field public 飘花落叶言子楪世哲苏兰:Z

.field public 飘花落叶言子楪世苏兰哲:Z

.field public 飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世哲苏兰:Z

    .line 8
    .line 9
    return-void
.end method

.method public static 飘花落叶言子楪兰世苏哲(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏兰世哲()Lcom/google/protobuf/WireFormat$FieldType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪兰世苏哲(Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏兰世哲()Lcom/google/protobuf/WireFormat$FieldType;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/google/protobuf/WireFormat$FieldType;->getJavaType()Lcom/google/protobuf/WireFormat$JavaType;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v1, Lcom/google/protobuf/WireFormat$JavaType;->MESSAGE:Lcom/google/protobuf/WireFormat$JavaType;

    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    instance-of v0, p1, Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 29
    .line 30
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->getNumber()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏兰世哲()Lcom/google/protobuf/WireFormat$FieldType;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Lcom/google/protobuf/WireFormat$FieldType;->getJavaType()Lcom/google/protobuf/WireFormat$JavaType;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance v1, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v2, "Wrong object type used with protocol message reflection.\nField number: "

    .line 53
    .line 54
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v0, ", field java type: "

    .line 61
    .line 62
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string p0, ", value type: "

    .line 69
    .line 70
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p0, "\n"

    .line 74
    .line 75
    invoke-static {v1, p1, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_1
    :goto_0
    return-void
.end method

.method public static 飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    check-cast p0, Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;->buildPartial()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_1
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;->build()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static 飘花落叶言子楪哲苏世兰(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子世兰楪哲苏()Lcom/google/protobuf/WireFormat$JavaType;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Lcom/google/protobuf/WireFormat$JavaType;->MESSAGE:Lcom/google/protobuf/WireFormat$JavaType;

    .line 9
    .line 10
    if-ne v0, v1, :cond_6

    .line 11
    .line 12
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏世哲兰()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_5

    .line 17
    .line 18
    instance-of p0, p1, Ljava/util/List;

    .line 19
    .line 20
    if-eqz p0, :cond_4

    .line 21
    .line 22
    move-object p0, p1

    .line 23
    check-cast p0, Ljava/util/List;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-ge v0, v1, :cond_3

    .line 31
    .line 32
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1, p2}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eq v2, v1, :cond_2

    .line 41
    .line 42
    if-ne p0, p1, :cond_1

    .line 43
    .line 44
    new-instance v1, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 47
    .line 48
    .line 49
    move-object p0, v1

    .line 50
    :cond_1
    invoke-interface {p0, v0, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    return-object p0

    .line 57
    :cond_4
    new-instance p0, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string p2, "Repeated field should contains a List but actually contains type: "

    .line 60
    .line 61
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p1, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    return-object p0

    .line 73
    :cond_5
    invoke-static {p1, p2}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :cond_6
    return-object p1
.end method

.method public static 飘花落叶言子楪哲苏兰世(Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;Z)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世哲苏兰(I)Lcom/google/protobuf/飘花落叶言世兰楪苏哲子;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言世兰楪苏哲子;->getKey()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;

    .line 15
    .line 16
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言世兰楪苏哲子;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-static {v3, v4, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪哲苏世兰(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v2, v3}, Lcom/google/protobuf/飘花落叶言世兰楪苏哲子;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世哲兰苏()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ljava/util/Map$Entry;

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-static {v1, v2, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪哲苏世兰(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-interface {v0, v1}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-static {p1, p0, v0}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪哲苏世兰(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲()Ljava/util/Map;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏兰哲:Z

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-static {v1, v0, v2}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世哲苏兰(Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;ZZ)Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 14
    .line 15
    iget-boolean p0, p0, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪兰世苏哲:Z

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世兰哲苏()V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    invoke-static {v0, v2}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪哲苏兰世(Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;Z)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1
    iget-boolean p0, v1, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪兰世苏哲:Z

    .line 28
    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_2
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世哲苏兰:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-static {v0, v2, v1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世哲苏兰(Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;ZZ)Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 14
    .line 15
    iput-boolean v2, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世哲苏兰:Z

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世哲兰苏()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-boolean p1, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏兰哲:Z

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(Z)Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世哲苏兰:Z

    .line 14
    .line 15
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 16
    .line 17
    iget-boolean v2, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世哲兰苏:Z

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-static {v1, v0, v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世哲苏兰(Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;ZZ)Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪哲苏兰世(Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;Z)V

    .line 26
    .line 27
    .line 28
    :cond_1
    new-instance p1, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 29
    .line 30
    invoke-direct {p1, v1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;-><init>(Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;)V

    .line 31
    .line 32
    .line 33
    iget-boolean p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏兰哲:Z

    .line 34
    .line 35
    iput-boolean p0, p1, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世哲苏兰:Z

    .line 36
    .line 37
    return-object p1
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世哲兰苏()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏世哲兰()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世哲兰苏:Z

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    instance-of v0, p2, Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 22
    :goto_1
    iput-boolean v0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世哲兰苏:Z

    .line 23
    .line 24
    invoke-static {p1, p2}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪兰世苏哲(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    new-instance v0, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 39
    .line 40
    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    check-cast v0, Ljava/util/List;

    .line 45
    .line 46
    :goto_2
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_3
    const-string p0, "addRepeatedField() can only be called on repeated fields."

    .line 51
    .line 52
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final 飘花落叶言子楪哲世苏兰(Ljava/util/Map$Entry;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    instance-of v1, p1, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 12
    .line 13
    invoke-interface {v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏世哲兰()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/util/List;

    .line 26
    .line 27
    check-cast p1, Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    new-instance v1, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 41
    .line 42
    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_0
    const/4 p0, 0x0

    .line 46
    :goto_0
    if-ge p0, v2, :cond_3

    .line 47
    .line 48
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    add-int/lit8 p0, p0, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const-string p0, "Lazy fields can not be repeated"

    .line 63
    .line 64
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_2
    invoke-interface {v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子世兰楪哲苏()Lcom/google/protobuf/WireFormat$JavaType;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    sget-object v3, Lcom/google/protobuf/WireFormat$JavaType;->MESSAGE:Lcom/google/protobuf/WireFormat$JavaType;

    .line 73
    .line 74
    if-ne v2, v3, :cond_7

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    if-nez v2, :cond_4

    .line 81
    .line 82
    iget-object v2, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 83
    .line 84
    invoke-static {p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {v2, v0, p1}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    const/4 p1, 0x1

    .line 94
    iput-boolean p1, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏兰哲:Z

    .line 95
    .line 96
    :cond_3
    return-void

    .line 97
    :cond_4
    if-eqz v1, :cond_5

    .line 98
    .line 99
    check-cast p1, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    :cond_5
    invoke-interface {v0, v2}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪兰苏世哲(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_6

    .line 110
    .line 111
    check-cast v2, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 112
    .line 113
    invoke-interface {v2}, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;->toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-interface {v0, v1, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-interface {v1}, Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;->build()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 125
    .line 126
    invoke-virtual {p0, v0, p1}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_6
    invoke-interface {v0, v2, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_7
    if-nez v1, :cond_8

    .line 135
    .line 136
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 137
    .line 138
    invoke-static {p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p0, v0, p1}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_8
    const-string p0, "Lazy fields must be message-valued"

    .line 147
    .line 148
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    return-void
.end method

.method public final 飘花落叶言子楪哲兰世苏(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;Ljava/lang/Object;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世哲兰苏()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏世哲兰()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    instance-of v0, p2, Ljava/util/List;

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    check-cast p2, Ljava/util/List;

    .line 19
    .line 20
    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    move v3, v1

    .line 28
    :goto_0
    if-ge v3, p2, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-static {p1, v4}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪兰世苏哲(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-boolean v5, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世哲兰苏:Z

    .line 38
    .line 39
    if-nez v5, :cond_1

    .line 40
    .line 41
    instance-of v4, v4, Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;

    .line 42
    .line 43
    if-eqz v4, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    move v4, v1

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    :goto_1
    move v4, v2

    .line 49
    :goto_2
    iput-boolean v4, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世哲兰苏:Z

    .line 50
    .line 51
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    move-object p2, v0

    .line 55
    goto :goto_3

    .line 56
    :cond_3
    const-string p0, "Wrong object type used with protocol message reflection."

    .line 57
    .line 58
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_4
    invoke-static {p1, p2}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪兰世苏哲(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :goto_3
    instance-of v0, p2, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 66
    .line 67
    if-eqz v0, :cond_5

    .line 68
    .line 69
    iput-boolean v2, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏兰哲:Z

    .line 70
    .line 71
    :cond_5
    iget-boolean v0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世哲兰苏:Z

    .line 72
    .line 73
    if-nez v0, :cond_6

    .line 74
    .line 75
    instance-of v0, p2, Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;

    .line 76
    .line 77
    if-eqz v0, :cond_7

    .line 78
    .line 79
    :cond_6
    move v1, v2

    .line 80
    :cond_7
    iput-boolean v1, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世哲兰苏:Z

    .line 81
    .line 82
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 83
    .line 84
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final 飘花落叶言子楪哲兰苏世(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;ILjava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世哲兰苏()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏世哲兰()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世哲兰苏:Z

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    instance-of v0, p3, Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 22
    :goto_1
    iput-boolean v0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世哲兰苏:Z

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    invoke-static {p1, p3}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪兰世苏哲(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    check-cast p0, Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {p0, p2, p3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 40
    .line 41
    invoke-direct {p0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 42
    .line 43
    .line 44
    throw p0

    .line 45
    :cond_3
    const-string p0, "getRepeatedField() can only be called on repeated fields."

    .line 46
    .line 47
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;I)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏世哲兰()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    check-cast p0, Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 23
    .line 24
    .line 25
    throw p0

    .line 26
    :cond_1
    const-string p0, "getRepeatedField() can only be called on repeated fields."

    .line 27
    .line 28
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of p1, p0, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    check-cast p0, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 2
    .line 3
    iget v0, v0, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    iget-object v3, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 8
    .line 9
    if-ge v2, v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v3, v2}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世哲苏兰(I)Lcom/google/protobuf/飘花落叶言世兰楪苏哲子;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-static {v3}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪哲兰苏世(Ljava/util/Map$Entry;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {v3}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世哲兰苏()Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Ljava/util/Map$Entry;

    .line 44
    .line 45
    invoke-static {v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪哲兰苏世(Ljava/util/Map$Entry;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    :goto_1
    return v1

    .line 52
    :cond_3
    const/4 p0, 0x1

    .line 53
    return p0
.end method

.method public final 飘花落叶言子楪苏兰哲世(Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世哲兰苏()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 5
    .line 6
    iget v0, v0, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    iget-object v2, p1, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 10
    .line 11
    if-ge v1, v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世哲苏兰(I)Lcom/google/protobuf/飘花落叶言世兰楪苏哲子;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {p0, v2}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪哲世苏兰(Ljava/util/Map$Entry;)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->飘花落叶言子楪世哲兰苏()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/util/Map$Entry;

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪哲世苏兰(Ljava/util/Map$Entry;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏世哲兰()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    check-cast p0, Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_1
    const-string p0, "getRepeatedFieldCount() can only be called on repeated fields."

    .line 23
    .line 24
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return v1
.end method

.method public final 飘花落叶言子楪苏哲兰世(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏世哲兰()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰子哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    return v1

    .line 19
    :cond_1
    const-string p0, "hasField() can only be called on non-repeated fields."

    .line 20
    .line 21
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return v1
.end method
