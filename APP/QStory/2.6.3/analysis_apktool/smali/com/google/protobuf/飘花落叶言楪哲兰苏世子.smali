.class public Lcom/google/protobuf/飘花落叶言楪哲兰苏世子;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言楪哲苏子兰世;


# instance fields
.field public final 飘花落叶言子楪世兰苏哲:Lcom/google/protobuf/飘花落叶言楪哲兰苏子世;

.field public final 飘花落叶言子楪世哲兰苏:Z

.field public final 飘花落叶言子楪世哲苏兰:Z

.field public final 飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子世楪哲苏兰:Lcom/google/protobuf/飘花落叶言楪世子苏哲兰;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v3, v0, Lcom/google/protobuf/飘花落叶言楪世子苏哲兰;->飘花落叶言子楪兰苏哲世:[Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 11
    .line 12
    array-length v4, v3

    .line 13
    if-ne v4, v1, :cond_1

    .line 14
    .line 15
    aget-object v3, v3, v2

    .line 16
    .line 17
    iget-boolean v3, v3, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪兰哲世苏:Z

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :cond_1
    if-eqz v0, :cond_2

    .line 23
    .line 24
    move v8, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_2
    move v8, v2

    .line 27
    :goto_0
    iput-boolean v8, p0, Lcom/google/protobuf/飘花落叶言楪哲兰苏世子;->飘花落叶言子楪世哲苏兰:Z

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪兰苏哲世()Z

    .line 30
    .line 31
    .line 32
    move-result v9

    .line 33
    iput-boolean v9, p0, Lcom/google/protobuf/飘花落叶言楪哲兰苏世子;->飘花落叶言子楪世哲兰苏:Z

    .line 34
    .line 35
    new-instance v3, Lcom/google/protobuf/飘花落叶言楪哲兰苏子世;

    .line 36
    .line 37
    move-object v4, p2

    .line 38
    move-object v5, p3

    .line 39
    move-object v6, p4

    .line 40
    move-object v7, p5

    .line 41
    invoke-direct/range {v3 .. v9}, Lcom/google/protobuf/飘花落叶言楪哲兰苏子世;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;ZZ)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言楪哲兰苏世子;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 45
    .line 46
    iget-object p1, v3, Lcom/google/protobuf/飘花落叶言楪哲兰苏子世;->飘花落叶言子楪世苏哲兰:Ljava/lang/reflect/Method;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言楪哲兰苏世子;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 53
    .line 54
    iput-object v3, p0, Lcom/google/protobuf/飘花落叶言楪哲兰苏世子;->飘花落叶言子楪世兰苏哲:Lcom/google/protobuf/飘花落叶言楪哲兰苏子世;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public 飘花落叶言子楪世兰哲苏()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "newBuilderForField() called on a non-Message type."

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/google/protobuf/飘花落叶言楪哲兰苏世子;->飘花落叶言子楪世哲兰苏:Z

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言楪哲兰苏世子;->飘花落叶言子楪世兰苏哲:Lcom/google/protobuf/飘花落叶言楪哲兰苏子世;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    iget-boolean v0, p0, Lcom/google/protobuf/飘花落叶言楪哲兰苏世子;->飘花落叶言子楪世哲苏兰:Z

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    iget-object v4, p0, Lcom/google/protobuf/飘花落叶言楪哲兰苏世子;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object p0, v1, Lcom/google/protobuf/飘花落叶言楪哲兰苏子世;->飘花落叶言子楪苏世兰哲:Ljava/lang/reflect/Method;

    .line 16
    .line 17
    new-array v0, v2, [Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {p0, p1, v0}, Lcom/google/protobuf/GeneratedMessage;->access$1200(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lcom/google/protobuf/飘花落叶言世子楪苏兰哲;

    .line 24
    .line 25
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言世子楪苏兰哲;->getNumber()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    iget-object p1, v4, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;->getNumber()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-ne p0, p1, :cond_0

    .line 36
    .line 37
    return v3

    .line 38
    :cond_0
    return v2

    .line 39
    :cond_1
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲兰苏世子;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {v4}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲苏世兰()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    xor-int/2addr p0, v3

    .line 52
    return p0

    .line 53
    :cond_2
    iget-object p0, v1, Lcom/google/protobuf/飘花落叶言楪哲兰苏子世;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Method;

    .line 54
    .line 55
    new-array v0, v2, [Ljava/lang/Object;

    .line 56
    .line 57
    invoke-static {p0, p1, v0}, Lcom/google/protobuf/GeneratedMessage;->access$1200(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    return p0
.end method

.method public 飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪哲兰苏世子;->飘花落叶言子楪世兰苏哲:Lcom/google/protobuf/飘花落叶言楪哲兰苏子世;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪哲兰苏子世;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    new-array v0, v0, [Ljava/lang/Object;

    .line 7
    .line 8
    invoke-static {p0, p1, v0}, Lcom/google/protobuf/GeneratedMessage;->access$1200(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Lcom/google/protobuf/GeneratedMessage;)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/google/protobuf/飘花落叶言楪哲兰苏世子;->飘花落叶言子楪世哲兰苏:Z

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言楪哲兰苏世子;->飘花落叶言子楪世兰苏哲:Lcom/google/protobuf/飘花落叶言楪哲兰苏子世;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    iget-boolean v0, p0, Lcom/google/protobuf/飘花落叶言楪哲兰苏世子;->飘花落叶言子楪世哲苏兰:Z

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    iget-object v4, p0, Lcom/google/protobuf/飘花落叶言楪哲兰苏世子;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object p0, v1, Lcom/google/protobuf/飘花落叶言楪哲兰苏子世;->飘花落叶言子楪苏世哲兰:Ljava/lang/reflect/Method;

    .line 16
    .line 17
    new-array v0, v2, [Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {p0, p1, v0}, Lcom/google/protobuf/GeneratedMessage;->access$1200(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lcom/google/protobuf/飘花落叶言世子楪苏兰哲;

    .line 24
    .line 25
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言世子楪苏兰哲;->getNumber()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    iget-object p1, v4, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;->getNumber()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-ne p0, p1, :cond_0

    .line 36
    .line 37
    return v3

    .line 38
    :cond_0
    return v2

    .line 39
    :cond_1
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲兰苏世子;->飘花落叶言子楪世苏兰哲(Lcom/google/protobuf/GeneratedMessage;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {v4}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲苏世兰()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    xor-int/2addr p0, v3

    .line 52
    return p0

    .line 53
    :cond_2
    iget-object p0, v1, Lcom/google/protobuf/飘花落叶言楪哲兰苏子世;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Method;

    .line 54
    .line 55
    new-array v0, v2, [Ljava/lang/Object;

    .line 56
    .line 57
    invoke-static {p0, p1, v0}, Lcom/google/protobuf/GeneratedMessage;->access$1200(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    return p0
.end method

.method public 飘花落叶言子楪世苏兰哲(Lcom/google/protobuf/GeneratedMessage;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪哲兰苏世子;->飘花落叶言子楪世兰苏哲:Lcom/google/protobuf/飘花落叶言楪哲兰苏子世;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪哲兰苏子世;->飘花落叶言子楪世苏哲兰:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    new-array v0, v0, [Ljava/lang/Object;

    .line 7
    .line 8
    invoke-static {p0, p1, v0}, Lcom/google/protobuf/GeneratedMessage;->access$1200(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪哲兰苏世子;->飘花落叶言子楪世兰苏哲:Lcom/google/protobuf/飘花落叶言楪哲兰苏子世;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪哲兰苏子世;->飘花落叶言子楪世兰哲苏:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    new-array v0, v0, [Ljava/lang/Object;

    .line 7
    .line 8
    invoke-static {p0, p1, v0}, Lcom/google/protobuf/GeneratedMessage;->access$1200(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final 飘花落叶言子楪哲世兰苏(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;I)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "getRepeatedField() called on a singular field."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子楪哲世苏兰(Lcom/google/protobuf/GeneratedMessage;)I
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "getRepeatedFieldSize() called on a singular field."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "addRepeatedField() called on a singular field."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public 飘花落叶言子楪哲苏兰世(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "getFieldBuilder() called on a non-Message type."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子楪苏世兰哲(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;ILjava/lang/Object;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "setRepeatedField() called on a singular field."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;I)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "getRepeatedFieldBuilder() called on a non-Message type."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public 飘花落叶言子楪苏兰世哲(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪哲兰苏世子;->飘花落叶言子楪世兰苏哲:Lcom/google/protobuf/飘花落叶言楪哲兰苏子世;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪哲兰苏子世;->飘花落叶言子楪世哲苏兰:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage;->access$1200(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final 飘花落叶言子楪苏兰哲世(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;)I
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "getRepeatedFieldSize() called on a singular field."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子楪苏哲世兰(ILcom/google/protobuf/GeneratedMessage;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "getRepeatedField() called on a singular field."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public 飘花落叶言子楪苏哲兰世(Lcom/google/protobuf/GeneratedMessage;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲兰苏世子;->飘花落叶言子楪世苏兰哲(Lcom/google/protobuf/GeneratedMessage;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
