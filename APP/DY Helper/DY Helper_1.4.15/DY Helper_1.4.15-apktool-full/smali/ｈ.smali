.class public final Lｈ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lｈ;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lｈ;->ζ:Ljava/lang/Object;

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
    .locals 1

    .line 1
    iget p1, p0, Lｈ;->ε:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lｈ;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Landroidx/appcompat/widget/Toolbar;

    .line 9
    .line 10
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->Σ:Lv42;

    .line 11
    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p0, p0, Lv42;->ζ:Llz0;

    .line 17
    .line 18
    :goto_0
    if-eqz p0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Llz0;->collapseActionView()Z

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void

    .line 24
    :pswitch_0
    iget-object p0, p0, Lｈ;->ζ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lu;

    .line 27
    .line 28
    iget-object p1, p0, Lu;->χ:Ls;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    iget-object p0, p0, Lu;->β:Lw;

    .line 32
    .line 33
    invoke-virtual {p1, v0, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_1
    iget-object p0, p0, Lｈ;->ζ:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Lｗ;

    .line 44
    .line 45
    invoke-virtual {p0}, Lｗ;->α()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
