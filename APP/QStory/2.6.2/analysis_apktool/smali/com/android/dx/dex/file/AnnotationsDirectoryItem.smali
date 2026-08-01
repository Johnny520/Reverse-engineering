.class public final Lcom/android/dx/dex/file/AnnotationsDirectoryItem;
.super Lcom/android/dx/dex/file/OffsettedItem;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field private static final ALIGNMENT:I = 0x4

.field private static final ELEMENT_SIZE:I = 0x8

.field private static final HEADER_SIZE:I = 0x10


# instance fields
.field private classAnnotations:Lcom/android/dx/dex/file/AnnotationSetItem;

.field private fieldAnnotations:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/dex/file/FieldAnnotationStruct;",
            ">;"
        }
    .end annotation
.end field

.field private methodAnnotations:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/dex/file/MethodAnnotationStruct;",
            ">;"
        }
    .end annotation
.end field

.field private parameterAnnotations:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/dex/file/ParameterAnnotationStruct;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, -0x1

    .line 3
    invoke-direct {p0, v0, v1}, Lcom/android/dx/dex/file/OffsettedItem;-><init>(II)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/android/dx/dex/file/AnnotationSetItem;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    .line 14
    .line 15
    return-void
.end method

.method private static listSize(Ljava/util/ArrayList;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "*>;)I"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method


# virtual methods
.method public addContents(Lcom/android/dx/dex/file/DexFile;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getWordData()Lcom/android/dx/dex/file/MixedItemSection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/android/dx/dex/file/AnnotationSetItem;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/android/dx/dex/file/MixedItemSection;->intern(Lcom/android/dx/dex/file/OffsettedItem;)Lcom/android/dx/dex/file/OffsettedItem;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/android/dx/dex/file/AnnotationSetItem;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/android/dx/dex/file/AnnotationSetItem;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lcom/android/dx/dex/file/FieldAnnotationStruct;

    .line 36
    .line 37
    invoke-virtual {v1, p1}, Lcom/android/dx/dex/file/FieldAnnotationStruct;->addContents(Lcom/android/dx/dex/file/DexFile;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Lcom/android/dx/dex/file/MethodAnnotationStruct;

    .line 60
    .line 61
    invoke-virtual {v1, p1}, Lcom/android/dx/dex/file/MethodAnnotationStruct;->addContents(Lcom/android/dx/dex/file/DexFile;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    .line 66
    .line 67
    if-eqz p0, :cond_3

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Lcom/android/dx/dex/file/ParameterAnnotationStruct;

    .line 84
    .line 85
    invoke-virtual {v0, p1}, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->addContents(Lcom/android/dx/dex/file/DexFile;)V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    return-void
.end method

.method public addFieldAnnotations(Lcom/android/dx/rop/cst/CstFieldRef;Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/dex/file/DexFile;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    .line 13
    .line 14
    new-instance v0, Lcom/android/dx/dex/file/FieldAnnotationStruct;

    .line 15
    .line 16
    new-instance v1, Lcom/android/dx/dex/file/AnnotationSetItem;

    .line 17
    .line 18
    invoke-direct {v1, p2, p3}, Lcom/android/dx/dex/file/AnnotationSetItem;-><init>(Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/dex/file/DexFile;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p1, v1}, Lcom/android/dx/dex/file/FieldAnnotationStruct;-><init>(Lcom/android/dx/rop/cst/CstFieldRef;Lcom/android/dx/dex/file/AnnotationSetItem;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public addMethodAnnotations(Lcom/android/dx/rop/cst/CstMethodRef;Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/dex/file/DexFile;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    .line 13
    .line 14
    new-instance v0, Lcom/android/dx/dex/file/MethodAnnotationStruct;

    .line 15
    .line 16
    new-instance v1, Lcom/android/dx/dex/file/AnnotationSetItem;

    .line 17
    .line 18
    invoke-direct {v1, p2, p3}, Lcom/android/dx/dex/file/AnnotationSetItem;-><init>(Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/dex/file/DexFile;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p1, v1}, Lcom/android/dx/dex/file/MethodAnnotationStruct;-><init>(Lcom/android/dx/rop/cst/CstMethodRef;Lcom/android/dx/dex/file/AnnotationSetItem;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public addParameterAnnotations(Lcom/android/dx/rop/cst/CstMethodRef;Lcom/android/dx/rop/annotation/AnnotationsList;Lcom/android/dx/dex/file/DexFile;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    .line 13
    .line 14
    new-instance v0, Lcom/android/dx/dex/file/ParameterAnnotationStruct;

    .line 15
    .line 16
    invoke-direct {v0, p1, p2, p3}, Lcom/android/dx/dex/file/ParameterAnnotationStruct;-><init>(Lcom/android/dx/rop/cst/CstMethodRef;Lcom/android/dx/rop/annotation/AnnotationsList;Lcom/android/dx/dex/file/DexFile;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public compareTo0(Lcom/android/dx/dex/file/OffsettedItem;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->isInternable()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;

    .line 8
    .line 9
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/android/dx/dex/file/AnnotationSetItem;

    .line 10
    .line 11
    iget-object p1, p1, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/android/dx/dex/file/AnnotationSetItem;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/OffsettedItem;->compareTo(Lcom/android/dx/dex/file/OffsettedItem;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    const-string p0, "uninternable instance"

    .line 19
    .line 20
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public debugPrint(Ljava/io/PrintWriter;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/android/dx/dex/file/AnnotationSetItem;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "  class annotations: "

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/android/dx/dex/file/AnnotationSetItem;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    .line 25
    .line 26
    const-string v1, "    "

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const-string v0, "  field annotations:"

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Lcom/android/dx/dex/file/FieldAnnotationStruct;

    .line 52
    .line 53
    new-instance v3, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Lcom/android/dx/dex/file/FieldAnnotationStruct;->toHuman()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {p1, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    iget-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    .line 74
    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    const-string v0, "  method annotations:"

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_2

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Lcom/android/dx/dex/file/MethodAnnotationStruct;

    .line 99
    .line 100
    new-instance v3, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Lcom/android/dx/dex/file/MethodAnnotationStruct;->toHuman()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {p1, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    iget-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    .line 121
    .line 122
    if-eqz v0, :cond_3

    .line 123
    .line 124
    const-string v0, "  parameter annotations:"

    .line 125
    .line 126
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_3

    .line 140
    .line 141
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    check-cast v0, Lcom/android/dx/dex/file/ParameterAnnotationStruct;

    .line 146
    .line 147
    new-instance v2, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->toHuman()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_3
    return-void
.end method

.method public getMethodAnnotations(Lcom/android/dx/rop/cst/CstMethodRef;)Lcom/android/dx/rop/annotation/Annotations;
    .locals 3

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/android/dx/dex/file/MethodAnnotationStruct;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/android/dx/dex/file/MethodAnnotationStruct;->getMethod()Lcom/android/dx/rop/cst/CstMethodRef;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2, p1}, Lcom/android/dx/rop/cst/CstMemberRef;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/android/dx/dex/file/MethodAnnotationStruct;->getAnnotations()Lcom/android/dx/rop/annotation/Annotations;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_2
    return-object v0
.end method

.method public getParameterAnnotations(Lcom/android/dx/rop/cst/CstMethodRef;)Lcom/android/dx/rop/annotation/AnnotationsList;
    .locals 3

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/android/dx/dex/file/ParameterAnnotationStruct;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->getMethod()Lcom/android/dx/rop/cst/CstMethodRef;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2, p1}, Lcom/android/dx/rop/cst/CstMemberRef;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->getAnnotationsList()Lcom/android/dx/rop/annotation/AnnotationsList;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_2
    return-object v0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/android/dx/dex/file/AnnotationSetItem;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/dex/file/AnnotationSetItem;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/android/dx/dex/file/AnnotationSetItem;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public isInternable()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/android/dx/dex/file/AnnotationSetItem;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public itemType()Lcom/android/dx/dex/file/ItemType;
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/dex/file/ItemType;->TYPE_ANNOTATIONS_DIRECTORY_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 2
    .line 3
    return-object p0
.end method

.method public place0(Lcom/android/dx/dex/file/Section;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->listSize(Ljava/util/ArrayList;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object p2, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-static {p2}, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->listSize(Ljava/util/ArrayList;)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    add-int/2addr p1, p2

    .line 14
    iget-object p2, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-static {p2}, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->listSize(Ljava/util/ArrayList;)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    add-int/2addr p1, p2

    .line 21
    mul-int/lit8 p1, p1, 0x8

    .line 22
    .line 23
    add-int/lit8 p1, p1, 0x10

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/OffsettedItem;->setWriteSize(I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public setClassAnnotations(Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/dex/file/DexFile;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/android/dx/dex/file/AnnotationSetItem;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lcom/android/dx/dex/file/AnnotationSetItem;

    .line 8
    .line 9
    invoke-direct {v0, p1, p2}, Lcom/android/dx/dex/file/AnnotationSetItem;-><init>(Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/dex/file/DexFile;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/android/dx/dex/file/AnnotationSetItem;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p0, "class annotations already set"

    .line 16
    .line 17
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    const-string p0, "annotations == null"

    .line 22
    .line 23
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
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
    .locals 9

    .line 1
    invoke-interface {p2}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->classAnnotations:Lcom/android/dx/dex/file/AnnotationSetItem;

    .line 6
    .line 7
    invoke-static {v1}, Lcom/android/dx/dex/file/OffsettedItem;->getAbsoluteOffsetOr0(Lcom/android/dx/dex/file/OffsettedItem;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-static {v2}, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->listSize(Ljava/util/ArrayList;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget-object v3, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {v3}, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->listSize(Ljava/util/ArrayList;)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget-object v4, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-static {v4}, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->listSize(Ljava/util/ArrayList;)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/4 v5, 0x0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    new-instance v6, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/android/dx/dex/file/OffsettedItem;->offsetString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v7, " annotations directory"

    .line 45
    .line 46
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-interface {p2, v5, v6}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    new-instance v6, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v7, "  class_annotations_off: "

    .line 59
    .line 60
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v1}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    const/4 v7, 0x4

    .line 75
    invoke-interface {p2, v7, v6}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    new-instance v6, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    const-string v8, "  fields_size:           "

    .line 81
    .line 82
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-interface {p2, v7, v6}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 97
    .line 98
    .line 99
    new-instance v6, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    const-string v8, "  methods_size:          "

    .line 102
    .line 103
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v3}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    invoke-interface {p2, v7, v6}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 118
    .line 119
    .line 120
    new-instance v6, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string v8, "  parameters_size:       "

    .line 123
    .line 124
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v4, v6, p2, v7}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲兰苏(ILjava/lang/StringBuilder;Lcom/android/dx/util/AnnotatedOutput;I)V

    .line 128
    .line 129
    .line 130
    :cond_0
    invoke-interface {p2, v1}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 131
    .line 132
    .line 133
    invoke-interface {p2, v2}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 134
    .line 135
    .line 136
    invoke-interface {p2, v3}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 137
    .line 138
    .line 139
    invoke-interface {p2, v4}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 140
    .line 141
    .line 142
    if-eqz v2, :cond_2

    .line 143
    .line 144
    iget-object v1, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 147
    .line 148
    .line 149
    if-eqz v0, :cond_1

    .line 150
    .line 151
    const-string v1, "  fields:"

    .line 152
    .line 153
    invoke-interface {p2, v5, v1}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 154
    .line 155
    .line 156
    :cond_1
    iget-object v1, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->fieldAnnotations:Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    if-eqz v2, :cond_2

    .line 167
    .line 168
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    check-cast v2, Lcom/android/dx/dex/file/FieldAnnotationStruct;

    .line 173
    .line 174
    invoke-virtual {v2, p1, p2}, Lcom/android/dx/dex/file/FieldAnnotationStruct;->writeTo(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V

    .line 175
    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_2
    if-eqz v3, :cond_4

    .line 179
    .line 180
    iget-object v1, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    .line 181
    .line 182
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 183
    .line 184
    .line 185
    if-eqz v0, :cond_3

    .line 186
    .line 187
    const-string v1, "  methods:"

    .line 188
    .line 189
    invoke-interface {p2, v5, v1}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 190
    .line 191
    .line 192
    :cond_3
    iget-object v1, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->methodAnnotations:Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v2, :cond_4

    .line 203
    .line 204
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    check-cast v2, Lcom/android/dx/dex/file/MethodAnnotationStruct;

    .line 209
    .line 210
    invoke-virtual {v2, p1, p2}, Lcom/android/dx/dex/file/MethodAnnotationStruct;->writeTo(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V

    .line 211
    .line 212
    .line 213
    goto :goto_1

    .line 214
    :cond_4
    if-eqz v4, :cond_6

    .line 215
    .line 216
    iget-object v1, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    .line 217
    .line 218
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 219
    .line 220
    .line 221
    if-eqz v0, :cond_5

    .line 222
    .line 223
    const-string v0, "  parameters:"

    .line 224
    .line 225
    invoke-interface {p2, v5, v0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 226
    .line 227
    .line 228
    :cond_5
    iget-object p0, p0, Lcom/android/dx/dex/file/AnnotationsDirectoryItem;->parameterAnnotations:Ljava/util/ArrayList;

    .line 229
    .line 230
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-eqz v0, :cond_6

    .line 239
    .line 240
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    check-cast v0, Lcom/android/dx/dex/file/ParameterAnnotationStruct;

    .line 245
    .line 246
    invoke-virtual {v0, p1, p2}, Lcom/android/dx/dex/file/ParameterAnnotationStruct;->writeTo(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V

    .line 247
    .line 248
    .line 249
    goto :goto_2

    .line 250
    :cond_6
    return-void
.end method
