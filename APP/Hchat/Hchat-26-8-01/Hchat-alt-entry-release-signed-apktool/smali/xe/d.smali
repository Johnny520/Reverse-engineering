.class public final synthetic Lxe/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/BitSet;


# direct methods
.method public synthetic constructor <init>(ILjava/util/BitSet;)V
    .locals 0

    .line 1
    iput p1, p0, Lxe/d;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lxe/d;->b:Ljava/util/BitSet;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lxe/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lud/a;

    .line 7
    .line 8
    iget-object p1, p1, Lud/a;->s:Lud/a;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object v0, p1, Lud/a;->p:Ljava/util/BitSet;

    .line 13
    .line 14
    iget-object v1, p0, Lxe/d;->b:Ljava/util/BitSet;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/util/BitSet;->andNot(Ljava/util/BitSet;)V

    .line 17
    .line 18
    .line 19
    iget p1, p1, Lud/a;->j:I

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/util/BitSet;->clear(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void

    .line 25
    :pswitch_0
    check-cast p1, Lud/a;

    .line 26
    .line 27
    iget-object p1, p1, Lud/a;->p:Ljava/util/BitSet;

    .line 28
    .line 29
    iget-object v0, p0, Lxe/d;->b:Ljava/util/BitSet;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->and(Ljava/util/BitSet;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_1
    check-cast p1, Lud/a;

    .line 36
    .line 37
    iget-object p1, p1, Lud/a;->r:Ljava/util/BitSet;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/util/BitSet;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    iget-object v0, p0, Lxe/d;->b:Ljava/util/BitSet;

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    return-void

    .line 51
    :pswitch_2
    check-cast p1, Lnd/t;

    .line 52
    .line 53
    iget-object p1, p1, Lnd/t;->a:Lud/a;

    .line 54
    .line 55
    iget p1, p1, Lud/a;->j:I

    .line 56
    .line 57
    iget-object v0, p0, Lxe/d;->b:Ljava/util/BitSet;

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
