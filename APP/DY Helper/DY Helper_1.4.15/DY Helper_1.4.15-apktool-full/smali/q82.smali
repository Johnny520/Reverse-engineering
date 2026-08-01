.class public final Lq82;
.super Lyw0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic ι:I


# direct methods
.method public constructor <init>(ILjava/lang/Class;III)V
    .locals 0

    .line 1
    iput p5, p0, Lq82;->ι:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p1, p0, Lyw0;->ε:I

    .line 7
    .line 8
    iput-object p2, p0, Lyw0;->θ:Ljava/lang/Object;

    .line 9
    .line 10
    iput p3, p0, Lyw0;->η:I

    .line 11
    .line 12
    iput p4, p0, Lyw0;->ζ:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final γ(Landroid/view/View;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lq82;->ι:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lz82;->β(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-static {p1}, Lx82;->α(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final δ(Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget p0, p0, Lq82;->ι:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, Ljava/lang/CharSequence;

    .line 7
    .line 8
    invoke-static {p1, p2}, Lz82;->γ(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    check-cast p2, Ljava/lang/CharSequence;

    .line 13
    .line 14
    invoke-static {p1, p2}, Lx82;->δ(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final η(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget p0, p0, Lq82;->ι:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/CharSequence;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/CharSequence;

    .line 9
    .line 10
    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    :goto_0
    xor-int/lit8 p0, p0, 0x1

    .line 15
    .line 16
    return p0

    .line 17
    :pswitch_0
    check-cast p1, Ljava/lang/CharSequence;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/CharSequence;

    .line 20
    .line 21
    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    goto :goto_0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
