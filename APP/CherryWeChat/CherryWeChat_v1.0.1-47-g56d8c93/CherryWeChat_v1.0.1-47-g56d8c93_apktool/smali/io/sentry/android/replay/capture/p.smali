.class public final Lio/sentry/android/replay/capture/p;
.super LBn;
.source ""

# interfaces
.implements Lfj;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lio/sentry/android/replay/capture/q;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/capture/q;I)V
    .locals 0

    iput p2, p0, Lio/sentry/android/replay/capture/p;->b:I

    iput-object p1, p0, Lio/sentry/android/replay/capture/p;->c:Lio/sentry/android/replay/capture/q;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LBn;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/sentry/android/replay/capture/p;->b:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lio/sentry/android/replay/capture/m;

    instance-of v0, p1, Lio/sentry/android/replay/capture/k;

    if-eqz v0, :cond_0

    check-cast p1, Lio/sentry/android/replay/capture/k;

    iget-object v0, p0, Lio/sentry/android/replay/capture/p;->c:Lio/sentry/android/replay/capture/q;

    iget-object v1, v0, Lio/sentry/android/replay/capture/q;->s:Lio/sentry/Z;

    invoke-static {p1, v1}, Lio/sentry/android/replay/capture/k;->a(Lio/sentry/android/replay/capture/k;Lio/sentry/Z;)V

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

    check-cast p1, Lio/sentry/android/replay/capture/k;

    iget-object v0, p0, Lio/sentry/android/replay/capture/p;->c:Lio/sentry/android/replay/capture/q;

    iget-object v1, v0, Lio/sentry/android/replay/capture/q;->s:Lio/sentry/Z;

    invoke-static {p1, v1}, Lio/sentry/android/replay/capture/k;->a(Lio/sentry/android/replay/capture/k;Lio/sentry/Z;)V

    invoke-virtual {v0}, Lio/sentry/android/replay/capture/e;->j()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lio/sentry/android/replay/capture/e;->l(I)V

    iget-object p1, p1, Lio/sentry/android/replay/capture/k;->a:Lio/sentry/x2;

    iget-object p1, p1, Lio/sentry/x2;->u:Ljava/util/Date;

    invoke-virtual {v0, p1}, Lio/sentry/android/replay/capture/e;->m(Ljava/util/Date;)V

    :cond_1
    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
