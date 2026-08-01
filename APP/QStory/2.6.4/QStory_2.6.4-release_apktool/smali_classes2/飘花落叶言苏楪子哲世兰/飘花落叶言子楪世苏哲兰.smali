.class public final L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏哲兰;
.super L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Lorg/luckypray/dexkit/query/enums/MatchType;

.field public final 飘花落叶言子楪世哲苏兰:I


# direct methods
.method public constructor <init>(ILorg/luckypray/dexkit/query/enums/MatchType;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 8
    .line 9
    iput p1, p0, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 10
    .line 11
    iput-object p2, p0, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世苏兰哲楪(Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iget v1, p0, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 3
    .line 4
    if-eqz v1, :cond_1

    .line 5
    .line 6
    iget-object p0, p0, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 7
    .line 8
    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/enums/MatchType;->getValue()B

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    const/4 v2, 0x2

    .line 13
    invoke-virtual {p1, v2}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏世兰(I)V

    .line 14
    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v2, 0x4

    .line 19
    invoke-virtual {p1, v2, v0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰(II)V

    .line 20
    .line 21
    .line 22
    iget-object v3, p1, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    iget v4, p1, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 25
    .line 26
    sub-int/2addr v4, v2

    .line 27
    iput v4, p1, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 28
    .line 29
    invoke-virtual {v3, v4, v1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世兰苏(I)V

    .line 33
    .line 34
    .line 35
    :cond_0
    const/4 v0, 0x1

    .line 36
    invoke-virtual {p1, p0, v0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(BI)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-virtual {p1, p0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲(I)V

    .line 44
    .line 45
    .line 46
    return p0

    .line 47
    :cond_1
    const-string p0, "modifiers must not be 0"

    .line 48
    .line 49
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return v0
.end method
