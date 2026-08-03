.class public final Lio/sentry/android/core/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/f0;
.implements Lio/sentry/android/core/Q;
.implements Lio/sentry/ILogger;


# static fields
.field public static final b:Lio/sentry/android/core/q;

.field public static final c:Lio/sentry/android/core/q;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/sentry/android/core/q;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/sentry/android/core/q;-><init>(I)V

    sput-object v0, Lio/sentry/android/core/q;->b:Lio/sentry/android/core/q;

    new-instance v0, Lio/sentry/android/core/q;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lio/sentry/android/core/q;-><init>(I)V

    sput-object v0, Lio/sentry/android/core/q;->c:Lio/sentry/android/core/q;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/sentry/android/core/q;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    return-void
.end method

.method public b()V
    .locals 1

    const v0, 0xf001

    invoke-static {v0}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    return-void
.end method

.method public varargs e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 8

    iget v0, p0, Lio/sentry/android/core/q;->a:I

    packed-switch v0, :pswitch_data_0

    array-length v0, p3

    const/4 v1, 0x5

    const/4 v2, 0x7

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x4

    const-string v7, "Sentry"

    if-nez v0, :cond_3

    sget-object p3, Lio/sentry/android/core/j;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p3, p1

    if-eq p1, v5, :cond_1

    if-eq p1, v4, :cond_2

    if-eq p1, v6, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    move v1, v6

    :cond_2
    :goto_0
    invoke-static {v1, v7, p2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_3
    sget-object v0, Lio/sentry/android/core/j;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    if-eq p1, v5, :cond_5

    if-eq p1, v4, :cond_6

    if-eq p1, v6, :cond_4

    move v1, v3

    goto :goto_1

    :cond_4
    move v1, v2

    goto :goto_1

    :cond_5
    move v1, v6

    :cond_6
    :goto_1
    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, v7, p1}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    :goto_2
    return-void

    :pswitch_0
    array-length p1, p3

    const-string v0, "Sentry"

    const/4 v1, 0x7

    if-nez p1, :cond_7

    invoke-static {v1, v0, p2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_7
    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, v0, p1}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public i(Lio/sentry/a2;)Z
    .locals 0

    iget p1, p0, Lio/sentry/android/core/q;->a:I

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x1

    return p1

    :pswitch_0
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public varargs n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lio/sentry/android/core/q;->a:I

    packed-switch v0, :pswitch_data_0

    array-length v0, p4

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p3, p2}, Lio/sentry/android/core/q;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-static {p3, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p1, p3, p2}, Lio/sentry/android/core/q;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :pswitch_0
    array-length v0, p4

    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p3, p2}, Lio/sentry/android/core/q;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_1
    invoke-static {p3, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p1, p3, p2}, Lio/sentry/android/core/q;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    iget v0, p0, Lio/sentry/android/core/q;->a:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lio/sentry/android/core/j;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Sentry"

    invoke-static {p1, p2, p3}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void

    :pswitch_0
    const-string p1, "Sentry"

    invoke-static {p1, p2, p3}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
