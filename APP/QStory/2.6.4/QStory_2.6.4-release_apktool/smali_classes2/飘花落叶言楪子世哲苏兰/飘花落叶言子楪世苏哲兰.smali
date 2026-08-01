.class public final synthetic L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/String;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/ClassLoader;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/ClassLoader;)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/ClassLoader;

    .line 5
    .line 6
    iget-object p0, p0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 7
    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-static {v2, p0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/ClassLoader;Ljava/lang/String;)Ldalvik/system/InMemoryDexClassLoader;

    .line 14
    .line 15
    .line 16
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception p0

    .line 19
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v2, "[BeanShell] GetLoaderByAar: "

    .line 24
    .line 25
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    return-object v1

    .line 39
    :pswitch_0
    :try_start_1
    new-instance p1, Ljava/io/File;

    .line 40
    .line 41
    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Ljava/nio/file/Files;->readAllBytes(Ljava/nio/file/Path;)[B

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    new-instance p1, Ldalvik/system/InMemoryDexClassLoader;

    .line 57
    .line 58
    invoke-direct {p1, p0, v2}, Ldalvik/system/InMemoryDexClassLoader;-><init>(Ljava/nio/ByteBuffer;Ljava/lang/ClassLoader;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 59
    .line 60
    .line 61
    move-object v1, p1

    .line 62
    goto :goto_1

    .line 63
    :catch_1
    move-exception p0

    .line 64
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 65
    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v2, "[BeanShell] GetLoaderByDex: "

    .line 69
    .line 70
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :goto_1
    return-object v1

    .line 84
    :pswitch_1
    :try_start_2
    invoke-static {v2, p0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/ClassLoader;Ljava/lang/String;)Ldalvik/system/InMemoryDexClassLoader;

    .line 85
    .line 86
    .line 87
    move-result-object v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 88
    goto :goto_2

    .line 89
    :catch_2
    move-exception p0

    .line 90
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 91
    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v2, "[BeanShell] GetLoaderByJar: "

    .line 95
    .line 96
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    :goto_2
    return-object v1

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
