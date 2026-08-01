.class public final Lcom/android/dx/dex/file/AnnotationItem;
.super Lcom/android/dx/dex/file/OffsettedItem;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/dex/file/AnnotationItem$TypeIdSorter;
    }
.end annotation


# static fields
.field private static final ALIGNMENT:I = 0x1

.field private static final TYPE_ID_SORTER:Lcom/android/dx/dex/file/AnnotationItem$TypeIdSorter;

.field private static final VISIBILITY_BUILD:I = 0x0

.field private static final VISIBILITY_RUNTIME:I = 0x1

.field private static final VISIBILITY_SYSTEM:I = 0x2


# instance fields
.field private final annotation:Lcom/android/dx/rop/annotation/Annotation;

.field private encodedForm:[B

.field private type:Lcom/android/dx/dex/file/TypeIdItem;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/dex/file/AnnotationItem$TypeIdSorter;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/android/dx/dex/file/AnnotationItem$TypeIdSorter;-><init>(Lcom/android/dx/dex/file/AnnotationItem$1;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/android/dx/dex/file/AnnotationItem;->TYPE_ID_SORTER:Lcom/android/dx/dex/file/AnnotationItem$TypeIdSorter;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/android/dx/rop/annotation/Annotation;Lcom/android/dx/dex/file/DexFile;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, -0x1

    .line 3
    invoke-direct {p0, v0, v1}, Lcom/android/dx/dex/file/OffsettedItem;-><init>(II)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lcom/android/dx/dex/file/AnnotationItem;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/android/dx/dex/file/AnnotationItem;->type:Lcom/android/dx/dex/file/TypeIdItem;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/android/dx/dex/file/AnnotationItem;->encodedForm:[B

    .line 14
    .line 15
    invoke-virtual {p0, p2}, Lcom/android/dx/dex/file/AnnotationItem;->addContents(Lcom/android/dx/dex/file/DexFile;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "annotation == null"

    .line 20
    .line 21
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0
.end method

.method public static synthetic access$100(Lcom/android/dx/dex/file/AnnotationItem;)Lcom/android/dx/dex/file/TypeIdItem;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationItem;->type:Lcom/android/dx/dex/file/TypeIdItem;

    .line 2
    .line 3
    return-object p0
.end method

.method public static sortByTypeIdIndex([Lcom/android/dx/dex/file/AnnotationItem;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/android/dx/dex/file/AnnotationItem;->TYPE_ID_SORTER:Lcom/android/dx/dex/file/AnnotationItem$TypeIdSorter;

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public addContents(Lcom/android/dx/dex/file/DexFile;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getTypeIds()Lcom/android/dx/dex/file/TypeIdsSection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/android/dx/dex/file/AnnotationItem;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/android/dx/rop/annotation/Annotation;->getType()Lcom/android/dx/rop/cst/CstType;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lcom/android/dx/dex/file/TypeIdsSection;->intern(Lcom/android/dx/rop/cst/CstType;)Lcom/android/dx/dex/file/TypeIdItem;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/android/dx/dex/file/AnnotationItem;->type:Lcom/android/dx/dex/file/TypeIdItem;

    .line 16
    .line 17
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationItem;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 18
    .line 19
    invoke-static {p1, p0}, Lcom/android/dx/dex/file/ValueEncoder;->addContents(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/rop/annotation/Annotation;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public annotateTo(Lcom/android/dx/util/AnnotatedOutput;Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "visibility: "

    .line 2
    .line 3
    invoke-static {p2, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/dex/file/AnnotationItem;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/android/dx/rop/annotation/Annotation;->getVisibility()Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lcom/android/dx/rop/annotation/AnnotationVisibility;->toHuman()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-interface {p1, v1, v0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v2, "type: "

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Lcom/android/dx/dex/file/AnnotationItem;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 42
    .line 43
    invoke-virtual {v2}, Lcom/android/dx/rop/annotation/Annotation;->getType()Lcom/android/dx/rop/cst/CstType;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-interface {p1, v1, v0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationItem;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/android/dx/rop/annotation/Annotation;->getNameValuePairs()Ljava/util/Collection;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_0

    .line 76
    .line 77
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lcom/android/dx/rop/annotation/NameValuePair;

    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/android/dx/rop/annotation/NameValuePair;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v0}, Lcom/android/dx/rop/annotation/NameValuePair;->getValue()Lcom/android/dx/rop/cst/Constant;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {p2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v2}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v2, ": "

    .line 103
    .line 104
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-static {v0}, Lcom/android/dx/dex/file/ValueEncoder;->constantToHuman(Lcom/android/dx/rop/cst/Constant;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-interface {p1, v1, v0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_0
    return-void
.end method

.method public compareTo0(Lcom/android/dx/dex/file/OffsettedItem;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/android/dx/dex/file/AnnotationItem;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationItem;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 4
    .line 5
    iget-object p1, p1, Lcom/android/dx/dex/file/AnnotationItem;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/annotation/Annotation;->compareTo(Lcom/android/dx/rop/annotation/Annotation;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationItem;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/annotation/Annotation;->hashCode()I

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
    sget-object p0, Lcom/android/dx/dex/file/ItemType;->TYPE_ANNOTATION_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 2
    .line 3
    return-object p0
.end method

.method public place0(Lcom/android/dx/dex/file/Section;I)V
    .locals 2

    .line 1
    new-instance p2, Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 2
    .line 3
    invoke-direct {p2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/android/dx/dex/file/ValueEncoder;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/android/dx/dex/file/Section;->getFile()Lcom/android/dx/dex/file/DexFile;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {v0, p1, p2}, Lcom/android/dx/dex/file/ValueEncoder;-><init>(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/android/dx/dex/file/AnnotationItem;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, p1, v1}, Lcom/android/dx/dex/file/ValueEncoder;->writeAnnotation(Lcom/android/dx/rop/annotation/Annotation;Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->toByteArray()[B

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lcom/android/dx/dex/file/AnnotationItem;->encodedForm:[B

    .line 26
    .line 27
    array-length p1, p1

    .line 28
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/OffsettedItem;->setWriteSize(I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public toHuman()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationItem;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/annotation/Annotation;->toHuman()Ljava/lang/String;

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
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/android/dx/dex/file/AnnotationItem;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/android/dx/rop/annotation/Annotation;->getVisibility()Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v4, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/android/dx/dex/file/OffsettedItem;->offsetString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v5, " annotation"

    .line 28
    .line 29
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-interface {p2, v2, v4}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    new-instance v4, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v5, "  visibility: VISBILITY_"

    .line 42
    .line 43
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-interface {p2, v3, v4}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    sget-object v4, Lcom/android/dx/dex/file/AnnotationItem$1;->$SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility:[I

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    aget v1, v4, v1

    .line 63
    .line 64
    if-eq v1, v3, :cond_3

    .line 65
    .line 66
    const/4 v2, 0x2

    .line 67
    if-eq v1, v2, :cond_2

    .line 68
    .line 69
    const/4 v4, 0x3

    .line 70
    if-ne v1, v4, :cond_1

    .line 71
    .line 72
    invoke-interface {p2, v2}, Lcom/android/dx/util/Output;->writeByte(I)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    const-string p0, "shouldn\'t happen"

    .line 77
    .line 78
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_2
    invoke-interface {p2, v3}, Lcom/android/dx/util/Output;->writeByte(I)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    invoke-interface {p2, v2}, Lcom/android/dx/util/Output;->writeByte(I)V

    .line 87
    .line 88
    .line 89
    :goto_0
    if-eqz v0, :cond_4

    .line 90
    .line 91
    new-instance v0, Lcom/android/dx/dex/file/ValueEncoder;

    .line 92
    .line 93
    invoke-direct {v0, p1, p2}, Lcom/android/dx/dex/file/ValueEncoder;-><init>(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V

    .line 94
    .line 95
    .line 96
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationItem;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 97
    .line 98
    invoke-virtual {v0, p0, v3}, Lcom/android/dx/dex/file/ValueEncoder;->writeAnnotation(Lcom/android/dx/rop/annotation/Annotation;Z)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_4
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationItem;->encodedForm:[B

    .line 103
    .line 104
    invoke-interface {p2, p0}, Lcom/android/dx/util/Output;->write([B)V

    .line 105
    .line 106
    .line 107
    return-void
.end method
