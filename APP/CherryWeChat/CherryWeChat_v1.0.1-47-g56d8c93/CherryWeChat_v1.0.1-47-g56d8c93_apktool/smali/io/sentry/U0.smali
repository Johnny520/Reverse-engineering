.class public final Lio/sentry/U0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/g0;


# static fields
.field public static final a:Lio/sentry/U0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/U0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/sentry/U0;->a:Lio/sentry/U0;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final e(Ljava/lang/String;Lio/sentry/H1;Lio/sentry/n0;)Lio/sentry/g0;
    .locals 0

    sget-object p1, Lio/sentry/U0;->a:Lio/sentry/U0;

    return-object p1
.end method

.method public final f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final j(Ljava/lang/Number;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final l(Ljava/lang/String;Ljava/lang/Long;Lio/sentry/G0;)V
    .locals 0

    return-void
.end method

.method public final m()Lio/sentry/H2;
    .locals 5

    new-instance v0, Lio/sentry/H2;

    sget-object v1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    sget-object v2, Lio/sentry/K2;->b:Lio/sentry/K2;

    const-string v3, "op"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lio/sentry/H2;-><init>(Lio/sentry/protocol/t;Lio/sentry/K2;Ljava/lang/String;Lio/sentry/K2;)V

    return-object v0
.end method

.method public final n(Lio/sentry/L2;)V
    .locals 0

    return-void
.end method

.method public final o()Lio/sentry/L2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final p()Lio/sentry/H1;
    .locals 1

    new-instance v0, Lio/sentry/g2;

    invoke-direct {v0}, Lio/sentry/g2;-><init>()V

    return-object v0
.end method

.method public final q(Lio/sentry/L2;Lio/sentry/H1;)V
    .locals 0

    return-void
.end method

.method public final r()V
    .locals 0

    return-void
.end method

.method public final u()Lio/sentry/H1;
    .locals 1

    new-instance v0, Lio/sentry/g2;

    invoke-direct {v0}, Lio/sentry/g2;-><init>()V

    return-object v0
.end method
