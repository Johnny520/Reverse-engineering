.class public final synthetic Lwb/o8;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Lfg/p;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lfg/p;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/o8;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/o8;->h:Ljava/util/List;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/o8;->i:Lfg/p;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lwb/o8;->g:I

    .line 2
    .line 3
    check-cast p1, Lr/h;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object v0, Lwb/p0;->Q2:Ls0/d;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x3

    .line 15
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lwb/nc;

    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    iget-object v4, p0, Lwb/o8;->h:Ljava/util/List;

    .line 22
    .line 23
    iget-object v5, p0, Lwb/o8;->i:Lfg/p;

    .line 24
    .line 25
    invoke-direct {v0, v4, v5, v3}, Lwb/nc;-><init>(Ljava/util/List;Lfg/p;I)V

    .line 26
    .line 27
    .line 28
    new-instance v3, Ls0/d;

    .line 29
    .line 30
    const v4, -0x691ab91c

    .line 31
    .line 32
    .line 33
    const/4 v5, 0x1

    .line 34
    invoke-direct {v3, v4, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 38
    .line 39
    .line 40
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    sget-object v0, Lwb/p0;->H4:Ls0/d;

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    const/4 v2, 0x3

    .line 50
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 51
    .line 52
    .line 53
    new-instance v0, Lwb/nc;

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    iget-object v4, p0, Lwb/o8;->h:Ljava/util/List;

    .line 57
    .line 58
    iget-object v5, p0, Lwb/o8;->i:Lfg/p;

    .line 59
    .line 60
    invoke-direct {v0, v4, v5, v3}, Lwb/nc;-><init>(Ljava/util/List;Lfg/p;I)V

    .line 61
    .line 62
    .line 63
    new-instance v3, Ls0/d;

    .line 64
    .line 65
    const v4, -0xda32411

    .line 66
    .line 67
    .line 68
    const/4 v5, 0x1

    .line 69
    invoke-direct {v3, v4, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 70
    .line 71
    .line 72
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    sget-object v0, Lwb/p0;->s5:Ls0/d;

    .line 80
    .line 81
    const/4 v1, 0x0

    .line 82
    const/4 v2, 0x3

    .line 83
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 84
    .line 85
    .line 86
    new-instance v0, Lwb/nc;

    .line 87
    .line 88
    const/4 v3, 0x1

    .line 89
    iget-object v4, p0, Lwb/o8;->h:Ljava/util/List;

    .line 90
    .line 91
    iget-object v5, p0, Lwb/o8;->i:Lfg/p;

    .line 92
    .line 93
    invoke-direct {v0, v4, v5, v3}, Lwb/nc;-><init>(Ljava/util/List;Lfg/p;I)V

    .line 94
    .line 95
    .line 96
    new-instance v3, Ls0/d;

    .line 97
    .line 98
    const v4, 0x41e0f09f

    .line 99
    .line 100
    .line 101
    const/4 v5, 0x1

    .line 102
    invoke-direct {v3, v4, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 103
    .line 104
    .line 105
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
