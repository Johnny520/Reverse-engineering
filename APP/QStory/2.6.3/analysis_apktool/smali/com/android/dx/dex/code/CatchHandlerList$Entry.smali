.class public Lcom/android/dx/dex/code/CatchHandlerList$Entry;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/dex/code/CatchHandlerList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Entry"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/android/dx/dex/code/CatchHandlerList$Entry;",
        ">;"
    }
.end annotation


# instance fields
.field private final exceptionType:Lcom/android/dx/rop/cst/CstType;

.field private final handler:I


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstType;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-ltz p2, :cond_1

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iput p2, p0, Lcom/android/dx/dex/code/CatchHandlerList$Entry;->handler:I

    .line 10
    .line 11
    iput-object p1, p0, Lcom/android/dx/dex/code/CatchHandlerList$Entry;->exceptionType:Lcom/android/dx/rop/cst/CstType;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "exceptionType == null"

    .line 15
    .line 16
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v0

    .line 20
    :cond_1
    const-string p0, "handler < 0"

    .line 21
    .line 22
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0
.end method


# virtual methods
.method public compareTo(Lcom/android/dx/dex/code/CatchHandlerList$Entry;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/dex/code/CatchHandlerList$Entry;->handler:I

    .line 2
    .line 3
    iget v1, p1, Lcom/android/dx/dex/code/CatchHandlerList$Entry;->handler:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    const/4 p0, -0x1

    .line 8
    return p0

    .line 9
    :cond_0
    if-le v0, v1, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_1
    iget-object p0, p0, Lcom/android/dx/dex/code/CatchHandlerList$Entry;->exceptionType:Lcom/android/dx/rop/cst/CstType;

    .line 14
    .line 15
    iget-object p1, p1, Lcom/android/dx/dex/code/CatchHandlerList$Entry;->exceptionType:Lcom/android/dx/rop/cst/CstType;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/cst/Constant;->compareTo(Lcom/android/dx/rop/cst/Constant;)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 22
    check-cast p1, Lcom/android/dx/dex/code/CatchHandlerList$Entry;

    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/CatchHandlerList$Entry;->compareTo(Lcom/android/dx/dex/code/CatchHandlerList$Entry;)I

    move-result p0

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/android/dx/dex/code/CatchHandlerList$Entry;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lcom/android/dx/dex/code/CatchHandlerList$Entry;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/CatchHandlerList$Entry;->compareTo(Lcom/android/dx/dex/code/CatchHandlerList$Entry;)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    return v1
.end method

.method public getExceptionType()Lcom/android/dx/rop/cst/CstType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/CatchHandlerList$Entry;->exceptionType:Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    return-object p0
.end method

.method public getHandler()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/code/CatchHandlerList$Entry;->handler:I

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/dex/code/CatchHandlerList$Entry;->handler:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-object p0, p0, Lcom/android/dx/dex/code/CatchHandlerList$Entry;->exceptionType:Lcom/android/dx/rop/cst/CstType;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstType;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    add-int/2addr p0, v0

    .line 12
    return p0
.end method
