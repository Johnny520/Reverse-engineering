.class public Lbsh/org/objectweb/asm/Label;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field static final EMPTY_LIST:Lbsh/org/objectweb/asm/Label;

.field static final FLAG_DEBUG_ONLY:I = 0x1

.field static final FLAG_JUMP_TARGET:I = 0x2

.field static final FLAG_REACHABLE:I = 0x8

.field static final FLAG_RESOLVED:I = 0x4

.field static final FLAG_SUBROUTINE_CALLER:I = 0x10

.field static final FLAG_SUBROUTINE_END:I = 0x40

.field static final FLAG_SUBROUTINE_START:I = 0x20

.field static final FORWARD_REFERENCES_CAPACITY_INCREMENT:I = 0x6

.field static final FORWARD_REFERENCE_HANDLE_MASK:I = 0xfffffff

.field static final FORWARD_REFERENCE_TYPE_MASK:I = -0x10000000

.field static final FORWARD_REFERENCE_TYPE_SHORT:I = 0x10000000

.field static final FORWARD_REFERENCE_TYPE_WIDE:I = 0x20000000

.field static final LINE_NUMBERS_CAPACITY_INCREMENT:I = 0x4


# instance fields
.field bytecodeOffset:I

.field flags:S

.field private forwardReferences:[I

.field frame:Lbsh/org/objectweb/asm/Frame;

.field public info:Ljava/lang/Object;

.field inputStackSize:S

.field private lineNumber:S

.field nextBasicBlock:Lbsh/org/objectweb/asm/Label;

.field nextListElement:Lbsh/org/objectweb/asm/Label;

.field private otherLineNumbers:[I

.field outgoingEdges:Lbsh/org/objectweb/asm/Edge;

.field outputStackMax:S

.field outputStackSize:S

.field subroutineId:S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lbsh/org/objectweb/asm/Label;

    .line 2
    .line 3
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Label;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbsh/org/objectweb/asm/Label;->EMPTY_LIST:Lbsh/org/objectweb/asm/Label;

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
    iget-object v0, p0, Lbsh/org/objectweb/asm/Label;->forwardReferences:[I

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
    iput-object v0, p0, Lbsh/org/objectweb/asm/Label;->forwardReferences:[I

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lbsh/org/objectweb/asm/Label;->forwardReferences:[I

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
    iput-object v1, p0, Lbsh/org/objectweb/asm/Label;->forwardReferences:[I

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Lbsh/org/objectweb/asm/Label;->forwardReferences:[I

    .line 31
    .line 32
    add-int/lit8 v1, v3, 0x1

    .line 33
    .line 34
    aput p1, v0, v1

    .line 35
    .line 36
    add-int/lit8 v3, v3, 0x2

    .line 37
    .line 38
    or-int p1, p2, p3

    .line 39
    .line 40
    aput p1, v0, v3

    .line 41
    .line 42
    aput v3, v0, v2

    .line 43
    .line 44
    return-void
.end method

.method private pushSuccessors(Lbsh/org/objectweb/asm/Label;)Lbsh/org/objectweb/asm/Label;
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/Label;->outgoingEdges:Lbsh/org/objectweb/asm/Edge;

    .line 2
    .line 3
    :goto_0
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-short v1, p0, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 6
    .line 7
    and-int/lit8 v1, v1, 0x10

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lbsh/org/objectweb/asm/Label;->outgoingEdges:Lbsh/org/objectweb/asm/Edge;

    .line 12
    .line 13
    iget-object v1, v1, Lbsh/org/objectweb/asm/Edge;->nextEdge:Lbsh/org/objectweb/asm/Edge;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object v1, v0, Lbsh/org/objectweb/asm/Edge;->successor:Lbsh/org/objectweb/asm/Label;

    .line 19
    .line 20
    iget-object v2, v1, Lbsh/org/objectweb/asm/Label;->nextListElement:Lbsh/org/objectweb/asm/Label;

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    iput-object p1, v1, Lbsh/org/objectweb/asm/Label;->nextListElement:Lbsh/org/objectweb/asm/Label;

    .line 25
    .line 26
    move-object p1, v1

    .line 27
    :cond_1
    :goto_1
    iget-object v0, v0, Lbsh/org/objectweb/asm/Edge;->nextEdge:Lbsh/org/objectweb/asm/Edge;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    return-object p1
.end method


# virtual methods
.method public final accept(Lbsh/org/objectweb/asm/MethodVisitor;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1, p0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLabel(Lbsh/org/objectweb/asm/Label;)V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    iget-short p2, p0, Lbsh/org/objectweb/asm/Label;->lineNumber:S

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    const v0, 0xffff

    .line 11
    .line 12
    .line 13
    and-int/2addr p2, v0

    .line 14
    invoke-virtual {p1, p2, p0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLineNumber(ILbsh/org/objectweb/asm/Label;)V

    .line 15
    .line 16
    .line 17
    iget-object p2, p0, Lbsh/org/objectweb/asm/Label;->otherLineNumbers:[I

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    const/4 p2, 0x1

    .line 22
    :goto_0
    iget-object v0, p0, Lbsh/org/objectweb/asm/Label;->otherLineNumbers:[I

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    aget v1, v0, v1

    .line 26
    .line 27
    if-gt p2, v1, :cond_0

    .line 28
    .line 29
    aget v0, v0, p2

    .line 30
    .line 31
    invoke-virtual {p1, v0, p0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLineNumber(ILbsh/org/objectweb/asm/Label;)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 p2, p2, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void
.end method

.method public final addLineNumber(I)V
    .locals 5

    .line 1
    iget-short v0, p0, Lbsh/org/objectweb/asm/Label;->lineNumber:S

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    int-to-short p1, p1

    .line 6
    iput-short p1, p0, Lbsh/org/objectweb/asm/Label;->lineNumber:S

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/org/objectweb/asm/Label;->otherLineNumbers:[I

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    new-array v0, v1, [I

    .line 15
    .line 16
    iput-object v0, p0, Lbsh/org/objectweb/asm/Label;->otherLineNumbers:[I

    .line 17
    .line 18
    :cond_1
    iget-object v0, p0, Lbsh/org/objectweb/asm/Label;->otherLineNumbers:[I

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    aget v3, v0, v2

    .line 22
    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    aput v3, v0, v2

    .line 26
    .line 27
    array-length v4, v0

    .line 28
    if-lt v3, v4, :cond_2

    .line 29
    .line 30
    array-length v4, v0

    .line 31
    add-int/2addr v4, v1

    .line 32
    new-array v1, v4, [I

    .line 33
    .line 34
    array-length v4, v0

    .line 35
    invoke-static {v0, v2, v1, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Lbsh/org/objectweb/asm/Label;->otherLineNumbers:[I

    .line 39
    .line 40
    :cond_2
    iget-object v0, p0, Lbsh/org/objectweb/asm/Label;->otherLineNumbers:[I

    .line 41
    .line 42
    aput p1, v0, v3

    .line 43
    .line 44
    return-void
.end method

.method public final addSubroutineRetSuccessors(Lbsh/org/objectweb/asm/Label;)V
    .locals 7

    .line 1
    sget-object v0, Lbsh/org/objectweb/asm/Label;->EMPTY_LIST:Lbsh/org/objectweb/asm/Label;

    .line 2
    .line 3
    iput-object v0, p0, Lbsh/org/objectweb/asm/Label;->nextListElement:Lbsh/org/objectweb/asm/Label;

    .line 4
    .line 5
    move-object v1, v0

    .line 6
    move-object v0, p0

    .line 7
    :goto_0
    sget-object v2, Lbsh/org/objectweb/asm/Label;->EMPTY_LIST:Lbsh/org/objectweb/asm/Label;

    .line 8
    .line 9
    if-eq v0, v2, :cond_1

    .line 10
    .line 11
    iget-object v2, v0, Lbsh/org/objectweb/asm/Label;->nextListElement:Lbsh/org/objectweb/asm/Label;

    .line 12
    .line 13
    iput-object v1, v0, Lbsh/org/objectweb/asm/Label;->nextListElement:Lbsh/org/objectweb/asm/Label;

    .line 14
    .line 15
    iget-short v1, v0, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 16
    .line 17
    and-int/lit8 v1, v1, 0x40

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-short v1, v0, Lbsh/org/objectweb/asm/Label;->subroutineId:S

    .line 22
    .line 23
    iget-short v3, p1, Lbsh/org/objectweb/asm/Label;->subroutineId:S

    .line 24
    .line 25
    if-eq v1, v3, :cond_0

    .line 26
    .line 27
    new-instance v1, Lbsh/org/objectweb/asm/Edge;

    .line 28
    .line 29
    iget-short v3, v0, Lbsh/org/objectweb/asm/Label;->outputStackSize:S

    .line 30
    .line 31
    iget-object v4, p1, Lbsh/org/objectweb/asm/Label;->outgoingEdges:Lbsh/org/objectweb/asm/Edge;

    .line 32
    .line 33
    iget-object v4, v4, Lbsh/org/objectweb/asm/Edge;->successor:Lbsh/org/objectweb/asm/Label;

    .line 34
    .line 35
    iget-object v5, v0, Lbsh/org/objectweb/asm/Label;->outgoingEdges:Lbsh/org/objectweb/asm/Edge;

    .line 36
    .line 37
    invoke-direct {v1, v3, v4, v5}, Lbsh/org/objectweb/asm/Edge;-><init>(ILbsh/org/objectweb/asm/Label;Lbsh/org/objectweb/asm/Edge;)V

    .line 38
    .line 39
    .line 40
    iput-object v1, v0, Lbsh/org/objectweb/asm/Label;->outgoingEdges:Lbsh/org/objectweb/asm/Edge;

    .line 41
    .line 42
    :cond_0
    invoke-direct {v0, v2}, Lbsh/org/objectweb/asm/Label;->pushSuccessors(Lbsh/org/objectweb/asm/Label;)Lbsh/org/objectweb/asm/Label;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    move-object v6, v1

    .line 47
    move-object v1, v0

    .line 48
    move-object v0, v6

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    sget-object p1, Lbsh/org/objectweb/asm/Label;->EMPTY_LIST:Lbsh/org/objectweb/asm/Label;

    .line 51
    .line 52
    if-eq v1, p1, :cond_2

    .line 53
    .line 54
    iget-object p1, v1, Lbsh/org/objectweb/asm/Label;->nextListElement:Lbsh/org/objectweb/asm/Label;

    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    iput-object v0, v1, Lbsh/org/objectweb/asm/Label;->nextListElement:Lbsh/org/objectweb/asm/Label;

    .line 58
    .line 59
    move-object v1, p1

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    return-void
.end method

.method public final getCanonicalInstance()Lbsh/org/objectweb/asm/Label;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/Label;->frame:Lbsh/org/objectweb/asm/Frame;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object v0, v0, Lbsh/org/objectweb/asm/Frame;->owner:Lbsh/org/objectweb/asm/Label;

    .line 7
    .line 8
    return-object v0
.end method

.method public getOffset()I
    .locals 1

    .line 1
    iget-short v0, p0, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lbsh/org/objectweb/asm/Label;->bytecodeOffset:I

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    const-string v0, "Label offset position has not been resolved yet"

    .line 11
    .line 12
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public final markSubroutine(S)V
    .locals 3

    .line 1
    sget-object v0, Lbsh/org/objectweb/asm/Label;->EMPTY_LIST:Lbsh/org/objectweb/asm/Label;

    .line 2
    .line 3
    iput-object v0, p0, Lbsh/org/objectweb/asm/Label;->nextListElement:Lbsh/org/objectweb/asm/Label;

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    :goto_0
    sget-object v1, Lbsh/org/objectweb/asm/Label;->EMPTY_LIST:Lbsh/org/objectweb/asm/Label;

    .line 7
    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v1, v0, Lbsh/org/objectweb/asm/Label;->nextListElement:Lbsh/org/objectweb/asm/Label;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    iput-object v2, v0, Lbsh/org/objectweb/asm/Label;->nextListElement:Lbsh/org/objectweb/asm/Label;

    .line 14
    .line 15
    iget-short v2, v0, Lbsh/org/objectweb/asm/Label;->subroutineId:S

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    iput-short p1, v0, Lbsh/org/objectweb/asm/Label;->subroutineId:S

    .line 20
    .line 21
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Label;->pushSuccessors(Lbsh/org/objectweb/asm/Label;)Lbsh/org/objectweb/asm/Label;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v0, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return-void
.end method

.method public final put(Lbsh/org/objectweb/asm/ByteVector;IZ)V
    .locals 2

    .line 1
    iget-short v0, p0, Lbsh/org/objectweb/asm/Label;->flags:S

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
    iget v1, p1, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 13
    .line 14
    invoke-direct {p0, p2, p3, v1}, Lbsh/org/objectweb/asm/Label;->addForwardReference(III)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const/high16 p3, 0x10000000

    .line 22
    .line 23
    iget v1, p1, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 24
    .line 25
    invoke-direct {p0, p2, p3, v1}, Lbsh/org/objectweb/asm/Label;->addForwardReference(III)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget v0, p0, Lbsh/org/objectweb/asm/Label;->bytecodeOffset:I

    .line 33
    .line 34
    if-eqz p3, :cond_2

    .line 35
    .line 36
    sub-int/2addr v0, p2

    .line 37
    invoke-virtual {p1, v0}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    sub-int/2addr v0, p2

    .line 42
    invoke-virtual {p1, v0}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final resolve([BI)Z
    .locals 7

    .line 1
    iget-short v0, p0, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    int-to-short v0, v0

    .line 6
    iput-short v0, p0, Lbsh/org/objectweb/asm/Label;->flags:S

    .line 7
    .line 8
    iput p2, p0, Lbsh/org/objectweb/asm/Label;->bytecodeOffset:I

    .line 9
    .line 10
    iget-object v0, p0, Lbsh/org/objectweb/asm/Label;->forwardReferences:[I

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
    if-lez v0, :cond_5

    .line 19
    .line 20
    iget-object v2, p0, Lbsh/org/objectweb/asm/Label;->forwardReferences:[I

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
    sub-int v4, p2, v3

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
    add-int/lit8 v2, v5, 0x1

    .line 81
    .line 82
    ushr-int/lit8 v3, v4, 0x18

    .line 83
    .line 84
    int-to-byte v3, v3

    .line 85
    aput-byte v3, p1, v5

    .line 86
    .line 87
    add-int/lit8 v3, v5, 0x2

    .line 88
    .line 89
    ushr-int/lit8 v6, v4, 0x10

    .line 90
    .line 91
    int-to-byte v6, v6

    .line 92
    aput-byte v6, p1, v2

    .line 93
    .line 94
    add-int/lit8 v5, v5, 0x3

    .line 95
    .line 96
    ushr-int/lit8 v2, v4, 0x8

    .line 97
    .line 98
    int-to-byte v2, v2

    .line 99
    aput-byte v2, p1, v3

    .line 100
    .line 101
    int-to-byte v2, v4

    .line 102
    aput-byte v2, p1, v5

    .line 103
    .line 104
    :goto_2
    add-int/lit8 v0, v0, -0x2

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_5
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "L"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method
