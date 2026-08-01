.class public final Lcom/android/dx/rop/cst/CstShort;
.super Lcom/android/dx/rop/cst/CstLiteral32;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final VALUE_0:Lcom/android/dx/rop/cst/CstShort;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lcom/android/dx/rop/cst/CstShort;->make(S)Lcom/android/dx/rop/cst/CstShort;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Lcom/android/dx/rop/cst/CstShort;->VALUE_0:Lcom/android/dx/rop/cst/CstShort;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>(S)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/rop/cst/CstLiteral32;-><init>(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static make(I)Lcom/android/dx/rop/cst/CstShort;
    .locals 1

    .line 1
    int-to-short v0, p0

    .line 2
    if-ne v0, p0, :cond_0

    .line 3
    .line 4
    invoke-static {v0}, Lcom/android/dx/rop/cst/CstShort;->make(S)Lcom/android/dx/rop/cst/CstShort;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0

    .line 9
    :cond_0
    const-string v0, "bogus short value: "

    .line 10
    .line 11
    invoke-static {p0, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public static make(S)Lcom/android/dx/rop/cst/CstShort;
    .locals 1

    .line 20
    new-instance v0, Lcom/android/dx/rop/cst/CstShort;

    invoke-direct {v0, p0}, Lcom/android/dx/rop/cst/CstShort;-><init>(S)V

    return-object v0
.end method


# virtual methods
.method public getType()Lcom/android/dx/rop/type/Type;
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/rop/type/Type;->SHORT:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    return-object p0
.end method

.method public getValue()S
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstLiteral32;->getIntBits()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    int-to-short p0, p0

    .line 6
    return p0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstLiteral32;->getIntBits()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstLiteral32;->getIntBits()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "short{0x"

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, " / "

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const/16 p0, 0x7d

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public typeName()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "short"

    .line 2
    .line 3
    return-object p0
.end method
