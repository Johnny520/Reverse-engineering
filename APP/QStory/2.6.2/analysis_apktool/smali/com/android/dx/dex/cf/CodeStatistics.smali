.class public final Lcom/android/dx/dex/cf/CodeStatistics;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field private static final DEBUG:Z = false


# instance fields
.field public dexRunningDeltaInsns:I

.field public dexRunningDeltaRegisters:I

.field public dexRunningTotalInsns:I

.field public runningDeltaInsns:I

.field public runningDeltaRegisters:I

.field public runningOriginalBytes:I

.field public runningTotalInsns:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/android/dx/dex/cf/CodeStatistics;->runningDeltaRegisters:I

    .line 6
    .line 7
    iput v0, p0, Lcom/android/dx/dex/cf/CodeStatistics;->runningDeltaInsns:I

    .line 8
    .line 9
    iput v0, p0, Lcom/android/dx/dex/cf/CodeStatistics;->runningTotalInsns:I

    .line 10
    .line 11
    iput v0, p0, Lcom/android/dx/dex/cf/CodeStatistics;->dexRunningDeltaRegisters:I

    .line 12
    .line 13
    iput v0, p0, Lcom/android/dx/dex/cf/CodeStatistics;->dexRunningDeltaInsns:I

    .line 14
    .line 15
    iput v0, p0, Lcom/android/dx/dex/cf/CodeStatistics;->dexRunningTotalInsns:I

    .line 16
    .line 17
    iput v0, p0, Lcom/android/dx/dex/cf/CodeStatistics;->runningOriginalBytes:I

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public dumpStatistics(Ljava/io/PrintStream;)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/android/dx/dex/cf/CodeStatistics;->runningDeltaInsns:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lcom/android/dx/dex/cf/CodeStatistics;->runningTotalInsns:I

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, p0, Lcom/android/dx/dex/cf/CodeStatistics;->runningDeltaInsns:I

    .line 14
    .line 15
    int-to-float v3, v2

    .line 16
    iget v4, p0, Lcom/android/dx/dex/cf/CodeStatistics;->runningTotalInsns:I

    .line 17
    .line 18
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v4

    .line 23
    int-to-float v2, v2

    .line 24
    div-float/2addr v3, v2

    .line 25
    float-to-double v2, v3

    .line 26
    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    .line 27
    .line 28
    mul-double/2addr v2, v4

    .line 29
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget v3, p0, Lcom/android/dx/dex/cf/CodeStatistics;->runningDeltaRegisters:I

    .line 34
    .line 35
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "Optimizer Delta Rop Insns: %d total: %d (%.2f%%) Delta Registers: %d\n"

    .line 44
    .line 45
    invoke-virtual {p1, v1, v0}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 46
    .line 47
    .line 48
    iget v0, p0, Lcom/android/dx/dex/cf/CodeStatistics;->dexRunningDeltaInsns:I

    .line 49
    .line 50
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget v1, p0, Lcom/android/dx/dex/cf/CodeStatistics;->dexRunningTotalInsns:I

    .line 55
    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget v2, p0, Lcom/android/dx/dex/cf/CodeStatistics;->dexRunningDeltaInsns:I

    .line 61
    .line 62
    int-to-float v3, v2

    .line 63
    iget v6, p0, Lcom/android/dx/dex/cf/CodeStatistics;->dexRunningTotalInsns:I

    .line 64
    .line 65
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    add-int/2addr v2, v6

    .line 70
    int-to-float v2, v2

    .line 71
    div-float/2addr v3, v2

    .line 72
    float-to-double v2, v3

    .line 73
    mul-double/2addr v2, v4

    .line 74
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    iget v3, p0, Lcom/android/dx/dex/cf/CodeStatistics;->dexRunningDeltaRegisters:I

    .line 79
    .line 80
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const-string v1, "Optimizer Delta Dex Insns: Insns: %d total: %d (%.2f%%) Delta Registers: %d\n"

    .line 89
    .line 90
    invoke-virtual {p1, v1, v0}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 91
    .line 92
    .line 93
    iget p0, p0, Lcom/android/dx/dex/cf/CodeStatistics;->runningOriginalBytes:I

    .line 94
    .line 95
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    const-string v0, "Original bytecode byte count: %d\n"

    .line 104
    .line 105
    invoke-virtual {p1, v0, p0}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public updateDexStatistics(Lcom/android/dx/dex/code/DalvCode;Lcom/android/dx/dex/code/DalvCode;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/android/dx/dex/cf/CodeStatistics;->dexRunningDeltaInsns:I

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/android/dx/dex/code/DalvCode;->getInsns()Lcom/android/dx/dex/code/DalvInsnList;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lcom/android/dx/dex/code/DalvInsnList;->codeSize()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p1}, Lcom/android/dx/dex/code/DalvCode;->getInsns()Lcom/android/dx/dex/code/DalvInsnList;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Lcom/android/dx/dex/code/DalvInsnList;->codeSize()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    sub-int/2addr v1, v2

    .line 20
    add-int/2addr v1, v0

    .line 21
    iput v1, p0, Lcom/android/dx/dex/cf/CodeStatistics;->dexRunningDeltaInsns:I

    .line 22
    .line 23
    iget v0, p0, Lcom/android/dx/dex/cf/CodeStatistics;->dexRunningDeltaRegisters:I

    .line 24
    .line 25
    invoke-virtual {p2}, Lcom/android/dx/dex/code/DalvCode;->getInsns()Lcom/android/dx/dex/code/DalvInsnList;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Lcom/android/dx/dex/code/DalvInsnList;->getRegistersSize()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {p1}, Lcom/android/dx/dex/code/DalvCode;->getInsns()Lcom/android/dx/dex/code/DalvInsnList;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Lcom/android/dx/dex/code/DalvInsnList;->getRegistersSize()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    sub-int/2addr v1, p1

    .line 42
    add-int/2addr v1, v0

    .line 43
    iput v1, p0, Lcom/android/dx/dex/cf/CodeStatistics;->dexRunningDeltaRegisters:I

    .line 44
    .line 45
    iget p1, p0, Lcom/android/dx/dex/cf/CodeStatistics;->dexRunningTotalInsns:I

    .line 46
    .line 47
    invoke-virtual {p2}, Lcom/android/dx/dex/code/DalvCode;->getInsns()Lcom/android/dx/dex/code/DalvInsnList;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p2}, Lcom/android/dx/dex/code/DalvInsnList;->codeSize()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    add-int/2addr p2, p1

    .line 56
    iput p2, p0, Lcom/android/dx/dex/cf/CodeStatistics;->dexRunningTotalInsns:I

    .line 57
    .line 58
    return-void
