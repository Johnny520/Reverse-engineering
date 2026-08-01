.class public final Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;
.super Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Lcom/google/protobuf/Extension$ExtensionType;

.field public final 飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Method;

.field public final 飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Method;

.field public final 飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

.field public 飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪哲苏子世兰;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/飘花落叶言楪哲子苏兰世;Ljava/lang/Class;Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;Lcom/google/protobuf/Extension$ExtensionType;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 5
    .line 6
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p2, p3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string p1, "Bad messageDefaultInstance for "

    .line 25
    .line 26
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v1

    .line 34
    :cond_1
    :goto_0
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪哲苏子世兰;

    .line 35
    .line 36
    iput-object p2, p0, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 37
    .line 38
    iput-object p3, p0, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 39
    .line 40
    const-class p1, Lcom/google/protobuf/飘花落叶言世哲苏楪兰子;

    .line 41
    .line 42
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    const-class p1, Lcom/google/protobuf/飘花落叶言楪子哲兰世苏;

    .line 49
    .line 50
    filled-new-array {p1}, [Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const-string p3, "valueOf"

    .line 55
    .line 56
    invoke-static {p2, p3, p1}, Lcom/google/protobuf/GeneratedMessage;->access$1100(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Method;

    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    new-array p1, p1, [Ljava/lang/Class;

    .line 64
    .line 65
    const-string p3, "getValueDescriptor"

    .line 66
    .line 67
    invoke-static {p2, p3, p1}, Lcom/google/protobuf/GeneratedMessage;->access$1100(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Method;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    iput-object v1, p0, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Method;

    .line 75
    .line 76
    iput-object v1, p0, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Method;

    .line 77
    .line 78
    :goto_1
    iput-object p4, p0, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;->飘花落叶言子楪世兰哲苏:Lcom/google/protobuf/Extension$ExtensionType;

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;->飘花落叶言子楪世哲苏兰()Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/google/protobuf/飘花落叶言楪哲子兰世苏;->飘花落叶言子楪世苏哲兰:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    aget v0, v1, v0

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    new-array v0, v0, [Ljava/lang/Object;

    .line 23
    .line 24
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Method;

    .line 25
    .line 26
    invoke-static {p0, p1, v0}, Lcom/google/protobuf/GeneratedMessage;->access$1200(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;->飘花落叶言子楪世哲苏兰()Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/google/protobuf/飘花落叶言楪哲子兰世苏;->飘花落叶言子楪世苏哲兰:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    aget v0, v1, v0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    if-eq v0, v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Method;

    .line 30
    .line 31
    invoke-static {p0, v0, p1}, Lcom/google/protobuf/GeneratedMessage;->access$1200(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    :goto_0
    return-object p1

    .line 45
    :cond_2
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 46
    .line 47
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;->newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p1, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 52
    .line 53
    invoke-interface {p0, p1}, Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;->build()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰()Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪哲苏子世兰;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言楪哲苏子世兰;->getDescriptor()Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string p0, "getDescriptor() called before internalInit()"

    .line 11
    .line 12
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;->飘花落叶言子楪世哲苏兰()Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏兰世哲()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sget-object v2, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 16
    .line 17
    if-eq v1, v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->ENUM:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 24
    .line 25
    if-ne v0, v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-object p1

    .line 29
    :cond_1
    :goto_0
    new-instance v0, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;

    .line 30
    .line 31
    invoke-direct {v0}, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;-><init>()V

    .line 32
    .line 33
    .line 34
    check-cast p1, Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v0, v1}, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪世哲兰苏(I)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {p0, v1}, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_3
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method
