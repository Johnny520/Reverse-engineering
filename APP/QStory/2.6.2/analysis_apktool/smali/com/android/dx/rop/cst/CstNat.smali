.class public final Lcom/android/dx/rop/cst/CstNat;
.super Lcom/android/dx/rop/cst/Constant;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final PRIMITIVE_TYPE_NAT:Lcom/android/dx/rop/cst/CstNat;


# instance fields
.field private final descriptor:Lcom/android/dx/rop/cst/CstString;

.field private final name:Lcom/android/dx/rop/cst/CstString;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/android/dx/rop/cst/CstNat;

    .line 2
    .line 3
    new-instance v1, Lcom/android/dx/rop/cst/CstString;

    .line 4
    .line 5
    const-string v2, "TYPE"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Lcom/android/dx/rop/cst/CstString;

    .line 11
    .line 12
    const-string v3, "Ljava/lang/Class;"

    .line 13
    .line 14
    invoke-direct {v2, v3}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Lcom/android/dx/rop/cst/CstNat;-><init>(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/android/dx/rop/cst/CstNat;->PRIMITIVE_TYPE_NAT:Lcom/android/dx/rop/cst/CstNat;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/android/dx/rop/cst/Constant;-><init>()V

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
    iput-object p1, p0, Lcom/android/dx/rop/cst/CstNat;->name:Lcom/android/dx/rop/cst/CstString;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/android/dx/rop/cst/CstNat;->descriptor:Lcom/android/dx/rop/cst/CstString;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "descriptor == null"

    .line 15
    .line 16
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v0

    .line 20
    :cond_1
    const-string p0, "name == null"

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
    check-cast p1, Lcom/android/dx/rop/cst/CstNat;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/android/dx/rop/cst/CstNat;->name:Lcom/android/dx/rop/cst/CstString;

    .line 4
    .line 5
    iget-object v1, p1, Lcom/android/dx/rop/cst/CstNat;->name:Lcom/android/dx/rop/cst/CstString;

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
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstNat;->descriptor:Lcom/android/dx/rop/cst/CstString;

    .line 15
    .line 16
    iget-object p1, p1, Lcom/android/dx/rop/cst/CstNat;->descriptor:Lcom/android/dx/rop/cst/CstString;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/cst/Constant;->compareTo(Lcom/android/dx/rop/cst/Constant;)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstNat;

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
    check-cast p1, Lcom/android/dx/rop/cst/CstNat;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/android/dx/rop/cst/CstNat;->name:Lcom/android/dx/rop/cst/CstString;

    .line 10
    .line 11
    iget-object v2, p1, Lcom/android/dx/rop/cst/CstNat;->name:Lcom/android/dx/rop/cst/CstString;

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Lcom/android/dx/rop/cst/CstString;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstNat;->descriptor:Lcom/android/dx/rop/cst/CstString;

    .line 20
    .line 21
    iget-object p1, p1, Lcom/android/dx/rop/cst/CstNat;->descriptor:Lcom/android/dx/rop/cst/CstString;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/cst/CstString;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_1
    return v1
.end method

.method public getDescriptor()Lcom/android/dx/rop/cst/CstString;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstNat;->descriptor:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    return-object p0
.end method

.method public getFieldType()Lcom/android/dx/rop/type/Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstNat;->descriptor:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lcom/android/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/android/dx/rop/type/Type;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getName()Lcom/android/dx/rop/cst/CstString;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstNat;->name:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/cst/CstNat;->name:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstString;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstNat;->descriptor:Lcom/android/dx/rop/cst/CstString;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstString;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    xor-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public isCategory2()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final isClassInit()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstNat;->name:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "<clinit>"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final isInstanceInit()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstNat;->name:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "<init>"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/android/dx/rop/cst/CstNat;->name:Lcom/android/dx/rop/cst/CstString;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x3a

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstNat;->descriptor:Lcom/android/dx/rop/cst/CstString;

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

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

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "nat{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstNat;->toHuman()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 p0, 0x7d

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public typeName()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "nat"

    .line 2
    .line 3
    return-object p0
.end method
