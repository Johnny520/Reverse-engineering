.class public abstract Lcom/android/dx/cf/iface/StdMember;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/android/dx/cf/iface/Member;


# instance fields
.field private final accessFlags:I

.field private final attributes:Lcom/android/dx/cf/iface/AttributeList;

.field private final definingClass:Lcom/android/dx/rop/cst/CstType;

.field private final nat:Lcom/android/dx/rop/cst/CstNat;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstType;ILcom/android/dx/rop/cst/CstNat;Lcom/android/dx/cf/iface/AttributeList;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    if-eqz p3, :cond_1

    .line 8
    .line 9
    if-eqz p4, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, Lcom/android/dx/cf/iface/StdMember;->definingClass:Lcom/android/dx/rop/cst/CstType;

    .line 12
    .line 13
    iput p2, p0, Lcom/android/dx/cf/iface/StdMember;->accessFlags:I

    .line 14
    .line 15
    iput-object p3, p0, Lcom/android/dx/cf/iface/StdMember;->nat:Lcom/android/dx/rop/cst/CstNat;

    .line 16
    .line 17
    iput-object p4, p0, Lcom/android/dx/cf/iface/StdMember;->attributes:Lcom/android/dx/cf/iface/AttributeList;

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p0, "attributes == null"

    .line 21
    .line 22
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :cond_1
    const-string p0, "nat == null"

    .line 27
    .line 28
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_2
    const-string p0, "definingClass == null"

    .line 33
    .line 34
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0
.end method


# virtual methods
.method public final getAccessFlags()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/iface/StdMember;->accessFlags:I

    .line 2
    .line 3
    return p0
.end method

.method public final getAttributes()Lcom/android/dx/cf/iface/AttributeList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/iface/StdMember;->attributes:Lcom/android/dx/cf/iface/AttributeList;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDefiningClass()Lcom/android/dx/rop/cst/CstType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/iface/StdMember;->definingClass:Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDescriptor()Lcom/android/dx/rop/cst/CstString;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/iface/StdMember;->nat:Lcom/android/dx/rop/cst/CstNat;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstNat;->getDescriptor()Lcom/android/dx/rop/cst/CstString;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getName()Lcom/android/dx/rop/cst/CstString;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/iface/StdMember;->nat:Lcom/android/dx/rop/cst/CstNat;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstNat;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getNat()Lcom/android/dx/rop/cst/CstNat;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/iface/StdMember;->nat:Lcom/android/dx/rop/cst/CstNat;

    .line 2
    .line 3
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const/16 v1, 0x7b

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lcom/android/dx/cf/iface/StdMember;->nat:Lcom/android/dx/rop/cst/CstNat;

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstNat;->toHuman()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 p0, 0x7d

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
