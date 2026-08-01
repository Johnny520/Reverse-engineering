.class public abstract Lcom/android/dx/cf/code/BaseMachine;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/android/dx/cf/code/Machine;


# instance fields
.field private argCount:I

.field private args:[Lcom/android/dx/rop/type/TypeBearer;

.field private auxCases:Lcom/android/dx/cf/code/SwitchList;

.field private auxCst:Lcom/android/dx/rop/cst/Constant;

.field private auxInitValues:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/cst/Constant;",
            ">;"
        }
    .end annotation
.end field

.field private auxInt:I

.field private auxTarget:I

.field private auxType:Lcom/android/dx/rop/type/Type;

.field private localIndex:I

.field private localInfo:Z

.field private localTarget:Lcom/android/dx/rop/code/RegisterSpec;

.field private final prototype:Lcom/android/dx/rop/type/Prototype;

.field private resultCount:I

.field private results:[Lcom/android/dx/rop/type/TypeBearer;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/type/Prototype;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lcom/android/dx/cf/code/BaseMachine;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 7
    .line 8
    const/16 p1, 0xa

    .line 9
    .line 10
    new-array p1, p1, [Lcom/android/dx/rop/type/TypeBearer;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/android/dx/cf/code/BaseMachine;->args:[Lcom/android/dx/rop/type/TypeBearer;

    .line 13
    .line 14
    const/4 p1, 0x6

    .line 15
    new-array p1, p1, [Lcom/android/dx/rop/type/TypeBearer;

    .line 16
    .line 17
    iput-object p1, p0, Lcom/android/dx/cf/code/BaseMachine;->results:[Lcom/android/dx/rop/type/TypeBearer;

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->clearArgs()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string p0, "prototype == null"

    .line 24
    .line 25
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    throw p0
.end method

.method public static throwLocalMismatch(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeBearer;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/android/dx/cf/code/SimException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "local variable type mismatch: attempt to set or access a value of type "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Lcom/android/dx/util/ToHuman;->toHuman()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p0, " using a local variable of type "

    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Lcom/android/dx/util/ToHuman;->toHuman()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p0, ". This is symptomatic of .class transformation tools that ignore local variable information."

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {v0, p0}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0
.end method


# virtual methods
.method public final addResult(Lcom/android/dx/rop/type/TypeBearer;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/android/dx/cf/code/BaseMachine;->results:[Lcom/android/dx/rop/type/TypeBearer;

    .line 4
    .line 5
    iget v1, p0, Lcom/android/dx/cf/code/BaseMachine;->resultCount:I

    .line 6
    .line 7
    aput-object p1, v0, v1

    .line 8
    .line 9
    add-int/lit8 v1, v1, 0x1

    .line 10
    .line 11
    iput v1, p0, Lcom/android/dx/cf/code/BaseMachine;->resultCount:I

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "result == null"

    .line 15
    .line 16
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final arg(I)Lcom/android/dx/rop/type/TypeBearer;
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/cf/code/BaseMachine;->argCount:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    iget-object p0, p0, Lcom/android/dx/cf/code/BaseMachine;->args:[Lcom/android/dx/rop/type/TypeBearer;

    .line 6
    .line 7
    aget-object p0, p0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :catch_0
    const-string p0, "n < 0"

    .line 11
    .line 12
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :goto_0
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const-string p0, "n >= argCount"

    .line 18
    .line 19
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0
.end method

.method public final argCount()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/BaseMachine;->argCount:I

    .line 2
    .line 3
    return p0
.end method

.method public final argWidth()I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget v2, p0, Lcom/android/dx/cf/code/BaseMachine;->argCount:I

    .line 4
    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    iget-object v2, p0, Lcom/android/dx/cf/code/BaseMachine;->args:[Lcom/android/dx/rop/type/TypeBearer;

    .line 8
    .line 9
    aget-object v2, v2, v0

    .line 10
    .line 11
    invoke-interface {v2}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Lcom/android/dx/rop/type/Type;->getCategory()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    add-int/2addr v1, v2

    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return v1
.end method

.method public final auxCstArg(Lcom/android/dx/rop/cst/Constant;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/android/dx/cf/code/BaseMachine;->auxCst:Lcom/android/dx/rop/cst/Constant;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "cst == null"

    .line 7
    .line 8
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final auxInitValues(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/cst/Constant;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/android/dx/cf/code/BaseMachine;->auxInitValues:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-void
.end method

.method public final auxIntArg(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/android/dx/cf/code/BaseMachine;->auxInt:I

    .line 2
    .line 3
    return-void
.end method

.method public final auxSwitchArg(Lcom/android/dx/cf/code/SwitchList;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/android/dx/cf/code/BaseMachine;->auxCases:Lcom/android/dx/cf/code/SwitchList;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "cases == null"

    .line 7
    .line 8
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final auxTargetArg(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/android/dx/cf/code/BaseMachine;->auxTarget:I

    .line 2
    .line 3
    return-void
.end method

.method public final auxType(Lcom/android/dx/rop/type/Type;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/cf/code/BaseMachine;->auxType:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    return-void
.end method

.method public final clearArgs()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/android/dx/cf/code/BaseMachine;->argCount:I

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Lcom/android/dx/cf/code/BaseMachine;->auxType:Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    iput v0, p0, Lcom/android/dx/cf/code/BaseMachine;->auxInt:I

    .line 8
    .line 9
    iput-object v1, p0, Lcom/android/dx/cf/code/BaseMachine;->auxCst:Lcom/android/dx/rop/cst/Constant;

    .line 10
    .line 11
    iput v0, p0, Lcom/android/dx/cf/code/BaseMachine;->auxTarget:I

    .line 12
    .line 13
    iput-object v1, p0, Lcom/android/dx/cf/code/BaseMachine;->auxCases:Lcom/android/dx/cf/code/SwitchList;

    .line 14
    .line 15
    iput-object v1, p0, Lcom/android/dx/cf/code/BaseMachine;->auxInitValues:Ljava/util/ArrayList;

    .line 16
    .line 17
    const/4 v2, -0x1

    .line 18
    iput v2, p0, Lcom/android/dx/cf/code/BaseMachine;->localIndex:I

    .line 19
    .line 20
    iput-boolean v0, p0, Lcom/android/dx/cf/code/BaseMachine;->localInfo:Z

    .line 21
    .line 22
    iput-object v1, p0, Lcom/android/dx/cf/code/BaseMachine;->localTarget:Lcom/android/dx/rop/code/RegisterSpec;

    .line 23
    .line 24
    iput v2, p0, Lcom/android/dx/cf/code/BaseMachine;->resultCount:I

    .line 25
    .line 26
    return-void
.end method

.method public final clearResult()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/android/dx/cf/code/BaseMachine;->resultCount:I

    .line 3
    .line 4
    return-void
.end method

.method public final getAuxCases()Lcom/android/dx/cf/code/SwitchList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/BaseMachine;->auxCases:Lcom/android/dx/cf/code/SwitchList;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAuxCst()Lcom/android/dx/rop/cst/Constant;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/BaseMachine;->auxCst:Lcom/android/dx/rop/cst/Constant;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAuxInt()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/BaseMachine;->auxInt:I

    .line 2
    .line 3
    return p0
.end method

.method public final getAuxTarget()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/BaseMachine;->auxTarget:I

    .line 2
    .line 3
    return p0
.end method

.method public final getAuxType()Lcom/android/dx/rop/type/Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/BaseMachine;->auxType:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getInitValues()Ljava/util/ArrayList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/cst/Constant;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/BaseMachine;->auxInitValues:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLocalIndex()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/BaseMachine;->localIndex:I

    .line 2
    .line 3
    return p0
.end method

.method public final getLocalInfo()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/android/dx/cf/code/BaseMachine;->localInfo:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getLocalTarget(Z)Lcom/android/dx/rop/code/RegisterSpec;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/BaseMachine;->localTarget:Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    iget v0, p0, Lcom/android/dx/cf/code/BaseMachine;->resultCount:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eq v0, v2, :cond_2

    .line 11
    .line 12
    new-instance p1, Lcom/android/dx/cf/code/SimException;

    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, "local target with "

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget p0, p0, Lcom/android/dx/cf/code/BaseMachine;->resultCount:I

    .line 22
    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    const-string p0, "no"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const-string p0, "multiple"

    .line 29
    .line 30
    :goto_0
    const-string v1, " results"

    .line 31
    .line 32
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-direct {p1, p0}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_2
    iget-object v0, p0, Lcom/android/dx/cf/code/BaseMachine;->results:[Lcom/android/dx/rop/type/TypeBearer;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    aget-object v0, v0, v2

    .line 44
    .line 45
    invoke-interface {v0}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object v3, p0, Lcom/android/dx/cf/code/BaseMachine;->localTarget:Lcom/android/dx/rop/code/RegisterSpec;

    .line 50
    .line 51
    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getType()Lcom/android/dx/rop/type/Type;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    if-ne v2, v3, :cond_4

    .line 56
    .line 57
    iget-object p0, p0, Lcom/android/dx/cf/code/BaseMachine;->localTarget:Lcom/android/dx/rop/code/RegisterSpec;

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Lcom/android/dx/rop/code/RegisterSpec;->withType(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    :cond_3
    return-object p0

    .line 66
    :cond_4
    invoke-static {v3, v2}, Lcom/android/dx/cf/code/Merger;->isPossiblyAssignableFrom(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeBearer;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-nez p1, :cond_5

    .line 71
    .line 72
    invoke-static {v2, v3}, Lcom/android/dx/cf/code/BaseMachine;->throwLocalMismatch(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeBearer;)V

    .line 73
    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_5
    sget-object p1, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 77
    .line 78
    if-ne v3, p1, :cond_6

    .line 79
    .line 80
    iget-object p1, p0, Lcom/android/dx/cf/code/BaseMachine;->localTarget:Lcom/android/dx/rop/code/RegisterSpec;

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Lcom/android/dx/rop/code/RegisterSpec;->withType(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, p0, Lcom/android/dx/cf/code/BaseMachine;->localTarget:Lcom/android/dx/rop/code/RegisterSpec;

    .line 87
    .line 88
    :cond_6
    iget-object p0, p0, Lcom/android/dx/cf/code/BaseMachine;->localTarget:Lcom/android/dx/rop/code/RegisterSpec;

    .line 89
    .line 90
    return-object p0
.end method

.method public getPrototype()Lcom/android/dx/rop/type/Prototype;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/BaseMachine;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 2
    .line 3
    return-object p0
.end method

.method public final localArg(Lcom/android/dx/cf/code/Frame;I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->clearArgs()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/android/dx/cf/code/BaseMachine;->args:[Lcom/android/dx/rop/type/TypeBearer;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/android/dx/cf/code/Frame;->getLocals()Lcom/android/dx/cf/code/LocalsArray;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1, p2}, Lcom/android/dx/cf/code/LocalsArray;->get(I)Lcom/android/dx/rop/type/TypeBearer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v1, 0x0

    .line 15
    aput-object p1, v0, v1

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput p1, p0, Lcom/android/dx/cf/code/BaseMachine;->argCount:I

    .line 19
    .line 20
    iput p2, p0, Lcom/android/dx/cf/code/BaseMachine;->localIndex:I

    .line 21
    .line 22
    return-void
.end method

.method public final localInfo(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/dx/cf/code/BaseMachine;->localInfo:Z

    .line 2
    .line 3
    return-void
.end method

.method public final localTarget(ILcom/android/dx/rop/type/Type;Lcom/android/dx/rop/code/LocalItem;)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Lcom/android/dx/rop/code/RegisterSpec;->makeLocalOptional(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/android/dx/cf/code/BaseMachine;->localTarget:Lcom/android/dx/rop/code/RegisterSpec;

    .line 6
    .line 7
    return-void
.end method

.method public final popArgs(Lcom/android/dx/cf/code/Frame;I)V
    .locals 3

    .line 120
    invoke-virtual {p1}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    move-result-object p1

    .line 121
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->clearArgs()V

    .line 122
    iget-object v0, p0, Lcom/android/dx/cf/code/BaseMachine;->args:[Lcom/android/dx/rop/type/TypeBearer;

    array-length v0, v0

    if-le p2, v0, :cond_0

    add-int/lit8 v0, p2, 0xa

    .line 123
    new-array v0, v0, [Lcom/android/dx/rop/type/TypeBearer;

    iput-object v0, p0, Lcom/android/dx/cf/code/BaseMachine;->args:[Lcom/android/dx/rop/type/TypeBearer;

    :cond_0
    add-int/lit8 v0, p2, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 124
    iget-object v1, p0, Lcom/android/dx/cf/code/BaseMachine;->args:[Lcom/android/dx/rop/type/TypeBearer;

    invoke-virtual {p1}, Lcom/android/dx/cf/code/ExecutionStack;->pop()Lcom/android/dx/rop/type/TypeBearer;

    move-result-object v2

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 125
    :cond_1
    iput p2, p0, Lcom/android/dx/cf/code/BaseMachine;->argCount:I

    return-void
.end method

.method public popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Prototype;)V
    .locals 3

    .line 99
    invoke-virtual {p2}, Lcom/android/dx/rop/type/Prototype;->getParameterTypes()Lcom/android/dx/rop/type/StdTypeList;

    move-result-object p2

    .line 100
    invoke-virtual {p2}, Lcom/android/dx/util/FixedSizeList;->size()I

    move-result v0

    .line 101
    invoke-virtual {p0, p1, v0}, Lcom/android/dx/cf/code/BaseMachine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    const/4 p1, 0x0

    :goto_0
    if-ge p1, v0, :cond_1

    .line 102
    invoke-virtual {p2, p1}, Lcom/android/dx/rop/type/StdTypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    move-result-object v1

    iget-object v2, p0, Lcom/android/dx/cf/code/BaseMachine;->args:[Lcom/android/dx/rop/type/TypeBearer;

    aget-object v2, v2, p1

    invoke-static {v1, v2}, Lcom/android/dx/cf/code/Merger;->isPossiblyAssignableFrom(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeBearer;)Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 103
    :cond_0
    new-instance v1, Lcom/android/dx/cf/code/SimException;

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, p1

    .line 104
    invoke-virtual {p2, p1}, Lcom/android/dx/rop/type/StdTypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    move-result-object p2

    invoke-virtual {p2}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    move-result-object p2

    iget-object p0, p0, Lcom/android/dx/cf/code/BaseMachine;->args:[Lcom/android/dx/rop/type/TypeBearer;

    aget-object p0, p0, p1

    .line 105
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    move-result-object p0

    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    move-result-object p0

    .line 106
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v2, "at stack depth "

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", expected type "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " but found "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    return-void
.end method

.method public final popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;)V
    .locals 1

    const/4 v0, 0x1

    .line 109
    invoke-virtual {p0, p1, v0}, Lcom/android/dx/cf/code/BaseMachine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 110
    iget-object p1, p0, Lcom/android/dx/cf/code/BaseMachine;->args:[Lcom/android/dx/rop/type/TypeBearer;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-static {p2, p1}, Lcom/android/dx/cf/code/Merger;->isPossiblyAssignableFrom(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeBearer;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 111
    :cond_0
    invoke-virtual {p2}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    move-result-object p1

    iget-object p0, p0, Lcom/android/dx/cf/code/BaseMachine;->args:[Lcom/android/dx/rop/type/TypeBearer;

    aget-object p0, p0, v0

    .line 112
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    move-result-object p0

    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V
    .locals 1

    const/4 v0, 0x2

    .line 113
    invoke-virtual {p0, p1, v0}, Lcom/android/dx/cf/code/BaseMachine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 114
    iget-object p1, p0, Lcom/android/dx/cf/code/BaseMachine;->args:[Lcom/android/dx/rop/type/TypeBearer;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-static {p2, p1}, Lcom/android/dx/cf/code/Merger;->isPossiblyAssignableFrom(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeBearer;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 115
    iget-object p1, p0, Lcom/android/dx/cf/code/BaseMachine;->args:[Lcom/android/dx/rop/type/TypeBearer;

    const/4 p2, 0x1

    aget-object p1, p1, p2

    invoke-static {p3, p1}, Lcom/android/dx/cf/code/Merger;->isPossiblyAssignableFrom(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeBearer;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 116
    :cond_0
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    move-result-object p1

    iget-object p0, p0, Lcom/android/dx/cf/code/BaseMachine;->args:[Lcom/android/dx/rop/type/TypeBearer;

    aget-object p0, p0, p2

    .line 117
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    move-result-object p0

    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 118
    :cond_1
    invoke-virtual {p2}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    move-result-object p1

    iget-object p0, p0, Lcom/android/dx/cf/code/BaseMachine;->args:[Lcom/android/dx/rop/type/TypeBearer;

    aget-object p0, p0, v0

    .line 119
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    move-result-object p0

    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final popArgs(Lcom/android/dx/cf/code/Frame;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/android/dx/cf/code/BaseMachine;->popArgs(Lcom/android/dx/cf/code/Frame;I)V

    .line 3
    .line 4
    .line 5
    iget-object p1, p0, Lcom/android/dx/cf/code/BaseMachine;->args:[Lcom/android/dx/rop/type/TypeBearer;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    aget-object p1, p1, v0

    .line 9
    .line 10
    invoke-static {p2, p1}, Lcom/android/dx/cf/code/Merger;->isPossiblyAssignableFrom(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeBearer;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    iget-object p1, p0, Lcom/android/dx/cf/code/BaseMachine;->args:[Lcom/android/dx/rop/type/TypeBearer;

    .line 17
    .line 18
    const/4 p2, 0x1

    .line 19
    aget-object p1, p1, p2

    .line 20
    .line 21
    invoke-static {p3, p1}, Lcom/android/dx/cf/code/Merger;->isPossiblyAssignableFrom(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeBearer;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, Lcom/android/dx/cf/code/BaseMachine;->args:[Lcom/android/dx/rop/type/TypeBearer;

    .line 28
    .line 29
    const/4 p2, 0x2

    .line 30
    aget-object p1, p1, p2

    .line 31
    .line 32
    invoke-static {p4, p1}, Lcom/android/dx/cf/code/Merger;->isPossiblyAssignableFrom(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeBearer;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    invoke-virtual {p4}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-object p0, p0, Lcom/android/dx/cf/code/BaseMachine;->args:[Lcom/android/dx/rop/type/TypeBearer;

    .line 44
    .line 45
    aget-object p0, p0, p2

    .line 46
    .line 47
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object p0, p0, Lcom/android/dx/cf/code/BaseMachine;->args:[Lcom/android/dx/rop/type/TypeBearer;

    .line 64
    .line 65
    aget-object p0, p0, p2

    .line 66
    .line 67
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_2
    invoke-virtual {p2}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-object p0, p0, Lcom/android/dx/cf/code/BaseMachine;->args:[Lcom/android/dx/rop/type/TypeBearer;

    .line 84
    .line 85
    aget-object p0, p0, v0

    .line 86
    .line 87
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public final result(I)Lcom/android/dx/rop/type/TypeBearer;
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/cf/code/BaseMachine;->resultCount:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    iget-object p0, p0, Lcom/android/dx/cf/code/BaseMachine;->results:[Lcom/android/dx/rop/type/TypeBearer;

    .line 6
    .line 7
    aget-object p0, p0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :catch_0
    const-string p0, "n < 0"

    .line 11
    .line 12
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :goto_0
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const-string p0, "n >= resultCount"

    .line 18
    .line 19
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0
.end method

.method public final resultCount()I
    .locals 1

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/BaseMachine;->resultCount:I

    .line 2
    .line 3
    if-ltz p0, :cond_0

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    new-instance p0, Lcom/android/dx/cf/code/SimException;

    .line 7
    .line 8
    const-string v0, "results never set"

    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0
.end method

.method public final resultWidth()I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget v2, p0, Lcom/android/dx/cf/code/BaseMachine;->resultCount:I

    .line 4
    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    iget-object v2, p0, Lcom/android/dx/cf/code/BaseMachine;->results:[Lcom/android/dx/rop/type/TypeBearer;

    .line 8
    .line 9
    aget-object v2, v2, v0

    .line 10
    .line 11
    invoke-interface {v2}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Lcom/android/dx/rop/type/Type;->getCategory()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    add-int/2addr v1, v2

    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return v1
.end method

.method public final setResult(Lcom/android/dx/rop/type/TypeBearer;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/android/dx/cf/code/BaseMachine;->results:[Lcom/android/dx/rop/type/TypeBearer;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    aput-object p1, v0, v1

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput p1, p0, Lcom/android/dx/cf/code/BaseMachine;->resultCount:I

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "result == null"

    .line 13
    .line 14
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final storeResults(Lcom/android/dx/cf/code/Frame;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/cf/code/BaseMachine;->resultCount:I

    .line 2
    .line 3
    if-ltz v0, :cond_4

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/android/dx/cf/code/BaseMachine;->localTarget:Lcom/android/dx/rop/code/RegisterSpec;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/android/dx/cf/code/Frame;->getLocals()Lcom/android/dx/cf/code/LocalsArray;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, v1}, Lcom/android/dx/cf/code/BaseMachine;->getLocalTarget(Z)Lcom/android/dx/rop/code/RegisterSpec;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p1, p0}, Lcom/android/dx/cf/code/LocalsArray;->set(Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-virtual {p1}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :goto_0
    iget v0, p0, Lcom/android/dx/cf/code/BaseMachine;->resultCount:I

    .line 30
    .line 31
    if-ge v1, v0, :cond_3

    .line 32
    .line 33
    iget-boolean v0, p0, Lcom/android/dx/cf/code/BaseMachine;->localInfo:Z

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/android/dx/cf/code/ExecutionStack;->setLocal()V

    .line 38
    .line 39
    .line 40
    :cond_2
    iget-object v0, p0, Lcom/android/dx/cf/code/BaseMachine;->results:[Lcom/android/dx/rop/type/TypeBearer;

    .line 41
    .line 42
    aget-object v0, v0, v1

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lcom/android/dx/cf/code/ExecutionStack;->push(Lcom/android/dx/rop/type/TypeBearer;)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    :goto_1
    return-void

    .line 51
    :cond_4
    new-instance p0, Lcom/android/dx/cf/code/SimException;

    .line 52
    .line 53
    const-string p1, "results never set"

    .line 54
    .line 55
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p0
.end method
