.class public final Lph;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Lig;


# direct methods
.method public synthetic constructor <init>(Lig;I)V
    .locals 0

    .line 1
    iput p2, p0, Lph;->α:I

    .line 2
    .line 3
    iput-object p1, p0, Lph;->β:Lig;

    .line 4
    .line 5
    invoke-direct {p0}, Lm01;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lk01;)V
    .locals 1

    .line 1
    iget v0, p0, Lph;->α:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 10
    .line 11
    instance-of v0, p1, Landroid/view/View;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, Landroid/view/View;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    :goto_0
    if-nez p1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    iget-object p0, p0, Lph;->β:Lig;

    .line 23
    .line 24
    const-string v0, "3903 top bar attached"

    .line 25
    .line 26
    invoke-virtual {p0, p1, v0}, Lig;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :goto_1
    return-void

    .line 30
    :pswitch_0
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 31
    .line 32
    instance-of v0, p1, Landroid/view/View;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    check-cast p1, Landroid/view/View;

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    const/4 p1, 0x0

    .line 40
    :goto_2
    if-nez p1, :cond_3

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_3
    iget-object p0, p0, Lph;->β:Lig;

    .line 44
    .line 45
    const-string v0, "3903 top bar constructor"

    .line 46
    .line 47
    invoke-virtual {p0, p1, v0}, Lig;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    :goto_3
    return-void

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
