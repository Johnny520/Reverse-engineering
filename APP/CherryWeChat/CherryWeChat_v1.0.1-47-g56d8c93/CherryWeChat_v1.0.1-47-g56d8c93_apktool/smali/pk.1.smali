.class public final Lpk;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final e:Z

.field public static final f:Z

.field public static final g:Ljava/io/File;

.field public static volatile h:Lpk;


# instance fields
.field public final a:I

.field public b:I

.field public c:Z

.field public final d:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lpk;->e:Z

    sput-boolean v2, Lpk;->f:Z

    new-instance v0, Ljava/io/File;

    const-string v1, "/proc/self/fd"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sput-object v0, Lpk;->g:Ljava/io/File;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpk;->c:Z

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lpk;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/16 v0, 0x4e20

    iput v0, p0, Lpk;->a:I

    return-void
.end method

.method public static a()Lpk;
    .locals 2

    sget-object v0, Lpk;->h:Lpk;

    if-nez v0, :cond_1

    const-class v0, Lpk;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lpk;->h:Lpk;

    if-nez v1, :cond_0

    new-instance v1, Lpk;

    invoke-direct {v1}, Lpk;-><init>()V

    sput-object v1, Lpk;->h:Lpk;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_2
    sget-object v0, Lpk;->h:Lpk;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 16

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-eq v0, v1, :cond_1

    :cond_0
    move-object/from16 v0, p0

    goto :goto_0

    :cond_1
    const-string v14, "ONEPLUS A6010"

    const-string v15, "ONEPLUS A6013"

    const-string v2, "GM1900"

    const-string v3, "GM1901"

    const-string v4, "GM1903"

    const-string v5, "GM1911"

    const-string v6, "GM1915"

    const-string v7, "ONEPLUS A3000"

    const-string v8, "ONEPLUS A3010"

    const-string v9, "ONEPLUS A5010"

    const-string v10, "ONEPLUS A5000"

    const-string v11, "ONEPLUS A3003"

    const-string v12, "ONEPLUS A6000"

    const-string v13, "ONEPLUS A6003"

    filled-new-array/range {v2 .. v15}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v0, 0x1f4

    return v0

    :goto_0
    iget v1, v0, Lpk;->a:I

    return v1
.end method

.method public final c(IIZZ)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p3, :cond_0

    goto :goto_3

    :cond_0
    sget-boolean p3, Lpk;->f:Z

    if-nez p3, :cond_1

    goto :goto_3

    :cond_1
    sget-boolean p3, Lpk;->e:Z

    if-eqz p3, :cond_2

    iget-object p3, p0, Lpk;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p3

    if-nez p3, :cond_2

    goto :goto_3

    :cond_2
    if-eqz p4, :cond_3

    goto :goto_3

    :cond_3
    if-ltz p1, :cond_8

    if-gez p2, :cond_4

    goto :goto_3

    :cond_4
    monitor-enter p0

    :try_start_0
    iget p1, p0, Lpk;->b:I

    const/4 p2, 0x1

    add-int/2addr p1, p2

    iput p1, p0, Lpk;->b:I

    const/16 p3, 0x32

    if-lt p1, p3, :cond_6

    iput v0, p0, Lpk;->b:I

    sget-object p1, Lpk;->g:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object p1

    array-length p1, p1

    invoke-virtual {p0}, Lpk;->b()I

    move-result p3

    int-to-long p3, p3

    int-to-long v1, p1

    cmp-long p1, v1, p3

    if-gez p1, :cond_5

    move p1, p2

    goto :goto_0

    :cond_5
    move p1, v0

    :goto_0
    iput-boolean p1, p0, Lpk;->c:Z

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_6
    :goto_1
    iget-boolean p1, p0, Lpk;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-nez p1, :cond_7

    goto :goto_3

    :cond_7
    return p2

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_8
    :goto_3
    return v0
.end method
