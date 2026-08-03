.class public final Lio/sentry/android/replay/capture/d;
.super LBn;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lio/sentry/android/replay/capture/e;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/e;I)V
    .locals 0

    iput p4, p0, Lio/sentry/android/replay/capture/d;->b:I

    iput-object p1, p0, Lio/sentry/android/replay/capture/d;->c:Ljava/lang/Object;

    iput-object p2, p0, Lio/sentry/android/replay/capture/d;->e:Ljava/lang/Object;

    iput-object p3, p0, Lio/sentry/android/replay/capture/d;->d:Lio/sentry/android/replay/capture/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LBn;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lio/sentry/android/replay/capture/d;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/android/replay/capture/d;->e:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/w;

    iget-object v1, p0, Lio/sentry/android/replay/capture/d;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/android/replay/w;

    iget-object v1, p0, Lio/sentry/android/replay/capture/d;->d:Lio/sentry/android/replay/capture/e;

    iget-object v2, v1, Lio/sentry/android/replay/capture/e;->h:Lio/sentry/android/replay/j;

    if-eqz v2, :cond_0

    iget v3, v0, Lio/sentry/android/replay/w;->b:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "config.height"

    invoke-virtual {v2, v4, v3}, Lio/sentry/android/replay/j;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v2, v1, Lio/sentry/android/replay/capture/e;->h:Lio/sentry/android/replay/j;

    if-eqz v2, :cond_1

    iget v3, v0, Lio/sentry/android/replay/w;->a:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "config.width"

    invoke-virtual {v2, v4, v3}, Lio/sentry/android/replay/j;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v2, v1, Lio/sentry/android/replay/capture/e;->h:Lio/sentry/android/replay/j;

    if-eqz v2, :cond_2

    iget v3, v0, Lio/sentry/android/replay/w;->e:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "config.frame-rate"

    invoke-virtual {v2, v4, v3}, Lio/sentry/android/replay/j;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    iget-object v1, v1, Lio/sentry/android/replay/capture/e;->h:Lio/sentry/android/replay/j;

    if-eqz v1, :cond_3

    iget v0, v0, Lio/sentry/android/replay/w;->f:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "config.bit-rate"

    invoke-virtual {v1, v2, v0}, Lio/sentry/android/replay/j;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    sget-object v0, LTC;->a:LTC;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/replay/capture/d;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    iget-object v1, p0, Lio/sentry/android/replay/capture/d;->d:Lio/sentry/android/replay/capture/e;

    iget-object v1, v1, Lio/sentry/android/replay/capture/e;->h:Lio/sentry/android/replay/j;

    if-eqz v1, :cond_4

    const-string v2, "segment.id"

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lio/sentry/android/replay/j;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    sget-object v0, LTC;->a:LTC;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
