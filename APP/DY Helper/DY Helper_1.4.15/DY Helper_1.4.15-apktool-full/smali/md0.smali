.class public final Lmd0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ε:I

.field public final ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lmd0;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lmd0;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final α(Landroid/text/Editable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final β(Landroid/text/Editable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final γ(Landroid/text/Editable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final δ(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final ε(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final ζ(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final η(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final θ(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final ι(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 1
    iget v0, p0, Lmd0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p0, Lbv1;->α:Lbv1;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    :cond_0
    const-string p0, ""

    .line 27
    .line 28
    :cond_1
    sput-object p0, Lbv1;->ζ:Ljava/lang/String;

    .line 29
    .line 30
    sget-object p0, Lbv1;->α:Lbv1;

    .line 31
    .line 32
    invoke-static {}, Lbv1;->ω()V

    .line 33
    .line 34
    .line 35
    :pswitch_0
    return-void

    .line 36
    :pswitch_1
    iget-object p0, p0, Lmd0;->ζ:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lp3;

    .line 39
    .line 40
    invoke-virtual {p0}, Lp3;->invoke()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :pswitch_2
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    iget p0, p0, Lmd0;->ε:I

    .line 2
    .line 3
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 1

    .line 1
    iget p2, p0, Lmd0;->ε:I

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    iget-object p0, p0, Lmd0;->ζ:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch p2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object p2, Lbv1;->α:Lbv1;

    .line 10
    .line 11
    check-cast p0, Landroid/widget/TextView;

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    :cond_0
    move p3, p2

    .line 23
    :cond_1
    xor-int/lit8 p1, p3, 0x1

    .line 24
    .line 25
    invoke-static {p0, p1}, Lbv1;->ε(Landroid/view/View;Z)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    check-cast p0, Landroidx/appcompat/widget/SearchView;

    .line 30
    .line 31
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 32
    .line 33
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iput-object p2, p0, Landroidx/appcompat/widget/SearchView;->г:Ljava/lang/CharSequence;

    .line 38
    .line 39
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    xor-int/lit8 p4, p2, 0x1

    .line 44
    .line 45
    invoke-virtual {p0, p4}, Landroidx/appcompat/widget/SearchView;->υ(Z)V

    .line 46
    .line 47
    .line 48
    iget-boolean p4, p0, Landroidx/appcompat/widget/SearchView;->в:Z

    .line 49
    .line 50
    const/16 v0, 0x8

    .line 51
    .line 52
    if-eqz p4, :cond_2

    .line 53
    .line 54
    iget-boolean p4, p0, Landroidx/appcompat/widget/SearchView;->Υ:Z

    .line 55
    .line 56
    if-nez p4, :cond_2

    .line 57
    .line 58
    if-eqz p2, :cond_2

    .line 59
    .line 60
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->Α:Landroid/widget/ImageView;

    .line 61
    .line 62
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    move p3, v0

    .line 67
    :goto_0
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->Γ:Landroid/widget/ImageView;

    .line 68
    .line 69
    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->π()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->τ()V

    .line 76
    .line 77
    .line 78
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    :pswitch_1
    return-void

    .line 82
    :pswitch_2
    check-cast p0, Lli0;

    .line 83
    .line 84
    iget-object p2, p0, Lli0;->Κ:Lii0;

    .line 85
    .line 86
    if-eqz p2, :cond_3

    .line 87
    .line 88
    sget-object p4, Lmi0;->α:Landroid/os/Handler;

    .line 89
    .line 90
    invoke-virtual {p4, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    new-instance p2, Lii0;

    .line 94
    .line 95
    invoke-direct {p2, p0, p3, p1}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iput-object p2, p0, Lli0;->Κ:Lii0;

    .line 99
    .line 100
    sget-object p0, Lmi0;->α:Landroid/os/Handler;

    .line 101
    .line 102
    const-wide/16 p3, 0xa0

    .line 103
    .line 104
    invoke-virtual {p0, p2, p3, p4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :pswitch_3
    check-cast p0, Lnd0;

    .line 109
    .line 110
    if-eqz p1, :cond_4

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    goto :goto_1

    .line 117
    :cond_4
    const/4 p1, 0x0

    .line 118
    :goto_1
    if-nez p1, :cond_5

    .line 119
    .line 120
    const-string p1, ""

    .line 121
    .line 122
    :cond_5
    iput-object p1, p0, Lnd0;->Ε:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {p0}, Lnd0;->ε()V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
