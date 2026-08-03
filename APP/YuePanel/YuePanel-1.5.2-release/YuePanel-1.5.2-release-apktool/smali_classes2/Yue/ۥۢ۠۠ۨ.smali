.class public final LYue/ۥۢ۠۠ۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥ۠ۦۡ۠;
    name = "StreamsKt"
.end annotation


# direct methods
.method public static synthetic ۥ(LYue/ۥۡۨۢ;)Ljava/util/Spliterator;
    .locals 0

    invoke-static {p0}, LYue/ۥۢ۠۠ۨ;->ۥ۟۟۟ۡ(LYue/ۥۡۨۢ;)Ljava/util/Spliterator;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟(Ljava/util/stream/DoubleStream;)LYue/ۥۡۨۢ;
    .locals 1
    .param p0    # Ljava/util/stream/DoubleStream;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/stream/DoubleStream;",
            ")",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۢ۠۠ۨ$ۥ۟۟۟;

    invoke-direct {v0, p0}, LYue/ۥۢ۠۠ۨ$ۥ۟۟۟;-><init>(Ljava/util/stream/DoubleStream;)V

    return-object v0
.end method

.method public static final ۥ۟۟(Ljava/util/stream/IntStream;)LYue/ۥۡۨۢ;
    .locals 1
    .param p0    # Ljava/util/stream/IntStream;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/stream/IntStream;",
            ")",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۢ۠۠ۨ$ۥ۟;

    invoke-direct {v0, p0}, LYue/ۥۢ۠۠ۨ$ۥ۟;-><init>(Ljava/util/stream/IntStream;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟(Ljava/util/stream/LongStream;)LYue/ۥۡۨۢ;
    .locals 1
    .param p0    # Ljava/util/stream/LongStream;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/stream/LongStream;",
            ")",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۢ۠۠ۨ$ۥ۟۟;

    invoke-direct {v0, p0}, LYue/ۥۢ۠۠ۨ$ۥ۟۟;-><init>(Ljava/util/stream/LongStream;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟۟(Ljava/util/stream/Stream;)LYue/ۥۡۨۢ;
    .locals 1
    .param p0    # Ljava/util/stream/Stream;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/stream/Stream<",
            "TT;>;)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۢ۠۠ۨ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۢ۠۠ۨ$ۥ;-><init>(Ljava/util/stream/Stream;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟۠(LYue/ۥۡۨۢ;)Ljava/util/stream/Stream;
    .locals 2
    .param p0    # LYue/ۥۡۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT;>;)",
            "Ljava/util/stream/Stream<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۢ۠۠ۧ;

    invoke-direct {v0, p0}, LYue/ۥۢ۠۠ۧ;-><init>(LYue/ۥۡۨۢ;)V

    const/16 p0, 0x10

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Ljava/util/stream/StreamSupport;->stream(Ljava/util/function/Supplier;IZ)Ljava/util/stream/Stream;

    move-result-object p0

    const-string v0, "stream({ Spliterators.sp\u2026literator.ORDERED, false)"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final ۥ۟۟۟ۡ(LYue/ۥۡۨۢ;)Ljava/util/Spliterator;
    .locals 1

    const-string v0, "$this_asStream"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LYue/ۥۡۨۢ;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/16 v0, 0x10

    invoke-static {p0, v0}, Ljava/util/Spliterators;->spliteratorUnknownSize(Ljava/util/Iterator;I)Ljava/util/Spliterator;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۢ(Ljava/util/stream/DoubleStream;)Ljava/util/List;
    .locals 1
    .param p0    # Ljava/util/stream/DoubleStream;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/stream/DoubleStream;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/stream/DoubleStream;->toArray()[D

    move-result-object p0

    const-string v0, "toArray()"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LYue/ۥ۟ۢ۟۟;->ۥ۟۟۠۟([D)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥۣ۟۟۟(Ljava/util/stream/IntStream;)Ljava/util/List;
    .locals 1
    .param p0    # Ljava/util/stream/IntStream;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/stream/IntStream;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/stream/IntStream;->toArray()[I

    move-result-object p0

    const-string v0, "toArray()"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LYue/ۥ۟ۢ۟۟;->ۥ۟۟۠ۡ([I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۤ(Ljava/util/stream/LongStream;)Ljava/util/List;
    .locals 1
    .param p0    # Ljava/util/stream/LongStream;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/stream/LongStream;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/stream/LongStream;->toArray()[J

    move-result-object p0

    const-string v0, "toArray()"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LYue/ۥ۟ۢ۟۟;->ۥ۟۟۠ۢ([J)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۥ(Ljava/util/stream/Stream;)Ljava/util/List;
    .locals 1
    .param p0    # Ljava/util/stream/Stream;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/stream/Stream<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "collect(Collectors.toList<T>())"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/util/List;

    return-object p0
.end method
