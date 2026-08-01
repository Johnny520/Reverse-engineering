.class public final synthetic Lqk;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Luk;


# direct methods
.method public synthetic constructor <init>(Luk;I)V
    .locals 0

    .line 1
    iput p2, p0, Lqk;->α:I

    .line 2
    .line 3
    iput-object p1, p0, Lqk;->β:Luk;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 4

    .line 1
    iget v0, p0, Lqk;->α:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "preview"

    .line 5
    .line 6
    iget-object p0, p0, Lqk;->β:Luk;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-boolean p1, p0, Luk;->ε:Z

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string p1, "comment_content_color_skip_mention"

    .line 20
    .line 21
    invoke-static {p1, p2}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Luk;->Α:Lb8;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-object p0, p0, Luk;->δ:Lmk;

    .line 29
    .line 30
    invoke-static {}, Lui1;->φ()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p1, p0, v0, p2}, Lb8;->ξ(Lmk;ZZ)V

    .line 35
    .line 36
    .line 37
    :goto_0
    return-void

    .line 38
    :cond_1
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v1

    .line 42
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-boolean p1, p0, Luk;->ε:Z

    .line 46
    .line 47
    if-nez p1, :cond_4

    .line 48
    .line 49
    iget-object p1, p0, Luk;->δ:Lmk;

    .line 50
    .line 51
    iget-boolean v0, p1, Lmk;->ε:Z

    .line 52
    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    sget-object v0, Lui1;->α:Ljava/lang/Object;

    .line 57
    .line 58
    iget-object p1, p1, Lmk;->α:Ljava/lang/String;

    .line 59
    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v3, "comment_control_"

    .line 63
    .line 64
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string p1, "_color_enabled"

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1, p2}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Luk;->Α:Lb8;

    .line 83
    .line 84
    if-eqz p1, :cond_3

    .line 85
    .line 86
    iget-object p0, p0, Luk;->δ:Lmk;

    .line 87
    .line 88
    invoke-static {}, Lui1;->φ()Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    invoke-static {}, Luk;->ζ()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-virtual {p1, p0, p2, v0}, Lb8;->ξ(Lmk;ZZ)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v1

    .line 104
    :cond_4
    :goto_1
    return-void

    .line 105
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    iget-boolean p1, p0, Luk;->ζ:Z

    .line 109
    .line 110
    if-eqz p1, :cond_5

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_5
    const-string p1, "comment_control_custom_enabled"

    .line 114
    .line 115
    invoke-static {p1, p2}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Luk;->θ()V

    .line 119
    .line 120
    .line 121
    :goto_2
    return-void

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
