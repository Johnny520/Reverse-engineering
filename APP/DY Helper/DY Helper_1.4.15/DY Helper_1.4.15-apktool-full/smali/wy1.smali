.class public final synthetic Lwy1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lum1;

.field public final synthetic η:Landroid/widget/TextView;

.field public final synthetic θ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;Lum1;Ljava/lang/String;)V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lwy1;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwy1;->η:Landroid/widget/TextView;

    iput-object p2, p0, Lwy1;->ζ:Lum1;

    iput-object p3, p0, Lwy1;->θ:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lum1;Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwy1;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwy1;->ζ:Lum1;

    .line 8
    .line 9
    iput-object p2, p0, Lwy1;->η:Landroid/widget/TextView;

    .line 10
    .line 11
    iput-object p3, p0, Lwy1;->θ:Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lwy1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lwy1;->ζ:Lum1;

    .line 12
    .line 13
    iput-object p1, v0, Lum1;->ε:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object p1, p0, Lwy1;->θ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, p1}, Ljz1;->ψ(Lum1;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "\u6295\u5582\u98df\u7269\uff1a"

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object p0, p0, Lwy1;->η:Landroid/widget/TextView;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Ls62;->α:Ls62;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_0
    check-cast p1, Lfo1;

    .line 36
    .line 37
    iget-object p1, p1, Lfo1;->ε:Ljava/lang/Object;

    .line 38
    .line 39
    instance-of v0, p1, Leo1;

    .line 40
    .line 41
    if-nez v0, :cond_0

    .line 42
    .line 43
    check-cast p1, Lef1;

    .line 44
    .line 45
    iget-object p1, p0, Lwy1;->ζ:Lum1;

    .line 46
    .line 47
    iget-object v0, p0, Lwy1;->θ:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {p1, v0}, Ljz1;->ψ(Lum1;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v0, "\u6295\u5582\u98df\u7269\uff1a"

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object p0, p0, Lwy1;->η:Landroid/widget/TextView;

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    sget-object p0, Ls62;->α:Ls62;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
