.class public final synthetic Llb;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/view/View;

.field public final synthetic η:I


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;II)V
    .locals 0

    .line 1
    iput p3, p0, Llb;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Llb;->ζ:Landroid/view/View;

    .line 4
    .line 5
    iput p2, p0, Llb;->η:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Llb;->ε:I

    .line 2
    .line 3
    iget v1, p0, Llb;->η:I

    .line 4
    .line 5
    iget-object p0, p0, Llb;->ζ:Landroid/view/View;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    sget-object v0, Lug;->α:Ltg;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v0, p0, v1, v2}, Ltg;->δ(Landroid/view/View;IZ)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void

    .line 23
    :pswitch_0
    sget-object v0, Lsb;->α:Lsb;

    .line 24
    .line 25
    invoke-static {p0, v1}, Lsb;->ε(Landroid/view/View;I)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
