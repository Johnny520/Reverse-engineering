.class public final synthetic Lbe/z;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/HashSet;


# direct methods
.method public synthetic constructor <init>(Ljava/util/HashSet;I)V
    .locals 0

    .line 1
    iput p2, p0, Lbe/z;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lbe/z;->b:Ljava/util/HashSet;

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
    iget v0, p0, Lbe/z;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lqd/l;

    .line 7
    .line 8
    instance-of v0, p1, Lqd/o;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p1, Lqd/o;

    .line 13
    .line 14
    invoke-interface {p1}, Lqd/o;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lbe/z;->b:Ljava/util/HashSet;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :pswitch_0
    check-cast p1, Lqd/j;

    .line 27
    .line 28
    new-instance v0, Lbe/l0;

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    iget-object v2, p0, Lbe/z;->b:Ljava/util/HashSet;

    .line 32
    .line 33
    invoke-direct {v0, v2, v1}, Lbe/l0;-><init>(Ljava/util/HashSet;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lqd/j;->C(Ljava/util/function/Function;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_1
    iget-object v0, p0, Lbe/z;->b:Ljava/util/HashSet;

    .line 41
    .line 42
    check-cast p1, Lqd/r;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_2
    iget-object v0, p0, Lbe/z;->b:Ljava/util/HashSet;

    .line 49
    .line 50
    check-cast p1, Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
