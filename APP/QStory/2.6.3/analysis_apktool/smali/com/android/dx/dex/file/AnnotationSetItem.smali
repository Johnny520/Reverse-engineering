.class public final Lcom/android/dx/dex/file/AnnotationSetItem;
.super Lcom/android/dx/dex/file/OffsettedItem;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field private static final ALIGNMENT:I = 0x4

.field private static final ENTRY_WRITE_SIZE:I = 0x4


# instance fields
.field private final annotations:Lcom/android/dx/rop/annotation/Annotations;

.field private final items:[Lcom/android/dx/dex/file/AnnotationItem;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/dex/file/DexFile;)V
    .locals 4

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {p1}, Lcom/android/dx/dex/file/AnnotationSetItem;->writeSize(Lcom/android/dx/rop/annotation/Annotations;)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-direct {p0, v0, v1}, Lcom/android/dx/dex/file/OffsettedItem;-><init>(II)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/android/dx/dex/file/AnnotationSetItem;->annotations:Lcom/android/dx/rop/annotation/Annotations;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/android/dx/rop/annotation/Annotations;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    new-array v0, v0, [Lcom/android/dx/dex/file/AnnotationItem;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/android/dx/dex/file/AnnotationSetItem;->items:[Lcom/android/dx/dex/file/AnnotationItem;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/android/dx/rop/annotation/Annotations;->getAnnotations()Ljava/util/Collection;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 v0, 0x0

    .line 28
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lcom/android/dx/rop/annotation/Annotation;

    .line 39
    .line 40
    iget-object v2, p0, Lcom/android/dx/dex/file/AnnotationSetItem;->items:[Lcom/android/dx/dex/file/AnnotationItem;

    .line 41
    .line 42
    new-instance v3, Lcom/android/dx/dex/file/AnnotationItem;

    .line 43
    .line 44
    invoke-direct {v3, v1, p2}, Lcom/android/dx/dex/file/AnnotationItem;-><init>(Lcom/android/dx/rop/annotation/Annotation;Lcom/android/dx/dex/file/DexFile;)V

    .line 45
    .line 46
    .line 47
    aput-object v3, v2, v0

    .line 48
    .line 49
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    return-void
.end method

.method private static writeSize(Lcom/android/dx/rop/annotation/Annotations;)I
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/android/dx/rop/annotation/Annotations;->size()I

    .line 2
    .line 3
    .line 4
    move-result p0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    mul-int/lit8 p0, p0, 0x4

    .line 6
    .line 7
    add-int/lit8 p0, p0, 0x4

    .line 8
    .line 9
    return p0

    .line 10
    :catch_0
    const-string p0, "list == null"

    .line 11
    .line 12
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return p0
.end method


# virtual methods
.method public addContents(Lcom/android/dx/dex/file/DexFile;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getByteData()Lcom/android/dx/dex/file/MixedItemSection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/android/dx/dex/file/AnnotationSetItem;->items:[Lcom/android/dx/dex/file/AnnotationItem;

    .line 6
    .line 7
    array-length v0, v0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, Lcom/android/dx/dex/file/AnnotationSetItem;->items:[Lcom/android/dx/dex/file/AnnotationItem;

    .line 12
    .line 13
    aget-object v3, v2, v1

    .line 14
    .line 15
    invoke-virtual {p1, v3}, Lcom/android/dx/dex/file/MixedItemSection;->intern(Lcom/android/dx/dex/file/OffsettedItem;)Lcom/android/dx/dex/file/OffsettedItem;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lcom/android/dx/dex/file/AnnotationItem;

    .line 20
    .line 21
    aput-object v3, v2, v1

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
    check-cast p1, Lcom/android/dx/dex/file/AnnotationSetItem;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationSetItem;->annotations:Lcom/android/dx/rop/annotation/Annotations;

    .line 4
    .line 5
    iget-object p1, p1, Lcom/android/dx/dex/file/AnnotationSetItem;->annotations:Lcom/android/dx/rop/annotation/Annotations;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/annotation/Annotations;->compareTo(Lcom/android/dx/rop/annotation/Annotations;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public getAnnotations()Lcom/android/dx/rop/annotation/Annotations;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationSetItem;->annotations:Lcom/android/dx/rop/annotation/Annotations;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationSetItem;->annotations:Lcom/android/dx/rop/annotation/Annotations;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/annotation/Annotations;->hashCode()I

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
    sget-object p0, Lcom/android/dx/dex/file/ItemType;->TYPE_ANNOTATION_SET_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 2
    .line 3
    return-object p0
.end method

.method public place0(Lcom/android/dx/dex/file/Section;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationSetItem;->items:[Lcom/android/dx/dex/file/AnnotationItem;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/android/dx/dex/file/AnnotationItem;->sortByTypeIdIndex([Lcom/android/dx/dex/file/AnnotationItem;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public toHuman()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationSetItem;->annotations:Lcom/android/dx/rop/annotation/Annotations;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/annotation/Annotations;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public writeTo0(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 6

    .line 1
    invoke-interface {p2}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Lcom/android/dx/dex/file/AnnotationSetItem;->items:[Lcom/android/dx/dex/file/AnnotationItem;

    .line 6
    .line 7
    array-length v0, v0

    .line 8
    const/4 v1, 0x4

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    new-instance v3, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/android/dx/dex/file/OffsettedItem;->offsetString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v4, " annotation set"

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-interface {p2, v2, v3}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    new-instance v3, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v4, "  size: "

    .line 39
    .line 40
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v3, p2, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲苏兰(ILjava/lang/StringBuilder;Lcom/android/dx/util/AnnotatedOutput;I)V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-interface {p2, v0}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 47
    .line 48
    .line 49
    :goto_0
    if-ge v2, v0, :cond_2

    .line 50
    .line 51
    iget-object v3, p0, Lcom/android/dx/dex/file/AnnotationSetItem;->items:[Lcom/android/dx/dex/file/AnnotationItem;

    .line 52
    .line 53
    aget-object v3, v3, v2

    .line 54
    .line 55
    invoke-virtual {v3}, Lcom/android/dx/dex/file/OffsettedItem;->getAbsoluteOffset()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    new-instance v4, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v5, "  entries["

    .line 64
    .line 65
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v5, "]: "

    .line 76
    .line 77
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-static {v3}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-interface {p2, v1, v4}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object v4, p0, Lcom/android/dx/dex/file/AnnotationSetItem;->items:[Lcom/android/dx/dex/file/AnnotationItem;

    .line 95
    .line 96
    aget-object v4, v4, v2

    .line 97
    .line 98
    const-string v5, "    "

    .line 99
    .line 100
    invoke-virtual {v4, p2, v5}, Lcom/android/dx/dex/file/AnnotationItem;->annotateTo(Lcom/android/dx/util/AnnotatedOutput;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_1
    invoke-interface {p2, v3}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 104
    .line 105
    .line 106
    add-int/lit8 v2, v2, 0x1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    return-void
.end method
