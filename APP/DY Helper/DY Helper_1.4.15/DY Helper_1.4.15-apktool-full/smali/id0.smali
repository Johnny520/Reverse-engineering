.class public final synthetic Lid0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic α:Lnd0;

.field public final synthetic β:Landroid/app/AlertDialog;

.field public final synthetic γ:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Lnd0;Landroid/app/AlertDialog;Landroid/widget/EditText;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lid0;->α:Lnd0;

    .line 5
    .line 6
    iput-object p2, p0, Lid0;->β:Landroid/app/AlertDialog;

    .line 7
    .line 8
    iput-object p3, p0, Lid0;->γ:Landroid/widget/EditText;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lid0;->β:Landroid/app/AlertDialog;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lid0;->α:Lnd0;

    .line 7
    .line 8
    iget-object p0, p0, Lid0;->γ:Landroid/widget/EditText;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p0}, Lnd0;->β(Landroid/app/AlertDialog;Landroid/widget/EditText;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    invoke-virtual {p1, v1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, Lc9;

    .line 19
    .line 20
    const/4 v3, 0x6

    .line 21
    invoke-direct {v2, v0, p0, p1, v3}, Lc9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
