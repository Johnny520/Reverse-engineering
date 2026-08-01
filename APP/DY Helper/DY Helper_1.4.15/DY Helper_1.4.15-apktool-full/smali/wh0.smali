.class public final synthetic Lwh0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/ClassLoader;

.field public final synthetic η:Lbi0;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ClassLoader;Lbi0;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwh0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lwh0;->ζ:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    iput-object p2, p0, Lwh0;->η:Lbi0;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lwh0;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    iget-object v2, p0, Lwh0;->η:Lbi0;

    .line 6
    .line 7
    iget-object p0, p0, Lwh0;->ζ:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, Lci0;->α:Lci0;

    .line 13
    .line 14
    invoke-static {p0, v2}, Lci0;->ξ(Ljava/lang/ClassLoader;Lbi0;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v2, v0}, Lci0;->μ(Lbi0;Ljava/util/List;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    sget-object v0, Ljz;->ε:Ljz;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    sget-object v3, Lci0;->μ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    const-string v5, "@"

    .line 42
    .line 43
    invoke-static {v4, v5, p0}, Lnx;->ι(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iget-object v4, v2, Lbi0;->ζ:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v3, p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :try_start_0
    sget-object p0, Lox;->α:Ljava/lang/Object;

    .line 53
    .line 54
    iget-object p0, v2, Lbi0;->ε:Lkx;

    .line 55
    .line 56
    invoke-static {p0, v0}, Lox;->χ(Lkx;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    new-instance v1, Leo1;

    .line 62
    .line 63
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const-string v1, "\u4fdd\u5b58 "

    .line 71
    .line 72
    const-string v2, "rf41ec7c6342b5bdc"

    .line 73
    .line 74
    if-eqz p0, :cond_1

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    const-string v3, " fallback \u7f13\u5b58\u5931\u8d25: "

    .line 81
    .line 82
    invoke-static {v1, v4, v3, p0, v2}, Lnx;->ψ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    new-instance v3, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v1, " fallback \u7f13\u5b58\u6210\u529f, reason=reflection_fallback, count="

    .line 98
    .line 99
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {v2, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    :goto_1
    return-object v0

    .line 113
    :pswitch_0
    sget-object v0, Lci0;->α:Lci0;

    .line 114
    .line 115
    const/4 v3, 0x1

    .line 116
    invoke-virtual {v0, p0, v2, v3}, Lci0;->ο(Ljava/lang/ClassLoader;Lbi0;Z)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    return-object v1

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
