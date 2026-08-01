.class public final Lpg;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ltg;


# direct methods
.method public synthetic constructor <init>(Ltg;I)V
    .locals 0

    .line 1
    iput p2, p0, Lpg;->α:I

    .line 2
    .line 3
    iput-object p1, p0, Lpg;->β:Ltg;

    .line 4
    .line 5
    invoke-direct {p0}, Lm01;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lk01;)V
    .locals 3

    .line 1
    iget v0, p0, Lpg;->α:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 10
    .line 11
    instance-of v0, p1, Landroid/view/View;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, Landroid/view/View;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    :goto_0
    if-nez p1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const v0, 0x7f0dead3

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    invoke-virtual {p1, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    new-instance v0, Llg;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-direct {v0, v1}, Llg;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 48
    .line 49
    .line 50
    new-instance v0, Lhg;

    .line 51
    .line 52
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    const-string v0, "constructor attached"

    .line 65
    .line 66
    iget-object p0, p0, Lpg;->β:Ltg;

    .line 67
    .line 68
    invoke-virtual {p0, p1, v0}, Ltg;->п(Landroid/view/View;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    :goto_1
    return-void

    .line 72
    :pswitch_0
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 73
    .line 74
    instance-of v0, p1, Landroid/view/View;

    .line 75
    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    check-cast p1, Landroid/view/View;

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    const/4 p1, 0x0

    .line 82
    :goto_2
    if-nez p1, :cond_5

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_5
    iget-object p0, p0, Lpg;->β:Ltg;

    .line 86
    .line 87
    invoke-virtual {p0, p1}, Ltg;->Υ(Landroid/view/View;)V

    .line 88
    .line 89
    .line 90
    :goto_3
    return-void

    .line 91
    :pswitch_1
    iget-object v0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    const/4 v1, 0x1

    .line 97
    invoke-static {v1, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    instance-of v1, v0, Ljava/lang/String;

    .line 102
    .line 103
    const/4 v2, 0x0

    .line 104
    if-eqz v1, :cond_6

    .line 105
    .line 106
    check-cast v0, Ljava/lang/String;

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_6
    move-object v0, v2

    .line 110
    :goto_4
    iget-object p1, p1, Lk01;->ε:Ljava/lang/Object;

    .line 111
    .line 112
    instance-of v1, p1, Landroid/view/View;

    .line 113
    .line 114
    if-eqz v1, :cond_7

    .line 115
    .line 116
    move-object v2, p1

    .line 117
    check-cast v2, Landroid/view/View;

    .line 118
    .line 119
    :cond_7
    iget-object p0, p0, Lpg;->β:Ltg;

    .line 120
    .line 121
    invoke-virtual {p0, v2, v0}, Ltg;->υ(Landroid/view/View;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_2
    iget-object v0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    const/4 v1, 0x0

    .line 131
    invoke-static {v1, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    instance-of v1, v0, Ljava/lang/String;

    .line 136
    .line 137
    const/4 v2, 0x0

    .line 138
    if-eqz v1, :cond_8

    .line 139
    .line 140
    check-cast v0, Ljava/lang/String;

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_8
    move-object v0, v2

    .line 144
    :goto_5
    iget-object p1, p1, Lk01;->ε:Ljava/lang/Object;

    .line 145
    .line 146
    instance-of v1, p1, Landroid/view/View;

    .line 147
    .line 148
    if-eqz v1, :cond_9

    .line 149
    .line 150
    move-object v2, p1

    .line 151
    check-cast v2, Landroid/view/View;

    .line 152
    .line 153
    :cond_9
    iget-object p0, p0, Lpg;->β:Ltg;

    .line 154
    .line 155
    invoke-virtual {p0, v2, v0}, Ltg;->υ(Landroid/view/View;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
