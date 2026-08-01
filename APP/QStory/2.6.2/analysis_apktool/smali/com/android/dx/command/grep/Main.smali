.class public final Lcom/android/dx/command/grep/Main;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static main([Ljava/lang/String;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v1, p0, v0

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    aget-object p0, p0, v2

    .line 6
    .line 7
    new-instance v3, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 8
    .line 9
    new-instance v4, Ljava/io/File;

    .line 10
    .line 11
    invoke-direct {v4, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v3, v4}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;-><init>(Ljava/io/File;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lcom/android/dx/command/grep/Grep;

    .line 18
    .line 19
    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-instance v4, Ljava/io/PrintWriter;

    .line 24
    .line 25
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 26
    .line 27
    invoke-direct {v4, v5}, Ljava/io/PrintWriter;-><init>(Ljava/io/OutputStream;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v1, v3, p0, v4}, Lcom/android/dx/command/grep/Grep;-><init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;Ljava/util/regex/Pattern;Ljava/io/PrintWriter;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/android/dx/command/grep/Grep;->grep()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-lez p0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v0, v2

    .line 41
    :goto_0
    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
