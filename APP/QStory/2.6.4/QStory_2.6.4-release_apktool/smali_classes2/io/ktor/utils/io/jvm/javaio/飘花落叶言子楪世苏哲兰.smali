.class public final Lio/ktor/utils/io/jvm/javaio/飘花落叶言子楪世苏哲兰;
.super Ljava/io/InputStream;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/ktor/utils/io/jvm/javaio/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/utils/io/jvm/javaio/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    invoke-static {p0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final read()I
    .locals 2

    .line 62
    iget-object p0, p0, Lio/ktor/utils/io/jvm/javaio/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 63
    :cond_0
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子世苏兰楪哲()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 64
    new-instance v0, Lio/ktor/utils/io/jvm/javaio/BlockingKt$toInputStream$1$blockingWait$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/ktor/utils/io/jvm/javaio/BlockingKt$toInputStream$1$blockingWait$1;-><init>(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    invoke-static {v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世苏哲楪兰(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)Ljava/lang/Object;

    .line 65
    :cond_1
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    const/4 p0, -0x1

    return p0

    .line 66
    :cond_2
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    move-result-object p0

    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->readByte()B

    move-result p0

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public final read([BII)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lio/ktor/utils/io/jvm/javaio/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 5
    .line 6
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子世苏兰楪哲()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance v0, Lio/ktor/utils/io/jvm/javaio/BlockingKt$toInputStream$1$blockingWait$1;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, p0, v1}, Lio/ktor/utils/io/jvm/javaio/BlockingKt$toInputStream$1$blockingWait$1;-><init>(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世苏哲楪兰(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-static {p0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    add-int/2addr p3, p2

    .line 45
    invoke-interface {v0, p2, p1, p3}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子哲世兰苏楪(I[BI)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-ltz p1, :cond_2

    .line 50
    .line 51
    return p1

    .line 52
    :cond_2
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-eqz p0, :cond_3

    .line 57
    .line 58
    :goto_0
    const/4 p0, -0x1

    .line 59
    return p0

    .line 60
    :cond_3
    const/4 p0, 0x0

    .line 61
    return p0
.end method
