.class public final synthetic Lw12;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:Lum1;

.field public final synthetic ζ:F

.field public final synthetic η:Ls22;

.field public final synthetic θ:Lx3;

.field public final synthetic ι:La80;


# direct methods
.method public synthetic constructor <init>(Lum1;FLs22;Lx3;La80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw12;->ε:Lum1;

    .line 5
    .line 6
    iput p2, p0, Lw12;->ζ:F

    .line 7
    .line 8
    iput-object p3, p0, Lw12;->η:Ls22;

    .line 9
    .line 10
    iput-object p4, p0, Lw12;->θ:Lx3;

    .line 11
    .line 12
    iput-object p5, p0, Lw12;->ι:La80;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Ljava/lang/Long;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    iget-object p1, p0, Lw12;->ε:Lum1;

    .line 8
    .line 9
    iget-object p1, p1, Lum1;->ε:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Lv3;

    .line 16
    .line 17
    iget v3, p0, Lw12;->ζ:F

    .line 18
    .line 19
    iget-object v4, p0, Lw12;->η:Ls22;

    .line 20
    .line 21
    iget-object v5, p0, Lw12;->θ:Lx3;

    .line 22
    .line 23
    iget-object v6, p0, Lw12;->ι:La80;

    .line 24
    .line 25
    invoke-static/range {v0 .. v6}, Lj81;->τ(Lv3;JFLs22;Lx3;La80;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Ls62;->α:Ls62;

    .line 29
    .line 30
    return-object p0
.end method
