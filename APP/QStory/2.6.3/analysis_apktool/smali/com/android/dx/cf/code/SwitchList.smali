.class public final Lcom/android/dx/cf/code/SwitchList;
.super Lcom/android/dx/util/MutabilityControl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private size:I

.field private final targets:Lcom/android/dx/util/IntList;

.field private final values:Lcom/android/dx/util/IntList;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/android/dx/util/MutabilityControl;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lcom/android/dx/util/IntList;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lcom/android/dx/util/IntList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/android/dx/cf/code/SwitchList;->values:Lcom/android/dx/util/IntList;

    .line 11
    .line 12
    new-instance v0, Lcom/android/dx/util/IntList;

    .line 13
    .line 14
    add-int/lit8 v1, p1, 0x1

    .line 15
    .line 16
    invoke-direct {v0, v1}, Lcom/android/dx/util/IntList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/android/dx/cf/code/SwitchList;->targets:Lcom/android/dx/util/IntList;

    .line 20
    .line 21
    iput p1, p0, Lcom/android/dx/cf/code/SwitchList;->size:I

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public add(II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    if-ltz p2, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/android/dx/cf/code/SwitchList;->values:Lcom/android/dx/util/IntList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/android/dx/util/IntList;->add(I)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lcom/android/dx/cf/code/SwitchList;->targets:Lcom/android/dx/util/IntList;

    .line 12
    .line 13
    invoke-virtual {p0, p2}, Lcom/android/dx/util/IntList;->add(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "target < 0"

    .line 18
    .line 19
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public getDefaultTarget()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/SwitchList;->targets:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    iget p0, p0, Lcom/android/dx/cf/code/SwitchList;->size:I

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/android/dx/util/IntList;->get(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public getTarget(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/SwitchList;->targets:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/android/dx/util/IntList;->get(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getTargets()Lcom/android/dx/util/IntList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/SwitchList;->targets:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getValue(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/SwitchList;->values:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/android/dx/util/IntList;->get(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getValues()Lcom/android/dx/util/IntList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/SwitchList;->values:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    return-object p0
.end method

.method public removeSuperfluousDefaults()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/android/dx/cf/code/SwitchList;->size:I

    .line 5
    .line 6
    iget-object v1, p0, Lcom/android/dx/cf/code/SwitchList;->targets:Lcom/android/dx/util/IntList;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/android/dx/util/IntList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    add-int/lit8 v1, v1, -0x1

    .line 13
    .line 14
    if-ne v0, v1, :cond_4

    .line 15
    .line 16
    iget-object v1, p0, Lcom/android/dx/cf/code/SwitchList;->targets:Lcom/android/dx/util/IntList;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lcom/android/dx/util/IntList;->get(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x0

    .line 23
    move v3, v2

    .line 24
    :goto_0
    if-ge v2, v0, :cond_2

    .line 25
    .line 26
    iget-object v4, p0, Lcom/android/dx/cf/code/SwitchList;->targets:Lcom/android/dx/util/IntList;

    .line 27
    .line 28
    invoke-virtual {v4, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eq v4, v1, :cond_1

    .line 33
    .line 34
    if-eq v2, v3, :cond_0

    .line 35
    .line 36
    iget-object v5, p0, Lcom/android/dx/cf/code/SwitchList;->targets:Lcom/android/dx/util/IntList;

    .line 37
    .line 38
    invoke-virtual {v5, v3, v4}, Lcom/android/dx/util/IntList;->set(II)V

    .line 39
    .line 40
    .line 41
    iget-object v4, p0, Lcom/android/dx/cf/code/SwitchList;->values:Lcom/android/dx/util/IntList;

    .line 42
    .line 43
    invoke-virtual {v4, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    invoke-virtual {v4, v3, v5}, Lcom/android/dx/util/IntList;->set(II)V

    .line 48
    .line 49
    .line 50
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    if-eq v3, v0, :cond_3

    .line 56
    .line 57
    iget-object v0, p0, Lcom/android/dx/cf/code/SwitchList;->values:Lcom/android/dx/util/IntList;

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Lcom/android/dx/util/IntList;->shrink(I)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/android/dx/cf/code/SwitchList;->targets:Lcom/android/dx/util/IntList;

    .line 63
    .line 64
    invoke-virtual {v0, v3, v1}, Lcom/android/dx/util/IntList;->set(II)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/android/dx/cf/code/SwitchList;->targets:Lcom/android/dx/util/IntList;

    .line 68
    .line 69
    add-int/lit8 v1, v3, 0x1

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Lcom/android/dx/util/IntList;->shrink(I)V

    .line 72
    .line 73
    .line 74
    iput v3, p0, Lcom/android/dx/cf/code/SwitchList;->size:I

    .line 75
    .line 76
    :cond_3
    return-void

    .line 77
    :cond_4
    const-string p0, "incomplete instance"

    .line 78
    .line 79
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public setDefaultTarget(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/android/dx/cf/code/SwitchList;->targets:Lcom/android/dx/util/IntList;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget v1, p0, Lcom/android/dx/cf/code/SwitchList;->size:I

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lcom/android/dx/cf/code/SwitchList;->targets:Lcom/android/dx/util/IntList;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/android/dx/util/IntList;->add(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p0, "non-default elements not all set"

    .line 23
    .line 24
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    const-string p0, "target < 0"

    .line 29
    .line 30
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public setImmutable()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/SwitchList;->values:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/android/dx/cf/code/SwitchList;->targets:Lcom/android/dx/util/IntList;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 9
    .line 10
    .line 11
    invoke-super {p0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public size()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/SwitchList;->size:I

    .line 2
    .line 3
    return p0
.end method
