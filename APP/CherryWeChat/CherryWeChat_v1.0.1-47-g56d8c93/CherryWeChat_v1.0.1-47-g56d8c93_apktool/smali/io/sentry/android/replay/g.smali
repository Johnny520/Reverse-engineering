.class public final Lio/sentry/android/replay/g;
.super LBn;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lio/sentry/android/replay/j;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/j;I)V
    .locals 0

    iput p2, p0, Lio/sentry/android/replay/g;->b:I

    iput-object p1, p0, Lio/sentry/android/replay/g;->c:Lio/sentry/android/replay/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LBn;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lio/sentry/android/replay/g;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/android/replay/g;->c:Lio/sentry/android/replay/j;

    iget-object v1, v0, Lio/sentry/android/replay/j;->a:Lio/sentry/v2;

    iget-object v0, v0, Lio/sentry/android/replay/j;->b:Lio/sentry/protocol/t;

    invoke-virtual {v1}, Lio/sentry/v2;->getCacheDirPath()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/io/File;

    invoke-virtual {v1}, Lio/sentry/v2;->getCacheDirPath()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "replay_"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "SentryOptions.cacheDirPath is not set, session replay is no-op"

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v2, 0x0

    :goto_1
    return-object v2

    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/replay/g;->c:Lio/sentry/android/replay/j;

    invoke-virtual {v0}, Lio/sentry/android/replay/j;->f()Ljava/io/File;

    move-result-object v1

    if-nez v1, :cond_2

    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    new-instance v1, Ljava/io/File;

    invoke-virtual {v0}, Lio/sentry/android/replay/j;->f()Ljava/io/File;

    move-result-object v0

    const-string v2, ".ongoing_segment"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    :cond_3
    move-object v0, v1

    :goto_2
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
