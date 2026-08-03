.class public final Ll5/n;
.super Ll5/a0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lt5/k;
.implements Lt5/d;


# virtual methods
.method public final e()I
    .locals 2

    .line 1
    iget-object v0, p0, Ll5/a0;->a:Lk5/u;

    .line 2
    .line 3
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 4
    .line 5
    iget v1, p0, Ll5/a0;->c:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    iget-object v0, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, [B

    .line 12
    .line 13
    aget-byte v0, v0, v1

    .line 14
    .line 15
    invoke-static {v0}, Ld6/d;->d(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public final h()I
    .locals 2

    .line 1
    iget-object v0, p0, Ll5/a0;->a:Lk5/u;

    .line 2
    .line 3
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 4
    .line 5
    iget v1, p0, Ll5/a0;->c:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    iget-object v0, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, [B

    .line 12
    .line 13
    aget-byte v0, v0, v1

    .line 14
    .line 15
    and-int/lit8 v0, v0, 0xf

    .line 16
    .line 17
    return v0
.end method
