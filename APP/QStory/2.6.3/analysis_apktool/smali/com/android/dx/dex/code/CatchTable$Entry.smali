.class public Lcom/android/dx/dex/code/CatchTable$Entry;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/dex/code/CatchTable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Entry"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/android/dx/dex/code/CatchTable$Entry;",
        ">;"
    }
.end annotation


# instance fields
.field private final end:I

.field private final handlers:Lcom/android/dx/dex/code/CatchHandlerList;

.field private final start:I


# direct methods
.method public constructor <init>(IILcom/android/dx/dex/code/CatchHandlerList;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-ltz p1, :cond_2

    .line 6
    .line 7
    if-le p2, p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p3}, Lcom/android/dx/util/MutabilityControl;->isMutable()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iput p1, p0, Lcom/android/dx/dex/code/CatchTable$Entry;->start:I

    .line 16
    .line 17
    iput p2, p0, Lcom/android/dx/dex/code/CatchTable$Entry;->end:I

    .line 18
    .line 19
    iput-object p3, p0, Lcom/android/dx/dex/code/CatchTable$Entry;->handlers:Lcom/android/dx/dex/code/CatchHandlerList;

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p0, "handlers.isMutable()"

    .line 23
    .line 24
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_1
    const-string p0, "end <= start"

    .line 29
    .line 30
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :cond_2
    const-string p0, "start < 0"

    .line 35
    .line 36
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0
.end method


# virtual methods
.method public compareTo(Lcom/android/dx/dex/code/CatchTable$Entry;)I
    .locals 4

    .line 1
    iget v0, p0, Lcom/android/dx/dex/code/CatchTable$Entry;->start:I

    .line 2
    .line 3
    iget v1, p1, Lcom/android/dx/dex/code/CatchTable$Entry;->start:I

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    const/4 v3, 0x1

    .line 10
    if-le v0, v1, :cond_1

    .line 11
    .line 12
    return v3

    .line 13
    :cond_1
    iget v0, p0, Lcom/android/dx/dex/code/CatchTable$Entry;->end:I

    .line 14
    .line 15
    iget v1, p1, Lcom/android/dx/dex/code/CatchTable$Entry;->end:I

    .line 16
    .line 17
    if-ge v0, v1, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    if-le v0, v1, :cond_3

    .line 21
    .line 22
    return v3

    .line 23
    :cond_3
    iget-object p0, p0, Lcom/android/dx/dex/code/CatchTable$Entry;->handlers:Lcom/android/dx/dex/code/CatchHandlerList;

    .line 24
    .line 25
    iget-object p1, p1, Lcom/android/dx/dex/code/CatchTable$Entry;->handlers:Lcom/android/dx/dex/code/CatchHandlerList;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/CatchHandlerList;->compareTo(Lcom/android/dx/dex/code/CatchHandlerList;)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 32
    check-cast p1, Lcom/android/dx/dex/code/CatchTable$Entry;

    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/CatchTable$Entry;->compareTo(Lcom/android/dx/dex/code/CatchTable$Entry;)I

    move-result p0

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/android/dx/dex/code/CatchTable$Entry;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lcom/android/dx/dex/code/CatchTable$Entry;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/CatchTable$Entry;->compareTo(Lcom/android/dx/dex/code/CatchTable$Entry;)I

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

.method public getEnd()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/code/CatchTable$Entry;->end:I

    .line 2
    .line 3
    return p0
.end method

.method public getHandlers()Lcom/android/dx/dex/code/CatchHandlerList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/CatchTable$Entry;->handlers:Lcom/android/dx/dex/code/CatchHandlerList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getStart()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/code/CatchTable$Entry;->start:I

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/dex/code/CatchTable$Entry;->start:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget v1, p0, Lcom/android/dx/dex/code/CatchTable$Entry;->end:I

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    mul-int/lit8 v0, v0, 0x1f

    .line 9
    .line 10
    iget-object p0, p0, Lcom/android/dx/dex/code/CatchTable$Entry;->handlers:Lcom/android/dx/dex/code/CatchHandlerList;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    add-int/2addr p0, v0

    .line 17
    return p0
.end method
