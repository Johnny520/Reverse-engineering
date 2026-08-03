.class public final Lio/sentry/android/replay/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/j1;


# static fields
.field public static final b:Ljava/lang/Object;

.field public static final c:Ljava/util/HashSet;


# instance fields
.field public a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x3

    sget-object v1, Lio/sentry/android/replay/a;->c:Lio/sentry/android/replay/a;

    invoke-static {v0, v1}, LDc;->n(ILUi;)LDn;

    move-result-object v0

    sput-object v0, Lio/sentry/android/replay/b;->b:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const-string v1, "status_code"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "method"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "response_content_length"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "request_content_length"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "http.response_content_length"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "http.request_content_length"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    sput-object v0, Lio/sentry/android/replay/b;->c:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final j(Lio/sentry/f;)Lio/sentry/rrweb/b;
    .locals 11

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v1, p1, Lio/sentry/f;->g:Ljava/lang/String;

    const-string v2, "http"

    invoke-static {v1, v2}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-wide v2, 0x408f400000000000L    # 1000.0

    const/4 v4, 0x0

    if-eqz v1, :cond_b

    iget-object v0, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v1, "url"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v5, v0, Ljava/lang/String;

    if-eqz v5, :cond_0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v0, v4

    :goto_0
    if-eqz v0, :cond_23

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_10

    :cond_1
    iget-object v0, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v5, "http.start_timestamp"

    invoke-interface {v0, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_23

    iget-object v0, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v6, "http.end_timestamp"

    invoke-interface {v0, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_23

    iget-object v0, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v4, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    new-instance v5, Lio/sentry/rrweb/l;

    invoke-direct {v5}, Lio/sentry/rrweb/l;-><init>()V

    invoke-virtual {p1}, Lio/sentry/f;->a()Ljava/util/Date;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    iput-wide v6, v5, Lio/sentry/rrweb/b;->b:J

    const-string v6, "resource.http"

    iput-object v6, v5, Lio/sentry/rrweb/l;->d:Ljava/lang/String;

    iget-object v6, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v6, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v5, Lio/sentry/rrweb/l;->e:Ljava/lang/String;

    instance-of v1, v0, Ljava/lang/Double;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    :goto_1
    div-double/2addr v0, v2

    goto :goto_2

    :cond_2
    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-double v0, v0

    goto :goto_1

    :goto_2
    iput-wide v0, v5, Lio/sentry/rrweb/l;->f:D

    instance-of v0, v4, Ljava/lang/Double;

    if-eqz v0, :cond_3

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    :goto_3
    div-double/2addr v0, v2

    goto :goto_4

    :cond_3
    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-double v0, v0

    goto :goto_3

    :goto_4
    iput-wide v0, v5, Lio/sentry/rrweb/l;->g:D

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object p1, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lio/sentry/android/replay/b;->c:Ljava/util/HashSet;

    invoke-virtual {v3, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const-string v3, "content_length"

    const-string v4, "body_size"

    invoke-static {v2, v3, v4}, LBz;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "."

    invoke-static {v2, v3}, Ltz;->b0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lio/sentry/android/replay/b;->b:Ljava/lang/Object;

    invoke-interface {v3}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LMv;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v3, LMv;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v4, v2}, LfG;->E(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lzq;

    move-result-object v3

    if-nez v3, :cond_5

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_6

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    :cond_6
    iget-object v8, v3, Lzq;->a:Ljava/util/regex/Matcher;

    invoke-virtual {v8}, Ljava/util/regex/Matcher;->start()I

    move-result v9

    invoke-virtual {v8}, Ljava/util/regex/Matcher;->end()I

    move-result v10

    invoke-static {v9, v10}, LTB;->J(II)LGl;

    move-result-object v9

    iget v9, v9, LDl;->a:I

    invoke-virtual {v7, v2, v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v9

    if-eqz v9, :cond_9

    invoke-static {v4}, Ltz;->N(Ljava/lang/CharSequence;)I

    move-result v9

    invoke-virtual {v4, v9}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v4

    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v9}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/util/regex/Matcher;->start()I

    move-result v4

    invoke-virtual {v8}, Ljava/util/regex/Matcher;->end()I

    move-result v8

    invoke-static {v4, v8}, LTB;->J(II)LGl;

    move-result-object v4

    iget v4, v4, LDl;->b:I

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v3}, Lzq;->b()Lzq;

    move-result-object v3

    if-ge v4, v6, :cond_7

    if-nez v3, :cond_6

    :cond_7
    if-ge v4, v6, :cond_8

    invoke-virtual {v7, v2, v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    :cond_8
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_6
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_5

    :cond_9
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string v0, "Char sequence is empty."

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(Ljava/util/Map;)V

    iput-object p1, v5, Lio/sentry/rrweb/l;->h:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v5

    :cond_b
    iget-object v1, p1, Lio/sentry/f;->e:Ljava/lang/String;

    const-string v5, "navigation"

    invoke-static {v1, v5}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v6, "state"

    if-eqz v1, :cond_c

    iget-object v1, p1, Lio/sentry/f;->g:Ljava/lang/String;

    const-string v7, "app.lifecycle"

    invoke-static {v1, v7}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "app."

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :goto_7
    move-object v1, v4

    move-object v6, v1

    goto/16 :goto_f

    :cond_c
    iget-object v1, p1, Lio/sentry/f;->e:Ljava/lang/String;

    invoke-static {v1, v5}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    iget-object v1, p1, Lio/sentry/f;->g:Ljava/lang/String;

    const-string v7, "device.orientation"

    invoke-static {v1, v7}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    iget-object v5, p1, Lio/sentry/f;->g:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v6, "position"

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v7, "landscape"

    invoke-static {v1, v7}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    const-string v7, "portrait"

    invoke-static {v1, v7}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_23

    :cond_d
    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_e
    iget-object v1, p1, Lio/sentry/f;->e:Ljava/lang/String;

    invoke-static {v1, v5}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    iget-object v1, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v6, "resumed"

    invoke-static {v1, v6}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v6, "to"

    if-eqz v1, :cond_11

    iget-object v1, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v7, "screen"

    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v7, v1, Ljava/lang/String;

    if-eqz v7, :cond_f

    check-cast v1, Ljava/lang/String;

    goto :goto_8

    :cond_f
    move-object v1, v4

    :goto_8
    if-eqz v1, :cond_10

    const/16 v7, 0x2e

    invoke-static {v1, v7}, Ltz;->c0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    goto :goto_9

    :cond_10
    move-object v1, v4

    goto :goto_9

    :cond_11
    iget-object v1, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    iget-object v1, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v7, v1, Ljava/lang/String;

    if-eqz v7, :cond_10

    check-cast v1, Ljava/lang/String;

    :goto_9
    if-nez v1, :cond_12

    goto/16 :goto_10

    :cond_12
    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_7

    :cond_13
    iget-object v1, p1, Lio/sentry/f;->g:Ljava/lang/String;

    const-string v5, "ui.click"

    invoke-static {v1, v5}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    iget-object v1, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v5, "view.id"

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_14

    iget-object v1, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v5, "view.tag"

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_14

    iget-object v1, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v5, "view.class"

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :cond_14
    instance-of v5, v1, Ljava/lang/String;

    if-eqz v5, :cond_15

    check-cast v1, Ljava/lang/String;

    goto :goto_a

    :cond_15
    move-object v1, v4

    :goto_a
    if-nez v1, :cond_16

    goto/16 :goto_10

    :cond_16
    iget-object v5, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0, v5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    const-string v5, "ui.tap"

    move-object v6, v4

    goto/16 :goto_f

    :cond_17
    iget-object v1, p1, Lio/sentry/f;->e:Ljava/lang/String;

    const-string v5, "system"

    invoke-static {v1, v5}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v5, "action"

    if-eqz v1, :cond_1d

    iget-object v1, p1, Lio/sentry/f;->g:Ljava/lang/String;

    const-string v7, "network.event"

    invoke-static {v1, v7}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    iget-object v1, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v5, "NETWORK_LOST"

    invoke-static {v1, v5}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_18

    const-string v1, "offline"

    goto :goto_c

    :cond_18
    iget-object v1, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v5, "network_type"

    invoke-interface {v1, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_23

    iget-object v1, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v7, v1, Ljava/lang/String;

    if-eqz v7, :cond_19

    check-cast v1, Ljava/lang/String;

    goto :goto_b

    :cond_19
    move-object v1, v4

    :goto_b
    if-eqz v1, :cond_23

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1a

    goto/16 :goto_10

    :cond_1a
    iget-object v1, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_c
    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/sentry/android/replay/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v1, v5}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1b

    goto/16 :goto_10

    :cond_1b
    invoke-virtual {v0, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v5, v1, Ljava/lang/String;

    if-eqz v5, :cond_1c

    check-cast v1, Ljava/lang/String;

    goto :goto_d

    :cond_1c
    move-object v1, v4

    :goto_d
    iput-object v1, p0, Lio/sentry/android/replay/b;->a:Ljava/lang/String;

    const-string v5, "device.connectivity"

    goto/16 :goto_7

    :cond_1d
    iget-object v1, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v5, "BATTERY_CHANGED"

    invoke-static {v1, v5}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_21

    iget-object v1, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1e
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_20

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const-string v8, "level"

    invoke-static {v7, v8}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1f

    const-string v8, "charging"

    invoke-static {v7, v8}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1e

    :cond_1f
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v7, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_e

    :cond_20
    invoke-interface {v0, v5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    const-string v5, "device.battery"

    goto/16 :goto_7

    :cond_21
    iget-object v5, p1, Lio/sentry/f;->g:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/f;->d:Ljava/lang/String;

    iget-object v6, p1, Lio/sentry/f;->i:Lio/sentry/a2;

    iget-object v7, p1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0, v7}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :goto_f
    if-eqz v5, :cond_23

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_22

    goto :goto_10

    :cond_22
    new-instance v4, Lio/sentry/rrweb/a;

    invoke-direct {v4}, Lio/sentry/rrweb/a;-><init>()V

    invoke-virtual {p1}, Lio/sentry/f;->a()Ljava/util/Date;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    iput-wide v7, v4, Lio/sentry/rrweb/b;->b:J

    invoke-virtual {p1}, Lio/sentry/f;->a()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    long-to-double v7, v7

    div-double/2addr v7, v2

    iput-wide v7, v4, Lio/sentry/rrweb/a;->d:D

    const-string p1, "default"

    iput-object p1, v4, Lio/sentry/rrweb/a;->e:Ljava/lang/String;

    iput-object v5, v4, Lio/sentry/rrweb/a;->f:Ljava/lang/String;

    iput-object v1, v4, Lio/sentry/rrweb/a;->g:Ljava/lang/String;

    iput-object v6, v4, Lio/sentry/rrweb/a;->h:Lio/sentry/a2;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(Ljava/util/Map;)V

    iput-object p1, v4, Lio/sentry/rrweb/a;->i:Ljava/util/concurrent/ConcurrentHashMap;

    :cond_23
    :goto_10
    return-object v4
.end method
