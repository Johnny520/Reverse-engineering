.class public final Lgl1;
.super Ly12;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ι:I

.field public synthetic κ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILop;I)V
    .locals 0

    .line 1
    iput p3, p0, Lgl1;->ι:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ly12;-><init>(ILop;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lgl1;->ι:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lbw1;

    .line 7
    .line 8
    check-cast p2, Lop;

    .line 9
    .line 10
    invoke-virtual {p0, p2, p1}, Lgl1;->η(Lop;Ljava/lang/Object;)Lop;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lgl1;

    .line 15
    .line 16
    sget-object p1, Ls62;->α:Ls62;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lgl1;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lfl1;

    .line 24
    .line 25
    check-cast p2, Lop;

    .line 26
    .line 27
    invoke-virtual {p0, p2, p1}, Lgl1;->η(Lop;Ljava/lang/Object;)Lop;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lgl1;

    .line 32
    .line 33
    sget-object p1, Ls62;->α:Ls62;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lgl1;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final η(Lop;Ljava/lang/Object;)Lop;
    .locals 2

    .line 1
    iget p0, p0, Lgl1;->ι:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Lgl1;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {p0, v0, p1, v1}, Lgl1;-><init>(ILop;I)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lgl1;->κ:Ljava/lang/Object;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    new-instance p0, Lgl1;

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p0, v0, p1, v1}, Lgl1;-><init>(ILop;I)V

    .line 21
    .line 22
    .line 23
    iput-object p2, p0, Lgl1;->κ:Ljava/lang/Object;

    .line 24
    .line 25
    return-object p0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lgl1;->ι:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lgl1;->κ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lbw1;

    .line 14
    .line 15
    sget-object p1, Lbw1;->ε:Lbw1;

    .line 16
    .line 17
    if-eq p0, p1, :cond_0

    .line 18
    .line 19
    move v1, v2

    .line 20
    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :pswitch_0
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lgl1;->κ:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Lfl1;

    .line 31
    .line 32
    sget-object p1, Lfl1;->ε:Lfl1;

    .line 33
    .line 34
    if-ne p0, p1, :cond_1

    .line 35
    .line 36
    move v1, v2

    .line 37
    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
