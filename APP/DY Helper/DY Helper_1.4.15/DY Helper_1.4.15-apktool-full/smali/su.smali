.class public final synthetic Lsu;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/widget/EditText;

.field public final synthetic η:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/widget/EditText;I)V
    .locals 0

    .line 1
    iput p3, p0, Lsu;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lsu;->η:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p2, p0, Lsu;->ζ:Landroid/widget/EditText;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/EditText;Landroid/app/Activity;I)V
    .locals 0

    .line 11
    iput p3, p0, Lsu;->ε:I

    iput-object p1, p0, Lsu;->ζ:Landroid/widget/EditText;

    iput-object p2, p0, Lsu;->η:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget p1, p0, Lsu;->ε:I

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    iget-object v1, p0, Lsu;->ζ:Landroid/widget/EditText;

    .line 5
    .line 6
    iget-object p0, p0, Lsu;->η:Landroid/app/Activity;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object p1, Lbv1;->α:Lbv1;

    .line 12
    .line 13
    new-instance p1, Lqu;

    .line 14
    .line 15
    invoke-direct {p1, p0, v1, v0}, Lqu;-><init>(Landroid/app/Activity;Landroid/widget/EditText;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    sget-object p1, Lbv1;->α:Lbv1;

    .line 23
    .line 24
    new-instance p1, Lqu;

    .line 25
    .line 26
    invoke-direct {p1, p0, v1, v0}, Lqu;-><init>(Landroid/app/Activity;Landroid/widget/EditText;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_1
    sget-object p1, Lbv1;->α:Lbv1;

    .line 34
    .line 35
    new-instance p1, Lqu;

    .line 36
    .line 37
    invoke-direct {p1, p0, v1, v0}, Lqu;-><init>(Landroid/app/Activity;Landroid/widget/EditText;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_2
    sget-object p1, Lbv1;->α:Lbv1;

    .line 45
    .line 46
    new-instance p1, Lqu;

    .line 47
    .line 48
    invoke-direct {p1, p0, v1, v0}, Lqu;-><init>(Landroid/app/Activity;Landroid/widget/EditText;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_3
    new-instance p1, Lqu;

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    invoke-direct {p1, p0, v1, v0}, Lqu;-><init>(Landroid/app/Activity;Landroid/widget/EditText;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_4
    const/4 p1, 0x1

    .line 66
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setCursorVisible(Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 70
    .line 71
    .line 72
    new-instance v0, Lqu;

    .line 73
    .line 74
    invoke-direct {v0, p0, v1, p1}, Lqu;-><init>(Landroid/app/Activity;Landroid/widget/EditText;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_5
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    const/4 v0, 0x0

    .line 89
    if-eqz p1, :cond_0

    .line 90
    .line 91
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    goto :goto_0

    .line 96
    :cond_0
    move p1, v0

    .line 97
    :goto_0
    invoke-virtual {v1, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 98
    .line 99
    .line 100
    new-instance p1, Lqu;

    .line 101
    .line 102
    invoke-direct {p1, p0, v1, v0}, Lqu;-><init>(Landroid/app/Activity;Landroid/widget/EditText;I)V

    .line 103
    .line 104
    .line 105
    const-wide/16 v2, 0x78

    .line 106
    .line 107
    invoke-virtual {v1, p1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
