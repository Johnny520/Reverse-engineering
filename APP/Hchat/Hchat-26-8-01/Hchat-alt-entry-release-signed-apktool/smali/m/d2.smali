.class public final synthetic Lm/d2;
.super Lgg/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, Lm/d2;->n:I

    .line 2
    .line 3
    move-object p7, p4

    .line 4
    move-object p4, p3

    .line 5
    move p3, p6

    .line 6
    move-object p6, p7

    .line 7
    move-object p7, p5

    .line 8
    move-object p5, p2

    .line 9
    move p2, p1

    .line 10
    move-object p1, p0

    .line 11
    invoke-direct/range {p1 .. p7}, Lgg/a;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lm/d2;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Li0/h0;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    iget-object v0, p0, Lgg/a;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ls0/d;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Ls0/d;->f(Li0/h0;I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    check-cast p1, Lu2/q;

    .line 25
    .line 26
    iget-wide v2, p1, Lu2/q;->a:J

    .line 27
    .line 28
    check-cast p2, Lwf/c;

    .line 29
    .line 30
    iget-object p1, p0, Lgg/a;->g:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v1, p1

    .line 33
    check-cast v1, Lm/h2;

    .line 34
    .line 35
    iget-object p1, v1, Lm/h2;->R:Lr1/d;

    .line 36
    .line 37
    invoke-virtual {p1}, Lr1/d;->e()Lqg/t;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    new-instance v0, Lm/f2;

    .line 42
    .line 43
    const/4 v5, 0x1

    .line 44
    const/4 v4, 0x0

    .line 45
    invoke-direct/range {v0 .. v5}, Lm/f2;-><init>(Lm/h2;JLwf/c;I)V

    .line 46
    .line 47
    .line 48
    const/4 p2, 0x3

    .line 49
    invoke-static {p1, v4, v0, p2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 50
    .line 51
    .line 52
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 53
    .line 54
    return-object p1

    .line 55
    :pswitch_1
    check-cast p1, Lu2/q;

    .line 56
    .line 57
    iget-wide v2, p1, Lu2/q;->a:J

    .line 58
    .line 59
    check-cast p2, Lwf/c;

    .line 60
    .line 61
    iget-object p1, p0, Lgg/a;->g:Ljava/lang/Object;

    .line 62
    .line 63
    move-object v1, p1

    .line 64
    check-cast v1, Lm/h2;

    .line 65
    .line 66
    iget-object p1, v1, Lm/h2;->R:Lr1/d;

    .line 67
    .line 68
    invoke-virtual {p1}, Lr1/d;->e()Lqg/t;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    new-instance v0, Lm/f2;

    .line 73
    .line 74
    const/4 v5, 0x2

    .line 75
    const/4 v4, 0x0

    .line 76
    invoke-direct/range {v0 .. v5}, Lm/f2;-><init>(Lm/h2;JLwf/c;I)V

    .line 77
    .line 78
    .line 79
    const/4 p2, 0x3

    .line 80
    invoke-static {p1, v4, v0, p2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 81
    .line 82
    .line 83
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 84
    .line 85
    return-object p1

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
