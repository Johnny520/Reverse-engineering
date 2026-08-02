.class public final synthetic La02;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lxk1;


# direct methods
.method public synthetic constructor <init>(Lxk1;I)V
    .locals 0

    .line 1
    iput p2, p0, La02;->h:I

    .line 2
    .line 3
    iput-object p1, p0, La02;->i:Lxk1;

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
    .locals 3

    .line 1
    iget v0, p0, La02;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, La83;->a:La83;

    .line 5
    .line 6
    iget-object p0, p0, La02;->i:Lxk1;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, Lfe0;->h:Lfe0;

    .line 12
    .line 13
    invoke-interface {p0, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v2

    .line 17
    :pswitch_0
    invoke-interface {p0, v1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v2

    .line 21
    :pswitch_1
    invoke-interface {p0, v1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object v2

    .line 25
    :pswitch_2
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Lc61;

    .line 30
    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    move-object v1, p0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const-string p0, "Required value was null."

    .line 36
    .line 37
    invoke-static {p0}, Lnz0;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Ls;->b()V

    .line 41
    .line 42
    .line 43
    :goto_0
    return-object v1

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
