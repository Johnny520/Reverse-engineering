.class public final Lke/a;
.super Lr9/e0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic j:I

.field public final k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lke/a;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lke/a;->k:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lud/r;Lud/n;)Z
    .locals 1

    .line 1
    iget v0, p0, Lke/a;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lr9/e0;->a(Lud/r;Lud/n;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    iget-object p1, p0, Lke/a;->k:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lce/a;

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lce/a;->test(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lud/r;Lud/n;)V
    .locals 6

    .line 1
    iget v0, p0, Lke/a;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    instance-of v0, p2, Lxd/d;

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    check-cast p2, Lxd/d;

    .line 12
    .line 13
    iget-object v0, p0, Lke/a;->k:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/util/function/Supplier;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lke/k;

    .line 22
    .line 23
    iput-object p2, v0, Lke/k;->l:Lxd/d;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    move v2, v1

    .line 27
    :goto_0
    invoke-static {p1, v0, p2}, Lx6/d;->h0(Lud/r;Lke/e;Lud/j;)V

    .line 28
    .line 29
    .line 30
    iget-boolean v3, v0, Lke/k;->m:Z

    .line 31
    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    iput-boolean v1, v0, Lke/k;->m:Z

    .line 35
    .line 36
    iget-object v3, v0, Lke/k;->j:Ljava/util/HashSet;

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/util/HashSet;->clear()V

    .line 39
    .line 40
    .line 41
    iget-object v3, v0, Lke/k;->k:Ljava/util/HashSet;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/util/HashSet;->clear()V

    .line 44
    .line 45
    .line 46
    const/4 v3, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    move v3, v1

    .line 49
    :goto_1
    add-int/lit8 v4, v2, 0x1

    .line 50
    .line 51
    const/16 v5, 0x14

    .line 52
    .line 53
    if-le v2, v5, :cond_1

    .line 54
    .line 55
    const-string p2, "Unexpected iteration count in SwitchBreakVisitor. Please report as an issue"

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_1
    if-nez v3, :cond_2

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    move v2, v4

    .line 65
    goto :goto_0

    .line 66
    :cond_3
    :goto_2
    return-void

    .line 67
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lud/r;Lud/h;)V
    .locals 0

    .line 1
    iget p1, p0, Lke/a;->j:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    return-void

    .line 7
    :pswitch_1
    instance-of p1, p2, Lud/a;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lke/a;->k:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lae/g;

    .line 14
    .line 15
    check-cast p2, Lud/a;

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Lae/g;->accept(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :pswitch_2
    iget-object p1, p0, Lke/a;->k:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, Ljava/util/function/Consumer;

    .line 24
    .line 25
    invoke-interface {p1, p2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_3
    instance-of p1, p2, Lud/a;

    .line 30
    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    check-cast p2, Lud/a;

    .line 35
    .line 36
    iget-object p1, p0, Lke/a;->k:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Ljava/util/HashSet;

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :goto_0
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
