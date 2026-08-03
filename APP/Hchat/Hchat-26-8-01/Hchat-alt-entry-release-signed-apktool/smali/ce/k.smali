.class public final synthetic Lce/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lud/a;


# direct methods
.method public synthetic constructor <init>(Lud/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Lce/k;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lce/k;->b:Lud/a;

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
    .locals 3

    .line 1
    iget v0, p0, Lce/k;->a:I

    .line 2
    .line 3
    check-cast p1, Lud/a;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, Lud/a;->n:Ljava/util/List;

    .line 9
    .line 10
    iget-object v1, p0, Lce/k;->b:Lud/a;

    .line 11
    .line 12
    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lud/a;->H()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    iget-object v0, p0, Lce/k;->b:Lud/a;

    .line 20
    .line 21
    iget-object v1, v0, Lud/a;->p:Ljava/util/BitSet;

    .line 22
    .line 23
    iget v2, p1, Lud/a;->j:I

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->get(I)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    if-ne v0, p1, :cond_1

    .line 32
    .line 33
    :cond_0
    sget-object v1, Lmd/a;->k:Lmd/a;

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Lmd/e;->w(Lmd/a;)V

    .line 36
    .line 37
    .line 38
    sget-object v1, Lmd/a;->l:Lmd/a;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lmd/e;->w(Lmd/a;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1, v0}, La/a;->P(Lud/a;Lud/a;)Ljava/util/HashSet;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    new-instance v2, Lnd/t;

    .line 48
    .line 49
    invoke-direct {v2, v1, p1, v0}, Lnd/t;-><init>(Ljava/util/HashSet;Lud/a;Lud/a;)V

    .line 50
    .line 51
    .line 52
    sget-object v1, Lmd/b;->z:Lmd/b;

    .line 53
    .line 54
    invoke-virtual {p1, v1, v2}, Lmd/e;->x(Lmd/b;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1, v2}, Lmd/e;->x(Lmd/b;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
