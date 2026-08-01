.class public abstract Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世苏哲兰;-><init>()V

    return-void
.end method

.method public static synthetic access$100(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;I)Z
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite;->parseUnknownField(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static varargs getMethodOrDie(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception p2

    .line 7
    new-instance v0, Ljava/lang/RuntimeException;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    add-int/lit8 v2, v2, 0x2d

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    add-int/2addr v3, v2

    .line 30
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 31
    .line 32
    .line 33
    const-string v2, "Generated message class \""

    .line 34
    .line 35
    const-string v3, "\" missing method \""

    .line 36
    .line 37
    invoke-static {v1, v2, p0, v3, p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰哲世苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string p0, "\"."

    .line 41
    .line 42
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-direct {v0, p0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    throw v0
.end method

.method public static varargs invokeOrDie(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    return-object p0

    .line 7
    :catch_0
    move-exception p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    instance-of p1, p0, Ljava/lang/RuntimeException;

    .line 13
    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    instance-of p1, p0, Ljava/lang/Error;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const-string p1, "Unexpected exception thrown by generated accessor method."

    .line 21
    .line 22
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    check-cast p0, Ljava/lang/Error;

    .line 27
    .line 28
    throw p0

    .line 29
    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    .line 30
    .line 31
    throw p0

    .line 32
    :catch_1
    move-exception p0

    .line 33
    const-string p1, "Couldn\'t use Java reflection to implement protocol message reflection."

    .line 34
    .line 35
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public static newRepeatedGeneratedExtension(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰苏世;ILkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;ZLjava/lang/Class;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏兰世;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ContainingType::",
            "Lkotlin/reflect/jvm/internal/impl/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;",
            "Type:",
            "Ljava/lang/Object;",
            ">(TContainingType;",
            "Lkotlin/reflect/jvm/internal/impl/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;",
            "Lkotlin/reflect/jvm/internal/impl/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u82cf\u4e16;",
            "I",
            "Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;",
            "Z",
            "Ljava/lang/Class;",
            ")",
            "Lkotlin/reflect/jvm/internal/impl/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
        }
    .end annotation

    .line 1
    move-object v1, p2

    .line 2
    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 3
    .line 4
    move v2, p3

    .line 5
    move-object p3, p1

    .line 6
    move-object p1, p0

    .line 7
    new-instance p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏兰世;

    .line 8
    .line 9
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    move-object v3, p4

    .line 13
    move v5, p5

    .line 14
    invoke-direct/range {v0 .. v5}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰苏世;ILkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;ZZ)V

    .line 15
    .line 16
    .line 17
    move-object p5, p6

    .line 18
    move-object p4, v0

    .line 19
    invoke-direct/range {p0 .. p5}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏兰世;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;Ljava/lang/Object;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;Ljava/lang/Class;)V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public static newSingularGeneratedExtension(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;Ljava/lang/Object;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰苏世;ILkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏兰世;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ContainingType::",
            "Lkotlin/reflect/jvm/internal/impl/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;",
            "Type:",
            "Ljava/lang/Object;",
            ">(TContainingType;TType;",
            "Lkotlin/reflect/jvm/internal/impl/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;",
            "Lkotlin/reflect/jvm/internal/impl/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u82cf\u4e16;",
            "I",
            "Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;",
            "Ljava/lang/Class;",
            ")",
            "Lkotlin/reflect/jvm/internal/impl/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
        }
    .end annotation

    .line 1
    move-object v1, p3

    .line 2
    move-object p3, p2

    .line 3
    move-object p2, p1

    .line 4
    move-object p1, p0

    .line 5
    new-instance p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏兰世;

    .line 6
    .line 7
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    move v2, p4

    .line 12
    move-object v3, p5

    .line 13
    invoke-direct/range {v0 .. v5}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰苏世;ILkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;ZZ)V

    .line 14
    .line 15
    .line 16
    move-object p5, p6

    .line 17
    move-object p4, v0

    .line 18
    invoke-direct/range {p0 .. p5}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏兰世;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;Ljava/lang/Object;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;Ljava/lang/Class;)V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method private static parseUnknownField(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;I)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<MessageType::",
            "Lkotlin/reflect/jvm/internal/impl/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;",
            ">(",
            "Lkotlin/reflect/jvm/internal/impl/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;",
            "TMessageType;",
            "Lkotlin/reflect/jvm/internal/impl/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
            "Lkotlin/reflect/jvm/internal/impl/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
            "Lkotlin/reflect/jvm/internal/impl/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            "I)Z"
        }
    .end annotation

    .line 1
    and-int/lit8 v0, p5, 0x7

    .line 2
    .line 3
    ushr-int/lit8 v1, p5, 0x3

    .line 4
    .line 5
    iget-object v2, p4, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 6
    .line 7
    new-instance v3, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世哲兰;

    .line 8
    .line 9
    invoke-direct {v3, p1, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏兰世;

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    const/4 v2, 0x1

    .line 20
    const/4 v3, 0x0

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    :cond_0
    move v0, v3

    .line 24
    move v3, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object v4, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;

    .line 27
    .line 28
    iget-object v5, v4, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;

    .line 29
    .line 30
    sget-object v6, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;

    .line 31
    .line 32
    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;->getWireType()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-ne v0, v5, :cond_2

    .line 37
    .line 38
    move v0, v3

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    iget-boolean v5, v4, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:Z

    .line 41
    .line 42
    if-eqz v5, :cond_0

    .line 43
    .line 44
    iget-object v4, v4, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;

    .line 45
    .line 46
    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;->isPackable()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    if-ne v0, v1, :cond_0

    .line 53
    .line 54
    move v0, v2

    .line 55
    :goto_0
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-virtual {p2, p5, p3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    return p0

    .line 62
    :cond_3
    if-eqz v0, :cond_7

    .line 63
    .line 64
    invoke-virtual {p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    invoke-virtual {p2, p3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)I

    .line 69
    .line 70
    .line 71
    move-result p3

    .line 72
    iget-object p4, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;

    .line 73
    .line 74
    iget-object p5, p4, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;

    .line 75
    .line 76
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;->ENUM:Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;

    .line 77
    .line 78
    if-ne p5, v0, :cond_5

    .line 79
    .line 80
    :goto_1
    invoke-virtual {p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()I

    .line 81
    .line 82
    .line 83
    move-result p5

    .line 84
    if-lez p5, :cond_6

    .line 85
    .line 86
    invoke-virtual {p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 87
    .line 88
    .line 89
    move-result p5

    .line 90
    iget-object v0, p4, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰苏世;

    .line 91
    .line 92
    invoke-interface {v0, p5}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(I)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰世苏;

    .line 93
    .line 94
    .line 95
    move-result-object p5

    .line 96
    if-nez p5, :cond_4

    .line 97
    .line 98
    return v2

    .line 99
    :cond_4
    invoke-virtual {p1, p5}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p5

    .line 103
    invoke-virtual {p0, p4, p5}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_5
    :goto_2
    invoke-virtual {p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-lez p1, :cond_6

    .line 112
    .line 113
    iget-object p1, p4, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;

    .line 114
    .line 115
    invoke-static {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世兰哲(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p0, p4, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_6
    invoke-virtual {p2, p3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(I)V

    .line 124
    .line 125
    .line 126
    return v2

    .line 127
    :cond_7
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:[I

    .line 128
    .line 129
    iget-object v3, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;

    .line 130
    .line 131
    iget-object v4, v3, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;

    .line 132
    .line 133
    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;->getJavaType()Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$JavaType;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    aget v0, v0, v4

    .line 142
    .line 143
    if-eq v0, v2, :cond_a

    .line 144
    .line 145
    if-eq v0, v1, :cond_8

    .line 146
    .line 147
    iget-object p3, v3, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;

    .line 148
    .line 149
    invoke-static {p2, p3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世兰哲(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    goto/16 :goto_5

    .line 154
    .line 155
    :cond_8
    invoke-virtual {p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    iget-object p4, v3, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰苏世;

    .line 160
    .line 161
    invoke-interface {p4, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(I)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰世苏;

    .line 162
    .line 163
    .line 164
    move-result-object p4

    .line 165
    if-nez p4, :cond_9

    .line 166
    .line 167
    invoke-virtual {p3, p5}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p3, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(I)V

    .line 171
    .line 172
    .line 173
    return v2

    .line 174
    :cond_9
    move-object p2, p4

    .line 175
    goto :goto_5

    .line 176
    :cond_a
    iget-boolean p3, v3, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:Z

    .line 177
    .line 178
    if-nez p3, :cond_b

    .line 179
    .line 180
    iget-object p3, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;

    .line 181
    .line 182
    invoke-virtual {p3, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪兰哲苏;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p3

    .line 186
    check-cast p3, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 187
    .line 188
    if-eqz p3, :cond_b

    .line 189
    .line 190
    invoke-interface {p3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;->toBuilder()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲苏世;

    .line 191
    .line 192
    .line 193
    move-result-object p3

    .line 194
    goto :goto_3

    .line 195
    :cond_b
    const/4 p3, 0x0

    .line 196
    :goto_3
    if-nez p3, :cond_c

    .line 197
    .line 198
    iget-object p3, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 199
    .line 200
    invoke-interface {p3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;->newBuilderForType()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲苏世;

    .line 201
    .line 202
    .line 203
    move-result-object p3

    .line 204
    :cond_c
    iget-object p5, v3, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;

    .line 205
    .line 206
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;->GROUP:Lkotlin/reflect/jvm/internal/impl/protobuf/WireFormat$FieldType;

    .line 207
    .line 208
    const/16 v1, 0x40

    .line 209
    .line 210
    if-ne p5, v0, :cond_f

    .line 211
    .line 212
    iget p5, v3, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰世苏:I

    .line 213
    .line 214
    iget v0, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰:I

    .line 215
    .line 216
    if-ge v0, v1, :cond_e

    .line 217
    .line 218
    add-int/2addr v0, v2

    .line 219
    iput v0, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰:I

    .line 220
    .line 221
    invoke-interface {p3, p2, p4}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏世哲兰(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲苏世;

    .line 222
    .line 223
    .line 224
    shl-int/lit8 p4, p5, 0x3

    .line 225
    .line 226
    or-int/lit8 p4, p4, 0x4

    .line 227
    .line 228
    iget p5, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏:I

    .line 229
    .line 230
    if-ne p5, p4, :cond_d

    .line 231
    .line 232
    iget p4, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰:I

    .line 233
    .line 234
    sub-int/2addr p4, v2

    .line 235
    iput p4, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰:I

    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_d
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->invalidEndTag()Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    throw p0

    .line 243
    :cond_e
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->recursionLimitExceeded()Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    throw p0

    .line 248
    :cond_f
    invoke-virtual {p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 249
    .line 250
    .line 251
    move-result p5

    .line 252
    iget v0, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰:I

    .line 253
    .line 254
    if-ge v0, v1, :cond_12

    .line 255
    .line 256
    invoke-virtual {p2, p5}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)I

    .line 257
    .line 258
    .line 259
    move-result p5

    .line 260
    iget v0, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰:I

    .line 261
    .line 262
    add-int/2addr v0, v2

    .line 263
    iput v0, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰:I

    .line 264
    .line 265
    invoke-interface {p3, p2, p4}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏世哲兰(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲苏世;

    .line 266
    .line 267
    .line 268
    iget p4, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏:I

    .line 269
    .line 270
    if-nez p4, :cond_11

    .line 271
    .line 272
    iget p4, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰:I

    .line 273
    .line 274
    sub-int/2addr p4, v2

    .line 275
    iput p4, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰:I

    .line 276
    .line 277
    invoke-virtual {p2, p5}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(I)V

    .line 278
    .line 279
    .line 280
    :goto_4
    invoke-interface {p3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲苏世;->build()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 281
    .line 282
    .line 283
    move-result-object p2

    .line 284
    :goto_5
    iget-boolean p3, v3, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:Z

    .line 285
    .line 286
    if-eqz p3, :cond_10

    .line 287
    .line 288
    invoke-virtual {p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    invoke-virtual {p0, v3, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    return v2

    .line 296
    :cond_10
    invoke-virtual {p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    invoke-virtual {p0, v3, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲苏世兰;Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    return v2

    .line 304
    :cond_11
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->invalidEndTag()Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    throw p0

    .line 309
    :cond_12
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->recursionLimitExceeded()Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 310
    .line 311
    .line 312
    move-result-object p0

    .line 313
    throw p0
.end method


# virtual methods
.method public abstract synthetic getDefaultInstanceForType()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;
.end method

.method public getParserForType()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/jvm/internal/impl/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u82cf\u5170;"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "This is supposed to be overridden by subclasses."

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public abstract synthetic getSerializedSize()I
.end method

.method public abstract synthetic isInitialized()Z
.end method

.method public makeExtensionsImmutable()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract synthetic newBuilderForType()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲苏世;
.end method

.method public parseUnknownField(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;I)Z
    .locals 0

    .line 314
    invoke-virtual {p1, p4, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;)Z

    move-result p0

    return p0
.end method

.method public abstract synthetic toBuilder()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲苏世;
.end method

.method public abstract synthetic writeTo(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;)V
.end method
