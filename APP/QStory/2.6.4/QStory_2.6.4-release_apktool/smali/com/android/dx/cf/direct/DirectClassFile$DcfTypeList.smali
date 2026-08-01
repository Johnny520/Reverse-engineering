.class Lcom/android/dx/cf/direct/DirectClassFile$DcfTypeList;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/android/dx/rop/type/TypeList;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/cf/direct/DirectClassFile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DcfTypeList"
.end annotation


# instance fields
.field private final bytes:Lcom/android/dx/util/ByteArray;

.field private final pool:Lcom/android/dx/rop/cst/StdConstantPool;

.field private final size:I


# direct methods
.method public constructor <init>(Lcom/android/dx/util/ByteArray;IILcom/android/dx/rop/cst/StdConstantPool;Lcom/android/dx/cf/iface/ParseObserver;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-ltz p3, :cond_2

    .line 6
    .line 7
    mul-int/lit8 v1, p3, 0x2

    .line 8
    .line 9
    add-int/2addr v1, p2

    .line 10
    invoke-virtual {p1, p2, v1}, Lcom/android/dx/util/ByteArray;->slice(II)Lcom/android/dx/util/ByteArray;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/android/dx/cf/direct/DirectClassFile$DcfTypeList;->bytes:Lcom/android/dx/util/ByteArray;

    .line 15
    .line 16
    iput p3, p0, Lcom/android/dx/cf/direct/DirectClassFile$DcfTypeList;->size:I

    .line 17
    .line 18
    iput-object p4, p0, Lcom/android/dx/cf/direct/DirectClassFile$DcfTypeList;->pool:Lcom/android/dx/rop/cst/StdConstantPool;

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    :goto_0
    if-ge p0, p3, :cond_1

    .line 22
    .line 23
    mul-int/lit8 p2, p0, 0x2

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    :try_start_0
    invoke-virtual {p4, v1}, Lcom/android/dx/rop/cst/StdConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lcom/android/dx/rop/cst/CstType;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    if-eqz p5, :cond_0

    .line 36
    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v3, "  "

    .line 40
    .line 41
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const/4 v2, 0x2

    .line 52
    invoke-interface {p5, p1, p2, v2, v1}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    add-int/lit8 p0, p0, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catch_0
    move-exception p0

    .line 59
    const-string p1, "bogus class cpi"

    .line 60
    .line 61
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_1
    return-void

    .line 66
    :cond_2
    const-string p0, "size < 0"

    .line 67
    .line 68
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v0
.end method


# virtual methods
.method public getType(I)Lcom/android/dx/rop/type/Type;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/direct/DirectClassFile$DcfTypeList;->bytes:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    mul-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object p0, p0, Lcom/android/dx/cf/direct/DirectClassFile$DcfTypeList;->pool:Lcom/android/dx/rop/cst/StdConstantPool;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/cst/StdConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lcom/android/dx/rop/cst/CstType;

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstType;->getClassType()Lcom/android/dx/rop/type/Type;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public getWordCount()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/direct/DirectClassFile$DcfTypeList;->size:I

    .line 2
    .line 3
    return p0
.end method

.method public isMutable()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public size()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/direct/DirectClassFile$DcfTypeList;->size:I

    .line 2
    .line 3
    return p0
.end method

.method public withAddedType(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/TypeList;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "unsupported"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
