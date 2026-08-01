.class public Lcom/android/dx/rop/cst/CstCallSiteRef;
.super Lcom/android/dx/rop/cst/Constant;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private final id:I

.field private final invokeDynamic:Lcom/android/dx/rop/cst/CstInvokeDynamic;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstInvokeDynamic;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/rop/cst/Constant;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lcom/android/dx/rop/cst/CstCallSiteRef;->invokeDynamic:Lcom/android/dx/rop/cst/CstInvokeDynamic;

    .line 7
    .line 8
    iput p2, p0, Lcom/android/dx/rop/cst/CstCallSiteRef;->id:I

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "invokeDynamic == null"

    .line 12
    .line 13
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
.end method


# virtual methods
.method public compareTo0(Lcom/android/dx/rop/cst/Constant;)I
    .locals 2

    .line 1
    check-cast p1, Lcom/android/dx/rop/cst/CstCallSiteRef;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/android/dx/rop/cst/CstCallSiteRef;->invokeDynamic:Lcom/android/dx/rop/cst/CstInvokeDynamic;

    .line 4
    .line 5
    iget-object v1, p1, Lcom/android/dx/rop/cst/CstCallSiteRef;->invokeDynamic:Lcom/android/dx/rop/cst/CstInvokeDynamic;

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
    iget p0, p0, Lcom/android/dx/rop/cst/CstCallSiteRef;->id:I

    .line 15
    .line 16
    iget p1, p1, Lcom/android/dx/rop/cst/CstCallSiteRef;->id:I

    .line 17
    .line 18
    invoke-static {p0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public getCallSite()Lcom/android/dx/rop/cst/CstCallSite;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstCallSiteRef;->invokeDynamic:Lcom/android/dx/rop/cst/CstInvokeDynamic;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstInvokeDynamic;->getCallSite()Lcom/android/dx/rop/cst/CstCallSite;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getPrototype()Lcom/android/dx/rop/type/Prototype;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstCallSiteRef;->invokeDynamic:Lcom/android/dx/rop/cst/CstInvokeDynamic;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstInvokeDynamic;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getReturnType()Lcom/android/dx/rop/type/Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstCallSiteRef;->invokeDynamic:Lcom/android/dx/rop/cst/CstInvokeDynamic;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstInvokeDynamic;->getReturnType()Lcom/android/dx/rop/type/Type;

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

.method public toHuman()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstCallSiteRef;->getCallSite()Lcom/android/dx/rop/cst/CstCallSite;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstCallSite;->toHuman()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstCallSiteRef;->getCallSite()Lcom/android/dx/rop/cst/CstCallSite;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstCallSite;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public typeName()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "CallSiteRef"

    .line 2
    .line 3
    return-object p0
.end method
