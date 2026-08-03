.class public final synthetic Lbe/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lbe/m;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lbe/m;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lbe/m;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lbe/m;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbe/m;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lfe/a;

    .line 9
    .line 10
    iget-object v1, p0, Lbe/m;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/Map;

    .line 13
    .line 14
    check-cast p1, Lqd/j;

    .line 15
    .line 16
    invoke-virtual {v0, p1, v1}, Lfe/a;->m(Lqd/j;Ljava/util/Map;)Lqd/j;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v0

    .line 24
    :goto_0
    return-object p1

    .line 25
    :pswitch_0
    iget-object v0, p0, Lbe/m;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Class;

    .line 28
    .line 29
    iget-object v1, p0, Lbe/m;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Ljava/util/function/Predicate;

    .line 32
    .line 33
    check-cast p1, Lr7/m;

    .line 34
    .line 35
    invoke-interface {p1, v0}, Lr7/m;->d(Ljava/lang/Class;)Lk7/a;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-interface {v1, p1}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    :cond_1
    const/4 p1, 0x0

    .line 50
    :cond_2
    return-object p1

    .line 51
    :pswitch_1
    iget-object v0, p0, Lbe/m;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lfe/a;

    .line 54
    .line 55
    iget-object v1, p0, Lbe/m;->c:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Lud/r;

    .line 58
    .line 59
    check-cast p1, Lqd/j;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {v1, p1}, Lfe/a;->c(Lud/r;Lqd/j;)V

    .line 65
    .line 66
    .line 67
    return-object p1

    .line 68
    :pswitch_2
    iget-object v0, p0, Lbe/m;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Lpd/k;

    .line 71
    .line 72
    iget-object v1, p0, Lbe/m;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, Ljava/util/Set;

    .line 75
    .line 76
    check-cast p1, Lud/p;

    .line 77
    .line 78
    iget-object v2, p1, Lud/p;->k:Lpd/k;

    .line 79
    .line 80
    if-ne v2, v0, :cond_3

    .line 81
    .line 82
    check-cast p1, Lpd/j;

    .line 83
    .line 84
    iget-object p1, p1, Lpd/j;->o:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p1, Lod/c;

    .line 87
    .line 88
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_3

    .line 93
    .line 94
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    const/4 p1, 0x0

    .line 98
    :goto_1
    return-object p1

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
