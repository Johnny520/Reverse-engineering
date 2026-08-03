.class public final Lw/f1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lw/f1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lw/f1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lw/f1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lw/f1;->d:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ls1/x;Lwf/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lw/f1;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lw/f1;->d:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lw/f1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lw/f1;->b:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v3, Lu2/c;

    .line 13
    .line 14
    check-cast v2, Lfg/a;

    .line 15
    .line 16
    new-instance v0, Lwb/l7;

    .line 17
    .line 18
    const/16 v4, 0x12

    .line 19
    .line 20
    invoke-direct {v0, v3, v4, v2}, Lwb/l7;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    check-cast v1, Lfg/a;

    .line 24
    .line 25
    new-instance v2, Lh0/g1;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    invoke-direct {v2, v1, v3}, Lh0/g1;-><init>(Lfg/a;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x5

    .line 32
    invoke-static {p1, v0, v2, p2, v1}, Lm/y2;->d(Ls1/x;Lwb/l7;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :pswitch_0
    move-object v0, v2

    .line 38
    new-instance v2, Lw/e1;

    .line 39
    .line 40
    check-cast v3, Lqg/t;

    .line 41
    .line 42
    check-cast v0, Li0/a1;

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    invoke-direct {v2, v3, v0, v4}, Lw/e1;-><init>(Lqg/t;Li0/a1;Lwf/c;)V

    .line 46
    .line 47
    .line 48
    check-cast v1, Li0/a1;

    .line 49
    .line 50
    new-instance v3, Lb0/l;

    .line 51
    .line 52
    const/16 v0, 0xf

    .line 53
    .line 54
    invoke-direct {v3, v1, v0}, Lb0/l;-><init>(Li0/a1;I)V

    .line 55
    .line 56
    .line 57
    sget-object v0, Lm/y2;->a:Lm/r0;

    .line 58
    .line 59
    new-instance v4, Lm/t1;

    .line 60
    .line 61
    invoke-direct {v4, p1}, Lm/t1;-><init>(Lu2/c;)V

    .line 62
    .line 63
    .line 64
    new-instance v0, Lf0/b;

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    const/4 v6, 0x3

    .line 68
    move-object v1, p1

    .line 69
    invoke-direct/range {v0 .. v6}, Lf0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 70
    .line 71
    .line 72
    invoke-static {v0, p2}, Lqg/v;->e(Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 77
    .line 78
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 79
    .line 80
    if-ne p1, v0, :cond_0

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    move-object p1, p2

    .line 84
    :goto_0
    if-ne p1, v0, :cond_1

    .line 85
    .line 86
    move-object p2, p1

    .line 87
    :cond_1
    return-object p2

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
