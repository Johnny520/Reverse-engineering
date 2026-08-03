.class public final synthetic Lwb/jj;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/jj;->g:I

    .line 2
    .line 3
    iput-object p3, p0, Lwb/jj;->h:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 9
    iput p2, p0, Lwb/jj;->g:I

    iput-object p1, p0, Lwb/jj;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwb/jj;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/jj;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Li0/f1;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Float;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    check-cast p2, Ljava/lang/Float;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Li0/f1;->h(F)V

    .line 22
    .line 23
    .line 24
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_0
    iget-object v0, p0, Lwb/jj;->h:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lxb/o;

    .line 30
    .line 31
    check-cast p1, Ls1/t;

    .line 32
    .line 33
    check-cast p2, Le1/b;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object p2, v0, Lxb/o;->a:Lqg/t;

    .line 39
    .line 40
    new-instance v1, Lci/j;

    .line 41
    .line 42
    const/16 v2, 0x19

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-direct {v1, v0, p1, v3, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x3

    .line 49
    invoke-static {p2, v3, v1, p1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_1
    iget-object v0, p0, Lwb/jj;->h:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lwb/s0;

    .line 56
    .line 57
    check-cast p1, Li0/h0;

    .line 58
    .line 59
    check-cast p2, Ljava/lang/Integer;

    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    const/4 p2, 0x1

    .line 65
    invoke-static {p2}, Li0/r;->C(I)I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    invoke-static {v0, p1, p2}, Lwb/ho;->W(Lwb/s0;Li0/h0;I)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :pswitch_2
    iget-object v0, p0, Lwb/jj;->h:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lx8/y;

    .line 76
    .line 77
    check-cast p1, Li0/h0;

    .line 78
    .line 79
    check-cast p2, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    const/4 p2, 0x1

    .line 85
    invoke-static {p2}, Li0/r;->C(I)I

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    invoke-static {v0, p1, p2}, Lwb/ho;->p4(Lx8/y;Li0/h0;I)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :pswitch_3
    iget-object v0, p0, Lwb/jj;->h:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Ljava/lang/String;

    .line 96
    .line 97
    check-cast p1, Li0/h0;

    .line 98
    .line 99
    check-cast p2, Ljava/lang/Integer;

    .line 100
    .line 101
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    const/4 p2, 0x1

    .line 105
    invoke-static {p2}, Li0/r;->C(I)I

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    invoke-static {v0, p1, p2}, Lwb/ho;->o4(Ljava/lang/String;Li0/h0;I)V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
