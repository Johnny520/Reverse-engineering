.class public final Ltk;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ltk;->α:I

    .line 2
    .line 3
    iput-object p2, p0, Ltk;->β:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final α(Landroid/widget/SeekBar;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final β(Landroid/widget/SeekBar;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 3

    .line 1
    iget v0, p0, Ltk;->α:I

    .line 2
    .line 3
    iget-object p0, p0, Ltk;->β:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v0, Lq71;->β:Ljava/util/List;

    .line 13
    .line 14
    invoke-static {v0}, Lyh;->Λ(Ljava/util/List;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-static {p2, v1, v2}, Lj81;->μ(III)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    check-cast p0, Landroid/widget/TextView;

    .line 23
    .line 24
    sget-object v1, Lq71;->α:Lq71;

    .line 25
    .line 26
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    invoke-static {p2}, Lq71;->τ(F)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string p2, "x"

    .line 49
    .line 50
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    .line 59
    .line 60
    if-eqz p3, :cond_0

    .line 61
    .line 62
    const/4 p0, 0x4

    .line 63
    invoke-virtual {p1, p0}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 64
    .line 65
    .line 66
    :cond_0
    return-void

    .line 67
    :pswitch_0
    check-cast p0, Luk;

    .line 68
    .line 69
    iget-boolean p1, p0, Luk;->ε:Z

    .line 70
    .line 71
    if-nez p1, :cond_4

    .line 72
    .line 73
    if-eqz p3, :cond_4

    .line 74
    .line 75
    iget-object p1, p0, Luk;->δ:Lmk;

    .line 76
    .line 77
    iget-boolean p3, p1, Lmk;->δ:Z

    .line 78
    .line 79
    if-nez p3, :cond_1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    sget-object p3, Lui1;->α:Ljava/lang/Object;

    .line 83
    .line 84
    iget-object p1, p1, Lmk;->α:Ljava/lang/String;

    .line 85
    .line 86
    const-string p3, "comment_control_"

    .line 87
    .line 88
    const-string v0, "_alpha"

    .line 89
    .line 90
    invoke-static {p3, p1, v0}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const/16 p3, 0x64

    .line 95
    .line 96
    invoke-static {p2, v1, p3}, Lj81;->μ(III)I

    .line 97
    .line 98
    .line 99
    move-result p3

    .line 100
    invoke-static {p1, p3}, Lui1;->Η(Ljava/lang/String;I)V

    .line 101
    .line 102
    .line 103
    iget-object p1, p0, Luk;->π:Landroid/widget/TextView;

    .line 104
    .line 105
    const/4 p3, 0x0

    .line 106
    if-eqz p1, :cond_3

    .line 107
    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string p2, "%"

    .line 117
    .line 118
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, Luk;->Α:Lb8;

    .line 129
    .line 130
    if-eqz p1, :cond_2

    .line 131
    .line 132
    iget-object p0, p0, Luk;->δ:Lmk;

    .line 133
    .line 134
    invoke-static {}, Lui1;->φ()Z

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    invoke-static {}, Luk;->ζ()Z

    .line 139
    .line 140
    .line 141
    move-result p3

    .line 142
    invoke-virtual {p1, p0, p2, p3}, Lb8;->ξ(Lmk;ZZ)V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_2
    const-string p0, "preview"

    .line 147
    .line 148
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw p3

    .line 152
    :cond_3
    const-string p0, "alphaValue"

    .line 153
    .line 154
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p3

    .line 158
    :cond_4
    :goto_0
    return-void

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 1
    iget p0, p0, Ltk;->α:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    :pswitch_0
    return-void

    .line 10
    nop

    .line 11
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .line 1
    iget p0, p0, Ltk;->α:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    sget-object p1, Lq71;->β:Ljava/util/List;

    .line 14
    .line 15
    invoke-static {p1}, Lyh;->Λ(Ljava/util/List;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-static {p0, v1, v0}, Lj81;->μ(III)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    const-string p1, "global_video_speed"

    .line 35
    .line 36
    invoke-static {p1, p0}, Lui1;->Ζ(Ljava/lang/String;F)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Ln82;->α:[Ljava/lang/String;

    .line 40
    .line 41
    sget-object p0, Ll82;->α:Ll82;

    .line 42
    .line 43
    invoke-static {}, Ll82;->ε()Ljava/lang/Float;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    sget-object p1, Ll82;->η:Ljava/util/concurrent/atomic/AtomicLong;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    sput-wide v0, Ll82;->θ:J

    .line 60
    .line 61
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {p1, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_0

    .line 74
    .line 75
    invoke-static {p0}, Ll82;->α(F)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    sget-object p1, Ll82;->ζ:Landroid/os/Handler;

    .line 80
    .line 81
    new-instance v0, Lg82;

    .line 82
    .line 83
    const/4 v1, 0x1

    .line 84
    invoke-direct {v0, v1, p0}, Lg82;-><init>(IF)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 88
    .line 89
    .line 90
    :cond_1
    :goto_0
    :pswitch_0
    return-void

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
