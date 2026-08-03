.class public LYue/ۥ۟ۢۦۣ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/slf4j/IMarkerFactory;


# instance fields
.field public final ۥ:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/String;",
            "LYue/\u06e5\u06e0\u06e8\u06e8\u06e2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۢۦۣ;->ۥ:Ljava/util/concurrent/ConcurrentMap;

    return-void
.end method


# virtual methods
.method public ۥ(Ljava/lang/String;)LYue/ۥ۠ۨۨۢ;
    .locals 2

    if-eqz p1, :cond_1

    iget-object v0, p0, LYue/ۥ۟ۢۦۣ;->ۥ:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۨۨۢ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۟ۢۦۢ;

    invoke-direct {v0, p1}, LYue/ۥ۟ۢۦۢ;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LYue/ۥ۟ۢۦۣ;->ۥ:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, p1, v0}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥ۠ۨۨۢ;

    if-eqz p1, :cond_0

    move-object v0, p1

    :cond_0
    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Marker name cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟(Ljava/lang/String;)LYue/ۥ۠ۨۨۢ;
    .locals 1

    new-instance v0, LYue/ۥ۟ۢۦۢ;

    invoke-direct {v0, p1}, LYue/ۥ۟ۢۦۢ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public ۥ۟۟(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, LYue/ۥ۟ۢۦۣ;->ۥ:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public ۥ۟۟۟(Ljava/lang/String;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۢۦۣ;->ۥ:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
