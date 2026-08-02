.class public final synthetic Llg1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lfa1;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Llg1;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Llg1;->i:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final g(Lia1;Lz91;)V
    .locals 0

    .line 1
    iget p1, p0, Llg1;->h:I

    .line 2
    .line 3
    iget-object p0, p0, Llg1;->i:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lo2;

    .line 9
    .line 10
    sget-object p1, Lz91;->ON_DESTROY:Lz91;

    .line 11
    .line 12
    if-ne p2, p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lo2;->f()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :pswitch_0
    check-cast p0, Lsc2;

    .line 19
    .line 20
    sget-object p1, Lz91;->ON_START:Lz91;

    .line 21
    .line 22
    if-ne p2, p1, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    iput-boolean p1, p0, Lsc2;->h:Z

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    sget-object p1, Lz91;->ON_STOP:Lz91;

    .line 29
    .line 30
    if-ne p2, p1, :cond_2

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    iput-boolean p1, p0, Lsc2;->h:Z

    .line 34
    .line 35
    :cond_2
    :goto_0
    return-void

    .line 36
    :pswitch_1
    check-cast p0, Lng1;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    sget-object p1, Lz91;->ON_DESTROY:Lz91;

    .line 42
    .line 43
    if-ne p2, p1, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0}, Lng1;->a()V

    .line 46
    .line 47
    .line 48
    :cond_3
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
