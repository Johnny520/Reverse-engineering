.class public final Lnq0;
.super Lq01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ly91;


# instance fields
.field public τ:F

.field public υ:Z


# virtual methods
.method public final л(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Lep1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lep1;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    new-instance p1, Lep1;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput v0, p1, Lep1;->α:F

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p1, Lep1;->β:Z

    .line 21
    .line 22
    :cond_1
    iget v0, p0, Lnq0;->τ:F

    .line 23
    .line 24
    iput v0, p1, Lep1;->α:F

    .line 25
    .line 26
    iget-boolean p0, p0, Lnq0;->υ:Z

    .line 27
    .line 28
    iput-boolean p0, p1, Lep1;->β:Z

    .line 29
    .line 30
    return-object p1
.end method
