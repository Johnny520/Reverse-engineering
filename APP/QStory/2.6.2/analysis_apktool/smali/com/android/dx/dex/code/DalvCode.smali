.class public final Lcom/android/dx/dex/code/DalvCode;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/dex/code/DalvCode$AssignIndicesCallback;
    }
.end annotation


# instance fields
.field private catches:Lcom/android/dx/dex/code/CatchTable;

.field private insns:Lcom/android/dx/dex/code/DalvInsnList;

.field private locals:Lcom/android/dx/dex/code/LocalList;

.field private final positionInfo:I

.field private positions:Lcom/android/dx/dex/code/PositionList;

.field private unprocessedCatches:Lcom/android/dx/dex/code/CatchBuilder;

.field private unprocessedInsns:Lcom/android/dx/dex/code/OutputFinisher;


# direct methods
.method public constructor <init>(ILcom/android/dx/dex/code/OutputFinisher;Lcom/android/dx/dex/code/CatchBuilder;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p2, :cond_1

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    iput p1, p0, Lcom/android/dx/dex/code/DalvCode;->positionInfo:I

    .line 10
    .line 11
    iput-object p2, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedInsns:Lcom/android/dx/dex/code/OutputFinisher;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedCatches:Lcom/android/dx/dex/code/CatchBuilder;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->catches:Lcom/android/dx/dex/code/CatchTable;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->positions:Lcom/android/dx/dex/code/PositionList;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->locals:Lcom/android/dx/dex/code/LocalList;

    .line 20
    .line 21
    iput-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->insns:Lcom/android/dx/dex/code/DalvInsnList;

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string p0, "unprocessedCatches == null"

    .line 25
    .line 26
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0

    .line 30
    :cond_1
    const-string p0, "unprocessedInsns == null"

    .line 31
    .line 32
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0
.end method

.method private finishProcessingIfNecessary()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->insns:Lcom/android/dx/dex/code/DalvInsnList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedInsns:Lcom/android/dx/dex/code/OutputFinisher;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/android/dx/dex/code/OutputFinisher;->finishProcessingAndGetList()Lcom/android/dx/dex/code/DalvInsnList;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->insns:Lcom/android/dx/dex/code/DalvInsnList;

    .line 13
    .line 14
    iget v1, p0, Lcom/android/dx/dex/code/DalvCode;->positionInfo:I

    .line 15
    .line 16
    invoke-static {v0, v1}, Lcom/android/dx/dex/code/PositionList;->make(Lcom/android/dx/dex/code/DalvInsnList;I)Lcom/android/dx/dex/code/PositionList;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->positions:Lcom/android/dx/dex/code/PositionList;

    .line 21
    .line 22
    iget-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->insns:Lcom/android/dx/dex/code/DalvInsnList;

    .line 23
    .line 24
    invoke-static {v0}, Lcom/android/dx/dex/code/LocalList;->make(Lcom/android/dx/dex/code/DalvInsnList;)Lcom/android/dx/dex/code/LocalList;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->locals:Lcom/android/dx/dex/code/LocalList;

    .line 29
    .line 30
    iget-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedCatches:Lcom/android/dx/dex/code/CatchBuilder;

    .line 31
    .line 32
    invoke-interface {v0}, Lcom/android/dx/dex/code/CatchBuilder;->build()Lcom/android/dx/dex/code/CatchTable;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->catches:Lcom/android/dx/dex/code/CatchTable;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedInsns:Lcom/android/dx/dex/code/OutputFinisher;

    .line 40
    .line 41
    iput-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedCatches:Lcom/android/dx/dex/code/CatchBuilder;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public assignIndices(Lcom/android/dx/dex/code/DalvCode$AssignIndicesCallback;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedInsns:Lcom/android/dx/dex/code/OutputFinisher;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/OutputFinisher;->assignIndices(Lcom/android/dx/dex/code/DalvCode$AssignIndicesCallback;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getCatchTypes()Ljava/util/HashSet;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Lcom/android/dx/rop/type/Type;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedCatches:Lcom/android/dx/dex/code/CatchBuilder;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/android/dx/dex/code/CatchBuilder;->getCatchTypes()Ljava/util/HashSet;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getCatches()Lcom/android/dx/dex/code/CatchTable;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/dex/code/DalvCode;->finishProcessingIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/android/dx/dex/code/DalvCode;->catches:Lcom/android/dx/dex/code/CatchTable;

    .line 5
    .line 6
    return-object p0
.end method

.method public getInsnConstants()Ljava/util/HashSet;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Lcom/android/dx/rop/cst/Constant;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedInsns:Lcom/android/dx/dex/code/OutputFinisher;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/OutputFinisher;->getAllConstants()Ljava/util/HashSet;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getInsns()Lcom/android/dx/dex/code/DalvInsnList;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/dex/code/DalvCode;->finishProcessingIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/android/dx/dex/code/DalvCode;->insns:Lcom/android/dx/dex/code/DalvInsnList;

    .line 5
    .line 6
    return-object p0
.end method

.method public getLocals()Lcom/android/dx/dex/code/LocalList;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/dex/code/DalvCode;->finishProcessingIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/android/dx/dex/code/DalvCode;->locals:Lcom/android/dx/dex/code/LocalList;

    .line 5
    .line 6
    return-object p0
.end method

.method public getPositions()Lcom/android/dx/dex/code/PositionList;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/dex/code/DalvCode;->finishProcessingIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/android/dx/dex/code/DalvCode;->positions:Lcom/android/dx/dex/code/PositionList;

    .line 5
    .line 6
    return-object p0
.end method

.method public hasAnyCatches()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedCatches:Lcom/android/dx/dex/code/CatchBuilder;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/android/dx/dex/code/CatchBuilder;->hasAnyCatches()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public hasLocals()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedInsns:Lcom/android/dx/dex/code/OutputFinisher;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/OutputFinisher;->hasAnyLocalInfo()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public hasPositions()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/dex/code/DalvCode;->positionInfo:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    iget-object p0, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedInsns:Lcom/android/dx/dex/code/OutputFinisher;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/android/dx/dex/code/OutputFinisher;->hasAnyPositionInfo()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method
