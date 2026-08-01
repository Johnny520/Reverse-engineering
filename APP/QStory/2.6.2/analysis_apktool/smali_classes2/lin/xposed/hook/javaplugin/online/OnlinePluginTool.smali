.class public Llin/xposed/hook/javaplugin/online/OnlinePluginTool;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide v0, -0x36a544ba051405a7L    # -2.384532742586477E45

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Llin/xposed/hook/javaplugin/online/OnlinePluginTool;->url:Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public downloadScript(JLjava/io/File;)V
    .locals 5

    .line 1
    invoke-virtual {p3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p3}, Ljava/io/File;->createNewFile()Z

    .line 25
    .line 26
    .line 27
    :cond_1
    new-instance v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;

    .line 28
    .line 29
    invoke-direct {v0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v1, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 33
    .line 34
    const/4 v2, 0x6

    .line 35
    invoke-direct {v1, v2}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Llin/xposed/hook/javaplugin/online/OnlinePluginTool;->url:Ljava/lang/String;

    .line 44
    .line 45
    const-wide v3, -0x36a54472051405a7L    # -2.3846307439081503E45

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-static {v2, p0, v3, v4}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世楪兰苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {v1, p0}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    new-instance p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;

    .line 64
    .line 65
    invoke-direct {p0, v1}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;-><init>(Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;)V

    .line 66
    .line 67
    .line 68
    new-instance p1, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;

    .line 69
    .line 70
    invoke-direct {p1, v0, p0}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;-><init>(L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲()L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    new-instance p1, Ljava/io/BufferedInputStream;

    .line 78
    .line 79
    iget-object p2, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰苏哲世:L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏兰哲楪;

    .line 80
    .line 81
    invoke-virtual {p2}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲()Ljava/io/InputStream;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-direct {p1, p2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 86
    .line 87
    .line 88
    :try_start_0
    new-instance p2, Ljava/io/BufferedOutputStream;

    .line 89
    .line 90
    new-instance v0, Ljava/io/FileOutputStream;

    .line 91
    .line 92
    invoke-direct {v0, p3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 93
    .line 94
    .line 95
    invoke-direct {p2, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 96
    .line 97
    .line 98
    const/16 p3, 0x800

    .line 99
    .line 100
    :try_start_1
    new-array p3, p3, [B

    .line 101
    .line 102
    :goto_0
    invoke-virtual {p1, p3}, Ljava/io/InputStream;->read([B)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    const/4 v1, -0x1

    .line 107
    if-eq v0, v1, :cond_2

    .line 108
    .line 109
    const/4 v1, 0x0

    .line 110
    invoke-virtual {p2, p3, v1, v0}, Ljava/io/BufferedOutputStream;->write([BII)V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :catchall_0
    move-exception p0

    .line 115
    goto :goto_1

    .line 116
    :cond_2
    invoke-virtual {p2}, Ljava/io/BufferedOutputStream;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    .line 118
    .line 119
    :try_start_2
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/io/BufferedInputStream;->close()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;->close()V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :catchall_1
    move-exception p0

    .line 130
    goto :goto_3

    .line 131
    :goto_1
    :try_start_3
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :catchall_2
    move-exception p2

    .line 136
    :try_start_4
    invoke-virtual {p0, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    :goto_2
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 140
    :goto_3
    :try_start_5
    invoke-virtual {p1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 141
    .line 142
    .line 143
    goto :goto_4

    .line 144
    :catchall_3
    move-exception p1

    .line 145
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    :goto_4
    throw p0
.end method

.method public getOnlinePluginList(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 5

    .line 1
    new-instance v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    invoke-direct {v0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰()L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;

    .line 11
    .line 12
    invoke-direct {v1, v0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;-><init>(L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 16
    .line 17
    const/4 v2, 0x6

    .line 18
    invoke-direct {v0, v2}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Llin/xposed/hook/javaplugin/online/OnlinePluginTool;->url:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-wide v3, -0x36a54492051405a7L    # -2.3845871877651844E45

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {v0, p0}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string p0, "GET"

    .line 54
    .line 55
    const/4 p1, 0x0

    .line 56
    invoke-virtual {v0, p0, p1}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲世苏(Ljava/lang/String;L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏楪哲兰;)V

    .line 57
    .line 58
    .line 59
    const-wide p0, -0x36a5056e051405a7L    # -2.4065884844808246E45

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    const-wide v2, -0x36a50555051405a7L    # -2.4066225127175167E45

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {v0, p0, p1}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const-wide p0, -0x36a50551051405a7L    # -2.4066279572353875E45

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    const-wide v2, -0x36a50544051405a7L    # -2.4066456519184674E45

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {v0, p0, p1}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    new-instance p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;

    .line 102
    .line 103
    invoke-direct {p0, v0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;-><init>(Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;)V

    .line 104
    .line 105
    .line 106
    new-instance p1, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;

    .line 107
    .line 108
    invoke-direct {p1, v1, p0}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;-><init>(L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲()L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    iget-object p1, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰苏哲世:L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏兰哲楪;

    .line 116
    .line 117
    invoke-virtual {p1}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏世兰哲()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-static {p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;->close()V

    .line 126
    .line 127
    .line 128
    const-wide v0, -0x36a520d9051405a7L    # -2.3970347167471524E45

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/JSONObject;->getJSONArray(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONArray;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0
.end method
