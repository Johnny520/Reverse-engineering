.class public final Lsw;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lss1;
.implements Ltw;


# instance fields
.field public final synthetic α:I

.field public final β:Lss1;

.field public final γ:I


# direct methods
.method public constructor <init>(Lss1;II)V
    .locals 0

    .line 1
    iput p3, p0, Lsw;->α:I

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lsw;->β:Lss1;

    .line 13
    .line 14
    iput p2, p0, Lsw;->γ:I

    .line 15
    .line 16
    if-ltz p2, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "count must be non-negative, but was "

    .line 20
    .line 21
    const/16 p1, 0x2e

    .line 22
    .line 23
    invoke-static {p2, p1, p0}, Lγ;->γ(IILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    throw p0

    .line 28
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lsw;->β:Lss1;

    .line 32
    .line 33
    iput p2, p0, Lsw;->γ:I

    .line 34
    .line 35
    if-ltz p2, :cond_1

    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    const-string p0, "count must be non-negative, but was "

    .line 39
    .line 40
    const/16 p1, 0x2e

    .line 41
    .line 42
    invoke-static {p2, p1, p0}, Lγ;->γ(IILjava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    throw p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget v0, p0, Lsw;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lrw;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, v1}, Lrw;-><init>(Lsw;B)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :pswitch_0
    new-instance v0, Lrw;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lrw;-><init>(Lsw;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final α(I)Lss1;
    .locals 2

    .line 1
    iget v0, p0, Lsw;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lsw;->γ:I

    .line 7
    .line 8
    if-lt p1, v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance v0, Lsw;

    .line 12
    .line 13
    iget-object p0, p0, Lsw;->β:Lss1;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-direct {v0, p0, p1, v1}, Lsw;-><init>(Lss1;II)V

    .line 17
    .line 18
    .line 19
    move-object p0, v0

    .line 20
    :goto_0
    return-object p0

    .line 21
    :pswitch_0
    iget v0, p0, Lsw;->γ:I

    .line 22
    .line 23
    add-int v1, v0, p1

    .line 24
    .line 25
    if-gez v1, :cond_1

    .line 26
    .line 27
    new-instance v0, Lsw;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-direct {v0, p0, p1, v1}, Lsw;-><init>(Lss1;II)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    new-instance p1, Lc12;

    .line 35
    .line 36
    iget-object p0, p0, Lsw;->β:Lss1;

    .line 37
    .line 38
    invoke-direct {p1, p0, v0, v1}, Lc12;-><init>(Lss1;II)V

    .line 39
    .line 40
    .line 41
    move-object v0, p1

    .line 42
    :goto_1
    return-object v0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final β(I)Lss1;
    .locals 2

    .line 1
    iget v0, p0, Lsw;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lsw;->γ:I

    .line 7
    .line 8
    if-lt p1, v0, :cond_0

    .line 9
    .line 10
    sget-object p0, Lmz;->α:Lmz;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v1, Lc12;

    .line 14
    .line 15
    iget-object p0, p0, Lsw;->β:Lss1;

    .line 16
    .line 17
    invoke-direct {v1, p0, p1, v0}, Lc12;-><init>(Lss1;II)V

    .line 18
    .line 19
    .line 20
    move-object p0, v1

    .line 21
    :goto_0
    return-object p0

    .line 22
    :pswitch_0
    iget v0, p0, Lsw;->γ:I

    .line 23
    .line 24
    add-int/2addr v0, p1

    .line 25
    if-gez v0, :cond_1

    .line 26
    .line 27
    new-instance v0, Lsw;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v0, p0, p1, v1}, Lsw;-><init>(Lss1;II)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    new-instance p1, Lsw;

    .line 35
    .line 36
    iget-object p0, p0, Lsw;->β:Lss1;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-direct {p1, p0, v0, v1}, Lsw;-><init>(Lss1;II)V

    .line 40
    .line 41
    .line 42
    move-object v0, p1

    .line 43
    :goto_1
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
