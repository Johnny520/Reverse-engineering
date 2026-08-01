.class public Lnet/bytebuddy/jar/asm/Label;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field static final EMPTY_LIST:Lnet/bytebuddy/jar/asm/Label;

.field static final FLAG_DEBUG_ONLY:I = 0x1

.field static final FLAG_JUMP_TARGET:I = 0x2

.field static final FLAG_LINE_NUMBER:I = 0x80

.field static final FLAG_REACHABLE:I = 0x8

.field static final FLAG_RESOLVED:I = 0x4

.field static final FLAG_SUBROUTINE_CALLER:I = 0x10

.field static final FLAG_SUBROUTINE_END:I = 0x40

.field static final FLAG_SUBROUTINE_START:I = 0x20

.field static final FORWARD_REFERENCES_CAPACITY_INCREMENT:I = 0x6

.field static final FORWARD_REFERENCE_HANDLE_MASK:I = 0xfffffff

.field static final FORWARD_REFERENCE_TYPE_MASK:I = -0x10000000

.field static final FORWARD_REFERENCE_TYPE_SHORT:I = 0x10000000

.field static final FORWARD_REFERENCE_TYPE_STACK_MAP:I = 0x30000000

.field static final FORWARD_REFERENCE_TYPE_WIDE:I = 0x20000000

.field static final LINE_NUMBERS_CAPACITY_INCREMENT:I = 0x4


# instance fields
.field bytecodeOffset:I

.field flags:S

