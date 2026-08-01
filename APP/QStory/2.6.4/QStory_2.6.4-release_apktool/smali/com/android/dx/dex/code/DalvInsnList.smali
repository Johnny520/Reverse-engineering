.class public final Lcom/android/dx/dex/code/DalvInsnList;
.super Lcom/android/dx/util/FixedSizeList;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final regCount:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/util/FixedSizeList;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lcom/android/dx/dex/code/DalvInsnList;->regCount:I

    .line 5
    .line 6
    return-void
.end method

.method public static makeImmutable(Ljava/util/ArrayList;I)Lcom/android/dx/dex/code/DalvInsnList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/dex/code/DalvInsn;",
            ">;I)",
            "Lcom/android/dx/dex/code/DalvInsnList;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Lcom/android/dx/dex/code/DalvInsnList;

    .line 6
    .line 7
    invoke-direct {v1, v0, p1}, Lcom/android/dx/dex/code/DalvInsnList;-><init>(II)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    :goto_0
    if-ge p1, v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lcom/android/dx/dex/code/DalvInsn;

    .line 18
    .line 19
    invoke-virtual {v1, p1, v2}, Lcom/android/dx/dex/code/DalvInsnList;->set(ILcom/android/dx/dex/code/DalvInsn;)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 p1, p1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 26
    .line 27
    .line 28
    return-object v1
.end method


# virtual methods
.method public codeSize()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/android/dx/dex/code/DalvInsnList;->get(I)Lcom/android/dx/dex/code/DalvInsn;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getNextAddress()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method public debugPrint(Ljava/io/OutputStream;Ljava/lang/String;Z)V
    .locals 1

    .line 54
    new-instance v0, Ljava/io/OutputStreamWriter;

    invoke-direct {v0, p1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 55
    invoke-virtual {p0, v0, p2, p3}, Lcom/android/dx/dex/code/DalvInsnList;->debugPrint(Ljava/io/Writer;Ljava/lang/String;Z)V

    .line 56
    :try_start_0
    invoke-virtual {v0}, Ljava/io/Writer;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 57
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    return-void
.end method

.method public debugPrint(Ljava/io/Writer;Ljava/lang/String;Z)V
    .locals 4

    .line 1
    new-instance v0, Lcom/android/dx/util/IndentingWriter;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1, p2}, Lcom/android/dx/util/IndentingWriter;-><init>(Ljava/io/Writer;ILjava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    move p2, v1

    .line 12
    :goto_0
    if-ge p2, p1, :cond_3

    .line 13
    .line 14
    :try_start_0
    invoke-virtual {p0, p2}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lcom/android/dx/dex/code/DalvInsn;

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/android/dx/dex/code/DalvInsn;->codeSize()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    if-eqz p3, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    const/4 v2, 0x0

    .line 30
    goto :goto_2

    .line 31
    :cond_1
    :goto_1
    const-string v3, ""

    .line 32
    .line 33
    invoke-virtual {v2, v3, v1, p3}, Lcom/android/dx/dex/code/DalvInsn;->listingString(Ljava/lang/String;IZ)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    :goto_2
    if-eqz v2, :cond_2

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    add-int/lit8 p2, p2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    invoke-virtual {v0}, Ljava/io/Writer;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catch_0
    move-exception p0

    .line 50
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public get(I)Lcom/android/dx/dex/code/DalvInsn;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/android/dx/dex/code/DalvInsn;

    .line 6
    .line 7
    return-object p0
.end method

.method public getOutsSize()I
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v2, v0, :cond_6

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    check-cast v4, Lcom/android/dx/dex/code/DalvInsn;

    .line 15
    .line 16
    instance-of v5, v4, Lcom/android/dx/dex/code/CstInsn;

    .line 17
    .line 18
    const/4 v6, 0x1

    .line 19
    if-eqz v5, :cond_3

    .line 20
    .line 21
    move-object v5, v4

    .line 22
    check-cast v5, Lcom/android/dx/dex/code/CstInsn;

    .line 23
    .line 24
    invoke-virtual {v5}, Lcom/android/dx/dex/code/CstInsn;->getConstant()Lcom/android/dx/rop/cst/Constant;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    instance-of v7, v5, Lcom/android/dx/rop/cst/CstBaseMethodRef;

    .line 29
    .line 30
    if-eqz v7, :cond_1

    .line 31
    .line 32
    check-cast v5, Lcom/android/dx/rop/cst/CstBaseMethodRef;

    .line 33
    .line 34
    invoke-virtual {v4}, Lcom/android/dx/dex/code/DalvInsn;->getOpcode()Lcom/android/dx/dex/code/Dop;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v4}, Lcom/android/dx/dex/code/Dop;->getFamily()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    const/16 v7, 0x71

    .line 43
    .line 44
    if-ne v4, v7, :cond_0

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    move v6, v1

    .line 48
    :goto_1
    invoke-virtual {v5, v6}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->getParameterWordCount(Z)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    goto :goto_2

    .line 53
    :cond_1
    instance-of v4, v5, Lcom/android/dx/rop/cst/CstCallSiteRef;

    .line 54
    .line 55
    if-eqz v4, :cond_2

    .line 56
    .line 57
    check-cast v5, Lcom/android/dx/rop/cst/CstCallSiteRef;

    .line 58
    .line 59
    invoke-virtual {v5}, Lcom/android/dx/rop/cst/CstCallSiteRef;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v4}, Lcom/android/dx/rop/type/Prototype;->getParameterTypes()Lcom/android/dx/rop/type/StdTypeList;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v4}, Lcom/android/dx/rop/type/StdTypeList;->getWordCount()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    goto :goto_2

    .line 72
    :cond_2
    move v4, v1

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    instance-of v5, v4, Lcom/android/dx/dex/code/MultiCstInsn;

    .line 75
    .line 76
    if-eqz v5, :cond_5

    .line 77
    .line 78
    invoke-virtual {v4}, Lcom/android/dx/dex/code/DalvInsn;->getOpcode()Lcom/android/dx/dex/code/Dop;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v5}, Lcom/android/dx/dex/code/Dop;->getFamily()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    const/16 v7, 0xfa

    .line 87
    .line 88
    if-ne v5, v7, :cond_4

    .line 89
    .line 90
    check-cast v4, Lcom/android/dx/dex/code/MultiCstInsn;

    .line 91
    .line 92
    invoke-virtual {v4, v6}, Lcom/android/dx/dex/code/MultiCstInsn;->getConstant(I)Lcom/android/dx/rop/cst/Constant;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    check-cast v4, Lcom/android/dx/rop/cst/CstProtoRef;

    .line 97
    .line 98
    invoke-virtual {v4}, Lcom/android/dx/rop/cst/CstProtoRef;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-virtual {v4}, Lcom/android/dx/rop/type/Prototype;->getParameterTypes()Lcom/android/dx/rop/type/StdTypeList;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v4}, Lcom/android/dx/rop/type/StdTypeList;->getWordCount()I

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    add-int/2addr v4, v6

    .line 111
    :goto_2
    if-le v4, v3, :cond_5

    .line 112
    .line 113
    move v3, v4

    .line 114
    goto :goto_3

    .line 115
    :cond_4
    const-string p0, "Expecting invoke-polymorphic"

    .line 116
    .line 117
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return v1

    .line 121
    :cond_5
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_6
    return v3
