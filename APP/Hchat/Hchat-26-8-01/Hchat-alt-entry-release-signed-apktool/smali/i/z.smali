.class public interface abstract Li/z;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li/k;


# virtual methods
.method public a(Li/m1;)Li/n1;
    .locals 0

    .line 1
    new-instance p1, Lhb/c;

    .line 2
    .line 3
    invoke-direct {p1, p0}, Lhb/c;-><init>(Li/z;)V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public abstract b(FFF)J
.end method

.method public abstract c(FFFJ)F
.end method

.method public d(FFF)F
    .locals 6

    .line 1
    invoke-interface {p0, p1, p2, p3}, Li/z;->b(FFF)J

    .line 2
    .line 3
    .line 4
    move-result-wide v4

    .line 5
    move-object v0, p0

    .line 6
    move v1, p1

    .line 7
    move v2, p2

    .line 8
    move v3, p3

    .line 9
    invoke-interface/range {v0 .. v5}, Li/z;->c(FFFJ)F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public abstract e(FFFJ)F
.end method
