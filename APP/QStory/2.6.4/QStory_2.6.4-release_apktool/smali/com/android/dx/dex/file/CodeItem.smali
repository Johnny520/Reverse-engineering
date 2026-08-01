.class public final Lcom/android/dx/dex/file/CodeItem;
.super Lcom/android/dx/dex/file/OffsettedItem;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field private static final ALIGNMENT:I = 0x4

.field private static final HEADER_SIZE:I = 0x10


# instance fields
.field private catches:Lcom/android/dx/dex/file/CatchStructs;

.field private final code:Lcom/android/dx/dex/code/DalvCode;

.field private debugInfo:Lcom/android/dx/dex/file/DebugInfoItem;

.field private final isStatic:Z

.field private final ref:Lcom/android/dx/rop/cst/CstMethodRef;

.field private final throwsList:Lcom/android/dx/rop/type/TypeList;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstMethodRef;Lcom/android/dx/dex/code/DalvCode;ZLcom/android/dx/rop/type/TypeList;)V
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
    if-eqz p1, :cond_2

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    if-eqz p4, :cond_0

    .line 12
    .line 13
    iput-object p1, p0, Lcom/android/dx/dex/file/CodeItem;->ref:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 14
    .line 15
    iput-object p2, p0, Lcom/android/dx/dex/file/CodeItem;->code:Lcom/android/dx/dex/code/DalvCode;

    .line 16
    .line 17
    iput-boolean p3, p0, Lcom/android/dx/dex/file/CodeItem;->isStatic:Z

    .line 18
    .line 19
    iput-object p4, p0, Lcom/android/dx/dex/file/CodeItem;->throwsList:Lcom/android/dx/rop/type/TypeList;

    .line 20
    .line 21
    iput-object v0, p0, Lcom/android/dx/dex/file/CodeItem;->catches:Lcom/android/dx/dex/file/CatchStructs;

    .line 22
    .line 23
    iput-object v0, p0, Lcom/android/dx/dex/file/CodeItem;->debugInfo:Lcom/android/dx/dex/file/DebugInfoItem;

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string p0, "throwsList == null"

    .line 27
    .line 28
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1
    const-string p0, "code == null"

    .line 33
    .line 34
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :cond_2
    const-string p0, "ref == null"

    .line 39
    .line 40
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v0
.end method

