.class public final Lu80;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lu80;->α:I

    .line 2
    .line 3
    iput-object p2, p0, Lu80;->β:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final α()V
    .locals 1

    .line 1
    iget v0, p0, Lu80;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lu80;->β:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljx1;

    .line 9
    .line 10
    iget v0, p0, Ljx1;->λ:I

    .line 11
    .line 12
    add-int/lit8 v0, v0, -0x1

    .line 13
    .line 14
    iput v0, p0, Ljx1;->λ:I

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    iget-object p0, p0, Lu80;->β:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lv80;

    .line 20
    .line 21
    iget v0, p0, Lv80;->Γ:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, -0x1

    .line 24
    .line 25
    iput v0, p0, Lv80;->Γ:I

    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final β()V
    .locals 1

    .line 1
    iget v0, p0, Lu80;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lu80;->β:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljx1;

    .line 9
    .line 10
    iget v0, p0, Ljx1;->λ:I

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    iput v0, p0, Ljx1;->λ:I

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    iget-object p0, p0, Lu80;->β:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lv80;

    .line 20
    .line 21
    iget v0, p0, Lv80;->Γ:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    iput v0, p0, Lv80;->Γ:I

    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
