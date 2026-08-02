.class public final Luy2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lry2;


# instance fields
.field public final h:J

.field public final synthetic i:Lvy2;


# direct methods
.method public constructor <init>(Lvy2;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Luy2;->i:Lvy2;

    .line 5
    .line 6
    iput-wide p2, p0, Luy2;->h:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final h(Lc61;)J
    .locals 3

    .line 1
    iget-object v0, p0, Luy2;->i:Lvy2;

    .line 2
    .line 3
    iget-object v0, v0, Lvy2;->y:Lnx1;

    .line 4
    .line 5
    invoke-virtual {v0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lc61;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-wide v1, p0, Luy2;->h:J

    .line 14
    .line 15
    invoke-interface {p1, v0, v1, v2}, Lc61;->r(Lc61;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide p0

    .line 19
    return-wide p0

    .line 20
    :cond_0
    const-string p0, "Tried to open context menu before the anchor was placed."

    .line 21
    .line 22
    invoke-static {p0}, Lnz0;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Ls;->b()V

    .line 26
    .line 27
    .line 28
    const-wide/16 p0, 0x0

    .line 29
    .line 30
    return-wide p0
.end method

.method public final n(Lc61;)Lo62;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Luy2;->h(Lc61;)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    invoke-static {p0, p1, v0, v1}, Leu;->q(JJ)Lo62;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final v0()Lqy2;
    .locals 0

    .line 1
    iget-object p0, p0, Luy2;->i:Lvy2;

    .line 2
    .line 3
    invoke-static {p0}, Lpp0;->o(Lt60;)Lqy2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
