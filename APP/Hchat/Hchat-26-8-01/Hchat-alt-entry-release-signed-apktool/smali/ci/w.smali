.class public final Lci/w;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li0/z;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lci/w;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lci/w;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lci/w;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget v0, p0, Lci/w;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lci/w;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v3, p0, Lci/w;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v3, Lia/n;

    .line 12
    .line 13
    invoke-virtual {v3, v1}, Lia/n;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    check-cast v2, Li0/a1;

    .line 17
    .line 18
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lfg/a;

    .line 23
    .line 24
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    check-cast v3, Landroid/view/Window;

    .line 29
    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    check-cast v2, Ljava/lang/Integer;

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {v3, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void

    .line 44
    :pswitch_1
    check-cast v3, Lw/n1;

    .line 45
    .line 46
    iget-object v0, v3, Lw/n1;->c:Lw0/p;

    .line 47
    .line 48
    check-cast v2, Lfg/l;

    .line 49
    .line 50
    invoke-virtual {v0, v2}, Lw0/p;->remove(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_2
    check-cast v3, Ls3/a;

    .line 55
    .line 56
    invoke-virtual {v3}, Ls3/a;->a()V

    .line 57
    .line 58
    .line 59
    check-cast v2, Ls3/e;

    .line 60
    .line 61
    iput-object v1, v2, Ls3/e;->e:Ls3/a;

    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_3
    check-cast v3, Ls/x0;

    .line 65
    .line 66
    iget-object v0, v3, Ls/x0;->i:Lf/l0;

    .line 67
    .line 68
    invoke-virtual {v0, v2}, Lf/l0;->k(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_4
    check-cast v3, Lp/s1;

    .line 73
    .line 74
    check-cast v2, Landroid/view/View;

    .line 75
    .line 76
    iget v0, v3, Lp/s1;->t:I

    .line 77
    .line 78
    add-int/lit8 v0, v0, -0x1

    .line 79
    .line 80
    iput v0, v3, Lp/s1;->t:I

    .line 81
    .line 82
    if-nez v0, :cond_1

    .line 83
    .line 84
    sget v0, Lg3/q;->a:I

    .line 85
    .line 86
    invoke-static {v2, v1}, Lg3/m;->b(Landroid/view/View;Lg3/e;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v2, v1}, Lg3/q;->b(Landroid/view/View;Lg3/s;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, v3, Lp/s1;->u:Lp/f0;

    .line 93
    .line 94
    invoke-virtual {v2, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 95
    .line 96
    .line 97
    :cond_1
    return-void

    .line 98
    :pswitch_5
    check-cast v3, Li/k1;

    .line 99
    .line 100
    check-cast v2, Li/g1;

    .line 101
    .line 102
    iget-object v0, v3, Li/k1;->i:Lw0/p;

    .line 103
    .line 104
    invoke-virtual {v0, v2}, Lw0/p;->remove(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :pswitch_6
    check-cast v3, Li/k1;

    .line 109
    .line 110
    check-cast v2, Li/d1;

    .line 111
    .line 112
    iget-object v0, v2, Li/d1;->b:Li0/j1;

    .line 113
    .line 114
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, Li/c1;

    .line 119
    .line 120
    if-eqz v0, :cond_2

    .line 121
    .line 122
    iget-object v0, v0, Li/c1;->g:Li/g1;

    .line 123
    .line 124
    iget-object v1, v3, Li/k1;->i:Lw0/p;

    .line 125
    .line 126
    invoke-virtual {v1, v0}, Lw0/p;->remove(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    :cond_2
    return-void

    .line 130
    :pswitch_7
    check-cast v3, Li/k1;

    .line 131
    .line 132
    check-cast v2, Li/k1;

    .line 133
    .line 134
    iget-object v0, v3, Li/k1;->j:Lw0/p;

    .line 135
    .line 136
    invoke-virtual {v0, v2}, Lw0/p;->remove(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :pswitch_8
    check-cast v3, Li/g0;

    .line 141
    .line 142
    check-cast v2, Li/d0;

    .line 143
    .line 144
    iget-object v0, v3, Li/g0;->a:Lj0/b;

    .line 145
    .line 146
    invoke-virtual {v0, v2}, Lj0/b;->j(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :pswitch_9
    check-cast v3, Lw0/p;

    .line 151
    .line 152
    sget-object v0, Lci/v;->h:Lci/v;

    .line 153
    .line 154
    invoke-static {v0, v3}, Ltf/r;->i1(Lfg/l;Ljava/util/List;)Z

    .line 155
    .line 156
    .line 157
    check-cast v2, Lw0/p;

    .line 158
    .line 159
    sget-object v0, Lci/v;->i:Lci/v;

    .line 160
    .line 161
    invoke-static {v0, v2}, Ltf/r;->i1(Lfg/l;Ljava/util/List;)Z

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
