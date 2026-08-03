.class public final Lio/sentry/A0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/io/Reader;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lio/sentry/A0;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lio/sentry/vendor/gson/stream/a;

    invoke-direct {v0, p1}, Lio/sentry/vendor/gson/stream/a;-><init>(Ljava/io/Reader;)V

    iput-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Lio/sentry/A0;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    .line 5
    new-instance v1, Ljava/util/AbstractMap$SimpleEntry;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    return-void
.end method

.method private final H(Z)V
    .locals 0

    return-void
.end method

.method private final I()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final A(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    if-nez v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-eqz p1, :cond_1

    invoke-interface {p2, p0, p1}, Lio/sentry/q0;->a(Lio/sentry/A0;Lio/sentry/ILogger;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    move-object p1, v1

    :goto_0
    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->C()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v1, v2, :cond_2

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->y()V

    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    invoke-interface {p2, p0, p1}, Lio/sentry/q0;->a(Lio/sentry/A0;Lio/sentry/ILogger;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final B()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lio/sentry/A0;->E()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Expected string"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->A()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final C()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lio/sentry/A0;->E()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->C()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->y()V

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->A()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final D(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V
    .locals 2

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    :try_start_0
    invoke-virtual {p0}, Lio/sentry/A0;->E()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    sget-object v0, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v1, "Error deserializing unknown key: %s"

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p1, v0, p2, v1, p3}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void

    :pswitch_0
    :try_start_1
    invoke-virtual {p0}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p2

    sget-object v0, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v1, "Error deserializing unknown key: %s"

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p1, v0, p2, v1, p3}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public E()Ljava/lang/Object;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final F()Lio/sentry/vendor/gson/stream/b;
    .locals 2

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lio/sentry/vendor/gson/stream/b;->END_DOCUMENT:Lio/sentry/vendor/gson/stream/b;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    if-nez v0, :cond_1

    sget-object v0, Lio/sentry/vendor/gson/stream/b;->END_DOCUMENT:Lio/sentry/vendor/gson/stream/b;

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    sget-object v0, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/Map;

    if-eqz v1, :cond_3

    sget-object v0, Lio/sentry/vendor/gson/stream/b;->BEGIN_OBJECT:Lio/sentry/vendor/gson/stream/b;

    goto :goto_0

    :cond_3
    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_4

    sget-object v0, Lio/sentry/vendor/gson/stream/b;->BEGIN_ARRAY:Lio/sentry/vendor/gson/stream/b;

    goto :goto_0

    :cond_4
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_5

    sget-object v0, Lio/sentry/vendor/gson/stream/b;->STRING:Lio/sentry/vendor/gson/stream/b;

    goto :goto_0

    :cond_5
    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_6

    sget-object v0, Lio/sentry/vendor/gson/stream/b;->NUMBER:Lio/sentry/vendor/gson/stream/b;

    goto :goto_0

    :cond_6
    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_7

    sget-object v0, Lio/sentry/vendor/gson/stream/b;->BOOLEAN:Lio/sentry/vendor/gson/stream/b;

    goto :goto_0

    :cond_7
    instance-of v1, v0, Lio/sentry/vendor/gson/stream/b;

    if-eqz v1, :cond_8

    check-cast v0, Lio/sentry/vendor/gson/stream/b;

    goto :goto_0

    :cond_8
    sget-object v0, Lio/sentry/vendor/gson/stream/b;->END_DOCUMENT:Lio/sentry/vendor/gson/stream/b;

    :goto_0
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->C()Lio/sentry/vendor/gson/stream/b;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final G(Z)V
    .locals 1

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    iput-boolean p1, v0, Lio/sentry/vendor/gson/stream/a;->b:Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final close()V
    .locals 1

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->close()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d()V
    .locals 6

    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_1

    new-instance v2, Ljava/util/AbstractMap$SimpleEntry;

    sget-object v3, Lio/sentry/vendor/gson/stream/b;->END_ARRAY:Lio/sentry/vendor/gson/stream/b;

    const/4 v4, 0x0

    invoke-direct {v2, v4, v3}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    new-instance v5, Ljava/util/AbstractMap$SimpleEntry;

    invoke-direct {v5, v4, v3}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Current token is not an object"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "No more entries"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final f()V
    .locals 5

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/util/Map;

    if-eqz v2, :cond_1

    new-instance v2, Ljava/util/AbstractMap$SimpleEntry;

    const/4 v3, 0x0

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->END_OBJECT:Lio/sentry/vendor/gson/stream/b;

    invoke-direct {v2, v3, v4}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Current token is not an object"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "No more entries"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->f()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i()V
    .locals 3

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->o()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final l()Ljava/lang/Boolean;
    .locals 3

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lio/sentry/A0;->E()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->C()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->y()V

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->s()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Lio/sentry/ILogger;)Ljava/util/Date;
    .locals 4

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lio/sentry/A0;->E()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-static {v0}, Lio/sentry/config/a;->o(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :try_start_1
    invoke-static {v0}, Lio/sentry/config/a;->p(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v3, "Error when deserializing millis timestamp format."

    invoke-interface {p1, v2, v3, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object v1

    :pswitch_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->C()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->y()V

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->A()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    :try_start_2
    invoke-static {v0}, Lio/sentry/config/a;->o(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catch_2
    :try_start_3
    invoke-static {v0}, Lio/sentry/config/a;->p(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_1

    :catch_3
    move-exception v0

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Error when deserializing millis timestamp format."

    invoke-interface {p1, v1, v2, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final o()D
    .locals 2

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lio/sentry/A0;->E()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Expected double"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->t()D

    move-result-wide v0

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p()Ljava/lang/Double;
    .locals 3

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lio/sentry/A0;->E()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->C()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->y()V

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->t()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    :goto_1
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q()F
    .locals 2

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lio/sentry/A0;->E()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Expected float"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->t()D

    move-result-wide v0

    double-to-float v0, v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final r()Ljava/lang/Float;
    .locals 3

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lio/sentry/A0;->E()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->C()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->y()V

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lio/sentry/A0;->q()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    :goto_1
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final s()I
    .locals 2

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lio/sentry/A0;->E()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Expected int"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->u()I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final t()Ljava/lang/Integer;
    .locals 3

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lio/sentry/A0;->E()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->C()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->y()V

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->u()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_1
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final u(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/ArrayList;
    .locals 5

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v1, v2, :cond_1

    invoke-virtual {p0}, Lio/sentry/A0;->E()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Expected null but was "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/A0;->d()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v2, :cond_3

    :cond_2
    :try_start_1
    invoke-interface {p2, p0, p1}, Lio/sentry/q0;->a(Lio/sentry/A0;Lio/sentry/ILogger;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    :try_start_2
    sget-object v3, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v4, "Failed to deserialize object in list."

    invoke-interface {p1, v3, v4, v2}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v3, Lio/sentry/vendor/gson/stream/b;->BEGIN_OBJECT:Lio/sentry/vendor/gson/stream/b;

    if-eq v2, v3, :cond_2

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_3
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result p1

    const/4 p2, 0x1

    if-le p1, p2, :cond_4

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :cond_4
    move-object p1, v1

    :goto_2
    return-object p1

    :goto_3
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :pswitch_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->C()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v1, v2, :cond_5

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->y()V

    const/4 p1, 0x0

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->d()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget v2, v0, Lio/sentry/vendor/gson/stream/a;->h:I

    if-nez v2, :cond_6

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->l()I

    move-result v2

    :cond_6
    const/4 v3, 0x2

    if-eq v2, v3, :cond_8

    const/4 v3, 0x4

    if-eq v2, v3, :cond_8

    :cond_7
    :try_start_3
    invoke-interface {p2, p0, p1}, Lio/sentry/q0;->a(Lio/sentry/A0;Lio/sentry/ILogger;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_4

    :catch_2
    move-exception v2

    sget-object v3, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v4, "Failed to deserialize object in list."

    invoke-interface {p1, v3, v4, v2}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_4
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->C()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v3, Lio/sentry/vendor/gson/stream/b;->BEGIN_OBJECT:Lio/sentry/vendor/gson/stream/b;

    if-eq v2, v3, :cond_7

    :cond_8
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->m()V

    move-object p1, v1

    :goto_5
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final v()J
    .locals 2

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lio/sentry/A0;->E()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Expected long"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->v()J

    move-result-wide v0

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final w()Ljava/lang/Long;
    .locals 3

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lio/sentry/A0;->E()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->C()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->y()V

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->v()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_1
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final x(Lio/sentry/ILogger;Lio/sentry/q0;)Ljava/util/HashMap;
    .locals 5

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v0

    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lio/sentry/A0;->E()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Expected null but was "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/A0;->f()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v1, :cond_3

    :cond_2
    :try_start_1
    invoke-virtual {p0}, Lio/sentry/A0;->y()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, p0, p1}, Lio/sentry/q0;->a(Lio/sentry/A0;Lio/sentry/ILogger;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_2
    sget-object v2, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v3, "Failed to deserialize object in map."

    invoke-interface {p1, v2, v3, v1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->BEGIN_OBJECT:Lio/sentry/vendor/gson/stream/b;

    if-eq v1, v2, :cond_2

    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-eq v1, v2, :cond_2

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lio/sentry/A0;->i()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-object p1, v0

    :goto_2
    return-object p1

    :goto_3
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :pswitch_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->C()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v1, v2, :cond_4

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->y()V

    const/4 p1, 0x0

    goto :goto_5

    :cond_4
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->f()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iget v2, v0, Lio/sentry/vendor/gson/stream/a;->h:I

    if-nez v2, :cond_5

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->l()I

    move-result v2

    :cond_5
    const/4 v3, 0x2

    if-eq v2, v3, :cond_7

    const/4 v3, 0x4

    if-eq v2, v3, :cond_7

    :cond_6
    :try_start_3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->w()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, p0, p1}, Lio/sentry/q0;->a(Lio/sentry/A0;Lio/sentry/ILogger;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_4

    :catch_2
    move-exception v2

    sget-object v3, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v4, "Failed to deserialize object in map."

    invoke-interface {p1, v3, v4, v2}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_4
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->C()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v3, Lio/sentry/vendor/gson/stream/b;->BEGIN_OBJECT:Lio/sentry/vendor/gson/stream/b;

    if-eq v2, v3, :cond_6

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->C()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v3, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-eq v2, v3, :cond_6

    :cond_7
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->o()V

    move-object p1, v1

    :goto_5
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final y()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected a name but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/sentry/A0;->F()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->w()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final z()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/sentry/A0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lio/sentry/A0;->E()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Lio/sentry/z0;

    invoke-direct {v0}, Lio/sentry/z0;-><init>()V

    invoke-virtual {v0, p0}, Lio/sentry/z0;->d(Lio/sentry/A0;)V

    invoke-virtual {v0}, Lio/sentry/z0;->a()Lio/sentry/u0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lio/sentry/u0;->getValue()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
