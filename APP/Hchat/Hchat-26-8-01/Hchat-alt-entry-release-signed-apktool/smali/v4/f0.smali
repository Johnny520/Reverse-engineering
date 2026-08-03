.class public abstract Lv4/f0;
.super Lv4/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lw4/d;


# virtual methods
.method public final b()I
    .locals 1

    .line 1
    invoke-interface {p0}, Lw4/d;->getType()Lw4/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Lw4/c;->h:I

    .line 6
    .line 7
    return v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final f()I
    .locals 1

    .line 1
    invoke-interface {p0}, Lw4/d;->getType()Lw4/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lw4/c;->f()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final g()Lw4/d;
    .locals 0

    .line 1
    return-object p0
.end method
