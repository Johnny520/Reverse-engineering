.class public final Lmg;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic α:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lmg;->α:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget p0, p0, Lmg;->α:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    if-ne p2, p6, :cond_0

    .line 10
    .line 11
    if-ne p3, p7, :cond_0

    .line 12
    .line 13
    if-ne p4, p8, :cond_0

    .line 14
    .line 15
    if-ne p5, p9, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object p0, Lug;->α:Ltg;

    .line 19
    .line 20
    invoke-static {p1}, Ltg;->γ(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    :pswitch_0
    if-ne p2, p6, :cond_1

    .line 25
    .line 26
    if-ne p3, p7, :cond_1

    .line 27
    .line 28
    if-ne p4, p8, :cond_1

    .line 29
    .line 30
    if-ne p5, p9, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    sget-object p0, Lug;->α:Ltg;

    .line 34
    .line 35
    invoke-static {p1}, Ltg;->γ(Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    :goto_1
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
