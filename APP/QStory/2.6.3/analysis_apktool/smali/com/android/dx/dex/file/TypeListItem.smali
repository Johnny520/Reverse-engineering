.class public final Lcom/android/dx/dex/file/TypeListItem;
.super Lcom/android/dx/dex/file/OffsettedItem;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field private static final ALIGNMENT:I = 0x4

.field private static final ELEMENT_SIZE:I = 0x2

.field private static final HEADER_SIZE:I = 0x4


# instance fields
.field private final list:Lcom/android/dx/rop/type/TypeList;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/type/TypeList;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    add-int/2addr v0, v1

    .line 9
    invoke-direct {p0, v1, v0}, Lcom/android/dx/dex/file/OffsettedItem;-><init>(II)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/android/dx/dex/file/TypeListItem;->list:Lcom/android/dx/rop/type/TypeList;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public addContents(Lcom/android/dx/dex/file/DexFile;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getTypeIds()Lcom/android/dx/dex/file/TypeIdsSection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/android/dx/dex/file/TypeListItem;->list:Lcom/android/dx/rop/type/TypeList;

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-ge v1, v0, :cond_0

    .line 13
    .line 14
    iget-object v2, p0, Lcom/android/dx/dex/file/TypeListItem;->list:Lcom/android/dx/rop/type/TypeList;

    .line 15
    .line 16
    invoke-interface {v2, v1}, Lcom/android/dx/rop/type/TypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1, v2}, Lcom/android/dx/dex/file/TypeIdsSection;->intern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/dex/file/TypeIdItem;

    .line 21
    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public compareTo0(Lcom/android/dx/dex/file/OffsettedItem;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/TypeListItem;->list:Lcom/android/dx/rop/type/TypeList;

    .line 2
    .line 3
    check-cast p1, Lcom/android/dx/dex/file/TypeListItem;

    .line 4
    .line 5
    iget-object p1, p1, Lcom/android/dx/dex/file/TypeListItem;->list:Lcom/android/dx/rop/type/TypeList;

    .line 6
    .line 7
    invoke-static {p0, p1}, Lcom/android/dx/rop/type/StdTypeList;->compareContents(Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/type/TypeList;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public getList()Lcom/android/dx/rop/type/TypeList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/TypeListItem;->list:Lcom/android/dx/rop/type/TypeList;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/TypeListItem;->list:Lcom/android/dx/rop/type/TypeList;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/android/dx/rop/type/StdTypeList;->hashContents(Lcom/android/dx/rop/type/TypeList;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public itemType()Lcom/android/dx/dex/file/ItemType;
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/dex/file/ItemType;->TYPE_TYPE_LIST:Lcom/android/dx/dex/file/ItemType;

    .line 2
    .line 3
    return-object p0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    const-string v0, "unsupported"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public writeTo0(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getTypeIds()Lcom/android/dx/dex/file/TypeIdsSection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/android/dx/dex/file/TypeListItem;->list:Lcom/android/dx/rop/type/TypeList;

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-interface {p2}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/android/dx/dex/file/OffsettedItem;->offsetString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v3, " type_list"

    .line 31
    .line 32
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {p2, v2, v1}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v3, "  size: "

    .line 45
    .line 46
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 v3, 0x4

    .line 50
    invoke-static {v0, v1, p2, v3}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲苏兰(ILjava/lang/StringBuilder;Lcom/android/dx/util/AnnotatedOutput;I)V

    .line 51
    .line 52
    .line 53
    move v1, v2

    .line 54
    :goto_0
    if-ge v1, v0, :cond_0

    .line 55
    .line 56
    iget-object v3, p0, Lcom/android/dx/dex/file/TypeListItem;->list:Lcom/android/dx/rop/type/TypeList;

    .line 57
    .line 58
    invoke-interface {v3, v1}, Lcom/android/dx/rop/type/TypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {p1, v3}, Lcom/android/dx/dex/file/TypeIdsSection;->indexOf(Lcom/android/dx/rop/type/Type;)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    new-instance v5, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v6, "  "

    .line 69
    .line 70
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v4}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v4, " // "

    .line 81
    .line 82
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    const/4 v4, 0x2

    .line 97
    invoke-interface {p2, v4, v3}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 98
    .line 99
    .line 100
    add-int/lit8 v1, v1, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_0
    invoke-interface {p2, v0}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 104
    .line 105
    .line 106
    :goto_1
    if-ge v2, v0, :cond_1

    .line 107
    .line 108
    iget-object v1, p0, Lcom/android/dx/dex/file/TypeListItem;->list:Lcom/android/dx/rop/type/TypeList;

    .line 109
    .line 110
    invoke-interface {v1, v2}, Lcom/android/dx/rop/type/TypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {p1, v1}, Lcom/android/dx/dex/file/TypeIdsSection;->indexOf(Lcom/android/dx/rop/type/Type;)I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    invoke-interface {p2, v1}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 119
    .line 120
    .line 121
    add-int/lit8 v2, v2, 0x1

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_1
    return-void
.end method
