.class public final synthetic Lz10;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/view/View;

.field public final synthetic η:Lk20;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Lk20;I)V
    .locals 0

    .line 1
    iput p3, p0, Lz10;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lz10;->ζ:Landroid/view/View;

    .line 4
    .line 5
    iput-object p2, p0, Lz10;->η:Lk20;

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
    .locals 2

    .line 1
    iget v0, p0, Lz10;->ε:I

    .line 2
    .line 3
    iget-object v1, p0, Lz10;->η:Lk20;

    .line 4
    .line 5
    iget-object p0, p0, Lz10;->ζ:Landroid/view/View;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 11
    .line 12
    invoke-static {p0, v1}, Lcom/example/dyhelper/hook/γ;->г(Landroid/view/View;Lk20;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    sget-object v0, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 17
    .line 18
    invoke-static {p0, v1}, Lcom/example/dyhelper/hook/γ;->г(Landroid/view/View;Lk20;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
