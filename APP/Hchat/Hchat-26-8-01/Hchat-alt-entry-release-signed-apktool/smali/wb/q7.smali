.class public final synthetic Lwb/q7;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ILi0/a1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/q7;->g:I

    .line 2
    .line 3
    iput p1, p0, Lwb/q7;->h:I

    .line 4
    .line 5
    iput-object p2, p0, Lwb/q7;->i:Li0/a1;

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
    .locals 3

    .line 1
    iget v0, p0, Lwb/q7;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lwb/q7;->i:Li0/a1;

    .line 12
    .line 13
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ldb/c;

    .line 18
    .line 19
    iget v2, p0, Lwb/q7;->h:I

    .line 20
    .line 21
    invoke-static {v1, v2, p1}, Lwb/ho;->m7(Ldb/c;ILjava/lang/String;)Ldb/c;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_0
    check-cast p1, Lx8/s;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lwb/q7;->i:Li0/a1;

    .line 37
    .line 38
    iget v1, p0, Lwb/q7;->h:I

    .line 39
    .line 40
    invoke-static {v0, v1, p1}, Lwb/ho;->H(Li0/a1;ILx8/s;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_1
    check-cast p1, Lna/h;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget v0, p0, Lwb/q7;->h:I

    .line 50
    .line 51
    if-ltz v0, :cond_0

    .line 52
    .line 53
    iget-object v1, p0, Lwb/q7;->i:Li0/a1;

    .line 54
    .line 55
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-ge v0, v2, :cond_0

    .line 66
    .line 67
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Ljava/util/List;

    .line 72
    .line 73
    invoke-static {v2}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-static {p1}, Lwb/ho;->q6(Lna/h;)Lna/h;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {v2, v0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 88
    .line 89
    return-object p1

    .line 90
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lwb/q7;->i:Li0/a1;

    .line 96
    .line 97
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, Ldb/c;

    .line 102
    .line 103
    iget v2, p0, Lwb/q7;->h:I

    .line 104
    .line 105
    invoke-static {v1, v2, p1}, Lwb/ho;->m7(Ldb/c;ILjava/lang/String;)Ldb/c;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
