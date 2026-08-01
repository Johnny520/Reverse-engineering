.class public abstract Lcom/android/dx/dex/file/OffsettedItem;
.super Lcom/android/dx/dex/file/Item;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/android/dx/dex/file/Item;",
        "Ljava/lang/Comparable<",
        "Lcom/android/dx/dex/file/OffsettedItem;",
        ">;"
    }
.end annotation


# instance fields
.field private addedTo:Lcom/android/dx/dex/file/Section;

.field private final alignment:I

.field private offset:I

.field private writeSize:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/android/dx/dex/file/Item;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/android/dx/dex/file/Section;->validateAlignment(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    if-lt p2, v0, :cond_0

    .line 9
    .line 10
    iput p1, p0, Lcom/android/dx/dex/file/OffsettedItem;->alignment:I

    .line 11
    .line 12
    iput p2, p0, Lcom/android/dx/dex/file/OffsettedItem;->writeSize:I

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput-object p1, p0, Lcom/android/dx/dex/file/OffsettedItem;->addedTo:Lcom/android/dx/dex/file/Section;

    .line 16
    .line 17
    iput v0, p0, Lcom/android/dx/dex/file/OffsettedItem;->offset:I

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p0, "writeSize < -1"

    .line 21
    .line 22
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    throw p0
.end method

.method public static getAbsoluteOffsetOr0(Lcom/android/dx/dex/file/OffsettedItem;)I
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/dex/file/OffsettedItem;->getAbsoluteOffset()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method


# virtual methods
.method public final compareTo(Lcom/android/dx/dex/file/OffsettedItem;)I
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Item;->itemType()Lcom/android/dx/dex/file/ItemType;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Lcom/android/dx/dex/file/Item;->itemType()Lcom/android/dx/dex/file/ItemType;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_1
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/OffsettedItem;->compareTo0(Lcom/android/dx/dex/file/OffsettedItem;)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 25
    check-cast p1, Lcom/android/dx/dex/file/OffsettedItem;

    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/OffsettedItem;->compareTo(Lcom/android/dx/dex/file/OffsettedItem;)I

    move-result p0

    return p0
.end method

.method public compareTo0(Lcom/android/dx/dex/file/OffsettedItem;)I
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "unsupported"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    check-cast p1, Lcom/android/dx/dex/file/OffsettedItem;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Item;->itemType()Lcom/android/dx/dex/file/ItemType;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p1}, Lcom/android/dx/dex/file/Item;->itemType()Lcom/android/dx/dex/file/ItemType;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eq v1, v2, :cond_1

    .line 17
    .line 18
    return v3

    .line 19
    :cond_1
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/OffsettedItem;->compareTo0(Lcom/android/dx/dex/file/OffsettedItem;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_2

    .line 24
    .line 25
    return v0

    .line 26
    :cond_2
    return v3
.end method

.method public final getAbsoluteOffset()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/dex/file/OffsettedItem;->offset:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/android/dx/dex/file/OffsettedItem;->addedTo:Lcom/android/dx/dex/file/Section;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/android/dx/dex/file/Section;->getAbsoluteOffset(I)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const-string p0, "offset not yet known"

    .line 13
    .line 14
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final getAlignment()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/file/OffsettedItem;->alignment:I

    .line 2
    .line 3
    return p0
.end method

.method public final getRelativeOffset()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/file/OffsettedItem;->offset:I

    .line 2
    .line 3
    if-ltz p0, :cond_0

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    const-string p0, "offset not yet known"

    .line 7
    .line 8
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final offsetString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/android/dx/dex/file/OffsettedItem;->getAbsoluteOffset()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const/16 p0, 0x5d

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public final place(Lcom/android/dx/dex/file/Section;I)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    if-ltz p2, :cond_1

    .line 5
    .line 6
    iget-object v1, p0, Lcom/android/dx/dex/file/OffsettedItem;->addedTo:Lcom/android/dx/dex/file/Section;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lcom/android/dx/dex/file/OffsettedItem;->alignment:I

    .line 11
    .line 12
    add-int/lit8 v0, v0, -0x1

    .line 13
    .line 14
    add-int/2addr p2, v0

    .line 15
    not-int v0, v0

    .line 16
    and-int/2addr p2, v0

    .line 17
    iput-object p1, p0, Lcom/android/dx/dex/file/OffsettedItem;->addedTo:Lcom/android/dx/dex/file/Section;

    .line 18
    .line 19
    iput p2, p0, Lcom/android/dx/dex/file/OffsettedItem;->offset:I

    .line 20
    .line 21
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/dex/file/OffsettedItem;->place0(Lcom/android/dx/dex/file/Section;I)V

    .line 22
    .line 23
    .line 24
    return p2

    .line 25
    :cond_0
    const-string p0, "already written"

    .line 26
    .line 27
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return v0

    .line 31
    :cond_1
    const-string p0, "offset < 0"

    .line 32
    .line 33
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return v0

    .line 37
    :cond_2
    const-string p0, "addedTo == null"

    .line 38
    .line 39
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return v0
.end method

.method public place0(Lcom/android/dx/dex/file/Section;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setWriteSize(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lcom/android/dx/dex/file/OffsettedItem;->writeSize:I

    .line 4
    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lcom/android/dx/dex/file/OffsettedItem;->writeSize:I

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p0, "writeSize already set"

    .line 11
    .line 12
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    const-string p0, "writeSize < 0"

    .line 17
    .line 18
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public abstract toHuman()Ljava/lang/String;
.end method

.method public final writeSize()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/file/OffsettedItem;->writeSize:I

    .line 2
    .line 3
    if-ltz p0, :cond_0

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    const-string p0, "writeSize is unknown"

    .line 7
    .line 8
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final writeTo(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/dex/file/OffsettedItem;->alignment:I

    .line 2
    .line 3
    invoke-interface {p2, v0}, Lcom/android/dx/util/Output;->alignTo(I)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget v0, p0, Lcom/android/dx/dex/file/OffsettedItem;->writeSize:I

    .line 7
    .line 8
    if-ltz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/android/dx/dex/file/OffsettedItem;->getAbsoluteOffset()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-interface {p2, v0}, Lcom/android/dx/util/Output;->assertCursor(I)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/dex/file/OffsettedItem;->writeTo0(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 24
    .line 25
    const-string p2, "writeSize is unknown"

    .line 26
    .line 27
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 31
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v0, "...while writing "

    .line 34
    .line 35
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p1, p0}, Lcom/android/dex/util/ExceptionWithContext;->withContext(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/android/dex/util/ExceptionWithContext;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    throw p0
.end method

.method public abstract writeTo0(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V
.end method
