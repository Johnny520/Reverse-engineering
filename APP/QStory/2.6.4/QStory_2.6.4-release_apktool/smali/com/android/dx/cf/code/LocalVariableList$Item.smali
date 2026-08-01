.class public Lcom/android/dx/cf/code/LocalVariableList$Item;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/cf/code/LocalVariableList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Item"
.end annotation


# instance fields
.field private final descriptor:Lcom/android/dx/rop/cst/CstString;

.field private final index:I

.field private final length:I

.field private final name:Lcom/android/dx/rop/cst/CstString;

.field private final signature:Lcom/android/dx/rop/cst/CstString;

.field private final startPc:I


# direct methods
.method public constructor <init>(IILcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-ltz p1, :cond_5

    .line 6
    .line 7
    if-ltz p2, :cond_4

    .line 8
    .line 9
    if-eqz p3, :cond_3

    .line 10
    .line 11
    if-nez p4, :cond_1

    .line 12
    .line 13
    if-eqz p5, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p0, "(descriptor == null) && (signature == null)"

    .line 17
    .line 18
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :cond_1
    :goto_0
    if-ltz p6, :cond_2

    .line 23
    .line 24
    iput p1, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->startPc:I

    .line 25
    .line 26
    iput p2, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->length:I

    .line 27
    .line 28
    iput-object p3, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->name:Lcom/android/dx/rop/cst/CstString;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->descriptor:Lcom/android/dx/rop/cst/CstString;

    .line 31
    .line 32
    iput-object p5, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->signature:Lcom/android/dx/rop/cst/CstString;

    .line 33
    .line 34
    iput p6, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->index:I

    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    const-string p0, "index < 0"

    .line 38
    .line 39
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :cond_3
    const-string p0, "name == null"

    .line 44
    .line 45
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_4
    const-string p0, "length < 0"

    .line 50
    .line 51
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0

    .line 55
    :cond_5
    const-string p0, "startPc < 0"

    .line 56
    .line 57
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0
.end method

.method public static synthetic access$000(Lcom/android/dx/cf/code/LocalVariableList$Item;)Lcom/android/dx/rop/cst/CstString;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/code/LocalVariableList$Item;->getSignature()Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private getSignature()Lcom/android/dx/rop/cst/CstString;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->signature:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public getDescriptor()Lcom/android/dx/rop/cst/CstString;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->descriptor:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    return-object p0
.end method

.method public getIndex()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->index:I

    .line 2
    .line 3
    return p0
.end method

.method public getLength()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->length:I

    .line 2
    .line 3
    return p0
.end method

.method public getLocalItem()Lcom/android/dx/rop/code/LocalItem;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->name:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->signature:Lcom/android/dx/rop/cst/CstString;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lcom/android/dx/rop/code/LocalItem;->make(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;)Lcom/android/dx/rop/code/LocalItem;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getStartPc()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->startPc:I

    .line 2
    .line 3
    return p0
.end method

.method public getType()Lcom/android/dx/rop/type/Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->descriptor:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lcom/android/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/android/dx/rop/type/Type;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public matchesAllButType(Lcom/android/dx/cf/code/LocalVariableList$Item;)Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->startPc:I

    .line 2
    .line 3
    iget v1, p1, Lcom/android/dx/cf/code/LocalVariableList$Item;->startPc:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->length:I

    .line 8
    .line 9
    iget v1, p1, Lcom/android/dx/cf/code/LocalVariableList$Item;->length:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget v0, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->index:I

    .line 14
    .line 15
    iget v1, p1, Lcom/android/dx/cf/code/LocalVariableList$Item;->index:I

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    iget-object p0, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->name:Lcom/android/dx/rop/cst/CstString;

    .line 20
    .line 21
    iget-object p1, p1, Lcom/android/dx/cf/code/LocalVariableList$Item;->name:Lcom/android/dx/rop/cst/CstString;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/cst/CstString;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public matchesPcAndIndex(II)Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->index:I

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    iget p2, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->startPc:I

    .line 6
    .line 7
    if-lt p1, p2, :cond_0

    .line 8
    .line 9
    iget p0, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->length:I

    .line 10
    .line 11
    add-int/2addr p2, p0

    .line 12
    if-ge p1, p2, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public withSignature(Lcom/android/dx/rop/cst/CstString;)Lcom/android/dx/cf/code/LocalVariableList$Item;
    .locals 7

    .line 1
    new-instance v0, Lcom/android/dx/cf/code/LocalVariableList$Item;

    .line 2
    .line 3
    iget v1, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->startPc:I

    .line 4
    .line 5
    iget v2, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->length:I

    .line 6
    .line 7
    iget-object v3, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->name:Lcom/android/dx/rop/cst/CstString;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->descriptor:Lcom/android/dx/rop/cst/CstString;

    .line 10
    .line 11
    iget v6, p0, Lcom/android/dx/cf/code/LocalVariableList$Item;->index:I

    .line 12
    .line 13
    move-object v5, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/android/dx/cf/code/LocalVariableList$Item;-><init>(IILcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;I)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method
