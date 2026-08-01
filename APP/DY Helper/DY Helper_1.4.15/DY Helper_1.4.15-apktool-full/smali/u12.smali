.class public final synthetic Lu12;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:Lum1;

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ls22;

.field public final synthetic θ:Lc4;

.field public final synthetic ι:Lx3;

.field public final synthetic κ:F

.field public final synthetic λ:La80;


# direct methods
.method public synthetic constructor <init>(Lum1;Ljava/lang/Object;Ls22;Lc4;Lx3;FLa80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu12;->ε:Lum1;

    .line 5
    .line 6
    iput-object p2, p0, Lu12;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lu12;->η:Ls22;

    .line 9
    .line 10
    iput-object p4, p0, Lu12;->θ:Lc4;

    .line 11
    .line 12
    iput-object p5, p0, Lu12;->ι:Lx3;

    .line 13
    .line 14
    iput p6, p0, Lu12;->κ:F

    .line 15
    .line 16
    iput-object p7, p0, Lu12;->λ:La80;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

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
    new-instance v0, Lv3;

    .line 8
    .line 9
    iget-object p1, p0, Lu12;->η:Ls22;

    .line 10
    .line 11
    iget-object v3, p1, Ls22;->β:Lg62;

    .line 12
    .line 13
    iget-object v5, p1, Ls22;->γ:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v8, Lv12;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    iget-object v9, p0, Lu12;->ι:Lx3;

    .line 19
    .line 20
    invoke-direct {v8, v9, v3}, Lv12;-><init>(Lx3;I)V

    .line 21
    .line 22
    .line 23
    move-wide v3, v1

    .line 24
    iget-object v1, p0, Lu12;->ζ:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v2, p0, Lu12;->θ:Lc4;

    .line 27
    .line 28
    move-wide v6, v3

    .line 29
    invoke-direct/range {v0 .. v8}, Lv3;-><init>(Ljava/lang/Object;Lc4;JLjava/lang/Object;JLp70;)V

    .line 30
    .line 31
    .line 32
    iget v1, p0, Lu12;->κ:F

    .line 33
    .line 34
    iget-object v6, p0, Lu12;->λ:La80;

    .line 35
    .line 36
    move-wide v10, v3

    .line 37
    move v3, v1

    .line 38
    move-wide v1, v10

    .line 39
    move-object v4, p1

    .line 40
    move-object v5, v9

    .line 41
    invoke-static/range {v0 .. v6}, Lj81;->τ(Lv3;JFLs22;Lx3;La80;)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Lu12;->ε:Lum1;

    .line 45
    .line 46
    iput-object v0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 47
    .line 48
    sget-object p0, Ls62;->α:Ls62;

    .line 49
    .line 50
    return-object p0
.end method
