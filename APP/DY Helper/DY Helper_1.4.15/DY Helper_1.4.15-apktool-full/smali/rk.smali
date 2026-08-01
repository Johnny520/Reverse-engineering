.class public final synthetic Lrk;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lmk;

.field public final synthetic η:Luk;


# direct methods
.method public synthetic constructor <init>(Lmk;Luk;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lrk;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lrk;->ζ:Lmk;

    .line 8
    .line 9
    iput-object p2, p0, Lrk;->η:Luk;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Luk;Lmk;)V
    .locals 1

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Lrk;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrk;->η:Luk;

    iput-object p2, p0, Lrk;->ζ:Lmk;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget p1, p0, Lrk;->ε:I

    .line 2
    .line 3
    iget-object v0, p0, Lrk;->η:Luk;

    .line 4
    .line 5
    iget-object p0, p0, Lrk;->ζ:Lmk;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object p1, Lui1;->α:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object p0, p0, Lmk;->α:Ljava/lang/String;

    .line 13
    .line 14
    new-instance p1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, "comment_control_"

    .line 17
    .line 18
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, "_visible"

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-static {p1, v1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    iget-object p1, v0, Luk;->δ:Lmk;

    .line 38
    .line 39
    iget-object p1, p1, Lmk;->α:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_0

    .line 46
    .line 47
    invoke-virtual {v0}, Luk;->ι()V

    .line 48
    .line 49
    .line 50
    :cond_0
    invoke-virtual {v0}, Luk;->κ()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Luk;->η()V

    .line 54
    .line 55
    .line 56
    iget-object p0, v0, Luk;->Α:Lb8;

    .line 57
    .line 58
    if-eqz p0, :cond_1

    .line 59
    .line 60
    iget-object p1, v0, Luk;->δ:Lmk;

    .line 61
    .line 62
    invoke-static {}, Lui1;->φ()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-static {}, Luk;->ζ()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-virtual {p0, p1, v0, v1}, Lb8;->ξ(Lmk;ZZ)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_1
    const-string p0, "preview"

    .line 75
    .line 76
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const/4 p0, 0x0

    .line 80
    throw p0

    .line 81
    :pswitch_0
    invoke-virtual {v0, p0}, Luk;->λ(Lmk;)V

    .line 82
    .line 83
    .line 84
    sget-object p0, Lnk;->ε:Lnk;

    .line 85
    .line 86
    invoke-virtual {v0, p0}, Luk;->ν(Lnk;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
