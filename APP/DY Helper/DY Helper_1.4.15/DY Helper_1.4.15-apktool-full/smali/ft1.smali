.class public final synthetic Lft1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lqm1;

.field public final synthetic η:Lqm1;

.field public final synthetic θ:Landroid/widget/LinearLayout;

.field public final synthetic ι:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lqm1;Lqm1;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;)V
    .locals 1

    .line 16
    const/4 v0, 0x1

    iput v0, p0, Lft1;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lft1;->ζ:Lqm1;

    iput-object p2, p0, Lft1;->η:Lqm1;

    iput-object p3, p0, Lft1;->θ:Landroid/widget/LinearLayout;

    iput-object p4, p0, Lft1;->ι:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lqm1;Lqm1;Lum1;Landroid/widget/LinearLayout;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lft1;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lft1;->ζ:Lqm1;

    .line 8
    .line 9
    iput-object p2, p0, Lft1;->η:Lqm1;

    .line 10
    .line 11
    iput-object p3, p0, Lft1;->ι:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lft1;->θ:Landroid/widget/LinearLayout;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lft1;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    const-string v3, "info_bar_neon_enabled"

    .line 8
    .line 9
    const-string v4, "info_bar_neon_solid_enabled"

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    iget-object v6, p0, Lft1;->ι:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v7, p0, Lft1;->θ:Landroid/widget/LinearLayout;

    .line 15
    .line 16
    iget-object v8, p0, Lft1;->η:Lqm1;

    .line 17
    .line 18
    iget-object p0, p0, Lft1;->ζ:Lqm1;

    .line 19
    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast v6, Landroid/widget/LinearLayout;

    .line 24
    .line 25
    check-cast p1, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    check-cast p2, Landroid/widget/Switch;

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iput-boolean p1, p0, Lqm1;->ε:Z

    .line 37
    .line 38
    sget-object p2, Lbv1;->α:Lbv1;

    .line 39
    .line 40
    invoke-static {v4, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    iput-boolean v5, v8, Lqm1;->ε:Z

    .line 46
    .line 47
    invoke-static {v3, v5}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    invoke-virtual {v7, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    instance-of p2, p1, Landroid/widget/Switch;

    .line 56
    .line 57
    if-eqz p2, :cond_0

    .line 58
    .line 59
    check-cast p1, Landroid/widget/Switch;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const/4 p1, 0x0

    .line 63
    :goto_0
    if-eqz p1, :cond_1

    .line 64
    .line 65
    invoke-virtual {p1, v5}, Landroid/widget/Switch;->setChecked(Z)V

    .line 66
    .line 67
    .line 68
    :cond_1
    iget-boolean p1, v8, Lqm1;->ε:Z

    .line 69
    .line 70
    if-nez p1, :cond_3

    .line 71
    .line 72
    iget-boolean p0, p0, Lqm1;->ε:Z

    .line 73
    .line 74
    if-eqz p0, :cond_2

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    move v2, v5

    .line 78
    :cond_3
    :goto_1
    invoke-virtual {v6, v2}, Landroid/view/View;->setVisibility(I)V

    .line 79
    .line 80
    .line 81
    return-object v1

    .line 82
    :pswitch_0
    check-cast v6, Lum1;

    .line 83
    .line 84
    check-cast p1, Ljava/lang/Boolean;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    check-cast p2, Landroid/widget/Switch;

    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iput-boolean p1, p0, Lqm1;->ε:Z

    .line 96
    .line 97
    sget-object p2, Lbv1;->α:Lbv1;

    .line 98
    .line 99
    invoke-static {v3, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 100
    .line 101
    .line 102
    if-eqz p1, :cond_4

    .line 103
    .line 104
    iput-boolean v5, v8, Lqm1;->ε:Z

    .line 105
    .line 106
    invoke-static {v4, v5}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 107
    .line 108
    .line 109
    iget-object p1, v6, Lum1;->ε:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p1, Landroid/widget/Switch;

    .line 112
    .line 113
    if-eqz p1, :cond_4

    .line 114
    .line 115
    invoke-virtual {p1, v5}, Landroid/widget/Switch;->setChecked(Z)V

    .line 116
    .line 117
    .line 118
    :cond_4
    iget-boolean p0, p0, Lqm1;->ε:Z

    .line 119
    .line 120
    if-nez p0, :cond_6

    .line 121
    .line 122
    iget-boolean p0, v8, Lqm1;->ε:Z

    .line 123
    .line 124
    if-eqz p0, :cond_5

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    move v2, v5

    .line 128
    :cond_6
    :goto_2
    invoke-virtual {v7, v2}, Landroid/view/View;->setVisibility(I)V

    .line 129
    .line 130
    .line 131
    return-object v1

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
