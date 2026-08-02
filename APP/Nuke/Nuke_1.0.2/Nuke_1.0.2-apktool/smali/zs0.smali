.class public final synthetic Lzs0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lnuke/ui/HomeActivity;

.field public final synthetic j:Lxk1;


# direct methods
.method public synthetic constructor <init>(Lnuke/ui/HomeActivity;Lxk1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lzs0;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lzs0;->i:Lnuke/ui/HomeActivity;

    .line 4
    .line 5
    iput-object p2, p0, Lzs0;->j:Lxk1;

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
    .locals 1

    .line 1
    iget v0, p0, Lzs0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lzs0;->j:Lxk1;

    .line 7
    .line 8
    check-cast p1, Lc73;

    .line 9
    .line 10
    iget-object p0, p0, Lzs0;->i:Lnuke/ui/HomeActivity;

    .line 11
    .line 12
    invoke-static {p0, v0, p1}, Lnuke/ui/HomeActivity;->h(Lnuke/ui/HomeActivity;Lxk1;Lc73;)La83;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget-object v0, p0, Lzs0;->i:Lnuke/ui/HomeActivity;

    .line 24
    .line 25
    iget-object p0, p0, Lzs0;->j:Lxk1;

    .line 26
    .line 27
    invoke-static {v0, p0, p1}, Lnuke/ui/HomeActivity;->i(Lnuke/ui/HomeActivity;Lxk1;Z)La83;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
