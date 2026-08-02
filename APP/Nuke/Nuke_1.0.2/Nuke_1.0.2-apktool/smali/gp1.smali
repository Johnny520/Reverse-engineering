.class public final synthetic Lgp1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lxm0;


# direct methods
.method public synthetic constructor <init>(Lxm0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lgp1;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lgp1;->i:Lxm0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lgp1;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object p0, p0, Lgp1;->i:Lxm0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Le70;

    .line 11
    .line 12
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lrs1;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    check-cast p1, Lzn2;

    .line 20
    .line 21
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    move-object v0, p0

    .line 26
    check-cast v0, Ljava/lang/Number;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 p0, 0x0

    .line 40
    :goto_0
    check-cast p0, Ljava/lang/Float;

    .line 41
    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const/4 p0, 0x0

    .line 50
    :goto_1
    new-instance v0, Ltt;

    .line 51
    .line 52
    const/high16 v2, 0x3f800000    # 1.0f

    .line 53
    .line 54
    invoke-direct {v0, v2}, Ltt;-><init>(F)V

    .line 55
    .line 56
    .line 57
    new-instance v2, Ls32;

    .line 58
    .line 59
    invoke-direct {v2, p0, v0}, Ls32;-><init>(FLtt;)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Lxn2;->a:[Lv41;

    .line 63
    .line 64
    sget-object p0, Lvn2;->c:Lyn2;

    .line 65
    .line 66
    sget-object v0, Lxn2;->a:[Lv41;

    .line 67
    .line 68
    const/4 v3, 0x1

    .line 69
    aget-object v0, v0, v3

    .line 70
    .line 71
    invoke-interface {p1, p0, v2}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-object v1

    .line 75
    :pswitch_1
    check-cast p1, Lrs1;

    .line 76
    .line 77
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    return-object v1

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
