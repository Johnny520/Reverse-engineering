.class public final Lcom/android/dx/dex/file/ParameterAnnotationStruct;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/android/dx/util/ToHuman;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/dx/util/ToHuman;",
        "Ljava/lang/Comparable<",
        "Lcom/android/dx/dex/file/ParameterAnnotationStruct;",
        ">;"
    }
.end annotation


# instance fields
.field private final annotationsItem:Lcom/android/dx/dex/file/UniformListItem;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/dex/file/UniformListItem<",
            "Lcom/android/dx/dex/file/AnnotationSetRefItem;",
            ">;"
        }
    .end annotation
.end field

.field private final annotationsList:Lcom/android/dx/rop/annotation/AnnotationsList;

.field private final method:Lcom/android/dx/rop/cst/CstMethodRef;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstMethodRef;Lcom/android/dx/rop/annotation/AnnotationsList;Lcom/android/dx/dex/file/DexFile;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    iput-object p1, p0, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->annotationsList:Lcom/android/dx/rop/annotation/AnnotationsList;

    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-ge v1, p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p2, v1}, Lcom/android/dx/rop/annotation/AnnotationsList;->get(I)Lcom/android/dx/rop/annotation/Annotations;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    new-instance v3, Lcom/android/dx/dex/file/AnnotationSetItem;

    .line 30
    .line 31
    invoke-direct {v3, v2, p3}, Lcom/android/dx/dex/file/AnnotationSetItem;-><init>(Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/dex/file/DexFile;)V

    .line 32
    .line 33
    .line 34
    new-instance v2, Lcom/android/dx/dex/file/AnnotationSetRefItem;

    .line 35
    .line 36
    invoke-direct {v2, v3}, Lcom/android/dx/dex/file/AnnotationSetRefItem;-><init>(Lcom/android/dx/dex/file/AnnotationSetItem;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance p1, Lcom/android/dx/dex/file/UniformListItem;

    .line 46
    .line 47
    sget-object p2, Lcom/android/dx/dex/file/ItemType;->TYPE_ANNOTATION_SET_REF_LIST:Lcom/android/dx/dex/file/ItemType;

    .line 48
    .line 49
    invoke-direct {p1, p2, v0}, Lcom/android/dx/dex/file/UniformListItem;-><init>(Lcom/android/dx/dex/file/ItemType;Ljava/util/List;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->annotationsItem:Lcom/android/dx/dex/file/UniformListItem;

    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    const-string p0, "annotationsList == null"

    .line 56
    .line 57
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_2
    const-string p0, "method == null"

    .line 62
    .line 63
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v0
.end method


# virtual methods
.method public addContents(Lcom/android/dx/dex/file/DexFile;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getMethodIds()Lcom/android/dx/dex/file/MethodIdsSection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getWordData()Lcom/android/dx/dex/file/MixedItemSection;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v1, p0, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/android/dx/dex/file/MethodIdsSection;->intern(Lcom/android/dx/rop/cst/CstBaseMethodRef;)Lcom/android/dx/dex/file/MethodIdItem;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->annotationsItem:Lcom/android/dx/dex/file/UniformListItem;

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lcom/android/dx/dex/file/MixedItemSection;->add(Lcom/android/dx/dex/file/OffsettedItem;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public compareTo(Lcom/android/dx/dex/file/ParameterAnnotationStruct;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/cst/Constant;->compareTo(Lcom/android/dx/rop/cst/Constant;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 10
    check-cast p1, Lcom/android/dx/dex/file/ParameterAnnotationStruct;

    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->compareTo(Lcom/android/dx/dex/file/ParameterAnnotationStruct;)I

    move-result p0

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/android/dx/dex/file/ParameterAnnotationStruct;

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
    iget-object p0, p0, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 8
    .line 9
    check-cast p1, Lcom/android/dx/dex/file/ParameterAnnotationStruct;

    .line 10
    .line 11
    iget-object p1, p1, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/cst/CstMemberRef;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public getAnnotationsList()Lcom/android/dx/rop/annotation/AnnotationsList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->annotationsList:Lcom/android/dx/rop/annotation/AnnotationsList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMethod()Lcom/android/dx/rop/cst/CstMethodRef;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/android/dx/rop/cst/CstMemberRef;->toHuman()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ": "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->annotationsItem:Lcom/android/dx/dex/file/UniformListItem;

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/android/dx/dex/file/UniformListItem;->getItems()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const/4 v1, 0x1

    .line 31
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lcom/android/dx/dex/file/AnnotationSetRefItem;

    .line 42
    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    const-string v3, ", "

    .line 48
    .line 49
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    :goto_1
    invoke-virtual {v2}, Lcom/android/dx/dex/file/AnnotationSetRefItem;->toHuman()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method

.method public writeTo(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getMethodIds()Lcom/android/dx/dex/file/MethodIdsSection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/android/dx/dex/file/MethodIdsSection;->indexOf(Lcom/android/dx/rop/cst/CstBaseMethodRef;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->annotationsItem:Lcom/android/dx/dex/file/UniformListItem;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/android/dx/dex/file/OffsettedItem;->getAbsoluteOffset()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-interface {p2}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v2, "    "

    .line 26
    .line 27
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->method:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->toHuman()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-interface {p2, v1, p0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    new-instance p0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v1, "      method_idx:      "

    .line 50
    .line 51
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const/4 v1, 0x4

    .line 66
    invoke-interface {p2, v1, p0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    new-instance p0, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v2, "      annotations_off: "

    .line 72
    .line 73
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v0, p0, p2, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲苏兰(ILjava/lang/StringBuilder;Lcom/android/dx/util/AnnotatedOutput;I)V

    .line 77
    .line 78
    .line 79
    :cond_0
    invoke-interface {p2, p1}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 80
    .line 81
    .line 82
    invoke-interface {p2, v0}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 83
    .line 84
    .line 85
    return-void
.end method
