.class public final Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰苏哲世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:I

.field public final synthetic 飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲世苏;

.field public 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲世苏;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲世苏;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏兰世:I

    .line 8
    .line 9
    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰世苏:[B

    .line 10
    .line 11
    array-length p1, p1

    .line 12
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰世苏:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    if-ge v0, p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲()B

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final remove()V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()B
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    iget-object v0, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰世苏:[B

    .line 4
    .line 5
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏兰世:I

    .line 6
    .line 7
    add-int/lit8 v2, v1, 0x1

    .line 8
    .line 9
    iput v2, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏兰世:I

    .line 10
    .line 11
    aget-byte p0, v0, v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    return p0

    .line 14
    :catch_0
    move-exception p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return p0
.end method
