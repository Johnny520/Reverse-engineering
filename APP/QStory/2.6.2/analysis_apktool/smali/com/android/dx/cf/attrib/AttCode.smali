.class public final Lcom/android/dx/cf/attrib/AttCode;
.super Lcom/android/dx/cf/attrib/BaseAttribute;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final ATTRIBUTE_NAME:Ljava/lang/String; = "Code"


# instance fields
.field private final attributes:Lcom/android/dx/cf/iface/AttributeList;

.field private final catches:Lcom/android/dx/cf/code/ByteCatchList;

.field private final code:Lcom/android/dx/cf/code/BytecodeArray;

.field private final maxLocals:I

.field private final maxStack:I


# direct methods
.method public constructor <init>(IILcom/android/dx/cf/code/BytecodeArray;Lcom/android/dx/cf/code/ByteCatchList;Lcom/android/dx/cf/iface/AttributeList;)V
    .locals 2

    .line 1
    const-string v0, "Code"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/android/dx/cf/attrib/BaseAttribute;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-ltz p1, :cond_4

    .line 8
    .line 9
    if-ltz p2, :cond_3

    .line 10
    .line 11
    if-eqz p3, :cond_2

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p4}, Lcom/android/dx/util/MutabilityControl;->isMutable()Z

    .line 14
    .line 15
    .line 16
    move-result v1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    :try_start_1
    invoke-interface {p5}, Lcom/android/dx/cf/iface/AttributeList;->isMutable()Z

    .line 20
    .line 21
    .line 22
    move-result v1
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    iput p1, p0, Lcom/android/dx/cf/attrib/AttCode;->maxStack:I

    .line 26
    .line 27
    iput p2, p0, Lcom/android/dx/cf/attrib/AttCode;->maxLocals:I

    .line 28
    .line 29
    iput-object p3, p0, Lcom/android/dx/cf/attrib/AttCode;->code:Lcom/android/dx/cf/code/BytecodeArray;

    .line 30
    .line 31
    iput-object p4, p0, Lcom/android/dx/cf/attrib/AttCode;->catches:Lcom/android/dx/cf/code/ByteCatchList;

    .line 32
    .line 33
    iput-object p5, p0, Lcom/android/dx/cf/attrib/AttCode;->attributes:Lcom/android/dx/cf/iface/AttributeList;

    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    :try_start_2
    new-instance p0, Lcom/android/dx/util/MutabilityException;

    .line 37
    .line 38
    const-string p1, "attributes.isMutable()"

    .line 39
    .line 40
    invoke-direct {p0, p1}, Lcom/android/dx/util/MutabilityException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p0
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_0

    .line 44
    :catch_0
    const-string p0, "attributes == null"

    .line 45
    .line 46
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_1
    :try_start_3
    new-instance p0, Lcom/android/dx/util/MutabilityException;

    .line 51
    .line 52
    const-string p1, "catches.isMutable()"

    .line 53
    .line 54
    invoke-direct {p0, p1}, Lcom/android/dx/util/MutabilityException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p0
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_1

    .line 58
    :catch_1
    const-string p0, "catches == null"

    .line 59
    .line 60
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_2
    const-string p0, "code == null"

    .line 65
    .line 66
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :cond_3
    const-string p0, "maxLocals < 0"

    .line 71
    .line 72
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v0

    .line 76
    :cond_4
    const-string p0, "maxStack < 0"

    .line 77
    .line 78
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v0
.end method


# virtual methods
.method public byteLength()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/attrib/AttCode;->code:Lcom/android/dx/cf/code/BytecodeArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/cf/code/BytecodeArray;->byteLength()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, 0xa

    .line 8
    .line 9
    iget-object v1, p0, Lcom/android/dx/cf/attrib/AttCode;->catches:Lcom/android/dx/cf/code/ByteCatchList;

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/android/dx/cf/code/ByteCatchList;->byteLength()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    iget-object p0, p0, Lcom/android/dx/cf/attrib/AttCode;->attributes:Lcom/android/dx/cf/iface/AttributeList;

    .line 17
    .line 18
    invoke-interface {p0}, Lcom/android/dx/cf/iface/AttributeList;->byteLength()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v1

    .line 23
    return p0
.end method

.method public getAttributes()Lcom/android/dx/cf/iface/AttributeList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/attrib/AttCode;->attributes:Lcom/android/dx/cf/iface/AttributeList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCatches()Lcom/android/dx/cf/code/ByteCatchList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/attrib/AttCode;->catches:Lcom/android/dx/cf/code/ByteCatchList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCode()Lcom/android/dx/cf/code/BytecodeArray;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/attrib/AttCode;->code:Lcom/android/dx/cf/code/BytecodeArray;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMaxLocals()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/attrib/AttCode;->maxLocals:I

    .line 2
    .line 3
    return p0
.end method

.method public getMaxStack()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/attrib/AttCode;->maxStack:I

    .line 2
    .line 3
    return p0
.end method
