.class public abstract L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪世苏子哲兰;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, L飘花落叶言世子苏哲楪兰/飘花落叶言楪世苏子哲兰;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 9
    .line 10
    .line 11
    new-instance v0, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    invoke-direct {v0, v1}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 15
    .line 16
    .line 17
    sput-object v0, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 18
    .line 19
    const-string v0, "java.io.tmpdir"

    .line 20
    .line 21
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v1, Ljava/io/File;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v0, "os.name"

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    const-string v1, "Windows"

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-static {v0, v1, v2}, Lkotlin/text/飘花落叶言子楪兰哲世苏;->飘花落叶言子哲世楪苏兰(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method
