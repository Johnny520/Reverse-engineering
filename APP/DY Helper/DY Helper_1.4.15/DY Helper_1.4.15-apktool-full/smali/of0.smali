.class public abstract Lof0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lrx1;


# instance fields
.field public final ε:Log0;

.field public final ζ:Lj60;

.field public η:Z

.field public final synthetic θ:Luf0;


# direct methods
.method public constructor <init>(Luf0;Log0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lof0;->θ:Luf0;

    .line 8
    .line 9
    iput-object p2, p0, Lof0;->ε:Log0;

    .line 10
    .line 11
    new-instance p2, Lj60;

    .line 12
    .line 13
    iget-object p1, p1, Luf0;->γ:Lm6;

    .line 14
    .line 15
    iget-object p1, p1, Lm6;->η:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Lrk1;

    .line 18
    .line 19
    iget-object p1, p1, Lrk1;->ε:Lrx1;

    .line 20
    .line 21
    invoke-interface {p1}, Lrx1;->α()Lm42;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {p2, p1}, Lj60;-><init>(Lm42;)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, Lof0;->ζ:Lj60;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final α()Lm42;
    .locals 0

    .line 1
    iget-object p0, p0, Lof0;->ζ:Lj60;

    .line 2
    .line 3
    return-object p0
.end method

.method public β(JLsc;)J
    .locals 2

    .line 1
    iget-object v0, p0, Lof0;->θ:Luf0;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, v0, Luf0;->γ:Lm6;

    .line 7
    .line 8
    iget-object v1, v1, Lm6;->η:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lrk1;

    .line 11
    .line 12
    invoke-virtual {v1, p1, p2, p3}, Lrk1;->β(JLsc;)J

    .line 13
    .line 14
    .line 15
    move-result-wide p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-wide p0

    .line 17
    :catch_0
    move-exception p1

    .line 18
    iget-object p2, v0, Luf0;->β:La00;

    .line 19
    .line 20
    invoke-interface {p2}, La00;->θ()V

    .line 21
    .line 22
    .line 23
    sget-object p2, Luf0;->ζ:Lvc0;

    .line 24
    .line 25
    invoke-virtual {p0, p2}, Lof0;->δ(Lvc0;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method

.method public final δ(Lvc0;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lof0;->θ:Luf0;

    .line 5
    .line 6
    iget v1, v0, Luf0;->δ:I

    .line 7
    .line 8
    const/4 v2, 0x6

    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v3, 0x5

    .line 13
    if-ne v1, v3, :cond_2

    .line 14
    .line 15
    iget-object v1, p0, Lof0;->ζ:Lj60;

    .line 16
    .line 17
    iget-object v3, v1, Lj60;->ε:Lm42;

    .line 18
    .line 19
    sget-object v4, Lm42;->δ:Ll42;

    .line 20
    .line 21
    iput-object v4, v1, Lj60;->ε:Lm42;

    .line 22
    .line 23
    invoke-virtual {v3}, Lm42;->α()Lm42;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Lm42;->β()Lm42;

    .line 27
    .line 28
    .line 29
    iput v2, v0, Luf0;->δ:I

    .line 30
    .line 31
    invoke-virtual {p1}, Lvc0;->size()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-lez v1, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, Luf0;->α:Lt41;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    iget-object v0, v0, Lt41;->κ:Lx;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget-object p0, p0, Lof0;->ε:Log0;

    .line 46
    .line 47
    invoke-static {v0, p0, p1}, Lmg0;->β(Lx;Log0;Lvc0;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    return-void

    .line 51
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    iget p1, v0, Luf0;->δ:I

    .line 54
    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v1, "state: "

    .line 58
    .line 59
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p0
.end method
