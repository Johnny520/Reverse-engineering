.class public final Lcom/android/dx/rop/cst/CstBoolean;
.super Lcom/android/dx/rop/cst/CstLiteral32;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final VALUE_FALSE:Lcom/android/dx/rop/cst/CstBoolean;

.field public static final VALUE_TRUE:Lcom/android/dx/rop/cst/CstBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/rop/cst/CstBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/android/dx/rop/cst/CstBoolean;->VALUE_FALSE:Lcom/android/dx/rop/cst/CstBoolean;

    .line 8
    .line 9
    new-instance v0, Lcom/android/dx/rop/cst/CstBoolean;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstBoolean;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/android/dx/rop/cst/CstBoolean;->VALUE_TRUE:Lcom/android/dx/rop/cst/CstBoolean;

    .line 16
    .line 17
    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/rop/cst/CstLiteral32;-><init>(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static make(I)Lcom/android/dx/rop/cst/CstBoolean;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/android/dx/rop/cst/CstBoolean;->VALUE_FALSE:Lcom/android/dx/rop/cst/CstBoolean;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    if-ne p0, v0, :cond_1

    .line 8
    .line 9
    sget-object p0, Lcom/android/dx/rop/cst/CstBoolean;->VALUE_TRUE:Lcom/android/dx/rop/cst/CstBoolean;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    const-string v0, "bogus value: "

    .line 13
    .line 14
    invoke-static {p0, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public static make(Z)Lcom/android/dx/rop/cst/CstBoolean;
    .locals 0

    if-eqz p0, :cond_0

    .line 23
    sget-object p0, Lcom/android/dx/rop/cst/CstBoolean;->VALUE_TRUE:Lcom/android/dx/rop/cst/CstBoolean;

    return-object p0

    :cond_0
    sget-object p0, Lcom/android/dx/rop/cst/CstBoolean;->VALUE_FALSE:Lcom/android/dx/rop/cst/CstBoolean;

    return-object p0
.end method


# virtual methods
.method public getType()Lcom/android/dx/rop/type/Type;
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/rop/type/Type;->BOOLEAN:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    return-object p0
.end method

.method public getValue()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstLiteral32;->getIntBits()I

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
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x1

    .line 10
    return p0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstBoolean;->getValue()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const-string p0, "true"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string p0, "false"

    .line 11
    .line 12
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstBoolean;->getValue()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const-string p0, "boolean{true}"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string p0, "boolean{false}"

    .line 11
    .line 12
    return-object p0
.end method

.method public typeName()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "boolean"

    .line 2
    .line 3
    return-object p0
.end method
