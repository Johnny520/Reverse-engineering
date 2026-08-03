.class public final synthetic Lwb/kk;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Lwb/s4;

.field public final synthetic h:J

.field public final synthetic i:Z


# direct methods
.method public synthetic constructor <init>(Lwb/s4;JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/kk;->g:Lwb/s4;

    .line 5
    .line 6
    iput-wide p2, p0, Lwb/kk;->h:J

    .line 7
    .line 8
    iput-boolean p4, p0, Lwb/kk;->i:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lp/u;

    .line 6
    .line 7
    move-object/from16 v6, p2

    .line 8
    .line 9
    check-cast v6, Li0/h0;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v1, v2, 0x11

    .line 23
    .line 24
    const/16 v3, 0x10

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    if-eq v1, v3, :cond_0

    .line 28
    .line 29
    move v1, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v1, 0x0

    .line 32
    :goto_0
    and-int/2addr v2, v4

    .line 33
    invoke-virtual {v6, v2, v1}, Li0/h0;->S(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    iget-object v1, v0, Lwb/kk;->g:Lwb/s4;

    .line 40
    .line 41
    iget-object v2, v1, Lwb/s4;->c:Lm1/f;

    .line 42
    .line 43
    iget-object v3, v1, Lwb/s4;->b:Ljava/lang/String;

    .line 44
    .line 45
    new-instance v5, Lf1/n;

    .line 46
    .line 47
    iget-wide v8, v0, Lwb/kk;->h:J

    .line 48
    .line 49
    const/4 v1, 0x5

    .line 50
    invoke-direct {v5, v8, v9, v1}, Lf1/n;-><init>(JI)V

    .line 51
    .line 52
    .line 53
    const/16 v1, 0x1a

    .line 54
    .line 55
    int-to-float v1, v1

    .line 56
    sget-object v4, Ly0/l;->a:Ly0/l;

    .line 57
    .line 58
    invoke-static {v4, v1}, Lp/h1;->j(Ly0/o;F)Ly0/o;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    const/16 v7, 0x180

    .line 63
    .line 64
    invoke-static/range {v2 .. v7}, Lk/n;->c(Lm1/f;Ljava/lang/String;Ly0/o;Lf1/n;Li0/h0;I)V

    .line 65
    .line 66
    .line 67
    move-object v2, v3

    .line 68
    move-object/from16 v21, v6

    .line 69
    .line 70
    const/16 v1, 0xb

    .line 71
    .line 72
    invoke-static {v1}, Lx6/d;->D(I)J

    .line 73
    .line 74
    .line 75
    move-result-wide v6

    .line 76
    const/16 v1, 0xe

    .line 77
    .line 78
    invoke-static {v1}, Lx6/d;->D(I)J

    .line 79
    .line 80
    .line 81
    move-result-wide v13

    .line 82
    iget-boolean v1, v0, Lwb/kk;->i:Z

    .line 83
    .line 84
    if-eqz v1, :cond_1

    .line 85
    .line 86
    sget-object v1, Lm2/k;->j:Lm2/k;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    sget-object v1, Lm2/k;->i:Lm2/k;

    .line 90
    .line 91
    :goto_1
    const/16 v23, 0x30

    .line 92
    .line 93
    const v24, 0x3f7aa

    .line 94
    .line 95
    .line 96
    const/4 v3, 0x0

    .line 97
    move-wide v4, v8

    .line 98
    const/4 v9, 0x0

    .line 99
    const-wide/16 v10, 0x0

    .line 100
    .line 101
    const/4 v12, 0x0

    .line 102
    const/4 v15, 0x0

    .line 103
    const/16 v16, 0x0

    .line 104
    .line 105
    const/16 v17, 0x0

    .line 106
    .line 107
    const/16 v18, 0x0

    .line 108
    .line 109
    const/16 v19, 0x0

    .line 110
    .line 111
    const/16 v20, 0x0

    .line 112
    .line 113
    const/16 v22, 0x6000

    .line 114
    .line 115
    move-object v8, v1

    .line 116
    invoke-static/range {v2 .. v24}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_2
    move-object/from16 v21, v6

    .line 121
    .line 122
    invoke-virtual/range {v21 .. v21}, Li0/h0;->V()V

    .line 123
    .line 124
    .line 125
    :goto_2
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 126
    .line 127
    return-object v1
.end method
