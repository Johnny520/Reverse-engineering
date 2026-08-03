.class public final Lio/sentry/android/replay/capture/b;
.super LBn;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lio/sentry/android/replay/capture/e;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/e;I)V
    .locals 0

    iput p4, p0, Lio/sentry/android/replay/capture/b;->b:I

    iput-object p1, p0, Lio/sentry/android/replay/capture/b;->c:Ljava/lang/Object;

    iput-object p2, p0, Lio/sentry/android/replay/capture/b;->d:Ljava/lang/Object;

    iput-object p3, p0, Lio/sentry/android/replay/capture/b;->e:Lio/sentry/android/replay/capture/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LBn;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lio/sentry/android/replay/capture/b;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/android/replay/capture/b;->e:Lio/sentry/android/replay/capture/e;

    iget-object v0, v0, Lio/sentry/android/replay/capture/e;->h:Lio/sentry/android/replay/j;

    if-eqz v0, :cond_0

    const-string v1, "replay.screen-at-start"

    iget-object v2, p0, Lio/sentry/android/replay/capture/b;->d:Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lio/sentry/android/replay/j;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    sget-object v0, LTC;->a:LTC;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/replay/capture/b;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    iget-object v1, p0, Lio/sentry/android/replay/capture/b;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Date;

    iget-object v1, p0, Lio/sentry/android/replay/capture/b;->e:Lio/sentry/android/replay/capture/e;

    iget-object v1, v1, Lio/sentry/android/replay/capture/e;->h:Lio/sentry/android/replay/j;

    if-eqz v1, :cond_2

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lio/sentry/config/a;->t(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    const-string v2, "segment.timestamp"

    invoke-virtual {v1, v2, v0}, Lio/sentry/android/replay/j;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    sget-object v0, LTC;->a:LTC;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lio/sentry/android/replay/capture/b;->e:Lio/sentry/android/replay/capture/e;

    iget-object v0, v0, Lio/sentry/android/replay/capture/e;->h:Lio/sentry/android/replay/j;

    if-eqz v0, :cond_3

    const-string v1, "replay.type"

    iget-object v2, p0, Lio/sentry/android/replay/capture/b;->d:Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lio/sentry/android/replay/j;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    sget-object v0, LTC;->a:LTC;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lio/sentry/android/replay/capture/b;->e:Lio/sentry/android/replay/capture/e;

    iget-object v0, v0, Lio/sentry/android/replay/capture/e;->h:Lio/sentry/android/replay/j;

    if-eqz v0, :cond_4

    const-string v1, "replay.id"

    iget-object v2, p0, Lio/sentry/android/replay/capture/b;->d:Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lio/sentry/android/replay/j;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    sget-object v0, LTC;->a:LTC;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
