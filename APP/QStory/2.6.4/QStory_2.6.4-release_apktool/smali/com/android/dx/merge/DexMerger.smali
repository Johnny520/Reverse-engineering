.class public final Lcom/android/dx/merge/DexMerger;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/merge/DexMerger$WriterSizes;,
        Lcom/android/dx/merge/DexMerger$IdMerger;
    }
.end annotation


# static fields
.field private static final DBG_ADVANCE_LINE:B = 0x2t

.field private static final DBG_ADVANCE_PC:B = 0x1t

.field private static final DBG_END_LOCAL:B = 0x5t

.field private static final DBG_END_SEQUENCE:B = 0x0t

.field private static final DBG_RESTART_LOCAL:B = 0x6t

.field private static final DBG_SET_EPILOGUE_BEGIN:B = 0x8t

.field private static final DBG_SET_FILE:B = 0x9t

.field private static final DBG_SET_PROLOGUE_END:B = 0x7t

.field private static final DBG_START_LOCAL:B = 0x3t

.field private static final DBG_START_LOCAL_EXTENDED:B = 0x4t


# instance fields
.field private final annotationOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

.field private final annotationSetOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

.field private final annotationSetRefListOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

.field private final annotationsDirectoryOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

.field private final classDataOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

.field private final codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

.field private final collisionPolicy:Lcom/android/dx/merge/CollisionPolicy;

.field private compactWasteThreshold:I

.field private final contentsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

.field private final context:Lcom/android/dx/command/dexer/DxContext;

.field private final debugInfoOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

.field private final dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

.field private final dexes:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

.field private final encodedArrayOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

.field private final headerOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

.field private final idsDefsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

