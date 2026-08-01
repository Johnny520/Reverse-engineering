.class public Lcom/android/dx/ssa/back/NullRegisterAllocator;
.super Lcom/android/dx/ssa/back/RegisterAllocator;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public constructor <init>(Lcom/android/dx/ssa/SsaMethod;Lcom/android/dx/ssa/back/InterferenceGraph;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/android/dx/ssa/back/RegisterAllocator;-><init>(Lcom/android/dx/ssa/SsaMethod;Lcom/android/dx/ssa/back/InterferenceGraph;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public allocateRegisters()Lcom/android/dx/ssa/RegisterMapper;
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/back/RegisterAllocator;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->getRegCount()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    new-instance v0, Lcom/android/dx/ssa/BasicRegisterMapper;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/android/dx/ssa/BasicRegisterMapper;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, p0, :cond_0

    .line 14
    .line 15
    mul-int/lit8 v2, v1, 0x2

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    invoke-virtual {v0, v1, v2, v3}, Lcom/android/dx/ssa/BasicRegisterMapper;->addMapping(III)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-object v0
.end method

.method public wantsParamsMovedHigh()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
