.class public final Lio/sentry/android/replay/p;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public volatile a:Lio/sentry/android/replay/q;


# virtual methods
.method public final a(Lio/sentry/android/replay/q;)Z
    .locals 3

    iget-object v0, p0, Lio/sentry/android/replay/p;->a:Lio/sentry/android/replay/q;

    sget-object v1, Lio/sentry/android/replay/o;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance p1, LFa;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :pswitch_0
    return v2

    :pswitch_1
    sget-object v0, Lio/sentry/android/replay/q;->STARTED:Lio/sentry/android/replay/q;

    if-eq p1, v0, :cond_1

    sget-object v0, Lio/sentry/android/replay/q;->CLOSED:Lio/sentry/android/replay/q;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    :goto_0
    return v1

    :pswitch_2
    sget-object v0, Lio/sentry/android/replay/q;->RESUMED:Lio/sentry/android/replay/q;

    if-eq p1, v0, :cond_3

    sget-object v0, Lio/sentry/android/replay/q;->STOPPED:Lio/sentry/android/replay/q;

    if-eq p1, v0, :cond_3

    sget-object v0, Lio/sentry/android/replay/q;->CLOSED:Lio/sentry/android/replay/q;

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    return v2

    :cond_3
    :goto_1
    return v1

    :pswitch_3
    sget-object v0, Lio/sentry/android/replay/q;->PAUSED:Lio/sentry/android/replay/q;

    if-eq p1, v0, :cond_5

    sget-object v0, Lio/sentry/android/replay/q;->STOPPED:Lio/sentry/android/replay/q;

    if-eq p1, v0, :cond_5

    sget-object v0, Lio/sentry/android/replay/q;->CLOSED:Lio/sentry/android/replay/q;

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    return v2

    :cond_5
    :goto_2
    return v1

    :pswitch_4
    sget-object v0, Lio/sentry/android/replay/q;->PAUSED:Lio/sentry/android/replay/q;

    if-eq p1, v0, :cond_7

    sget-object v0, Lio/sentry/android/replay/q;->STOPPED:Lio/sentry/android/replay/q;

    if-eq p1, v0, :cond_7

    sget-object v0, Lio/sentry/android/replay/q;->CLOSED:Lio/sentry/android/replay/q;

    if-ne p1, v0, :cond_6

    goto :goto_3

    :cond_6
    return v2

    :cond_7
    :goto_3
    return v1

    :pswitch_5
    sget-object v0, Lio/sentry/android/replay/q;->STARTED:Lio/sentry/android/replay/q;

    if-eq p1, v0, :cond_9

    sget-object v0, Lio/sentry/android/replay/q;->CLOSED:Lio/sentry/android/replay/q;

    if-ne p1, v0, :cond_8

    goto :goto_4

    :cond_8
    return v2

    :cond_9
    :goto_4
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
