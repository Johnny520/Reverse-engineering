.class public final Lcom/android/dx/dex/file/ValueEncoder;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field private static final VALUE_ANNOTATION:I = 0x1d

.field private static final VALUE_ARRAY:I = 0x1c

.field private static final VALUE_BOOLEAN:I = 0x1f

.field private static final VALUE_BYTE:I = 0x0

.field private static final VALUE_CHAR:I = 0x3

.field private static final VALUE_DOUBLE:I = 0x11

.field private static final VALUE_ENUM:I = 0x1b

.field private static final VALUE_FIELD:I = 0x19

.field private static final VALUE_FLOAT:I = 0x10

.field private static final VALUE_INT:I = 0x4

.field private static final VALUE_LONG:I = 0x6

.field private static final VALUE_METHOD:I = 0x1a

.field private static final VALUE_METHOD_HANDLE:I = 0x16

.field private static final VALUE_METHOD_TYPE:I = 0x15

.field private static final VALUE_NULL:I = 0x1e

.field private static final VALUE_SHORT:I = 0x2

.field private static final VALUE_STRING:I = 0x17

.field private static final VALUE_TYPE:I = 0x18


# instance fields
.field private final file:Lcom/android/dx/dex/file/DexFile;

.field private final out:Lcom/android/dx/util/AnnotatedOutput;


