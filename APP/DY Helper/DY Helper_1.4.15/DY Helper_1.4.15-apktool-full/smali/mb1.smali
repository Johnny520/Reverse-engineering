.class public final synthetic Lmb1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p3, p0, Lmb1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lmb1;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p2, p0, Lmb1;->η:Landroid/view/View;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lmb1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lgc1;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lmb1;->ζ:Landroid/app/Activity;

    .line 12
    .line 13
    iget-object p0, p0, Lmb1;->η:Landroid/view/View;

    .line 14
    .line 15
    invoke-static {v0, p0, p1}, Lxn0;->П(Landroid/app/Activity;Landroid/view/View;Lgc1;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Ls62;->α:Ls62;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    check-cast p1, Ldc1;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lmb1;->ζ:Landroid/app/Activity;

    .line 27
    .line 28
    iget-object p0, p0, Lmb1;->η:Landroid/view/View;

    .line 29
    .line 30
    invoke-static {v0, p0, p1}, Lxn0;->Ξ(Landroid/app/Activity;Landroid/view/View;Ldc1;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {p1}, Ldc1;->α()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {v0, p0, p1}, Lxn0;->т(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    sget-object p0, Ls62;->α:Ls62;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_1
    check-cast p1, Lgc1;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    iget-object v1, p0, Lmb1;->ζ:Landroid/app/Activity;

    .line 53
    .line 54
    iget-object p0, p0, Lmb1;->η:Landroid/view/View;

    .line 55
    .line 56
    invoke-static {v1, p0, v0}, Lxn0;->З(Landroid/app/Activity;Landroid/view/View;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    invoke-static {v1, p0, p1}, Lxn0;->П(Landroid/app/Activity;Landroid/view/View;Lgc1;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    sget-object p0, Ls62;->α:Ls62;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_2
    check-cast p1, Lgc1;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    iget-object v1, p0, Lmb1;->ζ:Landroid/app/Activity;

    .line 75
    .line 76
    iget-object p0, p0, Lmb1;->η:Landroid/view/View;

    .line 77
    .line 78
    invoke-static {v1, p0, v0}, Lxn0;->З(Landroid/app/Activity;Landroid/view/View;Z)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_2

    .line 83
    .line 84
    invoke-static {v1, p0, p1}, Lxn0;->П(Landroid/app/Activity;Landroid/view/View;Lgc1;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    sget-object p0, Ls62;->α:Ls62;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_3
    check-cast p1, Ldc1;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lmb1;->ζ:Landroid/app/Activity;

    .line 96
    .line 97
    iget-object p0, p0, Lmb1;->η:Landroid/view/View;

    .line 98
    .line 99
    invoke-static {v0, p0, p1}, Lxn0;->Ξ(Landroid/app/Activity;Landroid/view/View;Ldc1;)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_3

    .line 104
    .line 105
    invoke-virtual {p1}, Ldc1;->α()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-static {v0, p0, p1}, Lxn0;->т(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    :cond_3
    sget-object p0, Ls62;->α:Ls62;

    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
