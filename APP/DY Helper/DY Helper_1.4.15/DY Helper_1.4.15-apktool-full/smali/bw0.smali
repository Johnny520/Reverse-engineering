.class public final Lbw0;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:Ldw0;

.field public final synthetic ζ:J

.field public final synthetic η:J

.field public final synthetic θ:Leh1;


# direct methods
.method public constructor <init>(Ldw0;JJLeh1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbw0;->ε:Ldw0;

    .line 2
    .line 3
    iput-wide p2, p0, Lbw0;->ζ:J

    .line 4
    .line 5
    iput-wide p4, p0, Lbw0;->η:J

    .line 6
    .line 7
    iput-object p6, p0, Lbw0;->θ:Leh1;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lbw0;->ε:Ldw0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldw0;->Е()Law0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    iput-boolean v2, v1, Law0;->ε:Z

    .line 9
    .line 10
    invoke-virtual {v0}, Ldw0;->Е()Law0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-wide v2, p0, Lbw0;->ζ:J

    .line 15
    .line 16
    iput-wide v2, v1, Law0;->ζ:J

    .line 17
    .line 18
    invoke-virtual {v0}, Ldw0;->Е()Law0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-wide v2, p0, Lbw0;->η:J

    .line 23
    .line 24
    iput-wide v2, v1, Law0;->η:J

    .line 25
    .line 26
    iget-object p0, p0, Lbw0;->θ:Leh1;

    .line 27
    .line 28
    iget-object p0, p0, Leh1;->ε:Lqx0;

    .line 29
    .line 30
    invoke-interface {p0}, Lqx0;->δ()La80;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Ldw0;->Е()Law0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {p0, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_0
    sget-object p0, Ls62;->α:Ls62;

    .line 44
    .line 45
    return-object p0
.end method
