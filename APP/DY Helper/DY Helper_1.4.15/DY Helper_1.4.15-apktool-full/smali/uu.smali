.class public final synthetic Luu;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/widget/EditText;I)V
    .locals 0

    .line 1
    iput p3, p0, Luu;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Luu;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p2, p0, Luu;->η:Landroid/widget/EditText;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 2

    .line 1
    iget p1, p0, Luu;->ε:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    new-instance p1, Lqu;

    .line 9
    .line 10
    const/4 p2, 0x2

    .line 11
    iget-object v0, p0, Luu;->ζ:Landroid/app/Activity;

    .line 12
    .line 13
    iget-object p0, p0, Luu;->η:Landroid/widget/EditText;

    .line 14
    .line 15
    invoke-direct {p1, v0, p0, p2}, Lqu;-><init>(Landroid/app/Activity;Landroid/widget/EditText;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :pswitch_0
    if-eqz p2, :cond_1

    .line 23
    .line 24
    new-instance p1, Lqu;

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    iget-object v0, p0, Luu;->ζ:Landroid/app/Activity;

    .line 28
    .line 29
    iget-object p0, p0, Luu;->η:Landroid/widget/EditText;

    .line 30
    .line 31
    invoke-direct {p1, v0, p0, p2}, Lqu;-><init>(Landroid/app/Activity;Landroid/widget/EditText;I)V

    .line 32
    .line 33
    .line 34
    const-wide/16 v0, 0x78

    .line 35
    .line 36
    invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
