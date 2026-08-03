.class public final synthetic Lio/sentry/android/core/T;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/util/c;
.implements Lio/sentry/s1;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/sentry/android/core/T;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lio/sentry/X;)V
    .locals 2

    iget v0, p0, Lio/sentry/android/core/T;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lrl;

    const/16 v1, 0xf

    invoke-direct {v0, v1, p1}, Lrl;-><init>(ILjava/lang/Object;)V

    invoke-interface {p1, v0}, Lio/sentry/X;->r(Lio/sentry/n1;)Lio/sentry/l;

    return-void

    :pswitch_0
    sget-object v0, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    invoke-interface {p1, v0}, Lio/sentry/X;->k(Lio/sentry/protocol/t;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public c()Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lio/sentry/android/core/T;->a:I

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Lio/sentry/config/a;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_0
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-static {}, Lio/sentry/clientreport/d;->values()[Lio/sentry/clientreport/d;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, v1, v4

    invoke-static {}, Lio/sentry/n;->values()[Lio/sentry/n;

    move-result-object v6

    array-length v7, v6

    move v8, v3

    :goto_1
    if-ge v8, v7, :cond_0

    aget-object v9, v6, v8

    new-instance v10, Lio/sentry/clientreport/c;

    invoke-virtual {v5}, Lio/sentry/clientreport/d;->getReason()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9}, Lio/sentry/n;->getCategory()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v10, v11, v9}, Lio/sentry/clientreport/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v9, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v11, 0x0

    invoke-direct {v9, v11, v12}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    invoke-virtual {v0, v10, v9}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :sswitch_1
    new-instance v0, Ljava/util/Timer;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/Timer;-><init>(Z)V

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x3 -> :sswitch_0
    .end sparse-switch
.end method
