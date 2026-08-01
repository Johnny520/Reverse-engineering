.class public Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰世苏哲;
.super L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    const/16 v0, 0x43d

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v0, v1, p1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/16 v0, 0x43e

    .line 13
    .line 14
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-class v2, Ljava/lang/String;

    .line 19
    .line 20
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p1, v0, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;

    .line 29
    .line 30
    invoke-direct {v0, p0, v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;-><init>(L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1, v0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰苏哲;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 2

    .line 1
    const/16 p0, 0x43c

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 v1, 0x43a

    .line 24
    .line 25
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method
