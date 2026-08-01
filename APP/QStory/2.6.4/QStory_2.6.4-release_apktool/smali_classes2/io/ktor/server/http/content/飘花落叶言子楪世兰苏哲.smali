.class public final synthetic Lio/ktor/server/http/content/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lio/ktor/server/http/content/飘花落叶言子楪世兰哲苏;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Lio/ktor/server/http/content/飘花落叶言子楪世兰哲苏;I)V
    .locals 0

    .line 1
    iput p2, p0, Lio/ktor/server/http/content/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lio/ktor/server/http/content/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Lio/ktor/server/http/content/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lio/ktor/server/http/content/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Lio/ktor/server/http/content/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Lio/ktor/server/http/content/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lio/ktor/server/http/content/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 9
    .line 10
    invoke-interface {p0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ljava/util/jar/JarEntry;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    const/4 p0, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :pswitch_0
    new-instance v0, Ljava/util/jar/JarFile;

    .line 33
    .line 34
    iget-object p0, p0, Lio/ktor/server/http/content/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/io/File;

    .line 35
    .line 36
    invoke-direct {v0, p0}, Ljava/util/jar/JarFile;-><init>(Ljava/io/File;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_1
    iget-object v0, p0, Lio/ktor/server/http/content/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 41
    .line 42
    invoke-interface {v0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Ljava/util/jar/JarFile;

    .line 47
    .line 48
    iget-object p0, p0, Lio/ktor/server/http/content/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/util/jar/JarFile;->getJarEntry(Ljava/lang/String;)Ljava/util/jar/JarEntry;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
