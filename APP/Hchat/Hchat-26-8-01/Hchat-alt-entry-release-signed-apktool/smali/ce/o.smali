.class public final synthetic Lce/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lud/a;


# direct methods
.method public synthetic constructor <init>(Lud/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Lce/o;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lce/o;->h:Lud/a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget v0, p0, Lce/o;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lae/f;

    .line 7
    .line 8
    iget-object p1, p1, Lae/f;->c:Lud/a;

    .line 9
    .line 10
    iget-object v0, p0, Lce/o;->h:Lud/a;

    .line 11
    .line 12
    invoke-static {p1, v0}, La/a;->s0(Lud/a;Lud/a;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :pswitch_0
    check-cast p1, Lud/f;

    .line 18
    .line 19
    iget-object p1, p1, Lud/f;->a:Lud/a;

    .line 20
    .line 21
    iget-object v0, p0, Lce/o;->h:Lud/a;

    .line 22
    .line 23
    if-ne p1, v0, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    :goto_0
    return p1

    .line 29
    :pswitch_1
    iget-object v0, p0, Lce/o;->h:Lud/a;

    .line 30
    .line 31
    check-cast p1, Lud/a;

    .line 32
    .line 33
    if-eq p1, v0, :cond_1

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    const/4 p1, 0x0

    .line 38
    :goto_1
    return p1

    .line 39
    :pswitch_2
    check-cast p1, Lnd/h0;

    .line 40
    .line 41
    iget-object p1, p1, Lnd/h0;->h:Lud/a;

    .line 42
    .line 43
    iget-object v0, p0, Lce/o;->h:Lud/a;

    .line 44
    .line 45
    if-ne p1, v0, :cond_2

    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/4 p1, 0x0

    .line 50
    :goto_2
    return p1

    .line 51
    :pswitch_3
    check-cast p1, Lnd/h0;

    .line 52
    .line 53
    iget-object p1, p1, Lnd/h0;->i:Lud/a;

    .line 54
    .line 55
    iget-object v0, p0, Lce/o;->h:Lud/a;

    .line 56
    .line 57
    if-ne p1, v0, :cond_3

    .line 58
    .line 59
    const/4 p1, 0x1

    .line 60
    goto :goto_3

    .line 61
    :cond_3
    const/4 p1, 0x0

    .line 62
    :goto_3
    return p1

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
