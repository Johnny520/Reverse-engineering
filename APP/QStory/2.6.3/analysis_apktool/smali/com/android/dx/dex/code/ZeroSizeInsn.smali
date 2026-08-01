.class public abstract Lcom/android/dx/dex/code/ZeroSizeInsn;
.super Lcom/android/dx/dex/code/DalvInsn;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/code/SourcePosition;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/android/dx/dex/code/Dops;->SPECIAL_FORMAT:Lcom/android/dx/dex/code/Dop;

    .line 2
    .line 3
    sget-object v1, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 4
    .line 5
    invoke-direct {p0, v0, p1, v1}, Lcom/android/dx/dex/code/DalvInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final codeSize()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final withOpcode(Lcom/android/dx/dex/code/Dop;)Lcom/android/dx/dex/code/DalvInsn;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    const-string p1, "unsupported"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public withRegisterOffset(I)Lcom/android/dx/dex/code/DalvInsn;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getRegisters()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/android/dx/rop/code/RegisterSpecList;->withOffset(I)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/DalvInsn;->withRegisters(Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/dex/code/DalvInsn;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final writeTo(Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 0

    .line 1
    return-void
.end method