.end method

.method public getRegistersSize()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/code/DalvInsnList;->regCount:I

    .line 2
    .line 3
    return p0
.end method

.method public set(ILcom/android/dx/dex/code/DalvInsn;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/util/FixedSizeList;->set0(ILjava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public writeTo(Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 10

    .line 1
    invoke-interface {p1}, Lcom/android/dx/util/Output;->getCursor()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface {p1}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_4

    .line 15
    .line 16
    invoke-interface {p1}, Lcom/android/dx/util/AnnotatedOutput;->isVerbose()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    move v4, v3

    .line 21
    :goto_0
    if-ge v4, v1, :cond_4

    .line 22
    .line 23
    invoke-virtual {p0, v4}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    check-cast v5, Lcom/android/dx/dex/code/DalvInsn;

    .line 28
    .line 29
    invoke-virtual {v5}, Lcom/android/dx/dex/code/DalvInsn;->codeSize()I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    mul-int/lit8 v6, v6, 0x2

    .line 34
    .line 35
    if-nez v6, :cond_1

    .line 36
    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    const/4 v5, 0x0

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    :goto_1
    const-string v7, "  "

    .line 43
    .line 44
    invoke-interface {p1}, Lcom/android/dx/util/AnnotatedOutput;->getAnnotationWidth()I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    const/4 v9, 0x1

    .line 49
    invoke-virtual {v5, v7, v8, v9}, Lcom/android/dx/dex/code/DalvInsn;->listingString(Ljava/lang/String;IZ)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    :goto_2
    if-eqz v5, :cond_2

    .line 54
    .line 55
    invoke-interface {p1, v6, v5}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_2
    if-eqz v6, :cond_3

    .line 60
    .line 61
    const-string v5, ""

    .line 62
    .line 63
    invoke-interface {p1, v6, v5}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    :goto_4
    if-ge v3, v1, :cond_5

    .line 70
    .line 71
    invoke-virtual {p0, v3}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Lcom/android/dx/dex/code/DalvInsn;

    .line 76
    .line 77
    :try_start_0
    invoke-virtual {v2, p1}, Lcom/android/dx/dex/code/DalvInsn;->writeTo(Lcom/android/dx/util/AnnotatedOutput;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    .line 80
    add-int/lit8 v3, v3, 0x1

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :catch_0
    move-exception p0

    .line 84
    new-instance p1, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    const-string v0, "...while writing "

    .line 87
    .line 88
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {p0, p1}, Lcom/android/dex/util/ExceptionWithContext;->withContext(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/android/dex/util/ExceptionWithContext;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    throw p0

    .line 103
    :cond_5
    invoke-interface {p1}, Lcom/android/dx/util/Output;->getCursor()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    sub-int/2addr p1, v0

    .line 108
    div-int/lit8 p1, p1, 0x2

    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsnList;->codeSize()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-ne p1, v0, :cond_6

    .line 115
    .line 116
    return-void

    .line 117
    :cond_6
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsnList;->codeSize()I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    const-string v0, " but actually wrote "

    .line 122
    .line 123
    const-string v1, "write length mismatch; expected "

    .line 124
    .line 125
    invoke-static {v1, p0, v0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;ILjava/lang/Object;I)V

    .line 126
    .line 127
    .line 128
    return-void
.end method
