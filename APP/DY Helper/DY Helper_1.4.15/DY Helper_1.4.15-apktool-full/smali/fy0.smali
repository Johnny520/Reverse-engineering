.class public final synthetic Lfy0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Landroid/app/AlertDialog;

.field public final synthetic γ:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Landroid/app/AlertDialog;Landroid/widget/EditText;I)V
    .locals 0

    .line 1
    iput p3, p0, Lfy0;->α:I

    .line 2
    .line 3
    iput-object p1, p0, Lfy0;->β:Landroid/app/AlertDialog;

    .line 4
    .line 5
    iput-object p2, p0, Lfy0;->γ:Landroid/widget/EditText;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 5

    .line 1
    iget p1, p0, Lfy0;->α:I

    .line 2
    .line 3
    const-wide/16 v0, 0xb4

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x5

    .line 7
    iget-object v4, p0, Lfy0;->γ:Landroid/widget/EditText;

    .line 8
    .line 9
    iget-object p0, p0, Lfy0;->β:Landroid/app/AlertDialog;

    .line 10
    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, v3}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    sget-object p0, Lqy0;->α:Lqy0;

    .line 24
    .line 25
    new-instance p0, Lyx0;

    .line 26
    .line 27
    invoke-direct {p0, v4, v2}, Lyx0;-><init>(Landroid/widget/EditText;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4, p0, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_0
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0, v3}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 41
    .line 42
    .line 43
    :cond_1
    sget-object p0, Lqy0;->α:Lqy0;

    .line 44
    .line 45
    new-instance p0, Lyx0;

    .line 46
    .line 47
    invoke-direct {p0, v4, v2}, Lyx0;-><init>(Landroid/widget/EditText;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, p0, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
