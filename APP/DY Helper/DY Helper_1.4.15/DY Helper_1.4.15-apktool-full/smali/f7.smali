.class public final Lf7;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lss1;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p1, p0, Lf7;->α:I

    iput-object p2, p0, Lf7;->β:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Le80;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lf7;->α:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    check-cast p1, Ldo1;

    .line 8
    .line 9
    iput-object p1, p0, Lf7;->β:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    iget v0, p0, Lf7;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Les0;

    .line 7
    .line 8
    iget-object p0, p0, Lf7;->β:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Ljava/lang/CharSequence;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Les0;-><init>(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    iget-object p0, p0, Lf7;->β:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lss1;

    .line 19
    .line 20
    invoke-static {p0}, Lus1;->Η(Lss1;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    move-object v0, p0

    .line 25
    check-cast v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v2, 0x1

    .line 32
    if-le v1, v2, :cond_0

    .line 33
    .line 34
    invoke-static {p0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :pswitch_1
    iget-object p0, p0, Lf7;->β:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Ljava/util/Iterator;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_2
    iget-object p0, p0, Lf7;->β:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Ldo1;

    .line 50
    .line 51
    invoke-static {p0}, Le81;->ι(Le80;)Lts1;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :pswitch_3
    iget-object p0, p0, Lf7;->β:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Ljava/lang/Iterable;

    .line 59
    .line 60
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_4
    iget-object p0, p0, Lf7;->β:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, [Ljava/lang/Object;

    .line 68
    .line 69
    new-instance v0, Lτ;

    .line 70
    .line 71
    invoke-direct {v0, p0}, Lτ;-><init>([Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
