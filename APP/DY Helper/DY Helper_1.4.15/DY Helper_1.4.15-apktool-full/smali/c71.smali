.class public final synthetic Lc71;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lum1;

.field public final synthetic η:Lum1;


# direct methods
.method public synthetic constructor <init>(Lum1;Lum1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lc71;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lc71;->ζ:Lum1;

    .line 4
    .line 5
    iput-object p2, p0, Lc71;->η:Lum1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lc71;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc71;->ζ:Lum1;

    .line 7
    .line 8
    iget-object v1, v0, Lum1;->ε:Ljava/lang/Object;

    .line 9
    .line 10
    sget-object v2, Lk71;->ζ:Lk71;

    .line 11
    .line 12
    if-eq v1, v2, :cond_1

    .line 13
    .line 14
    iput-object v2, v0, Lum1;->ε:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object p0, p0, Lc71;->η:Lum1;

    .line 17
    .line 18
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    check-cast p0, La80;

    .line 23
    .line 24
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-interface {p0, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string p0, "renderUi"

    .line 31
    .line 32
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    throw p0

    .line 37
    :cond_1
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_0
    iget-object v0, p0, Lc71;->ζ:Lum1;

    .line 41
    .line 42
    iget-object v1, v0, Lum1;->ε:Ljava/lang/Object;

    .line 43
    .line 44
    sget-object v2, Lk71;->ε:Lk71;

    .line 45
    .line 46
    if-eq v1, v2, :cond_3

    .line 47
    .line 48
    iput-object v2, v0, Lum1;->ε:Ljava/lang/Object;

    .line 49
    .line 50
    iget-object p0, p0, Lc71;->η:Lum1;

    .line 51
    .line 52
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 53
    .line 54
    if-eqz p0, :cond_2

    .line 55
    .line 56
    check-cast p0, La80;

    .line 57
    .line 58
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-interface {p0, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    const-string p0, "renderUi"

    .line 65
    .line 66
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x0

    .line 70
    throw p0

    .line 71
    :cond_3
    :goto_1
    sget-object p0, Ls62;->α:Ls62;

    .line 72
    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
