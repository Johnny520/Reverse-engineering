.class public final Ln/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ltg/e;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/ArrayList;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Li0/a1;I)V
    .locals 0

    .line 1
    iput p3, p0, Ln/d;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Ln/d;->h:Ljava/util/ArrayList;

    .line 4
    .line 5
    iput-object p2, p0, Ln/d;->i:Li0/a1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget p2, p0, Ln/d;->g:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ln/j;

    .line 7
    .line 8
    instance-of p2, p1, Ln/m;

    .line 9
    .line 10
    iget-object v0, p0, Ln/d;->h:Ljava/util/ArrayList;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    instance-of p2, p1, Ln/n;

    .line 19
    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    check-cast p1, Ln/n;

    .line 23
    .line 24
    iget-object p1, p1, Ln/n;->a:Ln/m;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    instance-of p2, p1, Ln/l;

    .line 31
    .line 32
    if-eqz p2, :cond_2

    .line 33
    .line 34
    check-cast p1, Ln/l;

    .line 35
    .line 36
    iget-object p1, p1, Ln/l;->a:Ln/m;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    xor-int/lit8 p1, p1, 0x1

    .line 46
    .line 47
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-object p2, p0, Ln/d;->i:Li0/a1;

    .line 52
    .line 53
    invoke-interface {p2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 57
    .line 58
    return-object p1

    .line 59
    :pswitch_0
    check-cast p1, Ln/j;

    .line 60
    .line 61
    instance-of p2, p1, Ln/h;

    .line 62
    .line 63
    iget-object v0, p0, Ln/d;->h:Ljava/util/ArrayList;

    .line 64
    .line 65
    if-eqz p2, :cond_3

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    instance-of p2, p1, Ln/i;

    .line 72
    .line 73
    if-eqz p2, :cond_4

    .line 74
    .line 75
    check-cast p1, Ln/i;

    .line 76
    .line 77
    iget-object p1, p1, Ln/i;->a:Ln/h;

    .line 78
    .line 79
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    :cond_4
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    xor-int/lit8 p1, p1, 0x1

    .line 87
    .line 88
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget-object p2, p0, Ln/d;->i:Li0/a1;

    .line 93
    .line 94
    invoke-interface {p2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 98
    .line 99
    return-object p1

    .line 100
    :pswitch_1
    check-cast p1, Ln/j;

    .line 101
    .line 102
    instance-of p2, p1, Ln/b;

    .line 103
    .line 104
    iget-object v0, p0, Ln/d;->h:Ljava/util/ArrayList;

    .line 105
    .line 106
    if-eqz p2, :cond_5

    .line 107
    .line 108
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_5
    instance-of p2, p1, Ln/c;

    .line 113
    .line 114
    if-eqz p2, :cond_6

    .line 115
    .line 116
    check-cast p1, Ln/c;

    .line 117
    .line 118
    iget-object p1, p1, Ln/c;->a:Ln/b;

    .line 119
    .line 120
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_6
    instance-of p2, p1, Ln/a;

    .line 125
    .line 126
    if-eqz p2, :cond_7

    .line 127
    .line 128
    check-cast p1, Ln/a;

    .line 129
    .line 130
    iget-object p1, p1, Ln/a;->a:Ln/b;

    .line 131
    .line 132
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    :cond_7
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    xor-int/lit8 p1, p1, 0x1

    .line 140
    .line 141
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    iget-object p2, p0, Ln/d;->i:Li0/a1;

    .line 146
    .line 147
    invoke-interface {p2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 151
    .line 152
    return-object p1

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
