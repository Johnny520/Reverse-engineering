.class public abstract Lcom/android/dx/rop/cst/CstMemberRef;
.super Lcom/android/dx/rop/cst/TypedConstant;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final definingClass:Lcom/android/dx/rop/cst/CstType;

.field private final nat:Lcom/android/dx/rop/cst/CstNat;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/android/dx/rop/cst/TypedConstant;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lcom/android/dx/rop/cst/CstMemberRef;->definingClass:Lcom/android/dx/rop/cst/CstType;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/android/dx/rop/cst/CstMemberRef;->nat:Lcom/android/dx/rop/cst/CstNat;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "nat == null"

    .line 15
    .line 16
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v0

    .line 20
    :cond_1
    const-string p0, "definingClass == null"

    .line 21
    .line 22
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0
.end method


# virtual methods
.method public compareTo0(Lcom/android/dx/rop/cst/Constant;)I
    .locals 2

    .line 1
    check-cast p1, Lcom/android/dx/rop/cst/CstMemberRef;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/android/dx/rop/cst/CstMemberRef;->definingClass:Lcom/android/dx/rop/cst/CstType;

    .line 4
    .line 5
    iget-object v1, p1, Lcom/android/dx/rop/cst/CstMemberRef;->definingClass:Lcom/android/dx/rop/cst/CstType;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/android/dx/rop/cst/Constant;->compareTo(Lcom/android/dx/rop/cst/Constant;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstMemberRef;->nat:Lcom/android/dx/rop/cst/CstNat;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstNat;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p1, p1, Lcom/android/dx/rop/cst/CstMemberRef;->nat:Lcom/android/dx/rop/cst/CstNat;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstNat;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/cst/Constant;->compareTo(Lcom/android/dx/rop/cst/Constant;)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    check-cast p1, Lcom/android/dx/rop/cst/CstMemberRef;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/android/dx/rop/cst/CstMemberRef;->definingClass:Lcom/android/dx/rop/cst/CstType;

    .line 18
    .line 19
    iget-object v2, p1, Lcom/android/dx/rop/cst/CstMemberRef;->definingClass:Lcom/android/dx/rop/cst/CstType;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lcom/android/dx/rop/cst/CstType;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstMemberRef;->nat:Lcom/android/dx/rop/cst/CstNat;

    .line 28
    .line 29
    iget-object p1, p1, Lcom/android/dx/rop/cst/CstMemberRef;->nat:Lcom/android/dx/rop/cst/CstNat;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/cst/CstNat;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_1
    :goto_0
    return v0
.end method

.method public final getDefiningClass()Lcom/android/dx/rop/cst/CstType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstMemberRef;->definingClass:Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getNat()Lcom/android/dx/rop/cst/CstNat;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstMemberRef;->nat:Lcom/android/dx/rop/cst/CstNat;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/cst/CstMemberRef;->definingClass:Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstType;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstMemberRef;->nat:Lcom/android/dx/rop/cst/CstNat;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstNat;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    xor-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final isCategory2()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final toHuman()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/android/dx/rop/cst/CstMemberRef;->definingClass:Lcom/android/dx/rop/cst/CstType;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x2e

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstMemberRef;->nat:Lcom/android/dx/rop/cst/CstNat;

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstNat;->toHuman()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/Constant;->typeName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x7b

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->toHuman()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 p0, 0x7d

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method
