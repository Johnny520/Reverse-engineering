.class public Llin/xposed/hook/javaplugin/online/OnlinePluginTool;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x2b4

    .line 5
    .line 6
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Llin/xposed/hook/javaplugin/online/OnlinePluginTool;->url:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public downloadScript(JLjava/io/File;)V
    .locals 3

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
    new-instance v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;

    .line 28
    .line 29
    invoke-direct {v0}, L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;-><init>()V

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
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const/16 p0, 0x2b6

    .line 49
    .line 50
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {v1, p0}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    new-instance p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪哲苏兰;

    .line 68
    .line 69
    invoke-direct {p0, v1}, L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪哲苏兰;-><init>(Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;)V

    .line 70
    .line 71
    .line 72
    new-instance p1, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲世兰苏;

    .line 73
    .line 74
    invoke-direct {p1, v0, p0}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲世兰苏;-><init>(L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪哲苏兰;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲()L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    new-instance p1, Ljava/io/BufferedInputStream;

    .line 82
    .line 83
    iget-object p2, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰苏哲世:L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏兰哲楪;

    .line 84
    .line 85
    invoke-virtual {p2}, L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲()Ljava/io/InputStream;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-direct {p1, p2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 90
    .line 91
    .line 92
    :try_start_0
    new-instance p2, Ljava/io/BufferedOutputStream;

    .line 93
    .line 94
    new-instance v0, Ljava/io/FileOutputStream;

    .line 95
    .line 96
    invoke-direct {v0, p3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 97
    .line 98
    .line 99
    invoke-direct {p2, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 100
    .line 101
    .line 102
    const/16 p3, 0x800

    .line 103
    .line 104
    :try_start_1
    new-array p3, p3, [B

    .line 105
    .line 106
    :goto_0
    invoke-virtual {p1, p3}, Ljava/io/InputStream;->read([B)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    const/4 v1, -0x1

    .line 111
    if-eq v0, v1, :cond_2

    .line 112
    .line 113
    const/4 v1, 0x0

    .line 114
    invoke-virtual {p2, p3, v1, v0}, Ljava/io/BufferedOutputStream;->write([BII)V

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :catchall_0
    move-exception p0

    .line 119
    goto :goto_1

    .line 120
    :cond_2
    invoke-virtual {p2}, Ljava/io/BufferedOutputStream;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    .line 122
    .line 123
    :try_start_2
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/io/BufferedInputStream;->close()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;->close()V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :catchall_1
    move-exception p0

    .line 134
    goto :goto_3

    .line 135
    :goto_1
    :try_start_3
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :catchall_2
    move-exception p2

    .line 140
    :try_start_4
    invoke-virtual {p0, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    :goto_2
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 144
    :goto_3
    :try_start_5
    invoke-virtual {p1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 145
    .line 146
    .line 147
    goto :goto_4

    .line 148
    :catchall_3
    move-exception p1

    .line 149
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    :goto_4
    throw p0
.end method

.method public getOnlinePluginList(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    invoke-direct {v0}, L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰()L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰哲苏世;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;

    .line 11
    .line 12
    invoke-direct {v1, v0}, L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;-><init>(L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰哲苏世;)V

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
    const/16 p0, 0x2b5

    .line 32
    .line 33
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {v0, p0}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string p0, "GET"

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    invoke-virtual {v0, p0, p1}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲世苏(Ljava/lang/String;L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏楪哲兰;)V

    .line 54
    .line 55
    .line 56
    const-string p0, "\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 57
    .line 58
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const-string p1, "\u55b5\u545c\u55b5\u545c\u545c\u55b5\u55b5\u545c~\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u545c\u55b5\u545c\u55b5\u55b5\u55b5\u55b5"

    .line 63
    .line 64
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {v0, p0, p1}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/16 p0, 0x1b

    .line 72
    .line 73
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    const/16 p1, 0x1c

    .line 78
    .line 79
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {v0, p0, p1}, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    new-instance p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪哲苏兰;

    .line 87
    .line 88
    invoke-direct {p0, v0}, L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪哲苏兰;-><init>(Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;)V

    .line 89
    .line 90
    .line 91
    new-instance p1, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲世兰苏;

    .line 92
    .line 93
    invoke-direct {p1, v1, p0}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲世兰苏;-><init>(L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪哲苏兰;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲()L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    iget-object p1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰苏哲世:L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏兰哲楪;

    .line 101
    .line 102
    invoke-virtual {p1}, L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏世兰哲()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p0}, L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;->close()V

    .line 111
    .line 112
    .line 113
    const-string p0, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c"

    .line 114
    .line 115
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/JSONObject;->getJSONArray(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONArray;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0
.end method
