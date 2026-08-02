.class public final synthetic Lj0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:Ljava/lang/Float;

.field public final synthetic i:Ljava/lang/Integer;

.field public final synthetic j:Ljava/lang/Integer;

.field public final synthetic k:Ljava/lang/Long;

.field public final synthetic l:Lin0;

.field public final synthetic m:Lxk1;

.field public final synthetic n:Lxk1;

.field public final synthetic o:Lxk1;

.field public final synthetic p:Lxk1;

.field public final synthetic q:Lxk1;

.field public final synthetic r:Lxk1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Lin0;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj0;->h:Ljava/lang/Float;

    .line 5
    .line 6
    iput-object p2, p0, Lj0;->i:Ljava/lang/Integer;

    .line 7
    .line 8
    iput-object p3, p0, Lj0;->j:Ljava/lang/Integer;

    .line 9
    .line 10
    iput-object p4, p0, Lj0;->k:Ljava/lang/Long;

    .line 11
    .line 12
    iput-object p5, p0, Lj0;->l:Lin0;

    .line 13
    .line 14
    iput-object p6, p0, Lj0;->m:Lxk1;

    .line 15
    .line 16
    iput-object p7, p0, Lj0;->n:Lxk1;

    .line 17
    .line 18
    iput-object p8, p0, Lj0;->o:Lxk1;

    .line 19
    .line 20
    iput-object p9, p0, Lj0;->p:Lxk1;

    .line 21
    .line 22
    iput-object p10, p0, Lj0;->q:Lxk1;

    .line 23
    .line 24
    iput-object p11, p0, Lj0;->r:Lxk1;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, Lj0;->h:Ljava/lang/Float;

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result v7

    .line 11
    iget-object v0, p0, Lj0;->i:Ljava/lang/Integer;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v8

    .line 19
    iget-object v0, p0, Lj0;->j:Ljava/lang/Integer;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v9

    .line 27
    iget-object v0, p0, Lj0;->k:Ljava/lang/Long;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 32
    .line 33
    .line 34
    move-result-wide v10

    .line 35
    new-instance v2, Lnuke/module/wechat/ai/AIChatConfig;

    .line 36
    .line 37
    iget-object v0, p0, Lj0;->m:Lxk1;

    .line 38
    .line 39
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const/4 v3, 0x1

    .line 54
    new-array v3, v3, [C

    .line 55
    .line 56
    const/16 v4, 0x2f

    .line 57
    .line 58
    const/4 v5, 0x0

    .line 59
    aput-char v4, v3, v5

    .line 60
    .line 61
    invoke-static {v0, v3}, Lpv2;->J0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    iget-object v0, p0, Lj0;->n:Lxk1;

    .line 66
    .line 67
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v0}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    iget-object v0, p0, Lj0;->o:Lxk1;

    .line 82
    .line 83
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v0}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    iget-object v0, p0, Lj0;->p:Lxk1;

    .line 98
    .line 99
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v0}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    iget-object v0, p0, Lj0;->q:Lxk1;

    .line 114
    .line 115
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    move-object v12, v0

    .line 120
    check-cast v12, Lc1;

    .line 121
    .line 122
    iget-object v0, p0, Lj0;->r:Lxk1;

    .line 123
    .line 124
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    move-object v13, v0

    .line 129
    check-cast v13, Ljava/util/Set;

    .line 130
    .line 131
    invoke-direct/range {v2 .. v13}, Lnuke/module/wechat/ai/AIChatConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIIJLc1;Ljava/util/Set;)V

    .line 132
    .line 133
    .line 134
    iget-object p0, p0, Lj0;->l:Lin0;

    .line 135
    .line 136
    invoke-interface {p0, v2}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    :cond_0
    return-object v1
.end method
