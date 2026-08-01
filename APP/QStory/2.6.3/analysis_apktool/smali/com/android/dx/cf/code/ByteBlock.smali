.class public final Lcom/android/dx/cf/code/ByteBlock;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/android/dx/util/LabeledItem;


# instance fields
.field private final catches:Lcom/android/dx/cf/code/ByteCatchList;

.field private final end:I

.field private final label:I

.field private final start:I

.field private final successors:Lcom/android/dx/util/IntList;


# direct methods
.method public constructor <init>(IIILcom/android/dx/util/IntList;Lcom/android/dx/cf/code/ByteCatchList;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-ltz p1, :cond_6

    .line 6
    .line 7
    if-ltz p2, :cond_5

    .line 8
    .line 9
    if-le p3, p2, :cond_4

    .line 10
    .line 11
    if-eqz p4, :cond_3

    .line 12
    .line 13
    invoke-virtual {p4}, Lcom/android/dx/util/IntList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p4, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-ltz v3, :cond_0

    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string p0, "successors["

    .line 30
    .line 31
    const-string p1, "] == "

    .line 32
    .line 33
    invoke-static {v2, p0, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p4, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-static {p0, p1}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/StringBuilder;I)V

    .line 42
    .line 43
    .line 44
    throw v0

    .line 45
    :cond_1
    if-eqz p5, :cond_2

    .line 46
    .line 47
    iput p1, p0, Lcom/android/dx/cf/code/ByteBlock;->label:I

    .line 48
    .line 49
    iput p2, p0, Lcom/android/dx/cf/code/ByteBlock;->start:I

    .line 50
    .line 51
    iput p3, p0, Lcom/android/dx/cf/code/ByteBlock;->end:I

    .line 52
    .line 53
    iput-object p4, p0, Lcom/android/dx/cf/code/ByteBlock;->successors:Lcom/android/dx/util/IntList;

    .line 54
    .line 55
    iput-object p5, p0, Lcom/android/dx/cf/code/ByteBlock;->catches:Lcom/android/dx/cf/code/ByteCatchList;

    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    const-string p0, "catches == null"

    .line 59
    .line 60
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_3
    const-string p0, "targets == null"

    .line 65
    .line 66
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :cond_4
    const-string p0, "end <= start"

    .line 71
    .line 72
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v0

    .line 76
    :cond_5
    const-string p0, "start < 0"

    .line 77
    .line 78
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v0

    .line 82
    :cond_6
    const-string p0, "label < 0"

    .line 83
    .line 84
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v0
.end method


# virtual methods
.method public getCatches()Lcom/android/dx/cf/code/ByteCatchList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/ByteBlock;->catches:Lcom/android/dx/cf/code/ByteCatchList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getEnd()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/ByteBlock;->end:I

    .line 2
    .line 3
    return p0
.end method

.method public getLabel()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/ByteBlock;->label:I

    .line 2
    .line 3
    return p0
.end method

.method public getStart()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/ByteBlock;->start:I

    .line 2
    .line 3
    return p0
.end method

.method public getSuccessors()Lcom/android/dx/util/IntList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/ByteBlock;->successors:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/android/dx/cf/code/ByteBlock;->label:I

    .line 9
    .line 10
    invoke-static {v1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ": "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget v1, p0, Lcom/android/dx/cf/code/ByteBlock;->start:I

    .line 23
    .line 24
    invoke-static {v1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ".."

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget p0, p0, Lcom/android/dx/cf/code/ByteBlock;->end:I

    .line 37
    .line 38
    invoke-static {p0}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const/16 p0, 0x7d

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method
