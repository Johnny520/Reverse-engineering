.class public final Lio/sentry/M0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/S;


# static fields
.field public static final b:Lio/sentry/M0;


# instance fields
.field public final a:Lio/sentry/v2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/M0;

    invoke-direct {v0}, Lio/sentry/M0;-><init>()V

    sput-object v0, Lio/sentry/M0;->b:Lio/sentry/M0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lio/sentry/v2;->empty()Lio/sentry/v2;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/M0;->a:Lio/sentry/v2;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 0

    return-void
.end method

.method public final b(J)V
    .locals 0

    return-void
.end method

.method public final c()Lio/sentry/transport/p;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final clone()Lio/sentry/S;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/M0;->b:Lio/sentry/M0;

    return-object v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 2
    sget-object v0, Lio/sentry/M0;->b:Lio/sentry/M0;

    return-object v0
.end method

.method public final d()Lio/sentry/i0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final f(Lio/sentry/f;Lio/sentry/H;)V
    .locals 0

    return-void
.end method

.method public final g(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)Lio/sentry/protocol/t;
    .locals 0

    sget-object p1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    return-object p1
.end method

.method public final h(Lio/sentry/e1;)Lio/sentry/protocol/t;
    .locals 0

    sget-object p1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    return-object p1
.end method

.method public final i()V
    .locals 0

    return-void
.end method

.method public final isEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j()V
    .locals 0

    return-void
.end method

.method public final k(Lio/sentry/P2;Lio/sentry/Q2;)Lio/sentry/i0;
    .locals 0

    sget-object p1, Lio/sentry/W0;->a:Lio/sentry/W0;

    return-object p1
.end method

.method public final l()Lio/sentry/v2;
    .locals 1

    iget-object v0, p0, Lio/sentry/M0;->a:Lio/sentry/v2;

    return-object v0
.end method

.method public final m(Lio/sentry/s1;)V
    .locals 0

    return-void
.end method

.method public final n()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final o(Lio/sentry/protocol/A;Lio/sentry/N2;Lio/sentry/H;Lio/sentry/h1;)Lio/sentry/protocol/t;
    .locals 0

    sget-object p1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    return-object p1
.end method

.method public final p(Lio/sentry/x2;Lio/sentry/H;)Lio/sentry/protocol/t;
    .locals 0

    sget-object p1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    return-object p1
.end method

.method public final q(Ljava/lang/String;)Lio/sentry/Z;
    .locals 0

    sget-object p1, Lio/sentry/O0;->b:Lio/sentry/O0;

    return-object p1
.end method

.method public final r(Lio/sentry/R1;Lio/sentry/H;)Lio/sentry/protocol/t;
    .locals 0

    sget-object p1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    return-object p1
.end method
