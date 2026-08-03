.class public final Lw/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lfg/l;Lfg/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lw/q;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lw/q;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lw/q;->b:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p2, p0, Lw/q;->a:I

    iput-object p1, p0, Lw/q;->b:Ljava/lang/Object;

    iput-object p3, p0, Lw/q;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ls1/x;Lwf/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lw/q;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ld9/k;

    .line 7
    .line 8
    iget-object v1, p0, Lw/q;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lfg/l;

    .line 11
    .line 12
    iget-object v2, p0, Lw/q;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lfg/a;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x5

    .line 18
    invoke-direct {v0, v1, v2, v3, v4}, Ld9/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v0, p2}, La/a;->n(Ls1/x;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :pswitch_0
    new-instance v0, Lwb/go;

    .line 27
    .line 28
    iget-object v1, p0, Lw/q;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lwb/t4;

    .line 31
    .line 32
    iget-object v2, p0, Lw/q;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Lfg/l;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-direct {v0, v1, v2, v3}, Lwb/go;-><init>(Lwb/t4;Lfg/l;Lwf/c;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v0, p2}, La/a;->n(Ls1/x;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :pswitch_1
    new-instance v0, Lw/e0;

    .line 46
    .line 47
    iget-object v1, p0, Lw/q;->b:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v2, v1

    .line 50
    check-cast v2, Lw/y0;

    .line 51
    .line 52
    iget-object v1, p0, Lw/q;->c:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v3, v1

    .line 55
    check-cast v3, Lh0/d1;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v5, 0x0

    .line 59
    move-object v1, p1

    .line 60
    invoke-direct/range {v0 .. v5}, Lw/e0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0, p2}, Lqg/v;->e(Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 68
    .line 69
    if-ne p1, p2, :cond_0

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 73
    .line 74
    :goto_0
    return-object p1

    .line 75
    :pswitch_2
    move-object v1, p1

    .line 76
    iget-object p1, p0, Lw/q;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, Li0/a1;

    .line 79
    .line 80
    iget-object v0, p0, Lw/q;->c:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Lfg/l;

    .line 83
    .line 84
    new-instance v2, Lw/o;

    .line 85
    .line 86
    const/4 v3, 0x1

    .line 87
    invoke-direct {v2, p1, v0, v3}, Lw/o;-><init>(Li0/a1;Lfg/l;I)V

    .line 88
    .line 89
    .line 90
    const/4 p1, 0x7

    .line 91
    const/4 v0, 0x0

    .line 92
    invoke-static {v1, v0, v2, p2, p1}, Lm/y2;->d(Ls1/x;Lwb/l7;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 97
    .line 98
    if-ne p1, p2, :cond_1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 102
    .line 103
    :goto_1
    return-object p1

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
