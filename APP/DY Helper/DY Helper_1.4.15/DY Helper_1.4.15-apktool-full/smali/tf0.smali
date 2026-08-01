.class public final Ltf0;
.super Lof0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public ι:Z


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lof0;->η:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v0, p0, Ltf0;->ι:Z

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    sget-object v0, Luf0;->ζ:Lvc0;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lof0;->δ(Lvc0;)V

    .line 13
    .line 14
    .line 15
    :cond_1
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lof0;->η:Z

    .line 17
    .line 18
    return-void
.end method

.method public final β(JLsc;)J
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lof0;->η:Z

    .line 5
    .line 6
    if-nez p1, :cond_2

    .line 7
    .line 8
    iget-boolean p1, p0, Ltf0;->ι:Z

    .line 9
    .line 10
    const-wide/16 v0, -0x1

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    return-wide v0

    .line 15
    :cond_0
    const-wide/16 p1, 0x2000

    .line 16
    .line 17
    invoke-super {p0, p1, p2, p3}, Lof0;->β(JLsc;)J

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    cmp-long p3, p1, v0

    .line 22
    .line 23
    if-nez p3, :cond_1

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    iput-boolean p1, p0, Ltf0;->ι:Z

    .line 27
    .line 28
    sget-object p1, Lvc0;->ζ:Lvc0;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lof0;->δ(Lvc0;)V

    .line 31
    .line 32
    .line 33
    return-wide v0

    .line 34
    :cond_1
    return-wide p1

    .line 35
    :cond_2
    const-string p0, "closed"

    .line 36
    .line 37
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-wide/16 p0, 0x0

    .line 41
    .line 42
    return-wide p0
.end method
