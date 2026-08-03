.class public final Lp7/b;
.super Lp7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static T(Lq7/b;)Lp7/b;
    .locals 3

    .line 1
    new-instance v0, Lp7/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lp7/a;-><init>(S)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lq7/b;->available()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/16 v2, 0x8

    .line 12
    .line 13
    if-ge v1, v2, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_0
    iget v1, p0, Lq7/b;->k:I

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Lk7/a;->G(Lq7/b;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lq7/b;->g(I)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method


# virtual methods
.method public final R(Lr7/c;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final p()I
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    return v0
.end method
