.class public final Lio/sentry/A2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/C;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "java.version"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "java.vendor"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/sentry/A2;->a:Ljava/lang/String;

    iput-object v1, p0, Lio/sentry/A2;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/C1;)V
    .locals 1

    iget-object p1, p1, Lio/sentry/C1;->b:Lio/sentry/protocol/c;

    invoke-virtual {p1}, Lio/sentry/protocol/c;->g()Lio/sentry/protocol/v;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lio/sentry/protocol/v;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, v0}, Lio/sentry/protocol/c;->r(Lio/sentry/protocol/v;)V

    :cond_0
    invoke-virtual {p1}, Lio/sentry/protocol/c;->g()Lio/sentry/protocol/v;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p1, Lio/sentry/protocol/v;->a:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p1, Lio/sentry/protocol/v;->b:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/sentry/A2;->b:Ljava/lang/String;

    iput-object v0, p1, Lio/sentry/protocol/v;->a:Ljava/lang/String;

    iget-object v0, p0, Lio/sentry/A2;->a:Ljava/lang/String;

    iput-object v0, p1, Lio/sentry/protocol/v;->b:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public final f(Lio/sentry/protocol/A;Lio/sentry/H;)Lio/sentry/protocol/A;
    .locals 0

    invoke-virtual {p0, p1}, Lio/sentry/A2;->a(Lio/sentry/C1;)V

    return-object p1
.end method

.method public final i(Lio/sentry/R1;Lio/sentry/H;)Lio/sentry/R1;
    .locals 0

    invoke-virtual {p0, p1}, Lio/sentry/A2;->a(Lio/sentry/C1;)V

    return-object p1
.end method
