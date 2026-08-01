.class final Lcom/android/dx/merge/SortableType;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final NULLS_LAST_ORDER:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/android/dx/merge/SortableType;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final classDef:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;

.field private depth:I

.field private final dex:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

.field private final indexMap:Lcom/android/dx/merge/IndexMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/merge/SortableType$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/android/dx/merge/SortableType$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/android/dx/merge/SortableType;->NULLS_LAST_ORDER:Ljava/util/Comparator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/IndexMap;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/android/dx/merge/SortableType;->depth:I

    .line 6
    .line 7
    iput-object p1, p0, Lcom/android/dx/merge/SortableType;->dex:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/android/dx/merge/SortableType;->indexMap:Lcom/android/dx/merge/IndexMap;

    .line 10
    .line 11
    iput-object p3, p0, Lcom/android/dx/merge/SortableType;->classDef:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic access$000(Lcom/android/dx/merge/SortableType;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/merge/SortableType;->depth:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public getClassDef()L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/SortableType;->classDef:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDex()L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/SortableType;->dex:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    return-object p0
.end method

.method public getIndexMap()Lcom/android/dx/merge/IndexMap;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/SortableType;->indexMap:Lcom/android/dx/merge/IndexMap;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTypeIndex()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/SortableType;->classDef:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    iget p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:I

    .line 4
    .line 5
    return p0
.end method

.method public isDepthAssigned()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/android/dx/merge/SortableType;->depth:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public tryAssignDepth([Lcom/android/dx/merge/SortableType;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/android/dx/merge/SortableType;->classDef:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    iget v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, -0x1

    .line 8
    if-ne v1, v4, :cond_0

    .line 9
    .line 10
    move v1, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget v5, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:I

    .line 13
    .line 14
    if-eq v1, v5, :cond_7

    .line 15
    .line 16
    aget-object v1, p1, v1

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    move v1, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget v1, v1, Lcom/android/dx/merge/SortableType;->depth:I

    .line 23
    .line 24
    if-ne v1, v4, :cond_2

    .line 25
    .line 26
    goto :goto_3

    .line 27
    :cond_2
    :goto_0
    iget-object v5, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 28
    .line 29
    iget v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:I

    .line 30
    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰苏世哲;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    invoke-virtual {v5, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(I)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏()L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰苏世哲;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :goto_1
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏:[S

    .line 48
    .line 49
    array-length v5, v0

    .line 50
    move v6, v2

    .line 51
    :goto_2
    if-ge v6, v5, :cond_6

    .line 52
    .line 53
    aget-short v7, v0, v6

    .line 54
    .line 55
    aget-object v7, p1, v7

    .line 56
    .line 57
    if-nez v7, :cond_4

    .line 58
    .line 59
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    goto :goto_4

    .line 64
    :cond_4
    iget v7, v7, Lcom/android/dx/merge/SortableType;->depth:I

    .line 65
    .line 66
    if-ne v7, v4, :cond_5

    .line 67
    .line 68
    :goto_3
    return v2

    .line 69
    :cond_5
    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_6
    add-int/2addr v1, v3

    .line 77
    iput v1, p0, Lcom/android/dx/merge/SortableType;->depth:I

    .line 78
    .line 79
    return v3

    .line 80
    :cond_7
    new-instance p1, Lcom/android/dex/DexException;

    .line 81
    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v1, "Class with type index "

    .line 85
    .line 86
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object p0, p0, Lcom/android/dx/merge/SortableType;->classDef:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;

    .line 90
    .line 91
    iget p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:I

    .line 92
    .line 93
    const-string v1, " extends itself"

    .line 94
    .line 95
    invoke-static {v0, v1, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-direct {p1, p0}, Lcom/android/dex/DexException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p1
.end method
