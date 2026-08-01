.class public interface abstract Lp92;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# virtual methods
.method public α(Ljava/lang/Class;)Lm92;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public β(Ljava/lang/Class;Lk11;)Lm92;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lp92;->α(Ljava/lang/Class;)Lm92;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public γ(Lwf;Lk11;)Lm92;
    .locals 0

    .line 1
    invoke-static {p1}, Lln0;->Λ(Lwf;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1, p2}, Lp92;->β(Ljava/lang/Class;Lk11;)Lm92;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
