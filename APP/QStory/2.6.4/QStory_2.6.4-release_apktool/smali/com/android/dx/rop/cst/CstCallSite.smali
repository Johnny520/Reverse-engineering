.class public final Lcom/android/dx/rop/cst/CstCallSite;
.super Lcom/android/dx/rop/cst/CstArray;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method private constructor <init>(Lcom/android/dx/rop/cst/CstArray$List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/rop/cst/CstArray;-><init>(Lcom/android/dx/rop/cst/CstArray$List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static make(Lcom/android/dx/rop/cst/CstMethodHandle;Lcom/android/dx/rop/cst/CstNat;Lcom/android/dx/cf/code/BootstrapMethodArgumentsList;)Lcom/android/dx/rop/cst/CstCallSite;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    new-instance v0, Lcom/android/dx/rop/cst/CstArray$List;

    .line 7
    .line 8
    invoke-virtual {p2}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    add-int/lit8 v1, v1, 0x3

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstArray$List;-><init>(I)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, v1, p0}, Lcom/android/dx/rop/cst/CstArray$List;->set(ILcom/android/dx/rop/cst/Constant;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstNat;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-virtual {v0, v2, p0}, Lcom/android/dx/rop/cst/CstArray$List;->set(ILcom/android/dx/rop/cst/Constant;)V

    .line 27
    .line 28
    .line 29
    new-instance p0, Lcom/android/dx/rop/cst/CstProtoRef;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstNat;->getDescriptor()Lcom/android/dx/rop/cst/CstString;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1}, Lcom/android/dx/rop/type/Prototype;->fromDescriptor(Ljava/lang/String;)Lcom/android/dx/rop/type/Prototype;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {p0, p1}, Lcom/android/dx/rop/cst/CstProtoRef;-><init>(Lcom/android/dx/rop/type/Prototype;)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x2

    .line 47
    invoke-virtual {v0, p1, p0}, Lcom/android/dx/rop/cst/CstArray$List;->set(ILcom/android/dx/rop/cst/Constant;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-virtual {p2}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-ge v1, p0, :cond_0

    .line 55
    .line 56
    add-int/lit8 p0, v1, 0x3

    .line 57
    .line 58
    invoke-virtual {p2, v1}, Lcom/android/dx/cf/code/BootstrapMethodArgumentsList;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {v0, p0, p1}, Lcom/android/dx/rop/cst/CstArray$List;->set(ILcom/android/dx/rop/cst/Constant;)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 v1, v1, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 69
    .line 70
    .line 71
    new-instance p0, Lcom/android/dx/rop/cst/CstCallSite;

    .line 72
    .line 73
    invoke-direct {p0, v0}, Lcom/android/dx/rop/cst/CstCallSite;-><init>(Lcom/android/dx/rop/cst/CstArray$List;)V

    .line 74
    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_1
    const-string p0, "nat == null"

    .line 78
    .line 79
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_2
    const-string p0, "bootstrapMethodHandle == null"

    .line 84
    .line 85
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-object v0
.end method


# virtual methods
.method public compareTo0(Lcom/android/dx/rop/cst/Constant;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstArray;->getList()Lcom/android/dx/rop/cst/CstArray$List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p1, Lcom/android/dx/rop/cst/CstCallSite;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstArray;->getList()Lcom/android/dx/rop/cst/CstArray$List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/cst/CstArray$List;->compareTo(Lcom/android/dx/rop/cst/CstArray$List;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstCallSite;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstArray;->getList()Lcom/android/dx/rop/cst/CstArray$List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p1, Lcom/android/dx/rop/cst/CstCallSite;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstArray;->getList()Lcom/android/dx/rop/cst/CstArray$List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Lcom/android/dx/util/FixedSizeList;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstArray;->getList()Lcom/android/dx/rop/cst/CstArray$List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public isCategory2()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstArray;->getList()Lcom/android/dx/rop/cst/CstArray$List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, ", "

    .line 6
    .line 7
    const-string v1, "}"

    .line 8
    .line 9
    const-string v2, "{"

    .line 10
    .line 11
    invoke-virtual {p0, v2, v0, v1}, Lcom/android/dx/util/FixedSizeList;->toHuman(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstArray;->getList()Lcom/android/dx/rop/cst/CstArray$List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, ", "

    .line 6
    .line 7
    const-string v1, "}"

    .line 8
    .line 9
    const-string v2, "call site{"

    .line 10
    .line 11
    invoke-virtual {p0, v2, v0, v1}, Lcom/android/dx/util/FixedSizeList;->toString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public typeName()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "call site"

    .line 2
    .line 3
    return-object p0
.end method
