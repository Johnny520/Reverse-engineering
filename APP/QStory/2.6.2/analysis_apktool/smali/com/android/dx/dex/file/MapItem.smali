.class public final Lcom/android/dx/dex/file/MapItem;
.super Lcom/android/dx/dex/file/OffsettedItem;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field private static final ALIGNMENT:I = 0x4

.field private static final WRITE_SIZE:I = 0xc


# instance fields
.field private final firstItem:Lcom/android/dx/dex/file/Item;

.field private final itemCount:I

.field private final lastItem:Lcom/android/dx/dex/file/Item;

.field private final section:Lcom/android/dx/dex/file/Section;

.field private final type:Lcom/android/dx/dex/file/ItemType;


# direct methods
.method private constructor <init>(Lcom/android/dx/dex/file/ItemType;Lcom/android/dx/dex/file/Section;Lcom/android/dx/dex/file/Item;Lcom/android/dx/dex/file/Item;I)V
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    const/16 v1, 0xc

    .line 3
    .line 4
    invoke-direct {p0, v0, v1}, Lcom/android/dx/dex/file/OffsettedItem;-><init>(II)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_4

    .line 9
    .line 10
    if-eqz p2, :cond_3

    .line 11
    .line 12
    if-eqz p3, :cond_2

    .line 13
    .line 14
    if-eqz p4, :cond_1

    .line 15
    .line 16
    if-lez p5, :cond_0

    .line 17
    .line 18
    iput-object p1, p0, Lcom/android/dx/dex/file/MapItem;->type:Lcom/android/dx/dex/file/ItemType;

    .line 19
    .line 20
    iput-object p2, p0, Lcom/android/dx/dex/file/MapItem;->section:Lcom/android/dx/dex/file/Section;

    .line 21
    .line 22
    iput-object p3, p0, Lcom/android/dx/dex/file/MapItem;->firstItem:Lcom/android/dx/dex/file/Item;

    .line 23
    .line 24
    iput-object p4, p0, Lcom/android/dx/dex/file/MapItem;->lastItem:Lcom/android/dx/dex/file/Item;

    .line 25
    .line 26
    iput p5, p0, Lcom/android/dx/dex/file/MapItem;->itemCount:I

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    const-string p0, "itemCount <= 0"

    .line 30
    .line 31
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0

    .line 35
    :cond_1
    const-string p0, "lastItem == null"

    .line 36
    .line 37
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :cond_2
    const-string p0, "firstItem == null"

    .line 42
    .line 43
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :cond_3
    const-string p0, "section == null"

    .line 48
    .line 49
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0

    .line 53
    :cond_4
    const-string p0, "type == null"

    .line 54
    .line 55
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0
.end method

.method private constructor <init>(Lcom/android/dx/dex/file/Section;)V
    .locals 2

    const/4 v0, 0x4

    const/16 v1, 0xc

    .line 59
    invoke-direct {p0, v0, v1}, Lcom/android/dx/dex/file/OffsettedItem;-><init>(II)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 60
    sget-object v1, Lcom/android/dx/dex/file/ItemType;->TYPE_MAP_LIST:Lcom/android/dx/dex/file/ItemType;

    iput-object v1, p0, Lcom/android/dx/dex/file/MapItem;->type:Lcom/android/dx/dex/file/ItemType;

    .line 61
    iput-object p1, p0, Lcom/android/dx/dex/file/MapItem;->section:Lcom/android/dx/dex/file/Section;

    .line 62
    iput-object v0, p0, Lcom/android/dx/dex/file/MapItem;->firstItem:Lcom/android/dx/dex/file/Item;

    .line 63
    iput-object v0, p0, Lcom/android/dx/dex/file/MapItem;->lastItem:Lcom/android/dx/dex/file/Item;

    const/4 p1, 0x1

    .line 64
    iput p1, p0, Lcom/android/dx/dex/file/MapItem;->itemCount:I

    return-void

    .line 65
    :cond_0
    const-string p0, "section == null"

    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    throw v0
.end method

