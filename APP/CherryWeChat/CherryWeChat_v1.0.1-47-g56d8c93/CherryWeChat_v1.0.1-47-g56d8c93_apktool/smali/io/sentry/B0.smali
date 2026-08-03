.class public final Lio/sentry/B0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/android/replay/util/i;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, LH5;

    invoke-direct {v0, p1}, LH5;-><init>(I)V

    iput-object v0, p0, Lio/sentry/B0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 1

    packed-switch p1, :pswitch_data_0

    .line 2
    :pswitch_0
    new-instance p1, Lio/sentry/android/core/I;

    sget-object p2, Lio/sentry/N0;->a:Lio/sentry/N0;

    invoke-direct {p1, p2}, Lio/sentry/android/core/I;-><init>(Lio/sentry/ILogger;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lio/sentry/B0;->a:Ljava/lang/Object;

    return-void

    .line 5
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance p1, Lio/sentry/transport/q;

    invoke-direct {p1}, Lio/sentry/transport/q;-><init>()V

    iput-object p1, p0, Lio/sentry/B0;->a:Ljava/lang/Object;

    return-void

    .line 7
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance p1, Lio/sentry/util/d;

    new-instance p2, Lio/sentry/android/core/T;

    const/4 v0, 0x3

    invoke-direct {p2, v0}, Lio/sentry/android/core/T;-><init>(I)V

    invoke-direct {p1, p2}, Lio/sentry/util/d;-><init>(Lio/sentry/util/c;)V

    iput-object p1, p0, Lio/sentry/B0;->a:Ljava/lang/Object;

    return-void

    .line 9
    :pswitch_3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lio/sentry/B0;->a:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/B0;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static k(Ljava/lang/Throwable;Lio/sentry/protocol/k;Ljava/lang/Long;Ljava/util/List;Z)Lio/sentry/protocol/s;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lio/sentry/protocol/s;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-eqz v0, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz p3, :cond_3

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    new-instance v3, Lio/sentry/protocol/y;

    invoke-direct {v3, p3}, Lio/sentry/protocol/y;-><init>(Ljava/util/List;)V

    if-eqz p4, :cond_2

    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object p3, v3, Lio/sentry/protocol/y;->c:Ljava/lang/Boolean;

    :cond_2
    iput-object v3, v2, Lio/sentry/protocol/s;->e:Lio/sentry/protocol/y;

    :cond_3
    iput-object p2, v2, Lio/sentry/protocol/s;->d:Ljava/lang/Long;

    iput-object v1, v2, Lio/sentry/protocol/s;->a:Ljava/lang/String;

    iput-object p1, v2, Lio/sentry/protocol/s;->f:Lio/sentry/protocol/k;

    iput-object v0, v2, Lio/sentry/protocol/s;->c:Ljava/lang/String;

    iput-object p0, v2, Lio/sentry/protocol/s;->b:Ljava/lang/String;

    return-object v2
.end method


# virtual methods
.method public a(I)I
    .locals 1

    iget-object v0, p0, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v0, Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineStart(I)I

    move-result p1

    return p1
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v0, Landroid/text/Layout;

    invoke-virtual {v0}, Landroid/text/Layout;->getLineCount()I

    move-result v0

    return v0
.end method

.method public c()Ljava/lang/Integer;
    .locals 11

    iget-object v0, p0, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v0, Landroid/text/Layout;

    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    instance-of v1, v1, Landroid/text/Spanned;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    check-cast v1, Landroid/text/Spanned;

    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const-class v4, Landroid/text/style/ForegroundColorSpan;

    const/4 v5, 0x0

    invoke-interface {v1, v5, v3, v4}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/text/style/ForegroundColorSpan;

    array-length v3, v1

    const/high16 v4, -0x80000000

    move-object v6, v2

    :goto_0
    if-ge v5, v3, :cond_3

    aget-object v7, v1, v5

    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v8

    check-cast v8, Landroid/text/Spanned;

    invoke-interface {v8, v7}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v8

    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v9

    check-cast v9, Landroid/text/Spanned;

    invoke-interface {v9, v7}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v9

    const/4 v10, -0x1

    if-eq v8, v10, :cond_2

    if-ne v9, v10, :cond_1

    goto :goto_1

    :cond_1
    sub-int/2addr v9, v8

    if-le v9, v4, :cond_2

    invoke-virtual {v7}, Landroid/text/style/ForegroundColorSpan;->getForegroundColor()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move v4, v9

    :cond_2
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/high16 v1, -0x1000000

    or-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_4
    return-object v2
.end method

.method public d(I)I
    .locals 1

    iget-object v0, p0, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v0, Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineVisibleEnd(I)I

    move-result p1

    return p1
.end method

.method public e(I)I
    .locals 1

    iget-object v0, p0, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v0, Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineTop(I)I

    move-result p1

    return p1
.end method

.method public f(II)F
    .locals 0

    iget-object p1, p0, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast p1, Landroid/text/Layout;

    invoke-virtual {p1, p2}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result p1

    return p1
.end method

.method public g(I)I
    .locals 1

    iget-object v0, p0, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v0, Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result p1

    return p1
.end method

.method public h(I)I
    .locals 1

    iget-object v0, p0, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v0, Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineBottom(I)I

    move-result p1

    return p1
.end method

.method public i(Lio/sentry/android/core/N;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/I;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-gt v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/content/ContentProvider;->getCallingPackage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/SecurityException;

    const-string v0, "Provider does not allow for granting of Uri permissions"

    invoke-direct {p1, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public j(Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/HashSet;Ljava/util/ArrayDeque;Ljava/lang/String;)V
    .locals 10

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    :goto_0
    if-eqz p1, :cond_5

    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    if-nez p5, :cond_0

    const-string p5, "chained"

    :cond_0
    instance-of v1, p1, Lio/sentry/exception/a;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lio/sentry/exception/a;

    iget-object v1, p1, Lio/sentry/exception/a;->a:Lio/sentry/protocol/k;

    iget-object v3, p1, Lio/sentry/exception/a;->b:Ljava/lang/Throwable;

    iget-object v4, p1, Lio/sentry/exception/a;->c:Ljava/lang/Thread;

    iget-boolean p1, p1, Lio/sentry/exception/a;->d:Z

    move-object v9, v1

    move v1, p1

    move-object p1, v3

    move-object v3, v9

    goto :goto_1

    :cond_1
    new-instance v1, Lio/sentry/protocol/k;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    move-object v3, v1

    move v1, v2

    :goto_1
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object v6, v3, Lio/sentry/protocol/k;->d:Ljava/lang/Boolean;

    invoke-virtual {v5, v6}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v5

    iget-object v6, p0, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v6, Lio/sentry/t;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v7

    invoke-virtual {v6, v7, v5}, Lio/sentry/t;->b([Ljava/lang/StackTraceElement;Z)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v4}, Ljava/lang/Thread;->getId()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {p1, v3, v4, v5, v1}, Lio/sentry/B0;->k(Ljava/lang/Throwable;Lio/sentry/protocol/k;Ljava/lang/Long;Ljava/util/List;Z)Lio/sentry/protocol/s;

    move-result-object v1

    invoke-virtual {p4, v1}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    iget-object v1, v3, Lio/sentry/protocol/k;->a:Ljava/lang/String;

    if-nez v1, :cond_2

    iput-object p5, v3, Lio/sentry/protocol/k;->a:Ljava/lang/String;

    :cond_2
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p5

    if-ltz p5, :cond_3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    iput-object p5, v3, Lio/sentry/protocol/k;->i:Ljava/lang/Integer;

    :cond_3
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    iput-object p5, v3, Lio/sentry/protocol/k;->h:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getSuppressed()[Ljava/lang/Throwable;

    move-result-object p5

    if-eqz p5, :cond_4

    array-length v1, p5

    if-lez v1, :cond_4

    array-length v1, p5

    :goto_2
    if-ge v2, v1, :cond_4

    aget-object v4, p5, v2

    const-string v8, "suppressed"

    move-object v3, p0

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-virtual/range {v3 .. v8}, Lio/sentry/B0;->j(Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/HashSet;Ljava/util/ArrayDeque;Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    const/4 p5, 0x0

    move-object p2, v5

    move-object p3, v6

    move-object p4, v7

    goto/16 :goto_0

    :cond_5
    return-void
.end method

.method public l(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p1, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    if-nez p3, :cond_0

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->l()V

    return-void

    :cond_0
    instance-of v1, p3, Ljava/lang/Character;

    if-eqz v1, :cond_1

    check-cast p3, Ljava/lang/Character;

    invoke-virtual {p3}, Ljava/lang/Character;->charValue()C

    move-result p2

    invoke-static {p2}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    return-void

    :cond_1
    instance-of v1, p3, Ljava/lang/String;

    if-eqz v1, :cond_2

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p1, p3}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    return-void

    :cond_2
    instance-of v1, p3, Ljava/lang/Boolean;

    if-eqz v1, :cond_3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Lio/sentry/internal/debugmeta/c;->A(Z)Lio/sentry/internal/debugmeta/c;

    return-void

    :cond_3
    instance-of v1, p3, Ljava/lang/Number;

    if-eqz v1, :cond_4

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p1, p3}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/Number;)Lio/sentry/internal/debugmeta/c;

    return-void

    :cond_4
    instance-of v1, p3, Ljava/util/Date;

    if-eqz v1, :cond_5

    check-cast p3, Ljava/util/Date;

    :try_start_0
    invoke-static {p3}, Lio/sentry/config/a;->t(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    :catch_0
    move-exception p1

    sget-object p3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v1, "Error when serializing Date"

    invoke-interface {p2, p3, v1, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->l()V

    goto/16 :goto_1

    :cond_5
    instance-of v1, p3, Ljava/util/TimeZone;

    if-eqz v1, :cond_6

    check-cast p3, Ljava/util/TimeZone;

    :try_start_1
    invoke-virtual {p3}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_1

    :catch_1
    move-exception p1

    sget-object p3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v1, "Error when serializing TimeZone"

    invoke-interface {p2, p3, v1, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->l()V

    goto/16 :goto_1

    :cond_6
    instance-of v0, p3, Lio/sentry/C0;

    if-eqz v0, :cond_7

    check-cast p3, Lio/sentry/C0;

    invoke-interface {p3, p1, p2}, Lio/sentry/C0;->serialize(Lio/sentry/Z0;Lio/sentry/ILogger;)V

    return-void

    :cond_7
    instance-of v0, p3, Ljava/util/Collection;

    if-eqz v0, :cond_8

    check-cast p3, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2, p3}, Lio/sentry/B0;->m(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    return-void

    :cond_8
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_9

    check-cast p3, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lio/sentry/B0;->m(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    return-void

    :cond_9
    instance-of v0, p3, Ljava/util/Map;

    if-eqz v0, :cond_a

    check-cast p3, Ljava/util/Map;

    invoke-virtual {p0, p1, p2, p3}, Lio/sentry/B0;->n(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Map;)V

    return-void

    :cond_a
    instance-of v0, p3, Ljava/util/Locale;

    if-eqz v0, :cond_b

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    return-void

    :cond_b
    instance-of v0, p3, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    if-eqz v0, :cond_d

    check-cast p3, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    sget-object v0, Lio/sentry/util/b;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->length()I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_c

    invoke-virtual {p3, v2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_c
    invoke-virtual {p0, p1, p2, v1}, Lio/sentry/B0;->m(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    return-void

    :cond_d
    instance-of v0, p3, Ljava/util/concurrent/atomic/AtomicBoolean;

    if-eqz v0, :cond_e

    check-cast p3, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    invoke-virtual {p1, p2}, Lio/sentry/internal/debugmeta/c;->A(Z)Lio/sentry/internal/debugmeta/c;

    return-void

    :cond_e
    instance-of v0, p3, Ljava/net/URI;

    if-eqz v0, :cond_f

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    return-void

    :cond_f
    instance-of v0, p3, Ljava/net/InetAddress;

    if-eqz v0, :cond_10

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    return-void

    :cond_10
    instance-of v0, p3, Ljava/util/UUID;

    if-eqz v0, :cond_11

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    return-void

    :cond_11
    instance-of v0, p3, Ljava/util/Currency;

    if-eqz v0, :cond_12

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    return-void

    :cond_12
    instance-of v0, p3, Ljava/util/Calendar;

    if-eqz v0, :cond_13

    check-cast p3, Ljava/util/Calendar;

    invoke-static {p3}, Lio/sentry/util/b;->a(Ljava/util/Calendar;)Ljava/util/HashMap;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lio/sentry/B0;->n(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Map;)V

    return-void

    :cond_13
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    return-void

    :cond_14
    :try_start_2
    iget-object v0, p0, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v0, LH5;

    invoke-virtual {v0, p2, p3}, LH5;->b(Lio/sentry/ILogger;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lio/sentry/B0;->l(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    return-void

    :catch_2
    move-exception p3

    sget-object v0, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v1, "Failed serializing unknown object."

    invoke-interface {p2, v0, v1, p3}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string p2, "[OBJECT]"

    invoke-virtual {p1, p2}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :goto_1
    return-void
.end method

.method public m(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V
    .locals 5

    iget-object v0, p1, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->p()V

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->d()V

    iget v1, v0, Lio/sentry/vendor/gson/stream/c;->c:I

    iget-object v2, v0, Lio/sentry/vendor/gson/stream/c;->b:[I

    array-length v3, v2

    const/4 v4, 0x2

    if-ne v1, v3, :cond_0

    mul-int/2addr v1, v4

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, v0, Lio/sentry/vendor/gson/stream/c;->b:[I

    :cond_0
    iget-object v1, v0, Lio/sentry/vendor/gson/stream/c;->b:[I

    iget v2, v0, Lio/sentry/vendor/gson/stream/c;->c:I

    add-int/lit8 v3, v2, 0x1

    iput v3, v0, Lio/sentry/vendor/gson/stream/c;->c:I

    const/4 v3, 0x1

    aput v3, v1, v2

    iget-object v1, v0, Lio/sentry/vendor/gson/stream/c;->a:Ljava/io/Writer;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(I)V

    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, p1, p2, v1}, Lio/sentry/B0;->l(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const/16 p1, 0x5d

    invoke-virtual {v0, v3, v4, p1}, Lio/sentry/vendor/gson/stream/c;->f(IIC)V

    return-void
.end method

.method public n(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Map;)V
    .locals 3

    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->h()Lio/sentry/internal/debugmeta/c;

    invoke-interface {p3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, p1, p2, v1}, Lio/sentry/B0;->l(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->k()Lio/sentry/internal/debugmeta/c;

    return-void
.end method
