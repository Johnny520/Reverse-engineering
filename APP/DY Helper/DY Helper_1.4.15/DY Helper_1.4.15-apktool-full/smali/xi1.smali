.class public final Lxi1;
.super Lο;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lme;
.implements Lqs1;


# instance fields
.field public final θ:Lwc;


# direct methods
.method public constructor <init>(Lup;Lwc;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Lο;-><init>(Lup;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lxi1;->θ:Lwc;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final iterator()Lvc;
    .locals 1

    .line 1
    iget-object p0, p0, Lxi1;->θ:Lwc;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lvc;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lvc;-><init>(Lwc;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final α(Lop;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lxi1;->θ:Lwc;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lqs1;->α(Lop;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ε()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lxi1;->θ:Lwc;

    .line 2
    .line 3
    invoke-virtual {p0}, Lwc;->ε()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final μ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lxi1;->θ:Lwc;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lqs1;->μ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ν(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    .line 1
    sget-object v0, Lfo0;->ε:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Lom;

    .line 8
    .line 9
    if-nez v1, :cond_2

    .line 10
    .line 11
    instance-of v1, v0, Leo0;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast v0, Leo0;

    .line 16
    .line 17
    invoke-virtual {v0}, Leo0;->ε()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-nez p1, :cond_1

    .line 25
    .line 26
    new-instance p1, Lyn0;

    .line 27
    .line 28
    invoke-virtual {p0}, Lο;->υ()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-direct {p1, v0, v1, p0}, Lyn0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lfo0;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {p0, p1}, Lxi1;->σ(Ljava/util/concurrent/CancellationException;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    :goto_0
    return-void
.end method

.method public final σ(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lxi1;->θ:Lwc;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p1, v1}, Lwc;->η(Ljava/lang/Throwable;Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lfo0;->ρ(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final а(Ljava/lang/Throwable;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lxi1;->θ:Lwc;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Lwc;->η(Ljava/lang/Throwable;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lο;->η:Lup;

    .line 13
    .line 14
    invoke-static {p0, p1}, Lbd;->ω(Lup;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final б(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Ls62;

    .line 2
    .line 3
    iget-object p0, p0, Lxi1;->θ:Lwc;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0, p1}, Lwc;->η(Ljava/lang/Throwable;Z)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method
