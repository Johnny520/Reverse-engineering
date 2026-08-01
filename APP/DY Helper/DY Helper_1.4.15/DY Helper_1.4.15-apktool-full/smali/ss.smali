.class public final Lss;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lws;


# direct methods
.method public synthetic constructor <init>(Lws;I)V
    .locals 0

    .line 1
    iput p2, p0, Lss;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lss;->ζ:Lws;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lss;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lss;->ζ:Lws;

    .line 7
    .line 8
    iget-object v0, p0, Ln60;->Ν:Lm60;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ln60;->ε()Lm60;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :pswitch_0
    iget-object p0, p0, Lss;->ζ:Lws;

    .line 21
    .line 22
    iget-object v0, p0, Lws;->а:Lus;

    .line 23
    .line 24
    iget-object p0, p0, Lws;->и:Lxm;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Lus;->onDismiss(Landroid/content/DialogInterface;)V

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