.field private final indexMaps:[Lcom/android/dx/merge/IndexMap;

.field private final instructionTransformer:Lcom/android/dx/merge/InstructionTransformer;

.field private final mapListOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

.field private final stringDataOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

.field private final typeListOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

.field private final writerSizes:Lcom/android/dx/merge/DexMerger$WriterSizes;


# direct methods
.method public constructor <init>([L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/CollisionPolicy;Lcom/android/dx/command/dexer/DxContext;)V
    .locals 1

    .line 328
    new-instance v0, Lcom/android/dx/merge/DexMerger$WriterSizes;

    invoke-direct {v0, p1}, Lcom/android/dx/merge/DexMerger$WriterSizes;-><init>([L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;)V

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/android/dx/merge/DexMerger;-><init>([L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/CollisionPolicy;Lcom/android/dx/command/dexer/DxContext;Lcom/android/dx/merge/DexMerger$WriterSizes;)V

    return-void
.end method

.method private constructor <init>([L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/CollisionPolicy;Lcom/android/dx/command/dexer/DxContext;Lcom/android/dx/merge/DexMerger$WriterSizes;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x100000

    .line 5
    .line 6
    iput v0, p0, Lcom/android/dx/merge/DexMerger;->compactWasteThreshold:I

    .line 7
    .line 8
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger;->dexes:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/android/dx/merge/DexMerger;->collisionPolicy:Lcom/android/dx/merge/CollisionPolicy;

    .line 11
    .line 12
    iput-object p3, p0, Lcom/android/dx/merge/DexMerger;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 13
    .line 14
    iput-object p4, p0, Lcom/android/dx/merge/DexMerger;->writerSizes:Lcom/android/dx/merge/DexMerger$WriterSizes;

    .line 15
    .line 16
    new-instance p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 17
    .line 18
    invoke-virtual {p4}, Lcom/android/dx/merge/DexMerger$WriterSizes;->size()I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    invoke-direct {p2, p3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 26
    .line 27
    array-length p2, p1

    .line 28
    new-array p2, p2, [Lcom/android/dx/merge/IndexMap;

    .line 29
    .line 30
    iput-object p2, p0, Lcom/android/dx/merge/DexMerger;->indexMaps:[Lcom/android/dx/merge/IndexMap;

    .line 31
    .line 32
    const/4 p2, 0x0

    .line 33
    :goto_0
    array-length p3, p1

    .line 34
    if-ge p2, p3, :cond_0

    .line 35
    .line 36
    iget-object p3, p0, Lcom/android/dx/merge/DexMerger;->indexMaps:[Lcom/android/dx/merge/IndexMap;

    .line 37
    .line 38
    new-instance v0, Lcom/android/dx/merge/IndexMap;

    .line 39
    .line 40
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 41
    .line 42
    aget-object v2, p1, p2

    .line 43
    .line 44
    iget-object v2, v2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 45
    .line 46
    invoke-direct {v0, v1, v2}, Lcom/android/dx/merge/IndexMap;-><init>(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;)V

    .line 47
    .line 48
    .line 49
    aput-object v0, p3, p2

    .line 50
    .line 51
    add-int/lit8 p2, p2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance p1, Lcom/android/dx/merge/InstructionTransformer;

    .line 55
    .line 56
    invoke-direct {p1}, Lcom/android/dx/merge/InstructionTransformer;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger;->instructionTransformer:Lcom/android/dx/merge/InstructionTransformer;

    .line 60
    .line 61
    iget-object p1, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 62
    .line 63
    invoke-static {p4}, Lcom/android/dx/merge/DexMerger$WriterSizes;->access$000(Lcom/android/dx/merge/DexMerger$WriterSizes;)I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    const-string p3, "header"

    .line 68
    .line 69
    invoke-virtual {p1, p2, p3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(ILjava/lang/String;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger;->headerOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 74
    .line 75
    iget-object p1, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 76
    .line 77
    invoke-static {p4}, Lcom/android/dx/merge/DexMerger$WriterSizes;->access$100(Lcom/android/dx/merge/DexMerger$WriterSizes;)I

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    const-string p3, "ids defs"

    .line 82
    .line 83
    invoke-virtual {p1, p2, p3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(ILjava/lang/String;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger;->idsDefsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 88
    .line 89
    iget-object p1, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 90
    .line 91
    iget-object p2, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 92
    .line 93
    iput-object p2, p0, Lcom/android/dx/merge/DexMerger;->contentsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 94
    .line 95
    iget p3, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:I

    .line 96
    .line 97
    iput p3, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰苏哲:I

    .line 98
    .line 99
    iget-object v0, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 100
    .line 101
    iput p3, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 102
    .line 103
    const/4 p3, 0x1

    .line 104
    iput p3, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 105
    .line 106
    invoke-static {p4}, Lcom/android/dx/merge/DexMerger$WriterSizes;->access$200(Lcom/android/dx/merge/DexMerger$WriterSizes;)I

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    const-string v0, "map list"

    .line 111
    .line 112
    invoke-virtual {p1, p3, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(ILjava/lang/String;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger;->mapListOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 117
    .line 118
    iget-object p1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰世哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 119
    .line 120
    iget-object p3, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 121
    .line 122
    iget v0, p3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:I

    .line 123
    .line 124
    iput v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 125
    .line 126
    invoke-static {p4}, Lcom/android/dx/merge/DexMerger$WriterSizes;->access$300(Lcom/android/dx/merge/DexMerger$WriterSizes;)I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    const-string v0, "type list"

    .line 131
    .line 132
    invoke-virtual {p3, p1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(ILjava/lang/String;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger;->typeListOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 137
    .line 138
    iget-object p1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰哲世:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 139
    .line 140
    iget-object p3, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 141
    .line 142
    iget v0, p3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:I

    .line 143
    .line 144
    iput v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 145
    .line 146
    invoke-static {p4}, Lcom/android/dx/merge/DexMerger$WriterSizes;->access$400(Lcom/android/dx/merge/DexMerger$WriterSizes;)I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    const-string v0, "annotation set ref list"

    .line 151
    .line 152
    invoke-virtual {p3, p1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(ILjava/lang/String;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger;->annotationSetRefListOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 157
    .line 158
    iget-object p1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲世苏兰:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 159
    .line 160
    iget-object p3, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 161
    .line 162
    iget v0, p3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:I

    .line 163
    .line 164
    iput v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 165
    .line 166
    invoke-static {p4}, Lcom/android/dx/merge/DexMerger$WriterSizes;->access$500(Lcom/android/dx/merge/DexMerger$WriterSizes;)I

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    const-string v0, "annotation sets"

    .line 171
    .line 172
    invoke-virtual {p3, p1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(ILjava/lang/String;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger;->annotationSetOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 177
    .line 178
    iget-object p1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲世兰苏:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 179
    .line 180
    iget-object p3, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 181
    .line 182
    iget v0, p3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:I

    .line 183
    .line 184
    iput v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 185
    .line 186
    invoke-static {p4}, Lcom/android/dx/merge/DexMerger$WriterSizes;->access$600(Lcom/android/dx/merge/DexMerger$WriterSizes;)I

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    const-string v0, "class data"

    .line 191
    .line 192
    invoke-virtual {p3, p1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(ILjava/lang/String;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger;->classDataOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 197
    .line 198
    iget-object p1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏世兰:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 199
    .line 200
    iget-object p3, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 201
    .line 202
    iget v0, p3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:I

    .line 203
    .line 204
    iput v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 205
    .line 206
    invoke-static {p4}, Lcom/android/dx/merge/DexMerger$WriterSizes;->access$700(Lcom/android/dx/merge/DexMerger$WriterSizes;)I

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    const-string v0, "code"

    .line 211
    .line 212
    invoke-virtual {p3, p1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(ILjava/lang/String;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 217
    .line 218
    iget-object p1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 219
    .line 220
    iget-object p3, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 221
    .line 222
    iget v0, p3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:I

    .line 223
    .line 224
    iput v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 225
    .line 226
    invoke-static {p4}, Lcom/android/dx/merge/DexMerger$WriterSizes;->access$800(Lcom/android/dx/merge/DexMerger$WriterSizes;)I

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    const-string v0, "string data"

    .line 231
    .line 232
    invoke-virtual {p3, p1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(ILjava/lang/String;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger;->stringDataOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 237
    .line 238
    iget-object p1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 239
    .line 240
    iget-object p3, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 241
    .line 242
    iget v0, p3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:I

    .line 243
    .line 244
    iput v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 245
    .line 246
    invoke-static {p4}, Lcom/android/dx/merge/DexMerger$WriterSizes;->access$900(Lcom/android/dx/merge/DexMerger$WriterSizes;)I

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    const-string v0, "debug info"

    .line 251
    .line 252
    invoke-virtual {p3, p1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(ILjava/lang/String;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger;->debugInfoOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 257
    .line 258
    iget-object p1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 259
    .line 260
    iget-object p3, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 261
    .line 262
    iget v0, p3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:I

    .line 263
    .line 264
    iput v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 265
    .line 266
    invoke-static {p4}, Lcom/android/dx/merge/DexMerger$WriterSizes;->access$1000(Lcom/android/dx/merge/DexMerger$WriterSizes;)I

    .line 267
    .line 268
    .line 269
    move-result p1

    .line 270
    const-string v0, "annotation"

    .line 271
    .line 272
    invoke-virtual {p3, p1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(ILjava/lang/String;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger;->annotationOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 277
    .line 278
    iget-object p1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰世苏哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 279
    .line 280
    iget-object p3, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 281
    .line 282
    iget v0, p3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:I

    .line 283
    .line 284
    iput v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 285
    .line 286
    invoke-static {p4}, Lcom/android/dx/merge/DexMerger$WriterSizes;->access$1100(Lcom/android/dx/merge/DexMerger$WriterSizes;)I

    .line 287
    .line 288
    .line 289
    move-result p1

    .line 290
    const-string v0, "encoded array"

    .line 291
    .line 292
    invoke-virtual {p3, p1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(ILjava/lang/String;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger;->encodedArrayOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 297
    .line 298
    iget-object p1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰世哲苏:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 299
    .line 300
    iget-object p3, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 301
    .line 302
    iget v0, p3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:I

    .line 303
    .line 304
    iput v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 305
    .line 306
    invoke-static {p4}, Lcom/android/dx/merge/DexMerger$WriterSizes;->access$1200(Lcom/android/dx/merge/DexMerger$WriterSizes;)I

    .line 307
    .line 308
    .line 309
    move-result p1

    .line 310
    const-string p4, "annotations directory"

    .line 311
    .line 312
    invoke-virtual {p3, p1, p4}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(ILjava/lang/String;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger;->annotationsDirectoryOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 317
    .line 318
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 319
    .line 320
    iget p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:I

    .line 321
    .line 322
    iget p1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰苏哲:I

    .line 323
    .line 324
    sub-int/2addr p0, p1

    .line 325
    iput p0, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪哲兰苏:I

    .line 326
    .line 327
    return-void
.end method

.method public static synthetic access$1300(Lcom/android/dx/merge/DexMerger;)[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger;->dexes:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1400(Lcom/android/dx/merge/DexMerger;)[Lcom/android/dx/merge/IndexMap;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger;->indexMaps:[Lcom/android/dx/merge/IndexMap;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1500(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger;->contentsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1600(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger;->stringDataOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1700(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger;->idsDefsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1800(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger;->typeListOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1900(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger;->annotationOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2000(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger;->headerOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2100(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger;->mapListOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2200(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger;->classDataOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2300(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2400(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger;->debugInfoOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2500(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger;->encodedArrayOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2600(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger;->annotationsDirectoryOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2700(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger;->annotationSetOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2800(Lcom/android/dx/merge/DexMerger;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger;->annotationSetRefListOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    return-object p0
.end method

.method private getSortedTypes()[Lcom/android/dx/merge/SortableType;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->contentsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 4
    .line 5
    iget v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    new-array v1, v0, [Lcom/android/dx/merge/SortableType;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    iget-object v4, p0, Lcom/android/dx/merge/DexMerger;->dexes:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 12
    .line 13
    array-length v5, v4

    .line 14
    if-ge v3, v5, :cond_0

    .line 15
    .line 16
    aget-object v4, v4, v3

    .line 17
    .line 18
    iget-object v5, p0, Lcom/android/dx/merge/DexMerger;->indexMaps:[Lcom/android/dx/merge/IndexMap;

    .line 19
    .line 20
    aget-object v5, v5, v3

    .line 21
    .line 22
    invoke-direct {p0, v1, v4, v5}, Lcom/android/dx/merge/DexMerger;->readSortableTypes([Lcom/android/dx/merge/SortableType;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/IndexMap;)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p0, 0x1

    .line 29
    move v3, v2

    .line 30
    :goto_1
    if-ge v3, v0, :cond_2

    .line 31
    .line 32
    aget-object v4, v1, v3

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    invoke-virtual {v4}, Lcom/android/dx/merge/SortableType;->isDepthAssigned()Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-nez v5, :cond_1

    .line 41
    .line 42
    invoke-virtual {v4, v1}, Lcom/android/dx/merge/SortableType;->tryAssignDepth([Lcom/android/dx/merge/SortableType;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    and-int/2addr p0, v4

    .line 47
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    if-eqz p0, :cond_0

    .line 51
    .line 52
    sget-object p0, Lcom/android/dx/merge/SortableType;->NULLS_LAST_ORDER:Ljava/util/Comparator;

    .line 53
    .line 54
    invoke-static {v1, p0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-interface {p0, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    const/4 v0, -0x1

    .line 67
    if-eq p0, v0, :cond_3

    .line 68
    .line 69
    invoke-static {v1, v2, p0}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, [Lcom/android/dx/merge/SortableType;

    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_3
    return-object v1
.end method

.method public static main([Ljava/lang/String;)V
    .locals 6

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x2

    .line 3
    if-ge v0, v1, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/android/dx/merge/DexMerger;->printUsage()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    array-length v0, p0

    .line 10
    const/4 v1, 0x1

    .line 11
    sub-int/2addr v0, v1

    .line 12
    new-array v0, v0, [L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 13
    .line 14
    :goto_0
    array-length v2, p0

    .line 15
    if-ge v1, v2, :cond_1

    .line 16
    .line 17
    add-int/lit8 v2, v1, -0x1

    .line 18
    .line 19
    new-instance v3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 20
    .line 21
    new-instance v4, Ljava/io/File;

    .line 22
    .line 23
    aget-object v5, p0, v1

    .line 24
    .line 25
    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v3, v4}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;-><init>(Ljava/io/File;)V

    .line 29
    .line 30
    .line 31
    aput-object v3, v0, v2

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    new-instance v1, Lcom/android/dx/merge/DexMerger;

    .line 37
    .line 38
    sget-object v2, Lcom/android/dx/merge/CollisionPolicy;->KEEP_FIRST:Lcom/android/dx/merge/CollisionPolicy;

    .line 39
    .line 40
    new-instance v3, Lcom/android/dx/command/dexer/DxContext;

    .line 41
    .line 42
    invoke-direct {v3}, Lcom/android/dx/command/dexer/DxContext;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, v0, v2, v3}, Lcom/android/dx/merge/DexMerger;-><init>([L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/CollisionPolicy;Lcom/android/dx/command/dexer/DxContext;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/android/dx/merge/DexMerger;->merge()L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v1, Ljava/io/File;

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    aget-object p0, p0, v2

    .line 56
    .line 57
    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance p0, Ljava/io/FileOutputStream;

    .line 64
    .line 65
    invoke-direct {p0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 66
    .line 67
    .line 68
    :try_start_0
    invoke-virtual {v0, p0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世哲兰(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    :try_start_1
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :catchall_1
    move-exception p0

    .line 81
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    throw v0
.end method

.method private mergeAnnotations()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/merge/DexMerger$9;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->annotationOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lcom/android/dx/merge/DexMerger$9;-><init>(Lcom/android/dx/merge/DexMerger;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->mergeUnsorted()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private mergeApiLevels()I
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/android/dx/merge/DexMerger;->dexes:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 4
    .line 5
    array-length v3, v2

    .line 6
    if-ge v1, v3, :cond_1

    .line 7
    .line 8
    aget-object v2, v2, v1

    .line 9
    .line 10
    iget-object v2, v2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 11
    .line 12
    iget v2, v2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏哲世:I

    .line 13
    .line 14
    if-ge v0, v2, :cond_0

    .line 15
    .line 16
    move v0, v2

    .line 17
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    return v0
.end method

.method private mergeCallSiteIds()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/merge/DexMerger$5;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->idsDefsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lcom/android/dx/merge/DexMerger$5;-><init>(Lcom/android/dx/merge/DexMerger;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->mergeSorted()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private mergeClassDefs()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/android/dx/merge/DexMerger;->getSortedTypes()[Lcom/android/dx/merge/SortableType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->contentsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 6
    .line 7
    iget-object v1, v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/android/dx/merge/DexMerger;->idsDefsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 10
    .line 11
    iget-object v2, v2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iput v2, v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 18
    .line 19
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->contentsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 20
    .line 21
    iget-object v1, v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 22
    .line 23
    array-length v2, v0

    .line 24
    iput v2, v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 25
    .line 26
    array-length v1, v0

    .line 27
    const/4 v2, 0x0

    .line 28
    :goto_0
    if-ge v2, v1, :cond_0

    .line 29
    .line 30
    aget-object v3, v0, v2

    .line 31
    .line 32
    invoke-virtual {v3}, Lcom/android/dx/merge/SortableType;->getDex()L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v3}, Lcom/android/dx/merge/SortableType;->getClassDef()L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v3}, Lcom/android/dx/merge/SortableType;->getIndexMap()Lcom/android/dx/merge/IndexMap;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-direct {p0, v4, v5, v3}, Lcom/android/dx/merge/DexMerger;->transformClassDef(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;Lcom/android/dx/merge/IndexMap;)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    return-void
.end method

.method private mergeDexes()L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;
    .locals 9

    .line 1
    invoke-direct {p0}, Lcom/android/dx/merge/DexMerger;->mergeStringIds()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/android/dx/merge/DexMerger;->mergeTypeIds()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/android/dx/merge/DexMerger;->mergeTypeLists()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/android/dx/merge/DexMerger;->mergeProtoIds()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/android/dx/merge/DexMerger;->mergeFieldIds()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/android/dx/merge/DexMerger;->mergeMethodIds()V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lcom/android/dx/merge/DexMerger;->mergeMethodHandles()V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lcom/android/dx/merge/DexMerger;->mergeAnnotations()V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Lcom/android/dx/merge/DexMerger;->unionAnnotationSetsAndDirectories()V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Lcom/android/dx/merge/DexMerger;->mergeCallSiteIds()V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lcom/android/dx/merge/DexMerger;->mergeClassDefs()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->contentsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 35
    .line 36
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 37
    .line 38
    invoke-static {v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->contentsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 42
    .line 43
    iget-object v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    iput v2, v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    iput v3, v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 50
    .line 51
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 52
    .line 53
    iget-object v1, v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    iput v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏哲兰:I

    .line 60
    .line 61
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->contentsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 62
    .line 63
    invoke-virtual {v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰()V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->contentsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 67
    .line 68
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->headerOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 69
    .line 70
    invoke-direct {p0}, Lcom/android/dx/merge/DexMerger;->mergeApiLevels()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {v3}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    const-string v4, "UTF-8"

    .line 82
    .line 83
    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v1, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->write([B)V

    .line 88
    .line 89
    .line 90
    iget v3, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰哲世苏:I

    .line 91
    .line 92
    invoke-virtual {v1, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 93
    .line 94
    .line 95
    iget-object v3, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰哲苏世:[B

    .line 96
    .line 97
    invoke-virtual {v1, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->write([B)V

    .line 98
    .line 99
    .line 100
    iget v3, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏哲兰:I

    .line 101
    .line 102
    invoke-virtual {v1, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 103
    .line 104
    .line 105
    const/16 v3, 0x70

    .line 106
    .line 107
    invoke-virtual {v1, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 108
    .line 109
    .line 110
    const v3, 0x12345678

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 114
    .line 115
    .line 116
    iget v3, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏兰哲:I

    .line 117
    .line 118
    invoke-virtual {v1, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 119
    .line 120
    .line 121
    iget v3, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪哲苏兰:I

    .line 122
    .line 123
    invoke-virtual {v1, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 124
    .line 125
    .line 126
    iget-object v3, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 127
    .line 128
    iget v3, v3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 129
    .line 130
    invoke-virtual {v1, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 131
    .line 132
    .line 133
    iget-object v3, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 134
    .line 135
    iget v4, v3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 136
    .line 137
    invoke-virtual {v1, v4}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 138
    .line 139
    .line 140
    iget v3, v3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 141
    .line 142
    invoke-virtual {v1, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 143
    .line 144
    .line 145
    iget-object v3, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 146
    .line 147
    iget v4, v3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 148
    .line 149
    invoke-virtual {v1, v4}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 150
    .line 151
    .line 152
    iget v3, v3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 153
    .line 154
    invoke-virtual {v1, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 155
    .line 156
    .line 157
    iget-object v3, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 158
    .line 159
    iget v4, v3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 160
    .line 161
    invoke-virtual {v1, v4}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 162
    .line 163
    .line 164
    iget v3, v3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 165
    .line 166
    invoke-virtual {v1, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 167
    .line 168
    .line 169
    iget-object v3, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 170
    .line 171
    iget v4, v3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 172
    .line 173
    invoke-virtual {v1, v4}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 174
    .line 175
    .line 176
    iget v3, v3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 177
    .line 178
    invoke-virtual {v1, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 179
    .line 180
    .line 181
    iget-object v3, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 182
    .line 183
    iget v4, v3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 184
    .line 185
    invoke-virtual {v1, v4}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 186
    .line 187
    .line 188
    iget v3, v3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 189
    .line 190
    invoke-virtual {v1, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 191
    .line 192
    .line 193
    iget-object v3, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 194
    .line 195
    iget v4, v3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 196
    .line 197
    invoke-virtual {v1, v4}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 198
    .line 199
    .line 200
    iget v3, v3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 201
    .line 202
    invoke-virtual {v1, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 203
    .line 204
    .line 205
    iget v3, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪哲兰苏:I

    .line 206
    .line 207
    invoke-virtual {v1, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 208
    .line 209
    .line 210
    iget v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰苏哲:I

    .line 211
    .line 212
    invoke-virtual {v1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 213
    .line 214
    .line 215
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->contentsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 216
    .line 217
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->mapListOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 218
    .line 219
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 220
    .line 221
    array-length v3, v0

    .line 222
    move v4, v2

    .line 223
    move v5, v4

    .line 224
    :goto_0
    if-ge v4, v3, :cond_1

    .line 225
    .line 226
    aget-object v6, v0, v4

    .line 227
    .line 228
    invoke-virtual {v6}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()Z

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    if-eqz v6, :cond_0

    .line 233
    .line 234
    add-int/lit8 v5, v5, 0x1

    .line 235
    .line 236
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 237
    .line 238
    goto :goto_0

    .line 239
    :cond_1
    invoke-virtual {v1, v5}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 240
    .line 241
    .line 242
    array-length v3, v0

    .line 243
    move v4, v2

    .line 244
    :goto_1
    if-ge v4, v3, :cond_3

    .line 245
    .line 246
    aget-object v5, v0, v4

    .line 247
    .line 248
    invoke-virtual {v5}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()Z

    .line 249
    .line 250
    .line 251
    move-result v6

    .line 252
    if-eqz v6, :cond_2

    .line 253
    .line 254
    iget-short v6, v5, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:S

    .line 255
    .line 256
    invoke-virtual {v1, v6}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世哲兰(S)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1, v2}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世哲兰(S)V

    .line 260
    .line 261
    .line 262
    iget v6, v5, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 263
    .line 264
    invoke-virtual {v1, v6}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 265
    .line 266
    .line 267
    iget v5, v5, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 268
    .line 269
    invoke-virtual {v1, v5}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 270
    .line 271
    .line 272
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 273
    .line 274
    goto :goto_1

    .line 275
    :cond_3
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 276
    .line 277
    const/16 v1, 0xc

    .line 278
    .line 279
    invoke-virtual {v0, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(I)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    :try_start_0
    const-string v4, "SHA-1"

    .line 284
    .line 285
    invoke-static {v4}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 286
    .line 287
    .line 288
    move-result-object v4
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 289
    const/16 v5, 0x2000

    .line 290
    .line 291
    new-array v6, v5, [B

    .line 292
    .line 293
    iget-object v7, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/nio/ByteBuffer;

    .line 294
    .line 295
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    invoke-virtual {v7}, Ljava/nio/Buffer;->capacity()I

    .line 300
    .line 301
    .line 302
    move-result v8

    .line 303
    invoke-virtual {v7, v8}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 304
    .line 305
    .line 306
    move-result-object v8

    .line 307
    check-cast v8, Ljava/nio/ByteBuffer;

    .line 308
    .line 309
    const/16 v8, 0x20

    .line 310
    .line 311
    invoke-virtual {v7, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 312
    .line 313
    .line 314
    move-result-object v8

    .line 315
    check-cast v8, Ljava/nio/ByteBuffer;

    .line 316
    .line 317
    :goto_2
    invoke-virtual {v7}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 318
    .line 319
    .line 320
    move-result v8

    .line 321
    if-eqz v8, :cond_4

    .line 322
    .line 323
    invoke-virtual {v7}, Ljava/nio/Buffer;->remaining()I

    .line 324
    .line 325
    .line 326
    move-result v8

    .line 327
    invoke-static {v5, v8}, Ljava/lang/Math;->min(II)I

    .line 328
    .line 329
    .line 330
    move-result v8

    .line 331
    invoke-virtual {v7, v6, v2, v8}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v4, v6, v2, v8}, Ljava/security/MessageDigest;->update([BII)V

    .line 335
    .line 336
    .line 337
    goto :goto_2

    .line 338
    :cond_4
    invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    invoke-virtual {v3, v4}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->write([B)V

    .line 343
    .line 344
    .line 345
    const/16 v3, 0x8

    .line 346
    .line 347
    invoke-virtual {v0, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(I)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    new-instance v4, Ljava/util/zip/Adler32;

    .line 352
    .line 353
    invoke-direct {v4}, Ljava/util/zip/Adler32;-><init>()V

    .line 354
    .line 355
    .line 356
    new-array v6, v5, [B

    .line 357
    .line 358
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/nio/ByteBuffer;

    .line 359
    .line 360
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 365
    .line 366
    .line 367
    move-result v7

    .line 368
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 369
    .line 370
    .line 371
    move-result-object v7

    .line 372
    check-cast v7, Ljava/nio/ByteBuffer;

    .line 373
    .line 374
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 379
    .line 380
    :goto_3
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    if-eqz v1, :cond_5

    .line 385
    .line 386
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    .line 391
    .line 392
    .line 393
    move-result v1

    .line 394
    invoke-virtual {v0, v6, v2, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v4, v6, v2, v1}, Ljava/util/zip/Adler32;->update([BII)V

    .line 398
    .line 399
    .line 400
    goto :goto_3

    .line 401
    :cond_5
    invoke-virtual {v4}, Ljava/util/zip/Adler32;->getValue()J

    .line 402
    .line 403
    .line 404
    move-result-wide v0

    .line 405
    long-to-int v0, v0

    .line 406
    invoke-virtual {v3, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 407
    .line 408
    .line 409
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 410
    .line 411
    return-object p0

    .line 412
    :catch_0
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 413
    .line 414
    .line 415
    const/4 p0, 0x0

    .line 416
    return-object p0
.end method

.method private mergeFieldIds()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/merge/DexMerger$7;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->idsDefsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lcom/android/dx/merge/DexMerger$7;-><init>(Lcom/android/dx/merge/DexMerger;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->mergeSorted()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private mergeMethodHandles()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/merge/DexMerger$6;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->idsDefsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lcom/android/dx/merge/DexMerger$6;-><init>(Lcom/android/dx/merge/DexMerger;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->mergeUnsorted()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private mergeMethodIds()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/merge/DexMerger$8;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->idsDefsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lcom/android/dx/merge/DexMerger$8;-><init>(Lcom/android/dx/merge/DexMerger;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->mergeSorted()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private mergeProtoIds()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/merge/DexMerger$4;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->idsDefsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lcom/android/dx/merge/DexMerger$4;-><init>(Lcom/android/dx/merge/DexMerger;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->mergeSorted()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private mergeStringIds()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/merge/DexMerger$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->idsDefsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lcom/android/dx/merge/DexMerger$1;-><init>(Lcom/android/dx/merge/DexMerger;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->mergeSorted()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private mergeTypeIds()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/merge/DexMerger$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->idsDefsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lcom/android/dx/merge/DexMerger$2;-><init>(Lcom/android/dx/merge/DexMerger;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->mergeSorted()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private mergeTypeLists()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/merge/DexMerger$3;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->typeListOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lcom/android/dx/merge/DexMerger$3;-><init>(Lcom/android/dx/merge/DexMerger;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->mergeUnsorted()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static printUsage()V
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 2
    .line 3
    const-string v1, "Usage: DexMerger <out.dex> <a.dex> <b.dex> ..."

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/io/PrintStream;->println()V

    .line 11
    .line 12
    .line 13
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 14
    .line 15
    const-string v1, "If a class is defined in several dex, the class found in the first dex will be used."

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private readSortableTypes([Lcom/android/dx/merge/SortableType;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/IndexMap;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 5
    .line 6
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 7
    .line 8
    invoke-virtual {v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v0, Lcom/google/protobuf/飘花落叶言世兰楪子哲苏;

    .line 22
    .line 23
    invoke-direct {v0, p2}, Lcom/google/protobuf/飘花落叶言世兰楪子哲苏;-><init>(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;

    .line 37
    .line 38
    new-instance v2, Lcom/android/dx/merge/SortableType;

    .line 39
    .line 40
    invoke-direct {v2, p2, p3, v1}, Lcom/android/dx/merge/SortableType;-><init>(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/IndexMap;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3, v2}, Lcom/android/dx/merge/IndexMap;->adjust(Lcom/android/dx/merge/SortableType;)Lcom/android/dx/merge/SortableType;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Lcom/android/dx/merge/SortableType;->getTypeIndex()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    aget-object v4, p1, v3

    .line 52
    .line 53
    if-nez v4, :cond_1

    .line 54
    .line 55
    aput-object v2, p1, v3

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object v2, p0, Lcom/android/dx/merge/DexMerger;->collisionPolicy:Lcom/android/dx/merge/CollisionPolicy;

    .line 59
    .line 60
    sget-object v3, Lcom/android/dx/merge/CollisionPolicy;->KEEP_FIRST:Lcom/android/dx/merge/CollisionPolicy;

    .line 61
    .line 62
    if-ne v2, v3, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    new-instance p0, Lcom/android/dex/DexException;

    .line 66
    .line 67
    iget-object p1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲兰世;

    .line 68
    .line 69
    iget p2, v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:I

    .line 70
    .line 71
    invoke-virtual {p1, p2}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲兰世;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Ljava/lang/String;

    .line 76
    .line 77
    const-string p2, "Multiple dex files define "

    .line 78
    .line 79
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-direct {p0, p1}, Lcom/android/dex/DexException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p0

    .line 87
    :cond_3
    return-void
.end method

.method private transformAnnotationDirectories(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/IndexMap;)V
    .locals 3

    .line 1
    iget-object v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰世哲苏:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 4
    .line 5
    invoke-virtual {v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 12
    .line 13
    invoke-virtual {p1, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(I)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    iget v2, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 19
    .line 20
    if-ge v1, v2, :cond_0

    .line 21
    .line 22
    invoke-direct {p0, p1, p2}, Lcom/android/dx/merge/DexMerger;->transformAnnotationDirectory(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method private transformAnnotationDirectory(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->contentsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰世哲苏:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 4
    .line 5
    iget v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    iput v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 10
    .line 11
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->annotationsDirectoryOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 12
    .line 13
    invoke-virtual {v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->annotationsDirectoryOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 23
    .line 24
    iget-object v1, v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p2, v0, v1}, Lcom/android/dx/merge/IndexMap;->putAnnotationDirectoryOffset(II)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-virtual {p2, v0}, Lcom/android/dx/merge/IndexMap;->adjustAnnotationSet(I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->annotationsDirectoryOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->annotationsDirectoryOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    iget-object v2, p0, Lcom/android/dx/merge/DexMerger;->annotationsDirectoryOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 62
    .line 63
    invoke-virtual {v2, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    iget-object v3, p0, Lcom/android/dx/merge/DexMerger;->annotationsDirectoryOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 71
    .line 72
    invoke-virtual {v3, v2}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 73
    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    move v4, v3

    .line 77
    :goto_0
    if-ge v4, v0, :cond_0

    .line 78
    .line 79
    iget-object v5, p0, Lcom/android/dx/merge/DexMerger;->annotationsDirectoryOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    invoke-virtual {p2, v6}, Lcom/android/dx/merge/IndexMap;->adjustField(I)I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    invoke-virtual {v5, v6}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 90
    .line 91
    .line 92
    iget-object v5, p0, Lcom/android/dx/merge/DexMerger;->annotationsDirectoryOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    invoke-virtual {p2, v6}, Lcom/android/dx/merge/IndexMap;->adjustAnnotationSet(I)I

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    invoke-virtual {v5, v6}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 103
    .line 104
    .line 105
    add-int/lit8 v4, v4, 0x1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_0
    move v0, v3

    .line 109
    :goto_1
    if-ge v0, v1, :cond_1

    .line 110
    .line 111
    iget-object v4, p0, Lcom/android/dx/merge/DexMerger;->annotationsDirectoryOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    invoke-virtual {p2, v5}, Lcom/android/dx/merge/IndexMap;->adjustMethod(I)I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    invoke-virtual {v4, v5}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 122
    .line 123
    .line 124
    iget-object v4, p0, Lcom/android/dx/merge/DexMerger;->annotationsDirectoryOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    invoke-virtual {p2, v5}, Lcom/android/dx/merge/IndexMap;->adjustAnnotationSet(I)I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    invoke-virtual {v4, v5}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 135
    .line 136
    .line 137
    add-int/lit8 v0, v0, 0x1

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_1
    :goto_2
    if-ge v3, v2, :cond_2

    .line 141
    .line 142
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->annotationsDirectoryOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    invoke-virtual {p2, v1}, Lcom/android/dx/merge/IndexMap;->adjustMethod(I)I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    invoke-virtual {v0, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->annotationsDirectoryOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    invoke-virtual {p2, v1}, Lcom/android/dx/merge/IndexMap;->adjustAnnotationSetRefList(I)I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    invoke-virtual {v0, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 166
    .line 167
    .line 168
    add-int/lit8 v3, v3, 0x1

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_2
    return-void
.end method

.method private transformAnnotationSet(Lcom/android/dx/merge/IndexMap;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->contentsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲世苏兰:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 4
    .line 5
    iget v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    iput v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 10
    .line 11
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->annotationSetOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 12
    .line 13
    invoke-virtual {v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->annotationSetOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 23
    .line 24
    iget-object v1, v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p1, v0, v1}, Lcom/android/dx/merge/IndexMap;->putAnnotationSetOffset(II)V

    .line 31
    .line 32
    .line 33
    iget-object p2, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->annotationSetOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    :goto_0
    if-ge v1, v0, :cond_0

    .line 46
    .line 47
    iget-object v2, p0, Lcom/android/dx/merge/DexMerger;->annotationSetOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-virtual {p1, v3}, Lcom/android/dx/merge/IndexMap;->adjustAnnotation(I)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    invoke-virtual {v2, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 58
    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    return-void
.end method

.method private transformAnnotationSetRefList(Lcom/android/dx/merge/IndexMap;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->contentsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰哲世:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 4
    .line 5
    iget v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    iput v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 10
    .line 11
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->annotationSetRefListOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 12
    .line 13
    invoke-virtual {v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->annotationSetRefListOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 23
    .line 24
    iget-object v1, v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p1, v0, v1}, Lcom/android/dx/merge/IndexMap;->putAnnotationSetRefListOffset(II)V

    .line 31
    .line 32
    .line 33
    iget-object p2, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->annotationSetRefListOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    :goto_0
    if-ge v1, v0, :cond_0

    .line 46
    .line 47
    iget-object v2, p0, Lcom/android/dx/merge/DexMerger;->annotationSetRefListOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-virtual {p1, v3}, Lcom/android/dx/merge/IndexMap;->adjustAnnotationSet(I)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    invoke-virtual {v2, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 58
    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    return-void
.end method

.method private transformAnnotationSetRefLists(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/IndexMap;)V
    .locals 3

    .line 1
    iget-object v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰哲世:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 4
    .line 5
    invoke-virtual {v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 12
    .line 13
    invoke-virtual {p1, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(I)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    iget v2, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 19
    .line 20
    if-ge v1, v2, :cond_0

    .line 21
    .line 22
    invoke-direct {p0, p2, p1}, Lcom/android/dx/merge/DexMerger;->transformAnnotationSetRefList(Lcom/android/dx/merge/IndexMap;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method private transformAnnotationSets(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/IndexMap;)V
    .locals 3

    .line 1
    iget-object v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲世苏兰:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 4
    .line 5
    invoke-virtual {v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 12
    .line 13
    invoke-virtual {p1, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(I)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    iget v2, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 19
    .line 20
    if-ge v1, v2, :cond_0

    .line 21
    .line 22
    invoke-direct {p0, p2, p1}, Lcom/android/dx/merge/DexMerger;->transformAnnotationSet(Lcom/android/dx/merge/IndexMap;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method private transformCatchHandlers(Lcom/android/dx/merge/IndexMap;[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏世哲兰;)[I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 10
    .line 11
    array-length v2, p2

    .line 12
    invoke-virtual {v1, v2}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 13
    .line 14
    .line 15
    array-length v1, p2

    .line 16
    new-array v1, v1, [I

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    array-length v3, p2

    .line 20
    if-ge v2, v3, :cond_0

    .line 21
    .line 22
    iget-object v3, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 23
    .line 24
    iget-object v3, v3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    sub-int/2addr v3, v0

    .line 31
    aput v3, v1, v2

    .line 32
    .line 33
    aget-object v3, p2, v2

    .line 34
    .line 35
    invoke-direct {p0, v3, p1}, Lcom/android/dx/merge/DexMerger;->transformEncodedCatchHandler(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏世哲兰;Lcom/android/dx/merge/IndexMap;)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-object v1
.end method

.method private transformClassData(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰苏哲;Lcom/android/dx/merge/IndexMap;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->contentsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲世兰苏:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 4
    .line 5
    iget v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    iput v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 10
    .line 11
    iget-object v0, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世哲苏兰;

    .line 12
    .line 13
    iget-object v1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世哲苏兰;

    .line 14
    .line 15
    iget-object v2, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世哲兰苏;

    .line 16
    .line 17
    iget-object p2, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世哲兰苏;

    .line 18
    .line 19
    iget-object v3, p0, Lcom/android/dx/merge/DexMerger;->classDataOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 20
    .line 21
    array-length v4, v0

    .line 22
    invoke-virtual {v3, v4}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 23
    .line 24
    .line 25
    iget-object v3, p0, Lcom/android/dx/merge/DexMerger;->classDataOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 26
    .line 27
    array-length v4, v1

    .line 28
    invoke-virtual {v3, v4}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 29
    .line 30
    .line 31
    iget-object v3, p0, Lcom/android/dx/merge/DexMerger;->classDataOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 32
    .line 33
    array-length v4, v2

    .line 34
    invoke-virtual {v3, v4}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 35
    .line 36
    .line 37
    iget-object v3, p0, Lcom/android/dx/merge/DexMerger;->classDataOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 38
    .line 39
    array-length v4, p2

    .line 40
    invoke-virtual {v3, v4}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, p3, v0}, Lcom/android/dx/merge/DexMerger;->transformFields(Lcom/android/dx/merge/IndexMap;[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世哲苏兰;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, p3, v1}, Lcom/android/dx/merge/DexMerger;->transformFields(Lcom/android/dx/merge/IndexMap;[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世哲苏兰;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, p1, p3, v2}, Lcom/android/dx/merge/DexMerger;->transformMethods(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/IndexMap;[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世哲兰苏;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0, p1, p3, p2}, Lcom/android/dx/merge/DexMerger;->transformMethods(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/IndexMap;[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世哲兰苏;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method private transformClassDef(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;Lcom/android/dx/merge/IndexMap;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->idsDefsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    invoke-virtual {v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->idsDefsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 7
    .line 8
    iget v1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->idsDefsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 14
    .line 15
    iget v1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:I

    .line 16
    .line 17
    invoke-virtual {v0, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->idsDefsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 21
    .line 22
    iget v1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:I

    .line 23
    .line 24
    invoke-virtual {v0, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->idsDefsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 28
    .line 29
    iget v1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:I

    .line 30
    .line 31
    invoke-virtual {v0, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 32
    .line 33
    .line 34
    iget v0, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:I

    .line 35
    .line 36
    invoke-virtual {p3, v0}, Lcom/android/dx/merge/IndexMap;->adjustString(I)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->idsDefsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 43
    .line 44
    .line 45
    iget v0, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:I

    .line 46
    .line 47
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->idsDefsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 48
    .line 49
    invoke-virtual {p3, v0}, Lcom/android/dx/merge/IndexMap;->adjustAnnotationDirectory(I)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-virtual {v1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 54
    .line 55
    .line 56
    iget v0, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:I

    .line 57
    .line 58
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->idsDefsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 59
    .line 60
    if-nez v0, :cond_0

    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    invoke-virtual {v1, p1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->classDataOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 68
    .line 69
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-virtual {v1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, p2}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰苏哲;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-direct {p0, p1, v0, p3}, Lcom/android/dx/merge/DexMerger;->transformClassData(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰苏哲;Lcom/android/dx/merge/IndexMap;)V

    .line 83
    .line 84
    .line 85
    :goto_0
    iget p1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世:I

    .line 86
    .line 87
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger;->idsDefsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 88
    .line 89
    invoke-virtual {p3, p1}, Lcom/android/dx/merge/IndexMap;->adjustEncodedArray(I)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-virtual {p0, p1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method private transformCode(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲世兰;Lcom/android/dx/merge/IndexMap;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->contentsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏世兰:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 4
    .line 5
    iget v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    add-int/2addr v1, v2

    .line 9
    iput v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 10
    .line 11
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 12
    .line 13
    invoke-virtual {v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 17
    .line 18
    iget v1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 24
    .line 25
    iget v1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:I

    .line 26
    .line 27
    invoke-virtual {v0, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(I)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 31
    .line 32
    iget v1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:I

    .line 33
    .line 34
    invoke-virtual {v0, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏世兰哲;

    .line 38
    .line 39
    iget-object v1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏世哲兰;

    .line 40
    .line 41
    iget-object v3, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 42
    .line 43
    array-length v4, v0

    .line 44
    invoke-virtual {v3, v4}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(I)V

    .line 45
    .line 46
    .line 47
    iget v3, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏:I

    .line 48
    .line 49
    iget-object v4, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    iget-object v6, p0, Lcom/android/dx/merge/DexMerger;->debugInfoOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 55
    .line 56
    iget-object v6, v6, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 57
    .line 58
    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    invoke-virtual {v4, v6}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(I)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-direct {p0, p1, p3}, Lcom/android/dx/merge/DexMerger;->transformDebugInfoItem(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {v4, v5}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 74
    .line 75
    .line 76
    :goto_0
    iget-object p1, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲:[S

    .line 77
    .line 78
    iget-object p2, p0, Lcom/android/dx/merge/DexMerger;->instructionTransformer:Lcom/android/dx/merge/InstructionTransformer;

    .line 79
    .line 80
    invoke-virtual {p2, p3, p1}, Lcom/android/dx/merge/InstructionTransformer;->transform(Lcom/android/dx/merge/IndexMap;[S)[S

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iget-object p2, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 85
    .line 86
    array-length v3, p1

    .line 87
    invoke-virtual {p2, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 88
    .line 89
    .line 90
    iget-object p2, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    array-length v3, p1

    .line 96
    move v4, v5

    .line 97
    :goto_1
    if-ge v4, v3, :cond_1

    .line 98
    .line 99
    aget-short v6, p1, v4

    .line 100
    .line 101
    invoke-virtual {p2, v6}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世哲兰(S)V

    .line 102
    .line 103
    .line 104
    add-int/lit8 v4, v4, 0x1

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    array-length p2, v0

    .line 108
    if-lez p2, :cond_4

    .line 109
    .line 110
    array-length p1, p1

    .line 111
    rem-int/lit8 p1, p1, 0x2

    .line 112
    .line 113
    if-ne p1, v2, :cond_2

    .line 114
    .line 115
    iget-object p1, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 116
    .line 117
    invoke-virtual {p1, v5}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世哲兰(S)V

    .line 118
    .line 119
    .line 120
    :cond_2
    iget-object p1, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 121
    .line 122
    iget-object p2, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 123
    .line 124
    iget-object p2, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 125
    .line 126
    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    invoke-virtual {p1, p2}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(I)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    iget-object p2, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 135
    .line 136
    array-length v2, v0

    .line 137
    mul-int/lit8 v2, v2, 0x8

    .line 138
    .line 139
    if-ltz v2, :cond_3

    .line 140
    .line 141
    iget-object p2, p2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 142
    .line 143
    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    add-int/2addr v3, v2

    .line 148
    invoke-virtual {p2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    check-cast p2, Ljava/nio/ByteBuffer;

    .line 153
    .line 154
    invoke-direct {p0, p3, v1}, Lcom/android/dx/merge/DexMerger;->transformCatchHandlers(Lcom/android/dx/merge/IndexMap;[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏世哲兰;)[I

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    invoke-direct {p0, p1, v0, p2}, Lcom/android/dx/merge/DexMerger;->transformTries(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏世兰哲;[I)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-static {}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()V

    .line 166
    .line 167
    .line 168
    :cond_4
    return-void
.end method

.method private transformDebugInfoItem(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->contentsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 4
    .line 5
    iget v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    iput v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏(L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世苏哲兰;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->debugInfoOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏(L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世苏哲兰;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->debugInfoOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    :goto_0
    if-ge v1, v0, :cond_0

    .line 34
    .line 35
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏(L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世苏哲兰;)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    add-int/lit8 v2, v2, -0x1

    .line 40
    .line 41
    iget-object v3, p0, Lcom/android/dx/merge/DexMerger;->debugInfoOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 42
    .line 43
    invoke-virtual {p2, v2}, Lcom/android/dx/merge/IndexMap;->adjustString(I)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    invoke-virtual {v3, v2}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    :goto_1
    iget-object v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->debugInfoOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 62
    .line 63
    invoke-virtual {v1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeByte(I)V

    .line 64
    .line 65
    .line 66
    const/16 v1, 0x9

    .line 67
    .line 68
    if-eq v0, v1, :cond_1

    .line 69
    .line 70
    packed-switch v0, :pswitch_data_0

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :pswitch_0
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏(L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世苏哲兰;)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->debugInfoOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 79
    .line 80
    invoke-virtual {v1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :pswitch_1
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏(L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世苏哲兰;)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    iget-object v2, p0, Lcom/android/dx/merge/DexMerger;->debugInfoOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 89
    .line 90
    invoke-virtual {v2, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 91
    .line 92
    .line 93
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏(L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世苏哲兰;)I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    add-int/lit8 v1, v1, -0x1

    .line 98
    .line 99
    iget-object v2, p0, Lcom/android/dx/merge/DexMerger;->debugInfoOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 100
    .line 101
    invoke-virtual {p2, v1}, Lcom/android/dx/merge/IndexMap;->adjustString(I)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    add-int/lit8 v1, v1, 0x1

    .line 106
    .line 107
    invoke-virtual {v2, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 108
    .line 109
    .line 110
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏(L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世苏哲兰;)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    add-int/lit8 v1, v1, -0x1

    .line 115
    .line 116
    iget-object v2, p0, Lcom/android/dx/merge/DexMerger;->debugInfoOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 117
    .line 118
    invoke-virtual {p2, v1}, Lcom/android/dx/merge/IndexMap;->adjustType(I)I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    add-int/lit8 v1, v1, 0x1

    .line 123
    .line 124
    invoke-virtual {v2, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 125
    .line 126
    .line 127
    const/4 v1, 0x4

    .line 128
    if-ne v0, v1, :cond_0

    .line 129
    .line 130
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏(L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世苏哲兰;)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    add-int/lit8 v0, v0, -0x1

    .line 135
    .line 136
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->debugInfoOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 137
    .line 138
    invoke-virtual {p2, v0}, Lcom/android/dx/merge/IndexMap;->adjustString(I)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    add-int/lit8 v0, v0, 0x1

    .line 143
    .line 144
    invoke-virtual {v1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :pswitch_2
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世(L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世苏哲兰;)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->debugInfoOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 153
    .line 154
    invoke-virtual {v1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲(I)V

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :pswitch_3
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏(L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世苏哲兰;)I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->debugInfoOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 163
    .line 164
    invoke-virtual {v1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :pswitch_4
    return-void

    .line 169
    :cond_1
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏(L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世苏哲兰;)I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    add-int/lit8 v0, v0, -0x1

    .line 174
    .line 175
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->debugInfoOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 176
    .line 177
    invoke-virtual {p2, v0}, Lcom/android/dx/merge/IndexMap;->adjustString(I)I

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    add-int/lit8 v0, v0, 0x1

    .line 182
    .line 183
    invoke-virtual {v1, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 184
    .line 185
    .line 186
    goto/16 :goto_1

    .line 187
    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private transformEncodedCatchHandler(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏世哲兰;Lcom/android/dx/merge/IndexMap;)V
    .locals 6

    .line 1
    iget v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 2
    .line 3
    iget-object v1, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:[I

    .line 4
    .line 5
    iget-object p1, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:[I

    .line 6
    .line 7
    iget-object v2, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 8
    .line 9
    const/4 v3, -0x1

    .line 10
    if-eq v0, v3, :cond_0

    .line 11
    .line 12
    array-length v4, v1

    .line 13
    neg-int v4, v4

    .line 14
    invoke-virtual {v2, v4}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲(I)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    array-length v4, v1

    .line 19
    invoke-virtual {v2, v4}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲(I)V

    .line 20
    .line 21
    .line 22
    :goto_0
    const/4 v2, 0x0

    .line 23
    :goto_1
    array-length v4, v1

    .line 24
    if-ge v2, v4, :cond_1

    .line 25
    .line 26
    iget-object v4, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 27
    .line 28
    aget v5, v1, v2

    .line 29
    .line 30
    invoke-virtual {p2, v5}, Lcom/android/dx/merge/IndexMap;->adjustType(I)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    invoke-virtual {v4, v5}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 35
    .line 36
    .line 37
    iget-object v4, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 38
    .line 39
    aget v5, p1, v2

    .line 40
    .line 41
    invoke-virtual {v4, v5}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 42
    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    if-eq v0, v3, :cond_2

    .line 48
    .line 49
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 50
    .line 51
    invoke-virtual {p0, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void
.end method

.method private transformFields(Lcom/android/dx/merge/IndexMap;[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世哲苏兰;)V
    .locals 6

    .line 1
    array-length v0, p2

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v1, v0, :cond_0

    .line 5
    .line 6
    aget-object v3, p2, v1

    .line 7
    .line 8
    iget v4, v3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 9
    .line 10
    invoke-virtual {p1, v4}, Lcom/android/dx/merge/IndexMap;->adjustField(I)I

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    iget-object v5, p0, Lcom/android/dx/merge/DexMerger;->classDataOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 15
    .line 16
    sub-int v2, v4, v2

    .line 17
    .line 18
    invoke-virtual {v5, v2}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lcom/android/dx/merge/DexMerger;->classDataOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 22
    .line 23
    iget v3, v3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 24
    .line 25
    invoke-virtual {v2, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    move v2, v4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method

.method private transformMethods(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/IndexMap;[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世哲兰苏;)V
    .locals 7

    .line 1
    array-length v0, p3

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    :goto_0
    if-ge v2, v0, :cond_2

    .line 6
    .line 7
    aget-object v4, p3, v2

    .line 8
    .line 9
    iget v5, v4, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:I

    .line 10
    .line 11
    invoke-virtual {p2, v5}, Lcom/android/dx/merge/IndexMap;->adjustMethod(I)I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    iget-object v6, p0, Lcom/android/dx/merge/DexMerger;->classDataOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 16
    .line 17
    sub-int v3, v5, v3

    .line 18
    .line 19
    invoke-virtual {v6, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 20
    .line 21
    .line 22
    iget-object v3, p0, Lcom/android/dx/merge/DexMerger;->classDataOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 23
    .line 24
    iget v6, v4, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 25
    .line 26
    invoke-virtual {v3, v6}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 27
    .line 28
    .line 29
    iget v3, v4, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:I

    .line 30
    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    iget-object v3, p0, Lcom/android/dx/merge/DexMerger;->classDataOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 34
    .line 35
    invoke-virtual {v3, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 36
    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_0
    iget-object v3, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 40
    .line 41
    iget-object v3, v3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 42
    .line 43
    :goto_1
    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    and-int/lit8 v6, v6, 0x3

    .line 48
    .line 49
    if-eqz v6, :cond_1

    .line 50
    .line 51
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    iget-object v3, p0, Lcom/android/dx/merge/DexMerger;->classDataOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 56
    .line 57
    iget-object v6, p0, Lcom/android/dx/merge/DexMerger;->codeOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 58
    .line 59
    iget-object v6, v6, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    invoke-virtual {v3, v6}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v4}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰哲苏(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世哲兰苏;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲世兰;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-direct {p0, p1, v3, p2}, Lcom/android/dx/merge/DexMerger;->transformCode(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲世兰;Lcom/android/dx/merge/IndexMap;)V

    .line 73
    .line 74
    .line 75
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    move v3, v5

    .line 78
    goto :goto_0

    .line 79
    :cond_2
    return-void
.end method

.method private transformStaticValues(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->contentsOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰世苏哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 4
    .line 5
    iget v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    iput v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 10
    .line 11
    iget-object v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->encodedArrayOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 18
    .line 19
    iget-object v1, v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p2, v0, v1}, Lcom/android/dx/merge/IndexMap;->putEncodedArrayValueOffset(II)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    new-instance v2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲世兰苏;

    .line 35
    .line 36
    const/16 v3, 0x1c

    .line 37
    .line 38
    invoke-direct {v2, p1, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲世兰苏;-><init>(L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世苏哲兰;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世哲兰()V

    .line 42
    .line 43
    .line 44
    new-instance p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲世苏兰;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    sub-int/2addr v2, v1

    .line 51
    new-array v2, v2, [B

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 58
    .line 59
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    .line 62
    invoke-direct {p1, v2}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲世苏兰;-><init>([B)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2, p1}, Lcom/android/dx/merge/IndexMap;->adjustEncodedArray(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲世苏兰;)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲世苏兰;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger;->encodedArrayOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 70
    .line 71
    iget-object p1, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:[B

    .line 72
    .line 73
    invoke-virtual {p0, p1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->write([B)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method private transformStaticValues(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/IndexMap;)V
    .locals 3

    .line 77
    iget-object v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 78
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰世苏哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 79
    invoke-virtual {v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 80
    iget v1, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:I

    invoke-virtual {p1, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(I)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    move-result-object p1

    const/4 v1, 0x0

    .line 81
    :goto_0
    iget v2, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    if-ge v1, v2, :cond_0

    .line 82
    invoke-direct {p0, p1, p2}, Lcom/android/dx/merge/DexMerger;->transformStaticValues(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;Lcom/android/dx/merge/IndexMap;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private transformTries(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏世兰哲;[I)V
    .locals 3

    .line 1
    array-length p0, p2

    .line 2
    const/4 v0, 0x0

    .line 3
    :goto_0
    if-ge v0, p0, :cond_0

    .line 4
    .line 5
    aget-object v1, p2, v0

    .line 6
    .line 7
    iget v2, v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 8
    .line 9
    invoke-virtual {p1, v2}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->writeInt(I)V

    .line 10
    .line 11
    .line 12
    iget v2, v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 13
    .line 14
    invoke-virtual {p1, v2}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(I)V

    .line 15
    .line 16
    .line 17
    iget v1, v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 18
    .line 19
    aget v1, p3, v1

    .line 20
    .line 21
    invoke-virtual {p1, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(I)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method private unionAnnotationSetsAndDirectories()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/android/dx/merge/DexMerger;->dexes:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 4
    .line 5
    array-length v3, v2

    .line 6
    if-ge v1, v3, :cond_0

    .line 7
    .line 8
    aget-object v2, v2, v1

    .line 9
    .line 10
    iget-object v3, p0, Lcom/android/dx/merge/DexMerger;->indexMaps:[Lcom/android/dx/merge/IndexMap;

    .line 11
    .line 12
    aget-object v3, v3, v1

    .line 13
    .line 14
    invoke-direct {p0, v2, v3}, Lcom/android/dx/merge/DexMerger;->transformAnnotationSets(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/IndexMap;)V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v1, v0

    .line 21
    :goto_1
    iget-object v2, p0, Lcom/android/dx/merge/DexMerger;->dexes:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 22
    .line 23
    array-length v3, v2

    .line 24
    if-ge v1, v3, :cond_1

    .line 25
    .line 26
    aget-object v2, v2, v1

    .line 27
    .line 28
    iget-object v3, p0, Lcom/android/dx/merge/DexMerger;->indexMaps:[Lcom/android/dx/merge/IndexMap;

    .line 29
    .line 30
    aget-object v3, v3, v1

    .line 31
    .line 32
    invoke-direct {p0, v2, v3}, Lcom/android/dx/merge/DexMerger;->transformAnnotationSetRefLists(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/IndexMap;)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v1, v0

    .line 39
    :goto_2
    iget-object v2, p0, Lcom/android/dx/merge/DexMerger;->dexes:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 40
    .line 41
    array-length v3, v2

    .line 42
    if-ge v1, v3, :cond_2

    .line 43
    .line 44
    aget-object v2, v2, v1

    .line 45
    .line 46
    iget-object v3, p0, Lcom/android/dx/merge/DexMerger;->indexMaps:[Lcom/android/dx/merge/IndexMap;

    .line 47
    .line 48
    aget-object v3, v3, v1

    .line 49
    .line 50
    invoke-direct {p0, v2, v3}, Lcom/android/dx/merge/DexMerger;->transformAnnotationDirectories(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/IndexMap;)V

    .line 51
    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    :goto_3
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->dexes:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 57
    .line 58
    array-length v2, v1

    .line 59
    if-ge v0, v2, :cond_3

    .line 60
    .line 61
    aget-object v1, v1, v0

    .line 62
    .line 63
    iget-object v2, p0, Lcom/android/dx/merge/DexMerger;->indexMaps:[Lcom/android/dx/merge/IndexMap;

    .line 64
    .line 65
    aget-object v2, v2, v0

    .line 66
    .line 67
    invoke-direct {p0, v1, v2}, Lcom/android/dx/merge/DexMerger;->transformStaticValues(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/IndexMap;)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v0, v0, 0x1

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    return-void
.end method


# virtual methods
.method public merge()L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->dexes:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-ne v1, v2, :cond_0

    .line 7
    .line 8
    aget-object p0, v0, v3

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    array-length v0, v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0

    .line 16
    :cond_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-direct {p0}, Lcom/android/dx/merge/DexMerger;->mergeDexes()L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    new-instance v4, Lcom/android/dx/merge/DexMerger$WriterSizes;

    .line 25
    .line 26
    invoke-direct {v4, p0}, Lcom/android/dx/merge/DexMerger$WriterSizes;-><init>(Lcom/android/dx/merge/DexMerger;)V

    .line 27
    .line 28
    .line 29
    iget-object v5, p0, Lcom/android/dx/merge/DexMerger;->writerSizes:Lcom/android/dx/merge/DexMerger$WriterSizes;

    .line 30
    .line 31
    invoke-virtual {v5}, Lcom/android/dx/merge/DexMerger$WriterSizes;->size()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-virtual {v4}, Lcom/android/dx/merge/DexMerger$WriterSizes;->size()I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    sub-int/2addr v5, v6

    .line 40
    iget v6, p0, Lcom/android/dx/merge/DexMerger;->compactWasteThreshold:I

    .line 41
    .line 42
    const/high16 v7, 0x44800000    # 1024.0f

    .line 43
    .line 44
    if-le v5, v6, :cond_2

    .line 45
    .line 46
    new-instance v2, Lcom/android/dx/merge/DexMerger;

    .line 47
    .line 48
    iget-object v6, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 49
    .line 50
    new-instance v8, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 51
    .line 52
    invoke-direct {v8, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 53
    .line 54
    .line 55
    filled-new-array {v6, v8}, [L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    sget-object v8, Lcom/android/dx/merge/CollisionPolicy;->FAIL:Lcom/android/dx/merge/CollisionPolicy;

    .line 60
    .line 61
    iget-object v9, p0, Lcom/android/dx/merge/DexMerger;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 62
    .line 63
    invoke-direct {v2, v6, v8, v9, v4}, Lcom/android/dx/merge/DexMerger;-><init>([L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/CollisionPolicy;Lcom/android/dx/command/dexer/DxContext;Lcom/android/dx/merge/DexMerger$WriterSizes;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {v2}, Lcom/android/dx/merge/DexMerger;->mergeDexes()L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    iget-object v4, p0, Lcom/android/dx/merge/DexMerger;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 71
    .line 72
    iget-object v4, v4, Lcom/android/dx/command/dexer/DxContext;->out:Ljava/io/PrintStream;

    .line 73
    .line 74
    iget-object v6, p0, Lcom/android/dx/merge/DexMerger;->dexOut:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 75
    .line 76
    iget-object v6, v6, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/nio/ByteBuffer;

    .line 77
    .line 78
    invoke-virtual {v6}, Ljava/nio/Buffer;->capacity()I

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    int-to-float v6, v6

    .line 83
    div-float/2addr v6, v7

    .line 84
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    iget-object v8, v2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/nio/ByteBuffer;

    .line 89
    .line 90
    invoke-virtual {v8}, Ljava/nio/Buffer;->capacity()I

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    int-to-float v8, v8

    .line 95
    div-float/2addr v8, v7

    .line 96
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    int-to-float v5, v5

    .line 101
    div-float/2addr v5, v7

    .line 102
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    filled-new-array {v6, v8, v5}, [Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    const-string v6, "Result compacted from %.1fKiB to %.1fKiB to save %.1fKiB%n"

    .line 111
    .line 112
    invoke-virtual {v4, v6, v5}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 113
    .line 114
    .line 115
    :cond_2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 116
    .line 117
    .line 118
    move-result-wide v4

    .line 119
    sub-long/2addr v4, v0

    .line 120
    :goto_0
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger;->dexes:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 121
    .line 122
    array-length v0, v0

    .line 123
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 124
    .line 125
    if-ge v3, v0, :cond_3

    .line 126
    .line 127
    iget-object v0, v1, Lcom/android/dx/command/dexer/DxContext;->out:Ljava/io/PrintStream;

    .line 128
    .line 129
    add-int/lit8 v1, v3, 0x1

    .line 130
    .line 131
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    iget-object v8, p0, Lcom/android/dx/merge/DexMerger;->dexes:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 136
    .line 137
    aget-object v8, v8, v3

    .line 138
    .line 139
    iget-object v8, v8, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 140
    .line 141
    iget-object v8, v8, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 142
    .line 143
    iget v8, v8, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 144
    .line 145
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    iget-object v9, p0, Lcom/android/dx/merge/DexMerger;->dexes:[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 150
    .line 151
    aget-object v3, v9, v3

    .line 152
    .line 153
    iget-object v3, v3, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/nio/ByteBuffer;

    .line 154
    .line 155
    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    int-to-float v3, v3

    .line 160
    div-float/2addr v3, v7

    .line 161
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    filled-new-array {v6, v8, v3}, [Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    const-string v6, "Merged dex #%d (%d defs/%.1fKiB)%n"

    .line 170
    .line 171
    invoke-virtual {v0, v6, v3}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 172
    .line 173
    .line 174
    move v3, v1

    .line 175
    goto :goto_0

    .line 176
    :cond_3
    iget-object p0, v1, Lcom/android/dx/command/dexer/DxContext;->out:Ljava/io/PrintStream;

    .line 177
    .line 178
    iget-object v0, v2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;

    .line 179
    .line 180
    iget-object v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;

    .line 181
    .line 182
    iget v0, v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:I

    .line 183
    .line 184
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    iget-object v1, v2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/nio/ByteBuffer;

    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    int-to-float v1, v1

    .line 195
    div-float/2addr v1, v7

    .line 196
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    long-to-float v3, v4

    .line 201
    const v4, 0x4e6e6b28    # 1.0E9f

    .line 202
    .line 203
    .line 204
    div-float/2addr v3, v4

    .line 205
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    filled-new-array {v0, v1, v3}, [Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    const-string v1, "Result is %d defs/%.1fKiB. Took %.1fs%n"

    .line 214
    .line 215
    invoke-virtual {p0, v1, v0}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 216
    .line 217
    .line 218
    return-object v2
.end method

.method public setCompactWasteThreshold(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/android/dx/merge/DexMerger;->compactWasteThreshold:I

    .line 2
    .line 3
    return-void
.end method
