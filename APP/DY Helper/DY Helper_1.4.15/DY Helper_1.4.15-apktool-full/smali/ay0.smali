.class public final synthetic Lay0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:Lfv;

.field public final synthetic ζ:Lf8;

.field public final synthetic η:Ljava/util/List;

.field public final synthetic θ:Ljava/util/List;

.field public final synthetic ι:Ljava/util/List;

.field public final synthetic κ:Landroid/app/Activity;

.field public final synthetic λ:Z

.field public final synthetic μ:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lfv;Lf8;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroid/app/Activity;ZLjava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lay0;->ε:Lfv;

    .line 5
    .line 6
    iput-object p2, p0, Lay0;->ζ:Lf8;

    .line 7
    .line 8
    iput-object p3, p0, Lay0;->η:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, Lay0;->θ:Ljava/util/List;

    .line 11
    .line 12
    iput-object p5, p0, Lay0;->ι:Ljava/util/List;

    .line 13
    .line 14
    iput-object p6, p0, Lay0;->κ:Landroid/app/Activity;

    .line 15
    .line 16
    iput-boolean p7, p0, Lay0;->λ:Z

    .line 17
    .line 18
    iput-object p8, p0, Lay0;->μ:Ljava/util/List;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x5

    .line 8
    iget-object v2, p0, Lay0;->ε:Lfv;

    .line 9
    .line 10
    invoke-static {v2, v0, p1, v0, v1}, Lfv;->α(Lfv;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lfv;

    .line 11
    .line 12
    .line 13
    move-result-object v8

    .line 14
    sget-object p1, Lqy0;->α:Lqy0;

    .line 15
    .line 16
    iget-object p1, p0, Lay0;->η:Ljava/util/List;

    .line 17
    .line 18
    iget-object v0, p0, Lay0;->θ:Ljava/util/List;

    .line 19
    .line 20
    invoke-static {p1, v0}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x1

    .line 25
    iget-object v3, p0, Lay0;->ι:Ljava/util/List;

    .line 26
    .line 27
    invoke-static {v3, v2}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v1, v2}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v2, "livephoto"

    .line 36
    .line 37
    iget-object v5, p0, Lay0;->ζ:Lf8;

    .line 38
    .line 39
    invoke-static {v2, v5, v1}, Lqy0;->е(Ljava/lang/String;Lf8;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v10

    .line 43
    invoke-static {v10}, Lqy0;->β(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget-object v4, p0, Lay0;->κ:Landroid/app/Activity;

    .line 48
    .line 49
    const-string v2, "DYHelper"

    .line 50
    .line 51
    if-nez v1, :cond_0

    .line 52
    .line 53
    iget-object p0, v5, Lf8;->θ:Ljava/lang/String;

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    const-string v1, ", anim="

    .line 64
    .line 65
    const-string v3, ", image="

    .line 66
    .line 67
    const-string v5, "[LIVEPHOTO-DL-SKIP-DUP] awemeId="

    .line 68
    .line 69
    invoke-static {p1, v5, p0, v1, v3}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {v2, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-string p0, "\u52a8\u56fe\u4e0b\u8f7d\u5df2\u5728\u8fdb\u884c\u4e2d\uff0c\u8bf7\u52ff\u91cd\u590d\u70b9\u51fb"

    .line 84
    .line 85
    invoke-static {v4, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_0
    iget-boolean v9, p0, Lay0;->λ:Z

    .line 90
    .line 91
    if-eqz v9, :cond_1

    .line 92
    .line 93
    iget-object p0, p0, Lay0;->μ:Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-eqz p0, :cond_1

    .line 100
    .line 101
    const-string p0, "[LIVEPHOTO-MERGE-PREFLIGHT] \u6ca1\u6709\u53ef\u5408\u5e76\u4efb\u52a1\uff0c\u5c06\u5728\u4e0b\u8f7d\u7ebf\u7a0b\u4e2d\u81ea\u52a8\u964d\u7ea7\u4fdd\u5b58\u539f\u59cb\u8d44\u6e90"

    .line 102
    .line 103
    invoke-static {v2, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_1
    invoke-static {v4}, Lqy0;->Φ(Landroid/content/Context;)V

    .line 107
    .line 108
    .line 109
    invoke-static {v4}, Lqy0;->А(Landroid/content/Context;)Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-eqz v9, :cond_2

    .line 114
    .line 115
    const-string p0, "\u5408\u5e76\u52a8\u56fe"

    .line 116
    .line 117
    :goto_0
    move-object v7, p0

    .line 118
    goto :goto_1

    .line 119
    :cond_2
    const-string p0, "\u4e0b\u8f7d\u52a8\u56fe"

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :goto_1
    const-string p0, "\u51c6\u5907\u4e0b\u8f7d..."

    .line 123
    .line 124
    invoke-static {v4, v7, p0}, Lqy0;->б(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    if-eqz v9, :cond_3

    .line 128
    .line 129
    const-string p0, "\u5f00\u59cb\u4e0b\u8f7d\u5e76\u5408\u5e76\u52a8\u56fe\u8d44\u6e90..."

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_3
    const-string p0, "\u5f00\u59cb\u4e0b\u8f7d\u52a8\u56fe\u8d44\u6e90..."

    .line 133
    .line 134
    :goto_2
    invoke-static {v4, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    new-instance v3, Ldy0;

    .line 138
    .line 139
    invoke-direct/range {v3 .. v10}, Ldy0;-><init>(Landroid/app/Activity;Lf8;ZLjava/lang/String;Lfv;ZLjava/lang/String;)V

    .line 140
    .line 141
    .line 142
    const/16 p0, 0x17

    .line 143
    .line 144
    const-string p1, "dl-livephoto"

    .line 145
    .line 146
    invoke-static {p0, v3, p1}, Lp91;->Ζ(ILp70;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    :goto_3
    sget-object p0, Ls62;->α:Ls62;

    .line 150
    .line 151
    return-object p0
.end method
