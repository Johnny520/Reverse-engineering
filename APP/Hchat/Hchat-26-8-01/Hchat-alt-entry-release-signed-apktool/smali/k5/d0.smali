.class public final Lk5/d0;
.super Lo5/r;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Landroidx/lifecycle/x;III)V
    .locals 0

    .line 1
    iput p5, p0, Lk5/d0;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lk5/d0;->k:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0, p2, p3, p4}, Lo5/r;-><init>(Landroidx/lifecycle/x;II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La5/a;I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget p2, p0, Lk5/d0;->j:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lk5/d0;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p2, Lp5/b;

    .line 9
    .line 10
    iget-object p2, p2, Lp5/b;->g:Lk5/u;

    .line 11
    .line 12
    invoke-static {p2, p1}, Lfb/v0;->J(Lk5/u;La5/a;)Lw5/a;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p2, Lk5/g0;

    .line 18
    .line 19
    iget-object v0, p0, Lk5/d0;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lk5/f0;

    .line 22
    .line 23
    iget-object v0, v0, Lk5/f0;->a:Lk5/u;

    .line 24
    .line 25
    invoke-direct {p2, v0, p1}, Lk5/g0;-><init>(Lk5/u;La5/a;)V

    .line 26
    .line 27
    .line 28
    return-object p2

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
