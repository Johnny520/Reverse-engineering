.class public final synthetic Lpk;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Luk;


# direct methods
.method public synthetic constructor <init>(Luk;I)V
    .locals 0

    .line 1
    iput p2, p0, Lpk;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lpk;->ζ:Luk;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    iget p1, p0, Lpk;->ε:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object p0, p0, Lpk;->ζ:Luk;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Luk;->δ:Lmk;

    .line 10
    .line 11
    iget-boolean v1, p1, Lmk;->γ:Z

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object v1, Lui1;->α:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object p1, p1, Lmk;->α:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p1}, Lui1;->χ(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget-object v1, p0, Luk;->δ:Lmk;

    .line 25
    .line 26
    iget-object v1, v1, Lmk;->α:Ljava/lang/String;

    .line 27
    .line 28
    xor-int/2addr p1, v0

    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v2, "comment_control_"

    .line 32
    .line 33
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, "_visible"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Luk;->θ()V

    .line 52
    .line 53
    .line 54
    :goto_0
    return-void

    .line 55
    :pswitch_0
    iget-object p1, p0, Luk;->δ:Lmk;

    .line 56
    .line 57
    iget-boolean v1, p1, Lmk;->ε:Z

    .line 58
    .line 59
    if-nez v1, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    iget-object v1, p0, Luk;->α:Landroid/app/Activity;

    .line 63
    .line 64
    iget-object p1, p1, Lmk;->β:Ljava/lang/String;

    .line 65
    .line 66
    const-string v2, "\u8bbe\u7f6e"

    .line 67
    .line 68
    const-string v3, "\u989c\u8272"

    .line 69
    .line 70
    invoke-static {v2, p1, v3}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget-object v2, p0, Luk;->δ:Lmk;

    .line 75
    .line 76
    invoke-static {v2}, Luk;->δ(Lmk;)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    new-instance v3, Lθ;

    .line 81
    .line 82
    const/16 v4, 0xa

    .line 83
    .line 84
    invoke-direct {v3, v4, p0}, Lθ;-><init>(ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v1, p1, v2, v0, v3}, Lcom/example/dyhelper/ui/μ;->δ(Landroid/content/Context;Ljava/lang/String;IZLa80;)V

    .line 88
    .line 89
    .line 90
    :goto_1
    return-void

    .line 91
    :pswitch_1
    iget-object p0, p0, Luk;->η:Landroid/app/AlertDialog;

    .line 92
    .line 93
    if-eqz p0, :cond_2

    .line 94
    .line 95
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_2
    const-string p0, "dialog"

    .line 100
    .line 101
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const/4 p0, 0x0

    .line 105
    throw p0

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
