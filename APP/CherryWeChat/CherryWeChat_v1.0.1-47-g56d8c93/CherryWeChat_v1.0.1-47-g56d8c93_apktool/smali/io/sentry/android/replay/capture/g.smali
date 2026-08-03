.class public final Lio/sentry/android/replay/capture/g;
.super LBn;
.source ""

# interfaces
.implements Lfj;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lio/sentry/android/replay/capture/h;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/capture/h;I)V
    .locals 0

    iput p2, p0, Lio/sentry/android/replay/capture/g;->b:I

    iput-object p1, p0, Lio/sentry/android/replay/capture/g;->c:Lio/sentry/android/replay/capture/h;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LBn;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/sentry/android/replay/capture/g;->b:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lio/sentry/android/replay/capture/m;

    instance-of v0, p1, Lio/sentry/android/replay/capture/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/sentry/android/replay/capture/g;->c:Lio/sentry/android/replay/capture/h;

    iget-object v1, v0, Lio/sentry/android/replay/capture/h;->v:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lio/sentry/android/replay/capture/e;->j()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Lio/sentry/android/replay/capture/e;->l(I)V

    :cond_0
    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_0
    check-cast p1, Lio/sentry/android/replay/capture/m;

    instance-of v0, p1, Lio/sentry/android/replay/capture/k;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/android/replay/capture/g;->c:Lio/sentry/android/replay/capture/h;

    iget-object v1, v0, Lio/sentry/android/replay/capture/h;->v:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lio/sentry/android/replay/capture/e;->j()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Lio/sentry/android/replay/capture/e;->l(I)V

    :cond_1
    sget-object p1, LTC;->a:LTC;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
