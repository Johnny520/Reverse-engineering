.class public final La/bh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/bh;

.field public static volatile b:J

.field public static volatile c:Ljava/lang/String;

.field public static volatile d:Z

.field public static volatile e:I

.field public static volatile f:J

.field public static final g:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, La/bh;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/bh;->a:La/bh;

    const/4 v0, -0x1

    sput v0, La/bh;->e:I

    const/4 v0, 0x5

    const/4 v1, 0x3

    const/4 v2, 0x2

    filled-new-array {v2, v0, v1}, [I

    move-result-object v0

    sput-object v0, La/bh;->g:[I

    return-void
.end method

.method public static final a()Ljava/lang/String;
    .locals 1

    invoke-static {}, La/bh;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, La/bh;->c:Ljava/lang/String;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static final b()Z
    .locals 4

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    sget-wide v2, La/bh;->b:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x0

    sput-object v0, La/bh;->c:Ljava/lang/String;

    sget-object v0, La/bh;->a:La/bh;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/bh;->d()V

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static c(Ljava/lang/String;)V
    .locals 1

    const-string v0, "[VoipInterceptionState] "

    invoke-static {v0, p0}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->b([Ljava/lang/Object;)V

    return-void
.end method

.method public static d()V
    .locals 9

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    sget-boolean v2, La/bh;->d:Z

    if-eqz v2, :cond_6

    sget-wide v2, La/bh;->f:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_6

    sget-boolean v0, La/bh;->d:Z

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    sget-object v0, La/w1;->p:Landroid/content/Context;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    sput-boolean v1, La/bh;->d:Z

    return-void

    :cond_1
    const-string v2, "audio"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Landroid/media/AudioManager;

    if-eqz v2, :cond_2

    check-cast v0, Landroid/media/AudioManager;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_3

    sput-boolean v1, La/bh;->d:Z

    return-void

    :cond_3
    sget-object v2, La/bh;->g:[I

    array-length v3, v2

    move v4, v1

    :goto_1
    if-ge v4, v3, :cond_4

    aget v5, v2, v4

    :try_start_0
    invoke-virtual {v0, v5, v1}, Landroid/media/AudioManager;->setStreamMute(IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v6

    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "unmute stream "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " failed: "

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, La/bh;->c(Ljava/lang/String;)V

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    :try_start_1
    sget v2, La/bh;->e:I

    if-ltz v2, :cond_5

    sget v2, La/bh;->e:I

    invoke-virtual {v0, v1, v2, v1}, Landroid/media/AudioManager;->setStreamVolume(III)V

    sget v0, La/bh;->e:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "restored VOICE_CALL volume -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/bh;->c(Ljava/lang/String;)V

    const/4 v0, -0x1

    sput v0, La/bh;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "restore VOICE_CALL volume failed: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/bh;->c(Ljava/lang/String;)V

    :cond_5
    :goto_3
    sput-boolean v1, La/bh;->d:Z

    :cond_6
    :goto_4
    return-void
.end method

.method public static e()V
    .locals 6

    sget-object v0, La/bh;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    add-long/2addr v0, v2

    sput-wide v0, La/bh;->b:J

    sget-wide v0, La/bh;->f:J

    sget-wide v4, La/bh;->b:J

    add-long/2addr v4, v2

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    sput-wide v0, La/bh;->f:J

    :cond_0
    return-void
.end method

.method public static final f()Z
    .locals 4

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    sget-wide v2, La/bh;->b:J

    cmp-long v2, v0, v2

    if-gtz v2, :cond_0

    goto :goto_0

    :cond_0
    sget-wide v2, La/bh;->f:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_1
    sget-object v0, La/bh;->a:La/bh;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/bh;->d()V

    const/4 v0, 0x0

    return v0
.end method

.method public static g(Ljava/lang/String;)V
    .locals 8

    sput-object p0, La/bh;->c:Ljava/lang/String;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    add-long/2addr v0, v2

    sput-wide v0, La/bh;->b:J

    sget-wide v0, La/bh;->b:J

    add-long/2addr v0, v2

    sput-wide v0, La/bh;->f:J

    sget-object p0, La/bh;->a:La/bh;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-boolean p0, La/bh;->d:Z

    if-eqz p0, :cond_0

    goto/16 :goto_4

    :cond_0
    sget-object p0, La/w1;->p:Landroid/content/Context;

    if-nez p0, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v0, "audio"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Landroid/media/AudioManager;

    if-eqz v0, :cond_2

    check-cast p0, Landroid/media/AudioManager;

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_3

    goto :goto_4

    :cond_3
    sget-object v0, La/bh;->g:[I

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_1
    const/4 v4, 0x1

    if-ge v3, v1, :cond_4

    aget v5, v0, v3

    :try_start_0
    invoke-virtual {p0, v5, v4}, Landroid/media/AudioManager;->setStreamMute(IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v4

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "mute stream "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " failed: "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, La/bh;->c(Ljava/lang/String;)V

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    :try_start_1
    invoke-virtual {p0, v2}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v0

    sput v0, La/bh;->e:I

    sget v0, La/bh;->e:I

    if-eqz v0, :cond_5

    invoke-virtual {p0, v2, v2, v2}, Landroid/media/AudioManager;->setStreamVolume(III)V

    sget p0, La/bh;->e:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "muted VOICE_CALL volume ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " -> 0)"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La/bh;->c(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "mute VOICE_CALL volume failed: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La/bh;->c(Ljava/lang/String;)V

    :cond_5
    :goto_3
    sput-boolean v4, La/bh;->d:Z

    :goto_4
    return-void
.end method
