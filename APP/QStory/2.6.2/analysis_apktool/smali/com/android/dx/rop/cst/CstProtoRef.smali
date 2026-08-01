.class public final Lcom/android/dx/rop/cst/CstProtoRef;
.super Lcom/android/dx/rop/cst/TypedConstant;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final prototype:Lcom/android/dx/rop/type/Prototype;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/type/Prototype;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/rop/cst/TypedConstant;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/rop/cst/CstProtoRef;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 5
    .line 6
    return-void
.end method

.method public static make(Lcom/android/dx/rop/cst/CstString;)Lcom/android/dx/rop/cst/CstProtoRef;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/android/dx/rop/type/Prototype;->fromDescriptor(Ljava/lang/String;)Lcom/android/dx/rop/type/Prototype;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, Lcom/android/dx/rop/cst/CstProtoRef;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lcom/android/dx/rop/cst/CstProtoRef;-><init>(Lcom/android/dx/rop/type/Prototype;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public compareTo0(Lcom/android/dx/rop/cst/Constant;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/android/dx/rop/cst/CstProtoRef;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstProtoRef;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstProtoRef;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/type/Prototype;->compareTo(Lcom/android/dx/rop/type/Prototype;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstProtoRef;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lcom/android/dx/rop/cst/CstProtoRef;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstProtoRef;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstProtoRef;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/type/Prototype;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public getPrototype()Lcom/android/dx/rop/type/Prototype;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstProtoRef;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 2
    .line 3
    return-object p0
.end method

.method public getType()Lcom/android/dx/rop/type/Type;
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/rop/type/Type;->METHOD_TYPE:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstProtoRef;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Prototype;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
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
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstProtoRef;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Prototype;->getDescriptor()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
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
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstProtoRef;->typeName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "{"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstProtoRef;->toHuman()Ljava/lang/String;

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

.method public typeName()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "proto"

    .line 2
    .line 3
    return-object p0
.end method
