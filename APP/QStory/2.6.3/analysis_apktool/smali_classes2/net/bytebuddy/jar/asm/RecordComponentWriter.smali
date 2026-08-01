.class final Lnet/bytebuddy/jar/asm/RecordComponentWriter;
.super Lnet/bytebuddy/jar/asm/RecordComponentVisitor;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
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
.method public constructor <init>(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/high16 v0, 0x90000

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    iput p2, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->nameIndex:I

    .line 13
    .line 14
    invoke-virtual {p1, p3}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    iput p2, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->descriptorIndex:I

    .line 19
    .line 20
    if-eqz p4, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1, p4}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iput p1, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->signatureIndex:I

    .line 27
    .line 28
    :cond_0
    return-void
.end method


# virtual methods
.method public final collectAttributePrototypes(Lnet/bytebuddy/jar/asm/Attribute$Set;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/Attribute$Set;->addAttributes(Lnet/bytebuddy/jar/asm/Attribute;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public computeRecordComponentInfoSize()I
    .locals 5

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->signatureIndex:I

    .line 5
    .line 6
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/jar/asm/Attribute;->computeAttributesSize(Lnet/bytebuddy/jar/asm/SymbolTable;II)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    add-int/lit8 v0, v0, 0x6

    .line 11
    .line 12
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 13
    .line 14
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 15
    .line 16
    iget-object v3, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 17
    .line 18
    iget-object v4, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 19
    .line 20
    invoke-static {v1, v2, v3, v4}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->computeAnnotationsSize(Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/AnnotationWriter;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Lnet/bytebuddy/jar/asm/Attribute;->computeAttributesSize(Lnet/bytebuddy/jar/asm/SymbolTable;)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    add-int/2addr p0, v0

    .line 36
    return p0

    .line 37
    :cond_0
    return v0
.end method

.method public putRecordComponentInfo(Lnet/bytebuddy/jar/asm/ByteVector;)V
    .locals 9

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->nameIndex:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->descriptorIndex:I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 10
    .line 11
    .line 12
    iget v0, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->signatureIndex:I

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v1

    .line 20
    :goto_0
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    :cond_1
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 27
    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 33
    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 39
    .line 40
    if-eqz v2, :cond_4

    .line 41
    .line 42
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 45
    .line 46
    if-eqz v2, :cond_5

    .line 47
    .line 48
    invoke-virtual {v2}, Lnet/bytebuddy/jar/asm/Attribute;->getAttributeCount()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    add-int/2addr v0, v2

    .line 53
    :cond_5
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 57
    .line 58
    iget v2, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->signatureIndex:I

    .line 59
    .line 60
    invoke-static {v0, v1, v2, p1}, Lnet/bytebuddy/jar/asm/Attribute;->putAttributes(Lnet/bytebuddy/jar/asm/SymbolTable;IILnet/bytebuddy/jar/asm/ByteVector;)V

    .line 61
    .line 62
    .line 63
    iget-object v3, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 64
    .line 65
    iget-object v4, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 66
    .line 67
    iget-object v5, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 68
    .line 69
    iget-object v6, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 70
    .line 71
    iget-object v7, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 72
    .line 73
    move-object v8, p1

    .line 74
    invoke-static/range {v3 .. v8}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->putAnnotations(Lnet/bytebuddy/jar/asm/SymbolTable;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/ByteVector;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 78
    .line 79
    if-eqz p1, :cond_6

    .line 80
    .line 81
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 82
    .line 83
    invoke-virtual {p1, p0, v8}, Lnet/bytebuddy/jar/asm/Attribute;->putAttributes(Lnet/bytebuddy/jar/asm/SymbolTable;Lnet/bytebuddy/jar/asm/ByteVector;)V

    .line 84
    .line 85
    .line 86
    :cond_6
    return-void
.end method

.method public visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 6
    .line 7
    invoke-static {v0, p1, p2}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 15
    .line 16
    invoke-static {v0, p1, p2}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 21
    .line 22
    return-object p1
.end method

.method public visitAttribute(Lnet/bytebuddy/jar/asm/Attribute;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 2
    .line 3
    iput-object v0, p1, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 4
    .line 5
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

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
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 6
    .line 7
    invoke-static {v0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 15
    .line 16
    invoke-static {v0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 21
    .line 22
    return-object p1
.end method
