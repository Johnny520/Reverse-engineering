.class public final Lio/sentry/w1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/Z;


# static fields
.field public static final a:Lio/sentry/w1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/w1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/sentry/w1;->a:Lio/sentry/w1;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 0

    invoke-static {}, Lio/sentry/z1;->a()V

    return-void
.end method

.method public final b(J)V
    .locals 1

    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/sentry/Z;->b(J)V

    return-void
.end method

.method public final c()Lio/sentry/transport/p;
    .locals 1

    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/Z;->c()Lio/sentry/transport/p;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Lio/sentry/S;
    .locals 1

    .line 2
    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/Z;->clone()Lio/sentry/S;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/w1;->clone()Lio/sentry/S;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lio/sentry/i0;
    .locals 1

    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/Z;->d()Lio/sentry/i0;

    move-result-object v0

    return-object v0
.end method

.method public final e()Z
    .locals 1

    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/Z;->e()Z

    move-result v0

    return v0
.end method

.method public final f(Lio/sentry/f;Lio/sentry/H;)V
    .locals 1

    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/sentry/Z;->f(Lio/sentry/f;Lio/sentry/H;)V

    return-void
.end method

.method public final g(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)Lio/sentry/protocol/t;
    .locals 1

    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/sentry/Z;->g(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)Lio/sentry/protocol/t;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lio/sentry/e1;)Lio/sentry/protocol/t;
    .locals 1

    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/Z;->h(Lio/sentry/e1;)Lio/sentry/protocol/t;

    move-result-object p1

    return-object p1
.end method

.method public final i()V
    .locals 1

    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/Z;->i()V

    return-void
.end method

.method public final isEnabled()Z
    .locals 1

    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/Z;->isEnabled()Z

    move-result v0

    return v0
.end method

.method public final j()V
    .locals 1

    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/Z;->j()V

    return-void
.end method

.method public final k(Lio/sentry/P2;Lio/sentry/Q2;)Lio/sentry/i0;
    .locals 1

    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/sentry/Z;->k(Lio/sentry/P2;Lio/sentry/Q2;)Lio/sentry/i0;

    move-result-object p1

    return-object p1
.end method

.method public final l()Lio/sentry/v2;
    .locals 1

    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/Z;->l()Lio/sentry/v2;

    move-result-object v0

    return-object v0
.end method

.method public final m(Lio/sentry/s1;)V
    .locals 1

    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/Z;->m(Lio/sentry/s1;)V

    return-void
.end method

.method public final o(Lio/sentry/protocol/A;Lio/sentry/N2;Lio/sentry/H;Lio/sentry/h1;)Lio/sentry/protocol/t;
    .locals 1

    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Lio/sentry/Z;->o(Lio/sentry/protocol/A;Lio/sentry/N2;Lio/sentry/H;Lio/sentry/h1;)Lio/sentry/protocol/t;

    move-result-object p1

    return-object p1
.end method

.method public final p(Lio/sentry/x2;Lio/sentry/H;)Lio/sentry/protocol/t;
    .locals 1

    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/sentry/Z;->p(Lio/sentry/x2;Lio/sentry/H;)Lio/sentry/protocol/t;

    move-result-object p1

    return-object p1
.end method

.method public final q(Ljava/lang/String;)Lio/sentry/Z;
    .locals 1

    const-string p1, "getCurrentScopes"

    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/Z;->q(Ljava/lang/String;)Lio/sentry/Z;

    move-result-object p1

    return-object p1
.end method

.method public final r(Lio/sentry/R1;Lio/sentry/H;)Lio/sentry/protocol/t;
    .locals 1

    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/sentry/Z;->r(Lio/sentry/R1;Lio/sentry/H;)Lio/sentry/protocol/t;

    move-result-object p1

    return-object p1
.end method

.method public final s(Lio/sentry/f;)V
    .locals 1

    new-instance v0, Lio/sentry/H;

    invoke-direct {v0}, Lio/sentry/H;-><init>()V

    invoke-virtual {p0, p1, v0}, Lio/sentry/w1;->f(Lio/sentry/f;Lio/sentry/H;)V

    return-void
.end method
