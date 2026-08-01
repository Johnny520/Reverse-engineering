.class public final Ldc;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lpx0;


# static fields
.field public static final β:Ldc;

.field public static final γ:Ldc;

.field public static final δ:Lwj0;

.field public static final ε:Ldc;


# instance fields
.field public final synthetic α:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldc;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldc;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldc;->β:Ldc;

    .line 8
    .line 9
    new-instance v0, Ldc;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Ldc;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Ldc;->γ:Ldc;

    .line 16
    .line 17
    new-instance v0, Lwj0;

    .line 18
    .line 19
    const/16 v1, 0x15

    .line 20
    .line 21
    invoke-direct {v0, v1}, Lwj0;-><init>(I)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Ldc;->δ:Lwj0;

    .line 25
    .line 26
    new-instance v0, Ldc;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {v0, v1}, Ldc;-><init>(I)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Ldc;->ε:Ldc;

    .line 33
    .line 34
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldc;->α:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ε(Lrx0;Ljava/util/List;J)Lqx0;
    .locals 0

    .line 1
    iget p0, p0, Ldc;->α:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p3, p4}, Lyo;->κ(J)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    invoke-static {p3, p4}, Lyo;->ι(J)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    new-instance p3, Lwj0;

    .line 15
    .line 16
    const/16 p4, 0x15

    .line 17
    .line 18
    invoke-direct {p3, p4}, Lwj0;-><init>(I)V

    .line 19
    .line 20
    .line 21
    sget-object p4, Lkz;->ε:Lkz;

    .line 22
    .line 23
    invoke-interface {p1, p0, p2, p4, p3}, Lrx0;->е(IILjava/util/Map;La80;)Lqx0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :pswitch_0
    invoke-static {p3, p4}, Lyo;->θ(J)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-static {p3, p4}, Lyo;->η(J)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    sget-object p3, Ldc;->δ:Lwj0;

    .line 37
    .line 38
    sget-object p4, Lkz;->ε:Lkz;

    .line 39
    .line 40
    invoke-interface {p1, p0, p2, p4, p3}, Lrx0;->е(IILjava/util/Map;La80;)Lqx0;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_1
    invoke-static {p3, p4}, Lyo;->κ(J)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-static {p3, p4}, Lyo;->ι(J)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    new-instance p3, Lwj0;

    .line 54
    .line 55
    const/16 p4, 0x15

    .line 56
    .line 57
    invoke-direct {p3, p4}, Lwj0;-><init>(I)V

    .line 58
    .line 59
    .line 60
    sget-object p4, Lkz;->ε:Lkz;

    .line 61
    .line 62
    invoke-interface {p1, p0, p2, p4, p3}, Lrx0;->е(IILjava/util/Map;La80;)Lqx0;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
