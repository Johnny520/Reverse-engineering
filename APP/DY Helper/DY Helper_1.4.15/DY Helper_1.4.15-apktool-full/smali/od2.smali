.class public abstract Lod2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lod2;->α:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    return-void
.end method

.method public static α(Lz81;Ln5;Ljava/util/concurrent/atomic/AtomicBoolean;)Z
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-virtual {p2, p0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return p0

    .line 13
    :cond_0
    :try_start_0
    sget-object v0, Lod2;->α:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 14
    .line 15
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const-string v0, "XHSHelper: \u5f53\u524d\u6ca1\u6709\u6ce8\u518c SAMPLE \u529f\u80fd Hook"

    .line 26
    .line 27
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return p1

    .line 31
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    return p1

    .line 42
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-nez p1, :cond_3

    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    throw p1

    .line 50
    :cond_3
    new-instance p1, Ljava/lang/ClassCastException;

    .line 51
    .line 52
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 53
    .line 54
    .line 55
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    invoke-virtual {p2, p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 58
    .line 59
    .line 60
    throw p1
.end method
