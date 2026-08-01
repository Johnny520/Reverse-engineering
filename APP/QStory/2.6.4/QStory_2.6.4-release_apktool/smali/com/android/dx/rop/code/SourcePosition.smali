.class public final Lcom/android/dx/rop/code/SourcePosition;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final NO_INFO:Lcom/android/dx/rop/code/SourcePosition;


# instance fields
.field private final address:I

.field private final line:I

.field private final sourceFile:Lcom/android/dx/rop/cst/CstString;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/SourcePosition;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, -0x1

    .line 5
    invoke-direct {v0, v1, v2, v2}, Lcom/android/dx/rop/code/SourcePosition;-><init>(Lcom/android/dx/rop/cst/CstString;II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/android/dx/rop/code/SourcePosition;->NO_INFO:Lcom/android/dx/rop/code/SourcePosition;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lcom/android/dx/rop/cst/CstString;II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    if-lt p2, v0, :cond_1

    .line 6
    .line 7
    if-lt p3, v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lcom/android/dx/rop/code/SourcePosition;->sourceFile:Lcom/android/dx/rop/cst/CstString;

    .line 10
    .line 11
    iput p2, p0, Lcom/android/dx/rop/code/SourcePosition;->address:I

    .line 12
    .line 13
    iput p3, p0, Lcom/android/dx/rop/code/SourcePosition;->line:I

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const-string p0, "line < -1"

    .line 17
    .line 18
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    throw p0

    .line 23
    :cond_1
    const-string p0, "address < -1"

    .line 24
    .line 25
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    throw p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/android/dx/rop/code/SourcePosition;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    if-ne p0, p1, :cond_1

    .line 9
    .line 10
    return v0

    .line 11
    :cond_1
    check-cast p1, Lcom/android/dx/rop/code/SourcePosition;

    .line 12
    .line 13
    iget v2, p0, Lcom/android/dx/rop/code/SourcePosition;->address:I

    .line 14
    .line 15
    iget v3, p1, Lcom/android/dx/rop/code/SourcePosition;->address:I

    .line 16
    .line 17
    if-ne v2, v3, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/code/SourcePosition;->sameLineAndFile(Lcom/android/dx/rop/code/SourcePosition;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    return v0

    .line 26
    :cond_2
    return v1
.end method

.method public getAddress()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/rop/code/SourcePosition;->address:I

    .line 2
    .line 3
    return p0
.end method

.method public getLine()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/rop/code/SourcePosition;->line:I

    .line 2
    .line 3
    return p0
.end method

.method public getSourceFile()Lcom/android/dx/rop/cst/CstString;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/SourcePosition;->sourceFile:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/SourcePosition;->sourceFile:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstString;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lcom/android/dx/rop/code/SourcePosition;->address:I

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    iget p0, p0, Lcom/android/dx/rop/code/SourcePosition;->line:I

    .line 11
    .line 12
    add-int/2addr v0, p0

    .line 13
    return v0
.end method

.method public sameLine(Lcom/android/dx/rop/code/SourcePosition;)Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/rop/code/SourcePosition;->line:I

    .line 2
    .line 3
    iget p1, p1, Lcom/android/dx/rop/code/SourcePosition;->line:I

    .line 4
    .line 5
    if-ne p0, p1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public sameLineAndFile(Lcom/android/dx/rop/code/SourcePosition;)Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/rop/code/SourcePosition;->line:I

    .line 2
    .line 3
    iget v1, p1, Lcom/android/dx/rop/code/SourcePosition;->line:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Lcom/android/dx/rop/code/SourcePosition;->sourceFile:Lcom/android/dx/rop/cst/CstString;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/android/dx/rop/code/SourcePosition;->sourceFile:Lcom/android/dx/rop/cst/CstString;

    .line 10
    .line 11
    if-eq p0, p1, :cond_0

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/cst/CstString;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    :cond_0
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x32

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/android/dx/rop/code/SourcePosition;->sourceFile:Lcom/android/dx/rop/cst/CstString;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, ":"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    :cond_0
    iget v1, p0, Lcom/android/dx/rop/code/SourcePosition;->line:I

    .line 25
    .line 26
    if-ltz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    :cond_1
    const/16 v1, 0x40

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget p0, p0, Lcom/android/dx/rop/code/SourcePosition;->address:I

    .line 37
    .line 38
    if-gez p0, :cond_2

    .line 39
    .line 40
    const-string p0, "????"

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-static {p0}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method
