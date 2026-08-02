.class public final synthetic Lnr;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:Ljava/lang/Long;

.field public final synthetic i:Ljava/lang/Long;

.field public final synthetic j:Lin0;

.field public final synthetic k:Lzq;

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:Ljava/lang/Integer;

.field public final synthetic n:Lxk1;

.field public final synthetic o:Lxk1;

.field public final synthetic p:Lxk1;

.field public final synthetic q:Lxk1;

.field public final synthetic r:Lxk1;

.field public final synthetic s:Lxk1;

.field public final synthetic t:Lxk1;

.field public final synthetic u:Lxk1;

.field public final synthetic v:Lxk1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Lin0;Lzq;Ljava/util/List;Ljava/lang/Integer;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnr;->h:Ljava/lang/Long;

    .line 5
    .line 6
    iput-object p2, p0, Lnr;->i:Ljava/lang/Long;

    .line 7
    .line 8
    iput-object p3, p0, Lnr;->j:Lin0;

    .line 9
    .line 10
    iput-object p4, p0, Lnr;->k:Lzq;

    .line 11
    .line 12
    iput-object p5, p0, Lnr;->l:Ljava/util/List;

    .line 13
    .line 14
    iput-object p6, p0, Lnr;->m:Ljava/lang/Integer;

    .line 15
    .line 16
    iput-object p7, p0, Lnr;->n:Lxk1;

    .line 17
    .line 18
    iput-object p8, p0, Lnr;->o:Lxk1;

    .line 19
    .line 20
    iput-object p9, p0, Lnr;->p:Lxk1;

    .line 21
    .line 22
    iput-object p10, p0, Lnr;->q:Lxk1;

    .line 23
    .line 24
    iput-object p11, p0, Lnr;->r:Lxk1;

    .line 25
    .line 26
    iput-object p12, p0, Lnr;->s:Lxk1;

    .line 27
    .line 28
    iput-object p13, p0, Lnr;->t:Lxk1;

    .line 29
    .line 30
    iput-object p14, p0, Lnr;->u:Lxk1;

    .line 31
    .line 32
    iput-object p15, p0, Lnr;->v:Lxk1;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lnr;->h:Ljava/lang/Long;

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide v14

    .line 13
    iget-object v1, v0, Lnr;->i:Ljava/lang/Long;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v16

    .line 21
    iget-object v1, v0, Lnr;->n:Lxk1;

    .line 22
    .line 23
    invoke-interface {v1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v1}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget-object v1, v0, Lnr;->o:Lxk1;

    .line 38
    .line 39
    invoke-interface {v1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    iget-object v1, v0, Lnr;->p:Lxk1;

    .line 50
    .line 51
    invoke-interface {v1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    move-object v6, v1

    .line 56
    check-cast v6, Lgr;

    .line 57
    .line 58
    iget-object v1, v0, Lnr;->q:Lxk1;

    .line 59
    .line 60
    invoke-interface {v1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    iget-object v1, v0, Lnr;->r:Lxk1;

    .line 71
    .line 72
    invoke-interface {v1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    move-object v9, v1

    .line 77
    check-cast v9, Ler;

    .line 78
    .line 79
    iget-object v1, v0, Lnr;->s:Lxk1;

    .line 80
    .line 81
    invoke-interface {v1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    move-object v10, v1

    .line 86
    check-cast v10, Ljava/util/Set;

    .line 87
    .line 88
    iget-object v1, v0, Lnr;->t:Lxk1;

    .line 89
    .line 90
    invoke-interface {v1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    move-object v11, v1

    .line 95
    check-cast v11, Lir;

    .line 96
    .line 97
    iget-object v1, v0, Lnr;->u:Lxk1;

    .line 98
    .line 99
    invoke-interface {v1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v1}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v12

    .line 113
    iget-object v1, v0, Lnr;->m:Ljava/lang/Integer;

    .line 114
    .line 115
    if-eqz v1, :cond_0

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    :goto_0
    move v13, v1

    .line 122
    goto :goto_1

    .line 123
    :cond_0
    const/16 v1, 0x3e8

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :goto_1
    iget-object v1, v0, Lnr;->v:Lxk1;

    .line 127
    .line 128
    invoke-interface {v1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    check-cast v1, Ljava/lang/Boolean;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 135
    .line 136
    .line 137
    move-result v18

    .line 138
    const/16 v19, 0x1

    .line 139
    .line 140
    iget-object v3, v0, Lnr;->k:Lzq;

    .line 141
    .line 142
    iget-object v7, v0, Lnr;->l:Ljava/util/List;

    .line 143
    .line 144
    invoke-static/range {v3 .. v19}, Lzq;->a(Lzq;Ljava/lang/String;ZLgr;Ljava/util/List;ZLer;Ljava/util/Set;Lir;Ljava/lang/String;IJJZI)Lzq;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    iget-object v0, v0, Lnr;->j:Lin0;

    .line 149
    .line 150
    invoke-interface {v0, v1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    :cond_1
    return-object v2
.end method
