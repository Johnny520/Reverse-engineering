.class public final synthetic Lhf;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lin0;

.field public final synthetic j:Lc73;


# direct methods
.method public synthetic constructor <init>(Lin0;Lc73;I)V
    .locals 0

    .line 1
    iput p3, p0, Lhf;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lhf;->i:Lin0;

    .line 4
    .line 5
    iput-object p2, p0, Lhf;->j:Lc73;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lhf;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object v2, p0, Lhf;->i:Lin0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    const/4 v7, 0x0

    .line 17
    const/16 v8, 0xb

    .line 18
    .line 19
    iget-object v3, p0, Lhf;->j:Lc73;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-static/range {v3 .. v8}, Lc73;->a(Lc73;IIZLb73;I)Lc73;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {v2, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :pswitch_0
    check-cast p1, Lpf;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget v4, p1, Lpf;->h:I

    .line 37
    .line 38
    const/4 v7, 0x0

    .line 39
    const/16 v8, 0xe

    .line 40
    .line 41
    iget-object v3, p0, Lhf;->j:Lc73;

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, 0x0

    .line 45
    invoke-static/range {v3 .. v8}, Lc73;->a(Lc73;IIZLb73;I)Lc73;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-interface {v2, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    return-object v1

    .line 53
    :pswitch_1
    check-cast p1, Lx51;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget v5, p1, Lx51;->h:I

    .line 59
    .line 60
    const/4 v7, 0x0

    .line 61
    const/16 v8, 0xd

    .line 62
    .line 63
    iget-object v3, p0, Lhf;->j:Lc73;

    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    const/4 v6, 0x0

    .line 67
    invoke-static/range {v3 .. v8}, Lc73;->a(Lc73;IIZLb73;I)Lc73;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-interface {v2, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    return-object v1

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
