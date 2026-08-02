.class public interface abstract Lx93;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b(Lnd;Lnd;Lnd;)J
.end method

.method public abstract q(JLnd;Lnd;Lnd;)Lnd;
.end method

.method public abstract s(JLnd;Lnd;Lnd;)Lnd;
.end method

.method public t(Lnd;Lnd;Lnd;)Lnd;
    .locals 6

    .line 1
    invoke-interface {p0, p1, p2, p3}, Lx93;->b(Lnd;Lnd;Lnd;)J

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
    invoke-interface/range {v0 .. v5}, Lx93;->q(JLnd;Lnd;Lnd;)Lnd;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
