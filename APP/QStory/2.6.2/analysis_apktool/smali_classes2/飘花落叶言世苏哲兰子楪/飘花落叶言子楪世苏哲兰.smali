.class public abstract L飘花落叶言世苏哲兰子楪/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 8
    .line 9
    .line 10
    new-instance v0, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, v1}, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, L飘花落叶言世苏哲兰子楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;

    .line 17
    .line 18
    const-string v0, "java.io.tmpdir"

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v1, Ljava/io/File;

    .line 28
    .line 29
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v0, "os.name"

    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    const-string v1, "Windows"

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-static {v0, v1, v2}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰哲苏楪(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method
