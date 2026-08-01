.class public final synthetic Lia2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lib2;


# direct methods
.method public synthetic constructor <init>(Lib2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lia2;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lia2;->ζ:Lib2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lia2;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldb2;

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    iget-object p0, p0, Lia2;->ζ:Lib2;

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, Ldb2;-><init>(Lib2;I)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, Ldb2;

    .line 16
    .line 17
    const/4 v1, 0x4

    .line 18
    iget-object p0, p0, Lia2;->ζ:Lib2;

    .line 19
    .line 20
    invoke-direct {v0, p0, v1}, Ldb2;-><init>(Lib2;I)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_1
    new-instance v0, Ldb2;

    .line 25
    .line 26
    const/4 v1, 0x6

    .line 27
    iget-object p0, p0, Lia2;->ζ:Lib2;

    .line 28
    .line 29
    invoke-direct {v0, p0, v1}, Ldb2;-><init>(Lib2;I)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_2
    new-instance v0, Lpy1;

    .line 34
    .line 35
    const/16 v1, 0x1d

    .line 36
    .line 37
    iget-object p0, p0, Lia2;->ζ:Lib2;

    .line 38
    .line 39
    invoke-direct {v0, v1, p0}, Lpy1;-><init>(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_3
    new-instance v0, Ldb2;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    iget-object p0, p0, Lia2;->ζ:Lib2;

    .line 47
    .line 48
    invoke-direct {v0, p0, v1}, Ldb2;-><init>(Lib2;I)V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :pswitch_4
    new-instance v0, Ldb2;

    .line 53
    .line 54
    const/4 v1, 0x3

    .line 55
    iget-object p0, p0, Lia2;->ζ:Lib2;

    .line 56
    .line 57
    invoke-direct {v0, p0, v1}, Ldb2;-><init>(Lib2;I)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :pswitch_5
    new-instance v0, Ldb2;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    iget-object p0, p0, Lia2;->ζ:Lib2;

    .line 65
    .line 66
    invoke-direct {v0, p0, v1}, Ldb2;-><init>(Lib2;I)V

    .line 67
    .line 68
    .line 69
    return-object v0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
