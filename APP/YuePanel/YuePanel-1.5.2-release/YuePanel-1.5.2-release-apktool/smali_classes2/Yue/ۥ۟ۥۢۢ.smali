.class public LYue/ۥ۟ۥۢۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(LYue/ۥ۠ۡ۠ۤ;LYue/ۥ۠۠ۥۥ;)LYue/ۥ۠۠ۥۧ;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۡ۠ۤ;->ۥ۟۟۟۠()V

    invoke-virtual {p1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۦۦ()Ljava/util/stream/Stream;

    move-result-object v0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۡ۠ۤ;->ۥ۟(LYue/ۥ۠۠ۥۥ;)Ljava/util/function/Predicate;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    move-result-object p0

    new-instance p1, LYue/ۥ۟ۥۢۡ;

    invoke-direct {p1}, LYue/ۥ۟ۥۢۡ;-><init>()V

    invoke-static {p1}, Ljava/util/stream/Collectors;->toCollection(Ljava/util/function/Supplier;)Ljava/util/stream/Collector;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LYue/ۥ۠۠ۥۧ;

    return-object p0
.end method

.method public static ۥ۟(LYue/ۥ۠ۡ۠ۤ;LYue/ۥ۠۠ۥۥ;)LYue/ۥ۠۠ۥۥ;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۡ۠ۤ;->ۥ۟۟۟۠()V

    invoke-virtual {p1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۦۦ()Ljava/util/stream/Stream;

    move-result-object v0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۡ۠ۤ;->ۥ۟(LYue/ۥ۠۠ۥۥ;)Ljava/util/function/Predicate;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/stream/Stream;->findFirst()Ljava/util/Optional;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LYue/ۥ۠۠ۥۥ;

    return-object p0
.end method
