.class public final synthetic Lr0/v1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/l;


# instance fields
.field public final synthetic a:Lr0/x1;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr0/x1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p6, p0, Lr0/v1;->a:Lr0/x1;

    iput-object p2, p0, Lr0/v1;->b:Ljava/lang/String;

    iput-object p1, p0, Lr0/v1;->c:Landroid/content/Context;

    iput-object p3, p0, Lr0/v1;->d:Ljava/lang/String;

    iput-object p4, p0, Lr0/v1;->e:Ljava/lang/String;

    iput-object p5, p0, Lr0/v1;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, LD0/c;

    .line 2
    .line 3
    const-string v0, "response"

    .line 4
    .line 5
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/lang/String;

    .line 9
    .line 10
    iget-object p1, p1, LD0/c;->c:[B

    .line 11
    .line 12
    sget-object v1, LU0/a;->a:Ljava/nio/charset/Charset;

    .line 13
    .line 14
    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 15
    .line 16
    .line 17
    iget-object v8, p0, Lr0/v1;->a:Lr0/x1;

    .line 18
    .line 19
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    .line 23
    .line 24
    invoke-direct {p1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v0, "pixelUrl"

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    const-string v0, "url"

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    move-object p1, v0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    const-string v0, "pixel"

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :cond_1
    const-string p1, "ifBlank(...)"

    .line 62
    .line 63
    invoke-static {v0, p1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string p1, "&amp;"

    .line 67
    .line 68
    const-string v1, "&"

    .line 69
    .line 70
    invoke-static {v0, p1, v1}, LU0/q;->g0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    goto :goto_2

    .line 75
    :goto_1
    new-instance v0, LE0/d;

    .line 76
    .line 77
    invoke-direct {v0, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    move-object p1, v0

    .line 81
    :goto_2
    nop

    .line 82
    instance-of v0, p1, LE0/d;

    .line 83
    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    const-string p1, ""

    .line 87
    .line 88
    :cond_2
    check-cast p1, Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_3

    .line 95
    .line 96
    iget-object p1, p0, Lr0/v1;->b:Ljava/lang/String;

    .line 97
    .line 98
    :cond_3
    move-object v6, p1

    .line 99
    iget-object p1, v8, Lr0/x1;->a:Landroid/os/Handler;

    .line 100
    .line 101
    new-instance v2, Lr0/w1;

    .line 102
    .line 103
    iget-object v3, p0, Lr0/v1;->c:Landroid/content/Context;

    .line 104
    .line 105
    iget-object v4, p0, Lr0/v1;->d:Ljava/lang/String;

    .line 106
    .line 107
    iget-object v5, p0, Lr0/v1;->e:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v7, p0, Lr0/v1;->f:Ljava/lang/String;

    .line 110
    .line 111
    invoke-direct/range {v2 .. v8}, Lr0/w1;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr0/x1;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 115
    .line 116
    .line 117
    sget-object p1, LE0/i;->a:LE0/i;

    .line 118
    .line 119
    return-object p1
.end method
