.class public final Lcom/android/dx/dex/file/StringDataItem;
.super Lcom/android/dx/dex/file/OffsettedItem;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final value:Lcom/android/dx/rop/cst/CstString;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstString;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1}, Lcom/android/dx/dex/file/StringDataItem;->writeSize(Lcom/android/dx/rop/cst/CstString;)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-direct {p0, v0, v1}, Lcom/android/dx/dex/file/OffsettedItem;-><init>(II)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/android/dx/dex/file/StringDataItem;->value:Lcom/android/dx/rop/cst/CstString;

    .line 10
    .line 11
    return-void
.end method

.method private static writeSize(Lcom/android/dx/rop/cst/CstString;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstString;->getUtf16Size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子苏兰哲世楪(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstString;->getUtf8Size()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-int/2addr p0, v0

    .line 14
    add-int/lit8 p0, p0, 0x1

    .line 15
    .line 16
    return p0
.end method


# virtual methods
.method public addContents(Lcom/android/dx/dex/file/DexFile;)V
    .locals 0

    .line 1
    return-void
.end method

.method public compareTo0(Lcom/android/dx/dex/file/OffsettedItem;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/android/dx/dex/file/StringDataItem;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/dex/file/StringDataItem;->value:Lcom/android/dx/rop/cst/CstString;

    .line 4
    .line 5
    iget-object p1, p1, Lcom/android/dx/dex/file/StringDataItem;->value:Lcom/android/dx/rop/cst/CstString;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/cst/Constant;->compareTo(Lcom/android/dx/rop/cst/Constant;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public itemType()Lcom/android/dx/dex/file/ItemType;
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/dex/file/ItemType;->TYPE_STRING_DATA_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 2
    .line 3
    return-object p0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/StringDataItem;->value:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstString;->toQuoted()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public writeTo0(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/android/dx/dex/file/StringDataItem;->value:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstString;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/android/dx/dex/file/StringDataItem;->value:Lcom/android/dx/rop/cst/CstString;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstString;->getUtf16Size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-interface {p2}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子苏兰哲世楪(I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v3, "utf16_size: "

    .line 26
    .line 27
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {p2, v1, v2}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/android/dx/util/ByteArray;->size()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    iget-object p0, p0, Lcom/android/dx/dex/file/StringDataItem;->value:Lcom/android/dx/rop/cst/CstString;

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstString;->toQuoted()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-interface {p2, v1, p0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    invoke-interface {p2, v0}, Lcom/android/dx/util/Output;->writeUleb128(I)I

    .line 60
    .line 61
    .line 62
    invoke-interface {p2, p1}, Lcom/android/dx/util/Output;->write(Lcom/android/dx/util/ByteArray;)V

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x0

    .line 66
    invoke-interface {p2, p0}, Lcom/android/dx/util/Output;->writeByte(I)V

    .line 67
    .line 68
    .line 69
    return-void
.end method
