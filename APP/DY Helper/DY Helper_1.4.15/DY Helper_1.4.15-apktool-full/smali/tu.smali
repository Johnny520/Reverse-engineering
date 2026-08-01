.class public final synthetic Ltu;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/widget/EditText;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ltu;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ltu;->ζ:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p2, p0, Ltu;->η:Landroid/widget/EditText;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/EditText;Landroid/app/Activity;)V
    .locals 1

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Ltu;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltu;->η:Landroid/widget/EditText;

    iput-object p2, p0, Ltu;->ζ:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    iget v0, p0, Ltu;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Ltu;->η:Landroid/widget/EditText;

    .line 5
    .line 6
    iget-object p0, p0, Ltu;->ζ:Landroid/app/Activity;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-ne p1, v1, :cond_0

    .line 17
    .line 18
    sget-object p1, Lbv1;->α:Lbv1;

    .line 19
    .line 20
    new-instance p1, Lqu;

    .line 21
    .line 22
    const/4 p2, 0x3

    .line 23
    invoke-direct {p1, p0, v2, p2}, Lqu;-><init>(Landroid/app/Activity;Landroid/widget/EditText;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    return v3

    .line 30
    :pswitch_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-ne p2, v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    .line 40
    .line 41
    .line 42
    new-instance p1, Lqu;

    .line 43
    .line 44
    invoke-direct {p1, p0, v2, v3}, Lqu;-><init>(Landroid/app/Activity;Landroid/widget/EditText;I)V

    .line 45
    .line 46
    .line 47
    const-wide/16 v0, 0x78

    .line 48
    .line 49
    invoke-virtual {v2, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 50
    .line 51
    .line 52
    :cond_1
    return v3

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
