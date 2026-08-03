.class public final synthetic Lce/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lce/e;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lce/e;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lce/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lce/e;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/HashMap;

    .line 9
    .line 10
    check-cast p2, Lud/l;

    .line 11
    .line 12
    invoke-interface {p2}, Lud/l;->f()Lod/c;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v1, v1, Lod/c;->i:Lqd/j;

    .line 17
    .line 18
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    instance-of v1, p2, Lud/g;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    instance-of v1, p1, Ljava/lang/Integer;

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    check-cast p2, Lud/g;

    .line 35
    .line 36
    iget-object v1, p2, Lud/g;->m:Lb5/k;

    .line 37
    .line 38
    invoke-virtual {v1}, Lb5/k;->h()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {v1}, Lb5/k;->c()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_0

    .line 49
    .line 50
    check-cast p1, Ljava/lang/Integer;

    .line 51
    .line 52
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void

    .line 56
    :pswitch_0
    iget-object v0, p0, Lce/e;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ljava/util/ArrayList;

    .line 59
    .line 60
    check-cast p1, Lae/f;

    .line 61
    .line 62
    check-cast p2, Ljava/util/List;

    .line 63
    .line 64
    new-instance v1, Ljava/util/ArrayList;

    .line 65
    .line 66
    const/4 v2, 0x1

    .line 67
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    new-instance p1, Lae/h;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-direct {p1, v2, v1, p2}, Lae/h;-><init>(ILjava/util/List;Ljava/util/List;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :pswitch_1
    iget-object v0, p0, Lce/e;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Lud/r;

    .line 89
    .line 90
    check-cast p1, Lae/f;

    .line 91
    .line 92
    check-cast p2, Ljava/util/List;

    .line 93
    .line 94
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    if-eqz p2, :cond_1

    .line 99
    .line 100
    const/4 p2, 0x1

    .line 101
    iput-boolean p2, p1, Lae/f;->i:Z

    .line 102
    .line 103
    iget-object p2, p1, Lae/f;->d:Ljava/util/ArrayList;

    .line 104
    .line 105
    new-instance v1, Lae/e;

    .line 106
    .line 107
    const/4 v2, 0x0

    .line 108
    invoke-direct {v1, v2}, Lae/e;-><init>(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->forEach(Ljava/util/function/Consumer;)V

    .line 112
    .line 113
    .line 114
    iget-object p2, v0, Lud/r;->B:Lud/a;

    .line 115
    .line 116
    iget-object p1, p1, Lae/f;->c:Lud/a;

    .line 117
    .line 118
    invoke-static {p2, p1}, Lce/m;->p(Lud/a;Lud/a;)V

    .line 119
    .line 120
    .line 121
    :cond_1
    return-void

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
