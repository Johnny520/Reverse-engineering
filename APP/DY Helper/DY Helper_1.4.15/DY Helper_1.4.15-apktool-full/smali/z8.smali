.class public final synthetic Lz8;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/AlertDialog;


# direct methods
.method public synthetic constructor <init>(Landroid/app/AlertDialog;I)V
    .locals 0

    .line 1
    iput p2, p0, Lz8;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lz8;->ζ:Landroid/app/AlertDialog;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lz8;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lz8;->ζ:Landroid/app/AlertDialog;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 9
    .line 10
    .line 11
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_0
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :pswitch_1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_2
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
