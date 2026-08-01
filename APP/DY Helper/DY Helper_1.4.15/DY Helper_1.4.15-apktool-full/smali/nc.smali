.class public final Lnc;
.super La8;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:Lae;

.field public β:La80;


# virtual methods
.method public final α()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lnc;->β:La80;

    .line 3
    .line 4
    iput-object v0, p0, Lnc;->α:Lae;

    .line 5
    .line 6
    return-void
.end method

.method public final β(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnc;->α:Lae;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Li81;->κ(Ljava/lang/Throwable;)Leo1;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lae;->ζ(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
