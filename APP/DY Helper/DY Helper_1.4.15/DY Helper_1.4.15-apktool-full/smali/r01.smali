.class public interface abstract Lr01;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# virtual methods
.method public abstract α(Le80;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public β(Lr01;)Lr01;
    .locals 1

    .line 1
    sget-object v0, Lp01;->α:Lp01;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lvi;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lvi;-><init>(Lr01;Lr01;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public abstract γ(La80;)Z
.end method
