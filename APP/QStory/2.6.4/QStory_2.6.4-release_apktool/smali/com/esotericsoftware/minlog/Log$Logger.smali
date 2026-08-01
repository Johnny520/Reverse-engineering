.class public Lcom/esotericsoftware/minlog/Log$Logger;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/minlog/Log;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Logger"
.end annotation


# instance fields
.field private final firstLogTime:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iput-wide v0, p0, Lcom/esotericsoftware/minlog/Log$Logger;->firstLogTime:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x100

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    iget-wide v4, p0, Lcom/esotericsoftware/minlog/Log$Logger;->firstLogTime:J

    .line 13
    .line 14
    sub-long/2addr v2, v4

    .line 15
    const-wide/32 v4, 0xea60

    .line 16
    .line 17
    .line 18
    div-long v4, v2, v4

    .line 19
    .line 20
    const-wide/16 v6, 0x3e8

    .line 21
    .line 22
    div-long/2addr v2, v6

    .line 23
    const-wide/16 v6, 0x3c

    .line 24
    .line 25
    rem-long/2addr v2, v6

    .line 26
    const-wide/16 v6, 0x9

    .line 27
    .line 28
    cmp-long v8, v4, v6

    .line 29
    .line 30
    const/16 v9, 0x30

    .line 31
    .line 32
    if-gtz v8, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const/16 v4, 0x3a

    .line 41
    .line 42
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    cmp-long v4, v2, v6

    .line 46
    .line 47
    if-gtz v4, :cond_1

    .line 48
    .line 49
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    if-eq p1, v2, :cond_6

    .line 57
    .line 58
    const/4 v2, 0x2

    .line 59
    if-eq p1, v2, :cond_5

    .line 60
    .line 61
    const/4 v2, 0x3

    .line 62
    if-eq p1, v2, :cond_4

    .line 63
    .line 64
    const/4 v2, 0x4

    .line 65
    if-eq p1, v2, :cond_3

    .line 66
    .line 67
    const/4 v2, 0x5

    .line 68
    if-eq p1, v2, :cond_2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    const-string p1, " ERROR: "

    .line 72
    .line 73
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    const-string p1, "  WARN: "

    .line 78
    .line 79
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    const-string p1, "  INFO: "

    .line 84
    .line 85
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    const-string p1, " DEBUG: "

    .line 90
    .line 91
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_6
    const-string p1, " TRACE: "

    .line 96
    .line 97
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    :goto_0
    if-eqz p2, :cond_7

    .line 101
    .line 102
    const/16 p1, 0x5b

    .line 103
    .line 104
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string p1, "] "

    .line 111
    .line 112
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    :cond_7
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    if-eqz p4, :cond_8

    .line 119
    .line 120
    new-instance p1, Ljava/io/StringWriter;

    .line 121
    .line 122
    invoke-direct {p1, v1}, Ljava/io/StringWriter;-><init>(I)V

    .line 123
    .line 124
    .line 125
    new-instance p2, Ljava/io/PrintWriter;

    .line 126
    .line 127
    invoke-direct {p2, p1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p4, p2}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 131
    .line 132
    .line 133
    const/16 p2, 0xa

    .line 134
    .line 135
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    :cond_8
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/minlog/Log$Logger;->print(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    return-void
.end method

.method public print(Ljava/lang/String;)V
    .locals 0

    .line 1
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
