.class public final Lcom/android/dx/dex/code/TargetInsn;
.super Lcom/android/dx/dex/code/FixedSizeInsn;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private target:Lcom/android/dx/dex/code/CodeAddress;


# direct methods
.method public constructor <init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/dex/code/CodeAddress;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/android/dx/dex/code/FixedSizeInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 2
    .line 3
    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    iput-object p4, p0, Lcom/android/dx/dex/code/TargetInsn;->target:Lcom/android/dx/dex/code/CodeAddress;

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "target == null"

    .line 10
    .line 11
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    throw p0
.end method


# virtual methods
.method public argString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/TargetInsn;->target:Lcom/android/dx/dex/code/CodeAddress;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const-string p0, "????"

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->identifierString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public getTarget()Lcom/android/dx/dex/code/CodeAddress;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/TargetInsn;->target:Lcom/android/dx/dex/code/CodeAddress;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTargetAddress()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/TargetInsn;->target:Lcom/android/dx/dex/code/CodeAddress;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getTargetOffset()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/code/TargetInsn;->target:Lcom/android/dx/dex/code/CodeAddress;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    sub-int/2addr v0, p0

    .line 12
    return v0
.end method

.method public hasTargetOffset()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->hasAddress()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/android/dx/dex/code/TargetInsn;->target:Lcom/android/dx/dex/code/CodeAddress;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->hasAddress()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public withNewTargetAndReversed(Lcom/android/dx/dex/code/CodeAddress;)Lcom/android/dx/dex/code/TargetInsn;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getOpcode()Lcom/android/dx/dex/code/Dop;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/dex/code/Dop;->getOppositeTest()Lcom/android/dx/dex/code/Dop;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lcom/android/dx/dex/code/TargetInsn;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getRegisters()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {v1, v0, v2, p0, p1}, Lcom/android/dx/dex/code/TargetInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/dex/code/CodeAddress;)V

    .line 20
    .line 21
    .line 22
    return-object v1
.end method

.method public withOpcode(Lcom/android/dx/dex/code/Dop;)Lcom/android/dx/dex/code/DalvInsn;
    .locals 3

    .line 1
    new-instance v0, Lcom/android/dx/dex/code/TargetInsn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getRegisters()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object p0, p0, Lcom/android/dx/dex/code/TargetInsn;->target:Lcom/android/dx/dex/code/CodeAddress;

    .line 12
    .line 13
    invoke-direct {v0, p1, v1, v2, p0}, Lcom/android/dx/dex/code/TargetInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/dex/code/CodeAddress;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public withRegisters(Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/dex/code/DalvInsn;
    .locals 3

    .line 1
    new-instance v0, Lcom/android/dx/dex/code/TargetInsn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getOpcode()Lcom/android/dx/dex/code/Dop;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object p0, p0, Lcom/android/dx/dex/code/TargetInsn;->target:Lcom/android/dx/dex/code/CodeAddress;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, p1, p0}, Lcom/android/dx/dex/code/TargetInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/dex/code/CodeAddress;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
