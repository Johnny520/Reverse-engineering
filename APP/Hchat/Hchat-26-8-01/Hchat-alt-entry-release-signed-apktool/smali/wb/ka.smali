.class public final synthetic Lwb/ka;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ILi0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lwb/ka;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lwb/ka;->i:Li0/a1;

    .line 8
    .line 9
    iput p1, p0, Lwb/ka;->h:I

    .line 10
    .line 11
    iput-object p3, p0, Lwb/ka;->j:Li0/a1;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(ILi0/a1;Li0/a1;I)V
    .locals 0

    .line 14
    iput p4, p0, Lwb/ka;->g:I

    iput p1, p0, Lwb/ka;->h:I

    iput-object p2, p0, Lwb/ka;->i:Li0/a1;

    iput-object p3, p0, Lwb/ka;->j:Li0/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwb/ka;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/ka;->i:Li0/a1;

    .line 7
    .line 8
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/util/List;

    .line 13
    .line 14
    invoke-static {v1}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget v2, p0, Lwb/ka;->h:I

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iget-object v1, p0, Lwb/ka;->j:Li0/a1;

    .line 28
    .line 29
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_0
    iget-object v0, p0, Lwb/ka;->i:Li0/a1;

    .line 36
    .line 37
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/util/List;

    .line 42
    .line 43
    invoke-static {v1}, La/a;->b0(Ljava/util/List;)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget v2, p0, Lwb/ka;->h:I

    .line 48
    .line 49
    if-ge v2, v1, :cond_0

    .line 50
    .line 51
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Ljava/util/List;

    .line 56
    .line 57
    invoke-static {v1}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Lna/h;

    .line 66
    .line 67
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    invoke-virtual {v1, v2, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object v1, p0, Lwb/ka;->j:Li0/a1;

    .line 80
    .line 81
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 85
    .line 86
    return-object v0

    .line 87
    :pswitch_1
    iget v0, p0, Lwb/ka;->h:I

    .line 88
    .line 89
    if-lez v0, :cond_1

    .line 90
    .line 91
    iget-object v1, p0, Lwb/ka;->i:Li0/a1;

    .line 92
    .line 93
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Ljava/util/List;

    .line 98
    .line 99
    invoke-static {v2}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    check-cast v3, Lna/h;

    .line 108
    .line 109
    add-int/lit8 v0, v0, -0x1

    .line 110
    .line 111
    invoke-virtual {v2, v0, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iget-object v1, p0, Lwb/ka;->j:Li0/a1;

    .line 122
    .line 123
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 127
    .line 128
    return-object v0

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
