.class public final Lcom/android/dx/dex/file/ClassDefItem;
.super Lcom/android/dx/dex/file/IndexedItem;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final accessFlags:I

.field private annotationsDirectory:Lcom/android/dx/dex/file/AnnotationsDirectoryItem;

.field private final classData:Lcom/android/dx/dex/file/ClassDataItem;

.field private interfaces:Lcom/android/dx/dex/file/TypeListItem;

.field private final sourceFile:Lcom/android/dx/rop/cst/CstString;

.field private staticValuesItem:Lcom/android/dx/dex/file/EncodedArrayItem;

.field private final superclass:Lcom/android/dx/rop/cst/CstType;

.field private final thisClass:Lcom/android/dx/rop/cst/CstType;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstType;ILcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/CstString;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/android/dx/dex/file/IndexedItem;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    if-eqz p4, :cond_1

    .line 8
    .line 9
    iput-object p1, p0, Lcom/android/dx/dex/file/ClassDefItem;->thisClass:Lcom/android/dx/rop/cst/CstType;

    .line 10
    .line 11
    iput p2, p0, Lcom/android/dx/dex/file/ClassDefItem;->accessFlags:I

    .line 12
    .line 13
    iput-object p3, p0, Lcom/android/dx/dex/file/ClassDefItem;->superclass:Lcom/android/dx/rop/cst/CstType;

    .line 14
    .line 15
    invoke-interface {p4}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    move-object p2, v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p2, Lcom/android/dx/dex/file/TypeListItem;

    .line 24
    .line 25
    invoke-direct {p2, p4}, Lcom/android/dx/dex/file/TypeListItem;-><init>(Lcom/android/dx/rop/type/TypeList;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iput-object p2, p0, Lcom/android/dx/dex/file/ClassDefItem;->interfaces:Lcom/android/dx/dex/file/TypeListItem;

    .line 29
    .line 30
    iput-object p5, p0, Lcom/android/dx/dex/file/ClassDefItem;->sourceFile:Lcom/android/dx/rop/cst/CstString;

    .line 31
    .line 32
    new-instance p2, Lcom/android/dx/dex/file/ClassDataItem;

    .line 33
    .line 34
    invoke-direct {p2, p1}, Lcom/android/dx/dex/file/ClassDataItem;-><init>(Lcom/android/dx/rop/cst/CstType;)V

    .line 35
    .line 36
    .line 37
    iput-object p2, p0, Lcom/android/dx/dex/file/ClassDefItem;->classData:Lcom/android/dx/dex/file/ClassDataItem;

    .line 38
    .line 39
    iput-object v0, p0, Lcom/android/dx/dex/file/ClassDefItem;->staticValuesItem:Lcom/android/dx/dex/file/EncodedArrayItem;

    .line 40
    .line 41
    new-instance p1, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;

    .line 42
    .line 43
    invoke-direct {p1}, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lcom/android/dx/dex/file/ClassDefItem;->annotationsDirectory:Lcom/android/dx/dex/file/AnnotationsDirectoryItem;

    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    const-string p0, "interfaces == null"

    .line 50
    .line 51
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0

    .line 55
    :cond_2
    const-string p0, "thisClass == null"

    .line 56
    .line 57
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0
.end method


# virtual methods
.method public addContents(Lcom/android/dx/dex/file/DexFile;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getTypeIds()Lcom/android/dx/dex/file/TypeIdsSection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getByteData()Lcom/android/dx/dex/file/MixedItemSection;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getWordData()Lcom/android/dx/dex/file/MixedItemSection;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getTypeLists()Lcom/android/dx/dex/file/MixedItemSection;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getStringIds()Lcom/android/dx/dex/file/StringIdsSection;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-object v5, p0, Lcom/android/dx/dex/file/ClassDefItem;->thisClass:Lcom/android/dx/rop/cst/CstType;

    .line 22
    .line 23
    invoke-virtual {v0, v5}, Lcom/android/dx/dex/file/TypeIdsSection;->intern(Lcom/android/dx/rop/cst/CstType;)Lcom/android/dx/dex/file/TypeIdItem;

    .line 24
    .line 25
    .line 26
    iget-object v5, p0, Lcom/android/dx/dex/file/ClassDefItem;->classData:Lcom/android/dx/dex/file/ClassDataItem;

    .line 27
    .line 28
    invoke-virtual {v5}, Lcom/android/dx/dex/file/ClassDataItem;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-nez v5, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getClassData()Lcom/android/dx/dex/file/MixedItemSection;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object v5, p0, Lcom/android/dx/dex/file/ClassDefItem;->classData:Lcom/android/dx/dex/file/ClassDataItem;

    .line 39
    .line 40
    invoke-virtual {p1, v5}, Lcom/android/dx/dex/file/MixedItemSection;->add(Lcom/android/dx/dex/file/OffsettedItem;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lcom/android/dx/dex/file/ClassDefItem;->classData:Lcom/android/dx/dex/file/ClassDataItem;

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/android/dx/dex/file/ClassDataItem;->getStaticValuesConstant()Lcom/android/dx/rop/cst/CstArray;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    new-instance v5, Lcom/android/dx/dex/file/EncodedArrayItem;

    .line 52
    .line 53
    invoke-direct {v5, p1}, Lcom/android/dx/dex/file/EncodedArrayItem;-><init>(Lcom/android/dx/rop/cst/CstArray;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v5}, Lcom/android/dx/dex/file/MixedItemSection;->intern(Lcom/android/dx/dex/file/OffsettedItem;)Lcom/android/dx/dex/file/OffsettedItem;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Lcom/android/dx/dex/file/EncodedArrayItem;

    .line 61
    .line 62
    iput-object p1, p0, Lcom/android/dx/dex/file/ClassDefItem;->staticValuesItem:Lcom/android/dx/dex/file/EncodedArrayItem;

    .line 63
    .line 64
    :cond_0
    iget-object p1, p0, Lcom/android/dx/dex/file/ClassDefItem;->superclass:Lcom/android/dx/rop/cst/CstType;

    .line 65
    .line 66
    if-eqz p1, :cond_1

    .line 67
    .line 68
    invoke-virtual {v0, p1}, Lcom/android/dx/dex/file/TypeIdsSection;->intern(Lcom/android/dx/rop/cst/CstType;)Lcom/android/dx/dex/file/TypeIdItem;

    .line 69
    .line 70
    .line 71
    :cond_1
    iget-object p1, p0, Lcom/android/dx/dex/file/ClassDefItem;->interfaces:Lcom/android/dx/dex/file/TypeListItem;

    .line 72
    .line 73
    if-eqz p1, :cond_2

    .line 74
    .line 75
    invoke-virtual {v3, p1}, Lcom/android/dx/dex/file/MixedItemSection;->intern(Lcom/android/dx/dex/file/OffsettedItem;)Lcom/android/dx/dex/file/OffsettedItem;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Lcom/android/dx/dex/file/TypeListItem;

    .line 80
    .line 81
    iput-object p1, p0, Lcom/android/dx/dex/file/ClassDefItem;->interfaces:Lcom/android/dx/dex/file/TypeListItem;

    .line 82
    .line 83
    :cond_2
    iget-object p1, p0, Lcom/android/dx/dex/file/ClassDefItem;->sourceFile:Lcom/android/dx/rop/cst/CstString;

    .line 84
    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    invoke-virtual {v4, p1}, Lcom/android/dx/dex/file/StringIdsSection;->intern(Lcom/android/dx/rop/cst/CstString;)Lcom/android/dx/dex/file/StringIdItem;

    .line 88
    .line 89
    .line 90
    :cond_3
    iget-object p1, p0, Lcom/android/dx/dex/file/ClassDefItem;->annotationsDirectory:Lcom/android/dx/dex/file/AnnotationsDirectoryItem;

    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-nez p1, :cond_5

    .line 97
    .line 98
    iget-object p1, p0, Lcom/android/dx/dex/file/ClassDefItem;->annotationsDirectory:Lcom/android/dx/dex/file/AnnotationsDirectoryItem;

    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->isInternable()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDefItem;->annotationsDirectory:Lcom/android/dx/dex/file/AnnotationsDirectoryItem;

    .line 105
    .line 106
    if-eqz p1, :cond_4

    .line 107
    .line 108
    invoke-virtual {v2, v0}, Lcom/android/dx/dex/file/MixedItemSection;->intern(Lcom/android/dx/dex/file/OffsettedItem;)Lcom/android/dx/dex/file/OffsettedItem;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    check-cast p1, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;

    .line 113
    .line 114
    iput-object p1, p0, Lcom/android/dx/dex/file/ClassDefItem;->annotationsDirectory:Lcom/android/dx/dex/file/AnnotationsDirectoryItem;

    .line 115
    .line 116
    return-void

    .line 117
    :cond_4
    invoke-virtual {v2, v0}, Lcom/android/dx/dex/file/MixedItemSection;->add(Lcom/android/dx/dex/file/OffsettedItem;)V

    .line 118
    .line 119
    .line 120
    :cond_5
    return-void
.end method

.method public addDirectMethod(Lcom/android/dx/dex/file/EncodedMethod;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDefItem;->classData:Lcom/android/dx/dex/file/ClassDataItem;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/ClassDataItem;->addDirectMethod(Lcom/android/dx/dex/file/EncodedMethod;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addFieldAnnotations(Lcom/android/dx/rop/cst/CstFieldRef;Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/dex/file/DexFile;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDefItem;->annotationsDirectory:Lcom/android/dx/dex/file/AnnotationsDirectoryItem;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->addFieldAnnotations(Lcom/android/dx/rop/cst/CstFieldRef;Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/dex/file/DexFile;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addInstanceField(Lcom/android/dx/dex/file/EncodedField;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDefItem;->classData:Lcom/android/dx/dex/file/ClassDataItem;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/ClassDataItem;->addInstanceField(Lcom/android/dx/dex/file/EncodedField;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addMethodAnnotations(Lcom/android/dx/rop/cst/CstMethodRef;Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/dex/file/DexFile;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDefItem;->annotationsDirectory:Lcom/android/dx/dex/file/AnnotationsDirectoryItem;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->addMethodAnnotations(Lcom/android/dx/rop/cst/CstMethodRef;Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/dex/file/DexFile;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addParameterAnnotations(Lcom/android/dx/rop/cst/CstMethodRef;Lcom/android/dx/rop/annotation/AnnotationsList;Lcom/android/dx/dex/file/DexFile;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDefItem;->annotationsDirectory:Lcom/android/dx/dex/file/AnnotationsDirectoryItem;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->addParameterAnnotations(Lcom/android/dx/rop/cst/CstMethodRef;Lcom/android/dx/rop/annotation/AnnotationsList;Lcom/android/dx/dex/file/DexFile;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addStaticField(Lcom/android/dx/dex/file/EncodedField;Lcom/android/dx/rop/cst/Constant;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDefItem;->classData:Lcom/android/dx/dex/file/ClassDataItem;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/dex/file/ClassDataItem;->addStaticField(Lcom/android/dx/dex/file/EncodedField;Lcom/android/dx/rop/cst/Constant;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addVirtualMethod(Lcom/android/dx/dex/file/EncodedMethod;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDefItem;->classData:Lcom/android/dx/dex/file/ClassDataItem;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/ClassDataItem;->addVirtualMethod(Lcom/android/dx/dex/file/EncodedMethod;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public debugPrint(Ljava/io/Writer;Z)V
    .locals 4

    .line 1
    invoke-static {p1}, Lcom/android/dx/util/Writers;->printWriterFor(Ljava/io/Writer;)Ljava/io/PrintWriter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/android/dx/dex/file/ClassDefItem;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, " {"

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, "  accessFlags: "

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget v2, p0, Lcom/android/dx/dex/file/ClassDefItem;->accessFlags:I

    .line 28
    .line 29
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v2, "  superclass: "

    .line 46
    .line 47
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object v2, p0, Lcom/android/dx/dex/file/ClassDefItem;->superclass:Lcom/android/dx/rop/cst/CstType;

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    new-instance v1, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v2, "  interfaces: "

    .line 65
    .line 66
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, p0, Lcom/android/dx/dex/file/ClassDefItem;->interfaces:Lcom/android/dx/dex/file/TypeListItem;

    .line 70
    .line 71
    const-string v3, "<none>"

    .line 72
    .line 73
    if-nez v2, :cond_0

    .line 74
    .line 75
    move-object v2, v3

    .line 76
    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    new-instance v1, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v2, "  sourceFile: "

    .line 89
    .line 90
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iget-object v2, p0, Lcom/android/dx/dex/file/ClassDefItem;->sourceFile:Lcom/android/dx/rop/cst/CstString;

    .line 94
    .line 95
    if-nez v2, :cond_1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_1
    invoke-virtual {v2}, Lcom/android/dx/rop/cst/CstString;->toQuoted()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    :goto_0
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iget-object v1, p0, Lcom/android/dx/dex/file/ClassDefItem;->classData:Lcom/android/dx/dex/file/ClassDataItem;

    .line 113
    .line 114
    invoke-virtual {v1, p1, p2}, Lcom/android/dx/dex/file/ClassDataItem;->debugPrint(Ljava/io/Writer;Z)V

    .line 115
    .line 116
    .line 117
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDefItem;->annotationsDirectory:Lcom/android/dx/dex/file/AnnotationsDirectoryItem;

    .line 118
    .line 119
    invoke-virtual {p0, v0}, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->debugPrint(Ljava/io/PrintWriter;)V

    .line 120
    .line 121
    .line 122
    const-string p0, "}"

    .line 123
    .line 124
    invoke-virtual {v0, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public getAccessFlags()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/file/ClassDefItem;->accessFlags:I

    .line 2
    .line 3
    return p0
.end method

.method public getInterfaces()Lcom/android/dx/rop/type/TypeList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDefItem;->interfaces:Lcom/android/dx/dex/file/TypeListItem;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lcom/android/dx/rop/type/StdTypeList;->EMPTY:Lcom/android/dx/rop/type/StdTypeList;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/dex/file/TypeListItem;->getList()Lcom/android/dx/rop/type/TypeList;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public getMethodAnnotations(Lcom/android/dx/rop/cst/CstMethodRef;)Lcom/android/dx/rop/annotation/Annotations;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDefItem;->annotationsDirectory:Lcom/android/dx/dex/file/AnnotationsDirectoryItem;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->getMethodAnnotations(Lcom/android/dx/rop/cst/CstMethodRef;)Lcom/android/dx/rop/annotation/Annotations;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getMethods()Ljava/util/ArrayList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/dex/file/EncodedMethod;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDefItem;->classData:Lcom/android/dx/dex/file/ClassDataItem;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/file/ClassDataItem;->getMethods()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getParameterAnnotations(Lcom/android/dx/rop/cst/CstMethodRef;)Lcom/android/dx/rop/annotation/AnnotationsList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDefItem;->annotationsDirectory:Lcom/android/dx/dex/file/AnnotationsDirectoryItem;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->getParameterAnnotations(Lcom/android/dx/rop/cst/CstMethodRef;)Lcom/android/dx/rop/annotation/AnnotationsList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getSourceFile()Lcom/android/dx/rop/cst/CstString;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDefItem;->sourceFile:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSuperclass()Lcom/android/dx/rop/cst/CstType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDefItem;->superclass:Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    return-object p0
.end method

.method public getThisClass()Lcom/android/dx/rop/cst/CstType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDefItem;->thisClass:Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    return-object p0
.end method

.method public itemType()Lcom/android/dx/dex/file/ItemType;
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/dex/file/ItemType;->TYPE_CLASS_DEF_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 2
    .line 3
    return-object p0
.end method

.method public setClassAnnotations(Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/dex/file/DexFile;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDefItem;->annotationsDirectory:Lcom/android/dx/dex/file/AnnotationsDirectoryItem;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->setClassAnnotations(Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/dex/file/DexFile;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public writeSize()I
    .locals 0

    .line 1
    const/16 p0, 0x20

    .line 2
    .line 3
    return p0
.end method

.method public writeTo(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-interface {v1}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/dex/file/DexFile;->getTypeIds()Lcom/android/dx/dex/file/TypeIdsSection;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, v0, Lcom/android/dx/dex/file/ClassDefItem;->thisClass:Lcom/android/dx/rop/cst/CstType;

    .line 14
    .line 15
    invoke-virtual {v3, v4}, Lcom/android/dx/dex/file/TypeIdsSection;->indexOf(Lcom/android/dx/rop/cst/CstType;)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    iget-object v5, v0, Lcom/android/dx/dex/file/ClassDefItem;->superclass:Lcom/android/dx/rop/cst/CstType;

    .line 20
    .line 21
    const/4 v6, -0x1

    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    move v3, v6

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v3, v5}, Lcom/android/dx/dex/file/TypeIdsSection;->indexOf(Lcom/android/dx/rop/cst/CstType;)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    :goto_0
    iget-object v5, v0, Lcom/android/dx/dex/file/ClassDefItem;->interfaces:Lcom/android/dx/dex/file/TypeListItem;

    .line 31
    .line 32
    invoke-static {v5}, Lcom/android/dx/dex/file/OffsettedItem;->getAbsoluteOffsetOr0(Lcom/android/dx/dex/file/OffsettedItem;)I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    iget-object v7, v0, Lcom/android/dx/dex/file/ClassDefItem;->annotationsDirectory:Lcom/android/dx/dex/file/AnnotationsDirectoryItem;

    .line 37
    .line 38
    invoke-virtual {v7}, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    const/4 v8, 0x0

    .line 43
    if-eqz v7, :cond_1

    .line 44
    .line 45
    move v7, v8

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    iget-object v7, v0, Lcom/android/dx/dex/file/ClassDefItem;->annotationsDirectory:Lcom/android/dx/dex/file/AnnotationsDirectoryItem;

    .line 48
    .line 49
    invoke-virtual {v7}, Lcom/android/dx/dex/file/OffsettedItem;->getAbsoluteOffset()I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    :goto_1
    iget-object v9, v0, Lcom/android/dx/dex/file/ClassDefItem;->sourceFile:Lcom/android/dx/rop/cst/CstString;

    .line 54
    .line 55
    if-nez v9, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/dex/file/DexFile;->getStringIds()Lcom/android/dx/dex/file/StringIdsSection;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    iget-object v9, v0, Lcom/android/dx/dex/file/ClassDefItem;->sourceFile:Lcom/android/dx/rop/cst/CstString;

    .line 63
    .line 64
    invoke-virtual {v6, v9}, Lcom/android/dx/dex/file/StringIdsSection;->indexOf(Lcom/android/dx/rop/cst/CstString;)I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    :goto_2
    iget-object v9, v0, Lcom/android/dx/dex/file/ClassDefItem;->classData:Lcom/android/dx/dex/file/ClassDataItem;

    .line 69
    .line 70
    invoke-virtual {v9}, Lcom/android/dx/dex/file/ClassDataItem;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    if-eqz v9, :cond_3

    .line 75
    .line 76
    move v9, v8

    .line 77
    goto :goto_3

    .line 78
    :cond_3
    iget-object v9, v0, Lcom/android/dx/dex/file/ClassDefItem;->classData:Lcom/android/dx/dex/file/ClassDataItem;

    .line 79
    .line 80
    invoke-virtual {v9}, Lcom/android/dx/dex/file/OffsettedItem;->getAbsoluteOffset()I

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    :goto_3
    iget-object v10, v0, Lcom/android/dx/dex/file/ClassDefItem;->staticValuesItem:Lcom/android/dx/dex/file/EncodedArrayItem;

    .line 85
    .line 86
    invoke-static {v10}, Lcom/android/dx/dex/file/OffsettedItem;->getAbsoluteOffsetOr0(Lcom/android/dx/dex/file/OffsettedItem;)I

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    if-eqz v2, :cond_7

    .line 91
    .line 92
    new-instance v2, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/android/dx/dex/file/IndexedItem;->indexString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const/16 v11, 0x20

    .line 105
    .line 106
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget-object v11, v0, Lcom/android/dx/dex/file/ClassDefItem;->thisClass:Lcom/android/dx/rop/cst/CstType;

    .line 110
    .line 111
    invoke-virtual {v11}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-interface {v1, v8, v2}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 123
    .line 124
    .line 125
    new-instance v2, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-string v11, "  class_idx:           "

    .line 128
    .line 129
    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v4}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    const/4 v11, 0x4

    .line 144
    invoke-interface {v1, v11, v2}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 145
    .line 146
    .line 147
    new-instance v2, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    const-string v12, "  access_flags:        "

    .line 150
    .line 151
    invoke-direct {v2, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    iget v12, v0, Lcom/android/dx/dex/file/ClassDefItem;->accessFlags:I

    .line 155
    .line 156
    invoke-static {v12}, Lcom/android/dx/rop/code/AccessFlags;->classString(I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v12

    .line 160
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-interface {v1, v11, v2}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 168
    .line 169
    .line 170
    new-instance v2, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    const-string v12, "  superclass_idx:      "

    .line 173
    .line 174
    invoke-direct {v2, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v3}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v12

    .line 181
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string v12, " // "

    .line 185
    .line 186
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    iget-object v13, v0, Lcom/android/dx/dex/file/ClassDefItem;->superclass:Lcom/android/dx/rop/cst/CstType;

    .line 190
    .line 191
    const-string v14, "<none>"

    .line 192
    .line 193
    if-nez v13, :cond_4

    .line 194
    .line 195
    move-object v13, v14

    .line 196
    goto :goto_4

    .line 197
    :cond_4
    invoke-virtual {v13}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v13

    .line 201
    :goto_4
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-interface {v1, v11, v2}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 209
    .line 210
    .line 211
    new-instance v2, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    const-string v13, "  interfaces_off:      "

    .line 214
    .line 215
    invoke-direct {v2, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-static {v5, v2, v1, v11}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲兰苏(ILjava/lang/StringBuilder;Lcom/android/dx/util/AnnotatedOutput;I)V

    .line 219
    .line 220
    .line 221
    if-eqz v5, :cond_5

    .line 222
    .line 223
    iget-object v2, v0, Lcom/android/dx/dex/file/ClassDefItem;->interfaces:Lcom/android/dx/dex/file/TypeListItem;

    .line 224
    .line 225
    invoke-virtual {v2}, Lcom/android/dx/dex/file/TypeListItem;->getList()Lcom/android/dx/rop/type/TypeList;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-interface {v2}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 230
    .line 231
    .line 232
    move-result v13

    .line 233
    move v15, v8

    .line 234
    :goto_5
    if-ge v15, v13, :cond_5

    .line 235
    .line 236
    new-instance v11, Ljava/lang/StringBuilder;

    .line 237
    .line 238
    const-string v8, "    "

    .line 239
    .line 240
    invoke-direct {v11, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-interface {v2, v15}, Lcom/android/dx/rop/type/TypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    .line 244
    .line 245
    .line 246
    move-result-object v8

    .line 247
    invoke-virtual {v8}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v8

    .line 251
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v8

    .line 258
    const/4 v11, 0x0

    .line 259
    invoke-interface {v1, v11, v8}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 260
    .line 261
    .line 262
    add-int/lit8 v15, v15, 0x1

    .line 263
    .line 264
    move v8, v11

    .line 265
    const/4 v11, 0x4

    .line 266
    goto :goto_5

    .line 267
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 268
    .line 269
    const-string v8, "  source_file_idx:     "

    .line 270
    .line 271
    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-static {v6}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v8

    .line 278
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    iget-object v8, v0, Lcom/android/dx/dex/file/ClassDefItem;->sourceFile:Lcom/android/dx/rop/cst/CstString;

    .line 285
    .line 286
    if-nez v8, :cond_6

    .line 287
    .line 288
    goto :goto_6

    .line 289
    :cond_6
    invoke-virtual {v8}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v14

    .line 293
    :goto_6
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    const/4 v8, 0x4

    .line 301
    invoke-interface {v1, v8, v2}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 302
    .line 303
    .line 304
    new-instance v2, Ljava/lang/StringBuilder;

    .line 305
    .line 306
    const-string v11, "  annotations_off:     "

    .line 307
    .line 308
    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    invoke-static {v7}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v11

    .line 315
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    invoke-interface {v1, v8, v2}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 323
    .line 324
    .line 325
    new-instance v2, Ljava/lang/StringBuilder;

    .line 326
    .line 327
    const-string v11, "  class_data_off:      "

    .line 328
    .line 329
    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-static {v9}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v11

    .line 336
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    invoke-interface {v1, v8, v2}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 344
    .line 345
    .line 346
    new-instance v2, Ljava/lang/StringBuilder;

    .line 347
    .line 348
    const-string v11, "  static_values_off:   "

    .line 349
    .line 350
    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    invoke-static {v10, v2, v1, v8}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲兰苏(ILjava/lang/StringBuilder;Lcom/android/dx/util/AnnotatedOutput;I)V

    .line 354
    .line 355
    .line 356
    :cond_7
    invoke-interface {v1, v4}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 357
    .line 358
    .line 359
    iget v0, v0, Lcom/android/dx/dex/file/ClassDefItem;->accessFlags:I

    .line 360
    .line 361
    invoke-interface {v1, v0}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 362
    .line 363
    .line 364
    invoke-interface {v1, v3}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 365
    .line 366
    .line 367
    invoke-interface {v1, v5}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 368
    .line 369
    .line 370
    invoke-interface {v1, v6}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 371
    .line 372
    .line 373
    invoke-interface {v1, v7}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 374
    .line 375
    .line 376
    invoke-interface {v1, v9}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 377
    .line 378
    .line 379
    invoke-interface {v1, v10}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 380
    .line 381
    .line 382
    return-void
.end method
