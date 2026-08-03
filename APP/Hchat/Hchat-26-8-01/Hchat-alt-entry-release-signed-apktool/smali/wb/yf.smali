.class public final synthetic Lwb/yf;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Z


# direct methods
.method public synthetic constructor <init>(ILfg/l;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lwb/yf;->g:I

    .line 5
    .line 6
    iput-object p2, p0, Lwb/yf;->h:Lfg/l;

    .line 7
    .line 8
    iput-boolean p3, p0, Lwb/yf;->i:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, Li0/h0;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    and-int/lit8 p2, p1, 0x3

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    const/4 v1, 0x2

    .line 14
    if-eq p2, v1, :cond_0

    .line 15
    .line 16
    move p2, v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p2, 0x0

    .line 19
    :goto_0
    and-int/2addr p1, v0

    .line 20
    invoke-virtual {v6, p1, p2}, Li0/h0;->S(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_6

    .line 25
    .line 26
    iget p1, p0, Lwb/yf;->g:I

    .line 27
    .line 28
    if-eq p1, v0, :cond_3

    .line 29
    .line 30
    if-eq p1, v1, :cond_2

    .line 31
    .line 32
    const/4 p2, 0x3

    .line 33
    if-eq p1, p2, :cond_1

    .line 34
    .line 35
    const-string p2, "\u628a\u4efb\u610f\u97f3\u9891\u8f6c\u6210 Silk \u5e76\u4fdd\u5b58\u5230\u672c\u5730"

    .line 36
    .line 37
    :goto_1
    move-object v1, p2

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    const-string p2, "\u628a Silk \u8bed\u97f3\u5bfc\u51fa\u4e3a M4A \u6587\u4ef6"

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    const-string p2, "\u628a Silk \u8bed\u97f3\u5bfc\u51fa\u4e3a MP3 \u6587\u4ef6"

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    const-string p2, "\u628a\u4efb\u610f\u97f3\u9891\u8f6c\u6210\u5fae\u4fe1\u8bed\u97f3\u5e76\u76f4\u63a5\u53d1\u9001"

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :goto_2
    new-instance p2, Lwb/dq;

    .line 49
    .line 50
    const-string v2, "\u4efb\u610f\u97f3\u9891\u8f6csilk\u4fdd\u5b58"

    .line 51
    .line 52
    const-string v3, "0"

    .line 53
    .line 54
    invoke-direct {p2, v3, v2}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance v2, Lwb/dq;

    .line 58
    .line 59
    const-string v3, "\u4efb\u610f\u97f3\u9891\u8f6csilk\u53d1\u9001"

    .line 60
    .line 61
    const-string v4, "1"

    .line 62
    .line 63
    invoke-direct {v2, v4, v3}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    new-instance v3, Lwb/dq;

    .line 67
    .line 68
    const-string v4, "Silk \u8f6c MP3 \u4fdd\u5b58"

    .line 69
    .line 70
    const-string v5, "2"

    .line 71
    .line 72
    invoke-direct {v3, v5, v4}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    new-instance v4, Lwb/dq;

    .line 76
    .line 77
    const-string v5, "Silk \u8f6c M4A \u4fdd\u5b58"

    .line 78
    .line 79
    const-string v7, "3"

    .line 80
    .line 81
    invoke-direct {v4, v7, v5}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    filled-new-array {p2, v2, v3, v4}, [Lwb/dq;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-static {p2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    iget-object p2, p0, Lwb/yf;->h:Lfg/l;

    .line 97
    .line 98
    invoke-virtual {v6, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    invoke-virtual {v6, p1}, Li0/h0;->d(I)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    or-int/2addr v4, v5

    .line 107
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    if-nez v4, :cond_4

    .line 112
    .line 113
    sget-object v4, Li0/l;->a:Li0/e;

    .line 114
    .line 115
    if-ne v5, v4, :cond_5

    .line 116
    .line 117
    :cond_4
    new-instance v5, Lwb/ch;

    .line 118
    .line 119
    invoke-direct {v5, p2, p1}, Lwb/ch;-><init>(Lfg/l;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v6, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :cond_5
    move-object v4, v5

    .line 126
    check-cast v4, Lfg/l;

    .line 127
    .line 128
    iget-boolean p1, p0, Lwb/yf;->i:Z

    .line 129
    .line 130
    xor-int/lit8 v5, p1, 0x1

    .line 131
    .line 132
    const/4 v7, 0x6

    .line 133
    const/4 v8, 0x0

    .line 134
    const-string v0, "\u64cd\u4f5c"

    .line 135
    .line 136
    invoke-static/range {v0 .. v8}, Lwb/ho;->I2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfg/l;ZLi0/h0;II)V

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_6
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 141
    .line 142
    .line 143
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 144
    .line 145
    return-object p1
.end method
