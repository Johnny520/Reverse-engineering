.class public final Lg/y;
.super Lg/v;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lk/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lg/v;-><init>(Lk/p;)V

    return-void
.end method


# virtual methods
.method public final a(Lg/k;)V
    .locals 1

    invoke-super {p0, p1}, Lg/v;->a(Lg/k;)V

    invoke-virtual {p1}, Lg/k;->n()Lg/x;

    move-result-object p1

    invoke-virtual {p0}, Lg/v;->j()Lk/p;

    move-result-object v0

    check-cast v0, Lk/d;

    invoke-virtual {v0}, Lk/d;->j()Ll/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lg/x;->w(Ll/a;)V

    return-void
.end method

.method public final b()Lg/t;
    .locals 1

    sget-object v0, Lg/t;->h:Lg/t;

    return-object v0
.end method

.method protected final k(Lg/k;)I
    .locals 1

    invoke-virtual {p1}, Lg/k;->n()Lg/x;

    move-result-object p1

    invoke-virtual {p0}, Lg/v;->j()Lk/p;

    move-result-object v0

    check-cast v0, Lk/d;

    invoke-virtual {v0}, Lk/d;->j()Ll/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lg/x;->s(Ll/a;)I

    move-result p1

    return p1
.end method

.method protected final l()Ljava/lang/String;
    .locals 1

    const-string v0, "proto_idx"

    return-object v0
.end method
