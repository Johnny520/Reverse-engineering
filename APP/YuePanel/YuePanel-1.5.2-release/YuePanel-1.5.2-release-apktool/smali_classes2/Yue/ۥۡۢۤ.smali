.class public final LYue/ۥۡۢۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(LYue/ۥۣۡۢۤ;)LYue/ۥ۠۟ۧۥ$ۥ;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣۡۢۤ;->ۥۣ۟۟ۥ()LYue/ۥ۠۟ۧۥ;

    move-result-object p0

    if-eqz p0, :cond_0

    :goto_0
    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟ۡ۟ۢ()LYue/ۥ۠۟ۧۥ$ۥ;

    move-result-object p0

    goto :goto_1

    :cond_0
    new-instance p0, LYue/ۥ۠۟ۧۥ;

    const-string v0, ""

    invoke-direct {p0, v0}, LYue/ۥ۠۟ۧۥ;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :goto_1
    return-object p0
.end method

.method public static ۥ۟(LYue/ۥۣۡۢۤ;)LYue/ۥۣۡۧۦ;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣۡۢۤ;->ۥۣ۟۟ۥ()LYue/ۥ۠۟ۧۥ;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟ۡ۟ۥ()LYue/ۥۣۡۧۦ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟ۡ۟ۥ()LYue/ۥۣۡۧۦ;

    move-result-object p0

    goto :goto_0

    :cond_0
    new-instance p0, LYue/ۥۣۡۧۦ;

    new-instance v0, LYue/ۥ۠ۤۧۡ;

    invoke-direct {v0}, LYue/ۥ۠ۤۧۡ;-><init>()V

    invoke-direct {p0, v0}, LYue/ۥۣۡۧۦ;-><init>(LYue/ۥۢۢۡۧ;)V

    :goto_0
    return-object p0
.end method

.method public static ۥ۟۟(Ljava/lang/String;LYue/ۥ۠۠ۥۥ;Ljava/lang/Class;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "LYue/\u06e5\u06e1\u06e2\u06e3\u06e4;",
            ">(",
            "Ljava/lang/String;",
            "LYue/\u06e5\u06e0\u06e0\u06e5\u06e5;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    invoke-static {p2}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    new-instance v0, LYue/ۥۢۥ۠ۥ;

    invoke-direct {v0}, LYue/ۥۢۥ۠ۥ;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LYue/ۥۢۥ۠ۥ;->ۥ۟۟۟ۦ(Z)LYue/ۥۢۥ۠ۥ;

    move-result-object v0

    invoke-virtual {v0, p1}, LYue/ۥۢۥ۠ۥ;->ۥ۟۟۟ۤ(LYue/ۥ۠۠ۥۥ;)Lorg/w3c/dom/Document;

    move-result-object p1

    invoke-virtual {v0, p1}, LYue/ۥۢۥ۠ۥ;->ۥ۟۟۟۟(Lorg/w3c/dom/Document;)Lorg/w3c/dom/Node;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, LYue/ۥۢۥ۠ۥ;->ۥ۟۟۠۟(Ljava/lang/String;Lorg/w3c/dom/Node;)Lorg/w3c/dom/NodeList;

    move-result-object p0

    invoke-virtual {v0, p0, p2}, LYue/ۥۢۥ۠ۥ;->ۥ۟۟۠۠(Lorg/w3c/dom/NodeList;Ljava/lang/Class;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟(Ljava/util/Iterator;)Ljava/util/Spliterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "LYue/\u06e5\u06e1\u06e2\u06e3\u06e4;",
            ">(",
            "Ljava/util/Iterator<",
            "TT;>;)",
            "Ljava/util/Spliterator<",
            "TT;>;"
        }
    .end annotation

    const/16 v0, 0x111

    invoke-static {p0, v0}, Ljava/util/Spliterators;->spliteratorUnknownSize(Ljava/util/Iterator;I)Ljava/util/Spliterator;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟۟(LYue/ۥۣۡۢۤ;Ljava/lang/Class;)Ljava/util/stream/Stream;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "LYue/\u06e5\u06e1\u06e2\u06e3\u06e4;",
            ">(",
            "LYue/\u06e5\u06e1\u06e2\u06e3\u06e4;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/util/stream/Stream<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣۡۢۦ;

    invoke-direct {v0, p0, p1}, LYue/ۥۣۡۢۦ;-><init>(LYue/ۥۣۡۢۤ;Ljava/lang/Class;)V

    invoke-static {v0}, LYue/ۥۡۢۤ;->ۥ۟۟۟(Ljava/util/Iterator;)Ljava/util/Spliterator;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Ljava/util/stream/StreamSupport;->stream(Ljava/util/Spliterator;Z)Ljava/util/stream/Stream;

    move-result-object p0

    return-object p0
.end method
