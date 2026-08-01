.class public final Lio/fastkv/FastKV$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fastkv/FastKV;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# static fields
.field static final INSTANCE_MAP:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/fastkv/FastKV;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private cipher:Lio/fastkv/interfaces/FastCipher;

.field private encoders:[Lio/fastkv/interfaces/FastEncoder;

.field private final name:Ljava/lang/String;

.field private final path:Ljava/lang/String;

.field private writingMode:I


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
    sput-object v0, Lio/fastkv/FastKV$Builder;->INSTANCE_MAP:Ljava/util/Map;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lio/fastkv/FastKV$Builder;->writingMode:I

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/fastkv/"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/fastkv/FastKV$Builder;->path:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lio/fastkv/FastKV$Builder;->name:Ljava/lang/String;

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "name is empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "context is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lio/fastkv/FastKV$Builder;->writingMode:I

    if-eqz p1, :cond_2

    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz p2, :cond_1

    .line 11
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 12
    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lio/fastkv/FastKV$Builder;->path:Ljava/lang/String;

    .line 13
    iput-object p2, p0, Lio/fastkv/FastKV$Builder;->name:Ljava/lang/String;

    return-void

    .line 14
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "name is empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 15
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "path is empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public asyncBlocking()Lio/fastkv/FastKV$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lio/fastkv/FastKV$Builder;->writingMode:I

    .line 3
    .line 4
    return-object p0
.end method

.method public blocking()Lio/fastkv/FastKV$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lio/fastkv/FastKV$Builder;->writingMode:I

    .line 3
    .line 4
    return-object p0
.end method

.method public build()Lio/fastkv/FastKV;
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lio/fastkv/FastKV$Builder;->path:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lio/fastkv/FastKV$Builder;->name:Ljava/lang/String;

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
    sget-object v1, Lio/fastkv/FastKV$Builder;->INSTANCE_MAP:Ljava/util/Map;

    .line 21
    .line 22
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lio/fastkv/FastKV;

    .line 27
    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    const-class v3, Lio/fastkv/FastKV$Builder;

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
    check-cast v2, Lio/fastkv/FastKV;

    .line 38
    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    new-instance v4, Lio/fastkv/FastKV;

    .line 42
    .line 43
    iget-object v5, p0, Lio/fastkv/FastKV$Builder;->path:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v6, p0, Lio/fastkv/FastKV$Builder;->name:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v7, p0, Lio/fastkv/FastKV$Builder;->encoders:[Lio/fastkv/interfaces/FastEncoder;

    .line 48
    .line 49
    iget-object v8, p0, Lio/fastkv/FastKV$Builder;->cipher:Lio/fastkv/interfaces/FastCipher;

    .line 50
    .line 51
    iget v9, p0, Lio/fastkv/FastKV$Builder;->writingMode:I

    .line 52
    .line 53
    invoke-direct/range {v4 .. v9}, Lio/fastkv/FastKV;-><init>(Ljava/lang/String;Ljava/lang/String;[Lio/fastkv/interfaces/FastEncoder;Lio/fastkv/interfaces/FastCipher;I)V

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

.method public cipher(Lio/fastkv/interfaces/FastCipher;)Lio/fastkv/FastKV$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lio/fastkv/FastKV$Builder;->cipher:Lio/fastkv/interfaces/FastCipher;

    .line 2
    .line 3
    return-object p0
.end method

.method public encoder([Lio/fastkv/interfaces/FastEncoder;)Lio/fastkv/FastKV$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lio/fastkv/FastKV$Builder;->encoders:[Lio/fastkv/interfaces/FastEncoder;

    .line 2
    .line 3
    return-object p0
.end method
