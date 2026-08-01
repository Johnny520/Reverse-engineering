.class public final Lcom/android/dx/rop/cst/CstInvokeDynamic;
.super Lcom/android/dx/rop/cst/Constant;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final bootstrapMethodIndex:I

.field private callSite:Lcom/android/dx/rop/cst/CstCallSite;

.field private declaringClass:Lcom/android/dx/rop/cst/CstType;

.field private final nat:Lcom/android/dx/rop/cst/CstNat;

.field private final prototype:Lcom/android/dx/rop/type/Prototype;

.field private final references:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/dx/rop/cst/CstCallSiteRef;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(ILcom/android/dx/rop/cst/CstNat;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/rop/cst/Constant;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->bootstrapMethodIndex:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->nat:Lcom/android/dx/rop/cst/CstNat;

    .line 7
    .line 8
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstNat;->getDescriptor()Lcom/android/dx/rop/cst/CstString;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Lcom/android/dx/rop/type/Prototype;->fromDescriptor(Ljava/lang/String;)Lcom/android/dx/rop/type/Prototype;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 21
    .line 22
    new-instance p1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->references:Ljava/util/List;

    .line 28
    .line 29
    return-void
.end method

.method public static make(ILcom/android/dx/rop/cst/CstNat;)Lcom/android/dx/rop/cst/CstInvokeDynamic;
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/rop/cst/CstInvokeDynamic;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/android/dx/rop/cst/CstInvokeDynamic;-><init>(ILcom/android/dx/rop/cst/CstNat;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public addReference()Lcom/android/dx/rop/cst/CstCallSiteRef;
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/rop/cst/CstCallSiteRef;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->references:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, p0, v1}, Lcom/android/dx/rop/cst/CstCallSiteRef;-><init>(Lcom/android/dx/rop/cst/CstInvokeDynamic;I)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->references:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public compareTo0(Lcom/android/dx/rop/cst/Constant;)I
    .locals 2

    .line 1
    check-cast p1, Lcom/android/dx/rop/cst/CstInvokeDynamic;

    .line 2
    .line 3
    iget v0, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->bootstrapMethodIndex:I

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstInvokeDynamic;->getBootstrapMethodIndex()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->nat:Lcom/android/dx/rop/cst/CstNat;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstInvokeDynamic;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Lcom/android/dx/rop/cst/Constant;->compareTo(Lcom/android/dx/rop/cst/Constant;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    return v0

    .line 29
    :cond_1
    iget-object v0, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->declaringClass:Lcom/android/dx/rop/cst/CstType;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstInvokeDynamic;->getDeclaringClass()Lcom/android/dx/rop/cst/CstType;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Lcom/android/dx/rop/cst/Constant;->compareTo(Lcom/android/dx/rop/cst/Constant;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    return v0

    .line 42
    :cond_2
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->callSite:Lcom/android/dx/rop/cst/CstCallSite;

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstInvokeDynamic;->getCallSite()Lcom/android/dx/rop/cst/CstCallSite;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/cst/Constant;->compareTo(Lcom/android/dx/rop/cst/Constant;)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    return p0
.end method

.method public getBootstrapMethodIndex()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->bootstrapMethodIndex:I

    .line 2
    .line 3
    return p0
.end method

.method public getCallSite()Lcom/android/dx/rop/cst/CstCallSite;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->callSite:Lcom/android/dx/rop/cst/CstCallSite;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDeclaringClass()Lcom/android/dx/rop/cst/CstType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->declaringClass:Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    return-object p0
.end method

.method public getNat()Lcom/android/dx/rop/cst/CstNat;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->nat:Lcom/android/dx/rop/cst/CstNat;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPrototype()Lcom/android/dx/rop/type/Prototype;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 2
    .line 3
    return-object p0
.end method

.method public getReferences()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/android/dx/rop/cst/CstCallSiteRef;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->references:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getReturnType()Lcom/android/dx/rop/type/Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Prototype;->getReturnType()Lcom/android/dx/rop/type/Type;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public isCategory2()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public setCallSite(Lcom/android/dx/rop/cst/CstCallSite;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->callSite:Lcom/android/dx/rop/cst/CstCallSite;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->callSite:Lcom/android/dx/rop/cst/CstCallSite;

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p0, "callSite == null"

    .line 11
    .line 12
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    const-string p0, "already added call site"

    .line 17
    .line 18
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public setDeclaringClass(Lcom/android/dx/rop/cst/CstType;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->declaringClass:Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->declaringClass:Lcom/android/dx/rop/cst/CstType;

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p0, "declaringClass == null"

    .line 11
    .line 12
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    const-string p0, "already added declaring class"

    .line 17
    .line 18
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public toHuman()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->declaringClass:Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, "Unknown"

    .line 11
    .line 12
    :goto_0
    const-string v1, "InvokeDynamic("

    .line 13
    .line 14
    const-string v2, ":"

    .line 15
    .line 16
    invoke-static {v1, v0, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget v1, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->bootstrapMethodIndex:I

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ", "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstInvokeDynamic;->nat:Lcom/android/dx/rop/cst/CstNat;

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstNat;->toHuman()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p0, ")"

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstInvokeDynamic;->toHuman()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public typeName()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "InvokeDynamic"

    .line 2
    .line 3
    return-object p0
.end method
