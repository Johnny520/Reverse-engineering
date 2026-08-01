.class public final Lcom/android/dx/merge/IndexMap;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;
    }
.end annotation


# instance fields
.field private final annotationDirectoryOffsets:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final annotationOffsets:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final annotationSetOffsets:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final annotationSetRefListOffsets:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final callSiteIds:[I

.field private final encodedArrayValueOffset:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final fieldIds:[S

.field public final methodHandleIds:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final methodIds:[S

.field public final protoIds:[S

.field public final stringIds:[I

.field private final target:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

.field public final typeIds:[S

.field private final typeListOffsets:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世哲苏;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/merge/IndexMap;->target:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 5
    .line 6
    iget-object p1, p2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;

    .line 7
    .line 8
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 9
    .line 10
    new-array p1, p1, [I

    .line 11
    .line 12
    iput-object p1, p0, Lcom/android/dx/merge/IndexMap;->stringIds:[I

    .line 13
    .line 14
    iget-object p1, p2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;

    .line 15
    .line 16
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 17
    .line 18
    new-array p1, p1, [S

    .line 19
    .line 20
    iput-object p1, p0, Lcom/android/dx/merge/IndexMap;->typeIds:[S

    .line 21
    .line 22
    iget-object p1, p2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;

    .line 23
    .line 24
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 25
    .line 26
    new-array p1, p1, [S

    .line 27
    .line 28
    iput-object p1, p0, Lcom/android/dx/merge/IndexMap;->protoIds:[S

    .line 29
    .line 30
    iget-object p1, p2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;

    .line 31
    .line 32
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 33
    .line 34
    new-array p1, p1, [S

    .line 35
    .line 36
    iput-object p1, p0, Lcom/android/dx/merge/IndexMap;->fieldIds:[S

    .line 37
    .line 38
    iget-object p1, p2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;

    .line 39
    .line 40
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 41
    .line 42
    new-array p1, p1, [S

    .line 43
    .line 44
    iput-object p1, p0, Lcom/android/dx/merge/IndexMap;->methodIds:[S

    .line 45
    .line 46
    iget-object p1, p2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;

    .line 47
    .line 48
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 49
    .line 50
    new-array p1, p1, [I

    .line 51
    .line 52
    iput-object p1, p0, Lcom/android/dx/merge/IndexMap;->callSiteIds:[I

    .line 53
    .line 54
    new-instance p1, Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lcom/android/dx/merge/IndexMap;->methodHandleIds:Ljava/util/HashMap;

    .line 60
    .line 61
    new-instance p1, Ljava/util/HashMap;

    .line 62
    .line 63
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Lcom/android/dx/merge/IndexMap;->typeListOffsets:Ljava/util/HashMap;

    .line 67
    .line 68
    new-instance p2, Ljava/util/HashMap;

    .line 69
    .line 70
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object p2, p0, Lcom/android/dx/merge/IndexMap;->annotationOffsets:Ljava/util/HashMap;

    .line 74
    .line 75
    new-instance p2, Ljava/util/HashMap;

    .line 76
    .line 77
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object p2, p0, Lcom/android/dx/merge/IndexMap;->annotationSetOffsets:Ljava/util/HashMap;

    .line 81
    .line 82
    new-instance v0, Ljava/util/HashMap;

    .line 83
    .line 84
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object v0, p0, Lcom/android/dx/merge/IndexMap;->annotationSetRefListOffsets:Ljava/util/HashMap;

    .line 88
    .line 89
    new-instance v0, Ljava/util/HashMap;

    .line 90
    .line 91
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 92
    .line 93
    .line 94
    iput-object v0, p0, Lcom/android/dx/merge/IndexMap;->annotationDirectoryOffsets:Ljava/util/HashMap;

    .line 95
    .line 96
    new-instance v1, Ljava/util/HashMap;

    .line 97
    .line 98
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 99
    .line 100
    .line 101
    iput-object v1, p0, Lcom/android/dx/merge/IndexMap;->encodedArrayValueOffset:Ljava/util/HashMap;

    .line 102
    .line 103
    const/4 p0, 0x0

    .line 104
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p1, p0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2, p0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, p0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, p0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    return-void
.end method


# virtual methods
.method public adjust(Lcom/android/dx/merge/SortableType;)Lcom/android/dx/merge/SortableType;
    .locals 3

    .line 84
    new-instance v0, Lcom/android/dx/merge/SortableType;

    invoke-virtual {p1}, Lcom/android/dx/merge/SortableType;->getDex()L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    move-result-object v1

    .line 85
    invoke-virtual {p1}, Lcom/android/dx/merge/SortableType;->getIndexMap()Lcom/android/dx/merge/IndexMap;

    move-result-object v2

    invoke-virtual {p1}, Lcom/android/dx/merge/SortableType;->getClassDef()L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/android/dx/merge/IndexMap;->adjust(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lcom/android/dx/merge/SortableType;-><init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/IndexMap;L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;)V

    return-object v0
.end method

.method public adjust(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;
    .locals 11

    .line 70
    new-instance v0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;

    iget-object v1, p0, Lcom/android/dx/merge/IndexMap;->target:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 71
    iget v2, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 72
    iget v3, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:I

    .line 73
    invoke-virtual {p0, v3}, Lcom/android/dx/merge/IndexMap;->adjustType(I)I

    move-result v3

    .line 74
    iget v4, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:I

    .line 75
    iget v5, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:I

    .line 76
    invoke-virtual {p0, v5}, Lcom/android/dx/merge/IndexMap;->adjustType(I)I

    move-result v5

    .line 77
    iget v6, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:I

    .line 78
    invoke-virtual {p0, v6}, Lcom/android/dx/merge/IndexMap;->adjustTypeListOffset(I)I

    move-result v6

    .line 79
    iget v7, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:I

    .line 80
    iget v8, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:I

    .line 81
    iget v9, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:I

    .line 82
    iget v10, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世:I

    .line 83
    invoke-direct/range {v0 .. v10}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;IIIIIIIII)V

    return-object v0
.end method

.method public adjust(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏兰哲;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏兰哲;
    .locals 2

    .line 44
    new-instance v0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏兰哲;

    iget-object v1, p0, Lcom/android/dx/merge/IndexMap;->target:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 45
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 46
    invoke-virtual {p0, p1}, Lcom/android/dx/merge/IndexMap;->adjustEncodedArray(I)I

    move-result p0

    invoke-direct {v0, v1, p0}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏兰哲;-><init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;I)V

    return-object v0
.end method

.method public adjust(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏哲兰;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏哲兰;
    .locals 5

    .line 1
    new-instance v0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;

    .line 9
    .line 10
    invoke-direct {v1, p0, v0}, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;-><init>(Lcom/android/dx/merge/IndexMap;L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;)V

    .line 11
    .line 12
    .line 13
    new-instance v2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;

    .line 14
    .line 15
    iget-object v3, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;

    .line 16
    .line 17
    const/16 v4, 0x1d

    .line 18
    .line 19
    invoke-direct {v2, v3, v4}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;-><init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v2}, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->access$100(Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;)V

    .line 23
    .line 24
    .line 25
    new-instance v1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap;->target:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 28
    .line 29
    iget-byte p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:B

    .line 30
    .line 31
    new-instance v2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->toByteArray()[B

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-direct {v2, v0}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;-><init>([B)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v1, p0, p1, v2}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;BL飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;)V

    .line 41
    .line 42
    .line 43
    return-object v1
.end method

.method public adjust(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲兰世苏;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲兰世苏;
    .locals 4

    .line 86
    new-instance v0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲兰世苏;

    iget-object v1, p0, Lcom/android/dx/merge/IndexMap;->target:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 87
    iget v2, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:I

    .line 88
    invoke-virtual {p0, v2}, Lcom/android/dx/merge/IndexMap;->adjustType(I)I

    move-result v2

    .line 89
    iget v3, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰苏世:I

    .line 90
    invoke-virtual {p0, v3}, Lcom/android/dx/merge/IndexMap;->adjustProto(I)I

    move-result v3

    .line 91
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰世苏哲:I

    .line 92
    invoke-virtual {p0, p1}, Lcom/android/dx/merge/IndexMap;->adjustString(I)I

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲兰世苏;-><init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;III)V

    return-object v0
.end method

.method public adjust(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲兰苏世;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲兰苏世;
    .locals 4

    .line 63
    new-instance v0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲兰苏世;

    iget-object v1, p0, Lcom/android/dx/merge/IndexMap;->target:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 64
    iget v2, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:I

    .line 65
    invoke-virtual {p0, v2}, Lcom/android/dx/merge/IndexMap;->adjustString(I)I

    move-result v2

    .line 66
    iget v3, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:I

    .line 67
    invoke-virtual {p0, v3}, Lcom/android/dx/merge/IndexMap;->adjustType(I)I

    move-result v3

    .line 68
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰世苏哲:I

    .line 69
    invoke-virtual {p0, p1}, Lcom/android/dx/merge/IndexMap;->adjustTypeListOffset(I)I

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲兰苏世;-><init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;III)V

    return-object v0
.end method

.method public adjust(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏世兰;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏世兰;
    .locals 4

    .line 56
    new-instance v0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏世兰;

    iget-object v1, p0, Lcom/android/dx/merge/IndexMap;->target:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 57
    iget v2, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰世苏:I

    .line 58
    invoke-virtual {p0, v2}, Lcom/android/dx/merge/IndexMap;->adjustType(I)I

    move-result v2

    .line 59
    iget v3, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 60
    invoke-virtual {p0, v3}, Lcom/android/dx/merge/IndexMap;->adjustType(I)I

    move-result v3

    .line 61
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:I

    .line 62
    invoke-virtual {p0, p1}, Lcom/android/dx/merge/IndexMap;->adjustString(I)I

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏世兰;-><init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;III)V

    return-object v0
.end method

.method public adjust(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;
    .locals 6

    .line 47
    new-instance v0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;

    iget-object v1, p0, Lcom/android/dx/merge/IndexMap;->target:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 48
    iget-object v2, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 49
    iget v3, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世:I

    .line 50
    invoke-virtual {v2}, Lcom/android/dex/MethodHandle$MethodHandleType;->isField()Z

    move-result v4

    .line 51
    iget v5, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲:I

    if-eqz v4, :cond_0

    .line 52
    invoke-virtual {p0, v5}, Lcom/android/dx/merge/IndexMap;->adjustField(I)I

    move-result p0

    :goto_0
    move v4, p0

    goto :goto_1

    .line 53
    :cond_0
    invoke-virtual {p0, v5}, Lcom/android/dx/merge/IndexMap;->adjustMethod(I)I

    move-result p0

    goto :goto_0

    .line 54
    :goto_1
    iget v5, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏:I

    .line 55
    invoke-direct/range {v0 .. v5}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;Lcom/android/dex/MethodHandle$MethodHandleType;III)V

    return-object v0
.end method

.method public adjustAnnotation(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap;->annotationOffsets:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public adjustAnnotationDirectory(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap;->annotationDirectoryOffsets:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public adjustAnnotationSet(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap;->annotationSetOffsets:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public adjustAnnotationSetRefList(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap;->annotationSetRefListOffsets:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public adjustCallSite(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap;->callSiteIds:[I

    .line 2
    .line 3
    aget p0, p0, p1

    .line 4
    .line 5
    return p0
.end method

.method public adjustEncodedArray(I)I
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap;->encodedArrayValueOffset:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public adjustEncodedArray(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;
    .locals 3

    .line 1
    new-instance v0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;

    .line 9
    .line 10
    invoke-direct {v1, p0, v0}, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;-><init>(Lcom/android/dx/merge/IndexMap;L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;)V

    .line 11
    .line 12
    .line 13
    new-instance p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;

    .line 14
    .line 15
    const/16 v2, 0x1c

    .line 16
    .line 17
    invoke-direct {p0, p1, v2}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;-><init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;I)V

    .line 18
    .line 19
    .line 20
    invoke-static {v1, p0}, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->access$000(Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;)V

    .line 21
    .line 22
    .line 23
    new-instance p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->toByteArray()[B

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {p0, p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;-><init>([B)V

    .line 30
    .line 31
    .line 32
    return-object p0
.end method

.method public adjustEncodedValue(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;
    .locals 3

    .line 1
    new-instance v0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;

    .line 9
    .line 10
    invoke-direct {v1, p0, v0}, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;-><init>(Lcom/android/dx/merge/IndexMap;L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;)V

    .line 11
    .line 12
    .line 13
    new-instance p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;

    .line 14
    .line 15
    new-instance v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 16
    .line 17
    iget-object p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:[B

    .line 18
    .line 19
    invoke-direct {v2, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;-><init>([B)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v2}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;-><init>(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p0}, Lcom/android/dx/merge/IndexMap$EncodedValueTransformer;->transform(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世兰苏;)V

    .line 26
    .line 27
    .line 28
    new-instance p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->toByteArray()[B

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {p0, p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲世苏兰;-><init>([B)V

    .line 35
    .line 36
    .line 37
    return-object p0
.end method

.method public adjustField(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap;->fieldIds:[S

    .line 2
    .line 3
    aget-short p0, p0, p1

    .line 4
    .line 5
    const p1, 0xffff

    .line 6
    .line 7
    .line 8
    and-int/2addr p0, p1

    .line 9
    return p0
.end method

.method public adjustMethod(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap;->methodIds:[S

    .line 2
    .line 3
    aget-short p0, p0, p1

    .line 4
    .line 5
    const p1, 0xffff

    .line 6
    .line 7
    .line 8
    and-int/2addr p0, p1

    .line 9
    return p0
.end method

.method public adjustMethodHandle(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap;->methodHandleIds:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public adjustProto(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap;->protoIds:[S

    .line 2
    .line 3
    aget-short p0, p0, p1

    .line 4
    .line 5
    const p1, 0xffff

    .line 6
    .line 7
    .line 8
    and-int/2addr p0, p1

    .line 9
    return p0
.end method

.method public adjustString(I)I
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap;->stringIds:[I

    .line 6
    .line 7
    aget p0, p0, p1

    .line 8
    .line 9
    return p0
.end method

.method public adjustType(I)I
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap;->typeIds:[S

    .line 6
    .line 7
    aget-short p0, p0, p1

    .line 8
    .line 9
    const p1, 0xffff

    .line 10
    .line 11
    .line 12
    and-int/2addr p0, p1

    .line 13
    return p0
.end method

.method public adjustTypeList(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;)L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;
    .locals 2

    .line 1
    sget-object v0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    iget-object p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏:[S

    .line 7
    .line 8
    invoke-virtual {p1}, [S->clone()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, [S

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :goto_0
    array-length v1, p1

    .line 16
    if-ge v0, v1, :cond_1

    .line 17
    .line 18
    aget-short v1, p1, v0

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lcom/android/dx/merge/IndexMap;->adjustType(I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    int-to-short v1, v1

    .line 25
    aput-short v1, p1, v0

    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-instance v0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;

    .line 31
    .line 32
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap;->target:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 33
    .line 34
    invoke-direct {v0, p0, p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪兰苏世哲;-><init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;[S)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public adjustTypeListOffset(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap;->typeListOffsets:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public putAnnotationDirectoryOffset(II)V
    .locals 0

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    if-lez p2, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap;->annotationDirectoryOffsets:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public putAnnotationOffset(II)V
    .locals 0

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    if-lez p2, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap;->annotationOffsets:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public putAnnotationSetOffset(II)V
    .locals 0

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    if-lez p2, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap;->annotationSetOffsets:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public putAnnotationSetRefListOffset(II)V
    .locals 0

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    if-lez p2, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap;->annotationSetRefListOffsets:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public putEncodedArrayValueOffset(II)V
    .locals 0

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    if-lez p2, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap;->encodedArrayValueOffset:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public putTypeListOffset(II)V
    .locals 0

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    if-lez p2, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/android/dx/merge/IndexMap;->typeListOffsets:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 20
    .line 21
    .line 22
    return-void
.end method
