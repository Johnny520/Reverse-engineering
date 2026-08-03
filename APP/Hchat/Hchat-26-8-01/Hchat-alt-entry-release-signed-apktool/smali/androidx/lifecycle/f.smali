.class public final Landroidx/lifecycle/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroidx/lifecycle/o;


# instance fields
.field public final synthetic g:I

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/d;Landroidx/lifecycle/o;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/lifecycle/f;->g:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Landroidx/lifecycle/f;->h:Ljava/lang/Object;

    .line 36
    iput-object p2, p0, Landroidx/lifecycle/f;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/p;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Landroidx/lifecycle/f;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Landroidx/lifecycle/f;->h:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v0, Landroidx/lifecycle/c;->c:Landroidx/lifecycle/c;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v1, v0, Landroidx/lifecycle/c;->a:Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroidx/lifecycle/a;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/c;->a(Ljava/lang/Class;[Ljava/lang/reflect/Method;)Landroidx/lifecycle/a;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :goto_0
    iput-object v1, p0, Landroidx/lifecycle/f;->i:Ljava/lang/Object;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/q;Landroidx/lifecycle/k;)V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/lifecycle/f;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/lifecycle/f;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/lifecycle/a;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/lifecycle/a;->a:Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ljava/util/List;

    .line 17
    .line 18
    iget-object v2, p0, Landroidx/lifecycle/f;->h:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-static {v1, p1, p2, v2}, Landroidx/lifecycle/a;->a(Ljava/util/List;Landroidx/lifecycle/q;Landroidx/lifecycle/k;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object v1, Landroidx/lifecycle/k;->ON_ANY:Landroidx/lifecycle/k;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/util/List;

    .line 30
    .line 31
    invoke-static {v0, p1, p2, v2}, Landroidx/lifecycle/a;->a(Ljava/util/List;Landroidx/lifecycle/q;Landroidx/lifecycle/k;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_0
    iget-object v0, p0, Landroidx/lifecycle/f;->h:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Landroidx/lifecycle/d;

    .line 38
    .line 39
    sget-object v1, Landroidx/lifecycle/e;->a:[I

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    aget v1, v1, v2

    .line 46
    .line 47
    packed-switch v1, :pswitch_data_1

    .line 48
    .line 49
    .line 50
    invoke-static {}, Lokio/a;->k()V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :pswitch_1
    const-string p1, "ON_ANY must not been send by anybody"

    .line 55
    .line 56
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :pswitch_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :pswitch_3
    invoke-interface {v0, p1}, Landroidx/lifecycle/d;->c(Landroidx/lifecycle/q;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :pswitch_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :pswitch_5
    invoke-interface {v0, p1}, Landroidx/lifecycle/d;->a(Landroidx/lifecycle/q;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :pswitch_6
    invoke-interface {v0, p1}, Landroidx/lifecycle/d;->d(Landroidx/lifecycle/q;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :pswitch_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    :goto_0
    iget-object v0, p0, Landroidx/lifecycle/f;->i:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Landroidx/lifecycle/o;

    .line 86
    .line 87
    if-eqz v0, :cond_0

    .line 88
    .line 89
    invoke-interface {v0, p1, p2}, Landroidx/lifecycle/o;->b(Landroidx/lifecycle/q;Landroidx/lifecycle/k;)V

    .line 90
    .line 91
    .line 92
    :cond_0
    :goto_1
    return-void

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
