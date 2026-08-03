.class public final synthetic Lwb/rh;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Laa/h;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Ljava/util/List;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Laa/h;Li0/a1;Li0/a1;Ljava/util/List;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p8, p0, Lwb/rh;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/rh;->h:Laa/h;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/rh;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/rh;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/rh;->k:Ljava/util/List;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/rh;->l:Li0/a1;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/rh;->m:Li0/a1;

    .line 14
    .line 15
    iput-object p7, p0, Lwb/rh;->n:Li0/a1;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwb/rh;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/rh;->h:Laa/h;

    .line 7
    .line 8
    iget-object v0, v0, Laa/h;->a:Ljava/lang/String;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object v1, p0, Lwb/rh;->i:Li0/a1;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/util/Set;

    .line 25
    .line 26
    invoke-static {p1, v0}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/util/Set;

    .line 36
    .line 37
    invoke-static {p1, v0}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :goto_0
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lwb/rh;->j:Li0/a1;

    .line 45
    .line 46
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-nez p1, :cond_1

    .line 57
    .line 58
    iget-object p1, p0, Lwb/rh;->k:Ljava/util/List;

    .line 59
    .line 60
    iget-object v0, p0, Lwb/rh;->l:Li0/a1;

    .line 61
    .line 62
    iget-object v2, p0, Lwb/rh;->m:Li0/a1;

    .line 63
    .line 64
    iget-object v3, p0, Lwb/rh;->n:Li0/a1;

    .line 65
    .line 66
    invoke-static {p1, v1, v0, v2, v3}, Lwb/ho;->Y1(Ljava/util/List;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_0
    iget-object v0, p0, Lwb/rh;->h:Laa/h;

    .line 73
    .line 74
    iget-object v0, v0, Laa/h;->a:Ljava/lang/String;

    .line 75
    .line 76
    check-cast p1, Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    iget-object v1, p0, Lwb/rh;->i:Li0/a1;

    .line 83
    .line 84
    if-eqz p1, :cond_2

    .line 85
    .line 86
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Ljava/util/Set;

    .line 91
    .line 92
    invoke-static {p1, v0}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    goto :goto_1

    .line 97
    :cond_2
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Ljava/util/Set;

    .line 102
    .line 103
    invoke-static {p1, v0}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    :goto_1
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iget-object p1, p0, Lwb/rh;->j:Li0/a1;

    .line 111
    .line 112
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, Ljava/lang/Boolean;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-nez p1, :cond_3

    .line 123
    .line 124
    iget-object p1, p0, Lwb/rh;->k:Ljava/util/List;

    .line 125
    .line 126
    iget-object v0, p0, Lwb/rh;->l:Li0/a1;

    .line 127
    .line 128
    iget-object v2, p0, Lwb/rh;->m:Li0/a1;

    .line 129
    .line 130
    iget-object v3, p0, Lwb/rh;->n:Li0/a1;

    .line 131
    .line 132
    invoke-static {p1, v1, v0, v2, v3}, Lwb/ho;->S1(Ljava/util/List;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V

    .line 133
    .line 134
    .line 135
    :cond_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 136
    .line 137
    return-object p1

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
