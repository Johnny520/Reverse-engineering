.class public final Lvu2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ljava/util/WeakHashMap;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lvu2;->a:Ljava/lang/Object;

    .line 13
    .line 14
    new-instance p1, Ljava/util/WeakHashMap;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lvu2;->b:Ljava/lang/Object;

    .line 20
    .line 21
    new-instance p1, Ljava/util/WeakHashMap;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lvu2;->c:Ljava/lang/Object;

    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    new-instance p1, Ly63;

    .line 30
    .line 31
    const/4 v0, 0x7

    .line 32
    invoke-direct {p1, v0}, Ly63;-><init>(I)V

    .line 33
    .line 34
    .line 35
    sget-object v0, Ltc3;->o:Ltc3;

    .line 36
    .line 37
    new-instance v1, Ly63;

    .line 38
    .line 39
    const/16 v2, 0x8

    .line 40
    .line 41
    invoke-direct {v1, v2}, Ly63;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lvu2;->a:Ljava/lang/Object;

    .line 48
    .line 49
    iput-object v0, p0, Lvu2;->b:Ljava/lang/Object;

    .line 50
    .line 51
    iput-object v1, p0, Lvu2;->c:Ljava/lang/Object;

    .line 52
    .line 53
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lb5;[ILb5;)V
    .locals 1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    if-eqz p3, :cond_0

    .line 56
    iput-object p1, p0, Lvu2;->a:Ljava/lang/Object;

    .line 57
    iput-object p2, p0, Lvu2;->b:Ljava/lang/Object;

    .line 58
    iput-object p3, p0, Lvu2;->c:Ljava/lang/Object;

    return-void

    .line 59
    :cond_0
    const-string p0, "addresses == null"

    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    throw v0

    .line 60
    :cond_1
    const-string p0, "order == null"

    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Lm63;Lvu2;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lvu2;->a:Ljava/lang/Object;

    .line 63
    iput-object p2, p0, Lvu2;->b:Ljava/lang/Object;

    .line 64
    iget-object p1, p1, Lm63;->h:Ljava/lang/Object;

    .line 65
    iput-object p1, p0, Lvu2;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lvu2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lgu2;

    .line 4
    .line 5
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lvu2;->c:Ljava/lang/Object;

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Lvu2;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lvu2;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lvu2;->a()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0
.end method
