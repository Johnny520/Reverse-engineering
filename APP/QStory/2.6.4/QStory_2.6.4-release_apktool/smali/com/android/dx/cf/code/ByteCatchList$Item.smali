.class public Lcom/android/dx/cf/code/ByteCatchList$Item;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/cf/code/ByteCatchList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Item"
.end annotation


# instance fields
.field private final endPc:I

.field private final exceptionClass:Lcom/android/dx/rop/cst/CstType;

.field private final handlerPc:I

.field private final startPc:I


# direct methods
.method public constructor <init>(IIILcom/android/dx/rop/cst/CstType;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_2

    .line 5
    .line 6
    if-lt p2, p1, :cond_1

    .line 7
    .line 8
    if-ltz p3, :cond_0

    .line 9
    .line 10
    iput p1, p0, Lcom/android/dx/cf/code/ByteCatchList$Item;->startPc:I

    .line 11
    .line 12
    iput p2, p0, Lcom/android/dx/cf/code/ByteCatchList$Item;->endPc:I

    .line 13
    .line 14
    iput p3, p0, Lcom/android/dx/cf/code/ByteCatchList$Item;->handlerPc:I

    .line 15
    .line 16
    iput-object p4, p0, Lcom/android/dx/cf/code/ByteCatchList$Item;->exceptionClass:Lcom/android/dx/rop/cst/CstType;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "handlerPc < 0"

    .line 20
    .line 21
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    throw p0

    .line 26
    :cond_1
    const-string p0, "endPc < startPc"

    .line 27
    .line 28
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    throw p0

    .line 33
    :cond_2
    const-string p0, "startPc < 0"

    .line 34
    .line 35
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    throw p0
.end method


# virtual methods
.method public covers(I)Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/cf/code/ByteCatchList$Item;->startPc:I

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    iget p0, p0, Lcom/android/dx/cf/code/ByteCatchList$Item;->endPc:I

    .line 6
    .line 7
    if-ge p1, p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public getEndPc()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/ByteCatchList$Item;->endPc:I

    .line 2
    .line 3
    return p0
.end method

.method public getExceptionClass()Lcom/android/dx/rop/cst/CstType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/ByteCatchList$Item;->exceptionClass:Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    sget-object p0, Lcom/android/dx/rop/cst/CstType;->OBJECT:Lcom/android/dx/rop/cst/CstType;

    .line 7
    .line 8
    return-object p0
.end method

.method public getHandlerPc()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/ByteCatchList$Item;->handlerPc:I

    .line 2
    .line 3
    return p0
.end method

.method public getStartPc()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/ByteCatchList$Item;->startPc:I

    .line 2
    .line 3
    return p0
.end method
