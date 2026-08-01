.class public final Lcu;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lss1;


# instance fields
.field public final synthetic α:I

.field public final β:Ljava/lang/Object;

.field public final γ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcu;->α:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcu;->β:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object p1, Lr30;->ε:Lr30;

    .line 10
    .line 11
    iput-object p1, p0, Lcu;->γ:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 14
    iput p2, p0, Lcu;->α:I

    iput-object p1, p0, Lcu;->β:Ljava/lang/Object;

    iput-object p3, p0, Lcu;->γ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget v0, p0, Lcu;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcu;->β:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lss1;

    .line 9
    .line 10
    invoke-static {v0}, Lus1;->Η(Lss1;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object p0, p0, Lcu;->γ:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/util/Comparator;

    .line 17
    .line 18
    invoke-static {v0, p0}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    new-instance v0, Lf90;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lf90;-><init>(Lcu;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_1
    new-instance v0, Lp30;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Lp30;-><init>(Lcu;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_2
    new-instance v0, Lbu;

    .line 39
    .line 40
    iget-object v1, p0, Lcu;->β:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Lss1;

    .line 43
    .line 44
    invoke-interface {v1}, Lss1;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object p0, p0, Lcu;->γ:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, La80;

    .line 51
    .line 52
    invoke-direct {v0, v1, p0}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
