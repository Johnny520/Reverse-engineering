.class public final Lcom/android/dx/dex/code/OddSpacer;
.super Lcom/android/dx/dex/code/VariableSizeInsn;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/code/SourcePosition;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/android/dx/dex/code/VariableSizeInsn;-><init>(Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public argString()Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public codeSize()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    and-int/lit8 p0, p0, 0x1

    .line 6
    .line 7
    return p0
.end method

.method public listingString0(Z)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/code/OddSpacer;->codeSize()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    const-string p0, "nop // spacer"

    .line 10
    .line 11
    return-object p0
.end method

.method public withRegisters(Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/dex/code/DalvInsn;
    .locals 0

    .line 1
    new-instance p1, Lcom/android/dx/dex/code/OddSpacer;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {p1, p0}, Lcom/android/dx/dex/code/OddSpacer;-><init>(Lcom/android/dx/rop/code/SourcePosition;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public writeTo(Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/code/OddSpacer;->codeSize()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    invoke-static {p0, p0}, Lcom/android/dx/dex/code/InsnFormat;->codeUnit(II)S

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-interface {p1, p0}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
