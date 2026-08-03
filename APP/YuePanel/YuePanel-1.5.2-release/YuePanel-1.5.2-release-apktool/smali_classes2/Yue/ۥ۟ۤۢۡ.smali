.class public final synthetic LYue/ۥ۟ۤۢۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,61:1\n507#2,6:62\n*S KotlinDebug\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n*L\n37#1:62,6\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(LYue/ۥۡۨۡ۠;Ljava/lang/Object;)V
    .locals 2
    .param p0    # LYue/ۥۡۨۡ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Deprecated in the favour of \'trySendBlocking\'. Consider handling the result of \'trySendBlocking\' explicitly and rethrow exception if necessary"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "trySendBlocking(element)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e1\u06e0<",
            "-TE;>;TE;)V"
        }
    .end annotation

    invoke-interface {p0, p1}, LYue/ۥۡۨۡ۠;->ۥ۟۟ۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۤۢ۟;->ۥ۟۟۟ۧ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, LYue/ۥ۟ۤۢۡ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LYue/ۥ۟ۤۢۡ$ۥ;-><init>(LYue/ۥۡۨۡ۠;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)V

    const/4 p0, 0x1

    invoke-static {v1, v0, p0, v1}, LYue/ۥۣ۟ۤ۠;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final ۥ۟(LYue/ۥۡۨۡ۠;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p0    # LYue/ۥۡۨۡ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e1\u06e0<",
            "-TE;>;TE;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p0, p1}, LYue/ۥۡۨۡ۠;->ۥ۟۟ۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LYue/ۥ۟ۤۢ۟$ۥ۟۟;

    if-nez v1, :cond_0

    check-cast v0, LYue/ۥۣۢ۠ۤ;

    sget-object p0, LYue/ۥ۟ۤۢ۟;->ۥ۟:LYue/ۥ۟ۤۢ۟$ۥ۟;

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤۢ۟$ۥ۟;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LYue/ۥ۟ۤۢۡ$ۥ۟;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LYue/ۥ۟ۤۢۡ$ۥ۟;-><init>(LYue/ۥۡۨۡ۠;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)V

    const/4 p0, 0x1

    invoke-static {v1, v0, p0, v1}, LYue/ۥۣ۟ۤ۠;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LYue/ۥ۟ۤۢ۟;

    invoke-virtual {p0}, LYue/ۥ۟ۤۢ۟;->ۥ۟۟۠()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
