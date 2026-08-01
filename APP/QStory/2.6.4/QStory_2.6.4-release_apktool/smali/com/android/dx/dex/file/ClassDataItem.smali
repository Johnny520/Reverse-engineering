.class public final Lcom/android/dx/dex/file/ClassDataItem;
.super Lcom/android/dx/dex/file/OffsettedItem;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final directMethods:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/dex/file/EncodedMethod;",
            ">;"
        }
    .end annotation
.end field

.field private encodedForm:[B

.field private final instanceFields:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/dex/file/EncodedField;",
            ">;"
        }
    .end annotation
.end field

.field private final staticFields:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/dex/file/EncodedField;",
            ">;"
        }
    .end annotation
.end field

.field private final staticValues:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/android/dx/dex/file/EncodedField;",
            "Lcom/android/dx/rop/cst/Constant;",
            ">;"
        }
    .end annotation
.end field

.field private staticValuesConstant:Lcom/android/dx/rop/cst/CstArray;

.field private final thisClass:Lcom/android/dx/rop/cst/CstType;

.field private final virtualMethods:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/dex/file/EncodedMethod;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstType;)V
    .locals 3

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
    iput-object p1, p0, Lcom/android/dx/dex/file/ClassDataItem;->thisClass:Lcom/android/dx/rop/cst/CstType;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    const/16 v1, 0x14

    .line 14
    .line 15
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticFields:Ljava/util/ArrayList;

    .line 19
    .line 20
    new-instance p1, Ljava/util/HashMap;

    .line 21
    .line 22
    const/16 v2, 0x28

    .line 23
    .line 24
    invoke-direct {p1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticValues:Ljava/util/HashMap;

    .line 28
    .line 29
    new-instance p1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/android/dx/dex/file/ClassDataItem;->instanceFields:Ljava/util/ArrayList;

    .line 35
    .line 36
    new-instance p1, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lcom/android/dx/dex/file/ClassDataItem;->directMethods:Ljava/util/ArrayList;

    .line 42
    .line 43
    new-instance p1, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lcom/android/dx/dex/file/ClassDataItem;->virtualMethods:Ljava/util/ArrayList;

    .line 49
    .line 50
    iput-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticValuesConstant:Lcom/android/dx/rop/cst/CstArray;

    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    const-string p0, "thisClass == null"

    .line 54
    .line 55
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0
.end method

.method private static encodeList(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/dex/file/DexFile;",
            "Lcom/android/dx/util/AnnotatedOutput;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "+",
            "Lcom/android/dx/dex/file/EncodedMember;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-interface {p1}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v3, "  "

    .line 18
    .line 19
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p2, ":"

    .line 26
    .line 27
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-interface {p1, v2, p2}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    move p2, v2

    .line 38
    :goto_0
    if-ge v2, v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lcom/android/dx/dex/file/EncodedMember;

    .line 45
    .line 46
    invoke-virtual {v1, p0, p1, p2, v2}, Lcom/android/dx/dex/file/EncodedMember;->encode(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;II)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    :goto_1
    return-void
.end method

.method private encodeOutput(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 6

    .line 1
    invoke-interface {p2}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/android/dx/dex/file/OffsettedItem;->offsetString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v2, " class data for "

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Lcom/android/dx/dex/file/ClassDataItem;->thisClass:Lcom/android/dx/rop/cst/CstType;

    .line 25
    .line 26
    invoke-virtual {v2}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-interface {p2, v2, v1}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    iget-object v1, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticFields:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    const-string v2, "static_fields"

    .line 48
    .line 49
    invoke-static {p1, p2, v2, v1}, Lcom/android/dx/dex/file/ClassDataItem;->encodeSize(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;Ljava/lang/String;I)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lcom/android/dx/dex/file/ClassDataItem;->instanceFields:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    const-string v3, "instance_fields"

    .line 59
    .line 60
    invoke-static {p1, p2, v3, v1}, Lcom/android/dx/dex/file/ClassDataItem;->encodeSize(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lcom/android/dx/dex/file/ClassDataItem;->directMethods:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    const-string v4, "direct_methods"

    .line 70
    .line 71
    invoke-static {p1, p2, v4, v1}, Lcom/android/dx/dex/file/ClassDataItem;->encodeSize(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;Ljava/lang/String;I)V

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, Lcom/android/dx/dex/file/ClassDataItem;->virtualMethods:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    const-string v5, "virtual_methods"

    .line 81
    .line 82
    invoke-static {p1, p2, v5, v1}, Lcom/android/dx/dex/file/ClassDataItem;->encodeSize(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;Ljava/lang/String;I)V

    .line 83
    .line 84
    .line 85
    iget-object v1, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticFields:Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-static {p1, p2, v2, v1}, Lcom/android/dx/dex/file/ClassDataItem;->encodeList(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 88
    .line 89
    .line 90
    iget-object v1, p0, Lcom/android/dx/dex/file/ClassDataItem;->instanceFields:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-static {p1, p2, v3, v1}, Lcom/android/dx/dex/file/ClassDataItem;->encodeList(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 93
    .line 94
    .line 95
    iget-object v1, p0, Lcom/android/dx/dex/file/ClassDataItem;->directMethods:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-static {p1, p2, v4, v1}, Lcom/android/dx/dex/file/ClassDataItem;->encodeList(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 98
    .line 99
    .line 100
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDataItem;->virtualMethods:Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-static {p1, p2, v5, p0}, Lcom/android/dx/dex/file/ClassDataItem;->encodeList(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 103
    .line 104
    .line 105
    if-eqz v0, :cond_1

    .line 106
    .line 107
    invoke-interface {p2}, Lcom/android/dx/util/AnnotatedOutput;->endAnnotation()V

    .line 108
    .line 109
    .line 110
    :cond_1
    return-void
.end method

.method private static encodeSize(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-interface {p1}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const-string p0, "_size:"

    .line 8
    .line 9
    invoke-static {p2, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪兰苏哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    filled-new-array {p0, p2}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p2, "  %-21s %08x"

    .line 22
    .line 23
    invoke-static {p2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p1, p0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-interface {p1, p3}, Lcom/android/dx/util/Output;->writeUleb128(I)I

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method private makeStaticValuesConstant()Lcom/android/dx/rop/cst/CstArray;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticFields:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticFields:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    if-lez v0, :cond_2

    .line 13
    .line 14
    iget-object v1, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticFields:Ljava/util/ArrayList;

    .line 15
    .line 16
    add-int/lit8 v2, v0, -0x1

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/android/dx/dex/file/EncodedField;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticValues:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/android/dx/rop/cst/Constant;

    .line 31
    .line 32
    instance-of v2, v1, Lcom/android/dx/rop/cst/CstLiteralBits;

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    check-cast v1, Lcom/android/dx/rop/cst/CstLiteralBits;

    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/android/dx/rop/cst/CstLiteralBits;->getLongBits()J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    const-wide/16 v3, 0x0

    .line 43
    .line 44
    cmp-long v1, v1, v3

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    if-eqz v1, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    :goto_1
    if-nez v0, :cond_3

    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return-object p0

    .line 59
    :cond_3
    new-instance v1, Lcom/android/dx/rop/cst/CstArray$List;

    .line 60
    .line 61
    invoke-direct {v1, v0}, Lcom/android/dx/rop/cst/CstArray$List;-><init>(I)V

    .line 62
    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    :goto_2
    if-ge v2, v0, :cond_5

    .line 66
    .line 67
    iget-object v3, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticFields:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Lcom/android/dx/dex/file/EncodedField;

    .line 74
    .line 75
    iget-object v4, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticValues:Ljava/util/HashMap;

    .line 76
    .line 77
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    check-cast v4, Lcom/android/dx/rop/cst/Constant;

    .line 82
    .line 83
    if-nez v4, :cond_4

    .line 84
    .line 85
    invoke-virtual {v3}, Lcom/android/dx/dex/file/EncodedField;->getRef()Lcom/android/dx/rop/cst/CstFieldRef;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v3}, Lcom/android/dx/rop/cst/CstFieldRef;->getType()Lcom/android/dx/rop/type/Type;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-static {v3}, Lcom/android/dx/rop/cst/Zeroes;->zeroFor(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/cst/Constant;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    :cond_4
    invoke-virtual {v1, v2, v4}, Lcom/android/dx/rop/cst/CstArray$List;->set(ILcom/android/dx/rop/cst/Constant;)V

    .line 98
    .line 99
    .line 100
    add-int/lit8 v2, v2, 0x1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_5
    invoke-virtual {v1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 104
    .line 105
    .line 106
    new-instance p0, Lcom/android/dx/rop/cst/CstArray;

    .line 107
    .line 108
    invoke-direct {p0, v1}, Lcom/android/dx/rop/cst/CstArray;-><init>(Lcom/android/dx/rop/cst/CstArray$List;)V

    .line 109
    .line 110
    .line 111
    return-object p0
.end method


# virtual methods
.method public addContents(Lcom/android/dx/dex/file/DexFile;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticFields:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/android/dx/dex/file/ClassDataItem;->getStaticValuesConstant()Lcom/android/dx/rop/cst/CstArray;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticFields:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lcom/android/dx/dex/file/EncodedField;

    .line 29
    .line 30
    invoke-virtual {v1, p1}, Lcom/android/dx/dex/file/EncodedField;->addContents(Lcom/android/dx/dex/file/DexFile;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->instanceFields:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->instanceFields:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->instanceFields:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Lcom/android/dx/dex/file/EncodedField;

    .line 64
    .line 65
    invoke-virtual {v1, p1}, Lcom/android/dx/dex/file/EncodedField;->addContents(Lcom/android/dx/dex/file/DexFile;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->directMethods:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_2

    .line 76
    .line 77
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->directMethods:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->directMethods:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_2

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Lcom/android/dx/dex/file/EncodedMethod;

    .line 99
    .line 100
    invoke-virtual {v1, p1}, Lcom/android/dx/dex/file/EncodedMethod;->addContents(Lcom/android/dx/dex/file/DexFile;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_2
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->virtualMethods:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_3

    .line 111
    .line 112
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->virtualMethods:Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 115
    .line 116
    .line 117
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDataItem;->virtualMethods:Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_3

    .line 128
    .line 129
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, Lcom/android/dx/dex/file/EncodedMethod;

    .line 134
    .line 135
    invoke-virtual {v0, p1}, Lcom/android/dx/dex/file/EncodedMethod;->addContents(Lcom/android/dx/dex/file/DexFile;)V

    .line 136
    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_3
    return-void
.end method

.method public addDirectMethod(Lcom/android/dx/dex/file/EncodedMethod;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDataItem;->directMethods:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "method == null"

    .line 10
    .line 11
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public addInstanceField(Lcom/android/dx/dex/file/EncodedField;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDataItem;->instanceFields:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "field == null"

    .line 10
    .line 11
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public addStaticField(Lcom/android/dx/dex/file/EncodedField;Lcom/android/dx/rop/cst/Constant;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticValuesConstant:Lcom/android/dx/rop/cst/CstArray;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticFields:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticValues:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p0, "static fields already sorted"

    .line 19
    .line 20
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const-string p0, "field == null"

    .line 25
    .line 26
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public addVirtualMethod(Lcom/android/dx/dex/file/EncodedMethod;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDataItem;->virtualMethods:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "method == null"

    .line 10
    .line 11
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public debugPrint(Ljava/io/Writer;Z)V
    .locals 6

    .line 1
    invoke-static {p1}, Lcom/android/dx/util/Writers;->printWriterFor(Ljava/io/Writer;)Ljava/io/PrintWriter;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticFields:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    const-string v3, "]: "

    .line 14
    .line 15
    if-ge v2, v0, :cond_0

    .line 16
    .line 17
    const-string v4, "  sfields["

    .line 18
    .line 19
    invoke-static {v2, v4, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v4, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticFields:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {p1, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->instanceFields:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    move v2, v1

    .line 49
    :goto_1
    if-ge v2, v0, :cond_1

    .line 50
    .line 51
    const-string v4, "  ifields["

    .line 52
    .line 53
    invoke-static {v2, v4, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    iget-object v5, p0, Lcom/android/dx/dex/file/ClassDataItem;->instanceFields:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {p1, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->directMethods:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    move v2, v1

    .line 83
    :goto_2
    const-string v3, "]:"

    .line 84
    .line 85
    if-ge v2, v0, :cond_2

    .line 86
    .line 87
    new-instance v4, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v5, "  dmeths["

    .line 90
    .line 91
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {p1, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iget-object v3, p0, Lcom/android/dx/dex/file/ClassDataItem;->directMethods:Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, Lcom/android/dx/dex/file/EncodedMethod;

    .line 114
    .line 115
    invoke-virtual {v3, p1, p2}, Lcom/android/dx/dex/file/EncodedMethod;->debugPrint(Ljava/io/PrintWriter;Z)V

    .line 116
    .line 117
    .line 118
    add-int/lit8 v2, v2, 0x1

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_2
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->virtualMethods:Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    :goto_3
    if-ge v1, v0, :cond_3

    .line 128
    .line 129
    new-instance v2, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    const-string v4, "  vmeths["

    .line 132
    .line 133
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {p1, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget-object v2, p0, Lcom/android/dx/dex/file/ClassDataItem;->virtualMethods:Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    check-cast v2, Lcom/android/dx/dex/file/EncodedMethod;

    .line 156
    .line 157
    invoke-virtual {v2, p1, p2}, Lcom/android/dx/dex/file/EncodedMethod;->debugPrint(Ljava/io/PrintWriter;Z)V

    .line 158
    .line 159
    .line 160
    add-int/lit8 v1, v1, 0x1

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_3
    return-void
.end method

.method public getMethods()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/dex/file/EncodedMethod;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->directMethods:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/dex/file/ClassDataItem;->virtualMethods:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v1, v0

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/android/dx/dex/file/ClassDataItem;->directMethods:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDataItem;->virtualMethods:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public getStaticValuesConstant()Lcom/android/dx/rop/cst/CstArray;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticValuesConstant:Lcom/android/dx/rop/cst/CstArray;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticFields:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/android/dx/dex/file/ClassDataItem;->makeStaticValuesConstant()Lcom/android/dx/rop/cst/CstArray;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticValuesConstant:Lcom/android/dx/rop/cst/CstArray;

    .line 18
    .line 19
    :cond_0
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticValuesConstant:Lcom/android/dx/rop/cst/CstArray;

    .line 20
    .line 21
    return-object p0
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->staticFields:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->instanceFields:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/android/dx/dex/file/ClassDataItem;->directMethods:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDataItem;->virtualMethods:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public itemType()Lcom/android/dx/dex/file/ItemType;
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/dex/file/ItemType;->TYPE_CLASS_DATA_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 2
    .line 3
    return-object p0
.end method

.method public place0(Lcom/android/dx/dex/file/Section;I)V
    .locals 0

    .line 1
    new-instance p2, Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 2
    .line 3
    invoke-direct {p2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/android/dx/dex/file/Section;->getFile()Lcom/android/dx/dex/file/DexFile;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-direct {p0, p1, p2}, Lcom/android/dx/dex/file/ClassDataItem;->encodeOutput(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->toByteArray()[B

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/android/dx/dex/file/ClassDataItem;->encodedForm:[B

    .line 18
    .line 19
    array-length p1, p1

    .line 20
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/OffsettedItem;->setWriteSize(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public toHuman()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public writeTo0(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 1

    .line 1
    invoke-interface {p2}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lcom/android/dx/dex/file/ClassDataItem;->encodeOutput(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object p0, p0, Lcom/android/dx/dex/file/ClassDataItem;->encodedForm:[B

    .line 12
    .line 13
    invoke-interface {p2, p0}, Lcom/android/dx/util/Output;->write([B)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
