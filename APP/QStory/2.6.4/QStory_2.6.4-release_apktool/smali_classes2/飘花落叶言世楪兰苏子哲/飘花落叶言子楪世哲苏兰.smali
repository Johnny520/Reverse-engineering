.class public final L飘花落叶言世楪兰苏子哲/飘花落叶言子楪世哲苏兰;
.super L飘花落叶言世楪兰苏子哲/飘花落叶言子楪世哲兰苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:[Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰世苏;


# direct methods
.method public constructor <init>(I[Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰世苏;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_3

    .line 3
    .line 4
    array-length v1, p2

    .line 5
    const/4 v2, 0x1

    .line 6
    sub-int/2addr v1, v2

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const/16 v3, 0x1f

    .line 11
    .line 12
    :goto_0
    if-ltz v3, :cond_2

    .line 13
    .line 14
    shl-int v4, v2, v3

    .line 15
    .line 16
    and-int/2addr v4, v1

    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    add-int/2addr v2, v3

    .line 20
    :goto_1
    const/4 v0, 0x0

    .line 21
    invoke-direct {p0, p1, v2, v0, v0}, L飘花落叶言世楪兰苏子哲/飘花落叶言子楪世哲兰苏;-><init>(IIIB)V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, L飘花落叶言世楪兰苏子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:[Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰世苏;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    add-int/lit8 v3, v3, -0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const-string p0, "Empty enum: "

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1, p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪苏哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_3
    const-string p0, "Argument for @NotNull parameter \'enumEntries\' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null"

    .line 41
    .line 42
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(I)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, L飘花落叶言世楪兰苏子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    shl-int v0, v1, v0

    .line 5
    .line 6
    sub-int/2addr v0, v1

    .line 7
    iget v1, p0, L飘花落叶言世楪兰苏子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 8
    .line 9
    shl-int/2addr v0, v1

    .line 10
    and-int/2addr p1, v0

    .line 11
    shr-int/2addr p1, v1

    .line 12
    iget-object p0, p0, L飘花落叶言世楪兰苏子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:[Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰世苏;

    .line 13
    .line 14
    array-length v0, p0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, v0, :cond_1

    .line 17
    .line 18
    aget-object v2, p0, v1

    .line 19
    .line 20
    invoke-interface {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰世苏;->getNumber()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-ne v3, p1, :cond_0

    .line 25
    .line 26
    return-object v2

    .line 27
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method
