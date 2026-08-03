.class public interface abstract Li/n1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b(Li/q;Li/q;Li/q;)J
.end method

.method public g(Li/q;Li/q;Li/q;)Li/q;
    .locals 6

    .line 1
    invoke-interface {p0, p1, p2, p3}, Li/n1;->b(Li/q;Li/q;Li/q;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v1

    .line 5
    move-object v0, p0

    .line 6
    move-object v3, p1

    .line 7
    move-object v4, p2

    .line 8
    move-object v5, p3

    .line 9
    invoke-interface/range {v0 .. v5}, Li/n1;->n(JLi/q;Li/q;Li/q;)Li/q;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public abstract n(JLi/q;Li/q;Li/q;)Li/q;
.end method

.method public abstract w(JLi/q;Li/q;Li/q;)Li/q;
.end method
