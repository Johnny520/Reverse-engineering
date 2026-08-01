.class public final synthetic Led0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Lnd0;

.field public final synthetic γ:Landroid/app/AlertDialog;


# direct methods
.method public synthetic constructor <init>(Lnd0;Landroid/app/AlertDialog;I)V
    .locals 0

    .line 1
    iput p3, p0, Led0;->α:I

    .line 2
    .line 3
    iput-object p1, p0, Led0;->β:Lnd0;

    .line 4
    .line 5
    iput-object p2, p0, Led0;->γ:Landroid/app/AlertDialog;

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
    .locals 1

    .line 1
    iget p1, p0, Led0;->α:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Led0;->γ:Landroid/app/AlertDialog;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object p0, p0, Led0;->β:Lnd0;

    .line 13
    .line 14
    invoke-virtual {p0, p1, v0}, Lnd0;->β(Landroid/app/AlertDialog;Landroid/widget/EditText;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object p1, p0, Led0;->γ:Landroid/app/AlertDialog;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iget-object p0, p0, Led0;->β:Lnd0;

    .line 25
    .line 26
    invoke-virtual {p0, p1, v0}, Lnd0;->β(Landroid/app/AlertDialog;Landroid/widget/EditText;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