.end method

.method public updateOriginalByteCount(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/dex/cf/CodeStatistics;->runningOriginalBytes:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    iput v0, p0, Lcom/android/dx/dex/cf/CodeStatistics;->runningOriginalBytes:I

    .line 5
    .line 6
    return-void
.end method

.method public updateRopStatistics(Lcom/android/dx/rop/code/RopMethod;Lcom/android/dx/rop/code/RopMethod;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/rop/code/BasicBlockList;->getEffectiveInstructionCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlockList;->getRegCount()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {p2}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Lcom/android/dx/rop/code/BasicBlockList;->getEffectiveInstructionCount()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget v2, p0, Lcom/android/dx/dex/cf/CodeStatistics;->runningDeltaInsns:I

    .line 26
    .line 27
    sub-int v0, v1, v0

    .line 28
    .line 29
    add-int/2addr v0, v2

    .line 30
    iput v0, p0, Lcom/android/dx/dex/cf/CodeStatistics;->runningDeltaInsns:I

    .line 31
    .line 32
    iget v0, p0, Lcom/android/dx/dex/cf/CodeStatistics;->runningDeltaRegisters:I

    .line 33
    .line 34
    invoke-virtual {p2}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p2}, Lcom/android/dx/rop/code/BasicBlockList;->getRegCount()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    sub-int/2addr p2, p1

    .line 43
    add-int/2addr p2, v0

    .line 44
    iput p2, p0, Lcom/android/dx/dex/cf/CodeStatistics;->runningDeltaRegisters:I

    .line 45
    .line 46
    iget p1, p0, Lcom/android/dx/dex/cf/CodeStatistics;->runningTotalInsns:I

    .line 47
    .line 48
    add-int/2addr p1, v1

    .line 49
    iput p1, p0, Lcom/android/dx/dex/cf/CodeStatistics;->runningTotalInsns:I

    .line 50
    .line 51
    return-void
.end method
