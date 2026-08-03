.class public final Lwm;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LCx;


# instance fields
.field public final a:LcA;


# direct methods
.method public constructor <init>(LUi;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LcA;

    invoke-direct {v0, p1}, LcA;-><init>(LUi;)V

    iput-object v0, p0, Lwm;->a:LcA;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)I
    .locals 1

    invoke-virtual {p0}, Lwm;->g()LCx;

    move-result-object v0

    invoke-interface {v0, p1}, LCx;->a(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lwm;->g()LCx;

    move-result-object v0

    invoke-interface {v0}, LCx;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()LfG;
    .locals 1

    invoke-virtual {p0}, Lwm;->g()LCx;

    move-result-object v0

    invoke-interface {v0}, LCx;->c()LfG;

    move-result-object v0

    return-object v0
.end method

.method public final d()I
    .locals 1

    invoke-virtual {p0}, Lwm;->g()LCx;

    move-result-object v0

    invoke-interface {v0}, LCx;->d()I

    move-result v0

    return v0
.end method

.method public final e(I)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lwm;->g()LCx;

    move-result-object v0

    invoke-interface {v0, p1}, LCx;->e(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final g()LCx;
    .locals 1

    iget-object v0, p0, Lwm;->a:LcA;

    invoke-virtual {v0}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCx;

    return-object v0
.end method

.method public final h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final i(I)Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Lwm;->g()LCx;

    move-result-object v0

    invoke-interface {v0, p1}, LCx;->i(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final j(I)LCx;
    .locals 1

    invoke-virtual {p0}, Lwm;->g()LCx;

    move-result-object v0

    invoke-interface {v0, p1}, LCx;->j(I)LCx;

    move-result-object p1

    return-object p1
.end method

.method public final k(I)Z
    .locals 1

    invoke-virtual {p0}, Lwm;->g()LCx;

    move-result-object v0

    invoke-interface {v0, p1}, LCx;->k(I)Z

    move-result p1

    return p1
.end method
