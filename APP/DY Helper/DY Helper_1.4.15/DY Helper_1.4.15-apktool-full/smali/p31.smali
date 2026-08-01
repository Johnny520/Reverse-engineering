.class public final Lp31;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:Lq31;

.field public final synthetic ζ:Lq01;

.field public final synthetic η:Lm31;

.field public final synthetic θ:J

.field public final synthetic ι:Lne0;

.field public final synthetic κ:I

.field public final synthetic λ:Z

.field public final synthetic μ:F


# direct methods
.method public constructor <init>(Lq31;Lq01;Lm31;JLne0;IZF)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp31;->ε:Lq31;

    .line 2
    .line 3
    iput-object p2, p0, Lp31;->ζ:Lq01;

    .line 4
    .line 5
    iput-object p3, p0, Lp31;->η:Lm31;

    .line 6
    .line 7
    iput-wide p4, p0, Lp31;->θ:J

    .line 8
    .line 9
    iput-object p6, p0, Lp31;->ι:Lne0;

    .line 10
    .line 11
    iput p7, p0, Lp31;->κ:I

    .line 12
    .line 13
    iput-boolean p8, p0, Lp31;->λ:Z

    .line 14
    .line 15
    iput p9, p0, Lp31;->μ:F

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lp31;->η:Lm31;

    .line 2
    .line 3
    invoke-interface {v0}, Lm31;->β()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lp31;->ζ:Lq01;

    .line 8
    .line 9
    invoke-static {v1, v0}, Lkn0;->η(Lur;I)Lq01;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget v10, p0, Lp31;->μ:F

    .line 14
    .line 15
    const/4 v11, 0x0

    .line 16
    iget-object v2, p0, Lp31;->ε:Lq31;

    .line 17
    .line 18
    iget-object v4, p0, Lp31;->η:Lm31;

    .line 19
    .line 20
    iget-wide v5, p0, Lp31;->θ:J

    .line 21
    .line 22
    iget-object v7, p0, Lp31;->ι:Lne0;

    .line 23
    .line 24
    iget v8, p0, Lp31;->κ:I

    .line 25
    .line 26
    iget-boolean v9, p0, Lp31;->λ:Z

    .line 27
    .line 28
    invoke-virtual/range {v2 .. v11}, Lq31;->ｈ(Lq01;Lm31;JLne0;IZFZ)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Ls62;->α:Ls62;

    .line 32
    .line 33
    return-object p0
.end method