# direct methods
.method public constructor <init>(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lcom/android/dx/dex/file/ValueEncoder;->file:Lcom/android/dx/dex/file/DexFile;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "out == null"

    .line 15
    .line 16
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v0

    .line 20
    :cond_1
    const-string p0, "file == null"

    .line 21
    .line 22
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method public static addContents(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/rop/annotation/Annotation;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/file/DexFile;->getTypeIds()Lcom/android/dx/dex/file/TypeIdsSection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/dex/file/DexFile;->getStringIds()Lcom/android/dx/dex/file/StringIdsSection;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Lcom/android/dx/rop/annotation/Annotation;->getType()Lcom/android/dx/rop/cst/CstType;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v0, v2}, Lcom/android/dx/dex/file/TypeIdsSection;->intern(Lcom/android/dx/rop/cst/CstType;)Lcom/android/dx/dex/file/TypeIdItem;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/android/dx/rop/annotation/Annotation;->getNameValuePairs()Ljava/util/Collection;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lcom/android/dx/rop/annotation/NameValuePair;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/android/dx/rop/annotation/NameValuePair;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v1, v2}, Lcom/android/dx/dex/file/StringIdsSection;->intern(Lcom/android/dx/rop/cst/CstString;)Lcom/android/dx/dex/file/StringIdItem;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/android/dx/rop/annotation/NameValuePair;->getValue()Lcom/android/dx/rop/cst/Constant;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {p0, v0}, Lcom/android/dx/dex/file/ValueEncoder;->addContents(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/rop/cst/Constant;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    return-void
.end method

.method public static addContents(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/rop/cst/Constant;)V
    .locals 3

    .line 52
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstAnnotation;

    if-eqz v0, :cond_0

    .line 53
    check-cast p1, Lcom/android/dx/rop/cst/CstAnnotation;

    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstAnnotation;->getAnnotation()Lcom/android/dx/rop/annotation/Annotation;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/android/dx/dex/file/ValueEncoder;->addContents(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/rop/annotation/Annotation;)V

    return-void

    .line 54
    :cond_0
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstArray;

    if-eqz v0, :cond_2

    .line 55
    check-cast p1, Lcom/android/dx/rop/cst/CstArray;

    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstArray;->getList()Lcom/android/dx/rop/cst/CstArray$List;

    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 57
    invoke-virtual {p1, v1}, Lcom/android/dx/rop/cst/CstArray$List;->get(I)Lcom/android/dx/rop/cst/Constant;

    move-result-object v2

    invoke-static {p0, v2}, Lcom/android/dx/dex/file/ValueEncoder;->addContents(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/rop/cst/Constant;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void

    .line 58
    :cond_2
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/DexFile;->internIfAppropriate(Lcom/android/dx/rop/cst/Constant;)V

    return-void
.end method

.method public static constantToHuman(Lcom/android/dx/rop/cst/Constant;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/android/dx/dex/file/ValueEncoder;->constantToValueType(Lcom/android/dx/rop/cst/Constant;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x1e

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    const-string p0, "null"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/Constant;->typeName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const/16 v1, 0x20

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-interface {p0}, Lcom/android/dx/util/ToHuman;->toHuman()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method private static constantToValueType(Lcom/android/dx/rop/cst/Constant;)I
    .locals 1

    .line 1
    instance-of v0, p0, Lcom/android/dx/rop/cst/CstByte;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    instance-of v0, p0, Lcom/android/dx/rop/cst/CstShort;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x2

    .line 12
    return p0

    .line 13
    :cond_1
    instance-of v0, p0, Lcom/android/dx/rop/cst/CstChar;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    const/4 p0, 0x3

    .line 18
    return p0

    .line 19
    :cond_2
    instance-of v0, p0, Lcom/android/dx/rop/cst/CstInteger;

    .line 20
    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    const/4 p0, 0x4

    .line 24
    return p0

    .line 25
    :cond_3
    instance-of v0, p0, Lcom/android/dx/rop/cst/CstLong;

    .line 26
    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    const/4 p0, 0x6

    .line 30
    return p0

    .line 31
    :cond_4
    instance-of v0, p0, Lcom/android/dx/rop/cst/CstFloat;

    .line 32
    .line 33
    if-eqz v0, :cond_5

    .line 34
    .line 35
    const/16 p0, 0x10

    .line 36
    .line 37
    return p0

    .line 38
    :cond_5
    instance-of v0, p0, Lcom/android/dx/rop/cst/CstDouble;

    .line 39
    .line 40
    if-eqz v0, :cond_6

    .line 41
    .line 42
    const/16 p0, 0x11

    .line 43
    .line 44
    return p0

    .line 45
    :cond_6
    instance-of v0, p0, Lcom/android/dx/rop/cst/CstProtoRef;

    .line 46
    .line 47
    if-eqz v0, :cond_7

    .line 48
    .line 49
    const/16 p0, 0x15

    .line 50
    .line 51
    return p0

    .line 52
    :cond_7
    instance-of v0, p0, Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 53
    .line 54
    if-eqz v0, :cond_8

    .line 55
    .line 56
    const/16 p0, 0x16

    .line 57
    .line 58
    return p0

    .line 59
    :cond_8
    instance-of v0, p0, Lcom/android/dx/rop/cst/CstString;

    .line 60
    .line 61
    if-eqz v0, :cond_9

    .line 62
    .line 63
    const/16 p0, 0x17

    .line 64
    .line 65
    return p0

    .line 66
    :cond_9
    instance-of v0, p0, Lcom/android/dx/rop/cst/CstType;

    .line 67
    .line 68
    if-eqz v0, :cond_a

    .line 69
    .line 70
    const/16 p0, 0x18

    .line 71
    .line 72
    return p0

    .line 73
    :cond_a
    instance-of v0, p0, Lcom/android/dx/rop/cst/CstFieldRef;

    .line 74
    .line 75
    if-eqz v0, :cond_b

    .line 76
    .line 77
    const/16 p0, 0x19

    .line 78
    .line 79
    return p0

    .line 80
    :cond_b
    instance-of v0, p0, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 81
    .line 82
    if-eqz v0, :cond_c

    .line 83
    .line 84
    const/16 p0, 0x1a

    .line 85
    .line 86
    return p0

    .line 87
    :cond_c
    instance-of v0, p0, Lcom/android/dx/rop/cst/CstEnumRef;

    .line 88
    .line 89
    if-eqz v0, :cond_d

    .line 90
    .line 91
    const/16 p0, 0x1b

    .line 92
    .line 93
    return p0

    .line 94
    :cond_d
    instance-of v0, p0, Lcom/android/dx/rop/cst/CstArray;

    .line 95
    .line 96
    if-eqz v0, :cond_e

    .line 97
    .line 98
    const/16 p0, 0x1c

    .line 99
    .line 100
    return p0

    .line 101
    :cond_e
    instance-of v0, p0, Lcom/android/dx/rop/cst/CstAnnotation;

    .line 102
    .line 103
    if-eqz v0, :cond_f

    .line 104
    .line 105
    const/16 p0, 0x1d

    .line 106
    .line 107
    return p0

    .line 108
    :cond_f
    instance-of v0, p0, Lcom/android/dx/rop/cst/CstKnownNull;

    .line 109
    .line 110
    if-eqz v0, :cond_10

    .line 111
    .line 112
    const/16 p0, 0x1e

    .line 113
    .line 114
    return p0

    .line 115
    :cond_10
    instance-of p0, p0, Lcom/android/dx/rop/cst/CstBoolean;

    .line 116
    .line 117
    if-eqz p0, :cond_11

    .line 118
    .line 119
    const/16 p0, 0x1f

    .line 120
    .line 121
    return p0

    .line 122
    :cond_11
    const-string p0, "Shouldn\'t happen"

    .line 123
    .line 124
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    const/4 p0, 0x0

    .line 128
    return p0
.end method


# virtual methods
.method public writeAnnotation(Lcom/android/dx/rop/annotation/Annotation;Z)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    iget-object p2, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 5
    .line 6
    invoke-interface {p2}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    const/4 p2, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p2, v0

    .line 15
    :goto_0
    iget-object v1, p0, Lcom/android/dx/dex/file/ValueEncoder;->file:Lcom/android/dx/dex/file/DexFile;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/android/dx/dex/file/DexFile;->getStringIds()Lcom/android/dx/dex/file/StringIdsSection;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, Lcom/android/dx/dex/file/ValueEncoder;->file:Lcom/android/dx/dex/file/DexFile;

    .line 22
    .line 23
    invoke-virtual {v2}, Lcom/android/dx/dex/file/DexFile;->getTypeIds()Lcom/android/dx/dex/file/TypeIdsSection;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p1}, Lcom/android/dx/rop/annotation/Annotation;->getType()Lcom/android/dx/rop/cst/CstType;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v2, v3}, Lcom/android/dx/dex/file/TypeIdsSection;->indexOf(Lcom/android/dx/rop/cst/CstType;)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const-string v5, " // "

    .line 36
    .line 37
    if-eqz p2, :cond_1

    .line 38
    .line 39
    iget-object v6, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 40
    .line 41
    new-instance v7, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v8, "  type_idx: "

    .line 44
    .line 45
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v4}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-interface {v6, v3}, Lcom/android/dx/util/AnnotatedOutput;->annotate(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    iget-object v3, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/android/dx/rop/annotation/Annotation;->getType()Lcom/android/dx/rop/cst/CstType;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v2, v4}, Lcom/android/dx/dex/file/TypeIdsSection;->indexOf(Lcom/android/dx/rop/cst/CstType;)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    invoke-interface {v3, v2}, Lcom/android/dx/util/Output;->writeUleb128(I)I

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/android/dx/rop/annotation/Annotation;->getNameValuePairs()Ljava/util/Collection;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz p2, :cond_2

    .line 94
    .line 95
    iget-object v3, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 96
    .line 97
    new-instance v4, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string v6, "  size: "

    .line 100
    .line 101
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-interface {v3, v4}, Lcom/android/dx/util/AnnotatedOutput;->annotate(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_2
    iget-object v3, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 119
    .line 120
    invoke-interface {v3, v2}, Lcom/android/dx/util/Output;->writeUleb128(I)I

    .line 121
    .line 122
    .line 123
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    move v2, v0

    .line 128
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_5

    .line 133
    .line 134
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    check-cast v3, Lcom/android/dx/rop/annotation/NameValuePair;

    .line 139
    .line 140
    invoke-virtual {v3}, Lcom/android/dx/rop/annotation/NameValuePair;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-virtual {v1, v4}, Lcom/android/dx/dex/file/StringIdsSection;->indexOf(Lcom/android/dx/rop/cst/CstString;)I

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    invoke-virtual {v3}, Lcom/android/dx/rop/annotation/NameValuePair;->getValue()Lcom/android/dx/rop/cst/Constant;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    if-eqz p2, :cond_3

    .line 153
    .line 154
    iget-object v7, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 155
    .line 156
    new-instance v8, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    const-string v9, "  elements["

    .line 159
    .line 160
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v9, "]:"

    .line 167
    .line 168
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    invoke-interface {v7, v0, v8}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 176
    .line 177
    .line 178
    add-int/lit8 v2, v2, 0x1

    .line 179
    .line 180
    iget-object v7, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 181
    .line 182
    new-instance v8, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    const-string v9, "    name_idx: "

    .line 185
    .line 186
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-static {v6}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v9

    .line 193
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v4}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    invoke-interface {v7, v4}, Lcom/android/dx/util/AnnotatedOutput;->annotate(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    :cond_3
    iget-object v4, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 214
    .line 215
    invoke-interface {v4, v6}, Lcom/android/dx/util/Output;->writeUleb128(I)I

    .line 216
    .line 217
    .line 218
    if-eqz p2, :cond_4

    .line 219
    .line 220
    iget-object v4, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 221
    .line 222
    new-instance v6, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    const-string v7, "    value: "

    .line 225
    .line 226
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-static {v3}, Lcom/android/dx/dex/file/ValueEncoder;->constantToHuman(Lcom/android/dx/rop/cst/Constant;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v6

    .line 240
    invoke-interface {v4, v6}, Lcom/android/dx/util/AnnotatedOutput;->annotate(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    :cond_4
    invoke-virtual {p0, v3}, Lcom/android/dx/dex/file/ValueEncoder;->writeConstant(Lcom/android/dx/rop/cst/Constant;)V

    .line 244
    .line 245
    .line 246
    goto :goto_1

    .line 247
    :cond_5
    if-eqz p2, :cond_6

    .line 248
    .line 249
    iget-object p0, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 250
    .line 251
    invoke-interface {p0}, Lcom/android/dx/util/AnnotatedOutput;->endAnnotation()V

    .line 252
    .line 253
    .line 254
    :cond_6
    return-void
.end method

.method public writeArray(Lcom/android/dx/rop/cst/CstArray;Z)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    iget-object p2, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 5
    .line 6
    invoke-interface {p2}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    const/4 p2, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p2, v0

    .line 15
    :goto_0
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstArray;->getList()Lcom/android/dx/rop/cst/CstArray$List;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    iget-object v2, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 26
    .line 27
    new-instance v3, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v4, "  size: "

    .line 30
    .line 31
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-interface {v2, v3}, Lcom/android/dx/util/AnnotatedOutput;->annotate(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    iget-object v2, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 49
    .line 50
    invoke-interface {v2, v1}, Lcom/android/dx/util/Output;->writeUleb128(I)I

    .line 51
    .line 52
    .line 53
    :goto_1
    if-ge v0, v1, :cond_3

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lcom/android/dx/rop/cst/CstArray$List;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-eqz p2, :cond_2

    .line 60
    .line 61
    iget-object v3, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 62
    .line 63
    new-instance v4, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v5, "  ["

    .line 66
    .line 67
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v5, "] "

    .line 78
    .line 79
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-static {v2}, Lcom/android/dx/dex/file/ValueEncoder;->constantToHuman(Lcom/android/dx/rop/cst/Constant;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-interface {v3, v4}, Lcom/android/dx/util/AnnotatedOutput;->annotate(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    invoke-virtual {p0, v2}, Lcom/android/dx/dex/file/ValueEncoder;->writeConstant(Lcom/android/dx/rop/cst/Constant;)V

    .line 97
    .line 98
    .line 99
    add-int/lit8 v0, v0, 0x1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    if-eqz p2, :cond_4

    .line 103
    .line 104
    iget-object p0, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 105
    .line 106
    invoke-interface {p0}, Lcom/android/dx/util/AnnotatedOutput;->endAnnotation()V

    .line 107
    .line 108
    .line 109
    :cond_4
    return-void
.end method

.method public writeConstant(Lcom/android/dx/rop/cst/Constant;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/android/dx/dex/file/ValueEncoder;->constantToValueType(Lcom/android/dx/rop/cst/Constant;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    const/4 v1, 0x6

    .line 8
    if-eq v0, v1, :cond_3

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq v0, v1, :cond_3

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    if-eq v0, v1, :cond_3

    .line 18
    .line 19
    const/16 v1, 0x10

    .line 20
    .line 21
    if-eq v0, v1, :cond_1

    .line 22
    .line 23
    const/16 v1, 0x11

    .line 24
    .line 25
    if-eq v0, v1, :cond_0

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    packed-switch v0, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    const-string p0, "Shouldn\'t happen"

    .line 32
    .line 33
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_0
    check-cast p1, Lcom/android/dx/rop/cst/CstBoolean;

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstLiteral32;->getIntBits()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iget-object p0, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 44
    .line 45
    shl-int/lit8 p1, p1, 0x5

    .line 46
    .line 47
    or-int/2addr p1, v0

    .line 48
    invoke-interface {p0, p1}, Lcom/android/dx/util/Output;->writeByte(I)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_1
    iget-object p0, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 53
    .line 54
    invoke-interface {p0, v0}, Lcom/android/dx/util/Output;->writeByte(I)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_2
    iget-object v2, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 59
    .line 60
    invoke-interface {v2, v0}, Lcom/android/dx/util/Output;->writeByte(I)V

    .line 61
    .line 62
    .line 63
    check-cast p1, Lcom/android/dx/rop/cst/CstAnnotation;

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstAnnotation;->getAnnotation()Lcom/android/dx/rop/annotation/Annotation;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p0, p1, v1}, Lcom/android/dx/dex/file/ValueEncoder;->writeAnnotation(Lcom/android/dx/rop/annotation/Annotation;Z)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_3
    iget-object v2, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 74
    .line 75
    invoke-interface {v2, v0}, Lcom/android/dx/util/Output;->writeByte(I)V

    .line 76
    .line 77
    .line 78
    check-cast p1, Lcom/android/dx/rop/cst/CstArray;

    .line 79
    .line 80
    invoke-virtual {p0, p1, v1}, Lcom/android/dx/dex/file/ValueEncoder;->writeArray(Lcom/android/dx/rop/cst/CstArray;Z)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_4
    check-cast p1, Lcom/android/dx/rop/cst/CstEnumRef;

    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstEnumRef;->getFieldRef()Lcom/android/dx/rop/cst/CstFieldRef;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget-object v1, p0, Lcom/android/dx/dex/file/ValueEncoder;->file:Lcom/android/dx/dex/file/DexFile;

    .line 91
    .line 92
    invoke-virtual {v1}, Lcom/android/dx/dex/file/DexFile;->getFieldIds()Lcom/android/dx/dex/file/FieldIdsSection;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1, p1}, Lcom/android/dx/dex/file/FieldIdsSection;->indexOf(Lcom/android/dx/rop/cst/CstFieldRef;)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    iget-object p0, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 101
    .line 102
    int-to-long v1, p1

    .line 103
    invoke-static {p0, v0, v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世哲楪兰(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :pswitch_5
    iget-object v1, p0, Lcom/android/dx/dex/file/ValueEncoder;->file:Lcom/android/dx/dex/file/DexFile;

    .line 108
    .line 109
    invoke-virtual {v1}, Lcom/android/dx/dex/file/DexFile;->getMethodIds()Lcom/android/dx/dex/file/MethodIdsSection;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast p1, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 114
    .line 115
    invoke-virtual {v1, p1}, Lcom/android/dx/dex/file/MethodIdsSection;->indexOf(Lcom/android/dx/rop/cst/CstBaseMethodRef;)I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    iget-object p0, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 120
    .line 121
    int-to-long v1, p1

    .line 122
    invoke-static {p0, v0, v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世哲楪兰(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :pswitch_6
    iget-object v1, p0, Lcom/android/dx/dex/file/ValueEncoder;->file:Lcom/android/dx/dex/file/DexFile;

    .line 127
    .line 128
    invoke-virtual {v1}, Lcom/android/dx/dex/file/DexFile;->getFieldIds()Lcom/android/dx/dex/file/FieldIdsSection;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    check-cast p1, Lcom/android/dx/rop/cst/CstFieldRef;

    .line 133
    .line 134
    invoke-virtual {v1, p1}, Lcom/android/dx/dex/file/FieldIdsSection;->indexOf(Lcom/android/dx/rop/cst/CstFieldRef;)I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    iget-object p0, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 139
    .line 140
    int-to-long v1, p1

    .line 141
    invoke-static {p0, v0, v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世哲楪兰(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :pswitch_7
    iget-object v1, p0, Lcom/android/dx/dex/file/ValueEncoder;->file:Lcom/android/dx/dex/file/DexFile;

    .line 146
    .line 147
    invoke-virtual {v1}, Lcom/android/dx/dex/file/DexFile;->getTypeIds()Lcom/android/dx/dex/file/TypeIdsSection;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    check-cast p1, Lcom/android/dx/rop/cst/CstType;

    .line 152
    .line 153
    invoke-virtual {v1, p1}, Lcom/android/dx/dex/file/TypeIdsSection;->indexOf(Lcom/android/dx/rop/cst/CstType;)I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    iget-object p0, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 158
    .line 159
    int-to-long v1, p1

    .line 160
    invoke-static {p0, v0, v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世哲楪兰(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :pswitch_8
    iget-object v1, p0, Lcom/android/dx/dex/file/ValueEncoder;->file:Lcom/android/dx/dex/file/DexFile;

    .line 165
    .line 166
    invoke-virtual {v1}, Lcom/android/dx/dex/file/DexFile;->getStringIds()Lcom/android/dx/dex/file/StringIdsSection;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    check-cast p1, Lcom/android/dx/rop/cst/CstString;

    .line 171
    .line 172
    invoke-virtual {v1, p1}, Lcom/android/dx/dex/file/StringIdsSection;->indexOf(Lcom/android/dx/rop/cst/CstString;)I

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    iget-object p0, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 177
    .line 178
    int-to-long v1, p1

    .line 179
    invoke-static {p0, v0, v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世哲楪兰(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :pswitch_9
    iget-object v1, p0, Lcom/android/dx/dex/file/ValueEncoder;->file:Lcom/android/dx/dex/file/DexFile;

    .line 184
    .line 185
    invoke-virtual {v1}, Lcom/android/dx/dex/file/DexFile;->getMethodHandles()Lcom/android/dx/dex/file/MethodHandlesSection;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    check-cast p1, Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 190
    .line 191
    invoke-virtual {v1, p1}, Lcom/android/dx/dex/file/MethodHandlesSection;->indexOf(Lcom/android/dx/rop/cst/CstMethodHandle;)I

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    iget-object p0, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 196
    .line 197
    int-to-long v1, p1

    .line 198
    invoke-static {p0, v0, v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世哲楪兰(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :pswitch_a
    iget-object v1, p0, Lcom/android/dx/dex/file/ValueEncoder;->file:Lcom/android/dx/dex/file/DexFile;

    .line 203
    .line 204
    invoke-virtual {v1}, Lcom/android/dx/dex/file/DexFile;->getProtoIds()Lcom/android/dx/dex/file/ProtoIdsSection;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    check-cast p1, Lcom/android/dx/rop/cst/CstProtoRef;

    .line 209
    .line 210
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstProtoRef;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-virtual {v1, p1}, Lcom/android/dx/dex/file/ProtoIdsSection;->indexOf(Lcom/android/dx/rop/type/Prototype;)I

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    iget-object p0, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 219
    .line 220
    int-to-long v1, p1

    .line 221
    invoke-static {p0, v0, v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世哲楪兰(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :cond_0
    check-cast p1, Lcom/android/dx/rop/cst/CstDouble;

    .line 226
    .line 227
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstLiteral64;->getLongBits()J

    .line 228
    .line 229
    .line 230
    move-result-wide v1

    .line 231
    iget-object p0, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 232
    .line 233
    invoke-static {p0, v0, v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏楪兰世哲(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :cond_1
    check-cast p1, Lcom/android/dx/rop/cst/CstFloat;

    .line 238
    .line 239
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstLiteral32;->getLongBits()J

    .line 240
    .line 241
    .line 242
    move-result-wide v1

    .line 243
    const/16 p1, 0x20

    .line 244
    .line 245
    shl-long/2addr v1, p1

    .line 246
    iget-object p0, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 247
    .line 248
    invoke-static {p0, v0, v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏楪兰世哲(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 249
    .line 250
    .line 251
    return-void

    .line 252
    :cond_2
    check-cast p1, Lcom/android/dx/rop/cst/CstLiteralBits;

    .line 253
    .line 254
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstLiteralBits;->getLongBits()J

    .line 255
    .line 256
    .line 257
    move-result-wide v1

    .line 258
    iget-object p0, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 259
    .line 260
    invoke-static {p0, v0, v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世哲楪兰(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    :cond_3
    check-cast p1, Lcom/android/dx/rop/cst/CstLiteralBits;

    .line 265
    .line 266
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstLiteralBits;->getLongBits()J

    .line 267
    .line 268
    .line 269
    move-result-wide v1

    .line 270
    iget-object p0, p0, Lcom/android/dx/dex/file/ValueEncoder;->out:Lcom/android/dx/util/AnnotatedOutput;

    .line 271
    .line 272
    invoke-static {p0, v0, v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏楪兰哲世(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;IJ)V

    .line 273
    .line 274
    .line 275
    return-void

    .line 276
    nop

    .line 277
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
