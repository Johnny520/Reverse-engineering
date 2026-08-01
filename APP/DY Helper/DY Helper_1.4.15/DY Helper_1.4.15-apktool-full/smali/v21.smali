.class public final Lv21;
.super Ltw1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final ε:La80;

.field public final ζ:Ltw1;


# direct methods
.method public constructor <init>(JLyw1;La80;Ltw1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ltw1;-><init>(JLyw1;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lv21;->ε:La80;

    .line 5
    .line 6
    iput-object p5, p0, Lv21;->ζ:Ltw1;

    .line 7
    .line 8
    invoke-virtual {p5}, Ltw1;->λ()V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final γ()V
    .locals 5

    .line 1
    iget-object v0, p0, Lv21;->ζ:Ltw1;

    .line 2
    .line 3
    iget-boolean v1, p0, Ltw1;->γ:Z

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    iget-wide v1, p0, Ltw1;->β:J

    .line 8
    .line 9
    invoke-virtual {v0}, Ltw1;->η()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    cmp-long v1, v1, v3

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ltw1;->α()V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Ltw1;->μ()V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Ltw1;->γ:Z

    .line 25
    .line 26
    sget-object v0, Lax1;->γ:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v0

    .line 29
    :try_start_0
    invoke-virtual {p0}, Ltw1;->ο()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    monitor-exit v0

    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    monitor-exit v0

    .line 36
    throw p0

    .line 37
    :cond_1
    return-void
.end method

.method public final ε()La80;
    .locals 0

    .line 1
    iget-object p0, p0, Lv21;->ε:La80;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ζ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final ι()La80;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final λ()V
    .locals 0

    .line 1
    invoke-static {}, Lu81;->τ()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final μ()V
    .locals 0

    .line 1
    invoke-static {}, Lu81;->τ()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final ν()V
    .locals 0

    .line 1
    return-void
.end method

.method public final ξ(Li02;)V
    .locals 0

    .line 1
    sget-object p0, Lax1;->α:Leu1;

    .line 2
    .line 3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 4
    .line 5
    const-string p1, "Cannot modify a state object in a read-only snapshot"

    .line 6
    .line 7
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    throw p0
.end method

.method public final φ(La80;)Ltw1;
    .locals 6

    .line 1
    new-instance v0, Lv21;

    .line 2
    .line 3
    iget-wide v1, p0, Ltw1;->β:J

    .line 4
    .line 5
    iget-object v3, p0, Ltw1;->α:Lyw1;

    .line 6
    .line 7
    iget-object v4, p0, Lv21;->ε:La80;

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    invoke-static {p1, v4, v5}, Lax1;->λ(La80;La80;Z)La80;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    iget-object v5, p0, Lv21;->ζ:Ltw1;

    .line 15
    .line 16
    invoke-direct/range {v0 .. v5}, Lv21;-><init>(JLyw1;La80;Ltw1;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method
