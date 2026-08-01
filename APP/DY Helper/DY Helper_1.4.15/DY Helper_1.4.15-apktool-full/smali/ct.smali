.class public final Lct;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lct;->α:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    return-void
.end method

.method public static final α(Lk01;Ljava/lang/String;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lk01;->γ:[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    instance-of v1, v0, Ljava/lang/Integer;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast v0, Ljava/lang/Integer;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, v2

    .line 19
    :goto_0
    if-eqz v0, :cond_5

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x6

    .line 26
    if-eq v0, v1, :cond_1

    .line 27
    .line 28
    goto :goto_3

    .line 29
    :cond_1
    sget-object v0, Lct;->α:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-ltz v3, :cond_5

    .line 36
    .line 37
    if-ge v3, v1, :cond_5

    .line 38
    .line 39
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    array-length v4, v1

    .line 51
    const/4 v5, 0x0

    .line 52
    :goto_1
    if-ge v5, v4, :cond_5

    .line 53
    .line 54
    aget-object v6, v1, v5

    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    const-string v7, "~79483057E7CA3B343415F96C2AB217F7DD3E100350CFB712CED5BD5ECBA8992653747B4C9D50D28D3F2E9C36E567C62E1C1AC5F4C0195F"

    .line 61
    .line 62
    invoke-static {v7}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_4

    .line 71
    .line 72
    invoke-static {}, Lx9;->ε()Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_2

    .line 77
    .line 78
    const/4 p0, -0x1

    .line 79
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_2
    iget-object v0, p0, Lk01;->ε:Ljava/lang/Object;

    .line 84
    .line 85
    instance-of v1, v0, Ljava/lang/Integer;

    .line 86
    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    check-cast v0, Ljava/lang/Integer;

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_3
    move-object v0, v2

    .line 93
    :goto_2
    if-eqz v0, :cond_5

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {p0, v1}, Lk01;->α(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    if-eq v0, v3, :cond_5

    .line 107
    .line 108
    add-int/lit8 v0, v0, 0x1

    .line 109
    .line 110
    add-int/lit8 v3, v3, 0x1

    .line 111
    .line 112
    const-string p0, " \u62e6\u622a\u6210\u529f: \u539f\u59cb="

    .line 113
    .line 114
    const-string v1, "\u70b9 \u2192 \u76ee\u6807="

    .line 115
    .line 116
    const-string v4, "\u9ab0\u5b50 "

    .line 117
    .line 118
    invoke-static {v0, v4, p1, p0, v1}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    const-string p1, "\u70b9"

    .line 123
    .line 124
    invoke-static {p0, v3, p1}, Lnx;->κ(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    const/4 p1, 0x4

    .line 129
    const-string v0, "rf839340cfbdf7ea6"

    .line 130
    .line 131
    invoke-static {v0, p0, v2, p1, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_5
    :goto_3
    return-void
.end method

.method public static β(I)V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x4

    .line 3
    const-string v2, "rf839340cfbdf7ea6"

    .line 4
    .line 5
    sget-object v3, Lct;->α:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    if-gt v0, p0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x7

    .line 11
    if-ge p0, v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lx9;->ε()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    add-int/lit8 v0, p0, -0x1

    .line 20
    .line 21
    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 22
    .line 23
    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v5, "\u9ab0\u5b50\u5df2\u8bbe\u5b9a\u4e3a "

    .line 27
    .line 28
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p0, " \u70b9 (\u5185\u90e8\u503c="

    .line 35
    .line 36
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p0, ")"

    .line 40
    .line 41
    invoke-static {v3, v0, p0}, Lnx;->κ(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {v2, p0, v4, v1, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    const/4 p0, -0x1

    .line 50
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 51
    .line 52
    .line 53
    const-string p0, "\u9ab0\u5b50\u5df2\u6062\u590d\u968f\u673a\u6a21\u5f0f"

    .line 54
    .line 55
    invoke-static {v2, p0, v4, v1, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method
