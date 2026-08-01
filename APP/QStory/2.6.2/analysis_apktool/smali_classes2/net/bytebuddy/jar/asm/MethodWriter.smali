.class final Lnet/bytebuddy/jar/asm/MethodWriter;
.super Lnet/bytebuddy/jar/asm/MethodVisitor;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field static final COMPUTE_ALL_FRAMES:I = 0x4

.field static final COMPUTE_INSERTED_FRAMES:I = 0x3

.field static final COMPUTE_MAX_STACK_AND_LOCAL:I = 0x1

.field static final COMPUTE_MAX_STACK_AND_LOCAL_FROM_FRAMES:I = 0x2

.field static final COMPUTE_NOTHING:I

.field private static final NA:I

.field private static final STACK_SIZE_DELTA:[I


# instance fields
.field private final accessFlags:I

.field private final code:Lnet/bytebuddy/jar/asm/ByteVector;

.field private final compute:I

.field private currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

.field private currentFrame:[I

.field private currentLocals:I

.field private defaultValue:Lnet/bytebuddy/jar/asm/ByteVector;

.field private final descriptor:Ljava/lang/String;

.field private final descriptorIndex:I

.field private final exceptionIndexTable:[I

.field private firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

.field private firstBasicBlock:Lnet/bytebuddy/jar/asm/Label;

.field private firstCodeAttribute:Lnet/bytebuddy/jar/asm/Attribute;

.field private firstHandler:Lnet/bytebuddy/jar/asm/Handler;

.field private hasAsmInstructions:Z

.field private hasSubroutines:Z

.field private invisibleAnnotableParameterCount:I

.field private lastBasicBlock:Lnet/bytebuddy/jar/asm/Label;

.field private lastBytecodeOffset:I

.field private lastCodeRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

.field private lastCodeRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

.field private lastHandler:Lnet/bytebuddy/jar/asm/Handler;

.field private lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

.field private lastRuntimeInvisibleParameterAnnotations:[Lnet/bytebuddy/jar/asm/AnnotationWriter;

.field private lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

.field private lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

.field private lastRuntimeVisibleParameterAnnotations:[Lnet/bytebuddy/jar/asm/AnnotationWriter;

.field private lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

.field private lineNumberTable:Lnet/bytebuddy/jar/asm/ByteVector;

.field private lineNumberTableLength:I

.field private localVariableTable:Lnet/bytebuddy/jar/asm/ByteVector;

.field private localVariableTableLength:I

.field private localVariableTypeTable:Lnet/bytebuddy/jar/asm/ByteVector;

.field private localVariableTypeTableLength:I

.field private maxLocals:I

.field private maxRelativeStackSize:I

.field private maxStack:I

.field private final name:Ljava/lang/String;

.field private final nameIndex:I

.field private final numberOfExceptions:I

.field private parameters:Lnet/bytebuddy/jar/asm/ByteVector;

.field private parametersCount:I

.field private previousFrame:[I

.field private previousFrameOffset:I

.field private relativeStackSize:I

.field private final signatureIndex:I

.field private sourceLength:I

.field private sourceOffset:I

.field private stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

.field private stackMapTableNumberOfEntries:I

.field private final symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

.field private visibleAnnotableParameterCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xca

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lnet/bytebuddy/jar/asm/MethodWriter;->STACK_SIZE_DELTA:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x0
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x2
        0x2
        0x1
        0x1
        0x1
        0x2
        0x2
        0x1
        0x1
        0x1
        0x0
        0x0
        0x1
        0x2
        0x1
        0x2
        0x1
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        -0x1
        0x0
        -0x1
        0x0
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        -0x3
        -0x4
        -0x3
        -0x4
        -0x3
        -0x3
        -0x3
        -0x3
        -0x1
        -0x2
        0x1
        0x1
        0x1
        0x2
        0x2
        0x2
        0x0
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        -0x2
        0x0
        0x0
        0x0
        0x0
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        -0x2
        0x0
        0x1
        0x0
        0x1
        -0x1
        -0x1
        0x0
        0x0
        0x1
        0x1
        -0x1
        0x0
        -0x1
        0x0
        0x0
        0x0
        -0x3
        -0x1
        -0x1
        -0x3
        -0x3
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x2
        -0x2
        -0x2
        -0x2
        -0x2
        -0x2
        -0x2
        -0x2
        0x0
        0x1
        0x0
        -0x1
        -0x1
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x1
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        -0x1
        -0x1
        0x0
        0x0
        -0x1
        -0x1
        0x0
        0x0
    .end array-data
.end method

.method public constructor <init>(Lnet/bytebuddy/jar/asm/SymbolTable;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/high16 v0, 0x90000

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;-><init>(I)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 7
    .line 8
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 12
    .line 13
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 14
    .line 15
    const-string v0, "<init>"

    .line 16
    .line 17
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/high16 v0, 0x40000

    .line 24
    .line 25
    or-int/2addr v0, p2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v0, p2

    .line 28
    :goto_0
    iput v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->accessFlags:I

    .line 29
    .line 30
    invoke-virtual {p1, p3}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iput v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->nameIndex:I

    .line 35
    .line 36
    iput-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->name:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p1, p4}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    iput p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->descriptorIndex:I

    .line 43
    .line 44
    iput-object p4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->descriptor:Ljava/lang/String;

    .line 45
    .line 46
    const/4 p3, 0x0

    .line 47
    if-nez p5, :cond_1

    .line 48
    .line 49
    move p5, p3

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-virtual {p1, p5}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result p5

    .line 55
    :goto_1
    iput p5, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->signatureIndex:I

    .line 56
    .line 57
    if-eqz p6, :cond_2

    .line 58
    .line 59
    array-length p5, p6

    .line 60
    if-lez p5, :cond_2

    .line 61
    .line 62
    array-length p5, p6

    .line 63
    iput p5, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->numberOfExceptions:I

    .line 64
    .line 65
    new-array p5, p5, [I

    .line 66
    .line 67
    iput-object p5, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->exceptionIndexTable:[I

    .line 68
    .line 69
    :goto_2
    iget p5, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->numberOfExceptions:I

    .line 70
    .line 71
    if-ge p3, p5, :cond_3

    .line 72
    .line 73
    iget-object p5, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->exceptionIndexTable:[I

    .line 74
    .line 75
    aget-object v0, p6, p3

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget v0, v0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 82
    .line 83
    aput v0, p5, p3

    .line 84
    .line 85
    add-int/lit8 p3, p3, 0x1

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    iput p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->numberOfExceptions:I

    .line 89
    .line 90
    const/4 p1, 0x0

    .line 91
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->exceptionIndexTable:[I

    .line 92
    .line 93
    :cond_3
    iput p7, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->compute:I

    .line 94
    .line 95
    if-eqz p7, :cond_5

    .line 96
    .line 97
    invoke-static {p4}, Lnet/bytebuddy/jar/asm/Type;->getArgumentsAndReturnSizes(Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    shr-int/lit8 p1, p1, 0x2

    .line 102
    .line 103
    and-int/lit8 p2, p2, 0x8

    .line 104
    .line 105
    if-eqz p2, :cond_4

    .line 106
    .line 107
    add-int/lit8 p1, p1, -0x1

    .line 108
    .line 109
    :cond_4
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxLocals:I

    .line 110
    .line 111
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentLocals:I

    .line 112
    .line 113
    new-instance p1, Lnet/bytebuddy/jar/asm/Label;

    .line 114
    .line 115
    invoke-direct {p1}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 116
    .line 117
    .line 118
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/MethodWriter;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 121
    .line 122
    .line 123
    :cond_5
    return-void
.end method

.method private addSuccessorToCurrentBasicBlock(ILnet/bytebuddy/jar/asm/Label;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 2
    .line 3
    new-instance v0, Lnet/bytebuddy/jar/asm/Edge;

    .line 4
    .line 5
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/Label;->outgoingEdges:Lnet/bytebuddy/jar/asm/Edge;

    .line 6
    .line 7
    invoke-direct {v0, p1, p2, v1}, Lnet/bytebuddy/jar/asm/Edge;-><init>(ILnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Edge;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/Label;->outgoingEdges:Lnet/bytebuddy/jar/asm/Edge;

    .line 11
    .line 12
    return-void
.end method

.method private computeAllFrames()V
    .locals 11

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstHandler:Lnet/bytebuddy/jar/asm/Handler;

    .line 2
    .line 3
    :goto_0
    const-string v1, "java/lang/Throwable"

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/Handler;->catchTypeDescriptor:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    move-object v1, v2

    .line 13
    :goto_1
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 14
    .line 15
    invoke-static {v2, v1}, Lnet/bytebuddy/jar/asm/Frame;->getAbstractTypeFromInternalName(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/Handler;->handlerPc:Lnet/bytebuddy/jar/asm/Label;

    .line 20
    .line 21
    invoke-virtual {v2}, Lnet/bytebuddy/jar/asm/Label;->getCanonicalInstance()Lnet/bytebuddy/jar/asm/Label;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-short v3, v2, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 26
    .line 27
    or-int/lit8 v3, v3, 0x2

    .line 28
    .line 29
    int-to-short v3, v3

    .line 30
    iput-short v3, v2, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 31
    .line 32
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/Handler;->startPc:Lnet/bytebuddy/jar/asm/Label;

    .line 33
    .line 34
    invoke-virtual {v3}, Lnet/bytebuddy/jar/asm/Label;->getCanonicalInstance()Lnet/bytebuddy/jar/asm/Label;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/Handler;->endPc:Lnet/bytebuddy/jar/asm/Label;

    .line 39
    .line 40
    invoke-virtual {v4}, Lnet/bytebuddy/jar/asm/Label;->getCanonicalInstance()Lnet/bytebuddy/jar/asm/Label;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    :goto_2
    if-eq v3, v4, :cond_1

    .line 45
    .line 46
    new-instance v5, Lnet/bytebuddy/jar/asm/Edge;

    .line 47
    .line 48
    iget-object v6, v3, Lnet/bytebuddy/jar/asm/Label;->outgoingEdges:Lnet/bytebuddy/jar/asm/Edge;

    .line 49
    .line 50
    invoke-direct {v5, v1, v2, v6}, Lnet/bytebuddy/jar/asm/Edge;-><init>(ILnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Edge;)V

    .line 51
    .line 52
    .line 53
    iput-object v5, v3, Lnet/bytebuddy/jar/asm/Label;->outgoingEdges:Lnet/bytebuddy/jar/asm/Edge;

    .line 54
    .line 55
    iget-object v3, v3, Lnet/bytebuddy/jar/asm/Label;->nextBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_1
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/Handler;->nextHandler:Lnet/bytebuddy/jar/asm/Handler;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 62
    .line 63
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 64
    .line 65
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 66
    .line 67
    iget v3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->accessFlags:I

    .line 68
    .line 69
    iget-object v4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->descriptor:Ljava/lang/String;

    .line 70
    .line 71
    iget v5, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxLocals:I

    .line 72
    .line 73
    invoke-virtual {v0, v2, v3, v4, v5}, Lnet/bytebuddy/jar/asm/Frame;->setInputFrameFromDescriptor(Lnet/bytebuddy/jar/asm/SymbolTable;ILjava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, p0}, Lnet/bytebuddy/jar/asm/Frame;->accept(Lnet/bytebuddy/jar/asm/MethodWriter;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 80
    .line 81
    sget-object v2, Lnet/bytebuddy/jar/asm/Label;->EMPTY_LIST:Lnet/bytebuddy/jar/asm/Label;

    .line 82
    .line 83
    iput-object v2, v0, Lnet/bytebuddy/jar/asm/Label;->nextListElement:Lnet/bytebuddy/jar/asm/Label;

    .line 84
    .line 85
    const/4 v2, 0x0

    .line 86
    move v3, v2

    .line 87
    :goto_3
    sget-object v4, Lnet/bytebuddy/jar/asm/Label;->EMPTY_LIST:Lnet/bytebuddy/jar/asm/Label;

    .line 88
    .line 89
    if-eq v0, v4, :cond_6

    .line 90
    .line 91
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/Label;->nextListElement:Lnet/bytebuddy/jar/asm/Label;

    .line 92
    .line 93
    const/4 v5, 0x0

    .line 94
    iput-object v5, v0, Lnet/bytebuddy/jar/asm/Label;->nextListElement:Lnet/bytebuddy/jar/asm/Label;

    .line 95
    .line 96
    iget-short v5, v0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 97
    .line 98
    or-int/lit8 v5, v5, 0x8

    .line 99
    .line 100
    int-to-short v5, v5

    .line 101
    iput-short v5, v0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 102
    .line 103
    iget-object v5, v0, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 104
    .line 105
    invoke-virtual {v5}, Lnet/bytebuddy/jar/asm/Frame;->getInputStackSize()I

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    iget-short v6, v0, Lnet/bytebuddy/jar/asm/Label;->outputStackMax:S

    .line 110
    .line 111
    add-int/2addr v5, v6

    .line 112
    if-le v5, v3, :cond_3

    .line 113
    .line 114
    move v3, v5

    .line 115
    :cond_3
    iget-object v5, v0, Lnet/bytebuddy/jar/asm/Label;->outgoingEdges:Lnet/bytebuddy/jar/asm/Edge;

    .line 116
    .line 117
    :goto_4
    if-eqz v5, :cond_5

    .line 118
    .line 119
    iget-object v6, v5, Lnet/bytebuddy/jar/asm/Edge;->successor:Lnet/bytebuddy/jar/asm/Label;

    .line 120
    .line 121
    invoke-virtual {v6}, Lnet/bytebuddy/jar/asm/Label;->getCanonicalInstance()Lnet/bytebuddy/jar/asm/Label;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    iget-object v7, v0, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 126
    .line 127
    iget-object v8, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 128
    .line 129
    iget-object v9, v6, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 130
    .line 131
    iget v10, v5, Lnet/bytebuddy/jar/asm/Edge;->info:I

    .line 132
    .line 133
    invoke-virtual {v7, v8, v9, v10}, Lnet/bytebuddy/jar/asm/Frame;->merge(Lnet/bytebuddy/jar/asm/SymbolTable;Lnet/bytebuddy/jar/asm/Frame;I)Z

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-eqz v7, :cond_4

    .line 138
    .line 139
    iget-object v7, v6, Lnet/bytebuddy/jar/asm/Label;->nextListElement:Lnet/bytebuddy/jar/asm/Label;

    .line 140
    .line 141
    if-nez v7, :cond_4

    .line 142
    .line 143
    iput-object v4, v6, Lnet/bytebuddy/jar/asm/Label;->nextListElement:Lnet/bytebuddy/jar/asm/Label;

    .line 144
    .line 145
    move-object v4, v6

    .line 146
    :cond_4
    iget-object v5, v5, Lnet/bytebuddy/jar/asm/Edge;->nextEdge:Lnet/bytebuddy/jar/asm/Edge;

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_5
    move-object v0, v4

    .line 150
    goto :goto_3

    .line 151
    :cond_6
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 152
    .line 153
    :goto_5
    if-eqz v0, :cond_b

    .line 154
    .line 155
    iget-short v4, v0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 156
    .line 157
    const/16 v5, 0xa

    .line 158
    .line 159
    and-int/2addr v4, v5

    .line 160
    if-ne v4, v5, :cond_7

    .line 161
    .line 162
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 163
    .line 164
    invoke-virtual {v4, p0}, Lnet/bytebuddy/jar/asm/Frame;->accept(Lnet/bytebuddy/jar/asm/MethodWriter;)V

    .line 165
    .line 166
    .line 167
    :cond_7
    iget-short v4, v0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 168
    .line 169
    and-int/lit8 v4, v4, 0x8

    .line 170
    .line 171
    if-nez v4, :cond_a

    .line 172
    .line 173
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/Label;->nextBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 174
    .line 175
    iget v5, v0, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 176
    .line 177
    if-nez v4, :cond_8

    .line 178
    .line 179
    iget-object v6, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 180
    .line 181
    iget v6, v6, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_8
    iget v6, v4, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 185
    .line 186
    :goto_6
    const/4 v7, 0x1

    .line 187
    sub-int/2addr v6, v7

    .line 188
    if-lt v6, v5, :cond_a

    .line 189
    .line 190
    move v8, v5

    .line 191
    :goto_7
    iget-object v9, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 192
    .line 193
    if-ge v8, v6, :cond_9

    .line 194
    .line 195
    iget-object v9, v9, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 196
    .line 197
    aput-byte v2, v9, v8

    .line 198
    .line 199
    add-int/lit8 v8, v8, 0x1

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_9
    iget-object v8, v9, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 203
    .line 204
    const/16 v9, -0x41

    .line 205
    .line 206
    aput-byte v9, v8, v6

    .line 207
    .line 208
    invoke-virtual {p0, v5, v2, v7}, Lnet/bytebuddy/jar/asm/MethodWriter;->visitFrameStart(III)I

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    iget-object v6, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentFrame:[I

    .line 213
    .line 214
    iget-object v8, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 215
    .line 216
    invoke-static {v8, v1}, Lnet/bytebuddy/jar/asm/Frame;->getAbstractTypeFromInternalName(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;)I

    .line 217
    .line 218
    .line 219
    move-result v8

    .line 220
    aput v8, v6, v5

    .line 221
    .line 222
    invoke-virtual {p0}, Lnet/bytebuddy/jar/asm/MethodWriter;->visitFrameEnd()V

    .line 223
    .line 224
    .line 225
    iget-object v5, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstHandler:Lnet/bytebuddy/jar/asm/Handler;

    .line 226
    .line 227
    invoke-static {v5, v0, v4}, Lnet/bytebuddy/jar/asm/Handler;->removeRange(Lnet/bytebuddy/jar/asm/Handler;Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Handler;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    iput-object v4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstHandler:Lnet/bytebuddy/jar/asm/Handler;

    .line 232
    .line 233
    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    :cond_a
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/Label;->nextBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_b
    iput v3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxStack:I

    .line 241
    .line 242
    return-void
.end method

.method private computeMaxStackAndLocal()V
    .locals 8

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstHandler:Lnet/bytebuddy/jar/asm/Handler;

    .line 2
    .line 3
    :goto_0
    const v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/Handler;->handlerPc:Lnet/bytebuddy/jar/asm/Label;

    .line 9
    .line 10
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/Handler;->startPc:Lnet/bytebuddy/jar/asm/Label;

    .line 11
    .line 12
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/Handler;->endPc:Lnet/bytebuddy/jar/asm/Label;

    .line 13
    .line 14
    :goto_1
    if-eq v3, v4, :cond_1

    .line 15
    .line 16
    iget-short v5, v3, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 17
    .line 18
    and-int/lit8 v5, v5, 0x10

    .line 19
    .line 20
    iget-object v6, v3, Lnet/bytebuddy/jar/asm/Label;->outgoingEdges:Lnet/bytebuddy/jar/asm/Edge;

    .line 21
    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    new-instance v5, Lnet/bytebuddy/jar/asm/Edge;

    .line 25
    .line 26
    invoke-direct {v5, v1, v2, v6}, Lnet/bytebuddy/jar/asm/Edge;-><init>(ILnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Edge;)V

    .line 27
    .line 28
    .line 29
    iput-object v5, v3, Lnet/bytebuddy/jar/asm/Label;->outgoingEdges:Lnet/bytebuddy/jar/asm/Edge;

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_0
    iget-object v5, v6, Lnet/bytebuddy/jar/asm/Edge;->nextEdge:Lnet/bytebuddy/jar/asm/Edge;

    .line 33
    .line 34
    new-instance v6, Lnet/bytebuddy/jar/asm/Edge;

    .line 35
    .line 36
    iget-object v7, v5, Lnet/bytebuddy/jar/asm/Edge;->nextEdge:Lnet/bytebuddy/jar/asm/Edge;

    .line 37
    .line 38
    invoke-direct {v6, v1, v2, v7}, Lnet/bytebuddy/jar/asm/Edge;-><init>(ILnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Edge;)V

    .line 39
    .line 40
    .line 41
    iput-object v6, v5, Lnet/bytebuddy/jar/asm/Edge;->nextEdge:Lnet/bytebuddy/jar/asm/Edge;

    .line 42
    .line 43
    :goto_2
    iget-object v3, v3, Lnet/bytebuddy/jar/asm/Label;->nextBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/Handler;->nextHandler:Lnet/bytebuddy/jar/asm/Handler;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    iget-boolean v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->hasSubroutines:Z

    .line 50
    .line 51
    const/4 v2, 0x1

    .line 52
    if-eqz v0, :cond_7

    .line 53
    .line 54
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/Label;->markSubroutine(S)V

    .line 57
    .line 58
    .line 59
    move v0, v2

    .line 60
    move v3, v0

    .line 61
    :goto_3
    iget-object v4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 62
    .line 63
    if-gt v0, v3, :cond_5

    .line 64
    .line 65
    :goto_4
    if-eqz v4, :cond_4

    .line 66
    .line 67
    iget-short v5, v4, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 68
    .line 69
    and-int/lit8 v5, v5, 0x10

    .line 70
    .line 71
    if-eqz v5, :cond_3

    .line 72
    .line 73
    iget-short v5, v4, Lnet/bytebuddy/jar/asm/Label;->subroutineId:S

    .line 74
    .line 75
    if-ne v5, v0, :cond_3

    .line 76
    .line 77
    iget-object v5, v4, Lnet/bytebuddy/jar/asm/Label;->outgoingEdges:Lnet/bytebuddy/jar/asm/Edge;

    .line 78
    .line 79
    iget-object v5, v5, Lnet/bytebuddy/jar/asm/Edge;->nextEdge:Lnet/bytebuddy/jar/asm/Edge;

    .line 80
    .line 81
    iget-object v5, v5, Lnet/bytebuddy/jar/asm/Edge;->successor:Lnet/bytebuddy/jar/asm/Label;

    .line 82
    .line 83
    iget-short v6, v5, Lnet/bytebuddy/jar/asm/Label;->subroutineId:S

    .line 84
    .line 85
    if-nez v6, :cond_3

    .line 86
    .line 87
    add-int/lit8 v3, v3, 0x1

    .line 88
    .line 89
    int-to-short v3, v3

    .line 90
    invoke-virtual {v5, v3}, Lnet/bytebuddy/jar/asm/Label;->markSubroutine(S)V

    .line 91
    .line 92
    .line 93
    :cond_3
    iget-object v4, v4, Lnet/bytebuddy/jar/asm/Label;->nextBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 97
    .line 98
    int-to-short v0, v0

    .line 99
    goto :goto_3

    .line 100
    :cond_5
    :goto_5
    if-eqz v4, :cond_7

    .line 101
    .line 102
    iget-short v0, v4, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 103
    .line 104
    and-int/lit8 v0, v0, 0x10

    .line 105
    .line 106
    if-eqz v0, :cond_6

    .line 107
    .line 108
    iget-object v0, v4, Lnet/bytebuddy/jar/asm/Label;->outgoingEdges:Lnet/bytebuddy/jar/asm/Edge;

    .line 109
    .line 110
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/Edge;->nextEdge:Lnet/bytebuddy/jar/asm/Edge;

    .line 111
    .line 112
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/Edge;->successor:Lnet/bytebuddy/jar/asm/Label;

    .line 113
    .line 114
    invoke-virtual {v0, v4}, Lnet/bytebuddy/jar/asm/Label;->addSubroutineRetSuccessors(Lnet/bytebuddy/jar/asm/Label;)V

    .line 115
    .line 116
    .line 117
    :cond_6
    iget-object v4, v4, Lnet/bytebuddy/jar/asm/Label;->nextBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_7
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 121
    .line 122
    sget-object v3, Lnet/bytebuddy/jar/asm/Label;->EMPTY_LIST:Lnet/bytebuddy/jar/asm/Label;

    .line 123
    .line 124
    iput-object v3, v0, Lnet/bytebuddy/jar/asm/Label;->nextListElement:Lnet/bytebuddy/jar/asm/Label;

    .line 125
    .line 126
    iget v3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxStack:I

    .line 127
    .line 128
    :cond_8
    sget-object v4, Lnet/bytebuddy/jar/asm/Label;->EMPTY_LIST:Lnet/bytebuddy/jar/asm/Label;

    .line 129
    .line 130
    if-eq v0, v4, :cond_d

    .line 131
    .line 132
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/Label;->nextListElement:Lnet/bytebuddy/jar/asm/Label;

    .line 133
    .line 134
    iget-short v5, v0, Lnet/bytebuddy/jar/asm/Label;->inputStackSize:S

    .line 135
    .line 136
    iget-short v6, v0, Lnet/bytebuddy/jar/asm/Label;->outputStackMax:S

    .line 137
    .line 138
    add-int/2addr v6, v5

    .line 139
    if-le v6, v3, :cond_9

    .line 140
    .line 141
    move v3, v6

    .line 142
    :cond_9
    iget-object v6, v0, Lnet/bytebuddy/jar/asm/Label;->outgoingEdges:Lnet/bytebuddy/jar/asm/Edge;

    .line 143
    .line 144
    iget-short v0, v0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 145
    .line 146
    and-int/lit8 v0, v0, 0x10

    .line 147
    .line 148
    if-eqz v0, :cond_a

    .line 149
    .line 150
    iget-object v6, v6, Lnet/bytebuddy/jar/asm/Edge;->nextEdge:Lnet/bytebuddy/jar/asm/Edge;

    .line 151
    .line 152
    :cond_a
    move-object v0, v4

    .line 153
    :goto_6
    if-eqz v6, :cond_8

    .line 154
    .line 155
    iget-object v4, v6, Lnet/bytebuddy/jar/asm/Edge;->successor:Lnet/bytebuddy/jar/asm/Label;

    .line 156
    .line 157
    iget-object v7, v4, Lnet/bytebuddy/jar/asm/Label;->nextListElement:Lnet/bytebuddy/jar/asm/Label;

    .line 158
    .line 159
    if-nez v7, :cond_c

    .line 160
    .line 161
    iget v7, v6, Lnet/bytebuddy/jar/asm/Edge;->info:I

    .line 162
    .line 163
    if-ne v7, v1, :cond_b

    .line 164
    .line 165
    move v7, v2

    .line 166
    goto :goto_7

    .line 167
    :cond_b
    add-int/2addr v7, v5

    .line 168
    :goto_7
    int-to-short v7, v7

    .line 169
    iput-short v7, v4, Lnet/bytebuddy/jar/asm/Label;->inputStackSize:S

    .line 170
    .line 171
    iput-object v0, v4, Lnet/bytebuddy/jar/asm/Label;->nextListElement:Lnet/bytebuddy/jar/asm/Label;

    .line 172
    .line 173
    move-object v0, v4

    .line 174
    :cond_c
    iget-object v6, v6, Lnet/bytebuddy/jar/asm/Edge;->nextEdge:Lnet/bytebuddy/jar/asm/Edge;

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_d
    iput v3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxStack:I

    .line 178
    .line 179
    return-void
.end method

.method private endCurrentBasicBlockWithNoSuccessor()V
    .locals 5

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->compute:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x0

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lnet/bytebuddy/jar/asm/Label;

    .line 8
    .line 9
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lnet/bytebuddy/jar/asm/Frame;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lnet/bytebuddy/jar/asm/Frame;-><init>(Lnet/bytebuddy/jar/asm/Label;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, v0, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 18
    .line 19
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 20
    .line 21
    iget-object v3, v1, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 22
    .line 23
    iget-object v4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 24
    .line 25
    iget v1, v1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 26
    .line 27
    invoke-virtual {v0, v3, v4, v1}, Lnet/bytebuddy/jar/asm/Label;->resolve([BLnet/bytebuddy/jar/asm/ByteVector;I)Z

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 31
    .line 32
    iput-object v0, v1, Lnet/bytebuddy/jar/asm/Label;->nextBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 33
    .line 34
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 35
    .line 36
    iput-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    const/4 v1, 0x1

    .line 40
    if-ne v0, v1, :cond_1

    .line 41
    .line 42
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 43
    .line 44
    iget v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 45
    .line 46
    int-to-short v1, v1

    .line 47
    iput-short v1, v0, Lnet/bytebuddy/jar/asm/Label;->outputStackMax:S

    .line 48
    .line 49
    iput-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 50
    .line 51
    :cond_1
    return-void
.end method

.method private putAbstractTypes(II)V
    .locals 3

    .line 1
    :goto_0
    if-ge p1, p2, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 4
    .line 5
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentFrame:[I

    .line 6
    .line 7
    aget v1, v1, p1

    .line 8
    .line 9
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 10
    .line 11
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/jar/asm/Frame;->putAbstractType(Lnet/bytebuddy/jar/asm/SymbolTable;ILnet/bytebuddy/jar/asm/ByteVector;)V

    .line 12
    .line 13
    .line 14
    add-int/lit8 p1, p1, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-void
.end method

.method private putFrame()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentFrame:[I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget v3, v1, v2

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    aget v1, v1, v4

    .line 10
    .line 11
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 12
    .line 13
    invoke-virtual {v4}, Lnet/bytebuddy/jar/asm/SymbolTable;->getMajorVersion()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    const/16 v5, 0x32

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x3

    .line 21
    if-ge v4, v5, :cond_0

    .line 22
    .line 23
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 24
    .line 25
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentFrame:[I

    .line 26
    .line 27
    aget v4, v4, v6

    .line 28
    .line 29
    invoke-virtual {v2, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 34
    .line 35
    .line 36
    add-int/2addr v3, v7

    .line 37
    invoke-direct {v0, v7, v3}, Lnet/bytebuddy/jar/asm/MethodWriter;->putAbstractTypes(II)V

    .line 38
    .line 39
    .line 40
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 41
    .line 42
    invoke-virtual {v2, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 43
    .line 44
    .line 45
    add-int/2addr v1, v3

    .line 46
    invoke-direct {v0, v3, v1}, Lnet/bytebuddy/jar/asm/MethodWriter;->putAbstractTypes(II)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    iget v4, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableNumberOfEntries:I

    .line 51
    .line 52
    iget-object v5, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentFrame:[I

    .line 53
    .line 54
    if-nez v4, :cond_1

    .line 55
    .line 56
    aget v4, v5, v6

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    aget v4, v5, v6

    .line 60
    .line 61
    iget-object v5, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->previousFrame:[I

    .line 62
    .line 63
    aget v5, v5, v6

    .line 64
    .line 65
    sub-int/2addr v4, v5

    .line 66
    sub-int/2addr v4, v2

    .line 67
    :goto_0
    iget-object v5, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->previousFrame:[I

    .line 68
    .line 69
    aget v5, v5, v2

    .line 70
    .line 71
    sub-int v8, v3, v5

    .line 72
    .line 73
    const/16 v9, 0xf8

    .line 74
    .line 75
    const/16 v10, 0xfc

    .line 76
    .line 77
    const/16 v11, 0xf7

    .line 78
    .line 79
    const/16 v12, 0x40

    .line 80
    .line 81
    const/16 v13, 0xff

    .line 82
    .line 83
    const/16 v14, 0xfb

    .line 84
    .line 85
    if-nez v1, :cond_3

    .line 86
    .line 87
    packed-switch v8, :pswitch_data_0

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :pswitch_0
    move v2, v10

    .line 92
    goto :goto_2

    .line 93
    :pswitch_1
    if-ge v4, v12, :cond_2

    .line 94
    .line 95
    move v2, v6

    .line 96
    goto :goto_2

    .line 97
    :cond_2
    move v2, v14

    .line 98
    goto :goto_2

    .line 99
    :pswitch_2
    move v2, v9

    .line 100
    goto :goto_2

    .line 101
    :cond_3
    if-nez v8, :cond_5

    .line 102
    .line 103
    if-ne v1, v2, :cond_5

    .line 104
    .line 105
    const/16 v2, 0x3f

    .line 106
    .line 107
    if-ge v4, v2, :cond_4

    .line 108
    .line 109
    move v2, v12

    .line 110
    goto :goto_2

    .line 111
    :cond_4
    move v2, v11

    .line 112
    goto :goto_2

    .line 113
    :cond_5
    :goto_1
    move v2, v13

    .line 114
    :goto_2
    if-eq v2, v13, :cond_7

    .line 115
    .line 116
    move v15, v7

    .line 117
    :goto_3
    if-ge v6, v5, :cond_7

    .line 118
    .line 119
    if-ge v6, v3, :cond_7

    .line 120
    .line 121
    move/from16 v16, v7

    .line 122
    .line 123
    iget-object v7, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentFrame:[I

    .line 124
    .line 125
    aget v7, v7, v15

    .line 126
    .line 127
    iget-object v13, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->previousFrame:[I

    .line 128
    .line 129
    aget v13, v13, v15

    .line 130
    .line 131
    if-eq v7, v13, :cond_6

    .line 132
    .line 133
    const/16 v2, 0xff

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_6
    add-int/lit8 v15, v15, 0x1

    .line 137
    .line 138
    add-int/lit8 v6, v6, 0x1

    .line 139
    .line 140
    move/from16 v7, v16

    .line 141
    .line 142
    const/16 v13, 0xff

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_7
    move/from16 v16, v7

    .line 146
    .line 147
    :goto_4
    if-eqz v2, :cond_d

    .line 148
    .line 149
    if-eq v2, v12, :cond_c

    .line 150
    .line 151
    if-eq v2, v11, :cond_b

    .line 152
    .line 153
    if-eq v2, v9, :cond_a

    .line 154
    .line 155
    if-eq v2, v14, :cond_9

    .line 156
    .line 157
    iget-object v6, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 158
    .line 159
    if-eq v2, v10, :cond_8

    .line 160
    .line 161
    const/16 v2, 0xff

    .line 162
    .line 163
    invoke-virtual {v6, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {v2, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 172
    .line 173
    .line 174
    add-int/lit8 v3, v3, 0x3

    .line 175
    .line 176
    move/from16 v2, v16

    .line 177
    .line 178
    invoke-direct {v0, v2, v3}, Lnet/bytebuddy/jar/asm/MethodWriter;->putAbstractTypes(II)V

    .line 179
    .line 180
    .line 181
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 182
    .line 183
    invoke-virtual {v2, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 184
    .line 185
    .line 186
    add-int/2addr v1, v3

    .line 187
    invoke-direct {v0, v3, v1}, Lnet/bytebuddy/jar/asm/MethodWriter;->putAbstractTypes(II)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :cond_8
    move/from16 v2, v16

    .line 192
    .line 193
    add-int/2addr v8, v14

    .line 194
    invoke-virtual {v6, v8}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {v1, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 199
    .line 200
    .line 201
    add-int/2addr v5, v2

    .line 202
    add-int/2addr v3, v2

    .line 203
    invoke-direct {v0, v5, v3}, Lnet/bytebuddy/jar/asm/MethodWriter;->putAbstractTypes(II)V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :cond_9
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 208
    .line 209
    invoke-virtual {v0, v14}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :cond_a
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 218
    .line 219
    add-int/2addr v8, v14

    .line 220
    invoke-virtual {v0, v8}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v0, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :cond_b
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 229
    .line 230
    invoke-virtual {v1, v11}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-virtual {v1, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 235
    .line 236
    .line 237
    add-int/lit8 v1, v3, 0x3

    .line 238
    .line 239
    add-int/lit8 v3, v3, 0x4

    .line 240
    .line 241
    invoke-direct {v0, v1, v3}, Lnet/bytebuddy/jar/asm/MethodWriter;->putAbstractTypes(II)V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :cond_c
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 246
    .line 247
    add-int/2addr v4, v12

    .line 248
    invoke-virtual {v1, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 249
    .line 250
    .line 251
    add-int/lit8 v1, v3, 0x3

    .line 252
    .line 253
    add-int/lit8 v3, v3, 0x4

    .line 254
    .line 255
    invoke-direct {v0, v1, v3}, Lnet/bytebuddy/jar/asm/MethodWriter;->putAbstractTypes(II)V

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :cond_d
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 260
    .line 261
    invoke-virtual {v0, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 262
    .line 263
    .line 264
    return-void

    .line 265
    :pswitch_data_0
    .packed-switch -0x3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private putFrameType(Ljava/lang/Object;)V
    .locals 2

    .line 1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x7

    .line 24
    invoke-virtual {v1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 29
    .line 30
    check-cast p1, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    iget p0, p0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    const/16 v0, 0x8

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 45
    .line 46
    .line 47
    check-cast p1, Lnet/bytebuddy/jar/asm/Label;

    .line 48
    .line 49
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 50
    .line 51
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/Label;->put(Lnet/bytebuddy/jar/asm/ByteVector;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method private visitSwitchInsn(Lnet/bytebuddy/jar/asm/Label;[Lnet/bytebuddy/jar/asm/Label;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->compute:I

    .line 6
    .line 7
    const/4 v2, 0x4

    .line 8
    const/4 v3, 0x0

    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 12
    .line 13
    const/16 v1, 0xab

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v0, v1, v3, v2, v2}, Lnet/bytebuddy/jar/asm/Frame;->execute(IILnet/bytebuddy/jar/asm/Symbol;Lnet/bytebuddy/jar/asm/SymbolTable;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v3, p1}, Lnet/bytebuddy/jar/asm/MethodWriter;->addSuccessorToCurrentBasicBlock(ILnet/bytebuddy/jar/asm/Label;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Label;->getCanonicalInstance()Lnet/bytebuddy/jar/asm/Label;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-short v0, p1, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 27
    .line 28
    or-int/lit8 v0, v0, 0x2

    .line 29
    .line 30
    int-to-short v0, v0

    .line 31
    iput-short v0, p1, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 32
    .line 33
    array-length p1, p2

    .line 34
    move v0, v3

    .line 35
    :goto_0
    if-ge v0, p1, :cond_1

    .line 36
    .line 37
    aget-object v1, p2, v0

    .line 38
    .line 39
    invoke-direct {p0, v3, v1}, Lnet/bytebuddy/jar/asm/MethodWriter;->addSuccessorToCurrentBasicBlock(ILnet/bytebuddy/jar/asm/Label;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Lnet/bytebuddy/jar/asm/Label;->getCanonicalInstance()Lnet/bytebuddy/jar/asm/Label;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-short v2, v1, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 47
    .line 48
    or-int/lit8 v2, v2, 0x2

    .line 49
    .line 50
    int-to-short v2, v2

    .line 51
    iput-short v2, v1, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 52
    .line 53
    add-int/lit8 v0, v0, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/4 v0, 0x1

    .line 57
    if-ne v1, v0, :cond_1

    .line 58
    .line 59
    iget v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 60
    .line 61
    sub-int/2addr v1, v0

    .line 62
    iput v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 63
    .line 64
    invoke-direct {p0, v1, p1}, Lnet/bytebuddy/jar/asm/MethodWriter;->addSuccessorToCurrentBasicBlock(ILnet/bytebuddy/jar/asm/Label;)V

    .line 65
    .line 66
    .line 67
    array-length p1, p2

    .line 68
    :goto_1
    if-ge v3, p1, :cond_1

    .line 69
    .line 70
    aget-object v0, p2, v3

    .line 71
    .line 72
    iget v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 73
    .line 74
    invoke-direct {p0, v1, v0}, Lnet/bytebuddy/jar/asm/MethodWriter;->addSuccessorToCurrentBasicBlock(ILnet/bytebuddy/jar/asm/Label;)V

    .line 75
    .line 76
    .line 77
    add-int/lit8 v3, v3, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    invoke-direct {p0}, Lnet/bytebuddy/jar/asm/MethodWriter;->endCurrentBasicBlockWithNoSuccessor()V

    .line 81
    .line 82
    .line 83
    :cond_2
    return-void
.end method


# virtual methods
.method public canCopyMethodAttributes(Lnet/bytebuddy/jar/asm/ClassReader;ZZIII)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->getSource()Lnet/bytebuddy/jar/asm/ClassReader;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-ne p1, v0, :cond_7

    .line 9
    .line 10
    iget v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->descriptorIndex:I

    .line 11
    .line 12
    if-ne p4, v0, :cond_7

    .line 13
    .line 14
    iget p4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->signatureIndex:I

    .line 15
    .line 16
    if-ne p5, p4, :cond_7

    .line 17
    .line 18
    iget p4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->accessFlags:I

    .line 19
    .line 20
    const/high16 p5, 0x20000

    .line 21
    .line 22
    and-int/2addr p4, p5

    .line 23
    const/4 p5, 0x1

    .line 24
    if-eqz p4, :cond_0

    .line 25
    .line 26
    move p4, p5

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move p4, v1

    .line 29
    :goto_0
    if-eq p3, p4, :cond_1

    .line 30
    .line 31
    goto :goto_3

    .line 32
    :cond_1
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 33
    .line 34
    invoke-virtual {p3}, Lnet/bytebuddy/jar/asm/SymbolTable;->getMajorVersion()I

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    const/16 p4, 0x31

    .line 39
    .line 40
    if-ge p3, p4, :cond_2

    .line 41
    .line 42
    iget p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->accessFlags:I

    .line 43
    .line 44
    and-int/lit16 p3, p3, 0x1000

    .line 45
    .line 46
    if-eqz p3, :cond_2

    .line 47
    .line 48
    move p3, p5

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move p3, v1

    .line 51
    :goto_1
    if-eq p2, p3, :cond_3

    .line 52
    .line 53
    return v1

    .line 54
    :cond_3
    if-nez p6, :cond_4

    .line 55
    .line 56
    iget p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->numberOfExceptions:I

    .line 57
    .line 58
    if-eqz p0, :cond_6

    .line 59
    .line 60
    return v1

    .line 61
    :cond_4
    invoke-virtual {p1, p6}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    iget p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->numberOfExceptions:I

    .line 66
    .line 67
    if-ne p2, p3, :cond_6

    .line 68
    .line 69
    add-int/lit8 p6, p6, 0x2

    .line 70
    .line 71
    move p2, v1

    .line 72
    :goto_2
    iget p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->numberOfExceptions:I

    .line 73
    .line 74
    if-ge p2, p3, :cond_6

    .line 75
    .line 76
    invoke-virtual {p1, p6}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 77
    .line 78
    .line 79
    move-result p3

    .line 80
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->exceptionIndexTable:[I

    .line 81
    .line 82
    aget p4, p4, p2

    .line 83
    .line 84
    if-eq p3, p4, :cond_5

    .line 85
    .line 86
    return v1

    .line 87
    :cond_5
    add-int/lit8 p6, p6, 0x2

    .line 88
    .line 89
    add-int/lit8 p2, p2, 0x1

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_6
    return p5

    .line 93
    :cond_7
    :goto_3
    return v1
.end method

.method public final collectAttributePrototypes(Lnet/bytebuddy/jar/asm/Attribute$Set;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/Attribute$Set;->addAttributes(Lnet/bytebuddy/jar/asm/Attribute;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstCodeAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/Attribute$Set;->addAttributes(Lnet/bytebuddy/jar/asm/Attribute;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public computeMethodInfoSize()I
    .locals 8

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->sourceOffset:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->sourceLength:I

    .line 6
    .line 7
    add-int/lit8 p0, p0, 0x6

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 11
    .line 12
    iget v0, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    if-lez v0, :cond_a

    .line 17
    .line 18
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 19
    .line 20
    const v3, 0xffff

    .line 21
    .line 22
    .line 23
    if-gt v0, v3, :cond_9

    .line 24
    .line 25
    const-string v0, "Code"

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 31
    .line 32
    iget v0, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x10

    .line 35
    .line 36
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstHandler:Lnet/bytebuddy/jar/asm/Handler;

    .line 37
    .line 38
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Handler;->getExceptionTableSize(Lnet/bytebuddy/jar/asm/Handler;)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    add-int/2addr v0, v2

    .line 43
    add-int/2addr v0, v1

    .line 44
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 45
    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 49
    .line 50
    invoke-virtual {v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->getMajorVersion()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    const/16 v3, 0x32

    .line 55
    .line 56
    if-lt v2, v3, :cond_1

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    const/4 v2, 0x0

    .line 61
    :goto_0
    iget-object v3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 62
    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    const-string v2, "StackMapTable"

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    const-string v2, "StackMap"

    .line 69
    .line 70
    :goto_1
    invoke-virtual {v3, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 74
    .line 75
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 76
    .line 77
    add-int/2addr v2, v1

    .line 78
    add-int/2addr v0, v2

    .line 79
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lineNumberTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 80
    .line 81
    if-eqz v2, :cond_4

    .line 82
    .line 83
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 84
    .line 85
    const-string v3, "LineNumberTable"

    .line 86
    .line 87
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lineNumberTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 91
    .line 92
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 93
    .line 94
    add-int/2addr v2, v1

    .line 95
    add-int/2addr v0, v2

    .line 96
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 97
    .line 98
    if-eqz v2, :cond_5

    .line 99
    .line 100
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 101
    .line 102
    const-string v3, "LocalVariableTable"

    .line 103
    .line 104
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 108
    .line 109
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 110
    .line 111
    add-int/2addr v2, v1

    .line 112
    add-int/2addr v0, v2

    .line 113
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTypeTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 114
    .line 115
    if-eqz v2, :cond_6

    .line 116
    .line 117
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 118
    .line 119
    const-string v3, "LocalVariableTypeTable"

    .line 120
    .line 121
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTypeTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 125
    .line 126
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 127
    .line 128
    add-int/2addr v2, v1

    .line 129
    add-int/2addr v0, v2

    .line 130
    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastCodeRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 131
    .line 132
    if-eqz v2, :cond_7

    .line 133
    .line 134
    const-string v3, "RuntimeVisibleTypeAnnotations"

    .line 135
    .line 136
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->computeAnnotationsSize(Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    add-int/2addr v0, v2

    .line 141
    :cond_7
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastCodeRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 142
    .line 143
    if-eqz v2, :cond_8

    .line 144
    .line 145
    const-string v3, "RuntimeInvisibleTypeAnnotations"

    .line 146
    .line 147
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->computeAnnotationsSize(Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    add-int/2addr v0, v2

    .line 152
    :cond_8
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstCodeAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 153
    .line 154
    if-eqz v2, :cond_b

    .line 155
    .line 156
    iget-object v3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 157
    .line 158
    iget-object v4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 159
    .line 160
    move-object v5, v4

    .line 161
    iget-object v4, v5, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 162
    .line 163
    iget v5, v5, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 164
    .line 165
    iget v6, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxStack:I

    .line 166
    .line 167
    iget v7, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxLocals:I

    .line 168
    .line 169
    invoke-virtual/range {v2 .. v7}, Lnet/bytebuddy/jar/asm/Attribute;->computeAttributesSize(Lnet/bytebuddy/jar/asm/SymbolTable;[BIII)I

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    add-int/2addr v0, v2

    .line 174
    goto :goto_2

    .line 175
    :cond_9
    new-instance v0, Lnet/bytebuddy/jar/asm/MethodTooLargeException;

    .line 176
    .line 177
    invoke-virtual {v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->getClassName()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->name:Ljava/lang/String;

    .line 182
    .line 183
    iget-object v3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->descriptor:Ljava/lang/String;

    .line 184
    .line 185
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 186
    .line 187
    iget p0, p0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 188
    .line 189
    invoke-direct {v0, v1, v2, v3, p0}, Lnet/bytebuddy/jar/asm/MethodTooLargeException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 190
    .line 191
    .line 192
    throw v0

    .line 193
    :cond_a
    move v0, v1

    .line 194
    :cond_b
    :goto_2
    iget v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->numberOfExceptions:I

    .line 195
    .line 196
    if-lez v2, :cond_c

    .line 197
    .line 198
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 199
    .line 200
    const-string v3, "Exceptions"

    .line 201
    .line 202
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 203
    .line 204
    .line 205
    const/4 v2, 0x2

    .line 206
    iget v3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->numberOfExceptions:I

    .line 207
    .line 208
    invoke-static {v3, v2, v1, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    :cond_c
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 213
    .line 214
    iget v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->accessFlags:I

    .line 215
    .line 216
    iget v3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->signatureIndex:I

    .line 217
    .line 218
    invoke-static {v1, v2, v3}, Lnet/bytebuddy/jar/asm/Attribute;->computeAttributesSize(Lnet/bytebuddy/jar/asm/SymbolTable;II)I

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    add-int/2addr v1, v0

    .line 223
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 224
    .line 225
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 226
    .line 227
    iget-object v3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 228
    .line 229
    iget-object v4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 230
    .line 231
    invoke-static {v0, v2, v3, v4}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->computeAnnotationsSize(Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/AnnotationWriter;)I

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    add-int/2addr v1, v0

    .line 236
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeVisibleParameterAnnotations:[Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 237
    .line 238
    if-eqz v0, :cond_e

    .line 239
    .line 240
    iget v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->visibleAnnotableParameterCount:I

    .line 241
    .line 242
    if-nez v2, :cond_d

    .line 243
    .line 244
    array-length v2, v0

    .line 245
    :cond_d
    const-string v3, "RuntimeVisibleParameterAnnotations"

    .line 246
    .line 247
    invoke-static {v3, v0, v2}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->computeParameterAnnotationsSize(Ljava/lang/String;[Lnet/bytebuddy/jar/asm/AnnotationWriter;I)I

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    add-int/2addr v1, v0

    .line 252
    :cond_e
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeInvisibleParameterAnnotations:[Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 253
    .line 254
    if-eqz v0, :cond_10

    .line 255
    .line 256
    iget v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->invisibleAnnotableParameterCount:I

    .line 257
    .line 258
    if-nez v2, :cond_f

    .line 259
    .line 260
    array-length v2, v0

    .line 261
    :cond_f
    const-string v3, "RuntimeInvisibleParameterAnnotations"

    .line 262
    .line 263
    invoke-static {v3, v0, v2}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->computeParameterAnnotationsSize(Ljava/lang/String;[Lnet/bytebuddy/jar/asm/AnnotationWriter;I)I

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    add-int/2addr v1, v0

    .line 268
    :cond_10
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->defaultValue:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 269
    .line 270
    if-eqz v0, :cond_11

    .line 271
    .line 272
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 273
    .line 274
    const-string v2, "AnnotationDefault"

    .line 275
    .line 276
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 277
    .line 278
    .line 279
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->defaultValue:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 280
    .line 281
    iget v0, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 282
    .line 283
    add-int/lit8 v0, v0, 0x6

    .line 284
    .line 285
    add-int/2addr v1, v0

    .line 286
    :cond_11
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->parameters:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 287
    .line 288
    if-eqz v0, :cond_12

    .line 289
    .line 290
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 291
    .line 292
    const-string v2, "MethodParameters"

    .line 293
    .line 294
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 295
    .line 296
    .line 297
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->parameters:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 298
    .line 299
    iget v0, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 300
    .line 301
    add-int/lit8 v0, v0, 0x7

    .line 302
    .line 303
    add-int/2addr v1, v0

    .line 304
    :cond_12
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 305
    .line 306
    if-eqz v0, :cond_13

    .line 307
    .line 308
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 309
    .line 310
    invoke-virtual {v0, p0}, Lnet/bytebuddy/jar/asm/Attribute;->computeAttributesSize(Lnet/bytebuddy/jar/asm/SymbolTable;)I

    .line 311
    .line 312
    .line 313
    move-result p0

    .line 314
    add-int/2addr p0, v1

    .line 315
    return p0

    .line 316
    :cond_13
    return v1
.end method

.method public hasAsmInstructions()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->hasAsmInstructions:Z

    .line 2
    .line 3
    return p0
.end method

.method public hasFrames()Z
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableNumberOfEntries:I

    .line 2
    .line 3
    if-lez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public putMethodInfo(Lnet/bytebuddy/jar/asm/ByteVector;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 6
    .line 7
    invoke-virtual {v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->getMajorVersion()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/16 v2, 0x31

    .line 12
    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x1

    .line 15
    if-ge v1, v2, :cond_0

    .line 16
    .line 17
    move v1, v9

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v1, v8

    .line 20
    :goto_0
    if-eqz v1, :cond_1

    .line 21
    .line 22
    const/16 v2, 0x1000

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v2, v8

    .line 26
    :goto_1
    iget v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->accessFlags:I

    .line 27
    .line 28
    not-int v2, v2

    .line 29
    and-int/2addr v2, v3

    .line 30
    invoke-virtual {v6, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->nameIndex:I

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->descriptorIndex:I

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 43
    .line 44
    .line 45
    iget v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->sourceOffset:I

    .line 46
    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 50
    .line 51
    invoke-virtual {v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->getSource()Lnet/bytebuddy/jar/asm/ClassReader;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-object v1, v1, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 56
    .line 57
    iget v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->sourceOffset:I

    .line 58
    .line 59
    iget v0, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->sourceLength:I

    .line 60
    .line 61
    invoke-virtual {v6, v1, v2, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 66
    .line 67
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 68
    .line 69
    if-lez v2, :cond_3

    .line 70
    .line 71
    move v2, v9

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    move v2, v8

    .line 74
    :goto_2
    iget v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->numberOfExceptions:I

    .line 75
    .line 76
    if-lez v3, :cond_4

    .line 77
    .line 78
    add-int/lit8 v2, v2, 0x1

    .line 79
    .line 80
    :cond_4
    iget v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->accessFlags:I

    .line 81
    .line 82
    and-int/lit16 v4, v3, 0x1000

    .line 83
    .line 84
    if-eqz v4, :cond_5

    .line 85
    .line 86
    if-eqz v1, :cond_5

    .line 87
    .line 88
    add-int/lit8 v2, v2, 0x1

    .line 89
    .line 90
    :cond_5
    iget v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->signatureIndex:I

    .line 91
    .line 92
    if-eqz v1, :cond_6

    .line 93
    .line 94
    add-int/lit8 v2, v2, 0x1

    .line 95
    .line 96
    :cond_6
    const/high16 v1, 0x20000

    .line 97
    .line 98
    and-int/2addr v1, v3

    .line 99
    if-eqz v1, :cond_7

    .line 100
    .line 101
    add-int/lit8 v2, v2, 0x1

    .line 102
    .line 103
    :cond_7
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 104
    .line 105
    if-eqz v1, :cond_8

    .line 106
    .line 107
    add-int/lit8 v2, v2, 0x1

    .line 108
    .line 109
    :cond_8
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 110
    .line 111
    if-eqz v1, :cond_9

    .line 112
    .line 113
    add-int/lit8 v2, v2, 0x1

    .line 114
    .line 115
    :cond_9
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeVisibleParameterAnnotations:[Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 116
    .line 117
    if-eqz v1, :cond_a

    .line 118
    .line 119
    add-int/lit8 v2, v2, 0x1

    .line 120
    .line 121
    :cond_a
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeInvisibleParameterAnnotations:[Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 122
    .line 123
    if-eqz v1, :cond_b

    .line 124
    .line 125
    add-int/lit8 v2, v2, 0x1

    .line 126
    .line 127
    :cond_b
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 128
    .line 129
    if-eqz v1, :cond_c

    .line 130
    .line 131
    add-int/lit8 v2, v2, 0x1

    .line 132
    .line 133
    :cond_c
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 134
    .line 135
    if-eqz v1, :cond_d

    .line 136
    .line 137
    add-int/lit8 v2, v2, 0x1

    .line 138
    .line 139
    :cond_d
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->defaultValue:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 140
    .line 141
    if-eqz v1, :cond_e

    .line 142
    .line 143
    add-int/lit8 v2, v2, 0x1

    .line 144
    .line 145
    :cond_e
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->parameters:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 146
    .line 147
    if-eqz v1, :cond_f

    .line 148
    .line 149
    add-int/lit8 v2, v2, 0x1

    .line 150
    .line 151
    :cond_f
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 152
    .line 153
    if-eqz v1, :cond_10

    .line 154
    .line 155
    invoke-virtual {v1}, Lnet/bytebuddy/jar/asm/Attribute;->getAttributeCount()I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    add-int/2addr v2, v1

    .line 160
    :cond_10
    invoke-virtual {v6, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 161
    .line 162
    .line 163
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 164
    .line 165
    iget v1, v1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 166
    .line 167
    if-lez v1, :cond_20

    .line 168
    .line 169
    add-int/lit8 v1, v1, 0xa

    .line 170
    .line 171
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstHandler:Lnet/bytebuddy/jar/asm/Handler;

    .line 172
    .line 173
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Handler;->getExceptionTableSize(Lnet/bytebuddy/jar/asm/Handler;)I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    add-int/2addr v1, v2

    .line 178
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 179
    .line 180
    if-eqz v2, :cond_11

    .line 181
    .line 182
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 183
    .line 184
    add-int/lit8 v2, v2, 0x8

    .line 185
    .line 186
    add-int/2addr v1, v2

    .line 187
    move v2, v9

    .line 188
    goto :goto_3

    .line 189
    :cond_11
    move v2, v8

    .line 190
    :goto_3
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lineNumberTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 191
    .line 192
    if-eqz v3, :cond_12

    .line 193
    .line 194
    iget v3, v3, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 195
    .line 196
    add-int/lit8 v3, v3, 0x8

    .line 197
    .line 198
    add-int/2addr v1, v3

    .line 199
    add-int/lit8 v2, v2, 0x1

    .line 200
    .line 201
    :cond_12
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 202
    .line 203
    if-eqz v3, :cond_13

    .line 204
    .line 205
    iget v3, v3, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 206
    .line 207
    add-int/lit8 v3, v3, 0x8

    .line 208
    .line 209
    add-int/2addr v1, v3

    .line 210
    add-int/lit8 v2, v2, 0x1

    .line 211
    .line 212
    :cond_13
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTypeTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 213
    .line 214
    if-eqz v3, :cond_14

    .line 215
    .line 216
    iget v3, v3, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 217
    .line 218
    add-int/lit8 v3, v3, 0x8

    .line 219
    .line 220
    add-int/2addr v1, v3

    .line 221
    add-int/lit8 v2, v2, 0x1

    .line 222
    .line 223
    :cond_14
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastCodeRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 224
    .line 225
    const-string v4, "RuntimeVisibleTypeAnnotations"

    .line 226
    .line 227
    if-eqz v3, :cond_15

    .line 228
    .line 229
    invoke-virtual {v3, v4}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->computeAnnotationsSize(Ljava/lang/String;)I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    add-int/2addr v1, v3

    .line 234
    add-int/lit8 v2, v2, 0x1

    .line 235
    .line 236
    :cond_15
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastCodeRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 237
    .line 238
    const-string v5, "RuntimeInvisibleTypeAnnotations"

    .line 239
    .line 240
    if-eqz v3, :cond_16

    .line 241
    .line 242
    invoke-virtual {v3, v5}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->computeAnnotationsSize(Ljava/lang/String;)I

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    add-int/2addr v1, v3

    .line 247
    add-int/lit8 v2, v2, 0x1

    .line 248
    .line 249
    :cond_16
    iget-object v10, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstCodeAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 250
    .line 251
    if-eqz v10, :cond_17

    .line 252
    .line 253
    iget-object v11, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 254
    .line 255
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 256
    .line 257
    iget-object v12, v3, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 258
    .line 259
    iget v13, v3, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 260
    .line 261
    iget v14, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxStack:I

    .line 262
    .line 263
    iget v15, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxLocals:I

    .line 264
    .line 265
    invoke-virtual/range {v10 .. v15}, Lnet/bytebuddy/jar/asm/Attribute;->computeAttributesSize(Lnet/bytebuddy/jar/asm/SymbolTable;[BIII)I

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    add-int/2addr v1, v3

    .line 270
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstCodeAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 271
    .line 272
    invoke-virtual {v3}, Lnet/bytebuddy/jar/asm/Attribute;->getAttributeCount()I

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    add-int/2addr v2, v3

    .line 277
    :cond_17
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 278
    .line 279
    const-string v7, "Code"

    .line 280
    .line 281
    invoke-virtual {v3, v7}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    invoke-virtual {v6, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-virtual {v3, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    iget v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxStack:I

    .line 294
    .line 295
    invoke-virtual {v1, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    iget v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxLocals:I

    .line 300
    .line 301
    invoke-virtual {v1, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 306
    .line 307
    iget v3, v3, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 308
    .line 309
    invoke-virtual {v1, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 314
    .line 315
    iget-object v7, v3, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 316
    .line 317
    iget v3, v3, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 318
    .line 319
    invoke-virtual {v1, v7, v8, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 320
    .line 321
    .line 322
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstHandler:Lnet/bytebuddy/jar/asm/Handler;

    .line 323
    .line 324
    invoke-static {v1, v6}, Lnet/bytebuddy/jar/asm/Handler;->putExceptionTable(Lnet/bytebuddy/jar/asm/Handler;Lnet/bytebuddy/jar/asm/ByteVector;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v6, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 328
    .line 329
    .line 330
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 331
    .line 332
    if-eqz v1, :cond_1a

    .line 333
    .line 334
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 335
    .line 336
    invoke-virtual {v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->getMajorVersion()I

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    const/16 v2, 0x32

    .line 341
    .line 342
    if-lt v1, v2, :cond_18

    .line 343
    .line 344
    move v1, v9

    .line 345
    goto :goto_4

    .line 346
    :cond_18
    move v1, v8

    .line 347
    :goto_4
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 348
    .line 349
    if-eqz v1, :cond_19

    .line 350
    .line 351
    const-string v1, "StackMapTable"

    .line 352
    .line 353
    goto :goto_5

    .line 354
    :cond_19
    const-string v1, "StackMap"

    .line 355
    .line 356
    :goto_5
    invoke-virtual {v2, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 357
    .line 358
    .line 359
    move-result v1

    .line 360
    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 365
    .line 366
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 367
    .line 368
    add-int/lit8 v2, v2, 0x2

    .line 369
    .line 370
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    iget v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableNumberOfEntries:I

    .line 375
    .line 376
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 381
    .line 382
    iget-object v3, v2, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 383
    .line 384
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 385
    .line 386
    invoke-virtual {v1, v3, v8, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 387
    .line 388
    .line 389
    :cond_1a
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lineNumberTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 390
    .line 391
    if-eqz v1, :cond_1b

    .line 392
    .line 393
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 394
    .line 395
    const-string v2, "LineNumberTable"

    .line 396
    .line 397
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lineNumberTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 406
    .line 407
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 408
    .line 409
    add-int/lit8 v2, v2, 0x2

    .line 410
    .line 411
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    iget v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lineNumberTableLength:I

    .line 416
    .line 417
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lineNumberTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 422
    .line 423
    iget-object v3, v2, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 424
    .line 425
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 426
    .line 427
    invoke-virtual {v1, v3, v8, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 428
    .line 429
    .line 430
    :cond_1b
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 431
    .line 432
    if-eqz v1, :cond_1c

    .line 433
    .line 434
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 435
    .line 436
    const-string v2, "LocalVariableTable"

    .line 437
    .line 438
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 447
    .line 448
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 449
    .line 450
    add-int/lit8 v2, v2, 0x2

    .line 451
    .line 452
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    iget v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTableLength:I

    .line 457
    .line 458
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 463
    .line 464
    iget-object v3, v2, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 465
    .line 466
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 467
    .line 468
    invoke-virtual {v1, v3, v8, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 469
    .line 470
    .line 471
    :cond_1c
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTypeTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 472
    .line 473
    if-eqz v1, :cond_1d

    .line 474
    .line 475
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 476
    .line 477
    const-string v2, "LocalVariableTypeTable"

    .line 478
    .line 479
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 480
    .line 481
    .line 482
    move-result v1

    .line 483
    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTypeTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 488
    .line 489
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 490
    .line 491
    add-int/lit8 v2, v2, 0x2

    .line 492
    .line 493
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    iget v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTypeTableLength:I

    .line 498
    .line 499
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTypeTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 504
    .line 505
    iget-object v3, v2, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 506
    .line 507
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 508
    .line 509
    invoke-virtual {v1, v3, v8, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 510
    .line 511
    .line 512
    :cond_1d
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastCodeRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 513
    .line 514
    if-eqz v1, :cond_1e

    .line 515
    .line 516
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 517
    .line 518
    invoke-virtual {v2, v4}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 519
    .line 520
    .line 521
    move-result v2

    .line 522
    invoke-virtual {v1, v2, v6}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->putAnnotations(ILnet/bytebuddy/jar/asm/ByteVector;)V

    .line 523
    .line 524
    .line 525
    :cond_1e
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastCodeRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 526
    .line 527
    if-eqz v1, :cond_1f

    .line 528
    .line 529
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 530
    .line 531
    invoke-virtual {v2, v5}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 532
    .line 533
    .line 534
    move-result v2

    .line 535
    invoke-virtual {v1, v2, v6}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->putAnnotations(ILnet/bytebuddy/jar/asm/ByteVector;)V

    .line 536
    .line 537
    .line 538
    :cond_1f
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstCodeAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 539
    .line 540
    if-eqz v1, :cond_20

    .line 541
    .line 542
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 543
    .line 544
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 545
    .line 546
    iget-object v4, v3, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 547
    .line 548
    iget v3, v3, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 549
    .line 550
    iget v5, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxStack:I

    .line 551
    .line 552
    iget v6, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxLocals:I

    .line 553
    .line 554
    move-object v7, v4

    .line 555
    move v4, v3

    .line 556
    move-object v3, v7

    .line 557
    move-object/from16 v7, p1

    .line 558
    .line 559
    invoke-virtual/range {v1 .. v7}, Lnet/bytebuddy/jar/asm/Attribute;->putAttributes(Lnet/bytebuddy/jar/asm/SymbolTable;[BIIILnet/bytebuddy/jar/asm/ByteVector;)V

    .line 560
    .line 561
    .line 562
    move-object v6, v7

    .line 563
    :cond_20
    iget v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->numberOfExceptions:I

    .line 564
    .line 565
    if-lez v1, :cond_21

    .line 566
    .line 567
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 568
    .line 569
    const-string v2, "Exceptions"

    .line 570
    .line 571
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 572
    .line 573
    .line 574
    move-result v1

    .line 575
    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 576
    .line 577
    .line 578
    move-result-object v1

    .line 579
    iget v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->numberOfExceptions:I

    .line 580
    .line 581
    mul-int/lit8 v2, v2, 0x2

    .line 582
    .line 583
    add-int/lit8 v2, v2, 0x2

    .line 584
    .line 585
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    iget v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->numberOfExceptions:I

    .line 590
    .line 591
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 592
    .line 593
    .line 594
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->exceptionIndexTable:[I

    .line 595
    .line 596
    array-length v2, v1

    .line 597
    move v3, v8

    .line 598
    :goto_6
    if-ge v3, v2, :cond_21

    .line 599
    .line 600
    aget v4, v1, v3

    .line 601
    .line 602
    invoke-virtual {v6, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 603
    .line 604
    .line 605
    add-int/lit8 v3, v3, 0x1

    .line 606
    .line 607
    goto :goto_6

    .line 608
    :cond_21
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 609
    .line 610
    iget v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->accessFlags:I

    .line 611
    .line 612
    iget v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->signatureIndex:I

    .line 613
    .line 614
    invoke-static {v1, v2, v3, v6}, Lnet/bytebuddy/jar/asm/Attribute;->putAttributes(Lnet/bytebuddy/jar/asm/SymbolTable;IILnet/bytebuddy/jar/asm/ByteVector;)V

    .line 615
    .line 616
    .line 617
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 618
    .line 619
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 620
    .line 621
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 622
    .line 623
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 624
    .line 625
    iget-object v5, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 626
    .line 627
    invoke-static/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->putAnnotations(Lnet/bytebuddy/jar/asm/SymbolTable;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/ByteVector;)V

    .line 628
    .line 629
    .line 630
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeVisibleParameterAnnotations:[Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 631
    .line 632
    if-eqz v1, :cond_23

    .line 633
    .line 634
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 635
    .line 636
    const-string v2, "RuntimeVisibleParameterAnnotations"

    .line 637
    .line 638
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 639
    .line 640
    .line 641
    move-result v1

    .line 642
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeVisibleParameterAnnotations:[Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 643
    .line 644
    iget v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->visibleAnnotableParameterCount:I

    .line 645
    .line 646
    if-nez v3, :cond_22

    .line 647
    .line 648
    array-length v3, v2

    .line 649
    :cond_22
    invoke-static {v1, v2, v3, v6}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->putParameterAnnotations(I[Lnet/bytebuddy/jar/asm/AnnotationWriter;ILnet/bytebuddy/jar/asm/ByteVector;)V

    .line 650
    .line 651
    .line 652
    :cond_23
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeInvisibleParameterAnnotations:[Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 653
    .line 654
    if-eqz v1, :cond_25

    .line 655
    .line 656
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 657
    .line 658
    const-string v2, "RuntimeInvisibleParameterAnnotations"

    .line 659
    .line 660
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 661
    .line 662
    .line 663
    move-result v1

    .line 664
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeInvisibleParameterAnnotations:[Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 665
    .line 666
    iget v3, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->invisibleAnnotableParameterCount:I

    .line 667
    .line 668
    if-nez v3, :cond_24

    .line 669
    .line 670
    array-length v3, v2

    .line 671
    :cond_24
    invoke-static {v1, v2, v3, v6}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->putParameterAnnotations(I[Lnet/bytebuddy/jar/asm/AnnotationWriter;ILnet/bytebuddy/jar/asm/ByteVector;)V

    .line 672
    .line 673
    .line 674
    :cond_25
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->defaultValue:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 675
    .line 676
    if-eqz v1, :cond_26

    .line 677
    .line 678
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 679
    .line 680
    const-string v2, "AnnotationDefault"

    .line 681
    .line 682
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 683
    .line 684
    .line 685
    move-result v1

    .line 686
    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 687
    .line 688
    .line 689
    move-result-object v1

    .line 690
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->defaultValue:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 691
    .line 692
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 693
    .line 694
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 695
    .line 696
    .line 697
    move-result-object v1

    .line 698
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->defaultValue:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 699
    .line 700
    iget-object v3, v2, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 701
    .line 702
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 703
    .line 704
    invoke-virtual {v1, v3, v8, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 705
    .line 706
    .line 707
    :cond_26
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->parameters:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 708
    .line 709
    if-eqz v1, :cond_27

    .line 710
    .line 711
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 712
    .line 713
    const-string v2, "MethodParameters"

    .line 714
    .line 715
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 716
    .line 717
    .line 718
    move-result v1

    .line 719
    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 720
    .line 721
    .line 722
    move-result-object v1

    .line 723
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->parameters:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 724
    .line 725
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 726
    .line 727
    add-int/2addr v2, v9

    .line 728
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 729
    .line 730
    .line 731
    move-result-object v1

    .line 732
    iget v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->parametersCount:I

    .line 733
    .line 734
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 735
    .line 736
    .line 737
    move-result-object v1

    .line 738
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->parameters:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 739
    .line 740
    iget-object v3, v2, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 741
    .line 742
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 743
    .line 744
    invoke-virtual {v1, v3, v8, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 745
    .line 746
    .line 747
    :cond_27
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 748
    .line 749
    if-eqz v1, :cond_28

    .line 750
    .line 751
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 752
    .line 753
    invoke-virtual {v1, v0, v6}, Lnet/bytebuddy/jar/asm/Attribute;->putAttributes(Lnet/bytebuddy/jar/asm/SymbolTable;Lnet/bytebuddy/jar/asm/ByteVector;)V

    .line 754
    .line 755
    .line 756
    :cond_28
    return-void
.end method

.method public setMethodAttributesSource(II)V
    .locals 0

    .line 1
    add-int/lit8 p1, p1, 0x6

    .line 2
    .line 3
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->sourceOffset:I

    .line 4
    .line 5
    add-int/lit8 p2, p2, -0x6

    .line 6
    .line 7
    iput p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->sourceLength:I

    .line 8
    .line 9
    return-void
.end method

.method public visitAbstractType(II)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentFrame:[I

    .line 2
    .line 3
    aput p2, p0, p1

    .line 4
    .line 5
    return-void
.end method

.method public visitAnnotableParameterCount(IZ)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->visibleAnnotableParameterCount:I

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->invisibleAnnotableParameterCount:I

    .line 7
    .line 8
    return-void
.end method

.method public visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 6
    .line 7
    invoke-static {v0, p1, p2}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 15
    .line 16
    invoke-static {v0, p1, p2}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 21
    .line 22
    return-object p1
.end method

.method public visitAnnotationDefault()Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 4

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->defaultValue:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 7
    .line 8
    new-instance v1, Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v1, p0, v2, v0, v3}, Lnet/bytebuddy/jar/asm/AnnotationWriter;-><init>(Lnet/bytebuddy/jar/asm/SymbolTable;ZLnet/bytebuddy/jar/asm/ByteVector;Lnet/bytebuddy/jar/asm/AnnotationWriter;)V

    .line 15
    .line 16
    .line 17
    return-object v1
.end method

.method public visitAttribute(Lnet/bytebuddy/jar/asm/Attribute;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Attribute;->isCodeAttribute()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstCodeAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 8
    .line 9
    iput-object v0, p1, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 10
    .line 11
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstCodeAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 15
    .line 16
    iput-object v0, p1, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 17
    .line 18
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 19
    .line 20
    return-void
.end method

.method public visitCode()V
    .locals 0

    .line 1
    return-void
.end method

.method public visitEnd()V
    .locals 0

    .line 1
    return-void
.end method

.method public visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 8
    .line 9
    invoke-virtual {v0, p2, p3, p4}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantFieldref(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 14
    .line 15
    iget v0, p2, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 16
    .line 17
    invoke-virtual {p3, p1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->put12(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 18
    .line 19
    .line 20
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 21
    .line 22
    if-eqz p3, :cond_a

    .line 23
    .line 24
    iget v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->compute:I

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    const/4 v2, 0x0

    .line 28
    if-eq v0, v1, :cond_9

    .line 29
    .line 30
    const/4 v1, 0x3

    .line 31
    if-ne v0, v1, :cond_0

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_0
    invoke-virtual {p4, v2}, Ljava/lang/String;->charAt(I)C

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    const/4 p3, 0x1

    .line 39
    const/4 p4, -0x2

    .line 40
    const/16 v0, 0x4a

    .line 41
    .line 42
    const/16 v1, 0x44

    .line 43
    .line 44
    packed-switch p1, :pswitch_data_0

    .line 45
    .line 46
    .line 47
    iget p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 48
    .line 49
    if-eq p2, v1, :cond_1

    .line 50
    .line 51
    if-ne p2, v0, :cond_2

    .line 52
    .line 53
    :cond_1
    const/4 p4, -0x3

    .line 54
    :cond_2
    :goto_0
    add-int/2addr p1, p4

    .line 55
    goto :goto_1

    .line 56
    :pswitch_0
    iget p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 57
    .line 58
    if-eq p2, v1, :cond_3

    .line 59
    .line 60
    if-ne p2, v0, :cond_4

    .line 61
    .line 62
    :cond_3
    move v2, p3

    .line 63
    :cond_4
    add-int/2addr p1, v2

    .line 64
    goto :goto_1

    .line 65
    :pswitch_1
    iget p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 66
    .line 67
    if-eq p2, v1, :cond_2

    .line 68
    .line 69
    if-ne p2, v0, :cond_5

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_5
    const/4 p4, -0x1

    .line 73
    goto :goto_0

    .line 74
    :pswitch_2
    iget p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 75
    .line 76
    if-eq p2, v1, :cond_6

    .line 77
    .line 78
    if-ne p2, v0, :cond_7

    .line 79
    .line 80
    :cond_6
    const/4 p3, 0x2

    .line 81
    :cond_7
    add-int/2addr p1, p3

    .line 82
    :goto_1
    iget p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 83
    .line 84
    if-le p1, p2, :cond_8

    .line 85
    .line 86
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 87
    .line 88
    :cond_8
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 89
    .line 90
    return-void

    .line 91
    :cond_9
    :goto_2
    iget-object p3, p3, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 92
    .line 93
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 94
    .line 95
    invoke-virtual {p3, p1, v2, p2, p0}, Lnet/bytebuddy/jar/asm/Frame;->execute(IILnet/bytebuddy/jar/asm/Symbol;Lnet/bytebuddy/jar/asm/SymbolTable;)V

    .line 96
    .line 97
    .line 98
    :cond_a
    return-void

    .line 99
    :pswitch_data_0
    .packed-switch 0xb2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->compute:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto/16 :goto_2

    .line 7
    .line 8
    :cond_0
    const/4 v2, -0x1

    .line 9
    const/4 v6, 0x2

    .line 10
    const/4 v3, 0x3

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x1

    .line 13
    if-ne v0, v3, :cond_3

    .line 14
    .line 15
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 16
    .line 17
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    new-instance p1, Lnet/bytebuddy/jar/asm/CurrentFrame;

    .line 22
    .line 23
    invoke-direct {p1, v0}, Lnet/bytebuddy/jar/asm/CurrentFrame;-><init>(Lnet/bytebuddy/jar/asm/Label;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, v0, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 27
    .line 28
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 29
    .line 30
    iget-object p1, p1, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 31
    .line 32
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 33
    .line 34
    iget v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->accessFlags:I

    .line 35
    .line 36
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->descriptor:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p1, p3, v0, v1, p2}, Lnet/bytebuddy/jar/asm/Frame;->setInputFrameFromDescriptor(Lnet/bytebuddy/jar/asm/SymbolTable;ILjava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 42
    .line 43
    iget-object p1, p1, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 44
    .line 45
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/Frame;->accept(Lnet/bytebuddy/jar/asm/MethodWriter;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_9

    .line 49
    .line 50
    :cond_1
    if-ne p1, v2, :cond_2

    .line 51
    .line 52
    move-object v0, v1

    .line 53
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 54
    .line 55
    move v2, p2

    .line 56
    move-object v3, p3

    .line 57
    move v4, p4

    .line 58
    move-object v5, p5

    .line 59
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/Frame;->setInputFrameFromApiFormat(Lnet/bytebuddy/jar/asm/SymbolTable;I[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 63
    .line 64
    iget-object p1, p1, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 65
    .line 66
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/Frame;->accept(Lnet/bytebuddy/jar/asm/MethodWriter;)V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_9

    .line 70
    .line 71
    :cond_3
    if-ne p1, v2, :cond_7

    .line 72
    .line 73
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->previousFrame:[I

    .line 74
    .line 75
    if-nez p1, :cond_4

    .line 76
    .line 77
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->descriptor:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {p1}, Lnet/bytebuddy/jar/asm/Type;->getArgumentsAndReturnSizes(Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    shr-int/2addr p1, v6

    .line 84
    new-instance v1, Lnet/bytebuddy/jar/asm/Frame;

    .line 85
    .line 86
    new-instance v2, Lnet/bytebuddy/jar/asm/Label;

    .line 87
    .line 88
    invoke-direct {v2}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-direct {v1, v2}, Lnet/bytebuddy/jar/asm/Frame;-><init>(Lnet/bytebuddy/jar/asm/Label;)V

    .line 92
    .line 93
    .line 94
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 95
    .line 96
    iget v3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->accessFlags:I

    .line 97
    .line 98
    iget-object v5, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->descriptor:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v1, v2, v3, v5, p1}, Lnet/bytebuddy/jar/asm/Frame;->setInputFrameFromDescriptor(Lnet/bytebuddy/jar/asm/SymbolTable;ILjava/lang/String;I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, p0}, Lnet/bytebuddy/jar/asm/Frame;->accept(Lnet/bytebuddy/jar/asm/MethodWriter;)V

    .line 104
    .line 105
    .line 106
    :cond_4
    iput p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentLocals:I

    .line 107
    .line 108
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 109
    .line 110
    iget p1, p1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2, p4}, Lnet/bytebuddy/jar/asm/MethodWriter;->visitFrameStart(III)I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    move v1, v7

    .line 117
    :goto_0
    if-ge v1, p2, :cond_5

    .line 118
    .line 119
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentFrame:[I

    .line 120
    .line 121
    add-int/lit8 v3, p1, 0x1

    .line 122
    .line 123
    iget-object v5, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 124
    .line 125
    aget-object v9, p3, v1

    .line 126
    .line 127
    invoke-static {v5, v9}, Lnet/bytebuddy/jar/asm/Frame;->getAbstractTypeFromApiFormat(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/Object;)I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    aput v5, v2, p1

    .line 132
    .line 133
    add-int/lit8 v1, v1, 0x1

    .line 134
    .line 135
    move p1, v3

    .line 136
    goto :goto_0

    .line 137
    :cond_5
    move p2, v7

    .line 138
    :goto_1
    if-ge p2, p4, :cond_6

    .line 139
    .line 140
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentFrame:[I

    .line 141
    .line 142
    add-int/lit8 v0, p1, 0x1

    .line 143
    .line 144
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 145
    .line 146
    aget-object v2, p5, p2

    .line 147
    .line 148
    invoke-static {v1, v2}, Lnet/bytebuddy/jar/asm/Frame;->getAbstractTypeFromApiFormat(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/Object;)I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    aput v1, p3, p1

    .line 153
    .line 154
    add-int/lit8 p2, p2, 0x1

    .line 155
    .line 156
    move p1, v0

    .line 157
    goto :goto_1

    .line 158
    :cond_6
    invoke-virtual {p0}, Lnet/bytebuddy/jar/asm/MethodWriter;->visitFrameEnd()V

    .line 159
    .line 160
    .line 161
    goto/16 :goto_9

    .line 162
    .line 163
    :cond_7
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 164
    .line 165
    invoke-virtual {v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->getMajorVersion()I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    const/16 v5, 0x32

    .line 170
    .line 171
    if-lt v2, v5, :cond_18

    .line 172
    .line 173
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 174
    .line 175
    if-nez v2, :cond_8

    .line 176
    .line 177
    new-instance v2, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 178
    .line 179
    invoke-direct {v2}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    .line 180
    .line 181
    .line 182
    iput-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 183
    .line 184
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 185
    .line 186
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_8
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 190
    .line 191
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 192
    .line 193
    iget v5, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->previousFrameOffset:I

    .line 194
    .line 195
    sub-int/2addr v2, v5

    .line 196
    sub-int/2addr v2, v8

    .line 197
    if-gez v2, :cond_a

    .line 198
    .line 199
    if-ne p1, v3, :cond_9

    .line 200
    .line 201
    :goto_2
    return-void

    .line 202
    :cond_9
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :cond_a
    :goto_3
    if-eqz p1, :cond_11

    .line 207
    .line 208
    if-eq p1, v8, :cond_10

    .line 209
    .line 210
    const/16 p3, 0xfb

    .line 211
    .line 212
    if-eq p1, v6, :cond_f

    .line 213
    .line 214
    const/16 p2, 0x40

    .line 215
    .line 216
    if-eq p1, v3, :cond_d

    .line 217
    .line 218
    if-ne p1, v1, :cond_c

    .line 219
    .line 220
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 221
    .line 222
    if-ge v2, p2, :cond_b

    .line 223
    .line 224
    add-int/2addr v2, p2

    .line 225
    invoke-virtual {p1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 226
    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_b
    const/16 p2, 0xf7

    .line 230
    .line 231
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-virtual {p1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 236
    .line 237
    .line 238
    :goto_4
    aget-object p1, p5, v7

    .line 239
    .line 240
    invoke-direct {p0, p1}, Lnet/bytebuddy/jar/asm/MethodWriter;->putFrameType(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    goto/16 :goto_8

    .line 244
    .line 245
    :cond_c
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 246
    .line 247
    .line 248
    return-void

    .line 249
    :cond_d
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 250
    .line 251
    if-ge v2, p2, :cond_e

    .line 252
    .line 253
    invoke-virtual {p1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 254
    .line 255
    .line 256
    goto :goto_8

    .line 257
    :cond_e
    invoke-virtual {p1, p3}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    invoke-virtual {p1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 262
    .line 263
    .line 264
    goto :goto_8

    .line 265
    :cond_f
    iget p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentLocals:I

    .line 266
    .line 267
    sub-int/2addr p1, p2

    .line 268
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentLocals:I

    .line 269
    .line 270
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 271
    .line 272
    sub-int/2addr p3, p2

    .line 273
    invoke-virtual {p1, p3}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    invoke-virtual {p1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 278
    .line 279
    .line 280
    goto :goto_8

    .line 281
    :cond_10
    iget p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentLocals:I

    .line 282
    .line 283
    add-int/2addr p1, p2

    .line 284
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentLocals:I

    .line 285
    .line 286
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 287
    .line 288
    add-int/lit16 v1, p2, 0xfb

    .line 289
    .line 290
    invoke-virtual {p1, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    invoke-virtual {p1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 295
    .line 296
    .line 297
    move p1, v7

    .line 298
    :goto_5
    if-ge p1, p2, :cond_13

    .line 299
    .line 300
    aget-object v1, p3, p1

    .line 301
    .line 302
    invoke-direct {p0, v1}, Lnet/bytebuddy/jar/asm/MethodWriter;->putFrameType(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    add-int/lit8 p1, p1, 0x1

    .line 306
    .line 307
    goto :goto_5

    .line 308
    :cond_11
    iput p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentLocals:I

    .line 309
    .line 310
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 311
    .line 312
    const/16 v1, 0xff

    .line 313
    .line 314
    invoke-virtual {p1, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    invoke-virtual {p1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 323
    .line 324
    .line 325
    move p1, v7

    .line 326
    :goto_6
    if-ge p1, p2, :cond_12

    .line 327
    .line 328
    aget-object v1, p3, p1

    .line 329
    .line 330
    invoke-direct {p0, v1}, Lnet/bytebuddy/jar/asm/MethodWriter;->putFrameType(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    add-int/lit8 p1, p1, 0x1

    .line 334
    .line 335
    goto :goto_6

    .line 336
    :cond_12
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 337
    .line 338
    invoke-virtual {p1, p4}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 339
    .line 340
    .line 341
    move p1, v7

    .line 342
    :goto_7
    if-ge p1, p4, :cond_13

    .line 343
    .line 344
    aget-object p2, p5, p1

    .line 345
    .line 346
    invoke-direct {p0, p2}, Lnet/bytebuddy/jar/asm/MethodWriter;->putFrameType(Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    add-int/lit8 p1, p1, 0x1

    .line 350
    .line 351
    goto :goto_7

    .line 352
    :cond_13
    :goto_8
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 353
    .line 354
    iget p1, p1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 355
    .line 356
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->previousFrameOffset:I

    .line 357
    .line 358
    iget p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableNumberOfEntries:I

    .line 359
    .line 360
    add-int/2addr p1, v8

    .line 361
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableNumberOfEntries:I

    .line 362
    .line 363
    :goto_9
    iget p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->compute:I

    .line 364
    .line 365
    if-ne p1, v6, :cond_17

    .line 366
    .line 367
    iput p4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 368
    .line 369
    :goto_a
    if-ge v7, p4, :cond_16

    .line 370
    .line 371
    aget-object p1, p5, v7

    .line 372
    .line 373
    sget-object p2, Lnet/bytebuddy/jar/asm/Opcodes;->LONG:Ljava/lang/Integer;

    .line 374
    .line 375
    if-eq p1, p2, :cond_14

    .line 376
    .line 377
    sget-object p2, Lnet/bytebuddy/jar/asm/Opcodes;->DOUBLE:Ljava/lang/Integer;

    .line 378
    .line 379
    if-ne p1, p2, :cond_15

    .line 380
    .line 381
    :cond_14
    iget p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 382
    .line 383
    add-int/2addr p1, v8

    .line 384
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 385
    .line 386
    :cond_15
    add-int/lit8 v7, v7, 0x1

    .line 387
    .line 388
    goto :goto_a

    .line 389
    :cond_16
    iget p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 390
    .line 391
    iget p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 392
    .line 393
    if-le p1, p2, :cond_17

    .line 394
    .line 395
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 396
    .line 397
    :cond_17
    iget p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxStack:I

    .line 398
    .line 399
    invoke-static {p1, p4}, Ljava/lang/Math;->max(II)I

    .line 400
    .line 401
    .line 402
    move-result p1

    .line 403
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxStack:I

    .line 404
    .line 405
    iget p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxLocals:I

    .line 406
    .line 407
    iget p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentLocals:I

    .line 408
    .line 409
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 410
    .line 411
    .line 412
    move-result p1

    .line 413
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxLocals:I

    .line 414
    .line 415
    return-void

    .line 416
    :cond_18
    const-string p0, "Class versions V1_5 or less must use F_NEW frames."

    .line 417
    .line 418
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    return-void
.end method

.method public visitFrameEnd()V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->previousFrame:[I

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 10
    .line 11
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 15
    .line 16
    :cond_0
    invoke-direct {p0}, Lnet/bytebuddy/jar/asm/MethodWriter;->putFrame()V

    .line 17
    .line 18
    .line 19
    iget v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableNumberOfEntries:I

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    iput v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableNumberOfEntries:I

    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentFrame:[I

    .line 26
    .line 27
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->previousFrame:[I

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentFrame:[I

    .line 31
    .line 32
    return-void
.end method

.method public visitFrameStart(III)I
    .locals 2

    .line 1
    add-int/lit8 v0, p2, 0x3

    .line 2
    .line 3
    add-int/2addr v0, p3

    .line 4
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentFrame:[I

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    array-length v1, v1

    .line 9
    if-ge v1, v0, :cond_1

    .line 10
    .line 11
    :cond_0
    new-array v0, v0, [I

    .line 12
    .line 13
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentFrame:[I

    .line 14
    .line 15
    :cond_1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentFrame:[I

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    aput p1, p0, v0

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    aput p2, p0, p1

    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    aput p3, p0, p1

    .line 25
    .line 26
    const/4 p0, 0x3

    .line 27
    return p0
.end method

.method public visitIincInsn(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    iget v1, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    const/16 v1, 0xff

    .line 8
    .line 9
    const/16 v2, 0x84

    .line 10
    .line 11
    if-gt p1, v1, :cond_1

    .line 12
    .line 13
    const/16 v1, 0x7f

    .line 14
    .line 15
    if-gt p2, v1, :cond_1

    .line 16
    .line 17
    const/16 v1, -0x80

    .line 18
    .line 19
    if-ge p2, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0, p1, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->put11(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    const/16 v1, 0xc4

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0, v2, p1}, Lnet/bytebuddy/jar/asm/ByteVector;->put12(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 41
    .line 42
    .line 43
    :goto_1
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 44
    .line 45
    if-eqz p2, :cond_3

    .line 46
    .line 47
    iget v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->compute:I

    .line 48
    .line 49
    const/4 v1, 0x4

    .line 50
    if-eq v0, v1, :cond_2

    .line 51
    .line 52
    const/4 v1, 0x3

    .line 53
    if-ne v0, v1, :cond_3

    .line 54
    .line 55
    :cond_2
    iget-object p2, p2, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    invoke-virtual {p2, v2, p1, v0, v0}, Lnet/bytebuddy/jar/asm/Frame;->execute(IILnet/bytebuddy/jar/asm/Symbol;Lnet/bytebuddy/jar/asm/SymbolTable;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    iget p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->compute:I

    .line 62
    .line 63
    if-eqz p2, :cond_4

    .line 64
    .line 65
    add-int/lit8 p1, p1, 0x1

    .line 66
    .line 67
    iget p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxLocals:I

    .line 68
    .line 69
    if-le p1, p2, :cond_4

    .line 70
    .line 71
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxLocals:I

    .line 72
    .line 73
    :cond_4
    return-void
.end method

.method public visitInsn(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    iget v1, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 11
    .line 12
    if-eqz v0, :cond_5

    .line 13
    .line 14
    iget v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->compute:I

    .line 15
    .line 16
    const/4 v2, 0x4

    .line 17
    if-eq v1, v2, :cond_2

    .line 18
    .line 19
    const/4 v2, 0x3

    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 24
    .line 25
    sget-object v1, Lnet/bytebuddy/jar/asm/MethodWriter;->STACK_SIZE_DELTA:[I

    .line 26
    .line 27
    aget v1, v1, p1

    .line 28
    .line 29
    add-int/2addr v0, v1

    .line 30
    iget v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 31
    .line 32
    if-le v0, v1, :cond_1

    .line 33
    .line 34
    iput v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 35
    .line 36
    :cond_1
    iput v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    :goto_0
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-virtual {v0, p1, v1, v2, v2}, Lnet/bytebuddy/jar/asm/Frame;->execute(IILnet/bytebuddy/jar/asm/Symbol;Lnet/bytebuddy/jar/asm/SymbolTable;)V

    .line 44
    .line 45
    .line 46
    :goto_1
    const/16 v0, 0xac

    .line 47
    .line 48
    if-lt p1, v0, :cond_3

    .line 49
    .line 50
    const/16 v0, 0xb1

    .line 51
    .line 52
    if-le p1, v0, :cond_4

    .line 53
    .line 54
    :cond_3
    const/16 v0, 0xbf

    .line 55
    .line 56
    if-ne p1, v0, :cond_5

    .line 57
    .line 58
    :cond_4
    invoke-direct {p0}, Lnet/bytebuddy/jar/asm/MethodWriter;->endCurrentBasicBlockWithNoSuccessor()V

    .line 59
    .line 60
    .line 61
    :cond_5
    return-void
.end method

.method public visitInsnAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    const v1, -0xffff01

    .line 4
    .line 5
    .line 6
    if-eqz p4, :cond_0

    .line 7
    .line 8
    and-int/2addr p1, v1

    .line 9
    iget p4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBytecodeOffset:I

    .line 10
    .line 11
    shl-int/lit8 p4, p4, 0x8

    .line 12
    .line 13
    or-int/2addr p1, p4

    .line 14
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastCodeRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 15
    .line 16
    invoke-static {v0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastCodeRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    and-int/2addr p1, v1

    .line 24
    iget p4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBytecodeOffset:I

    .line 25
    .line 26
    shl-int/lit8 p4, p4, 0x8

    .line 27
    .line 28
    or-int/2addr p1, p4

    .line 29
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastCodeRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 30
    .line 31
    invoke-static {v0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastCodeRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 36
    .line 37
    return-object p1
.end method

.method public visitIntInsn(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    iget v1, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    const/16 v1, 0x11

    .line 8
    .line 9
    if-ne p1, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->put12(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0, p1, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->put11(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 16
    .line 17
    .line 18
    :goto_0
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 19
    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    iget v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->compute:I

    .line 23
    .line 24
    const/4 v2, 0x4

    .line 25
    if-eq v1, v2, :cond_3

    .line 26
    .line 27
    const/4 v2, 0x3

    .line 28
    if-ne v1, v2, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/16 p2, 0xbc

    .line 32
    .line 33
    if-eq p1, p2, :cond_4

    .line 34
    .line 35
    iget p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 36
    .line 37
    add-int/lit8 p1, p1, 0x1

    .line 38
    .line 39
    iget p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 40
    .line 41
    if-le p1, p2, :cond_2

    .line 42
    .line 43
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 44
    .line 45
    :cond_2
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 46
    .line 47
    return-void

    .line 48
    :cond_3
    :goto_1
    iget-object p0, v0, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-virtual {p0, p1, p2, v0, v0}, Lnet/bytebuddy/jar/asm/Frame;->execute(IILnet/bytebuddy/jar/asm/Symbol;Lnet/bytebuddy/jar/asm/SymbolTable;)V

    .line 52
    .line 53
    .line 54
    :cond_4
    return-void
.end method

.method public varargs visitInvokeDynamicInsn(Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantInvokeDynamic(Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 14
    .line 15
    iget p3, p1, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 16
    .line 17
    const/16 p4, 0xba

    .line 18
    .line 19
    invoke-virtual {p2, p4, p3}, Lnet/bytebuddy/jar/asm/ByteVector;->put12(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 20
    .line 21
    .line 22
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 23
    .line 24
    const/4 p3, 0x0

    .line 25
    invoke-virtual {p2, p3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 26
    .line 27
    .line 28
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 29
    .line 30
    if-eqz p2, :cond_3

    .line 31
    .line 32
    iget v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->compute:I

    .line 33
    .line 34
    const/4 v1, 0x4

    .line 35
    if-eq v0, v1, :cond_2

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    if-ne v0, v1, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Symbol;->getArgumentsAndReturnSizes()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    and-int/lit8 p2, p1, 0x3

    .line 46
    .line 47
    shr-int/lit8 p1, p1, 0x2

    .line 48
    .line 49
    sub-int/2addr p2, p1

    .line 50
    add-int/lit8 p2, p2, 0x1

    .line 51
    .line 52
    iget p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 53
    .line 54
    add-int/2addr p1, p2

    .line 55
    iget p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 56
    .line 57
    if-le p1, p2, :cond_1

    .line 58
    .line 59
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 60
    .line 61
    :cond_1
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    :goto_0
    iget-object p2, p2, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 65
    .line 66
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 67
    .line 68
    invoke-virtual {p2, p4, p3, p1, p0}, Lnet/bytebuddy/jar/asm/Frame;->execute(IILnet/bytebuddy/jar/asm/Symbol;Lnet/bytebuddy/jar/asm/SymbolTable;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    return-void
.end method

.method public visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    iget v1, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    const/16 v2, 0xc8

    .line 8
    .line 9
    if-lt p1, v2, :cond_0

    .line 10
    .line 11
    add-int/lit8 v3, p1, -0x21

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v3, p1

    .line 15
    :goto_0
    iget-short v4, p2, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 16
    .line 17
    const/4 v5, 0x4

    .line 18
    and-int/2addr v4, v5

    .line 19
    const/16 v6, 0xa8

    .line 20
    .line 21
    const/16 v7, 0xa7

    .line 22
    .line 23
    const/4 v8, 0x0

    .line 24
    const/4 v9, 0x1

    .line 25
    if-eqz v4, :cond_4

    .line 26
    .line 27
    iget v4, p2, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 28
    .line 29
    sub-int/2addr v4, v1

    .line 30
    const/16 v1, -0x8000

    .line 31
    .line 32
    if-ge v4, v1, :cond_4

    .line 33
    .line 34
    if-ne v3, v7, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    if-ne v3, v6, :cond_2

    .line 41
    .line 42
    const/16 p1, 0xc9

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 45
    .line 46
    .line 47
    :goto_1
    move p1, v8

    .line 48
    goto :goto_3

    .line 49
    :cond_2
    const/16 p1, 0xc6

    .line 50
    .line 51
    if-lt v3, p1, :cond_3

    .line 52
    .line 53
    xor-int/lit8 p1, v3, 0x1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    add-int/lit8 p1, v3, 0x1

    .line 57
    .line 58
    xor-int/2addr p1, v9

    .line 59
    sub-int/2addr p1, v9

    .line 60
    :goto_2
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 64
    .line 65
    const/16 v0, 0x8

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 71
    .line 72
    const/16 v0, 0xdc

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 75
    .line 76
    .line 77
    iput-boolean v9, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->hasAsmInstructions:Z

    .line 78
    .line 79
    move p1, v9

    .line 80
    :goto_3
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 81
    .line 82
    iget v1, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 83
    .line 84
    sub-int/2addr v1, v9

    .line 85
    invoke-virtual {p2, v0, v1, v9}, Lnet/bytebuddy/jar/asm/Label;->put(Lnet/bytebuddy/jar/asm/ByteVector;IZ)V

    .line 86
    .line 87
    .line 88
    goto :goto_5

    .line 89
    :cond_4
    if-eq v3, p1, :cond_5

    .line 90
    .line 91
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 95
    .line 96
    iget v0, p1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 97
    .line 98
    sub-int/2addr v0, v9

    .line 99
    invoke-virtual {p2, p1, v0, v9}, Lnet/bytebuddy/jar/asm/Label;->put(Lnet/bytebuddy/jar/asm/ByteVector;IZ)V

    .line 100
    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_5
    invoke-virtual {v0, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 107
    .line 108
    iget v0, p1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 109
    .line 110
    sub-int/2addr v0, v9

    .line 111
    invoke-virtual {p2, p1, v0, v8}, Lnet/bytebuddy/jar/asm/Label;->put(Lnet/bytebuddy/jar/asm/ByteVector;IZ)V

    .line 112
    .line 113
    .line 114
    :goto_4
    move p1, v8

    .line 115
    :goto_5
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 116
    .line 117
    if-eqz v0, :cond_e

    .line 118
    .line 119
    iget v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->compute:I

    .line 120
    .line 121
    const/4 v2, 0x2

    .line 122
    const/4 v4, 0x0

    .line 123
    if-ne v1, v5, :cond_6

    .line 124
    .line 125
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 126
    .line 127
    invoke-virtual {v0, v3, v8, v4, v4}, Lnet/bytebuddy/jar/asm/Frame;->execute(IILnet/bytebuddy/jar/asm/Symbol;Lnet/bytebuddy/jar/asm/SymbolTable;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2}, Lnet/bytebuddy/jar/asm/Label;->getCanonicalInstance()Lnet/bytebuddy/jar/asm/Label;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iget-short v1, v0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 135
    .line 136
    or-int/2addr v1, v2

    .line 137
    int-to-short v1, v1

    .line 138
    iput-short v1, v0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 139
    .line 140
    invoke-direct {p0, v8, p2}, Lnet/bytebuddy/jar/asm/MethodWriter;->addSuccessorToCurrentBasicBlock(ILnet/bytebuddy/jar/asm/Label;)V

    .line 141
    .line 142
    .line 143
    if-eq v3, v7, :cond_b

    .line 144
    .line 145
    new-instance v4, Lnet/bytebuddy/jar/asm/Label;

    .line 146
    .line 147
    invoke-direct {v4}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 148
    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_6
    const/4 v5, 0x3

    .line 152
    if-ne v1, v5, :cond_7

    .line 153
    .line 154
    iget-object p2, v0, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 155
    .line 156
    invoke-virtual {p2, v3, v8, v4, v4}, Lnet/bytebuddy/jar/asm/Frame;->execute(IILnet/bytebuddy/jar/asm/Symbol;Lnet/bytebuddy/jar/asm/SymbolTable;)V

    .line 157
    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_7
    if-ne v1, v2, :cond_8

    .line 161
    .line 162
    iget p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 163
    .line 164
    sget-object v0, Lnet/bytebuddy/jar/asm/MethodWriter;->STACK_SIZE_DELTA:[I

    .line 165
    .line 166
    aget v0, v0, v3

    .line 167
    .line 168
    add-int/2addr p2, v0

    .line 169
    iput p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_8
    if-ne v3, v6, :cond_a

    .line 173
    .line 174
    iget-short v1, p2, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 175
    .line 176
    and-int/lit8 v4, v1, 0x20

    .line 177
    .line 178
    if-nez v4, :cond_9

    .line 179
    .line 180
    or-int/lit8 v1, v1, 0x20

    .line 181
    .line 182
    int-to-short v1, v1

    .line 183
    iput-short v1, p2, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 184
    .line 185
    iput-boolean v9, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->hasSubroutines:Z

    .line 186
    .line 187
    :cond_9
    iget-short v1, v0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 188
    .line 189
    or-int/lit8 v1, v1, 0x10

    .line 190
    .line 191
    int-to-short v1, v1

    .line 192
    iput-short v1, v0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 193
    .line 194
    iget v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 195
    .line 196
    add-int/2addr v0, v9

    .line 197
    invoke-direct {p0, v0, p2}, Lnet/bytebuddy/jar/asm/MethodWriter;->addSuccessorToCurrentBasicBlock(ILnet/bytebuddy/jar/asm/Label;)V

    .line 198
    .line 199
    .line 200
    new-instance v4, Lnet/bytebuddy/jar/asm/Label;

    .line 201
    .line 202
    invoke-direct {v4}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 203
    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_a
    iget v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 207
    .line 208
    sget-object v1, Lnet/bytebuddy/jar/asm/MethodWriter;->STACK_SIZE_DELTA:[I

    .line 209
    .line 210
    aget v1, v1, v3

    .line 211
    .line 212
    add-int/2addr v0, v1

    .line 213
    iput v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 214
    .line 215
    invoke-direct {p0, v0, p2}, Lnet/bytebuddy/jar/asm/MethodWriter;->addSuccessorToCurrentBasicBlock(ILnet/bytebuddy/jar/asm/Label;)V

    .line 216
    .line 217
    .line 218
    :cond_b
    :goto_6
    if-eqz v4, :cond_d

    .line 219
    .line 220
    if-eqz p1, :cond_c

    .line 221
    .line 222
    iget-short p1, v4, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 223
    .line 224
    or-int/2addr p1, v2

    .line 225
    int-to-short p1, p1

    .line 226
    iput-short p1, v4, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 227
    .line 228
    :cond_c
    invoke-virtual {p0, v4}, Lnet/bytebuddy/jar/asm/MethodWriter;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 229
    .line 230
    .line 231
    :cond_d
    if-ne v3, v7, :cond_e

    .line 232
    .line 233
    invoke-direct {p0}, Lnet/bytebuddy/jar/asm/MethodWriter;->endCurrentBasicBlockWithNoSuccessor()V

    .line 234
    .line 235
    .line 236
    :cond_e
    return-void
.end method

.method public visitLabel(Lnet/bytebuddy/jar/asm/Label;)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->hasAsmInstructions:Z

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 4
    .line 5
    iget-object v2, v1, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->stackMapTableEntries:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 8
    .line 9
    iget v1, v1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 10
    .line 11
    invoke-virtual {p1, v2, v3, v1}, Lnet/bytebuddy/jar/asm/Label;->resolve([BLnet/bytebuddy/jar/asm/ByteVector;I)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    or-int/2addr v0, v1

    .line 16
    iput-boolean v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->hasAsmInstructions:Z

    .line 17
    .line 18
    iget-short v0, p1, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 19
    .line 20
    and-int/lit8 v1, v0, 0x1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :cond_0
    iget v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->compute:I

    .line 27
    .line 28
    const/4 v2, 0x4

    .line 29
    const/4 v3, 0x0

    .line 30
    const/4 v4, 0x2

    .line 31
    if-ne v1, v2, :cond_5

    .line 32
    .line 33
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    iget v2, p1, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 38
    .line 39
    iget v5, v1, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 40
    .line 41
    if-ne v2, v5, :cond_1

    .line 42
    .line 43
    iget-short p0, v1, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 44
    .line 45
    and-int/2addr v0, v4

    .line 46
    or-int/2addr p0, v0

    .line 47
    int-to-short p0, p0

    .line 48
    iput-short p0, v1, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 49
    .line 50
    iget-object p0, v1, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 51
    .line 52
    iput-object p0, p1, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    invoke-direct {p0, v3, p1}, Lnet/bytebuddy/jar/asm/MethodWriter;->addSuccessorToCurrentBasicBlock(ILnet/bytebuddy/jar/asm/Label;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 59
    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    iget v1, p1, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 63
    .line 64
    iget v2, v0, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 65
    .line 66
    if-ne v1, v2, :cond_3

    .line 67
    .line 68
    iget-short v1, v0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 69
    .line 70
    iget-short v2, p1, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 71
    .line 72
    and-int/2addr v2, v4

    .line 73
    or-int/2addr v1, v2

    .line 74
    int-to-short v1, v1

    .line 75
    iput-short v1, v0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 76
    .line 77
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 78
    .line 79
    iput-object v1, p1, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 80
    .line 81
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 82
    .line 83
    return-void

    .line 84
    :cond_3
    iput-object p1, v0, Lnet/bytebuddy/jar/asm/Label;->nextBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 85
    .line 86
    :cond_4
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 87
    .line 88
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 89
    .line 90
    new-instance p0, Lnet/bytebuddy/jar/asm/Frame;

    .line 91
    .line 92
    invoke-direct {p0, p1}, Lnet/bytebuddy/jar/asm/Frame;-><init>(Lnet/bytebuddy/jar/asm/Label;)V

    .line 93
    .line 94
    .line 95
    iput-object p0, p1, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 96
    .line 97
    return-void

    .line 98
    :cond_5
    const/4 v0, 0x3

    .line 99
    if-ne v1, v0, :cond_7

    .line 100
    .line 101
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 102
    .line 103
    if-nez v0, :cond_6

    .line 104
    .line 105
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 106
    .line 107
    return-void

    .line 108
    :cond_6
    iget-object p0, v0, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 109
    .line 110
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/Frame;->owner:Lnet/bytebuddy/jar/asm/Label;

    .line 111
    .line 112
    return-void

    .line 113
    :cond_7
    const/4 v0, 0x1

    .line 114
    if-ne v1, v0, :cond_a

    .line 115
    .line 116
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 117
    .line 118
    if-eqz v0, :cond_8

    .line 119
    .line 120
    iget v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 121
    .line 122
    int-to-short v1, v1

    .line 123
    iput-short v1, v0, Lnet/bytebuddy/jar/asm/Label;->outputStackMax:S

    .line 124
    .line 125
    iget v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 126
    .line 127
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/jar/asm/MethodWriter;->addSuccessorToCurrentBasicBlock(ILnet/bytebuddy/jar/asm/Label;)V

    .line 128
    .line 129
    .line 130
    :cond_8
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 131
    .line 132
    iput v3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 133
    .line 134
    iput v3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 135
    .line 136
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 137
    .line 138
    if-eqz v0, :cond_9

    .line 139
    .line 140
    iput-object p1, v0, Lnet/bytebuddy/jar/asm/Label;->nextBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 141
    .line 142
    :cond_9
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 143
    .line 144
    return-void

    .line 145
    :cond_a
    if-ne v1, v4, :cond_b

    .line 146
    .line 147
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 148
    .line 149
    if-nez v0, :cond_b

    .line 150
    .line 151
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 152
    .line 153
    :cond_b
    :goto_0
    return-void
.end method

.method public visitLdcInsn(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstant(Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget v0, p1, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 14
    .line 15
    iget v1, p1, Lnet/bytebuddy/jar/asm/Symbol;->tag:I

    .line 16
    .line 17
    const/4 v2, 0x5

    .line 18
    const/4 v3, 0x1

    .line 19
    const/4 v4, 0x0

    .line 20
    if-eq v1, v2, :cond_1

    .line 21
    .line 22
    const/4 v2, 0x6

    .line 23
    if-eq v1, v2, :cond_1

    .line 24
    .line 25
    const/16 v2, 0x11

    .line 26
    .line 27
    if-ne v1, v2, :cond_0

    .line 28
    .line 29
    iget-object v1, p1, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/16 v2, 0x4a

    .line 36
    .line 37
    if-eq v1, v2, :cond_1

    .line 38
    .line 39
    const/16 v2, 0x44

    .line 40
    .line 41
    if-ne v1, v2, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move v1, v4

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    move v1, v3

    .line 47
    :goto_1
    const/16 v2, 0x12

    .line 48
    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    iget-object v5, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 52
    .line 53
    const/16 v6, 0x14

    .line 54
    .line 55
    invoke-virtual {v5, v6, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->put12(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    iget-object v5, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 60
    .line 61
    const/16 v6, 0x100

    .line 62
    .line 63
    if-lt v0, v6, :cond_3

    .line 64
    .line 65
    const/16 v6, 0x13

    .line 66
    .line 67
    invoke-virtual {v5, v6, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->put12(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-virtual {v5, v2, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->put11(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 72
    .line 73
    .line 74
    :goto_2
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 75
    .line 76
    if-eqz v0, :cond_8

    .line 77
    .line 78
    iget v5, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->compute:I

    .line 79
    .line 80
    const/4 v6, 0x4

    .line 81
    if-eq v5, v6, :cond_7

    .line 82
    .line 83
    const/4 v6, 0x3

    .line 84
    if-ne v5, v6, :cond_4

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_4
    iget p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 88
    .line 89
    if-eqz v1, :cond_5

    .line 90
    .line 91
    const/4 v3, 0x2

    .line 92
    :cond_5
    add-int/2addr p1, v3

    .line 93
    iget v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 94
    .line 95
    if-le p1, v0, :cond_6

    .line 96
    .line 97
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 98
    .line 99
    :cond_6
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 100
    .line 101
    return-void

    .line 102
    :cond_7
    :goto_3
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 103
    .line 104
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 105
    .line 106
    invoke-virtual {v0, v2, v4, p1, p0}, Lnet/bytebuddy/jar/asm/Frame;->execute(IILnet/bytebuddy/jar/asm/Symbol;Lnet/bytebuddy/jar/asm/SymbolTable;)V

    .line 107
    .line 108
    .line 109
    :cond_8
    return-void
.end method

.method public visitLineNumber(ILnet/bytebuddy/jar/asm/Label;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lineNumberTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 6
    .line 7
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lineNumberTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 11
    .line 12
    :cond_0
    iget v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lineNumberTableLength:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    iput v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lineNumberTableLength:I

    .line 17
    .line 18
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lineNumberTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 19
    .line 20
    iget p2, p2, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 21
    .line 22
    invoke-virtual {v0, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lineNumberTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public visitLocalVariable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p3, :cond_1

    .line 3
    .line 4
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTypeTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 9
    .line 10
    invoke-direct {v1}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTypeTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 14
    .line 15
    :cond_0
    iget v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTypeTableLength:I

    .line 16
    .line 17
    add-int/2addr v1, v0

    .line 18
    iput v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTypeTableLength:I

    .line 19
    .line 20
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTypeTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 21
    .line 22
    iget v2, p4, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget v2, p5, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 29
    .line 30
    iget v3, p4, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 31
    .line 32
    sub-int/2addr v2, v3

    .line 33
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 38
    .line 39
    invoke-virtual {v2, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 48
    .line 49
    invoke-virtual {v2, p3}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    invoke-virtual {v1, p3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    invoke-virtual {p3, p6}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 58
    .line 59
    .line 60
    :cond_1
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 61
    .line 62
    if-nez p3, :cond_2

    .line 63
    .line 64
    new-instance p3, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 65
    .line 66
    invoke-direct {p3}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 70
    .line 71
    :cond_2
    iget p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTableLength:I

    .line 72
    .line 73
    add-int/2addr p3, v0

    .line 74
    iput p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTableLength:I

    .line 75
    .line 76
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->localVariableTable:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 77
    .line 78
    iget v1, p4, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 79
    .line 80
    invoke-virtual {p3, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    iget p5, p5, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 85
    .line 86
    iget p4, p4, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 87
    .line 88
    sub-int/2addr p5, p4

    .line 89
    invoke-virtual {p3, p5}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 94
    .line 95
    invoke-virtual {p4, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-virtual {p3, p1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 104
    .line 105
    invoke-virtual {p3, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result p3

    .line 109
    invoke-virtual {p1, p3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p1, p6}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 114
    .line 115
    .line 116
    iget p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->compute:I

    .line 117
    .line 118
    if-eqz p1, :cond_5

    .line 119
    .line 120
    const/4 p1, 0x0

    .line 121
    invoke-virtual {p2, p1}, Ljava/lang/String;->charAt(I)C

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    const/16 p2, 0x4a

    .line 126
    .line 127
    if-eq p1, p2, :cond_3

    .line 128
    .line 129
    const/16 p2, 0x44

    .line 130
    .line 131
    if-ne p1, p2, :cond_4

    .line 132
    .line 133
    :cond_3
    const/4 v0, 0x2

    .line 134
    :cond_4
    add-int/2addr p6, v0

    .line 135
    iget p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxLocals:I

    .line 136
    .line 137
    if-le p6, p1, :cond_5

    .line 138
    .line 139
    iput p6, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxLocals:I

    .line 140
    .line 141
    :cond_5
    return-void
.end method

.method public visitLocalVariableAnnotation(ILnet/bytebuddy/jar/asm/TypePath;[Lnet/bytebuddy/jar/asm/Label;[Lnet/bytebuddy/jar/asm/Label;[ILjava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    .line 4
    .line 5
    .line 6
    ushr-int/lit8 p1, p1, 0x18

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    array-length v1, p3

    .line 13
    invoke-virtual {p1, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    move v1, p1

    .line 18
    :goto_0
    array-length v2, p3

    .line 19
    if-ge v1, v2, :cond_0

    .line 20
    .line 21
    aget-object v2, p3, v1

    .line 22
    .line 23
    iget v2, v2, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    aget-object v3, p4, v1

    .line 30
    .line 31
    iget v3, v3, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 32
    .line 33
    aget-object v4, p3, v1

    .line 34
    .line 35
    iget v4, v4, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 36
    .line 37
    sub-int/2addr v3, v4

    .line 38
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    aget v3, p5, v1

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 45
    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-static {p2, v0}, Lnet/bytebuddy/jar/asm/TypePath;->put(Lnet/bytebuddy/jar/asm/TypePath;Lnet/bytebuddy/jar/asm/ByteVector;)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 54
    .line 55
    invoke-virtual {p2, p6}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    invoke-virtual {v0, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-virtual {p2, p1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 67
    .line 68
    const/4 p2, 0x1

    .line 69
    if-eqz p7, :cond_1

    .line 70
    .line 71
    new-instance p3, Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 72
    .line 73
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastCodeRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 74
    .line 75
    invoke-direct {p3, p1, p2, v0, p4}, Lnet/bytebuddy/jar/asm/AnnotationWriter;-><init>(Lnet/bytebuddy/jar/asm/SymbolTable;ZLnet/bytebuddy/jar/asm/ByteVector;Lnet/bytebuddy/jar/asm/AnnotationWriter;)V

    .line 76
    .line 77
    .line 78
    iput-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastCodeRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 79
    .line 80
    return-object p3

    .line 81
    :cond_1
    new-instance p3, Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 82
    .line 83
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastCodeRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 84
    .line 85
    invoke-direct {p3, p1, p2, v0, p4}, Lnet/bytebuddy/jar/asm/AnnotationWriter;-><init>(Lnet/bytebuddy/jar/asm/SymbolTable;ZLnet/bytebuddy/jar/asm/ByteVector;Lnet/bytebuddy/jar/asm/AnnotationWriter;)V

    .line 86
    .line 87
    .line 88
    iput-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastCodeRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 89
    .line 90
    return-object p3
.end method

.method public visitLookupSwitchInsn(Lnet/bytebuddy/jar/asm/Label;[I[Lnet/bytebuddy/jar/asm/Label;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    iget v1, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    const/16 v1, 0xab

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 14
    .line 15
    iget v1, v1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 16
    .line 17
    rem-int/lit8 v1, v1, 0x4

    .line 18
    .line 19
    rsub-int/lit8 v1, v1, 0x4

    .line 20
    .line 21
    rem-int/lit8 v1, v1, 0x4

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-virtual {v0, v2, v3, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 29
    .line 30
    iget v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBytecodeOffset:I

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-virtual {p1, v0, v1, v2}, Lnet/bytebuddy/jar/asm/Label;->put(Lnet/bytebuddy/jar/asm/ByteVector;IZ)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 37
    .line 38
    array-length v1, p3

    .line 39
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 40
    .line 41
    .line 42
    :goto_0
    array-length v0, p3

    .line 43
    if-ge v3, v0, :cond_0

    .line 44
    .line 45
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 46
    .line 47
    aget v1, p2, v3

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 50
    .line 51
    .line 52
    aget-object v0, p3, v3

    .line 53
    .line 54
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 55
    .line 56
    iget v4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBytecodeOffset:I

    .line 57
    .line 58
    invoke-virtual {v0, v1, v4, v2}, Lnet/bytebuddy/jar/asm/Label;->put(Lnet/bytebuddy/jar/asm/ByteVector;IZ)V

    .line 59
    .line 60
    .line 61
    add-int/lit8 v3, v3, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-direct {p0, p1, p3}, Lnet/bytebuddy/jar/asm/MethodWriter;->visitSwitchInsn(Lnet/bytebuddy/jar/asm/Label;[Lnet/bytebuddy/jar/asm/Label;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public visitMaxs(II)V
    .locals 2

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->compute:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lnet/bytebuddy/jar/asm/MethodWriter;->computeAllFrames()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v1, 0x1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    invoke-direct {p0}, Lnet/bytebuddy/jar/asm/MethodWriter;->computeMaxStackAndLocal()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    const/4 v1, 0x2

    .line 18
    if-ne v0, v1, :cond_2

    .line 19
    .line 20
    iget p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 21
    .line 22
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxStack:I

    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxStack:I

    .line 26
    .line 27
    iput p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxLocals:I

    .line 28
    .line 29
    return-void
.end method

.method public visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 8
    .line 9
    invoke-virtual {v0, p2, p3, p4, p5}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantMethodref(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/Symbol;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 14
    .line 15
    const/4 p4, 0x0

    .line 16
    const/16 p5, 0xb9

    .line 17
    .line 18
    if-ne p1, p5, :cond_0

    .line 19
    .line 20
    iget v0, p2, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 21
    .line 22
    invoke-virtual {p3, p5, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->put12(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-virtual {p2}, Lnet/bytebuddy/jar/asm/Symbol;->getArgumentsAndReturnSizes()I

    .line 27
    .line 28
    .line 29
    move-result p5

    .line 30
    shr-int/lit8 p5, p5, 0x2

    .line 31
    .line 32
    invoke-virtual {p3, p5, p4}, Lnet/bytebuddy/jar/asm/ByteVector;->put11(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget p5, p2, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 37
    .line 38
    invoke-virtual {p3, p1, p5}, Lnet/bytebuddy/jar/asm/ByteVector;->put12(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 39
    .line 40
    .line 41
    :goto_0
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 42
    .line 43
    if-eqz p3, :cond_5

    .line 44
    .line 45
    iget p5, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->compute:I

    .line 46
    .line 47
    const/4 v0, 0x4

    .line 48
    if-eq p5, v0, :cond_4

    .line 49
    .line 50
    const/4 v0, 0x3

    .line 51
    if-ne p5, v0, :cond_1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    invoke-virtual {p2}, Lnet/bytebuddy/jar/asm/Symbol;->getArgumentsAndReturnSizes()I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    and-int/lit8 p3, p2, 0x3

    .line 59
    .line 60
    shr-int/lit8 p2, p2, 0x2

    .line 61
    .line 62
    sub-int/2addr p3, p2

    .line 63
    iget p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 64
    .line 65
    const/16 p4, 0xb8

    .line 66
    .line 67
    if-ne p1, p4, :cond_2

    .line 68
    .line 69
    add-int/2addr p2, p3

    .line 70
    add-int/lit8 p2, p2, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    add-int/2addr p2, p3

    .line 74
    :goto_1
    iget p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 75
    .line 76
    if-le p2, p1, :cond_3

    .line 77
    .line 78
    iput p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 79
    .line 80
    :cond_3
    iput p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 81
    .line 82
    return-void

    .line 83
    :cond_4
    :goto_2
    iget-object p3, p3, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 84
    .line 85
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 86
    .line 87
    invoke-virtual {p3, p1, p4, p2, p0}, Lnet/bytebuddy/jar/asm/Frame;->execute(IILnet/bytebuddy/jar/asm/Symbol;Lnet/bytebuddy/jar/asm/SymbolTable;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    return-void
.end method

.method public visitMultiANewArrayInsn(Ljava/lang/String;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 14
    .line 15
    iget v1, p1, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 16
    .line 17
    const/16 v2, 0xc5

    .line 18
    .line 19
    invoke-virtual {v0, v2, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->put12(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->compute:I

    .line 31
    .line 32
    const/4 v3, 0x4

    .line 33
    if-eq v1, v3, :cond_1

    .line 34
    .line 35
    const/4 v3, 0x3

    .line 36
    if-ne v1, v3, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 40
    .line 41
    rsub-int/lit8 p2, p2, 0x1

    .line 42
    .line 43
    add-int/2addr p2, p1

    .line 44
    iput p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    :goto_0
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 48
    .line 49
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 50
    .line 51
    invoke-virtual {v0, v2, p2, p1, p0}, Lnet/bytebuddy/jar/asm/Frame;->execute(IILnet/bytebuddy/jar/asm/Symbol;Lnet/bytebuddy/jar/asm/SymbolTable;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void
.end method

.method public visitParameter(Ljava/lang/String;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->parameters:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 6
    .line 7
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->parameters:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 11
    .line 12
    :cond_0
    iget v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->parametersCount:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    iput v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->parametersCount:I

    .line 17
    .line 18
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->parameters:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    :goto_0
    invoke-virtual {v0, p0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public visitParameterAnnotation(ILjava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 1

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeVisibleParameterAnnotations:[Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->descriptor:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p3}, Lnet/bytebuddy/jar/asm/Type;->getArgumentCount(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    new-array p3, p3, [Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 14
    .line 15
    iput-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeVisibleParameterAnnotations:[Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 16
    .line 17
    :cond_0
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeVisibleParameterAnnotations:[Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 18
    .line 19
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 20
    .line 21
    aget-object v0, p3, p1

    .line 22
    .line 23
    invoke-static {p0, p2, v0}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    aput-object p0, p3, p1

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeInvisibleParameterAnnotations:[Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 31
    .line 32
    if-nez p3, :cond_2

    .line 33
    .line 34
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->descriptor:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {p3}, Lnet/bytebuddy/jar/asm/Type;->getArgumentCount(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    new-array p3, p3, [Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 41
    .line 42
    iput-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeInvisibleParameterAnnotations:[Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 43
    .line 44
    :cond_2
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeInvisibleParameterAnnotations:[Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 45
    .line 46
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 47
    .line 48
    aget-object v0, p3, p1

    .line 49
    .line 50
    invoke-static {p0, p2, v0}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    aput-object p0, p3, p1

    .line 55
    .line 56
    return-object p0
.end method

.method public varargs visitTableSwitchInsn(IILnet/bytebuddy/jar/asm/Label;[Lnet/bytebuddy/jar/asm/Label;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    iget v1, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    const/16 v1, 0xaa

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 14
    .line 15
    iget v1, v1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 16
    .line 17
    rem-int/lit8 v1, v1, 0x4

    .line 18
    .line 19
    rsub-int/lit8 v1, v1, 0x4

    .line 20
    .line 21
    rem-int/lit8 v1, v1, 0x4

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-virtual {v0, v2, v3, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 29
    .line 30
    iget v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBytecodeOffset:I

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-virtual {p3, v0, v1, v2}, Lnet/bytebuddy/jar/asm/Label;->put(Lnet/bytebuddy/jar/asm/ByteVector;IZ)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 43
    .line 44
    .line 45
    array-length p1, p4

    .line 46
    :goto_0
    if-ge v3, p1, :cond_0

    .line 47
    .line 48
    aget-object p2, p4, v3

    .line 49
    .line 50
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 51
    .line 52
    iget v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBytecodeOffset:I

    .line 53
    .line 54
    invoke-virtual {p2, v0, v1, v2}, Lnet/bytebuddy/jar/asm/Label;->put(Lnet/bytebuddy/jar/asm/ByteVector;IZ)V

    .line 55
    .line 56
    .line 57
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-direct {p0, p3, p4}, Lnet/bytebuddy/jar/asm/MethodWriter;->visitSwitchInsn(Lnet/bytebuddy/jar/asm/Label;[Lnet/bytebuddy/jar/asm/Label;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public visitTryCatchAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastCodeRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 6
    .line 7
    invoke-static {v0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastCodeRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastCodeRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 15
    .line 16
    invoke-static {v0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastCodeRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 21
    .line 22
    return-object p1
.end method

.method public visitTryCatchBlock(Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;Ljava/lang/String;)V
    .locals 6

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/Handler;

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 6
    .line 7
    invoke-virtual {v1, p4}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget v1, v1, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 12
    .line 13
    :goto_0
    move-object v2, p2

    .line 14
    move-object v3, p3

    .line 15
    move-object v5, p4

    .line 16
    move v4, v1

    .line 17
    move-object v1, p1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    goto :goto_0

    .line 21
    :goto_1
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/Handler;-><init>(Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstHandler:Lnet/bytebuddy/jar/asm/Handler;

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstHandler:Lnet/bytebuddy/jar/asm/Handler;

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastHandler:Lnet/bytebuddy/jar/asm/Handler;

    .line 32
    .line 33
    iput-object v0, p1, Lnet/bytebuddy/jar/asm/Handler;->nextHandler:Lnet/bytebuddy/jar/asm/Handler;

    .line 34
    .line 35
    :goto_2
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastHandler:Lnet/bytebuddy/jar/asm/Handler;

    .line 36
    .line 37
    return-void
.end method

.method public visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 6
    .line 7
    invoke-static {v0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 15
    .line 16
    invoke-static {v0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 21
    .line 22
    return-object p1
.end method

.method public visitTypeInsn(ILjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 8
    .line 9
    invoke-virtual {v0, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 14
    .line 15
    iget v1, p2, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 16
    .line 17
    invoke-virtual {v0, p1, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->put12(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    iget v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->compute:I

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    if-eq v1, v2, :cond_2

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    if-ne v1, v2, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/16 p2, 0xbb

    .line 34
    .line 35
    if-ne p1, p2, :cond_3

    .line 36
    .line 37
    iget p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 38
    .line 39
    add-int/lit8 p1, p1, 0x1

    .line 40
    .line 41
    iget p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 42
    .line 43
    if-le p1, p2, :cond_1

    .line 44
    .line 45
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 46
    .line 47
    :cond_1
    iput p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    :goto_0
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 51
    .line 52
    iget v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBytecodeOffset:I

    .line 53
    .line 54
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 55
    .line 56
    invoke-virtual {v0, p1, v1, p2, p0}, Lnet/bytebuddy/jar/asm/Frame;->execute(IILnet/bytebuddy/jar/asm/Symbol;Lnet/bytebuddy/jar/asm/SymbolTable;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    return-void
.end method

.method public visitVarInsn(II)V
    .locals 6

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->code:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    iget v1, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    const/16 v1, 0xa9

    .line 8
    .line 9
    const/16 v2, 0x36

    .line 10
    .line 11
    const/4 v3, 0x4

    .line 12
    if-ge p2, v3, :cond_1

    .line 13
    .line 14
    if-eq p1, v1, :cond_1

    .line 15
    .line 16
    if-ge p1, v2, :cond_0

    .line 17
    .line 18
    add-int/lit8 v4, p1, -0x15

    .line 19
    .line 20
    shl-int/lit8 v4, v4, 0x2

    .line 21
    .line 22
    add-int/lit8 v4, v4, 0x1a

    .line 23
    .line 24
    :goto_0
    add-int/2addr v4, p2

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    add-int/lit8 v4, p1, -0x36

    .line 27
    .line 28
    shl-int/lit8 v4, v4, 0x2

    .line 29
    .line 30
    add-int/lit8 v4, v4, 0x3b

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    invoke-virtual {v0, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    const/16 v4, 0x100

    .line 38
    .line 39
    if-lt p2, v4, :cond_2

    .line 40
    .line 41
    const/16 v4, 0xc4

    .line 42
    .line 43
    invoke-virtual {v0, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0, p1, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->put12(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    invoke-virtual {v0, p1, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->put11(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 52
    .line 53
    .line 54
    :goto_2
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->currentBasicBlock:Lnet/bytebuddy/jar/asm/Label;

    .line 55
    .line 56
    if-eqz v0, :cond_7

    .line 57
    .line 58
    iget v4, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->compute:I

    .line 59
    .line 60
    if-eq v4, v3, :cond_6

    .line 61
    .line 62
    const/4 v5, 0x3

    .line 63
    if-ne v4, v5, :cond_3

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    if-ne p1, v1, :cond_4

    .line 67
    .line 68
    iget-short v1, v0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 69
    .line 70
    or-int/lit8 v1, v1, 0x40

    .line 71
    .line 72
    int-to-short v1, v1

    .line 73
    iput-short v1, v0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 74
    .line 75
    iget v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 76
    .line 77
    int-to-short v1, v1

    .line 78
    iput-short v1, v0, Lnet/bytebuddy/jar/asm/Label;->outputStackSize:S

    .line 79
    .line 80
    invoke-direct {p0}, Lnet/bytebuddy/jar/asm/MethodWriter;->endCurrentBasicBlockWithNoSuccessor()V

    .line 81
    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_4
    iget v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 85
    .line 86
    sget-object v1, Lnet/bytebuddy/jar/asm/MethodWriter;->STACK_SIZE_DELTA:[I

    .line 87
    .line 88
    aget v1, v1, p1

    .line 89
    .line 90
    add-int/2addr v0, v1

    .line 91
    iget v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 92
    .line 93
    if-le v0, v1, :cond_5

    .line 94
    .line 95
    iput v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxRelativeStackSize:I

    .line 96
    .line 97
    :cond_5
    iput v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->relativeStackSize:I

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_6
    :goto_3
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 101
    .line 102
    const/4 v1, 0x0

    .line 103
    invoke-virtual {v0, p1, p2, v1, v1}, Lnet/bytebuddy/jar/asm/Frame;->execute(IILnet/bytebuddy/jar/asm/Symbol;Lnet/bytebuddy/jar/asm/SymbolTable;)V

    .line 104
    .line 105
    .line 106
    :cond_7
    :goto_4
    iget v0, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->compute:I

    .line 107
    .line 108
    if-eqz v0, :cond_a

    .line 109
    .line 110
    const/16 v1, 0x16

    .line 111
    .line 112
    if-eq p1, v1, :cond_9

    .line 113
    .line 114
    const/16 v1, 0x18

    .line 115
    .line 116
    if-eq p1, v1, :cond_9

    .line 117
    .line 118
    const/16 v1, 0x37

    .line 119
    .line 120
    if-eq p1, v1, :cond_9

    .line 121
    .line 122
    const/16 v1, 0x39

    .line 123
    .line 124
    if-ne p1, v1, :cond_8

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_8
    add-int/lit8 p2, p2, 0x1

    .line 128
    .line 129
    goto :goto_6

    .line 130
    :cond_9
    :goto_5
    add-int/lit8 p2, p2, 0x2

    .line 131
    .line 132
    :goto_6
    iget v1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxLocals:I

    .line 133
    .line 134
    if-le p2, v1, :cond_a

    .line 135
    .line 136
    iput p2, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->maxLocals:I

    .line 137
    .line 138
    :cond_a
    if-lt p1, v2, :cond_b

    .line 139
    .line 140
    if-ne v0, v3, :cond_b

    .line 141
    .line 142
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/MethodWriter;->firstHandler:Lnet/bytebuddy/jar/asm/Handler;

    .line 143
    .line 144
    if-eqz p1, :cond_b

    .line 145
    .line 146
    new-instance p1, Lnet/bytebuddy/jar/asm/Label;

    .line 147
    .line 148
    invoke-direct {p1}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/MethodWriter;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 152
    .line 153
    .line 154
    :cond_b
    return-void
.end method