.method public static addMap([Lcom/android/dx/dex/file/Section;Lcom/android/dx/dex/file/MixedItemSection;)V
    .locals 13

    .line 1
    if-eqz p0, :cond_7

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/dex/file/MixedItemSection;->items()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_6

    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v1, 0x32

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    array-length v1, p0

    .line 21
    const/4 v2, 0x0

    .line 22
    move v3, v2

    .line 23
    :goto_0
    if-ge v3, v1, :cond_5

    .line 24
    .line 25
    aget-object v6, p0, v3

    .line 26
    .line 27
    invoke-virtual {v6}, Lcom/android/dx/dex/file/Section;->items()Ljava/util/Collection;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v10

    .line 35
    const/4 v4, 0x0

    .line 36
    move v9, v2

    .line 37
    move-object v5, v4

    .line 38
    move-object v7, v5

    .line 39
    move-object v8, v7

    .line 40
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    move-object v11, v4

    .line 51
    check-cast v11, Lcom/android/dx/dex/file/Item;

    .line 52
    .line 53
    invoke-virtual {v11}, Lcom/android/dx/dex/file/Item;->itemType()Lcom/android/dx/dex/file/ItemType;

    .line 54
    .line 55
    .line 56
    move-result-object v12

    .line 57
    if-eq v12, v5, :cond_1

    .line 58
    .line 59
    if-eqz v9, :cond_0

    .line 60
    .line 61
    new-instance v4, Lcom/android/dx/dex/file/MapItem;

    .line 62
    .line 63
    invoke-direct/range {v4 .. v9}, Lcom/android/dx/dex/file/MapItem;-><init>(Lcom/android/dx/dex/file/ItemType;Lcom/android/dx/dex/file/Section;Lcom/android/dx/dex/file/Item;Lcom/android/dx/dex/file/Item;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    :cond_0
    move v9, v2

    .line 70
    move-object v7, v11

    .line 71
    move-object v5, v12

    .line 72
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 73
    .line 74
    move-object v8, v11

    .line 75
    goto :goto_1

    .line 76
    :cond_2
    if-eqz v9, :cond_3

    .line 77
    .line 78
    new-instance v4, Lcom/android/dx/dex/file/MapItem;

    .line 79
    .line 80
    invoke-direct/range {v4 .. v9}, Lcom/android/dx/dex/file/MapItem;-><init>(Lcom/android/dx/dex/file/ItemType;Lcom/android/dx/dex/file/Section;Lcom/android/dx/dex/file/Item;Lcom/android/dx/dex/file/Item;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    if-ne v6, p1, :cond_4

    .line 88
    .line 89
    new-instance v4, Lcom/android/dx/dex/file/MapItem;

    .line 90
    .line 91
    invoke-direct {v4, p1}, Lcom/android/dx/dex/file/MapItem;-><init>(Lcom/android/dx/dex/file/Section;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    :cond_4
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_5
    new-instance p0, Lcom/android/dx/dex/file/UniformListItem;

    .line 101
    .line 102
    sget-object v1, Lcom/android/dx/dex/file/ItemType;->TYPE_MAP_LIST:Lcom/android/dx/dex/file/ItemType;

    .line 103
    .line 104
    invoke-direct {p0, v1, v0}, Lcom/android/dx/dex/file/UniformListItem;-><init>(Lcom/android/dx/dex/file/ItemType;Ljava/util/List;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, p0}, Lcom/android/dx/dex/file/MixedItemSection;->add(Lcom/android/dx/dex/file/OffsettedItem;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_6
    const-string p0, "mapSection.items().size() != 0"

    .line 112
    .line 113
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_7
    const-string p0, "sections == null"

    .line 118
    .line 119
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-void
.end method


# virtual methods
.method public addContents(Lcom/android/dx/dex/file/DexFile;)V
    .locals 0

    .line 1
    return-void
.end method

.method public itemType()Lcom/android/dx/dex/file/ItemType;
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/dex/file/ItemType;->TYPE_MAP_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toHuman()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/file/MapItem;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-class v1, Lcom/android/dx/dex/file/MapItem;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x7b

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/android/dx/dex/file/MapItem;->section:Lcom/android/dx/dex/file/Section;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const/16 v1, 0x20

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Lcom/android/dx/dex/file/MapItem;->type:Lcom/android/dx/dex/file/ItemType;

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/android/dx/dex/file/ItemType;->toHuman()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const/16 p0, 0x7d

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method

.method public writeTo0(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lcom/android/dx/dex/file/MapItem;->type:Lcom/android/dx/dex/file/ItemType;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/dex/file/ItemType;->getMapValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v0, p0, Lcom/android/dx/dex/file/MapItem;->firstItem:Lcom/android/dx/dex/file/Item;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/android/dx/dex/file/MapItem;->section:Lcom/android/dx/dex/file/Section;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/android/dx/dex/file/Section;->getFileOffset()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v1, v0}, Lcom/android/dx/dex/file/Section;->getAbsoluteItemOffset(Lcom/android/dx/dex/file/Item;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    :goto_0
    invoke-interface {p2}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/android/dx/dex/file/OffsettedItem;->offsetString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const/16 v3, 0x20

    .line 42
    .line 43
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v3, p0, Lcom/android/dx/dex/file/MapItem;->type:Lcom/android/dx/dex/file/ItemType;

    .line 47
    .line 48
    invoke-virtual {v3}, Lcom/android/dx/dex/file/ItemType;->getTypeName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v3, " map"

    .line 56
    .line 57
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-interface {p2, v2, v1}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    new-instance v1, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v3, "  type:   "

    .line 70
    .line 71
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v3, " // "

    .line 82
    .line 83
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object v3, p0, Lcom/android/dx/dex/file/MapItem;->type:Lcom/android/dx/dex/file/ItemType;

    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    const/4 v3, 0x2

    .line 100
    invoke-interface {p2, v3, v1}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const-string v1, "  unused: 0"

    .line 104
    .line 105
    invoke-interface {p2, v3, v1}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 106
    .line 107
    .line 108
    new-instance v1, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v3, "  size:   "

    .line 111
    .line 112
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iget v3, p0, Lcom/android/dx/dex/file/MapItem;->itemCount:I

    .line 116
    .line 117
    invoke-static {v3}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    const/4 v3, 0x4

    .line 129
    invoke-interface {p2, v3, v1}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 130
    .line 131
    .line 132
    new-instance v1, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string v4, "  offset: "

    .line 135
    .line 136
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v0, v1, p2, v3}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲兰苏(ILjava/lang/StringBuilder;Lcom/android/dx/util/AnnotatedOutput;I)V

    .line 140
    .line 141
    .line 142
    :cond_1
    invoke-interface {p2, p1}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 143
    .line 144
    .line 145
    invoke-interface {p2, v2}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 146
    .line 147
    .line 148
    iget p0, p0, Lcom/android/dx/dex/file/MapItem;->itemCount:I

    .line 149
    .line 150
    invoke-interface {p2, p0}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 151
    .line 152
    .line 153
    invoke-interface {p2, v0}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 154
    .line 155
    .line 156
    return-void
.end method
