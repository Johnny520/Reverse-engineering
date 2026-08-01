.class public final Lr6;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lt6;


# instance fields
.field public final synthetic ε:I

.field public final ζ:F


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr6;->ε:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    int-to-float p1, p1

    .line 11
    iput p1, p0, Lr6;->ζ:F

    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    int-to-float p1, p1

    .line 19
    iput p1, p0, Lr6;->ζ:F

    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    int-to-float p1, p1

    .line 27
    iput p1, p0, Lr6;->ζ:F

    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    int-to-float p1, p1

    .line 35
    iput p1, p0, Lr6;->ζ:F

    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget p0, p0, Lr6;->ε:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "Arrangement#SpaceEvenly"

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    const-string p0, "Arrangement#SpaceBetween"

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    const-string p0, "Arrangement#SpaceAround"

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    const-string p0, "Arrangement#Center"

    .line 16
    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final β()F
    .locals 1

    .line 1
    iget v0, p0, Lr6;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget p0, p0, Lr6;->ζ:F

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_0
    iget p0, p0, Lr6;->ζ:F

    .line 10
    .line 11
    return p0

    .line 12
    :pswitch_1
    iget p0, p0, Lr6;->ζ:F

    .line 13
    .line 14
    return p0

    .line 15
    :pswitch_2
    iget p0, p0, Lr6;->ζ:F

    .line 16
    .line 17
    return p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final δ(ILrx0;[I[I)V
    .locals 0

    .line 1
    iget p0, p0, Lr6;->ε:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    invoke-static {p1, p3, p4, p0}, Lu6;->ε(I[I[IZ)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :pswitch_0
    const/4 p0, 0x0

    .line 12
    invoke-static {p1, p3, p4, p0}, Lu6;->δ(I[I[IZ)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    const/4 p0, 0x0

    .line 17
    invoke-static {p1, p3, p4, p0}, Lu6;->γ(I[I[IZ)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_2
    const/4 p0, 0x0

    .line 22
    invoke-static {p1, p3, p4, p0}, Lu6;->α(I[I[IZ)V

    .line 23
    .line 24
    .line 25
    return-void

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