.method private getInsSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/CodeItem;->ref:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 2
    .line 3
    iget-boolean p0, p0, Lcom/android/dx/dex/file/CodeItem;->isStatic:Z

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->getParameterWordCount(Z)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method private getOutsSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/CodeItem;->code:Lcom/android/dx/dex/code/DalvCode;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvCode;->getInsns()Lcom/android/dx/dex/code/DalvInsnList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsnList;->getOutsSize()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private getRegistersSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/CodeItem;->code:Lcom/android/dx/dex/code/DalvCode;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvCode;->getInsns()Lcom/android/dx/dex/code/DalvInsnList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsnList;->getRegistersSize()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private writeCodes(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/android/dx/dex/file/CodeItem;->code:Lcom/android/dx/dex/code/DalvCode;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/dex/code/DalvCode;->getInsns()Lcom/android/dx/dex/code/DalvInsnList;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :try_start_0
    invoke-virtual {p1, p2}, Lcom/android/dx/dex/code/DalvInsnList;->writeTo(Lcom/android/dx/util/AnnotatedOutput;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :catch_0
    move-exception p1

    .line 12
    new-instance p2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v0, "...while writing instructions for "

    .line 15
    .line 16
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lcom/android/dx/dex/file/CodeItem;->ref:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->toHuman()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p1, p0}, Lcom/android/dex/util/ExceptionWithContext;->withContext(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/android/dex/util/ExceptionWithContext;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    throw p0
.end method


# virtual methods
.method public addContents(Lcom/android/dx/dex/file/DexFile;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getByteData()Lcom/android/dx/dex/file/MixedItemSection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getTypeIds()Lcom/android/dx/dex/file/TypeIdsSection;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lcom/android/dx/dex/file/CodeItem;->code:Lcom/android/dx/dex/code/DalvCode;

    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/android/dx/dex/code/DalvCode;->hasPositions()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lcom/android/dx/dex/file/CodeItem;->code:Lcom/android/dx/dex/code/DalvCode;

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/android/dx/dex/code/DalvCode;->hasLocals()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    :cond_0
    new-instance v2, Lcom/android/dx/dex/file/DebugInfoItem;

    .line 26
    .line 27
    iget-object v3, p0, Lcom/android/dx/dex/file/CodeItem;->code:Lcom/android/dx/dex/code/DalvCode;

    .line 28
    .line 29
    iget-boolean v4, p0, Lcom/android/dx/dex/file/CodeItem;->isStatic:Z

    .line 30
    .line 31
    iget-object v5, p0, Lcom/android/dx/dex/file/CodeItem;->ref:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 32
    .line 33
    invoke-direct {v2, v3, v4, v5}, Lcom/android/dx/dex/file/DebugInfoItem;-><init>(Lcom/android/dx/dex/code/DalvCode;ZLcom/android/dx/rop/cst/CstMethodRef;)V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, Lcom/android/dx/dex/file/CodeItem;->debugInfo:Lcom/android/dx/dex/file/DebugInfoItem;

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Lcom/android/dx/dex/file/MixedItemSection;->add(Lcom/android/dx/dex/file/OffsettedItem;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object v0, p0, Lcom/android/dx/dex/file/CodeItem;->code:Lcom/android/dx/dex/code/DalvCode;

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/android/dx/dex/code/DalvCode;->hasAnyCatches()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    iget-object v0, p0, Lcom/android/dx/dex/file/CodeItem;->code:Lcom/android/dx/dex/code/DalvCode;

    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/android/dx/dex/code/DalvCode;->getCatchTypes()Ljava/util/HashSet;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Lcom/android/dx/rop/type/Type;

    .line 70
    .line 71
    invoke-virtual {v1, v2}, Lcom/android/dx/dex/file/TypeIdsSection;->intern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/dex/file/TypeIdItem;

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    new-instance v0, Lcom/android/dx/dex/file/CatchStructs;

    .line 76
    .line 77
    iget-object v1, p0, Lcom/android/dx/dex/file/CodeItem;->code:Lcom/android/dx/dex/code/DalvCode;

    .line 78
    .line 79
    invoke-direct {v0, v1}, Lcom/android/dx/dex/file/CatchStructs;-><init>(Lcom/android/dx/dex/code/DalvCode;)V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, Lcom/android/dx/dex/file/CodeItem;->catches:Lcom/android/dx/dex/file/CatchStructs;

    .line 83
    .line 84
    :cond_3
    iget-object p0, p0, Lcom/android/dx/dex/file/CodeItem;->code:Lcom/android/dx/dex/code/DalvCode;

    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvCode;->getInsnConstants()Ljava/util/HashSet;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Lcom/android/dx/rop/cst/Constant;

    .line 105
    .line 106
    invoke-virtual {p1, v0}, Lcom/android/dx/dex/file/DexFile;->internIfAppropriate(Lcom/android/dx/rop/cst/Constant;)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    return-void
.end method

.method public debugPrint(Ljava/io/PrintWriter;Ljava/lang/String;Z)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/android/dx/dex/file/CodeItem;->ref:Lcom/android/dx/rop/cst/CstMethodRef;

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
    const-string v1, ":"

    .line 16
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
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/android/dx/dex/file/CodeItem;->code:Lcom/android/dx/dex/code/DalvCode;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/android/dx/dex/code/DalvCode;->getInsns()Lcom/android/dx/dex/code/DalvInsnList;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v2, "regs: "

    .line 36
    .line 37
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0}, Lcom/android/dx/dex/file/CodeItem;->getRegistersSize()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v2, "; ins: "

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-direct {p0}, Lcom/android/dx/dex/file/CodeItem;->getInsSize()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v2, "; outs: "

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-direct {p0}, Lcom/android/dx/dex/file/CodeItem;->getOutsSize()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {p1, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, p1, p2, p3}, Lcom/android/dx/dex/code/DalvInsnList;->debugPrint(Ljava/io/Writer;Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    new-instance p3, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v0, "  "

    .line 102
    .line 103
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    iget-object v0, p0, Lcom/android/dx/dex/file/CodeItem;->catches:Lcom/android/dx/dex/file/CatchStructs;

    .line 111
    .line 112
    if-eqz v0, :cond_0

    .line 113
    .line 114
    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    const-string v0, "catches"

    .line 118
    .line 119
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    iget-object v0, p0, Lcom/android/dx/dex/file/CodeItem;->catches:Lcom/android/dx/dex/file/CatchStructs;

    .line 123
    .line 124
    invoke-virtual {v0, p1, p3}, Lcom/android/dx/dex/file/CatchStructs;->debugPrint(Ljava/io/PrintWriter;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    :cond_0
    iget-object v0, p0, Lcom/android/dx/dex/file/CodeItem;->debugInfo:Lcom/android/dx/dex/file/DebugInfoItem;

    .line 128
    .line 129
    if-eqz v0, :cond_1

    .line 130
    .line 131
    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    const-string p2, "debug info"

    .line 135
    .line 136
    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget-object p0, p0, Lcom/android/dx/dex/file/CodeItem;->debugInfo:Lcom/android/dx/dex/file/DebugInfoItem;

    .line 140
    .line 141
    invoke-virtual {p0, p1, p3}, Lcom/android/dx/dex/file/DebugInfoItem;->debugPrint(Ljava/io/PrintWriter;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :cond_1
    return-void
.end method

.method public getRef()Lcom/android/dx/rop/cst/CstMethodRef;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/CodeItem;->ref:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 2
    .line 3
    return-object p0
.end method

.method public itemType()Lcom/android/dx/dex/file/ItemType;
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/dex/file/ItemType;->TYPE_CODE_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 2
    .line 3
    return-object p0
.end method

.method public place0(Lcom/android/dx/dex/file/Section;I)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/Section;->getFile()Lcom/android/dx/dex/file/DexFile;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lcom/android/dx/dex/file/CodeItem;->code:Lcom/android/dx/dex/code/DalvCode;

    .line 6
    .line 7
    new-instance v0, Lcom/android/dx/dex/file/CodeItem$1;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Lcom/android/dx/dex/file/CodeItem$1;-><init>(Lcom/android/dx/dex/file/CodeItem;Lcom/android/dx/dex/file/DexFile;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2, v0}, Lcom/android/dx/dex/code/DalvCode;->assignIndices(Lcom/android/dx/dex/code/DalvCode$AssignIndicesCallback;)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Lcom/android/dx/dex/file/CodeItem;->catches:Lcom/android/dx/dex/file/CatchStructs;

    .line 16
    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Lcom/android/dx/dex/file/CatchStructs;->encode(Lcom/android/dx/dex/file/DexFile;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/android/dx/dex/file/CodeItem;->catches:Lcom/android/dx/dex/file/CatchStructs;

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/android/dx/dex/file/CatchStructs;->writeSize()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    iget-object p2, p0, Lcom/android/dx/dex/file/CodeItem;->code:Lcom/android/dx/dex/code/DalvCode;

    .line 31
    .line 32
    invoke-virtual {p2}, Lcom/android/dx/dex/code/DalvCode;->getInsns()Lcom/android/dx/dex/code/DalvInsnList;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p2}, Lcom/android/dx/dex/code/DalvInsnList;->codeSize()I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    and-int/lit8 v0, p2, 0x1

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    add-int/lit8 p2, p2, 0x1

    .line 45
    .line 46
    :cond_1
    mul-int/lit8 p2, p2, 0x2

    .line 47
    .line 48
    add-int/lit8 p2, p2, 0x10

    .line 49
    .line 50
    add-int/2addr p2, p1

    .line 51
    invoke-virtual {p0, p2}, Lcom/android/dx/dex/file/OffsettedItem;->setWriteSize(I)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public toHuman()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/CodeItem;->ref:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->toHuman()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CodeItem{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/android/dx/dex/file/CodeItem;->toHuman()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p0, "}"

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public writeTo0(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 13

    .line 1
    invoke-interface {p2}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0}, Lcom/android/dx/dex/file/CodeItem;->getRegistersSize()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {p0}, Lcom/android/dx/dex/file/CodeItem;->getOutsSize()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-direct {p0}, Lcom/android/dx/dex/file/CodeItem;->getInsSize()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    iget-object v4, p0, Lcom/android/dx/dex/file/CodeItem;->code:Lcom/android/dx/dex/code/DalvCode;

    .line 18
    .line 19
    invoke-virtual {v4}, Lcom/android/dx/dex/code/DalvCode;->getInsns()Lcom/android/dx/dex/code/DalvInsnList;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4}, Lcom/android/dx/dex/code/DalvInsnList;->codeSize()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    and-int/lit8 v5, v4, 0x1

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v5, v6

    .line 35
    :goto_0
    iget-object v7, p0, Lcom/android/dx/dex/file/CodeItem;->catches:Lcom/android/dx/dex/file/CatchStructs;

    .line 36
    .line 37
    if-nez v7, :cond_1

    .line 38
    .line 39
    move v7, v6

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {v7}, Lcom/android/dx/dex/file/CatchStructs;->triesSize()I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    :goto_1
    iget-object v8, p0, Lcom/android/dx/dex/file/CodeItem;->debugInfo:Lcom/android/dx/dex/file/DebugInfoItem;

    .line 46
    .line 47
    if-nez v8, :cond_2

    .line 48
    .line 49
    move v8, v6

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    invoke-virtual {v8}, Lcom/android/dx/dex/file/OffsettedItem;->getAbsoluteOffset()I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    :goto_2
    const/4 v9, 0x2

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    new-instance v10, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/android/dx/dex/file/OffsettedItem;->offsetString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const/16 v11, 0x20

    .line 71
    .line 72
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object v11, p0, Lcom/android/dx/dex/file/CodeItem;->ref:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 76
    .line 77
    invoke-virtual {v11}, Lcom/android/dx/rop/cst/CstMemberRef;->toHuman()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v11

    .line 81
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    invoke-interface {p2, v6, v10}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 89
    .line 90
    .line 91
    new-instance v10, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string v11, "  registers_size: "

    .line 94
    .line 95
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v11

    .line 102
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    invoke-interface {p2, v9, v10}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 110
    .line 111
    .line 112
    new-instance v10, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string v11, "  ins_size:       "

    .line 115
    .line 116
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v3}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v11

    .line 123
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    invoke-interface {p2, v9, v10}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 131
    .line 132
    .line 133
    new-instance v10, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    const-string v11, "  outs_size:      "

    .line 136
    .line 137
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v11

    .line 144
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    invoke-interface {p2, v9, v10}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 152
    .line 153
    .line 154
    new-instance v10, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    const-string v11, "  tries_size:     "

    .line 157
    .line 158
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-static {v7}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    invoke-interface {p2, v9, v10}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 173
    .line 174
    .line 175
    new-instance v10, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    const-string v11, "  debug_off:      "

    .line 178
    .line 179
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-static {v8}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v11

    .line 186
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v10

    .line 193
    const/4 v11, 0x4

    .line 194
    invoke-interface {p2, v11, v10}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 195
    .line 196
    .line 197
    new-instance v10, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    const-string v12, "  insns_size:     "

    .line 200
    .line 201
    invoke-direct {v10, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-static {v4, v10, p2, v11}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲苏兰(ILjava/lang/StringBuilder;Lcom/android/dx/util/AnnotatedOutput;I)V

    .line 205
    .line 206
    .line 207
    iget-object v10, p0, Lcom/android/dx/dex/file/CodeItem;->throwsList:Lcom/android/dx/rop/type/TypeList;

    .line 208
    .line 209
    invoke-interface {v10}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 210
    .line 211
    .line 212
    move-result v10

    .line 213
    if-eqz v10, :cond_3

    .line 214
    .line 215
    new-instance v10, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    const-string v11, "  throws "

    .line 218
    .line 219
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    iget-object v11, p0, Lcom/android/dx/dex/file/CodeItem;->throwsList:Lcom/android/dx/rop/type/TypeList;

    .line 223
    .line 224
    invoke-static {v11}, Lcom/android/dx/rop/type/StdTypeList;->toHuman(Lcom/android/dx/rop/type/TypeList;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v11

    .line 228
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v10

    .line 235
    invoke-interface {p2, v6, v10}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 236
    .line 237
    .line 238
    :cond_3
    invoke-interface {p2, v1}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 239
    .line 240
    .line 241
    invoke-interface {p2, v3}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 242
    .line 243
    .line 244
    invoke-interface {p2, v2}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 245
    .line 246
    .line 247
    invoke-interface {p2, v7}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 248
    .line 249
    .line 250
    invoke-interface {p2, v8}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 251
    .line 252
    .line 253
    invoke-interface {p2, v4}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 254
    .line 255
    .line 256
    invoke-direct {p0, p1, p2}, Lcom/android/dx/dex/file/CodeItem;->writeCodes(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V

    .line 257
    .line 258
    .line 259
    iget-object v1, p0, Lcom/android/dx/dex/file/CodeItem;->catches:Lcom/android/dx/dex/file/CatchStructs;

    .line 260
    .line 261
    if-eqz v1, :cond_6

    .line 262
    .line 263
    if-eqz v5, :cond_5

    .line 264
    .line 265
    if-eqz v0, :cond_4

    .line 266
    .line 267
    const-string v1, "  padding: 0"

    .line 268
    .line 269
    invoke-interface {p2, v9, v1}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 270
    .line 271
    .line 272
    :cond_4
    invoke-interface {p2, v6}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 273
    .line 274
    .line 275
    :cond_5
    iget-object v1, p0, Lcom/android/dx/dex/file/CodeItem;->catches:Lcom/android/dx/dex/file/CatchStructs;

    .line 276
    .line 277
    invoke-virtual {v1, p1, p2}, Lcom/android/dx/dex/file/CatchStructs;->writeTo(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V

    .line 278
    .line 279
    .line 280
    :cond_6
    if-eqz v0, :cond_7

    .line 281
    .line 282
    iget-object v0, p0, Lcom/android/dx/dex/file/CodeItem;->debugInfo:Lcom/android/dx/dex/file/DebugInfoItem;

    .line 283
    .line 284
    if-eqz v0, :cond_7

    .line 285
    .line 286
    const-string v0, "  debug info"

    .line 287
    .line 288
    invoke-interface {p2, v6, v0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 289
    .line 290
    .line 291
    iget-object p0, p0, Lcom/android/dx/dex/file/CodeItem;->debugInfo:Lcom/android/dx/dex/file/DebugInfoItem;

    .line 292
    .line 293
    const-string v0, "    "

    .line 294
    .line 295
    invoke-virtual {p0, p1, p2, v0}, Lcom/android/dx/dex/file/DebugInfoItem;->annotateTo(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    :cond_7
    return-void
.end method