.field private forwardReferences:[I

.field frame:Lnet/bytebuddy/jar/asm/Frame;

.field public info:Ljava/lang/Object;

.field inputStackSize:S

.field private lineNumber:S

.field nextBasicBlock:Lnet/bytebuddy/jar/asm/Label;

.field nextListElement:Lnet/bytebuddy/jar/asm/Label;

.field private otherLineNumbers:[I

.field outgoingEdges:Lnet/bytebuddy/jar/asm/Edge;

.field outputStackMax:S

.field outputStackSize:S

.field subroutineId:S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/Label;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lnet/bytebuddy/jar/asm/Label;->EMPTY_LIST:Lnet/bytebuddy/jar/asm/Label;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private addForwardReference(III)V
    .locals 6

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/Label;->forwardReferences:[I

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-array v0, v1, [I

    .line 7
    .line 8
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/Label;->forwardReferences:[I

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/Label;->forwardReferences:[I

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aget v3, v0, v2

    .line 14
    .line 15
    add-int/lit8 v4, v3, 0x2

    .line 16
    .line 17
    array-length v5, v0

    .line 18
    if-lt v4, v5, :cond_1

    .line 19
    .line 20
    array-length v4, v0

    .line 21
    add-int/2addr v4, v1

    .line 22
    new-array v1, v4, [I

    .line 23
    .line 24
    array-length v4, v0

    .line 25
    invoke-static {v0, v2, v1, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/Label;->forwardReferences:[I

    .line 29
    .line 30
    :cond_1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/Label;->forwardReferences:[I

    .line 31
    .line 32
    add-int/lit8 v0, v3, 0x1

    .line 33
    .line 34
    aput p1, p0, v0

    .line 35
    .line 36
    add-int/lit8 v3, v3, 0x2

    .line 37
    .line 38
    or-int p1, p2, p3

    .line 39
    .line 40
    aput p1, p0, v3

    .line 41
    .line 42
    aput v3, p0, v2

    .line 43
    .line 44
    return-void
.end method

.method private pushSuccessors(Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/Label;->outgoingEdges:Lnet/bytebuddy/jar/asm/Edge;

    .line 2
    .line 3
    :goto_0
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-short v1, p0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 6
    .line 7
    and-int/lit8 v1, v1, 0x10

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/Label;->outgoingEdges:Lnet/bytebuddy/jar/asm/Edge;

    .line 12
    .line 13
    iget-object v1, v1, Lnet/bytebuddy/jar/asm/Edge;->nextEdge:Lnet/bytebuddy/jar/asm/Edge;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/Edge;->successor:Lnet/bytebuddy/jar/asm/Label;

    .line 19
    .line 20
    iget-object v2, v1, Lnet/bytebuddy/jar/asm/Label;->nextListElement:Lnet/bytebuddy/jar/asm/Label;

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    iput-object p1, v1, Lnet/bytebuddy/jar/asm/Label;->nextListElement:Lnet/bytebuddy/jar/asm/Label;

    .line 25
    .line 26
    move-object p1, v1

    .line 27
    :cond_1
    :goto_1
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/Edge;->nextEdge:Lnet/bytebuddy/jar/asm/Edge;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    return-object p1
.end method

.method private static synthetic stringConcat$0(I)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "L"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public final accept(Lnet/bytebuddy/jar/asm/MethodVisitor;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    iget-short p2, p0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 7
    .line 8
    and-int/lit16 p2, p2, 0x80

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    iget-short p2, p0, Lnet/bytebuddy/jar/asm/Label;->lineNumber:S

    .line 13
    .line 14
    const v0, 0xffff

    .line 15
    .line 16
    .line 17
    and-int/2addr p2, v0

    .line 18
    invoke-virtual {p1, p2, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLineNumber(ILnet/bytebuddy/jar/asm/Label;)V

    .line 19
    .line 20
    .line 21
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/Label;->otherLineNumbers:[I

    .line 22
    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    const/4 p2, 0x1

    .line 26
    :goto_0
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/Label;->otherLineNumbers:[I

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    aget v1, v0, v1

    .line 30
    .line 31
    if-gt p2, v1, :cond_0

    .line 32
    .line 33
    aget v0, v0, p2

    .line 34
    .line 35
    invoke-virtual {p1, v0, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLineNumber(ILnet/bytebuddy/jar/asm/Label;)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 p2, p2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-void
.end method

.method public final addLineNumber(I)V
    .locals 5

    .line 1
    iget-short v0, p0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 2
    .line 3
    and-int/lit16 v1, v0, 0x80

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    or-int/lit16 v0, v0, 0x80

    .line 8
    .line 9
    int-to-short v0, v0

    .line 10
    iput-short v0, p0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 11
    .line 12
    int-to-short p1, p1

    .line 13
    iput-short p1, p0, Lnet/bytebuddy/jar/asm/Label;->lineNumber:S

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/Label;->otherLineNumbers:[I

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    new-array v0, v1, [I

    .line 22
    .line 23
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/Label;->otherLineNumbers:[I

    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/Label;->otherLineNumbers:[I

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    aget v3, v0, v2

    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    aput v3, v0, v2

    .line 33
    .line 34
    array-length v4, v0

    .line 35
    if-lt v3, v4, :cond_2

    .line 36
    .line 37
    array-length v4, v0

    .line 38
    add-int/2addr v4, v1

    .line 39
    new-array v1, v4, [I

    .line 40
    .line 41
    array-length v4, v0

    .line 42
    invoke-static {v0, v2, v1, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/Label;->otherLineNumbers:[I

    .line 46
    .line 47
    :cond_2
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/Label;->otherLineNumbers:[I

    .line 48
    .line 49
    aput p1, p0, v3

    .line 50
    .line 51
    return-void
.end method

.method public final addSubroutineRetSuccessors(Lnet/bytebuddy/jar/asm/Label;)V
    .locals 6

    .line 1
    sget-object v0, Lnet/bytebuddy/jar/asm/Label;->EMPTY_LIST:Lnet/bytebuddy/jar/asm/Label;

    .line 2
    .line 3
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/Label;->nextListElement:Lnet/bytebuddy/jar/asm/Label;

    .line 4
    .line 5
    :goto_0
    sget-object v1, Lnet/bytebuddy/jar/asm/Label;->EMPTY_LIST:Lnet/bytebuddy/jar/asm/Label;

    .line 6
    .line 7
    if-eq p0, v1, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/Label;->nextListElement:Lnet/bytebuddy/jar/asm/Label;

    .line 10
    .line 11
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/Label;->nextListElement:Lnet/bytebuddy/jar/asm/Label;

    .line 12
    .line 13
    iget-short v0, p0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 14
    .line 15
    and-int/lit8 v0, v0, 0x40

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-short v0, p0, Lnet/bytebuddy/jar/asm/Label;->subroutineId:S

    .line 20
    .line 21
    iget-short v2, p1, Lnet/bytebuddy/jar/asm/Label;->subroutineId:S

    .line 22
    .line 23
    if-eq v0, v2, :cond_0

    .line 24
    .line 25
    new-instance v0, Lnet/bytebuddy/jar/asm/Edge;

    .line 26
    .line 27
    iget-short v2, p0, Lnet/bytebuddy/jar/asm/Label;->outputStackSize:S

    .line 28
    .line 29
    iget-object v3, p1, Lnet/bytebuddy/jar/asm/Label;->outgoingEdges:Lnet/bytebuddy/jar/asm/Edge;

    .line 30
    .line 31
    iget-object v3, v3, Lnet/bytebuddy/jar/asm/Edge;->successor:Lnet/bytebuddy/jar/asm/Label;

    .line 32
    .line 33
    iget-object v4, p0, Lnet/bytebuddy/jar/asm/Label;->outgoingEdges:Lnet/bytebuddy/jar/asm/Edge;

    .line 34
    .line 35
    invoke-direct {v0, v2, v3, v4}, Lnet/bytebuddy/jar/asm/Edge;-><init>(ILnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Edge;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/Label;->outgoingEdges:Lnet/bytebuddy/jar/asm/Edge;

    .line 39
    .line 40
    :cond_0
    invoke-direct {p0, v1}, Lnet/bytebuddy/jar/asm/Label;->pushSuccessors(Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    move-object v5, v0

    .line 45
    move-object v0, p0

    .line 46
    move-object p0, v5

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    :goto_1
    sget-object p0, Lnet/bytebuddy/jar/asm/Label;->EMPTY_LIST:Lnet/bytebuddy/jar/asm/Label;

    .line 49
    .line 50
    if-eq v0, p0, :cond_2

    .line 51
    .line 52
    iget-object p0, v0, Lnet/bytebuddy/jar/asm/Label;->nextListElement:Lnet/bytebuddy/jar/asm/Label;

    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    iput-object p1, v0, Lnet/bytebuddy/jar/asm/Label;->nextListElement:Lnet/bytebuddy/jar/asm/Label;

    .line 56
    .line 57
    move-object v0, p0

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    return-void
.end method

.method public final getCanonicalInstance()Lnet/bytebuddy/jar/asm/Label;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/Label;->frame:Lnet/bytebuddy/jar/asm/Frame;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object p0, v0, Lnet/bytebuddy/jar/asm/Frame;->owner:Lnet/bytebuddy/jar/asm/Label;

    .line 7
    .line 8
    return-object p0
.end method

.method public getOffset()I
    .locals 1

    .line 1
    iget-short v0, p0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget p0, p0, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    const-string p0, "Label offset position has not been resolved yet"

    .line 11
    .line 12
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public final markSubroutine(S)V
    .locals 2

    .line 1
    sget-object v0, Lnet/bytebuddy/jar/asm/Label;->EMPTY_LIST:Lnet/bytebuddy/jar/asm/Label;

    .line 2
    .line 3
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/Label;->nextListElement:Lnet/bytebuddy/jar/asm/Label;

    .line 4
    .line 5
    :goto_0
    sget-object v0, Lnet/bytebuddy/jar/asm/Label;->EMPTY_LIST:Lnet/bytebuddy/jar/asm/Label;

    .line 6
    .line 7
    if-eq p0, v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/Label;->nextListElement:Lnet/bytebuddy/jar/asm/Label;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/Label;->nextListElement:Lnet/bytebuddy/jar/asm/Label;

    .line 13
    .line 14
    iget-short v1, p0, Lnet/bytebuddy/jar/asm/Label;->subroutineId:S

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    iput-short p1, p0, Lnet/bytebuddy/jar/asm/Label;->subroutineId:S

    .line 19
    .line 20
    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/Label;->pushSuccessors(Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object p0, v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return-void
.end method

.method public final put(Lnet/bytebuddy/jar/asm/ByteVector;)V
    .locals 3

    .line 46
    iget-short v0, p0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    and-int/lit8 v0, v0, 0x4

    if-nez v0, :cond_0

    const/high16 v0, 0x30000000

    .line 47
    iget v1, p1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lnet/bytebuddy/jar/asm/Label;->addForwardReference(III)V

    .line 48
    :cond_0
    iget p0, p0, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    return-void
.end method

.method public final put(Lnet/bytebuddy/jar/asm/ByteVector;IZ)V
    .locals 2

    .line 1
    iget-short v0, p0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    const/high16 p3, 0x20000000

    .line 11
    .line 12
    iget v1, p1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 13
    .line 14
    invoke-direct {p0, p2, p3, v1}, Lnet/bytebuddy/jar/asm/Label;->addForwardReference(III)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const/high16 p3, 0x10000000

    .line 22
    .line 23
    iget v1, p1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 24
    .line 25
    invoke-direct {p0, p2, p3, v1}, Lnet/bytebuddy/jar/asm/Label;->addForwardReference(III)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget p0, p0, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 33
    .line 34
    if-eqz p3, :cond_2

    .line 35
    .line 36
    sub-int/2addr p0, p2

    .line 37
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    sub-int/2addr p0, p2

    .line 42
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final resolve([BLnet/bytebuddy/jar/asm/ByteVector;I)Z
    .locals 7

    .line 1
    iget-short v0, p0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    int-to-short v0, v0

    .line 6
    iput-short v0, p0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 7
    .line 8
    iput p3, p0, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 9
    .line 10
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/Label;->forwardReferences:[I

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    aget v0, v0, v1

    .line 17
    .line 18
    :goto_0
    if-lez v0, :cond_6

    .line 19
    .line 20
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/Label;->forwardReferences:[I

    .line 21
    .line 22
    add-int/lit8 v3, v0, -0x1

    .line 23
    .line 24
    aget v3, v2, v3

    .line 25
    .line 26
    aget v2, v2, v0

    .line 27
    .line 28
    sub-int v4, p3, v3

    .line 29
    .line 30
    const v5, 0xfffffff

    .line 31
    .line 32
    .line 33
    and-int/2addr v5, v2

    .line 34
    const/high16 v6, -0x10000000

    .line 35
    .line 36
    and-int/2addr v2, v6

    .line 37
    const/high16 v6, 0x10000000

    .line 38
    .line 39
    if-ne v2, v6, :cond_4

    .line 40
    .line 41
    const/16 v2, -0x8000

    .line 42
    .line 43
    if-lt v4, v2, :cond_1

    .line 44
    .line 45
    const/16 v2, 0x7fff

    .line 46
    .line 47
    if-le v4, v2, :cond_3

    .line 48
    .line 49
    :cond_1
    aget-byte v1, p1, v3

    .line 50
    .line 51
    and-int/lit16 v1, v1, 0xff

    .line 52
    .line 53
    const/16 v2, 0xc6

    .line 54
    .line 55
    if-ge v1, v2, :cond_2

    .line 56
    .line 57
    add-int/lit8 v1, v1, 0x31

    .line 58
    .line 59
    int-to-byte v1, v1

    .line 60
    aput-byte v1, p1, v3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    add-int/lit8 v1, v1, 0x14

    .line 64
    .line 65
    int-to-byte v1, v1

    .line 66
    aput-byte v1, p1, v3

    .line 67
    .line 68
    :goto_1
    const/4 v1, 0x1

    .line 69
    :cond_3
    add-int/lit8 v2, v5, 0x1

    .line 70
    .line 71
    ushr-int/lit8 v3, v4, 0x8

    .line 72
    .line 73
    int-to-byte v3, v3

    .line 74
    aput-byte v3, p1, v5

    .line 75
    .line 76
    int-to-byte v3, v4

    .line 77
    aput-byte v3, p1, v2

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    const/high16 v3, 0x20000000

    .line 81
    .line 82
    if-ne v2, v3, :cond_5

    .line 83
    .line 84
    add-int/lit8 v2, v5, 0x1

    .line 85
    .line 86
    ushr-int/lit8 v3, v4, 0x18

    .line 87
    .line 88
    int-to-byte v3, v3

    .line 89
    aput-byte v3, p1, v5

    .line 90
    .line 91
    add-int/lit8 v3, v5, 0x2

    .line 92
    .line 93
    ushr-int/lit8 v6, v4, 0x10

    .line 94
    .line 95
    int-to-byte v6, v6

    .line 96
    aput-byte v6, p1, v2

    .line 97
    .line 98
    add-int/lit8 v5, v5, 0x3

    .line 99
    .line 100
    ushr-int/lit8 v2, v4, 0x8

    .line 101
    .line 102
    int-to-byte v2, v2

    .line 103
    aput-byte v2, p1, v3

    .line 104
    .line 105
    int-to-byte v2, v4

    .line 106
    aput-byte v2, p1, v5

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    iget-object v2, p2, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 110
    .line 111
    add-int/lit8 v3, v5, 0x1

    .line 112
    .line 113
    ushr-int/lit8 v4, p3, 0x8

    .line 114
    .line 115
    int-to-byte v4, v4

    .line 116
    aput-byte v4, v2, v5

    .line 117
    .line 118
    int-to-byte v4, p3

    .line 119
    aput-byte v4, v2, v3

    .line 120
    .line 121
    :goto_2
    add-int/lit8 v0, v0, -0x2

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_6
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/jar/asm/Label;->stringConcat$0(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
