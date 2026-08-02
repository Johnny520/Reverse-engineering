.class public final Lky0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lq41;


# instance fields
.field public final synthetic h:I

.field public final i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lky0;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Lky0;->i:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget v0, p0, Lky0;->h:I

    .line 2
    .line 3
    iget-object p0, p0, Lky0;->i:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lt2;

    .line 9
    .line 10
    check-cast p0, Lwf0;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lt2;-><init>(Lwf0;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    check-cast p0, Lc70;

    .line 17
    .line 18
    new-instance v0, Lb70;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lb70;-><init>(Lc70;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_1
    new-instance v0, Lvc0;

    .line 25
    .line 26
    check-cast p0, Lta;

    .line 27
    .line 28
    iget-object p0, p0, Lta;->i:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, [Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {p0}, Ltl;->J([Ljava/lang/Object;)Lt2;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-direct {v0, p0}, Lvc0;-><init>(Ljava/util/Iterator;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
