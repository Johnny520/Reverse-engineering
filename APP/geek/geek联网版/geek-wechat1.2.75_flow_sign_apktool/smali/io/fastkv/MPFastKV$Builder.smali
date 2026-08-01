.class public Lio/fastkv/MPFastKV$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fastkv/MPFastKV;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# static fields
.field private static final INSTANCE_MAP:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/fastkv/MPFastKV;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private cipher:Lio/fastkv/interfaces/FastCipher;

.field private encoders:[Lio/fastkv/interfaces/FastEncoder;

.field private final name:Ljava/lang/String;

.field private needWatchFileChange:Z

.field private final path:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/fastkv/MPFastKV$Builder;->INSTANCE_MAP:Ljava/util/Map;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lio/fastkv/MPFastKV$Builder;->needWatchFileChange:Z

    .line 6
    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const-string v0, "/"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :goto_0
    iput-object p1, p0, Lio/fastkv/MPFastKV$Builder;->path:Ljava/lang/String;

    .line 37
    .line 38
    iput-object p2, p0, Lio/fastkv/MPFastKV$Builder;->name:Ljava/lang/String;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    const-string p2, "name is empty"

    .line 44
    .line 45
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 50
    .line 51
    const-string p2, "path is empty"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1
.end method


# virtual methods
.method public build()Lio/fastkv/MPFastKV;
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lio/fastkv/MPFastKV$Builder;->path:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lio/fastkv/MPFastKV$Builder;->name:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, Lio/fastkv/MPFastKV$Builder;->INSTANCE_MAP:Ljava/util/Map;

    .line 21
    .line 22
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lio/fastkv/MPFastKV;

    .line 27
    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    const-class v3, Lio/fastkv/MPFastKV$Builder;

    .line 31
    .line 32
    monitor-enter v3

    .line 33
    :try_start_0
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Lio/fastkv/MPFastKV;

    .line 38
    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    new-instance v4, Lio/fastkv/MPFastKV;

    .line 42
    .line 43
    iget-object v5, p0, Lio/fastkv/MPFastKV$Builder;->path:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v6, p0, Lio/fastkv/MPFastKV$Builder;->name:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v7, p0, Lio/fastkv/MPFastKV$Builder;->encoders:[Lio/fastkv/interfaces/FastEncoder;

    .line 48
    .line 49
    iget-object v8, p0, Lio/fastkv/MPFastKV$Builder;->cipher:Lio/fastkv/interfaces/FastCipher;

    .line 50
    .line 51
    iget-boolean v9, p0, Lio/fastkv/MPFastKV$Builder;->needWatchFileChange:Z

    .line 52
    .line 53
    invoke-direct/range {v4 .. v9}, Lio/fastkv/MPFastKV;-><init>(Ljava/lang/String;Ljava/lang/String;[Lio/fastkv/interfaces/FastEncoder;Lio/fastkv/interfaces/FastCipher;Z)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-object v2, v4

    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    goto :goto_1

    .line 63
    :cond_0
    :goto_0
    monitor-exit v3

    .line 64
    return-object v2

    .line 65
    :goto_1
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    throw v0

    .line 67
    :cond_1
    return-object v2
.end method

.method public cipher(Lio/fastkv/interfaces/FastCipher;)Lio/fastkv/MPFastKV$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lio/fastkv/MPFastKV$Builder;->cipher:Lio/fastkv/interfaces/FastCipher;

    .line 2
    .line 3
    return-object p0
.end method

.method public disableWatchFileChange()Lio/fastkv/MPFastKV$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lio/fastkv/MPFastKV$Builder;->needWatchFileChange:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public encoder([Lio/fastkv/interfaces/FastEncoder;)Lio/fastkv/MPFastKV$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lio/fastkv/MPFastKV$Builder;->encoders:[Lio/fastkv/interfaces/FastEncoder;

    .line 2
    .line 3
    return-object p0
.end method
