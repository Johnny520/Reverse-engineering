.class abstract Lcom/android/dx/merge/DexMerger$IdMerger;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/merge/DexMerger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "IdMerger"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Ljava/lang/Comparable<",
        "TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final out:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

.field final synthetic this$0:Lcom/android/dx/merge/DexMerger;


# direct methods
.method public constructor <init>(Lcom/android/dx/merge/DexMerger;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->out:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 7
    .line 8
    return-void
.end method

.method private readIntoMap(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;Lcom/android/dx/merge/IndexMap;ILjava/util/TreeMap;I)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u5170\u82cf\u54f2\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u4e16\u54f2;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u5170\u82cf\u54f2\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u82cf\u54f2;",
            "Lcom/android/dx/merge/IndexMap;",
            "I",
            "Ljava/util/TreeMap<",
            "TT;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;I)I"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, -0x1

    .line 11
    :goto_0
    iget p2, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 12
    .line 13
    if-ge p4, p2, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0, p1, p3, p4}, Lcom/android/dx/merge/DexMerger$IdMerger;->read(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)Ljava/lang/Comparable;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p5, p0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/util/List;

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    new-instance p1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p5, p0, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :cond_2
    return v0
.end method

.method private readUnsortedValues(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/IndexMap;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u5170\u82cf\u54f2\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            "Lcom/android/dx/merge/IndexMap;",
            ")",
            "Ljava/util/List<",
            "Lcom/android/dx/merge/DexMerger$IdMerger<",
            "TT;>.UnsortedValue;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->getSection(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iget v2, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 22
    .line 23
    invoke-virtual {p1, v2}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(I)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v3, 0x0

    .line 28
    move v9, v3

    .line 29
    :goto_0
    iget v4, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 30
    .line 31
    if-ge v9, v4, :cond_1

    .line 32
    .line 33
    iget-object v4, v2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    invoke-virtual {p0, v2, p2, v3}, Lcom/android/dx/merge/DexMerger$IdMerger;->read(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)Ljava/lang/Comparable;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    new-instance v4, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;

    .line 44
    .line 45
    move-object v5, p0

    .line 46
    move-object v6, p1

    .line 47
    move-object v7, p2

    .line 48
    invoke-direct/range {v4 .. v10}, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;-><init>(Lcom/android/dx/merge/DexMerger$IdMerger;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/IndexMap;Ljava/lang/Comparable;II)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    add-int/lit8 v9, v9, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    return-object v1
.end method


# virtual methods
.method public abstract getSection(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;
.end method

.method public final mergeSorted()V
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1300(Lcom/android/dx/merge/DexMerger;)[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    array-length v0, v0

    .line 8
    new-array v0, v0, [L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 11
    .line 12
    invoke-static {v1}, Lcom/android/dx/merge/DexMerger;->access$1300(Lcom/android/dx/merge/DexMerger;)[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    array-length v1, v1

    .line 17
    new-array v1, v1, [L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 20
    .line 21
    invoke-static {v2}, Lcom/android/dx/merge/DexMerger;->access$1300(Lcom/android/dx/merge/DexMerger;)[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    array-length v2, v2

    .line 26
    new-array v2, v2, [I

    .line 27
    .line 28
    iget-object v3, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 29
    .line 30
    invoke-static {v3}, Lcom/android/dx/merge/DexMerger;->access$1300(Lcom/android/dx/merge/DexMerger;)[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    array-length v3, v3

    .line 35
    new-array v3, v3, [I

    .line 36
    .line 37
    new-instance v9, Ljava/util/TreeMap;

    .line 38
    .line 39
    invoke-direct {v9}, Ljava/util/TreeMap;-><init>()V

    .line 40
    .line 41
    .line 42
    const/4 v11, 0x0

    .line 43
    move v10, v11

    .line 44
    :goto_0
    iget-object v4, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 45
    .line 46
    invoke-static {v4}, Lcom/android/dx/merge/DexMerger;->access$1300(Lcom/android/dx/merge/DexMerger;)[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    array-length v4, v4

    .line 51
    if-ge v10, v4, :cond_1

    .line 52
    .line 53
    iget-object v4, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 54
    .line 55
    invoke-static {v4}, Lcom/android/dx/merge/DexMerger;->access$1300(Lcom/android/dx/merge/DexMerger;)[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    aget-object v4, v4, v10

    .line 60
    .line 61
    iget-object v4, v4, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 62
    .line 63
    invoke-virtual {p0, v4}, Lcom/android/dx/merge/DexMerger$IdMerger;->getSection(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    aput-object v4, v0, v10

    .line 68
    .line 69
    invoke-virtual {v4}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_0

    .line 74
    .line 75
    iget-object v4, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 76
    .line 77
    invoke-static {v4}, Lcom/android/dx/merge/DexMerger;->access$1300(Lcom/android/dx/merge/DexMerger;)[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    aget-object v4, v4, v10

    .line 82
    .line 83
    aget-object v5, v0, v10

    .line 84
    .line 85
    iget v5, v5, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 86
    .line 87
    invoke-virtual {v4, v5}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(I)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    :goto_1
    move-object v5, v4

    .line 92
    goto :goto_2

    .line 93
    :cond_0
    const/4 v4, 0x0

    .line 94
    goto :goto_1

    .line 95
    :goto_2
    aput-object v5, v1, v10

    .line 96
    .line 97
    aget-object v6, v0, v10

    .line 98
    .line 99
    iget-object v4, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 100
    .line 101
    invoke-static {v4}, Lcom/android/dx/merge/DexMerger;->access$1400(Lcom/android/dx/merge/DexMerger;)[Lcom/android/dx/merge/IndexMap;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    aget-object v7, v4, v10

    .line 106
    .line 107
    aget v8, v3, v10

    .line 108
    .line 109
    move-object v4, p0

    .line 110
    invoke-direct/range {v4 .. v10}, Lcom/android/dx/merge/DexMerger$IdMerger;->readIntoMap(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;Lcom/android/dx/merge/IndexMap;ILjava/util/TreeMap;I)I

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    aput p0, v2, v10

    .line 115
    .line 116
    add-int/lit8 v10, v10, 0x1

    .line 117
    .line 118
    move-object p0, v4

    .line 119
    goto :goto_0

    .line 120
    :cond_1
    move-object v4, p0

    .line 121
    invoke-virtual {v9}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    iget-object v5, v4, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 126
    .line 127
    if-eqz p0, :cond_2

    .line 128
    .line 129
    invoke-static {v5}, Lcom/android/dx/merge/DexMerger;->access$1500(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-virtual {v4, p0}, Lcom/android/dx/merge/DexMerger$IdMerger;->getSection(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    iput v11, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 138
    .line 139
    iget-object p0, v4, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 140
    .line 141
    invoke-static {p0}, Lcom/android/dx/merge/DexMerger;->access$1500(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-virtual {v4, p0}, Lcom/android/dx/merge/DexMerger$IdMerger;->getSection(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    iput v11, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 150
    .line 151
    return-void

    .line 152
    :cond_2
    invoke-static {v5}, Lcom/android/dx/merge/DexMerger;->access$1500(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-virtual {v4, p0}, Lcom/android/dx/merge/DexMerger$IdMerger;->getSection(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    iget-object v5, v4, Lcom/android/dx/merge/DexMerger$IdMerger;->out:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 161
    .line 162
    iget-object v5, v5, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 163
    .line 164
    invoke-virtual {v5}, Ljava/nio/Buffer;->position()I

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    iput v5, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 169
    .line 170
    :goto_3
    invoke-virtual {v9}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    if-nez p0, :cond_4

    .line 175
    .line 176
    invoke-virtual {v9}, Ljava/util/TreeMap;->pollFirstEntry()Ljava/util/Map$Entry;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    check-cast v5, Ljava/util/List;

    .line 185
    .line 186
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v12

    .line 190
    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    if-eqz v5, :cond_3

    .line 195
    .line 196
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    check-cast v5, Ljava/lang/Integer;

    .line 201
    .line 202
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    aget v6, v2, v6

    .line 207
    .line 208
    iget-object v7, v4, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 209
    .line 210
    invoke-static {v7}, Lcom/android/dx/merge/DexMerger;->access$1400(Lcom/android/dx/merge/DexMerger;)[Lcom/android/dx/merge/IndexMap;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    aget-object v7, v7, v8

    .line 219
    .line 220
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 221
    .line 222
    .line 223
    move-result v8

    .line 224
    aget v10, v3, v8

    .line 225
    .line 226
    add-int/lit8 v13, v10, 0x1

    .line 227
    .line 228
    aput v13, v3, v8

    .line 229
    .line 230
    invoke-virtual {v4, v6, v7, v10, v11}, Lcom/android/dx/merge/DexMerger$IdMerger;->updateIndex(ILcom/android/dx/merge/IndexMap;II)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 234
    .line 235
    .line 236
    move-result v13

    .line 237
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 238
    .line 239
    .line 240
    move-result v6

    .line 241
    aget-object v6, v1, v6

    .line 242
    .line 243
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 244
    .line 245
    .line 246
    move-result v7

    .line 247
    aget-object v7, v0, v7

    .line 248
    .line 249
    iget-object v8, v4, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 250
    .line 251
    invoke-static {v8}, Lcom/android/dx/merge/DexMerger;->access$1400(Lcom/android/dx/merge/DexMerger;)[Lcom/android/dx/merge/IndexMap;

    .line 252
    .line 253
    .line 254
    move-result-object v8

    .line 255
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 256
    .line 257
    .line 258
    move-result v10

    .line 259
    aget-object v8, v8, v10

    .line 260
    .line 261
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 262
    .line 263
    .line 264
    move-result v10

    .line 265
    aget v10, v3, v10

    .line 266
    .line 267
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 268
    .line 269
    .line 270
    move-result v5

    .line 271
    move v14, v10

    .line 272
    move v10, v5

    .line 273
    move-object v5, v6

    .line 274
    move-object v6, v7

    .line 275
    move-object v7, v8

    .line 276
    move v8, v14

    .line 277
    invoke-direct/range {v4 .. v10}, Lcom/android/dx/merge/DexMerger$IdMerger;->readIntoMap(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;Lcom/android/dx/merge/IndexMap;ILjava/util/TreeMap;I)I

    .line 278
    .line 279
    .line 280
    move-result v5

    .line 281
    aput v5, v2, v13

    .line 282
    .line 283
    goto :goto_4

    .line 284
    :cond_3
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    check-cast p0, Ljava/lang/Comparable;

    .line 289
    .line 290
    invoke-virtual {v4, p0}, Lcom/android/dx/merge/DexMerger$IdMerger;->write(Ljava/lang/Comparable;)V

    .line 291
    .line 292
    .line 293
    add-int/lit8 v11, v11, 0x1

    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_4
    iget-object p0, v4, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 297
    .line 298
    invoke-static {p0}, Lcom/android/dx/merge/DexMerger;->access$1500(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    invoke-virtual {v4, p0}, Lcom/android/dx/merge/DexMerger$IdMerger;->getSection(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    iput v11, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 307
    .line 308
    return-void
.end method

.method public final mergeUnsorted()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1500(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->getSection(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->out:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 12
    .line 13
    iget-object v1, v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iput v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 20
    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    move v2, v1

    .line 28
    :goto_0
    iget-object v3, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 29
    .line 30
    invoke-static {v3}, Lcom/android/dx/merge/DexMerger;->access$1300(Lcom/android/dx/merge/DexMerger;)[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    array-length v3, v3

    .line 35
    if-ge v2, v3, :cond_0

    .line 36
    .line 37
    iget-object v3, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 38
    .line 39
    invoke-static {v3}, Lcom/android/dx/merge/DexMerger;->access$1300(Lcom/android/dx/merge/DexMerger;)[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    aget-object v3, v3, v2

    .line 44
    .line 45
    iget-object v4, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 46
    .line 47
    invoke-static {v4}, Lcom/android/dx/merge/DexMerger;->access$1400(Lcom/android/dx/merge/DexMerger;)[Lcom/android/dx/merge/IndexMap;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    aget-object v4, v4, v2

    .line 52
    .line 53
    invoke-direct {p0, v3, v4}, Lcom/android/dx/merge/DexMerger$IdMerger;->readUnsortedValues(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/IndexMap;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 58
    .line 59
    .line 60
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 70
    .line 71
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1500(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {p0, v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->getSection(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 80
    .line 81
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 82
    .line 83
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1500(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {p0, v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->getSection(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    iput v1, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 92
    .line 93
    return-void

    .line 94
    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 95
    .line 96
    .line 97
    move v2, v1

    .line 98
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-ge v1, v3, :cond_3

    .line 103
    .line 104
    add-int/lit8 v3, v1, 0x1

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast v1, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;

    .line 111
    .line 112
    iget v4, v1, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->offset:I

    .line 113
    .line 114
    iget-object v5, v1, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->indexMap:Lcom/android/dx/merge/IndexMap;

    .line 115
    .line 116
    iget v6, v1, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->index:I

    .line 117
    .line 118
    add-int/lit8 v7, v2, -0x1

    .line 119
    .line 120
    invoke-virtual {p0, v4, v5, v6, v7}, Lcom/android/dx/merge/DexMerger$IdMerger;->updateIndex(ILcom/android/dx/merge/IndexMap;II)V

    .line 121
    .line 122
    .line 123
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-ge v3, v4, :cond_2

    .line 128
    .line 129
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    check-cast v4, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;

    .line 134
    .line 135
    invoke-virtual {v1, v4}, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->compareTo(Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;)I

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    if-nez v4, :cond_2

    .line 140
    .line 141
    add-int/lit8 v4, v3, 0x1

    .line 142
    .line 143
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    check-cast v3, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;

    .line 148
    .line 149
    iget v5, v3, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->offset:I

    .line 150
    .line 151
    iget-object v6, v3, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->indexMap:Lcom/android/dx/merge/IndexMap;

    .line 152
    .line 153
    iget v3, v3, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->index:I

    .line 154
    .line 155
    invoke-virtual {p0, v5, v6, v3, v7}, Lcom/android/dx/merge/DexMerger$IdMerger;->updateIndex(ILcom/android/dx/merge/IndexMap;II)V

    .line 156
    .line 157
    .line 158
    move v3, v4

    .line 159
    goto :goto_2

    .line 160
    :cond_2
    iget-object v1, v1, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->value:Ljava/lang/Comparable;

    .line 161
    .line 162
    invoke-virtual {p0, v1}, Lcom/android/dx/merge/DexMerger$IdMerger;->write(Ljava/lang/Comparable;)V

    .line 163
    .line 164
    .line 165
    add-int/lit8 v2, v2, 0x1

    .line 166
    .line 167
    move v1, v3

    .line 168
    goto :goto_1

    .line 169
    :cond_3
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 170
    .line 171
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1500(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {p0, v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->getSection(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    iput v2, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 180
    .line 181
    return-void
.end method

.method public abstract read(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;I)Ljava/lang/Comparable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u5170\u82cf\u54f2\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u4e16\u54f2;",
            "Lcom/android/dx/merge/IndexMap;",
            "I)TT;"
        }
    .end annotation
.end method

.method public abstract updateIndex(ILcom/android/dx/merge/IndexMap;II)V
.end method

.method public abstract write(Ljava/lang/Comparable;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method
