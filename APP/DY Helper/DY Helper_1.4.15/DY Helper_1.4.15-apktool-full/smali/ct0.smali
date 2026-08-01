.class public final synthetic Lct0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lps0;

.field public final synthetic η:La80;

.field public final synthetic θ:La80;

.field public final synthetic ι:Lg21;

.field public final synthetic κ:Lg21;

.field public final synthetic λ:Lg21;


# direct methods
.method public synthetic constructor <init>(Lps0;La80;La80;Lg21;Lg21;Lg21;I)V
    .locals 0

    .line 1
    iput p7, p0, Lct0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lct0;->ζ:Lps0;

    .line 4
    .line 5
    iput-object p2, p0, Lct0;->η:La80;

    .line 6
    .line 7
    iput-object p3, p0, Lct0;->θ:La80;

    .line 8
    .line 9
    iput-object p4, p0, Lct0;->ι:Lg21;

    .line 10
    .line 11
    iput-object p5, p0, Lct0;->κ:Lg21;

    .line 12
    .line 13
    iput-object p6, p0, Lct0;->λ:Lg21;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lct0;->ε:I

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    check-cast p2, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lct0;->ζ:Lps0;

    .line 19
    .line 20
    iget-object v0, v0, Lps0;->α:Ljava/util/List;

    .line 21
    .line 22
    invoke-static {p1, v0}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lxt0;

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object p1, p1, Lxt0;->α:Ljava/lang/String;

    .line 31
    .line 32
    if-eqz p2, :cond_0

    .line 33
    .line 34
    iget-object p2, p0, Lct0;->η:La80;

    .line 35
    .line 36
    invoke-interface {p2, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object p2, p0, Lct0;->θ:La80;

    .line 41
    .line 42
    invoke-interface {p2, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_1
    :goto_0
    iget-object p1, p0, Lct0;->ι:Lg21;

    .line 46
    .line 47
    const/4 p2, 0x0

    .line 48
    invoke-interface {p1, p2}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lct0;->κ:Lg21;

    .line 52
    .line 53
    invoke-interface {p1, p2}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, Lct0;->λ:Lg21;

    .line 57
    .line 58
    invoke-interface {p0, p2}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :goto_1
    sget-object p0, Ls62;->α:Ls62;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_0
    iget-object v0, p0, Lct0;->ζ:Lps0;

    .line 65
    .line 66
    iget-object v0, v0, Lps0;->α:Ljava/util/List;

    .line 67
    .line 68
    invoke-static {p1, v0}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Lxt0;

    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    iget-object p1, p1, Lxt0;->α:Ljava/lang/String;

    .line 77
    .line 78
    if-eqz p2, :cond_2

    .line 79
    .line 80
    iget-object p2, p0, Lct0;->η:La80;

    .line 81
    .line 82
    invoke-interface {p2, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    iget-object p2, p0, Lct0;->θ:La80;

    .line 87
    .line 88
    invoke-interface {p2, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    :cond_3
    :goto_2
    iget-object p1, p0, Lct0;->ι:Lg21;

    .line 92
    .line 93
    const/4 p2, 0x0

    .line 94
    invoke-interface {p1, p2}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-object p1, p0, Lct0;->κ:Lg21;

    .line 98
    .line 99
    invoke-interface {p1, p2}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget-object p0, p0, Lct0;->λ:Lg21;

    .line 103
    .line 104
    invoke-interface {p0, p2}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
