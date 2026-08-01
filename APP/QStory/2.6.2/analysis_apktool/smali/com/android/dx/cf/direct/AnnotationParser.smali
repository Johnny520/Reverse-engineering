.class public final Lcom/android/dx/cf/direct/AnnotationParser;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final bytes:Lcom/android/dx/util/ByteArray;

.field private final cf:Lcom/android/dx/cf/direct/DirectClassFile;

.field private final input:Lcom/android/dx/util/ByteArray$MyDataInputStream;

.field private final observer:Lcom/android/dx/cf/iface/ParseObserver;

.field private parseCursor:I

.field private final pool:Lcom/android/dx/rop/cst/ConstantPool;


# direct methods
.method public constructor <init>(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lcom/android/dx/cf/direct/AnnotationParser;->cf:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getConstantPool()Lcom/android/dx/rop/cst/ConstantPool;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/android/dx/cf/direct/AnnotationParser;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 13
    .line 14
    iput-object p4, p0, Lcom/android/dx/cf/direct/AnnotationParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    add-int/2addr p3, p2

    .line 21
    invoke-virtual {p1, p2, p3}, Lcom/android/dx/util/ByteArray;->slice(II)Lcom/android/dx/util/ByteArray;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lcom/android/dx/cf/direct/AnnotationParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/android/dx/util/ByteArray;->makeDataInputStream()Lcom/android/dx/util/ByteArray$MyDataInputStream;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lcom/android/dx/cf/direct/AnnotationParser;->input:Lcom/android/dx/util/ByteArray$MyDataInputStream;

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    iput p1, p0, Lcom/android/dx/cf/direct/AnnotationParser;->parseCursor:I

    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    const-string p0, "cf == null"

    .line 38
    .line 39
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    throw p0
.end method

.method private changeIndent(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/direct/AnnotationParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lcom/android/dx/cf/iface/ParseObserver;->changeIndent(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private parseAnnotation(Lcom/android/dx/rop/annotation/AnnotationVisibility;)Lcom/android/dx/rop/annotation/Annotation;
    .locals 5

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, v0}, Lcom/android/dx/cf/direct/AnnotationParser;->requireLength(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lcom/android/dx/cf/direct/AnnotationParser;->input:Lcom/android/dx/util/ByteArray$MyDataInputStream;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lcom/android/dx/cf/direct/AnnotationParser;->input:Lcom/android/dx/util/ByteArray$MyDataInputStream;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p0, Lcom/android/dx/cf/direct/AnnotationParser;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 18
    .line 19
    invoke-interface {v2, v0}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/android/dx/rop/cst/CstString;

    .line 24
    .line 25
    new-instance v2, Lcom/android/dx/rop/cst/CstType;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/android/dx/rop/type/Type;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-direct {v2, v0}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/android/dx/cf/direct/AnnotationParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v3, "type: "

    .line 45
    .line 46
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const/4 v3, 0x2

    .line 61
    invoke-direct {p0, v3, v0}, Lcom/android/dx/cf/direct/AnnotationParser;->parsed(ILjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v0, "num_elements: "

    .line 65
    .line 66
    invoke-static {v1, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-direct {p0, v3, v0}, Lcom/android/dx/cf/direct/AnnotationParser;->parsed(ILjava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :cond_0
    new-instance v0, Lcom/android/dx/rop/annotation/Annotation;

    .line 74
    .line 75
    invoke-direct {v0, v2, p1}, Lcom/android/dx/rop/annotation/Annotation;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/annotation/AnnotationVisibility;)V

    .line 76
    .line 77
    .line 78
    const/4 p1, 0x0

    .line 79
    move v2, p1

    .line 80
    :goto_0
    if-ge v2, v1, :cond_3

    .line 81
    .line 82
    iget-object v3, p0, Lcom/android/dx/cf/direct/AnnotationParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 83
    .line 84
    if-eqz v3, :cond_1

    .line 85
    .line 86
    const-string v3, "elements["

    .line 87
    .line 88
    const-string v4, "]:"

    .line 89
    .line 90
    invoke-static {v2, v3, v4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-direct {p0, p1, v3}, Lcom/android/dx/cf/direct/AnnotationParser;->parsed(ILjava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const/4 v3, 0x1

    .line 98
    invoke-direct {p0, v3}, Lcom/android/dx/cf/direct/AnnotationParser;->changeIndent(I)V

    .line 99
    .line 100
    .line 101
    :cond_1
    invoke-direct {p0}, Lcom/android/dx/cf/direct/AnnotationParser;->parseElement()Lcom/android/dx/rop/annotation/NameValuePair;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v0, v3}, Lcom/android/dx/rop/annotation/Annotation;->add(Lcom/android/dx/rop/annotation/NameValuePair;)V

    .line 106
    .line 107
    .line 108
    iget-object v3, p0, Lcom/android/dx/cf/direct/AnnotationParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 109
    .line 110
    if-eqz v3, :cond_2

    .line 111
    .line 112
    const/4 v3, -0x1

    .line 113
    invoke-direct {p0, v3}, Lcom/android/dx/cf/direct/AnnotationParser;->changeIndent(I)V

    .line 114
    .line 115
    .line 116
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 120
    .line 121
    .line 122
    return-object v0
.end method

.method private parseAnnotations(Lcom/android/dx/rop/annotation/AnnotationVisibility;)Lcom/android/dx/rop/annotation/Annotations;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/direct/AnnotationParser;->input:Lcom/android/dx/util/ByteArray$MyDataInputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/cf/direct/AnnotationParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v2, "num_annotations: "

    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-direct {p0, v2, v1}, Lcom/android/dx/cf/direct/AnnotationParser;->parsed(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    new-instance v1, Lcom/android/dx/rop/annotation/Annotations;

    .line 27
    .line 28
    invoke-direct {v1}, Lcom/android/dx/rop/annotation/Annotations;-><init>()V

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    move v3, v2

    .line 33
    :goto_0
    if-ge v3, v0, :cond_3

    .line 34
    .line 35
    iget-object v4, p0, Lcom/android/dx/cf/direct/AnnotationParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 36
    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    const-string v4, "annotations["

    .line 40
    .line 41
    const-string v5, "]:"

    .line 42
    .line 43
    invoke-static {v3, v4, v5}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-direct {p0, v2, v4}, Lcom/android/dx/cf/direct/AnnotationParser;->parsed(ILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v4, 0x1

    .line 51
    invoke-direct {p0, v4}, Lcom/android/dx/cf/direct/AnnotationParser;->changeIndent(I)V

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-direct {p0, p1}, Lcom/android/dx/cf/direct/AnnotationParser;->parseAnnotation(Lcom/android/dx/rop/annotation/AnnotationVisibility;)Lcom/android/dx/rop/annotation/Annotation;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v1, v4}, Lcom/android/dx/rop/annotation/Annotations;->add(Lcom/android/dx/rop/annotation/Annotation;)V

    .line 59
    .line 60
    .line 61
    iget-object v4, p0, Lcom/android/dx/cf/direct/AnnotationParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 62
    .line 63
    if-eqz v4, :cond_2

    .line 64
    .line 65
    const/4 v5, -0x1

    .line 66
    invoke-interface {v4, v5}, Lcom/android/dx/cf/iface/ParseObserver;->changeIndent(I)V

    .line 67
    .line 68
    .line 69
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    invoke-virtual {v1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 73
    .line 74
    .line 75
    return-object v1
.end method

.method private parseAnnotationsList(Lcom/android/dx/rop/annotation/AnnotationVisibility;)Lcom/android/dx/rop/annotation/AnnotationsList;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/direct/AnnotationParser;->input:Lcom/android/dx/util/ByteArray$MyDataInputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/cf/direct/AnnotationParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v3, "num_parameters: "

    .line 15
    .line 16
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lcom/android/dx/util/Hex;->u1(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {p0, v2, v1}, Lcom/android/dx/cf/direct/AnnotationParser;->parsed(ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    new-instance v1, Lcom/android/dx/rop/annotation/AnnotationsList;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Lcom/android/dx/rop/annotation/AnnotationsList;-><init>(I)V

    .line 36
    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    move v4, v3

    .line 40
    :goto_0
    if-ge v4, v0, :cond_3

    .line 41
    .line 42
    iget-object v5, p0, Lcom/android/dx/cf/direct/AnnotationParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 43
    .line 44
    if-eqz v5, :cond_1

    .line 45
    .line 46
    const-string v5, "parameter_annotations["

    .line 47
    .line 48
    const-string v6, "]:"

    .line 49
    .line 50
    invoke-static {v4, v5, v6}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-direct {p0, v3, v5}, Lcom/android/dx/cf/direct/AnnotationParser;->parsed(ILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0, v2}, Lcom/android/dx/cf/direct/AnnotationParser;->changeIndent(I)V

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-direct {p0, p1}, Lcom/android/dx/cf/direct/AnnotationParser;->parseAnnotations(Lcom/android/dx/rop/annotation/AnnotationVisibility;)Lcom/android/dx/rop/annotation/Annotations;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-virtual {v1, v4, v5}, Lcom/android/dx/rop/annotation/AnnotationsList;->set(ILcom/android/dx/rop/annotation/Annotations;)V

    .line 65
    .line 66
    .line 67
    iget-object v5, p0, Lcom/android/dx/cf/direct/AnnotationParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 68
    .line 69
    if-eqz v5, :cond_2

    .line 70
    .line 71
    const/4 v6, -0x1

    .line 72
    invoke-interface {v5, v6}, Lcom/android/dx/cf/iface/ParseObserver;->changeIndent(I)V

    .line 73
    .line 74
    .line 75
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    invoke-virtual {v1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 79
    .line 80
    .line 81
    return-object v1
.end method

.method private parseConstant()Lcom/android/dx/rop/cst/Constant;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/direct/AnnotationParser;->input:Lcom/android/dx/util/ByteArray$MyDataInputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/cf/direct/AnnotationParser;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 8
    .line 9
    invoke-interface {v1, v0}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/android/dx/cf/direct/AnnotationParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    instance-of v1, v0, Lcom/android/dx/rop/cst/CstString;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    move-object v1, v0

    .line 22
    check-cast v1, Lcom/android/dx/rop/cst/CstString;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/android/dx/rop/cst/CstString;->toQuoted()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-interface {v0}, Lcom/android/dx/util/ToHuman;->toHuman()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :goto_0
    const-string v2, "constant_value: "

    .line 34
    .line 35
    invoke-static {v2, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const/4 v2, 0x2

    .line 40
    invoke-direct {p0, v2, v1}, Lcom/android/dx/cf/direct/AnnotationParser;->parsed(ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-object v0
.end method

.method private parseElement()Lcom/android/dx/rop/annotation/NameValuePair;
    .locals 3

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-direct {p0, v0}, Lcom/android/dx/cf/direct/AnnotationParser;->requireLength(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lcom/android/dx/cf/direct/AnnotationParser;->input:Lcom/android/dx/util/ByteArray$MyDataInputStream;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lcom/android/dx/cf/direct/AnnotationParser;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/android/dx/rop/cst/CstString;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/android/dx/cf/direct/AnnotationParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v2, "element_name: "

    .line 26
    .line 27
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const/4 v2, 0x2

    .line 42
    invoke-direct {p0, v2, v1}, Lcom/android/dx/cf/direct/AnnotationParser;->parsed(ILjava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    const-string v2, "value: "

    .line 47
    .line 48
    invoke-direct {p0, v1, v2}, Lcom/android/dx/cf/direct/AnnotationParser;->parsed(ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    invoke-direct {p0, v1}, Lcom/android/dx/cf/direct/AnnotationParser;->changeIndent(I)V

    .line 53
    .line 54
    .line 55
    :cond_0
    invoke-direct {p0}, Lcom/android/dx/cf/direct/AnnotationParser;->parseValue()Lcom/android/dx/rop/cst/Constant;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget-object v2, p0, Lcom/android/dx/cf/direct/AnnotationParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 60
    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    const/4 v2, -0x1

    .line 64
    invoke-direct {p0, v2}, Lcom/android/dx/cf/direct/AnnotationParser;->changeIndent(I)V

    .line 65
    .line 66
    .line 67
    :cond_1
    new-instance p0, Lcom/android/dx/rop/annotation/NameValuePair;

    .line 68
    .line 69
    invoke-direct {p0, v0, v1}, Lcom/android/dx/rop/annotation/NameValuePair;-><init>(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/Constant;)V

    .line 70
    .line 71
    .line 72
    return-object p0
.end method

.method private parseValue()Lcom/android/dx/rop/cst/Constant;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/direct/AnnotationParser;->input:Lcom/android/dx/util/ByteArray$MyDataInputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/cf/direct/AnnotationParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/android/dx/rop/cst/CstString;

    .line 13
    .line 14
    int-to-char v3, v0

    .line 15
    invoke-static {v3}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-direct {v1, v3}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v4, "tag: "

    .line 25
    .line 26
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/android/dx/rop/cst/CstString;->toQuoted()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-direct {p0, v2, v1}, Lcom/android/dx/cf/direct/AnnotationParser;->parsed(ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    const/16 v1, 0x40

    .line 44
    .line 45
    if-eq v0, v1, :cond_10

    .line 46
    .line 47
    const/16 v1, 0x46

    .line 48
    .line 49
    if-eq v0, v1, :cond_f

    .line 50
    .line 51
    const/16 v1, 0x53

    .line 52
    .line 53
    if-eq v0, v1, :cond_e

    .line 54
    .line 55
    const/16 v1, 0x63

    .line 56
    .line 57
    const/4 v3, 0x2

    .line 58
    if-eq v0, v1, :cond_c

    .line 59
    .line 60
    const/16 v1, 0x65

    .line 61
    .line 62
    if-eq v0, v1, :cond_a

    .line 63
    .line 64
    const/16 v1, 0x73

    .line 65
    .line 66
    if-eq v0, v1, :cond_9

    .line 67
    .line 68
    const/16 v1, 0x49

    .line 69
    .line 70
    if-eq v0, v1, :cond_8

    .line 71
    .line 72
    const/16 v1, 0x4a

    .line 73
    .line 74
    if-eq v0, v1, :cond_7

    .line 75
    .line 76
    const/16 v1, 0x5a

    .line 77
    .line 78
    if-eq v0, v1, :cond_6

    .line 79
    .line 80
    const/16 v1, 0x5b

    .line 81
    .line 82
    if-eq v0, v1, :cond_1

    .line 83
    .line 84
    packed-switch v0, :pswitch_data_0

    .line 85
    .line 86
    .line 87
    new-instance p0, Lcom/android/dx/cf/iface/ParseException;

    .line 88
    .line 89
    invoke-static {v0}, Lcom/android/dx/util/Hex;->u1(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    new-instance v1, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const-string v2, "unknown annotation tag: "

    .line 96
    .line 97
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-direct {p0, v0}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p0

    .line 111
    :pswitch_0
    invoke-direct {p0}, Lcom/android/dx/cf/direct/AnnotationParser;->parseConstant()Lcom/android/dx/rop/cst/Constant;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    check-cast p0, Lcom/android/dx/rop/cst/CstDouble;

    .line 116
    .line 117
    return-object p0

    .line 118
    :pswitch_1
    invoke-direct {p0}, Lcom/android/dx/cf/direct/AnnotationParser;->parseConstant()Lcom/android/dx/rop/cst/Constant;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    check-cast p0, Lcom/android/dx/rop/cst/CstInteger;

    .line 123
    .line 124
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstInteger;->getValue()I

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstInteger;->getValue()I

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    invoke-static {p0}, Lcom/android/dx/rop/cst/CstChar;->make(I)Lcom/android/dx/rop/cst/CstChar;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0

    .line 136
    :pswitch_2
    invoke-direct {p0}, Lcom/android/dx/cf/direct/AnnotationParser;->parseConstant()Lcom/android/dx/rop/cst/Constant;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    check-cast p0, Lcom/android/dx/rop/cst/CstInteger;

    .line 141
    .line 142
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstInteger;->getValue()I

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    invoke-static {p0}, Lcom/android/dx/rop/cst/CstByte;->make(I)Lcom/android/dx/rop/cst/CstByte;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :cond_1
    invoke-direct {p0, v3}, Lcom/android/dx/cf/direct/AnnotationParser;->requireLength(I)V

    .line 152
    .line 153
    .line 154
    iget-object v0, p0, Lcom/android/dx/cf/direct/AnnotationParser;->input:Lcom/android/dx/util/ByteArray$MyDataInputStream;

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    new-instance v1, Lcom/android/dx/rop/cst/CstArray$List;

    .line 161
    .line 162
    invoke-direct {v1, v0}, Lcom/android/dx/rop/cst/CstArray$List;-><init>(I)V

    .line 163
    .line 164
    .line 165
    iget-object v4, p0, Lcom/android/dx/cf/direct/AnnotationParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 166
    .line 167
    if-eqz v4, :cond_2

    .line 168
    .line 169
    const-string v4, "num_values: "

    .line 170
    .line 171
    invoke-static {v0, v4}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    invoke-direct {p0, v3, v4}, Lcom/android/dx/cf/direct/AnnotationParser;->parsed(ILjava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-direct {p0, v2}, Lcom/android/dx/cf/direct/AnnotationParser;->changeIndent(I)V

    .line 179
    .line 180
    .line 181
    :cond_2
    const/4 v3, 0x0

    .line 182
    move v4, v3

    .line 183
    :goto_0
    iget-object v5, p0, Lcom/android/dx/cf/direct/AnnotationParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 184
    .line 185
    const/4 v6, -0x1

    .line 186
    if-ge v4, v0, :cond_4

    .line 187
    .line 188
    if-eqz v5, :cond_3

    .line 189
    .line 190
    invoke-direct {p0, v6}, Lcom/android/dx/cf/direct/AnnotationParser;->changeIndent(I)V

    .line 191
    .line 192
    .line 193
    const-string v5, "element_value["

    .line 194
    .line 195
    const-string v6, "]:"

    .line 196
    .line 197
    invoke-static {v4, v5, v6}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-direct {p0, v3, v5}, Lcom/android/dx/cf/direct/AnnotationParser;->parsed(ILjava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-direct {p0, v2}, Lcom/android/dx/cf/direct/AnnotationParser;->changeIndent(I)V

    .line 205
    .line 206
    .line 207
    :cond_3
    invoke-direct {p0}, Lcom/android/dx/cf/direct/AnnotationParser;->parseValue()Lcom/android/dx/rop/cst/Constant;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    invoke-virtual {v1, v4, v5}, Lcom/android/dx/rop/cst/CstArray$List;->set(ILcom/android/dx/rop/cst/Constant;)V

    .line 212
    .line 213
    .line 214
    add-int/lit8 v4, v4, 0x1

    .line 215
    .line 216
    goto :goto_0

    .line 217
    :cond_4
    if-eqz v5, :cond_5

    .line 218
    .line 219
    invoke-direct {p0, v6}, Lcom/android/dx/cf/direct/AnnotationParser;->changeIndent(I)V

    .line 220
    .line 221
    .line 222
    :cond_5
    invoke-virtual {v1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 223
    .line 224
    .line 225
    new-instance p0, Lcom/android/dx/rop/cst/CstArray;

    .line 226
    .line 227
    invoke-direct {p0, v1}, Lcom/android/dx/rop/cst/CstArray;-><init>(Lcom/android/dx/rop/cst/CstArray$List;)V

    .line 228
    .line 229
    .line 230
    return-object p0

    .line 231
    :cond_6
    invoke-direct {p0}, Lcom/android/dx/cf/direct/AnnotationParser;->parseConstant()Lcom/android/dx/rop/cst/Constant;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    check-cast p0, Lcom/android/dx/rop/cst/CstInteger;

    .line 236
    .line 237
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstInteger;->getValue()I

    .line 238
    .line 239
    .line 240
    move-result p0

    .line 241
    invoke-static {p0}, Lcom/android/dx/rop/cst/CstBoolean;->make(I)Lcom/android/dx/rop/cst/CstBoolean;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    return-object p0

    .line 246
    :cond_7
    invoke-direct {p0}, Lcom/android/dx/cf/direct/AnnotationParser;->parseConstant()Lcom/android/dx/rop/cst/Constant;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    check-cast p0, Lcom/android/dx/rop/cst/CstLong;

    .line 251
    .line 252
    return-object p0

    .line 253
    :cond_8
    invoke-direct {p0}, Lcom/android/dx/cf/direct/AnnotationParser;->parseConstant()Lcom/android/dx/rop/cst/Constant;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    check-cast p0, Lcom/android/dx/rop/cst/CstInteger;

    .line 258
    .line 259
    return-object p0

    .line 260
    :cond_9
    invoke-direct {p0}, Lcom/android/dx/cf/direct/AnnotationParser;->parseConstant()Lcom/android/dx/rop/cst/Constant;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    return-object p0

    .line 265
    :cond_a
    const/4 v0, 0x4

    .line 266
    invoke-direct {p0, v0}, Lcom/android/dx/cf/direct/AnnotationParser;->requireLength(I)V

    .line 267
    .line 268
    .line 269
    iget-object v0, p0, Lcom/android/dx/cf/direct/AnnotationParser;->input:Lcom/android/dx/util/ByteArray$MyDataInputStream;

    .line 270
    .line 271
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    iget-object v1, p0, Lcom/android/dx/cf/direct/AnnotationParser;->input:Lcom/android/dx/util/ByteArray$MyDataInputStream;

    .line 276
    .line 277
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    iget-object v2, p0, Lcom/android/dx/cf/direct/AnnotationParser;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 282
    .line 283
    invoke-interface {v2, v0}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    check-cast v0, Lcom/android/dx/rop/cst/CstString;

    .line 288
    .line 289
    iget-object v2, p0, Lcom/android/dx/cf/direct/AnnotationParser;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 290
    .line 291
    invoke-interface {v2, v1}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    check-cast v1, Lcom/android/dx/rop/cst/CstString;

    .line 296
    .line 297
    iget-object v2, p0, Lcom/android/dx/cf/direct/AnnotationParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 298
    .line 299
    if-eqz v2, :cond_b

    .line 300
    .line 301
    new-instance v2, Ljava/lang/StringBuilder;

    .line 302
    .line 303
    const-string v4, "type_name: "

    .line 304
    .line 305
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    invoke-direct {p0, v3, v2}, Lcom/android/dx/cf/direct/AnnotationParser;->parsed(ILjava/lang/String;)V

    .line 320
    .line 321
    .line 322
    new-instance v2, Ljava/lang/StringBuilder;

    .line 323
    .line 324
    const-string v4, "const_name: "

    .line 325
    .line 326
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v1}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    invoke-direct {p0, v3, v2}, Lcom/android/dx/cf/direct/AnnotationParser;->parsed(ILjava/lang/String;)V

    .line 341
    .line 342
    .line 343
    :cond_b
    new-instance p0, Lcom/android/dx/rop/cst/CstEnumRef;

    .line 344
    .line 345
    new-instance v2, Lcom/android/dx/rop/cst/CstNat;

    .line 346
    .line 347
    invoke-direct {v2, v1, v0}, Lcom/android/dx/rop/cst/CstNat;-><init>(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;)V

    .line 348
    .line 349
    .line 350
    invoke-direct {p0, v2}, Lcom/android/dx/rop/cst/CstEnumRef;-><init>(Lcom/android/dx/rop/cst/CstNat;)V

    .line 351
    .line 352
    .line 353
    return-object p0

    .line 354
    :cond_c
    iget-object v0, p0, Lcom/android/dx/cf/direct/AnnotationParser;->input:Lcom/android/dx/util/ByteArray$MyDataInputStream;

    .line 355
    .line 356
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    iget-object v1, p0, Lcom/android/dx/cf/direct/AnnotationParser;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 361
    .line 362
    invoke-interface {v1, v0}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    check-cast v0, Lcom/android/dx/rop/cst/CstString;

    .line 367
    .line 368
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-static {v0}, Lcom/android/dx/rop/type/Type;->internReturnType(Ljava/lang/String;)Lcom/android/dx/rop/type/Type;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    iget-object v1, p0, Lcom/android/dx/cf/direct/AnnotationParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 377
    .line 378
    if-eqz v1, :cond_d

    .line 379
    .line 380
    new-instance v1, Ljava/lang/StringBuilder;

    .line 381
    .line 382
    const-string v2, "class_info: "

    .line 383
    .line 384
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    invoke-direct {p0, v3, v1}, Lcom/android/dx/cf/direct/AnnotationParser;->parsed(ILjava/lang/String;)V

    .line 399
    .line 400
    .line 401
    :cond_d
    new-instance p0, Lcom/android/dx/rop/cst/CstType;

    .line 402
    .line 403
    invoke-direct {p0, v0}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 404
    .line 405
    .line 406
    return-object p0

    .line 407
    :cond_e
    invoke-direct {p0}, Lcom/android/dx/cf/direct/AnnotationParser;->parseConstant()Lcom/android/dx/rop/cst/Constant;

    .line 408
    .line 409
    .line 410
    move-result-object p0

    .line 411
    check-cast p0, Lcom/android/dx/rop/cst/CstInteger;

    .line 412
    .line 413
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstInteger;->getValue()I

    .line 414
    .line 415
    .line 416
    move-result p0

    .line 417
    invoke-static {p0}, Lcom/android/dx/rop/cst/CstShort;->make(I)Lcom/android/dx/rop/cst/CstShort;

    .line 418
    .line 419
    .line 420
    move-result-object p0

    .line 421
    return-object p0

    .line 422
    :cond_f
    invoke-direct {p0}, Lcom/android/dx/cf/direct/AnnotationParser;->parseConstant()Lcom/android/dx/rop/cst/Constant;

    .line 423
    .line 424
    .line 425
    move-result-object p0

    .line 426
    check-cast p0, Lcom/android/dx/rop/cst/CstFloat;

    .line 427
    .line 428
    return-object p0

    .line 429
    :cond_10
    sget-object v0, Lcom/android/dx/rop/annotation/AnnotationVisibility;->EMBEDDED:Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 430
    .line 431
    invoke-direct {p0, v0}, Lcom/android/dx/cf/direct/AnnotationParser;->parseAnnotation(Lcom/android/dx/rop/annotation/AnnotationVisibility;)Lcom/android/dx/rop/annotation/Annotation;

    .line 432
    .line 433
    .line 434
    move-result-object p0

    .line 435
    new-instance v0, Lcom/android/dx/rop/cst/CstAnnotation;

    .line 436
    .line 437
    invoke-direct {v0, p0}, Lcom/android/dx/rop/cst/CstAnnotation;-><init>(Lcom/android/dx/rop/annotation/Annotation;)V

    .line 438
    .line 439
    .line 440
    return-object v0

    .line 441
    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private parsed(ILjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/direct/AnnotationParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/cf/direct/AnnotationParser;->bytes:Lcom/android/dx/util/ByteArray;

    .line 4
    .line 5
    iget v2, p0, Lcom/android/dx/cf/direct/AnnotationParser;->parseCursor:I

    .line 6
    .line 7
    invoke-interface {v0, v1, v2, p1, p2}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget p2, p0, Lcom/android/dx/cf/direct/AnnotationParser;->parseCursor:I

    .line 11
    .line 12
    add-int/2addr p2, p1

    .line 13
    iput p2, p0, Lcom/android/dx/cf/direct/AnnotationParser;->parseCursor:I

    .line 14
    .line 15
    return-void
.end method

.method private requireLength(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/direct/AnnotationParser;->input:Lcom/android/dx/util/ByteArray$MyDataInputStream;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-lt p0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance p0, Lcom/android/dx/cf/iface/ParseException;

    .line 11
    .line 12
    const-string p1, "truncated annotation attribute"

    .line 13
    .line 14
    invoke-direct {p0, p1}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p0
.end method


# virtual methods
.method public parseAnnotationAttribute(Lcom/android/dx/rop/annotation/AnnotationVisibility;)Lcom/android/dx/rop/annotation/Annotations;
    .locals 0

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Lcom/android/dx/cf/direct/AnnotationParser;->parseAnnotations(Lcom/android/dx/rop/annotation/AnnotationVisibility;)Lcom/android/dx/rop/annotation/Annotations;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lcom/android/dx/cf/direct/AnnotationParser;->input:Lcom/android/dx/util/ByteArray$MyDataInputStream;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    new-instance p0, Lcom/android/dx/cf/iface/ParseException;

    .line 15
    .line 16
    const-string p1, "extra data in attribute"

    .line 17
    .line 18
    invoke-direct {p0, p1}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    const-string p1, "shouldn\'t happen"

    .line 24
    .line 25
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public parseParameterAttribute(Lcom/android/dx/rop/annotation/AnnotationVisibility;)Lcom/android/dx/rop/annotation/AnnotationsList;
    .locals 0

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Lcom/android/dx/cf/direct/AnnotationParser;->parseAnnotationsList(Lcom/android/dx/rop/annotation/AnnotationVisibility;)Lcom/android/dx/rop/annotation/AnnotationsList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lcom/android/dx/cf/direct/AnnotationParser;->input:Lcom/android/dx/util/ByteArray$MyDataInputStream;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    new-instance p0, Lcom/android/dx/cf/iface/ParseException;

    .line 15
    .line 16
    const-string p1, "extra data in attribute"

    .line 17
    .line 18
    invoke-direct {p0, p1}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    const-string p1, "shouldn\'t happen"

    .line 24
    .line 25
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public parseValueAttribute()Lcom/android/dx/rop/cst/Constant;
    .locals 1

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/android/dx/cf/direct/AnnotationParser;->parseValue()Lcom/android/dx/rop/cst/Constant;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Lcom/android/dx/cf/direct/AnnotationParser;->input:Lcom/android/dx/util/ByteArray$MyDataInputStream;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance p0, Lcom/android/dx/cf/iface/ParseException;

    .line 15
    .line 16
    const-string v0, "extra data in attribute"

    .line 17
    .line 18
    invoke-direct {p0, v0}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    const-string v0, "shouldn\'t happen"

    .line 24
    .line 25
    invoke-static {v0, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method
