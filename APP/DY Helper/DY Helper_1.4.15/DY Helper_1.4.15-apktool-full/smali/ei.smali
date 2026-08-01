.class public final synthetic Lei;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lum1;


# direct methods
.method public synthetic constructor <init>(Lum1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lei;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lei;->ζ:Lum1;

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
    iget v0, p0, Lei;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lei;->ζ:Lum1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    check-cast p0, Landroid/app/AlertDialog;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 15
    .line 16
    .line 17
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const-string p0, "dialog"

    .line 21
    .line 22
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    throw p0

    .line 27
    :pswitch_0
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 28
    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    check-cast p0, Landroid/app/AlertDialog;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-string p0, "dialog"

    .line 38
    .line 39
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    throw p0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
