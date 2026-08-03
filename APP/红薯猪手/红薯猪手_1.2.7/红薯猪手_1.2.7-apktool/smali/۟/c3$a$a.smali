.class public final L۟/c3$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/database/DatabaseErrorHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/c3$a;-><init>(Landroid/content/Context;Ljava/lang/String;[L۟/b3;L۟/bb$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/bb$a;

.field public final synthetic ۥ۟:[L۟/b3;


# direct methods
.method public constructor <init>(L۟/bb$a;[L۟/b3;)V
    .locals 0

    iput-object p1, p0, L۟/c3$a$a;->ۥ:L۟/bb$a;

    iput-object p2, p0, L۟/c3$a$a;->ۥ۟:[L۟/b3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCorruption(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    .line 1
    iget-object v0, p0, L۟/c3$a$a;->ۥ:L۟/bb$a;

    .line 2
    .line 3
    iget-object v1, p0, L۟/c3$a$a;->ۥ۟:[L۟/b3;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v3, v1, v2

    .line 7
    .line 8
    if-eqz v3, :cond_1

    .line 9
    .line 10
    iget-object v3, v3, L۟/b3;->ۥ:Landroid/database/sqlite/SQLiteDatabase;

    .line 11
    .line 12
    if-ne v3, p1, :cond_0

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v3, v2

    .line 17
    :goto_0
    if-nez v3, :cond_2

    .line 18
    .line 19
    :cond_1
    new-instance v3, L۟/b3;

    .line 20
    .line 21
    invoke-direct {v3, p1}, L۟/b3;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 22
    .line 23
    .line 24
    aput-object v3, v1, v2

    .line 25
    .line 26
    :cond_2
    aget-object p1, v1, v2

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v1, "Corruption reported by sqlite on database: "

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, L۟/b3;->ۥ۟ۦ()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "SupportSQLite"

    .line 53
    .line 54
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, L۟/b3;->isOpen()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    goto :goto_6

    .line 64
    :cond_3
    const/4 v0, 0x0

    .line 65
    :try_start_0
    invoke-virtual {p1}, L۟/b3;->ۥ۟۟()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v0
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    goto :goto_1

    .line 70
    :catchall_0
    move-exception v1

    .line 71
    goto :goto_2

    .line 72
    :catch_0
    :goto_1
    :try_start_1
    invoke-virtual {p1}, L۟/b3;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    .line 74
    .line 75
    goto :goto_4

    .line 76
    :goto_2
    if-eqz v0, :cond_4

    .line 77
    .line 78
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_5

    .line 87
    .line 88
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Landroid/util/Pair;

    .line 93
    .line 94
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v0}, L۟/bb$a;->ۥ(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    invoke-virtual {p1}, L۟/b3;->ۥ۟ۦ()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {p1}, L۟/bb$a;->ۥ(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    :cond_5
    throw v1

    .line 110
    :catch_1
    :goto_4
    if-eqz v0, :cond_6

    .line 111
    .line 112
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_7

    .line 121
    .line 122
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, Landroid/util/Pair;

    .line 127
    .line 128
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {v0}, L۟/bb$a;->ۥ(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_6
    :goto_6
    invoke-virtual {p1}, L۟/b3;->ۥ۟ۦ()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-static {p1}, L۟/bb$a;->ۥ(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :cond_7
    return-void
.end method
