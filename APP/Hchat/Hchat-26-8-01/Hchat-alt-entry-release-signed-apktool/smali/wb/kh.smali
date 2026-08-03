.class public final synthetic Lwb/kh;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Ljava/util/List;I)V
    .locals 0

    .line 1
    iput p7, p0, Lwb/kh;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/kh;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/kh;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/kh;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/kh;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p6, p0, Lwb/kh;->l:Ljava/util/List;

    .line 12
    .line 13
    iput-object p5, p0, Lwb/kh;->m:Li0/a1;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwb/kh;->g:I

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Boolean;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, Lwb/kh;->h:Li0/a1;

    .line 13
    .line 14
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lwb/kh;->i:Li0/a1;

    .line 20
    .line 21
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, Lwb/kh;->j:Li0/a1;

    .line 34
    .line 35
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ljava/util/Set;

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    iget-object v1, p0, Lwb/kh;->k:Li0/a1;

    .line 48
    .line 49
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_0

    .line 60
    .line 61
    iget-object v2, p0, Lwb/kh;->l:Ljava/util/List;

    .line 62
    .line 63
    iget-object v3, p0, Lwb/kh;->m:Li0/a1;

    .line 64
    .line 65
    invoke-static {v2, v3, p1, v0, v1}, Lwb/ho;->S1(Ljava/util/List;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 69
    .line 70
    return-object p1

    .line 71
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    iget-object v1, p0, Lwb/kh;->h:Li0/a1;

    .line 76
    .line 77
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    if-eqz v0, :cond_1

    .line 81
    .line 82
    iget-object p1, p0, Lwb/kh;->i:Li0/a1;

    .line 83
    .line 84
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-nez v0, :cond_1

    .line 95
    .line 96
    iget-object v0, p0, Lwb/kh;->j:Li0/a1;

    .line 97
    .line 98
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Ljava/util/Set;

    .line 103
    .line 104
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_1

    .line 109
    .line 110
    iget-object v1, p0, Lwb/kh;->k:Li0/a1;

    .line 111
    .line 112
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eqz v2, :cond_1

    .line 123
    .line 124
    iget-object v2, p0, Lwb/kh;->l:Ljava/util/List;

    .line 125
    .line 126
    iget-object v3, p0, Lwb/kh;->m:Li0/a1;

    .line 127
    .line 128
    invoke-static {v2, v3, p1, v0, v1}, Lwb/ho;->Y1(Ljava/util/List;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V

    .line 129
    .line 130
    .line 131
    :cond_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 132
    .line 133
    return-object p1

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
