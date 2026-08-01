.class public Lcom/android/dx/util/LabeledList;
.super Lcom/android/dx/util/FixedSizeList;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final labelToIndex:Lcom/android/dx/util/IntList;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 36
    invoke-direct {p0, p1}, Lcom/android/dx/util/FixedSizeList;-><init>(I)V

    .line 37
    new-instance v0, Lcom/android/dx/util/IntList;

    invoke-direct {v0, p1}, Lcom/android/dx/util/IntList;-><init>(I)V

    iput-object v0, p0, Lcom/android/dx/util/LabeledList;->labelToIndex:Lcom/android/dx/util/IntList;

    return-void
.end method

.method public constructor <init>(Lcom/android/dx/util/LabeledList;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, v0}, Lcom/android/dx/util/FixedSizeList;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, Lcom/android/dx/util/LabeledList;->labelToIndex:Lcom/android/dx/util/IntList;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->mutableCopy()Lcom/android/dx/util/IntList;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lcom/android/dx/util/LabeledList;->labelToIndex:Lcom/android/dx/util/IntList;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    :goto_0
    if-ge v1, v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0, v1, v2}, Lcom/android/dx/util/FixedSizeList;->set0(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void
.end method

.method private addLabelIndex(II)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/util/LabeledList;->labelToIndex:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    sub-int v2, p1, v0

    .line 9
    .line 10
    iget-object v3, p0, Lcom/android/dx/util/LabeledList;->labelToIndex:Lcom/android/dx/util/IntList;

    .line 11
    .line 12
    if-gt v1, v2, :cond_0

    .line 13
    .line 14
    const/4 v2, -0x1

    .line 15
    invoke-virtual {v3, v2}, Lcom/android/dx/util/IntList;->add(I)V

    .line 16
    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v3, p1, p2}, Lcom/android/dx/util/IntList;->set(II)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private rebuildLabelToIndex()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Lcom/android/dx/util/LabeledItem;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v3, p0, Lcom/android/dx/util/LabeledList;->labelToIndex:Lcom/android/dx/util/IntList;

    .line 17
    .line 18
    invoke-interface {v2}, Lcom/android/dx/util/LabeledItem;->getLabel()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {v3, v2, v1}, Lcom/android/dx/util/IntList;->set(II)V

    .line 23
    .line 24
    .line 25
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return-void
.end method

.method private removeLabel(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/android/dx/util/LabeledList;->labelToIndex:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/android/dx/util/IntList;->set(II)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final getLabelsInOrder()[I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v1, v0, [I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Lcom/android/dx/util/LabeledItem;

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    invoke-interface {v3}, Lcom/android/dx/util/LabeledItem;->getLabel()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    aput v3, v1, v2

    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string p0, "null at index "

    .line 28
    .line 29
    invoke-static {v2, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return-object p0

    .line 38
    :cond_1
    invoke-static {v1}, Ljava/util/Arrays;->sort([I)V

    .line 39
    .line 40
    .line 41
    return-object v1
.end method

.method public final getMaxLabel()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/util/LabeledList;->labelToIndex:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/android/dx/util/LabeledList;->labelToIndex:Lcom/android/dx/util/IntList;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lcom/android/dx/util/IntList;->get(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-gez v1, :cond_0

    .line 18
    .line 19
    add-int/lit8 v0, v0, -0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    iget-object p0, p0, Lcom/android/dx/util/LabeledList;->labelToIndex:Lcom/android/dx/util/IntList;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/android/dx/util/IntList;->shrink(I)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method public final indexOfLabel(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/util/LabeledList;->labelToIndex:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lt p1, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, -0x1

    .line 10
    return p0

    .line 11
    :cond_0
    iget-object p0, p0, Lcom/android/dx/util/LabeledList;->labelToIndex:Lcom/android/dx/util/IntList;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/android/dx/util/IntList;->get(I)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public set(ILcom/android/dx/util/LabeledItem;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/util/FixedSizeList;->getOrNull0(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/android/dx/util/LabeledItem;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/util/FixedSizeList;->set0(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Lcom/android/dx/util/LabeledItem;->getLabel()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-direct {p0, v0}, Lcom/android/dx/util/LabeledList;->removeLabel(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    if-eqz p2, :cond_1

    .line 20
    .line 21
    invoke-interface {p2}, Lcom/android/dx/util/LabeledItem;->getLabel()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    invoke-direct {p0, p2, p1}, Lcom/android/dx/util/LabeledList;->addLabelIndex(II)V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public shrinkToFit()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/android/dx/util/FixedSizeList;->shrinkToFit()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/android/dx/util/LabeledList;->rebuildLabelToIndex()V

    .line 5
    .line 6
    .line 7
    return-void
.end method
