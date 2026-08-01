.class public Lcom/android/dx/ssa/BasicRegisterMapper;
.super Lcom/android/dx/ssa/RegisterMapper;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final oldToNew:Lcom/android/dx/util/IntList;

.field private runningCountNewRegisters:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/android/dx/ssa/RegisterMapper;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/android/dx/util/IntList;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lcom/android/dx/util/IntList;-><init>(I)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->oldToNew:Lcom/android/dx/util/IntList;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public addMapping(III)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->oldToNew:Lcom/android/dx/util/IntList;

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
    iget-object v0, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->oldToNew:Lcom/android/dx/util/IntList;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sub-int v0, p1, v0

    .line 16
    .line 17
    :goto_0
    if-ltz v0, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->oldToNew:Lcom/android/dx/util/IntList;

    .line 20
    .line 21
    const/4 v2, -0x1

    .line 22
    invoke-virtual {v1, v2}, Lcom/android/dx/util/IntList;->add(I)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v0, v0, -0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v0, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->oldToNew:Lcom/android/dx/util/IntList;

    .line 29
    .line 30
    invoke-virtual {v0, p1, p2}, Lcom/android/dx/util/IntList;->set(II)V

    .line 31
    .line 32
    .line 33
    iget p1, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->runningCountNewRegisters:I

    .line 34
    .line 35
    add-int/2addr p2, p3

    .line 36
    if-ge p1, p2, :cond_1

    .line 37
    .line 38
    iput p2, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->runningCountNewRegisters:I

    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public getNewRegisterCount()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->runningCountNewRegisters:I

    .line 2
    .line 3
    return p0
.end method

.method public map(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpec;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    :try_start_0
    iget-object p0, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->oldToNew:Lcom/android/dx/util/IntList;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p0, v1}, Lcom/android/dx/util/IntList;->get(I)I

    .line 12
    .line 13
    .line 14
    move-result p0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    goto :goto_0

    .line 16
    :catch_0
    const/4 p0, -0x1

    .line 17
    :goto_0
    if-ltz p0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Lcom/android/dx/rop/code/RegisterSpec;->withReg(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_1
    const-string p0, "no mapping specified for register"

    .line 25
    .line 26
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public oldToNew(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->oldToNew:Lcom/android/dx/util/IntList;

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
    iget-object p0, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->oldToNew:Lcom/android/dx/util/IntList;

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

.method public toHuman()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Old\tNew\n"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->oldToNew:Lcom/android/dx/util/IntList;

    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/android/dx/util/IntList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    const/16 v3, 0xa

    .line 16
    .line 17
    if-ge v2, v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const/16 v4, 0x9

    .line 23
    .line 24
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object v4, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->oldToNew:Lcom/android/dx/util/IntList;

    .line 28
    .line 29
    invoke-virtual {v4, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const-string v1, "new reg count:"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget p0, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->runningCountNewRegisters:I

    .line 48
    .line 49
    invoke-static {v0, p0, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method
