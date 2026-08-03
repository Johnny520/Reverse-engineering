.class public abstract Lr4/d0;
.super Lr4/y;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final i:Lv4/w;


# direct methods
.method public constructor <init>(Lv4/w;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lv4/w;->g:Lv4/d0;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lr4/y;-><init>(Lv4/d0;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lr4/d0;->i:Lv4/w;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c()I
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    return v0
.end method

.method public final d(Lr4/p;Lz4/d;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lr4/p;->g:Lr4/h0;

    .line 2
    .line 3
    iget-object v1, p1, Lr4/p;->f:Lr4/h0;

    .line 4
    .line 5
    iget-object v2, p0, Lr4/d0;->i:Lv4/w;

    .line 6
    .line 7
    iget-object v3, v2, Lv4/w;->h:Lv4/z;

    .line 8
    .line 9
    iget-object v4, p0, Lr4/y;->h:Lv4/d0;

    .line 10
    .line 11
    invoke-virtual {v0, v4}, Lr4/h0;->m(Lv4/d0;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v3, v3, Lv4/z;->g:Lv4/c0;

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Lr4/h0;->l(Lv4/c0;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {p0, p1}, Lr4/d0;->i(Lr4/p;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    new-instance v3, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lr4/z;->f()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const/16 v4, 0x20

    .line 44
    .line 45
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Lv4/w;->a()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    const/4 v3, 0x0

    .line 60
    invoke-virtual {p2, v3, v2}, Lz4/d;->b(ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, La/a;->X0(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const-string v3, "  class_idx: "

    .line 68
    .line 69
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    const/4 v3, 0x2

    .line 74
    invoke-virtual {p2, v3, v2}, Lz4/d;->b(ILjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lr4/d0;->j()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    const-string v4, ":"

    .line 82
    .line 83
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-static {p1}, La/a;->X0(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    filled-new-array {v2, v4}, [Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    const-string v4, "  %-10s %s"

    .line 96
    .line 97
    invoke-static {v4, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {p2, v3, v2}, Lz4/d;->b(ILjava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v1}, La/a;->Y0(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    const-string v3, "  name_idx:  "

    .line 109
    .line 110
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    const/4 v3, 0x4

    .line 115
    invoke-virtual {p2, v3, v2}, Lz4/d;->b(ILjava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_0
    invoke-virtual {p2, v0}, Lz4/d;->l(I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2, p1}, Lz4/d;->l(I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, v1}, Lz4/d;->k(I)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public abstract i(Lr4/p;)I
.end method

.method public abstract j()Ljava/lang/String;
.end method
