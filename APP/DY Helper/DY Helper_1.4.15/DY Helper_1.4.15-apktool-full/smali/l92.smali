.class public final Ll92;
.super Landroid/view/ViewOutlineProvider;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ll92;->α:I

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 0

    .line 1
    iget p0, p0, Ll92;->α:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    check-cast p1, Landroidx/compose/ui/platform/ViewLayer;

    .line 10
    .line 11
    sget-object p0, Landroidx/compose/ui/platform/ViewLayer;->η:Ljava/lang/reflect/Method;

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    throw p0

    .line 15
    :pswitch_0
    instance-of p0, p1, Landroidx/compose/ui/graphics/layer/ViewLayer;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    sget p0, Landroidx/compose/ui/graphics/layer/ViewLayer;->η:I

    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
