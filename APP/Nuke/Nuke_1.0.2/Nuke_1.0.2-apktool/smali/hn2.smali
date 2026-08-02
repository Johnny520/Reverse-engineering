.class public final synthetic Lhn2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lgu2;


# direct methods
.method public synthetic constructor <init>(Lgu2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lhn2;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lhn2;->i:Lgu2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lhn2;->h:I

    .line 2
    .line 3
    iget-object p0, p0, Lhn2;->i:Lgu2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, Lin2;->a:Lkd;

    .line 9
    .line 10
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lrs1;

    .line 15
    .line 16
    iget-wide v0, p0, Lrs1;->a:J

    .line 17
    .line 18
    new-instance p0, Lrs1;

    .line 19
    .line 20
    invoke-direct {p0, v0, v1}, Lrs1;-><init>(J)V

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_0
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lrs1;

    .line 29
    .line 30
    iget-wide v0, p0, Lrs1;->a:J

    .line 31
    .line 32
    new-instance p0, Lrs1;

    .line 33
    .line 34
    invoke-direct {p0, v0, v1}, Lrs1;-><init>(J)V

    .line 35
    .line 36
    .line 37
    return-object p0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
