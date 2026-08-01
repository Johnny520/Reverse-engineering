.class final Lnet/bytebuddy/jar/asm/FieldWriter;
.super Lnet/bytebuddy/jar/asm/FieldVisitor;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private final accessFlags:I

.field private constantValueIndex:I

.field private final descriptorIndex:I

.field private firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

.field private lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

.field private lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

.field private lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

.field private lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

.field private final nameIndex:I

.field private signatureIndex:I

.field private final symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/jar/asm/SymbolTable;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/high16 v0, 0x90000

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/FieldVisitor;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 7
    .line 8
    iput p2, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->accessFlags:I

    .line 9
    .line 10
    invoke-virtual {p1, p3}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    iput p2, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->nameIndex:I

    .line 15
    .line 16
    invoke-virtual {p1, p4}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    iput p2, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->descriptorIndex:I

    .line 21
    .line 22
    if-eqz p5, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1, p5}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    iput p2, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->signatureIndex:I

    .line 29
    .line 30
    :cond_0
    if-eqz p6, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1, p6}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstant(Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget p1, p1, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 37
    .line 38
    iput p1, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->constantValueIndex:I

    .line 39
    .line 40
    :cond_1
    return-void
.end method


# virtual methods
.method public final collectAttributePrototypes(Lnet/bytebuddy/jar/asm/Attribute$Set;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/Attribute$Set;->addAttributes(Lnet/bytebuddy/jar/asm/Attribute;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public computeFieldInfoSize()I
    .locals 5

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->constantValueIndex:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 6
    .line 7
    const-string v1, "ConstantValue"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    const/16 v0, 0x10

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/16 v0, 0x8

    .line 16
    .line 17
    :goto_0
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 18
    .line 19
    iget v2, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->accessFlags:I

    .line 20
    .line 21
    iget v3, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->signatureIndex:I

    .line 22
    .line 23
    invoke-static {v1, v2, v3}, Lnet/bytebuddy/jar/asm/Attribute;->computeAttributesSize(Lnet/bytebuddy/jar/asm/SymbolTable;II)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    add-int/2addr v1, v0

    .line 28
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 29
    .line 30
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 31
    .line 32
    iget-object v3, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 33
    .line 34
    iget-object v4, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 35
    .line 36
    invoke-static {v0, v2, v3, v4}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->computeAnnotationsSize(Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/AnnotationWriter;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    add-int/2addr v1, v0

    .line 41
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Lnet/bytebuddy/jar/asm/Attribute;->computeAttributesSize(Lnet/bytebuddy/jar/asm/SymbolTable;)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    add-int/2addr p0, v1

    .line 52
    return p0

    .line 53
    :cond_1
    return v1
.end method

.method public putFieldInfo(Lnet/bytebuddy/jar/asm/ByteVector;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->getMajorVersion()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x31

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    move v0, v3

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const/16 v1, 0x1000

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move v1, v2

    .line 22
    :goto_1
    iget v4, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->accessFlags:I

    .line 23
    .line 24
    not-int v1, v1

    .line 25
    and-int/2addr v1, v4

    .line 26
    invoke-virtual {p1, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget v4, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->nameIndex:I

    .line 31
    .line 32
    invoke-virtual {v1, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget v4, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->descriptorIndex:I

    .line 37
    .line 38
    invoke-virtual {v1, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 39
    .line 40
    .line 41
    iget v1, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->constantValueIndex:I

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    move v2, v3

    .line 46
    :cond_2
    iget v1, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->accessFlags:I

    .line 47
    .line 48
    and-int/lit16 v3, v1, 0x1000

    .line 49
    .line 50
    if-eqz v3, :cond_3

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    :cond_3
    iget v0, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->signatureIndex:I

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    :cond_4
    const/high16 v0, 0x20000

    .line 63
    .line 64
    and-int/2addr v0, v1

    .line 65
    if-eqz v0, :cond_5

    .line 66
    .line 67
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    :cond_5
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 70
    .line 71
    if-eqz v0, :cond_6

    .line 72
    .line 73
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    :cond_6
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 76
    .line 77
    if-eqz v0, :cond_7

    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    :cond_7
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 82
    .line 83
    if-eqz v0, :cond_8

    .line 84
    .line 85
    add-int/lit8 v2, v2, 0x1

    .line 86
    .line 87
    :cond_8
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 88
    .line 89
    if-eqz v0, :cond_9

    .line 90
    .line 91
    add-int/lit8 v2, v2, 0x1

    .line 92
    .line 93
    :cond_9
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 94
    .line 95
    if-eqz v0, :cond_a

    .line 96
    .line 97
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Attribute;->getAttributeCount()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    add-int/2addr v2, v0

    .line 102
    :cond_a
    invoke-virtual {p1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 103
    .line 104
    .line 105
    iget v0, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->constantValueIndex:I

    .line 106
    .line 107
    if-eqz v0, :cond_b

    .line 108
    .line 109
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 110
    .line 111
    const-string v1, "ConstantValue"

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    const/4 v1, 0x2

    .line 122
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget v1, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->constantValueIndex:I

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 129
    .line 130
    .line 131
    :cond_b
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 132
    .line 133
    iget v1, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->accessFlags:I

    .line 134
    .line 135
    iget v2, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->signatureIndex:I

    .line 136
    .line 137
    invoke-static {v0, v1, v2, p1}, Lnet/bytebuddy/jar/asm/Attribute;->putAttributes(Lnet/bytebuddy/jar/asm/SymbolTable;IILnet/bytebuddy/jar/asm/ByteVector;)V

    .line 138
    .line 139
    .line 140
    iget-object v3, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 141
    .line 142
    iget-object v4, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 143
    .line 144
    iget-object v5, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 145
    .line 146
    iget-object v6, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 147
    .line 148
    iget-object v7, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 149
    .line 150
    move-object v8, p1

    .line 151
    invoke-static/range {v3 .. v8}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->putAnnotations(Lnet/bytebuddy/jar/asm/SymbolTable;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/ByteVector;)V

    .line 152
    .line 153
    .line 154
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 155
    .line 156
    if-eqz p1, :cond_c

    .line 157
    .line 158
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 159
    .line 160
    invoke-virtual {p1, p0, v8}, Lnet/bytebuddy/jar/asm/Attribute;->putAttributes(Lnet/bytebuddy/jar/asm/SymbolTable;Lnet/bytebuddy/jar/asm/ByteVector;)V

    .line 161
    .line 162
    .line 163
    :cond_c
    return-void
.end method

.method public visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 6
    .line 7
    invoke-static {v0, p1, p2}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 15
    .line 16
    invoke-static {v0, p1, p2}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 21
    .line 22
    return-object p1
.end method

.method public visitAttribute(Lnet/bytebuddy/jar/asm/Attribute;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 2
    .line 3
    iput-object v0, p1, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 4
    .line 5
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 6
    .line 7
    return-void
.end method

.method public visitEnd()V
    .locals 0

    .line 1
    return-void
.end method

.method public visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 6
    .line 7
    invoke-static {v0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 15
    .line 16
    invoke-static {v0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/FieldWriter;->lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 21
    .line 22
    return-object p1
.end method
