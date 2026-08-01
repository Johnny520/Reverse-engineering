.class public final synthetic Lyb0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ldc0;


# direct methods
.method public synthetic constructor <init>(Ldc0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyb0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lyb0;->ζ:Ldc0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lyb0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lpt;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Lpt;->β:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object v1, Lec0;->α:Landroid/os/Handler;

    .line 29
    .line 30
    new-instance v2, Le9;

    .line 31
    .line 32
    const/16 v3, 0xf

    .line 33
    .line 34
    iget-object p0, p0, Lyb0;->ζ:Ldc0;

    .line 35
    .line 36
    invoke-direct {v2, p0, p1, v0, v3}, Le9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 40
    .line 41
    .line 42
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_0
    check-cast p1, Lic0;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object p0, p0, Lyb0;->ζ:Ldc0;

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Ldc0;->α(Ljava/util/List;)V

    .line 57
    .line 58
    .line 59
    :goto_1
    sget-object p0, Ls62;->α:Ls62;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_1
    check-cast p1, Ldb0;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance v0, Lp3;

    .line 68
    .line 69
    const/16 v1, 0xd

    .line 70
    .line 71
    iget-object p0, p0, Lyb0;->ζ:Ldc0;

    .line 72
    .line 73
    invoke-direct {v0, p0, v1, p1}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v0}, Ldc0;->β(Lp70;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :pswitch_2
    check-cast p1, Lrb0;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    new-instance v0, Lp3;

    .line 86
    .line 87
    const/16 v1, 0xc

    .line 88
    .line 89
    iget-object p0, p0, Lyb0;->ζ:Ldc0;

    .line 90
    .line 91
    invoke-direct {v0, p0, v1, p1}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v0}, Ldc0;->β(Lp70;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
