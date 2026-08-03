.class final Lbsh/org/objectweb/asm/MethodWriter;
.super Lbsh/org/objectweb/asm/MethodVisitor;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


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

.field private final code:Lbsh/org/objectweb/asm/ByteVector;

.field private final compute:I

.field private currentBasicBlock:Lbsh/org/objectweb/asm/Label;

.field private currentFrame:[I

.field private currentLocals:I

.field private defaultValue:Lbsh/org/objectweb/asm/ByteVector;

.field private final descriptor:Ljava/lang/String;

.field private final descriptorIndex:I

.field private final exceptionIndexTable:[I

.field private firstAttribute:Lbsh/org/objectweb/asm/Attribute;

.field private firstBasicBlock:Lbsh/org/objectweb/asm/Label;

.field private firstCodeAttribute:Lbsh/org/objectweb/asm/Attribute;

.field private firstHandler:Lbsh/org/objectweb/asm/Handler;

.field private hasAsmInstructions:Z

.field private hasSubroutines:Z

.field private lastBasicBlock:Lbsh/org/objectweb/asm/Label;

.field private lastBytecodeOffset:I

.field private lastHandler:Lbsh/org/objectweb/asm/Handler;

.field private lineNumberTable:Lbsh/org/objectweb/asm/ByteVector;

.field private lineNumberTableLength:I

.field private localVariableTable:Lbsh/org/objectweb/asm/ByteVector;

.field private localVariableTableLength:I

.field private localVariableTypeTable:Lbsh/org/objectweb/asm/ByteVector;

.field private localVariableTypeTableLength:I

.field private maxLocals:I

.field private maxRelativeStackSize:I

.field private maxStack:I

.field private final nameIndex:I

.field private final numberOfExceptions:I

.field private parameters:Lbsh/org/objectweb/asm/ByteVector;

.field private parametersCount:I

.field private previousFrame:[I

.field private previousFrameOffset:I

.field private relativeStackSize:I

.field private final signatureIndex:I

.field private sourceLength:I

.field private sourceOffset:I

.field private stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

.field private stackMapTableNumberOfEntries:I

.field private final symbolTable:Lbsh/org/objectweb/asm/SymbolTable;


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
    sput-object v0, Lbsh/org/objectweb/asm/MethodWriter;->STACK_SIZE_DELTA:[I

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

.method public constructor <init>(Lbsh/org/objectweb/asm/SymbolTable;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/high16 v0, 0x60000

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/org/objectweb/asm/MethodVisitor;-><init>(I)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lbsh/org/objectweb/asm/ByteVector;

    .line 7
    .line 8
    invoke-direct {v0}, Lbsh/org/objectweb/asm/ByteVector;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 12
    .line 13
    iput-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

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
    iput v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->accessFlags:I

    .line 29
    .line 30
    invoke-virtual {p1, p3}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    iput p3, p0, Lbsh/org/objectweb/asm/MethodWriter;->nameIndex:I

    .line 35
    .line 36
    invoke-virtual {p1, p4}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    iput p3, p0, Lbsh/org/objectweb/asm/MethodWriter;->descriptorIndex:I

    .line 41
    .line 42
    iput-object p4, p0, Lbsh/org/objectweb/asm/MethodWriter;->descriptor:Ljava/lang/String;

    .line 43
    .line 44
    const/4 p3, 0x0

    .line 45
    if-nez p5, :cond_1

    .line 46
    .line 47
    move p5, p3

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {p1, p5}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result p5

    .line 53
    :goto_1
    iput p5, p0, Lbsh/org/objectweb/asm/MethodWriter;->signatureIndex:I

    .line 54
    .line 55
    if-eqz p6, :cond_2

    .line 56
    .line 57
    array-length p5, p6

    .line 58
    if-lez p5, :cond_2

    .line 59
    .line 60
    array-length p5, p6

    .line 61
    iput p5, p0, Lbsh/org/objectweb/asm/MethodWriter;->numberOfExceptions:I

    .line 62
    .line 63
    new-array p5, p5, [I

    .line 64
    .line 65
    iput-object p5, p0, Lbsh/org/objectweb/asm/MethodWriter;->exceptionIndexTable:[I

    .line 66
    .line 67
    :goto_2
    iget p5, p0, Lbsh/org/objectweb/asm/MethodWriter;->numberOfExceptions:I

    .line 68
    .line 69
    if-ge p3, p5, :cond_3

    .line 70
    .line 71
    iget-object p5, p0, Lbsh/org/objectweb/asm/MethodWriter;->exceptionIndexTable:[I

    .line 72
    .line 73
    aget-object v0, p6, p3

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget v0, v0, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 80
    .line 81
    aput v0, p5, p3

    .line 82
    .line 83
    add-int/lit8 p3, p3, 0x1

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    iput p3, p0, Lbsh/org/objectweb/asm/MethodWriter;->numberOfExceptions:I

    .line 87
    .line 88
    const/4 p1, 0x0

    .line 89
    iput-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->exceptionIndexTable:[I

    .line 90
    .line 91
    :cond_3
    iput p7, p0, Lbsh/org/objectweb/asm/MethodWriter;->compute:I

    .line 92
    .line 93
    if-eqz p7, :cond_5

    .line 94
    .line 95
    invoke-static {p4}, Lbsh/org/objectweb/asm/Type;->getArgumentsAndReturnSizes(Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    shr-int/lit8 p1, p1, 0x2

    .line 100
    .line 101
    and-int/lit8 p2, p2, 0x8

    .line 102
    .line 103
    if-eqz p2, :cond_4

    .line 104
    .line 105
    add-int/lit8 p1, p1, -0x1

    .line 106
    .line 107
    :cond_4
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxLocals:I

    .line 108
    .line 109
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentLocals:I

    .line 110
    .line 111
    new-instance p1, Lbsh/org/objectweb/asm/Label;

    .line 112
    .line 113
    invoke-direct {p1}, Lbsh/org/objectweb/asm/Label;-><init>()V

    .line 114
    .line 115
    .line 116
    iput-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 117
    .line 118
    invoke-virtual {p0, p1}, Lbsh/org/objectweb/asm/MethodWriter;->visitLabel(Lbsh/org/objectweb/asm/Label;)V

    .line 119
    .line 120
    .line 121
    :cond_5
    return-void
.end method

.method private addSuccessorToCurrentBasicBlock(ILbsh/org/objectweb/asm/Label;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 2
    .line 3
    new-instance v1, Lbsh/org/objectweb/asm/Edge;

    .line 4
    .line 5
    iget-object v2, v0, Lbsh/org/objectweb/asm/Label;->outgoingEdges:Lbsh/org/objectweb/asm/Edge;

    .line 6
    .line 7
    invoke-direct {v1, p1, p2, v2}, Lbsh/org/objectweb/asm/Edge;-><init>(ILbsh/org/objectweb/asm/Label;Lbsh/org/objectweb/asm/Edge;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, v0, Lbsh/org/objectweb/asm/Label;->outgoingEdges:Lbsh/org/objectweb/asm/Edge;

    .line 11
    .line 12
    return-void
.end method

.method private computeAllFrames()V
    .locals 11

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstHandler:Lbsh/org/objectweb/asm/Handler;

    .line 2
    .line 3
    :goto_0
    const-string v1, "java/lang/Throwable"

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v2, v0, Lbsh/org/objectweb/asm/Handler;->catchTypeDescriptor:Ljava/lang/String;

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
    iget-object v2, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 14
    .line 15
    invoke-static {v2, v1}, Lbsh/org/objectweb/asm/Frame;->getAbstractTypeFromInternalName(Lbsh/org/objectweb/asm/SymbolTable;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, v0, Lbsh/org/objectweb/asm/Handler;->handlerPc:Lbsh/org/objectweb/asm/Label;

    .line 20
    .line 21
    invoke-virtual {v2}, Lbsh/org/objectweb/asm/Label;->getCanonicalInstance()Lbsh/org/objectweb/asm/Label;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-short v3, v2, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 26
    .line 27
    or-int/lit8 v3, v3, 0x2

    .line 28
    .line 29
    int-to-short v3, v3

    .line 30
    iput-short v3, v2, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 31
    .line 32
    iget-object v3, v0, Lbsh/org/objectweb/asm/Handler;->startPc:Lbsh/org/objectweb/asm/Label;

    .line 33
    .line 34
    invoke-virtual {v3}, Lbsh/org/objectweb/asm/Label;->getCanonicalInstance()Lbsh/org/objectweb/asm/Label;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    iget-object v4, v0, Lbsh/org/objectweb/asm/Handler;->endPc:Lbsh/org/objectweb/asm/Label;

    .line 39
    .line 40
    invoke-virtual {v4}, Lbsh/org/objectweb/asm/Label;->getCanonicalInstance()Lbsh/org/objectweb/asm/Label;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    :goto_2
    if-eq v3, v4, :cond_1

    .line 45
    .line 46
    new-instance v5, Lbsh/org/objectweb/asm/Edge;

    .line 47
    .line 48
    iget-object v6, v3, Lbsh/org/objectweb/asm/Label;->outgoingEdges:Lbsh/org/objectweb/asm/Edge;

    .line 49
    .line 50
    invoke-direct {v5, v1, v2, v6}, Lbsh/org/objectweb/asm/Edge;-><init>(ILbsh/org/objectweb/asm/Label;Lbsh/org/objectweb/asm/Edge;)V

    .line 51
    .line 52
    .line 53
    iput-object v5, v3, Lbsh/org/objectweb/asm/Label;->outgoingEdges:Lbsh/org/objectweb/asm/Edge;

    .line 54
    .line 55
    iget-object v3, v3, Lbsh/org/objectweb/asm/Label;->nextBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_1
    iget-object v0, v0, Lbsh/org/objectweb/asm/Handler;->nextHandler:Lbsh/org/objectweb/asm/Handler;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 62
    .line 63
    iget-object v0, v0, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 64
    .line 65
    iget-object v2, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 66
    .line 67
    iget v3, p0, Lbsh/org/objectweb/asm/MethodWriter;->accessFlags:I

    .line 68
    .line 69
    iget-object v4, p0, Lbsh/org/objectweb/asm/MethodWriter;->descriptor:Ljava/lang/String;

    .line 70
    .line 71
    iget v5, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxLocals:I

    .line 72
    .line 73
    invoke-virtual {v0, v2, v3, v4, v5}, Lbsh/org/objectweb/asm/Frame;->setInputFrameFromDescriptor(Lbsh/org/objectweb/asm/SymbolTable;ILjava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, p0}, Lbsh/org/objectweb/asm/Frame;->accept(Lbsh/org/objectweb/asm/MethodWriter;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 80
    .line 81
    sget-object v2, Lbsh/org/objectweb/asm/Label;->EMPTY_LIST:Lbsh/org/objectweb/asm/Label;

    .line 82
    .line 83
    iput-object v2, v0, Lbsh/org/objectweb/asm/Label;->nextListElement:Lbsh/org/objectweb/asm/Label;

    .line 84
    .line 85
    const/4 v2, 0x0

    .line 86
    move v3, v2

    .line 87
    :goto_3
    sget-object v4, Lbsh/org/objectweb/asm/Label;->EMPTY_LIST:Lbsh/org/objectweb/asm/Label;

    .line 88
    .line 89
    if-eq v0, v4, :cond_6

    .line 90
    .line 91
    iget-object v4, v0, Lbsh/org/objectweb/asm/Label;->nextListElement:Lbsh/org/objectweb/asm/Label;

    .line 92
    .line 93
    const/4 v5, 0x0

    .line 94
    iput-object v5, v0, Lbsh/org/objectweb/asm/Label;->nextListElement:Lbsh/org/objectweb/asm/Label;

    .line 95
    .line 96
    iget-short v5, v0, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 97
    .line 98
    or-int/lit8 v5, v5, 0x8

    .line 99
    .line 100
    int-to-short v5, v5

    .line 101
    iput-short v5, v0, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 102
    .line 103
    iget-object v5, v0, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 104
    .line 105
    invoke-virtual {v5}, Lbsh/org/objectweb/asm/Frame;->getInputStackSize()I

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    iget-short v6, v0, Lbsh/org/objectweb/asm/Label;->outputStackMax:S

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
    iget-object v5, v0, Lbsh/org/objectweb/asm/Label;->outgoingEdges:Lbsh/org/objectweb/asm/Edge;

    .line 116
    .line 117
    :goto_4
    if-eqz v5, :cond_5

    .line 118
    .line 119
    iget-object v6, v5, Lbsh/org/objectweb/asm/Edge;->successor:Lbsh/org/objectweb/asm/Label;

    .line 120
    .line 121
    invoke-virtual {v6}, Lbsh/org/objectweb/asm/Label;->getCanonicalInstance()Lbsh/org/objectweb/asm/Label;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    iget-object v7, v0, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 126
    .line 127
    iget-object v8, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 128
    .line 129
    iget-object v9, v6, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 130
    .line 131
    iget v10, v5, Lbsh/org/objectweb/asm/Edge;->info:I

    .line 132
    .line 133
    invoke-virtual {v7, v8, v9, v10}, Lbsh/org/objectweb/asm/Frame;->merge(Lbsh/org/objectweb/asm/SymbolTable;Lbsh/org/objectweb/asm/Frame;I)Z

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-eqz v7, :cond_4

    .line 138
    .line 139
    iget-object v7, v6, Lbsh/org/objectweb/asm/Label;->nextListElement:Lbsh/org/objectweb/asm/Label;

    .line 140
    .line 141
    if-nez v7, :cond_4

    .line 142
    .line 143
    iput-object v4, v6, Lbsh/org/objectweb/asm/Label;->nextListElement:Lbsh/org/objectweb/asm/Label;

    .line 144
    .line 145
    move-object v4, v6

    .line 146
    :cond_4
    iget-object v5, v5, Lbsh/org/objectweb/asm/Edge;->nextEdge:Lbsh/org/objectweb/asm/Edge;

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
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 152
    .line 153
    :goto_5
    if-eqz v0, :cond_b

    .line 154
    .line 155
    iget-short v4, v0, Lbsh/org/objectweb/asm/Label;->flags:S

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
    iget-object v4, v0, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 163
    .line 164
    invoke-virtual {v4, p0}, Lbsh/org/objectweb/asm/Frame;->accept(Lbsh/org/objectweb/asm/MethodWriter;)V

    .line 165
    .line 166
    .line 167
    :cond_7
    iget-short v4, v0, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 168
    .line 169
    and-int/lit8 v4, v4, 0x8

    .line 170
    .line 171
    if-nez v4, :cond_a

    .line 172
    .line 173
    iget-object v4, v0, Lbsh/org/objectweb/asm/Label;->nextBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 174
    .line 175
    iget v5, v0, Lbsh/org/objectweb/asm/Label;->bytecodeOffset:I

    .line 176
    .line 177
    if-nez v4, :cond_8

    .line 178
    .line 179
    iget-object v6, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 180
    .line 181
    iget v6, v6, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_8
    iget v6, v4, Lbsh/org/objectweb/asm/Label;->bytecodeOffset:I

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
    iget-object v9, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 192
    .line 193
    if-ge v8, v6, :cond_9

    .line 194
    .line 195
    iget-object v9, v9, Lbsh/org/objectweb/asm/ByteVector;->data:[B

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
    iget-object v8, v9, Lbsh/org/objectweb/asm/ByteVector;->data:[B

    .line 203
    .line 204
    const/16 v9, -0x41

    .line 205
    .line 206
    aput-byte v9, v8, v6

    .line 207
    .line 208
    invoke-virtual {p0, v5, v2, v7}, Lbsh/org/objectweb/asm/MethodWriter;->visitFrameStart(III)I

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    iget-object v6, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentFrame:[I

    .line 213
    .line 214
    iget-object v8, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 215
    .line 216
    invoke-static {v8, v1}, Lbsh/org/objectweb/asm/Frame;->getAbstractTypeFromInternalName(Lbsh/org/objectweb/asm/SymbolTable;Ljava/lang/String;)I

    .line 217
    .line 218
    .line 219
    move-result v8

    .line 220
    aput v8, v6, v5

    .line 221
    .line 222
    invoke-virtual {p0}, Lbsh/org/objectweb/asm/MethodWriter;->visitFrameEnd()V

    .line 223
    .line 224
    .line 225
    iget-object v5, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstHandler:Lbsh/org/objectweb/asm/Handler;

    .line 226
    .line 227
    invoke-static {v5, v0, v4}, Lbsh/org/objectweb/asm/Handler;->removeRange(Lbsh/org/objectweb/asm/Handler;Lbsh/org/objectweb/asm/Label;Lbsh/org/objectweb/asm/Label;)Lbsh/org/objectweb/asm/Handler;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    iput-object v4, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstHandler:Lbsh/org/objectweb/asm/Handler;

    .line 232
    .line 233
    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    :cond_a
    iget-object v0, v0, Lbsh/org/objectweb/asm/Label;->nextBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_b
    iput v3, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxStack:I

    .line 241
    .line 242
    return-void
.end method

.method private computeMaxStackAndLocal()V
    .locals 8

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstHandler:Lbsh/org/objectweb/asm/Handler;

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
    iget-object v2, v0, Lbsh/org/objectweb/asm/Handler;->handlerPc:Lbsh/org/objectweb/asm/Label;

    .line 9
    .line 10
    iget-object v3, v0, Lbsh/org/objectweb/asm/Handler;->startPc:Lbsh/org/objectweb/asm/Label;

    .line 11
    .line 12
    iget-object v4, v0, Lbsh/org/objectweb/asm/Handler;->endPc:Lbsh/org/objectweb/asm/Label;

    .line 13
    .line 14
    :goto_1
    if-eq v3, v4, :cond_1

    .line 15
    .line 16
    iget-short v5, v3, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 17
    .line 18
    and-int/lit8 v5, v5, 0x10

    .line 19
    .line 20
    iget-object v6, v3, Lbsh/org/objectweb/asm/Label;->outgoingEdges:Lbsh/org/objectweb/asm/Edge;

    .line 21
    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    new-instance v5, Lbsh/org/objectweb/asm/Edge;

    .line 25
    .line 26
    invoke-direct {v5, v1, v2, v6}, Lbsh/org/objectweb/asm/Edge;-><init>(ILbsh/org/objectweb/asm/Label;Lbsh/org/objectweb/asm/Edge;)V

    .line 27
    .line 28
    .line 29
    iput-object v5, v3, Lbsh/org/objectweb/asm/Label;->outgoingEdges:Lbsh/org/objectweb/asm/Edge;

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_0
    iget-object v5, v6, Lbsh/org/objectweb/asm/Edge;->nextEdge:Lbsh/org/objectweb/asm/Edge;

    .line 33
    .line 34
    new-instance v6, Lbsh/org/objectweb/asm/Edge;

    .line 35
    .line 36
    iget-object v7, v5, Lbsh/org/objectweb/asm/Edge;->nextEdge:Lbsh/org/objectweb/asm/Edge;

    .line 37
    .line 38
    invoke-direct {v6, v1, v2, v7}, Lbsh/org/objectweb/asm/Edge;-><init>(ILbsh/org/objectweb/asm/Label;Lbsh/org/objectweb/asm/Edge;)V

    .line 39
    .line 40
    .line 41
    iput-object v6, v5, Lbsh/org/objectweb/asm/Edge;->nextEdge:Lbsh/org/objectweb/asm/Edge;

    .line 42
    .line 43
    :goto_2
    iget-object v3, v3, Lbsh/org/objectweb/asm/Label;->nextBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iget-object v0, v0, Lbsh/org/objectweb/asm/Handler;->nextHandler:Lbsh/org/objectweb/asm/Handler;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    iget-boolean v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->hasSubroutines:Z

    .line 50
    .line 51
    const/4 v2, 0x1

    .line 52
    if-eqz v0, :cond_7

    .line 53
    .line 54
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Lbsh/org/objectweb/asm/Label;->markSubroutine(S)V

    .line 57
    .line 58
    .line 59
    move v0, v2

    .line 60
    move v3, v0

    .line 61
    :goto_3
    iget-object v4, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 62
    .line 63
    if-gt v0, v3, :cond_5

    .line 64
    .line 65
    :goto_4
    if-eqz v4, :cond_4

    .line 66
    .line 67
    iget-short v5, v4, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 68
    .line 69
    and-int/lit8 v5, v5, 0x10

    .line 70
    .line 71
    if-eqz v5, :cond_3

    .line 72
    .line 73
    iget-short v5, v4, Lbsh/org/objectweb/asm/Label;->subroutineId:S

    .line 74
    .line 75
    if-ne v5, v0, :cond_3

    .line 76
    .line 77
    iget-object v5, v4, Lbsh/org/objectweb/asm/Label;->outgoingEdges:Lbsh/org/objectweb/asm/Edge;

    .line 78
    .line 79
    iget-object v5, v5, Lbsh/org/objectweb/asm/Edge;->nextEdge:Lbsh/org/objectweb/asm/Edge;

    .line 80
    .line 81
    iget-object v5, v5, Lbsh/org/objectweb/asm/Edge;->successor:Lbsh/org/objectweb/asm/Label;

    .line 82
    .line 83
    iget-short v6, v5, Lbsh/org/objectweb/asm/Label;->subroutineId:S

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
    invoke-virtual {v5, v3}, Lbsh/org/objectweb/asm/Label;->markSubroutine(S)V

    .line 91
    .line 92
    .line 93
    :cond_3
    iget-object v4, v4, Lbsh/org/objectweb/asm/Label;->nextBasicBlock:Lbsh/org/objectweb/asm/Label;

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
    iget-short v0, v4, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 103
    .line 104
    and-int/lit8 v0, v0, 0x10

    .line 105
    .line 106
    if-eqz v0, :cond_6

    .line 107
    .line 108
    iget-object v0, v4, Lbsh/org/objectweb/asm/Label;->outgoingEdges:Lbsh/org/objectweb/asm/Edge;

    .line 109
    .line 110
    iget-object v0, v0, Lbsh/org/objectweb/asm/Edge;->nextEdge:Lbsh/org/objectweb/asm/Edge;

    .line 111
    .line 112
    iget-object v0, v0, Lbsh/org/objectweb/asm/Edge;->successor:Lbsh/org/objectweb/asm/Label;

    .line 113
    .line 114
    invoke-virtual {v0, v4}, Lbsh/org/objectweb/asm/Label;->addSubroutineRetSuccessors(Lbsh/org/objectweb/asm/Label;)V

    .line 115
    .line 116
    .line 117
    :cond_6
    iget-object v4, v4, Lbsh/org/objectweb/asm/Label;->nextBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_7
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 121
    .line 122
    sget-object v3, Lbsh/org/objectweb/asm/Label;->EMPTY_LIST:Lbsh/org/objectweb/asm/Label;

    .line 123
    .line 124
    iput-object v3, v0, Lbsh/org/objectweb/asm/Label;->nextListElement:Lbsh/org/objectweb/asm/Label;

    .line 125
    .line 126
    iget v3, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxStack:I

    .line 127
    .line 128
    :cond_8
    sget-object v4, Lbsh/org/objectweb/asm/Label;->EMPTY_LIST:Lbsh/org/objectweb/asm/Label;

    .line 129
    .line 130
    if-eq v0, v4, :cond_d

    .line 131
    .line 132
    iget-object v4, v0, Lbsh/org/objectweb/asm/Label;->nextListElement:Lbsh/org/objectweb/asm/Label;

    .line 133
    .line 134
    iget-short v5, v0, Lbsh/org/objectweb/asm/Label;->inputStackSize:S

    .line 135
    .line 136
    iget-short v6, v0, Lbsh/org/objectweb/asm/Label;->outputStackMax:S

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
    iget-object v6, v0, Lbsh/org/objectweb/asm/Label;->outgoingEdges:Lbsh/org/objectweb/asm/Edge;

    .line 143
    .line 144
    iget-short v0, v0, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 145
    .line 146
    and-int/lit8 v0, v0, 0x10

    .line 147
    .line 148
    if-eqz v0, :cond_a

    .line 149
    .line 150
    iget-object v6, v6, Lbsh/org/objectweb/asm/Edge;->nextEdge:Lbsh/org/objectweb/asm/Edge;

    .line 151
    .line 152
    :cond_a
    move-object v0, v4

    .line 153
    :goto_6
    if-eqz v6, :cond_8

    .line 154
    .line 155
    iget-object v4, v6, Lbsh/org/objectweb/asm/Edge;->successor:Lbsh/org/objectweb/asm/Label;

    .line 156
    .line 157
    iget-object v7, v4, Lbsh/org/objectweb/asm/Label;->nextListElement:Lbsh/org/objectweb/asm/Label;

    .line 158
    .line 159
    if-nez v7, :cond_c

    .line 160
    .line 161
    iget v7, v6, Lbsh/org/objectweb/asm/Edge;->info:I

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
    iput-short v7, v4, Lbsh/org/objectweb/asm/Label;->inputStackSize:S

    .line 170
    .line 171
    iput-object v0, v4, Lbsh/org/objectweb/asm/Label;->nextListElement:Lbsh/org/objectweb/asm/Label;

    .line 172
    .line 173
    move-object v0, v4

    .line 174
    :cond_c
    iget-object v6, v6, Lbsh/org/objectweb/asm/Edge;->nextEdge:Lbsh/org/objectweb/asm/Edge;

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_d
    iput v3, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxStack:I

    .line 178
    .line 179
    return-void
.end method

.method private endCurrentBasicBlockWithNoSuccessor()V
    .locals 4

    .line 1
    iget v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->compute:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x0

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lbsh/org/objectweb/asm/Label;

    .line 8
    .line 9
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Label;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lbsh/org/objectweb/asm/Frame;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lbsh/org/objectweb/asm/Frame;-><init>(Lbsh/org/objectweb/asm/Label;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, v0, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 18
    .line 19
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 20
    .line 21
    iget-object v3, v1, Lbsh/org/objectweb/asm/ByteVector;->data:[B

    .line 22
    .line 23
    iget v1, v1, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 24
    .line 25
    invoke-virtual {v0, v3, v1}, Lbsh/org/objectweb/asm/Label;->resolve([BI)Z

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 29
    .line 30
    iput-object v0, v1, Lbsh/org/objectweb/asm/Label;->nextBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 31
    .line 32
    iput-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 33
    .line 34
    iput-object v2, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    const/4 v1, 0x1

    .line 38
    if-ne v0, v1, :cond_1

    .line 39
    .line 40
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 41
    .line 42
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 43
    .line 44
    int-to-short v1, v1

    .line 45
    iput-short v1, v0, Lbsh/org/objectweb/asm/Label;->outputStackMax:S

    .line 46
    .line 47
    iput-object v2, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 48
    .line 49
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
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 4
    .line 5
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentFrame:[I

    .line 6
    .line 7
    aget v1, v1, p1

    .line 8
    .line 9
    iget-object v2, p0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 10
    .line 11
    invoke-static {v0, v1, v2}, Lbsh/org/objectweb/asm/Frame;->putAbstractType(Lbsh/org/objectweb/asm/SymbolTable;ILbsh/org/objectweb/asm/ByteVector;)V

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
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->currentFrame:[I

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
    iget-object v4, v0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 12
    .line 13
    invoke-virtual {v4}, Lbsh/org/objectweb/asm/SymbolTable;->getMajorVersion()I

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
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 24
    .line 25
    iget-object v4, v0, Lbsh/org/objectweb/asm/MethodWriter;->currentFrame:[I

    .line 26
    .line 27
    aget v4, v4, v6

    .line 28
    .line 29
    invoke-virtual {v2, v4}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2, v3}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 34
    .line 35
    .line 36
    add-int/2addr v3, v7

    .line 37
    invoke-direct {v0, v7, v3}, Lbsh/org/objectweb/asm/MethodWriter;->putAbstractTypes(II)V

    .line 38
    .line 39
    .line 40
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 41
    .line 42
    invoke-virtual {v2, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 43
    .line 44
    .line 45
    add-int/2addr v1, v3

    .line 46
    invoke-direct {v0, v3, v1}, Lbsh/org/objectweb/asm/MethodWriter;->putAbstractTypes(II)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    iget v4, v0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableNumberOfEntries:I

    .line 51
    .line 52
    iget-object v5, v0, Lbsh/org/objectweb/asm/MethodWriter;->currentFrame:[I

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
    iget-object v5, v0, Lbsh/org/objectweb/asm/MethodWriter;->previousFrame:[I

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
    iget-object v5, v0, Lbsh/org/objectweb/asm/MethodWriter;->previousFrame:[I

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
    iget-object v7, v0, Lbsh/org/objectweb/asm/MethodWriter;->currentFrame:[I

    .line 124
    .line 125
    aget v7, v7, v15

    .line 126
    .line 127
    iget-object v13, v0, Lbsh/org/objectweb/asm/MethodWriter;->previousFrame:[I

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
    iget-object v6, v0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 158
    .line 159
    if-eq v2, v10, :cond_8

    .line 160
    .line 161
    const/16 v2, 0xff

    .line 162
    .line 163
    invoke-virtual {v6, v2}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {v2, v4}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {v2, v3}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 172
    .line 173
    .line 174
    add-int/lit8 v3, v3, 0x3

    .line 175
    .line 176
    move/from16 v2, v16

    .line 177
    .line 178
    invoke-direct {v0, v2, v3}, Lbsh/org/objectweb/asm/MethodWriter;->putAbstractTypes(II)V

    .line 179
    .line 180
    .line 181
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 182
    .line 183
    invoke-virtual {v2, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 184
    .line 185
    .line 186
    add-int/2addr v1, v3

    .line 187
    invoke-direct {v0, v3, v1}, Lbsh/org/objectweb/asm/MethodWriter;->putAbstractTypes(II)V

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
    invoke-virtual {v6, v8}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {v1, v4}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 199
    .line 200
    .line 201
    add-int/2addr v5, v2

    .line 202
    add-int/2addr v3, v2

    .line 203
    invoke-direct {v0, v5, v3}, Lbsh/org/objectweb/asm/MethodWriter;->putAbstractTypes(II)V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :cond_9
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 208
    .line 209
    invoke-virtual {v1, v14}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-virtual {v1, v4}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :cond_a
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 218
    .line 219
    add-int/2addr v8, v14

    .line 220
    invoke-virtual {v1, v8}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-virtual {v1, v4}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :cond_b
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 229
    .line 230
    invoke-virtual {v1, v11}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-virtual {v1, v4}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 235
    .line 236
    .line 237
    add-int/lit8 v1, v3, 0x3

    .line 238
    .line 239
    add-int/lit8 v3, v3, 0x4

    .line 240
    .line 241
    invoke-direct {v0, v1, v3}, Lbsh/org/objectweb/asm/MethodWriter;->putAbstractTypes(II)V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :cond_c
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 246
    .line 247
    add-int/2addr v4, v12

    .line 248
    invoke-virtual {v1, v4}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 249
    .line 250
    .line 251
    add-int/lit8 v1, v3, 0x3

    .line 252
    .line 253
    add-int/lit8 v3, v3, 0x4

    .line 254
    .line 255
    invoke-direct {v0, v1, v3}, Lbsh/org/objectweb/asm/MethodWriter;->putAbstractTypes(II)V

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :cond_d
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 260
    .line 261
    invoke-virtual {v1, v4}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 262
    .line 263
    .line 264
    return-void

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
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

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
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x7

    .line 24
    invoke-virtual {v1, v0}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 29
    .line 30
    check-cast p1, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v1, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget p1, p1, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    const/16 v0, 0x8

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast p1, Lbsh/org/objectweb/asm/Label;

    .line 49
    .line 50
    iget p1, p1, Lbsh/org/objectweb/asm/Label;->bytecodeOffset:I

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method private visitSwitchInsn(Lbsh/org/objectweb/asm/Label;[Lbsh/org/objectweb/asm/Label;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->compute:I

    .line 6
    .line 7
    const/4 v2, 0x4

    .line 8
    const/4 v3, 0x0

    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 12
    .line 13
    const/16 v1, 0xab

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v0, v1, v3, v2, v2}, Lbsh/org/objectweb/asm/Frame;->execute(IILbsh/org/objectweb/asm/Symbol;Lbsh/org/objectweb/asm/SymbolTable;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v3, p1}, Lbsh/org/objectweb/asm/MethodWriter;->addSuccessorToCurrentBasicBlock(ILbsh/org/objectweb/asm/Label;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/Label;->getCanonicalInstance()Lbsh/org/objectweb/asm/Label;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-short v0, p1, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 27
    .line 28
    or-int/lit8 v0, v0, 0x2

    .line 29
    .line 30
    int-to-short v0, v0

    .line 31
    iput-short v0, p1, Lbsh/org/objectweb/asm/Label;->flags:S

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
    invoke-direct {p0, v3, v1}, Lbsh/org/objectweb/asm/MethodWriter;->addSuccessorToCurrentBasicBlock(ILbsh/org/objectweb/asm/Label;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Lbsh/org/objectweb/asm/Label;->getCanonicalInstance()Lbsh/org/objectweb/asm/Label;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-short v2, v1, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 47
    .line 48
    or-int/lit8 v2, v2, 0x2

    .line 49
    .line 50
    int-to-short v2, v2

    .line 51
    iput-short v2, v1, Lbsh/org/objectweb/asm/Label;->flags:S

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
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 60
    .line 61
    sub-int/2addr v1, v0

    .line 62
    iput v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 63
    .line 64
    invoke-direct {p0, v1, p1}, Lbsh/org/objectweb/asm/MethodWriter;->addSuccessorToCurrentBasicBlock(ILbsh/org/objectweb/asm/Label;)V

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
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 73
    .line 74
    invoke-direct {p0, v1, v0}, Lbsh/org/objectweb/asm/MethodWriter;->addSuccessorToCurrentBasicBlock(ILbsh/org/objectweb/asm/Label;)V

    .line 75
    .line 76
    .line 77
    add-int/lit8 v3, v3, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    invoke-direct {p0}, Lbsh/org/objectweb/asm/MethodWriter;->endCurrentBasicBlockWithNoSuccessor()V

    .line 81
    .line 82
    .line 83
    :cond_2
    return-void
.end method


# virtual methods
.method public canCopyMethodAttributes(IIZZII)Z
    .locals 2

    .line 1
    iget-object p4, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {p4}, Lbsh/org/objectweb/asm/SymbolTable;->getMajorVersion()I

    .line 4
    .line 5
    .line 6
    move-result p4

    .line 7
    const/16 p5, 0x31

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    if-ge p4, p5, :cond_0

    .line 12
    .line 13
    iget p4, p0, Lbsh/org/objectweb/asm/MethodWriter;->accessFlags:I

    .line 14
    .line 15
    and-int/lit16 p4, p4, 0x1000

    .line 16
    .line 17
    if-eqz p4, :cond_0

    .line 18
    .line 19
    move p4, v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move p4, v1

    .line 22
    :goto_0
    if-eq p3, p4, :cond_1

    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    if-nez p6, :cond_2

    .line 26
    .line 27
    iget p3, p0, Lbsh/org/objectweb/asm/MethodWriter;->numberOfExceptions:I

    .line 28
    .line 29
    if-eqz p3, :cond_2

    .line 30
    .line 31
    return v1

    .line 32
    :cond_2
    add-int/lit8 p1, p1, 0x6

    .line 33
    .line 34
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->sourceOffset:I

    .line 35
    .line 36
    add-int/lit8 p2, p2, -0x6

    .line 37
    .line 38
    iput p2, p0, Lbsh/org/objectweb/asm/MethodWriter;->sourceLength:I

    .line 39
    .line 40
    return v0
.end method

.method public final collectAttributePrototypes(Lbsh/org/objectweb/asm/Attribute$Set;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lbsh/org/objectweb/asm/Attribute$Set;->addAttributes(Lbsh/org/objectweb/asm/Attribute;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstCodeAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lbsh/org/objectweb/asm/Attribute$Set;->addAttributes(Lbsh/org/objectweb/asm/Attribute;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public computeMethodInfoSize()I
    .locals 10

    .line 1
    iget v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->sourceOffset:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->sourceLength:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x6

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 11
    .line 12
    iget v0, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x1

    .line 16
    const/16 v3, 0x8

    .line 17
    .line 18
    if-lez v0, :cond_8

    .line 19
    .line 20
    const v4, 0xffff

    .line 21
    .line 22
    .line 23
    if-gt v0, v4, :cond_7

    .line 24
    .line 25
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 26
    .line 27
    const-string v4, "Code"

    .line 28
    .line 29
    invoke-virtual {v0, v4}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 33
    .line 34
    iget v0, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x10

    .line 37
    .line 38
    iget-object v4, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstHandler:Lbsh/org/objectweb/asm/Handler;

    .line 39
    .line 40
    invoke-static {v4}, Lbsh/org/objectweb/asm/Handler;->getExceptionTableSize(Lbsh/org/objectweb/asm/Handler;)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    add-int/2addr v0, v4

    .line 45
    add-int/2addr v0, v3

    .line 46
    iget-object v4, p0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 47
    .line 48
    if-eqz v4, :cond_3

    .line 49
    .line 50
    iget-object v4, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 51
    .line 52
    invoke-virtual {v4}, Lbsh/org/objectweb/asm/SymbolTable;->getMajorVersion()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    const/16 v5, 0x32

    .line 57
    .line 58
    if-lt v4, v5, :cond_1

    .line 59
    .line 60
    move v4, v2

    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move v4, v1

    .line 63
    :goto_0
    iget-object v5, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 64
    .line 65
    if-eqz v4, :cond_2

    .line 66
    .line 67
    const-string v4, "StackMapTable"

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    const-string v4, "StackMap"

    .line 71
    .line 72
    :goto_1
    invoke-virtual {v5, v4}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    iget-object v4, p0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 76
    .line 77
    iget v4, v4, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 78
    .line 79
    add-int/2addr v4, v3

    .line 80
    add-int/2addr v0, v4

    .line 81
    :cond_3
    iget-object v4, p0, Lbsh/org/objectweb/asm/MethodWriter;->lineNumberTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 82
    .line 83
    if-eqz v4, :cond_4

    .line 84
    .line 85
    iget-object v4, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 86
    .line 87
    const-string v5, "LineNumberTable"

    .line 88
    .line 89
    invoke-virtual {v4, v5}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    iget-object v4, p0, Lbsh/org/objectweb/asm/MethodWriter;->lineNumberTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 93
    .line 94
    iget v4, v4, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 95
    .line 96
    add-int/2addr v4, v3

    .line 97
    add-int/2addr v0, v4

    .line 98
    :cond_4
    iget-object v4, p0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 99
    .line 100
    if-eqz v4, :cond_5

    .line 101
    .line 102
    iget-object v4, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 103
    .line 104
    const-string v5, "LocalVariableTable"

    .line 105
    .line 106
    invoke-virtual {v4, v5}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    iget-object v4, p0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 110
    .line 111
    iget v4, v4, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 112
    .line 113
    add-int/2addr v4, v3

    .line 114
    add-int/2addr v0, v4

    .line 115
    :cond_5
    iget-object v4, p0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTypeTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 116
    .line 117
    if-eqz v4, :cond_6

    .line 118
    .line 119
    iget-object v4, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 120
    .line 121
    const-string v5, "LocalVariableTypeTable"

    .line 122
    .line 123
    invoke-virtual {v4, v5}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    iget-object v4, p0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTypeTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 127
    .line 128
    iget v4, v4, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 129
    .line 130
    add-int/2addr v4, v3

    .line 131
    add-int/2addr v0, v4

    .line 132
    :cond_6
    iget-object v4, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstCodeAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 133
    .line 134
    if-eqz v4, :cond_9

    .line 135
    .line 136
    iget-object v5, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 137
    .line 138
    iget-object v6, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 139
    .line 140
    move-object v7, v6

    .line 141
    iget-object v6, v7, Lbsh/org/objectweb/asm/ByteVector;->data:[B

    .line 142
    .line 143
    iget v7, v7, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 144
    .line 145
    iget v8, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxStack:I

    .line 146
    .line 147
    iget v9, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxLocals:I

    .line 148
    .line 149
    invoke-virtual/range {v4 .. v9}, Lbsh/org/objectweb/asm/Attribute;->computeAttributesSize(Lbsh/org/objectweb/asm/SymbolTable;[BIII)I

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    add-int/2addr v0, v4

    .line 154
    goto :goto_2

    .line 155
    :cond_7
    const-string v0, "Method code too large!"

    .line 156
    .line 157
    invoke-static {v0}, Lokio/a;->i(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    const/4 v0, 0x0

    .line 161
    return v0

    .line 162
    :cond_8
    move v0, v3

    .line 163
    :cond_9
    :goto_2
    iget v4, p0, Lbsh/org/objectweb/asm/MethodWriter;->numberOfExceptions:I

    .line 164
    .line 165
    if-lez v4, :cond_a

    .line 166
    .line 167
    iget-object v4, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 168
    .line 169
    const-string v5, "Exceptions"

    .line 170
    .line 171
    invoke-virtual {v4, v5}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 172
    .line 173
    .line 174
    const/4 v4, 0x2

    .line 175
    iget v5, p0, Lbsh/org/objectweb/asm/MethodWriter;->numberOfExceptions:I

    .line 176
    .line 177
    invoke-static {v5, v4, v3, v0}, Lp/a;->g(IIII)I

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    :cond_a
    iget-object v3, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 182
    .line 183
    invoke-virtual {v3}, Lbsh/org/objectweb/asm/SymbolTable;->getMajorVersion()I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    const/16 v4, 0x31

    .line 188
    .line 189
    if-ge v3, v4, :cond_b

    .line 190
    .line 191
    move v1, v2

    .line 192
    :cond_b
    iget v2, p0, Lbsh/org/objectweb/asm/MethodWriter;->accessFlags:I

    .line 193
    .line 194
    and-int/lit16 v2, v2, 0x1000

    .line 195
    .line 196
    if-eqz v2, :cond_c

    .line 197
    .line 198
    if-eqz v1, :cond_c

    .line 199
    .line 200
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 201
    .line 202
    const-string v2, "Synthetic"

    .line 203
    .line 204
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 205
    .line 206
    .line 207
    add-int/lit8 v0, v0, 0x6

    .line 208
    .line 209
    :cond_c
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->signatureIndex:I

    .line 210
    .line 211
    if-eqz v1, :cond_d

    .line 212
    .line 213
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 214
    .line 215
    const-string v2, "Signature"

    .line 216
    .line 217
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 218
    .line 219
    .line 220
    add-int/lit8 v0, v0, 0x8

    .line 221
    .line 222
    :cond_d
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->accessFlags:I

    .line 223
    .line 224
    const/high16 v2, 0x20000

    .line 225
    .line 226
    and-int/2addr v1, v2

    .line 227
    if-eqz v1, :cond_e

    .line 228
    .line 229
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 230
    .line 231
    const-string v2, "Deprecated"

    .line 232
    .line 233
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 234
    .line 235
    .line 236
    add-int/lit8 v0, v0, 0x6

    .line 237
    .line 238
    :cond_e
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->defaultValue:Lbsh/org/objectweb/asm/ByteVector;

    .line 239
    .line 240
    if-eqz v1, :cond_f

    .line 241
    .line 242
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 243
    .line 244
    const-string v2, "AnnotationDefault"

    .line 245
    .line 246
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 247
    .line 248
    .line 249
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->defaultValue:Lbsh/org/objectweb/asm/ByteVector;

    .line 250
    .line 251
    iget v1, v1, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 252
    .line 253
    add-int/lit8 v1, v1, 0x6

    .line 254
    .line 255
    add-int/2addr v0, v1

    .line 256
    :cond_f
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->parameters:Lbsh/org/objectweb/asm/ByteVector;

    .line 257
    .line 258
    if-eqz v1, :cond_10

    .line 259
    .line 260
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 261
    .line 262
    const-string v2, "MethodParameters"

    .line 263
    .line 264
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 265
    .line 266
    .line 267
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->parameters:Lbsh/org/objectweb/asm/ByteVector;

    .line 268
    .line 269
    iget v1, v1, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 270
    .line 271
    add-int/lit8 v1, v1, 0x7

    .line 272
    .line 273
    add-int/2addr v0, v1

    .line 274
    :cond_10
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 275
    .line 276
    if-eqz v1, :cond_11

    .line 277
    .line 278
    iget-object v2, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 279
    .line 280
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/Attribute;->computeAttributesSize(Lbsh/org/objectweb/asm/SymbolTable;)I

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    add-int/2addr v1, v0

    .line 285
    return v1

    .line 286
    :cond_11
    return v0
.end method

.method public hasAsmInstructions()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->hasAsmInstructions:Z

    .line 2
    .line 3
    return v0
.end method

.method public hasFrames()Z
    .locals 1

    .line 1
    iget v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableNumberOfEntries:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public putMethodInfo(Lbsh/org/objectweb/asm/ByteVector;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 6
    .line 7
    invoke-virtual {v1}, Lbsh/org/objectweb/asm/SymbolTable;->getMajorVersion()I

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
    move v10, v9

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v10, v8

    .line 20
    :goto_0
    const/16 v11, 0x1000

    .line 21
    .line 22
    if-eqz v10, :cond_1

    .line 23
    .line 24
    move v1, v11

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v1, v8

    .line 27
    :goto_1
    iget v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->accessFlags:I

    .line 28
    .line 29
    not-int v1, v1

    .line 30
    and-int/2addr v1, v2

    .line 31
    invoke-virtual {v7, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->nameIndex:I

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->descriptorIndex:I

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 44
    .line 45
    .line 46
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 47
    .line 48
    iget v1, v1, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 49
    .line 50
    if-lez v1, :cond_2

    .line 51
    .line 52
    move v1, v9

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    move v1, v8

    .line 55
    :goto_2
    iget v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->numberOfExceptions:I

    .line 56
    .line 57
    if-lez v2, :cond_3

    .line 58
    .line 59
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    :cond_3
    iget v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->accessFlags:I

    .line 62
    .line 63
    and-int/lit16 v3, v2, 0x1000

    .line 64
    .line 65
    if-eqz v3, :cond_4

    .line 66
    .line 67
    if-eqz v10, :cond_4

    .line 68
    .line 69
    add-int/lit8 v1, v1, 0x1

    .line 70
    .line 71
    :cond_4
    iget v3, v0, Lbsh/org/objectweb/asm/MethodWriter;->signatureIndex:I

    .line 72
    .line 73
    if-eqz v3, :cond_5

    .line 74
    .line 75
    add-int/lit8 v1, v1, 0x1

    .line 76
    .line 77
    :cond_5
    const/high16 v12, 0x20000

    .line 78
    .line 79
    and-int/2addr v2, v12

    .line 80
    if-eqz v2, :cond_6

    .line 81
    .line 82
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    :cond_6
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->defaultValue:Lbsh/org/objectweb/asm/ByteVector;

    .line 85
    .line 86
    if-eqz v2, :cond_7

    .line 87
    .line 88
    add-int/lit8 v1, v1, 0x1

    .line 89
    .line 90
    :cond_7
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->parameters:Lbsh/org/objectweb/asm/ByteVector;

    .line 91
    .line 92
    if-eqz v2, :cond_8

    .line 93
    .line 94
    add-int/lit8 v1, v1, 0x1

    .line 95
    .line 96
    :cond_8
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->firstAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 97
    .line 98
    if-eqz v2, :cond_9

    .line 99
    .line 100
    invoke-virtual {v2}, Lbsh/org/objectweb/asm/Attribute;->getAttributeCount()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    add-int/2addr v1, v2

    .line 105
    :cond_9
    invoke-virtual {v7, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 106
    .line 107
    .line 108
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 109
    .line 110
    iget v1, v1, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 111
    .line 112
    const/4 v13, 0x2

    .line 113
    if-lez v1, :cond_15

    .line 114
    .line 115
    add-int/lit8 v1, v1, 0xa

    .line 116
    .line 117
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->firstHandler:Lbsh/org/objectweb/asm/Handler;

    .line 118
    .line 119
    invoke-static {v2}, Lbsh/org/objectweb/asm/Handler;->getExceptionTableSize(Lbsh/org/objectweb/asm/Handler;)I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    add-int/2addr v1, v2

    .line 124
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 125
    .line 126
    if-eqz v2, :cond_a

    .line 127
    .line 128
    iget v2, v2, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 129
    .line 130
    add-int/lit8 v2, v2, 0x8

    .line 131
    .line 132
    add-int/2addr v1, v2

    .line 133
    move v2, v9

    .line 134
    goto :goto_3

    .line 135
    :cond_a
    move v2, v8

    .line 136
    :goto_3
    iget-object v3, v0, Lbsh/org/objectweb/asm/MethodWriter;->lineNumberTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 137
    .line 138
    if-eqz v3, :cond_b

    .line 139
    .line 140
    iget v3, v3, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 141
    .line 142
    add-int/lit8 v3, v3, 0x8

    .line 143
    .line 144
    add-int/2addr v1, v3

    .line 145
    add-int/lit8 v2, v2, 0x1

    .line 146
    .line 147
    :cond_b
    iget-object v3, v0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 148
    .line 149
    if-eqz v3, :cond_c

    .line 150
    .line 151
    iget v3, v3, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 152
    .line 153
    add-int/lit8 v3, v3, 0x8

    .line 154
    .line 155
    add-int/2addr v1, v3

    .line 156
    add-int/lit8 v2, v2, 0x1

    .line 157
    .line 158
    :cond_c
    iget-object v3, v0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTypeTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 159
    .line 160
    if-eqz v3, :cond_d

    .line 161
    .line 162
    iget v3, v3, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 163
    .line 164
    add-int/lit8 v3, v3, 0x8

    .line 165
    .line 166
    add-int/2addr v1, v3

    .line 167
    add-int/lit8 v2, v2, 0x1

    .line 168
    .line 169
    :cond_d
    iget-object v14, v0, Lbsh/org/objectweb/asm/MethodWriter;->firstCodeAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 170
    .line 171
    if-eqz v14, :cond_e

    .line 172
    .line 173
    iget-object v15, v0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 174
    .line 175
    iget-object v3, v0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 176
    .line 177
    iget-object v4, v3, Lbsh/org/objectweb/asm/ByteVector;->data:[B

    .line 178
    .line 179
    iget v3, v3, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 180
    .line 181
    iget v5, v0, Lbsh/org/objectweb/asm/MethodWriter;->maxStack:I

    .line 182
    .line 183
    iget v6, v0, Lbsh/org/objectweb/asm/MethodWriter;->maxLocals:I

    .line 184
    .line 185
    move/from16 v17, v3

    .line 186
    .line 187
    move-object/from16 v16, v4

    .line 188
    .line 189
    move/from16 v18, v5

    .line 190
    .line 191
    move/from16 v19, v6

    .line 192
    .line 193
    invoke-virtual/range {v14 .. v19}, Lbsh/org/objectweb/asm/Attribute;->computeAttributesSize(Lbsh/org/objectweb/asm/SymbolTable;[BIII)I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    add-int/2addr v1, v3

    .line 198
    iget-object v3, v0, Lbsh/org/objectweb/asm/MethodWriter;->firstCodeAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 199
    .line 200
    invoke-virtual {v3}, Lbsh/org/objectweb/asm/Attribute;->getAttributeCount()I

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    add-int/2addr v2, v3

    .line 205
    :cond_e
    iget-object v3, v0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 206
    .line 207
    const-string v4, "Code"

    .line 208
    .line 209
    invoke-virtual {v3, v4}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    invoke-virtual {v7, v3}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    invoke-virtual {v3, v1}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    iget v3, v0, Lbsh/org/objectweb/asm/MethodWriter;->maxStack:I

    .line 222
    .line 223
    invoke-virtual {v1, v3}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    iget v3, v0, Lbsh/org/objectweb/asm/MethodWriter;->maxLocals:I

    .line 228
    .line 229
    invoke-virtual {v1, v3}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    iget-object v3, v0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 234
    .line 235
    iget v3, v3, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 236
    .line 237
    invoke-virtual {v1, v3}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    iget-object v3, v0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 242
    .line 243
    iget-object v4, v3, Lbsh/org/objectweb/asm/ByteVector;->data:[B

    .line 244
    .line 245
    iget v3, v3, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 246
    .line 247
    invoke-virtual {v1, v4, v8, v3}, Lbsh/org/objectweb/asm/ByteVector;->putByteArray([BII)Lbsh/org/objectweb/asm/ByteVector;

    .line 248
    .line 249
    .line 250
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->firstHandler:Lbsh/org/objectweb/asm/Handler;

    .line 251
    .line 252
    invoke-static {v1, v7}, Lbsh/org/objectweb/asm/Handler;->putExceptionTable(Lbsh/org/objectweb/asm/Handler;Lbsh/org/objectweb/asm/ByteVector;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v7, v2}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 256
    .line 257
    .line 258
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 259
    .line 260
    if-eqz v1, :cond_11

    .line 261
    .line 262
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 263
    .line 264
    invoke-virtual {v1}, Lbsh/org/objectweb/asm/SymbolTable;->getMajorVersion()I

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    const/16 v2, 0x32

    .line 269
    .line 270
    if-lt v1, v2, :cond_f

    .line 271
    .line 272
    move v1, v9

    .line 273
    goto :goto_4

    .line 274
    :cond_f
    move v1, v8

    .line 275
    :goto_4
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 276
    .line 277
    if-eqz v1, :cond_10

    .line 278
    .line 279
    const-string v1, "StackMapTable"

    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_10
    const-string v1, "StackMap"

    .line 283
    .line 284
    :goto_5
    invoke-virtual {v2, v1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    invoke-virtual {v7, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 293
    .line 294
    iget v2, v2, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 295
    .line 296
    add-int/2addr v2, v13

    .line 297
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    iget v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableNumberOfEntries:I

    .line 302
    .line 303
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 308
    .line 309
    iget-object v3, v2, Lbsh/org/objectweb/asm/ByteVector;->data:[B

    .line 310
    .line 311
    iget v2, v2, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 312
    .line 313
    invoke-virtual {v1, v3, v8, v2}, Lbsh/org/objectweb/asm/ByteVector;->putByteArray([BII)Lbsh/org/objectweb/asm/ByteVector;

    .line 314
    .line 315
    .line 316
    :cond_11
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->lineNumberTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 317
    .line 318
    if-eqz v1, :cond_12

    .line 319
    .line 320
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 321
    .line 322
    const-string v2, "LineNumberTable"

    .line 323
    .line 324
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    invoke-virtual {v7, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->lineNumberTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 333
    .line 334
    iget v2, v2, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 335
    .line 336
    add-int/2addr v2, v13

    .line 337
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    iget v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->lineNumberTableLength:I

    .line 342
    .line 343
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->lineNumberTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 348
    .line 349
    iget-object v3, v2, Lbsh/org/objectweb/asm/ByteVector;->data:[B

    .line 350
    .line 351
    iget v2, v2, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 352
    .line 353
    invoke-virtual {v1, v3, v8, v2}, Lbsh/org/objectweb/asm/ByteVector;->putByteArray([BII)Lbsh/org/objectweb/asm/ByteVector;

    .line 354
    .line 355
    .line 356
    :cond_12
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 357
    .line 358
    if-eqz v1, :cond_13

    .line 359
    .line 360
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 361
    .line 362
    const-string v2, "LocalVariableTable"

    .line 363
    .line 364
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    invoke-virtual {v7, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 373
    .line 374
    iget v2, v2, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 375
    .line 376
    add-int/2addr v2, v13

    .line 377
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    iget v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTableLength:I

    .line 382
    .line 383
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 388
    .line 389
    iget-object v3, v2, Lbsh/org/objectweb/asm/ByteVector;->data:[B

    .line 390
    .line 391
    iget v2, v2, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 392
    .line 393
    invoke-virtual {v1, v3, v8, v2}, Lbsh/org/objectweb/asm/ByteVector;->putByteArray([BII)Lbsh/org/objectweb/asm/ByteVector;

    .line 394
    .line 395
    .line 396
    :cond_13
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTypeTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 397
    .line 398
    if-eqz v1, :cond_14

    .line 399
    .line 400
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 401
    .line 402
    const-string v2, "LocalVariableTypeTable"

    .line 403
    .line 404
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    invoke-virtual {v7, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTypeTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 413
    .line 414
    iget v2, v2, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 415
    .line 416
    add-int/2addr v2, v13

    .line 417
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    iget v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTypeTableLength:I

    .line 422
    .line 423
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTypeTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 428
    .line 429
    iget-object v3, v2, Lbsh/org/objectweb/asm/ByteVector;->data:[B

    .line 430
    .line 431
    iget v2, v2, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 432
    .line 433
    invoke-virtual {v1, v3, v8, v2}, Lbsh/org/objectweb/asm/ByteVector;->putByteArray([BII)Lbsh/org/objectweb/asm/ByteVector;

    .line 434
    .line 435
    .line 436
    :cond_14
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->firstCodeAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 437
    .line 438
    if-eqz v1, :cond_15

    .line 439
    .line 440
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 441
    .line 442
    iget-object v3, v0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 443
    .line 444
    iget-object v4, v3, Lbsh/org/objectweb/asm/ByteVector;->data:[B

    .line 445
    .line 446
    iget v3, v3, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 447
    .line 448
    iget v5, v0, Lbsh/org/objectweb/asm/MethodWriter;->maxStack:I

    .line 449
    .line 450
    iget v6, v0, Lbsh/org/objectweb/asm/MethodWriter;->maxLocals:I

    .line 451
    .line 452
    move-object/from16 v20, v4

    .line 453
    .line 454
    move v4, v3

    .line 455
    move-object/from16 v3, v20

    .line 456
    .line 457
    invoke-virtual/range {v1 .. v7}, Lbsh/org/objectweb/asm/Attribute;->putAttributes(Lbsh/org/objectweb/asm/SymbolTable;[BIIILbsh/org/objectweb/asm/ByteVector;)V

    .line 458
    .line 459
    .line 460
    :cond_15
    iget v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->numberOfExceptions:I

    .line 461
    .line 462
    if-lez v1, :cond_16

    .line 463
    .line 464
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 465
    .line 466
    const-string v2, "Exceptions"

    .line 467
    .line 468
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 469
    .line 470
    .line 471
    move-result v1

    .line 472
    invoke-virtual {v7, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    iget v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->numberOfExceptions:I

    .line 477
    .line 478
    mul-int/2addr v2, v13

    .line 479
    add-int/2addr v2, v13

    .line 480
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    iget v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->numberOfExceptions:I

    .line 485
    .line 486
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 487
    .line 488
    .line 489
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->exceptionIndexTable:[I

    .line 490
    .line 491
    array-length v2, v1

    .line 492
    move v3, v8

    .line 493
    :goto_6
    if-ge v3, v2, :cond_16

    .line 494
    .line 495
    aget v4, v1, v3

    .line 496
    .line 497
    invoke-virtual {v7, v4}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 498
    .line 499
    .line 500
    add-int/lit8 v3, v3, 0x1

    .line 501
    .line 502
    goto :goto_6

    .line 503
    :cond_16
    iget v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->accessFlags:I

    .line 504
    .line 505
    and-int/2addr v1, v11

    .line 506
    if-eqz v1, :cond_17

    .line 507
    .line 508
    if-eqz v10, :cond_17

    .line 509
    .line 510
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 511
    .line 512
    const-string v2, "Synthetic"

    .line 513
    .line 514
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 515
    .line 516
    .line 517
    move-result v1

    .line 518
    invoke-virtual {v7, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    invoke-virtual {v1, v8}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 523
    .line 524
    .line 525
    :cond_17
    iget v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->signatureIndex:I

    .line 526
    .line 527
    if-eqz v1, :cond_18

    .line 528
    .line 529
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 530
    .line 531
    const-string v2, "Signature"

    .line 532
    .line 533
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 534
    .line 535
    .line 536
    move-result v1

    .line 537
    invoke-virtual {v7, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    invoke-virtual {v1, v13}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    iget v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->signatureIndex:I

    .line 546
    .line 547
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 548
    .line 549
    .line 550
    :cond_18
    iget v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->accessFlags:I

    .line 551
    .line 552
    and-int/2addr v1, v12

    .line 553
    if-eqz v1, :cond_19

    .line 554
    .line 555
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 556
    .line 557
    const-string v2, "Deprecated"

    .line 558
    .line 559
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 560
    .line 561
    .line 562
    move-result v1

    .line 563
    invoke-virtual {v7, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    invoke-virtual {v1, v8}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 568
    .line 569
    .line 570
    :cond_19
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->defaultValue:Lbsh/org/objectweb/asm/ByteVector;

    .line 571
    .line 572
    if-eqz v1, :cond_1a

    .line 573
    .line 574
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 575
    .line 576
    const-string v2, "AnnotationDefault"

    .line 577
    .line 578
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 579
    .line 580
    .line 581
    move-result v1

    .line 582
    invoke-virtual {v7, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->defaultValue:Lbsh/org/objectweb/asm/ByteVector;

    .line 587
    .line 588
    iget v2, v2, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 589
    .line 590
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->defaultValue:Lbsh/org/objectweb/asm/ByteVector;

    .line 595
    .line 596
    iget-object v3, v2, Lbsh/org/objectweb/asm/ByteVector;->data:[B

    .line 597
    .line 598
    iget v2, v2, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 599
    .line 600
    invoke-virtual {v1, v3, v8, v2}, Lbsh/org/objectweb/asm/ByteVector;->putByteArray([BII)Lbsh/org/objectweb/asm/ByteVector;

    .line 601
    .line 602
    .line 603
    :cond_1a
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->parameters:Lbsh/org/objectweb/asm/ByteVector;

    .line 604
    .line 605
    if-eqz v1, :cond_1b

    .line 606
    .line 607
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 608
    .line 609
    const-string v2, "MethodParameters"

    .line 610
    .line 611
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 612
    .line 613
    .line 614
    move-result v1

    .line 615
    invoke-virtual {v7, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->parameters:Lbsh/org/objectweb/asm/ByteVector;

    .line 620
    .line 621
    iget v2, v2, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 622
    .line 623
    add-int/2addr v2, v9

    .line 624
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    iget v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->parametersCount:I

    .line 629
    .line 630
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->parameters:Lbsh/org/objectweb/asm/ByteVector;

    .line 635
    .line 636
    iget-object v3, v2, Lbsh/org/objectweb/asm/ByteVector;->data:[B

    .line 637
    .line 638
    iget v2, v2, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 639
    .line 640
    invoke-virtual {v1, v3, v8, v2}, Lbsh/org/objectweb/asm/ByteVector;->putByteArray([BII)Lbsh/org/objectweb/asm/ByteVector;

    .line 641
    .line 642
    .line 643
    :cond_1b
    iget-object v1, v0, Lbsh/org/objectweb/asm/MethodWriter;->firstAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 644
    .line 645
    if-eqz v1, :cond_1c

    .line 646
    .line 647
    iget-object v2, v0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 648
    .line 649
    invoke-virtual {v1, v2, v7}, Lbsh/org/objectweb/asm/Attribute;->putAttributes(Lbsh/org/objectweb/asm/SymbolTable;Lbsh/org/objectweb/asm/ByteVector;)V

    .line 650
    .line 651
    .line 652
    :cond_1c
    return-void
.end method

.method public visitAbstractType(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentFrame:[I

    .line 2
    .line 3
    aput p2, v0, p1

    .line 4
    .line 5
    return-void
.end method

.method public visitAttribute(Lbsh/org/objectweb/asm/Attribute;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/Attribute;->isCodeAttribute()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstCodeAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 8
    .line 9
    iput-object v0, p1, Lbsh/org/objectweb/asm/Attribute;->nextAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 10
    .line 11
    iput-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstCodeAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 15
    .line 16
    iput-object v0, p1, Lbsh/org/objectweb/asm/Attribute;->nextAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 17
    .line 18
    iput-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstAttribute:Lbsh/org/objectweb/asm/Attribute;

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
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 8
    .line 9
    invoke-virtual {v0, p2, p3, p4}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantFieldref(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget-object p3, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 14
    .line 15
    iget v0, p2, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 16
    .line 17
    invoke-virtual {p3, p1, v0}, Lbsh/org/objectweb/asm/ByteVector;->put12(II)Lbsh/org/objectweb/asm/ByteVector;

    .line 18
    .line 19
    .line 20
    iget-object p3, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 21
    .line 22
    if-eqz p3, :cond_a

    .line 23
    .line 24
    iget v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->compute:I

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
    iget p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

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
    iget p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

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
    iget p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

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
    iget p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

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
    iget p2, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 83
    .line 84
    if-le p1, p2, :cond_8

    .line 85
    .line 86
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 87
    .line 88
    :cond_8
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 89
    .line 90
    return-void

    .line 91
    :cond_9
    :goto_2
    iget-object p3, p3, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 92
    .line 93
    iget-object p4, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 94
    .line 95
    invoke-virtual {p3, p1, v2, p2, p4}, Lbsh/org/objectweb/asm/Frame;->execute(IILbsh/org/objectweb/asm/Symbol;Lbsh/org/objectweb/asm/SymbolTable;)V

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
    iget v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->compute:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto/16 :goto_3

    .line 7
    .line 8
    :cond_0
    const/4 v2, -0x1

    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x3

    .line 11
    if-ne v0, v4, :cond_3

    .line 12
    .line 13
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 14
    .line 15
    iget-object v4, v0, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 16
    .line 17
    if-nez v4, :cond_1

    .line 18
    .line 19
    new-instance p1, Lbsh/org/objectweb/asm/CurrentFrame;

    .line 20
    .line 21
    invoke-direct {p1, v0}, Lbsh/org/objectweb/asm/CurrentFrame;-><init>(Lbsh/org/objectweb/asm/Label;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, v0, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 25
    .line 26
    iget-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 27
    .line 28
    iget-object p1, p1, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 29
    .line 30
    iget-object p3, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 31
    .line 32
    iget p5, p0, Lbsh/org/objectweb/asm/MethodWriter;->accessFlags:I

    .line 33
    .line 34
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->descriptor:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p1, p3, p5, v0, p2}, Lbsh/org/objectweb/asm/Frame;->setInputFrameFromDescriptor(Lbsh/org/objectweb/asm/SymbolTable;ILjava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 40
    .line 41
    iget-object p1, p1, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 42
    .line 43
    invoke-virtual {p1, p0}, Lbsh/org/objectweb/asm/Frame;->accept(Lbsh/org/objectweb/asm/MethodWriter;)V

    .line 44
    .line 45
    .line 46
    move v8, p4

    .line 47
    goto/16 :goto_a

    .line 48
    .line 49
    :cond_1
    if-ne p1, v2, :cond_2

    .line 50
    .line 51
    iget-object v5, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 52
    .line 53
    move v6, p2

    .line 54
    move-object v7, p3

    .line 55
    move v8, p4

    .line 56
    move-object v9, p5

    .line 57
    invoke-virtual/range {v4 .. v9}, Lbsh/org/objectweb/asm/Frame;->setInputFrameFromApiFormat(Lbsh/org/objectweb/asm/SymbolTable;I[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move v8, p4

    .line 62
    :goto_0
    iget-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 63
    .line 64
    iget-object p1, p1, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 65
    .line 66
    invoke-virtual {p1, p0}, Lbsh/org/objectweb/asm/Frame;->accept(Lbsh/org/objectweb/asm/MethodWriter;)V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_a

    .line 70
    .line 71
    :cond_3
    move v6, p2

    .line 72
    move-object v7, p3

    .line 73
    move v8, p4

    .line 74
    move-object v9, p5

    .line 75
    const/4 p2, 0x0

    .line 76
    if-ne p1, v2, :cond_7

    .line 77
    .line 78
    iget-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->previousFrame:[I

    .line 79
    .line 80
    if-nez p1, :cond_4

    .line 81
    .line 82
    iget-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->descriptor:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {p1}, Lbsh/org/objectweb/asm/Type;->getArgumentsAndReturnSizes(Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    shr-int/2addr p1, v3

    .line 89
    new-instance p3, Lbsh/org/objectweb/asm/Frame;

    .line 90
    .line 91
    new-instance p4, Lbsh/org/objectweb/asm/Label;

    .line 92
    .line 93
    invoke-direct {p4}, Lbsh/org/objectweb/asm/Label;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-direct {p3, p4}, Lbsh/org/objectweb/asm/Frame;-><init>(Lbsh/org/objectweb/asm/Label;)V

    .line 97
    .line 98
    .line 99
    iget-object p4, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 100
    .line 101
    iget p5, p0, Lbsh/org/objectweb/asm/MethodWriter;->accessFlags:I

    .line 102
    .line 103
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->descriptor:Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {p3, p4, p5, v0, p1}, Lbsh/org/objectweb/asm/Frame;->setInputFrameFromDescriptor(Lbsh/org/objectweb/asm/SymbolTable;ILjava/lang/String;I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p3, p0}, Lbsh/org/objectweb/asm/Frame;->accept(Lbsh/org/objectweb/asm/MethodWriter;)V

    .line 109
    .line 110
    .line 111
    :cond_4
    iput v6, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentLocals:I

    .line 112
    .line 113
    iget-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 114
    .line 115
    iget p1, p1, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 116
    .line 117
    invoke-virtual {p0, p1, v6, v8}, Lbsh/org/objectweb/asm/MethodWriter;->visitFrameStart(III)I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    move p3, p2

    .line 122
    :goto_1
    if-ge p3, v6, :cond_5

    .line 123
    .line 124
    iget-object p4, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentFrame:[I

    .line 125
    .line 126
    add-int/lit8 p5, p1, 0x1

    .line 127
    .line 128
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 129
    .line 130
    aget-object v1, v7, p3

    .line 131
    .line 132
    invoke-static {v0, v1}, Lbsh/org/objectweb/asm/Frame;->getAbstractTypeFromApiFormat(Lbsh/org/objectweb/asm/SymbolTable;Ljava/lang/Object;)I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    aput v0, p4, p1

    .line 137
    .line 138
    add-int/lit8 p3, p3, 0x1

    .line 139
    .line 140
    move p1, p5

    .line 141
    goto :goto_1

    .line 142
    :cond_5
    :goto_2
    if-ge p2, v8, :cond_6

    .line 143
    .line 144
    iget-object p3, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentFrame:[I

    .line 145
    .line 146
    add-int/lit8 p4, p1, 0x1

    .line 147
    .line 148
    iget-object p5, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 149
    .line 150
    aget-object v0, v9, p2

    .line 151
    .line 152
    invoke-static {p5, v0}, Lbsh/org/objectweb/asm/Frame;->getAbstractTypeFromApiFormat(Lbsh/org/objectweb/asm/SymbolTable;Ljava/lang/Object;)I

    .line 153
    .line 154
    .line 155
    move-result p5

    .line 156
    aput p5, p3, p1

    .line 157
    .line 158
    add-int/lit8 p2, p2, 0x1

    .line 159
    .line 160
    move p1, p4

    .line 161
    goto :goto_2

    .line 162
    :cond_6
    invoke-virtual {p0}, Lbsh/org/objectweb/asm/MethodWriter;->visitFrameEnd()V

    .line 163
    .line 164
    .line 165
    goto/16 :goto_a

    .line 166
    .line 167
    :cond_7
    iget-object p3, p0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 168
    .line 169
    const/4 p4, 0x1

    .line 170
    if-nez p3, :cond_8

    .line 171
    .line 172
    new-instance p3, Lbsh/org/objectweb/asm/ByteVector;

    .line 173
    .line 174
    invoke-direct {p3}, Lbsh/org/objectweb/asm/ByteVector;-><init>()V

    .line 175
    .line 176
    .line 177
    iput-object p3, p0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 178
    .line 179
    iget-object p3, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 180
    .line 181
    iget p3, p3, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_8
    iget-object p3, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 185
    .line 186
    iget p3, p3, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 187
    .line 188
    iget p5, p0, Lbsh/org/objectweb/asm/MethodWriter;->previousFrameOffset:I

    .line 189
    .line 190
    sub-int/2addr p3, p5

    .line 191
    sub-int/2addr p3, p4

    .line 192
    if-gez p3, :cond_a

    .line 193
    .line 194
    if-ne p1, v4, :cond_9

    .line 195
    .line 196
    :goto_3
    return-void

    .line 197
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 198
    .line 199
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 200
    .line 201
    .line 202
    throw p1

    .line 203
    :cond_a
    :goto_4
    if-eqz p1, :cond_11

    .line 204
    .line 205
    if-eq p1, p4, :cond_10

    .line 206
    .line 207
    const/16 p5, 0xfb

    .line 208
    .line 209
    if-eq p1, v3, :cond_f

    .line 210
    .line 211
    const/16 v0, 0x40

    .line 212
    .line 213
    if-eq p1, v4, :cond_d

    .line 214
    .line 215
    if-ne p1, v1, :cond_c

    .line 216
    .line 217
    iget-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 218
    .line 219
    if-ge p3, v0, :cond_b

    .line 220
    .line 221
    add-int/2addr p3, v0

    .line 222
    invoke-virtual {p1, p3}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_b
    const/16 p5, 0xf7

    .line 227
    .line 228
    invoke-virtual {p1, p5}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {p1, p3}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 233
    .line 234
    .line 235
    :goto_5
    aget-object p1, v9, p2

    .line 236
    .line 237
    invoke-direct {p0, p1}, Lbsh/org/objectweb/asm/MethodWriter;->putFrameType(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    goto :goto_9

    .line 241
    :cond_c
    invoke-static {}, Lj8/o;->o()V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :cond_d
    iget-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 246
    .line 247
    if-ge p3, v0, :cond_e

    .line 248
    .line 249
    invoke-virtual {p1, p3}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 250
    .line 251
    .line 252
    goto :goto_9

    .line 253
    :cond_e
    invoke-virtual {p1, p5}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    invoke-virtual {p1, p3}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 258
    .line 259
    .line 260
    goto :goto_9

    .line 261
    :cond_f
    iget p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentLocals:I

    .line 262
    .line 263
    sub-int/2addr p1, v6

    .line 264
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentLocals:I

    .line 265
    .line 266
    iget-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 267
    .line 268
    sub-int/2addr p5, v6

    .line 269
    invoke-virtual {p1, p5}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    invoke-virtual {p1, p3}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 274
    .line 275
    .line 276
    goto :goto_9

    .line 277
    :cond_10
    iget p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentLocals:I

    .line 278
    .line 279
    add-int/2addr p1, v6

    .line 280
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentLocals:I

    .line 281
    .line 282
    iget-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 283
    .line 284
    add-int/lit16 p5, v6, 0xfb

    .line 285
    .line 286
    invoke-virtual {p1, p5}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    invoke-virtual {p1, p3}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 291
    .line 292
    .line 293
    :goto_6
    if-ge p2, v6, :cond_13

    .line 294
    .line 295
    aget-object p1, v7, p2

    .line 296
    .line 297
    invoke-direct {p0, p1}, Lbsh/org/objectweb/asm/MethodWriter;->putFrameType(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    add-int/lit8 p2, p2, 0x1

    .line 301
    .line 302
    goto :goto_6

    .line 303
    :cond_11
    iput v6, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentLocals:I

    .line 304
    .line 305
    iget-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 306
    .line 307
    const/16 p5, 0xff

    .line 308
    .line 309
    invoke-virtual {p1, p5}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    invoke-virtual {p1, p3}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-virtual {p1, v6}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 318
    .line 319
    .line 320
    move p1, p2

    .line 321
    :goto_7
    if-ge p1, v6, :cond_12

    .line 322
    .line 323
    aget-object p3, v7, p1

    .line 324
    .line 325
    invoke-direct {p0, p3}, Lbsh/org/objectweb/asm/MethodWriter;->putFrameType(Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    add-int/lit8 p1, p1, 0x1

    .line 329
    .line 330
    goto :goto_7

    .line 331
    :cond_12
    iget-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 332
    .line 333
    invoke-virtual {p1, v8}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 334
    .line 335
    .line 336
    :goto_8
    if-ge p2, v8, :cond_13

    .line 337
    .line 338
    aget-object p1, v9, p2

    .line 339
    .line 340
    invoke-direct {p0, p1}, Lbsh/org/objectweb/asm/MethodWriter;->putFrameType(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    add-int/lit8 p2, p2, 0x1

    .line 344
    .line 345
    goto :goto_8

    .line 346
    :cond_13
    :goto_9
    iget-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 347
    .line 348
    iget p1, p1, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 349
    .line 350
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->previousFrameOffset:I

    .line 351
    .line 352
    iget p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableNumberOfEntries:I

    .line 353
    .line 354
    add-int/2addr p1, p4

    .line 355
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableNumberOfEntries:I

    .line 356
    .line 357
    :goto_a
    iget p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->compute:I

    .line 358
    .line 359
    if-ne p1, v3, :cond_14

    .line 360
    .line 361
    iput v8, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 362
    .line 363
    iget p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 364
    .line 365
    if-le v8, p1, :cond_14

    .line 366
    .line 367
    iput v8, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 368
    .line 369
    :cond_14
    iget p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxStack:I

    .line 370
    .line 371
    invoke-static {p1, v8}, Ljava/lang/Math;->max(II)I

    .line 372
    .line 373
    .line 374
    move-result p1

    .line 375
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxStack:I

    .line 376
    .line 377
    iget p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxLocals:I

    .line 378
    .line 379
    iget p2, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentLocals:I

    .line 380
    .line 381
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 382
    .line 383
    .line 384
    move-result p1

    .line 385
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxLocals:I

    .line 386
    .line 387
    return-void
.end method

.method public visitFrameEnd()V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->previousFrame:[I

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lbsh/org/objectweb/asm/ByteVector;

    .line 10
    .line 11
    invoke-direct {v0}, Lbsh/org/objectweb/asm/ByteVector;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableEntries:Lbsh/org/objectweb/asm/ByteVector;

    .line 15
    .line 16
    :cond_0
    invoke-direct {p0}, Lbsh/org/objectweb/asm/MethodWriter;->putFrame()V

    .line 17
    .line 18
    .line 19
    iget v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableNumberOfEntries:I

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    iput v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->stackMapTableNumberOfEntries:I

    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentFrame:[I

    .line 26
    .line 27
    iput-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->previousFrame:[I

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentFrame:[I

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
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentFrame:[I

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
    iput-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentFrame:[I

    .line 14
    .line 15
    :cond_1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentFrame:[I

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    aput p1, v0, v1

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    aput p2, v0, p1

    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    aput p3, v0, p1

    .line 25
    .line 26
    const/4 p1, 0x3

    .line 27
    return p1
.end method

.method public visitIincInsn(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 2
    .line 3
    iget v1, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBytecodeOffset:I

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
    invoke-virtual {v0, v2}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0, p1, p2}, Lbsh/org/objectweb/asm/ByteVector;->put11(II)Lbsh/org/objectweb/asm/ByteVector;

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
    invoke-virtual {v0, v1}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0, v2, p1}, Lbsh/org/objectweb/asm/ByteVector;->put12(II)Lbsh/org/objectweb/asm/ByteVector;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0, p2}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 41
    .line 42
    .line 43
    :goto_1
    iget-object p2, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 44
    .line 45
    if-eqz p2, :cond_3

    .line 46
    .line 47
    iget v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->compute:I

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
    iget-object p2, p2, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    invoke-virtual {p2, v2, p1, v0, v0}, Lbsh/org/objectweb/asm/Frame;->execute(IILbsh/org/objectweb/asm/Symbol;Lbsh/org/objectweb/asm/SymbolTable;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    iget p2, p0, Lbsh/org/objectweb/asm/MethodWriter;->compute:I

    .line 62
    .line 63
    if-eqz p2, :cond_4

    .line 64
    .line 65
    add-int/lit8 p1, p1, 0x1

    .line 66
    .line 67
    iget p2, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxLocals:I

    .line 68
    .line 69
    if-le p1, p2, :cond_4

    .line 70
    .line 71
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxLocals:I

    .line 72
    .line 73
    :cond_4
    return-void
.end method

.method public visitInsn(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 2
    .line 3
    iget v1, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 11
    .line 12
    if-eqz v0, :cond_5

    .line 13
    .line 14
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->compute:I

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
    iget v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 24
    .line 25
    sget-object v1, Lbsh/org/objectweb/asm/MethodWriter;->STACK_SIZE_DELTA:[I

    .line 26
    .line 27
    aget v1, v1, p1

    .line 28
    .line 29
    add-int/2addr v0, v1

    .line 30
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 31
    .line 32
    if-le v0, v1, :cond_1

    .line 33
    .line 34
    iput v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 35
    .line 36
    :cond_1
    iput v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    :goto_0
    iget-object v0, v0, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-virtual {v0, p1, v1, v2, v2}, Lbsh/org/objectweb/asm/Frame;->execute(IILbsh/org/objectweb/asm/Symbol;Lbsh/org/objectweb/asm/SymbolTable;)V

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
    invoke-direct {p0}, Lbsh/org/objectweb/asm/MethodWriter;->endCurrentBasicBlockWithNoSuccessor()V

    .line 59
    .line 60
    .line 61
    :cond_5
    return-void
.end method

.method public visitIntInsn(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 2
    .line 3
    iget v1, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    const/16 v1, 0x11

    .line 8
    .line 9
    if-ne p1, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lbsh/org/objectweb/asm/ByteVector;->put12(II)Lbsh/org/objectweb/asm/ByteVector;

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0, p1, p2}, Lbsh/org/objectweb/asm/ByteVector;->put11(II)Lbsh/org/objectweb/asm/ByteVector;

    .line 16
    .line 17
    .line 18
    :goto_0
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 19
    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->compute:I

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
    iget p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 36
    .line 37
    add-int/lit8 p1, p1, 0x1

    .line 38
    .line 39
    iget p2, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 40
    .line 41
    if-le p1, p2, :cond_2

    .line 42
    .line 43
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 44
    .line 45
    :cond_2
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 46
    .line 47
    return-void

    .line 48
    :cond_3
    :goto_1
    iget-object v0, v0, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-virtual {v0, p1, p2, v1, v1}, Lbsh/org/objectweb/asm/Frame;->execute(IILbsh/org/objectweb/asm/Symbol;Lbsh/org/objectweb/asm/SymbolTable;)V

    .line 52
    .line 53
    .line 54
    :cond_4
    return-void
.end method

.method public varargs visitInvokeDynamicInsn(Ljava/lang/String;Ljava/lang/String;Lbsh/org/objectweb/asm/Handle;[Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3, p4}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantInvokeDynamic(Ljava/lang/String;Ljava/lang/String;Lbsh/org/objectweb/asm/Handle;[Ljava/lang/Object;)Lbsh/org/objectweb/asm/Symbol;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p2, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 14
    .line 15
    iget p3, p1, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 16
    .line 17
    const/16 p4, 0xba

    .line 18
    .line 19
    invoke-virtual {p2, p4, p3}, Lbsh/org/objectweb/asm/ByteVector;->put12(II)Lbsh/org/objectweb/asm/ByteVector;

    .line 20
    .line 21
    .line 22
    iget-object p2, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 23
    .line 24
    const/4 p3, 0x0

    .line 25
    invoke-virtual {p2, p3}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 26
    .line 27
    .line 28
    iget-object p2, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 29
    .line 30
    if-eqz p2, :cond_3

    .line 31
    .line 32
    iget v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->compute:I

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
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/Symbol;->getArgumentsAndReturnSizes()I

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
    iget p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 53
    .line 54
    add-int/2addr p1, p2

    .line 55
    iget p2, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 56
    .line 57
    if-le p1, p2, :cond_1

    .line 58
    .line 59
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 60
    .line 61
    :cond_1
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    :goto_0
    iget-object p2, p2, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 65
    .line 66
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 67
    .line 68
    invoke-virtual {p2, p4, p3, p1, v0}, Lbsh/org/objectweb/asm/Frame;->execute(IILbsh/org/objectweb/asm/Symbol;Lbsh/org/objectweb/asm/SymbolTable;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    return-void
.end method

.method public visitJumpInsn(ILbsh/org/objectweb/asm/Label;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 2
    .line 3
    iget v1, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBytecodeOffset:I

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
    iget-short v4, p2, Lbsh/org/objectweb/asm/Label;->flags:S

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
    iget v4, p2, Lbsh/org/objectweb/asm/Label;->bytecodeOffset:I

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
    invoke-virtual {v0, v2}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

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
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

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
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 64
    .line 65
    const/16 v0, 0x8

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 71
    .line 72
    const/16 v0, 0xdc

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 75
    .line 76
    .line 77
    iput-boolean v9, p0, Lbsh/org/objectweb/asm/MethodWriter;->hasAsmInstructions:Z

    .line 78
    .line 79
    move p1, v9

    .line 80
    :goto_3
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 81
    .line 82
    iget v1, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 83
    .line 84
    sub-int/2addr v1, v9

    .line 85
    invoke-virtual {p2, v0, v1, v9}, Lbsh/org/objectweb/asm/Label;->put(Lbsh/org/objectweb/asm/ByteVector;IZ)V

    .line 86
    .line 87
    .line 88
    goto :goto_5

    .line 89
    :cond_4
    if-eq v3, p1, :cond_5

    .line 90
    .line 91
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 95
    .line 96
    iget v0, p1, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 97
    .line 98
    sub-int/2addr v0, v9

    .line 99
    invoke-virtual {p2, p1, v0, v9}, Lbsh/org/objectweb/asm/Label;->put(Lbsh/org/objectweb/asm/ByteVector;IZ)V

    .line 100
    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_5
    invoke-virtual {v0, v3}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 107
    .line 108
    iget v0, p1, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 109
    .line 110
    sub-int/2addr v0, v9

    .line 111
    invoke-virtual {p2, p1, v0, v8}, Lbsh/org/objectweb/asm/Label;->put(Lbsh/org/objectweb/asm/ByteVector;IZ)V

    .line 112
    .line 113
    .line 114
    :goto_4
    move p1, v8

    .line 115
    :goto_5
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 116
    .line 117
    if-eqz v0, :cond_e

    .line 118
    .line 119
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->compute:I

    .line 120
    .line 121
    const/4 v2, 0x2

    .line 122
    const/4 v4, 0x0

    .line 123
    if-ne v1, v5, :cond_6

    .line 124
    .line 125
    iget-object v0, v0, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 126
    .line 127
    invoke-virtual {v0, v3, v8, v4, v4}, Lbsh/org/objectweb/asm/Frame;->execute(IILbsh/org/objectweb/asm/Symbol;Lbsh/org/objectweb/asm/SymbolTable;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2}, Lbsh/org/objectweb/asm/Label;->getCanonicalInstance()Lbsh/org/objectweb/asm/Label;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iget-short v1, v0, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 135
    .line 136
    or-int/2addr v1, v2

    .line 137
    int-to-short v1, v1

    .line 138
    iput-short v1, v0, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 139
    .line 140
    invoke-direct {p0, v8, p2}, Lbsh/org/objectweb/asm/MethodWriter;->addSuccessorToCurrentBasicBlock(ILbsh/org/objectweb/asm/Label;)V

    .line 141
    .line 142
    .line 143
    if-eq v3, v7, :cond_b

    .line 144
    .line 145
    new-instance v4, Lbsh/org/objectweb/asm/Label;

    .line 146
    .line 147
    invoke-direct {v4}, Lbsh/org/objectweb/asm/Label;-><init>()V

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
    iget-object p2, v0, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 155
    .line 156
    invoke-virtual {p2, v3, v8, v4, v4}, Lbsh/org/objectweb/asm/Frame;->execute(IILbsh/org/objectweb/asm/Symbol;Lbsh/org/objectweb/asm/SymbolTable;)V

    .line 157
    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_7
    if-ne v1, v2, :cond_8

    .line 161
    .line 162
    iget p2, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 163
    .line 164
    sget-object v0, Lbsh/org/objectweb/asm/MethodWriter;->STACK_SIZE_DELTA:[I

    .line 165
    .line 166
    aget v0, v0, v3

    .line 167
    .line 168
    add-int/2addr p2, v0

    .line 169
    iput p2, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_8
    if-ne v3, v6, :cond_a

    .line 173
    .line 174
    iget-short v1, p2, Lbsh/org/objectweb/asm/Label;->flags:S

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
    iput-short v1, p2, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 184
    .line 185
    iput-boolean v9, p0, Lbsh/org/objectweb/asm/MethodWriter;->hasSubroutines:Z

    .line 186
    .line 187
    :cond_9
    iget-short v1, v0, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 188
    .line 189
    or-int/lit8 v1, v1, 0x10

    .line 190
    .line 191
    int-to-short v1, v1

    .line 192
    iput-short v1, v0, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 193
    .line 194
    iget v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 195
    .line 196
    add-int/2addr v0, v9

    .line 197
    invoke-direct {p0, v0, p2}, Lbsh/org/objectweb/asm/MethodWriter;->addSuccessorToCurrentBasicBlock(ILbsh/org/objectweb/asm/Label;)V

    .line 198
    .line 199
    .line 200
    new-instance v4, Lbsh/org/objectweb/asm/Label;

    .line 201
    .line 202
    invoke-direct {v4}, Lbsh/org/objectweb/asm/Label;-><init>()V

    .line 203
    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_a
    iget v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 207
    .line 208
    sget-object v1, Lbsh/org/objectweb/asm/MethodWriter;->STACK_SIZE_DELTA:[I

    .line 209
    .line 210
    aget v1, v1, v3

    .line 211
    .line 212
    add-int/2addr v0, v1

    .line 213
    iput v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 214
    .line 215
    invoke-direct {p0, v0, p2}, Lbsh/org/objectweb/asm/MethodWriter;->addSuccessorToCurrentBasicBlock(ILbsh/org/objectweb/asm/Label;)V

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
    iget-short p1, v4, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 223
    .line 224
    or-int/2addr p1, v2

    .line 225
    int-to-short p1, p1

    .line 226
    iput-short p1, v4, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 227
    .line 228
    :cond_c
    invoke-virtual {p0, v4}, Lbsh/org/objectweb/asm/MethodWriter;->visitLabel(Lbsh/org/objectweb/asm/Label;)V

    .line 229
    .line 230
    .line 231
    :cond_d
    if-ne v3, v7, :cond_e

    .line 232
    .line 233
    invoke-direct {p0}, Lbsh/org/objectweb/asm/MethodWriter;->endCurrentBasicBlockWithNoSuccessor()V

    .line 234
    .line 235
    .line 236
    :cond_e
    return-void
.end method

.method public visitLabel(Lbsh/org/objectweb/asm/Label;)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->hasAsmInstructions:Z

    .line 2
    .line 3
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 4
    .line 5
    iget-object v2, v1, Lbsh/org/objectweb/asm/ByteVector;->data:[B

    .line 6
    .line 7
    iget v1, v1, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 8
    .line 9
    invoke-virtual {p1, v2, v1}, Lbsh/org/objectweb/asm/Label;->resolve([BI)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    or-int/2addr v0, v1

    .line 14
    iput-boolean v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->hasAsmInstructions:Z

    .line 15
    .line 16
    iget-short v0, p1, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 17
    .line 18
    and-int/lit8 v1, v0, 0x1

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    goto/16 :goto_0

    .line 23
    .line 24
    :cond_0
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->compute:I

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x2

    .line 29
    if-ne v1, v2, :cond_5

    .line 30
    .line 31
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    iget v2, p1, Lbsh/org/objectweb/asm/Label;->bytecodeOffset:I

    .line 36
    .line 37
    iget v5, v1, Lbsh/org/objectweb/asm/Label;->bytecodeOffset:I

    .line 38
    .line 39
    if-ne v2, v5, :cond_1

    .line 40
    .line 41
    iget-short v2, v1, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 42
    .line 43
    and-int/2addr v0, v4

    .line 44
    or-int/2addr v0, v2

    .line 45
    int-to-short v0, v0

    .line 46
    iput-short v0, v1, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 47
    .line 48
    iget-object v0, v1, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 49
    .line 50
    iput-object v0, p1, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    invoke-direct {p0, v3, p1}, Lbsh/org/objectweb/asm/MethodWriter;->addSuccessorToCurrentBasicBlock(ILbsh/org/objectweb/asm/Label;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    iget v1, p1, Lbsh/org/objectweb/asm/Label;->bytecodeOffset:I

    .line 61
    .line 62
    iget v2, v0, Lbsh/org/objectweb/asm/Label;->bytecodeOffset:I

    .line 63
    .line 64
    if-ne v1, v2, :cond_3

    .line 65
    .line 66
    iget-short v1, v0, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 67
    .line 68
    iget-short v2, p1, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 69
    .line 70
    and-int/2addr v2, v4

    .line 71
    or-int/2addr v1, v2

    .line 72
    int-to-short v1, v1

    .line 73
    iput-short v1, v0, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 74
    .line 75
    iget-object v1, v0, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 76
    .line 77
    iput-object v1, p1, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 78
    .line 79
    iput-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 80
    .line 81
    return-void

    .line 82
    :cond_3
    iput-object p1, v0, Lbsh/org/objectweb/asm/Label;->nextBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 83
    .line 84
    :cond_4
    iput-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 85
    .line 86
    iput-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 87
    .line 88
    new-instance v0, Lbsh/org/objectweb/asm/Frame;

    .line 89
    .line 90
    invoke-direct {v0, p1}, Lbsh/org/objectweb/asm/Frame;-><init>(Lbsh/org/objectweb/asm/Label;)V

    .line 91
    .line 92
    .line 93
    iput-object v0, p1, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 94
    .line 95
    return-void

    .line 96
    :cond_5
    const/4 v0, 0x3

    .line 97
    if-ne v1, v0, :cond_7

    .line 98
    .line 99
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 100
    .line 101
    if-nez v0, :cond_6

    .line 102
    .line 103
    iput-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 104
    .line 105
    return-void

    .line 106
    :cond_6
    iget-object v0, v0, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 107
    .line 108
    iput-object p1, v0, Lbsh/org/objectweb/asm/Frame;->owner:Lbsh/org/objectweb/asm/Label;

    .line 109
    .line 110
    return-void

    .line 111
    :cond_7
    const/4 v0, 0x1

    .line 112
    if-ne v1, v0, :cond_a

    .line 113
    .line 114
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 115
    .line 116
    if-eqz v0, :cond_8

    .line 117
    .line 118
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 119
    .line 120
    int-to-short v1, v1

    .line 121
    iput-short v1, v0, Lbsh/org/objectweb/asm/Label;->outputStackMax:S

    .line 122
    .line 123
    iget v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 124
    .line 125
    invoke-direct {p0, v0, p1}, Lbsh/org/objectweb/asm/MethodWriter;->addSuccessorToCurrentBasicBlock(ILbsh/org/objectweb/asm/Label;)V

    .line 126
    .line 127
    .line 128
    :cond_8
    iput-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 129
    .line 130
    iput v3, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 131
    .line 132
    iput v3, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 133
    .line 134
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 135
    .line 136
    if-eqz v0, :cond_9

    .line 137
    .line 138
    iput-object p1, v0, Lbsh/org/objectweb/asm/Label;->nextBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 139
    .line 140
    :cond_9
    iput-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 141
    .line 142
    return-void

    .line 143
    :cond_a
    if-ne v1, v4, :cond_b

    .line 144
    .line 145
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 146
    .line 147
    if-nez v0, :cond_b

    .line 148
    .line 149
    iput-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 150
    .line 151
    :cond_b
    :goto_0
    return-void
.end method

.method public visitLdcInsn(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstant(Ljava/lang/Object;)Lbsh/org/objectweb/asm/Symbol;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget v0, p1, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 14
    .line 15
    iget v1, p1, Lbsh/org/objectweb/asm/Symbol;->tag:I

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
    if-ne v1, v2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v1, v4

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    move v1, v3

    .line 29
    :goto_1
    const/16 v2, 0x12

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-object v5, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 34
    .line 35
    const/16 v6, 0x14

    .line 36
    .line 37
    invoke-virtual {v5, v6, v0}, Lbsh/org/objectweb/asm/ByteVector;->put12(II)Lbsh/org/objectweb/asm/ByteVector;

    .line 38
    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    iget-object v5, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 42
    .line 43
    const/16 v6, 0x100

    .line 44
    .line 45
    if-lt v0, v6, :cond_3

    .line 46
    .line 47
    const/16 v6, 0x13

    .line 48
    .line 49
    invoke-virtual {v5, v6, v0}, Lbsh/org/objectweb/asm/ByteVector;->put12(II)Lbsh/org/objectweb/asm/ByteVector;

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    invoke-virtual {v5, v2, v0}, Lbsh/org/objectweb/asm/ByteVector;->put11(II)Lbsh/org/objectweb/asm/ByteVector;

    .line 54
    .line 55
    .line 56
    :goto_2
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 57
    .line 58
    if-eqz v0, :cond_8

    .line 59
    .line 60
    iget v5, p0, Lbsh/org/objectweb/asm/MethodWriter;->compute:I

    .line 61
    .line 62
    const/4 v6, 0x4

    .line 63
    if-eq v5, v6, :cond_7

    .line 64
    .line 65
    const/4 v6, 0x3

    .line 66
    if-ne v5, v6, :cond_4

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    iget p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 70
    .line 71
    if-eqz v1, :cond_5

    .line 72
    .line 73
    const/4 v3, 0x2

    .line 74
    :cond_5
    add-int/2addr p1, v3

    .line 75
    iget v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 76
    .line 77
    if-le p1, v0, :cond_6

    .line 78
    .line 79
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 80
    .line 81
    :cond_6
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 82
    .line 83
    return-void

    .line 84
    :cond_7
    :goto_3
    iget-object v0, v0, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 85
    .line 86
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 87
    .line 88
    invoke-virtual {v0, v2, v4, p1, v1}, Lbsh/org/objectweb/asm/Frame;->execute(IILbsh/org/objectweb/asm/Symbol;Lbsh/org/objectweb/asm/SymbolTable;)V

    .line 89
    .line 90
    .line 91
    :cond_8
    return-void
.end method

.method public visitLineNumber(ILbsh/org/objectweb/asm/Label;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->lineNumberTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lbsh/org/objectweb/asm/ByteVector;

    .line 6
    .line 7
    invoke-direct {v0}, Lbsh/org/objectweb/asm/ByteVector;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->lineNumberTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 11
    .line 12
    :cond_0
    iget v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->lineNumberTableLength:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    iput v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->lineNumberTableLength:I

    .line 17
    .line 18
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->lineNumberTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 19
    .line 20
    iget p2, p2, Lbsh/org/objectweb/asm/Label;->bytecodeOffset:I

    .line 21
    .line 22
    invoke-virtual {v0, p2}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 23
    .line 24
    .line 25
    iget-object p2, p0, Lbsh/org/objectweb/asm/MethodWriter;->lineNumberTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public visitLocalVariable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbsh/org/objectweb/asm/Label;Lbsh/org/objectweb/asm/Label;I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p3, :cond_1

    .line 3
    .line 4
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTypeTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lbsh/org/objectweb/asm/ByteVector;

    .line 9
    .line 10
    invoke-direct {v1}, Lbsh/org/objectweb/asm/ByteVector;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTypeTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 14
    .line 15
    :cond_0
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTypeTableLength:I

    .line 16
    .line 17
    add-int/2addr v1, v0

    .line 18
    iput v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTypeTableLength:I

    .line 19
    .line 20
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTypeTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 21
    .line 22
    iget v2, p4, Lbsh/org/objectweb/asm/Label;->bytecodeOffset:I

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget v2, p5, Lbsh/org/objectweb/asm/Label;->bytecodeOffset:I

    .line 29
    .line 30
    iget v3, p4, Lbsh/org/objectweb/asm/Label;->bytecodeOffset:I

    .line 31
    .line 32
    sub-int/2addr v2, v3

    .line 33
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v2, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 38
    .line 39
    invoke-virtual {v2, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget-object v2, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 48
    .line 49
    invoke-virtual {v2, p3}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    invoke-virtual {v1, p3}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    invoke-virtual {p3, p6}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 58
    .line 59
    .line 60
    :cond_1
    iget-object p3, p0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 61
    .line 62
    if-nez p3, :cond_2

    .line 63
    .line 64
    new-instance p3, Lbsh/org/objectweb/asm/ByteVector;

    .line 65
    .line 66
    invoke-direct {p3}, Lbsh/org/objectweb/asm/ByteVector;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object p3, p0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 70
    .line 71
    :cond_2
    iget p3, p0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTableLength:I

    .line 72
    .line 73
    add-int/2addr p3, v0

    .line 74
    iput p3, p0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTableLength:I

    .line 75
    .line 76
    iget-object p3, p0, Lbsh/org/objectweb/asm/MethodWriter;->localVariableTable:Lbsh/org/objectweb/asm/ByteVector;

    .line 77
    .line 78
    iget v1, p4, Lbsh/org/objectweb/asm/Label;->bytecodeOffset:I

    .line 79
    .line 80
    invoke-virtual {p3, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    iget p5, p5, Lbsh/org/objectweb/asm/Label;->bytecodeOffset:I

    .line 85
    .line 86
    iget p4, p4, Lbsh/org/objectweb/asm/Label;->bytecodeOffset:I

    .line 87
    .line 88
    sub-int/2addr p5, p4

    .line 89
    invoke-virtual {p3, p5}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    iget-object p4, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 94
    .line 95
    invoke-virtual {p4, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-virtual {p3, p1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iget-object p3, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 104
    .line 105
    invoke-virtual {p3, p2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result p3

    .line 109
    invoke-virtual {p1, p3}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p1, p6}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 114
    .line 115
    .line 116
    iget p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->compute:I

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
    iget p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxLocals:I

    .line 136
    .line 137
    if-le p6, p1, :cond_5

    .line 138
    .line 139
    iput p6, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxLocals:I

    .line 140
    .line 141
    :cond_5
    return-void
.end method

.method public visitLookupSwitchInsn(Lbsh/org/objectweb/asm/Label;[I[Lbsh/org/objectweb/asm/Label;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 2
    .line 3
    iget v1, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    const/16 v1, 0xab

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 14
    .line 15
    iget v1, v1, Lbsh/org/objectweb/asm/ByteVector;->length:I

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
    invoke-virtual {v0, v2, v3, v1}, Lbsh/org/objectweb/asm/ByteVector;->putByteArray([BII)Lbsh/org/objectweb/asm/ByteVector;

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 29
    .line 30
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBytecodeOffset:I

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-virtual {p1, v0, v1, v2}, Lbsh/org/objectweb/asm/Label;->put(Lbsh/org/objectweb/asm/ByteVector;IZ)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 37
    .line 38
    array-length v1, p3

    .line 39
    invoke-virtual {v0, v1}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 40
    .line 41
    .line 42
    :goto_0
    array-length v0, p3

    .line 43
    if-ge v3, v0, :cond_0

    .line 44
    .line 45
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 46
    .line 47
    aget v1, p2, v3

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 50
    .line 51
    .line 52
    aget-object v0, p3, v3

    .line 53
    .line 54
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 55
    .line 56
    iget v4, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBytecodeOffset:I

    .line 57
    .line 58
    invoke-virtual {v0, v1, v4, v2}, Lbsh/org/objectweb/asm/Label;->put(Lbsh/org/objectweb/asm/ByteVector;IZ)V

    .line 59
    .line 60
    .line 61
    add-int/lit8 v3, v3, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-direct {p0, p1, p3}, Lbsh/org/objectweb/asm/MethodWriter;->visitSwitchInsn(Lbsh/org/objectweb/asm/Label;[Lbsh/org/objectweb/asm/Label;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public visitMaxs(II)V
    .locals 2

    .line 1
    iget v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->compute:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lbsh/org/objectweb/asm/MethodWriter;->computeAllFrames()V

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
    invoke-direct {p0}, Lbsh/org/objectweb/asm/MethodWriter;->computeMaxStackAndLocal()V

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
    iget p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 21
    .line 22
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxStack:I

    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxStack:I

    .line 26
    .line 27
    iput p2, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxLocals:I

    .line 28
    .line 29
    return-void
.end method

.method public visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 8
    .line 9
    invoke-virtual {v0, p2, p3, p4, p5}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantMethodref(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lbsh/org/objectweb/asm/Symbol;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget-object p3, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

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
    iget v0, p2, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 21
    .line 22
    invoke-virtual {p3, p5, v0}, Lbsh/org/objectweb/asm/ByteVector;->put12(II)Lbsh/org/objectweb/asm/ByteVector;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-virtual {p2}, Lbsh/org/objectweb/asm/Symbol;->getArgumentsAndReturnSizes()I

    .line 27
    .line 28
    .line 29
    move-result p5

    .line 30
    shr-int/lit8 p5, p5, 0x2

    .line 31
    .line 32
    invoke-virtual {p3, p5, p4}, Lbsh/org/objectweb/asm/ByteVector;->put11(II)Lbsh/org/objectweb/asm/ByteVector;

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget p5, p2, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 37
    .line 38
    invoke-virtual {p3, p1, p5}, Lbsh/org/objectweb/asm/ByteVector;->put12(II)Lbsh/org/objectweb/asm/ByteVector;

    .line 39
    .line 40
    .line 41
    :goto_0
    iget-object p3, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 42
    .line 43
    if-eqz p3, :cond_5

    .line 44
    .line 45
    iget p5, p0, Lbsh/org/objectweb/asm/MethodWriter;->compute:I

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
    invoke-virtual {p2}, Lbsh/org/objectweb/asm/Symbol;->getArgumentsAndReturnSizes()I

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
    iget p2, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

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
    iget p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 75
    .line 76
    if-le p2, p1, :cond_3

    .line 77
    .line 78
    iput p2, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 79
    .line 80
    :cond_3
    iput p2, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 81
    .line 82
    return-void

    .line 83
    :cond_4
    :goto_2
    iget-object p3, p3, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 84
    .line 85
    iget-object p5, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 86
    .line 87
    invoke-virtual {p3, p1, p4, p2, p5}, Lbsh/org/objectweb/asm/Frame;->execute(IILbsh/org/objectweb/asm/Symbol;Lbsh/org/objectweb/asm/SymbolTable;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    return-void
.end method

.method public visitMultiANewArrayInsn(Ljava/lang/String;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 14
    .line 15
    iget v1, p1, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 16
    .line 17
    const/16 v2, 0xc5

    .line 18
    .line 19
    invoke-virtual {v0, v2, v1}, Lbsh/org/objectweb/asm/ByteVector;->put12(II)Lbsh/org/objectweb/asm/ByteVector;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, p2}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->compute:I

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
    iget p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 40
    .line 41
    rsub-int/lit8 p2, p2, 0x1

    .line 42
    .line 43
    add-int/2addr p2, p1

    .line 44
    iput p2, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    :goto_0
    iget-object v0, v0, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 48
    .line 49
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 50
    .line 51
    invoke-virtual {v0, v2, p2, p1, v1}, Lbsh/org/objectweb/asm/Frame;->execute(IILbsh/org/objectweb/asm/Symbol;Lbsh/org/objectweb/asm/SymbolTable;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void
.end method

.method public visitParameter(Ljava/lang/String;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->parameters:Lbsh/org/objectweb/asm/ByteVector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lbsh/org/objectweb/asm/ByteVector;

    .line 6
    .line 7
    invoke-direct {v0}, Lbsh/org/objectweb/asm/ByteVector;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->parameters:Lbsh/org/objectweb/asm/ByteVector;

    .line 11
    .line 12
    :cond_0
    iget v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->parametersCount:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    iput v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->parametersCount:I

    .line 17
    .line 18
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->parameters:Lbsh/org/objectweb/asm/ByteVector;

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    :goto_0
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1, p2}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public varargs visitTableSwitchInsn(IILbsh/org/objectweb/asm/Label;[Lbsh/org/objectweb/asm/Label;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 2
    .line 3
    iget v1, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    const/16 v1, 0xaa

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 14
    .line 15
    iget v1, v1, Lbsh/org/objectweb/asm/ByteVector;->length:I

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
    invoke-virtual {v0, v2, v3, v1}, Lbsh/org/objectweb/asm/ByteVector;->putByteArray([BII)Lbsh/org/objectweb/asm/ByteVector;

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 29
    .line 30
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBytecodeOffset:I

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-virtual {p3, v0, v1, v2}, Lbsh/org/objectweb/asm/Label;->put(Lbsh/org/objectweb/asm/ByteVector;IZ)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1, p2}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

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
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 51
    .line 52
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBytecodeOffset:I

    .line 53
    .line 54
    invoke-virtual {p2, v0, v1, v2}, Lbsh/org/objectweb/asm/Label;->put(Lbsh/org/objectweb/asm/ByteVector;IZ)V

    .line 55
    .line 56
    .line 57
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-direct {p0, p3, p4}, Lbsh/org/objectweb/asm/MethodWriter;->visitSwitchInsn(Lbsh/org/objectweb/asm/Label;[Lbsh/org/objectweb/asm/Label;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public visitTryCatchBlock(Lbsh/org/objectweb/asm/Label;Lbsh/org/objectweb/asm/Label;Lbsh/org/objectweb/asm/Label;Ljava/lang/String;)V
    .locals 6

    .line 1
    new-instance v0, Lbsh/org/objectweb/asm/Handler;

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 6
    .line 7
    invoke-virtual {v1, p4}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget v1, v1, Lbsh/org/objectweb/asm/Symbol;->index:I

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
    invoke-direct/range {v0 .. v5}, Lbsh/org/objectweb/asm/Handler;-><init>(Lbsh/org/objectweb/asm/Label;Lbsh/org/objectweb/asm/Label;Lbsh/org/objectweb/asm/Label;ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstHandler:Lbsh/org/objectweb/asm/Handler;

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    iput-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstHandler:Lbsh/org/objectweb/asm/Handler;

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    iget-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastHandler:Lbsh/org/objectweb/asm/Handler;

    .line 32
    .line 33
    iput-object v0, p1, Lbsh/org/objectweb/asm/Handler;->nextHandler:Lbsh/org/objectweb/asm/Handler;

    .line 34
    .line 35
    :goto_2
    iput-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastHandler:Lbsh/org/objectweb/asm/Handler;

    .line 36
    .line 37
    return-void
.end method

.method public visitTypeInsn(ILjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBytecodeOffset:I

    .line 6
    .line 7
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 8
    .line 9
    invoke-virtual {v0, p2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 14
    .line 15
    iget v1, p2, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 16
    .line 17
    invoke-virtual {v0, p1, v1}, Lbsh/org/objectweb/asm/ByteVector;->put12(II)Lbsh/org/objectweb/asm/ByteVector;

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->compute:I

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
    iget p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 38
    .line 39
    add-int/lit8 p1, p1, 0x1

    .line 40
    .line 41
    iget p2, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 42
    .line 43
    if-le p1, p2, :cond_1

    .line 44
    .line 45
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 46
    .line 47
    :cond_1
    iput p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    :goto_0
    iget-object v0, v0, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 51
    .line 52
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBytecodeOffset:I

    .line 53
    .line 54
    iget-object v2, p0, Lbsh/org/objectweb/asm/MethodWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 55
    .line 56
    invoke-virtual {v0, p1, v1, p2, v2}, Lbsh/org/objectweb/asm/Frame;->execute(IILbsh/org/objectweb/asm/Symbol;Lbsh/org/objectweb/asm/SymbolTable;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    return-void
.end method

.method public visitVarInsn(II)V
    .locals 6

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->code:Lbsh/org/objectweb/asm/ByteVector;

    .line 2
    .line 3
    iget v1, v0, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 4
    .line 5
    iput v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->lastBytecodeOffset:I

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
    invoke-virtual {v0, v4}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

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
    invoke-virtual {v0, v4}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0, p1, p2}, Lbsh/org/objectweb/asm/ByteVector;->put12(II)Lbsh/org/objectweb/asm/ByteVector;

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    invoke-virtual {v0, p1, p2}, Lbsh/org/objectweb/asm/ByteVector;->put11(II)Lbsh/org/objectweb/asm/ByteVector;

    .line 52
    .line 53
    .line 54
    :goto_2
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->currentBasicBlock:Lbsh/org/objectweb/asm/Label;

    .line 55
    .line 56
    if-eqz v0, :cond_7

    .line 57
    .line 58
    iget v4, p0, Lbsh/org/objectweb/asm/MethodWriter;->compute:I

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
    iget-short v1, v0, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 69
    .line 70
    or-int/lit8 v1, v1, 0x40

    .line 71
    .line 72
    int-to-short v1, v1

    .line 73
    iput-short v1, v0, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 74
    .line 75
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 76
    .line 77
    int-to-short v1, v1

    .line 78
    iput-short v1, v0, Lbsh/org/objectweb/asm/Label;->outputStackSize:S

    .line 79
    .line 80
    invoke-direct {p0}, Lbsh/org/objectweb/asm/MethodWriter;->endCurrentBasicBlockWithNoSuccessor()V

    .line 81
    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_4
    iget v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 85
    .line 86
    sget-object v1, Lbsh/org/objectweb/asm/MethodWriter;->STACK_SIZE_DELTA:[I

    .line 87
    .line 88
    aget v1, v1, p1

    .line 89
    .line 90
    add-int/2addr v0, v1

    .line 91
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 92
    .line 93
    if-le v0, v1, :cond_5

    .line 94
    .line 95
    iput v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxRelativeStackSize:I

    .line 96
    .line 97
    :cond_5
    iput v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->relativeStackSize:I

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_6
    :goto_3
    iget-object v0, v0, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 101
    .line 102
    const/4 v1, 0x0

    .line 103
    invoke-virtual {v0, p1, p2, v1, v1}, Lbsh/org/objectweb/asm/Frame;->execute(IILbsh/org/objectweb/asm/Symbol;Lbsh/org/objectweb/asm/SymbolTable;)V

    .line 104
    .line 105
    .line 106
    :cond_7
    :goto_4
    iget v0, p0, Lbsh/org/objectweb/asm/MethodWriter;->compute:I

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
    iget v1, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxLocals:I

    .line 133
    .line 134
    if-le p2, v1, :cond_a

    .line 135
    .line 136
    iput p2, p0, Lbsh/org/objectweb/asm/MethodWriter;->maxLocals:I

    .line 137
    .line 138
    :cond_a
    if-lt p1, v2, :cond_b

    .line 139
    .line 140
    if-ne v0, v3, :cond_b

    .line 141
    .line 142
    iget-object p1, p0, Lbsh/org/objectweb/asm/MethodWriter;->firstHandler:Lbsh/org/objectweb/asm/Handler;

    .line 143
    .line 144
    if-eqz p1, :cond_b

    .line 145
    .line 146
    new-instance p1, Lbsh/org/objectweb/asm/Label;

    .line 147
    .line 148
    invoke-direct {p1}, Lbsh/org/objectweb/asm/Label;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, p1}, Lbsh/org/objectweb/asm/MethodWriter;->visitLabel(Lbsh/org/objectweb/asm/Label;)V

    .line 152
    .line 153
    .line 154
    :cond_b
    return-void
.end method
