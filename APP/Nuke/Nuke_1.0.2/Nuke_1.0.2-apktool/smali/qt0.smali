.class public final synthetic Lqt0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lep1;

.field public final synthetic j:Lxk1;

.field public final synthetic k:Lxk1;


# direct methods
.method public synthetic constructor <init>(Lep1;Lxk1;Lxk1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lqt0;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lqt0;->i:Lep1;

    .line 4
    .line 5
    iput-object p2, p0, Lqt0;->j:Lxk1;

    .line 6
    .line 7
    iput-object p3, p0, Lqt0;->k:Lxk1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lqt0;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object v2, p0, Lqt0;->k:Lxk1;

    .line 6
    .line 7
    iget-object v3, p0, Lqt0;->j:Lxk1;

    .line 8
    .line 9
    iget-object p0, p0, Lqt0;->i:Lep1;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Lyp2;

    .line 15
    .line 16
    check-cast p2, Lrs1;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-wide v4, p2, Lrs1;->a:J

    .line 22
    .line 23
    new-instance p2, Ls1;

    .line 24
    .line 25
    const/16 v0, 0xb

    .line 26
    .line 27
    invoke-direct {p2, p1, v3, v2, v0}, Ls1;-><init>(Ljava/lang/Object;Lxk1;Lxk1;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v4, v5, p2}, Lep1;->e(JLxm0;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_0
    check-cast p1, Lwm0;

    .line 35
    .line 36
    check-cast p2, Lrs1;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-wide v4, p2, Lrs1;->a:J

    .line 42
    .line 43
    new-instance p2, Ls1;

    .line 44
    .line 45
    const/16 v0, 0xc

    .line 46
    .line 47
    invoke-direct {p2, p1, v3, v2, v0}, Ls1;-><init>(Ljava/lang/Object;Lxk1;Lxk1;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v4, v5, p2}, Lep1;->e(JLxm0;)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
