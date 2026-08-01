.class public final synthetic Lri;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:[Lch1;

.field public final synthetic ζ:Lsi;

.field public final synthetic η:I

.field public final synthetic θ:Lrx0;

.field public final synthetic ι:[I


# direct methods
.method public synthetic constructor <init>([Lch1;Lsi;ILrx0;[I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lri;->ε:[Lch1;

    .line 5
    .line 6
    iput-object p2, p0, Lri;->ζ:Lsi;

    .line 7
    .line 8
    iput p3, p0, Lri;->η:I

    .line 9
    .line 10
    iput-object p4, p0, Lri;->θ:Lrx0;

    .line 11
    .line 12
    iput-object p5, p0, Lri;->ι:[I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, Lbh1;

    .line 2
    .line 3
    iget-object v0, p0, Lri;->ε:[Lch1;

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    aget-object v4, v0, v2

    .line 11
    .line 12
    add-int/lit8 v5, v3, 0x1

    .line 13
    .line 14
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v4}, Lch1;->λ()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget-object v6, p0, Lri;->θ:Lrx0;

    .line 21
    .line 22
    invoke-interface {v6}, Lrx0;->getLayoutDirection()Lnp0;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    iget-object v7, p0, Lri;->ζ:Lsi;

    .line 27
    .line 28
    iget-object v7, v7, Lsi;->β:Ly9;

    .line 29
    .line 30
    iget v8, v4, Lch1;->ε:I

    .line 31
    .line 32
    iget v9, p0, Lri;->η:I

    .line 33
    .line 34
    sub-int/2addr v9, v8

    .line 35
    int-to-float v8, v9

    .line 36
    const/high16 v9, 0x40000000    # 2.0f

    .line 37
    .line 38
    div-float/2addr v8, v9

    .line 39
    iget v7, v7, Ly9;->α:F

    .line 40
    .line 41
    sget-object v9, Lnp0;->ε:Lnp0;

    .line 42
    .line 43
    if-ne v6, v9, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    const/4 v6, -0x1

    .line 47
    int-to-float v6, v6

    .line 48
    mul-float/2addr v7, v6

    .line 49
    :goto_1
    const/4 v6, 0x1

    .line 50
    int-to-float v6, v6

    .line 51
    add-float/2addr v6, v7

    .line 52
    mul-float/2addr v6, v8

    .line 53
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    iget-object v7, p0, Lri;->ι:[I

    .line 58
    .line 59
    aget v3, v7, v3

    .line 60
    .line 61
    invoke-static {p1, v4, v6, v3}, Lbh1;->λ(Lbh1;Lch1;II)V

    .line 62
    .line 63
    .line 64
    add-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    move v3, v5

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    sget-object p0, Ls62;->α:Ls62;

    .line 69
    .line 70
    return-object p0
.end method
