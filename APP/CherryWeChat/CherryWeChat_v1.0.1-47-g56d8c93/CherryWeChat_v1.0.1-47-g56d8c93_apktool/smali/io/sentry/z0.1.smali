.class public final Lio/sentry/z0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/z0;->a:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    .line 4
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lio/sentry/z0;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a()Lio/sentry/u0;
    .locals 2

    iget-object v0, p0, Lio/sentry/z0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/u0;

    return-object v0
.end method

.method public b()Z
    .locals 3

    iget-object v0, p0, Lio/sentry/z0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lio/sentry/z0;->a()Lio/sentry/u0;

    move-result-object v0

    invoke-virtual {p0}, Lio/sentry/z0;->e()V

    invoke-virtual {p0}, Lio/sentry/z0;->a()Lio/sentry/u0;

    move-result-object v1

    instance-of v1, v1, Lio/sentry/x0;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lio/sentry/z0;->a()Lio/sentry/u0;

    move-result-object v1

    check-cast v1, Lio/sentry/x0;

    invoke-virtual {p0}, Lio/sentry/z0;->e()V

    invoke-virtual {p0}, Lio/sentry/z0;->a()Lio/sentry/u0;

    move-result-object v2

    check-cast v2, Lio/sentry/w0;

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    if-eqz v2, :cond_2

    iget-object v2, v2, Lio/sentry/w0;->a:Ljava/util/HashMap;

    iget-object v1, v1, Lio/sentry/x0;->a:Ljava/lang/String;

    invoke-interface {v0}, Lio/sentry/u0;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lio/sentry/z0;->a()Lio/sentry/u0;

    move-result-object v1

    instance-of v1, v1, Lio/sentry/v0;

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lio/sentry/z0;->a()Lio/sentry/u0;

    move-result-object v1

    check-cast v1, Lio/sentry/v0;

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    iget-object v1, v1, Lio/sentry/v0;->a:Ljava/util/ArrayList;

    invoke-interface {v0}, Lio/sentry/u0;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public c(Lio/sentry/t0;)Z
    .locals 2

    invoke-interface {p1}, Lio/sentry/t0;->d()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0}, Lio/sentry/z0;->a()Lio/sentry/u0;

    move-result-object v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    new-instance v0, Lio/sentry/y0;

    invoke-direct {v0, p1}, Lio/sentry/y0;-><init>(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/sentry/z0;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p0}, Lio/sentry/z0;->a()Lio/sentry/u0;

    move-result-object v0

    instance-of v0, v0, Lio/sentry/x0;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/sentry/z0;->a()Lio/sentry/u0;

    move-result-object v0

    check-cast v0, Lio/sentry/x0;

    invoke-virtual {p0}, Lio/sentry/z0;->e()V

    invoke-virtual {p0}, Lio/sentry/z0;->a()Lio/sentry/u0;

    move-result-object v1

    check-cast v1, Lio/sentry/w0;

    iget-object v1, v1, Lio/sentry/w0;->a:Ljava/util/HashMap;

    iget-object v0, v0, Lio/sentry/x0;->a:Ljava/lang/String;

    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lio/sentry/z0;->a()Lio/sentry/u0;

    move-result-object v0

    instance-of v0, v0, Lio/sentry/v0;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lio/sentry/z0;->a()Lio/sentry/u0;

    move-result-object v0

    check-cast v0, Lio/sentry/v0;

    iget-object v0, v0, Lio/sentry/v0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public d(Lio/sentry/A0;)V
    .locals 3

    sget-object v0, Lio/sentry/s0;->a:[I

    iget-object v1, p1, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v1, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v1}, Lio/sentry/vendor/gson/stream/a;->C()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    iget-object v2, p0, Lio/sentry/z0;->a:Ljava/util/ArrayList;

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 v0, 0x1

    goto :goto_1

    :pswitch_1
    invoke-virtual {v1}, Lio/sentry/vendor/gson/stream/a;->y()V

    new-instance v0, Lr1;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lr1;-><init>(I)V

    invoke-virtual {p0, v0}, Lio/sentry/z0;->c(Lio/sentry/t0;)Z

    move-result v0

    goto :goto_1

    :pswitch_2
    new-instance v0, Lio/sentry/r0;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lio/sentry/r0;-><init>(Lio/sentry/A0;I)V

    invoke-virtual {p0, v0}, Lio/sentry/z0;->c(Lio/sentry/t0;)Z

    move-result v0

    goto :goto_1

    :pswitch_3
    new-instance v0, LQ9;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0, p1}, LQ9;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lio/sentry/z0;->c(Lio/sentry/t0;)Z

    move-result v0

    goto :goto_1

    :pswitch_4
    new-instance v0, Lio/sentry/r0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lio/sentry/r0;-><init>(Lio/sentry/A0;I)V

    invoke-virtual {p0, v0}, Lio/sentry/z0;->c(Lio/sentry/t0;)Z

    move-result v0

    goto :goto_1

    :pswitch_5
    new-instance v0, Lio/sentry/x0;

    invoke-virtual {v1}, Lio/sentry/vendor/gson/stream/a;->w()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/sentry/x0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_6
    invoke-virtual {p1}, Lio/sentry/A0;->i()V

    invoke-virtual {p0}, Lio/sentry/z0;->b()Z

    move-result v0

    goto :goto_1

    :pswitch_7
    invoke-virtual {p1}, Lio/sentry/A0;->f()V

    new-instance v0, Lio/sentry/w0;

    invoke-direct {v0}, Lio/sentry/w0;-><init>()V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_8
    invoke-virtual {v1}, Lio/sentry/vendor/gson/stream/a;->m()V

    invoke-virtual {p0}, Lio/sentry/z0;->b()Z

    move-result v0

    goto :goto_1

    :pswitch_9
    invoke-virtual {v1}, Lio/sentry/vendor/gson/stream/a;->d()V

    new-instance v0, Lio/sentry/v0;

    invoke-direct {v0}, Lio/sentry/v0;-><init>()V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lio/sentry/z0;->d(Lio/sentry/A0;)V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lio/sentry/z0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void
.end method
