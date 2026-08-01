.class public final Lcom/android/dx/cf/code/ReturnAddress;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/android/dx/rop/type/TypeBearer;


# instance fields
.field private final subroutineAddress:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lcom/android/dx/cf/code/ReturnAddress;->subroutineAddress:I

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "subroutineAddress < 0"

    .line 10
    .line 11
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    throw p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/android/dx/cf/code/ReturnAddress;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget p0, p0, Lcom/android/dx/cf/code/ReturnAddress;->subroutineAddress:I

    .line 8
    .line 9
    check-cast p1, Lcom/android/dx/cf/code/ReturnAddress;

    .line 10
    .line 11
    iget p1, p1, Lcom/android/dx/cf/code/ReturnAddress;->subroutineAddress:I

    .line 12
    .line 13
    if-ne p0, p1, :cond_1

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_1
    return v1
.end method

.method public getBasicFrameType()I
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/rop/type/Type;->RETURN_ADDRESS:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->getBasicFrameType()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getBasicType()I
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/rop/type/Type;->RETURN_ADDRESS:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->getBasicType()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getFrameType()Lcom/android/dx/rop/type/TypeBearer;
    .locals 0

    .line 1
    return-object p0
.end method

.method public getSubroutineAddress()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/ReturnAddress;->subroutineAddress:I

    .line 2
    .line 3
    return p0
.end method

.method public getType()Lcom/android/dx/rop/type/Type;
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/rop/type/Type;->RETURN_ADDRESS:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/ReturnAddress;->subroutineAddress:I

    .line 2
    .line 3
    return p0
.end method

.method public isConstant()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/cf/code/ReturnAddress;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "<addr:"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget p0, p0, Lcom/android/dx/cf/code/ReturnAddress;->subroutineAddress:I

    .line 9
    .line 10
    invoke-static {p0}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p0, ">"

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
