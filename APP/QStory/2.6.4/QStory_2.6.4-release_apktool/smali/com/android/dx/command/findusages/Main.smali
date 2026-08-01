.class public final Lcom/android/dx/command/findusages/Main;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v0, p0, v0

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    aget-object v1, p0, v1

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    aget-object p0, p0, v2

    .line 9
    .line 10
    new-instance v2, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 11
    .line 12
    new-instance v3, Ljava/io/File;

    .line 13
    .line 14
    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, v3}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;-><init>(Ljava/io/File;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Ljava/io/PrintWriter;

    .line 21
    .line 22
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 23
    .line 24
    invoke-direct {v0, v3}, Ljava/io/PrintWriter;-><init>(Ljava/io/OutputStream;)V

    .line 25
    .line 26
    .line 27
    new-instance v3, Lcom/android/dx/command/findusages/FindUsages;

    .line 28
    .line 29
    invoke-direct {v3, v2, v1, p0, v0}, Lcom/android/dx/command/findusages/FindUsages;-><init>(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Ljava/lang/String;Ljava/lang/String;Ljava/io/PrintWriter;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Lcom/android/dx/command/findusages/FindUsages;->findUsages()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/io/PrintWriter;->flush()V

    .line 36
    .line 37
    .line 38
    return-void
.end method
