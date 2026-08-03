.class public final Lp4/s;
.super Lp4/l;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public constructor <init>(Lu4/t;)V
    .locals 1

    .line 1
    sget-object v0, Lu4/p;->i:Lu4/p;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lp4/l;-><init>(Lu4/t;Lu4/p;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final b()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lp4/h;->e()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    return v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lp4/s;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    const-string v0, "nop // spacer"

    .line 10
    .line 11
    return-object v0
.end method

.method public final k(Lu4/p;)Lp4/h;
    .locals 1

    .line 1
    new-instance p1, Lp4/s;

    .line 2
    .line 3
    iget-object v0, p0, Lp4/h;->c:Lu4/t;

    .line 4
    .line 5
    invoke-direct {p1, v0}, Lp4/s;-><init>(Lu4/t;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final l(Lz4/d;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lp4/s;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {v0, v0}, Lf8/i;->k(II)S

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1, v0}, Lz4/d;->l(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
