.class public final synthetic Lio/sentry/android/replay/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/s1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LIv;


# direct methods
.method public synthetic constructor <init>(LIv;I)V
    .locals 0

    iput p2, p0, Lio/sentry/android/replay/l;->a:I

    iput-object p1, p0, Lio/sentry/android/replay/l;->b:LIv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lio/sentry/X;)V
    .locals 2

    iget v0, p0, Lio/sentry/android/replay/l;->a:I

    iget-object v1, p0, Lio/sentry/android/replay/l;->b:LIv;

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Lio/sentry/X;->z()Ljava/util/Queue;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, v1, LIv;->a:Ljava/lang/Object;

    return-void

    :pswitch_0
    sget v0, Lio/sentry/android/replay/ReplayIntegration;->q:I

    invoke-interface {p1}, Lio/sentry/X;->s()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const/16 v0, 0x2e

    invoke-static {p1, v0}, Ltz;->c0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, v1, LIv;->a:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
