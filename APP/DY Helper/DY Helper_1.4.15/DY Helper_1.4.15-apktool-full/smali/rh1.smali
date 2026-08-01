.class public final synthetic Lrh1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Z

.field public final synthetic η:Ljava/lang/ClassLoader;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/ClassLoader;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lrh1;->ε:I

    .line 5
    .line 6
    iput-boolean p3, p0, Lrh1;->ζ:Z

    .line 7
    .line 8
    iput-object p2, p0, Lrh1;->η:Ljava/lang/ClassLoader;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Lrh1;->ε:I

    .line 2
    .line 3
    iget-boolean v1, p0, Lrh1;->ζ:Z

    .line 4
    .line 5
    iget-object p0, p0, Lrh1;->η:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    sget-object v2, Lsh1;->η:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eq v2, v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :cond_0
    sget-object v0, Lsh1;->κ:Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    if-eqz v0, :cond_5

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/app/Activity;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    sget-object v2, Lsh1;->α:Lsh1;

    .line 31
    .line 32
    invoke-static {v0}, Lsh1;->ρ(Landroid/app/Activity;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    const/4 v4, 0x0

    .line 37
    const-string v5, "auto_scroll_show_toast"

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string v1, "auto next skipped by interaction guard, activity="

    .line 50
    .line 51
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v5, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_5

    .line 63
    .line 64
    const-string p0, "DY Helper\uff1a\u68c0\u6d4b\u5230\u8bc4\u8bba\u533a/\u8f93\u5165\u72b6\u6001\uff0c\u5df2\u8df3\u8fc7\u81ea\u52a8\u4e0b\u6ed1"

    .line 65
    .line 66
    invoke-static {v0, p0}, Lsh1;->σ(Landroid/app/Activity;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_2
    invoke-virtual {v2, v0}, Lsh1;->ε(Landroid/app/Activity;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    new-instance v6, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v7, "auto next dispatch result="

    .line 85
    .line 86
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v7, ", activity="

    .line 93
    .line 94
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-static {v3}, Lsh1;->ν(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    if-eqz v2, :cond_4

    .line 108
    .line 109
    invoke-static {v5, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_3

    .line 114
    .line 115
    const-string v2, "DY Helper\uff1a\u5df2\u81ea\u52a8\u4e0b\u6ed1\u5230\u4e0b\u4e00\u4e2a\u4f5c\u54c1"

    .line 116
    .line 117
    invoke-static {v0, v2}, Lsh1;->σ(Landroid/app/Activity;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_3
    if-eqz v1, :cond_5

    .line 121
    .line 122
    sget-object v0, Lsh1;->β:Landroid/os/Handler;

    .line 123
    .line 124
    new-instance v1, Loj;

    .line 125
    .line 126
    const/4 v2, 0x6

    .line 127
    invoke-direct {v1, p0, v2}, Loj;-><init>(Ljava/lang/ClassLoader;I)V

    .line 128
    .line 129
    .line 130
    const-wide/16 v2, 0x3e8

    .line 131
    .line 132
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_4
    invoke-static {v5, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    if-eqz p0, :cond_5

    .line 141
    .line 142
    const-string p0, "DY Helper\uff1a\u672a\u627e\u5230\u53ef\u5207\u6362\u7684\u4f5c\u54c1\u5217\u8868"

    .line 143
    .line 144
    invoke-static {v0, p0}, Lsh1;->σ(Landroid/app/Activity;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :cond_5
    :goto_0
    return-void
.end method
