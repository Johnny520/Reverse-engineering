.class public final L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世兰楪子苏哲/飘花落叶言子楪苏兰哲世;


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰苏世哲;


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲兰苏世;

.field public final 飘花落叶言子楪世苏兰哲:L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏:Lkotlin/text/Regex;

    .line 2
    .line 3
    const-string v0, "application/dns-message"

    .line 4
    .line 5
    invoke-static {v0}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰苏世哲;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰苏世哲;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲兰苏世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲兰苏世;

    .line 7
    .line 8
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰(Ljava/lang/String;L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    const-string v0, "response size exceeds limit (65536 bytes): "

    .line 2
    .line 3
    const-string v1, "response: "

    .line 4
    .line 5
    iget-object v2, p1, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪苏哲兰:L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    iget-object v2, p1, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰世苏:Lokhttp3/Protocol;

    .line 10
    .line 11
    sget-object v3, Lokhttp3/Protocol;->HTTP_2:Lokhttp3/Protocol;

    .line 12
    .line 13
    if-eq v2, v3, :cond_0

    .line 14
    .line 15
    sget-object v3, Lokhttp3/Protocol;->QUIC:Lokhttp3/Protocol;

    .line 16
    .line 17
    if-eq v2, v3, :cond_0

    .line 18
    .line 19
    sget-object v2, L飘花落叶言世兰苏哲楪子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰苏哲楪子/飘花落叶言子楪世兰苏哲;

    .line 20
    .line 21
    sget-object v2, L飘花落叶言世兰苏哲楪子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰苏哲楪子/飘花落叶言子楪世兰苏哲;

    .line 22
    .line 23
    new-instance v3, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v4, "Incorrect protocol: "

    .line 26
    .line 27
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v4, p1, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰世苏:Lokhttp3/Protocol;

    .line 31
    .line 32
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const/4 v4, 0x5

    .line 40
    const/4 v5, 0x0

    .line 41
    invoke-virtual {v2, v3, v4, v5}, L飘花落叶言世兰苏哲楪子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    :try_start_0
    iget-boolean v2, p1, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子世苏楪哲兰:Z

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    iget-object v1, p1, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰苏哲世:L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏兰哲楪;

    .line 49
    .line 50
    invoke-virtual {v1}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世哲苏兰()J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    const-wide/32 v4, 0x10000

    .line 55
    .line 56
    .line 57
    cmp-long v2, v2, v4

    .line 58
    .line 59
    if-gtz v2, :cond_1

    .line 60
    .line 61
    invoke-virtual {v1}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏世哲兰()L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏世兰哲;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-interface {v0}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏世兰哲;->飘花落叶言子世哲楪兰苏()Lokio/ByteString;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {p0, v0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Lokio/ByteString;)Ljava/util/ArrayList;

    .line 70
    .line 71
    .line 72
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    invoke-virtual {p1}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;->close()V

    .line 74
    .line 75
    .line 76
    return-object p0

    .line 77
    :catchall_0
    move-exception p0

    .line 78
    goto :goto_0

    .line 79
    :cond_1
    :try_start_1
    new-instance p0, Ljava/io/IOException;

    .line 80
    .line 81
    new-instance v2, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世哲苏兰()J

    .line 87
    .line 88
    .line 89
    move-result-wide v0

    .line 90
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v0, " bytes"

    .line 94
    .line 95
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p0

    .line 106
    :cond_2
    new-instance p0, Ljava/io/IOException;

    .line 107
    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iget v1, p1, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰世苏哲:I

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const/16 v1, 0x20

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    iget-object v1, p1, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    :goto_0
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 137
    :catchall_1
    move-exception v0

    .line 138
    invoke-static {p1, p0}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    throw v0
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(ILjava/lang/String;)L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;
    .locals 11

    .line 1
    new-instance v0, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰苏世哲;

    .line 8
    .line 9
    iget-object v1, v1, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 10
    .line 11
    const-string v2, "Accept"

    .line 12
    .line 13
    invoke-virtual {v0, v2, v1}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget v1, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v3, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;

    .line 22
    .line 23
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v3, v1}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰苏楪哲(I)V

    .line 28
    .line 29
    .line 30
    const/16 v2, 0x100

    .line 31
    .line 32
    invoke-virtual {v3, v2}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰苏楪哲(I)V

    .line 33
    .line 34
    .line 35
    const/4 v8, 0x1

    .line 36
    invoke-virtual {v3, v8}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰苏楪哲(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v1}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰苏楪哲(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v1}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰苏楪哲(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v1}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰苏楪哲(I)V

    .line 46
    .line 47
    .line 48
    new-instance v2, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;

    .line 49
    .line 50
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    new-array v4, v8, [C

    .line 54
    .line 55
    const/16 v5, 0x2e

    .line 56
    .line 57
    aput-char v5, v4, v1

    .line 58
    .line 59
    invoke-static {p2, v4}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲楪苏世兰(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-nez v5, :cond_1

    .line 68
    .line 69
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    invoke-interface {v4, v5}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    :goto_0
    invoke-interface {v5}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_1

    .line 82
    .line 83
    invoke-interface {v5}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    check-cast v6, Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-nez v6, :cond_0

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    invoke-interface {v5}, Ljava/util/ListIterator;->nextIndex()I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    add-int/2addr v5, v8

    .line 101
    invoke-static {v5, v4}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏兰哲世楪(ILjava/util/List;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    goto :goto_1

    .line 106
    :cond_1
    sget-object v4, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 107
    .line 108
    :goto_1
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-eqz v5, :cond_3

    .line 117
    .line 118
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    check-cast v5, Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {v5}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子苏兰世哲楪(Ljava/lang/String;)J

    .line 125
    .line 126
    .line 127
    move-result-wide v6

    .line 128
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    int-to-long v9, v9

    .line 133
    cmp-long v9, v6, v9

    .line 134
    .line 135
    if-nez v9, :cond_2

    .line 136
    .line 137
    long-to-int v6, v6

    .line 138
    invoke-virtual {v2, v6}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏兰楪哲(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v5}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子苏楪兰哲世(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_2
    const-string p0, "non-ascii hostname: "

    .line 146
    .line 147
    invoke-virtual {p0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    const/4 p0, 0x0

    .line 155
    return-object p0

    .line 156
    :cond_3
    invoke-virtual {v2, v1}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏兰楪哲(I)V

    .line 157
    .line 158
    .line 159
    const-wide/16 v4, 0x0

    .line 160
    .line 161
    iget-wide v6, v2, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 162
    .line 163
    invoke-virtual/range {v2 .. v7}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;JJ)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3, p1}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰苏楪哲(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3, v8}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰苏楪哲(I)V

    .line 170
    .line 171
    .line 172
    iget-wide p1, v3, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 173
    .line 174
    invoke-virtual {v3, p1, p2}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世兰苏(J)Lokio/ByteString;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-virtual {p1}, Lokio/ByteString;->base64Url()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    const-string p2, "="

    .line 183
    .line 184
    const-string v1, ""

    .line 185
    .line 186
    invoke-static {p1, p2, v1}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    iget-object p0, p0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲兰苏世;

    .line 191
    .line 192
    invoke-virtual {p0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏()L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲兰世苏;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    const-string p2, "dns"

    .line 197
    .line 198
    invoke-virtual {p0, p2, p1}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲兰苏世;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    iput-object p0, v0, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 206
    .line 207
    new-instance p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;

    .line 208
    .line 209
    invoke-direct {p0, v0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;-><init>(Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;)V

    .line 210
    .line 211
    .line 212
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/util/List;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, L飘花落叶言世兰哲楪子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世兰哲楪子苏/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, L飘花落叶言世兰哲楪子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    move v0, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    :goto_0
    if-nez v0, :cond_6

    .line 18
    .line 19
    invoke-static {}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰()Lkotlin/collections/builders/ListBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, v2, p1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(ILjava/lang/String;)L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-instance v4, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;

    .line 28
    .line 29
    iget-object v5, p0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;

    .line 30
    .line 31
    invoke-direct {v4, v5, v3}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;-><init>(L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    const/16 v3, 0x1c

    .line 38
    .line 39
    invoke-virtual {p0, v3, p1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(ILjava/lang/String;)L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    new-instance v4, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;

    .line 44
    .line 45
    invoke-direct {v4, v5, v3}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;-><init>(L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lkotlin/collections/builders/ListBuilder;->build()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    new-instance v4, Ljava/util/ArrayList;

    .line 56
    .line 57
    const/4 v3, 0x2

    .line 58
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 59
    .line 60
    .line 61
    new-instance v8, Ljava/util/ArrayList;

    .line 62
    .line 63
    const/4 v3, 0x5

    .line 64
    invoke-direct {v8, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    new-instance v5, Ljava/util/concurrent/CountDownLatch;

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-direct {v5, v3}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_1

    .line 85
    .line 86
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    move-object v9, v3

    .line 91
    check-cast v9, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;

    .line 92
    .line 93
    new-instance v3, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 94
    .line 95
    move-object v6, p0

    .line 96
    move-object v7, p1

    .line 97
    invoke-direct/range {v3 .. v8}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;-><init>(Ljava/util/ArrayList;Ljava/util/concurrent/CountDownLatch;L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v9, v3}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏(L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世哲兰苏;)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_1
    move-object v7, p1

    .line 105
    :try_start_0
    invoke-virtual {v5}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :catch_0
    move-exception v0

    .line 110
    move-object p0, v0

    .line 111
    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    :goto_2
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-eqz p0, :cond_5

    .line 119
    .line 120
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-nez p0, :cond_4

    .line 125
    .line 126
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    check-cast p0, Ljava/lang/Exception;

    .line 131
    .line 132
    instance-of p1, p0, Ljava/net/UnknownHostException;

    .line 133
    .line 134
    if-nez p1, :cond_3

    .line 135
    .line 136
    new-instance p1, Ljava/net/UnknownHostException;

    .line 137
    .line 138
    invoke-direct {p1, v7}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    :goto_3
    if-ge v2, p0, :cond_2

    .line 149
    .line 150
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Ljava/lang/Throwable;

    .line 155
    .line 156
    invoke-static {p1, v0}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    add-int/lit8 v2, v2, 0x1

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_2
    throw p1

    .line 163
    :cond_3
    throw p0

    .line 164
    :cond_4
    new-instance p0, Ljava/net/UnknownHostException;

    .line 165
    .line 166
    invoke-direct {p0, v7}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p0

    .line 170
    :cond_5
    return-object v8

    .line 171
    :cond_6
    new-instance p0, Ljava/net/UnknownHostException;

    .line 172
    .line 173
    const-string p1, "private hosts not resolved"

    .line 174
    .line 175
    invoke-direct {p0, p1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw p0
.end method
