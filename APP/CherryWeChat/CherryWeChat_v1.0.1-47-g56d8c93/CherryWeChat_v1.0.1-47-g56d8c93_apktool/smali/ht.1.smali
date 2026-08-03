.class public final Lht;
.super LBn;
.source ""

# interfaces
.implements Lfj;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Lht;->b:I

    iput-object p2, p0, Lht;->c:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LBn;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lht;->b:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/util/Date;

    iget-object v0, p0, Lht;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/ReplayIntegration;

    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->l:Lio/sentry/android/replay/capture/n;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    check-cast v2, Lio/sentry/android/replay/capture/e;

    invoke-virtual {v2}, Lio/sentry/android/replay/capture/e;->j()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    check-cast v1, Lio/sentry/android/replay/capture/e;

    invoke-virtual {v1, v2}, Lio/sentry/android/replay/capture/e;->l(I)V

    :goto_0
    iget-object v0, v0, Lio/sentry/android/replay/ReplayIntegration;->l:Lio/sentry/android/replay/capture/n;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast v0, Lio/sentry/android/replay/capture/e;

    invoke-virtual {v0, p1}, Lio/sentry/android/replay/capture/e;->m(Ljava/util/Date;)V

    :goto_1
    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_0
    check-cast p1, Lg5;

    iget-object p1, p0, Lht;->c:Ljava/lang/Object;

    check-cast p1, Lot;

    iget-object v0, p1, Lot;->c:Lri;

    if-nez v0, :cond_4

    iget-object p1, p1, Lot;->b:LD4;

    invoke-virtual {p1}, LD4;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lri;

    iget-boolean v1, v1, Lri;->a:Z

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    check-cast v0, Lri;

    :cond_4
    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_1
    check-cast p1, Lg5;

    iget-object p1, p0, Lht;->c:Ljava/lang/Object;

    check-cast p1, Lot;

    iget-object v0, p1, Lot;->b:LD4;

    invoke-virtual {v0}, LD4;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lri;

    iget-boolean v2, v2, Lri;->a:Z

    if-eqz v2, :cond_5

    goto :goto_3

    :cond_6
    const/4 v1, 0x0

    :goto_3
    check-cast v1, Lri;

    iget-object v0, p1, Lot;->c:Lri;

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lot;->a()V

    :cond_7
    iput-object v1, p1, Lot;->c:Lri;

    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
