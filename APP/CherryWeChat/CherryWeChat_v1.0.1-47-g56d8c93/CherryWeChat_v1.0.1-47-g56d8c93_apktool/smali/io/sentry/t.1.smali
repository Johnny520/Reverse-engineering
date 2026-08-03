.class public final Lio/sentry/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/l0;


# instance fields
.field public final synthetic a:I

.field public final b:Lio/sentry/v2;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/v2;I)V
    .locals 0

    iput p2, p0, Lio/sentry/t;->a:I

    iput-object p1, p0, Lio/sentry/t;->b:Lio/sentry/v2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 12

    iget v0, p0, Lio/sentry/t;->a:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lio/sentry/internal/a;->c:Lio/sentry/internal/a;

    if-nez v0, :cond_1

    sget-object v0, Lio/sentry/internal/a;->d:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    sget-object v1, Lio/sentry/internal/a;->c:Lio/sentry/internal/a;

    if-nez v1, :cond_0

    new-instance v1, Lio/sentry/internal/a;

    invoke-direct {v1}, Lio/sentry/internal/a;-><init>()V

    sput-object v1, Lio/sentry/internal/a;->c:Lio/sentry/internal/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/r;->close()V

    goto :goto_3

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1

    :cond_1
    :goto_3
    sget-object v0, Lio/sentry/internal/a;->c:Lio/sentry/internal/a;

    iget-boolean v1, v0, Lio/sentry/internal/a;->a:Z

    if-eqz v1, :cond_2

    goto/16 :goto_9

    :cond_2
    const/4 v1, 0x1

    :try_start_2
    iget-object v2, v0, Lio/sentry/internal/a;->b:Lio/sentry/util/a;

    invoke-virtual {v2}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    iget-boolean v3, v0, Lio/sentry/internal/a;->a:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-eqz v3, :cond_4

    :cond_3
    :try_start_4
    invoke-virtual {v2}, Lio/sentry/r;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catch_0
    iput-boolean v1, v0, Lio/sentry/internal/a;->a:Z

    goto/16 :goto_9

    :catchall_2
    move-exception v2

    goto/16 :goto_8

    :cond_4
    :try_start_5
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    const-string v4, "META-INF/MANIFEST.MF"

    invoke-virtual {v3, v4}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    move-result-object v3

    :catch_1
    :cond_5
    :goto_4
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    if-eqz v4, :cond_3

    :try_start_6
    new-instance v4, Ljava/util/jar/Manifest;

    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/net/URL;

    invoke-virtual {v5}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/util/jar/Manifest;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v4}, Ljava/util/jar/Manifest;->getMainAttributes()Ljava/util/jar/Attributes;

    move-result-object v4

    if-eqz v4, :cond_5

    const-string v5, "Sentry-Opentelemetry-SDK-Name"

    invoke-virtual {v4, v5}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Implementation-Version"

    invoke-virtual {v4, v6}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "Sentry-SDK-Name"

    invoke-virtual {v4, v7}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "Sentry-SDK-Package-Name"

    invoke-virtual {v4, v8}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v5, :cond_9

    if-eqz v6, :cond_9

    const-string v9, "Sentry-Opentelemetry-Version-Name"

    invoke-virtual {v4, v9}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_6

    invoke-static {}, Lio/sentry/Y1;->d()Lio/sentry/Y1;

    move-result-object v10

    const-string v11, "maven:io.opentelemetry:opentelemetry-sdk"

    invoke-virtual {v10, v11, v9}, Lio/sentry/Y1;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lio/sentry/Y1;->d()Lio/sentry/Y1;

    move-result-object v9

    const-string v10, "OpenTelemetry"

    invoke-virtual {v9, v10}, Lio/sentry/Y1;->a(Ljava/lang/String;)V

    goto :goto_5

    :catchall_3
    move-exception v3

    goto :goto_6

    :cond_6
    :goto_5
    const-string v9, "Sentry-Opentelemetry-Javaagent-Version-Name"

    invoke-virtual {v4, v9}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-static {}, Lio/sentry/Y1;->d()Lio/sentry/Y1;

    move-result-object v9

    const-string v10, "maven:io.opentelemetry.javaagent:opentelemetry-javaagent"

    invoke-virtual {v9, v10, v4}, Lio/sentry/Y1;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lio/sentry/Y1;->d()Lio/sentry/Y1;

    move-result-object v4

    const-string v9, "OpenTelemetry-Agent"

    invoke-virtual {v4, v9}, Lio/sentry/Y1;->a(Ljava/lang/String;)V

    :cond_7
    const-string v4, "sentry.java.opentelemetry.agentless"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-static {}, Lio/sentry/Y1;->d()Lio/sentry/Y1;

    move-result-object v4

    const-string v9, "OpenTelemetry-Agentless"

    invoke-virtual {v4, v9}, Lio/sentry/Y1;->a(Ljava/lang/String;)V

    :cond_8
    const-string v4, "sentry.java.opentelemetry.agentless-spring"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-static {}, Lio/sentry/Y1;->d()Lio/sentry/Y1;

    move-result-object v4

    const-string v5, "OpenTelemetry-Agentless-Spring"

    invoke-virtual {v4, v5}, Lio/sentry/Y1;->a(Ljava/lang/String;)V

    :cond_9
    if-eqz v7, :cond_5

    if-eqz v6, :cond_5

    if-eqz v8, :cond_5

    const-string v4, "sentry.java"

    invoke-virtual {v7, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {}, Lio/sentry/Y1;->d()Lio/sentry/Y1;

    move-result-object v4

    invoke-virtual {v4, v8, v6}, Lio/sentry/Y1;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto/16 :goto_4

    :goto_6
    :try_start_7
    invoke-virtual {v2}, Lio/sentry/r;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_7

    :catchall_4
    move-exception v2

    :try_start_8
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v3
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :goto_8
    iput-boolean v1, v0, Lio/sentry/internal/a;->a:Z

    throw v2

    :goto_9
    invoke-static {}, Lio/sentry/Y1;->d()Lio/sentry/Y1;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/t;->b:Lio/sentry/v2;

    invoke-virtual {v1}, Lio/sentry/v2;->getFatalLogger()Lio/sentry/ILogger;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/Y1;->c(Lio/sentry/ILogger;)Z

    move-result v0

    return v0

    :pswitch_0
    invoke-static {}, Lio/sentry/Y1;->d()Lio/sentry/Y1;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/t;->b:Lio/sentry/v2;

    invoke-virtual {v1}, Lio/sentry/v2;->getFatalLogger()Lio/sentry/ILogger;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/Y1;->c(Lio/sentry/ILogger;)Z

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b([Ljava/lang/StackTraceElement;Z)Ljava/util/ArrayList;
    .locals 7

    if-eqz p1, :cond_4

    array-length v0, p1

    if-lez v0, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, p1, v2

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v4

    if-nez p2, :cond_0

    const-string v5, "io.sentry."

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "io.sentry.samples."

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    const-string v5, "io.sentry.mobile."

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    new-instance v5, Lio/sentry/protocol/x;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v4}, Lio/sentry/t;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v6

    iput-object v6, v5, Lio/sentry/protocol/x;->k:Ljava/lang/Boolean;

    iput-object v4, v5, Lio/sentry/protocol/x;->f:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v5, Lio/sentry/protocol/x;->e:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v5, Lio/sentry/protocol/x;->d:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v4

    if-ltz v4, :cond_1

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v5, Lio/sentry/protocol/x;->g:Ljava/lang/Integer;

    :cond_1
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, v5, Lio/sentry/protocol/x;->m:Ljava/lang/Boolean;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/16 v4, 0x64

    if-lt v3, v4, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    return-object v0

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public c(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 3

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/sentry/t;->b:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getInAppIncludes()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_2
    invoke-virtual {v0}, Lio/sentry/v2;->getInAppExcludes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1

    :cond_5
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method
