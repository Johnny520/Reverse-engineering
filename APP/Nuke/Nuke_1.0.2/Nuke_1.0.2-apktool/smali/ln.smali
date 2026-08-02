.class public abstract Lln;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lpq;

.field public static final b:I

.field public static final c:I

.field public static final d:Lhh1;

.field public static final e:Lhh1;

.field public static final f:Lhh1;

.field public static final g:Lhh1;

.field public static final h:Lhh1;

.field public static final i:Lhh1;

.field public static final j:Lhh1;

.field public static final k:Lhh1;

.field public static final l:Lhh1;

.field public static final m:Lhh1;

.field public static final n:Lhh1;

.field public static final o:Lhh1;

.field public static final p:Lhh1;

.field public static final q:Lhh1;

.field public static final r:Lhh1;

.field public static final s:Lhh1;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lpq;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/4 v5, 0x0

    .line 5
    const-wide/16 v1, -0x1

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct/range {v0 .. v5}, Lpq;-><init>(JLpq;Ljn;I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lln;->a:Lpq;

    .line 12
    .line 13
    const-string v0, "kotlinx.coroutines.bufferedChannel.segmentSize"

    .line 14
    .line 15
    const/16 v1, 0x20

    .line 16
    .line 17
    const/16 v2, 0xc

    .line 18
    .line 19
    invoke-static {v0, v1, v2}, Ltl;->Y(Ljava/lang/String;II)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sput v0, Lln;->b:I

    .line 24
    .line 25
    const-string v0, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations"

    .line 26
    .line 27
    const/16 v1, 0x2710

    .line 28
    .line 29
    invoke-static {v0, v1, v2}, Ltl;->Y(Ljava/lang/String;II)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sput v0, Lln;->c:I

    .line 34
    .line 35
    new-instance v0, Lhh1;

    .line 36
    .line 37
    const-string v1, "BUFFERED"

    .line 38
    .line 39
    const/16 v2, 0x13

    .line 40
    .line 41
    invoke-direct {v0, v2, v1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lln;->d:Lhh1;

    .line 45
    .line 46
    new-instance v0, Lhh1;

    .line 47
    .line 48
    const-string v1, "SHOULD_BUFFER"

    .line 49
    .line 50
    invoke-direct {v0, v2, v1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lln;->e:Lhh1;

    .line 54
    .line 55
    new-instance v0, Lhh1;

    .line 56
    .line 57
    const-string v1, "S_RESUMING_BY_RCV"

    .line 58
    .line 59
    invoke-direct {v0, v2, v1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lln;->f:Lhh1;

    .line 63
    .line 64
    new-instance v0, Lhh1;

    .line 65
    .line 66
    const-string v1, "RESUMING_BY_EB"

    .line 67
    .line 68
    invoke-direct {v0, v2, v1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lln;->g:Lhh1;

    .line 72
    .line 73
    new-instance v0, Lhh1;

    .line 74
    .line 75
    const-string v1, "POISONED"

    .line 76
    .line 77
    invoke-direct {v0, v2, v1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    sput-object v0, Lln;->h:Lhh1;

    .line 81
    .line 82
    new-instance v0, Lhh1;

    .line 83
    .line 84
    const-string v1, "DONE_RCV"

    .line 85
    .line 86
    invoke-direct {v0, v2, v1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    sput-object v0, Lln;->i:Lhh1;

    .line 90
    .line 91
    new-instance v0, Lhh1;

    .line 92
    .line 93
    const-string v1, "INTERRUPTED_SEND"

    .line 94
    .line 95
    invoke-direct {v0, v2, v1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    sput-object v0, Lln;->j:Lhh1;

    .line 99
    .line 100
    new-instance v0, Lhh1;

    .line 101
    .line 102
    const-string v1, "INTERRUPTED_RCV"

    .line 103
    .line 104
    invoke-direct {v0, v2, v1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    sput-object v0, Lln;->k:Lhh1;

    .line 108
    .line 109
    new-instance v0, Lhh1;

    .line 110
    .line 111
    const-string v1, "CHANNEL_CLOSED"

    .line 112
    .line 113
    invoke-direct {v0, v2, v1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    sput-object v0, Lln;->l:Lhh1;

    .line 117
    .line 118
    new-instance v0, Lhh1;

    .line 119
    .line 120
    const-string v1, "SUSPEND"

    .line 121
    .line 122
    invoke-direct {v0, v2, v1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    sput-object v0, Lln;->m:Lhh1;

    .line 126
    .line 127
    new-instance v0, Lhh1;

    .line 128
    .line 129
    const-string v1, "SUSPEND_NO_WAITER"

    .line 130
    .line 131
    invoke-direct {v0, v2, v1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    sput-object v0, Lln;->n:Lhh1;

    .line 135
    .line 136
    new-instance v0, Lhh1;

    .line 137
    .line 138
    const-string v1, "FAILED"

    .line 139
    .line 140
    invoke-direct {v0, v2, v1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    sput-object v0, Lln;->o:Lhh1;

    .line 144
    .line 145
    new-instance v0, Lhh1;

    .line 146
    .line 147
    const-string v1, "NO_RECEIVE_RESULT"

    .line 148
    .line 149
    invoke-direct {v0, v2, v1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    sput-object v0, Lln;->p:Lhh1;

    .line 153
    .line 154
    new-instance v0, Lhh1;

    .line 155
    .line 156
    const-string v1, "CLOSE_HANDLER_CLOSED"

    .line 157
    .line 158
    invoke-direct {v0, v2, v1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    sput-object v0, Lln;->q:Lhh1;

    .line 162
    .line 163
    new-instance v0, Lhh1;

    .line 164
    .line 165
    const-string v1, "CLOSE_HANDLER_INVOKED"

    .line 166
    .line 167
    invoke-direct {v0, v2, v1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    sput-object v0, Lln;->r:Lhh1;

    .line 171
    .line 172
    new-instance v0, Lhh1;

    .line 173
    .line 174
    const-string v1, "NO_CLOSE_CAUSE"

    .line 175
    .line 176
    invoke-direct {v0, v2, v1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    sput-object v0, Lln;->s:Lhh1;

    .line 180
    .line 181
    return-void
.end method
